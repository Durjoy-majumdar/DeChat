package com.tencent.p014mm.plugin.finder.p056ui;

import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.finder.ui.j2 */
public final class C3844j2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ boolean f17382d;

    public C3844j2(boolean z) {
        this.f17382d = z;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107125a(4000, C0966R.string.f360766el2);
            e0Var.mo107125a(4001, C0966R.string.enp);
            if (this.f17382d) {
                e0Var.mo107125a(WearableStatusCodes.DATA_ITEM_TOO_LARGE, C0966R.string.d3d);
            }
        }
    }
}
