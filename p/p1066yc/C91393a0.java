package p1066yc;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: yc.a0 */
public final class C91393a0 {

    /* renamed from: c */
    public static final Field f262092c;

    /* renamed from: a */
    public final SurfaceTexture f262093a;

    /* renamed from: b */
    public final List<C91395b> f262094b = new ArrayList();

    /* renamed from: yc.a0$a */
    public static class C91394a extends Handler {

        /* renamed from: a */
        public final C91393a0 f262095a;

        /* renamed from: b */
        public final Handler f262096b;

        public C91394a(Handler handler, C91393a0 a0Var) {
            super(handler.getLooper());
            this.f262096b = handler;
            this.f262095a = a0Var;
        }

        public void handleMessage(Message message) {
            this.f262096b.handleMessage(message);
            C91393a0 a0Var = this.f262095a;
            Field field = C91393a0.f262092c;
            synchronized (a0Var) {
                Iterator it = ((ArrayList) a0Var.f262094b).iterator();
                while (it.hasNext()) {
                    C91395b bVar = (C91395b) it.next();
                    Handler handler = bVar.f262098b;
                    if (handler == null) {
                        bVar.f262097a.onFrameAvailable(a0Var.f262093a);
                    } else {
                        handler.post(new C91435z(a0Var, bVar));
                    }
                }
            }
        }
    }

    /* renamed from: yc.a0$b */
    public static class C91395b {

        /* renamed from: a */
        public final SurfaceTexture.OnFrameAvailableListener f262097a;

        /* renamed from: b */
        public final Handler f262098b;

        public C91395b(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
            this.f262097a = onFrameAvailableListener;
            this.f262098b = handler;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C91395b.class != obj.getClass()) {
                return false;
            }
            return this.f262097a.equals(((C91395b) obj).f262097a);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f262097a});
        }
    }

    static {
        Field field = null;
        try {
            field = SurfaceTexture.class.getDeclaredField("mOnFrameAvailableHandler");
            field.setAccessible(true);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.SurfaceTextureWrapper", "get mOnFrameAvailableHandler fail since " + e.toString());
        }
        f262092c = field;
    }

    public C91393a0(SurfaceTexture surfaceTexture) {
        this.f262093a = surfaceTexture;
    }

    /* renamed from: a */
    public static C91393a0 m114669a(SurfaceTexture surfaceTexture) {
        synchronized (surfaceTexture) {
            Field field = f262092c;
            if (field == null) {
                return null;
            }
            try {
                Handler handler = (Handler) field.get(surfaceTexture);
                if (handler == null) {
                    Log.m105928w("MicroMsg.AppBrand.SurfaceTextureWrapper", "wrap, hookSurfaceTexture, originOnFrameAvailableHandler is null");
                    return null;
                } else if (handler instanceof C91394a) {
                    Log.m105924i("MicroMsg.AppBrand.SurfaceTextureWrapper", "wrap, hookSurfaceTexture, already hook");
                    C91393a0 a0Var = ((C91394a) handler).f262095a;
                    return a0Var;
                } else {
                    C91393a0 a0Var2 = new C91393a0(surfaceTexture);
                    field.set(surfaceTexture, new C91394a(handler, a0Var2));
                    return a0Var2;
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.SurfaceTextureWrapper", "wrap, hookSurfaceTexture fail since " + e.toString());
                return null;
            }
        }
    }
}
