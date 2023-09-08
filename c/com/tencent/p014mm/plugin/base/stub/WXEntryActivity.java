package com.tencent.p014mm.plugin.base.stub;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXNativeGamePageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWeWorkObject;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.plugin.gamesharecard.LiteAppBizDataInfo;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72691t1;
import com.tencent.p014mm.pluginsdk.model.app.C72693u1;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72918o;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eb0.C86493v0;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import g40.C87134f;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import md2.C47000b;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import oz1.C77050b;
import p763ym.C79138l;
import p763ym.C79139p;
import p823sg.C90193h;
import pe3.C89349b;
import te3.C48653a20;
import te3.C48796b20;
import te3.C52050y10;
import te3.C52198z10;

/* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity */
public class WXEntryActivity extends AutoLoginActivity implements C11385n {

    /* renamed from: w */
    public static final /* synthetic */ int f197446w = 0;

    /* renamed from: d */
    public String f197447d;

    /* renamed from: e */
    public String f197448e;

    /* renamed from: f */
    public String f197449f;

    /* renamed from: g */
    public C72693u1 f197450g;

    /* renamed from: h */
    public boolean f197451h = false;

    /* renamed from: i */
    public C72693u1.C72694a f197452i;

    /* renamed from: j */
    public final C72691t1 f197453j = new C72691t1();

    /* renamed from: n */
    public String f197454n;

    /* renamed from: o */
    public int f197455o;

    /* renamed from: p */
    public int f197456p;

    /* renamed from: q */
    public Uri f197457q;

    /* renamed from: r */
    public String f197458r;

    /* renamed from: s */
    public ProgressDialog f197459s;

    /* renamed from: t */
    public int f197460t = 0;

    /* renamed from: u */
    public WXMediaMessage f197461u;

    /* renamed from: v */
    public WeakReference<WXEntryActivity> f197462v = new WeakReference<>(this);

    /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$EntryReceiver */
    public static class EntryReceiver extends BroadcastReceiver {

        /* renamed from: f */
        public static MMHandler f197463f;

        /* renamed from: a */
        public Context f197464a;

        /* renamed from: b */
        public String f197465b;

        /* renamed from: c */
        public int f197466c;

        /* renamed from: d */
        public String f197467d;

        /* renamed from: e */
        public long f197468e;

        /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$EntryReceiver$a */
        public class C68738a implements C87134f {

            /* renamed from: d */
            public final /* synthetic */ Context f197469d;

            /* renamed from: e */
            public final /* synthetic */ Intent f197470e;

            public C68738a(Context context, Intent intent) {
                this.f197469d = context;
                this.f197470e = intent;
            }

            /* renamed from: e */
            public void mo1180e() {
                C86709a0.m107528h().mo121101p(this);
                EntryReceiver.m81020a(EntryReceiver.this, this.f197469d, this.f197470e);
            }

            /* renamed from: g */
            public void mo1181g(boolean z) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$EntryReceiver$b */
        public class C68739b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f197472d;

            /* renamed from: e */
            public final /* synthetic */ Intent f197473e;

            public C68739b(Context context, Intent intent) {
                this.f197472d = context;
                this.f197473e = intent;
            }

            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                EntryReceiver.m81020a(EntryReceiver.this, this.f197472d, this.f197473e);
                Log.m105925i("MicroMsg.WXEntryActivity", "cost:%s", (System.currentTimeMillis() - currentTimeMillis) + "");
            }
        }

