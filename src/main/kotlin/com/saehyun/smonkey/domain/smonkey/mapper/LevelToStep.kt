package com.saehyun.smonkey.domain.smonkey.mapper

import com.saehyun.smonkey.domain.smonkey.exception.SmokingStepNotFoundException
import com.saehyun.smonkey.domain.smonkey.utils.NoSmokingSteps

internal fun Int.toStep(): Int {
    NoSmokingSteps.forEach { step ->
        if (this >= step.minLevel) return step.step
    }

    throw SmokingStepNotFoundException.EXCEPTION
}
