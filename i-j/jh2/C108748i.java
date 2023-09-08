package jh2;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.mmsight.segment.C105477c;
import com.tencent.p014mm.plugin.mmsight.segment.C105486j;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.concurrent.Callable;
import jp3.C9486a;
import jp3.C9487b;
import p914oj.C89231c;

/* renamed from: jh2.i */
public final class C108748i extends C60856b {

    /* renamed from: p */
    public final String f325642p;

    /* renamed from: q */
    public final long f325643q;

    /* renamed from: r */
    public final long f325644r;

    /* renamed from: s */
    public int f325645s = 1000;

    /* renamed from: t */
    public C105477c.C105478a f325646t;

    /* renamed from: u */
    public C105477c f325647u;

    /* renamed from: jh2.i$a */
    public static final class C108749a<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ C108748i f325648d;

        public C108749a(C108748i iVar) {
            this.f325648d = iVar;
        }

        public Object call() {
            C108748i iVar = this.f325648d;
            return C105486j.m141676a(iVar.f325642p, iVar.f325645s, iVar.f173387k, iVar.f173388l);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108748i(C9487b<C9486a> bVar, String str, long j, long j2, int i) {
        super(bVar);
        C87412m.m108594g(bVar, "lifeCycleKeeper");
        C87412m.m108594g(str, "videoPath");
        this.f325642p = str;
        this.f325643q = j;
        this.f325644r = j2;
        this.f173384h = i;
    }

    /* renamed from: a */
    public Bitmap mo85763a(int i) {
        String str = this.f173379c;
        Log.m105924i(str, "nextBitmap:" + this.f173381e[i]);
        C105477c cVar = this.f325647u;
        Bitmap frameAtTime = cVar != null ? cVar.getFrameAtTime((long) this.f173381e[i]) : null;
        if (frameAtTime != null) {
            return frameAtTime;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f173387k, this.f173388l, Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap, "{\n\n            // TODO c…nfig.ARGB_8888)\n        }");
        return createBitmap;
    }

    /* renamed from: b */
    public void mo85764b() {
        C105477c.C105478a aVar = this.f325646t;
        if (aVar != null) {
            aVar.mo150276c(this.f325647u);
        }
        C105477c.C105478a aVar2 = this.f325646t;
        if (aVar2 != null) {
            aVar2.mo150275b();
        }
    }

    /* renamed from: c */
    public void mo85765c() {
        C94554a c = C94555d.m119567c(this.f325642p, true);
        int i = c != null ? c.f273443a : 0;
        if (i <= 0) {
            try {
                C89231c cVar = new C89231c();
                cVar.setDataSource(this.f325642p);
                i = Util.getInt(cVar.extractMetadata(9), 0);
            } catch (Exception unused) {
            }
        }
        if (i <= 0) {
            Log.m105928w(this.f173379c, "get video duration error! file exit: " + C86013q1.m106450k(this.f325642p));
        }
        this.f325646t = new C105477c.C105478a(3, new C108749a(this));
        long j = this.f325643q;
        if (j < 0) {
            j = 0;
        }
        long j2 = this.f325644r;
        if (j2 < 0) {
            j2 = (long) i;
        }
        long j3 = j2 - j;
        if (j3 > 0) {
            long j4 = (long) 100;
            this.f173381e = new int[]{(int) (j + j4), (int) (j3 / ((long) 2)), (int) (j2 - j4)};
        } else if (i > 300) {
            this.f173381e = new int[]{100, i / 2, i - 100};
        }
        if (this.f173384h == 10) {
            this.f173383g = j2;
        } else {
            this.f173383g = (long) i;
        }
        Log.m105924i(this.f173379c, "videoDuration:" + i + ", start:" + j + ", end:" + j2);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.f173387k, this.f173388l, Bitmap.Config.ARGB_8888);
            C105477c.C105478a aVar = this.f325646t;
            C105477c a = aVar != null ? aVar.mo150274a() : null;
            this.f325647u = a;
            if (a != null) {
                a.reuseBitmap(createBitmap);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f173379c, e, "processImageData error", new Object[0]);
        }
    }
}
