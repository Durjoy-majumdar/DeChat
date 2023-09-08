package kf1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0747l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderSelectContract$SelectPresenter;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import fo1.C8178c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C33631s;
import jq3.C9493c;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C52271zj0;
import zc1.C66785b;

/* renamed from: kf1.c9 */
public final class C9673c9 implements C8178c<FinderSelectContract$SelectPresenter> {

    /* renamed from: s */
    public static final String f30047s;

    /* renamed from: d */
    public final MMActivity f30048d;

    /* renamed from: e */
    public final View f30049e;

    /* renamed from: f */
    public final FinderSelectContract$SelectPresenter f30050f;

    /* renamed from: g */
    public final boolean f30051g;

    /* renamed from: h */
    public RecyclerView f30052h;

    /* renamed from: i */
    public RefreshLoadMoreLayout f30053i;

    /* renamed from: j */
    public ProgressBar f30054j;

    /* renamed from: n */
    public TextView f30055n;

    /* renamed from: o */
    public FrameLayout f30056o;

    /* renamed from: p */
    public boolean f30057p;

    /* renamed from: q */
    public LinkedList<C33631s> f30058q;

    /* renamed from: r */
    public WxRecyclerAdapter<C0747l> f30059r;

    /* renamed from: kf1.c9$a */
    public static final class C9674a {
        public C9674a(C8480h hVar) {
        }
    }

    static {
        C9674a aVar = new C9674a((C8480h) null);
        f30047s = "Finder.SelectViewCallback." + aVar.hashCode();
    }

    public C9673c9(MMActivity mMActivity, View view, FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter, boolean z, int i, C8480h hVar) {
        z = (i & 8) != 0 ? false : z;
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(view, "contentView");
        C87412m.m108594g(finderSelectContract$SelectPresenter, "presenter");
        this.f30048d = mMActivity;
        this.f30049e = view;
        this.f30050f = finderSelectContract$SelectPresenter;
        this.f30051g = z;
    }

    public MMFragmentActivity getActivity() {
        return this.f30048d;
    }

    /* renamed from: p */
    public final void mo10292p(LinkedList<C33631s> linkedList) {
        Class cls = C58417y0.class;
        if (linkedList != null) {
            for (C33631s sVar : linkedList) {
                C9493c cVar = sVar.f91020a;
                if (cVar instanceof C0747l) {
                    C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderActivityInfoData");
                    C52271zj0 zj02 = ((C0747l) cVar).f1765d;
                    FinderContact finderContact = zj02.f146006e;
                    C49712hj1 hj12 = null;
                    boolean b = C87412m.m108589b(finderContact != null ? finderContact.username : null, C66785b.f191882e.mo90662O5());
                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                    long j = b ? 1 : 0;
                    String xx02 = ((C58417y0) C86312j.m106911c(cls)).xx0(zj02.f146005d);
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30048d);
                    if (f != null) {
                        hj12 = f.mo12861q3();
                    }
                    y0Var.yy0(j, "1", 4, xx02, hj12);
                }
            }
        }
    }
}
