package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.PropertyInfo */
public class PropertyInfo {
    public String name;
    public PropID propID;
    public Class<?> varType;

    public String toString() {
        return "name=" + this.name + "; propID=" + this.propID + "; varType=" + this.varType.getCanonicalName();
    }
}
