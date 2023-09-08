package com.tencent.p014mm.plugin.normsg;

import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.normsg.g */
public class C115639g implements Comparator<ConnectivityCompat.WiFiScanResult> {
    public C115639g(C115634f fVar) {
    }

    public int compare(Object obj, Object obj2) {
        return ((ConnectivityCompat.WiFiScanResult) obj2).getLevel() - ((ConnectivityCompat.WiFiScanResult) obj).getLevel();
    }
}
