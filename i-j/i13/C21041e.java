package i13;

import com.tencent.p014mm.plugin.transvoice.p324ui.SoundWaveView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i13.e */
public class C21041e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f59532d;

    /* renamed from: e */
    public final /* synthetic */ SoundWaveView f59533e;

    public C21041e(SoundWaveView soundWaveView, int i) {
        this.f59533e = soundWaveView;
        this.f59532d = i;
    }

    public void run() {
        SoundWaveView soundWaveView = this.f59533e;
        soundWaveView.mo25106g((float) soundWaveView.f54783f.get(this.f59532d).intValue(), (List) ((ArrayList) this.f59533e.f54787j).get(this.f59532d));
    }
}
