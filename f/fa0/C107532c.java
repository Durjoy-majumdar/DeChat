package fa0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103691v;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.C86013q1;
import fm0.C86980s1;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ResultKt;
import p1105d5.C106994f;
import p175j0.C108504h;
import p175j0.C60690y0;
import p267x.C111897d1;
import p435a0.C103138e;
import p435a0.C103153h;
import p435a0.C103214y0;
import p436a1.C103274x;
import p532g5.C107734c;
import p532g5.C107737g;
import p532g5.C107742h;
import p532g5.C59349d;
import p560i2.C33181m;
import p631o1.C109836f;
import p631o1.C109857o;
import p632o5.C109956h;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import ya0.C112430i;
import ya0.C66599g;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fa0.c */
public final class C107532c {

    @C91590f(mo125468c = "com.tencent.mm.mj_template.compose_widget.ImageViewerKt$ImageViewer$1", mo125469f = "ImageViewer.kt", mo125470l = {56}, mo125471m = "invokeSuspend")
    /* renamed from: fa0.c$a */
    public static final class C58930a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168625d;

        /* renamed from: e */
        public final /* synthetic */ List<String> f168626e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<Float> f168627f;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.compose_widget.ImageViewerKt$ImageViewer$1$1", mo125469f = "ImageViewer.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: fa0.c$a$a */
        public static final class C58931a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ List<String> f168628d;

