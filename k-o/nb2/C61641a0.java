package nb2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.music.p080ui.view.MusicMainSeekBar;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import iy3.C60641c;
import la2.C99364n;
import m03.C61426c;
import p640ox.C77049b;
import qc0.C101093a;
import te3.C64793w23;

/* renamed from: nb2.a0 */
public final class C61641a0 implements MusicMainSeekBar.C56892b {

    /* renamed from: a */
    public final /* synthetic */ C61647e f175288a;

    /* renamed from: b */
    public final /* synthetic */ RecyclerView.C16631z f175289b;

    public C61641a0(C61647e eVar, RecyclerView.C16631z zVar) {
        this.f175288a = eVar;
        this.f175289b = zVar;
    }

    /* renamed from: a */
    public void mo80332a() {
        ((MusicMvSongInfoUIC) C39818r.f106831a.mo62444c(this.f175288a.f175299e).mo75002a(MusicMvSongInfoUIC.class)).mo80489e3();
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f175288a.f175299e, 7, C64793w23.class);
        if (w232 != null) {
            w232.f186040n = 1;
        }
        this.f175289b.f44854d.removeCallbacks(this.f175288a.f175302h);
    }

    /* renamed from: b */
    public void mo80333b(int i, int i2) {
        Log.m105924i("MicroMsg.Mv.MvItemConvert", "onSeekBarChange " + i + ' ' + i2);
    }

    /* renamed from: c */
    public void mo80334c(int i, int i2) {
        Log.m105924i("MicroMsg.Mv.MvItemConvert", "onSeekEnd, seekPosition:" + i + ", max:" + i2);
        C101093a.m132487i(i);
        float duration = ((float) C99364n.m129616h().mo138822a().getDuration()) * (((float) i) / ((float) i2));
        View findViewById = this.f175289b.f44854d.findViewById(C0966R.C0970id.h7c);
        C61426c cVar = findViewById instanceof C61426c ? (C61426c) findViewById : null;
        if (cVar != null) {
            cVar.seekTo(C60641c.m70922c((double) duration));
        }
        C101093a.m132486h();
        this.f175289b.f44854d.postDelayed(this.f175288a.f175302h, 3000);
    }
}
