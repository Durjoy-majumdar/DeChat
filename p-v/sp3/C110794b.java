package sp3;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tav.core.AssetImageGenerator;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tavkit.component.TAVSourceImageGenerator;
import com.tencent.tavkit.composition.TAVClip;
import com.tencent.tavkit.composition.TAVComposition;
import com.tencent.tavkit.composition.TAVSource;
import com.tencent.tavkit.composition.builder.TAVCompositionBuilder;
import com.tencent.tavkit.composition.model.TAVVideoConfiguration;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C45983e0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64175a0;
import yp3.C112478a;

/* renamed from: sp3.b */
public final class C110794b implements C36777d {

    /* renamed from: h */
    public static final LruCache<String, Bitmap> f331444h = new LruCache<>(200);

    /* renamed from: i */
    public static final C110795a f331445i = new C110795a();

    /* renamed from: a */
    public TAVSourceImageGenerator f331446a;

    /* renamed from: b */
    public final CGSize f331447b;

    /* renamed from: c */
    public final LinkedList<C110797b> f331448c = new LinkedList<>();

    /* renamed from: d */
    public boolean f331449d;

    /* renamed from: e */
    public final AssetImageGenerator.ImageGeneratorListener f331450e = new C110799d(this);

    /* renamed from: f */
    public final C32224a<TAVSource> f331451f;

    /* renamed from: g */
    public final String f331452g;

    /* renamed from: sp3.b$a */
    public static final class C110795a {

        /* renamed from: sp3.b$a$a */
        public static final class C110796a extends C87413o implements C32224a<TAVSource> {

            /* renamed from: d */
            public final /* synthetic */ C110807k f331453d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C110796a(C110807k kVar) {
                super(0);
                this.f331453d = kVar;
            }

            public Object invoke() {
                return C110807k.m150874c(this.f331453d, false, 1, (Object) null);
            }
        }

        /* renamed from: a */
        public final C110794b mo162358a(C110801c cVar) {
            C87412m.m108595h(cVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
            TAVClip tAVClip = new TAVClip(C110803f.f331490g.mo162373c(cVar));
            TAVVideoConfiguration videoConfiguration = tAVClip.getVideoConfiguration();
            C87412m.m108590c(videoConfiguration, "clip.videoConfiguration");
            videoConfiguration.setContentMode(TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFill);
            TAVComposition tAVComposition = new TAVComposition();
            tAVComposition.addVideoChannel(C26236u.m33719b(tAVClip));
            TAVCompositionBuilder tAVCompositionBuilder = new TAVCompositionBuilder(tAVComposition);
            tAVCompositionBuilder.setReloadChannels(false);
            TAVSource buildSource = tAVCompositionBuilder.buildSource();
            C87412m.m108590c(buildSource, "builder.buildSource()");
            return new C110794b(new C110793a(buildSource), cVar.f331482t);
        }

        /* renamed from: b */
        public final C110794b mo162359b(C110807k kVar) {
            C87412m.m108595h(kVar, "composition");
            return new C110794b(new C110796a(kVar), String.valueOf(kVar.hashCode()));
        }
    }

    /* renamed from: sp3.b$b */
    public static final class C110797b {

        /* renamed from: a */
        public final long f331454a;

        /* renamed from: b */
        public final C32227p<Long, Bitmap, C13598b0> f331455b;

        /* renamed from: c */
        public final CMTime f331456c;

