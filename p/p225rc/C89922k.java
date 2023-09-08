package p225rc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p385u2.C111105a;
import p918s2.C90111a;
import wq0.C91075m;

/* renamed from: rc.k */
public class C89922k {

    /* renamed from: a */
    public static C91075m f258400a;

    /* renamed from: b */
    public static k$$c f258401b;

    /* renamed from: a */
    public static boolean m112464a(Activity activity, C82381f fVar, String str, int i, String str2, String str3) {
        if (Build.VERSION.SDK_INT < 23 && !"MNC".equals(Build.VERSION.CODENAME)) {
            return true;
        }
        C91075m mVar = f258400a;
        if (mVar == null || fVar == null || !mVar.mo117445c()) {
            k$$c k__c = f258401b;
            if (k__c != null) {
                return k__c.mo94369z1(activity, str, i, str2, str3);
            }
            try {
                if (C111105a.m151499a(activity, str) == 0) {
                    return true;
                }
                if (!Util.isNullOrNil(str3)) {
                    k$$b k__b = new k$$b(activity, str, i);
                    String string = activity.getString(C0966R.string.hhu);
                    String string2 = activity.getString(C0966R.string.hht);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    builder.setMessage(str3).setTitle(str2).setCancelable(false).setPositiveButton(string, k__b).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                    builder.show();
                } else {
                    C90111a.m112741e(activity, new String[]{str}, i);
                }
                return false;
            } catch (Exception e) {
                Log.m105921e("Luggage.PermissionUtil", "check mpermission exception:%s.", e);
                return true;
            }
        } else if (f258400a.mo117444b(activity, fVar, str)) {
            return true;
        } else {
            f258400a.mo117443a(activity, fVar, str, new k$$a(fVar, i, str));
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m112465b(Context context, C82381f fVar, String str) {
        C91075m mVar = f258400a;
        if (mVar != null && fVar != null && mVar.mo117445c()) {
            return f258400a.mo117444b(context, fVar, str);
        }
        try {
            int a = C111105a.m151499a(context, str);
            if (a != 0) {
                return false;
            }
            if (Util.isNullOrNil((String) null)) {
                return a == 0;
            }
            try {
                C111105a.m151499a(context, (String) null);
                throw null;
            } catch (Exception e) {
                Log.m105921e("Luggage.PermissionUtil", "check mpermission otherPermisson exception:%s.", e);
                return false;
            }
        } catch (Exception e2) {
            Log.m105921e("Luggage.PermissionUtil", "check mpermission exception:%s.", e2);
            return false;
        }
    }
}
