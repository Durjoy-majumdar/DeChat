package com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/networking/lib_server_mode/WxAppLibServerMode;", "Landroid/os/Parcelable;", "b", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode */
public final class WxAppLibServerMode implements Parcelable {
    public static final Parcelable.Creator<WxAppLibServerMode> CREATOR = new C83708a();

    /* renamed from: f */
    public static final WxAppLibServerMode f244338f = new WxAppLibServerMode(false, (C83709b) null, 2, (C8480h) null);

    /* renamed from: d */
    public final boolean f244339d;

    /* renamed from: e */
    public final C83709b f244340e;

    /* renamed from: com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode$a */
    public static final class C83708a implements Parcelable.Creator<WxAppLibServerMode> {
        public Object createFromParcel(Parcel parcel) {
            C83709b bVar;
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            boolean z = parcel.readByte() > 0;
            int readInt = parcel.readInt();
            C83709b[] values = C83709b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i];
                if (bVar.f244344d == readInt) {
                    break;
                }
                i++;
            }
            if (bVar == null) {
                bVar = C83709b.Guest;
            }
            return new WxAppLibServerMode(z, bVar);
        }

        public Object[] newArray(int i) {
            return new WxAppLibServerMode[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode$b */
    public enum C83709b {
        Offline(0),
        Guest(1);
        

        /* renamed from: d */
        public final int f244344d;

        /* access modifiers changed from: public */
        C83709b(int i) {
            this.f244344d = i;
        }
    }

    public WxAppLibServerMode(boolean z) {
        this(z, (C83709b) null, 2, (C8480h) null);
    }

    public WxAppLibServerMode(boolean z, C83709b bVar) {
        C87412m.m108594g(bVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f244339d = z;
        this.f244340e = bVar;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxAppLibServerMode)) {
            return false;
        }
        WxAppLibServerMode wxAppLibServerMode = (WxAppLibServerMode) obj;
        return this.f244339d == wxAppLibServerMode.f244339d && this.f244340e == wxAppLibServerMode.f244340e;
    }

    public int hashCode() {
        boolean z = this.f244339d;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.f244340e.hashCode();
    }

    public String toString() {
        return "WxAppLibServerMode(switch:" + this.f244339d + ", reason:" + this.f244340e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeByte(this.f244339d ? (byte) 1 : 0);
        }
        if (parcel != null) {
            parcel.writeInt(this.f244340e.f244344d);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WxAppLibServerMode(boolean z, C83709b bVar, int i, C8480h hVar) {
        this(z, (i & 2) != 0 ? C83709b.Offline : bVar);
    }
}
