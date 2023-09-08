package yp2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import tp2.C101912b;
import tp2.C101913c;
import tp2.C101914d;
import zp2.C103052a;
import zp2.C103053b;

/* renamed from: yp2.b */
public class C102896b extends C101912b<C102895a> {

    /* renamed from: b */
    public int f303718b = 0;

    public C102896b(Context context) {
        super(context);
    }

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        this.f303718b = i;
        boolean b = super.mo126055b(view, i, snsInfo, dVar);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        return b;
    }

    /* renamed from: d */
    public C101913c mo126056d(SnsInfo snsInfo, C101914d dVar) {
        C101913c aVar;
        SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        C101913c cVar = null;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        } else {
            try {
                ADInfo adInfo = snsInfo.getAdInfo(this.f303718b);
                if (adInfo == null) {
                    SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                } else {
                    int i = adInfo.adActionType;
                    if (i == 10) {
                        aVar = new C103053b();
                        SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                    } else {
                        if (i == 11) {
                            aVar = new C103052a();
                            SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                        }
                        SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                    }
                    cVar = aVar;
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        return cVar;
    }
}
