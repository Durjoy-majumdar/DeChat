package kf1;

import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import er1.C58784w3;
import hp3.C87581a;
import java.util.List;
import nj3.C76912y0;
import rx3.C13598b0;
import rx3.C13604l;
import u60.C14121l;
import u60.C65234n;
import up1.C65426w0;
import vp1.C65834e;

/* renamed from: kf1.n0 */
public final class C61042n0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderCommentDrawerPresenter f173834a;

    /* renamed from: b */
    public final /* synthetic */ C55033u f173835b;

    /* renamed from: c */
    public final /* synthetic */ boolean f173836c;

    /* renamed from: d */
    public final /* synthetic */ C14121l f173837d;

    public C61042n0(FinderCommentDrawerPresenter finderCommentDrawerPresenter, C55033u uVar, boolean z, C14121l lVar) {
        this.f173834a = finderCommentDrawerPresenter;
        this.f173835b = uVar;
        this.f173836c = z;
        this.f173837d = lVar;
    }

    public Object call(Object obj) {
        FinderItem e;
        C13604l lVar = (C13604l) obj;
        int intValue = ((Number) lVar.f38555d).intValue();
        List list = (List) lVar.f38556e;
        if (intValue == -1) {
            FinderCommentDrawerPresenter.C55726a aVar = this.f173834a.f158623o;
            if (aVar != null) {
                aVar.mo77345a(this.f173835b.f154492d.mo89531n2(), this.f173835b.f154492d.field_localCommentId, true);
            }
            C65426w0 w0Var = this.f173835b.f154492d;
            if (w0Var.field_actionInfo.f186500h == 0 && (e = C65834e.f189316a.mo89871e(w0Var.field_feedId)) != null) {
                C55033u uVar = this.f173835b;
                FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f173834a;
                e.setCommentCount(e.getCommentCount() - 1);
                if (e.getCommentCount() < 0) {
                    e.setCommentCount(0);
                }
                if (uVar.f154492d.mo89534q2() > 0 && uVar.f154492d.mo89534q2() <= e.getCommentCount()) {
                    e.setCommentCount(e.getCommentCount() - uVar.f154492d.mo89534q2());
                }
                C58784w3.f168295a.mo83966t1(e);
                finderCommentDrawerPresenter.mo77321N0();
            }
            C76912y0.makeText(this.f173834a.f158615d, (int) C0966R.string.emv, 0).show();
        } else if (intValue == 0) {
            FinderCommentDrawerPresenter.m63412G(this.f173834a, list, this.f173835b, this.f173836c);
        }
        this.f173837d.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
