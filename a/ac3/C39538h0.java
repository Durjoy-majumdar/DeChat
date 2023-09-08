package ac3;

import ac3.C27856m0;
import android.content.Intent;
import com.tencent.p014mm.plugin.xlabeffect.WeVisUpdateReceiver;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hp3.C87581a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import o40.C61926c;
import q00.C110264g;
import q00.C12024e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.wz4;
import te3.yz4;

@C86522b(creator = C27856m0.C27857a.class)
/* renamed from: ac3.h0 */
public final class C39538h0 extends C86301e implements C12024e {

    /* renamed from: d */
    public static final C39538h0 f106157d;

    /* renamed from: e */
    public static final String f106158e = "MicroMsg.WeVisEffectConfigMgr";

    /* renamed from: f */
    public static final long f106159f = FrequentLimiter.WEEK_MILLS;

    /* renamed from: g */
    public static final long f106160g = 86400000;

    /* renamed from: h */
    public static final LinkedList<wz4> f106161h = new LinkedList<>();

    /* renamed from: i */
    public static final HashMap<String, HashMap<String, wz4>> f106162i = new HashMap<>();

    /* renamed from: j */
    public static final C13601g f106163j = C36568h.m40985a(C0027b.f33d);

    /* renamed from: ac3.h0$b */
    public static final class C0027b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C0027b f33d = new C0027b();

