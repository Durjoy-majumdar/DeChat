package i80;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.C0125s;
import d14.C58050i1;
import e80.C107259g;
import rx3.C13598b0;
import rx3.C13604l;
import v70.C111409v;
import wx3.C15601d;

/* renamed from: i80.e */
public interface C108402e extends C111409v {

    /* renamed from: i80.e$a */
    public static final class C108403a {
        /* renamed from: a */
        public static /* synthetic */ Object m146864a(C108402e eVar, int i, int i2, int i3, String str, boolean z, C15601d dVar, int i4, Object obj) {
            if (obj == null) {
                return eVar.mo148276l((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, str, z, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takePicture");
        }
    }

    /* renamed from: a */
    void mo148263a();

    /* renamed from: b */
    void mo148264b();

    /* renamed from: f */
    Object mo148268f(int i, int i2, int i3, boolean z, C15601d<? super C13604l<Integer, Bitmap>> dVar);

    C58050i1<C13604l<C108399b, Bundle>> getCameraState();

    /* renamed from: i */
    void mo148273i(boolean z);

    /* renamed from: k */
    void mo148275k(C0125s sVar);

    /* renamed from: l */
    Object mo148276l(int i, int i2, int i3, String str, boolean z, C15601d<? super Integer> dVar);

    /* renamed from: n */
    Object mo148278n(boolean z, C15601d<? super C13598b0> dVar);

    void setCameraKitSetting(C107259g gVar);

    void setLightTorch(boolean z);

    void switchCamera();
}
