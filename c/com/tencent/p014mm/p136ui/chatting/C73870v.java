package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.v */
public class C73870v implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ String f216782d;

    /* renamed from: e */
    public final /* synthetic */ List f216783e;

    /* renamed from: f */
    public final /* synthetic */ List f216784f;

    /* renamed from: g */
    public final /* synthetic */ String f216785g;

    public C73870v(AppAttachNewDownloadUI appAttachNewDownloadUI, String str, List list, List list2, String str2) {
        this.f216782d = str;
        this.f216783e = list;
        this.f216784f = list2;
        this.f216785g = str2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (!Util.isNullOrNil(this.f216782d)) {
            e0Var.setHeaderTitle((CharSequence) this.f216782d);
        }
        for (int i = 0; i < this.f216783e.size(); i++) {
            e0Var.mo107142f(((Integer) this.f216784f.get(i)).intValue(), (CharSequence) this.f216783e.get(i));
        }
        if (!Util.isNullOrNil(this.f216785g)) {
            e0Var.mo107142f(-1, this.f216785g);
        }
    }
}
