package eb0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86312j;
import f40.C86709a0;
import f62.C75698i0;
import f62.C75700k0;
import f62.C75708t0;
import f62.C75711y0;
import ob0.C35136m;
import p261wl.C38166b;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: eb0.f */
public abstract class C75573f implements C35136m {

    /* renamed from: d */
    public static final f$$c f222005d = new f$$c();

    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        String str;
        C72963f4 f4Var;
        C35136m.C35139b bVar;
        String str2;
        char c;
        String str3;
        C72976h2 j;
        C35136m.C35137a aVar2 = aVar;
        Class cls = C75708t0.class;
        Class cls2 = C75698i0.class;
        Class<C75711y0> cls3 = C75711y0.class;
        Class cls4 = C75700k0.class;
        C77949j3 j3Var = aVar2.f94242a;
        String str4 = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
        if (str4.length() <= 0) {
            return null;
        }
        String g = C48374j0.m53718g(j3Var.f227628e);
        String g2 = C48374j0.m53718g(j3Var.f227629f);
        if (Util.nullAsNil(g).length() <= 0 || Util.nullAsNil(g2).length() <= 0) {
            Log.m105920e("MicroMsg.BaseMsgExtension", "neither from-user nor to-user can be empty");
            return null;
        }
        C72963f4 d = mo71474d(aVar2, g, g2, str4);
        if (d == null) {
            return null;
        }
        if (((C44667s4) ((C75700k0) C86709a0.m107533q(cls4)).V50()).mo69822qq(g) || str4.equals(g)) {
            d.mo108740T2(1);
            d.mo108749c3(g2);
            d.mo100991d(j3Var.f227632i);
        } else {
            d.mo108740T2(0);
            d.mo108749c3(g);
            int i = j3Var.f227632i;
            if (i <= 3) {
                i = 3;
            }
            d.mo100991d(i);
        }
        if (j3Var.f227630g == 10000) {
            d.mo100991d(4);
        }
        boolean z = d.mo108769t2() == 1;
        String str5 = j3Var.f227636p;
        if (d.mo100993e4() || d.mo100979R3()) {
            str = "";
            if (d.getCreateTime() != ((long) j3Var.f227635o) * 1000 && !Util.isNullOrNil(str5)) {
                str5 = str5.replace("</msgsource>", "<realcreatetime>" + j3Var.f227635o + "</realcreatetime></msgsource>");
            }
        } else {
            str = "";
        }
        d.mo101012p4(str5);
        if (d.mo100966E3(C75592q0.m90789s()) && (j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls4)).mo96094Ku()).mo69771j(d.mo108768t())) != null) {
            j.mo108373l3(TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls4)).mo96094Ku()).mo69773k0(j, d.mo108768t());
        }
        f$$c f__c = f222005d;
        C35136m.C35137a aVar3 = aVar;
        C72963f4 f4Var2 = d;
        C72963f4 f4Var3 = d;
        String str6 = g;
        String str7 = g2;
        String str8 = "MicroMsg.BaseMsgExtension";
        f__c.mo105913u4(aVar3, f4Var2, str6, str7, z);
        f$$a f__a = r0;
        f$$a f__a2 = new f$$a(aVar3, f4Var3, str6, str7, z);
        C38166b.m41755b(cls3, f__a);
        if (f4Var3.getMsgId() == 0) {
            f4Var = f4Var3;
            f4Var.mo108735O2(2);
            C75604z3.m90842n(f4Var, aVar2);
            f4Var.setMsgId(C75604z3.m90852x(f4Var));
            bVar = new C35136m.C35139b(f4Var, true);
        } else {
            f4Var = f4Var3;
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls4)).mo96095LE()).yy0(j3Var.f227638r, f4Var);
            bVar = new C35136m.C35139b(f4Var, false);
        }
        C35136m.C35139b bVar2 = bVar;
        if (!Util.isNullOrNil(f4Var.getContent())) {
            String str9 = z ? g2 : g;
            if (!aVar2.f94243b && ((C75698i0) C86312j.m106911c(cls2)).bc0(str9)) {
                if (z) {
                    str3 = f4Var.getContent();
                    str2 = g;
                    c = 1;
                } else {
                    str3 = f4Var.getContent();
                    int t = C75604z3.m90848t(f4Var.getContent());
                    if (t != -1) {
                        String trim = str3.substring(0, t).trim();
                        if (trim == null || trim.length() <= 0) {
                            trim = str;
                        }
                        c = 1;
                        str3 = str3.substring(t + 1).trim();
                        str2 = trim;
                    } else {
                        c = 1;
                        str2 = str;
                    }
                }
                if (BuildInfo.DEBUG) {
                    Object[] objArr = new Object[4];
                    objArr[0] = Boolean.valueOf(z);
                    objArr[c] = g;
                    objArr[2] = str2;
                    objArr[3] = Util.nullAs(str3, "null");
                    Log.m105919d(str8, "onPreAddMessage() isSender:%s fromUser:%s creator:%s content:%s", objArr);
                }
                ((C75698i0) C86312j.m106911c(cls2)).mo106022ax(str9, str2, str3, f4Var.getMsgId(), f4Var.getCreateTime() / 1000);
            }
            if (f4Var.mo100971J3() && C72996z1.m85807K5(f4Var.mo108768t()) && ((C75708t0) C86312j.m106911c(cls)).mo106028s7()) {
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls4)).mo96097Ni().get(f4Var.mo108768t());
                long j2 = z1Var.f149538g1;
                z1Var.mo62859J3(f4Var.getMsgId());
                C86709a0.m107528h();
                ((C75700k0) C86709a0.m107533q(cls4)).mo96097Ni().mo69668Q3(z1Var);
                if (j2 != 0) {
                    ((C75708t0) C86312j.m106911c(cls)).Td0(f4Var.mo108768t(), j2);
                }
            }
        }
        C35136m.C35137a aVar4 = aVar;
        C72963f4 f4Var4 = f4Var;
        String str10 = g;
        String str11 = g2;
        boolean z2 = z;
        f__c.mo105912C4(aVar4, f4Var4, str10, str11, z2);
        C38166b.m41755b(cls3, new f$$b(aVar4, f4Var4, str10, str11, z2));
        return bVar2;
    }

    /* renamed from: d */
    public C72963f4 mo71474d(C35136m.C35137a aVar, String str, String str2, String str3) {
        C77949j3 j3Var = aVar.f94242a;
        String str4 = str3.equals(str) ? str2 : str;
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(str4, j3Var.f227638r);
        Log.m105925i("MicroMsg.BaseMsgExtension", "summerbadcr dkmsgid prepareMsgInfo svrid:%d localid:%d  from:%s to:%s talker:%s", Long.valueOf(j3Var.f227638r), Long.valueOf(h302.getMsgId()), str, str2, str4);
        if (h302.getMsgId() != 0 && h302.getCreateTime() + FrequentLimiter.WEEK_MILLS < C75604z3.m90841m(str4, (long) j3Var.f227635o)) {
            Log.m105929w("MicroMsg.BaseMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", Long.valueOf(j3Var.f227638r), Long.valueOf(h302.getMsgId()));
            C75604z3.m90834f(h302.getMsgId());
            h302.setMsgId(0);
        }
        if (h302.getMsgId() != 0) {
            return h302;
        }
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108749c3(str4);
        f4Var.mo108745Y2(j3Var.f227638r);
        f4Var.mo108733M2(C75604z3.m90841m(str4, (long) j3Var.f227635o));
        f4Var.setType(j3Var.f227630g);
        f4Var.mo108732L2(Util.escapeStringForUCC(Util.nullAsNil(C48374j0.m53718g(j3Var.f227631h))));
        return f4Var;
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }
}
