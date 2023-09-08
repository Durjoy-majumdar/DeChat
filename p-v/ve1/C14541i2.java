package ve1;

import android.app.Activity;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C7435f2;
import gy3.C8477a0;
import gy3.C8479f0;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: ve1.i2 */
public final class C14541i2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f40298d;

    /* renamed from: e */
    public final /* synthetic */ Activity f40299e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<JSONObject> f40300f;

    /* renamed from: g */
    public final /* synthetic */ C14576n2 f40301g;

    public C14541i2(C8477a0 a0Var, Activity activity, C8479f0<JSONObject> f0Var, C14576n2 n2Var) {
        this.f40298d = a0Var;
        this.f40299e = activity;
        this.f40300f = f0Var;
        this.f40301g = n2Var;
    }

    public void onChanged(Object obj) {
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        Class cls = C13442s8.class;
        boolean z = FinderHomeTabRedDotTipsBubbleView.f17794i;
        Log.m105924i("Finder.FeedFullMergedHeaderConvert", "[observeWithNotify] isShow=" + aVar.f12908a + " isFriendShow=" + this.f40298d.f27482d + " isClickBubble=" + z);
        boolean z2 = aVar.f12908a;
        if (z2 && !this.f40298d.f27482d) {
            C49712hj1 i3 = ((C13442s8) C39818r.f106831a.mo62443b(this.f40299e).mo75002a(cls)).mo12853i3(4);
            this.f40298d.f27482d = true;
            this.f40300f.f27484d = C14576n2.m13888j(this.f40301g, "TLRecommendTab");
            C7435f2.f25626a.mo8577a(i3, "friendtab_tl_reddot_withouthead", 0, (JSONObject) this.f40300f.f27484d);
        } else if (!z2 && this.f40298d.f27482d) {
            C49712hj1 i35 = ((C13442s8) C39818r.f106831a.mo62443b(this.f40299e).mo75002a(cls)).mo12853i3(1);
            this.f40298d.f27482d = false;
            if (!z) {
                C7435f2.f25626a.mo8577a(i35, "friendtab_tl_reddot_withouthead", 1, (JSONObject) this.f40300f.f27484d);
            }
            FinderHomeTabRedDotTipsBubbleView.f17793h = false;
        }
    }
}
