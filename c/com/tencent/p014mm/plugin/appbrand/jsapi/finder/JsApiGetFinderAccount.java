package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hp3.C87581a;
import o40.C61937h;
import ob0.C89132b;
import org.json.JSONObject;
import p496dr.C31264b;
import te3.C51430tq0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount */
public class JsApiGetFinderAccount extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "getFinderAccount";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        new GetFinderAccountTask((C81925i2) fVar, i).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount$GetFinderAccountTask */
    public static class GetFinderAccountTask extends MainProcessTask {
        public static final Parcelable.Creator<GetFinderAccountTask> CREATOR = new C55501b();

        /* renamed from: f */
        public C81925i2 f158088f;

        /* renamed from: g */
        public int f158089g;

        /* renamed from: h */
        public String f158090h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount$GetFinderAccountTask$a */
        public class C55500a implements C87581a<Void, C89132b.C89134c<C51430tq0>> {
            public C55500a() {
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                int i = cVar.f256793a;
                int i2 = cVar.f256794b;
                String str = cVar.f256795c;
                Log.m105925i("MicroMsg.Finder.JsApiGetFinderAccount", "[JsApiGetFinderAccount] errType=%s errCode=%s errMsg=%s", Integer.valueOf(i), Integer.valueOf(i2), str);
                JSONObject jSONObject = new JSONObject();
                if (i == 0 && i2 == 0) {
                    try {
                        C51430tq0 tq02 = (C51430tq0) cVar.f256796d;
                        if (!tq02.f142337d.isEmpty()) {
                            C61937h.m72704c(tq02.f142337d.get(0), jSONObject);
                            GetFinderAccountTask.this.f158090h = C1690a.m1745a("", 0, jSONObject);
                        } else {
                            GetFinderAccountTask.this.f158090h = C1690a.m1745a("not contact", -1, jSONObject);
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Finder.JsApiGetFinderAccount", e, "GetFinderAccountTask runInMainProcess", new Object[0]);
                        GetFinderAccountTask.this.f158090h = C1690a.m1745a(e.getMessage(), -1, jSONObject);
                    }
                } else if (i == 4) {
                    GetFinderAccountTask.this.f158090h = C1690a.m1745a(str, i2, jSONObject);
                } else {
                    GetFinderAccountTask.this.f158090h = C1690a.m1745a(str, -1, jSONObject);
                }
                GetFinderAccountTask.this.mo114394b();
                return null;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount$GetFinderAccountTask$b */
        public class C55501b implements Parcelable.Creator<GetFinderAccountTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetFinderAccountTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetFinderAccountTask[i];
            }
        }

        public GetFinderAccountTask(C81925i2 i2Var, int i) {
            this.f158088f = i2Var;
            this.f158089g = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f158090h = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            Log.m105925i("MicroMsg.Finder.JsApiGetFinderAccount", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", this.f158088f.getAppId(), this.f158090h, Integer.valueOf(this.f158089g), Boolean.valueOf(this.f158088f.isRunning()));
            this.f158088f.mo109647a(this.f158089g, this.f158090h);
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            ((C31264b) C86312j.m106911c(C31264b.class)).mo58045v4("JsApiGetFinderAccount").mo9225i().mo123420E(new C55500a());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f158090h);
        }

        public GetFinderAccountTask(Parcel parcel) {
            this.f158090h = parcel.readString();
        }
    }
}
