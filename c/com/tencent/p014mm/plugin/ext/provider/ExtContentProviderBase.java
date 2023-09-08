package com.tencent.p014mm.plugin.ext.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import cd3.C39945b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75576f4;
import eb0.C97625j3;
import f40.C86718e;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtContentProviderBase */
public class ExtContentProviderBase extends ContentProvider {

    /* renamed from: j */
    public static boolean f269489j;

    /* renamed from: n */
    public static HashMap<String, Long> f269490n = new HashMap<>();

    /* renamed from: d */
    public MatrixCursor f269491d = new MatrixCursor(new String[0]);

    /* renamed from: e */
    public long f269492e = Util.currentTicks();

    /* renamed from: f */
    public String f269493f;

    /* renamed from: g */
    public String f269494g = "";

    /* renamed from: h */
    public String[] f269495h;

    /* renamed from: i */
    public int f269496i = 0;

    /* renamed from: com.tencent.mm.plugin.ext.provider.ExtContentProviderBase$a */
    public class C93371a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C39945b f269497d;

        /* renamed from: com.tencent.mm.plugin.ext.provider.ExtContentProviderBase$a$a */
        public class C93372a implements C75576f4.C75578b {
            public C93372a() {
            }

            /* renamed from: a */
            public void mo57753a(C114770g gVar) {
                Log.m105924i("MicroMsg.ExtContentProviderBase", "checkIsLogin() onSceneEnd()");
                C93371a.this.f269497d.mo62559a();
            }
        }

        public C93371a(ExtContentProviderBase extContentProviderBase, C39945b bVar) {
            this.f269497d = bVar;
        }

