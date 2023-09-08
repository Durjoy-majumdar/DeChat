package com.tencent.p014mm.booter.notification;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.format.Time;
import android.util.Pair;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgFailNotificationEvent;
import com.tencent.p014mm.booter.notification.C67845k;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.conversation.ConversationUnreadHelper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C45628s0;
import eb0.C75568c3;
import eb0.C75604z3;
import eb0.C86492u2;
import eb0.C97625j3;
import eb0.z3$$h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kd0.C76539f;
import p285zh.C119114c;
import p645pj.C77091b;
import p789bi.C67242a;
import p789bi.C67244b;
import p875ci.C67376e;
import p875ci.C67378t;
import p918s2.C77604h;
import p918s2.C90116e;
import rb0.C47984k;
import rb0.C48009v0;
import sb0.C48334c;
import sf0.C77689e0;
import vc3.C78382a;
import zc2.C79318h;

/* renamed from: com.tencent.mm.booter.notification.MMNotification */
public class MMNotification implements C75568c3, C86492u2 {

    /* renamed from: a */
    public String f194714a;

    /* renamed from: b */
    public String f194715b;

    /* renamed from: c */
    public C72963f4 f194716c;

    /* renamed from: d */
    public String f194717d;

    /* renamed from: e */
    public boolean f194718e;

    /* renamed from: f */
    public boolean f194719f;

    /* renamed from: g */
    public long f194720g;

    /* renamed from: h */
    public Context f194721h = null;

    /* renamed from: i */
    public C67845k f194722i = C67845k.C67847b.f194757a;

    /* renamed from: j */
    public C67376e f194723j;

    /* renamed from: k */
    public MMHandler f194724k = new C67837a(Looper.getMainLooper());

    /* renamed from: l */
    public boolean f194725l;

    /* renamed from: com.tencent.mm.booter.notification.MMNotification$a */
    public class C67837a extends MMHandler {
        public C67837a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            String string = message.getData().getString("notification.show.talker");
            String string2 = message.getData().getString("notification.show.message.content");
            int i = message.getData().getInt("notification.show.message.type");
            int i2 = message.getData().getInt("notification.show.tipsflag");
            Log.m105925i("MicroMsg.MMNotification", "notify need to deal: %s", string);
            try {
                C119114c.m167921f("notifyHandler");
                if (message.what == 1) {
                    MMNotification.m80178d(MMNotification.this, string, string2, i, i2, true);
                } else {
                    MMNotification.m80178d(MMNotification.this, string, string2, i, i2, false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMNotification", e, "showNotifiHandler", new Object[0]);
            }
        }
    }

