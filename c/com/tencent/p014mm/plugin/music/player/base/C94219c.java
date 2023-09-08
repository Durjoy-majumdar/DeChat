package com.tencent.p014mm.plugin.music.player.base;

import com.tencent.p014mm.sdk.platformtools.Log;
import qc0.C101106m;
import sa2.C101563e;

/* renamed from: com.tencent.mm.plugin.music.player.base.c */
public class C94219c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94221e f272182d;

    public C94219c(C94221e eVar) {
        this.f272182d = eVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.Music.BasePlayer", "onStart %b", Boolean.valueOf(this.f272182d.mo129529e()));
        C94221e eVar = this.f272182d;
        C94226i iVar = eVar.f272184a;
        C101106m mVar = eVar.f272185b;
        C101563e.C101564a aVar = (C101563e.C101564a) iVar;
        aVar.getClass();
        Log.m105924i("MicroMsg.Music.MusicPlayer", "setEvents, onStart");
        C101563e.this.mo141031v(mVar);
    }
}
