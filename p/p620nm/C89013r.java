package p620nm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.console.CommandLine;
import com.tencent.p014mm.console.Shell;
import com.tencent.p014mm.opensdk.utils.ILog;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.plugin.zero.LoadProtocolJNIService;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import eb0.C86492u2;
import ei3.C86522b;

@C86522b(dependencies = {C85597u.class, LoadProtocolJNIService.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: nm.r */
public class C89013r extends C86301e {

    /* renamed from: d */
    public volatile C86492u2 f256617d;

    /* renamed from: e */
    public final Shell f256618e = new Shell();

    /* renamed from: f */
    public final CommandLine f256619f = new CommandLine();

    /* renamed from: nm.r$a */
    public class C89014a implements ILog {
        public C89014a(C89013r rVar) {
        }

        /* renamed from: d */
        public void mo112987d(String str, String str2) {
            Log.m105918d(str, str2);
        }

        /* renamed from: e */
        public void mo112988e(String str, String str2) {
            Log.m105920e(str, str2);
        }

        /* renamed from: i */
        public void mo112989i(String str, String str2) {
            Log.m105924i(str, str2);
        }

        /* renamed from: v */
        public void mo112990v(String str, String str2) {
            Log.m105926v(str, str2);
        }

        /* renamed from: w */
        public void mo112991w(String str, String str2) {
            Log.m105928w(str, str2);
        }
    }

    /* renamed from: nm.r$b */
    public class C89015b implements C85975v4.C85977b {
        public C89015b(C89013r rVar) {
        }

        /* renamed from: d */
        public void mo119892d(String str, String str2, Object... objArr) {
            Log.m105919d(str, str2, objArr);
        }

        /* renamed from: e */
        public void mo119893e(String str, String str2, Object... objArr) {
            Log.m105921e(str, str2, objArr);
        }

        /* renamed from: i */
        public void mo119894i(String str, String str2, Object... objArr) {
            Log.m105925i(str, str2, objArr);
        }

        /* renamed from: v */
        public void mo119895v(String str, String str2, Object... objArr) {
            Log.m105927v(str, str2, objArr);
        }

        /* renamed from: w */
        public void mo119896w(String str, String str2, Object... objArr) {
            Log.m105929w(str, str2, objArr);
        }
    }

    /* renamed from: nm.r$c */
    public class C89016c implements C85623c.C85624a {
        public C89016c(C89013r rVar) {
        }
    }

    /* renamed from: kA */
    public C86492u2 mo123387kA() {
        if (this.f256617d == null) {
            synchronized (this) {
                if (this.f256617d == null) {
                    this.f256617d = new MMNotification(MMApplicationContext.getContext().getApplicationContext());
                }
            }
        }
        return this.f256617d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x059c A[SYNTHETIC, Splitter:B:132:0x059c] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0485 A[SYNTHETIC, Splitter:B:98:0x0485] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.content.Context r18) {
        /*
            r17 = this;
            r1 = r17
            super.onCreate(r18)
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r2 = r0.mo58407a()
            com.tencent.mm.app.p1 r0 = com.tencent.p014mm.app.C80610p1.f235824f
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.app.n1 r3 = new com.tencent.mm.app.n1
            r3.<init>(r0)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831185(0x7f112991, float:1.9295388E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "qqmail"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831146(0x7f11296a, float:1.929531E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "fmessage"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831128(0x7f112958, float:1.9295273E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "floatbottle"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831154(0x7f112972, float:1.9295326E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "lbsapp"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831197(0x7f11299d, float:1.9295413E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "shakeapp"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831163(0x7f11297b, float:1.9295344E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "medianote"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831182(0x7f11298e, float:1.9295382E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "qqfriend"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831193(0x7f112999, float:1.9295405E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "newsapp"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831140(0x7f112964, float:1.9295297E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "facebookapp"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831160(0x7f112978, float:1.9295338E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "masssendapp"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831166(0x7f11297e, float:1.929535E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "meishiapp"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831143(0x7f112967, float:1.9295303E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "feedsapp"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831207(0x7f1129a7, float:1.9295433E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "voipapp"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131833795(0x7f1133c3, float:1.9300682E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "weixin"
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831120(0x7f112950, float:1.9295257E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "filehelper"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831131(0x7f11295b, float:1.9295279E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "cardpackage"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831171(0x7f112983, float:1.929536E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "officialaccounts"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831210(0x7f1129aa, float:1.929544E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "voicevoipapp"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831151(0x7f11296f, float:1.929532E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "helper_entry"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831204(0x7f1129a4, float:1.9295427E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "voiceinputapp"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831157(0x7f112975, float:1.9295332E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "linkedinplugin"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831168(0x7f112980, float:1.9295354E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "notifymessage"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831216(0x7f1129b0, float:1.9295451E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "gh_f0a92aa7146c"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831215(0x7f1129af, float:1.929545E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "gh_e087bb5b95e6"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831122(0x7f112952, float:1.929526E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "appbrandcustomerservicemsg"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831125(0x7f112955, float:1.9295267E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "appbrand_notify_message"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831177(0x7f112989, float:1.9295372E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "opencustomerservicemsg"
            r0.put(r6, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r4 = 2131831134(0x7f11295e, float:1.9295285E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "conversationboxservice"
            r0.put(r6, r4)
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r4 = "clicfg_minishop_plugin_enabled"
            r6 = 1
            int r0 = r0.mo182443e(r4, r6, r6, r6)
            java.lang.String r4 = "MicroMsg.WorkerProfile"
            if (r6 != r0) goto L_0x0204
            java.lang.String r0 = "hardcode mini shop nickname"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r7 = 2131831167(0x7f11297f, float:1.9295352E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r8 = "gh_579db1f2cf89"
            r0.put(r8, r7)
        L_0x0204:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r7 = 2131831214(0x7f1129ae, float:1.9295447E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r8 = "gh_b4af18eac3d5"
            r0.put(r8, r7)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107257a
            r7 = 2131831213(0x7f1129ad, float:1.9295445E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r8 = "gh_3dfda90e39d6"
            r0.put(r8, r7)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f107258b
            r7 = 2131833794(0x7f1133c2, float:1.930068E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r5, r7)
            com.tencent.p014mm.contact.C40294d.f108319U1 = r3
            com.tencent.mm.app.p1 r0 = com.tencent.p014mm.app.C80610p1.f235824f
            ob0.b0 r3 = eb0.C97625j3.m125815e()
            r5 = -1
            r3.mo123455a(r5, r0)
            ob0.C117743k0.f352108h = r0
            eb0.C75579g.f222031f = r0
            nm.r$a r0 = new nm.r$a
            r0.<init>(r1)
            com.tencent.p014mm.opensdk.utils.Log.setLogImpl(r0)
            nm.r$b r0 = new nm.r$b
            r0.<init>(r1)
            com.tencent.p014mm.p136ui.C85975v4.f250419a = r0
            android.app.Application r3 = r2.f124990c
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.setupChannelId(r3)
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.loadProfile(r3)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            r7 = 0
            java.lang.String r8 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r0 = r0.sourceDir     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r8 = "initChannelUtil sourceFile = %s"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            r9[r7] = r0     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r9)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            android.content.pm.ApplicationInfo r8 = r3.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            int r8 = r8.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            r9 = 29
            if (r8 > r9) goto L_0x0331
            com.tencent.p014mm.app.C80610p1.m98241a(r0)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            vg.a r0 = p1054vg.C90793a.m113861b(r0)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r0 == 0) goto L_0x030a
            vg.b r8 = r0.f260724b     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r8 == 0) goto L_0x030a
            java.lang.String r8 = "apk external info not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            vg.b r8 = r0.f260724b     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            int r8 = r8.f260728e     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r8 == 0) goto L_0x029d
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId = r8     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r8 = "read channelId from apk external"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
        L_0x029d:
            vg.b r8 = r0.f260724b     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            int r8 = r8.f260730g     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r8 == 0) goto L_0x02b2
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.updateMode = r8     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r9 = "ext.updateMode = %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            r10[r7] = r8     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r10)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
        L_0x02b2:
            vg.b r8 = r0.f260724b     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r8 = r8.f260731h     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r8 == 0) goto L_0x02be
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r7)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.buildRev = r8     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
        L_0x02be:
            vg.b r8 = r0.f260724b     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r9 = r8.f260732i     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r9 == 0) goto L_0x02c6
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.marketURL = r9     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
        L_0x02c6:
            java.lang.String r9 = r8.f260729f     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r9 == 0) goto L_0x02cc
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.profileDeviceType = r9     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
        L_0x02cc:
            boolean r8 = r8.f260735o     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r8 == 0) goto L_0x02df
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.isNokiaAol = r8     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r9 = "ext.isNokiaol = %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            r10[r7] = r8     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r10)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
        L_0x02df:
            vg.b r8 = r0.f260724b     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            int r8 = r8.f260734n     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r8 == 0) goto L_0x02f4
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.autoAddAccount = r8     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r9 = "ext.autoAddAccount = %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            r10[r7] = r8     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r10)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
        L_0x02f4:
            vg.b r0 = r0.f260724b     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            boolean r0 = r0.f260733j     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r0 == 0) goto L_0x0331
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.shouldShowGprsAlert = r0     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.String r8 = "ext.shouldShowGprsAlert = %s"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            r9[r7] = r0     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r9)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            goto L_0x0331
        L_0x030a:
            java.lang.String r8 = "initChannelUtil something null %s"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            if (r0 != 0) goto L_0x0312
            r0 = 1
            goto L_0x0313
        L_0x0312:
            r0 = 0
        L_0x0313:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            r9[r7] = r0     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r8, r9)     // Catch:{ NameNotFoundException -> 0x032c, Exception -> 0x031d }
            goto L_0x0331
        L_0x031d:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r8[r7] = r0
            java.lang.String r0 = "Exception in initChannel, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r8)
            goto L_0x0331
        L_0x032c:
            java.lang.String r0 = "initChannelUtil NameNotFoundException"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0331:
            java.lang.String r4 = "Close ChannelHistory History file failed."
            java.lang.String r8 = ""
            java.lang.String r0 = com.tencent.p014mm.app.C80593h.f235771a
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r10 = r9.getPath()
            if (r10 == 0) goto L_0x035b
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r7, r7)
            java.lang.String r11 = r9.getPath()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x035b
            android.net.Uri$Builder r9 = r9.buildUpon()
            android.net.Uri$Builder r9 = r9.path(r10)
            android.net.Uri r9 = r9.build()
        L_0x035b:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r11 = 0
            com.tencent.mm.vfs.f0$h r9 = r10.mo177799l(r9, r11)
            boolean r10 = r9.mo177810a()
            if (r10 != 0) goto L_0x036a
            r9 = 0
            goto L_0x0372
        L_0x036a:
            com.tencent.mm.vfs.FileSystem$c r10 = r9.f348991a
            java.lang.String r9 = r9.f348992b
            boolean r9 = r10.mo119948x(r9)
        L_0x0372:
            java.lang.String r10 = "MicroMsg.ChannelHistory"
            r12 = 2
            if (r9 != 0) goto L_0x037e
            java.lang.String r0 = "channel history file does not exit!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0493
        L_0x037e:
            java.io.RandomAccessFile r9 = com.tencent.p014mm.vfs.C86013q1.m106420B(r0, r6)     // Catch:{ Exception -> 0x0477, all -> 0x0472 }
            long r13 = r9.length()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r0 = "correctChannleIdBySource fileLen:%d  curChannelId:%d"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0470 }
            java.lang.Long r16 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0470 }
            r15[r7] = r16     // Catch:{ Exception -> 0x0470 }
            int r16 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId     // Catch:{ Exception -> 0x0470 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0470 }
            r15[r6] = r16     // Catch:{ Exception -> 0x0470 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r15)     // Catch:{ Exception -> 0x0470 }
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x03b6
            java.lang.String r0 = "channel history file fileLen <= 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)     // Catch:{ Exception -> 0x0470 }
            r9.close()     // Catch:{ Exception -> 0x03ab }
            goto L_0x0493
        L_0x03ab:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r7] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r9, r4, r0)
            goto L_0x0493
        L_0x03b6:
            java.lang.String r0 = r9.readLine()     // Catch:{ Exception -> 0x0470 }
            int r15 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId     // Catch:{ Exception -> 0x0470 }
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.historyChannelId = r15     // Catch:{ Exception -> 0x0470 }
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r11 = ","
            if (r16 != 0) goto L_0x03fa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0470 }
            r5.<init>()     // Catch:{ Exception -> 0x0470 }
            r5.append(r8)     // Catch:{ Exception -> 0x0470 }
            r5.append(r0)     // Catch:{ Exception -> 0x0470 }
            r5.append(r11)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0470 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r7)     // Catch:{ Exception -> 0x0470 }
            int r12 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId     // Catch:{ Exception -> 0x0470 }
            if (r0 == r12) goto L_0x03fc
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.historyChannelId = r0     // Catch:{ Exception -> 0x0470 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0470 }
            r12.<init>()     // Catch:{ Exception -> 0x0470 }
            java.lang.String r6 = "real correct final channelid: "
            r12.append(r6)     // Catch:{ Exception -> 0x0470 }
            int r6 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId     // Catch:{ Exception -> 0x0470 }
            r12.append(r6)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r6 = r12.toString()     // Catch:{ Exception -> 0x0470 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)     // Catch:{ Exception -> 0x0470 }
            goto L_0x03fc
        L_0x03fa:
            r5 = r8
            r0 = r15
        L_0x03fc:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isVersionChange()     // Catch:{ Exception -> 0x0470 }
            if (r6 == 0) goto L_0x045c
        L_0x0402:
            java.lang.String r6 = r9.readLine()     // Catch:{ Exception -> 0x0470 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0470 }
            if (r12 != 0) goto L_0x0423
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0470 }
            r0.<init>()     // Catch:{ Exception -> 0x0470 }
            r0.append(r5)     // Catch:{ Exception -> 0x0470 }
            r0.append(r6)     // Catch:{ Exception -> 0x0470 }
            r0.append(r11)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x0470 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r7)     // Catch:{ Exception -> 0x0470 }
            goto L_0x0402
        L_0x0423:
            java.lang.String r6 = "channel list: %s"
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0470 }
            r12[r7] = r5     // Catch:{ Exception -> 0x0470 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r12)     // Catch:{ Exception -> 0x0470 }
            if (r0 == r15) goto L_0x045c
            r9.seek(r13)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r5 = "%d\n"
            java.lang.Object[] r6 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0470 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0470 }
            r6[r7] = r11     // Catch:{ Exception -> 0x0470 }
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ Exception -> 0x0470 }
            byte[] r5 = r5.getBytes()     // Catch:{ Exception -> 0x0470 }
            r9.write(r5)     // Catch:{ Exception -> 0x0470 }
            java.lang.String r5 = "channelid change from %d to %d"
            r6 = 2
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0470 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0470 }
            r11[r7] = r0     // Catch:{ Exception -> 0x0470 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0470 }
            r6 = 1
            r11[r6] = r0     // Catch:{ Exception -> 0x0470 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r11)     // Catch:{ Exception -> 0x0470 }
        L_0x045c:
            r9.close()     // Catch:{ Exception -> 0x0460 }
            goto L_0x0493
        L_0x0460:
            r0 = move-exception
            r5 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r7] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r5, r4, r0)
            goto L_0x0493
        L_0x046b:
            r0 = move-exception
            r2 = r0
            r11 = r9
            goto L_0x059a
        L_0x0470:
            r0 = move-exception
            goto L_0x0479
        L_0x0472:
            r0 = move-exception
            r2 = r0
            r11 = 0
            goto L_0x059a
        L_0x0477:
            r0 = move-exception
            r9 = 0
        L_0x0479:
            java.lang.String r5 = "Open ChannelHistory History file failed."
            r6 = 1
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x046b }
            r11[r7] = r8     // Catch:{ all -> 0x046b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r5, r11)     // Catch:{ all -> 0x046b }
            if (r9 == 0) goto L_0x0493
            r9.close()     // Catch:{ Exception -> 0x0489 }
            goto L_0x0493
        L_0x0489:
            r0 = move-exception
            r5 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r7] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r5, r4, r0)
        L_0x0493:
            com.tencent.mm.booter.d r0 = com.tencent.p014mm.booter.C80814d.m98665b(r3)
            if (r0 == 0) goto L_0x04a0
            int r0 = r0.f237576a
            r3 = -1
            if (r0 == r3) goto L_0x04a0
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId = r0
        L_0x04a0:
            android.app.Application r0 = r2.f124990c
            android.content.Context r0 = r0.getApplicationContext()
            int r2 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId
            int r3 = qe3.C89625d.f257841g
            java.lang.String r4 = "version"
            java.lang.String r5 = "channel"
            r6 = 4
            if (r0 == 0) goto L_0x04db
            if (r2 < 0) goto L_0x04db
            r8 = 637534208(0x26000000, float:4.440892E-16)
            if (r3 >= r8) goto L_0x04b9
            goto L_0x04db
        L_0x04b9:
            java.lang.String r8 = "crash_status_file"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r8, r6)     // Catch:{ all -> 0x04da }
            r8 = -1
            int r9 = r0.getInt(r5, r8)     // Catch:{ all -> 0x04da }
            int r8 = r0.getInt(r4, r7)     // Catch:{ all -> 0x04da }
            if (r9 != r2) goto L_0x04cc
            if (r8 == r3) goto L_0x04db
        L_0x04cc:
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x04da }
            r0.putInt(r5, r2)     // Catch:{ all -> 0x04da }
            r0.putInt(r4, r3)     // Catch:{ all -> 0x04da }
            r0.commit()     // Catch:{ all -> 0x04da }
            goto L_0x04db
        L_0x04da:
        L_0x04db:
            int r0 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.buildRev
            r2 = 1
            if (r0 <= 0) goto L_0x04e2
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.fullVersionInfo = r2
        L_0x04e2:
            r3 = -1
            com.tencent.p014mm.app.C80610p1.m98242b(r3)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r7] = r3
            int r3 = eb0.C75592q0.m90775e()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = p156gj.C87200o.f252868a
            r3 = 2
            r0[r3] = r2
            r2 = 3
            int r4 = qe3.C89625d.f257835a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r2] = r4
            java.lang.String r2 = "LegacyWorkProfileOnSplashService"
            java.lang.String r4 = "appOnCreate() called with: isFoldableDevice = [%s] authFlag:%s deviceType:%s deviceTypeId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = p156gj.C87200o.f252868a
            r0[r7] = r3
            java.lang.String r3 = com.tencent.p014mm.sdk.crash.CrashReportFactory.getDebugerApiLevel()
            r4 = 1
            r0[r4] = r3
            java.lang.String r3 = "set device type :%s  %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            android.app.Application r0 = r0.f124990c
            android.content.Context r0 = r0.getBaseContext()
            java.util.Locale r0 = com.tencent.p014mm.p136ui.MMActivity.initLanguage(r0)
            p219pm.C77112r.f225221d = r0
            java.lang.Class<bd2.d> r0 = bd2.C79690d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            bd2.d r0 = (bd2.C79690d) r0
            eb0.u2 r2 = r17.mo123387kA()
            r0.v60(r2)
            vd3.f r0 = new vd3.f
            com.tencent.mm.app.g r2 = new com.tencent.mm.app.g
            r2.<init>()
            r0.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setLoader"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.AvatarDrawable"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            vd3.C78391d.C78393b.f229711a = r0
            nm.r$c r0 = new nm.r$c
            r0.<init>(r1)
            com.tencent.p014mm.pluginsdk.platformtools.C85623c.f249568a = r0
            com.tencent.mm.console.Shell r0 = r1.f256618e
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.console.Shell$Receiver r3 = r0.f79323a
            if (r3 != 0) goto L_0x0594
            com.tencent.mm.console.Shell$Receiver r3 = new com.tencent.mm.console.Shell$Receiver
            r3.<init>()
            r0.f79323a = r3
            android.content.IntentFilter r0 = com.tencent.p014mm.console.Shell.f79322c
            boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r4 == 0) goto L_0x058e
            r4 = 0
            goto L_0x0590
        L_0x058e:
            java.lang.String r4 = "com.tencent.mm.permission.MOVE_XLOG"
        L_0x0590:
            r5 = 0
            r2.registerReceiver(r3, r0, r4, r5)
        L_0x0594:
            com.tencent.mm.console.CommandLine r0 = r1.f256619f
            r0.alive()
            return
        L_0x059a:
            if (r11 == 0) goto L_0x05aa
            r11.close()     // Catch:{ Exception -> 0x05a0 }
            goto L_0x05aa
        L_0x05a0:
            r0 = move-exception
            r3 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r7] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r3, r4, r0)
        L_0x05aa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p620nm.C89013r.onCreate(android.content.Context):void");
    }
}
