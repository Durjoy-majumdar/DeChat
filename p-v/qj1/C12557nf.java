package qj1;

import android.animation.ObjectAnimator;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Comparator;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C64674r41;
import ux3.C65486b;

/* renamed from: qj1.nf */
public final class C12557nf implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C12522mf f36049d;

    /* renamed from: qj1.nf$a */
    public static final class C12558a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12522mf f36050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12558a(C12522mf mfVar) {
            super(0);
            this.f36050d = mfVar;
        }

        public Object invoke() {
            Object value = ((C36570n) this.f36050d.f35991B).getValue();
            C87412m.m108593f(value, "<get-inAnim>(...)");
            ((ObjectAnimator) value).start();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.nf$b */
    public static final class C12559b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12522mf f36051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12559b(C12522mf mfVar) {
            super(0);
            this.f36051d = mfVar;
        }

        public Object invoke() {
            Object value = ((C36570n) this.f36051d.f35992C).getValue();
            C87412m.m108593f(value, "<get-outAnim>(...)");
            ((ObjectAnimator) value).start();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.nf$c */
    public static final class C12560c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C64674r41) t2).f185129i), Long.valueOf(((C64674r41) t).f185129i));
        }
    }

    public C12557nf(C12522mf mfVar) {
        this.f36049d = mfVar;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [te3.r41] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r9, r0)
            ok1.e r0 = ok1.C62042e.f176370a
            qj1.mf r1 = r8.f36049d
            java.lang.String r1 = r1.f35994q
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "msg.what:"
            r2.append(r3)
            int r3 = r9.what
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo86998D1(r1, r2)
            int r0 = r9.what
            qj1.mf r1 = r8.f36049d
            int r2 = r1.f35998u
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 != r2) goto L_0x00aa
            java.lang.Object r9 = r9.obj
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsg"
            gy3.C87412m.m108592e(r9, r0)
            te3.r41 r9 = (te3.C64674r41) r9
            qj1.mf r0 = r8.f36049d
            r0.getClass()
            te3.hx0 r1 = r9.f185132o
            if (r1 == 0) goto L_0x0041
            java.util.LinkedList<te3.aw0> r1 = r1.f134930r
            goto L_0x0042
        L_0x0041:
            r1 = r5
        L_0x0042:
            r2 = 5
            if (r1 == 0) goto L_0x006f
            java.util.Iterator r1 = r1.iterator()
        L_0x0049:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x006f
            java.lang.Object r6 = r1.next()
            te3.aw0 r6 = (te3.C48770aw0) r6
            int r7 = r6.f130789d
            if (r7 != r2) goto L_0x0049
            java.lang.String r1 = r6.f130793h
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131827041(0x7f111961, float:1.9286983E38)
            java.lang.String r6 = r6.getString(r7)
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            goto L_0x0070
        L_0x006f:
            r1 = 0
        L_0x0070:
            te3.hx0 r6 = r9.f185132o
            if (r6 == 0) goto L_0x0076
            java.util.LinkedList<te3.aw0> r5 = r6.f134930r
        L_0x0076:
            if (r5 == 0) goto L_0x00a1
            java.util.Iterator r5 = r5.iterator()
        L_0x007c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00a1
            java.lang.Object r6 = r5.next()
            te3.aw0 r6 = (te3.C48770aw0) r6
            int r7 = r6.f130789d
            if (r7 != r2) goto L_0x007c
            java.lang.String r2 = r6.f130793h
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131827958(0x7f111cf6, float:1.9288843E38)
            java.lang.String r4 = r4.getString(r5)
            boolean r4 = gy3.C87412m.m108589b(r2, r4)
        L_0x00a1:
            qj1.qf r2 = new qj1.qf
            r2.<init>(r0, r9, r1, r4)
            o40.C61926c.m72668M(r2)
            goto L_0x0107
        L_0x00aa:
            int r2 = r1.f35999v
            if (r0 != r2) goto L_0x00b7
            qj1.nf$a r9 = new qj1.nf$a
            r9.<init>(r1)
            o40.C61926c.m72668M(r9)
            goto L_0x0107
        L_0x00b7:
            int r2 = r1.f36000w
            if (r0 != r2) goto L_0x00c4
            qj1.nf$b r9 = new qj1.nf$b
            r9.<init>(r1)
            o40.C61926c.m72668M(r9)
            goto L_0x0107
        L_0x00c4:
            int r1 = r1.f36001x
            if (r0 != r1) goto L_0x0107
            java.lang.Object r9 = r9.obj
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.protocal.protobuf.FinderLiveMsg> }"
            gy3.C87412m.m108592e(r9, r0)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r9 = r5
        L_0x00da:
            if (r9 == 0) goto L_0x00ec
            qj1.nf$c r0 = new qj1.nf$c
            r0.<init>()
            java.util.List r9 = sx3.C110818d0.m150943o0(r9, r0)
            java.lang.Object r9 = r9.get(r4)
            r5 = r9
            te3.r41 r5 = (te3.C64674r41) r5
        L_0x00ec:
            if (r5 == 0) goto L_0x0107
            qj1.mf r9 = r8.f36049d
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r9.mo12153b1()
            qj1.mf r0 = r8.f36049d
            int r0 = r0.f35998u
            android.os.Message r9 = r9.obtainMessage(r0)
            r9.obj = r5
            qj1.mf r0 = r8.f36049d
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.mo12153b1()
            r0.sendMessage(r9)
        L_0x0107:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12557nf.handleMessage(android.os.Message):boolean");
    }
}
