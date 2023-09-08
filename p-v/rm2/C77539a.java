package rm2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.selectrecord.p890ui.RecordSelectTipsBar;

/* renamed from: rm2.a */
public class C77539a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecordSelectTipsBar f226062d;

    public C77539a(RecordSelectTipsBar recordSelectTipsBar) {
        this.f226062d = recordSelectTipsBar;
    }

    public void run() {
        this.f226062d.f205577d.setVisibility(0);
        this.f226062d.f205577d.setText(C0966R.string.ijs);
        this.f226062d.f205578e.setVisibility(8);
        this.f226062d.f205580g.setVisibility(8);
    }
}
