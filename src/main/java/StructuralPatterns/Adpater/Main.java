package StructuralPatterns.Adpater;

//Client
public class Main {
    public static void main(String[] args) {
        HdmiReader hdmiReader = new HdmiReader();
        TypeCReader typeCReader = new HdmiReaderToTypeCReaderAdapter(hdmiReader);
        typeCReader.readTypeC();
    }
}
