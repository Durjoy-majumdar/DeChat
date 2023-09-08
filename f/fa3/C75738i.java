package fa3;

import android.content.Context;
import android.content.Intent;
import c02.C92331c;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.StatusNotifyFunctionEvent;
import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.webwx.p129ui.WebWXLogoutUI;
import com.tencent.p014mm.plugin.webwx.p129ui.WebWXPopupUnlockUI;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pluginsdk.model.app.C96773p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import e62.C75554c;
import eb0.C45629t0;
import eb0.C97625j3;
import ev0.C20612a;
import ev0.C20615b;
import f40.C86709a0;
import f62.C75700k0;
import fd0.C75743h;
import g62.C75875l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k20.C9556a;
import ob0.C117747y;
import ob0.C35136m;
import ob0.C35141t;
import org.json.JSONException;
import org.json.JSONObject;
import p158gt.C76051j;
import p214om.C11502f;
import p227rn.C48053v;
import p872ah.C67046a;
import rb0.C48009v0;
import sf0.C48374j0;
import te3.C77949j3;
import te3.hb4;

/* renamed from: fa3.i */
public class C75738i implements C35141t, C76051j.C76052a {
    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        int i;
        String trim;
        Map<String, String> parseXml;
        C72976h2 j;
        C75875l.C45886e eVar;
        int i2;
        String str;
        ArrayList arrayList;
        LinkedList linkedList;
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var != null && (i = j3Var.f227630g) == 51) {
            Log.m105919d("MicroMsg.StatusNotifyMsgExtension", "msgType %d %d", Integer.valueOf(i), 51);
            Class cls = C75700k0.class;
            Class cls2 = C48053v.class;
            Class cls3 = C11502f.class;
            Class cls4 = C92331c.class;
            String g = C48374j0.m53718g(j3Var.f227629f);
            if (!Util.isNullOrNil(g) && (parseXml = XmlParser.parseXml(trim, "msg", (String) null)) != null) {
                int i3 = Util.getInt(parseXml.get(".msg.op.$id"), 0);
                Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "handleStatusNotifyMsg, %d", Integer.valueOf(i3));
                if (i3 == 1 || i3 == 2 || i3 == 5) {
                    String str2 = g;
                    Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr mark conversation readed. userName = " + str2);
                    C72972g4 g4Var = (C72972g4) C97625j3.m125812b().mo105911z();
                    if (g4Var.f212780u) {
                        synchronized (g4Var.f212779t) {
                            eVar = ((HashMap) g4Var.f212779t).containsKey(str2) ? (C75875l.C45886e) ((HashMap) g4Var.f212779t).get(str2) : null;
                        }
                        if (eVar == null) {
                            Log.m105929w("MicroMsg.MsgInfoStorage", "statusNotify, No one Locking info Now , why this talker:%s call it ! [%s]", str2, Util.getStack());
                        } else {
                            String str3 = eVar.f123845b;
                            if (str3 != null && str3.equals("insert") && (i2 = eVar.f123847d) > 0) {
                                Log.m105925i("MicroMsg.MsgInfoStorage", "statusNotify talker[%s] insertCount[%d]", str2, Integer.valueOf(i2));
                                eVar.f123847d = 0;
                            }
                        }
                    }
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls3)).mo11462yM()).mo93168a(str2);
                    if (C72996z1.m85830a5(str2)) {
                        C97625j3.m125812b().mo105906u().mo119676J(143618, 0);
                        C75743h.vx0().mo101172jo();
                    } else if ("@placeholder_foldgroup".equals(str2)) {
                        Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr mark convbox readed.");
                        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0("conversationboxservice");
                    } else {
                        Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr STATUSNOTIFY clearChatRoomMsgSeq");
                        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(str2);
                        if (C72996z1.m85820U5(str2) && (j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str2)) != null && j.mo108786G2() > 0 && j.mo108785F2() > 0) {
                            Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr STATUSNOTIFY clearChatRoomMsgSeq chatroom[%s], UnDeliver[%d], Unread[%d]", str2, Integer.valueOf(j.mo108785F2()), Integer.valueOf(j.mo108786G2()));
                            ((C11502f) C86312j.m106911c(cls3)).mo11461Sr().ko0(str2);
                            j.mo108812g3(0);
                            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(j, str2);
                        }
                    }
                } else if (i3 == 13) {
                    Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "summerbadcr mark conversation readed. userName = " + g);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69768h0(g);
                } else if (i3 == 3) {
                    Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "summerstatus op[%s]", Integer.valueOf(i3));
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("message_fold");
                    arrayList2.add("conversationboxservice");
                    List<String> F = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69735F(arrayList2);
                    StringBuilder sb = new StringBuilder();
                    int i4 = 0;
                    while (true) {
                        arrayList = (ArrayList) F;
                        if (i4 >= arrayList.size()) {
                            break;
                        }
                        sb.append(i4 > 0 ? "," : "");
                        sb.append((String) arrayList.get(i4));
                        i4++;
                    }
                    Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "summerstatus userNames[%s] take[%d]ms", Integer.valueOf(arrayList.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    HashMap<String, C72976h2> f = C45629t0.m50819f(1);
                    Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "summerstatus unreadUsernames[%s] take[%d]ms", f.keySet(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    int size = f.size();
                    if (size > 0) {
                        linkedList = new LinkedList();
                        for (String next : f.keySet()) {
                            C72976h2 h2Var = f.get(next);
                            if (h2Var != null) {
                                hb4 hb4 = new hb4();
                                hb4.f134558d = next;
                                hb4.f134559e = (int) (h2Var.mo108821o2() / 1000);
                                linkedList.add(hb4);
                            }
                        }
                    } else {
                        linkedList = null;
                    }
                    C97625j3.m125815e().mo123460f(new C40359h0(sb.toString(), 4, size, (LinkedList<hb4>) linkedList));
                } else if (i3 == 6) {
                    Log.m105927v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", Integer.valueOf(i3), trim);
                } else if (i3 == 7) {
                    Log.m105927v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", Integer.valueOf(i3), trim);
                    C97625j3.m125812b().getClass();
                    C86709a0.m107528h();
                    Log.m105919d("MicroMsg.StatusNotifyMsgExtension", "onlineversion: %d,%d", Integer.valueOf(C86709a0.m107523b().f251760k), Integer.valueOf(C75554c.f221953h));
                    String trim2 = Util.nullAsNil(parseXml.get(".msg.op.name")).trim();
                    String trim3 = Util.nullAsNil(parseXml.get(".msg.op.arg")).trim();
                    if ("WeixinStatus".equals(trim2)) {
                        C97625j3.m125812b().getClass();
                        C86709a0.m107528h();
                        if (C86709a0.m107523b().f251760k == C75554c.f221953h && C75554c.m90588k1() != null && (str = C75554c.m90588k1().f221967u) != null && str.trim().length() > 0) {
                            Intent intent = new Intent(MMApplicationContext.getContext(), WebWXLogoutUI.class);
                            intent.setFlags(603979776);
                            intent.addFlags(268435456);
                            intent.putExtra("intent.key.online_version", C75554c.f221953h);
                            Context context = MMApplicationContext.getContext();
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent);
                            Context context2 = context;
                            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/webwx/model/StatusNotifyMsgExtension", "handleStatusNotifyMsg", "(Lcom/tencent/mm/protocal/protobuf/AddMsg;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(context2, "com/tencent/mm/plugin/webwx/model/StatusNotifyMsgExtension", "handleStatusNotifyMsg", "(Lcom/tencent/mm/protocal/protobuf/AddMsg;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    } else if ("MomentsUnreadMsgStatus".equals(trim2)) {
                        StatusNotifyFunctionEvent statusNotifyFunctionEvent = new StatusNotifyFunctionEvent();
                        StatusNotifyFunctionEvent.C28836a aVar3 = statusNotifyFunctionEvent.f79014d;
                        aVar3.f79015a = 7;
                        aVar3.f79016b = trim2;
                        aVar3.f79017c = (long) Util.getInt(trim3, 0);
                        StatusNotifyFunctionEvent.C28836a aVar4 = statusNotifyFunctionEvent.f79014d;
                        Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "sns enter function, %d, %s, %d", Integer.valueOf(statusNotifyFunctionEvent.f79014d.f79015a), aVar4.f79016b, Long.valueOf(aVar4.f79017c));
                        statusNotifyFunctionEvent.publish();
                    } else if ("EnterpriseChatStatus".equals(trim2)) {
                        C48009v0.zx0().mo73072b(i3, trim2, trim3);
                    }
                } else if (i3 == 8) {
                    Log.m105927v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", Integer.valueOf(i3), trim);
                    String trim4 = Util.nullAsNil(parseXml.get(".msg.op.name")).trim();
                    String trim5 = Util.nullAsNil(parseXml.get(".msg.op.arg")).trim();
                    if ("EnterpriseChatStatus".equals(trim4)) {
                        C48009v0.zx0().mo73072b(i3, trim4, trim5);
                    } else {
                        StatusNotifyFunctionEvent statusNotifyFunctionEvent2 = new StatusNotifyFunctionEvent();
                        statusNotifyFunctionEvent2.f79014d.f79015a = 8;
                        statusNotifyFunctionEvent2.publish();
                    }
                } else if (i3 == 9) {
                    Log.m105927v("MicroMsg.StatusNotifyMsgExtension", "lyh statusNotify, %d, %s", Integer.valueOf(i3), trim);
                    String trim6 = Util.nullAsNil(parseXml.get(".msg.op.name")).trim();
                    String trim7 = Util.nullAsNil(parseXml.get(".msg.op.arg")).trim();
                    if ("MomentsTimelineStatus".equals(trim6)) {
                        String[] split = trim7.split(",");
                        if (split.length == 2) {
                            StatusNotifyFunctionEvent statusNotifyFunctionEvent3 = new StatusNotifyFunctionEvent();
                            StatusNotifyFunctionEvent.C28836a aVar5 = statusNotifyFunctionEvent3.f79014d;
                            aVar5.f79015a = 9;
                            aVar5.f79016b = trim6;
                            aVar5.f79017c = (long) Util.getInt(split[1], 0);
                            statusNotifyFunctionEvent3.f79014d.f79018d = split[0];
                            statusNotifyFunctionEvent3.publish();
                        }
                    } else if ("EnterpriseChatStatus".equals(trim6)) {
                        C48009v0.zx0().mo73072b(i3, trim6, trim7);
                    } else if ("clearAllMsg".equals(trim6)) {
                        Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "delete all msg");
                    } else if ("deleteMessages".equals(trim6)) {
                        Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "delete msgs");
                    }
                } else {
                    String str4 = g;
                    if (i3 == 11) {
                        String trim8 = Util.nullAsNil(parseXml.get(".msg.op.name")).trim();
                        String trim9 = Util.nullAsNil(parseXml.get(".msg.op.arg")).trim();
                        Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "handleStatusNotifyMsg, op:SENDCOMMAND, funcName:" + trim8);
                        if ("DownloadFile".equals(trim8)) {
                            Map<String, String> parseXml2 = XmlParser.parseXml(trim9, "downloadList", (String) null);
                            if (parseXml2 != null) {
                                int i5 = 0;
                                while (true) {
                                    try {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(".downloadList.downloadItem");
                                        sb4.append(i5 == 0 ? "" : Integer.valueOf(i5));
                                        String sb5 = sb4.toString();
                                        i5++;
                                        String str5 = sb5 + ".username";
                                        String str6 = sb5 + ".msgsvrid";
                                        String str7 = parseXml2.get(str5);
                                        if (Util.isNullOrNil(str7)) {
                                            break;
                                        }
                                        long j2 = Util.getLong(parseXml2.get(str6), -1);
                                        if (j2 == -1) {
                                            break;
                                        }
                                        C72963f4 h302 = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(str7, j2);
                                        if (h302.mo108774y2() == 0) {
                                            Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "[MicroMsg.MultiTerminalSyncMgr] msg not exit, svrID:%d", Long.valueOf(j2));
                                        } else {
                                            ((C75739k) C86312j.m106911c(C75739k.class)).vx0().mo106056a(h302.getMsgId());
                                        }
                                    } catch (Throwable th) {
                                        Log.m105920e("MicroMsg.StatusNotifyMsgExtension", "[timyiluo] DownloadFile fail: " + th.getLocalizedMessage());
                                    }
                                }
                            }
                        } else if ("HandOff".equals(trim8)) {
                            int i6 = Util.getInt(parseXml.get(".msg.op.arg.handofflist.$opcode"), 0);
                            if (i6 == 5) {
                                try {
                                    String trim10 = parseXml.get(".msg.op.arg.handofflist.handoff.$from").trim();
                                    long j3 = Util.getLong(parseXml.get(".msg.op.arg.handofflist.handoff.id").trim(), 0);
                                    String trim11 = parseXml.get(".msg.op.arg.handofflist.handoff.$id").trim();
                                    C72683d Yt = C72709y1.vx0().mo100150Yt(((C72972g4) C97625j3.m125812b().mo105911z()).h30(trim10, j3).getMsgId());
                                    if (Yt == null) {
                                        HandOff cv = ((C92331c) C86312j.m106911c(cls4)).mo58364cv(trim11);
                                        if (cv instanceof AbsHandOffFile) {
                                            Yt = C96773p1.m124227j1((AbsHandOffFile) cv);
                                        }
                                    }
                                    if (Yt == null) {
                                        ((C92331c) C86312j.m106911c(cls4)).zw0(trim11, trim9);
                                    } else if (((C92331c) C86312j.m106911c(cls4)).f70(trim11, Yt)) {
                                        C97625j3.m125815e().mo123460f(new C96773p1(trim11, Yt));
                                    }
                                } catch (Throwable th4) {
                                    Log.m105920e("MicroMsg.StatusNotifyMsgExtension", "[timyiluo] handoff received EXPIRED command, arg is invalid: " + th4.getLocalizedMessage());
                                }
                            } else if (i6 == 6) {
                                Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "receive handoff GET_ALL_LIST request, call alllist");
                                ((C92331c) C86312j.m106911c(cls4)).m50();
                            } else if (i6 != 9) {
                                Matcher matcher = Pattern.compile("<arg>([\\s\\S]+)</arg>").matcher(trim);
                                if (matcher.find() && matcher.groupCount() > 0) {
                                    ((C92331c) C86312j.m106911c(cls4)).Cd0(matcher.group(1));
                                }
                            } else {
                                try {
                                    ((C92331c) C86312j.m106911c(cls4)).oq0(parseXml.get(".msg.op.arg.handofflist.handoff.md5").trim());
                                } catch (Exception e) {
                                    Log.m105920e("MicroMsg.StatusNotifyMsgExtension", "[timyiluo] handoff received EXPIRED command, arg is invalid: " + e.getLocalizedMessage());
                                }
                            }
                        } else {
                            Log.m105918d("MicroMsg.StatusNotifyMsgExtension", "[SendCommand]unknown function: " + trim8 + " , ignore");
                        }
                    } else if (i3 == 12) {
                        Log.m105919d("MicroMsg.StatusNotifyMsgExtension", "williamjin extdevice unlock " + (trim = C48374j0.m53718g(j3Var.f227631h).trim()), Integer.valueOf(i3));
                        try {
                            if (parseXml.get(".msg.op.arg") != null) {
                                String obj = new JSONObject(parseXml.get(".msg.op.arg")).get(MJTextResolver.KEY_DEVICE_NAME).toString();
                                if (C75554c.m90590m1()) {
                                    Intent intent2 = new Intent(MMApplicationContext.getContext(), WebWXPopupUnlockUI.class);
                                    intent2.setFlags(872415232);
                                    intent2.putExtra(MJTextResolver.KEY_DEVICE_NAME, obj);
                                    Context context3 = MMApplicationContext.getContext();
                                    C9556a aVar6 = new C9556a();
                                    aVar6.mo10233c(intent2);
                                    C117292a.m165358d(context3, aVar6.mo10232b(), "com/tencent/mm/plugin/webwx/model/StatusNotifyMsgExtension", "handleStatusNotifyMsg", "(Lcom/tencent/mm/protocal/protobuf/AddMsg;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    context3.startActivity((Intent) aVar6.mo10231a(0));
                                    C117292a.m165359e(context3, "com/tencent/mm/plugin/webwx/model/StatusNotifyMsgExtension", "handleStatusNotifyMsg", "(Lcom/tencent/mm/protocal/protobuf/AddMsg;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                }
                            } else {
                                Log.m105918d("MicroMsg.StatusNotifyMsgExtension", "[williamjin] can not find the tag  .msg.op.arg");
                            }
                        } catch (JSONException e2) {
                            Log.m105920e("MicroMsg.StatusNotifyMsgExtension", "[williamjin] " + e2.getMessage());
                        }
                    } else if (i3 == 14) {
                        String str8 = j3Var.f227629f.f141175d;
                        if (C72996z1.m85853x5(str8) || C72996z1.m85827Y4(str8)) {
                            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69769i(str8);
                        } else if (((C48053v) C86312j.m106911c(cls2)).mo72617gl(str8) || ((C48053v) C86312j.m106911c(cls2)).mo72614OE(str8)) {
                            C48009v0.Dx0().mo73021Lo(str8);
                            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f(str8);
                        } else {
                            C45629t0.m50823j(str8);
                        }
                        Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "hide session %s", str8);
                    } else if (i3 == 15) {
                        Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "delete session");
                    } else if (i3 == 16) {
                        Log.m105924i("MicroMsg.StatusNotifyMsgExtension", "clear session");
                    } else if (i3 == 19) {
                        C20615b o = C20612a.m22482o();
                        o.getClass();
                        int a = C20612a.m22480i().mo142622e().mo142623a();
                        if (a == 23 || a == 14 || a == 26 || a == 30) {
                            Log.m105928w("MicroMsg.BackupPcProcessMgr", "state:%d, not migrateClose");
                        } else if (a == -25 && o.f58030g == 101) {
                            C20612a.m22483p(31);
                        } else {
                            C20612a.m22483p(-100);
                        }
                    } else if (i3 != 18) {
                        if (i3 == 20) {
                            C20612a.m22482o().mo32287k();
                        } else if (i3 == 21) {
                            String trim12 = Util.nullAsNil(parseXml.get(".msg.op.name")).trim();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("share card message session, funcName: ");
                            sb6.append(trim12);
                            sb6.append(", userName: ");
                            String str9 = str4;
                            sb6.append(str9);
                            Log.m105924i("MicroMsg.StatusNotifyMsgExtension", sb6.toString());
                            if ("shareCardMessageStatus".equals(trim12)) {
                                try {
                                    JSONObject jSONObject = new JSONObject(Util.nullAsNil(parseXml.get(".msg.op.arg")).trim());
                                    String string = jSONObject.getString("shareCardMessageStatus");
                                    long j4 = Util.getLong(jSONObject.getString("messageSvrId"), -1);
                                    if (j4 == -1 || j4 == 0) {
                                        Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "share card message session, msg not exit, svrID:%d", Long.valueOf(j4));
                                    } else {
                                        C72963f4 h303 = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(str9, j4);
                                        if ("1".equals(string)) {
                                            h303.mo101009o4();
                                        } else if ("2".equals(string)) {
                                            h303.mo108743W2(h303.f230723F | 2048);
                                        }
                                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(j4, h303);
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                        } else {
                            Log.m105921e("MicroMsg.StatusNotifyMsgExtension", "unknow opCode, %d", Integer.valueOf(i3));
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.StatusNotifyMsgExtension", "onImgTaskEnd imgLocalId:%d, msgLocalId:%d", Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
    }
}
