package com.tencent.p014mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import cd3.C39945b;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.autogen.events.ExtCursorForTimeLineEvent;
import com.tencent.p014mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.ext.key.AESUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75576f4;
import eb0.C75592q0;
import eb0.C97625j3;
import zh3.C119117d;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS */
public final class ExtControlProviderSNS extends ExtContentProviderBase {

    /* renamed from: r */
    public static final String[] f269534r = {"feedId", "desc", "url", "nickname", "avatar", AppMeasurement.Param.TIMESTAMP, "mediaCount", "type", "bigImgUrl", "firstImgWidth", "firstImgHeight"};

    /* renamed from: s */
    public static final UriMatcher f269535s;

    /* renamed from: t */
    public static boolean f269536t = false;

    /* renamed from: u */
    public static MTimerHandler f269537u = new MTimerHandler(new C93376a(), false);

    /* renamed from: o */
    public boolean f269538o = false;

    /* renamed from: p */
    public boolean f269539p = false;

    /* renamed from: q */
    public String f269540q = "";

    /* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS$a */
    public class C93376a implements MTimerHandler.CallBack {
        public boolean onTimerExpired() {
            ExtControlProviderSNS.f269536t = false;
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS$b */
    public class C93377b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72996z1 f269541d;

        /* renamed from: e */
        public final /* synthetic */ C39945b f269542e;

        /* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS$b$a */
        public class C93378a implements C75576f4.C75578b {
            public C93378a() {
            }

            /* renamed from: a */
            public void mo57753a(C114770g gVar) {
                C93377b.this.f269542e.mo62559a();
            }
        }

        public C93377b(C72996z1 z1Var, C39945b bVar) {
            this.f269541d = z1Var;
            this.f269542e = bVar;
        }

        public void run() {
            ExtStartSnsServerAndCallbackOnFpSetSizeEvent extStartSnsServerAndCallbackOnFpSetSizeEvent = new ExtStartSnsServerAndCallbackOnFpSetSizeEvent();
            ExtStartSnsServerAndCallbackOnFpSetSizeEvent.C92504a aVar = extStartSnsServerAndCallbackOnFpSetSizeEvent.f264795d;
            aVar.f264796a = 1;
            aVar.f264797b = this.f269541d.getUsername();
            ExtStartSnsServerAndCallbackOnFpSetSizeEvent.C92504a aVar2 = extStartSnsServerAndCallbackOnFpSetSizeEvent.f264795d;
            ExtControlProviderSNS extControlProviderSNS = ExtControlProviderSNS.this;
            aVar2.f264798c = extControlProviderSNS.f269538o;
            aVar2.f264799d = extControlProviderSNS.f269539p;
            aVar2.f264800e = new C93378a();
            extStartSnsServerAndCallbackOnFpSetSizeEvent.publish();
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f269535s = uriMatcher;
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_SNS(), "snsInfo", 17);
    }

