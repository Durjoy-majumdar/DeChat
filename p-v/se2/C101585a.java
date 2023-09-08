package se2;

import a70.C112760b;
import android.database.Cursor;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import i21.C98590g;
import i21.C98591h;
import java.util.Calendar;
import java.util.Iterator;
import ke2.C99129c;
import kj2.C117407d;
import me2.C10783a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import og2.C100336e;
import og2.C100339h;
import og2.C100344n;
import p763ym.C53543s;
import pe2.C100786f;
import qg2.C101136b0;
import qg2.C101147j0;
import qg2.C77335p;
import te2.C101750g;
import te3.C101826p8;
import te3.C101834rc0;
import ye2.C102838a;
import zt3.C119157j;

/* renamed from: se2.a */
public class C101585a implements C11385n, C47355o, C100339h {

    /* renamed from: d */
    public String f297402d = "";

    /* renamed from: e */
    public C77335p f297403e;

    /* renamed from: se2.a$b */
    public class C101587b extends C102838a {

        /* renamed from: se2.a$b$a */
        public class C101588a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f297405d;

            /* renamed from: e */
            public final /* synthetic */ C68070l.C68072b f297406e;

            public C101588a(C72963f4 f4Var, C68070l.C68072b bVar) {
                this.f297405d = f4Var;
                this.f297406e = bVar;
            }

            public void run() {
                C101585a.this.f297403e = new C77335p(this.f297405d.getMsgId(), this.f297406e.f195606o, (C47355o) null);
                C101585a.this.f297403e.f225480x = 3;
                C86709a0.m107524d().mo123455a(221, C101585a.this);
                C86709a0.m107524d().mo123460f(C101585a.this.f297403e);
            }
        }

        public C101587b(C101586a aVar) {
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.C2CFileAutoDownloadTask";
        }

