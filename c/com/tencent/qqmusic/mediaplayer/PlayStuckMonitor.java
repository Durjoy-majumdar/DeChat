package com.tencent.qqmusic.mediaplayer;

import android.os.Handler;
import android.os.HandlerThread;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J,\u0010\t\u001a\u00020\u00022$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0004J&\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0007J \u0010\u0010\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R4\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, mo182094d2 = {"Lcom/tencent/qqmusic/mediaplayer/PlayStuckMonitor;", "", "Lrx3/b0;", "init", "Lkotlin/Function4;", "", "", "", "callback", "setOnPlayStuckListener", "decodeTime", "playTime", "continuous", "underrunCount", "onPlayStuck", "Lkotlin/Function2;", "setAudioTrackFlushListener", "writeCount", "bufferSize", "onAudioTrackFlush", "Landroid/os/HandlerThread;", "mHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "mHandlerForFlush", "mCallback", "Lfy3/r;", "mAudioTrackFlushCallback", "Lfy3/p;", "mEnable", "Z", "<init>", "()V", "player_qqmusic_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public final class PlayStuckMonitor {
    public static final PlayStuckMonitor INSTANCE = new PlayStuckMonitor();
    private static C32227p<? super Integer, ? super Integer, C13598b0> mAudioTrackFlushCallback;
    /* access modifiers changed from: private */
    public static C32229r<? super Long, ? super Long, ? super Boolean, ? super Integer, C13598b0> mCallback;
    private static boolean mEnable;
    private static Handler mHandler;
    private static Handler mHandlerForFlush;
    private static HandlerThread mHandlerThread;

    static {
        HandlerThread handlerThread = new HandlerThread("AudioTrackFlushMonitor");
        handlerThread.start();
        mHandlerForFlush = new Handler(handlerThread.getLooper());
    }

    private PlayStuckMonitor() {
    }

    public static final /* synthetic */ C32229r access$getMCallback$p(PlayStuckMonitor playStuckMonitor) {
        C32229r<? super Long, ? super Long, ? super Boolean, ? super Integer, C13598b0> rVar = mCallback;
        if (rVar != null) {
            return rVar;
        }
        C87412m.m108603p("mCallback");
        throw null;
    }

    public final void init() {
        HandlerThread handlerThread = new HandlerThread("PlayStuckMonitor");
        mHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = mHandlerThread;
        if (handlerThread2 != null) {
            mHandler = new Handler(handlerThread2.getLooper());
        } else {
            C87412m.m108603p("mHandlerThread");
            throw null;
        }
    }

    public final void onAudioTrackFlush(int i, int i2) {
        Handler handler;
        C32227p<? super Integer, ? super Integer, C13598b0> pVar = mAudioTrackFlushCallback;
        if (pVar != null && (handler = mHandlerForFlush) != null) {
            handler.post(new PlayStuckMonitor$onAudioTrackFlush$$inlined$apply$lambda$1(pVar, i, i2));
        }
    }

    public final void onPlayStuck(long j, long j2, boolean z, int i) {
        if (mEnable) {
            Handler handler = mHandler;
            if (handler != null) {
                handler.post(new PlayStuckMonitor$onPlayStuck$1(j, j2, z, i));
            } else {
                C87412m.m108603p("mHandler");
                throw null;
            }
        }
    }

    public final void setAudioTrackFlushListener(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        C87412m.m108595h(pVar, "callback");
        mAudioTrackFlushCallback = pVar;
    }

    public final void setOnPlayStuckListener(C32229r<? super Long, ? super Long, ? super Boolean, ? super Integer, C13598b0> rVar) {
        C87412m.m108595h(rVar, "callback");
        mCallback = rVar;
        mEnable = true;
    }
}
