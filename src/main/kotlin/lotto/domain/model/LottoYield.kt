package lotto.domain.model

@JvmInline
value class LottoYield(val value: Double) {
    fun isLoss(): Boolean = value < PROFIT_THRESHOLD

    companion object {
        const val PROFIT_THRESHOLD = 1.0
    }
}