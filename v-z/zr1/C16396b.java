package zr1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C60200t1;
import java.lang.ref.WeakReference;
import l60.C99344b;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import up1.C27696y;
import x60.C102564a;

/* renamed from: zr1.b */
public final class C16396b extends Drawable {

    /* renamed from: a */
    public final String f43794a;

    /* renamed from: b */
    public final int f43795b;

    /* renamed from: c */
    public final String f43796c = "Finder.UrlBitmapDrawable";

    /* renamed from: d */
    public final WeakReference<View> f43797d;

    /* renamed from: e */
    public Bitmap f43798e;

    /* renamed from: zr1.b$a */
    public static final class C16397a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C16396b f43799a;

        /* renamed from: b */
        public final /* synthetic */ C16396b f43800b;

        public C16397a(C16396b bVar, C16396b bVar2) {
            this.f43799a = bVar;
            this.f43800b = bVar2;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                Integer num = null;
                if (!(!bitmap.isRecycled())) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    C16396b bVar = this.f43799a;
                    C16396b bVar2 = this.f43800b;
                    String str = bVar.f43796c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("loaded, view:");
                    View view = bVar.f43797d.get();
                    sb.append(view != null ? Integer.valueOf(view.hashCode()) : null);
                    sb.append(", ");
                    sb.append(bVar2.f43794a);
                    Log.m105924i(str, sb.toString());
                    View view2 = bVar.f43797d.get();
                    Object tag = view2 != null ? view2.getTag(bVar.f43795b) : null;
                    String str2 = tag instanceof String ? (String) tag : null;
                    if (C87412m.m108589b(bVar2.f43794a, str2)) {
                        C61926c.m72668M(new C16395a(bVar, bitmap));
                        return;
                    }
                    String str3 = bVar.f43796c;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("loaded not match, view:");
                    View view3 = bVar.f43797d.get();
                    if (view3 != null) {
                        num = Integer.valueOf(view3.hashCode());
                    }
                    sb4.append(num);
                    sb4.append(", lastUrl:");
                    sb4.append(str2);
                    Log.m105924i(str3, sb4.toString());
                }
            }
        }
    }

    public C16396b(String str, int i, View view) {
        C87412m.m108594g(str, "url");
        this.f43794a = str;
        this.f43795b = i;
        this.f43797d = new WeakReference<>(view);
        if (view != null) {
            view.setTag(i, str);
        }
    }

    public void draw(Canvas canvas) {
        C13598b0 b0Var;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(canvas, "canvas");
        Bitmap bitmap = this.f43798e;
        Integer num = null;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, getBounds(), new Paint());
            String str = this.f43796c;
            StringBuilder sb = new StringBuilder();
            sb.append("draw, view:");
            View view = this.f43797d.get();
            sb.append(view != null ? Integer.valueOf(view.hashCode()) : null);
            sb.append(", rect:");
            sb.append(getBounds());
            sb.append(", ");
            sb.append(this.f43794a);
            Log.m105924i(str, sb.toString());
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            String str2 = this.f43796c;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("start load, view:");
            View view2 = this.f43797d.get();
            if (view2 != null) {
                num = Integer.valueOf(view2.hashCode());
            }
            sb4.append(num);
            sb4.append(", ");
            sb4.append(this.f43794a);
            Log.m105924i(str2, sb4.toString());
            C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(this.f43794a, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
            C16397a aVar = new C16397a(this, this);
            b.getClass();
            b.f291320d = aVar;
            b.mo85953c();
        }
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
