package com.tencent.p014mm.plugin.appbrand.config;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import pe3.C89349b;
import te3.n55;
import te3.o55;

/* renamed from: com.tencent.mm.plugin.appbrand.config.i */
public class C81660i extends MAutoStorage<WxaAttributes> {

    /* renamed from: d */
    public final ISQLiteDatabase f239696d;

    public C81660i(ISQLiteDatabase iSQLiteDatabase, String str, String[] strArr) {
        super(iSQLiteDatabase, WxaAttributes.f239430W0, str, strArr);
        this.f239696d = iSQLiteDatabase;
    }

    /* renamed from: kD */
    public static boolean m100160kD(String str, String str2) {
        return Util.nullAsNil(str).equals(Util.nullAsNil(str2));
    }

    /* renamed from: mI */
    public static C89349b m100161mI(WxaAttributes wxaAttributes) {
        return new C89349b(wxaAttributes == null ? new byte[0] : Util.decodeHexString(Util.nullAsNil(wxaAttributes.field_syncVersion)));
    }

    /* renamed from: DN */
    public final boolean mo113999DN(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("syncTimeSecond", 0L);
        return this.f239696d.update(getTableName(), contentValues, String.format(Locale.US, "%s=?", new Object[]{"appId"}), new String[]{str}) > 0;
    }

    /* renamed from: LL */
    public WxaAttributes mo114000LL(String str, String... strArr) {
        WxaAttributes wxaAttributes = null;
        if (Util.isNullOrNil(str) || !str.endsWith("@app")) {
            return null;
        }
        Cursor query = this.f239696d.query(getTableName(), Util.isNullOrNil(strArr) ? null : strArr, String.format(Locale.US, "%s=?", new Object[]{"usernameHash"}), new String[]{String.valueOf(str.hashCode())}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            if (query != null) {
                query.close();
            }
            return null;
        }
        try {
            if (query.moveToFirst()) {
                wxaAttributes = new WxaAttributes();
                wxaAttributes.convertFrom(query);
                wxaAttributes.field_username = str;
            }
            query.close();
            return wxaAttributes;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (r8 != -1) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        mo114007bD(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r8 != -1) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        if (r4.size() <= 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r2 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r2.addAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        doNotify(com.tencent.p014mm.sdk.storage.MStorageEventData.EventType.BATCH, 3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        return r11;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo114001Lo(int r17, te3.C49684hc r18, java.util.List<java.lang.String> r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            java.lang.String r3 = "MicroMsg.WxaAttrStorage"
            java.util.LinkedList<te3.q55> r4 = r0.f134560d
            int r4 = r4.size()
            r5 = 1
            r6 = -1
            if (r4 > r5) goto L_0x0015
            r8 = r6
            goto L_0x003e
        L_0x0015:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 == 0) goto L_0x0030
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            java.lang.Thread r8 = r8.getThread()
            if (r4 == r8) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Can not do transaction in main thread!"
            r0.<init>(r2)
            throw r0
        L_0x0030:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r1.f239696d
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            long r8 = r8.getId()
            long r8 = r4.beginTransaction(r8)
        L_0x003e:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r10 = 0
            java.util.LinkedList<te3.q55> r0 = r0.f134560d     // Catch:{ Exception -> 0x0090 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0090 }
            r11 = 0
        L_0x004b:
            boolean r12 = r0.hasNext()     // Catch:{ Exception -> 0x008c }
            if (r12 == 0) goto L_0x0084
            java.lang.Object r12 = r0.next()     // Catch:{ Exception -> 0x008c }
            te3.q55 r12 = (te3.q55) r12     // Catch:{ Exception -> 0x008c }
            java.lang.String r13 = "batchSyncInGroup, scene(%d), flushAttrs(%s)"
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x008c }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x008c }
            r14[r10] = r15     // Catch:{ Exception -> 0x008c }
            java.lang.String r15 = r12.f140158d     // Catch:{ Exception -> 0x008c }
            r14[r5] = r15     // Catch:{ Exception -> 0x008c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r14)     // Catch:{ Exception -> 0x008c }
            java.lang.String r13 = r12.f140158d     // Catch:{ Exception -> 0x008c }
            pe3.b r14 = r12.f140159e     // Catch:{ Exception -> 0x008c }
            java.util.LinkedList<te3.n55> r15 = r12.f140160f     // Catch:{ Exception -> 0x008c }
            boolean r13 = r1.mo114003SE(r13, r14, r15, r10)     // Catch:{ Exception -> 0x008c }
            r11 = r11 | r13
            if (r11 == 0) goto L_0x004b
            java.lang.String r13 = r12.f140158d     // Catch:{ Exception -> 0x008c }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x008c }
            if (r13 != 0) goto L_0x004b
            java.lang.String r12 = r12.f140158d     // Catch:{ Exception -> 0x008c }
            r4.add(r12)     // Catch:{ Exception -> 0x008c }
            goto L_0x004b
        L_0x0084:
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00a0
        L_0x0088:
            r1.mo114007bD(r8)
            goto L_0x00a0
        L_0x008c:
            r0 = move-exception
            goto L_0x0092
        L_0x008e:
            r0 = move-exception
            goto L_0x00b2
        L_0x0090:
            r0 = move-exception
            r11 = 0
        L_0x0092:
            java.lang.String r12 = "batchUpdateWithProto fail: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x008e }
            r5[r10] = r0     // Catch:{ all -> 0x008e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r12, r5)     // Catch:{ all -> 0x008e }
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00a0
            goto L_0x0088
        L_0x00a0:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x00b1
            if (r2 == 0) goto L_0x00ab
            r2.addAll(r4)
        L_0x00ab:
            r0 = 3
            java.lang.String r2 = "batch"
            r1.doNotify(r2, r0, r4)
        L_0x00b1:
            return r11
        L_0x00b2:
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00b9
            r1.mo114007bD(r8)
        L_0x00b9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.C81660i.mo114001Lo(int, te3.hc, java.util.List):boolean");
    }

    /* renamed from: Ow */
    public boolean mo114002Ow(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WxaAttrStorage", "delete with invalid username");
            return false;
        }
        WxaAttributes wxaAttributes = new WxaAttributes();
        wxaAttributes.field_username = str;
        return delete(wxaAttributes, z, new String[0]);
    }

