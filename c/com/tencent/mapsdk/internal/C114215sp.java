package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList;

/* renamed from: com.tencent.mapsdk.internal.sp */
public final class C114215sp extends Handler {

    /* renamed from: a */
    public static final int f342004a = 0;

    /* renamed from: b */
    public static final int f342005b = 1;

    /* renamed from: c */
    public static final int f342006c = 2;

    /* renamed from: d */
    private final C114322sx f342007d;

    public C114215sp(C114322sx sxVar, Looper looper) {
        super(looper);
        this.f342007d = sxVar;
        C113896kq.m157663b(C0950kp.f2274T);
    }

    public final void handleMessage(Message message) {
        M m;
        CameraPosition a;
        super.handleMessage(message);
        C114322sx sxVar = this.f342007d;
        if (sxVar != null && (m = sxVar.f339878e_) != null && ((VectorMap) m).mo171703a() && (a = sxVar.mo171551a()) != null) {
            if (message.what == 2) {
                sxVar.mo172998aa();
                C113896kq.m157671d(C0950kp.f2274T);
            }
            int i = message.what;
            if (i == 0) {
                sxVar.onCameraChange(a);
            } else if (i == 1) {
                sxVar.f342644aA = true;
                TencentMapGestureListenerList tencentMapGestureListenerList = sxVar.f342656ax;
                if (tencentMapGestureListenerList != null && sxVar.f342657ay) {
                    tencentMapGestureListenerList.onMapStable();
                }
                sxVar.onCameraChangeFinished(a);
            }
            sxVar.mo172977V();
        }
    }
}
