package zq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Iterator;

/* renamed from: zq2.c */
public class C103065c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GLViewContainer f304110d;

    public C103065c(GLViewContainer gLViewContainer) {
        this.f304110d = gLViewContainer;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$2");
        Iterator it = GLViewContainer.m120017a(this.f304110d).iterator();
        while (it.hasNext()) {
            C103062a aVar = (C103062a) it.next();
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            aVar.f304088r = false;
            aVar.f304084n = 0;
            aVar.f304078h = null;
            SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        }
        GLViewContainer.m120017a(this.f304110d).clear();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$2");
    }
}
