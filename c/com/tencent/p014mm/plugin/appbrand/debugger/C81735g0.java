package com.tencent.p014mm.plugin.appbrand.debugger;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.debugger.C81745v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import js0.C88016e;
import p225rc.C89925n;
import pe3.C89349b;
import sp0.C90272a;
import sp0.C90309m;
import sp0.C90311n;
import te3.ax4;
import te3.dx4;
import te3.fx4;
import te3.hx4;
import te3.kx4;
import te3.lw4;
import te3.sw4;
import us0.C90729a;
import vs0.C90866a;
import vs0.C90872d;
import xs0.C91340d;
import ys0.C91584g;
import zs0.C91934b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.g0 */
public class C81735g0 {

    /* renamed from: a */
    public C90729a f239865a;

    /* renamed from: b */
    public SSLSocketFactory f239866b;

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.g0$a */
    public class C81736a extends C90729a {

        /* renamed from: v */
        public C91340d f239867v = null;

        /* renamed from: w */
        public final /* synthetic */ C90311n.C90316e f239868w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81736a(URI uri, C90866a aVar, Map map, int i, C90311n.C90316e eVar) {
            super(uri, aVar, map, i);
            this.f239868w = eVar;
        }

        /* renamed from: k */
        public void mo114102k(int i, String str, boolean z) {
            Log.m105925i("MicroMsg.RemoteDebugSocket", "onClose,reason: %s, errCode = %d", str, Integer.valueOf(i));
            if (i == -1 || i == -2 || i == -3) {
                if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                    ((C81745v.C81747b) this.f239868w).mo114119b("network is down");
                    i = 1006;
                } else {
                    ((C81745v.C81747b) this.f239868w).mo114119b(str);
                }
                ((C81745v.C81747b) this.f239868w).mo114118a(i, str);
                return;
            }
            ((C81745v.C81747b) this.f239868w).mo114118a(i, str);
        }

        /* renamed from: l */
        public void mo114103l(Exception exc) {
            Log.m105920e("MicroMsg.RemoteDebugSocket", "onSocketError, ex: " + exc.toString());
        }

        /* renamed from: m */
        public void mo114104m(C91340d dVar) {
            C91340d dVar2;
            C91340d.C91341a d = dVar.mo125327d();
            C91340d.C91341a aVar = C91340d.C91341a.CONTINUOUS;
            if (d != aVar && !dVar.mo125328e()) {
                this.f239867v = dVar;
            } else if (dVar.mo125327d() == aVar && (dVar2 = this.f239867v) != null) {
                if (dVar2.mo125322f().position() > 10485760) {
                    Log.m105920e("MicroMsg.RemoteDebugSocket", "Pending Frame exploded");
                    this.f239867v = null;
                    return;
                }
                try {
                    this.f239867v.mo125326c(dVar);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.RemoteDebugSocket", e.getMessage());
                }
                if (dVar.mo125328e()) {
                    if (this.f239867v.mo125327d() == C91340d.C91341a.BINARY) {
                        mo114106o(this.f239867v.mo125322f());
                    } else if (this.f239867v.mo125327d() == C91340d.C91341a.TEXT) {
                        try {
                            mo114105n(Util.nullAsNil(C91934b.m115449a(this.f239867v.mo125322f())));
                        } catch (Exception e2) {
                            Log.m105920e("MicroMsg.RemoteDebugSocket", e2.getMessage());
                        }
                    }
                    this.f239867v = null;
                }
            }
        }

        /* renamed from: n */
        public void mo114105n(String str) {
            C81735g0.this.f239865a.mo124853b(str);
            Log.m105919d("MicroMsg.RemoteDebugSocket", "onSocketMessage, message: %s", str);
            C81745v.this.f239910d.mo114114f();
        }

