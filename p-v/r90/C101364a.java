package r90;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.tencent.p014mm.memory.C92709i;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: r90.a */
public class C101364a extends Drawable implements C92709i {

    /* renamed from: d */
    public final Paint f296933d;

    /* renamed from: e */
    public C92714n f296934e;

    public C101364a(String str, C92714n nVar) {
        Paint paint = new Paint();
        this.f296933d = paint;
        this.f296934e = nVar;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(false);
        paint.setColor(-1118482);
        new MMHandler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public void mo126909a() {
        C92714n nVar = this.f296934e;
        if (nVar != null) {
            nVar.mo126909a();
        }
    }

    /* renamed from: b */
    public void mo126910b() {
        C92714n nVar = this.f296934e;
        if (nVar != null) {
            nVar.mo126910b();
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        C92714n nVar = this.f296934e;
        if (nVar == null || nVar.mo126922e()) {
            canvas.drawColor(-1118482);
            return;
        }
        canvas.drawBitmap(nVar.f266818d, (Rect) null, bounds, this.f296933d);
    }

    public int getIntrinsicHeight() {
        C92714n nVar = this.f296934e;
        if (nVar == null || nVar == null || nVar.mo126922e()) {
            return 0;
        }
        return nVar.f266818d.getHeight();
    }

    public int getIntrinsicWidth() {
        C92714n nVar = this.f296934e;
        if (nVar == null || nVar == null || nVar.mo126922e()) {
            return 0;
        }
        return nVar.f266818d.getWidth();
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public String toString() {
        return super.toString();
    }
}
