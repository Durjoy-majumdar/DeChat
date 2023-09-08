package com.tencent.p014mm.plugin.appbrand.jsapi.scanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.scanner.C1858c;
import di3.C86312j;
import ke3.C88144b;
import kr0.C88267e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONArray;
import org.json.JSONObject;
import p225rc.C89916g;
import p728vs.C52990d;
import p728vs.C52991e;
import qe3.C12212g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode */
public class JsApiScanCode extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 148;
    public static final String NAME = "scanCode";

    /* renamed from: g */
    public static volatile boolean f11668g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask */
    public static class GetA8KeyTask extends MainProcessTask {
        public static final Parcelable.Creator<GetA8KeyTask> CREATOR = new C1855b();

        /* renamed from: f */
        public String f11669f;

        /* renamed from: g */
        public int f11670g;

        /* renamed from: h */
        public String f11671h;

        /* renamed from: i */
        public int f11672i;

        /* renamed from: j */
        public int f11673j;

        /* renamed from: n */
        public Runnable f11674n;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask$a */
        public class C1854a implements l0$$e {

            /* renamed from: d */
            public final /* synthetic */ C52991e f11675d;

            public C1854a(C52991e eVar) {
                this.f11675d = eVar;
            }

            /* renamed from: a */
            public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
                if (i == 0 && i2 == 0) {
                    GetA8KeyTask.this.f11670g = this.f11675d.mo63058K();
                    GetA8KeyTask getA8KeyTask = GetA8KeyTask.this;
                    if (getA8KeyTask.f11670g != 26) {
                        getA8KeyTask.f11671h = "";
                    } else {
                        getA8KeyTask.f11671h = this.f11675d.mo63062R();
                    }
                    GetA8KeyTask.this.mo114394b();
                    return 0;
                }
                GetA8KeyTask getA8KeyTask2 = GetA8KeyTask.this;
                getA8KeyTask2.f11670g = -1;
                getA8KeyTask2.mo114394b();
                return 0;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask$b */
        public class C1855b implements Parcelable.Creator<GetA8KeyTask> {
            public Object createFromParcel(Parcel parcel) {
                GetA8KeyTask getA8KeyTask = new GetA8KeyTask();
                getA8KeyTask.mo1551g(parcel);
                return getA8KeyTask;
            }

            public Object[] newArray(int i) {
                return new GetA8KeyTask[i];
            }
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11669f = parcel.readString();
            this.f11670g = parcel.readInt();
            this.f11671h = parcel.readString();
            this.f11672i = parcel.readInt();
            this.f11673j = parcel.readInt();
        }

        /* renamed from: i */
        public void mo1552i() {
            Runnable runnable = this.f11674n;
            if (runnable != null) {
                ((C1858c.C1859a) runnable).run();
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            C52991e nq02 = ((C52990d) C86312j.m106911c(C52990d.class)).nq0(this.f11669f, (String) null, 36, 0, this.f11672i, this.f11673j, (String) null, C12212g.m11775a(), new byte[0]);
            C89144l0.m111429e(nq02.getCommReqResp(), new C1854a(nq02), true);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11669f);
            parcel.writeInt(this.f11670g);
            parcel.writeString(this.f11671h);
            parcel.writeInt(this.f11672i);
            parcel.writeInt(this.f11673j);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int[] iArr;
        C88267e eVar = (C88267e) fVar;
        if (f11668g) {
            eVar.mo109647a(i, mo115109j("cancel"));
            return;
        }
        f11668g = true;
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        C89916g.m112446a(o0).mo124232f(new C1858c(this, eVar, i));
        Intent intent = new Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 1);
        intent.putExtra("key_show_scan_tips", false);
        intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
        intent.putExtra("key_set_result_after_scan", true);
        intent.putExtra("key_is_hide_right_btn", jSONObject.optBoolean("onlyFromCamera", false));
        intent.putExtra("key_for_jsapi_use", true);
        JSONArray optJSONArray = jSONObject.optJSONArray("scanType");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            iArr = new int[]{2, 1, 3};
        } else {
            iArr = new int[optJSONArray.length()];
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString = optJSONArray.optString(i2);
                optString.getClass();
                char c = 65535;
                switch (optString.hashCode()) {
                    case -993060056:
                        if (optString.equals("pdf417")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -952485970:
                        if (optString.equals("qrCode")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -775169938:
                        if (optString.equals("wxCode")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -334537568:
                        if (optString.equals("barCode")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 2003869675:
                        if (optString.equals("datamatrix")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        iArr[i2] = 4;
                        break;
                    case 1:
                        iArr[i2] = 2;
                        break;
                    case 2:
                        iArr[i2] = 3;
                        break;
                    case 3:
                        iArr[i2] = 1;
                        break;
                    case 4:
                        iArr[i2] = 5;
                        break;
                }
            }
        }
        intent.putExtra("key_support_scan_code_type", iArr);
        intent.putExtra("key_enable_multi_code", true);
        intent.putExtra("key_scan_entry_scene", 4);
        intent.putExtra("key_scan_report_enter_scene", 9);
        C88144b.m109796n(o0, "scanner", ".ui.BaseScanUI", intent, hashCode() & 65535, false);
    }
}
