package st1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import p156gj.C87203t;
import tt1.C78101i;

/* renamed from: st1.n */
public class C77770n {

    /* renamed from: a */
    public static boolean f226610a;

    /* renamed from: a */
    public static final String m93839a(Context context) {
        return context.getApplicationContext().getFilesDir().getAbsolutePath() + "/" + "b7c9a7fd-851e-7761-07df-8ab7c0b02787.sec";
    }

    /* renamed from: b */
    public static String m93840b() {
        String u = C75228t.m90272u();
        return MD5Util.getMD5String(MD5Util.getMD5String(u) + MD5Util.getMD5String(C87203t.m108273i()));
    }

    /* renamed from: c */
    public static boolean m93841c() {
        return ((C78101i) C86709a0.m107533q(C78101i.class)).mo108079gv();
    }

    /* renamed from: d */
    public static boolean m93842d() {
        C86709a0.m107528h();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_SO_LOAD_SUCCESS_BOOLEAN_SYNC, Boolean.FALSE);
        if (f != null) {
            return ((Boolean) f).booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public static void m93843e(boolean z) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_SO_LOAD_SUCCESS_BOOLEAN_SYNC, Boolean.valueOf(z));
    }
}