        public void run() {
            long j;
            float f;
            C101826p8 p8Var;
            int i;
            C101826p8 p8Var2;
            C101826p8 p8Var3;
            Class<C100336e> cls = C100336e.class;
            Class cls2 = C53543s.class;
            Class cls3 = C32735h.class;
            Class cls4 = C99129c.class;
            if (((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_mmc2c_file_auto_download_flag, 0) == 0) {
                Log.m105924i("MicroMsg.Priority.C2CFileAutoDownloader", "not auto download expt flag");
            } else if (!C101585a.this.mo141059a()) {
                Log.m105924i("MicroMsg.Priority.C2CFileAutoDownloader", "not auto download condition");
            } else if (!Util.isNullOrNil(C101585a.this.f297402d)) {
                Log.m105925i("MicroMsg.Priority.C2CFileAutoDownloader", "Downloading %s", C101585a.this.f297402d);
            } else {
                ((C99129c) C86312j.m106911c(cls4)).getClass();
                try {
                    j = ((long) (((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_mmc2c_file_auto_download_bg_border_size, 10) * 1024)) * 1024;
                } catch (Exception unused) {
                    j = 10485760;
                }
                ((C99129c) C86312j.m106911c(cls4)).getClass();
                try {
                    f = ((float) ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_mmc2c_file_auto_download_bg_border_priority, 5)) / 100.0f;
                } catch (Exception unused2) {
                    f = 0.05f;
                }
                boolean wf = ((C32735h) C86312j.m106911c(cls3)).mo58784wf(C32735h.C32737c.clicfg_mmc2c_chat_file_auto_download_flag, false);
                C99129c cVar = (C99129c) C86312j.m106911c(cls4);
                cVar.requireAccountInitialized();
                C101590c cVar2 = cVar.f290662o;
                cVar2.getClass();
                Class<C100336e> cls5 = cls;
                Cursor h = cVar2.f297408a.mo140226h(String.format("SELECT * FROM %s WHERE status = %s AND (reason & %s) > 0 AND createtime > ? ORDER BY createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadFile", 1, 1}), new String[]{String.valueOf(System.currentTimeMillis() - 432000000)});
                try {
                    if (h.moveToNext()) {
                        p8Var = cVar2.mo141064a(h);
                    } else {
                        h.close();
                        p8Var = null;
                    }
                    if (p8Var != null) {
                        i = 1;
                    } else if (!wf) {
                        C99129c cVar3 = (C99129c) C86312j.m106911c(cls4);
                        cVar3.requireAccountInitialized();
                        C101590c cVar4 = cVar3.f290662o;
                        cVar4.getClass();
                        Cursor h2 = cVar4.f297408a.mo140226h(String.format("SELECT * FROM %s WHERE status = %s AND priority >= ? AND createtime > ? AND filesize <= ? ORDER BY priority DESC, createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadFile", 1}), new String[]{String.valueOf(f), String.valueOf(System.currentTimeMillis() - 432000000), String.valueOf(j)});
                        try {
                            if (h2.moveToNext()) {
                                p8Var3 = cVar4.mo141064a(h2);
                            } else {
                                h2.close();
                                p8Var3 = null;
                            }
                            i = 2;
                        } finally {
                            h2.close();
                        }
                    } else {
                        int Qe = ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_mmc2c_chat_file_auto_download_bg_rank, 20);
                        float xe = ((C32735h) C86312j.m106911c(cls3)).mo58785xe(C32735h.C32737c.clicfg_mmc2c_chat_file_auto_download_bg_score, 10.0f);
                        C99129c cVar5 = (C99129c) C86312j.m106911c(cls4);
                        cVar5.requireAccountInitialized();
                        C101590c cVar6 = cVar5.f290662o;
                        cVar6.getClass();
                        Cursor h3 = cVar6.f297408a.mo140226h(String.format("SELECT * FROM %s File, %s Chat WHERE Chat.rank <= ? AND Chat.totallsp > ? AND Chat.chat = File.fromuser AND createtime > ? AND File.status = ? ORDER BY File.createtime DESC LIMIT 1;", new Object[]{"C2CMsgAutoDownloadFile", "C2CChatUsageResult"}), new String[]{String.valueOf(Qe), String.valueOf(xe), String.valueOf(System.currentTimeMillis() - 432000000), String.valueOf(1)});
                        try {
                            if (h3.moveToNext()) {
                                p8Var2 = cVar6.mo141064a(h3);
                            } else {
                                h3.close();
                                p8Var2 = null;
                            }
                            i = 3;
                        } finally {
                            h3.close();
                        }
                    }
                    if (p8Var == null) {
                        Log.m105925i("MicroMsg.Priority.C2CFileAutoDownloader", "autodownloadfile is null %d %.2f", Long.valueOf(j), Float.valueOf(f));
                        return;
                    }
                    C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(p8Var.f299088e, p8Var.f299095o);
                    C68070l.C68072b u = C68070l.C68072b.m80422u((!C72996z1.m85820U5(h302.mo108768t()) || h302.mo108769t2() != 0) ? h302.getContent() : C75604z3.m90849u(h302.getContent()), (String) null);
                    if (u == null) {
                        Log.m105924i("MicroMsg.Priority.C2CFileAutoDownloader", "appMsgContent is null");
                        C99129c cVar7 = (C99129c) C86312j.m106911c(cls4);
                        cVar7.requireAccountInitialized();
                        C101590c cVar8 = cVar7.f290662o;
                        String str = p8Var.f299087d;
                        long j2 = p8Var.f299095o;
                        cVar8.f297410c.bindString(1, str);
                        cVar8.f297410c.bindLong(2, j2);
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "delete %s img %s %s", Integer.valueOf(cVar8.f297410c.executeUpdateDelete()), str, Long.valueOf(j2));
                        return;
                    }
                    if (p8Var.f299090g == 2) {
                        C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls2)).mo74024KZ()).mo100150Yt(Long.valueOf(p8Var.f299087d).longValue());
                        if (Yt == null) {
                            Yt = new C72683d();
                            Yt.field_fileFullPath = C10783a.m10757a(C112760b.m154247s(), u.f195570f, u.f195602n);
                            Yt.field_appId = u.f195562d;
                            Yt.field_sdkVer = (long) u.f195566e;
                            Yt.field_mediaSvrId = u.f195606o;
                            Yt.field_totalLen = (long) u.f195594l;
                            Yt.field_status = 101;
                            Yt.field_isUpload = false;
                            Yt.field_createTime = C31543z5.m39451a();
                            Yt.field_lastModifyTime = Util.nowSecond();
                            Yt.field_msgInfoId = Long.valueOf(p8Var.f299087d).longValue();
                            Yt.field_netTimes = 0;
                            Yt.field_type = (long) u.f195626t;
                            ((C72684e) ((C53543s) C86312j.m106911c(cls2)).mo74024KZ()).mo100151bD(Yt);
                        }
                        C86009m1 m1Var = new C86009m1(Yt.field_fileFullPath);
                        if (!m1Var.mo119967g() || m1Var.mo119980r() != Yt.field_totalLen) {
                            C99129c cVar9 = (C99129c) C86312j.m106911c(cls4);
                            cVar9.requireAccountInitialized();
                            cVar9.f290662o.mo141068e(p8Var.f299087d, p8Var.f299095o, 2);
                            C101585a.this.f297402d = p8Var.f299087d;
                            ((C119157j) C119157j.f356862d).mo183895z(new C101588a(h302, u));
                            C117407d.INSTANCE.idkeyStat(1241, 0, 1, false);
                            C101750g.C101751a e = C101750g.f297828a.mo141185e(h302.f230724G);
                            ((C98590g) C86312j.m106911c(C98590g.class)).mo137961JT(4, p8Var.f299095o, p8Var.f299088e, C100786f.m131971b(p8Var.f299099s), (long) e.f297830b, (long) e.f297831c, p8Var.f299091h);
                        } else {
                            Log.m105924i("MicroMsg.Priority.C2CFileAutoDownloader", "file already exist");
                            C99129c cVar10 = (C99129c) C86312j.m106911c(cls4);
                            cVar10.requireAccountInitialized();
                            cVar10.f290662o.mo141068e(p8Var.f299087d, p8Var.f299095o, 5);
                            C117407d.INSTANCE.idkeyStat(1241, 8, 1, false);
                            return;
                        }
                    } else {
                        Iterator<C101834rc0> it = C101147j0.m132643x(u.f195571f0).f227155f.iterator();
                        while (it.hasNext()) {
                            C101834rc0 next = it.next();
                            if (next.f299280T.equals(p8Var.f299087d)) {
                                ((C101136b0) ((C100336e) C86312j.m106911c(cls5)).mo139410hi()).mo140583jo(C101585a.this);
                                if (C101147j0.m132618K(next, h302.getMsgId(), true)) {
                                    C101585a.this.f297402d = p8Var.f299087d;
                                    C117407d.INSTANCE.idkeyStat(1241, 1, 1, false);
                                } else {
                                    ((C101136b0) ((C100336e) C86312j.m106911c(cls5)).mo139410hi()).mo140582bD(C101585a.this);
                                }
                            }
                        }
                    }
                    if (!Util.isNullOrNil(C101585a.this.f297402d)) {
                        if (i == 1) {
                            C117407d.INSTANCE.idkeyStat(1241, 6, 1, false);
                        } else if (i == 2) {
                            C117407d.INSTANCE.idkeyStat(1241, 7, 1, false);
                        } else if (i == 3) {
                            C117407d.INSTANCE.idkeyStat(1241, 9, 1, false);
                        }
                        Log.m105925i("MicroMsg.Priority.C2CFileAutoDownloader", "downloading file way:%d currentId %s", Integer.valueOf(i), C101585a.this.f297402d);
                    }
                } finally {
                    h.close();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo141059a() {
        if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(12);
        return (i != 1 || i2 < 30) ? i >= 2 && i <= 6 : i2 >= (Math.abs(C86709a0.m107523b().mo121110g()) % 30) + 30;
    }

    /* renamed from: b */
    public final void mo141060b(C100344n nVar, boolean z) {
        if (1 == nVar.field_type) {
            int i = nVar.field_fileType;
            if (i == 7 || i == 5) {
                try {
                    ((C98591h) C86312j.m106911c(C98591h.class)).mo137975se(true, nVar.field_dataId, ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(Long.valueOf(nVar.field_mediaId.split("@")[2]).longValue()).mo108774y2(), z, false);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public void mo141061c() {
        Log.m105924i("MicroMsg.Priority.C2CFileAutoDownloader", "start to download next file");
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        cVar.f290667t.mo140229a(new C101587b((C101586a) null));
    }

    /* renamed from: i1 */
    public void mo128649i1(int i, C100344n nVar) {
        if (nVar.field_dataId.equals(this.f297402d)) {
            int i2 = nVar.field_status;
            if (i2 == 2) {
                mo141060b(nVar, true);
                C117407d.INSTANCE.idkeyStat(1241, 3, 1, false);
            } else if (i2 == 3 || i2 == 4) {
                mo141060b(nVar, false);
                C117407d.INSTANCE.idkeyStat(1241, 5, 1, false);
            }
            ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140582bD(this);
            this.f297402d = "";
            mo141061c();
        }
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        Log.m105925i("MicroMsg.Priority.C2CFileAutoDownloader", "onSceneProgressEnd %s %s %s", this.f297402d, Integer.valueOf(i2), Integer.valueOf(i));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.equals(this.f297403e) && this.f297402d.equals(String.valueOf(this.f297403e.f225469j))) {
            C86709a0.m107524d().mo123470p(221, this);
            this.f297402d = "";
            mo141061c();
            if (i == 0 && i2 == 0) {
                C117407d.INSTANCE.idkeyStat(1241, 2, 1, false);
            } else {
                C117407d.INSTANCE.idkeyStat(1241, 4, 1, false);
            }
        }
    }
}
