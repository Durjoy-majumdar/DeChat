package com.tencent.p014mm.modelimage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o90.C100301b;

/* renamed from: com.tencent.mm.modelimage.n */
public class C92846n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f267441d;

    /* renamed from: e */
    public final /* synthetic */ float f267442e;

    /* renamed from: f */
    public final /* synthetic */ boolean f267443f;

    /* renamed from: g */
    public final /* synthetic */ int f267444g;

    /* renamed from: h */
    public final /* synthetic */ C92839m f267445h;

    /* renamed from: com.tencent.mm.modelimage.n$a */
    public class C92847a implements Runnable {
        public C92847a() {
        }

        public void run() {
            Bitmap bitmap;
            C92846n nVar = C92846n.this;
            C92839m mVar = nVar.f267445h;
            String str = nVar.f267441d;
            boolean z = nVar.f267443f;
            int i = nVar.f267444g;
            mVar.getClass();
            Log.m105919d("MicroMsg.ImgInfoStorage", "checkrefresh load done, uri: %s", str);
            ((HashSet) mVar.f267420i).remove(Integer.valueOf(str.hashCode()));
            Iterator it = ((ArrayList) mVar.f267416e).iterator();
            while (it.hasNext()) {
                C92839m.C92842c cVar = (C92839m.C92842c) it.next();
                if (str.equals(cVar.f267427b) && (bitmap = (Bitmap) ((C100301b) mVar.f267415d).mo139556b(str)) != null && !bitmap.isRecycled()) {
                    ImageView imageView = (ImageView) ((WeakReference) ((HashMap) mVar.f267417f).get(Integer.valueOf(cVar.f267426a))).get();
                    if (imageView != null) {
                        Log.m105925i("MicroMsg.ImgInfoStorage", "[checkrefresh] bitmap width %d,height %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
                        C92839m.C92841b.m117104a(bitmap, imageView);
                        imageView.setLayoutParams(mVar.f267424p);
                        boolean z2 = bitmap.getWidth() >= bitmap.getHeight() * 2;
                        boolean z3 = bitmap.getHeight() >= bitmap.getWidth() * 2;
                        if (z2 || z3) {
                            Log.m105919d("MicroMsg.ImgInfoStorage", "bm: w:%d, h:%d ", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                        }
                        if (((HashMap) mVar.f267418g).get(Integer.valueOf(cVar.f267428c)) != null) {
                            ImageView imageView2 = (ImageView) ((WeakReference) ((HashMap) mVar.f267418g).get(Integer.valueOf(cVar.f267428c))).get();
                            if (imageView2 != null) {
                                imageView2.setLayoutParams(new FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
                            }
                        }
                        if (((HashMap) mVar.f267419h).get(Integer.valueOf(cVar.f267429d)) != null) {
                            View view = (View) ((WeakReference) ((HashMap) mVar.f267419h).get(Integer.valueOf(cVar.f267429d))).get();
                            if (view != null) {
                                view.setLayoutParams(new FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
                            }
                        }
                    }
                }
            }
        }
    }

    public C92846n(C92839m mVar, String str, float f, boolean z, int i) {
        this.f267445h = mVar;
        this.f267441d = str;
        this.f267442e = f;
        this.f267443f = z;
        this.f267444g = i;
    }

    public void run() {
        this.f267445h.mo127196qq(this.f267441d, true, this.f267442e, true, false, this.f267443f, this.f267444g, true);
        this.f267445h.f267421j.post(new C92847a());
    }

    public String toString() {
        return super.toString() + "|loadImginBackground";
    }
}
