package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96011a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.thumbplayer.api.ITPPlayer;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import sn0.C90259e;
import vr2.C37817q;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView */
public class LongVideoFullScreenView extends RelativeLayout implements View.OnClickListener, C96814a.C57541b, View.OnTouchListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, C96814a.C57542d {

    /* renamed from: R0 */
    public static final /* synthetic */ int f276908R0 = 0;

    /* renamed from: A */
    public String f276909A;

    /* renamed from: B */
    public boolean f276910B;

    /* renamed from: C */
    public int f276911C;

    /* renamed from: D */
    public int f276912D;

    /* renamed from: E */
    public volatile boolean f276913E = false;

    /* renamed from: F */
    public volatile int f276914F = 0;

    /* renamed from: G */
    public volatile boolean f276915G = true;

    /* renamed from: H */
    public volatile boolean f276916H = false;

    /* renamed from: I */
    public volatile boolean f276917I = true;

    /* renamed from: J */
    public volatile boolean f276918J = false;

    /* renamed from: K */
    public volatile boolean f276919K = true;

    /* renamed from: L */
    public volatile boolean f276920L = false;

    /* renamed from: M */
    public long f276921M = 0;

    /* renamed from: N */
    public int f276922N = 0;

    /* renamed from: P */
    public int f276923P = 0;

    /* renamed from: Q */
    public int f276924Q = 0;

    /* renamed from: Q0 */
    public Runnable f276925Q0;

    /* renamed from: R */
    public int f276926R = 0;

    /* renamed from: S */
    public int f276927S = 0;

    /* renamed from: T */
    public long f276928T = 0;

    /* renamed from: U */
    public long f276929U;

    /* renamed from: V */
    public int f276930V;

    /* renamed from: W */
    public View.OnClickListener f276931W;

    /* renamed from: d */
    public Context f276932d;

    /* renamed from: e */
    public GestureDetector f276933e;

    /* renamed from: f */
    public View f276934f = null;

    /* renamed from: g */
    public FrameLayout f276935g;

    /* renamed from: h */
    public View f276936h;

    /* renamed from: i */
    public View f276937i;

    /* renamed from: j */
    public AdLandingVideoWrapper f276938j;

    /* renamed from: n */
    public VideoPlayerSeekBar f276939n;

    /* renamed from: o */
    public ImageView f276940o;

    /* renamed from: p */
    public ImageView f276941p;

    /* renamed from: p0 */
    public C102693c f276942p0;

    /* renamed from: q */
    public View f276943q;

    /* renamed from: r */
    public int f276944r;

    /* renamed from: s */
    public int f276945s;

    /* renamed from: t */
    public int f276946t;

    /* renamed from: u */
    public int f276947u;

    /* renamed from: v */
    public String f276948v;

    /* renamed from: w */
    public int f276949w;

    /* renamed from: x */
    public int f276950x;

    /* renamed from: x0 */
    public C96011a f276951x0;

    /* renamed from: y */
    public boolean f276952y;

    /* renamed from: y0 */
    public Runnable f276953y0;

