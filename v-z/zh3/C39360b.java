package zh3;

import android.os.Build;

/* renamed from: zh3.b */
public class C39360b {

    /* renamed from: a */
    public static final boolean f105786a;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 28 && Build.BRAND.equals("samsung")) {
            String lowerCase = Build.HARDWARE.toLowerCase();
            lowerCase.getClass();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1359763720:
                    if (lowerCase.equals("exynos7884a")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1359763719:
                    if (lowerCase.equals("exynos7884b")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2034346633:
                    if (lowerCase.equals("exynos7884")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2034346634:
                    if (lowerCase.equals("exynos7885")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2034347346:
                    if (lowerCase.equals("exynos7904")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2034347347:
                    if (lowerCase.equals("exynos7905")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
            }
        }
        z = true;
        f105786a = z;
    }
}
