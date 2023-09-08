package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import s90.C48300n;
import te3.C49399fa;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/MpVideoDataParcelable;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable */
public final class MpVideoDataParcelable implements Parcelable {
    public static final C44062a CREATOR = new C44062a((C8480h) null);

    /* renamed from: d */
    public String f119396d;

    /* renamed from: e */
    public String f119397e;

    /* renamed from: f */
    public String f119398f;

    /* renamed from: g */
    public int f119399g;

    /* renamed from: h */
    public C49399fa f119400h;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable$a */
    public static final class C44062a implements Parcelable.Creator<MpVideoDataParcelable> {
        public C44062a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new MpVideoDataParcelable(parcel);
        }

        public Object[] newArray(int i) {
            return new MpVideoDataParcelable[i];
        }
    }

    public MpVideoDataParcelable() {
    }

    public MpVideoDataParcelable(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        this.f119396d = parcel.readString();
        this.f119398f = parcel.readString();
        int readInt = parcel.readInt();
        this.f119399g = readInt;
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            C48300n nVar = new C48300n();
            nVar.parseFrom(bArr);
            this.f119400h = nVar;
        }
        this.f119397e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeString(this.f119396d);
        parcel.writeString(this.f119398f);
        C49399fa faVar = this.f119400h;
        byte[] byteArray = faVar != null ? faVar.toByteArray() : null;
        if (byteArray != null) {
            if (!(byteArray.length == 0)) {
                int length = byteArray.length;
                this.f119399g = length;
                parcel.writeInt(length);
                parcel.writeByteArray(byteArray);
                parcel.writeString(this.f119397e);
            }
        }
        parcel.writeInt(this.f119399g);
        parcel.writeString(this.f119397e);
    }
}
