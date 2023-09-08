package com.tencent.p014mm.plugin.sns.p106ui;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import ao2.C79618h;
import be3.C92258b;
import bv2.C92315e;
import bv2.C92320h;
import bv2.C92323i;
import bv2.C92324j;
import c03.C92332a;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C92461m;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.autogen.events.SnsFavFeedForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsFlipUIEvent;
import com.tencent.p014mm.autogen.events.SnsVideoMenuEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.TPVideoPlayReportStruct;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoViewHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.seekbar.HeroSeekBarView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.sendtowework.VideoData;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import di3.C86312j;
import ds2.C97540j;
import eb0.C97621e;
import et2.C97707a;
import f03.C97782d;
import f03.C97787h;
import f40.C86709a0;
import gy3.C8479f0;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98398h0;
import hd0.C98408n0;
import j03.C21147f;
import j03.C60698b;
import j20.C117292a;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import jv1.C76450b;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import l03.C10446d;
import l03.C99277b;
import l03.C99279f;
import l03.C99282g;
import l03.C99283h;
import l03.C99285j;
import l03.C99286k;
import l03.C99288m;
import l03.C99289n;
import l03.C99290o;
import l03.C99291p;
import l03.C99292q;
import l03.C99293r;
import l03.C99294s;
import lu3.C34379c;
import nc3.C34767b;
import nj3.C76912y0;
import os2.C100400e0;
import p159gw.C98250h;
import p206nj.C11171e;
import p215oo.C77032h;
import p329d3.C86165a;
import p910lj.C76701a;
import qo3.C47883u;
import qo3.C77426q;
import s62.C110762b;
import s62.C110768l;
import s62.C110770m;
import s62.C110774n;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;
import vr2.C37817q;
import wx3.C15601d;
import wx3.C66212f;
import xb0.C102609h;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView */
public class OnlineVideoView extends RelativeLayout implements C96875r0.C96876a, OnlineVideoViewHelper.IVideoUICallback, C97621e.C97622a {

    /* renamed from: H1 */
    public static final /* synthetic */ int f277144H1 = 0;

    /* renamed from: A */
    public C96875r0 f277145A;

    /* renamed from: A1 */
    public boolean f277146A1;

    /* renamed from: B */
    public ProgressBar f277147B;

    /* renamed from: B1 */
    public boolean f277148B1;

    /* renamed from: C */
    public MMPinProgressBtn f277149C;

    /* renamed from: C1 */
    public int f277150C1;

    /* renamed from: D */
    public TextView f277151D;

    /* renamed from: D1 */
    public int f277152D1;

    /* renamed from: E */
    public ImageView f277153E;

    /* renamed from: E1 */
    public int f277154E1;

    /* renamed from: F */
    public volatile OnlineVideoViewHelper f277155F;

    /* renamed from: F1 */
    public int f277156F1;

    /* renamed from: G */
    public boolean f277157G;

    /* renamed from: G1 */
    public List<IDownloadListener> f277158G1;

    /* renamed from: H */
    public boolean f277159H;

    /* renamed from: I */
    public boolean f277160I;

    /* renamed from: J */
    public int f277161J;

    /* renamed from: K */
    public int f277162K;

    /* renamed from: L */
    public int f277163L;

    /* renamed from: M */
    public long f277164M;

    /* renamed from: N */
    public long f277165N;

    /* renamed from: P */
    public int f277166P;

    /* renamed from: Q */
    public C34767b.C34768c f277167Q;

    /* renamed from: Q0 */
    public int f277168Q0;

    /* renamed from: R */
    public boolean f277169R;

    /* renamed from: R0 */
    public boolean f277170R0;

    /* renamed from: S */
    public boolean f277171S;

    /* renamed from: S0 */
    public C97787h f277172S0;

    /* renamed from: T */
    public MMHandler f277173T;

    /* renamed from: T0 */
    public C92315e f277174T0;

    /* renamed from: U */
    public int f277175U;

    /* renamed from: U0 */
    public C92320h f277176U0;

    /* renamed from: V */
    public long f277177V;

    /* renamed from: V0 */
    public HeroSeekBarView f277178V0;

    /* renamed from: W */
    public String f277179W;

    /* renamed from: W0 */
    public ImageView f277180W0;

    /* renamed from: X0 */
    public Future<?> f277181X0;

    /* renamed from: Y0 */
    public boolean f277182Y0;

    /* renamed from: Z0 */
    public String f277183Z0;

    /* renamed from: a1 */
    public long f277184a1;

    /* renamed from: b1 */
    public long f277185b1;

    /* renamed from: c1 */
    public int f277186c1;

    /* renamed from: d */
    public final String f277187d;

    /* renamed from: d1 */
    public final boolean f277188d1;

    /* renamed from: e */
    public int f277189e;

    /* renamed from: e1 */
    public boolean f277190e1;

    /* renamed from: f */
    public boolean f277191f;

    /* renamed from: f1 */
    public final DelaySeekTask f277192f1;

    /* renamed from: g */
    public boolean f277193g;

    /* renamed from: g1 */
    public volatile boolean f277194g1;

    /* renamed from: h */
    public String f277195h;

    /* renamed from: h1 */
    public volatile boolean f277196h1;

    /* renamed from: i */
    public boolean f277197i;

    /* renamed from: i1 */
    public CdnLogic.VideoInfo f277198i1;

    /* renamed from: j */
    public Context f277199j;

    /* renamed from: j1 */
    public C99294s f277200j1;

    /* renamed from: k1 */
    public C99277b f277201k1;

    /* renamed from: l1 */
    public Activity f277202l1;

    /* renamed from: m1 */
    public boolean f277203m1;

    /* renamed from: n */
    public C98408n0 f277204n;

    /* renamed from: n1 */
    public Runnable f277205n1;

    /* renamed from: o */
    public C101804kv2 f277206o;

    /* renamed from: o1 */
    public MTimerHandler f277207o1;

    /* renamed from: p */
    public String f277208p;

    /* renamed from: p0 */
    public String f277209p0;

    /* renamed from: p1 */
    public MTimerHandler f277210p1;

    /* renamed from: q */
    public String f277211q;

    /* renamed from: q1 */
    public C94853e.C94861h f277212q1;

    /* renamed from: r */
    public C96983o3 f277213r;

    /* renamed from: r1 */
    public IListener f277214r1;

    /* renamed from: s */
    public int f277215s;

    /* renamed from: s1 */
    public IListener f277216s1;

    /* renamed from: t */
    public int f277217t;

    /* renamed from: t1 */
    public IListener f277218t1;

    /* renamed from: u */
    public int f277219u;

    /* renamed from: u1 */
    public C96875r0.C96879e f277220u1;

    /* renamed from: v */
    public boolean f277221v;

    /* renamed from: v1 */
    public C110762b f277222v1;

    /* renamed from: w */
    public boolean f277223w;

    /* renamed from: w1 */
    public long f277224w1;

    /* renamed from: x */
    public IVideoViewCallback f277225x;

    /* renamed from: x0 */
    public String f277226x0;

    /* renamed from: x1 */
    public int f277227x1;

    /* renamed from: y */
    public RelativeLayout f277228y;

    /* renamed from: y0 */
    public int f277229y0;

    /* renamed from: y1 */
    public long f277230y1;

    /* renamed from: z */
    public ImageView f277231z;

    /* renamed from: z1 */
    public int f277232z1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView$DelaySeekTask */
    public class DelaySeekTask implements Runnable {

        /* renamed from: d */
        public int f277291d = -1;

        /* renamed from: e */
        public long f277292e = -1;

