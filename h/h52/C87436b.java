package h52;

import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j52.C87881g;
import java.util.Map;
import lu3.C88654b;
import p166hy.C98559a0;
import zt3.C119157j;

/* renamed from: h52.b */
public class C87436b implements C98559a0 {

    /* renamed from: a */
    public final /* synthetic */ C88654b f253342a;

    /* renamed from: b */
    public final /* synthetic */ C87438c f253343b;

    /* renamed from: h52.b$a */
    public class C87437a implements Runnable {
        public C87437a() {
        }

        public void run() {
            long j;
            char c;
            Class cls = IMagicBrushMonitor.class;
            C87438c cVar = C87436b.this.f253343b;
            int i = cVar.f253353o;
            if (i == 0) {
                cVar.f253354p = "image";
            } else if (i == 1) {
                cVar.f253354p = "sight";
            }
            Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "magicbrush_cnddownload_callback_thread run taskid:%s", cVar.f253357s);
            if (!C87436b.this.f253343b.f253347f) {
                C87436b.this.f253343b.f253347f = true;
                String str = C87436b.this.f253343b.f253352n;
                if (C86013q1.m106450k(str)) {
                    long l = C86013q1.m106451l(str);
                    Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "getFileLength, fileLength :%d", Long.valueOf(l));
                    j = l;
                } else {
                    Log.m105920e("MicroMsg.MagicBrushCDNDownloadWorker", "getFileLength, file not exist");
                    j = 0;
                }
                if (C87436b.this.f253343b.f253346e) {
                    C87438c cVar2 = C87436b.this.f253343b;
                    long j2 = j;
                    cVar2.f253345d.mo121896b(cVar2.f253352n, cVar2.f253354p, cVar2.f253349h, 0, j2, (Map) null);
                    C87438c cVar3 = C87436b.this.f253343b;
                    long currentTimeMillis = System.currentTimeMillis() - C87436b.this.f253343b.f253356r;
                    cVar3.getClass();
                    j = j2;
                    if (j <= 0 || currentTimeMillis <= 0) {
                        c = 2;
                        Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "reportCDNSpeed len:%d, time:%d return", Long.valueOf(j), Long.valueOf(currentTimeMillis));
                    } else {
                        String name = IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskSpeedOtherNet.name();
                        double d = (((double) j) / ((double) currentTimeMillis)) * 0.9765625d;
                        if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
                            name = IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskSpeed2G.name();
                        } else if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
                            name = IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskSpeed3G.name();
                        } else if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
                            name = IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskSpeed4G.name();
                        } else if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                            name = IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskSpeedWIFI.name();
                        }
                        ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(name, 1, (String) null);
                        Double valueOf = Double.valueOf(d);
                        c = 2;
                        Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "reportCDNSpeed len:%d, time:%d, speed:%f, key:%s", Long.valueOf(j), Long.valueOf(currentTimeMillis), valueOf, name);
                    }
                } else {
                    c = 2;
                    C87438c cVar4 = C87436b.this.f253343b;
                    cVar4.f253345d.mo121898d(cVar4.f253352n, cVar4.f253349h, "force stop", 300004);
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                C87438c cVar5 = C87436b.this.f253343b;
                int i2 = (int) (currentTimeMillis2 - cVar5.f253356r);
                Object[] objArr = new Object[5];
                objArr[0] = cVar5.f253357s;
                objArr[1] = cVar5.f253354p;
                objArr[c] = Integer.valueOf(i2);
                C87438c cVar6 = C87436b.this.f253343b;
                objArr[3] = cVar6.f253352n;
                objArr[4] = cVar6.f253349h;
                Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload file finished taskid:%s,contentType:%s,cost time:%d,filePath:%s,uri:%s", objArr);
                C87438c cVar7 = C87436b.this.f253343b;
                cVar7.f253345d.mo121899e(cVar7.f253357s);
                C87438c cVar8 = C87436b.this.f253343b;
                String str2 = cVar8.f253348g;
                String str3 = cVar8.f253359u;
                String str4 = cVar8.f253349h;
                int currentTimeMillis3 = (int) (System.currentTimeMillis() - cVar8.f253358t);
                C87438c cVar9 = C87436b.this.f253343b;
                C87881g.m109359a(str2, str3, "GET", str4, 0, j, 0, 1, currentTimeMillis3, cVar9.f253352n, cVar9.f253354p);
                ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskSuccess.name(), 1, (String) null);
                ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskSuccessCost.name(), i2, (String) null);
                return;
            }
            Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload onDownloaded already callback taskid:%s", C87436b.this.f253343b.f253357s);
        }
    }

    public C87436b(C87438c cVar, C88654b bVar) {
        this.f253343b = cVar;
        this.f253342a = bVar;
    }

    /* renamed from: a */
    public void mo121891a() {
        Class cls = IMagicBrushMonitor.class;
        C88654b bVar = this.f253342a;
        if (bVar != null) {
            bVar.mo97819a();
        }
        if (!this.f253343b.f253347f) {
            this.f253343b.f253347f = true;
            C87438c cVar = this.f253343b;
            cVar.f253345d.mo121898d(cVar.f253352n, cVar.f253349h, "fail:cdn download fail", 303306);
            C87438c cVar2 = this.f253343b;
            String str = cVar2.f253348g;
            String str2 = cVar2.f253359u;
            String str3 = cVar2.f253349h;
            int currentTimeMillis = (int) (System.currentTimeMillis() - cVar2.f253358t);
            C87438c cVar3 = this.f253343b;
            C87881g.m109359a(str, str2, "GET", str3, 0, 0, 0, 2, currentTimeMillis, cVar3.f253352n, cVar3.f253354p);
            long currentTimeMillis2 = System.currentTimeMillis();
            C87438c cVar4 = this.f253343b;
            int i = (int) (currentTimeMillis2 - cVar4.f253356r);
            C87438c cVar5 = this.f253343b;
            Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload file error taskid:%s,cost time:%d,filePath:%s,uri:%s", cVar4.f253357s, Integer.valueOf(i), cVar5.f253352n, cVar5.f253349h);
            ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskFail.name(), 1, (String) null);
            ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskFailCost.name(), i, (String) null);
        } else {
            Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload onDownloadError already callback taskid:%s", this.f253343b.f253357s);
        }
        C87438c cVar6 = this.f253343b;
        cVar6.mo121894b(cVar6.f253352n);
    }

    /* renamed from: b */
    public void mo121892b() {
        C88654b bVar = this.f253342a;
        if (bVar != null) {
            bVar.mo97819a();
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C87437a());
    }
}
