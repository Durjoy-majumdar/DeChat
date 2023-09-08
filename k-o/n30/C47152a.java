package n30;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: n30.a */
public class C47152a {

    /* renamed from: n30.a$a */
    public class C47153a implements CronetLogic.CronetTaskCallback {

        /* renamed from: a */
        public final /* synthetic */ C81038d0 f126681a;

        /* renamed from: b */
        public final /* synthetic */ C47154b f126682b;

        /* renamed from: c */
        public final /* synthetic */ String f126683c;

        public C47153a(C81038d0 d0Var, C47154b bVar, String str) {
            this.f126681a = d0Var;
            this.f126682b = bVar;
            this.f126683c = str;
        }

        public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
        }

        public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
            return 0;
        }

        public void onCronetReceiveUploadProgress(long j, long j2) {
        }

        public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
            this.f126681a.getClass();
            Log.m105925i("KaraModelDownloadHelper", "downloadUrl onCronetTaskCompleted statusCode: %s", Integer.valueOf(cronetTaskResult.statusCode));
            if (cronetTaskResult.statusCode != 200) {
                this.f126682b.mo72243a();
            } else {
                this.f126682b.mo72244b(this.f126683c);
            }
        }

        public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        }
    }

    /* renamed from: n30.a$b */
    public interface C47154b {
        /* renamed from: a */
        void mo72243a();

        /* renamed from: b */
        void mo72244b(String str);
    }

    /* renamed from: a */
    public static void m52437a(String str, String str2, C47154b bVar) {
        C81038d0 d0Var = new C81038d0(str, 0);
        d0Var.f238054j = false;
        d0Var.f238053i = "GET";
        d0Var.f238056l = true;
        d0Var.f238063s = true;
        d0Var.f238058n = 2;
        d0Var.f238055k = str2;
        d0Var.f238057m = new C47153a(d0Var, bVar, str2);
        d0Var.mo112934h();
    }
}
