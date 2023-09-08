package wq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import zt3.C119157j;

/* renamed from: wq2.i */
public class C111837i {

    /* renamed from: a */
    public static volatile C111837i f334872a;

    /* renamed from: a */
    public static C111837i m152499a() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        if (f334872a == null) {
            synchronized (C111837i.class) {
                try {
                    if (f334872a == null) {
                        f334872a = new C111837i();
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
                    throw th;
                }
            }
        }
        C111837i iVar = f334872a;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        return iVar;
    }

    /* renamed from: b */
    public void mo163553b(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("runOnUiThread", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        if (runnable != null) {
            ((C119157j) C119157j.f356862d).mo183895z(runnable);
        }
        SnsMethodCalculate.markEndTimeMs("runOnUiThread", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
    }
}
