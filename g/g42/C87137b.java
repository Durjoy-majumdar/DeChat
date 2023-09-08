package g42;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import org.xwalk.core.XWalkEnvironment;
import p564iq.C87790d;
import ui3.C90664c;
import zt3.C119157j;

/* renamed from: g42.b */
public final class C87137b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87140c f252728d;

    /* renamed from: g42.b$a */
    public static final class C87138a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87140c f252729d;

        public C87138a(C87140c cVar) {
            this.f252729d = cVar;
        }

        public final void run() {
            this.f252729d.f252736j = Boolean.valueOf(Util.isProcessRunning(MMApplicationContext.getContext(), WeChatProcess.PROCESS_APPBRAND1));
        }
    }

    /* renamed from: g42.b$b */
    public static final class C87139b implements C87790d.C33382a {

        /* renamed from: a */
        public final /* synthetic */ C87140c f252730a;

        public C87139b(C87140c cVar) {
            this.f252730a = cVar;
        }

        /* renamed from: a */
        public void mo55610a(C90664c cVar) {
            Log.m105924i("MagicBrushClientMgr", "Install appbrand success");
            C87140c.m108160a(this.f252730a);
        }
    }

    public C87137b(C87140c cVar) {
        this.f252728d = cVar;
    }

    public final void run() {
        Class cls = C87790d.class;
        if (this.f252728d.f252735i == null) {
            Log.m105924i("MagicBrushClientMgr", "bindServiceIfNeeded");
            ((C119157j) C119157j.f356862d).mo183884o(new C87138a(this.f252728d));
            if (((C87790d) C86312j.m106911c(cls)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
                C87140c.m108160a(this.f252728d);
            } else {
                ((C87790d) C86312j.m106911c(cls)).nx0(new C87139b(this.f252728d));
            }
        }
    }
}
