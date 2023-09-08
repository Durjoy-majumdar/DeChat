package h52;

import android.os.AsyncTask;
import android.webkit.URLUtil;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import d42.C86185m;
import di3.C86312j;
import j52.C87881g;
import p166hy.C87602w;
import zt3.C119157j;

/* renamed from: h52.c */
public class C87438c extends AsyncTask<Void, Void, String> implements C86185m {

    /* renamed from: d */
    public final C87439d f253345d;

    /* renamed from: e */
    public volatile boolean f253346e = false;

    /* renamed from: f */
    public volatile boolean f253347f = false;

    /* renamed from: g */
    public String f253348g;

    /* renamed from: h */
    public String f253349h;

    /* renamed from: i */
    public String f253350i;

    /* renamed from: j */
    public String f253351j;

    /* renamed from: n */
    public String f253352n;

    /* renamed from: o */
    public int f253353o;

    /* renamed from: p */
    public String f253354p = "unknow";

    /* renamed from: q */
    public int f253355q = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: r */
    public long f253356r;

    /* renamed from: s */
    public String f253357s;

    /* renamed from: t */
    public long f253358t;

    /* renamed from: u */
    public String f253359u;

    public C87438c(String str, String str2, String str3, String str4, int i, C87439d dVar) {
        this.f253348g = str;
        this.f253349h = str2;
        this.f253351j = str4;
        this.f253350i = str3;
        this.f253352n = str4 + str3;
        this.f253353o = i;
        this.f253345d = dVar;
        this.f253358t = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo120593a() {
        this.f253346e = false;
        cancel(true);
    }

    /* renamed from: b */
    public final boolean mo121894b(String str) {
        if (!C86013q1.m106450k(str)) {
            Log.m105924i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, file not exists");
            return true;
        } else if (C86013q1.m106447h(str)) {
            Log.m105924i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, succ");
            return true;
        } else {
            Log.m105924i("MicroMsg.MagicBrushCDNDownloadWorker", "delErrFile, failed");
            return false;
        }
    }

    public Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (!URLUtil.isHttpsUrl(this.f253349h) && !URLUtil.isHttpUrl(this.f253349h)) {
            this.f253345d.mo121898d(this.f253352n, this.f253349h, "downloadFile protocol must be http or https", 300005);
        } else if (!this.f253346e) {
            this.f253345d.mo121898d(this.f253352n, this.f253349h, "force stop", 300004);
            C87881g.m109359a(this.f253348g, this.f253359u, "GET", this.f253349h, 0, 0, 0, 2, (int) (System.currentTimeMillis() - this.f253358t), this.f253352n, this.f253354p);
        } else {
            this.f253356r = System.currentTimeMillis();
            this.f253345d.mo121897c(this.f253352n, this.f253349h);
            ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskCount.name(), 1, (String) null);
            Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "downloadCronetFile prepare to start download taskid is %s, filePath is %s, uri is %s", this.f253357s, this.f253352n, this.f253349h);
            C87435a aVar = new C87435a(this);
            C87436b bVar = new C87436b(this, aVar);
            ((C119157j) C119157j.f356862d).mo183878i(aVar, (long) this.f253355q);
            Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "startCDNDownload taskId:%s", this.f253357s);
            try {
                ((C87602w) C86312j.m106911c(C87602w.class)).mo121824Br(this.f253351j, this.f253350i, this.f253349h, this.f253353o, bVar);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MagicBrushCDNDownloadWorker", e, "doInBackground Exception uri:%s", this.f253349h);
                mo121894b(this.f253352n);
                if (!this.f253347f) {
                    this.f253347f = true;
                    this.f253345d.mo121898d(this.f253352n, this.f253349h, "call cdndownload error", 300004);
                }
            }
        }
        return null;
    }

    public String getTaskId() {
        return this.f253357s;
    }
}
