package p145dx;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import pj2.C62323d;

/* renamed from: dx.n */
public interface C58449n {

    /* renamed from: dx.n$a */
    public static final class C58450a {
        /* renamed from: a */
        public static /* synthetic */ WxRecyclerAdapter m67851a(C58449n nVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return nVar.mo80827P1(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initRingtoneSelectListAdapter");
        }
    }

    /* renamed from: P1 */
    WxRecyclerAdapter<C62323d> mo80827P1(boolean z);

    /* renamed from: T */
    boolean mo80828T();

    /* renamed from: e2 */
    C54219z<Boolean> mo80831e2();
}
