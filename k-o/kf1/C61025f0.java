package kf1;

import android.content.Context;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.wcdb.FileUtils;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import je1.C46547x1;
import je1.C60795a2;
import nr3.C89059e;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C49946j51;
import u60.C14121l;
import up1.C65426w0;
import zc1.C66785b;

/* renamed from: kf1.f0 */
public final class C61025f0 extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f173794d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61025f0(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        super(1);
        this.f173794d = finderCommentDrawerPresenter;
    }

    public Object invoke(Object obj) {
        String str;
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        StringBuilder sb = new StringBuilder();
        sb.append("loadMoreData before lastBuffer ");
        C49712hj1 hj12 = null;
        if (this.f173794d.f158626r == null) {
            str = "null";
        } else {
            C89349b bVar = this.f173794d.f158626r;
            str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
        }
        sb.append(str);
        Log.m105924i("Finder.DrawerPresenter", sb.toString());
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f173794d.f158615d);
        int i = f != null ? f.f38096i : 0;
        if (C66785b.f191882e.mo90681z1()) {
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f173794d;
            finderCommentDrawerPresenter.getClass();
            FinderItem finderItem = finderCommentDrawerPresenter.f158620i;
            if (finderItem != null) {
                long id = finderItem.getId();
                FinderItem finderItem2 = finderCommentDrawerPresenter.f158620i;
                if (finderItem2 != null) {
                    String objectNonceId = finderItem2.getObjectNonceId();
                    int i2 = finderCommentDrawerPresenter.f158621j;
                    FinderItem finderItem3 = finderCommentDrawerPresenter.f158620i;
                    if (finderItem3 != null) {
                        String userName = finderItem3.getUserName();
                        C89349b bVar2 = finderCommentDrawerPresenter.f158626r;
                        C13442s8 f2 = aVar.mo12873f(finderCommentDrawerPresenter.f158615d);
                        if (f2 != null) {
                            hj12 = f2.mo12861q3();
                        }
                        C89059e B = new C60795a2(id, objectNonceId, i, i2, userName, bVar2, (C65426w0) null, 0, false, hj12, 1, FileUtils.S_IRWXU, (C8480h) null).mo9225i().mo123064p(new C61033i0(finderCommentDrawerPresenter)).mo123062e(new C61034j0(finderCommentDrawerPresenter, lVar));
                        Context context = finderCommentDrawerPresenter.f158615d;
                        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        B.mo11397F((MMActivity) context);
                    } else {
                        C87412m.m108603p("feedObj");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            } else {
                C87412m.m108603p("feedObj");
                throw null;
            }
        } else {
            String str2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity";
            FinderCommentDrawerPresenter finderCommentDrawerPresenter2 = this.f173794d;
            finderCommentDrawerPresenter2.getClass();
            FinderItem finderItem4 = finderCommentDrawerPresenter2.f158620i;
            if (finderItem4 != null) {
                long id4 = finderItem4.getId();
                FinderItem finderItem5 = finderCommentDrawerPresenter2.f158620i;
                if (finderItem5 != null) {
                    String objectNonceId2 = finderItem5.getObjectNonceId();
                    int i3 = finderCommentDrawerPresenter2.f158621j;
                    FinderItem finderItem6 = finderCommentDrawerPresenter2.f158620i;
                    if (finderItem6 != null) {
                        String userName2 = finderItem6.getUserName();
                        C89349b bVar3 = finderCommentDrawerPresenter2.f158626r;
                        C13442s8 f3 = aVar.mo12873f(finderCommentDrawerPresenter2.f158615d);
                        if (f3 != null) {
                            hj12 = f3.mo12861q3();
                        }
                        FinderCommentDrawerPresenter finderCommentDrawerPresenter3 = finderCommentDrawerPresenter2;
                        C89059e B2 = new C46547x1(id4, objectNonceId2, i, i3, userName2, false, bVar3, (C65426w0) null, 0, (String) null, false, false, (String) null, hj12, 1, (C49946j51) null, false, 106400, (C8480h) null).mo9225i().mo123064p(new C61026g0(finderCommentDrawerPresenter3)).mo123062e(new C61027h0(finderCommentDrawerPresenter3, lVar));
                        Context context2 = finderCommentDrawerPresenter3.f158615d;
                        C87412m.m108592e(context2, str2);
                        B2.mo11397F((MMActivity) context2);
                    } else {
                        C87412m.m108603p("feedObj");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            } else {
                C87412m.m108603p("feedObj");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
