package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.AccessToken */
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR = new C85921a();

    /* renamed from: d */
    public final Date f250273d;

    /* renamed from: e */
    public final Set<String> f250274e;

    /* renamed from: f */
    public final Set<String> f250275f;

    /* renamed from: g */
    public final Set<String> f250276g;

    /* renamed from: h */
    public final String f250277h;

    /* renamed from: i */
    public final Date f250278i;

    /* renamed from: j */
    public final String f250279j;

    /* renamed from: n */
    public final String f250280n;

    /* renamed from: o */
    public final Date f250281o;

    /* renamed from: p */
    public final String f250282p;

    /* renamed from: com.tencent.mm.ui.mmfb.sdk.AccessToken$a */
    public class C85921a implements Parcelable.Creator {
        public Object createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }

        public Object[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    static {
        new Date(MAlarmHandler.NEXT_FIRE_INTERVAL);
        new Date();
    }

    public AccessToken(Parcel parcel) {
        this.f250273d = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f250274e = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f250275f = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f250276g = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f250277h = parcel.readString();
        this.f250278i = new Date(parcel.readLong());
        this.f250279j = parcel.readString();
        this.f250280n = parcel.readString();
        this.f250281o = new Date(parcel.readLong());
        this.f250282p = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.f250273d.equals(accessToken.f250273d) && this.f250274e.equals(accessToken.f250274e) && this.f250275f.equals(accessToken.f250275f) && this.f250276g.equals(accessToken.f250276g) && this.f250277h.equals(accessToken.f250277h) && this.f250278i.equals(accessToken.f250278i) && ((str = this.f250279j) != null ? str.equals(accessToken.f250279j) : accessToken.f250279j == null) && this.f250280n.equals(accessToken.f250280n) && this.f250281o.equals(accessToken.f250281o)) {
            String str2 = this.f250282p;
            String str3 = accessToken.f250282p;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
            } else if (str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((C1883v2.CTRL_INDEX + this.f250273d.hashCode()) * 31) + this.f250274e.hashCode()) * 31) + this.f250275f.hashCode()) * 31) + this.f250276g.hashCode()) * 31) + this.f250277h.hashCode()) * 31) + this.f250278i.hashCode()) * 31;
        String str = this.f250279j;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f250280n.hashCode()) * 31) + this.f250281o.hashCode()) * 31;
        String str2 = this.f250282p;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append("null");
        sb.append(" permissions:");
        if (this.f250274e == null) {
            sb.append("null");
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", this.f250274e));
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f250273d.getTime());
        parcel.writeStringList(new ArrayList(this.f250274e));
        parcel.writeStringList(new ArrayList(this.f250275f));
        parcel.writeStringList(new ArrayList(this.f250276g));
        parcel.writeString(this.f250277h);
        parcel.writeLong(this.f250278i.getTime());
        parcel.writeString(this.f250279j);
        parcel.writeString(this.f250280n);
        parcel.writeLong(this.f250281o.getTime());
        parcel.writeString(this.f250282p);
    }
}
