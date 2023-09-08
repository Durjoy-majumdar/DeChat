package p774zg;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zg.h */
public final class C91714h implements C91687c {

    /* renamed from: a */
    public final Map<Integer, C91716i> f262714a = new HashMap();

    /* renamed from: b */
    public final AtomicInteger f262715b = new AtomicInteger(0);

    /* renamed from: a */
    public C91716i mo125561a(int i) {
        Log.m105924i("MicroMsg.ShareBufferTracerManager", "getBuffer[" + i + ']');
        return (C91716i) ((HashMap) this.f262714a).get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo125562b(int i) {
        Log.m105924i("MicroMsg.ShareBufferTracerManager", "untrace[" + i + ']');
        ((HashMap) this.f262714a).remove(Integer.valueOf(i));
    }
}
