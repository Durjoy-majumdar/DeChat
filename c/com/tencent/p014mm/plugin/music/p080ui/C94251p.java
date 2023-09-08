package com.tencent.p014mm.plugin.music.p080ui;

import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.music.p080ui.MusicMainUI;
import la2.C99358f;
import ua2.C101991b;

/* renamed from: com.tencent.mm.plugin.music.ui.p */
public class C94251p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicPlayerEvent f272306d;

    /* renamed from: e */
    public final /* synthetic */ MusicMainUI.C942324 f272307e;

    public C94251p(MusicMainUI.C942324 r1, MusicPlayerEvent musicPlayerEvent) {
        this.f272307e = r1;
        this.f272306d = musicPlayerEvent;
    }

    public void run() {
        Class cls = C99358f.class;
        if (this.f272306d.f9336d.f9337a == 0 && ((C99358f) C101991b.m134284b(cls)).getMode() != 2) {
            MusicMainUI musicMainUI = MusicMainUI.this;
            musicMainUI.f272241h.setAdapter(musicMainUI.f272243j);
            MusicMainUI.this.f272241h.setCurrentItem(((C99358f) C101991b.m134284b(cls)).mo138817q() + 100000);
        }
        MusicMainUI musicMainUI2 = MusicMainUI.this;
        int i = MusicMainUI.f272228I;
        musicMainUI2.mo129555P7();
    }
}