        public void run() {
            try {
                if (C97625j3.m125811a()) {
                    C97625j3.m125815e().mo123460f(new C75576f4(new C93372a(), (String) null));
                }
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.ExtContentProviderBase", "exception in NetSceneLocalProxy");
                this.f269497d.mo62559a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo128168a() {
        try {
            Log.m105924i("MicroMsg.ExtContentProviderBase", "checkIsLogin()");
            if (!f269489j) {
                C39945b bVar = new C39945b();
                bVar.mo62560b(4000, new C93371a(this, bVar));
            }
            if (!C97625j3.m125811a() || !C97625j3.m125820j() || C86718e.m107551r()) {
                f269489j = false;
            } else {
                f269489j = true;
            }
            Log.m105924i("MicroMsg.ExtContentProviderBase", "hasLogin = " + f269489j);
            return f269489j;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.ExtContentProviderBase", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ExtContentProviderBase", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public String mo128169b() {
        if (!Util.isNullOrNil(this.f269493f)) {
            return this.f269493f;
        }
        String[] strArr = this.f269495h;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[0];
    }

    /* renamed from: c */
    public void mo128170c(Uri uri, Context context, int i, String[] strArr) {
        this.f269494g = uri == null ? "" : Util.nullAsNil(uri.getQueryParameter("appid"));
        if (strArr == null) {
            mo128172e(context);
        } else {
            this.f269495h = strArr;
        }
        this.f269496i = i;
        this.f269492e = Util.currentTicks();
    }

    /* renamed from: d */
    public void mo128171d(Uri uri, Context context, UriMatcher uriMatcher) {
        this.f269494g = uri == null ? "" : Util.nullAsNil(uri.getQueryParameter("appid"));
        mo128172e(context);
        if (uriMatcher != null) {
            int match = uriMatcher.match(uri);
            this.f269496i = match;
            if (match < 0) {
                this.f269496i = 0;
            }
        }
        this.f269492e = Util.currentTicks();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: e */
    public final void mo128172e(Context context) {
        if (context == null) {
            Log.m105928w("MicroMsg.ExtContentProviderBase", "in initCallerPkgName(), context == null");
            return;
        }
        Log.m105924i("MicroMsg.ExtContentProviderBase", "Binder.getCallingUid() = " + Binder.getCallingUid());
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        this.f269495h = packagesForUid;
        if (packagesForUid == null) {
            Log.m105928w("MicroMsg.ExtContentProviderBase", "m_pkgs == null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r15.f269493f = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        r4 = 1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo128173f() {
        /*
            r15 = this;
            java.lang.String r0 = r15.f269494g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r1 = "MicroMsg.ExtContentProviderBase"
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "invalid appid, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r0 = 7
            return r0
        L_0x0011:
            java.lang.String[] r0 = r15.f269495h
            if (r0 == 0) goto L_0x0130
            int r0 = r0.length
            if (r0 > 0) goto L_0x001a
            goto L_0x0130
        L_0x001a:
            r0 = 0
            r2 = 1
            java.lang.Class<ym.l> r3 = p763ym.C79138l.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0118 }
            ym.l r3 = (p763ym.C79138l) r3     // Catch:{ Exception -> 0x0118 }
            java.lang.String r4 = r15.f269494g     // Catch:{ Exception -> 0x0118 }
            com.tencent.mm.pluginsdk.model.app.j r3 = r3.getAppInfo(r4)     // Catch:{ Exception -> 0x0118 }
            if (r3 != 0) goto L_0x0034
            java.lang.String r3 = "app not reg, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)     // Catch:{ Exception -> 0x0118 }
            r0 = 13
            return r0
        L_0x0034:
            int r4 = r3.field_status     // Catch:{ Exception -> 0x0118 }
            r5 = 3
            if (r4 != r5) goto L_0x0048
            java.lang.String r4 = "app is in blacklist.pkg:%s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0118 }
            java.lang.String r3 = r3.field_packageName     // Catch:{ Exception -> 0x0118 }
            r5[r0] = r3     // Catch:{ Exception -> 0x0118 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r5)     // Catch:{ Exception -> 0x0118 }
            r3 = 10
            goto L_0x00b5
        L_0x0048:
            java.lang.String[] r4 = r15.f269495h     // Catch:{ Exception -> 0x0118 }
            int r11 = r4.length     // Catch:{ Exception -> 0x0118 }
            r12 = 0
        L_0x004c:
            if (r12 >= r11) goto L_0x007b
            r13 = r4[r12]     // Catch:{ Exception -> 0x0118 }
            java.lang.String r5 = r3.field_packageName     // Catch:{ Exception -> 0x0118 }
            boolean r5 = r13.equals(r5)     // Catch:{ Exception -> 0x0118 }
            if (r5 == 0) goto L_0x0078
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0118 }
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r3
            r7 = r13
            boolean r5 = com.tencent.p014mm.pluginsdk.model.app.C72685h0.m85014a(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0118 }
            if (r5 == 0) goto L_0x0078
            java.lang.String r4 = "check app success, calling package name = %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0118 }
            r5[r0] = r13     // Catch:{ Exception -> 0x0118 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)     // Catch:{ Exception -> 0x0118 }
            r15.f269493f = r13     // Catch:{ Exception -> 0x0074 }
            r4 = 1
            goto L_0x007c
        L_0x0074:
            r3 = move-exception
            r4 = 1
            goto L_0x011a
        L_0x0078:
            int r12 = r12 + 1
            goto L_0x004c
        L_0x007b:
            r4 = 0
        L_0x007c:
            if (r4 != r2) goto L_0x00b4
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = wc3.C15138j.f41265a     // Catch:{ Exception -> 0x00b2 }
            int r6 = r15.f269496i     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x00b2 }
            if (r5 != 0) goto L_0x009f
            r5 = 5
            r6 = 16
            r15.mo128177j(r5, r6)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = "api flag = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)     // Catch:{ Exception -> 0x00b2 }
            r5 = 64
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00b2 }
        L_0x009f:
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x00b2 }
            boolean r3 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48994n(r3, r5)     // Catch:{ Exception -> 0x00b2 }
            if (r3 != 0) goto L_0x00ac
            r3 = 11
            goto L_0x00b5
        L_0x00ac:
            java.lang.String r3 = "appInfoFlag not set"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00b4
        L_0x00b2:
            r3 = move-exception
            goto L_0x011a
        L_0x00b4:
            r3 = r4
        L_0x00b5:
            java.util.HashMap<java.lang.String, java.lang.Long> r4 = f269490n     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = r15.f269494g     // Catch:{ Exception -> 0x0113 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0113 }
            r5 = 0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r4, (long) r5)     // Catch:{ Exception -> 0x0113 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "lastCheckTime = %s, current = %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0113 }
            r6[r0] = r4     // Catch:{ Exception -> 0x0113 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0113 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0113 }
            r6[r2] = r7     // Catch:{ Exception -> 0x0113 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r6)     // Catch:{ Exception -> 0x0113 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0113 }
            long r7 = r4.longValue()     // Catch:{ Exception -> 0x0113 }
            long r5 = r5 - r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x012f
            java.lang.String r4 = "update appInfo %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0113 }
            java.lang.String r6 = r15.f269494g     // Catch:{ Exception -> 0x0113 }
            r5[r0] = r6     // Catch:{ Exception -> 0x0113 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)     // Catch:{ Exception -> 0x0113 }
            md2.b r4 = md2.C47000b.C34548a.m40384a()     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = r15.f269494g     // Catch:{ Exception -> 0x0113 }
            r4.mo72193D9(r5)     // Catch:{ Exception -> 0x0113 }
            java.util.HashMap<java.lang.String, java.lang.Long> r4 = f269490n     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = r15.f269494g     // Catch:{ Exception -> 0x0113 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0113 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0113 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0113 }
            goto L_0x012f
        L_0x0113:
            r4 = move-exception
            r14 = r4
            r4 = r3
            r3 = r14
            goto L_0x011a
        L_0x0118:
            r3 = move-exception
            r4 = 0
        L_0x011a:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r3.getMessage()
            r2[r0] = r5
            java.lang.String r5 = "Exception in isAppidValid, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r5, r2)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r2, r0)
            r3 = r4
        L_0x012f:
            return r3
        L_0x0130:
            java.lang.String r0 = "packageList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r0 = 6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.provider.ExtContentProviderBase.mo128173f():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r13.f269493f = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        r3 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0 A[Catch:{ Exception -> 0x0105 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo128174g(android.content.Context r14) {
        /*
            r13 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.ExtContentProviderBase"
            if (r14 != 0) goto L_0x000b
            java.lang.String r14 = "in checkAppId(), context == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
            return r0
        L_0x000b:
            java.lang.String r14 = r13.f269494g
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x0019
            java.lang.String r14 = "invalid appid, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            return r0
        L_0x0019:
            java.lang.String[] r14 = r13.f269495h
            if (r14 == 0) goto L_0x011e
            int r14 = r14.length
            if (r14 > 0) goto L_0x0022
            goto L_0x011e
        L_0x0022:
            r14 = 1
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0107 }
            ym.l r2 = (p763ym.C79138l) r2     // Catch:{ Exception -> 0x0107 }
            java.lang.String r3 = r13.f269494g     // Catch:{ Exception -> 0x0107 }
            com.tencent.mm.pluginsdk.model.app.j r2 = r2.getAppInfo(r3)     // Catch:{ Exception -> 0x0107 }
            if (r2 != 0) goto L_0x0039
            java.lang.String r2 = "app not reg, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)     // Catch:{ Exception -> 0x0107 }
            return r0
        L_0x0039:
            int r3 = r2.field_status     // Catch:{ Exception -> 0x0107 }
            r4 = 3
            if (r3 != r4) goto L_0x004a
            java.lang.String r3 = "app is in blacklist.pkg:%s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0107 }
            java.lang.String r2 = r2.field_packageName     // Catch:{ Exception -> 0x0107 }
            r4[r0] = r2     // Catch:{ Exception -> 0x0107 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r4)     // Catch:{ Exception -> 0x0107 }
            goto L_0x00a0
        L_0x004a:
            java.lang.String[] r3 = r13.f269495h     // Catch:{ Exception -> 0x0107 }
            int r10 = r3.length     // Catch:{ Exception -> 0x0107 }
            r11 = 0
        L_0x004e:
            if (r11 >= r10) goto L_0x007d
            r12 = r3[r11]     // Catch:{ Exception -> 0x0107 }
            java.lang.String r4 = r2.field_packageName     // Catch:{ Exception -> 0x0107 }
            boolean r4 = r12.equals(r4)     // Catch:{ Exception -> 0x0107 }
            if (r4 == 0) goto L_0x007a
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0107 }
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r2
            r6 = r12
            boolean r4 = com.tencent.p014mm.pluginsdk.model.app.C72685h0.m85014a(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0107 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r3 = "check app success, calling package name = %s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0107 }
            r4[r0] = r12     // Catch:{ Exception -> 0x0107 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)     // Catch:{ Exception -> 0x0107 }
            r13.f269493f = r12     // Catch:{ Exception -> 0x0076 }
            r3 = 1
            goto L_0x007e
        L_0x0076:
            r2 = move-exception
            r3 = 1
            goto L_0x0109
        L_0x007a:
            int r11 = r11 + 1
            goto L_0x004e
        L_0x007d:
            r3 = 0
        L_0x007e:
            if (r3 == 0) goto L_0x00a7
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r4 = wc3.C15138j.f41265a     // Catch:{ Exception -> 0x0105 }
            int r5 = r13.f269496i     // Catch:{ Exception -> 0x0105 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0105 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0105 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0105 }
            if (r4 != 0) goto L_0x0096
            r4 = 64
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0105 }
        L_0x0096:
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0105 }
            boolean r2 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48994n(r2, r4)     // Catch:{ Exception -> 0x0105 }
            if (r2 != 0) goto L_0x00a2
        L_0x00a0:
            r3 = 0
            goto L_0x00a7
        L_0x00a2:
            java.lang.String r2 = "appInfoFlag not set"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ Exception -> 0x0105 }
        L_0x00a7:
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = f269490n     // Catch:{ Exception -> 0x0105 }
            java.lang.String r4 = r13.f269494g     // Catch:{ Exception -> 0x0105 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x0105 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x0105 }
            r4 = 0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r2, (long) r4)     // Catch:{ Exception -> 0x0105 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0105 }
            java.lang.String r4 = "lastCheckTime = %s, current = %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0105 }
            r5[r0] = r2     // Catch:{ Exception -> 0x0105 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0105 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0105 }
            r5[r14] = r6     // Catch:{ Exception -> 0x0105 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)     // Catch:{ Exception -> 0x0105 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0105 }
            long r6 = r2.longValue()     // Catch:{ Exception -> 0x0105 }
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x011d
            java.lang.String r2 = "update appInfo %s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0105 }
            java.lang.String r5 = r13.f269494g     // Catch:{ Exception -> 0x0105 }
            r4[r0] = r5     // Catch:{ Exception -> 0x0105 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ Exception -> 0x0105 }
            md2.b r2 = md2.C47000b.C34548a.m40384a()     // Catch:{ Exception -> 0x0105 }
            java.lang.String r4 = r13.f269494g     // Catch:{ Exception -> 0x0105 }
            r2.mo72193D9(r4)     // Catch:{ Exception -> 0x0105 }
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = f269490n     // Catch:{ Exception -> 0x0105 }
            java.lang.String r4 = r13.f269494g     // Catch:{ Exception -> 0x0105 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0105 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0105 }
            r2.put(r4, r5)     // Catch:{ Exception -> 0x0105 }
            goto L_0x011d
        L_0x0105:
            r2 = move-exception
            goto L_0x0109
        L_0x0107:
            r2 = move-exception
            r3 = 0
        L_0x0109:
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r4 = r2.getMessage()
            r14[r0] = r4
            java.lang.String r4 = "Exception in isAppidValid, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r14)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String r0 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r14)
        L_0x011d:
            return r3
        L_0x011e:
            java.lang.String r14 = "packageList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.provider.ExtContentProviderBase.mo128174g(android.content.Context):boolean");
    }

    public String getType(Uri uri) {
        return null;
    }

    /* renamed from: h */
    public void mo128175h(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", mo128169b(), this.f269494g, Integer.valueOf(this.f269496i), Integer.valueOf(i2), Integer.valueOf(mo128178k()));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(10505, mo128169b(), this.f269494g, Integer.valueOf(this.f269496i), Integer.valueOf(i2), Integer.valueOf(mo128178k()), Integer.valueOf(i3));
        nVar.idkeyStat(300, (long) i, 1, false);
    }

    /* renamed from: i */
    public void mo128176i(int i) {
        Log.m105925i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", mo128169b(), this.f269494g, Integer.valueOf(this.f269496i), Integer.valueOf(i), Integer.valueOf(mo128178k()));
        C115669n.INSTANCE.mo160131h(10505, mo128169b(), this.f269494g, Integer.valueOf(this.f269496i), Integer.valueOf(i), Integer.valueOf(mo128178k()));
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: j */
    public void mo128177j(int i, int i2) {
        Log.m105925i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", mo128169b(), this.f269494g, Integer.valueOf(this.f269496i), Integer.valueOf(i), Integer.valueOf(mo128178k()));
        C115669n.INSTANCE.mo160131h(10505, mo128169b(), this.f269494g, Integer.valueOf(this.f269496i), Integer.valueOf(i), Integer.valueOf(mo128178k()), Integer.valueOf(i2));
    }

    /* renamed from: k */
    public int mo128178k() {
        return (int) Util.ticksToNow(this.f269492e);
    }

    public boolean onCreate() {
        return !(this instanceof ExtControlProviderSNS);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
