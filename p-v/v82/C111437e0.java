package v82;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import c92.C104331h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105783b0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.p475ui.C71599n0;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;

/* renamed from: v82.e0 */
public final class C111437e0 {

    /* renamed from: a */
    public View f333629a;

    /* renamed from: b */
    public TextView f333630b;

    /* renamed from: c */
    public Context f333631c;

    /* renamed from: d */
    public VideoView f333632d;

    /* renamed from: e */
    public final C13601g f333633e = C36568h.m40985a(new C111438a(this));

    /* renamed from: f */
    public ImageView f333634f;

    /* renamed from: g */
    public View f333635g;

    /* renamed from: h */
    public View f333636h;

    /* renamed from: i */
    public View f333637i;

    /* renamed from: j */
    public ImageView f333638j;

    /* renamed from: k */
    public TextView f333639k;

    /* renamed from: l */
    public volatile boolean f333640l;

    /* renamed from: m */
    public final boolean f333641m = C104331h.m139314g();

    /* renamed from: n */
    public Paint f333642n;

    /* renamed from: o */
    public String f333643o;

    /* renamed from: p */
    public String f333644p;

    /* renamed from: q */
    public Long f333645q;

    /* renamed from: r */
    public Bitmap f333646r;

    /* renamed from: s */
    public int f333647s;

    /* renamed from: t */
    public int f333648t;

    /* renamed from: u */
    public boolean f333649u;

    /* renamed from: v82.e0$a */
    public static final class C111438a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111437e0 f333650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111438a(C111437e0 e0Var) {
            super(0);
            this.f333650d = e0Var;
        }

