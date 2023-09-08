package oq1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import l31.C61212e;
import mq1.C61557e;
import nj3.C76912y0;
import sq1.C64151e;
import tr1.C14063b;

/* renamed from: oq1.y */
public final class C62150y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62137n f176715d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f176716e;

    public C62150y(C62137n nVar, C60905o oVar) {
        this.f176715d = nVar;
        this.f176716e = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f176715d.f176682e.mo79237h()) {
            C76912y0.makeText(this.f176716e.f173499A, (int) C0966R.string.d3k, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        WeImageView weImageView = (WeImageView) view;
        C64151e eVar = (C64151e) this.f176716e.f173503E;
        C61557e eVar2 = C61557e.f174962f;
        C61557e eVar3 = C61557e.f174962f;
        boolean z = !eVar3.mo86493b(this.f176715d.f176682e.mo79245u().mo88217a(), eVar.f181868d, this.f176715d.f176682e.mo79235g());
        if (z) {
            weImageView.setImageResource(C0966R.raw.icon_filled_awesome);
            weImageView.setIconColor(this.f176716e.f173499A.getResources().getColor(C0966R.color.Red_90));
        } else {
            weImageView.setImageResource(C0966R.raw.icon_outlined_awesome);
            weImageView.setIconColor(this.f176716e.f173499A.getResources().getColor(C0966R.color.f3133gi));
        }
        this.f176715d.f176682e.mo79243r(weImageView, this.f176716e.mo17363j());
        int a = eVar3.mo86492a(this.f176715d.f176682e.mo79245u().mo88217a(), eVar.f181868d, this.f176715d.f176682e.mo79235g());
        if (a > 0) {
            this.f176716e.mo85817I(C0966R.C0970id.a2v, 0);
            this.f176716e.mo85815G(C0966R.C0970id.a2v, String.valueOf(a));
        } else {
            this.f176716e.mo85817I(C0966R.C0970id.a2v, 8);
            this.f176716e.mo85815G(C0966R.C0970id.a2v, "");
        }
        if (z) {
            ((TextView) this.f176716e.mo85812D(C0966R.C0970id.a2v)).setTextColor(this.f176716e.f173499A.getResources().getColor(C0966R.color.Red_100));
        } else {
            ((TextView) this.f176716e.mo85812D(C0966R.C0970id.a2v)).setTextColor(this.f176716e.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        }
        if (z) {
            C14063b.m13415c(C14063b.f39453a, weImageView, 0, 2, (Object) null);
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(this.f176716e.mo85812D(C0966R.C0970id.a2u), "finder_feed_second_comment_awesome_iv");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
