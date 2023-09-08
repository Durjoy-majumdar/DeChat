package com.tencent.p014mm.plugin.appbrand.jsapi.scanner;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import kr0.C88267e;
import org.json.JSONObject;
import p182kk.C61104a;
import p225rc.C89916g;
import sk2.C101643c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanItem */
public final class JsApiScanItem extends C82268c<C88267e> {
    private static final int CTRL_INDEX = 869;
    private static final String NAME = "scanItem";

    /* renamed from: g */
    public C88267e f242435g;

    /* renamed from: h */
    public String f242436h = "";

    /* renamed from: i */
    public int f242437i;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        boolean z = true;
        Object[] objArr = new Object[1];
        String str = null;
        objArr[0] = jSONObject != null ? jSONObject.toString() : null;
        Log.m105927v("MicroMsg.JsApiScanItem", "scanItem data: %s", objArr);
        if (eVar != null) {
            this.f242435g = eVar;
            if (jSONObject != null) {
                str = jSONObject.optString("data");
            }
            if (str == null) {
                str = "";
            }
            this.f242436h = str;
            this.f242437i = i;
            if (str.length() != 0) {
                z = false;
            }
            if (z) {
                Log.m105920e("MicroMsg.JsApiScanItem", "scanItem data is empty");
                eVar.mo109647a(i, mo115109j("fail:invalid data"));
                return;
            }
            new CheckScanItemTask(this).mo114395c();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiScanItem$CheckScanItemTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanItem$CheckScanItemTask */
    public static final class CheckScanItemTask extends MainProcessTask {
        public static final Parcelable.Creator<CheckScanItemTask> CREATOR = new C82932a();

        /* renamed from: f */
        public int f242438f;

        /* renamed from: g */
        public String f242439g = "";

        /* renamed from: h */
        public JsApiScanItem f242440h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanItem$CheckScanItemTask$a */
        public static final class C82932a implements Parcelable.Creator<CheckScanItemTask> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
                return new CheckScanItemTask(parcel);
            }

            public Object[] newArray(int i) {
                return new CheckScanItemTask[i];
            }
        }

        public CheckScanItemTask(JsApiScanItem jsApiScanItem) {
            this.f242440h = jsApiScanItem;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            C87412m.m108594g(parcel, LocaleUtil.INDONESIAN_NEWNAME);
            this.f242438f = parcel.readInt();
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            this.f242439g = readString;
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            JsApiScanItem jsApiScanItem = this.f242440h;
            if (jsApiScanItem != null) {
                int i = this.f242438f;
                String str = this.f242439g;
                boolean z = false;
                Log.m105919d("MicroMsg.JsApiScanItem", "scanItem onCallback errCode: %d, errMsg: %s", Integer.valueOf(i), str);
                if (i == 0) {
                    C88267e eVar = jsApiScanItem.f242435g;
                    String str2 = jsApiScanItem.f242436h;
                    int i2 = jsApiScanItem.f242437i;
                    Activity o0 = eVar != null ? eVar.mo114344o0() : null;
                    if (o0 != null) {
                        C89916g.m112446a(o0).mo124232f(new C1860d(jsApiScanItem, eVar, i2));
                        ScanGoodsRequest scanGoodsRequest = new ScanGoodsRequest();
                        scanGoodsRequest.f248903n = 2;
                        scanGoodsRequest.f248904o = 1;
                        scanGoodsRequest.f248896d = true;
                        scanGoodsRequest.f248897e = false;
                        scanGoodsRequest.f248898f = false;
                        scanGoodsRequest.f248899g = false;
                        scanGoodsRequest.f248900h = true;
                        scanGoodsRequest.f248912w = str2;
                        ((C101643c) C86312j.m106911c(C101643c.class)).mo140872P9(o0, scanGoodsRequest, jsApiScanItem.hashCode() & 65535);
                    } else if (eVar != null) {
                        eVar.mo109647a(i2, jsApiScanItem.mo115109j("fail:internal error invalid android context"));
                    }
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("errCode", Integer.valueOf(i));
                    if (str.length() > 0) {
                        z = true;
                    }
                    if (!z) {
                        str = "unknown error";
                    }
                    C88267e eVar2 = jsApiScanItem.f242435g;
                    if (eVar2 != null) {
                        int i3 = jsApiScanItem.f242437i;
                        eVar2.mo109647a(i3, jsApiScanItem.mo115112m("fail: " + str, hashMap));
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            Context context = MMApplicationContext.getContext();
            if (C61104a.m71653i(context, false, (Bundle) null) || C61104a.m71667w(context) || C61104a.m71647c(context, false)) {
                Log.m105920e("MicroMsg.JsApiScanItem", "scanItem camera is using now, can not call scanItem");
                this.f242438f = 1001;
                this.f242439g = "camera is using";
            } else {
                this.f242438f = 0;
                this.f242439g = "ok";
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeInt(this.f242438f);
            parcel.writeString(this.f242439g);
        }

        public CheckScanItemTask(Parcel parcel) {
            C87412m.m108594g(parcel, "inParcel");
            mo1551g(parcel);
        }
    }
}
