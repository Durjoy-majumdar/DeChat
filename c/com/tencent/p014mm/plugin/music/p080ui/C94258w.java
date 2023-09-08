package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Intent;
import ke3.C88144b;
import ma2.C99812l0;
import nj3.C76879j;
import qa2.C101083d;
import qc0.C101106m;

/* renamed from: com.tencent.mm.plugin.music.ui.w */
public class C94258w implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ C101106m f272322a;

    /* renamed from: b */
    public final /* synthetic */ String f272323b;

    /* renamed from: c */
    public final /* synthetic */ String f272324c;

    /* renamed from: d */
    public final /* synthetic */ int f272325d;

    /* renamed from: e */
    public final /* synthetic */ MusicMainUI f272326e;

    public C94258w(MusicMainUI musicMainUI, C101106m mVar, String str, String str2, int i) {
        this.f272326e = musicMainUI;
        this.f272322a = mVar;
        this.f272323b = str;
        this.f272324c = str2;
        this.f272325d = i;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            MusicMainUI musicMainUI = this.f272326e;
            int i2 = C99812l0.f292500a;
            Intent intent = new Intent();
            intent.putExtra("mutil_select_is_ret", false);
            intent.putExtra("scene_from", 6);
            C88144b.m109802t(musicMainUI, ".ui.transmit.SelectConversationUI", intent, 1);
            C101083d.m132458g(this.f272326e.f272248r);
            C101083d.m132456e(2);
            this.f272326e.mo129552M7(254, this.f272322a, false);
        } else if (i == 1) {
            C99812l0.m130298c(this.f272322a, this.f272326e);
            C101083d.m132459h(this.f272326e.f272248r);
            C101083d.m132456e(1);
            this.f272326e.mo129552M7(253, this.f272322a, false);
        } else if (i == 2) {
            C99812l0.m130296a(this.f272322a, this.f272326e);
            C101083d.m132456e(3);
            MusicMainUI musicMainUI2 = this.f272326e;
            C101106m mVar = this.f272322a;
            int i3 = MusicMainUI.f272228I;
            musicMainUI2.mo129552M7(255, mVar, false);
        } else if (i == 3) {
            C99812l0.m130302g(this.f272323b, this.f272324c, this.f272325d);
        }
    }
}
