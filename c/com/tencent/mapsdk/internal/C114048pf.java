package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;

/* renamed from: com.tencent.mapsdk.internal.pf */
public final class C114048pf extends AccessibleTouchItem {

    /* renamed from: a */
    private C113520ao f341239a;

    /* renamed from: b */
    private C114322sx f341240b;

    public C114048pf(C114322sx sxVar, C113520ao aoVar) {
        this.f341240b = sxVar;
        this.f341239a = aoVar;
    }

    /* renamed from: a */
    private static Rect m158766a(Rect rect) {
        if (rect == null) {
            return null;
        }
        int i = rect.left;
        int i2 = rect.right;
        int i3 = rect.top;
        int i4 = rect.bottom;
        int i5 = (i2 + i) / 2;
        int i6 = (i3 + i4) / 2;
        int i7 = i4 - i3;
        if (((float) (i2 - i)) < C113798hb.m157097n() * 40.0f) {
            float f = (float) i5;
            int n = (int) (f - (C113798hb.m157097n() * 20.0f));
            i2 = (int) (f + (C113798hb.m157097n() * 20.0f));
            i = n;
        }
        if (((float) i7) < C113798hb.m157097n() * 40.0f) {
            float f2 = (float) i6;
            i3 = (int) (f2 - (C113798hb.m157097n() * 20.0f));
            i4 = (int) (f2 + (C113798hb.m157097n() * 20.0f));
        }
        return new Rect(i, i3, i2, i4);
    }

    public final Rect getBounds() {
        Rect i;
        C113520ao aoVar = this.f341239a;
        if (aoVar == null || (i = aoVar.mo171382i()) == null) {
            return null;
        }
        int i2 = i.left;
        int i3 = i.right;
        int i4 = i.top;
        int i5 = i.bottom;
        int i6 = (i3 + i2) / 2;
        int i7 = (i4 + i5) / 2;
        int i8 = i5 - i4;
        if (((float) (i3 - i2)) < C113798hb.m157097n() * 40.0f) {
            float f = (float) i6;
            int n = (int) (f - (C113798hb.m157097n() * 20.0f));
            i3 = (int) (f + (C113798hb.m157097n() * 20.0f));
            i2 = n;
        }
        if (((float) i8) < C113798hb.m157097n() * 40.0f) {
            float f2 = (float) i7;
            i4 = (int) (f2 - (C113798hb.m157097n() * 20.0f));
            i5 = (int) (f2 + (C113798hb.m157097n() * 20.0f));
        }
        return new Rect(i2, i4, i3, i5);
    }

    public final String getContentDescription() {
        C113520ao aoVar = this.f341239a;
        if (aoVar == null) {
            return null;
        }
        return aoVar.getContentDescription();
    }

    public final void onClick() {
        C114322sx sxVar = this.f341240b;
        if (sxVar != null) {
            TencentMap.OnMarkerClickListener onMarkerClickListener = sxVar.f342598y;
            C113520ao aoVar = this.f341239a;
            if (aoVar != null && onMarkerClickListener != null) {
                onMarkerClickListener.onMarkerClick(aoVar);
            }
        }
    }
}
