package gh1;

import android.content.Intent;
import gy3.C87412m;

/* renamed from: gh1.c */
public interface C59440c {

    /* renamed from: gh1.c$a */
    public static final class C8315a {
        /* renamed from: a */
        public static void m8366a(C59440c cVar, int i, String[] strArr, int[] iArr) {
            C87412m.m108594g(strArr, "permissions");
            C87412m.m108594g(iArr, "grantResults");
        }
    }

    /* renamed from: e */
    boolean mo9121e();

    void onActivityResult(int i, int i2, Intent intent);

    void onNewIntent(Intent intent);

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    boolean onSwipeBack();

    void resume();

    /* renamed from: x0 */
    void mo9131x0(boolean z, int i);
}
