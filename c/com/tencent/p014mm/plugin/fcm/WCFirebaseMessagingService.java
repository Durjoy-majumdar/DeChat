package com.tencent.p014mm.plugin.fcm;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tencent.mars.comm.WakerLock;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.FileReaderHelper;
import f40.C75681p0;
import f40.C86709a0;
import f40.C86718e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import kj2.C117407d;
import tc1.C37012b;

/* renamed from: com.tencent.mm.plugin.fcm.WCFirebaseMessagingService */
public class WCFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: n */
    public static List<Pair<Long, Long>> f248200n = new LinkedList();

    /* renamed from: j */
    public WakerLock f248201j;

    /* renamed from: i */
    public static void m105082i() {
        Intent intent = new Intent(MMApplicationContext.getContext(), NotifyReceiver.NotifyService.class);
        intent.putExtra("notify_option_type", 2);
        intent.putExtra("notify_uin", C86718e.m107549h());
        intent.putExtra("notify_respType", 2147480001);
        intent.putExtra("notify_respBuf", new byte[0]);
        intent.putExtra("notfiy_recv_time", Util.nowMilliSecond());
        C86709a0.m107528h();
        intent.putExtra("notify_skey", C86709a0.m107529k().mo121128c(1));
        C88144b.m109807y(intent);
        Log.m105924i("MicroMsg.FCM.WCFirebaseMessagingService", "summerauths tryDoSync end!");
    }

    /* renamed from: e */
    public void mo118227e() {
        Log.m105924i("MicroMsg.FCM.WCFirebaseMessagingService", "Deleted messages on server.");
        C115669n nVar = C115669n.INSTANCE;
        nVar.kvStat(11250, "1," + String.valueOf(1));
        C117407d.INSTANCE.idkeyStat(901, 31, 1, false);
    }

    /* renamed from: f */
    public void mo118228f(RemoteMessage remoteMessage) {
        Log.m105924i("MicroMsg.FCM.WCFirebaseMessagingService", "on message received");
        C37012b a = C37012b.m41119a();
        if (a == null) {
            Log.m105928w("MicroMsg.FCM.WCFirebaseMessagingService", "fcmRegister is null");
            C117407d.INSTANCE.idkeyStat(901, 26, 1, false);
        } else if (!a.f98129d.getSharedPreferences(C37012b.class.getSimpleName(), 0).getBoolean("isRegToSvr", false)) {
            Log.m105928w("MicroMsg.FCM.WCFirebaseMessagingService", "fcm push not reg to server.");
            C117407d.INSTANCE.idkeyStat(901, 25, 1, false);
        } else {
            try {
                Context context = MMApplicationContext.getContext();
                if (C75681p0.m90936c(context)) {
                    Log.m105924i("MicroMsg.FCM.WCFirebaseMessagingService", "Logout or exit MM. no need show Notification.");
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.kvStat(11250, "1," + String.valueOf(2));
                    C117407d.INSTANCE.idkeyStat(901, 28, 1, false);
                    return;
                }
                Map<String, String> i = remoteMessage.mo169437i();
                if (i.isEmpty()) {
                    Log.m105924i("MicroMsg.FCM.WCFirebaseMessagingService", "msg data is empty: ");
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.kvStat(11250, "1," + String.valueOf(0));
                    C117407d.INSTANCE.idkeyStat(901, 29, 1, false);
                    return;
                }
                String str = i.get(TPReportKeys.Common.COMMON_SEQ);
                String str2 = i.get("uin");
                String str3 = i.get(FileReaderHelper.OPEN_FILE_FROM_CMD);
                String str4 = i.get("alert");
                String str5 = i.get("msgType");
                String str6 = i.get("badge");
                String str7 = i.get("from");
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(901, 32, 1, false);
                C117407d dVar2 = dVar;
                String str8 = "1,";
                Object[] objArr = new Object[11];
                objArr[0] = str;
                boolean z = true;
                objArr[1] = str2;
                objArr[2] = str3;
                objArr[3] = Util.secPrint(i.get("username"));
                objArr[4] = i.get("time");
                objArr[5] = i.get("collapse_key");
                objArr[6] = i.get("sound");
                objArr[7] = Integer.valueOf(str4 == null ? -1 : str4.length());
                objArr[8] = str5;
                objArr[9] = str6;
                objArr[10] = str7;
                Log.m105925i("MicroMsg.FCM.WCFirebaseMessagingService", "Received gcm msg. seq[%s] uin[%s] cmd[%s] username[%s] time[%s] collapse_key[%s] sound[%s] alert len[%s], msgType[%s], badge[%s], from[%s]", objArr);
                long j = Util.isNullOrNil(str2) ? 0 : Util.getLong(str2, 0);
                long j2 = Util.isNullOrNil(str) ? 0 : Util.getLong(str, 0);
                long j3 = Util.isNullOrNil(str3) ? 0 : Util.getLong(str3, 0);
                int h = C86718e.m107549h();
                int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i2 != 0) {
                    if (Integer.toHexString(h).equals(Long.toHexString(j))) {
                        Iterator<Pair<Long, Long>> it = f248200n.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            Pair next = it.next();
                            if (((Long) next.first).longValue() == j3 && ((Long) next.second).longValue() == j2) {
                                break;
                            }
                        }
                        if (z) {
                            Log.m105928w("MicroMsg.FCM.WCFirebaseMessagingService", "already has this seq:" + j2);
                            C117407d.INSTANCE.idkeyStat(901, 35, 1, false);
                            return;
                        }
                        ((LinkedList) f248200n).add(Pair.create(Long.valueOf(j3), Long.valueOf(j2)));
                        if (((LinkedList) f248200n).size() > 60) {
                            ((LinkedList) f248200n).remove(0);
                        }
                        if (this.f248201j == null) {
                            this.f248201j = new WakerLock(context, "MicroMsg.FCM.WCFirebaseMessagingService");
                            Log.m105924i("MicroMsg.FCM.WCFirebaseMessagingService", "start new wakerlock");
                        }
                        this.f248201j.lock(200, "FcmBroadcastReceiver.onReceive");
                        Log.m105924i("MicroMsg.FCM.WCFirebaseMessagingService", "summerauths tryDoSync");
                        m105082i();
                        return;
                    }
                }
                Log.m105920e("MicroMsg.FCM.WCFirebaseMessagingService", "Logined user changed. no need show Notification.uin:" + j + ", oldUin:" + h);
                C115669n nVar3 = C115669n.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(str8);
                sb.append(String.valueOf(3));
                nVar3.kvStat(11250, sb.toString());
                dVar2.idkeyStat(901, i2 == 0 ? 33 : 34, 1, false);
            } catch (Exception e) {
                String obj = e.toString();
                Log.m105920e("MicroMsg.FCM.WCFirebaseMessagingService", "onMessageReceived error :" + obj);
                Log.printErrStackTrace("MicroMsg.FCM.WCFirebaseMessagingService", e, "", new Object[0]);
                C117407d.INSTANCE.idkeyStat(901, 36, 1, false);
            }
        }
    }

    /* renamed from: g */
    public void mo118229g(String str, Exception exc) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.kvStat(11250, "1," + String.valueOf(1));
        C117407d.INSTANCE.idkeyStat(901, 30, 1, false);
    }
}
