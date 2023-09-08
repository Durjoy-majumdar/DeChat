package com.tencent.p014mm.plugin.appbrand.jsapi.op_report;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent */
public final class AppBrandOpReportLogic$AppBrandOnOpReportStartEvent implements Parcelable {
    public static final Parcelable.Creator<AppBrandOpReportLogic$AppBrandOnOpReportStartEvent> CREATOR = new C82868a();

    /* renamed from: d */
    public String f242312d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent$a */
    public class C82868a implements Parcelable.Creator<AppBrandOpReportLogic$AppBrandOnOpReportStartEvent> {
        public Object createFromParcel(Parcel parcel) {
            return new AppBrandOpReportLogic$AppBrandOnOpReportStartEvent(parcel);
        }

        public Object[] newArray(int i) {
            return new AppBrandOpReportLogic$AppBrandOnOpReportStartEvent[i];
        }
    }

    public AppBrandOpReportLogic$AppBrandOnOpReportStartEvent() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242312d);
    }

    public AppBrandOpReportLogic$AppBrandOnOpReportStartEvent(Parcel parcel) {
        this.f242312d = parcel.readString();
    }
}
