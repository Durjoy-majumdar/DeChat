package hb0;

import android.database.Cursor;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C31455d0;
import eb0.C45628s0;
import eb0.C97625j3;
import g62.C75875l;
import java.util.LinkedList;
import p875ci.C67379u;
import rb0.C47966e0;

/* renamed from: hb0.v */
public class C46018v implements C30783v3.C30788e {
    /* renamed from: A */
    public void mo57712A(C72976h2 h2Var, C30783v3 v3Var) {
        C72996z1 z1Var;
        boolean z;
        C72976h2 h2Var2 = h2Var;
        C30783v3 v3Var2 = v3Var;
        if (h2Var2 != null) {
            if (C72996z1.m85798E5(h2Var.getUsername()) || C72996z1.m85848s5(h2Var.getUsername()) || C72996z1.m85811N4(h2Var.getUsername()) || C45628s0.m50738C(h2Var.getUsername()) || C72996z1.m85843n5(h2Var.getUsername())) {
                String str = "";
                if (C72996z1.m85811N4(h2Var.getUsername())) {
                    C44660i2 i2Var = (C44660i2) v3Var2;
                    C72976h2 j = i2Var.mo69771j("floatbottle");
                    if (j == null) {
                        j = new C72976h2("floatbottle");
                        z = true;
                    } else {
                        z = false;
                    }
                    j.mo108791L2(1);
                    j.mo108812g3(C31455d0.m39412a());
                    C72972g4 g4Var = (C72972g4) C97625j3.m125812b().mo105911z();
                    C72963f4 f4Var = null;
                    if (g4Var.f212769g == null) {
                        Log.m105920e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
                    } else {
                        C72963f4 f4Var2 = new C72963f4();
                        if (!Util.isNullOrNil(" and not ( type = 10000 and isSend != 2 ) ")) {
                            str = " and not ( type = 10000 and isSend != 2 ) ".replaceFirst("and", "where");
                        }
                        long j2 = 0;
                        for (int i = 0; i < ((LinkedList) g4Var.f212769g).size(); i++) {
                            if ((((C75875l.C75878d) ((LinkedList) g4Var.f212769g).get(i)).f222523c & 8) != 0) {
                                Cursor rawQuery = g4Var.f212775p.rawQuery("select * from " + ((C75875l.C75878d) ((LinkedList) g4Var.f212769g).get(i)).f222524d + str + "  order by " + "createTime" + " DESC limit 1", (String[]) null, 2);
                                if (rawQuery.moveToFirst()) {
                                    long j3 = rawQuery.getLong(rawQuery.getColumnIndex("createTime"));
                                    if (j2 < j3) {
                                        f4Var2.convertFrom(rawQuery);
                                        j2 = j3;
                                    }
                                }
                                rawQuery.close();
                            }
                        }
                        f4Var = f4Var2;
                    }
                    if (f4Var == null || f4Var.getMsgId() <= 0) {
                        j.mo101162m3();
                    } else {
                        j.mo101164o3(f4Var);
                        j.mo108792M2(C72996z1.m85829Z5(f4Var.mo108768t()) + XVFSFile.PATH_SEPARATOR + f4Var.getContent());
                        j.mo108806b3(Integer.toString(f4Var.getType()));
                        if (i2Var.mo69741L() != null) {
                            PString pString = new PString();
                            PString pString2 = new PString();
                            PInt pInt = new PInt();
                            f4Var.mo108749c3("floatbottle");
                            f4Var.mo108732L2(j.getContent());
                            C67379u.m79740d(f4Var, pString, pString2, pInt, false);
                            j.mo108794O2(pString.value);
                            j.mo108795P2(pString2.value);
                            j.mo108801W2(pInt.value);
                        }
                    }
                    if (z) {
                        i2Var.mo69751W(j);
                    } else {
                        i2Var.mo69773k0(j, j.getUsername());
                    }
                } else if (!C72996z1.m85798E5(h2Var.getUsername()) && !C72996z1.m85848s5(h2Var.getUsername())) {
                    ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72740wp().mo69632a(h2Var2, v3Var2);
                    if ("@blacklist".equals(h2Var.mo108782C2()) && (z1Var = C97625j3.m125812b().mo105907v().get(h2Var.getUsername())) != null && !Util.isNullOrNil(z1Var.getUsername()) && !z1Var.mo62920o3()) {
                        C30783v3 w = C97625j3.m125812b().mo105908w();
                        ((C44660i2) w).mo69762e0(new String[]{h2Var.getUsername()}, str);
                    }
                }
            }
        }
    }
}
