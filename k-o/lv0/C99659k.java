package lv0;

import android.util.Pair;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C86484b;
import g62.C75875l;
import g62.C8235p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import jv0.C99055a;
import ov0.C100546d;
import ov0.C100554g;
import pv0.C100968x;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C77926f9;
import yu0.C102908a;

/* renamed from: lv0.k */
public class C99659k {

    /* renamed from: lv0.k$a */
    public static class C99660a {
    }

    /* renamed from: a */
    public static C77926f9 m130075a(C72963f4 f4Var, boolean z, String str, PLong pLong, LinkedList<C100968x> linkedList, HashMap<Long, C99660a> hashMap, boolean z2, boolean z3, long j) {
        String str2 = str;
        PLong pLong2 = pLong;
        if (f4Var.mo108774y2() == 0) {
            Log.m105921e("MicroMsg.BackupPackMsgLogic", "packedMsg msgSvrId is 0, talker[%s], type[%d]", f4Var.mo108768t(), Integer.valueOf(f4Var.getType()));
            return null;
        }
        C77926f9 f9Var = new C77926f9();
        f9Var.f227348v = f4Var.mo108774y2();
        if (f4Var.mo108769t2() == 1) {
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = str2;
            rv32.f141176e = true;
            f9Var.f227335f = rv32;
            C51163rv3 rv33 = new C51163rv3();
            rv33.f141175d = f4Var.mo108768t();
            rv33.f141176e = true;
            f9Var.f227336g = rv33;
            f9Var.f227338i = 2;
        } else {
            C51163rv3 rv34 = new C51163rv3();
            rv34.f141175d = f4Var.mo108768t();
            rv34.f141176e = true;
            f9Var.f227335f = rv34;
            C51163rv3 rv35 = new C51163rv3();
            rv35.f141175d = str2;
            rv35.f141176e = true;
            f9Var.f227336g = rv35;
            f9Var.f227338i = z2 ? 3 : 4;
        }
        f9Var.f227345s = new C51018qv3();
        f9Var.f227346t = 0;
        f9Var.f227347u = 0;
        f9Var.f227340n = "";
        f9Var.f227333d = C72695v.m85061c(f4Var.getType());
        f9Var.f227339j = (int) (f4Var.getCreateTime() / 1000);
        f9Var.f227350x = f4Var.getCreateTime();
        f9Var.f227349w = (int) f4Var.mo108772w2();
        f9Var.f227351y = f4Var.mo108762o2();
        C51163rv3 rv36 = new C51163rv3();
        rv36.mo73357f(Util.nullAs(f4Var.getContent(), ""));
        f9Var.f227337h = rv36;
        if (C99654f.f292065c == null) {
            C99654f fVar = new C99654f();
            C99654f.f292065c = fVar;
            C102908a.m136012a(fVar);
        }
        C99663m c = C99654f.f292065c.mo139035c(C72695v.m85061c(f4Var.getType()));
        if (c == null) {
            Log.m105919d("MicroMsg.BackupPackMsgLogic", "packedMsg unknow type[%d]", Integer.valueOf(f4Var.getType()));
            return null;
        }
        int b = c.mo139034b(f9Var, z, f4Var, str, linkedList, hashMap, z3, j);
        if (b < 0) {
            return null;
        }
        pLong2.value = pLong2.value + ((long) b) + 60;
        return f9Var;
    }

