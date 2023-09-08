package ro3;

import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Magnifier;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import vo3.C78461f;

/* renamed from: ro3.j */
public class C110588j {

    /* renamed from: A */
    public final boolean f330800A;

    /* renamed from: B */
    public final boolean f330801B;

    /* renamed from: C */
    public boolean f330802C;

    /* renamed from: D */
    public boolean f330803D;

    /* renamed from: E */
    public int f330804E;

    /* renamed from: F */
    public int f330805F;

    /* renamed from: G */
    public int f330806G;

    /* renamed from: H */
    public Map<Integer, CharSequence> f330807H;

    /* renamed from: I */
    public int[] f330808I;

    /* renamed from: J */
    public boolean f330809J;

    /* renamed from: K */
    public C110600w f330810K;

    /* renamed from: L */
    public Menu f330811L;

    /* renamed from: M */
    public boolean f330812M;

    /* renamed from: N */
    public int f330813N;

    /* renamed from: O */
    public final ActionMode.Callback f330814O;

    /* renamed from: P */
    public int f330815P;

    /* renamed from: Q */
    public final Runnable f330816Q;

    /* renamed from: R */
    public boolean f330817R;

    /* renamed from: S */
    public final long f330818S;

    /* renamed from: T */
    public final boolean f330819T;

    /* renamed from: U */
    public C110579c f330820U;

    /* renamed from: V */
    public final Runnable f330821V;

    /* renamed from: W */
    public final int f330822W;

    /* renamed from: X */
    public float f330823X;

    /* renamed from: Y */
    public float f330824Y;

    /* renamed from: Z */
    public float f330825Z;

    /* renamed from: a */
    public final C77559a f330826a;

    /* renamed from: b */
    public C110575a f330827b;

    /* renamed from: c */
    public C110575a f330828c;

    /* renamed from: d */
    public C110577b f330829d;

    /* renamed from: e */
    public C110584g f330830e;

    /* renamed from: f */
    public C110591d f330831f = new C110591d();

    /* renamed from: g */
    public Context f330832g;

    /* renamed from: h */
    public TextView f330833h;

    /* renamed from: i */
    public Spannable f330834i;

    /* renamed from: j */
    public ViewTreeObserver.OnPreDrawListener f330835j;

    /* renamed from: k */
    public ViewTreeObserver.OnScrollChangedListener f330836k;

    /* renamed from: l */
    public View.OnAttachStateChangeListener f330837l;

    /* renamed from: m */
    public View.OnLayoutChangeListener f330838m;

    /* renamed from: n */
    public TextWatcher f330839n;

    /* renamed from: o */
    public View.OnLongClickListener f330840o;

    /* renamed from: p */
    public View.OnTouchListener f330841p;

    /* renamed from: q */
    public View.OnFocusChangeListener f330842q;

    /* renamed from: r */
    public View.OnClickListener f330843r;

    /* renamed from: s */
    public C110590c f330844s;

    /* renamed from: t */
    public final int f330845t;

    /* renamed from: u */
    public int f330846u;

    /* renamed from: v */
    public int f330847v;

    /* renamed from: w */
    public boolean f330848w;

    /* renamed from: x */
    public boolean f330849x;

    /* renamed from: y */
    public int f330850y;

    /* renamed from: z */
    public boolean f330851z;

    /* renamed from: ro3.j$a */
    public static final class C77559a {

        /* renamed from: a */
        public final TextView f226116a;

        /* renamed from: b */
        public int f226117b = C0966R.color.f3274lt;

        /* renamed from: c */
        public int f226118c = C0966R.color.aak;

        /* renamed from: d */
        public float f226119d = 18.0f;

        /* renamed from: e */
        public boolean f226120e = true;

        /* renamed from: f */
        public String f226121f;

        /* renamed from: g */
        public String f226122g;

        /* renamed from: h */
        public boolean f226123h;

        /* renamed from: i */
        public C78461f f226124i;

