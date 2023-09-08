package hi0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import hp3.C87581a;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import ki0.C88153c;
import ki0.C88154d;
import lp3.C88643g;
import nr3.C89059e;
import nr3.C89060f;
import u24.C90599h;

/* renamed from: hi0.p */
public enum C87502p implements C87508v {
    _INSTANCE;
    

    /* renamed from: d */
    public volatile boolean f253499d;

    /* renamed from: e */
    public volatile C89059e<Void> f253500e;

    /* renamed from: f */
    public final Set<String> f253501f;

    /* renamed from: hi0.p$a */
    public class C87503a implements C87581a<Void, Void> {
        public C87503a() {
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            try {
                C87502p.m108815c(C87502p.this);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", th, "handleRetry()", new Object[0]);
                C88643g.m110544b().mo72091a((Object) null);
                synchronized (C87502p.this) {
                    C87502p.this.f253499d = false;
                    ((ConcurrentSkipListSet) C87502p.this.f253501f).clear();
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public static void m108815c(C87502p pVar) {
        pVar.getClass();
        Class cls = C88154d.class;
        if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            Log.m105920e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but disconnected");
            C88643g.m110544b().mo72091a((Object) null);
            synchronized (pVar) {
                pVar.f253499d = false;
                ((ConcurrentSkipListSet) pVar.f253501f).clear();
            }
        } else if (!C86709a0.m107523b().f251765p) {
            Log.m105920e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but account not ready");
            C88643g.m110544b().mo72091a((Object) null);
            synchronized (pVar) {
                pVar.f253499d = false;
                ((ConcurrentSkipListSet) pVar.f253501f).clear();
            }
        } else {
            Context context = MMApplicationContext.getContext();
            int i = NetStatusUtil.isWifi(context) ? 1 : NetStatusUtil.is2G(context) ? 2 : NetStatusUtil.is3G(context) ? 4 : NetStatusUtil.is4G(context) ? 8 : -1;
            LinkedList<C88153c> linkedList = new LinkedList<>();
            C88154d dVar = (C88154d) C81161g2.Bx0(cls);
            dVar.getClass();
            linkedList.addAll(dVar.mo122563qq("networkType=?", String.valueOf(0)));
            C88154d dVar2 = (C88154d) C81161g2.Bx0(cls);
            dVar2.getClass();
            for (C88153c next : dVar2.mo122563qq("networkType<>?", String.valueOf(0))) {
                if ((next.field_networkType & i) > 0) {
                    linkedList.add(next);
                }
            }
            if (Util.isNullOrNil((List) linkedList)) {
                Log.m105924i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but records empty, interrupt");
                C88643g.m110544b().mo72091a((Object) null);
                synchronized (pVar) {
                    pVar.f253499d = false;
                    ((ConcurrentSkipListSet) pVar.f253501f).clear();
                }
                return;
            }
            boolean z = C32923u.f89497a;
            for (C88153c cVar : linkedList) {
                if (!z || cVar.field_type != 0) {
                    pVar.f253500e.mo123420E(new C87504q(pVar, cVar));
                }
            }
            pVar.f253500e.mo123420E(new C87506s(pVar));
        }
    }

    /* renamed from: a */
    public boolean mo121959a(String str) {
        return !C90599h.m113511d(str) && ((ConcurrentSkipListSet) this.f253501f).contains(str);
    }

    /* renamed from: b */
    public synchronized void mo121960b() {
        Log.m105925i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry stack:%s", android.util.Log.getStackTraceString(new Throwable()));
        if (!C86709a0.m107523b().f251765p) {
            Log.m105920e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, account not ready");
            if (this.f253500e != null) {
                this.f253500e.mo123058O();
            }
            this.f253499d = false;
            ((ConcurrentSkipListSet) this.f253501f).clear();
        } else if (this.f253499d) {
            Log.m105918d("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, queueRunning, skip");
        } else {
            Log.m105924i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, set flag queue running");
            this.f253499d = true;
            this.f253500e = C89060f.m111322a();
            this.f253500e.mo123060U(new C87503a());
        }
    }

    /* renamed from: t */
    public synchronized void mo121961t() {
        if (this.f253500e != null) {
            this.f253500e.mo123058O();
        }
        this.f253499d = false;
        ((ConcurrentSkipListSet) this.f253501f).clear();
    }
}
