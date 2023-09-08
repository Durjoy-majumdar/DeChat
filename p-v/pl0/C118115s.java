package pl0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pl0.s */
public class C118115s extends LinearLayout implements C118120w {

    /* renamed from: d */
    public Context f353103d;

    /* renamed from: e */
    public Marker f353104e;

    /* renamed from: f */
    public double f353105f = -1.0d;

    /* renamed from: g */
    public double f353106g = -1.0d;

    /* renamed from: h */
    public double f353107h = -1.0d;

    /* renamed from: i */
    public double f353108i = -1.0d;

    /* renamed from: j */
    public float f353109j = 900.0f;

    /* renamed from: n */
    public float f353110n = 900.0f;

    /* renamed from: o */
    public float f353111o = 0.0f;

    /* renamed from: p */
    public boolean f353112p;

    public C118115s(Context context) {
        super(context);
        this.f353103d = context;
        ((ImageView) View.inflate(context, C0966R.C0971layout.f7120yw, this).findViewById(C0966R.C0970id.kt6)).requestFocus();
    }

    private float getHeading() {
        return this.f353112p ? this.f353109j : this.f353111o;
    }

    /* renamed from: Y */
    public void mo182828Y(float f, float f2) {
        this.f353111o = f2;
        float heading = getHeading();
        if (this.f353104e != null) {
            Log.m105927v("MicroMsg.AppbrandMapLocationPoint", "updateRotation rotation:%f", Float.valueOf(heading));
            this.f353104e.setRotation(heading);
        }
    }

    public double getLatitude() {
        return this.f353105f;
    }

    public double getLongitude() {
        return this.f353106g;
    }

    public Marker getRealMarker() {
        return this.f353104e;
    }
}
