package com.tencent.p014mm.plugin.location.p069ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinishSelectPOIStruct;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115581w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import y22.C118913e;

/* renamed from: com.tencent.mm.plugin.location.ui.PoiPoint */
public class PoiPoint extends View {

    /* renamed from: A */
    public RectF f346367A = new RectF();

    /* renamed from: B */
    public C115522d f346368B = C115522d.SIT;

    /* renamed from: C */
    public C115521c f346369C;

    /* renamed from: d */
    public Context f346370d;

    /* renamed from: e */
    public C118913e f346371e;

    /* renamed from: f */
    public Paint f346372f;

    /* renamed from: g */
    public int f346373g;

    /* renamed from: h */
    public Paint f346374h;

    /* renamed from: i */
    public int f346375i;

    /* renamed from: j */
    public Paint f346376j;

    /* renamed from: n */
    public int f346377n;

    /* renamed from: o */
    public Paint f346378o;

    /* renamed from: p */
    public int f346379p;

    /* renamed from: q */
    public ValueAnimator f346380q;

    /* renamed from: r */
    public ValueAnimator f346381r;

    /* renamed from: s */
    public ValueAnimator f346382s;

    /* renamed from: t */
    public boolean f346383t = false;

    /* renamed from: u */
    public double f346384u;

    /* renamed from: v */
    public double f346385v;

    /* renamed from: w */
    public int f346386w;

    /* renamed from: x */
    public int f346387x;

    /* renamed from: y */
    public float f346388y;

    /* renamed from: z */
    public int f346389z;

