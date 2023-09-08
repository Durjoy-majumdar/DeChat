package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ks2.C99181f;
import ks2.C99195o;
import o40.C61926c;
import ob0.C117747y;
import ob0.C35142u;

/* renamed from: com.tencent.mm.plugin.sns.model.f */
public class C94868f implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEnd");
        C94853e Vx0 = C94866e1.Vx0();
        Vx0.getClass();
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Log.m105924i("MicroMsg.DownloadManager", "onSceneEnd: errType = " + i3 + " errCode = " + i4 + " errMsg = " + str + " type = " + yVar.getType() + " @" + Vx0.hashCode());
        if (yVar.getType() != 208) {
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        } else {
            C94865e0 e0Var = (C94865e0) yVar;
            Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]NetSceneSnsDownload download finish type:%d code:%d", "[image-flow]", e0Var.mo131015j1(), Integer.valueOf(i), Integer.valueOf(i2));
            String j1 = e0Var.mo131015j1();
            C99181f fVar = C99181f.f290857a;
            SnsMethodCalculate.markStartTimeMs("netSceneSnsDownloadFinish", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            C87412m.m108594g(j1, "mediaId");
            C61926c.m72661F("SnsImageLoadReporter", new C99195o(j1, i3, i4));
            SnsMethodCalculate.markEndTimeMs("netSceneSnsDownloadFinish", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            if (i3 == 0 && i4 == 0) {
                if (yVar.getType() == 208) {
                    Iterator it = ((CopyOnWriteArraySet) Vx0.f274823j).iterator();
                    while (it.hasNext()) {
                        C94853e.C94861h hVar = (C94853e.C94861h) it.next();
                        if (hVar != null) {
                            if (e0Var.mo131016k1() == 3) {
                                hVar.onSetbg();
                            } else if (e0Var.mo131016k1() == 1 || e0Var.mo131016k1() == 5 || e0Var.mo131016k1() == 7) {
                                hVar.onThumbFinish(e0Var.mo131015j1());
                            } else if (e0Var.mo131016k1() == 2 || e0Var.mo131016k1() == 8) {
                                hVar.onImageFinish(e0Var.mo131015j1(), true);
                            }
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            } else {
                if (e0Var.mo131016k1() == 2 || e0Var.mo131016k1() == 8) {
                    Iterator it4 = ((CopyOnWriteArraySet) Vx0.f274823j).iterator();
                    while (it4.hasNext()) {
                        C94853e.C94861h hVar2 = (C94853e.C94861h) it4.next();
                        if (hVar2 != null) {
                            hVar2.onImageFinish(e0Var.mo131015j1(), false);
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEnd");
    }
}
