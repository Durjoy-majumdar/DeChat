package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC$$b;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.launching.C83518x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import x20.C15618a;
import xm0.C91291c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier */
public final class IPCUpdateStateNotifier implements C83518x0.C83520b {

    /* renamed from: a */
    public final String f243347a;

    /* renamed from: b */
    public final String f243348b;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized */
    public static final class UpdateStateArgsParcelized implements Parcelable {
        public static final Parcelable.Creator<UpdateStateArgsParcelized> CREATOR = new C83274a();

        /* renamed from: d */
        public final String f243349d;

        /* renamed from: e */
        public final int f243350e;

        /* renamed from: f */
        public final String f243351f;

        /* renamed from: g */
        public final C91291c f243352g;

        /* renamed from: h */
        public final String f243353h;

        /* renamed from: i */
        public final String f243354i;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized$a */
        public static final class C83274a implements Parcelable.Creator<UpdateStateArgsParcelized> {
            public Object createFromParcel(Parcel parcel) {
                C91291c cVar;
                C87412m.m108594g(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                C91291c[] values = C91291c.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cVar = null;
                        break;
                    }
                    C91291c cVar2 = values[i];
                    if (readInt2 == cVar2.ordinal()) {
                        cVar = cVar2;
                        break;
                    }
                    i++;
                }
                return new UpdateStateArgsParcelized(readString, readInt, readString2, cVar, parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new UpdateStateArgsParcelized[i];
            }
        }

        public UpdateStateArgsParcelized(String str, int i, String str2, C91291c cVar, String str3, String str4) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(cVar, "state");
            this.f243349d = str;
            this.f243350e = i;
            this.f243351f = str2;
            this.f243352g = cVar;
            this.f243353h = str3;
            this.f243354i = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateStateArgsParcelized)) {
                return false;
            }
            UpdateStateArgsParcelized updateStateArgsParcelized = (UpdateStateArgsParcelized) obj;
            return C87412m.m108589b(this.f243349d, updateStateArgsParcelized.f243349d) && this.f243350e == updateStateArgsParcelized.f243350e && C87412m.m108589b(this.f243351f, updateStateArgsParcelized.f243351f) && this.f243352g == updateStateArgsParcelized.f243352g && C87412m.m108589b(this.f243353h, updateStateArgsParcelized.f243353h) && C87412m.m108589b(this.f243354i, updateStateArgsParcelized.f243354i);
        }

        public int hashCode() {
            int hashCode = ((this.f243349d.hashCode() * 31) + this.f243350e) * 31;
            String str = this.f243351f;
            int i = 0;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f243352g.hashCode()) * 31;
            String str2 = this.f243353h;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f243354i;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "UpdateStateArgsParcelized(appId=" + this.f243349d + ", intVersion=" + this.f243350e + ", stringVersion=" + this.f243351f + ", state=" + this.f243352g + ", passThroughInfo=" + this.f243353h + ", stablePassThroughInfo=" + this.f243354i + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f243349d);
            parcel.writeInt(this.f243350e);
            parcel.writeString(this.f243351f);
            C91291c cVar = this.f243352g;
            parcel.writeInt(cVar != null ? cVar.ordinal() : -1);
            parcel.writeString(this.f243353h);
            parcel.writeString(this.f243354i);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized;", "kotlin.jvm.PlatformType", "args", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$a */
    public static final class C83275a<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C83275a<InputType, ResultType> f243355d = new C83275a<>();

        public void invoke(Object obj, C1256g gVar) {
            UpdateStateArgsParcelized updateStateArgsParcelized = (UpdateStateArgsParcelized) obj;
            String str = updateStateArgsParcelized.f243349d;
            int i = updateStateArgsParcelized.f243350e;
            String str2 = updateStateArgsParcelized.f243351f;
            C91291c cVar = updateStateArgsParcelized.f243352g;
            String str3 = updateStateArgsParcelized.f243353h;
            String str4 = updateStateArgsParcelized.f243354i;
            AppBrandRuntimeWC b = C81682d.m100222b(str);
            if (b != null) {
                b.mo113052e("notifyUpdateState(%s) enqueue", cVar);
                b.mo113020N0(new AppBrandRuntimeWC$$b(b, cVar, i, str2, str3, str4));
            }
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    public IPCUpdateStateNotifier(String str, String str2) {
        C87412m.m108594g(str, "remoteProcessName");
        C87412m.m108594g(str2, "appId");
        this.f243347a = str;
        this.f243348b = str2;
    }

    /* renamed from: a */
    public void mo115556a(C91291c cVar, int i, String str, String str2, String str3) {
        C87412m.m108594g(cVar, "state");
        Log.m105924i("MicroMsg.AppBrand.IPCUpdateStateNotifier", "notify(appId:" + this.f243348b + ", process:" + this.f243347a + ", state:" + cVar + ", passThroughInfo:" + str2 + ", stablePassThroughInfo:" + str3 + ')');
        C28947a.m38500a(this.f243347a, new UpdateStateArgsParcelized(this.f243348b, i, str, cVar, str2, str3), C83275a.f243355d, (C32226l) null);
    }
}
