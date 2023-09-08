package com.tencent.p014mm.app;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.autogen.events.OtherLogoutEvent;
import com.tencent.p014mm.p136ui.tools.AccountDeletedAlphaAlertUI;
import com.tencent.p014mm.p136ui.tools.NewTaskUI;
import com.tencent.p014mm.plugin.report.service.IKVReportNotify;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75579g;
import eb0.C75587k2;
import eb0.C97625j3;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import mj2.C61494e;
import ob0.C11385n;
import ob0.C117743k0;
import ob0.C117747y;
import p1054vg.C90793a;
import p1054vg.C90795b;
import p875ci.C67378t;

/* renamed from: com.tencent.mm.app.p1 */
public final class C80610p1 implements C11385n, IKVReportNotify, C117743k0.C89143b, C75579g.C31463c {

    /* renamed from: f */
    public static C80610p1 f235824f = new C80610p1();
    @Deprecated

    /* renamed from: g */
    public static boolean f235825g;

    /* renamed from: h */
    public static boolean f235826h;

    /* renamed from: i */
    public static int f235827i;

    /* renamed from: j */
    public static StringBuilder f235828j = new StringBuilder();

    /* renamed from: n */
    public static C67378t f235829n;

    /* renamed from: o */
    public static int f235830o;

    /* renamed from: p */
    public static long f235831p;

    /* renamed from: d */
    public C30783v3.C30785b f235832d;

    /* renamed from: e */
    public C75587k2 f235833e;

    /* renamed from: com.tencent.mm.app.p1$a */
    public class C55106a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f154730d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f154731e;

        public C55106a(C80610p1 p1Var, int i, byte[] bArr) {
            this.f154730d = i;
            this.f154731e = bArr;
        }

