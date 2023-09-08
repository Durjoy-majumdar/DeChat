package com.tencent.p014mm.plugin.finder.gallery;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import gy3.C87412m;
import java.util.List;
import jq3.C9500j;
import pe3.C89349b;
import rx3.C13600d;
import up1.C37521f;
import zf1.C16146d;
import zf1.C66791a;
import zf1.C66792b;

/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryDefaultConfig */
public class FinderGalleryDefaultConfig extends C66792b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryDefaultConfig(C66791a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "data");
    }

    /* renamed from: a */
    public C9500j mo77476a(int i) {
        return new FinderGalleryDefaultConfig$buildItemCoverts$1(this);
    }

    /* renamed from: b */
    public boolean mo77477b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo77478c() {
        return false;
    }

    /* renamed from: d */
    public RecyclerView.C0129l mo77479d(int i) {
        return new C16146d();
    }

    /* renamed from: e */
    public RecyclerView.LayoutManager mo77480e(Context context, int i) {
        C87412m.m108594g(context, "context");
        FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new FinderStaggeredGridLayoutManager(2, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    /* renamed from: f */
    public int mo77481f() {
        return -1;
    }

    /* renamed from: g */
    public MMFinderFragment mo77482g(Context context, int i, boolean z) {
        C87412m.m108594g(context, "context");
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            return new FinderGalleryFragment(this, i, z);
        }
        C87412m.m108591d((Object) null);
        throw new C13600d();
    }

    /* renamed from: h */
    public String mo77483h(Context context, int i) {
        C87412m.m108594g(context, "context");
        if (i == 1) {
            String string = context.getString(C0966R.string.eqk);
            C87412m.m108593f(string, "context.getString(com.te…string.finder_tab_follow)");
            return string;
        } else if (i == 2) {
            String string2 = context.getString(C0966R.string.dah);
            C87412m.m108593f(string2, "context.getString(R.stri…nder_gallery_tab_machine)");
            return string2;
        } else if (i == 3) {
            return C58784w3.f168295a.mo83962s0();
        } else {
            if (i == 4) {
                String string3 = context.getString(C0966R.string.fnv);
                C87412m.m108593f(string3, "context.getString(R.stri…finder_feed_like_tip_new)");
                return string3;
            } else if (i != 5) {
                return "";
            } else {
                String string4 = context.getString(C0966R.string.ee_);
                C87412m.m108593f(string4, "context.getString(R.string.finder_my_post)");
                return string4;
            }
        }
    }

    /* renamed from: i */
    public void mo77484i(MMActivity mMActivity, int i, int i2, Intent intent, C66792b.C66794b bVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "curActivity");
    }

    /* renamed from: j */
    public void mo77485j(MMActivity mMActivity, int i, BaseFinderFeed baseFinderFeed, List<? extends BaseFinderFeed> list, C89349b bVar, boolean z) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(list, "dataList");
    }

    /* renamed from: k */
    public void mo77486k() {
    }

    /* renamed from: l */
    public final boolean mo77487l() {
        C37521f.f99374d.getClass();
        return C37521f.f99267Q6.mo60266n().intValue() == 1;
    }
}
