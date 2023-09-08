package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.t */
public class C93582t implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ FavoriteVideoPlayUI f270253d;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.t$a */
    public class C93583a implements C45059m0.C45068i {
        public C93583a() {
        }

        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
            FavVideoView favVideoView = C93582t.this.f270253d.f270187o;
            if (favVideoView != null) {
                favVideoView.mo128630e();
            }
        }
    }

    public C93582t(FavoriteVideoPlayUI favoriteVideoPlayUI) {
        this.f270253d = favoriteVideoPlayUI;
    }

    public boolean onPreDraw() {
        this.f270253d.f270187o.getViewTreeObserver().removeOnPreDrawListener(this);
        FavoriteVideoPlayUI favoriteVideoPlayUI = this.f270253d;
        favoriteVideoPlayUI.f270195w.mo70408c(favoriteVideoPlayUI.f270187o, favoriteVideoPlayUI.f270186n, new C93583a());
        return true;
    }
}
