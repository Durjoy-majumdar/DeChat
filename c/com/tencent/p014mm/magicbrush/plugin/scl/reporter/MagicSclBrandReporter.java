package com.tencent.p014mm.magicbrush.plugin.scl.reporter;

import c30.C104289g;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h70.C87459d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter */
public final class MagicSclBrandReporter {

    /* renamed from: a */
    public static final MagicSclBrandReporter f237836a = new MagicSclBrandReporter();

    /* renamed from: b */
    public static final HashMap<String, C80979a> f237837b = new HashMap<>();

    /* renamed from: c */
    public static final HashSet<String> f237838c = new HashSet<>();

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/reporter/MagicSclBrandReporter$PreloadScene;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NoPreload", "OutBox", "InBox", "mb-plugin-scl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene */
    public enum PreloadScene {
        NoPreload(0),
        OutBox(1),
        InBox(2);
        
        private final int value;

        private PreloadScene(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* renamed from: com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$a */
    public static final class C80979a {

        /* renamed from: a */
        public long f237839a;

        /* renamed from: b */
        public long f237840b;

        /* renamed from: c */
        public long f237841c;

        /* renamed from: d */
        public boolean f237842d;

        public C80979a() {
            this(0, 0, 0, false, 15, (C8480h) null);
        }

        public C80979a(long j, long j2, long j3, boolean z, int i, C8480h hVar) {
            j = (i & 1) != 0 ? 0 : j;
            j2 = (i & 2) != 0 ? 0 : j2;
            j3 = (i & 4) != 0 ? 0 : j3;
            z = (i & 8) != 0 ? false : z;
            this.f237839a = j;
            this.f237840b = j2;
            this.f237841c = j3;
            this.f237842d = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C80979a)) {
                return false;
            }
            C80979a aVar = (C80979a) obj;
            return this.f237839a == aVar.f237839a && this.f237840b == aVar.f237840b && this.f237841c == aVar.f237841c && this.f237842d == aVar.f237842d;
        }

        public int hashCode() {
            long j = this.f237839a;
            long j2 = this.f237840b;
            long j3 = this.f237841c;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            boolean z = this.f237842d;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "Info(initTime=" + this.f237839a + ", renderStartTime=" + this.f237840b + ", exposeTime=" + this.f237841c + ", preloadDone=" + this.f237842d + ')';
        }
    }

    /* renamed from: a */
    public final C80979a mo112790a(String str) {
        HashMap<String, C80979a> hashMap = f237837b;
        C80979a aVar = hashMap.get(str);
        if (aVar != null) {
            return aVar;
        }
        C80979a aVar2 = new C80979a(0, 0, 0, false, 15, (C8480h) null);
        hashMap.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: b */
    public final void mo112791b(String str, boolean z) {
        Class cls = IMagicBrushMonitor.class;
        C87412m.m108594g(str, "key");
        ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicBrandCardExposeRaw.name(), z ? 1 : 0, str);
        HashSet<String> hashSet = f237838c;
        if (!hashSet.contains(str)) {
            hashSet.add(str);
            ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicBrandCardExpose.name(), z, str);
        }
    }

    /* renamed from: c */
    public final void mo112792c(String str, int i) {
        Log.m105924i("MicroMsg.MagicSclReporter", "reportGapTimeFromPreloadDoneToActualUse " + str + ' ' + i);
        ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicBrandPreloadToUseGap.name(), i, str);
    }

    /* renamed from: d */
    public final synchronized void mo112793d(String str, String str2, PreloadScene preloadScene, boolean z) {
        String str3 = str;
        PreloadScene preloadScene2 = preloadScene;
        synchronized (this) {
            C87412m.m108594g(str, "frameSetId");
            String str4 = str2;
            C87412m.m108594g(str2, "cardName");
            C87412m.m108594g(preloadScene2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            if (preloadScene2 == PreloadScene.OutBox) {
                ((C87459d) C86312j.m106911c(C87459d.class)).mo58571fc(str);
            }
            long currentTimeMillis = System.currentTimeMillis();
            C80979a aVar = f237837b.get(str);
            if (aVar != null && aVar.f237839a > 0) {
                Log.m105924i("MicroMsg.MagicSclReporter", "reportPreloadFinish " + str + ' ' + currentTimeMillis + ' ' + (currentTimeMillis - aVar.f237839a) + ' ' + preloadScene2);
                int i = 1;
                aVar.f237842d = true;
                IMagicBrushMonitor iMagicBrushMonitor = (IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class);
                IMagicBrushMonitor.PerformanceScene performanceScene = IMagicBrushMonitor.PerformanceScene.PreloadDone;
                long j = currentTimeMillis - aVar.f237839a;
                String[] strArr = new String[2];
                strArr[0] = String.valueOf(preloadScene.getValue());
                strArr[1] = z ? "1" : "0";
                List f = C64197v.m75537f(strArr);
                C104289g gVar = new C104289g();
                if (!AppUIForegroundOwner.INSTANCE.isForeground()) {
                    i = 2;
                }
                gVar.mo145953n("appStatus", i);
                C13598b0 b0Var = C13598b0.f38549a;
                iMagicBrushMonitor.u40(str, str2, performanceScene, j, f, gVar);
            }
        }
    }

    /* renamed from: e */
    public final synchronized void mo112794e(String str, String str2, PreloadScene preloadScene, boolean z) {
        String str3 = str;
        PreloadScene preloadScene2 = preloadScene;
        synchronized (this) {
            C87412m.m108594g(str, "frameSetId");
            C87412m.m108594g(str2, "cardName");
            C87412m.m108594g(preloadScene2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            long currentTimeMillis = System.currentTimeMillis();
            C80979a aVar = f237837b.get(str);
            if (aVar != null) {
                boolean z2 = aVar.f237842d;
                long j = aVar.f237841c;
                long j2 = j > 0 ? currentTimeMillis - j : -1;
                if (aVar.f237840b > 0) {
                    Log.m105924i("MicroMsg.MagicSclReporter", "reportRenderFinish " + str + ' ' + currentTimeMillis + ' ' + (currentTimeMillis - aVar.f237840b) + " preloadDone:" + z2 + " expose:" + j2 + ", scene: " + preloadScene2);
                    IMagicBrushMonitor iMagicBrushMonitor = (IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class);
                    IMagicBrushMonitor.PerformanceScene performanceScene = IMagicBrushMonitor.PerformanceScene.FirstFrameFromStart;
                    long j3 = currentTimeMillis - aVar.f237840b;
                    String[] strArr = new String[4];
                    strArr[0] = String.valueOf(preloadScene.getValue());
                    int i = 1;
                    strArr[1] = z2 ? "1" : "0";
                    strArr[2] = String.valueOf(j2);
                    strArr[3] = z ? "1" : "0";
                    List f = C64197v.m75537f(strArr);
                    C104289g gVar = new C104289g();
                    if (!AppUIForegroundOwner.INSTANCE.isForeground()) {
                        i = 2;
                    }
                    gVar.mo145953n("appStatus", i);
                    C13598b0 b0Var = C13598b0.f38549a;
                    iMagicBrushMonitor.u40(str, str2, performanceScene, j3, f, gVar);
                }
            }
        }
    }
}
