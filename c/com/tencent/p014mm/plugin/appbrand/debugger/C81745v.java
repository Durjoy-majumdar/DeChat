package com.tencent.p014mm.plugin.appbrand.debugger;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.C81932i4;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.debugger.C68600m0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import js0.C88024r;
import p1044ub.C90630c;
import p156gj.C87200o;
import p284zb.C91635f;
import p823sg.C90193h;
import p963fc.C86812g;
import sp0.C90272a;
import sp0.C90311n;
import te3.C48821b82;
import te3.C48970c82;
import te3.bx4;
import te3.ex4;
import te3.gx4;
import te3.hx4;
import te3.lw4;
import te3.nw4;
import te3.qw4;
import te3.tw4;
import te3.xw4;
import te3.yw4;
import zp0.C16377l;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.v */
public class C81745v implements C83165i {

    /* renamed from: d */
    public C81743t f239910d;

    /* renamed from: e */
    public String f239911e;

    /* renamed from: f */
    public Activity f239912f;

    /* renamed from: g */
    public C81735g0 f239913g;

    /* renamed from: h */
    public C81695a0 f239914h = new C81695a0();

    /* renamed from: i */
    public C91635f f239915i;

    /* renamed from: j */
    public C68600m0 f239916j;

    /* renamed from: n */
    public boolean f239917n = false;

    /* renamed from: o */
    public C90311n.C90316e f239918o = new C81747b();

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.v$a */
    public class C81746a implements C68600m0.C68602c {
        public C81746a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.v$b */
    public class C81747b implements C90311n.C90316e {

        /* renamed from: com.tencent.mm.plugin.appbrand.debugger.v$b$a */
        public class C81748a implements Runnable {
            public C81748a() {
            }

            public void run() {
                C81745v.this.mo114116v();
            }
        }

        public C81747b() {
        }

        /* renamed from: a */
        public void mo114118a(int i, String str) {
            int i2;
            Log.m105925i("MicroMsg.RemoteDebugJsEngine", "onSocketClose code:%d reason:%s ", Integer.valueOf(i), str);
            if (TextUtils.isEmpty(C81745v.this.f239910d.f239902x) || !C81745v.this.f239917n) {
                C81743t tVar = C81745v.this.f239910d;
                synchronized (tVar) {
                    i2 = tVar.f239884f;
                }
                if (!(i2 == 4) && ((long) tVar.f239900v) < 10) {
                    C88024r.m109571a().mo122468a(new C81748a(), 1000);
                    C81745v.this.f239910d.f239900v++;
                }
            } else {
                Log.m105924i("MicroMsg.RemoteDebugJsEngine", "onSocketClose with ws lan");
                if (C81745v.this.f239915i.isRunning()) {
                    C68600m0 m0Var = C81745v.this.f239916j;
                    m0Var.getClass();
                    MMHandlerThread.postToMainThread(new C68599l0(m0Var));
                    MMHandlerThread.postToMainThread(new C68604n0(m0Var));
                    MMHandlerThread.postToMainThread(new C68605o0(m0Var));
                }
                C81745v.this.f239917n = false;
            }
            C81695a0 a0Var = C81745v.this.f239914h;
            a0Var.getClass();
            Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "onClose");
            Future<?> future = a0Var.f239786j;
            if (future != null) {
                future.cancel(false);
            }
            C81745v.this.f239910d.mo114114f();
            C68600m0 m0Var2 = C81745v.this.f239916j;
            m0Var2.getClass();
            MMHandlerThread.postToMainThread(new C68599l0(m0Var2));
            MMHandlerThread.postToMainThread(new C68604n0(m0Var2));
            C81745v.this.f239910d.mo114113e(5);
            C68600m0 m0Var3 = C81745v.this.f239916j;
            m0Var3.getClass();
            if (!Util.isNullOrNil(str)) {
                MMHandlerThread.postToMainThread(new C68608r0(m0Var3, str));
            }
        }

