package ve1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import cm1.C0714b2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import p272xq.C102712e;
import te3.C64726td1;
import vd1.C65584b;

/* renamed from: ve1.n7 */
public final class C14581n7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0714b2 f40397d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40398e;

    /* renamed from: f */
    public final /* synthetic */ WeImageView f40399f;

    /* renamed from: g */
    public final /* synthetic */ C64726td1 f40400g;

    public C14581n7(C0714b2 b2Var, C60905o oVar, WeImageView weImageView, C64726td1 td12) {
        this.f40397d = b2Var;
        this.f40398e = oVar;
        this.f40399f = weImageView;
        this.f40400g = td12;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileQQMusicConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0714b2 b2Var = this.f40397d;
        b2Var.f1715h = !b2Var.f1715h;
        C65584b bVar = C65584b.f188718a;
        Context context = this.f40398e.f173499A;
        C87412m.m108593f(context, "holder.context");
        WeImageView weImageView = this.f40399f;
        if (this.f40397d.f1715h) {
            if (weImageView != null) {
                weImageView.setImageResource(C0966R.raw.finder_icons_filled_star);
            }
            if (weImageView != null) {
                weImageView.setIconColor(context.getResources().getColor(C0966R.color.a7u));
            }
        } else {
            if (weImageView != null) {
                weImageView.setImageResource(C0966R.raw.finder_icons_outlined_star2);
            }
            if (weImageView != null) {
                weImageView.setIconColor(context.getResources().getColor(C0966R.color.FG_1));
            }
        }
        Context context2 = this.f40398e.f173499A;
        if (context2 instanceof Activity) {
            if (this.f40397d.f1715h) {
                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                bVar.mo89658a((Activity) context2, this.f40400g);
            } else {
                ((C102712e) C86312j.m106911c(C102712e.class)).hx0(this.f40397d.f1716i, (Runnable) null, 14);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileQQMusicConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
