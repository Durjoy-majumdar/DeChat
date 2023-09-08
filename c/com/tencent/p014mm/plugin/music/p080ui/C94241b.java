package com.tencent.p014mm.plugin.music.p080ui;

import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.music.p080ui.FloatBallMusicLyricView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ma2.C99814o0;

/* renamed from: com.tencent.mm.plugin.music.ui.b */
public class C94241b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicPlayerEvent f272267d;

    /* renamed from: e */
    public final /* synthetic */ FloatBallMusicLyricView.C942283 f272268e;

    public C94241b(FloatBallMusicLyricView.C942283 r1, MusicPlayerEvent musicPlayerEvent) {
        this.f272268e = r1;
        this.f272267d = musicPlayerEvent;
    }

    public void run() {
        FloatBallMusicLyricView floatBallMusicLyricView = FloatBallMusicLyricView.this;
        String str = this.f272267d.f9336d.f9339c;
        int i = FloatBallMusicLyricView.f272190i;
        floatBallMusicLyricView.getClass();
        if (Util.isNullOrNil(C99814o0.wx0().mo140855jo(str).field_songHAlbumUrl)) {
            Log.m105920e("MicroMsg.FloatBallMusicLyricView", "updateLyric, should not be empty");
        } else {
            floatBallMusicLyricView.f272192e.setVisibility(8);
        }
    }
}
