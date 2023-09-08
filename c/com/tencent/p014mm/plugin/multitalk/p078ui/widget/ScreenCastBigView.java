package com.tencent.p014mm.plugin.multitalk.p078ui.widget;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105783b0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/ScreenCastBigView;", "Landroid/widget/FrameLayout;", "", "visibility", "Lrx3/b0;", "setVisibility", "Landroid/view/LayoutInflater;", "getLayoutInflater", "Lcom/tencent/mm/plugin/multitalk/mt_render/mt_render_impl/render/VideoView;", "kotlin.jvm.PlatformType", "d", "Lrx3/g;", "getVideoView", "()Lcom/tencent/mm/plugin/multitalk/mt_render/mt_render_impl/render/VideoView;", "videoView", "Landroid/widget/ImageView;", "f", "getMaskView", "()Landroid/widget/ImageView;", "maskView", "", "g", "Ljava/lang/String;", "getCurrentUsername", "()Ljava/lang/String;", "setCurrentUsername", "(Ljava/lang/String;)V", "currentUsername", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView */
public final class ScreenCastBigView extends FrameLayout {

    /* renamed from: j */
    public static final /* synthetic */ int f315007j = 0;

    /* renamed from: d */
    public final C13601g f315008d = C36568h.m40985a(new C105894e(this));

    /* renamed from: e */
    public int f315009e;

    /* renamed from: f */
    public final C13601g f315010f = C36568h.m40985a(new C105891b(this));

    /* renamed from: g */
    public String f315011g;

    /* renamed from: h */
    public View f315012h;

    /* renamed from: i */
    public boolean f315013i;

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView$a */
    public static final class C105890a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastBigView f315014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105890a(ScreenCastBigView screenCastBigView) {
            super(0);
            this.f315014d = screenCastBigView;
        }

