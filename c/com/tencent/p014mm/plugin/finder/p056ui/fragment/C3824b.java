package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import er1.C58784w3;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.b */
public final class C3824b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f17352d;

    /* renamed from: e */
    public final /* synthetic */ FinderFavFeedFragment f17353e;

    /* renamed from: f */
    public final /* synthetic */ int f17354f;

    public C3824b(Bitmap bitmap, FinderFavFeedFragment finderFavFeedFragment, int i) {
        this.f17352d = bitmap;
        this.f17353e = finderFavFeedFragment;
        this.f17354f = i;
    }

    public final void run() {
        Bitmap bitmap = this.f17352d;
        if (bitmap != null) {
            FinderFavFeedFragment finderFavFeedFragment = this.f17353e;
            int i = this.f17354f;
            int dimension = (int) finderFavFeedFragment.mo4171V().getResources().getDimension(C0966R.dimen.f3743cv);
            C58784w3 w3Var = C58784w3.f168295a;
            MMActivity V = finderFavFeedFragment.mo4171V();
            String string = finderFavFeedFragment.mo4171V().getString(C0966R.string.fno, new Object[]{Integer.valueOf(i)});
            C87412m.m108593f(string, "activity.getString(R.str…v_feed_title2_new, count)");
            finderFavFeedFragment.mo4171V().setMMTitle(w3Var.mo83960r1(V, string, '#', new BitmapDrawable(bitmap), C0966R.color.a7f, dimension, dimension));
        }
    }
}
