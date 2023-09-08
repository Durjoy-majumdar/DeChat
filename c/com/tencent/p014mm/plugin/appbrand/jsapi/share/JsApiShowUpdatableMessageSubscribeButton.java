package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import junit.framework.Assert;
import kb0.C33865k;
import org.json.JSONObject;
import v90.C37702d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton */
public class JsApiShowUpdatableMessageSubscribeButton extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 465;
    public static final String NAME = "showUpdatableMessageSubscribeButton";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask */
    public static class ShowUpdatableMessageSubscribeButtonTask extends MainProcessTask {
        public static final Parcelable.Creator<ShowUpdatableMessageSubscribeButtonTask> CREATOR = new C29535a();

        /* renamed from: f */
        public String f80429f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask$a */
        public class C29535a implements Parcelable.Creator<ShowUpdatableMessageSubscribeButtonTask> {
            public Object createFromParcel(Parcel parcel) {
                return new ShowUpdatableMessageSubscribeButtonTask(parcel);
            }

            public Object[] newArray(int i) {
                return new ShowUpdatableMessageSubscribeButtonTask[i];
            }
        }

        public ShowUpdatableMessageSubscribeButtonTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f80429f = parcel.readString();
        }

        /* renamed from: j */
        public void mo1553j() {
            int i;
            Class cls = C33865k.class;
            if (C86312j.m106911c(cls) == null) {
                Log.m105920e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "IWxaUpdateableMsgService is null, err, return");
                if (BuildInfo.IS_FLAVOR_RED) {
                    Assert.assertTrue("IWxaUpdateableMsgService is null, err, @tummy", false);
                    return;
                }
                return;
            }
            C37702d Ag = ((C33865k) C86312j.m106911c(cls)).mo59335Ag(this.f80429f);
            if (Ag == null || ((i = Ag.field_btnState) != 2 && Ag.field_msgState == 0)) {
                ((C33865k) C86312j.m106911c(cls)).mo59341tE(this.f80429f, 1);
                return;
            }
            Log.m105921e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "shareKey:%s btnState:%d msgState:%d ingore already process", this.f80429f, Integer.valueOf(i), Integer.valueOf(Ag.field_msgState));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f80429f);
        }

        public ShowUpdatableMessageSubscribeButtonTask(Parcel parcel) {
            this.f80429f = parcel.readString();
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiShowUpdatableMessageSubscribeButton", "data is null, err");
            i2Var.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        String optString = jSONObject.optString("shareKey");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiShowUpdatableMessageSubscribeButton", "shareKey is null, err");
            i2Var.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        ShowUpdatableMessageSubscribeButtonTask showUpdatableMessageSubscribeButtonTask = new ShowUpdatableMessageSubscribeButtonTask();
        showUpdatableMessageSubscribeButtonTask.f80429f = optString;
        showUpdatableMessageSubscribeButtonTask.mo114395c();
        i2Var.mo109647a(i, mo115109j("ok"));
    }
}
