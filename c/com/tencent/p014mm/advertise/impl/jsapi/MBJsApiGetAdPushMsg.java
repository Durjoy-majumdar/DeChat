package com.tencent.p014mm.advertise.impl.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.advertise.util.MagicAdPushMsg;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.JsApiGetAdPushMsg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import e42.C31415g;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import p005bg.C0277c;
import q20.C89449a;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg */
public final class MBJsApiGetAdPushMsg<T extends C7594e> extends C86430i<T> {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$AdPushMsgListWrapper;", "Landroid/os/Parcelable;", "ad-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper */
    public static final class AdPushMsgListWrapper implements Parcelable {
        public static final Parcelable.Creator<AdPushMsgListWrapper> CREATOR = new C0976a();

        /* renamed from: d */
        public final List<MagicAdPushMsg> f8998d;

        /* renamed from: e */
        public final boolean f8999e;

        /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper$a */
        public static final class C0976a implements Parcelable.Creator<AdPushMsgListWrapper> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                boolean z = false;
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(AdPushMsgListWrapper.class.getClassLoader()));
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new AdPushMsgListWrapper(arrayList, z);
            }

            public Object[] newArray(int i) {
                return new AdPushMsgListWrapper[i];
            }
        }

        public AdPushMsgListWrapper(List<MagicAdPushMsg> list, boolean z) {
            C87412m.m108594g(list, "msgDataList");
            this.f8998d = list;
            this.f8999e = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdPushMsgListWrapper)) {
                return false;
            }
            AdPushMsgListWrapper adPushMsgListWrapper = (AdPushMsgListWrapper) obj;
            return C87412m.m108589b(this.f8998d, adPushMsgListWrapper.f8998d) && this.f8999e == adPushMsgListWrapper.f8999e;
        }

        public int hashCode() {
            int hashCode = this.f8998d.hashCode() * 31;
            boolean z = this.f8999e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "AdPushMsgListWrapper(msgDataList=" + this.f8998d + ", status=" + this.f8999e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            List<MagicAdPushMsg> list = this.f8998d;
            parcel.writeInt(list.size());
            for (MagicAdPushMsg writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
            parcel.writeInt(this.f8999e ? 1 : 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$RequestType;", "Landroid/os/Parcelable;", "ad-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$RequestType */
    public static final class RequestType implements Parcelable {
        public static final Parcelable.Creator<RequestType> CREATOR = new C0977a();

        /* renamed from: d */
        public final String f9000d;

        /* renamed from: e */
        public final String f9001e;

        /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$RequestType$a */
        public static final class C0977a implements Parcelable.Creator<RequestType> {
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
            this.f9000d = str;
            this.f9001e = str2;
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
            return C87412m.m108589b(this.f9000d, requestType.f9000d) && C87412m.m108589b(this.f9001e, requestType.f9001e);
        }

        public int hashCode() {
            return (this.f9000d.hashCode() * 31) + this.f9001e.hashCode();
        }

        public String toString() {
            return "RequestType(slotid=" + this.f9000d + ", bizName=" + this.f9001e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f9000d);
            parcel.writeString(this.f9001e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$RequestType;", "Lcom/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$AdPushMsgListWrapper;", "<init>", "()V", "ad-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$a */
    public static final class C0978a implements C80883e<RequestType, AdPushMsgListWrapper> {
        public void invoke(Object obj, C1256g gVar) {
            RequestType requestType = (RequestType) obj;
            C87412m.m108594g(requestType, "requestType");
            List<MagicAdPushMsg> Yt = ((C0277c) C86312j.m106911c(C0277c.class)).mo555Yt(requestType.f9001e, requestType.f9000d);
            if (gVar != null) {
                gVar.mo894a(new AdPushMsgListWrapper(Yt, true));
            }
        }
    }

    /* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$b */
    public static final class C0979b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ MBJsApiGetAdPushMsg<T> f9002d;

        public C0979b(MBJsApiGetAdPushMsg<T> mBJsApiGetAdPushMsg) {
            this.f9002d = mBJsApiGetAdPushMsg;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            AdPushMsgListWrapper adPushMsgListWrapper = (AdPushMsgListWrapper) obj;
            JSONArray jSONArray = new JSONArray();
            if (adPushMsgListWrapper.f8999e) {
                for (MagicAdPushMsg magicAdPushMsg : adPushMsgListWrapper.f8998d) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("opcode", magicAdPushMsg.f9008d);
                    jSONObject.put("aid", magicAdPushMsg.f9009e);
                    jSONObject.put("slotid", magicAdPushMsg.f9010f);
                    jSONObject.put("op_time", magicAdPushMsg.f9011g);
                    jSONObject.put("traceid", magicAdPushMsg.f9012h);
                    jSONArray.put(jSONObject);
                }
                C32226l<C7596h, C13598b0> p = this.f9002d.mo120840p();
                MBJsApiGetAdPushMsg<T> mBJsApiGetAdPushMsg = this.f9002d;
                C7596h hVar = new C7596h();
                hVar.put("msgData", jSONArray);
                C13598b0 b0Var = C13598b0.f38549a;
                mBJsApiGetAdPushMsg.mo120845j(hVar);
                p.invoke(hVar);
                return;
            }
            this.f9002d.mo120840p().invoke(this.f9002d.mo120843h(C31415g.C7595b.f25864c));
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return JsApiGetAdPushMsg.NAME;
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
        if (Util.isNullOrNil(g0)) {
            Log.m105920e("MicroMsg.MBJsApiGetAdPushMsg", "bizName null");
        }
        C87412m.m108593f(optString, "slotid");
        JSONArray Bh = ((C0277c) C86312j.m106911c(C0277c.class)).mo553Bh(g0, optString);
        C32226l<C7596h, C13598b0> p = mo120840p();
        C7596h hVar2 = new C7596h();
        hVar2.put("msgData", Bh);
        C13598b0 b0Var = C13598b0.f38549a;
        mo120845j(hVar2);
        p.invoke(hVar2);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new RequestType(optString, g0), C0978a.class, new C0979b(this));
    }
}
