package cp1;

import android.widget.SeekBar;
import bp1.C54519d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import vo1.C65770a0;

/* renamed from: cp1.k */
public final class C57950k implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveReplaySeekbar f165848d;

    public C57950k(FinderLiveReplaySeekbar finderLiveReplaySeekbar) {
        this.f165848d = finderLiveReplaySeekbar;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C87412m.m108594g(seekBar, "seekBar");
        String str = this.f165848d.f160801d;
        Log.m105918d(str, "on progress changed " + i);
        FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f165848d;
        if (finderLiveReplaySeekbar.f160816v) {
            C45795b bVar = C65770a0.f189184r.mo89819a().f189189c;
            float i3 = (float) (bVar != null ? ((C54519d) bVar.mo71262a(C54519d.class)).mo75375i3() : -1);
            int max = (int) ((((float) finderLiveReplaySeekbar.f160813s) / ((float) finderLiveReplaySeekbar.getMax())) * i3);
            int progress = (int) ((((float) finderLiveReplaySeekbar.getProgress()) / ((float) finderLiveReplaySeekbar.getMax())) * i3);
            Iterator it = ((ArrayList) finderLiveReplaySeekbar.f160815u).iterator();
            while (it.hasNext()) {
                int i2 = ((FinderLiveReplaySeekbar.C56261a) it.next()).f160818b.f185060d;
                if (progress == i2 || ((max < i2 && progress > i2) || (max > i2 && progress < i2))) {
                    finderLiveReplaySeekbar.f160812r.vibrate(50);
                }
            }
            finderLiveReplaySeekbar.f160813s = finderLiveReplaySeekbar.getProgress();
            if (finderLiveReplaySeekbar.getProgress() == 0 || finderLiveReplaySeekbar.getProgress() == finderLiveReplaySeekbar.getMax()) {
                finderLiveReplaySeekbar.f160812r.vibrate(50);
            }
        }
        for (SeekBar.OnSeekBarChangeListener onProgressChanged : this.f165848d.f160810p) {
            onProgressChanged.onProgressChanged(seekBar, i, z);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C87412m.m108594g(seekBar, "seekBar");
        FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f165848d;
        finderLiveReplaySeekbar.setThumb(finderLiveReplaySeekbar.getContext().getDrawable(C0966R.C0969drawable.cpw));
        for (SeekBar.OnSeekBarChangeListener onStartTrackingTouch : this.f165848d.f160810p) {
            onStartTrackingTouch.onStartTrackingTouch(seekBar);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C87412m.m108594g(seekBar, "seekBar");
        FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f165848d;
        finderLiveReplaySeekbar.setThumb(finderLiveReplaySeekbar.getContext().getDrawable(C0966R.C0969drawable.f357403cq0));
        for (SeekBar.OnSeekBarChangeListener onStopTrackingTouch : this.f165848d.f160810p) {
            onStopTrackingTouch.onStopTrackingTouch(seekBar);
        }
    }
}
