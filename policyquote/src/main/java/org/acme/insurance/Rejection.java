package org.acme.insurance;
//Author Denis
/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(bb05a75e0a43c6d6d3b41a7bd192e4a9)
 */
@org.kie.api.definition.type.Label(value = "Rejection")
public class Rejection  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Reason")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String reason;

    public Rejection() {
    }

    public Rejection(java.lang.String reason) {
        this.reason = reason;
    }


    
    public java.lang.String getReason() {
        return this.reason;
    }

    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

	@Override
	public String toString() {
		return "Rejection [reason=" + reason + "]";
	}
}