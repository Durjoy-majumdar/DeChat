package com.tencent.p014mm.plugin.base.stub;

import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Looper;
import android.os.Process;
import com.tencent.p014mm.autogen.events.HandleScanResultEvent;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.p014mm.plugin.account.p024ui.LoginUI;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.C82398i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C85606b2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import k20.C9556a;
import p1208q3.C118144a;
import p763ym.C79138l;
import p763ym.C79139p;
import zn0.C91797a;
import zn0.C91803c;

/* renamed from: com.tencent.mm.plugin.base.stub.WXCommProvider */
public class WXCommProvider extends ContentProvider {

    /* renamed from: g */
    public static final String f247883g = (MMApplicationContext.getPackageName() + "_comm_preferences");

    /* renamed from: h */
    public static final String[] f247884h = {"packageName", "data"};

    /* renamed from: i */
    public static final UriMatcher f247885i;

    /* renamed from: j */
    public static final Object f247886j = new Object();

    /* renamed from: n */
    public static volatile boolean f247887n = false;

    /* renamed from: o */
    public static boolean f247888o = false;

    /* renamed from: d */
    public MatrixCursor f247889d = new MatrixCursor(new String[0]);

    /* renamed from: e */
    public SharedPreferences f247890e;

    /* renamed from: f */
    public MMHandler f247891f;

    /* renamed from: com.tencent.mm.plugin.base.stub.WXCommProvider$a */
    public class C85074a extends BroadcastReceiver {
        public C85074a() {
        }

