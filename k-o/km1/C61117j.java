package km1;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import rx3.C13598b0;
import vc1.C37715b;

/* renamed from: km1.j */
public final class C61117j {

    /* renamed from: a */
    public final Context f173991a;

    /* renamed from: b */
    public final RecyclerView f173992b;

    /* renamed from: c */
    public View f173993c;

    /* renamed from: d */
    public int[] f173994d = new int[2];

    /* renamed from: e */
    public AnimatorSet f173995e;

    /* renamed from: f */
    public TextureView f173996f;

    /* renamed from: g */
    public RoundedCornerFrameLayout f173997g;

    /* renamed from: h */
    public RelativeLayout f173998h;

    /* renamed from: i */
    public ValueAnimator f173999i;

    /* renamed from: j */
    public int f174000j;

    /* renamed from: k */
    public float f174001k;

    /* renamed from: l */
    public long f174002l;

    /* renamed from: m */
    public long f174003m;

    /* renamed from: n */
    public long f174004n;

    /* renamed from: o */
    public TextureView.SurfaceTextureListener f174005o;

    /* renamed from: p */
    public MMHandler f174006p;

    /* renamed from: q */
    public Runnable f174007q;

    /* renamed from: r */
    public boolean f174008r;

    /* renamed from: s */
    public boolean f174009s;

    public C61117j(Context context, RecyclerView recyclerView) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173991a = context;
        this.f173992b = recyclerView;
        this.f174000j = context.getResources().getColor(C0966R.color.ahe);
        this.f174001k = 1.15f;
        this.f174002l = 300;
        this.f174003m = 1000;
        this.f174006p = new MMHandler(Looper.getMainLooper());
        this.f174008r = C37715b.f99914a.mo61298a();
    }

    /* renamed from: a */
    public static final void m71671a(C61117j jVar) {
        if (jVar.f174009s) {
            Log.m105924i("FinderLiveCardPreViewAnimationHelper", "stop return for hasStop:" + jVar.f174009s);
            return;
        }
        Log.m105924i("FinderLiveCardPreViewAnimationHelper", "stop hasStop:" + jVar.f174009s);
        Runnable runnable = jVar.f174007q;
        C13598b0 b0Var = null;
        if (runnable != null) {
            jVar.f174006p.removeCallbacks(runnable);
            jVar.f174007q = null;
        }
        AnimatorSet animatorSet = jVar.f173995e;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        View view = jVar.f173993c;
        C87412m.m108591d(view);
        View rootView = view.getRootView();
        View findViewWithTag = rootView.findViewWithTag("FinderLiveCardPreViewAnimationHelper");
        if (findViewWithTag != null) {
            findViewWithTag.setOnTouchListener((View.OnTouchListener) null);
        }
        Log.m105924i("FinderLiveCardPreViewAnimationHelper", "detachFloatView view:" + findViewWithTag);
        TextureView textureView = jVar.f173996f;
        C87412m.m108591d(textureView);
        Log.m105924i("FinderLiveCardPreViewAnimationHelper", "detachMaskView videoView:" + textureView + " surfaceTexture:" + textureView.getSurfaceTexture());
        View view2 = jVar.f173993c;
        C87412m.m108591d(view2);
        textureView.setSurfaceTextureListener(new C10359h());
        NearbyLivePreviewView nearbyLivePreviewView = (NearbyLivePreviewView) view2.findViewWithTag("nearby-live-preview-view-tag");
        if (nearbyLivePreviewView != null) {
            ViewParent parent = nearbyLivePreviewView.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(nearbyLivePreviewView);
            if (textureView.getSurfaceTexture() != null && !C87412m.m108589b(nearbyLivePreviewView.getRenderView().getVideoView().getSurfaceTexture(), textureView.getSurfaceTexture())) {
                TextureView videoView = nearbyLivePreviewView.getRenderView().getVideoView();
                SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                C87412m.m108591d(surfaceTexture);
                videoView.setSurfaceTexture(surfaceTexture);
            }
            viewGroup.addView(nearbyLivePreviewView);
            nearbyLivePreviewView.getRenderView().getVideoView().setSurfaceTextureListener(jVar.f174005o);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105928w("FinderLiveCardPreViewAnimationHelper", "liveView is null.");
        }
        TextureView textureView2 = jVar.f173996f;
        C87412m.m108591d(textureView2);
        ViewParent parent2 = textureView2.getParent();
        C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) parent2;
        TextureView textureView3 = jVar.f173996f;
        C87412m.m108591d(textureView3);
        viewGroup2.removeView(textureView3);
        TextureView textureView4 = jVar.f173996f;
        C87412m.m108591d(textureView4);
        viewGroup2.addView(textureView4);
        ((ViewGroup) rootView).removeView(findViewWithTag);
        jVar.f174009s = true;
    }
}
