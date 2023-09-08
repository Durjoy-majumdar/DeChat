package n13;

import a12.C79450b;
import a70.C112760b;
import a70.C79471a;
import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.net.Uri;
import b12.C79645d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import cy3.C58003b;
import di3.C86312j;
import gy3.C87412m;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import kj2.C117407d;
import m13.C88689b;
import p910lj.C76701a;
import te3.C64828xf2;
import v02.C90734a;
import v02.C90737d;
import v02.a$$d;
import zt3.C119157j;

/* renamed from: n13.a */
public final class C88874a implements C40952u {

    /* renamed from: d */
    public final TinkerSyncResponse f256345d;

    /* renamed from: e */
    public final long f256346e;

    /* renamed from: f */
    public final HashMap<Long, Long> f256347f;

    /* renamed from: g */
    public final HashMap<String, Boolean> f256348g;

    /* renamed from: h */
    public final HashMap<Long, String> f256349h;

    /* renamed from: i */
    public final String f256350i = "MicroMsg.Updater.DownloadCallbackListener";

    /* renamed from: j */
    public volatile boolean f256351j;

    /* renamed from: n */
    public boolean f256352n;

    /* renamed from: n13.a$a */
    public static final class C88875a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88874a f256353d;

        public C88875a(C88874a aVar) {
            this.f256353d = aVar;
        }