        public Object invoke() {
            View view = this.f315014d.f315012h;
            ImageView imageView = view != null ? (ImageView) view.findViewById(C0966R.C0970id.f358794h43) : null;
            if ((imageView != null ? imageView.getBackground() : null) instanceof AnimationDrawable) {
                Drawable background = imageView.getBackground();
                C87412m.m108592e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((AnimationDrawable) background).stop();
            }
            ScreenCastBigView screenCastBigView = this.f315014d;
            screenCastBigView.removeView(screenCastBigView.f315012h);
            this.f315014d.getMaskView().setVisibility(8);
            ScreenCastBigView screenCastBigView2 = this.f315014d;
            screenCastBigView2.f315012h = null;
            screenCastBigView2.f315009e = 0;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView$b */
    public static final class C105891b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastBigView f315015d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105891b(ScreenCastBigView screenCastBigView) {
            super(0);
            this.f315015d = screenCastBigView;
        }

        public Object invoke() {
            return (ImageView) this.f315015d.findViewById(C0966R.C0970id.bat);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView$c */
    public static final class C105892c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastBigView f315016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105892c(ScreenCastBigView screenCastBigView) {
            super(0);
            this.f315016d = screenCastBigView;
        }

        public Object invoke() {
            ScreenCastBigView screenCastBigView = this.f315016d;
            if (screenCastBigView.f315009e == 1) {
                screenCastBigView.mo150944d();
            }
            this.f315016d.getVideoView().setOnFrame(C4893c.f19997d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView$d */
    public static final class C105893d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastBigView f315017d;

        /* renamed from: e */
        public final /* synthetic */ View f315018e;

        /* renamed from: f */
        public final /* synthetic */ boolean f315019f;

        /* renamed from: g */
        public final /* synthetic */ ImageView f315020g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105893d(ScreenCastBigView screenCastBigView, View view, boolean z, ImageView imageView) {
            super(0);
            this.f315017d = screenCastBigView;
            this.f315018e = view;
            this.f315019f = z;
            this.f315020g = imageView;
        }

        public Object invoke() {
            this.f315017d.getMaskView().setVisibility(0);
            ScreenCastBigView screenCastBigView = this.f315017d;
            View view = this.f315018e;
            screenCastBigView.f315012h = view;
            screenCastBigView.f315009e = this.f315019f ? 2 : 1;
            screenCastBigView.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
            if (this.f315020g.getBackground() instanceof AnimationDrawable) {
                Drawable background = this.f315020g.getBackground();
                C87412m.m108592e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((AnimationDrawable) background).start();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView$e */
    public static final class C105894e extends C87413o implements C32224a<VideoView> {

        /* renamed from: d */
        public final /* synthetic */ ScreenCastBigView f315021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105894e(ScreenCastBigView screenCastBigView) {
            super(0);
            this.f315021d = screenCastBigView;
        }

        public Object invoke() {
            VideoView videoView = (VideoView) this.f315021d.findViewById(C0966R.C0970id.bdv);
            videoView.setOnOriChange(new C105914d(this.f315021d));
            return videoView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenCastBigView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.cp6, this, true);
        this.f315011g = "";
        this.f315013i = true;
    }

    /* access modifiers changed from: private */
    public final ImageView getMaskView() {
        return (ImageView) ((C36570n) this.f315010f).getValue();
    }

    /* access modifiers changed from: private */
    public final VideoView getVideoView() {
        return (VideoView) ((C36570n) this.f315008d).getValue();
    }

    /* renamed from: c */
    public final void mo150943c(String str) {
        C87412m.m108594g(str, "username");
        Log.m105924i("MicroMsg.MT.ScreenCastBigView", "bindUser: " + this.f315011g + " to " + str);
        C105783b0 n = C105851w0.zx0().mo150671n();
        if (n != null) {
            VideoView videoView = getVideoView();
            C87412m.m108593f(videoView, "videoView");
            n.mo150719a(videoView, str);
        }
        this.f315011g = str;
        getMaskView().setVisibility(8);
    }

    /* renamed from: d */
    public final void mo150944d() {
        if (this.f315012h != null) {
            Log.m105924i("MicroMsg.MT.ScreenCastBigView", "dismissCenterInfo: " + this.f315009e);
            C61926c.m72668M(new C105890a(this));
        }
    }

    /* renamed from: e */
    public final void mo150945e(boolean z) {
        Log.m105924i("MicroMsg.MT.ScreenCastBigView", "showCenterLoading: " + z);
        View view = this.f315012h;
        if (view != null) {
            removeView(view);
            this.f315012h = null;
        }
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.bhb, this, false);
        C87412m.m108593f(inflate, "getLayoutInflater().infl…          false\n        )");
        View findViewById = inflate.findViewById(C0966R.C0970id.f358794h43);
        C87412m.m108593f(findViewById, "center.findViewById(R.id…ltitalk_center_info_anim)");
        ImageView imageView = (ImageView) findViewById;
        if (!z) {
            ((TextView) inflate.findViewById(C0966R.C0970id.h44)).setVisibility(8);
            getVideoView().setOnFrame(new C105892c(this));
        }
        C61926c.m72668M(new C105893d(this, inflate, z, imageView));
    }

    /* renamed from: f */
    public final void mo150946f() {
        Log.m105924i("MicroMsg.MT.ScreenCastBigView", "unbindUser: " + this.f315011g);
        C105783b0 n = C105851w0.zx0().mo150671n();
        if (n != null) {
            VideoView videoView = getVideoView();
            C87412m.m108593f(videoView, "videoView");
            n.mo150730l(videoView, this.f315011g);
        }
    }

    public final String getCurrentUsername() {
        return this.f315011g;
    }

    public final LayoutInflater getLayoutInflater() {
        Object systemService = getContext().getSystemService("layout_inflater");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return (LayoutInflater) systemService;
    }

    public final void setCurrentUsername(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f315011g = str;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo150945e(false);
        } else {
            mo150944d();
        }
    }
}
