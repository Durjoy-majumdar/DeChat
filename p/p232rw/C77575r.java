package p232rw;

import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import gy3.C87412m;

/* renamed from: rw.r */
public final class C77575r {

    /* renamed from: a */
    public int f226146a;

    /* renamed from: b */
    public final int f226147b;

    /* renamed from: c */
    public final int f226148c;

    /* renamed from: d */
    public final C77574q f226149d;

    /* renamed from: e */
    public final Bundle f226150e;

    /* renamed from: f */
    public final RecordMediaReportInfo f226151f;

    public C77575r(int i, int i2, int i3, C77574q qVar, Bundle bundle, RecordMediaReportInfo recordMediaReportInfo) {
        this.f226146a = i;
        this.f226147b = i2;
        this.f226148c = i3;
        this.f226149d = qVar;
        this.f226150e = bundle;
        this.f226151f = recordMediaReportInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77575r)) {
            return false;
        }
        C77575r rVar = (C77575r) obj;
        return this.f226146a == rVar.f226146a && this.f226147b == rVar.f226147b && this.f226148c == rVar.f226148c && C87412m.m108589b(this.f226149d, rVar.f226149d) && C87412m.m108589b(this.f226150e, rVar.f226150e) && C87412m.m108589b(this.f226151f, rVar.f226151f);
    }

    public int hashCode() {
        int i = ((((this.f226146a * 31) + this.f226147b) * 31) + this.f226148c) * 31;
        C77574q qVar = this.f226149d;
        int i2 = 0;
        int hashCode = (i + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Bundle bundle = this.f226150e;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        RecordMediaReportInfo recordMediaReportInfo = this.f226151f;
        if (recordMediaReportInfo != null) {
            i2 = recordMediaReportInfo.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "MediaOptResult(requestCode=" + this.f226146a + ", resultCode=" + this.f226147b + ", optCode=" + this.f226148c + ", media=" + this.f226149d + ", extraData=" + this.f226150e + ", reportInfo=" + this.f226151f + ')';
    }
}
