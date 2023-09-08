package com.tencent.p014mm.plugin.appbrand.media.encode;

import di3.C86312j;
import rw0.C101477j;

/* renamed from: com.tencent.mm.plugin.appbrand.media.encode.M4aAudioFormatJni */
public class M4aAudioFormatJni {
    static {
        ((C101477j) C86312j.m106911c(C101477j.class)).Mf0();
    }

    public static native void closeM4aFile();

    public static native int createM4aFile(String str, int i, int i2, int i3);

    public static native int writeAudioBuff(byte[] bArr, int i);
}
