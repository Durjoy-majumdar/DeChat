package p000ag;

import android.database.Cursor;
import com.tencent.p014mm.plugin.appbrand.appcache.C29215f3;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81273j1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Locale;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ag.e */
public final class C27884e {

    /* renamed from: a */
    public static final C27884e f77039a = new C27884e();

    /* renamed from: b */
    public static final C13601g f77040b = C36568h.m40985a(C27885a.f77041d);

    /* renamed from: ag.e$a */
    public static final class C27885a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C27885a f77041d = new C27885a();

        public C27885a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("MagicPlayablePkgRecord");
        }
    }

    /* renamed from: a */
    public final MultiProcessMMKV mo55660a() {
        return (MultiProcessMMKV) ((C36570n) f77040b).getValue();
    }

    /* renamed from: b */
    public final C29315z2 mo55661b() {
        String str;
        String str2;
        Log.m105924i("MagicPlayablePkgRecordMgr", "getPkgRecord");
        String str3 = "";
        String decodeString = mo55660a().decodeString("AppID", str3);
        String decodeString2 = mo55660a().decodeString("ModuleName", str3);
        int decodeInt = mo55660a().decodeInt("VersionType", 0);
        Log.m105924i("MagicPlayablePkgRecordMgr", "getWxaPkg appId:" + decodeString + " moduleName:" + decodeString2 + " versionType:" + decodeInt);
        String a = C81273j1.m99631a(decodeString2);
        C29215f3 f3Var = C29215f3.f79864a;
        C29315z2 z2Var = null;
        if (Util.isNullOrNil((String) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(decodeString);
            if (!Util.isNullOrNil(a)) {
                str3 = '$' + a;
            }
            sb.append(str3);
            str = sb.toString();
        } else {
            str = null;
        }
        String[] strArr = new String[0];
        if (!Util.isNullOrNil(str)) {
            if (C81289m.C81290a.m99664b(decodeInt)) {
                str2 = "version desc";
            } else if (C81289m.C81290a.m99663a(decodeInt)) {
                str2 = "createTime desc";
            } else {
                throw new RuntimeException("Illegal pkgType " + decodeInt);
            }
            Cursor query = MMApplicationContext.getContext().getContentResolver().query(C29215f3.f79865b, Util.isNullOrNil(strArr) ? null : strArr, String.format(Locale.US, "%s=? and %s=?", new Object[]{"appId", "debugType"}), new String[]{str, String.valueOf(decodeInt)}, str2);
            if (query != null) {
                if (query.moveToFirst()) {
                    z2Var = new C29315z2();
                    z2Var.convertFrom(query);
                    z2Var.field_appId = str;
                    z2Var.field_debugType = decodeInt;
                }
                query.close();
            }
        }
        return z2Var;
    }
}
