package kf1;

import android.view.View;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import dp1.C7435f2;
import gr1.C59670o2;
import he1.C8514s;
import ht1.C60171g1;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rs1.C13539y3;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: kf1.r5 */
public final class C9953r5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f30598d;

    /* renamed from: e */
    public final /* synthetic */ C9868n5 f30599e;

    public C9953r5(C60905o oVar, C9868n5 n5Var) {
        this.f30598d = oVar;
        this.f30599e = n5Var;
    }

    public final void onClick(View view) {
        C59670o2 videoView;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateNewStyleEndLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f30598d.mo85812D(C0966R.C0970id.d7a);
        C49712hj1 hj12 = null;
        if (!(finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null)) {
            C60905o oVar = this.f30598d;
            videoView.setVideoViewFocused(true);
            C60171g1.C8767a.m8577a(videoView, (Integer) null, 1, (Object) null);
            MegaVideoBulletView megaVideoBulletView = (MegaVideoBulletView) oVar.mo85812D(C0966R.C0970id.mq8);
            megaVideoBulletView.getClass();
            C61926c.m72668M(new C8514s(megaVideoBulletView));
            if (videoView instanceof FinderThumbPlayerProxy) {
                FinderThumbPlayerProxy finderThumbPlayerProxy = (FinderThumbPlayerProxy) videoView;
                finderThumbPlayerProxy.setPlaySpeed(finderThumbPlayerProxy.getPlaySpeedRatio());
            }
        }
        View a = this.f30599e.mo10407a();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = a;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateNewStyleEndLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateNewStyleEndLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View entHintLayout = ((C13539y3) C39818r.f106831a.mo62444c(this.f30599e.f30449a).mo75002a(C13539y3.class)).mo12947e3().getEntHintLayout();
        if (entHintLayout != null) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = entHintLayout;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateNewStyleEndLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            entHintLayout.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateNewStyleEndLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30599e.f30449a);
        if (f != null) {
            hj12 = f.mo12861q3();
        }
        JSONObject jSONObject = new JSONObject();
        C9868n5 n5Var = this.f30599e;
        C60905o oVar2 = this.f30598d;
        jSONObject.put("first_feedid", C61926c.m72691p(n5Var.f30450b.f14124t));
        jSONObject.put("feedid", C61926c.m72691p(((C0740i2) oVar2.f173503E).getItemId()));
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8577a(hj12, "feed_replay", 1, jSONObject);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateNewStyleEndLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
