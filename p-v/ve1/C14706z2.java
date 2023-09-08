package ve1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0735h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58684b;
import er1.C7832m3;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C64586nn1;
import up1.C27696y;
import up1.C37521f;

/* renamed from: ve1.z2 */
public final class C14706z2 extends C60896i<C0735h> {

    /* renamed from: ve1.z2$a */
    public static final class C14707a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40656d;

        public C14707a(C60905o oVar) {
            this.f40656d = oVar;
        }

        public final void onClick(View view) {
            int i;
            int i2;
            Class cls = FinderCommonFeatureService.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i3 = 0;
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
            int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
            int j3 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
            int j4 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
            int j5 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
            Context context = this.f40656d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C49712hj1 hj12 = null;
            ((C58684b) C86312j.m106911c(C58684b.class)).dy0(context, (Intent) null);
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("TLWxBubble");
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("TLWxBubble");
            if (G5 != null) {
                C60905o oVar = this.f40656d;
                C37521f.f99374d.getClass();
                if (C37521f.f99420i1.mo60266n().intValue() == 1) {
                    if (j2 > 0) {
                        i3 = 1;
                    }
                    if (j > 0) {
                        i3 |= 8;
                    }
                    if (j3 > 0) {
                        i3 |= 2;
                    }
                    if (j4 > 0) {
                        i3 |= 4;
                    }
                    i = i3;
                    i2 = 5;
                } else {
                    i2 = 1;
                    i = 1;
                }
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var = (C58417y0) c;
                int i4 = j + j2 + j3 + j4 + j5;
                String str = G5.field_tipsId;
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context2 = oVar.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C13442s8 f = aVar.mo12873f(context2);
                C58417y0.Nx0(y0Var, "7", i2, 2, 2, i, i4, str, (String) null, 0, f != null ? f.mo12861q3() : null, 0, 0, 3456, (Object) null);
            }
            C60905o oVar2 = this.f40656d;
            if (!(G5 == null || R5 == null)) {
                int i5 = j + j2 + j3 + j4 + j5;
                C7832m3 m3Var = C7832m3.f26372a;
                Context context3 = oVar2.f173499A;
                C87412m.m108593f(context3, "holder.context");
                String obj = m3Var.mo8947o(context3, j5, j2 + j3 + j4, j, i5).toString();
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context4 = oVar2.f173499A;
                C87412m.m108593f(context4, "holder.context");
                C13442s8 f2 = aVar2.mo12873f(context4);
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                C58413v0.m67781i(v0Var, "7", G5, R5, 2, hj12, i5, obj, 1, 0, 256, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C14706z2() {
        MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3706by);
        MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a6f);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6244i;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        oVar.mo85812D(C0966R.C0970id.f358781h20).setOnClickListener(new C14707a(oVar));
    }

    /* renamed from: j */
    public void mo44e(C60905o oVar, C0735h hVar, int i, int i2, boolean z, List<Object> list) {
        C60905o oVar2 = oVar;
        C0735h hVar2 = hVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(hVar2, "item");
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_IS_BUBBLE_BOOLEAN_SYNC, true);
        Log.m105924i("Finder.FeedMsgNotifyConvert", "item count = " + hVar2.f1753d + ",item avatar = " + hVar2.f1757h + ", isEnableBubble:" + g);
        if (hVar2.f1753d <= 0 || !g) {
            View D = oVar2.mo85812D(C0966R.C0970id.f358781h20);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.f358781h20);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view = D2;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (Util.isNullOrNil(hVar2.f1757h)) {
            View D3 = oVar2.mo85812D(C0966R.C0970id.h19);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view2 = D3;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View D4 = oVar2.mo85812D(C0966R.C0970id.h19);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = D4;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderMsgNotifyData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C60979d<C100810g0> K1 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1();
            C11984n0 n0Var = new C11984n0(hVar2.f1757h, C27696y.THUMB_IMAGE);
            View D5 = oVar2.mo85812D(C0966R.C0970id.h19);
            C87412m.m108593f(D5, "holder.getView<ImageView>(R.id.msg_avatar)");
            K1.mo85957c(n0Var, (ImageView) D5, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        }
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.gsz);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        C7832m3 m3Var = C7832m3.f26372a;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        textView.setText(m3Var.mo8947o(context, hVar2.f1756g, hVar2.f1754e, hVar2.f1755f, hVar2.f1753d));
        int n = m3Var.mo8946n();
        ViewGroup.LayoutParams layoutParams = oVar2.mo85812D(C0966R.C0970id.f358781h20).getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2.width != n) {
            Log.m105924i("Finder.FeedMsgNotifyConvert", "change layoutParam calcWidth: " + n + " width:" + layoutParams2.width);
            layoutParams2.width = n;
            oVar2.mo85812D(C0966R.C0970id.f358781h20).setLayoutParams(layoutParams2);
        }
    }
}
