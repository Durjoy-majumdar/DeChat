package xz0;

import a70.C112760b;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.card.p031ui.C68780e;
import com.tencent.p014mm.plugin.card.p031ui.C68781f;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gc0.C20828a;
import hc0.C20937c;
import hz0.C76251l;
import j20.C117292a;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C22498fy;
import te3.ho4;
import wz0.C22945n;
import wz0.C53263p;

/* renamed from: xz0.d */
public class C23148d extends C23145a {

    /* renamed from: g */
    public TextView f66482g;

    /* renamed from: h */
    public TextView f66483h;

    /* renamed from: i */
    public TextView f66484i;

    /* renamed from: j */
    public Button f66485j;

    /* renamed from: k */
    public LinearLayout f66486k;

    /* renamed from: l */
    public TextView f66487l;

    /* renamed from: m */
    public WeImageView f66488m;

    /* renamed from: n */
    public ImageView f66489n;

    /* renamed from: o */
    public ImageView f66490o;

    /* renamed from: p */
    public ImageView f66491p;

    /* renamed from: q */
    public ViewGroup f66492q;

    /* renamed from: r */
    public ImageView f66493r;

    /* renamed from: s */
    public TextView f66494s;

    /* renamed from: t */
    public ImageView f66495t;

    /* renamed from: u */
    public View f66496u;

    /* renamed from: xz0.d$a */
    public class C23149a implements Runnable {
        public C23149a() {
        }

        public void run() {
            int A = (C76577a.m92145A(C23148d.this.f66473b) - C76577a.m92157h(C23148d.this.f66473b, C0966R.dimen.f3736cp)) - C76577a.m92157h(C23148d.this.f66473b, C0966R.dimen.f3749d0);
            if (C23148d.this.f66475d.isShown()) {
                A -= C76577a.m92151b(C23148d.this.f66473b, 48);
            }
            if (C23148d.this.f66492q.isShown()) {
                A -= C23148d.this.f66492q.getWidth();
            }
            if (C23148d.this.f66489n.isShown()) {
                A -= C76577a.m92151b(C23148d.this.f66473b, 20);
            }
            if (A > 0) {
                C23148d.this.f66476e.setMaxWidth(A);
            }
        }
    }

