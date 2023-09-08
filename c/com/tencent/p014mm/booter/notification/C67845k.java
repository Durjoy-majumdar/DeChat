package com.tencent.p014mm.booter.notification;

import com.tencent.p014mm.booter.notification.C67840f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p285zh.C119114c;
import p645pj.C77095h;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.booter.notification.k */
public class C67845k {

    /* renamed from: a */
    public C67844j f194756a = new C67844j();

    /* renamed from: com.tencent.mm.booter.notification.k$b */
    public static class C67847b {

        /* renamed from: a */
        public static final C67845k f194757a = new C67845k((C67846a) null);
    }

    public C67845k(C67846a aVar) {
    }

    /* renamed from: a */
    public boolean mo93233a(String str, C72963f4 f4Var, int i, boolean z) {
        if (Util.isNullOrNil(str)) {
            C119114c.m167922g("preNullTalker");
            return false;
        }
        this.f194756a.f194754a.getClass();
        Class cls = C53193b.class;
        Log.m105919d("MicroMsg.Notification.AppMsg.Handle", "preNotificationCheck, talker: %s, tipsFlag: %s ", str, Integer.valueOf(i));
        if (!C97625j3.m125811a()) {
            Log.m105925i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](MMCore.accHasReady())preNotificationCheck, talker: %s, tipsFlag: %s ", str, Integer.valueOf(i));
            C119114c.m167922g("preAccNotReady");
            return false;
        } else if (f4Var != null && C67840f.m80195f(f4Var.mo108774y2()) && !z) {
            Log.m105925i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](msgInfo != null && NotificationQueueManager.getImpl().isAlreadyNotify(msgInfo.getMsgSvrId()), msgId: %d", Long.valueOf(f4Var.mo108774y2()));
            C119114c.m167922g("preReadyNotified");
            return false;
        } else if ((i & 1) == 0) {
            Log.m105925i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](tipsFlag & ConstantsProtocal.TEXT_NOTIFY_SVR_FLAG) == 0)preNotificationCheck, talker: %s, tipsFlag: %s ", str, Integer.valueOf(i));
            C119114c.m167922g("preSrvFlag");
            return false;
        } else if (C97625j3.m125812b().mo105884J() && !C75592q0.m90765M()) {
            Log.m105925i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](MMCore.getAccStg().isWebWXOnline() && !ConfigStorageLogic.isWebWXNotificationOpen())preNotificationCheck, talker: %s, tipsFlag: %s isWebWXOnline: %B,isWebWXNotificationOpen: %B ", str, Integer.valueOf(i), Boolean.valueOf(C97625j3.m125812b().mo105884J()), Boolean.valueOf(C75592q0.m90765M()));
            C119114c.m167922g("preWebWx");
            return false;
        } else if (C45628s0.m50747L(str) || ((C53193b) C86312j.m106911c(cls)).mo73723Hd(str) || (C72996z1.m85820U5(str) && !C45628s0.m50739D(str) && f4Var != null && !f4Var.mo100966E3(C75592q0.m90789s()) && !f4Var.mo100964D3() && f4Var.getType() != 64 && ((!f4Var.mo100964D3() || !f4Var.mo100971J3()) && !f4Var.mo100976O3()))) {
            Log.m105925i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](ContactStorageLogic.isMuteContact(talker) || (Contact.isWxOrOpenImChatRoom(talker) && !ContactStorageLogic.isChatRoomNotify(talker) && !msgInfo.isAtSomeone(ConfigStorageLogic.getUsernameFromUserInfo() && msgInfo.getType() != ConstantsProtocal.MM_DATA_MULTITALK)) && (msgInfo != null && !msgInfo.isChatRoomNotice(ConfigStorageLogic.getUsernameFromUserInfo())) )preNotificationCheck, talker: %s, tipsFlag: %s ", str, Integer.valueOf(i));
            C119114c.m167922g(C45628s0.m50747L(str) ? "preTalkerMute" : ((C53193b) C86312j.m106911c(cls)).mo73723Hd(str) ? "preConvBox" : "preChatRoom");
            return false;
        } else {
            if (f4Var != null) {
                Map<String, String> parseXml = XmlParser.parseXml(f4Var.mo108775z2(), "msg", (String) null);
                if ((parseXml == null || Util.getLong(parseXml.get(".msg.videomsg.$overwritenewmsgid"), 0) == 0) ? false : true) {
                    C119114c.m167922g("preOriginVideo");
                    Log.m105924i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](msgInfo != null && ContactStorageLogic.isOriginVideoNotify(msgInfo.getContent())preNotificationCheck, origin video receive, no need to notify");
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public void mo93234b(int i, String str) {
        ArrayList<C67840f.C67841a> arrayList;
        C67840f.C67841a aVar;
        C67840f fVar = this.f194756a.f194754a;
        if (fVar != null) {
            Log.m105925i("MicroMsg.Notification.AppMsg.Handle", "refreshTotalUnread, %d, %s", Integer.valueOf(i), str);
            if (i == -1) {
                i = C77095h.m93059b();
            }
            C67840f.m80196h(i);
            if (str == null || str.length() <= 0) {
                arrayList = new ArrayList<>();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) C45629t0.m50818e(C45628s0.f123398d);
                int i2 = -1;
                for (String str2 : hashMap.keySet()) {
                    i2--;
                    arrayList2.add(((C72996z1) hashMap.get(str2)).mo62909j3());
                    if (i2 == 0) {
                        break;
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    C67840f.C67841a aVar2 = new C67840f.C67841a();
                    aVar2.f194740d = str3;
                    aVar2.f194741e = C45629t0.m50817d(str3, (String[]) null);
                    arrayList.add(aVar2);
                }
            } else {
                arrayList = fVar.mo93227d();
                Iterator<C67840f.C67841a> it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = it4.next();
                    if (aVar.f194740d.equals(str)) {
                        arrayList.remove(aVar);
                        break;
                    }
                }
                if (aVar == null) {
                    aVar = new C67840f.C67841a();
                }
                aVar.f194740d = str;
                int d = C45629t0.m50817d(str, (String[]) null);
                aVar.f194741e = d;
                if (d == 0 && arrayList.isEmpty()) {
                    C67840f.m80197i((ArrayList<C67840f.C67841a>) null);
                    return;
                } else if (aVar.f194741e > 0) {
                    arrayList.add(aVar);
                }
            }
            C67840f.m80197i(arrayList);
            return;
        }
        Log.m105928w("MicroMsg.Notification.Handle", "mAppMsgHandle is null");
    }
}
