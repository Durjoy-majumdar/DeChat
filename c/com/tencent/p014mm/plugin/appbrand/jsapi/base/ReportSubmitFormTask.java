package com.tencent.p014mm.plugin.appbrand.jsapi.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C50656ob;
import te3.C50806pb;
import te3.s75;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask */
public class ReportSubmitFormTask extends MainProcessTask {
    public static final Parcelable.Creator<ReportSubmitFormTask> CREATOR = new C40456b();

    /* renamed from: f */
    public int f108733f;

    /* renamed from: g */
    public String f108734g;

    /* renamed from: h */
    public String f108735h;

    /* renamed from: i */
    public String f108736i;

    /* renamed from: j */
    public int f108737j;

    /* renamed from: n */
    public int f108738n;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask$a */
    public class C40455a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C50656ob f108739d;

        public C40455a(C50656ob obVar) {
            this.f108739d = obVar;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                return 0;
            }
            synchronized (ReportSubmitFormTask.this.getClass()) {
                ReportSubmitFormTask.m43664q(ReportSubmitFormTask.this, this.f108739d.f139076d);
            }
            Log.m105921e("MicroMsg.ReportSubmitFormTask", "Error: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask$b */
    public class C40456b implements Parcelable.Creator<ReportSubmitFormTask> {
        public Object createFromParcel(Parcel parcel) {
            ReportSubmitFormTask reportSubmitFormTask = new ReportSubmitFormTask();
            reportSubmitFormTask.mo1551g(parcel);
            return reportSubmitFormTask;
        }

        public Object[] newArray(int i) {
            return new ReportSubmitFormTask[i];
        }
    }

    public ReportSubmitFormTask() {
    }

    /* renamed from: q */
    public static void m43664q(ReportSubmitFormTask reportSubmitFormTask, LinkedList linkedList) {
        linkedList.addAll(reportSubmitFormTask.mo63212t());
        JSONArray jSONArray = new JSONArray();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            s75 s75 = (s75) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", s75.f141361d);
                jSONObject.put("appid", s75.f141362e);
                jSONObject.put("formid", s75.f141363f);
                jSONObject.put("pageid", s75.f141364g);
                jSONObject.put("appstate", s75.f141365h);
                jSONObject.put("appversion", s75.f141366i);
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ReportSubmitFormTask", e.getMessage());
            }
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_FAILED_FORMID_STRING, jSONArray.toString());
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f108733f = parcel.readInt();
        this.f108734g = parcel.readString();
        this.f108735h = parcel.readString();
        this.f108736i = parcel.readString();
        this.f108737j = parcel.readInt();
        this.f108738n = parcel.readInt();
    }

    /* renamed from: j */
    public void mo1553j() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50656ob();
        bVar.f127067b = new C50806pb();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxausrevent/batchrecordwxatemplatemsgevent";
        bVar.f127069d = 1129;
        C47350c a = bVar.mo72403a();
        C50656ob obVar = (C50656ob) a.f127055a.f127080a;
        obVar.f139076d = new LinkedList<>();
        s75 s75 = new s75();
        s75.f141361d = this.f108733f;
        s75.f141362e = this.f108734g;
        s75.f141363f = this.f108735h;
        s75.f141364g = this.f108736i;
        s75.f141365h = this.f108737j;
        s75.f141366i = this.f108738n;
        obVar.f139076d.add(s75);
        synchronized (getClass()) {
            obVar.f139076d.addAll(mo63212t());
        }
        C89144l0.m111429e(a, new C40455a(obVar), false);
    }

    /* renamed from: t */
    public final LinkedList<s75> mo63212t() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APP_BRAND_FAILED_FORMID_STRING;
        LinkedList<s75> linkedList = new LinkedList<>();
        try {
            JSONArray jSONArray = new JSONArray((String) C86709a0.m107535s().mo121142i().mo119685f(aVar, (Object) null));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                s75 s75 = new s75();
                s75.f141361d = jSONObject.getInt("type");
                s75.f141362e = jSONObject.getString("appid");
                s75.f141363f = jSONObject.getString("formid");
                s75.f141364g = jSONObject.getString("pageid");
                s75.f141365h = jSONObject.getInt("appstate");
                s75.f141366i = jSONObject.getInt("appversion");
                linkedList.add(s75);
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ReportSubmitFormTask", e.getMessage());
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        return linkedList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f108733f);
        parcel.writeString(this.f108734g);
        parcel.writeString(this.f108735h);
        parcel.writeString(this.f108736i);
        parcel.writeInt(this.f108737j);
        parcel.writeInt(this.f108738n);
    }

    public ReportSubmitFormTask(C90988l lVar) {
        this.f108734g = lVar.f261062e;
        this.f108737j = lVar.f261072r.f238585d;
        this.f108738n = lVar.f261072r.pkgVersion;
    }
}
