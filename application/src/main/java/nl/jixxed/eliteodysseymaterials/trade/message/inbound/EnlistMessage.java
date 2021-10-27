package nl.jixxed.eliteodysseymaterials.trade.message.inbound;

import lombok.Data;
import lombok.NoArgsConstructor;
import nl.jixxed.eliteodysseymaterials.trade.message.common.Offer;

import java.util.List;

@Data
@NoArgsConstructor
public class EnlistMessage extends InboundMessage {
    private Trace trace;
    private String tokenHash;
    private List<Offer> offers;
}
