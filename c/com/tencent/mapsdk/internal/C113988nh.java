package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.map.lib.models.GroundOverlayInfo;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;

/* renamed from: com.tencent.mapsdk.internal.nh */
public class C113988nh extends GroundOverlayInfo implements C113973mu {

    /* renamed from: a */
    public GroundOverlayOptions f340979a;

    public C113988nh(Context context, GroundOverlayOptions groundOverlayOptions) {
        if (groundOverlayOptions != null) {
            this.f340979a = groundOverlayOptions;
            BitmapDescriptor bitmap = groundOverlayOptions.getBitmap();
            if (bitmap != null) {
                Bitmap bitmap2 = bitmap.getBitmap(context);
                if (bitmap2 != null) {
                    this.mBitmapWidth = bitmap2.getWidth();
                    this.mBitmapHeight = bitmap2.getHeight();
                }
                this.mBitmap = bitmap2;
            }
            this.mAlpha = groundOverlayOptions.getAlpha();
            this.mVisibility = groundOverlayOptions.isVisible();
            this.mLevel = groundOverlayOptions.getLevel();
            this.mZIndex = groundOverlayOptions.getZIndex();
            if (groundOverlayOptions.getPosition() != null) {
                mo172546a();
            }
            if (groundOverlayOptions.getLatLngBounds() != null) {
                LatLngBounds latLngBounds = groundOverlayOptions.getLatLngBounds();
                Parcel obtain = Parcel.obtain();
                obtain.writeParcelable(latLngBounds, 0);
                obtain.setDataPosition(0);
                Parcelable readParcelable = obtain.readParcelable(latLngBounds.getClass().getClassLoader());
                obtain.recycle();
                this.mLatLngBounds = (LatLngBounds) readParcelable;
            }
        }
    }

    /* renamed from: b */
    private GroundOverlayOptions m158353b() {
        return this.f340979a;
    }

    /* renamed from: a */
    public final void mo172546a() {
        if (this.f340979a.getPosition() != null) {
            float max = Math.max(0.0f, Math.min(1.0f, this.f340979a.getAnchorU()));
            float max2 = Math.max(0.0f, Math.min(1.0f, this.f340979a.getAnchorV()));
            double pow = Math.pow(2.0d, (double) (20.0f - Math.max(3.0f, Math.min(22.0f, this.f340979a.getZoom()))));
            C113745fz fzVar = new C113745fz(2.68435456E8d);
            C113732fo c = fzVar.mo172119c(this.f340979a.getPosition());
            this.mLatLngBounds = LatLngBounds.builder().include(fzVar.mo172118b(new C113732fo(c.f340215a - (((double) (((float) this.mBitmapWidth) * max)) * pow), c.f340216b - (((double) (((float) this.mBitmapHeight) * max2)) * pow)))).include(fzVar.mo172118b(new C113732fo(c.f340215a + (((double) this.mBitmapWidth) * (1.0d - ((double) max)) * pow), c.f340216b + (((double) this.mBitmapHeight) * (1.0d - ((double) max2)) * pow)))).build();
        }
    }
}
