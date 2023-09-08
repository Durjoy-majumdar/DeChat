package z73;

import android.os.Bundle;
import com.tencent.p014mm.pluginsdk.model.app.C6650r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: z73.b */
public final class C16114b extends C15053a {

    /* renamed from: d */
    public static final C16114b f43288d = new C16114b();

    /* renamed from: z73.b$a */
    public static final class C16115a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f43289d;

        /* renamed from: e */
        public final /* synthetic */ C13855j f43290e;

        /* renamed from: f */
        public final /* synthetic */ int f43291f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f43292g;

        /* renamed from: h */
        public final /* synthetic */ String f43293h;

        /* renamed from: i */
        public final /* synthetic */ String f43294i;

        /* renamed from: j */
        public final /* synthetic */ String f43295j;

        /* renamed from: n */
        public final /* synthetic */ C13851h1 f43296n;

        /* renamed from: o */
        public final /* synthetic */ String f43297o;

        /* renamed from: p */
        public final /* synthetic */ String f43298p;

        /* renamed from: z73.b$a$a */
        public static final class C16116a implements C6650r1.C6651a {

            /* renamed from: a */
            public final /* synthetic */ C13855j f43299a;

            /* renamed from: b */
            public final /* synthetic */ C13851h1 f43300b;

            public C16116a(C13855j jVar, C13851h1 h1Var) {
                this.f43299a = jVar;
                this.f43300b = h1Var;
            }

            /* renamed from: a */
            public final void mo2088a(boolean z, boolean z2) {
                Log.m105925i("MicroMsg.WebSearch.LocalLaunchApplication", "onLaunchAppCallback(launchRet: %s, launchSuccess: %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
                if (z) {
                    C13849g gVar = this.f43299a.f39001d;
                    String str = this.f43300b.f38990c;
                    C16114b.f43288d.getClass();
                    gVar.mo10774a(str, "localLaunchApplication:ok", (Map<String, Object>) null);
                    return;
                }
                C13849g gVar2 = this.f43299a.f39001d;
                String str2 = this.f43300b.f38990c;
                C16114b.f43288d.getClass();
                gVar2.mo10774a(str2, "localLaunchApplication:fail", (Map<String, Object>) null);
            }
        }

