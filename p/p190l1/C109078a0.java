package p190l1;

import android.os.SystemClock;
import android.view.MotionEvent;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p1166z0.C112539e;
import p631o1.C109857o;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: l1.a0 */
public final class C109078a0 implements C109118y {

    /* renamed from: d */
    public C32226l<? super MotionEvent, Boolean> f326639d;

    /* renamed from: e */
    public C109091e0 f326640e;

    /* renamed from: f */
    public boolean f326641f;

    /* renamed from: g */
    public final C109117x f326642g = new C109080b(this);

    /* renamed from: l1.a0$a */
    public enum C109079a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* renamed from: l1.a0$b */
    public static final class C109080b extends C109117x {

        /* renamed from: f */
        public C109079a f326647f = C109079a.Unknown;

        /* renamed from: g */
        public final /* synthetic */ C109078a0 f326648g;

        /* renamed from: l1.a0$b$a */
        public static final class C109081a extends C87413o implements C32226l<MotionEvent, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C109078a0 f326649d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109081a(C109078a0 a0Var) {
                super(1);
                this.f326649d = a0Var;
            }

            public Object invoke(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                C87412m.m108594g(motionEvent, "motionEvent");
                C32226l<? super MotionEvent, Boolean> lVar = this.f326649d.f326639d;
                if (lVar != null) {
                    lVar.invoke(motionEvent);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("onTouchEvent");
                throw null;
            }
        }

        /* renamed from: l1.a0$b$b */
        public static final class C109082b extends C87413o implements C32226l<MotionEvent, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C109080b f326650d;

            /* renamed from: e */
            public final /* synthetic */ C109078a0 f326651e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109082b(C109080b bVar, C109078a0 a0Var) {
                super(1);
                this.f326650d = bVar;
                this.f326651e = a0Var;
            }

