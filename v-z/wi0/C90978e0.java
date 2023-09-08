package wi0;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C29362c0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81477d0;
import com.tencent.p014mm.plugin.appbrand.config.C81660i;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import p749xh.C91206ia;
import pe3.C89349b;
import te3.n55;
import wi0.C91000y;
import zt3.C119157j;

/* renamed from: wi0.e0 */
public class C90978e0 extends C81660i {

    /* renamed from: wi0.e0$b */
    public class C66116b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f190034d;

        /* renamed from: e */
        public final /* synthetic */ String f190035e;

        public C66116b(C90978e0 e0Var, String str, String str2) {
            this.f190034d = str;
            this.f190035e = str2;
        }

        public void run() {
            try {
                C90992p.m114160b(this.f190035e, C66118w.m77934a(new JSONObject(this.f190034d)).f184619d, true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: wi0.e0$a */
    public class C90979a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f261053d;

        public C90979a(String str) {
            this.f261053d = str;
        }

        public void run() {
            try {
                WxaAttributes LL = C90978e0.this.mo114000LL(this.f261053d, "appId", "versionInfo", "nickname", "bigHeadURL", "smallHeadURL", "appInfo", "dynamicInfo");
                if (LL != null) {
                    C90978e0.this.mo125055uP(LL);
                    C90978e0.m114138nP(C90978e0.this, LL);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WxaAttrStorageWC", e, "flushContactInMainDB", new Object[0]);
            }
        }
    }

    public C90978e0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, "WxaAttributesTable", C91206ia.f261520D);
        if (mo114012qq()) {
            C72994y1.C72995a aVar = C72994y1.C72995a.APPBRAND_SHORTCUT_URL_UPGRADE_FIXED_BOOLEAN_SYNC;
            if (!C86709a0.m107535s().mo121142i().mo119686g(aVar, false)) {
                Log.m105924i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "before fix");
                Cursor rawQuery = iSQLiteDatabase.rawQuery("select appInfo from WxaAttributesTable", (String[]) null, 2);
                if (rawQuery == null || rawQuery.isClosed()) {
                    Log.m105920e("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "try fix but db not working");
                    return;
                }
                if (rawQuery.moveToFirst()) {
                    LinkedList<Pair> linkedList = new LinkedList<>();
                    do {
                        String string = rawQuery.getString(0);
                        if (!Util.isNullOrNil(string)) {
                            try {
                                JSONObject jSONObject = new JSONObject(string);
                                String optString = jSONObject.optString("Appid");
                                String optString2 = jSONObject.optString("RoundedSquareIconUrl");
                                if (!Util.isNullOrNil(optString)) {
                                    if (!Util.isNullOrNil(optString2)) {
                                        ContentValues contentValues = new ContentValues(1);
                                        contentValues.put("roundedSquareIconURL", optString2);
                                        linkedList.add(Pair.create(optString, contentValues));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } while (rawQuery.moveToNext());
                    rawQuery.close();
                    long beginTransaction = iSQLiteDatabase.beginTransaction(Thread.currentThread().getId());
                    for (Pair pair : linkedList) {
                        iSQLiteDatabase.update("WxaAttributesTable", (ContentValues) pair.second, "appId=?", new String[]{(String) pair.first});
                    }
                    iSQLiteDatabase.endTransaction(beginTransaction);
                    Log.m105924i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "fix done");
                } else {
                    Log.m105924i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "no contacts available");
                }
                if (!rawQuery.isClosed()) {
                    rawQuery.close();
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            }
        }
    }

    /* renamed from: nP */
    public static void m114138nP(C90978e0 e0Var, WxaAttributes wxaAttributes) {
        e0Var.getClass();
        if (C86709a0.m107522a()) {
            C29362c0 c0Var = new C29362c0();
            if (Util.isNullOrNil(wxaAttributes.field_appId)) {
                Log.m105928w("MicroMsg.WxaAttrStorageWC", "update mess info, appId is null");
                return;
            }
            c0Var.field_appId = wxaAttributes.field_appId;
            try {
                JSONObject jSONObject = new JSONObject(wxaAttributes.field_appInfo);
                c0Var.field_wechatPluginApp = jSONObject.optInt("WechatPluginApp", 0);
                c0Var.field_appServiceType = jSONObject.optInt("AppServiceType", 0);
            } catch (Exception e) {
                Log.m105929w("MicroMsg.WxaAttrStorageWC", "parse app info json error", e);
            }
            try {
                JSONObject optJSONObject = new JSONObject(wxaAttributes.field_dynamicInfo).optJSONObject("NewSetting");
                if (optJSONObject != null) {
                    c0Var.field_maxFileStorageSize = optJSONObject.optInt("Uint32MaxFileStorageSizeInMB", 10);
                } else {
                    Log.m105928w("MicroMsg.WxaAttrStorageWC", "can't fetch new setting field from json");
                }
            } catch (Exception e2) {
                Log.m105929w("MicroMsg.WxaAttrStorageWC", "parse dynamic info json error", e2);
            }
            C81477d0 d0Var = (C81477d0) C81161g2.Bx0(C81477d0.class);
            d0Var.getClass();
            if (Util.isNullOrNil(c0Var.field_appId)) {
                Log.m105924i("MicroMsg.AppBrandMessInfoStorage", "update info, appId is null");
                return;
            }
            boolean z = d0Var.get(c0Var, new String[0]);
            c0Var.field_appId = c0Var.field_appId;
            c0Var.field_wechatPluginApp = c0Var.field_wechatPluginApp;
            c0Var.field_appServiceType = c0Var.field_appServiceType;
            c0Var.field_maxFileStorageSize = c0Var.field_maxFileStorageSize;
            if (z) {
                d0Var.update(c0Var, new String[0]);
            } else {
                d0Var.insert(c0Var);
            }
        }
    }

    /* renamed from: SE */
    public boolean mo114003SE(String str, C89349b bVar, List<n55> list, boolean z) {
        if (!C86709a0.m107523b().f251765p) {
            Log.m105921e("MicroMsg.WxaAttrStorageWC", "flushAttrs username[%s], account().isInitializedNotifyAllDone()==FALSE", str);
            return false;
        }
        boolean SE = super.mo114003SE(str, bVar, list, z);
        if (SE) {
            ((C119157j) C119157j.f356862d).mo183876g(new C90979a(str), "MicroMsg.WxaAttrStorageWCTHREAD_TAG_POST_FLUSH_ATTRS");
        }
        return SE;
    }

    /* renamed from: Yt */
    public boolean delete(WxaAttributes wxaAttributes, boolean z, String... strArr) {
        WxaAttributes wxaAttributes2;
        if (!Util.isNullOrNil(wxaAttributes.field_username)) {
            wxaAttributes.field_usernameHash = wxaAttributes.field_username.hashCode();
            wxaAttributes2 = mo114000LL(wxaAttributes.field_username, "appId");
        } else {
            wxaAttributes2 = null;
        }
        boolean Yt = super.delete(wxaAttributes, z, strArr);
        if (Yt && wxaAttributes2 != null && !Util.isNullOrNil(wxaAttributes2.field_appId)) {
            ((C81477d0) C81161g2.Bx0(C81477d0.class)).mo113782Lo(wxaAttributes2.field_appId);
        }
        return Yt;
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        super.add("MicroMsg.WxaAttrStorageWC.WORKER", iOnStorageChange);
    }

    /* renamed from: jo */
    public boolean mo114010jo(WxaAttributes wxaAttributes, n55 n55) {
        boolean jo = super.mo114010jo(wxaAttributes, n55);
        if (jo && "WxaAppInfo".equals(n55.f138424d)) {
            String str = wxaAttributes.field_appId;
            String str2 = n55.f138425e;
            ((C119157j) C119157j.f356862d).mo183876g(new C66116b(this, str2, str), "MicroMsg.WxaAttrStorageWCTHREAD_TAG_POST_FLUSH_ATTRS");
        } else if (jo && "PassThroughInfo".equals(n55.f138424d) && !TextUtils.isEmpty(n55.f138425e)) {
            try {
                String optString = new JSONObject(n55.f138425e).optString("expt_info");
                if (!TextUtils.isEmpty(optString)) {
                    ((C91000y) C81161g2.Bx0(C91000y.class)).mo125063Yt(wxaAttributes.field_appId, optString, C91000y.C91001a.WxaAttr);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WxaAttrStorageWC", "try updateExptInfo from attr(%s), get exception:%s", wxaAttributes.field_appId, e);
            }
        }
        return jo;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:23|24|25|26|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x009c */
    /* renamed from: uP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo125055uP(com.tencent.p014mm.plugin.appbrand.config.WxaAttributes r12) {
        /*
            r11 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.Class<ln.g> r1 = p196ln.C76706g.class
            boolean r2 = f40.C86709a0.m107522a()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r2 = r12.field_username
            java.lang.String r3 = r12.field_nickname
            java.lang.String r4 = r12.field_bigHeadURL
            java.lang.String r12 = r12.field_smallHeadURL
            di3.d r5 = di3.C86312j.m106911c(r1)
            ln.g r5 = (p196ln.C76706g) r5
            ln.n r5 = r5.mo106832eg()
            com.tencent.mm.modelavatar.o r5 = (com.tencent.p014mm.modelavatar.C68098o) r5
            com.tencent.mm.modelavatar.n r5 = r5.mo93607Lo(r2)
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x002e
            com.tencent.mm.modelavatar.n r5 = new com.tencent.mm.modelavatar.n
            r5.<init>()
            r8 = 1
            goto L_0x002f
        L_0x002e:
            r8 = 0
        L_0x002f:
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            java.lang.String r10 = r5.mo93597f()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0040
            r5.f195731d = r12
            r8 = 1
        L_0x0040:
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            java.lang.String r9 = r5.mo93594c()
            boolean r12 = r12.equals(r9)
            if (r12 != 0) goto L_0x0051
            r5.f195732e = r4
            r8 = 1
        L_0x0051:
            if (r8 == 0) goto L_0x006a
            r5.f195728a = r2
            r5.f195733f = r7
            r12 = 31
            r5.f195736i = r12
            di3.d r12 = di3.C86312j.m106911c(r1)
            ln.g r12 = (p196ln.C76706g) r12
            ln.n r12 = r12.mo106832eg()
            com.tencent.mm.modelavatar.o r12 = (com.tencent.p014mm.modelavatar.C68098o) r12
            r12.mo93608Yt(r5)
        L_0x006a:
            k40.a r12 = f40.C86709a0.m107533q(r0)
            f62.k0 r12 = (f62.C75700k0) r12
            com.tencent.mm.storage.u3 r12 = r12.mo96097Ni()
            com.tencent.mm.storage.z1 r12 = r12.get(r2)
            if (r12 != 0) goto L_0x007f
            com.tencent.mm.storage.z1 r12 = new com.tencent.mm.storage.z1
            r12.<init>()
        L_0x007f:
            long r4 = r12.f108320R1
            int r1 = (int) r4
            if (r1 != 0) goto L_0x0088
            r12.setUsername(r2)
            r6 = 1
        L_0x0088:
            java.lang.String r1 = r12.getNickname()
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x00a6
            r12.mo62878U2(r3)
            java.lang.String r1 = sf0.C77691f.m93687b(r3)     // Catch:{ UnsatisfiedLinkError -> 0x009c }
            r12.mo62882W2(r1)     // Catch:{ UnsatisfiedLinkError -> 0x009c }
        L_0x009c:
            java.lang.String r1 = sf0.C77691f.m93686a(r3)     // Catch:{ UnsatisfiedLinkError -> 0x00a4 }
            r12.mo62884X2(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00a4 }
            goto L_0x00a7
        L_0x00a4:
            goto L_0x00a7
        L_0x00a6:
            r7 = r6
        L_0x00a7:
            if (r7 == 0) goto L_0x00b6
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            r0.mo69704i3(r12)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wi0.C90978e0.mo125055uP(com.tencent.mm.plugin.appbrand.config.WxaAttributes):void");
    }
}
