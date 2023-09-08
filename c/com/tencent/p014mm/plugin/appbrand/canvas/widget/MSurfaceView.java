package com.tencent.p014mm.plugin.appbrand.canvas.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import pi0.C110222b;
import pi0.C110229d;
import ui0.C111179a;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.MSurfaceView */
public class MSurfaceView extends SurfaceView implements SurfaceHolder.Callback, C81602a {

    /* renamed from: d */
    public final C110222b f311182d = new C110222b(this);

    /* renamed from: e */
    public final Set<View.OnAttachStateChangeListener> f311183e = new LinkedHashSet();

    /* renamed from: f */
    public SurfaceHolder f311184f;

    /* renamed from: g */
    public volatile boolean f311185g;

    /* renamed from: h */
    public MMHandler f311186h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.MSurfaceView$a */
    public class C104785a implements Runnable {
        public C104785a() {
        }

        public void run() {
            Canvas lockCanvas;
            if (!MSurfaceView.this.f311185g && (lockCanvas = MSurfaceView.this.f311184f.lockCanvas()) != null) {
                lockCanvas.drawColor(-1);
                MSurfaceView.this.mo113885e(lockCanvas);
                MSurfaceView.this.f311184f.unlockCanvasAndPost(lockCanvas);
            }
        }
    }

    public MSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo148586f();
    }

    /* renamed from: a */
    public void mo113881a(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f311182d.mo113881a(jSONArray, aVar);
    }

    public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (!this.f311183e.contains(onAttachStateChangeListener)) {
            this.f311183e.add(onAttachStateChangeListener);
            super.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* renamed from: b */
    public void mo113882b(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f311182d.mo113882b(jSONArray, aVar);
    }

    /* renamed from: c */
    public void mo113883c() {
        mo113884d(new C104785a());
    }

    /* renamed from: d */
    public void mo113884d(Runnable runnable) {
        MMHandler mMHandler = this.f311186h;
        if (mMHandler != null) {
            mMHandler.post(runnable);
        }
    }

    public void draw(Canvas canvas) {
        Log.m105925i("MicroMsg.MSurfaceView", "draw(%s)", Integer.valueOf(hashCode()));
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        super.draw(canvas);
    }

    /* renamed from: e */
    public boolean mo113885e(Canvas canvas) {
        return this.f311182d.mo113885e(canvas);
    }

    /* renamed from: f */
    public final void mo148586f() {
        SurfaceHolder holder = getHolder();
        this.f311184f = holder;
        holder.addCallback(this);
        this.f311184f.setFormat(-3);
        Paint paint = new Paint();
        paint.setColor(-1);
        this.f311182d.f329724g.f329749f = paint;
    }

    public C110229d getDrawContext() {
        return this.f311182d.f329724g;
    }

    public String getSessionId() {
        return this.f311182d.f329727j;
    }

    public String getTraceId() {
        return this.f311182d.f329733s;
    }

    public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f311183e.remove(onAttachStateChangeListener);
        super.removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public void setDrawActionReportable(C111179a aVar) {
        this.f311182d.getClass();
    }

    public void setSessionId(String str) {
        this.f311182d.f329727j = str;
    }

    public void setStartTime(long j) {
        C110222b bVar = this.f311182d;
        bVar.getClass();
        bVar.f329731q = j;
    }

    public void setTraceId(String str) {
        this.f311182d.f329733s = str;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.m105925i("MicroMsg.MSurfaceView", "surfaceChanged(%s)", Integer.valueOf(hashCode()));
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.m105925i("MicroMsg.MSurfaceView", "surfaceCreated(%s)", Integer.valueOf(hashCode()));
        this.f311185g = false;
        if (this.f311186h == null) {
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("MSurfaceView#Rending-Thread", -19);
            a.start();
            this.f311186h = new MMHandler(a.getLooper());
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.m105925i("MicroMsg.MSurfaceView", "surfaceDestroyed(%s)", Integer.valueOf(hashCode()));
        this.f311185g = true;
        this.f311186h.getLooper().quit();
        this.f311186h = null;
    }

    public MSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo148586f();
    }
}
