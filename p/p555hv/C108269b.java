package p555hv;

import a14.C0000n0;
import a14.C53851a;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import ab2.C67024c;
import android.content.Context;
import bp3.C104160f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32227p;
import gy3.C87412m;
import h81.C32735h;
import java.util.concurrent.CancellationException;
import p529fv.C75798k;
import qc0.C101106m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

@C86522b
/* renamed from: hv.b */
public final class C108269b extends C86301e implements C75798k {

    /* renamed from: d */
    public final String f324162d = "MicroMsg.PluginMusicChat";

    /* renamed from: e */
    public C67024c f324163e;

    /* renamed from: f */
    public final String f324164f = "musicHistory_config";

    /* renamed from: g */
    public final String f324165g = "musicHistory";

    /* renamed from: h */
    public final String f324166h = "historys";

    /* renamed from: i */
    public final String f324167i = "musicTitle";

    /* renamed from: j */
    public final String f324168j = "artister";

    /* renamed from: n */
    public final String f324169n = "wx5aa333606550dfd5";

    /* renamed from: o */
    public final C0000n0 f324170o = C53930o0.m60555b();

    /* renamed from: p */
    public C53973z1 f324171p;

    /* renamed from: hv.b$a */
    public final class C108270a {

        /* renamed from: a */
        public String f324172a;

        /* renamed from: b */
        public String f324173b;

