package p156gj;

import android.hardware.Camera;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p206nj.C11171e;
import zt3.C119157j;

/* renamed from: gj.a0 */
public class C107820a0 {

    /* renamed from: a */
    public static final Object f322642a = new Object();

    /* renamed from: gj.a0$a */
    public class C107821a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f322643d;

        /* renamed from: e */
        public final /* synthetic */ Camera[] f322644e;

        public C107821a(int i, Camera[] cameraArr) {
            this.f322643d = i;
            this.f322644e = cameraArr;
        }

        public void run() {
            try {
                int i = this.f322643d;
                if (i >= 0) {
                    Camera[] cameraArr = this.f322644e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    cameraArr[0] = (Camera) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/compatible/deviceinfo/MMCamera$1", "run", "()V", "android/hardware/Camera", WeChatBrands.Business.GROUP_OPEN, "(I)Landroid/hardware/Camera;");
                } else {
                    this.f322644e[0] = (Camera) C117292a.m165363i(new Object(), "com/tencent/mm/compatible/deviceinfo/MMCamera$1", "run", "()V", "android/hardware/Camera", WeChatBrands.Business.GROUP_OPEN, "()Landroid/hardware/Camera;");
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMCamera", e, "syncCreateCamera error in new free thread", new Object[0]);
            }
            Object obj = C107820a0.f322642a;
            synchronized (obj) {
                try {
                    obj.notifyAll();
                    Log.m105924i("MicroMsg.MMCamera", "openCamera notifyAll");
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.MMCamera", e2, "MMCamera_openLooperNull notify error", new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public static C107848z m146080a(int i, Looper looper) {
        if (!C11171e.m11046c(28)) {
            return new C107848z(m146082c(i, looper));
        }
        try {
            return new C107848z(m146082c(i, looper));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMCamera", e, "opnImpl error, try camera directly, myLooper: %s", Looper.myLooper());
            if (Looper.myLooper() == null) {
                return new C107848z(m146083d(i, looper));
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            return new C107848z((Camera) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/compatible/deviceinfo/MMCamera", WeChatBrands.Business.GROUP_OPEN, "(ILandroid/os/Looper;)Lcom/tencent/mm/compatible/deviceinfo/MCamera;", "android/hardware/Camera", WeChatBrands.Business.GROUP_OPEN, "(I)Landroid/hardware/Camera;"));
        }
    }

    /* renamed from: b */
    public static C107848z m146081b(Looper looper) {
        return looper == null ? new C107848z((Camera) C117292a.m165363i(new Object(), "com/tencent/mm/compatible/deviceinfo/MMCamera", WeChatBrands.Business.GROUP_OPEN, "(Landroid/os/Looper;)Lcom/tencent/mm/compatible/deviceinfo/MCamera;", "android/hardware/Camera", WeChatBrands.Business.GROUP_OPEN, "()Landroid/hardware/Camera;")) : new C107848z(m146083d(-1, looper));
    }

    /* renamed from: c */
    public static Camera m146082c(int i, Looper looper) {
        if (looper != null) {
            return m146083d(i, looper);
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        return (Camera) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/compatible/deviceinfo/MMCamera", "openImpl", "(ILandroid/os/Looper;)Landroid/hardware/Camera;", "android/hardware/Camera", WeChatBrands.Business.GROUP_OPEN, "(I)Landroid/hardware/Camera;");
    }

    /* renamed from: d */
    public static Camera m146083d(int i, Looper looper) {
        if (looper != Looper.getMainLooper() || Looper.getMainLooper() != Looper.myLooper()) {
            Camera[] cameraArr = {null};
            ((C119157j) C119157j.f356862d).mo183875f(new C107821a(i, cameraArr));
            Object obj = f322642a;
            synchronized (obj) {
                try {
                    if (cameraArr[0] == null) {
                        obj.wait();
                    }
                    Log.m105924i("MicroMsg.MMCamera", "openCamera wait finish");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MMCamera", e, "MMCamera_openLooperNull wait error", new Object[0]);
                }
            }
            return cameraArr[0];
        } else if (i < 0) {
            return (Camera) C117292a.m165363i(new Object(), "com/tencent/mm/compatible/deviceinfo/MMCamera", "syncCreateCamera", "(ILandroid/os/Looper;)Landroid/hardware/Camera;", "android/hardware/Camera", WeChatBrands.Business.GROUP_OPEN, "()Landroid/hardware/Camera;");
        } else {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            return (Camera) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/compatible/deviceinfo/MMCamera", "syncCreateCamera", "(ILandroid/os/Looper;)Landroid/hardware/Camera;", "android/hardware/Camera", WeChatBrands.Business.GROUP_OPEN, "(I)Landroid/hardware/Camera;");
        }
    }
}
