package hy0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoTextureView;
import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import cy0.C45224b;
import gy3.C87412m;
import java.util.LinkedList;
import kn0.C21365k;
import te3.C51645v5;
import te3.C52069y5;
import zt3.C119157j;

/* renamed from: hy0.j */
public final class C21025j implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final /* synthetic */ MPExoVideoWrapper f59495d;

    /* renamed from: hy0.j$a */
    public static final class C21026a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPExoVideoWrapper f59496d;

        public C21026a(MPExoVideoWrapper mPExoVideoWrapper) {
            this.f59496d = mPExoVideoWrapper;
        }

        public final void run() {
            int i = MPExoVideoWrapper.f51486Q0;
            Log.m105918d("MicroMsg.MPExoVideoWrapper", "hide cover onSurfaceTextureUpdated");
            MPExoVideoWrapper mPExoVideoWrapper = this.f59496d;
            mPExoVideoWrapper.getClass();
            Log.m105918d("MicroMsg.MPExoVideoWrapper", "hide cover");
            ImageView imageView = mPExoVideoWrapper.f51515j;
            C87412m.m108591d(imageView);
            imageView.setVisibility(8);
        }
    }

    public C21025j(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59495d = mPExoVideoWrapper;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        int i3 = MPExoVideoWrapper.f51486Q0;
        Log.m105925i("MicroMsg.MPExoVideoWrapper", "on surface texture available, width %d height %d switching %b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f59495d.f51505T));
        C45224b.C45225a a = this.f59495d.getBizVideoProfiler();
        if (a != null) {
            C51645v5 a2 = a.mo70716a("9");
            C45224b bVar = C45224b.f122558a;
            LinkedList<C52069y5> linkedList = a2.f143302e;
            C52069y5 y5Var = new C52069y5();
            y5Var.f145118d = "PlayerType";
            y5Var.f145119e = "3";
            linkedList.add(y5Var);
            C45224b.m50020a(bVar, a2, this.f59495d.getBizVideoProfiler(), (String) null, 2, (Object) null);
        }
        this.f59495d.mo23214o();
        MPExoVideoTextureView mPExoVideoTextureView = this.f59495d.f51521r;
        if (mPExoVideoTextureView != null) {
            mPExoVideoTextureView.mo82024B();
        }
        MPExoVideoWrapper mPExoVideoWrapper = this.f59495d;
        MPExoVideoTextureView mPExoVideoTextureView2 = mPExoVideoWrapper.f51521r;
        if (mPExoVideoTextureView2 != null) {
            Surface surface = mPExoVideoWrapper.f51520q;
            ((C119157j) C119157j.f356862d).mo183875f(new C87603a(mPExoVideoTextureView2, surface));
        }
        this.f59495d.f51520q = new Surface(surfaceTexture);
        MPExoVideoWrapper mPExoVideoWrapper2 = this.f59495d;
        if (mPExoVideoWrapper2.f51522s != null && mPExoVideoWrapper2.f51494H) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "init, setSurface");
            C21365k kVar = this.f59495d.f51522s;
            C87412m.m108591d(kVar);
            kVar.setSurface(this.f59495d.f51520q);
            MPExoVideoWrapper mPExoVideoWrapper3 = this.f59495d;
            if (mPExoVideoWrapper3.f51493G) {
                C45224b.C45225a a3 = mPExoVideoWrapper3.getBizVideoProfiler();
                if (a3 != null) {
                    C45224b.m50020a(C45224b.f122558a, a3.mo70716a("15"), this.f59495d.getBizVideoProfiler(), (String) null, 2, (Object) null);
                }
                C21365k kVar2 = this.f59495d.f51522s;
                C87412m.m108591d(kVar2);
                kVar2.start();
            }
            this.f59495d.f51493G = false;
        } else if (mPExoVideoWrapper2.f51505T) {
            int i4 = mPExoVideoWrapper2.f51500N;
            boolean z = mPExoVideoWrapper2.f51501P;
            mPExoVideoWrapper2.getClass();
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "prepare async");
            mPExoVideoWrapper2.mo23210k();
            mPExoVideoWrapper2.mo23208i();
            mPExoVideoWrapper2.mo23211l(i4, z);
            if (z) {
                mPExoVideoWrapper2.mo23213n();
            }
        } else {
            mPExoVideoWrapper2.mo23210k();
            this.f59495d.mo23208i();
        }
        this.f59495d.getClass();
        MPExoVideoWrapper mPExoVideoWrapper4 = this.f59495d;
        if (mPExoVideoWrapper4.f51505T) {
            mPExoVideoWrapper4.getClass();
            Log.m105918d("MicroMsg.MPExoVideoWrapper", "resetResolutionStatus");
            mPExoVideoWrapper4.f51505T = false;
            mPExoVideoWrapper4.f51504S = false;
            TextView textView = mPExoVideoWrapper4.f51517o;
            if (!(textView == null || textView.getVisibility() == 8)) {
                textView.setVisibility(8);
            }
            ImageView imageView = mPExoVideoWrapper4.f51516n;
            if (imageView != null && imageView.getVisibility() != 8) {
                imageView.setVisibility(8);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        int i = MPExoVideoWrapper.f51486Q0;
        Log.m105924i("MicroMsg.MPExoVideoWrapper", "on surface texture destroyed");
        MPExoVideoWrapper mPExoVideoWrapper = this.f59495d;
        mPExoVideoWrapper.f51520q = null;
        if (mPExoVideoWrapper.f51522s == null || !mPExoVideoWrapper.f51494H) {
            mPExoVideoWrapper.mo23209j();
            this.f59495d.f51493G = false;
        } else if (mPExoVideoWrapper.mo23183e()) {
            MPExoVideoWrapper mPExoVideoWrapper2 = this.f59495d;
            mPExoVideoWrapper2.f51493G = true;
            C21365k kVar = mPExoVideoWrapper2.f51522s;
            if (kVar != null) {
                kVar.pause();
            }
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        if (this.f59495d.getLoading() != null) {
            ProgressBar loading = this.f59495d.getLoading();
            C87412m.m108591d(loading);
            if (loading.getVisibility() == 0) {
                this.f59495d.mo23182d();
            }
        }
        ImageView imageView = this.f59495d.f51515j;
        if (imageView != null) {
            C87412m.m108591d(imageView);
            if (imageView.getVisibility() != 0) {
                return;
            }
            if (this.f59495d.mo23183e() || this.f59495d.getCurrPosSec() != 0) {
                this.f59495d.getUiHandler().post(new C21026a(this.f59495d));
            }
        }
    }
}
