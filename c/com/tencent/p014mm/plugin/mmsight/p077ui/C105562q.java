package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import eq3.C107283a;
import f72.C97842b;
import g72.C107755a;
import ig3.C108460i;
import j72.C98921l;
import java.util.Iterator;
import java.util.Stack;
import kg3.C76577a;
import l72.C109273a;
import p1093bh.C104084a;
import p248ug.C111159e;
import p248ug.C111162m0;
import p248ug.C111164r0;
import p511ew.C58849b;
import p520fi.C107547d;
import qo3.C89779i0;
import r80.C89903h;
import z20.C112573c;
import z20.C112579f;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.q */
public class C105562q {

    /* renamed from: D */
    public static final Object f313977D = new Object();

    /* renamed from: E */
    public static int f313978E;

    /* renamed from: A */
    public String f313979A;

    /* renamed from: B */
    public boolean f313980B = false;

    /* renamed from: C */
    public boolean f313981C = true;

    /* renamed from: a */
    public RecyclerThumbSeekBar f313982a;

    /* renamed from: b */
    public boolean f313983b = false;

    /* renamed from: c */
    public int f313984c = -1;

    /* renamed from: d */
    public int f313985d = -1;

    /* renamed from: e */
    public int f313986e = -1;

    /* renamed from: f */
    public String f313987f;

    /* renamed from: g */
    public MTimerHandler f313988g;

    /* renamed from: h */
    public VideoPlayerTextureView f313989h;

    /* renamed from: i */
    public ViewGroup f313990i;

    /* renamed from: j */
    public MMActivity f313991j;

    /* renamed from: k */
    public C111164r0 f313992k;

    /* renamed from: l */
    public C111159e f313993l;

    /* renamed from: m */
    public C107755a f313994m;

    /* renamed from: n */
    public C89903h f313995n;

    /* renamed from: o */
    public C89779i0 f313996o;

    /* renamed from: p */
    public C105564b f313997p;

    /* renamed from: q */
    public VideoSeekBarEditorView f313998q;

    /* renamed from: r */
    public boolean f313999r = false;

    /* renamed from: s */
    public VideoTransPara f314000s;

    /* renamed from: t */
    public boolean f314001t = false;

    /* renamed from: u */
    public boolean f314002u = false;

    /* renamed from: v */
    public boolean f314003v = false;

    /* renamed from: w */
    public String f314004w = null;

    /* renamed from: x */
    public int f314005x = -1;

    /* renamed from: y */
    public int f314006y;

    /* renamed from: z */
    public C109273a.C109275b f314007z;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.q$a */
    public class C105563a extends AnimatorListenerAdapter {
        public C105563a() {
        }

        public void onAnimationEnd(Animator animator) {
            C105562q.this.f313998q.setVisibility(8);
            C105562q.this.f313998q.setAlpha(1.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.q$b */
    public interface C105564b {
        /* renamed from: a */
        void mo150277a();

        /* renamed from: b */
        void mo150278b();

        /* renamed from: c */
        void mo150279c();
    }

    /* renamed from: a */
    public static void m141754a(C105562q qVar, boolean z) {
        int width = qVar.f313989h.getWidth();
        int height = qVar.f313989h.getHeight();
        int b = C76577a.m92151b(qVar.f313991j, 20) + (qVar.f313998q.getHeight() <= 0 ? C76577a.m92151b(qVar.f313991j, 95) : qVar.f313998q.getHeight()) + C76577a.m92151b(qVar.f313991j, 12);
        if (C75044y4.m89992d(qVar.f313991j)) {
            b += C75044y4.m89991c(qVar.f313991j);
        }
        int i = height - b;
        if (qVar.f313989h.getBottom() + b < C97842b.m126290g(qVar.f313991j).y) {
            i = (int) (((float) (width - (C76577a.m92151b(qVar.f313991j, 32) * 2))) / (((float) width) / ((float) height)));
        }
        float f = (float) width;
        float f2 = (float) height;
        float f3 = (float) i;
        float f4 = ((float) ((int) ((f / f2) * f3))) / f;
        float f5 = f3 / f2;
        if (z) {
            float f6 = -(((float) b) / 2.0f);
            qVar.f313989h.animate().scaleX(f4).scaleY(f5).translationY(f6).setDuration(300).setListener(new C105556p(qVar));
            qVar.f313993l.animate().scaleX(f4).scaleY(f5).translationY(f6).setDuration(300);
        } else {
            qVar.f313989h.setScaleX(f4);
            qVar.f313989h.setScaleY(f5);
            float f7 = -(((float) b) / 2.0f);
            qVar.f313989h.setTranslationY(f7);
            qVar.f313993l.setScaleX(f4);
            qVar.f313993l.setScaleY(f5);
            qVar.f313993l.setTranslationY(f7);
        }
        qVar.f313993l.setAutoShowFooterAndBar(false);
        qVar.f313993l.setFooterVisible(false);
        qVar.f313993l.setActionBarVisible(false);
        if (!qVar.f313983b) {
            qVar.f313982a.setOnPreparedListener(new C105587x(qVar));
            qVar.f313982a.setThumbBarSeekListener(new C105589y(qVar));
            qVar.f313982a.mo150237f(qVar.f313987f);
            qVar.f313989h.setLoop(true);
            qVar.f313989h.setVideoCallback(new C105590z(qVar));
            qVar.f313983b = true;
        }
        qVar.f313998q.setVisibility(0);
        qVar.f313998q.bringToFront();
        qVar.f314003v = true;
    }

    /* renamed from: b */
    public static void m141755b(C105562q qVar, Bitmap bitmap) {
        if (qVar.f313981C) {
            ThreadPool.post(new C105566r(qVar, bitmap), "MMSightVideoEditor_remux");
            return;
        }
        Log.m105924i("MicroMsg.MMSightVideoEditor", "not need remux video!");
        MMHandlerThread.postToMainThread(new C105575s(qVar));
    }

    /* renamed from: c */
    public final void mo150415c() {
        this.f313989h.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300);
        this.f313998q.animate().alpha(0.0f).setDuration(100).setListener(new C105563a());
        this.f313993l.setFooterVisible(true);
        this.f313993l.setAutoShowFooterAndBar(true);
        this.f313993l.setActionBarVisible(true);
        this.f313993l.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300);
        this.f314003v = false;
    }

