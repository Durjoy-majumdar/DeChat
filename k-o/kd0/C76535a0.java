package kd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;

/* renamed from: kd0.a0 */
public class C76535a0 implements C35141t {

    /* renamed from: d */
    public static final Set<C76538e> f223989d = Collections.synchronizedSet(new HashSet());

    /* renamed from: kd0.a0$a */
    public class C76536a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76538e f223990d;

        /* renamed from: e */
        public final /* synthetic */ C76551y f223991e;

        public C76536a(C76535a0 a0Var, C76538e eVar, C76551y yVar) {
            this.f223990d = eVar;
            this.f223991e = yVar;
        }

        public void run() {
            C76538e eVar = this.f223990d;
            C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
            C76551y yVar = this.f223991e;
            eVar.mo101999b(((C72972g4) LE).h30(yVar.f224052c, yVar.f224054e));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x05dc: MOVE  (r1v17 java.lang.String) = (r26v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x037e  */
    /* renamed from: Fg */
    public ob0.C35136m.C35139b mo56403Fg(ob0.C35136m.C35137a r37) {
        /*
            r36 = this;
            r0 = r37
            java.lang.Class<f62.k0> r7 = f62.C75700k0.class
            te3.j3 r8 = r0.f94242a
            r9 = 0
            java.lang.String r10 = "MicroMsg.VoiceMsgExtension"
            if (r8 != 0) goto L_0x0011
            java.lang.String r0 = "onPreAddMessage cmdAM is null , give up."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            return r9
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "summerbadcr parseVoiceMsg srvId:"
            r1.append(r2)
            long r2 = r8.f227638r
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            te3.rv3 r1 = r8.f227628e
            java.lang.String r1 = sf0.C48374j0.m53718g(r1)
            java.lang.String r2 = eb0.C75592q0.m90789s()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0040
            te3.rv3 r2 = r8.f227629f
            java.lang.String r2 = sf0.C48374j0.m53718g(r2)
            r11 = r2
            goto L_0x0041
        L_0x0040:
            r11 = r1
        L_0x0041:
            k40.a r2 = f40.C86709a0.m107533q(r7)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            long r3 = r8.f227638r
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.h30(r11, r3)
            long r3 = r2.getMsgId()
            r12 = 0
            r14 = 0
            r15 = 1
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x009f
            long r2 = r2.getCreateTime()
            r4 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 + r4
            int r4 = r8.f227635o
            long r4 = (long) r4
            long r4 = eb0.C75604z3.m90841m(r11, r4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x009f
            java.lang.Object[] r2 = new java.lang.Object[r15]
            long r3 = r8.f227638r
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r14] = r3
            java.lang.String r3 = "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r3, r2)
            long r2 = r8.f227638r
            eb0.C75604z3.m90835g(r11, r2)
            kd0.g0 r2 = kd0.C76546u.yx0()
            long r3 = r8.f227638r
            kd0.y r2 = r2.mo106781Lo(r3)
            if (r2 == 0) goto L_0x009f
            java.lang.String r3 = r2.f224051b
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x009f
            java.lang.String r2 = r2.f224051b
            kd0.C76552z.m92069g(r2)
        L_0x009f:
            kd0.y r6 = new kd0.y
            r6.<init>()
            r6.f224052c = r11
            int r2 = r8.f227635o
            long r2 = (long) r2
            r6.f224059j = r2
            long r2 = r8.f227638r
            r6.f224054e = r2
            java.lang.String r2 = r8.f227636p
            r6.f224066q = r2
            java.lang.Object[] r3 = new java.lang.Object[r15]
            r3[r14] = r2
            java.lang.String r2 = "voiceMsgExtension, onPreAddMessage.(MsgSource : %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r2, r3)
            te3.rv3 r2 = r8.f227631h
            java.lang.String r2 = sf0.C48374j0.m53718g(r2)
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            if (r1 == 0) goto L_0x00e2
            java.lang.String r2 = eb0.C75604z3.m90849u(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "chatroom voicemsg, new content="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x00f6
        L_0x00e2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "normal contact voicemsg, content="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
        L_0x00f6:
            java.lang.String r1 = "msg"
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r1, r9)
            if (r1 != 0) goto L_0x010c
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 111(0x6f, double:5.5E-322)
            r19 = 227(0xe3, double:1.12E-321)
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            return r9
        L_0x010c:
            java.lang.String r2 = ".msg.voicemsg.$length"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0613 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0613 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0613 }
            r6.f224055f = r2     // Catch:{ Exception -> 0x0613 }
            java.lang.String r2 = ".msg.voicemsg.$clientmsgid"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0613 }
            r6.f224053d = r2     // Catch:{ Exception -> 0x0613 }
            java.lang.String r2 = ".msg.voicemsg.$endflag"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0613 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0613 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0613 }
            java.lang.String r3 = ".msg.voicemsg.$cancelflag"
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0613 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0613 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0613 }
            java.lang.String r4 = ".msg.voicemsg.$voicelength"
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0613 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0613 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0613 }
            r6.f224061l = r4     // Catch:{ Exception -> 0x0613 }
            java.lang.String r4 = ".msg.voicemsg.$fromusername"
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0613 }
            r6.f224063n = r4     // Catch:{ Exception -> 0x0613 }
            java.lang.String r4 = ".msg.commenturl"
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0613 }
            java.lang.String r5 = ".msg.voicemsg.$forwardflag"
            java.lang.Object r5 = r1.get(r5)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0613 }
            java.lang.String r14 = "0"
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r14)     // Catch:{ Exception -> 0x0613 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0613 }
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0613 }
            r6.f224073x = r5     // Catch:{ Exception -> 0x0613 }
            java.lang.String r5 = ".msg.voicemsg.$voiceformat"
            java.lang.Object r5 = r1.get(r5)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0613 }
            r6.f224065p = r5     // Catch:{ Exception -> 0x0613 }
            java.lang.String r5 = ".msg.voicemsg.$bufid"
            java.lang.Object r5 = r1.get(r5)     // Catch:{ Exception -> 0x0613 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0613 }
            r17 = r10
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r12)     // Catch:{ Exception -> 0x060d }
            r6.f224069t = r9     // Catch:{ Exception -> 0x060d }
            te3.jt4 r5 = new te3.jt4     // Catch:{ Exception -> 0x060d }
            r5.<init>()     // Catch:{ Exception -> 0x060d }
            java.lang.String r9 = ".msg.voicemsg.$voiceurl"
            java.lang.Object r9 = r1.get(r9)     // Catch:{ Exception -> 0x060d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x060d }
            r5.f183841d = r9     // Catch:{ Exception -> 0x060d }
            java.lang.String r9 = ".msg.voicemsg.$aeskey"
            java.lang.Object r1 = r1.get(r9)     // Catch:{ Exception -> 0x060d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x060d }
            r5.f183842e = r1     // Catch:{ Exception -> 0x060d }
            r6.f224072w = r5     // Catch:{ Exception -> 0x060d }
            if (r3 != r15) goto L_0x01e6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cancelFlag = 1 srvId:"
            r0.append(r1)
            long r1 = r8.f227638r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r9, r0)
            kd0.g0 r0 = kd0.C76546u.yx0()
            long r1 = r6.f224054e
            kd0.y r0 = r0.mo106781Lo(r1)
            if (r0 == 0) goto L_0x01e4
            java.lang.String r0 = r0.f224051b
            kd0.C76552z.m92063a(r0)
        L_0x01e4:
            r1 = 0
            return r1
        L_0x01e6:
            r9 = r17
            if (r2 != r15) goto L_0x0204
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endFlag = 1 srvId:"
            r1.append(r2)
            long r2 = r8.f227638r
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r9, r1)
            int r1 = r6.f224055f
            r6.f224057h = r1
        L_0x0204:
            r1 = 2381486(0x2456ae, float:3.337173E-39)
            r6.f224050a = r1
            te3.qv3 r1 = r8.f227634n
            byte[] r1 = sf0.C48374j0.m53715d(r1)
            if (r1 == 0) goto L_0x0230
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Voice Buf Len:"
            r2.append(r3)
            int r3 = r1.length
            r2.append(r3)
            java.lang.String r3 = " srvId:"
            r2.append(r3)
            long r12 = r8.f227638r
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r2)
        L_0x0230:
            int r3 = r8.f227632i
            java.lang.String r5 = r8.f227636p
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<ob0.r>> r2 = kd0.C76552z.f224074a
            nj.g$a r10 = new nj.g$a
            r10.<init>()
            java.lang.String r12 = "MicroMsg.VoiceLogic"
            kd0.g0 r2 = kd0.C76546u.yx0()
            long r14 = r6.f224054e
            kd0.y r14 = r2.mo106781Lo(r14)
            r2 = 99
            if (r14 == 0) goto L_0x025b
            int r15 = r14.f224058i
            if (r15 != r2) goto L_0x025b
            r27 = r7
            r25 = r8
            r24 = r9
            r26 = r11
        L_0x0257:
            r0 = 0
            r9 = r6
            goto L_0x0530
        L_0x025b:
            k40.a r15 = f40.C86709a0.m107533q(r7)
            f62.k0 r15 = (f62.C75700k0) r15
            g62.l r15 = r15.mo96095LE()
            java.lang.String r13 = r6.f224052c
            r23 = r3
            long r2 = r6.f224054e
            com.tencent.mm.storage.g4 r15 = (com.tencent.p014mm.storage.C72972g4) r15
            com.tencent.mm.storage.f4 r2 = r15.h30(r13, r2)
            long r2 = r2.mo108774y2()
            r13 = r7
            r15 = r8
            long r7 = r6.f224054e
            int r24 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r24 != 0) goto L_0x0288
            if (r14 != 0) goto L_0x0288
            r24 = r9
            r26 = r11
            r27 = r13
            r25 = r15
            goto L_0x0257
        L_0x0288:
            if (r14 == 0) goto L_0x028f
            java.lang.String r2 = r14.f224051b
            r6.f224051b = r2
            goto L_0x0299
        L_0x028f:
            java.lang.String r2 = r6.f224063n
            java.lang.String r3 = "amr_"
            java.lang.String r2 = kd0.C76541g0.m92032SQ(r2, r3)
            r6.f224051b = r2
        L_0x0299:
            int r2 = r6.f224050a
            r3 = 1
            r2 = r2 | r3
            r6.f224050a = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = p206nj.C76861g.m92660c()
            r2.append(r3)
            java.lang.String r7 = "checktime :"
            r2.append(r7)
            r24 = r9
            long r8 = r10.mo72288a()
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            if (r1 == 0) goto L_0x03a1
            int r2 = r1.length
            r3 = 1
            if (r2 <= r3) goto L_0x03a1
            if (r14 == 0) goto L_0x02cd
            java.lang.String r2 = "Sync Voice Buf , But VoiceInfo is not new!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
        L_0x02cd:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r8 = r6.f224065p
            java.lang.String r9 = r6.f224051b
            r25 = r15
            kd0.d r15 = kd0.C76552z.m92074l(r8, r9)
            r26 = r11
            int r11 = r1.length
            r27 = r13
            r13 = 0
            int r11 = r15.mo106768a(r1, r11, r13)
            java.lang.String r13 = " voiceFormat:"
            if (r11 >= 0) goto L_0x030c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Write Failed File:"
            r15.append(r0)
            r15.append(r9)
            java.lang.String r0 = " newOffset:"
            r15.append(r0)
            r15.append(r11)
            r15.append(r13)
            r15.append(r8)
            java.lang.String r0 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x033a
        L_0x030c:
            int r0 = r1.length
            if (r0 == r11) goto L_0x033c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r15 = "Write File:"
            r0.append(r15)
            r0.append(r9)
            java.lang.String r9 = " fileOff:"
            r0.append(r9)
            r0.append(r11)
            java.lang.String r9 = " bufLen:"
            r0.append(r9)
            int r9 = r1.length
            r0.append(r9)
            r0.append(r13)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x033a:
            r0 = 0
            goto L_0x0364
        L_0x033c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "writeVoiceFile file:["
            r0.append(r11)
            r0.append(r9)
            java.lang.String r11 = "] + buf:"
            r0.append(r11)
            int r11 = r1.length
            r0.append(r11)
            r0.append(r13)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            kd0.C76552z.m92067e(r9)
            r0 = 1
        L_0x0364:
            java.lang.String r8 = r6.f224052c
            boolean r33 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            if (r0 == 0) goto L_0x037e
            java.lang.String r8 = r6.f224051b
            r29 = 4
            r30 = 100
            long r31 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            r34 = 0
            r28 = r8
            kd0.C21321k.m23907a(r28, r29, r30, r31, r33, r34)
            goto L_0x038f
        L_0x037e:
            java.lang.String r8 = r6.f224051b
            r29 = 4
            r30 = 210(0xd2, float:2.94E-43)
            long r31 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            r34 = 0
            r28 = r8
            kd0.C21321k.m23907a(r28, r29, r30, r31, r33, r34)
        L_0x038f:
            int r2 = r6.f224070u
            int r3 = r1.length
            r8 = 0
            int r1 = kd0.C76552z.m92070h(r2, r1, r8, r3)
            r6.f224070u = r1
            int r1 = r6.f224050a
            r2 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r2
            r6.f224050a = r1
            goto L_0x03a8
        L_0x03a1:
            r26 = r11
            r27 = r13
            r25 = r15
            r0 = 0
        L_0x03a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            r1.append(r7)
            long r2 = r10.mo72288a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r8
            r6.f224060k = r1
            int r1 = r6.f224050a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r6.f224050a = r1
            if (r0 == 0) goto L_0x03db
            r2 = 99
            r6.f224058i = r2
            goto L_0x03e6
        L_0x03db:
            int r2 = r6.f224057h
            if (r2 != 0) goto L_0x03e3
            r2 = 5
            r6.f224058i = r2
            goto L_0x03e6
        L_0x03e3:
            r2 = 6
            r6.f224058i = r2
        L_0x03e6:
            r1 = r1 | 64
            r6.f224050a = r1
            java.lang.String r8 = " stat:"
            if (r14 != 0) goto L_0x04ba
            r1 = r6
            r2 = r0
            r3 = r23
            r9 = r6
            r6 = r37
            long r1 = kd0.C76552z.m92068f(r1, r2, r3, r4, r5, r6)
            int r2 = (int) r1
            long r1 = (long) r2
            r9.f224062m = r1
            int r1 = eb0.C75604z3.m90845q(r37)
            r9.f224067r = r1
            r1 = r37
            te3.j3 r2 = r1.f94242a
            if (r2 == 0) goto L_0x040d
            int r2 = r2.f227639s
            r9.f224068s = r2
        L_0x040d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = p206nj.C76861g.m92660c()
            r2.append(r3)
            r2.append(r7)
            long r3 = r10.mo72288a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            r2 = -1
            r9.f224050a = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Insert fileName:"
            r2.append(r3)
            java.lang.String r3 = r9.f224051b
            r2.append(r3)
            r2.append(r8)
            int r3 = r9.f224058i
            r2.append(r3)
            java.lang.String r3 = " net:"
            r2.append(r3)
            int r4 = r9.f224055f
            r2.append(r4)
            java.lang.String r4 = " total:"
            r2.append(r4)
            int r5 = r9.f224057h
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            kd0.g0 r2 = kd0.C76546u.yx0()
            boolean r2 = r2.mo106783Yt(r9)
            if (r2 != 0) goto L_0x049a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Insert Error fileName:"
            r0.append(r1)
            java.lang.String r1 = r9.f224051b
            r0.append(r1)
            r0.append(r8)
            int r1 = r9.f224058i
            r0.append(r1)
            r0.append(r3)
            int r1 = r9.f224055f
            r0.append(r1)
            r0.append(r4)
            int r1 = r9.f224057h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            r0 = -2
            goto L_0x0530
        L_0x049a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = p206nj.C76861g.m92660c()
            r2.append(r3)
            r2.append(r7)
            long r3 = r10.mo72288a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            if (r0 == 0) goto L_0x04eb
            goto L_0x04e9
        L_0x04ba:
            r1 = r37
            r9 = r6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Sync Update file:"
            r2.append(r3)
            java.lang.String r3 = r9.f224051b
            r2.append(r3)
            r2.append(r8)
            int r3 = r9.f224058i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            boolean r2 = kd0.C76552z.m92088z(r9)
            if (r2 != 0) goto L_0x04e4
            r0 = -44
            goto L_0x0530
        L_0x04e4:
            if (r0 == 0) goto L_0x04eb
            kd0.C76552z.m92087y(r9, r1)
        L_0x04e9:
            r0 = 1
            goto L_0x0530
        L_0x04eb:
            if (r14 == 0) goto L_0x050e
            int r2 = r14.f224056g
            int r3 = r9.f224057h
            if (r2 != r3) goto L_0x050e
            java.lang.String r3 = r14.f224051b
            kd0.C76552z.m92086x(r3, r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Sync TotalLen not Change (send endflag but TotoalLen == FileLen) :"
            r2.append(r3)
            java.lang.String r3 = r14.f224051b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r2)
        L_0x050e:
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1 = 1
            r3[r1] = r0
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r1 = 2
            r3[r1] = r0
            java.lang.String r0 = "summerbadcr setRecvSync end ret 0 and start run addMsgInfo[%s], syncWithBufSucc[%b], stack[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r3)
            qh.o r0 = kd0.C76546u.xx0()
            r0.mo107480e()
            r0 = 0
        L_0x0530:
            if (r0 <= 0) goto L_0x059e
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r1[r2] = r0
            r2 = r25
            long r3 = r2.f227638r
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = 1
            r1[r3] = r0
            int r0 = r2.f227639s
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = "summerbadcr parseVoiceMsg setRecvSync[%d], svrId[%d], msgseq[%d]"
            r3 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r1)
            com.tencent.mm.plugin.report.service.n r28 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r29 = 111(0x6f, double:5.5E-322)
            r31 = 228(0xe4, double:1.126E-321)
            r33 = 1
            r35 = 0
            r28.idkeyStat(r29, r31, r33, r35)
            k40.a r0 = f40.C86709a0.m107533q(r27)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            java.lang.String r1 = r9.f224052c
            long r2 = r9.f224054e
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.h30(r1, r2)
            r1 = 0
            r0.mo101007n4(r1)
            java.util.Set<kd0.e> r1 = f223989d
            java.util.Iterator r1 = r1.iterator()
        L_0x0583:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r1.next()
            kd0.e r2 = (kd0.C76538e) r2
            kd0.a0$a r3 = new kd0.a0$a
            r4 = r36
            r3.<init>(r4, r2, r9)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
            goto L_0x0583
        L_0x059a:
            r4 = r36
            r9 = r0
            goto L_0x05ce
        L_0x059e:
            r4 = r36
            r3 = r24
            r2 = r25
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r1[r5] = r0
            long r5 = r2.f227638r
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r5 = 1
            r1[r5] = r0
            int r0 = r2.f227639s
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r1[r2] = r0
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "summerbadcr parseVoiceMsg setRecvSync[%d], svrId[%d], msgseq[%d], stack[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r1)
            r9 = 0
        L_0x05ce:
            if (r9 == 0) goto L_0x05f8
            k40.a r0 = f40.C86709a0.m107533q(r27)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r1 = r26
            com.tencent.mm.storage.h2 r0 = r0.mo69771j(r1)
            if (r0 == 0) goto L_0x05f8
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0.mo108373l3(r2)
            k40.a r2 = f40.C86709a0.m107533q(r27)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            r2.mo69773k0(r0, r1)
        L_0x05f8:
            ob0.m$b r0 = new ob0.m$b
            if (r9 == 0) goto L_0x0608
            long r1 = r9.getMsgId()
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0608
            r14 = 1
            goto L_0x0609
        L_0x0608:
            r14 = 0
        L_0x0609:
            r0.<init>(r9, r14)
            return r0
        L_0x060d:
            r0 = move-exception
            r4 = r36
            r3 = r17
            goto L_0x0617
        L_0x0613:
            r0 = move-exception
            r4 = r36
            r3 = r10
        L_0x0617:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 111(0x6f, double:5.5E-322)
            r8 = 227(0xe3, double:1.12E-321)
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            java.lang.String r1 = "parsing voice msg xml failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C76535a0.mo56403Fg(ob0.m$a):ob0.m$b");
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
        C72963f4 f4Var = cVar.f94250a;
        Log.m105924i("MicroMsg.VoiceMsgExtension", "onPreDelMessage " + f4Var.mo108765s2() + " " + f4Var.mo108768t());
        if (!C72996z1.m85803I5(f4Var.mo108768t())) {
            C76552z.m92069g(f4Var.mo108765s2());
        }
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