        /* renamed from: o */
        public void mo114106o(ByteBuffer byteBuffer) {
            C81745v.C81747b bVar = (C81745v.C81747b) this.f239868w;
            C81745v.this.f239910d.mo114114f();
            try {
                lw4 lw4 = (lw4) new lw4().parseFrom(C88016e.m109544a(byteBuffer));
                C89349b bVar2 = lw4.f184165f;
                if (bVar2 == null) {
                    Log.m105928w("MicroMsg.RemoteDebugJsEngine", "dataFormat.data is null");
                    return;
                }
                byte[] bArr = bVar2.f257327a;
                int i = lw4.f184163d;
                if (i == 2006) {
                    C81695a0 a0Var = C81745v.this.f239914h;
                    a0Var.getClass();
                    a0Var.mo114046b(((sw4) new sw4().parseFrom(bArr)).f141809d);
                } else if (i == 3001) {
                    C81745v.this.mo114115A();
                } else if (i != 3002) {
                    switch (i) {
                        case 1001:
                            C81745v vVar = C81745v.this;
                            C81738h0.m100296b(vVar.f239910d, lw4, ((dx4) new dx4().parseFrom(bArr)).f132563d, vVar.f239916j, vVar.f239914h);
                            C81745v.this.f239910d.mo114114f();
                            break;
                        case 1002:
                            C81745v.m100313u(C81745v.this, (hx4) new hx4().parseFrom(bArr), lw4);
                            break;
                        case 1003:
                            C81745v vVar2 = C81745v.this;
                            if (C81738h0.m100296b(vVar2.f239910d, lw4, ((fx4) new fx4().parseFrom(bArr)).f133733d, vVar2.f239916j, vVar2.f239914h)) {
                                C81745v.m100311i(C81745v.this);
                                break;
                            }
                            break;
                        case 1004:
                            if (!C81745v.this.f239915i.isRunning()) {
                                C81695a0 a0Var2 = C81745v.this.f239914h;
                                a0Var2.getClass();
                                Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "onQuitSilent");
                                a0Var2.mo114051g();
                                C68600m0 m0Var = a0Var2.f239779c;
                                m0Var.setVisibility(8);
                                if (m0Var.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) m0Var.getParent()).removeView(m0Var);
                                    m0Var.removeAllViews();
                                }
                                m0Var.f197047e = null;
                                break;
                            } else {
                                C81695a0 a0Var3 = C81745v.this.f239914h;
                                a0Var3.getClass();
                                Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "onQuit");
                                a0Var3.mo114051g();
                                C68600m0 m0Var2 = a0Var3.f239779c;
                                m0Var2.getClass();
                                MMHandlerThread.postToMainThread(new C68599l0(m0Var2));
                                MMHandlerThread.postToMainThread(new C68604n0(m0Var2));
                                MMHandlerThread.postToMainThread(new C68605o0(m0Var2));
                                break;
                            }
                        case 1005:
                            C81745v.this.f239914h.mo114049e((kx4) new kx4().parseFrom(bArr), lw4);
                            break;
                        case 1006:
                            C81745v.this.f239914h.mo114048d((ax4) new ax4().parseFrom(bArr), lw4);
                            C81730d0.m100272b(lw4, (C81742s) ((HashMap) C81745v.this.f239910d.f239896r).get(lw4.f184164e));
                            break;
                    }
                } else {
                    C81745v.this.f239910d.mo114113e(4);
                    C81745v.this.f239914h.mo114050f();
                }
                Log.m105925i("MicroMsg.RemoteDebugJsEngine", "onSocketMessage cmd: %d", Integer.valueOf(lw4.f184163d));
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.RemoteDebugJsEngine", "onSocketMessage %s", android.util.Log.getStackTraceString(th));
            }
        }

        /* renamed from: p */
        public void mo114107p(C91584g gVar) {
            String str;
            Log.m105918d("MicroMsg.RemoteDebugSocket", "onSocketOpen");
            C81745v.C81747b bVar = (C81745v.C81747b) this.f239868w;
            bVar.getClass();
            Log.m105924i("MicroMsg.RemoteDebugJsEngine", "onSocketOpen");
            C81745v.this.f239910d.mo114114f();
            C81743t tVar = C81745v.this.f239910d;
            tVar.f239900v = 0;
            if (!TextUtils.isEmpty(tVar.f239902x)) {
                Log.m105924i("MicroMsg.RemoteDebugJsEngine", "onSocketOpen with wsEndpoint");
                C81745v vVar = C81745v.this;
                vVar.f239917n = true;
                C81745v.m100311i(vVar);
                C81745v.this.mo114115A();
                return;
            }
            C81743t tVar2 = C81745v.this.f239910d;
            synchronized (tVar2) {
                str = tVar2.f239881c;
            }
            if (!Util.isNullOrNil(str)) {
                C81745v.m100312l(C81745v.this);
            }
            C81695a0 a0Var = C81745v.this.f239914h;
            a0Var.getClass();
            Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "onClose");
            Future<?> future = a0Var.f239786j;
            if (future != null) {
                future.cancel(false);
            }
            a0Var.f239786j = ((C119157j) C119157j.f356862d).mo183872c(new C81700c0(a0Var), 100, 1000);
        }
    }

    public C81735g0(C90272a aVar) {
        SSLContext p = C90309m.m113081p(aVar);
        if (p != null) {
            this.f239866b = p.getSocketFactory();
        }
    }

    /* renamed from: a */
    public void mo114100a(String str, C90311n.C90316e eVar) {
        Log.m105925i("MicroMsg.RemoteDebugSocket", "connectSocket url is %s", str);
        try {
            URI uri = new URI(str);
            HashMap hashMap = new HashMap();
            if (str.startsWith("ws://localhost:")) {
                hashMap.put("Sec-WebSocket-Protocol", "client");
            }
            try {
                this.f239865a = new C81736a(uri, new C90872d(), hashMap, CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, eVar);
                if (C89925n.m112490c(str, "ws://")) {
                    this.f239865a.mo124864s(new Socket(Proxy.NO_PROXY));
                    this.f239865a.mo124859i();
                    return;
                }
                SSLSocketFactory sSLSocketFactory = this.f239866b;
                if (sSLSocketFactory == null) {
                    sSLSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                }
                this.f239865a.mo124864s(sSLSocketFactory.createSocket());
                this.f239865a.mo124859i();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.RemoteDebugSocket", "onSocketMessage %s", android.util.Log.getStackTraceString(e));
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.RemoteDebugSocket", "connect fail : %s ", e2.toString());
            ((C81745v.C81747b) eVar).getClass();
            Log.m105925i("MicroMsg.RemoteDebugJsEngine", "onSocketConnectFail reason:%s ", "url not well format");
        }
    }

    /* renamed from: b */
    public boolean mo114101b(lw4 lw4) {
        ByteBuffer byteBuffer;
        Log.m105918d("MicroMsg.RemoteDebugSocket", "sendSocketMsg");
        C90729a aVar = this.f239865a;
        if (!(aVar == null ? false : aVar.isOpen())) {
            Log.m105928w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail, not open");
            return false;
        } else if (lw4 == null) {
            Log.m105928w("MicroMsg.RemoteDebugSocket", "sendSocketMsg fail");
            return false;
        } else {
            try {
                byteBuffer = ByteBuffer.wrap(lw4.toByteArray());
            } catch (IOException e) {
                Log.m105928w("MicroMsg.RemoteDebugUtil", e.getMessage());
                byteBuffer = ByteBuffer.allocate(0);
            }
            this.f239865a.mo124854c(byteBuffer);
            return true;
        }
    }
}