        public C0027b() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_wevision_effect_config_cgi, true));
        }
    }

    /* renamed from: ac3.h0$c */
    public static final class C0028c extends C87413o implements C32226l<Map.Entry<String, HashMap<String, wz4>>, CharSequence> {

        /* renamed from: d */
        public static final C0028c f34d = new C0028c();

        public C0028c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C87412m.m108594g(entry, LocaleUtil.ITALIAN);
            StringBuilder sb = new StringBuilder();
            sb.append(10);
            sb.append((String) entry.getKey());
            sb.append(": \n ");
            Set entrySet = ((HashMap) entry.getValue()).entrySet();
            C87412m.m108593f(entrySet, "it.value.entries");
            sb.append(C110818d0.m150921S(entrySet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0029j0.f35d, 31, (Object) null));
            return sb.toString();
        }
    }

    /* renamed from: ac3.h0$a */
    public static final class C39539a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C39539a f106164d = new C39539a();

        public C39539a() {
            super(0);
        }

        public Object invoke() {
            C39538h0 h0Var = C39538h0.f106157d;
            h0Var.Nq0();
            MultiProcessMMKV vx02 = h0Var.vx0();
            C27862u0 u0Var = C27862u0.f77002a;
            long j = vx02.getLong("score_cgi_time", 0);
            boolean z = h0Var.vx0().containsKey("cpu_score") && h0Var.vx0().containsKey("gpu_score");
            String str = C39538h0.f106158e;
            Log.m105924i(str, "loadDeviceScore: last:" + j + ", hasScore:" + z);
            if (!z ? Util.milliSecondsToNow(j) > C39538h0.f106160g : Util.milliSecondsToNow(j) > C39538h0.f106159f) {
                new C39536a().mo9225i().mo123420E(C39542k0.f106167a);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ac3.h0$d */
    public static final class C39540d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public static final C39540d<_Ret, _Var> f106165a = new C39540d<>();

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r12) {
            /*
                r11 = this;
                ob0.b$c r12 = (ob0.C89132b.C89134c) r12
                int r0 = r12.f256793a
                int r1 = r12.f256794b
                T r12 = r12.f256796d
                te3.yz4 r12 = (te3.yz4) r12
                java.lang.String r2 = ac3.C39538h0.f106158e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "CgiWeVisGetEffectConfig: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ", "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                if (r0 != 0) goto L_0x016a
                if (r1 != 0) goto L_0x016a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "resp: runScore: "
                r0.append(r1)
                java.lang.String r1 = r12.f145599e
                r0.append(r1)
                java.lang.String r1 = ", size:"
                r0.append(r1)
                java.util.LinkedList<te3.wz4> r1 = r12.f145598d
                int r1 = r1.size()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                java.util.LinkedList<te3.wz4> r0 = r12.f145598d
                java.lang.String r1 = "resp.ConfigList"
                gy3.C87412m.m108593f(r0, r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x005b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00a8
                java.lang.Object r1 = r0.next()
                te3.wz4 r1 = (te3.wz4) r1
                java.lang.String r2 = ac3.C39538h0.f106158e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "resp: key:"
                r3.append(r4)
                java.lang.String r4 = r1.f144370d
                r3.append(r4)
                java.lang.String r4 = ", value:"
                r3.append(r4)
                float r4 = r1.f144372f
                r3.append(r4)
                java.lang.String r4 = ", name:"
                r3.append(r4)
                java.lang.String r4 = r1.f144371e
                r3.append(r4)
                java.lang.String r4 = ", scene:"
                r3.append(r4)
                java.lang.String r4 = r1.f144373g
                r3.append(r4)
                java.lang.String r4 = ", device:"
                r3.append(r4)
                java.lang.String r1 = r1.f144374h
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                goto L_0x005b
            L_0x00a8:
                ac3.h0 r0 = ac3.C39538h0.f106157d
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r0.vx0()
                ac3.u0 r2 = ac3.C27862u0.f77002a
                byte[] r2 = o40.C61926c.m72699x(r12)
                java.lang.String r3 = "effect_config"
                r1.encode((java.lang.String) r3, (byte[]) r2)
                r0.xx0(r12)
                java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, te3.wz4>> r12 = ac3.C39538h0.f106162i
                java.util.Set r12 = r12.entrySet()
                java.lang.String r0 = "configMap.entries"
                gy3.C87412m.m108593f(r12, r0)
                java.util.Iterator r12 = r12.iterator()
            L_0x00cb:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x0159
                java.lang.Object r0 = r12.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                ac3.h0 r1 = ac3.C39538h0.f106157d
                java.lang.Object r2 = r0.getKey()
                java.lang.String r3 = "it.key"
                gy3.C87412m.m108593f(r2, r3)
                java.lang.String r2 = (java.lang.String) r2
                r1.getClass()
                int r1 = r2.hashCode()
                switch(r1) {
                    case -284840886: goto L_0x0121;
                    case 3625376: goto L_0x0114;
                    case 3745285: goto L_0x0107;
                    case 1418699258: goto L_0x00fb;
                    case 2091275664: goto L_0x00ef;
                    default: goto L_0x00ee;
                }
            L_0x00ee:
                goto L_0x012d
            L_0x00ef:
                java.lang.String r1 = "sightcameracap"
                boolean r1 = r2.equals(r1)
                if (r1 != 0) goto L_0x00f8
                goto L_0x012d
            L_0x00f8:
                q00.g$a r1 = q00.C110264g.C47730a.APP_SIGHTCAMERACAP
                goto L_0x012e
            L_0x00fb:
                java.lang.String r1 = "livevlog"
                boolean r1 = r2.equals(r1)
                if (r1 != 0) goto L_0x0104
                goto L_0x012d
            L_0x0104:
                q00.g$a r1 = q00.C110264g.C47730a.APP_LIVEVLOG
                goto L_0x012e
            L_0x0107:
                java.lang.String r1 = "zpbq"
                boolean r1 = r2.equals(r1)
                if (r1 != 0) goto L_0x0111
                goto L_0x012d
            L_0x0111:
                q00.g$a r1 = q00.C110264g.C47730a.APP_ZPBQ
                goto L_0x012e
            L_0x0114:
                java.lang.String r1 = "voip"
                boolean r1 = r2.equals(r1)
                if (r1 != 0) goto L_0x011e
                goto L_0x012d
            L_0x011e:
                q00.g$a r1 = q00.C110264g.C47730a.APP_VOIP
                goto L_0x012e
            L_0x0121:
                java.lang.String r1 = "unknown"
                boolean r1 = r2.equals(r1)
                if (r1 != 0) goto L_0x012a
                goto L_0x012d
            L_0x012a:
                q00.g$a r1 = q00.C110264g.C47730a.APP_UNSPECIFIED
                goto L_0x012e
            L_0x012d:
                r1 = 0
            L_0x012e:
                java.lang.Object r0 = r0.getValue()
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.util.Set r2 = r0.entrySet()
                java.lang.String r0 = "it.value.entries"
                gy3.C87412m.m108593f(r2, r0)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                ac3.l0 r8 = ac3.C0030l0.f36d
                r9 = 30
                r10 = 0
                java.lang.String r3 = ";"
                java.lang.String r0 = sx3.C110818d0.m150921S(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                if (r1 == 0) goto L_0x00cb
                ac3.g0 r2 = ac3.C27853g0.f76988a
                int r1 = r1.ordinal()
                r2.mo55641a(r1, r0)
                goto L_0x00cb
            L_0x0159:
                java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, te3.wz4>> r12 = ac3.C39538h0.f106162i
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L_0x0186
                ac3.g0 r12 = ac3.C27853g0.f76988a
                r0 = -1
                java.lang.String r1 = ""
                r12.mo55641a(r0, r1)
                goto L_0x0186
            L_0x016a:
                r12 = 4
                if (r0 != r12) goto L_0x0186
                com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct r12 = new com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct
                r12.<init>()
                int r0 = qr3.C110470e.f330363a
                if (r0 != 0) goto L_0x017b
                r0 = 2011400(0x1eb108, float:2.818572E-39)
                qr3.C110470e.f330363a = r0
            L_0x017b:
                int r0 = qr3.C110470e.f330363a
                r12.f79234d = r0
                r0 = 10
                r12.f79236f = r0
                r12.mo86054n()
            L_0x0186:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ac3.C39538h0.C39540d.call(java.lang.Object):java.lang.Object");
        }
    }

    static {
        C39538h0 h0Var = new C39538h0();
        f106157d = h0Var;
        if (MMApplicationContext.isMainProcess()) {
            C61926c.m72666K(10000, C39539a.f106164d);
        } else {
            h0Var.wx0();
        }
    }

    /* renamed from: GR */
    public void mo11884GR() {
        MultiProcessMMKV vx02 = vx0();
        C27862u0 u0Var = C27862u0.f77002a;
        vx02.remove("local_run_score");
        vx0().remove("local_cpu_score");
        vx0().remove("lcoal_gpu_score");
    }

    public void Nq0() {
        if (!((Boolean) ((C36570n) f106163j).getValue()).booleanValue()) {
            Log.m105924i(f106158e, "loadRemote: disable");
        }
        new C39537b().mo9225i().mo123420E(C39540d.f106165a);
    }

    public String fm0() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfigInfo:");
        Set<Map.Entry<String, HashMap<String, wz4>>> entrySet = f106162i.entrySet();
        C87412m.m108593f(entrySet, "configMap.entries");
        sb.append(C110818d0.m150921S(entrySet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0028c.f34d, 31, (Object) null));
        sb.append("\n\n");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Run Score:\nNeedRunScore: ");
        MultiProcessMMKV vx02 = vx0();
        C27862u0 u0Var = C27862u0.f77002a;
        sb4.append(vx02.getBoolean("need_run_score", false));
        sb4.append("\nLocalRunScore: ");
        sb4.append(vx0().getBoolean("local_run_score", true));
        sb4.append("\nremote CPU: ");
        sb4.append(vx0().getFloat("cpu_score", 0.0f));
        sb4.append("\nremote GPU: ");
        sb4.append(vx0().getFloat("gpu_score", 0.0f));
        sb4.append("\nlocal CPU: ");
        sb4.append(vx0().getFloat("local_cpu_score", 0.0f));
        sb4.append("\nlocal GPU: ");
        sb4.append(vx0().getFloat("lcoal_gpu_score", 0.0f));
        sb4.append(10);
        sb.append(sb4.toString());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[LOOP:0: B:26:0x004b->B:28:0x0051, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> i40(q00.C110264g.C47730a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "scene"
            gy3.C87412m.m108594g(r5, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0031
            r1 = 1
            if (r5 == r1) goto L_0x002d
            r1 = 2
            if (r5 == r1) goto L_0x002a
            r1 = 3
            if (r5 == r1) goto L_0x002a
            r1 = 4
            if (r5 == r1) goto L_0x0031
            r1 = 6
            if (r5 == r1) goto L_0x0027
            r1 = 7
            if (r5 == r1) goto L_0x0024
            r5 = 0
            goto L_0x0034
        L_0x0024:
            java.lang.String r5 = "unknown"
            goto L_0x0034
        L_0x0027:
            java.lang.String r5 = "sightcameracap"
            goto L_0x0034
        L_0x002a:
            java.lang.String r5 = "livevlog"
            goto L_0x0034
        L_0x002d:
            java.lang.String r5 = "zpbq"
            goto L_0x0034
        L_0x0031:
            java.lang.String r5 = "voip"
        L_0x0034:
            if (r5 != 0) goto L_0x0037
            goto L_0x0070
        L_0x0037:
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, te3.wz4>> r1 = f106162i
            java.lang.Object r5 = r1.get(r5)
            java.util.HashMap r5 = (java.util.HashMap) r5
            if (r5 == 0) goto L_0x0070
            java.util.Set r5 = r5.entrySet()
            if (r5 == 0) goto L_0x0070
            java.util.Iterator r5 = r5.iterator()
        L_0x004b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r3 = "it.key"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Object r1 = r1.getValue()
            te3.wz4 r1 = (te3.wz4) r1
            float r1 = r1.f144372f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            goto L_0x004b
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C39538h0.i40(q00.g$a):java.util.Map");
    }

    public final MultiProcessMMKV vx0() {
        return C27862u0.f77002a.mo55647b();
    }

    public final void wx0() {
        yz4 yz4 = new yz4();
        MultiProcessMMKV vx02 = vx0();
        C27862u0 u0Var = C27862u0.f77002a;
        byte[] decodeBytes = vx02.decodeBytes("effect_config");
        if (decodeBytes != null) {
            try {
                yz4.parseFrom(decodeBytes);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        xx0(yz4);
    }

    public final void xx0(yz4 yz4) {
        LinkedList<wz4> linkedList = f106161h;
        linkedList.clear();
        linkedList.addAll(yz4.f145598d);
        for (wz4 wz4 : linkedList) {
            HashMap<String, HashMap<String, wz4>> hashMap = f106162i;
            HashMap hashMap2 = hashMap.get(wz4.f144373g);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                String str = wz4.f144373g;
                C87412m.m108593f(str, "it.Scenario");
                hashMap.put(str, hashMap2);
            }
            String str2 = wz4.f144370d;
            C87412m.m108593f(str2, "it.ConfigKey");
            hashMap2.put(str2, wz4);
            String str3 = f106158e;
            Log.m105924i(str3, "updateConfigMap: scene:" + wz4.f144373g + ", key:" + wz4.f144370d + ", value:" + wz4.f144372f);
        }
        int i = WeVisUpdateReceiver.f82449a;
        if (MMApplicationContext.isMainProcess()) {
            Intent intent = new Intent("com.tencent.mm.WeVisUpdate");
            intent.putExtra("type", "effect_config");
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    public String yl0(C110264g.C47730a aVar, String str) {
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(str, "configKey");
        return (String) ((HashMap) i40(aVar)).get(str);
    }
}
