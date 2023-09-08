package f00;

import com.tencent.p014mm.plugin.webview.model.C6026b2;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import g40.C32315i;

/* renamed from: f00.z */
public class C7969z implements C32315i {

    /* renamed from: d */
    public final byte[] f26650d = new byte[0];

    public void onNetworkChange(int i) {
        synchronized (this.f26650d) {
            String g = C44625c2.m49074g();
            if (g.equalsIgnoreCase("WIFI")) {
                C6026b2.f22273c.mo6995a(1);
            } else {
                C6026b2.f22273c.mo6995a(2);
            }
            C6080m.vx0(g);
        }
    }
}
