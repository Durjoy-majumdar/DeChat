package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import nu2.C100203e;
import nu2.C100205f;
import p206nj.C11171e;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView */
public class SnsDrawGestureView extends ImageView {

    /* renamed from: d */
    public List<PointF> f281558d;

    /* renamed from: e */
    public C96301a f281559e;

    /* renamed from: f */
    public int f281560f;

    /* renamed from: g */
    public Paint f281561g;

    /* renamed from: h */
    public Paint f281562h;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView$a */
    public interface C96301a {
    }

    public SnsDrawGestureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public void mo134093a() {
        SnsMethodCalculate.markStartTimeMs("clearGesture", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        ((ArrayList) this.f281558d).clear();
        postInvalidate();
        SnsMethodCalculate.markEndTimeMs("clearGesture", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    /* renamed from: b */
    public final List<PointF> mo134094b() {
        SnsMethodCalculate.markStartTimeMs("copyPath", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f281558d).iterator();
        while (it.hasNext()) {
            PointF pointF = (PointF) it.next();
            arrayList.add(new PointF(pointF.x, pointF.y));
        }
        SnsMethodCalculate.markEndTimeMs("copyPath", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return arrayList;
    }

    public C96301a getOnGestureListener() {
        SnsMethodCalculate.markStartTimeMs("getOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        C96301a aVar = this.f281559e;
        SnsMethodCalculate.markEndTimeMs("getOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return aVar;
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        super.onDraw(canvas);
        if (((ArrayList) this.f281558d).size() > 0) {
            Path path = new Path();
            path.moveTo(((PointF) ((ArrayList) this.f281558d).get(0)).x, ((PointF) ((ArrayList) this.f281558d).get(0)).y);
            canvas.drawCircle(((PointF) ((ArrayList) this.f281558d).get(0)).x, ((PointF) ((ArrayList) this.f281558d).get(0)).y, ((float) C76577a.m92151b(getContext(), 8)) / 2.0f, this.f281562h);
            for (int i = 1; i < ((ArrayList) this.f281558d).size(); i++) {
                path.lineTo(((PointF) ((ArrayList) this.f281558d).get(i)).x, ((PointF) ((ArrayList) this.f281558d).get(i)).y);
            }
            canvas.drawPath(path, this.f281561g);
            List<PointF> list = this.f281558d;
            float f = ((PointF) ((ArrayList) list).get(((ArrayList) list).size() - 1)).x;
            List<PointF> list2 = this.f281558d;
            canvas.drawCircle(f, ((PointF) ((ArrayList) list2).get(((ArrayList) list2).size() - 1)).y, ((float) C76577a.m92151b(getContext(), 8)) / 2.0f, this.f281562h);
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getActionMasked() == 0) {
            C96301a aVar = this.f281559e;
            if (aVar != null) {
                C100203e.C100204a aVar2 = (C100203e.C100204a) aVar;
                aVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("onGestureStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
                C102236a0.m134764q(false);
                C100205f.m131001p(C100203e.this.f293605g).setBackgroundColor(C100203e.this.f293605g.f293574a.getResources().getColor(C0966R.color.ac7));
                SnsMethodCalculate.markEndTimeMs("onGestureStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
            }
            ((ArrayList) this.f281558d).clear();
            ((ArrayList) this.f281558d).add(new PointF(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 2) {
            ((ArrayList) this.f281558d).add(new PointF(motionEvent.getX(), motionEvent.getY()));
            postInvalidate();
        } else if (motionEvent.getActionMasked() == 1) {
            Log.m105925i("MicroMsg.SnsDrawGestureViewView", "point count %d", Integer.valueOf(((ArrayList) this.f281558d).size()));
            if (((ArrayList) this.f281558d).size() < 6) {
                ((ArrayList) this.f281558d).clear();
                C96301a aVar3 = this.f281559e;
                if (aVar3 != null) {
                    C100203e.C100204a aVar4 = (C100203e.C100204a) aVar3;
                    aVar4.getClass();
                    SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
                    C102236a0.m134764q(true);
                    C100205f.m131001p(C100203e.this.f293605g).setBackgroundColor(0);
                    C100203e.this.f293604f.f293368m.f280501d.performClick();
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
                }
            } else {
                C96301a aVar5 = this.f281559e;
                if (aVar5 != null) {
                    ((C100203e.C100204a) aVar5).mo139508a(mo134094b());
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            C96301a aVar6 = this.f281559e;
            if (aVar6 != null) {
                ((C100203e.C100204a) aVar6).mo139508a(mo134094b());
            }
        }
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return true;
    }

    public void setOnGestureListener(C96301a aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        this.f281559e = aVar;
        SnsMethodCalculate.markEndTimeMs("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    public void setPaintColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        this.f281560f = i;
        this.f281561g.setColor(i);
        this.f281562h.setColor(this.f281560f);
        SnsMethodCalculate.markEndTimeMs("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    public SnsDrawGestureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f281558d = new ArrayList();
        this.f281560f = -1;
        this.f281561g = new Paint();
        this.f281562h = new Paint();
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        this.f281561g.setColor(this.f281560f);
        this.f281561g.setStyle(Paint.Style.STROKE);
        this.f281561g.setStrokeWidth((float) C76577a.m92151b(getContext(), 8));
        this.f281561g.setPathEffect(new CornerPathEffect((float) C76577a.m92151b(getContext(), 4)));
        this.f281561g.setAntiAlias(true);
        this.f281562h.setColor(this.f281560f);
        this.f281562h.setStyle(Paint.Style.FILL);
        this.f281562h.setAntiAlias(true);
        if (C11171e.m11044a(21)) {
            setLayerType(1, (Paint) null);
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }
}
