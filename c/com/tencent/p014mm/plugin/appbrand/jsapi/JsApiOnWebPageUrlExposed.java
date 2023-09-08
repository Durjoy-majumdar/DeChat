package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import ex0.C45700h;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed */
public final class JsApiOnWebPageUrlExposed extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 865;
    public static final String NAME = "private_onWebPageUrlExposed";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiOnWebPageUrlExposed$WebPagePrefetchTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "<init>", "()V", "CREATOR", "a", "plugin-luggage-wechat-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed$WebPagePrefetchTask */
    public static final class WebPagePrefetchTask extends MainProcessTask {
        public static final C40439a CREATOR = new C40439a((C8480h) null);

        /* renamed from: f */
        public C82870p f108671f;

        /* renamed from: g */
        public C82381f f108672g;

        /* renamed from: h */
        public int f108673h;

        /* renamed from: i */
        public String f108674i;

        /* renamed from: j */
        public boolean f108675j;

        /* renamed from: n */
        public String f108676n;

        /* renamed from: o */
        public int f108677o;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed$WebPagePrefetchTask$a */
        public static final class C40439a implements Parcelable.Creator<WebPagePrefetchTask> {
            public C40439a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                WebPagePrefetchTask webPagePrefetchTask = new WebPagePrefetchTask();
                webPagePrefetchTask.f108674i = parcel.readString();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                webPagePrefetchTask.f108675j = z;
                webPagePrefetchTask.f108677o = parcel.readInt();
                return webPagePrefetchTask;
            }

            public Object[] newArray(int i) {
                return new WebPagePrefetchTask[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f108674i = parcel != null ? parcel.readString() : null;
            boolean z = true;
            int i = 0;
            if (parcel == null || parcel.readInt() != 1) {
                z = false;
            }
            this.f108675j = z;
            if (parcel != null) {
                i = parcel.readInt();
            }
            this.f108677o = i;
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            String str = null;
            if (this.f108675j) {
                C82381f fVar = this.f108672g;
                if (fVar != null) {
                    int i = this.f108673h;
                    C82870p pVar = this.f108671f;
                    if (pVar != null) {
                        String str2 = this.f108676n;
                        if (str2 == null) {
                            str2 = "ok";
                        }
                        str = pVar.mo115109j(str2);
                    }
                    fVar.mo109647a(i, str);
                    return;
                }
                return;
            }
            C82381f fVar2 = this.f108672g;
            if (fVar2 != null) {
                int i2 = this.f108673h;
                C82870p pVar2 = this.f108671f;
                if (pVar2 != null) {
                    String str3 = this.f108676n;
                    if (str3 == null) {
                        str3 = "fail";
                    }
                    str = pVar2.mo115109j(str3);
                }
                fVar2.mo109647a(i2, str);
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            this.f108675j = false;
            Class cls = C45700h.class;
            if (Util.isNullOrNil(this.f108674i)) {
                this.f108676n = "fail:urlList is null";
                Log.m105924i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:urlList is null");
            } else {
                ArrayList arrayList = new ArrayList();
                try {
                    C26827e eVar = new C26827e(this.f108674i);
                    if (eVar.length() <= 0) {
                        this.f108676n = "fail:urlList is decode array fail";
                        Log.m105924i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:urlList is decode array fail");
                    } else {
                        int length = eVar.length();
                        int i = 0;
                        while (true) {
                            boolean z = true;
                            if (i >= length) {
                                break;
                            }
                            C104289g p = eVar.optJSONObject(i);
                            String optString = p.optString("url");
                            if (optString == null || !C112551y.m153811k(optString)) {
                                z = false;
                            }
                            if (z) {
                                Log.m105924i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "decode url is empty");
                            } else {
                                int optInt = p.optInt("bizScene");
                                String optString2 = p.optString("extInfo");
                                C45700h.C45702b bVar = new C45700h.C45702b();
                                bVar.f123504a = optString;
                                bVar.f123512i = optString2;
                                bVar.f123506c = WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL;
                                bVar.f123513j = optInt;
                                bVar.f123505b = p.optString("prefetchId", "");
                                arrayList.add(bVar);
                            }
                            i++;
                        }
                        if (arrayList.isEmpty()) {
                            this.f108676n = "fail:decode list is empty";
                            Log.m105924i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:decode list is empty");
                        } else {
                            Log.m105924i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "doOnWebPageUrlExposed  bizType:" + this.f108677o);
                            if (this.f108677o == 1) {
                                ((C45700h) C86709a0.m107533q(cls)).mo71034Ym(arrayList);
                            } else {
                                ((C45700h) C86709a0.m107533q(cls)).mo71031UP(arrayList);
                            }
                            this.f108676n = "ok";
                            this.f108675j = true;
                        }
                    }
                } catch (Exception unused) {
                    this.f108676n = "fail:parse error";
                    Log.m105924i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:parse error");
                }
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f108674i);
            parcel.writeInt(this.f108675j ? 1 : 0);
            parcel.writeInt(this.f108677o);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiOnWebPageUrlExposed", "invoke");
        String optString = jSONObject != null ? jSONObject.optString("urlList") : null;
        if (Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.JsApiOnWebPageUrlExposed", "fail:urlList is null");
            if (fVar != null) {
                fVar.mo109647a(i, mo115109j("fail:urlList is null"));
                return;
            }
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt("bizType") : 0;
        WebPagePrefetchTask webPagePrefetchTask = new WebPagePrefetchTask();
        webPagePrefetchTask.f108671f = this;
        webPagePrefetchTask.f108672g = fVar;
        webPagePrefetchTask.f108673h = i;
        webPagePrefetchTask.f108674i = optString;
        webPagePrefetchTask.f108677o = optInt;
        webPagePrefetchTask.mo114395c();
    }
}
