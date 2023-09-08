package r60;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import k60.C99102f;
import x60.C66236d;

/* renamed from: r60.c */
public class C101341c extends C101349h<ImageView> {

    /* renamed from: b */
    public boolean f296880b;

    /* renamed from: r60.c$a */
    public class C63375a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ Object f179774d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f179775e;

        public C63375a(C101341c cVar, Object obj, ImageView imageView) {
            this.f179774d = obj;
            this.f179775e = imageView;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Matrix c = ((C66236d) this.f179774d).mo87410c((float) view.getWidth(), (float) view.getHeight());
            if (c != null) {
                this.f179775e.setScaleType(ImageView.ScaleType.MATRIX);
                this.f179775e.setImageMatrix(c);
            }
            this.f179775e.removeOnLayoutChangeListener(this);
        }
    }

    public C101341c(C101350i<ImageView> iVar) {
        super(iVar);
        this.f296880b = true;
    }

    /* renamed from: c */
    public int mo140831c() {
        return this.f296881a.f296898c;
    }

    /* renamed from: d */
    public void mo140832d(C101350i<?> iVar, C99102f<?, ?> fVar) {
        if (iVar == null || fVar == null) {
            Log.m105928w("MicroMsg.Loader.ImageViewShowTarget", "[ViewShowTarget] should show default view or options is null.");
            return;
        }
        ImageView imageView = (ImageView) iVar.mo140837a();
        if (imageView != null && this.f296880b) {
            int i = fVar.f290588q;
            if (!(i > 0 || fVar.f290590s != null)) {
                imageView.setImageBitmap((Bitmap) null);
            } else if (i == 0) {
                imageView.setImageDrawable(fVar.f290590s);
            } else {
                imageView.setImageResource(i);
            }
        }
    }

    /* renamed from: e */
    public boolean mo138755b(Bitmap bitmap, C101350i<?> iVar) {
        ImageView imageView = (ImageView) iVar.mo140837a();
        T t = iVar.f296897b.f301995a;
        if (imageView != null) {
            imageView.setImageMatrix((Matrix) null);
            if (t instanceof C66236d) {
                imageView.addOnLayoutChangeListener(new C63375a(this, t, imageView));
            }
            imageView.setImageBitmap(bitmap);
            return true;
        }
        Log.m105920e("MicroMsg.Loader.ImageViewShowTarget", "[onResourceReadyUI]  imageView is null");
        return true;
    }

    public C101341c(C101350i<ImageView> iVar, boolean z) {
        super(iVar);
        this.f296880b = z;
    }
}
