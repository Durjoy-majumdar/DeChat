package ma0;

import a14.C0000n0;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C97455f;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import lc3.C10485b;
import org.json.JSONArray;
import org.json.JSONObject;
import qa0.C47792a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64186f0;
import te3.C48973c92;
import te3.pr4;
import wx3.C15601d;
import xx3.C15911a;
import y90.C38980b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ma0.e */
public final class C46974e implements C97455f {

    /* renamed from: a */
    public static final C46974e f126289a = new C46974e();

    @C91590f(mo125468c = "com.tencent.mm.mj_template.plugin.SnsMaasConfigImpl", mo125469f = "SnsMaasConfigImpl.kt", mo125470l = {130}, mo125471m = "getDefaultTemplateList")
    /* renamed from: ma0.e$a */
    public static final class C46975a extends C66704d {

        /* renamed from: d */
        public Object f126290d;

        /* renamed from: e */
        public Object f126291e;

        /* renamed from: f */
        public Object f126292f;

        /* renamed from: g */
        public Object f126293g;

        /* renamed from: h */
        public Object f126294h;

        /* renamed from: i */
        public Object f126295i;

        /* renamed from: j */
        public /* synthetic */ Object f126296j;

        /* renamed from: n */
        public final /* synthetic */ C46974e f126297n;

