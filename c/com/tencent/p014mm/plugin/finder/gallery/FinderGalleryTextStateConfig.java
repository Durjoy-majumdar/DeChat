package com.tencent.p014mm.plugin.finder.gallery;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C9500j;
import p773yy.C66708h;
import pe3.C89349b;
import zf1.C16146d;
import zf1.C66791a;
import zf1.C66792b;
import zf1.C66800f;

/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTextStateConfig */
public final class FinderGalleryTextStateConfig extends FinderGalleryDefaultConfig {

    /* renamed from: c */
    public BaseFinderFeed f159161c;

    /* renamed from: d */
    public FinderObject f159162d;

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTextStateConfig$a */
    public static final class C3126a extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof GridLayoutManager.LayoutParams ? (GridLayoutManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                if (layoutParams2.f44673h % 3 == 1) {
                    rect.left = 1;
                    rect.right = 1;
                }
                rect.bottom = 1;
                rect.top = 0;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryTextStateConfig(C66791a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "data");
    }

    /* renamed from: a */
    public C9500j mo77476a(int i) {
        return !mo77487l() ? new FinderGalleryTextStateConfig$buildItemCoverts$1() : new FinderGalleryDefaultConfig$buildItemCoverts$1(this);
    }

    /* renamed from: b */
    public boolean mo77477b() {
        return mo77487l();
    }

    /* renamed from: c */
    public boolean mo77478c() {
        return !mo77487l();
    }

    /* renamed from: d */
    public RecyclerView.C0129l mo77479d(int i) {
        return !mo77487l() ? new C3126a() : new C16146d();
    }

    /* renamed from: e */
    public RecyclerView.LayoutManager mo77480e(Context context, int i) {
        C87412m.m108594g(context, "context");
        if (mo77487l()) {
            return super.mo77480e(context, i);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        gridLayoutManager.setItemPrefetchEnabled(true);
        return gridLayoutManager;
    }

    /* renamed from: f */
    public int mo77481f() {
        return 10001;
    }

    /* renamed from: i */
    public void mo77484i(MMActivity mMActivity, int i, int i2, Intent intent, C66792b.C66794b bVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "curActivity");
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("SELECT_OBJECT") : null;
        if (byteArrayExtra != null) {
            FinderObject finderObject = new FinderObject();
            finderObject.parseFrom(byteArrayExtra);
            this.f159162d = finderObject;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                mo77490m(i, i2, mMActivity, true);
            }
        } else if (!mo77490m(i, i2, mMActivity, false) && i == 20000 && i2 == -1) {
            mMActivity.setResult(-1, intent);
            mMActivity.finish();
        }
    }

    /* renamed from: j */
    public void mo77485j(MMActivity mMActivity, int i, BaseFinderFeed baseFinderFeed, List<? extends BaseFinderFeed> list, C89349b bVar, boolean z) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(list, "dataList");
        this.f159161c = baseFinderFeed;
        Intent intent = new Intent();
        intent.putExtra("SELECT_OBJECT", baseFinderFeed.mo3513o().getFeedObject().toByteArray());
        ((C66708h) C86312j.m106911c(C66708h.class)).mo90744pe(mMActivity, intent, 10001);
    }

    /* renamed from: m */
    public final boolean mo77490m(int i, int i2, MMActivity mMActivity, boolean z) {
        BaseFinderFeed baseFinderFeed = this.f159161c;
        FinderObject finderObject = this.f159162d;
        if (finderObject == null) {
            finderObject = baseFinderFeed != null ? baseFinderFeed.mo3513o().getFeedObject() : null;
        }
        if (i == 10001 && i2 == -1 && finderObject != null) {
            Intent intent = new Intent();
            intent.putExtra("SELECT_OBJECT", finderObject.toByteArray());
            mMActivity.setResult(-1, intent);
            mMActivity.finish();
            if (!z) {
                C66800f.f191913a.mo90795c(finderObject.f164794id);
                return true;
            }
            C66800f.f191913a.mo90798f(finderObject.f164794id);
            return true;
        } else if (i != 10001) {
            return false;
        } else {
            long j = 0;
            if (!z) {
                C66800f fVar = C66800f.f191913a;
                if (finderObject != null) {
                    j = finderObject.f164794id;
                }
                fVar.mo90797e(j);
                return false;
            }
            C66800f fVar2 = C66800f.f191913a;
            if (finderObject != null) {
                j = finderObject.f164794id;
            }
            fVar2.mo90799g(j);
            return false;
        }
    }
}
