package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import a70.C112760b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bp2.C92278a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenSnsAdFloatPageEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94978z0;
import com.tencent.p014mm.plugin.sns.p106ui.OfflineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdStreamVideoPlayUI;
import com.tencent.p014mm.plugin.sns.p106ui.VideoFullScreenActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerSeekBar;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lo2.C99556n;
import lo2.C99572w;
import org.json.JSONException;
import org.json.JSONObject;
import p1208q3.C118144a;
import p749xh.C102646h;
import p749xh.C66261f3;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101253a;
import qs2.C101271i0;
import qs2.C101297w;
import sn0.C90259e;
import vr2.C37817q;
import wo2.C102464b;
import xn2.C102693c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1 */
public class C95222u1 extends C101253a implements View.OnTouchListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, View.OnClickListener {

    /* renamed from: A */
    public Context f276319A;

    /* renamed from: B */
    public MMHandler f276320B;

    /* renamed from: C */
    public boolean f276321C;

    /* renamed from: D */
    public long f276322D = 0;

    /* renamed from: E */
    public int f276323E = 0;

    /* renamed from: F */
    public int f276324F = 0;

    /* renamed from: G */
    public int f276325G = 0;

    /* renamed from: H */
    public int f276326H = 0;

    /* renamed from: I */
    public int f276327I = 0;

    /* renamed from: J */
    public int f276328J = 0;

    /* renamed from: K */
    public int f276329K = 0;

    /* renamed from: L */
    public ImageView f276330L;

    /* renamed from: M */
    public int f276331M = 0;

    /* renamed from: N */
    public int f276332N = 0;

    /* renamed from: P */
    public boolean f276333P = true;

    /* renamed from: Q */
    public volatile int f276334Q = 0;

    /* renamed from: Q0 */
    public volatile boolean f276335Q0 = false;

    /* renamed from: R */
    public boolean f276336R = false;

    /* renamed from: R0 */
    public GestureDetector f276337R0;

    /* renamed from: S */
    public boolean f276338S = true;

    /* renamed from: S0 */
    public Runnable f276339S0;

    /* renamed from: T */
    public boolean f276340T = true;

    /* renamed from: T0 */
    public Runnable f276341T0;

    /* renamed from: U */
    public boolean f276342U = true;

    /* renamed from: U0 */
    public C95195n2 f276343U0 = null;

    /* renamed from: V */
    public String f276344V;

    /* renamed from: V0 */
    public View.OnClickListener f276345V0;

    /* renamed from: W */
    public boolean f276346W;

    /* renamed from: W0 */
    public C102693c f276347W0;

    /* renamed from: X */
    public boolean f276348X = false;

    /* renamed from: X0 */
    public int f276349X0;

    /* renamed from: Y */
    public boolean f276350Y;

    /* renamed from: Y0 */
    public int f276351Y0;

    /* renamed from: Z */
    public VideoPlayerSeekBar f276352Z;

    /* renamed from: Z0 */
    public int f276353Z0;

    /* renamed from: a1 */
    public C95240n f276354a1;

    /* renamed from: b1 */
    public long f276355b1;

    /* renamed from: c1 */
    public C95238l f276356c1;

    /* renamed from: d1 */
    public boolean f276357d1;

    /* renamed from: e1 */
    public View f276358e1;

    /* renamed from: f1 */
    public View f276359f1;

    /* renamed from: p0 */
    public ImageView f276360p0;

    /* renamed from: x */
    public OfflineVideoView f276361x;

    /* renamed from: x0 */
    public View f276362x0;

    /* renamed from: y */
    public View f276363y;

    /* renamed from: y0 */
    public int f276364y0;

