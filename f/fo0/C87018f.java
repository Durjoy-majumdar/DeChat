package fo0;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import java.lang.ref.WeakReference;
import p213oh.C11412b;

/* renamed from: fo0.f */
public class C87018f {

    /* renamed from: a */
    public static SparseArray<WeakReference<SkiaCanvasView>> f252526a = new SparseArray<>();

    /* renamed from: a */
    public static synchronized SkiaCanvasView m108049a(int i) {
        synchronized (C87018f.class) {
            if (f252526a.get(i) == null) {
                return null;
            }
            SkiaCanvasView skiaCanvasView = (SkiaCanvasView) f252526a.get(i).get();
            return skiaCanvasView;
        }
    }

    /* renamed from: b */
    public static synchronized void m108050b(int i, SkiaCanvasView skiaCanvasView) {
        synchronized (C87018f.class) {
            Object[] objArr = {Integer.valueOf(i), skiaCanvasView};
            int i2 = C11412b.f33577a;
            Log.m105925i("Luggage.SkiaCanvasViewManager", "put viewId:%d skiaCanvasView:%s", objArr);
            f252526a.put(i, new WeakReference(skiaCanvasView));
        }
    }

    /* renamed from: c */
    public static synchronized void m108051c(int i) {
        synchronized (C87018f.class) {
            SkiaCanvasView a = m108049a(i);
            if (a != null) {
                f252526a.remove(i);
                Object[] objArr = {Integer.valueOf(i), a};
                int i2 = C11412b.f33577a;
                Log.m105925i("Luggage.SkiaCanvasViewManager", "remove viewId:%d skiaCanvasView:%s", objArr);
            } else {
                Object[] objArr2 = {Integer.valueOf(i)};
                int i3 = C11412b.f33577a;
                Log.m105925i("Luggage.SkiaCanvasViewManager", "remove viewId:%d fail, not exist", objArr2);
            }
        }
    }
}
