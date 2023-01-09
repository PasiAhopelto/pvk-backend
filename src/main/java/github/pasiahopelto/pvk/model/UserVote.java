package github.pasiahopelto.pvk.model;

public class UserVote {
    public enum Voted { YES, NO }

    private String name;
    private Voted voted;

    public Voted getVoted() {
        return voted;
    }

    public void setVoted(Voted voted) {
        this.voted = voted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((voted == null) ? 0 : voted.hashCode());
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
        UserVote other = (UserVote) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (voted != other.voted)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Vote [name=" + name + ", voted=" + voted + "]";
    }

}
