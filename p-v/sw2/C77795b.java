package sw2;

import com.tencent.p014mm.autogen.events.ExtTranslateVoiceEvent;
import com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext.C43182a;
import com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext.C43183b;
import com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext.C43184c;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30745h5;
import eb0.C97625j3;
import java.util.HashMap;
import java.util.Map;
import kd0.C76551y;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import te3.rt4;
import te3.yn4;

/* renamed from: sw2.b */
public class C77795b extends IStaticListener<ExtTranslateVoiceEvent> implements C11385n {

    /* renamed from: B */
    public static C30745h5 f226652B;

    /* renamed from: A */
    public boolean f226653A = false;

    /* renamed from: d */
    public C43182a f226654d;

    /* renamed from: e */
    public C43184c f226655e;

    /* renamed from: f */
    public C43183b f226656f;

    /* renamed from: g */
    public C76551y f226657g;

    /* renamed from: h */
    public int f226658h;

    /* renamed from: i */
    public volatile boolean f226659i = false;

    /* renamed from: j */
    public boolean f226660j = false;

    /* renamed from: n */
    public MTimerHandler f226661n;

    /* renamed from: o */
    public ExtTranslateVoiceEvent f226662o;

    /* renamed from: p */
    public boolean f226663p;

    /* renamed from: q */
    public int f226664q;

    /* renamed from: r */
    public Map<String, String> f226665r = new HashMap();

    /* renamed from: s */
    public int f226666s;

    /* renamed from: t */
    public String f226667t;

    /* renamed from: u */
    public String f226668u;

    /* renamed from: v */
    public boolean f226669v = true;

    /* renamed from: w */
    public long f226670w = 0;

    /* renamed from: x */
    public int f226671x;

    /* renamed from: y */
    public int f226672y;

    /* renamed from: z */
    public long f226673z;