    /* renamed from: z */
    public int f276365z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$a */
    public class C95223a implements Runnable {
        public C95223a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$12");
            OfflineVideoView Y = C95222u1.m121194Y(C95222u1.this);
            Y.getClass();
            SnsMethodCalculate.markStartTimeMs("uiTouchStart", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            Log.m105925i("MicroMsg.OfflineVideoView", "%d start hasResumed[%b], curPos [%d], duration [%d], shouldSeek [%d]", Integer.valueOf(Y.hashCode()), Boolean.valueOf(Y.f277123p), Integer.valueOf(Y.f277119i.getCurrentPosition()), Integer.valueOf(Y.f277119i.getDuration()), Integer.valueOf(Y.f277125r));
            Y.f277124q = true;
            if (!Y.f277123p) {
                Y.mo132292j();
            } else if (Util.isNullOrNil(Y.f277119i.getVideoPath())) {
                Y.mo132292j();
            } else if (Y.f277119i.getCurrentPosition() >= Y.f277119i.getDuration()) {
                Y.f277119i.mo24787a(0.0d, true);
                OfflineVideoView.C95361h hVar = Y.f277116f;
                if (hVar != null) {
                    hVar.mo131755b(Y.f277127t);
                }
            } else {
                Y.f277119i.start();
            }
            Y.mo132297o();
            SnsMethodCalculate.markEndTimeMs("uiTouchStart", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            C95222u1 u1Var = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            u1Var.mo131732n0();
            SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            try {
                C95222u1.m121193X(C95222u1.this, true);
                C95222u1 u1Var2 = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                MMHandler mMHandler = u1Var2.f276320B;
                SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                C95222u1 u1Var3 = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                Runnable runnable = u1Var3.f276341T0;
                SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                mMHandler.removeCallbacks(runnable);
                View R = C95222u1.m121189R(C95222u1.this);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(R, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                R.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(R, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$b */
    public class C95224b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f276367d;

        public C95224b(boolean z) {
            this.f276367d = z;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$13");
            C95222u1.m121194Y(C95222u1.this).mo132300r();
            try {
                C95222u1.m121193X(C95222u1.this, false);
                C95222u1 u1Var = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                boolean z = u1Var.f276321C;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                if (z && this.f276367d) {
                    View R = C95222u1.m121189R(C95222u1.this);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(R, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    R.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(R, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$13", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C95222u1 u1Var2 = C95222u1.this;
                    SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    Runnable runnable = u1Var2.f276341T0;
                    SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    C95222u1.m121197d0(u1Var2, runnable);
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$13");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$c */
    public class C95225c implements Runnable {
        public C95225c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$1");
            C95222u1 u1Var = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            u1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("invisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            try {
                if (u1Var.f276321C) {
                    if (u1Var.f276352Z.getVisibility() == 0) {
                        u1Var.f276352Z.setVisibility(4);
                        ImageView imageView = u1Var.f276360p0;
                        if (imageView != null) {
                            imageView.setVisibility(4);
                        }
                        C95195n2 n2Var = u1Var.f276343U0;
                        if (n2Var != null) {
                            n2Var.mo130250a(false);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("invisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$d */
    public class C95226d implements Runnable {
        public C95226d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$2");
            View R = C95222u1.m121189R(C95222u1.this);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(R, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(R, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$e */
    public class C95227e implements C95195n2 {

        /* renamed from: a */
        public final /* synthetic */ Context f276371a;

        public C95227e(Context context) {
            this.f276371a = context;
        }

        /* renamed from: a */
        public void mo130250a(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onProgressBarShowedStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$3");
            try {
                Intent intent = new Intent("com.tencent.mm.adlanding.video_progressbar_change");
                intent.putExtra("show", z ? 1 : 0);
                C95222u1 u1Var = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                int H = u1Var.mo140728H();
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                intent.putExtra("activity_code", H);
                C118144a.m166672a(this.f276371a).mo182944c(intent);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onProgressBarShowedStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$f */
    public class C95228f implements C100880k.C100881a {
        public C95228f() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$4");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$4");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$4");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$4");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$4");
            C95222u1.m121194Y(C95222u1.this).mo132281e(str);
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$g */
    public class C95229g implements View.OnClickListener {
        public C95229g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$5");
            C95222u1 u1Var = C95222u1.this;
            u1Var.f276331M++;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            Runnable runnable = u1Var.f276339S0;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C95222u1.m121197d0(u1Var, runnable);
            C95222u1 u1Var2 = C95222u1.this;
            if (u1Var2.f276333P) {
                u1Var2.mo140727E();
                C95222u1.this.mo130234M();
            } else {
                u1Var2.mo130232G();
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$h */
    public class C95230h implements OfflineVideoView.C95361h {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$h$a */
        public class C95231a implements C100880k.C100881a {

            /* renamed from: a */
            public final /* synthetic */ String f276376a;

            /* renamed from: b */
            public final /* synthetic */ String f276377b;

            /* renamed from: c */
            public final /* synthetic */ long f276378c;

            public C95231a(String str, String str2, long j) {
                this.f276376a = str;
                this.f276377b = str2;
                this.f276378c = j;
            }

            /* renamed from: a */
            public void mo76113a() {
                SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$1");
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "downloadSightForAdLandingPages fail:" + this.f276376a);
                C95222u1.m121199g0(C95222u1.this, true);
                C95222u1 u1Var = C95222u1.this;
                String str = this.f276377b;
                u1Var.getClass();
                SnsMethodCalculate.markStartTimeMs("delErrFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                int i = 0;
                String str2 = "0";
                try {
                    if (C86013q1.m106450k(str)) {
                        str2 = "1";
                        if (C86013q1.m106447h(str)) {
                            i = 1;
                        }
                    }
                    String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                    C37817q.m41545a("sight_del_err_file", str2, 1, i, "http|" + formatedNetType);
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "delErrorFile exp=" + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("delErrFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$1");
            }

            /* renamed from: b */
            public void mo76114b() {
                SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$1");
                SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$1");
            }

            /* renamed from: c */
            public void mo76115c(String str) {
                SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$1");
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "downloadSightForAdLandingPages succ, video view height " + C95222u1.this.f276586n.getHeight() + ", player height " + C95222u1.m121194Y(C95222u1.this).getHeight() + ", timeCost=" + (System.currentTimeMillis() - this.f276378c));
                C95222u1.m121199g0(C95222u1.this, false);
                C95222u1 u1Var = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var.f276344V = str;
                SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                C95222u1.m121194Y(C95222u1.this).mo132293k(str);
                C95222u1 u1Var2 = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var2.f276346W = true;
                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$h$b */
        public class C95232b implements C100880k.C100881a {

            /* renamed from: a */
            public final /* synthetic */ String f276380a;

            /* renamed from: b */
            public final /* synthetic */ long f276381b;

            public C95232b(String str, long j) {
                this.f276380a = str;
                this.f276381b = j;
            }

            /* renamed from: a */
            public void mo76113a() {
                SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$2");
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "downloadSightForAdLandingPagesByCdn fail:" + this.f276380a);
                C95222u1.m121199g0(C95222u1.this, true);
                SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$2");
            }

            /* renamed from: b */
            public void mo76114b() {
                SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$2");
                SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$2");
            }

            /* renamed from: c */
            public void mo76115c(String str) {
                SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$2");
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "downloadSightForAdLandingPagesByCdn succ, video view height " + C95222u1.this.f276586n.getHeight() + ", player height " + C95222u1.m121194Y(C95222u1.this).getHeight() + ", timeCost=" + (System.currentTimeMillis() - this.f276381b));
                C95222u1.m121199g0(C95222u1.this, false);
                C95222u1 u1Var = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var.f276344V = str;
                SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                C95222u1.m121194Y(C95222u1.this).mo132293k(str);
                C95222u1 u1Var2 = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var2.f276346W = true;
                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$2");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$h$c */
        public class C95233c implements Runnable {
            public C95233c() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$3");
                if (C95222u1.m121198e0(C95222u1.this).f296763J != null && !C95222u1.m121190U(C95222u1.this)) {
                    int durationMs = C95222u1.m121194Y(C95222u1.this).getDurationMs();
                    int i = C95222u1.m121198e0(C95222u1.this).f296763J.f296648b;
                    Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "OpenSnsAdFloatPageEvent, onCompletion totalMs=" + durationMs + ", floatStartTime=" + i + ", hasShowFloat=" + C95222u1.m121190U(C95222u1.this));
                    if (durationMs < i) {
                        C95222u1 u1Var = C95222u1.this;
                        SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        u1Var.f276350Y = true;
                        SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent = new OpenSnsAdFloatPageEvent();
                        openSnsAdFloatPageEvent.f264978d.f264979a = C95222u1.m121198e0(C95222u1.this).f296763J.f296647a;
                        openSnsAdFloatPageEvent.publish();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$3");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$h$d */
        public class C95234d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f276384d;

            public C95234d(int i) {
                this.f276384d = i;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$4");
                StringBuilder sb = new StringBuilder();
                sb.append("play time ");
                sb.append(this.f276384d);
                sb.append(" video time ");
                C95222u1 u1Var = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                int i = u1Var.f276365z;
                SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                sb.append(i);
                Log.m105918d("MicroMsg.Sns.AdLandingPageSightVideoComponent", sb.toString());
                C95222u1 u1Var2 = C95222u1.this;
                int i2 = this.f276384d;
                SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var2.mo131747r0(i2);
                SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                if (C95222u1.m121198e0(C95222u1.this).f296763J != null && !C95222u1.m121190U(C95222u1.this)) {
                    int i3 = C95222u1.m121198e0(C95222u1.this).f296763J.f296648b / 1000;
                    Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "OpenSnsAdFloatPageEvent, updateTime seconds=" + this.f276384d + ", floatSeconds=" + i3 + ", hasShowFloat=" + C95222u1.m121190U(C95222u1.this));
                    if (this.f276384d >= i3) {
                        C95222u1 u1Var3 = C95222u1.this;
                        SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        u1Var3.f276350Y = true;
                        SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent = new OpenSnsAdFloatPageEvent();
                        openSnsAdFloatPageEvent.f264978d.f264979a = C95222u1.m121198e0(C95222u1.this).f296763J.f296647a;
                        openSnsAdFloatPageEvent.publish();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6$4");
            }
        }

        public C95230h() {
        }

        /* renamed from: a */
        public void mo131754a(int i) {
            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
            C95222u1 u1Var = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C92278a aVar = u1Var.f296491u;
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            aVar.mo126267a();
            MMHandlerThread.postToMainThread(new C95234d(i / 1000));
            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
        }

        /* renamed from: b */
        public void mo131755b(int i) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
            C95222u1 u1Var = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            u1Var.f276321C = true;
            SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C95222u1 u1Var2 = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            u1Var2.f276365z = i;
            SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            ImageView imageView = C95222u1.this.f276330L;
            boolean z = false;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            try {
                if (C95222u1.m121191V(C95222u1.this).getVideoTotalTime() != i) {
                    VideoPlayerSeekBar V = C95222u1.m121191V(C95222u1.this);
                    C95222u1 u1Var3 = C95222u1.this;
                    SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    int i2 = u1Var3.f276365z;
                    SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    V.setVideoTotalTime(i2);
                }
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "onStart");
                C101271i0 m = C95222u1.this.mo131854m();
                m.getClass();
                SnsMethodCalculate.markStartTimeMs("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                long j = m.f296632q;
                SnsMethodCalculate.markEndTimeMs("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                int i3 = (int) j;
                if (C95222u1.m121192W(C95222u1.this) instanceof SnsAdNativeLandingPagesUI) {
                    ((SnsAdNativeLandingPagesUI) C95222u1.m121192W(C95222u1.this)).mo132519W8();
                    Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "snsId = " + C95222u1.this.mo131854m().mo140741h() + ", adSightVideoSeekTime = " + i3 + ", isFirstSightVideoComp = " + C95222u1.this.f276357d1);
                    if (C95222u1.this.f276357d1) {
                        int i4 = i * 1000;
                        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        SnsMethodCalculate.markStartTimeMs("checkAdPos", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        if (i3 > 0 && i3 < i4) {
                            z = true;
                        }
                        SnsMethodCalculate.markEndTimeMs("checkAdPos", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                        if (z) {
                            C95222u1.m121194Y(C95222u1.this).mo132301s(i3, true);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
        }

        /* renamed from: c */
        public boolean mo131756c(PString pString, PString pString2) {
            SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
            long currentTimeMillis = System.currentTimeMillis();
            String str = C95222u1.m121198e0(C95222u1.this).f296769z;
            String n = C100891r.m132219n("adId", str);
            if (C86013q1.m106450k(n)) {
                try {
                    C95222u1 u1Var = C95222u1.this;
                    int i = u1Var.f276580e.f296519y;
                    u1Var.mo131854m().mo140742i();
                    SnsMethodCalculate.markStartTimeMs("reportSightCacheHit", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper");
                    ((C119157j) C119157j.f356862d).mo183875f(new C102464b(true));
                    SnsMethodCalculate.markEndTimeMs("reportSightCacheHit", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper");
                } catch (Throwable unused) {
                }
                pString.value = n;
                C95222u1 u1Var2 = C95222u1.this;
                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                u1Var2.f276346W = true;
                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
                return true;
            }
            try {
                C95222u1 u1Var3 = C95222u1.this;
                int i2 = u1Var3.f276580e.f296519y;
                u1Var3.mo131854m().mo140742i();
                SnsMethodCalculate.markStartTimeMs("reportSightCacheHit", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper");
                ((C119157j) C119157j.f356862d).mo183875f(new C102464b(false));
                SnsMethodCalculate.markEndTimeMs("reportSightCacheHit", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper");
            } catch (Throwable unused2) {
            }
            if (C95222u1.m121198e0(C95222u1.this).f296766M) {
                C100891r.m132210e("adId", str, false, 62, 0, new C95231a(str, n, currentTimeMillis));
            } else {
                C100891r.m132211f("adId", str, new C95232b(str, currentTimeMillis));
            }
            SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
            return false;
        }

        public void onCompletion() {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
            MMHandlerThread.postToMainThread(new C95233c());
            C95222u1 u1Var = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$1108", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            u1Var.f276325G++;
            SnsMethodCalculate.markEndTimeMs("access$1108", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C95222u1 u1Var2 = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C92278a aVar = u1Var2.f296491u;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
            aVar.f264111a = true;
            SnsMethodCalculate.markEndTimeMs("recordVideoCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.helper.video.VideoCompletionMessageHelper");
            C95222u1 u1Var3 = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            u1Var3.getClass();
            SnsMethodCalculate.markStartTimeMs("restart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            u1Var3.f276361x.mo132294l(0, true);
            SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$i */
    public class C95235i implements View.OnClickListener {
        public C95235i() {
        }

        public void onClick(View view) {
            String str;
            C95235i iVar;
            String str2;
            String str3;
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$7");
            C95222u1 u1Var = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            boolean z2 = u1Var.f276321C;
            SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            String str4 = "(Landroid/view/View;)V";
            if (z2) {
                C95222u1 u1Var2 = C95222u1.this;
                u1Var2.f276332N++;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                SnsMethodCalculate.markStartTimeMs("onSightVideoClickCheckingCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                if (!Util.isNullOrNil(u1Var2.mo131730i0().f296760G)) {
                    Intent intent = new Intent();
                    intent.putExtra("sns_landig_pages_from_source", 14);
                    intent.putExtra("sns_landig_pages_origin_from_source", u1Var2.mo131854m().mo140738e());
                    intent.putExtra("sns_landing_pages_ux_info", u1Var2.mo131854m().mo140745l());
                    intent.putExtra("sns_landing_pages_xml", "");
                    intent.putExtra("sns_landing_pages_canvasid", u1Var2.mo131730i0().f296760G);
                    intent.putExtra("sns_landing_pages_canvas_ext", u1Var2.mo131730i0().f296761H);
                    intent.putExtra("sns_landing_pages_no_store", u1Var2.mo131730i0().f296762I);
                    intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                    if ((u1Var2.f276319A instanceof Activity) && u1Var2.mo131854m().mo140736c() == 2) {
                        String stringExtra = ((Activity) u1Var2.f276319A).getIntent().getStringExtra("sns_landing_pages_sessionId");
                        String stringExtra2 = ((Activity) u1Var2.f276319A).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
                        if (!Util.isNullOrNil(stringExtra)) {
                            String str5 = "";
                            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
                            str3 = str4;
                            JSONObject jSONObject = new JSONObject();
                            str2 = "android/view/View$OnClickListener";
                            try {
                                jSONObject.put("sessionId", valueOf);
                                jSONObject.put("cid", u1Var2.mo131730i0().f296495a);
                                jSONObject.put("adBuffer", !Util.isNullOrNil(stringExtra2) ? stringExtra2 : str5);
                                jSONObject.put("preSessionId", stringExtra);
                            } catch (Exception unused) {
                            }
                            intent.putExtra("sns_landing_pages_search_extra", jSONObject.toString());
                            intent.putExtra("sns_landing_pages_sessionId", valueOf);
                            intent.putExtra("sns_landing_pages_ad_buffer", stringExtra2);
                            int[] iArr = new int[2];
                            u1Var2.f276361x.getLocationOnScreen(iArr);
                            intent.putExtra("img_gallery_top", iArr[1]);
                            intent.putExtra("img_gallery_left", iArr[0]);
                            intent.putExtra("img_gallery_width", u1Var2.f276361x.getWidth());
                            intent.putExtra("img_gallery_height", u1Var2.f276361x.getHeight());
                            C88144b.m109791i(u1Var2.f276319A, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
                            SnsMethodCalculate.markEndTimeMs("onSightVideoClickCheckingCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                            z = true;
                        }
                    }
                    str3 = str4;
                    str2 = "android/view/View$OnClickListener";
                    int[] iArr2 = new int[2];
                    u1Var2.f276361x.getLocationOnScreen(iArr2);
                    intent.putExtra("img_gallery_top", iArr2[1]);
                    intent.putExtra("img_gallery_left", iArr2[0]);
                    intent.putExtra("img_gallery_width", u1Var2.f276361x.getWidth());
                    intent.putExtra("img_gallery_height", u1Var2.f276361x.getHeight());
                    C88144b.m109791i(u1Var2.f276319A, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
                    SnsMethodCalculate.markEndTimeMs("onSightVideoClickCheckingCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    z = true;
                } else {
                    str3 = str4;
                    str2 = "android/view/View$OnClickListener";
                    SnsMethodCalculate.markEndTimeMs("onSightVideoClickCheckingCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                if (z) {
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$7");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7", str2, "onClick", str3);
                    return;
                }
                iVar = this;
                str4 = str3;
                str = str2;
            } else {
                str = "android/view/View$OnClickListener";
                iVar = this;
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$7");
            C117292a.m165361g(iVar, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$7", str, "onClick", str4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$j */
    public class C95236j implements View.OnClickListener {
        public C95236j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$8");
            C95222u1 u1Var = C95222u1.this;
            u1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C101297w i0 = u1Var.mo131730i0();
            if (Util.isNullOrNil(i0.f296755B)) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click without streamVideoUrl!");
                SnsMethodCalculate.markEndTimeMs("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            } else if (!(u1Var.f276319A instanceof Activity)) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click but context not activity!");
                SnsMethodCalculate.markEndTimeMs("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            } else {
                Log.m105927v("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click, jumpto [%s]", i0.f296755B);
                Intent intent = new Intent();
                intent.setClass(u1Var.f276319A, SnsAdStreamVideoPlayUI.class);
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "use new stream video play UI");
                intent.putExtra("KFromTimeLine", true);
                intent.putExtra("KMediaId", MD5Util.getMD5String(i0.f296755B));
                intent.putExtra("KThumUrl", i0.f296754A);
                intent.putExtra("KStremVideoUrl", i0.f296755B);
                intent.putExtra("ForceLandscape", true);
                intent.putExtra("ShareBtnHidden", 1);
                intent.putExtra("KComponentCid", u1Var.mo131857r());
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(2004);
                aVar.mo10233c(intent);
                C117292a.m165364j((Activity) u1Var.f276319A, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onStreamVideoAreaClick", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                u1Var.f276326H++;
                SnsMethodCalculate.markEndTimeMs("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$8");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$k */
    public class C95237k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f276388d;

        public C95237k(int i) {
            this.f276388d = i;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$9");
            if (C95222u1.m121191V(C95222u1.this) != null) {
                C95222u1.m121191V(C95222u1.this).seek(this.f276388d);
                C95222u1 u1Var = C95222u1.this;
                C95222u1.m121193X(u1Var, u1Var.mo130233K());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$l */
    public class C95238l implements AudioManager.OnAudioFocusChangeListener {
        public C95238l() {
        }

        public void onAudioFocusChange(int i) {
            SnsMethodCalculate.markStartTimeMs("onAudioFocusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$AudioFocusChangeListener");
            try {
                C95222u1.m121196c0(C95222u1.this, i);
            } catch (Throwable unused) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onAudioFocusChanged has something wrong!");
            }
            SnsMethodCalculate.markEndTimeMs("onAudioFocusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$AudioFocusChangeListener");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$m */
    public static class C95239m {

        /* renamed from: a */
        public static C101297w f276391a;
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$n */
    public static class C95240n {

        /* renamed from: a */
        public int f276392a;

        /* renamed from: b */
        public long f276393b;

        /* renamed from: c */
        public int f276394c;

        /* renamed from: d */
        public String f276395d;

        /* renamed from: e */
        public int f276396e;

        /* renamed from: f */
        public long f276397f;

        /* renamed from: g */
        public int f276398g;
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1$o */
    public class C95241o implements C96875r0.C96877c {
        public C95241o() {
        }

        /* renamed from: z */
        public void mo86881z(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$OnSeekCompleteCallback");
            Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onSeekComplete is called");
            C95222u1 u1Var = C95222u1.this;
            SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C92278a aVar = u1Var.f296491u;
            SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            aVar.mo126267a();
            SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$OnSeekCompleteCallback");
        }
    }

    public C95222u1(Context context, C101297w wVar, ViewGroup viewGroup) {
        super(context, wVar, viewGroup);
        SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C95214s1 s1Var = new C95214s1(this);
        SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        this.f276345V0 = s1Var;
        SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C95216t1 t1Var = new C95216t1(this);
        SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        this.f276347W0 = t1Var;
        this.f276349X0 = 0;
        this.f276351Y0 = 0;
        this.f276353Z0 = 0;
        this.f276355b1 = 0;
        this.f276357d1 = false;
        this.f276319A = context;
        this.f276320B = new MMHandler(Looper.getMainLooper());
        try {
            this.f276337R0 = new GestureDetector(this);
            this.f276339S0 = new C95225c();
            this.f276341T0 = new C95226d();
            C95227e eVar = new C95227e(context);
            SnsMethodCalculate.markStartTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            this.f276343U0 = eVar;
            SnsMethodCalculate.markEndTimeMs("setAdLandingPageStreamVideoComponentEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            C115669n.INSTANCE.mo175911u(1720, 4);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        C99556n.m129938a(wVar, false);
    }

    /* renamed from: R */
    public static /* synthetic */ View m121189R(C95222u1 u1Var) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        View view = u1Var.f276362x0;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return view;
    }

    /* renamed from: U */
    public static /* synthetic */ boolean m121190U(C95222u1 u1Var) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        boolean z = u1Var.f276350Y;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return z;
    }

    /* renamed from: V */
    public static /* synthetic */ VideoPlayerSeekBar m121191V(C95222u1 u1Var) {
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        VideoPlayerSeekBar videoPlayerSeekBar = u1Var.f276352Z;
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return videoPlayerSeekBar;
    }

    /* renamed from: W */
    public static /* synthetic */ Context m121192W(C95222u1 u1Var) {
        SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        Context context = u1Var.f276319A;
        SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return context;
    }

    /* renamed from: X */
    public static /* synthetic */ void m121193X(C95222u1 u1Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        u1Var.mo131748s0(z);
        SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: Y */
    public static /* synthetic */ OfflineVideoView m121194Y(C95222u1 u1Var) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        OfflineVideoView offlineVideoView = u1Var.f276361x;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return offlineVideoView;
    }

    /* renamed from: b0 */
    public static /* synthetic */ View m121195b0(C95222u1 u1Var) {
        SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        View view = u1Var.f276358e1;
        SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return view;
    }

    /* renamed from: c0 */
    public static void m121196c0(C95222u1 u1Var, int i) {
        SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        u1Var.getClass();
        SnsMethodCalculate.markStartTimeMs("onAudioFocusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onAudioFocusChanged is called" + i);
        SnsMethodCalculate.markEndTimeMs("onAudioFocusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m121197d0(C95222u1 u1Var, Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        u1Var.mo131729h0(runnable);
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: e0 */
    public static /* synthetic */ C101297w m121198e0(C95222u1 u1Var) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C101297w i0 = u1Var.mo131730i0();
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return i0;
    }

    /* renamed from: g0 */
    public static /* synthetic */ boolean m121199g0(C95222u1 u1Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        u1Var.f276348X = z;
        SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return z;
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.mo130145A();
        int l = mo131853l();
        int height = mo131855p().getHeight();
        Log.m105919d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "inScreenHeight %d, height %d", Integer.valueOf(l), Integer.valueOf(height));
        if (l == 0 || height == 0) {
            SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        } else if (l < 0) {
            SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        } else {
            Log.m105919d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "appeared handleType %d", Integer.valueOf(this.f276334Q));
            if (((float) l) < ((float) height) * 0.5f) {
                this.f276338S = false;
                this.f276336R = false;
                mo131731k0(false);
                if (this.f276334Q == 1) {
                    this.f276334Q = 2;
                }
            } else if (!this.f276336R || this.f276338S) {
                this.f276338S = false;
                this.f276336R = true;
                if (this.f276334Q == 6) {
                    if (this.f276335Q0) {
                        this.f276334Q = 1;
                    } else {
                        this.f276334Q = 4;
                    }
                    SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                    return;
                } else if (this.f276334Q == 0) {
                    if (this.f276333P) {
                        mo130232G();
                    } else {
                        mo130234M();
                    }
                    this.f276334Q = 1;
                    mo131745p0();
                } else if (this.f276334Q == 2) {
                    if (this.f276333P) {
                        mo130232G();
                    } else {
                        mo130234M();
                    }
                    mo131745p0();
                    this.f276334Q = 1;
                } else if (this.f276334Q == 3) {
                    if (this.f276333P) {
                        mo130232G();
                    } else {
                        mo130234M();
                    }
                    mo131745p0();
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                return;
            }
            SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        }
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.mo67235C();
        try {
            this.f276320B.removeCallbacks(this.f276339S0);
            this.f276320B.removeCallbacks(this.f276341T0);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        mo131728Q();
        this.f276361x.mo132291i();
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.mo124361D();
        mo131728Q();
        mo131731k0(false);
        if (this.f276336R || this.f276338S) {
            this.f276338S = false;
            this.f276336R = false;
            if (this.f276334Q == 1) {
                this.f276334Q = 2;
            }
            Log.m105919d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "disappear handleType %d", Integer.valueOf(this.f276334Q));
            SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: G */
    public void mo130232G() {
        SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.mo130232G();
        ImageView imageView = this.f276330L;
        if (imageView != null) {
            imageView.setImageDrawable(C76577a.m92158i(this.f276319A, C0966R.raw.icon_volume_off));
        }
        this.f276361x.setMute(true);
        this.f276333P = true;
        SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: K */
    public boolean mo130233K() {
        SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        boolean h = this.f276361x.mo132290h();
        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return h;
    }

    /* renamed from: M */
    public void mo130234M() {
        SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (mo140730J()) {
            SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return;
        }
        super.mo130234M();
        ImageView imageView = this.f276330L;
        if (imageView != null) {
            imageView.setImageDrawable(C76577a.m92158i(this.f276319A, C0966R.raw.icon_volume_on));
        }
        this.f276361x.setMute(false);
        this.f276333P = false;
        SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: N */
    public void mo130235N() {
        SnsMethodCalculate.markStartTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        mo131731k0(false);
        this.f276334Q = 4;
        SnsMethodCalculate.markEndTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: O */
    public void mo130236O() {
        SnsMethodCalculate.markStartTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        this.f276334Q = 3;
        mo131745p0();
        SnsMethodCalculate.markEndTimeMs("resumeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: P */
    public void mo130237P(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("videoSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        OfflineVideoView offlineVideoView = this.f276361x;
        if (offlineVideoView != null) {
            offlineVideoView.mo132294l(i, z);
        }
        SnsMethodCalculate.markEndTimeMs("videoSeekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: Q */
    public final void mo131728Q() {
        AudioManager audioManager;
        SnsMethodCalculate.markStartTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            if (!(this.f276356c1 == null || (audioManager = (AudioManager) this.f276319A.getSystemService("audio")) == null)) {
                audioManager.abandonAudioFocus(this.f276356c1);
                this.f276356c1 = null;
            }
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "abandonAudioFocus has something wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: e */
    public void mo67238e() {
        int i;
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (!C86013q1.m106450k(C100891r.m132217l("adId", mo131730i0().f296754A))) {
            this.f276340T = false;
        }
        if (!C86013q1.m106450k(C112760b.m154195C() + "/sns_ad_landingpages/adId_stream_" + MD5Util.getMD5String(mo131730i0().f296769z))) {
            this.f276342U = false;
        }
        View findViewById = this.f276586n.findViewById(C0966R.C0970id.jqk);
        this.f276358e1 = findViewById;
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0966R.C0970id.jqd);
        OfflineVideoView offlineVideoView = new OfflineVideoView(this.f276319A, (AttributeSet) null);
        this.f276361x = offlineVideoView;
        boolean z = true;
        offlineVideoView.setSource(1);
        this.f276359f1 = viewGroup;
        viewGroup.addView(this.f276361x, new LinearLayout.LayoutParams(-1, -1));
        if (mo131730i0().f296759F == 0) {
            if (((int) mo131730i0().f296507m) > 0) {
                int i2 = this.f276588p;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, (int) ((((float) i2) * mo131730i0().f296508n) / mo131730i0().f296507m));
                viewGroup.setLayoutParams(layoutParams);
                findViewById.setLayoutParams(layoutParams);
            } else {
                viewGroup.setLayoutParams(new RelativeLayout.LayoutParams(this.f276588p, this.f276589q));
                findViewById.setLayoutParams(new RelativeLayout.LayoutParams(this.f276588p, this.f276589q));
            }
            SnsMethodCalculate.markStartTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            if (!mo131730i0().f296764K) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "fixVideoBlackline, enable=false");
                SnsMethodCalculate.markEndTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            } else {
                View innerVideoView = this.f276361x.getInnerVideoView();
                if (innerVideoView instanceof VideoPlayerTextureView) {
                    innerVideoView.addOnLayoutChangeListener(new C95245v1(this));
                } else {
                    Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "onLayoutChange, innerVideoView=" + innerVideoView + ", displayType=" + mo131730i0().f296759F);
                }
                SnsMethodCalculate.markEndTimeMs("fixVideoBlackline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            }
            SnsMethodCalculate.markStartTimeMs("fixProgressBarLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            View innerVideoView2 = this.f276361x.getInnerVideoView();
            if (innerVideoView2 instanceof VideoPlayerTextureView) {
                innerVideoView2.addOnLayoutChangeListener(new C95247w1(this, innerVideoView2));
            }
            SnsMethodCalculate.markEndTimeMs("fixProgressBarLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        } else if (mo131730i0().f296759F == 1) {
            float f = mo131730i0().f296507m / ((float) this.f276588p);
            float f2 = mo131730i0().f296508n;
            int i3 = this.f276589q;
            float f3 = (float) i3;
            if (f > f2 / f3) {
                i = this.f276588p;
                i3 = ((int) ((((float) i) * mo131730i0().f296508n) / mo131730i0().f296507m)) + 1;
            } else {
                i = ((int) ((f3 * mo131730i0().f296507m) / mo131730i0().f296508n)) + 1;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i3);
            int i4 = (this.f276588p - i) / 2;
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i4;
            int i5 = (this.f276589q - i3) / 2;
            layoutParams2.topMargin = i5;
            layoutParams2.bottomMargin = i5;
            viewGroup.setLayoutParams(layoutParams2);
            findViewById.setLayoutParams(new RelativeLayout.LayoutParams(this.f276588p, this.f276589q));
        } else if (mo131730i0().f296759F == 2) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) mo131730i0().f296507m, (int) mo131730i0().f296508n);
            viewGroup.setLayoutParams(layoutParams3);
            findViewById.setLayoutParams(new RelativeLayout.LayoutParams(layoutParams3));
        }
        Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "createView, displayType=" + mo131730i0().f296759F);
        String l = C100891r.m132217l("adId", mo131730i0().f296754A);
        if (C86013q1.m106450k(l)) {
            this.f276361x.mo132281e(l);
        } else {
            C100891r.m132207b("adId", mo131730i0().f296754A, false, 1000000001, 0, new C95228f());
        }
        ((TextView) findViewById.findViewById(C0966R.C0970id.ckr)).setText(this.f276319A.getString(C0966R.string.f360348c13));
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.jqq);
        this.f276363y = findViewById2;
        if (findViewById2 != null) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
            ViewParent parent = this.f276363y.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f276363y);
            }
            ((ViewGroup) findViewById).addView(this.f276363y, layoutParams4);
        }
        if (!mo140730J()) {
            ImageView imageView = (ImageView) findViewById.findViewById(C0966R.C0970id.jqs);
            this.f276330L = imageView;
            imageView.setVisibility(0);
            this.f276330L.setOnClickListener(new C95229g());
            try {
                ViewParent parent2 = this.f276330L.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.f276330L);
                }
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f276330L.getLayoutParams();
                layoutParams5.bottomMargin = C76577a.m92151b(this.f276319A, 8);
                layoutParams5.rightMargin = C76577a.m92151b(this.f276319A, 10);
                ((ViewGroup) findViewById).addView(this.f276330L, layoutParams5);
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "init voiceTypeBtn and visible");
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
            }
        } else {
            ImageView imageView2 = (ImageView) findViewById.findViewById(C0966R.C0970id.jqs);
            if (imageView2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                ImageView imageView3 = imageView2;
                C117292a.m165358d(imageView3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imageView2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(imageView3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f276361x.setVideoCallback(new C95230h());
        this.f276361x.setOnSeekCompleteCallback(new C95241o());
        ImageView imageView4 = this.f276330L;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        this.f276361x.setOnClickListener(new C95235i());
        SnsMethodCalculate.markStartTimeMs("isWithStreamVideoOption", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C101297w i0 = mo131730i0();
        boolean z2 = i0.f296504j == 1 && i0.f296756C.length() > 0 && i0.f296755B.length() > 0;
        SnsMethodCalculate.markEndTimeMs("isWithStreamVideoOption", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (z2) {
            View findViewById3 = this.f276586n.findViewById(C0966R.C0970id.jqe);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = findViewById3;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Button button = (Button) findViewById3.findViewById(C0966R.C0970id.jqf);
            button.setTextColor(mo131730i0().f296757D);
            button.setText(mo131730i0().f296756C);
            button.setOnClickListener(new C95236j());
            findViewById3.findViewById(C0966R.C0970id.jqg).setBackgroundColor(mo131730i0().f296758E);
        }
        SnsMethodCalculate.markStartTimeMs("initFullScreenBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            this.f276364y0 = C76577a.m92151b(this.f276319A, 32);
            this.f276361x.setOnTouchListener(this);
            if (!mo140729I()) {
                ImageView imageView5 = (ImageView) findViewById.findViewById(C0966R.C0970id.jqr);
                this.f276360p0 = imageView5;
                ViewParent parent3 = imageView5.getParent();
                if (parent3 instanceof ViewGroup) {
                    ((ViewGroup) parent3).removeView(this.f276360p0);
                }
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f276360p0.getLayoutParams();
                layoutParams6.bottomMargin = C76577a.m92151b(this.f276319A, 8);
                layoutParams6.rightMargin = C76577a.m92151b(this.f276319A, 10);
                ((ViewGroup) findViewById).addView(this.f276360p0, layoutParams6);
                this.f276360p0.setOnClickListener(this);
                this.f276360p0.setVisibility(8);
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "init fullScreenBtn and visible");
            } else {
                View findViewById4 = findViewById.findViewById(C0966R.C0970id.jqr);
                if (findViewById4 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    C117292a.m165358d(findViewById4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "initFullScreenBtn", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "initFullScreenBtn", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } catch (Throwable th4) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th4.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initFullScreenBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markStartTimeMs("initProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            VideoPlayerSeekBar videoPlayerSeekBar = new VideoPlayerSeekBar(this.f276319A);
            this.f276352Z = videoPlayerSeekBar;
            ViewParent parent4 = videoPlayerSeekBar.getParent();
            if (parent4 instanceof ViewGroup) {
                ((ViewGroup) parent4).removeView(this.f276352Z);
            }
            int b = C76577a.m92151b(this.f276319A, 75);
            if (mo140729I() && mo140730J()) {
                b = 0;
            }
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(this.f276359f1.getLayoutParams().width - b, -2);
            layoutParams7.addRule(12);
            layoutParams7.bottomMargin = C76577a.m92151b(this.f276319A, 3);
            this.f276352Z.setLayoutParams(layoutParams7);
            ((ViewGroup) this.f276586n.findViewById(C0966R.C0970id.bsa)).addView(this.f276352Z, layoutParams7);
            mo131747r0(0);
            this.f276352Z.setOnPlayButtonClickListener(this.f276345V0);
            this.f276352Z.setIplaySeekCallback(this.f276347W0);
            this.f276352Z.setVisibility(4);
            C95195n2 n2Var = this.f276343U0;
            if (n2Var != null) {
                if (this.f276352Z.getVisibility() != 0) {
                    z = false;
                }
                n2Var.mo130250a(z);
            }
            Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "init progressBar and visible");
        } catch (Throwable th5) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th5.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markStartTimeMs("initPauseVideoUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            View findViewById5 = findViewById.findViewById(C0966R.C0970id.hrx);
            this.f276362x0 = findViewById5;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            C117292a.m165358d(findViewById5, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "initPauseVideoUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById5, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "initPauseVideoUI", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (Throwable th6) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th6.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initPauseVideoUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "createView, downloadByCdn=" + mo131730i0().f296765L + ", forbidCdn=" + mo131730i0().f296766M);
        if (mo131730i0().f296765L) {
            C115669n.INSTANCE.mo175911u(1720, 20);
        } else {
            C115669n.INSTANCE.mo175911u(1720, 21);
        }
        if (mo131730i0().f296766M) {
            C115669n.INSTANCE.mo175911u(1720, 22);
        }
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", C95222u1.class.getName() + "not support update now");
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: h0 */
    public final void mo131729h0(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            this.f276320B.removeCallbacks(runnable);
            this.f276320B.postDelayed(runnable, 4000);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: i0 */
    public final C101297w mo131730i0() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C101297w wVar = (C101297w) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return wVar;
    }

    /* renamed from: k0 */
    public final void mo131731k0(boolean z) {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        Log.m105918d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "pause play");
        this.f276320B.post(new C95224b(z));
        if (this.f276322D != 0) {
            this.f276323E = (int) (((long) this.f276323E) + (System.currentTimeMillis() - this.f276322D));
            this.f276322D = 0;
        }
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return C0966R.C0971layout.c1h;
    }

    /* renamed from: n0 */
    public final void mo131732n0() {
        SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            if (this.f276356c1 == null) {
                this.f276356c1 = new C95238l();
                AudioManager audioManager = (AudioManager) this.f276319A.getSystemService("audio");
                if (audioManager != null) {
                    int requestAudioFocus = audioManager.requestAudioFocus(this.f276356c1, 3, 2);
                    if (requestAudioFocus == 1) {
                        Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "requestAudioFocus successfully!");
                    } else {
                        Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "requestAudioFocus is not granted. value = " + requestAudioFocus);
                    }
                }
            }
        } catch (Throwable unused) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "requestAudioFocus has something wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: o */
    public long mo131555o() {
        SnsMethodCalculate.markStartTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        long o = super.mo131555o() + this.f276355b1;
        SnsMethodCalculate.markEndTimeMs("getStayTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x010e A[Catch:{ all -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0112 A[Catch:{ all -> 0x0119 }] */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo131733o0(int r17, boolean r18, boolean r19, int r20, int r21, int r22, int r23, int r24, long r25, java.lang.String r27, long r28) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            java.lang.String r4 = "VideoFullScreenActivity"
            java.lang.String r5 = "setNonFullScreenVideoPlay"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r7 = 6
            r1.f276334Q = r7     // Catch:{ all -> 0x0119 }
            long r7 = r1.f276355b1     // Catch:{ all -> 0x0119 }
            long r7 = r7 + r28
            r1.f276355b1 = r7     // Catch:{ all -> 0x0119 }
            r1.f276335Q0 = r3     // Catch:{ all -> 0x0119 }
            int r7 = r1.f276353Z0     // Catch:{ all -> 0x0119 }
            int r7 = r7 + 1
            r1.f276353Z0 = r7     // Catch:{ all -> 0x0119 }
            int r7 = r1.f276349X0     // Catch:{ all -> 0x0119 }
            int r7 = r7 + r20
            r1.f276349X0 = r7     // Catch:{ all -> 0x0119 }
            int r7 = r1.f276351Y0     // Catch:{ all -> 0x0119 }
            int r7 = r7 + r21
            r1.f276351Y0 = r7     // Catch:{ all -> 0x0119 }
            int r7 = r1.f276331M     // Catch:{ all -> 0x0119 }
            int r7 = r7 + r22
            r1.f276331M = r7     // Catch:{ all -> 0x0119 }
            int r7 = r1.f276325G     // Catch:{ all -> 0x0119 }
            int r7 = r7 + r23
            r1.f276325G = r7     // Catch:{ all -> 0x0119 }
            int r7 = r1.f276324F     // Catch:{ all -> 0x0119 }
            int r7 = r7 + r24
            r1.f276324F = r7     // Catch:{ all -> 0x0119 }
            int r7 = r1.f276323E     // Catch:{ all -> 0x0119 }
            long r7 = (long) r7     // Catch:{ all -> 0x0119 }
            long r7 = r7 + r25
            int r8 = (int) r7     // Catch:{ all -> 0x0119 }
            r1.f276323E = r8     // Catch:{ all -> 0x0119 }
            if (r3 == 0) goto L_0x0051
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0119 }
            r1.f276322D = r7     // Catch:{ all -> 0x0119 }
        L_0x0051:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)     // Catch:{ all -> 0x0119 }
            if (r7 != 0) goto L_0x005c
            r7 = r27
            r1.mo131746q0(r7)     // Catch:{ all -> 0x0119 }
        L_0x005c:
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r1.f276320B     // Catch:{ all -> 0x0119 }
            java.lang.Runnable r8 = r1.f276341T0     // Catch:{ all -> 0x0119 }
            r7.removeCallbacks(r8)     // Catch:{ all -> 0x0119 }
            android.view.View r7 = r1.f276362x0     // Catch:{ all -> 0x0119 }
            r8 = 8
            k20.a r9 = new k20.a     // Catch:{ all -> 0x0119 }
            r9.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a     // Catch:{ all -> 0x0119 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0119 }
            r9.mo10233c(r8)     // Catch:{ all -> 0x0119 }
            java.lang.Object[] r8 = r9.mo10232b()     // Catch:{ all -> 0x0119 }
            java.lang.String r10 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent"
            java.lang.String r11 = "setNonFullScreenVideoPlay"
            java.lang.String r12 = "(IZZIIIIIJLjava/lang/String;J)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r20 = r7
            r21 = r8
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            r27 = r15
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0119 }
            r8 = 0
            java.lang.Object r9 = r9.mo10231a(r8)     // Catch:{ all -> 0x0119 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0119 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0119 }
            r7.setVisibility(r9)     // Catch:{ all -> 0x0119 }
            java.lang.String r9 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent"
            java.lang.String r10 = "setNonFullScreenVideoPlay"
            java.lang.String r11 = "(IZZIIIIIJLjava/lang/String;J)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r20 = r7
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r7.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r9 = "currPosSec = "
            r7.append(r9)     // Catch:{ all -> 0x0119 }
            r7.append(r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r9 = ", isPlaying = "
            r7.append(r9)     // Catch:{ all -> 0x0119 }
            r7.append(r3)     // Catch:{ all -> 0x0119 }
            java.lang.String r9 = ", bNoVoice = "
            r7.append(r9)     // Catch:{ all -> 0x0119 }
            r7.append(r2)     // Catch:{ all -> 0x0119 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)     // Catch:{ all -> 0x0119 }
            int r7 = r0 / 1000
            int r9 = r1.f276365z     // Catch:{ all -> 0x0119 }
            if (r7 >= r9) goto L_0x00ff
            if (r0 >= 0) goto L_0x00f4
            goto L_0x00ff
        L_0x00f4:
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar r8 = r1.f276352Z     // Catch:{ all -> 0x0119 }
            r8.seek(r7)     // Catch:{ all -> 0x0119 }
            com.tencent.mm.plugin.sns.ui.OfflineVideoView r7 = r1.f276361x     // Catch:{ all -> 0x0119 }
            r7.mo132301s(r0, r3)     // Catch:{ all -> 0x0119 }
            goto L_0x0109
        L_0x00ff:
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar r0 = r1.f276352Z     // Catch:{ all -> 0x0119 }
            r0.seek(r8)     // Catch:{ all -> 0x0119 }
            com.tencent.mm.plugin.sns.ui.OfflineVideoView r0 = r1.f276361x     // Catch:{ all -> 0x0119 }
            r0.mo132301s(r8, r3)     // Catch:{ all -> 0x0119 }
        L_0x0109:
            r1.mo131748s0(r3)     // Catch:{ all -> 0x0119 }
            if (r2 == 0) goto L_0x0112
            r16.mo130232G()     // Catch:{ all -> 0x0119 }
            goto L_0x0115
        L_0x0112:
            r16.mo130234M()     // Catch:{ all -> 0x0119 }
        L_0x0115:
            r16.mo131732n0()     // Catch:{ all -> 0x0119 }
            goto L_0x0121
        L_0x0119:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0121:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95222u1.mo131733o0(int, boolean, boolean, int, int, int, int, int, long, java.lang.String, long):void");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (view.getId() == C0966R.C0970id.jqr) {
            Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "click full screen btn");
            try {
                if (this.f276319A instanceof SnsAdNativeLandingPagesUI) {
                    this.f276353Z0++;
                    this.f276320B.removeCallbacks(this.f276341T0);
                    View view2 = this.f276362x0;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) this.f276319A;
                    C95239m.f276391a = mo131730i0();
                    C94978z0.f275381a = mo131854m();
                    Intent intent = new Intent(snsAdNativeLandingPagesUI, VideoFullScreenActivity.class);
                    intent.putExtra("KComponentVideoType", 0);
                    intent.putExtra("KComponentCid", mo131857r());
                    intent.putExtra("KComponentCurrentTime", this.f276361x.getCurrentPositionMs());
                    intent.putExtra("KComponentTotalTime", this.f276361x.getDurationMs());
                    intent.putExtra("KComponentVoiceType", this.f276333P);
                    intent.putExtra("KComponentProgressType", mo130233K());
                    intent.putExtra("KComponentVideoSightThumbUrl", mo131730i0().f296754A);
                    intent.putExtra("KComponentStreamVideoUrlPath", mo131730i0().f296769z);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(2000);
                    aVar2.mo10233c(intent);
                    C117292a.m165364j(snsAdNativeLandingPagesUI, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    C115669n.INSTANCE.mo175911u(1720, 1);
                } else {
                    ImageView imageView = this.f276360p0;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                }
            } catch (Throwable th) {
                ImageView imageView2 = this.f276360p0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                Log.m105920e("VideoFullScreenActivity", th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "onDoubleTap");
            mo131729h0(this.f276339S0);
            if (this.f276321C) {
                this.f276351Y0++;
            }
            if (mo130233K()) {
                mo131731k0(true);
                this.f276334Q = 4;
            } else {
                if (this.f276333P) {
                    mo130232G();
                } else {
                    mo140727E();
                    mo130234M();
                }
                mo131745p0();
                this.f276334Q = 3;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "onSingleTapConfirmed");
            if (mo131730i0().f296767N) {
                SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
                return false;
            }
            if (this.f276321C) {
                boolean z = true;
                boolean z2 = this.f276352Z.getVisibility() == 0;
                if (z2) {
                    this.f276352Z.setVisibility(4);
                    ImageView imageView = this.f276360p0;
                    if (imageView != null) {
                        imageView.setVisibility(4);
                    }
                    this.f276320B.removeCallbacks(this.f276339S0);
                } else {
                    this.f276352Z.setVisibility(0);
                    ImageView imageView2 = this.f276360p0;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    mo131729h0(this.f276339S0);
                }
                C95195n2 n2Var = this.f276343U0;
                if (n2Var != null) {
                    if (z2) {
                        z = false;
                    }
                    n2Var.mo130250a(z);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return false;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        GestureDetector gestureDetector = this.f276337R0;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    /* renamed from: p0 */
    public final void mo131745p0() {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (this.f276348X) {
            Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "last download fail ,try again");
            this.f276361x.mo132299q();
            SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return;
        }
        Log.m105918d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "starting play");
        if (!this.f276346W && !TextUtils.isEmpty(this.f276344V)) {
            this.f276361x.mo132293k(this.f276344V);
            this.f276346W = true;
        }
        this.f276320B.post(new C95223a());
        this.f276322D = System.currentTimeMillis();
        this.f276324F++;
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: q0 */
    public final void mo131746q0(String str) {
        SnsMethodCalculate.markStartTimeMs("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f276354a1 == null) {
                this.f276354a1 = new C95240n();
            }
            this.f276354a1.f276392a += jSONObject.optInt(C102646h.COL_EXPOSURECOUNT);
            this.f276354a1.f276393b += jSONObject.optLong("stayTime");
            this.f276354a1.f276394c += jSONObject.optInt("clickCount");
            JSONObject optJSONObject = jSONObject.optJSONObject("btnInfo");
            this.f276354a1.f276395d = optJSONObject.optString("cid");
            this.f276354a1.f276396e += optJSONObject.optInt(C102646h.COL_EXPOSURECOUNT);
            this.f276354a1.f276397f += optJSONObject.optLong("stayTime");
            this.f276354a1.f276398g += optJSONObject.optInt("clickCount");
        } catch (Throwable th) {
            this.f276354a1 = null;
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateFullScreenFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: r0 */
    public final void mo131747r0(int i) {
        SnsMethodCalculate.markStartTimeMs("updateProgressBarSeek", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            this.f276320B.post(new C95237k(i));
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateProgressBarSeek", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: s0 */
    public final void mo131748s0(boolean z) {
        SnsMethodCalculate.markStartTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        try {
            this.f276352Z.setIsPlay(z);
            this.f276352Z.getPlayBtn().getLayoutParams().width = this.f276364y0;
            this.f276352Z.getPlayBtn().getLayoutParams().height = this.f276364y0;
            if (z) {
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "startPlay");
                this.f276352Z.getPlayBtn().setImageDrawable(C76577a.m92158i(this.f276319A, C0966R.raw.media_player_btn_cur_status_on));
            } else {
                Log.m105924i("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", "pausePlay");
                this.f276352Z.getPlayBtn().setImageDrawable(C76577a.m92158i(this.f276319A, C0966R.raw.media_player_btn_cur_status_off));
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageSightVideoComponent.VideoOptimize", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: t */
    public void mo130247t() {
        SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        super.mo130247t();
        String l = C100891r.m132217l("adId", mo131730i0().f296754A);
        mo131731k0(false);
        if (C86013q1.m106450k(l)) {
            this.f276361x.mo132281e(l);
            this.f276361x.mo132298p(false, 0.0f);
        }
        SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return false;
        }
        try {
            jSONObject2.put("sightDuration", this.f276365z * 1000);
            jSONObject2.put("playTimeInterval", this.f276323E);
            jSONObject2.put("playCount", this.f276324F);
            jSONObject2.put("playCompletedCount", this.f276325G);
            jSONObject2.put("clickPlayControlCount", this.f276349X0);
            jSONObject2.put("doubleClickCount", this.f276351Y0);
            jSONObject2.put("clickFullscreenBtnCount", this.f276353Z0);
            jSONObject2.put("clickVoiceControlCount", this.f276331M);
            jSONObject2.put("isAutoPlay", "0");
            if (mo131730i0().f296505k == 61) {
                jSONObject2.put("clickSightCount", this.f276332N);
            }
            if (!this.f276342U) {
                String mD5String = MD5Util.getMD5String(mo131730i0().f296769z);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("urlMd5", mD5String);
                jSONObject3.put("needDownload", 1);
                jSONObject2.put("sightUrlInfo", jSONObject3);
            }
            if (!this.f276340T) {
                String mD5String2 = MD5Util.getMD5String(mo131730i0().f296754A);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("urlMd5", mD5String2);
                jSONObject4.put("needDownload", 1);
                jSONObject2.put("thumbUrlInfo", jSONObject4);
            }
            jSONObject2.put("streamVideoEnterCount", this.f276326H);
            jSONObject2.put("streamVideoPlayCount", this.f276327I);
            jSONObject2.put("streamVideoPlayCompleteCount", this.f276328J);
            jSONObject2.put("streamVideoTotalPlayTimeInMs", this.f276329K);
            if (this.f276354a1 != null) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("cid", this.f276354a1.f276395d);
                jSONObject5.put(C102646h.COL_EXPOSURECOUNT, this.f276354a1.f276396e);
                jSONObject5.put("stayTime", this.f276354a1.f276397f);
                jSONObject5.put("clickCount", this.f276354a1.f276398g);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(C102646h.COL_EXPOSURECOUNT, this.f276354a1.f276392a);
                jSONObject6.put("stayTime", this.f276354a1.f276393b);
                jSONObject6.put("clickCount", this.f276354a1.f276394c);
                jSONObject6.put("btnInfo", jSONObject5);
                jSONObject2.put("fullVideoFloatBarInfo", jSONObject6);
            }
            C99572w.m129967a(61, mo131854m(), mo131555o(), this.f276323E, "MicroMsg.Sns.AdLandingPageSightVideoComponent");
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Sns.AdLandingPageSightVideoComponent", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            return false;
        }
    }
}
