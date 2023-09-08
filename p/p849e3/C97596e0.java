package p849e3;

import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: e3.e0 */
public class C97596e0 {
    /* renamed from: a */
    public static C107192g0 m125774a(Window window) {
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            return new C107192g0(insetsController);
        }
        return null;
    }
}