        public C110797b(long j, C32227p pVar, CMTime cMTime, int i, C8480h hVar) {
            cMTime = (i & 4) != 0 ? new CMTime(j, 1000) : cMTime;
            C87412m.m108595h(pVar, "callback");
            C87412m.m108595h(cMTime, "cmTime");
            this.f331454a = j;
            this.f331455b = pVar;
            this.f331456c = cMTime;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C110797b) {
                    C110797b bVar = (C110797b) obj;
                    if (!(this.f331454a == bVar.f331454a) || !C87412m.m108589b(this.f331455b, bVar.f331455b) || !C87412m.m108589b(this.f331456c, bVar.f331456c)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.f331454a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            C32227p<Long, Bitmap, C13598b0> pVar = this.f331455b;
            int i2 = 0;
            int hashCode = (i + (pVar != null ? pVar.hashCode() : 0)) * 31;
            CMTime cMTime = this.f331456c;
            if (cMTime != null) {
                i2 = cMTime.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Request(timeMs=" + this.f331454a + ", callback=" + this.f331455b + ", cmTime=" + this.f331456c + ")";
        }
    }

    /* renamed from: sp3.b$c */
    public static final class C110798c extends C87413o implements C32226l<C110797b, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ long f331457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110798c(C110794b bVar, long j) {
            super(1);
            this.f331457d = j;
        }

        public Object invoke(Object obj) {
            C110797b bVar = (C110797b) obj;
            C87412m.m108595h(bVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(bVar.f331454a == this.f331457d);
        }
    }

    /* renamed from: sp3.b$d */
    public static final class C110799d implements AssetImageGenerator.ImageGeneratorListener {

        /* renamed from: a */
        public final /* synthetic */ C110794b f331458a;

        /* renamed from: sp3.b$d$a */
        public static final class C110800a extends C87413o implements C32226l<C110797b, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ CMTime f331459d;

            /* renamed from: e */
            public final /* synthetic */ C45983e0 f331460e;

            /* renamed from: f */
            public final /* synthetic */ Bitmap f331461f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C110800a(C110799d dVar, CMTime cMTime, C45983e0 e0Var, Bitmap bitmap) {
                super(1);
                this.f331459d = cMTime;
                this.f331460e = e0Var;
                this.f331461f = bitmap;
            }

            public Object invoke(Object obj) {
                boolean z;
                C110797b bVar = (C110797b) obj;
                C87412m.m108595h(bVar, LocaleUtil.ITALIAN);
                if (C87412m.m108589b(bVar.f331456c, this.f331459d)) {
                    C45983e0 e0Var = this.f331460e;
                    long j = bVar.f331454a;
                    e0Var.f124000d = j;
                    bVar.f331455b.invoke(Long.valueOf(j), this.f331461f);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C110799d(C110794b bVar) {
            this.f331458a = bVar;
        }

        public final void onCompletion(CMTime cMTime, Bitmap bitmap, CMTime cMTime2, AssetImageGenerator.AssetImageGeneratorResult assetImageGeneratorResult) {
            C87412m.m108595h(cMTime, "requestedTime");
            C87412m.m108595h(assetImageGeneratorResult, "result");
            if (assetImageGeneratorResult != AssetImageGenerator.AssetImageGeneratorResult.AssetImageGeneratorSucceeded) {
                bitmap = null;
            }
            C45983e0 e0Var = new C45983e0();
            e0Var.f124000d = -1;
            synchronized (this.f331458a.f331448c) {
                C64175a0.m75512t(this.f331458a.f331448c, new C110800a(this, cMTime, e0Var, bitmap));
            }
            C112478a.m153625c("MicroMsg.VLogCompositionCoverGenerator", "get " + this.f331458a.hashCode() + ": " + e0Var.f124000d + 65292 + (cMTime.getTimeUs() / ((long) 1000)), new Object[0]);
            C110794b bVar = this.f331458a;
            bVar.f331449d = false;
            bVar.mo162357e();
            if (e0Var.f124000d >= 0 && bitmap != null) {
                C110794b.f331445i.getClass();
                LruCache<String, Bitmap> lruCache = C110794b.f331444h;
                lruCache.put(this.f331458a.f331452g + '-' + e0Var.f124000d, bitmap);
            }
        }
    }

    public C110794b(C32224a<? extends TAVSource> aVar, String str) {
        this.f331451f = aVar;
        this.f331452g = str;
        float f = (float) 300;
        this.f331447b = new CGSize(f, f);
        C112478a.m153625c("MicroMsg.VLogCompositionCoverGenerator", "init: " + hashCode(), new Object[0]);
    }

    /* renamed from: C */
    public void mo58663C(int i, int i2) {
        CGSize cGSize = this.f331447b;
        cGSize.width = (float) i;
        cGSize.height = (float) i2;
    }

    /* renamed from: a */
    public void mo58664a(long j) {
        synchronized (this.f331448c) {
            C64175a0.m75512t(this.f331448c, new C110798c(this, j));
        }
    }

    /* renamed from: b */
    public void mo58665b(List<Long> list, C32227p<? super Long, ? super Bitmap, C13598b0> pVar) {
        C87412m.m108595h(list, "times");
        C87412m.m108595h(pVar, "callback");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            long longValue = ((Number) next).longValue();
            C112478a.m153625c("MicroMsg.VLogCompositionCoverGenerator", "requestFrames: " + longValue, new Object[0]);
            LruCache<String, Bitmap> lruCache = f331444h;
            Bitmap bitmap = lruCache.get(this.f331452g + '-' + longValue);
            if (bitmap != null) {
                pVar.invoke(Long.valueOf(longValue), bitmap);
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<Number> E = C110818d0.m150905E(arrayList);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(E, 10));
        for (Number longValue2 : E) {
            arrayList2.add(new C110797b(longValue2.longValue(), pVar, (CMTime) null, 4, (C8480h) null));
        }
        if (arrayList2.isEmpty()) {
            C112478a.m153625c("MicroMsg.VLogCompositionCoverGenerator", "requestFrames: no new request", new Object[0]);
            return;
        }
        synchronized (this.f331448c) {
            this.f331448c.addAll(arrayList2);
        }
        mo162357e();
    }

    /* renamed from: c */
    public final void mo162355c() {
        AssetImageGenerator assetImageGenerator;
        if (this.f331446a != null) {
            C112478a.m153625c("MicroMsg.VLogCompositionCoverGenerator", "destroy generator: " + this.f331446a, new Object[0]);
            TAVSourceImageGenerator tAVSourceImageGenerator = this.f331446a;
            if (!(tAVSourceImageGenerator == null || (assetImageGenerator = tAVSourceImageGenerator.getAssetImageGenerator()) == null)) {
                assetImageGenerator.release();
            }
            this.f331446a = null;
        }
    }

    /* renamed from: d */
    public final void mo162356d() {
        AssetImageGenerator assetImageGenerator;
        if (this.f331446a == null) {
            this.f331446a = new TAVSourceImageGenerator(this.f331451f.invoke(), this.f331447b);
            C112478a.m153625c("MicroMsg.VLogCompositionCoverGenerator", "create generator " + this.f331446a, new Object[0]);
            TAVSourceImageGenerator tAVSourceImageGenerator = this.f331446a;
            if (tAVSourceImageGenerator != null && (assetImageGenerator = tAVSourceImageGenerator.getAssetImageGenerator()) != null) {
                assetImageGenerator.setApertureMode(AssetImageGenerator.ApertureMode.aspectFill);
            }
        }
    }

    public void destroy() {
        C112478a.m153625c("MicroMsg.VLogCompositionCoverGenerator", "destroy: " + hashCode(), new Object[0]);
        synchronized (this.f331448c) {
            this.f331448c.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        mo162355c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162357e() {
        /*
            r4 = this;
            java.util.LinkedList<sp3.b$b> r0 = r4.f331448c
            monitor-enter(r0)
            boolean r1 = r4.f331449d     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.util.LinkedList<sp3.b$b> r1 = r4.f331448c     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0034
            java.util.LinkedList<sp3.b$b> r1 = r4.f331448c     // Catch:{ all -> 0x003b }
            r3 = 0
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "requests[0]"
            gy3.C87412m.m108590c(r1, r3)     // Catch:{ all -> 0x003b }
            sp3.b$b r1 = (sp3.C110794b.C110797b) r1     // Catch:{ all -> 0x003b }
            r4.mo162356d()     // Catch:{ all -> 0x003b }
            r4.f331449d = r2     // Catch:{ all -> 0x003b }
            com.tencent.tavkit.component.TAVSourceImageGenerator r2 = r4.f331446a     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0039
            com.tencent.tav.coremedia.CMTime r1 = r1.f331456c     // Catch:{ all -> 0x003b }
            com.tencent.tav.core.AssetImageGenerator$ImageGeneratorListener r3 = r4.f331450e     // Catch:{ all -> 0x003b }
            r2.generateThumbnailAtTime(r1, r3)     // Catch:{ all -> 0x003b }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0034:
            r4.mo162355c()     // Catch:{ all -> 0x003b }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)
            return
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sp3.C110794b.mo162357e():void");
    }
}