        /* renamed from: ro3.j$a$a */
        public interface C77560a {
            /* renamed from: a */
            C77559a mo97976a(C77559a aVar);
        }

        public C77559a(TextView textView) {
            C87412m.m108594g(textView, "mTextView");
            this.f226116a = textView;
        }
    }

    /* renamed from: ro3.j$c */
    public interface C110590c {
        /* renamed from: a */
        void mo14785a(List<C110589b> list, int i);

        /* renamed from: b */
        void mo14786b(View view, C110589b bVar, String str);
    }

    /* renamed from: ro3.j$d */
    public static final class C110591d {

        /* renamed from: a */
        public int f330855a;

        /* renamed from: b */
        public int f330856b;

        /* renamed from: c */
        public String f330857c;
    }

    /* renamed from: ro3.j$e */
    public static final class C110592e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110588j f330858d;

        public C110592e(C110588j jVar) {
            this.f330858d = jVar;
        }

        public final void run() {
            this.f330858d.mo162135d();
        }
    }

    /* renamed from: ro3.j$f */
    public static final class C110593f implements ActionMode.Callback {
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            C87412m.m108594g(actionMode, "mode");
            C87412m.m108594g(menuItem, "item");
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            C87412m.m108594g(actionMode, "mode");
            C87412m.m108594g(menu, "menu");
            C85975v4.m106304a("SelectableEditTextHelper", "mDisableCallback", new Object[0]);
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            C87412m.m108594g(actionMode, "mode");
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            C87412m.m108594g(actionMode, "mode");
            C87412m.m108594g(menu, "menu");
            return false;
        }
    }

    /* renamed from: ro3.j$g */
    public static final class C110594g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110588j f330859d;

        public C110594g(C110588j jVar) {
            this.f330859d = jVar;
        }

        public final void run() {
            C110588j jVar = this.f330859d;
            jVar.mo162142s(jVar.f330813N);
            C110588j jVar2 = this.f330859d;
            jVar2.f330813N = 0;
            jVar2.f330848w = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ad, code lost:
        if ((!android.text.TextUtils.isEmpty(r5) && r5.equalsIgnoreCase("blackshark")) != false) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d4 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110588j(ro3.C110588j.C77559a r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "mBuilder"
            gy3.C87412m.m108594g(r1, r2)
            r16.<init>()
            r0.f330826a = r1
            ro3.j$d r2 = new ro3.j$d
            r2.<init>()
            r0.f330831f = r2
            r2 = 1
            r0.f330849x = r2
            boolean r3 = r1.f226123h
            r0.f330800A = r3
            r3 = r3 ^ r2
            r0.f330801B = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.f330807H = r3
            r3 = 2
            int[] r4 = new int[r3]
            r0.f330808I = r4
            ro3.j$f r4 = new ro3.j$f
            r4.<init>()
            r0.f330814O = r4
            r4 = -1
            r0.f330815P = r4
            ro3.j$g r5 = new ro3.j$g
            r5.<init>(r0)
            r0.f330816Q = r5
            android.widget.TextView r5 = r1.f226116a
            r0.f330833h = r5
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "mTextView.context"
            gy3.C87412m.m108593f(r5, r6)
            r0.f330832g = r5
            android.content.res.Resources r5 = r5.getResources()
            int r6 = r1.f226118c
            int r5 = r5.getColor(r6)
            r0.f330845t = r5
            android.content.Context r5 = r0.f330832g
            android.content.res.Resources r5 = r5.getResources()
            int r6 = r1.f226117b
            int r5 = r5.getColor(r6)
            r0.f330846u = r5
            android.content.Context r5 = r0.f330832g
            float r6 = r1.f226119d
            int r6 = (int) r6
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r6)
            r0.f330847v = r5
            android.widget.TextView r5 = r0.f330833h
            boolean r6 = r5 instanceof com.tencent.neattextview.textview.view.NeatTextView
            r7 = 0
            if (r6 == 0) goto L_0x007e
            com.tencent.neattextview.textview.view.NeatTextView r5 = (com.tencent.neattextview.textview.view.NeatTextView) r5
            int r5 = r5.getLineHeight()
            goto L_0x0088
        L_0x007e:
            boolean r6 = r5 instanceof android.widget.TextView
            if (r6 == 0) goto L_0x0087
            int r5 = r5.getLineHeight()
            goto L_0x0088
        L_0x0087:
            r5 = 0
        L_0x0088:
            r0.f330850y = r5
            boolean r5 = r1.f226120e
            r0.f330851z = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r5 < r6) goto L_0x00b1
            boolean r5 = com.tencent.p014mm.p136ui.C75054z4.m90006d()
            if (r5 != 0) goto L_0x00af
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00ac
            java.lang.String r6 = "blackshark"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x00ac
            r5 = 1
            goto L_0x00ad
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            if (r5 == 0) goto L_0x00b1
        L_0x00af:
            r5 = 1
            goto L_0x00b2
        L_0x00b1:
            r5 = 0
        L_0x00b2:
            r0.f330809J = r5
            java.lang.String r1 = r1.f226122g
            ro3.w r5 = new ro3.w
            r5.<init>()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            r6.<init>(r1)     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = "sysMenuConfig"
            org.json.JSONObject r1 = r6.optJSONObject(r1)     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x0147
            java.util.Iterator r6 = r1.keys()     // Catch:{ all -> 0x0146 }
            if (r6 == 0) goto L_0x0147
        L_0x00ce:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0147
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0146 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0146 }
            org.json.JSONArray r9 = r1.optJSONArray(r8)     // Catch:{ all -> 0x0146 }
            if (r9 == 0) goto L_0x00ce
            int r10 = r9.length()     // Catch:{ all -> 0x0146 }
            r11 = 0
        L_0x00e5:
            if (r11 >= r10) goto L_0x00ce
            org.json.JSONObject r12 = r9.optJSONObject(r11)     // Catch:{ all -> 0x0146 }
            if (r12 == 0) goto L_0x0141
            java.lang.String r13 = "idName"
            java.lang.String r13 = r12.optString(r13)     // Catch:{ all -> 0x0146 }
            java.lang.String r14 = ""
            if (r13 != 0) goto L_0x00f8
            r13 = r14
        L_0x00f8:
            java.lang.String r15 = "idPackage"
            java.lang.String r15 = r12.optString(r15)     // Catch:{ all -> 0x0146 }
            if (r15 != 0) goto L_0x0101
            r15 = r14
        L_0x0101:
            java.lang.String r4 = "titleName"
            java.lang.String r4 = r12.optString(r4)     // Catch:{ all -> 0x0146 }
            if (r4 != 0) goto L_0x010a
            r4 = r14
        L_0x010a:
            java.lang.String r3 = "titlePackage"
            java.lang.String r3 = r12.optString(r3)     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r14 = r3
        L_0x0114:
            ro3.w$a r3 = new ro3.w$a     // Catch:{ all -> 0x0146 }
            r3.<init>(r13, r15, r4, r14)     // Catch:{ all -> 0x0146 }
            java.util.HashMap<java.lang.String, java.util.List<ro3.w$a>> r4 = r5.f330865a     // Catch:{ all -> 0x0146 }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ all -> 0x0146 }
            if (r4 != 0) goto L_0x0134
            java.util.HashMap<java.lang.String, java.util.List<ro3.w$a>> r4 = r5.f330865a     // Catch:{ all -> 0x0146 }
            java.lang.String r12 = "key"
            gy3.C87412m.m108593f(r8, r12)     // Catch:{ all -> 0x0146 }
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ all -> 0x0146 }
            r12.<init>()     // Catch:{ all -> 0x0146 }
            r12.add(r3)     // Catch:{ all -> 0x0146 }
            r4.put(r8, r12)     // Catch:{ all -> 0x0146 }
            goto L_0x0141
        L_0x0134:
            java.util.HashMap<java.lang.String, java.util.List<ro3.w$a>> r4 = r5.f330865a     // Catch:{ all -> 0x0146 }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ all -> 0x0146 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0146 }
            if (r4 == 0) goto L_0x0141
            r4.add(r3)     // Catch:{ all -> 0x0146 }
        L_0x0141:
            int r11 = r11 + 1
            r3 = 2
            r4 = -1
            goto L_0x00e5
        L_0x0146:
        L_0x0147:
            r0.f330810K = r5
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            boolean r3 = r0.f330851z
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1[r7] = r3
            ro3.j$a r3 = r0.f330826a
            java.lang.String r3 = r3.f226121f
            r1[r2] = r3
            java.lang.String r3 = android.os.Build.BRAND
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "SelectableEditTextHelper"
            java.lang.String r4 = "init %s,%s,%s"
            com.tencent.p014mm.p136ui.C85975v4.m106306c(r3, r4, r1)
            android.widget.TextView r1 = r0.f330833h
            ro3.n r3 = new ro3.n
            r3.<init>(r0)
            r1.setOnKeyListener(r3)
            android.widget.TextView r1 = r0.f330833h
            java.lang.CharSequence r3 = r1.getText()
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE
            r1.setText(r3, r4)
            android.widget.TextView r1 = r0.f330833h
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r3 = "null cannot be cast to non-null type android.text.Spannable"
            gy3.C87412m.m108592e(r1, r3)
            android.text.Spannable r1 = (android.text.Spannable) r1
            r0.f330834i = r1
            android.widget.TextView r1 = r0.f330833h
            ro3.o r3 = new ro3.o
            r3.<init>(r0)
            r1.setOnLongClickListener(r3)
            android.widget.TextView r1 = r0.f330833h
            ro3.p r3 = new ro3.p
            r3.<init>(r0)
            r1.setOnTouchListener(r3)
            android.widget.TextView r1 = r0.f330833h
            ro3.q r3 = new ro3.q
            r3.<init>(r0)
            r1.setOnClickListener(r3)
            android.widget.TextView r1 = r0.f330833h
            ro3.r r3 = new ro3.r
            r3.<init>(r0)
            r1.setOnFocusChangeListener(r3)
            boolean r1 = r0.f330851z
            if (r1 != 0) goto L_0x01b7
            goto L_0x022d
        L_0x01b7:
            android.widget.TextView r1 = r0.f330833h
            android.view.ActionMode$Callback r3 = r0.f330814O
            r1.setCustomSelectionActionModeCallback(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x01cb
            android.widget.TextView r1 = r0.f330833h
            android.view.ActionMode$Callback r3 = r0.f330814O
            r1.setCustomInsertionActionModeCallback(r3)
        L_0x01cb:
            ro3.s r1 = new ro3.s
            r1.<init>(r0)
            r0.f330839n = r1
            ro3.t r1 = new ro3.t
            r1.<init>(r0)
            r0.f330837l = r1
            ro3.u r1 = new ro3.u
            r1.<init>(r0)
            r0.f330838m = r1
            ro3.v r1 = new ro3.v
            r1.<init>(r0)
            r0.f330835j = r1
            ro3.l r1 = new ro3.l
            r1.<init>(r0)
            r0.f330836k = r1
            boolean r1 = r0.f330800A
            if (r1 == 0) goto L_0x0202
            ro3.j$a r1 = r0.f330826a
            vo3.f r1 = r1.f226124i
            if (r1 == 0) goto L_0x0202
            ro3.m r3 = new ro3.m
            r3.<init>(r0)
            com.tencent.mm.ui.widget.pulldown.NestedBounceView r1 = (com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView) r1
            r1.mo154637e(r3)
        L_0x0202:
            android.widget.TextView r1 = r0.f330833h
            android.text.TextWatcher r3 = r0.f330839n
            r1.addTextChangedListener(r3)
            android.widget.TextView r1 = r0.f330833h
            android.view.View$OnAttachStateChangeListener r3 = r0.f330837l
            r1.addOnAttachStateChangeListener(r3)
            android.widget.TextView r1 = r0.f330833h
            android.view.View$OnLayoutChangeListener r3 = r0.f330838m
            r1.addOnLayoutChangeListener(r3)
            android.widget.TextView r1 = r0.f330833h
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r3 = r0.f330835j
            r1.addOnPreDrawListener(r3)
            android.widget.TextView r1 = r0.f330833h
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r3 = r0.f330836k
            r1.addOnScrollChangedListener(r3)
        L_0x022d:
            r3 = 4000(0xfa0, double:1.9763E-320)
            r0.f330818S = r3
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 < r3) goto L_0x0238
            goto L_0x0239
        L_0x0238:
            r2 = 0
        L_0x0239:
            r0.f330819T = r2
            ro3.j$e r1 = new ro3.j$e
            r1.<init>(r0)
            r0.f330821V = r1
            r1 = -1
            r0.f330822W = r1
            float r1 = (float) r1
            r0.f330823X = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ro3.C110588j.<init>(ro3.j$a):void");
    }

    /* renamed from: a */
    public void mo148755a() {
        mo148760m();
        if (!this.f330849x) {
            Selection.setSelection(this.f330833h.getEditableText(), this.f330833h.getSelectionEnd());
        }
        mo148759l();
        this.f330833h.setCursorVisible(true);
    }

    /* renamed from: b */
    public final void mo162134b() {
        this.f330833h.removeTextChangedListener(this.f330839n);
        this.f330833h.removeOnAttachStateChangeListener(this.f330837l);
        this.f330833h.removeOnLayoutChangeListener(this.f330838m);
        this.f330833h.getViewTreeObserver().removeOnScrollChangedListener(this.f330836k);
        this.f330833h.getViewTreeObserver().removeOnPreDrawListener(this.f330835j);
        mo148760m();
        mo148759l();
        this.f330827b = null;
        this.f330828c = null;
        this.f330830e = null;
    }

    /* renamed from: c */
    public void mo148756c(C110575a aVar) {
        if (aVar != null) {
            aVar.f330740f.dismiss();
        }
    }

    /* renamed from: d */
    public final void mo162135d() {
        PopupWindow popupWindow;
        C110577b bVar = this.f330829d;
        if (bVar != null && (popupWindow = bVar.f330754e) != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: e */
    public void mo148757e(C110584g gVar) {
        if (gVar != null) {
            gVar.f330790b.dismiss();
        }
    }

    /* renamed from: f */
    public final int mo162136f() {
        C110584g gVar = this.f330830e;
        boolean z = false;
        boolean isShowing = gVar == null ? false : gVar.f330790b.isShowing();
        int i = C110575a.f330737u;
        C110575a aVar = this.f330827b;
        if (aVar == null ? false : aVar.f330740f.isShowing()) {
            isShowing |= true;
        }
        C110575a aVar2 = this.f330828c;
        if (aVar2 == null ? false : aVar2.f330740f.isShowing()) {
            isShowing |= true;
        }
        int i2 = C110577b.f330752A;
        C110577b bVar = this.f330829d;
        if (bVar != null) {
            z = bVar.getMWindow().isShowing();
        }
        return z ? isShowing | true ? 1 : 0 : isShowing ? 1 : 0;
    }

    /* renamed from: g */
    public final C110579c mo162137g() {
        if (this.f330819T && this.f330820U == null) {
            this.f330820U = new C110579c(new Magnifier(this.f330833h));
        }
        return this.f330820U;
    }

    /* renamed from: h */
    public final C110584g mo162138h() {
        C110584g gVar = this.f330830e;
        if (gVar != null) {
            return gVar;
        }
        C110584g gVar2 = new C110584g(this, this.f330832g);
        this.f330830e = gVar2;
        return gVar2;
    }

    /* renamed from: i */
    public Runnable mo148758i() {
        return this.f330816Q;
    }

    /* renamed from: j */
    public final void mo162139j(boolean z) {
        if (!this.f330817R) {
            if (!z) {
                mo148755a();
                return;
            }
            if (this.f330829d == null) {
                this.f330829d = new C110577b(this, this.f330832g);
            }
            C110575a aVar = this.f330827b;
            if (aVar != null) {
                aVar.f330740f.dismiss();
            }
            C110575a aVar2 = this.f330828c;
            if (aVar2 != null) {
                aVar2.f330740f.dismiss();
            }
            int selectionStart = this.f330833h.getSelectionStart();
            if (!this.f330849x) {
                mo148755a();
            } else if (this.f330815P != selectionStart) {
                mo148755a();
            } else {
                mo148764r(this.f330804E, this.f330805F, false);
                this.f330815P = selectionStart;
            }
            this.f330833h.setCursorVisible(true);
            this.f330815P = selectionStart;
            mo162141p(this.f330829d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003b, code lost:
        if ((r3 != null && r3.f330746o) != false) goto L_0x003d;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162140k() {
        /*
            r4 = this;
            boolean r0 = r4.f330800A
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r4.mo162136f()
            boolean r1 = r4.f330848w
            if (r1 != 0) goto L_0x0058
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            if (r3 == 0) goto L_0x0058
            ro3.b r3 = r4.f330829d
            if (r3 == 0) goto L_0x0020
            boolean r3 = r3.f330764r
            if (r3 != r2) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r3 != 0) goto L_0x003d
            ro3.a r3 = r4.f330827b
            if (r3 == 0) goto L_0x002d
            boolean r3 = r3.f330746o
            if (r3 != r2) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            if (r3 != 0) goto L_0x003d
            ro3.a r3 = r4.f330828c
            if (r3 == 0) goto L_0x003a
            boolean r3 = r3.f330746o
            if (r3 != r2) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 == 0) goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            if (r1 != 0) goto L_0x0058
            r4.f330813N = r0
            r4.f330848w = r2
            ro3.g r0 = r4.mo162138h()
            r4.mo148757e(r0)
            ro3.a r0 = r4.f330827b
            r4.mo148756c(r0)
            ro3.a r0 = r4.f330828c
            r4.mo148756c(r0)
            r4.mo162135d()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ro3.C110588j.mo162140k():void");
    }

    /* renamed from: l */
    public void mo148759l() {
        this.f330849x = true;
        mo148756c(this.f330827b);
        mo148756c(this.f330828c);
        mo148757e(this.f330830e);
        mo162135d();
    }

    /* renamed from: m */
    public void mo148760m() {
        this.f330831f.f330857c = null;
    }

    /* renamed from: n */
    public void mo148761n(int i, int i2) {
        if (i != -1) {
            this.f330831f.f330855a = i;
        }
        if (i2 != -1) {
            this.f330831f.f330856b = i2;
        }
        C110591d dVar = this.f330831f;
        int i3 = dVar.f330855a;
        int i4 = dVar.f330856b;
        if (i3 > i4) {
            dVar.f330855a = i4;
            dVar.f330856b = i3;
        }
        Spannable spannable = this.f330834i;
        if (spannable != null) {
            try {
                int length = this.f330833h.getText().length();
                C110591d dVar2 = this.f330831f;
                int i5 = dVar2.f330855a;
                if (i5 <= length) {
                    int i6 = dVar2.f330856b;
                    if (i6 <= length) {
                        dVar2.f330857c = spannable.subSequence(i5, i6).toString();
                        this.f330833h.setHighlightColor(this.f330845t);
                        C110591d dVar3 = this.f330831f;
                        Selection.setSelection(spannable, dVar3.f330855a, dVar3.f330856b);
                    }
                }
            } catch (Throwable th) {
                C85975v4.m106307d("SelectableEditTextHelper", th, "select err", new Object[0]);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: o */
    public void mo148762o(C110575a aVar) {
        if (aVar != null) {
            try {
                Layout layout = this.f330833h.getLayout();
                int i = aVar.f330739e ? this.f330831f.f330855a : this.f330831f.f330856b;
                aVar.mo162070b((int) layout.getPrimaryHorizontal(i), layout.getLineBottom(layout.getLineForOffset(i)));
            } catch (Throwable th) {
                C85975v4.m106305b("SelectableEditTextHelper", "show cursor err：%s", Log.getStackTraceString(th));
            }
        }
    }

    /* renamed from: p */
    public final void mo162141p(C110577b bVar) {
        try {
            int selectionStart = this.f330833h.getSelectionStart();
            Layout layout = this.f330833h.getLayout();
            int primaryHorizontal = (int) layout.getPrimaryHorizontal(selectionStart);
            int lineBottom = layout.getLineBottom(layout.getLineForOffset(selectionStart));
            if (bVar != null) {
                bVar.mo162079a(primaryHorizontal, lineBottom);
            }
            this.f330833h.removeCallbacks(this.f330821V);
            this.f330833h.postDelayed(this.f330821V, this.f330818S);
        } catch (Throwable th) {
            C85975v4.m106307d("SelectableEditTextHelper", th, "showInsertionHandle err", new Object[0]);
        }
    }

    /* renamed from: q */
    public void mo148763q(C110584g gVar) {
        if (gVar != null) {
            try {
                gVar.mo162106a();
            } catch (Throwable th) {
                C85975v4.m106305b("SelectableEditTextHelper", "show oper err：%s", Log.getStackTraceString(th));
            }
        }
    }

    /* renamed from: r */
    public void mo148764r(int i, int i2, boolean z) {
        if (this.f330833h.getLayout() != null && this.f330833h.getWidth() != 0) {
            boolean z2 = true;
            if (this.f330827b == null) {
                this.f330827b = new C110575a(this, true);
            }
            if (this.f330828c == null) {
                this.f330828c = new C110575a(this, false);
            }
            int offsetForPosition = this.f330833h.getOffsetForPosition((float) i, (float) i2);
            if (!z) {
                offsetForPosition = this.f330833h.getSelectionStart();
            }
            int i3 = offsetForPosition + 1;
            if (this.f330833h.getText() instanceof Spannable) {
                CharSequence text = this.f330833h.getText();
                C87412m.m108592e(text, "null cannot be cast to non-null type android.text.Spannable");
                this.f330834i = (Spannable) text;
            }
            if (this.f330834i != null) {
                if (offsetForPosition >= this.f330833h.getText().length() || !z) {
                    z2 = false;
                }
                if (z2) {
                    this.f330833h.setCursorVisible(false);
                } else {
                    i3 = offsetForPosition;
                }
                if (!this.f330849x) {
                    C110591d dVar = this.f330831f;
                    if (dVar.f330855a == offsetForPosition && dVar.f330856b == i3) {
                        return;
                    }
                }
                mo148759l();
                mo148760m();
                this.f330849x = false;
                mo148761n(offsetForPosition, i3);
                if (z2) {
                    mo148762o(this.f330827b);
                    mo148762o(this.f330828c);
                    mo162135d();
                }
                mo148763q(mo162138h());
            }
        }
    }

    /* renamed from: s */
    public final void mo162142s(int i) {
        if ((i & 1) > 0) {
            mo148763q(mo162138h());
        }
        if ((i & 2) > 0) {
            mo148762o(this.f330827b);
        }
        if ((i & 4) > 0) {
            mo148762o(this.f330828c);
        }
        if ((i & 8) > 0) {
            mo162141p(this.f330829d);
        }
    }

    /* renamed from: ro3.j$b */
    public static final class C110589b {

        /* renamed from: a */
        public String f330852a;

        /* renamed from: b */
        public int f330853b;

        /* renamed from: c */
        public int f330854c;

        public C110589b(String str, int i, int i2) {
            C87412m.m108594g(str, "name");
            this.f330852a = str;
            this.f330853b = i;
            this.f330854c = i2;
        }

        public C110589b(String str, int i) {
            C87412m.m108594g(str, "name");
            this.f330852a = str;
            this.f330853b = i;
            this.f330854c = 15;
        }
    }
}
