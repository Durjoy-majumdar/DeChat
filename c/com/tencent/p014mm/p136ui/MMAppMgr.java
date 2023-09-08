package com.tencent.p014mm.p136ui;

import al3.C0086a;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.tencent.mars.Mars;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C0988g1;
import com.tencent.p014mm.app.C17667i1;
import com.tencent.p014mm.app.C67649h1;
import com.tencent.p014mm.app.C80595i;
import com.tencent.p014mm.autogen.events.BackupCoreResetEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.booter.C28862c;
import com.tencent.p014mm.booter.C67852y;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.service.C116024c;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C116734h6;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import org.xwalk.core.XWalkEnvironment;
import p003ay.C0235b;
import qo3.C77398g;

/* renamed from: com.tencent.mm.ui.MMAppMgr */
public final class MMAppMgr {

    /* renamed from: d */
    public static StringBuffer f214415d;

    /* renamed from: e */
    public static long f214416e;

    /* renamed from: a */
    public String f214417a;

    /* renamed from: b */
    public long f214418b;

    /* renamed from: c */
    public Receiver f214419c;

    /* renamed from: com.tencent.mm.ui.MMAppMgr$Receiver */
    public static class Receiver extends BroadcastReceiver {

        /* renamed from: a */
        public MMAppMgr f214420a;

        /* renamed from: com.tencent.mm.ui.MMAppMgr$Receiver$a */
        public class C73076a implements Runnable {
            public C73076a(Receiver receiver) {
            }

            public void run() {
                MMAppMgr.m85992l();
            }
        }

        /* renamed from: com.tencent.mm.ui.MMAppMgr$Receiver$b */
        public class C73077b implements Runnable {
            public C73077b(Receiver receiver) {
            }

            public void run() {
                MMAppMgr.m85992l();
            }
        }

