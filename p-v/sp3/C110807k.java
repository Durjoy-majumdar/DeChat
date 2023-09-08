package sp3;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.Size;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tav.codec.IMediaFactory;
import com.tencent.tav.core.AssetExportSession;
import com.tencent.tav.core.AssetParallelExportSession;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.core.composition.MutableVideoComposition;
import com.tencent.tav.core.composition.VideoComposition;
import com.tencent.tav.core.parallel.info.PipelineIndicatorInfo;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.composition.TAVClip;
import com.tencent.tavkit.composition.TAVComposition;
import com.tencent.tavkit.composition.TAVSource;
import com.tencent.tavkit.composition.audio.TAVAudioProcessorNode;
import com.tencent.tavkit.composition.builder.TAVCompositionBuilder;
import com.tencent.tavkit.composition.model.TAVAudioConfiguration;
import com.tencent.tavkit.composition.model.TAVVideoConfiguration;
import com.tencent.tavkit.composition.resource.TAVEmptyResource;
import com.tencent.tavkit.composition.resource.TAVResource;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rr3.C110625c0;
import rr3.C110632i;
import rx3.C110660q;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import tp3.C111049b;
import up3.C111221a;
import xp3.C112166b;
import xp3.C112168e;
import xp3.C112169f;
import xp3.C112170g;
import yp3.C112478a;

/* renamed from: sp3.k */
public class C110807k {

    /* renamed from: a */
    public long f331500a;

    /* renamed from: b */
    public long f331501b;

    /* renamed from: c */
    public Rect f331502c;

    /* renamed from: d */
    public int f331503d;

    /* renamed from: e */
    public int f331504e;

    /* renamed from: f */
    public float f331505f;

    /* renamed from: g */
    public final Rect f331506g;

    /* renamed from: h */
    public EffectManager f331507h;

    /* renamed from: i */
    public C112169f f331508i;

    /* renamed from: j */
    public C112170g f331509j;

    /* renamed from: k */
    public C111049b f331510k;

    /* renamed from: l */
    public final ArrayList<C110801c> f331511l;

    /* renamed from: m */
    public boolean f331512m;

    /* renamed from: n */
    public Bitmap f331513n;

    /* renamed from: o */
    public boolean f331514o;

    /* renamed from: p */
    public boolean f331515p;

    /* renamed from: q */
    public IMediaFactory f331516q;

    /* renamed from: r */
    public TAVVideoConfiguration.TAVVideoConfigurationContentMode f331517r;

    /* renamed from: s */
    public AssetExportSession f331518s;

    /* renamed from: t */
    public C32224a<C13598b0> f331519t;

    /* renamed from: sp3.k$a */
    public static final class C101693a {

        /* renamed from: a */
        public int f297717a;

        /* renamed from: b */
        public int f297718b;

        /* renamed from: c */
        public int f297719c;

        /* renamed from: d */
        public boolean f297720d;

        /* renamed from: e */
        public boolean f297721e;

        /* renamed from: f */
        public final Size f297722f;

        /* renamed from: g */
        public final int f297723g;

        /* renamed from: h */
        public final int f297724h;

        /* renamed from: i */
        public final int f297725i;

        /* renamed from: j */
        public final int f297726j;

        /* renamed from: k */
        public final int f297727k;

        /* renamed from: l */
        public final int f297728l;

        /* renamed from: m */
        public final boolean f297729m;

        /* renamed from: n */
        public final boolean f297730n;

        /* renamed from: o */
        public final boolean f297731o;

        /* renamed from: p */
        public boolean f297732p;

        /* renamed from: q */
        public int f297733q;

        /* renamed from: r */
        public Size f297734r;

