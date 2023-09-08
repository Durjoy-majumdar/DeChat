package i13;

import com.tencent.p014mm.plugin.transvoice.p324ui.SoundWaveView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i13.f */
public class C21042f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f59534d;

    /* renamed from: e */
    public final /* synthetic */ SoundWaveView f59535e;

    public C21042f(SoundWaveView soundWaveView, int i) {
        this.f59535e = soundWaveView;
        this.f59534d = i;
    }

    public void run() {
        SoundWaveView soundWaveView = this.f59535e;
        soundWaveView.mo25106g((float) soundWaveView.f54783f.get(this.f59534d).intValue(), (List) ((ArrayList) this.f59535e.f54787j).get(this.f59534d));
    }
}
