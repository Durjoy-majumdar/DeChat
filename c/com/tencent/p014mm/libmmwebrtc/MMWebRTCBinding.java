package com.tencent.p014mm.libmmwebrtc;

import android.content.Context;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;
import org.webrtc.ContextUtils;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import org.webrtc.PerformanceStatistics;
import org.webrtc.VideoSink;
import u40.C37338c;
import u40.C37340f;
import u40.C90605b;
import u40.C90609h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 62\u00020\u0001:\u000278B\u000f\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H J\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H J!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H J!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H J\u0019\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H J\u001e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\tJ\u0006\u0010\u001d\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\tJ\u0006\u0010\u001f\u001a\u00020\tJ\u0016\u0010 \u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u0010!\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\"\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010#\u001a\u00020\u0002J \u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0017J\u001a\u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010(H\u0017J\u001c\u0010+\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010(H\u0017R\"\u0010,\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00069"}, mo182094d2 = {"Lcom/tencent/mm/libmmwebrtc/MMWebRTCBinding;", "", "", "preCondition", "Lcom/tencent/mm/libmmwebrtc/MMWebRTCBinding$MMWebRTCInitParams;", "params", "", "nativeCreate", "inst", "Lrx3/b0;", "nativeOnBackground", "nativeOnSuspend", "nativeOnForeground", "nativeDestroy", "Lorg/webrtc/VideoSink;", "videoSink", "", "videoTrackId", "nativeAddOrUpdateVideoSink", "streamTrackId", "nativeRemoveVideoSink", "Lorg/webrtc/PerformanceStatistics;", "renderStats", "nativeOnRenderStats", "jsEngine", "jsContext", "uvLoop", "create", "enterBackground", "enterForeground", "enterSuspend", "destroy", "addOrUpdateStreamToVideoSink", "removeStreamFromVideoSink", "onRenderStats", "isRunning", "id", "key", "value", "reportIdKey", "", "reportKv", "defaultValue", "getABTest", "mInst", "J", "getMInst", "()J", "setMInst", "(J)V", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "Companion", "b", "MMWebRTCInitParams", "libmmwebrtc_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.libmmwebrtc.MMWebRTCBinding */
public final class MMWebRTCBinding {
    public static final C80974b Companion = new C80974b((C8480h) null);
    private static final String TAG = "WR.MMWebRTCBinding";
    private long mInst;

    @Metadata(mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/libmmwebrtc/MMWebRTCBinding$MMWebRTCInitParams;", "", "jsEngine", "", "jsContext", "uvLoop", "(JJJ)V", "getJsContext", "()J", "getJsEngine", "getUvLoop", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "libmmwebrtc_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.libmmwebrtc.MMWebRTCBinding$MMWebRTCInitParams */
    public static final class MMWebRTCInitParams {
        private final long jsContext;
        private final long jsEngine;
        private final long uvLoop;

        public MMWebRTCInitParams(long j, long j2, long j3) {
            this.jsEngine = j;
            this.jsContext = j2;
            this.uvLoop = j3;
        }

        public static /* synthetic */ MMWebRTCInitParams copy$default(MMWebRTCInitParams mMWebRTCInitParams, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = mMWebRTCInitParams.jsEngine;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = mMWebRTCInitParams.jsContext;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = mMWebRTCInitParams.uvLoop;
            }
            return mMWebRTCInitParams.copy(j4, j5, j3);
        }

        public final long component1() {
            return this.jsEngine;
        }

        public final long component2() {
            return this.jsContext;
        }

        public final long component3() {
            return this.uvLoop;
        }

        public final MMWebRTCInitParams copy(long j, long j2, long j3) {
            return new MMWebRTCInitParams(j, j2, j3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MMWebRTCInitParams)) {
                return false;
            }
            MMWebRTCInitParams mMWebRTCInitParams = (MMWebRTCInitParams) obj;
            return this.jsEngine == mMWebRTCInitParams.jsEngine && this.jsContext == mMWebRTCInitParams.jsContext && this.uvLoop == mMWebRTCInitParams.uvLoop;
        }

        public final long getJsContext() {
            return this.jsContext;
        }

        public final long getJsEngine() {
            return this.jsEngine;
        }

        public final long getUvLoop() {
            return this.uvLoop;
        }

        public int hashCode() {
            long j = this.jsEngine;
            long j2 = this.jsContext;
            long j3 = this.uvLoop;
            return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public String toString() {
            return "MMWebRTCInitParams(jsEngine=" + this.jsEngine + ", jsContext=" + this.jsContext + ", uvLoop=" + this.uvLoop + ')';
        }
    }

    /* renamed from: com.tencent.mm.libmmwebrtc.MMWebRTCBinding$a */
    public static final class C80973a implements Loggable {
        public void onLogMessage(String str, Logging.Severity severity, String str2) {
            Object[] objArr = new Object[0];
            C37340f.f98736a.mo61043e("WebRTCLog:" + str2, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: com.tencent.mm.libmmwebrtc.MMWebRTCBinding$b */
    public static final class C80974b {
        public C80974b(C8480h hVar) {
        }
    }

    public MMWebRTCBinding(Context context) {
        C87412m.m108594g(context, "ctx");
        ContextUtils.initialize(context);
        Logging.injectLoggable(new C80973a(), Logging.Severity.LS_VERBOSE);
        C37338c.m41272a("mmmedia");
        C37338c.m41272a("xffmpeg");
        C37338c.m41272a("mmwebrtc");
    }

    private final native boolean nativeAddOrUpdateVideoSink(long j, VideoSink videoSink, int i);

    private final native long nativeCreate(MMWebRTCInitParams mMWebRTCInitParams);

    private final native void nativeDestroy(long j);

    private final native void nativeOnBackground(long j);

    private final native void nativeOnForeground(long j);

    private final native void nativeOnRenderStats(long j, PerformanceStatistics performanceStatistics);

    private final native void nativeOnSuspend(long j);

    private final native boolean nativeRemoveVideoSink(long j, VideoSink videoSink, int i);

    private final boolean preCondition() {
        if (this.mInst != 0) {
            return true;
        }
        C37340f.f98736a.mo61044i(TAG, "hy: invalid webrtc instance", Arrays.copyOf(new Object[0], 0));
        return false;
    }

    public final boolean addOrUpdateStreamToVideoSink(VideoSink videoSink, int i) {
        C87412m.m108594g(videoSink, "videoSink");
        if (preCondition()) {
            return nativeAddOrUpdateVideoSink(this.mInst, videoSink, i);
        }
        return false;
    }

    public final void create(long j, long j2, long j3) {
        long j4;
        if (this.mInst == 0) {
            j4 = nativeCreate(new MMWebRTCInitParams(j, j2, j3));
        } else {
            Object[] objArr = new Object[0];
            C37340f.f98736a.mo61043e(TAG, "hy: already created!!", Arrays.copyOf(objArr, objArr.length));
            j4 = this.mInst;
        }
        this.mInst = j4;
    }

    public final void destroy() {
        if (preCondition()) {
            nativeDestroy(this.mInst);
            this.mInst = 0;
        }
    }

    public final void enterBackground() {
        if (preCondition()) {
            nativeOnBackground(this.mInst);
        }
    }

    public final void enterForeground() {
        if (preCondition()) {
            nativeOnForeground(this.mInst);
        }
    }

    public final void enterSuspend() {
        if (preCondition()) {
            nativeOnSuspend(this.mInst);
        }
    }

    public String getABTest(String str, String str2) {
        C87412m.m108594g(str, "key");
        return C90605b.f260327a.mo122632a(str, str2);
    }

    public final long getMInst() {
        return this.mInst;
    }

    public final boolean isRunning() {
        return this.mInst != 0;
    }

    public final void onRenderStats(PerformanceStatistics performanceStatistics) {
        C87412m.m108594g(performanceStatistics, "renderStats");
        if (preCondition()) {
            nativeOnRenderStats(this.mInst, performanceStatistics);
        }
    }

    public final boolean removeStreamFromVideoSink(VideoSink videoSink, int i) {
        C87412m.m108594g(videoSink, "videoSink");
        if (preCondition()) {
            return nativeRemoveVideoSink(this.mInst, videoSink, i);
        }
        return false;
    }

    public void reportIdKey(int i, int i2, int i3) {
        C90609h.f260328a.mo122635a(i, i2, i3);
    }

    public void reportKv(int i, String str) {
        C90609h.f260328a.mo122636b(i, str);
    }

    public final void setMInst(long j) {
        this.mInst = j;
    }
}
