package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import nj3.C11182m0;
import nj3.C76874e0;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.t */
public class C71155t implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ PreviewHdHeadImg f205953d;

    public C71155t(PreviewHdHeadImg previewHdHeadImg) {
        this.f205953d = previewHdHeadImg;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107125a(1, C0966R.string.iqt);
        Bitmap Fj = ((C76708i) C86312j.m106911c(C76708i.class)).mo106820Fj(this.f205953d.f205626e, true);
        C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
        if (C86013q1.m106450k(((AvatarStorage) RE).mo93558g(C75592q0.m90789s() + ".last", true, false))) {
            e0Var.mo107125a(3, C0966R.string.iyf);
        }
        if (Fj != null) {
            e0Var.mo107125a(2, C0966R.string.fem);
        }
    }
}