        /* renamed from: o */
        public int f126298o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46975a(C46974e eVar, C15601d<? super C46975a> dVar) {
            super(dVar);
            this.f126297n = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126296j = obj;
            this.f126298o |= Integer.MIN_VALUE;
            return this.f126297n.mo72163e(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.plugin.SnsMaasConfigImpl$getDefaultTemplateList$3$mergedTmplList$1$2$1", mo125469f = "SnsMaasConfigImpl.kt", mo125470l = {131}, mo125471m = "invokeSuspend")
    /* renamed from: ma0.e$b */
    public static final class C46976b extends C91594j implements C32227p<C0000n0, C15601d<? super pr4>, Object> {

        /* renamed from: d */
        public int f126299d;

        /* renamed from: e */
        public final /* synthetic */ C13604l<String, Long> f126300e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46976b(C13604l<String, Long> lVar, C15601d<? super C46976b> dVar) {
            super(2, dVar);
            this.f126300e = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C46976b(this.f126300e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C46976b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f126299d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f126299d = 1;
                obj = C47792a.f128329a.mo72571d((String) this.f126300e.f38555d, 4, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C48973c92 c922 = (C48973c92) obj;
            if (c922 != null) {
                return c922.f131578d;
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo72159a() {
        return mo72161c(C104160f.RepairerConfig_Maas_SnsShowPostMainEntry_Int, "SnsVideoTemplateEnabled", false) && C38980b.f105023a.mo61860a();
    }

    /* renamed from: b */
    public boolean mo72160b(long j) {
        if (j <= 1011000) {
            return mo72159a() && mo72161c(C104160f.RepairerConfig_Maas_SnsShowCreateSameEntry_Int, "SnsVideoTemplateUseSameTemplateEnabled", false);
        }
        Log.m105924i("SnsMaasConfigImpl", "showCutSameEntry: templateMin is " + j + ", sdk is 1011000");
        return false;
    }

    /* renamed from: c */
    public final boolean mo72161c(C104160f fVar, String str, boolean z) {
        Integer valueOf = Integer.valueOf(C79758p.f233760a.mo109882e(fVar, -1));
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        return (valueOf != null ? valueOf.intValue() : ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b(str, z ? 1 : 0)) == 1;
    }

    /* renamed from: d */
    public final List<String> mo72162d() {
        Object obj;
        Object obj2;
        Log.m105924i("SnsMaasConfigImpl", "getDefaultTemplateIdList");
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SnsVideoDefaultTemplate");
        if (c == null) {
            c = "";
        }
        Log.m105924i("SnsMaasConfigImpl", "getDefaultTemplateIdList: " + c);
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(new JSONObject(c));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        List<String> list = null;
        if (Result.m168120isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return C64186f0.f181907d;
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tpls");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.optJSONObject(i).getString("id");
                C87412m.m108593f(string, "it.getString(\"id\")");
                arrayList.add(string);
            }
            obj2 = Result.m168114constructorimpl(arrayList);
        } catch (Throwable th4) {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th4));
        }
        if (!Result.m168120isFailureimpl(obj2)) {
            list = obj2;
        }
        List<String> list2 = list;
        return list2 == null ? C64186f0.f181907d : list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        if (r0 == null) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01d0 A[EDGE_INSN: B:102:0x01d0->B:84:0x01d0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0225 A[SYNTHETIC, Splitter:B:95:0x0225] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72163e(wx3.C15601d<? super java.util.List<? extends te3.pr4>> r19) {
        /*
            r18 = this;
            r0 = r19
            boolean r1 = r0 instanceof ma0.C46974e.C46975a
            if (r1 == 0) goto L_0x0017
            r1 = r0
            ma0.e$a r1 = (ma0.C46974e.C46975a) r1
            int r2 = r1.f126298o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f126298o = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            ma0.e$a r1 = new ma0.e$a
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f126296j
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r1.f126298o
            java.lang.String r5 = "maas_sns_default_template_list_key"
            java.lang.String r6 = "SnsMaasConfigImpl"
            r9 = 1
            if (r4 == 0) goto L_0x0054
            if (r4 != r9) goto L_0x004c
            java.lang.Object r4 = r1.f126295i
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r10 = r1.f126294h
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r10
            java.lang.Object r11 = r1.f126293g
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.f126292f
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r13 = r1.f126291e
            gy3.a0 r13 = (gy3.C8477a0) r13
            java.lang.Object r14 = r1.f126290d
            java.util.List r14 = (java.util.List) r14
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = 0
            r8 = 1
            goto L_0x020c
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = "getDefaultTemplateList"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_maas_sns_default_template
            java.lang.String r10 = ""
            java.lang.String r0 = r0.Y60(r4, r10)
            java.lang.String r4 = "xConfig"
            gy3.C87412m.m108593f(r0, r4)
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            if (r4 == 0) goto L_0x0091
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r4 = "SnsVideoDefaultTemplate"
            java.lang.String r0 = r0.mo107405c(r4)
            if (r0 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0091:
            java.lang.String r4 = "getDefaultTemplateList: use x config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
        L_0x0096:
            r10 = r0
        L_0x0097:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "getDefaultTemplateList: "
            r0.append(r4)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x00b7 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00b7 }
            r0.<init>(r10)     // Catch:{ all -> 0x00b7 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x00c2
        L_0x00b7:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x00c2:
            boolean r4 = kotlin.Result.m168120isFailureimpl(r0)
            if (r4 == 0) goto L_0x00c9
            r0 = 0
        L_0x00c9:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L_0x0254
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0104 }
            r4.<init>()     // Catch:{ all -> 0x0104 }
            java.lang.String r10 = "tpls"
            org.json.JSONArray r0 = r0.getJSONArray(r10)     // Catch:{ all -> 0x0104 }
            int r10 = r0.length()     // Catch:{ all -> 0x0104 }
            r11 = 0
        L_0x00dd:
            if (r11 >= r10) goto L_0x00ff
            org.json.JSONObject r12 = r0.optJSONObject(r11)     // Catch:{ all -> 0x0104 }
            rx3.l r13 = new rx3.l     // Catch:{ all -> 0x0104 }
            java.lang.String r14 = "id"
            java.lang.String r14 = r12.getString(r14)     // Catch:{ all -> 0x0104 }
            java.lang.String r15 = "desc_ver"
            long r7 = r12.getLong(r15)     // Catch:{ all -> 0x0104 }
            java.lang.Long r12 = new java.lang.Long     // Catch:{ all -> 0x0104 }
            r12.<init>(r7)     // Catch:{ all -> 0x0104 }
            r13.<init>(r14, r12)     // Catch:{ all -> 0x0104 }
            r4.add(r13)     // Catch:{ all -> 0x0104 }
            int r11 = r11 + 1
            goto L_0x00dd
        L_0x00ff:
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r4)     // Catch:{ all -> 0x0104 }
            goto L_0x010f
        L_0x0104:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x010f:
            boolean r4 = kotlin.Result.m168120isFailureimpl(r0)
            if (r4 == 0) goto L_0x0116
            r0 = 0
        L_0x0116:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x011c
            sx3.f0 r0 = sx3.C64186f0.f181907d
        L_0x011c:
            r4 = r0
            java.lang.String r0 = "maas_sns_template_config"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r0 = "mmkv"
            gy3.C87412m.m108593f(r7, r0)
            boolean r0 = r7.containsKey(r5)
            if (r0 == 0) goto L_0x015a
            byte[] r0 = r7.decodeBytes(r5)
            if (r0 == 0) goto L_0x015a
            int r8 = r0.length
            if (r8 != 0) goto L_0x0139
            r8 = 1
            goto L_0x013a
        L_0x0139:
            r8 = 0
        L_0x013a:
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x015a
            java.lang.Class<te3.sr4> r8 = te3.sr4.class
            java.lang.Object r8 = r8.newInstance()     // Catch:{ Exception -> 0x014e }
            r10 = r8
            pe3.a r10 = (pe3.C47465a) r10     // Catch:{ Exception -> 0x014e }
            r10.parseFrom(r0)     // Catch:{ Exception -> 0x014e }
            pe3.a r8 = (pe3.C47465a) r8     // Catch:{ Exception -> 0x014e }
            r0 = r8
            r8 = 0
            goto L_0x015c
        L_0x014e:
            r0 = move-exception
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r11 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r12 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r12, r10)
            goto L_0x015b
        L_0x015a:
            r8 = 0
        L_0x015b:
            r0 = 0
        L_0x015c:
            te3.sr4 r0 = (te3.sr4) r0
            if (r0 == 0) goto L_0x0163
            java.util.LinkedList<te3.pr4> r0 = r0.f141709d
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r0 != 0) goto L_0x0168
            sx3.f0 r0 = sx3.C64186f0.f181907d
        L_0x0168:
            gy3.a0 r10 = new gy3.a0
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = sx3.C36907w.m41090l(r4, r12)
            r11.<init>(r12)
            java.util.Iterator r4 = r4.iterator()
            r14 = r0
            r13 = r10
            r10 = r7
            r17 = r11
            r11 = r4
            r4 = r17
        L_0x0184:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x021f
            java.lang.Object r0 = r11.next()
            rx3.l r0 = (rx3.C13604l) r0
            java.util.Iterator r7 = r14.iterator()
        L_0x0194:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x01cd
            java.lang.Object r12 = r7.next()
            r15 = r12
            te3.pr4 r15 = (te3.pr4) r15
            A r8 = r0.f38555d
            java.lang.String r9 = r15.f139919d
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x01c0
            B r8 = r0.f38556e
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            te3.vy r15 = r15.f139922g
            int r15 = r15.f143766j
            r16 = r3
            long r2 = (long) r15
            int r15 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r15 > 0) goto L_0x01c2
            r2 = 1
            goto L_0x01c3
        L_0x01c0:
            r16 = r3
        L_0x01c2:
            r2 = 0
        L_0x01c3:
            if (r2 == 0) goto L_0x01c6
            goto L_0x01d0
        L_0x01c6:
            r2 = r18
            r3 = r16
            r8 = 0
            r9 = 1
            goto L_0x0194
        L_0x01cd:
            r16 = r3
            r12 = 0
        L_0x01d0:
            te3.pr4 r12 = (te3.pr4) r12
            if (r12 != 0) goto L_0x020f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getDefaultTemplateList, has template to update "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r2 = 1
            r13.f27482d = r2
            a14.h0 r2 = a14.C53872d1.f151119c
            ma0.e$b r3 = new ma0.e$b
            r7 = 0
            r3.<init>(r0, r7)
            r1.f126290d = r14
            r1.f126291e = r13
            r1.f126292f = r4
            r1.f126293g = r11
            r1.f126294h = r10
            r1.f126295i = r4
            r8 = 1
            r1.f126298o = r8
            java.lang.Object r0 = a14.C53895h.m60469g(r2, r3, r1)
            r3 = r16
            if (r0 != r3) goto L_0x020b
            return r3
        L_0x020b:
            r12 = r4
        L_0x020c:
            te3.pr4 r0 = (te3.pr4) r0
            goto L_0x0215
        L_0x020f:
            r3 = r16
            r7 = 0
            r8 = 1
            r0 = r12
            r12 = r4
        L_0x0215:
            r4.add(r0)
            r2 = r18
            r4 = r12
            r8 = 0
            r9 = 1
            goto L_0x0184
        L_0x021f:
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r13.f27482d
            if (r0 == 0) goto L_0x024f
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0245 }
            te3.sr4 r0 = new te3.sr4     // Catch:{ all -> 0x0245 }
            r0.<init>()     // Catch:{ all -> 0x0245 }
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ all -> 0x0245 }
            r1.<init>(r4)     // Catch:{ all -> 0x0245 }
            r0.f141709d = r1     // Catch:{ all -> 0x0245 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0245 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0245 }
            boolean r0 = r10.encode((java.lang.String) r5, (byte[]) r0)     // Catch:{ all -> 0x0245 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0245 }
            kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0245 }
            goto L_0x024f
        L_0x0245:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m168114constructorimpl(r0)
        L_0x024f:
            java.util.List r0 = sx3.C110818d0.m150912J(r4)
            goto L_0x0256
        L_0x0254:
            sx3.f0 r0 = sx3.C64186f0.f181907d
        L_0x0256:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C46974e.mo72163e(wx3.d):java.lang.Object");
    }
}