            /* renamed from: e */
            public final /* synthetic */ C60690y0<Float> f168629e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58931a(List<String> list, C60690y0<Float> y0Var, C15601d<? super C58931a> dVar) {
                super(2, dVar);
                this.f168628d = list;
                this.f168629e = y0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C58931a(this.f168628d, this.f168629e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C58931a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C60690y0<Float> y0Var = this.f168629e;
                Iterator<T> it = this.f168628d.iterator();
                if (it.hasNext()) {
                    float c = C107532c.m145663c((String) it.next());
                    while (it.hasNext()) {
                        c = Math.max(c, C107532c.m145663c((String) it.next()));
                    }
                    y0Var.setValue(Float.valueOf(c));
                    return C13598b0.f38549a;
                }
                throw new NoSuchElementException();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58930a(List<String> list, C60690y0<Float> y0Var, C15601d<? super C58930a> dVar) {
            super(2, dVar);
            this.f168626e = list;
            this.f168627f = y0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C58930a(this.f168626e, this.f168627f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58930a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168625d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151119c;
                C58931a aVar2 = new C58931a(this.f168626e, this.f168627f, (C15601d<? super C58931a>) null);
                this.f168625d = 1;
                if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fa0.c$d */
    public static final class C58932d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<String> f168630d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f168631e;

        /* renamed from: f */
        public final /* synthetic */ int f168632f;

        /* renamed from: g */
        public final /* synthetic */ int f168633g;

        /* renamed from: h */
        public final /* synthetic */ int f168634h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58932d(List<String> list, C65503j jVar, int i, int i2, int i3) {
            super(2);
            this.f168630d = list;
            this.f168631e = jVar;
            this.f168632f = i;
            this.f168633g = i2;
            this.f168634h = i3;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107532c.m145661a(this.f168630d, this.f168631e, this.f168632f, (C108504h) obj, this.f168633g | 1, this.f168634h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fa0.c$b */
    public static final class C107533b extends C87413o implements C32226l<C109857o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60690y0<C33181m> f321734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107533b(C60690y0<C33181m> y0Var) {
            super(1);
            this.f321734d = y0Var;
        }

        public Object invoke(Object obj) {
            C109857o oVar = (C109857o) obj;
            C87412m.m108594g(oVar, LocaleUtil.ITALIAN);
            this.f321734d.setValue(new C33181m(oVar.mo161181b()));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fa0.c$c */
    public static final class C107534c extends C87413o implements C32229r<C66599g, Integer, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<String> f321735d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107534c(C103153h hVar, List<String> list) {
            super(4);
            this.f321735d = list;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj2).intValue();
            C108504h hVar = (C108504h) obj3;
            int intValue2 = ((Number) obj4).intValue();
            C87412m.m108594g((C66599g) obj, "$this$HorizontalPager");
            if ((intValue2 & 112) == 0) {
                intValue2 |= hVar.mo51592j(intValue) ? 32 : 16;
            }
            if ((intValue2 & 721) != 144 || !hVar.mo51575a()) {
                Integer valueOf = Integer.valueOf(intValue);
                List<String> list = this.f321735d;
                hVar.mo51557H(1157296644);
                boolean x = hVar.mo51619x(valueOf);
                Object q = hVar.mo51606q();
                if (x || q == C108504h.C60656a.f172772a) {
                    String i = C86013q1.m106448i(list.get(intValue), false);
                    if (i == null) {
                        i = "";
                    }
                    q = new File(i);
                    hVar.mo51553F(q);
                }
                hVar.mo51565P();
                hVar.mo51557H(604400049);
                C59349d.C59350a.C59351a aVar = C59349d.C59350a.C59351a.f169659b;
                C106994f a = C107734c.m145933a(C107742h.f322421a, hVar, 6);
                hVar.mo51557H(604401818);
                C109956h.C109957a aVar2 = new C109956h.C109957a((Context) hVar.mo51598m(C103691v.f306268b));
                aVar2.f329030c = q;
                C59349d a2 = C107737g.m145937a(aVar2.mo161284a(), a, aVar, hVar, C86980s1.CTRL_INDEX, 0);
                hVar.mo51565P();
                hVar.mo51565P();
                C109836f fVar = C109836f.C109837a.f328766c;
                C65503j g = C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null);
                C111294a aVar3 = C111294a.C111295a.f333222d;
                C87412m.m108594g(g, "<this>");
                C111897d1.m152617a(a2, (String) null, g.mo74972i0(new C103138e(aVar3, false, C103612c1.f306063a)), (C111294a) null, fVar, 0.0f, (C103274x) null, hVar, 24624, 104);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fa0.c$e */
    public static final class C107535e extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112430i f321736d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f321737e;

        /* renamed from: f */
        public final /* synthetic */ int f321738f;

        /* renamed from: g */
        public final /* synthetic */ int f321739g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107535e(C112430i iVar, C65503j jVar, int i, int i2) {
            super(2);
            this.f321736d = iVar;
            this.f321737e = jVar;
            this.f321738f = i;
            this.f321739g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107532c.m145662b(this.f321736d, this.f321737e, (C108504h) obj, this.f321738f | 1, this.f321739g);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145661a(java.util.List<java.lang.String> r30, p721v0.C65503j r31, int r32, p175j0.C108504h r33, int r34, int r35) {
        /*
            r1 = r30
            java.lang.String r0 = "imagePathList"
            gy3.C87412m.m108594g(r1, r0)
            r0 = -1804522395(0xffffffff94712c65, float:-1.2176146E-26)
            r2 = r33
            j0.h r0 = r2.mo51623z(r0)
            r2 = r35 & 2
            if (r2 == 0) goto L_0x0018
            v0.j$a r2 = p721v0.C65503j.C65504a.f188490d
            r15 = r2
            goto L_0x001a
        L_0x0018:
            r15 = r31
        L_0x001a:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x0021
            r2 = -1
            r14 = -1
            goto L_0x0023
        L_0x0021:
            r14 = r32
        L_0x0023:
            r13 = 0
            r12 = 1
            ya0.i r11 = ya0.C112433j.m153454a(r13, r0, r13, r12)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r2)
            java.lang.Object r3 = r0.mo51606q()
            java.lang.Object r10 = p175j0.C108504h.C60656a.f172772a
            r9 = 0
            r4 = 2
            r8 = 0
            if (r3 != r10) goto L_0x0045
            java.lang.Float r3 = java.lang.Float.valueOf(r9)
            j0.y0 r3 = p175j0.C108500f2.m146996c(r3, r8, r4, r8)
            r0.mo51553F(r3)
        L_0x0045:
            r0.mo51565P()
            j0.y0 r3 = (p175j0.C60690y0) r3
            r0.mo51557H(r2)
            java.lang.Object r2 = r0.mo51606q()
            if (r2 != r10) goto L_0x0063
            long r5 = p560i2.C108329n.m146743a(r13, r13)
            i2.m r2 = new i2.m
            r2.<init>(r5)
            j0.y0 r2 = p175j0.C108500f2.m146996c(r2, r8, r4, r8)
            r0.mo51553F(r2)
        L_0x0063:
            r0.mo51565P()
            j0.y0 r2 = (p175j0.C60690y0) r2
            fa0.c$a r5 = new fa0.c$a
            r5.<init>(r1, r3, r8)
            r6 = 72
            p175j0.C60655g0.m70932c(r1, r5, r0, r6)
            java.lang.Object r5 = r2.getValue()
            i2.m r5 = (p560i2.C33181m) r5
            long r5 = r5.f90057a
            i2.m r7 = new i2.m
            r7.<init>(r5)
            java.lang.Object r5 = r3.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo51557H(r6)
            boolean r7 = r0.mo51619x(r7)
            boolean r5 = r0.mo51619x(r5)
            r5 = r5 | r7
            java.lang.Object r7 = r0.mo51606q()
            if (r5 != 0) goto L_0x00a4
            if (r7 != r10) goto L_0x0100
        L_0x00a4:
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.Object r5 = r2.getValue()
            i2.m r5 = (p560i2.C33181m) r5
            long r6 = r5.f90057a
            r5 = 32
            long r5 = r6 >> r5
            int r6 = (int) r5
            float r5 = (float) r6
            float r3 = r3 * r5
            java.lang.Object r5 = r2.getValue()
            i2.m r5 = (p560i2.C33181m) r5
            long r5 = r5.f90057a
            int r5 = p560i2.C33181m.m39966b(r5)
            float r5 = (float) r5
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e5
            java.lang.Object r5 = r2.getValue()
            i2.m r5 = (p560i2.C33181m) r5
            long r5 = r5.f90057a
            int r5 = p560i2.C33181m.m39966b(r5)
            float r5 = (float) r5
            float r5 = r5 - r3
            float r6 = (float) r4
            float r5 = r5 / r6
            float r5 = r5 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r5)
            goto L_0x00f5
        L_0x00e5:
            java.lang.Object r3 = r2.getValue()
            i2.m r3 = (p560i2.C33181m) r3
            long r5 = r3.f90057a
            int r3 = p560i2.C33181m.m39966b(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x00f5:
            int r3 = r3.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r0.mo51553F(r7)
        L_0x0100:
            r0.mo51565P()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r3 = r34 >> 3
            r3 = r3 & 14
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo51557H(r5)
            v0.a r5 = p721v0.C111294a.C111295a.f333219a
            int r6 = r3 >> 3
            r16 = r6 & 14
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r16 | r6
            o1.y r5 = p435a0.C103141f.m136472c(r5, r13, r0, r6)
            int r6 = r3 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo51557H(r13)
            j0.f1<i2.d> r13 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r16 = r0.mo51598m(r13)
            r8 = r16
            i2.d r8 = (p560i2.C108322d) r8
            j0.f1<i2.o> r9 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r9 = r0.mo51598m(r9)
            i2.o r9 = (p560i2.C33183o) r9
            j0.f1<androidx.compose.ui.platform.i2> r12 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r12 = r0.mo51598m(r12)
            androidx.compose.ui.platform.i2 r12 = (androidx.compose.p002ui.platform.C103633i2) r12
            q1.a$a r18 = p658q1.C110269a.f329831D0
            r18.getClass()
            fy3.a<q1.a> r4 = p658q1.C110269a.C110270a.f329833b
            fy3.q r19 = p631o1.C109863q.m149330a(r15)
            int r6 = r6 << 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            r20 = r7
            j0.d r7 = r0.mo51543A()
            boolean r7 = r7 instanceof p175j0.C24665d
            if (r7 == 0) goto L_0x0303
            r0.mo51615v()
            boolean r7 = r0.mo51621y()
            if (r7 == 0) goto L_0x016d
            r0.mo51612t(r4)
            goto L_0x0170
        L_0x016d:
            r0.mo51579c()
        L_0x0170:
            r0.mo51561L()
            fy3.p<q1.a, o1.y, rx3.b0> r4 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r0, r5, r4)
            fy3.p<q1.a, i2.d, rx3.b0> r4 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r0, r8, r4)
            fy3.p<q1.a, i2.o, rx3.b0> r4 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r0, r9, r4)
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r4 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r0, r12, r4)
            r0.mo51590i()
            j0.x1 r4 = new j0.x1
            r4.<init>(r0)
            int r5 = r6 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = r19
            q0.b r7 = (p415q0.C35747b) r7
            r7.invoke(r4, r0, r5)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo51557H(r4)
            int r4 = r6 >> 9
            r4 = r4 & 14
            r5 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r0.mo51557H(r5)
            r4 = r4 & 11
            r5 = 2
            if (r4 != r5) goto L_0x01be
            boolean r4 = r0.mo51575a()
            if (r4 != 0) goto L_0x01ba
            goto L_0x01be
        L_0x01ba:
            r0.mo51581d()
            goto L_0x01e2
        L_0x01be:
            a0.i r4 = p435a0.C103155i.f304309a
            int r3 = r3 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r6 = r3 & 14
            if (r6 != 0) goto L_0x01d2
            boolean r6 = r0.mo51619x(r4)
            if (r6 == 0) goto L_0x01d1
            r5 = 4
        L_0x01d1:
            r3 = r3 | r5
        L_0x01d2:
            r3 = r3 & 91
            r5 = 18
            if (r3 != r5) goto L_0x01e7
            boolean r3 = r0.mo51575a()
            if (r3 != 0) goto L_0x01df
            goto L_0x01e7
        L_0x01df:
            r0.mo51581d()
        L_0x01e2:
            r31 = r15
            r15 = r14
            goto L_0x02da
        L_0x01e7:
            int r3 = r30.size()
            v0.j$a r12 = p721v0.C65503j.C65504a.f188490d
            r5 = 1
            r8 = 0
            r9 = 0
            v0.j r6 = p435a0.C103214y0.m136590f(r12, r9, r5, r8)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r5)
            boolean r5 = r0.mo51619x(r2)
            java.lang.Object r7 = r0.mo51606q()
            if (r5 != 0) goto L_0x0206
            if (r7 != r10) goto L_0x020e
        L_0x0206:
            fa0.c$b r7 = new fa0.c$b
            r7.<init>(r2)
            r0.mo51553F(r7)
        L_0x020e:
            r0.mo51565P()
            fy3.l r7 = (fy3.C32226l) r7
            v0.j r5 = p631o1.C109845i0.m149273a(r6, r7)
            r6 = 0
            r7 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r2 = -2075819460(0xffffffff8445823c, float:-2.321704E-36)
            fa0.c$c r8 = new fa0.c$c
            r8.<init>(r4, r1)
            r4 = 1
            q0.a r17 = p415q0.C110261c.m149878b(r0, r2, r4, r8)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            r23 = 504(0x1f8, float:7.06E-43)
            r2 = r3
            r3 = r5
            r24 = 1
            r4 = r11
            r5 = r6
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6 = r7
            r25 = r20
            r7 = r16
            r8 = r18
            r9 = r19
            r26 = r10
            r10 = r21
            r27 = r11
            r11 = r17
            r28 = r12
            r12 = r0
            r29 = r13
            r13 = r22
            r31 = r15
            r15 = r14
            r14 = r23
            ya0.C112409c.m153440a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = r25
            if (r2 <= 0) goto L_0x02da
            if (r15 <= 0) goto L_0x02da
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = kg3.C76577a.m92155f(r4, r3)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = kg3.C76577a.m92152c(r4, r3)
            float r3 = (float) r3
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = kg3.C76577a.m92150a(r4, r3)
            float r3 = (float) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo51557H(r6)
            boolean r4 = r0.mo51619x(r4)
            boolean r5 = r0.mo51619x(r5)
            r4 = r4 | r5
            java.lang.Object r5 = r0.mo51606q()
            if (r4 != 0) goto L_0x029f
            r4 = r26
            if (r5 != r4) goto L_0x02b3
        L_0x029f:
            float r2 = (float) r2
            r4 = 3
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 + r4
            float r3 = (float) r15
            float r3 = r3 - r4
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x02ac
            r2 = r3
        L_0x02ac:
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            r0.mo51553F(r5)
        L_0x02b3:
            r0.mo51565P()
            java.lang.Number r5 = (java.lang.Number) r5
            float r2 = r5.floatValue()
            int r2 = (int) r2
            float r2 = (float) r2
            r3 = r29
            java.lang.Object r3 = r0.mo51598m(r3)
            i2.d r3 = (p560i2.C108322d) r3
            float r3 = r3.getDensity()
            float r2 = r2 / r3
            r3 = r28
            r4 = 0
            r5 = 0
            r6 = 1
            v0.j r2 = p435a0.C103160j0.m136502a(r3, r4, r2, r6, r5)
            r3 = r27
            r4 = 0
            m145662b(r3, r2, r0, r4, r4)
        L_0x02da:
            r0.mo51565P()
            r0.mo51565P()
            r0.mo51610s()
            r0.mo51565P()
            r0.mo51565P()
            j0.v1 r6 = r0.mo51596l()
            if (r6 != 0) goto L_0x02f0
            goto L_0x0302
        L_0x02f0:
            fa0.c$d r7 = new fa0.c$d
            r0 = r7
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r34
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo51650a(r7)
        L_0x0302:
            return
        L_0x0303:
            r5 = 0
            p175j0.C108501g.m147000a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fa0.C107532c.m145661a(java.util.List, v0.j, int, j0.h, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145662b(ya0.C112430i r23, p721v0.C65503j r24, p175j0.C108504h r25, int r26, int r27) {
        /*
            r0 = r23
            r1 = r26
            r2 = r27
            java.lang.String r3 = "pagerState"
            gy3.C87412m.m108594g(r0, r3)
            r3 = -20278634(0xfffffffffeca9296, float:-1.3463259E38)
            r4 = r25
            j0.h r3 = r4.mo51623z(r3)
            r4 = r2 & 1
            r15 = 2
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x002b
            boolean r4 = r3.mo51619x(r0)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = 2
        L_0x0029:
            r4 = r4 | r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0033
            r4 = r4 | 48
            goto L_0x0046
        L_0x0033:
            r6 = r1 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0046
            r6 = r24
            boolean r7 = r3.mo51619x(r6)
            if (r7 == 0) goto L_0x0042
            r7 = 32
            goto L_0x0044
        L_0x0042:
            r7 = 16
        L_0x0044:
            r4 = r4 | r7
            goto L_0x0048
        L_0x0046:
            r6 = r24
        L_0x0048:
            r4 = r4 & 91
            r7 = 18
            if (r4 != r7) goto L_0x005a
            boolean r4 = r3.mo51575a()
            if (r4 != 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            r3.mo51581d()
            goto L_0x01ba
        L_0x005a:
            if (r5 == 0) goto L_0x0062
            int r4 = p721v0.C65503j.f188489K0
            v0.j$a r4 = p721v0.C65503j.C65504a.f188490d
            r14 = r4
            goto L_0x0063
        L_0x0062:
            r14 = r6
        L_0x0063:
            r13 = 0
            r4 = 1
            r12 = 0
            v0.j r4 = p435a0.C103214y0.m136591g(r14, r13, r4, r12)
            a0.a r5 = p435a0.C103111a.f304234a
            a0.a$e r5 = p435a0.C103111a.f304239f
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r3.mo51557H(r6)
            int r6 = p721v0.C111294a.f333218a
            v0.a$c r6 = p721v0.C111294a.C111295a.f333226h
            r7 = 6
            o1.y r5 = p435a0.C103199s0.m136579a(r5, r6, r3, r7)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.mo51557H(r6)
            j0.f1<i2.d> r6 = androidx.compose.p002ui.platform.C103645l0.f306124e
            java.lang.Object r6 = r3.mo51598m(r6)
            i2.d r6 = (p560i2.C108322d) r6
            j0.f1<i2.o> r7 = androidx.compose.p002ui.platform.C103645l0.f306130k
            java.lang.Object r7 = r3.mo51598m(r7)
            i2.o r7 = (p560i2.C33183o) r7
            j0.f1<androidx.compose.ui.platform.i2> r8 = androidx.compose.p002ui.platform.C103645l0.f306134o
            java.lang.Object r8 = r3.mo51598m(r8)
            androidx.compose.ui.platform.i2 r8 = (androidx.compose.p002ui.platform.C103633i2) r8
            q1.a$a r9 = p658q1.C110269a.f329831D0
            r9.getClass()
            fy3.a<q1.a> r10 = p658q1.C110269a.C110270a.f329833b
            fy3.q r4 = p631o1.C109863q.m149330a(r4)
            j0.d r11 = r3.mo51543A()
            boolean r11 = r11 instanceof p175j0.C24665d
            if (r11 == 0) goto L_0x01ca
            r3.mo51615v()
            boolean r11 = r3.mo51621y()
            if (r11 == 0) goto L_0x00bb
            r3.mo51612t(r10)
            goto L_0x00be
        L_0x00bb:
            r3.mo51579c()
        L_0x00be:
            r3.mo51561L()
            r9.getClass()
            fy3.p<q1.a, o1.y, rx3.b0> r10 = p658q1.C110269a.C110270a.f329836e
            p175j0.C108508o2.m147049a(r3, r5, r10)
            r9.getClass()
            fy3.p<q1.a, i2.d, rx3.b0> r5 = p658q1.C110269a.C110270a.f329835d
            p175j0.C108508o2.m147049a(r3, r6, r5)
            r9.getClass()
            fy3.p<q1.a, i2.o, rx3.b0> r5 = p658q1.C110269a.C110270a.f329837f
            p175j0.C108508o2.m147049a(r3, r7, r5)
            r9.getClass()
            fy3.p<q1.a, androidx.compose.ui.platform.i2, rx3.b0> r5 = p658q1.C110269a.C110270a.f329838g
            p175j0.C108508o2.m147049a(r3, r8, r5)
            r3.mo51590i()
            j0.x1 r5 = new j0.x1
            r5.<init>(r3)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            q0.b r4 = (p415q0.C35747b) r4
            r4.invoke(r5, r3, r7)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.mo51557H(r4)
            r4 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r3.mo51557H(r4)
            int r11 = r23.mo164139g()
            r10 = 0
        L_0x0104:
            if (r10 >= r11) goto L_0x01a7
            int r4 = p721v0.C65503j.f188489K0
            v0.j$a r4 = p721v0.C65503j.C65504a.f188490d
            r5 = 2131165281(0x7f070061, float:1.7944775E38)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92155f(r6, r5)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92152c(r6, r5)
            float r5 = (float) r5
            v0.j r4 = p435a0.C103166l0.m136521e(r4, r5, r13, r15, r12)
            r5 = 2131165371(0x7f0700bb, float:1.7944957E38)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92155f(r6, r5)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92152c(r6, r5)
            float r5 = (float) r5
            v0.j r4 = p435a0.C103214y0.m136594j(r4, r5)
            e0.f r5 = p502e0.C107074g.f320494a
            int r6 = r23.mo164141i()
            java.lang.String r7 = "getContext()"
            if (r10 != r6) goto L_0x015c
            r6 = -2010389157(0xffffffff882be55b, float:-5.1728047E-34)
            r3.mo51557H(r6)
            r6 = 2131099704(0x7f060038, float:1.7811769E38)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r8, r7)
            long r6 = ta0.C110954a.m151254b(r6, r8)
            r3.mo51565P()
            goto L_0x0173
        L_0x015c:
            r6 = -2010389084(0xffffffff882be5a4, float:-5.172838E-34)
            r3.mo51557H(r6)
            r6 = 2131099697(0x7f060031, float:1.7811755E38)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r8, r7)
            long r6 = ta0.C110954a.m151254b(r6, r8)
            r3.mo51565P()
        L_0x0173:
            r8 = 0
            r16 = 0
            r17 = 0
            fy3.p<j0.h, java.lang.Integer, rx3.b0> r18 = fa0.C58928b.f168623a
            fy3.p<j0.h, java.lang.Integer, rx3.b0> r18 = fa0.C58928b.f168623a
            r19 = 1572864(0x180000, float:2.204052E-39)
            r20 = 56
            r21 = r10
            r10 = r16
            r16 = r11
            r11 = r17
            r17 = r12
            r12 = r18
            r18 = 0
            r13 = r3
            r22 = r14
            r14 = r19
            r19 = 2
            r15 = r20
            p543h0.C107927c0.m146232a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            int r10 = r21 + 1
            r11 = r16
            r12 = r17
            r14 = r22
            r13 = 0
            r15 = 2
            goto L_0x0104
        L_0x01a7:
            r22 = r14
            r3.mo51565P()
            r3.mo51565P()
            r3.mo51610s()
            r3.mo51565P()
            r3.mo51565P()
            r6 = r22
        L_0x01ba:
            j0.v1 r3 = r3.mo51596l()
            if (r3 != 0) goto L_0x01c1
            goto L_0x01c9
        L_0x01c1:
            fa0.c$e r4 = new fa0.c$e
            r4.<init>(r0, r6, r1, r2)
            r3.mo51650a(r4)
        L_0x01c9:
            return
        L_0x01ca:
            r17 = r12
            p175j0.C108501g.m147000a()
            throw r17
        */
        throw new UnsupportedOperationException("Method not decompiled: fa0.C107532c.m145662b(ya0.i, v0.j, j0.h, int, int):void");
    }

    /* renamed from: c */
    public static final float m145663c(String str) {
        Point point = new Point();
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(str, options);
        point.x = options.outWidth;
        point.y = options.outHeight;
        if (BackwardSupportUtil.ExifHelper.getExifOrientation(str) % 180 != 0) {
            int i2 = point.y;
            point.y = point.x;
            point.x = i2;
        }
        float f = (float) point.y;
        Integer valueOf = Integer.valueOf(point.x);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        }
        return f / ((float) i);
    }
}
