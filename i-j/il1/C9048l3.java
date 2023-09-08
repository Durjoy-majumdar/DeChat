package il1;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import cl1.C54991o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import jl1.C9469d;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import org.libpag.PAGComposition;
import org.libpag.PAGLayer;
import org.libpag.PAGTextLayer;
import org.libpag.PAGView;
import qj1.C62660c;
import qo3.C12925w;
import qo3.w$$c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import te3.C49486fy0;
import te3.C50767p11;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: il1.l3 */
public final class C9048l3 extends C9120u0 {

    /* renamed from: G */
    public static final Set<Integer> f28561G = C110826x0.m151017e(19, 6, 28, 25, 26, 27, 20, 21, 22, 23, 24, 29, 30);

    /* renamed from: H */
    public static final InputFilter f28562H = C9051c.f28589d;

    /* renamed from: I */
    public static final InputFilter f28563I = C9052d.f28590d;

    /* renamed from: J */
    public static final int f28564J = 10;

    /* renamed from: A */
    public C50767p11 f28565A;

    /* renamed from: B */
    public String f28566B;

    /* renamed from: C */
    public C53973z1 f28567C;

    /* renamed from: D */
    public int f28568D;

    /* renamed from: E */
    public final C9056h f28569E;

    /* renamed from: F */
    public final C13601g f28570F;

    /* renamed from: h */
    public C32224a<C13598b0> f28571h;

    /* renamed from: i */
    public View f28572i;

    /* renamed from: j */
    public final PAGView f28573j;

    /* renamed from: n */
    public final TextView f28574n = ((TextView) this.f28572i.findViewById(C0966R.C0970id.msl));

    /* renamed from: o */
    public final EditText f28575o = ((EditText) this.f28572i.findViewById(C0966R.C0970id.msj));

    /* renamed from: p */
    public final View f28576p = this.f28572i.findViewById(C0966R.C0970id.moi);

    /* renamed from: q */
    public final LinearLayout f28577q = ((LinearLayout) this.f28572i.findViewById(C0966R.C0970id.moh));

    /* renamed from: r */
    public final Map<C50767p11, C9469d> f28578r = new LinkedHashMap();

    /* renamed from: s */
    public final View f28579s = this.f28572i.findViewById(C0966R.C0970id.mnv);

    /* renamed from: t */
    public final View f28580t;

    /* renamed from: u */
    public final TextView f28581u;

    /* renamed from: v */
    public final TextView f28582v;

    /* renamed from: w */
    public final TextView f28583w;

    /* renamed from: x */
    public C49486fy0 f28584x;

    /* renamed from: y */
    public C50767p11 f28585y;

    /* renamed from: z */
    public String f28586z;

    /* renamed from: il1.l3$a */
    public static final class C9049a implements View.OnTouchListener {

        /* renamed from: d */
        public static final C9049a f28587d = new C9049a();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: il1.l3$b */
    public static final class C9050b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9048l3 f28588d;

        public C9050b(C9048l3 l3Var) {
            this.f28588d = l3Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9048l3 l3Var = this.f28588d;
            l3Var.mo9873e();
            l3Var.postDelayed(new C9062m3(l3Var), 300);
            C32224a<C13598b0> aVar = l3Var.f28571h;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.l3$c */
    public static final class C9051c implements InputFilter {

        /* renamed from: d */
        public static final C9051c f28589d = new C9051c();

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String obj = charSequence.toString();
            while (i < charSequence.length()) {
                int codePointAt = obj.codePointAt(i);
                int charCount = Character.charCount(codePointAt);
                if (C9048l3.f28561G.contains(Integer.valueOf(Character.getType(codePointAt)))) {
                    return "";
                }
                i += charCount;
            }
            return charSequence;
        }
    }

    /* renamed from: il1.l3$d */
    public static final class C9052d implements InputFilter {

