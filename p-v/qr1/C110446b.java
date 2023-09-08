package qr1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.util.LruCache;
import android.view.Surface;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.CMTime;
import d03.C58010a;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32226l;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C24565l;
import gy3.C45983e0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ic0.C108455d;
import j03.C60695a;
import j03.C60700d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import sp3.C36777d;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64175a0;
import zt3.C119157j;

/* renamed from: qr1.b */
public final class C110446b implements C36777d {

    /* renamed from: j */
    public static final LruCache<String, Bitmap> f330283j = new LruCache<>(200);

    /* renamed from: a */
    public final C63320d f330284a;

    /* renamed from: b */
    public final String f330285b;

    /* renamed from: c */
    public final String f330286c;

    /* renamed from: d */
    public final C110461j f330287d;

    /* renamed from: e */
    public final LinkedList<C110452c> f330288e = new LinkedList<>();

    /* renamed from: f */
    public volatile boolean f330289f;

    /* renamed from: g */
    public C60700d f330290g;

    /* renamed from: h */
    public boolean f330291h;

    /* renamed from: i */
    public Bitmap f330292i;

    /* renamed from: qr1.b$a */
    public static final class C110447a implements C108455d {

        /* renamed from: a */
        public final /* synthetic */ C110446b f330293a;

        public C110447a(C110446b bVar) {
            this.f330293a = bVar;
        }

        /* renamed from: a */
        public final void mo26263a(boolean z, Object[] objArr) {
            if (z) {
                this.f330293a.mo161941e();
                Log.m105924i(this.f330293a.f330286c, "init download first thumb succ");
            }
        }
    }

    /* renamed from: qr1.b$b */
    public static final class C110448b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110446b f330294d;

        /* renamed from: e */
        public final /* synthetic */ C60700d.C60701a f330295e;

        /* renamed from: f */
        public final /* synthetic */ Object f330296f;

