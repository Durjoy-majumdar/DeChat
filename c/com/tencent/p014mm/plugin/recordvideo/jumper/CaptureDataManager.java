package com.tencent.p014mm.plugin.recordvideo.jumper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.mediabasic.data.MediaResultInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager */
public class CaptureDataManager {

    /* renamed from: c */
    public static CaptureDataManager f272890c = new CaptureDataManager();

    /* renamed from: a */
    public C94403b f272891a = null;

    /* renamed from: b */
    public Bundle f272892b = new Bundle();

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$a */
    public interface C94402a {
        /* renamed from: a */
        void mo129803a();
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$b */
    public interface C94403b {
        /* renamed from: U5 */
        void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle);

        /* renamed from: i2 */
        void mo4197i2(Context context, CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle);

        /* renamed from: l1 */
        boolean mo4198l1(Context context, Bundle bundle, C94402a aVar);
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$c */
    public static class C94404c implements C94403b {
        /* renamed from: U5 */
        public void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle) {
        }
    }

    /* renamed from: a */
    public void mo129794a(Context context, CaptureVideoNormalModel captureVideoNormalModel) {
        C94403b bVar = this.f272891a;
        if (bVar == null || context == null) {
            Intent intent = new Intent();
            intent.putExtra("key_extra_data", this.f272892b);
            intent.putExtra("KSEGMENTMEDIAINFO", captureVideoNormalModel);
            Activity activity = (Activity) context;
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        bVar.mo4197i2(context, captureVideoNormalModel, new Bundle(this.f272892b));
        this.f272892b.clear();
    }

    /* renamed from: b */
    public void mo129795b(Context context, int i, MediaResultInfo mediaResultInfo) {
        Intent intent = new Intent();
        intent.putExtra("media_basic_extra_bundle", this.f272892b);
        intent.putExtra("media_basic_out_model", mediaResultInfo);
        Activity activity = (Activity) context;
        activity.setResult(i, intent);
        activity.finish();
    }

    /* renamed from: c */
    public Bundle mo129796c() {
        return this.f272892b;
    }

    /* renamed from: d */
    public void mo129797d(boolean z, RecordMediaReportInfo recordMediaReportInfo) {
        C94403b bVar = this.f272891a;
        if (bVar != null) {
            bVar.mo79064U5(z, recordMediaReportInfo, this.f272892b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel */
    public static class CaptureVideoNormalModel implements Parcelable {
        public static final Parcelable.Creator<CaptureVideoNormalModel> CREATOR = new C94401a();

        /* renamed from: d */
        public Boolean f272893d;

        /* renamed from: e */
        public String f272894e;

        /* renamed from: f */
        public String f272895f;

        /* renamed from: g */
        public Long f272896g;

        /* renamed from: h */
        public Boolean f272897h;

        /* renamed from: i */
        public RecordMediaReportInfo f272898i;

        /* renamed from: j */
        public List<String> f272899j = new ArrayList();

        /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel$a */
        public class C94401a implements Parcelable.Creator<CaptureVideoNormalModel> {
            public Object createFromParcel(Parcel parcel) {
                return new CaptureVideoNormalModel(parcel);
            }

            public Object[] newArray(int i) {
                return new CaptureVideoNormalModel[i];
            }
        }

        public CaptureVideoNormalModel(Boolean bool, String str, String str2, Long l, Boolean bool2, RecordMediaReportInfo recordMediaReportInfo) {
            this.f272893d = bool;
            this.f272894e = str;
            this.f272895f = str2;
            this.f272896g = l;
            this.f272897h = bool2;
            this.f272898i = recordMediaReportInfo;
        }

        /* renamed from: a */
        public RecordMediaReportInfo mo129798a() {
            RecordMediaReportInfo recordMediaReportInfo = this.f272898i;
            return recordMediaReportInfo == null ? new RecordMediaReportInfo() : recordMediaReportInfo;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeValue(this.f272893d);
            parcel.writeString(this.f272894e);
            parcel.writeString(this.f272895f);
            parcel.writeValue(this.f272896g);
            parcel.writeValue(this.f272897h);
            parcel.writeParcelable(this.f272898i, i);
            parcel.writeList(this.f272899j);
        }

        public CaptureVideoNormalModel(Parcel parcel) {
            Class<Boolean> cls = Boolean.class;
            this.f272893d = (Boolean) parcel.readValue(cls.getClassLoader());
            this.f272894e = parcel.readString();
            this.f272895f = parcel.readString();
            this.f272896g = (Long) parcel.readValue(Long.class.getClassLoader());
            this.f272897h = (Boolean) parcel.readValue(cls.getClassLoader());
            this.f272898i = (RecordMediaReportInfo) parcel.readParcelable(RecordMediaReportInfo.class.getClassLoader());
            this.f272899j = parcel.readArrayList(ArrayList.class.getClassLoader());
        }
    }
}
