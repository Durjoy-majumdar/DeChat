package n91;

import android.view.MotionEvent;
import gy3.C87412m;
import j20.C21152b;
import j20.C21153d;
import z04.C112550d0;

/* renamed from: n91.a */
public final class C21608a {

    /* renamed from: e */
    public static boolean f61182e;

    /* renamed from: a */
    public C21613c f61183a;

    /* renamed from: b */
    public int f61184b = -1;

    /* renamed from: c */
    public final C21609a f61185c = new C21609a(this);

    /* renamed from: d */
    public final C21610b f61186d = new C21610b(this);

    /* renamed from: n91.a$a */
    public static final class C21609a implements C21152b {

        /* renamed from: a */
        public final /* synthetic */ C21608a f61187a;

        public C21609a(C21608a aVar) {
            this.f61187a = aVar;
        }

        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            C21608a aVar = this.f61187a;
            Boolean bool = null;
            boolean z = false;
            MotionEvent motionEvent = objArr != null ? objArr[0] : null;
            C87412m.m108592e(motionEvent, "null cannot be cast to non-null type android.view.MotionEvent");
            aVar.f61184b = motionEvent.getAction();
            C21608a aVar2 = this.f61187a;
            if (aVar2.f61184b == 0) {
                aVar2.getClass();
                if (str != null) {
                    bool = Boolean.valueOf(C112550d0.m153801u(str, "$OnTouchListener", false));
                }
                if (bool != null && bool.booleanValue() && C87412m.m108589b(str2, "onTouch") && C87412m.m108589b(str3, "(Landroid/view/View;Landroid/view/MotionEvent;)Z")) {
                    z = true;
                }
                C21608a.f61182e = z;
            }
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
            if (this.f61187a.f61184b == 0) {
                Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                if (bool != null) {
                    bool.booleanValue();
                    C21608a.f61182e = bool.booleanValue();
                }
            }
        }
    }

    /* renamed from: n91.a$b */
    public static final class C21610b implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C21608a f61188a;

        public C21610b(C21608a aVar) {
            this.f61188a = aVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo32410b(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Object r9, java.lang.Object[] r10) {
            /*
                r5 = this;
                r6 = 0
                if (r10 == 0) goto L_0x00b1
                int r8 = r10.length
                r10 = 1
                if (r8 != 0) goto L_0x0009
                r8 = 1
                goto L_0x000a
            L_0x0009:
                r8 = 0
            L_0x000a:
                if (r8 != 0) goto L_0x00b1
                boolean r8 = r9 instanceof android.view.View
                if (r8 != 0) goto L_0x0012
                goto L_0x00b1
            L_0x0012:
                n91.g$a r8 = n91.C117615g.f351847a
                r0 = r9
                android.view.View r0 = (android.view.View) r0
                java.lang.String r1 = r8.mo182335b(r0)
                if (r1 != 0) goto L_0x0020
                n91.C21608a.f61182e = r6
                return
            L_0x0020:
                int r6 = r0.getId()
                r2 = -1
                if (r6 != r2) goto L_0x002b
                java.lang.String r1 = r8.mo182336c(r0)
            L_0x002b:
                int r6 = r0.getId()
                if (r6 != r2) goto L_0x0033
                r6 = r1
                goto L_0x0041
            L_0x0033:
                int r6 = r0.getId()
                java.lang.String r6 = e91.C116711b.m164594s(r6)
                java.lang.String r8 = "toHexString(caller.id)"
                gy3.C87412m.m108593f(r6, r8)
            L_0x0041:
                n91.a r8 = r5.f61188a
                java.lang.Class r9 = r9.getClass()
                java.lang.String r9 = r9.getName()
                r8.getClass()
                te3.xr4 r0 = new te3.xr4
                r0.<init>()
                r0.f354548e = r1
                r0.f354547d = r6
                long r3 = java.lang.System.currentTimeMillis()
                r0.f354555o = r3
                java.lang.String r6 = e91.C116711b.m164583h(r9)
                r0.f354549f = r6
                r0.f354551h = r6
                if (r7 == 0) goto L_0x00a2
                int r6 = r7.hashCode()
                switch(r6) {
                    case -1263341865: goto L_0x0095;
                    case -1236836200: goto L_0x0089;
                    case -836949261: goto L_0x007c;
                    case 83417096: goto L_0x006f;
                    default: goto L_0x006e;
                }
            L_0x006e:
                goto L_0x00a2
            L_0x006f:
                java.lang.String r6 = "onLongPress"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0078
                goto L_0x00a2
            L_0x0078:
                r6 = 2
                r0.f354552i = r6
                goto L_0x00a4
            L_0x007c:
                java.lang.String r6 = "onDoubleTap"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0085
                goto L_0x00a2
            L_0x0085:
                r6 = 3
                r0.f354552i = r6
                goto L_0x00a4
            L_0x0089:
                java.lang.String r6 = "onContextClick"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0092
                goto L_0x00a2
            L_0x0092:
                r0.f354552i = r10
                goto L_0x00a4
            L_0x0095:
                java.lang.String r6 = "onSingleTapUp"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x009f
                goto L_0x00a2
            L_0x009f:
                r0.f354552i = r10
                goto L_0x00a4
            L_0x00a2:
                r0.f354552i = r2
            L_0x00a4:
                int r6 = r0.f354552i
                if (r6 == r2) goto L_0x00b0
                n91.c r6 = r8.f61183a
                if (r6 == 0) goto L_0x00b0
                r7 = 0
                r6.mo33861a(r7, r0)
            L_0x00b0:
                return
            L_0x00b1:
                n91.C21608a.f61182e = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n91.C21608a.C21610b.mo32410b(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[]):void");
        }
    }
}