        public C101693a(Size size, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, int i7, Size size2, int i8, C8480h hVar) {
            Size size3 = size;
            int i9 = i8;
            int i15 = (i9 & 8) != 0 ? 1 : i3;
            int i16 = (i9 & 16) != 0 ? 48000 : i4;
            int i17 = (i9 & 32) != 0 ? 44100 : i5;
            int i18 = (i9 & 64) != 0 ? 1 : i6;
            boolean z5 = (i9 & 128) != 0 ? true : z;
            boolean z6 = false;
            boolean z7 = (i9 & 256) != 0 ? false : z2;
            boolean z8 = (i9 & 512) != 0 ? true : z3;
            z6 = (i9 & 1024) == 0 ? z4 : z6;
            int i19 = (i9 & 2048) != 0 ? -1 : i7;
            Size size4 = (i9 & 4096) != 0 ? null : size2;
            C87412m.m108595h(size, "targetSize");
            this.f297722f = size3;
            this.f297723g = i;
            this.f297724h = i2;
            this.f297725i = i15;
            this.f297726j = i16;
            this.f297727k = i17;
            this.f297728l = i18;
            this.f297729m = z5;
            this.f297730n = z7;
            this.f297731o = z8;
            this.f297732p = z6;
            this.f297733q = i19;
            this.f297734r = size4;
            this.f297720d = true;
            this.f297721e = true;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C101693a) {
                    C101693a aVar = (C101693a) obj;
                    if (C87412m.m108589b(this.f297722f, aVar.f297722f)) {
                        if (this.f297723g == aVar.f297723g) {
                            if (this.f297724h == aVar.f297724h) {
                                if (this.f297725i == aVar.f297725i) {
                                    if (this.f297726j == aVar.f297726j) {
                                        if (this.f297727k == aVar.f297727k) {
                                            if (this.f297728l == aVar.f297728l) {
                                                if (this.f297729m == aVar.f297729m) {
                                                    if (this.f297730n == aVar.f297730n) {
                                                        if (this.f297731o == aVar.f297731o) {
                                                            if (this.f297732p == aVar.f297732p) {
                                                                if (!(this.f297733q == aVar.f297733q) || !C87412m.m108589b(this.f297734r, aVar.f297734r)) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Size size = this.f297722f;
            int i = 0;
            int hashCode = (((((((((((((size != null ? size.hashCode() : 0) * 31) + this.f297723g) * 31) + this.f297724h) * 31) + this.f297725i) * 31) + this.f297726j) * 31) + this.f297727k) * 31) + this.f297728l) * 31;
            boolean z = this.f297729m;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f297730n;
            if (z3) {
                z3 = true;
            }
            int i3 = (i2 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f297731o;
            if (z4) {
                z4 = true;
            }
            int i4 = (i3 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f297732p;
            if (!z5) {
                z2 = z5;
            }
            int i5 = (((i4 + (z2 ? 1 : 0)) * 31) + this.f297733q) * 31;
            Size size2 = this.f297734r;
            if (size2 != null) {
                i = size2.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            return "VideoOutputConfig(targetSize=" + this.f297722f + ", videoBitrate=" + this.f297723g + ", fps=" + this.f297724h + ", iFrameInterval=" + this.f297725i + ", audioBitrate=" + this.f297726j + ", audioSampleRate=" + this.f297727k + ", audioChannelCount=" + this.f297728l + ", highProfileEnable=" + this.f297729m + ", limitProfileLevelEnable=" + this.f297730n + ", aacEncodeNeedCodecSpecificData=" + this.f297731o + ", outputHevc=" + this.f297732p + ", suggestParallelCount=" + this.f297733q + ", renderSize=" + this.f297734r + ")";
        }
    }

    /* renamed from: sp3.k$b */
    public static final class C110808b implements AssetExportSession.ExportCallbackHandler {

        /* renamed from: a */
        public final /* synthetic */ C110807k f331520a;

        /* renamed from: b */
        public final /* synthetic */ C32226l f331521b;

        /* renamed from: c */
        public final /* synthetic */ C8477a0 f331522c;

        /* renamed from: d */
        public final /* synthetic */ long f331523d;

        /* renamed from: e */
        public final /* synthetic */ C32227p f331524e;

        public C110808b(C110807k kVar, C32226l lVar, C8477a0 a0Var, long j, C32227p pVar) {
            this.f331520a = kVar;
            this.f331521b = lVar;
            this.f331522c = a0Var;
            this.f331523d = j;
            this.f331524e = pVar;
        }

        public final void handlerCallback(AssetExportSession assetExportSession) {
            C32224a<C13598b0> aVar;
            C87412m.m108590c(assetExportSession, "assetExportSession");
            AssetExportSession.AssetExportSessionStatus status = assetExportSession.getStatus();
            int errCode = assetExportSession.getErrCode();
            float progress = assetExportSession.getProgress();
            boolean z = status == AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting;
            boolean z2 = status == AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted;
            if (z) {
                C32226l lVar = this.f331521b;
                if (lVar != null) {
                    C13598b0 b0Var = (C13598b0) lVar.invoke(Float.valueOf(progress));
                    return;
                }
                return;
            }
            C112478a.m153625c("VideoComposition", "export finish: finish:" + this.f331522c.f27482d + " status:" + status + ", progress:" + progress + ", cost:" + (SystemClock.elapsedRealtime() - this.f331523d), new Object[0]);
            C8477a0 a0Var = this.f331522c;
            if (!a0Var.f27482d) {
                a0Var.f27482d = true;
                C110807k kVar = this.f331520a;
                if (kVar.f331515p && (aVar = kVar.f331519t) != null) {
                    C13598b0 invoke = aVar.invoke();
                }
                C32227p pVar = this.f331524e;
                if (pVar != null) {
                    C13598b0 b0Var2 = (C13598b0) pVar.invoke(Boolean.valueOf(z2), Integer.valueOf(errCode));
                }
                if (!z2) {
                    C110807k kVar2 = this.f331520a;
                    kVar2.f331515p = true;
                    AssetExportSession assetExportSession2 = kVar2.f331518s;
                    if (assetExportSession2 != null) {
                        assetExportSession2.cancelExport();
                    }
                }
            }
        }
    }

    /* renamed from: sp3.k$c */
    public static final class C110809c implements AssetParallelExportSession.ExportCallbackHandler {

        /* renamed from: a */
        public final /* synthetic */ C110807k f331525a;

        /* renamed from: b */
        public final /* synthetic */ C32226l f331526b;

        /* renamed from: c */
        public final /* synthetic */ long f331527c;

        /* renamed from: d */
        public final /* synthetic */ C32228q f331528d;

        public C110809c(C110807k kVar, C32226l lVar, long j, C32228q qVar) {
            this.f331525a = kVar;
            this.f331526b = lVar;
            this.f331527c = j;
            this.f331528d = qVar;
        }

        public final void handlerCallback(AssetParallelExportSession assetParallelExportSession) {
            AssetExportSession.AssetExportSessionStatus assetExportSessionStatus = assetParallelExportSession.status;
            int errCode = assetParallelExportSession.getErrCode();
            float f = assetParallelExportSession.progress;
            if (assetExportSessionStatus != null) {
                int i = C110810l.f331529a[assetExportSessionStatus.ordinal()];
                if (i == 1) {
                    C32226l lVar = this.f331526b;
                    if (lVar != null) {
                        C13598b0 b0Var = (C13598b0) lVar.invoke(Float.valueOf(f));
                        return;
                    }
                    return;
                } else if (i == 2) {
                    C112478a.m153625c("VideoComposition", "export completed: " + f + ", cost:" + (SystemClock.elapsedRealtime() - this.f331527c), new Object[0]);
                    C32228q qVar = this.f331528d;
                    if (qVar != null) {
                        Boolean bool = Boolean.TRUE;
                        Integer valueOf = Integer.valueOf(errCode);
                        ArrayList<PipelineIndicatorInfo> indicatorInfo = assetParallelExportSession.getIndicatorInfo();
                        C87412m.m108590c(indicatorInfo, "assetExportSession.indicatorInfo");
                        C13598b0 b0Var2 = (C13598b0) qVar.invoke(bool, valueOf, indicatorInfo);
                        return;
                    }
                    return;
                } else if (i == 3) {
                    C112478a.m153625c("VideoComposition", "export canceled: " + f, new Object[0]);
                    C32224a<C13598b0> aVar = this.f331525a.f331519t;
                    if (aVar == null) {
                        C32228q qVar2 = this.f331528d;
                        if (qVar2 != null) {
                            Boolean bool2 = Boolean.FALSE;
                            Integer valueOf2 = Integer.valueOf(errCode);
                            ArrayList<PipelineIndicatorInfo> indicatorInfo2 = assetParallelExportSession.getIndicatorInfo();
                            C87412m.m108590c(indicatorInfo2, "assetExportSession.indicatorInfo");
                            C13598b0 b0Var3 = (C13598b0) qVar2.invoke(bool2, valueOf2, indicatorInfo2);
                            return;
                        }
                        return;
                    } else if (aVar != null) {
                        C13598b0 invoke = aVar.invoke();
                        return;
                    } else {
                        return;
                    }
                } else if (i == 4 || i == 5) {
                    C112478a.m153625c("VideoComposition", "export failed: status:" + assetExportSessionStatus + ", progress:" + f, new Object[0]);
                    C32228q qVar3 = this.f331528d;
                    if (qVar3 != null) {
                        Boolean bool3 = Boolean.FALSE;
                        Integer valueOf3 = Integer.valueOf(errCode);
                        ArrayList<PipelineIndicatorInfo> indicatorInfo3 = assetParallelExportSession.getIndicatorInfo();
                        C87412m.m108590c(indicatorInfo3, "assetExportSession.indicatorInfo");
                        C13598b0 b0Var4 = (C13598b0) qVar3.invoke(bool3, valueOf3, indicatorInfo3);
                        return;
                    }
                    return;
                }
            }
            C112478a.m153625c("VideoComposition", "export failed other status:" + assetExportSessionStatus + ", progress:" + f, new Object[0]);
            C32228q qVar4 = this.f331528d;
            if (qVar4 != null) {
                Boolean bool4 = Boolean.FALSE;
                Integer valueOf4 = Integer.valueOf(errCode);
                ArrayList<PipelineIndicatorInfo> indicatorInfo4 = assetParallelExportSession.getIndicatorInfo();
                C87412m.m108590c(indicatorInfo4, "assetExportSession.indicatorInfo");
                C13598b0 b0Var5 = (C13598b0) qVar4.invoke(bool4, valueOf4, indicatorInfo4);
            }
        }
    }

    static {
        Logger.setLogProxy(new C110802e());
        Logger.setLevel(2);
    }

    public C110807k() {
        this.f331500a = -1;
        this.f331501b = -1;
        this.f331502c = new Rect();
        this.f331505f = 30.0f;
        this.f331506g = new Rect();
        this.f331508i = new C112169f();
        this.f331511l = new ArrayList<>();
        this.f331514o = true;
        this.f331517r = TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFill;
        C112478a.m153625c("VideoComposition", "create VLogComposition", new Object[0]);
    }

    /* renamed from: c */
    public static /* synthetic */ TAVSource m150874c(C110807k kVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return kVar.mo162381b(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildSource");
    }

    /* renamed from: e */
    public static AssetExportSession m150875e(C110807k kVar, String str, C101693a aVar, boolean z, C32227p pVar, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            C32227p pVar2 = (i & 8) != 0 ? null : pVar;
            C32226l lVar2 = (i & 16) != 0 ? null : lVar;
            kVar.getClass();
            C87412m.m108595h(str, "path");
            C87412m.m108595h(aVar, "config");
            return kVar.mo162383f(str, aVar, z, pVar2, lVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: export");
    }

    /* renamed from: a */
    public final void mo162380a(C112168e eVar) {
        if (eVar != null) {
            C112169f fVar = this.f331508i;
            fVar.getClass();
            synchronized (fVar.f335856a) {
                if (!fVar.f335856a.contains(eVar)) {
                    fVar.f335856a.add(eVar);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: b */
    public final TAVSource mo162381b(boolean z) {
        TAVComposition tAVComposition;
        C110625c0 c0Var;
        boolean z2;
        String str;
        TAVClip tAVClip;
        String str2;
        List list;
        TAVAudioProcessorNode a;
        C110632i iVar = C110632i.PAGTransitionEffect;
        ArrayList<C110801c> arrayList = this.f331511l;
        int i = 0;
        String str3 = "VideoComposition";
        C112478a.m153625c(str3, "createComposition: track size " + arrayList.size(), new Object[0]);
        if (arrayList.isEmpty()) {
            tAVComposition = new TAVComposition();
            c0Var = null;
        } else {
            tAVComposition = new TAVComposition();
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator<C110801c> it = arrayList.iterator();
            while (it.hasNext()) {
                C110801c next = it.next();
                C112478a.m153625c(str3, "add track type:" + next.f331483u + " startTime:" + next.f331464b + ", endTime:" + next.f331465c + ", trackStartTime:" + next.f331466d + ", trackEndTime:" + next.f331467e, new Object[i]);
                boolean z3 = this.f331512m;
                if (next.f331483u != 0) {
                    TAVClip tAVClip2 = new TAVClip(C110803f.f331490g.mo162373c(next));
                    str = str3;
                    tAVClip2.setStartTime(new CMTime(next.f331464b, 1000));
                    boolean z4 = z3;
                    tAVClip2.setDuration(new CMTime(next.f331465c - next.f331464b, 1000));
                    TAVResource resource = tAVClip2.getResource();
                    C87412m.m108590c(resource, "clip.resource");
                    TAVClip tAVClip3 = tAVClip2;
                    resource.setSourceTimeRange(new CMTimeRange(new CMTime(next.f331466d, 1000), new CMTime(next.f331467e - next.f331466d, 1000)));
                    if (next.f331483u != 2 || z4) {
                        TAVAudioConfiguration audioConfiguration = tAVClip3.getAudioConfiguration();
                        C87412m.m108590c(audioConfiguration, "clip.audioConfiguration");
                        audioConfiguration.setVolume(next.f331469g);
                    } else {
                        TAVAudioConfiguration audioConfiguration2 = tAVClip3.getAudioConfiguration();
                        C87412m.m108590c(audioConfiguration2, "clip.audioConfiguration");
                        audioConfiguration2.setVolume(0.0f);
                    }
                    TAVClip tAVClip4 = tAVClip3;
                    next.f331481s = tAVClip4;
                    C112478a.m153625c("CompositionTrack", next.f331463a + " buildClip buildVideoClip, path:" + next.f331482t + ", video startEnd:[" + next.f331466d + ", " + next.f331467e + "], material startEnd:[" + next.f331464b + ", " + next.f331465c + "], volume: " + next.f331469g, new Object[0]);
                    tAVClip = tAVClip4;
                } else {
                    str = str3;
                    tAVClip = new TAVClip((TAVResource) new TAVEmptyResource(CMTime.CMTimeZero));
                }
                C111049b bVar = this.f331510k;
                if (!(bVar == null || (a = bVar.mo162731a(next)) == null)) {
                    tAVClip.getAudioConfiguration().addAudioProcessorNode(a);
                }
                tAVClip.putExtraTrackInfo("key_extra_track", next);
                if (next.f331464b > 0) {
                    TAVClip tAVClip5 = tAVClip;
                    TAVClip tAVClip6 = new TAVClip((TAVResource) new TAVEmptyResource(new CMTime(next.f331464b, 1000)));
                    tAVClip6.setStartTime(CMTime.CMTimeZero);
                    tAVClip6.setDuration(new CMTime(next.f331464b, 1000));
                    str2 = str;
                    C112478a.m153625c(str2, "add front empty clip duration:" + next.f331464b, new Object[0]);
                    list = C64197v.m75537f(tAVClip6, tAVClip5);
                } else {
                    TAVClip tAVClip7 = tAVClip;
                    str2 = str;
                    list = C26236u.m33719b(tAVClip7);
                }
                arrayList2.add(list);
                str3 = str2;
                i = 0;
            }
            String str4 = str3;
            Iterator it4 = arrayList2.iterator();
            int i2 = 0;
            while (it4.hasNext()) {
                Object next2 = it4.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    List list2 = (List) next2;
                    int i4 = arrayList.get(i2).f331483u;
                    if (i4 == 1 || i4 == 2) {
                        tAVComposition.addVideoChannel(list2);
                    }
                    if (arrayList.get(i2).f331483u == 2 || arrayList.get(i2).f331483u == 3 || arrayList.get(i2).f331483u == 1) {
                        tAVComposition.addAudioChannel(list2);
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            c0Var = null;
            StringBuilder sb = new StringBuilder();
            sb.append("finish build composition, duration:");
            CMTime duration = tAVComposition.getDuration();
            C87412m.m108590c(duration, "composition.duration");
            sb.append(duration.getTimeUs() / ((long) 1000));
            C112478a.m153625c(str4, sb.toString(), new Object[0]);
        }
        System.currentTimeMillis();
        EffectManager effectManager = this.f331507h;
        if (effectManager != null) {
            effectManager.mo154936p(iVar);
        }
        int size = this.f331511l.size();
        for (int i5 = 1; i5 < size; i5++) {
            C110801c cVar = this.f331511l.get(i5 - 1);
            C87412m.m108590c(cVar, "trackList[i - 1]");
            C110801c cVar2 = cVar;
            C110801c cVar3 = this.f331511l.get(i5);
            C87412m.m108590c(cVar3, "trackList[i]");
            C110801c cVar4 = cVar3;
            C110805h hVar = cVar4.f331477o;
            if (hVar.mo162376b()) {
                if (hVar.f331494b == null) {
                    EffectManager effectManager2 = this.f331507h;
                    hVar.f331494b = effectManager2 != null ? effectManager2.mo154929i(iVar, hVar.f331493a) : c0Var;
                }
                C110625c0 c0Var2 = hVar.f331494b;
                if (c0Var2 != null) {
                    c0Var2.mo162189b(cVar4.f331464b, cVar2.f331465c);
                }
                EffectManager effectManager3 = this.f331507h;
                if (effectManager3 != null) {
                    effectManager3.mo154923c(hVar.f331494b);
                }
            }
        }
        System.currentTimeMillis();
        if (z) {
            C112170g gVar = new C112170g();
            this.f331509j = gVar;
            gVar.mo163970c(this.f331503d, this.f331504e);
            EffectManager effectManager4 = this.f331507h;
            if (!C87412m.m108589b(effectManager4, gVar.f335859f)) {
                gVar.f335859f = effectManager4;
                gVar.f335861h = true;
            }
            Rect rect = this.f331506g;
            C87412m.m108595h(rect, "rect");
            gVar.f335863j.set(rect);
            if (!gVar.f335863j.isEmpty()) {
                gVar.f335864k = gVar.f335863j.width();
                gVar.f335865l = gVar.f335863j.height();
            }
            gVar.mo163969b(this.f331517r);
            z2 = false;
            gVar.f335868o = false;
            gVar.f335860g = this.f331508i;
            tAVComposition.setVideoMixEffect(new C112166b(gVar));
        } else {
            z2 = false;
        }
        TAVCompositionBuilder tAVCompositionBuilder = new TAVCompositionBuilder(tAVComposition);
        tAVCompositionBuilder.setReloadChannels(z2);
        tAVCompositionBuilder.setVideoTracksMerge(this.f331514o);
        tAVCompositionBuilder.setAudioTracksMerge(z2);
        TAVSource buildSource = tAVCompositionBuilder.buildSource();
        if (!z) {
            C87412m.m108590c(buildSource, FirebaseAnalytics.C113379b.SOURCE);
            VideoComposition videoComposition = buildSource.getVideoComposition();
            if (videoComposition != null) {
                ((MutableVideoComposition) videoComposition).setCustomVideoCompositorClass(C111221a.class);
            } else {
                throw new C110660q("null cannot be cast to non-null type com.tencent.tav.core.composition.MutableVideoComposition");
            }
        }
        C87412m.m108590c(buildSource, FirebaseAnalytics.C113379b.SOURCE);
        VideoComposition videoComposition2 = buildSource.getVideoComposition();
        if (videoComposition2 != null) {
            ((MutableVideoComposition) videoComposition2).setFrameDuration(new CMTime(1000, (int) (this.f331505f * ((float) 1000))));
            return buildSource;
        }
        throw new C110660q("null cannot be cast to non-null type com.tencent.tav.core.composition.MutableVideoComposition");
    }

    /* renamed from: d */
    public final void mo162382d(boolean z) {
        C112478a.m153625c("VideoComposition", "enableVideoSound:" + z, new Object[0]);
        this.f331512m = z;
    }

    /* renamed from: f */
    public final AssetExportSession mo162383f(String str, C101693a aVar, boolean z, C32227p<? super Boolean, ? super Integer, C13598b0> pVar, C32226l<? super Float, C13598b0> lVar) {
        String str2 = str;
        C101693a aVar2 = aVar;
        boolean z2 = z;
        Size size = aVar2.f297734r;
        if (size == null) {
            size = aVar2.f297722f;
        }
        Size size2 = aVar2.f297722f;
        boolean z3 = (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) ? false : true;
        TAVSource b = mo162381b(z2);
        ExportConfig exportConfig = new ExportConfig(size2.getWidth(), size2.getHeight(), size.getWidth(), size.getHeight());
        exportConfig.setOutputFilePath(str);
        exportConfig.setNeedCorrectSizeByCodecCapabilities(aVar2.f297720d);
        exportConfig.setVideoBitRate(aVar2.f297723g);
        exportConfig.setVideoFrameRate(aVar2.f297724h);
        exportConfig.setVideoIFrameInterval(aVar2.f297725i);
        exportConfig.setLimitProfileLevel(aVar2.f297730n);
        exportConfig.setHighProfile(aVar2.f297729m);
        exportConfig.setAudioBitRate(aVar2.f297726j);
        exportConfig.setAudioSampleRateHz(aVar2.f297727k);
        exportConfig.setAudioChannelCount(aVar2.f297728l);
        exportConfig.setAudioEncodeNeedCodecSpecificData(aVar2.f297731o);
        exportConfig.setEncodeHevc(aVar2.f297732p);
        if (Build.VERSION.SDK_INT >= 24) {
            exportConfig.setColorSpace(aVar2.f297717a, aVar2.f297718b, aVar2.f297719c);
        }
        C112478a.m153625c("VideoComposition", "export: config: " + exportConfig.getOutputWidth() + ", " + exportConfig.getOutputHeight() + "; " + "video: " + exportConfig.getVideoBitRate() + ", " + exportConfig.getVideoFrameRate() + ", " + aVar2.f297725i + ", " + aVar2.f297729m + "; " + "audio: " + aVar2.f297726j + ", " + aVar2.f297727k + ", " + aVar2.f297728l + ", " + "aacEncodeNeedCodecSpecificData:" + aVar2.f297731o + ", outputHevc:" + aVar2.f297732p + ", correctSizeByCodecCapabilities:" + aVar2.f297720d, new Object[0]);
        AssetExportSession assetExportSession = new AssetExportSession(b.getAsset(), exportConfig);
        if (!z2) {
            assetExportSession.setAppliesPreferredTrackTransform(true);
        }
        if (z3) {
            assetExportSession.setCalculateBfsTransform(true);
        }
        assetExportSession.setOutputFilePath(str);
        assetExportSession.setOutputFileType("mp4");
        assetExportSession.setVideoComposition(b.getVideoComposition());
        assetExportSession.setAudioMix(b.getAudioMix());
        assetExportSession.setTimeRange(mo162387j());
        assetExportSession.setRevertMode(false);
        assetExportSession.setMediaFactory(this.f331516q);
        assetExportSession.setTimeoutParameter(aVar2.f297721e, false);
        if (assetExportSession.getVideoComposition() != null) {
            assetExportSession.getVideoComposition().enableLut(this.f331513n);
        }
        C112478a.m153625c("VideoComposition", "export duration:" + (mo162389l() - 0) + " playRange:" + mo162387j(), new Object[0]);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C8477a0 a0Var = new C8477a0();
        a0Var.f27482d = false;
        assetExportSession.exportAsynchronouslyWithCompletionHandler(new C110808b(this, lVar, a0Var, elapsedRealtime, pVar));
        this.f331518s = assetExportSession;
        return assetExportSession;
    }

    /* renamed from: g */
    public final long mo162384g() {
        return mo162386i() - mo162388k();
    }

    /* renamed from: h */
    public final Size mo162385h() {
        return this.f331506g.isEmpty() ? new Size(this.f331503d, this.f331504e) : new Size(this.f331506g.width(), this.f331506g.height());
    }

    /* renamed from: i */
    public final long mo162386i() {
        long j = this.f331501b;
        return j >= 0 ? j : mo162389l();
    }

    /* renamed from: j */
    public final CMTimeRange mo162387j() {
        return new CMTimeRange(new CMTime(mo162388k(), 1000), new CMTime(mo162386i() - mo162388k(), 1000));
    }

    /* renamed from: k */
    public final long mo162388k() {
        long j = this.f331500a;
        if (j >= 0) {
            return j;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: sp3.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo162389l() {
        /*
            r8 = this;
            java.util.ArrayList<sp3.c> r0 = r8.f331511l
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r0.next()
            r3 = r2
            sp3.c r3 = (sp3.C110801c) r3
            int r3 = r3.f331483u
            r4 = 1
            if (r3 == r4) goto L_0x0022
            r5 = 2
            if (r3 != r5) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r4 == 0) goto L_0x000b
            r1.add(r2)
            goto L_0x000b
        L_0x0028:
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0034
            r0 = 0
            goto L_0x005b
        L_0x0034:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r0 = r1
            goto L_0x005b
        L_0x0040:
            r2 = r1
            sp3.c r2 = (sp3.C110801c) r2
            long r2 = r2.f331465c
        L_0x0045:
            java.lang.Object r4 = r0.next()
            r5 = r4
            sp3.c r5 = (sp3.C110801c) r5
            long r5 = r5.f331465c
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0054
            r1 = r4
            r2 = r5
        L_0x0054:
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x0045
            goto L_0x003e
        L_0x005b:
            sp3.c r0 = (sp3.C110801c) r0
            if (r0 == 0) goto L_0x0062
            long r0 = r0.f331465c
            goto L_0x0064
        L_0x0062:
            r0 = 0
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp3.C110807k.mo162389l():long");
    }

    /* renamed from: m */
    public final AssetParallelExportSession mo162390m(String str, C101693a aVar, C32228q<? super Boolean, ? super Integer, ? super ArrayList<PipelineIndicatorInfo>, C13598b0> qVar, C32226l<? super Float, C13598b0> lVar) {
        C87412m.m108595h(str, "path");
        C87412m.m108595h(aVar, "config");
        TAVSource b = mo162381b(false);
        ExportConfig exportConfig = new ExportConfig(aVar.f297722f.getWidth(), aVar.f297722f.getHeight());
        exportConfig.setOutputFilePath(str);
        exportConfig.setVideoBitRate(aVar.f297723g);
        exportConfig.setVideoFrameRate(aVar.f297724h);
        exportConfig.setVideoIFrameInterval(aVar.f297725i);
        exportConfig.setLimitProfileLevel(aVar.f297730n);
        exportConfig.setHighProfile(aVar.f297729m);
        exportConfig.setAudioBitRate(aVar.f297726j);
        exportConfig.setAudioSampleRateHz(aVar.f297727k);
        exportConfig.setAudioChannelCount(aVar.f297728l);
        exportConfig.setAudioEncodeNeedCodecSpecificData(aVar.f297731o);
        exportConfig.setEncodeHevc(aVar.f297732p);
        exportConfig.setSuggestParallelCount(aVar.f297733q);
        C112478a.m153625c("VideoComposition", "export: config: " + exportConfig.getOutputWidth() + ", " + exportConfig.getOutputHeight() + "; " + "video: " + exportConfig.getVideoBitRate() + ", " + exportConfig.getVideoFrameRate() + ", " + aVar.f297725i + ", " + aVar.f297729m + "; " + "audio: " + aVar.f297726j + ", " + aVar.f297727k + ", " + aVar.f297728l + ", aacEncodeNeedCodecSpecificData:" + aVar.f297731o + ',' + "outputHevc:" + aVar.f297732p, new Object[0]);
        AssetParallelExportSession assetParallelExportSession = new AssetParallelExportSession(b.getAsset(), exportConfig);
        assetParallelExportSession.setAppliesPreferredTrackTransform(true);
        assetParallelExportSession.outputFilePath = str;
        assetParallelExportSession.outputFileType = "mp4";
        assetParallelExportSession.videoComposition = b.getVideoComposition();
        assetParallelExportSession.setAudioMix(b.getAudioMix());
        assetParallelExportSession.timeRange = mo162387j();
        assetParallelExportSession.setRevertMode(false);
        assetParallelExportSession.setMediaFactory(this.f331516q);
        assetParallelExportSession.setTimeoutParameter(aVar.f297721e, false);
        VideoComposition videoComposition = assetParallelExportSession.videoComposition;
        if (videoComposition != null) {
            if (videoComposition != null) {
                videoComposition.enableLut(this.f331513n);
            } else {
                C87412m.m108601n();
                throw null;
            }
        }
        C112478a.m153625c("VideoComposition", "export duration:" + (mo162389l() - 0) + " playRange:" + mo162387j(), new Object[0]);
        assetParallelExportSession.exportAsynchronouslyWithCompletionHandler(new C110809c(this, lVar, SystemClock.elapsedRealtime(), qVar));
        return assetParallelExportSession;
    }

    /* renamed from: n */
    public final void mo162391n(int i, int i2) {
        C112478a.m153625c("VideoComposition", "setAssetSize: " + i + ", " + i2, new Object[0]);
        this.f331503d = i;
        this.f331504e = i2;
        C112170g gVar = this.f331509j;
        if (gVar != null) {
            gVar.mo163970c(i, i2);
        }
        this.f331502c.set(0, 0, i, i2);
    }

    /* renamed from: o */
    public final void mo162392o(Rect rect) {
        C87412m.m108595h(rect, "rect");
        this.f331506g.set(rect);
    }

    /* renamed from: p */
    public final void mo162393p(long j, long j2) {
        C112478a.m153625c("VideoComposition", "setPlayRange:[" + j + ", " + j2 + ']', new Object[0]);
        this.f331500a = j;
        this.f331501b = j2;
    }

    /* renamed from: q */
    public final void mo162394q(TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        C87412m.m108595h(tAVVideoConfigurationContentMode, "newMode");
        this.f331517r = tAVVideoConfigurationContentMode;
        C112170g gVar = this.f331509j;
        if (gVar != null) {
            gVar.mo163969b(tAVVideoConfigurationContentMode);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C110807k(List<C110801c> list) {
        this();
        C87412m.m108595h(list, "trackList");
        this.f331511l.addAll(list);
    }
}
