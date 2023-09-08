package hv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C86484b;
import hd0.C98408n0;
import hv0.C98540b;
import java.util.HashMap;

/* renamed from: hv0.d */
public class C98543d {
    /* renamed from: a */
    public static void m128030a(HashMap<String, Integer> hashMap) {
        boolean z;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(hashMap == null ? -1 : hashMap.size());
        Log.m105925i("MicroMsg.BackupStorageLogic", "buildConversation, unReadSum size[%d]", objArr);
        if (hashMap != null) {
            for (String next : hashMap.keySet()) {
                C72963f4 Fx0 = ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).Fx0(next, " and not ( type = 10000 and isSend != 2 ) ");
                if (Fx0 != null) {
                    int intValue = hashMap.get(next).intValue();
                    String t = Fx0.mo108768t();
                    Log.m105925i("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg, talker:%s, addUnreadCount:%d", t, Integer.valueOf(intValue));
                    C72976h2 j = ((C44660i2) C98544e.m128035f().mo137901e().mo137895c()).mo69771j(t);
                    if (j == null || j.mo108821o2() <= Fx0.getCreateTime() || j.mo108821o2() == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                        if (j == null) {
                            j = new C72976h2(t);
                            z = true;
                        } else {
                            z = false;
                        }
                        j.mo108803Y2(Fx0.mo108769t2());
                        j.mo108812g3(j.mo108786G2() + intValue);
                        j.mo101164o3(Fx0);
                        j.mo108806b3(Integer.toString(Fx0.getType()));
                        j.mo101161T2((Fx0.getCreateTime() & 72057594037927935L) | (j.mo108828u2() & 4611686018427387904L));
                        j.mo108805a3(0);
                        Log.m105925i("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg, isNewConv[%b], talker[%s], flag[%d]", Boolean.valueOf(z), t, Long.valueOf(j.mo108828u2()));
                        if (z) {
                            ((C44660i2) C98544e.m128035f().mo137901e().mo137895c()).mo69751W(j);
                        } else {
                            ((C44660i2) C98544e.m128035f().mo137901e().mo137895c()).mo69773k0(j, t);
                        }
                    } else {
                        Log.m105920e("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
                    }
                }
                C98542c e = C98544e.m128035f().mo137901e();
                if (e.f288980o != 0) {
                    ((C72986n2) e.f288978m).mo101181Ow(next, 0);
                } else {
                    throw new C86484b();
                }
            }
        }
        ((C44660i2) C98544e.m128035f().mo137901e().mo137895c()).mo69758c0();
    }

    /* renamed from: b */
    public static int m128031b(String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || !str.substring(0, indexOf).contains("<")) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: c */
    public static C98408n0 m128032c(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return C98544e.m128035f().mo137901e().mo137898f().mo137720f(str);
    }

    /* renamed from: d */
    public static long m128033d(C72963f4 f4Var) {
        C98542c e = C98544e.m128035f().mo137901e();
        if (e.f288980o != 0) {
            C72996z1 z1Var = e.f288967b.get(f4Var.mo108768t());
            if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                if (!Util.isNullOrNil(f4Var.mo108768t())) {
                    C98540b d = C98544e.m128035f().mo137900d();
                    d.f288962a.add(new C98540b.C98541a(d, 2, f4Var.mo108768t()));
                    C98542c e2 = C98544e.m128035f().mo137901e();
                    if (e2.f288980o != 0) {
                        e2.f288967b.mo69667P3(new C72996z1(f4Var.mo108768t()));
                    } else {
                        throw new C86484b();
                    }
                } else if (f4Var.mo108768t().endsWith("@chatroom")) {
                    C98542c e3 = C98544e.m128035f().mo137901e();
                    if (e3.f288980o != 0) {
                        if (((C44662n1) e3.f288974i).mo69804bD(f4Var.mo108768t()) == null) {
                            C98540b d2 = C98544e.m128035f().mo137900d();
                            d2.f288962a.add(new C98540b.C98541a(d2, 2, f4Var.mo108768t()));
                        }
                    } else {
                        throw new C86484b();
                    }
                }
            }
            long my02 = ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).my0(f4Var);
            if (my02 < 0) {
                Log.m105921e("MicroMsg.BackupStorageLogic", "insertMsgWithContact failed: type:%d, talker:%s", Integer.valueOf(f4Var.getType()), f4Var.mo108768t());
            }
            return my02;
        }
        throw new C86484b();
    }

    /* renamed from: e */
    public static boolean m128034e(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return C72996z1.m85820U5(str);
    }
}
