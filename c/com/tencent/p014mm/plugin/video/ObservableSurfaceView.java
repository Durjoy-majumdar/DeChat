package com.tencent.p014mm.plugin.video;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import c43.C104296a;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105153k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import l33.C109247e;
import u13.C111103a;

/* renamed from: com.tencent.mm.plugin.video.ObservableSurfaceView */
public class ObservableSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: d */
    public SurfaceHolder f316396d;

    /* renamed from: e */
    public C111103a f316397e = null;

    /* renamed from: f */
    public boolean f316398f = false;

    /* renamed from: g */
    public boolean f316399g = false;

    public ObservableSurfaceView(Context context) {
        super(context);
        SurfaceHolder holder = getHolder();
        this.f316396d = holder;
        holder.addCallback(this);
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.f316396d;
    }

    public void setNeedSetType(boolean z) {
        this.f316399g = z;
        if (z) {
            this.f316396d.setType(3);
        }
    }

    public void setSurfaceChangeCallback(C111103a aVar) {
        this.f316397e = aVar;
        if (this.f316399g) {
            this.f316396d.setType(3);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder surfaceHolder2 = surfaceHolder;
        Log.m105918d("MicroMsg.ObservableSurfaceView", "surfaceChanged");
        try {
            this.f316396d.removeCallback(this);
        } catch (Exception unused) {
        }
        this.f316396d = surfaceHolder2;
        surfaceHolder2.addCallback(this);
        C111103a aVar = this.f316397e;
        if (aVar != null) {
            SurfaceHolder surfaceHolder3 = this.f316396d;
            C104296a aVar2 = (C104296a) aVar;
            Log.m105918d("MicroMsg.Voip.CaptureRender", "surfaceChange");
            boolean z = false;
            if (!aVar2.f308673n || surfaceHolder3.getSurface() == null) {
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.valueOf(aVar2.f308673n);
                if (surfaceHolder3.getSurface() == null) {
                    z = true;
                }
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = Integer.valueOf(Build.VERSION.SDK_INT);
                Log.m105921e("MicroMsg.Voip.CaptureRender", "surfaceChange failed, CameraOpen: %b, surface: %b, apiLevel: %s", objArr);
                return;
            }
            try {
                if (!aVar2.f308669g.f322938c) {
                    aVar2.f308669g.mo158263g((Camera.PreviewCallback) null);
                }
                aVar2.f308669g.mo158268l();
                Camera camera = aVar2.f308669g.f322936a;
                if (camera != null) {
                    camera.setPreviewDisplay(surfaceHolder3);
                }
                aVar2.mo145979g();
                aVar2.f308669g.mo158267k();
            } catch (Exception e) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(159, 0, 1, false);
                nVar.idkeyStat(159, 2, 1, false);
                Log.m105920e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + e.getMessage());
                aVar2.f308668f = 1;
            }
            if (aVar2.f308682w) {
                aVar2.mo145980h();
                aVar2.f308682w = false;
            }
            if (!(aVar2 instanceof C105153k)) {
                C109247e.xx0().mo152591E(aVar2.f308668f);
            }
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f316398f = true;
        C111103a aVar = this.f316397e;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f316398f = false;
    }

    public ObservableSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SurfaceHolder holder = getHolder();
        this.f316396d = holder;
        holder.addCallback(this);
    }

    public ObservableSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SurfaceHolder holder = getHolder();
        this.f316396d = holder;
        holder.addCallback(this);
    }
}
