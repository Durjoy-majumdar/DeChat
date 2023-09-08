package zq2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Iterator;

/* renamed from: zq2.d */
public class C103066d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GLViewContainer f304111d;

    public C103066d(GLViewContainer gLViewContainer) {
        this.f304111d = gLViewContainer;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$4");
        GLViewContainer gLViewContainer = this.f304111d;
        int i = GLViewContainer.f274388r;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        boolean z = gLViewContainer.f274392g;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        if (!(!z || GLViewContainer.m120018b(this.f304111d) == 0 || GLViewContainer.m120019c(this.f304111d) == 0)) {
            Iterator it = GLViewContainer.m120017a(this.f304111d).iterator();
            while (it.hasNext()) {
                ((C103062a) it.next()).mo142770g(GLViewContainer.m120018b(this.f304111d), GLViewContainer.m120019c(this.f304111d));
            }
            GLViewContainer gLViewContainer2 = this.f304111d;
            gLViewContainer2.mo130532g(GLViewContainer.m120018b(gLViewContainer2), GLViewContainer.m120019c(this.f304111d));
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$4");
    }
}
