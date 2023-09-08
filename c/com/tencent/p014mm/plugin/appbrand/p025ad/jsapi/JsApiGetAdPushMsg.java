package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.advertise.util.MagicAdPushMsg;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import p005bg.C0277c;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg */
public final class JsApiGetAdPushMsg extends C82268c<C82510g> {
    public static final int CTRL_INDEX = 1170;
    public static final String NAME = "getAdPushMsg";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ad/jsapi/JsApiGetAdPushMsg$AdPushMsgListWrapper;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper */
    public static final class AdPushMsgListWrapper implements Parcelable {
        public static final Parcelable.Creator<AdPushMsgListWrapper> CREATOR = new C1498a();

        /* renamed from: d */
        public final List<MagicAdPushMsg> f10851d;

        /* renamed from: e */
        public final boolean f10852e;

        /* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper$a */
        public static final class C1498a implements Parcelable.Creator<AdPushMsgListWrapper> {
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
            this.f10851d = list;
            this.f10852e = z;
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
            return C87412m.m108589b(this.f10851d, adPushMsgListWrapper.f10851d) && this.f10852e == adPushMsgListWrapper.f10852e;
        }

        public int hashCode() {
            int hashCode = this.f10851d.hashCode() * 31;
            boolean z = this.f10852e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "AdPushMsgListWrapper(msgDataList=" + this.f10851d + ", status=" + this.f10852e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            List<MagicAdPushMsg> list = this.f10851d;
            parcel.writeInt(list.size());
            for (MagicAdPushMsg writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
            parcel.writeInt(this.f10852e ? 1 : 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ad/jsapi/JsApiGetAdPushMsg$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/appbrand/ad/jsapi/JsApiGetAdPushMsg$AdPushMsgListWrapper;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$a */
    public static final class C1499a implements C80883e<IPCString, AdPushMsgListWrapper> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "data");
            String str = iPCString.f10315d;
            C87412m.m108593f(str, "data.value");
            List<MagicAdPushMsg> Yt = ((C0277c) C86312j.m106911c(C0277c.class)).mo555Yt(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_MINI_PROGRAM, str);
            if (gVar != null) {
                gVar.mo894a(new AdPushMsgListWrapper(Yt, true));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82510g gVar = (C82510g) fVar;
        String str = null;
        if (Util.isNullOrNil(jSONObject != null ? jSONObject.optString("slotid") : null) && gVar != null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "no slotid");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            gVar.mo109647a(i, mo115115p("no slotid", jSONObject2));
        }
        String str2 = WeChatProcess.PROCESS_MAIN;
        if (jSONObject != null) {
            str = jSONObject.optString("slotid");
        }
        XIPCInvoker.m98748a(str2, new IPCString(str), C1499a.class, new C1503i(gVar, i, this));
    }
}
