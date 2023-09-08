package t72;

import a70.C112760b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bd0.C28298b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85802w1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116328u0;
import com.tencent.p014mm.vfs.C116340x0;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import jr2.C99015i;
import ld2.C46848g;
import lu3.C88654b;
import ng2.C11163e;
import p227rn.C48051r;
import p237sp.C36767n;
import p256vw.C37850d;
import r41.C47926a;
import t72.C118387c;
import vu0.C118698h;
import xv2.C102775d;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: t72.k */
public class C118396k extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C118391i f353849a;

    /* renamed from: t72.k$a */
    public class C118397a implements C118387c {
        public C118397a() {
        }

        /* renamed from: a */
        public void mo183192a(int i, C118387c.C118388a aVar) {
            C118396k.this.f353849a.f353840u = System.currentTimeMillis();
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv callback errType[%d] lastScanTime[%d], result[%s][%s]", Integer.valueOf(i), Long.valueOf(C118396k.this.f353849a.f353840u), C118396k.this.f353849a.f353842w, aVar);
            C118396k.this.f353849a.f353842w = null;
            if (i == 0 && !aVar.f353810j) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WECHAT_FILE_SCAN_LAST_TIME_LONG, Long.valueOf(C118396k.this.f353849a.f353840u));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119681a(false);
                try {
                    C118391i.vx0(C118396k.this.f353849a, aVar);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SubCoreBaseMonitor", e, "doReportSDInfo err!", new Object[0]);
                    C115669n.INSTANCE.idkeyStat(418, 6, 1, true);
                }
            }
        }
    }

    /* renamed from: t72.k$b */
    public class C118398b extends C88654b {

        /* renamed from: e */
        public final /* synthetic */ C118387c f353851e;

        public C118398b(C118387c cVar) {
            this.f353851e = cVar;
        }

        public String getKey() {
            return "autoScanRemove";
        }

        public void run() {
            C118387c.C118388a aVar;
            String str;
            C118387c.C118388a aVar2;
            String str2;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i15;
            int i16;
            int i17;
            Class cls = C102775d.class;
            Class cls2 = C37850d.class;
            C118396k.this.f353849a.f353841v = null;
            int a = C75604z3.m90829a();
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerdel checkUnfinishedDeleteMsgTask ret[%s]", Integer.valueOf(a));
            if (a > 0) {
                C115669n.INSTANCE.idkeyStat(418, 8, 1, true);
            }
            C118391i iVar = C118396k.this.f353849a;
            C118387c cVar = this.f353851e;
            Class cls3 = C99015i.class;
            Class cls4 = C48051r.class;
            iVar.getClass();
            Log.m105924i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan");
            C86709a0.m107528h();
            if (!C86709a0.m107535s().mo121147n()) {
                Log.m105924i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan failed as sdcard not available");
                ((C118397a) cVar).mo183192a(-1, (C118387c.C118388a) null);
                aVar2 = null;
                str = "MicroMsg.SubCoreBaseMonitor";
            } else {
                HashMap hashMap = new HashMap();
                C116340x0 x0Var = (C116340x0) C116281f0.C116289i.f348994a.mo177788a();
                if (x0Var.f349128f == null) {
                    x0Var.f349128f = Collections.unmodifiableList(x0Var.f349124b);
                }
                for (C116328u0.C116329a next : x0Var.f349128f) {
                    String str3 = next.f349095d;
                    String str4 = next.f349096e;
                    LinkedList linkedList = (LinkedList) hashMap.get(str4 + "/");
                    if (linkedList == null) {
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.add(str3);
                        hashMap.put(str4 + "/", linkedList2);
                    } else {
                        linkedList.add(str3);
                    }
                }
                String C = C112760b.m154195C();
                C86009m1 m1Var = new C86009m1(C);
                if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
                    str = "MicroMsg.SubCoreBaseMonitor";
                    Log.m105925i(str, "summerhv startScan failed as path not exists[%s]", C);
                    aVar2 = null;
                    ((C118397a) cVar).mo183192a(-1, (C118387c.C118388a) null);
                } else {
                    Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan root[%s] exist[%b], diretory[%b]", C, Boolean.valueOf(m1Var.mo119967g()), Boolean.valueOf(m1Var.mo119977o()));
                    HashMap hashMap2 = new HashMap(73);
                    C86709a0.m107528h();
                    String str5 = C86709a0.m107535s().f251806d;
                    if (!iVar.yx0(hashMap, hashMap2, "voice/", 1)) {
                        String str6 = str5 + "voice/";
                        hashMap2.put(str6.substring(0, str6.length() - 1), 1);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "voice2/", 2)) {
                        String str7 = str5 + "voice2/";
                        hashMap2.put(str7.substring(0, str7.length() - 1), 2);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "image/", 3)) {
                        String str8 = str5 + "image/";
                        hashMap2.put(str8.substring(0, str8.length() - 1), 3);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "image2/", 4)) {
                        String str9 = str5 + "image2/";
                        hashMap2.put(str9.substring(0, str9.length() - 1), 4);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "sfs/", 5)) {
                        String str10 = str5 + "sfs/";
                        hashMap2.put(str10.substring(0, str10.length() - 1), 5);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "avatar/", 6)) {
                        str2 = "MicroMsg.SubCoreBaseMonitor";
                        hashMap2.put(C118698h.m167389a().substring(0, C118698h.m167389a().length() - 1), 6);
                    } else {
                        str2 = "MicroMsg.SubCoreBaseMonitor";
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "emoji/", 7)) {
                        String str11 = str5 + "emoji/";
                        hashMap2.put(str11.substring(0, str11.length() - 1), 7);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "video/", 8)) {
                        String str12 = str5 + "video/";
                        hashMap2.put(str12.substring(0, str12.length() - 1), 8);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "package/", 9)) {
                        hashMap2.put(C47926a.m53249a().substring(0, C47926a.m53249a().length() - 1), 9);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "mailapp/", 10)) {
                        String str13 = str5 + "mailapp/";
                        hashMap2.put(str13.substring(0, str13.length() - 1), 10);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "openapi/", 11)) {
                        hashMap2.put(C46848g.xx0().substring(0, C46848g.xx0().length() - 1), 11);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "attachment/", 12)) {
                        String str14 = str5 + "attachment/";
                        hashMap2.put(str14.substring(0, str14.length() - 1), 12);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "brandicon/", 13)) {
                        hashMap2.put(((C48051r) C86312j.m106911c(cls4)).mo72606M3().substring(0, ((C48051r) C86312j.m106911c(cls4)).mo72606M3().length() - 1), 13);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "voiceremind/", 14)) {
                        String str15 = str5 + "voiceremind/";
                        hashMap2.put(str15.substring(0, str15.length() - 1), 14);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "recbiz/", 15)) {
                        i2 = 1;
                        i = 0;
                        hashMap2.put(C11163e.m11041a().substring(0, C11163e.m11041a().length() - 1), 15);
                    } else {
                        i2 = 1;
                        i = 0;
                    }
                    hashMap2.put(C28298b.m38156a().substring(i, C28298b.m38156a().length() - i2), 16);
                    if (!iVar.yx0(hashMap, hashMap2, "favorite/", 17)) {
                        hashMap2.put(C85802w1.m106019a().substring(0, C85802w1.m106019a().length() - 1), 17);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "draft/", 18)) {
                        String str16 = str5 + "draft/";
                        hashMap2.put(str16.substring(0, str16.length() - 1), 18);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "record/", 19)) {
                        String str17 = str5 + "record/";
                        hashMap2.put(str17.substring(0, str17.length() - 1), 19);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "sns/", 20)) {
                        hashMap2.put(((C99015i) C86312j.m106911c(cls3)).mo61935YO().substring(0, ((C99015i) C86312j.m106911c(cls3)).mo61935YO().length() - 1), 20);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "wenote/", 21)) {
                        String str18 = str5 + "wenote/";
                        hashMap2.put(str18.substring(0, str18.length() - 1), 21);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "remark/", 22)) {
                        hashMap2.put(((C37850d) C86312j.m106911c(cls2)).mo61217SG().substring(0, ((C37850d) C86312j.m106911c(cls2)).mo61217SG().length() - 1), 22);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "xlog/", 23)) {
                        hashMap2.put(C112760b.m154234h0(), 23);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "Download/", 24)) {
                        hashMap2.put(C112760b.m154247s().substring(0, C112760b.m154247s().length() - 1), 24);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "Game/", 25)) {
                        i4 = 1;
                        i3 = 0;
                        hashMap2.put(C112760b.m154253y().substring(0, C112760b.m154253y().length() - 1), 25);
                    } else {
                        i4 = 1;
                        i3 = 0;
                    }
                    hashMap2.put(C112760b.m154240l().substring(i3, C112760b.m154240l().length() - i4), 26);
                    String str19 = str5 + "avatar/";
                    hashMap2.put(str19.substring(i3, str19.length() - i4), 27);
                    if (!iVar.yx0(hashMap, hashMap2, "backupRecover/", 28)) {
                        String str20 = str5 + "backupRecover/";
                        hashMap2.put(str20.substring(0, str20.length() - 1), 28);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "bizimg/", 29)) {
                        String str21 = str5 + "bizimg/";
                        hashMap2.put(str21.substring(0, str21.length() - 1), 29);
                    }
                    String str22 = str5 + "bizmsg/";
                    hashMap2.put(str22.substring(0, str22.length() - 1), 30);
                    String str23 = str5 + "boots/";
                    hashMap2.put(str23.substring(0, str23.length() - 1), 31);
                    String str24 = str5 + "dbback/";
                    hashMap2.put(str24.substring(0, str24.length() - 1), 32);
                    String str25 = str5 + "locallog/";
                    hashMap2.put(str25.substring(0, str25.length() - 1), 33);
                    String str26 = str5 + "logcat/";
                    hashMap2.put(str26.substring(0, str26.length() - 1), 34);
                    if (!iVar.yx0(hashMap, hashMap2, "msgsynchronize/", 35)) {
                        String str27 = str5 + "msgsynchronize/";
                        hashMap2.put(str27.substring(0, str27.length() - 1), 35);
                    }
                    String str28 = str5 + "music/";
                    hashMap2.put(str28.substring(0, str28.length() - 1), 36);
                    if (!iVar.yx0(hashMap, hashMap2, "oneday/", 37)) {
                        hashMap2.put(((C102775d) C86312j.m106911c(cls)).mo134174rA().substring(0, ((C102775d) C86312j.m106911c(cls)).mo134174rA().length() - 1), 37);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "openim/", 38)) {
                        String str29 = str5 + "openim" + "/";
                        hashMap2.put(str29.substring(0, str29.length() - 1), 38);
                    }
                    String str30 = str5 + "story/";
                    hashMap2.put(str30.substring(0, str30.length() - 1), 39);
                    hashMap2.put(C112760b.m154233h().substring(0, C112760b.m154233h().length() - 1), 40);
                    hashMap2.put(C112760b.m154235i().substring(0, C112760b.m154235i().length() - 1), 41);
                    String str31 = C36767n.f97661a;
                    hashMap2.put(str31.substring(0, str31.length() - 1), 42);
                    hashMap2.put(C112760b.m154237j().substring(0, C112760b.m154237j().length() - 1), 43);
                    hashMap2.put(C112760b.m154239k().substring(0, C112760b.m154239k().length() - 1), 44);
                    hashMap2.put(C112760b.m154241m().substring(0, C112760b.m154241m().length() - 1), 45);
                    if (!iVar.yx0(hashMap, hashMap2, "CDNTemp/", 46)) {
                        i6 = 1;
                        i5 = 0;
                        hashMap2.put(C112760b.m154242n().substring(0, C112760b.m154242n().length() - 1), 46);
                    } else {
                        i6 = 1;
                        i5 = 0;
                    }
                    hashMap2.put(C112760b.m154243o().substring(i5, C112760b.m154243o().length() - i6), 47);
                    hashMap2.put(C112760b.m154244p().substring(i5, C112760b.m154244p().length() - i6), 48);
                    hashMap2.put(C112760b.m154246r().substring(i5, C112760b.m154246r().length() - i6), 49);
                    hashMap2.put(C112760b.m154249u().substring(i5, C112760b.m154249u().length() - i6), 50);
                    hashMap2.put(C112760b.m154250v().substring(i5, C112760b.m154250v().length() - i6), 51);
                    hashMap2.put(C112760b.m154252x().substring(i5, C112760b.m154252x().length() - i6), 52);
                    hashMap2.put(C112760b.m154254z().substring(i5, C112760b.m154254z().length() - i6), 53);
                    hashMap2.put(C112760b.m154193A().substring(i5, C112760b.m154193A().length() - i6), 54);
                    hashMap2.put(C112760b.m154194B().substring(i5, C112760b.m154194B().length() - i6), 55);
                    hashMap2.put(C112760b.m154196D().substring(i5, C112760b.m154196D().length() - i6), 56);
                    hashMap2.put(C112760b.m154197E().substring(i5, C112760b.m154197E().length() - i6), 57);
                    hashMap2.put(C112760b.m154198F().substring(i5, C112760b.m154198F().length() - i6), 58);
                    if (!iVar.yx0(hashMap, hashMap2, "sns_ad_landingpages/", 59)) {
                        i8 = 1;
                        i7 = 0;
                        hashMap2.put(C112760b.m154200H().substring(0, C112760b.m154200H().length() - 1), 59);
                    } else {
                        i8 = 1;
                        i7 = 0;
                    }
                    hashMap2.put(C112760b.m154201I().substring(i7, C112760b.m154201I().length() - i8), 60);
                    hashMap2.put(C112760b.m154204L().substring(i7, C112760b.m154204L().length() - i8), 61);
                    if (!iVar.yx0(hashMap, hashMap2, "vproxy/", 62)) {
                        i15 = 1;
                        i9 = 0;
                        hashMap2.put(C112760b.m154205M().substring(0, C112760b.m154205M().length() - 1), 62);
                    } else {
                        i15 = 1;
                        i9 = 0;
                    }
                    hashMap2.put(C112760b.m154206N().substring(i9, C112760b.m154206N().length() - i15), 63);
                    hashMap2.put(C112760b.m154207O().substring(i9, C112760b.m154207O().length() - i15), 64);
                    if (!iVar.yx0(hashMap, hashMap2, "wallet/", 65)) {
                        i17 = 1;
                        i16 = 0;
                        hashMap2.put(C112760b.m154208P().substring(0, C112760b.m154208P().length() - 1), 65);
                    } else {
                        i17 = 1;
                        i16 = 0;
                    }
                    hashMap2.put(C112760b.m154232g0().substring(i16, C112760b.m154232g0().length() - i17), 66);
                    hashMap2.put(C112760b.m154209Q().substring(i16, C112760b.m154209Q().length() - i17), 67);
                    hashMap2.put(C112760b.m154210R().substring(i16, C112760b.m154210R().length() - i17), 68);
                    hashMap2.put(C112760b.m154211S().substring(i16, C112760b.m154211S().length() - i17), 69);
                    hashMap2.put(C112760b.m154212T().substring(i16, C112760b.m154212T().length() - i17), 70);
                    hashMap2.put(C112760b.m154213U().substring(i16, C112760b.m154213U().length() - i17), 72);
                    String str32 = str5 + "scanner/";
                    hashMap2.put(str32.substring(0, str32.length() - 1), 73);
                    hashMap2.put(C112760b.m154203K().substring(0, C112760b.m154203K().length() - 1), 74);
                    hashMap2.put(C112760b.m154219a().substring(0, C112760b.m154219a().length() - 1), 75);
                    hashMap2.put(C112760b.m154199G().substring(0, C112760b.m154199G().length() - 1), 76);
                    hashMap2.put(C112760b.m154202J().substring(0, C112760b.m154202J().length() - 1), 77);
                    hashMap2.put(C112760b.m154248t().substring(0, C112760b.m154248t().length() - 1), 78);
                    hashMap2.put(C112760b.m154214V().substring(0, C112760b.m154214V().length() - 1), 79);
                    hashMap2.put(C112760b.m154215W().substring(0, C112760b.m154215W().length() - 1), 80);
                    if (!iVar.yx0(hashMap, hashMap2, "favoffline/", 81)) {
                        hashMap2.put(C112760b.m154251w().substring(0, C112760b.m154251w().length() - 1), 81);
                    }
                    if (!iVar.yx0(hashMap, hashMap2, "finder/", 82)) {
                        String str33 = str5 + "finder/";
                        hashMap2.put(str33.substring(0, str33.length() - 1), 82);
                    }
                    String str34 = str5 + "shakemusic/";
                    hashMap2.put(str34.substring(0, str34.length() - 1), 83);
                    String str35 = str5 + "recordPlugin/";
                    hashMap2.put(str35.substring(0, str35.length() - 1), 84);
                    String str36 = str5 + "audio/";
                    hashMap2.put(str36.substring(0, str36.length() - 1), 85);
                    C118387c.C118388a aVar3 = new C118387c.C118388a(m1Var.mo119971i());
                    ((C119157j) C119157j.f356862d).mo183876g(new C118399l(iVar, hashMap2, aVar3, m1Var, cVar), "summerhv_scanFile");
                    aVar = aVar3;
                    str = str2;
                    iVar.f353842w = aVar;
                    Log.m105925i(str, "summerhv auto scan started[%s]", C118396k.this.f353849a.f353842w);
                }
            }
            aVar = aVar2;
            iVar.f353842w = aVar;
            Log.m105925i(str, "summerhv auto scan started[%s]", C118396k.this.f353849a.f353842w);
        }
    }

    public C118396k(C118391i iVar) {
        this.f353849a = iVar;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        char c = 65535;
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c = 0;
                    break;
                }
                break;
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c = 1;
                    break;
                }
                break;
            case -1454123155:
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    c = 2;
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f353849a.f353839t = false;
                break;
            case 1:
                this.f353849a.f353838s = false;
                break;
            case 2:
                this.f353849a.f353839t = true;
                break;
            case 3:
                this.f353849a.f353838s = true;
                break;
        }
        Object[] objArr = new Object[5];
        objArr[0] = action;
        objArr[1] = Boolean.valueOf(this.f353849a.f353839t);
        objArr[2] = Boolean.valueOf(this.f353849a.f353838s);
        objArr[3] = Long.valueOf(this.f353849a.f353840u);
        objArr[4] = Boolean.valueOf(this.f353849a.f353841v == null);
        Log.m105927v("MicroMsg.SubCoreBaseMonitor", "summerhv Action received: %s, interactive: %s, charging: %s, lastScanTime:%d, delayTimerRunnable null[%b]", objArr);
        boolean hasDebuger = CrashReportFactory.hasDebuger() & false;
        C118391i iVar = this.f353849a;
        C88654b bVar = iVar.f353841v;
        if (bVar == null && ((iVar.f353838s && !iVar.f353839t) || hasDebuger)) {
            if (CrashReportFactory.hasDebuger()) {
                this.f353849a.f353835p = 0;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                C118391i iVar2 = this.f353849a;
                long j = currentTimeMillis - iVar2.f353840u;
                long j2 = iVar2.f353834o;
                if (j < j2 * 60000) {
                    Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv last scan time not matched in [%d]min", Long.valueOf(j2));
                    return;
                }
            }
            this.f353849a.f353841v = new C118398b(new C118397a());
            C119179t tVar = C119157j.f356862d;
            C118391i iVar3 = this.f353849a;
            ((C119157j) tVar).mo183879j(iVar3.f353841v, iVar3.f353835p * 60000, "MicroMsg.SubCoreBaseMonitor");
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan post delay[%d]min", Long.valueOf(this.f353849a.f353835p));
        } else if (bVar != null) {
            bVar.mo97819a();
            C118391i iVar4 = this.f353849a;
            iVar4.f353841v = null;
            Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan remove[%s]", iVar4.f353842w);
        } else {
            C118387c.C118388a aVar = iVar.f353842w;
            if (aVar != null) {
                aVar.f353810j = true;
                Log.m105925i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan canceled[%s]", aVar);
                this.f353849a.f353842w = null;
            }
        }
    }
}
