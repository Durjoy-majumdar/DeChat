package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Intent;
import ke3.C88144b;
import ma2.C99812l0;
import nj3.C76879j;
import qa2.C101083d;
import qc0.C101106m;

/* renamed from: com.tencent.mm.plugin.music.ui.y */
public class C94260y implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ C101106m f272330a;

    /* renamed from: b */
    public final /* synthetic */ MusicMainUI f272331b;

    public C94260y(MusicMainUI musicMainUI, C101106m mVar) {
        this.f272331b = musicMainUI;
        this.f272330a = mVar;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            MusicMainUI musicMainUI = this.f272331b;
            int i2 = C99812l0.f292500a;
            Intent intent = new Intent();
            intent.putExtra("mutil_select_is_ret", false);
            intent.putExtra("scene_from", 6);
            C88144b.m109802t(musicMainUI, ".ui.transmit.SelectConversationUI", intent, 1);
            C101083d.m132458g(this.f272331b.f272248r);
            C101083d.m132456e(2);
        } else if (i == 1) {
            C99812l0.m130298c(this.f272330a, this.f272331b);
            C101083d.m132459h(this.f272331b.f272248r);
            C101083d.m132456e(1);
        } else if (i == 2) {
            C99812l0.m130296a(this.f272330a, this.f272331b);
            C101083d.m132456e(3);
        } else if (i == 3) {
            C99812l0.m130297b(this.f272330a, this.f272331b);
            C101083d.m132456e(4);
        }
    }
}
