package com.tencent.p014mm.plugin.finder.search.p055ui;

import ak1.C54067f0;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import java.util.List;
import rs1.C13442s8;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.search.ui.b */
public final class C3600b extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderMixSearchFeedFragment f16681d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f16682e;

    /* renamed from: f */
    public final /* synthetic */ int f16683f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView.C16631z f16684g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3600b(FinderMixSearchFeedFragment finderMixSearchFeedFragment, BaseFinderFeed baseFinderFeed, int i, RecyclerView.C16631z zVar) {
        super(1);
        this.f16681d = finderMixSearchFeedFragment;
        this.f16682e = baseFinderFeed;
        this.f16683f = i;
        this.f16684g = zVar;
    }

    public Object invoke(Object obj) {
        ((Number) obj).intValue();
        Class cls = C13442s8.class;
        Context context = this.f16681d.getContext();
        if (context != null) {
            BaseFinderFeed baseFinderFeed = this.f16682e;
            int i = this.f16683f;
            FinderMixSearchFeedFragment finderMixSearchFeedFragment = this.f16681d;
            RecyclerView.C16631z zVar = this.f16684g;
            C39818r rVar = C39818r.f106831a;
            String valueOf = String.valueOf(((C13442s8) rVar.mo62443b(context).mo75002a(cls)).f38098n);
            String valueOf2 = String.valueOf(((C13442s8) rVar.mo62443b(context).mo75002a(cls)).f38096i);
            String str = ((C13442s8) rVar.mo62443b(context).mo75002a(cls)).f38102q;
            String str2 = str == null ? "" : str;
            String str3 = ((C13442s8) rVar.mo62443b(context).mo75002a(cls)).f38102q;
            if (str3 == null) {
                str3 = "";
            }
            if (C58739j4.f168176a.mo83686O(baseFinderFeed)) {
                C7335d c = C86312j.m106911c(C8777j5.class);
                C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
                ((C8777j5) c).mo9607Uk(baseFinderFeed, (long) i, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, valueOf2, str2, str3, "");
                Intent intent = new Intent();
                intent.putExtra("key_context_id", valueOf);
                intent.putExtra("key_from_comment_scene", valueOf2);
                intent.putExtra("key_click_tab_context_id", str2);
                intent.putExtra("key_click_sub_tab_context_id", str3);
                FinderMixSearchPresenter finderMixSearchPresenter = finderMixSearchFeedFragment.f16655r;
                if (finderMixSearchPresenter != null) {
                    finderMixSearchPresenter.mo3909e(baseFinderFeed, intent, finderMixSearchFeedFragment.f16656s);
                }
            } else {
                int i2 = finderMixSearchFeedFragment.f17334o;
                if (i2 == -1) {
                    i2 = 0;
                }
                FinderMixSearchPresenter finderMixSearchPresenter2 = finderMixSearchFeedFragment.f16655r;
                if (finderMixSearchPresenter2 != null) {
                    List<BaseFinderFeed> list = finderMixSearchFeedFragment.f16656s;
                    View view = zVar.f44854d;
                    C87412m.m108593f(view, "holder.itemView");
                    finderMixSearchPresenter2.mo3916q(baseFinderFeed, list, i2, view);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
