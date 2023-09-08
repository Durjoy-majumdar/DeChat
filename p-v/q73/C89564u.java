package q73;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import nj3.C76901s0;
import o40.C61926c;
import r73.C47930c;
import r73.C89894f;
import r73.C89902q;

/* renamed from: q73.u */
public final class C89564u implements C89902q {

    /* renamed from: d */
    public final C89566v f257737d;

    /* renamed from: e */
    public final C89547f f257738e;

    /* renamed from: f */
    public final String f257739f = "MicroMsg.WebCanvasPopupContext";

    /* renamed from: g */
    public C89565a f257740g;

    /* renamed from: q73.u$a */
    public static final class C89565a extends C76901s0 implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        public final String f257741f;

        /* renamed from: g */
        public final int f257742g;

        /* renamed from: h */
        public final int f257743h;

        /* renamed from: i */
        public final int f257744i;

        /* renamed from: j */
        public final int f257745j;

        /* renamed from: n */
        public final int f257746n;

        /* renamed from: o */
        public final int f257747o;

        /* renamed from: p */
        public final String f257748p;

        /* renamed from: q */
        public final String f257749q;

        /* renamed from: r */
        public final WeakReference<C89564u> f257750r;

        /* renamed from: s */
        public final String f257751s;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
            r0 = (r0 = r0.f257737d).getView();
         */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C89565a(java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.ref.WeakReference<q73.C89564u> r11) {
            /*
                r1 = this;
                java.lang.String r0 = "popupId"
                gy3.C87412m.m108594g(r2, r0)
                java.lang.String r0 = "onDismissCallback"
                gy3.C87412m.m108594g(r9, r0)
                java.lang.String r0 = "onOuterClickCallback"
                gy3.C87412m.m108594g(r10, r0)
                java.lang.String r0 = "context"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.Object r0 = r11.get()
                q73.u r0 = (q73.C89564u) r0
                if (r0 == 0) goto L_0x002c
                q73.v r0 = r0.f257737d
                if (r0 == 0) goto L_0x002c
                android.view.View r0 = r0.getView()
                if (r0 == 0) goto L_0x002c
                android.content.Context r0 = r0.getContext()
                goto L_0x002d
            L_0x002c:
                r0 = 0
            L_0x002d:
                gy3.C87412m.m108591d(r0)
                r1.<init>((android.content.Context) r0)
                r1.f257741f = r2
                r1.f257742g = r3
                r1.f257743h = r4
                r1.f257744i = r5
                r1.f257745j = r6
                r1.f257746n = r7
                r1.f257747o = r8
                r1.f257748p = r9
                r1.f257749q = r10
                r1.f257750r = r11
                java.lang.String r2 = "MicroMsg.CanvasPopup"
                r1.f257751s = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q73.C89564u.C89565a.<init>(java.lang.String, int, int, int, int, int, int, java.lang.String, java.lang.String, java.lang.ref.WeakReference):void");
        }

        public void dismiss() {
            String str = this.f257751s;
            Log.m105924i(str, "popup on dismiss:" + this.f257741f);
            C89564u uVar = this.f257750r.get();
            if (uVar != null) {
                View view = uVar.f257737d.getView();
                if (view != null) {
                    view.removeOnAttachStateChangeListener(this);
                }
                C47930c.C47931a.m53253a(uVar.f257738e, this.f257748p, (String) null, (ValueCallback) null, 6, (Object) null);
                C89547f fVar = uVar.f257738e;
                fVar.getClass();
                fVar.f257704K = "none";
                uVar.f257740g = null;
            }
            super.dismiss();
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            dismiss();
        }
    }

    public C89564u(C89566v vVar, C89547f fVar) {
        C87412m.m108594g(vVar, "popupTarget");
        C87412m.m108594g(fVar, "logicJsEngine");
        this.f257737d = vVar;
        this.f257738e = fVar;
    }

    /* renamed from: A */
    public void mo123878A(String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3) {
        char c;
        Integer[] numArr;
        C89566v vVar;
        String str4 = str;
        C87412m.m108594g(str4, "popupId");
        C87412m.m108594g(str2, "onDismissCallback");
        C87412m.m108594g(str3, "onOuterClickCallback");
        View view = this.f257737d.getView();
        if (!(view != null && view.isAttachedToWindow())) {
            String str5 = this.f257739f;
            Log.m105928w(str5, "skip popup when canvasView detached:" + str4);
            C47930c.C47931a.m53253a(this.f257738e, str2, (String) null, (ValueCallback) null, 6, (Object) null);
            return;
        }
        C89565a aVar = this.f257740g;
        if (aVar != null) {
            aVar.dismiss();
        }
        C89565a aVar2 = r1;
        C89565a aVar3 = new C89565a(str, i, i2, i3, i4, i5, i6, str2, str3, new WeakReference(this));
        C89564u uVar = aVar2.f257750r.get();
        View view2 = (uVar == null || (vVar = uVar.f257737d) == null) ? null : vVar.getView();
        C87412m.m108591d(view2);
        int[] n = C61926c.m72689n(view2);
        int i7 = n[0] + aVar2.f257744i;
        n[0] = i7;
        int i8 = n[1] + aVar2.f257745j;
        n[1] = i8;
        String str6 = aVar2.f257751s;
        Log.m105918d(str6, "popup:" + aVar2.f257741f + " start locate:[" + aVar2.f257744i + ", " + aVar2.f257745j + "] offset:[" + i7 + ", " + i8 + "] size:[" + aVar2.f257742g + ", " + aVar2.f257743h + "] mode:" + aVar2.f257746n);
        int i9 = aVar2.f257746n;
        boolean z = (i9 & 1) != 0;
        boolean z2 = (i9 & 2) != 0;
        if (z) {
            c = 1;
            numArr = new Integer[]{0, 0, -1, -1};
        } else {
            c = 1;
            numArr = new Integer[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(aVar2.f257742g), Integer.valueOf(aVar2.f257743h)};
        }
        int intValue = numArr[0].intValue();
        int intValue2 = numArr[c].intValue();
        int intValue3 = numArr[2].intValue();
        int intValue4 = numArr[3].intValue();
        String str7 = aVar2.f257751s;
        Log.m105924i(str7, "popup:" + aVar2.f257741f + " compute locate:[" + intValue + ", " + intValue2 + "] size:[" + intValue3 + ", " + intValue4 + ']');
        C89564u uVar2 = aVar2.f257750r.get();
        C89547f fVar = uVar2 != null ? uVar2.f257738e : null;
        C87412m.m108591d(fVar);
        C89567w S1 = fVar.mo118087S1();
        Context context = view2.getContext();
        if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) context).getBaseContext();
        }
        C87412m.m108593f(context, "viewContext");
        C89538a R1 = S1.mo123885R1(context, aVar2.f257741f, false, false);
        if (R1.f257664h == null) {
            C89558k0 k0Var = new C89558k0(R1, new MutableContextWrapper(context));
            R1.f257664h = k0Var;
            k0Var.mo123871a();
        }
        ViewGroup g = R1.mo123840g();
        C87412m.m108591d(g);
        ViewParent parent = g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(g);
        }
        if (z) {
            ViewGroup relativeLayout = new RelativeLayout(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(aVar2.f257742g, aVar2.f257743h);
            layoutParams.setMargins(i7, i8 - 0, 0, 0);
            g.setLayoutParams(layoutParams);
            relativeLayout.setOnClickListener(new C89563t(z2, fVar, aVar2));
            relativeLayout.setBackground(new ColorDrawable(aVar2.f257747o));
            relativeLayout.setSystemUiVisibility(1284);
            relativeLayout.addView(g);
            g = relativeLayout;
        }
        aVar2.setContentView(g);
        aVar2.setWidth(intValue3);
        aVar2.setHeight(intValue4);
        if (!z) {
            aVar2.setTouchable(true);
        }
        aVar2.setClippingEnabled(false);
        view2.addOnAttachStateChangeListener(aVar2);
        aVar2.showAtLocation(view2, 0, intValue, intValue2);
        this.f257740g = aVar2;
        C89547f fVar2 = this.f257738e;
        fVar2.getClass();
        fVar2.f257704K = str;
    }

    /* renamed from: B */
    public void mo123879B(String str) {
        C87412m.m108594g(str, "popupId");
        String str2 = this.f257739f;
        Log.m105924i(str2, "precreate:" + str);
        this.f257738e.mo118087S1().mo123885R1(C89894f.f258347d.mo124202b(), str, false, false);
    }

    /* renamed from: N0 */
    public void mo123880N0(String str) {
        C87412m.m108594g(str, "popupId");
        C89565a aVar = this.f257740g;
        if (aVar != null) {
            if (!C87412m.m108589b(aVar.f257741f, str)) {
                aVar = null;
            }
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }
}
