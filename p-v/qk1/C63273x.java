package qk1;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import cj1.C54785k6;
import gy3.C87412m;
import qk1.C63257t;
import z04.C112550d0;

/* renamed from: qk1.x */
public final class C63273x implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ int f179579d;

    /* renamed from: e */
    public final /* synthetic */ C63257t f179580e;

    /* renamed from: f */
    public final /* synthetic */ C63257t.C63258a f179581f;

    /* renamed from: g */
    public final /* synthetic */ EditText f179582g;

    /* renamed from: qk1.x$a */
    public static final class C63274a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditText f179583d;

        /* renamed from: e */
        public final /* synthetic */ C63257t f179584e;

        public C63274a(EditText editText, C63257t tVar) {
            this.f179583d = editText;
            this.f179584e = tVar;
        }

        public final void run() {
            this.f179583d.clearFocus();
            C63257t tVar = this.f179584e;
            int i = tVar.f179514q;
            tVar.notifyItemChanged(i, Integer.valueOf(i));
        }
    }

    /* renamed from: qk1.x$b */
    public static final class C63275b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f179585d;

        /* renamed from: e */
        public final /* synthetic */ C63257t f179586e;

        /* renamed from: f */
        public final /* synthetic */ C63257t.C63258a f179587f;

        /* renamed from: qk1.x$b$a */
        public static final class C63276a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C63257t.C63258a f179588d;

            public C63276a(C63257t.C63258a aVar) {
                this.f179588d = aVar;
            }

            public final void run() {
                Object systemService = this.f179588d.f179523D.getContext().getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(this.f179588d.f179523D, 2);
            }
        }

        public C63275b(int i, C63257t tVar, C63257t.C63258a aVar) {
            this.f179585d = i;
            this.f179586e = tVar;
            this.f179587f = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
            r1 = r7.f179586e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                int r0 = r7.f179585d
                qk1.t r1 = r7.f179586e
                int r2 = r1.f179514q
                int r2 = r0 - r2
                r1.f179514q = r0
                r0 = 2
                int[] r1 = new int[r0]
                qk1.t$a r3 = r7.f179587f
                android.view.View r3 = r3.f44854d
                r3.getLocationInWindow(r1)
                qk1.t r3 = r7.f179586e
                fy3.q<? super java.lang.Integer, ? super java.lang.Boolean, ? super java.lang.Integer, rx3.b0> r3 = r3.f179511n
                r4 = 1
                if (r3 == 0) goto L_0x0039
                r1 = r1[r4]
                qk1.t$a r5 = r7.f179587f
                android.widget.EditText r5 = r5.f179523D
                int r5 = r5.getHeight()
                int r1 = r1 + r5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                qk1.t r5 = r7.f179586e
                boolean r5 = r5.f179516s
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.invoke(r1, r5, r2)
            L_0x0039:
                int r1 = r7.f179585d
                qk1.t r2 = r7.f179586e
                java.util.ArrayList<cj1.k6> r2 = r2.f179507g
                int r2 = r2.size()
                int r2 = r2 - r0
                if (r1 != r2) goto L_0x005a
                qk1.t r1 = r7.f179586e
                fy3.l<? super java.lang.Integer, rx3.b0> r2 = r1.f179512o
                if (r2 == 0) goto L_0x005a
                java.util.ArrayList<cj1.k6> r1 = r1.f179507g
                int r1 = r1.size()
                int r1 = r1 - r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r2.invoke(r0)
            L_0x005a:
                qk1.t$a r0 = r7.f179587f
                android.widget.EditText r1 = r0.f179523D
                qk1.x$b$a r2 = new qk1.x$b$a
                r2.<init>(r0)
                r5 = 300(0x12c, double:1.48E-321)
                r1.postDelayed(r2, r5)
                qk1.t r0 = r7.f179586e
                r0.f179516s = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qk1.C63273x.C63275b.run():void");
        }
    }

    public C63273x(int i, C63257t tVar, C63257t.C63258a aVar, EditText editText) {
        this.f179579d = i;
        this.f179580e = tVar;
        this.f179581f = aVar;
        this.f179582g = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view.hasFocus()) {
            int i = this.f179579d;
            C63257t tVar = this.f179580e;
            if (i != tVar.f179514q) {
                Context context = this.f179581f.f179523D.getContext();
                C87412m.m108593f(context, "holder.musicNameEt.context");
                if (!tVar.mo88161F4(context)) {
                    C63257t tVar2 = this.f179580e;
                    if (tVar2.f179514q >= 0 && tVar2.f179517t) {
                        tVar2.f179517t = false;
                        view.post(new C63274a(this.f179582g, tVar2));
                        return;
                    }
                }
            }
            this.f179581f.f179521B.setVisibility(0);
            C63257t.C63258a aVar = this.f179581f;
            aVar.f44854d.post(new C63275b(this.f179579d, this.f179580e, aVar));
            return;
        }
        C54785k6 k6Var = this.f179580e.f179507g.get(this.f179579d);
        String obj = C112550d0.m153799i0(this.f179582g.getText().toString()).toString();
        k6Var.getClass();
        C87412m.m108594g(obj, "<set-?>");
        k6Var.f153566a = obj;
        this.f179581f.f179521B.setVisibility(8);
    }
}
