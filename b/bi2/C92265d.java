package bi2;

import ai2.C92010c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import te3.C64368fm;
import yh2.C102864a;

/* renamed from: bi2.d */
public final class C92265d extends C92262a {

    /* renamed from: e */
    public final C92010c f264080e;

    /* renamed from: f */
    public Paint f264081f = new Paint();

    /* renamed from: g */
    public C102864a f264082g;

    /* renamed from: h */
    public int f264083h;

    /* renamed from: i */
    public Matrix f264084i;

    /* renamed from: j */
    public boolean f264085j;

    /* renamed from: k */
    public final float f264086k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92265d(C92010c cVar) {
        super(cVar.f263407f);
        C87412m.m108594g(cVar, "captionItem");
        this.f264080e = cVar;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f264082g = new C102864a(context);
        this.f264083h = C75044y4.m89990b(MMApplicationContext.getContext()).x;
        this.f264084i = new Matrix();
        float[] fArr = new float[9];
        this.f264072a.getValues(fArr);
        double d = (double) fArr[0];
        double d2 = (double) fArr[3];
        this.f264086k = (float) Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: b */
    public void mo126256b() {
    }

    /* renamed from: c */
    public void mo126257c(Canvas canvas, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        if (this.f264085j) {
            canvas.save();
            this.f264084i.reset();
            this.f264084i.postTranslate((((float) this.f264083h) - (((float) this.f264082g.getMeasuredWidth()) * this.f264086k)) / 2.0f, 0.0f);
            canvas.concat(this.f264084i);
            canvas.concat(this.f264072a);
            this.f264082g.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: d */
    public void mo126258d() {
        this.f264081f.setAntiAlias(true);
        this.f264082g.setCaptionItem(this.f264080e);
        this.f264082g.setTag(this.f264080e);
    }

    /* renamed from: e */
    public long mo126259e() {
        return MAlarmHandler.NEXT_FIRE_INTERVAL;
    }

    /* renamed from: f */
    public void mo126260f(long j) {
        boolean z;
        this.f264075d = j;
        if (this.f264082g.mo53770a(j)) {
            C92010c cVar = this.f264082g.f303637n;
            if (cVar != null) {
                C64368fm i = cVar.mo125902i(j);
                z = !(i != null ? i.f183151g : true);
            } else {
                z = false;
            }
            if (z) {
                this.f264085j = true;
                this.f264082g.measure(0, 0);
                C102864a aVar = this.f264082g;
                aVar.layout(0, 0, aVar.getMeasuredWidth(), this.f264082g.getMeasuredHeight());
                return;
            }
        }
        this.f264085j = false;
    }
}
