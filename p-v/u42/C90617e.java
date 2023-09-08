package u42;

import com.tencent.p014mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadProgressUpdate;
import com.tencent.p014mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange;
import di3.C86312j;
import e42.C7596h;
import e42.C86431j;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONObject;
import p237sp.C90271s;
import s42.C90126a;
import s42.C90130d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lu42/e;", "Ls42/d;", "<init>", "()V", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90126a(name = "queryDownloadTask")
/* renamed from: u42.e */
public final class C90617e extends C90130d {

    /* renamed from: h */
    public int f260339h;

    /* renamed from: i */
    public String f260340i = "";

    /* renamed from: u42.e$a */
    public static final class C90618a implements C90271s.C13750a {

        /* renamed from: a */
        public final /* synthetic */ C90617e f260341a;

        public C90618a(C90617e eVar) {
            this.f260341a = eVar;
        }

        /* renamed from: a */
        public void mo13117a(JSONObject jSONObject) {
            String optString = jSONObject != null ? jSONObject.optString("state", "") : null;
            if (!(optString == null || optString.length() == 0)) {
                C90617e eVar = this.f260341a;
                MBJsEventDownloadStateChange mBJsEventDownloadStateChange = new MBJsEventDownloadStateChange();
                mBJsEventDownloadStateChange.f81582e = String.valueOf(jSONObject);
                eVar.mo124394b(mBJsEventDownloadStateChange);
            }
        }

        /* renamed from: b */
        public void mo13120b(int i, String str) {
            C90617e eVar = this.f260341a;
            eVar.f260339h = i;
            if (str == null) {
                str = "";
            }
            eVar.getClass();
            eVar.f260340i = str;
            C90617e eVar2 = this.f260341a;
            eVar2.mo124393a(eVar2.mo124395d(eVar2.f260339h, eVar2.f260340i));
        }

        /* renamed from: c */
        public void mo13118c(float f, long j, long j2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", Float.valueOf(f));
            jSONObject.put("totalBytesWritten", j);
            jSONObject.put("totalBytesExpectedToWrite", j2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            C90617e eVar = this.f260341a;
            MBJsEventDownloadProgressUpdate mBJsEventDownloadProgressUpdate = new MBJsEventDownloadProgressUpdate();
            mBJsEventDownloadProgressUpdate.f81582e = jSONObject2;
            eVar.mo124394b(mBJsEventDownloadProgressUpdate);
        }

        /* renamed from: d */
        public void mo13119d(JSONObject jSONObject) {
            Iterator<String> keys;
            C7596h hVar = new C7596h();
            if (!(jSONObject == null || (keys = jSONObject.keys()) == null)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    hVar.put(next, jSONObject.get(next));
                }
            }
            C90617e eVar = this.f260341a;
            eVar.getClass();
            C86431j<?> jVar = eVar.f258825g;
            if (jVar != null) {
                jVar.mo120845j(hVar);
                eVar.mo124393a(hVar);
                return;
            }
            C87412m.m108603p("mFakeJsApi");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo73403c(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        ((C90271s) C86312j.m106911c(C90271s.class)).mo12603lv(hVar, new C90618a(this));
    }
}
