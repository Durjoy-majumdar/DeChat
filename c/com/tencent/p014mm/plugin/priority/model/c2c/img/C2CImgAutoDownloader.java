package com.tencent.p014mm.plugin.priority.model.c2c.img;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.TrafficStats;
import android.os.Process;
import android.text.format.DateFormat;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PauseAutoGetBigImgEvent;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import i21.C98591h;
import java.util.Calendar;
import java.util.HashSet;
import ke2.C99129c;
import kj2.C117407d;
import ne2.C100112b;
import ne2.C34823a;
import ob0.C117747y;
import p158gt.C76051j;
import p158gt.C98201k;
import p663qo.C101213l;
import pe2.C100786f;
import pe2.C100788h;
import te2.C101750g;
import te3.C101831q8;
import ye2.C102838a;

/* renamed from: com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader */
public class C2CImgAutoDownloader implements C76051j.C76052a, C100112b {

    /* renamed from: d */
    public long f272409d = 0;

    /* renamed from: e */
    public int f272410e = 0;

    /* renamed from: f */
    public int f272411f = 0;

    /* renamed from: g */
    public String f272412g = "";

    /* renamed from: h */
    public boolean f272413h = false;

    /* renamed from: i */
    public long f272414i = 0;

    /* renamed from: j */
    public long f272415j = 0;

    /* renamed from: n */
    public int f272416n = Process.myUid();

