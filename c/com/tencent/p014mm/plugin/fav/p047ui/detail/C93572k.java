package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.k */
public class C93572k implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f270237d;

    /* renamed from: e */
    public final /* synthetic */ FavoriteImgDetailUI.C93530h f270238e;

    /* renamed from: f */
    public final /* synthetic */ FavoriteImgDetailUI f270239f;

    public C93572k(FavoriteImgDetailUI favoriteImgDetailUI, C77407n nVar, FavoriteImgDetailUI.C93530h hVar) {
        this.f270239f = favoriteImgDetailUI;
        this.f270237d = nVar;
        this.f270238e = hVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        this.f270237d.mo107567l((View) null);
        FavoriteImgDetailUI favoriteImgDetailUI = this.f270239f;
        if (favoriteImgDetailUI.f270094r) {
            if (favoriteImgDetailUI.f270091o.mo140184m2()) {
                e0Var.mo107142f(2, this.f270239f.getContext().getString(C0966R.string.crb));
            }
            if (this.f270239f.f270091o.mo140185n2()) {
                e0Var.mo107142f(1, this.f270239f.getContext().getString(C0966R.string.cpw));
            }
            e0Var.mo107142f(3, this.f270239f.getContext().getString(C0966R.string.cr5));
            if (!Util.isNullOrNil(this.f270238e.f270121e)) {
                C77407n nVar = this.f270237d;
                FavoriteImgDetailUI favoriteImgDetailUI2 = this.f270239f;
                FavoriteImgDetailUI.C93530h hVar = this.f270238e;
                favoriteImgDetailUI2.getClass();
                C93568h hVar2 = new C93568h(favoriteImgDetailUI2, hVar);
                Log.m105925i("MicroMsg.FavoriteImgDetailUI", "alvinluo fetchCodeInfo code: %s, hasGet: %b", hVar.f270121e, Boolean.valueOf(hVar.f270124h));
                if (!hVar.f270124h) {
                    hVar.f270124h = true;
                    ((ScanCodeSheetItemLogic) favoriteImgDetailUI2.f270095s).mo67077h(hVar.f270122f, hVar.f270121e);
                }
                nVar.mo107567l(((ScanCodeSheetItemLogic) favoriteImgDetailUI2.f270095s).mo67071b(hVar2, hVar.f270122f, hVar.f270121e, 4));
            }
        }
    }
}
