package wy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import rx3.C13598b0;

/* renamed from: wy1.g */
public final class C53242g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f148573d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<String> f148574e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<String, C13598b0> f148575f;

    public C53242g(AtomicInteger atomicInteger, LinkedList<String> linkedList, C32226l<? super String, C13598b0> lVar) {
        this.f148573d = atomicInteger;
        this.f148574e = linkedList;
        this.f148575f = lVar;
    }

    public final void run() {
        if (this.f148573d.incrementAndGet() == 2) {
            Log.m105924i("GameLife.PluginGameLife", "checkSessionIdAndContact success: " + this.f148574e.get(0));
            this.f148575f.invoke(this.f148574e.get(0));
        }
    }
}
