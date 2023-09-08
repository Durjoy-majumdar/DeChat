package hi1;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qj1.C62660c;

/* renamed from: hi1.b */
public final class C59909b {

    /* renamed from: a */
    public final C62660c f170997a;

    /* renamed from: b */
    public final TextureView f170998b;

    /* renamed from: c */
    public final View f170999c;

    /* renamed from: d */
    public final View f171000d;

    /* renamed from: e */
    public final ViewGroup f171001e;

    /* renamed from: f */
    public TextureView.SurfaceTextureListener f171002f;

    /* renamed from: g */
    public SurfaceTexture f171003g;

    /* renamed from: h */
    public ImageView f171004h;

    /* renamed from: i */
    public final C59910a f171005i = new C59910a(this);

    /* renamed from: hi1.b$a */
    public static final class C59910a implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C59909b f171006d;

        public C59910a(C59909b bVar) {
            this.f171006d = bVar;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f171006d.f171002f;
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
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f171006d.f171002f;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f171006d.f171002f;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }

    public C59909b(ViewGroup viewGroup, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(cVar, "basePlugin");
        this.f170997a = cVar;
        this.f170998b = (TextureView) viewGroup.findViewById(C0966R.C0970id.iit);
        this.f170999c = viewGroup.findViewById(C0966R.C0970id.opg);
        this.f171000d = viewGroup.findViewById(C0966R.C0970id.g3t);
        this.f171001e = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.i8z);
        mo84835a();
    }

    /* renamed from: a */
    public final void mo84835a() {
        View view = this.f170999c;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f171000d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f170998b.setSurfaceTextureListener(this.f171005i);
    }
}
