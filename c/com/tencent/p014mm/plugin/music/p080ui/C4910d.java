package com.tencent.p014mm.plugin.music.p080ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.music.ui.d */
public final class C4910d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FloatBallMusicView f20034d;

    public C4910d(FloatBallMusicView floatBallMusicView) {
        this.f20034d = floatBallMusicView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/music/ui/FloatBallMusicView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f20034d.f20024n;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/FloatBallMusicView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
