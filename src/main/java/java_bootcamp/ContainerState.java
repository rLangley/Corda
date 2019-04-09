package java_bootcamp;

import com.google.common.collect.ImmutableList;
import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ContainerState implements ContractState {
    private int width;

    public int getHieght() {
        return hieght;
    }

    public int getDepth() {
        return depth;
    }

    public String getContents() {
        return contents;
    }

    public Party getOwner() {
        return owner;
    }

    public Party getCarrier() {
        return carrier;
    }

    private int hieght;
    private int depth;

    private String contents;
    private Party owner;
    private Party carrier;

    public ContainerState(int width, int hieght, int depth, String contents, Party owner, Party carrier) {
        this.width = width;
        this.hieght = hieght;
        this.depth = depth;
        this.contents = contents;
        this.owner = owner;
        this.carrier = carrier;
    }

    public static void main(String[] args){
        Party StuffOwners = null;
        Party StuffCarriers = null;
        ContainerState container = new ContainerState(2, 4, 2, "stuff", StuffOwners, StuffCarriers);

    }

    @NotNull
    @Override
    public List<AbstractParty> getParticipants() {
        return ImmutableList.of(owner, carrier);
    }




}
