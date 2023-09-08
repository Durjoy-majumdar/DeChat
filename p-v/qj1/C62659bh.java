package qj1;

import ak1.C54116w;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C49890is1;
import up1.C27696y;

/* renamed from: qj1.bh */
public final class C62659bh implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C63176zg f177934d;

    public C62659bh(C63176zg zgVar) {
        this.f177934d = zgVar;
    }

    public final void run() {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        LiveBottomSheetPanel liveBottomSheetPanel = this.f177934d.f179258s;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.mo78804d();
        }
        Log.m105924i(this.f177934d.f179256q, "show");
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.dy0((C54116w) c, 1, (String) null, 0, 6, (Object) null);
        C49890is1 is12 = ((C54991o) this.f177934d.mo87696x0(C54991o.class)).f154231N1;
        if (is12 != null) {
            C63176zg zgVar = this.f177934d;
            TextView textView = zgVar.f179259t;
            String str = "";
            if (textView != null) {
                String str2 = is12.f135636g;
                if (str2 == null) {
                    str2 = str;
                }
                textView.setText(str2);
            }
            ImageView imageView = zgVar.f179260u;
            if (imageView != null) {
                C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                String str3 = is12.f135637h;
                if (str3 != null) {
                    str = str3;
                }
                f2.mo85957c(new C11984n0(str, C27696y.RAW_IMAGE), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
            }
        }
    }
}
