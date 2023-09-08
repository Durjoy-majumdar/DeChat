package com.tencent.p014mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gn0.C107864f;
import gn0.C107865g;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView */
public class DanmuView extends View {

    /* renamed from: d */
    public final Context f311195d;

    /* renamed from: e */
    public int f311196e;

    /* renamed from: f */
    public int f311197f;

    /* renamed from: g */
    public int f311198g;

    /* renamed from: h */
    public float f311199h;

    /* renamed from: i */
    public float f311200i;

    /* renamed from: j */
    public boolean f311201j;

    /* renamed from: n */
    public boolean f311202n;

    /* renamed from: o */
    public C107864f f311203o;

    /* renamed from: p */
    public HashMap<Integer, ArrayList<C107865g>> f311204p;

    /* renamed from: q */
    public final Deque<C107865g> f311205q;

    /* renamed from: r */
    public List<C107865g> f311206r;

    /* renamed from: s */
    public int[] f311207s;

    /* renamed from: t */
    public volatile int f311208t;

    /* renamed from: u */
    public volatile boolean f311209u;

    /* renamed from: v */
    public LinkedList<Long> f311210v;

    /* renamed from: w */
    public Paint f311211w;

    /* renamed from: x */
    public long f311212x;

    /* renamed from: y */
    public LinkedList<Float> f311213y;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView$a */
    public class C104787a implements Runnable {
        public C104787a() {
        }

        public void run() {
            DanmuView.this.f311209u = false;
            DanmuView.this.invalidate();
        }
    }

    public DanmuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo148614a() {
        this.f311204p = new HashMap<>(this.f311196e);
        for (int i = 0; i < this.f311196e; i++) {
            this.f311204p.put(Integer.valueOf(i), new ArrayList(this.f311198g));
        }
        mo148618e();
    }

    /* renamed from: b */
    public final void mo148615b() {
        HashMap<Integer, ArrayList<C107865g>> hashMap = this.f311204p;
        if (hashMap != null && !hashMap.isEmpty()) {
            this.f311204p.clear();
        }
        synchronized (this.f311205q) {
            if (!this.f311205q.isEmpty()) {
                ((LinkedList) this.f311205q).clear();
            }
        }
    }

    /* renamed from: c */
    public final int mo148616c(C107865g gVar) {
        int i = 0;
        while (true) {
            try {
                int i2 = this.f311196e;
                if (i >= i2) {
                    return -1;
                }
                int i3 = (i + 0) % i2;
                ArrayList arrayList = this.f311204p.get(Integer.valueOf(i3));
                if (arrayList.size() == 0) {
                    return i3;
                }
                if (arrayList.size() <= this.f311198g) {
                    if (!gVar.mo158279e((C107865g) arrayList.get(arrayList.size() - 1))) {
                        return i3;
                    }
                }
                i++;
            } catch (Exception e) {
                Log.m105928w("MicroMsg.DanmuView", "findVacant,Exception:" + e.getMessage());
                return -1;
            }
        }
    }

    /* renamed from: d */
    public final double mo148617d() {
        long nanoTime = System.nanoTime();
        this.f311210v.addLast(Long.valueOf(nanoTime));
        double longValue = ((double) (nanoTime - this.f311210v.getFirst().longValue())) / 1.0E9d;
        if (this.f311210v.size() > 100) {
            this.f311210v.removeFirst();
        }
        if (longValue > 0.0d) {
            return ((double) this.f311210v.size()) / longValue;
        }
        return 0.0d;
    }

    /* renamed from: e */
    public final void mo148618e() {
        this.f311207s = new int[this.f311196e];
        float b = ((float) C76577a.m92151b(this.f311195d, 18)) * 2.0f;
        float height = ((float) getHeight()) * this.f311199h;
        int i = 0;
        int i2 = 0;
        while (i2 < this.f311196e) {
            int i3 = i2 + 1;
            this.f311207s[i2] = (int) (((((float) i3) * b) + height) - ((3.0f * b) / 4.0f));
            i2 = i3;
        }
        if (this.f311202n) {
            this.f311213y.clear();
            this.f311213y.add(Float.valueOf(height));
            while (i < this.f311196e) {
                i++;
                this.f311213y.add(Float.valueOf((((float) i) * b) + height));
            }
        }
    }

    /* renamed from: f */
    public void mo148619f() {
        float f = this.f311199h;
        float f2 = this.f311200i;
        if (f >= f2) {
            throw new IllegalArgumentException("start_Y_offset must < end_Y_offset");
        } else if (f < 0.0f || f >= 1.0f || f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("start_Y_offset and end_Y_offset must between 0 and 1)");
        } else {
            setBackgroundColor(0);
            setDrawingCacheBackgroundColor(0);
            mo148614a();
        }
    }