    /* renamed from: m */
    public static void m117936m(boolean z) {
        if (z) {
            f269536t = true;
            f269537u.startTimer(15000);
            return;
        }
        f269537u.startTimer(0);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0126 A[Catch:{ Exception -> 0x0169 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128184l(android.database.Cursor r17, zh3.C119117d r18, boolean r19) {
        /*
            r16 = this;
            r0 = r17
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent r1 = new com.tencent.mm.autogen.events.ExtGetSnsDataEvent
            r1.<init>()
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$a r2 = r1.f264756d
            r2.f264758a = r0
            boolean r0 = r1.publish()
            java.lang.String r2 = "MicroMsg.ExtControlProviderSNS"
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "ExtGetSnsDataEvent publish error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            return
        L_0x001c:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r3 = r1.f264757e
            java.lang.String r3 = r3.f264759a
            com.tencent.mm.storage.z1 r0 = r0.mo69664N2(r3)
            if (r0 == 0) goto L_0x0176
            long r3 = r0.f108320R1
            int r4 = (int) r3
            if (r4 > 0) goto L_0x0035
            goto L_0x0176
        L_0x0035:
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r3 = r1.f264757e
            int r4 = r3.f264763e
            r5 = 8
            r6 = 7
            r7 = 5
            r8 = 4
            r9 = 6
            r10 = 1
            r11 = 3
            r12 = 2
            if (r4 == r10) goto L_0x005e
            if (r4 == r12) goto L_0x005c
            if (r4 == r11) goto L_0x005a
            if (r4 == r8) goto L_0x0058
            if (r4 == r7) goto L_0x0056
            if (r4 == r6) goto L_0x005e
            if (r4 == r5) goto L_0x005e
            r13 = 42
            if (r4 == r13) goto L_0x0058
            r4 = 5
            goto L_0x005f
        L_0x0056:
            r4 = 4
            goto L_0x005f
        L_0x0058:
            r4 = 3
            goto L_0x005f
        L_0x005a:
            r4 = 6
            goto L_0x005f
        L_0x005c:
            r4 = 1
            goto L_0x005f
        L_0x005e:
            r4 = 2
        L_0x005f:
            java.util.List r3 = r3.f264765g
            java.lang.String r13 = ""
            r14 = 0
            if (r3 == 0) goto L_0x00a1
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x00a1
            android.content.Context r3 = r16.getContext()
            if (r3 == 0) goto L_0x00a1
            java.lang.Object[] r3 = new java.lang.Object[r10]
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r15 = r1.f264757e
            java.util.List r15 = r15.f264765g
            java.util.LinkedList r15 = (java.util.LinkedList) r15
            int r15 = r15.size()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r3[r14] = r15
            java.lang.String r15 = "uris.size() = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r15, r3)
            if (r4 == r12) goto L_0x0094
            if (r4 == r9) goto L_0x0094
            if (r4 == r11) goto L_0x0094
            if (r4 != r8) goto L_0x00a1
        L_0x0094:
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r3 = r1.f264757e
            java.util.List r3 = r3.f264765g
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            java.lang.Object r3 = r3.get(r14)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x00a2
        L_0x00a1:
            r3 = r13
        L_0x00a2:
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r15 = r1.f264757e
            java.util.List r15 = r15.f264766h
            if (r15 == 0) goto L_0x00f6
            java.util.LinkedList r15 = (java.util.LinkedList) r15
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x00f6
            android.content.Context r15 = r16.getContext()
            if (r15 == 0) goto L_0x00f6
            java.lang.Object[] r15 = new java.lang.Object[r11]
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r5 = r1.f264757e
            java.util.List r5 = r5.f264766h
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15[r14] = r5
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r5 = r1.f264757e
            int r5 = r5.f264767i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15[r10] = r5
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r5 = r1.f264757e
            int r5 = r5.f264768j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15[r12] = r5
            java.lang.String r5 = "bigImgUris.size() = [%s], firstImgWidth = [%s], firstImgHeight = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r15)
            if (r4 == r12) goto L_0x00e9
            if (r4 == r9) goto L_0x00e9
            if (r4 == r11) goto L_0x00e9
            if (r4 != r8) goto L_0x00f6
        L_0x00e9:
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r5 = r1.f264757e
            java.util.List r5 = r5.f264766h
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            java.lang.Object r5 = r5.get(r14)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00f7
        L_0x00f6:
            r5 = r13
        L_0x00f7:
            java.lang.Class<ln.i> r15 = p196ln.C76708i.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            ln.i r15 = (p196ln.C76708i) r15
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r6 = r1.f264757e
            java.lang.String r6 = r6.f264759a
            java.lang.String r6 = r15.mo106845oX(r6, r14)
            r15 = 11
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0169 }
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r9 = r1.f264757e     // Catch:{ Exception -> 0x0169 }
            int r9 = r9.f264760b     // Catch:{ Exception -> 0x0169 }
            long r7 = (long) r9     // Catch:{ Exception -> 0x0169 }
            java.lang.String r7 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105053b(r7)     // Catch:{ Exception -> 0x0169 }
            r15[r14] = r7     // Catch:{ Exception -> 0x0169 }
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r7 = r1.f264757e     // Catch:{ Exception -> 0x0169 }
            java.lang.String r7 = r7.f264761c     // Catch:{ Exception -> 0x0169 }
            r15[r10] = r7     // Catch:{ Exception -> 0x0169 }
            r15[r12] = r3     // Catch:{ Exception -> 0x0169 }
            java.lang.String r0 = r0.mo62898f()     // Catch:{ Exception -> 0x0169 }
            r15[r11] = r0     // Catch:{ Exception -> 0x0169 }
            if (r6 != 0) goto L_0x0127
            r6 = r13
        L_0x0127:
            r0 = 4
            r15[r0] = r6     // Catch:{ Exception -> 0x0169 }
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r0 = r1.f264757e     // Catch:{ Exception -> 0x0169 }
            long r6 = r0.f264762d     // Catch:{ Exception -> 0x0169 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0169 }
            r3 = 5
            r15[r3] = r0     // Catch:{ Exception -> 0x0169 }
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r0 = r1.f264757e     // Catch:{ Exception -> 0x0169 }
            int r0 = r0.f264764f     // Catch:{ Exception -> 0x0169 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0169 }
            r3 = 6
            r15[r3] = r0     // Catch:{ Exception -> 0x0169 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0169 }
            r3 = 7
            r15[r3] = r0     // Catch:{ Exception -> 0x0169 }
            r0 = 8
            r15[r0] = r5     // Catch:{ Exception -> 0x0169 }
            r0 = 9
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r3 = r1.f264757e     // Catch:{ Exception -> 0x0169 }
            int r3 = r3.f264767i     // Catch:{ Exception -> 0x0169 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0169 }
            r15[r0] = r3     // Catch:{ Exception -> 0x0169 }
            r0 = 10
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r1 = r1.f264757e     // Catch:{ Exception -> 0x0169 }
            int r1 = r1.f264768j     // Catch:{ Exception -> 0x0169 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0169 }
            r15[r0] = r1     // Catch:{ Exception -> 0x0169 }
            r0 = r18
            r0.mo183794a(r15)     // Catch:{ Exception -> 0x0169 }
            goto L_0x0176
        L_0x0169:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r13, r1)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.provider.ExtControlProviderSNS.mo128184l(android.database.Cursor, zh3.d, boolean):void");
    }

    /* renamed from: n */
    public final boolean mo128185n(long j) {
        Log.m105925i("MicroMsg.ExtControlProviderSNS", "startGetSNSInfo, userId=[%s]", Long.valueOf(j));
        C72996z1 N2 = j == 0 ? C97625j3.m125812b().mo105907v().mo69664N2(C75592q0.m90789s()) : C97625j3.m125812b().mo105907v().mo69694e4(j);
        if (N2 == null || ((int) N2.f108320R1) <= 0) {
            Log.m105920e("MicroMsg.ExtControlProviderSNS", "ct == null");
            return false;
        }
        this.f269538o = N2.mo62927s3();
        this.f269539p = C75592q0.m90764L(N2.getUsername());
        Log.m105919d("MicroMsg.ExtControlProviderSNS", "ct.getUsername()=[%s], isFriend=[%s], isSelf=[%s]", N2.getUsername(), Boolean.valueOf(this.f269538o), Boolean.valueOf(this.f269539p));
        C39945b bVar = new C39945b();
        bVar.mo62560b(10000, new C93377b(N2, bVar));
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Log.m105924i("MicroMsg.ExtControlProviderSNS", "query() " + uri);
        Context context = getContext();
        UriMatcher uriMatcher = f269535s;
        mo128171d(uri, context, uriMatcher);
        C119117d dVar = null;
        if (uri == null) {
            mo128176i(3);
            return null;
        } else if (Util.isNullOrNil(this.f269494g) || Util.isNullOrNil(mo128169b())) {
            mo128176i(3);
            return null;
        } else if (f269536t) {
            Log.m105928w("MicroMsg.ExtControlProviderSNS", "isBusy, return null");
            mo128176i(5);
            return null;
        } else {
            m117936m(true);
            if (!mo128168a()) {
                m117936m(false);
                mo128176i(1);
                return this.f269491d;
            } else if (!mo128174g(getContext())) {
                Log.m105928w("MicroMsg.ExtControlProviderSNS", "invalid appid ! return null");
                m117936m(false);
                mo128176i(2);
                return null;
            } else if (strArr2 == null || strArr2.length == 0) {
                Log.m105920e("MicroMsg.ExtControlProviderSNS", "invaild selections");
                m117936m(false);
                mo128176i(3);
                return null;
            } else {
                String str3 = strArr2[0];
                if (Util.isNullOrNil(str3)) {
                    Log.m105920e("MicroMsg.ExtControlProviderSNS", "userIdStr should not be null or nil");
                    m117936m(false);
                    mo128176i(3);
                    return null;
                }
                try {
                    long longValue = "0".equals(str3.trim()) ? 0 : Long.valueOf(AESUtil.m105052a(str3.trim())).longValue();
                    if (uriMatcher.match(uri) == 17) {
                        Log.m105924i("MicroMsg.ExtControlProviderSNS", "handleGetSnsInfo() userId = " + longValue);
                        try {
                            if (!mo128185n(longValue)) {
                                Log.m105928w("MicroMsg.ExtControlProviderSNS", "startGetSNSInfo() return false");
                            }
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.ExtControlProviderSNS", e.getMessage());
                            Log.printErrStackTrace("MicroMsg.ExtControlProviderSNS", e, "", new Object[0]);
                        }
                        Log.m105924i("MicroMsg.ExtControlProviderSNS", "getSnsCursor() , needDownload = true");
                        C119117d dVar2 = new C119117d(f269534r);
                        ExtCursorForTimeLineEvent extCursorForTimeLineEvent = new ExtCursorForTimeLineEvent();
                        extCursorForTimeLineEvent.f264752d.f264754a = this.f269540q;
                        if (!extCursorForTimeLineEvent.publish()) {
                            dVar2.close();
                        } else {
                            Cursor cursor = extCursorForTimeLineEvent.f264753e.f264755a;
                            if (cursor != null) {
                                try {
                                    int count = cursor.getCount();
                                    Log.m105924i("MicroMsg.ExtControlProviderSNS", "in getSnsCursor(), snsCount = " + count);
                                    if (count <= 0 || !cursor.moveToFirst()) {
                                        Log.m105924i("MicroMsg.ExtControlProviderSNS", "in getSnsCursor(), matrixCursor Count = " + dVar2.f356724f);
                                        cursor.close();
                                    } else {
                                        do {
                                            mo128184l(cursor, dVar2, true);
                                        } while (cursor.moveToNext());
                                        Log.m105924i("MicroMsg.ExtControlProviderSNS", "in getSnsCursor(), matrixCursor Count = " + dVar2.f356724f);
                                        cursor.close();
                                    }
                                } catch (Exception e2) {
                                    Log.m105920e("MicroMsg.ExtControlProviderSNS", e2.getMessage());
                                    Log.printErrStackTrace("MicroMsg.ExtControlProviderSNS", e2, "", new Object[0]);
                                    cursor.close();
                                    dVar2.close();
                                }
                            }
                            dVar = dVar2;
                        }
                    }
                    if (dVar != null) {
                        mo128176i(0);
                    } else {
                        mo128176i(4);
                    }
                    m117936m(false);
                    return dVar;
                } catch (Exception e3) {
                    Log.m105920e("MicroMsg.ExtControlProviderSNS", e3.getMessage());
                    Log.printErrStackTrace("MicroMsg.ExtControlProviderSNS", e3, "", new Object[0]);
                    m117936m(false);
                    mo128176i(4);
                    return null;
                }
            }
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