    /* renamed from: sw2.b$a */
    public enum C77796a {
        CHECK,
        UPLOAD,
        UPLOAD_MORE,
        GET,
        FINISH,
        CANCEL,
        CANCEL_BY_USER,
        LOCAL_ERROR,
        SERVER_ERROR,
        NETWORK_OVERTIME
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x024f, code lost:
        if (r2 != null) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0262, code lost:
        if (r2 == null) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r2.mo106769b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r0 = (com.tencent.p014mm.autogen.events.ExtTranslateVoiceEvent) r0
            sw2.b$a r2 = sw2.C77795b.C77796a.FINISH
            sw2.b$a r3 = sw2.C77795b.C77796a.LOCAL_ERROR
            sw2.b$a r4 = sw2.C77795b.C77796a.CANCEL
            boolean r5 = r0 instanceof com.tencent.p014mm.autogen.events.ExtTranslateVoiceEvent
            r6 = 0
            r7 = 1
            java.lang.String r8 = "ExtTranslateVoiceEventListener"
            if (r5 != 0) goto L_0x001b
            java.lang.String r0 = "mismatched event"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r8, r0)
            goto L_0x0289
        L_0x001b:
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r5 = r0.f193561d
            int r5 = r5.f193565c
            r9 = 2
            if (r5 != r9) goto L_0x0033
            r1.mo107934q(r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f226665r
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            java.lang.String r0 = "Have clear the cache of the translate voice results."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x0272
        L_0x0033:
            if (r5 != r7) goto L_0x003f
            r1.mo107934q(r4)
            java.lang.String r0 = "Have cancel translate voice action."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x0272
        L_0x003f:
            r4 = 3
            if (r5 != r4) goto L_0x004e
            sw2.b$a r0 = sw2.C77795b.C77796a.CANCEL_BY_USER
            r1.mo107934q(r0)
            java.lang.String r0 = "alvinluo Have cancel translate voice action by user."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x0272
        L_0x004e:
            if (r5 == 0) goto L_0x0065
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r2 = r1.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r2 = r2.f193561d
            int r2 = r2.f193565c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r6] = r2
            java.lang.String r2 = "The opCode(%d) is out of range."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r0)
            goto L_0x0289
        L_0x0065:
            boolean r5 = r1.f226663p
            if (r5 == 0) goto L_0x0070
            java.lang.String r0 = "The Event handler is busy."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x0289
        L_0x0070:
            kd0.g0 r5 = kd0.C76546u.yx0()
            if (r5 != 0) goto L_0x0090
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SubCoreVoice.getVoiceStg() == null"
            r0.append(r2)
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0289
        L_0x0090:
            r1.f226662o = r0
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r5 = r0.f193561d
            java.lang.String r10 = r5.f193564b
            java.lang.String r5 = r5.f193563a
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x027b
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r11 == 0) goto L_0x00a6
            goto L_0x027b
        L_0x00a6:
            r1.f226669v = r7
            r11 = 0
            r1.f226670w = r11
            r1.f226673z = r11
            r1.f226671x = r6
            r1.f226672y = r6
            r1.f226653A = r6
            java.util.Map<java.lang.String, java.lang.String> r13 = r1.f226665r
            java.util.HashMap r13 = (java.util.HashMap) r13
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 != 0) goto L_0x00d4
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r6] = r10
            r0[r7] = r5
            java.lang.String r3 = "finish With Cache localId:%s,fileName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r0)
            r1.mo107933d(r13, r2)
            goto L_0x0272
        L_0x00d4:
            com.tencent.mm.storage.i5 r13 = kd0.C76546u.wx0()
            com.tencent.mm.storage.h5 r13 = r13.mo57655jo(r5)
            f226652B = r13
            if (r13 == 0) goto L_0x00fc
            java.lang.String r13 = r13.field_content
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x00fc
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r6] = r10
            r0[r7] = r5
            java.lang.String r3 = "finish With DB localId:%s,fileName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r0)
            com.tencent.mm.storage.h5 r0 = f226652B
            java.lang.String r0 = r0.field_content
            r1.mo107933d(r0, r2)
            goto L_0x0272
        L_0x00fc:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r13 = r0.f193561d
            int r13 = r13.f193568f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2[r6] = r13
            java.lang.String r13 = "alvinluo transform test voice scene: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r2)
            kd0.g0 r2 = kd0.C76546u.yx0()
            kd0.y r2 = r2.mo106785jo(r5)
            r1.f226657g = r2
            if (r2 != 0) goto L_0x0180
            java.lang.String r2 = "alvinluo the VoiceInfo do not exist. (localId : %s, fileName : %s)"
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0173 }
            r13[r6] = r10     // Catch:{ Exception -> 0x0173 }
            r13[r7] = r5     // Catch:{ Exception -> 0x0173 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r13)     // Catch:{ Exception -> 0x0173 }
            kd0.y r2 = new kd0.y     // Catch:{ Exception -> 0x0173 }
            r2.<init>()     // Catch:{ Exception -> 0x0173 }
            r1.f226657g = r2     // Catch:{ Exception -> 0x0173 }
            r2.f224051b = r5     // Catch:{ Exception -> 0x0173 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0173 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r15
            r2.f224059j = r13     // Catch:{ Exception -> 0x0173 }
            kd0.y r2 = r1.f226657g     // Catch:{ Exception -> 0x0173 }
            r2.f224053d = r5     // Catch:{ Exception -> 0x0173 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0173 }
            long r13 = r13 / r15
            r2.f224060k = r13     // Catch:{ Exception -> 0x0173 }
            kd0.y r2 = r1.f226657g     // Catch:{ Exception -> 0x0173 }
            r2.f224058i = r7     // Catch:{ Exception -> 0x0173 }
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r0 = r0.f193561d     // Catch:{ Exception -> 0x0173 }
            int r0 = r0.f193568f     // Catch:{ Exception -> 0x0173 }
            r13 = 8
            if (r0 != r13) goto L_0x0152
            r13 = -1
            r2.f224062m = r13     // Catch:{ Exception -> 0x0173 }
            goto L_0x015d
        L_0x0152:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0173 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0173 }
            long r13 = (long) r0     // Catch:{ Exception -> 0x0173 }
            r2.f224062m = r13     // Catch:{ Exception -> 0x0173 }
        L_0x015d:
            int r0 = kd0.C76550x.m92055d(r5)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r2 = "size : %d"
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0173 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0173 }
            r5[r6] = r10     // Catch:{ Exception -> 0x0173 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r5)     // Catch:{ Exception -> 0x0173 }
            kd0.y r2 = r1.f226657g     // Catch:{ Exception -> 0x0173 }
            r2.f224057h = r0     // Catch:{ Exception -> 0x0173 }
            goto L_0x0180
        L_0x0173:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r4 = "alvinluo set voiceInfo exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r4, r2)
            r1.mo107934q(r3)
            goto L_0x0272
        L_0x0180:
            java.lang.Class<ug.w> r0 = p248ug.C78161w.class
            kd0.y r2 = r1.f226657g
            long r2 = r2.f224062m
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x0191
            java.lang.String r0 = "alvinluo voiceInfo msgLocalId < 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x0216
        L_0x0191:
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            kd0.y r3 = r1.f226657g
            long r10 = r3.f224062m
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r10)
            int r3 = r2.mo108769t2()
            java.lang.String r5 = ""
            r10 = 5
            r11 = 4
            if (r3 != r7) goto L_0x01e1
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r1.f226667t = r3
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r3 = r1.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r3 = r3.f193561d
            int r3 = r3.f193568f
            if (r3 == r11) goto L_0x01c9
            if (r3 != r10) goto L_0x01c2
            goto L_0x01c9
        L_0x01c2:
            java.lang.String r0 = r2.mo108768t()
            r1.f226668u = r0
            goto L_0x0216
        L_0x01c9:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ug.w r0 = (p248ug.C78161w) r0
            long r2 = r2.mo108759l2()
            sb0.c r0 = r0.mo71124a0(r2)
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = r0.field_bizChatServId
            r1.f226668u = r0
            goto L_0x0216
        L_0x01de:
            r1.f226668u = r5
            goto L_0x0216
        L_0x01e1:
            int r3 = r2.mo108769t2()
            if (r3 != 0) goto L_0x0216
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r1.f226668u = r3
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r3 = r1.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r3 = r3.f193561d
            int r3 = r3.f193568f
            if (r3 == r11) goto L_0x01ff
            if (r3 != r10) goto L_0x01f8
            goto L_0x01ff
        L_0x01f8:
            java.lang.String r0 = r2.mo108768t()
            r1.f226667t = r0
            goto L_0x0216
        L_0x01ff:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ug.w r0 = (p248ug.C78161w) r0
            long r2 = r2.mo108759l2()
            sb0.c r0 = r0.mo71124a0(r2)
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = r0.field_bizChatServId
            r1.f226667t = r0
            goto L_0x0216
        L_0x0214:
            r1.f226667t = r5
        L_0x0216:
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r0 = r1.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r0 = r0.f193561d
            int r0 = r0.f193568f
            r1.f226666s = r0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = r1.f226667t
            r2[r6] = r3
            java.lang.String r3 = r1.f226668u
            r2[r7] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r9] = r0
            java.lang.String r0 = "alvinluo VoiceTransformText fromUser: %s, toUser: %s, scene: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r2)
            r2 = 0
            r3 = -1
            java.lang.Class<dn.t> r0 = p492dn.C75415t.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0252 }
            dn.t r0 = (p492dn.C75415t) r0     // Catch:{ all -> 0x0252 }
            kd0.y r4 = r1.f226657g     // Catch:{ all -> 0x0252 }
            java.lang.String r4 = r4.f224051b     // Catch:{ all -> 0x0252 }
            kd0.d r2 = r0.w20(r4)     // Catch:{ all -> 0x0252 }
            if (r2 == 0) goto L_0x024c
            int r0 = r2.getFormat()     // Catch:{ all -> 0x0252 }
            goto L_0x024d
        L_0x024c:
            r0 = -1
        L_0x024d:
            r1.f226658h = r0     // Catch:{ all -> 0x0252 }
            if (r2 == 0) goto L_0x0267
            goto L_0x0264
        L_0x0252:
            r0 = move-exception
            java.lang.String r4 = "[-] Fail to get FileOperator for: %s"
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x0274 }
            kd0.y r9 = r1.f226657g     // Catch:{ all -> 0x0274 }
            java.lang.String r9 = r9.f224051b     // Catch:{ all -> 0x0274 }
            r5[r6] = r9     // Catch:{ all -> 0x0274 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r4, r5)     // Catch:{ all -> 0x0274 }
            r1.f226658h = r3     // Catch:{ all -> 0x0274 }
            if (r2 == 0) goto L_0x0267
        L_0x0264:
            r2.mo106769b()     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r1.f226663p = r7
            r0 = 20
            r1.f226664q = r0
            sw2.b$a r0 = sw2.C77795b.C77796a.CHECK
            r1.mo107934q(r0)
        L_0x0272:
            r6 = 1
            goto L_0x0289
        L_0x0274:
            r0 = move-exception
            if (r2 == 0) goto L_0x027a
            r2.mo106769b()     // Catch:{ all -> 0x027a }
        L_0x027a:
            throw r0
        L_0x027b:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r6] = r10
            r0[r7] = r5
            java.lang.String r2 = "The localId(%s) is null or fileName(%s) is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r2, r0)
            r1.mo107934q(r3)
        L_0x0289:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sw2.C77795b.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x014b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107933d(java.lang.String r13, sw2.C77795b.C77796a r14) {
        /*
            r12 = this;
            sw2.b$a r0 = sw2.C77795b.C77796a.LOCAL_ERROR
            sw2.b$a r1 = sw2.C77795b.C77796a.SERVER_ERROR
            sw2.b$a r2 = sw2.C77795b.C77796a.CANCEL
            sw2.b$a r3 = sw2.C77795b.C77796a.FINISH
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r14
            java.lang.String r7 = "ExtTranslateVoiceEventListener"
            java.lang.String r8 = "finishWithResult mstate:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
            com.tencent.mm.sdk.platformtools.MTimerHandler r5 = r12.f226661n
            if (r5 == 0) goto L_0x001c
            r5.stopTimer()
        L_0x001c:
            ob0.b0 r5 = eb0.C97625j3.m125815e()
            r8 = 546(0x222, float:7.65E-43)
            r5.mo123470p(r8, r12)
            ob0.b0 r5 = eb0.C97625j3.m125815e()
            r8 = 547(0x223, float:7.67E-43)
            r5.mo123470p(r8, r12)
            ob0.b0 r5 = eb0.C97625j3.m125815e()
            r8 = 548(0x224, float:7.68E-43)
            r5.mo123470p(r8, r12)
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r5 = r12.f226662o
            r8 = 2
            if (r5 == 0) goto L_0x00e2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r5 != 0) goto L_0x00a4
            java.util.Map<java.lang.String, java.lang.String> r5 = r12.f226665r
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r9 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r9 = r9.f193561d
            java.lang.String r9 = r9.f193563a
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.put(r9, r13)
            com.tencent.mm.storage.h5 r5 = f226652B
            if (r5 == 0) goto L_0x005b
            java.lang.String r5 = r5.field_content
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x00bb
        L_0x005b:
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r5 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r5 = r5.f193561d
            int r5 = r5.f193566d
            if (r5 != r4) goto L_0x00bb
            com.tencent.mm.storage.i5 r5 = kd0.C76546u.wx0()
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r10 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r10 = r10.f193561d
            java.lang.String r11 = r10.f193564b
            r9[r6] = r11
            java.lang.String r10 = r10.f193563a
            r9[r4] = r10
            java.lang.String r10 = "createVoiceTT localId(%s) , fileName(%s)."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r9)
            com.tencent.mm.storage.h5 r9 = new com.tencent.mm.storage.h5
            r9.<init>()
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r10 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r10 = r10.f193561d
            java.lang.String r10 = r10.f193564b
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            long r10 = r10.longValue()
            r9.field_msgId = r10
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r10 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r10 = r10.f193561d
            java.lang.String r10 = r10.f193563a
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r9.field_cmsgId = r10
        L_0x009e:
            r9.field_content = r13
            r5.insert(r9)
            goto L_0x00bb
        L_0x00a4:
            if (r14 != r3) goto L_0x00bb
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r9 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r9 = r9.f193561d
            java.lang.String r9 = r9.f193564b
            r5[r6] = r9
            java.lang.String r9 = "finishWithResult State.FINISH id:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r5)
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r5 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$b r5 = r5.f193562e
            r5.f193571c = r8
        L_0x00bb:
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r5 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$b r5 = r5.f193562e
            r5.f193570b = r4
            r5.f193569a = r13
            if (r14 != r2) goto L_0x00c8
            r5.f193571c = r4
            goto L_0x00ce
        L_0x00c8:
            if (r14 == r0) goto L_0x00cc
            if (r14 != r1) goto L_0x00ce
        L_0x00cc:
            r5.f193571c = r8
        L_0x00ce:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r6] = r13
            java.lang.String r9 = "finishWithResult result : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r9, r5)
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r5 = r12.f226662o
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r5 = r5.f193561d
            java.lang.Runnable r5 = r5.f193567e
            if (r5 == 0) goto L_0x00e2
            r5.run()
        L_0x00e2:
            boolean r5 = r12.f226653A
            if (r5 != 0) goto L_0x00e8
            goto L_0x0156
        L_0x00e8:
            kd0.y r5 = r12.f226657g
            if (r5 != 0) goto L_0x00ee
            goto L_0x0156
        L_0x00ee:
            if (r13 == 0) goto L_0x00f5
            int r5 = r13.length()
            goto L_0x00f6
        L_0x00f5:
            r5 = 0
        L_0x00f6:
            r9 = 4
            r10 = 5
            r11 = 3
            if (r14 != r3) goto L_0x0108
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0103
            r13 = 1
            goto L_0x0120
        L_0x0103:
            r12.f226671x = r6
            r12.f226672y = r6
            goto L_0x0112
        L_0x0108:
            r12.f226671x = r6
            r12.f226672y = r6
            if (r14 != r2) goto L_0x0110
            r13 = 5
            goto L_0x011f
        L_0x0110:
            if (r14 != r1) goto L_0x0114
        L_0x0112:
            r13 = 3
            goto L_0x011f
        L_0x0114:
            if (r14 != r0) goto L_0x0118
            r13 = 4
            goto L_0x011f
        L_0x0118:
            sw2.b$a r13 = sw2.C77795b.C77796a.NETWORK_OVERTIME
            if (r14 != r13) goto L_0x011e
            r13 = 2
            goto L_0x011f
        L_0x011e:
            r13 = 0
        L_0x011f:
            r5 = 0
        L_0x0120:
            java.lang.Object[] r14 = new java.lang.Object[r10]
            kd0.y r0 = r12.f226657g
            java.lang.String r0 = r0.f224053d
            r14[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r14[r4] = r0
            int r0 = r12.f226671x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r8] = r0
            int r0 = r12.f226672y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14[r9] = r0
            java.lang.String r0 = "alvinluo transformTextResult voiceId: %s, wordCount: %d, waitTime: %d, animationTime: %d, transformResult: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r14)
            if (r13 == 0) goto L_0x0156
            kd0.y r14 = r12.f226657g
            java.lang.String r14 = r14.f224053d
            int r0 = r12.f226671x
            int r1 = r12.f226672y
            xw2.C38865e.m41967a(r14, r5, r0, r1, r13)
        L_0x0156:
            r13 = 0
            r12.f226654d = r13
            r12.f226655e = r13
            r12.f226656f = r13
            r12.f226662o = r13
            r12.f226663p = r6
            r12.f226660j = r6
            r12.f226659i = r6
            r14 = 20
            r12.f226664q = r14
            f226652B = r13
            r12.f226669v = r4
            r13 = 0
            r12.f226670w = r13
            r12.f226673z = r13
            r12.f226671x = r6
            r12.f226672y = r6
            r12.f226653A = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sw2.C77795b.mo107933d(java.lang.String, sw2.b$a):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C77796a aVar = C77796a.GET;
        C77796a aVar2 = C77796a.FINISH;
        C77796a aVar3 = C77796a.SERVER_ERROR;
        boolean z = false;
        Log.m105925i("ExtTranslateVoiceEventListener", "onSceneEnd errType(%d) , errCode(%d).", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            String str2 = null;
            switch (yVar.getType()) {
                case 546:
                    C43182a aVar4 = this.f226654d;
                    int i3 = aVar4.f116845q;
                    if (i3 == 3) {
                        Log.m105924i("ExtTranslateVoiceEventListener", "check result: done");
                        mo107934q(aVar2);
                        if (this.f226669v) {
                            this.f226669v = false;
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f226670w = currentTimeMillis;
                            this.f226671x = (int) (currentTimeMillis - this.f226673z);
                        }
                        this.f226672y = 0;
                        this.f226653A = true;
                        rt4 rt4 = this.f226654d.f116844p;
                        if (rt4 != null && !Util.isNullOrNil(rt4.f141148f)) {
                            z = true;
                        }
                        if (z) {
                            str2 = this.f226654d.f116844p.f141148f;
                        }
                        mo107933d(str2, aVar2);
                        return;
                    } else if (i3 == 2) {
                        rt4 rt42 = aVar4.f116844p;
                        if (rt42 != null) {
                            Util.isNullOrNil(rt42.f141148f);
                        }
                        Log.m105924i("ExtTranslateVoiceEventListener", "check result: processing");
                        mo107934q(aVar);
                        return;
                    } else if (i3 == 1) {
                        Log.m105924i("ExtTranslateVoiceEventListener", "check result: not exist");
                        mo107934q(C77796a.UPLOAD);
                        return;
                    } else {
                        return;
                    }
                case 547:
                    yn4 yn4 = this.f226655e.f116856f;
                    if (yn4 == null || yn4.f145425f <= 0) {
                        Log.m105924i("ExtTranslateVoiceEventListener", "succeed upload");
                        mo107934q(aVar);
                        return;
                    }
                    Log.m105919d("ExtTranslateVoiceEventListener", "start upload more: start:%d, len:%d", Integer.valueOf(yn4.f145424e), Integer.valueOf(this.f226655e.f116856f.f145425f));
                    mo107934q(C77796a.UPLOAD_MORE);
                    return;
                case 548:
                    int i4 = this.f226656f.f116852g;
                    Log.m105925i("ExtTranslateVoiceEventListener", "get mIntervalSec:%ds", Integer.valueOf(i4));
                    this.f226659i = false;
                    if (this.f226669v) {
                        this.f226669v = false;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        this.f226670w = currentTimeMillis2;
                        this.f226671x = (int) (currentTimeMillis2 - this.f226673z);
                    }
                    C43183b bVar = this.f226656f;
                    rt4 rt43 = bVar.f116853h;
                    if (!(rt43 != null && rt43.f141147e == 1) && bVar.mo67410j1()) {
                        Log.m105924i("ExtTranslateVoiceEventListener", "refreshResult result");
                        String str3 = this.f226656f.f116853h.f141148f;
                        ExtTranslateVoiceEvent extTranslateVoiceEvent = this.f226662o;
                        if (extTranslateVoiceEvent != null) {
                            ExtTranslateVoiceEvent.C67685b bVar2 = extTranslateVoiceEvent.f193562e;
                            bVar2.f193570b = false;
                            bVar2.f193569a = str3;
                            Log.m105925i("ExtTranslateVoiceEventListener", "refreshResult result is null ? : %s", Boolean.valueOf(Util.isNullOrNil(str3)));
                            Runnable runnable = this.f226662o.f193561d.f193567e;
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                    } else if (!this.f226656f.mo67410j1()) {
                        Log.m105918d("ExtTranslateVoiceEventListener", "result not valid");
                    }
                    rt4 rt44 = this.f226656f.f116853h;
                    if (rt44 != null && rt44.f141147e == 1) {
                        Log.m105924i("ExtTranslateVoiceEventListener", "succeed get");
                        if (this.f226656f.mo67410j1()) {
                            str2 = this.f226656f.f116853h.f141148f;
                        }
                        mo107934q(aVar2);
                        this.f226672y = (int) (System.currentTimeMillis() - this.f226670w);
                        this.f226653A = true;
                        mo107933d(str2, aVar2);
                        return;
                    }
                    Log.m105925i("ExtTranslateVoiceEventListener", "do get again after:%ds", Integer.valueOf(i4));
                    if (!this.f226660j) {
                        int i5 = this.f226664q - 1;
                        this.f226664q = i5;
                        if (i5 < 0) {
                            Log.m105921e("ExtTranslateVoiceEventListener", "Has try to translate delay for %d times.", 20);
                            mo107934q(aVar3);
                            return;
                        }
                        if (this.f226661n == null) {
                            this.f226661n = new MTimerHandler(new C77794a(this, i4), false);
                        }
                        this.f226661n.startTimer((long) (i4 * 1000));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (i == 2) {
            mo107934q(C77796a.NETWORK_OVERTIME);
        } else {
            mo107934q(aVar3);
        }
    }

    /* renamed from: q */
    public final void mo107934q(C77796a aVar) {
        C77796a aVar2 = aVar;
        switch (aVar.ordinal()) {
            case 0:
                Log.m105924i("ExtTranslateVoiceEventListener", "net check");
                long j = this.f226657g.f224054e;
                if (j > 0) {
                    Log.m105925i("ExtTranslateVoiceEventListener", "has msg svr id: %d", Long.valueOf(j));
                    C76551y yVar = this.f226657g;
                    this.f226654d = new C43182a(yVar.f224053d, yVar.f224057h, this.f226658h, yVar.f224054e, yVar.f224051b, this.f226666s, this.f226667t, this.f226668u);
                } else {
                    Log.m105925i("ExtTranslateVoiceEventListener", "not existex msg svr id: %d", Long.valueOf(j));
                    C76551y yVar2 = this.f226657g;
                    this.f226654d = new C43182a(yVar2.f224053d, yVar2.f224057h, yVar2.f224051b, this.f226666s, this.f226667t, this.f226668u);
                }
                C97625j3.m125815e().mo123460f(this.f226654d);
                C89137b0 e = C97625j3.m125815e();
                this.f226654d.getClass();
                e.mo123455a(546, this);
                this.f226673z = System.currentTimeMillis();
                return;
            case 1:
                Log.m105924i("ExtTranslateVoiceEventListener", "net upload");
                C43182a aVar3 = this.f226654d;
                if (aVar3 == null) {
                    Log.m105928w("ExtTranslateVoiceEventListener", "request upload must after check!");
                    return;
                }
                C76551y yVar3 = this.f226657g;
                this.f226655e = new C43184c(yVar3.f224053d, aVar3.f116846r, this.f226658h, yVar3.f224051b, this.f226666s, this.f226667t, this.f226668u);
                C97625j3.m125815e().mo123460f(this.f226655e);
                C89137b0 e2 = C97625j3.m125815e();
                this.f226655e.getClass();
                e2.mo123455a(547, this);
                return;
            case 2:
                Log.m105924i("ExtTranslateVoiceEventListener", "net upload more");
                C43184c cVar = this.f226655e;
                if (cVar == null) {
                    Log.m105928w("ExtTranslateVoiceEventListener", "upload more need has upload netScene!");
                    return;
                }
                this.f226655e = new C43184c(cVar);
                C97625j3.m125815e().mo123460f(this.f226655e);
                C89137b0 e3 = C97625j3.m125815e();
                this.f226655e.getClass();
                e3.mo123455a(547, this);
                return;
            case 3:
                if (this.f226659i) {
                    Log.m105924i("ExtTranslateVoiceEventListener", "pulling so pass");
                    return;
                }
                Log.m105924i("ExtTranslateVoiceEventListener", "net get");
                if (this.f226654d == null) {
                    Log.m105928w("ExtTranslateVoiceEventListener", "request get must after check!");
                    return;
                }
                this.f226659i = true;
                this.f226656f = new C43183b(this.f226657g.f224053d);
                C97625j3.m125815e().mo123460f(this.f226656f);
                C89137b0 e4 = C97625j3.m125815e();
                this.f226656f.getClass();
                e4.mo123455a(548, this);
                return;
            case 4:
                this.f226660j = true;
                return;
            case 6:
                C97625j3.m125815e().mo123458d(this.f226654d);
                C97625j3.m125815e().mo123458d(this.f226655e);
                C97625j3.m125815e().mo123458d(this.f226656f);
                this.f226653A = true;
                mo107933d((String) null, C77796a.CANCEL);
                return;
            case 8:
            case 9:
                this.f226653A = true;
                mo107933d((String) null, aVar2);
                return;
            case 10:
                this.f226653A = true;
                mo107933d((String) null, aVar2);
                return;
            default:
                return;
        }
    }
}