        /* renamed from: a */
        public static void m81020a(EntryReceiver entryReceiver, Context context, Intent intent) {
            Class cls = C79138l.class;
            Class cls2 = C79139p.class;
            entryReceiver.f197464a = context;
            String stringExtra = IntentUtil.getStringExtra(intent, ConstantsAPI.CONTENT);
            entryReceiver.f197468e = IntentUtil.getLongExtra(intent, ConstantsAPI.APP_SUPORT_CONTENT_TYPE, 0);
            int intExtra = IntentUtil.getIntExtra(intent, ConstantsAPI.SDK_VERSION, 0);
            entryReceiver.f197466c = intExtra;
            int i = WXEntryActivity.f197446w;
            if (!(intExtra >= 553713665)) {
                Log.m105920e("MicroMsg.WXEntryActivity", "sdk version is not supported, sdkVersion = " + entryReceiver.f197466c);
                return;
            }
            String stringExtra2 = IntentUtil.getStringExtra(intent, ConstantsAPI.APP_PACKAGE);
            entryReceiver.f197467d = stringExtra2;
            if (stringExtra2 == null || stringExtra2.length() <= 0) {
                Log.m105920e("MicroMsg.WXEntryActivity", "unknown package, ignore");
            } else if (!WXEntryActivity.m81004L7(IntentUtil.getByteArrayExtra(intent, ConstantsAPI.CHECK_SUM), WXEntryActivity.m81005P7(stringExtra, entryReceiver.f197466c, entryReceiver.f197467d))) {
                Log.m105920e("MicroMsg.WXEntryActivity", "checksum fail");
            } else if (stringExtra == null) {
                Log.m105920e("MicroMsg.WXEntryActivity", "check appid failed, null content");
            } else {
                Uri parse = Uri.parse(stringExtra);
                String authority = parse.getAuthority();
                try {
                    entryReceiver.f197465b = parse.getQueryParameter("appid");
                    Log.m105924i("MicroMsg.WXEntryActivity", "onReceive, appId = " + entryReceiver.f197465b);
                    String str = entryReceiver.f197465b;
                    if (str == null || str.length() <= 0) {
                        Log.m105920e("MicroMsg.WXEntryActivity", "invalid appid, ignore");
                    } else if (!C97625j3.m125811a() || C86718e.m107551r()) {
                        Log.m105929w("MicroMsg.WXEntryActivity", "not login, just save the appid : %s", entryReceiver.f197465b);
                        ((C79139p) C86312j.m106911c(cls2)).ac0(entryReceiver.f197465b);
                    } else if (!C86709a0.m107523b().f251765p) {
                        Log.m105929w("MicroMsg.WXEntryActivity", "not login accInitializing, just save the appid : %s", entryReceiver.f197465b);
                        ((C79139p) C86312j.m106911c(cls2)).ac0(entryReceiver.f197465b);
                    } else if ("registerapp".equals(authority)) {
                        Log.m105924i("MicroMsg.WXEntryActivity", "handle app registeration: " + entryReceiver.f197467d + ", sdkver=" + entryReceiver.f197466c);
                        if (!C97625j3.m125811a()) {
                            Log.m105920e("MicroMsg.WXEntryActivity", "no available account");
                            return;
                        }
                        C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(entryReceiver.f197465b);
                        if (appInfo == null || !Util.isEqual(entryReceiver.f197467d, appInfo.field_packageName)) {
                            ((C79138l) C86312j.m106911c(cls)).mo74004WW(entryReceiver.f197465b, entryReceiver.f197467d, new C68760t(entryReceiver, appInfo));
                        } else {
                            entryReceiver.mo94571b(appInfo);
                        }
                    } else if ("unregisterapp".equals(authority)) {
                        Log.m105918d("MicroMsg.WXEntryActivity", "handle app unregisteration: " + entryReceiver.f197467d + ", sdkver=" + entryReceiver.f197466c);
                        if (!C97625j3.m125811a()) {
                            Log.m105920e("MicroMsg.WXEntryActivity", "no available account");
                            return;
                        }
                        C44561j GW = ((C79138l) C86312j.m106911c(cls)).mo73990GW(entryReceiver.f197465b, false);
                        if (!((C79139p) C86312j.m106911c(cls2)).mo108870oF(entryReceiver.f197464a, GW, entryReceiver.f197467d)) {
                            Log.m105920e("MicroMsg.WXEntryActivity", "unreg fail, check app fail");
                        } else if (GW != null && GW.field_status != 5) {
                            GW.field_status = 4;
                            C72709y1.yx0().update(GW, new String[0]);
                            C72918o.m85515c(entryReceiver.f197465b);
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WXEntryActivity", "init: %s", e.toString());
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
            if (r7 == false) goto L_0x0099;
         */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo94571b(com.tencent.p014mm.pluginsdk.model.app.C44561j r13) {
            /*
                r12 = this;
                java.lang.String r0 = "package not installed"
                java.lang.Class<ym.p> r1 = p763ym.C79139p.class
                di3.d r2 = di3.C86312j.m106911c(r1)
                ym.p r2 = (p763ym.C79139p) r2
                android.content.Context r3 = r12.f197464a
                java.lang.String r4 = r12.f197467d
                boolean r2 = r2.mo108870oF(r3, r13, r4)
                java.lang.String r3 = "MicroMsg.WXEntryActivity"
                if (r2 != 0) goto L_0x0027
                java.lang.String r13 = "reg fail, check app fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r13)
                com.tencent.mm.pluginsdk.model.app.o r13 = ld2.C46848g.Ax0()
                java.lang.String r0 = r12.f197465b
                r13.mo69369e(r0)
                return
            L_0x0027:
                if (r13 == 0) goto L_0x003e
                boolean r2 = r13.mo69359k()
                if (r2 == 0) goto L_0x003e
                sw1.m r2 = sw1.C48477m.C13789a.m13091a()
                if (r2 == 0) goto L_0x003e
                android.content.Context r4 = r12.f197464a
                java.lang.String r5 = r12.f197465b
                java.lang.String r6 = r12.f197467d
                r2.mo65659Ba(r4, r5, r6)
            L_0x003e:
                r2 = 0
                r4 = 0
                android.content.Context r5 = r12.f197464a     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                java.lang.String r6 = r12.f197467d     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                android.content.pm.ApplicationInfo r6 = r5.getApplicationInfo(r6, r4)     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                if (r6 != 0) goto L_0x0052
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                return
            L_0x0052:
                java.lang.CharSequence r7 = r6.loadLabel(r5)     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                r7.toString()     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                android.graphics.drawable.Drawable r5 = r6.loadIcon(r5)     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                boolean r6 = r5 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                if (r6 == 0) goto L_0x006f
                android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                android.graphics.Bitmap r0 = r5.getBitmap()     // Catch:{ IncompatibleClassChangeError -> 0x01cc, all -> 0x0069 }
                r2 = r0
                goto L_0x006f
            L_0x0069:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r5, r0, r6)
            L_0x006f:
                java.lang.String r0 = ""
                java.lang.String r5 = "MicroMsg.AppInfoStorage"
                r6 = 1
                if (r13 == 0) goto L_0x0099
                com.tencent.mm.pluginsdk.model.app.p r7 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
                java.lang.String r8 = r12.f197465b
                r7.getClass()
                if (r8 == 0) goto L_0x0091
                int r9 = r8.length()
                if (r9 != 0) goto L_0x0088
                goto L_0x0091
            L_0x0088:
                java.lang.String r7 = r7.mo69377t2(r8, r6)
                boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                goto L_0x0097
            L_0x0091:
                java.lang.String r7 = "hasIcon, appId is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r7)
                r7 = 0
            L_0x0097:
                if (r7 != 0) goto L_0x00f3
            L_0x0099:
                com.tencent.mm.pluginsdk.model.app.p r7 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
                java.lang.String r8 = r12.f197465b
                r7.getClass()
                if (r8 == 0) goto L_0x00ed
                int r9 = r8.length()
                if (r9 == 0) goto L_0x00ed
                if (r2 == 0) goto L_0x00ed
                boolean r9 = r2.isRecycled()
                if (r9 == 0) goto L_0x00b3
                goto L_0x00ed
            L_0x00b3:
                java.lang.String r9 = r7.mo69377t2(r8, r6)
                if (r9 != 0) goto L_0x00c0
                java.lang.String r2 = "saveIcon fail, iconPath is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
                goto L_0x00f3
            L_0x00c0:
                com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
                r10.<init>((java.lang.String) r9)
                boolean r9 = r10.mo119967g()
                if (r9 == 0) goto L_0x00ce
                r10.mo119966f()
            L_0x00ce:
                java.io.OutputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106426H(r10)     // Catch:{ Exception -> 0x00e0 }
                android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x00e0 }
                r11 = 100
                r2.compress(r10, r11, r9)     // Catch:{ Exception -> 0x00e0 }
                r9.close()     // Catch:{ Exception -> 0x00e0 }
                r7.doNotify(r8)     // Catch:{ Exception -> 0x00e0 }
                goto L_0x00f3
            L_0x00e0:
                r2 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r0, r7)
                java.lang.String r2 = "saveIcon : compress occurs an exception"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
                goto L_0x00f3
            L_0x00ed:
                java.lang.String r2 = "saveIcon : invalid argument"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            L_0x00f3:
                java.lang.String r2 = "handleAppRegisteration, trigger getAppSetting, appId = "
                if (r13 != 0) goto L_0x015a
                com.tencent.mm.pluginsdk.model.app.j r13 = new com.tencent.mm.pluginsdk.model.app.j
                r13.<init>()
                java.lang.String r5 = r12.f197465b
                r13.field_appId = r5
                r13.field_appName = r0
                java.lang.String r0 = r12.f197467d
                r13.field_packageName = r0
                r13.field_status = r4
                di3.d r0 = di3.C86312j.m106911c(r1)
                ym.p r0 = (p763ym.C79139p) r0
                android.content.Context r1 = r12.f197464a
                java.lang.String r4 = r12.f197467d
                java.lang.String r0 = r0.mn0(r1, r4)
                if (r0 == 0) goto L_0x011a
                r13.field_signature = r0
            L_0x011a:
                long r0 = java.lang.System.currentTimeMillis()
                r13.field_modifyTime = r0
                long r0 = r12.f197468e
                r13.field_appSupportContentType = r0
                com.tencent.mm.pluginsdk.model.app.p r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
                boolean r0 = r0.insert(r13)
                java.lang.String r1 = r12.f197465b
                com.tencent.p014mm.pluginsdk.p133ui.tools.C72918o.m85514b(r1)
                if (r0 == 0) goto L_0x01cb
                java.lang.String r13 = r13.field_openId
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r13 == 0) goto L_0x01cb
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r2)
                java.lang.String r0 = r12.f197465b
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r13)
                com.tencent.mm.pluginsdk.model.app.e0 r13 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Bx0()
                java.lang.String r0 = r12.f197465b
                r13.mo69340a(r0)
                goto L_0x01cb
            L_0x015a:
                int r0 = r13.field_appInfoFlag
                r0 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r0 == 0) goto L_0x016d
                long r0 = r12.f197468e
                long r7 = r13.field_appSupportContentType
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L_0x0169
                goto L_0x016a
            L_0x0169:
                r6 = 0
            L_0x016a:
                r13.field_appSupportContentType = r0
                goto L_0x016e
            L_0x016d:
                r6 = 0
            L_0x016e:
                int r0 = r13.field_status
                r1 = 2
                if (r0 == r1) goto L_0x017b
                r1 = 3
                if (r0 == r1) goto L_0x017b
                r1 = 4
                if (r0 == r1) goto L_0x017b
                if (r6 == 0) goto L_0x01a6
            L_0x017b:
                boolean r0 = r13.mo69359k()
                if (r0 != 0) goto L_0x0186
                java.lang.String r0 = r12.f197465b
                com.tencent.p014mm.pluginsdk.p133ui.tools.C72918o.m85514b(r0)
            L_0x0186:
                r13.field_status = r4
                com.tencent.mm.pluginsdk.model.app.p r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
                java.lang.String[] r1 = new java.lang.String[r4]
                boolean r0 = r0.update(r13, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "handleAppRegisteration, updateRet = "
                r1.append(r4)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            L_0x01a6:
                java.lang.String r13 = r13.field_openId
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r13 == 0) goto L_0x01cb
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r2)
                java.lang.String r0 = r12.f197465b
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r13)
                com.tencent.mm.pluginsdk.model.app.e0 r13 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Bx0()
                java.lang.String r0 = r12.f197465b
                r13.mo69340a(r0)
            L_0x01cb:
                return
            L_0x01cc:
                r13 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.String r1 = "MicroMsg.Crash"
                java.lang.String r2 = "May cause dvmFindCatchBlock crash!"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r13, r2, r0)
                java.lang.IncompatibleClassChangeError r0 = new java.lang.IncompatibleClassChangeError
                r0.<init>(r2)
                java.lang.Throwable r13 = r0.initCause(r13)
                java.lang.IncompatibleClassChangeError r13 = (java.lang.IncompatibleClassChangeError) r13
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.WXEntryActivity.EntryReceiver.mo94571b(com.tencent.mm.pluginsdk.model.app.j):void");
        }

        public void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                if (f197463f == null) {
                    f197463f = new MMHandler("WXEntryReceiver");
                }
                if (!C86709a0.m107528h().f251724a.f251792d) {
                    C86709a0.m107528h().mo121097c(new C68738a(context, intent));
                } else {
                    f197463f.post(new C68739b(context, intent));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$a */
    public class C68740a implements MenuItem.OnMenuItemClickListener {
        public C68740a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WXEntryActivity wXEntryActivity = WXEntryActivity.this;
            int i = WXEntryActivity.f197446w;
            wXEntryActivity.mo94562Q7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$b */
    public class C68741b implements DialogInterface.OnCancelListener {
        public C68741b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            WXEntryActivity.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$c */
    public class C68742c implements C79138l.C53540a {

        /* renamed from: a */
        public final /* synthetic */ C44561j f197477a;

        /* renamed from: b */
        public final /* synthetic */ C117747y f197478b;

        /* renamed from: c */
        public final /* synthetic */ Bundle f197479c;

        public C68742c(C44561j jVar, C117747y yVar, Bundle bundle) {
            this.f197477a = jVar;
            this.f197478b = yVar;
            this.f197479c = bundle;
        }

        /* renamed from: a */
        public void mo74207a(C44561j jVar) {
            if (jVar == null) {
                jVar = this.f197477a;
            }
            if (WXEntryActivity.this.f197462v.get() != null) {
                WXEntryActivity.this.f197462v.get().mo94561O7();
                WXEntryActivity.this.f197462v.get().mo94560N7(this.f197478b, jVar, this.f197479c);
            }
            WXEntryActivity.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$d */
    public class C68743d implements C77050b.C77051a {

        /* renamed from: a */
        public final /* synthetic */ C117747y f197481a;

        public C68743d(C117747y yVar) {
            this.f197481a = yVar;
        }

        /* renamed from: a */
        public void mo94576a(String str, LiteAppBizDataInfo liteAppBizDataInfo) {
            if (str == null || liteAppBizDataInfo == null) {
                WXEntryActivity wXEntryActivity = WXEntryActivity.this;
                String string = wXEntryActivity.getResources().getString(C0966R.string.nfw);
                int i = WXEntryActivity.f197446w;
                wXEntryActivity.mo94568W7(string);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("kWXEntryActivity_bundle_game_share_card_msgid", str);
            bundle.putParcelable("kWXEntryActivity_bundle_game_share_card_liteapp", liteAppBizDataInfo);
            WXEntryActivity wXEntryActivity2 = WXEntryActivity.this;
            C117747y yVar = this.f197481a;
            int i2 = WXEntryActivity.f197446w;
            wXEntryActivity2.mo94559M7(yVar, bundle);
        }
    }

    /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$e */
    public class C68744e implements View.OnClickListener {
        public C68744e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/base/stub/WXEntryActivity$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WXEntryActivity wXEntryActivity = WXEntryActivity.this;
            int i = WXEntryActivity.f197446w;
            wXEntryActivity.mo94565T7();
            WXEntryActivity.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/base/stub/WXEntryActivity$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: L7 */
    public static boolean m81004L7(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            Log.m105920e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, invalid arguments");
            return false;
        } else if (bArr.length != bArr2.length) {
            Log.m105920e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, length is different");
            return false;
        } else {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: P7 */
    public static byte[] m81005P7(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return C90193h.m112878f(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x015d  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94557J7(com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity.C72717a r17, android.content.Intent r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "postLogin, loginResult = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.WXEntryActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
            android.content.Intent r3 = r16.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            java.lang.String r5 = "_wxapi_command_type"
            r6 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getInt(r3, r5, r6)
            r0.f197456p = r3
            r3 = r18
            r0.mo94563R7(r3)
            int r3 = r17.ordinal()
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0097
            java.lang.String r2 = "postLogin fail, loginResult = "
            if (r3 == r8) goto L_0x006e
            if (r3 == r7) goto L_0x0058
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "postLogin, unknown login result = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            goto L_0x0093
        L_0x0058:
            r16.mo94566U7()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            goto L_0x0093
        L_0x006e:
            android.content.Intent r3 = r16.getIntent()
            android.os.Bundle r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r3)
            r5 = -1
            com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs r3 = com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84995a(r3, r5)
            com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84997c(r0, r3, r8, r6)
            r16.finish()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
        L_0x0093:
            r16.finish()
            return
        L_0x0097:
            android.content.res.Resources r1 = r16.getResources()
            r3 = 2131100376(0x7f0602d8, float:1.7813132E38)
            int r1 = r1.getColor(r3)
            com.tencent.mm.ui.MMActivityController r3 = r16.getController()
            if (r3 == 0) goto L_0x00af
            com.tencent.mm.ui.MMActivityController r3 = r16.getController()
            r3.mo177105z0(r1)
        L_0x00af:
            android.content.Intent r1 = r16.getIntent()
            if (r1 == 0) goto L_0x073b
            android.content.Intent r1 = r16.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 != 0) goto L_0x00c1
            goto L_0x073b
        L_0x00c1:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r3 = r0.f197456p
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r6] = r3
            java.lang.String r3 = r0.f197449f
            r1[r8] = r3
            java.lang.String r3 = "checkCanShare, cmd = %d, token = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r1)
            int r1 = r0.f197456p
            if (r1 != 0) goto L_0x00e6
            android.content.Intent r1 = r16.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            int r1 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getInt(r1, r5, r6)
            r0.f197456p = r1
        L_0x00e6:
            java.lang.String r1 = r0.f197449f
            java.lang.String r3 = r0.f197448e
            com.tencent.mm.pluginsdk.model.app.u1 r5 = r0.f197450g
            com.tencent.mm.pluginsdk.model.app.u1$a r1 = com.tencent.p014mm.pluginsdk.model.app.C72702v1.m85089a(r1, r3, r5)
            r0.f197452i = r1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r3 = r0.f197456p
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r6] = r3
            com.tencent.mm.pluginsdk.model.app.u1$a r3 = r0.f197452i
            r1[r8] = r3
            java.lang.String r3 = "checkTokenValid cmd: %d, tokenResult: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r1)
            int r12 = r0.f197456p
            if (r12 == r7) goto L_0x010a
            goto L_0x0110
        L_0x010a:
            com.tencent.mm.pluginsdk.model.app.u1$a r1 = r0.f197452i
            com.tencent.mm.pluginsdk.model.app.u1$a r3 = com.tencent.p014mm.pluginsdk.model.app.C72693u1.C72694a.OK
            if (r1 != r3) goto L_0x0112
        L_0x0110:
            r1 = 1
            goto L_0x0113
        L_0x0112:
            r1 = 0
        L_0x0113:
            r0.f197451h = r1
            int r9 = r0.f197455o
            com.tencent.mm.pluginsdk.model.app.u1$a r10 = r0.f197452i
            java.lang.String r11 = r0.f197447d
            java.lang.String r13 = r0.f197449f
            com.tencent.mm.pluginsdk.model.app.u1 r1 = r0.f197450g
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0129
            java.lang.String r1 = r1.mo100163a(r3)
            r14 = r1
            goto L_0x012a
        L_0x0129:
            r14 = r3
        L_0x012a:
            java.lang.String r15 = r0.f197448e
            dw0.C75461a.m90500a(r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = r0.f197451h
            if (r1 != 0) goto L_0x0167
            int r1 = r0.f197455o
            r5 = 620824064(0x25010600, float:1.1190999E-16)
            if (r1 >= r5) goto L_0x013b
            goto L_0x015a
        L_0x013b:
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_opensdk_block_invalid_token
            int r1 = r1.mo58779Qe(r5, r6)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r5[r6] = r9
            java.lang.String r9 = "blockInvalidToken blockInvalidToken %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r5)
            if (r1 != r8) goto L_0x015a
            r1 = 1
            goto L_0x015b
        L_0x015a:
            r1 = 0
        L_0x015b:
            if (r1 == 0) goto L_0x0167
            java.lang.String r1 = "checkCanShare, token is not valid and block invalid token"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            r0.mo94568W7(r3)
            goto L_0x0743
        L_0x0167:
            int r1 = r0.f197456p
            r5 = 0
            if (r1 != r8) goto L_0x0179
            java.lang.String r1 = "it is auth, just dealrequest"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r0.mo94559M7(r5, r5)
            r16.finish()
            goto L_0x0743
        L_0x0179:
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r1 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req
            android.content.Intent r9 = r16.getIntent()
            android.os.Bundle r9 = r9.getExtras()
            r1.<init>(r9)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r1.message
            r0.f197461u = r9
            if (r9 != 0) goto L_0x019a
            java.lang.String r1 = "wxmsg is null, how could it be?, directly deal request"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            r0.mo94559M7(r5, r5)
            r16.finish()
            goto L_0x0743
        L_0x019a:
            di3.d r9 = di3.C86312j.m106911c(r2)
            ym.l r9 = (p763ym.C79138l) r9
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r10 = r0.f197461u
            boolean r9 = r9.mo73997OL(r10)
            if (r9 != 0) goto L_0x01fb
            java.lang.String r1 = "checkFilePath not valid on Android r and above"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            android.content.res.Resources r1 = r16.getResources()
            r4 = 2131833872(0x7f113410, float:1.9300838E38)
            java.lang.String r1 = r1.getString(r4)
            android.content.res.Resources r4 = r16.getResources()
            r5 = 2131833873(0x7f113411, float:1.930084E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            boolean r9 = f40.C86709a0.m107522a()
            if (r9 == 0) goto L_0x01d7
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            java.lang.String r3 = r0.f197447d
            java.lang.String r3 = r2.mo74012l5(r0, r3)
        L_0x01d7:
            r5[r6] = r3
            java.lang.String r2 = java.lang.String.format(r4, r5)
            r0.mo94569X7(r1, r2)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.base.stub.d> r1 = com.tencent.p014mm.plugin.base.stub.C85083h.f247920a
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = 60
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2[r8] = r3
            r3 = 1194(0x4aa, float:1.673E-42)
            r1.mo160131h(r3, r2)
            goto L_0x0743
        L_0x01fb:
            int r9 = r1.scene
            r10 = 38
            r11 = 4
            r12 = 76
            if (r9 != r11) goto L_0x0233
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            java.lang.String r13 = "wxMsg"
            gy3.C87412m.m108594g(r9, r13)
            int r13 = r9.getType()
            if (r13 == r8) goto L_0x0227
            int r13 = r9.getType()
            if (r13 == r7) goto L_0x0227
            int r13 = r9.getType()
            if (r13 == r12) goto L_0x0227
            int r9 = r9.getType()
            if (r9 != r10) goto L_0x0225
            goto L_0x0227
        L_0x0225:
            r9 = 0
            goto L_0x0228
        L_0x0227:
            r9 = 1
        L_0x0228:
            if (r9 != 0) goto L_0x0233
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXTextObject r13 = new com.tencent.mm.opensdk.modelmsg.WXTextObject
            r13.<init>()
            r9.mediaObject = r13
        L_0x0233:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r13 = 3
            if (r9 != r13) goto L_0x0265
            java.lang.String r9 = "checkCanShare WXMusicObject downgrade to h5"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r9 = r9.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXMusicObject r9 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicObject) r9
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject r14 = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject
            r14.<init>()
            java.lang.String r9 = r9.musicUrl
            r14.webpageUrl = r9
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            r9.mediaObject = r14
            r1.message = r9
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r1.toBundle(r9)
            android.content.Intent r14 = r16.getIntent()
            r14.putExtras(r9)
        L_0x0265:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r14 = 46
            if (r9 != r14) goto L_0x0289
            java.lang.String r1 = "checkCanShare, is weishi video, not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.content.Intent r1 = r16.getIntent()
            android.os.Bundle r1 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r1)
            r2 = -5
            com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs r1 = com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84995a(r1, r2)
            com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84997c(r0, r1, r8, r6)
            r16.finish()
            goto L_0x0743
        L_0x0289:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            if (r9 != r10) goto L_0x02d6
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r9 = r9.mediaObject
            if (r9 == 0) goto L_0x02d6
            boolean r10 = r9 instanceof com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject
            if (r10 == 0) goto L_0x02d6
            com.tencent.mm.opensdk.modelmsg.WXVideoFileObject r9 = (com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject) r9
            int r10 = r9.shareScene
            if (r10 != r8) goto L_0x02d6
            java.lang.String r10 = "opensdk_shareTicket"
            android.content.SharedPreferences r10 = r0.getSharedPreferences(r10, r6)
            java.lang.String r15 = r0.f197448e
            java.lang.String r15 = r10.getString(r15, r3)
            java.lang.String r12 = r9.shareTicket
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r15, (java.lang.String) r12)
            if (r12 != 0) goto L_0x02c9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r6] = r15
            java.lang.String r2 = r9.shareTicket
            r1[r8] = r2
            java.lang.String r2 = "shareTicket is wrong %s/%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r1)
            r16.mo94565T7()
            goto L_0x0743
        L_0x02c9:
            android.content.SharedPreferences$Editor r9 = r10.edit()
            java.lang.String r10 = r0.f197448e
            android.content.SharedPreferences$Editor r9 = r9.remove(r10)
            r9.apply()
        L_0x02d6:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r10 = 45
            r12 = 36
            if (r9 == r12) goto L_0x02f2
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            if (r9 == r14) goto L_0x02f2
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            if (r9 != r10) goto L_0x02f8
        L_0x02f2:
            int r9 = r1.scene
            if (r9 == r13) goto L_0x02f8
            r1.scene = r6
        L_0x02f8:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r0.f197460t = r9
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r15 = 49
            if (r9 != r15) goto L_0x030c
            r1.scene = r6
        L_0x030c:
            int r9 = r1.scene
            if (r9 != r7) goto L_0x0312
            r9 = 3
            goto L_0x0323
        L_0x0312:
            if (r9 != r8) goto L_0x0316
            r9 = 2
            goto L_0x0323
        L_0x0316:
            if (r9 != 0) goto L_0x031a
            r9 = 1
            goto L_0x0323
        L_0x031a:
            if (r9 != r13) goto L_0x031e
            r9 = 5
            goto L_0x0323
        L_0x031e:
            if (r9 != r11) goto L_0x0322
            r9 = 6
            goto L_0x0323
        L_0x0322:
            r9 = 0
        L_0x0323:
            boolean r10 = r0.f197451h
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r0.f197461u
            int r14 = r14.getType()
            java.lang.String r12 = "weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&userOpenid=%s&tokenValid=%d"
            r5 = 7
            if (r14 != r8) goto L_0x0391
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r2 = r2.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXTextObject r2 = (com.tencent.p014mm.opensdk.modelmsg.WXTextObject) r2
            java.lang.String r2 = r2.text
            int r14 = r1.scene
            if (r14 != r11) goto L_0x0350
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject r14 = r1.sceneDataObject
            boolean r15 = r14 instanceof com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject
            if (r15 == 0) goto L_0x0350
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject r14 = (com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject) r14
            java.lang.String r15 = r14.stateTitle
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 == 0) goto L_0x034f
            r14.stateTitle = r2
        L_0x034f:
            r2 = r3
        L_0x0350:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r14 = r0.f197447d
            r5[r6] = r14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r8] = r9
            java.lang.String r2 = r0.mo94570Y7(r2)
            r5[r7] = r2
            r5[r13] = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r2.append(r9)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5[r11] = r2
            java.lang.String r2 = r1.userOpenId
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r14 = 5
            r5[r14] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r9 = 6
            r5[r9] = r2
            java.lang.String r2 = java.lang.String.format(r12, r5)
            goto L_0x0577
        L_0x0391:
            r14 = 5
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r15 = r0.f197461u
            int r15 = r15.getType()
            if (r15 != r14) goto L_0x03eb
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r2 = r2.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject r2 = (com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject) r2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r14 = r0.f197447d
            r5[r6] = r14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r8] = r9
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            java.lang.String r9 = r9.description
            java.lang.String r9 = r0.mo94570Y7(r9)
            r5[r7] = r9
            java.lang.String r2 = r2.webpageUrl
            java.lang.String r2 = r0.mo94570Y7(r2)
            r5[r13] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r2.append(r9)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5[r11] = r2
            java.lang.String r2 = r1.userOpenId
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r9 = 5
            r5[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r9 = 6
            r5[r9] = r2
            java.lang.String r2 = java.lang.String.format(r12, r5)
            goto L_0x0577
        L_0x03eb:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r0.f197461u
            int r14 = r14.getType()
            r15 = 36
            if (r14 == r15) goto L_0x0507
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r0.f197461u
            int r14 = r14.getType()
            r15 = 46
            if (r14 != r15) goto L_0x0401
            goto L_0x0507
        L_0x0401:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r0.f197461u
            int r14 = r14.getType()
            r15 = 45
            if (r14 != r15) goto L_0x0454
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r2 = r2.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject r2 = (com.tencent.p014mm.opensdk.modelmsg.WXEnterpriseCardObject) r2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r14 = r0.f197447d
            r5[r6] = r14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r8] = r9
            java.lang.String r2 = r2.cardInfo
            java.lang.String r2 = r0.mo94570Y7(r2)
            r5[r7] = r2
            r5[r13] = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r2.append(r9)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5[r11] = r2
            java.lang.String r2 = r1.userOpenId
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r9 = 5
            r5[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r9 = 6
            r5[r9] = r2
            java.lang.String r2 = java.lang.String.format(r12, r5)
            goto L_0x0577
        L_0x0454:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r0.f197461u
            int r14 = r14.getType()
            r15 = 49
            if (r14 != r15) goto L_0x04c3
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r12 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r12 = r12.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXWeWorkObject r12 = (com.tencent.p014mm.opensdk.modelmsg.WXWeWorkObject) r12
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            int r14 = r12.subType
            int r2 = r2.ta0(r14)
            if (r2 >= 0) goto L_0x0477
            r0.mo94568W7(r3)
            goto L_0x0743
        L_0x0477:
            r14 = 8
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r15 = r0.f197447d
            r14[r6] = r15
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r14[r8] = r9
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            java.lang.String r9 = r9.description
            java.lang.String r9 = r0.mo94570Y7(r9)
            r14[r7] = r9
            r14[r13] = r3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            r9.append(r3)
            java.lang.String r2 = r9.toString()
            r14[r11] = r2
            java.lang.String r2 = r1.userOpenId
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r9 = 5
            r14[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r9 = 6
            r14[r9] = r2
            int r2 = r12.subType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14[r5] = r2
            java.lang.String r2 = "weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&userOpenid=%s&tokenValid=%d&msgSubType=%s"
            java.lang.String r2 = java.lang.String.format(r2, r14)
            goto L_0x0577
        L_0x04c3:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r5 = r0.f197447d
            r2[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r2[r8] = r5
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f197461u
            java.lang.String r5 = r5.description
            java.lang.String r5 = r0.mo94570Y7(r5)
            r2[r7] = r5
            r2[r13] = r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            r5.append(r9)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r2[r11] = r5
            java.lang.String r5 = r1.userOpenId
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r9 = 5
            r2[r9] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r9 = 6
            r2[r9] = r5
            java.lang.String r2 = java.lang.String.format(r12, r2)
            goto L_0x0577
        L_0x0507:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r2 = r2.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject r2 = (com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject) r2
            java.lang.Class<kr0.w0> r12 = kr0.C76629w0.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            kr0.w0 r12 = (kr0.C76629w0) r12
            java.lang.String r14 = r2.userName
            r15 = 0
            r12.mo106884tG(r14, r15)
            r12 = 9
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r14 = r0.f197447d
            r12[r6] = r14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12[r8] = r9
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            java.lang.String r9 = r9.description
            java.lang.String r9 = r0.mo94570Y7(r9)
            r12[r7] = r9
            java.lang.String r9 = r2.webpageUrl
            java.lang.String r9 = r0.mo94570Y7(r9)
            r12[r13] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r0.f197461u
            int r14 = r14.getType()
            r9.append(r14)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r12[r11] = r9
            java.lang.String r9 = r2.userName
            r14 = 5
            r12[r14] = r9
            java.lang.String r2 = r2.path
            java.lang.String r2 = r0.mo94570Y7(r2)
            r9 = 6
            r12[r9] = r2
            java.lang.String r2 = r1.userOpenId
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r12[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r5 = 8
            r12[r5] = r2
            java.lang.String r2 = "weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&appbrandusername=%s&appbrandpath=%s&userOpenid=%s&tokenValid=%d"
            java.lang.String r2 = java.lang.String.format(r2, r12)
        L_0x0577:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f197461u
            int r5 = r5.getType()
            if (r5 != r13) goto L_0x05ad
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x05ad
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r5 = r5.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXMusicObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicObject) r5
            java.lang.String r9 = r5.songAlbumUrl
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x05ad
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r2 = "&songAlbumUrl="
            r9.append(r2)
            java.lang.String r2 = r5.songAlbumUrl
            java.lang.String r2 = r0.mo94570Y7(r2)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
        L_0x05ad:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f197461u
            int r5 = r5.getType()
            r9 = 6
            if (r5 != r9) goto L_0x05fd
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r5 = r5.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXFileObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXFileObject) r5
            long r9 = p645pj.C77092c.m93047i()
            java.lang.String r12 = r5.filePath
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            int r12 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x05fa
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            r1[r6] = r2
            java.lang.String r2 = r5.filePath
            r1[r8] = r2
            java.lang.String r2 = "dealWithFile fail, fileLength is too large, filePathContentSize[%d], filePath[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
            r1 = 2131836646(0x7f113ee6, float:1.9306465E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 1024(0x400, double:5.06E-321)
            long r9 = r9 / r3
            long r9 = r9 / r3
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2[r6] = r3
            java.lang.String r1 = r0.getString(r1, r2)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r8)
            r1.show()
            r16.finish()
            goto L_0x0743
        L_0x05fa:
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r11)
        L_0x05fd:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f197461u
            int r5 = r5.getType()
            r9 = 76
            if (r5 != r9) goto L_0x063b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x063b
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r5 = r5.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r2 = "&singerName="
            r9.append(r2)
            java.lang.String r2 = r5.singerName
            java.lang.String r2 = r0.mo94570Y7(r2)
            r9.append(r2)
            java.lang.String r2 = "&mediaDataUrl="
            r9.append(r2)
            java.lang.String r2 = r5.musicDataUrl
            java.lang.String r2 = r0.mo94570Y7(r2)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
        L_0x063b:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f197461u
            java.lang.String r5 = r5.mediaTagName
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0667
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x0667
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "&mediaTagName="
            r5.append(r2)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r0.f197461u
            java.lang.String r2 = r2.mediaTagName
            java.lang.String r2 = r0.mo94570Y7(r2)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x0667:
            int r5 = r1.scene
            if (r5 != r11) goto L_0x06bf
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject r5 = r1.sceneDataObject
            boolean r9 = r5 instanceof com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject
            if (r9 == 0) goto L_0x06bf
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject r5 = (com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r10 = r5.stateId
            r2[r6] = r10
            java.lang.String r10 = r5.stateTitle
            r2[r8] = r10
            java.lang.String r10 = r5.token
            r2[r7] = r10
            java.lang.String r10 = "&stateId=%s&stateTitle=%s&stateToken=%s"
            java.lang.String r2 = java.lang.String.format(r10, r2)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo r9 = r5.stateJumpInfo
            boolean r9 = r9 instanceof com.tencent.p014mm.opensdk.modelmsg.WXStateJumpUrlInfo
            if (r9 == 0) goto L_0x06bf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo r5 = r5.stateJumpInfo
            com.tencent.mm.opensdk.modelmsg.WXStateJumpUrlInfo r5 = (com.tencent.p014mm.opensdk.modelmsg.WXStateJumpUrlInfo) r5
            java.lang.String r5 = r5.jumpUrl
            java.lang.String r5 = r0.mo94570Y7(r5)
            r2[r6] = r5
            java.lang.String r5 = "&stateUrl=%s"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
        L_0x06bf:
            java.lang.Object[] r5 = new java.lang.Object[r13]
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.f197461u
            int r9 = r9.getType()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r6] = r9
            int r6 = r1.scene
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r8] = r6
            r5[r7] = r2
            java.lang.String r6 = "checkCanShare, wxMsg type: %s, request scene: %d, dpLink = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r0.f197461u
            int r4 = r4.getType()
            r5 = 76
            if (r4 == r5) goto L_0x06ee
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r0.f197461u
            int r4 = r4.getType()
            if (r4 != r13) goto L_0x0712
        L_0x06ee:
            java.lang.Class<jv.c> r4 = p580jv.C60923c.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            jv.c r4 = (p580jv.C60923c) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r6 = java.lang.System.currentTimeMillis()
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = r0.f197447d
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r6 = r0.f197461u
            int r7 = r1.scene
            r4.mp0(r3, r5, r6, r7)
        L_0x0712:
            androidx.appcompat.app.AppCompatActivity r8 = r16.getContext()
            r3 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r10 = r0.getString(r3)
            r11 = 1
            r12 = 1
            com.tencent.mm.plugin.base.stub.p r13 = new com.tencent.mm.plugin.base.stub.p
            r13.<init>(r0)
            java.lang.String r9 = ""
            qo3.i0 r3 = nj3.C76879j.m92723Q(r8, r9, r10, r11, r12, r13)
            r0.f197459s = r3
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.base.stub.q r4 = new com.tencent.mm.plugin.base.stub.q
            r4.<init>(r0, r1, r2)
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r1 = "SendAppMsgThread"
            r3.mo183876g(r4, r1)
            goto L_0x0743
        L_0x073b:
            java.lang.String r1 = "checkCanShare fail, invalid intent/extras"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            r16.finish()
        L_0x0743:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.WXEntryActivity.mo94557J7(com.tencent.mm.pluginsdk.ui.AutoLoginActivity$a, android.content.Intent):void");
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        if (!mo94563R7(intent)) {
            Log.m105920e("MicroMsg.WXEntryActivity", "Init failed");
            finish();
            return false;
        }
        if (!C97625j3.m125811a() || C86718e.m107551r()) {
            Log.m105929w("MicroMsg.WXEntryActivity", "preLogin not login, save the appid : %s", this.f197447d);
            ((C79139p) C86312j.m106911c(C79139p.class)).ac0(this.f197447d);
        }
        if (!(this.f197455o >= 553713665)) {
            Log.m105920e("MicroMsg.WXEntryActivity", "sdk version is not supported, sdkVersion = " + this.f197455o);
            finish();
            return false;
        } else if (this.f197457q == null) {
            Log.m105920e("MicroMsg.WXEntryActivity", "check appid failed, null content");
            finish();
            return false;
        } else {
            Log.m105924i("MicroMsg.WXEntryActivity", "preLogin, appId = " + this.f197447d);
            if (Util.isNullOrNil(this.f197447d)) {
                Log.m105920e("MicroMsg.WXEntryActivity", "invalid appid, ignore");
                finish();
                return false;
            }
            Log.m105924i("MicroMsg.WXEntryActivity", "preLogin, pkg = " + this.f197448e);
            if (Util.isNullOrNil(this.f197448e)) {
                Log.m105920e("MicroMsg.WXEntryActivity", "unknown package, ignore");
                finish();
                return false;
            } else if (m81004L7(IntentUtil.getByteArrayExtra(intent, ConstantsAPI.CHECK_SUM), m81005P7(this.f197458r, this.f197455o, this.f197448e))) {
                return true;
            } else {
                Log.m105920e("MicroMsg.WXEntryActivity", "checksum fail");
                finish();
                return false;
            }
        }
    }

    /* renamed from: M7 */
    public final void mo94559M7(C117747y yVar, Bundle bundle) {
        Class cls = C79138l.class;
        if (!C97625j3.m125811a()) {
            Log.m105928w("MicroMsg.WXEntryActivity", "accHasReady not ready, do nothing");
            finish();
            return;
        }
        C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(this.f197447d);
        if (appInfo == null || !Util.isEqual(this.f197448e, appInfo.field_packageName)) {
            this.f197459s = C76879j.m92723Q(getContext(), "", getString(C0966R.string.a4d), true, true, new C68741b());
            ((C79138l) C86312j.m106911c(cls)).mo74004WW(this.f197447d, this.f197448e, new C68742c(appInfo, yVar, bundle));
            return;
        }
        mo94560N7(yVar, appInfo, bundle);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0398, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0399, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x039c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x039d, code lost:
        r24 = r5;
        r5 = r14;
        r25 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r4.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03c9, code lost:
        r4 = r0;
        r11 = false;
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.WXEntryActivity", r4, "%s", r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03d8, code lost:
        r11 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02b9 A[Catch:{ Exception -> 0x02dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0381 A[SYNTHETIC, Splitter:B:129:0x0381] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0398 A[ExcHandler: all (r0v45 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:113:0x0307] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03c2 A[SYNTHETIC, Splitter:B:147:0x03c2] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x042b A[SYNTHETIC, Splitter:B:164:0x042b] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028e  */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo94560N7(ob0.C117747y r29, com.tencent.p014mm.pluginsdk.model.app.C44561j r30, android.os.Bundle r31) {
        /*
            r28 = this;
            r9 = r28
            r8 = r30
            r10 = r31
            java.lang.String r0 = "1"
            java.lang.Class<ym.p> r11 = p763ym.C79139p.class
            r12 = 0
            java.lang.String r13 = "MicroMsg.WXEntryActivity"
            if (r8 != 0) goto L_0x0015
            java.lang.String r0 = "app not reg, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r12
        L_0x0015:
            android.content.Intent r14 = r28.getIntent()
            android.content.Intent r1 = r28.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            java.lang.String r2 = "_wxapi_command_type"
            int r15 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getInt(r1, r2, r12)
            r7 = 2
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1[r12] = r2
            java.lang.String r2 = r9.f197454n
            r6 = 1
            r1[r6] = r2
            java.lang.String r2 = "dealRequest, cmd = %d, authority = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            if (r14 == 0) goto L_0x05fb
            android.os.Bundle r1 = r14.getExtras()
            if (r1 != 0) goto L_0x0044
            goto L_0x05fb
        L_0x0044:
            java.lang.String r1 = r9.f197454n
            java.lang.String r2 = "sendreq"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = r9.f197454n
            java.lang.String r2 = "sendresp"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x005b
            goto L_0x0073
        L_0x005b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown authority, should never reached, authority="
            r0.append(r1)
            java.lang.String r1 = r9.f197454n
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            return r12
        L_0x0073:
            di3.d r1 = di3.C86312j.m106911c(r11)
            ym.p r1 = (p763ym.C79139p) r1
            java.lang.String r4 = r9.f197448e
            com.tencent.mm.pluginsdk.model.app.u1 r5 = r9.f197450g
            com.tencent.mm.pluginsdk.model.app.t1 r3 = r9.f197453j
            r16 = 1
            r2 = r28
            r17 = r3
            r3 = r30
            r12 = 1
            r6 = r17
            r7 = r16
            boolean r1 = r1.mo108863Ln(r2, r3, r4, r5, r6, r7)
            r2 = 3
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0189
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = r9.f197447d
            r4 = 0
            r0[r4] = r1
            java.lang.String r1 = "send fail, check app fail, force to get app info from server again : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r1, r0)
            com.tencent.mm.pluginsdk.model.app.o r0 = ld2.C46848g.Ax0()
            java.lang.String r1 = r9.f197447d
            r0.mo69369e(r1)
            r28.mo94565T7()
            java.lang.String r0 = r9.f197448e
            android.content.pm.Signature[] r1 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r9, r0)
            if (r1 == 0) goto L_0x00e4
            int r4 = r1.length
            if (r4 <= 0) goto L_0x00e4
            int r4 = r1.length
            r6 = r3
            r5 = 0
        L_0x00bc:
            if (r5 >= r4) goto L_0x00e5
            r7 = r1[r5]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            byte[] r6 = r7.toByteArray()
            java.lang.String r6 = p823sg.C90193h.m112878f(r6)
            java.lang.String r6 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85019e(r6)
            r10.append(r6)
            java.lang.String r6 = "|"
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00e4:
            r6 = r3
        L_0x00e5:
            int r1 = r6.length()
            if (r1 <= r12) goto L_0x00f5
            int r1 = r6.length()
            int r1 = r1 - r12
            r4 = 0
            java.lang.String r6 = r6.substring(r4, r1)
        L_0x00f5:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r4 = "raw_package_name"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ Exception -> 0x0129 }
            r1.put(r4, r0)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r0 = "package_name"
            java.lang.String r4 = r8.field_packageName     // Catch:{ Exception -> 0x0129 }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ Exception -> 0x0129 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r0 = "raw_signature"
            r1.put(r0, r6)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r0 = "signature"
            java.lang.String r4 = r8.field_signature     // Catch:{ Exception -> 0x0129 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ Exception -> 0x0129 }
            r1.put(r0, r3)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r0 = "scene"
            r1.put(r0, r15)     // Catch:{ Exception -> 0x0129 }
            goto L_0x0142
        L_0x0129:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "doIfAppInValid, jsonException = "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
        L_0x0142:
            com.tencent.mm.autogen.events.GameWatchReportEvent r0 = new com.tencent.mm.autogen.events.GameWatchReportEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GameWatchReportEvent$a r3 = r0.f9289d
            java.lang.String r4 = r8.field_appId
            r3.f9290a = r4
            r3.f9291b = r2
            java.lang.String r1 = r1.toString()
            r3.f9293d = r1
            r0.publish()
            di3.d r0 = di3.C86312j.m106911c(r11)
            ym.p r0 = (p763ym.C79139p) r0
            com.tencent.mm.pluginsdk.model.app.u1 r1 = r9.f197450g
            int r2 = r1.f211523d
            if (r1 == 0) goto L_0x016b
            java.lang.String r3 = r9.f197448e
            java.lang.String r1 = r1.mo100163a(r3)
            goto L_0x016d
        L_0x016b:
            java.lang.String r1 = r9.f197448e
        L_0x016d:
            r17 = r1
            java.lang.String r1 = r9.f197449f
            com.tencent.mm.pluginsdk.model.app.t1 r3 = r9.f197453j
            com.tencent.mm.pluginsdk.model.app.t1$a r3 = r3.f211511a
            r21 = 0
            r4 = r15
            r15 = r0
            r16 = r2
            r18 = r1
            r19 = r4
            r20 = r3
            r15.mo108860Hp(r16, r17, r18, r19, r20, r21)
            r28.mo94567V7()
            r1 = 0
            return r1
        L_0x0189:
            r4 = r15
            di3.d r1 = di3.C86312j.m106911c(r11)
            r15 = r1
            ym.p r15 = (p763ym.C79139p) r15
            com.tencent.mm.pluginsdk.model.app.u1 r1 = r9.f197450g
            int r5 = r1.f211523d
            if (r1 == 0) goto L_0x019e
            java.lang.String r6 = r9.f197448e
            java.lang.String r1 = r1.mo100163a(r6)
            goto L_0x01a0
        L_0x019e:
            java.lang.String r1 = r9.f197448e
        L_0x01a0:
            r17 = r1
            java.lang.String r1 = r9.f197449f
            com.tencent.mm.pluginsdk.model.app.t1 r6 = r9.f197453j
            com.tencent.mm.pluginsdk.model.app.t1$a r6 = r6.f211511a
            r21 = 0
            r16 = r5
            r18 = r1
            r19 = r4
            r20 = r6
            r15.mo108860Hp(r16, r17, r18, r19, r20, r21)
            r28.mo94567V7()
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r1 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req
            android.os.Bundle r4 = r14.getExtras()
            r1.<init>(r4)
            if (r29 == 0) goto L_0x043f
            r6 = r29
            com.tencent.mm.modelsimple.i0 r6 = (com.tencent.p014mm.modelsimple.C40360i0) r6
            te3.wj4 r6 = r6.mo63047h()
            if (r6 == 0) goto L_0x0269
            java.lang.String r7 = r6.f144097f
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0269
            java.lang.String r7 = r6.f144097f     // Catch:{ Exception -> 0x0252 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r11 = "dealRequest response.deeplink: %s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0252 }
            java.lang.String r6 = r6.f144097f     // Catch:{ Exception -> 0x0252 }
            r16 = 0
            r15[r16] = r6     // Catch:{ Exception -> 0x0252 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r11, r15)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r6 = "returncancel"
            java.lang.String r6 = r7.getQueryParameter(r6)     // Catch:{ Exception -> 0x0252 }
            java.lang.String r11 = "videoTime"
            java.lang.String r11 = r7.getQueryParameter(r11)     // Catch:{ Exception -> 0x0252 }
            r15 = 10
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r15)     // Catch:{ Exception -> 0x0252 }
            boolean r6 = r0.equals(r6)     // Catch:{ Exception -> 0x024f }
            java.lang.String r15 = "checkToken"
            java.lang.String r15 = r7.getQueryParameter(r15)     // Catch:{ Exception -> 0x024d }
            boolean r15 = r0.equals(r15)     // Catch:{ Exception -> 0x024d }
            java.lang.String r5 = "skipCompress"
            java.lang.String r5 = r7.getQueryParameter(r5)     // Catch:{ Exception -> 0x024a }
            boolean r5 = r0.equals(r5)     // Catch:{ Exception -> 0x024a }
            java.lang.String r0 = "secFlagForSinglePageMode"
            java.lang.String r0 = r7.getQueryParameter(r0)     // Catch:{ Exception -> 0x0248 }
            r4 = 0
            int r18 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0248 }
            java.lang.String r0 = "videoTransPara"
            java.lang.String r0 = r7.getQueryParameter(r0)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r0, r4)     // Catch:{ Exception -> 0x0245 }
            int r0 = r1.scene     // Catch:{ Exception -> 0x0243 }
            if (r0 != r2) goto L_0x0270
            java.lang.String r0 = "username"
            java.lang.String r0 = r7.getQueryParameter(r0)     // Catch:{ Exception -> 0x0243 }
            java.lang.String r2 = "SendAppMessageWrapper_UserName"
            r14.putExtra(r2, r0)     // Catch:{ Exception -> 0x0243 }
            goto L_0x0270
        L_0x0243:
            r0 = move-exception
            goto L_0x025a
        L_0x0245:
            r0 = move-exception
            r4 = 0
            goto L_0x025a
        L_0x0248:
            r0 = move-exception
            goto L_0x0257
        L_0x024a:
            r0 = move-exception
            r5 = 0
            goto L_0x0257
        L_0x024d:
            r0 = move-exception
            goto L_0x0255
        L_0x024f:
            r0 = move-exception
            r6 = 0
            goto L_0x0255
        L_0x0252:
            r0 = move-exception
            r6 = 0
            r11 = 0
        L_0x0255:
            r5 = 0
            r15 = 0
        L_0x0257:
            r4 = 0
            r18 = 0
        L_0x025a:
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.String r0 = r0.getMessage()
            r7 = 0
            r2[r7] = r0
            java.lang.String r0 = "dealRequest getQueryParameter exp: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r2)
            goto L_0x0270
        L_0x0269:
            r4 = 0
            r5 = 0
            r6 = 0
            r11 = 0
            r15 = 0
            r18 = 0
        L_0x0270:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.message
            java.lang.String r2 = "%s"
            int r7 = r0.getType()
            r12 = 38
            if (r7 == r12) goto L_0x028e
            int r7 = r0.getType()
            r12 = 39
            if (r7 == r12) goto L_0x028e
            r21 = r4
            r24 = r5
            r5 = r14
            r25 = r15
            r11 = 0
            goto L_0x03dd
        L_0x028e:
            int r7 = r0.getType()
            r12 = 38
            if (r7 != r12) goto L_0x029f
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r9.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXVideoFileObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject) r0
            java.lang.String r0 = r0.filePath
            goto L_0x02af
        L_0x029f:
            int r0 = r0.getType()
            r7 = 39
            if (r0 != r7) goto L_0x02b1
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r9.f197461u
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXGameVideoFileObject) r0
            java.lang.String r0 = r0.filePath
        L_0x02af:
            r7 = r0
            goto L_0x02b2
        L_0x02b1:
            r7 = 0
        L_0x02b2:
            r12 = -5
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)     // Catch:{ Exception -> 0x02dd }
            if (r0 != 0) goto L_0x02da
            android.content.Intent r0 = r28.getIntent()     // Catch:{ Exception -> 0x02dd }
            android.os.Bundle r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r0)     // Catch:{ Exception -> 0x02dd }
            com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs r0 = com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84995a(r0, r12)     // Catch:{ Exception -> 0x02dd }
            r21 = r4
            r4 = 0
            r12 = 1
            com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84997c(r9, r0, r12, r4)     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r0 = "isVideoFileValid file not exist!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ Exception -> 0x02d8 }
            r24 = r5
            r5 = r14
            r25 = r15
            goto L_0x037a
        L_0x02d8:
            r0 = move-exception
            goto L_0x02e0
        L_0x02da:
            r21 = r4
            goto L_0x02f4
        L_0x02dd:
            r0 = move-exception
            r21 = r4
        L_0x02e0:
            r4 = 2
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r22 = 0
            r12[r22] = r7
            java.lang.String r23 = r0.getMessage()
            r19 = 1
            r12[r19] = r23
            java.lang.String r4 = "isVideoFileValid %s error %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r4, r12)
        L_0x02f4:
            java.lang.String r0 = "OpenSdkVideoTime"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r0)
            java.lang.String r4 = r9.f197447d
            r0.encode((java.lang.String) r4, (int) r11)
            r0.apply()
            oj.c r4 = new oj.c     // Catch:{ Exception -> 0x03a7, all -> 0x03a3 }
            r4.<init>()     // Catch:{ Exception -> 0x03a7, all -> 0x03a3 }
            r4.setDataSource(r7)     // Catch:{ Exception -> 0x039c, all -> 0x0398 }
            r0 = 9
            java.lang.String r0 = r4.extractMetadata(r0)     // Catch:{ Exception -> 0x039c, all -> 0x0398 }
            r12 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)     // Catch:{ Exception -> 0x039c, all -> 0x0398 }
            java.lang.String r12 = "video duration %d, durLimit:%d"
            r24 = r5
            r25 = r15
            r5 = 2
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0395, all -> 0x0398 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0395, all -> 0x0398 }
            r22 = 0
            r15[r22] = r5     // Catch:{ Exception -> 0x0395, all -> 0x0398 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0395, all -> 0x0398 }
            r19 = 1
            r15[r19] = r5     // Catch:{ Exception -> 0x0395, all -> 0x0398 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r12, r15)     // Catch:{ Exception -> 0x0395, all -> 0x0398 }
            r5 = r14
            double r14 = (double) r0
            double r11 = (double) r11
            r26 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r11 = r11 + r26
            r26 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r11 = r11 * r26
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0381
            java.lang.String r0 = "isVideoFileValid video too long!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ Exception -> 0x037f, all -> 0x0398 }
            r0 = 2131833861(0x7f113405, float:1.9300816E38)
            java.lang.String r0 = r9.getString(r0)     // Catch:{ Exception -> 0x037f, all -> 0x0398 }
            r11 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r11)     // Catch:{ Exception -> 0x037f, all -> 0x0398 }
            r0.show()     // Catch:{ Exception -> 0x037f, all -> 0x0398 }
            android.content.Intent r0 = r28.getIntent()     // Catch:{ Exception -> 0x037f, all -> 0x0398 }
            android.os.Bundle r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r0)     // Catch:{ Exception -> 0x037f, all -> 0x0398 }
            r12 = -5
            com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs r0 = com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84995a(r0, r12)     // Catch:{ Exception -> 0x037f, all -> 0x0398 }
            r12 = 0
            com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84997c(r9, r0, r11, r12)     // Catch:{ Exception -> 0x037f, all -> 0x0398 }
            r4.release()     // Catch:{ Exception -> 0x036d }
            goto L_0x037a
        L_0x036d:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r7 = r4.getMessage()
            r0[r12] = r7
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r4, r2, r0)
        L_0x037a:
            r11 = 0
            r22 = 0
            goto L_0x03df
        L_0x037f:
            r0 = move-exception
            goto L_0x03ae
        L_0x0381:
            r4.release()     // Catch:{ Exception -> 0x0385 }
            goto L_0x03c5
        L_0x0385:
            r0 = move-exception
            r4 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r4.getMessage()
            r11 = 0
            r0[r11] = r7
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r4, r2, r0)
            goto L_0x03c5
        L_0x0395:
            r0 = move-exception
            r5 = r14
            goto L_0x03ae
        L_0x0398:
            r0 = move-exception
            r1 = r0
            goto L_0x0429
        L_0x039c:
            r0 = move-exception
            r24 = r5
            r5 = r14
            r25 = r15
            goto L_0x03ae
        L_0x03a3:
            r0 = move-exception
            r5 = 0
            goto L_0x0427
        L_0x03a7:
            r0 = move-exception
            r24 = r5
            r5 = r14
            r25 = r15
            r4 = 0
        L_0x03ae:
            java.lang.String r11 = "Analysis duration of mediaItem %s error %s"
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x0425 }
            r12 = 0
            r14[r12] = r7     // Catch:{ all -> 0x0425 }
            java.lang.String r7 = r0.getMessage()     // Catch:{ all -> 0x0425 }
            r12 = 1
            r14[r12] = r7     // Catch:{ all -> 0x0425 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r11, r14)     // Catch:{ all -> 0x0425 }
            if (r4 == 0) goto L_0x03d8
            r4.release()     // Catch:{ Exception -> 0x03c8 }
        L_0x03c5:
            r2 = 5
            r11 = 0
            goto L_0x03da
        L_0x03c8:
            r0 = move-exception
            r4 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r4.getMessage()
            r11 = 0
            r0[r11] = r7
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r4, r2, r0)
            goto L_0x03d9
        L_0x03d8:
            r11 = 0
        L_0x03d9:
            r2 = 5
        L_0x03da:
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r2)
        L_0x03dd:
            r22 = 1
        L_0x03df:
            if (r22 != 0) goto L_0x03e7
            java.lang.String r0 = "dealRequestAfterCheck VideoFile is valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            return r11
        L_0x03e7:
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            java.lang.String r2 = "kWXEntryActivity_data_center_session_id"
            r4 = 1
            eb0.v0$c r0 = r0.mo120947c(r2, r4)
            java.lang.String r2 = r8.field_appId
            java.lang.String r4 = "kWXEntryActivity_data_center_app_id"
            r0.mo120962i(r4, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.String r4 = "kWXEntryActivity_data_center_can_return_cancel"
            r0.mo120962i(r4, r2)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r1.message
            int r2 = r2.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "kWXEntryActivity_data_center_msg_type"
            r0.mo120962i(r4, r2)
            int r2 = r1.scene
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "kWXEntryActivity_data_center_scene"
            r0.mo120962i(r4, r2)
            r2 = r18
            r4 = r21
            r0 = r24
            r6 = r25
            goto L_0x0444
        L_0x0425:
            r0 = move-exception
            r5 = r4
        L_0x0427:
            r1 = r0
            r4 = r5
        L_0x0429:
            if (r4 == 0) goto L_0x043e
            r4.release()     // Catch:{ Exception -> 0x042f }
            goto L_0x043e
        L_0x042f:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r3.getMessage()
            r5 = 0
            r0[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r3, r2, r0)
        L_0x043e:
            throw r1
        L_0x043f:
            r5 = r14
            r0 = 0
            r2 = 0
            r4 = 0
            r6 = 0
        L_0x0444:
            int r7 = r1.scene
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            r14 = 2
            if (r7 != r14) goto L_0x04c5
            java.lang.String r0 = "dealRequestAfterCheck WXSceneFavorite"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r2 = r0.addFlags(r12)
            r2.addFlags(r11)
            android.os.Bundle r2 = r5.getExtras()
            r0.putExtras(r2)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = r1.message
            if (r1 == 0) goto L_0x04bb
            int r1 = r1.getType()
            r2 = 5
            if (r1 != r2) goto L_0x04bb
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = r8.field_appId
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "report(11954), appId : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app_"
            r1.append(r2)
            java.lang.String r3 = r8.field_appId
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = eb0.C86493v0.m107223a(r1)
            eb0.v0 r3 = eb0.C86493v0.m107224d()
            r4 = 1
            eb0.v0$c r3 = r3.mo120947c(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r8.field_appId
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "prePublishId"
            r3.mo120962i(r4, r2)
            java.lang.String r2 = "reportSessionId"
            r0.putExtra(r2, r1)
        L_0x04bb:
            java.lang.String r1 = "favorite"
            java.lang.String r2 = ".ui.FavOpenApiEntry"
            r3 = 0
            ke3.C88144b.m109791i(r9, r1, r2, r0, r3)
            r1 = 1
            return r1
        L_0x04c5:
            if (r29 == 0) goto L_0x0528
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r7 = r1.message
            if (r7 == 0) goto L_0x0528
            r7 = r29
            com.tencent.mm.modelsimple.i0 r7 = (com.tencent.p014mm.modelsimple.C40360i0) r7
            te3.wj4 r7 = r7.mo63047h()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r8 = r1.message
            int r8 = r8.getType()
            r14 = 7
            if (r8 != r14) goto L_0x0511
            if (r7 == 0) goto L_0x0511
            te3.l44 r8 = r7.f144099h
            if (r8 == 0) goto L_0x0511
            java.lang.String r8 = r8.f137174d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0511
            r8 = 1
            java.lang.Object[] r14 = new java.lang.Object[r8]
            te3.l44 r8 = r7.f144099h
            java.lang.String r8 = r8.f137174d
            r15 = 0
            r14[r15] = r8
            java.lang.String r8 = "change appextend to Webpage,url :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r8, r14)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r8 = r1.message
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject r14 = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject
            te3.l44 r15 = r7.f144099h
            java.lang.String r15 = r15.f137174d
            r14.<init>(r15)
            r8.mediaObject = r14
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r1.toBundle(r8)
            r5.putExtras(r8)
        L_0x0511:
            java.lang.String r1 = r7.f144110v
            if (r1 == 0) goto L_0x0528
            java.lang.String r8 = "SendAppMessageWrapper_platformSignature"
            r5.putExtra(r8, r1)
            r1 = 1
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r7 = r7.f144110v
            r14 = 0
            r8[r14] = r7
            java.lang.String r7 = "dealRequestAfterCheck platform_signature = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r7, r8)
            goto L_0x052a
        L_0x0528:
            r1 = 1
            r14 = 0
        L_0x052a:
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r1 = r9.f197448e
            r7[r14] = r1
            java.lang.String r1 = "dealRequestAfterCheck, start UIEntryStub, pkg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r7)
            boolean r1 = r9.f197451h
            java.lang.String r7 = "SendAppMessageWrapper_TokenValid"
            r5.putExtra(r7, r1)
            java.lang.String r1 = r9.f197448e
            java.lang.String r7 = "SendAppMessageWrapper_PkgName"
            r5.putExtra(r7, r1)
            java.lang.String r1 = "SendAppMessageWrapper_SkipCompressVideo"
            r5.putExtra(r1, r0)
            java.lang.String r0 = "SendAppMessageWrapper_BlockInvalidToken"
            r5.putExtra(r0, r6)
            java.lang.String r0 = "SendAppMessageWrapper_secFlagForSinglePageMode"
            r5.putExtra(r0, r2)
            java.lang.String r0 = r9.f197449f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0561
            java.lang.String r0 = r9.f197449f
            java.lang.String r1 = "key_open_sdk_token"
            r5.putExtra(r1, r0)
        L_0x0561:
            com.tencent.mm.pluginsdk.model.app.t1 r0 = r9.f197453j
            com.tencent.mm.pluginsdk.model.app.t1$a r0 = r0.f211511a
            int r0 = r0.f211519d
            java.lang.String r1 = "key_open_sdk_authentication_result"
            r5.putExtra(r1, r0)
            com.tencent.mm.pluginsdk.model.app.u1 r0 = r9.f197450g
            if (r0 == 0) goto L_0x058f
            if (r0 == 0) goto L_0x0576
            java.lang.String r3 = r0.mo100163a(r3)
        L_0x0576:
            java.lang.String r0 = "key_open_sdk_pkg_name"
            r5.putExtra(r0, r3)
            com.tencent.mm.pluginsdk.model.app.u1 r0 = r9.f197450g
            int r1 = r9.f197455o
            if (r0 == 0) goto L_0x058a
            boolean r2 = r0.f211524e
            if (r2 == 0) goto L_0x058a
            int r0 = r0.f211523d
            if (r0 <= 0) goto L_0x058a
            r1 = r0
        L_0x058a:
            java.lang.String r0 = "key_open_sdk_version"
            r5.putExtra(r0, r1)
        L_0x058f:
            java.lang.String r0 = "SendAppMessageWrapper_videoTransPara"
            r5.putExtra(r0, r4)
            if (r10 == 0) goto L_0x05a8
            java.lang.String r0 = "kWXEntryActivity_bundle_game_share_card_msgid"
            java.lang.String r1 = r10.getString(r0)
            r5.putExtra(r0, r1)
            java.lang.String r0 = "kWXEntryActivity_bundle_game_share_card_liteapp"
            android.os.Parcelable r1 = r10.getParcelable(r0)
            r5.putExtra(r0, r1)
        L_0x05a8:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.base.stub.UIEntryStub> r1 = com.tencent.p014mm.plugin.base.stub.UIEntryStub.class
            r0.<init>(r9, r1)
            android.content.Intent r0 = r0.addFlags(r12)
            android.content.Intent r0 = r0.addFlags(r11)
            android.os.Bundle r1 = r5.getExtras()
            android.content.Intent r0 = r0.putExtras(r1)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/base/stub/WXEntryActivity"
            java.lang.String r4 = "dealRequestAfterCheck"
            java.lang.String r5 = "(Lcom/tencent/mm/modelbase/NetSceneBase;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;Landroid/os/Bundle;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r28
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r10.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/base/stub/WXEntryActivity"
            java.lang.String r3 = "dealRequestAfterCheck"
            java.lang.String r4 = "(Lcom/tencent/mm/modelbase/NetSceneBase;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;Landroid/os/Bundle;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r28
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            return r1
        L_0x05fb:
            java.lang.String r0 = "dealRequestAfterCheck data invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.base.stub.WXEntryActivity.mo94560N7(ob0.y, com.tencent.mm.pluginsdk.model.app.j, android.os.Bundle):boolean");
    }

    /* renamed from: O7 */
    public final void mo94561O7() {
        ProgressDialog progressDialog = this.f197459s;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f197459s.dismiss();
        }
    }

    /* renamed from: Q7 */
    public final void mo94562Q7() {
        View findViewById = findViewById(C0966R.C0970id.j4i);
        if (findViewById == null) {
            mo94566U7();
        } else if (findViewById.getVisibility() == 8) {
            mo94566U7();
        } else {
            mo94565T7();
        }
    }

    /* renamed from: R7 */
    public final boolean mo94563R7(Intent intent) {
        this.f197455o = IntentUtil.getIntExtra(intent, ConstantsAPI.SDK_VERSION, 0);
        String stringExtra = IntentUtil.getStringExtra(intent, ConstantsAPI.CONTENT);
        this.f197458r = stringExtra;
        if (stringExtra != null) {
            Uri parse = Uri.parse(stringExtra);
            this.f197457q = parse;
            this.f197454n = parse.getAuthority();
            try {
                this.f197447d = this.f197457q.getQueryParameter("appid");
                this.f197456p = IntentUtil.getInt(getIntent().getExtras(), "_wxapi_command_type", 0);
                this.f197448e = IntentUtil.getStringExtra(intent, ConstantsAPI.APP_PACKAGE);
                this.f197449f = IntentUtil.getStringExtra(intent, ConstantsAPI.TOKEN);
                if (this.f197450g == null) {
                    this.f197450g = ((C79139p) C86312j.m106911c(C79139p.class)).c30(this.f197449f);
                }
                C72693u1 u1Var = this.f197450g;
                Log.m105925i("MicroMsg.WXEntryActivity", "init tokenData.token: %s, tokenData: %s, intent.packageName: %s, intent.openSDKVersion: %s", u1Var.f211520a, u1Var, this.f197448e, Integer.valueOf(this.f197455o));
                return true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WXEntryActivity", "init: %s", e.toString());
            }
        }
        return false;
    }

    /* renamed from: S7 */
    public final void mo94564S7(int i, int i2, String str) {
        if (C74785j2.C6981a.m7247a(this, i, i2, (String) null, 4)) {
            Log.m105924i("MicroMsg.WXEntryActivity", "mm error processor process this errcode");
            finish();
        } else if (C86718e.m107551r()) {
            Log.m105928w("MicroMsg.WXEntryActivity", "account is hold, do finish");
            finish();
        } else {
            mo94568W7(str);
        }
    }

    /* renamed from: T7 */
    public final void mo94565T7() {
        ReportUtil.m84997c(this, ReportUtil.m84995a(IntentUtil.getExtras(getIntent()), -6), true, false);
        finish();
    }

    /* renamed from: U7 */
    public final void mo94566U7() {
        ReportUtil.m84996b(this, ReportUtil.m84995a(IntentUtil.getExtras(getIntent()), -2));
        finish();
    }

    /* renamed from: V7 */
    public final void mo94567V7() {
        try {
            if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Target30_AuthenticationToast_Int, 0) == 1) {
                C76912y0.m92773l(this, this.f197450g.f211521b + "-" + this.f197453j.f211511a);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WXEntryActivity", e, "", new Object[0]);
        }
    }

    /* renamed from: W7 */
    public final void mo94568W7(String str) {
        mo94569X7(str, "");
    }

    /* renamed from: X7 */
    public final void mo94569X7(String str, String str2) {
        Map<String, String> parseXml;
        int color = getResources().getColor(C0966R.color.f356961a70);
        if (getController() != null) {
            getController().mo177105z0(color);
        }
        mo94561O7();
        View findViewById = findViewById(C0966R.C0970id.j4i);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/base/stub/WXEntryActivity", "showSpamView", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/base/stub/WXEntryActivity", "showSpamView", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setMMTitle((int) C0966R.string.j6s);
        TextView textView = (TextView) findViewById(C0966R.C0970id.jip);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.jio);
        if (!Util.isNullOrNil(str)) {
            if (str.startsWith("autoauth_errmsg_")) {
                str = str.substring(16);
            }
            if (str.startsWith("<e>") && (parseXml = XmlParser.parseXml(str, "e", (String) null)) != null && !Util.isNullOrNil(parseXml.get(".e.Content"))) {
                str = parseXml.get(".e.Content");
            }
            if (!Util.isNullOrNil(str)) {
                textView.setText(str);
            }
        }
        if (!Util.isNullOrNil(str2)) {
            textView2.setVisibility(0);
            textView2.setText(str2);
        } else {
            textView2.setVisibility(8);
        }
        Button button = (Button) findViewById(C0966R.C0970id.a39);
        String l5 = C86709a0.m107522a() ? ((C79138l) C86312j.m106911c(C79138l.class)).mo74012l5(this, this.f197447d) : "";
        Log.m105925i("MicroMsg.WXEntryActivity", "appName = %s", l5);
        if (!Util.isNullOrNil(l5)) {
            button.setText(getString(C0966R.string.j6m) + l5);
        } else {
            button.setText(C0966R.string.j6m);
        }
        button.setOnClickListener(new C68744e());
    }

    /* renamed from: Y7 */
    public final String mo94570Y7(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WXEntryActivity", "urlEncode fail, str = %s, ex = %s", str, e.getMessage());
            return str;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bv4;
    }

    public void onCreate(Bundle bundle) {
        IntentUtil.putExtra(getIntent(), "key_auto_login_wizard_exit", true);
        Log.m105924i("MicroMsg.WXEntryActivity", "onCreate");
        super.onCreate(bundle);
        setBackBtn(new C68740a());
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(1200, this);
        mo94561O7();
        Log.m105924i("MicroMsg.WXEntryActivity", "onDestroy");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0 || keyEvent.getKeyCode() != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Log.m105924i("MicroMsg.WXEntryActivity", "user click back button");
        mo94562Q7();
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.WXEntryActivity", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.WXEntryActivity", "onResume");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WXEntryActivity", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C40360i0) {
            C97625j3.m125815e().mo123470p(1200, this);
            if (this.f197460t != 49) {
                mo94561O7();
            }
            if (i == 0 && i2 == 0) {
                C40360i0 i0Var = (C40360i0) yVar;
                int i3 = i0Var.mo63047h() != null ? i0Var.mo63047h().f144100i : 0;
                Log.m105925i("MicroMsg.WXEntryActivity", "server appversion = %d", Integer.valueOf(i3));
                C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(this.f197447d, false);
                if (GW == null) {
                    Log.m105920e("MicroMsg.WXEntryActivity", "null appinfo");
                    C47000b.C34548a.m40384a().mo72193D9(this.f197447d);
                } else {
                    int i4 = GW.field_appVersion;
                    Log.m105925i("MicroMsg.WXEntryActivity", "local appversion = %d", Integer.valueOf(i4));
                    if (i4 < i3) {
                        C47000b.C34548a.m40384a().mo72193D9(this.f197447d);
                    }
                }
                int i5 = this.f197460t;
                if (i5 == 49) {
                    WXMediaMessage wXMediaMessage = this.f197461u;
                    if (wXMediaMessage != null) {
                        WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
                        if (iMediaObject instanceof WXWeWorkObject) {
                            WXWeWorkObject wXWeWorkObject = (WXWeWorkObject) iMediaObject;
                            if (wXWeWorkObject.subType == 2) {
                                C47350c.C47352b bVar = new C47350c.C47352b();
                                bVar.f127066a = new C52050y10();
                                bVar.f127067b = new C52198z10();
                                bVar.f127068c = "/cgi-bin/micromsg-bin/decryptforwardwechatmsg";
                                bVar.f127069d = 11868;
                                C47350c a = bVar.mo72403a();
                                C52050y10 y102 = (C52050y10) a.f127055a.f127080a;
                                byte[] bArr = ((WXWeWorkObject) this.f197461u.mediaObject).data;
                                if (bArr == null || bArr.length == 0) {
                                    mo94561O7();
                                    mo94568W7("");
                                } else {
                                    y102.f145069d = C89349b.m111674a(bArr);
                                    C89144l0.m111429e(a, new C68758r(this, yVar), false);
                                }
                                String str2 = wXWeWorkObject.extInfo;
                                if (!Util.isNullOrNil(str2)) {
                                    C86493v0.m107224d().mo120947c("kWXEntryActivity_data_center_session_id", true).mo120962i("kWXEntryActivity_data_center_wework_msg_file_file_info", str2);
                                    return;
                                }
                                return;
                            }
                            C47350c.C47352b bVar2 = new C47350c.C47352b();
                            bVar2.f127066a = new C48653a20();
                            bVar2.f127067b = new C48796b20();
                            bVar2.f127068c = "/cgi-bin/micromsg-bin/decryptwxworkchatrecord";
                            bVar2.f127069d = 3869;
                            C47350c a2 = bVar2.mo72403a();
                            C48653a20 a202 = (C48653a20) a2.f127055a.f127080a;
                            byte[] bArr2 = ((WXWeWorkObject) this.f197461u.mediaObject).data;
                            if (bArr2 == null || bArr2.length == 0) {
                                mo94561O7();
                                mo94568W7("");
                                return;
                            }
                            a202.f130229d = C89349b.m111674a(bArr2);
                            C89144l0.m111429e(a2, new C68759s(this, yVar), false);
                            return;
                        }
                    }
                    Log.m105921e("MicroMsg.WXEntryActivity", "onSceneEnd:error wxMsg:%s", wXMediaMessage);
                } else if (i5 == 101) {
                    ((C77050b) C86312j.m106911c(C77050b.class)).mo107303FN(this.f197447d, ((WXNativeGamePageObject) this.f197461u.mediaObject).shareData, new C68743d(yVar));
                } else {
                    mo94559M7(yVar, (Bundle) null);
                }
            } else {
                mo94564S7(i, i2, str);
            }
        }
    }
}
