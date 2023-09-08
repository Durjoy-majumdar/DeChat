package wy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import rx3.C13598b0;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: wy1.f */
public final class C53241f implements C15913g.C15916c {

    /* renamed from: a */
    public final /* synthetic */ String f148568a;

    /* renamed from: b */
    public final /* synthetic */ String f148569b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f148570c;

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f148571d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<String, C13598b0> f148572e;

    public C53241f(String str, String str2, Runnable runnable, AtomicInteger atomicInteger, C32226l<? super String, C13598b0> lVar) {
        this.f148568a = str;
        this.f148569b = str2;
        this.f148570c = runnable;
        this.f148571d = atomicInteger;
        this.f148572e = lVar;
    }

    /* renamed from: a */
    public final void mo445a(Map<String, C15912f> map) {
        C15912f fVar = map.get(this.f148568a);
        boolean z = true;
        if (fVar != null && fVar.isValid()) {
            C15912f fVar2 = map.get(this.f148569b);
            if (fVar2 == null || !fVar2.isValid()) {
                z = false;
            }
            if (z) {
                this.f148570c.run();
                return;
            }
        }
        if (this.f148571d.getAndSet(-1) >= 0) {
            Log.m105920e("GameLife.PluginGameLife", "checkSessionIdAndContact get contact failed");
            this.f148572e.invoke(null);
        }
    }
}