        /* renamed from: qr1.b$b$a */
        public static final class C110449a extends C87413o implements C32227p<String, Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C110446b f330297d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C110449a(C110446b bVar) {
                super(2);
                this.f330297d = bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                ((Number) obj2).intValue();
                C110446b bVar = this.f330297d;
                Log.m105924i(bVar.f330286c, "video download complete");
                bVar.f330291h = true;
                if (bVar.f330289f) {
                    C110452c cVar = bVar.f330288e.get(0);
                    C87412m.m108593f(cVar, "requests[0]");
                    bVar.mo161939c(cVar.f330300a);
                } else {
                    bVar.mo161940d();
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qr1.b$b$b */
        public static final class C110450b extends C87413o implements C32226l<Surface, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C110446b f330298d;

            /* renamed from: e */
            public final /* synthetic */ Object f330299e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C110450b(C110446b bVar, Object obj) {
                super(1);
                this.f330298d = bVar;
                this.f330299e = obj;
            }

            public Object invoke(Object obj) {
                Surface surface = (Surface) obj;
                C87412m.m108594g(surface, LocaleUtil.ITALIAN);
                Log.m105924i(this.f330298d.f330286c, "thumbRenderer setup finished");
                C60700d dVar = this.f330298d.f330290g;
                if (dVar != null) {
                    dVar.mo85606d(surface, true);
                }
                C60700d dVar2 = this.f330298d.f330290g;
                if (dVar2 != null) {
                    dVar2.mo85619m();
                }
                Object obj2 = this.f330299e;
                C110446b bVar = this.f330298d;
                synchronized (obj2) {
                    try {
                        obj2.notifyAll();
                    } catch (Exception e) {
                        Log.printErrStackTrace(bVar.f330286c, e, "notify init thumb fetcher error", new Object[0]);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qr1.b$b$c */
        public /* synthetic */ class C110451c extends C24565l implements C32227p<Bitmap, Long, C13598b0> {
            public C110451c(Object obj) {
                super(2, obj, C110446b.class, "onFrameGenerated", "onFrameGenerated(Landroid/graphics/Bitmap;J)V", 0);
            }

            public Object invoke(Object obj, Object obj2) {
                Bitmap bitmap = (Bitmap) obj;
                long longValue = ((Number) obj2).longValue();
                C87412m.m108594g(bitmap, "p0");
                C110446b bVar = (C110446b) this.receiver;
                String str = bVar.f330286c;
                Log.m105924i(str, "onFrameGenerated, " + bitmap + ", " + longValue);
                C45983e0 e0Var = new C45983e0();
                e0Var.f124000d = -1;
                synchronized (bVar.f330288e) {
                    C64175a0.m75512t(bVar.f330288e, new C110454c(longValue, e0Var, bitmap, bVar));
                }
                String str2 = bVar.f330286c;
                Log.m105924i(str2, "get " + bVar.hashCode() + ": " + e0Var.f124000d + 65292 + longValue);
                bVar.f330289f = false;
                bVar.mo161940d();
                if (e0Var.f124000d >= 0) {
                    LruCache<String, Bitmap> lruCache = C110446b.f330283j;
                    lruCache.put(bVar.f330285b + '-' + e0Var.f124000d, bitmap);
                }
                return C13598b0.f38549a;
            }
        }

        public C110448b(C110446b bVar, C60700d.C60701a aVar, Object obj) {
            this.f330294d = bVar;
            this.f330295e = aVar;
            this.f330296f = obj;
        }

        public final void run() {
            String str = this.f330294d.f330286c;
            StringBuilder sb = new StringBuilder();
            sb.append("create new TPTrackThumbFetcher, mediaInfo:");
            sb.append(this.f330294d.f330284a.f179677n);
            sb.append(", loader.isAllComplete:");
            C60700d.C60701a aVar = this.f330295e;
            sb.append(aVar != null ? aVar.f172899g : false);
            Log.m105924i(str, sb.toString());
            C110446b bVar = this.f330294d;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            bVar.f330290g = new C60700d(context);
            C60700d dVar = this.f330294d.f330290g;
            if (dVar != null) {
                dVar.setMute(true);
            }
            C60700d.C60701a aVar2 = this.f330295e;
            if (aVar2 != null) {
                C110446b bVar2 = this.f330294d;
                C60700d dVar2 = bVar2.f330290g;
                if (dVar2 != null) {
                    C58010a aVar3 = bVar2.f330284a.f179677n;
                    C87412m.m108594g(aVar3, "mediaInfo");
                    String str2 = dVar2.f172871b;
                    Log.m105924i(str2, "setCdnResourceLoader, loader:" + aVar2.hashCode() + ", mediaId:" + aVar2.f172896d + ", isMoovReady:" + aVar2.f172898f);
                    dVar2.f172876g = aVar2;
                    dVar2.f172873d = aVar3;
                    dVar2.f172877h = true;
                    dVar2.mo85639z(true);
                    dVar2.f172865B = true;
                }
            } else {
                C110446b bVar3 = this.f330294d;
                C60700d dVar3 = bVar3.f330290g;
                if (dVar3 != null) {
                    dVar3.setMediaInfo(bVar3.f330284a.f179677n);
                }
            }
            C110446b bVar4 = this.f330294d;
            C60700d.C60701a aVar4 = this.f330295e;
            bVar4.f330291h = aVar4 != null ? aVar4.f172899g : false;
            C60700d dVar4 = bVar4.f330290g;
            if (dVar4 != null) {
                dVar4.f172880k = true;
            }
            if (dVar4 != null) {
                dVar4.f172864A = true;
            }
            C60700d.C60701a aVar5 = dVar4 != null ? dVar4.f172876g : null;
            if (aVar5 != null) {
                aVar5.f172902j = new C110449a(bVar4);
            }
            C110446b bVar5 = this.f330294d;
            C110461j jVar = bVar5.f330287d;
            C58010a aVar6 = bVar5.f330284a.f179677n;
            jVar.getClass();
            C87412m.m108594g(aVar6, "mediaInfo");
            String str3 = jVar.f330317c;
            Log.m105924i(str3, "mediaInfo:" + aVar6);
            jVar.f330326l = aVar6;
            C110446b bVar6 = this.f330294d;
            C110461j jVar2 = bVar6.f330287d;
            C110450b bVar7 = new C110450b(bVar6, this.f330296f);
            jVar2.getClass();
            String str4 = jVar2.f330317c;
            Log.m105924i(str4, "setup, output size:[" + jVar2.f330315a + ',' + jVar2.f330316b + ']');
            jVar2.f330321g = bVar7;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("TPTrackThumbRenderer@");
            sb4.append(jVar2.hashCode());
            String sb5 = sb4.toString();
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a(sb5, 0);
            a.start();
            jVar2.f330320f = new MMHandler(a.getLooper());
            jVar2.f330319e = a;
            jVar2.mo161947b(new C110455e(jVar2));
            jVar2.mo161947b(new C110458g(jVar2));
            jVar2.mo161947b(new C110459h(jVar2));
            jVar2.mo161947b(new C110463k(jVar2));
            C110461j jVar3 = this.f330294d.f330287d;
            C110451c cVar = new C110451c(this.f330294d);
            jVar3.getClass();
            jVar3.f330329o = cVar;
        }
    }

    /* renamed from: qr1.b$c */
    public static final class C110452c {

        /* renamed from: a */
        public final long f330300a;

        /* renamed from: b */
        public final C32227p<Long, Bitmap, C13598b0> f330301b;

        /* renamed from: c */
        public final CMTime f330302c;

        public C110452c(long j, C32227p pVar, CMTime cMTime, int i, C8480h hVar) {
            if ((i & 4) != 0) {
                cMTime = CMTime.fromMs(j);
                C87412m.m108593f(cMTime, "fromMs(timeMs)");
            }
            C87412m.m108594g(pVar, "callback");
            C87412m.m108594g(cMTime, "cmTime");
            this.f330300a = j;
            this.f330301b = pVar;
            this.f330302c = cMTime;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C110452c)) {
                return false;
            }
            C110452c cVar = (C110452c) obj;
            return this.f330300a == cVar.f330300a && C87412m.m108589b(this.f330301b, cVar.f330301b) && C87412m.m108589b(this.f330302c, cVar.f330302c);
        }

        public int hashCode() {
            long j = this.f330300a;
            return (((((int) (j ^ (j >>> 32))) * 31) + this.f330301b.hashCode()) * 31) + this.f330302c.hashCode();
        }

        public String toString() {
            return "Request(timeMs=" + this.f330300a + ", callback=" + this.f330301b + ", cmTime=" + this.f330302c + ')';
        }
    }

    /* renamed from: qr1.b$d */
    public static final class C110453d extends C87413o implements C32226l<C110452c, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ long f330303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110453d(long j) {
            super(1);
            this.f330303d = j;
        }

        public Object invoke(Object obj) {
            C110452c cVar = (C110452c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(cVar.f330300a == this.f330303d);
        }
    }

    public C110446b(C63320d dVar, C60700d.C60701a aVar) {
        C87412m.m108594g(dVar, "trackInfo");
        this.f330284a = dVar;
        this.f330285b = dVar.f179677n.f165949u;
        String str = "MicroMsg.TPTrackThumbFetcher@" + hashCode();
        this.f330286c = str;
        this.f330287d = new C110461j(dVar.f187121a, dVar.f187122b);
        if (C86013q1.m106450k(dVar.f179677n.f165938j)) {
            mo161941e();
            Log.m105924i(str, "init check first thumb exist");
        } else {
            String str2 = dVar.f179677n.f165938j;
            C87412m.m108593f(str2, "trackInfo.mediaInfo.thumbPath");
            if (str2.length() > 0) {
                String str3 = dVar.f179677n.f165936h;
                C87412m.m108593f(str3, "trackInfo.mediaInfo.thumbUrl");
                if (str3.length() > 0) {
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59350f = dVar.f179677n.f165938j;
                    bVar.f59346b = true;
                    bVar.f59345a = true;
                    C20828a.m22825b().mo32515d(dVar.f179677n.f165936h, bVar.mo32666a(), new C110447a(this));
                }
            }
        }
        Object obj = new Object();
        ((C119157j) C119157j.f356862d).mo183895z(new C110448b(this, aVar, obj));
        synchronized (obj) {
            try {
                obj.wait();
            } catch (Exception e) {
                Log.printErrStackTrace(this.f330286c, e, "wait init thumb fetcher error", new Object[0]);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        Log.m105924i(this.f330286c, "init thumb fetcher finished");
    }

    /* renamed from: C */
    public void mo58663C(int i, int i2) {
        C110461j jVar = this.f330287d;
        if (!(jVar.f330315a == i && jVar.f330316b == i2)) {
            jVar.f330328n = true;
        }
        jVar.f330315a = i;
        jVar.f330316b = i2;
    }

    /* renamed from: a */
    public void mo58664a(long j) {
        synchronized (this.f330288e) {
            C64175a0.m75512t(this.f330288e, new C110453d(j));
        }
    }

    /* renamed from: b */
    public void mo58665b(List<Long> list, C32227p<? super Long, ? super Bitmap, C13598b0> pVar) {
        C87412m.m108594g(list, "times");
        C87412m.m108594g(pVar, "callback");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            long longValue = ((Number) next).longValue();
            String str = this.f330286c;
            Log.m105924i(str, "requestFrames: " + longValue);
            LruCache<String, Bitmap> lruCache = f330283j;
            Bitmap bitmap = lruCache.get(this.f330285b + '-' + longValue);
            boolean z = true;
            if (bitmap != null) {
                pVar.invoke(Long.valueOf(longValue), bitmap);
                z = false;
            } else if (this.f330292i != null && longValue == 0) {
                pVar.invoke(Long.valueOf(longValue), this.f330292i);
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<Number> E = C110818d0.m150905E(arrayList);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(E, 10));
        for (Number longValue2 : E) {
            arrayList2.add(new C110452c(longValue2.longValue(), pVar, (CMTime) null, 4, (C8480h) null));
        }
        if (arrayList2.isEmpty()) {
            Log.m105924i(this.f330286c, "requestFrames: no new request");
            return;
        }
        synchronized (this.f330288e) {
            this.f330288e.addAll(arrayList2);
        }
        mo161940d();
    }

    /* renamed from: c */
    public final void mo161939c(long j) {
        C60700d dVar;
        String str = this.f330286c;
        Log.m105926v(str, "requestFrameAtTimeMs:" + j + ", enableSeek:" + this.f330291h);
        this.f330287d.f330330p = j;
        if (this.f330291h && (dVar = this.f330290g) != null) {
            C60695a.C60696a.m70999b(dVar, (int) j, true, (C32226l) null, 4, (Object) null);
        }
    }

    /* renamed from: d */
    public final void mo161940d() {
        synchronized (this.f330288e) {
            if (!this.f330289f) {
                if (!this.f330288e.isEmpty()) {
                    C110452c cVar = this.f330288e.get(0);
                    C87412m.m108593f(cVar, "requests[0]");
                    mo161939c(cVar.f330300a);
                    this.f330289f = true;
                } else {
                    Log.m105924i(this.f330286c, "finished request all frames");
                    destroy();
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public void destroy() {
        Log.m105924i(this.f330286c, "destroy");
        C60700d dVar = this.f330290g;
        C60700d.C60701a aVar = dVar != null ? dVar.f172876g : null;
        if (aVar != null) {
            aVar.f172902j = null;
        }
        if (dVar != null) {
            dVar.stopAsync();
            dVar.recycle();
        }
        this.f330290g = null;
        C110461j jVar = this.f330287d;
        jVar.getClass();
        jVar.mo161947b(new C110460i(jVar));
    }

    /* renamed from: e */
    public final void mo161941e() {
        Bitmap c = MMBitmapFactory.m98734c(this.f330284a.f179677n.f165938j);
        if (c != null) {
            this.f330292i = Bitmap.createScaledBitmap(c, (int) (((float) 120) * (((float) c.getWidth()) / ((float) c.getHeight()))), 120, true);
            c.recycle();
        }
    }
}
