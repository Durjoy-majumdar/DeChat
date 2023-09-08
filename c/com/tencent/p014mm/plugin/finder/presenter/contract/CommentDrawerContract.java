package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55033u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderCommentAdVideoView;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fo1.C59264a;
import java.util.List;
import kotlin.Metadata;
import up1.C65426w0;
import ur1.C65468g;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract;", "", "()V", "CloseDrawerCallback", "NPresenter", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract */
public final class CommentDrawerContract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$CloseDrawerCallback;", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback */
    public interface CloseDrawerCallback {

        @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback$DefaultImpls */
        public static final class DefaultImpls {
        }

        /* renamed from: a */
        void mo2377a(int i, List<? extends C55033u> list, boolean z);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;", "Lfo1/a;", "Lur1/g;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter */
    public interface NPresenter extends C59264a<C65468g> {
        /* renamed from: A0 */
        void mo77317A0(C55033u uVar, boolean z);

        /* renamed from: M */
        void mo77320M(FinderCommentDrawer finderCommentDrawer, C65468g gVar, FinderItem finderItem, CloseDrawerCallback closeDrawerCallback, int i, boolean z, long j, C65426w0 w0Var, boolean z2, boolean z3, long j2, boolean z4, boolean z5, boolean z6, int i2);

        /* renamed from: X */
        void mo77324X(int i);

        /* renamed from: Y0 */
        void mo77325Y0(View view, C55033u uVar);

        /* renamed from: a */
        RecyclerView.C0129l mo77326a(Context context);

        /* renamed from: a0 */
        boolean mo77327a0(C55033u uVar, boolean z);

        /* renamed from: c */
        WxRecyclerAdapter<?> mo77328c(Context context);

        /* renamed from: f */
        void mo77329f(View view, int i);

        /* renamed from: g */
        int mo77331g();

        int getCommentScene();

        /* renamed from: h */
        boolean mo77333h();

        /* renamed from: l1 */
        void mo77335l1(View view, C55033u uVar);

        /* renamed from: o1 */
        boolean mo77337o1();

        /* renamed from: p */
        int mo77338p();

        /* renamed from: r */
        void mo77339r(ImageView imageView, int i);

        /* renamed from: r1 */
        FinderCommentAdVideoView mo77340r1();

        /* renamed from: s */
        int mo77341s();

        /* renamed from: u */
        FinderItem mo77342u();

        /* renamed from: v */
        C55033u mo77344v(long j);
    }
}