            public Object invoke(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                C87412m.m108594g(motionEvent, "motionEvent");
                if (motionEvent.getActionMasked() == 0) {
                    C109080b bVar = this.f326650d;
                    C32226l<? super MotionEvent, Boolean> lVar = this.f326651e.f326639d;
                    if (lVar != null) {
                        bVar.f326647f = lVar.invoke(motionEvent).booleanValue() ? C109079a.Dispatching : C109079a.NotDispatching;
                    } else {
                        C87412m.m108603p("onTouchEvent");
                        throw null;
                    }
                } else {
                    C32226l<? super MotionEvent, Boolean> lVar2 = this.f326651e.f326639d;
                    if (lVar2 != null) {
                        lVar2.invoke(motionEvent);
                    } else {
                        C87412m.m108603p("onTouchEvent");
                        throw null;
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: l1.a0$b$c */
        public static final class C109083c extends C87413o implements C32226l<MotionEvent, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C109078a0 f326652d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C109083c(C109078a0 a0Var) {
                super(1);
                this.f326652d = a0Var;
            }

            public Object invoke(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                C87412m.m108594g(motionEvent, "motionEvent");
                C32226l<? super MotionEvent, Boolean> lVar = this.f326652d.f326639d;
                if (lVar != null) {
                    lVar.invoke(motionEvent);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("onTouchEvent");
                throw null;
            }
        }

        public C109080b(C109078a0 a0Var) {
            this.f326648g = a0Var;
        }

        /* renamed from: D */
        public final void mo160326D(C109106l lVar) {
            boolean z;
            C109079a aVar = C109079a.Dispatching;
            List<C109111s> list = lVar.f326709a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                } else if (list.get(i).mo160355b()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                if (this.f326647f == aVar) {
                    C109857o oVar = this.f326747d;
                    if (oVar != null) {
                        int i2 = C112539e.f336958e;
                        C109087c0.m148100a(lVar, oVar.mo161182v(C112539e.f336955b), new C109081a(this.f326648g), true);
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.f326647f = C109079a.NotDispatching;
                return;
            }
            C109857o oVar2 = this.f326747d;
            if (oVar2 != null) {
                int i3 = C112539e.f336958e;
                C109087c0.m148100a(lVar, oVar2.mo161182v(C112539e.f336955b), new C109082b(this, this.f326648g), false);
                if (this.f326647f == aVar) {
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        list.get(i4).mo160354a();
                    }
                    C109097g gVar = lVar.f326710b;
                    if (gVar != null) {
                        gVar.f326684c = !this.f326648g.f326641f;
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }

        /* renamed from: g */
        public void mo160327g() {
            if (this.f326647f == C109079a.Dispatching) {
                long uptimeMillis = SystemClock.uptimeMillis();
                C109083c cVar = new C109083c(this.f326648g);
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                obtain.setSource(0);
                cVar.invoke(obtain);
                obtain.recycle();
                this.f326647f = C109079a.Unknown;
                this.f326648g.f326641f = false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo160328i(p190l1.C109106l r7, p190l1.C109108n r8, long r9) {
            /*
                r6 = this;
                l1.n r9 = p190l1.C109108n.Final
                java.lang.String r10 = "pointerEvent"
                gy3.C87412m.m108594g(r7, r10)
                java.lang.String r10 = "pass"
                gy3.C87412m.m108594g(r8, r10)
                java.util.List<l1.s> r10 = r7.f326709a
                l1.a0 r0 = r6.f326648g
                boolean r0 = r0.f326641f
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0040
                int r0 = r10.size()
                r3 = 0
            L_0x001b:
                if (r3 >= r0) goto L_0x003a
                java.lang.Object r4 = r10.get(r3)
                l1.s r4 = (p190l1.C109111s) r4
                boolean r5 = p190l1.C109107m.m148148a(r4)
                if (r5 != 0) goto L_0x0032
                boolean r4 = p190l1.C109107m.m148149b(r4)
                if (r4 == 0) goto L_0x0030
                goto L_0x0032
            L_0x0030:
                r4 = 0
                goto L_0x0033
            L_0x0032:
                r4 = 1
            L_0x0033:
                if (r4 == 0) goto L_0x0037
                r0 = 1
                goto L_0x003b
            L_0x0037:
                int r3 = r3 + 1
                goto L_0x001b
            L_0x003a:
                r0 = 0
            L_0x003b:
                if (r0 == 0) goto L_0x003e
                goto L_0x0040
            L_0x003e:
                r0 = 0
                goto L_0x0041
            L_0x0040:
                r0 = 1
            L_0x0041:
                l1.a0$a r3 = r6.f326647f
                l1.a0$a r4 = p190l1.C109078a0.C109079a.NotDispatching
                if (r3 == r4) goto L_0x0057
                l1.n r3 = p190l1.C109108n.Initial
                if (r8 != r3) goto L_0x0050
                if (r0 == 0) goto L_0x0050
                r6.mo160326D(r7)
            L_0x0050:
                if (r8 != r9) goto L_0x0057
                if (r0 != 0) goto L_0x0057
                r6.mo160326D(r7)
            L_0x0057:
                if (r8 != r9) goto L_0x007b
                int r7 = r10.size()
                r8 = 0
            L_0x005e:
                if (r8 >= r7) goto L_0x0071
                java.lang.Object r9 = r10.get(r8)
                l1.s r9 = (p190l1.C109111s) r9
                boolean r9 = p190l1.C109107m.m148149b(r9)
                if (r9 != 0) goto L_0x006e
                r1 = 0
                goto L_0x0071
            L_0x006e:
                int r8 = r8 + 1
                goto L_0x005e
            L_0x0071:
                if (r1 == 0) goto L_0x007b
                l1.a0$a r7 = p190l1.C109078a0.C109079a.Unknown
                r6.f326647f = r7
                l1.a0 r7 = r6.f326648g
                r7.f326641f = r2
            L_0x007b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p190l1.C109078a0.C109080b.mo160328i(l1.l, l1.n, long):void");
        }
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: t0 */
    public C109117x mo160325t0() {
        return this.f326642g;
    }
}