    /* renamed from: b */
    public static C72963f4 m130076b(C77926f9 f9Var, HashMap<String, Integer> hashMap, HashSet<String> hashSet, HashMap<String, Pair<Long, Long>> hashMap2) {
        int i;
        int i2;
        Pair pair;
        C77926f9 f9Var2 = f9Var;
        HashMap<String, Integer> hashMap3 = hashMap;
        HashSet<String> hashSet2 = hashSet;
        HashMap<String, Pair<Long, Long>> hashMap4 = hashMap2;
        C100554g h = C100546d.m131563g().mo139995h();
        if (h.f294625o != 0) {
            String str = (String) h.f294611a.mo119684e(2, (Object) null);
            C75875l h2 = C100546d.m131563g().mo139995h().mo140008h();
            String str2 = f9Var2.f227335f.f141175d;
            String str3 = f9Var2.f227336g.f141175d;
            if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
                Object[] objArr = new Object[2];
                if (str2 == null) {
                    str2 = "null";
                }
                objArr[0] = str2;
                if (str3 == null) {
                    str3 = "null";
                }
                objArr[1] = str3;
                Log.m105929w("MicroMsg.BackupPackMsgLogic", "recoverMsg fromUserName or toUserName is null, fromUserName[%s], toUserName[%s]", objArr);
                return null;
            }
            Log.m105925i("MicroMsg.BackupPackMsgLogic", "recoverMsg, type[%d], from[%s], to[%s]", Integer.valueOf(f9Var2.f227333d), str2, str3);
            C100554g h3 = C100546d.m131563g().mo139995h();
            if (h3.f294625o != 0) {
                C8235p pVar = h3.f294617g;
                C100554g h4 = C100546d.m131563g().mo139995h();
                if (h4.f294625o != 0) {
                    C44668u3 u3Var = h4.f294612b;
                    int i3 = (((C44667s4) pVar).mo69822qq(str2) || str.equals(str2)) ? 1 : 0;
                    String str4 = i3 != 0 ? str3 : str2;
                    long j = f9Var2.f227350x;
                    if (j == 0) {
                        j = ((long) f9Var2.f227339j) * 1000;
                    }
                    if (hashMap4 != null && (pair = hashMap4.get(str4)) != null && (j < ((Long) pair.first).longValue() || j > ((Long) pair.second).longValue())) {
                        return null;
                    }
                    if (hashSet2 != null) {
                        hashSet2.add(str4);
                    }
                    List<String> list = C99055a.f290361a;
                    if (list == null) {
                        C99055a.f290361a = new LinkedList();
                        String[] strArr = C45628s0.f123409o;
                        int length = strArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            ((LinkedList) C99055a.f290361a).add(strArr[i4]);
                            i4++;
                            strArr = strArr;
                        }
                        ((LinkedList) C99055a.f290361a).add("weixin");
                        ((LinkedList) C99055a.f290361a).add("weibo");
                        ((LinkedList) C99055a.f290361a).add("qqmail");
                        ((LinkedList) C99055a.f290361a).add("fmessage");
                        ((LinkedList) C99055a.f290361a).add("tmessage");
                        ((LinkedList) C99055a.f290361a).add("qmessage");
                        ((LinkedList) C99055a.f290361a).add("qqsync");
                        ((LinkedList) C99055a.f290361a).add("floatbottle");
                        ((LinkedList) C99055a.f290361a).add("lbsapp");
                        ((LinkedList) C99055a.f290361a).add("shakeapp");
                        ((LinkedList) C99055a.f290361a).add("medianote");
                        ((LinkedList) C99055a.f290361a).add("qqfriend");
                        ((LinkedList) C99055a.f290361a).add("readerapp");
                        ((LinkedList) C99055a.f290361a).add("newsapp");
                        ((LinkedList) C99055a.f290361a).add("blogapp");
                        ((LinkedList) C99055a.f290361a).add("facebookapp");
                        ((LinkedList) C99055a.f290361a).add("masssendapp");
                        ((LinkedList) C99055a.f290361a).add("meishiapp");
                        ((LinkedList) C99055a.f290361a).add("feedsapp");
                        ((LinkedList) C99055a.f290361a).add("voipapp");
                        ((LinkedList) C99055a.f290361a).add("officialaccounts");
                        ((LinkedList) C99055a.f290361a).add("helper_entry");
                        ((LinkedList) C99055a.f290361a).add("pc_share");
                        ((LinkedList) C99055a.f290361a).add("cardpackage");
                        ((LinkedList) C99055a.f290361a).add("voicevoipapp");
                        ((LinkedList) C99055a.f290361a).add("voiceinputapp");
                        ((LinkedList) C99055a.f290361a).add("linkedinplugin");
                        ((LinkedList) C99055a.f290361a).add("appbrandcustomerservicemsg");
                        list = C99055a.f290361a;
                    }
                    if (list.contains(str2) || list.contains(str3)) {
                        Log.m105928w("MicroMsg.BackupPackMsgLogic", "recoverMsg hit the blockList: " + str2 + " " + str3);
                        return null;
                    }
                    if (f9Var2.f227348v == 0 && (i2 = f9Var2.f227341o) != 0) {
                        f9Var2.f227348v = (long) i2;
                    }
                    if (f9Var2.f227348v != 0) {
                        if (str.equals(str2)) {
                            str2 = str3;
                        }
                        C72963f4 h302 = ((C72972g4) h2).h30(str2, f9Var2.f227348v);
                        if (h302.getMsgId() != 0) {
                            Log.m105924i("MicroMsg.BackupPackMsgLogic", "recoverMsg msg exist");
                            return null;
                        }
                        long j2 = f9Var2.f227348v;
                        if (j2 != 0) {
                            h302.mo108745Y2(j2);
                        }
                        h302.mo108744X2((long) f9Var2.f227349w);
                        h302.mo108733M2(j);
                        h302.mo108735O2(f9Var2.f227351y);
                        h302.setType(f9Var2.f227333d);
                        C72996z1 z1Var = u3Var.get(str4);
                        if (z1Var == null || Util.isNullOrNil(z1Var.getUsername()) || !z1Var.mo62916m3()) {
                            h302.mo108740T2(i3);
                            h302.mo108749c3(str4);
                            h302.mo100991d(i3 != 0 ? f9Var2.f227338i : 4);
                            if (hashMap3.get(str4) == null) {
                                i = 0;
                                hashMap3.put(str4, 0);
                            } else {
                                i = 0;
                            }
                            if (i3 == 0 && f9Var2.f227338i == 3) {
                                hashMap3.put(str4, Integer.valueOf(Util.nullAs(hashMap3.get(str4), i) + 1));
                            }
                            if (C99654f.f292065c == null) {
                                C99654f fVar = new C99654f();
                                C99654f.f292065c = fVar;
                                C102908a.m136012a(fVar);
                            }
                            C99663m c = C99654f.f292065c.mo139035c(f9Var2.f227333d);
                            if (c == null) {
                                Log.m105924i("MicroMsg.BackupPackMsgLogic", "recoverMsg unknown type");
                                return null;
                            }
                            c.mo139033a(str, f9Var2, h302);
                            return h302;
                        }
                        Log.m105928w("MicroMsg.BackupPackMsgLogic", "recoverMsg hit the blockList: " + str4);
                        return null;
                    }
                    Log.m105928w("MicroMsg.BackupPackMsgLogic", "recoverMsg drop the item server id < 0");
                    return null;
                }
                throw new C86484b();
            }
            throw new C86484b();
        }
        throw new C86484b();
    }
}
