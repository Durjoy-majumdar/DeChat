package com.tencent.p014mm.plugin.zero;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.support.Log;
import java.util.HashSet;
import java.util.Map;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.zero.b */
public class C85596b implements Log.LogCallback {

    /* renamed from: a */
    public final HashSet<String> f249509a = new HashSet<>();

    public C85596b(C30630c cVar) {
    }

    public void println(int i, String str, String str2) {
        boolean add;
        String str3 = str2;
        Log.LogImp impl = com.tencent.p014mm.sdk.platformtools.Log.getImpl();
        int myPid = Process.myPid();
        int myTid = Process.myTid();
        switch (i) {
            case 2:
                impl.logV(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                return;
            case 3:
                impl.logD(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                return;
            case 4:
                impl.logI(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                return;
            case 5:
                String str4 = str;
                impl.logW(0, str4, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                if (str4.equals("WCDB.SQLite") && str3.startsWith("[SQLite ErrCode: 284] automatic index on ")) {
                    String substring = str3.substring(41);
                    synchronized (this.f249509a) {
                        add = this.f249509a.add(substring);
                    }
                    if (!add) {
                        try {
                            C117407d.INSTANCE.mo160135k("DBAutoIndex", substring, (Map<String, Object>) null);
                            return;
                        } catch (Exception e) {
                            com.tencent.p014mm.sdk.platformtools.Log.m105920e("DBLogger", "Cannot report automatic index: " + e.getMessage());
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                impl.logE(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                return;
            case 7:
                impl.logF(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                return;
            default:
                return;
        }
    }
}
