package p222qm;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C72681a;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pluginsdk.model.app.C96763j1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C86493v0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75710x0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p1081gi.C98121d;
import p206nj.C76861g;
import p215oo.C77032h;
import p682rz.C101488s;
import p823sg.C101614i;
import pc0.C100765f;
import rn3.C90056j;
import s90.C48300n;

/* renamed from: qm.j1 */
public class C77365j1 extends IStaticListener<SendAppMsgEvent> {
    public boolean callback(IEvent iEvent) {
        Class cls;
        Iterator<String> it;
        SendAppMsgEvent sendAppMsgEvent;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        C68070l.C68072b bVar;
        C72683d dVar;
        String str5;
        String str6;
        WXMediaMessage wXMediaMessage;
        C98408n0 n0Var;
        String str7;
        C68070l.C68072b bVar2;
        boolean z;
        SendAppMsgEvent sendAppMsgEvent2 = (SendAppMsgEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        Class cls2 = C77032h.class;
        ArrayList<String> stringsToList = Util.stringsToList(sendAppMsgEvent2.f9477d.f9481d.split(","));
        String str8 = sendAppMsgEvent2.f9477d.f9494q;
        int size = stringsToList.size();
        SparseIntArray sparseIntArray = C90056j.f258712a;
        if (!TextUtils.isEmpty(str8)) {
            int hashCode = str8.hashCode();
            SparseIntArray sparseIntArray2 = C90056j.f258712a;
            synchronized (sparseIntArray2) {
                sparseIntArray2.put(hashCode, Math.max(size, 1));
            }
        }
        Iterator<String> it4 = stringsToList.iterator();
        while (it4.hasNext()) {
            String next = it4.next();
            if (!Util.isNullOrNil(sendAppMsgEvent2.f9477d.f9485h)) {
                SendAppMsgEvent.C1131a aVar = sendAppMsgEvent2.f9477d;
                WXMediaMessage wXMediaMessage2 = aVar.f9478a;
                String str9 = aVar.f9479b;
                String str10 = aVar.f9480c;
                int i2 = aVar.f9482e;
                String str11 = aVar.f9485h;
                String str12 = aVar.f9490m;
                C72695v.m85051D(wXMediaMessage2, str9, str10, next, i2, str11, (String) null, 0, (C72681a) null, (Map<String, Long>) null, str12, aVar.f9491n, aVar.f9492o, aVar.f9493p);
                ((C77032h) C86312j.m106911c(cls2)).setScene(5);
                sendAppMsgEvent = sendAppMsgEvent2;
                cls = cls2;
                it = it4;
            } else {
                SendAppMsgEvent.C1131a aVar2 = sendAppMsgEvent2.f9477d;
                WXMediaMessage wXMediaMessage3 = aVar2.f9478a;
                String str13 = aVar2.f9479b;
                String str14 = aVar2.f9480c;
                int i3 = aVar2.f9482e;
                String str15 = aVar2.f9483f;
                String str16 = aVar2.f9484g;
                String str17 = aVar2.f9486i;
                String str18 = aVar2.f9487j;
                String str19 = aVar2.f9488k;
                String str20 = aVar2.f9489l;
                String str21 = aVar2.f9494q;
                sendAppMsgEvent = sendAppMsgEvent2;
                String str22 = aVar2.f9495r;
                it = it4;
                String str23 = aVar2.f9490m;
                cls = cls2;
                String str24 = aVar2.f9491n;
                String str25 = next;
                String str26 = aVar2.f9492o;
                String str27 = aVar2.f9493p;
                C68070l.C68072b bVar3 = new C68070l.C68072b();
                String str28 = str26;
                String str29 = str24;
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(str21, true);
                String str30 = str21;
                String str31 = str22;
                String str32 = str23;
                String str33 = str20;
                String str34 = str19;
                if (c.mo120954a("_DATA_CENTER_ITEM_SHOW_TYPE") || c.mo120954a("_DATA_CENTER_NEED_SHOW_SOURCE_INFO")) {
                    str3 = str18;
                    int e = c.mo120958e("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
                    str2 = str17;
                    i = i3;
                    if (e != -1 || c.mo120957d("_DATA_CENTER_IS_MP_SHARE_VIDEO", false) || c.mo120957d("_DATA_CENTER_NEED_SHOW_SOURCE_INFO", false)) {
                        C68065f fVar = new C68065f();
                        fVar.f195417b = e;
                        str = str14;
                        str7 = str13;
                        fVar.f195423h = c.mo120958e("_DATA_CENTER_IS_PAY_SUBSCRIBE", 0);
                        fVar.f195428m = c.mo120957d("_DATA_CENTER_NEED_SHOW_SOURCE_INFO", false) ? 1 : 0;
                        if (C68065f.m80397f(e)) {
                            fVar.f195425j = c.mo120959f("_DATA_CENTER_VID", "");
                            bVar2 = bVar3;
                            z = false;
                            fVar.f195418c = c.mo120958e("_DATA_CENTER_PUB_TIME", 0);
                            fVar.f195419d = c.mo120958e("_DATA_CENTER__DULATION", 0);
                            fVar.f195420e = c.mo120958e("_DATA_CENTER_VIDEO_WIDTH", 0);
                            fVar.f195421f = c.mo120958e("_DATA_CENTER_VIDEO_HEIGHT", 0);
                            fVar.f195424i = c.mo120958e("_DATA_CENTER_FUNC_FLAG", 0);
                        } else {
                            bVar2 = bVar3;
                            z = false;
                        }
                        if (c.mo120957d("_DATA_CENTER_IS_MP_SHARE_VIDEO", z)) {
                            fVar.f195426k = true;
                            C48300n nVar = new C48300n();
                            fVar.f195427l = nVar;
                            nVar.f133375p = str15;
                            nVar.f133376q = str16;
                            nVar.f133368f = c.mo120959f("_DATA_CENTER_VID", "");
                            fVar.f195427l.f133367e = c.mo120959f("_DATA_CENTER_VIDEO_PLAY_URL", "");
                            fVar.f195427l.f133370h = c.mo120959f("_DATA_CENTER_COVER_URL", "");
                            fVar.f195427l.f133366d = c.mo120959f("_DATA_CENTER_VIDEO_MP_URL", "");
                            C48300n nVar2 = fVar.f195427l;
                            nVar2.f133369g = wXMediaMessage3.title;
                            nVar2.f133371i = c.mo120958e("_DATA_CENTER__DULATION", 0);
                            fVar.f195427l.f133372j = c.mo120958e("_DATA_CENTER_VIDEO_WIDTH", 0);
                            fVar.f195427l.f133373n = c.mo120958e("_DATA_CENTER_VIDEO_HEIGHT", 0);
                        }
                        bVar = bVar2;
                        bVar.mo93545f(fVar);
                    } else {
                        bVar = bVar3;
                        str7 = str13;
                        str = str14;
                    }
                    bVar.f195646y = c.mo120959f("_DATA_CENTER_COVER_URL", "");
                    str4 = str7;
                } else {
                    bVar = bVar3;
                    str4 = str13;
                    str = str14;
                    i = i3;
                    str2 = str17;
                    str3 = str18;
                }
                bVar.f195562d = str4;
                String str35 = str;
                bVar.f195484F = str35;
                bVar.f195618r = i;
                bVar.f195634v = str15;
                bVar.f195638w = str16;
                bVar.f195482E1 = str2;
                bVar.f195486F1 = str3;
                bVar.f195490G1 = str34;
                bVar.f195494H1 = str33;
                String str36 = str32;
                bVar.f195498I1 = str36;
                bVar.f195535U1 = str31;
                String r = C72695v.m85076r(bVar, wXMediaMessage3, (String) null, (C72681a) null);
                StringBuilder sb = new StringBuilder();
                sb.append(C76861g.m92660c());
                sb.append(" content url:");
                sb.append(bVar.f195586j);
                sb.append(" lowUrl:");
                sb.append(bVar.f195590k);
                sb.append(" attachlen:");
                sb.append(bVar.f195594l);
                sb.append(" attachid:");
                sb.append(bVar.f195606o);
                sb.append(" attach file:");
                sb.append(r);
                sb.append(" webViewReqId: ");
                sb.append(str36);
                sb.append(" msgSvrId: ");
                String str37 = str29;
                sb.append(str37);
                sb.append(" talkerUsername: ");
                String str38 = str28;
                sb.append(str38);
                sb.append(" snsLocalId: ");
                String str39 = str27;
                sb.append(str39);
                Log.m105924i("MicroMsg.AppMsgLogic", sb.toString());
                StringBuilder sb4 = new StringBuilder();
                String str40 = r;
                sb4.append(System.currentTimeMillis());
                sb4.append("");
                String sb5 = sb4.toString();
                if (!Util.isNullOrNil(str40)) {
                    dVar = C72695v.m85059a(sb5, bVar, str40);
                    if (dVar == null) {
                        C76861g.m92658a();
                        ((C77032h) C86312j.m106911c(cls)).setScene(5);
                    }
                } else {
                    dVar = null;
                }
                C72963f4 f4Var = new C72963f4();
                byte[] bArr = wXMediaMessage3.thumbData;
                if (bArr == null || bArr.length <= 0) {
                    str5 = str35;
                    str6 = "_DATA_CENTER_VIDEO_MP_URL";
                } else {
                    str5 = str35;
                    str6 = "_DATA_CENTER_VIDEO_MP_URL";
                    String x = C72695v.m85082x(bArr, bVar.f195582i == 2, Bitmap.CompressFormat.PNG, false);
                    Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " thumbData MsgInfo path:" + x);
                    if (!Util.isNullOrNil(x)) {
                        f4Var.mo108739S2(x);
                        Log.m105918d("MicroMsg.AppMsgLogic", "new thumbnail saved, path" + x);
                    }
                }
                if (dVar != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("");
                    wXMediaMessage = wXMediaMessage3;
                    sb6.append(dVar.systemRowid);
                    bVar.f195606o = sb6.toString();
                    if (bVar.f195582i == 6 && Util.isNullOrNil(bVar.f195622s)) {
                        bVar.f195622s = C92779i0.Dx0().mo127020d(dVar.field_fileFullPath);
                    }
                } else {
                    wXMediaMessage = wXMediaMessage3;
                }
                f4Var.mo108732L2(C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
                f4Var.mo100991d(1);
                String str41 = str25;
                f4Var.mo108749c3(str41);
                String str42 = str37;
                f4Var.mo108733M2(C75604z3.m90843o(str41));
                f4Var.mo108740T2(1);
                f4Var.setType(C72695v.m85070l(bVar));
                String B00 = ((C75710x0) C86312j.m106911c(C75710x0.class)).B00(f4Var);
                if (!Util.isNullOrNil(str39)) {
                    C100765f fVar2 = new C100765f();
                    fVar2.f295215c = str39;
                    B00 = ((C77032h) C86312j.m106911c(cls)).Yq0(B00, fVar2);
                    ((C77032h) C86312j.m106911c(cls)).mo107357DR();
                } else if (!Util.isNullOrNil(str42) && !Util.isNullOrNil(str38)) {
                    B00 = ((C77032h) C86312j.m106911c(cls)).mo107358EP(B00, str42, str38);
                    ((C77032h) C86312j.m106911c(cls)).mo107357DR();
                }
                if (!Util.isNullOrNil(B00)) {
                    f4Var.mo101012p4(B00);
                    Log.m105919d("MicroMsg.AppMsgLogic", "NetSceneSendMsg:MsgSource:%s", f4Var.f230724G);
                }
                if (f4Var.mo100983V3()) {
                    n0Var = new C98408n0();
                    n0Var.f288570q = str41;
                    n0Var.f288571r = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
                    n0Var.f288563j = f4Var.getCreateTime();
                    n0Var.f288556c = f4Var.mo108774y2();
                    n0Var.f288575v = f4Var.getContent();
                    n0Var.mo137714r(c.mo120959f("_DATA_CENTER_VIDEO_PLAY_URL", ""), c.mo120958e("_DATA_CENTER__DULATION", 0), wXMediaMessage.title, c.mo120959f(str6, ""), "", "", "");
                    n0Var.f288535C.f299542i = f4Var.mo108765s2();
                    String k = n0Var.mo137707k();
                    C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
                    f4Var.mo108739S2(C98426q0.m127793a(k));
                } else {
                    n0Var = null;
                }
                long my02 = ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var);
                Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " msginfo insert id: " + my02);
                if (my02 < 0) {
                    Log.m105920e("MicroMsg.AppMsgLogic", C76861g.m92660c() + "insert msg failed :" + my02);
                    C76861g.m92658a();
                } else {
                    Log.m105924i("MicroMsg.AppMsgLogic", C76861g.m92658a() + " new msg inserted to db , local id = " + my02);
                    f4Var.setMsgId(my02);
                    MsgRetransmitUI.m125191W7(Long.valueOf(my02), str41, -1L);
                    if (n0Var != null) {
                        n0Var.f288567n = (long) ((int) f4Var.getMsgId());
                        n0Var.f288554a = f4Var.mo108765s2();
                        n0Var.f288562i = 111;
                        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137730s(n0Var);
                    }
                    C68070l lVar = new C68070l();
                    lVar.field_xml = f4Var.getContent();
                    lVar.field_title = wXMediaMessage.title;
                    lVar.field_type = wXMediaMessage.mediaObject.type();
                    lVar.field_description = wXMediaMessage.description;
                    lVar.field_msgId = my02;
                    lVar.field_source = str5;
                    C72709y1.Ax0().insert(lVar);
                    if (dVar != null) {
                        dVar.field_msgInfoId = my02;
                        dVar.field_status = 101;
                        C72709y1.vx0().update(dVar, new String[0]);
                        C72695v.m85058K(f4Var, dVar);
                    } else {
                        C72709y1.zx0().getClass();
                        C97625j3.m125815e().mo123460f(new C96763j1(my02, str30, (String) null));
                    }
                }
                ((C77032h) C86312j.m106911c(cls)).setScene(5);
            }
            sendAppMsgEvent2 = sendAppMsgEvent;
            it4 = it;
            cls2 = cls;
        }
        return false;
    }
}
