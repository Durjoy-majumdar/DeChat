package fj0;

import android.text.TextUtils;
import cj0.C80039a;
import com.google.android.gms.stats.CodePackage;
import com.tencent.xweb.util.WXWebReporter;
import dj0.C86327d;
import dj0.C86328e;
import dj0.C86332h;
import ej0.C58606a;
import ej0.C86524b;
import ej0.C86525c;
import gj0.C87227a;
import hj0.C87532b;
import hj0.C87535e;
import ij0.C87742a;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jj0.C87972b;
import l34.C117453e;
import n34.C117604b;
import v34.C118646b;

/* renamed from: fj0.q */
public class C86898q {

    /* renamed from: h */
    public static final /* synthetic */ int f252215h = 0;

    /* renamed from: a */
    public C118646b f252216a = new C118646b();

    /* renamed from: b */
    public Lock f252217b = new ReentrantReadWriteLock(true).writeLock();

    /* renamed from: c */
    public boolean f252218c = false;

    /* renamed from: d */
    public int f252219d = -1;

    /* renamed from: e */
    public C86892n f252220e;

    /* renamed from: f */
    public Pattern f252221f = Pattern.compile("uuid:([a-fA-F\\d]{8}(-[a-fA-F\\d]{4}){3}-[a-fA-F\\d]{12})");

    /* renamed from: g */
    public Set<String> f252222g = new HashSet();

    /* renamed from: fj0.q$e */
    public static class C59104e {

        /* renamed from: a */
        public static C86898q f169066a = new C86898q();
    }

    /* renamed from: fj0.q$a */
    public class C86899a implements C117604b<C87535e> {

        /* renamed from: d */
        public final /* synthetic */ C86328e f252223d;

        /* renamed from: e */
        public final /* synthetic */ C87227a f252224e;

        public C86899a(C86898q qVar, C86328e eVar, C87227a aVar) {
            this.f252223d = eVar;
            this.f252224e = aVar;
        }

        public void call(Object obj) {
            C87535e eVar = (C87535e) obj;
            int i = C86898q.f252215h;
            C80039a.m97317b("q", "Send Tcp Custom:" + this.f252223d.mo120719b() + " response: code=" + eVar.f253592c);
            C87227a aVar = this.f252224e;
            if (aVar == null) {
                return;
            }
            if (eVar.f253592c == 200) {
                aVar.mo88411b(eVar);
            } else {
                aVar.mo88410a(eVar);
            }
        }
    }

    /* renamed from: fj0.q$b */
    public class C86900b implements C117604b<Throwable> {

        /* renamed from: d */
        public final /* synthetic */ C87227a f252225d;

        public C86900b(C86898q qVar, C87227a aVar) {
            this.f252225d = aVar;
        }

        public void call(Object obj) {
            Throwable th = (Throwable) obj;
            if (!(th == null || th.getMessage() == null)) {
                int i = C86898q.f252215h;
                C80039a.m97316a("q", "sendTcpCustom fail: " + th.getMessage());
            }
            C87227a aVar = this.f252225d;
            if (aVar != null) {
                aVar.mo88410a((C87535e) null);
            }
        }
    }

    /* renamed from: fj0.q$c */
    public class C86901c implements C117604b<C86524b> {

        /* renamed from: d */
        public final /* synthetic */ C87532b f252226d;

        public C86901c(C87532b bVar) {
            this.f252226d = bVar;
        }

