package y91;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C21152b;

/* renamed from: y91.a */
public final class C118948a {

    /* renamed from: a */
    public static int f356268a = -1;

    /* renamed from: b */
    public static boolean f356269b;

    /* renamed from: c */
    public static boolean f356270c;

    /* renamed from: d */
    public static final C118949a f356271d = new C118949a();

    /* renamed from: y91.a$a */
    public static final class C118949a implements C21152b {
        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            if (obj == null) {
                return;
            }
            if (((obj instanceof Activity) || (obj instanceof Fragment) || (obj instanceof android.app.Fragment)) && objArr != null && objArr.length >= 2) {
                Integer num = objArr[1];
                C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                int intValue = num.intValue();
                C118948a.f356268a = intValue;
                Log.m105925i("HABBYGE-MALI.PermissionMonitor", "PermissionListener, args: %d", Integer.valueOf(intValue));
                C118948a.f356270c = true;
            }
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
        }
    }
}
