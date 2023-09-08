package my1;

import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.game.media.background.GameFakeVideoUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: my1.b */
public class C100026b implements C45059m0.C45068i {

    /* renamed from: a */
    public final /* synthetic */ GameFakeVideoUI f293047a;

    /* renamed from: my1.b$a */
    public class C100027a implements Runnable {
        public C100027a() {
        }

        public void run() {
            C100026b.this.f293047a.finish();
            C100026b.this.f293047a.overridePendingTransition(0, 0);
        }
    }

    public C100026b(GameFakeVideoUI gameFakeVideoUI) {
        this.f293047a = gameFakeVideoUI;
    }

    public void onAnimationEnd() {
        new MMHandler().post(new C100027a());
    }

    public void onAnimationStart() {
    }
}