    /* renamed from: g */
    public final void mo148620g() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f311209u = false;
            invalidate();
            return;
        }
        post(new C104787a());
    }

    public float getYOffset() {
        return this.f311200i - this.f311199h;
    }

    public void onDraw(Canvas canvas) {
        LinkedList<Float> linkedList;
        LinkedList<Float> linkedList2;
        int c;
        super.onDraw(canvas);
        if (this.f311209u) {
            Log.m105924i("MicroMsg.DanmuView", "inTransition");
        } else if (this.f311208t == 1) {
            try {
                canvas.drawColor(0);
                for (int i = 0; i < this.f311204p.size(); i++) {
                    Iterator it = this.f311204p.get(Integer.valueOf(i)).iterator();
                    while (it.hasNext()) {
                        C107865g gVar = (C107865g) it.next();
                        if (gVar.mo158278d()) {
                            it.remove();
                        } else {
                            gVar.mo158276b(canvas, false);
                        }
                    }
                }
                if (System.currentTimeMillis() - this.f311212x > ((long) this.f311197f)) {
                    this.f311212x = System.currentTimeMillis();
                    synchronized (this.f311205q) {
                        if (((LinkedList) this.f311205q).size() > 0) {
                            C107865g gVar2 = (C107865g) ((LinkedList) this.f311205q).getFirst();
                            int currPosSec = AppBrandVideoView.this.f49521f.getCurrPosSec();
                            while (gVar2 != null && gVar2.mo158283h(currPosSec)) {
                                ((LinkedList) this.f311205q).pollFirst();
                                gVar2 = (C107865g) ((LinkedList) this.f311205q).getFirst();
                            }
                            if (gVar2 != null && gVar2.mo158277c(currPosSec) && (c = mo148616c(gVar2)) >= 0) {
                                gVar2.mo158284i(canvas.getWidth() - 2, this.f311207s[c]);
                                gVar2.mo158276b(canvas, false);
                                this.f311204p.get(Integer.valueOf(c)).add(gVar2);
                                ((LinkedList) this.f311205q).pollFirst();
                            }
                        }
                    }
                }
                if (this.f311201j && this.f311210v != null) {
                    canvas.drawText("FPS:" + ((int) mo148617d()), 5.0f, 20.0f, this.f311211w);
                }
                if (this.f311202n && (linkedList2 = this.f311213y) != null) {
                    Iterator<Float> it4 = linkedList2.iterator();
                    while (it4.hasNext()) {
                        float floatValue = it4.next().floatValue();
                        canvas.drawLine(0.0f, floatValue, (float) getWidth(), floatValue, this.f311211w);
                    }
                }
            } catch (Exception e) {
                Log.m105929w("MicroMsg.DanmuView", "STATUS_RUNNING onDraw e=%s", e);
            }
            invalidate();
        } else if (this.f311208t == 2) {
            try {
                canvas.drawColor(0);
                for (int i2 = 0; i2 < this.f311204p.size(); i2++) {
                    Iterator it5 = this.f311204p.get(Integer.valueOf(i2)).iterator();
                    while (it5.hasNext()) {
                        ((C107865g) it5.next()).mo158276b(canvas, true);
                    }
                }
                if (this.f311201j && this.f311210v != null) {
                    canvas.drawText("FPS:" + ((int) mo148617d()), 5.0f, 20.0f, this.f311211w);
                }
                if (this.f311202n && (linkedList = this.f311213y) != null) {
                    Iterator<Float> it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        float floatValue2 = it6.next().floatValue();
                        canvas.drawLine(0.0f, floatValue2, (float) getWidth(), floatValue2, this.f311211w);
                    }
                }
            } catch (Exception e2) {
                Log.m105929w("MicroMsg.DanmuView", "STATUS_PAUSE onDraw e=%s", e2);
            }
            invalidate();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo148618e();
    }

    public void setDanmuViewCallBack(C107864f fVar) {
        this.f311203o = fVar;
    }

    public void setMaxRow(int i) {
        this.f311196e = i;
        HashMap<Integer, ArrayList<C107865g>> hashMap = this.f311204p;
        if (hashMap != null) {
            synchronized (hashMap) {
                for (int i2 = 0; i2 < this.f311204p.size(); i2++) {
                    ArrayList arrayList = this.f311204p.get(Integer.valueOf(i2));
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
            }
        }
        mo148614a();
    }

    public void setMaxRunningPerRow(int i) {
        this.f311198g = i;
    }

    public void setPickItemInterval(int i) {
        this.f311197f = i;
    }

    public void setShowFps(boolean z) {
        this.f311201j = z;
        if (!z) {
            return;
        }
        if (this.f311211w == null || this.f311210v == null) {
            TextPaint textPaint = new TextPaint(1);
            this.f311211w = textPaint;
            textPaint.setColor(-256);
            this.f311211w.setTextSize(20.0f);
            this.f311210v = new LinkedList<>();
        }
    }

    public void setShowLines(boolean z) {
        this.f311202n = z;
        if (z && this.f311213y == null) {
            this.f311213y = new LinkedList<>();
        }
    }

    public DanmuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f311196e = 5;
        this.f311197f = 500;
        this.f311198g = 10;
        this.f311199h = 0.0f;
        this.f311200i = 0.6f;
        this.f311201j = false;
        this.f311202n = false;
        this.f311205q = new LinkedList();
        this.f311206r = new LinkedList();
        this.f311208t = 3;
        this.f311212x = 0;
        this.f311195d = context;
    }
}