    public MMNotification(Context context) {
        C40008f fVar = C40008f.f107254d;
        C678362 r0 = new IListener<RevokeMsgEvent>(fVar) {
            {
                this.__eventId = 675629679;
            }

            public boolean callback(IEvent iEvent) {
                C72963f4 f4Var;
                RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
                if (!(revokeMsgEvent == null || (f4Var = revokeMsgEvent.f78943d.f78946c) == null)) {
                    MMNotification mMNotification = MMNotification.this;
                    mMNotification.getClass();
                    if (f4Var.mo108769t2() == 1) {
                        Log.m105929w("MicroMsg.MMNotification", "notifyRevorkMessage is sender , msgid:%d ", Long.valueOf(f4Var.mo108774y2()));
                    } else {
                        int m = MMNotification.m80179m(f4Var);
                        String content = f4Var.getContent();
                        int type = f4Var.getType();
                        if (!mMNotification.f194722i.mo93233a(f4Var.mo108768t(), f4Var, m, true)) {
                            Log.m105928w("MicroMsg.MMNotification", "[no notificaion], preNotificationCheck");
                        } else {
                            mMNotification.f194716c = f4Var;
                            String t = f4Var.mo108768t();
                            mMNotification.f194714a = t;
                            mMNotification.f194717d = "";
                            Log.m105925i("MicroMsg.MMNotification", "notifyRevorkMessage talker:%s msgid:%d type:%d tipsFlag:%d content:%s", t, Long.valueOf(f4Var.mo108774y2()), Integer.valueOf(type), Integer.valueOf(m), Util.secPrint(content));
                            mMNotification.f194724k.sendMessageDelayed(mMNotification.mo93217o(mMNotification.f194714a, content, type, m, 1), 200);
                        }
                    }
                }
                return false;
            }
        };
        C288703 r2 = new IListener<SendMsgFailNotificationEvent>(fVar) {
            {
                this.__eventId = 1082806728;
            }

            public boolean callback(IEvent iEvent) {
                SendMsgFailNotificationEvent sendMsgFailNotificationEvent = (SendMsgFailNotificationEvent) iEvent;
                if (sendMsgFailNotificationEvent != null) {
                    sendMsgFailNotificationEvent.f78972d.getClass();
                    sendMsgFailNotificationEvent.f78972d.getClass();
                    MMNotification.this.mo93216n((String) null, 0);
                }
                return false;
            }
        };
        this.f194725l = false;
        this.f194721h = context;
        this.f194714a = "";
        this.f194717d = "";
        this.f194715b = "";
        this.f194720g = 0;
        this.f194719f = false;
        this.f194723j = new C67376e();
        synchronized (C79318h.f232860d) {
            if (!((ArrayList) C79318h.f232860d).contains(this)) {
                ((ArrayList) C79318h.f232860d).add(this);
            }
        }
        if (C76539f.f223992s == null) {
            C76539f.f223992s = this;
        }
        r2.alive();
        r0.alive();
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06c4, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x06d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0793  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0817  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0945  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0952  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0956  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x097a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m80178d(com.tencent.p014mm.booter.notification.MMNotification r25, java.lang.String r26, java.lang.String r27, int r28, int r29, boolean r30) {
        /*
            r0 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r25.getClass()
            java.lang.Class<gw0.b> r14 = gw0.C76073b.class
            java.lang.Class<bv1.b> r15 = bv1.C28426b.class
            r9 = 5
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r8 = 1
            r1[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            r7 = 2
            r1[r7] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r30)
            r16 = 3
            r1[r16] = r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r27)
            r6 = 4
            r1[r6] = r2
            java.lang.String r5 = "MicroMsg.MMNotification"
            java.lang.String r2 = "jacks dealNotify, talker:%s, msgtype:%d, tipsFlag:%d, isRevokeMesasge:%B content:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            r17 = 26
            boolean r1 = p206nj.C11171e.m11046c(r17)
            if (r1 == 0) goto L_0x0044
            p645pj.C77091b.m93031m()
        L_0x0044:
            if (r30 == 0) goto L_0x0050
            boolean[] r1 = new boolean[r7]
            r1 = {0, 0} // fill-array
            r12 = r5
            r20 = r14
            r14 = 0
            goto L_0x0071
        L_0x0050:
            ci.e r1 = r0.f194723j
            android.content.Context r2 = r0.f194721h
            com.tencent.mm.storage.f4 r3 = r0.f194716c
            boolean r4 = r0.f194719f
            long r9 = r0.f194720g
            r19 = r4
            r4 = r28
            r12 = r5
            r5 = r27
            r20 = r14
            r14 = 4
            r6 = r26
            r14 = 2
            r7 = r29
            r14 = 1
            r8 = r19
            r14 = 0
            boolean[] r1 = r1.mo91515d(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0071:
            boolean r10 = r1[r14]
            r2 = 1
            boolean r9 = r1[r2]
            if (r10 != 0) goto L_0x007c
            if (r9 != 0) goto L_0x007c
            r1 = 1
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateNotifyInfo: silent = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            r2 = 1
            r0.f194719f = r2
            if (r1 != 0) goto L_0x00b4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "updateNotifyInfo : modify lastNotSilentTime = "
            r1.append(r2)
            long r2 = r0.f194720g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f194720g = r1
        L_0x00b4:
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r14] = r11
            java.lang.String r3 = r0.f194715b
            r4 = 1
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            r4 = 2
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r2[r16] = r3
            int r3 = p645pj.C77091b.f225180a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 4
            r2[r4] = r3
            java.lang.String r3 = "[notificaion], iscurrent Chatting Talker true, talker[%s] curChattingTalker[%s] needSound[%B] needShake[%B] isSpecialSceneSwitchEnable:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r3, r2)
            com.tencent.mm.booter.notification.k r2 = r0.f194722i
            java.lang.String r3 = r0.f194715b
            com.tencent.mm.booter.notification.j r2 = r2.f194756a
            com.tencent.mm.booter.notification.f r2 = r2.f194754a
            r2.getClass()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r14] = r11
            r4 = 1
            r5[r4] = r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            r6 = 2
            r5[r6] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            r5[r16] = r4
            java.lang.String r6 = "MicroMsg.Notification.AppMsg.Handle"
            java.lang.String r4 = "dealCurChattingTalker, talker: %s, curChattingTalker: %s, needSound: %B, needShake: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r4, r5)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r26)
            if (r4 != 0) goto L_0x0181
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x010d
            goto L_0x0181
        L_0x010d:
            boolean r4 = r11.equals(r3)
            if (r4 != 0) goto L_0x0114
            goto L_0x0181
        L_0x0114:
            if (r9 != 0) goto L_0x0118
            if (r10 == 0) goto L_0x011e
        L_0x0118:
            boolean r4 = p645pj.C77091b.m93034p()
            if (r4 != 0) goto L_0x0124
        L_0x011e:
            java.lang.String r2 = "[NO NOTIFICATION] is current talker chatroom & no shake & no sound"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            goto L_0x017f
        L_0x0124:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
            r5[r14] = r7
            java.lang.String r7 = "notification.shake: curChatting needShake~: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            android.content.Context r5 = r2.f194739b
            com.tencent.p014mm.sdk.platformtools.Util.shake(r5, r9)
            if (r10 == 0) goto L_0x0165
            android.util.Pair r5 = p645pj.C77091b.m93038t()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Object r4 = r5.second
            r7[r14] = r4
            java.lang.String r4 = "notification.playSound: curChattingTalker: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r7)
            ci.t r2 = r2.f194738a
            java.lang.Object r4 = r5.second
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r5.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r2.getClass()
            boolean r2 = p875ci.C113348f.C67377c.f193241c
            if (r2 == 0) goto L_0x0160
            ci.f r2 = p875ci.C113348f.C67377c.f193240b
            goto L_0x0162
        L_0x0160:
            ci.f r2 = p875ci.C113348f.C67377c.f193239a
        L_0x0162:
            r2.mo165898a(r4, r14, r5)
        L_0x0165:
            r2 = 4
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r14] = r11
            r2 = 1
            r4[r2] = r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r3 = 2
            r4[r3] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r4[r16] = r2
            java.lang.String r2 = "[NO NOTIFICATION] is current talker end. talker[%s], current ChattingTalker[%s]. shake %B, sound: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r4)
        L_0x017f:
            r2 = 1
            goto L_0x0182
        L_0x0181:
            r2 = 0
        L_0x0182:
            if (r2 == 0) goto L_0x01a7
            r2 = 4
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r14] = r11
            java.lang.String r0 = r0.f194715b
            r2 = 1
            r1[r2] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r2 = 2
            r1[r2] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1[r16] = r0
            java.lang.String r0 = "[no notificaion], iscurrent Chatting Talker true, talker[%s] curChattingTalker[%s] needSound[%B] needShake[%B]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r1)
            java.lang.String r0 = "currTalker"
            p285zh.C119114c.m167922g(r0)
            goto L_0x0b36
        L_0x01a7:
            com.tencent.mm.booter.notification.k r2 = r0.f194722i
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r3 == 0) goto L_0x01bc
            boolean r3 = r0.f194718e
            if (r3 != 0) goto L_0x01ba
            boolean r3 = r0.f194725l
            if (r3 == 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r3 = 0
            goto L_0x01be
        L_0x01ba:
            r3 = 1
            goto L_0x01be
        L_0x01bc:
            boolean r3 = r0.f194718e
        L_0x01be:
            com.tencent.mm.booter.notification.j r2 = r2.f194756a
            com.tencent.mm.booter.notification.f r2 = r2.f194754a
            r2.getClass()
            if (r3 == 0) goto L_0x0256
            boolean r3 = p206nj.C11171e.m11046c(r17)
            if (r3 == 0) goto L_0x01dd
            boolean r3 = p645pj.C77091b.m93034p()
            if (r3 == 0) goto L_0x01db
            boolean r3 = p645pj.C77091b.m93036r()
            if (r3 == 0) goto L_0x01db
            r3 = 1
            goto L_0x01e1
        L_0x01db:
            r3 = 0
            goto L_0x01e1
        L_0x01dd:
            boolean r3 = p645pj.C77091b.m93034p()
        L_0x01e1:
            if (r9 != 0) goto L_0x01e5
            if (r10 == 0) goto L_0x01e7
        L_0x01e5:
            if (r3 != 0) goto L_0x01ef
        L_0x01e7:
            java.lang.String r2 = "[NO NOTIFICATION] is mainUI & no shake & no sound"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r2 = 2
            r5 = 1
            goto L_0x0254
        L_0x01ef:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r4[r14] = r3
            java.lang.String r3 = "notification.shake: mainUI needShake~: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r4)
            if (r9 == 0) goto L_0x020a
            boolean r3 = p645pj.C77091b.m93026h()
            if (r3 == 0) goto L_0x020a
            android.content.Context r3 = r2.f194739b
            com.tencent.p014mm.sdk.platformtools.Util.shake(r3, r9)
        L_0x020a:
            if (r10 == 0) goto L_0x023f
            boolean r3 = p645pj.C77091b.m93020b()
            if (r3 == 0) goto L_0x023f
            android.util.Pair r3 = p645pj.C77091b.m93038t()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object r4 = r3.second
            r5[r14] = r4
            java.lang.String r4 = "notification.playSound: is mainUItalker: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r5)
            ci.t r2 = r2.f194738a
            java.lang.Object r4 = r3.second
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.first
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.getClass()
            boolean r2 = p875ci.C113348f.C67377c.f193241c
            if (r2 == 0) goto L_0x023a
            ci.f r2 = p875ci.C113348f.C67377c.f193240b
            goto L_0x023c
        L_0x023a:
            ci.f r2 = p875ci.C113348f.C67377c.f193239a
        L_0x023c:
            r2.mo165898a(r4, r14, r3)
        L_0x023f:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            r3[r14] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = "[NO NOTIFICATION] is mainUI end. shake %B, sound: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r3)
        L_0x0254:
            r3 = 1
            goto L_0x0259
        L_0x0256:
            r2 = 2
            r5 = 1
            r3 = 0
        L_0x0259:
            if (r3 == 0) goto L_0x0275
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r0[r14] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0[r5] = r1
            java.lang.String r1 = "[no notificaion], isMainUI true, needSound[%B] needShake[%B]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r1, r0)
            java.lang.String r0 = "mainUI"
            p285zh.C119114c.m167922g(r0)
            goto L_0x0b36
        L_0x0275:
            r2 = 436207665(0x1a000031, float:2.6469934E-23)
            r8 = 0
            if (r13 != r2) goto L_0x0312
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r27)
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r8)
            if (r2 == 0) goto L_0x029b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ljd:c2c hongbao message for c2cShowNotification is "
            r3.append(r4)
            int r4 = r2.f195636v1
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r3)
        L_0x029b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r4.<init>()
            r5 = 313(0x139, float:4.39E-43)
            r4.SetID(r5)
            r4.SetKey(r14)
            r17 = r9
            r8 = 1
            r4.SetValue(r8)
            r3.add(r4)
            java.lang.String r4 = "1002"
            if (r2 == 0) goto L_0x02ea
            java.lang.String r7 = r2.f195604n1
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x02ea
            int r7 = r2.f195636v1
            r1 = 1
            if (r7 != r1) goto L_0x02ea
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>()
            r0.SetID(r5)
            r0.SetKey(r1)
            r0.SetValue(r8)
            r3.add(r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0.mo160124a(r3, r1)
            java.lang.String r0 = "ljd:c2c hongbao message for notification is hide!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            java.lang.String r0 = "luckyMoneyMute"
            p285zh.C119114c.m167922g(r0)
            goto L_0x0b36
        L_0x02ea:
            if (r2 == 0) goto L_0x0314
            java.lang.String r1 = r2.f195604n1
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0314
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>()
            r1.SetID(r5)
            r2 = 2
            r1.SetKey(r2)
            r1.SetValue(r8)
            r3.add(r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1
            r1.mo160124a(r3, r2)
            java.lang.String r1 = "ljd:c2c hongbao message for notification is show!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            goto L_0x0314
        L_0x0312:
            r17 = r9
        L_0x0314:
            di3.d r1 = di3.C86312j.m106911c(r15)
            if (r1 == 0) goto L_0x0338
            di3.d r1 = di3.C86312j.m106911c(r15)
            bv1.b r1 = (bv1.C28426b) r1
            boolean r1 = r1.ua0(r11)
            if (r1 != 0) goto L_0x0338
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r14] = r11
            java.lang.String r1 = "return by talker=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r1, r0)
            java.lang.String r0 = "talkerMute"
            p285zh.C119114c.m167922g(r0)
            goto L_0x0b36
        L_0x0338:
            r7 = 318767153(0x13000031, float:1.6155966E-27)
            if (r13 != r7) goto L_0x0387
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC
            r3 = 1
            boolean r1 = r1.mo119686g(r2, r3)
            if (r1 != 0) goto L_0x035a
            java.lang.String r0 = "It is a service notify message and the show tips switch is off. So do not show notification."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            java.lang.String r0 = "serviceMute"
            p285zh.C119114c.m167922g(r0)
            goto L_0x0b36
        L_0x035a:
            di3.d r1 = di3.C86312j.m106911c(r15)
            if (r1 == 0) goto L_0x0387
            di3.d r1 = di3.C86312j.m106911c(r15)
            bv1.b r1 = (bv1.C28426b) r1
            com.tencent.mm.storage.f4 r2 = r0.f194716c
            java.lang.String r2 = r2.getContent()
            java.lang.String r1 = r1.mo55968uJ(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0387
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r14] = r1
            java.lang.String r1 = "return by msgPushId=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r1, r0)
            java.lang.String r0 = "pushId"
            p285zh.C119114c.m167922g(r0)
            goto L_0x0b36
        L_0x0387:
            com.tencent.mm.storage.f4 r1 = r0.f194716c
            if (r1 == 0) goto L_0x03ba
            di3.d r1 = di3.C86312j.m106911c(r20)
            gw0.b r1 = (gw0.C76073b) r1
            com.tencent.mm.storage.f4 r2 = r0.f194716c
            java.lang.String r2 = r2.mo108768t()
            boolean r1 = r1.mo94598h0(r2)
            if (r1 == 0) goto L_0x03ba
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC
            r3 = 1
            boolean r1 = r1.mo119686g(r2, r3)
            if (r1 != 0) goto L_0x03ba
            java.lang.String r0 = "It is a wxa custom session notify message and the show tips switch is off. So do not show notification."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            java.lang.String r0 = "appBrandMute"
            p285zh.C119114c.m167922g(r0)
            goto L_0x0b36
        L_0x03ba:
            com.tencent.mm.booter.notification.k r1 = r0.f194722i
            com.tencent.mm.storage.f4 r2 = r0.f194716c
            if (r2 != 0) goto L_0x03c3
            r2 = 0
            goto L_0x03c7
        L_0x03c3:
            long r2 = r2.mo108774y2()
        L_0x03c7:
            r8 = r2
            java.lang.String r12 = r0.f194717d
            com.tencent.mm.booter.notification.j r0 = r1.f194756a
            r0.getClass()
            boolean r1 = p645pj.C77091b.m93019a()
            if (r1 != 0) goto L_0x03d8
            r0.mo93232b()
        L_0x03d8:
            com.tencent.mm.booter.notification.f r15 = r0.f194754a
            r15.getClass()
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r0[r14] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            r2 = 1
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r2 = 2
            r0[r2] = r1
            r0[r16] = r11
            r1 = 4
            r0[r1] = r12
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r30)
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = "in sample Notify: needSound: %B, needShake: %B, msgContent: ==, msgType: %d, talker: %s, customNotify: %s, isRevokeMessage:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            boolean r0 = p645pj.C77091b.m93034p()
            if (r0 != 0) goto L_0x0417
            java.lang.String r0 = "msgSetting"
            p285zh.C119114c.m167922g(r0)
            java.lang.String r0 = "[NO NOTIFICATION]new MsgNotification setting no notification"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x04b7
        L_0x0417:
            ug.c r0 = rb0.C47984k.m53328b(r26)     // Catch:{ all -> 0x0436 }
            if (r0 != 0) goto L_0x041e
            goto L_0x0437
        L_0x041e:
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ all -> 0x0436 }
            com.tencent.mm.storage.u3 r1 = r1.mo105907v()     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = r0.mo73498p2()     // Catch:{ all -> 0x0436 }
            com.tencent.mm.storage.z1 r0 = r1.get(r0)     // Catch:{ all -> 0x0436 }
            if (r0 != 0) goto L_0x0431
            goto L_0x0437
        L_0x0431:
            boolean r0 = eb0.C45628s0.m50746K(r0)     // Catch:{ all -> 0x0436 }
            goto L_0x0438
        L_0x0436:
        L_0x0437:
            r0 = 0
        L_0x0438:
            if (r0 == 0) goto L_0x0447
            java.lang.String r0 = "[NO NOTIFICATION]new MsgNotification isEnterpriseChat contact.isMute"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = "weComMute"
            p285zh.C119114c.m167922g(r0)
            goto L_0x04b7
        L_0x0447:
            boolean r0 = p645pj.C77091b.m93035q()
            r5 = 53
            r4 = 50
            if (r0 != 0) goto L_0x0487
            r0 = 64
            if (r13 == r0) goto L_0x045d
            if (r13 == r4) goto L_0x045d
            r0 = 52
            if (r13 == r0) goto L_0x045d
            if (r13 != r5) goto L_0x0487
        L_0x045d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NotificationConfig.isNewVoipMsgNotification() is false,msgType is "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "type-"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            p285zh.C119114c.m167922g(r0)
            goto L_0x04b7
        L_0x0487:
            ci.t r0 = r15.f194738a
            r3 = -1
            r0.f193249h = r3
            r0.f193250i = r3
            r0.f193248g = r3
            if (r30 == 0) goto L_0x04aa
            boolean r1 = r0.f193251j
            if (r1 != 0) goto L_0x04aa
            int r1 = p645pj.C77095h.m93060c()
            r0.f193249h = r1
            int r0 = r0.f193249h
            if (r0 > 0) goto L_0x04aa
            ci.t r0 = r15.f194738a
            int r0 = r0.mo91520b()
            if (r0 > 0) goto L_0x04aa
            r0 = 1
            goto L_0x04ab
        L_0x04aa:
            r0 = 0
        L_0x04ab:
            if (r0 == 0) goto L_0x04bc
            java.lang.String r0 = "[NO NOTIFICATION] no refresh notify by revoke"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = "revoke"
            p285zh.C119114c.m167922g(r0)
        L_0x04b7:
            r20 = r10
            r12 = 0
            goto L_0x0b1b
        L_0x04bc:
            android.app.Notification r2 = new android.app.Notification
            r2.<init>()
            r0 = 2131233360(0x7f080a50, float:1.8082855E38)
            r2.icon = r0
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r2.ledARGB = r0
            r0 = 300(0x12c, float:4.2E-43)
            r2.ledOnMS = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.ledOffMS = r0
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1[r14] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r16 = 1
            r1[r16] = r0
            java.lang.String r0 = "needSound = %b , needShake = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
            ci.t r1 = r15.f194738a
            r1.getClass()
            boolean r0 = p645pj.C77091b.m93019a()
            r1.f193251j = r0
            r1.f193252k = r10
            r0 = r17
            r1.f193253l = r0
            ci.b r3 = r1.f193242a
            android.content.Context r4 = r1.f193247f
            r0 = r3
            r3 = r1
            r1 = r4
            r18 = r2
            r2 = r10
            r4 = r3
            r7 = -1
            r3 = r17
            r14 = r4
            r7 = 50
            r4 = r18
            r5 = r27
            r0.mo91511a(r1, r2, r3, r4, r5)
            ci.c r0 = r14.f193243b
            r1 = 2131233736(0x7f080bc8, float:1.8083618E38)
            r0.f193234a = r1
            if (r13 == r7) goto L_0x0522
            r2 = 53
            if (r13 != r2) goto L_0x0520
            goto L_0x0522
        L_0x0520:
            r2 = 0
            goto L_0x0523
        L_0x0522:
            r2 = 1
        L_0x0523:
            if (r2 == 0) goto L_0x053b
            boolean r2 = p645pj.C77095h.m93063f(r27)
            r3 = 2131234861(0x7f08102d, float:1.80859E38)
            if (r2 == 0) goto L_0x0533
            r0.f193234a = r3     // Catch:{ Exception -> 0x0531 }
            goto L_0x053b
        L_0x0531:
            goto L_0x053b
        L_0x0533:
            boolean r2 = p645pj.C77095h.m93064g(r27)
            if (r2 == 0) goto L_0x053b
            r0.f193234a = r3     // Catch:{ Exception -> 0x0531 }
        L_0x053b:
            int r2 = r0.f193234a
            if (r2 >= 0) goto L_0x0541
            r0.f193234a = r1
        L_0x0541:
            ci.d r0 = r14.f193244c
            android.content.Context r1 = r14.f193247f
            boolean r2 = r14.f193251j
            if (r2 == 0) goto L_0x054b
            r2 = 0
            goto L_0x0558
        L_0x054b:
            int r2 = r14.f193249h
            r3 = -1
            if (r2 != r3) goto L_0x0556
            int r2 = p645pj.C77095h.m93060c()
            r14.f193249h = r2
        L_0x0556:
            int r2 = r14.f193249h
        L_0x0558:
            boolean r3 = r14.f193251j
            r0.getClass()
            boolean r4 = p645pj.C77095h.m93061d(r26)
            java.lang.Class<ht1.t3> r5 = ht1.C60204t3.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t3 r5 = (ht1.C60204t3) r5
            if (r5 == 0) goto L_0x056e
            r5.s20()
        L_0x056e:
            if (r5 == 0) goto L_0x0578
            boolean r5 = r5.Kv0(r1)
            if (r5 == 0) goto L_0x0578
            r5 = 1
            goto L_0x0579
        L_0x0578:
            r5 = 0
        L_0x0579:
            android.content.Intent r7 = new android.content.Intent
            r22 = r8
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r8 = com.tencent.p014mm.p136ui.LauncherUI.class
            r7.<init>(r1, r8)
            java.lang.String r1 = "nofification_type"
            java.lang.String r8 = "new_msg_nofification"
            r7.putExtra(r1, r8)
            java.lang.String r1 = "Main_User"
            r7.putExtra(r1, r11)
            java.lang.String r1 = "MainUI_User_Last_Msg_Type"
            r7.putExtra(r1, r13)
            java.lang.String r1 = "MainUI_FromFinderNotification"
            r7.putExtra(r1, r5)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r7.addFlags(r1)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r7.addFlags(r1)
            java.lang.String r1 = "initIntent"
            p285zh.C119114c.m167923h(r7, r1)
            java.lang.String r1 = "Intro_Bottle_unread_count"
            java.lang.String r5 = "talkerCount"
            java.lang.String r8 = "Intro_Is_Muti_Talker"
            if (r3 == 0) goto L_0x05be
            r3 = 1
            r7.putExtra(r5, r3)
            if (r4 != 0) goto L_0x05d8
            r9 = 0
            r7.putExtra(r8, r9)
            r7.putExtra(r1, r9)
            goto L_0x05d8
        L_0x05be:
            r3 = 1
            r9 = 0
            if (r2 < 0) goto L_0x05c3
            goto L_0x05c7
        L_0x05c3:
            int r2 = p645pj.C77095h.m93060c()
        L_0x05c7:
            if (r2 > r3) goto L_0x05d2
            if (r4 != 0) goto L_0x05d2
            r7.putExtra(r8, r9)
            r7.putExtra(r1, r9)
            goto L_0x05d5
        L_0x05d2:
            r7.putExtra(r8, r3)
        L_0x05d5:
            r7.putExtra(r5, r2)
        L_0x05d8:
            r0.f193235a = r7
            boolean r0 = r14.f193251j
            r2 = 2131831457(0x7f112aa1, float:1.929594E38)
            if (r0 == 0) goto L_0x098a
            ci.u r0 = r14.f193245d
            android.content.Context r3 = r14.f193247f
            int r4 = r14.f193248g
            r5 = -1
            if (r4 != r5) goto L_0x05f1
            r4 = 0
            int r5 = eb0.C45629t0.m50817d(r11, r4)
            r14.f193248g = r5
        L_0x05f1:
            int r4 = r14.f193248g
            r0.getClass()
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85811N4(r26)
            eb0.c r8 = eb0.C97625j3.m125812b()
            g62.l r8 = r8.mo105911z()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            com.tencent.mm.storage.f4 r8 = r8.Ex0(r11)
            if (r7 == 0) goto L_0x0636
            r7 = 0
            r9 = 1
            int r1 = java.lang.Math.max(r9, r7)
            java.lang.String r2 = r3.getString(r2)
            android.content.res.Resources r7 = r3.getResources()
            r19 = r2
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r20 = 0
            r2[r20] = r9
            r9 = 2131689496(0x7f0f0018, float:1.900801E38)
            java.lang.String r1 = r7.getQuantityString(r9, r1, r2)
            r7 = r3
            r20 = r10
            r2 = r19
            r3 = r27
            goto L_0x07c4
        L_0x0636:
            boolean r1 = android.text.TextUtils.isEmpty(r26)
            if (r1 == 0) goto L_0x063f
            r7 = r3
            goto L_0x06a2
        L_0x063f:
            boolean r1 = r0.mo91522g(r11, r8)     // Catch:{ all -> 0x0691 }
            if (r1 == 0) goto L_0x068f
            if (r8 == 0) goto L_0x0682
            sb0.d r1 = rb0.C48009v0.Ax0()     // Catch:{ all -> 0x0691 }
            r7 = r3
            long r2 = r8.mo108759l2()     // Catch:{ all -> 0x0692 }
            sb0.c r1 = r1.mo73042a0(r2)     // Catch:{ all -> 0x0692 }
            boolean r2 = r1.mo73037p2()     // Catch:{ all -> 0x0692 }
            if (r2 == 0) goto L_0x0671
            java.lang.String r2 = r1.field_chatName     // Catch:{ all -> 0x0692 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x0692 }
            if (r2 == 0) goto L_0x066e
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0692 }
            r2 = 2131834964(0x7f113854, float:1.9303053E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x0692 }
            goto L_0x0684
        L_0x066e:
            java.lang.String r1 = r1.field_chatName     // Catch:{ all -> 0x0692 }
            goto L_0x0684
        L_0x0671:
            sb0.k r1 = rb0.C48009v0.Bx0()     // Catch:{ all -> 0x0692 }
            java.lang.String r2 = r8.mo108760m2()     // Catch:{ all -> 0x0692 }
            sb0.j r1 = r1.get(r2)     // Catch:{ all -> 0x0692 }
            if (r1 == 0) goto L_0x0683
            java.lang.String r1 = r1.field_userName     // Catch:{ all -> 0x0692 }
            goto L_0x0684
        L_0x0682:
            r7 = r3
        L_0x0683:
            r1 = 0
        L_0x0684:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x068d }
            if (r2 != 0) goto L_0x0694
            r3 = r27
            goto L_0x06d3
        L_0x068d:
            goto L_0x0694
        L_0x068f:
            r7 = r3
            goto L_0x0693
        L_0x0691:
            r7 = r3
        L_0x0692:
        L_0x0693:
            r1 = 0
        L_0x0694:
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r2 = r2.mo105907v()
            com.tencent.mm.storage.z1 r2 = r2.get(r11)
            if (r2 != 0) goto L_0x06a9
        L_0x06a2:
            r3 = r27
            r20 = r10
            r1 = 0
            goto L_0x078d
        L_0x06a9:
            r3 = 318767153(0x13000031, float:1.6155966E-27)
            if (r13 != r3) goto L_0x06c7
            boolean r3 = android.text.TextUtils.isEmpty(r27)
            if (r3 != 0) goto L_0x06c7
            di3.d r1 = di3.C86312j.m106911c(r20)
            gw0.b r1 = (gw0.C76073b) r1
            r3 = r27
            java.lang.String r1 = r1.mo94596JG(r3, r11)
            boolean r19 = android.text.TextUtils.isEmpty(r1)
            if (r19 != 0) goto L_0x06c9
            goto L_0x06d3
        L_0x06c7:
            r3 = r27
        L_0x06c9:
            boolean r19 = com.tencent.p014mm.storage.C72996z1.m85855z5(r26)
            if (r19 == 0) goto L_0x06d7
            java.lang.String r1 = r2.mo62909j3()
        L_0x06d3:
            r20 = r10
            goto L_0x078d
        L_0x06d7:
            boolean r19 = com.tencent.p014mm.storage.C72996z1.m85811N4(r26)
            if (r19 == 0) goto L_0x0747
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r20 = r2.mo101229G4()
            boolean r20 = com.tencent.p014mm.storage.RegionCodeDecoder.m124565r(r20)
            if (r20 == 0) goto L_0x071b
            java.lang.String r9 = r2.f149520W
            boolean r20 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r20 != 0) goto L_0x06f9
            r20 = r10
            goto L_0x070d
        L_0x06f9:
            di3.d r9 = di3.C86312j.m106911c(r5)
            d62.i r9 = (d62.C75339i) r9
            r20 = r10
            java.lang.String r10 = r2.f149518V
            java.lang.String r9 = r9.K90(r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x070e
        L_0x070d:
            goto L_0x0738
        L_0x070e:
            com.tencent.mm.storage.RegionCodeDecoder r9 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
            java.lang.String r2 = r2.mo101229G4()
            java.lang.String r9 = r9.mo135576l(r2)
            goto L_0x0738
        L_0x071b:
            r20 = r10
            di3.d r10 = di3.C86312j.m106911c(r5)
            d62.i r10 = (d62.C75339i) r10
            java.lang.String r2 = r2.f149518V
            java.lang.String r2 = r10.K90(r2)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r10 != 0) goto L_0x0731
            r9 = r2
            goto L_0x0738
        L_0x0731:
            r2 = 2131822875(0x7f11091b, float:1.9278534E38)
            java.lang.String r9 = r9.getString(r2)
        L_0x0738:
            r2 = 0
            r1[r2] = r9
            r2 = 2131822846(0x7f1108fe, float:1.9278475E38)
            java.lang.String r1 = r7.getString(r2, r1)
            java.lang.String r1 = r1.trim()
            goto L_0x078d
        L_0x0747:
            r20 = r10
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r26)
            if (r9 == 0) goto L_0x0779
            java.lang.String r9 = r2.getNickname()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0779
            java.lang.String r9 = r2.mo73969n2()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0779
            eb0.c r2 = eb0.C97625j3.m125812b()
            eb0.m2 r2 = r2.mo105902q()
            com.tencent.mm.storage.n1 r2 = (com.tencent.p014mm.storage.C44662n1) r2
            java.lang.String r2 = r2.getDisplayName(r11)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r9 != 0) goto L_0x078d
            r1 = r2
            goto L_0x078d
        L_0x0779:
            java.lang.String r9 = r2.mo62898f()
            if (r9 == 0) goto L_0x078d
            java.lang.String r9 = r2.mo62898f()
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x078d
            java.lang.String r1 = r2.mo62898f()
        L_0x078d:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x07aa
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r26)
            if (r1 == 0) goto L_0x07a2
            r1 = 2131823645(0x7f110c1d, float:1.9280096E38)
            java.lang.String r2 = r7.getString(r1)
            r1 = r2
            goto L_0x07aa
        L_0x07a2:
            r1 = 2131831457(0x7f112aa1, float:1.929594E38)
            java.lang.String r1 = r7.getString(r1)
            goto L_0x07b2
        L_0x07aa:
            com.tencent.mm.smiley.e r2 = com.tencent.p014mm.smiley.C96931e.m124499a()
            java.lang.String r1 = r2.mo135523c(r1)
        L_0x07b2:
            r2 = r1
            r1 = 0
            java.lang.String r9 = p875ci.C67379u.m79745j(r1, r11, r3, r13, r7)
            com.tencent.mm.smiley.e r1 = com.tencent.p014mm.smiley.C96931e.m124499a()
            java.lang.String r1 = r1.mo135523c(r9)
            java.lang.String r1 = de3.C75370s.m90378d(r1)
        L_0x07c4:
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r26)
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x0810
            int r19 = p645pj.C77095h.m93058a(r26)
            boolean r24 = p645pj.C77095h.m93061d(r26)
            if (r19 <= 0) goto L_0x0810
            r19 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r13 = 2131832632(0x7f112f38, float:1.9298323E38)
            java.lang.String r13 = r7.getString(r13)
            r10.append(r13)
            if (r24 != 0) goto L_0x0804
            r13 = 1
            if (r4 <= r13) goto L_0x07f0
            r24 = r6
            r6 = r1
            goto L_0x0808
        L_0x07f0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r24 = r6
            java.lang.String r6 = " "
            r13.append(r6)
            r13.append(r3)
            java.lang.String r6 = r13.toString()
            goto L_0x0808
        L_0x0804:
            r24 = r6
            r6 = r19
        L_0x0808:
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            goto L_0x0815
        L_0x0810:
            r24 = r6
            r19 = r10
            r6 = r1
        L_0x0815:
            if (r30 == 0) goto L_0x081a
            r1 = 0
            goto L_0x0941
        L_0x081a:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r10 != 0) goto L_0x0823
            r1 = r12
            goto L_0x0941
        L_0x0823:
            boolean r10 = r0.mo91522g(r11, r8)
            java.lang.String r12 = ": "
            r13 = 150(0x96, float:2.1E-43)
            if (r10 == 0) goto L_0x0882
            sb0.k r5 = rb0.C48009v0.Bx0()
            java.lang.String r8 = r8.mo108760m2()
            sb0.j r5 = r5.get(r8)
            if (r5 == 0) goto L_0x0861
            java.lang.String r8 = r5.field_userName
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0848
            java.lang.String r10 = r0.mo91521c(r1, r13)
            goto L_0x0863
        L_0x0848:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = r5.field_userName
            r8.append(r5)
            r8.append(r12)
            java.lang.String r5 = r0.mo91521c(r1, r13)
            r8.append(r5)
            java.lang.String r10 = r8.toString()
            goto L_0x0863
        L_0x0861:
            r10 = r19
        L_0x0863:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r5 == 0) goto L_0x087f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r12)
            java.lang.String r1 = r0.mo91521c(r1, r13)
            r5.append(r1)
            java.lang.String r10 = r5.toString()
        L_0x087f:
            r1 = 1
            goto L_0x0943
        L_0x0882:
            if (r9 != 0) goto L_0x089c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r12)
            java.lang.String r1 = r0.mo91521c(r1, r13)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            goto L_0x0941
        L_0x089c:
            java.lang.String r8 = ":\n"
            boolean r10 = r1.contains(r8)
            if (r10 == 0) goto L_0x093b
            java.lang.String r10 = eb0.C75604z3.m90849u(r1)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            boolean r19 = r1.contains(r8)
            if (r19 == 0) goto L_0x08bd
            int r5 = r1.indexOf(r8)
            r8 = 0
            java.lang.String r1 = r1.substring(r8, r5)
            goto L_0x0927
        L_0x08bd:
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r26)
            if (r8 == 0) goto L_0x08e3
            java.lang.String r1 = eb0.C75604z3.m90847s(r1)
            if (r1 == 0) goto L_0x08d8
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = r5.getDisplayName(r1)
            goto L_0x08ed
        L_0x08d8:
            di3.d r1 = di3.C86312j.m106911c(r5)
            d62.i r1 = (d62.C75339i) r1
            java.lang.String r1 = r1.getDisplayName(r11)
            goto L_0x08ed
        L_0x08e3:
            di3.d r1 = di3.C86312j.m106911c(r5)
            d62.i r1 = (d62.C75339i) r1
            java.lang.String r1 = r1.getDisplayName(r11)
        L_0x08ed:
            java.lang.String r5 = "@bottle"
            boolean r5 = r11.contains(r5)
            if (r5 == 0) goto L_0x090c
            android.content.res.Resources r1 = r7.getResources()
            r5 = 1
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r19 = java.lang.Integer.valueOf(r5)
            r21 = 0
            r8[r21] = r19
            r3 = 2131689496(0x7f0f0018, float:1.900801E38)
            java.lang.String r1 = r1.getQuantityString(r3, r5, r8)
            goto L_0x0927
        L_0x090c:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 == 0) goto L_0x091f
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r26)
            if (r3 == 0) goto L_0x091f
            r3 = 2131823645(0x7f110c1d, float:1.9280096E38)
            java.lang.String r1 = r7.getString(r3)
        L_0x091f:
            com.tencent.mm.smiley.e r3 = com.tencent.p014mm.smiley.C96931e.m124499a()
            java.lang.String r1 = r3.mo135523c(r1)
        L_0x0927:
            r13.append(r1)
            r13.append(r12)
            r3 = 150(0x96, float:2.1E-43)
            java.lang.String r1 = r0.mo91521c(r10, r3)
            r13.append(r1)
            java.lang.String r1 = r13.toString()
            goto L_0x0941
        L_0x093b:
            r3 = 150(0x96, float:2.1E-43)
            java.lang.String r1 = r0.mo91521c(r1, r3)
        L_0x0941:
            r10 = r1
            r1 = 0
        L_0x0943:
            if (r30 == 0) goto L_0x0952
            if (r9 == 0) goto L_0x094a
            r3 = r27
            goto L_0x0953
        L_0x094a:
            r3 = 2131833715(0x7f113373, float:1.930052E38)
            java.lang.String r3 = r7.getString(r3)
            goto L_0x0953
        L_0x0952:
            r3 = r10
        L_0x0953:
            r5 = 1
            if (r4 <= r5) goto L_0x097a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.res.Resources r6 = r7.getResources()
            r7 = 2131689497(0x7f0f0019, float:1.9008011E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r8[r9] = r5
            java.lang.String r4 = r6.getQuantityString(r7, r4, r8)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r6 = r1.toString()
            goto L_0x0981
        L_0x097a:
            if (r9 == 0) goto L_0x097e
            r6 = r3
            goto L_0x0981
        L_0x097e:
            if (r1 == 0) goto L_0x0981
            r6 = r10
        L_0x0981:
            r0.f193258b = r2
            r0.f193257a = r6
            r0.f193259c = r10
            r7 = -1
            goto L_0x0a0d
        L_0x098a:
            r24 = r6
            r20 = r10
            ci.u r0 = r14.f193245d
            android.content.Context r1 = r14.f193247f
            int r2 = r14.f193249h
            r7 = -1
            if (r2 != r7) goto L_0x099d
            int r2 = p645pj.C77095h.m93060c()
            r14.f193249h = r2
        L_0x099d:
            int r2 = r14.f193249h
            int r3 = r14.mo91520b()
            r0.getClass()
            if (r2 < 0) goto L_0x09a9
            goto L_0x09ad
        L_0x09a9:
            int r2 = p645pj.C77095h.m93060c()
        L_0x09ad:
            if (r3 < 0) goto L_0x09b0
            goto L_0x09b4
        L_0x09b0:
            int r3 = p645pj.C77095h.m93059b()
        L_0x09b4:
            r4 = 1
            int r2 = java.lang.Math.max(r4, r2)
            int r3 = java.lang.Math.max(r4, r3)
            android.content.res.Resources r5 = r1.getResources()
            r6 = 2131689498(0x7f0f001a, float:1.9008013E38)
            r8 = 2
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r12 = 0
            r10[r12] = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10[r4] = r3
            java.lang.String r2 = r5.getQuantityString(r6, r2, r10)
            r3 = 0
            int r4 = p645pj.C77095h.m93058a(r3)
            if (r4 <= 0) goto L_0x09f5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 2131832632(0x7f112f38, float:1.9298323E38)
            java.lang.String r4 = r1.getString(r4)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x09f5:
            r0.f193257a = r2
            r2 = 2131831457(0x7f112aa1, float:1.929594E38)
            java.lang.String r2 = r1.getString(r2)
            r0.f193258b = r2
            if (r30 == 0) goto L_0x0a04
            r4 = 0
            goto L_0x0a0b
        L_0x0a04:
            r2 = 2131833716(0x7f113374, float:1.9300522E38)
            java.lang.String r4 = r1.getString(r2)
        L_0x0a0b:
            r0.f193259c = r4
        L_0x0a0d:
            ci.a r0 = r14.f193246e
            boolean r1 = r14.f193251j
            if (r1 != 0) goto L_0x0a2d
            android.graphics.Bitmap r2 = r0.f193232a
            if (r2 == 0) goto L_0x0a2d
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r2 = r2.toString()
            r3 = 0
            r4[r3] = r2
            java.lang.String r2 = "MicroMsg.NotificationAvatar"
            java.lang.String r3 = "recycle bitmap:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            android.graphics.Bitmap r2 = r0.f193232a
            r2.recycle()
        L_0x0a2d:
            r8 = 0
            r0.f193232a = r8
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r1 == 0) goto L_0x0a5c
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85811N4(r26)
            if (r1 != 0) goto L_0x0a5c
            if (r2 == 0) goto L_0x0a59
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r26)
            if (r1 == 0) goto L_0x0a45
            goto L_0x0a59
        L_0x0a45:
            java.lang.Class<ln.i> r1 = p196ln.C76708i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.i r1 = (p196ln.C76708i) r1
            android.graphics.Bitmap r1 = r1.N50(r11)
            if (r1 != 0) goto L_0x0a54
            goto L_0x0a59
        L_0x0a54:
            android.graphics.Bitmap r4 = p875ci.C67372a.m79723a(r2, r1)
            goto L_0x0a5a
        L_0x0a59:
            r4 = r8
        L_0x0a5a:
            r0.f193232a = r4
        L_0x0a5c:
            bi.b r0 = p789bi.C67244b.C67246b.f193087a
            int r1 = r0.mo91395i(r11)
            if (r1 <= 0) goto L_0x0a66
            r10 = r1
            goto L_0x0a6c
        L_0x0a66:
            r1 = 1
            int r0 = r0.mo91397k(r11, r1)
            r10 = r0
        L_0x0a6c:
            ci.t r0 = r15.f194738a
            ci.c r1 = r0.f193243b
            int r2 = r1.f193234a
            ci.b r0 = r0.f193242a
            int r3 = r0.f193233a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r0[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r4 = 1
            r0[r4] = r1
            java.lang.String r1 = "default:%s id:%s"
            r4 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            ci.t r0 = r15.f194738a
            ci.d r1 = r0.f193244c
            android.content.Context r0 = r0.f193247f
            android.content.Intent r1 = r1.f193235a
            if (r1 != 0) goto L_0x0a9a
            r4 = r8
            goto L_0x0aa1
        L_0x0a9a:
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r10, r1, r4)
            r4 = r0
        L_0x0aa1:
            ci.t r0 = r15.f194738a
            ci.u r1 = r0.f193245d
            java.lang.String r5 = r1.f193258b
            java.lang.String r6 = r1.f193257a
            java.lang.String r9 = r1.f193259c
            ci.a r0 = r0.f193246e
            android.graphics.Bitmap r12 = r0.f193232a
            r0 = r15
            r1 = r18
            r13 = -1
            r7 = r9
            r9 = r8
            r13 = r22
            r8 = r12
            r12 = r9
            r9 = r26
            android.app.Notification r0 = r0.mo93226c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.tencent.mm.booter.notification.NotificationItem r1 = new com.tencent.mm.booter.notification.NotificationItem
            r1.<init>((int) r10, (java.lang.String) r11, (android.app.Notification) r0)
            r1.f194733i = r13
            int r0 = eb0.C45629t0.m50817d(r11, r12)
            r1.f194734j = r0
            ci.t r0 = r15.f194738a
            int r0 = r15.mo93224a(r1, r0)
            r1 = -1
            if (r0 != r1) goto L_0x0adb
            java.lang.String r0 = "invalidId"
            p285zh.C119114c.m167922g(r0)
            goto L_0x0b1b
        L_0x0adb:
            boolean r0 = p285zh.C119114c.f356684a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "noteAddMsgActionNotify: type="
            r0.append(r1)
            r1 = r28
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.NotifyPowerInspector"
            p285zh.C119114c.m167920e(r2, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0b1b
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r0 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            boolean r0 = r0.isBackground()
            if (r0 == 0) goto L_0x0b1b
            java.lang.String r0 = "showNotify"
            p285zh.C119114c.m167921f(r0)
            zh.c$$e r0 = p285zh.C119114c.f356699p
            boolean r2 = r0.mo183788b()
            if (r2 != 0) goto L_0x0b14
            boolean r2 = p285zh.C119114c.f356685b
            if (r2 != 0) goto L_0x0b1b
        L_0x0b14:
            java.lang.String r1 = java.lang.String.valueOf(r28)
            r0.mo183789c(r1)
        L_0x0b1b:
            com.tencent.mm.autogen.events.NewNotificationEvent r0 = new com.tencent.mm.autogen.events.NewNotificationEvent
            r0.<init>()
            com.tencent.mm.autogen.events.NewNotificationEvent$a r1 = r0.f78873d
            r1.f78874a = r11
            r2 = 1
            r2 = r20 ^ 1
            r1.f78876c = r2
            r2 = r17
            r1.f78877d = r2
            int r2 = eb0.C45629t0.m50817d(r11, r12)
            r1.f78875b = r2
            r0.publish()
        L_0x0b36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.notification.MMNotification.m80178d(com.tencent.mm.booter.notification.MMNotification, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    /* renamed from: m */
    public static int m80179m(C72963f4 f4Var) {
        Map<String, String> parseXml;
        int i = C45628s0.m50738C(f4Var.mo108768t()) ? 0 : 3;
        if (f4Var.mo108759l2() != -1 && C47984k.m53334h(f4Var.mo108768t())) {
            C48334c a0 = C48009v0.Ax0().mo73042a0(f4Var.mo108759l2());
            if (!a0.mo73037p2() && a0.mo73033l2(1)) {
                return i;
            }
        }
        String str = f4Var.f230724G;
        if (!Util.isNullOrNil(str) && (parseXml = XmlParser.parseXml(str, "msgsource", (String) null)) != null && !parseXml.isEmpty()) {
            try {
                int i2 = Util.getInt(parseXml.get(".msgsource.tips"), i);
                if ((i2 & 1) != 0 || (i2 & 2) == 0) {
                    return i2;
                }
                return 0;
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo93204a(C72963f4 f4Var) {
        C119114c.m167921f("notifyFirstNotification");
        if (f4Var != null) {
            if (f4Var.mo108769t2() == 1) {
                Log.m105929w("MicroMsg.MMNotification", "notifyFirst is sender , msgid:%d ", Long.valueOf(f4Var.mo108774y2()));
                C119114c.m167922g("isSender");
                return;
            }
            z3$$h w = C75604z3.m90851w(f4Var.f230724G);
            if (w == null || w.f222104k != 1) {
                int m = m80179m(f4Var);
                this.f194716c = f4Var;
                this.f194714a = f4Var.mo108768t();
                String content = f4Var.getContent();
                int type = f4Var.getType();
                this.f194717d = "";
                Log.m105925i("MicroMsg.MMNotification", "notifyFirst talker:%s msgid:%d type:%d tipsFlag:%d content:%s", this.f194714a, Long.valueOf(f4Var.mo108774y2()), Integer.valueOf(type), Integer.valueOf(m), Util.secPrint(content));
                if (!this.f194722i.mo93233a(this.f194714a, this.f194716c, m, false)) {
                    Log.m105928w("MicroMsg.MMNotification", "[no notificaion], preNotificationCheck");
                    return;
                }
                C119114c.m167921f("notifyMessage");
                this.f194724k.sendMessageDelayed(mo93217o(this.f194714a, content, type, m, 0), 200);
                return;
            }
            C119114c.m167922g("isLbs");
        }
    }

    /* renamed from: b */
    public void mo93205b(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Time time = new Time();
        time.setToNow();
        if (!C77091b.m93032n(time.hour, time.minute, MMApplicationContext.getContext())) {
            Log.m105924i("MiroMsg.NotificationUtil", "no shake & sound notification during background deactive time");
        } else {
            try {
                Context context = MMApplicationContext.getContext();
                boolean h = C77091b.m93026h();
                boolean b = C77091b.m93020b();
                Log.m105918d("MiroMsg.NotificationUtil", "shake " + h + "sound " + b);
                if (h) {
                    Log.m105924i("MiroMsg.NotificationUtil", "notification.shake:  notifyEngageRemind isShake~: true");
                    Util.shake(context, true);
                }
                if (b) {
                    Pair<Boolean, String> t = C77091b.m93038t();
                    C77689e0.m93685a(context, (String) t.second, ((Boolean) t.first).booleanValue());
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MiroMsg.NotificationUtil", e, "", new Object[0]);
            }
        }
        Intent intent = new Intent();
        intent.setClassName(MMApplicationContext.getPackageName(), MMApplicationContext.getSourcePackageName() + "." + "plugin." + "webview" + ".ui.tools.WebViewUI");
        intent.putExtra("rawUrl", str3);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.setFlags(872415232);
        Log.m105919d("MiroMsg.NotificationUtil", "bizFrom: %s, data: %s", str4, bundle);
        if (!(str4 == null || bundle == null)) {
            intent.putExtra("bizofstartfrom", str4);
            intent.putExtra("startwebviewparams", bundle);
        }
        PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 0, intent, 134217728);
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
        cVar.mo124390o((CharSequence) null);
        cVar.f258814z.when = System.currentTimeMillis();
        cVar.mo124383h(str);
        cVar.mo124382g(str2);
        cVar.f258795g = activity;
        Notification b2 = cVar.mo124378b();
        b2.icon = C0966R.C0969drawable.c9k;
        b2.flags |= 16;
        ((NotificationManager) MMApplicationContext.getContext().getSystemService("notification")).notify(i, b2);
    }

    /* renamed from: c */
    public void mo93206c(List<C72963f4> list) {
        C72963f4 f4Var;
        if (list == null || list.size() <= 0) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(list == null ? -1 : list.size());
            objArr[1] = Util.getStack();
            Log.m105929w("MicroMsg.MMNotification", "notifyOther newMsgList:%d :%s", objArr);
            return;
        }
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            f4Var = null;
            if (size < 0) {
                break;
            }
            f4Var = list.get(size);
            i = m80179m(f4Var);
            if (this.f194722i.mo93233a(f4Var.mo108768t(), f4Var, i, false)) {
                break;
            }
            size--;
        }
        int i2 = i;
        if (f4Var == null) {
            Log.m105928w("MicroMsg.MMNotification", "notifyOther msg == null");
            return;
        }
        this.f194717d = "";
        this.f194714a = f4Var.mo108768t();
        String content = f4Var.getContent();
        int type = f4Var.getType();
        this.f194716c = f4Var;
        Log.m105925i("MicroMsg.MMNotification", "notifyOther talker:%s msgid:%d type:%d tipsFlag:%d content:%s", this.f194714a, Long.valueOf(f4Var.mo108774y2()), Integer.valueOf(type), Integer.valueOf(i2), Util.secPrint(content));
        this.f194724k.sendMessageDelayed(mo93217o(this.f194714a, content, type, i2, 0), 200);
    }

    /* renamed from: e */
    public void mo93207e(int i) {
        C67845k.C67847b.f194757a.f194756a.getClass();
        C67244b bVar = C67244b.C67246b.f193087a;
        bVar.getClass();
        bVar.mo91393f(new C77604h(MMApplicationContext.getContext()), i);
    }

    /* renamed from: f */
    public void mo93208f(int i) {
        ArrayList arrayList;
        C67845k.C67847b.f194757a.f194756a.getClass();
        if (i != 0) {
            C67242a aVar = C67244b.C67246b.f193087a.f193086f;
            synchronized (aVar) {
                if (aVar.f193077d == null) {
                    aVar.mo91388i();
                }
                arrayList = new ArrayList();
                Iterator<C67242a.C67243a> it = aVar.iterator();
                while (it.hasNext()) {
                    C67242a.C67243a next = it.next();
                    if ((next.f193083i & i) != 0 && !arrayList.contains(Integer.valueOf(next.f193078d))) {
                        arrayList.add(Integer.valueOf(next.f193078d));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C77604h hVar = new C77604h(MMApplicationContext.getContext());
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C67244b.C67246b.f193087a.mo91393f(hVar, ((Integer) it4.next()).intValue());
                }
            }
        }
    }

    /* renamed from: g */
    public void mo93209g() {
        try {
            String string = MMApplicationContext.getContext().getSharedPreferences("notify_newfriend_prep", 0).getString("notify_newfriend_prep", (String) null);
            if (string != null) {
                for (String safeParseInt : string.split(",")) {
                    int safeParseInt2 = Util.safeParseInt(safeParseInt);
                    if (safeParseInt2 > 0) {
                        ((MMNotification) C97625j3.m125816f()).mo93207e(safeParseInt2);
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMNotification", e, "try cancel notification fail: %s", e.getMessage());
        }
    }

    public Looper getLooper() {
        return Looper.getMainLooper();
    }

    /* renamed from: h */
    public void mo93211h(String str) {
        Log.m105926v("MicroMsg.MMNotification", "cancel notification talker:" + str + " last talker:" + null + "  curChattingTalker:" + this.f194715b);
        if (this.f194719f) {
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str);
            if (j != null && j.mo108786G2() != 0) {
                this.f194719f = false;
                this.f194722i.f194756a.mo93232b();
            } else if (ConversationUnreadHelper.m89354b() == 0) {
                this.f194719f = false;
                this.f194722i.f194756a.mo93232b();
            }
        }
    }

    /* renamed from: i */
    public void mo93212i(boolean z) {
        this.f194718e = z;
        Log.m105925i("MicroMsg.MMNotification", "set hideNotification: %s", Boolean.valueOf(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        r2 = r2 & (!r0.mo91514c("", (com.tencent.p014mm.storage.C72963f4) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r2 = r2 & r0.mo91518j(0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        r12 = r12 & (!r0.mo91516f(""));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        r3 = r3 & (!r0.mo91519k("", false, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r3 = r3 & (!r0.mo91514c("", (com.tencent.p014mm.storage.C72963f4) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r2 = r2 & (!r0.mo91516f(""));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        r2 = r2 & (!r0.mo91519k("", false, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        r2 = r2 & (!r0.mo91513b(""));
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo93213j(android.app.Notification r15) {
        /*
            r14 = this;
            ci.b r6 = new ci.b
            r6.<init>()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ci.e r0 = new ci.e
            r0.<init>()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = p875ci.C67376e.m79727h(r2)
            java.lang.String r3 = "MicroMsg.Notification.Silent.Handle"
            r4 = 0
            r5 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            r8 = 0
            r9 = 0
            java.lang.String r11 = ""
            if (r2 != 0) goto L_0x0026
            goto L_0x0067
        L_0x0026:
            boolean r12 = r0.mo91516f(r11)
            r12 = r12 ^ r5
            r2 = r2 & r12
            if (r2 != 0) goto L_0x002f
            goto L_0x0067
        L_0x002f:
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r12[r4] = r7
            java.lang.String r13 = "check is Service Request Sound: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r12)
            r2 = r2 & 1
            if (r2 != 0) goto L_0x003d
            goto L_0x0067
        L_0x003d:
            boolean r12 = r0.mo91519k(r11, r4, r9)
            r12 = r12 ^ r5
            r2 = r2 & r12
            if (r2 != 0) goto L_0x0046
            goto L_0x0067
        L_0x0046:
            boolean r12 = r0.mo91513b(r11)
            r12 = r12 ^ r5
            r2 = r2 & r12
            if (r2 != 0) goto L_0x004f
            goto L_0x0067
        L_0x004f:
            boolean r12 = r0.mo91514c(r11, r8)
            r12 = r12 ^ r5
            r2 = r2 & r12
            if (r2 != 0) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            boolean r12 = r0.mo91518j(r4, r11)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x0060
            goto L_0x0067
        L_0x0060:
            boolean r0 = r0.mo91517i()
            r0 = r0 ^ r5
            r0 = r0 & r2
            r2 = r0
        L_0x0067:
            ci.e r0 = new ci.e
            r0.<init>()
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r12 = p875ci.C67376e.m79725e(r12)
            if (r12 != 0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            boolean r13 = r0.mo91516f(r11)
            r13 = r13 ^ r5
            r12 = r12 & r13
            if (r12 != 0) goto L_0x0081
        L_0x007f:
            r3 = r12
            goto L_0x00a8
        L_0x0081:
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r4] = r7
            java.lang.String r7 = "check is Service Request Shake: %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r13)
            r3 = r5 & r12
            if (r3 != 0) goto L_0x008f
            goto L_0x00a8
        L_0x008f:
            boolean r4 = r0.mo91519k(r11, r4, r9)
            r4 = r4 ^ r5
            r3 = r3 & r4
            if (r3 != 0) goto L_0x0098
            goto L_0x00a8
        L_0x0098:
            boolean r4 = r0.mo91514c(r11, r8)
            r4 = r4 ^ r5
            r3 = r3 & r4
            if (r3 != 0) goto L_0x00a1
            goto L_0x00a8
        L_0x00a1:
            boolean r0 = r0.mo91517i()
            r0 = r0 ^ r5
            r0 = r0 & r3
            r3 = r0
        L_0x00a8:
            java.lang.String r5 = ""
            r0 = r6
            r4 = r15
            r0.mo91511a(r1, r2, r3, r4, r5)
            int r15 = r6.f193233a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.notification.MMNotification.mo93213j(android.app.Notification):int");
    }

    /* renamed from: k */
    public int mo93214k(Notification notification, boolean z) {
        C67845k kVar = C67845k.C67847b.f194757a;
        return kVar.f194756a.mo93224a(new NotificationItem(-1, notification, z), (C67378t) null);
    }

    /* renamed from: l */
    public void mo93215l(int i, Notification notification, boolean z) {
        C67845k kVar = C67845k.C67847b.f194757a;
        kVar.f194756a.mo93224a(new NotificationItem(i, notification, z), (C67378t) null);
    }

    /* renamed from: n */
    public void mo93216n(String str, int i) {
        Class<ChattingUI> cls = ChattingUI.class;
        try {
            Log.m105929w("showSendMsgFailNotification fromUserName:%s msgType:%d", str, Integer.valueOf(i));
            if (!cls.getName().equals(((ActivityManager) this.f194721h.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1).get(0).topActivity.getClassName())) {
                Intent intent = new Intent(this.f194721h, cls);
                intent.putExtra("nofification_type", "pushcontent_notification");
                intent.putExtra("Intro_Is_Muti_Talker", true);
                intent.putExtra("Chat_User", str);
                intent.putExtra("MainUI_User_Last_Msg_Type", i);
                intent.addFlags(536870912);
                intent.addFlags(67108864);
                PendingIntent activity = PendingIntent.getActivity(this.f194721h, 35, intent, 1073741824);
                C90116e.C90121c cVar = new C90116e.C90121c(this.f194721h, C78382a.m94651c());
                cVar.mo124390o((CharSequence) null);
                cVar.f258814z.when = System.currentTimeMillis();
                cVar.mo124383h(this.f194721h.getString(C0966R.string.a25));
                cVar.mo124382g(this.f194721h.getString(C0966R.string.gsa));
                cVar.f258795g = activity;
                Notification b = cVar.mo124378b();
                b.icon = C0966R.C0969drawable.c9k;
                b.defaults |= 1;
                b.flags |= 16;
                mo93215l(35, b, true);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMNotification", e, "", new Object[0]);
        }
    }

    /* renamed from: o */
    public final Message mo93217o(String str, String str2, int i, int i2, int i3) {
        Log.m105919d("MicroMsg.MMNotification", "[wrapMessage] talker:%s msgType:%s stack:%s", str, Integer.valueOf(i), Util.getStack().toString());
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putString("notification.show.talker", str);
        bundle.putString("notification.show.message.content", str2);
        bundle.putInt("notification.show.message.type", i);
        bundle.putInt("notification.show.tipsflag", i2);
        obtain.setData(bundle);
        obtain.what = i3;
        return obtain;
    }
}
