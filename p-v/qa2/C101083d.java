package qa2;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import la2.C99358f;
import na2.C61638d;
import p272xq.C15878h;
import qc0.C101093a;
import qc0.C101106m;
import ra2.C101365a;
import ua2.C101991b;
import za2.C102985c;

/* renamed from: qa2.d */
public class C101083d {

    /* renamed from: a */
    public static boolean f295908a;

    /* renamed from: b */
    public static boolean f295909b;

    /* renamed from: c */
    public static int f295910c;

    /* renamed from: d */
    public static long f295911d;

    /* renamed from: e */
    public static C101365a f295912e;

    /* renamed from: a */
    public static void m132452a(C101106m mVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (mVar == null) {
            Log.m105920e("MicroMsg.Music.MusicReportUtil", "idKeyReportMusicPlayerSum music is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(JsApiSetLabInfo.CTRL_INDEX);
        iDKey.SetKey(0);
        iDKey.SetValue(1);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(JsApiSetLabInfo.CTRL_INDEX);
        iDKey2.SetValue(1);
        IDKey iDKey3 = new IDKey();
        iDKey3.SetID(JsApiSetLabInfo.CTRL_INDEX);
        iDKey3.SetValue(1);
        if (z) {
            iDKey3.SetKey(10);
        } else if (C102985c.m136170a(mVar)) {
            int i4 = mVar.f295959d;
            Log.m105925i("MicroMsg.Music.MusicReportUtil", "idKeyReportExoMusicPlayerSum scene:%d", Integer.valueOf(i4));
            ArrayList arrayList2 = new ArrayList();
            IDKey iDKey4 = new IDKey();
            iDKey4.SetID(797);
            iDKey4.SetKey(0);
            iDKey4.SetValue(1);
            IDKey iDKey5 = new IDKey();
            iDKey5.SetID(797);
            Log.m105924i("MicroMsg.Music.ExoPlayIdkeyReport", "getExoMusicPlayerSumidKeyByMusicType, musicType:" + i4);
            if (i4 == 0) {
                i3 = 50;
            } else if (i4 == 1) {
                i3 = 51;
            } else if (i4 != 4) {
                switch (i4) {
                    case 6:
                        i3 = 53;
                        break;
                    case 7:
                        i3 = 54;
                        break;
                    case 8:
                        i3 = 55;
                        break;
                    case 9:
                        i3 = 56;
                        break;
                    case 10:
                        i3 = 57;
                        break;
                    case 11:
                        i3 = 58;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
            } else {
                i3 = 52;
            }
            iDKey5.SetKey(i3);
            iDKey5.SetValue(1);
            arrayList2.add(iDKey4);
            arrayList2.add(iDKey5);
            C115669n.INSTANCE.mo160124a(arrayList2, true);
            return;
        } else if (C102985c.m136171b(mVar.f295959d)) {
            iDKey3.SetKey(2);
            int i5 = mVar.f295959d;
            Log.m105924i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerSumidKeyByMusicType, musicType:" + i5);
            if (i5 == 0) {
                i2 = 117;
            } else if (i5 != 1) {
                switch (i5) {
                    case 4:
                        i2 = 119;
                        break;
                    case 5:
                        i2 = 120;
                        break;
                    case 6:
                        i2 = 121;
                        break;
                    case 7:
                        i2 = 122;
                        break;
                    case 8:
                        i2 = 123;
                        break;
                    case 9:
                        i2 = 124;
                        break;
                    case 10:
                        i2 = 125;
                        break;
                    case 11:
                        i2 = 126;
                        break;
                    default:
                        i2 = 127;
                        break;
                }
            } else {
                i2 = 118;
            }
            iDKey2.SetKey(i2);
            arrayList.add(iDKey2);
            C115669n.INSTANCE.mo160131h(14174, 1, Integer.valueOf(mVar.f295959d));
            if (C61638d.m72351b(mVar.f295955Q)) {
                IDKey iDKey6 = new IDKey();
                iDKey6.SetID(JsApiSetLabInfo.CTRL_INDEX);
                iDKey6.SetKey(216);
                iDKey6.SetValue(1);
                arrayList.add(iDKey6);
            }
        } else {
            iDKey3.SetKey(1);
            int i6 = mVar.f295959d;
            Log.m105924i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerSumidKeyByMusicType, musicType:" + i6);
            if (i6 == 0) {
                i = 105;
            } else if (i6 != 1) {
                switch (i6) {
                    case 4:
                        i = 107;
                        break;
                    case 5:
                        i = 108;
                        break;
                    case 6:
                        i = 109;
                        break;
                    case 7:
                        i = 110;
                        break;
                    case 8:
                        i = 111;
                        break;
                    case 9:
                        i = 112;
                        break;
                    default:
                        i = 113;
                        break;
                }
            } else {
                i = 106;
            }
            iDKey2.SetKey(i);
            arrayList.add(iDKey2);
            C115669n.INSTANCE.mo160131h(14174, 0, Integer.valueOf(mVar.f295959d));
            if (C61638d.m72351b(mVar.f295955Q)) {
                IDKey iDKey7 = new IDKey();
                iDKey7.SetID(JsApiSetLabInfo.CTRL_INDEX);
                iDKey7.SetKey(215);
                iDKey7.SetValue(1);
                arrayList.add(iDKey7);
            }
        }
        arrayList.add(iDKey);
        arrayList.add(iDKey3);
        C115669n.INSTANCE.mo160124a(arrayList, true);
    }

    /* renamed from: b */
    public static final void m132453b(int i, int i2) {
        C101365a U = ((C99358f) C101991b.m134284b(C99358f.class)).mo138809U();
        if (U != null) {
            Log.m105927v("MicroMsg.Music.MusicReportUtil", "kvReportAction: %d, %s, %s, %s, %s, %d, %d, %s, %s", 13232, U.field_musicId, U.field_songName, U.field_songAlbum, Integer.valueOf(U.field_songId), Integer.valueOf(i2), Integer.valueOf(i), U.field_songSinger, U.field_appId);
            C115669n.INSTANCE.mo160131h(13232, U.field_musicId, U.field_songName, U.field_songAlbum, Integer.valueOf(U.field_songId), Integer.valueOf(i2), Integer.valueOf(i), U.field_songSinger, U.field_appId);
        }
    }

    /* renamed from: c */
    public static void m132454c(int i, C101365a aVar) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat music is null, err");
            return;
        }
        Log.m105925i("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat scene:%d, action:%d, src:%s, title:%s, singer:%s", Integer.valueOf(aVar.field_musicType), Integer.valueOf(i), aVar.field_songWifiUrl, aVar.field_songName, aVar.field_songSinger);
        C115669n.INSTANCE.mo160131h(15106, Integer.valueOf(aVar.field_musicType), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), aVar.field_songWifiUrl, aVar.field_songName, aVar.field_songSinger);
    }

