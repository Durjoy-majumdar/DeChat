package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p196ln.C76706g;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact */
public final class JsApiChooseWeChatContact extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 195;
    public static final String NAME = "chooseWeChatContact";

    /* renamed from: g */
    public final int f241250g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Activity o0 = i2Var.mo114344o0();
        if (o0 == null) {
            Log.m105921e("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact context is null, appId is %s", i2Var.getAppId());
            i2Var.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact appId:%s", i2Var.getAppId());
        Intent intent = new Intent();
        String string = o0.getString(C0966R.string.a8l);
        int i2 = TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION;
        int[] iArr = {131072, 131075};
        Log.m105925i("MicroMsg.JsApiChooseWeChatContact", "ChooseWeChatContact data %s:", jSONObject);
        if (!(jSONObject == null || jSONObject.optJSONArray("contactMode") == null || jSONObject.optJSONArray("contactMode").length() <= 0)) {
            String jSONArray = jSONObject.optJSONArray("contactMode").toString();
            if (jSONArray.contains("singleContact") && !jSONArray.contains("chatroom")) {
                i2 = TPReportParams.LIVE_STEP_PLAY;
                string = o0.getString(C0966R.string.a8k);
                iArr = new int[]{131072};
            } else if (jSONArray.contains("chatroom") && !jSONArray.contains("singleContact")) {
                i2 = 275;
                iArr = new int[]{131075};
            }
        }
        intent.putExtra("Select_Conv_Type", i2);
        intent.putExtra("jsapi_select_mode", 1);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("scene_from", 9);
        intent.putExtra("Select_Conv_ui_title", string);
        intent.putExtra("search_range", iArr);
        intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
        GetUserDataTask getUserDataTask = new GetUserDataTask("");
        getUserDataTask.mo114396f();
        intent.putExtra("Select_block_List", getUserDataTask.f241251f);
        C89916g.m112446a(o0).mo124232f(new C82333i(this, i2Var, i));
        C88144b.m109802t(o0, ".ui.transmit.SelectConversationUI", intent, this.f241250g);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask */
    public static class GetUserDataTask extends MainProcessTask {
        public static final Parcelable.Creator<GetUserDataTask> CREATOR = new C82321a();

        /* renamed from: f */
        public String f241251f;

        /* renamed from: g */
        public String f241252g;

        /* renamed from: h */
        public String f241253h;

        /* renamed from: i */
        public String f241254i;

        /* renamed from: j */
        public String f241255j = "";

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask$a */
        public class C82321a implements Parcelable.Creator<GetUserDataTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetUserDataTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetUserDataTask[i];
            }
        }

        public GetUserDataTask(String str) {
            this.f241252g = str;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f241251f = parcel.readString();
            this.f241252g = parcel.readString();
            this.f241253h = parcel.readString();
            this.f241254i = parcel.readString();
            this.f241255j = parcel.readString();
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C75339i.class;
            this.f241251f = C75592q0.m90789s();
            if (!TextUtils.isEmpty(this.f241252g)) {
                this.f241253h = ((C75339i) C86312j.m106911c(cls)).mo62514P1(this.f241252g);
                this.f241254i = ((C75339i) C86312j.m106911c(cls)).mo62515Si(this.f241252g);
                C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(this.f241252g);
                if (Lo != null) {
                    String c = Lo.mo93594c();
                    this.f241255j = c;
                    if (Util.isNullOrNil(c)) {
                        this.f241255j = Lo.mo93597f();
                    }
                }
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f241251f);
            parcel.writeString(this.f241252g);
            parcel.writeString(this.f241253h);
            parcel.writeString(this.f241254i);
            parcel.writeString(this.f241255j);
        }

        public GetUserDataTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
