package sk3;

import a14.C0000n0;
import com.tencent.p014mm.storage.C72963f4;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.ResultKt;
import ok3.C62070e;
import ok3.C62074i;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemMusicUIC$updateMatchInfo$1", mo125469f = "FTSMultiItemMusicUIC.kt", mo125470l = {156}, mo125471m = "invokeSuspend")
/* renamed from: sk3.d0 */
public final class C63974d0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181371d;

    /* renamed from: e */
    public /* synthetic */ Object f181372e;

    /* renamed from: f */
    public final /* synthetic */ C63971c0 f181373f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C72963f4> f181374g;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemMusicUIC$updateMatchInfo$1$2", mo125469f = "FTSMultiItemMusicUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.d0$a */
    public static final class C63975a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63971c0 f181375d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C62070e> f181376e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63975a(C63971c0 c0Var, ArrayList<C62070e> arrayList, C15601d<? super C63975a> dVar) {
            super(2, dVar);
            this.f181375d = c0Var;
            this.f181376e = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63975a(this.f181375d, this.f181376e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63975a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C63971c0 c0Var = this.f181375d;
            ArrayList<C62070e> arrayList = this.f181376e;
            c0Var.getClass();
            C87412m.m108594g(arrayList, "<set-?>");
            c0Var.f181421j = arrayList;
            this.f181375d.f181419h.setValue(C62074i.FINISH);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63974d0(C63971c0 c0Var, ArrayList<C72963f4> arrayList, C15601d<? super C63974d0> dVar) {
        super(2, dVar);
        this.f181373f = c0Var;
        this.f181374g = arrayList;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C63974d0 d0Var = new C63974d0(this.f181373f, this.f181374g, dVar);
        d0Var.f181372e = obj;
        return d0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63974d0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            r29 = this;
            r0 = r29
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f181371d
            r3 = 1
            if (r2 == 0) goto L_0x0018
            if (r2 != r3) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r30)
            goto L_0x01df
        L_0x0010:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r30)
            java.lang.Object r2 = r0.f181372e
            a14.n0 r2 = (a14.C0000n0) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "SearchJob start >> "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.FTSMultiItemMusicUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            sk3.c0 r7 = r0.f181373f
            java.lang.String r7 = r7.f181423o
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x0069
            java.lang.Class<a11.c> r7 = a11.C39479c.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            a11.c r7 = (a11.C39479c) r7
            eb0.m2 r7 = r7.mo62084mr()
            sk3.c0 r8 = r0.f181373f
            java.lang.String r8 = r8.f181423o
            com.tencent.mm.storage.n1 r7 = (com.tencent.p014mm.storage.C44662n1) r7
            com.tencent.mm.storage.m1 r7 = r7.mo69799Lo(r8)
            r5.f27484d = r7
        L_0x0069:
            gy3.e0 r7 = new gy3.e0
            r7.<init>()
            java.util.ArrayList<com.tencent.mm.storage.f4> r8 = r0.f181374g
            sk3.c0 r9 = r0.f181373f
            java.util.Iterator r8 = r8.iterator()
        L_0x0076:
            boolean r10 = r8.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x01c8
            java.lang.Object r10 = r8.next()
            com.tencent.mm.storage.f4 r10 = (com.tencent.p014mm.storage.C72963f4) r10
            boolean r12 = a14.C53930o0.m60560g(r2)
            if (r12 != 0) goto L_0x0091
            java.lang.String r1 = "is no active"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0091:
            java.lang.String r12 = r10.getContent()
            if (r12 == 0) goto L_0x01bb
            com.tencent.mm.message.l$b r12 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r12, r11)
            if (r12 == 0) goto L_0x01bb
            java.util.Date r13 = new java.util.Date
            long r14 = r10.getCreateTime()
            r13.<init>(r14)
            com.tencent.mm.ui.gridviewheaders.a r14 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()
            long r13 = r14.mo103933a(r13)
            r15 = r12
            long r11 = r7.f124000d
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x00c5
            ok3.b r11 = new ok3.b
            r12 = r1
            r16 = r2
            long r1 = r10.getCreateTime()
            r11.<init>(r1)
            r4.add(r11)
            goto L_0x00c8
        L_0x00c5:
            r12 = r1
            r16 = r2
        L_0x00c8:
            java.lang.String r1 = r9.f181423o
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            int r2 = r10.mo108769t2()
            java.lang.String r11 = ""
            if (r2 != r3) goto L_0x00db
            java.lang.String r1 = eb0.C75592q0.m90789s()
            goto L_0x00f1
        L_0x00db:
            if (r1 == 0) goto L_0x00e6
            java.lang.String r1 = r10.getContent()
            java.lang.String r1 = eb0.C75604z3.m90847s(r1)
            goto L_0x00e7
        L_0x00e6:
            r1 = r11
        L_0x00e7:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x00f1
            java.lang.String r1 = r10.mo108768t()
        L_0x00f1:
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r2.get(r1)
            T r3 = r5.f27484d
            if (r3 == 0) goto L_0x0123
            if (r1 == 0) goto L_0x0110
            int r3 = r1.length()
            if (r3 != 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r3 = 0
            goto L_0x0111
        L_0x0110:
            r3 = 1
        L_0x0111:
            if (r3 != 0) goto L_0x0123
            T r3 = r5.f27484d
            com.tencent.mm.storage.m1 r3 = (com.tencent.p014mm.storage.C44661m1) r3
            java.lang.String r1 = r3.mo69789q2(r1)
            java.lang.String r3 = "member.getDisplayName(username)"
            gy3.C87412m.m108593f(r1, r3)
            r27 = r1
            goto L_0x0125
        L_0x0123:
            r27 = r11
        L_0x0125:
            r1 = r15
            java.lang.String r3 = r1.f195602n
            com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118403d(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r9.getActivity()
            java.lang.String r15 = r1.f195634v
            java.lang.String r3 = pb1.C100734q.m131876u(r3, r15)
            eb0.c r15 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r15 = r15.mo105907v()
            r17 = r3
            java.lang.String r3 = r1.f195634v
            com.tencent.mm.storage.z1 r3 = r15.get(r3)
            if (r3 == 0) goto L_0x015b
            java.lang.String r15 = r3.getUsername()
            r28 = r5
            java.lang.String r5 = r1.f195634v
            boolean r5 = gy3.C87412m.m108589b(r15, r5)
            if (r5 != 0) goto L_0x0156
            goto L_0x015d
        L_0x0156:
            java.lang.String r3 = r3.mo62898f()
            goto L_0x0169
        L_0x015b:
            r28 = r5
        L_0x015d:
            eb0.w2 r3 = eb0.C31519v2.m39436a()
            java.lang.String r5 = r1.f195634v
            r15 = 0
            r3.mo55988e(r5, r11, r15)
            r3 = r17
        L_0x0169:
            ok3.d r5 = new ok3.d
            long r18 = r10.getCreateTime()
            int r11 = r1.f195582i
            java.lang.String r15 = r1.f195570f
            long r22 = r10.getMsgId()
            if (r2 == 0) goto L_0x0180
            java.lang.String r17 = r2.getUsername()
            r24 = r17
            goto L_0x0182
        L_0x0180:
            r24 = 0
        L_0x0182:
            if (r2 == 0) goto L_0x018b
            java.lang.String r17 = r2.mo62909j3()
            r25 = r17
            goto L_0x018d
        L_0x018b:
            r25 = 0
        L_0x018d:
            if (r2 == 0) goto L_0x0196
            java.lang.String r2 = r2.mo73969n2()
            r26 = r2
            goto L_0x0198
        L_0x0196:
            r26 = 0
        L_0x0198:
            r17 = r5
            r20 = r11
            r21 = r15
            r17.<init>(r18, r20, r21, r22, r24, r25, r26, r27)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 == 0) goto L_0x01a9
            java.lang.String r3 = r1.f195574g
        L_0x01a9:
            r5.f176454j = r3
            java.lang.String r1 = r1.f195562d
            r5.f176453i = r1
            java.lang.String r1 = r10.mo108765s2()
            r5.f176455k = r1
            r4.add(r5)
            r7.f124000d = r13
            goto L_0x01c0
        L_0x01bb:
            r12 = r1
            r16 = r2
            r28 = r5
        L_0x01c0:
            r1 = r12
            r2 = r16
            r5 = r28
            r3 = 1
            goto L_0x0076
        L_0x01c8:
            r12 = r1
            a14.h0 r1 = a14.C53872d1.f151117a
            a14.k2 r1 = f14.C58901s.f168555a
            sk3.d0$a r2 = new sk3.d0$a
            sk3.c0 r3 = r0.f181373f
            r5 = 0
            r2.<init>(r3, r4, r5)
            r3 = 1
            r0.f181371d = r3
            java.lang.Object r1 = a14.C53895h.m60469g(r1, r2, r0)
            if (r1 != r12) goto L_0x01df
            return r12
        L_0x01df:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C63974d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
