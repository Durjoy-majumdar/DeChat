package com.tencent.p014mm.xeffect;

import android.util.Pair;
import java.nio.Buffer;
import java.util.ArrayList;
import qr3.C36070f;

/* renamed from: com.tencent.mm.xeffect.WeChatCls */
public class WeChatCls {
    static {
        C36070f.m40901a("xlabeffect");
    }

    public static native ArrayList<String> nApply(long j, Buffer buffer, int i, int i2);

    public static native ArrayList<Pair<String, ArrayList<Integer>>> nGetLabelidsByLabelname(long j, String str, String str2, boolean z);

    public static native String nGetLabelnameByLabelid(long j, int i, String str);

    public static native ArrayList<Pair<String, ArrayList<Integer>>> nGetSynonymWordsByLabelname(long j, String str, String str2, boolean z);

    public static native long nInit(String str, String str2, int i);

    public static native int nIsInit(long j);

    public static native void nRelease(long j);
}
