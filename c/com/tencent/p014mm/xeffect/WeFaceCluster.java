package com.tencent.p014mm.xeffect;

import android.util.Pair;
import java.util.ArrayList;
import qr3.C36070f;

/* renamed from: com.tencent.mm.xeffect.WeFaceCluster */
public class WeFaceCluster {
    static {
        C36070f.m40901a("xlabeffect");
    }

    public static native ArrayList<Pair<String, String>> nGetClusterCenterWithHistory(long j, long j2, ArrayList<FaceBufferData> arrayList, String str, boolean z);

    public static native long[] nInit(String[] strArr, int i);

    public static native int nIsClusterInit(long j);

    public static native void nRelease(long j, long j2);

    public static native void nReleaseCluster(long j);

    public static native String nStop();
}
