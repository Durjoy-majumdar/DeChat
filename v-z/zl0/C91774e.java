package zl0;

import android.nfc.NdefMessage;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import b34.C79665b;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84775p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;
import zl0.C91789o;
import zt3.C119157j;

/* renamed from: zl0.e */
public final class C91774e {

    /* renamed from: c */
    public static final C91776b f262832c = new C91776b((C8480h) null);

    /* renamed from: d */
    public static final Map<String, C91774e> f262833d = new ConcurrentHashMap();

    /* renamed from: e */
    public static C91776b.C91777a f262834e = new C91778c();

    /* renamed from: a */
    public final String f262835a;

    /* renamed from: b */
    public final C91768a f262836b;

    /* renamed from: zl0.e$a */
    public static final class C91775a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C91774e f262837d;

        public C91775a(C91774e eVar) {
            this.f262837d = eVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", "onDestroy");
            ((ConcurrentHashMap) C91774e.f262833d).remove(this.f262837d.f262835a);
        }
    }

    /* renamed from: zl0.e$b */
    public static final class C91776b {

        /* renamed from: zl0.e$b$a */
        public interface C91777a {
        }

        public C91776b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C91774e mo125637a(C82381f fVar) {
            C87412m.m108594g(fVar, "component");
            Map<String, C91774e> map = C91774e.f262833d;
            C91774e eVar = (C91774e) ((ConcurrentHashMap) map).get(fVar.getAppId());
            if (eVar != null) {
                return eVar;
            }
            C84775p1 p1Var = new C84775p1(fVar);
            C91776b bVar = C91774e.f262832c;
            C91777a aVar = C91774e.f262834e;
            String appId = fVar.getAppId();
            C87412m.m108593f(appId, "component.appId");
            ((C91778c) aVar).getClass();
            C91774e eVar2 = new C91774e(appId, new C91772d(appId, p1Var));
            String appId2 = fVar.getAppId();
            C87412m.m108593f(appId2, "component.appId");
            ((ConcurrentHashMap) map).put(appId2, eVar2);
            return eVar2;
        }
    }

    /* renamed from: zl0.e$c */
    public static final class C91778c implements C91776b.C91777a {
    }

    /* renamed from: zl0.e$d */
    public static final class C91779d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91774e f262838d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C91789o<C13598b0>, C13598b0> f262839e;

        /* renamed from: f */
        public final /* synthetic */ NdefMessage f262840f;

        public C91779d(C91774e eVar, C32226l<? super C91789o<C13598b0>, C13598b0> lVar, NdefMessage ndefMessage) {
            this.f262838d = eVar;
            this.f262839e = lVar;
            this.f262840f = ndefMessage;
        }

        public final void run() {
            C91774e eVar = this.f262838d;
            C32226l<C91789o<C13598b0>, C13598b0> lVar = this.f262839e;
            Tag a = C91774e.m115306a(eVar);
            if (a == null) {
                lVar.invoke(new C91789o.C91790a(13013, "NFC tag has not been discovered"));
            }
            if (a != null) {
                Ndef ndef = Ndef.get(a);
                if (ndef == null) {
                    this.f262839e.invoke(new C91789o.C91790a(13015, "unavailable tech"));
                    return;
                }
                try {
                    ndef.writeNdefMessage(this.f262840f);
                    this.f262839e.invoke(new C91789o.C91791b(C13598b0.f38549a));
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.AppBrand.NFCReadWriteManager", "writeNdefMessage failed since " + e);
                    C32226l<C91789o<C13598b0>, C13598b0> lVar2 = this.f262839e;
                    lVar2.invoke(new C91789o.C91790a(13017, "system internal error: " + e.getMessage()));
                }
            }
        }
    }

    public C91774e(String str, C91768a aVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(aVar, "nfcDiscoverable");
        this.f262835a = str;
        this.f262836b = aVar;
        C83231l.m102140a(str, new C91775a(this));
    }

    /* renamed from: a */
    public static final Tag m115306a(C91774e eVar) {
        return eVar.f262836b.getTag();
    }

    /* renamed from: b */
    public static final Throwable m115307b(C91774e eVar, Throwable th) {
        eVar.getClass();
        if (!(th instanceof C79665b)) {
            return th;
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            return cause.getCause();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo125636c(NdefMessage ndefMessage, C32226l<? super C91789o<C13598b0>, C13598b0> lVar) {
        C87412m.m108594g(ndefMessage, StateEvent.Name.MESSAGE);
        C87412m.m108594g(lVar, "callback");
        Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", "writeNdefMessage, message: " + ndefMessage);
        ((C119157j) C119157j.f356862d).mo183876g(new C91779d(this, lVar, ndefMessage), "NFC-IO");
    }
}
