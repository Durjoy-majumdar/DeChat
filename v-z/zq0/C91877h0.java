package zq0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import br0.C79774c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import gt0.C87357i0;
import gt0.C87362k;
import gy3.C87412m;
import gy3.C87413o;
import ik0.C87744a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import js0.C88024r;
import k20.C60958c;
import k20.C9556a;
import p385u2.C111105a;
import rx3.C13598b0;
import wq0.C91070i;
import wq0.C91072j;
import z04.C112551y;
import zq0.C91841a;
import zq0.C91910r;

/* renamed from: zq0.h0 */
public final class C91877h0 extends C91841a implements C87744a {

    /* renamed from: A */
    public C79426u f263046A;

    /* renamed from: B */
    public ArrayList<PhoneItem> f263047B = new ArrayList<>();

    /* renamed from: C */
    public C32226l<? super Boolean, C13598b0> f263048C = C79416d.f232945d;

    /* renamed from: D */
    public C32224a<C13598b0> f263049D = C79419g.f232948d;

    /* renamed from: E */
    public C32224a<C13598b0> f263050E = C79418f.f232947d;

    /* renamed from: F */
    public C32224a<C13598b0> f263051F = C79420h.f232949d;

    /* renamed from: G */
    public C32224a<C13598b0> f263052G = C79417e.f232946d;

    /* renamed from: H */
    public C32224a<C13598b0> f263053H = C79421i.f232950d;

    /* renamed from: I */
    public C32226l<? super PhoneItem, C13598b0> f263054I = C79422j.f232951d;

    /* renamed from: z */
    public final String f263055z;

    /* renamed from: zq0.h0$b */
    public static final class C79414b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91877h0 f232943d;

