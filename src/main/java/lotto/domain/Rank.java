package lotto.domain;

/* 랭킹 enum
*  */
public enum Rank {
    FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000), // bonus
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000);

    private final int correct;
    private final int prize;

    Rank(final int correct, final int prize) {
        this.correct = correct;
        this.prize = prize;
    }
}
