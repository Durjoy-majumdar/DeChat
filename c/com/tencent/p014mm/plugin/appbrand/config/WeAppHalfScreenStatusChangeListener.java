package com.tencent.p014mm.plugin.appbrand.config;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "Landroid/os/Parcelable;", "data-model_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener */
public class WeAppHalfScreenStatusChangeListener implements Parcelable {
    public static final Parcelable.Creator<WeAppHalfScreenStatusChangeListener> CREATOR = new C81621a();

    /* renamed from: d */
    public boolean f239427d;

    /* renamed from: e */
    public ResultReceiver f239428e;

    /* renamed from: com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener$a */
    public static final class C81621a implements Parcelable.Creator<WeAppHalfScreenStatusChangeListener> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            boolean z = false;
            WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = new WeAppHalfScreenStatusChangeListener(false, 1, (C8480h) null);
            weAppHalfScreenStatusChangeListener.f239428e = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 1) {
                z = true;
            }
            weAppHalfScreenStatusChangeListener.f239427d = z;
            return weAppHalfScreenStatusChangeListener;
        }

        public Object[] newArray(int i) {
            return new WeAppHalfScreenStatusChangeListener[i];
        }
    }

    public WeAppHalfScreenStatusChangeListener() {
        this(false, 1, (C8480h) null);
    }

    public WeAppHalfScreenStatusChangeListener(boolean z) {
        this.f239427d = z;
        this.f239428e = new WeAppHalfScreenStatusChangeListener$resultReceiver$1(this, new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public void mo77350b() {
    }

    /* renamed from: c */
    public void mo77351c() {
    }

    /* renamed from: d */
    public void mo77352d(boolean z) {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo77353e(boolean z) {
    }

    /* renamed from: f */
    public void mo77354f(HeightInfo heightInfo) {
        C87412m.m108594g(heightInfo, "info");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        ResultReceiver resultReceiver = this.f239428e;
        if (resultReceiver != null) {
            resultReceiver.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f239427d ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WeAppHalfScreenStatusChangeListener(boolean z, int i, C8480h hVar) {
        this((i & 1) != 0 ? false : z);
    }
}
