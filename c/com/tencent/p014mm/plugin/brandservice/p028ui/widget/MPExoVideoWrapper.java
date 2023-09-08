package com.tencent.p014mm.plugin.brandservice.p028ui.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import cy0.C45224b;
import di3.C86312j;
import eb0.C97621e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hy0.C108273b;
import hy0.C21018c;
import hy0.C21019d;
import hy0.C21020e;
import hy0.C21021f;
import hy0.C21022g;
import hy0.C21023h;
import hy0.C21024i;
import hy0.C21025j;
import hy0.C21027k;
import hy0.C21030p;
import hy0.C8833q;
import hy0.C98570n;
import hy0.C98571o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kn0.C21365k;
import kotlin.Metadata;
import p396x6.C23002g;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vd3.C102173o;
import ym0.C91512j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010{\u001a\u00020z\u0012\b\u0010}\u001a\u0004\u0018\u00010|¢\u0006\u0004\b~\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0016H\u0016R\u001a\u0010\u001f\u001a\u00020\u00038\u0004XD¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00038\u0004XD¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010%\u001a\u00020\u00038\u0004XD¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\"\u0010-\u001a\u00020&8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010:\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u00109R\"\u0010=\u001a\u00020\u00168\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020\u00168\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\"\u0010K\u001a\u00020D8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bL\u0010<\u001a\u0004\bM\u0010>\"\u0004\bN\u0010@R\"\u0010Q\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010@R\"\u0010V\u001a\u00020D8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bS\u0010F\u001a\u0004\bT\u0010H\"\u0004\bU\u0010JR\"\u0010Z\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bW\u0010\u001c\u001a\u0004\bX\u0010\u001e\"\u0004\bY\u00109R\"\u0010^\u001a\u00020D8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b[\u0010F\u001a\u0004\b\\\u0010H\"\u0004\b]\u0010JR\u001b\u0010b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010>R\u001e\u0010d\u001a\u0004\u0018\u00010c8B@\u0002X\u000e¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\"\u0010h\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bh\u0010<\u001a\u0004\bh\u0010>\"\u0004\bi\u0010@R\u0011\u0010k\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bj\u0010\u001eR\u0011\u0010m\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bl\u0010\u001eR\u0011\u0010o\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bn\u0010\u001eR\u0011\u0010q\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bp\u0010\u001eR\u0011\u0010s\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\br\u0010\u001eR\u0011\u0010u\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bt\u0010\u001eR\u0011\u0010w\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bv\u0010\u001eR\"\u0010x\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bx\u0010<\u001a\u0004\bx\u0010>\"\u0004\by\u0010@¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/widget/MPExoVideoWrapper;", "Landroid/widget/RelativeLayout;", "Leb0/e$a;", "", "seconds", "Lrx3/b0;", "setVideoTotalTime", "", "url", "setDataSourceWithCustomKey", "Landroid/widget/ImageView;", "getCoverIv", "", "getFirstRenderTime", "videoSource", "setVideoSource", "Lcom/tencent/mm/pluginsdk/ui/a$b;", "_callback", "setIMMVideoViewCallback", "Lvd3/o;", "_footerView", "setVideoFooterView", "", "_mute", "setMute", "keepScreenOn", "setKeepScreenOn", "d", "I", "getERROR_CHECK_TIME", "()I", "ERROR_CHECK_TIME", "e", "getERROR_TRY_AGAIN_DELAY_TIME", "ERROR_TRY_AGAIN_DELAY_TIME", "f", "getERROR_TRY_MAX_TIME", "ERROR_TRY_MAX_TIME", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "g", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "getUiHandler", "()Lcom/tencent/mm/sdk/platformtools/MMHandler;", "setUiHandler", "(Lcom/tencent/mm/sdk/platformtools/MMHandler;)V", "uiHandler", "Landroid/widget/ProgressBar;", "i", "Landroid/widget/ProgressBar;", "getLoading", "()Landroid/widget/ProgressBar;", "setLoading", "(Landroid/widget/ProgressBar;)V", "loading", "x", "getMVideoSource", "setMVideoSource", "(I)V", "mVideoSource", "y", "Z", "isUIAvailable", "()Z", "setUIAvailable", "(Z)V", "A", "isPlayOnUiPause", "setPlayOnUiPause", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "R", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "getCheckTimer", "()Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "setCheckTimer", "(Lcom/tencent/mm/sdk/platformtools/MTimerHandler;)V", "checkTimer", "S", "getNeedShowSwitchTitleTextView", "setNeedShowSwitchTitleTextView", "needShowSwitchTitleTextView", "T", "isSwitchingResolution", "setSwitchingResolution", "V", "getShowLoadingTimer", "setShowLoadingTimer", "showLoadingTimer", "W", "getErrorCount", "setErrorCount", "errorCount", "p0", "getErrorCheckTimer", "setErrorCheckTimer", "errorCheckTimer", "y0", "Lrx3/g;", "getAbTestVideoPreload", "abTestVideoPreload", "Lcy0/b$a;", "bizVideoProfiler", "Lcy0/b$a;", "getBizVideoProfiler", "()Lcy0/b$a;", "isLive", "setLive", "getVideoDurationSec", "videoDurationSec", "getVideoDurationMs", "videoDurationMs", "getCurrPosMs", "currPosMs", "getCurrPosSec", "currPosSec", "getCacheTimeSec", "cacheTimeSec", "getVideoWidth", "videoWidth", "getVideoHeight", "videoHeight", "isControllerBarShowing", "setControllerBarShowing", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper */
public final class MPExoVideoWrapper extends RelativeLayout implements C97621e.C97622a {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f51486Q0 = 0;