        public void call(Object obj) {
            C86524b bVar = (C86524b) obj;
            if (bVar != null && bVar.f251377f != null && bVar.f251378g != null) {
                ((HashSet) C86898q.this.f252222g).remove(bVar.f251372a);
                C86525c cVar = new C86525c(bVar);
                int i = 0;
                boolean z = true;
                if (!((cVar.f251384c == null || cVar.f251385d == null) ? false : true)) {
                    cVar = null;
                }
                if (cVar != null) {
                    String c = C86898q.this.mo121347c(this.f252226d.mo122001a("USN"));
                    if (!TextUtils.isEmpty(c)) {
                        cVar.f251382a.getClass();
                        C58606a a = C58606a.m68054a();
                        if (!a.f167795a) {
                            if (((HashMap) a.f167796b).containsKey(c)) {
                                C86525c cVar2 = (C86525c) ((HashMap) a.f167796b).get(c);
                                if (cVar2 == null || !cVar2.equals(cVar)) {
                                    z = false;
                                } else {
                                    return;
                                }
                            }
                            ((HashMap) a.f167796b).put(c, cVar);
                            while (i < ((ArrayList) a.f167797c).size()) {
                                C58606a.C58607a aVar = (C58606a.C58607a) ((ArrayList) a.f167797c).get(i);
                                if (aVar != null) {
                                    if (z) {
                                        aVar.mo80100n(cVar);
                                    } else {
                                        aVar.mo80103t(cVar);
                                    }
                                    i++;
                                } else {
                                    ((ArrayList) a.f167797c).remove(i);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: fj0.q$d */
    public class C86902d implements C117604b<Throwable> {
        public C86902d() {
        }

        public void call(Object obj) {
            Throwable th = (Throwable) obj;
            ((HashSet) C86898q.this.f252222g).clear();
            if (th == null || th.getMessage() == null) {
                int i = C86898q.f252215h;
                C80039a.m97316a("q", "get mDevice info err");
                return;
            }
            int i2 = C86898q.f252215h;
            C80039a.m97316a("q", "get mDevice info err:" + th.getMessage());
        }
    }

    /* renamed from: a */
    public boolean mo121345a() {
        C80039a.m97317b("q", "mRouter is shutting down...");
        if (!this.f252218c) {
            return false;
        }
        ((HashSet) this.f252222g).clear();
        C86892n nVar = this.f252220e;
        synchronized (nVar) {
            nVar.f252207g = false;
            MulticastSocket multicastSocket = nVar.f252205e;
            if (multicastSocket != null && !multicastSocket.isClosed()) {
                nVar.f252205e.close();
            }
            MulticastSocket multicastSocket2 = nVar.f252206f;
            if (multicastSocket2 != null && !multicastSocket2.isClosed()) {
                try {
                    C80039a.m97317b("n", "Leaving multicast group");
                    for (NetworkInterface leaveGroup : nVar.f252203c) {
                        nVar.f252206f.leaveGroup(nVar.f252204d, leaveGroup);
                    }
                } catch (Exception e) {
                    C80039a.m97317b("n", "Could not leave multicast group: " + e);
                }
                nVar.f252206f.close();
            }
        }
        this.f252216a.mo183371b();
        this.f252218c = false;
        return true;
    }

    /* renamed from: b */
    public boolean mo121346b() {
        C80039a.m97317b("q", "mRouter is starting ...");
        if (C86905t.f252229d == null) {
            synchronized (C86875d.class) {
                if (C86905t.f252229d == null) {
                    C86905t.f252229d = new C86905t(true);
                }
            }
        }
        this.f252219d = C86905t.f252229d.f252232c;
        try {
            if (this.f252218c) {
                return false;
            }
            C86892n nVar = new C86892n(new C86896o("239.255.255.250", WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID), C86897p.m107914c(), this, this.f252219d);
            this.f252220e = nVar;
            nVar.mo121342c();
            this.f252218c = true;
            return true;
        } catch (Exception e) {
            C80039a.m97318c("q", e, "");
            return false;
        }
    }

    /* renamed from: c */
    public final String mo121347c(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = this.f252221f.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (str2 != null) {
            return str2;
        }
        C80039a.m97316a("q", "fallbackGetUuid: " + str);
        if (str.startsWith("uuid:")) {
            str = str.substring(5);
        }
        return str;
    }

    /* renamed from: d */
    public final void mo121348d(Lock lock) {
        try {
            if (!lock.tryLock((long) 6000, TimeUnit.MILLISECONDS)) {
                throw new C87742a("Router wasn't available exclusively after waiting " + 6000 + "ms, lock failed: " + lock.getClass().getSimpleName());
            }
        } catch (InterruptedException e) {
            throw new C87742a("Interruption while waiting for exclusive access: " + lock.getClass().getSimpleName(), e);
        }
    }

    /* renamed from: e */
    public void mo121349e(C87532b bVar) {
        try {
            mo121348d(this.f252217b);
            if (!this.f252218c) {
                this.f252217b.unlock();
                return;
            }
            if (mo121352h(bVar)) {
                this.f252216a.mo183370a(new C86876e(bVar).mo121335a().mo182156g(new C86901c(bVar), new C86902d()));
            } else {
                C80039a.m97317b("q", "parser fail");
            }
            this.f252217b.unlock();
        } catch (Exception e) {
            C80039a.m97318c("q", e, "");
        } catch (Throwable th) {
            this.f252217b.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public void mo121350f(boolean z) {
        C86332h hVar = new C86332h(z);
        if (!this.f252218c) {
            C80039a.m97316a("q", "DLNA Router is not enable");
            return;
        }
        C118646b bVar = this.f252216a;
        C86878g gVar = new C86878g(hVar);
        C86875d dVar = gVar.f252171c;
        C86327d dVar2 = gVar.f252170b;
        dVar.getClass();
        bVar.mo183370a(((C117453e) ((C87972b.C87973a) gVar.f254566a).call(C117453e.m165660c(new C86873b(dVar, dVar2)))).mo182156g(new C86903r(this), new C86904s(this)));
    }

    /* renamed from: g */
    public void mo121351g(C86328e eVar, C87227a aVar) {
        if (!this.f252218c) {
            C80039a.m97316a("q", "DLNA Router is not enable");
            return;
        }
        C118646b bVar = this.f252216a;
        C86877f fVar = new C86877f(eVar);
        C86875d dVar = fVar.f252169c;
        C86328e eVar2 = fVar.f252168b;
        dVar.getClass();
        bVar.mo183370a(((C117453e) ((C87972b.C87973a) fVar.f254566a).call(C117453e.m165660c(new C86874c(dVar, eVar2)))).mo182156g(new C86899a(this, eVar, aVar), new C86900b(this, aVar)));
    }

    /* renamed from: h */
    public final boolean mo121352h(C87532b bVar) {
        String a = bVar.mo122001a("NT");
        String a2 = bVar.mo122001a("ST");
        String a3 = bVar.mo122001a("NTS");
        String a4 = bVar.mo122001a("USN");
        String a5 = bVar.mo122001a(CodePackage.LOCATION);
        if (!"upnp:rootdevice".equals(a) && !"upnp:rootdevice".equals(a2)) {
            return false;
        }
        if (((HashSet) this.f252222g).size() > 0 && ((HashSet) this.f252222g).contains(a5)) {
            return false;
        }
        String c = mo121347c(a4);
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        C58606a a6 = C58606a.m68054a();
        if ("ssdp:alive".equals(a3)) {
            C86525c cVar = (C86525c) ((HashMap) a6.f167796b).get(c);
            if (cVar != null) {
                if (cVar.f251382a.f251372a.equals(a5)) {
                    return false;
                }
                a6.mo83498c(c);
                ((HashSet) this.f252222g).add(a5);
                return true;
            } else if (TextUtils.isEmpty(a5)) {
                return false;
            } else {
                ((HashSet) this.f252222g).add(a5);
                return true;
            }
        } else if ("ssdp:byebye".equals(a3)) {
            if (((HashMap) a6.f167796b).containsKey(c)) {
                a6.mo83498c(c);
            }
            return false;
        } else if (!TextUtils.isEmpty(a5)) {
            return !((HashMap) a6.f167796b).containsKey(c);
        } else {
            C80039a.m97316a("q", "mDevice location is empty");
            return false;
        }
    }
}
