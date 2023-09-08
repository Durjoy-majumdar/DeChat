package com.tencent.p014mm.plugin.music.p080ui;

import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.music.ui.i */
public final class C4915i extends C87413o implements C32224a<Integer> {

    /* renamed from: d */
    public final /* synthetic */ FloatBallMusicViewNew f20041d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4915i(FloatBallMusicViewNew floatBallMusicViewNew) {
        super(0);
        this.f20041d = floatBallMusicViewNew;
    }

    public Object invoke() {
        return Integer.valueOf(this.f20041d.getResources().getDimensionPixelSize(C0966R.dimen.f3738cr));
    }
}
