package com.tencent.p014mm.plugin.multitalk.p078ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105781a1;
import com.tencent.p014mm.plugin.multitalk.model.C105783b0;
import com.tencent.p014mm.plugin.multitalk.model.C105808j;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import kotlin.Metadata;
import lu3.C109426i;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002/0B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\"\u0010(\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00061"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView;", "Lcom/tencent/mm/plugin/multitalk/model/j;", "Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", "getAvatarIv", "", "getUsername", "getNickName", "Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView$a;", "getCurrentSnapShot", "", "h", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "i", "getPosition", "setPosition", "position", "Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView$b;", "p", "Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView$b;", "getStatus", "()Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView$b;", "setStatus", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView$b;)V", "status", "s", "getMId", "setMId", "mId", "w", "Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView$a;", "getElementPrev", "()Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView$a;", "setElementPrev", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView$a;)V", "elementPrev", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView */
public final class MultitalkFrameView extends FrameLayout implements C105808j {

    /* renamed from: d */
    public RelativeLayout f314980d;

    /* renamed from: e */
    public VideoView f314981e;

    /* renamed from: f */
    public TextView f314982f;

    /* renamed from: g */
    public ImageView f314983g;

    /* renamed from: h */
    public int f314984h;

    /* renamed from: i */
    public int f314985i;

    /* renamed from: j */
    public String f314986j = "";

    /* renamed from: n */
    public String f314987n;

    /* renamed from: o */
    public Paint f314988o;

    /* renamed from: p */
    public C105888b f314989p = C105888b.None;

    /* renamed from: q */
    public boolean f314990q;

    /* renamed from: r */
    public int f314991r;

    /* renamed from: s */
    public int f314992s;

    /* renamed from: t */
    public boolean f314993t;

    /* renamed from: u */
    public int f314994u;

    /* renamed from: v */
    public int f314995v;

    /* renamed from: w */
    public C105887a f314996w;

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView$a */
    public static final class C105887a {

        /* renamed from: a */
        public Bitmap f314997a;
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView$b */
    public enum C105888b {
        Avatar,
        Video,
        ScreenCast,
        None
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView$c */
    public static final class C105889c implements C109426i {

        /* renamed from: d */
        public final /* synthetic */ MultitalkFrameView f315003d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f315004e;

        /* renamed from: f */
        public final /* synthetic */ int f315005f;

        /* renamed from: g */
        public final /* synthetic */ int f315006g;

        public C105889c(MultitalkFrameView multitalkFrameView, Bitmap bitmap, int i, int i2) {
            this.f315003d = multitalkFrameView;
            this.f315004e = bitmap;
            this.f315005f = i;
            this.f315006g = i2;
        }

        public String getKey() {
            return "drawBitmap";
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            ImageView imageView = this.f315003d.f314983g;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            VideoView videoView = this.f315003d.f314981e;
            if (videoView != null) {
                videoView.setVisibility(0);
            }
            MultitalkFrameView multitalkFrameView = this.f315003d;
            Bitmap bitmap = this.f315004e;
            int i = this.f315005f;
            int i2 = this.f315006g;
            synchronized (multitalkFrameView) {
                if (bitmap != null) {
                    if (!bitmap.isRecycled()) {
                        VideoView videoView2 = multitalkFrameView.f314981e;
                        if (videoView2 != null) {
                            Canvas lockCanvas = videoView2.lockCanvas((Rect) null);
                            if (lockCanvas == null) {
                                Log.m105920e("MicroMsg.MultitalkFrameView", "getCanvasError");
                                return;
                            }
                            Matrix i3 = multitalkFrameView.mo150934i(lockCanvas.getWidth(), lockCanvas.getHeight(), bitmap.getWidth(), bitmap.getHeight(), i, i2);
                            multitalkFrameView.f314994u = bitmap.getWidth();
                            multitalkFrameView.f314995v = bitmap.getHeight();
                            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            lockCanvas.drawColor(Color.parseColor("#232323"));
                            if (!bitmap.isRecycled()) {
                                try {
                                    lockCanvas.drawBitmap(bitmap, i3, multitalkFrameView.f314988o);
                                } catch (Exception unused) {
                                    Log.m105920e("MicroMsg.MultitalkFrameView", "draw bitmap error");
                                }
                            }
                            try {
                                VideoView videoView3 = multitalkFrameView.f314981e;
                                if (videoView3 != null) {
                                    videoView3.unlockCanvasAndPost(lockCanvas);
                                }
                                multitalkFrameView.f314991r++;
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.MultitalkFrameView", e, "drawBitmap unlockCanvasAndPost crash", new Object[0]);
                            }
                        } else {
                            return;
                        }
                    }
                }
                Log.m105920e("MicroMsg.MultitalkFrameView", "DrawBitmap, bitmap is null or recycled");
                C115669n.INSTANCE.idkeyStat(220, 27, 1, false);
                return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultitalkFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attr");
        this.f314990q = BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger();
        this.f314992s = -1;
        this.f314993t = C105851w0.zx0().mo150680v();
        this.f314994u = getMeasuredWidth();
        this.f314995v = getMeasuredHeight();
        Log.printInfoStack("MicroMsg.MultitalkFrameView", "MultitalkFrameView init " + hashCode(), new Object[0]);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.bhe, this);
        this.f314980d = (RelativeLayout) getRootView().findViewById(C0966R.C0970id.h48);
        this.f314981e = (VideoView) getRootView().findViewById(C0966R.C0970id.eew);
        this.f314983g = (ImageView) getRootView().findViewById(C0966R.C0970id.eeq);
        this.f314982f = (TextView) getRootView().findViewById(C0966R.C0970id.bzj);
        Paint paint = new Paint();
        this.f314988o = paint;
        paint.setColor(-16777216);
        Paint paint2 = this.f314988o;
        if (paint2 != null) {
            paint2.setFilterBitmap(false);
        }
        Paint paint3 = this.f314988o;
        if (paint3 != null) {
            paint3.setTextSize(40.0f);
        }
        this.f314996w = new C105887a();
    }

