package bw0;

import android.view.View;
import aw0.C103925l;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105035c;
import com.tencent.p014mm.plugin.ball.service.C105040h;
import com.tencent.p014mm.plugin.ball.service.C105041i;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import p261wl.C38166b;
import xv0.C112183f;
import xv0.C112185h;

/* renamed from: bw0.k */
public class C104171k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FloatBallView f308405d;

    public C104171k(FloatBallView floatBallView) {
        this.f308405d = floatBallView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/view/FloatBallView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.FloatBallView", "onCustomViewDeleteButtonClick");
        if (this.f308405d.f311960c1 != null) {
            C105035c r0 = C105035c.m140879r0();
            BallInfo ballInfo = this.f308405d.f311960c1;
            r0.getClass();
            Class<C112183f> cls = C112183f.class;
            try {
                synchronized (r0.f311755e) {
                    Set<C112185h> set = r0.f311755e.get(ballInfo.f311686d);
                    if (C103925l.m138627a(set)) {
                        for (C112185h f5 : set) {
                            f5.mo74087f5(ballInfo);
                        }
                    }
                    C38166b.m41756c(cls, Integer.valueOf(ballInfo.f311686d), new C105040h(r0, ballInfo));
                    Set<C112185h> set2 = r0.f311755e.get(0);
                    if (C103925l.m138627a(set2)) {
                        for (C112185h f54 : set2) {
                            f54.mo74087f5(ballInfo);
                        }
                    }
                    C38166b.m41756c(cls, 0, new C105041i(r0, ballInfo));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FloatBallService", e, "notifyBallDeleteButtonClicked exception", new Object[0]);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatBallView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