    /* renamed from: d */
    public static final synchronized void m132455d() {
        synchronized (C101083d.class) {
            if (f295912e != null) {
                if (f295911d > 0) {
                    f295910c = (int) (((long) f295910c) + ((System.currentTimeMillis() - f295911d) / 1000));
                    f295911d = 0;
                }
                Object[] objArr = new Object[12];
                objArr[0] = 13044;
                C101365a aVar = f295912e;
                int i = 1;
                objArr[1] = aVar.field_musicId;
                objArr[2] = aVar.field_songName;
                objArr[3] = aVar.field_songAlbum;
                objArr[4] = Integer.valueOf(aVar.field_songId);
                objArr[5] = 0;
                objArr[6] = Integer.valueOf(f295910c);
                objArr[7] = Integer.valueOf(f295908a ? 1 : 2);
                objArr[8] = Integer.valueOf(f295909b ? 1 : 2);
                objArr[9] = 0;
                C101365a aVar2 = f295912e;
                objArr[10] = aVar2.field_songSinger;
                objArr[11] = aVar2.field_appId;
                Log.m105927v("MicroMsg.Music.MusicReportUtil", "kvReportMusicPlayInfo: %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", objArr);
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr2 = new Object[11];
                C101365a aVar3 = f295912e;
                objArr2[0] = aVar3.field_musicId;
                objArr2[1] = aVar3.field_songName;
                objArr2[2] = aVar3.field_songAlbum;
                objArr2[3] = Integer.valueOf(aVar3.field_songId);
                objArr2[4] = 0;
                objArr2[5] = Integer.valueOf(f295910c);
                objArr2[6] = Integer.valueOf(f295908a ? 1 : 2);
                if (!f295909b) {
                    i = 2;
                }
                objArr2[7] = Integer.valueOf(i);
                objArr2[8] = 0;
                C101365a aVar4 = f295912e;
                objArr2[9] = aVar4.field_songSinger;
                objArr2[10] = aVar4.field_appId;
                nVar.mo160131h(13044, objArr2);
            }
            f295912e = null;
            f295908a = false;
            f295909b = false;
            f295910c = 0;
            f295911d = 0;
        }
    }

    /* renamed from: e */
    public static final void m132456e(int i) {
        C101365a U = ((C99358f) C101991b.m134284b(C99358f.class)).mo138809U();
        if (U != null) {
            Log.m105925i("MicroMsg.Music.MusicReportUtil", "ReportMusicPlayerShareStat ShareType:%d, MusicId:%s, MusicTitle:%s, Singer:%s, AppId:%s", Integer.valueOf(i), U.field_musicId, U.field_songName, U.field_songSinger, U.field_appId);
            C115669n.INSTANCE.mo160131h(12836, Integer.valueOf(i), U.field_musicId, U.field_songName, U.field_songSinger, U.field_appId);
        }
    }

    /* renamed from: f */
    public static final void m132457f(int i, int i2, int i3) {
        C101365a U = ((C99358f) C101991b.m134284b(C99358f.class)).mo138809U();
        if (U != null) {
            Log.m105927v("MicroMsg.Music.MusicReportUtil", "kvReportShakeReport: %d, %d, %d, %s, %s, %s, %s, %d %s, %s", 13042, Integer.valueOf(i), Integer.valueOf(i2), U.field_musicId, U.field_songName, U.field_songAlbum, Integer.valueOf(U.field_songId), Integer.valueOf(i3), U.field_songSinger, U.field_appId);
            C115669n.INSTANCE.mo160131h(13042, Integer.valueOf(i), Integer.valueOf(i2), U.field_musicId, U.field_songName, U.field_songAlbum, Integer.valueOf(U.field_songId), Integer.valueOf(i3), U.field_songSinger, U.field_appId);
        }
    }

    /* renamed from: g */
    public static final void m132458g(int i) {
        C101106m b;
        if (i == 2 && (b = C101093a.m132480b()) != null) {
            ((C15878h) C86312j.m106911c(C15878h.class)).mo14530mG(Util.getLong(b.f295944E, 0), 1, 0);
        }
    }

    /* renamed from: h */
    public static final void m132459h(int i) {
        C101106m b;
        if (i == 2 && (b = C101093a.m132480b()) != null) {
            ((C15878h) C86312j.m106911c(C15878h.class)).mo14530mG(Util.getLong(b.f295944E, 0), 0, 0);
        }
    }
}
