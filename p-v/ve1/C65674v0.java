package ve1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import l31.C61212e;
import nj3.C76912y0;
import tc2.C118418g;
import tr1.C14063b;
import vq1.C65866w;

/* renamed from: ve1.v0 */
public final class C65674v0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65592g0 f188964d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f188965e;

    /* renamed from: f */
    public final /* synthetic */ boolean[] f188966f;

    public C65674v0(C65592g0 g0Var, C60905o oVar, boolean[] zArr) {
        this.f188964d = g0Var;
        this.f188965e = oVar;
        this.f188966f = zArr;
    }

    public final void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f188964d.f188747e.mo77333h()) {
            C76912y0.makeText(this.f188965e.f173499A, (int) C0966R.string.d3k, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        WeImageView weImageView = (WeImageView) this.f188965e.mo85812D(C0966R.C0970id.a2u);
        C55033u uVar = (C55033u) this.f188965e.f173503E;
        C65866w.C14968a aVar = C65866w.f189406g;
        C65866w wVar = C65866w.f189407h;
        boolean z = !wVar.mo89907f(this.f188964d.f188747e.mo77342u().field_id, uVar.f154492d, this.f188964d.f188747e.mo77331g());
        if (z) {
            weImageView.setImageResource(C0966R.raw.icon_filled_awesome);
            weImageView.setIconColor(this.f188965e.f173499A.getResources().getColor(C0966R.color.Red_90));
        } else {
            weImageView.setImageResource(C0966R.raw.icon_outlined_awesome);
            weImageView.setIconColor(this.f188965e.f173499A.getResources().getColor(C0966R.color.f3133gi));
        }
        CommentDrawerContract.NPresenter nPresenter = this.f188964d.f188747e;
        C87412m.m108593f(weImageView, "iv");
        nPresenter.mo77339r(weImageView, this.f188965e.mo17363j());
        int b = wVar.mo89904b(this.f188964d.f188747e.mo77342u().field_id, uVar.f154492d, this.f188964d.f188747e.mo77331g());
        if (b > 0) {
            this.f188965e.mo85817I(C0966R.C0970id.a2v, 0);
            this.f188965e.mo85815G(C0966R.C0970id.a2v, String.valueOf(b));
        } else {
            this.f188965e.mo85817I(C0966R.C0970id.a2v, 8);
            this.f188965e.mo85815G(C0966R.C0970id.a2v, "");
        }
        if (z) {
            ((TextView) this.f188965e.mo85812D(C0966R.C0970id.a2v)).setTextColor(this.f188965e.f173499A.getResources().getColor(C0966R.color.Red_100));
        } else {
            ((TextView) this.f188965e.mo85812D(C0966R.C0970id.a2v)).setTextColor(this.f188965e.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
        }
        if (z) {
            C14063b.m13415c(C14063b.f39453a, weImageView, 0, 2, (Object) null);
        }
        if (z) {
            boolean[] zArr = this.f188966f;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                C118418g gVar = C118418g.INSTANCE;
                gVar.w40("ce_feed_comment_like", "<FeedCommentLike>");
                gVar.mo175827n9("ce_feed_comment_like", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                gVar.ec0("ce_feed_comment_like");
            }
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(this.f188965e.mo85812D(C0966R.C0970id.a2u), "finder_feed_second_comment_awesome_iv");
        view2.setTag(C0966R.C0970id.d3w, Boolean.valueOf(z));
        view2.setTag(C0966R.C0970id.f358033d40, Integer.valueOf(b));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$refreshAwesomeIv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
