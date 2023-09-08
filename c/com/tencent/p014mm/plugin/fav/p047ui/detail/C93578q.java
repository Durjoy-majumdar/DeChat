package com.tencent.p014mm.plugin.fav.p047ui.detail;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.vfs.C86013q1;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.q */
public class C93578q implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FavoriteVideoPlayUI f270246d;

    public C93578q(FavoriteVideoPlayUI favoriteVideoPlayUI) {
        this.f270246d = favoriteVideoPlayUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        FavoriteVideoPlayUI favoriteVideoPlayUI = this.f270246d;
        if (favoriteVideoPlayUI.f270194v) {
            if (C86013q1.m106450k(favoriteVideoPlayUI.f270180e)) {
                e0Var.add(0, 1, 0, (CharSequence) this.f270246d.getString(C0966R.string.crb));
            }
            e0Var.add(0, 2, 0, (CharSequence) this.f270246d.getString(C0966R.string.iar));
        }
    }
}
