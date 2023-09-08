package lg3;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: lg3.f */
public class C88497f {

    /* renamed from: a */
    public static boolean f255633a;

    /* renamed from: a */
    public static boolean m110368a() {
        String str = Build.BRAND;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return (lowerCase.contains("meizu") || lowerCase.contains("smartisan")) && Build.VERSION.SDK_INT <= 25;
    }

    /* renamed from: b */
    public static void m110369b(Configuration configuration, Resources resources) {
        boolean B = C85875k4.m106145B(resources);
        int i = configuration.uiMode & -49;
        configuration.uiMode = i;
        configuration.uiMode = i | (B ? 32 : 16);
        Object[] objArr = new Object[3];
        int i2 = 0;
        objArr[0] = Boolean.valueOf(B);
        objArr[1] = Integer.valueOf(configuration.uiMode);
        if (resources != null) {
            i2 = resources.getConfiguration().uiMode;
        }
        objArr[2] = Integer.valueOf(i2);
        Log.m105925i("MicroMsg.MMUIModeManager", "updateNightMode, isDarkMode:%s, uiMode:%s, resourcesMode:%s", objArr);
    }

    /* renamed from: c */
    public static void m110370c(Configuration configuration, boolean z) {
        int i = configuration.uiMode & -49;
        configuration.uiMode = i;
        configuration.uiMode = i | (z ? 32 : 16);
        Log.m105925i("MicroMsg.MMUIModeManager", "updateNightMode, isDarkMode:%s, uiMode:%s", Boolean.valueOf(z), Integer.valueOf(configuration.uiMode));
    }
}
