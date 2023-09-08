package com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import p963fc.C86812g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgchannel/AppBrandOnReceiveCacheMsgChannelBatchIPCMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage */
public class AppBrandOnReceiveCacheMsgChannelBatchIPCMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> {
    public static final Parcelable.Creator<AppBrandOnReceiveCacheMsgChannelBatchIPCMessage> CREATOR = new C1751a();

    /* renamed from: e */
    public final String f11489e;

    /* renamed from: f */
    public final ArrayList<WxaAppMsgChannel> f11490f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgchannel.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage$a */
    public static final class C1751a implements Parcelable.Creator<AppBrandOnReceiveCacheMsgChannelBatchIPCMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(AppBrandOnReceiveCacheMsgChannelBatchIPCMessage.class.getClassLoader()));
            }
            return new AppBrandOnReceiveCacheMsgChannelBatchIPCMessage(readString, arrayList);
        }

        public Object[] newArray(int i) {
            return new AppBrandOnReceiveCacheMsgChannelBatchIPCMessage[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandOnReceiveCacheMsgChannelBatchIPCMessage(String str, ArrayList<WxaAppMsgChannel> arrayList) {
        super(str);
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(arrayList, "cacheList");
        this.f11489e = str;
        this.f11490f = arrayList;
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f11489e;
    }

    /* renamed from: c */
    public void mo893c(C86812g gVar) {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        Log.m105924i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCMessage", "runInLuggageProcess");
        appBrandRuntimeWC.mo113020N0(new C1753b(appBrandRuntimeWC, this));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f11489e);
        ArrayList<WxaAppMsgChannel> arrayList = this.f11490f;
        parcel.writeInt(arrayList.size());
        Iterator<WxaAppMsgChannel> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }
}
