package bw0;

import android.view.View;
import aw0.C103925l;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105035c;
import com.tencent.p014mm.plugin.ball.service.C105038f;
import com.tencent.p014mm.plugin.ball.service.C105039g;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import p261wl.C38166b;
import xv0.C112183f;
import xv0.C112185h;

/* renamed from: bw0.j */
public class C104170j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FloatBallView f308404d;

    public C104170j(FloatBallView floatBallView) {
        this.f308404d = floatBallView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/view/FloatBallView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.FloatBallView", "onCustomViewPlayButtonClick");
        BallInfo ballInfo = this.f308404d.f311960c1;
        if (ballInfo != null) {
            BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f311693n;
            ballButtonInfo.f311706d = !ballButtonInfo.f311706d;
            C105035c.m140879r0().mo149109a(this.f308404d.f311960c1);
            C105035c r0 = C105035c.m140879r0();
            BallInfo ballInfo2 = this.f308404d.f311960c1;
            r0.getClass();
            Class<C112183f> cls = C112183f.class;
            try {
                synchronized (r0.f311755e) {
                    Set<C112185h> set = r0.f311755e.get(ballInfo2.f311686d);
                    if (C103925l.m138627a(set)) {
                        for (C112185h D2 : set) {
                            D2.mo74085D2(ballInfo2);
                        }
                    }
                    C38166b.m41756c(cls, Integer.valueOf(ballInfo2.f311686d), new C105038f(r0, ballInfo2));
                    Set<C112185h> set2 = r0.f311755e.get(0);
                    if (C103925l.m138627a(set2)) {
                        for (C112185h D22 : set2) {
                            D22.mo74085D2(ballInfo2);
                        }
                    }
                    C38166b.m41756c(cls, 0, new C105039g(r0, ballInfo2));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FloatBallService", e, "notifyBallPlayButtonClicked exception", new Object[0]);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatBallView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
