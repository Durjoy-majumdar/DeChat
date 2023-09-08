package com.tencent.luggage.sdk.launching;

import android.os.Parcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C90422jy;

/* renamed from: com.tencent.luggage.sdk.launching.h */
public enum C80247h {
    LEGACY(0),
    PRE_RENDER(1),
    HEADLESS(2);
    

    /* renamed from: d */
    public final int f234929d;

    /* access modifiers changed from: public */
    C80247h(int i) {
        this.f234929d = i;
    }

    /* renamed from: c */
    public static C80247h m97636c(Parcel parcel) {
        int readInt = parcel.readInt();
        for (C80247h hVar : values()) {
            if (readInt == hVar.ordinal()) {
                return hVar;
            }
        }
        Log.m105921e("Luggage.WxaColdStartMode", "readFromParcel get unrecognized ordinal %d", Integer.valueOf(readInt));
        return LEGACY;
    }

    /* renamed from: a */
    public void mo111350a(C90422jy jyVar) {
        jyVar.f259640e = false;
        jyVar.f259642g = 0;
        if (PRE_RENDER == this) {
            jyVar.f259640e = true;
        } else if (HEADLESS == this) {
            jyVar.f259642g = 1;
        }
    }

    /* renamed from: b */
    public boolean mo111351b() {
        return this == PRE_RENDER || this == HEADLESS;
    }
}
