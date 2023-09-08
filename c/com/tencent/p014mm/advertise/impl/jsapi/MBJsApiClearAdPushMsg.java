package com.tencent.p014mm.advertise.impl.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C1500a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import e42.C31415g;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import kotlin.Metadata;
import p005bg.C0277c;
import q20.C89449a;
import z04.C112550d0;

/* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg */
public final class MBJsApiClearAdPushMsg<T extends C7594e> extends C86430i<T> {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiClearAdPushMsg$RequestType;", "Landroid/os/Parcelable;", "ad-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType */
    public static final class RequestType implements Parcelable {
        public static final Parcelable.Creator<RequestType> CREATOR = new C0973a();

        /* renamed from: d */
        public final String f8995d;

        /* renamed from: e */
        public final String f8996e;

        /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType$a */
        public static final class C0973a implements Parcelable.Creator<RequestType> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new RequestType(parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new RequestType[i];
            }
        }

        public RequestType(String str, String str2) {
            C87412m.m108594g(str, "slotid");
            C87412m.m108594g(str2, "bizName");
            this.f8995d = str;
            this.f8996e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestType)) {
                return false;
            }
            RequestType requestType = (RequestType) obj;
            return C87412m.m108589b(this.f8995d, requestType.f8995d) && C87412m.m108589b(this.f8996e, requestType.f8996e);
        }

        public int hashCode() {
            return (this.f8995d.hashCode() * 31) + this.f8996e.hashCode();
        }

        public String toString() {
            return "RequestType(slotid=" + this.f8995d + ", bizName=" + this.f8996e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f8995d);
            parcel.writeString(this.f8996e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiClearAdPushMsg$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiClearAdPushMsg$RequestType;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "ad-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$a */
    public static final class C0974a implements C80883e<RequestType, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            RequestType requestType = (RequestType) obj;
            C87412m.m108594g(requestType, "requestType");
            boolean j0 = ((C0277c) C86312j.m106911c(C0277c.class)).mo557j0(requestType.f8996e, requestType.f8995d);
            if (!j0) {
                Log.m105920e("MicroMsg.MBJsApiClearAdPushMsg", "db operation failed");
            }
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(j0));
            }
        }
    }

    /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$b */
    public static final class C0975b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ MBJsApiClearAdPushMsg<T> f8997d;

        public C0975b(MBJsApiClearAdPushMsg<T> mBJsApiClearAdPushMsg) {
            this.f8997d = mBJsApiClearAdPushMsg;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            if (((IPCBoolean) obj).f10312d) {
                this.f8997d.mo120840p().invoke(this.f8997d.mo120844i());
            } else {
                this.f8997d.mo120840p().invoke(this.f8997d.mo120843h(C31415g.C7595b.f25864c));
            }
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return C1500a.NAME;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("slotid");
        String str = mo120841d().f26666a;
        C87412m.m108594g(str, "instanceName");
        String g0 = C112550d0.m153797g0(str, "-", str);
        if (Util.isNullOrNil(optString)) {
            mo120840p().invoke(mo120843h(C31415g.C7595b.f25865d));
        }
        String str2 = WeChatProcess.PROCESS_MAIN;
        C87412m.m108593f(optString, "slotid");
        XIPCInvoker.m98748a(str2, new RequestType(optString, g0), C0974a.class, new C0975b(this));
    }
}
