package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import wc3.C15130a;
import wc3.C15140v;
import wd3.C78545b;
import wd3.C78574s0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact */
public class JsApiPrivateAddContact extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 407;
    public static final String NAME = "private_addContact";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactRequest */
    public static final class AddContactRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<AddContactRequest> CREATOR = new C81998a();

        /* renamed from: d */
        public String f240439d;

        /* renamed from: e */
        public int f240440e;

        /* renamed from: f */
        public int f240441f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactRequest$a */
        public class C81998a implements Parcelable.Creator<AddContactRequest> {
            public Object createFromParcel(Parcel parcel) {
                return new AddContactRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new AddContactRequest[i];
            }
        }

        public AddContactRequest() {
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return C82000a.class;
        }

        public void readParcel(Parcel parcel) {
            this.f240439d = parcel.readString();
            this.f240440e = parcel.readInt();
            this.f240441f = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240439d);
            parcel.writeInt(this.f240440e);
            parcel.writeInt(this.f240441f);
        }

        public AddContactRequest(Parcel parcel) {
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult */
    public static final class AddContactResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final Parcelable.Creator<AddContactResult> CREATOR = new C81999a();

        /* renamed from: d */
        public int f240442d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult$a */
        public class C81999a implements Parcelable.Creator<AddContactResult> {
            public Object createFromParcel(Parcel parcel) {
                return new AddContactResult(parcel);
            }

            public Object[] newArray(int i) {
                return new AddContactResult[i];
            }
        }

        public AddContactResult() {
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
            this.f240442d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f240442d);
        }

        public AddContactResult(Parcel parcel) {
            this.f240442d = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$a */
    public static final class C82000a extends AppBrandProxyUIProcessTask {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$a$a */
        public class C82001a implements C78574s0 {

            /* renamed from: a */
            public final /* synthetic */ AddContactResult f240443a;

            public C82001a(AddContactResult addContactResult) {
                this.f240443a = addContactResult;
            }

            /* renamed from: a */
            public void mo708a(int i) {
                Log.m105925i("MicroMsg.JsApiPrivateAddContact", "onAddContact resultCode:%d", Integer.valueOf(i));
                AddContactResult addContactResult = this.f240443a;
                addContactResult.f240442d = i;
                C82000a.this.finishProcess(addContactResult);
            }
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            AddContactResult addContactResult = new AddContactResult();
            if (!(processRequest instanceof AddContactRequest)) {
                Log.m105928w("MicroMsg.JsApiPrivateAddContact", "handleRequest !(request instanceof AddContactRequest)");
                addContactResult.f240442d = -1;
                finishProcess(addContactResult);
                return;
            }
            AddContactRequest addContactRequest = (AddContactRequest) processRequest;
            C15130a aVar = new C15130a();
            boolean z = true;
            if (addContactRequest.f240441f != 1) {
                z = false;
            }
            aVar.f41261f = z;
            ((C78545b) ((C15140v) C86312j.m106911c(C15140v.class)).mo14098jU(getActivityContext(), addContactRequest.f240439d, addContactRequest.f240440e, new C82001a(addContactResult), aVar)).mo108519f();
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int w = mo114447w();
        try {
            int i2 = jSONObject.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            String string = jSONObject.getString("username");
            if (Util.isNullOrNil(string)) {
                Log.m105924i("MicroMsg.JsApiPrivateAddContact", "username nil");
                fVar.mo109647a(i, mo115109j("fail:username is nil"));
                return;
            }
            AddContactRequest addContactRequest = new AddContactRequest();
            addContactRequest.f240439d = string;
            addContactRequest.f240440e = i2;
            addContactRequest.f240441f = w;
            C81956c.m100675c(fVar.getContext(), addContactRequest, new C82551j5(this, fVar, i), (Intent) null);
        } catch (JSONException e) {
            Log.m105929w("MicroMsg.JsApiPrivateAddContact", "parse exp:%s", e);
            fVar.mo109647a(i, mo115109j("fail:parse exp"));
        }
    }

    /* renamed from: w */
    public int mo114447w() {
        return 1;
    }
}
