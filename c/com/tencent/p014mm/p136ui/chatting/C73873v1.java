package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73852u1;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.v1 */
public class C73873v1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ boolean f216789d;

    public C73873v1(C73852u1.C73861i iVar, boolean z) {
        this.f216789d = z;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107135b(2, C0966R.string.f7998ys, C0966R.raw.icons_filled_video_call);
        if (!this.f216789d) {
            e0Var.mo107135b(1, C0966R.string.f8000yu, C0966R.raw.icons_filled_call);
        }
    }
}
