package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.ui.o0 */
public final class C93774o0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCropAvatarUI f270659d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93774o0(FinderCropAvatarUI finderCropAvatarUI) {
        super(0);
        this.f270659d = finderCropAvatarUI;
    }

    public Object invoke() {
        FinderCropAvatarUI finderCropAvatarUI = this.f270659d;
        int i = FinderCropAvatarUI.f270604C;
        int intValue = ((Number) ((C36570n) finderCropAvatarUI.f270612t).getValue()).intValue();
        if (intValue == 0) {
            C76879j.m92738i(this.f270659d, C0966R.string.d67, 0);
        } else if (intValue == 1) {
            C76879j.m92738i(this.f270659d, C0966R.string.d66, 0);
        }
        return C13598b0.f38549a;
    }
}
