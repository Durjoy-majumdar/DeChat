package tp2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import tp2.C101913c;

/* renamed from: tp2.b */
public abstract class C101912b<T extends C101913c> implements C101913c {

    /* renamed from: a */
    public Context f300075a;

    public C101912b(Context context) {
        this.f300075a = context;
    }

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
        if (view == null || snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
            return false;
        }
        try {
            C101913c d = mo126056d(snsInfo, dVar);
            if (d != null) {
                boolean b = d.mo126055b(view, i, snsInfo, dVar);
                if (b) {
                    mo141402c(d, view, i, snsInfo, dVar);
                }
                SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
                return b;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
        return false;
    }

    /* renamed from: c */
    public void mo141402c(T t, View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
        SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
    }

    /* renamed from: d */
    public abstract T mo126056d(SnsInfo snsInfo, C101914d dVar);
}