    /* renamed from: a */
    public void mo150771a(String str, Bitmap bitmap, int i, int i2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(bitmap, "bm");
        ((C119157j) C119157j.f356862d).mo183895z(new C105889c(this, bitmap, i, i2));
    }

    /* renamed from: b */
    public void mo150772b() {
        if (this.f314989p == C105888b.Avatar) {
            ImageView imageView = this.f314983g;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            VideoView videoView = this.f314981e;
            if (videoView != null) {
                videoView.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo150921c() {
        C105783b0 n;
        if (!Util.isNullOrNil(getUsername())) {
            Log.printInfoStack("MicroMsg.MultitalkFrameView", "changeToAvatar %s from %s", getUsername(), this.f314989p.name());
            this.f314989p = C105888b.Avatar;
            mo150936k();
            VideoView videoView = this.f314981e;
            if (videoView != null && (n = C105851w0.zx0().mo150671n()) != null) {
                n.mo150730l(videoView, this.f314986j);
            }
        }
    }

    /* renamed from: d */
    public final void mo150922d() {
        C105783b0 n;
        Log.m105925i("MicroMsg.MultitalkFrameView", "changeToNone %s from %s", getUsername(), this.f314989p.name());
        VideoView videoView = this.f314981e;
        if (!(videoView == null || (n = C105851w0.zx0().mo150671n()) == null)) {
            n.mo150730l(videoView, this.f314986j);
        }
        this.f314989p = C105888b.None;
        mo150925g("", -1);
    }

    /* renamed from: e */
    public final void mo150923e() {
        C105783b0 n;
        this.f314989p = C105888b.ScreenCast;
        this.f314996w.f314997a = null;
        VideoView videoView = this.f314981e;
        if (!(videoView == null || (n = C105851w0.zx0().mo150671n()) == null)) {
            n.mo150719a(videoView, this.f314986j);
        }
        ImageView imageView = this.f314983g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        VideoView videoView2 = this.f314981e;
        if (videoView2 != null) {
            videoView2.setVisibility(0);
        }
    }

    /* renamed from: f */
    public final void mo150924f() {
        C105783b0 n;
        Log.printInfoStack("MicroMsg.MultitalkFrameView", "changeToVideo %s from %s", getUsername(), this.f314989p.name());
        this.f314989p = C105888b.Video;
        mo150933h(this.f314996w);
        VideoView videoView = this.f314981e;
        if (!(videoView == null || (n = C105851w0.zx0().mo150671n()) == null)) {
            n.mo150719a(videoView, this.f314986j);
        }
        ImageView imageView = this.f314983g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        VideoView videoView2 = this.f314981e;
        if (videoView2 != null) {
            videoView2.setVisibility(0);
        }
    }

    /* renamed from: g */
    public final void mo150925g(String str, int i) {
        C87412m.m108594g(str, "username");
        Log.m105925i("MicroMsg.MultitalkFrameView", "changeUser from %s to %s", this.f314986j, str);
        this.f314986j = str;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null) {
            this.f314987n = z1Var.mo62909j3();
        } else {
            this.f314987n = str;
        }
        this.f314992s = i;
        RelativeLayout relativeLayout = this.f314980d;
        if (relativeLayout != null) {
            relativeLayout.setTag(C0966R.C0970id.kea, this.f314987n);
        }
    }

    public ImageView getAvatarIv() {
        return this.f314983g;
    }

    public final C105887a getCurrentSnapShot() {
        return this.f314996w;
    }

    public final C105887a getElementPrev() {
        return this.f314996w;
    }

    public final int getIndex() {
        return this.f314984h;
    }

    public final int getMId() {
        return this.f314992s;
    }

    public final String getNickName() {
        return this.f314987n;
    }

    public final int getPosition() {
        return this.f314985i;
    }

    public final C105888b getStatus() {
        return this.f314989p;
    }

    public String getUsername() {
        return this.f314986j;
    }

    /* renamed from: h */
    public final void mo150933h(C105887a aVar) {
        if ((aVar != null ? aVar.f314997a : null) != null) {
            Bitmap bitmap = aVar.f314997a;
            C87412m.m108591d(bitmap);
            if (!bitmap.isRecycled()) {
                String str = this.f314986j;
                if (str == null) {
                    str = "";
                }
                Bitmap bitmap2 = aVar.f314997a;
                C87412m.m108591d(bitmap2);
                mo150771a(str, bitmap2, 0, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix mo150934i(int r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r5 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = com.tencent.p014mm.plugin.voip.video.OpenGlRender.f318118B
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 12
            if (r10 == r2) goto L_0x002f
            r2 = 270(0x10e, float:3.78E-43)
            if (r10 != r2) goto L_0x0012
            goto L_0x002f
        L_0x0012:
            r2 = 4
            if (r10 == r2) goto L_0x0019
            r2 = 90
            if (r10 != r2) goto L_0x0047
        L_0x0019:
            int r10 = -r8
            float r10 = (float) r10
            float r10 = r10 / r1
            int r2 = -r9
            float r2 = (float) r2
            float r2 = r2 / r1
            r0.postTranslate(r10, r2)
            r10 = 1119092736(0x42b40000, float:90.0)
            r0.postRotate(r10)
            float r10 = (float) r9
            float r10 = r10 / r1
            float r2 = (float) r8
            float r2 = r2 / r1
            r0.postTranslate(r10, r2)
            goto L_0x0044
        L_0x002f:
            int r10 = -r8
            float r10 = (float) r10
            float r10 = r10 / r1
            int r2 = -r9
            float r2 = (float) r2
            float r2 = r2 / r1
            r0.postTranslate(r10, r2)
            r10 = 1132920832(0x43870000, float:270.0)
            r0.postRotate(r10)
            float r10 = (float) r9
            float r10 = r10 / r1
            float r2 = (float) r8
            float r2 = r2 / r1
            r0.postTranslate(r10, r2)
        L_0x0044:
            r4 = r9
            r9 = r8
            r8 = r4
        L_0x0047:
            r10 = 16
            r2 = 0
            if (r11 != r10) goto L_0x0057
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r10, r11)
            float r10 = (float) r8
            r0.postTranslate(r10, r2)
        L_0x0057:
            float r7 = (float) r7
            float r6 = (float) r6
            float r10 = r7 / r6
            float r9 = (float) r9
            float r8 = (float) r8
            float r11 = r9 / r8
            int r3 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            float r7 = r7 / r9
            r0.postScale(r7, r7)
            float r7 = r7 * r8
            float r6 = r6 - r7
            float r6 = r6 / r1
            r0.postTranslate(r6, r2)
            goto L_0x0084
        L_0x006f:
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x007f
            float r6 = r6 / r8
            r0.postScale(r6, r6)
            float r6 = r6 * r9
            float r7 = r7 - r6
            float r7 = r7 / r1
            r0.postTranslate(r2, r7)
            goto L_0x0084
        L_0x007f:
            float r6 = r6 / r8
            float r7 = r7 / r9
            r0.postScale(r6, r7)
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultitalkFrameView.mo150934i(int, int, int, int, int, int):android.graphics.Matrix");
    }

    /* renamed from: j */
    public final boolean mo150935j() {
        return this.f314989p == C105888b.ScreenCast;
    }

    /* renamed from: k */
    public final void mo150936k() {
        if (this.f314989p == C105888b.Avatar) {
            C105851w0.zx0().mo150676q().getClass();
            ImageView avatarIv = getAvatarIv();
            if (avatarIv != null) {
                ((C119157j) C119157j.f356862d).mo183895z(new C105781a1(avatarIv, this));
            }
        }
    }

    public final void setElementPrev(C105887a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f314996w = aVar;
    }

    public final void setIndex(int i) {
        this.f314984h = i;
    }

    public final void setMId(int i) {
        this.f314992s = i;
    }

    public final void setPosition(int i) {
        this.f314985i = i;
    }

    public final void setStatus(C105888b bVar) {
        C87412m.m108594g(bVar, "<set-?>");
        this.f314989p = bVar;
    }
}
