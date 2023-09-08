package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.g */
public class C73685g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ String f216340d;

    /* renamed from: e */
    public final /* synthetic */ List f216341e;

    /* renamed from: f */
    public final /* synthetic */ List f216342f;

    /* renamed from: g */
    public final /* synthetic */ String f216343g;

    public C73685g(AppAttachDownloadUI appAttachDownloadUI, String str, List list, List list2, String str2) {
        this.f216340d = str;
        this.f216341e = list;
        this.f216342f = list2;
        this.f216343g = str2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (!Util.isNullOrNil(this.f216340d)) {
            e0Var.setHeaderTitle((CharSequence) this.f216340d);
        }
        for (int i = 0; i < this.f216341e.size(); i++) {
            e0Var.mo107142f(((Integer) this.f216342f.get(i)).intValue(), (CharSequence) this.f216341e.get(i));
        }
        if (!Util.isNullOrNil(this.f216343g)) {
            e0Var.mo107142f(-1, this.f216343g);
        }
    }
}
