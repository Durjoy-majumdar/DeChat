package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bp2.C92278a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94978z0;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.VideoFullScreenActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerSeekBar;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lo2.C99572w;
import org.json.JSONException;
import org.json.JSONObject;
import p1208q3.C118144a;
import p749xh.C102646h;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101284p0;
import sn0.C90259e;
import vr2.C102260r;
import vr2.C37817q;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 */
public class C95050a2 extends C95300z1 implements C96814a.C57541b, C102693c, View.OnTouchListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, View.OnClickListener, C96814a.C57542d {

    /* renamed from: A */
    public ImageView f275850A;

    /* renamed from: B */
    public ProgressBar f275851B;

    /* renamed from: C */
    public boolean f275852C;

    /* renamed from: D */
    public View f275853D;

    /* renamed from: E */
    public ImageView f275854E;

    /* renamed from: F */
    public Context f275855F;

    /* renamed from: G */
    public MMHandler f275856G;

    /* renamed from: H */
    public Runnable f275857H;

    /* renamed from: I */
    public boolean f275858I = false;

    /* renamed from: J */
    public boolean f275859J = true;

    /* renamed from: K */
    public boolean f275860K = true;

    /* renamed from: L */
    public boolean f275861L = false;

    /* renamed from: M */
    public boolean f275862M = true;

    /* renamed from: N */
    public boolean f275863N = false;

    /* renamed from: P */
    public boolean f275864P = false;

    /* renamed from: Q */
    public int f275865Q = 0;

    /* renamed from: Q0 */
    public View f275866Q0;

    /* renamed from: R */
    public long f275867R = 0;

    /* renamed from: R0 */
    public int f275868R0;

    /* renamed from: S */
    public int f275869S = 0;

    /* renamed from: S0 */
    public GestureDetector f275870S0;

    /* renamed from: T */
    public int f275871T = 0;

    /* renamed from: T0 */
    public Runnable f275872T0;

    /* renamed from: U */
    public int f275873U = 0;

    /* renamed from: U0 */
    public volatile boolean f275874U0;

    /* renamed from: V */
    public int f275875V = 0;

    /* renamed from: V0 */
    public volatile boolean f275876V0;

    /* renamed from: W */
    public int f275877W = 0;

    /* renamed from: W0 */
    public volatile int f275878W0;

    /* renamed from: X */
    public C95195n2 f275879X = null;

    /* renamed from: X0 */
    public int f275880X0;

    /* renamed from: Y */
    public View.OnClickListener f275881Y;

    /* renamed from: Y0 */
    public int f275882Y0;

    /* renamed from: Z */
    public View.OnClickListener f275883Z;

    /* renamed from: Z0 */
    public C95058j f275884Z0;

    /* renamed from: a1 */
    public long f275885a1;

    /* renamed from: b1 */
    public long f275886b1;

    /* renamed from: c1 */
    public int f275887c1;

    /* renamed from: d1 */
    public View f275888d1;

    /* renamed from: p0 */
    public View.OnClickListener f275889p0;

    /* renamed from: x */
    public AdLandingVideoWrapper f275890x;

    /* renamed from: x0 */
    public View.OnClickListener f275891x0;

    /* renamed from: y */
    public VideoPlayerSeekBar f275892y;

    /* renamed from: y0 */
    public ImageView f275893y0;

