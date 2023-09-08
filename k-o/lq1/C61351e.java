package lq1;

import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawer;
import gy3.C8480h;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13604l;

/* renamed from: lq1.e */
public final class C61351e {

    /* renamed from: e */
    public static final ConcurrentHashMap<Long, C13604l<C10637c, C61349d>> f174509e = new ConcurrentHashMap<>();

    /* renamed from: a */
    public UniCommentDrawer f174510a;

    /* renamed from: b */
    public MMFragmentActivity f174511b;

    /* renamed from: c */
    public final C10637c f174512c;

    /* renamed from: d */
    public C61349d f174513d;

    static {
        new ConcurrentHashMap();
    }

    public C61351e(int i, boolean z, CommentDrawerContract.CloseDrawerCallback closeDrawerCallback, int i2, C8480h hVar) {
        this.f174512c = new C10637c(i, (i2 & 2) != 0 ? false : z);
    }
}
