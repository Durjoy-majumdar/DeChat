package st1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenFingerPrintAuthEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import pv2.C77290d;
import tt1.C78101i;
import vt1.C78473a;
import vt1.C78475c;

/* renamed from: st1.u */
public class C77782u extends IStaticListener<OpenFingerPrintAuthEvent> {

    /* renamed from: d */
    public C77783a f226634d;

    /* renamed from: e */
    public OpenFingerPrintAuthEvent f226635e;

    /* renamed from: f */
    public boolean f226636f = false;

    /* renamed from: st1.u$a */
    public class C77783a implements C78475c {
        public C77783a() {
        }

        /* renamed from: a */
        public void mo23733a(int i, int i2, int i3, int i4) {
            C77782u uVar = C77782u.this;
            if (uVar.f226636f) {
                Log.m105920e("MicroMsg.OpenFingerPrintAuthEventListener", "hy: event already end. ignore");
            } else if (i != 0) {
                if (i != 2007) {
                    if (i == 2009) {
                        Log.m105925i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", Integer.valueOf(i));
                        OpenFingerPrintAuthEvent openFingerPrintAuthEvent = C77782u.this.f226635e;
                        if (openFingerPrintAuthEvent != null) {
                            openFingerPrintAuthEvent.f193784d.getClass();
                            C77290d.m93103a(3, 0);
                        }
                        C77782u.this.f226636f = true;
                        String string = MMApplicationContext.getContext().getString(C0966R.string.jle);
                        C77782u.this.mo107928B();
                        C77782u.this.mo107929d(i, string);
                        return;
                    } else if (!(i == 10308 || i == 2004 || i == 2005)) {
                        switch (i) {
                            case 2000:
                                Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify timeout");
                                return;
                            case 2001:
                                uVar.mo107930q(false);
                                Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_TIMEOUT");
                                return;
                            case 2002:
                                Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_NO_MATCH");
                                C77782u uVar2 = C77782u.this;
                                uVar2.f226636f = false;
                                uVar2.mo107928B();
                                C77782u.this.mo107930q(true);
                                C77782u.this.mo107929d(1, "");
                                return;
                            default:
                                return;
                        }
                    }
                }
                Log.m105925i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", Integer.valueOf(i));
                C77782u.this.f226636f = true;
                String string2 = MMApplicationContext.getContext().getString(C0966R.string.jle);
                if (i == 10308) {
                    string2 = MMApplicationContext.getContext().getString(C0966R.string.jlf);
                } else if (i == 2007) {
                    OpenFingerPrintAuthEvent openFingerPrintAuthEvent2 = C77782u.this.f226635e;
                    if (openFingerPrintAuthEvent2 != null) {
                        int i5 = openFingerPrintAuthEvent2.f193784d.f193787b;
                    }
                    C77761h0.IML.f226592f = true;
                } else if (i == 2005) {
                    string2 = MMApplicationContext.getContext().getString(C0966R.string.jlh);
                    OpenFingerPrintAuthEvent openFingerPrintAuthEvent3 = C77782u.this.f226635e;
                    if (openFingerPrintAuthEvent3 != null) {
                        int i6 = openFingerPrintAuthEvent3.f193784d.f193787b;
                    }
                }
                C77782u.this.mo107928B();
                C77782u.this.mo107929d(2, string2);
            } else {
                Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_SUCCESS");
                C77782u uVar3 = C77782u.this;
                uVar3.getClass();
                Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "onSuccess()");
                uVar3.f226636f = true;
                ((C78473a) C86709a0.m107533q(C78473a.class)).mo107908ZF(uVar3.f226635e, i2);
                if (uVar3.f226636f) {
                    uVar3.f226635e = null;
                }
                Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onSuccess()");
                C77782u.this.mo107928B();
            }
        }
    }

    /* renamed from: B */
    public void mo107928B() {
        ((C78101i) C86709a0.m107533q(C78101i.class)).cancel();
    }

    public boolean callback(IEvent iEvent) {
        OpenFingerPrintAuthEvent openFingerPrintAuthEvent = (OpenFingerPrintAuthEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.OpenFingerPrintAuthEventListener", "OpenFingerPrintAuthEvent account is not ready");
        } else {
            this.f226636f = false;
            if (openFingerPrintAuthEvent instanceof OpenFingerPrintAuthEvent) {
                Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "handle OpenFingerPrintAuthEventListener");
                if (!C77770n.m93841c()) {
                    Log.m105920e("MicroMsg.OpenFingerPrintAuthEventListener", "device is not support FingerPrintAuth");
                    this.f226636f = true;
                    mo107929d(1, "");
                    return true;
                }
                this.f226635e = openFingerPrintAuthEvent;
                if (openFingerPrintAuthEvent == null) {
                    Log.m105921e("MicroMsg.OpenFingerPrintAuthEventListener", (String) null, "mEvent is null !!!");
                } else {
                    String str = openFingerPrintAuthEvent.f193784d.f193786a;
                    C77761h0 h0Var = C77761h0.IML;
                    h0Var.f226591e = str;
                    boolean Qk = ((C78101i) C86709a0.m107533q(C78101i.class)).mo108074Qk();
                    if (this.f226634d == null) {
                        this.f226634d = new C77783a();
                    }
                    if (!Util.isNullOrNil(h0Var.f226590d)) {
                        mo107930q(false);
                    } else {
                        Log.m105928w("MicroMsg.OpenFingerPrintAuthEventListener", "no challenge!!");
                        mo107929d(1, "");
                    }
                    return Qk;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo107929d(int i, String str) {
        Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "onFail()");
        ((C78473a) C86709a0.m107533q(C78473a.class)).mo107877C2(this.f226635e, i, str);
        if (this.f226636f) {
            this.f226635e = null;
        }
        Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onFail()");
    }

    /* renamed from: q */
    public final boolean mo107930q(boolean z) {
        Class cls = C78101i.class;
        mo107928B();
        if (!((C78101i) C86709a0.m107533q(cls)).mo108074Qk()) {
            Log.m105920e("MicroMsg.OpenFingerPrintAuthEventListener", "no fingerprints enrolled, use settings to enroll fingerprints first");
            ((C78101i) C86709a0.m107533q(cls)).cancel();
            this.f226635e = null;
            this.f226636f = true;
            mo107929d(1, "");
            return false;
        } else if (((C78473a) C86709a0.m107533q(C78473a.class)).mo107917uN(this.f226634d, 0, z) != 0) {
            Log.m105920e("MicroMsg.OpenFingerPrintAuthEventListener", "failed to start identify");
            ((C78101i) C86709a0.m107533q(cls)).cancel();
            this.f226635e = null;
            this.f226636f = true;
            mo107929d(1, "");
            return false;
        } else {
            Log.m105924i("MicroMsg.OpenFingerPrintAuthEventListener", "startIdentify()");
            return true;
        }
    }
}
