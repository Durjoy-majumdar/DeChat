package uk1;

import ak1.C54116w;
import android.graphics.Point;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import ok1.C62042e;

/* renamed from: uk1.g */
public final class C37479g {

    /* renamed from: a */
    public long f99029a;

    /* renamed from: b */
    public int f99030b;

    /* renamed from: c */
    public int f99031c = 1;

    /* renamed from: d */
    public Point f99032d;

    /* renamed from: e */
    public long f99033e;

    /* renamed from: a */
    public final void mo61123a(boolean z) {
        if (!C62042e.f176370a.mo87027N0()) {
            mo61125c(z);
            this.f99029a = 0;
            this.f99033e = 0;
            Log.m105924i("Finder.FinderLiveMiniWindowReporter", "exit clickCloseBtn:" + z);
        }
    }

    /* renamed from: b */
    public final void mo61124b() {
        int i;
        int i2 = 1;
        boolean z = this.f99030b == 0;
        Point point = this.f99032d;
        if (point != null) {
            int i3 = point.x;
            int i4 = point.y;
            if (i3 == i4) {
                i2 = 3;
            } else if (i3 > i4) {
                i2 = 2;
            }
            i = i2;
        } else {
            i = 1;
        }
        ((C54116w) C86312j.m106911c(C54116w.class)).ay0(z, 1, 0, i, this.f99031c);
    }

    /* renamed from: c */
    public final void mo61125c(boolean z) {
        Class cls = C54116w.class;
        if (this.f99029a > 0) {
            int i = 1;
            boolean z2 = this.f99030b == 0;
            long c = C31543z5.m39453c() - this.f99029a;
            Point point = this.f99032d;
            if (point != null) {
                int i2 = point.x;
                int i3 = point.y;
                if (i2 == i3) {
                    i = 3;
                } else if (i2 > i3) {
                    i = 2;
                }
            }
            ((C54116w) C86312j.m106911c(cls)).ay0(z2, 2, c, i, this.f99031c);
            if (z) {
                ((C54116w) C86312j.m106911c(cls)).ay0(z2, 3, c, i, this.f99031c);
                return;
            }
            return;
        }
        Log.m105924i("Finder.FinderLiveMiniWindowReporter", "reportExit but lastEnterTime <= 0, lastEnterTime:" + this.f99029a);
    }
}
