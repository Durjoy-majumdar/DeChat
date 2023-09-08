package ly1;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.game.commlib.view.CycleProgressView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p159gw.C98250h;
import p682rz.C101487r;

/* renamed from: ly1.m0 */
public class C99757m0 implements C99775t0 {

    /* renamed from: f */
    public static final String f292364f = (C41872f.m45392b(C41872f.C41873a.ONE_WEEK) + "video/");

    /* renamed from: a */
    public MMActivity f292365a;

    /* renamed from: b */
    public String f292366b;

    /* renamed from: c */
    public String f292367c;

    /* renamed from: d */
    public CycleProgressView f292368d;

    /* renamed from: e */
    public C99760b f292369e;

    /* renamed from: ly1.m0$a */
    public class C99758a implements C98127h.C98128a {

        /* renamed from: d */
        public final /* synthetic */ long f292370d;

        /* renamed from: e */
        public final /* synthetic */ String f292371e;

        /* renamed from: ly1.m0$a$a */
        public class C99759a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f292373d;

            /* renamed from: e */
            public final /* synthetic */ long f292374e;

            public C99759a(long j, long j2) {
                this.f292373d = j;
                this.f292374e = j2;
            }

            public void run() {
                C99757m0.this.f292368d.setProgress((int) ((this.f292373d * 100) / this.f292374e));
            }
        }

        public C99758a(long j, String str) {
            this.f292370d = j;
            this.f292371e = str;
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            Log.m105919d("MicroMsg.GameVideoDownloadPerform", "download video offset:%d, total:%d", Long.valueOf(j), Long.valueOf(j2));
            if (C99757m0.this.f292366b.equals(str) && j2 != 0) {
                MMHandlerThread.postToMainThread(new C99759a(j, j2));
            }
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            Log.m105925i("MicroMsg.GameVideoDownloadPerform", "download video mediaId:%s, rawMediaId:%s", str, C99757m0.this.f292366b);
            if (C99757m0.this.f292366b.equals(str)) {
                Log.m105925i("MicroMsg.GameVideoDownloadPerform", "download video cost time:%d", Long.valueOf(System.currentTimeMillis() - this.f292370d));
                if (i == 0) {
                    Log.m105925i("MicroMsg.GameVideoDownloadPerform", "download video[%s] success", this.f292371e);
                } else {
                    Log.m105925i("MicroMsg.GameVideoDownloadPerform", "download video[%s] fail, ret:%d", this.f292371e, Integer.valueOf(i));
                }
                if (i == 0 && !TextUtils.isEmpty(C99757m0.this.f292367c)) {
                    C86009m1 m1Var = new C86009m1(C99757m0.this.f292367c);
                    if (m1Var.mo119967g()) {
                        Log.m105925i("MicroMsg.GameVideoDownloadPerform", "download file size:%d", Long.valueOf(m1Var.mo119980r()));
                        C99757m0 m0Var = C99757m0.this;
                        String o502 = ((C98250h) C86312j.m106911c(C98250h.class)).o50(m0Var.f292365a, m0Var.f292367c);
                        if (o502 != null) {
                            AndroidMediaUtil.refreshMediaScanner(o502, MMApplicationContext.getContext());
                        }
                        C99757m0 m0Var2 = C99757m0.this;
                        m0Var2.f292365a.setResult(-1, new Intent().putExtra("ret_info", String.valueOf(0)));
                        m0Var2.f292365a.finish();
                        return;
                    }
                }
                C99757m0 m0Var3 = C99757m0.this;
                m0Var3.f292365a.setResult(-1, new Intent().putExtra("ret_info", String.valueOf(i)));
                m0Var3.f292365a.finish();
            }
        }

        public void onDataAvailable(String str, long j, long j2) {
        }

        public void onM3U8Ready(String str, String str2) {
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        }
    }

    /* renamed from: ly1.m0$b */
    public class C99760b implements Runnable {

        /* renamed from: d */
        public C98127h f292376d;

        public C99760b(C99757m0 m0Var, C98127h hVar) {
            this.f292376d = hVar;
        }

        public void run() {
            if (this.f292376d != null) {
                ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126981e(this.f292376d, false);
            }
        }
    }

    public C99757m0(MMActivity mMActivity) {
        this.f292365a = mMActivity;
    }

    /* renamed from: a */
    public final void mo139119a() {
        Log.m105924i("MicroMsg.GameVideoDownloadPerform", "cancel video download!");
        this.f292365a.setResult(0);
        this.f292365a.finish();
    }

    /* renamed from: b */
    public final void mo139120b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_GameVideoDownloadUI";
        hVar.field_mediaId = this.f292366b;
        hVar.f287705p0 = str;
        hVar.f287689V = 0;
        hVar.f287655L = 3;
        hVar.f287696Y0 = 4;
        C86013q1.m106461v(C86013q1.m106458s(this.f292367c));
        hVar.field_fullpath = this.f292367c;
        hVar.f287704f1 = new C99758a(currentTimeMillis, str);
        C99760b bVar = new C99760b(this, hVar);
        this.f292369e = bVar;
        MMHandlerThread.postToMainThreadDelayed(bVar, 500);
    }
}