    /* renamed from: A */
    public boolean f51487A;

    /* renamed from: B */
    public boolean f51488B;

    /* renamed from: C */
    public boolean f51489C;

    /* renamed from: D */
    public boolean f51490D;

    /* renamed from: E */
    public int f51491E;

    /* renamed from: F */
    public boolean f51492F;

    /* renamed from: G */
    public boolean f51493G;

    /* renamed from: H */
    public boolean f51494H;

    /* renamed from: I */
    public boolean f51495I;

    /* renamed from: J */
    public int f51496J;

    /* renamed from: K */
    public int f51497K;

    /* renamed from: L */
    public int f51498L;

    /* renamed from: M */
    public boolean f51499M;

    /* renamed from: N */
    public int f51500N;

    /* renamed from: P */
    public boolean f51501P;

    /* renamed from: Q */
    public long f51502Q;

    /* renamed from: R */
    public MTimerHandler f51503R = new MTimerHandler(new C18526b(this), true);

    /* renamed from: S */
    public boolean f51504S;

    /* renamed from: T */
    public boolean f51505T;

    /* renamed from: U */
    public final Runnable f51506U;

    /* renamed from: V */
    public MTimerHandler f51507V;

    /* renamed from: W */
    public int f51508W;

    /* renamed from: d */
    public final int f51509d = 5000;

    /* renamed from: e */
    public final int f51510e = 200;

    /* renamed from: f */
    public final int f51511f = 5;

    /* renamed from: g */
    public MMHandler f51512g = new MMHandler(Looper.getMainLooper());

    /* renamed from: h */
    public LinearLayout f51513h;

    /* renamed from: i */
    public ProgressBar f51514i;

    /* renamed from: j */
    public ImageView f51515j;

    /* renamed from: n */
    public ImageView f51516n;

    /* renamed from: o */
    public TextView f51517o;

    /* renamed from: p */
    public C102173o f51518p;

    /* renamed from: p0 */
    public MTimerHandler f51519p0;

    /* renamed from: q */
    public Surface f51520q;

    /* renamed from: r */
    public MPExoVideoTextureView f51521r;

    /* renamed from: s */
    public C21365k f51522s;

    /* renamed from: t */
    public C96814a.C57541b f51523t;

    /* renamed from: u */
    public final C97621e f51524u = new C97621e();

    /* renamed from: v */
    public boolean f51525v;

    /* renamed from: w */
    public String f51526w;

    /* renamed from: x */
    public int f51527x = 0;

    /* renamed from: x0 */
    public int f51528x0;

    /* renamed from: y */
    public boolean f51529y = true;

    /* renamed from: y0 */
    public final C13601g f51530y0;

    /* renamed from: z */
    public boolean f51531z;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$b */
    public static final class C18526b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51532d;

        public C18526b(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f51532d = mPExoVideoWrapper;
        }

