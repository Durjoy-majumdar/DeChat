package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask$TaskParams;", "Lcom/tencent/mm/plugin/mmsight/SightParams;", "<init>", "()V", "TaskParams", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask */
public final class GetSightParamsIPCTask implements C80916r<TaskParams, SightParams> {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask$TaskParams;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask$TaskParams */
    public static final class TaskParams implements Parcelable {
        public static final C82645a CREATOR = new C82645a((C8480h) null);

        /* renamed from: d */
        public final int f241805d;

        /* renamed from: e */
        public final int f241806e;

        /* renamed from: f */
        public final boolean f241807f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask$TaskParams$a */
        public static final class C82645a implements Parcelable.Creator<TaskParams> {
            public C82645a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
                return new TaskParams(parcel.readInt(), parcel.readInt(), parcel.readByte() != 0);
            }

            public Object[] newArray(int i) {
                return new TaskParams[i];
            }
        }

        public TaskParams(int i, int i2, boolean z) {
            this.f241805d = i;
            this.f241806e = i2;
            this.f241807f = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskParams)) {
                return false;
            }
            TaskParams taskParams = (TaskParams) obj;
            return this.f241805d == taskParams.f241805d && this.f241806e == taskParams.f241806e && this.f241807f == taskParams.f241807f;
        }

        public int hashCode() {
            int i = ((this.f241805d * 31) + this.f241806e) * 31;
            boolean z = this.f241807f;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "TaskParams(sightMode=" + this.f241805d + ", maxDuration=" + this.f241806e + ", isFront=" + this.f241807f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeInt(this.f241805d);
            parcel.writeInt(this.f241806e);
            parcel.writeByte(this.f241807f ? (byte) 1 : 0);
        }
    }

    public Object invoke(Object obj) {
        TaskParams taskParams = (TaskParams) obj;
        C87412m.m108594g(taskParams, "data");
        String str = "microMsg_" + Util.nowMilliSecond();
        String str2 = C112760b.m154240l() + "microMsg." + str + ".mp4";
        String str3 = C112760b.m154240l() + "microMsg." + str + ".jpeg";
        int i = taskParams.f241806e;
        int i2 = 2;
        if (taskParams.f241805d == 2) {
            SightParams sightParams = new SightParams(3, 2);
            sightParams.f248456j = C112760b.m154240l();
            sightParams.f248455i = "microMsg." + System.currentTimeMillis() + ".jpg";
            return sightParams;
        }
        SightParams sightParams2 = new SightParams(3, 1);
        if (taskParams.f241807f) {
            i2 = 1;
        }
        sightParams2.f248451e = i2;
        sightParams2.f248450d = taskParams.f241805d;
        if (sightParams2.f248452f == null) {
            sightParams2.f248452f = new VideoTransPara();
        }
        sightParams2.f248452f.f267170h = i;
        sightParams2.f248459p = false;
        sightParams2.mo118479a(str, str2, str3, AndroidMediaUtil.getSysCameraDirPath() + "capture" + Util.nowMilliSecond() + ".jpg");
        return sightParams2;
    }
}