        public DelaySeekTask(C953621 r2) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$DelaySeekTask");
            this.f277292e = SystemClock.uptimeMillis();
            OnlineVideoView.this.mo132322N(this.f277291d, false);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$DelaySeekTask");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView$IDownloadListener */
    public interface IDownloadListener {
        /* renamed from: o */
        void mo126115o(String str, boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView$IVideoViewCallback */
    public interface IVideoViewCallback {
        /* renamed from: a */
        void mo132395a(int i);

        /* renamed from: b */
        void mo132396b(int i);

        void onCompletion();
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView$IVideoViewCallbackEx */
    public interface IVideoViewCallbackEx extends IVideoViewCallback {
        void onPause();
    }

    public OnlineVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public static /* synthetic */ String m121633b(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        String str = onlineVideoView.f277187d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ HeroSeekBarView m121634c(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        HeroSeekBarView heroSeekBarView = onlineVideoView.f277178V0;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return heroSeekBarView;
    }

    /* renamed from: d */
    public static /* synthetic */ MMHandler m121635d(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        MMHandler mMHandler = onlineVideoView.f277173T;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return mMHandler;
    }

    /* renamed from: e */
    public static /* synthetic */ int m121636e(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i = onlineVideoView.f277186c1;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    /* renamed from: f */
    public static /* synthetic */ int m121637f(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i = onlineVideoView.f277217t;
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    /* renamed from: g */
    public static /* synthetic */ int m121638g(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i = onlineVideoView.f277219u;
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    private String getRelocatedVideoPath() {
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        SnsMethodCalculate.markStartTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f277211q);
        if (DN == null) {
            SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return null;
        }
        TimeLineObject timeLine = DN.getTimeLine();
        if (timeLine == null || (j002 = timeLine.ContentObj) == null || (linkedList = j002.f298427h) == null || linkedList.isEmpty()) {
            Log.m105928w(this.f277187d, "getRelocatedVideoPath but no valid media found");
            SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return null;
        }
        String f = C94867e2.m120287f(this.f277208p, timeLine.ContentObj.f298427h.get(0));
        SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return f;
    }

    /* renamed from: h */
    public static void m121639h(OnlineVideoView onlineVideoView, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        OnlineVideoView$$a onlineVideoView$$a = new OnlineVideoView$$a(onlineVideoView, str, z);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            onlineVideoView$$a.run();
            SnsMethodCalculate.markEndTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(onlineVideoView$$a);
            SnsMethodCalculate.markEndTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: i */
    public static /* synthetic */ ProgressBar m121640i(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        ProgressBar progressBar = onlineVideoView.f277147B;
        SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return progressBar;
    }

    /* renamed from: j */
    public static /* synthetic */ MMPinProgressBtn m121641j(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        MMPinProgressBtn mMPinProgressBtn = onlineVideoView.f277149C;
        SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return mMPinProgressBtn;
    }

    /* renamed from: k */
    public static /* synthetic */ String m121642k(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        String str = onlineVideoView.f277208p;
        SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    /* renamed from: l */
    public static /* synthetic */ void m121643l(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.mo132369v();
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: m */
    public static void m121644m(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("rptSaveVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        C115669n.INSTANCE.idkeyStat(354, 222, 1, false);
        SnsMethodCalculate.markEndTimeMs("rptSaveVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: n */
    public static /* synthetic */ ImageView m121645n(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        ImageView imageView = onlineVideoView.f277231z;
        SnsMethodCalculate.markEndTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return imageView;
    }

    /* renamed from: o */
    public static /* synthetic */ int m121646o(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$4200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i = onlineVideoView.f277189e;
        SnsMethodCalculate.markEndTimeMs("access$4200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    /* renamed from: p */
    public static void m121647p(OnlineVideoView onlineVideoView, int i) {
        SnsMethodCalculate.markStartTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("handleSendVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (onlineVideoView.f277217t > 0) {
            Log.m105928w(onlineVideoView.f277187d, "send video now, do nothing.");
            SnsMethodCalculate.markEndTimeMs("handleSendVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            String m = C94867e2.m120294m(onlineVideoView.f277208p, onlineVideoView.f277206o);
            if (!C86013q1.m106450k(m)) {
                m = onlineVideoView.getRelocatedVideoPath();
                String str = onlineVideoView.f277187d;
                Log.m105928w(str, "get relocated video path: " + m);
            }
            Log.m105925i(onlineVideoView.f277187d, "%d retransmit video req code %d, download finish path %s", Integer.valueOf(onlineVideoView.hashCode()), Integer.valueOf(i), m);
            if (!Util.isNullOrNil(m)) {
                onlineVideoView.mo132323O(i);
            } else {
                onlineVideoView.f277217t = i;
                onlineVideoView.mo132327S(true, 33, true);
                onlineVideoView.mo132326R();
                SnsMethodCalculate.markStartTimeMs("rptDownloadBySendVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                C115669n.INSTANCE.idkeyStat(354, 223, 1, false);
                SnsMethodCalculate.markEndTimeMs("rptDownloadBySendVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
            SnsMethodCalculate.markEndTimeMs("handleSendVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        SnsMethodCalculate.markEndTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: q */
    public static /* synthetic */ C101804kv2 m121648q(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        C101804kv2 kv22 = onlineVideoView.f277206o;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return kv22;
    }

    /* renamed from: A */
    public void mo132313A() {
        SnsMethodCalculate.markStartTimeMs("notePauseVideoByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277230y1 > 0) {
            this.f277232z1 = 0;
            this.f277232z1 = (int) (((long) 0) + ((Util.nowMilliSecond() - this.f277230y1) / 1000));
        }
        Log.m105925i(this.f277187d, "%d notePauseVideoByResume playVideoDuration %d ", Integer.valueOf(hashCode()), Integer.valueOf(this.f277232z1));
        this.f277230y1 = 0;
        SnsMethodCalculate.markEndTimeMs("notePauseVideoByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: B */
    public final void mo132314B() {
        SnsMethodCalculate.markStartTimeMs("notePlayVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277224w1 = Util.nowMilliSecond();
        Log.m105919d(this.f277187d, "%d notePlayVideo notePlayVideo %d ", Integer.valueOf(hashCode()), Long.valueOf(this.f277224w1));
        SnsMethodCalculate.markEndTimeMs("notePlayVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: C */
    public final void mo132315C() {
        SnsMethodCalculate.markStartTimeMs("noteResumeVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277230y1 = Util.nowMilliSecond();
        Log.m105919d(this.f277187d, "%d noteResumeVideo noteResumeVideo %d ", Integer.valueOf(hashCode()), Long.valueOf(this.f277230y1));
        SnsMethodCalculate.markEndTimeMs("noteResumeVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: D */
    public void mo130402D() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105919d(this.f277187d, "%d on destroy %s", Integer.valueOf(hashCode()), Util.getStack());
        this.f277165N = Util.nowMilliSecond();
        synchronized (this) {
            SnsMethodCalculate.markStartTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            HeroSeekBarView heroSeekBarView = this.f277178V0;
            heroSeekBarView.f283697u = false;
            C34379c<?> cVar = heroSeekBarView.f283695s;
            if (cVar != null) {
                cVar.cancel(true);
            }
            Future<?> future = this.f277181X0;
            if (future != null) {
                future.cancel(true);
                this.f277181X0 = null;
            }
            this.f277208p = null;
            this.f277204n = null;
            if (!this.f277194g1) {
                SnsMethodCalculate.markEndTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            } else {
                this.f277194g1 = false;
                Log.m105925i(this.f277187d, "%d logic unInit", Integer.valueOf(hashCode()));
                mo132373z();
                mo132313A();
                this.f277145A.stop();
                if (!(this.f277145A instanceof ThumbPlayerVideoView)) {
                    this.f277218t1.dead();
                }
                this.f277214r1.dead();
                C94866e1.Vx0().mo130997v(this.f277212q1);
                mo132356s();
                this.f277173T.removeCallbacksAndMessages((Object) null);
                if (this.f277155F != null) {
                    this.f277155F.mo132418q();
                    this.f277155F.mo132405d();
                }
                C97787h hVar = this.f277172S0;
                if (hVar != null) {
                    ((CdnVideoResourceDownloader) hVar).stop();
                    this.f277172S0 = null;
                }
                C92320h hVar2 = this.f277176U0;
                if (hVar2 != null) {
                    SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                    Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "release");
                    C53930o0.m60558e(hVar2.f264175c, (CancellationException) null, 1, (Object) null);
                    SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                }
                if (C92614a.m116678c() != null) {
                    ((C92614a) C92614a.m116678c()).mo126635b();
                }
                if (this.f277167Q != null) {
                    ((C34767b) C86312j.m106911c(C34767b.class)).b20(this.f277167Q);
                }
                this.f277167Q = null;
                C101804kv2 kv22 = this.f277206o;
                if (kv22 != null) {
                    C99279f fVar = C99279f.f291124a;
                    String str = kv22.f298689d;
                    C10446d dVar = C10446d.VIEW_DESTROY;
                    fVar.getClass();
                    C87412m.m108594g(str, "mediaId");
                    fVar.mo138692e(new C99282g(str, dVar));
                }
                this.f277206o = null;
                this.f277155F = null;
                this.f277163L = 0;
                this.f277182Y0 = false;
                SnsMethodCalculate.markEndTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
        }
        this.f277170R0 = false;
        this.f277169R = false;
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: E */
    public void mo130403E() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105919d(this.f277187d, "%d on resume %s", Integer.valueOf(hashCode()), Util.getStack());
        if (this.f277169R) {
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        this.f277164M = Util.nowMilliSecond();
        this.f277170R0 = true;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277196h1) {
            Log.m105921e(this.f277187d, "what are you doing guys!!! Would you like to invite everyone to eat pizza??? %s", Util.getStack());
            C115669n.INSTANCE.mo175913w(31, 3, 1);
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            if (!this.f277194g1) {
                this.f277194g1 = true;
                Log.m105925i(this.f277187d, "%d logic init, create new helper and add listener.", Integer.valueOf(hashCode()));
                this.f277170R0 = true;
                if (this.f277145A instanceof ThumbPlayerVideoView) {
                    SnsMethodCalculate.markStartTimeMs("initTpPlayer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    C99294s sVar = new C99294s(new TPVideoPlayReportStruct(), this.f277164M, 2);
                    this.f277200j1 = sVar;
                    C101804kv2 kv22 = this.f277206o;
                    final String str = kv22 != null ? kv22.f298689d : "";
                    Log.m105920e("MicroMsg.TPPlayerReporter", "markMediaId media id:" + str);
                    TPVideoPlayReportStruct tPVideoPlayReportStruct = sVar.f291171a;
                    tPVideoPlayReportStruct.f266337g = tPVideoPlayReportStruct.mo86045b("MediaId", str, true);
                    this.f277201k1 = new C99277b(this.f277164M);
                    this.f277200j1.f291171a.f266323R = this.f277186c1;
                    final ThumbPlayerVideoView thumbPlayerVideoView = (ThumbPlayerVideoView) this.f277145A;
                    if (thumbPlayerVideoView.isInitialized()) {
                        Log.m105928w(this.f277187d, "init tp player but the previous stop operation seems not success");
                        this.f277145A.stop();
                    }
                    thumbPlayerVideoView.mo24836c(this.f277201k1);
                    thumbPlayerVideoView.mo24836c(this.f277200j1);
                    thumbPlayerVideoView.setProgressListener(new ThumbPlayerVideoView.C19319c() {
                        /* renamed from: b */
                        public void mo24889b(long j) {
                            SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                            OnlineVideoView.this.mo132336b0((int) j);
                            SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                        }
                    });
                    C101804kv2 kv23 = this.f277206o;
                    if (kv23 == null || this.f277208p == null) {
                        Log.m105921e(this.f277187d, "null check failed: media=%s, localId=%s", kv23, this.f277208p);
                    } else {
                        final String str2 = C94938q1.m120518e(C94866e1.m120262YO(), this.f277206o.f298689d) + C102236a0.m134725T(this.f277206o);
                        this.f277174T0 = new C92315e(this.f277206o, this.f277215s, this.f277208p, this.f277201k1, new C92315e.C92316a() {
                            /* renamed from: a */
                            public OnlineVideoViewHelper.VideoRptStruct mo126317a() {
                                SnsMethodCalculate.markStartTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
                                OnlineVideoViewHelper.VideoRptStruct rptStruct = OnlineVideoView.this.getRptStruct();
                                SnsMethodCalculate.markEndTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
                                return rptStruct;
                            }

                            /* renamed from: b */
                            public long mo126318b() {
                                SnsMethodCalculate.markStartTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
                                long playVideoDurationByResume = (long) OnlineVideoView.this.getPlayVideoDurationByResume();
                                SnsMethodCalculate.markEndTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
                                return playVideoDurationByResume;
                            }
                        });
                        CdnVideoResourceDownloader cdnVideoResourceDownloader = new CdnVideoResourceDownloader(this.f277174T0);
                        this.f277172S0 = cdnVideoResourceDownloader;
                        cdnVideoResourceDownloader.mo134540m(this.f277200j1);
                        ((CdnVideoResourceDownloader) this.f277172S0).mo134540m(this.f277201k1);
                        this.f277176U0 = new C92320h(this.f277172S0, new C92320h.C92321a() {
                            /* renamed from: a */
                            public void mo126322a() {
                                SnsMethodCalculate.markStartTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                                Log.m105924i(OnlineVideoView.m121633b(OnlineVideoView.this), "onCompleted");
                                if (OnlineVideoView.m121637f(OnlineVideoView.this) > 0) {
                                    OnlineVideoView.m121643l(OnlineVideoView.this);
                                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                    int f = OnlineVideoView.m121637f(onlineVideoView);
                                    SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView.mo132323O(f);
                                    SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                } else if (OnlineVideoView.m121638g(OnlineVideoView.this) > 0) {
                                    OnlineVideoView.m121643l(OnlineVideoView.this);
                                    OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                    int g = OnlineVideoView.m121638g(onlineVideoView2);
                                    OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                    SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z = onlineVideoView3.f277221v;
                                    SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    SnsMethodCalculate.markStartTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView2.f277173T.post(new Runnable(g, z) {

                                        /* renamed from: d */
                                        public final /* synthetic */ int f277234d;

                                        /* renamed from: e */
                                        public final /* synthetic */ boolean f277235e;

                                        {
                                            this.f277234d = r2;
                                            this.f277235e = r3;
                                        }

                                        public void run() {
                                            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                            C100400e0 Yx0 = C94866e1.Yx0();
                                            OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                            int i = OnlineVideoView.f277144H1;
                                            SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            String str = onlineVideoView.f277211q;
                                            SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            SnsInfo DN = Yx0.mo139798DN(str);
                                            if (DN == null) {
                                                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                return;
                                            }
                                            Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "fav download video[%s] farFromScene %d isFromMain %b", OnlineVideoView.m121642k(OnlineVideoView.this), Integer.valueOf(this.f277234d), Boolean.valueOf(this.f277235e));
                                            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                                            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                                            aVar.f264688m = this.f277234d;
                                            aVar.f264684i = (Activity) OnlineVideoView.this.getActivityContext();
                                            C97707a.m126006d(doFavoriteEvent, DN);
                                            doFavoriteEvent.publish();
                                            if (doFavoriteEvent.f264675e.f9046a == 0) {
                                                OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                                SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                onlineVideoView2.getClass();
                                                SnsMethodCalculate.markStartTimeMs("rptFavVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                C115669n.INSTANCE.idkeyStat(354, 225, 1, false);
                                                SnsMethodCalculate.markEndTimeMs("rptFavVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            } else {
                                                OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                                SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                onlineVideoView3.getClass();
                                                SnsMethodCalculate.markStartTimeMs("rptFavVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                C115669n.INSTANCE.idkeyStat(354, 226, 1, false);
                                                SnsMethodCalculate.markEndTimeMs("rptFavVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            }
                                            if (this.f277235e) {
                                                SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent = new SnsFavFeedForDataReportEvent();
                                                snsFavFeedForDataReportEvent.f265135d.f265137b = DN.getLocalid();
                                                snsFavFeedForDataReportEvent.f265135d.f265136a = C102236a0.m134728W(DN);
                                                snsFavFeedForDataReportEvent.publish();
                                            }
                                            OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                                            SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView4.f277219u = 0;
                                            SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            C96875r0 r0Var = OnlineVideoView.this.f277145A;
                                            if (r0Var != null) {
                                                if (Util.isNullOrNil(r0Var.getVideoPath())) {
                                                    Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d had not set video path to play", Integer.valueOf(OnlineVideoView.this.hashCode()));
                                                    String m = C94867e2.m120294m(OnlineVideoView.m121642k(OnlineVideoView.this), OnlineVideoView.m121648q(OnlineVideoView.this));
                                                    if (!Util.isNullOrNil(m)) {
                                                        OnlineVideoView.this.mo132318H(m, false);
                                                    }
                                                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                    return;
                                                } else if (!OnlineVideoView.this.f277145A.isPlaying()) {
                                                    OnlineVideoView.this.f277145A.start();
                                                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                    return;
                                                }
                                            }
                                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                        }
                                    });
                                    SnsMethodCalculate.markEndTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                } else {
                                    OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                                    SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z2 = onlineVideoView4.f277223w;
                                    SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    if (z2) {
                                        OnlineVideoView.m121643l(OnlineVideoView.this);
                                        OnlineVideoView onlineVideoView5 = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView5.mo132321L();
                                        SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    } else {
                                        OnlineVideoView onlineVideoView6 = OnlineVideoView.this;
                                        C97787h hVar = onlineVideoView6.f277172S0;
                                        if (hVar != null) {
                                            onlineVideoView6.mo132318H(((CdnVideoResourceDownloader) hVar).mo134538j(), false);
                                        }
                                    }
                                }
                                OnlineVideoView onlineVideoView7 = OnlineVideoView.this;
                                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                C92320h hVar2 = onlineVideoView7.f277176U0;
                                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                hVar2.getClass();
                                SnsMethodCalculate.markStartTimeMs("stopProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                                Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "stopProgressMonitor");
                                C53973z1 z1Var = hVar2.f264176d;
                                if (z1Var != null) {
                                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                                }
                                hVar2.f264176d = null;
                                SnsMethodCalculate.markEndTimeMs("stopProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                                OnlineVideoView.m121643l(OnlineVideoView.this);
                                OnlineVideoView.m121639h(OnlineVideoView.this, str2, true);
                                SnsMethodCalculate.markEndTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                            }

                            /* renamed from: b */
                            public void mo126323b(Exception exc) {
                                SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                                Log.printErrStackTrace(OnlineVideoView.m121633b(OnlineVideoView.this), exc, "onError", new Object[0]);
                                OnlineVideoView.m121639h(OnlineVideoView.this, str2, false);
                                SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                            }

                            /* renamed from: c */
                            public void mo126324c(CdnLogic.VideoInfo videoInfo) {
                                SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                                Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "onMoovReady: downloader=%s", OnlineVideoView.this.f277172S0);
                                if (videoInfo != null) {
                                    Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "svrflag:%s vf:%d ovf:%d reqFlag:%s path:%s", videoInfo.svrFlag, Integer.valueOf(videoInfo.videoFormat), Integer.valueOf(videoInfo.oriVideoFormat), videoInfo.requestFlag, videoInfo.videoPath);
                                }
                                if (OnlineVideoView.m121648q(OnlineVideoView.this) == null) {
                                    Log.m105924i(OnlineVideoView.m121633b(OnlineVideoView.this), "when moovReady view is destroy");
                                    SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                                    return;
                                }
                                if (videoInfo != null) {
                                    if (TextUtils.isEmpty(videoInfo.requestFlag) || videoInfo.requestFlag.equals(OnlineVideoView.m121648q(OnlineVideoView.this).f298687U)) {
                                        OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        C99294s sVar = onlineVideoView.f277200j1;
                                        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        sVar.mo138694y(videoInfo.requestFlag);
                                        OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        C99294s sVar2 = onlineVideoView2.f277200j1;
                                        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        String str = videoInfo.svrFlag;
                                        sVar2.getClass();
                                        Log.m105920e("MicroMsg.TPPlayerReporter", "markRspVideoFlag media id:" + sVar2.f291171a.f266337g + " flag:" + str);
                                        if (str != null && C112551y.m153819s(str, "x", true)) {
                                            TPVideoPlayReportStruct tPVideoPlayReportStruct = sVar2.f291171a;
                                            String substring = str.substring(1);
                                            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                                            tPVideoPlayReportStruct.f266322Q = tPVideoPlayReportStruct.mo86045b("ToVideoFlag", substring, true);
                                        }
                                        C99279f fVar = C99279f.f291124a;
                                        String str2 = str;
                                        int i = videoInfo.oriVideoFormat;
                                        int e = OnlineVideoView.m121636e(OnlineVideoView.this);
                                        fVar.getClass();
                                        C87412m.m108594g(str2, "mediaId");
                                        fVar.mo138692e(new C99289n(e, str2, i));
                                        String str3 = str;
                                        String str4 = videoInfo.requestFlag;
                                        String str5 = videoInfo.svrFlag;
                                        int e2 = OnlineVideoView.m121636e(OnlineVideoView.this);
                                        C87412m.m108594g(str3, "mediaId");
                                        C87412m.m108594g(str4, "reqFlag");
                                        C87412m.m108594g(str5, "repFlag");
                                        fVar.mo138692e(new C99288m(e2, str3, str4, str5));
                                        String str6 = str;
                                        String str7 = videoInfo.videoPath;
                                        int e3 = OnlineVideoView.m121636e(OnlineVideoView.this);
                                        C87412m.m108594g(str6, "mediaId");
                                        C87412m.m108594g(str7, "videoPath");
                                        fVar.mo138692e(new C99293r(str7, str6, e3));
                                    } else {
                                        Log.m105920e(OnlineVideoView.m121633b(OnlineVideoView.this), "video flag not equal,do nothing");
                                        SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                                        return;
                                    }
                                }
                                C99279f fVar2 = C99279f.f291124a;
                                String str8 = str;
                                int e4 = OnlineVideoView.m121636e(OnlineVideoView.this);
                                fVar2.getClass();
                                C87412m.m108594g(str8, "mediaId");
                                fVar2.mo138692e(new C99286k(e4, str8));
                                OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                onlineVideoView3.f277198i1 = videoInfo;
                                SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                if (videoInfo != null) {
                                    OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z = onlineVideoView4.f277188d1;
                                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    if (z) {
                                        OnlineVideoView onlineVideoView5 = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        TextView textView = onlineVideoView5.f277151D;
                                        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        textView.setText(String.format("svrflag:%s vf:%d ovf:%d \n", new Object[]{videoInfo.svrFlag, Integer.valueOf(videoInfo.videoFormat), Integer.valueOf(videoInfo.oriVideoFormat)}));
                                    }
                                }
                                C97787h hVar = OnlineVideoView.this.f277172S0;
                                if (hVar != null) {
                                    thumbPlayerVideoView.setResourceDownloader(hVar);
                                    thumbPlayerVideoView.prepare();
                                    OnlineVideoView.this.mo132318H(thumbPlayerVideoView.getVideoPath(), true);
                                }
                                SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                            }

                            public void onProgress(float f) {
                                SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                                Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "onProgress: %f", Float.valueOf(f));
                                if (!(OnlineVideoView.m121640i(OnlineVideoView.this) == null || OnlineVideoView.m121640i(OnlineVideoView.this).getVisibility() == 8)) {
                                    OnlineVideoView.m121640i(OnlineVideoView.this).setVisibility(8);
                                }
                                if (OnlineVideoView.m121641j(OnlineVideoView.this) != null) {
                                    if (OnlineVideoView.m121641j(OnlineVideoView.this).getVisibility() != 0) {
                                        OnlineVideoView.m121641j(OnlineVideoView.this).setVisibility(0);
                                    }
                                    if (OnlineVideoView.m121641j(OnlineVideoView.this).getMax() != 100 && f > 0.0f) {
                                        OnlineVideoView.m121641j(OnlineVideoView.this).setMax(100);
                                    }
                                    OnlineVideoView.m121641j(OnlineVideoView.this).setProgress((int) f);
                                }
                                SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                            }
                        });
                    }
                    SnsMethodCalculate.markEndTimeMs("initTpPlayer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                } else {
                    this.f277155F = new OnlineVideoViewHelper(this);
                    Log.m105925i(this.f277187d, "onlineVideoHelper hash:%d", Integer.valueOf(this.f277155F.hashCode()));
                    this.f277218t1.alive();
                }
                this.f277214r1.alive();
                C94866e1.Vx0().mo130978c(this.f277212q1);
                if (this.f277171S) {
                    mo132319I();
                }
                if (C92614a.m116678c() != null) {
                    ((C92614a) C92614a.m116678c()).mo126634a();
                }
            }
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        if (!this.f277193g) {
            mo132333Z();
        }
        this.f277169R = true;
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: F */
    public void mo132316F() {
        SnsMethodCalculate.markStartTimeMs("pauseByDataBlock", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "%d pauseByDataBlock", Integer.valueOf(hashCode()));
        mo132373z();
        mo132326R();
        mo132317G();
        if (AppForegroundDelegate.INSTANCE.f343454n) {
            this.f277170R0 = true;
            Log.m105925i(this.f277187d, "%d pauseByDataBlock and allowStart", Integer.valueOf(hashCode()));
        }
        SnsMethodCalculate.markEndTimeMs("pauseByDataBlock", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: G */
    public void mo132317G() {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277170R0 = false;
        if (this.f277145A.isPlaying()) {
            Log.m105925i(this.f277187d, "%d pause play", Integer.valueOf(hashCode()));
            mo132373z();
            mo132313A();
        }
        this.f277145A.pause();
        IVideoViewCallback iVideoViewCallback = this.f277225x;
        if (iVideoViewCallback instanceof IVideoViewCallbackEx) {
            try {
                ((IVideoViewCallbackEx) iVideoViewCallback).onPause();
            } catch (Throwable unused) {
                Log.m105920e(this.f277187d, "the pause callback invalid!!");
            }
        }
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: H */
    public void mo132318H(String str, boolean z) {
        C110770m mVar;
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "%d prepare video isOnlinePlay %b filePath %s", Integer.valueOf(hashCode()), Boolean.valueOf(z), str);
        if (Util.isNullOrNil(str)) {
            Log.m105929w(this.f277187d, "%d prepare video but filepath is null.", Integer.valueOf(hashCode()));
            SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        this.f277157G = z;
        C96875r0 r0Var = this.f277145A;
        if (r0Var != null) {
            if (this.f277163L != -3) {
                if (r0Var instanceof VideoPlayerTextureView) {
                    VideoPlayerTextureView videoPlayerTextureView = (VideoPlayerTextureView) r0Var;
                    SnsMethodCalculate.markStartTimeMs("checkNeedReset", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (!this.f277157G) {
                        SnsMethodCalculate.markEndTimeMs("checkNeedReset", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        z2 = false;
                    } else {
                        C86709a0.m107528h();
                        z2 = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false);
                        SnsMethodCalculate.markEndTimeMs("checkNeedReset", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    }
                    videoPlayerTextureView.setNeedResetExtractor(z2);
                    ((VideoPlayerTextureView) this.f277145A).setIsOnlineVideoType(z);
                }
                this.f277145A.setOneTimeVideoTextureUpdateCallback(this.f277220u1);
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("TrackDataSource");
                C101804kv2 kv22 = this.f277206o;
                String str2 = "";
                mmkv.putString("media-url", kv22 == null ? str2 : kv22.f298692g);
                C101804kv2 kv23 = this.f277206o;
                if (kv23 != null) {
                    str2 = kv23.f298694i;
                }
                mmkv.putString("thumb-url", str2);
                mmkv.putLong("prepare-ts", System.currentTimeMillis());
                mmkv.putString("prepare-path", str);
                mmkv.commit();
                C96875r0 r0Var2 = this.f277145A;
                if (r0Var2 instanceof ThumbPlayerVideoView) {
                    if (!z) {
                        r0Var2.setVideoPath(str);
                    }
                    if (!this.f277183Z0.equals(str)) {
                        mo132332Y(true, 0.0f);
                    }
                } else {
                    r0Var2.setVideoPath(str);
                    mo132331X(true, 0.0f);
                }
            } else {
                Log.m105925i(this.f277187d, "%d prepare video reset source", Integer.valueOf(hashCode()));
                C96875r0 r0Var3 = this.f277145A;
                if (r0Var3 instanceof VideoPlayerTextureView) {
                    VideoPlayerTextureView videoPlayerTextureView2 = (VideoPlayerTextureView) r0Var3;
                    Log.m105925i(videoPlayerTextureView2.f318484h, "%d reset source ", Integer.valueOf(videoPlayerTextureView2.hashCode()));
                    C110768l lVar = videoPlayerTextureView2.f318486j;
                    if (!(lVar == null || (mVar = lVar.f331337f) == null)) {
                        Log.m105925i("MicroMsg.VideoPlayerImpl", "%s reset extractor time[%d]", mVar.mo162322a(), Long.valueOf(mVar.f331349i.f331300e));
                        C110774n nVar = mVar.f331352l;
                        if (nVar != null) {
                            nVar.mo162292a(mVar.f331349i.f331300e, -1);
                            mVar.f331352l.mo162297f();
                            mVar.f331352l.f331318h = 0;
                        }
                    }
                }
                mo132322N(this.f277162K, true);
            }
        }
        this.f277178V0.setEnableDrag(true);
        if (this.f277188d1) {
            C101804kv2 kv24 = this.f277206o;
            if (!(kv24 == null || kv24.f298689d == null)) {
                TextView textView = this.f277151D;
                textView.append("mediaId: " + this.f277206o.f298689d + "\n");
            }
            this.f277151D.append(C94555d.m119568d(str));
            this.f277151D.setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: I */
    public void mo132319I() {
        Class cls = C34767b.class;
        SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105924i(this.f277187d, "requestAudioFocus: ");
        if (this.f277167Q != null) {
            ((C34767b) C86312j.m106911c(cls)).b20(this.f277167Q);
        }
        C34767b.C34768c el = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34780i.f93463c, new C34767b.C21622a() {
            /* renamed from: a */
            public void mo17997a(boolean z) {
                SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
                Log.m105924i(OnlineVideoView.m121633b(OnlineVideoView.this), "onPause: audio focus");
                OnlineVideoView.this.setMute(true);
                SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
            }

            public void onResume() {
                SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
                Log.m105924i(OnlineVideoView.m121633b(OnlineVideoView.this), "onResume: audio focus");
                OnlineVideoView.this.setMute(false);
                SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
            }

            public void onStop() {
                SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
                Log.m105924i(OnlineVideoView.m121633b(OnlineVideoView.this), "onStop: ");
                SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
            }
        });
        this.f277167Q = el;
        if (el == null || !el.mo34198a()) {
            Log.m105924i(this.f277187d, "requestAudioFocus: not gain focus");
            setMute(true);
        } else {
            Log.m105924i(this.f277187d, "requestAudioFocus: gain focus");
            setMute(false);
        }
        SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: I2 */
    public void mo23179I2() {
        SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: J */
    public boolean mo132320J() {
        SnsMethodCalculate.markStartTimeMs("resumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        boolean z = true;
        Log.m105925i(this.f277187d, "%d resumeByDataGain", Integer.valueOf(hashCode()));
        if (!this.f277170R0) {
            SnsMethodCalculate.markEndTimeMs("resumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return false;
        }
        if (!this.f277145A.isPlaying()) {
            mo132314B();
            mo132315C();
            z = this.f277145A.start();
            mo132369v();
        }
        SnsMethodCalculate.markEndTimeMs("resumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return z;
    }

    /* renamed from: K */
    public void mo130404K() {
        SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105924i(this.f277187d, "resumePlay()");
        this.f277170R0 = true;
        if (!this.f277145A.isPlaying()) {
            mo132315C();
            int duration = this.f277145A.getDuration();
            int currentPosition = this.f277145A.getCurrentPosition();
            if (currentPosition >= duration) {
                Log.m105921e(this.f277187d, "the current position is more than duration, current = %d, duration = %d !!!", Integer.valueOf(currentPosition), Integer.valueOf(duration));
            }
            C97787h hVar = this.f277172S0;
            if (hVar != null && !hVar.mo134534g() && !this.f277172S0.mo134529b()) {
                Log.m105928w(this.f277187d, "the downloader has been stopped by another instance, restart it");
                this.f277172S0.start();
            }
            this.f277145A.start();
        }
        SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: L */
    public final void mo132321L() {
        SnsMethodCalculate.markStartTimeMs("saveDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        ((C98250h) C86312j.m106911c(C98250h.class)).mo137351wu(getContext(), new C86165a<Boolean>() {
            public void accept(Object obj) {
                final String str;
                SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11");
                Boolean bool = (Boolean) obj;
                SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11");
                OnlineVideoView onlineVideoView = OnlineVideoView.this;
                int i = OnlineVideoView.f277144H1;
                SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                C98408n0 n0Var = onlineVideoView.f277204n;
                SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                if (n0Var != null) {
                    OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    C98408n0 n0Var2 = onlineVideoView2.f277204n;
                    SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    str = n0Var2.f288534B;
                } else {
                    str = C94867e2.m120294m(OnlineVideoView.m121642k(OnlineVideoView.this), OnlineVideoView.m121648q(OnlineVideoView.this));
                }
                if (!bool.booleanValue() || TextUtils.isEmpty(str)) {
                    OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    Context context = onlineVideoView3.f277199j;
                    SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    Context context2 = onlineVideoView4.f277199j;
                    SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    C76701a.makeText(context, (CharSequence) context2.getString(C0966R.string.kag), 1).show();
                    OnlineVideoView.m121644m(OnlineVideoView.this);
                    String b = OnlineVideoView.m121633b(OnlineVideoView.this);
                    Log.m105928w(b, hashCode() + " save downloaded video fail, granted = " + bool + ", fullPath = " + str);
                    OnlineVideoView onlineVideoView5 = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView5.f277223w = false;
                    SnsMethodCalculate.markEndTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11");
                } else {
                    final C953651 r102 = new Runnable() {
                        public void run() {
                            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11$1");
                            C96875r0 r0Var = OnlineVideoView.this.f277145A;
                            if (r0Var != null) {
                                if (Util.isNullOrNil(r0Var.getVideoPath())) {
                                    Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d had not set video path to play", Integer.valueOf(OnlineVideoView.this.hashCode()));
                                    String str = str;
                                    if (!Util.isNullOrNil(str)) {
                                        OnlineVideoView.this.mo132318H(str, false);
                                    }
                                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11$1");
                                    return;
                                } else if (!OnlineVideoView.this.f277145A.isPlaying()) {
                                    OnlineVideoView.this.f277145A.start();
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11$1");
                        }
                    };
                    final long currentTicks = Util.currentTicks();
                    final String str2 = str;
                    ((C98250h) C86312j.m106911c(C98250h.class)).mo137342Lm(OnlineVideoView.this.getContext(), str, new C98250h.C98251a() {
                        /* renamed from: a */
                        public void mo2055a(String str, String str2) {
                            SnsMethodCalculate.markStartTimeMs("onExportSuccess", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11$2");
                            C76701a.makeText(OnlineVideoView.this.getContext(), (CharSequence) OnlineVideoView.this.getContext().getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
                            AndroidMediaUtil.refreshMediaScanner(str2, OnlineVideoView.this.getContext());
                            OnlineVideoView onlineVideoView = OnlineVideoView.this;
                            int i = OnlineVideoView.f277144H1;
                            SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView.getClass();
                            SnsMethodCalculate.markStartTimeMs("rptSaveVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            C115669n.INSTANCE.idkeyStat(354, 221, 1, false);
                            SnsMethodCalculate.markEndTimeMs("rptSaveVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                            SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView2.getClass();
                            SnsMethodCalculate.markStartTimeMs("reportExportAsync", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            ((C119157j) C119157j.f356862d).mo183876g(new Runnable() {
                                public void run() {
                                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$12");
                                    try {
                                        C100400e0 Yx0 = C94866e1.Yx0();
                                        OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                        int i = OnlineVideoView.f277144H1;
                                        SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        String str = onlineVideoView.f277211q;
                                        SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        SnsInfo DN = Yx0.mo139798DN(str);
                                        if (DN == null) {
                                            Log.m105921e(OnlineVideoView.m121633b(OnlineVideoView.this), "[-] Fail to get sns info, skip reporting. snsId:%s, url:%s", OnlineVideoView.this.getSnsId(), OnlineVideoView.m121648q(OnlineVideoView.this).f298692g);
                                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$12");
                                            return;
                                        }
                                        C92461m.C92464c cVar = new C92461m.C92464c(3, C92461m.C92463b.VIDEO, (C92461m.C92462a) null);
                                        cVar.f264626b = DN.getUserName();
                                        cVar.f264628d = DN.field_snsId;
                                        cVar.f264630f = OnlineVideoView.m121648q(OnlineVideoView.this).f298692g;
                                        OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        int i2 = onlineVideoView2.f277229y0;
                                        SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        cVar.f264631g = i2;
                                        OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        int i3 = onlineVideoView3.f277168Q0;
                                        SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        cVar.f264632h = i3;
                                        cVar.f264633i = OnlineVideoView.m121648q(OnlineVideoView.this).f298694i;
                                        cVar.f264634j = OnlineVideoView.this.f277145A.getDuration();
                                        cVar.f264637m = OnlineVideoView.m121648q(OnlineVideoView.this).f298680M;
                                        C92461m.m116308a(cVar);
                                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$12");
                                    } catch (Throwable th) {
                                        Log.printErrStackTrace(OnlineVideoView.m121633b(OnlineVideoView.this), th, "[-] Exception was thrown when report.", new Object[0]);
                                    }
                                }
                            }, "SnsVideoExportReport");
                            SnsMethodCalculate.markEndTimeMs("reportExportAsync", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                            SnsMethodCalculate.markStartTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView3.f277223w = false;
                            SnsMethodCalculate.markEndTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d save downloaded video finish %d %s", Integer.valueOf(hashCode()), Long.valueOf(Util.ticksToNow(currentTicks)), str2);
                            OnlineVideoView.m121635d(OnlineVideoView.this).post(r102);
                            SnsMethodCalculate.markEndTimeMs("onExportSuccess", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11$2");
                        }

                        /* renamed from: b */
                        public void mo2056b(String str, String str2) {
                            SnsMethodCalculate.markStartTimeMs("onExportFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11$2");
                            C76701a.makeText(OnlineVideoView.this.getContext(), (CharSequence) OnlineVideoView.this.getContext().getString(C0966R.string.kag), 1).show();
                            OnlineVideoView.m121644m(OnlineVideoView.this);
                            OnlineVideoView onlineVideoView = OnlineVideoView.this;
                            SnsMethodCalculate.markStartTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView.f277223w = false;
                            SnsMethodCalculate.markEndTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            Log.m105929w(OnlineVideoView.m121633b(OnlineVideoView.this), "%d save downloaded video finish %d %s", Integer.valueOf(hashCode()), Long.valueOf(Util.ticksToNow(currentTicks)), str2);
                            OnlineVideoView.m121635d(OnlineVideoView.this).post(r102);
                            SnsMethodCalculate.markEndTimeMs("onExportFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11$2");
                        }
                    });
                    SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11");
                }
                SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11");
            }
        });
        SnsMethodCalculate.markEndTimeMs("saveDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsMethodCalculate.markEndTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return 0;
    }

    /* renamed from: N */
    public void mo132322N(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "%d seek second %d afterSeekPlay %b", Integer.valueOf(hashCode()), Integer.valueOf(i), Boolean.valueOf(z));
        this.f277163L = 0;
        mo132369v();
        this.f277145A.mo24787a((double) (i * 1000), z);
        mo132329U(false);
        SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: N3 */
    public void mo23180N3() {
        SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: O */
    public final void mo132323O(int i) {
        Class cls = C76450b.class;
        SnsMethodCalculate.markStartTimeMs("sendDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277206o == null) {
            SnsMethodCalculate.markEndTimeMs("sendDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        String str = C94938q1.m120518e(C94866e1.m120262YO(), this.f277206o.f298689d) + C102236a0.m134729X(this.f277206o);
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("image_path", str);
        String f = C94867e2.m120287f(this.f277208p, this.f277206o);
        if (!C86013q1.m106450k(f)) {
            f = getRelocatedVideoPath();
            Log.m105928w(this.f277187d, "get relocated video path: " + f);
        }
        String str2 = f;
        intent.putExtra("Select_Data_Send_To_WeWork", new VideoData(C86013q1.m106448i(str2, false)));
        intent.putExtra("content_type_forward_to_wework", 3);
        intent.putExtra("Retr_Msg_Type", 11);
        ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
        Log.m105925i(this.f277187d, "send video path %s reqCode %d", str, Integer.valueOf(i));
        if (!((C76450b) C86312j.m106911c(cls)).mo60660Wo() || !(getActivityContext() instanceof AppCompatActivity)) {
            C88144b.m109802t(getActivityContext(), ".ui.transmit.SelectConversationUI", intent, i);
            this.f277217t = 0;
            SnsMethodCalculate.markEndTimeMs("sendDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivityContext();
        Intent h = ((C76450b) C86312j.m106911c(cls)).mo60661h(appCompatActivity, str2, str, C102236a0.m134726U(str2), this.f277208p);
        C9556a aVar = new C9556a();
        aVar.mo10233c(h);
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        C117292a.m165358d(appCompatActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "sendDownloadedVideo", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appCompatActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity2, "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "sendDownloadedVideo", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        SnsMethodCalculate.markEndTimeMs("sendDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fa  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132324P(te3.C101804kv2 r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "setVideoData"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r11.f277208p = r13
            r11.f277215s = r14
            com.tencent.mm.storage.o3 r13 = com.tencent.p014mm.storage.C96983o3.m124650b()
            int r14 = r11.f277215s
            r13.f284145b = r14
            r11.f277213r = r13
            te3.kv2 r13 = r11.f277206o
            r14 = 2
            r2 = 1
            r3 = 0
            if (r13 == r12) goto L_0x0071
            r11.f277206o = r12
            java.lang.String r13 = "freshThumbImage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r1)
            te3.kv2 r4 = r11.f277206o
            if (r4 == 0) goto L_0x003b
            boolean r4 = r4.f298681N
            if (r4 == 0) goto L_0x003b
            java.lang.String r4 = r11.f277187d
            java.lang.String r5 = "the media is ad, the background should be transparent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r4 = 2131234934(0x7f081076, float:1.8086048E38)
            r8 = 2131234934(0x7f081076, float:1.8086048E38)
            goto L_0x0041
        L_0x003b:
            r4 = 2131231355(0x7f08027b, float:1.8078789E38)
            r8 = 2131231355(0x7f08027b, float:1.8078789E38)
        L_0x0041:
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            te3.kv2 r6 = r11.f277206o
            android.widget.ImageView r7 = r11.f277231z
            android.content.Context r4 = r11.f277199j
            int r9 = r4.hashCode()
            com.tencent.mm.storage.o3 r10 = r11.f277213r
            boolean r4 = r5.mo131114e0(r6, r7, r8, r9, r10)
            java.lang.String r5 = r11.f277187d
            java.lang.Object[] r6 = new java.lang.Object[r14]
            int r7 = r11.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6[r2] = r4
            java.lang.String r4 = "%d fresh thumb image %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)
        L_0x0071:
            te3.kv2 r13 = r11.f277206o
            if (r13 == 0) goto L_0x0092
            java.lang.String r13 = r11.f277208p
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            te3.kv2 r5 = r11.f277206o
            java.lang.String r5 = r5.f298689d
            r4.append(r5)
            java.lang.String r5 = "_"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = vr2.C102260r.m134869i(r13, r4)
            r11.f277211q = r13
        L_0x0092:
            java.lang.String r13 = "SnsAdUtil"
            java.lang.String r4 = "enableUseLocalVideoInfo"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.Class<h81.h> r6 = h81.C32735h.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x00c0 }
            h81.h r6 = (h81.C32735h) r6     // Catch:{ all -> 0x00c0 }
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_ad_onlinevideo_use_local_videoinfo     // Catch:{ all -> 0x00c0 }
            int r6 = r6.mo58779Qe(r7, r2)     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r7.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "enableUseLocalVideoInfo called"
            r7.append(r8)     // Catch:{ all -> 0x00be }
            r7.append(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r7)     // Catch:{ all -> 0x00be }
            goto L_0x00d7
        L_0x00be:
            r7 = move-exception
            goto L_0x00c3
        L_0x00c0:
            r6 = move-exception
            r7 = r6
            r6 = 1
        L_0x00c3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "enableUseLocalVideoInfo, exp="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r7)
        L_0x00d7:
            if (r6 <= 0) goto L_0x00db
            r13 = 1
            goto L_0x00dc
        L_0x00db:
            r13 = 0
        L_0x00dc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r13 == 0) goto L_0x00fa
            os2.e0 r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r4 = r11.f277211q
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r13.mo139798DN(r4)
            if (r13 == 0) goto L_0x0100
            boolean r13 = r13.isAd()
            if (r13 != 0) goto L_0x0100
            hd0.n0 r12 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120298q(r12)
            r11.f277204n = r12
            goto L_0x0100
        L_0x00fa:
            hd0.n0 r12 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120298q(r12)
            r11.f277204n = r12
        L_0x0100:
            r11.f277191f = r3
            java.lang.String r12 = r11.f277187d
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r4 = r11.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13[r3] = r4
            java.lang.String r3 = r11.f277208p
            r13[r2] = r3
            int r2 = r11.f277215s
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13[r14] = r2
            r14 = 3
            boolean r2 = r11.f277191f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r13[r14] = r2
            r14 = 4
            r13[r14] = r11
            java.lang.String r14 = "%d set video data[%s, %d] isPreview %b self %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.mo132324P(te3.kv2, java.lang.String, int):void");
    }

    /* renamed from: Q */
    public String mo132325Q() {
        SnsMethodCalculate.markStartTimeMs("showInfo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            if (this.f277206o != null) {
                stringBuffer.append("media: " + this.f277206o.f298689d);
            }
            if (this.f277208p != null) {
                stringBuffer.append("localId: " + this.f277208p);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f277187d, e, "", new Object[0]);
        }
        String stringBuffer2 = stringBuffer.toString();
        SnsMethodCalculate.markEndTimeMs("showInfo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return stringBuffer2;
    }

    /* renamed from: R */
    public final void mo132326R() {
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105924i(this.f277187d, "showLoading()");
        this.f277173T.post(this.f277205n1);
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: R0 */
    public void mo23181R0() {
        SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: S */
    public final void mo132327S(boolean z, int i, boolean z2) {
        int i2;
        boolean z3;
        SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277206o == null) {
            Log.m105929w(this.f277187d, "%d start download video but media is null.", Integer.valueOf(hashCode()));
            SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else if (this.f277155F == null && this.f277172S0 == null) {
            Log.m105929w(this.f277187d, "%d start download video but helper is null.", Integer.valueOf(hashCode()));
            SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else if (this.f277206o.f298693h == 2) {
            Log.m105929w(this.f277187d, "%d it start download video, url type is weixin", Integer.valueOf(hashCode()));
            this.f277189e = 3;
            C94866e1.Vx0().mo130979d(this.f277206o, 4, (C102268v) null, this.f277213r);
            SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            if (z || !C94867e2.m120282a()) {
                Log.m105925i(this.f277187d, "%d it start offline download video", Integer.valueOf(hashCode()));
                this.f277189e = 2;
                i2 = i != 0 ? i : 31;
                z3 = false;
            } else {
                Log.m105925i(this.f277187d, "%d it start online download video", Integer.valueOf(hashCode()));
                this.f277189e = 1;
                i2 = i == 0 ? 30 : i;
                z3 = true;
            }
            if (this.f277172S0 != null && this.f277176U0 != null) {
                C92315e eVar = this.f277174T0;
                if (eVar != null) {
                    SnsMethodCalculate.markStartTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
                    eVar.f264160f = i2;
                    SnsMethodCalculate.markEndTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
                    C92315e eVar2 = this.f277174T0;
                    eVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("setPlayMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
                    eVar2.f264161g = z3;
                    SnsMethodCalculate.markEndTimeMs("setPlayMode", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
                    C101804kv2 kv22 = this.f277206o;
                    if (kv22 != null) {
                        C99279f fVar = C99279f.f291124a;
                        String str = kv22.f298689d;
                        String e = this.f277174T0.mo126307e();
                        int i3 = this.f277186c1;
                        fVar.getClass();
                        C87412m.m108594g(str, "mediaId");
                        fVar.mo138692e(new C99283h(i3, str, e));
                    }
                }
                ((CdnVideoResourceDownloader) this.f277172S0).start();
                C101804kv2 kv23 = this.f277206o;
                if (kv23 != null) {
                    C99279f fVar2 = C99279f.f291124a;
                    String str2 = kv23.f298689d;
                    int i4 = this.f277186c1;
                    fVar2.getClass();
                    C87412m.m108594g(str2, "mediaId");
                    fVar2.mo138692e(new C99290o(i4, str2));
                    String str3 = this.f277206o.f298689d;
                    int i5 = this.f277186c1;
                    C87412m.m108594g(str3, "mediaId");
                    fVar2.mo138692e(new C99285j(i5, str3, false));
                }
                int i6 = this.f277189e;
                if (i6 == 1) {
                    C92320h hVar = this.f277176U0;
                    hVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("waitForMoovReady", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                    Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "waitForMoovReady");
                    C53895h.m60466d(hVar.f264175c, (C66212f) null, (C53934p0) null, new C92324j(new C8479f0(), hVar, (C15601d<? super C92324j>) null), 3, (Object) null);
                    SnsMethodCalculate.markEndTimeMs("waitForMoovReady", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                } else if (i6 == 2) {
                    this.f277176U0.mo126321b();
                    C92320h hVar2 = this.f277176U0;
                    hVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("startProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                    Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "startProgressMonitor");
                    C53973z1 z1Var = hVar2.f264176d;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                    hVar2.f264176d = C53895h.m60466d(hVar2.f264175c, (C66212f) null, (C53934p0) null, new C92323i(hVar2, (C15601d<? super C92323i>) null), 3, (Object) null);
                    SnsMethodCalculate.markEndTimeMs("startProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                }
                if (z2) {
                    mo132326R();
                }
            } else if (this.f277155F != null) {
                OnlineVideoViewHelper onlineVideoViewHelper = this.f277155F;
                C101804kv2 kv24 = this.f277206o;
                int i7 = this.f277215s;
                String str4 = this.f277208p;
                onlineVideoViewHelper.getClass();
                SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                if (onlineVideoViewHelper.f277300A) {
                    SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                } else {
                    onlineVideoViewHelper.f277309g = kv24;
                    onlineVideoViewHelper.f277310h = i7;
                    onlineVideoViewHelper.f277311i = str4;
                    onlineVideoViewHelper.f277312j = C94867e2.m120295n(kv24);
                    onlineVideoViewHelper.f277313k = C94867e2.m120283b(i7, kv24);
                    if (Util.isNullOrNil(onlineVideoViewHelper.f277312j) || Util.isNullOrNil(onlineVideoViewHelper.f277313k)) {
                        SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    } else {
                        Log.m105925i(onlineVideoViewHelper.f277303a, "start online download video %s isPlayMode %b", onlineVideoViewHelper.f277313k, Boolean.valueOf(z3));
                        String str5 = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper";
                        C94866e1.hy0().mo131028n(kv24, i7, str4, z3, true, i2, onlineVideoViewHelper.f277313k);
                        onlineVideoViewHelper.f277304b = 1;
                        onlineVideoViewHelper.f277324v = Util.nowMilliSecond();
                        SnsMethodCalculate.markStartTimeMs("rptStartDownload", str5);
                        if (z3) {
                            C115669n.INSTANCE.idkeyStat(354, 201, 1, false);
                        } else {
                            C115669n.INSTANCE.idkeyStat(354, 202, 1, false);
                        }
                        SnsMethodCalculate.markEndTimeMs("rptStartDownload", str5);
                        SnsMethodCalculate.markEndTimeMs("startDownload", str5);
                    }
                }
            } else {
                Log.m105928w(this.f277187d, "onlineVideoHelper is null!!!");
            }
            SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
    }

    /* renamed from: T */
    public boolean mo132328T(String str) {
        SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "startDownload, mediaPath: %s", str);
        if (this.f277206o == null) {
            Log.m105924i(this.f277187d, "startDownload, media is null");
            SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return false;
        }
        String str2 = C94938q1.m120518e(C94866e1.m120262YO(), this.f277206o.f298689d) + C102236a0.m134725T(this.f277206o);
        if (!str.equals(str2)) {
            Log.m105925i(this.f277187d, "startDownload, curMediaPath: %s", str2);
            SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return false;
        }
        mo132327S(true, 33, true);
        SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return true;
    }

    /* renamed from: U */
    public void mo132329U(boolean z) {
        SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277145A instanceof ThumbPlayerVideoView) {
            SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        if (!this.f277157G) {
            this.f277210p1.startTimer(500);
        } else if (z) {
            MMHandlerThread.postToMainThread(new Runnable() {
                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$17");
                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                    if (!(onlineVideoView.f277145A == null || onlineVideoView.f277155F == null)) {
                        OnlineVideoView.this.f277155F.mo132404c(OnlineVideoView.this.f277145A.getCurrentPosition() / 1000);
                    }
                    OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$4300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    MTimerHandler mTimerHandler = onlineVideoView2.f277207o1;
                    SnsMethodCalculate.markEndTimeMs("access$4300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    mTimerHandler.startTimer(500);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$17");
                }
            });
        } else {
            this.f277207o1.startTimer(500);
        }
        SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: W */
    public void mo132330W() {
        String str;
        String str2;
        int i;
        SnsMethodCalculate.markStartTimeMs("switchDefine", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        C101804kv2 kv22 = this.f277206o;
        if (kv22 == null || kv22.f298681N) {
            SnsMethodCalculate.markEndTimeMs("switchDefine", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else if (!(this.f277145A instanceof ThumbPlayerVideoView)) {
            SnsMethodCalculate.markEndTimeMs("switchDefine", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            C101804kv2 kv23 = new C101804kv2();
            try {
                kv23.parseFrom(this.f277206o.toByteArray());
                this.f277206o = kv23;
                long playerBufferedDurationMs = ((ThumbPlayerVideoView) this.f277145A).getPlayerBufferedDurationMs();
                long currentPosition = (long) ((ThumbPlayerVideoView) this.f277145A).getCurrentPosition();
                C97540j jVar = C97540j.f286244a;
                long j = playerBufferedDurationMs - currentPosition;
                C101804kv2 kv24 = this.f277206o;
                C98408n0 n0Var = this.f277204n;
                CdnLogic.VideoInfo videoInfo = this.f277198i1;
                SnsMethodCalculate.markStartTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "check enableSwitchDefine bufferMs:" + j);
                if (!jVar.mo136809a()) {
                    Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "enableSwitchDefine false by config");
                    SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                    str2 = "switchDefine";
                    str = "com.tencent.mm.plugin.sns.ui.OnlineVideoView";
                    i = 2;
                } else if (kv24 == null) {
                    Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "enableSwitchDefine false by media null");
                    SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                    str2 = "switchDefine";
                    str = "com.tencent.mm.plugin.sns.ui.OnlineVideoView";
                    i = 3;
                } else {
                    float f = (float) 1000;
                    if (kv24.f298684R * f <= ((float) C92332a.f264193g)) {
                        Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "media duration:" + (kv24.f298684R * f) + "ms < " + C92332a.f264193g);
                        SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                        str2 = "switchDefine";
                        str = "com.tencent.mm.plugin.sns.ui.OnlineVideoView";
                        i = 4;
                    } else {
                        str2 = "switchDefine";
                        str = "com.tencent.mm.plugin.sns.ui.OnlineVideoView";
                        if (j < C92332a.f264191e + ((long) 3000)) {
                            Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "bufferMs:" + j + " < " + C92332a.f264190d + " return false");
                            i = 5;
                            SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                        } else if (!C97540j.f286245b) {
                            Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "current device not support hevc");
                            i = 6;
                            SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                        } else {
                            if (n0Var != null) {
                                String str3 = n0Var.f288533A;
                                if (str3 != null && C112550d0.m153801u(str3, "V4", true)) {
                                    Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "enable switch define by local video flag:" + n0Var.f288533A);
                                    SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                                } else {
                                    i = 7;
                                    SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                                }
                            } else {
                                String str4 = videoInfo != null ? videoInfo.svrFlag : null;
                                if (str4 != null && C112550d0.m153801u(str4, "V4", true)) {
                                    Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "enable switch define by cdn video flag:" + str4);
                                    SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                                } else {
                                    i = 8;
                                    SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                                }
                            }
                            i = 1;
                        }
                    }
                }
                C99294s sVar = this.f277200j1;
                long currentPosition2 = (long) getCurrentPosition();
                sVar.getClass();
                Log.m105924i("MicroMsg.TPPlayerReporter", "onSwitchDefine media id:" + sVar.f291171a.f266337g + " playMs:" + currentPosition2 + " result:" + i);
                sVar.f291171a.f266326U = System.currentTimeMillis();
                TPVideoPlayReportStruct tPVideoPlayReportStruct = sVar.f291171a;
                tPVideoPlayReportStruct.f266328W = currentPosition2;
                tPVideoPlayReportStruct.f266332a0 = i;
                if (i != 1) {
                    if (!TextUtils.isEmpty(this.f277206o.f298687U)) {
                        this.f277206o.f298687U = "V2";
                    }
                    SnsMethodCalculate.markEndTimeMs(str2, str);
                    return;
                }
                String str5 = this.f277187d;
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(hashCode());
                C101804kv2 kv25 = this.f277206o;
                String str6 = "";
                objArr[1] = kv25 != null ? kv25.f298689d : str6;
                objArr[2] = Integer.valueOf(getCurrentPosition());
                Log.m105925i(str5, "[%d]start switch define video %s playtime:%d", objArr);
                C99294s sVar2 = this.f277200j1;
                sVar2.getClass();
                Log.m105920e("MicroMsg.TPPlayerReporter", "markFromVideoFlag media id:" + sVar2.f291171a.f266337g + " flag:" + "V4");
                TPVideoPlayReportStruct tPVideoPlayReportStruct2 = sVar2.f291171a;
                tPVideoPlayReportStruct2.f266321P = tPVideoPlayReportStruct2.mo86045b("FromVideoFlag", "V4", true);
                this.f277200j1.mo138694y("V2");
                jVar.mo136810b(C94866e1.Yx0().mo139798DN(this.f277208p), this.f277206o, false);
                this.f277184a1 = System.currentTimeMillis();
                C98408n0 q = C94867e2.m120298q(this.f277206o);
                if (q != null) {
                    str6 = q.f288534B;
                }
                if (!Util.isNullOrNil(str6)) {
                    Log.m105925i(this.f277187d, "%d sns video already download finish, play now", Integer.valueOf(hashCode()));
                    if (this.f277145A instanceof ThumbPlayerVideoView) {
                        if (!C86013q1.m106450k(str6)) {
                            str6 = getRelocatedVideoPath();
                            Log.m105928w(this.f277187d, "get relocated video path: " + str6);
                        }
                        if (C86013q1.m106450k(str6)) {
                            String str7 = this.f277208p + this.f277206o.f298687U;
                            SnsMethodCalculate.markStartTimeMs("switchDefineLocalVideo", str);
                            Log.m105925i(this.f277187d, "switchDefineLocalVideo path:%s", str6);
                            this.f277184a1 = System.currentTimeMillis();
                            ThumbPlayerVideoView thumbPlayerVideoView = (ThumbPlayerVideoView) this.f277145A;
                            thumbPlayerVideoView.getClass();
                            C87412m.m108594g(str7, "mediaId");
                            C87412m.m108594g(str6, "path");
                            Log.m105924i(thumbPlayerVideoView.f54444h, "switchDefineLocal, mediaId:" + str7 + " path:" + str6 + ", isExists:" + C86013q1.m106450k(str6));
                            TPVideoInfo.Builder builder = new TPVideoInfo.Builder();
                            builder.fileId(str7);
                            builder.downloadParam(new TPDownloadParamData(str7, 0));
                            C60698b bVar = thumbPlayerVideoView.f54445i;
                            if (bVar != null) {
                                String i2 = C86013q1.m106448i(str6, false);
                                C87412m.m108591d(i2);
                                ((C21147f) bVar).switchDefinition(i2, 0, builder.build(), 2);
                            }
                            SnsMethodCalculate.markEndTimeMs("switchDefineLocalVideo", str);
                            C99279f fVar = C99279f.f291124a;
                            String str8 = this.f277206o.f298689d;
                            long j2 = this.f277184a1;
                            fVar.getClass();
                            C87412m.m108594g(str8, "mediaId");
                            fVar.mo138692e(new C99292q(str8, j2));
                            SnsMethodCalculate.markEndTimeMs(str2, str);
                            return;
                        }
                    }
                }
                C99279f fVar2 = C99279f.f291124a;
                String str9 = this.f277206o.f298689d;
                long j3 = this.f277184a1;
                fVar2.getClass();
                C87412m.m108594g(str9, "mediaId");
                fVar2.mo138692e(new C99292q(str9, j3));
                SnsMethodCalculate.markStartTimeMs("switchDefineOnlineVideo", str);
                if (this.f277206o == null) {
                    SnsMethodCalculate.markEndTimeMs("switchDefineOnlineVideo", str);
                } else {
                    Log.m105924i(this.f277187d, "switchDefineOnlineVideo");
                    C97787h hVar = this.f277172S0;
                    if (hVar != null) {
                        ((CdnVideoResourceDownloader) hVar).stop();
                        this.f277172S0 = null;
                    }
                    this.f277174T0 = new C92315e(this.f277206o, this.f277215s, this.f277208p, this.f277201k1, new C92315e.C92316a() {
                        /* renamed from: a */
                        public OnlineVideoViewHelper.VideoRptStruct mo126317a() {
                            SnsMethodCalculate.markStartTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
                            OnlineVideoViewHelper.VideoRptStruct rptStruct = OnlineVideoView.this.getRptStruct();
                            SnsMethodCalculate.markEndTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
                            return rptStruct;
                        }

                        /* renamed from: b */
                        public long mo126318b() {
                            SnsMethodCalculate.markStartTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
                            long playVideoDurationByResume = (long) OnlineVideoView.this.getPlayVideoDurationByResume();
                            SnsMethodCalculate.markEndTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
                            return playVideoDurationByResume;
                        }
                    });
                    CdnVideoResourceDownloader cdnVideoResourceDownloader = new CdnVideoResourceDownloader(this.f277174T0);
                    this.f277172S0 = cdnVideoResourceDownloader;
                    cdnVideoResourceDownloader.mo134540m(this.f277200j1);
                    ((CdnVideoResourceDownloader) this.f277172S0).mo134540m(this.f277201k1);
                    C92320h hVar2 = this.f277176U0;
                    C97787h hVar3 = this.f277172S0;
                    hVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                    C87412m.m108594g(hVar3, "downloader");
                    hVar2.f264173a = hVar3;
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                    this.f277183Z0 = ((CdnVideoResourceDownloader) this.f277172S0).mo134538j();
                    mo132327S(false, 0, false);
                    ((ThumbPlayerVideoView) this.f277145A).setResourceDownloader(this.f277172S0);
                    ThumbPlayerVideoView thumbPlayerVideoView2 = (ThumbPlayerVideoView) this.f277145A;
                    String mediaId = ((CdnVideoResourceDownloader) this.f277172S0).getMediaId();
                    C97787h hVar4 = this.f277172S0;
                    thumbPlayerVideoView2.getClass();
                    C87412m.m108594g(mediaId, "mediaId");
                    C87412m.m108594g(hVar4, "downloader");
                    if (thumbPlayerVideoView2.f54443J == null) {
                        Log.m105928w(thumbPlayerVideoView2.f54444h, "switchDefineOnline return for resourceLoader is null.");
                    } else {
                        Log.m105924i(thumbPlayerVideoView2.f54444h, "switchDefineOnline, mediaId:" + mediaId);
                        C97782d dVar = thumbPlayerVideoView2.f54443J;
                        C87412m.m108591d(dVar);
                        ConcurrentHashMap<String, C97787h> concurrentHashMap = dVar.f286867g;
                        CdnVideoResourceDownloader cdnVideoResourceDownloader2 = (CdnVideoResourceDownloader) hVar4;
                        String mediaId2 = cdnVideoResourceDownloader2.getMediaId();
                        C87412m.m108591d(mediaId2);
                        concurrentHashMap.put(mediaId2, hVar4);
                        Log.m105924i(dVar.f286866f, "switchDefine id:" + cdnVideoResourceDownloader2.getMediaId() + " downloader:" + hVar4.hashCode());
                        TPVideoInfo.Builder builder2 = new TPVideoInfo.Builder();
                        builder2.fileId(mediaId);
                        builder2.downloadParam(new TPDownloadParamData(mediaId, 11));
                        C60698b bVar2 = thumbPlayerVideoView2.f54445i;
                        if (bVar2 != null) {
                            ((C21147f) bVar2).switchDefinition("http://127.0.0.1/sns", 0, builder2.build(), 2);
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("switchDefineOnlineVideo", str);
                }
                SnsMethodCalculate.markEndTimeMs(str2, str);
            } catch (IOException e) {
                Log.printErrStackTrace(this.f277187d, e, "copy media error", new Object[0]);
                SnsMethodCalculate.markEndTimeMs("switchDefine", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
        }
    }

    /* renamed from: X */
    public final void mo132331X(final boolean z, final float f) {
        SnsMethodCalculate.markStartTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277173T.post(new Runnable() {
            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$13");
                Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d switch video model isVideoPlay %b %f", Integer.valueOf(OnlineVideoView.this.hashCode()), Boolean.valueOf(z), Float.valueOf(f));
                OnlineVideoView onlineVideoView = OnlineVideoView.this;
                View view = (View) onlineVideoView.f277145A;
                if (z) {
                    SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    RelativeLayout relativeLayout = onlineVideoView.f277228y;
                    SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    relativeLayout.setAlpha(f);
                    OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    RelativeLayout relativeLayout2 = onlineVideoView2.f277228y;
                    SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    relativeLayout2.setVisibility(0);
                    float f = f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(f));
                    View view2 = view;
                    String str = "com.tencent.mm.plugin.sns.ui.OnlineVideoView";
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView$13", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/OnlineVideoView$13", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/OnlineVideoView$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (((double) f) >= 1.0d) {
                        OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                        SnsMethodCalculate.markStartTimeMs("access$3900", str);
                        boolean z = onlineVideoView3.f277148B1;
                        SnsMethodCalculate.markEndTimeMs("access$3900", str);
                        if (!z) {
                            OnlineVideoView.m121645n(OnlineVideoView.this).setVisibility(8);
                        }
                    }
                } else {
                    String str2 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView";
                    SnsMethodCalculate.markStartTimeMs("access$3800", str2);
                    RelativeLayout relativeLayout3 = onlineVideoView.f277228y;
                    SnsMethodCalculate.markEndTimeMs("access$3800", str2);
                    relativeLayout3.setVisibility(8);
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view3 = view;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/OnlineVideoView$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$4100", str2);
                    boolean z2 = onlineVideoView4.f277146A1;
                    SnsMethodCalculate.markEndTimeMs("access$4100", str2);
                    if (z2) {
                        OnlineVideoView.m121645n(OnlineVideoView.this).setVisibility(0);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$13");
            }
        });
        SnsMethodCalculate.markEndTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: Y */
    public final void mo132332Y(boolean z, float f) {
        float f2 = f;
        SnsMethodCalculate.markStartTimeMs("switchVideoModelSync", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "%d switch sync video model isVideoPlay %b %f", Integer.valueOf(hashCode()), Boolean.valueOf(z), Float.valueOf(f));
        View view = (View) this.f277145A;
        if (z) {
            this.f277228y.setAlpha(f2);
            this.f277228y.setVisibility(0);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (((double) f2) >= 1.0d && !this.f277148B1) {
                this.f277231z.setVisibility(8);
            }
        } else {
            this.f277228y.setVisibility(8);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view4 = view;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f277146A1) {
                this.f277231z.setVisibility(0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("switchVideoModelSync", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: Z */
    public final void mo132333Z() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("toggleVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (!this.f277191f) {
            C98408n0 n0Var = this.f277204n;
            str = n0Var != null ? n0Var.f288534B : C94867e2.m120287f(this.f277208p, this.f277206o);
        } else {
            str = this.f277195h;
        }
        Log.m105925i(this.f277187d, "%d toggleVideo local id %s finish path %s isPreview %b", Integer.valueOf(hashCode()), this.f277208p, str, Boolean.valueOf(this.f277191f));
        if (C86013q1.m106450k(str)) {
            Log.m105925i(this.f277187d, "%d sns video already download finish, play now", Integer.valueOf(hashCode()));
            if (this.f277145A instanceof ThumbPlayerVideoView) {
                if (!C86013q1.m106450k(str)) {
                    str = getRelocatedVideoPath();
                    String str3 = this.f277187d;
                    Log.m105928w(str3, "get relocated video path: " + str);
                }
                mo132332Y(true, 0.0f);
            } else {
                mo132331X(true, 0.0f);
            }
            mo132318H(str, false);
            final String str4 = this.f277187d;
            final C101804kv2 kv22 = this.f277206o;
            final String str5 = this.f277208p;
            final String str6 = this.f277211q;
            SnsMethodCalculate.markStartTimeMs("checkReportAdPathErr", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            if (!(kv22 == null || !kv22.f298681N || (str2 = kv22.f298689d) == null || str == null || str.contains(str2))) {
                C115669n.INSTANCE.mo175911u(1697, 40);
                Log.m105920e(str4, "toggleVideo, error ad videoPath,  mediaId = " + kv22.f298689d + ", media localId = " + kv22.f298701s + ", localId = " + str5 + ", realLocalId = " + str6 + ", path = " + str);
                ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
                    public void run() {
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$29");
                        try {
                            SnsInfo DN = C94866e1.Yx0().mo139798DN(str6);
                            boolean z = false;
                            if (DN == null || !DN.isAd()) {
                                String str = str4;
                                StringBuilder sb = new StringBuilder();
                                sb.append("toggleVideo, error ad videoPath, snsInfo==null?");
                                if (DN == null) {
                                    z = true;
                                }
                                sb.append(z);
                                Log.m105920e(str, sb.toString());
                                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$29");
                            }
                            String q0 = C102236a0.m134765q0(DN.field_snsId);
                            String aid = DN.getAid();
                            String str2 = str4;
                            Log.m105920e(str2, "toggleVideo, error ad videoPath,  snsId = " + q0 + ", aid = " + aid + ", mediaId = " + kv22.f298689d + ", media localId = " + kv22.f298701s + ", localId = " + str5 + ", realLocalId = " + str6);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(kv22.f298689d);
                            sb4.append("|");
                            sb4.append(aid);
                            C37817q.m41545a("online_video_path_err", q0, 0, 0, sb4.toString());
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$29");
                        } catch (Throwable th) {
                            String str3 = str4;
                            Log.m105920e(str3, "checkReportAdPathErr, exp=" + th.toString());
                        }
                    }
                });
            }
            SnsMethodCalculate.markEndTimeMs("checkReportAdPathErr", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            if (this.f277145A instanceof ThumbPlayerVideoView) {
                mo132332Y(false, 0.0f);
            } else {
                mo132331X(false, 0.0f);
            }
            mo132327S(false, 0, true);
            mo132326R();
        }
        SnsMethodCalculate.markEndTimeMs("toggleVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: a */
    public void mo132334a() {
        SnsMethodCalculate.markStartTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105924i(this.f277187d, "abandonAudioFocus: ");
        if (this.f277167Q != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(this.f277167Q);
        }
        this.f277167Q = null;
        SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: a0 */
    public void mo132335a0() {
        SnsMethodCalculate.markStartTimeMs("unRegSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105919d(this.f277187d, "%d unRegister sns ui event", Integer.valueOf(hashCode()));
        this.f277216s1.dead();
        SnsMethodCalculate.markEndTimeMs("unRegSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: b0 */
    public void mo132336b0(int i) {
        SnsMethodCalculate.markStartTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105919d(this.f277187d, "updateVideoUI: %d", Integer.valueOf(i));
        IVideoViewCallback iVideoViewCallback = this.f277225x;
        if (iVideoViewCallback != null) {
            iVideoViewCallback.mo132395a(i);
        }
        SnsMethodCalculate.markEndTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: f2 */
    public void mo23185f2() {
        SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public Context getActivityContext() {
        SnsMethodCalculate.markStartTimeMs("getActivityContext", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Activity activity = this.f277202l1;
        if (activity == null) {
            Context context = this.f277199j;
            SnsMethodCalculate.markEndTimeMs("getActivityContext", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return context;
        }
        SnsMethodCalculate.markEndTimeMs("getActivityContext", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return activity;
    }

    public int getBottomSafeHeight() {
        SnsMethodCalculate.markStartTimeMs("getBottomSafeHeight", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277178V0.getVisibility() == 0) {
            int h = this.f277150C1 + C76577a.m92157h(this.f277202l1, C0966R.dimen.f3750d1) + C76577a.m92157h(this.f277202l1, C0966R.dimen.f3736cp) + this.f277156F1;
            SnsMethodCalculate.markEndTimeMs("getBottomSafeHeight", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return h;
        }
        int i = this.f277150C1;
        if (i != 0) {
            int h2 = i + C76577a.m92157h(this.f277202l1, C0966R.dimen.f3736cp) + this.f277156F1;
            SnsMethodCalculate.markEndTimeMs("getBottomSafeHeight", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return h2;
        }
        SnsMethodCalculate.markEndTimeMs("getBottomSafeHeight", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return 0;
    }

    public int getCurrentPosition() {
        SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int currentPosition = this.f277145A.getCurrentPosition();
        SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return currentPosition;
    }

    public int getDuration() {
        SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        C96875r0 r0Var = this.f277145A;
        if (r0Var == null) {
            SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return 0;
        }
        int duration = r0Var.getDuration();
        SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return duration;
    }

    public String getFilePath() {
        SnsMethodCalculate.markStartTimeMs("getFilePath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        String str = this.f277226x0;
        SnsMethodCalculate.markEndTimeMs("getFilePath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public String getLocalId() {
        SnsMethodCalculate.markStartTimeMs("getLocalId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        String str = this.f277208p;
        SnsMethodCalculate.markEndTimeMs("getLocalId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public int getPlayErrorCode() {
        SnsMethodCalculate.markStartTimeMs("getPlayErrorCode", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i = this.f277166P;
        SnsMethodCalculate.markEndTimeMs("getPlayErrorCode", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    public int getPlayVideoDuration() {
        SnsMethodCalculate.markStartTimeMs("getPlayVideoDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277227x1 < 0) {
            this.f277227x1 = 0;
        }
        Log.m105925i(this.f277187d, "%d get play video duration [%d]", Integer.valueOf(hashCode()), Integer.valueOf(this.f277227x1));
        int i = this.f277227x1;
        SnsMethodCalculate.markEndTimeMs("getPlayVideoDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    public int getPlayVideoDurationByResume() {
        SnsMethodCalculate.markStartTimeMs("getPlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277232z1 < 0) {
            this.f277232z1 = 0;
        }
        Log.m105925i(this.f277187d, "%d get play video duration by resume [%d]", Integer.valueOf(hashCode()), Integer.valueOf(this.f277232z1));
        int i = this.f277232z1;
        SnsMethodCalculate.markEndTimeMs("getPlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    public View getRoot() {
        SnsMethodCalculate.markStartTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        RelativeLayout relativeLayout = this.f277228y;
        SnsMethodCalculate.markEndTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return relativeLayout;
    }

    public OnlineVideoViewHelper.VideoRptStruct getRptStruct() {
        SnsMethodCalculate.markStartTimeMs("getRptStruct", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        OnlineVideoViewHelper.VideoRptStruct videoRptStruct = new OnlineVideoViewHelper.VideoRptStruct();
        videoRptStruct.f277336c = this.f277175U;
        videoRptStruct.f277335b = this.f277179W;
        videoRptStruct.f277334a = this.f277177V;
        videoRptStruct.f277337d = this.f277209p0;
        videoRptStruct.f277339f = this.f277226x0;
        CdnLogic.VideoInfo videoInfo = this.f277198i1;
        if (videoInfo != null) {
            videoRptStruct.f277340g = videoInfo.requestFlag;
            videoRptStruct.f277341h = videoInfo.svrFlag;
        }
        videoRptStruct.f277342i = this.f277184a1 + "";
        videoRptStruct.f277343j = this.f277185b1 + "";
        SnsMethodCalculate.markEndTimeMs("getRptStruct", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return videoRptStruct;
    }

    public int getScene() {
        SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i = this.f277175U;
        SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    public String getSessionId() {
        SnsMethodCalculate.markStartTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        String str = this.f277179W;
        SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public long getSessionTimestamp() {
        SnsMethodCalculate.markStartTimeMs("getSessionTimestamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        long j = this.f277177V;
        SnsMethodCalculate.markEndTimeMs("getSessionTimestamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return j;
    }

    public String getSnsId() {
        SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        String str = this.f277209p0;
        SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getUiStayTime() {
        /*
            r10 = this;
            java.lang.String r0 = "getUiStayTime"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            long r2 = r10.f277165N
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0019
            long r7 = r10.f277164M
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0019
            long r2 = r2 - r7
            int r3 = (int) r2
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            if (r3 >= 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r6 = r3
        L_0x001e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.getUiStayTime():int");
    }

    public int getVideoVideoMoveMargin() {
        SnsMethodCalculate.markStartTimeMs("getVideoVideoMoveMargin", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i = this.f277154E1;
        SnsMethodCalculate.markEndTimeMs("getVideoVideoMoveMargin", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    public int getVideoViewBottom() {
        SnsMethodCalculate.markStartTimeMs("getVideoViewBottom", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i = this.f277152D1;
        SnsMethodCalculate.markEndTimeMs("getVideoViewBottom", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i;
    }

    public void onCompletion() {
        SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "%d on completion", Integer.valueOf(hashCode()));
        IVideoViewCallback iVideoViewCallback = this.f277225x;
        if (iVideoViewCallback == null) {
            SnsMethodCalculate.markStartTimeMs("dealCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            if (C11171e.m11045b(18) || !this.f277159H) {
                mo132322N(0, true);
            } else {
                C96875r0 r0Var = this.f277145A;
                if (r0Var != null) {
                    String videoPath = r0Var.getVideoPath();
                    this.f277145A.stop();
                    if (!C86013q1.m106450k(videoPath)) {
                        String relocatedVideoPath = getRelocatedVideoPath();
                        Log.m105929w(this.f277187d, "dealCompletion: file path is out of date, old path: %s, new path: %s", videoPath, relocatedVideoPath);
                        if (Util.isNullOrNil(relocatedVideoPath)) {
                            Log.m105920e(this.f277187d, "dealCompletion: invalid file");
                            SnsMethodCalculate.markEndTimeMs("dealCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        } else {
                            videoPath = relocatedVideoPath;
                        }
                    }
                    mo132318H(videoPath, this.f277157G);
                }
            }
            SnsMethodCalculate.markEndTimeMs("dealCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            iVideoViewCallback.onCompletion();
        }
        HeroSeekBarView heroSeekBarView = this.f277178V0;
        if (heroSeekBarView != null) {
            C53895h.m60466d(heroSeekBarView.f283696t, (C66212f) null, (C53934p0) null, new C92258b(heroSeekBarView, (C15601d<? super C92258b>) null), 3, (Object) null);
            Log.m105924i("MicroMsg.HeroSeekBarView", "reset");
        }
        this.f277182Y0 = false;
        SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void onError(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105921e(this.f277187d, "%d on play video error what %d extra %d. isOnlinePlay %b isMMVideoPlayer[%b]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f277157G), Boolean.valueOf(this.f277159H));
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_video_tp_error_repair, true);
        if (i3 == 11022003 && i4 == 1102 && wf) {
            C98408n0 n0Var = this.f277204n;
            String str = n0Var != null ? n0Var.f288533A : "";
            Log.m105925i(this.f277187d, "play error and try repair，localId:%s videoFlag:%s", this.f277208p, str);
            C98408n0 h = C94867e2.m120289h(this.f277208p, str);
            if (h != null) {
                h.f288562i = 130;
                Log.m105925i(this.f277187d, "play error and try repair ret:%b info:%s", Boolean.valueOf(C98398h0.Bx0().mo137733w(h)), h);
            }
        }
        boolean z = this.f277157G;
        SnsMethodCalculate.markStartTimeMs("rptMediaPlayerError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (z) {
            C115669n.INSTANCE.idkeyStat(354, 230, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(354, 231, 1, false);
        }
        SnsMethodCalculate.markEndTimeMs("rptMediaPlayerError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277166P = i4;
        mo132373z();
        final String videoPath = this.f277145A.getVideoPath();
        this.f277162K = this.f277145A.getCurrentPosition() / 1000;
        if (this.f277157G) {
            if (i3 == -2) {
                this.f277145A.stop();
            } else if (i3 == -3) {
                this.f277163L = i3;
                this.f277145A.pause();
            } else {
                mo132356s();
                this.f277145A.stop();
            }
            try {
                mo132326R();
                if (this.f277155F != null) {
                    this.f277155F.mo132414m();
                }
                C97787h hVar = this.f277172S0;
                if (hVar != null) {
                    hVar.mo134532e();
                }
                mo132373z();
            } catch (Exception unused) {
            }
        } else {
            this.f277145A.stop();
            this.f277193g = true;
            if (this.f277145A instanceof ThumbPlayerVideoView) {
                mo132332Y(false, 0.0f);
            } else {
                mo132331X(false, 0.0f);
            }
            Log.m105929w(this.f277187d, "error %s, %s", Boolean.valueOf(this.f277203m1), videoPath);
            if (!Util.isNullOrNil(videoPath) && this.f277203m1 && C86013q1.m106450k(videoPath)) {
                Log.m105929w(this.f277187d, "%d start third player to play", Integer.valueOf(hashCode()));
                this.f277173T.post(new Runnable() {
                    public void run() {
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$26");
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        FileProviderHelper.setIntentDataAndType(OnlineVideoView.this.getContext(), intent, new C86009m1(videoPath), "video/*", false);
                        try {
                            Context context = OnlineVideoView.this.getContext();
                            C9556a aVar = new C9556a();
                            aVar.mo10233c(intent);
                            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView$26", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((Intent) aVar.mo10231a(0));
                            C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/OnlineVideoView$26", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } catch (Exception unused) {
                            Log.m105920e(OnlineVideoView.m121633b(OnlineVideoView.this), "startActivity fail, activity not found");
                            C77426q qVar = new C77426q(OnlineVideoView.this.getContext());
                            qVar.mo107595g(OnlineVideoView.this.getContext().getString(C0966R.string.cpc));
                            qVar.mo107606r(OnlineVideoView.this.getContext().getString(C0966R.string.cpd));
                            qVar.mo107590b(new C47883u(this) {
                                /* renamed from: a */
                                public void mo353a(boolean z, String str) {
                                    SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$26$1");
                                    SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$26$1");
                                }
                            });
                            qVar.mo107603o();
                        } catch (Throwable unused2) {
                            Log.m105920e(OnlineVideoView.m121633b(OnlineVideoView.this), "showAlert fail");
                        }
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$26");
                    }
                });
            } else if (videoPath != null && !C86013q1.m106450k(videoPath)) {
                String relocatedVideoPath = getRelocatedVideoPath();
                Log.m105929w(this.f277187d, "onError: file path is out of date, old path: %s, new path: %s", videoPath, relocatedVideoPath);
                if (Util.isNullOrNil(relocatedVideoPath) || relocatedVideoPath.equals(videoPath)) {
                    Log.m105920e(this.f277187d, "onError: invalid file");
                    SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    return;
                }
                mo132318H(relocatedVideoPath, this.f277157G);
            }
        }
        C101804kv2 kv22 = this.f277206o;
        if (kv22 != null && kv22.f298681N) {
            C115669n.INSTANCE.mo175911u(1579, 8);
        }
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void onPrepared() {
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "%d onPrepared playErrorCode[%d] onErrorPlayTimeSec[%d] allowStart[%s]", Integer.valueOf(hashCode()), Integer.valueOf(this.f277166P), Integer.valueOf(this.f277162K), Boolean.toString(this.f277170R0));
        this.f277166P = 0;
        C96875r0 r0Var = this.f277145A;
        if (r0Var instanceof ThumbPlayerVideoView) {
            r0Var.setOneTimeVideoTextureUpdateCallback(this.f277220u1);
            mo132332Y(true, 0.0f);
            C92320h hVar = this.f277176U0;
            if (hVar != null) {
                SnsMethodCalculate.markStartTimeMs("stopProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "stopProgressMonitor");
                C53973z1 z1Var = hVar.f264176d;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                hVar.f264176d = null;
                SnsMethodCalculate.markEndTimeMs("stopProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            }
        }
        if (this.f277170R0) {
            int i = this.f277162K;
            if (i > 0) {
                mo132322N(i, true);
                this.f277162K = 0;
            } else {
                SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                this.f277163L = 0;
                mo132369v();
                mo132314B();
                mo132315C();
                this.f277145A.start();
                this.f277161J = this.f277145A.getDuration() / 1000;
                this.f277178V0.setTotalTimeMs((long) this.f277145A.getDuration());
                Log.m105925i(this.f277187d, "%d start play duration %d sns local id %s ", Integer.valueOf(hashCode()), Integer.valueOf(this.f277161J), this.f277208p);
                mo132329U(false);
                IVideoViewCallback iVideoViewCallback = this.f277225x;
                if (iVideoViewCallback != null) {
                    iVideoViewCallback.mo132396b(this.f277161J);
                }
                SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
        }
        this.f277182Y0 = false;
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "onGetVideoSize width:%d height:%d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f277229y0 = i;
        this.f277168Q0 = i2;
        SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: r */
    public void mo132355r(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("addVideoViewBottomMargin", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105925i(this.f277187d, "addVideoViewBottomMargin: %d", Integer.valueOf(i));
        if (z) {
            this.f277156F1 = i;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f277178V0.getLayoutParams();
            layoutParams.addRule(12);
            layoutParams.bottomMargin = i + C76577a.m92157h(this.f277202l1, C0966R.dimen.f3736cp);
            this.f277178V0.setLayoutParams(layoutParams);
        } else {
            this.f277150C1 += i;
        }
        SnsMethodCalculate.markEndTimeMs("addVideoViewBottomMargin", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: s */
    public void mo132356s() {
        SnsMethodCalculate.markStartTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277145A instanceof ThumbPlayerVideoView) {
            SnsMethodCalculate.markEndTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        this.f277207o1.stopTimer();
        this.f277210p1.stopTimer();
        SnsMethodCalculate.markEndTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setFilePath(String str) {
        SnsMethodCalculate.markStartTimeMs("setFilePath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277226x0 = str;
        SnsMethodCalculate.markEndTimeMs("setFilePath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setMute(boolean z) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277197i = z;
        C34767b.C34768c cVar = this.f277167Q;
        boolean z3 = false;
        if (cVar == null || cVar.mo34198a()) {
            z2 = true;
        } else {
            Log.m105924i(this.f277187d, "setMute: not gain focus");
            z2 = false;
        }
        C96875r0 r0Var = this.f277145A;
        if (!z2 || this.f277197i) {
            z3 = true;
        }
        r0Var.setMute(z3);
        SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setScene(int i) {
        SnsMethodCalculate.markStartTimeMs("setScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277175U = i;
        SnsMethodCalculate.markEndTimeMs("setScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSessionId(String str) {
        SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277179W = str;
        SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSessionTimestamp(long j) {
        SnsMethodCalculate.markStartTimeMs("setSessionTimestamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277177V = j;
        SnsMethodCalculate.markEndTimeMs("setSessionTimestamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSnsId(String str) {
        SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277209p0 = str;
        SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setThumbViewScaleType(ImageView.ScaleType scaleType) {
        SnsMethodCalculate.markStartTimeMs("setThumbViewScaleType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277231z.setScaleType(scaleType);
        SnsMethodCalculate.markEndTimeMs("setThumbViewScaleType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setThumbViewVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setThumbViewVisibility", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277231z.setVisibility(i);
        SnsMethodCalculate.markEndTimeMs("setThumbViewVisibility", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setVideoCallback(IVideoViewCallback iVideoViewCallback) {
        SnsMethodCalculate.markStartTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277225x = iVideoViewCallback;
        SnsMethodCalculate.markEndTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setVideoScaleType(C96814a.C96817e eVar) {
        SnsMethodCalculate.markStartTimeMs("setVideoScaleType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        C96875r0 r0Var = this.f277145A;
        if (r0Var != null) {
            if (r0Var instanceof VideoPlayerTextureView) {
                ((VideoPlayerTextureView) r0Var).setScaleType(eVar);
            } else if (r0Var instanceof VideoTextureView) {
                ((VideoTextureView) r0Var).setScaleType(eVar);
            } else if (r0Var instanceof ThumbPlayerVideoView) {
                ((ThumbPlayerVideoView) r0Var).setScaleType(eVar);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setVideoScaleType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setWindowType(int i) {
        SnsMethodCalculate.markStartTimeMs("setWindowType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277186c1 = i;
        C99294s sVar = this.f277200j1;
        if (sVar != null) {
            sVar.f291171a.f266323R = i;
        }
        SnsMethodCalculate.markEndTimeMs("setWindowType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: t */
    public boolean mo132368t() {
        SnsMethodCalculate.markStartTimeMs("hasError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        boolean z = this.f277193g;
        SnsMethodCalculate.markEndTimeMs("hasError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return z;
    }

    /* renamed from: v */
    public final void mo132369v() {
        SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        Log.m105924i(this.f277187d, "hideLoading()");
        this.f277153E.setImageBitmap((Bitmap) null);
        this.f277153E.setVisibility(8);
        this.f277173T.removeCallbacks(this.f277205n1);
        this.f277173T.post(new Runnable() {
            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$16");
                if (!(OnlineVideoView.m121640i(OnlineVideoView.this) == null || OnlineVideoView.m121640i(OnlineVideoView.this).getVisibility() == 8)) {
                    Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d hide loading.", Integer.valueOf(OnlineVideoView.this.hashCode()));
                    OnlineVideoView.m121640i(OnlineVideoView.this).setVisibility(8);
                }
                if (!(OnlineVideoView.m121641j(OnlineVideoView.this) == null || OnlineVideoView.m121641j(OnlineVideoView.this).getVisibility() == 8)) {
                    Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d hide progress.", Integer.valueOf(OnlineVideoView.this.hashCode()));
                    OnlineVideoView.m121641j(OnlineVideoView.this).setVisibility(8);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$16");
            }
        });
        SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: w */
    public void mo132370w() {
        SnsMethodCalculate.markStartTimeMs("hideSeekBar", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277178V0.setVisibility(4);
        this.f277180W0.setVisibility(4);
        SnsMethodCalculate.markEndTimeMs("hideSeekBar", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: x */
    public boolean mo132371x() {
        SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        boolean isPlaying = this.f277145A.isPlaying();
        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return isPlaying;
    }

    /* renamed from: y */
    public void mo132372y(boolean z) {
        SnsMethodCalculate.markStartTimeMs("needAutoAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277171S = z;
        SnsMethodCalculate.markEndTimeMs("needAutoAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: z */
    public final void mo132373z() {
        SnsMethodCalculate.markStartTimeMs("notePauseVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f277224w1 > 0) {
            this.f277227x1 = (int) (((long) this.f277227x1) + ((Util.nowMilliSecond() - this.f277224w1) / 1000));
        }
        Log.m105925i(this.f277187d, "%d notePauseVideo playVideoDuration %d ", Integer.valueOf(hashCode()), Integer.valueOf(this.f277227x1));
        this.f277224w1 = 0;
        SnsMethodCalculate.markEndTimeMs("notePauseVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnlineVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        final Context context2 = context;
        Class cls = C32735h.class;
        String str = "MicroMsg.OnlineVideoView[" + hashCode() + ']';
        this.f277187d = str;
        this.f277189e = 0;
        this.f277191f = false;
        this.f277193g = false;
        this.f277197i = false;
        this.f277206o = null;
        this.f277223w = false;
        this.f277155F = null;
        this.f277160I = false;
        this.f277161J = 0;
        this.f277162K = 0;
        this.f277163L = 0;
        this.f277164M = 0;
        this.f277165N = 0;
        this.f277166P = 0;
        this.f277171S = true;
        this.f277173T = new MMHandler(Looper.getMainLooper());
        this.f277175U = 0;
        this.f277177V = 0;
        this.f277179W = "";
        this.f277209p0 = "";
        this.f277226x0 = "";
        this.f277229y0 = 0;
        this.f277168Q0 = 0;
        this.f277170R0 = true;
        this.f277182Y0 = false;
        this.f277183Z0 = "";
        this.f277184a1 = 0;
        this.f277185b1 = 0;
        this.f277186c1 = -1;
        C86709a0.m107528h();
        this.f277188d1 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0)).intValue() == 1;
        this.f277190e1 = false;
        this.f277192f1 = new DelaySeekTask((C953621) null);
        this.f277194g1 = false;
        this.f277196h1 = false;
        this.f277203m1 = false;
        this.f277205n1 = new Runnable() {
            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$15");
                Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d show loading. downloadMode %d", Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(OnlineVideoView.m121646o(OnlineVideoView.this)));
                if (OnlineVideoView.m121646o(OnlineVideoView.this) == 1) {
                    if (!(OnlineVideoView.m121640i(OnlineVideoView.this) == null || OnlineVideoView.m121640i(OnlineVideoView.this).getVisibility() == 0)) {
                        OnlineVideoView.m121640i(OnlineVideoView.this).setVisibility(0);
                    }
                    if (!(OnlineVideoView.m121641j(OnlineVideoView.this) == null || OnlineVideoView.m121641j(OnlineVideoView.this).getVisibility() == 8)) {
                        OnlineVideoView.m121641j(OnlineVideoView.this).setVisibility(8);
                    }
                }
                if (OnlineVideoView.m121646o(OnlineVideoView.this) == 2) {
                    if (!(OnlineVideoView.m121641j(OnlineVideoView.this) == null || OnlineVideoView.m121641j(OnlineVideoView.this).getVisibility() == 0)) {
                        OnlineVideoView.m121641j(OnlineVideoView.this).setVisibility(0);
                    }
                    if (!(OnlineVideoView.m121640i(OnlineVideoView.this) == null || OnlineVideoView.m121640i(OnlineVideoView.this).getVisibility() == 8)) {
                        OnlineVideoView.m121640i(OnlineVideoView.this).setVisibility(8);
                    }
                }
                if (OnlineVideoView.m121646o(OnlineVideoView.this) == 3) {
                    if (!(OnlineVideoView.m121641j(OnlineVideoView.this) == null || OnlineVideoView.m121641j(OnlineVideoView.this).getVisibility() == 0)) {
                        OnlineVideoView.m121641j(OnlineVideoView.this).setVisibility(0);
                        OnlineVideoView.m121641j(OnlineVideoView.this).mo153891a();
                    }
                    if (!(OnlineVideoView.m121640i(OnlineVideoView.this) == null || OnlineVideoView.m121640i(OnlineVideoView.this).getVisibility() == 8)) {
                        OnlineVideoView.m121640i(OnlineVideoView.this).setVisibility(8);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$15");
            }
        };
        this.f277207o1 = new MTimerHandler(new MTimerHandler.CallBack() {
            public boolean onTimerExpired() {
                C96875r0 r0Var;
                SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                if (OnlineVideoView.this.f277155F == null || (r0Var = OnlineVideoView.this.f277145A) == null) {
                    SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                    return false;
                }
                if (((View) r0Var).getAlpha() < 1.0f) {
                    Log.m105924i(OnlineVideoView.m121633b(OnlineVideoView.this), "onlineVideoTimer switchVideoModel");
                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView.mo132331X(true, 1.0f);
                    SnsMethodCalculate.markEndTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                }
                if (OnlineVideoView.this.f277145A.isPlaying()) {
                    OnlineVideoView.m121643l(OnlineVideoView.this);
                }
                try {
                    OnlineVideoViewHelper onlineVideoViewHelper = OnlineVideoView.this.f277155F;
                    onlineVideoViewHelper.getClass();
                    SnsMethodCalculate.markStartTimeMs("isStreaming", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    boolean z = !Util.isNullOrNil(onlineVideoViewHelper.f277313k);
                    SnsMethodCalculate.markEndTimeMs("isStreaming", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    if (!z) {
                        SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                        return false;
                    }
                    int currentPosition = OnlineVideoView.this.f277145A.getCurrentPosition();
                    OnlineVideoView.this.mo132336b0(currentPosition);
                    boolean c = OnlineVideoView.this.f277155F.mo132404c(currentPosition / 1000);
                    SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                    return c;
                } catch (Exception e) {
                    Log.m105920e(OnlineVideoView.m121633b(OnlineVideoView.this), "online video timer check error : " + e.toString());
                    SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                    return false;
                }
            }
        }, true);
        this.f277210p1 = new MTimerHandler(new MTimerHandler.CallBack() {
            public boolean onTimerExpired() {
                SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                C96875r0 r0Var = OnlineVideoView.this.f277145A;
                if (r0Var == null) {
                    SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                    return false;
                }
                if (((View) r0Var).getAlpha() < 1.0f) {
                    Log.m105924i(OnlineVideoView.m121633b(OnlineVideoView.this), "offlineVideoTimer switchVideoModel");
                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView.mo132331X(true, 1.0f);
                    SnsMethodCalculate.markEndTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                }
                if (OnlineVideoView.this.f277145A.isPlaying()) {
                    OnlineVideoView.m121643l(OnlineVideoView.this);
                    OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                    onlineVideoView2.mo132336b0(onlineVideoView2.f277145A.getCurrentPosition());
                }
                SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                return true;
            }
        }, true);
        this.f277212q1 = new C94853e.C94861h() {
            public void onImageFinish(String str, boolean z) {
                SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
            }

            public void onSetbg() {
                SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
            }

            public void onSightFinish(final String str, final boolean z) {
                SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                OnlineVideoView.m121635d(OnlineVideoView.this).postDelayed(new Runnable() {
                    public void run() {
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20$1");
                        Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d weixin download finish[%b], go to prepare video", Integer.valueOf(OnlineVideoView.this.hashCode()), Boolean.valueOf(z));
                        if (OnlineVideoView.m121648q(OnlineVideoView.this) != null && z && Util.isEqual(OnlineVideoView.m121648q(OnlineVideoView.this).f298689d, str)) {
                            C94867e2.m120302u(OnlineVideoView.m121642k(OnlineVideoView.this), "");
                            String f = C94867e2.m120287f(OnlineVideoView.m121642k(OnlineVideoView.this), OnlineVideoView.m121648q(OnlineVideoView.this));
                            if (!Util.isNullOrNil(f)) {
                                OnlineVideoView.this.mo132318H(f, false);
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20$1");
                    }
                }, 100);
                SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
            }

            public void onThumbFinish(String str) {
                SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
            }
        };
        C40008f fVar = C40008f.f107254d;
        this.f277214r1 = new IListener<SnsVideoMenuEvent>(fVar) {
            {
                this.__eventId = 413312424;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                SnsVideoMenuEvent snsVideoMenuEvent = (SnsVideoMenuEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d sns video menu event local id[%s, %s], enable:%s", Integer.valueOf(OnlineVideoView.this.hashCode()), snsVideoMenuEvent.f265214d.f265218d, OnlineVideoView.m121642k(OnlineVideoView.this), Boolean.valueOf(OnlineVideoView.this.f277203m1));
                if (Util.isEqual(snsVideoMenuEvent.f265214d.f265218d, OnlineVideoView.m121642k(OnlineVideoView.this))) {
                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                    if (onlineVideoView.f277203m1) {
                        SnsVideoMenuEvent.C92599a aVar = snsVideoMenuEvent.f265214d;
                        int i = aVar.f265215a;
                        if (i == 1) {
                            OnlineVideoView.m121647p(onlineVideoView, aVar.f265219e);
                            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                        } else if (i == 2) {
                            int i2 = aVar.f265216b;
                            boolean z = aVar.f265217c;
                            SnsMethodCalculate.markStartTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            SnsMethodCalculate.markStartTimeMs("handleFavVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            if (onlineVideoView.f277219u > 0) {
                                Log.m105928w(onlineVideoView.f277187d, "fav video now, do nothing.");
                                SnsMethodCalculate.markEndTimeMs("handleFavVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            } else {
                                String m = C94867e2.m120294m(onlineVideoView.f277208p, onlineVideoView.f277206o);
                                Log.m105925i(onlineVideoView.f277187d, "%d fav video req code %d fromMain %b, download finish path %s", Integer.valueOf(onlineVideoView.hashCode()), Integer.valueOf(i2), Boolean.valueOf(z), m);
                                if (!Util.isNullOrNil(m)) {
                                    SnsMethodCalculate.markStartTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView.f277173T.post(new Runnable(i2, z) {

                                        /* renamed from: d */
                                        public final /* synthetic */ int f277234d;

                                        /* renamed from: e */
                                        public final /* synthetic */ boolean f277235e;

                                        {
                                            this.f277234d = r2;
                                            this.f277235e = r3;
                                        }

                                        public void run() {
                                            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                            C100400e0 Yx0 = C94866e1.Yx0();
                                            OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                            int i = OnlineVideoView.f277144H1;
                                            SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            String str = onlineVideoView.f277211q;
                                            SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            SnsInfo DN = Yx0.mo139798DN(str);
                                            if (DN == null) {
                                                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                return;
                                            }
                                            Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "fav download video[%s] farFromScene %d isFromMain %b", OnlineVideoView.m121642k(OnlineVideoView.this), Integer.valueOf(this.f277234d), Boolean.valueOf(this.f277235e));
                                            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                                            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                                            aVar.f264688m = this.f277234d;
                                            aVar.f264684i = (Activity) OnlineVideoView.this.getActivityContext();
                                            C97707a.m126006d(doFavoriteEvent, DN);
                                            doFavoriteEvent.publish();
                                            if (doFavoriteEvent.f264675e.f9046a == 0) {
                                                OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                                SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                onlineVideoView2.getClass();
                                                SnsMethodCalculate.markStartTimeMs("rptFavVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                C115669n.INSTANCE.idkeyStat(354, 225, 1, false);
                                                SnsMethodCalculate.markEndTimeMs("rptFavVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            } else {
                                                OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                                SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                onlineVideoView3.getClass();
                                                SnsMethodCalculate.markStartTimeMs("rptFavVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                C115669n.INSTANCE.idkeyStat(354, 226, 1, false);
                                                SnsMethodCalculate.markEndTimeMs("rptFavVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            }
                                            if (this.f277235e) {
                                                SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent = new SnsFavFeedForDataReportEvent();
                                                snsFavFeedForDataReportEvent.f265135d.f265137b = DN.getLocalid();
                                                snsFavFeedForDataReportEvent.f265135d.f265136a = C102236a0.m134728W(DN);
                                                snsFavFeedForDataReportEvent.publish();
                                            }
                                            OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                                            SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView4.f277219u = 0;
                                            SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            C96875r0 r0Var = OnlineVideoView.this.f277145A;
                                            if (r0Var != null) {
                                                if (Util.isNullOrNil(r0Var.getVideoPath())) {
                                                    Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d had not set video path to play", Integer.valueOf(OnlineVideoView.this.hashCode()));
                                                    String m = C94867e2.m120294m(OnlineVideoView.m121642k(OnlineVideoView.this), OnlineVideoView.m121648q(OnlineVideoView.this));
                                                    if (!Util.isNullOrNil(m)) {
                                                        OnlineVideoView.this.mo132318H(m, false);
                                                    }
                                                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                    return;
                                                } else if (!OnlineVideoView.this.f277145A.isPlaying()) {
                                                    OnlineVideoView.this.f277145A.start();
                                                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                    return;
                                                }
                                            }
                                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                        }
                                    });
                                    SnsMethodCalculate.markEndTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                } else {
                                    onlineVideoView.f277219u = i2;
                                    onlineVideoView.f277221v = z;
                                    onlineVideoView.mo132327S(true, 35, true);
                                    onlineVideoView.mo132326R();
                                    SnsMethodCalculate.markStartTimeMs("rptDownloadByFavVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    C115669n.INSTANCE.idkeyStat(354, 224, 1, false);
                                    SnsMethodCalculate.markEndTimeMs("rptDownloadByFavVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                }
                                SnsMethodCalculate.markEndTimeMs("handleFavVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            }
                            SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                        } else {
                            if (i == 3) {
                                SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                SnsMethodCalculate.markStartTimeMs("handleSaveVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                String m2 = C94867e2.m120294m(onlineVideoView.f277208p, onlineVideoView.f277206o);
                                Log.m105925i(onlineVideoView.f277187d, "%d save video, download finish path %s", Integer.valueOf(onlineVideoView.hashCode()), m2);
                                if (!Util.isNullOrNil(m2)) {
                                    onlineVideoView.mo132321L();
                                } else {
                                    onlineVideoView.f277223w = true;
                                    onlineVideoView.mo132327S(true, 34, true);
                                    onlineVideoView.mo132326R();
                                    SnsMethodCalculate.markStartTimeMs("rptDownloadBySaveVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    C115669n.INSTANCE.idkeyStat(354, 220, 1, false);
                                    SnsMethodCalculate.markEndTimeMs("rptDownloadBySaveVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                }
                                SnsMethodCalculate.markEndTimeMs("handleSaveVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            }
                            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                        }
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                        return false;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                return false;
            }
        };
        this.f277216s1 = new IListener<SnsFlipUIEvent>(fVar) {
            {
                this.__eventId = -1879000847;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22");
                final SnsFlipUIEvent snsFlipUIEvent = (SnsFlipUIEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22");
                String b = OnlineVideoView.m121633b(OnlineVideoView.this);
                OnlineVideoView onlineVideoView = OnlineVideoView.this;
                SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                boolean z = onlineVideoView.f277160I;
                SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                Log.m105925i(b, "%d sns flip ui event. local id[%s, %s] opcode %d hadUiEvent %b", Integer.valueOf(OnlineVideoView.this.hashCode()), snsFlipUIEvent.f265148d.f265151c, OnlineVideoView.m121642k(OnlineVideoView.this), Integer.valueOf(snsFlipUIEvent.f265148d.f265150b), Boolean.valueOf(z));
                SnsFlipUIEvent.C92577a aVar = snsFlipUIEvent.f265148d;
                int i = aVar.f265150b;
                if (i == 2) {
                    Context context = aVar.f265149a;
                    if (context != null) {
                        OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                        SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        Context context2 = onlineVideoView2.f277199j;
                        SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        if (context == context2) {
                            OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                            SnsMethodCalculate.markStartTimeMs("access$4802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView3.f277160I = false;
                            SnsMethodCalculate.markEndTimeMs("access$4802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            OnlineVideoView.this.mo132335a0();
                            OnlineVideoView.this.mo130402D();
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22");
                } else {
                    if (i == 1) {
                        OnlineVideoView.m121635d(OnlineVideoView.this).post(new Runnable() {
                            public void run() {
                                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22$1");
                                if (Util.isEqual(snsFlipUIEvent.f265148d.f265151c, OnlineVideoView.m121642k(OnlineVideoView.this))) {
                                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                    SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z = onlineVideoView.f277160I;
                                    SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    if (!z) {
                                        OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$4802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView2.f277160I = true;
                                        SnsMethodCalculate.markEndTimeMs("access$4802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        OnlineVideoView.this.mo130403E();
                                    } else {
                                        OnlineVideoView.this.requestLayout();
                                    }
                                } else {
                                    OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                    SnsMethodCalculate.markStartTimeMs("access$4802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView3.f277160I = false;
                                    SnsMethodCalculate.markEndTimeMs("access$4802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    OnlineVideoView.this.mo132335a0();
                                    OnlineVideoView.this.mo130402D();
                                }
                                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22$1");
                            }
                        });
                    }
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22");
                return false;
            }
        };
        this.f277218t1 = new IListener<OnlineVideoEvent>(fVar) {
            {
                this.__eventId = -2133747774;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                OnlineVideoEvent onlineVideoEvent = (OnlineVideoEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                if (OnlineVideoView.this.f277155F == null) {
                    Log.m105929w(OnlineVideoView.m121633b(OnlineVideoView.this), "%d online video helper is null.", Integer.valueOf(OnlineVideoView.this.hashCode()));
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                } else {
                    String b = OnlineVideoView.m121633b(OnlineVideoView.this);
                    Log.m105928w(b, "OnlineVideoEvent is received, the OnlineVideoEvent opcode is " + onlineVideoEvent.f264965d.f264966a);
                    String b2 = OnlineVideoView.m121633b(OnlineVideoView.this);
                    Log.m105928w(b2, "OnlineVideoEvent is received, the OnlineVideoEvent length is " + onlineVideoEvent.f264965d.f264970e);
                    String b3 = OnlineVideoView.m121633b(OnlineVideoView.this);
                    Log.m105928w(b3, "OnlineVideoEvent is received, the OnlineVideoEvent offset is " + onlineVideoEvent.f264965d.f264969d);
                    String b4 = OnlineVideoView.m121633b(OnlineVideoView.this);
                    Log.m105928w(b4, "OnlineVideoEvent is received, the OnlineVideoEvent mediaId is " + onlineVideoEvent.f264965d.f264968c);
                    String b5 = OnlineVideoView.m121633b(OnlineVideoView.this);
                    Log.m105928w(b5, "OnlineVideoEvent is received, the OnlineVideoEvent retCode is " + onlineVideoEvent.f264965d.f264967b);
                    String b6 = OnlineVideoView.m121633b(OnlineVideoView.this);
                    Log.m105928w(b6, "OnlineVideoEvent is received, the OnlineVideoEvent startDownload is " + onlineVideoEvent.f264965d.f264971f);
                    try {
                        if (!OnlineVideoView.this.f277155F.mo132403b(onlineVideoEvent.f264965d.f264968c)) {
                            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                        } else {
                            OnlineVideoEvent.C92538a aVar = onlineVideoEvent.f264965d;
                            int i = aVar.f264967b;
                            if (i == -21112) {
                                OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                onlineVideoView.getClass();
                                SnsMethodCalculate.markStartTimeMs("dealSnsVideoChange", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                SnsMethodCalculate.markStartTimeMs("rptSnsVideoChange", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                C115669n.INSTANCE.idkeyStat(354, 218, 1, false);
                                SnsMethodCalculate.markEndTimeMs("rptSnsVideoChange", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                onlineVideoView.f277173T.post(new Runnable() {
                                    public void run() {
                                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$27");
                                        String b = OnlineVideoView.m121633b(OnlineVideoView.this);
                                        OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        boolean z = onlineVideoView.f277157G;
                                        SnsMethodCalculate.markEndTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        Log.m105929w(b, "%d deal sns video change isOnlinePlay[%b]", Integer.valueOf(OnlineVideoView.this.hashCode()), Boolean.valueOf(z));
                                        OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        boolean z2 = onlineVideoView2.f277157G;
                                        SnsMethodCalculate.markEndTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        if (z2) {
                                            OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                            SnsMethodCalculate.markStartTimeMs("access$5200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView3.mo132373z();
                                            SnsMethodCalculate.markEndTimeMs("access$5200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            OnlineVideoView.this.f277145A.stop();
                                            OnlineVideoView.this.mo132356s();
                                            String n = C94867e2.m120295n(OnlineVideoView.m121648q(OnlineVideoView.this));
                                            boolean h = C86013q1.m106447h(n);
                                            if (OnlineVideoView.this.f277155F != null) {
                                                OnlineVideoView.this.f277155F.mo132418q();
                                                OnlineVideoView.this.f277155F.mo132405d();
                                                OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                                                onlineVideoView4.f277155F = new OnlineVideoViewHelper(onlineVideoView4);
                                            }
                                            C97787h hVar = OnlineVideoView.this.f277172S0;
                                            if (hVar != null) {
                                                ((CdnVideoResourceDownloader) hVar).stop();
                                                OnlineVideoView.this.f277172S0 = null;
                                            }
                                            Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d delete video file[%b] [%s]", Integer.valueOf(OnlineVideoView.this.hashCode()), Boolean.valueOf(h), n);
                                            OnlineVideoView onlineVideoView5 = OnlineVideoView.this;
                                            SnsMethodCalculate.markStartTimeMs("access$5302", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView5.f277163L = 0;
                                            SnsMethodCalculate.markEndTimeMs("access$5302", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            OnlineVideoView onlineVideoView6 = OnlineVideoView.this;
                                            SnsMethodCalculate.markStartTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView6.mo132333Z();
                                            SnsMethodCalculate.markEndTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        }
                                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$27");
                                    }
                                });
                                SnsMethodCalculate.markEndTimeMs("dealSnsVideoChange", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                            } else if (i == 0 || i == -21006) {
                                switch (aVar.f264966a) {
                                    case 1:
                                        OnlineVideoViewHelper onlineVideoViewHelper = OnlineVideoView.this.f277155F;
                                        OnlineVideoEvent.C92538a aVar2 = onlineVideoEvent.f264965d;
                                        onlineVideoViewHelper.mo132408g((long) aVar2.f264969d, aVar2.f264971f, aVar2.f264972g);
                                        OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                        SnsMethodCalculate.markStartTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView2.f277157G = true;
                                        SnsMethodCalculate.markEndTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        break;
                                    case 2:
                                        OnlineVideoViewHelper onlineVideoViewHelper2 = OnlineVideoView.this.f277155F;
                                        OnlineVideoEvent.C92538a aVar3 = onlineVideoEvent.f264965d;
                                        onlineVideoViewHelper2.mo132407f(aVar3.f264968c, aVar3.f264969d, aVar3.f264970e);
                                        if (onlineVideoEvent.f264965d.f264970e > 0) {
                                            OnlineVideoView.this.mo132329U(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        OnlineVideoView.this.mo132329U(true);
                                        break;
                                    case 4:
                                        Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d download finish. cdnMediaId %s sendReqCode %d favFromScene %d", Integer.valueOf(OnlineVideoView.this.hashCode()), onlineVideoEvent.f264965d.f264968c, Integer.valueOf(OnlineVideoView.m121637f(OnlineVideoView.this)), Integer.valueOf(OnlineVideoView.m121638g(OnlineVideoView.this)));
                                        OnlineVideoView.this.f277155F.mo132410i();
                                        if (OnlineVideoView.m121637f(OnlineVideoView.this) <= 0) {
                                            if (OnlineVideoView.m121638g(OnlineVideoView.this) <= 0) {
                                                OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                boolean z = onlineVideoView3.f277223w;
                                                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                if (!z) {
                                                    OnlineVideoView.this.mo132329U(true);
                                                    break;
                                                } else {
                                                    OnlineVideoView.m121643l(OnlineVideoView.this);
                                                    OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                                                    SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                    onlineVideoView4.mo132321L();
                                                    SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                    break;
                                                }
                                            } else {
                                                OnlineVideoView.m121643l(OnlineVideoView.this);
                                                OnlineVideoView onlineVideoView5 = OnlineVideoView.this;
                                                int g = OnlineVideoView.m121638g(onlineVideoView5);
                                                OnlineVideoView onlineVideoView6 = OnlineVideoView.this;
                                                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                boolean z2 = onlineVideoView6.f277221v;
                                                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                SnsMethodCalculate.markStartTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                onlineVideoView5.f277173T.post(new Runnable(g, z2) {

                                                    /* renamed from: d */
                                                    public final /* synthetic */ int f277234d;

                                                    /* renamed from: e */
                                                    public final /* synthetic */ boolean f277235e;

                                                    {
                                                        this.f277234d = r2;
                                                        this.f277235e = r3;
                                                    }

                                                    public void run() {
                                                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                        C100400e0 Yx0 = C94866e1.Yx0();
                                                        OnlineVideoView onlineVideoView = OnlineVideoView.this;
                                                        int i = OnlineVideoView.f277144H1;
                                                        SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                        String str = onlineVideoView.f277211q;
                                                        SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                        SnsInfo DN = Yx0.mo139798DN(str);
                                                        if (DN == null) {
                                                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                            return;
                                                        }
                                                        Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "fav download video[%s] farFromScene %d isFromMain %b", OnlineVideoView.m121642k(OnlineVideoView.this), Integer.valueOf(this.f277234d), Boolean.valueOf(this.f277235e));
                                                        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                                                        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                                                        aVar.f264688m = this.f277234d;
                                                        aVar.f264684i = (Activity) OnlineVideoView.this.getActivityContext();
                                                        C97707a.m126006d(doFavoriteEvent, DN);
                                                        doFavoriteEvent.publish();
                                                        if (doFavoriteEvent.f264675e.f9046a == 0) {
                                                            OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                                                            SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                            onlineVideoView2.getClass();
                                                            SnsMethodCalculate.markStartTimeMs("rptFavVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                            C115669n.INSTANCE.idkeyStat(354, 225, 1, false);
                                                            SnsMethodCalculate.markEndTimeMs("rptFavVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                            SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                        } else {
                                                            OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                                                            SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                            onlineVideoView3.getClass();
                                                            SnsMethodCalculate.markStartTimeMs("rptFavVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                            C115669n.INSTANCE.idkeyStat(354, 226, 1, false);
                                                            SnsMethodCalculate.markEndTimeMs("rptFavVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                            SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                        }
                                                        if (this.f277235e) {
                                                            SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent = new SnsFavFeedForDataReportEvent();
                                                            snsFavFeedForDataReportEvent.f265135d.f265137b = DN.getLocalid();
                                                            snsFavFeedForDataReportEvent.f265135d.f265136a = C102236a0.m134728W(DN);
                                                            snsFavFeedForDataReportEvent.publish();
                                                        }
                                                        OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                                                        SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                        onlineVideoView4.f277219u = 0;
                                                        SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                        C96875r0 r0Var = OnlineVideoView.this.f277145A;
                                                        if (r0Var != null) {
                                                            if (Util.isNullOrNil(r0Var.getVideoPath())) {
                                                                Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d had not set video path to play", Integer.valueOf(OnlineVideoView.this.hashCode()));
                                                                String m = C94867e2.m120294m(OnlineVideoView.m121642k(OnlineVideoView.this), OnlineVideoView.m121648q(OnlineVideoView.this));
                                                                if (!Util.isNullOrNil(m)) {
                                                                    OnlineVideoView.this.mo132318H(m, false);
                                                                }
                                                                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                                return;
                                                            } else if (!OnlineVideoView.this.f277145A.isPlaying()) {
                                                                OnlineVideoView.this.f277145A.start();
                                                                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                                return;
                                                            }
                                                        }
                                                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                                    }
                                                });
                                                SnsMethodCalculate.markEndTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                break;
                                            }
                                        } else {
                                            OnlineVideoView.m121643l(OnlineVideoView.this);
                                            OnlineVideoView onlineVideoView7 = OnlineVideoView.this;
                                            int f = OnlineVideoView.m121637f(onlineVideoView7);
                                            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView7.mo132323O(f);
                                            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            break;
                                        }
                                    case 5:
                                        if (OnlineVideoView.m121646o(OnlineVideoView.this) != 1) {
                                            if (OnlineVideoView.m121646o(OnlineVideoView.this) == 2) {
                                                OnlineVideoView onlineVideoView8 = OnlineVideoView.this;
                                                OnlineVideoEvent.C92538a aVar4 = onlineVideoEvent.f264965d;
                                                int i2 = aVar4.f264969d;
                                                int i3 = aVar4.f264970e;
                                                SnsMethodCalculate.markStartTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                onlineVideoView8.getClass();
                                                SnsMethodCalculate.markStartTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                onlineVideoView8.f277173T.post(new Runnable(i2, i3) {

                                                    /* renamed from: d */
                                                    public final /* synthetic */ int f277248d;

                                                    /* renamed from: e */
                                                    public final /* synthetic */ int f277249e;

                                                    {
                                                        this.f277248d = r2;
                                                        this.f277249e = r3;
                                                    }

                                                    public void run() {
                                                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$14");
                                                        if (!(OnlineVideoView.m121640i(OnlineVideoView.this) == null || OnlineVideoView.m121640i(OnlineVideoView.this).getVisibility() == 8)) {
                                                            OnlineVideoView.m121640i(OnlineVideoView.this).setVisibility(8);
                                                        }
                                                        if (OnlineVideoView.m121641j(OnlineVideoView.this) != null) {
                                                            if (OnlineVideoView.m121641j(OnlineVideoView.this).getVisibility() != 0) {
                                                                OnlineVideoView.m121641j(OnlineVideoView.this).setVisibility(0);
                                                            }
                                                            Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d update progress %d %d", Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(this.f277248d), Integer.valueOf(this.f277249e));
                                                            int max = OnlineVideoView.m121641j(OnlineVideoView.this).getMax();
                                                            int i = this.f277249e;
                                                            if (max != i && i > 0) {
                                                                OnlineVideoView.m121641j(OnlineVideoView.this).setMax(this.f277249e);
                                                            }
                                                            OnlineVideoView.m121641j(OnlineVideoView.this).setProgress(this.f277248d);
                                                        }
                                                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$14");
                                                    }
                                                });
                                                SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                SnsMethodCalculate.markEndTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                break;
                                            }
                                        } else {
                                            OnlineVideoViewHelper onlineVideoViewHelper3 = OnlineVideoView.this.f277155F;
                                            OnlineVideoEvent.C92538a aVar5 = onlineVideoEvent.f264965d;
                                            onlineVideoViewHelper3.mo132409h(aVar5.f264968c, aVar5.f264969d, aVar5.f264970e);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        OnlineVideoViewHelper onlineVideoViewHelper4 = OnlineVideoView.this.f277155F;
                                        onlineVideoViewHelper4.getClass();
                                        SnsMethodCalculate.markStartTimeMs("dealHadDupVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                        Log.m105925i(onlineVideoViewHelper4.f277303a, "deal had dup video. cdnMediaId %s", onlineVideoViewHelper4.f277313k);
                                        onlineVideoViewHelper4.mo132413l();
                                        SnsMethodCalculate.markEndTimeMs("dealHadDupVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                        break;
                                    default:
                                        Log.m105929w(OnlineVideoView.m121633b(OnlineVideoView.this), "%d unknown event opcode %d", Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(onlineVideoEvent.f264965d.f264966a));
                                        break;
                                }
                                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                            } else {
                                Log.m105929w(OnlineVideoView.m121633b(OnlineVideoView.this), "%d stream download online video error. retCode %d ", Integer.valueOf(OnlineVideoView.this.hashCode()), Integer.valueOf(onlineVideoEvent.f264965d.f264967b));
                                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                            }
                        }
                    } catch (Exception e) {
                        String b7 = OnlineVideoView.m121633b(OnlineVideoView.this);
                        Log.m105920e(b7, "online video callback error: " + e.toString());
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                return false;
            }
        };
        this.f277220u1 = new C96875r0.C96879e() {
            /* renamed from: r */
            public void mo79636r() {
                SnsMethodCalculate.markStartTimeMs("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$24");
                Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d on texture update.", Integer.valueOf(OnlineVideoView.this.hashCode()));
                try {
                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                    if (onlineVideoView.f277145A instanceof ThumbPlayerVideoView) {
                        SnsMethodCalculate.markStartTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.mo132332Y(true, 1.0f);
                        SnsMethodCalculate.markEndTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    } else {
                        SnsMethodCalculate.markStartTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.mo132331X(true, 1.0f);
                        SnsMethodCalculate.markEndTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    }
                } catch (Exception e) {
                    String b = OnlineVideoView.m121633b(OnlineVideoView.this);
                    Log.m105920e(b, "texture view update. error " + e.toString());
                }
                SnsMethodCalculate.markEndTimeMs("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$24");
            }
        };
        this.f277222v1 = new C110762b() {
            /* renamed from: a */
            public long mo132384a() {
                SnsMethodCalculate.markStartTimeMs("getOnlineCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$25");
                Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "%d sns video get online cache", Integer.valueOf(OnlineVideoView.this.hashCode()));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, Boolean.TRUE);
                try {
                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    boolean z = onlineVideoView.f277157G;
                    SnsMethodCalculate.markEndTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (z && OnlineVideoView.this.f277155F != null) {
                        OnlineVideoViewHelper onlineVideoViewHelper = OnlineVideoView.this.f277155F;
                        onlineVideoViewHelper.getClass();
                        SnsMethodCalculate.markStartTimeMs("getCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        long j = (long) onlineVideoViewHelper.f277319q;
                        SnsMethodCalculate.markEndTimeMs("getCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        SnsMethodCalculate.markEndTimeMs("getOnlineCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$25");
                        return j;
                    }
                } catch (Exception unused) {
                }
                SnsMethodCalculate.markEndTimeMs("getOnlineCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$25");
                return 0;
            }
        };
        this.f277146A1 = true;
        this.f277148B1 = false;
        this.f277152D1 = 0;
        this.f277154E1 = 0;
        this.f277156F1 = 0;
        this.f277158G1 = null;
        boolean z2 = this.f277190e1;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277199j = context2;
        Log.m105925i(str, "%d ui init view, isAd=%s", Integer.valueOf(hashCode()), Boolean.toString(z2));
        LayoutInflater from = LayoutInflater.from(context);
        SnsMethodCalculate.markStartTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsMethodCalculate.markEndTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        from.inflate(C0966R.C0971layout.f360019c52, this);
        this.f277231z = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f277228y = (RelativeLayout) findViewById(C0966R.C0970id.l7c);
        ((TextView) findViewById(C0966R.C0970id.l5j)).setVisibility(8);
        this.f277149C = (MMPinProgressBtn) findViewById(C0966R.C0970id.f359492l70);
        this.f277147B = (ProgressBar) findViewById(C0966R.C0970id.l6a);
        this.f277151D = (TextView) findViewById(C0966R.C0970id.l7q);
        SnsMethodCalculate.markStartTimeMs("initSeekBar", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f277180W0 = (ImageView) findViewById(C0966R.C0970id.evv);
        HeroSeekBarView heroSeekBarView = (HeroSeekBarView) findViewById(C0966R.C0970id.jxd);
        this.f277178V0 = heroSeekBarView;
        heroSeekBarView.setHeroSeekBarChangeListener(new HeroSeekBarView.C96824c() {
            /* JADX WARNING: Removed duplicated region for block: B:18:0x00d3  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo132390a(android.widget.SeekBar r17, int r18) {
                /*
                    r16 = this;
                    r0 = r16
                    java.lang.String r1 = "onStopTrackingTouch"
                    java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView$3"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.this
                    com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView r4 = com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.m121634c(r3)
                    r5 = r18
                    long r5 = (long) r5
                    long r7 = r4.f283686g
                    long r5 = r5 * r7
                    r4 = 2500(0x9c4, float:3.503E-42)
                    long r7 = (long) r4
                    long r5 = r5 / r7
                    r7 = 1000(0x3e8, double:4.94E-321)
                    long r5 = r5 / r7
                    int r4 = (int) r5
                    java.lang.String r5 = "uiTouchSeek"
                    java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                    java.lang.String r7 = r3.f277187d
                    r8 = 3
                    java.lang.Object[] r9 = new java.lang.Object[r8]
                    int r10 = r3.hashCode()
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    r11 = 0
                    r9[r11] = r10
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
                    r12 = 1
                    r9[r12] = r10
                    java.lang.Boolean r10 = java.lang.Boolean.TRUE
                    r13 = 2
                    r9[r13] = r10
                    java.lang.String r10 = "%d ui touch seek second %d afterSeekPlay %b"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r9)
                    boolean r7 = r3.f277157G
                    if (r7 != 0) goto L_0x0050
                    r3.mo132322N(r4, r12)
                    goto L_0x005e
                L_0x0050:
                    com.tencent.mm.pluginsdk.ui.tools.r0 r7 = r3.f277145A
                    boolean r9 = r7 instanceof com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView
                    if (r9 == 0) goto L_0x0060
                    com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView r7 = (com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView) r7
                    int r4 = r4 * 1000
                    double r8 = (double) r4
                    r7.mo24787a(r8, r12)
                L_0x005e:
                    r13 = 1
                    goto L_0x00d1
                L_0x0060:
                    com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper r7 = r3.f277155F
                    r7.getClass()
                    java.lang.String r9 = "seekVideo"
                    java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                    int r14 = r7.f277304b
                    if (r14 == r12) goto L_0x0078
                    if (r14 == r8) goto L_0x0074
                    goto L_0x009f
                L_0x0074:
                    r7.mo132421t(r4, r12)
                    goto L_0x009f
                L_0x0078:
                    r7.f277305c = r13
                    com.tencent.mm.pointers.PInt r14 = new com.tencent.mm.pointers.PInt
                    r14.<init>()
                    com.tencent.mm.pointers.PInt r15 = new com.tencent.mm.pointers.PInt
                    r15.<init>()
                    r7.mo132402a(r4, r14, r15)
                    int r14 = r14.value
                    int r13 = r15.value
                    boolean r13 = r7.mo132415n(r14, r13, r12)
                    if (r13 == 0) goto L_0x00a1
                    r13 = -1
                    r7.f277317o = r13
                    r7.f277318p = r11
                    int r13 = r15.value
                    r7.f277319q = r13
                    r7.f277305c = r8
                    r7.mo132421t(r4, r12)
                L_0x009f:
                    r13 = 1
                    goto L_0x00ad
                L_0x00a1:
                    r7.f277317o = r4
                    r7.f277318p = r12
                    com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$IVideoUICallback r13 = r7.f277308f
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView r13 = (com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView) r13
                    r13.mo132316F()
                    r13 = 0
                L_0x00ad:
                    java.lang.String r14 = r7.f277303a
                    java.lang.Object[] r8 = new java.lang.Object[r8]
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r8[r11] = r4
                    int r4 = r7.f277304b
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r8[r12] = r4
                    int r4 = r7.f277305c
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r7 = 2
                    r8[r7] = r4
                    java.lang.String r4 = "seek video time %d, download status %d playStatus %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                L_0x00d1:
                    if (r13 == 0) goto L_0x00d6
                    r3.mo132329U(r11)
                L_0x00d6:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.this
                    java.lang.String r4 = "access$1202"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
                    r3.f277170R0 = r12
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.this
                    java.lang.String r4 = "access$1100"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView$DelaySeekTask r3 = r3.f277192f1
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
                    r3.getClass()
                    java.lang.String r4 = "dispose"
                    java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView$DelaySeekTask"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView r6 = com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.this
                    com.tencent.mm.sdk.platformtools.MMHandler r6 = com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.m121635d(r6)
                    r6.removeCallbacks(r3)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView.C953903.mo132390a(android.widget.SeekBar, int):void");
            }

            /* renamed from: b */
            public void mo132391b(SeekBar seekBar, int i) {
                SnsMethodCalculate.markStartTimeMs("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$3");
                OnlineVideoView.this.mo132317G();
                SnsMethodCalculate.markEndTimeMs("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$3");
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                SnsMethodCalculate.markStartTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$3");
                if (z) {
                    OnlineVideoView onlineVideoView = OnlineVideoView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    DelaySeekTask delaySeekTask = onlineVideoView.f277192f1;
                    SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    delaySeekTask.getClass();
                    SnsMethodCalculate.markStartTimeMs("schedule", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$DelaySeekTask");
                    delaySeekTask.f277291d = (int) (((((long) i) * OnlineVideoView.m121634c(OnlineVideoView.this).f283686g) / ((long) 2500)) / 1000);
                    if (SystemClock.uptimeMillis() - delaySeekTask.f277292e > 100) {
                        delaySeekTask.run();
                    } else {
                        OnlineVideoView.m121635d(OnlineVideoView.this).removeCallbacks(delaySeekTask);
                        OnlineVideoView.m121635d(OnlineVideoView.this).postDelayed(delaySeekTask, 100);
                    }
                    SnsMethodCalculate.markEndTimeMs("schedule", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$DelaySeekTask");
                }
                SnsMethodCalculate.markEndTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$3");
            }
        });
        SnsMethodCalculate.markEndTimeMs("initSeekBar", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        SnsMethodCalculate.markStartTimeMs("shouldUseTp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        C32735h hVar = (C32735h) C86312j.m106911c(cls);
        if (z2) {
            int i2 = C79618h.f233471c;
            if (i2 == 1) {
                SnsMethodCalculate.markEndTimeMs("shouldUseTp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                z = false;
            } else if (i2 == 2) {
                SnsMethodCalculate.markEndTimeMs("shouldUseTp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                z = true;
            } else {
                z = hVar.mo58784wf(C32735h.C32737c.clicfg_enable_sns_ad_tp, false);
                SnsMethodCalculate.markEndTimeMs("shouldUseTp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
        } else {
            C97540j jVar = C97540j.f286244a;
            SnsMethodCalculate.markStartTimeMs("enableTPPlayer", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            z = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_enable_sns_tp, true);
            SnsMethodCalculate.markEndTimeMs("enableTPPlayer", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            SnsMethodCalculate.markEndTimeMs("shouldUseTp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        if (z) {
            ThumbPlayerVideoView thumbPlayerVideoView = new ThumbPlayerVideoView(context2);
            this.f277145A = thumbPlayerVideoView;
            thumbPlayerVideoView.setLoopStartCallback(new ThumbPlayerVideoView.C19318b() {
                /* renamed from: a */
                public void mo24888a() {
                    SnsMethodCalculate.markStartTimeMs("onLoopStart", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$1");
                    Log.m105924i(OnlineVideoView.m121633b(OnlineVideoView.this), "onLoopStart");
                    if (OnlineVideoView.m121634c(OnlineVideoView.this) != null) {
                        HeroSeekBarView c = OnlineVideoView.m121634c(OnlineVideoView.this);
                        C53895h.m60466d(c.f283696t, (C66212f) null, (C53934p0) null, new C92258b(c, (C15601d<? super C92258b>) null), 3, (Object) null);
                        Log.m105924i("MicroMsg.HeroSeekBarView", "reset");
                        OnlineVideoView.m121634c(OnlineVideoView.this).setEnableDrag(true);
                    }
                    SnsMethodCalculate.markEndTimeMs("onLoopStart", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$1");
                }
            });
            this.f277145A.setOnInfoCallback(new C96875r0.C19571b() {
                /* renamed from: j */
                public void mo25380j(int i, int i2) {
                    SnsMethodCalculate.markStartTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$2");
                    if (i == 701) {
                        OnlineVideoView onlineVideoView = OnlineVideoView.this;
                        onlineVideoView.f277182Y0 = true;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.mo132326R();
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    } else if (i == 702) {
                        OnlineVideoView onlineVideoView2 = OnlineVideoView.this;
                        onlineVideoView2.f277182Y0 = false;
                        OnlineVideoView.m121643l(onlineVideoView2);
                    } else if (i == 3) {
                        long currentTimeMillis = System.currentTimeMillis();
                        OnlineVideoView onlineVideoView3 = OnlineVideoView.this;
                        int i3 = OnlineVideoView.f277144H1;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        long j = onlineVideoView3.f277184a1;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        long j2 = currentTimeMillis - j;
                        OnlineVideoView onlineVideoView4 = OnlineVideoView.this;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView4.f277185b1 = currentTimeMillis2;
                        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        Log.m105925i(OnlineVideoView.m121633b(OnlineVideoView.this), "finish switch define ,cost:%d", Long.valueOf(j2));
                        OnlineVideoView onlineVideoView5 = OnlineVideoView.this;
                        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        C99294s sVar = onlineVideoView5.f277200j1;
                        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        sVar.getClass();
                        Log.m105920e("MicroMsg.TPPlayerReporter", "onSwitchDefineFinish media id:" + sVar.f291171a.f266337g);
                        sVar.f291171a.f266327V = System.currentTimeMillis();
                        if (OnlineVideoView.m121648q(OnlineVideoView.this) != null) {
                            C99279f fVar = C99279f.f291124a;
                            String str = OnlineVideoView.m121648q(OnlineVideoView.this).f298689d;
                            fVar.getClass();
                            C87412m.m108594g(str, "mediaId");
                            fVar.mo138692e(new C99291p(str, (int) j2));
                        }
                        C92315e eVar = OnlineVideoView.this.f277174T0;
                        if (eVar != null) {
                            eVar.mo126316i();
                        }
                        OnlineVideoView onlineVideoView6 = OnlineVideoView.this;
                        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        boolean z = onlineVideoView6.f277188d1;
                        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        if (z) {
                            C76912y0.makeText(context2, (CharSequence) String.format("码率切换完成，耗时:%d", new Object[]{Long.valueOf(j2)}), 1).show();
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$2");
                }
            });
            this.f277159H = false;
            Log.m105924i(str, "initView, use ThumbPlayerVideoView");
        } else {
            C102609h.Fx0();
            if (C102609h.m135509Am()) {
                this.f277159H = true;
                VideoPlayerTextureView videoPlayerTextureView = new VideoPlayerTextureView(context2, (AttributeSet) null);
                this.f277145A = videoPlayerTextureView;
                videoPlayerTextureView.setIOnlineCache(this.f277222v1);
                ((VideoPlayerTextureView) this.f277145A).setOpenWithNoneSurface(true);
                C115669n.INSTANCE.idkeyStat(354, 148, 1, false);
                Log.m105924i(str, "initView, use VideoPlayerTextureView");
            } else {
                this.f277159H = false;
                this.f277145A = new VideoTextureView(context2, (AttributeSet) null);
                C115669n.INSTANCE.idkeyStat(354, 149, 1, false);
                Log.m105924i(str, "initView, use VideoTextureView");
            }
        }
        this.f277145A.setVideoCallback(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        int generateViewId = View.generateViewId();
        ((View) this.f277145A).setId(generateViewId);
        this.f277228y.addView((View) this.f277145A, layoutParams);
        this.f277153E = new ImageView(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(6, generateViewId);
        layoutParams2.addRule(8, generateViewId);
        this.f277228y.addView(this.f277153E, layoutParams2);
        this.f277153E.setVisibility(8);
        mo132332Y(false, 0.0f);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }
}
