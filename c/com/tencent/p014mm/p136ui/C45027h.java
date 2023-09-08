package com.tencent.p014mm.p136ui;

import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import jw2.C99069d;
import p626nv.C109759g;
import p773yy.C79168k;
import qy2.C77448f0;

/* renamed from: com.tencent.mm.ui.h */
public class C45027h implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ AlbumUI f122123d;

    public C45027h(AlbumUI albumUI) {
        this.f122123d = albumUI;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        DoubleTabView doubleTabView = this.f122123d.f121105d;
        doubleTabView.f121138i.setTranslate(((float) doubleTabView.f121133d) * (((float) i) + f), 0.0f);
        doubleTabView.f121137h.setImageMatrix(doubleTabView.f121138i);
    }

    public void onPageSelected(int i) {
        this.f122123d.f121105d.setTo(i);
        if (i == 0) {
            C99069d.f290419b.f266262d = 3;
        } else {
            C99069d.f290419b.f266262d = 2;
            AlbumUI albumUI = this.f122123d;
            if (albumUI.f121108g) {
                DoubleTabView doubleTabView = albumUI.f121105d;
                doubleTabView.f121145s = false;
                MMTabView mMTabView = doubleTabView.f121140n;
                if (mMTabView != null) {
                    mMTabView.f121184e.setVisibility(4);
                }
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_STORY_NEED_DISPLAY_ALBUM_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
            }
        }
        C99069d.f290418a.mo138413b();
        if (!C77448f0.m93394f() || i != 1) {
            this.f122123d.showOptionMenu(false);
            return;
        }
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74111Ij(13, this.f122123d.f121105d.f121145s ? "1" : "0");
        ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(37);
        this.f122123d.showOptionMenu(true);
    }
}
