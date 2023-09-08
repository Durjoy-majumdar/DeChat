package f51;

import aw0.C103922g;
import aw0.C103925l;
import bh3.C113177k;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader_app.model.C41009x;
import com.tencent.p014mm.plugin.downloader_app.model.C41016z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import e51.C45548j;
import java.util.LinkedList;
import p237sp.C36768q;
import p447aw.C103918d;
import z41.C53736a;

/* renamed from: f51.q */
public class C45753q implements C36768q.C36771c {
    /* renamed from: f */
    public void mo5418f(int i, long j) {
        C53736a d;
        C53736a c = C40933j.m44314c(j);
        if (c != null && c.field_fromDownloadApp) {
            LinkedList<C45548j> linkedList = C41009x.f110384t;
            C41009x xVar = C41009x.C41012c.f110393a;
            String str = c.field_appId;
            xVar.getClass();
            C113177k.C113179b bVar = C113177k.C113179b.OVERLAY;
            Class cls = C113177k.class;
            if (i == 1 || i == 7) {
                Log.m105924i("MicroMsg.GameDownloadFloatBallHelper", "onTaskStart");
                xVar.mo64038y0(false);
                xVar.f110387p = false;
                if (!xVar.f110385n.contains(str)) {
                    xVar.f110385n.add(str);
                }
                if (!xVar.f110386o.contains(str) && (d = C40933j.m44315d(str)) != null && (d.field_autoDownload || d.field_reserveInWifi)) {
                    xVar.f110386o.add(str);
                }
                Log.m105925i("MicroMsg.GameDownloadFloatBallHelper", "onTaskStart, isInDownloadMainUI:%s", Boolean.valueOf(xVar.f110389r));
                if (!xVar.mo90541w()) {
                    Log.m105924i("MicroMsg.GameDownloadFloatBallHelper", "addCurrentBall");
                    if (((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(MMApplicationContext.getContext(), xVar.f311726d.f311686d) || !xVar.f110386o.contains(str)) {
                        int i2 = xVar.f311726d.f311679D;
                        Boolean bool = C103925l.f307288a;
                        xVar.mo149078s0(i2 | 16);
                        if (!((C113177k) C86312j.m106911c(cls)).G00(bVar, C113177k.C113178a.GAME, new C41016z(xVar))) {
                            xVar.mo68419u();
                        }
                    }
                }
                xVar.mo90537e(xVar.f110389r);
                xVar.mo64039z0();
                xVar.mo64034A0();
                C40314g.m43484c(MMApplicationContext.getContext(), 34, 3402, 0, 1, 0, xVar.mo64035v0());
            } else if (i == 6) {
                if (!xVar.f110387p) {
                    if (!xVar.f110385n.contains(str)) {
                        xVar.f110385n.add(str);
                    }
                    xVar.mo90537e(xVar.f110389r);
                    Log.m105925i("MicroMsg.GameDownloadFloatBallHelper", "onProgressChanged, isInDownloadMainUI:%s", Boolean.valueOf(xVar.f110389r));
                    if (C103922g.m138623b() && !xVar.mo90541w()) {
                        int i3 = xVar.f311726d.f311679D;
                        Boolean bool2 = C103925l.f307288a;
                        xVar.mo149078s0(i3 | 16);
                        if (((C113177k) C86312j.m106911c(cls)).w00(bVar, C113177k.C113178a.GAME)) {
                            xVar.mo68419u();
                        }
                        xVar.mo64034A0();
                    }
                    xVar.mo64039z0();
                }
            } else if (i == 5) {
                xVar.mo64036w0(str, true);
            } else {
                xVar.mo64036w0(str, false);
            }
        }
    }
}
