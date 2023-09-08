package ei2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import bi2.C92262a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;

/* renamed from: ei2.f */
public final class C97651f implements C31606c {

    /* renamed from: d */
    public final List<C92262a> f286443d;

    /* renamed from: e */
    public final Paint f286444e;

    /* renamed from: f */
    public final Bitmap f286445f;

    /* renamed from: g */
    public final Canvas f286446g;

    public C97651f(float[] fArr, float[] fArr2, List<C92262a> list, int i, int i2) {
        C87412m.m108594g(fArr, "drawingRect");
        C87412m.m108594g(list, "editorItems");
        this.f286443d = list;
        Paint paint = new Paint();
        this.f286444e = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        this.f286445f = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        this.f286446g = canvas;
        canvas.translate(-fArr[0], -fArr[1]);
    }

    /* renamed from: a */
    public Bitmap mo136908a(long j) {
        if (this.f286443d.size() == 0) {
            return null;
        }
        this.f286446g.drawColor(0, PorterDuff.Mode.MULTIPLY);
        for (C92262a aVar : this.f286443d) {
            aVar.mo126260f(j);
            aVar.mo126257c(this.f286446g, this.f286444e);
        }
        return this.f286445f;
    }

    public void destroy() {
        try {
            for (C92262a b : this.f286443d) {
                b.mo126256b();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SimpleFrameRetriever", e, "destroy error", new Object[0]);
        }
    }

    public Object invoke(Object obj) {
        return mo136908a(((Number) obj).longValue());
    }

    public void start() {
        try {
            for (C92262a d : this.f286443d) {
                d.mo126258d();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SimpleFrameRetriever", e, "start error", new Object[0]);
        }
    }
}
