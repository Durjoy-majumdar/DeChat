package ya2;

import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import com.tencent.p014mm.plugin.music.p080ui.view.MusicMainSeekBar;
import gy3.C8479f0;

/* renamed from: ya2.h */
public final class C66603h implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMainSeekBar f191521d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Drawable> f191522e;

    /* renamed from: f */
    public final /* synthetic */ Drawable f191523f;

    public C66603h(MusicMainSeekBar musicMainSeekBar, C8479f0<Drawable> f0Var, Drawable drawable) {
        this.f191521d = musicMainSeekBar;
        this.f191522e = f0Var;
        this.f191523f = drawable;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        MusicMainSeekBar.C56892b bVar;
        if (z) {
            MusicMainSeekBar musicMainSeekBar = this.f191521d;
            MusicMainSeekBar.C56891a aVar = MusicMainSeekBar.f162979h;
            musicMainSeekBar.mo80326a(i);
            if (seekBar != null && (bVar = this.f191521d.f162981e) != null) {
                bVar.mo80333b(seekBar.getProgress(), seekBar.getMax());
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f191521d.setSeeking(true);
        this.f191521d.mo80326a(seekBar != null ? seekBar.getProgress() : 0);
        MusicMainSeekBar.C56892b bVar = this.f191521d.f162981e;
        if (bVar != null) {
            bVar.mo80332a();
        }
        if (seekBar != null) {
            seekBar.setThumb((Drawable) this.f191522e.f27484d);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f191521d.setSeeking(false);
        if (seekBar != null) {
            MusicMainSeekBar musicMainSeekBar = this.f191521d;
            Drawable drawable = this.f191523f;
            MusicMainSeekBar.C56892b bVar = musicMainSeekBar.f162981e;
            if (bVar != null) {
                bVar.mo80334c(seekBar.getProgress(), seekBar.getMax());
            }
            seekBar.setThumb(drawable);
        }
    }
}