    /* renamed from: z */
    public boolean f276954z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$d */
    public class C57372d implements Runnable {
        public C57372d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$6");
            try {
                LongVideoFullScreenView longVideoFullScreenView = LongVideoFullScreenView.this;
                int i = LongVideoFullScreenView.f276908R0;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                View view = longVideoFullScreenView.f276943q;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } catch (Throwable th) {
                Log.m105920e("LongVideoFullScreenView", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$a */
    public class C95346a implements Runnable {
        public C95346a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
            try {
                LongVideoFullScreenView longVideoFullScreenView = LongVideoFullScreenView.this;
                int i = LongVideoFullScreenView.f276908R0;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                boolean z = longVideoFullScreenView.f276915G;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                if (z) {
                    LongVideoFullScreenView longVideoFullScreenView2 = LongVideoFullScreenView.this;
                    SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    longVideoFullScreenView2.f276915G = false;
                    SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    LongVideoFullScreenView longVideoFullScreenView3 = LongVideoFullScreenView.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    boolean z2 = longVideoFullScreenView3.f276910B;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    if (z2) {
                        LongVideoFullScreenView longVideoFullScreenView4 = LongVideoFullScreenView.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                        int i2 = longVideoFullScreenView4.f276911C;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                        if (i2 > 0) {
                            LongVideoFullScreenView longVideoFullScreenView5 = LongVideoFullScreenView.this;
                            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            int i3 = longVideoFullScreenView5.f276911C;
                            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            LongVideoFullScreenView longVideoFullScreenView6 = LongVideoFullScreenView.this;
                            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            int i4 = longVideoFullScreenView6.f276950x;
                            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            if (i3 <= i4) {
                                VideoPlayerSeekBar c = LongVideoFullScreenView.m121523c(LongVideoFullScreenView.this);
                                LongVideoFullScreenView longVideoFullScreenView7 = LongVideoFullScreenView.this;
                                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                                int i5 = longVideoFullScreenView7.f276912D;
                                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                                c.seek(i5);
                                AdLandingVideoWrapper d = LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this);
                                LongVideoFullScreenView longVideoFullScreenView8 = LongVideoFullScreenView.this;
                                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                                int i6 = longVideoFullScreenView8.f276912D;
                                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                                d.mo79613a((double) i6, true);
                                LongVideoFullScreenView longVideoFullScreenView9 = LongVideoFullScreenView.this;
                                long currentTimeMillis = System.currentTimeMillis();
                                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                                longVideoFullScreenView9.f276921M = currentTimeMillis;
                                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                                LongVideoFullScreenView.m121525e(LongVideoFullScreenView.this, true);
                                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
                                return;
                            }
                        }
                        LongVideoFullScreenView.m121523c(LongVideoFullScreenView.this).seek(0);
                        LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).mo79613a(0.0d, true);
                        LongVideoFullScreenView longVideoFullScreenView92 = LongVideoFullScreenView.this;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                        longVideoFullScreenView92.f276921M = currentTimeMillis2;
                        SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                        LongVideoFullScreenView.m121525e(LongVideoFullScreenView.this, true);
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
                        return;
                    }
                    int f = LongVideoFullScreenView.m121526f(LongVideoFullScreenView.this);
                    LongVideoFullScreenView longVideoFullScreenView10 = LongVideoFullScreenView.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    int i7 = longVideoFullScreenView10.f276950x;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    if (f < i7) {
                        if (LongVideoFullScreenView.m121526f(LongVideoFullScreenView.this) >= 0) {
                            LongVideoFullScreenView.m121523c(LongVideoFullScreenView.this).seek(LongVideoFullScreenView.m121526f(LongVideoFullScreenView.this) / 1000);
                            AdLandingVideoWrapper d2 = LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this);
                            double f2 = (double) LongVideoFullScreenView.m121526f(LongVideoFullScreenView.this);
                            LongVideoFullScreenView longVideoFullScreenView11 = LongVideoFullScreenView.this;
                            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            boolean z3 = longVideoFullScreenView11.f276954z;
                            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            d2.mo79613a(f2, z3);
                            LongVideoFullScreenView longVideoFullScreenView12 = LongVideoFullScreenView.this;
                            long currentTimeMillis3 = System.currentTimeMillis();
                            SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            longVideoFullScreenView12.f276921M = currentTimeMillis3;
                            SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            LongVideoFullScreenView longVideoFullScreenView13 = LongVideoFullScreenView.this;
                            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            boolean z4 = longVideoFullScreenView13.f276954z;
                            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                            LongVideoFullScreenView.m121525e(longVideoFullScreenView13, z4);
                            LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).mo131774g();
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
                            return;
                        }
                    }
                    LongVideoFullScreenView.m121523c(LongVideoFullScreenView.this).seek(0);
                    AdLandingVideoWrapper d3 = LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this);
                    LongVideoFullScreenView longVideoFullScreenView14 = LongVideoFullScreenView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    boolean z5 = longVideoFullScreenView14.f276954z;
                    SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    d3.mo79613a(0.0d, z5);
                    LongVideoFullScreenView longVideoFullScreenView122 = LongVideoFullScreenView.this;
                    long currentTimeMillis32 = System.currentTimeMillis();
                    SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    longVideoFullScreenView122.f276921M = currentTimeMillis32;
                    SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    LongVideoFullScreenView longVideoFullScreenView132 = LongVideoFullScreenView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    boolean z44 = longVideoFullScreenView132.f276954z;
                    SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    LongVideoFullScreenView.m121525e(longVideoFullScreenView132, z44);
                    LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).mo131774g();
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
                    return;
                }
                if (!LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).isPlaying()) {
                    if (LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).getCurrPosSec() == LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).getVideoDurationSec()) {
                        LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).mo79613a(0.0d, true);
                    } else {
                        LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).mo79613a((double) LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).getCurrPosSec(), true);
                    }
                    LongVideoFullScreenView.m121525e(LongVideoFullScreenView.this, true);
                    LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).mo131774g();
                }
                LongVideoFullScreenView longVideoFullScreenView15 = LongVideoFullScreenView.this;
                SnsMethodCalculate.markStartTimeMs("access$1108", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView15.f276927S++;
                SnsMethodCalculate.markEndTimeMs("access$1108", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                LongVideoFullScreenView longVideoFullScreenView16 = LongVideoFullScreenView.this;
                long currentTimeMillis4 = System.currentTimeMillis();
                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView16.f276921M = currentTimeMillis4;
                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$1");
            } catch (Throwable th) {
                Log.m105920e("LongVideoFullScreenView", th.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$b */
    public class C95347b implements Runnable {
        public C95347b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$2");
            try {
                LongVideoFullScreenView.m121524d(LongVideoFullScreenView.this).pause();
                LongVideoFullScreenView longVideoFullScreenView = LongVideoFullScreenView.this;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                View view = longVideoFullScreenView.f276943q;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                LongVideoFullScreenView longVideoFullScreenView2 = LongVideoFullScreenView.this;
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                Runnable runnable = longVideoFullScreenView2.f276925Q0;
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView2.mo132195g(runnable);
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                LongVideoFullScreenView.m121525e(LongVideoFullScreenView.this, false);
            } catch (Throwable th) {
                Log.m105920e("LongVideoFullScreenView", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$c */
    public class C95348c implements Runnable {
        public C95348c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$5");
            LongVideoFullScreenView.m121522a(LongVideoFullScreenView.this, false);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$5");
        }
    }

    public LongVideoFullScreenView(Context context) {
        super(context);
        SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C95802h1 h1Var = new C95802h1(this);
        SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276931W = h1Var;
        SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C95809i1 i1Var = new C95809i1(this);
        SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276942p0 = i1Var;
        this.f276953y0 = new C95348c();
        this.f276925Q0 = new C57372d();
        this.f276932d = context;
        this.f276933e = new GestureDetector(this);
    }

    /* renamed from: a */
    public static /* synthetic */ void m121522a(LongVideoFullScreenView longVideoFullScreenView, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        longVideoFullScreenView.setFocus(z);
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: c */
    public static /* synthetic */ VideoPlayerSeekBar m121523c(LongVideoFullScreenView longVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        VideoPlayerSeekBar videoPlayerSeekBar = longVideoFullScreenView.f276939n;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return videoPlayerSeekBar;
    }

    /* renamed from: d */
    public static /* synthetic */ AdLandingVideoWrapper m121524d(LongVideoFullScreenView longVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        AdLandingVideoWrapper adLandingVideoWrapper = longVideoFullScreenView.f276938j;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return adLandingVideoWrapper;
    }

    /* renamed from: e */
    public static /* synthetic */ void m121525e(LongVideoFullScreenView longVideoFullScreenView, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        longVideoFullScreenView.mo132224x(z);
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: f */
    public static /* synthetic */ int m121526f(LongVideoFullScreenView longVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        int i = longVideoFullScreenView.f276949w;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return i;
    }

    private void setFocus(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFocus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        if (z) {
            try {
                C96011a aVar = this.f276951x0;
                if (aVar != null) {
                    ((VideoFullScreenActivity) aVar).mo133147I7(true);
                }
                this.f276939n.setVisibility(0);
                this.f276941p.setVisibility(0);
                this.f276940o.setVisibility(0);
                mo132195g(this.f276953y0);
            } catch (Throwable th) {
                Log.m105920e("LongVideoFullScreenView", th.toString());
            }
        } else {
            this.f276917I = false;
            this.f276939n.setVisibility(4);
            this.f276941p.setVisibility(8);
            this.f276940o.setVisibility(8);
            MMHandlerThread.removeRunnable(this.f276953y0);
            C96011a aVar2 = this.f276951x0;
            if (aVar2 != null) {
                ((VideoFullScreenActivity) aVar2).mo133147I7(false);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setFocus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276913E = false;
        this.f276914F = 0;
        mo132196h();
        Log.m105924i("LongVideoFullScreenView", "mediaId = " + str2 + ", end loading");
        SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276913E = true;
        this.f276929U = System.currentTimeMillis();
        Log.m105924i("LongVideoFullScreenView", "mediaId = " + str2 + ", start loading");
        SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f276926R++;
            this.f276938j.mo131776j();
            this.f276938j.mo79614b();
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        Log.m105921e("LongVideoFullScreenView", "online play error, %s", str3);
        this.f276916H = true;
        C115669n.INSTANCE.mo175911u(1579, 18);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        AdLandingVideoWrapper adLandingVideoWrapper;
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276916H = false;
        if (this.f276950x <= 0 && (adLandingVideoWrapper = this.f276938j) != null) {
            this.f276950x = adLandingVideoWrapper.getVideoDurationSec();
        }
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: b */
    public void mo81284b() {
        SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            int currPosSec = this.f276938j.getCurrPosSec();
            if (currPosSec >= this.f276950x) {
                Log.m105924i("LongVideoFullScreenView", "onLoopCompletion, currPosSec is " + currPosSec);
                this.f276926R = this.f276926R + 1;
                this.f276938j.mo79613a(0.0d, true);
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: g */
    public final void mo132195g(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            MMHandlerThread.removeRunnable(runnable);
            MMHandlerThread.postToMainThreadDelayed(runnable, 4000);
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: h */
    public final void mo132196h() {
        SnsMethodCalculate.markStartTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        if (this.f276929U != 0) {
            this.f276930V = (int) (((long) this.f276930V) + (System.currentTimeMillis() - this.f276929U));
            this.f276929U = 0;
        }
        SnsMethodCalculate.markEndTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: i */
    public void mo132197i() {
        SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f276941p.setImageDrawable(C76577a.m92158i(this.f276932d, C0966R.raw.icon_volume_off));
            this.f276938j.setMute(true);
            this.f276952y = true;
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: j */
    public Intent mo132198j() {
        SnsMethodCalculate.markStartTimeMs("createLongVideoIntent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        Intent intent = new Intent();
        try {
            if (this.f276938j.isPlaying() && this.f276921M != 0) {
                this.f276928T += System.currentTimeMillis() - this.f276921M;
                this.f276921M = 0;
                Log.m105924i("LongVideoFullScreenView", "playTimeInterval update");
            }
            intent.putExtra("KComponentVideoType", this.f276947u);
            intent.putExtra("KComponentCid", this.f276948v);
            intent.putExtra("KComponentCurrentTime", this.f276938j.getCurrPosSec());
            intent.putExtra("KComponentVoiceType", this.f276952y);
            intent.putExtra("KComponentProgressType", this.f276938j.isPlaying());
            intent.putExtra("KComponentClickPlayControlCount", this.f276922N);
            intent.putExtra("KComponentDoubleClickCount", this.f276923P);
            intent.putExtra("KComponentClickVoiceControlCount", this.f276924Q);
            intent.putExtra("KComponentPlayCompletedCount", this.f276926R);
            intent.putExtra("KComponentPlayCount", this.f276927S);
            intent.putExtra("KComponentPlayTimeInterval", this.f276928T);
            intent.putExtra("KComponentIsWaiting", this.f276913E);
            intent.putExtra("KComponentSeekTimeDueWaiting", this.f276914F);
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("createLongVideoIntent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return intent;
    }

    /* renamed from: k */
    public final void mo132199k() {
        SnsMethodCalculate.markStartTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            ViewParent parent = this.f276939n.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f276939n);
            }
            C95198o2.m121134f((Activity) this.f276932d);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f276936h.getLayoutParams();
            layoutParams.leftMargin = C76577a.m92151b(this.f276932d, 64);
            layoutParams.rightMargin = C76577a.m92151b(this.f276932d, 64);
            ((RelativeLayout.LayoutParams) this.f276937i.getLayoutParams()).rightMargin = C76577a.m92151b(this.f276932d, 20);
            ((RelativeLayout.LayoutParams) this.f276940o.getLayoutParams()).rightMargin = C76577a.m92151b(this.f276932d, 20);
            ((ViewGroup) this.f276936h).addView(this.f276939n, new RelativeLayout.LayoutParams(this.f276945s - C76577a.m92151b(this.f276932d, 232), -2));
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: l */
    public final void mo132200l() {
        SnsMethodCalculate.markStartTimeMs("initLongVideoComponents", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f276936h = this.f276934f.findViewById(C0966R.C0970id.ag7);
            this.f276937i = this.f276934f.findViewById(C0966R.C0970id.f1a);
            VideoPlayerSeekBar videoPlayerSeekBar = (VideoPlayerSeekBar) this.f276934f.findViewById(C0966R.C0970id.i7m);
            this.f276939n = videoPlayerSeekBar;
            videoPlayerSeekBar.setVisibility(0);
            this.f276939n.setOnPlayButtonClickListener(this.f276931W);
            this.f276939n.setIplaySeekCallback(this.f276942p0);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.jqr);
            this.f276940o = imageView;
            imageView.setVisibility(0);
            this.f276940o.setOnClickListener(this);
            ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.jqs);
            this.f276941p = imageView2;
            imageView2.setVisibility(0);
            this.f276941p.setOnClickListener(this);
            View findViewById = this.f276934f.findViewById(C0966R.C0970id.hrx);
            this.f276943q = findViewById;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "initLongVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "initLongVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewParent parent = this.f276939n.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f276939n);
            }
            this.f276938j.setVideoFooterView(this.f276939n);
            if (this.f276932d.getResources().getConfiguration().orientation == 2) {
                Log.m105924i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                mo132199k();
            } else if (this.f276932d.getResources().getConfiguration().orientation == 1) {
                Log.m105924i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                mo132202n();
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initLongVideoComponents", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: m */
    public final void mo132201m() {
        SnsMethodCalculate.markStartTimeMs("initLongVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            View inflate = LayoutInflater.from(this.f276932d).inflate(C0966R.C0971layout.b8k, this, true);
            this.f276934f = inflate;
            this.f276935g = (FrameLayout) inflate.findViewById(C0966R.C0970id.l4k);
            AdLandingVideoWrapper adLandingVideoWrapper = new AdLandingVideoWrapper(this.f276932d, (AttributeSet) null);
            this.f276938j = adLandingVideoWrapper;
            this.f276935g.addView(adLandingVideoWrapper);
            this.f276938j.setIMMVideoViewCallback(this);
            this.f276938j.setFullScreen(true);
            this.f276938j.mo76636h(false, this.f276909A, 0);
            this.f276938j.setClickable(true);
            this.f276938j.setOnTouchListener(this);
            this.f276938j.setLoop(true);
            this.f276938j.setLoopCompletionCallback(this);
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initLongVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            MMHandlerThread.removeRunnable(this.f276925Q0);
            View view = this.f276943q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo132224x(true);
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: n */
    public final void mo132202n() {
        SnsMethodCalculate.markStartTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            ViewParent parent = this.f276939n.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f276939n);
            }
            C95198o2.m121134f((Activity) this.f276932d);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f276936h.getLayoutParams();
            layoutParams.leftMargin = C76577a.m92151b(this.f276932d, 0);
            layoutParams.rightMargin = C76577a.m92151b(this.f276932d, 0);
            ((RelativeLayout.LayoutParams) this.f276937i.getLayoutParams()).rightMargin = C76577a.m92151b(this.f276932d, 10);
            ((RelativeLayout.LayoutParams) this.f276940o.getLayoutParams()).rightMargin = C76577a.m92151b(this.f276932d, 10);
            ((ViewGroup) this.f276936h).addView(this.f276939n, new RelativeLayout.LayoutParams(this.f276944r - C76577a.m92151b(this.f276932d, 74), -2));
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: o */
    public void mo132203o(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        if (i2 >= i) {
            try {
                this.f276944r = i;
                this.f276945s = i2;
            } catch (Throwable th) {
                Log.m105920e("LongVideoFullScreenView", th.toString());
            }
        } else {
            this.f276945s = i;
            this.f276944r = i2;
        }
        this.f276946t = C76577a.m92151b(this.f276932d, 32);
        SnsMethodCalculate.markEndTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            if (view.getId() == C0966R.C0970id.jqs) {
                this.f276924Q++;
                setFocus(true);
                if (this.f276952y) {
                    mo132221t();
                } else {
                    mo132197i();
                }
            } else if (view.getId() == C0966R.C0970id.jqr) {
                MMHandlerThread.removeRunnable(this.f276925Q0);
                View view2 = this.f276943q;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((Activity) this.f276932d).finish();
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        super.onConfigurationChanged(configuration);
        try {
            int i = configuration.orientation;
            if (i == 2) {
                Log.m105924i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                mo132199k();
            } else if (i == 1) {
                Log.m105924i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                mo132202n();
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            Log.m105924i("LongVideoFullScreenView", "onDoubleTap");
            if (!this.f276916H) {
                this.f276923P++;
            }
            mo132195g(this.f276953y0);
            if (this.f276938j.isPlaying()) {
                mo132222v();
            } else {
                if (this.f276952y) {
                    mo132197i();
                } else {
                    mo132221t();
                }
                mo132223w();
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
        SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void onShowPress(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            Log.m105924i("LongVideoFullScreenView", "onSingleTapConfirmed");
            if (!this.f276917I) {
                this.f276917I = true;
                setFocus(true);
            } else {
                this.f276917I = false;
                setFocus(false);
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        GestureDetector gestureDetector = this.f276933e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    /* renamed from: p */
    public void mo132216p() {
        SnsMethodCalculate.markStartTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            mo132201m();
            mo132200l();
            SnsMethodCalculate.markStartTimeMs("initLongVideoPlayStatus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            if (this.f276952y) {
                mo132197i();
            } else {
                mo132221t();
            }
            mo132223w();
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initLongVideoPlayStatus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        setFocus(true);
        SnsMethodCalculate.markEndTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: q */
    public void mo132217q(int i, String str, int i2, int i3, boolean z, boolean z2, String str2, String str3, boolean z3, int i4, int i5) {
        SnsMethodCalculate.markStartTimeMs("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f276915G = true;
            this.f276919K = true;
            this.f276947u = i;
            this.f276948v = str;
            this.f276949w = i2;
            this.f276950x = i3;
            this.f276952y = z;
            this.f276954z = z2;
            this.f276909A = str3;
            this.f276910B = z3;
            this.f276911C = i4;
            this.f276912D = i5;
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: r */
    public void mo132218r() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f276938j.mo131776j();
            MMHandlerThread.removeRunnable(this.f276953y0);
            MMHandlerThread.removeRunnable(this.f276925Q0);
            mo132196h();
            C37817q.m41545a("landing_page_video_comp_loading_time", String.valueOf(this.f276930V), 2, 0, "");
            this.f276938j.mo79616c();
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: s */
    public void mo132219s() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            if (!this.f276919K && !this.f276938j.isPlaying() && this.f276920L) {
                mo132223w();
                this.f276920L = false;
            }
            this.f276919K = false;
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void setProgressBarStatusListener(C96011a aVar) {
        SnsMethodCalculate.markStartTimeMs("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276951x0 = aVar;
        SnsMethodCalculate.markEndTimeMs("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: t */
    public void mo132221t() {
        SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f276941p.setImageDrawable(C76577a.m92158i(this.f276932d, C0966R.raw.icon_volume_on));
            this.f276938j.setMute(false);
            this.f276952y = false;
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: v */
    public final void mo132222v() {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            Log.m105918d("LongVideoFullScreenView", "pause play");
            MMHandlerThread.postToMainThread(new C95347b());
            if (this.f276921M != 0) {
                this.f276928T += System.currentTimeMillis() - this.f276921M;
                this.f276921M = 0;
                Log.m105924i("LongVideoFullScreenView", "playTimeInterval update");
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: w */
    public final void mo132223w() {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            Log.m105924i("LongVideoFullScreenView", "starting play, downFailed=" + this.f276916H);
            if (this.f276916H) {
                Log.m105920e("LongVideoFullScreenView", "last download fail ,try again");
                VideoPlayerSeekBar videoPlayerSeekBar = this.f276939n;
                if (!(videoPlayerSeekBar == null || videoPlayerSeekBar.getParent() == null)) {
                    ((ViewGroup) this.f276939n.getParent()).removeView(this.f276939n);
                }
                this.f276938j.setFullScreen(true);
                this.f276938j.mo76636h(false, this.f276909A, 0);
                if (this.f276932d.getResources().getConfiguration().orientation == 2) {
                    Log.m105924i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                    mo132199k();
                } else if (this.f276932d.getResources().getConfiguration().orientation == 1) {
                    Log.m105924i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                    mo132202n();
                }
                this.f276938j.mo79613a(0.0d, true);
                this.f276938j.mo131774g();
                SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                return;
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        MMHandlerThread.postToMainThread(new C95346a());
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    /* renamed from: x */
    public final void mo132224x(boolean z) {
        SnsMethodCalculate.markStartTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f276939n.setIsPlay(z);
            this.f276939n.getPlayBtn().getLayoutParams().width = this.f276946t;
            this.f276939n.getPlayBtn().getLayoutParams().height = this.f276946t;
            if (z) {
                Log.m105924i("LongVideoFullScreenView", "startPlay");
                this.f276939n.getPlayBtn().setImageDrawable(C76577a.m92158i(this.f276932d, C0966R.raw.media_player_btn_cur_status_on));
            } else {
                Log.m105924i("LongVideoFullScreenView", "pausePlay");
                this.f276939n.getPlayBtn().setImageDrawable(C76577a.m92158i(this.f276932d, C0966R.raw.media_player_btn_cur_status_off));
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public LongVideoFullScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C95802h1 h1Var = new C95802h1(this);
        SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276931W = h1Var;
        SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C95809i1 i1Var = new C95809i1(this);
        SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276942p0 = i1Var;
        this.f276953y0 = new C95348c();
        this.f276925Q0 = new C57372d();
        this.f276932d = context;
        this.f276933e = new GestureDetector(this);
    }

    public LongVideoFullScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C95802h1 h1Var = new C95802h1(this);
        SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276931W = h1Var;
        SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        C95809i1 i1Var = new C95809i1(this);
        SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f276942p0 = i1Var;
        this.f276953y0 = new C95348c();
        this.f276925Q0 = new C57372d();
        this.f276932d = context;
        this.f276933e = new GestureDetector(this);
    }
}
