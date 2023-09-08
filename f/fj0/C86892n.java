package fj0;

import android.util.Log;
import cj0.C80039a;
import hj0.C87532b;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.List;

/* renamed from: fj0.n */
public class C86892n {

    /* renamed from: i */
    public static final /* synthetic */ int f252200i = 0;

    /* renamed from: a */
    public C86896o f252201a;

    /* renamed from: b */
    public C86898q f252202b;

    /* renamed from: c */
    public List<NetworkInterface> f252203c;

    /* renamed from: d */
    public InetSocketAddress f252204d;

    /* renamed from: e */
    public MulticastSocket f252205e;

    /* renamed from: f */
    public MulticastSocket f252206f;

    /* renamed from: g */
    public boolean f252207g = false;

    /* renamed from: h */
    public int f252208h;

    /* renamed from: fj0.n$b */
    public class C86894b implements Runnable {
        public C86894b(C86893a aVar) {
        }

        public void run() {
            try {
                C86892n.m107910b(C86892n.this);
            } catch (Exception e) {
                if (e.getCause() != null) {
                    int i = C86892n.f252200i;
                    C80039a.m97316a("n", e.getCause().toString());
                }
            }
        }
    }

    /* renamed from: fj0.n$c */
    public class C86895c implements Runnable {
        public C86895c(C86893a aVar) {
        }

        public void run() {
            try {
                C86892n.m107909a(C86892n.this);
            } catch (Exception e) {
                if (e.getCause() != null) {
                    int i = C86892n.f252200i;
                    C80039a.m97316a("n", e.getCause().toString());
                }
            }
        }
    }

    public C86892n(C86896o oVar, List<NetworkInterface> list, C86898q qVar, int i) {
        this.f252201a = oVar;
        this.f252208h = i;
        this.f252202b = qVar;
        this.f252203c = list;
        try {
            MulticastSocket multicastSocket = new MulticastSocket(this.f252208h);
            this.f252205e = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.f252205e.setReceiveBufferSize(32768);
            C80039a.m97317b("n", "Creating wildcard socketNotify (for receiving multicast datagrams) on port: " + this.f252201a.f252212b);
            C86896o oVar2 = this.f252201a;
            this.f252204d = new InetSocketAddress(oVar2.f252211a, oVar2.f252212b);
            MulticastSocket multicastSocket2 = new MulticastSocket(this.f252201a.f252212b);
            this.f252206f = multicastSocket2;
            multicastSocket2.setReuseAddress(true);
            this.f252206f.setReceiveBufferSize(32768);
            for (NetworkInterface next : this.f252203c) {
                C80039a.m97317b("n", "Joining multicast group: " + this.f252204d + " on network interface: " + next.getDisplayName());
                this.f252206f.joinGroup(this.f252204d, next);
            }
        } catch (Exception e) {
            throw new Exception("Could not initialize " + "n" + ": " + e);
        }
    }

    /* renamed from: a */
    public static void m107909a(C86892n nVar) {
        nVar.getClass();
        C80039a.m97317b("n", "Entering blocking search receiving loop, listening for UDP datagrams on port: " + nVar.f252205e.getLocalPort());
        C86907u uVar = new C86907u();
        while (nVar.f252207g) {
            try {
                int i = nVar.f252201a.f252213c;
                DatagramPacket datagramPacket = new DatagramPacket(new byte[i], i);
                nVar.f252205e.receive(datagramPacket);
                String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength(), "utf-8");
                C80039a.m97317b("n", "loopSearch: content = " + str);
                C87532b d = uVar.mo121359d(str);
                if (d != null) {
                    nVar.f252202b.mo121349e(d);
                } else {
                    C80039a.m97316a("n", "discard this message");
                }
            } catch (IOException e) {
                C80039a.m97316a("n", "search fail: " + Log.getStackTraceString(e));
                nVar.f252207g = false;
                throw e;
            }
        }
        C80039a.m97316a("n", "loop end");
    }

    /* renamed from: b */
    public static void m107910b(C86892n nVar) {
        nVar.getClass();
        C80039a.m97317b("n", "Entering blocking notify receiving loop, listening for UDP datagrams on port: " + nVar.f252206f.getLocalPort());
        C86907u uVar = new C86907u();
        while (nVar.f252207g) {
            try {
                int i = nVar.f252201a.f252213c;
                DatagramPacket datagramPacket = new DatagramPacket(new byte[i], i);
                nVar.f252206f.receive(datagramPacket);
                String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength(), "utf-8");
                C80039a.m97317b("n", str);
                C87532b d = uVar.mo121359d(str);
                if (d != null) {
                    nVar.f252202b.mo121349e(d);
                } else {
                    C80039a.m97317b("n", "receive a not care notify message");
                }
            } catch (IOException e) {
                C80039a.m97316a("n", "notify fail: " + Log.getStackTraceString(e));
                nVar.f252207g = false;
                throw e;
            }
        }
        C80039a.m97316a("n", "loop end");
    }

    /* renamed from: c */
    public synchronized void mo121342c() {
        if (!this.f252207g) {
            this.f252207g = true;
            new Thread(new C86895c((C86893a) null)).start();
            new Thread(new C86894b((C86893a) null)).start();
        }
    }
}
