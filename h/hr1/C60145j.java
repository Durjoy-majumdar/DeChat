package hr1;

import com.tencent.p014mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager;

/* renamed from: hr1.j */
public final class C60145j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoAutoPlayManager f171686d;

    /* renamed from: e */
    public final /* synthetic */ String f171687e;

    public C60145j(FinderVideoAutoPlayManager finderVideoAutoPlayManager, String str) {
        this.f171686d = finderVideoAutoPlayManager;
        this.f171687e = str;
    }

    public final void run() {
        this.f171686d.f161970v.add(this.f171687e);
        FinderVideoAutoPlayManager finderVideoAutoPlayManager = this.f171686d;
        finderVideoAutoPlayManager.mo79661E1(finderVideoAutoPlayManager.f161959h, true);
    }
}
