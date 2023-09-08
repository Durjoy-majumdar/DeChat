package lh2;

import android.content.Intent;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;

/* renamed from: lh2.g0 */
public interface C109344g0 {

    /* renamed from: lh2.g0$a */
    public static final class C61280a {
        /* renamed from: a */
        public static void m71860a(C109344g0 g0Var, int i, String[] strArr, int[] iArr) {
            C87412m.m108594g(strArr, "permissions");
            C87412m.m108594g(iArr, "grantResults");
        }
    }

    /* renamed from: e */
    boolean mo78564e();

    String name();

    void onActivityResult(int i, int i2, Intent intent);

    void onAttach();

    void onDetach();

    void onPause();

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onResume();

    void release();

    void reset();

    void setVisibility(int i);

    /* renamed from: v */
    void mo78575v(RecordConfigProvider recordConfigProvider);
}