    /* renamed from: z */
    public ImageView f275894z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$d */
    public class C43045d implements Runnable {
        public C43045d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$1");
            C95050a2 a2Var = C95050a2.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            View view = a2Var.f275866Q0;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$e */
    public class C43046e implements Runnable {
        public C43046e() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$2");
            C95050a2.m120817Q(C95050a2.this, false);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$a */
    public class C95051a implements Runnable {
        public C95051a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$10");
            if (!C95050a2.this.mo130233K()) {
                if (C95050a2.m120818R(C95050a2.this).getCurrPosSec() == C95050a2.m120818R(C95050a2.this).getVideoDurationSec()) {
                    C95050a2 a2Var = C95050a2.this;
                    SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    a2Var.mo131549c0(0, true);
                    SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                } else {
                    C95050a2 a2Var2 = C95050a2.this;
                    int currPosSec = C95050a2.m120818R(a2Var2).getCurrPosSec();
                    SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    a2Var2.mo131549c0(currPosSec, true);
                    SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                }
                C95050a2.m120818R(C95050a2.this).mo131774g();
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$b */
    public class C95052b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f275896d;

        public C95052b(boolean z) {
            this.f275896d = z;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$11");
            C95050a2.m120818R(C95050a2.this).pause();
            try {
                C95050a2 a2Var = C95050a2.this;
                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                ImageView imageView = a2Var.f275854E;
                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                if (imageView.getVisibility() != 0 && this.f275896d) {
                    C95050a2 a2Var2 = C95050a2.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    View view = a2Var2.f275866Q0;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C95050a2 a2Var3 = C95050a2.this;
                    SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    Runnable runnable = a2Var3.f275872T0;
                    SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    a2Var3.mo131544V(runnable);
                    SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                }
                C95050a2 a2Var4 = C95050a2.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                a2Var4.mo131554i0(false);
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$11");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$c */
    public class C95053c implements Runnable {
        public C95053c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$12");
            C95050a2 a2Var = C95050a2.this;
            SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            boolean z = a2Var.f275858I;
            SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            if (z) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$12");
                return;
            }
            C95050a2.m120817Q(C95050a2.this, false);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$f */
    public class C95054f implements C95195n2 {

        /* renamed from: a */
        public final /* synthetic */ Context f275899a;

        public C95054f(Context context) {
            this.f275899a = context;
        }

        /* renamed from: a */
        public void mo130250a(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onProgressBarShowedStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$3");
            Intent intent = new Intent("com.tencent.mm.adlanding.video_progressbar_change");
            intent.putExtra("show", z ? 1 : 0);
            C95050a2 a2Var = C95050a2.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            int H = a2Var.mo140728H();
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            intent.putExtra("activity_code", H);
            C118144a.m166672a(this.f275899a).mo182944c(intent);
            SnsMethodCalculate.markEndTimeMs("onProgressBarShowedStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$g */
    public class C95055g implements C100880k.C100881a {
        public C95055g() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$4");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$4");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$4");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$4");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$4");
            C95050a2 a2Var = C95050a2.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            ImageView imageView = a2Var.f275850A;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            if (imageView.getVisibility() == 0) {
                C95050a2 a2Var2 = C95050a2.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                ImageView imageView2 = a2Var2.f275850A;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                imageView2.setImageBitmap(BitmapUtil.decodeFile(str));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$h */
    public class C95056h implements AdLandingVideoWrapper.C95249b {
        public C95056h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$i */
    public static class C95057i {

        /* renamed from: a */
        public static C101284p0 f275903a;
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2$j */
    public static class C95058j {

        /* renamed from: a */
        public int f275904a;

        /* renamed from: b */
        public long f275905b;

        /* renamed from: c */
        public int f275906c;

        /* renamed from: d */
        public String f275907d;

        /* renamed from: e */
        public int f275908e;

        /* renamed from: f */
        public long f275909f;

        /* renamed from: g */
        public int f275910g;
    }

    public C95050a2(Context context, C101284p0 p0Var, ViewGroup viewGroup) {
        super(context, p0Var, viewGroup);
        SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C95083d2 d2Var = new C95083d2(this);
        SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275881Y = d2Var;
        SnsMethodCalculate.markStartTimeMs("createVoiceTypeClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C95086e2 e2Var = new C95086e2(this);
        SnsMethodCalculate.markEndTimeMs("createVoiceTypeClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275883Z = e2Var;
        SnsMethodCalculate.markStartTimeMs("createVideoStatusClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C95089f2 f2Var = new C95089f2(this);
        SnsMethodCalculate.markEndTimeMs("createVideoStatusClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275889p0 = f2Var;
        SnsMethodCalculate.markStartTimeMs("createVideoViewClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C43060g2 g2Var = new C43060g2(this);
        SnsMethodCalculate.markEndTimeMs("createVideoViewClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275891x0 = g2Var;
        this.f275874U0 = false;
        this.f275876V0 = false;
        this.f275878W0 = 0;
        this.f275880X0 = 0;
        this.f275882Y0 = 0;
        this.f275885a1 = 0;
        this.f275855F = context;
        this.f275856G = new MMHandler(Looper.getMainLooper());
        try {
            this.f275870S0 = new GestureDetector(this);
            this.f275872T0 = new C43045d();
            C115669n.INSTANCE.mo175911u(1720, 5);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
        }
        this.f275857H = new C43046e();
        C95054f fVar = new C95054f(context);
        SnsMethodCalculate.markStartTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275879X = fVar;
        SnsMethodCalculate.markEndTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: Q */
    public static /* synthetic */ void m120817Q(C95050a2 a2Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        a2Var.mo131550d0(z);
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: R */
    public static /* synthetic */ AdLandingVideoWrapper m120818R(C95050a2 a2Var) {
        SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        AdLandingVideoWrapper adLandingVideoWrapper = a2Var.f275890x;
        SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return adLandingVideoWrapper;
    }

    /* renamed from: U */
    public static /* synthetic */ View m120819U(C95050a2 a2Var) {
        SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        View view = a2Var.f275888d1;
        SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return view;
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.mo130145A();
        int l = mo131853l();
        int height = mo131855p().getHeight();
        Log.m105919d("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "inScreenHeight %d, height %d", Integer.valueOf(l), Integer.valueOf(height));
        if (l == 0 || height == 0) {
            this.f275890x.setNeedPause(true);
            SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        } else if (l < 0) {
            this.f275890x.setNeedPause(true);
            SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        } else {
            if (((float) l) < ((float) height) * 0.5f) {
                this.f275862M = false;
                this.f275861L = false;
                this.f275890x.setNeedPause(true);
                mo131548b0(false);
                if (this.f275865Q == 1) {
                    this.f275865Q = 2;
                }
            } else if (!this.f275861L || this.f275862M) {
                this.f275890x.setNeedPause(false);
                this.f275862M = false;
                this.f275861L = true;
                if (this.f275865Q == 6) {
                    if (this.f275874U0) {
                        this.f275865Q = 1;
                        if (this.f275854E.getVisibility() == 0) {
                            this.f275854E.setVisibility(8);
                        }
                    } else {
                        this.f275865Q = 4;
                    }
                    SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                    return;
                }
                this.f275850A.setVisibility(0);
                boolean z = this.f275860K;
                if (!z || (z && mo131547Y())) {
                    mo131550d0(true);
                    MMHandlerThread.postToMainThreadDelayed(new C95053c(), 3000);
                }
                if (this.f275860K) {
                    if (!mo131547Y()) {
                        this.f275854E.setVisibility(0);
                        this.f275863N = false;
                        this.f275860K = false;
                        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                        return;
                    }
                    this.f275863N = true;
                    this.f275860K = false;
                }
                int i = this.f275865Q;
                if (i == 0) {
                    if (mo131547Y()) {
                        if (this.f275859J) {
                            mo130232G();
                        } else {
                            mo130234M();
                        }
                        this.f275865Q = 1;
                        mo131552g0();
                    }
                } else if (i == 2) {
                    if (this.f275859J) {
                        mo130232G();
                    } else {
                        mo130234M();
                    }
                    mo131552g0();
                    this.f275865Q = 1;
                } else if (i == 3) {
                    if (this.f275859J) {
                        mo130232G();
                    } else {
                        mo130234M();
                    }
                    mo131552g0();
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
                return;
            }
            SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        }
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.mo67235C();
        try {
            this.f275890x.mo131776j();
            this.f275856G.removeCallbacks(this.f275857H);
            this.f275856G.removeCallbacks(this.f275872T0);
            mo131545W();
            C37817q.m41545a("landing_page_video_comp_loading_time", String.valueOf(this.f275887c1), 1, 0, "");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
        }
        this.f275890x.mo79616c();
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.mo124361D();
        this.f275890x.setNeedPause(true);
        mo131548b0(false);
        if (this.f275861L || this.f275862M) {
            this.f275862M = false;
            this.f275861L = false;
            if (this.f275865Q == 1) {
                this.f275865Q = 2;
            }
            SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275876V0 = false;
        this.f275878W0 = 0;
        mo131545W();
        Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "mediaId = " + str2 + ", end loading");
        SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: G */
    public void mo130232G() {
        SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.mo130232G();
        ImageView imageView = this.f275894z;
        if (imageView != null) {
            imageView.setImageDrawable(C76577a.m92158i(this.f275855F, C0966R.raw.icon_volume_off));
        }
        this.f275890x.setMute(true);
        this.f275859J = true;
        SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275876V0 = true;
        this.f275886b1 = System.currentTimeMillis();
        Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "mediaId = " + str2 + ", start loading");
        SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: K */
    public boolean mo130233K() {
        SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean isPlaying = this.f275890x.isPlaying();
        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return isPlaying;
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onVideoEnded");
        this.f275873U++;
        mo131550d0(true);
        this.f275890x.mo131776j();
        if (this.f275867R != 0) {
            this.f275869S = (int) (((long) this.f275869S) + (System.currentTimeMillis() - this.f275867R));
            this.f275867R = 0;
        }
        this.f275865Q = 5;
        this.f275890x.mo79614b();
        SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: M */
    public void mo130234M() {
        SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (mo140730J()) {
            SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        super.mo130234M();
        ImageView imageView = this.f275894z;
        if (imageView != null) {
            imageView.setImageDrawable(C76577a.m92158i(this.f275855F, C0966R.raw.icon_volume_on));
        }
        this.f275890x.setMute(false);
        this.f275859J = false;
        SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: N */
    public void mo130235N() {
        SnsMethodCalculate.markStartTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        mo131548b0(false);
        this.f275865Q = 4;
        SnsMethodCalculate.markEndTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: O */
    public void mo130236O() {
        SnsMethodCalculate.markStartTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275865Q = 3;
        mo131552g0();
        SnsMethodCalculate.markEndTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: P */
    public void mo130237P(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("videoSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        mo131549c0(i / 1000, z);
        SnsMethodCalculate.markEndTimeMs("videoSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Log.m105921e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "online play error, %s", str3);
        this.f275864P = true;
        C115669n.INSTANCE.mo175911u(1579, 17);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: V */
    public final void mo131544V(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f275856G.removeCallbacks(runnable);
            this.f275856G.postDelayed(runnable, 4000);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: W */
    public final void mo131545W() {
        SnsMethodCalculate.markStartTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (this.f275886b1 != 0) {
            this.f275887c1 = (int) (((long) this.f275887c1) + (System.currentTimeMillis() - this.f275886b1));
            this.f275886b1 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: X */
    public final C101284p0 mo131546X() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C101284p0 p0Var = (C101284p0) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return p0Var;
    }

    /* renamed from: Y */
    public final boolean mo131547Y() {
        SnsMethodCalculate.markStartTimeMs("needAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markStartTimeMs("isWifi", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
        SnsMethodCalculate.markEndTimeMs("isWifi", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        boolean z = isWifi || mo131546X().f296678F;
        SnsMethodCalculate.markEndTimeMs("needAutoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return z;
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275864P = false;
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onSeek time " + i);
        this.f275878W0 = i;
        if (this.f275859J) {
            mo130232G();
        } else {
            mo140727E();
            mo130234M();
        }
        this.f275856G.removeCallbacks(this.f275872T0);
        View view = this.f275866Q0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo131549c0(i, true);
        this.f275865Q = 3;
        SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: b */
    public void mo81284b() {
        SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onLoopCompletion");
        this.f275873U++;
        C92278a aVar = this.f296491u;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
            aVar.f264111a = true;
            SnsMethodCalculate.markEndTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
        }
        SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: b0 */
    public final void mo131548b0(boolean z) {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Log.m105918d("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "pause play");
        this.f275856G.post(new C95052b(z));
        if (this.f275867R != 0) {
            this.f275869S = (int) (((long) this.f275869S) + (System.currentTimeMillis() - this.f275867R));
            this.f275867R = 0;
        }
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: c */
    public void mo4336c(int i) {
        SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: c0 */
    public final void mo131549c0(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (this.f275890x != null) {
            this.f275854E.setVisibility(8);
            if (this.f275850A.getVisibility() == 0) {
                this.f275851B.setVisibility(0);
            }
            this.f275890x.mo79613a((double) i, z);
        }
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: d0 */
    public final void mo131550d0(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (z) {
            this.f275892y.setVisibility(0);
            ImageView imageView = this.f275894z;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            View view = this.f275853D;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageView imageView2 = this.f275893y0;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            C95195n2 n2Var = this.f275879X;
            if (n2Var != null) {
                n2Var.mo130250a(true);
            }
            mo131544V(this.f275857H);
        } else {
            this.f275858I = false;
            this.f275892y.setVisibility(4);
            ImageView imageView3 = this.f275894z;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            View view2 = this.f275853D;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setFocus", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageView imageView4 = this.f275893y0;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            C95195n2 n2Var2 = this.f275879X;
            if (n2Var2 != null) {
                n2Var2.mo130250a(false);
            }
            this.f275856G.removeCallbacks(this.f275857H);
        }
        SnsMethodCalculate.markEndTimeMs("setFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        View findViewById = this.f276586n.findViewById(C0966R.C0970id.bsa);
        this.f275888d1 = findViewById;
        findViewById.setBackgroundColor(-16777216);
        int i = this.f276588p;
        int i2 = this.f276589q;
        boolean z = true;
        if (mo131546X().f296674B != 1) {
            findViewById.setPadding((int) mo131546X().f296499e, (int) mo131546X().f296497c, (int) mo131546X().f296500f, (int) mo131546X().f296498d);
        } else if (((int) mo131546X().f296507m) > 0) {
            i2 = (((int) mo131546X().f296508n) * i) / ((int) mo131546X().f296507m);
            findViewById.setPadding((int) mo131546X().f296499e, (int) mo131546X().f296497c, (int) mo131546X().f296500f, (int) mo131546X().f296498d);
        }
        findViewById.setLayoutParams(new RelativeLayout.LayoutParams(i, i2));
        findViewById.setMinimumHeight(i2);
        Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "createView, displayType=" + mo131546X().f296674B + ", containerW=" + i + ", vH=" + i2 + ", padding=" + C102260r.m134832A(findViewById));
        AdLandingVideoWrapper adLandingVideoWrapper = (AdLandingVideoWrapper) findViewById.findViewById(C0966R.C0970id.l7x);
        this.f275890x = adLandingVideoWrapper;
        adLandingVideoWrapper.setIMMVideoViewCallback(this);
        this.f275890x.setOnClickListener(this.f275891x0);
        this.f275890x.setFullScreen(false);
        this.f275890x.mo76636h(false, mo131546X().f296680z, 0);
        this.f275890x.setIsShowBasicControls(true);
        SnsMethodCalculate.markStartTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (!mo131546X().f296676D) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "fixVideoBlackline, enable=false");
            SnsMethodCalculate.markEndTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        } else {
            View innerVideoView = this.f275890x.getInnerVideoView();
            SnsMethodCalculate.markStartTimeMs("hasPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            C101284p0 X = mo131546X();
            boolean z2 = (X.f296499e == 0.0f && X.f296497c == 0.0f && X.f296500f == 0.0f && X.f296498d == 0.0f) ? false : true;
            SnsMethodCalculate.markEndTimeMs("hasPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            if (!(innerVideoView instanceof VideoPlayerTextureView) || mo131546X().f296674B != 1 || z2) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "onLayoutChange, innerVideoView=" + innerVideoView + ", displayType=" + mo131546X().f296674B + ", hasPadding=" + z2);
            } else {
                innerVideoView.addOnLayoutChangeListener(new C95070b2(this));
            }
            SnsMethodCalculate.markEndTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        }
        this.f275851B = (ProgressBar) findViewById.findViewById(C0966R.C0970id.i89);
        this.f275850A = (ImageView) findViewById.findViewById(C0966R.C0970id.kk6);
        C86013q1.m106450k(C100891r.m132217l("adId", mo131546X().f296673A));
        C100891r.m132207b("adId", mo131546X().f296673A, false, 1000000001, 0, new C95055g());
        ((TextView) findViewById.findViewById(C0966R.C0970id.ckr)).setText(this.f275855F.getString(C0966R.string.f360348c13));
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.jqq);
        this.f275853D = findViewById2;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view = findViewById2;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        VideoPlayerSeekBar videoPlayerSeekBar = new VideoPlayerSeekBar(this.f275855F);
        this.f275892y = videoPlayerSeekBar;
        videoPlayerSeekBar.setVisibility(4);
        C95195n2 n2Var = this.f275879X;
        if (n2Var != null) {
            n2Var.mo130250a(this.f275892y.getVisibility() == 0);
        }
        this.f275892y.setIplaySeekCallback(this);
        this.f275892y.setOnPlayButtonClickListener(this.f275881Y);
        int b = C76577a.m92151b(this.f275855F, 75);
        if (mo140729I() && mo140730J()) {
            b = 0;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i - b, -2);
        layoutParams.addRule(12);
        this.f275892y.setLayoutParams(layoutParams);
        this.f275890x.setVideoFooterView(this.f275892y);
        if (!mo140730J()) {
            ImageView imageView = (ImageView) findViewById.findViewById(C0966R.C0970id.jqs);
            this.f275894z = imageView;
            imageView.setVisibility(4);
            this.f275894z.setOnClickListener(this.f275883Z);
            try {
                ViewParent parent = this.f275894z.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f275894z);
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f275894z.getLayoutParams();
                layoutParams2.bottomMargin = C76577a.m92151b(this.f275855F, 8);
                layoutParams2.rightMargin = C76577a.m92151b(this.f275855F, 10);
                ((ViewGroup) findViewById).addView(this.f275894z, layoutParams2);
                Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "init voiceTypeBtn and visible");
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
            }
        } else {
            View findViewById3 = findViewById.findViewById(C0966R.C0970id.jqs);
            if (findViewById3 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view2 = findViewById3;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        ImageView imageView2 = (ImageView) findViewById.findViewById(C0966R.C0970id.k17);
        this.f275854E = imageView2;
        imageView2.setImageDrawable(C76577a.m92158i(this.f275855F, C0966R.raw.shortvideo_play_btn));
        this.f275854E.setVisibility(8);
        this.f275854E.setOnClickListener(this.f275889p0);
        ((ViewGroup) this.f275892y.getParent()).removeView(this.f275892y);
        layoutParams.bottomMargin = 0;
        ((ViewGroup) findViewById).addView(this.f275892y, layoutParams);
        this.f275890x.setVideoPlayCallback(new C95056h());
        View view3 = this.f275888d1;
        SnsMethodCalculate.markStartTimeMs("initFullScreenBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f275868R0 = C76577a.m92151b(this.f275855F, 32);
            this.f275890x.setOnTouchListener(this);
            if (!mo140729I()) {
                ImageView imageView3 = (ImageView) view3.findViewById(C0966R.C0970id.jqr);
                this.f275893y0 = imageView3;
                ViewParent parent2 = imageView3.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.f275893y0);
                }
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f275893y0.getLayoutParams();
                layoutParams3.bottomMargin = C76577a.m92151b(this.f275855F, 8);
                layoutParams3.rightMargin = C76577a.m92151b(this.f275855F, 10);
                ((ViewGroup) view3).addView(this.f275893y0, layoutParams3);
                this.f275893y0.setOnClickListener(this);
                this.f275893y0.setVisibility(8);
                Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "init fullScreenBtn and visible");
            }
        } catch (Throwable th4) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th4.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initFullScreenBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markStartTimeMs("initProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f275890x.setLoop(true);
            this.f275890x.setLoopCompletionCallback(this);
            ViewParent parent3 = this.f275892y.getParent();
            if (parent3 instanceof ViewGroup) {
                ((ViewGroup) parent3).removeView(this.f275892y);
            }
            int b2 = C76577a.m92151b(this.f275855F, 75);
            if (mo140729I() && mo140730J()) {
                b2 = 0;
            }
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.f275888d1.getLayoutParams().width - b2, -2);
            layoutParams4.addRule(12);
            layoutParams4.bottomMargin = C76577a.m92151b(this.f275855F, 3);
            this.f275892y.setLayoutParams(layoutParams4);
            ((ViewGroup) this.f276586n.findViewById(C0966R.C0970id.bsa)).addView(this.f275892y, layoutParams4);
            this.f275892y.setVisibility(4);
            mo131554i0(false);
            C95195n2 n2Var2 = this.f275879X;
            if (n2Var2 != null) {
                if (this.f275892y.getVisibility() != 0) {
                    z = false;
                }
                n2Var2.mo130250a(z);
            }
            Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "init progressBar and visible");
        } catch (Throwable th5) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th5.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        View view4 = this.f275888d1;
        SnsMethodCalculate.markStartTimeMs("initPauseVideoUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            View findViewById4 = view4.findViewById(C0966R.C0970id.hrx);
            this.f275866Q0 = findViewById4;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(findViewById4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "initPauseVideoUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "initPauseVideoUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (Throwable th6) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th6.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initPauseVideoUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: e0 */
    public void mo131551e0(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, long j, boolean z3, int i7, String str, long j2) {
        boolean z4;
        int i8 = i;
        boolean z5 = z;
        boolean z6 = z2;
        int i9 = i7;
        SnsMethodCalculate.markStartTimeMs("setNonFullScreenVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f275890x.setNeedPause(false);
            this.f275865Q = 6;
            this.f275885a1 += j2;
            this.f275874U0 = z6;
            this.f275882Y0++;
            this.f275875V += i2;
            this.f275880X0 += i3;
            this.f275877W += i4;
            this.f275873U += i5;
            this.f275871T += i6;
            this.f275869S = (int) (((long) this.f275869S) + j);
            if (!Util.isNullOrNil(str)) {
                mo131553h0(str);
            }
            if (z6) {
                this.f275867R = System.currentTimeMillis();
            }
            this.f275856G.removeCallbacks(this.f275872T0);
            View view = this.f275866Q0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setNonFullScreenVideoPlay", "(IZZIIIIIJZILjava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "setNonFullScreenVideoPlay", "(IZZIIIIIJZILjava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105924i("VideoFullScreenActivity", "currPosSec = " + i8 + ", isPlaying = " + z6 + ", bNoVoice = " + z5);
            if (z3) {
                if (i9 != this.f275890x.getVideoDurationSec()) {
                    if (i9 >= 0) {
                        this.f275892y.seek(this.f275890x.getCacheTimeSec());
                        AdLandingVideoWrapper adLandingVideoWrapper = this.f275890x;
                        adLandingVideoWrapper.mo79613a((double) adLandingVideoWrapper.getCacheTimeSec(), true);
                        z4 = true;
                        this.f275867R = System.currentTimeMillis();
                        mo131554i0(z4);
                    }
                }
                this.f275892y.seek(0);
                z4 = true;
                this.f275890x.mo79613a(0.0d, true);
                this.f275867R = System.currentTimeMillis();
                mo131554i0(z4);
            } else {
                if (i8 != this.f275890x.getVideoDurationSec()) {
                    if (i8 >= 0) {
                        this.f275892y.seek(i8);
                        this.f275890x.mo79613a((double) i8, z6);
                        mo131554i0(z6);
                    }
                }
                this.f275892y.seek(0);
                this.f275890x.mo79613a(0.0d, z6);
                mo131554i0(z6);
            }
            if (z5) {
                mo130232G();
            } else {
                mo130234M();
            }
        } catch (Throwable th) {
            Log.m105920e("VideoFullScreenActivity", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setNonFullScreenVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: g0 */
    public final void mo131552g0() {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "starting play, downFailed=" + this.f275864P);
        if (this.f275864P) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "last download fail ,try again");
            VideoPlayerSeekBar videoPlayerSeekBar = this.f275892y;
            if (!(videoPlayerSeekBar == null || videoPlayerSeekBar.getParent() == null)) {
                ((ViewGroup) this.f275892y.getParent()).removeView(this.f275892y);
            }
            this.f275890x.setFullScreen(false);
            this.f275890x.mo76636h(false, mo131546X().f296680z, 0);
            try {
                int i = this.f276588p;
                VideoPlayerSeekBar videoPlayerSeekBar2 = this.f275892y;
                if (!(videoPlayerSeekBar2 == null || videoPlayerSeekBar2.getParent() == null)) {
                    ((ViewGroup) this.f275892y.getParent()).removeView(this.f275892y);
                }
                int b = C76577a.m92151b(this.f275855F, 75);
                if (mo140729I() && mo140730J()) {
                    b = 0;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i - b, -2);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = C76577a.m92151b(this.f275855F, 3);
                this.f275892y.setLayoutParams(layoutParams);
                ((ViewGroup) this.f276586n.findViewById(C0966R.C0970id.bsa)).addView(this.f275892y, layoutParams);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "startPlay exp=" + Util.stackTraceToString(e));
            }
            mo131549c0(0, true);
            this.f275890x.mo131774g();
            SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return;
        }
        this.f275856G.post(new C95051a());
        this.f275867R = System.currentTimeMillis();
        this.f275871T++;
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: h0 */
    public final void mo131553h0(String str) {
        SnsMethodCalculate.markStartTimeMs("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f275884Z0 == null) {
                this.f275884Z0 = new C95058j();
            }
            this.f275884Z0.f275904a += jSONObject.optInt(C102646h.COL_EXPOSURECOUNT);
            this.f275884Z0.f275905b += jSONObject.optLong("stayTime");
            this.f275884Z0.f275906c += jSONObject.optInt("clickCount");
            JSONObject optJSONObject = jSONObject.optJSONObject("btnInfo");
            this.f275884Z0.f275907d = optJSONObject.optString("cid");
            this.f275884Z0.f275908e += optJSONObject.optInt(C102646h.COL_EXPOSURECOUNT);
            this.f275884Z0.f275909f += optJSONObject.optLong("stayTime");
            this.f275884Z0.f275910g += optJSONObject.optInt("clickCount");
        } catch (Throwable th) {
            this.f275884Z0 = null;
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: i0 */
    public final void mo131554i0(boolean z) {
        SnsMethodCalculate.markStartTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            this.f275892y.setIsPlay(z);
            this.f275892y.getPlayBtn().getLayoutParams().width = this.f275868R0;
            this.f275892y.getPlayBtn().getLayoutParams().height = this.f275868R0;
            if (z) {
                Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "startPlay");
                this.f275892y.getPlayBtn().setImageDrawable(C76577a.m92158i(this.f275855F, C0966R.raw.media_player_btn_cur_status_on));
            } else {
                Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "pausePlay");
                this.f275892y.getPlayBtn().setImageDrawable(C76577a.m92158i(this.f275855F, C0966R.raw.media_player_btn_cur_status_off));
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", "the onVideoPlay is called!");
        C92278a aVar = this.f296491u;
        if (aVar != null) {
            aVar.mo126267a();
        }
        this.f275850A.setVisibility(8);
        this.f275851B.setVisibility(8);
        try {
            this.f275856G.removeCallbacks(this.f275872T0);
            View view = this.f275866Q0;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo131554i0(true);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return C0966R.C0971layout.c1d;
    }

    /* renamed from: o */
    public long mo131555o() {
        SnsMethodCalculate.markStartTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        long o = super.mo131555o() + this.f275885a1;
        SnsMethodCalculate.markEndTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return o;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (view.getId() == C0966R.C0970id.jqr) {
            Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "click full screen btn");
            try {
                if (this.f275855F instanceof SnsAdNativeLandingPagesUI) {
                    this.f275882Y0++;
                    this.f275856G.removeCallbacks(this.f275872T0);
                    View view2 = this.f275866Q0;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) this.f275855F;
                    C95057i.f275903a = mo131546X();
                    C94978z0.f275381a = mo131854m();
                    Intent intent = new Intent(snsAdNativeLandingPagesUI, VideoFullScreenActivity.class);
                    intent.putExtra("KComponentVideoType", 1);
                    intent.putExtra("KComponentCid", mo131857r());
                    intent.putExtra("KComponentCurrentTime", this.f275890x.getCurrPosSec());
                    intent.putExtra("KComponentTotalTime", this.f275890x.getVideoDurationSec());
                    intent.putExtra("KComponentVoiceType", this.f275859J);
                    intent.putExtra("KComponentProgressType", mo130233K());
                    intent.putExtra("KComponentStreamVideoUrlPath", mo131546X().f296680z);
                    intent.putExtra("KComponentIsWaiting", this.f275876V0);
                    intent.putExtra("KComponentSeekTimeDueWaiting", this.f275878W0);
                    intent.putExtra("KComponentKComponentCacheTime", this.f275890x.getCacheTimeSec());
                    intent.putExtra("KComponentForceLandMode", mo131546X().f296679G);
                    this.f275890x.setNeedPause(true);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(2000);
                    aVar2.mo10233c(intent);
                    C117292a.m165364j(snsAdNativeLandingPagesUI, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    C115669n.INSTANCE.mo175911u(1720, 2);
                } else {
                    ImageView imageView = this.f275893y0;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                }
            } catch (Throwable th) {
                ImageView imageView2 = this.f275893y0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                Log.m105920e("VideoFullScreenActivity", th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "onDoubleTap");
            mo131544V(this.f275857H);
            if (!this.f275864P) {
                this.f275880X0++;
            }
            if (mo130233K()) {
                mo131548b0(true);
                this.f275865Q = 4;
            } else {
                if (this.f275859J) {
                    mo130232G();
                } else {
                    mo140727E();
                    mo130234M();
                }
                mo131552g0();
                this.f275865Q = 3;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
        SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public void onSeekPre() {
        SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        this.f275858I = true;
        mo131544V(this.f275857H);
        SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public void onShowPress(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        try {
            Log.m105924i("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", "onSingleTapConfirmed");
            if (!this.f275858I) {
                this.f275858I = true;
                mo131550d0(true);
            } else {
                this.f275858I = false;
                mo131550d0(false);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        GestureDetector gestureDetector = this.f275870S0;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageStreamVideoPlayerComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    /* renamed from: t */
    public void mo130247t() {
        SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        super.mo130247t();
        mo131548b0(false);
        String l = C100891r.m132217l("adId", mo131546X().f296673A);
        if (C86013q1.m106450k(l)) {
            this.f275850A.setImageBitmap(BitmapUtil.decodeFile(l));
            this.f275850A.setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return false;
        }
        try {
            jSONObject2.put("streamVideoDuraion", this.f275890x.getVideoDurationSec() * 1000);
            jSONObject2.put("playTimeInterval", this.f275869S);
            jSONObject2.put("playCount", this.f275871T);
            jSONObject2.put("playCompletedCount", this.f275873U);
            jSONObject2.put("clickFullscreenBtnCount", this.f275882Y0);
            jSONObject2.put("doubleClickCount", this.f275880X0);
            jSONObject2.put("clickPlayControlCount", this.f275875V);
            jSONObject2.put("clickVoiceControlCount", this.f275877W);
            jSONObject2.put("isAutoPlay", this.f275863N ? "1" : "0");
            String mD5String = MD5Util.getMD5String(mo131546X().f296673A);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("urlMd5", mD5String);
            jSONObject3.put("needDownload", 1);
            jSONObject2.put("thumbUrlInfo", jSONObject3);
            String mD5String2 = MD5Util.getMD5String(mo131546X().f296680z);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("urlMd5", mD5String2);
            jSONObject4.put("needDownload", 1);
            jSONObject2.put("streamVideoUrlInfo", jSONObject4);
            if (this.f275884Z0 != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("cid", this.f275884Z0.f275907d);
                jSONObject5.put(C102646h.COL_EXPOSURECOUNT, this.f275884Z0.f275908e);
                jSONObject5.put("stayTime", this.f275884Z0.f275909f);
                jSONObject5.put("clickCount", this.f275884Z0.f275910g);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(C102646h.COL_EXPOSURECOUNT, this.f275884Z0.f275904a);
                jSONObject6.put("stayTime", this.f275884Z0.f275905b);
                jSONObject6.put("clickCount", this.f275884Z0.f275906c);
                jSONObject6.put("btnInfo", jSONObject5);
                jSONObject2.put("fullVideoFloatBarInfo", jSONObject6);
            }
            C99572w.m129967a(62, mo131854m(), mo131555o(), this.f275869S, "MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent");
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Sns.AdLandingPageStreamVideoPlayerComponent", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageStreamVideoPlayerComponent");
            return false;
        }
    }
}
