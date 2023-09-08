package p288a6;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.SystemClock;
import android.os.Vibrator;
import com.appaac.haptic.sync.VibrationPattern;
import java.io.File;
import p392w5.C22867c;
import p392w5.C26424f;
import p409b6.C23674a;
import p409b6.C23676c;
import p421x5.C26534c;

/* renamed from: a6.e */
public class C23614e implements C53978d {

    /* renamed from: a */
    public Context f67776a;

    /* renamed from: b */
    public Class f67777b;

    /* renamed from: c */
    public Handler f67778c;

    /* renamed from: d */
    public HandlerThread f67779d;

    /* renamed from: e */
    public C23676c f67780e;

    /* renamed from: f */
    public C23674a f67781f;

    /* renamed from: g */
    public C23610a f67782g = new C23610a();

    /* renamed from: a6.e$a */
    public class C23615a extends Handler {

        /* renamed from: a */
        public int f67783a = 0;

        /* renamed from: b */
        public final /* synthetic */ int f67784b;

        /* renamed from: c */
        public final /* synthetic */ int f67785c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23615a(Looper looper, int i, int i2) {
            super(looper);
            this.f67784b = i;
            this.f67785c = i2;
        }

        public void handleMessage(Message message) {
            try {
                C23614e eVar = C23614e.this;
                if (eVar.f67778c != null && eVar.f67779d != null) {
                    if (eVar.f67780e != null) {
                        switch (message.what) {
                            case 100:
                                long longValue = ((Long) message.obj).longValue();
                                C23614e eVar2 = C23614e.this;
                                C23674a aVar = eVar2.f67781f;
                                if (aVar != null) {
                                    int currentPosition = aVar.getCurrentPosition();
                                    if (currentPosition <= 0 || currentPosition < this.f67783a) {
                                        if (currentPosition >= 0 && currentPosition < this.f67783a) {
                                            C23614e eVar3 = C23614e.this;
                                            if (eVar3.f67782g.f67751c > 0) {
                                                eVar3.mo37116e(currentPosition);
                                            }
                                        }
                                        C23614e.this.f67778c.sendMessage(Message.obtain(message));
                                    } else {
                                        C23676c cVar = C23614e.this.f67780e;
                                        long j = (long) currentPosition;
                                        cVar.f67860a = j;
                                        cVar.mo37212a(j, longValue);
                                    }
                                    this.f67783a = currentPosition;
                                    return;
                                }
                                C23676c cVar2 = eVar2.f67780e;
                                cVar2.f67860a = longValue;
                                cVar2.mo37212a(longValue, longValue);
                                return;
                            case 101:
                                Object obj = message.obj;
                                if (obj instanceof Parcel) {
                                    Parcel parcel = (Parcel) obj;
                                    C23674a aVar2 = eVar.f67781f;
                                    if (aVar2 != null) {
                                        aVar2.getCurrentPosition();
                                    }
                                    VibrationPattern vibrationPattern = new VibrationPattern(parcel);
                                    String str = vibrationPattern.f68204d;
                                    if (C26424f.f73695a >= 24) {
                                        String replace = "{\n    \"Metadata\": {\n        \"Created\": \"2020-08-10\",\n        \"Description\": \"Haptic editor design\",\n        \"Version\": 2\n    },\n    \"PatternList\": [\n       {\n        \"AbsoluteTime\": 0,\n          ReplaceMe\n       }\n    ]\n}".replace("ReplaceMe", str);
                                        C22867c d = C22867c.m26824d(C23614e.this.f67776a);
                                        C23614e.this.getClass();
                                        d.mo36031a(replace, 1, 0, this.f67784b, this.f67785c);
                                    } else {
                                        C22867c d2 = C22867c.m26824d(C23614e.this.f67776a);
                                        C23614e.this.getClass();
                                        d2.mo36032b("{\"Metadata\": {\"Version\": 1}," + vibrationPattern.f68204d + "}", 1, 0, this.f67784b, this.f67785c);
                                    }
                                    parcel.recycle();
                                    return;
                                }
                                return;
                            case 102:
                                C23610a aVar3 = eVar.f67782g;
                                if (aVar3.f67751c > 0) {
                                    C23674a aVar4 = eVar.f67781f;
                                    if (aVar4 == null || aVar4.getCurrentPosition() <= C26424f.m34022d(C23614e.this.f67782g.f67749a)) {
                                        C23614e.this.mo37116e(0);
                                        return;
                                    } else {
                                        C23614e.this.f67778c.sendEmptyMessageDelayed(102, 10);
                                        return;
                                    }
                                } else {
                                    aVar3.f67757i = 9;
                                    eVar.getClass();
                                    return;
                                }
                            default:
                                return;
                        }
                    }
                }
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    public C23614e(Context context) {
        this.f67776a = context;
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        try {
            this.f67777b = Class.forName("android.os.RichTapVibrationEffect");
            int intValue = ((Integer) this.f67777b.getMethod("checkIfRichTapSupport", new Class[0]).invoke((Object) null, new Object[0])).intValue();
            if (1 == intValue) {
                C26424f.f73697c = true;
                return;
            }
            C26424f.f73695a = (65280 & intValue) >> 8;
            C26424f.f73696b = (intValue & 255) >> 0;
            C26424f.f73697c = false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo37115a(String str, int i, int i2, C23674a aVar) {
        this.f67781f = aVar;
        HandlerThread handlerThread = new HandlerThread("Richtap-Sync");
        this.f67779d = handlerThread;
        handlerThread.start();
        C23615a aVar2 = new C23615a(this.f67779d.getLooper(), i, i2);
        this.f67778c = aVar2;
        C23676c cVar = new C23676c(aVar2, str, this.f67782g);
        this.f67780e = cVar;
        C23674a aVar3 = this.f67782g.f67755g;
        if (aVar3 != null) {
            if (aVar3.getCurrentPosition() < 0) {
                this.f67780e.f67860a = (long) this.f67782g.f67755g.getCurrentPosition();
                this.f67780e.mo37212a((long) this.f67782g.f67755g.getCurrentPosition(), (long) this.f67782g.f67756h);
                return;
            }
            C23676c cVar2 = this.f67780e;
            long j = (long) this.f67782g.f67756h;
            cVar2.f67860a = j;
            cVar2.mo37212a(j, j);
        } else if (aVar == null && C26424f.f73695a >= 24) {
            C22867c.m26824d(this.f67776a).mo36031a(str, 1, 0, i, i2);
            this.f67778c.sendEmptyMessageDelayed(102, (long) C26424f.m34022d(str));
        } else if (aVar != null) {
            cVar.f67860a = (long) aVar.getCurrentPosition();
            this.f67780e.mo37212a((long) aVar.getCurrentPosition(), 0);
        } else {
            synchronized (cVar) {
                cVar.mo37214c(0, 0);
            }
            cVar.mo37213b();
        }
    }

    /* renamed from: b */
    public void mo37103b(boolean z) {
        if (z) {
            this.f67782g.f67751c = Integer.MAX_VALUE;
        } else {
            this.f67782g.f67751c = 0;
        }
    }

    /* renamed from: c */
    public void mo37104c() {
        this.f67782g.mo37100b();
        mo37117f();
        C22867c.m26824d(this.f67776a).mo36035f();
    }

    /* renamed from: d */
    public void mo37105d(File file, int i, int i2, C23674a aVar) {
        this.f67782g.mo37100b();
        C23610a aVar2 = this.f67782g;
        aVar2.f67758j = file;
        aVar2.f67752d = i;
        aVar2.f67753e = i2;
        aVar2.f67755g = aVar;
    }

    /* renamed from: e */
    public boolean mo37116e(int i) {
        if (C23610a.m28204a(this.f67782g.f67754f) && i >= 0 && i <= this.f67782g.f67754f.getDuration()) {
            mo37117f();
            C22867c.m26824d(this.f67776a).mo36035f();
            C23610a aVar = this.f67782g;
            aVar.f67756h = i;
            String c = C26424f.m34021c(aVar.f67749a, i);
            if (c == null || "".equals(c)) {
                C23610a aVar2 = this.f67782g;
                if (aVar2.f67751c > 0) {
                    String str = aVar2.f67749a;
                    aVar2.f67756h = 0;
                    c = str;
                } else {
                    aVar2.f67757i = 9;
                }
            }
            C23610a aVar3 = this.f67782g;
            if (6 != aVar3.f67757i) {
                return true;
            }
            aVar3.f67750b = SystemClock.elapsedRealtime();
            C23610a aVar4 = this.f67782g;
            C23674a aVar5 = aVar4.f67755g;
            if (aVar5 != null) {
                mo37115a(aVar4.f67749a, aVar4.f67752d, aVar4.f67753e, aVar5);
            } else {
                mo37115a(c, aVar4.f67752d, aVar4.f67753e, (C23674a) null);
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo37117f() {
        HandlerThread handlerThread = this.f67779d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f67779d = null;
            this.f67778c = null;
            this.f67780e = null;
        }
    }

    public void pause() {
        if (6 == this.f67782g.f67757i) {
            mo37117f();
            C22867c.m26824d(this.f67776a).mo36035f();
            C23610a aVar = this.f67782g;
            aVar.f67757i = 7;
            if (!C23610a.m28204a(aVar.f67754f)) {
                this.f67782g.f67756h = 0;
                return;
            }
            C23610a aVar2 = this.f67782g;
            C23674a aVar3 = aVar2.f67755g;
            if (aVar3 != null) {
                aVar2.f67756h = aVar3.getCurrentPosition();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C23610a aVar4 = this.f67782g;
            int i = (int) (elapsedRealtime - aVar4.f67750b);
            if (i < 0) {
                aVar4.f67756h = 0;
            } else {
                aVar4.f67756h += i;
            }
        }
    }

    public boolean prepare() {
        C23610a aVar = this.f67782g;
        File file = aVar.f67758j;
        if (file != null) {
            aVar.f67749a = C26424f.m34026h(file);
        }
        if (1 == C26424f.m34027i(this.f67782g.f67749a)) {
            C23610a aVar2 = this.f67782g;
            aVar2.f67749a = C26424f.m34019a(aVar2.f67749a);
        }
        if (24 > C26424f.f73695a) {
            C23610a aVar3 = this.f67782g;
            aVar3.f67749a = C26424f.m34028j(aVar3.f67749a);
            C23610a aVar4 = this.f67782g;
            aVar4.f67749a = C26424f.m34029k(aVar4.f67749a);
        }
        C26534c g = C26424f.m34025g(this.f67782g.f67749a);
        if (!C23610a.m28204a(g)) {
            this.f67782g.mo37100b();
            return false;
        }
        this.f67782g.f67754f = g;
        return true;
    }

    public void release() {
        this.f67782g.mo37100b();
        mo37117f();
    }

    public boolean start() {
        C23610a aVar = this.f67782g;
        if (6 == aVar.f67757i || !C23610a.m28204a(aVar.f67754f)) {
            return false;
        }
        C23610a aVar2 = this.f67782g;
        if (aVar2.f67756h < 0) {
            return false;
        }
        if (9 == aVar2.f67757i) {
            aVar2.f67756h = 0;
        }
        String c = C26424f.m34021c(aVar2.f67749a, aVar2.f67756h);
        if (c == null || "".equals(c)) {
            this.f67782g.f67757i = 9;
            return false;
        }
        this.f67782g.f67750b = SystemClock.elapsedRealtime();
        C23610a aVar3 = this.f67782g;
        aVar3.f67757i = 6;
        C23674a aVar4 = aVar3.f67755g;
        if (aVar4 != null) {
            mo37115a(aVar3.f67749a, aVar3.f67752d, aVar3.f67753e, aVar4);
            return true;
        }
        mo37115a(c, aVar3.f67752d, aVar3.f67753e, (C23674a) null);
        return true;
    }
}