        public final boolean onTimerExpired() {
            this.f51532d.mo23183e();
            MPExoVideoWrapper mPExoVideoWrapper = this.f51532d;
            if (mPExoVideoWrapper.f51487A) {
                int i = MPExoVideoWrapper.f51486Q0;
                Log.m105918d("MicroMsg.MPExoVideoWrapper", "checkTimer onVideoPlay");
                this.f51532d.mo23207h();
                this.f51532d.setPlayOnUiPause(false);
                return true;
            }
            mPExoVideoWrapper.mo23216q(mPExoVideoWrapper.getCurrPosSec());
            MPExoVideoWrapper mPExoVideoWrapper2 = this.f51532d;
            mPExoVideoWrapper2.mo23217r(mPExoVideoWrapper2.mo23183e());
            MPExoVideoWrapper mPExoVideoWrapper3 = this.f51532d;
            if (!mPExoVideoWrapper3.f51505T) {
                return true;
            }
            mPExoVideoWrapper3.f51512g.postDelayed(new C21027k(mPExoVideoWrapper3), 3000);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$c */
    public static final class C18527c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51533d;

        public C18527c(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f51533d = mPExoVideoWrapper;
        }

        public final boolean onTimerExpired() {
            if (this.f51533d.getErrorCount() <= 0) {
                return false;
            }
            if (!this.f51533d.mo23183e()) {
                return true;
            }
            MPExoVideoWrapper mPExoVideoWrapper = this.f51533d;
            mPExoVideoWrapper.getClass();
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "reset error count ");
            mPExoVideoWrapper.f51508W = 0;
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$d */
    public static final class C18528d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51534d;

        public C18528d(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f51534d = mPExoVideoWrapper;
        }

        public final void run() {
            if (this.f51534d.getLoading() != null) {
                ProgressBar loading = this.f51534d.getLoading();
                C87412m.m108591d(loading);
                if (loading.getVisibility() != 8) {
                    int i = MPExoVideoWrapper.f51486Q0;
                    Log.m105924i("MicroMsg.MPExoVideoWrapper", "hide loading");
                    ProgressBar loading2 = this.f51534d.getLoading();
                    if (loading2 != null) {
                        loading2.setVisibility(8);
                    }
                    MPExoVideoWrapper mPExoVideoWrapper = this.f51534d;
                    mPExoVideoWrapper.f51512g.postDelayed(new C98571o(mPExoVideoWrapper), 500);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$e */
    public static final class C18529e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51535d;

        /* renamed from: e */
        public final /* synthetic */ String f51536e;

        /* renamed from: f */
        public final /* synthetic */ int f51537f;

        /* renamed from: g */
        public final /* synthetic */ int f51538g;

        public C18529e(MPExoVideoWrapper mPExoVideoWrapper, String str, int i, int i2) {
            this.f51535d = mPExoVideoWrapper;
            this.f51536e = str;
            this.f51537f = i;
            this.f51538g = i2;
        }

        public final void run() {
            MPExoVideoWrapper mPExoVideoWrapper = this.f51535d;
            mPExoVideoWrapper.f51499M = false;
            mPExoVideoWrapper.mo23215p();
            MPExoVideoTextureView mPExoVideoTextureView = mPExoVideoWrapper.f51521r;
            if (mPExoVideoTextureView != null) {
                mPExoVideoTextureView.mo149407F();
                mPExoVideoTextureView.f312090j.mo153323c();
            }
            mPExoVideoWrapper.f51528x0 = 0;
            if (mPExoVideoWrapper.f51522s != null) {
                mPExoVideoWrapper.f51512g.post(new C21030p(mPExoVideoWrapper));
            }
            this.f51535d.mo23182d();
            C96814a.C57541b bVar = this.f51535d.f51523t;
            if (bVar != null) {
                C87412m.m108591d(bVar);
                bVar.mo22960T("", "", this.f51536e, this.f51537f, this.f51538g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$f */
    public static final class C18530f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51539d;

        public C18530f(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f51539d = mPExoVideoWrapper;
        }

        public final void run() {
            this.f51539d.mo23212m();
            MPExoVideoWrapper mPExoVideoWrapper = this.f51539d;
            mPExoVideoWrapper.mo23216q(mPExoVideoWrapper.getCurrPosSec());
            MPExoVideoWrapper mPExoVideoWrapper2 = this.f51539d;
            if (mPExoVideoWrapper2.f51522s == null) {
                return;
            }
            if (mPExoVideoWrapper2.f51494H) {
                int currPosMs = mPExoVideoWrapper2.getCurrPosMs();
                Log.m105924i("MicroMsg.MPExoVideoWrapper", "retry when error, video has prepared currentPosition=" + currPosMs + " isPlaying:" + mPExoVideoWrapper2.mo23183e());
                mPExoVideoWrapper2.f51499M = false;
                mPExoVideoWrapper2.mo23217r(false);
                mPExoVideoWrapper2.mo23215p();
                C21365k kVar = mPExoVideoWrapper2.f51522s;
                if (kVar != null) {
                    if (!kVar.isPlaying()) {
                        Log.m105924i("MicroMsg.MPExoVideoWrapper", "video pause, video is not playing");
                        mPExoVideoWrapper2.f51492F = false;
                    } else if (!mPExoVideoWrapper2.f51494H) {
                        Log.m105924i("MicroMsg.MPExoVideoWrapper", "video pause, video not prepared yet, pause video when prepared");
                        mPExoVideoWrapper2.f51492F = false;
                    } else {
                        Log.m105924i("MicroMsg.MPExoVideoWrapper", "video pause");
                        C21365k kVar2 = mPExoVideoWrapper2.f51522s;
                        C87412m.m108591d(kVar2);
                        kVar2.pause();
                        mPExoVideoWrapper2.mo23186g();
                    }
                }
                mPExoVideoWrapper2.f51488B = true;
                mPExoVideoWrapper2.mo23211l(currPosMs, true);
                return;
            }
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "retry when error, video has not prepared");
            mPExoVideoWrapper2.mo23208i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$k */
    public static final class C18531k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51540d;

        public C18531k(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f51540d = mPExoVideoWrapper;
        }

        public final void run() {
            if (this.f51540d.getLoading() != null) {
                ProgressBar loading = this.f51540d.getLoading();
                C87412m.m108591d(loading);
                if (loading.getVisibility() != 0) {
                    int i = MPExoVideoWrapper.f51486Q0;
                    Log.m105924i("MicroMsg.MPExoVideoWrapper", "show loading");
                    ProgressBar loading2 = this.f51540d.getLoading();
                    if (loading2 != null) {
                        loading2.setVisibility(0);
                    }
                    MPExoVideoWrapper mPExoVideoWrapper = this.f51540d;
                    mPExoVideoWrapper.f51512g.post(new C98570n(mPExoVideoWrapper));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$l */
    public static final class C18532l implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51541d;

        public C18532l(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f51541d = mPExoVideoWrapper;
        }

        public final boolean onTimerExpired() {
            this.f51541d.getUiHandler().post(this.f51541d.f51506U);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$a */
    public static final class C18533a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C18533a f51542d = new C18533a();

        public C18533a() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = true;
            if (!(hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_open_timeline_video_preload, 0) == 1) && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$g */
    public static final class C18534g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51543d;

        public C18534g(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f51543d = mPExoVideoWrapper;
        }

        public final void run() {
            this.f51543d.setKeepScreenOn(false);
            this.f51543d.f51524u.mo136889a();
            C96814a.C57541b bVar = this.f51543d.f51523t;
            if (bVar != null) {
                C87412m.m108591d(bVar);
                bVar.mo22963a0("", "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$h */
    public static final class C18535h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51544d;

        public C18535h(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f51544d = mPExoVideoWrapper;
        }

        public final void run() {
            this.f51544d.setKeepScreenOn(true);
            MPExoVideoWrapper mPExoVideoWrapper = this.f51544d;
            mPExoVideoWrapper.f51524u.mo136891c(mPExoVideoWrapper);
            C96814a.C57541b bVar = this.f51544d.f51523t;
            if (bVar != null) {
                C87412m.m108591d(bVar);
                bVar.mo22965m0("", "");
            }
            this.f51544d.mo23217r(true);
            this.f51544d.mo23214o();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$i */
    public static final class C18536i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51545d;

        /* renamed from: e */
        public final /* synthetic */ boolean f51546e;

        public C18536i(MPExoVideoWrapper mPExoVideoWrapper, boolean z) {
            this.f51545d = mPExoVideoWrapper;
            this.f51546e = z;
        }

        public final void run() {
            MPExoVideoWrapper.super.setKeepScreenOn(this.f51546e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$j */
    public static final class C18537j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51547d;

        /* renamed from: e */
        public final /* synthetic */ int f51548e;

        public C18537j(MPExoVideoWrapper mPExoVideoWrapper, int i) {
            this.f51547d = mPExoVideoWrapper;
            this.f51548e = i;
        }

        public final void run() {
            C102173o oVar = this.f51547d.f51518p;
            if (oVar != null) {
                C87412m.m108591d(oVar);
                if (oVar.getVideoTotalTime() != this.f51548e) {
                    C102173o oVar2 = this.f51547d.f51518p;
                    C87412m.m108591d(oVar2);
                    oVar2.setVideoTotalTime(this.f51548e);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$m */
    public static final class C18538m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51549d;

        /* renamed from: e */
        public final /* synthetic */ int f51550e;

        public C18538m(MPExoVideoWrapper mPExoVideoWrapper, int i) {
            this.f51549d = mPExoVideoWrapper;
            this.f51550e = i;
        }

        public final void run() {
            C102173o oVar = this.f51549d.f51518p;
            C87412m.m108591d(oVar);
            oVar.mo130492a(this.f51550e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPExoVideoWrapper$n */
    public static final class C18539n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f51551d;

        /* renamed from: e */
        public final /* synthetic */ boolean f51552e;

        public C18539n(MPExoVideoWrapper mPExoVideoWrapper, boolean z) {
            this.f51551d = mPExoVideoWrapper;
            this.f51552e = z;
        }

        public final void run() {
            C102173o oVar = this.f51551d.f51518p;
            C87412m.m108591d(oVar);
            oVar.mo130494c(this.f51552e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MPExoVideoWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bgv, this);
        this.f51521r = (MPExoVideoTextureView) findViewById(C0966R.C0970id.f358776h10);
        this.f51514i = (ProgressBar) findViewById(C0966R.C0970id.l6a);
        this.f51513h = (LinearLayout) findViewById(C0966R.C0970id.l5w);
        this.f51515j = (ImageView) findViewById(C0966R.C0970id.h0u);
        this.f51516n = (ImageView) findViewById(C0966R.C0970id.h0z);
        this.f51517o = (TextView) findViewById(C0966R.C0970id.kb7);
        MPExoVideoTextureView mPExoVideoTextureView = this.f51521r;
        C87412m.m108591d(mPExoVideoTextureView);
        mPExoVideoTextureView.setSurfaceTextureListener(new C21025j(this));
        this.f51506U = new C18531k(this);
        this.f51507V = new MTimerHandler(new C18532l(this), false);
        this.f51519p0 = new MTimerHandler(new C18527c(this), true);
        this.f51530y0 = C36568h.m40985a(C18533a.f51542d);
    }

    /* renamed from: b */
    public static final void m19202b(MPExoVideoWrapper mPExoVideoWrapper) {
        if (!mPExoVideoWrapper.f51531z) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onMediaPlayerPrepared, mp released");
            return;
        }
        if (mPExoVideoWrapper.f51508W > 0) {
            Log.m105918d("MicroMsg.MPExoVideoWrapper", "start error check timer");
            mPExoVideoWrapper.f51519p0.startTimer((long) mPExoVideoWrapper.f51509d);
        }
        Log.m105924i("MicroMsg.MPExoVideoWrapper", "onPrepared");
        mPExoVideoWrapper.f51494H = true;
        mPExoVideoWrapper.f51512g.post(new C108273b(mPExoVideoWrapper));
        mPExoVideoWrapper.setVideoTotalTime(mPExoVideoWrapper.getVideoDurationSec());
        mPExoVideoWrapper.mo23182d();
        if (mPExoVideoWrapper.f51502Q != 0) {
            Log.m105925i("MicroMsg.MPExoVideoWrapper", "onPrepared, costTime:%s", Long.valueOf(System.currentTimeMillis() - mPExoVideoWrapper.f51502Q));
        }
        C45224b.C45225a bizVideoProfiler = mPExoVideoWrapper.getBizVideoProfiler();
        if (bizVideoProfiler != null) {
            C45224b.m50020a(C45224b.f122558a, bizVideoProfiler.mo70716a("14"), mPExoVideoWrapper.getBizVideoProfiler(), (String) null, 2, (Object) null);
        }
        int i = mPExoVideoWrapper.f51491E;
        if (i > 0) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onPrepared, seekToPosition " + i);
            mPExoVideoWrapper.mo23211l(i, mPExoVideoWrapper.f51501P);
            mPExoVideoWrapper.f51491E = 0;
        }
        if (mPExoVideoWrapper.f51492F) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onPrepared, start play when prepared");
            mPExoVideoWrapper.mo23213n();
            return;
        }
        Log.m105924i("MicroMsg.MPExoVideoWrapper", "onPrepared, not set start play when prepared");
    }

    private final boolean getAbTestVideoPreload() {
        return ((Boolean) ((C36570n) this.f51530y0).getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final C45224b.C45225a getBizVideoProfiler() {
        C45224b bVar = C45224b.f122558a;
        String obj = getContext().toString();
        C87412m.m108594g(obj, "key");
        HashMap<String, C45224b.C45225a> hashMap = C45224b.f122559b;
        if (hashMap.get(obj) == null) {
            hashMap.put(obj, new C45224b.C45225a());
            Log.m105924i("MicroMsg.BizVideoProfiler", " getInstance null, create " + hashMap.get(obj));
        }
        C45224b.C45225a aVar = hashMap.get(obj);
        C87412m.m108591d(aVar);
        return aVar;
    }

    private final void setDataSourceWithCustomKey(String str) {
        if (getAbTestVideoPreload()) {
            String b = C91512j.m114810c().mo125425b(str);
            C21365k kVar = this.f51522s;
            C87412m.m108591d(kVar);
            kVar.f60465t = kVar.mo33461H(Uri.parse(str), (String) null, b, 0);
            kVar.f60466u = str;
            kVar.f60455S = 0;
            kVar.f59681a = 1;
            return;
        }
        C21365k kVar2 = this.f51522s;
        C87412m.m108591d(kVar2);
        kVar2.setDataSource(str);
    }

    private final void setVideoTotalTime(int i) {
        this.f51512g.post(new C18537j(this, i));
    }

    /* renamed from: I2 */
    public void mo23179I2() {
    }

    /* renamed from: N3 */
    public void mo23180N3() {
    }

    /* renamed from: R0 */
    public void mo23181R0() {
    }

    /* renamed from: d */
    public final void mo23182d() {
        Log.m105919d("MicroMsg.MPExoVideoWrapper", "hide loading %s", Util.getStack());
        this.f51507V.stopTimer();
        this.f51512g.post(new C18528d(this));
    }

    /* renamed from: e */
    public final boolean mo23183e() {
        C21365k kVar = this.f51522s;
        if (kVar == null || !this.f51494H) {
            return false;
        }
        C87412m.m108591d(kVar);
        return kVar.isPlaying();
    }

    /* renamed from: f */
    public final void mo23184f(int i, int i2) {
        String format = String.format("PlayError %s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        C87412m.m108593f(format, "format(format, *args)");
        Log.m105929w("MicroMsg.MPExoVideoWrapper", "%d onError[%s %d, %d]", Integer.valueOf(hashCode()), format, Integer.valueOf(i), Integer.valueOf(i2));
        int i3 = this.f51508W + 1;
        this.f51508W = i3;
        if (i3 > this.f51511f) {
            this.f51512g.post(new C18529e(this, format, i, i2));
        } else {
            this.f51512g.postDelayed(new C18530f(this), (long) this.f51510e);
        }
    }

    /* renamed from: f2 */
    public void mo23185f2() {
    }

    /* renamed from: g */
    public final void mo23186g() {
        Log.m105919d("MicroMsg.MPExoVideoWrapper", "%d onVideoPause", Integer.valueOf(hashCode()));
        this.f51512g.post(new C18534g(this));
    }

    public final int getCacheTimeSec() {
        if (getVideoDurationSec() > 0) {
            return (this.f51528x0 * getVideoDurationSec()) / 100;
        }
        return 0;
    }

    public final MTimerHandler getCheckTimer() {
        return this.f51503R;
    }

    public final ImageView getCoverIv() {
        ImageView imageView = this.f51515j;
        C87412m.m108591d(imageView);
        return imageView;
    }

    public final int getCurrPosMs() {
        C21365k kVar = this.f51522s;
        if (kVar == null) {
            return 0;
        }
        C87412m.m108591d(kVar);
        return kVar.getCurrentPosition();
    }

    public final int getCurrPosSec() {
        C21365k kVar = this.f51522s;
        if (kVar == null) {
            return 0;
        }
        C87412m.m108591d(kVar);
        return kVar.getCurrentPosition() / 1000;
    }

    public final int getERROR_CHECK_TIME() {
        return this.f51509d;
    }

    public final int getERROR_TRY_AGAIN_DELAY_TIME() {
        return this.f51510e;
    }

    public final int getERROR_TRY_MAX_TIME() {
        return this.f51511f;
    }

    public final MTimerHandler getErrorCheckTimer() {
        return this.f51519p0;
    }

    public final int getErrorCount() {
        return this.f51508W;
    }

    public final long getFirstRenderTime() {
        if (this.f51502Q != 0) {
            return System.currentTimeMillis() - this.f51502Q;
        }
        return 0;
    }

    public final ProgressBar getLoading() {
        return this.f51514i;
    }

    public final int getMVideoSource() {
        return this.f51527x;
    }

    public final boolean getNeedShowSwitchTitleTextView() {
        return this.f51504S;
    }

    public final MTimerHandler getShowLoadingTimer() {
        return this.f51507V;
    }

    public final MMHandler getUiHandler() {
        return this.f51512g;
    }

    public final int getVideoDurationMs() {
        C21365k kVar = this.f51522s;
        if (kVar == null) {
            return 0;
        }
        C87412m.m108591d(kVar);
        return kVar.getDuration();
    }

    public final int getVideoDurationSec() {
        C21365k kVar = this.f51522s;
        if (kVar == null) {
            return 0;
        }
        C87412m.m108591d(kVar);
        return kVar.getDuration() / 1000;
    }

    public final int getVideoHeight() {
        C21365k kVar = this.f51522s;
        if (kVar == null) {
            return 0;
        }
        C87412m.m108591d(kVar);
        return kVar.f60441E;
    }

    public final int getVideoWidth() {
        C21365k kVar = this.f51522s;
        if (kVar == null) {
            return 0;
        }
        C87412m.m108591d(kVar);
        return kVar.f60440D;
    }

    /* renamed from: h */
    public final void mo23207h() {
        this.f51499M = true;
        this.f51487A = false;
        Log.m105919d("MicroMsg.MPExoVideoWrapper", "%d onVideoPlay", Integer.valueOf(hashCode()));
        this.f51512g.post(new C18535h(this));
    }

    /* renamed from: i */
    public final void mo23208i() {
        if (this.f51522s != null && !Util.isNullOrNil((String) null)) {
            if (Util.isNullOrNil(this.f51526w) && C91512j.m114810c().f262321e && C91512j.m114810c().f262322f) {
                this.f51526w = C91512j.m114810c().f00((String) null);
            }
            if (!Util.isNullOrNil(this.f51526w)) {
                setDataSourceWithCustomKey(this.f51526w);
            } else {
                setDataSourceWithCustomKey((String) null);
            }
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "video prepare async");
            mo23212m();
            this.f51494H = false;
            this.f51502Q = System.currentTimeMillis();
            if (this.f51522s != null) {
                C45224b.C45225a bizVideoProfiler = getBizVideoProfiler();
                if (bizVideoProfiler != null) {
                    C45224b.m50020a(C45224b.f122558a, bizVideoProfiler.mo70716a(PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT), getBizVideoProfiler(), (String) null, 2, (Object) null);
                }
                C21365k kVar = this.f51522s;
                C87412m.m108591d(kVar);
                kVar.prepareAsync();
            }
        }
    }

    /* renamed from: j */
    public final synchronized void mo23209j() {
        if (this.f51522s != null) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "releaseMediaPlayer");
            C21365k kVar = this.f51522s;
            C87412m.m108591d(kVar);
            kVar.f59683c = null;
            C21365k kVar2 = this.f51522s;
            C87412m.m108591d(kVar2);
            kVar2.f59684d = null;
            C21365k kVar3 = this.f51522s;
            C87412m.m108591d(kVar3);
            kVar3.f59685e = null;
            C21365k kVar4 = this.f51522s;
            C87412m.m108591d(kVar4);
            kVar4.f59686f = null;
            C21365k kVar5 = this.f51522s;
            C87412m.m108591d(kVar5);
            kVar5.f59687g = null;
            C21365k kVar6 = this.f51522s;
            C87412m.m108591d(kVar6);
            kVar6.f59689i = null;
            C21365k kVar7 = this.f51522s;
            C87412m.m108591d(kVar7);
            kVar7.stop();
            C21365k kVar8 = this.f51522s;
            C87412m.m108591d(kVar8);
            kVar8.reset();
            C21365k kVar9 = this.f51522s;
            C87412m.m108591d(kVar9);
            kVar9.release();
        }
        this.f51522s = null;
        this.f51531z = false;
    }

    /* renamed from: k */
    public final void mo23210k() {
        boolean z = false;
        this.f51488B = false;
        this.f51489C = false;
        this.f51490D = false;
        mo23209j();
        if (this.f51522s == null) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "createMediaPlayer");
            this.f51528x0 = 0;
            C21365k kVar = new C21365k();
            this.f51522s = kVar;
            kVar.f60443G = false;
            List<? extends C8833q> list = C8833q.f28056d;
            kVar.mo22543l(1.0f);
            C21365k kVar2 = this.f51522s;
            if (kVar2 != null) {
                z = true;
            }
            this.f51531z = z;
            if (!z) {
                Log.m105920e("MicroMsg.MPExoVideoWrapper", "createMediaPlayer, create media player fail");
            } else {
                C87412m.m108591d(kVar2);
                kVar2.f59683c = new C21018c(this);
                C21365k kVar3 = this.f51522s;
                C87412m.m108591d(kVar3);
                kVar3.f59684d = new C21019d(this);
                C21365k kVar4 = this.f51522s;
                C87412m.m108591d(kVar4);
                kVar4.f59685e = new C21020e(this);
                C21365k kVar5 = this.f51522s;
                C87412m.m108591d(kVar5);
                kVar5.f59686f = new C21021f(this);
                C21365k kVar6 = this.f51522s;
                C87412m.m108591d(kVar6);
                kVar6.f59687g = new C21022g(this);
                C21365k kVar7 = this.f51522s;
                C87412m.m108591d(kVar7);
                kVar7.f59689i = new C21023h(this);
                C21365k kVar8 = this.f51522s;
                C87412m.m108591d(kVar8);
                kVar8.f59688h = new C21024i(this);
                if (!Util.isNullOrNil((String) null)) {
                    if (Util.isNullOrNil(this.f51526w) && C91512j.m114810c().f262321e && C91512j.m114810c().f262322f) {
                        this.f51526w = C91512j.m114810c().f00((String) null);
                    }
                    if (!Util.isNullOrNil(this.f51526w)) {
                        setDataSourceWithCustomKey(this.f51526w);
                    } else {
                        setDataSourceWithCustomKey((String) null);
                    }
                }
            }
        }
        C21365k kVar9 = this.f51522s;
        if (kVar9 != null) {
            kVar9.setMute(this.f51525v);
            if (this.f51520q != null) {
                C21365k kVar10 = this.f51522s;
                C87412m.m108591d(kVar10);
                kVar10.setSurface(this.f51520q);
            }
        }
    }

    /* renamed from: l */
    public final void mo23211l(int i, boolean z) {
        this.f51501P = z;
        int videoDurationMs = getVideoDurationMs();
        if (videoDurationMs > 100 && i > videoDurationMs) {
            i = videoDurationMs;
        }
        if (!this.f51494H || this.f51522s == null) {
            this.f51491E = i;
            return;
        }
        boolean z2 = this.f51499M || mo23183e() || this.f51489C || this.f51488B;
        this.f51489C = z2;
        Log.m105919d("MicroMsg.MPExoVideoWrapper", "seekTo mPlayingBeforeSeeking %b, afterPlay %b, seekTime %d", Boolean.valueOf(z2), Boolean.valueOf(z), Integer.valueOf(i));
        if (!z) {
            C21365k kVar = this.f51522s;
            C87412m.m108591d(kVar);
            kVar.pause();
        } else {
            mo23214o();
        }
        if (videoDurationMs != i && i > 0) {
            this.f51495I = false;
        }
        C21365k kVar2 = this.f51522s;
        C87412m.m108591d(kVar2);
        long j = (long) i;
        if (kVar2.mo33460G()) {
            ((C23002g) kVar2.f60461p).mo36273l(j);
            kVar2.f60464s.mo33474c(z, 100);
        }
        this.f51500N = i;
        mo23212m();
        mo23216q(i / 1000);
    }

    /* renamed from: m */
    public final void mo23212m() {
        this.f51507V.stopTimer();
        this.f51507V.startTimer(500);
    }

    /* renamed from: n */
    public final boolean mo23213n() {
        MPExoVideoTextureView mPExoVideoTextureView;
        if (!this.f51529y) {
            Log.m105929w("MicroMsg.MPExoVideoWrapper", "ui on pause now, why u call me to play? [%s]", Util.getStack());
            return false;
        } else if (this.f51520q == null) {
            Log.m105929w("MicroMsg.MPExoVideoWrapper", "%d it surface not ready, do not start", Integer.valueOf(hashCode()));
            this.f51493G = true;
            this.f51492F = true;
            return false;
        } else {
            this.f51499M = true;
            if (this.f51522s == null) {
                mo23210k();
                mo23208i();
            }
            if (this.f51522s == null) {
                return false;
            }
            setKeepScreenOn(true);
            this.f51524u.mo136891c(this);
            if (this.f51494H) {
                C21365k kVar = this.f51522s;
                C87412m.m108591d(kVar);
                if (kVar.isPlaying()) {
                    Log.m105924i("MicroMsg.MPExoVideoWrapper", "video play, video is playing");
                    mo23207h();
                    return true;
                }
            }
            C21365k kVar2 = this.f51522s;
            if (kVar2 == null || this.f51494H) {
                if (kVar2 != null) {
                    C87412m.m108591d(kVar2);
                    if (kVar2.f59681a == 5) {
                        Log.m105924i("MicroMsg.MPExoVideoWrapper", "video play, video has stopped now, try prepare and start when prepared");
                        this.f51492F = true;
                        Log.m105924i("MicroMsg.MPExoVideoWrapper", "video play, media player prepare async");
                        mo23208i();
                        return true;
                    }
                }
                if (this.f51495I) {
                    Log.m105924i("MicroMsg.MPExoVideoWrapper", "video play, video has ended playing, clear surface and start again");
                    this.f51495I = false;
                    if (!(this.f51520q == null || !this.f51494H || (mPExoVideoTextureView = this.f51521r) == null)) {
                        mPExoVideoTextureView.mo149407F();
                    }
                    mo23210k();
                    mo23208i();
                    C21365k kVar3 = this.f51522s;
                    if (kVar3 != null) {
                        this.f51492F = true;
                        C87412m.m108591d(kVar3);
                        Log.m105925i("MicroMsg.MPExoVideoWrapper", "video play, media player state:%s", Integer.valueOf(kVar3.f59681a));
                        mo23208i();
                    }
                    return true;
                }
                C21365k kVar4 = this.f51522s;
                if (kVar4 != null) {
                    C87412m.m108591d(kVar4);
                    kVar4.start();
                    C45224b.C45225a bizVideoProfiler = getBizVideoProfiler();
                    if (bizVideoProfiler != null) {
                        C45224b.m50020a(C45224b.f122558a, bizVideoProfiler.mo70716a("15"), getBizVideoProfiler(), (String) null, 2, (Object) null);
                    }
                    mo23207h();
                }
                return true;
            }
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "video play, video not prepared yet, start until prepared");
            this.f51492F = true;
            return true;
        }
    }

    /* renamed from: o */
    public final void mo23214o() {
        Log.m105918d("MicroMsg.MPExoVideoWrapper", "start timer");
        if (!this.f51503R.stopped()) {
            mo23215p();
        }
        this.f51503R.startTimer((long) 500);
    }

    /* renamed from: p */
    public final void mo23215p() {
        Log.m105918d("MicroMsg.MPExoVideoWrapper", "stop timer");
        this.f51503R.stopTimer();
    }

    /* renamed from: q */
    public final void mo23216q(int i) {
        this.f51512g.post(new C18538m(this, i));
    }

    /* renamed from: r */
    public final void mo23217r(boolean z) {
        this.f51512g.post(new C18539n(this, z));
    }

    public final void setCheckTimer(MTimerHandler mTimerHandler) {
        C87412m.m108594g(mTimerHandler, "<set-?>");
        this.f51503R = mTimerHandler;
    }

    public final void setControllerBarShowing(boolean z) {
    }

    public final void setErrorCheckTimer(MTimerHandler mTimerHandler) {
        C87412m.m108594g(mTimerHandler, "<set-?>");
        this.f51519p0 = mTimerHandler;
    }

    public final void setErrorCount(int i) {
        this.f51508W = i;
    }

    public final void setIMMVideoViewCallback(C96814a.C57541b bVar) {
        C87412m.m108594g(bVar, "_callback");
        this.f51523t = bVar;
    }

    public void setKeepScreenOn(boolean z) {
        Log.m105919d("MicroMsg.MPExoVideoWrapper", "set keep screen on[%b]", Boolean.valueOf(z));
        this.f51512g.post(new C18536i(this, z));
    }

    public final void setLive(boolean z) {
    }

    public final void setLoading(ProgressBar progressBar) {
        this.f51514i = progressBar;
    }

    public final void setMVideoSource(int i) {
        this.f51527x = i;
    }

    public final void setMute(boolean z) {
        this.f51525v = z;
        C21365k kVar = this.f51522s;
        if (kVar != null) {
            C87412m.m108591d(kVar);
            kVar.setMute(this.f51525v);
        }
    }

    public final void setNeedShowSwitchTitleTextView(boolean z) {
        this.f51504S = z;
    }

    public final void setPlayOnUiPause(boolean z) {
        this.f51487A = z;
    }

    public final void setShowLoadingTimer(MTimerHandler mTimerHandler) {
        C87412m.m108594g(mTimerHandler, "<set-?>");
        this.f51507V = mTimerHandler;
    }

    public final void setSwitchingResolution(boolean z) {
        this.f51505T = z;
    }

    public final void setUIAvailable(boolean z) {
        this.f51529y = z;
    }

    public final void setUiHandler(MMHandler mMHandler) {
        C87412m.m108594g(mMHandler, "<set-?>");
        this.f51512g = mMHandler;
    }

    public final void setVideoFooterView(C102173o oVar) {
        C87412m.m108594g(oVar, "_footerView");
        this.f51518p = oVar;
        LinearLayout linearLayout = this.f51513h;
        C87412m.m108591d(linearLayout);
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.f51513h;
        C87412m.m108591d(linearLayout2);
        linearLayout2.addView((View) this.f51518p);
    }

    public final void setVideoSource(int i) {
        this.f51527x = i;
    }
}
