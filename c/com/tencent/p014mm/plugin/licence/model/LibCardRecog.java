package com.tencent.p014mm.plugin.licence.model;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.licence.model.LibCardRecog */
public final class LibCardRecog {
    private byte _hellAccFlag_;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("IDCardRecog");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/licence/model/LibCardRecog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/plugin/licence/model/LibCardRecog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int recognizeBankCardGetVersion();

    public static native int recognizeBankCardInit(int i, int i2, boolean z);

    public static native int recognizeBankCardProcess(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, BankCardInfo bankCardInfo, boolean[] zArr);

    public static native int recognizeBankCardRelease();

    public static native String recognizeBankCardSegmentNumber(String str, int i, int[] iArr);

    public static native int recognizeCardInit(int i, int i2, int i3);

    public static native int recognizeCardProcess(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, CardInfo cardInfo, boolean[] zArr);

    public static native int recognizeCardRelease();
}
