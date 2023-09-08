package com.tencent.p014mm.plugin.appbrand.appusage;

import android.database.Cursor;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.d0 */
public final class C81477d0 extends MAutoStorage<C29362c0> {

    /* renamed from: e */
    public static final String[] f239069e = {MAutoStorage.getCreateSQLs(C29362c0.f80137v, "AppBrandMessInfoRecord")};

    /* renamed from: d */
    public final ISQLiteDatabase f239070d;

    static {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C29362c0.f80137v;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81477d0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29362c0.f80137v, "AppBrandMessInfoRecord", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "mDB");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C29362c0.f80137v;
        this.f239070d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final boolean mo113782Lo(String str) {
        C87412m.m108594g(str, "appId");
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C29362c0 c0Var = new C29362c0();
        c0Var.field_appId = str;
        return super.delete(c0Var, "appId");
    }

    /* renamed from: jo */
    public final boolean mo113783jo() {
        long currentTicks = Util.currentTicks();
        ArrayList arrayList = new ArrayList();
        String format = String.format(Locale.US, "select attributes.appId from %s as attributes left join %s as messInfo on attributes.appId = messInfo.appId where messInfo.%s is null", Arrays.copyOf(new Object[]{"WxaAttributesTable", getTableName(), "appId"}, 3));
        C87412m.m108593f(format, "format(locale, format, *args)");
        Cursor rawQuery = rawQuery(format, new String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(rawQuery.getString(0));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        Log.m105924i("MicroMsg.AppBrandMessInfoStorage", "uninit app service type count " + arrayList.size());
        if (arrayList.isEmpty()) {
            Log.m105924i("MicroMsg.AppBrandMessInfoStorage", "nothing to update");
            return false;
        }
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            WxaAttributes mL = C81161g2.Cx0().mo114011mL(str, "appInfo", "dynamicInfo");
            if (mL == null) {
                Log.m105924i("MicroMsg.AppBrandMessInfoStorage", "flush mess info for appId: " + str + ", but record not found in attributes");
            } else {
                C29362c0 c0Var = new C29362c0();
                c0Var.field_appId = str;
                c0Var.field_wechatPluginApp = mL.mo113940m2().f239489e;
                c0Var.field_appServiceType = mL.mo113940m2().f239488d;
                c0Var.field_maxFileStorageSize = mL.mo113941n2().f239507a.f239524l;
                z &= insert(c0Var);
            }
        }
        Log.m105925i("MicroMsg.AppBrandMessInfoStorage", "flush app service type cost: %d", Long.valueOf(Util.ticksToNow(currentTicks)));
        return z;
    }
}
