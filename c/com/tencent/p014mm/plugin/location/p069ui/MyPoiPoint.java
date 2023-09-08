package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import cc0.C92411b;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p702ts.C78085c;
import y22.C118913e;

/* renamed from: com.tencent.mm.plugin.location.ui.MyPoiPoint */
public class MyPoiPoint extends FrameLayout {

    /* renamed from: d */
    public C118913e f346353d;

    /* renamed from: e */
    public C92411b f346354e;

    /* renamed from: f */
    public boolean f346355f = false;

    /* renamed from: g */
    public Circle f346356g;

    /* renamed from: h */
    public C92411b.C92412a f346357h = new C115516a();

    /* renamed from: com.tencent.mm.plugin.location.ui.MyPoiPoint$a */
    public class C115516a implements C92411b.C92412a {
        public C115516a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            float f3 = f;
            float f4 = f2;
            if (!z) {
                return false;
            }
            Log.m105919d("MicroMsg.MyPoiPoint", "new location comes! lat : %f, lng: %f, accuracy: %f.", Float.valueOf(f2), Float.valueOf(f), Double.valueOf(d2));
            MyPoiPoint myPoiPoint = MyPoiPoint.this;
            C118913e eVar = myPoiPoint.f346353d;
            if (eVar != null) {
                Circle circle = myPoiPoint.f346356g;
                if (circle != null) {
                    circle.setCenter(new LatLng((double) f4, (double) f3));
                    MyPoiPoint.this.f346356g.setRadius(d2);
                } else {
                    double d4 = d2;
                    myPoiPoint.f346356g = eVar.drawAccuracyCircle((double) f4, (double) f3, d2);
                }
                MyPoiPoint myPoiPoint2 = MyPoiPoint.this;
                if (!myPoiPoint2.f346355f) {
                    myPoiPoint2.f346355f = true;
                    myPoiPoint2.f346353d.addPinView(myPoiPoint2, (double) f4, (double) f3);
                } else {
                    myPoiPoint2.f346353d.updateLocaitonPinLayout(myPoiPoint2, (double) f4, (double) f3);
                }
            }
            return true;
        }
    }

    public MyPoiPoint(Context context, C118913e eVar) {
        super(context);
        mo175504a(context);
        this.f346353d = eVar;
    }

    /* renamed from: a */
    public final void mo175504a(Context context) {
        LayoutInflater.from(context).inflate(C0966R.C0971layout.bnb, this, true);
        this.f346354e = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        Log.m105918d("MicroMsg.MyPoiPoint", "enableLocation");
        this.f346354e.mo126412f(this.f346357h, true);
    }

    public void setIMapView(C118913e eVar) {
        this.f346353d = eVar;
    }

    public MyPoiPoint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo175504a(context);
    }

    public MyPoiPoint(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo175504a(context);
    }
}
