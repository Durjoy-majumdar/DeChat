package cp1;

import ak1.C0047e0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONObject;
import qo3.C12925w;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: cp1.d */
public final class C7120d extends FrameLayout {

    /* renamed from: d */
    public final boolean f25074d;

    /* renamed from: e */
    public final boolean f25075e;

    /* renamed from: f */
    public final long f25076f;

    /* renamed from: g */
    public View f25077g;

    /* renamed from: h */
    public TextView f25078h;

    /* renamed from: i */
    public Button f25079i;

    /* renamed from: j */
    public Button f25080j;

    /* renamed from: n */
    public C12925w f25081n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7120d(Context context, boolean z, boolean z2, long j) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f25074d = z;
        this.f25075e = z2;
        this.f25076f = j;
    }

    /* renamed from: a */
    public static final void m7319a(C7120d dVar, boolean z, boolean z2, long j) {
        if (!dVar.f25074d) {
            C0047e0 e0Var = C0047e0.f58a;
            if (z2) {
                String str = z ? "watch_live_new_pay_click" : "watch_live_new_pay_cancel";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("object_id", C61926c.m72691p(j));
                e0Var.mo54a(jSONObject);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "this.toString()");
                ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0(str, jSONObject2);
                return;
            }
            ((C54116w) C86312j.m106911c(C54116w.class)).Nx0(C54067f0.C54076o0.CHARGE_LIVE, z ? 4 : 5, 0);
        }
    }

    /* renamed from: b */
    public final void mo8273b(boolean z, String str, String str2, C32224a<C13598b0> aVar) {
        TextView textView;
        TextView textView2;
        String str3 = str;
        C32224a<C13598b0> aVar2 = aVar;
        C87412m.m108594g(str3, "licenseDescStr");
        C87412m.m108594g(str2, "licenseContentStr");
        C87412m.m108594g(aVar2, "callback");
        C12925w wVar = new C12925w(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.afn, this, false);
        this.f25077g = inflate;
        View view = null;
        TextView textView3 = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.azz) : null;
        this.f25078h = textView3;
        if (textView3 != null) {
            int E = C112550d0.m153769E(str, str2, 0, false, 6, (Object) null);
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new C7119c(this), E, str2.length() + E, 33);
            textView3.setHighlightColor(getContext().getResources().getColor(17170445));
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setText(spannableString);
        }
        View view2 = this.f25077g;
        Button button = view2 != null ? (Button) view2.findViewById(C0966R.C0970id.azx) : null;
        this.f25079i = button;
        if (button != null) {
            button.setOnClickListener(new C7117a(this));
        }
        View view3 = this.f25077g;
        Button button2 = view3 != null ? (Button) view3.findViewById(C0966R.C0970id.azy) : null;
        this.f25080j = button2;
        if (button2 != null) {
            button2.setOnClickListener(new C7118b(this, aVar2));
        }
        if (z) {
            View view4 = this.f25077g;
            View findViewById = view4 != null ? view4.findViewById(C0966R.C0970id.f357645b00) : null;
            if (findViewById != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view5 = findViewById;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view6 = this.f25077g;
            if (!(view6 == null || (textView2 = (TextView) view6.findViewById(C0966R.C0970id.azz)) == null)) {
                textView2.setTextSize(1, 17.0f);
            }
            View view7 = this.f25077g;
            View findViewById2 = view7 != null ? view7.findViewById(C0966R.C0970id.c8t) : null;
            if (findViewById2 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view8 = findViewById2;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view9 = this.f25077g;
            View findViewById3 = view9 != null ? view9.findViewById(C0966R.C0970id.c8u) : null;
            if (findViewById3 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(0);
                C117292a.m165358d(findViewById3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view10 = this.f25077g;
            if (view10 != null) {
                view = view10.findViewById(C0966R.C0970id.c8v);
            }
            if (view != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar6.mo10233c(0);
                C117292a.m165358d(view, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view11 = this.f25077g;
            View findViewById4 = view11 != null ? view11.findViewById(C0966R.C0970id.f357645b00) : null;
            if (findViewById4 != null) {
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar7.mo10233c(0);
                View view12 = findViewById4;
                C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view13 = this.f25077g;
            if (!(view13 == null || (textView = (TextView) view13.findViewById(C0966R.C0970id.azz)) == null)) {
                textView.setTextSize(1, 15.0f);
            }
            View view14 = this.f25077g;
            View findViewById5 = view14 != null ? view14.findViewById(C0966R.C0970id.c8t) : null;
            if (findViewById5 != null) {
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar8.mo10233c(8);
                View view15 = findViewById5;
                C117292a.m165358d(view15, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view15, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view16 = this.f25077g;
            View findViewById6 = view16 != null ? view16.findViewById(C0966R.C0970id.c8u) : null;
            if (findViewById6 != null) {
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar9.mo10233c(8);
                View view17 = findViewById6;
                C117292a.m165358d(view17, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view17, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view18 = this.f25077g;
            if (view18 != null) {
                view = view18.findViewById(C0966R.C0970id.c8v);
            }
            if (view != null) {
                C9556a aVar10 = new C9556a();
                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                aVar10.mo10233c(8);
                View view19 = view;
                C117292a.m165358d(view19, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view19, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        wVar.mo12471k(this.f25077g);
        wVar.f36921B.setBackgroundResource(C0966R.C0969drawable.az_);
        wVar.mo5086o();
        this.f25081n = wVar;
    }

    public final C12925w getBottomSheet() {
        return this.f25081n;
    }

    public final Button getCancelBtn() {
        return this.f25079i;
    }

    public final Button getConfirmBtn() {
        return this.f25080j;
    }

    public final TextView getLicenseDesc() {
        return this.f25078h;
    }

    public final long getObjId() {
        return this.f25076f;
    }

    public final View getRoot() {
        return this.f25077g;
    }

    public final void setBottomSheet(C12925w wVar) {
        this.f25081n = wVar;
    }

    public final void setCancelBtn(Button button) {
        this.f25079i = button;
    }

    public final void setConfirmBtn(Button button) {
        this.f25080j = button;
    }

    public final void setLicenseDesc(TextView textView) {
        this.f25078h = textView;
    }

    public final void setRoot(View view) {
        this.f25077g = view;
    }
}