        public C79414b(C91877h0 h0Var) {
            this.f232943d = h0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f232943d.f263051F.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zq0.h0$c */
    public static final class C79415c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91877h0 f232944d;

        public C79415c(C91877h0 h0Var) {
            this.f232944d = h0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f232944d.f263047B.size() == 1) {
                this.f232944d.f263052G.invoke();
            } else {
                this.f232944d.f263053H.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zq0.h0$d */
    public static final class C79416d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C79416d f232945d = new C79416d();

        public C79416d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.h0$e */
    public static final class C79417e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C79417e f232946d = new C79417e();

        public C79417e() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.h0$f */
    public static final class C79418f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C79418f f232947d = new C79418f();

        public C79418f() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.h0$g */
    public static final class C79419g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C79419g f232948d = new C79419g();

        public C79419g() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.h0$h */
    public static final class C79420h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C79420h f232949d = new C79420h();

        public C79420h() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.h0$i */
    public static final class C79421i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C79421i f232950d = new C79421i();

        public C79421i() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.h0$j */
    public static final class C79422j extends C87413o implements C32226l<PhoneItem, C13598b0> {

        /* renamed from: d */
        public static final C79422j f232951d = new C79422j();

        public C79422j() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((PhoneItem) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.h0$l */
    public static final class C79423l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91877h0 f232952d;

        public C79423l(C91877h0 h0Var) {
            this.f232952d = h0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$showPrivacyExplainEntry$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f232952d.f263051F.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$showPrivacyExplainEntry$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zq0.h0$a */
    public static final class C91878a implements C91841a.C91844c {

        /* renamed from: a */
        public final /* synthetic */ C91877h0 f263056a;

        public C91878a(C91877h0 h0Var) {
            this.f263056a = h0Var;
        }

        /* renamed from: a */
        public void mo125673a(int i, boolean z) {
            if (i == 1) {
                C91877h0 h0Var = this.f263056a;
                h0Var.f263048C.invoke(Boolean.valueOf(h0Var.f262961f.mo121760a()));
                C79426u uVar = this.f263056a.f263046A;
                ArrayList<PhoneItem> arrayList = uVar != null ? uVar.f232954e : null;
                C87412m.m108591d(arrayList);
                Iterator<PhoneItem> it = arrayList.iterator();
                while (it.hasNext()) {
                    PhoneItem next = it.next();
                    if (next.f245279o) {
                        this.f263056a.f263054I.invoke(next);
                        return;
                    }
                }
            } else if (i == 2) {
                this.f263056a.f263049D.invoke();
            } else if (i == 3) {
                this.f263056a.f263050E.invoke();
            }
        }
    }

    /* renamed from: zq0.h0$k */
    public static final class C91879k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91877h0 f263057d;

        public C91879k(C91877h0 h0Var) {
            this.f263057d = h0Var;
        }

        public final void run() {
            C91877h0 h0Var = this.f263057d;
            String str = h0Var.f263055z;
            Context context = h0Var.getContext();
            C87412m.m108593f(context, "context");
            h0Var.f263046A = new C79426u(str, context, this.f263057d.f263047B);
            C91877h0 h0Var2 = this.f263057d;
            h0Var2.f262970r.setAdapter(h0Var2.f263046A);
            if (this.f263057d.f263047B.size() == 0) {
                View view = this.f263057d.f262973u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f263057d.f262970r.setVisibility(8);
                this.f263057d.f262971s.setVisibility(8);
            } else if (this.f263057d.f263047B.size() == 1) {
                View view3 = this.f263057d.f262973u;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f263057d.f262970r.setVisibility(0);
                RecyclerView.C16613e adapter = this.f263057d.f262970r.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                this.f263057d.f262971s.setVisibility(0);
                C91877h0 h0Var3 = this.f263057d;
                h0Var3.f262971s.setText(h0Var3.getContext().getString(C0966R.string.a85));
                C91910r rVar = C91875g0.f263042b;
                if (rVar == null) {
                    rVar = new C91894m();
                }
                if (!rVar.mo125728i()) {
                    this.f263057d.f262971s.setVisibility(8);
                }
            } else {
                View view4 = this.f263057d.f262973u;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$phoneItems$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f263057d.f262970r.setVisibility(0);
                this.f263057d.f262971s.setVisibility(0);
                RecyclerView.C16613e adapter2 = this.f263057d.f262970r.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                }
                C91877h0 h0Var4 = this.f263057d;
                h0Var4.f262971s.setText(h0Var4.getContext().getString(C0966R.string.f360122a83));
                C91910r rVar2 = C91875g0.f263042b;
                if (rVar2 == null) {
                    rVar2 = new C91894m();
                }
                if (!rVar2.mo125728i()) {
                    this.f263057d.f262971s.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91877h0(Context context, String str, C79774c cVar) {
        super(context, cVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(cVar, "windowAndroid");
        this.f263055z = str;
        this.f262975w = new C91878a(this);
        this.f262967o.setOnClickListener(new C79414b(this));
        this.f262971s.setOnClickListener(new C79415c(this));
        this.f262969q.setVisibility(0);
    }

    /* renamed from: E */
    public void mo121482E(boolean z) {
        this.f262967o.setVisibility(z ? 0 : 8);
        if (z) {
            Drawable e = C74933u4.m89768e(getContext(), C0966R.raw.icon_info, C111105a.m151500b(getContext(), C0966R.color.BW_0_Alpha_0_3));
            this.f262976x = e;
            this.f262967o.setVisibility(8);
            if (e != null) {
                this.f262967o.setImageDrawable(this.f262976x);
                this.f262967o.setVisibility(0);
            }
            this.f262967o.setContentDescription(getContext().getString(C0966R.string.f7885v1));
            this.f262967o.setOnClickListener(new C79423l(this));
            return;
        }
        this.f262967o.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: l */
    public C91070i mo121495l(C81879g gVar, String str, C91891k0 k0Var, PhoneItem phoneItem, C91910r.C91911a aVar) {
        C79774c cVar;
        C87412m.m108594g(gVar, "component");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(phoneItem, "phoneItem");
        AppBrandRuntime runtime = gVar.getRuntime();
        if (runtime == null || (cVar = runtime.mo113054f0()) == null) {
            cVar = gVar.mo114271f0();
            C87412m.m108591d(cVar);
        }
        C79774c cVar2 = cVar;
        int measuredHeight = this.f262960e.getMeasuredHeight();
        int c = C84967l0.m104750c(getContext()) + C74942w4.m89784a(getContext(), 150);
        Context context = getContext();
        C87412m.m108593f(context, "this.context");
        return new C91861e1(context, measuredHeight < c ? c : measuredHeight, cVar2, str, k0Var, phoneItem, aVar);
    }

    /* renamed from: n */
    public C91072j mo121450n(C81879g gVar, String str, C40469j0 j0Var) {
        C79774c cVar;
        C87412m.m108594g(gVar, "component");
        AppBrandRuntime runtime = gVar.getRuntime();
        if (runtime == null || (cVar = runtime.mo113054f0()) == null) {
            cVar = gVar.mo114271f0();
            C87412m.m108591d(cVar);
        }
        Context context = getContext();
        C87412m.m108593f(context, "this.context");
        C40469j0 j0Var2 = j0Var;
        String str2 = str;
        C87357i0 i0Var = new C87357i0(j0Var2, str2, context, this.f262960e.getMeasuredHeight(), cVar);
        i0Var.mo121772d(this.f262977y);
        return i0Var;
    }

    /* renamed from: o */
    public void mo121451o(C81879g gVar) {
        C87412m.m108594g(gVar, "component");
        mo125667a(this.f262977y);
        ((C87362k) C91070i.C91071a.m114253a(this, gVar)).mo121778b(this);
    }

    public void setDialogApplyWording(String str) {
        C87412m.m108594g(str, "wording");
        this.f262968p.setText(str);
        TextView textView = this.f262968p;
        int i = 0;
        if (C112551y.m153811k(str)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setDialogRequestDesc(String str) {
        C87412m.m108594g(str, "wording");
        this.f262965j.setText(str);
    }

    public void setDialogSubDesc(String str) {
        C87412m.m108594g(str, "desc");
        this.f262966n.setVisibility(0);
        this.f262966n.setText(str);
    }

    public void setOnAccept(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f263048C = lVar;
    }

    public void setOnAddPhoneNumber(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f263052G = aVar;
    }

    public void setOnCancel(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f263050E = aVar;
    }

    public void setOnDeny(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f263049D = aVar;
    }

    public void setOnExplain(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f263051F = aVar;
    }

    public void setOnManagePhoneNumber(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f263053H = aVar;
    }

    public void setOnPhoneItemSelect(C32226l<? super PhoneItem, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f263054I = lVar;
    }

    public void setPhoneItems(ArrayList<PhoneItem> arrayList) {
        C87412m.m108594g(arrayList, "value");
        this.f263047B.clear();
        this.f263047B.addAll(arrayList);
        C88024r.m109572b(new C91879k(this));
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }
}
