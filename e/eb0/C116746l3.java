package eb0;

import android.content.SharedPreferences;
import com.tencent.p014mm.network.C114768c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C81043p0;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85798u1;
import com.tencent.p014mm.vfs.C86009m1;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import junit.framework.Assert;
import kj2.C117407d;
import ob0.C117746w;
import pe3.C89349b;
import qe3.C118184l;
import qe3.C118185m;
import qe3.C118188q;
import qe3.C118189r;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C89623b0;
import qe3.C89626p;
import qe3.C89631w;
import sf0.C48374j0;
import te3.C118481y7;
import te3.C49227e33;
import te3.C50136kj;
import te3.C50270lj;
import te3.C51693vg2;
import te3.C52114yg2;
import te3.C64306d60;
import te3.xk4;

/* renamed from: eb0.l3 */
public class C116746l3 extends C117746w implements C89626p {

    /* renamed from: a */
    public final int f350047a;

    /* renamed from: b */
    public final C118191s f350048b;

    /* renamed from: c */
    public final C118193t f350049c;

    public C116746l3(int i) {
        Assert.assertTrue(i == 702 || i == 701 || i == 252 || i == 763);
        this.f350047a = i;
        if (i == 702 || i == 763) {
            this.f350048b = new C118184l();
            this.f350049c = new C118185m();
            return;
        }
        this.f350048b = new C118188q();
        this.f350049c = new C118189r();
    }

