package com.tencent.p014mm.plugin.music.p080ui;

import com.tencent.p014mm.plugin.music.p080ui.MusicMainUI;

/* renamed from: com.tencent.mm.plugin.music.ui.q */
public class C94252q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicMainUI.C942324 f272308d;

    public C94252q(MusicMainUI.C942324 r1) {
        this.f272308d = r1;
    }

    public void run() {
        MusicViewPager musicViewPager = MusicMainUI.this.f272241h;
        musicViewPager.setCurrentItem(musicViewPager.getCurrentItem() + 1);
    }
}
