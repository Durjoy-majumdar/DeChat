package ly1;

import android.text.TextUtils;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.media.GameVideoDownloadUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86009m1;
import nj3.C76912y0;
import p1081gi.C98121d;
import p1081gi.C98127h;
import sw1.C101703s;

/* renamed from: ly1.n0 */
public class C99762n0 implements C98127h.C98128a {

    /* renamed from: d */
    public final /* synthetic */ long f292377d;

    /* renamed from: e */
    public final /* synthetic */ String f292378e;

    /* renamed from: f */
    public final /* synthetic */ C101703s.C101704a f292379f;

    /* renamed from: g */
    public final /* synthetic */ GameVideoDownloadUI f292380g;

    /* renamed from: ly1.n0$a */
    public class C99763a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f292381d;

        /* renamed from: e */
        public final /* synthetic */ long f292382e;

        public C99763a(long j, long j2) {
            this.f292381d = j;
            this.f292382e = j2;
        }

        public void run() {
            C99762n0.this.f292380g.f271760p.setProgress((int) ((this.f292381d * 100) / this.f292382e));
        }
    }

    public C99762n0(GameVideoDownloadUI gameVideoDownloadUI, long j, String str, C101703s.C101704a aVar) {
        this.f292380g = gameVideoDownloadUI;
        this.f292377d = j;
        this.f292378e = str;
        this.f292379f = aVar;
    }

    /* renamed from: e */
    public void mo17917e(String str, long j, long j2) {
        Log.m105919d("MicroMsg.Haowan.GameVideoDownloadUI", "download video offset:%d, total:%d", Long.valueOf(j), Long.valueOf(j2));
        if (this.f292380g.f271754g.equals(str) && j2 != 0) {
            MMHandlerThread.postToMainThread(new C99763a(j, j2));
        }
    }

    /* renamed from: g */
    public void mo17918g(String str, int i, C98121d dVar) {
        Log.m105925i("MicroMsg.Haowan.GameVideoDownloadUI", "download video mediaId:%s, rawMediaId:%s", str, this.f292380g.f271754g);
        if (this.f292380g.f271754g.equals(str)) {
            Log.m105925i("MicroMsg.Haowan.GameVideoDownloadUI", "download video cost time:%d", Long.valueOf(System.currentTimeMillis() - this.f292377d));
            if (i == 0) {
                Log.m105925i("MicroMsg.Haowan.GameVideoDownloadUI", "download video[%s] success", this.f292378e);
            } else {
                Log.m105925i("MicroMsg.Haowan.GameVideoDownloadUI", "download video[%s] fail, ret:%d", this.f292378e, Integer.valueOf(i));
            }
            if (i == 0 && !TextUtils.isEmpty(this.f292380g.f271758n)) {
                C86009m1 m1Var = new C86009m1(this.f292380g.f271758n);
                if (m1Var.mo119967g()) {
                    Log.m105925i("MicroMsg.Haowan.GameVideoDownloadUI", "download file size:%d", Long.valueOf(m1Var.mo119980r()));
                    ((GameVideoDownloadUI.C94106e) this.f292379f).mo129166a(this.f292380g.f271758n, 0, 0);
                    return;
                }
            }
            C76912y0.makeText(this.f292380g.f271753f, (int) C0966R.string.fcg, 1).show();
            C101703s.C101704a aVar = this.f292379f;
            if (aVar != null) {
                ((GameVideoDownloadUI.C94106e) aVar).mo129166a(this.f292380g.f271758n, 2, i);
            }
        }
    }

    public void onDataAvailable(String str, long j, long j2) {
    }

    public void onM3U8Ready(String str, String str2) {
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
    }
}
