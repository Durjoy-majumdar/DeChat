package oq1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import mq1.C61557e;
import nj3.C76912y0;
import sq1.C64151e;
import tr1.C14063b;

/* renamed from: oq1.m */
public final class C62136m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62131l f176680d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f176681e;

    public C62136m(C62131l lVar, C60905o oVar) {
        this.f176680d = lVar;
        this.f176681e = oVar;
    }

    public final void onClick(View view) {
        Drawable drawable;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f176680d.f176670e.mo79237h()) {
            C76912y0.makeText(this.f176681e.f173499A, (int) C0966R.string.d3k, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        C64151e eVar = (C64151e) this.f176681e.f173503E;
        C61557e eVar2 = C61557e.f174962f;
        C61557e eVar3 = C61557e.f174962f;
        boolean z = !eVar3.mo86493b(this.f176680d.f176670e.mo79245u().mo88217a(), eVar.f181868d, this.f176680d.f176670e.mo79235g());
        if (z) {
            Context context = this.f176681e.f173499A;
            drawable = C74933u4.m89768e(context, C0966R.raw.icon_filled_awesome, context.getResources().getColor(C0966R.color.Red_90));
        } else {
            Context context2 = this.f176681e.f173499A;
            drawable = C74933u4.m89768e(context2, C0966R.raw.icon_outlined_awesome, context2.getResources().getColor(C0966R.color.f3133gi));
        }
        imageView.setImageDrawable(drawable);
        this.f176680d.f176670e.mo79243r(imageView, this.f176681e.mo17363j());
        int a = eVar3.mo86492a(this.f176680d.f176670e.mo79245u().mo88217a(), eVar.f181868d, this.f176680d.f176670e.mo79235g());
        if (a > 0) {
            this.f176681e.mo85817I(C0966R.C0970id.a2v, 0);
            this.f176681e.mo85815G(C0966R.C0970id.a2v, String.valueOf(a));
        } else {
            this.f176681e.mo85817I(C0966R.C0970id.a2v, 8);
            this.f176681e.mo85815G(C0966R.C0970id.a2v, "");
        }
        if (z) {
            ((TextView) this.f176681e.mo85812D(C0966R.C0970id.a2v)).setTextColor(this.f176681e.f173499A.getResources().getColor(C0966R.color.Red_90));
        } else {
            ((TextView) this.f176681e.mo85812D(C0966R.C0970id.a2v)).setTextColor(this.f176681e.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        }
        if (z) {
            C14063b.m13415c(C14063b.f39453a, imageView, 0, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$refreshAwesomeIv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
