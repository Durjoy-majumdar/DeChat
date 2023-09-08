package ol1;

import android.app.Activity;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8961e;
import kg3.C76577a;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C11471u;
import pe1.C35464c;
import qj1.C12282d7;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zp3.C79406f;

/* renamed from: ol1.n */
public final class C11497n extends C8961e {

    /* renamed from: h */
    public final C32227p<String, Long, C13598b0> f33792h;

    /* renamed from: i */
    public MMEditText f33793i;

    /* renamed from: j */
    public String f33794j = "";

    /* renamed from: n */
    public long f33795n;

    /* renamed from: o */
    public final C13601g f33796o;

    /* renamed from: ol1.n$a */
    public static final class C11498a implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C11497n f33797d;

        public C11498a(C11497n nVar) {
            this.f33797d = nVar;
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r6) {
            /*
                r5 = this;
                r0 = 0
                if (r6 == 0) goto L_0x0010
                java.lang.String r6 = r6.toString()
                if (r6 == 0) goto L_0x0010
                long r2 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x000f }
                goto L_0x0011
            L_0x000f:
            L_0x0010:
                r2 = r0
            L_0x0011:
                r6 = 0
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 > 0) goto L_0x003a
                ol1.n r0 = r5.f33797d
                android.view.View r0 = r0.f28308f
                boolean r1 = r0 instanceof android.widget.TextView
                if (r1 == 0) goto L_0x0021
                r6 = r0
                android.widget.TextView r6 = (android.widget.TextView) r6
            L_0x0021:
                if (r6 == 0) goto L_0x005d
                r0 = 0
                r6.setEnabled(r0)
                android.content.Context r0 = r6.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131099665(0x7f060011, float:1.781169E38)
                int r0 = r0.getColor(r1)
                r6.setTextColor(r0)
                goto L_0x005d
            L_0x003a:
                ol1.n r0 = r5.f33797d
                android.view.View r0 = r0.f28308f
                boolean r1 = r0 instanceof android.widget.TextView
                if (r1 == 0) goto L_0x0045
                r6 = r0
                android.widget.TextView r6 = (android.widget.TextView) r6
            L_0x0045:
                if (r6 == 0) goto L_0x005d
                r0 = 1
                r6.setEnabled(r0)
                android.content.Context r0 = r6.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131101836(0x7f06088c, float:1.7816093E38)
                int r0 = r0.getColor(r1)
                r6.setTextColor(r0)
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ol1.C11497n.C11498a.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ol1.n$b */
    public static final class C11499b extends C87413o implements C32224a<KeyboardHeightProvider> {

        /* renamed from: d */
        public final /* synthetic */ Context f33798d;

        /* renamed from: e */
        public final /* synthetic */ C11497n f33799e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11499b(Context context, C11497n nVar) {
            super(0);
            this.f33798d = context;
            this.f33799e = nVar;
        }

        public Object invoke() {
            Context context = this.f33798d;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider((Activity) context);
            keyboardHeightProvider.f220015b = new C11501o(this.f33799e);
            return keyboardHeightProvider;
        }
    }

    /* renamed from: ol1.n$c */
    public static final class C11500c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C11497n f33800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11500c(C11497n nVar) {
            super(0);
            this.f33800d = nVar;
        }

        public Object invoke() {
            C11497n nVar = this.f33800d;
            MMEditText mMEditText = nVar.f33793i;
            if (mMEditText != null) {
                mMEditText.setFocusableInTouchMode(true);
                MMEditText mMEditText2 = nVar.f33793i;
                if (mMEditText2 != null) {
                    mMEditText2.requestFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) nVar.f28306d.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        MMEditText mMEditText3 = nVar.f33793i;
                        if (mMEditText3 != null) {
                            inputMethodManager.showSoftInput(mMEditText3, 0);
                        } else {
                            C87412m.m108603p("editText");
                            throw null;
                        }
                    }
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("editText");
                throw null;
            }
            C87412m.m108603p("editText");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11497n(Context context, C0125s sVar, C32227p<? super String, ? super Long, C13598b0> pVar) {
        super(context, false, (C11471u.C11473b) null, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(pVar, "completeCallback");
        this.f33792h = pVar;
        this.f28309g.f26706b.mo12462b().setGravity(5);
        this.f28309g.f26706b.mo12462b().setWindowAnimations(C0966R.style.f8722sr);
        this.f33796o = C36568h.m40985a(new C11499b(context, this));
    }

    /* renamed from: a */
    public void mo9763a() {
        MMEditText mMEditText = this.f33793i;
        if (mMEditText != null) {
            mMEditText.clearFocus();
            Object systemService = this.f28306d.getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            MMEditText mMEditText2 = this.f33793i;
            if (mMEditText2 != null) {
                inputMethodManager.hideSoftInputFromWindow(mMEditText2.getWindowToken(), 0);
                ((KeyboardHeightProvider) ((C36570n) this.f33796o).getValue()).mo104021d();
                super.mo9763a();
                return;
            }
            C87412m.m108603p("editText");
            throw null;
        }
        C87412m.m108603p("editText");
        throw null;
    }

    /* renamed from: b */
    public View mo9448b() {
        return mo9765d();
    }

    /* renamed from: c */
    public View mo9764c() {
        TextView textView = new TextView(this.f28306d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(C0966R.dimen.f3736cp));
        textView.setBackground(textView.getContext().getResources().getDrawable(C0966R.C0969drawable.f5150yh));
        int b = C76577a.m92151b(textView.getContext(), 12);
        int b2 = C76577a.m92151b(textView.getContext(), 4);
        textView.setPadding(b, b2, b, b2);
        textView.setEnabled(false);
        textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        textView.setText(textView.getContext().getResources().getString(C0966R.string.f8014z_));
        return textView;
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.b16;
    }

    /* renamed from: j */
    public String mo9449j() {
        String string = this.f28306d.getResources().getString(C0966R.string.fyt);
        C87412m.m108593f(string, "context.resources.getStr…ing.finder_live_wish_num)");
        return string;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Context context = MMApplicationContext.getContext();
        String str = C12282d7.f35384U0;
        layoutParams.height = C79406f.m96347a(context, 412.0f - ((float) 64)) + (C75044y4.m89991c(this.f28306d) * 2);
        View findViewById = view.findViewById(C0966R.C0970id.ixz);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.edit_text)");
        MMEditText mMEditText = (MMEditText) findViewById;
        this.f33793i = mMEditText;
        mMEditText.addTextChangedListener(new C11498a(this));
    }

    /* renamed from: l */
    public void mo9450l() {
        this.f33792h.invoke(this.f33794j, Long.valueOf(this.f33795n));
    }

    /* renamed from: n */
    public void mo9451n() {
        mo9763a();
        this.f33792h.invoke(this.f33794j, Long.valueOf(this.f33795n));
    }

    /* renamed from: o */
    public void mo9768o() {
        long j;
        MMEditText mMEditText = this.f33793i;
        Long l = null;
        if (mMEditText != null) {
            String obj = mMEditText.getText().toString();
            C87412m.m108594g(obj, "<this>");
            try {
                j = Long.parseLong(obj);
            } catch (NumberFormatException unused) {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            if (valueOf.longValue() > 0) {
                l = valueOf;
            }
            long longValue = l != null ? l.longValue() : this.f33795n;
            C35464c<Integer> cVar = C32444a.f86186q0;
            if (longValue > ((long) cVar.mo60266n().intValue())) {
                Context context = this.f28306d;
                C76912y0.m92767f(context, context.getResources().getString(C0966R.string.fp7, new Object[]{Integer.valueOf(cVar.mo60266n().intValue())}));
                return;
            }
            mo9763a();
            this.f33792h.invoke(this.f33794j, Long.valueOf(longValue));
            return;
        }
        C87412m.m108603p("editText");
        throw null;
    }

    /* renamed from: p */
    public void mo3431p() {
        super.mo3431p();
        C61926c.m72666K(100, new C11500c(this));
        ((KeyboardHeightProvider) ((C36570n) this.f33796o).getValue()).mo104022e();
    }
}
