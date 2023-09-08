package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import er1.C58784w3;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.c */
public final class C3825c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f17355d;

    /* renamed from: e */
    public final /* synthetic */ FinderFavFeedFragment f17356e;

    public C3825c(Bitmap bitmap, FinderFavFeedFragment finderFavFeedFragment) {
        this.f17355d = bitmap;
        this.f17356e = finderFavFeedFragment;
    }

    public final void run() {
        Bitmap bitmap = this.f17355d;
        if (bitmap != null) {
            FinderFavFeedFragment finderFavFeedFragment = this.f17356e;
            int dimension = (int) finderFavFeedFragment.mo4171V().getResources().getDimension(C0966R.dimen.f3743cv);
            C58784w3 w3Var = C58784w3.f168295a;
            MMActivity V = finderFavFeedFragment.mo4171V();
            String string = finderFavFeedFragment.mo4171V().getString(C0966R.string.fnn);
            C87412m.m108593f(string, "activity.getString(com.t…ring.finder_fav_feed_new)");
            finderFavFeedFragment.mo4171V().setMMTitle(w3Var.mo83960r1(V, string, '#', new BitmapDrawable(bitmap), C0966R.color.a7f, dimension, dimension));
        }
    }
}
