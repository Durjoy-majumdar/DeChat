package com.tencent.p014mm.plugin.zero;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.autogen.mmdata.rpt.CmdProcFailedStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import jc3.C76400h;
import nr3.C35015b;
import sf0.C48374j0;
import te3.C50886px;

/* renamed from: com.tencent.mm.plugin.zero.r */
public class C72670r {

    /* renamed from: b */
    public static long f211430b;

    /* renamed from: c */
    public static int f211431c;

    /* renamed from: d */
    public static volatile C35015b<C76400h> f211432d;

    /* renamed from: a */
    public final C76400h f211433a;

    public C72670r() {
        if (f211432d != null) {
            this.f211433a = f211432d.get();
        } else {
            this.f211433a = null;
        }
    }

    /* renamed from: a */
    public void mo100127a(Object obj) {
        C76400h hVar = this.f211433a;
        if (hVar != null) {
            hVar.mo96084e(obj);
        }
    }

    /* renamed from: b */
    public void mo100128b(Object obj) {
        C76400h hVar = this.f211433a;
        if (hVar != null) {
            hVar.mo96082c(obj);
        }
    }

    /* renamed from: c */
    public boolean mo100129c(Object obj, int i, int i2, C50886px pxVar, boolean z) {
        C50886px pxVar2 = pxVar;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.SyncDoCmdDelegate", "account storage disabled, discard all commands");
            return false;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        byte[] d = C48374j0.m53715d(pxVar2.f140038e);
        Log.m105925i("MicroMsg.SyncDoCmdDelegate", "doCmd %d cmdid:%d buf:%d thr:[%d]", Long.valueOf(nowMilliSecond), Integer.valueOf(pxVar2.f140037d), Integer.valueOf(Util.getLength(d)), Long.valueOf(Thread.currentThread().getId()));
        if (Util.isNullOrNil(d)) {
            Log.m105920e("MicroMsg.SyncDoCmdDelegate", "docmd: no protobuf found.");
            return false;
        }
        f211431c = 0;
        f211430b = 0;
        try {
            C76400h hVar = this.f211433a;
            if (hVar != null) {
                hVar.mo96083d(obj, i, i2, pxVar, d, z);
            }
            Log.m105925i("MicroMsg.SyncDoCmdDelegate", "doCmd FIN %d cmdid:%d Time:%d", Long.valueOf(nowMilliSecond), Integer.valueOf(pxVar2.f140037d), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
            return true;
        } catch (Error | Exception e) {
            CmdProcFailedStruct cmdProcFailedStruct = new CmdProcFailedStruct();
            cmdProcFailedStruct.f194180e = f211430b;
            cmdProcFailedStruct.f194179d = (long) f211431c;
            cmdProcFailedStruct.f194182g = (long) pxVar2.f140037d;
            cmdProcFailedStruct.f194181f = cmdProcFailedStruct.mo86045b(AppMeasurement.CRASH_ORIGIN, android.util.Log.getStackTraceString(e).replace(',', ' '), true);
            cmdProcFailedStruct.mo86054n();
            Log.printErrStackTrace("MicroMsg.SyncDoCmdDelegate", e, "", new Object[0]);
            return false;
        }
    }
}
