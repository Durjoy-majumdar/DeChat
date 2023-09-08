package sb2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: sb2.w */
public final class C63868w extends RecyclerView.C16615g {

    /* renamed from: a */
    public final /* synthetic */ MusicMvMakerFixEditUIC f181054a;

    /* renamed from: sb2.w$a */
    public static final class C63869a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerFixEditUIC f181055d;

        public C63869a(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
            this.f181055d = musicMvMakerFixEditUIC;
        }

        public final void run() {
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = this.f181055d;
            musicMvMakerFixEditUIC.f163339n.mo75025b(musicMvMakerFixEditUIC.mo80476g3());
        }
    }

    /* renamed from: sb2.w$b */
    public static final class C63870b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvMakerFixEditUIC f181056d;

        public C63870b(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
            this.f181056d = musicMvMakerFixEditUIC;
        }

        public final void run() {
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = this.f181056d;
            MusicMvMakerFixEditUIC.m65737c3(musicMvMakerFixEditUIC, musicMvMakerFixEditUIC.f163341p);
        }
    }

    public C63868w(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
        this.f181054a = musicMvMakerFixEditUIC;
    }

    /* renamed from: b */
    public void mo2556b() {
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onChanged: " + this.f181054a.mo80475f3().getItemCount());
        MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = this.f181054a;
        if (musicMvMakerFixEditUIC.f163339n.f187878m == -1) {
            musicMvMakerFixEditUIC.mo80476g3().post(new C63869a(this.f181054a));
        }
    }

    /* renamed from: c */
    public void mo2557c(int i, int i2) {
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onItemRangeChanged, start:" + i + ", itemCount:" + i2 + ", lastPos:" + this.f181054a.f163341p);
        int i3 = i2 + i;
        MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = this.f181054a;
        int i4 = musicMvMakerFixEditUIC.f163341p;
        boolean z = false;
        if (i <= i4 && i4 < i3) {
            z = true;
        }
        if (z) {
            musicMvMakerFixEditUIC.mo80476g3().post(new C63870b(this.f181054a));
        }
    }

    /* renamed from: d */
    public void mo2558d(int i, int i2, Object obj) {
        if (obj == null) {
            Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onItemRangeChanged, start:" + i + ", itemCount:" + i2 + ", lastPos:" + this.f181054a.f163341p + ", payload:" + obj);
            mo2557c(i, i2);
        }
    }
}