        public void onReceive(Context context, Intent intent) {
            C85606b2 S80 = ((C79139p) C86312j.m106911c(C79139p.class)).S80();
            if (S80 != null) {
                Log.m105924i("MicroMsg.WXCommProvider", "hy: has wxcomm query request. start to continue requesting");
                Cursor b = WXCommProvider.this.mo118040b(S80.f249528a, S80.f249529b, S80.f249530c, S80.f249531d, S80.f249532e, S80.f249533f, S80.f249534g);
                if (b != null) {
                    b.close();
                }
                C85606b2.f249526h = null;
                C85606b2.f249527i = -1;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXCommProvider$b */
    public class C85075b implements MTimerHandler.CallBack {
        public C85075b(WXCommProvider wXCommProvider) {
        }

        public boolean onTimerExpired() {
            if (!C86709a0.m107528h().f251724a.f251792d) {
                return true;
            }
            Object obj = WXCommProvider.f247886j;
            synchronized (obj) {
                Log.m105924i("MicroMsg.WXCommProvider", "The lock was released.");
                WXCommProvider.f247887n = true;
                obj.notifyAll();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXCommProvider$c */
    public class C85076c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ HandleScanResultEvent f247893d;

        public C85076c(WXCommProvider wXCommProvider, HandleScanResultEvent handleScanResultEvent) {
            this.f247893d = handleScanResultEvent;
        }

        public void run() {
            if (!this.f247893d.publish()) {
                Log.m105920e("MicroMsg.WXCommProvider", "handle scan result failed again");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXCommProvider$d */
    public class C85077d extends SyncTask<Cursor> {

        /* renamed from: a */
        public final /* synthetic */ Uri f247894a;

        /* renamed from: b */
        public final /* synthetic */ int f247895b;

        /* renamed from: c */
        public final /* synthetic */ String[] f247896c;

        /* renamed from: d */
        public final /* synthetic */ MatrixCursor f247897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85077d(long j, Cursor cursor, Uri uri, int i, String[] strArr, MatrixCursor matrixCursor) {
            super(j, cursor);
            this.f247894a = uri;
            this.f247895b = i;
            this.f247896c = strArr;
            this.f247897d = matrixCursor;
        }

        public Object run() {
            Log.m105919d("MicroMsg.WXCommProvider", "query, uri = %s, code = %d", this.f247894a.toString(), Integer.valueOf(this.f247895b));
            int i = this.f247895b;
            if (i != 1) {
                Log.m105921e("MicroMsg.WXCommProvider", "query fail, invalid code = %d", Integer.valueOf(i));
                return null;
            }
            for (String str : this.f247896c) {
                this.f247897d.addRow(new String[]{str, WXCommProvider.this.f247890e.getString(str, "")});
            }
            Log.m105919d("MicroMsg.WXCommProvider", "query size = %d", Integer.valueOf(this.f247897d.getCount()));
            return this.f247897d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXCommProvider$e */
    public class C85078e extends SyncTask<Integer> {

        /* renamed from: a */
        public final /* synthetic */ Uri f247899a;

        /* renamed from: b */
        public final /* synthetic */ int f247900b;

        /* renamed from: c */
        public final /* synthetic */ String[] f247901c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85078e(long j, Integer num, Uri uri, int i, String[] strArr) {
            super(j, num);
            this.f247899a = uri;
            this.f247900b = i;
            this.f247901c = strArr;
        }

        public Object run() {
            Log.m105919d("MicroMsg.WXCommProvider", "delete, uri = %s, code = %d", this.f247899a.toString(), Integer.valueOf(this.f247900b));
            int i = this.f247900b;
            if (i != 1) {
                Log.m105921e("MicroMsg.WXCommProvider", "delete fail, invalid code = %d", Integer.valueOf(i));
                return null;
            }
            int i2 = 0;
            for (String str : this.f247901c) {
                if (!Util.isNullOrNil(str)) {
                    if (WXCommProvider.this.f247890e.contains(str) && WXCommProvider.this.f247890e.edit().remove(str).commit()) {
                        i2++;
                    }
                }
            }
            Log.m105919d("MicroMsg.WXCommProvider", "delete result = %d", Integer.valueOf(i2));
            return Integer.valueOf(i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXCommProvider$f */
    public class C85079f extends SyncTask<Boolean> {
        public C85079f(WXCommProvider wXCommProvider, long j, Boolean bool, boolean z) {
            super(j, bool, z);
        }

        public Object run() {
            try {
                Log.m105924i("MicroMsg.WXCommProvider", "checkIsLogin run");
                if (!C97625j3.m125811a()) {
                    return Boolean.FALSE;
                }
                Log.m105924i("MicroMsg.WXCommProvider", "checkIsLogin doScene");
                return Boolean.valueOf(C97625j3.m125815e().mo123461g(new C75576f4(new C85091m(this), (String) null), 0));
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.WXCommProvider", "exception in NetSceneLocalProxy.");
                Boolean bool = Boolean.FALSE;
                setResultFinish(bool);
                return bool;
            }
        }
    }

    static {
        String AUTHORITIES_SDK_COMM_PROVIDER = WeChatAuthorities.AUTHORITIES_SDK_COMM_PROVIDER();
        UriMatcher uriMatcher = new UriMatcher(-1);
        f247885i = uriMatcher;
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "pref", 1);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openQRCodeScan", 18);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "batchAddShortcut", 19);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "getUnreadCount", 20);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "jumpToBizProfile", 21);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "jumpToBizTempSession", 27);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "registerMsgListener", 22);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "getAvatar", 23);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "regWatchAppId", 24);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "decodeVoice", 25);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "addCardToWX", 26);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "unReadMsgs", 9);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "to_chatting", 3);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "setReaded", 13);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "voiceControl", 29);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openRankList", 28);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openWebview", 30);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openBusiLuckyMoney", 31);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "createChatroom", 32);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "joinChatroom", 33);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "sendSight", 34);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "redirectToChattingByPhoneNumber", 35);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "redirectToWechatOutByPhoneNumber", 36);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, C91803c.NAME, 37);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, C91797a.NAME, 38);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "chooseCardFromWX", 39);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openOfflinePay", 42);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "setWechatSportStep", 40);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "getWechatSportConfig", 41);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "handleScanResult", 44);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openTypeWebview", 45);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openCleanUI", 46);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "launchWXMiniprogram", 47);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "preloadWXMiniprogram", 57);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "preloadWXMiniprogramEnvironment", 62);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, C82398i.NAME, 53);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "genTokenForOpenSdk", 43);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "qrcodeEvent", 48);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "jumpToOfflinePay", 49);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openBusinessWebview", 50);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "getWxaInfo", 51);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openWxaDesktopOrWxaMyFavorite", 52);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openWxaListPage", 56);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "getSimpleWxaInfo", 54);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "launchWXMiniprogramWithToken", 55);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, WXLaunchWxaRedirectingPage.URI_PATH, 58);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "checkSupportWxaOpenAPI", 59);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "getWCProbeWaid", 60);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "checkIfSupportWxaSDKFeature", 61);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "finderShareVideo", 63);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "finderOpenProfile", 64);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "finderOpenLive", 65);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "finderOpenFeed", 66);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "checkFacialRecognitionVerifyCapability", 67);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "openCustomerServiceChat", 68);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "QRCodePay", 69);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "finderOpenEvent", 70);
        uriMatcher.addURI(AUTHORITIES_SDK_COMM_PROVIDER, "finderStartLive", 71);
    }

    /* renamed from: a */
    public boolean mo118039a(boolean z) {
        try {
            Log.m105924i("MicroMsg.WXCommProvider", "checkIsLogin()");
            if (!f247888o) {
                if (!((Boolean) new C85079f(this, 4000, Boolean.FALSE, true).exec(this.f247891f)).booleanValue()) {
                    Log.m105924i("MicroMsg.WXCommProvider", "checkIsLogin !syncTaskRet");
                    f247888o = false;
                    return false;
                }
            }
            if (!C97625j3.m125811a() || !C97625j3.m125820j() || C86718e.m107551r()) {
                f247888o = false;
            } else {
                f247888o = true;
            }
            Log.m105924i("MicroMsg.WXCommProvider", "hasLogin = " + f247888o);
            return f247888o;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.WXCommProvider", e.getMessage());
            Log.printErrStackTrace("MicroMsg.WXCommProvider", e, "", new Object[0]);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:244:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0693  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor mo118040b(android.net.Uri r36, java.lang.String[] r37, java.lang.String r38, java.lang.String[] r39, java.lang.String r40, int r41, java.lang.String[] r42) {
        /*
            r35 = this;
            r10 = r35
            r6 = r36
            r5 = r39
            r7 = r41
            r8 = r42
            java.lang.Class<ym.p> r0 = p763ym.C79139p.class
            java.lang.Class<com.tencent.mm.plugin.base.stub.WXBizEntryActivity> r1 = com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity.class
            r9 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r41)
            r11 = 0
            r3[r11] = r4
            java.lang.String r4 = "MicroMsg.WXCommProvider"
            java.lang.String r12 = "dealWithRealLogic:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r3)
            java.lang.String r3 = "1"
            java.lang.String r12 = "0"
            r13 = 9
            r14 = 3
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)
            java.lang.String r9 = ""
            if (r7 == r14) goto L_0x0ab4
            if (r7 == r13) goto L_0x0ab4
            r13 = 13
            if (r7 == r13) goto L_0x0ab4
            java.lang.String r13 = "ExtCallBizEvent fail"
            java.lang.String r14 = "UTF-8"
            java.lang.String r15 = "key_app_id"
            java.lang.String r11 = "appId is null"
            r21 = r3
            java.lang.String r3 = "args is null"
            r22 = r13
            java.lang.String r13 = "context is null"
            java.lang.String r6 = "key_command_id"
            java.lang.String r10 = "key_package_signature"
            r23 = r4
            java.lang.String r4 = "translate_link_scene"
            r24 = r2
            java.lang.String r2 = "key_package_name"
            r25 = r12
            java.lang.String r12 = "MicroMsg.WXBizLogic"
            r26 = 0
            r27 = r0
            java.lang.String r0 = "support"
            r28 = r9
            java.lang.String r9 = "open webview fail"
            r29 = r9
            switch(r7) {
                case 18: goto L_0x0a7d;
                case 19: goto L_0x0a7d;
                case 20: goto L_0x0a7d;
                case 21: goto L_0x0a53;
                case 22: goto L_0x0a4a;
                case 23: goto L_0x0a4a;
                case 24: goto L_0x0a07;
                case 25: goto L_0x0a4a;
                case 26: goto L_0x09e6;
                case 27: goto L_0x09ae;
                case 28: goto L_0x0989;
                case 29: goto L_0x0a4a;
                case 30: goto L_0x094f;
                case 31: goto L_0x092d;
                case 32: goto L_0x0909;
                case 33: goto L_0x08e5;
                case 34: goto L_0x0a4a;
                case 35: goto L_0x0a4a;
                case 36: goto L_0x0a4a;
                case 37: goto L_0x0a4a;
                case 38: goto L_0x0a4a;
                case 39: goto L_0x08c4;
                case 40: goto L_0x0a4a;
                case 41: goto L_0x0a4a;
                case 42: goto L_0x0a4a;
                case 43: goto L_0x085d;
                case 44: goto L_0x082f;
                case 45: goto L_0x094f;
                case 46: goto L_0x0a4a;
                case 47: goto L_0x081a;
                case 48: goto L_0x0a4a;
                case 49: goto L_0x07fa;
                case 50: goto L_0x0712;
                case 51: goto L_0x0a4a;
                case 52: goto L_0x0a4a;
                case 53: goto L_0x0574;
                case 54: goto L_0x0a4a;
                case 55: goto L_0x0563;
                case 56: goto L_0x0a4a;
                case 57: goto L_0x0525;
                case 58: goto L_0x0430;
                case 59: goto L_0x041d;
                case 60: goto L_0x0401;
                case 61: goto L_0x03af;
                case 62: goto L_0x0398;
                case 63: goto L_0x026d;
                case 64: goto L_0x01ae;
                case 65: goto L_0x01a6;
                case 66: goto L_0x019e;
                case 67: goto L_0x0165;
                case 68: goto L_0x00ac;
                case 69: goto L_0x00a4;
                case 70: goto L_0x009c;
                case 71: goto L_0x0094;
                default: goto L_0x006a;
            }
        L_0x006a:
            r10 = r35
            r6 = r36
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r1 = f247884h
            r0.<init>(r1)
            com.tencent.mm.plugin.base.stub.WXCommProvider$d r11 = new com.tencent.mm.plugin.base.stub.WXCommProvider$d
            r3 = 2000(0x7d0, double:9.88E-321)
            r5 = 0
            r1 = r11
            r2 = r35
            r7 = r41
            r8 = r42
            r9 = r0
            r1.<init>(r3, r5, r6, r7, r8, r9)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r10.f247891f
            java.lang.Object r1 = r11.exec(r1)
            android.database.Cursor r1 = (android.database.Cursor) r1
            if (r1 != 0) goto L_0x0ab3
            r0.close()
            goto L_0x0ab3
        L_0x0094:
            android.content.Context r0 = r35.getContext()
            com.tencent.p014mm.plugin.base.stub.C85083h.m104920i(r0, r5, r8)
            return r26
        L_0x009c:
            android.content.Context r0 = r35.getContext()
            com.tencent.p014mm.plugin.base.stub.C85083h.m104917f(r0, r5, r8)
            return r26
        L_0x00a4:
            android.content.Context r0 = r35.getContext()
            com.tencent.p014mm.plugin.base.stub.C85083h.m104925n(r0, r5, r8)
            return r26
        L_0x00ac:
            android.content.Context r0 = r35.getContext()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r7 = com.tencent.p014mm.plugin.base.stub.C85083h.f247920a
            if (r0 != 0) goto L_0x00b9
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r13)
            goto L_0x0164
        L_0x00b9:
            if (r8 == 0) goto L_0x00d5
            int r7 = r8.length
            if (r7 <= 0) goto L_0x00d5
            r7 = 0
            r8 = r8[r7]
            android.content.pm.Signature[] r13 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r0, r8)
            if (r13 == 0) goto L_0x00d2
            r13 = r13[r7]
            byte[] r13 = r13.toByteArray()
            java.lang.String r13 = p823sg.C90193h.m112878f(r13)
            goto L_0x00d9
        L_0x00d2:
            r13 = r26
            goto L_0x00d9
        L_0x00d5:
            r7 = 0
            r8 = r26
            r13 = r8
        L_0x00d9:
            r14 = 2
            java.lang.Object[] r9 = new java.lang.Object[r14]
            r9[r7] = r8
            r16 = 1
            r9[r16] = r13
            java.lang.String r7 = "openCustomerServiceChat packageName = %s, sig = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r9)
            if (r5 == 0) goto L_0x0161
            int r7 = r5.length
            if (r7 >= r14) goto L_0x00ee
            goto L_0x0161
        L_0x00ee:
            r7 = 0
            r3 = r5[r7]
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r7 == 0) goto L_0x00fb
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)
            goto L_0x0164
        L_0x00fb:
            r7 = 1
            r9 = r5[r7]
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r7 == 0) goto L_0x010a
            java.lang.String r0 = "corpId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0164
        L_0x010a:
            r7 = 2
            r5 = r5[r7]
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r11 == 0) goto L_0x011a
            java.lang.String r0 = "url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0164
        L_0x011a:
            java.lang.String r5 = java.net.URLEncoder.encode(r5)
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r14 = 0
            r11[r14] = r3
            r14 = 1
            r11[r14] = r9
            r11[r7] = r5
            java.lang.String r5 = "weixin://dl/customerService/?appid=%s&corpid=%s&kfurl=%s"
            java.lang.String r5 = java.lang.String.format(r5, r11)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            r9 = 0
            r7[r9] = r5
            java.lang.String r9 = "openCustomerServiceChat uri: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r0, r1)
            android.net.Uri r1 = android.net.Uri.parse(r5)
            r7.setData(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r7.addFlags(r1)
            r7.putExtra(r15, r3)
            r7.putExtra(r2, r8)
            r7.putExtra(r4, r14)
            r7.putExtra(r10, r13)
            r1 = 37
            r7.putExtra(r6, r1)
            com.tencent.p014mm.plugin.base.stub.C85083h.m104929r(r7, r0)
            goto L_0x0164
        L_0x0161:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r3)
        L_0x0164:
            return r26
        L_0x0165:
            com.tencent.mm.autogen.events.GetIsSupportFaceEvent r0 = new com.tencent.mm.autogen.events.GetIsSupportFaceEvent
            r0.<init>()
            r0.publish()
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String r2 = "errCode"
            java.lang.String r3 = "errMsg"
            java.lang.String r4 = "libVersionCode"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4}
            r1.<init>(r2)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mm.autogen.events.GetIsSupportFaceEvent$a r3 = r0.f9294d
            int r3 = r3.f9296b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            com.tencent.mm.autogen.events.GetIsSupportFaceEvent$a r0 = r0.f9294d
            java.lang.String r3 = r0.f9297c
            r4 = 1
            r2[r4] = r3
            int r0 = r0.f9298d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 2
            r2[r3] = r0
            r1.addRow(r2)
            return r1
        L_0x019e:
            android.content.Context r0 = r35.getContext()
            com.tencent.p014mm.plugin.base.stub.C85083h.m104918g(r0, r5, r8)
            return r26
        L_0x01a6:
            android.content.Context r0 = r35.getContext()
            com.tencent.p014mm.plugin.base.stub.C85083h.m104919h(r0, r5, r8)
            return r26
        L_0x01ae:
            android.content.Context r7 = r35.getContext()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r0 = com.tencent.p014mm.plugin.base.stub.C85083h.f247920a
            if (r7 != 0) goto L_0x01bb
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r13)
            goto L_0x026c
        L_0x01bb:
            if (r8 == 0) goto L_0x01dc
            int r0 = r8.length
            if (r0 <= 0) goto L_0x01dc
            r9 = 0
            r0 = r8[r9]
            android.content.pm.Signature[] r8 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r7, r0)
            if (r8 == 0) goto L_0x01d4
            r8 = r8[r9]
            byte[] r8 = r8.toByteArray()
            java.lang.String r8 = p823sg.C90193h.m112878f(r8)
            goto L_0x01d6
        L_0x01d4:
            r8 = r26
        L_0x01d6:
            r30 = r3
            r13 = r8
            r3 = 2
            r8 = r0
            goto L_0x01e3
        L_0x01dc:
            r9 = 0
            r30 = r3
            r8 = r26
            r13 = r8
            r3 = 2
        L_0x01e3:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r9] = r8
            r16 = 1
            r0[r16] = r13
            java.lang.String r9 = "finderOpenProfile packageName = %s, sig = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r0)
            if (r5 == 0) goto L_0x0267
            int r0 = r5.length
            if (r0 >= r3) goto L_0x01f7
            goto L_0x0267
        L_0x01f7:
            r3 = 0
            r9 = r5[r3]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 == 0) goto L_0x0204
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)
            goto L_0x026c
        L_0x0204:
            r3 = 1
            r5 = r5[r3]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = "username isEmpty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x026c
        L_0x0214:
            java.lang.String r0 = java.net.URLEncoder.encode(r5, r14)     // Catch:{ UnsupportedEncodingException -> 0x021c }
            r14 = r0
            r3 = 2
            r11 = 0
            goto L_0x0227
        L_0x021c:
            r0 = move-exception
            r3 = r0
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r14 = r28
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r3, r14, r0)
            r3 = 2
        L_0x0227:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r11] = r9
            r11 = 1
            r0[r11] = r14
            java.lang.String r14 = "weixin://dl/channels/profile/?appid=%s&username=%s"
            java.lang.String r0 = java.lang.String.format(r14, r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r14 = 0
            r3[r14] = r9
            r3[r11] = r5
            java.lang.String r5 = "finderOpenProfile: appid = %s, username = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r7, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3.setData(r0)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r1)
            r3.putExtra(r15, r9)
            r3.putExtra(r2, r8)
            r3.putExtra(r4, r11)
            r3.putExtra(r10, r13)
            r0 = 34
            r3.putExtra(r6, r0)
            com.tencent.p014mm.plugin.base.stub.C85083h.m104929r(r3, r7)
            goto L_0x026c
        L_0x0267:
            r0 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x026c:
            return r26
        L_0x026d:
            r0 = r3
            r3 = r28
            android.content.Context r7 = r35.getContext()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r9 = com.tencent.p014mm.plugin.base.stub.C85083h.f247920a
            if (r7 != 0) goto L_0x027d
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r13)
            goto L_0x0397
        L_0x027d:
            if (r8 == 0) goto L_0x029d
            int r9 = r8.length
            if (r9 <= 0) goto L_0x029d
            r9 = 0
            r8 = r8[r9]
            android.content.pm.Signature[] r13 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r7, r8)
            if (r13 == 0) goto L_0x0296
            r13 = r13[r9]
            byte[] r13 = r13.toByteArray()
            java.lang.String r13 = p823sg.C90193h.m112878f(r13)
            goto L_0x0298
        L_0x0296:
            r13 = r26
        L_0x0298:
            r30 = r0
            r28 = r6
            goto L_0x02a5
        L_0x029d:
            r9 = 0
            r30 = r0
            r28 = r6
            r8 = r26
            r13 = r8
        L_0x02a5:
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r8
            r17 = 1
            r0[r17] = r13
            java.lang.String r9 = "finderShareVideo packageName = %s, sig = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r0)
            if (r5 == 0) goto L_0x0392
            int r0 = r5.length
            if (r0 >= r6) goto L_0x02ba
            goto L_0x0392
        L_0x02ba:
            r6 = 0
            r9 = r5[r6]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 == 0) goto L_0x02c8
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)
            goto L_0x0397
        L_0x02c8:
            r6 = 1
            r11 = r5[r6]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 == 0) goto L_0x02d9
            java.lang.String r0 = "videoPath isEmpty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0397
        L_0x02d9:
            int r0 = r5.length
            r6 = 3
            if (r0 < r6) goto L_0x02e4
            r17 = 2
            r0 = r5[r17]
            r31 = r0
            goto L_0x02e6
        L_0x02e4:
            r31 = r3
        L_0x02e6:
            int r0 = r5.length
            r32 = r10
            r10 = 4
            if (r0 < r10) goto L_0x02f0
            r0 = r5[r6]
            r6 = r0
            goto L_0x02f1
        L_0x02f0:
            r6 = r3
        L_0x02f1:
            int r0 = r5.length
            r36 = r13
            r13 = 5
            if (r0 < r13) goto L_0x02fb
            r0 = r5[r10]
            r10 = r0
            goto L_0x02fc
        L_0x02fb:
            r10 = r3
        L_0x02fc:
            int r0 = r5.length
            r33 = r4
            r4 = 6
            if (r0 < r4) goto L_0x0306
            r0 = r5[r13]
            r4 = r0
            goto L_0x0307
        L_0x0306:
            r4 = r3
        L_0x0307:
            r5 = r31
            java.lang.String r13 = java.net.URLEncoder.encode(r5, r14)     // Catch:{ UnsupportedEncodingException -> 0x031b }
            java.lang.String r0 = java.net.URLEncoder.encode(r6, r14)     // Catch:{ UnsupportedEncodingException -> 0x0317 }
            r31 = r2
            r3 = r13
            r13 = 0
            r14 = 3
            goto L_0x032a
        L_0x0317:
            r0 = move-exception
            r37 = r13
            goto L_0x031e
        L_0x031b:
            r0 = move-exception
            r37 = r3
        L_0x031e:
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r14)
            r31 = r2
            r0 = r3
            r14 = 3
            r3 = r37
        L_0x032a:
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r13] = r9
            r17 = 1
            r2[r17] = r3
            r3 = 2
            r2[r3] = r0
            java.lang.String r0 = "weixin://dl/channels/shareVideo/?appid=%s&title=%s&url=%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r13] = r9
            r2[r17] = r11
            r2[r3] = r5
            r2[r14] = r6
            r3 = 4
            r2[r3] = r10
            r3 = 5
            r2[r3] = r4
            java.lang.String r3 = "finderShareVideo: appid = %s, videoPath = %s, title = %s, url = %s, extData = %s, jumpInfoString = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r7, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.setData(r0)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r1)
            r2.putExtra(r15, r9)
            r6 = r31
            r2.putExtra(r6, r8)
            r9 = r33
            r1 = 1
            r2.putExtra(r9, r1)
            r13 = r36
            r14 = r32
            r2.putExtra(r14, r13)
            r0 = 33
            r3 = r28
            r2.putExtra(r3, r0)
            java.lang.String r0 = "key_finder_video_path"
            r2.putExtra(r0, r11)
            java.lang.String r0 = "key_finder_share_video_jump_info_string"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "key_finder_share_video_jump_info_extra_data"
            r2.putExtra(r0, r10)
            com.tencent.p014mm.plugin.base.stub.C85083h.m104929r(r2, r7)
            goto L_0x0397
        L_0x0392:
            r0 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0397:
            return r26
        L_0x0398:
            r0 = 13
            com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r0)
            android.content.Context r1 = r35.getContext()
            r4 = 0
            r0 = 0
            r6 = 0
            r7 = 1
            r2 = r39
            r3 = r42
            r5 = r0
            android.database.MatrixCursor r0 = com.tencent.p014mm.plugin.base.stub.C85083h.m104924m(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L_0x03af:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r1 = com.tencent.p014mm.plugin.base.stub.C85083h.f247920a
            if (r5 == 0) goto L_0x03f8
            int r1 = r5.length
            if (r1 != 0) goto L_0x03b7
            goto L_0x03f8
        L_0x03b7:
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String r2 = "feature"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            int r2 = r5.length
            r1.<init>(r0, r2)
            int r0 = r5.length
            r2 = 0
        L_0x03c5:
            if (r2 >= r0) goto L_0x0400
            r3 = r5[r2]
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x03dc
            r4 = 2
            java.lang.String[] r6 = new java.lang.String[r4]
            r7 = 0
            r6[r7] = r3
            r8 = 1
            r6[r8] = r25
            r1.addRow(r6)
            goto L_0x03f5
        L_0x03dc:
            r4 = 2
            r7 = 0
            r8 = 1
            java.lang.String[] r6 = new java.lang.String[r4]
            r6[r7] = r3
            java.lang.String[] r4 = com.tencent.p014mm.plugin.base.stub.C85083h.f247929j
            boolean r3 = u24.C90595a.m113498b(r4, r3)
            if (r3 == 0) goto L_0x03ee
            r3 = r21
            goto L_0x03f0
        L_0x03ee:
            r3 = r25
        L_0x03f0:
            r6[r8] = r3
            r1.addRow(r6)
        L_0x03f5:
            int r2 = r2 + 1
            goto L_0x03c5
        L_0x03f8:
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            r2 = 0
            java.lang.String[] r0 = new java.lang.String[r2]
            r1.<init>(r0, r2)
        L_0x0400:
            return r1
        L_0x0401:
            r2 = 0
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String r1 = "waid"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r3 = 1
            r0.<init>(r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            tc2.g r3 = tc2.C118418g.INSTANCE
            java.lang.String r3 = r3.getLkid()
            r1[r2] = r3
            r0.addRow(r1)
            return r0
        L_0x041d:
            r2 = 0
            r3 = 1
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.<init>(r0, r3)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r24
            r1.addRow(r0)
            return r1
        L_0x0430:
            r9 = r4
            r3 = r6
            r14 = r10
            r6 = r2
            r2 = 0
            android.content.Context r0 = r35.getContext()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r4 = com.tencent.p014mm.plugin.base.stub.C85083h.f247920a
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r0 != 0) goto L_0x0442
            r7 = 1
            goto L_0x0443
        L_0x0442:
            r7 = 0
        L_0x0443:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r4[r2] = r7
            java.lang.String r7 = java.util.Arrays.toString(r39)
            r10 = 1
            r4[r10] = r7
            java.lang.String r7 = java.util.Arrays.toString(r42)
            r11 = 2
            r4[r11] = r7
            java.lang.String r7 = "doLaunchWxaRedirectingPage, context==null[%b], args[%s], packages[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r4)
            com.tencent.p014mm.plugin.base.stub.C85083h.m104928q(r10)
            if (r0 == 0) goto L_0x0520
            if (r8 == 0) goto L_0x0520
            r4 = r8[r2]
            int r4 = r4.length()
            if (r4 > 0) goto L_0x046d
            goto L_0x0520
        L_0x046d:
            com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req r4 = new com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req
            r4.<init>()
            r7 = r5[r2]     // Catch:{ Exception -> 0x0505 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0505 }
            if (r2 == 0) goto L_0x0480
            r2 = 2
            com.tencent.p014mm.plugin.base.stub.C85083h.m104928q(r2)     // Catch:{ Exception -> 0x0505 }
            goto L_0x0524
        L_0x0480:
            int r2 = r5.length     // Catch:{ Exception -> 0x0505 }
            int r10 = r5.length     // Catch:{ Exception -> 0x0505 }
            if (r2 <= r10) goto L_0x0485
            int r2 = r5.length     // Catch:{ Exception -> 0x0505 }
        L_0x0485:
            r10 = 1
            int r2 = r2 - r10
            java.lang.Class r10 = r39.getClass()     // Catch:{ Exception -> 0x0505 }
            java.lang.Class r10 = r10.getComponentType()     // Catch:{ Exception -> 0x0505 }
            if (r2 > 0) goto L_0x049a
            r11 = 0
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r10, r11)     // Catch:{ Exception -> 0x0505 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x0505 }
            r13 = 0
            goto L_0x04a6
        L_0x049a:
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r2)     // Catch:{ Exception -> 0x0505 }
            java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch:{ Exception -> 0x0505 }
            r11 = 1
            r13 = 0
            java.lang.System.arraycopy(r5, r11, r10, r13, r2)     // Catch:{ Exception -> 0x0505 }
            r2 = r10
        L_0x04a6:
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x0505 }
            r4.fromArray(r2)     // Catch:{ Exception -> 0x0505 }
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0, r1)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r13] = r7
            java.lang.String r7 = r4.invokeTicket
            r10 = 1
            r5[r10] = r7
            java.lang.String r7 = "weixin://dl/wmpf/sdk?appid=%s&ticket=%s"
            java.lang.String r1 = java.lang.String.format(r1, r7, r5)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r2.setData(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r1)
            r2.putExtra(r9, r10)
            r1 = r8[r13]
            r2.putExtra(r6, r1)
            r1 = r8[r13]
            android.content.pm.Signature[] r1 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r0, r1)
            if (r1 == 0) goto L_0x04ef
            int r5 = r1.length
            if (r5 < r10) goto L_0x04ef
            r1 = r1[r13]
            byte[] r1 = r1.toByteArray()
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            r2.putExtra(r14, r1)
        L_0x04ef:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r4.toBundle(r1)
            java.lang.String r4 = "key_launch_wxa_redirecting_page_req"
            r2.putExtra(r4, r1)
            r1 = 30
            r2.putExtra(r3, r1)
            com.tencent.p014mm.plugin.base.stub.C85083h.m104929r(r2, r0)
            goto L_0x0524
        L_0x0505:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = java.util.Arrays.toString(r39)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = java.util.Arrays.toString(r42)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "doLaunchWxaFRedirectingPage args[%s] packages[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r2)
            com.tencent.p014mm.plugin.base.stub.C85083h.m104928q(r1)
            goto L_0x0524
        L_0x0520:
            r1 = 2
            com.tencent.p014mm.plugin.base.stub.C85083h.m104928q(r1)
        L_0x0524:
            return r26
        L_0x0525:
            r0 = 10
            com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r0)
            if (r5 == 0) goto L_0x053e
            int r0 = r5.length
            r1 = 6
            if (r0 < r1) goto L_0x053e
            r1 = 5
            r0 = r5[r1]
            r1 = 0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x053f
            r2 = 1
            r19 = 1
            goto L_0x0542
        L_0x053e:
            r1 = 0
        L_0x053f:
            r2 = 1
            r19 = 0
        L_0x0542:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r19)
            r0[r1] = r2
            java.lang.String r1 = "needFetchPkg = %b"
            r2 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            android.content.Context r1 = r35.getContext()
            r4 = 1
            r6 = 0
            r7 = 0
            r2 = r39
            r3 = r42
            r5 = r19
            android.database.MatrixCursor r0 = com.tencent.p014mm.plugin.base.stub.C85083h.m104924m(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0563:
            android.content.Context r1 = r35.getContext()
            r4 = 0
            r0 = 0
            r6 = 1
            r7 = 0
            r2 = r39
            r3 = r42
            r5 = r0
            com.tencent.p014mm.plugin.base.stub.C85083h.m104924m(r1, r2, r3, r4, r5, r6, r7)
            return r26
        L_0x0574:
            r0 = r3
            r9 = r4
            r14 = r10
            r3 = r28
            r34 = r6
            r6 = r2
            r2 = r34
            android.content.Context r4 = r35.getContext()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r7 = com.tencent.p014mm.plugin.base.stub.C85083h.f247920a
            if (r4 != 0) goto L_0x058b
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r13)
            goto L_0x0711
        L_0x058b:
            if (r8 == 0) goto L_0x05a4
            int r7 = r8.length
            if (r7 <= 0) goto L_0x05a4
            r7 = 0
            r8 = r8[r7]
            android.content.pm.Signature[] r10 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r4, r8)
            r10 = r10[r7]
            byte[] r10 = r10.toByteArray()
            java.lang.String r10 = p823sg.C90193h.m112878f(r10)
            r28 = r3
            goto L_0x05aa
        L_0x05a4:
            r7 = 0
            r28 = r3
            r8 = r26
            r10 = r8
        L_0x05aa:
            r13 = 2
            java.lang.Object[] r3 = new java.lang.Object[r13]
            r3[r7] = r8
            r13 = 1
            r3[r13] = r10
            java.lang.String r13 = "openBusinessView packageName = %s, sig = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r3)
            if (r5 == 0) goto L_0x070e
            int r3 = r5.length
            r13 = 4
            if (r3 >= r13) goto L_0x05c0
            goto L_0x070e
        L_0x05c0:
            r3 = r5[r7]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x05cd
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)
            goto L_0x0711
        L_0x05cd:
            r7 = 1
            r11 = r5[r7]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 == 0) goto L_0x05dd
            java.lang.String r0 = "businessType isEmpty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0711
        L_0x05dd:
            r7 = 2
            r0 = r5[r7]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r13 = 3
            r0 = r5[r13]
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            int r0 = r5.length
            r17 = r2
            r2 = 4
            if (r0 <= r2) goto L_0x05f5
            r0 = r5[r2]
            com.tencent.p014mm.pluginsdk.p133ui.tools.C44623b1.f121003a = r0
        L_0x05f5:
            int r0 = r5.length
            r2 = 5
            if (r0 <= r2) goto L_0x060f
            r0 = r5[r2]
            boolean r2 = f40.C86709a0.m107522a()
            if (r2 == 0) goto L_0x060d
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            r5 = 1
            r2.mo73990GW(r3, r5)
        L_0x060d:
            r2 = r0
            goto L_0x0611
        L_0x060f:
            r2 = r28
        L_0x0611:
            java.lang.String r0 = "native"
            boolean r5 = r11.startsWith(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 != 0) goto L_0x0657
            java.lang.String r0 = "{"
            boolean r0 = r13.startsWith(r0)
            if (r0 == 0) goto L_0x0657
            c30.g r0 = new c30.g     // Catch:{ Exception -> 0x063f }
            r0.<init>((java.lang.String) r13)     // Catch:{ Exception -> 0x063f }
            r16 = r2
            java.lang.String r2 = "extData"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ Exception -> 0x063d }
            java.lang.String r2 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ Exception -> 0x063d }
            r36 = r10
            goto L_0x065c
        L_0x063d:
            r0 = move-exception
            goto L_0x0642
        L_0x063f:
            r0 = move-exception
            r16 = r2
        L_0x0642:
            r36 = r10
            r2 = 1
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r10[r2] = r0
            java.lang.String r0 = "openBusinessView ex"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r10)
        L_0x0654:
            r0 = r28
            goto L_0x065c
        L_0x0657:
            r16 = r2
            r36 = r10
            goto L_0x0654
        L_0x065c:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r5 == 0) goto L_0x0665
            java.lang.String r10 = "openNativeView"
            goto L_0x0667
        L_0x0665:
            java.lang.String r10 = "jumpFakeWxa"
        L_0x0667:
            r18 = 0
            r2[r18] = r10
            r10 = 1
            r2[r10] = r3
            r19 = 2
            r2[r19] = r11
            r10 = 3
            r2[r10] = r0
            java.lang.String r0 = "weixin://dl/%s/?appid=%s&businessType=%s&extdata=%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r18] = r0
            r10 = 1
            r2[r10] = r7
            r2[r19] = r13
            java.lang.String r10 = "openBusinessView url format = %s,query=%s,extInfo=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r10, r2)
            java.lang.String r2 = "nativeOpenAdCanvas"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x069b
            java.lang.String r2 = mp2.C34628a.m40409b(r3, r13)
            r10 = 1
            mp2.C34628a.m40411d(r2, r10)
        L_0x069b:
            if (r5 != 0) goto L_0x06b8
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r2 != 0) goto L_0x06b8
            c30.g r2 = new c30.g     // Catch:{ Exception -> 0x06b8 }
            r2.<init>((java.lang.String) r13)     // Catch:{ Exception -> 0x06b8 }
            java.lang.String r5 = "miniProgramType"
            r10 = 0
            int r2 = r2.optInt(r5, r10)     // Catch:{ Exception -> 0x06b8 }
            if (r2 < 0) goto L_0x06b8
            r5 = 2
            if (r2 <= r5) goto L_0x06b5
            goto L_0x06b8
        L_0x06b5:
            r20 = r2
            goto L_0x06ba
        L_0x06b8:
            r20 = 0
        L_0x06ba:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.setData(r0)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r1)
            r2.putExtra(r6, r8)
            r2.putExtra(r15, r3)
            java.lang.String r0 = "key_business_type"
            r2.putExtra(r0, r11)
            r1 = 1
            r2.putExtra(r9, r1)
            r10 = r36
            r2.putExtra(r14, r10)
            r0 = 26
            r3 = r17
            r2.putExtra(r3, r0)
            com.tencent.p014mm.plugin.base.stub.C85083h.m104929r(r2, r4)
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            java.lang.String r2 = "key_data_center_session_id"
            eb0.v0$c r0 = r0.mo120947c(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.String r2 = "key_launch_miniprogram_type"
            r0.mo120962i(r2, r1)
            java.lang.String r1 = "key_launch_miniprogram_query_info"
            r0.mo120962i(r1, r7)
            java.lang.String r1 = "key_open_business_view_ext_info"
            r0.mo120962i(r1, r13)
            java.lang.String r1 = "key_launch_mini_program_open_id"
            r2 = r16
            r0.mo120962i(r1, r2)
            goto L_0x0711
        L_0x070e:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0711:
            return r26
        L_0x0712:
            r0 = r3
            r9 = r4
            r3 = r6
            r6 = r2
            r2 = r10
            android.content.Context r4 = r35.getContext()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r7 = com.tencent.p014mm.plugin.base.stub.C85083h.f247920a
            if (r4 != 0) goto L_0x0724
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r13)
            goto L_0x07f9
        L_0x0724:
            if (r8 == 0) goto L_0x073d
            int r7 = r8.length
            if (r7 <= 0) goto L_0x073d
            r7 = 0
            r8 = r8[r7]
            android.content.pm.Signature[] r10 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r4, r8)
            r10 = r10[r7]
            byte[] r10 = r10.toByteArray()
            java.lang.String r10 = p823sg.C90193h.m112878f(r10)
            r30 = r0
            goto L_0x0743
        L_0x073d:
            r7 = 0
            r30 = r0
            r8 = r26
            r10 = r8
        L_0x0743:
            r13 = 2
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r7] = r8
            r13 = 1
            r0[r13] = r10
            java.lang.String r13 = "openBusinessWebview packageName = %s, sig = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r0)
            if (r5 == 0) goto L_0x07f4
            int r0 = r5.length
            r13 = 3
            if (r0 >= r13) goto L_0x0759
            goto L_0x07f4
        L_0x0759:
            r13 = r5[r7]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 == 0) goto L_0x0766
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)
            goto L_0x07f9
        L_0x0766:
            r11 = 1
            r0 = r5[r11]
            int r16 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r7)
            if (r16 > 0) goto L_0x077e
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r7] = r1
            java.lang.String r1 = "businessType(%d) invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
            goto L_0x07f9
        L_0x077e:
            r17 = 2
            r0 = r5[r17]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r5 = 3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r7] = r13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r7 = 1
            r11[r7] = r5
            r11[r17] = r0
            java.lang.String r5 = "openBusinessWebview, appid = %s, businessType = %d, queryInfo = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r11)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException -> 0x07a5 }
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r14)     // Catch:{ UnsupportedEncodingException -> 0x07a5 }
            r11 = r0
            r5 = 0
            goto L_0x07ae
        L_0x07a5:
            r0 = move-exception
            r5 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r11 = r28
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r11, r7)
        L_0x07ae:
            r7 = 3
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r5] = r13
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            r14 = 1
            r0[r14] = r7
            r7 = 2
            r0[r7] = r11
            java.lang.String r7 = "weixin://dl/openbusinesswebview/link?appid=%s&type=%d&query=%s"
            java.lang.String r0 = java.lang.String.format(r7, r0)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            r7[r5] = r0
            java.lang.String r5 = "openBusinessWebview url format = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r7)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r4, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r5.setData(r0)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r5.addFlags(r1)
            r5.putExtra(r6, r8)
            r5.putExtra(r15, r13)
            r5.putExtra(r9, r14)
            r5.putExtra(r2, r10)
            r0 = 25
            r5.putExtra(r3, r0)
            com.tencent.p014mm.plugin.base.stub.C85083h.m104929r(r5, r4)
            goto L_0x07f9
        L_0x07f4:
            r0 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x07f9:
            return r26
        L_0x07fa:
            r2 = r23
            com.tencent.mm.autogen.events.SDKOpenOfflinePayEvent r0 = new com.tencent.mm.autogen.events.SDKOpenOfflinePayEvent
            r0.<init>()
            com.tencent.mm.autogen.events.SDKOpenOfflinePayEvent$a r1 = r0.f236277d
            r1.f236279b = r5
            r1.f236278a = r8
            android.content.Context r3 = r35.getContext()
            r1.f236280c = r3
            boolean r0 = r0.publish()
            if (r0 != 0) goto L_0x0819
            java.lang.String r0 = "open offline pay fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0819:
            return r26
        L_0x081a:
            r1 = 1
            com.tencent.p014mm.plugin.base.stub.C85083h.m104926o(r1)
            android.content.Context r1 = r35.getContext()
            r4 = 0
            r0 = 0
            r6 = 0
            r7 = 0
            r2 = r39
            r3 = r42
            r5 = r0
            com.tencent.p014mm.plugin.base.stub.C85083h.m104924m(r1, r2, r3, r4, r5, r6, r7)
            return r26
        L_0x082f:
            r2 = r23
            com.tencent.mm.autogen.events.HandleScanResultEvent r0 = new com.tencent.mm.autogen.events.HandleScanResultEvent
            r0.<init>()
            com.tencent.mm.autogen.events.HandleScanResultEvent$a r1 = r0.f236219d
            r1.f236221b = r5
            r1.f236220a = r8
            android.content.Context r3 = r35.getContext()
            r1.f236222c = r3
            boolean r1 = r0.publish()
            if (r1 != 0) goto L_0x085a
            java.lang.String r1 = "handle scan result failed try again"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            com.tencent.mm.plugin.base.stub.WXCommProvider$c r1 = new com.tencent.mm.plugin.base.stub.WXCommProvider$c
            r10 = r35
            r1.<init>(r10, r0)
            r2 = 200(0xc8, double:9.9E-322)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r2)
            goto L_0x085c
        L_0x085a:
            r10 = r35
        L_0x085c:
            return r26
        L_0x085d:
            r10 = r35
            r2 = r23
            int r0 = r8.length
            if (r0 <= 0) goto L_0x08c3
            r6 = r36
            java.lang.String r13 = r10.mo118045f(r6, r5)
            di3.d r0 = di3.C86312j.m106911c(r27)
            ym.p r0 = (p763ym.C79139p) r0
            java.lang.String r0 = r0.on0(r13)
            if (r5 == 0) goto L_0x0884
            int r1 = r5.length
            r3 = 1
            if (r1 <= r3) goto L_0x0884
            r1 = r5[r3]
            r3 = 0
            int r20 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r3)
            r1 = r20
            goto L_0x0886
        L_0x0884:
            r3 = 0
            r1 = 0
        L_0x0886:
            com.tencent.mm.pluginsdk.model.app.u1$a r12 = com.tencent.p014mm.pluginsdk.model.app.C72693u1.C72694a.GET_TOKEN
            r14 = 10000(0x2710, float:1.4013E-41)
            r17 = r8[r3]
            r11 = r1
            r15 = r0
            r16 = r17
            dw0.C75461a.m90500a(r11, r12, r13, r14, r15, r16, r17)
            di3.d r3 = di3.C86312j.m106911c(r27)
            ym.p r3 = (p763ym.C79139p) r3
            android.content.Context r4 = r35.getContext()
            r5 = 0
            r6 = r8[r5]
            r3.mo108874zK(r4, r0, r6, r1)
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = r8[r5]
            r3[r5] = r4
            java.lang.String r4 = "gen token for opensdk ,package = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            android.database.MatrixCursor r2 = new android.database.MatrixCursor
            java.lang.String r3 = "token"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r2.<init>(r3)
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r5] = r0
            r2.addRow(r1)
            return r2
        L_0x08c3:
            return r26
        L_0x08c4:
            r10 = r35
            r2 = r23
            com.tencent.mm.autogen.events.ChooseCardFromWXEvent r0 = new com.tencent.mm.autogen.events.ChooseCardFromWXEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ChooseCardFromWXEvent$a r1 = r0.f236163d
            r1.f236165b = r5
            r1.f236164a = r8
            android.content.Context r3 = r35.getContext()
            r1.f236166c = r3
            boolean r0 = r0.publish()
            if (r0 != 0) goto L_0x08e4
            java.lang.String r0 = "choose card from wx fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x08e4:
            return r26
        L_0x08e5:
            r10 = r35
            r2 = r23
            com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent r0 = new com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent
            r0.<init>()
            com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent$a r1 = r0.f236173d
            r3 = 2
            r1.f236174a = r3
            r1.f236176c = r5
            r1.f236175b = r8
            android.content.Context r3 = r35.getContext()
            r1.f236177d = r3
            boolean r0 = r0.publish()
            if (r0 != 0) goto L_0x0908
            r0 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0908:
            return r26
        L_0x0909:
            r10 = r35
            r2 = r23
            r0 = r29
            com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent r1 = new com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent
            r1.<init>()
            com.tencent.mm.autogen.events.CreateOrJoinChatroomEvent$a r3 = r1.f236173d
            r4 = 1
            r3.f236174a = r4
            r3.f236176c = r5
            r3.f236175b = r8
            android.content.Context r4 = r35.getContext()
            r3.f236177d = r4
            boolean r1 = r1.publish()
            if (r1 != 0) goto L_0x092c
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x092c:
            return r26
        L_0x092d:
            r10 = r35
            r2 = r23
            com.tencent.mm.autogen.events.SDKOpenBusiLuckyMoneyEvent r0 = new com.tencent.mm.autogen.events.SDKOpenBusiLuckyMoneyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.SDKOpenBusiLuckyMoneyEvent$a r1 = r0.f236273d
            r1.f236275b = r5
            r1.f236274a = r8
            android.content.Context r3 = r35.getContext()
            r1.f236276c = r3
            boolean r0 = r0.publish()
            if (r0 != 0) goto L_0x094e
            java.lang.String r0 = "open busi luckymoney fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x094e:
            return r26
        L_0x094f:
            r10 = r35
            r2 = r23
            r0 = r29
            com.tencent.mm.autogen.events.SDKOpenWebviewEvent r1 = new com.tencent.mm.autogen.events.SDKOpenWebviewEvent
            r1.<init>()
            com.tencent.mm.autogen.events.SDKOpenWebviewEvent$a r3 = r1.f236281d
            r3.f236283b = r5
            r3.f236282a = r8
            android.content.Context r4 = r35.getContext()
            r3.f236284c = r4
            com.tencent.mm.autogen.events.SDKOpenWebviewEvent$a r3 = r1.f236281d
            r4 = 45
            if (r7 != r4) goto L_0x096e
            r9 = 1
            goto L_0x096f
        L_0x096e:
            r9 = 0
        L_0x096f:
            r3.f236285d = r9
            r3 = 30
            if (r7 != r3) goto L_0x097f
            if (r5 == 0) goto L_0x097f
            int r3 = r5.length
            r4 = 2
            if (r3 <= r4) goto L_0x097f
            r3 = r5[r4]
            wc3.C90945m.f260971e = r3
        L_0x097f:
            boolean r1 = r1.publish()
            if (r1 != 0) goto L_0x0988
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0988:
            return r26
        L_0x0989:
            r10 = r35
            r2 = r23
            com.tencent.mm.autogen.events.ExtCallBizEvent r0 = new com.tencent.mm.autogen.events.ExtCallBizEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ExtCallBizEvent$a r1 = r0.f236183d
            r1.f236184a = r7
            r1.f236188e = r5
            android.content.Context r3 = r35.getContext()
            r1.f236186c = r3
            com.tencent.mm.autogen.events.ExtCallBizEvent$a r1 = r0.f236183d
            r1.f236187d = r8
            boolean r0 = r0.publish()
            if (r0 != 0) goto L_0x09ad
            r0 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x09ad:
            return r26
        L_0x09ae:
            r10 = r35
            r0 = r22
            r2 = r23
            if (r5 == 0) goto L_0x09df
            int r1 = r5.length
            r3 = 2
            if (r1 >= r3) goto L_0x09bb
            goto L_0x09df
        L_0x09bb:
            com.tencent.mm.autogen.events.ExtCallBizEvent r1 = new com.tencent.mm.autogen.events.ExtCallBizEvent
            r1.<init>()
            com.tencent.mm.autogen.events.ExtCallBizEvent$a r3 = r1.f236183d
            r4 = 27
            r3.f236184a = r4
            r4 = 1
            r3.f236185b = r4
            r3.f236188e = r5
            android.content.Context r4 = r35.getContext()
            r3.f236186c = r4
            com.tencent.mm.autogen.events.ExtCallBizEvent$a r3 = r1.f236183d
            r3.f236187d = r8
            boolean r1 = r1.publish()
            if (r1 != 0) goto L_0x09de
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x09de:
            return r26
        L_0x09df:
            java.lang.String r0 = "wrong args"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return r26
        L_0x09e6:
            r10 = r35
            r2 = r23
            com.tencent.mm.autogen.events.AddCardToWXEvent r0 = new com.tencent.mm.autogen.events.AddCardToWXEvent
            r0.<init>()
            com.tencent.mm.autogen.events.AddCardToWXEvent$a r1 = r0.f236123d
            r1.f236125b = r5
            r1.f236124a = r8
            android.content.Context r3 = r35.getContext()
            r1.f236126c = r3
            boolean r0 = r0.publish()
            if (r0 != 0) goto L_0x0a06
            java.lang.String r0 = "add card to wx fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0a06:
            return r26
        L_0x0a07:
            r10 = r35
            r6 = r36
            r2 = r23
            r1 = 1
            boolean r0 = r10.mo118039a(r1)
            if (r0 != 0) goto L_0x0a17
            android.database.MatrixCursor r0 = r10.f247889d
            return r0
        L_0x0a17:
            com.tencent.mm.autogen.events.WatchAppIdRegEvent r0 = new com.tencent.mm.autogen.events.WatchAppIdRegEvent
            r0.<init>()
            com.tencent.mm.autogen.events.WatchAppIdRegEvent$a r1 = r0.f236300d
            r1.f236302a = r7
            r1.f236305d = r6
            android.content.Context r3 = r35.getContext()
            r1.f236303b = r3
            r11 = 0
        L_0x0a29:
            int r1 = r8.length
            if (r11 >= r1) goto L_0x0a38
            r1 = r8[r11]
            if (r1 == 0) goto L_0x0a35
            com.tencent.mm.autogen.events.WatchAppIdRegEvent$a r3 = r0.f236300d
            r3.f236304c = r1
            goto L_0x0a38
        L_0x0a35:
            int r11 = r11 + 1
            goto L_0x0a29
        L_0x0a38:
            boolean r1 = r0.publish()
            if (r1 != 0) goto L_0x0a44
            java.lang.String r0 = "WatchAppIdRegEvent fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return r26
        L_0x0a44:
            com.tencent.mm.autogen.events.WatchAppIdRegEvent$b r0 = r0.f236301e
            r0.getClass()
            return r26
        L_0x0a4a:
            r10 = r35
            r6 = r36
            r2 = r23
            r11 = r28
            goto L_0x0abc
        L_0x0a53:
            r10 = r35
            r0 = r22
            r2 = r23
            com.tencent.mm.autogen.events.ExtCallBizEvent r1 = new com.tencent.mm.autogen.events.ExtCallBizEvent
            r1.<init>()
            com.tencent.mm.autogen.events.ExtCallBizEvent$a r3 = r1.f236183d
            r4 = 21
            r3.f236184a = r4
            r4 = 1
            r3.f236185b = r4
            r3.f236188e = r5
            android.content.Context r4 = r35.getContext()
            r3.f236186c = r4
            com.tencent.mm.autogen.events.ExtCallBizEvent$a r3 = r1.f236183d
            r3.f236187d = r8
            boolean r1 = r1.publish()
            if (r1 != 0) goto L_0x0a7c
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0a7c:
            return r26
        L_0x0a7d:
            r10 = r35
            r6 = r36
            r2 = r23
            r1 = 1
            boolean r0 = r10.mo118039a(r1)
            if (r0 != 0) goto L_0x0a8b
            return r26
        L_0x0a8b:
            com.tencent.mm.autogen.events.ExtCallEvent r0 = new com.tencent.mm.autogen.events.ExtCallEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ExtCallEvent$a r1 = r0.f236189d
            r1.f236191a = r7
            r1.f236194d = r6
            r1.f236195e = r5
            android.content.Context r3 = r35.getContext()
            r1.f236192b = r3
            com.tencent.mm.autogen.events.ExtCallEvent$a r1 = r0.f236189d
            r1.f236193c = r8
            boolean r1 = r0.publish()
            if (r1 != 0) goto L_0x0aae
            java.lang.String r0 = "ExtCallEvent fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return r26
        L_0x0aae:
            com.tencent.mm.autogen.events.ExtCallEvent$b r0 = r0.f236190e
            android.database.Cursor r0 = r0.f236196a
            return r0
        L_0x0ab3:
            return r1
        L_0x0ab4:
            r24 = r2
            r21 = r3
            r2 = r4
            r11 = r9
            r25 = r12
        L_0x0abc:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "appid"
            java.lang.String r0 = r6.getQueryParameter(r0)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r0 = "checkIsLogin()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x0b14 }
            boolean r0 = f247888o     // Catch:{ Exception -> 0x0b14 }
            if (r0 != 0) goto L_0x0ae2
            cd3.b r0 = new cd3.b     // Catch:{ Exception -> 0x0b14 }
            r0.<init>()     // Catch:{ Exception -> 0x0b14 }
            r12 = 4000(0xfa0, double:1.9763E-320)
            com.tencent.mm.plugin.base.stub.n r9 = new com.tencent.mm.plugin.base.stub.n     // Catch:{ Exception -> 0x0b14 }
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0b14 }
            r0.mo62560b(r12, r9)     // Catch:{ Exception -> 0x0b14 }
        L_0x0ae2:
            boolean r0 = eb0.C97625j3.m125811a()     // Catch:{ Exception -> 0x0b14 }
            if (r0 == 0) goto L_0x0af8
            boolean r0 = eb0.C97625j3.m125820j()     // Catch:{ Exception -> 0x0b14 }
            if (r0 == 0) goto L_0x0af8
            boolean r0 = f40.C86718e.m107551r()     // Catch:{ Exception -> 0x0b14 }
            if (r0 != 0) goto L_0x0af8
            r9 = 1
            f247888o = r9     // Catch:{ Exception -> 0x0b14 }
            goto L_0x0afb
        L_0x0af8:
            r9 = 0
            f247888o = r9     // Catch:{ Exception -> 0x0b14 }
        L_0x0afb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b14 }
            r0.<init>()     // Catch:{ Exception -> 0x0b14 }
            java.lang.String r9 = "hasLogin = "
            r0.append(r9)     // Catch:{ Exception -> 0x0b14 }
            boolean r9 = f247888o     // Catch:{ Exception -> 0x0b14 }
            r0.append(r9)     // Catch:{ Exception -> 0x0b14 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0b14 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x0b14 }
            boolean r0 = f247888o     // Catch:{ Exception -> 0x0b14 }
            goto L_0x0b23
        L_0x0b14:
            r0 = move-exception
            java.lang.String r9 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r9)
            r9 = 0
            java.lang.Object[] r12 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r11, r12)
            r0 = 0
        L_0x0b23:
            if (r0 != 0) goto L_0x0bbb
            java.lang.String r0 = "autoLogin"
            java.lang.String r0 = r6.getQueryParameter(r0)
            r9 = r25
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r9)
            r9 = r21
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0b6c
            java.lang.String r0 = "hy: not login. try to login return code = 9"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.pluginsdk.model.app.b2 r0 = new com.tencent.mm.pluginsdk.model.app.b2
            r1 = r0
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10.mo118044e(r0)
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r1 = qe3.C89622b.f257827a
            r0.<init>(r1)
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r1[r6] = r2
            r0.addRow(r1)
            return r0
        L_0x0b6c:
            r5 = 1
            r6 = 0
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r6] = r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r41)
            r0[r5] = r9
            r9 = 2
            r0[r9] = r17
            java.lang.String r11 = "not login, appID = %s, apiID = %s return code =%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 10505(0x2909, float:1.472E-41)
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r8 = r8[r6]
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r11[r6] = r8
            r11[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r41)
            r11[r9] = r1
            r1 = 3
            r11[r1] = r24
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r3 = 4
            r11[r3] = r1
            r0.mo160131h(r2, r11)
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r1 = qe3.C89622b.f257827a
            r0.<init>(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r17
            r0.addRow(r1)
            return r0
        L_0x0bbb:
            com.tencent.mm.autogen.events.ExtOpenApiCallEvent r0 = new com.tencent.mm.autogen.events.ExtOpenApiCallEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ExtOpenApiCallEvent$a r9 = r0.f236197d
            r9.f236199a = r7
            r9.f236202d = r6
            r9.f236203e = r5
            android.content.Context r5 = r35.getContext()
            r9.f236200b = r5
            com.tencent.mm.autogen.events.ExtOpenApiCallEvent$a r5 = r0.f236197d
            r5.f236201c = r8
            r5.f236204f = r1
            boolean r1 = r0.publish()
            if (r1 != 0) goto L_0x0bf6
            java.lang.String r0 = "ExtCallEvent fail return code = 8"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r1 = qe3.C89622b.f257827a
            r0.<init>(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r1[r5] = r2
            r0.addRow(r1)
            return r0
        L_0x0bf6:
            r1 = 1
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r1[r5] = r3
            java.lang.String r3 = "[extApiCost] total cost = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            com.tencent.mm.autogen.events.ExtOpenApiCallEvent$b r0 = r0.f236198e
            android.database.Cursor r0 = r0.f236205a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.WXCommProvider.mo118040b(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, int, java.lang.String[]):android.database.Cursor");
    }

    /* renamed from: c */
    public final String[] mo118041c(Uri uri, String[] strArr) {
        try {
            C85083h.m104932u();
            if (C85083h.f247928i) {
                String callingPackage = getCallingPackage();
                Log.m105925i("MicroMsg.WXCommProvider", "getCallingPackage %s", callingPackage);
                if (!Util.isNullOrNil(callingPackage)) {
                    return new String[]{callingPackage};
                }
                Log.m105924i("MicroMsg.WXBizLogic", "alvinluo reportGetCallingPackageNull");
                C115669n.INSTANCE.mo175913w(1194, 50, 1);
            }
            int callingUid = Binder.getCallingUid();
            String[] packagesForUid = getContext().getPackageManager().getPackagesForUid(Binder.getCallingUid());
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(callingUid);
            objArr[1] = Integer.valueOf(packagesForUid == null ? 0 : packagesForUid.length);
            Log.m105925i("MicroMsg.WXCommProvider", "getCallingPackages, callingUid = %d, packages size = %d", objArr);
            if (packagesForUid != null && packagesForUid.length > 1) {
                Log.m105924i("MicroMsg.WXBizLogic", "alvinluo reportGetPackagesForUidMoreThanOne");
                C115669n.INSTANCE.mo175913w(1194, 51, 1);
            }
            if (packagesForUid == null) {
                Log.m105928w("MicroMsg.WXCommProvider", "getCallingPackages fail, packages is null");
                return new String[0];
            }
            int length = packagesForUid.length;
            for (int i = 0; i < length; i++) {
                Log.m105925i("MicroMsg.WXCommProvider", "getCallingPackages = %s", packagesForUid[i]);
            }
            return (packagesForUid.length <= 1 || strArr == null || strArr.length <= 0) ? packagesForUid : mo118042d(mo118045f(uri, strArr), packagesForUid);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WXCommProvider", "getCallingPackages, ex = %s", e.getMessage());
            return new String[0];
        }
    }

    /* renamed from: d */
    public final String[] mo118042d(String str, String[] strArr) {
        boolean z;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WXCommProvider", "getTargetPackageByAppId appId invalid");
            return strArr;
        }
        String str2 = null;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WXCommProvider", "getPackageNameByAppId appId invalid");
        } else {
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str);
            if (appInfo == null) {
                Log.m105920e("MicroMsg.WXCommProvider", "getPackageNameByAppId appInfo is null");
            } else {
                str2 = appInfo.field_packageName;
            }
        }
        if (!Util.isNullOrNil(str2)) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (str2.equals(strArr[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                Log.m105925i("MicroMsg.WXCommProvider", "getTargetPackageByAppId match: %s", str2);
                C115669n.INSTANCE.mo175913w(1194, 55, 1);
                return new String[]{str2};
            }
            Log.m105925i("MicroMsg.WXCommProvider", "getTargetPackageByAppId not match: %s", str2);
            C115669n.INSTANCE.mo175913w(1194, 54, 1);
        } else {
            Log.m105920e("MicroMsg.WXCommProvider", "getCallingPackages, getPackageNameByAppId return null");
            C115669n.INSTANCE.mo175913w(1194, 52, 1);
        }
        return strArr;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (uri == null) {
            Log.m105920e("MicroMsg.WXCommProvider", "delete fail, uri is null");
            return 0;
        }
        return ((Integer) new C85078e(2000, 0, uri, f247885i.match(uri), mo118041c(uri, strArr)).exec(this.f247891f)).intValue();
    }

    /* renamed from: e */
    public final void mo118044e(C85606b2 b2Var) {
        if (b2Var == null) {
            Log.m105920e("MicroMsg.WXCommProvider", "hy: try to start to login failed: null model");
            return;
        }
        ((C79139p) C86312j.m106911c(C79139p.class)).p20(b2Var);
        Intent intent = new Intent(getContext(), LoginUI.class);
        intent.addFlags(268435456);
        Context context = getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/base/stub/WXCommProvider", "startToLoginWithQueryAction", "(Lcom/tencent/mm/pluginsdk/model/app/WxProviderQueryStubModel;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/base/stub/WXCommProvider", "startToLoginWithQueryAction", "(Lcom/tencent/mm/pluginsdk/model/app/WxProviderQueryStubModel;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: f */
    public final String mo118045f(Uri uri, String[] strArr) {
        String queryParameter = uri.getQueryParameter("appid");
        if (Util.isNullOrNil(queryParameter)) {
            queryParameter = uri.getQueryParameter("appId");
        }
        if (Util.isNullOrNil(queryParameter) && strArr != null && strArr.length > 1) {
            queryParameter = strArr[0];
        }
        if (Util.isNullOrNil(queryParameter) || !queryParameter.startsWith("wx")) {
            return null;
        }
        return queryParameter;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Log.m105918d("MicroMsg.WXCommProvider", "onCreate");
        this.f247891f = new MMHandler();
        Log.m105924i("MicroMsg.WXCommProvider", "pid = " + Process.myPid() + ", tid : = " + Process.myTid());
        this.f247890e = getContext().getSharedPreferences(f247883g, 0);
        C118144a.m166672a(MMApplicationContext.getContext()).mo182943b(new C85074a(), new IntentFilter(ConstantsAPI.ACTION_REFRESH_WXAPP));
        return this.f247890e != null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Log.m105925i("MicroMsg.WXCommProvider", "uri:%s", uri);
        if (uri == null) {
            Log.m105920e("MicroMsg.WXCommProvider", "query fail, uri is null return null");
            return null;
        }
        int match = f247885i.match(uri);
        if (!C86709a0.m107528h().f251724a.f251792d) {
            new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C85075b(this), true).startTimer(50);
            try {
                synchronized (f247886j) {
                    Log.m105924i("MicroMsg.WXCommProvider", "Lock to wait for the first initialize of the Application.");
                    while (!f247887n) {
                        f247886j.wait();
                    }
                    f247887n = false;
                }
            } catch (InterruptedException e) {
                Log.m105920e("MicroMsg.WXCommProvider", "the lock may have some problem," + e.getMessage());
                Log.printErrStackTrace("MicroMsg.WXCommProvider", e, "", new Object[0]);
            }
        }
        String[] c = mo118041c(uri, strArr2);
        if (c != null && c.length > 0) {
            return mo118040b(uri, strArr, str, strArr2, str2, match, c);
        }
        Log.m105920e("MicroMsg.WXCommProvider", "CallingPackages is null return null");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