        public C16115a(String str, C13855j jVar, int i, Bundle bundle, String str2, String str3, String str4, C13851h1 h1Var, String str5, String str6) {
            this.f43289d = str;
            this.f43290e = jVar;
            this.f43291f = i;
            this.f43292g = bundle;
            this.f43293h = str2;
            this.f43294i = str3;
            this.f43295j = str4;
            this.f43296n = h1Var;
            this.f43297o = str5;
            this.f43298p = str6;
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x021b A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0246  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r16 = this;
                r1 = r16
                java.lang.Class<ym.l> r2 = p763ym.C79138l.class
                java.lang.Class<ym.s> r0 = p763ym.C53543s.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ym.s r0 = (p763ym.C53543s) r0
                z73.b$a$a r3 = new z73.b$a$a
                t83.j r4 = r1.f43290e
                t83.h1 r5 = r1.f43296n
                r3.<init>(r4, r5)
                com.tencent.mm.pluginsdk.model.app.r1 r3 = r0.mo74028xn(r3)
                java.lang.String r0 = r1.f43289d
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r4 = 0
                r5 = 268435456(0x10000000, float:2.5243549E-29)
                java.lang.String r13 = "android.intent.action.VIEW"
                r14 = 1
                if (r0 != 0) goto L_0x00a0
                android.content.Intent r8 = new android.content.Intent
                java.lang.String r0 = r1.f43289d
                android.net.Uri r0 = android.net.Uri.parse(r0)
                r8.<init>(r13, r0)
                r8.addFlags(r5)
                t83.j r0 = r1.f43290e
                android.content.Context r0 = r0.f38998a
                java.util.List r0 = com.tencent.p014mm.sdk.platformtools.Util.queryIntentActivities(r0, r8)
                if (r0 == 0) goto L_0x0046
                boolean r6 = r0.isEmpty()
                r6 = r6 ^ r14
                if (r6 != 0) goto L_0x0050
            L_0x0046:
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isAffectedByPackageVisibility(r6)
                if (r6 == 0) goto L_0x00a0
            L_0x0050:
                java.lang.String r6 = r8.getPackage()
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 == 0) goto L_0x0073
                if (r0 == 0) goto L_0x0073
                int r6 = r0.size()
                if (r6 != r14) goto L_0x0073
                di3.d r6 = di3.C86312j.m106911c(r2)
                ym.l r6 = (p763ym.C79138l) r6
                java.lang.Object r0 = r0.get(r4)
                android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
                java.lang.String r0 = r6.mo74017uF(r0)
                goto L_0x0077
            L_0x0073:
                java.lang.String r0 = r8.getPackage()
            L_0x0077:
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L_0x00a0
                di3.d r0 = di3.C86312j.m106911c(r2)
                r6 = r0
                ym.l r6 = (p763ym.C79138l) r6
                t83.j r0 = r1.f43290e
                android.content.Context r7 = r0.f38998a
                r9 = 0
                int r10 = r1.f43291f
                android.os.Bundle r12 = r1.f43292g
                r11 = r3
                boolean r0 = r6.mo73999QH(r7, r8, r9, r10, r11, r12)
                com.tencent.mm.pluginsdk.model.app.s1 r3 = (com.tencent.p014mm.pluginsdk.model.app.C6652s1) r3
                r3.mo7576b(r0)
                return
            L_0x00a0:
                java.lang.String r0 = r1.f43293h
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                java.lang.String r15 = "MicroMsg.WebSearch.LocalLaunchApplication"
                if (r0 != 0) goto L_0x017a
                java.lang.String r0 = r1.f43294i
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x017a
                t83.j r0 = r1.f43290e
                android.content.Context r0 = r0.f38998a
                java.lang.String r6 = r1.f43293h
                android.content.pm.Signature[] r0 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r0, r6)
                if (r0 == 0) goto L_0x017a
                r0 = r0[r4]
                if (r0 == 0) goto L_0x017a
                byte[] r0 = r0.toByteArray()
                java.lang.String r0 = p823sg.C90193h.m112878f(r0)
                r12 = 0
                if (r0 == 0) goto L_0x0162
                java.lang.String r6 = r1.f43294i
                boolean r0 = z04.C112551y.m153809i(r0, r6, r14)
                if (r0 == 0) goto L_0x0162
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0115 }
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x0115 }
                java.lang.String r6 = r1.f43293h     // Catch:{ Exception -> 0x0115 }
                android.content.Intent r8 = r0.getLaunchIntentForPackage(r6)     // Catch:{ Exception -> 0x0115 }
                if (r8 == 0) goto L_0x017a
                android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x0115 }
                r0.<init>()     // Catch:{ Exception -> 0x0115 }
                java.lang.String r6 = r1.f43295j     // Catch:{ Exception -> 0x0115 }
                com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85023i(r0, r6)     // Catch:{ Exception -> 0x0115 }
                r8.putExtras(r0)     // Catch:{ Exception -> 0x0115 }
                r8.addFlags(r5)     // Catch:{ Exception -> 0x0115 }
                di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0115 }
                r6 = r0
                ym.l r6 = (p763ym.C79138l) r6     // Catch:{ Exception -> 0x0115 }
                t83.j r0 = r1.f43290e     // Catch:{ Exception -> 0x0115 }
                android.content.Context r7 = r0.f38998a     // Catch:{ Exception -> 0x0115 }
                r9 = 0
                int r10 = r1.f43291f     // Catch:{ Exception -> 0x0115 }
                android.os.Bundle r0 = r1.f43292g     // Catch:{ Exception -> 0x0115 }
                r11 = r3
                r5 = r12
                r12 = r0
                boolean r0 = r6.mo73999QH(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0113 }
                r6 = r3
                com.tencent.mm.pluginsdk.model.app.s1 r6 = (com.tencent.p014mm.pluginsdk.model.app.C6652s1) r6     // Catch:{ Exception -> 0x0113 }
                r6.mo7576b(r0)     // Catch:{ Exception -> 0x0113 }
                return
            L_0x0113:
                r0 = move-exception
                goto L_0x0117
            L_0x0115:
                r0 = move-exception
                r5 = r12
            L_0x0117:
                java.lang.Object[] r6 = new java.lang.Object[r14]
                java.lang.String r7 = r0.getMessage()
                r6[r4] = r7
                java.lang.String r7 = "doLocalLaunchApplication getLaunchIntentForPackage, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r7, r6)
                t83.j r6 = r1.f43290e
                t83.g r6 = r6.f39001d
                t83.h1 r7 = r1.f43296n
                java.lang.String r7 = r7.f38990c
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                z73.b r9 = z73.C16114b.f43288d
                r9.getClass()
                java.lang.String r9 = "localLaunchApplication"
                r8.append(r9)
                java.lang.String r9 = ":fail. "
                r8.append(r9)
                java.lang.Object[] r9 = new java.lang.Object[r14]
                java.lang.String r0 = r0.getMessage()
                r9[r4] = r0
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r9, r14)
                java.lang.String r9 = "launchApplication getLaunchIntentForPackage, %s"
                java.lang.String r0 = java.lang.String.format(r9, r0)
                java.lang.String r9 = "format(format, *args)"
                gy3.C87412m.m108593f(r0, r9)
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                r6.mo10774a(r7, r0, r5)
                goto L_0x017a
            L_0x0162:
                r5 = r12
                java.lang.String r0 = "doLocalLaunchApplication signature not match"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                t83.j r0 = r1.f43290e
                t83.g r0 = r0.f39001d
                t83.h1 r6 = r1.f43296n
                java.lang.String r6 = r6.f38990c
                z73.b r7 = z73.C16114b.f43288d
                r7.getClass()
                java.lang.String r7 = "localLaunchApplication:fail. launchApplication signature not match"
                r0.mo10774a(r6, r7, r5)
            L_0x017a:
                com.tencent.mm.opensdk.modelmsg.WXAppExtendObject r0 = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject
                r0.<init>()
                java.lang.String r5 = r1.f43297o
                r0.extInfo = r5
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
                r5.<init>(r0)
                r0 = 638064131(0x26081603, float:4.721431E-16)
                r5.sdkVer = r0
                java.lang.String r0 = r1.f43297o
                r5.messageExt = r0
                com.tencent.mm.autogen.events.Launch3RdAppEvent r0 = new com.tencent.mm.autogen.events.Launch3RdAppEvent
                r0.<init>()
                com.tencent.mm.autogen.events.Launch3RdAppEvent$a r6 = r0.f9317d
                r6.f9319a = r5
                java.lang.String r5 = r1.f43298p
                r6.f9320b = r5
                int r5 = r1.f43291f
                r6.f9321c = r5
                t83.j r5 = r1.f43290e
                android.content.Context r5 = r5.f38998a
                r6.f9322d = r5
                android.os.Bundle r5 = r1.f43292g
                r6.f9324f = r5
                r6.f9323e = r3
                r0.publish()
                com.tencent.mm.autogen.events.Launch3RdAppEvent$b r0 = r0.f9318e
                boolean r0 = r0.f9325a
                if (r0 != 0) goto L_0x0263
                java.lang.String r5 = r1.f43298p
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x0263
                java.lang.String r5 = r1.f43295j
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x0263
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = r1.f43298p
                r5.append(r6)
                java.lang.String r6 = "://"
                r5.append(r6)
                java.lang.String r6 = r1.f43295j
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                android.content.Intent r8 = new android.content.Intent
                android.net.Uri r6 = android.net.Uri.parse(r5)
                r8.<init>(r13, r6)
                java.lang.Object[] r6 = new java.lang.Object[r14]
                r6[r4] = r5
                java.lang.String r5 = "doLocalLaunchApplication by opensdk failed, try to launch by scheme(%s)."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r6)
                r5 = 268435456(0x10000000, float:2.5243549E-29)
                r8.addFlags(r5)
                t83.j r5 = r1.f43290e
                android.content.Context r5 = r5.f38998a
                java.util.List r5 = com.tencent.p014mm.sdk.platformtools.Util.queryIntentActivities(r5, r8)
                if (r5 == 0) goto L_0x0207
                boolean r6 = r5.isEmpty()
                r6 = r6 ^ r14
                if (r6 != 0) goto L_0x0211
            L_0x0207:
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isAffectedByPackageVisibility(r6)
                if (r6 == 0) goto L_0x0263
            L_0x0211:
                java.lang.String r6 = r8.getPackage()
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 == 0) goto L_0x0234
                if (r5 == 0) goto L_0x0234
                int r6 = r5.size()
                if (r6 != r14) goto L_0x0234
                di3.d r6 = di3.C86312j.m106911c(r2)
                ym.l r6 = (p763ym.C79138l) r6
                java.lang.Object r5 = r5.get(r4)
                android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
                java.lang.String r5 = r6.mo74017uF(r5)
                goto L_0x0238
            L_0x0234:
                java.lang.String r5 = r8.getPackage()
            L_0x0238:
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L_0x0263
                r10 = r3
                com.tencent.mm.pluginsdk.model.app.s1 r10 = (com.tencent.p014mm.pluginsdk.model.app.C6652s1) r10
                r10.f23966c = r4
                r10.f23965b = r4
                r10.f23967d = r4
                r10.f23964a = r4
                di3.d r0 = di3.C86312j.m106911c(r2)
                r6 = r0
                ym.l r6 = (p763ym.C79138l) r6
                t83.j r0 = r1.f43290e
                android.content.Context r7 = r0.f38998a
                r9 = 0
                android.os.Bundle r11 = r1.f43292g
                boolean r0 = r6.Dm0(r7, r8, r9, r10, r11)
            L_0x0263:
                com.tencent.mm.pluginsdk.model.app.s1 r3 = (com.tencent.p014mm.pluginsdk.model.app.C6652s1) r3
                r3.mo7576b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z73.C16114b.C16115a.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r25, t83.C13851h1 r26) {
        /*
            r24 = this;
            r3 = r25
            r9 = r26
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r9, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f38983a
            java.lang.String r1 = "appID"
            java.lang.String r11 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r1)
            java.lang.String r1 = "getSaveString(params, \"appID\")"
            gy3.C87412m.m108593f(r11, r1)
            java.lang.String r1 = "schemeUrl"
            java.lang.String r2 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r1)
            java.lang.String r1 = "getSaveString(params, \"schemeUrl\")"
            gy3.C87412m.m108593f(r2, r1)
            java.lang.String r1 = "parameter"
            java.lang.String r8 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r1)
            java.lang.String r1 = "getSaveString(params, \"parameter\")"
            gy3.C87412m.m108593f(r8, r1)
            java.lang.String r1 = "packageName"
            java.lang.String r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r1)
            java.lang.String r1 = "getSaveString(params, \"packageName\")"
            gy3.C87412m.m108593f(r6, r1)
            java.lang.String r1 = "sourceInfo"
            java.lang.String r1 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r1)
            java.lang.String r4 = "getSaveString(params, \"sourceInfo\")"
            gy3.C87412m.m108593f(r1, r4)
            java.lang.String r4 = "bizInfo"
            java.lang.String r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r4)
            java.lang.String r5 = "getSaveString(params, \"bizInfo\")"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.String r5 = "signature"
            java.lang.String r7 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r5)
            java.lang.String r5 = "getSaveString(params, \"signature\")"
            gy3.C87412m.m108593f(r7, r5)
            java.lang.String r5 = "extInfo"
            java.lang.String r10 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r5)
            java.lang.String r5 = "getSaveString(params, \"extInfo\")"
            gy3.C87412m.m108593f(r10, r5)
            java.lang.String r5 = "showType"
            r12 = 0
            int r5 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r0, r5, r12)
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r12] = r11
            r13 = 1
            r0[r13] = r2
            r14 = 2
            r0[r14] = r10
            r14 = 3
            r0[r14] = r8
            r14 = 4
            r0[r14] = r6
            r14 = 5
            r0[r14] = r7
            r14 = 6
            r0[r14] = r1
            r14 = 7
            r0[r14] = r4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r15 = 8
            r0[r15] = r14
            java.lang.String r14 = "MicroMsg.WebSearch.LocalLaunchApplication"
            java.lang.String r15 = "doLocalLaunchApplication, appid: %s, scheme: %s, extinfo: [%s], parameter: %s, pkg: %s, signature: %s, sourceInfo: %s, bizInfo: %s, showType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            r15 = 0
            if (r0 == 0) goto L_0x00bf
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x00bf
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "appid, pkg and scheme is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            t83.g r0 = r3.f39001d
            java.lang.String r1 = r9.f38990c
            java.lang.String r2 = "localLaunchApplication:fail, appid, pkg and scheme is null or nil"
            r0.mo10774a(r1, r2, r15)
            return r13
        L_0x00bf:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f38983a
            java.lang.String r12 = "__jsapi_fw_ext_info"
            java.lang.Object r0 = r0.get(r12)
            boolean r12 = r0 instanceof android.os.Bundle
            if (r12 == 0) goto L_0x00d4
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r12 = "__jsapi_fw_ext_info_key_current_url"
            java.lang.String r0 = r0.getString(r12)
            goto L_0x00d5
        L_0x00d4:
            r0 = r15
        L_0x00d5:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r17 != 0) goto L_0x00eb
            java.lang.String r13 = "current_page_url"
            java.lang.String r15 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r15)     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            r12.putString(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x00eb }
        L_0x00eb:
            java.lang.String r0 = "current_page_appid"
            r13 = 0
            r12.putString(r0, r13)
            java.lang.String r13 = "current_page_biz_info"
            r12.putString(r13, r4)
            java.lang.String r4 = "current_page_source_info"
            r12.putString(r4, r1)
            com.tencent.mm.plugin.webview.stub.l r0 = r3.f39000c     // Catch:{ RemoteException -> 0x0111 }
            if (r0 == 0) goto L_0x010f
            if (r0 == 0) goto L_0x010c
            r1 = 1020(0x3fc, float:1.43E-42)
            r15 = 0
            android.os.Bundle r0 = r0.mo68114V5(r1, r15)     // Catch:{ RemoteException -> 0x010a }
            r15 = r0
            goto L_0x010d
        L_0x010a:
            r0 = move-exception
            goto L_0x0113
        L_0x010c:
            r15 = 0
        L_0x010d:
            r1 = 0
            goto L_0x011f
        L_0x010f:
            r1 = 0
            goto L_0x011e
        L_0x0111:
            r0 = move-exception
            r15 = 0
        L_0x0113:
            r1 = 1
            java.lang.Object[] r15 = new java.lang.Object[r1]
            r1 = 0
            r15[r1] = r0
            java.lang.String r0 = "invokeAsResult error.%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r15)
        L_0x011e:
            r15 = 0
        L_0x011f:
            java.lang.String r0 = ""
            if (r15 == 0) goto L_0x0187
            java.lang.String r0 = "key_get_a8key_req_params_req_id"
            int r0 = r15.getInt(r0)
            java.lang.String r1 = "key_get_a8key_req_params_username"
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r14 = "key_get_a8key_req_params_msg_username"
            java.lang.String r14 = r15.getString(r14)
            r16 = r0
            java.lang.String r0 = "key_get_a8key_req_params_msg_id"
            java.lang.String r0 = r15.getString(r0)
            r18 = r0
            java.lang.String r0 = "key_get_a8key_req_params_biz_info"
            java.lang.String r0 = r15.getString(r0)
            r19 = r0
            java.lang.String r0 = "key_get_a8key_req_params_source_info"
            java.lang.String r0 = r15.getString(r0)
            r20 = r0
            java.lang.String r0 = "key_get_a8key_req_params_msg_type"
            int r0 = r15.getInt(r0)
            r21 = r0
            java.lang.String r0 = "key_get_a8key_req_params_app_msg_type"
            int r0 = r15.getInt(r0)
            r22 = r0
            java.lang.String r0 = "key_get_a8key_req_params_ctrl_mode"
            int r0 = r15.getInt(r0)
            r23 = r0
            java.lang.String r0 = "key_get_a8key_req_params_scene"
            int r0 = r15.getInt(r0)
            r15 = r14
            r3 = r18
            r9 = r21
            r14 = r1
            r18 = r10
            r1 = r20
            r10 = r0
            r20 = r7
            r7 = r16
            r0 = r19
            r19 = r8
            r16 = r11
            r11 = r22
            r8 = r23
            goto L_0x0198
        L_0x0187:
            r1 = r0
            r3 = r1
            r14 = r3
            r15 = r14
            r20 = r7
            r19 = r8
            r18 = r10
            r16 = r11
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0198:
            boolean r21 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r21 != 0) goto L_0x01a1
            r12.putString(r13, r0)
        L_0x01a1:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x01aa
            r12.putString(r4, r1)
        L_0x01aa:
            java.lang.String r0 = "current_page_secCtrlMode"
            r12.putInt(r0, r8)
            java.lang.String r0 = "current_page_fromUsername"
            r12.putString(r0, r14)
            java.lang.String r0 = "current_page_msgUsername"
            r12.putString(r0, r15)
            java.lang.String r0 = "current_page_requestId"
            r12.putInt(r0, r7)
            java.lang.String r0 = "current_page_msgType"
            r12.putInt(r0, r9)
            java.lang.String r0 = "current_page_appMsgType"
            r12.putInt(r0, r11)
            java.lang.String r0 = "current_page_a8keyScene"
            r12.putInt(r0, r10)
            java.lang.String r0 = "current_page_msgId"
            r12.putString(r0, r3)
            java.lang.String r0 = "current_page_ad_onlineReport"
            r1 = 1
            r12.putBoolean(r0, r1)
            z73.b$a r0 = new z73.b$a
            r1 = r0
            r3 = r25
            r4 = r5
            r5 = r12
            r7 = r20
            r8 = r19
            r9 = r26
            r10 = r18
            r11 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            ji3.C9457a.m9137a(r0)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z73.C16114b.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "localLaunchApplication";
    }
}