        public Receiver(MMAppMgr mMAppMgr) {
            this.f214420a = mMAppMgr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:123:0x034b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r28, android.content.Intent r29) {
            /*
                r27 = this;
                r0 = r27
                r1 = r29
                if (r1 != 0) goto L_0x0007
                return
            L_0x0007:
                eb0.j3 r2 = eb0.C97625j3.f286396b
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x000f
                r2 = 1
                goto L_0x0010
            L_0x000f:
                r2 = 0
            L_0x0010:
                if (r2 != 0) goto L_0x03a1
                boolean r2 = f40.C86718e.f251744t
                if (r2 == 0) goto L_0x0018
                goto L_0x03a1
            L_0x0018:
                java.lang.String r2 = r29.getAction()
                java.lang.String r5 = "com.tencent.mm.ui.ACTION_ACTIVE"
                boolean r5 = r5.equals(r2)
                r6 = 2
                java.lang.String r7 = "MicroMsg.MMAppMgr"
                java.lang.String r8 = "process_is_mm"
                java.lang.String r9 = "process_id"
                if (r5 == 0) goto L_0x0063
                boolean r2 = r1.getBooleanExtra(r8, r3)
                if (r2 != 0) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                int r2 = r1.getIntExtra(r9, r3)
                int r5 = android.os.Process.myPid()
                if (r2 != r5) goto L_0x003e
            L_0x003c:
                r2 = 1
                goto L_0x003f
            L_0x003e:
                r2 = 0
            L_0x003f:
                if (r2 != 0) goto L_0x005d
                java.lang.Object[] r2 = new java.lang.Object[r6]
                int r1 = r1.getIntExtra(r9, r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r3] = r1
                int r1 = android.os.Process.myPid()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r4] = r1
                java.lang.String r1 = "onreceive active process changed old: %d, new: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r1, r2)
                return
            L_0x005d:
                com.tencent.mm.ui.MMAppMgr r2 = r0.f214420a
                com.tencent.p014mm.p136ui.MMAppMgr.m85981a(r2, r1, r4)
                return
            L_0x0063:
                java.lang.String r5 = "com.tencent.mm.ui.ACTION_DEACTIVE"
                boolean r5 = r5.equals(r2)
                r10 = 800(0x320, float:1.121E-42)
                r11 = 0
                if (r5 == 0) goto L_0x0121
                boolean r2 = r1.getBooleanExtra(r8, r3)
                if (r2 != 0) goto L_0x0076
                goto L_0x0080
            L_0x0076:
                int r2 = r1.getIntExtra(r9, r3)
                int r5 = android.os.Process.myPid()
                if (r2 != r5) goto L_0x0082
            L_0x0080:
                r2 = 1
                goto L_0x0083
            L_0x0082:
                r2 = 0
            L_0x0083:
                if (r2 != 0) goto L_0x00a1
                java.lang.Object[] r2 = new java.lang.Object[r6]
                int r1 = r1.getIntExtra(r9, r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r3] = r1
                int r1 = android.os.Process.myPid()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r4] = r1
                java.lang.String r1 = "onreceive deactive process changed old: %d, new: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r1, r2)
                return
            L_0x00a1:
                long r4 = com.tencent.p014mm.booter.C67852y.f194759a
                int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r2 == 0) goto L_0x00b3
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r4)
                r6 = 3600000(0x36ee80, double:1.7786363E-317)
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 >= 0) goto L_0x00b3
                goto L_0x0100
            L_0x00b3:
                com.tencent.mm.storage.u1 r2 = eb0.C97625j3.m125818h()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r5 = 37
                java.lang.Object r2 = r2.mo119661b(r5, r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                int r4 = qe3.C89625d.f257841g
                if (r4 == r2) goto L_0x00e9
                com.tencent.mm.storage.u1 r4 = eb0.C97625j3.m125818h()
                int r6 = qe3.C89625d.f257841g
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r4.mo119664f(r5, r6)
                com.tencent.mm.sdk.platformtools.MMHandler r4 = new com.tencent.mm.sdk.platformtools.MMHandler
                android.os.Looper r5 = android.os.Looper.getMainLooper()
                r4.<init>((android.os.Looper) r5)
                com.tencent.mm.booter.w r5 = new com.tencent.mm.booter.w
                r5.<init>(r2)
                r4.post(r5)
            L_0x00e9:
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                com.tencent.p014mm.booter.C67852y.f194759a = r4
                com.tencent.mm.sdk.platformtools.MMHandler r2 = new com.tencent.mm.sdk.platformtools.MMHandler
                android.os.Looper r4 = android.os.Looper.getMainLooper()
                r2.<init>((android.os.Looper) r4)
                com.tencent.mm.booter.x r4 = new com.tencent.mm.booter.x
                r4.<init>()
                r2.post(r4)
            L_0x0100:
                com.tencent.mm.ui.MMAppMgr r2 = r0.f214420a
                com.tencent.p014mm.p136ui.MMAppMgr.m85981a(r2, r1, r3)
                java.lang.StringBuffer r1 = com.tencent.p014mm.p136ui.MMAppMgr.f214415d
                if (r1 == 0) goto L_0x0120
                int r1 = r1.length()
                if (r1 <= r10) goto L_0x0120
                com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>((android.os.Looper) r2)
                com.tencent.mm.ui.MMAppMgr$Receiver$a r2 = new com.tencent.mm.ui.MMAppMgr$Receiver$a
                r2.<init>(r0)
                r1.post(r2)
            L_0x0120:
                return
            L_0x0121:
                java.lang.String r5 = "com.tencent.mm.ui.ACTION_ABTEST"
                boolean r2 = r5.equals(r2)
                if (r2 == 0) goto L_0x0175
                com.tencent.mm.ui.MMAppMgr r2 = r0.f214420a
                r2.getClass()
                java.lang.String r2 = "content"
                java.lang.String r1 = r1.getStringExtra(r2)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 == 0) goto L_0x0140
                java.lang.String r1 = "dealWithClickTestCaseStream case id is null, broadcast should set this intent flag"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
                goto L_0x0159
            L_0x0140:
                java.lang.StringBuffer r2 = com.tencent.p014mm.p136ui.MMAppMgr.f214415d
                if (r2 != 0) goto L_0x014b
                java.lang.StringBuffer r2 = new java.lang.StringBuffer
                r2.<init>(r10)
                com.tencent.p014mm.p136ui.MMAppMgr.f214415d = r2
            L_0x014b:
                java.lang.StringBuffer r2 = com.tencent.p014mm.p136ui.MMAppMgr.f214415d
                r2.append(r1)
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r2[r3] = r1
                java.lang.String r1 = "cpan content: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r2)
            L_0x0159:
                java.lang.StringBuffer r1 = com.tencent.p014mm.p136ui.MMAppMgr.f214415d
                if (r1 == 0) goto L_0x0174
                int r1 = r1.length()
                if (r1 <= r10) goto L_0x0174
                com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>((android.os.Looper) r2)
                com.tencent.mm.ui.MMAppMgr$Receiver$b r2 = new com.tencent.mm.ui.MMAppMgr$Receiver$b
                r2.<init>(r0)
                r1.post(r2)
            L_0x0174:
                return
            L_0x0175:
                java.lang.String r2 = r29.getAction()
                java.lang.String r5 = "com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE"
                boolean r2 = r2.equals(r5)
                r5 = 3
                if (r2 == 0) goto L_0x026e
                java.lang.String r2 = "intent_extra_is_silence_stat"
                boolean r2 = r1.getBooleanExtra(r2, r3)
                java.lang.String r8 = "intent_extra_opcode"
                if (r2 != 0) goto L_0x01ba
                int r2 = r1.getIntExtra(r8, r3)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "incremental_update = "
                r8.append(r9)
                r8.append(r2)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
                boolean r8 = eb0.C97625j3.m125811a()
                if (r8 == 0) goto L_0x0223
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 10328(0x2858, float:1.4473E-41)
                java.lang.Object[] r10 = new java.lang.Object[r4]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r10[r3] = r2
                r8.mo160131h(r9, r10)
                goto L_0x0223
            L_0x01ba:
                int r2 = r1.getIntExtra(r8, r3)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "silence_update_stat = "
                r8.append(r9)
                r8.append(r2)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
                boolean r8 = eb0.C97625j3.m125811a()
                if (r8 == 0) goto L_0x0223
                r8 = 11147(0x2b8b, float:1.562E-41)
                if (r2 != r6) goto L_0x01f6
                java.lang.String r9 = "intent_extra_install_dialog_times"
                int r9 = r1.getIntExtra(r9, r3)
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r13 = new java.lang.Object[r6]
                java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
                r13[r3] = r14
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r13[r4] = r9
                r10.mo160131h(r8, r13)
                goto L_0x0203
            L_0x01f6:
                com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r10 = new java.lang.Object[r4]
                java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
                r10[r3] = r13
                r9.mo160131h(r8, r10)
            L_0x0203:
                r8 = 4
                if (r2 != r8) goto L_0x0223
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r9 = "update_config_prefs"
                android.content.SharedPreferences r2 = r2.getSharedPreferences(r9, r8)
                java.lang.String r9 = "update_downloaded_pack_update_type"
                int r2 = r2.getInt(r9, r5)
                if (r2 != r8) goto L_0x0223
                com.tencent.mm.pluginsdk.model.app.b r2 = com.tencent.p014mm.pluginsdk.model.app.C72682b.m85000c()
                if (r2 == 0) goto L_0x0223
                r2.mo100143d()
            L_0x0223:
                java.lang.String r2 = "intent_extra_flow_stat_upstream"
                long r8 = r1.getLongExtra(r2, r11)
                java.lang.String r2 = "intent_extra_flow_stat_downstream"
                long r13 = r1.getLongExtra(r2, r11)
                java.lang.String r2 = "intent_extra_flow_stat_is_wifi"
                boolean r1 = r1.getBooleanExtra(r2, r3)
                boolean r2 = eb0.C97625j3.m125811a()
                if (r2 == 0) goto L_0x026d
                int r2 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r2 != 0) goto L_0x0243
                int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r2 == 0) goto L_0x026d
            L_0x0243:
                java.lang.Object[] r2 = new java.lang.Object[r5]
                java.lang.Long r5 = java.lang.Long.valueOf(r8)
                r2[r3] = r5
                java.lang.Long r5 = java.lang.Long.valueOf(r13)
                r2[r4] = r5
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                r2[r6] = r4
                java.lang.String r4 = "silence_update_flow_stat upstream %s downstream %s isWifi %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r4, r2)
                if (r1 == 0) goto L_0x0266
                int r1 = (int) r13
                long r1 = (long) r1
                int r4 = (int) r8
                long r4 = (long) r4
                com.tencent.p014mm.modelstat.C114749s.m161433b(r1, r4, r3)
                goto L_0x026d
            L_0x0266:
                int r1 = (int) r13
                long r1 = (long) r1
                int r4 = (int) r8
                long r4 = (long) r4
                com.tencent.p014mm.modelstat.C114749s.m161432a(r1, r4, r3)
            L_0x026d:
                return
            L_0x026e:
                java.lang.String r2 = r29.getAction()
                java.lang.String r8 = "com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP"
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0280
                r2 = r28
                com.tencent.p014mm.p136ui.MMAppMgr.m85985e(r2, r4)
                return
            L_0x0280:
                java.lang.String r2 = r29.getAction()
                java.lang.String r8 = "MINIQB_OPEN_RET"
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x039b
                java.lang.String r2 = "op_type"
                java.lang.String r2 = r1.getStringExtra(r2)
                java.lang.String r8 = "NOTIFY_RET"
                boolean r8 = r8.equals(r2)
                if (r8 == 0) goto L_0x02a7
                java.lang.Class<wm.c> r2 = p262wm.C22921c.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                wm.c r2 = (p262wm.C22921c) r2
                r2.mo35888ct(r1)
                goto L_0x039a
            L_0x02a7:
                java.lang.String r8 = "SEND_TO_FRIENDS"
                boolean r2 = r8.equals(r2)
                if (r2 == 0) goto L_0x039a
                java.lang.String r2 = "onReceive SEND_TO_FRIENDS"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                boolean r2 = f40.C86709a0.m107522a()
                if (r2 != 0) goto L_0x02c0
                java.lang.String r1 = "onReceive SEND_TO_FRIENDS, account not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
                return
            L_0x02c0:
                java.lang.String r2 = "file_path"
                java.lang.String r2 = r1.getStringExtra(r2)
                java.lang.String r8 = "file_name"
                java.lang.String r8 = r1.getStringExtra(r8)
                java.lang.String r9 = "to_user"
                java.lang.String r9 = r1.getStringExtra(r9)
                java.lang.String r10 = "send_text"
                java.lang.String r10 = r1.getStringExtra(r10)
                java.lang.String r13 = "forward_msgid"
                long r11 = r1.getLongExtra(r13, r11)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r1 != 0) goto L_0x0395
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r1 != 0) goto L_0x0395
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r1 == 0) goto L_0x02f3
                goto L_0x0395
            L_0x02f3:
                java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106454o(r2)     // Catch:{ Exception -> 0x0311 }
                java.lang.String r13 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85067i()     // Catch:{ Exception -> 0x0311 }
                java.lang.String r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r13, r8, r1)     // Catch:{ Exception -> 0x0311 }
                com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r1)     // Catch:{ Exception -> 0x0310 }
                java.lang.String r13 = "mmappmgr send old path[%s], title[%s] attachPath[%s]"
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0310 }
                r5[r3] = r2     // Catch:{ Exception -> 0x0310 }
                r5[r4] = r8     // Catch:{ Exception -> 0x0310 }
                r5[r6] = r1     // Catch:{ Exception -> 0x0310 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r5)     // Catch:{ Exception -> 0x0310 }
                goto L_0x0312
            L_0x0310:
                r2 = r1
            L_0x0311:
                r1 = r2
            L_0x0312:
                com.tencent.mm.opensdk.modelmsg.WXFileObject r2 = new com.tencent.mm.opensdk.modelmsg.WXFileObject
                r2.<init>()
                r2.setFilePath(r1)
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
                r1.<init>()
                r1.mediaObject = r2
                r1.title = r8
                r1.description = r8
                java.lang.String r2 = ","
                java.lang.String[] r2 = r9.split(r2)
                java.util.ArrayList r2 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r2)
                java.lang.Class<f62.k0> r4 = f62.C75700k0.class
                k40.a r4 = f40.C86709a0.m107533q(r4)
                f62.k0 r4 = (f62.C75700k0) r4
                g62.l r4 = r4.mo96095LE()
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
                com.tencent.mm.storage.f4 r4 = r4.b00(r11)
                java.util.Iterator r2 = r2.iterator()
            L_0x0345:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x039a
                java.lang.Object r5 = r2.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Class<oo.h> r6 = p215oo.C77032h.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                oo.h r6 = (p215oo.C77032h) r6
                r7 = 5
                r6.setScene(r7)
                r17 = 3
                r18 = 0
                r23 = 0
                long r6 = r4.mo108774y2()
                java.lang.String r24 = java.lang.String.valueOf(r6)
                java.lang.String r25 = r4.mo108768t()
                r26 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                java.lang.String r14 = ""
                java.lang.String r15 = ""
                r13 = r1
                r16 = r5
                com.tencent.p014mm.pluginsdk.model.app.C72695v.m85051D(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r6 != 0) goto L_0x0345
                d62.j r6 = d62.C7250m.m7431a()
                int r7 = eb0.C45628s0.m50810y(r5)
                r6.mo136257Tm(r5, r10, r7, r3)
                goto L_0x0345
            L_0x0395:
                java.lang.String r1 = "onReceive SEND_TO_FRIENDS, param empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            L_0x039a:
                return
            L_0x039b:
                java.lang.String r1 = "unknown broadcast action"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            L_0x03a1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MMAppMgr.Receiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.MMAppMgr$a */
    public class C73078a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f214421d;

        public C73078a(Activity activity) {
            this.f214421d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Activity activity = this.f214421d;
            C86709a0.m107528h().f251724a.f251795g.mo1181g(true);
            Mars.onSingalCrash(0);
            MMNativeJpeg.Destroy();
            C67852y.m80218c("mm_proc_startup");
            C67852y.m80218c("push_proc_startup");
            if (!(C97625j3.m125815e() == null || C97625j3.m125815e().f256809d == null)) {
                C97625j3.m125815e().f256809d.mo55482l3(true);
            }
            Intent intent = new Intent().setClass(activity, LauncherUI.class);
            intent.addFlags(32768);
            intent.putExtra("absolutely_exit_pid", Process.myPid());
            intent.putExtra("kill_service", true);
            if (!(activity instanceof Activity)) {
                intent.addFlags(268435456);
            } else {
                activity.finish();
            }
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/MMAppMgr", "exitApplicationFromSplash", "(Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/ui/MMAppMgr", "exitApplicationFromSplash", "(Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.MMAppMgr", th, "[-] Fail to start launcherUI in suicide.", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MMAppMgr$b */
    public class C73079b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f214422d;

        public C73079b(Activity activity) {
            this.f214422d = activity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f214422d.onKeyDown(4, new KeyEvent(0, 4));
        }
    }

    /* renamed from: com.tencent.mm.ui.MMAppMgr$c */
    public class C73080c implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C97625j3.m125812b().mo105906u().mo119676J(16385, Boolean.valueOf(!z));
        }
    }

    /* renamed from: com.tencent.mm.ui.MMAppMgr$d */
    public class C73081d extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ Activity f214423d;

        public C73081d(Activity activity) {
            this.f214423d = activity;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMAppMgr$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            Util.jump(this.f214423d, WeChatBrands.Wordings.translate(MMApplicationContext.getResources().getString(C0966R.string.g5g, new Object[]{LocaleUtil.getCurrentLanguage(this.f214423d), LocaleUtil.getCurrentCountryCode(), "setting", 0, 0})));
            C117292a.m165361g(this, "com/tencent/mm/ui/MMAppMgr$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f214423d.getResources().getColor(C0966R.color.a1d));
        }
    }

    /* renamed from: com.tencent.mm.ui.MMAppMgr$e */
    public class C73082e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CheckBox f214424d;

        /* renamed from: e */
        public final /* synthetic */ SharedPreferences f214425e;

        /* renamed from: f */
        public final /* synthetic */ Activity f214426f;

        /* renamed from: g */
        public final /* synthetic */ DialogInterface.OnClickListener f214427g;

        public C73082e(CheckBox checkBox, SharedPreferences sharedPreferences, Activity activity, DialogInterface.OnClickListener onClickListener) {
            this.f214424d = checkBox;
            this.f214425e = sharedPreferences;
            this.f214426f = activity;
            this.f214427g = onClickListener;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f214424d.isChecked()) {
                SharedPreferences.Editor edit = this.f214425e.edit();
                edit.putBoolean("gprs_alert", false);
                edit.commit();
            }
            ChannelUtil.isShowingGprsAlert = false;
            dialogInterface.dismiss();
            MMAppMgr.m85982b(this.f214426f);
            DialogInterface.OnClickListener onClickListener = this.f214427g;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: a */
    public static void m85981a(MMAppMgr mMAppMgr, Intent intent, boolean z) {
        mMAppMgr.getClass();
        String stringExtra = intent.getStringExtra("classname");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105924i("MicroMsg.MMAppMgr", "dealWithClickStream className is null, broadcast should set this intent flag");
            return;
        }
        String substring = stringExtra.substring(stringExtra.lastIndexOf(".") + 1);
        CrashReportFactory.setCurrentActivity(substring);
        if (f214415d == null) {
            f214415d = new StringBuffer(800);
            f214416e = Util.nowSecond();
            f214415d.append("start:");
            f214415d.append(Util.nowSecond());
            f214415d.append("|");
        }
        if (z) {
            if ("desktop".equals(mMAppMgr.f214417a)) {
                f214415d.append("desktop:");
                f214415d.append(Util.ticksToNow(mMAppMgr.f214418b) + 800);
                f214415d.append("|");
            }
            mMAppMgr.f214418b = Util.currentTicks();
            mMAppMgr.f214417a = substring;
        } else {
            StringBuffer stringBuffer = f214415d;
            stringBuffer.append(mMAppMgr.f214417a + XVFSFile.PATH_SEPARATOR);
            f214415d.append(Util.ticksToNow(mMAppMgr.f214418b));
            f214415d.append("|");
        }
        Log.m105925i("MicroMsg.MMAppMgr", "dkact classname %s, isAcitvity %b", substring, Boolean.valueOf(z));
    }

