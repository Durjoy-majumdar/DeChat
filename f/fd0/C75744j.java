package fd0;

import com.tencent.p014mm.autogen.events.LbsSayHiEvent;
import com.tencent.p014mm.autogen.events.RadarSayHiMsgEvent;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72957c4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72987n3;
import com.tencent.p014mm.storage.C72991u4;
import com.tencent.p014mm.storage.C72992v4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import eb0.C75597w2;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import ob0.C35136m;
import ob0.C35141t;
import p196ln.C76706g;
import p196ln.C76708i;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: fd0.j */
public class C75744j implements C35141t {

    /* renamed from: fd0.j$a */
    public class C75745a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ C72963f4.C72971h f222341a;

        public C75745a(C75744j jVar, C72963f4.C72971h hVar) {
            this.f222341a = hVar;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f222341a.f212760x);
            Log.m105918d("MicroMsg.VerifyMessageExtension", z1Var + "");
            LbsSayHiEvent lbsSayHiEvent = new LbsSayHiEvent();
            LbsSayHiEvent.C67725a aVar = lbsSayHiEvent.f193718d;
            aVar.f193719a = this.f222341a.f212760x;
            aVar.f193720b = 1;
            lbsSayHiEvent.publish();
        }
    }

    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        int i;
        int i2;
        Class cls = C76708i.class;
        Class cls2 = C75700k0.class;
        C77949j3 j3Var = aVar.f94242a;
        String g = C48374j0.m53718g(j3Var.f227628e);
        if (!"fmessage".equals(g) && j3Var.f227630g != 37) {
            return null;
        }
        String g2 = C48374j0.m53718g(j3Var.f227631h);
        C72963f4.C72971h v = C72963f4.C72971h.m85668v(g2);
        String s = C75592q0.m90789s();
        String str = v.f212737a;
        if (str == null || !str.equals(s)) {
            C68097n nVar = new C68097n();
            String str2 = v.f212737a;
            nVar.f195728a = str2;
            nVar.f195729b = 3;
            nVar.f195733f = 1;
            nVar.f195736i = -1;
            nVar.f195732e = v.f212757u;
            nVar.f195731d = v.f212758v;
            Log.m105919d("MicroMsg.VerifyMessageExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", str2, nVar.mo93594c(), nVar.mo93597f());
            ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
            if (!Util.isNullOrNil(v.f212737a)) {
                int i3 = v.f212744h;
                if (i3 == 18) {
                    Log.m105918d("MicroMsg.SubCoreVerify", "saveToLbsVerifyStg, cmdAM, status = " + j3Var.f227632i + ", id = " + j3Var.f227638r);
                    C72956b4 b4Var = new C72956b4();
                    b4Var.field_content = C48374j0.m53718g(j3Var.f227631h);
                    b4Var.field_createtime = Util.nowSecond();
                    b4Var.field_imgpath = "";
                    b4Var.field_sayhicontent = v.f212742f;
                    b4Var.field_sayhiuser = v.f212737a;
                    b4Var.field_scene = v.f212744h;
                    int i4 = j3Var.f227632i;
                    if (i4 <= 3) {
                        i4 = 3;
                    }
                    b4Var.field_status = i4;
                    b4Var.field_svrid = j3Var.f227638r;
                    b4Var.field_talker = C48374j0.m53718g(j3Var.f227628e);
                    b4Var.field_type = j3Var.f227630g;
                    b4Var.field_isSend = 0;
                    b4Var.field_sayhiencryptuser = v.f212760x;
                    b4Var.field_ticket = v.f212756t;
                    b4Var.field_flag = 1;
                    ((C72957c4) ((C75700k0) C86709a0.m107533q(cls2)).mo96099XB()).insert(b4Var);
                    ((C76708i) C86312j.m106911c(cls)).mo106848yE(b4Var.field_sayhiencryptuser, 3);
                    C97625j3.m125812b().mo105906u().mo119676J(73729, 1);
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(v.f212760x);
                    if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                        C31519v2.m39436a().mo55988e(v.f212760x, (String) null, new C75745a(this, v));
                    } else {
                        String username = z1Var.getUsername();
                        if (username != null && !C72996z1.m85796D5(username)) {
                            z1Var.setUsername(v.f212760x);
                            z1Var.mo62874S2((String) null);
                            C97625j3.m125812b().mo105907v().mo69719p3(username, z1Var);
                        }
                        LbsSayHiEvent lbsSayHiEvent = new LbsSayHiEvent();
                        LbsSayHiEvent.C67725a aVar2 = lbsSayHiEvent.f193718d;
                        aVar2.f193719a = v.f212760x;
                        aVar2.f193720b = 1;
                        lbsSayHiEvent.publish();
                    }
                    return null;
                }
                if (C75604z3.m90853y(i3)) {
                    Log.m105918d("MicroMsg.SubCoreVerify", "saveToShakeVerifyStg, cmdAM, status = " + j3Var.f227632i + ", id = " + j3Var.f227638r);
                    C72991u4 u4Var = new C72991u4();
                    u4Var.field_content = C48374j0.m53718g(j3Var.f227631h);
                    u4Var.field_createtime = Util.nowSecond();
                    u4Var.field_imgpath = "";
                    u4Var.field_sayhicontent = v.f212742f;
                    u4Var.field_sayhiuser = v.f212737a;
                    u4Var.field_scene = v.f212744h;
                    int i5 = j3Var.f227632i;
                    if (i5 <= 3) {
                        i5 = 3;
                    }
                    u4Var.field_status = i5;
                    u4Var.field_svrid = j3Var.f227638r;
                    u4Var.field_talker = C48374j0.m53718g(j3Var.f227628e);
                    u4Var.field_type = j3Var.f227630g;
                    u4Var.field_isSend = 0;
                    ((C72992v4) ((C75700k0) C86709a0.m107533q(cls2)).Cc0()).insert(u4Var);
                    ((C76708i) C86312j.m106911c(cls)).mo106848yE(u4Var.field_sayhiuser, 3);
                    C97625j3.m125812b().mo105906u().mo119676J(73730, 1);
                    return null;
                } else if (v.f212744h == 48) {
                    RadarSayHiMsgEvent radarSayHiMsgEvent = new RadarSayHiMsgEvent();
                    RadarSayHiMsgEvent.C67765a aVar3 = radarSayHiMsgEvent.f193859d;
                    aVar3.f193861a = g2;
                    aVar3.f193862b = v.f212737a;
                    radarSayHiMsgEvent.publish();
                }
            }
            C72985m3 m3Var = new C72985m3();
            m3Var.field_createTime = C75742g.m91010b(g, (long) j3Var.f227635o);
            if (j3Var.f227632i == 4) {
                i2 = 0;
                i = 2;
            } else {
                i2 = 0;
                i = 0;
            }
            m3Var.field_isSend = i + i2;
            m3Var.field_msgContent = C48374j0.m53718g(j3Var.f227631h);
            m3Var.field_svrId = j3Var.f227638r;
            m3Var.field_talker = v.f212737a;
            C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(v.f212762z);
            if (!(z1Var2 == null || ((int) z1Var2.f108320R1) == -1)) {
                m3Var.field_chatroomName = v.f212762z;
            }
            int i6 = v.f212759w;
            if (i6 == 2) {
                m3Var.field_type = 1;
            } else if (i6 == 5) {
                m3Var.field_type = 2;
            } else if (i6 != 6) {
                m3Var.field_type = 1;
            } else {
                m3Var.field_type = 3;
            }
            if (!Util.isNullOrNil(v.f212760x)) {
                m3Var.field_encryptTalker = v.f212760x;
                if (C75743h.vx0().mo101169Yt(v.f212760x) != null) {
                    C72987n3 wx02 = C75743h.wx0();
                    String str3 = m3Var.field_encryptTalker;
                    String str4 = m3Var.field_talker;
                    wx02.f212816d.execSQL("fmessage_msginfo", "update fmessage_msginfo set talker = '" + Util.escapeSqlValue(str4) + "'  where " + "talker" + " = '" + Util.escapeSqlValue(str3) + "'");
                    C75743h.vx0().mo101165Lo(0, m3Var.field_encryptTalker);
                }
                C75743h.wx0().insert(m3Var);
            } else {
                Log.m105920e("MicroMsg.VerifyMessageExtension", "it should not go in here");
                C72979k3 qq = C75743h.vx0().mo101174qq(m3Var.field_talker);
                if (qq != null) {
                    String str5 = qq.field_talker;
                    m3Var.field_encryptTalker = str5;
                    m3Var.field_talker = str5;
                }
                C75743h.wx0().insert(m3Var);
            }
            return null;
        }
        Log.m105919d("MicroMsg.VerifyMessageExtension", "onPreAddMessage, verify scene:%d, content:%s", Integer.valueOf(v.f212744h), g2);
        Log.m105920e("MicroMsg.VerifyMessageExtension", "fromUserName is self, simply drop this msg");
        return null;
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
