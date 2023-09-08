package p225rc;

import com.tencent.p014mm.sdk.platformtools.Util;
import fu3.C116901a;
import junit.framework.Assert;

/* renamed from: rc.b */
public final class C89913b {

    /* renamed from: a */
    public final C116901a f258371a;

    /* renamed from: b */
    public final Runnable f258372b;

    /* renamed from: c */
    public volatile long f258373c = 0;

    /* renamed from: d */
    public volatile long f258374d = -1;

    public C89913b(C116901a aVar, Runnable runnable) {
        this.f258371a = aVar;
        this.f258372b = runnable;
    }

    /* renamed from: a */
    public void mo124221a(long j) {
        Assert.assertTrue(j >= 0);
        this.f258373c = Util.nowMilliSecond();
        this.f258374d = j;
        this.f258371a.removeCallbacks(this.f258372b);
        this.f258371a.postDelayed(this.f258372b, j);
    }
}
