package do0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import eo0.C86625d;
import eo0.C86629f;
import java.util.Vector;

public class a$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82870p f251166d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f251167e;

    /* renamed from: f */
    public final /* synthetic */ C86384a f251168f;

    public a$$c(C86384a aVar, C82870p pVar, Runnable runnable) {
        this.f251168f = aVar;
        this.f251166d = pVar;
        this.f251167e = runnable;
    }

    public void run() {
        C86384a aVar = this.f251168f;
        if (aVar.f251154g == null) {
            C82870p pVar = this.f251166d;
            if ((pVar instanceof C86625d) || (pVar instanceof C86629f)) {
                ((Vector) aVar.f251157j).add(this.f251167e);
                return;
            }
        }
        this.f251167e.run();
    }
}
