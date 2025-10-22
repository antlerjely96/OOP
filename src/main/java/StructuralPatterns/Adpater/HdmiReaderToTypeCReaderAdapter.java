package StructuralPatterns.Adpater;

//Adapter implement Target
public class HdmiReaderToTypeCReaderAdapter implements TypeCReader{
    //Đối tượng của Adaptee
    private HdmiReader hdmiReader;

    public HdmiReaderToTypeCReaderAdapter(HdmiReader hdmiReader){
        this.hdmiReader = hdmiReader;
    }


    @Override
    public void readTypeC() {
        System.out.println("Use Adapter to covert hdmi to type C");
        hdmiReader.readFromHdmi();
    }
}
