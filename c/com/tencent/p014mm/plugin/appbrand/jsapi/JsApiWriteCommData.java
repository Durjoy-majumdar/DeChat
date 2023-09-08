package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiWriteCommData */
public class JsApiWriteCommData extends C82268c {
    public static final int CTRL_INDEX = 445;
    public static final String NAME = "writeCommData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        new WriteCommDataTask(this, fVar, i, jSONObject).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiWriteCommData$WriteCommDataTask */
    public static class WriteCommDataTask extends MainProcessTask {
        public static final Parcelable.Creator<WriteCommDataTask> CREATOR = new C1573a();

        /* renamed from: f */
        public C82870p f11034f;

        /* renamed from: g */
        public C82381f f11035g;

        /* renamed from: h */
        public int f11036h;

        /* renamed from: i */
        public String f11037i;

        /* renamed from: j */
        public String f11038j;

        /* renamed from: n */
        public boolean f11039n;

        /* renamed from: o */
        public String f11040o;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiWriteCommData$WriteCommDataTask$a */
        public class C1573a implements Parcelable.Creator<WriteCommDataTask> {
            public Object createFromParcel(Parcel parcel) {
                return new WriteCommDataTask(parcel);
            }

            public Object[] newArray(int i) {
                return new WriteCommDataTask[i];
            }
        }

        public WriteCommDataTask(C82870p pVar, C82381f fVar, int i, JSONObject jSONObject) {
            this.f11034f = pVar;
            this.f11035g = fVar;
            this.f11036h = i;
            this.f11037i = jSONObject.optString("packageName");
            this.f11038j = jSONObject.optString("data");
            this.f11039n = true;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11037i = parcel.readString();
            this.f11038j = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f11039n = z;
            this.f11040o = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (this.f11039n) {
                if (Util.isNullOrNil(this.f11040o)) {
                    str = "fail";
                } else {
                    str = String.format("fail:%s", new Object[]{this.f11040o});
                }
                this.f11035g.mo109647a(this.f11036h, this.f11034f.mo115109j(str));
                return;
            }
            this.f11035g.mo109647a(this.f11036h, this.f11034f.mo115109j("ok"));
        }

        /* renamed from: j */
        public void mo1553j() {
            if (Util.isNullOrNil(this.f11037i)) {
                Log.m105920e("MicroMsg.JsApiWriteCommData", "packageName nil");
            } else {
                Context context = MMApplicationContext.getContext();
                this.f11039n = !context.getSharedPreferences(MMApplicationContext.getPackageName() + "_comm_preferences", 0).edit().putString(this.f11037i, this.f11038j).commit();
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11037i);
            parcel.writeString(this.f11038j);
            parcel.writeInt(this.f11039n ? 1 : 0);
            parcel.writeString(this.f11040o);
        }

        public WriteCommDataTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
