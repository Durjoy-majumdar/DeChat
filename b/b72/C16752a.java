package b72;

import c72.C16867c;
import com.tencent.p014mm.sdk.platformtools.Log;
import d72.C20446a;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicInteger;
import p1081gi.C98127h;
import t62.C22438a;
import u62.C22595e;
import z62.C66735c;

/* renamed from: b72.a */
public abstract class C16752a implements Runnable {

    /* renamed from: n */
    public static AtomicInteger f45270n = new AtomicInteger(0);

    /* renamed from: o */
    public static AtomicInteger f45271o = new AtomicInteger(0);

    /* renamed from: d */
    public final C22595e f45272d;

    /* renamed from: e */
    public final C66735c f45273e;

    /* renamed from: f */
    public String f45274f = "AbsMMMarsDownloaderTask";

    /* renamed from: g */
    public String f45275g;

    /* renamed from: h */
    public String f45276h;

    /* renamed from: i */
    public C16753a f45277i;

    /* renamed from: j */
    public final C22438a f45278j;

    /* renamed from: b72.a$a */
    public enum C16753a {
        IDLE,
        WAITING,
        PROGRESS,
        CANCEL,
        SUCCESS,
        FAILED
    }

    public C16752a(C22595e eVar, C66735c cVar) {
        String str;
        C87412m.m108594g(eVar, "onePlayContext");
        C87412m.m108594g(cVar, "mediaSource");
        this.f45272d = eVar;
        this.f45273e = cVar;
        this.f45275g = cVar.f191765a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f45275g);
        sb.append('_');
        if (this instanceof C16867c) {
            str = "mmdownload_" + f45270n.getAndIncrement();
        } else if (this instanceof C20446a) {
            str = "mmpreload_" + f45271o.getAndIncrement();
        } else {
            str = "unknown";
        }
        sb.append(str);
        this.f45276h = sb.toString();
        this.f45277i = C16753a.IDLE;
        this.f45278j = eVar.mo35701e();
    }

    /* renamed from: a */
    public final void mo17756a(C16753a aVar) {
        C87412m.m108594g(aVar, "toState");
        String c = mo17757c();
        Log.m105924i(c, "changeTaskState from " + this.f45277i + " to " + aVar);
        this.f45277i = aVar;
    }

    /* renamed from: c */
    public String mo17757c() {
        return this.f45272d.mo35698b(this.f45274f);
    }

    /* renamed from: d */
    public final boolean mo17758d() {
        C16753a aVar = this.f45277i;
        C16753a aVar2 = C16753a.PROGRESS;
        if (aVar == aVar2) {
            String c = mo17757c();
            Log.m105928w(c, "startDownload return for state:" + this.f45277i);
            return false;
        } else if (this.f45278j.mo22517a()) {
            Log.m105928w(mo17757c(), "startDownload return for cacheCompete");
            return false;
        } else {
            C98127h hVar = this.f45273e.f191770c;
            if (hVar.field_fileId == null) {
                hVar.field_fileId = "";
            }
            if (hVar.field_aesKey == null) {
                hVar.field_aesKey = "";
            }
            hVar.f287661e = false;
            boolean f = mo17759f(hVar);
            if (f) {
                mo17756a(aVar2);
            } else {
                mo17756a(C16753a.FAILED);
            }
            return f;
        }
    }

    /* renamed from: f */
    public abstract boolean mo17759f(C98127h hVar);

    /* renamed from: i */
    public final void mo17760i() {
        C16753a aVar = this.f45277i;
        C16753a aVar2 = C16753a.CANCEL;
        if (aVar == aVar2) {
            String c = mo17757c();
            Log.m105928w(c, "startDownload return for state:" + this.f45277i);
        } else if (aVar == C16753a.IDLE || aVar == C16753a.WAITING) {
            String c2 = mo17757c();
            Log.m105928w(c2, "startDownload return for state:" + this.f45277i);
        } else {
            mo17761k();
            mo17756a(aVar2);
        }
    }

    /* renamed from: k */
    public abstract void mo17761k();

    public String toString() {
        return this.f45272d.mo35698b(this.f45274f) + '.' + this.f45276h;
    }
}
