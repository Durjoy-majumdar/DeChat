package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.charset.Charset;
import jm2.C46562a;
import tm0.C14044y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiSetClipboardDataWC */
public class JsApiSetClipboardDataWC extends C14044y<C81925i2> {
    /* renamed from: w */
    public void mo13452w(C82381f fVar, String str) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (!Util.isNullOrNil(str)) {
            String appId = i2Var.getAppId();
            C83849m0 Z = i2Var.getRuntime().mo113042Z();
            if (Z != null && Z.getCurrentPage() != null) {
                new ReportClipBoardTask(appId, Z.getCurrentPage().getCurrentUrl(), str.getBytes(Charset.forName("UTF-8")).length).mo114395c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiSetClipboardDataWC$ReportClipBoardTask */
    public static class ReportClipBoardTask extends MainProcessTask {
        public static final Parcelable.Creator<ReportClipBoardTask> CREATOR = new C82002a();

        /* renamed from: f */
        public String f240445f;

        /* renamed from: g */
        public String f240446g;

        /* renamed from: h */
        public int f240447h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiSetClipboardDataWC$ReportClipBoardTask$a */
        public class C82002a implements Parcelable.Creator<ReportClipBoardTask> {
            public Object createFromParcel(Parcel parcel) {
                return new ReportClipBoardTask(parcel);
            }

            public Object[] newArray(int i) {
                return new ReportClipBoardTask[i];
            }
        }

        public ReportClipBoardTask(String str, String str2, int i) {
            this.f240445f = str;
            this.f240446g = str2;
            this.f240447h = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240445f = parcel.readString();
            this.f240446g = parcel.readString();
            this.f240447h = parcel.readInt();
        }

        /* renamed from: j */
        public void mo1553j() {
            C46562a.INSTANCE.mo71687xz(5, this.f240447h, this.f240445f, this.f240446g);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240445f);
            parcel.writeString(this.f240446g);
            parcel.writeInt(this.f240447h);
        }

        public ReportClipBoardTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
