package yp2;

import android.view.View;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import jp2.C98963o;
import tp2.C101913c;
import tp2.C101914d;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: yp2.a */
public abstract class C102895a implements C101913c {
    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
        ADXml adXml = snsInfo.getAdXml();
        if (adXml == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
        try {
            boolean c = mo142614c(view, i, snsInfo, adXml, dVar);
            if (c) {
                mo142616e(i, snsInfo, dVar);
            }
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return c;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
    }

    /* renamed from: c */
    public abstract boolean mo142614c(View view, int i, SnsInfo snsInfo, ADXml aDXml, C101914d dVar);

    /* renamed from: d */
    public abstract int mo142615d();

    /* renamed from: e */
    public void mo142616e(int i, SnsInfo snsInfo, C101914d dVar) {
        SnsInfo snsInfo2 = snsInfo;
        C101914d dVar2 = dVar;
        SnsMethodCalculate.markStartTimeMs("reportSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        SnsMethodCalculate.markStartTimeMs("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        SnsAdClick snsAdClick = null;
        if (dVar2 == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        } else {
            C98963o oVar = (C98963o) dVar2.mo141403a("snsAdStatistic", null);
            if (oVar == null) {
                SnsMethodCalculate.markEndTimeMs("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            } else {
                if (dVar2.containsKey("flipStatus")) {
                    snsAdClick = new SnsAdClick(i, i == 0 ? 1 : 2, snsInfo2.field_snsId, 22, mo142615d(), ((Integer) dVar2.mo141403a("flipStatus", 0)).intValue());
                } else {
                    snsAdClick = new SnsAdClick(i, i == 0 ? 1 : 2, snsInfo2.field_snsId, 22, mo142615d());
                }
                C102260r.m134864d(snsAdClick, oVar, snsInfo2, 22);
                SnsMethodCalculate.markEndTimeMs("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            }
        }
        if (snsAdClick != null) {
            C102236a0.m134773u0(snsAdClick);
        }
        SnsMethodCalculate.markEndTimeMs("reportSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
    }
}
