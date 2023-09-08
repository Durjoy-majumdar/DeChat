package com.tencent.p014mm.plugin.music.p080ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.music.ui.g */
public final class C4913g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FloatBallMusicViewNew f20038d;

    public C4913g(FloatBallMusicViewNew floatBallMusicViewNew) {
        this.f20038d = floatBallMusicViewNew;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/music/ui/FloatBallMusicViewNew$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f20038d.f20030g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/FloatBallMusicViewNew$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
