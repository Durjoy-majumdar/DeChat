package tl2;

import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import gy3.C87412m;
import java.util.TimerTask;
import p907k3.C108867b;
import p907k3.C108879d;
import p907k3.C108880e;
import zt3.C119157j;

/* renamed from: tl2.p */
public final class C111030p extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsMaskView f332508d;

    /* renamed from: tl2.p$a */
    public static final class C111031a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanGoodsMaskView f332509d;

        public C111031a(ScanGoodsMaskView scanGoodsMaskView) {
            this.f332509d = scanGoodsMaskView;
        }

        public final void run() {
            ScanGoodsMaskView scanGoodsMaskView = this.f332509d;
            if (scanGoodsMaskView.f315902D) {
                LinearLayout linearLayout = scanGoodsMaskView.f315906H;
                if (linearLayout == null) {
                    C87412m.m108603p("customTipsImageContainer");
                    throw null;
                } else if (linearLayout.getVisibility() == 0) {
                    ScanGoodsMaskView scanGoodsMaskView2 = this.f332509d;
                    LinearLayout linearLayout2 = scanGoodsMaskView2.f315906H;
                    if (linearLayout2 != null) {
                        C108879d dVar = new C108879d(linearLayout2, C108867b.f326007l);
                        dVar.f326014a = 4000.0f;
                        C108880e eVar = new C108880e(0.0f);
                        eVar.mo159993b(3000.0f);
                        eVar.mo159992a(0.05f);
                        dVar.f326027s = eVar;
                        dVar.f326015b = -10.0f;
                        dVar.f326016c = true;
                        dVar.mo159991e();
                        scanGoodsMaskView2.f315925V0 = dVar;
                        return;
                    }
                    C87412m.m108603p("customTipsImageContainer");
                    throw null;
                }
            }
        }
    }

    public C111030p(ScanGoodsMaskView scanGoodsMaskView) {
        this.f332508d = scanGoodsMaskView;
    }

    public void run() {
        ((C119157j) C119157j.f356862d).mo183895z(new C111031a(this.f332508d));
    }
}
