package gu3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import eu3.C116786g;
import eu3.C97749e;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gu3.c */
public class C116992c {

    /* renamed from: b */
    public static final C116992c f350566b = new C116992c();

    /* renamed from: c */
    public static final ConcurrentHashMap<Looper, WeakReference<Handler>> f350567c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final Looper f350568a;

    /* renamed from: gu3.c$a */
    public static class C116993a extends Handler {

        /* renamed from: a */
        public final String f350569a;

        public C116993a(String str, Looper looper, Handler.Callback callback) {
            super(looper, callback);
            this.f350569a = str;
        }

        public String toString() {
            return this.f350569a;
        }
    }

    public C116992c() {
        int i = C116786g.f350105b;
        HandlerThread a = C97749e.m126093a("TP#Internal", 5);
        a.setPriority(8);
        a.start();
        this.f350568a = a.getLooper();
    }

    /* renamed from: a */
    public static Handler m165057a(String str, Handler.Callback callback) {
        C116992c cVar = f350566b;
        C116993a aVar = new C116993a(str, cVar.f350568a, callback);
        f350567c.put(cVar.f350568a, new WeakReference(aVar));
        return aVar;
    }
}
