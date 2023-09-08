package com.tencent.luggage.sdk.launching;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.tencent.luggage.sdk.launching.f */
public final class C80245f {
    /* renamed from: a */
    public static final <R extends Parcelable> C80242c<R> m97631a(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        OnWXAppResultEventBinder onWXAppResultEventBinder = (OnWXAppResultEventBinder) parcel.readParcelable(OnWXAppResultEventBinder.class.getClassLoader());
        if (onWXAppResultEventBinder == null) {
            return null;
        }
        return new C80239a(onWXAppResultEventBinder.f78579d, onWXAppResultEventBinder.f78580e);
    }

    /* renamed from: b */
    public static final void m97632b(C80242c<?> cVar) {
        C80239a aVar = cVar instanceof C80239a ? (C80239a) cVar : null;
        if (aVar != null && !aVar.f234919d.getAndSet(true)) {
            aVar.mo111346b(new OnWXAppResultXPCMessage(aVar.f234917b, 2, (Parcelable) null, (String) null, (String) null, 24, (C8480h) null));
        }
    }

    /* renamed from: c */
    public static final <R extends Parcelable> void m97633c(C80242c<R> cVar, Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        m97634d(cVar, parcel, 0, 4, (Object) null);
    }

    /* renamed from: d */
    public static void m97634d(C80242c cVar, Parcel parcel, int i, int i2, Object obj) {
        OnWXAppResultEventBinder onWXAppResultEventBinder;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C87412m.m108594g(parcel, "parcel");
        if (cVar == null) {
            onWXAppResultEventBinder = null;
        } else if (cVar instanceof C80239a) {
            C80239a aVar = (C80239a) cVar;
            onWXAppResultEventBinder = new OnWXAppResultEventBinder(aVar.f234917b, aVar.f234918c);
        } else {
            int hash = Objects.hash(new Object[]{Integer.valueOf(cVar.hashCode()), Long.valueOf(System.currentTimeMillis())});
            OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1 onWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1 = new OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1(hash, cVar, C40008f.f107254d);
            onWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1.alive();
            OnWXAppResultEventBinder onWXAppResultEventBinder2 = new OnWXAppResultEventBinder(hash, MMApplicationContext.getProcessName());
            ((ConcurrentLinkedQueue) cVar.f234922a).offer(new C80244e(onWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1));
            onWXAppResultEventBinder = onWXAppResultEventBinder2;
        }
        parcel.writeParcelable(onWXAppResultEventBinder, i);
    }
}