        public final void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.k7f), 0).show();
            C88880b.m110961c();
            Integer num = this.f256353d.f256345d.f248340f;
            C87412m.m108593f(num, "response.packageType");
            C90737d.m113801i(10, num.intValue(), 101);
        }
    }

    /* renamed from: n13.a$b */
    public static final class C88876b implements Runnable {

        /* renamed from: d */
        public static final C88876b f256354d = new C88876b();

        public final void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.k7n), 0).show();
            C88880b bVar = C88880b.f256362a;
            C88880b.m110963j(bVar.mo123265f(C0966R.string.lib), bVar.mo123265f(C0966R.string.k7n), (PendingIntent) null);
        }
    }

    /* renamed from: n13.a$c */
    public static final class C88877c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f256355d;

        /* renamed from: e */
        public final /* synthetic */ long f256356e;

        public C88877c(long j, long j2) {
            this.f256355d = j;
            this.f256356e = j2;
        }

        public final void run() {
            C88880b bVar = C88880b.f256362a;
            String f = bVar.mo123265f(C0966R.string.lib);
            C88880b.m110963j(f, bVar.mo123265f(C0966R.string.k7g) + ((this.f256355d * ((long) 100)) / this.f256356e) + '%', (PendingIntent) null);
        }
    }

    /* renamed from: n13.a$d */
    public static final class C88878d implements a$$d {

        /* renamed from: a */
        public final /* synthetic */ C88874a f256357a;

        /* renamed from: b */
        public final /* synthetic */ String f256358b;

        /* renamed from: c */
        public final /* synthetic */ C86009m1 f256359c;

        /* renamed from: d */
        public final /* synthetic */ long f256360d;

        public C88878d(C88874a aVar, String str, C86009m1 m1Var, long j) {
            this.f256357a = aVar;
            this.f256358b = str;
            this.f256359c = m1Var;
            this.f256360d = j;
        }

        /* renamed from: a */
        public final void mo123260a(boolean z) {
            this.f256357a.f256348g.put(this.f256358b, Boolean.TRUE);
            Log.m105925i(this.f256357a.f256350i, "HdiffApk, onPatchResult, result.isSuccess = %s, isPatchFileRead = %s", Boolean.valueOf(z), Boolean.valueOf(this.f256357a.f256352n));
            C88874a aVar = this.f256357a;
            if (aVar.f256352n) {
                C88880b.f256362a.mo123264e(this.f256359c, this.f256360d, aVar.f256345d);
                this.f256357a.f256348g.remove(this.f256358b);
            }
        }
    }

    /* renamed from: n13.a$e */
    public static final class C88879e implements Runnable {

        /* renamed from: d */
        public static final C88879e f256361d = new C88879e();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r2 = 2131838212(0x7f114504, float:1.930964E38)
                java.lang.String r1 = r1.getString(r2)
                r2 = 0
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
                r0.show()
                n13.b r0 = n13.C88880b.f256362a
                r1 = 2131840105(0x7f114c69, float:1.931348E38)
                java.lang.String r0 = r0.mo123265f(r1)
                r1 = 1
                java.lang.Object[] r3 = new java.lang.Object[r1]
                java.lang.String r4 = "0%"
                r3[r2] = r4
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r3
                r2 = 2131838211(0x7f114503, float:1.9309639E38)
                java.lang.String r1 = r4.getString(r2, r1)
                java.lang.String r2 = "getContext().getString(resId, args)"
                gy3.C87412m.m108593f(r1, r2)
                r2 = 0
                n13.C88880b.m110963j(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n13.C88874a.C88879e.run():void");
        }
    }

    public C88874a(TinkerSyncResponse tinkerSyncResponse, long j, HashMap<Long, Long> hashMap, HashMap<String, Boolean> hashMap2, HashMap<Long, String> hashMap3) {
        C87412m.m108594g(tinkerSyncResponse, "response");
        C87412m.m108594g(hashMap, "patchDownLoadProgress");
        C87412m.m108594g(hashMap2, "isDelatMakeFinish");
        C87412m.m108594g(hashMap3, "patchId2FileNameProgress");
        this.f256345d = tinkerSyncResponse;
        this.f256346e = j;
        this.f256347f = hashMap;
        this.f256348g = hashMap2;
        this.f256349h = hashMap3;
    }

    /* renamed from: B */
    public void mo1796B(long j, String str, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        C87412m.m108594g(str, "url");
        String str2 = this.f256350i;
        Log.m105924i(str2, "onTaskProgressChanged cdnUrl:" + this.f256345d.f248342h + " downloadId:" + this.f256346e + " id:" + j4 + " revcLeng:" + j5 + " totalLen:" + j6);
        if (this.f256346e == j4) {
            ((C119157j) C119157j.f356862d).mo183895z(new C88877c(j5, j6));
        }
        if (this.f256345d.mo118353j() == 4) {
            this.f256347f.put(Long.valueOf(j), Long.valueOf(j2));
            String str3 = this.f256349h.get(Long.valueOf(j));
            try {
                C87412m.m108591d(str3);
                C86009m1 m1Var = new C86009m1(str3);
                String str4 = this.f256350i;
                StringBuilder sb = new StringBuilder();
                sb.append("onTaskProgressChanged = filePath = ");
                sb.append(str3);
                sb.append("， is file exist = ");
                sb.append(m1Var.mo119967g());
                sb.append("， 长度 ");
                sb.append(m1Var.mo119980r());
                sb.append(", recvLen = ");
                long j7 = (long) 1024;
                sb.append((j5 / j7) / j7);
                sb.append("MB");
                Log.m105924i(str4, sb.toString());
                long j8 = (long) 2;
                if (j6 > C90734a.f260610a * j8) {
                    C90734a.f260610a = j6 / j8;
                }
                if (!this.f256351j && j5 > C90734a.f260610a && m1Var.mo119967g()) {
                    this.f256351j = true;
                    this.f256348g.put(str3, Boolean.FALSE);
                    C90734a.m113784a(m1Var.mo119971i(), new C88878d(this, str3, m1Var, j));
                }
            } catch (Exception e) {
                String str5 = this.f256350i;
                Log.m105924i(str5, "onTaskProgressChanged = filePath = " + str3 + "， is file exist = " + e);
            }
        }
    }

    /* renamed from: D */
    public void mo1797D(long j) {
        String str = this.f256350i;
        Log.m105924i(str, "onTaskRemoved cdnUrl:" + this.f256345d.f248342h + " downloadId:" + this.f256346e + " id:" + j);
        if (this.f256346e == j) {
            C40935l.m44326g().mo63969q(this);
            Integer num = this.f256345d.f248340f;
            C87412m.m108593f(num, "response.packageType");
            C90737d.m113801i(10, num.intValue(), 102);
        }
    }

    /* renamed from: O */
    public void mo1798O(long j) {
        String str = this.f256350i;
        Log.m105924i(str, "onTaskMd5Checking cdnUrl:" + this.f256345d.f248342h + " downloadId:" + this.f256346e + " id:" + j);
    }

    /* renamed from: Q */
    public void mo1799Q(long j, String str) {
        String str2 = this.f256350i;
        Log.m105924i(str2, "onTaskResumed cdnUrl:" + this.f256345d.f248342h + " downloadId:" + this.f256346e + " id:" + j);
    }

    /* renamed from: S */
    public void mo1800S(long j) {
        String str = this.f256350i;
        Log.m105924i(str, "onTaskPaused cdnUrl:" + this.f256345d.f248342h + " downloadId:" + this.f256346e + " id:" + j);
    }

    /* renamed from: d */
    public void mo1801d(long j, int i, boolean z) {
        String str = this.f256350i;
        Log.m105924i(str, "onTaskFailed cdnUrl:" + this.f256345d.f248342h + " downloadId:" + this.f256346e + " id:" + j + " errCode:" + i + " hasChangeUrl:" + z);
        if (this.f256346e == j) {
            C117407d.INSTANCE.idkeyStat(1429, 13, 1, false);
            C40935l.m44326g().mo63969q(this);
            ((C119157j) C119157j.f356862d).mo183895z(new C88875a(this));
        }
    }

    /* renamed from: f0 */
    public void mo1802f0(long j, String str) {
        String str2 = this.f256350i;
        StringBuilder sb = new StringBuilder();
        sb.append("onTaskStarted cdnUrl:");
        sb.append(this.f256345d.f248342h);
        sb.append(" downloadId:");
        sb.append(this.f256346e);
        sb.append(" id:");
        sb.append(j);
        sb.append(" savedFilePath:");
        sb.append(str == null ? "" : str);
        Log.m105924i(str2, sb.toString());
        if (this.f256346e == j) {
            C117407d.INSTANCE.idkeyStat(1429, 12, 1, false);
            ((C119157j) C119157j.f356862d).mo183895z(C88879e.f256361d);
        }
        String str3 = this.f256350i;
        Log.m105924i(str3, "HdiffApk, onTaskStarted taskId: savedFilePath = " + str);
        if (this.f256345d.mo118353j() == 4 && str != null) {
            this.f256349h.put(Long.valueOf(j), str);
            this.f256347f.put(Long.valueOf(j), Long.valueOf(Long.parseLong("0")));
        }
    }

    /* renamed from: q */
    public void mo1803q(long j, String str, boolean z) {
        Throwable th;
        Integer num;
        long j2 = j;
        String str2 = str;
        String str3 = this.f256350i;
        Log.m105924i(str3, "onTaskFinished cdnUrl:" + this.f256345d.f248342h + " downloadId:" + this.f256346e + " id:" + j2 + " hasChangeUrl:" + z + " savedFilePath:" + str2);
        if (this.f256346e == j2) {
            TinkerSyncResponse tinkerSyncResponse = this.f256345d;
            if (!(tinkerSyncResponse == null || (num = tinkerSyncResponse.f248340f) == null || num.intValue() != 4 || str2 == null)) {
                C64828xf2 k = C79645d.m96735k();
                if (k == null) {
                    k = new C64828xf2();
                }
                if (!Util.isNullOrNil(this.f256345d.f248342h) && !Util.isNullOrNil(k.f186295e) && this.f256345d.f248342h.equals(k.f186295e)) {
                    String str4 = this.f256350i;
                    Log.m105924i(str4, "HdiffApk onDownloadFinish, funck is equals, response.cdnUrl: " + this.f256345d.f248342h + ", status.cdnUrl = " + k.f186295e);
                }
                k.f186297g = "3";
                k.f186299i = System.currentTimeMillis();
                C79645d.m96743s(k);
            }
            C40935l.m44326g().mo63969q(this);
            ((C119157j) C119157j.f356862d).mo183895z(C88876b.f256354d);
            if (str2 != null) {
                C88880b bVar = C88880b.f256362a;
                TinkerSyncResponse tinkerSyncResponse2 = this.f256345d;
                C87412m.m108594g(tinkerSyncResponse2, "response");
                Log.m105924i("MicroMsg.Updater.ManualUpdaterProcessor", "onDownloadFinish savePath:" + str2);
                Integer num2 = tinkerSyncResponse2.f248340f;
                if (num2 != null && num2.intValue() == 3) {
                    C117407d.INSTANCE.idkeyStat(1429, 8, 1, false);
                    ((C119157j) C119157j.f356862d).mo183876g(new C88890d(tinkerSyncResponse2, str2), "Updater");
                    return;
                }
                Integer num3 = tinkerSyncResponse2.f248340f;
                if (num3 != null && num3.intValue() == 4) {
                    C86009m1 m1Var = new C86009m1(str2);
                    C88874a aVar = C88880b.f256366e;
                    if (aVar == null) {
                        C87412m.m108603p("downloadCallbackListener");
                        throw null;
                    } else if (aVar != null) {
                        aVar.f256352n = true;
                        bVar.mo123264e(m1Var, j2, tinkerSyncResponse2);
                    } else {
                        C87412m.m108603p("downloadCallbackListener");
                        throw null;
                    }
                } else {
                    Integer num4 = tinkerSyncResponse2.f248340f;
                    if (num4 != null && num4.intValue() == 2) {
                        C117407d.INSTANCE.idkeyStat(1429, 9, 1, false);
                        C79450b bVar2 = new C79450b(C79471a.f233015c, tinkerSyncResponse2.f248349r);
                        SharedPreferences b = bVar2.mo109424b();
                        String a = bVar2.mo109423a(5);
                        if (b.contains(a)) {
                            bVar2.mo109425c(5, System.currentTimeMillis() - b.getLong(a, 0));
                            b.edit().remove(a).commit();
                        }
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File(str2)));
                        try {
                            long readLong = dataInputStream.readLong();
                            C58003b.m67160a(dataInputStream, (Throwable) null);
                            if (readLong == 96093072812398L) {
                                ((C88689b) C86312j.m106911c(C88689b.class)).mo122763ta();
                                String i = C79645d.m96733i(MMApplicationContext.getContext());
                                VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                                C86009m1 i0 = C112760b.m154236i0("TPCFile");
                                Uri n = C116299g2.m163858n(str);
                                String path = n.getPath();
                                if (path != null) {
                                    String k2 = C116299g2.m163855k(path, false, false);
                                    if (!n.getPath().equals(k2)) {
                                        n = n.buildUpon().path(k2).build();
                                    }
                                }
                                String path2 = n.getPath();
                                int lastIndexOf = path2.lastIndexOf("/");
                                if (lastIndexOf >= 0) {
                                    path2 = path2.substring(lastIndexOf + 1);
                                }
                                C86009m1 m1Var2 = new C86009m1(i0, path2);
                                long currentTimeMillis = System.currentTimeMillis();
                                C87412m.m108593f(i, "baseApk");
                                String i2 = m1Var2.mo119971i();
                                C87412m.m108593f(i2, "patchFile.absolutePath");
                                ((C119157j) C119157j.f356862d).mo183884o(new C88894g(i, str2, i2, new C88892e(tinkerSyncResponse2, currentTimeMillis, m1Var2)));
                                return;
                            }
                            bVar.mo123262a(str2, tinkerSyncResponse2);
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            C58003b.m67160a(dataInputStream, th);
                            throw th5;
                        }
                    }
                }
            }
        }
    }
}
