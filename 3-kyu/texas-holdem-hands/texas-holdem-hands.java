            for (int r : ranks) if (r != firstRank) { kicker = r; break; }
            return new EvalHand("four-of-a-kind", new int[]{ firstRank, kicker });
        }
​
        // full house
        if (firstCount == 3 && secondCount >= 2) {
            // there can be 3+3 in 5 cards; high trips first, then other trips as pair
            int tripsRank = firstRank;
            int pairRank = secondRank;
            return new EvalHand("full house", new int[]{ tripsRank, pairRank });
        }
​
        // flush
        if (flush) {
            // ranks already sorted descending
            return new EvalHand("flush", ranks.clone());
        }
​
        // straight
       if (straight) {
    // straight: return all 5 ranks in descending order
    return new EvalHand("straight", ranks.clone());
}
​
        // three-of-a-kind
        if (firstCount == 3) {
            int tripsRank = firstRank;
            List<Integer> kickers = new ArrayList<>();
            for (int r : ranks) if (r != tripsRank) kickers.add(r);
            // should be 2 kickers
            return new EvalHand("three-of-a-kind", new int[]{ tripsRank, kickers.get(0), kickers.get(1) });
        }
​
        // two pair
        if (firstCount == 2 && secondCount == 2) {