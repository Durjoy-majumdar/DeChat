package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import be0.C67222c;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.util.CompatProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p284zb.C91635f;
import rx3.C13598b0;
import rx3.C36570n;
import sd0.C22357b;
import te3.hd4;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage */
public final class JsApiRequestSubscribeMessage extends C82268c<C91635f> {
    public static final int CTRL_INDEX = 640;
    public static final String NAME = "requestSubscribeMessage";

    /* renamed from: g */
    public static final C1757a f242232g = new C1757a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$a */
    public static final class C1757a {
        public C1757a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo1741a(C91635f fVar, JsApiRequestSubscribeMessage jsApiRequestSubscribeMessage, int i, String str, Map<String, ? extends Object> map, int i2) {
            C87412m.m108594g(fVar, "service");
            C87412m.m108594g(jsApiRequestSubscribeMessage, "jsapi");
            C87412m.m108594g(str, "status");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!(i2 == -1 || i2 == 0)) {
                linkedHashMap.put("errCode", Integer.valueOf(i2));
            }
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            String m = jsApiRequestSubscribeMessage.mo115112m(str, linkedHashMap);
            Log.m105924i("JsApiRequestSubscribeMessage", "[callbackJsApi] return json:" + m);
            C13598b0 b0Var = C13598b0.f38549a;
            fVar.mo109647a(i, m);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C91635f fVar2 = (C91635f) fVar;
        Log.m105924i("JsApiRequestSubscribeMessage", "JsApiRequestSubscribeMessage invoked");
        if (jSONObject == null) {
            C87412m.m108591d(fVar2);
            fVar2.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("tmplIds");
        ArrayList arrayList = new ArrayList();
        if (jSONArray.length() == 0) {
            C1757a aVar = f242232g;
            C87412m.m108591d(fVar2);
            aVar.mo1741a(fVar2, this, i, "fail:TmplIds can't be empty", (Map<String, ? extends Object>) null, 10001);
            return;
        }
        try {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = jSONArray.get(i2);
                if (!(obj instanceof String)) {
                    C1757a aVar2 = f242232g;
                    C87412m.m108591d(fVar2);
                    aVar2.mo1741a(fVar2, this, i, "fail:Invalid template id", (Map<String, ? extends Object>) null, 10004);
                    return;
                }
                arrayList.add(obj);
            }
            C87412m.m108591d(fVar2);
            String str = fVar2.getRuntime().mo113036W().f234839s;
            C87412m.m108593f(str, "env!!.runtime.initConfig.username");
            String str2 = fVar2.getRuntime().mo113036W().f239362d;
            C87412m.m108593f(str2, "env!!.runtime.initConfig.appId");
            new SubscribeMsgTask(str, str2, fVar2.getRuntime().mo113036W().f234841u, arrayList, 0, this, fVar2, i).mo93654b();
        } catch (JSONException unused) {
            C87412m.m108591d(fVar2);
            fVar2.mo109647a(i, mo115109j("fail:invalid data"));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/JsApiRequestSubscribeMessage$SubscribeMsgTask;", "Lcom/tencent/mm/msgsubscription/util/CompatProcessTask;", "Lsd0/b$b;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask */
    public static final class SubscribeMsgTask extends CompatProcessTask implements C22357b.C22358b {
        public static final Parcelable.Creator<SubscribeMsgTask> CREATOR = new C82829a();

        /* renamed from: e */
        public String f242233e;

        /* renamed from: f */
        public int f242234f;

        /* renamed from: g */
        public SubscribeMsgRequestResult f242235g;

        /* renamed from: h */
        public C91635f f242236h;

        /* renamed from: i */
        public Integer f242237i;

        /* renamed from: j */
        public JsApiRequestSubscribeMessage f242238j;

        /* renamed from: n */
        public GetSubscribeMsgListExecutor f242239n;

        /* renamed from: o */
        public SubscribeMsgExecutor f242240o;

        /* renamed from: p */
        public boolean f242241p;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask$a */
        public static final class C82829a implements Parcelable.Creator<SubscribeMsgTask> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                SubscribeMsgTask subscribeMsgTask = new SubscribeMsgTask(readString, parcel.readInt());
                subscribeMsgTask.f242235g = (SubscribeMsgRequestResult) parcel.readParcelable(SubscribeMsgRequestResult.class.getClassLoader());
                subscribeMsgTask.f242239n = (GetSubscribeMsgListExecutor) parcel.readParcelable(GetSubscribeMsgListExecutor.class.getClassLoader());
                subscribeMsgTask.f242240o = (SubscribeMsgExecutor) parcel.readParcelable(SubscribeMsgExecutor.class.getClassLoader());
                GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = subscribeMsgTask.f242239n;
                C87412m.m108591d(getSubscribeMsgListExecutor);
                C87412m.m108591d(subscribeMsgTask.f242239n);
                getSubscribeMsgListExecutor.f49389i = new C82832f(subscribeMsgTask);
                SubscribeMsgExecutor subscribeMsgExecutor = subscribeMsgTask.f242240o;
                C87412m.m108591d(subscribeMsgExecutor);
                subscribeMsgExecutor.f242244f = new C82834g(subscribeMsgTask);
                return subscribeMsgTask;
            }

            public Object[] newArray(int i) {
                return new SubscribeMsgTask[i];
            }
        }

