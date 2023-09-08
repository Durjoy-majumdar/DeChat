package com.tencent.mapsdk.internal;

import java.io.Serializable;

/* renamed from: com.tencent.mapsdk.internal.p */
public abstract class C114029p implements Serializable {
    public static final byte BYTE = 0;
    public static final byte DOUBLE = 5;
    public static final byte FLOAT = 4;
    public static final byte INT = 2;
    public static final int JCE_MAX_STRING_LENGTH = 104857600;
    public static final byte LIST = 9;
    public static final byte LONG = 3;
    public static final byte MAP = 8;
    public static final byte SHORT = 1;
    public static final byte SIMPLE_LIST = 13;
    public static final byte STRING1 = 6;
    public static final byte STRING4 = 7;
    public static final byte STRUCT_BEGIN = 10;
    public static final byte STRUCT_END = 11;
    public static final byte ZERO_TAG = 12;

    /* renamed from: a */
    private Object f341096a;

    public static String toDisplaySimpleString(C114029p pVar) {
        if (pVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        pVar.displaySimple(sb, 0);
        return sb.toString();
    }

    public String className() {
        return "";
    }

    public boolean containField(String str) {
        return false;
    }

    public void display(StringBuilder sb, int i) {
    }

    public void displaySimple(StringBuilder sb, int i) {
    }

    public Object getFieldByName(String str) {
        return null;
    }

    public Object getTag() {
        return this.f341096a;
    }

    public C114029p newInit() {
        return null;
    }

    public abstract void readFrom(C113953m mVar);

    public void recyle() {
    }

    public void setFieldByName(String str, Object obj) {
    }

    public void setTag(Object obj) {
        this.f341096a = obj;
    }

    public byte[] toByteArray() {
        C113979n nVar = new C113979n();
        writeTo(nVar);
        return nVar.mo172523a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        display(sb, 0);
        return sb.toString();
    }

    public abstract void writeTo(C113979n nVar);

    public byte[] toByteArray(String str) {
        C113979n nVar = new C113979n();
        nVar.mo172509a(str);
        writeTo(nVar);
        return nVar.mo172523a();
    }
}