    public C23148d(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo36523b(boolean z) {
    }

    /* renamed from: c */
    public void mo36524c(int i) {
    }

    /* renamed from: e */
    public void mo36526e(boolean z, boolean z2) {
        if (this.f66485j != null) {
            C22498fy fyVar = this.f66472a.mo23263J0().f63960y;
            if (fyVar != null && !TextUtils.isEmpty(fyVar.f63884d) && fyVar.f63888h != 0 && this.f66472a.mo23296v1()) {
                this.f66485j.setClickable(false);
                this.f66485j.setVisibility(0);
                this.f66488m.setVisibility(8);
            } else if (this.f66472a.mo23263J0().f63959x != null && !TextUtils.isEmpty(this.f66472a.mo23263J0().f63959x.f63884d) && !TextUtils.isEmpty(this.f66472a.mo23263J0().f63959x.f63887g) && this.f66472a.mo23296v1()) {
                this.f66485j.setVisibility(0);
                this.f66485j.setEnabled(true);
                if (TextUtils.isEmpty(this.f66472a.mo23263J0().f63950o) || this.f66472a.mo23263J0().f63951p == 0) {
                    this.f66488m.setVisibility(8);
                } else {
                    this.f66488m.setVisibility(0);
                }
            } else if (z && !TextUtils.isEmpty(this.f66472a.mo23263J0().f63950o) && this.f66472a.mo23296v1()) {
                this.f66485j.setVisibility(0);
                this.f66485j.setEnabled(z2);
                this.f66488m.setVisibility(8);
            } else if (!z || this.f66472a.mo23296v1()) {
                this.f66485j.setVisibility(8);
                this.f66488m.setVisibility(8);
            } else {
                this.f66485j.setVisibility(0);
                this.f66485j.setEnabled(false);
                this.f66488m.setVisibility(8);
            }
        }
    }

    /* renamed from: g */
    public void mo36528g() {
        this.f66482g = (TextView) this.f66474c.findViewById(C0966R.C0970id.axi);
        this.f66483h = (TextView) this.f66474c.findViewById(C0966R.C0970id.axb);
        this.f66484i = (TextView) this.f66474c.findViewById(C0966R.C0970id.as8);
        this.f66485j = (Button) this.f66474c.findViewById(C0966R.C0970id.ati);
        this.f66486k = (LinearLayout) this.f66474c.findViewById(C0966R.C0970id.lpz);
        this.f66496u = this.f66474c.findViewById(C0966R.C0970id.buh);
        this.f66488m = (WeImageView) this.f66474c.findViewById(C0966R.C0970id.ata);
        this.f66487l = (TextView) this.f66474c.findViewById(C0966R.C0970id.awa);
        this.f66489n = (ImageView) this.f66474c.findViewById(C0966R.C0970id.f5947t2);
        this.f66492q = (ViewGroup) this.f66474c.findViewById(C0966R.C0970id.bui);
        this.f66493r = (ImageView) this.f66474c.findViewById(C0966R.C0970id.itp);
        this.f66494s = (TextView) this.f66474c.findViewById(C0966R.C0970id.itq);
        this.f66495t = (ImageView) this.f66474c.findViewById(C0966R.C0970id.ito);
        this.f66490o = (ImageView) this.f66474c.findViewById(C0966R.C0970id.buf);
        this.f66491p = (ImageView) this.f66474c.findViewById(C0966R.C0970id.bug);
        C85875k4.m106191k0(this.f66476e.getPaint());
        C85875k4.m106191k0(this.f66482g.getPaint());
    }

    /* renamed from: h */
    public void mo36529h() {
        if (this.f66472a.mo23264L0().f64149s != null && this.f66472a.mo23264L0().f64149s.size() > 0) {
            C22498fy fyVar = this.f66472a.mo23264L0().f64149s.get(0);
            if (!Util.isNullOrNil(fyVar.f63884d)) {
                this.f66482g.setText(fyVar.f63884d);
            }
            if (!Util.isNullOrNil(fyVar.f63885e)) {
                this.f66483h.setText(fyVar.f63885e);
                this.f66483h.setVisibility(0);
            } else {
                this.f66483h.setVisibility(8);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f66483h.getLayoutParams();
            if (!Util.isNullOrNil(fyVar.f63886f)) {
                this.f66484i.setText(fyVar.f63886f);
                this.f66484i.setVisibility(0);
                layoutParams.bottomMargin = 0;
            } else {
                this.f66484i.setVisibility(8);
                layoutParams.bottomMargin = this.f66473b.getResources().getDimensionPixelSize(C0966R.dimen.f3898i9);
            }
            this.f66483h.setLayoutParams(layoutParams);
            this.f66483h.invalidate();
        }
        if (!Util.isNullOrNil(this.f66472a.mo23264L0().f64129V0)) {
            C22945n.m26996I(this.f66489n, this.f66472a.mo23264L0().f64129V0);
            this.f66489n.setVisibility(0);
        } else {
            this.f66489n.setVisibility(8);
        }
        if (this.f66472a.mo23263J0() != null) {
            if (this.f66472a.mo23263J0().f63940G != null) {
                C22498fy fyVar2 = this.f66472a.mo23263J0().f63940G;
                this.f66492q.setVisibility(0);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f66492q.setForeground(this.f66473b.getResources().getDrawable(C0966R.C0969drawable.am8));
                }
                C22945n.m26996I(this.f66493r, fyVar2.f63895r);
                this.f66494s.setText(fyVar2.f63884d);
                C22945n.m26996I(this.f66495t, fyVar2.f63896s);
                this.f66492q.setOnClickListener(new C23146b(this, fyVar2));
            } else {
                this.f66492q.setVisibility(8);
            }
            if (this.f66472a.mo23263J0().f63941H != null) {
                C22498fy fyVar3 = this.f66472a.mo23263J0().f63941H;
                this.f66490o.setVisibility(0);
                View view = this.f66496u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo36534j(fyVar3.f63898u, this.f66490o, C76577a.m92151b(this.f66473b, 1));
                if (!Util.isNullOrNil(fyVar3.f63899v)) {
                    mo36534j(fyVar3.f63899v, this.f66491p, 0);
                    this.f66491p.setVisibility(0);
                } else {
                    this.f66491p.setVisibility(8);
                }
                this.f66490o.setOnClickListener(new C23147c(this, fyVar3));
            } else {
                this.f66490o.setVisibility(8);
                this.f66491p.setVisibility(8);
                View view2 = this.f66496u;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            CardDetailUI.C18565f fVar = (CardDetailUI.C18565f) ((MMActivity) this.f66473b).component(CardDetailUI.C18565f.class);
            ImageView imageView = (ImageView) fVar.findViewById(C0966R.C0970id.bug);
            if (imageView == null || !imageView.isShown()) {
                fVar.view(C0966R.C0971layout.f6703m9, C0966R.C0970id.buf).desc((C32226l<? super View, String>) new C68781f(fVar)).type(ViewType.Button);
            } else {
                fVar.view(C0966R.C0971layout.f6703m9, C0966R.C0970id.buf).desc((C32226l<? super View, String>) new C68780e(fVar)).type(ViewType.Button);
            }
        }
        if (this.f66485j == null || this.f66488m == null) {
            Log.m105920e("MicroMsg.CardWidgetCommon", "consumeBtn == null || mCardCodeImg == null");
        } else if (this.f66472a.mo23263J0() == null) {
            Log.m105920e("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo() == null");
            this.f66485j.setVisibility(8);
            this.f66488m.setVisibility(8);
        } else {
            if (this.f66472a.mo23263J0().f63959x != null) {
                Log.m105924i("MicroMsg.CardWidgetCommon", "operate_field.title is " + this.f66472a.mo23263J0().f63959x.f63884d);
                Log.m105918d("MicroMsg.CardWidgetCommon", "operate_field.url is " + this.f66472a.mo23263J0().f63959x.f63887g);
                Log.m105924i("MicroMsg.CardWidgetCommon", "operate_field.aux_title is " + this.f66472a.mo23263J0().f63959x.f63886f);
            }
            C22498fy fyVar4 = this.f66472a.mo23263J0().f63960y;
            if (fyVar4 != null) {
                Log.m105924i("MicroMsg.CardWidgetCommon", "limit_field.title is " + fyVar4.f63884d);
                Log.m105924i("MicroMsg.CardWidgetCommon", "limit_field.show_flag is " + fyVar4.f63888h);
                Log.m105924i("MicroMsg.CardWidgetCommon", "limit_field.aux_title is " + fyVar4.f63886f);
            }
            ho4 ho4 = this.f66472a.mo23264L0().f64116N;
            LinearLayout linearLayout = (LinearLayout) this.f66486k.findViewById(C0966R.C0970id.atw);
            if (ho4 == null || Util.isNullOrNil((List) ho4.f134799g)) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                linearLayout.removeAllViews();
                Iterator<C22498fy> it = ho4.f134799g.iterator();
                while (it.hasNext()) {
                    C22498fy next = it.next();
                    View inflate = LayoutInflater.from(this.f66473b).inflate(C0966R.C0971layout.f6705ma, linearLayout, false);
                    ((TextView) inflate.findViewById(C0966R.C0970id.atz)).setText(next.f63884d);
                    ((TextView) inflate.findViewById(C0966R.C0970id.atv)).setText(next.f63885e);
                    linearLayout.addView(inflate);
                }
            }
            if (fyVar4 != null && !TextUtils.isEmpty(fyVar4.f63884d) && fyVar4.f63888h != 0 && this.f66472a.mo23296v1()) {
                this.f66485j.setClickable(false);
                this.f66485j.setVisibility(0);
                this.f66485j.setTextColor(this.f66473b.getResources().getColor(C0966R.color.f2975b6));
                this.f66485j.setText(fyVar4.f63884d);
                if (!TextUtils.isEmpty(fyVar4.f63885e)) {
                    this.f66487l.setText(fyVar4.f63885e);
                    this.f66487l.setVisibility(0);
                } else {
                    this.f66487l.setVisibility(8);
                }
                this.f66488m.setVisibility(8);
                long j = fyVar4.f63888h;
                if ((2 & j) > 0) {
                    this.f66485j.setBackgroundDrawable(C22945n.m27013m(this.f66473b, C22945n.m27005e(this.f66472a.mo23264L0().f64145p, 150)));
                } else if ((j & 4) > 0) {
                    Button button = this.f66485j;
                    Context context = this.f66473b;
                    button.setBackgroundDrawable(C22945n.m27013m(context, context.getResources().getColor(C0966R.color.a17)));
                    this.f66485j.setTextColor(this.f66473b.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
                } else {
                    this.f66485j.setBackgroundDrawable(C22945n.m27013m(this.f66473b, C22945n.m27004d(this.f66472a.mo23264L0().f64145p)));
                }
            } else if (this.f66472a.mo23263J0().f63959x != null && !TextUtils.isEmpty(this.f66472a.mo23263J0().f63959x.f63884d) && !TextUtils.isEmpty(this.f66472a.mo23263J0().f63959x.f63887g) && this.f66472a.mo23296v1()) {
                this.f66485j.setClickable(true);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f66485j.setForeground(this.f66473b.getResources().getDrawable(C0966R.C0969drawable.f4689k3));
                }
                this.f66485j.setVisibility(0);
                this.f66485j.setBackgroundDrawable(C22945n.m27013m(this.f66473b, C22945n.m27004d(this.f66472a.mo23264L0().f64145p)));
                this.f66485j.setTextColor(this.f66473b.getResources().getColorStateList(C0966R.color.f2975b6));
                this.f66485j.setText(this.f66472a.mo23263J0().f63959x.f63884d);
                if (this.f66472a.mo23263J0().f63959x == null || TextUtils.isEmpty(this.f66472a.mo23263J0().f63959x.f63886f)) {
                    this.f66487l.setVisibility(8);
                } else {
                    this.f66487l.setText(this.f66472a.mo23263J0().f63959x.f63886f);
                    this.f66487l.setVisibility(0);
                }
                if (!TextUtils.isEmpty(this.f66472a.mo23263J0().f63950o)) {
                    this.f66488m.setVisibility(0);
                } else {
                    this.f66488m.setVisibility(8);
                }
            } else if (!TextUtils.isEmpty(this.f66472a.mo23263J0().f63950o) && this.f66472a.mo23296v1()) {
                Log.m105924i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().code is valid");
                this.f66488m.setVisibility(8);
                this.f66487l.setVisibility(8);
                this.f66485j.setClickable(true);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f66485j.setForeground(this.f66473b.getResources().getDrawable(C0966R.C0969drawable.f4689k3));
                }
                this.f66485j.setVisibility(0);
                this.f66485j.setBackgroundDrawable(C22945n.m27013m(this.f66473b, C22945n.m27004d(this.f66472a.mo23264L0().f64145p)));
                this.f66485j.setTextColor(this.f66473b.getResources().getColorStateList(C0966R.color.f2975b6));
                this.f66485j.setText(C0966R.string.b1r);
            } else if (!this.f66472a.mo23296v1()) {
                Log.m105924i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().status is " + this.f66472a.mo23263J0().f63942d);
                this.f66488m.setVisibility(8);
                this.f66487l.setVisibility(8);
                this.f66485j.setClickable(true);
                this.f66485j.setVisibility(0);
                this.f66485j.setTextColor(this.f66473b.getResources().getColor(C0966R.color.f3541x6));
                Button button2 = this.f66485j;
                Context context2 = this.f66473b;
                button2.setBackgroundDrawable(C22945n.m27013m(context2, context2.getResources().getColor(C0966R.color.f3196im)));
                if (!TextUtils.isEmpty(this.f66472a.mo23264L0().f64124T)) {
                    this.f66485j.setText(this.f66472a.mo23264L0().f64124T);
                } else {
                    C53263p.m59704e(this.f66485j, this.f66472a.mo23263J0().f63942d);
                }
            } else {
                Log.m105924i("MicroMsg.CardWidgetCommon", "operate_field and code is empty!");
                this.f66485j.setVisibility(8);
                this.f66487l.setVisibility(8);
                this.f66488m.setVisibility(8);
            }
        }
        this.f66474c.post(new C23149a());
        this.f66474c.invalidate();
    }

    /* renamed from: j */
    public final void mo36534j(String str, ImageView imageView, int i) {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59351g = C112760b.m154195C();
        bVar.f59350f = C76251l.m91644m(str);
        bVar.f59346b = true;
        if (i > 0) {
            bVar.f59365u = (float) i;
            bVar.f59364t = true;
        } else {
            bVar.f59364t = false;
        }
        bVar.f59345a = true;
        C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f66477f = onClickListener;
        Button button = this.f66485j;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        WeImageView weImageView = this.f66488m;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        }
    }
}
