package kf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fo1.C8178c;
import java.util.ArrayList;

/* renamed from: kf1.n9 */
public interface C9878n9 extends C8178c<C9860m9> {

    /* renamed from: kf1.n9$a */
    public static final class C9879a {
        /* renamed from: a */
        public static /* synthetic */ void m9643a(C9878n9 n9Var, long j, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = 0;
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                if ((i & 4) != 0) {
                    z2 = false;
                }
                n9Var.mo10417g0(j, z, z2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoFlingToRefresh");
        }
    }

    /* renamed from: C0 */
    void mo10414C0(boolean z);

    /* renamed from: b */
    View mo10415b();

    /* renamed from: c */
    RefreshLoadMoreLayout mo10416c();

    /* renamed from: g0 */
    void mo10417g0(long j, boolean z, boolean z2);

    RecyclerView getRecyclerView();

    boolean onBackPressed();

    /* renamed from: w */
    void mo10420w(ArrayList<C0740i2> arrayList, int i);
}
