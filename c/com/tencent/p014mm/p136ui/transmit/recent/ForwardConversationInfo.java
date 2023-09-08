package com.tencent.p014mm.p136ui.transmit.recent;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/transmit/recent/ForwardConversationInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.transmit.recent.ForwardConversationInfo */
public final class ForwardConversationInfo implements Parcelable {
    public static final C74923a CREATOR = new C74923a((C8480h) null);

    /* renamed from: d */
    public final String f220300d;

    /* renamed from: e */
    public final String f220301e;

    /* renamed from: f */
    public final String f220302f;

    /* renamed from: g */
    public final String f220303g;

    /* renamed from: com.tencent.mm.ui.transmit.recent.ForwardConversationInfo$a */
    public static final class C74923a implements Parcelable.Creator<ForwardConversationInfo> {
        public C74923a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            String str = "";
            if (readString == null) {
                readString = str;
            }
            String readString2 = parcel.readString();
            if (readString2 == null) {
                readString2 = str;
            }
            String readString3 = parcel.readString();
            if (readString3 == null) {
                readString3 = str;
            }
            String readString4 = parcel.readString();
            if (readString4 != null) {
                str = readString4;
            }
            return new ForwardConversationInfo(readString, readString2, readString3, str);
        }

        public Object[] newArray(int i) {
            return new ForwardConversationInfo[i];
        }
    }

    public ForwardConversationInfo(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str2, "nickName");
        C87412m.m108594g(str3, "contactAlias");
        C87412m.m108594g(str4, "contactConRemark");
        this.f220300d = str;
        this.f220301e = str2;
        this.f220302f = str3;
        this.f220303g = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardConversationInfo)) {
            return false;
        }
        ForwardConversationInfo forwardConversationInfo = (ForwardConversationInfo) obj;
        return C87412m.m108589b(this.f220300d, forwardConversationInfo.f220300d) && C87412m.m108589b(this.f220301e, forwardConversationInfo.f220301e) && C87412m.m108589b(this.f220302f, forwardConversationInfo.f220302f) && C87412m.m108589b(this.f220303g, forwardConversationInfo.f220303g);
    }

    public int hashCode() {
        String str = this.f220300d;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f220301e.hashCode()) * 31) + this.f220302f.hashCode()) * 31) + this.f220303g.hashCode();
    }

    public String toString() {
        return "ForwardConversationInfo(userName=" + this.f220300d + ", nickName=" + this.f220301e + ", contactAlias=" + this.f220302f + ", contactConRemark=" + this.f220303g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f220300d);
        parcel.writeString(this.f220301e);
        parcel.writeString(this.f220302f);
        parcel.writeString(this.f220303g);
    }
}
