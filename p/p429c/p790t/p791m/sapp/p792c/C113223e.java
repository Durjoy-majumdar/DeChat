package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: c.t.m.sapp.c.e */
public class C113223e {

    /* renamed from: a */
    public static final byte[] f338787a = new byte[0];

    /* renamed from: b */
    public static C113223e f338788b;

    /* renamed from: c */
    public final String f338789c = "DexAsynchHandler";

    /* renamed from: d */
    public HandlerThread f338790d;

    /* renamed from: e */
    public C113224a f338791e;

    /* renamed from: f */
    public boolean f338792f;

    /* renamed from: g */
    public Context f338793g;

    /* renamed from: h */
    public C79908k f338794h;

    /* renamed from: i */
    public SimpleDateFormat f338795i = new SimpleDateFormat("HHmmss");

    /* renamed from: j */
    public SimpleDateFormat f338796j = new SimpleDateFormat("yyyyMMdd-HHmmss");

    /* renamed from: c.t.m.sapp.c.e$a */
    public class C113224a extends Handler {

        /* renamed from: a */
        public StringBuilder f338797a;

        public C113224a(Looper looper) {
            super(looper);
            StringBuilder sb = new StringBuilder(1024);
            this.f338797a = sb;
            sb.setLength(0);
        }

        /* renamed from: a */
        public void mo165763a(Message message) {
            try {
                int i = message.what;
                if (i == 10005) {
                    C113226g.m154954a(C113223e.this.f338793g);
                } else if (i == 10008) {
                    C113233r.m154997a(C113223e.this.f338793g);
                }
            } catch (Throwable unused) {
            }
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            mo165763a(message);
        }
    }

    public C113223e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f338793g = applicationContext;
        this.f338794h = new C79908k(applicationContext);
    }

    /* renamed from: b */
    public static C113223e m154940b() {
        return f338788b;
    }

    /* renamed from: a */
    public void mo165758a(String str, String str2) {
    }

    /* renamed from: c */
    public void mo165761c() {
        if (!this.f338792f) {
            HandlerThread handlerThread = new HandlerThread("d_thread");
            this.f338790d = handlerThread;
            handlerThread.start();
            this.f338791e = new C113224a(this.f338790d.getLooper());
            this.f338792f = true;
        }
    }

    /* renamed from: d */
    public void mo165762d() {
    }

    /* renamed from: a */
    public static C113223e m154939a(Context context) {
        if (f338788b == null) {
            synchronized (C113223e.class) {
                if (f338788b == null) {
                    f338788b = new C113223e(context);
                }
            }
        }
        return f338788b;
    }

    /* renamed from: a */
    public void mo165757a(String str) {
        try {
            if (this.f338793g != null && this.f338791e != null && str != null) {
                if (str.length() != 0) {
                    C39880p.f106940a = 3000;
                    StringBuilder sb = new StringBuilder();
                    sb.append("LOC_CORE");
                    sb.append(',');
                    sb.append(this.f338796j.format(new Date()));
                    sb.append(',');
                    sb.append(C113233r.m155027g(this.f338793g));
                    sb.append(',');
                    sb.append(C113233r.m155031k(this.f338793g));
                    sb.append(',');
                    sb.append(C113233r.m155021e());
                    sb.append(',');
                    sb.append(C113233r.m155025f());
                    sb.append(',');
                    sb.append(C113233r.m155004b());
                    sb.append(',');
                    sb.append("COMP");
                    sb.append(str);
                    sb.append("$");
                    mo165759a(sb.toString().getBytes());
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo165755a() {
        if (this.f338793g != null) {
            mo165756a(10005, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo165756a(int i, String str) {
        C113224a aVar = this.f338791e;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage();
            obtainMessage.obj = str;
            obtainMessage.what = i;
            C79910o.m97071a(aVar, obtainMessage);
        }
    }

    /* renamed from: a */
    public boolean mo165759a(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    byte[] a = mo165760a(bArr, "0PEq^X$sjtWqEqa2$dg4TG2PT^4dFEep");
                    if (a == null || a.length == 0) {
                        return true;
                    }
                    if (C39880p.m42653a("https://analytics.map.qq.com/tr?mllc", a) == null) {
                        this.f338794h.mo110071a(a);
                    }
                    return false;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final byte[] mo165760a(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0) {
            return f338787a;
        }
        byte[] b = C79909m.m97069b(C113233r.m155011b(bArr), str);
        if (b == null || b.length == 0) {
            return f338787a;
        }
        byte[] bArr2 = new byte[(b.length + 2)];
        System.arraycopy(C113233r.m155003a(b.length), 0, bArr2, 0, 2);
        System.arraycopy(b, 0, bArr2, 2, b.length);
        return bArr2;
    }
}
