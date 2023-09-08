package wy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import rx3.C13598b0;
import xy1.C53475k;

/* renamed from: wy1.e */
public final class C53240e implements C53475k.C38908a {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f148564a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<String, C13598b0> f148565b;

    /* renamed from: c */
    public final /* synthetic */ LinkedList<String> f148566c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f148567d;

    public C53240e(AtomicInteger atomicInteger, C32226l<? super String, C13598b0> lVar, LinkedList<String> linkedList, Runnable runnable) {
        this.f148564a = atomicInteger;
        this.f148565b = lVar;
        this.f148566c = linkedList;
        this.f148567d = runnable;
    }

    /* renamed from: a */
    public final void mo7487a(String str) {
        if (!(str == null || str.length() == 0)) {
            this.f148566c.add(str);
            this.f148567d.run();
        } else if (this.f148564a.getAndSet(-1) >= 0) {
            Log.m105920e("GameLife.PluginGameLife", "checkSessionIdAndContact get session failed");
            this.f148565b.invoke(null);
        }
    }
}
