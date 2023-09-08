package w93;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44019a;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44307k0;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import d93.C45310h;

/* renamed from: w93.a */
public class C53088a extends C44307k0 {

    /* renamed from: w93.a$b */
    public class C53090b extends C44307k0.C44335i {
        public C53090b(C53089a aVar) {
            super();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.m105924i("MicroMsg.GameFloatWebViewClient", "onServiceConnected");
            C53088a aVar = C53088a.this;
            if (aVar.f120072b == null) {
                Log.m105920e("MicroMsg.GameFloatWebViewClient", "onServiceConnected, activity destroyed");
                return;
            }
            try {
                aVar.f120074d = C43791l.C43792a.m47732a(iBinder);
                C53088a aVar2 = C53088a.this;
                aVar2.f120074d.Np0(aVar2.f120070B, aVar2.f120072b.hashCode());
                C53088a.this.mo69047P();
                C53088a aVar3 = C53088a.this;
                C43791l lVar = aVar3.f120074d;
                C45310h hVar = aVar3.f120075e;
                C44019a.this.f119264f = lVar;
                aVar3.mo68626R();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GameFloatWebViewClient", "addCallback fail, ex = %s", e.getMessage());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            super.onServiceDisconnected(componentName);
        }
    }

    public C53088a(MMWebView mMWebView) {
        super(mMWebView, false, (Bundle) null);
        this.f120069A = new C53090b((C53089a) null);
    }

    /* renamed from: R */
    public void mo68626R() {
        throw null;
    }

    /* renamed from: g0 */
    public boolean mo68637g0(String str) {
        return super.mo68637g0(str);
    }
}