    /* renamed from: SE */
    public boolean mo114003SE(String str, C89349b bVar, List<n55> list, boolean z) {
        if (Util.isNullOrNil((List) list)) {
            return false;
        }
        WxaAttributes wxaAttributes = new WxaAttributes();
        wxaAttributes.field_username = str;
        boolean z2 = !get(wxaAttributes, "username");
        boolean z3 = false;
        for (n55 next : list) {
            if (next != null) {
                z3 |= mo114010jo(wxaAttributes, next);
            }
        }
        wxaAttributes.field_syncTimeSecond = Util.nowSecond();
        wxaAttributes.field_syncVersion = Util.encodeHexString(bVar == null ? new byte[0] : bVar.f257327a);
        if (!z3) {
            updateNotify(wxaAttributes, false, "username");
        } else if (z2) {
            insertNotify(wxaAttributes, z);
        } else {
            updateNotify(wxaAttributes, z, "username");
        }
        return z3;
    }

    /* renamed from: TE */
    public boolean get(WxaAttributes wxaAttributes, String... strArr) {
        if (!Util.isNullOrNil(strArr)) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                } else if (strArr[i].equals("username")) {
                    strArr[i] = "usernameHash";
                    wxaAttributes.field_usernameHash = wxaAttributes.field_username.hashCode();
                    break;
                } else {
                    i++;
                }
            }
        }
        return super.get(wxaAttributes, strArr);
    }

    /* renamed from: TO */
    public final boolean updateNotify(WxaAttributes wxaAttributes, boolean z, String... strArr) {
        if (!Util.isNullOrNil(strArr)) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                } else if (strArr[i].equals("username")) {
                    strArr[i] = "usernameHash";
                    wxaAttributes.field_usernameHash = wxaAttributes.field_username.hashCode();
                    break;
                } else {
                    i++;
                }
            }
        }
        boolean updateNotify = super.updateNotify(wxaAttributes, false, strArr);
        if (updateNotify && z && !TextUtils.isEmpty(wxaAttributes.field_username)) {
            doNotify(MStorageEventData.EventType.SINGLE, 3, wxaAttributes.field_username);
        }
        return updateNotify;
    }

    /* renamed from: Yt */
    public boolean delete(WxaAttributes wxaAttributes, boolean z, String... strArr) {
        if (!Util.isNullOrNil(wxaAttributes.field_username)) {
            wxaAttributes.field_usernameHash = wxaAttributes.field_username.hashCode();
        }
        boolean delete = super.delete(wxaAttributes, false, strArr);
        if (delete && z && !TextUtils.isEmpty(wxaAttributes.field_username)) {
            doNotify(MStorageEventData.EventType.SINGLE, 5, wxaAttributes.field_username);
        }
        return delete;
    }

    /* renamed from: bD */
    public int mo114007bD(long j) {
        return this.f239696d.endTransaction(j);
    }

    /* renamed from: bF */
    public final boolean insertNotify(WxaAttributes wxaAttributes, boolean z) {
        wxaAttributes.field_usernameHash = wxaAttributes.field_username.hashCode();
        boolean z2 = false;
        super.insertNotify(wxaAttributes, false);
        if (mo114000LL(wxaAttributes.field_username, "appId") != null) {
            z2 = true;
        }
        if (z2 && z && !TextUtils.isEmpty(wxaAttributes.field_username)) {
            doNotify(MStorageEventData.EventType.SINGLE, 2, wxaAttributes.field_username);
        }
        return z2;
    }

    /* renamed from: bO */
    public boolean mo114009bO(String str, o55 o55) {
        WxaAttributes mL;
        String str2 = null;
        if (!Util.isNullOrNil(str) && (mL = mo114011mL(str, "username")) != null) {
            str2 = mL.field_username;
        }
        if (TextUtils.isEmpty(str2)) {
            Iterator<n55> it = o55.f138969e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n55 next = it.next();
                if ("UserName".equalsIgnoreCase(next.f138424d)) {
                    str2 = next.f138425e;
                    break;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                Log.m105921e("MicroMsg.WxaAttrStorage", "updateAttrsWithProto appId=%s, username EMPTY", str);
                return false;
            }
        }
        return mo114003SE(str2, o55.f138968d, o55.f138969e, true);
    }

    public void doNotify(String str, int i, Object obj) {
        super.doNotify(str, i, obj);
        new WxaAttrStorageNotifyEvent(str, i, obj).publish();
    }

    /* renamed from: jo */
    public boolean mo114010jo(WxaAttributes wxaAttributes, n55 n55) {
        int i;
        if ("NickName".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_nickname)) {
            wxaAttributes.field_nickname = Util.nullAsNil(n55.f138425e);
            return true;
        } else if ("BrandIconURL".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_brandIconURL)) {
            wxaAttributes.field_brandIconURL = n55.f138425e;
            return true;
        } else if ("BigHeadImgUrl".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_bigHeadURL)) {
            wxaAttributes.field_bigHeadURL = n55.f138425e;
            return true;
        } else if ("SmallHeadImgUrl".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_smallHeadURL)) {
            wxaAttributes.field_smallHeadURL = n55.f138425e;
            return true;
        } else if ("Signature".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_signature)) {
            wxaAttributes.field_signature = n55.f138425e;
            return true;
        } else if ("WxAppOpt".equals(n55.f138424d) && (i = Util.getInt(n55.f138425e, 0)) != wxaAttributes.field_appOpt) {
            wxaAttributes.field_appOpt = i;
            return true;
        } else if ("RegisterSource".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_registerSource)) {
            wxaAttributes.field_registerSource = n55.f138425e;
            return true;
        } else if ("WxaAppInfo".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_appInfo)) {
            wxaAttributes.field_appInfo = n55.f138425e;
            try {
                JSONObject jSONObject = new JSONObject(n55.f138425e);
                wxaAttributes.field_appId = jSONObject.getString("Appid");
                wxaAttributes.field_roundedSquareIconURL = jSONObject.getString("RoundedSquareIconUrl");
                wxaAttributes.field_shortNickname = jSONObject.optString("ShortNickName");
            } catch (Exception unused) {
            }
            return true;
        } else if ("WxaAppVersionInfo".equalsIgnoreCase(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_versionInfo)) {
            wxaAttributes.field_versionInfo = n55.f138425e;
            return true;
        } else if ("BindWxaInfo".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_bindWxaInfo)) {
            wxaAttributes.field_bindWxaInfo = n55.f138425e;
            return true;
        } else if ("WxaAppDynamic".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_dynamicInfo)) {
            wxaAttributes.field_dynamicInfo = n55.f138425e;
            return true;
        } else if ("MMBizMenu".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_bizMenu)) {
            wxaAttributes.field_bizMenu = n55.f138425e;
            return true;
        } else if ("PassThroughInfo".equals(n55.f138424d) && !m100160kD(n55.f138425e, wxaAttributes.field_passThroughInfo)) {
            wxaAttributes.field_passThroughInfo = n55.f138425e;
            return true;
        } else if (!"StablePassThroughInfo".equals(n55.f138424d) || m100160kD(n55.f138425e, wxaAttributes.field_stablePassThroughInfo)) {
            return false;
        } else {
            wxaAttributes.field_stablePassThroughInfo = n55.f138425e;
            return true;
        }
    }

    /* renamed from: mL */
    public WxaAttributes mo114011mL(String str, String... strArr) {
        WxaAttributes wxaAttributes = null;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Cursor query = this.f239696d.query(getTableName(), Util.isNullOrNil(strArr) ? null : strArr, String.format(Locale.US, "%s=?", new Object[]{"appId"}), new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            Log.m105921e("MicroMsg.WxaAttrStorage", "queryWithAppId(%s) null==cursor", str);
            return null;
        }
        if (query.moveToFirst()) {
            wxaAttributes = new WxaAttributes();
            wxaAttributes.convertFrom(query);
            wxaAttributes.field_appId = str;
        } else {
            Log.m105921e("MicroMsg.WxaAttrStorage", "queryWithAppId(%s) !cursor.moveToFirst()", str);
        }
        query.close();
        return wxaAttributes;
    }

    /* renamed from: qq */
    public boolean mo114012qq() {
        ISQLiteDatabase iSQLiteDatabase = this.f239696d;
        return iSQLiteDatabase != null && !iSQLiteDatabase.isClose();
    }
}
