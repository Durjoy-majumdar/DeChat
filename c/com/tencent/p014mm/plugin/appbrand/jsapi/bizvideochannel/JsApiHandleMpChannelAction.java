package com.tencent.p014mm.plugin.appbrand.jsapi.bizvideochannel;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiHandleMpChannelAction */
public final class JsApiHandleMpChannelAction extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 766;
    private static final String NAME = "handleMPChannelAction";

    /* renamed from: g */
    public String f108741g = "";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/bizvideochannel/JsApiHandleMpChannelAction$UpdateChannelFeedsTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiHandleMpChannelAction$UpdateChannelFeedsTask */
    public static final class UpdateChannelFeedsTask extends MainProcessTask {
        public static final C40458a CREATOR = new C40458a((C8480h) null);

        /* renamed from: f */
        public String f108746f = "";

        /* renamed from: g */
        public boolean f108747g;

        /* renamed from: h */
        public C82381f f108748h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiHandleMpChannelAction$UpdateChannelFeedsTask$a */
        public static final class C40458a implements Parcelable.Creator<UpdateChannelFeedsTask> {
            public C40458a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                UpdateChannelFeedsTask updateChannelFeedsTask = new UpdateChannelFeedsTask();
                updateChannelFeedsTask.mo1551g(parcel);
                return updateChannelFeedsTask;
            }

            public Object[] newArray(int i) {
                return new UpdateChannelFeedsTask[i];
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiHandleMpChannelAction$UpdateChannelFeedsTask$b */
        public static final class C40459b implements C45696d.C45697b {

            /* renamed from: a */
            public final /* synthetic */ UpdateChannelFeedsTask f108749a;

            public C40459b(UpdateChannelFeedsTask updateChannelFeedsTask) {
                this.f108749a = updateChannelFeedsTask;
            }

            /* renamed from: a */
            public void mo63219a(int i, int i2, String str) {
                Log.m105921e("MicroMsg.JsApiHandleMpChannelAction", "alvinluo updateChannelFeeds onFailed errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                UpdateChannelFeedsTask updateChannelFeedsTask = this.f108749a;
                updateChannelFeedsTask.f108747g = false;
                updateChannelFeedsTask.mo114394b();
            }

            public void onSuccess(String str) {
                Log.m105925i("MicroMsg.JsApiHandleMpChannelAction", "alvinluo updateChannelFeeds onSuccess %s", str);
                UpdateChannelFeedsTask updateChannelFeedsTask = this.f108749a;
                if (str == null) {
                    str = "";
                }
                updateChannelFeedsTask.f108746f = str;
                updateChannelFeedsTask.f108747g = true;
                updateChannelFeedsTask.mo114394b();
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            String readString = parcel != null ? parcel.readString() : null;
            if (readString == null) {
                readString = "";
            }
            this.f108746f = readString;
            boolean z = true;
            if (parcel == null || parcel.readInt() != 1) {
                z = false;
            }
            this.f108747g = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            boolean z = true;
            Log.m105925i("MicroMsg.JsApiHandleMpChannelAction", "alvinluo updateChannelFeeds end and dispatch onUpdateChannelFeeds, success: %b", Boolean.valueOf(this.f108747g));
            C40460a aVar = new C40460a();
            C82381f fVar = this.f108748h;
            boolean z2 = this.f108747g;
            String str = this.f108746f;
            C87412m.m108594g(str, "channelFeedsData");
            Log.m105925i("MicroMsg.JsApiEventOnUpdateChannelFeeds", "alvinluo onUpdateChannelFeeds dispatch success: %b, channelFeedsData: %s", Boolean.valueOf(z2), str);
            HashMap hashMap = new HashMap();
            if (z2) {
                if (str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    hashMap.put("errCode", 0);
                    hashMap.put("errMsg", "ok");
                    hashMap.put("channelFeedsData", str);
                } else {
                    hashMap.put("errMsg", "no channel feeds");
                }
            } else {
                hashMap.put("errMsg", "update channel feeds failed");
            }
            aVar.mo115161k(fVar);
            aVar.mo115165o(hashMap);
            aVar.mo115158h();
        }

        /* renamed from: j */
        public void mo1553j() {
            ((C45696d) C86709a0.m107533q(C45696d.class)).p90(new C40459b(this));
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f108746f);
            parcel.writeInt(this.f108747g ? 1 : 0);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String optString = jSONObject != null ? jSONObject.optString("operateType") : null;
        if (optString == null) {
            optString = "";
        }
        this.f108741g = optString;
        boolean z = true;
        Log.m105925i("MicroMsg.JsApiHandleMpChannelAction", "alvinluo handleMPChannelAction operateType: %s", optString);
        if (this.f108741g.length() != 0) {
            z = false;
        }
        if (z) {
            Log.m105920e("MicroMsg.JsApiHandleMpChannelAction", "alvinluo handleMPChannelAction operateType empty");
            String j = mo115109j("fail: operationType empty");
            C87412m.m108593f(j, "makeReturnJson(\"fail: operationType empty\")");
            if (fVar != null) {
                fVar.mo109647a(i, j);
            }
        } else if (this.f108741g.equals("getChannelFeeds")) {
            Log.m105924i("MicroMsg.JsApiHandleMpChannelAction", "alvinluo getChannelFeeds");
            new GetChannelFeedsTask(this, fVar, i).mo114395c();
        } else if (this.f108741g.equals("updateChannelFeeds")) {
            Log.m105924i("MicroMsg.JsApiHandleMpChannelAction", "alvinluo updateChannelFeeds");
            UpdateChannelFeedsTask updateChannelFeedsTask = new UpdateChannelFeedsTask();
            updateChannelFeedsTask.f108748h = fVar;
            updateChannelFeedsTask.mo114395c();
            String j2 = mo115109j("ok");
            C87412m.m108593f(j2, "makeReturnJson(\"ok\")");
            if (fVar != null) {
                fVar.mo109647a(i, j2);
            }
        } else {
            Log.m105920e("MicroMsg.JsApiHandleMpChannelAction", "alvinluo handleMPChannelAction operateType invalid");
            String j3 = mo115109j("fail: operationType error");
            C87412m.m108593f(j3, "makeReturnJson(\"fail: operationType error\")");
            if (fVar != null) {
                fVar.mo109647a(i, j3);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/bizvideochannel/JsApiHandleMpChannelAction$GetChannelFeedsTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "<init>", "()V", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiHandleMpChannelAction$GetChannelFeedsTask */
    public static final class GetChannelFeedsTask extends MainProcessTask {
        public static final C40457a CREATOR = new C40457a((C8480h) null);

        /* renamed from: f */
        public String f108742f = "";

        /* renamed from: g */
        public C82870p f108743g;

        /* renamed from: h */
        public C82381f f108744h;

        /* renamed from: i */
        public int f108745i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.JsApiHandleMpChannelAction$GetChannelFeedsTask$a */
        public static final class C40457a implements Parcelable.Creator<GetChannelFeedsTask> {
            public C40457a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                GetChannelFeedsTask getChannelFeedsTask = new GetChannelFeedsTask();
                getChannelFeedsTask.mo1551g(parcel);
                return getChannelFeedsTask;
            }

            public Object[] newArray(int i) {
                return new GetChannelFeedsTask[i];
            }
        }

        public GetChannelFeedsTask() {
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            String readString = parcel != null ? parcel.readString() : null;
            if (readString == null) {
                readString = "";
            }
            this.f108742f = readString;
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            String str = null;
            if (this.f108742f.length() == 0) {
                Log.m105920e("MicroMsg.JsApiHandleMpChannelAction", "alvinluo getChannelFeeds error: data empty");
                C82381f fVar = this.f108744h;
                if (fVar != null) {
                    int i = this.f108745i;
                    C82870p pVar = this.f108743g;
                    if (pVar != null) {
                        str = pVar.mo115109j("fail: no channel feeds");
                    }
                    fVar.mo109647a(i, str);
                    return;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 0);
            hashMap.put("channelFeedsData", this.f108742f);
            Log.m105924i("MicroMsg.JsApiHandleMpChannelAction", "alvinluo getChannelFeeds success");
            C82381f fVar2 = this.f108744h;
            if (fVar2 != null) {
                int i2 = this.f108745i;
                C82870p pVar2 = this.f108743g;
                if (pVar2 != null) {
                    str = pVar2.mo115112m("ok", hashMap);
                }
                fVar2.mo109647a(i2, str);
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            String pB = ((C45696d) C86709a0.m107533q(C45696d.class)).mo71008pB();
            C87412m.m108593f(pB, "service(IBrandService::c…s.java).getChannelFeeds()");
            this.f108742f = pB;
            Log.m105925i("MicroMsg.JsApiHandleMpChannelAction", "alvinluo GetChannelFeedsTask channelFeedsData: %s", pB);
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f108742f);
        }

        public GetChannelFeedsTask(C82870p pVar, C82381f fVar, int i) {
            this.f108743g = pVar;
            this.f108744h = fVar;
            this.f108745i = i;
        }
    }
}
