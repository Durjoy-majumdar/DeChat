package ki1;

import al1.C54130j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import bl3.C39818r;
import c60.C54667b;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.trtc.TRTCVideoRatioLayout;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import nh1.C61748r;
import ok1.C62042e;
import p192l4.C10462b;
import p996kj.C88155a;
import ph1.C62295l;
import pl1.C11978e0;
import pl1.C11985o;
import pl1.C11990s0;
import qj1.C62660c;
import rx3.C13598b0;
import tf0.C64916p1;
import up1.C27696y;
import zt3.C119157j;

/* renamed from: ki1.d */
public final class C61100d extends RelativeLayout {

    /* renamed from: d */
    public final int f173969d;

    /* renamed from: e */
    public final C62660c f173970e;

    /* renamed from: f */
    public final LivePreviewView f173971f;

    /* renamed from: g */
    public final C61748r f173972g;

    /* renamed from: h */
    public C54130j f173973h;

    /* renamed from: i */
    public SurfaceTexture f173974i;

    /* renamed from: j */
    public TextureView.SurfaceTextureListener f173975j;

    /* renamed from: n */
    public ImageView f173976n;

    /* renamed from: o */
    public boolean f173977o;

    /* renamed from: ki1.d$a */
    public static final class C61101a implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C61100d f173978d;

        public C61101a(C61100d dVar) {
            this.f173978d = dVar;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f173978d.f173975j;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f173978d.f173975j;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f173978d.f173975j;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }

