package t80;

import android.opengl.GLSurfaceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: t80.a */
public final class C26293a implements GLSurfaceView.EGLConfigChooser {

    /* renamed from: a */
    public final int[] f73249a = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

    /* renamed from: b */
    public final int[] f73250b = new int[1];

    public C26293a(int i, int i2, int i3, int i4, int i5, int i6) {
    }

    /* renamed from: a */
    public final int mo53167a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f73250b) ? this.f73250b[0] : i2;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGL10 egl102 = egl10;
        EGLDisplay eGLDisplay2 = eGLDisplay;
        C87412m.m108594g(egl102, "egl");
        C87412m.m108594g(eGLDisplay2, "display");
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, this.f73249a, (EGLConfig[]) null, 0, iArr);
        int i = iArr[0];
        if (i > 0) {
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, this.f73249a, eGLConfigArr, i, iArr);
            String format = String.format("%d configurations", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            Log.m105924i("MicroMsg.RenderConfigChooser", format);
            for (int i2 = 0; i2 < i; i2++) {
                String format2 = String.format("Configuration %d:\n", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                C87412m.m108593f(format2, "format(format, *args)");
                Log.m105924i("MicroMsg.RenderConfigChooser", format2);
                EGLConfig eGLConfig = eGLConfigArr[i2];
                C87412m.m108591d(eGLConfig);
                int[] iArr2 = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};
                String[] strArr = {"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"};
                int[] iArr3 = new int[1];
                int i3 = 0;
                for (int i4 = 33; i3 < i4; i4 = 33) {
                    int i5 = iArr2[i3];
                    String str = strArr[i3];
                    egl102.eglGetConfigAttrib(eGLDisplay2, eGLConfig, i5, iArr3);
                    i3++;
                }
            }
            for (int i6 = 0; i6 < i; i6++) {
                EGLConfig eGLConfig2 = eGLConfigArr[i6];
                C87412m.m108591d(eGLConfig2);
                EGL10 egl103 = egl10;
                EGLDisplay eGLDisplay3 = eGLDisplay;
                EGLConfig eGLConfig3 = eGLConfig2;
                int a = mo53167a(egl103, eGLDisplay3, eGLConfig3, 12325, 0);
                int a2 = mo53167a(egl103, eGLDisplay3, eGLConfig3, 12326, 0);
                if (a >= 0 && a2 >= 0) {
                    EGL10 egl104 = egl10;
                    EGLDisplay eGLDisplay4 = eGLDisplay;
                    EGLConfig eGLConfig4 = eGLConfig2;
                    int a3 = mo53167a(egl104, eGLDisplay4, eGLConfig4, 12324, 0);
                    int a4 = mo53167a(egl104, eGLDisplay4, eGLConfig4, 12323, 0);
                    int a5 = mo53167a(egl104, eGLDisplay4, eGLConfig4, 12322, 0);
                    int a6 = mo53167a(egl104, eGLDisplay4, eGLConfig4, 12321, 0);
                    if (a3 == 5 && a4 == 6 && a5 == 5 && a6 == 0) {
                        return eGLConfig2;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No configs match configSpec");
    }
}
