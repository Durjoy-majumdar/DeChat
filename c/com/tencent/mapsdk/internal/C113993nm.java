package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay;

/* renamed from: com.tencent.mapsdk.internal.nm */
public final class C113993nm extends C113970ms<C113994nn> implements C113974mv, IntersectionOverlay {
    public C113993nm(C113992nl nlVar, C113994nn nnVar) {
        super(nlVar, nnVar);
    }

    /* renamed from: a */
    public final int mo172502a() {
        return ((C113992nl) this.f340955c).mo172547a(this.f340954b);
    }

    public final void setBounds(Rect rect) {
        ((C113994nn) this.f340956d).setBounds(rect);
        mo172478a(this.f340956d);
    }

    public final void setDarkMode(boolean z) {
        ((C113994nn) this.f340956d).enableDarkMode(z);
        mo172478a(this.f340956d);
    }

    public final void setData(byte[] bArr) {
        if (bArr != null) {
            ((C113994nn) this.f340956d).setData(bArr);
            mo172478a(this.f340956d);
        }
    }

    public final void setDistance(int i) {
        ((C113994nn) this.f340956d).setDistance(i);
        mo172478a(this.f340956d);
    }

    public final void setRoundedCorner(boolean z) {
        ((C113994nn) this.f340956d).enableRoundedCorner(z);
        mo172478a(this.f340956d);
    }

    public final void setVisibility(boolean z) {
        ((C113994nn) this.f340956d).setVisibility(z);
        mo172478a(this.f340956d);
    }
}
