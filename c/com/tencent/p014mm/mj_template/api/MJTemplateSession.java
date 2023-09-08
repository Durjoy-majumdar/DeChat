package com.tencent.p014mm.mj_template.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import te3.pr4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/api/MJTemplateSession;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.mj_template.api.MJTemplateSession */
public final class MJTemplateSession implements Parcelable {
    public static final Parcelable.Creator<MJTemplateSession> CREATOR = new C55281a();

    /* renamed from: d */
    public final byte[] f157465d;

    /* renamed from: e */
    public final String f157466e;

    /* renamed from: f */
    public final C13601g f157467f;

    /* renamed from: com.tencent.mm.mj_template.api.MJTemplateSession$a */
    public static final class C55281a implements Parcelable.Creator<MJTemplateSession> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MJTemplateSession(parcel.createByteArray(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new MJTemplateSession[i];
        }
    }

    /* renamed from: com.tencent.mm.mj_template.api.MJTemplateSession$b */
    public static final class C55282b extends C87413o implements C32224a<pr4> {

        /* renamed from: d */
        public final /* synthetic */ MJTemplateSession f157468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55282b(MJTemplateSession mJTemplateSession) {
            super(0);
            this.f157468d = mJTemplateSession;
        }

        public Object invoke() {
            pr4 pr4 = new pr4();
            try {
                pr4.parseFrom(this.f157468d.f157465d);
            } catch (Exception e) {
                Log.m105921e("MJTemplate", "parse template info error", e);
            }
            return pr4;
        }
    }

    public MJTemplateSession(byte[] bArr, String str) {
        C87412m.m108594g(bArr, "templatePb");
        C87412m.m108594g(str, "musicId");
        this.f157465d = bArr;
        this.f157466e = str;
        this.f157467f = C36568h.m40985a(new C55282b(this));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MJTemplateSession)) {
            return false;
        }
        MJTemplateSession mJTemplateSession = (MJTemplateSession) obj;
        return C87412m.m108589b(this.f157465d, mJTemplateSession.f157465d) && C87412m.m108589b(this.f157466e, mJTemplateSession.f157466e);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f157465d) * 31) + this.f157466e.hashCode();
    }

    public String toString() {
        return "MJTemplateSession(templatePb=" + Arrays.toString(this.f157465d) + ", musicId=" + this.f157466e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeByteArray(this.f157465d);
        parcel.writeString(this.f157466e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MJTemplateSession(byte[] bArr, String str, int i, C8480h hVar) {
        this(bArr, (i & 2) != 0 ? "" : str);
    }
}