        public SubscribeMsgTask(String str, int i) {
            C87412m.m108594g(str, "username");
            this.f242233e = str;
            this.f242234f = i;
            this.f242241p = true;
        }

        /* renamed from: e */
        public static void m101573e(SubscribeMsgTask subscribeMsgTask, String str, Map map, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                map = null;
            }
            Map map2 = map;
            int i3 = (i2 & 4) != 0 ? -1 : i;
            C1757a aVar = JsApiRequestSubscribeMessage.f242232g;
            C91635f fVar = subscribeMsgTask.f242236h;
            C87412m.m108591d(fVar);
            JsApiRequestSubscribeMessage jsApiRequestSubscribeMessage = subscribeMsgTask.f242238j;
            C87412m.m108591d(jsApiRequestSubscribeMessage);
            Integer num = subscribeMsgTask.f242237i;
            C87412m.m108591d(num);
            aVar.mo1741a(fVar, jsApiRequestSubscribeMessage, num.intValue(), str, map2, i3);
        }

        /* renamed from: a */
        public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(str, "errMsg");
            Log.m105924i("JsApiRequestSubscribeMessage", "onNetSceneEndCallback errType:" + i + " errCode:" + i2 + " errMsg:" + str + " result" + subscribeMsgRequestResult);
            this.f242241p = i == 0 && i2 == 0;
            this.f242235g = subscribeMsgRequestResult;
            C119179t tVar = C119157j.f356862d;
            C67222c cVar = new C67222c(this);
            ((C119157j) tVar).mo183876g(cVar, "CompatProcessTask_" + ((String) ((C36570n) this.f195834d).getValue()));
        }

        /* renamed from: c */
        public void mo93655c() {
            if (this.f242241p) {
                SubscribeMsgRequestResult subscribeMsgRequestResult = this.f242235g;
                if (subscribeMsgRequestResult != null) {
                    if (this.f242234f == 0) {
                        C87412m.m108591d(subscribeMsgRequestResult);
                        if (subscribeMsgRequestResult.f49015v != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("fail:");
                            SubscribeMsgRequestResult subscribeMsgRequestResult2 = this.f242235g;
                            C87412m.m108591d(subscribeMsgRequestResult2);
                            sb.append(subscribeMsgRequestResult2.f49016w);
                            String sb4 = sb.toString();
                            SubscribeMsgRequestResult subscribeMsgRequestResult3 = this.f242235g;
                            C87412m.m108591d(subscribeMsgRequestResult3);
                            m101573e(this, sb4, (Map) null, subscribeMsgRequestResult3.f49015v, 2, (Object) null);
                            return;
                        }
                    }
                    if (this.f242234f == 0) {
                        GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f242239n;
                        if (getSubscribeMsgListExecutor != null) {
                            C91635f fVar = this.f242236h;
                            C87412m.m108591d(fVar);
                            Context context = fVar.getContext();
                            C87412m.m108593f(context, "service!!.context");
                            SubscribeMsgRequestResult subscribeMsgRequestResult4 = this.f242235g;
                            C87412m.m108591d(subscribeMsgRequestResult4);
                            getSubscribeMsgListExecutor.mo22171b(context, subscribeMsgRequestResult4);
                            return;
                        }
                        return;
                    }
                    SubscribeMsgExecutor subscribeMsgExecutor = this.f242240o;
                    if (subscribeMsgExecutor != null) {
                        C91635f fVar2 = this.f242236h;
                        C87412m.m108591d(fVar2);
                        C87412m.m108593f(fVar2.getContext(), "service!!.context");
                        SubscribeMsgRequestResult subscribeMsgRequestResult5 = this.f242235g;
                        C87412m.m108591d(subscribeMsgRequestResult5);
                        SubscribeMsgExecutor.C82831b bVar = subscribeMsgExecutor.f242244f;
                        if (bVar != null) {
                            bVar.mo115060b(subscribeMsgRequestResult5);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (this.f242234f == 0) {
                m101573e(this, "fail:Request list fail", (Map) null, 10002, 2, (Object) null);
            } else {
                m101573e(this, "fail:Request subscribe fail", (Map) null, 10003, 2, (Object) null);
            }
        }

        /* renamed from: d */
        public void mo93656d() {
            if (this.f242234f == 0) {
                GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f242239n;
                if (getSubscribeMsgListExecutor != null) {
                    String str = getSubscribeMsgListExecutor.f49384d;
                    List<String> list = getSubscribeMsgListExecutor.f49385e;
                    C87412m.m108594g(str, "username");
                    C87412m.m108594g(list, "templateIds");
                    C22357b bVar = new C22357b(str, 2);
                    bVar.f63381f = getSubscribeMsgListExecutor;
                    for (String str2 : list) {
                        List<hd4> list2 = bVar.f63379d;
                        hd4 hd4 = new hd4();
                        hd4.f63914d = str2;
                        ((ArrayList) list2).add(hd4);
                    }
                    bVar.mo35487b(getSubscribeMsgListExecutor.f49388h);
                    return;
                }
                return;
            }
            SubscribeMsgExecutor subscribeMsgExecutor = this.f242240o;
            if (subscribeMsgExecutor != null) {
                C22357b.C22359a.C22360a aVar = C22357b.C22359a.f63389a;
                String str3 = subscribeMsgExecutor.f242242d;
                List<SubscribeMsgTmpItem> list3 = subscribeMsgExecutor.f242246h;
                byte[] bArr = subscribeMsgExecutor.f242245g;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData = subscribeMsgExecutor.f242243e;
                C87412m.m108594g(str3, "username");
                C87412m.m108594g(list3, "templates");
                aVar.mo35489b(str3, "", list3, "", subscribeMsgExecutor, true, bArr, subscribeMsgRequestDialogUiData).mo35487b(subscribeMsgExecutor.f242247i);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f242233e);
            parcel.writeInt(this.f242234f);
            parcel.writeParcelable(this.f242235g, i);
            parcel.writeParcelable(this.f242239n, i);
            parcel.writeParcelable(this.f242240o, i);
            parcel.writeInt(this.f242241p ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public SubscribeMsgTask(String str, String str2, int i, List<String> list, int i2, JsApiRequestSubscribeMessage jsApiRequestSubscribeMessage, C91635f fVar, int i3) {
            this(str, i2);
            C87412m.m108594g(str, "username");
            C87412m.m108594g(str2, "appid");
            C87412m.m108594g(list, "tmplIds");
            C87412m.m108594g(jsApiRequestSubscribeMessage, "jsapi");
            C87412m.m108594g(fVar, "service");
            this.f242238j = jsApiRequestSubscribeMessage;
            this.f242236h = fVar;
            this.f242237i = Integer.valueOf(i3);
            C17912a aVar = C17912a.f49411a;
            C17912a.f49412b.put(str, str2);
            C82832f fVar2 = new C82832f(this);
            GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = new GetSubscribeMsgListExecutor(str, list, str2, i);
            getSubscribeMsgListExecutor.f49389i = fVar2;
            getSubscribeMsgListExecutor.f49388h = aVar;
            this.f242239n = getSubscribeMsgListExecutor;
            C82834g gVar = new C82834g(this);
            SubscribeMsgExecutor subscribeMsgExecutor = new SubscribeMsgExecutor(str);
            subscribeMsgExecutor.f242244f = gVar;
            subscribeMsgExecutor.f242247i = aVar;
            this.f242240o = subscribeMsgExecutor;
        }
    }
}
