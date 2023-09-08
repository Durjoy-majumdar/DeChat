package p236sn;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import p248ug.C52558c;
import rb0.C47976j;
import rb0.C48009v0;

/* renamed from: sn.m */
public class C48431m implements C47976j.C47981c {
    /* renamed from: m5 */
    public void mo72773m5(C47976j.C47978b.C47980b bVar) {
        C72996z1 z1Var;
        boolean z;
        Object obj = C48009v0.f128770y;
        Class cls = C75700k0.class;
        C47976j.C47978b.C47979a aVar = bVar.f128690a;
        if ((aVar == C47976j.C47978b.C47979a.INSTERT || aVar == C47976j.C47978b.C47979a.UPDATE) && bVar.f128692c != null && (z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(bVar.f128691b)) != null) {
            if (!z1Var.mo62916m3()) {
                C52558c cVar = bVar.f128692c;
                if (cVar.mo73502t2() && !cVar.mo73501s2() && cVar.mo73500r2(false) != null && cVar.mo73500r2(false).mo73511d() != null && !Util.isNullOrNil(cVar.mo73498p2())) {
                    if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(cVar.mo73498p2()) == null) {
                        Log.m105918d("MicroMsg.SubCoreBiz", "father conv is null");
                    }
                    if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(cVar.field_username) == null) {
                        Log.m105927v("MicroMsg.SubCoreBiz", "add empty conv for enterprise child %s", cVar.field_username);
                        C72976h2 h2Var = new C72976h2(cVar.field_username);
                        Log.m105925i("MicroMsg.SubCoreBiz", "Enterprise belong %s, userName: %s", cVar.mo73498p2(), cVar.field_username);
                        h2Var.mo108807c3(Util.nullAsNil(cVar.mo73498p2()));
                        h2Var.mo101162m3();
                        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var);
                    }
                }
            } else if (!C72996z1.m85793A5(z1Var.getUsername())) {
                C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(bVar.f128691b);
                Log.m105927v("MicroMsg.SubCoreBiz", "hakon onEvent bizName = %s", bVar.f128691b);
                if (bVar.f128692c.mo73502t2() && bVar.f128692c.mo73500r2(false) != null && bVar.f128692c.mo73500r2(false).mo73511d() != null && !Util.isNullOrNil(bVar.f128692c.mo73498p2()) && Util.isNullOrNil(bVar.f128692c.field_enterpriseFather)) {
                    C52558c cVar2 = bVar.f128692c;
                    cVar2.field_enterpriseFather = cVar2.mo73498p2();
                    C48009v0.Fx0().replace(bVar.f128692c);
                    Log.m105925i("MicroMsg.SubCoreBiz", "hakon bizStgExt, %s set enterpriseFather %s", bVar.f128691b, bVar.f128692c.field_enterpriseFather);
                }
                if (j != null) {
                    String str = null;
                    if (!bVar.f128692c.mo73502t2()) {
                        if (bVar.f128692c.mo72811g1()) {
                            Log.m105927v("MicroMsg.SubCoreBiz", "hakon isEnterpriseFatherType, %s", bVar.f128691b);
                        } else if (!bVar.f128692c.mo73506x2() && !C72996z1.m85842m5(z1Var.getUsername()) && !"officialaccounts".equals(j.mo108782C2())) {
                            j.mo108807c3("officialaccounts");
                        } else if ("hidden_conv_parent".equals(j.mo108782C2())) {
                            j.mo108807c3("hidden_conv_parent");
                        } else if (!bVar.f128692c.mo73506x2() || j.mo108782C2() == null) {
                            z = false;
                        } else {
                            j.mo108807c3((String) null);
                        }
                        z = true;
                    } else if (bVar.f128692c.mo73500r2(false) == null) {
                        Log.m105920e("MicroMsg.SubCoreBiz", "getExtInfo() == null");
                        return;
                    } else if (bVar.f128692c.mo73500r2(false).mo73511d() == null) {
                        Log.m105920e("MicroMsg.SubCoreBiz", "enterpriseBizInfo == null");
                        return;
                    } else {
                        String C2 = j.mo108782C2();
                        Log.m105925i("MicroMsg.SubCoreBiz", "Enterprise belong %s, userName: %s", bVar.f128692c.mo73498p2(), bVar.f128691b);
                        j.mo108807c3(Util.nullAsNil(bVar.f128692c.mo73498p2()));
                        z = !(C2 == null || j.mo108782C2() == null || C2.equals(j.mo108782C2())) || (C2 == null && j.mo108782C2() != null) || (C2 != null && j.mo108782C2() == null);
                        Log.m105927v("MicroMsg.SubCoreBiz", "hakon isEnterpriseChildType, %s, %s", bVar.f128691b, j.mo108782C2());
                    }
                    if (z) {
                        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, j.getUsername());
                        if (!Util.isNullOrNil(j.mo108782C2())) {
                            if ("officialaccounts".equals(j.mo108782C2())) {
                                C72976h2 j2 = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("officialaccounts");
                                if (j2 == null) {
                                    j2 = new C72976h2("officialaccounts");
                                    j2.mo101162m3();
                                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(j2);
                                }
                                if (Util.isNullOrNil(j2.getContent())) {
                                    Log.m105924i("MicroMsg.SubCoreBiz", "conv content is null");
                                    C44660i2 i2Var = (C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                                    i2Var.getClass();
                                    Log.m105925i("MicroMsg.ConversationStorage", "get last conversation user, sql is %s", "SELECT rconversation.username FROM rconversation WHERE parentRef = 'officialaccounts' ORDER BY flag DESC, conversationTime DESC  LIMIT 1 ");
                                    Cursor rawQuery = i2Var.f121077c.rawQuery("SELECT rconversation.username FROM rconversation WHERE parentRef = 'officialaccounts' ORDER BY flag DESC, conversationTime DESC  LIMIT 1 ", (String[]) null, 2);
                                    if (rawQuery != null) {
                                        if (rawQuery.moveToFirst()) {
                                            str = rawQuery.getString(0);
                                            rawQuery.close();
                                        } else {
                                            rawQuery.close();
                                        }
                                    }
                                    if (Util.isNullOrNil(str)) {
                                        Log.m105928w("MicroMsg.SubCoreBiz", "last convBiz is null");
                                        return;
                                    }
                                    C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(str);
                                    if (Ex0 == null || Ex0.getMsgId() == 0) {
                                        Log.m105928w("MicroMsg.SubCoreBiz", "last biz msg is error");
                                    } else {
                                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(Ex0.getMsgId(), Ex0);
                                    }
                                }
                            } else {
                                Log.m105925i("MicroMsg.SubCoreBiz", "hakon username = %s, parentRef = %s", bVar.f128691b, j.mo108782C2());
                                C72976h2 j3 = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(j.mo108782C2());
                                if (j3 != null && Util.isNullOrNil(j3.getContent())) {
                                    Log.m105924i("MicroMsg.SubCoreBiz", "conv content is null");
                                    String N = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69743N(j.mo108782C2());
                                    if (Util.isNullOrNil(N)) {
                                        Log.m105928w("MicroMsg.SubCoreBiz", "last enterprise convBiz is null");
                                        return;
                                    }
                                    C72963f4 Ex02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(N);
                                    if (Ex02 == null || Ex02.getMsgId() == 0) {
                                        Log.m105928w("MicroMsg.SubCoreBiz", "last enterprise biz msg is error");
                                    } else {
                                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(Ex02.getMsgId(), Ex02);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
