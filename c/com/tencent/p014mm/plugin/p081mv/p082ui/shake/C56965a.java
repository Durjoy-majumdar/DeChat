package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.a */
public class C56965a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicMainUINew f163163d;

    public C56965a(MusicMainUINew musicMainUINew) {
        this.f163163d = musicMainUINew;
    }

    public void run() {
        MusicMainUINew musicMainUINew = this.f163163d;
        musicMainUINew.f163146j.startAnimation(AnimationUtils.loadAnimation(musicMainUINew.getContext(), C0966R.C0968anim.f2525fe));
    }
}
