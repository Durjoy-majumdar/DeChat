package p1222y4;

import android.content.ComponentName;
import android.content.Context;
import p1014o4.C117693m;

/* renamed from: y4.g */
public class C118922g {

    /* renamed from: a */
    public static final String f356201a = C117693m.m165967e("PackageManagerHelper");

    /* renamed from: a */
    public static void m167677a(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C117693m c = C117693m.m165966c();
            String str2 = f356201a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : "disabled";
            c.mo182389a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            C117693m c2 = C117693m.m165966c();
            String str3 = f356201a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            c2.mo182389a(str3, String.format("%s could not be %s", objArr2), e);
        }
    }
}
