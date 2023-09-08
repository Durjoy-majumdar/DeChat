package xz0;

import a70.C112760b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gc0.C20828a;
import hc0.C20937c;
import hz0.C76251l;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C22498fy;
import wz0.C53263p;

/* renamed from: xz0.g */
public class C23152g extends C23145a {

    /* renamed from: g */
    public TextView f66509g;

    /* renamed from: h */
    public RelativeLayout f66510h;

    /* renamed from: i */
    public TextView f66511i;

    /* renamed from: j */
    public View f66512j;

    /* renamed from: k */
    public ImageView f66513k;

    /* renamed from: l */
    public ImageView f66514l;

    /* renamed from: m */
    public ImageView f66515m;

    /* renamed from: n */
    public ImageView f66516n;

    /* renamed from: o */
    public ImageView f66517o;

    public C23152g(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo36522a(ShapeDrawable shapeDrawable) {
        if (!TextUtils.isEmpty(this.f66472a.mo23263J0().f63934A)) {
            this.f66516n.setBackgroundDrawable((Drawable) null);
            this.f66517o.setVisibility(0);
            mo36536j();
        } else if (this.f66474c != null) {
            this.f66516n.setBackgroundDrawable(shapeDrawable);
            this.f66517o.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo36523b(boolean z) {
        if (!TextUtils.isEmpty(this.f66472a.mo23263J0().f63934A)) {
            this.f66515m.setVisibility(8);
            this.f66514l.setVisibility(8);
            return;
        }
        this.f66515m.setVisibility(0);
        this.f66514l.setVisibility(0);
    }

    /* renamed from: c */
    public void mo36524c(int i) {
        if (!TextUtils.isEmpty(this.f66472a.mo23263J0().f63934A)) {
            this.f66516n.setBackgroundDrawable((Drawable) null);
            this.f66517o.setVisibility(0);
            mo36536j();
        } else if (this.f66474c != null) {
            this.f66516n.setBackgroundResource(i);
            this.f66517o.setVisibility(8);
        }
    }

    /* renamed from: d */
    public void mo36525d(boolean z) {
        if (TextUtils.isEmpty(this.f66472a.mo23263J0().f63950o) || !z || this.f66472a.mo23263J0().f63951p == 0 || this.f66472a.mo23264L0().f64119Q0) {
            this.f66513k.setVisibility(8);
            View view = this.f66512j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f66513k.setVisibility(0);
        View view3 = this.f66512j;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public void mo36526e(boolean z, boolean z2) {
    }

    /* renamed from: g */
    public void mo36528g() {
        this.f66509g = (TextView) this.f66474c.findViewById(C0966R.C0970id.axi);
        this.f66510h = (RelativeLayout) this.f66474c.findViewById(C0966R.C0970id.f357632aw3);
        LinearLayout linearLayout = (LinearLayout) this.f66474c.findViewById(C0966R.C0970id.atb);
        this.f66511i = (TextView) this.f66474c.findViewById(C0966R.C0970id.bfz);
        this.f66512j = this.f66474c.findViewById(C0966R.C0970id.at_);
        this.f66513k = (ImageView) this.f66474c.findViewById(C0966R.C0970id.ata);
        this.f66514l = (ImageView) this.f66474c.findViewById(C0966R.C0970id.grm);
        this.f66515m = (ImageView) this.f66474c.findViewById(C0966R.C0970id.grl);
        this.f66516n = (ImageView) this.f66474c.findViewById(C0966R.C0970id.f357629aw0);
        this.f66517o = (ImageView) this.f66474c.findViewById(C0966R.C0970id.f357631aw2);
    }

    /* renamed from: h */
    public void mo36529h() {
        TextView textView = this.f66476e;
        if (textView != null) {
            textView.setText(this.f66472a.mo23264L0().f64142j);
        }
        if (this.f66472a.mo23264L0().f64149s != null && this.f66472a.mo23264L0().f64149s.size() > 0) {
            C22498fy fyVar = this.f66472a.mo23264L0().f64149s.get(0);
            if (!TextUtils.isEmpty(fyVar.f63884d)) {
                this.f66509g.setText(fyVar.f63884d);
            } else {
                this.f66509g.setText("");
            }
        }
        if (this.f66472a.mo23296v1()) {
            mo36525d(true);
            this.f66516n.setAlpha(255);
            if (this.f66516n.getBackground() != null) {
                this.f66516n.getBackground().setAlpha(255);
            }
            String str = this.f66472a.mo23263J0().f63950o;
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("MicroMsg.CardWidgetMembership", "don't updateCodeLayout, code is empty!");
                mo36525d(false);
                ((CardDetailUI.C18565f) ((MMActivity) this.f66473b).component(CardDetailUI.C18565f.class)).mo23360c3(false);
            } else {
                this.f66512j.setOnClickListener(this.f66477f);
                this.f66513k.setOnClickListener(this.f66477f);
                this.f66511i.setOnClickListener(this.f66477f);
                ((CardDetailUI.C18565f) ((MMActivity) this.f66473b).component(CardDetailUI.C18565f.class)).mo23360c3(true);
                int i = this.f66472a.mo23263J0().f63951p;
                if (i != 0) {
                    if (i == 1 || i == 2) {
                        if (str.length() > 40) {
                            this.f66511i.setText("");
                        } else if (this.f66472a.mo23275W0()) {
                            this.f66511i.setText(C53263p.m59700a(4, str, true));
                        } else {
                            this.f66511i.setText("");
                        }
                    }
                } else if (str.length() <= 40) {
                    this.f66511i.setText(C53263p.m59700a(4, str, true));
                } else {
                    this.f66511i.setText("");
                }
            }
        } else {
            this.f66511i.setText("");
            this.f66513k.setVisibility(8);
            View view = this.f66512j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f66516n.setAlpha(90);
            if (this.f66516n.getBackground() != null) {
                this.f66516n.getBackground().setAlpha(90);
            }
        }
        ViewGroup.LayoutParams layoutParams = this.f66510h.getLayoutParams();
        int dimensionPixelSize = this.f66473b.getResources().getDimensionPixelSize(C0966R.dimen.f3898i9);
        int i2 = this.f66473b.getResources().getDisplayMetrics().widthPixels - (dimensionPixelSize * 2);
        int i3 = (i2 * 3) / 5;
        layoutParams.height = i3;
        Log.m105919d("MicroMsg.CardWidgetMembership", "padding:%d,originWidth:%d,targetWidth:%d", Integer.valueOf(dimensionPixelSize), Integer.valueOf(i2), Integer.valueOf(i3));
        this.f66510h.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    public final void mo36536j() {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59351g = C112760b.m154195C();
        bVar.f59350f = C76251l.m91644m(this.f66472a.mo23263J0().f63934A);
        bVar.f59346b = true;
        bVar.f59364t = true;
        bVar.f59365u = (float) this.f66473b.getResources().getDimensionPixelSize(C0966R.dimen.f4231wz);
        bVar.f59366v = true;
        bVar.f59345a = true;
        bVar.f59359o = C0966R.C0969drawable.f4722l2;
        bVar.f59355k = C76577a.m92157h(this.f66473b, C0966R.dimen.f4234x3);
        bVar.f59354j = C76577a.m92145A(this.f66473b);
        C20828a.m22825b().mo32519h(this.f66472a.mo23263J0().f63934A, this.f66516n, bVar.mo32666a());
        Log.m105924i("MicroMsg.CardWidgetMembership", "the member back ground url is " + this.f66472a.mo23263J0().f63934A);
    }
}
