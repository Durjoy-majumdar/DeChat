package com.tencent.p014mm.plugin.p064hp.net;

import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.pointers.PInt;
import v20.C90741c;

/* renamed from: com.tencent.mm.plugin.hp.net.SimpleHttpLogic */
public class SimpleHttpLogic {

    /* renamed from: com.tencent.mm.plugin.hp.net.SimpleHttpLogic$Request */
    public static class Request {
        public byte[] body;
        public String cgi;
        public String host;
    }

    /* renamed from: com.tencent.mm.plugin.hp.net.SimpleHttpLogic$TaskCallback */
    public interface TaskCallback {
        void onCompleted(int i, int i2, byte[] bArr);
    }

    public static native boolean pack(byte[] bArr, PByteArray pByteArray, byte[] bArr2, int i, byte[] bArr3, String str, int i2, int i3, int i4, byte[] bArr4, byte[] bArr5, int i5, int i6, int i7);

    public static boolean packRequest(byte[] bArr, PByteArray pByteArray) {
        return pack(bArr, pByteArray, new byte[10], 0, new byte[10], "defaultid", 0, 3777, 1234567, new byte[10], new byte[10], 0, 6, 0);
    }

    public static native void startRequest(Request request, TaskCallback taskCallback, String str);

    public static native boolean unpack(PByteArray pByteArray, byte[] bArr, byte[] bArr2, PByteArray pByteArray2, PInt pInt, PInt pInt2, PInt pInt3, PInt pInt4);

    public static boolean unpackResponse(byte[] bArr, PByteArray pByteArray) {
        PInt pInt = new PInt(-100);
        boolean unpack = unpack(pByteArray, bArr, new byte[10], new PByteArray(), pInt, new PInt(0), new PInt(0), new PInt(255));
        C90741c.m113809b("simple", "unpack ret is " + pInt.value + " unpack result " + unpack, new Object[0]);
        return unpack;
    }
}
