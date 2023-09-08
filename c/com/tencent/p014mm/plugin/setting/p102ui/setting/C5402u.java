package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import di3.C86312j;
import eb0.C75592q0;
import nj3.C11184p0;
import p159gw.C98250h;
import p196ln.C10579k;
import p196ln.C76706g;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.u */
public class C5402u implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ PreviewHdHeadImg f21088d;

    public C5402u(PreviewHdHeadImg previewHdHeadImg) {
        this.f21088d = previewHdHeadImg;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C76706g.class;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93149TE(this.f21088d);
        } else if (itemId == 2) {
            PreviewHdHeadImg previewHdHeadImg = this.f21088d;
            int i2 = PreviewHdHeadImg.f205624i;
            previewHdHeadImg.getClass();
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(previewHdHeadImg.getContext(), previewHdHeadImg.f205628g, new C5403v(previewHdHeadImg));
        } else if (itemId == 3) {
            Intent intent = new Intent();
            intent.setClass(this.f21088d.getContext(), PreviewLastHdHeadImg.class);
            C10579k RE = ((C76706g) C86312j.m106911c(cls)).mo106826RE();
            intent.putExtra("CropImage_OutputPath", ((AvatarStorage) RE).mo93558g(C75592q0.m90789s() + ".crop", true, false));
            C10579k RE2 = ((C76706g) C86312j.m106911c(cls)).mo106826RE();
            intent.putExtra("last_avatar_path", ((AvatarStorage) RE2).mo93558g(C75592q0.m90789s() + ".last", true, false));
            this.f21088d.startActivityForResult(intent, 4);
        }
    }
}
