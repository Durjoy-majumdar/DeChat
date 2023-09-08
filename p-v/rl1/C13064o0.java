package rl1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import bh0.C113174b;
import bi1.C0283d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4213y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C8802s1;
import it1.C60625c;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46523h2;
import k20.C60958c;
import k20.C9556a;
import kotlin.Result;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import o40.C61937h;
import ob0.C47350c;
import ob0.C89132b;
import ok1.C62042e;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48659a31;
import te3.C48914bw;
import te3.C49712hj1;
import te3.C50334m01;
import te3.C51633v21;
import te3.C51773w21;
import te3.C51913x21;
import te3.C52057y21;
import te3.C52204z21;
import tf0.C13883o1;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import z04.C112550d0;

/* renamed from: rl1.o0 */
public final class C13064o0 {

    /* renamed from: a */
    public static final C13064o0 f37206a = new C13064o0();

    /* renamed from: rl1.o0$a */
    public static final class C13065a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f37207d;

        public C13065a(View view) {
            this.f37207d = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r1 = r0.getContext();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                android.view.View r0 = r3.f37207d
                r1 = 2131299644(0x7f090d3c, float:1.8217295E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.EditText r0 = (android.widget.EditText) r0
                if (r0 == 0) goto L_0x0010
                r0.requestFocus()
            L_0x0010:
                if (r0 == 0) goto L_0x001f
                android.content.Context r1 = r0.getContext()
                if (r1 == 0) goto L_0x001f
                java.lang.String r2 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r2)
                goto L_0x0020
            L_0x001f:
                r1 = 0
            L_0x0020:
                android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                if (r1 == 0) goto L_0x0028
                r2 = 0
                r1.showSoftInput(r0, r2)
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rl1.C13064o0.C13065a.run():void");
        }
    }

    /* renamed from: rl1.o0$b */
    public static final class C13066b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f37208d;

        /* renamed from: e */
        public final /* synthetic */ EditText f37209e;

        /* renamed from: f */
        public final /* synthetic */ TextView f37210f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13066b(C8479f0<String> f0Var, EditText editText, TextView textView) {
            super(0);
            this.f37208d = f0Var;
            this.f37209e = editText;
            this.f37210f = textView;
        }

        public Object invoke() {
            this.f37208d.f27484d = this.f37209e.getText().toString();
            TextView textView = this.f37210f;
            C87412m.m108593f(textView, "confirm");
            C13064o0.m12502b(textView, ((CharSequence) this.f37208d.f27484d).length() > 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rl1.o0$c */
    public static final class C13067c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4213y f37211d;

        public C13067c(C4213y yVar) {
            this.f37211d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f37211d.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rl1.o0$d */
    public static final class C13068d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4213y f37212d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<String, C13598b0> f37213e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f37214f;

        public C13068d(C4213y yVar, C32226l<? super String, C13598b0> lVar, C8479f0<String> f0Var) {
            this.f37212d = yVar;
            this.f37213e = lVar;
            this.f37214f = f0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f37212d.mo5085n();
            this.f37213e.invoke(this.f37214f.f27484d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/LotteryUtil$claimByCustomize$1$rootView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rl1.o0$e */
    public static final class C13069e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f37215a;

        /* renamed from: b */
        public final /* synthetic */ C15601d<C51633v21> f37216b;

        /* renamed from: c */
        public final /* synthetic */ Context f37217c;

        public C13069e(String str, C15601d<? super C51633v21> dVar, Context context) {
            this.f37215a = str;
            this.f37216b = dVar;
            this.f37217c = context;
        }

        public Object call(Object obj) {
            C13598b0 b0Var;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (C0283d.m246d(cVar)) {
                C51633v21 v212 = ((C52057y21) cVar.f256796d).f145086d;
                if (v212 != null) {
                    String str = this.f37215a;
                    C15601d<C51633v21> dVar = this.f37216b;
                    Log.m105924i("LotteryUtil", str + " success!");
                    dVar.resumeWith(Result.m168114constructorimpl(v212));
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    C15601d<C51633v21> dVar2 = this.f37216b;
                    Log.m105920e("LotteryUtil", "postClaim suc but after_status is null!");
                    dVar2.resumeWith(Result.m168114constructorimpl((Object) null));
                }
            } else {
                String str2 = cVar.f256795c;
                if (!(str2 == null || str2.length() == 0)) {
                    C61926c.m72668M(new C13071p0(this.f37217c, str2));
                }
                Log.m105924i("LotteryUtil", this.f37215a + " fail,errMsg:" + str2 + '!');
                this.f37216b.resumeWith(Result.m168114constructorimpl((Object) null));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public static final void m12502b(TextView textView, boolean z) {
        textView.setEnabled(z);
        if (z) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f2975b6));
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        }
    }

    /* renamed from: a */
    public final C4213y mo12563a(Activity activity, C52204z21 z212, C32226l<? super String, C13598b0> lVar) {
        String str;
        Activity activity2 = activity;
        C52204z21 z213 = z212;
        C32226l<? super String, C13598b0> lVar2 = lVar;
        C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(z213, "lotteryInfo");
        C87412m.m108594g(lVar2, "claimCallback");
        C4213y yVar = new C4213y(activity2);
        View inflate = LayoutInflater.from(activity).inflate(C0966R.C0971layout.cyr, new FrameLayout(activity2), false);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.blv);
        C87412m.m108593f(textView, "confirm");
        m12502b(textView, false);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.n6s);
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        String str2 = "";
        C8479f0 f0Var2 = f0Var;
        C62042e.m72802O1(C62042e.f176370a, editText, (TextView) inflate.findViewById(C0966R.C0970id.n_d), 96, 48, false, new C13066b(f0Var, editText, textView), 16, (Object) null);
        Resources resources = editText.getContext().getResources();
        Object[] objArr = new Object[1];
        C51633v21 v212 = z213.f145653t;
        if (v212 == null || (str = v212.f143257e) == null) {
            str = str2;
        }
        objArr[0] = str;
        editText.setHint(resources.getString(C0966R.string.mng, objArr));
        ((TextView) inflate.findViewById(C0966R.C0970id.aq9)).setOnClickListener(new C13067c(yVar));
        textView.setOnClickListener(new C13068d(yVar, lVar2, f0Var2));
        yVar.mo12471k(inflate);
        yVar.mo12461a();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/LotteryUtil", "claimByCustomize", "(Landroid/app/Activity;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/view/CustomInputBottomPage;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/lottery/LotteryUtil", "claimByCustomize", "(Landroid/app/Activity;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/view/CustomInputBottomPage;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.animate().alpha(1.0f).start();
        yVar.mo5086o();
        inflate.postDelayed(new C13065a(inflate), 300);
        return yVar;
    }

    /* renamed from: c */
    public final boolean mo12564c(Context context, String str, int i, String str2, long j, C49712hj1 hj12) {
        Context context2 = context;
        String str3 = str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "finderUsername");
        String str4 = str2;
        C87412m.m108594g(str2, "lotteryId");
        C37521f.f99374d.getClass();
        if (C37521f.f99376d2.mo60266n().intValue() <= 0) {
            C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.d2x), 0).show();
            return false;
        }
        C51773w21 w212 = new C51773w21();
        w212.f143824d = str3;
        w212.f143829i = false;
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13254H9(context, i, w212, str2, j, hj12, false);
        return true;
    }

    /* renamed from: d */
    public final String mo12565d(C113174b bVar) {
        C87412m.m108594g(bVar, "obj");
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(bVar.f338616f)) {
            sb.append(bVar.f338616f);
        }
        if (!TextUtils.isEmpty(bVar.f338617g)) {
            sb.append(" ");
            sb.append(bVar.f338617g);
        }
        if (!TextUtils.isEmpty(bVar.f338618h)) {
            sb.append(" ");
            sb.append(bVar.f338618h);
        }
        if (!TextUtils.isEmpty(bVar.f338624q)) {
            sb.append(" ");
            sb.append(bVar.f338624q);
        }
        if (!TextUtils.isEmpty(bVar.f338620j)) {
            sb.append(" ");
            sb.append(bVar.f338620j);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "builder.toString()");
        return sb4;
    }

    /* renamed from: e */
    public final String mo12566e(LinkedList<C48659a31> linkedList) {
        C87412m.m108594g(linkedList, "lotteryMethodItemList");
        if (linkedList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append("[index:" + i + ",item:" + C61937h.m72709h((C48659a31) next) + ']');
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: f */
    public final String mo12567f(C50334m01 m012) {
        C87412m.m108594g(m012, "resp");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("item_list:");
        LinkedList<C48659a31> linkedList = m012.f137739d;
        C87412m.m108593f(linkedList, "resp.item_list");
        sb4.append(mo12566e(linkedList));
        sb4.append(";\n");
        sb.append(sb4.toString());
        sb.append("location_id:" + m012.f137740e + ';');
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "sb.toString()");
        return sb5;
    }

    /* renamed from: g */
    public final void mo12568g(TextView textView) {
        C87412m.m108594g(textView, "tv");
        try {
            String string = textView.getContext().getResources().getString(C0966R.string.mnw);
            C87412m.m108593f(string, "tv.context.resources.get…ottery_statement_license)");
            String str = textView.getContext().getResources().getString(C0966R.string.due) + string;
            int E = C112550d0.m153769E(str, string, 0, false, 6, (Object) null);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new C13052m0(new WeakReference(textView.getContext())), E, string.length() + E, 33);
            textView.setHighlightColor(textView.getContext().getResources().getColor(17170445));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "LotteryUtil-normalLotteryLicense");
        }
    }

    /* renamed from: h */
    public final Object mo12569h(long j, byte[] bArr, Context context, String str, C48914bw bwVar, C52204z21 z212, C15601d<? super C51633v21> dVar) {
        C89059e i;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        Log.m105924i("LotteryUtil", str + " postClaim!");
        C51913x21 x212 = new C51913x21();
        x212.f144412d = C46523h2.f125330a.mo71859a(11486);
        x212.f144413e = j;
        x212.f144414f = C89349b.m111674a(bArr);
        x212.f144415g = z212.f145640d;
        x212.f144416h = bwVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11486;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivelotteryfillclaiminfo";
        bVar.f127066a = x212;
        bVar.f127067b = new C52057y21();
        C47350c a = bVar.mo72403a();
        C89132b ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        C60625c cVar = ui instanceof C60625c ? (C60625c) ui : null;
        if (!(cVar == null || (i = cVar.mo9225i()) == null)) {
            i.mo123420E(new C13069e(str, hVar, context));
        }
        return hVar.mo90314b();
    }
}
