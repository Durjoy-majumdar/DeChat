package com.tencent.p014mm.plugin.fav.p047ui.detail;

import com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.m */
public class C93574m implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ FavoriteImgDetailUI.C93530h f270242a;

    /* renamed from: b */
    public final /* synthetic */ FavoriteImgDetailUI f270243b;

    public C93574m(FavoriteImgDetailUI favoriteImgDetailUI, FavoriteImgDetailUI.C93530h hVar) {
        this.f270243b = favoriteImgDetailUI;
        this.f270242a = hVar;
    }

    public void onDismiss() {
        FavoriteImgDetailUI favoriteImgDetailUI = this.f270243b;
        FavoriteImgDetailUI.C93530h hVar = this.f270242a;
        int i = FavoriteImgDetailUI.f270088w;
        favoriteImgDetailUI.getClass();
        hVar.f270120d = false;
        hVar.f270124h = false;
        hVar.f270121e = null;
        hVar.f270122f = 0;
        hVar.f270123g = 0;
        ((ScanCodeSheetItemLogic) this.f270243b.f270095s).mo67083n();
    }
}
