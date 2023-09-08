package d00;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86301e;
import e00.C20484c0;
import ei3.C86522b;
import kj2.C117407d;
import q73.C35812s;
import rx3.C13601g;
import rx3.C36570n;

@C86522b
/* renamed from: d00.k0 */
public final class C31009k0 extends C86301e implements C20484c0 {
    public void zb0() {
        C35812s sVar = C35812s.f95615a;
        if (C35812s.f95619e) {
            C13601g gVar = C35812s.f95617c;
            long j = ((MultiProcessMMKV) ((C36570n) gVar).getValue()).getLong("webcanvas_last_download_pkg_by_get_data_time", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - j) >= ((Number) ((C36570n) C35812s.f95620f).getValue()).longValue()) {
                C117407d.INSTANCE.mo182089r(1454, 45, 1);
                ((MultiProcessMMKV) ((C36570n) gVar).getValue()).encode("webcanvas_last_download_pkg_by_get_data_time", currentTimeMillis);
                sVar.mo60426g();
            }
        }
    }
}