    /* renamed from: d */
    public void mo150416d(MMActivity mMActivity, int i, String str, VideoSeekBarEditorView videoSeekBarEditorView, VideoPlayerTextureView videoPlayerTextureView, ViewGroup viewGroup, VideoTransPara videoTransPara, boolean z) {
        this.f314000s = videoTransPara;
        if (videoTransPara == null) {
            Log.m105920e("MicroMsg.MMSightVideoEditor", "video trans para is null!!!");
            VideoTransPara videoTransPara2 = new VideoTransPara();
            this.f314000s = videoTransPara2;
            videoTransPara2.f267170h = 10000;
        } else if (videoTransPara.f267170h <= 0) {
            videoTransPara.f267170h = 10000;
        }
        this.f314006y = i;
        this.f313987f = str;
        this.f313998q = videoSeekBarEditorView;
        this.f313989h = videoPlayerTextureView;
        this.f313990i = viewGroup;
        this.f313991j = mMActivity;
        this.f314002u = z;
        this.f314007z = new C109273a.C109275b(i);
        RecyclerThumbSeekBar recyclerThumbSeekBar = videoSeekBarEditorView.f272141d;
        this.f313982a = recyclerThumbSeekBar;
        recyclerThumbSeekBar.setVideoTransPara(this.f314000s);
        C111164r0 ZD = ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD();
        this.f313992k = ZD;
        C111164r0.C111165a aVar = new C111164r0.C111165a();
        aVar.f332925b = false;
        aVar.f332926c = true;
        aVar.f332924a = C111164r0.C111166b.VIDEO;
        aVar.f332928e = new Rect(this.f313989h.getLeft(), this.f313989h.getTop(), this.f313989h.getRight(), this.f313989h.getBottom());
        ZD.mo162895d(aVar);
        C111159e c = this.f313992k.mo162894c(this.f313990i.getContext());
        this.f313993l = c;
        c.setActionBarCallback(new C105549o(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        if (C75044y4.m89992d(this.f313991j)) {
            marginLayoutParams.height = C97842b.m126294k().y - Math.max(C75044y4.m89991c(this.f313991j), C75044y4.m89993e(this.f313991j));
        }
        this.f313990i.addView(this.f313993l, marginLayoutParams);
        this.f313993l.setSelectedFeatureListener(new C105577t(this));
        this.f313998q.setCancelButtonClickListener(new C105579u(this));
        this.f313998q.setFinishButtonClickListener(new C105583v(this));
        if (this.f314002u) {
            this.f313998q.setVisibility(0);
            this.f313998q.bringToFront();
            this.f313998q.post(new C105585w(this));
        }
    }

    /* renamed from: e */
    public void mo150417e() {
        try {
            MTimerHandler mTimerHandler = this.f313988g;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                this.f313988g = null;
            }
            RecyclerThumbSeekBar recyclerThumbSeekBar = this.f313982a;
            if (recyclerThumbSeekBar != null) {
                recyclerThumbSeekBar.mo150238g();
            }
            C111164r0 r0Var = this.f313992k;
            if (r0Var != null) {
                r0Var.mo162897f();
            }
            ViewGroup viewGroup = this.f313990i;
            if (viewGroup != null) {
                viewGroup.removeView(this.f313993l);
            }
            VideoSeekBarEditorView videoSeekBarEditorView = this.f313998q;
            if (videoSeekBarEditorView != null) {
                videoSeekBarEditorView.mo129486b();
            }
            this.f313983b = false;
            C98921l.f289964d.mo126892c();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightVideoEditor", e, "release error: %s", e.getMessage());
        }
    }

    /* renamed from: f */
    public void mo150418f(boolean z, String str) {
        try {
            this.f314007z.f327148b = z;
            C111164r0 r0Var = this.f313992k;
            if (r0Var == null) {
                Log.m105920e("MicroMsg.MMSightVideoEditor", "[report] null == photoEditor");
                return;
            }
            C111162m0 b = r0Var.mo162893b();
            C108460i iVar = (C108460i) b;
            this.f314007z.f327151e = iVar.mo159002b();
            this.f314007z.f327152f = iVar.mo159005e();
            this.f314007z.f327155i = iVar.mo159001a();
            this.f314007z.f327154h = iVar.mo159006f();
            this.f314007z.f327156j = iVar.mo159004d();
            C109273a.C109275b bVar = this.f314007z;
            C107547d dVar = (C107547d) ArtistCacheManager.m140185a().mo148160c(C104084a.EMOJI_AND_TEXT);
            int i = 0;
            if (dVar != null) {
                Stack<C112573c> c = dVar.mo157990c(true);
                if (c != null) {
                    Iterator<C112573c> it = c.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        C112573c next = it.next();
                        if (next instanceof C112579f) {
                            C112579f fVar = (C112579f) next;
                            int[] iArr = C107283a.f320962D;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 8) {
                                    break;
                                } else if (fVar.f337110y == iArr[i3]) {
                                    i2 |= 1 << i3;
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    i = i2;
                }
            }
            bVar.f327157k = i;
            C109273a.m148389b(this.f314007z, str);
        } catch (Exception unused) {
        }
    }
}
