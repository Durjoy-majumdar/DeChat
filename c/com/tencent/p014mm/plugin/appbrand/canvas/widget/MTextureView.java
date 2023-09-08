package com.tencent.p014mm.plugin.appbrand.canvas.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import eu3.C58834h;
import eu3.C97749e;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import pi0.C110222b;
import pi0.C110229d;
import ui0.C111179a;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.MTextureView */
public class MTextureView extends TextureView implements TextureView.SurfaceTextureListener, C81602a {

    /* renamed from: d */
    public final C110222b f311188d = new C110222b(this);

    /* renamed from: e */
    public final Set<View.OnAttachStateChangeListener> f311189e = new LinkedHashSet();

    /* renamed from: f */
    public volatile MMHandler f311190f;

    /* renamed from: g */
    public volatile Object f311191g = new Object();

    /* renamed from: h */
    public volatile boolean f311192h;

    /* renamed from: i */
    public Runnable f311193i = new C104786a();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.widget.MTextureView$a */
    public class C104786a implements Runnable {
        public C104786a() {
        }

        public void run() {
            Canvas lockCanvas;
            if (MTextureView.this.isAvailable() && (lockCanvas = MTextureView.this.lockCanvas()) != null) {
                synchronized (MTextureView.this.f311191g) {
                    MTextureView.this.f311192h = true;
                }
                lockCanvas.drawColor(-1);
                MTextureView.this.mo113885e(lockCanvas);
                MTextureView.this.unlockCanvasAndPost(lockCanvas);
                synchronized (MTextureView.this.f311191g) {
                    MTextureView.this.f311192h = false;
                    MTextureView.this.f311191g.notifyAll();
                }
            }
        }
    }

    public MTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo148600f();
    }

    /* renamed from: a */
    public void mo113881a(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f311188d.mo113881a(jSONArray, aVar);
    }

    public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (!this.f311189e.contains(onAttachStateChangeListener)) {
            this.f311189e.add(onAttachStateChangeListener);
            super.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* renamed from: b */
    public void mo113882b(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f311188d.mo113882b(jSONArray, aVar);
    }

    /* renamed from: c */
    public void mo113883c() {
        if (this.f311190f != null) {
            this.f311190f.removeCallbacks(this.f311193i);
            this.f311190f.post(this.f311193i);
        }
    }

    /* renamed from: d */
    public void mo113884d(Runnable runnable) {
        if (this.f311190f != null) {
            this.f311190f.post(runnable);
        }
    }

    /* renamed from: e */
    public boolean mo113885e(Canvas canvas) {
        return this.f311188d.mo113885e(canvas);
    }

    /* renamed from: f */
    public final void mo148600f() {
        setSurfaceTextureListener(this);
        ((Activity) getContext()).getWindow().setFlags(TPMediaCodecProfileLevel.HEVCMainTierLevel62, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        Paint paint = new Paint();
        paint.setColor(-1);
        this.f311188d.f329724g.f329749f = paint;
    }

    public C110229d getDrawContext() {
        return this.f311188d.f329724g;
    }

    public String getSessionId() {
        return this.f311188d.f329727j;
    }

    public String getTraceId() {
        return this.f311188d.f329733s;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105926v("MicroMsg.MTextureView", "onSurfaceTextureAvailable");
        if (this.f311190f == null) {
            int i3 = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("MTextureView#Rending-Thread", -19);
            a.start();
            this.f311190f = new MMHandler(a.getLooper());
        }
        Canvas lockCanvas = lockCanvas();
        if (lockCanvas != null) {
            lockCanvas.drawColor(-1);
            unlockCanvasAndPost(lockCanvas);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.m105926v("MicroMsg.MTextureView", "onSurfaceTextureDestroyed");
        this.f311190f.removeCallbacks(this.f311193i);
        this.f311190f.getLooper().quit();
        synchronized (this.f311191g) {
            if (this.f311192h) {
                try {
                    this.f311191g.wait(1000);
                } catch (InterruptedException e) {
                    Log.m105921e("MicroMsg.MTextureView", "await error : %s", android.util.Log.getStackTraceString(e));
                }
            }
        }
        this.f311190f = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105926v("MicroMsg.MTextureView", "onSurfaceTextureSizeChanged");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f311189e.remove(onAttachStateChangeListener);
        super.removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public void setDrawActionReportable(C111179a aVar) {
        this.f311188d.getClass();
    }

    public void setSessionId(String str) {
        this.f311188d.f329727j = str;
    }

    public void setStartTime(long j) {
        C110222b bVar = this.f311188d;
        bVar.getClass();
        bVar.f329731q = j;
    }

    public void setTraceId(String str) {
        this.f311188d.f329733s = str;
    }

    public MTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo148600f();
    }
}
