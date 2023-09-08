package com.tencent.p014mm.plugin.music.player.base;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import la2.C99364n;
import qc0.C101106m;
import sa2.C101563e;

/* renamed from: com.tencent.mm.plugin.music.player.base.e */
public abstract class C94221e {

    /* renamed from: a */
    public C94226i f272184a;

    /* renamed from: b */
    public C101106m f272185b;

    /* renamed from: c */
    public C94227j f272186c = new C94227j();

    /* renamed from: com.tencent.mm.plugin.music.player.base.e$a */
    public class C94222a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f272187d;

        public C94222a(boolean z) {
            this.f272187d = z;
        }

        public void run() {
            Log.m105925i("MicroMsg.Music.BasePlayer", "onStop, isComplete:%b", Boolean.valueOf(this.f272187d));
            C94221e eVar = C94221e.this;
            C94226i iVar = eVar.f272184a;
            C101106m mVar = eVar.f272185b;
            boolean z = this.f272187d;
            C101563e.C101564a aVar = (C101563e.C101564a) iVar;
            aVar.getClass();
            Log.m105924i("MicroMsg.Music.MusicPlayer", "setEvents, onStop");
            C101106m k = C99364n.m129616h().mo138832k();
            if (k != null) {
                if (k.mo140555a(mVar)) {
                    C101563e.this.mo32210j();
                }
                C101563e eVar2 = C101563e.this;
                eVar2.mo141032w(eVar2.f297323q);
                if (z) {
                    C101563e eVar3 = C101563e.this;
                    eVar3.mo141023n(eVar3.f297323q);
                }
            }
        }
    }

    /* renamed from: a */
    public abstract int mo129525a();

    /* renamed from: b */
    public abstract int mo129526b();

    /* renamed from: c */
    public abstract String mo129527c();

    /* renamed from: d */
    public abstract boolean mo129528d();

    /* renamed from: e */
    public abstract boolean mo129529e();

    /* renamed from: f */
    public void mo129530f(boolean z) {
        if (this.f272184a != null) {
            MMHandlerThread.postToMainThread(new C94222a(z));
        }
    }

    /* renamed from: g */
    public abstract void mo129531g();

    /* renamed from: h */
    public abstract void mo129532h();

    /* renamed from: i */
    public abstract void mo129533i(long j);

    /* renamed from: j */
    public abstract void mo129534j(String str);

    /* renamed from: k */
    public abstract void mo129535k();
}
