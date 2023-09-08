package com.tencent.p014mm.network;

import a70.C112760b;
import android.os.RemoteException;
import com.tencent.mars.magicbox.IPxxLogic;
import com.tencent.mars.p468mm.MMLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.text.SimpleDateFormat;
import java.util.Date;
import p156gj.C87200o;
import qe3.C89625d;

/* renamed from: com.tencent.mm.network.t */
public class C114798t implements IPxxLogic.ICallBack {

    /* renamed from: a */
    public static long f344196a;

    /* renamed from: b */
    public static int f344197b;

    /* renamed from: a */
    public final void mo174453a(int i, int i2, long j, long j2) {
        try {
            C114773i iVar = C114781l0.m161554a().f344217w;
            if (iVar != null) {
                try {
                    iVar.c40(i, i2, j, j2);
                } catch (RemoteException e) {
                    Log.m105921e("MicroMsg.MMAutoAuth", "exception:%s", Util.stackTraceToString(e));
                }
            }
        } catch (Exception e2) {
            Log.m105921e("IPxxCallback", "exception:%s", Util.stackTraceToString(e2));
        }
    }

    public String getCrashFilePath(int i) {
        Date date = new Date(System.currentTimeMillis() - (((long) i) * 86400000));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String str = C112760b.m154219a() + "crash_" + simpleDateFormat.format(date) + ".txt";
        if (C86013q1.m106450k(str)) {
            return str;
        }
        return null;
    }

    public String getUploadLogExtrasInfo(String str) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Device:");
            stringBuffer.append(C89625d.f257837c);
            stringBuffer.append(" ");
            stringBuffer.append(C87200o.f252872e);
            stringBuffer.append("\n");
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public void recoverLinkAddrs() {
        MMLogic.recoverLinkAddrs();
    }

    public void setNewDnsDebugHostInfo(String str, int i) {
        MMLogic.setNewDnsDebugHost(str, i + "");
    }

    public void uploadLogFail(int i) {
        f344197b = 0;
        mo174453a(i, -1, 0, 0);
    }

    public void uploadLogResponse(int i, long j, long j2) {
        int i2 = 0;
        Log.m105925i("IPxxCallback", "ipxx progress totalSize:%d uploadSize:%d lastPercent:%d ", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(f344197b));
        long nowSecond = Util.nowSecond();
        if (nowSecond - 1 >= f344196a) {
            f344196a = nowSecond;
            if (j2 >= 0 && j > 0 && j2 < j) {
                i2 = (int) ((100 * j2) / j);
            }
            if (i2 > 100) {
                i2 = 100;
            }
            int i3 = f344197b;
            int i4 = i3 > i2 ? i3 : i2;
            f344197b = i4;
            mo174453a(i, i4, j, j2);
        }
    }

    public void uploadLogSuccess(int i) {
        f344197b = 0;
        mo174453a(i, 100, 0, 0);
    }
}