    /* renamed from: o */
    public IListener f272417o = new IListener<PauseAutoGetBigImgEvent>(C40008f.f107254d) {
        {
            this.__eventId = -27874186;
        }

        public boolean callback(IEvent iEvent) {
            PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = (PauseAutoGetBigImgEvent) iEvent;
            if (C101750g.f297828a.mo141183c(1, pauseAutoGetBigImgEvent.f264980d.f264982b) == 0) {
                C2CImgAutoDownloader c2CImgAutoDownloader = C2CImgAutoDownloader.this;
                int i = c2CImgAutoDownloader.f272411f + (pauseAutoGetBigImgEvent.f264980d.f264981a ? 1 : -1);
                c2CImgAutoDownloader.f272411f = i;
                if (i < 0) {
                    c2CImgAutoDownloader.f272411f = 0;
                    Log.m105920e("MicroMsg.Priority.C2CImgAutoDownloader", "pauseCnt < 0");
                }
                C2CImgAutoDownloader c2CImgAutoDownloader2 = C2CImgAutoDownloader.this;
                if (c2CImgAutoDownloader2.f272411f == 0) {
                    c2CImgAutoDownloader2.f272412g = "";
                } else {
                    PauseAutoGetBigImgEvent.C92540a aVar = pauseAutoGetBigImgEvent.f264980d;
                    c2CImgAutoDownloader2.f272412g = aVar.f264981a ? Util.nullAs(aVar.f264982b, c2CImgAutoDownloader2.f272412g) : c2CImgAutoDownloader2.f272412g;
                }
                Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "req pause: %b count: %d talker %s", Boolean.valueOf(pauseAutoGetBigImgEvent.f264980d.f264981a), Integer.valueOf(C2CImgAutoDownloader.this.f272411f), C2CImgAutoDownloader.this.f272412g);
                C2CImgAutoDownloader.this.mo129621d();
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader$a */
    public class C94290a extends C102838a {
        public C94290a(C942891 r2) {
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.C2CImgAutoDownloaderTask";
        }

        public void run() {
            int i;
            C101831q8 q8Var;
            C72963f4 f4Var;
            int i2;
            C101831q8 q8Var2;
            int i3;
            C101831q8 q8Var3;
            C101831q8 q8Var4;
            C101831q8 q8Var5;
            Class cls = C98201k.class;
            Class cls2 = C32735h.class;
            Class cls3 = C99129c.class;
            if (!C34823a.m40471a()) {
                Log.m105924i("MicroMsg.Priority.C2CImgAutoDownloader", "not auto download condition");
                return;
            }
            C2CImgAutoDownloader c2CImgAutoDownloader = C2CImgAutoDownloader.this;
            long j = c2CImgAutoDownloader.f272409d;
            if (j != 0 || c2CImgAutoDownloader.f272413h) {
                Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "Downloading %d pauseOnMonitor %b", Long.valueOf(j), Boolean.valueOf(C2CImgAutoDownloader.this.f272413h));
                return;
            }
            ((C99129c) C86312j.m106911c(cls3)).getClass();
            ((C99129c) C86312j.m106911c(cls3)).getClass();
            if (!((C32735h) C86312j.m106911c(cls2)).mo58784wf(C32735h.C32737c.clicfg_mmc2c_chat_img_auto_download_flag, false)) {
                if (!Util.isNullOrNil(C2CImgAutoDownloader.this.f272412g)) {
                    C99129c cVar = (C99129c) C86312j.m106911c(cls3);
                    cVar.requireAccountInitialized();
                    C94293b bVar = cVar.f290661n;
                    String str = C2CImgAutoDownloader.this.f272412g;
                    bVar.getClass();
                    Cursor h = bVar.f272421a.mo140226h(String.format("SELECT * FROM %s WHERE status = ? AND fromuser = ? AND priority >= ? AND createtime > ? ORDER BY createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadRes"}), new String[]{String.valueOf(1), String.valueOf(str), String.valueOf(0.3f), String.valueOf(System.currentTimeMillis() - 432000000)});
                    try {
                        if (h.moveToNext()) {
                            q8Var = bVar.mo129625a(h);
                        } else {
                            h.close();
                            q8Var = null;
                        }
                        i = 1;
                    } finally {
                        h.close();
                    }
                } else {
                    q8Var = null;
                    i = 0;
                }
                if (q8Var == null) {
                    C99129c cVar2 = (C99129c) C86312j.m106911c(cls3);
                    cVar2.requireAccountInitialized();
                    C94293b bVar2 = cVar2.f290661n;
                    bVar2.getClass();
                    Cursor h2 = bVar2.f272421a.mo140226h(String.format("SELECT * FROM %s WHERE status = ? AND priority >= ? AND createtime > ? ORDER BY createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadRes"}), new String[]{String.valueOf(1), String.valueOf(0.3f), String.valueOf(System.currentTimeMillis() - 432000000)});
                    try {
                        if (h2.moveToNext()) {
                            q8Var5 = bVar2.mo129625a(h2);
                        } else {
                            h2.close();
                            q8Var5 = null;
                        }
                        i = 2;
                    } finally {
                        h2.close();
                    }
                }
                if (q8Var == null) {
                    C99129c cVar3 = (C99129c) C86312j.m106911c(cls3);
                    cVar3.requireAccountInitialized();
                    q8Var = cVar3.f290661n.mo129628d(128);
                    i = 4;
                }
                if (q8Var == null && C2CImgAutoDownloader.this.mo129619b()) {
                    C99129c cVar4 = (C99129c) C86312j.m106911c(cls3);
                    cVar4.requireAccountInitialized();
                    C94293b bVar3 = cVar4.f290661n;
                    bVar3.getClass();
                    Cursor h3 = bVar3.f272421a.mo140226h(String.format("SELECT * FROM %s WHERE status = ? AND priority >= ? AND createtime > ? ORDER BY priority DESC, createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadRes"}), new String[]{String.valueOf(1), String.valueOf(0.1f), String.valueOf(System.currentTimeMillis() - 432000000)});
                    try {
                        if (h3.moveToNext()) {
                            q8Var4 = bVar3.mo129625a(h3);
                        } else {
                            h3.close();
                            q8Var4 = null;
                        }
                        Object[] objArr = new Object[1];
                        objArr[0] = Boolean.valueOf(MMApplicationContext.getContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1) != 0);
                        Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "bg normal download %b", objArr);
                        i = 3;
                    } finally {
                        h3.close();
                    }
                }
            } else {
                int Qe = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_mmc2c_chat_img_auto_download_rank, 10);
                float xe = ((C32735h) C86312j.m106911c(cls2)).mo58785xe(C32735h.C32737c.clicfg_mmc2c_chat_img_auto_download_score, 10.0f);
                if (!Util.isNullOrNil(C2CImgAutoDownloader.this.f272412g)) {
                    C99129c cVar5 = (C99129c) C86312j.m106911c(cls3);
                    cVar5.requireAccountInitialized();
                    C94293b bVar4 = cVar5.f290661n;
                    String str2 = C2CImgAutoDownloader.this.f272412g;
                    bVar4.getClass();
                    Cursor h4 = bVar4.f272421a.mo140226h(String.format("SELECT * FROM %s Img, %s Chat WHERE Chat.rank <= ? AND Chat.totallsp > ? AND Chat.chat = ? AND Img.fromuser = ? AND Img.createtime > ? AND Img.status = ? ORDER BY Img.createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadRes", "C2CChatUsageResult"}), new String[]{String.valueOf(Qe), String.valueOf(xe), str2, str2, String.valueOf(System.currentTimeMillis() - 432000000), String.valueOf(1)});
                    try {
                        if (h4.moveToNext()) {
                            q8Var2 = bVar4.mo129625a(h4);
                        } else {
                            h4.close();
                            q8Var2 = null;
                        }
                        i3 = 5;
                    } finally {
                        h4.close();
                    }
                } else {
                    i3 = 0;
                    q8Var2 = null;
                }
                if (q8Var2 == null) {
                    C99129c cVar6 = (C99129c) C86312j.m106911c(cls3);
                    cVar6.requireAccountInitialized();
                    q8Var2 = cVar6.f290661n.mo129626b(Qe, xe);
                    i3 = 6;
                }
                if (q8Var2 == null) {
                    C99129c cVar7 = (C99129c) C86312j.m106911c(cls3);
                    cVar7.requireAccountInitialized();
                    q8Var3 = cVar7.f290661n.mo129628d(128);
                    i3 = 4;
                } else {
                    q8Var3 = q8Var2;
                }
                if (q8Var3 != null || !C2CImgAutoDownloader.this.mo129619b()) {
                    q8Var = q8Var3;
                    i = i3;
                } else {
                    int Qe2 = ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.clicfg_mmc2c_chat_img_auto_download_bg_rank, 20);
                    float xe4 = ((C32735h) C86312j.m106911c(cls2)).mo58785xe(C32735h.C32737c.clicfg_mmc2c_chat_img_auto_download_bg_score, 10.0f);
                    C99129c cVar8 = (C99129c) C86312j.m106911c(cls3);
                    cVar8.requireAccountInitialized();
                    q8Var = cVar8.f290661n.mo129626b(Qe2, xe4);
                    i = 7;
                }
            }
            if (q8Var == null) {
                C2CImgAutoDownloader.this.f272409d = 0;
                Log.m105924i("MicroMsg.Priority.C2CImgAutoDownloader", "autoDownloadRes is null");
                return;
            }
            C2CImgAutoDownloader c2CImgAutoDownloader2 = C2CImgAutoDownloader.this;
            long j2 = q8Var.f299197d;
            c2CImgAutoDownloader2.f272409d = j2;
            Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "curMsgId %d priority %.2f prioritytype %d way %d borderPriority %.2f bgBorderPriority %.2f", Long.valueOf(j2), Double.valueOf(q8Var.f299208r), Integer.valueOf(q8Var.f299209s), Integer.valueOf(i), Float.valueOf(0.3f), Float.valueOf(0.1f));
            try {
                f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(C2CImgAutoDownloader.this.f272409d);
            } catch (Error unused) {
                Log.m105928w("MicroMsg.Priority.C2CImgAutoDownloader", "assert while get msg by msgId");
                f4Var = null;
            }
            if (f4Var == null) {
                Log.m105920e("MicroMsg.Priority.C2CImgAutoDownloader", "can't get msgInfo of " + C2CImgAutoDownloader.this.f272409d);
                C99129c cVar9 = (C99129c) C86312j.m106911c(cls3);
                cVar9.requireAccountInitialized();
                C94293b bVar5 = cVar9.f290661n;
                long j3 = C2CImgAutoDownloader.this.f272409d;
                bVar5.f272423c.bindLong(1, j3);
                Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "delete %d img %d", Integer.valueOf(bVar5.f272423c.executeUpdateDelete()), Long.valueOf(j3));
                C2CImgAutoDownloader c2CImgAutoDownloader3 = C2CImgAutoDownloader.this;
                c2CImgAutoDownloader3.f272409d = 0;
                c2CImgAutoDownloader3.mo129621d();
                return;
            }
            C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
            if (NQ.f267392s == 1) {
                Log.m105924i("MicroMsg.Priority.C2CImgAutoDownloader", C2CImgAutoDownloader.this.f272409d + " already has hd thumb");
                C99129c cVar10 = (C99129c) C86312j.m106911c(cls3);
                cVar10.requireAccountInitialized();
                cVar10.f290661n.mo129630f(C2CImgAutoDownloader.this.f272409d, 5);
                C2CImgAutoDownloader c2CImgAutoDownloader4 = C2CImgAutoDownloader.this;
                c2CImgAutoDownloader4.f272409d = 0;
                c2CImgAutoDownloader4.mo129621d();
                return;
            }
            HashSet<String> CA = ((C101213l) C86312j.m106911c(C101213l.class)).mo140297CA();
            CA.add("image_" + f4Var.getMsgId());
            if (Util.isNullOrNil(C2CImgAutoDownloader.this.f272412g) || !C2CImgAutoDownloader.this.f272412g.equals(f4Var.mo108768t())) {
                C76051j Jp0 = ((C98201k) C86312j.m106911c(cls)).Jp0();
                long j4 = NQ.f267374a;
                long msgId = f4Var.getMsgId();
                Long valueOf = Long.valueOf(C2CImgAutoDownloader.this.f272409d);
                C2CImgAutoDownloader c2CImgAutoDownloader5 = C2CImgAutoDownloader.this;
                i2 = ((C92822e) Jp0).mo127100b(j4, msgId, 0, valueOf, c2CImgAutoDownloader5.f272410e, c2CImgAutoDownloader5, CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, false);
                Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "start download cdnautostart %d %s result=%d", Long.valueOf(C2CImgAutoDownloader.this.f272409d), "image_" + f4Var.getMsgId(), Integer.valueOf(i2));
            } else {
                C76051j Jp02 = ((C98201k) C86312j.m106911c(cls)).Jp0();
                long j5 = NQ.f267374a;
                long msgId2 = f4Var.getMsgId();
                Long valueOf2 = Long.valueOf(C2CImgAutoDownloader.this.f272409d);
                C2CImgAutoDownloader c2CImgAutoDownloader6 = C2CImgAutoDownloader.this;
                i2 = ((C92822e) Jp02).mo127100b(j5, msgId2, 0, valueOf2, c2CImgAutoDownloader6.f272410e, c2CImgAutoDownloader6, CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, true);
                Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "start download cdnautostart %d %s %s result=%d", Long.valueOf(C2CImgAutoDownloader.this.f272409d), "image_" + f4Var.getMsgId(), C2CImgAutoDownloader.this.f272412g, Integer.valueOf(i2));
            }
            if (!(i2 == -4 || i2 == -3)) {
                if (i2 == -2) {
                    C99129c cVar11 = (C99129c) C86312j.m106911c(cls3);
                    cVar11.requireAccountInitialized();
                    cVar11.f290661n.mo129630f(C2CImgAutoDownloader.this.f272409d, 3);
                    if (i == 3) {
                        C117407d.INSTANCE.idkeyStat(957, 55, 1, false);
                    } else if (i == 7) {
                        C117407d.INSTANCE.idkeyStat(957, 61, 1, false);
                    }
                    C2CImgAutoDownloader c2CImgAutoDownloader7 = C2CImgAutoDownloader.this;
                    c2CImgAutoDownloader7.f272409d = 0;
                    c2CImgAutoDownloader7.mo129621d();
                    return;
                } else if (i2 == -1) {
                    C99129c cVar12 = (C99129c) C86312j.m106911c(cls3);
                    cVar12.requireAccountInitialized();
                    cVar12.f290661n.mo129630f(C2CImgAutoDownloader.this.f272409d, 4);
                    if (i == 3) {
                        C117407d.INSTANCE.idkeyStat(957, 56, 1, false);
                    } else if (i == 7) {
                        C117407d.INSTANCE.idkeyStat(957, 62, 1, false);
                    }
                    C2CImgAutoDownloader c2CImgAutoDownloader8 = C2CImgAutoDownloader.this;
                    c2CImgAutoDownloader8.f272409d = 0;
                    c2CImgAutoDownloader8.mo129621d();
                    return;
                } else if (i2 == 0) {
                    C100786f.m131977h(q8Var, f4Var);
                } else {
                    return;
                }
            }
            C99129c cVar13 = (C99129c) C86312j.m106911c(cls3);
            cVar13.requireAccountInitialized();
            cVar13.f290661n.mo129630f(C2CImgAutoDownloader.this.f272409d, 2);
            if (i == 3) {
                C117407d.INSTANCE.idkeyStat(957, 52, 1, false);
            } else if (i == 1) {
                C117407d.INSTANCE.idkeyStat(957, 50, 1, false);
            } else if (i == 4) {
                C117407d.INSTANCE.idkeyStat(957, 57, 1, false);
            } else if (i == 5) {
                C117407d.INSTANCE.idkeyStat(957, 58, 1, false);
            } else if (i == 6) {
                C117407d.INSTANCE.idkeyStat(957, 59, 1, false);
            } else if (i == 7) {
                C117407d.INSTANCE.idkeyStat(957, 60, 1, false);
            } else {
                C117407d.INSTANCE.idkeyStat(957, 51, 1, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader$b */
    public class C94291b extends C102838a {
        public C94291b() {
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.CheckNetworkNetStatTask";
        }

        public void run() {
            long uidRxBytes = TrafficStats.getUidRxBytes(C2CImgAutoDownloader.this.f272416n);
            long uidTxBytes = TrafficStats.getUidTxBytes(C2CImgAutoDownloader.this.f272416n);
            C2CImgAutoDownloader c2CImgAutoDownloader = C2CImgAutoDownloader.this;
            long j = (uidRxBytes - c2CImgAutoDownloader.f272414i) + (uidTxBytes - c2CImgAutoDownloader.f272415j);
            if (j <= 20480) {
                c2CImgAutoDownloader.f272413h = false;
                c2CImgAutoDownloader.mo129621d();
                return;
            }
            Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "byteDelta %d", Long.valueOf(j));
            C2CImgAutoDownloader c2CImgAutoDownloader2 = C2CImgAutoDownloader.this;
            c2CImgAutoDownloader2.f272414i = uidRxBytes;
            c2CImgAutoDownloader2.f272415j = uidTxBytes;
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            C100788h hVar = cVar.f290667t;
            C94291b bVar = new C94291b();
            C100788h.C100789a aVar = hVar.f295257b;
            if (aVar != null) {
                hVar.f295257b.sendMessageDelayed(aVar.obtainMessage(1, bVar), 1000);
            }
        }
    }

    public C2CImgAutoDownloader() {
        this.f272417o.alive();
        this.f272410e = C0966R.C0969drawable.by8;
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        long j3 = j2;
        Class cls = C98591h.class;
        if (i3 == 0 && i4 == 0) {
            mo129618a(j, j2, true);
            ((C98591h) C86312j.m106911c(cls)).mo137965Ez(j2, true, false);
            C117407d.INSTANCE.idkeyStat(957, 54, 1, false);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("img ");
            long j4 = j;
            sb.append(j);
            sb.append("msgLocalId ");
            sb.append(j2);
            sb.append(" download failed");
            Log.m105920e("MicroMsg.Priority.C2CImgAutoDownloader", sb.toString());
            ((C98591h) C86312j.m106911c(cls)).mo137965Ez(j2, false, false);
            C117407d.INSTANCE.idkeyStat(957, 53, 1, false);
        }
        this.f272409d = 0;
        Log.m105924i("MicroMsg.Priority.C2CImgAutoDownloader", "normal download mode check network stat");
        this.f272413h = true;
        this.f272414i = TrafficStats.getUidRxBytes(this.f272416n);
        this.f272415j = TrafficStats.getUidTxBytes(this.f272416n);
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        C100788h hVar = cVar.f290667t;
        C94291b bVar = new C94291b();
        C100788h.C100789a aVar = hVar.f295257b;
        if (aVar != null) {
            hVar.f295257b.sendMessageDelayed(aVar.obtainMessage(1, bVar), 1000);
        }
    }

    /* renamed from: a */
    public void mo129618a(long j, long j2, boolean z) {
        if (!z) {
            Log.m105924i("MicroMsg.Priority.C2CImgAutoDownloader", "imglocalId " + j + " msglocalid " + j2 + " false");
        } else if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            Log.m105926v("MicroMsg.Priority.C2CImgAutoDownloader", "is wifi pass count");
        } else {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG;
            long nullAs = Util.nullAs((Long) i.mo119685f(aVar, (Object) null), 0);
            long safeParseLong = Util.safeParseLong((String) DateFormat.format("M", System.currentTimeMillis()));
            long j3 = nullAs + 1;
            Log.m105919d("MicroMsg.Priority.C2CImgAutoDownloader", "img " + j + " msgLocalId: " + j2 + " has been downloaded current %d month %d", Long.valueOf(j3), Long.valueOf(safeParseLong));
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(j3));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_DATE_LONG, Long.valueOf(safeParseLong));
        }
    }

    /* renamed from: b */
    public boolean mo129619b() {
        if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        return i == 1 ? instance.get(12) >= Math.abs(C86709a0.m107523b().mo121110g()) % 30 : i >= 2 && i <= 6;
    }

    /* renamed from: c */
    public boolean mo129620c() {
        Class cls = C98201k.class;
        if (this.f272409d != 0) {
            C92836k vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(this.f272412g, this.f272409d);
            if (((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).mo127105g(vP.f267374a, this.f272409d, vP.f267381h)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo129621d() {
        Class cls = C98201k.class;
        Class cls2 = C99129c.class;
        if (this.f272409d != 0) {
            C92836k vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(this.f272412g, this.f272409d);
            if (((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).mo127105g(vP.f267374a, this.f272409d, vP.f267381h)) {
                Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "Downloading %d", Long.valueOf(this.f272409d));
                return;
            }
            this.f272409d = 0;
            if (vP.f267392s == 1) {
                Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "Not In DownloadImgService Queue, Already Downloaded, Force Cancel curMsgId %d", 0L);
                C99129c cVar = (C99129c) C86312j.m106911c(cls2);
                cVar.requireAccountInitialized();
                cVar.f290661n.mo129630f(this.f272409d, 5);
            } else {
                Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "Not In DownloadImgService Queue, Not Downloaded, Force Cancel curMsgId %d", 0L);
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls2);
                cVar2.requireAccountInitialized();
                cVar2.f290661n.mo129630f(this.f272409d, 1);
            }
        }
        C99129c cVar3 = (C99129c) C86312j.m106911c(cls2);
        cVar3.requireAccountInitialized();
        cVar3.f290667t.mo140229a(new C94290a((C942891) null));
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        Log.m105925i("MicroMsg.Priority.C2CImgAutoDownloader", "onImgTaskCanceled %d", Long.valueOf(j2));
        this.f272409d = 0;
        ((C98591h) C86312j.m106911c(C98591h.class)).mo137965Ez(j2, false, true);
        C117407d.INSTANCE.idkeyStat(957, 57, 1, false);
    }
}