        public Object invoke() {
            return (ImageView) this.f333650d.f333629a.findViewById(C0966R.C0970id.f357479a22);
        }
    }

    /* renamed from: v82.e0$b */
    public static final class C111439b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111437e0 f333651d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f333652e;

        /* renamed from: f */
        public final /* synthetic */ int f333653f;

        /* renamed from: g */
        public final /* synthetic */ int f333654g;

        /* renamed from: h */
        public final /* synthetic */ String f333655h;

        /* renamed from: v82.e0$b$a */
        public static final class C111440a implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ C111437e0 f333656d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f333657e;

            /* renamed from: f */
            public final /* synthetic */ int f333658f;

            /* renamed from: g */
            public final /* synthetic */ int f333659g;

            /* renamed from: h */
            public final /* synthetic */ String f333660h;

            public C111440a(C111437e0 e0Var, Bitmap bitmap, int i, int i2, String str) {
                this.f333656d = e0Var;
                this.f333657e = bitmap;
                this.f333658f = i;
                this.f333659g = i2;
                this.f333660h = str;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                ImageView imageView = this.f333656d.f333634f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                TextView textView = this.f333656d.f333630b;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                this.f333656d.f333649u = false;
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                this.f333656d.mo163126d(this.f333657e, this.f333658f, this.f333659g);
                TextView textView = this.f333656d.f333630b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.f333656d.f333630b;
                if (textView2 != null) {
                    textView2.setTextSize(1, 10.0f);
                }
                TextView textView3 = this.f333656d.f333630b;
                if (textView3 != null) {
                    textView3.setText(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f333660h).getNickname());
                }
                C111437e0 e0Var = this.f333656d;
                String str = this.f333660h;
                e0Var.mo163129g(str);
                e0Var.f333644p = str;
                this.f333656d.f333649u = true;
            }
        }

        public C111439b(C111437e0 e0Var, Bitmap bitmap, int i, int i2, String str) {
            this.f333651d = e0Var;
            this.f333652e = bitmap;
            this.f333653f = i;
            this.f333654g = i2;
            this.f333655h = str;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator alpha;
            ImageView imageView = this.f333651d.f333634f;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            C111437e0 e0Var = this.f333651d;
            Bitmap bitmap = e0Var.f333646r;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                Bitmap bitmap2 = e0Var.f333646r;
                C87412m.m108591d(bitmap2);
                int height = bitmap2.getHeight();
                VideoView videoView = e0Var.f333632d;
                C87412m.m108591d(videoView);
                int measuredWidth = videoView.getMeasuredWidth();
                VideoView videoView2 = e0Var.f333632d;
                C87412m.m108591d(videoView2);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, videoView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                C87412m.m108591d(createBitmap);
                Canvas canvas = new Canvas(createBitmap);
                Matrix matrix = new Matrix();
                int i = e0Var.f333647s;
                int i2 = OpenGlRender.f318118B;
                if (i == 12) {
                    matrix.setRotate(270.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
                } else if (i == 4) {
                    matrix.setRotate(90.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
                }
                if (e0Var.f333648t == 16) {
                    matrix.postScale(-1.0f, 1.0f);
                    matrix.postTranslate((float) width, 0.0f);
                }
                matrix.postScale(((float) canvas.getWidth()) / ((float) height), ((float) canvas.getHeight()) / ((float) width));
                Bitmap bitmap3 = e0Var.f333646r;
                C87412m.m108591d(bitmap3);
                canvas.drawBitmap(bitmap3, matrix, e0Var.f333642n);
                ImageView imageView2 = e0Var.f333634f;
                if (imageView2 != null) {
                    imageView2.setImageBitmap(createBitmap);
                }
            }
            ImageView imageView3 = this.f333651d.f333634f;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.f333651d.f333634f;
            if (imageView4 != null) {
                imageView4.clearAnimation();
            }
            ImageView imageView5 = this.f333651d.f333634f;
            if (imageView5 != null && (animate = imageView5.animate()) != null && (duration = animate.setDuration(300)) != null && (alpha = duration.alpha(0.0f)) != null) {
                alpha.setListener(new C111440a(this.f333651d, this.f333652e, this.f333653f, this.f333654g, this.f333655h));
            }
        }
    }

    /* renamed from: v82.e0$c */
    public static final class C111441c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111437e0 f333661d;

        /* renamed from: e */
        public final /* synthetic */ String f333662e;

        public C111441c(C111437e0 e0Var, String str) {
            this.f333661d = e0Var;
            this.f333662e = str;
        }

        public final void run() {
            View view = this.f333661d.f333635g;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView$changeRenderUser$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView$changeRenderUser$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = this.f333661d.f333630b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f333661d.f333630b;
            if (textView2 != null) {
                textView2.setTextSize(1, 10.0f);
            }
            TextView textView3 = this.f333661d.f333630b;
            if (textView3 != null) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f333662e);
                textView3.setText(z1Var != null ? z1Var.getNickname() : null);
            }
            if (!C87412m.m108589b(this.f333661d.f333644p, this.f333662e)) {
                C111437e0 e0Var = this.f333661d;
                String str = this.f333662e;
                e0Var.mo163129g(str);
                e0Var.f333644p = str;
                this.f333661d.f333645q = Long.valueOf(Util.currentTicks());
            }
        }
    }

    /* renamed from: v82.e0$d */
    public static final class C111442d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111437e0 f333663d;

        /* renamed from: e */
        public final /* synthetic */ String f333664e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111442d(C111437e0 e0Var, String str) {
            super(0);
            this.f333663d = e0Var;
            this.f333664e = str;
        }

        public Object invoke() {
            this.f333663d.f333640l = true;
            if (this.f333663d.mo163127e().getVisibility() == 0) {
                ((C119157j) C119157j.f356862d).mo183895z(new C111447f0(this.f333663d, this.f333664e));
            }
            return C13598b0.f38549a;
        }
    }

    public C111437e0(View view) {
        C87412m.m108594g(view, "rootView");
        this.f333629a = view;
        float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 4);
        View findViewById = this.f333629a.findViewById(C0966R.C0970id.h45);
        this.f333636h = findViewById;
        if (findViewById != null) {
            findViewById.setClipToOutline(true);
        }
        View view2 = this.f333636h;
        if (view2 != null) {
            view2.setOutlineProvider(new C71599n0(b));
        }
        this.f333630b = (TextView) this.f333629a.findViewById(C0966R.C0970id.h57);
        this.f333635g = this.f333629a.findViewById(C0966R.C0970id.a2j);
        this.f333631c = this.f333629a.getContext();
        VideoView videoView = (VideoView) this.f333629a.findViewById(C0966R.C0970id.f358799h51);
        this.f333632d = videoView;
        if (videoView != null) {
            videoView.setClipToOutline(true);
        }
        ImageView imageView = (ImageView) this.f333629a.findViewById(C0966R.C0970id.f358798h50);
        this.f333634f = imageView;
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
        Paint paint = new Paint();
        this.f333642n = paint;
        paint.setColor(-16777216);
        Paint paint2 = this.f333642n;
        if (paint2 != null) {
            paint2.setFilterBitmap(false);
        }
        Paint paint3 = this.f333642n;
        if (paint3 != null) {
            paint3.setTextSize(40.0f);
        }
        this.f333637i = this.f333629a.findViewById(C0966R.C0970id.lcz);
        this.f333638j = (ImageView) this.f333629a.findViewById(C0966R.C0970id.h4g);
        this.f333639k = (TextView) this.f333629a.findViewById(C0966R.C0970id.h4h);
    }

    /* renamed from: a */
    public final boolean mo163123a(String str, Bitmap bitmap, int i, int i2) {
        if (C87412m.m108589b(this.f333644p, str) || this.f333646r == null || this.f333632d == null) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C111439b(this, bitmap, i, i2, str));
        return true;
    }

    /* renamed from: b */
    public final void mo163124b(String str) {
        ((C119157j) C119157j.f356862d).mo183895z(new C111441c(this, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0094, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b4, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo163125c(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            monitor-enter(r6)
            java.lang.String r1 = "userName"
            gy3.C87412m.m108594g(r7, r1)     // Catch:{ all -> 0x00b5 }
            boolean r1 = r6.f333641m     // Catch:{ all -> 0x00b5 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002f
            android.widget.ImageView r1 = r6.mo163127e()     // Catch:{ all -> 0x00b5 }
            r1.setVisibility(r3)     // Catch:{ all -> 0x00b5 }
            android.widget.TextView r1 = r6.f333630b     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x001a
            goto L_0x001d
        L_0x001a:
            r1.setVisibility(r3)     // Catch:{ all -> 0x00b5 }
        L_0x001d:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x00b5 }
            ln.f r0 = (p196ln.C76705f) r0     // Catch:{ all -> 0x00b5 }
            android.widget.ImageView r1 = r6.mo163127e()     // Catch:{ all -> 0x00b5 }
            r0.zv0(r1, r7)     // Catch:{ all -> 0x00b5 }
            r6.mo163124b(r7)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r6)
            return r2
        L_0x002f:
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView r1 = r6.f333632d     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x003c
            java.lang.String r7 = "MicroMsg.MultiTalkMiniVideoView"
            java.lang.String r0 = "drawAvatar view is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r6)
            return r3
        L_0x003c:
            boolean r1 = r6.f333649u     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x0049
            java.lang.String r7 = "MicroMsg.MultiTalkMiniVideoView"
            java.lang.String r0 = "renderVideoBitmap img false cause isDoingAnimationChange"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r6)
            return r3
        L_0x0049:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x00b5 }
            ln.f r0 = (p196ln.C76705f) r0     // Catch:{ all -> 0x00b5 }
            vd3.r$b r0 = r0.mo106829VT()     // Catch:{ all -> 0x00b5 }
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView r1 = r6.f333632d     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x005c
            int r1 = r1.getMeasuredWidth()     // Catch:{ all -> 0x00b5 }
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView r4 = r6.f333632d     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x0066
            int r4 = r4.getMeasuredHeight()     // Catch:{ all -> 0x00b5 }
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            android.graphics.Bitmap r0 = r0.ov0(r7, r1, r4, r2)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0083
            int r1 = r0.getHeight()     // Catch:{ all -> 0x00b5 }
            int r4 = r0.getWidth()     // Catch:{ all -> 0x00b5 }
            if (r1 >= r4) goto L_0x0083
            int r1 = r0.getHeight()     // Catch:{ all -> 0x00b5 }
            int r4 = r0.getHeight()     // Catch:{ all -> 0x00b5 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r3, r3, r1, r4)     // Catch:{ all -> 0x00b5 }
        L_0x0083:
            if (r0 == 0) goto L_0x0095
            boolean r1 = r6.mo163123a(r7, r0, r3, r3)     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x0093
            r6.mo163126d(r0, r3, r3)     // Catch:{ all -> 0x00b5 }
            r6.mo163124b(r7)     // Catch:{ all -> 0x00b5 }
            r6.f333640l = r3     // Catch:{ all -> 0x00b5 }
        L_0x0093:
            monitor-exit(r6)
            return r2
        L_0x0095:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00b5 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x00b5 }
            r4 = 2131755464(0x7f1001c8, float:1.9141808E38)
            r5 = 0
            android.graphics.Bitmap r1 = p996kj.C88155a.decodeResource(r1, r4, r5)     // Catch:{ all -> 0x00b5 }
            boolean r0 = r6.mo163123a(r7, r0, r3, r3)     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x00b3
            r6.mo163126d(r1, r3, r3)     // Catch:{ all -> 0x00b5 }
            r6.mo163124b(r7)     // Catch:{ all -> 0x00b5 }
            r6.f333640l = r3     // Catch:{ all -> 0x00b5 }
        L_0x00b3:
            monitor-exit(r6)
            return r2
        L_0x00b5:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111437e0.mo163125c(java.lang.String):boolean");
    }

    /* renamed from: d */
    public final synchronized void mo163126d(Bitmap bitmap, int i, int i2) {
        if (!this.f333641m) {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    VideoView videoView = this.f333632d;
                    if (videoView != null) {
                        Canvas lockCanvas = videoView.lockCanvas((Rect) null);
                        if (lockCanvas == null) {
                            Log.m105920e("MicroMsg.MultiTalkMiniVideoView", "getCanvasError");
                            return;
                        }
                        Matrix matrix = new Matrix();
                        int i3 = OpenGlRender.f318118B;
                        if (i == 12) {
                            matrix.setRotate(270.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
                        } else if (i == 4) {
                            matrix.setRotate(90.0f, ((float) width) / 2.0f, ((float) height) / 2.0f);
                        }
                        if (i2 == 16) {
                            matrix.postScale(-1.0f, 1.0f);
                            matrix.postTranslate((float) width, 0.0f);
                        }
                        matrix.postScale(((float) lockCanvas.getWidth()) / ((float) height), ((float) lockCanvas.getHeight()) / ((float) width));
                        lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        if (!bitmap.isRecycled()) {
                            try {
                                lockCanvas.drawBitmap(bitmap, matrix, this.f333642n);
                                this.f333647s = i;
                                this.f333648t = i2;
                                this.f333646r = bitmap;
                            } catch (Exception unused) {
                                Log.m105920e("MicroMsg.MultiTalkMiniVideoView", "draw bitmap error");
                            }
                        }
                        try {
                            VideoView videoView2 = this.f333632d;
                            if (videoView2 != null) {
                                videoView2.unlockCanvasAndPost(lockCanvas);
                            }
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.MultiTalkMiniVideoView", e, "drawBitmap unlockCanvasAndPost crash", new Object[0]);
                        }
                    } else {
                        return;
                    }
                }
            }
            Log.m105920e("MicroMsg.MultiTalkMiniVideoView", "DrawBitmap, bitmap is null or recycled");
            C115669n.INSTANCE.idkeyStat(220, 27, 1, false);
            return;
        }
        return;
        return;
    }

    /* renamed from: e */
    public final ImageView mo163127e() {
        return (ImageView) ((C36570n) this.f333633e).getValue();
    }

    /* renamed from: f */
    public final void mo163128f(int i) {
        View view = this.f333635g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "hideView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "hideView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public final void mo163129g(String str) {
        if (this.f333641m && !C87412m.m108589b(str, this.f333643o)) {
            String str2 = "";
            if (TextUtils.isEmpty(str)) {
                VideoView videoView = this.f333632d;
                if (videoView != null) {
                    C105783b0 n = C105851w0.zx0().mo150671n();
                    if (n != null) {
                        if (str != null) {
                            str2 = str;
                        }
                        n.mo150730l(videoView, str2);
                    }
                    mo163127e().setVisibility(0);
                    TextView textView = this.f333630b;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    this.f333640l = false;
                }
            } else {
                VideoView videoView2 = this.f333632d;
                if (videoView2 != null) {
                    C105783b0 n2 = C105851w0.zx0().mo150671n();
                    if (n2 != null) {
                        String str3 = this.f333643o;
                        if (str3 == null) {
                            str3 = str2;
                        }
                        n2.mo150730l(videoView2, str3);
                    }
                    C105783b0 n3 = C105851w0.zx0().mo150671n();
                    if (n3 != null) {
                        if (str != null) {
                            str2 = str;
                        }
                        n3.mo150719a(videoView2, str2);
                    }
                    mo163127e().setVisibility(8);
                    TextView textView2 = this.f333630b;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    videoView2.setOnFrame(new C111442d(this, str));
                }
            }
        }
        Long l = null;
        if (str == null) {
            this.f333646r = null;
            this.f333648t = -1;
            this.f333647s = -1;
        } else {
            l = Long.valueOf(Util.currentTicks());
        }
        this.f333645q = l;
        this.f333643o = str;
    }
}