    /* renamed from: b */
    public static void m85982b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        if (!sharedPreferences.getBoolean("Main_ShortCut", false)) {
            Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            intent.putExtra("android.intent.extra.shortcut.NAME", context.getString(C0966R.string.g55));
            intent.putExtra("duplicate", false);
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addCategory("android.intent.category.LAUNCHER");
            String packageName = context.getPackageName();
            intent2.setComponent(new ComponentName(packageName, MMApplicationContext.getSourcePackageName() + ".ui.LauncherUI"));
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, C0966R.C0969drawable.icon));
            intent.putExtra("shortcut_icon_resource_id", C0966R.C0969drawable.icon);
            intent.putExtra("shortcut_is_adaptive_icon", true);
            intent.putExtra("is_main_shortcut", true);
            ((C0235b) C86312j.m106911c(C0235b.class)).rb0(context, intent);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("Main_ShortCut", true);
            edit.commit();
        }
    }

    /* renamed from: c */
    public static void m85983c(String str) {
        ((MMNotification) C97625j3.m125816f()).mo93211h(str);
    }

    /* renamed from: d */
    public static void m85984d(Context context) {
        m85985e(context, true);
    }

    /* renamed from: e */
    public static void m85985e(Context context, boolean z) {
        Log.printInfoStack("MicroMsg.MMAppMgr", "exitApplication", new Object[0]);
        C86709a0.m107528h().f251724a.f251795g.mo1181g(z);
        Mars.onSingalCrash(0);
        MMNativeJpeg.Destroy();
        C67852y.m80218c("mm_proc_startup");
        C67852y.m80218c("push_proc_startup");
        if (!(C97625j3.m125815e() == null || C97625j3.m125815e().f256809d == null)) {
            C97625j3.m125815e().f256809d.mo55482l3(z);
        }
        Intent intent = new Intent().setClass(context, LauncherUI.class);
        intent.addFlags(67108864);
        intent.putExtra("absolutely_exit_pid", Process.myPid());
        intent.putExtra("kill_service", z);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMAppMgr", th, "[-] Fail to start launcherUI in suicide.", new Object[0]);
        }
    }

    /* renamed from: f */
    public static void m85986f() {
        MMNotification mMNotification = (MMNotification) C97625j3.m125816f();
        mMNotification.getClass();
        Log.m105918d("MicroMsg.MMNotification", "force cancelNotification");
        mMNotification.f194719f = false;
        mMNotification.f194722i.f194756a.mo93232b();
    }

    /* renamed from: g */
    public static void m85987g() {
        m85988h(true);
    }

    /* renamed from: h */
    public static void m85988h(boolean z) {
        Log.m105929w("MicroMsg.MMAppMgr", "killProcess thread:%s proc:%d stack:%s, killService:%b", Thread.currentThread().getName(), Integer.valueOf(Process.myPid()), Util.getStack(), Boolean.valueOf(z));
        if (z) {
            m85989i();
        }
        new BackupCoreResetEvent().publish();
        LogoutEvent logoutEvent = new LogoutEvent();
        LogoutEvent.C28774a aVar = logoutEvent.f78863d;
        aVar.getClass();
        aVar.f78864a = 2;
        logoutEvent.publish();
        m85992l();
        if (z) {
            C86718e.f251746v = Util.getStack().toString();
            C86709a0.m107528h().mo121100o();
        }
        Log.appenderClose();
        Mars.onSingalCrash(0);
        Context context = MMApplicationContext.getContext();
        String[] strArr = {MMApplicationContext.getApplicationId() + ":recovery", MMApplicationContext.getApplicationId() + ":support", MMApplicationContext.getApplicationId() + ":tools", MMApplicationContext.getApplicationId() + ":appbrand0", MMApplicationContext.getApplicationId() + ":appbrand1", MMApplicationContext.getApplicationId() + ":appbrand2", MMApplicationContext.getApplicationId() + ":appbrand3", MMApplicationContext.getApplicationId() + ":appbrand4"};
        if (context != null) {
            HashMap hashMap = new HashMap();
            try {
                for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                    hashMap.put(next.processName, Integer.valueOf(next.pid));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ProcessOperator", e, "", new Object[0]);
            }
            for (int i = 0; i < 8; i++) {
                String str = strArr[i];
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    Log.m105925i("MicroMsg.ProcessOperator", "killProcess(pid : %s, process : %s)", num, str);
                    try {
                        int intValue = num.intValue();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(Integer.valueOf(intValue));
                        Object obj = new Object();
                        C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/mm/process/ProcessOperator", "killProcess", "(Landroid/content/Context;[Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        Process.killProcess(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(obj, "com/tencent/mm/process/ProcessOperator", "killProcess", "(Landroid/content/Context;[Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    } catch (Throwable th) {
                        Log.m105921e("MicroMsg.ProcessOperator", "killProcess, process[%s] pid[%d], e=%s", str, num, th);
                    }
                }
            }
        }
        try {
            Log.m105924i("MicroMsg.MMAppMgr", "clearAllWebViewCache");
        } catch (Exception e2) {
            Log.m105925i("MicroMsg.MMAppMgr", "clear cookie failed : %s", e2);
        }
        int myPid = Process.myPid();
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(Integer.valueOf(myPid));
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar3.mo10232b(), "com/tencent/mm/ui/MMAppMgr", "killProcess", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(obj2, "com/tencent/mm/ui/MMAppMgr", "killProcess", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    /* renamed from: i */
    public static void m85989i() {
        Context context = MMApplicationContext.getContext();
        if (context != null) {
            if (C28862c.m38402c()) {
                C80595i.m98217f();
            } else {
                try {
                    context.stopService(new Intent(context, CoreService.class));
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MMAppMgr", "killService() Exception:%s", e.getMessage());
                }
            }
            C116024c.m163165e(new Intent(context, NotifyReceiver.NotifyService.class), XWalkEnvironment.MODULE_MM, true, C88144b.m109786e(XWalkEnvironment.MODULE_MM));
            C116024c.m163165e(new Intent().setClassName(context, "com.tencent.mm.plugin.exdevice.service.ExDeviceService"), "exdevice", true, C88144b.m109786e("exdevice"));
        }
    }

    /* renamed from: j */
    public static boolean m85990j(Activity activity, DialogInterface.OnClickListener onClickListener) {
        SharedPreferences sharedPreferences = activity.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        boolean z = sharedPreferences.getBoolean("gprs_alert", true);
        ChannelUtil.isShowingGprsAlert &= z;
        if (z) {
            Context baseContext = activity.getBaseContext();
            if (!C17667i1.f48064a) {
                synchronized (C17667i1.class) {
                    if (!C17667i1.f48064a) {
                        C116734h6.m164652h();
                        C0086a.f520a = new C0988g1();
                        C17667i1.m17971a(baseContext);
                        C116734h6.f350034a.add(new C67649h1(baseContext));
                        C17667i1.f48064a = true;
                    }
                }
            }
            View inflate = View.inflate(activity, C0966R.C0971layout.ayh, (ViewGroup) null);
            String translate = WeChatBrands.Wordings.translate(activity.getString(C0966R.string.hmo));
            String translate2 = WeChatBrands.Wordings.translate(activity.getString(C0966R.string.gmj));
            String translate3 = WeChatBrands.Wordings.translate(activity.getString(C0966R.string.gmi, new Object[]{translate, translate2}));
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(translate3);
            newSpannable.setSpan(new C73081d(activity), translate3.indexOf(translate), translate3.indexOf(translate) + translate.length(), 33);
            newSpannable.setSpan(new StyleSpan(1), translate3.indexOf(translate2), translate3.indexOf(translate2) + translate2.length(), 33);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gkt);
            textView.setText(newSpannable);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            C77398g I = C76879j.m92715I(activity, false, (String) null, inflate, activity.getString(C0966R.string.bjb), activity.getString(C0966R.string.gmf), new C73082e((CheckBox) inflate.findViewById(C0966R.C0970id.eqk), sharedPreferences, activity, onClickListener), new C73078a(activity));
            if (I == null) {
                return false;
            }
            I.setOnCancelListener(new C73079b(activity));
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0090  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m85991k(android.content.Context r12, int r13, android.content.DialogInterface.OnClickListener r14, android.content.DialogInterface.OnClickListener r15) {
        /*
            r0 = 2131496875(0x7f0c0fab, float:1.8617327E38)
            r1 = 0
            android.view.View r0 = android.view.View.inflate(r12, r0, r1)
            r1 = 2131310075(0x7f0935fb, float:1.8238452E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r2 = 2131833500(0x7f11329c, float:1.9300084E38)
            java.lang.String r3 = r12.getString(r2)
            r1.setText(r3)
            com.tencent.mm.ui.MMAppMgr$c r3 = new com.tencent.mm.ui.MMAppMgr$c
            r3.<init>()
            r1.setOnCheckedChangeListener(r3)
            r1 = 2131310077(0x7f0935fd, float:1.8238456E38)
            android.view.View r1 = r0.findViewById(r1)
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/ui/MMAppMgr"
            java.lang.String r6 = "showProcessLimitedAlert"
            java.lang.String r7 = "(Landroid/content/Context;ILandroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)Z"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r10 = 0
            java.lang.Object r3 = r11.mo10231a(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/ui/MMAppMgr"
            java.lang.String r5 = "showProcessLimitedAlert"
            java.lang.String r6 = "(Landroid/content/Context;ILandroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)Z"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r1
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            r1 = 2131310076(0x7f0935fc, float:1.8238454E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 1
            if (r13 == r3) goto L_0x0087
            r4 = 3
            r5 = 2131833512(0x7f1132a8, float:1.9300108E38)
            if (r13 == r4) goto L_0x0082
            r1.setText(r5)
            goto L_0x008d
        L_0x0082:
            r1.setText(r5)
            r13 = 0
            goto L_0x008e
        L_0x0087:
            r13 = 2131833499(0x7f11329b, float:1.9300082E38)
            r1.setText(r13)
        L_0x008d:
            r13 = 1
        L_0x008e:
            if (r13 == 0) goto L_0x00d0
            qo3.a r13 = new qo3.a
            r13.<init>()
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            android.content.res.Resources r4 = al3.C0086a.m38a(r12)
            java.lang.String r1 = r4.getString(r1)
            r13.f225644a = r1
            r13.f225668y = r10
            r13.f225627J = r0
            r0 = 2131833509(0x7f1132a5, float:1.9300102E38)
            android.content.res.Resources r1 = al3.C0086a.m38a(r12)
            java.lang.String r0 = r1.getString(r0)
            r13.f225663t = r0
            r13.f225620C = r14
            android.content.res.Resources r14 = al3.C0086a.m38a(r12)
            java.lang.String r14 = r14.getString(r2)
            r13.f225664u = r14
            r13.f225621D = r15
            qo3.g r14 = new qo3.g
            r15 = 2131887328(0x7f1204e0, float:1.940926E38)
            r14.<init>(r12, r15)
            r14.mo107525e(r13)
            r14.show()
            return r3
        L_0x00d0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MMAppMgr.m85991k(android.content.Context, int, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener):boolean");
    }

    /* renamed from: l */
    public static void m85992l() {
        StringBuffer stringBuffer = new StringBuffer(800);
        StringBuffer stringBuffer2 = f214415d;
        if (stringBuffer2 == null) {
            f214415d = stringBuffer;
            f214416e = Util.nowSecond();
            return;
        }
        String stringBuffer3 = stringBuffer2.toString();
        int length = stringBuffer3.length() - 1;
        int i = 0;
        while (length >= 0) {
            if (stringBuffer3.charAt(length) == '|') {
                i++;
            }
            if (i == 3) {
                break;
            }
            length--;
        }
        stringBuffer.append(stringBuffer3.substring(length + 1));
        f214415d = stringBuffer;
        Log.m105925i("MicroMsg.MMAppMgr", "oreh report clickstream %s", stringBuffer3);
        C115669n.INSTANCE.kvStat(10508, "1," + f214416e + "," + stringBuffer3);
        f214416e = Util.nowSecond();
    }
}
