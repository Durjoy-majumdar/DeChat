package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.app.Activity;
import di3.C86312j;
import jb2.C60787b;
import p529fv.C59330q;
import p749xh.C102658n6;
import te3.C64488kb1;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.q */
public class C56982q {

    /* renamed from: a */
    public C64488kb1 f163189a;

    /* renamed from: b */
    public C60787b f163190b;

    /* renamed from: a */
    public final void mo80429a(C102658n6 n6Var, C64488kb1 kb12) {
        kb12.f183904d = n6Var.field_songName;
        kb12.f183905e = n6Var.field_songSinger;
        kb12.f183908h = n6Var.field_songWebUrl;
        kb12.f183907g = "wx5aa333606550dfd5";
        kb12.f183906f = n6Var.field_songWifiUrl;
        kb12.f183912o = n6Var.field_songHAlbumUrl;
        kb12.f183911n = n6Var.field_songAlbum;
        kb12.f183909i = n6Var.field_originMusicId;
        kb12.f183922y = n6Var.field_mid;
    }

    /* renamed from: b */
    public C64488kb1 mo80430b(Activity activity) {
        if (this.f163189a == null) {
            C102658n6 bp = ((C59330q) C86312j.m106911c(C59330q.class)).mo84438bp(activity);
            C64488kb1 kb12 = new C64488kb1();
            this.f163189a = kb12;
            if (bp != null) {
                mo80429a(bp, kb12);
            }
        }
        return this.f163189a;
    }
}