    /* renamed from: com.tencent.mm.plugin.location.ui.PoiPoint$a */
    public class C115519a implements ValueAnimator.AnimatorUpdateListener {
        public C115519a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PoiPoint poiPoint = PoiPoint.this;
            if (valueAnimator == poiPoint.f346380q) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Log.m105925i("MicroMsg.PoiPoint", "greenRadiusChangeAnim, val: %s.", Integer.valueOf(intValue));
                PoiPoint.this.f346375i = intValue;
            } else if (valueAnimator == poiPoint.f346381r) {
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Log.m105925i("MicroMsg.PoiPoint", "whiteRadiusChangeAnim, val: %s.", Integer.valueOf(intValue2));
                PoiPoint.this.f346377n = intValue2;
            } else if (valueAnimator == poiPoint.f346382s) {
                int intValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Log.m105925i("MicroMsg.PoiPoint", "greenLineChangeAnim, val: %s.", Integer.valueOf(intValue3));
                PoiPoint.this.f346379p = intValue3;
            }
            PoiPoint poiPoint2 = PoiPoint.this;
            if (poiPoint2.f346383t) {
                poiPoint2.f346371e.updateMarkerView(poiPoint2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.PoiPoint$b */
    public class C115520b implements TencentMap.OnMarkerClickListener {
        public C115520b() {
        }

        public boolean onMarkerClick(Marker marker) {
            Log.m105924i("MicroMsg.PoiPoint", "onClick.");
            PoiPoint poiPoint = PoiPoint.this;
            C115521c cVar = poiPoint.f346369C;
            if (cVar == null) {
                return false;
            }
            C115522d dVar = poiPoint.f346368B;
            C115581w wVar = (C115581w) cVar;
            C115522d dVar2 = C115522d.SIT;
            if (dVar2 == dVar) {
                C115538c0 c0Var = wVar.f346639a;
                if (-1 == c0Var.f346551t.f346592f) {
                    c0Var.mo175577s(true);
                }
                PoiPoint poiPoint2 = wVar.f346639a.f346531b1;
                if (poiPoint2 != null && C115522d.STAND == poiPoint2.f346368B) {
                    poiPoint2.f346368B = dVar2;
                    poiPoint2.f346380q.reverse();
                    poiPoint2.f346381r.reverse();
                    poiPoint2.f346382s.reverse();
                }
                wVar.f346639a.f346583e.getIController().animateTo(poiPoint.getLat(), poiPoint.getLng());
                wVar.f346639a.f346531b1 = poiPoint;
                poiPoint.mo175514c();
                C115538c0.m162436o(wVar.f346639a, poiPoint.getPosition());
                wVar.f346639a.f346551t.f346592f = poiPoint.getPosition();
                wVar.f346639a.f346551t.notifyDataSetChanged();
                FinishSelectPOIStruct finishSelectPOIStruct = wVar.f346639a.f346556x0;
                finishSelectPOIStruct.f343728g = (long) (poiPoint.getPosition() + 1);
                finishSelectPOIStruct.f343727f = (long) 2;
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.PoiPoint$c */
    public interface C115521c {
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.PoiPoint$d */
    public enum C115522d {
        STAND,
        SIT
    }

    public PoiPoint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo175512a(context);
    }

    /* renamed from: a */
    public final void mo175512a(Context context) {
        setLayerType(1, (Paint) null);
        this.f346370d = context;
        Paint paint = new Paint(1);
        this.f346372f = paint;
        paint.setColor(-1);
        this.f346373g = C74942w4.m89784a(context, 12);
        Paint paint2 = new Paint(1);
        this.f346374h = paint2;
        paint2.setColor(context.getResources().getColor(C0966R.color.akw));
        int a = C74942w4.m89784a(context, 8);
        int a2 = C74942w4.m89784a(context, 16);
        this.f346375i = a;
        Paint paint3 = new Paint(1);
        this.f346376j = paint3;
        paint3.setColor(-1);
        int a3 = C74942w4.m89784a(context, 7);
        this.f346377n = 0;
        Paint paint4 = new Paint(1);
        this.f346378o = paint4;
        paint4.setColor(context.getResources().getColor(C0966R.color.akw));
        this.f346378o.setStrokeWidth((float) C74942w4.m89784a(context, 4));
        int a4 = C74942w4.m89784a(context, 20);
        C115519a aVar = new C115519a();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{a, a2});
        this.f346380q = ofInt;
        ofInt.setDuration(300);
        this.f346380q.addUpdateListener(aVar);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0, a3});
        this.f346381r = ofInt2;
        ofInt2.setDuration(300);
        this.f346381r.addUpdateListener(aVar);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(new int[]{0, a4});
        this.f346382s = ofInt3;
        ofInt3.setDuration(300);
        this.f346382s.addUpdateListener(aVar);
        this.f346382s.setStartDelay(100);
        this.f346386w = C74942w4.m89784a(context, 1);
        this.f346387x = C74942w4.m89784a(context, 4);
        this.f346388y = C74942w4.m89787d(context) * 2.5f;
    }

    /* renamed from: b */
    public void mo175513b(double d, double d2, boolean z) {
        if (!this.f346383t) {
            this.f346383t = true;
            this.f346384u = d;
            this.f346385v = d2;
            this.f346371e.addPinView(this, d, d2);
            this.f346371e.setMarkerClickListener(this, new C115520b());
            if (z) {
                mo175514c();
            }
        }
    }

    /* renamed from: c */
    public void mo175514c() {
        if (C115522d.SIT == this.f346368B) {
            this.f346368B = C115522d.STAND;
            this.f346380q.start();
            this.f346381r.start();
            this.f346382s.start();
        }
    }

    public double getLat() {
        return this.f346384u;
    }

    public double getLng() {
        return this.f346385v;
    }

    public int getPosition() {
        return this.f346389z;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.m105919d("MicroMsg.PoiPoint", "onDraw, greenCircleRadius: %s.", Integer.valueOf(this.f346375i));
        int width = getWidth() / 2;
        float height = (float) ((getHeight() - (getWidth() / 2)) - this.f346379p);
        if (C115522d.SIT == this.f346368B && 0.0f == this.f346380q.getAnimatedFraction()) {
            Log.m105924i("MicroMsg.PoiPoint", "draw shade.");
            this.f346372f.setShadowLayer((float) C74942w4.m89784a(this.f346370d, 1), 0.0f, (float) this.f346386w, this.f346370d.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
        }
        float f = (float) width;
        canvas.drawCircle(f, height, (float) this.f346373g, this.f346372f);
        canvas.drawCircle(f, height, (float) this.f346375i, this.f346374h);
        canvas.drawCircle(f, height, (float) this.f346377n, this.f346376j);
        RectF rectF = this.f346367A;
        int i = this.f346387x;
        int i2 = this.f346375i;
        rectF.set(f - (((float) i) / 2.0f), (((float) i2) + height) - this.f346388y, f + (((float) i) / 2.0f), height + ((float) i2) + ((float) this.f346379p));
        RectF rectF2 = this.f346367A;
        float f2 = this.f346388y;
        canvas.drawRoundRect(rectF2, f2, f2, this.f346378o);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int a = C74942w4.m89784a(this.f346370d, 32);
        int a2 = C74942w4.m89784a(this.f346370d, 52);
        Log.m105919d("MicroMsg.PoiPoint", "point size: %s*%s.", Integer.valueOf(a), Integer.valueOf(a2));
        setMeasuredDimension(a, a2);
    }

    public void setOnPointClick(C115521c cVar) {
        this.f346369C = cVar;
    }

    public void setPosition(int i) {
        this.f346389z = i;
    }

    public PoiPoint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo175512a(context);
    }

    public PoiPoint(Context context, C118913e eVar) {
        super(context);
        this.f346371e = eVar;
        mo175512a(context);
    }
}
