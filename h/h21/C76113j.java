package h21;

import com.tencent.p014mm.plugin.collect.p038ui.CollectCreateQRCodeNewUI;
import qo3.C47883u;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: h21.j */
public class C76113j implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ CollectCreateQRCodeNewUI f223027a;

    /* renamed from: h21.j$a */
    public class C76114a implements Runnable {
        public C76114a() {
        }

        public void run() {
            C76113j.this.f223027a.showNormalStWcKb();
        }
    }

    public C76113j(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f223027a = collectCreateQRCodeNewUI;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        C119179t tVar = C119157j.f356862d;
        C76114a aVar = new C76114a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 300, false);
    }
}
