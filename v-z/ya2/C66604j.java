package ya2;

import android.widget.SeekBar;
import com.tencent.p014mm.plugin.music.p080ui.view.MusicPlayerSeekBar;

/* renamed from: ya2.j */
public final class C66604j implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MusicPlayerSeekBar f191524d;

    public C66604j(MusicPlayerSeekBar musicPlayerSeekBar) {
        this.f191524d = musicPlayerSeekBar;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f191524d.setSeeking(true);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f191524d.setSeeking(false);
        this.f191524d.getClass();
    }
}
