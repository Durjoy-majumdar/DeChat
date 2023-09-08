package hn3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.BitmapTracer;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.IWebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: hn3.a */
public class C108252a {

    /* renamed from: hn3.a$a */
    public static class C108253a {

        /* renamed from: a */
        public TextureView f324120a;

        /* renamed from: b */
        public IWebView f324121b;

        /* renamed from: c */
        public int f324122c = 0;

        /* renamed from: d */
        public int f324123d = 0;
    }

    /* renamed from: a */
    public static void m146583a(Canvas canvas, View view, boolean z) {
        TextureView textureView;
        List<C108253a> b = m146584b(view, (int) view.getX(), (int) view.getY(), z);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) b;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C108253a aVar = (C108253a) it.next();
            if (aVar != null) {
                boolean z2 = aVar.f324121b instanceof IWebView;
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            IWebView iWebView = ((C108253a) it4.next()).f324121b;
            if (iWebView.getWebViewUI() != null) {
                iWebView.getWebViewUI().setWillNotDraw(true);
            }
        }
        view.draw(canvas);
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            IWebView iWebView2 = ((C108253a) it5.next()).f324121b;
            if (iWebView2.getWebViewUI() != null) {
                iWebView2.getWebViewUI().setWillNotDraw(false);
            }
        }
        if (arrayList2.size() > 0) {
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                C108253a aVar2 = (C108253a) it6.next();
                if (aVar2 != null && (textureView = aVar2.f324120a) != null) {
                    Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), textureView.getHeight());
                    if (bitmap == null || bitmap.isRecycled()) {
                        Log.m105920e("MicroMsg.BitmapUtil", "get thumb bitmap null or is recycled");
                    } else {
                        canvas.drawBitmap(bitmap, (float) aVar2.f324122c, (float) aVar2.f324123d, (Paint) null);
                    }
                } else if (aVar2 != null) {
                    IWebView iWebView3 = aVar2.f324121b;
                    if ((iWebView3 instanceof IWebView) && z) {
                        Bitmap captureBitmap = iWebView3.captureBitmap();
                        if (captureBitmap == null || captureBitmap.isRecycled()) {
                            Log.m105920e("MicroMsg.BitmapUtil", "get thumb bitmap null or is recycled");
                        } else {
                            canvas.drawBitmap(captureBitmap, (float) aVar2.f324122c, (float) aVar2.f324123d, (Paint) null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static List<C108253a> m146584b(View view, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof TextureView) {
            C108253a aVar = new C108253a();
            aVar.f324120a = (TextureView) view;
            aVar.f324122c = i;
            aVar.f324123d = i2;
            arrayList.add(aVar);
        } else if (z && (view instanceof WebView)) {
            C108253a aVar2 = new C108253a();
            aVar2.f324121b = (WebView) view;
            aVar2.f324122c = i;
            aVar2.f324123d = i2;
            arrayList.add(aVar2);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                arrayList.addAll(m146584b(viewGroup.getChildAt(i3), (int) (viewGroup.getX() + ((float) i)), (int) (viewGroup.getY() + ((float) i2)), z));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Bitmap m146585c(View view) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (view == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        m146583a(canvas, view, false);
        BitmapUtil.setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }

    /* renamed from: d */
    public static Bitmap m146586d(View view, int i, int i2, boolean z, Bitmap.Config config) {
        if (view == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Matrix matrix = new Matrix();
        matrix.setScale(((float) i) / ((float) view.getWidth()), ((float) i2) / ((float) view.getHeight()));
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        m146583a(canvas, view, z);
        BitmapUtil.setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }
}