        /* renamed from: d */
        public static final C9052d f28590d = new C9052d();

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            C87412m.m108593f(charSequence, FirebaseAnalytics.C113379b.SOURCE);
            Pattern compile = Pattern.compile("\\s");
            C87412m.m108593f(compile, "compile(pattern)");
            String replaceAll = compile.matcher(charSequence).replaceAll("");
            C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            return replaceAll;
        }
    }

    /* renamed from: il1.l3$e */
    public final class C9053e extends w$$c {
        public C9053e() {
        }

        /* renamed from: a */
        public View mo4781a(Context context) {
            C87412m.m108594g(context, "context");
            return C9048l3.this;
        }

        /* renamed from: b */
        public void mo4872b() {
            C56032b z0;
            C9048l3 l3Var = C9048l3.this;
            Set<Integer> set = C9048l3.f28561G;
            l3Var.getClass();
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            if (oVar != null) {
                oVar.f154286Z = false;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
            C62660c basePlugin = l3Var.getBasePlugin();
            if (basePlugin != null && (z0 = basePlugin.mo14484z0()) != null) {
                z0.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
            }
        }

        /* renamed from: c */
        public void mo4873c() {
            C56032b z0;
            Window b;
            C12925w wVar = this.f36949a;
            if (!(wVar == null || (b = wVar.mo12462b()) == null)) {
                b.setSoftInputMode(50);
            }
            C9048l3 l3Var = C9048l3.this;
            Set<Integer> set = C9048l3.f28561G;
            l3Var.getClass();
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            if (oVar != null) {
                oVar.f154286Z = true;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
            C62660c basePlugin = l3Var.getBasePlugin();
            if (basePlugin != null && (z0 = basePlugin.mo14484z0()) != null) {
                z0.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
            }
        }
    }

    /* renamed from: il1.l3$f */
    public static final class C9054f extends C87413o implements C32224a<C9053e> {

        /* renamed from: d */
        public final /* synthetic */ C9048l3 f28592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9054f(C9048l3 l3Var) {
            super(0);
            this.f28592d = l3Var;
        }

        public Object invoke() {
            return new C9053e();
        }
    }

    /* renamed from: il1.l3$g */
    public static final class C9055g<T, U> implements BiConsumer {

        /* renamed from: a */
        public final /* synthetic */ C9048l3 f28593a;

        public C9055g(C9048l3 l3Var) {
            this.f28593a = l3Var;
        }

        public void accept(Object obj, Object obj2) {
            C50767p11 p112 = (C50767p11) obj;
            C9469d dVar = (C9469d) obj2;
            C87412m.m108594g(p112, "gift");
            C87412m.m108594g(dVar, "view");
            String str = p112.f139507d;
            C50767p11 p113 = this.f28593a.f28565A;
            dVar.setHasSelected(C87412m.m108589b(str, p113 != null ? p113.f139507d : null));
        }
    }

    /* renamed from: il1.l3$h */
    public static final class C9056h implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C9048l3 f28594d;

        public C9056h(C9048l3 l3Var) {
            this.f28594d = l3Var;
        }

        public void afterTextChanged(Editable editable) {
            Log.m105924i("Finder.FinderLiveFansModifyGiftWidget", "afterTextChanged " + editable);
            this.f28594d.f28566B = String.valueOf(editable);
            C9048l3 l3Var = this.f28594d;
            l3Var.f28574n.setText(l3Var.f28566B);
            C9048l3.m8795c(this.f28594d);
            this.f28594d.mo9874f();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9048l3(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.csx, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…_gift_detail, this, true)");
        this.f28572i = inflate;
        this.f28573j = (PAGView) inflate.findViewById(C0966R.C0970id.msk);
        View findViewById = this.f28572i.findViewById(C0966R.C0970id.apy);
        this.f28580t = findViewById;
        TextView textView = (TextView) this.f28572i.findViewById(C0966R.C0970id.f357756bl2);
        this.f28581u = textView;
        this.f28582v = (TextView) this.f28572i.findViewById(C0966R.C0970id.kpm);
        this.f28583w = (TextView) this.f28572i.findViewById(C0966R.C0970id.c2h);
        this.f28586z = "";
        this.f28566B = "";
        this.f28568D = f28564J;
        this.f28569E = new C9056h(this);
        this.f28570F = C36568h.m40985a(new C9054f(this));
        this.f28572i.setOnTouchListener(C9049a.f28587d);
        mo9879i(false);
        findViewById.setOnClickListener(new C9050b(this));
        C87412m.m108593f(textView, "confirmBtn");
        setTextBold(textView);
    }

    /* renamed from: c */
    public static final void m8795c(C9048l3 l3Var) {
        PAGComposition composition = l3Var.f28573j.getComposition();
        Integer num = null;
        PAGLayer[] layersByName = composition != null ? composition.getLayersByName("customText") : null;
        StringBuilder sb = new StringBuilder();
        sb.append("paglayerSize:");
        if (layersByName != null) {
            num = Integer.valueOf(layersByName.length);
        }
        sb.append(num);
        sb.append(", updateGiftText:");
        sb.append(l3Var.f28566B);
        Log.m105924i("Finder.FinderLiveFansModifyGiftWidget", sb.toString());
        if (layersByName != null) {
            for (PAGLayer pAGLayer : layersByName) {
                if (pAGLayer.layerType() == 3 && (pAGLayer instanceof PAGTextLayer)) {
                    ((PAGTextLayer) pAGLayer).setText(l3Var.f28566B);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final C9053e getModifyBottomPage() {
        return (C9053e) ((C36570n) this.f28570F).getValue();
    }

    /* renamed from: d */
    public final boolean mo9872d() {
        C49486fy0 fy02 = this.f28584x;
        return ((fy02 != null ? fy02.f133737g : 0) & 2) > 0;
    }

    /* renamed from: e */
    public final void mo9873e() {
        if (mo9872d()) {
            this.f28575o.setVisibility(8);
            this.f28574n.setVisibility(0);
            View view = this.f28579s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewGroup.LayoutParams layoutParams = this.f28576p.getLayoutParams();
            InputMethodManager inputMethodManager = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            EditText editText = this.f28575o;
            if (editText != null) {
                editText.clearFocus();
            }
            Context context = getContext();
            Object systemService = context != null ? context.getSystemService("input_method") : null;
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            }
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.f28575o.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: f */
    public final void mo9874f() {
        C50767p11 p112 = this.f28565A;
        if (p112 != null) {
            String str = null;
            String str2 = p112 != null ? p112.f139507d : null;
            C50767p11 p113 = this.f28585y;
            if (p113 != null) {
                str = p113.f139507d;
            }
            if (!C87412m.m108589b(str2, str)) {
                mo9879i(true);
                return;
            }
        }
        if (!C87412m.m108589b(this.f28566B, this.f28586z)) {
            if (this.f28566B.length() > 0) {
                mo9879i(true);
                return;
            }
        }
        mo9879i(false);
    }

    /* renamed from: g */
    public final void mo9875g(C50767p11 p112) {
        this.f28565A = p112;
        ((LinkedHashMap) this.f28578r).forEach(new C9055g(this));
        C53973z1 z1Var = this.f28567C;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f28573j.stop();
        this.f28573j.setProgress(0.0d);
        this.f28573j.setVisibility(8);
        C50767p11 p113 = this.f28565A;
        if (p113 != null) {
            this.f28567C = C53895h.m60466d(getScope(), (C66212f) null, (C53934p0) null, new C9073n3(this, p113, (C15601d<? super C9073n3>) null), 3, (Object) null);
        }
        mo9874f();
    }

    public final C32224a<C13598b0> getBackClickListener() {
        return this.f28571h;
    }

    public final View getRoot() {
        return this.f28572i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02b4  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9878h(qo3.C12925w r20, te3.C49486fy0 r21, te3.C50767p11 r22, te3.C50477n10 r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = "giftInfo"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.String r5 = "gift"
            gy3.C87412m.m108594g(r3, r5)
            ok1.e r6 = ok1.C62042e.f176370a
            r6.mo87010H1(r1)
            if (r0 == 0) goto L_0x0022
            il1.l3$e r6 = r19.getModifyBottomPage()
            r0.mo12468h(r6)
        L_0x0022:
            r1.f28584x = r2
            r1.f28585y = r3
            if (r4 == 0) goto L_0x002b
            java.lang.String r0 = r4.f138323f
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            java.lang.String r4 = ""
            if (r0 != 0) goto L_0x0031
            r0 = r4
        L_0x0031:
            r1.f28586z = r0
            int r0 = r0.length()
            r7 = 1
            r8 = 0
            if (r0 != 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            java.lang.String r9 = "safeParser"
            java.lang.String r10 = "Finder.FinderLiveFansModifyGiftWidget"
            if (r0 == 0) goto L_0x0086
            te3.s11 r0 = new te3.s11
            r0.<init>()
            pe3.b r11 = r3.f139522v
            if (r11 == 0) goto L_0x0051
            byte[] r11 = r11.f257327a
            goto L_0x0052
        L_0x0051:
            r11 = 0
        L_0x0052:
            if (r11 != 0) goto L_0x0056
        L_0x0054:
            r0 = 0
            goto L_0x0064
        L_0x0056:
            r0.parseFrom(r11)     // Catch:{ Exception -> 0x005a }
            goto L_0x0064
        L_0x005a:
            r0 = move-exception
            r11 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r4, r0)
            goto L_0x0054
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = r0.f141266f
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r0 != 0) goto L_0x006d
            r0 = r4
        L_0x006d:
            r1.f28586z = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "originText from pag:"
            r0.append(r11)
            java.lang.String r11 = r1.f28586z
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x009c
        L_0x0086:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "originText from customInfo:"
            r0.append(r11)
            java.lang.String r11 = r1.f28586z
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x009c:
            java.lang.String r0 = r1.f28586z
            r1.f28566B = r0
            int r0 = r2.f133741n
            r1.f28568D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "limitLength:"
            r0.append(r2)
            int r2 = r1.f28568D
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            int r0 = r1.f28568D
            if (r0 > 0) goto L_0x00c2
            int r0 = f28564J
            r1.f28568D = r0
        L_0x00c2:
            android.view.View r0 = r1.f28579s
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r11)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget"
            java.lang.String r14 = "updateViews"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r8)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget"
            java.lang.String r13 = "updateViews"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r19.mo9872d()
            if (r0 == 0) goto L_0x0115
            android.widget.TextView r0 = r1.f28582v
            r2 = 2131827346(0x7f111a92, float:1.9287602E38)
            r0.setText(r2)
            goto L_0x011d
        L_0x0115:
            android.widget.TextView r0 = r1.f28582v
            r2 = 2131827347(0x7f111a93, float:1.9287604E38)
            r0.setText(r2)
        L_0x011d:
            te3.fy0 r0 = r1.f28584x
            if (r0 == 0) goto L_0x0124
            int r0 = r0.f133739i
            goto L_0x0125
        L_0x0124:
            r0 = 0
        L_0x0125:
            r2 = 8
            if (r0 <= 0) goto L_0x0147
            android.widget.TextView r11 = r1.f28583w
            android.content.Context r12 = r19.getContext()
            r13 = 2131827344(0x7f111a90, float:1.9287598E38)
            java.lang.Object[] r14 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r8] = r0
            java.lang.String r0 = r12.getString(r13, r14)
            r11.setText(r0)
            android.widget.TextView r0 = r1.f28583w
            r0.setVisibility(r8)
            goto L_0x0151
        L_0x0147:
            android.widget.TextView r0 = r1.f28583w
            r0.setText(r4)
            android.widget.TextView r0 = r1.f28583w
            r0.setVisibility(r2)
        L_0x0151:
            android.widget.TextView r0 = r1.f28581u
            il1.o3 r11 = new il1.o3
            r11.<init>(r1)
            r0.setOnClickListener(r11)
            boolean r0 = r19.mo9872d()
            r11 = 2
            if (r0 == 0) goto L_0x01bb
            android.widget.TextView r0 = r1.f28574n
            r0.setVisibility(r8)
            android.widget.EditText r0 = r1.f28575o
            r0.setVisibility(r2)
            android.widget.TextView r0 = r1.f28574n
            il1.p3 r2 = new il1.p3
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.f28572i
            il1.q3 r2 = new il1.q3
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            org.libpag.PAGView r0 = r1.f28573j
            il1.r3 r2 = new il1.r3
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r1.f28574n
            java.lang.String r2 = r1.f28586z
            r0.setText(r2)
            android.widget.EditText r0 = r1.f28575o
            java.lang.String r2 = r1.f28586z
            r0.setText(r2)
            android.widget.EditText r0 = r1.f28575o
            il1.l3$h r2 = r1.f28569E
            r0.addTextChangedListener(r2)
            android.widget.EditText r0 = r1.f28575o
            r2 = 3
            android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
            android.text.InputFilter r12 = f28562H
            r2[r8] = r12
            android.text.InputFilter r12 = f28563I
            r2[r7] = r12
            com.tencent.mm.ui.tools.p0 r12 = new com.tencent.mm.ui.tools.p0
            int r13 = r1.f28568D
            com.tencent.mm.ui.tools.p0$a r14 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_2
            r12.<init>(r13, r14)
            r2[r11] = r12
            r0.setFilters(r2)
            goto L_0x01df
        L_0x01bb:
            android.widget.TextView r0 = r1.f28574n
            r0.setVisibility(r2)
            android.widget.EditText r0 = r1.f28575o
            r0.setVisibility(r2)
            android.widget.EditText r0 = r1.f28575o
            r0.setText(r4)
            android.widget.EditText r0 = r1.f28575o
            il1.l3$h r2 = r1.f28569E
            r0.removeTextChangedListener(r2)
            android.view.View r0 = r1.f28572i
            il1.s3 r2 = il1.C9108s3.f28693d
            r0.setOnClickListener(r2)
            org.libpag.PAGView r0 = r1.f28573j
            il1.t3 r2 = il1.C9115t3.f28725d
            r0.setOnClickListener(r2)
        L_0x01df:
            android.view.View r0 = r1.f28576p
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x01ec
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x01ed
        L_0x01ec:
            r0 = 0
        L_0x01ed:
            if (r0 != 0) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            r0.bottomMargin = r8
        L_0x01f2:
            android.widget.LinearLayout r0 = r1.f28577q
            r0.removeAllViews()
            java.util.Map<te3.p11, jl1.d> r0 = r1.f28578r
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            te3.fy0 r0 = r1.f28584x
            if (r0 == 0) goto L_0x02ed
            java.util.LinkedList<te3.p11> r0 = r0.f133738h
            if (r0 == 0) goto L_0x02ed
            java.util.Iterator r2 = r0.iterator()
            r12 = 0
        L_0x020b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r2.next()
            int r13 = r12 + 1
            if (r12 < 0) goto L_0x02e8
            r14 = r0
            te3.p11 r14 = (te3.C50767p11) r14
            jl1.d r15 = new jl1.d
            android.content.Context r6 = r19.getContext()
            java.lang.String r0 = "context"
            gy3.C87412m.m108593f(r6, r0)
            gy3.C87412m.m108593f(r14, r5)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x026b }
            r11.<init>()     // Catch:{ all -> 0x026b }
            r0 = 35
            r11.append(r0)     // Catch:{ all -> 0x026b }
            te3.s11 r0 = new te3.s11     // Catch:{ all -> 0x026b }
            r0.<init>()     // Catch:{ all -> 0x026b }
            pe3.b r8 = r14.f139522v     // Catch:{ all -> 0x0268 }
            if (r8 == 0) goto L_0x0240
            byte[] r8 = r8.f257327a     // Catch:{ all -> 0x0268 }
            goto L_0x0241
        L_0x0240:
            r8 = 0
        L_0x0241:
            if (r8 != 0) goto L_0x0244
            goto L_0x0253
        L_0x0244:
            r0.parseFrom(r8)     // Catch:{ Exception -> 0x0248 }
            goto L_0x0254
        L_0x0248:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x0268 }
            r16 = 0
            r0[r16] = r8     // Catch:{ all -> 0x0268 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r4, r0)     // Catch:{ all -> 0x0268 }
        L_0x0253:
            r0 = 0
        L_0x0254:
            if (r0 == 0) goto L_0x025a
            java.lang.String r0 = r0.f141265e     // Catch:{ all -> 0x0268 }
            if (r0 != 0) goto L_0x025c
        L_0x025a:
            java.lang.String r0 = "ffffff"
        L_0x025c:
            r11.append(r0)     // Catch:{ all -> 0x0268 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0268 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x0268 }
            goto L_0x0274
        L_0x0268:
            r0 = move-exception
            r8 = 0
            goto L_0x026c
        L_0x026b:
            r0 = move-exception
        L_0x026c:
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r8 = "getGiftColor exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r8, r11)
            r0 = -1
        L_0x0274:
            android.content.Context r8 = r19.getContext()
            r11 = 2
            int r8 = kg3.C76577a.m92151b(r8, r11)
            android.content.Context r11 = r19.getContext()
            r7 = 4
            int r7 = kg3.C76577a.m92151b(r11, r7)
            r15.<init>(r6, r0, r8, r7)
            il1.u3 r0 = new il1.u3
            r0.<init>(r14, r1)
            r15.setOnClickListener(r0)
            java.util.Map<te3.p11, jl1.d> r0 = r1.f28578r
            r0.put(r14, r15)
            android.content.Context r0 = r19.getContext()
            r6 = 28
            int r0 = kg3.C76577a.m92151b(r0, r6)
            android.widget.LinearLayout r6 = r1.f28577q
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r0, r0)
            r0 = 22
            android.content.Context r8 = r19.getContext()
            if (r12 != 0) goto L_0x02b4
            int r8 = kg3.C76577a.m92151b(r8, r0)
            goto L_0x02ba
        L_0x02b4:
            r11 = 14
            int r8 = kg3.C76577a.m92151b(r8, r11)
        L_0x02ba:
            r7.leftMargin = r8
            te3.fy0 r8 = r1.f28584x
            if (r8 == 0) goto L_0x02cc
            java.util.LinkedList<te3.p11> r8 = r8.f133738h
            if (r8 == 0) goto L_0x02cc
            int r8 = r8.size()
            r16 = r8
            r8 = 1
            goto L_0x02cf
        L_0x02cc:
            r8 = 1
            r16 = 0
        L_0x02cf:
            int r11 = r16 + -1
            if (r12 != r11) goto L_0x02dd
            android.content.Context r11 = r19.getContext()
            int r0 = kg3.C76577a.m92151b(r11, r0)
            r7.rightMargin = r0
        L_0x02dd:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r6.addView(r15, r7)
            r12 = r13
            r7 = 1
            r8 = 0
            r11 = 2
            goto L_0x020b
        L_0x02e8:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x02ed:
            java.lang.String r0 = "selectGift default"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r1.mo9875g(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9048l3.mo9878h(qo3.w, te3.fy0, te3.p11, te3.n10):void");
    }

    /* renamed from: i */
    public final void mo9879i(boolean z) {
        Log.m105924i("Finder.FinderLiveFansModifyGiftWidget", "updateConfirmBtn canConfirm:" + z);
        this.f28581u.setEnabled(z);
        C62042e eVar = C62042e.f176370a;
        TextView textView = this.f28581u;
        C87412m.m108593f(textView, "confirmBtn");
        eVar.mo87025M1(textView, z, true);
    }

    public final void setBackClickListener(C32224a<C13598b0> aVar) {
        this.f28571h = aVar;
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f28572i = view;
    }
}
