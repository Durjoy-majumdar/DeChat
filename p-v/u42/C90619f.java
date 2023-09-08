package u42;

import android.content.Context;
import com.tencent.p014mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadProgressUpdate;
import com.tencent.p014mm.plugin.magicbrush.jsapi.downloadtask.MBJsEventDownloadStateChange;
import di3.C86312j;
import e42.C7596h;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import p237sp.C90271s;
import s42.C90126a;
import s42.C90130d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lu42/f;", "Ls42/d;", "<init>", "()V", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90126a(name = "resumeDownloadTask")
/* renamed from: u42.f */
public final class C90619f extends C90130d {

    /* renamed from: u42.f$a */
    public static final class C90620a implements C90271s.C13750a {

        /* renamed from: a */
        public final /* synthetic */ C90619f f260342a;

        /* renamed from: b */
        public final /* synthetic */ C8478d0 f260343b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<String> f260344c;

        public C90620a(C90619f fVar, C8478d0 d0Var, C8479f0<String> f0Var) {
            this.f260342a = fVar;
            this.f260343b = d0Var;
            this.f260344c = f0Var;
        }

        /* renamed from: a */
        public void mo13117a(JSONObject jSONObject) {
            C90619f fVar = this.f260342a;
            MBJsEventDownloadStateChange mBJsEventDownloadStateChange = new MBJsEventDownloadStateChange();
            mBJsEventDownloadStateChange.f81582e = String.valueOf(jSONObject);
            fVar.mo124394b(mBJsEventDownloadStateChange);
        }

        /* renamed from: b */
        public void mo13120b(int i, T t) {
            if (i == 0) {
                C90619f fVar = this.f260342a;
                fVar.mo124393a(fVar.mo124396e());
                return;
            }
            this.f260343b.f27483d = i;
            C8479f0<String> f0Var = this.f260344c;
            if (t == null) {
                t = "";
            }
            f0Var.f27484d = t;
            C90619f fVar2 = this.f260342a;
            fVar2.mo124393a(fVar2.mo124395d(i, t));
        }

        /* renamed from: c */
        public void mo13118c(float f, long j, long j2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", Float.valueOf(f));
            jSONObject.put("totalBytesWritten", j);
            jSONObject.put("totalBytesExpectedToWrite", j2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            C90619f fVar = this.f260342a;
            MBJsEventDownloadProgressUpdate mBJsEventDownloadProgressUpdate = new MBJsEventDownloadProgressUpdate();
            mBJsEventDownloadProgressUpdate.f81582e = jSONObject2;
            fVar.mo124394b(mBJsEventDownloadProgressUpdate);
        }

        /* renamed from: d */
        public void mo13119d(JSONObject jSONObject) {
        }
    }

    /* renamed from: c */
    public void mo73403c(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        C8478d0 d0Var = new C8478d0();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        ((C90271s) C86312j.m106911c(C90271s.class)).mo12601OW((Context) null, hVar.optLong("downloadId"), hVar, new C90620a(this, d0Var, f0Var));
    }
}
