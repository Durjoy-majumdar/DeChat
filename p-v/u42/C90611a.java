package u42;

import android.content.Context;
import c30.C104289g;
import com.tencent.p014mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadProgressUpdate;
import com.tencent.p014mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange;
import di3.C86312j;
import e42.C7596h;
import e42.C86431j;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;
import p237sp.C90271s;
import s42.C90126a;
import s42.C90130d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lu42/a;", "Ls42/d;", "<init>", "()V", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90126a(name = "addDownloadTaskStraight")
/* renamed from: u42.a */
public final class C90611a extends C90130d {

    /* renamed from: u42.a$a */
    public static final class C90612a implements C90271s.C13750a {

        /* renamed from: a */
        public final /* synthetic */ HashMap<String, Object> f260329a;

        /* renamed from: b */
        public final /* synthetic */ C90611a f260330b;

        /* renamed from: c */
        public final /* synthetic */ C8478d0 f260331c;

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f260332d;

        public C90612a(HashMap<String, Object> hashMap, C90611a aVar, C8478d0 d0Var, C8479f0<String> f0Var) {
            this.f260329a = hashMap;
            this.f260330b = aVar;
            this.f260331c = d0Var;
            this.f260332d = f0Var;
        }

        /* renamed from: a */
        public void mo13117a(JSONObject jSONObject) {
            C90611a aVar = this.f260330b;
            MBJsEventDownloadStateChange mBJsEventDownloadStateChange = new MBJsEventDownloadStateChange();
            mBJsEventDownloadStateChange.f81582e = String.valueOf(jSONObject);
            aVar.mo124394b(mBJsEventDownloadStateChange);
        }

        /* renamed from: b */
        public void mo13120b(int i, T t) {
            if (i == 0) {
                this.f260329a.put("downloadId", t != null ? Long.valueOf(Long.parseLong(t)) : null);
                C90611a aVar = this.f260330b;
                HashMap<String, Object> hashMap = this.f260329a;
                aVar.getClass();
                C87412m.m108594g(hashMap, "map");
                C86431j<?> jVar = aVar.f258825g;
                if (jVar != null) {
                    aVar.mo124393a(jVar.mo120846k(hashMap));
                } else {
                    C87412m.m108603p("mFakeJsApi");
                    throw null;
                }
            } else {
                this.f260331c.f27483d = i;
                C8479f0<String> f0Var = this.f260332d;
                if (t == null) {
                    t = "";
                }
                f0Var.f27484d = t;
                C90611a aVar2 = this.f260330b;
                aVar2.mo124393a(aVar2.mo124395d(i, t));
            }
        }

        /* renamed from: c */
        public void mo13118c(float f, long j, long j2) {
            C104289g gVar = new C104289g();
            gVar.put("progress", Float.valueOf(f));
            gVar.mo145954o("totalBytesWritten", j);
            gVar.mo145954o("totalBytesExpectedToWrite", j2);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "JSONObject().apply {\n   …             }.toString()");
            C90611a aVar = this.f260330b;
            MBJsEventDownloadProgressUpdate mBJsEventDownloadProgressUpdate = new MBJsEventDownloadProgressUpdate();
            mBJsEventDownloadProgressUpdate.f81582e = gVar2;
            aVar.mo124394b(mBJsEventDownloadProgressUpdate);
        }

        /* renamed from: d */
        public void mo13119d(JSONObject jSONObject) {
        }
    }

    /* renamed from: c */
    public void mo73403c(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        HashMap hashMap = new HashMap();
        C8478d0 d0Var = new C8478d0();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        ((C90271s) C86312j.m106911c(C90271s.class)).mo12600Hg((Context) null, hVar, new C90612a(hashMap, this, d0Var, f0Var));
    }
}