        public C108270a(C108269b bVar) {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C108270a)) {
                return super.equals(obj);
            }
            C108270a aVar = (C108270a) obj;
            return C87412m.m108589b(this.f324172a, aVar.f324172a) && C87412m.m108589b(this.f324173b, aVar.f324173b);
        }

        public int hashCode() {
            String str = this.f324172a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f324173b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.musicchat.MusicChatFeatureService$startSendMusic$1", mo125469f = "MusicChatFeatureService.kt", mo125470l = {58, 60, 71}, mo125471m = "invokeSuspend")
    /* renamed from: hv.b$b */
    public static final class C108271b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f324174d;

        /* renamed from: e */
        public int f324175e;

        /* renamed from: f */
        public final /* synthetic */ Context f324176f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108271b(Context context, C15601d<? super C108271b> dVar) {
            super(2, dVar);
            this.f324176f = context;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108271b(this.f324176f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108271b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a5 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r7 = r22
                xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r7.f324175e
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L_0x002d
                if (r0 == r4) goto L_0x0027
                if (r0 == r3) goto L_0x001f
                if (r0 != r2) goto L_0x0017
                kotlin.ResultKt.throwOnFailure(r23)
                goto L_0x00a6
            L_0x0017:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001f:
                java.lang.Object r0 = r7.f324174d
                a10.y r0 = (a10.C112726y) r0
                kotlin.ResultKt.throwOnFailure(r23)
                goto L_0x0058
            L_0x0027:
                kotlin.ResultKt.throwOnFailure(r23)
                r0 = r23
                goto L_0x0041
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r23)
                java.lang.Class<pr.g> r0 = p220pr.C110245g.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                pr.g r0 = (p220pr.C110245g) r0
                r7.f324175e = r4
                java.lang.Object r0 = r0.Tw0(r7)
                if (r0 != r8) goto L_0x0041
                return r8
            L_0x0041:
                a10.c r0 = (a10.C112713c) r0
                a10.y r5 = new a10.y
                java.lang.String r6 = "music_chat"
                r5.<init>(r0, r6)
                r7.f324174d = r5
                r7.f324175e = r3
                java.lang.String r0 = "/"
                java.lang.Object r0 = r5.mo164471g(r0, r1, r7)
                if (r0 != r8) goto L_0x0057
                return r8
            L_0x0057:
                r0 = r5
            L_0x0058:
                io.flutter.embedding.engine.plugins.FlutterPlugin[] r3 = new p172io.flutter.embedding.engine.plugins.FlutterPlugin[r3]
                com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin r5 = new com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin
                r5.<init>()
                r6 = 0
                r3[r6] = r5
                bb2.h r5 = new bb2.h
                r5.<init>()
                r3[r4] = r5
                java.util.List r3 = sx3.C64197v.m75537f(r3)
                r0.mo164465a(r3)
                com.tencent.mm.flutter.ui.FlutterPageStyle r3 = new com.tencent.mm.flutter.ui.FlutterPageStyle
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 1023(0x3ff, float:1.434E-42)
                r21 = 0
                r9 = r3
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                r3.f310676o = r6
                r3.f310668d = r4
                r4 = -1
                r3.f310669e = r4
                android.content.Context r4 = r7.f324176f
                r5 = 0
                r6 = 4
                r9 = 0
                r7.f324174d = r1
                r7.f324175e = r2
                r1 = r4
                r2 = r3
                r3 = r5
                r4 = r22
                r5 = r6
                r6 = r9
                java.lang.Object r0 = a10.C112726y.m154145i(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L_0x00a6
                return r8
            L_0x00a6:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p555hv.C108269b.C108271b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hv.b$c */
    public static final class C108272c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108269b f324177d;

        /* renamed from: e */
        public final /* synthetic */ C101106m f324178e;

        public C108272c(C108269b bVar, C101106m mVar) {
            this.f324177d = bVar;
            this.f324178e = mVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(14:9|10|11|12|(5:14|15|16|17|18)|21|22|(1:24)|25|(1:27)|28|(1:30)|38|31) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0076 */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab A[LOOP:1: B:29:0x00a9->B:30:0x00ab, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                hv.b r0 = r11.f324177d
                qc0.m r1 = r11.f324178e
                monitor-enter(r0)
                if (r1 == 0) goto L_0x00f3
                java.lang.String r2 = r1.f295972t     // Catch:{ all -> 0x00f0 }
                if (r2 == 0) goto L_0x00ee
                java.lang.String r3 = r0.f324169n     // Catch:{ all -> 0x00f0 }
                boolean r2 = gy3.C87412m.m108589b(r2, r3)     // Catch:{ all -> 0x00f0 }
                if (r2 != 0) goto L_0x0015
                goto L_0x00ee
            L_0x0015:
                f40.e r2 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x00f0 }
                java.lang.String r2 = r2.mo121111i()     // Catch:{ all -> 0x00f0 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00f0 }
                r3.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r4.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r5 = r0.f324164f     // Catch:{ all -> 0x00f0 }
                r4.append(r5)     // Catch:{ all -> 0x00f0 }
                r4.append(r2)     // Catch:{ all -> 0x00f0 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00f0 }
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r4)     // Catch:{ all -> 0x00f0 }
                java.lang.String r5 = r0.f324165g     // Catch:{ all -> 0x00f0 }
                java.lang.String r6 = ""
                java.lang.String r4 = r4.getString(r5, r6)     // Catch:{ all -> 0x00f0 }
                r5 = 0
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0076 }
                r6.<init>(r4)     // Catch:{ JSONException -> 0x0076 }
                java.lang.String r4 = r0.f324166h     // Catch:{ JSONException -> 0x0076 }
                org.json.JSONArray r4 = r6.getJSONArray(r4)     // Catch:{ JSONException -> 0x0076 }
                int r6 = r4.length()     // Catch:{ JSONException -> 0x0076 }
                r7 = 0
            L_0x0050:
                if (r7 >= r6) goto L_0x0076
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0076 }
                java.lang.String r9 = r4.getString(r7)     // Catch:{ JSONException -> 0x0076 }
                r8.<init>(r9)     // Catch:{ JSONException -> 0x0076 }
                hv.b$a r9 = new hv.b$a     // Catch:{ JSONException -> 0x0076 }
                r9.<init>(r0)     // Catch:{ JSONException -> 0x0076 }
                java.lang.String r10 = r0.f324167i     // Catch:{ JSONException -> 0x0073 }
                java.lang.String r10 = r8.getString(r10)     // Catch:{ JSONException -> 0x0073 }
                r9.f324172a = r10     // Catch:{ JSONException -> 0x0073 }
                java.lang.String r10 = r0.f324168j     // Catch:{ JSONException -> 0x0073 }
                java.lang.String r8 = r8.getString(r10)     // Catch:{ JSONException -> 0x0073 }
                r9.f324173b = r8     // Catch:{ JSONException -> 0x0073 }
                r3.add(r9)     // Catch:{ JSONException -> 0x0076 }
            L_0x0073:
                int r7 = r7 + 1
                goto L_0x0050
            L_0x0076:
                hv.b$a r4 = new hv.b$a     // Catch:{ all -> 0x00f0 }
                r4.<init>(r0)     // Catch:{ all -> 0x00f0 }
                java.lang.String r6 = r1.f295962g     // Catch:{ all -> 0x00f0 }
                r4.f324172a = r6     // Catch:{ all -> 0x00f0 }
                java.lang.String r1 = r1.f295963h     // Catch:{ all -> 0x00f0 }
                r4.f324173b = r1     // Catch:{ all -> 0x00f0 }
                boolean r1 = r3.contains(r4)     // Catch:{ all -> 0x00f0 }
                if (r1 == 0) goto L_0x008c
                r3.remove(r4)     // Catch:{ all -> 0x00f0 }
            L_0x008c:
                r3.add(r5, r4)     // Catch:{ all -> 0x00f0 }
                int r1 = r3.size()     // Catch:{ all -> 0x00f0 }
                r4 = 10
                if (r1 <= r4) goto L_0x009b
                java.util.List r3 = r3.subList(r5, r4)     // Catch:{ all -> 0x00f0 }
            L_0x009b:
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x00f0 }
                r1.<init>()     // Catch:{ all -> 0x00f0 }
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x00f0 }
                r4.<init>()     // Catch:{ all -> 0x00f0 }
                int r6 = r3.size()     // Catch:{ all -> 0x00f0 }
            L_0x00a9:
                if (r5 >= r6) goto L_0x00ca
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00f0 }
                r7.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.Object r8 = r3.get(r5)     // Catch:{ all -> 0x00f0 }
                hv.b$a r8 = (p555hv.C108269b.C108270a) r8     // Catch:{ all -> 0x00f0 }
                java.lang.String r9 = r0.f324167i     // Catch:{ all -> 0x00f0 }
                java.lang.String r10 = r8.f324172a     // Catch:{ all -> 0x00f0 }
                r7.put(r9, r10)     // Catch:{ all -> 0x00f0 }
                java.lang.String r9 = r0.f324168j     // Catch:{ all -> 0x00f0 }
                java.lang.String r8 = r8.f324173b     // Catch:{ all -> 0x00f0 }
                r7.put(r9, r8)     // Catch:{ all -> 0x00f0 }
                r1.put(r5, r7)     // Catch:{ all -> 0x00f0 }
                int r5 = r5 + 1
                goto L_0x00a9
            L_0x00ca:
                java.lang.String r3 = r0.f324166h     // Catch:{ all -> 0x00f0 }
                r4.put(r3, r1)     // Catch:{ all -> 0x00f0 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r1.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = r0.f324164f     // Catch:{ all -> 0x00f0 }
                r1.append(r3)     // Catch:{ all -> 0x00f0 }
                r1.append(r2)     // Catch:{ all -> 0x00f0 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f0 }
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)     // Catch:{ all -> 0x00f0 }
                java.lang.String r2 = r0.f324165g     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00f0 }
                r1.putString(r2, r3)     // Catch:{ all -> 0x00f0 }
                goto L_0x00f3
            L_0x00ee:
                monitor-exit(r0)
                goto L_0x00f4
            L_0x00f0:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00f3:
                monitor-exit(r0)
            L_0x00f4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p555hv.C108269b.C108272c.run():void");
        }
    }

    /* renamed from: Il */
    public boolean mo106093Il() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_send_music_to_chat_enable, C104160f.RepairerConfig_Mv_SendMusicInChat_Int, 1) == 1;
    }

    public C67024c V90() {
        return this.f324163e;
    }

    public void Y90(C67024c cVar) {
        this.f324163e = cVar;
    }

    public void eb0() {
        String str = this.f324162d;
        StringBuilder sb = new StringBuilder();
        sb.append("onExitChat, job:");
        sb.append(this.f324171p);
        sb.append(" isActive:");
        C53973z1 z1Var = this.f324171p;
        sb.append(z1Var != null ? Boolean.valueOf(((C53851a) z1Var).mo74466a()) : null);
        Log.m105924i(str, sb.toString());
        C53973z1 z1Var2 = this.f324171p;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: nV */
    public void mo106097nV(Context context) {
        C87412m.m108594g(context, "context");
        C53973z1 z1Var = this.f324171p;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f324171p = C53895h.m60466d(this.f324170o, (C66212f) null, (C53934p0) null, new C108271b(context, (C15601d<? super C108271b>) null), 3, (Object) null);
    }

    /* renamed from: vE */
    public void mo106098vE(C101106m mVar) {
        if (mVar == null || mVar.f295959d != 15) {
            ((C119157j) C119157j.f356862d).mo183884o(new C108272c(this, mVar));
        }
    }
}
