package github.pasiahopelto.pvk.model;

public class PartyVotes {
    private String party;
    private int yesCount;
    private int noCount;
    private int partyMemberCount;

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public int getYesCount() {
        return yesCount;
    }

    public void setYesCount(int yesVotes) {
        this.yesCount = yesVotes;
    }

    public int getNoCount() {
        return noCount;
    }

    public void setNoCount(int noVotes) {
        this.noCount = noVotes;
    }

    public int getPartyMemberCount() {
        return partyMemberCount;
    }

    public void setPartyMemberCount(int partyMemberCounts) {
        this.partyMemberCount = partyMemberCounts;
    }

    @Override
    public String toString() {
        return "PartyVotes [party=" + party + ", yesCount=" + yesCount + ", noCount=" + noCount + ", partyMemberCount=" + partyMemberCount + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((party == null) ? 0 : party.hashCode());
        result = prime * result + yesCount;
        result = prime * result + noCount;
        result = prime * result + partyMemberCount;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PartyVotes other = (PartyVotes) obj;
        if (party == null) {
            if (other.party != null)
                return false;
        } else if (!party.equals(other.party))
            return false;
        if (yesCount != other.yesCount)
            return false;
        if (noCount != other.noCount)
            return false;
        if (partyMemberCount != other.partyMemberCount)
            return false;
        return true;
    }
    
}
