package com.tencent.p014mm.plugin.performance.watchdogs;

import android.os.CancellationSignal;
import be2.C79693c;
import com.tencent.matrix.resource.MemoryUtil;
import com.tencent.p014mm.plugin.performance.watchdogs.C85331g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116340x0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.FileSystem;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import p723vf.C118672d;
import p955df.C86266e;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.i */
public final class C85335i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f248670d;

    public C85335i(long j) {
        this.f248670d = j;
    }

    public final void run() {
        C86009m1 m1Var;
        FileSystem.C85995c b = ((C116340x0) C116281f0.C116289i.f348994a.mo177788a()).mo177847b("hprofs");
        if (b != null) {
            b.mo119928a(new CancellationSignal());
        }
        String format = ((SimpleDateFormat) ((C36570n) C85331g.f248659g).getValue()).format(Calendar.getInstance().getTime());
        try {
            m1Var = C86009m1.m106378c(C86266e.f250872e.mo120674b("MLP", false));
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.MemoryLimitPublisher", th, "", new Object[0]);
            m1Var = null;
        }
        if (m1Var == null) {
            m1Var = null;
        } else if (m1Var.mo119967g()) {
            Log.m105929w("MicroMsg.MemoryLimitPublisher", "HPROF file exists, delete and recreate: %s", m1Var.mo119971i());
            m1Var.mo119966f();
        }
        if (m1Var == null) {
            Log.m105920e("MicroMsg.MemoryLimitPublisher", "prepare hprof file failed, see log above");
            return;
        }
        Log.m105925i("MicroMsg.MemoryLimitPublisher", "start fork dump heap: %s", m1Var.mo119971i());
        try {
            String n = m1Var.mo119976n();
            C87412m.m108593f(n, "hprof.path");
            if (MemoryUtil.m98119e(n, 600)) {
                Log.m105924i("MicroMsg.MemoryLimitPublisher", "dump heap success");
                C85331g gVar = C85331g.f248653a;
                String i = m1Var.mo119971i();
                C87412m.m108593f(i, "hprof.absolutePath");
                C85331g.C85332a aVar = C85331g.C85332a.DUMP_SUCCESS;
                long j = this.f248670d;
                C87412m.m108593f(format, "timeStamp");
                C85331g.m105349c(gVar, i, aVar, j, format);
                if (!C85331g.f248654b) {
                    int hashCode = m1Var.hashCode();
                    long j2 = this.f248670d;
                    String i2 = m1Var.mo119971i();
                    C87412m.m108593f(i2, "hprof.absolutePath");
                    C85331g.m105348b(gVar, hashCode, j2, i2);
                } else {
                    Log.m105924i("MicroMsg.MemoryLimitPublisher", "copy to external cache");
                    C79693c.m96808b(new C86009m1(m1Var.mo119971i()));
                }
            } else {
                Log.m105920e("MicroMsg.MemoryLimitPublisher", "dump heap failed");
                C85331g gVar2 = C85331g.f248653a;
                C85331g.C85332a aVar2 = C85331g.C85332a.DUMP_FAILED;
                long j3 = this.f248670d;
                C87412m.m108593f(format, "timeStamp");
                C85331g.m105349c(gVar2, "[dump failed]", aVar2, j3, format);
            }
            C85331g.f248655c.set(false);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MemoryLimitPublisher", e, "dump heap failed with exception", new Object[0]);
            C85331g gVar3 = C85331g.f248653a;
            String stackTraceString = android.util.Log.getStackTraceString(e);
            C87412m.m108593f(stackTraceString, "getStackTraceString(exception)");
            String n2 = C112551y.m153814n(C112551y.m153815o(stackTraceString, 10, ';', false, 4, (Object) null), "\t", "", false);
            C85331g.C85332a aVar3 = C85331g.C85332a.EXCEPTION;
            long j4 = this.f248670d;
            C87412m.m108593f(format, "timeStamp");
            C85331g.m105349c(gVar3, n2, aVar3, j4, format);
            C85331g.f248655c.set(false);
        }
    }
}