        /* renamed from: b */
        public void mo114119b(String str) {
            Log.m105925i("MicroMsg.RemoteDebugJsEngine", "onSocketError message:%s ", str);
            C68600m0 m0Var = C81745v.this.f239916j;
            m0Var.getClass();
            if (!Util.isNullOrNil(str)) {
                MMHandlerThread.postToMainThread(new C68608r0(m0Var, str));
            }
            if (!TextUtils.isEmpty(C81745v.this.f239910d.f239902x)) {
                Log.m105925i("MicroMsg.RemoteDebugJsEngine", "connect wsEndpoint %s fail, reset it empty", C81745v.this.f239910d.f239902x);
                C81745v vVar = C81745v.this;
                C68600m0 m0Var2 = vVar.f239916j;
                String str2 = vVar.f239910d.f239902x;
                m0Var2.getClass();
                MMHandlerThread.postToMainThread(new C68596i0(m0Var2, str2));
                C81745v.this.f239910d.f239902x = "";
            }
        }
    }

    public C81745v() {
        new RemoteDebugJsEngine$4(this, C40008f.f107254d).alive();
    }

    /* renamed from: i */
    public static void m100311i(C81745v vVar) {
        Class cls = C90630c.class;
        ICommLibReader k = vVar.f239915i.mo114272k();
        bx4 bx4 = new bx4();
        nw4 nw4 = new nw4();
        bx4.f259434e = nw4;
        C81740p pVar = (C81740p) vVar.f239915i.mo125517G0(C81740p.class);
        if (pVar != null) {
            bx4.f259435f = pVar.mo114093Q();
        }
        bx4.f259437h = vVar.f239915i.getRuntime().mo113051d0().f261072r.md5;
        bx4.f259438i = 1;
        String b = vVar.f239915i.mo114272k().mo113372b("WAService.js");
        if (!Util.isNullOrNil(b)) {
            bx4.f259436g = C90193h.m112878f(b.getBytes());
        }
        nw4.f259714h = k.mo113371a();
        nw4.f259711e = C87200o.f252870c;
        nw4.f259710d = C87200o.f252871d;
        nw4.f259713g = ChannelUtil.formatVersion(vVar.f239912f, BuildInfo.CLIENT_VERSION_INT);
        nw4.f259712f = C87200o.f252873f;
        nw4.f259716j = vVar.f239912f.getResources().getDisplayMetrics().density;
        nw4.f259715i = ((float) vVar.f239912f.getResources().getDisplayMetrics().widthPixels) / nw4.f259716j;
        if (!(vVar.f239915i.mo114342m0(cls) == null || ((C90630c) vVar.f239915i.mo114342m0(cls)).f244558J == null)) {
            nw4.f259717n = ((C90630c) vVar.f239915i.mo114342m0(cls)).f244558J.getUserAgentString();
        }
        xw4 xw4 = new xw4();
        vVar.f239914h.getClass();
        xw4.f145007d = "WeixinJSCore";
        Iterator it = ((HashMap) C81695a0.f239776k).keySet().iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                String str = (String) it.next();
                if (((String[]) ((HashMap) C81695a0.f239776k).get(str)).length > 5) {
                    Log.m105920e("MicroMsg.RemoteDebugMsgMrg", "Interface method only support five arguments!");
                } else {
                    tw4 tw4 = new tw4();
                    tw4.f142458d = str;
                    while (true) {
                        HashMap hashMap = (HashMap) C81695a0.f239776k;
                        if (i >= ((String[]) hashMap.get(str)).length) {
                            break;
                        }
                        tw4.f142459e.add(((String[]) hashMap.get(str))[i]);
                        i++;
                    }
                    xw4.f145008e.add(tw4);
                }
            } else {
                bx4.f259433d = xw4;
                vVar.f239914h.mo114052h(C81738h0.m100298d(bx4, vVar.f239910d, "setupContext"));
                Log.m105919d("MicroMsg.RemoteDebugJsEngine", "setupContext %s/%s/%d, %s", bx4.f259436g, bx4.f259437h, Integer.valueOf(nw4.f259714h), nw4.f259717n);
                return;
            }
        }
    }

    /* renamed from: l */
    public static void m100312l(C81745v vVar) {
        String str;
        vVar.getClass();
        Log.m105924i("MicroMsg.RemoteDebugJsEngine", "login");
        vVar.f239910d.mo114113e(1);
        gx4 gx4 = new gx4();
        C81743t tVar = vVar.f239910d;
        gx4.f134346d = tVar.f239880b;
        synchronized (tVar) {
            str = tVar.f239881c;
        }
        gx4.f134347e = str;
        vVar.f239913g.mo114101b(C81738h0.m100295a(1002, gx4));
    }

    /* renamed from: u */
    public static void m100313u(C81745v vVar, hx4 hx4, lw4 lw4) {
        if (C81738h0.m100296b(vVar.f239910d, lw4, hx4.f134949d, vVar.f239916j, vVar.f239914h)) {
            Log.m105924i("MicroMsg.RemoteDebugJsEngine", "onLogin");
            yw4 yw4 = hx4.f134950e;
            if (yw4 == null) {
                Log.m105920e("MicroMsg.RemoteDebugJsEngine", "onLogin room info is null");
            } else if (yw4.f145551d) {
                vVar.f239910d.getClass();
                vVar.mo114115A();
            } else {
                Log.m105924i("MicroMsg.RemoteDebugJsEngine", "joinRoom");
                vVar.f239910d.mo114113e(2);
                ex4 ex4 = new ex4();
                C81743t tVar = vVar.f239910d;
                ex4.f133165d = tVar.f239880b;
                C81744u uVar = tVar.f239885g;
                ex4.f133167f = uVar.f239903a;
                ex4.f133166e = "";
                ex4.f133168g = uVar.f239904b;
                vVar.f239913g.mo114101b(C81738h0.m100295a(1003, ex4));
            }
        }
    }

    /* renamed from: A */
    public final void mo114115A() {
        Log.m105924i("MicroMsg.RemoteDebugJsEngine", "onReady");
        this.f239910d.mo114113e(3);
        Log.m105924i("MicroMsg.RemoteDebugJsEngine", "clearPendingScript");
        Iterator<Pair<String, ValueCallback<String>>> it = this.f239910d.f239894p.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            evaluateJavascript((String) next.first, (ValueCallback) next.second);
        }
        this.f239910d.f239894p.clear();
        this.f239914h.mo114054j(this.f239910d.mo114109a(), Integer.MAX_VALUE);
        C68600m0 m0Var = this.f239916j;
        m0Var.getClass();
        MMHandlerThread.postToMainThread(new C68599l0(m0Var));
        MMHandlerThread.postToMainThread(new C68604n0(m0Var));
    }

    /* renamed from: P0 */
    public void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback) {
        evaluateJavascript(str3, valueCallback);
    }

    /* renamed from: R0 */
    public void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
        evaluateJavascript(str, valueCallback);
    }

    public void addJavascriptInterface(Object obj, String str) {
    }

    public void destroy() {
        this.f239914h.mo114050f();
        C81695a0 a0Var = this.f239914h;
        a0Var.getClass();
        Log.m105924i("MicroMsg.RemoteDebugMsgMrg", "onClose");
        Future<?> future = a0Var.f239786j;
        if (future != null) {
            future.cancel(false);
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        boolean z;
        C81743t tVar = this.f239910d;
        if (tVar != null) {
            synchronized (tVar) {
                z = tVar.f239893o;
            }
            if (!z) {
                if (!this.f239910d.mo114112d()) {
                    this.f239910d.f239894p.add(new Pair(str, valueCallback));
                    this.f239911e = null;
                    return;
                }
                qw4 qw4 = new qw4();
                qw4.f140592e = this.f239910d.f239891m.incrementAndGet();
                qw4.f140591d = str;
                this.f239914h.mo114052h(C81738h0.m100298d(qw4, this.f239910d, "evaluateJavascript"));
                int i = qw4.f140592e;
                C81698b bVar = new C81698b();
                if (!Util.isNullOrNil(this.f239911e)) {
                    bVar.f239791c = this.f239911e;
                    this.f239911e = null;
                } else {
                    Matcher matcher = Pattern.compile("subscribeHandler\\(\"(.*)\" , ").matcher(str);
                    bVar.f239791c = matcher.find() ? matcher.group(1) : "";
                }
                bVar.f239790b = System.currentTimeMillis();
                bVar.f239792d = str.length();
                bVar.f239789a = valueCallback;
                this.f239910d.f239898t.put(Integer.valueOf(i), bVar);
            }
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("FATAL");
        }
    }

    /* renamed from: n0 */
    public <T extends C40481j> T mo63321n0(Class<T> cls) {
        return null;
    }

    public void setJsExceptionHandler(C83164h hVar) {
    }

    /* renamed from: v */
    public final void mo114116v() {
        if (this.f239913g == null) {
            C81735g0 g0Var = new C81735g0((C90272a) this.f239915i.mo109671p(C90272a.class));
            this.f239913g = g0Var;
            C81695a0 a0Var = this.f239914h;
            C81743t tVar = this.f239910d;
            C68600m0 m0Var = this.f239916j;
            a0Var.f239777a = g0Var;
            a0Var.f239778b = tVar;
            a0Var.f239779c = m0Var;
        }
        boolean z = false;
        this.f239917n = false;
        if (!TextUtils.isEmpty(this.f239910d.f239902x)) {
            Log.m105925i("MicroMsg.RemoteDebugJsEngine", "connect wsEndpoint url:%s", this.f239910d.f239902x);
            this.f239913g.mo114100a(this.f239910d.f239902x, this.f239918o);
            return;
        }
        if (this.f239910d.f239885g.f239905c == 3) {
            z = true;
        }
        if (z) {
            C81735g0 g0Var2 = this.f239913g;
            g0Var2.mo114100a("ws://localhost:" + this.f239910d.f239885g.f239906d, this.f239918o);
            return;
        }
        this.f239913g.mo114100a("wss://wxagame.weixin.qq.com/remote/", this.f239918o);
    }

    /* renamed from: x */
    public void mo114117x(C81743t tVar) {
        String str;
        this.f239910d = tVar;
        C91635f fVar = tVar.f239879a;
        this.f239915i = fVar;
        this.f239912f = (Activity) fVar.getContext();
        C68600m0 m0Var = new C68600m0(this.f239912f, this.f239910d, new C81746a());
        this.f239916j = m0Var;
        C86812g H0 = this.f239915i.getRuntime();
        m0Var.f197047e = H0.f238153r;
        if (m0Var.getParent() instanceof ViewGroup) {
            ((ViewGroup) m0Var.getParent()).removeView(m0Var);
        }
        C81932i4.RemoteDebugFloatView.mo114355a(H0, m0Var);
        RemoteDebugMoveView remoteDebugMoveView = (RemoteDebugMoveView) LayoutInflater.from(m0Var.getContext()).inflate(C0966R.C0971layout.f6462fi, (ViewGroup) null);
        m0Var.f197048f = remoteDebugMoveView;
        m0Var.f197051i = (TextView) remoteDebugMoveView.findViewById(C0966R.C0970id.f5998uf);
        m0Var.f197050h = (TextView) m0Var.f197048f.findViewById(C0966R.C0970id.f6007uo);
        m0Var.f197052j = (TextView) m0Var.f197048f.findViewById(C0966R.C0970id.f6002uj);
        m0Var.f197053n = (TextView) m0Var.f197048f.findViewById(C0966R.C0970id.f6004ul);
        m0Var.f197054o = (TextView) m0Var.f197048f.findViewById(C0966R.C0970id.f6001ui);
        m0Var.f197055p = (TextView) m0Var.f197048f.findViewById(C0966R.C0970id.f5996ud);
        m0Var.f197056q = (TextView) m0Var.f197048f.findViewById(C0966R.C0970id.f6000uh);
        m0Var.f197058s = (ImageView) m0Var.f197048f.findViewById(C0966R.C0970id.f5997ue);
        m0Var.f197057r = (ImageView) m0Var.f197048f.findViewById(C0966R.C0970id.f6005um);
        m0Var.f197059t = m0Var.f197048f.findViewById(C0966R.C0970id.f5999ug);
        m0Var.mo94269d();
        m0Var.f197054o.setOnClickListener(m0Var.f197063x);
        m0Var.f197055p.setOnClickListener(m0Var.f197063x);
        m0Var.f197053n.setOnClickListener(m0Var.f197063x);
        m0Var.postDelayed(new C68598k0(m0Var), 100);
        mo114116v();
        C81743t tVar2 = this.f239910d;
        synchronized (tVar2) {
            str = tVar2.f239881c;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.RemoteDebugJsEngine", "getRemoteDebugTicket");
            ((C16377l) this.f239915i.mo109668l(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxabusiness/getremotedebugticket", this.f239915i.getAppId(), new C48821b82(), C48970c82.class).mo123061d(new C81749w(this));
        }
    }
}
