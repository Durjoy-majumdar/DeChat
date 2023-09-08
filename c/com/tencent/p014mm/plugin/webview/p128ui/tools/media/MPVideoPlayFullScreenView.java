package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C5853h;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.VideoControl;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p206nj.C11171e;
import p629ny.C76979h;
import s90.C48300n;
import t83.C13851h1;
import t83.C48590l;
import te3.C64459j13;
import we0.C53156a;
import y93.C53513a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "Lrx3/b0;", "onClick", "", "F", "I", "getEnterId", "()I", "setEnterId", "(I)V", "enterId", "", "G", "J", "getEnterTimeInMs", "()J", "setEnterTimeInMs", "(J)V", "enterTimeInMs", "", "H", "Z", "getForbidForward", "()Z", "setForbidForward", "(Z)V", "forbidForward", "Lcom/tencent/mm/plugin/webview/ui/tools/media/w;", "R", "Lcom/tencent/mm/plugin/webview/ui/tools/media/w;", "getMpShareVideoReport", "()Lcom/tencent/mm/plugin/webview/ui/tools/media/w;", "mpShareVideoReport", "V", "Ljava/lang/Integer;", "getSubScene", "()Ljava/lang/Integer;", "setSubScene", "(Ljava/lang/Integer;)V", "subScene", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView */
public final class MPVideoPlayFullScreenView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: y0 */
    public static final /* synthetic */ int f119330y0 = 0;

    /* renamed from: A */
    public View f119331A;

    /* renamed from: B */
    public ProgressBar f119332B;

    /* renamed from: C */
    public C45059m0 f119333C;

    /* renamed from: D */
    public double f119334D;

    /* renamed from: E */
    public boolean f119335E;

    /* renamed from: F */
    public int f119336F;

    /* renamed from: G */
    public long f119337G;

    /* renamed from: H */
    public boolean f119338H;

    /* renamed from: I */
    public final int f119339I = -3;

    /* renamed from: J */
    public int f119340J = -3;

    /* renamed from: K */
    public int f119341K = -1;

    /* renamed from: L */
    public boolean f119342L;

    /* renamed from: M */
    public int f119343M;

    /* renamed from: N */
    public boolean f119344N;

    /* renamed from: P */
    public boolean f119345P;

    /* renamed from: Q */
    public C53156a f119346Q;

    /* renamed from: R */
    public final C44093w f119347R;

    /* renamed from: S */
    public float f119348S;

    /* renamed from: T */
    public boolean f119349T;

    /* renamed from: U */
    public boolean f119350U;

    /* renamed from: V */
    public Integer f119351V;

    /* renamed from: W */
    public MTimerHandler f119352W;

    /* renamed from: d */
    public final String f119353d = "MicroMsg.MPVideoPlayFullScreenView";

    /* renamed from: e */
    public View f119354e;

    /* renamed from: f */
    public View f119355f;

    /* renamed from: g */
    public ViewGroup f119356g;

    /* renamed from: h */
    public ViewGroup f119357h;

    /* renamed from: i */
    public View f119358i;

    /* renamed from: j */
    public View f119359j;

    /* renamed from: n */
    public View f119360n;

    /* renamed from: o */
    public View f119361o;

    /* renamed from: p */
    public View f119362p;

    /* renamed from: p0 */
    public final long f119363p0;

    /* renamed from: q */
    public View f119364q;

    /* renamed from: r */
    public View f119365r;

    /* renamed from: s */
    public ImageView f119366s;

    /* renamed from: t */
    public TextView f119367t;

    /* renamed from: u */
    public MMNeat7extView f119368u;

    /* renamed from: v */
    public View f119369v;

    /* renamed from: w */
    public View f119370w;

    /* renamed from: x */
    public C48300n f119371x;

    /* renamed from: x0 */
    public boolean f119372x0;

    /* renamed from: y */
    public VideoControl f119373y;

    /* renamed from: z */
    public RedesignVideoPlayerSeekBar f119374z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$a */
    public static final class C44048a implements View.OnClickListener {

        /* renamed from: d */
        public static final C44048a f119375d = new C44048a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$b */
    public static final class C44049b implements View.OnClickListener {

        /* renamed from: d */
        public static final C44049b f119376d = new C44049b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$c */
    public static final class C44050c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119377d;

        /* renamed from: e */
        public final /* synthetic */ Context f119378e;

        public C44050c(MPVideoPlayFullScreenView mPVideoPlayFullScreenView, Context context) {
            this.f119377d = mPVideoPlayFullScreenView;
            this.f119378e = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r8 != null ? r8.f133375p : null) != false) goto L_0x002e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$3"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView r8 = r7.f119377d
                s90.n r8 = r8.f119371x
                r0 = 0
                if (r8 == 0) goto L_0x002e
                if (r8 == 0) goto L_0x0027
                java.lang.String r8 = r8.f133375p
                goto L_0x0028
            L_0x0027:
                r8 = r0
            L_0x0028:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 == 0) goto L_0x0037
            L_0x002e:
                com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView r8 = r7.f119377d
                java.lang.String r8 = r8.f119353d
                java.lang.String r1 = "srcUserName is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            L_0x0037:
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView r1 = r7.f119377d
                s90.n r1 = r1.f119371x
                if (r1 == 0) goto L_0x0045
                java.lang.String r1 = r1.f133375p
                goto L_0x0046
            L_0x0045:
                r1 = r0
            L_0x0046:
                java.lang.String r2 = "Contact_User"
                r8.putExtra(r2, r1)
                r1 = 163(0xa3, float:2.28E-43)
                java.lang.String r2 = "Contact_Scene"
                r8.putExtra(r2, r1)
                java.lang.String r1 = "force_get_contact"
                r2 = 1
                r8.putExtra(r1, r2)
                java.lang.String r1 = "key_use_new_contact_profile"
                r8.putExtra(r1, r2)
                android.content.Context r1 = r7.f119378e
                java.lang.String r3 = "profile"
                java.lang.String r4 = ".ui.ContactInfoUI"
                ke3.C88144b.m109791i(r1, r3, r4, r8, r0)
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r0 = 18589(0x489d, float:2.6049E-41)
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r1[r3] = r4
                r3 = 3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                r8.mo160131h(r0, r1)
                java.lang.String r8 = "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$3"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.media.MPVideoPlayFullScreenView.C44050c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$d */
    public static final class C44051d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119379d;

        public C44051d(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
            this.f119379d = mPVideoPlayFullScreenView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f119379d.mo68660f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$e */
    public static final class C44052e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119380d;

        /* renamed from: e */
        public final /* synthetic */ Context f119381e;

        public C44052e(MPVideoPlayFullScreenView mPVideoPlayFullScreenView, Context context) {
            this.f119380d = mPVideoPlayFullScreenView;
            this.f119381e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C48300n nVar = this.f119380d.f119371x;
            if (nVar != null) {
                C44089v.f119438a.mo68719a(this.f119381e, nVar, 4);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$f */
    public static final class C44053f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f119382d;

        /* renamed from: e */
        public final /* synthetic */ MPVideoPlayFullScreenView f119383e;

        public C44053f(Context context, MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
            this.f119382d = context;
            this.f119383e = mPVideoPlayFullScreenView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f119382d;
            if (!(context instanceof WebViewUI) || this.f119383e.f119371x == null) {
                Log.m105928w(this.f119383e.f119353d, "should not be here");
            } else {
                if (C44625c2.m49076i()) {
                    C44089v vVar = C44089v.f119438a;
                    C48300n nVar = this.f119383e.f119371x;
                    C87412m.m108591d(nVar);
                    vVar.mo68719a(context, nVar, 5);
                } else {
                    C44085t tVar = ((WebViewUI) context).f118539k2;
                    C48300n nVar2 = this.f119383e.f119371x;
                    tVar.f119434a = nVar2;
                    C44080p pVar = C44080p.f119428a;
                    C87412m.m108591d(nVar2);
                    String str = nVar2.f133370h;
                    C48300n nVar3 = this.f119383e.f119371x;
                    C87412m.m108591d(nVar3);
                    String str2 = nVar3.f133369g;
                    C48300n nVar4 = this.f119383e.f119371x;
                    C87412m.m108591d(nVar4);
                    pVar.mo68714b(context, str, "", str2, nVar4.f133366d, 2);
                }
                C115669n.INSTANCE.mo160131h(18589, 16, 3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$g */
    public static final class C44054g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119384d;

        public C44054g(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
            this.f119384d = mPVideoPlayFullScreenView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119384d;
            int i = MPVideoPlayFullScreenView.f119330y0;
            if (mPVideoPlayFullScreenView.f119335E) {
                VideoControl videoControl = mPVideoPlayFullScreenView.f119373y;
                if (videoControl != null) {
                    videoControl.videoPause();
                }
            } else {
                VideoControl videoControl2 = mPVideoPlayFullScreenView.f119373y;
                if (videoControl2 != null) {
                    videoControl2.videoPlay();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$h */
    public static final class C44055h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119385d;

        public C44055h(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
            this.f119385d = mPVideoPlayFullScreenView;
        }

        public final void run() {
            this.f119385d.mo68673n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$i */
    public static final class C44056i implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a */
        public final /* synthetic */ MPVideoPlayFullScreenView f119386a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f119387b;

        public C44056i(MPVideoPlayFullScreenView mPVideoPlayFullScreenView, ViewGroup viewGroup) {
            this.f119386a = mPVideoPlayFullScreenView;
            this.f119387b = viewGroup;
        }

        public final void onSystemUiVisibilityChange(int i) {
            if ((i & 4) == 0) {
                if (this.f119386a.getVisibility() == 0) {
                    this.f119387b.setSystemUiVisibility(5894);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$j */
    public static final class C44057j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ View f119388d;

        /* renamed from: e */
        public final /* synthetic */ MPVideoPlayFullScreenView f119389e;

        public C44057j(View view, MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
            this.f119388d = view;
            this.f119389e = mPVideoPlayFullScreenView;
        }

        public void onGlobalLayout() {
            this.f119388d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (C11171e.m11046c(24)) {
                Context context = this.f119389e.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context).isInMultiWindowMode()) {
                    MPVideoPlayFullScreenView.m48334b(this.f119389e);
                    return;
                }
            }
            int c = C75044y4.m89991c(this.f119389e.getContext());
            int f = C76577a.m92155f(this.f119389e.getContext(), C0966R.dimen.f3766df);
            int i = f * 3;
            int i2 = f * 4;
            int i3 = f * 7;
            int max = Math.max(c - i, 0);
            int i4 = f * 2;
            this.f119389e.f119358i.setPadding(max, i4, max - f, i4);
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119389e;
            View view = mPVideoPlayFullScreenView.f119331A;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.height = C76577a.m92157h(mPVideoPlayFullScreenView.getContext(), C0966R.dimen.f3713c6);
                view.setLayoutParams(layoutParams2);
            }
            ViewGroup.LayoutParams layoutParams3 = this.f119389e.f119361o.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.removeRule(3);
            layoutParams4.setMargins(i2, i, 0, i);
            layoutParams4.addRule(15);
            this.f119389e.f119361o.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = this.f119389e.f119362p.getLayoutParams();
            C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
            layoutParams6.removeRule(3);
            layoutParams6.setMargins(0, i, i2, i);
            layoutParams6.addRule(15);
            this.f119389e.f119362p.setLayoutParams(layoutParams6);
            ViewGroup.LayoutParams layoutParams7 = this.f119389e.f119365r.getLayoutParams();
            C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
            layoutParams8.removeRule(3);
            layoutParams8.setMargins(0, i, i2, i);
            layoutParams8.addRule(15);
            this.f119389e.f119365r.setLayoutParams(layoutParams8);
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.f119389e.f119374z;
            C87412m.m108591d(redesignVideoPlayerSeekBar);
            ViewGroup.LayoutParams layoutParams9 = redesignVideoPlayerSeekBar.getLayoutParams();
            C87412m.m108592e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) layoutParams9;
            layoutParams10.addRule(1, C0966R.C0970id.l6t);
            layoutParams10.addRule(0, C0966R.C0970id.l6y);
            layoutParams10.addRule(15);
            layoutParams10.setMargins(i3, i, i3, i);
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = this.f119389e.f119374z;
            if (redesignVideoPlayerSeekBar2 != null) {
                redesignVideoPlayerSeekBar2.setLayoutParams(layoutParams10);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$k */
    public static final class C44058k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ View f119390d;

        /* renamed from: e */
        public final /* synthetic */ MPVideoPlayFullScreenView f119391e;

        public C44058k(View view, MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
            this.f119390d = view;
            this.f119391e = mPVideoPlayFullScreenView;
        }

        public void onGlobalLayout() {
            this.f119390d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MPVideoPlayFullScreenView.m48334b(this.f119391e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$l */
    public static final class C44059l implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119392d;

        public C44059l(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
            this.f119392d = mPVideoPlayFullScreenView;
        }

        public final boolean onTimerExpired() {
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119392d;
            int i = MPVideoPlayFullScreenView.f119330y0;
            mPVideoPlayFullScreenView.mo68677p();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$m */
    public static final class C44060m implements C53156a.C38082b {

        /* renamed from: d */
        public final /* synthetic */ MPVideoPlayFullScreenView f119393d;

        /* renamed from: e */
        public final /* synthetic */ Context f119394e;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$m$a */
        public /* synthetic */ class C44061a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f119395a;

            static {
                int[] iArr = new int[C53156a.C53157a.values().length];
                iArr[2] = 1;
                iArr[4] = 2;
                f119395a = iArr;
            }
        }

        public C44060m(MPVideoPlayFullScreenView mPVideoPlayFullScreenView, Context context) {
            this.f119393d = mPVideoPlayFullScreenView;
            this.f119394e = context;
        }

        /* renamed from: a */
        public final void mo12953a(C53156a.C53157a aVar, C53156a.C53157a aVar2) {
            int i;
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f119393d;
            if (mPVideoPlayFullScreenView.f119342L) {
                int i2 = aVar2 == null ? -1 : C44061a.f119395a[aVar2.ordinal()];
                if (i2 == 1) {
                    i = 0;
                } else if (i2 == 2) {
                    i = 8;
                } else {
                    return;
                }
                mPVideoPlayFullScreenView.f119341K = i;
                Context context = this.f119394e;
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).setRequestedOrientation(this.f119393d.f119341K);
                MPVideoPlayFullScreenView mPVideoPlayFullScreenView2 = this.f119393d;
                int i3 = mPVideoPlayFullScreenView2.f119341K;
                if (i3 == 0 || i3 == 8) {
                    mPVideoPlayFullScreenView2.mo68669j();
                } else {
                    mPVideoPlayFullScreenView2.mo68670k();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MPVideoPlayFullScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f119346Q = new C53156a(context, new C44060m(this, context));
        this.f119347R = new C44093w();
        View.inflate(context, C0966R.C0971layout.bgu, this);
        View findViewById = findViewById(C0966R.C0970id.l6q);
        C87412m.m108593f(findViewById, "findViewById(R.id.video_play_root_layout)");
        this.f119354e = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.l6p);
        C87412m.m108593f(findViewById2, "findViewById(R.id.video_play_op_layout)");
        this.f119355f = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.f359486l51);
        C87412m.m108593f(findViewById3, "findViewById(R.id.video_container_layout)");
        this.f119356g = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.l6u);
        C87412m.m108593f(findViewById4, "findViewById(R.id.video_player_footer)");
        this.f119358i = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.h0j);
        C87412m.m108593f(findViewById5, "findViewById(com.tencent…izui.R.id.mp_info_layout)");
        this.f119359j = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.l7v);
        C87412m.m108593f(findViewById6, "findViewById(R.id.video_touch_layout)");
        this.f119360n = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.h0n);
        C87412m.m108593f(findViewById7, "findViewById(com.tencent…d.mp_video_avatar_layout)");
        this.f119369v = findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.h0m);
        C87412m.m108593f(findViewById8, "findViewById(com.tencent….R.id.mp_video_avatar_iv)");
        this.f119366s = (ImageView) findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.h0w);
        C87412m.m108593f(findViewById9, "findViewById(com.tencent….id.mp_video_nickname_tv)");
        this.f119367t = (TextView) findViewById9;
        View findViewById10 = findViewById(C0966R.C0970id.f358777h11);
        C87412m.m108593f(findViewById10, "findViewById(com.tencent…i.R.id.mp_video_title_tv)");
        this.f119368u = (MMNeat7extView) findViewById10;
        View findViewById11 = findViewById(C0966R.C0970id.f358778h12);
        C87412m.m108593f(findViewById11, "findViewById(com.tencent…ideo_view_article_layout)");
        this.f119370w = findViewById11;
        this.f119374z = (RedesignVideoPlayerSeekBar) findViewById(C0966R.C0970id.l6x);
        this.f119331A = findViewById(C0966R.C0970id.kqj);
        this.f119332B = (ProgressBar) findViewById(C0966R.C0970id.l6w);
        RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.f119374z;
        if (redesignVideoPlayerSeekBar != null) {
            redesignVideoPlayerSeekBar.setOnClickListener(this);
        }
        View view = this.f119358i;
        if (view != null) {
            view.setOnClickListener(C44048a.f119375d);
        }
        View view2 = this.f119359j;
        if (view2 != null) {
            view2.setOnClickListener(C44049b.f119376d);
        }
        this.f119369v.setOnClickListener(new C44050c(this, context));
        C7007c1.m7256a(this.f119369v);
        View findViewById12 = findViewById(C0966R.C0970id.l6t);
        C87412m.m108593f(findViewById12, "findViewById(R.id.video_player_close)");
        this.f119361o = findViewById12;
        findViewById12.setOnClickListener(new C44051d(this));
        View findViewById13 = findViewById(C0966R.C0970id.l6v);
        C87412m.m108593f(findViewById13, "findViewById(R.id.video_player_more_iv)");
        this.f119362p = findViewById13;
        findViewById13.setOnClickListener(new C44052e(this, context));
        View findViewById14 = findViewById(C0966R.C0970id.l6y);
        C87412m.m108593f(findViewById14, "findViewById(R.id.video_player_share_iv)");
        this.f119365r = findViewById14;
        findViewById14.setOnClickListener(new C44053f(context, this));
        View findViewById15 = findViewById(C0966R.C0970id.f359493l80);
        C87412m.m108593f(findViewById15, "findViewById(R.id.video_wait_play_btn)");
        this.f119364q = findViewById15;
        findViewById15.setOnClickListener(new C44054g(this));
        View view3 = this.f119370w;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = this.f119374z;
        if (redesignVideoPlayerSeekBar2 != null) {
            redesignVideoPlayerSeekBar2.setPlayBtnOnClickListener(this);
        }
        RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar3 = this.f119374z;
        if (redesignVideoPlayerSeekBar3 != null) {
            redesignVideoPlayerSeekBar3.setIplaySeekCallback(new C44066d(this));
        }
        this.f119348S = 1.0f;
        this.f119352W = new MTimerHandler(new C44059l(this), true);
        this.f119363p0 = 4000;
    }

    /* renamed from: a */
    public static final void m48333a(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        mPVideoPlayFullScreenView.getClass();
        MMHandlerThread.postToMainThread(new C44065c(mPVideoPlayFullScreenView));
    }

    /* renamed from: b */
    public static final void m48334b(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        int c = C75044y4.m89991c(mPVideoPlayFullScreenView.getContext());
        int f = C76577a.m92155f(mPVideoPlayFullScreenView.getContext(), C0966R.dimen.f3766df);
        double d = (double) f;
        int i = (int) (2.5d * d);
        int i2 = (int) (d * 1.5d);
        int i3 = f * 3;
        int i4 = f * 2;
        mPVideoPlayFullScreenView.f119358i.setPadding(0, i4, 0, i4 + c);
        View view = mPVideoPlayFullScreenView.f119331A;
        if (view != null) {
            view.setPadding(0, 0, 0, c);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = C76577a.m92157h(mPVideoPlayFullScreenView.getContext(), C0966R.dimen.f3720ca);
            view.setLayoutParams(layoutParams2);
        }
        RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = mPVideoPlayFullScreenView.f119374z;
        C87412m.m108591d(redesignVideoPlayerSeekBar);
        ViewGroup.LayoutParams layoutParams3 = redesignVideoPlayerSeekBar.getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(1);
        layoutParams4.removeRule(0);
        layoutParams4.removeRule(15);
        layoutParams4.setMargins(i, i3, i2, 0);
        RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = mPVideoPlayFullScreenView.f119374z;
        if (redesignVideoPlayerSeekBar2 != null) {
            redesignVideoPlayerSeekBar2.setLayoutParams(layoutParams4);
        }
        ViewGroup.LayoutParams layoutParams5 = mPVideoPlayFullScreenView.f119361o.getLayoutParams();
        C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.addRule(3, C0966R.C0970id.l6x);
        layoutParams6.setMargins(i, i3, 0, 0);
        layoutParams6.removeRule(15);
        mPVideoPlayFullScreenView.f119361o.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = mPVideoPlayFullScreenView.f119362p.getLayoutParams();
        C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
        layoutParams8.addRule(3, C0966R.C0970id.l6x);
        layoutParams8.setMargins(0, i3, i2, 0);
        layoutParams8.removeRule(15);
        mPVideoPlayFullScreenView.f119362p.setLayoutParams(layoutParams8);
        ViewGroup.LayoutParams layoutParams9 = mPVideoPlayFullScreenView.f119365r.getLayoutParams();
        C87412m.m108592e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) layoutParams9;
        layoutParams10.addRule(3, C0966R.C0970id.l6x);
        layoutParams10.setMargins(0, i3, i2, 0);
        layoutParams10.removeRule(15);
        mPVideoPlayFullScreenView.f119365r.setLayoutParams(layoutParams10);
    }

    /* renamed from: c */
    public static final void m48335c(MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        MPVideoPlayFullScreenView mPVideoPlayFullScreenView2 = mPVideoPlayFullScreenView;
        mPVideoPlayFullScreenView.getClass();
        if (BuildInfo.IS_FLAVOR_RED) {
            Log.m105919d(mPVideoPlayFullScreenView2.f119353d, "showToolBar %s", Util.getStack());
        }
        if (!mPVideoPlayFullScreenView2.f119372x0) {
            mPVideoPlayFullScreenView2.f119372x0 = true;
            String str = mPVideoPlayFullScreenView2.f119353d;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(mPVideoPlayFullScreenView2.f119355f.getVisibility() == 0);
            Log.m105919d(str, "fadeInOpLayout: %b", objArr);
            mPVideoPlayFullScreenView2.f119355f.clearAnimation();
            View view = mPVideoPlayFullScreenView2.f119355f;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setFillAfter(true);
            view.startAnimation(alphaAnimation);
            Log.m105918d(mPVideoPlayFullScreenView2.f119353d, "start timer");
            if (!mPVideoPlayFullScreenView2.f119352W.stopped()) {
                Log.m105918d(mPVideoPlayFullScreenView2.f119353d, "stop timer");
                mPVideoPlayFullScreenView2.f119352W.stopTimer();
            }
            mPVideoPlayFullScreenView2.f119352W.startTimer(mPVideoPlayFullScreenView2.f119363p0);
            View view2 = mPVideoPlayFullScreenView2.f119359j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = mPVideoPlayFullScreenView2.f119358i;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view6 = mPVideoPlayFullScreenView2.f119355f;
            if (view6 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view7 = view6;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "showToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: d */
    public static final void m48336d(MPVideoPlayFullScreenView mPVideoPlayFullScreenView, boolean z) {
        mPVideoPlayFullScreenView.f119335E = z;
        MMHandlerThread.postToMainThread(new C44078n(z, mPVideoPlayFullScreenView));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo68659e() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.content.Context r0 = r5.getContext()     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r0, r1)     // Catch:{ all -> 0x00b8 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x00b8 }
            s90.n r1 = r5.f119371x     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x0019
            java.lang.String r0 = r5.f119353d     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "adjustOrientation mpShareVideoInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r5)
            return
        L_0x0019:
            boolean r1 = r5.f119344N     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x0094
            boolean r1 = r5.f119345P     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x0022
            goto L_0x0094
        L_0x0022:
            r1 = 1
            r5.f119344N = r1     // Catch:{ all -> 0x00b8 }
            int r2 = r5.f119340J     // Catch:{ all -> 0x00b8 }
            int r3 = r5.f119339I     // Catch:{ all -> 0x00b8 }
            if (r2 != r3) goto L_0x0031
            int r2 = r0.getRequestedOrientation()     // Catch:{ all -> 0x00b8 }
            r5.f119340J = r2     // Catch:{ all -> 0x00b8 }
        L_0x0031:
            java.lang.String r2 = r5.f119353d     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r3.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = "adjustOrientation width = "
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            s90.n r4 = r5.f119371x     // Catch:{ all -> 0x00b8 }
            gy3.C87412m.m108591d(r4)     // Catch:{ all -> 0x00b8 }
            int r4 = r4.f133372j     // Catch:{ all -> 0x00b8 }
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = ", height="
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            s90.n r4 = r5.f119371x     // Catch:{ all -> 0x00b8 }
            gy3.C87412m.m108591d(r4)     // Catch:{ all -> 0x00b8 }
            int r4 = r4.f133373n     // Catch:{ all -> 0x00b8 }
            r3.append(r4)     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x00b8 }
            s90.n r2 = r5.f119371x     // Catch:{ all -> 0x00b8 }
            gy3.C87412m.m108591d(r2)     // Catch:{ all -> 0x00b8 }
            int r2 = r2.f133372j     // Catch:{ all -> 0x00b8 }
            s90.n r3 = r5.f119371x     // Catch:{ all -> 0x00b8 }
            gy3.C87412m.m108591d(r3)     // Catch:{ all -> 0x00b8 }
            int r3 = r3.f133373n     // Catch:{ all -> 0x00b8 }
            r4 = 0
            if (r2 > r3) goto L_0x0076
            r5.f119341K = r1     // Catch:{ all -> 0x00b8 }
            r0.setRequestedOrientation(r1)     // Catch:{ all -> 0x00b8 }
            r5.f119342L = r4     // Catch:{ all -> 0x00b8 }
            goto L_0x0082
        L_0x0076:
            r5.f119342L = r1     // Catch:{ all -> 0x00b8 }
            r5.f119341K = r4     // Catch:{ all -> 0x00b8 }
            r0.setRequestedOrientation(r4)     // Catch:{ all -> 0x00b8 }
            we0.a r0 = r5.f119346Q     // Catch:{ all -> 0x00b8 }
            r0.enable()     // Catch:{ all -> 0x00b8 }
        L_0x0082:
            int r0 = r5.f119341K     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x008f
            r1 = 8
            if (r0 != r1) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            r5.mo68670k()     // Catch:{ all -> 0x00b8 }
            goto L_0x0092
        L_0x008f:
            r5.mo68669j()     // Catch:{ all -> 0x00b8 }
        L_0x0092:
            monitor-exit(r5)
            return
        L_0x0094:
            java.lang.String r0 = r5.f119353d     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "adjustOrientation hasAdjustOrientation="
            r1.append(r2)     // Catch:{ all -> 0x00b8 }
            boolean r2 = r5.f119344N     // Catch:{ all -> 0x00b8 }
            r1.append(r2)     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = ", hasAddVideoView="
            r1.append(r2)     // Catch:{ all -> 0x00b8 }
            boolean r2 = r5.f119345P     // Catch:{ all -> 0x00b8 }
            r1.append(r2)     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r5)
            return
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.media.MPVideoPlayFullScreenView.mo68659e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68660f() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r1 == 0) goto L_0x002a
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.ui.widget.MMWebView r1 = r0.f118523f
            if (r1 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x0031
            java.lang.String r1 = r3.f119353d
            java.lang.String r2 = "close click"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r3.mo68674o()
            com.tencent.mm.ui.widget.MMWebView r0 = r0.f118523f
            r0.leaveFullscreen()
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$h r0 = new com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView$h
            r0.<init>(r3)
            r1 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
            goto L_0x0031
        L_0x002a:
            java.lang.String r0 = r3.f119353d
            java.lang.String r1 = "should not be here"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.media.MPVideoPlayFullScreenView.mo68660f():void");
    }

    /* renamed from: g */
    public final int mo68661g(boolean z) {
        Integer num;
        if (z || (num = this.f119351V) == null) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            int intExtra = ((Activity) context).getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
            if (intExtra != 10000) {
                return intExtra;
            }
            Context context2 = getContext();
            String str = null;
            C5853h hVar = context2 instanceof C5853h ? (C5853h) context2 : null;
            if (hVar != null) {
                str = hVar.mo6901n0();
            }
            try {
                return Util.getInt(Uri.parse(str).getQueryParameter(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 10000);
            } catch (Exception unused) {
                return intExtra;
            }
        } else {
            C87412m.m108591d(num);
            return num.intValue();
        }
    }

    public final int getEnterId() {
        return this.f119336F;
    }

    public final long getEnterTimeInMs() {
        return this.f119337G;
    }

    public final boolean getForbidForward() {
        return this.f119338H;
    }

    public final C44093w getMpShareVideoReport() {
        return this.f119347R;
    }

    public final Integer getSubScene() {
        return this.f119351V;
    }

    /* renamed from: h */
    public final void mo68667h() {
        ViewTreeObserver viewTreeObserver;
        if (this.f119333C == null) {
            this.f119333C = new C45059m0(getContext());
        }
        C48300n nVar = this.f119371x;
        if (nVar == null) {
            this.f119350U = true;
            return;
        }
        this.f119350U = false;
        int i = nVar.f129344u;
        C87412m.m108591d(nVar);
        int i2 = nVar.f129345v;
        C48300n nVar2 = this.f119371x;
        C87412m.m108591d(nVar2);
        int i3 = nVar2.f129346w;
        C48300n nVar3 = this.f119371x;
        C87412m.m108591d(nVar3);
        int i4 = nVar3.f129347x;
        C45059m0 m0Var = this.f119333C;
        if (m0Var != null) {
            m0Var.mo70410e(i, i2, i3, i4);
        }
        C45059m0 m0Var2 = this.f119333C;
        if (m0Var2 != null) {
            m0Var2.f122234n = 1.0f;
        }
        if (m0Var2 != null) {
            m0Var2.f122235o = 0;
            m0Var2.f122236p = 0;
        }
        ViewGroup viewGroup = this.f119357h;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C44073k(this));
        }
    }

    /* renamed from: i */
    public final void mo68668i(boolean z) {
        String str = this.f119353d;
        Log.m105924i(str, "handleFullScreenStatusBar forwardUiVisibility " + this.f119343M);
        if (z) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            View decorView = activity.getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            this.f119343M = viewGroup.getSystemUiVisibility();
            viewGroup.setOnSystemUiVisibilityChangeListener(new C44056i(this, viewGroup));
            viewGroup.setSystemUiVisibility(4102);
            activity.getWindow().addFlags(1024);
            return;
        }
        Context context2 = getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
        Activity activity2 = (Activity) context2;
        View decorView2 = activity2.getWindow().getDecorView();
        C87412m.m108592e(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) decorView2).setSystemUiVisibility(this.f119343M);
        activity2.getWindow().clearFlags(1024);
    }

    /* renamed from: j */
    public final void mo68669j() {
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        View decorView = ((Activity) context).getWindow().getDecorView();
        C87412m.m108593f(decorView, "context as Activity).window.decorView");
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C44057j(decorView, this));
    }

    /* renamed from: k */
    public final void mo68670k() {
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        View decorView = ((Activity) context).getWindow().getDecorView();
        C87412m.m108593f(decorView, "context as Activity).window.decorView");
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C44058k(decorView, this));
    }

    /* renamed from: l */
    public final void mo68671l() {
        C48300n nVar = this.f119371x;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.f129348y = this.f119336F;
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            C43791l lVar = ((WebViewUI) context).f118511a1;
            if (lVar != null) {
                try {
                    C44093w wVar = this.f119347R;
                    C48300n nVar2 = this.f119371x;
                    C87412m.m108591d(nVar2);
                    wVar.f119453h = lVar.Ie0(nVar2.f133375p);
                    C44093w wVar2 = this.f119347R;
                    wVar2.f119451f = 141;
                    wVar2.f119452g = mo68661g(true);
                } catch (Exception unused) {
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f119337G = currentTimeMillis;
            int i = (int) (currentTimeMillis / ((long) 1000));
            this.f119336F = i;
            this.f119347R.mo68721b(this.f119371x, 1, i, 101);
            this.f119347R.mo68721b(this.f119371x, 5, this.f119336F, 101);
            this.f119347R.f119454i = 0;
        }
    }

    /* renamed from: m */
    public final void mo68672m() {
        MultiTaskInfo multiTaskInfo;
        C64459j13 m2;
        this.f119368u.getPaint().setFakeBoldText(true);
        this.f119367t.getPaint().setFakeBoldText(true);
        MMNeat7extView mMNeat7extView = this.f119368u;
        C48300n nVar = this.f119371x;
        String str = null;
        mMNeat7extView.mo104279b(nVar != null ? nVar.f133369g : null);
        TextView textView = this.f119367t;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = getContext();
        C48300n nVar2 = this.f119371x;
        textView.setText(hVar.yp0(context, nVar2 != null ? nVar2.f133376q : null, this.f119367t.getTextSize()));
        if (this.f119338H) {
            View view = this.f119362p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f119365r;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view4 = this.f119362p;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f119365r;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Context context2 = getContext();
        if (context2 instanceof WebViewUI) {
            C48300n nVar3 = this.f119371x;
            if (!Util.isNullOrNil(nVar3 != null ? nVar3.f129342B : null)) {
                C48300n nVar4 = this.f119371x;
                if (nVar4 != null) {
                    str = nVar4.f129342B;
                }
            } else {
                C53513a aVar5 = ((WebViewUI) context2).f118483Q1;
                if (!(aVar5 == null || (multiTaskInfo = aVar5.f326418a) == null || (m2 = multiTaskInfo.mo80305m2()) == null)) {
                    str = m2.f183756i;
                }
            }
            C20828a b = C20828a.m22825b();
            ImageView imageView = this.f119366s;
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59364t = true;
            bVar.f59359o = C0966R.C0969drawable.be5;
            b.mo32519h(str, imageView, bVar.mo32666a());
        }
    }

    /* renamed from: n */
    public final void mo68673n() {
        C48590l lVar;
        if (getVisibility() != 8) {
            setVisibility(8);
            this.f119356g.removeAllViews();
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            ((WebViewUI) context).setMMOrientation();
            Log.m105924i(this.f119353d, "onExitMpVideoFullPage");
            this.f119344N = false;
            this.f119345P = false;
            if (this.f119371x != null) {
                this.f119347R.f119449d = (int) (System.currentTimeMillis() - this.f119337G);
                C44093w wVar = this.f119347R;
                wVar.f119448c = (int) (this.f119334D * ((double) 1000));
                wVar.mo68721b(this.f119371x, 6, this.f119336F, 101);
                this.f119347R.mo68721b(this.f119371x, 2, this.f119336F, 101);
                Context context2 = getContext();
                if ((context2 instanceof WebViewUI) && (lVar = ((WebViewUI) context2).f118508Z) != null) {
                    C48300n nVar = this.f119371x;
                    C87412m.m108591d(nVar);
                    String str = nVar.f133368f;
                    int i = (int) this.f119334D;
                    if (lVar.f130003h) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("videoVid", str);
                        hashMap.put("videoCurrTime", Integer.valueOf(i));
                        hashMap.put("action", "onExitMpVideoFullPage");
                        String c = C13851h1.C13852a.m13143c("onMPPageAction", hashMap, lVar.f130011p, lVar.f130012q);
                        MMWebView mMWebView = lVar.f129996a;
                        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
                    }
                }
                this.f119371x = null;
            }
        }
    }

    /* renamed from: o */
    public final void mo68674o() {
        if (this.f119340J != this.f119339I) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).setRequestedOrientation(this.f119340J);
            this.f119340J = this.f119339I;
            this.f119346Q.disable();
        }
        mo68668i(false);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null && view.getId() == C0966R.C0970id.hwy) {
            if (this.f119335E) {
                VideoControl videoControl = this.f119373y;
                if (videoControl != null) {
                    videoControl.videoPause();
                }
            } else {
                VideoControl videoControl2 = this.f119373y;
                if (videoControl2 != null) {
                    videoControl2.videoPlay();
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 1) {
            Log.m105919d(this.f119353d, "%d image gallery ui is vertical screen", Integer.valueOf(hashCode()));
            mo68670k();
        } else if (i == 2) {
            Log.m105919d(this.f119353d, "%d image gallery ui is horizontal screen", Integer.valueOf(hashCode()));
            mo68669j();
        }
    }

    /* renamed from: p */
    public final void mo68677p() {
        if (BuildInfo.IS_FLAVOR_RED) {
            Log.m105919d(this.f119353d, "hideOpLayer %s", Util.getStack());
        }
        if (this.f119372x0) {
            this.f119372x0 = false;
            String str = this.f119353d;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(this.f119355f.getVisibility() == 0);
            Log.m105919d(str, "fadeOutOpLayout: %b", objArr);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration((long) 150);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setInterpolator(new AccelerateInterpolator(10.0f));
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setAnimationListener(new C44064b(this));
            this.f119355f.clearAnimation();
            this.f119355f.startAnimation(alphaAnimation);
        }
    }

    public final void setEnterId(int i) {
        this.f119336F = i;
    }

    public final void setEnterTimeInMs(long j) {
        this.f119337G = j;
    }

    public final void setForbidForward(boolean z) {
        this.f119338H = z;
    }

    public final void setSubScene(Integer num) {
        this.f119351V = num;
    }
}
