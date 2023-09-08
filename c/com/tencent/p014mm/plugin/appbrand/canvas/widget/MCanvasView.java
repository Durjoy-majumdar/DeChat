package com.tencent.p014mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import p849e3.C107168a0;
import p849e3.C107207u;
import pi0.C110222b;
import pi0.C110229d;
import pi0.C110232f;
import ui0.C111179a;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView */
public class MCanvasView extends View implements C81602a {

    /* renamed from: d */
    public final C110222b f311174d = new C110222b(this);

    /* renamed from: e */
    public final Set<View.OnAttachStateChangeListener> f311175e = new LinkedHashSet();

    /* renamed from: f */
    public Bitmap f311176f;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView$a */
    public class C104784a implements Runnable {
        public C104784a() {
        }

        public void run() {
            ViewParent parent = MCanvasView.this.getParent();
            do {
                ((View) parent).forceLayout();
                parent = parent.getParent();
            } while (parent instanceof View);
            if (parent != null) {
                parent.requestLayout();
                MCanvasView.this.invalidate();
            }
        }
    }

    public MCanvasView(Context context) {
        super(context);
        mo148550f();
    }

    /* renamed from: a */
    public void mo113881a(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f311174d.mo113881a(jSONArray, aVar);
    }

    public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (!this.f311175e.contains(onAttachStateChangeListener)) {
            this.f311175e.add(onAttachStateChangeListener);
            super.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* renamed from: b */
    public void mo113882b(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f311174d.mo113882b(jSONArray, aVar);
    }

    /* renamed from: c */
    public void mo113883c() {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145208c(this)) {
            post(new C104784a());
        } else {
            postInvalidate();
        }
    }

    /* renamed from: d */
    public void mo113884d(Runnable runnable) {
        post(runnable);
    }

    /* renamed from: e */
    public boolean mo113885e(Canvas canvas) {
        return this.f311174d.mo113885e(canvas);
    }

    /* renamed from: f */
    public final void mo148550f() {
        Log.m105927v("MicroMsg.MCanvasView", "init %s", Integer.valueOf(hashCode()));
    }

    /* renamed from: g */
    public final void mo148551g() {
        Bitmap bitmap = this.f311176f;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.MCanvasView", "bitmap recycle %s %s", Integer.valueOf(hashCode()), this.f311176f);
            this.f311176f.recycle();
        }
    }

    public C110229d getDrawContext() {
        return this.f311174d.f329724g;
    }

    public String getSessionId() {
        return this.f311174d.f329727j;
    }

    public String getTraceId() {
        return this.f311174d.f329733s;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo148551g();
    }

    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            Bitmap bitmap = this.f311176f;
            if (bitmap == null || bitmap.isRecycled() || this.f311176f.getWidth() != measuredWidth || this.f311176f.getHeight() != measuredHeight) {
                mo148551g();
                try {
                    this.f311176f = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                    Log.m105927v("MicroMsg.MCanvasView", "create a new bitmap(id : %s, w : %s, h : %s)", Integer.valueOf(hashCode()), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
                } catch (OutOfMemoryError unused) {
                    Log.m105921e("MicroMsg.MCanvasView", "onDraw oom w:%d h:%d", Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
                    this.f311176f = null;
                }
            }
            Bitmap bitmap2 = this.f311176f;
            if (bitmap2 == null) {
                Log.m105918d("MicroMsg.MCanvasView", "bitmap is null.");
                return;
            }
            bitmap2.eraseColor(0);
            C110232f fVar = new C110232f(this.f311176f);
            mo113885e(fVar);
            try {
                canvas.drawBitmap(fVar.f329754a, 0.0f, 0.0f, (Paint) null);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MCanvasView", e, "", new Object[0]);
                mo113885e(canvas);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo148551g();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            try {
                this.f311176f = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Log.m105927v("MicroMsg.MCanvasView", "onSizeChanged, create a new bitmap(id : %s, w : %s, h : %s)", Integer.valueOf(hashCode()), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
            } catch (OutOfMemoryError unused) {
                Log.m105921e("MicroMsg.MCanvasView", "onSizeChanged oom w:%d h:%d", Integer.valueOf(i), Integer.valueOf(i2));
                this.f311176f = null;
            }
        }
    }

    public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f311175e.remove(onAttachStateChangeListener);
        super.removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public void setDrawActionReportable(C111179a aVar) {
        this.f311174d.getClass();
    }

    public void setSessionId(String str) {
        this.f311174d.f329727j = str;
    }

    public void setStartTime(long j) {
        C110222b bVar = this.f311174d;
        bVar.getClass();
        bVar.f329731q = j;
    }

    public void setTraceId(String str) {
        this.f311174d.f329733s = str;
    }

    public MCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo148550f();
    }

    public MCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo148550f();
    }
}
