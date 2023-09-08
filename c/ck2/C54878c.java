package ck2;

import a14.C0000n0;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import nj3.C76912y0;
import qo3.C89779i0;
import rx3.C13598b0;
import ve3.C65684l0;
import wj2.C66132f;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$onChoiceRingtone$1", mo125469f = "RingtoneDataUIC.kt", mo125470l = {315, 317, 331, 333}, mo125471m = "invokeSuspend")
/* renamed from: ck2.c */
public final class C54878c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f153811d;

    /* renamed from: e */
    public Object f153812e;

    /* renamed from: f */
    public Object f153813f;

    /* renamed from: g */
    public Object f153814g;

    /* renamed from: h */
    public boolean f153815h;

    /* renamed from: i */
    public int f153816i;

    /* renamed from: j */
    public final /* synthetic */ C65684l0 f153817j;

    /* renamed from: n */
    public final /* synthetic */ RingtoneDataUIC f153818n;

    /* renamed from: o */
    public final /* synthetic */ C66132f f153819o;

    /* renamed from: p */
    public final /* synthetic */ C89779i0 f153820p;

    /* renamed from: q */
    public final /* synthetic */ Intent f153821q;

    /* renamed from: ck2.c$a */
    public static final class C54879a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f153822d;

        /* renamed from: e */
        public final /* synthetic */ boolean f153823e;

        /* renamed from: f */
        public final /* synthetic */ RingtoneDataUIC f153824f;

        /* renamed from: g */
        public final /* synthetic */ Intent f153825g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54879a(C89779i0 i0Var, boolean z, RingtoneDataUIC ringtoneDataUIC, Intent intent) {
            super(0);
            this.f153822d = i0Var;
            this.f153823e = z;
            this.f153824f = ringtoneDataUIC;
            this.f153825g = intent;
        }

        public Object invoke() {
            this.f153822d.hide();
            if (this.f153823e) {
                C76912y0.m92768g(this.f153824f.getActivity(), this.f153824f.getActivity().getResources().getString(C0966R.string.i4v));
            } else {
                C76912y0.m92767f(this.f153824f.getActivity(), this.f153824f.getActivity().getResources().getString(C0966R.string.i4u));
            }
            this.f153824f.getActivity().setResult(6, this.f153825g);
            this.f153824f.getActivity().finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ck2.c$b */
    public static final class C54880b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f153826d;

        /* renamed from: e */
        public final /* synthetic */ RingtoneDataUIC f153827e;

        /* renamed from: f */
        public final /* synthetic */ Intent f153828f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54880b(boolean z, RingtoneDataUIC ringtoneDataUIC, Intent intent) {
            super(0);
            this.f153826d = z;
            this.f153827e = ringtoneDataUIC;
            this.f153828f = intent;
        }

        public Object invoke() {
            if (this.f153826d) {
                C76912y0.m92768g(this.f153827e.getActivity(), this.f153827e.getActivity().getResources().getString(C0966R.string.i4v));
            } else {
                C76912y0.m92767f(this.f153827e.getActivity(), this.f153827e.getActivity().getResources().getString(C0966R.string.i4u));
            }
            this.f153827e.getActivity().setResult(6, this.f153828f);
            this.f153827e.getActivity().finish();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54878c(C65684l0 l0Var, RingtoneDataUIC ringtoneDataUIC, C66132f fVar, C89779i0 i0Var, Intent intent, C15601d<? super C54878c> dVar) {
        super(2, dVar);
        this.f153817j = l0Var;
        this.f153818n = ringtoneDataUIC;
        this.f153819o = fVar;
        this.f153820p = i0Var;
        this.f153821q = intent;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54878c(this.f153817j, this.f153818n, this.f153819o, this.f153820p, this.f153821q, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54878c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f153816i
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r6) goto L_0x005e
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            boolean r1 = r0.f153815h
            java.lang.Object r2 = r0.f153813f
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r3 = r0.f153812e
            wj2.f r3 = (wj2.C66132f) r3
            java.lang.Object r4 = r0.f153811d
            com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r4 = (com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC) r4
            kotlin.ResultKt.throwOnFailure(r21)
            r9 = r4
            r4 = r3
            goto L_0x0173
        L_0x0029:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0031:
            java.lang.Object r2 = r0.f153813f
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r4 = r0.f153812e
            wj2.f r4 = (wj2.C66132f) r4
            java.lang.Object r5 = r0.f153811d
            com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r5 = (com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC) r5
            kotlin.ResultKt.throwOnFailure(r21)
            r10 = r2
            r2 = r21
            goto L_0x0153
        L_0x0045:
            boolean r1 = r0.f153815h
            java.lang.Object r2 = r0.f153814g
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r3 = r0.f153813f
            qo3.i0 r3 = (qo3.C89779i0) r3
            java.lang.Object r4 = r0.f153812e
            wj2.f r4 = (wj2.C66132f) r4
            java.lang.Object r5 = r0.f153811d
            com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r5 = (com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC) r5
            kotlin.ResultKt.throwOnFailure(r21)
            r10 = r5
            r5 = r4
            goto L_0x00fa
        L_0x005e:
            java.lang.Object r2 = r0.f153814g
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r3 = r0.f153813f
            qo3.i0 r3 = (qo3.C89779i0) r3
            java.lang.Object r4 = r0.f153812e
            wj2.f r4 = (wj2.C66132f) r4
            java.lang.Object r7 = r0.f153811d
            com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r7 = (com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC) r7
            kotlin.ResultKt.throwOnFailure(r21)
            r10 = r2
            r2 = r21
            goto L_0x00d7
        L_0x0075:
            kotlin.ResultKt.throwOnFailure(r21)
            ve3.l0 r2 = r0.f153817j
            com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r7 = r0.f153818n
            wj2.f r8 = r0.f153819o
            qo3.i0 r9 = r0.f153820p
            android.content.Intent r10 = r0.f153821q
            java.lang.String r11 = r7.f164073f
            java.lang.String r12 = eb0.C75592q0.m90789s()
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            r12 = 0
            if (r11 != 0) goto L_0x0110
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r7.getActivity()
            bl3.r$a r3 = r3.mo62444c(r4)
            java.lang.Class<ck2.h> r4 = ck2.C54897h.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            ck2.h r3 = (ck2.C54897h) r3
            java.lang.String r4 = r7.f164073f
            r0.f153811d = r7
            r0.f153812e = r8
            r0.f153813f = r9
            r0.f153814g = r10
            r0.f153816i = r6
            r3.getClass()
            wx3.h r11 = new wx3.h
            wx3.d r13 = xx3.C66447b.m78392b(r20)
            r11.<init>(r13)
            a14.n0 r14 = r3.getLifecycleScope()
            ck2.e r3 = new ck2.e
            r3.<init>(r2, r4, r11, r12)
            r15 = 0
            r16 = 0
            r18 = 3
            r19 = 0
            r17 = r3
            a14.C53895h.m60466d(r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r11.mo90314b()
            if (r2 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r4 = r8
            r3 = r9
        L_0x00d7:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0106
            nj2.p r8 = nj2.C61768p.f175586a
            java.lang.String r9 = r7.f164073f
            r0.f153811d = r7
            r0.f153812e = r4
            r0.f153813f = r3
            r0.f153814g = r10
            r0.f153815h = r2
            r0.f153816i = r5
            java.lang.Object r5 = r8.mo86689a(r9, r4, r6, r0)
            if (r5 != r1) goto L_0x00f6
            return r1
        L_0x00f6:
            r1 = r2
            r5 = r4
            r2 = r10
            r10 = r7
        L_0x00fa:
            java.lang.String r4 = r10.f164073f
            r6 = 0
            r8 = 4
            r9 = 0
            nj2.C61768p.m72486n(r4, r5, r6, r8, r9)
            r7 = r10
            r10 = r2
            r2 = r1
        L_0x0106:
            ck2.c$a r1 = new ck2.c$a
            r1.<init>(r3, r2, r7, r10)
            o40.C61926c.m72668M(r1)
            goto L_0x018e
        L_0x0110:
            bl3.r r5 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r9 = r7.getActivity()
            bl3.r$a r5 = r5.mo62444c(r9)
            java.lang.Class<ck2.s> r9 = ck2.C54925s.class
            androidx.lifecycle.i0 r5 = r5.mo75002a(r9)
            ck2.s r5 = (ck2.C54925s) r5
            r0.f153811d = r7
            r0.f153812e = r8
            r0.f153813f = r10
            r0.f153816i = r4
            r5.getClass()
            wx3.h r4 = new wx3.h
            wx3.d r9 = xx3.C66447b.m78392b(r20)
            r4.<init>(r9)
            a14.n0 r13 = r5.getLifecycleScope()
            ck2.t r5 = new ck2.t
            r5.<init>(r2, r4, r12)
            r14 = 0
            r15 = 0
            r17 = 3
            r18 = 0
            r16 = r5
            a14.C53895h.m60466d(r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r4.mo90314b()
            if (r2 != r1) goto L_0x0151
            return r1
        L_0x0151:
            r5 = r7
            r4 = r8
        L_0x0153:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0186
            nj2.p r7 = nj2.C61768p.f175586a
            r0.f153811d = r5
            r0.f153812e = r4
            r0.f153813f = r10
            r0.f153815h = r2
            r0.f153816i = r3
            java.lang.String r3 = ""
            java.lang.Object r3 = r7.mo86689a(r3, r4, r6, r0)
            if (r3 != r1) goto L_0x0170
            return r1
        L_0x0170:
            r1 = r2
            r9 = r5
            r2 = r10
        L_0x0173:
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r5 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r3, r5)
            r5 = 0
            r7 = 4
            r8 = 0
            nj2.C61768p.m72486n(r3, r4, r5, r7, r8)
            r10 = r2
            r5 = r9
            r2 = r1
        L_0x0186:
            ck2.c$b r1 = new ck2.c$b
            r1.<init>(r2, r5, r10)
            o40.C61926c.m72668M(r1)
        L_0x018e:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ck2.C54878c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
