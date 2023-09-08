package wi0;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.appbrand.app.b$$h0;
import com.tencent.p014mm.plugin.appbrand.config.C81660i;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p170ic.C87690d;

/* renamed from: wi0.b0 */
public final class C90975b0 extends C81660i {

    /* renamed from: f */
    public static final String[] f261050f = {MAutoStorage.getCreateSQLs(WxaAttributes.f239430W0, "WxaAttrAvailableBackupTable")};

    /* renamed from: e */
    public final ISQLiteDatabase f261051e;

    /* renamed from: wi0.b0$a */
    public static final class C90976a implements b$$h0<C90975b0> {

        /* renamed from: a */
        public static final C90976a f261052a = new C90976a();

        /* renamed from: a */
        public Object mo113337a(ISQLiteDatabase iSQLiteDatabase) {
            C87412m.m108594g(iSQLiteDatabase, "db");
            return new C90975b0(iSQLiteDatabase);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90975b0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, "WxaAttrAvailableBackupTable", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f261051e = iSQLiteDatabase;
    }

    /* renamed from: nP */
    public final boolean mo125053nP(WxaAttributes wxaAttributes) {
        String str;
        WxaAttributes.WxaVersionInfo o2;
        if (wxaAttributes == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WxaAttrAvailableBackupStorage.insertOrUpdate(");
        sb.append(wxaAttributes.field_username);
        sb.append('|');
        sb.append(wxaAttributes.field_appId);
        sb.append('|');
        WxaAttributes.WxaVersionInfo o25 = wxaAttributes.mo113942o2();
        sb.append(o25 != null ? o25.f239452d : -1);
        sb.append(')');
        String sb4 = sb.toString();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Boolean valueOf = Boolean.valueOf(mo114000LL(wxaAttributes.field_username, "appId") != null ? updateNotify(wxaAttributes, false, "username") : insertNotify(wxaAttributes, false));
        if (valueOf.booleanValue() && (o2 = wxaAttributes.mo113942o2()) != null) {
            mo125054uP(wxaAttributes.field_appId, o2.f239452d);
        }
        if (valueOf instanceof C87690d.C87691a) {
            str = ((C87690d.C87691a) valueOf).mo63320l();
        } else {
            str = valueOf.toString();
            if (str == null) {
                str = "";
            }
        }
        boolean a = C2039g2.m1987a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a) {
            Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + sb4 + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a + ' ');
        } else {
            Log.m105928w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / ((long) 16))) + " frames! runProfiled:log:" + sb4 + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a + ' ');
        }
        return valueOf.booleanValue();
    }

    /* renamed from: uP */
    public final boolean mo125054uP(String str, int i) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Log.m105924i("MicroMsg.AppBrand.WxaAttrAvailableBackupStorage", "removeForAppIdAndVersionLessThan(appId:" + str + ", version:" + i + ')');
        try {
            WxaAttributes mL = mo114011mL(str, "versionInfo");
            if (mL != null && mL.mo113942o2().f239452d < i) {
                delete(mL, false, new String[0]);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