        public void run() {
            if (!(C97625j3.f286396b == null)) {
                Log.m105924i("MicroMsg.WorkerProfile", "summeranrt onReportKVDataReady channel:" + this.f154730d);
                C97625j3.m125815e().mo123460f(new C61494e(this.f154731e, this.f154730d));
            }
        }
    }

    /* renamed from: a */
    public static void m98241a(String str) {
        try {
            int l = (int) C86013q1.m106451l(str);
            Log.m105925i("MicroMsg.WorkerProfile", "checkApkExternal, fileSize = %s", Integer.valueOf(l));
            if (l >= 8) {
                C90793a.C90794a a = C90793a.C90794a.m113863a(C86013q1.m106433O(str, l - 8, 8));
                if (a == null) {
                    Log.m105920e("MicroMsg.WorkerProfile", "checkApkExternal, header null");
                } else if ((a.f260726a + 8) - 8 >= 0) {
                    C90795b bVar = new C90795b();
                    int i = a.f260726a;
                    bVar.parseFrom(C86013q1.m106433O(str, (l - ((i + 8) - 8)) - 8, (i + 8) - 8));
                    Log.m105924i("MicroMsg.WorkerProfile", "checkApkExternal, check ok");
                } else {
                    Log.m105920e("MicroMsg.WorkerProfile", "checkApkExternal header wrong");
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WorkerProfile", e, "", new Object[0]);
            Log.m105921e("MicroMsg.WorkerProfile", "Exception in checkApkExternal, %s", e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if ((r4 & 1) != 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if ((r4 & 1) != 0) goto L_0x0020;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98242b(int r9) {
        /*
            r0 = 2
            qe3.C89625d.f257835a = r0
            r1 = -1
            r2 = 1
            r3 = 0
            if (r9 != r1) goto L_0x0034
            int r4 = eb0.C75592q0.f222074a
            if (r1 != r4) goto L_0x0030
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()     // Catch:{ all -> 0x0024 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r4)     // Catch:{ all -> 0x0024 }
            java.lang.String r5 = "PREF_KEY_LAST_AUTH_FLAG"
            int r4 = r4.getInt(r5, r1)     // Catch:{ all -> 0x0024 }
            if (r4 != r1) goto L_0x001d
            goto L_0x002e
        L_0x001d:
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0022
        L_0x0020:
            r4 = 0
            goto L_0x0035
        L_0x0022:
            r4 = 1
            goto L_0x0035
        L_0x0024:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "MicroMsg.ConfigStorageLogic"
            java.lang.String r7 = "getLastAuthDeviceFlagErr"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r4, r7, r5)
        L_0x002e:
            r4 = -1
            goto L_0x0035
        L_0x0030:
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0022
            goto L_0x0020
        L_0x0034:
            r4 = r9
        L_0x0035:
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            java.lang.String r7 = "android-"
            if (r5 == 0) goto L_0x0046
            if (r4 == r2) goto L_0x0097
            if (r4 != r1) goto L_0x0046
            goto L_0x0097
        L_0x0046:
            if (r6 != 0) goto L_0x006e
            if (r5 == 0) goto L_0x004b
            goto L_0x006e
        L_0x004b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.profileDeviceType
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0062
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0064
        L_0x0062:
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.profileDeviceType
        L_0x0064:
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            p156gj.C87200o.f252868a = r1
            goto L_0x0097
        L_0x006e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "pad-android-"
            r1.append(r8)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.profileDeviceType
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0088
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x008a
        L_0x0088:
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.profileDeviceType
        L_0x008a:
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            p156gj.C87200o.f252868a = r1
            r1 = 28
            qe3.C89625d.f257835a = r1
        L_0x0097:
            java.lang.String r1 = com.tencent.p014mm.sdk.crash.CrashReportFactory.getDebugerApiLevel()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = com.tencent.p014mm.sdk.crash.CrashReportFactory.getDebugerApiLevel()
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            p156gj.C87200o.f252868a = r1
        L_0x00b6:
            int r1 = qe3.C89625d.f257835a
            com.tencent.p014mm.protocal.MMProtocalJni.setDeviceTypeId(r1)
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r7 = p156gj.C87200o.f252868a
            r1[r3] = r7
            int r3 = qe3.C89625d.f257835a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r1[r0] = r2
            r0 = 3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r1[r0] = r2
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1[r0] = r2
            r0 = 5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r0] = r9
            r9 = 6
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r1[r9] = r0
            java.lang.String r9 = "MicroMsg.WorkerProfile"
            java.lang.String r0 = "initDeviceType:%s %s isFold:%s isTable:%s authFlag:%s pAuthFlag:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80610p1.m98242b(int):void");
    }

    public void onReportKVDataReady(byte[] bArr, byte[] bArr2, int i) {
        C86709a0.m107525e().postToWorker(new C55106a(this, i, bArr2));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Log.m105925i("MicroMsg.WorkerProfile", "onSceneEnd dkwt type:%d [%d,%d,%s]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), str2);
        if (i3 == 3 && i4 == -1) {
            Log.m105925i("MicroMsg.WorkerProfile", "getStack([ %s ]), ThreadID: %s", Util.getStack(), Long.valueOf(Thread.currentThread().getId()));
        }
        if (i3 == 4 && i4 == -3002) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.WorkerProfile", "summerdiz -3002 but errMsg is null");
                return;
            }
            String substring = str2.startsWith("autoauth_errmsg_") ? str2.substring(16) : str2;
            Log.m105925i("MicroMsg.WorkerProfile", "summerdiz MM_ERR_IDCDISASTER -3002 errStr:%s", substring);
            BroadcastEvent broadcastEvent = new BroadcastEvent();
            BroadcastEvent.C80706a aVar = broadcastEvent.f343529d;
            aVar.f236156a = 4;
            aVar.f236157b = substring;
            broadcastEvent.publish();
        } else if (!C97625j3.m125811a() || i3 != 4 || (!(i4 == -6 || i4 == -310 || i4 == -311) || str2 == null || !str2.startsWith("autoauth_errmsg_"))) {
            if (yVar.getType() != 701 && yVar.getType() != 702 && yVar.getType() != 126 && yVar.getType() != 252 && yVar.getType() != 763 && yVar.getType() != 138) {
                if (i3 == 4 && i4 == -213) {
                    C86709a0.m107528h().f251728e.getClass();
                    MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("system_config_prefs");
                    mmkv.encode("default_uin_timely", 0);
                    mmkv.encode("has_uin_timely", true);
                    OtherLogoutEvent otherLogoutEvent = new OtherLogoutEvent();
                    OtherLogoutEvent.C80733a aVar2 = otherLogoutEvent.f236259d;
                    aVar2.getClass();
                    aVar2.f236260a = 3;
                    otherLogoutEvent.publish();
                }
                if (i3 != 4) {
                    return;
                }
                if (i4 == -100 || i4 == -2023) {
                    C86709a0.m107528h().f251728e.getClass();
                    MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("system_config_prefs");
                    mmkv2.encode("default_uin_timely", 0);
                    mmkv2.encode("has_uin_timely", true);
                    OtherLogoutEvent otherLogoutEvent2 = new OtherLogoutEvent();
                    OtherLogoutEvent.C80733a aVar3 = otherLogoutEvent2.f236259d;
                    aVar3.getClass();
                    aVar3.f236260a = 1;
                    otherLogoutEvent2.publish();
                }
            } else if (i3 == 4 && i4 == -213) {
                C86709a0.m107528h().f251728e.getClass();
                MultiProcessMMKV mmkv3 = MultiProcessMMKV.getMMKV("system_config_prefs");
                mmkv3.encode("default_uin_timely", 0);
                mmkv3.encode("has_uin_timely", true);
                LogoutEvent logoutEvent = new LogoutEvent();
                LogoutEvent.C28774a aVar4 = logoutEvent.f78863d;
                aVar4.getClass();
                aVar4.f78864a = 3;
                logoutEvent.publish();
                if (AccountDeletedAlphaAlertUI.f348460d == null) {
                    Intent intent = new Intent();
                    intent.setClass(MMApplicationContext.getContext(), AccountDeletedAlphaAlertUI.class).addFlags(268435456);
                    intent.putExtra("errmsg", str2);
                    Context context = MMApplicationContext.getContext();
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar5.mo10232b(), "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar5.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (i3 != 4) {
            } else {
                if (i4 == -100 || i4 == -2023) {
                    C86709a0.m107528h().f251728e.getClass();
                    MultiProcessMMKV mmkv4 = MultiProcessMMKV.getMMKV("system_config_prefs");
                    mmkv4.encode("default_uin_timely", 0);
                    mmkv4.encode("has_uin_timely", true);
                    LogoutEvent logoutEvent2 = new LogoutEvent();
                    LogoutEvent.C28774a aVar6 = logoutEvent2.f78863d;
                    aVar6.getClass();
                    aVar6.f78864a = 1;
                    logoutEvent2.publish();
                }
            }
        } else if (NewTaskUI.f348576i == null) {
            Intent intent2 = new Intent();
            intent2.setClass(MMApplicationContext.getContext(), NewTaskUI.class).addFlags(268435456);
            Context context3 = MMApplicationContext.getContext();
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(intent2);
            Context context4 = context3;
            C117292a.m165358d(context4, aVar7.mo10232b(), "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((Intent) aVar7.mo10231a(0));
            C117292a.m165359e(context4, "com/tencent/mm/app/WorkerProfile", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
