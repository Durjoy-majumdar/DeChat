package eb0;

import android.text.TextUtils;
import com.tencent.p014mm.modelsimple.C68143w;
import com.tencent.p014mm.modelsimple.C81015n0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import kj2.C117407d;
import ob0.C89137b0;
import p823sg.C77710q;
import qe3.C101127f;
import qe3.C89625d;
import sf0.C48374j0;
import te3.C118422c1;
import te3.C118481y7;
import te3.C49510g33;
import te3.C51018qv3;
import te3.C51693vg2;
import te3.C51830wg2;
import te3.C51971xg2;
import te3.C52114yg2;
import te3.C64724t8;
import te3.C64747u8;
import te3.by4;
import te3.xk4;
import tf3.C37066b;
import zt3.C119157j;

/* renamed from: eb0.e2 */
public class C116728e2 {

    /* renamed from: eb0.e2$b */
    public class C58539b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C64724t8 f167580d;

        public C58539b(C64724t8 t8Var) {
            this.f167580d = t8Var;
        }

        public void run() {
            Log.m105924i("MicroMsg.HandleAuthResponse", "summerauth do NetsceneAxAuth");
            C89137b0 d = C86709a0.m107524d();
            C64724t8 t8Var = this.f167580d;
            int i = t8Var.f185507d;
            d.mo123460f(new C81015n0(i, t8Var.f185510g, t8Var.f185512i, i, t8Var.f185508e, t8Var.f185511h.f140574f.f257327a, 0));
        }
    }

    /* renamed from: eb0.e2$a */
    public class C116729a implements Runnable {
        public void run() {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
            String string = multiProcessMMKV.getString("MMKV_LOGIN_DATE", "");
            String string2 = multiProcessMMKV.getString("MMKV_LOGIN_CLIENT_VERSION_REV", "");
            if (!format.equals(string) || !string2.equals(BuildInfo.REV)) {
                C117407d dVar = C117407d.INSTANCE;
                dVar.mo160126c(28611, dVar.mo182087p(BuildInfo.REV), true, true);
                multiProcessMMKV.putString("MMKV_LOGIN_DATE", format);
                multiProcessMMKV.putString("MMKV_LOGIN_CLIENT_VERSION_REV", BuildInfo.REV);
                multiProcessMMKV.commit();
            }
        }
    }

    /* renamed from: a */
    public static void m164638a(C64747u8 u8Var) {
        Object[] objArr = new Object[1];
        int i = -1;
        objArr[0] = Integer.valueOf(u8Var == null ? -1 : u8Var.f185721d);
        Log.m105925i("MicroMsg.HandleAuthResponse", "summerauths updateProfile axauth list[%s]", objArr);
        C86709a0.m107528h();
        C114770g gVar = C86709a0.m107529k().f251779b.f256809d;
        if (gVar != null && gVar.mo55443A3() != null) {
            gVar.mo55443A3().mo55420P2();
            if (u8Var == null || u8Var.f185721d == 0) {
                Log.m105928w("MicroMsg.HandleAuthResponse", "summerauthax axAuthSecRespList null or count == 0");
                return;
            }
            LinkedList<C64724t8> linkedList = u8Var.f185722e;
            if (linkedList == null || linkedList.size() != u8Var.f185721d) {
                Object[] objArr2 = new Object[2];
                if (linkedList != null) {
                    i = linkedList.size();
                }
                objArr2[0] = Integer.valueOf(i);
                objArr2[1] = Integer.valueOf(u8Var.f185721d);
                Log.m105929w("MicroMsg.HandleAuthResponse", "summerauthax updateProfile axauth size not match! [%s, %s]", objArr2);
            }
            Log.m105918d("MicroMsg.HandleAuthResponse", "axauth list size " + linkedList.size());
            if (linkedList.size() != 0) {
                Iterator<C64724t8> it = linkedList.iterator();
                while (it.hasNext()) {
                    C64724t8 next = it.next();
                    int i2 = next.f185507d;
                    C52114yg2 yg22 = next.f185509f;
                    try {
                        Log.m105924i("MicroMsg.HandleAuthResponse", "do axauth bussType " + i2);
                        gVar.mo55443A3().mo55416E0(i2, yg22.toByteArray());
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.HandleAuthResponse", "exception:%s", Util.stackTraceToString(e));
                    }
                    int size = yg22.f145277e.size();
                    String[] strArr = new String[size];
                    String[] strArr2 = new String[yg22.f145277e.size()];
                    int[] iArr = new int[yg22.f145277e.size()];
                    Log.m105925i("MicroMsg.HandleAuthResponse", "hostlist.Count=%d", Integer.valueOf(yg22.f145276d));
                    Iterator<C51693vg2> it4 = yg22.f145277e.iterator();
                    int i3 = 0;
                    while (it4.hasNext()) {
                        C51693vg2 next2 = it4.next();
                        Log.m105925i("MicroMsg.HandleAuthResponse", "ax host org:%s sub:%s", next2.f143479d, next2.f143480e);
                        String str = next2.f143479d;
                        strArr[i3] = str;
                        strArr2[i3] = next2.f143480e;
                        iArr[i3] = next2.f143481f;
                        i3++;
                        if (!Util.isNullOrNil(str)) {
                            Util.isNullOrNil(next2.f143480e);
                        }
                    }
                    if (size > 0) {
                        gVar.mo55472e5(strArr, strArr2, iArr);
                    }
                }
                Iterator<C64724t8> it5 = linkedList.iterator();
                while (it5.hasNext()) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C58539b(it5.next()));
                }
            }
        }
    }

    /* renamed from: b */
    public static void m164639b(xk4 xk4, boolean z) {
        int i;
        C51018qv3 qv32;
        C118481y7 y7Var;
        xk4 xk42 = xk4;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_UPDATE_UPDATE_VERION_LONG;
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_UPDATE_UPDATE_TIME_LONG;
        C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_UPDATE_UPDATE_FLAG_LONG;
        int i2 = xk42.f354537d;
        Object[] objArr = new Object[6];
        C118481y7 y7Var2 = xk42.f354538e;
        objArr[0] = Integer.valueOf(y7Var2 == null ? -1 : y7Var2.f354599w);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = xk42.f354538e;
        objArr[3] = xk42.f354539f;
        objArr[4] = xk42.f354540g;
        objArr[5] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.HandleAuthResponse", "summerauth updateProfile succ update:%d unifyFlag:%d, auth:%s, acct:%s, network:%s autoauth:%b", objArr);
        int i3 = i2 & 1;
        if (i3 == 0 || (y7Var = xk42.f354538e) == null) {
            Log.m105928w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set and new uin is 0!");
            i = 0;
        } else {
            i = y7Var.f354583d;
        }
        C86709a0.m107528h().mo121098i(i);
        C85801v1 i4 = C86709a0.m107535s().mo121142i();
        Boolean bool = Boolean.FALSE;
        i4.mo119676J(256, bool);
        int i5 = xk42.f354538e.f354600x;
        Log.printInfoStack("MicroMsg.ConfigStorageLogic", "[setAuthDeviceFlag] flag=%s", Integer.valueOf(i5));
        C75592q0.f222074a = i5;
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AUTH_DEVICE_FLAG_INT_SYNC, Integer.valueOf(i5));
        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt("PREF_KEY_LAST_AUTH_FLAG", i5);
        if (i3 != 0) {
            int i6 = xk42.f354538e.f354599w;
            if (i6 > 0) {
                i4.mo119677K(aVar4, Long.valueOf((long) i6));
                i4.mo119677K(aVar3, Long.valueOf(Util.nowSecond()));
                i4.mo119677K(aVar2, Long.valueOf((long) C89625d.f257841g));
                Log.m105925i("MicroMsg.HandleAuthResponse", "summerauth updateProfile need update flag[%d], autoauth[%b]", Integer.valueOf(xk42.f354538e.f354599w), Boolean.valueOf(z));
                if (z) {
                    C117407d.INSTANCE.idkeyStat(148, xk42.f354538e.f354599w == 2 ? 19 : 41, 1, true);
                } else {
                    C117407d.INSTANCE.idkeyStat(148, xk42.f354538e.f354599w == 2 ? 10 : 11, 1, true);
                }
            } else {
                i4.mo119677K(aVar4, Long.valueOf((long) i6));
                i4.mo119677K(aVar3, Long.valueOf(Util.nowSecond()));
                i4.mo119677K(aVar2, 0L);
            }
        }
        if ((i2 & 2) != 0) {
            C118422c1 c1Var = xk42.f354539f;
            String str = c1Var.f353940r;
            Log.m105925i("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect BindUin:%s, Status:%d, UserName:%s, NickName:%s, BindEmail:%s, BindMobile:%s, Alias:%s, PluginFlag:%d, RegType:%d, DeviceInfoXml:%s, SafeDevice:%d, OfficialUserName:%s, OfficialUserName:%s PushMailStatus:%d, FSURL:%s", C77710q.m93738a(c1Var.f353931f), Integer.valueOf(c1Var.f353935j), c1Var.f353929d, c1Var.f353930e, c1Var.f353932g, c1Var.f353933h, c1Var.f353934i, Integer.valueOf(c1Var.f353936n), Integer.valueOf(c1Var.f353937o), c1Var.f353938p, Integer.valueOf(c1Var.f353939q), str, str, Integer.valueOf(c1Var.f353942t), c1Var.f353943u);
            if (!z) {
                i4.mo119676J(52, Integer.valueOf(c1Var.f353937o));
            }
            i4.mo119676J(9, Integer.valueOf(c1Var.f353931f));
            i4.mo119676J(7, Integer.valueOf(c1Var.f353935j));
            i4.mo119676J(2, c1Var.f353929d);
            i4.mo119676J(4, c1Var.f353930e);
            i4.mo119676J(5, c1Var.f353932g);
            i4.mo119676J(6, c1Var.f353933h);
            i4.mo119676J(42, c1Var.f353934i);
            i4.mo119676J(34, Integer.valueOf(c1Var.f353936n));
            C86709a0.m107535s().mo121144k().mo119657Ow(c1Var.f353938p);
            i4.mo119676J(64, Integer.valueOf(c1Var.f353939q));
            i4.mo119676J(21, c1Var.f353940r);
            i4.mo119676J(22, c1Var.f353940r);
            i4.mo119676J(17, Integer.valueOf(c1Var.f353942t));
            C7624i3.f25910c.mo8756d("login_weixin_username", c1Var.f353929d);
            C7624i3.f25910c.mo8756d("last_login_nick_name", c1Var.f353930e);
            C7624i3.f25910c.mo8755c(c1Var.f353933h, c1Var.f353931f, c1Var.f353932g);
        } else {
            Log.m105928w("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect not set!");
        }
        C118422c1 c1Var2 = xk42.f354539f;
        if (c1Var2 != null) {
            C116734h6.m164660p(c1Var2.f353945w);
            C116734h6.m164658n(xk42.f354539f.f353946x);
            C116734h6.m164654j(xk42.f354539f.f353947y);
        }
        if (!z && C86709a0.m107522a()) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
        }
        if (i3 != 0) {
            C118481y7 y7Var3 = xk42.f354538e;
            String str2 = y7Var3.f354593q;
            String encodeHexString = Util.encodeHexString(C48374j0.m53715d(y7Var3.f354594r));
            Log.m105925i("MicroMsg.HandleAuthResponse", "summerauth updateProfile AuthTicket:%s, NewVersion:%d, UpdateFlag:%d, AuthResultFlag:%d, authKey:%s a2Key:%s fsurl:%s", y7Var3.f354597u, Integer.valueOf(y7Var3.f354598v), Integer.valueOf(y7Var3.f354599w), Integer.valueOf(y7Var3.f354600x), Util.secPrint(str2), Util.secPrint(encodeHexString), y7Var3.f354601y);
            int i7 = y7Var3.f354587h;
            C77710q qVar = new C77710q(Util.nullAsNil((Integer) i4.mo119684e(9, 0)));
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(i7);
            objArr2[1] = qVar;
            C51018qv3 qv33 = y7Var3.f354588i;
            objArr2[2] = Integer.valueOf(qv33 == null ? -1 : qv33.f140572d);
            Log.m105925i("MicroMsg.HandleAuthResponse", "summerauth updateProfile wtBuffFlag:%d, bindQQ:%s buff len:%d", objArr2);
            if (i7 != 0) {
                if (i7 == 1) {
                    C117407d.INSTANCE.idkeyStat(148, 20, 1, false);
                    byte[] d = C48374j0.m53715d(y7Var3.f354588i);
                    C86709a0.m107523b().mo121113k().mo182476f(qVar.longValue(), d);
                    Log.m105925i("MicroMsg.HandleAuthResponse", "WTLoginRspBuff len %s", Integer.valueOf(d.length));
                    String encodeHexString2 = Util.encodeHexString(C86709a0.m107523b().mo121113k().mo182472b(qVar.longValue()));
                    i4.mo119676J(-1535680990, str2);
                    i4.mo119676J(46, encodeHexString);
                    i4.mo119676J(72, encodeHexString2);
                    i4.mo119676J(29, y7Var3.f354601y);
                } else {
                    String str3 = encodeHexString;
                    if (i7 == 2) {
                        C117407d.INSTANCE.idkeyStat(148, 21, 1, false);
                        C86709a0.m107523b().mo121113k().mo182471a(qVar.longValue());
                        String encodeHexString3 = Util.encodeHexString(C86709a0.m107523b().mo121113k().mo182472b(qVar.longValue()));
                        i4.mo119676J(-1535680990, str2);
                        i4.mo119676J(46, str3);
                        i4.mo119676J(72, encodeHexString3);
                        i4.mo119676J(29, y7Var3.f354601y);
                    } else {
                        Log.m105925i("MicroMsg.HandleAuthResponse", "summerauth undefined wrBuffFlag[%d]", Integer.valueOf(i7));
                    }
                }
            }
            if (!z && ((qv32 = y7Var3.f354588i) == null || qv32.f140572d == 0)) {
                Log.m105924i("MicroMsg.HandleAuthResponse", "maybe no qq login");
                if (C86709a0.m107522a()) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, bool);
                }
            }
            Log.m105925i("MicroMsg.HandleAuthResponse", "wtBuffFlag %s", Integer.valueOf(i7));
            by4 by4 = y7Var3.f354589j;
            if (by4 != null) {
                String encodeHexString4 = Util.encodeHexString(C48374j0.m53715d(by4.f131396e));
                if (encodeHexString4 != null && encodeHexString4.length() > 0) {
                    i4.mo119676J(47, encodeHexString4);
                    C86709a0.m107535s().f251803a.mo119664f(18, encodeHexString4);
                }
                Log.m105925i("MicroMsg.HandleAuthResponse", "updateProfile ksid:%s", Util.secPrint(encodeHexString4));
            }
            Log.m105925i("MicroMsg.HandleAuthResponse", "summerauth get ecdh flag %d, set local cache %d ", Integer.valueOf(y7Var3.f354582D), Integer.valueOf(MMApplicationContext.getContext().getSharedPreferences("auth_info_key_prefs", 4).edit().putBoolean("auth_info_prefs_use_new_ecdh", y7Var3.f354582D == 1).commit() ? 1 : 0));
            C101127f.f296015a = y7Var3.f354582D == 1;
        } else {
            Log.m105928w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set!");
            C117407d.INSTANCE.idkeyStat(148, 22, 1, false);
        }
        if ((i2 & 4) != 0) {
            C117407d.INSTANCE.idkeyStat(148, 23, 1, false);
            C49510g33 g332 = xk42.f354540g;
            C116746l3.m164676c(false, g332.f133828f, g332.f133827e, g332.f133826d, false, 0);
        } else {
            Log.m105928w("MicroMsg.HandleAuthResponse", "summerauth updateProfile networksect not set!");
        }
        i4.mo119676J(3, "");
        i4.mo119676J(19, "");
        i4.mo119681a(true);
        C86709a0.m107535s().f251803a.mo119666g(46, 0);
        if (C86480a.m107209c()) {
            try {
                C86709a0.m107528h();
                C86480a aVar5 = C86709a0.m107523b().f251753d;
                C86709a0.m107528h();
                aVar5.mo120938a(C86709a0.m107529k().f251779b.f256809d.mo55443A3());
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.AccInfoCacheInWorker", "tryBackupToWorker Exception:%s", Util.stackTraceToString(th));
            }
        }
        m164640c(xk42.f354542i);
        if ((i2 & 8) != 0) {
            Log.m105918d("MicroMsg.HandleAuthResponse", "start parse axauth ");
            m164638a(xk42.f354541h);
        } else {
            Log.m105928w("MicroMsg.HandleAuthResponse", "summerauth updateProfile axauthsect no set!");
        }
        int i8 = xk42.f354538e.f354600x;
        if (!z || ((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C37066b()) == 1) {
            if ((i8 & 8) == 0) {
                String s = C75592q0.m90789s();
                if (!TextUtils.isEmpty(s)) {
                    C86709a0.m107529k().f251779b.mo123460f(new C68143w(s));
                }
            } else {
                Log.m105925i("MicroMsg.HandleAuthResponse", "summerauth not need getProfile authResultFlag:%d", Integer.valueOf(i8));
                C117407d.INSTANCE.idkeyStat(148, 9, 1, false);
            }
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C116729a());
    }

    /* renamed from: c */
    public static void m164640c(C51971xg2 xg22) {
        LinkedList<C51830wg2> linkedList;
        if (xg22 == null || (linkedList = xg22.f144640e) == null || xg22.f144639d == 0 || linkedList.size() <= 0) {
            Log.m105924i("MicroMsg.HandleAuthResponse", "handleHostAlgo ignore. empty list");
            return;
        }
        C86709a0.m107528h();
        C114770g gVar = C86709a0.m107529k().f251779b.f256809d;
        if (gVar != null && gVar.mo55443A3() != null) {
            gVar.mo55443A3().mo55442x4();
            Iterator<C51830wg2> it = xg22.f144640e.iterator();
            while (it.hasNext()) {
                C51830wg2 next = it.next();
                gVar.mo55443A3().mo55427g3(next.f144040d, next.f144041e);
            }
        }
    }
}
