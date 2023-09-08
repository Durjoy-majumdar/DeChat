package com.tencent.p014mm.plugin.webview.luggage.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask */
public class JsApiMMTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiMMTask> CREATOR = new C43600b();

    /* renamed from: f */
    public C53096b.C53097a f117843f;

    /* renamed from: g */
    public String f117844g;

    /* renamed from: h */
    public String f117845h;

    /* renamed from: i */
    public String f117846i;

    /* renamed from: j */
    public String f117847j;

    /* renamed from: n */
    public String f117848n;

    /* renamed from: o */
    public boolean f117849o = false;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask$a */
    public class C43599a extends C43620m2.C5947b {
        public C43599a() {
        }

        /* renamed from: a */
        public void mo6945a(String str, JSONObject jSONObject) {
            JsApiMMTask jsApiMMTask = JsApiMMTask.this;
            jsApiMMTask.f117846i = str;
            if (jSONObject != null) {
                jsApiMMTask.f117847j = jSONObject.toString();
            }
            JsApiMMTask.this.mo114394b();
        }

        /* renamed from: b */
        public void mo6946b(String str, JSONObject jSONObject) {
            JsApiMMTask jsApiMMTask = JsApiMMTask.this;
            jsApiMMTask.f117848n = str;
            if (jSONObject != null) {
                jsApiMMTask.f117847j = jSONObject.toString();
            }
            JsApiMMTask.this.mo114394b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask$b */
    public class C43600b implements Parcelable.Creator<JsApiMMTask> {
        public Object createFromParcel(Parcel parcel) {
            return new JsApiMMTask(parcel, (C43599a) null);
        }

        public Object[] newArray(int i) {
            return new JsApiMMTask[i];
        }
    }

    public JsApiMMTask() {
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f117844g = parcel.readString();
        this.f117845h = parcel.readString();
        this.f117846i = parcel.readString();
        this.f117847j = parcel.readString();
        this.f117848n = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f117849o = z;
    }

    /* renamed from: i */
    public void mo1552i() {
        if (!this.f117849o) {
            mo114397h();
        }
        if (this.f117843f != null) {
            JSONObject jSONObject = null;
            try {
                jSONObject = TextUtils.isEmpty(this.f117847j) ? new JSONObject() : new JSONObject(this.f117847j);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiMMTask", e, "runInClientProcess fail.", new Object[0]);
            }
            if (TextUtils.isEmpty(this.f117848n)) {
                this.f117843f.mo73778c(this.f117846i, jSONObject);
                return;
            }
            CONTEXT context = this.f117843f.f148189a;
            if (context instanceof C53095a) {
                ((C53095a) context).getRuntime().mo73814a(this.f117848n, jSONObject);
            }
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        try {
            ((C43620m2) Class.forName(this.f117845h).newInstance()).mo5384d(MMApplicationContext.getContext(), this.f117844g, new C43599a());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiMMTask", e, "runInMainProcess fail.", new Object[0]);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117844g);
        parcel.writeString(this.f117845h);
        parcel.writeString(this.f117846i);
        parcel.writeString(this.f117847j);
        parcel.writeString(this.f117848n);
        parcel.writeInt(this.f117849o ? 1 : 0);
    }

    public JsApiMMTask(Parcel parcel, C43599a aVar) {
        mo1551g(parcel);
    }
}