    /* renamed from: a */
    public static int m164675a(C114799u uVar) {
        int i;
        byte[] bArr;
        C118191s sVar = (C118191s) uVar.getReqObj();
        C118193t tVar = (C118193t) uVar.getRespObj();
        Log.m105925i("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo type:%d, hashcode:%d, ret:%d, stack[%s]", Integer.valueOf(sVar.getFuncId()), Integer.valueOf(uVar.hashCode()), Integer.valueOf(tVar.f353321g), Util.getStack());
        int i2 = tVar.f353321g;
        if (i2 != 0) {
            Log.m105919d("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo resp just decoded and ret result:%d", Integer.valueOf(i2));
            return tVar.f353321g;
        }
        xk4 xk4 = tVar.f353315a;
        int i3 = xk4.f354537d;
        if ((i3 & 1) != 0) {
            C118481y7 y7Var = xk4.f354538e;
            int i4 = y7Var.f354600x;
            Log.m105925i("MicroMsg.MMReqRespAuth", "decodeAndRetriveAccInfo authResultFlag:%d UpdateFlag:%d ", Integer.valueOf(i4), Integer.valueOf(y7Var.f354599w));
            byte[] d = C48374j0.m53715d(y7Var.f354580B);
            byte[] d2 = C48374j0.m53715d(y7Var.f354581C);
            C64306d60 d602 = y7Var.f354584e;
            byte[] d3 = C48374j0.m53715d(y7Var.f354585f);
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(d602.f182635e.f140572d);
            objArr[1] = Integer.valueOf(d602.f182634d);
            objArr[2] = Integer.valueOf(d3 == null ? -1 : d3.length);
            objArr[3] = Util.secPrint(Util.dumpHex(d3));
            objArr[4] = Util.secPrint(Util.dumpHex(d));
            objArr[5] = Util.secPrint(Util.dumpHex(d2));
            Log.m105919d("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key len:%d, nid:%d sessionKey len:%d, sessionKey：%s, clientSession[%s], serverSession[%s]", objArr);
            byte[] d4 = C48374j0.m53715d(d602.f182635e);
            byte[] bArr2 = sVar.f353314a;
            if (!Util.isNullOrNil(d4)) {
                Object[] objArr2 = new Object[4];
                objArr2[0] = Integer.valueOf(d4.length);
                objArr2[1] = Util.secPrint(Util.dumpHex(d4));
                objArr2[2] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
                objArr2[3] = Util.secPrint(Util.dumpHex(bArr2));
                Log.m105919d("MicroMsg.MMReqRespAuth", "summerauth svrPubKey len:%d value:%s prikey len:%d, values:%s", objArr2);
                PByteArray pByteArray = new PByteArray();
                int computerKeyWithAllStr = MMProtocalJni.computerKeyWithAllStr(d602.f182634d, d4, bArr2, pByteArray, 0);
                bArr = pByteArray.value;
                Object[] objArr3 = new Object[3];
                objArr3[0] = Integer.valueOf(computerKeyWithAllStr);
                objArr3[1] = Integer.valueOf(bArr == null ? -1 : bArr.length);
                objArr3[2] = Util.secPrint(Util.dumpHex(bArr));
                Log.m105925i("MicroMsg.MMReqRespAuth", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", objArr3);
            } else {
                C117407d.INSTANCE.idkeyStat(148, 24, 1, false);
                Log.m105928w("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key is null!");
                bArr = null;
            }
            tVar.f353317c = bArr != null ? bArr : new byte[0];
            if ((i4 & 4) != 0) {
                Log.m105918d("MicroMsg.MMReqRespAuth", "summerauth must decode session key");
                if (!Util.isNullOrNil(bArr)) {
                    byte[] aesDecrypt = MMProtocalJni.aesDecrypt(d3, bArr);
                    Object[] objArr4 = new Object[4];
                    objArr4[0] = Integer.valueOf(d3 == null ? -1 : d3.length);
                    objArr4[1] = Util.secPrint(Util.dumpHex(d3));
                    objArr4[2] = Integer.valueOf(aesDecrypt == null ? -1 : aesDecrypt.length);
                    objArr4[3] = Util.secPrint(Util.dumpHex(aesDecrypt));
                    Log.m105919d("MicroMsg.MMReqRespAuth", "summerauth aesDecrypt sessionKey len:%d, value:%s, session len:%d, value:%s", objArr4);
                    if (!Util.isNullOrNil(aesDecrypt)) {
                        Log.m105919d("MicroMsg.MMReqRespAuth", "summerauth decode session key succ session:%s", Util.secPrint(Util.dumpHex(aesDecrypt)));
                        tVar.mo182989b(aesDecrypt, d, d2);
                        tVar.f353321g = 1;
                    } else {
                        C117407d.INSTANCE.idkeyStat(148, 25, 1, false);
                        Log.m105918d("MicroMsg.MMReqRespAuth", "summerauth decode session key failed ret null!");
                        tVar.mo182989b(new byte[0], d, d2);
                        tVar.f353321g = 2;
                    }
                } else {
                    C117407d.INSTANCE.idkeyStat(148, 26, 1, false);
                    Log.m105918d("MicroMsg.MMReqRespAuth", "summerauth decode session key failed as agreedECDHKey is null!");
                    tVar.mo182989b(new byte[0], d, d2);
                    tVar.f353321g = 2;
                }
            } else {
                C117407d.INSTANCE.idkeyStat(148, 27, 1, false);
                Log.m105918d("MicroMsg.MMReqRespAuth", "summerauth not need decode session key");
                tVar.mo182989b(d3, d, d2);
                tVar.f353321g = 1;
            }
            i = 2;
        } else {
            Log.m105919d("MicroMsg.MMReqRespAuth", "summerauth auth sect not set so ret failed AuthSectResp[%s]", xk4.f354538e);
            tVar.mo182989b(new byte[0], new byte[0], new byte[0]);
            i = 2;
            tVar.f353321g = 2;
        }
        if ((i & i3) != 0) {
            tVar.f353316b = xk4.f354539f.f353929d;
        } else {
            Log.m105918d("MicroMsg.MMReqRespAuth", "summerauth acct sect not set!");
        }
        return tVar.f353321g;
    }

    /* renamed from: c */
    public static void m164676c(boolean z, C50270lj ljVar, C49227e33 e332, C52114yg2 yg22, boolean z2, int i) {
        LinkedList<C51693vg2> linkedList;
        C50270lj ljVar2 = ljVar;
        C49227e33 e333 = e332;
        C52114yg2 yg23 = yg22;
        int i2 = i;
        Object[] objArr = new Object[9];
        objArr[0] = Boolean.valueOf(z);
        int i3 = -1;
        objArr[1] = Integer.valueOf(ljVar2 == null ? -1 : ljVar2.f137448d);
        objArr[2] = Integer.valueOf(ljVar2 == null ? -1 : ljVar2.f137449e);
        objArr[3] = Integer.valueOf(yg23 == null ? -1 : yg23.f145276d);
        objArr[4] = Integer.valueOf(e333 == null ? -1 : e333.f132662f);
        objArr[5] = Integer.valueOf(e333 == null ? -1 : e333.f132663g);
        if (e333 != null) {
            i3 = e333.f132664h;
        }
        objArr[6] = Integer.valueOf(i3);
        String str = "null";
        objArr[7] = e333 == null ? str : e333.f132660d;
        if (e333 != null) {
            str = e333.f132661e;
        }
        objArr[8] = str;
        Log.m105925i("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo resetnewwork:%b iplist[l:%d s:%d] hostList[%d] noop[%d %d] typing[%d] port[%s] timeout[%s]", objArr);
        if (yg23 == null || (linkedList = yg23.f145277e) == null || linkedList.size() <= 0) {
            Log.m105923f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", Util.getStack());
            return;
        }
        LinkedList linkedList2 = new LinkedList();
        linkedList2.clear();
        String str2 = "";
        if (ljVar2 != null) {
            Iterator<C50136kj> it = ljVar2.f137452h.iterator();
            while (it.hasNext()) {
                C50136kj next = it.next();
                C89349b bVar = next.f136818g;
                linkedList2.add(new C89623b0(next.f136815d, next.f136817f.mo123705h(), next.f136816e, bVar != null ? bVar.mo123705h() : str2));
                Log.m105919d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo short type:%d port:%d ip:%s", Integer.valueOf(next.f136815d), Integer.valueOf(next.f136816e), next.f136817f.mo123705h());
            }
        }
        String c = C89623b0.m112054c(linkedList2);
        LinkedList linkedList3 = new LinkedList();
        if (ljVar2 != null) {
            Iterator<C50136kj> it4 = ljVar2.f137451g.iterator();
            while (it4.hasNext()) {
                C50136kj next2 = it4.next();
                C89349b bVar2 = next2.f136818g;
                linkedList3.add(new C89623b0(next2.f136815d, next2.f136817f.mo123705h(), next2.f136816e, bVar2 != null ? bVar2.mo123705h() : str2));
                Log.m105919d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo long type:%d port:%d ip:%s", Integer.valueOf(next2.f136815d), Integer.valueOf(next2.f136816e), next2.f136817f.mo123705h());
            }
        }
        String c2 = C89623b0.m112054c(linkedList3);
        Log.m105919d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo builtin ip long[%s] short[%s]", c2, c);
        C86709a0.m107528h();
        C86709a0.m107535s().f251803a.mo119664f(2, c);
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0);
        sharedPreferences.edit().putString("builtin_short_ips", c).commit();
        C86709a0.m107528h();
        C86709a0.m107535s().f251803a.mo119664f(3, c2);
        C89623b0.C89624a aVar = null;
        if (e333 != null) {
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(6, e333.f132660d);
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(7, e333.f132661e);
            if (e333.f132664h != 0) {
                C86709a0.m107528h();
                C85798u1 u1Var = C86709a0.m107535s().f251803a;
                int i4 = e333.f132664h;
                if (i4 > 60) {
                    i4 = 60;
                }
                u1Var.mo119664f(35, Integer.valueOf(i4));
            }
            long j = (long) e333.f132662f;
            long j2 = (long) e333.f132665i;
            String str3 = C81043p0.f238066a;
            if (j2 > 0) {
                MMApplicationContext.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 2).commit();
                if (j >= 180 && j <= 3600 && System.currentTimeMillis() / 1000 >= j2) {
                    try {
                        C86009m1 m1Var = new C86009m1(C81043p0.f238066a);
                        if (m1Var.mo119967g()) {
                            long j3 = C81043p0.m99016a()[1];
                            if (j3 > 0 && j3 >= j2) {
                            }
                        } else if (!m1Var.mo119964e()) {
                        }
                        C81043p0.m99017b(j, j2);
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                }
            } else if (j <= 0) {
                MMApplicationContext.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 1).commit();
            } else if (j >= 180 && j <= 3600) {
                MMApplicationContext.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 3).putLong("noop_min_interval", j).commit();
            }
            aVar = C89623b0.m112053b(e333.f132660d, e333.f132661e);
        }
        int size = yg23.f145277e.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[yg23.f145277e.size()];
        int[] iArr = new int[yg23.f145277e.size()];
        Log.m105919d("MicroMsg.MMReqRespAuth", "hostlist.Count=%d", Integer.valueOf(yg23.f145276d));
        Iterator<C51693vg2> it5 = yg23.f145277e.iterator();
        String str4 = str2;
        int i5 = 0;
        while (it5.hasNext()) {
            C51693vg2 next3 = it5.next();
            Iterator<C51693vg2> it6 = it5;
            Log.m105919d("MicroMsg.MMReqRespAuth", "dkidc host org:%s sub:%s", next3.f143479d, next3.f143480e);
            String str5 = next3.f143479d;
            strArr[i5] = str5;
            strArr2[i5] = next3.f143480e;
            iArr[i5] = next3.f143481f;
            i5++;
            if (!Util.isNullOrNil(str5) && !Util.isNullOrNil(next3.f143480e)) {
                if (next3.f143479d.equals(C114768c.f344143b)) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().f251803a.mo119664f(24, next3.f143480e);
                    str2 = next3.f143480e;
                } else if (next3.f143479d.equals(C114768c.f344142a)) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().f251803a.mo119664f(25, next3.f143480e);
                    str4 = next3.f143480e;
                } else if (next3.f143479d.equals("support.weixin.qq.com") && !Util.isNullOrNil(next3.f143480e)) {
                    sharedPreferences.edit().putString("support.weixin.qq.com", next3.f143480e).commit();
                }
            }
            it5 = it6;
        }
        C86709a0.m107528h();
        C114770g gVar = C86709a0.m107529k().f251779b.f256809d;
        if (size > 0 && gVar != null) {
            gVar.mo55481k1(strArr, strArr2, iArr);
        }
        if (!Util.isNullOrNil(str4)) {
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(25, str4);
        }
        if (!Util.isNullOrNil(str2)) {
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(24, str2);
        }
        if (!(gVar == null || aVar == null)) {
            gVar.mo55483n1(z, c, c2, (int[]) null, aVar.f257832a, aVar.f257833b, aVar.f257834c, str2, str4);
        }
        if (z2 && gVar != null) {
            int o4 = gVar.mo55486o4();
            Log.m105925i("MicroMsg.MMReqRespAuth", "new cert region %d, current region %d", Integer.valueOf(i), Integer.valueOf(o4));
            if (i2 == 0) {
                gVar.mo55469c4();
                C117407d.INSTANCE.idkeyStat(148, 60, 1, false);
            } else if (i2 > 0 && o4 != i2) {
                gVar.mo55469c4();
                gVar.mo55485n4(i2);
                C117407d.INSTANCE.idkeyStat(148, 59, 1, false);
            }
        }
    }

    /* renamed from: b */
    public int mo180722b() {
        if (C86709a0.m107522a()) {
            C86709a0.m107528h();
            return C86709a0.m107523b().mo121110g();
        }
        Log.m105921e("MicroMsg.MMReqRespAuth", "dkwt acc NOT Ready , the MMReqRespBase need the uin ???  if u find this log , kick dk. %s", Util.getStack());
        return 0;
    }

    public C89631w.C89634d getReqObjImp() {
        return this.f350048b;
    }

    public C89631w.C89636e getRespObj() {
        return this.f350049c;
    }

    public int getType() {
        return this.f350048b.getFuncId();
    }

    public String getUri() {
        return this.f350048b.mo182987a();
    }
}