    /* renamed from: ki1.d$b */
    public static final class C61102b extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f173979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61102b(ImageView imageView) {
            super(1);
            this.f173979d = imageView;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f173979d.setImageDrawable(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61100d(Context context, int i, C62660c cVar, LivePreviewView livePreviewView) {
        super(context);
        C62660c cVar2 = cVar;
        LivePreviewView livePreviewView2 = livePreviewView;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar2, "basePlugin");
        C87412m.m108594g(livePreviewView2, "previewView");
        this.f173969d = i;
        this.f173970e = cVar2;
        this.f173971f = livePreviewView2;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.cyo, this, false);
        RoundCornerConstraintLayout roundCornerConstraintLayout = (RoundCornerConstraintLayout) inflate;
        int i2 = C0966R.C0970id.n__;
        Guideline guideline = (Guideline) C10462b.m10395a(inflate, C0966R.C0970id.n__);
        if (guideline != null) {
            i2 = C0966R.C0970id.f358620na0;
            ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.f358620na0);
            if (imageView != null) {
                i2 = C0966R.C0970id.g3t;
                ProgressBar progressBar = (ProgressBar) C10462b.m10395a(inflate, C0966R.C0970id.g3t);
                if (progressBar != null) {
                    i2 = C0966R.C0970id.nb4;
                    ImageView imageView2 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.nb4);
                    if (imageView2 != null) {
                        i2 = C0966R.C0970id.nb6;
                        ImageView imageView3 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.nb6);
                        if (imageView3 != null) {
                            i2 = C0966R.C0970id.nb7;
                            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.nb7);
                            if (textView != null) {
                                i2 = C0966R.C0970id.nb9;
                                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.nb9);
                                if (textView2 != null) {
                                    i2 = C0966R.C0970id.nba;
                                    TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.nba);
                                    if (textView3 != null) {
                                        i2 = C0966R.C0970id.nbb;
                                        TextureView textureView = (TextureView) C10462b.m10395a(inflate, C0966R.C0970id.nbb);
                                        if (textureView != null) {
                                            i2 = C0966R.C0970id.nbc;
                                            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.nbc);
                                            if (frameLayout != null) {
                                                i2 = C0966R.C0970id.nca;
                                                View a = C10462b.m10395a(inflate, C0966R.C0970id.nca);
                                                if (a != null) {
                                                    i2 = C0966R.C0970id.ncc;
                                                    View a2 = C10462b.m10395a(inflate, C0966R.C0970id.ncc);
                                                    if (a2 != null) {
                                                        TextureView textureView2 = textureView;
                                                        this.f173972g = new C61748r(roundCornerConstraintLayout, roundCornerConstraintLayout, guideline, imageView, progressBar, imageView2, imageView3, textView, textView2, textView3, textureView2, frameLayout, a, a2);
                                                        C61101a aVar = new C61101a(this);
                                                        addView(roundCornerConstraintLayout);
                                                        TextureView textureView3 = textureView2;
                                                        textureView3.setOpaque(false);
                                                        textureView3.setSurfaceTextureListener(aVar);
                                                        imageView.setVisibility(8);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    /* renamed from: a */
    public final void mo86031a(ViewGroup viewGroup, Bitmap bitmap) {
        ImageView imageView = this.f173976n;
        if (imageView != null) {
            viewGroup.removeView(imageView);
        }
        ImageView imageView2 = this.f173976n;
        if (imageView2 == null) {
            imageView2 = new ImageView(MMApplicationContext.getContext());
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setTag("video_thumb_image");
        }
        this.f173976n = imageView2;
        imageView2.setImageBitmap(bitmap);
        viewGroup.addView(this.f173976n, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: b */
    public final void mo86032b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("FinderLiveMicPreviewWidget_");
        sb.append(this.f173969d);
        sb.append('_');
        C54130j jVar = this.f173973h;
        sb.append(jVar != null ? jVar.f151997a : null);
        Log.m105924i(sb.toString(), str);
    }

    /* renamed from: c */
    public final void mo86033c(C54130j jVar, ImageView imageView) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (this.f173972g.f175523b.getVisibility() == 0) {
            mo86032b("showBlurImage same");
            return;
        }
        int i = 0;
        this.f173972g.f175523b.setVisibility(0);
        String str = jVar.f151998b;
        if (str == null || str.length() == 0) {
            Bitmap decodeResource = C88155a.decodeResource(getContext().getResources(), C0966R.raw.default_avatar, (BitmapFactory.Options) null);
            int color = getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_4);
            float f = 0.0f;
            C61102b bVar = new C61102b(imageView);
            if (!true || !true) {
                i = color;
            }
            if (true && true) {
                f = 20.0f;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C54667b(decodeResource, bVar, f, i));
            return;
        }
        ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11873j2().mo85957c(new C11985o(jVar.f151998b, C27696y.THUMB_IMAGE), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
    }

    /* renamed from: d */
    public final void mo86034d() {
        C54130j jVar = this.f173973h;
        if (jVar != null) {
            this.f173972g.f175523b.setVisibility(0);
            this.f173972g.f175524c.setVisibility(0);
            ImageView imageView = this.f173972g.f175523b;
            C87412m.m108593f(imageView, "viewBinding.loadingBgView");
            mo86033c(jVar, imageView);
        }
    }

    /* renamed from: e */
    public final void mo86035e() {
        C54130j jVar = this.f173973h;
        if (jVar != null) {
            this.f173972g.f175529h.setVisibility(0);
            if (this.f173969d == 3) {
                this.f173972g.f175529h.setText(getContext().getResources().getString(C0966R.string.dg_));
            } else {
                TextView textView = this.f173972g.f175529h;
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                TextView textView2 = this.f173972g.f175527f;
                C87412m.m108593f(textView2, "viewBinding.micNickName");
                textView.setText(C64916p1.C64917a.m76442i((C64916p1) c, textView2, C62042e.m72808l0(C62042e.f176370a, jVar.f151999c, jVar.f152000d, false, 4, (Object) null), 0, 4, (Object) null));
            }
        }
        SurfaceTexture surfaceTexture = this.f173974i;
        if (surfaceTexture != null) {
            mo86032b("showVideoView same restart setSurfaceTexture return");
            if (!C87412m.m108589b(this.f173972g.f175530i.getSurfaceTexture(), surfaceTexture)) {
                this.f173972g.f175530i.setSurfaceTexture(surfaceTexture);
                return;
            }
            return;
        }
        mo86032b("showVideoView");
        C54130j jVar2 = this.f173973h;
        if (jVar2 == null) {
            return;
        }
        if (C87412m.m108589b(jVar2.f151997a, ((C55001u) this.f173970e.mo87696x0(C55001u.class)).f154419p.f182319n)) {
            TextureView cameraView = this.f173971f.getCameraView();
            if (cameraView != null) {
                this.f173975j = cameraView.getSurfaceTextureListener();
                SurfaceTexture surfaceTexture2 = cameraView.getSurfaceTexture();
                if (surfaceTexture2 != null) {
                    mo86032b("showVideoView setSurfaceTexture: " + surfaceTexture2 + " userId: " + jVar2.f151997a);
                    cameraView.setSurfaceTextureListener(new C62295l.C62296a("FinderLiveMicPreviewWidget_Ori", false));
                    this.f173974i = surfaceTexture2;
                    Bitmap bitmap = cameraView.getBitmap();
                    this.f173972g.f175530i.setSurfaceTexture(surfaceTexture2);
                    ViewParent parent = cameraView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(cameraView);
                        viewGroup.addView(cameraView);
                        mo86031a(viewGroup, bitmap);
                    }
                    C61748r rVar = this.f173972g;
                    rVar.f175531j.removeView(rVar.f175530i);
                    C61748r rVar2 = this.f173972g;
                    rVar2.f175531j.addView(rVar2.f175530i);
                    this.f173972g.f175530i.getViewTreeObserver().addOnPreDrawListener(new C61099c(this, surfaceTexture2));
                    return;
                }
                return;
            }
            return;
        }
        LivePreviewView livePreviewView = this.f173971f;
        String str = jVar2.f151997a;
        TRTCVideoRatioLayout tRTCVideoRatioLayout = livePreviewView.f157153e;
        if (str == null) {
            str = "";
        }
        TXCloudVideoView videoView = tRTCVideoRatioLayout.mo76403d(str, 0).getVideoView();
        if (videoView != null && videoView.getVideoView() != null) {
            this.f173975j = videoView.getVideoView().getSurfaceTextureListener();
            TextureView videoView2 = videoView.getVideoView();
            Bitmap bitmap2 = videoView2.getBitmap();
            SurfaceTexture surfaceTexture3 = videoView2.getSurfaceTexture();
            if (surfaceTexture3 != null) {
                mo86032b("showVideoView setSurfaceTexture: " + surfaceTexture3 + " userId: " + jVar2.f151997a);
                videoView2.setSurfaceTextureListener(new C62295l.C62296a("FinderLiveMicPreviewWidget_Ori", false));
                this.f173974i = surfaceTexture3;
                this.f173972g.f175530i.setSurfaceTexture(surfaceTexture3);
                videoView.removeVideoView();
                videoView.addVideoView(videoView2);
                mo86031a(videoView, bitmap2);
            }
            C61748r rVar3 = this.f173972g;
            rVar3.f175531j.removeView(rVar3.f175530i);
            C61748r rVar4 = this.f173972g;
            rVar4.f175531j.addView(rVar4.f175530i);
        }
    }

    public final C62660c getBasePlugin() {
        return this.f173970e;
    }

    public final int getMicType() {
        return this.f173969d;
    }

    public final LivePreviewView getPreviewView() {
        return this.f173971f;
    }

    public final void setCorner(int i) {
        this.f173972g.f175522a.setRadius((float) i);
    }
}
