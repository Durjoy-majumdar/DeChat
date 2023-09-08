package il1;

import a14.C0000n0;
import android.content.Context;
import cj1.C54795n5;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import pe3.C89349b;
import qj1.C62660c;
import rx3.C13598b0;
import sx3.C64186f0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansJoinWidget$confirmJoin$1", mo125469f = "FinderLiveFansJoinWidget.kt", mo125470l = {122}, mo125471m = "invokeSuspend")
/* renamed from: il1.w2 */
public final class C9156w2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f28835d;

    /* renamed from: e */
    public Object f28836e;

    /* renamed from: f */
    public Object f28837f;

    /* renamed from: g */
    public Object f28838g;

    /* renamed from: h */
    public int f28839h;

    /* renamed from: i */
    public int f28840i;

    /* renamed from: j */
    public final /* synthetic */ C9184z2 f28841j;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveFansJoinWidget$confirmJoin$1$success$1", mo125469f = "FinderLiveFansJoinWidget.kt", mo125470l = {123}, mo125471m = "invokeSuspend")
    /* renamed from: il1.w2$a */
    public static final class C9157a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f28842d;

        /* renamed from: e */
        public final /* synthetic */ C9184z2 f28843e;

        /* renamed from: f */
        public final /* synthetic */ long f28844f;

        /* renamed from: g */
        public final /* synthetic */ long f28845g;

        /* renamed from: h */
        public final /* synthetic */ String f28846h;

        /* renamed from: i */
        public final /* synthetic */ String f28847i;

        /* renamed from: j */
        public final /* synthetic */ int f28848j;

        /* renamed from: n */
        public final /* synthetic */ int f28849n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9157a(C9184z2 z2Var, long j, long j2, String str, String str2, int i, int i2, C15601d<? super C9157a> dVar) {
            super(2, dVar);
            this.f28843e = z2Var;
            this.f28844f = j;
            this.f28845g = j2;
            this.f28846h = str;
            this.f28847i = str2;
            this.f28848j = i;
            this.f28849n = i2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C9157a(this.f28843e, this.f28844f, this.f28845g, this.f28846h, this.f28847i, this.f28848j, this.f28849n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C9157a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C54795n5 D0;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f28842d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9184z2 z2Var = this.f28843e;
                long j = this.f28844f;
                long j2 = this.f28845g;
                String str = this.f28846h;
                String str2 = this.f28847i;
                int i2 = this.f28848j;
                int i3 = this.f28849n;
                this.f28842d = 1;
                int i4 = C9184z2.f28896y;
                z2Var.getClass();
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                Log.m105924i("FinderLiveFansJoinWidget", "pay, giftId:" + str2 + " price:" + i2 + ",comboId:" + str + ",liveId:" + j + ",objectId:" + j2);
                C62660c basePlugin = z2Var.getBasePlugin();
                if (!(basePlugin == null || (D0 = basePlugin.mo14476D0()) == null)) {
                    Context context = z2Var.f28900n.getContext();
                    Context context2 = context;
                    C87412m.m108593f(context, "root.context");
                    C64186f0 f0Var = C64186f0.f181907d;
                    C9165x2 x2Var = r14;
                    C9165x2 x2Var2 = new C9165x2(z2Var, hVar);
                    C54795n5.C54796a.m61725c(D0, context2, j, j2, str2, i3, i2, str, "", 4, (C89349b) null, f0Var, (String) null, (String) null, x2Var, 6656, (Object) null);
                }
                Object b = hVar.mo90314b();
                return b == aVar ? aVar : b;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9156w2(C9184z2 z2Var, C15601d<? super C9156w2> dVar) {
        super(2, dVar);
        this.f28841j = z2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9156w2(this.f28841j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9156w2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        r4 = ((cl1.C55001u) r4.mo87696x0(r2)).f154420q;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x028f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r0.f28840i
            r5 = 0
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0033
            if (r4 != r7) goto L_0x002b
            int r2 = r0.f28839h
            java.lang.Object r3 = r0.f28838g
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.f28837f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r0.f28836e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f28835d
            qo3.i0 r9 = (qo3.C89779i0) r9
            kotlin.ResultKt.throwOnFailure(r26)
            r10 = r4
            r4 = r26
            goto L_0x0113
        L_0x002b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r26)
            il1.z2 r4 = r0.f28841j
            android.content.Context r4 = r4.getContext()
            il1.z2 r8 = r0.f28841j
            android.content.Context r8 = r8.getContext()
            r9 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r8 = r8.getString(r9)
            r9 = 3
            qo3.i0 r9 = qo3.C89779i0.m112248e(r4, r8, r6, r9, r5)
            il1.z2 r4 = r0.f28841j
            qj1.c r4 = r4.getBasePlugin()
            r10 = 0
            if (r4 == 0) goto L_0x0067
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r2)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            if (r4 == 0) goto L_0x0067
            long r12 = r4.f182392d
            r16 = r12
            goto L_0x0069
        L_0x0067:
            r16 = r10
        L_0x0069:
            il1.z2 r4 = r0.f28841j
            qj1.c r4 = r4.getBasePlugin()
            if (r4 == 0) goto L_0x0079
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r2)
            cl1.u r4 = (cl1.C55001u) r4
            long r10 = r4.f154416j
        L_0x0079:
            r18 = r10
            il1.z2 r4 = r0.f28841j
            qj1.c r4 = r4.getBasePlugin()
            if (r4 == 0) goto L_0x008c
            androidx.lifecycle.i0 r2 = r4.mo87696x0(r2)
            cl1.u r2 = (cl1.C55001u) r2
            byte[] r2 = r2.f154417n
            goto L_0x008d
        L_0x008c:
            r2 = r5
        L_0x008d:
            pe3.C89349b.m111674a(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = eb0.C75592q0.m90789s()
            if (r4 == 0) goto L_0x00a8
            java.nio.charset.Charset r8 = z04.C119027c.f356488a
            byte[] r4 = r4.getBytes(r8)
            java.lang.String r8 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r4, r8)
            goto L_0x00a9
        L_0x00a8:
            r4 = r5
        L_0x00a9:
            java.lang.String r4 = p823sg.C90193h.m112878f(r4)
            r2.append(r4)
            r4 = 95
            r2.append(r4)
            java.util.UUID r4 = java.util.UUID.randomUUID()
            r2.append(r4)
            java.lang.String r8 = r2.toString()
            il1.z2 r2 = r0.f28841j
            ig1.d r4 = r2.f28908v
            if (r4 == 0) goto L_0x00c9
            java.lang.String r10 = r4.field_rewardProductId
            goto L_0x00ca
        L_0x00c9:
            r10 = r5
        L_0x00ca:
            if (r4 == 0) goto L_0x00d2
            float r4 = r4.field_price
            int r4 = (int) r4
            r22 = r4
            goto L_0x00d4
        L_0x00d2:
            r22 = 0
        L_0x00d4:
            qj1.c r2 = r2.getBasePlugin()
            if (r2 == 0) goto L_0x00ea
            fj1.b r2 = r2.mo87684A0()
            if (r2 == 0) goto L_0x00ea
            androidx.lifecycle.i0 r2 = r2.mo71262a(r1)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.f154345o
            if (r2 != 0) goto L_0x00ec
        L_0x00ea:
            java.lang.String r2 = ""
        L_0x00ec:
            a14.h0 r4 = a14.C53872d1.f151119c
            il1.w2$a r11 = new il1.w2$a
            il1.z2 r15 = r0.f28841j
            r24 = 0
            r23 = 1
            r14 = r11
            r20 = r8
            r21 = r10
            r14.<init>(r15, r16, r18, r20, r21, r22, r23, r24)
            r0.f28835d = r9
            r0.f28836e = r8
            r0.f28837f = r10
            r0.f28838g = r2
            r0.f28839h = r7
            r0.f28840i = r7
            java.lang.Object r4 = a14.C53895h.m60469g(r4, r11, r0)
            if (r4 != r3) goto L_0x0111
            return r3
        L_0x0111:
            r3 = r2
            r2 = 1
        L_0x0113:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r9.dismiss()
            il1.z2 r9 = r0.f28841j
            android.widget.TextView r11 = r9.f28902p
            long r12 = r9.f28910x
            java.lang.String r9 = java.lang.String.valueOf(r12)
            r11.setText(r9)
            if (r4 == 0) goto L_0x0344
            il1.z2 r9 = r0.f28841j
            android.content.Context r9 = r9.getContext()
            il1.z2 r11 = r0.f28841j
            android.view.View r11 = r11.f28900n
            android.content.Context r11 = r11.getContext()
            r12 = 2131827358(0x7f111a9e, float:1.9287626E38)
            java.lang.String r11 = r11.getString(r12)
            r12 = 2131756283(0x7f1004fb, float:1.914347E38)
            nj3.C76912y0.m92769h(r9, r11, r12)
            il1.z2 r9 = r0.f28841j
            qj1.c r9 = r9.getBasePlugin()
            if (r9 == 0) goto L_0x0153
            fj1.b r9 = r9.mo87684A0()
            goto L_0x0154
        L_0x0153:
            r9 = r5
        L_0x0154:
            java.lang.String r11 = ",buContext:"
            java.lang.String r12 = "FinderLiveFansJoinWidget"
            java.lang.String r13 = ",comboId:"
            if (r2 <= 0) goto L_0x0259
            if (r8 == 0) goto L_0x0167
            int r14 = r8.length()
            if (r14 != 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r14 = 0
            goto L_0x0168
        L_0x0167:
            r14 = 1
        L_0x0168:
            if (r14 != 0) goto L_0x0259
            if (r9 != 0) goto L_0x016e
            goto L_0x0259
        L_0x016e:
            cj1.y1 r14 = cj1.C0639y1.f1510a
            boolean r15 = r14.mo613e(r10)
            ig1.d r14 = r14.mo612d(r10)
            if (r14 == 0) goto L_0x0234
            te3.xs0 r6 = new te3.xs0
            r6.<init>()
            te3.ju0 r5 = new te3.ju0
            r5.<init>()
            java.lang.String r14 = r14.field_rewardProductId
            r5.f136329d = r14
            byte[] r5 = r5.toByteArray()
            pe3.b r5 = pe3.C89349b.m111674a(r5)
            r6.f144906h = r5
            te3.hx0 r5 = new te3.hx0
            r5.<init>()
            androidx.lifecycle.i0 r14 = r9.mo71262a(r1)
            cl1.o r14 = (cl1.C54991o) r14
            java.util.LinkedList<te3.aw0> r14 = r14.f154320h
            if (r14 == 0) goto L_0x01d7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x01aa:
            boolean r19 = r14.hasNext()
            if (r19 == 0) goto L_0x01cf
            r26 = r4
            java.lang.Object r4 = r14.next()
            r19 = r14
            r14 = r4
            te3.aw0 r14 = (te3.C48770aw0) r14
            int r14 = r14.f130789d
            r0 = 4
            if (r14 == r0) goto L_0x01c2
            r0 = 1
            goto L_0x01c3
        L_0x01c2:
            r0 = 0
        L_0x01c3:
            if (r0 == 0) goto L_0x01c8
            r7.add(r4)
        L_0x01c8:
            r0 = r25
            r4 = r26
            r14 = r19
            goto L_0x01aa
        L_0x01cf:
            r26 = r4
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r7)
            goto L_0x01da
        L_0x01d7:
            r26 = r4
            r0 = 0
        L_0x01da:
            r5.f134930r = r0
            ok1.e r0 = ok1.C62042e.f176370a
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r0.mo87050W(r9)
            r5.f134919d = r4
            int r0 = r0.mo87036R()
            r5.f134926n = r0
            r6.f144914s = r5
            r0 = 20009(0x4e29, float:2.8039E-41)
            r6.f144903e = r0
            nk1.m$b r0 = new nk1.m$b
            r0.<init>(r6)
            r0.f33044h = r8
            r0.f33045i = r2
            r4 = 1
            if (r2 <= r4) goto L_0x0204
            if (r15 == 0) goto L_0x0201
            nk1.m$c r4 = nk1.C61788m.C11209c.SELF_PRECIOUS_GIFT_COMBO
            goto L_0x020b
        L_0x0201:
            nk1.m$c r4 = nk1.C61788m.C11209c.SELF_NORMAL_GIFT_COMBO
            goto L_0x020b
        L_0x0204:
            if (r15 == 0) goto L_0x0209
            nk1.m$c r4 = nk1.C61788m.C11209c.SELF_PRECIOUS_GIFT_SOLO
            goto L_0x020b
        L_0x0209:
            nk1.m$c r4 = nk1.C61788m.C11209c.SELF_NORMAL_GIFT_SOLO
        L_0x020b:
            r0.f33041e = r4
            java.lang.String r4 = "<set-?>"
            gy3.C87412m.m108594g(r3, r4)
            r0.f33051r = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "addLocalGiftMsg local add GiftShowInfo:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            androidx.lifecycle.i0 r3 = r9.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            nk1.m r3 = r3.f154316g
            r3.mo86704b(r0)
            goto L_0x027b
        L_0x0234:
            r26 = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "addLocalGiftMsg giftInfo is null,giftId:"
            r0.append(r3)
            r0.append(r10)
            java.lang.String r3 = ",cnt:"
            r0.append(r3)
            r0.append(r2)
            r0.append(r13)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x027b
        L_0x0259:
            r26 = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "addLocalGiftMsg rewardGiftCnt:"
            r0.append(r3)
            r0.append(r2)
            r0.append(r13)
            r0.append(r8)
            r0.append(r11)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
        L_0x027b:
            r0 = r25
            il1.z2 r3 = r0.f28841j
            qj1.c r3 = r3.getBasePlugin()
            if (r3 == 0) goto L_0x028a
            fj1.b r3 = r3.mo87684A0()
            goto L_0x028b
        L_0x028a:
            r3 = 0
        L_0x028b:
            java.lang.String r4 = "addSelfGiftToComment comboCount:"
            if (r2 <= 0) goto L_0x0325
            if (r8 == 0) goto L_0x029a
            int r5 = r8.length()
            if (r5 != 0) goto L_0x0298
            goto L_0x029a
        L_0x0298:
            r6 = 0
            goto L_0x029b
        L_0x029a:
            r6 = 1
        L_0x029b:
            if (r6 != 0) goto L_0x0325
            if (r3 != 0) goto L_0x02a1
            goto L_0x0325
        L_0x02a1:
            te3.xs0 r5 = new te3.xs0
            r5.<init>()
            te3.hx0 r6 = new te3.hx0
            r6.<init>()
            ok1.e r7 = ok1.C62042e.f176370a
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r7.mo87050W(r3)
            r6.f134919d = r9
            androidx.lifecycle.i0 r1 = r3.mo71262a(r1)
            cl1.o r1 = (cl1.C54991o) r1
            java.util.LinkedList<te3.aw0> r1 = r1.f154320h
            r6.f134930r = r1
            int r1 = r7.mo87036R()
            r6.f134926n = r1
            r5.f144914s = r6
            r1 = 20013(0x4e2d, float:2.8044E-41)
            r5.f144903e = r1
            cj1.d1 r1 = new cj1.d1
            r1.<init>(r5)
            r5 = 1
            r1.f1294d = r5
            te3.tt0 r5 = new te3.tt0
            r5.<init>()
            r5.f142388d = r10
            r5.f142392h = r8
            r5.f142391g = r2
            cj1.y1 r6 = cj1.C0639y1.f1510a
            ig1.d r6 = r6.mo612d(r10)
            if (r6 == 0) goto L_0x02e9
            te3.p11 r6 = r6.mo9725p2()
            goto L_0x02ea
        L_0x02e9:
            r6 = 0
        L_0x02ea:
            r5.f142389e = r6
            r1.f1293c = r5
            java.lang.Class<cl1.z0> r5 = cl1.C0702z0.class
            androidx.lifecycle.i0 r3 = r3.mo71262a(r5)
            cl1.z0 r3 = (cl1.C0702z0) r3
            java.util.List<cj1.o5> r3 = r3.f1672f
            r3.add(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            r3.append(r13)
            r3.append(r8)
            java.lang.String r2 = ",username:"
            r3.append(r2)
            java.lang.String r1 = r1.mo571e()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            y50.k r1 = y50.C53496k.f150436a
            r1.mo74169b()
            goto L_0x0346
        L_0x0325:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r2)
            r1.append(r13)
            r1.append(r8)
            r1.append(r11)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            goto L_0x0346
        L_0x0344:
            r26 = r4
        L_0x0346:
            il1.z2 r1 = r0.f28841j
            qo3.w r2 = r1.f28899j
            if (r2 == 0) goto L_0x034f
            r2.mo5085n()
        L_0x034f:
            r2 = 0
            r1.f28899j = r2
            il1.z2 r1 = r0.f28841j
            fy3.p r1 = r1.getJoinCallBack()
            if (r1 == 0) goto L_0x0365
            il1.z2 r2 = r0.f28841j
            qj1.tg$a r2 = r2.f28909w
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r1.invoke(r2, r3)
        L_0x0365:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9156w2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
