package com.tencent.p014mm.plugin.report.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.mars.Mars;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C75681p0;
import f40.C86709a0;
import g40.C87134f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver */
public class KVCommCrossProcessReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static MMHandler f346929a;

    /* renamed from: b */
    public static String f346930b = "";

    /* renamed from: c */
    public static volatile long f346931c = ((long) 10000);

    /* renamed from: d */
    public static volatile int f346932d = -1;

    /* renamed from: e */
    public static BroadCastData f346933e = new BroadCastData();

    /* renamed from: f */
    public static Object f346934f = new Object();

    /* renamed from: com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver$a */
    public class C115661a extends MMHandler {
        public C115661a(String str) {
            super(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0370, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x038d, code lost:
            r11 = r4.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0395, code lost:
            if (r11.hasNext() == false) goto L_0x043f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0397, code lost:
            r0 = r11.next();
            com.tencent.p014mm.plugin.report.service.C57276k.m66022d((int) r0.f346938d, (int) r0.f346939e, r0.f346940f, r0.f346941g, r0.f346942h, r0.f346943i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x03af, code lost:
            r5 = new android.content.Intent();
            r5.setAction("com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver");
            r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x03c5, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346930b) == false) goto L_0x03de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x03c7, code lost:
            com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346930b = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getSourcePackageName() + ".plugin.report.service.KVCommCrossProcessReceiver";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x03de, code lost:
            r5.setComponent(new android.content.ComponentName(r7, com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346930b));
            r5.putExtra("type", 1);
            r6 = new android.os.Bundle();
            r6.putParcelable("BUNDLE_IDKEYGROUP", r1);
            r5.putExtra("INTENT_IDKEYGROUP", r6);
            com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.ReportManagerKvCheck", "try sendBroadcast kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", java.lang.Integer.valueOf(r4.size()), java.lang.Integer.valueOf(r2.size()), java.lang.Integer.valueOf(r11.size()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().sendBroadcast(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x042d, code lost:
            r11 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x042e, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.ReportManagerKvCheck", r11, "sendBroadcastMessageDirectly", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
            r11 = r1.f346925f;
            r2 = r1.f346924e;
            r4 = r1.f346923d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
            if (com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsIsolatedProcess() != false) goto L_0x03af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
            if (f40.C75681p0.m90937d(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()) != false) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
            if (com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcessExist() != false) goto L_0x03af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ReportManagerKvCheck", "sendKVBroadcast shut_down_weixin, no need to notify worker");
            r11 = r11.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
            if (r11.hasNext() == false) goto L_0x01f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
            r0 = r11.next();
            r1 = r0.f346927d;
            r0 = r0.f346928e;
            r3 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a;
            r3 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
            if (r3.hasNext() == false) goto L_0x00d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
            r5 = r3.next();
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, id:" + r5.GetID() + ", key:" + r5.GetKey() + ", value:" + r5.GetValue() + ", isImportant:" + r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
            if (com.tencent.p014mm.vfs.C86013q1.m106450k(com.tencent.p014mm.plugin.report.service.C57276k.f164057a) != false) goto L_0x00ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, filepath:" + com.tencent.p014mm.plugin.report.service.C57276k.f164057a + " not exist ");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ff, code lost:
            r3 = com.tencent.p014mm.plugin.report.service.C57276k.m66019a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0109, code lost:
            if ("MM".equals(r3) == false) goto L_0x0123;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
            r3 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a + r3 + ".group_monitor";
            r5 = new com.tencent.p014mm.plugin.report.service.C57273d();
            r5.f164045d = r1.size();
            r1 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x014c, code lost:
            if (r1.hasNext() == false) goto L_0x0176;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x014e, code lost:
            r6 = r1.next();
            r7 = new com.tencent.p014mm.plugin.report.service.C57274e();
            r7.f164047d = (int) r6.GetID();
            r7.f164048e = (int) r6.GetKey();
            r7.f164049f = (int) r6.GetValue();
            r7.f164050g = r0;
            r5.f164046e.add(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            r0 = r5.toByteArray();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x017a, code lost:
            if (r0 != null) goto L_0x0186;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x017c, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, null == temp.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0186, code lost:
            r1 = com.tencent.p014mm.plugin.report.service.C57276k.f164058b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0188, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0192, code lost:
            if (com.tencent.p014mm.vfs.C86013q1.m106440a(r3, com.tencent.p014mm.plugin.report.service.C57276k.m66020b(r0.length)) == 0) goto L_0x01b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0194, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, write obj_len to file:" + r3 + " fail.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b0, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b7, code lost:
            if (com.tencent.p014mm.vfs.C86013q1.m106440a(r3, r0) == 0) goto L_0x01d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b9, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, write object to file:" + r3 + " fail.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d5, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01db, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01dc, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, IOException, detail:" + r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f9, code lost:
            r11 = r2.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0201, code lost:
            if (r11.hasNext() == false) goto L_0x038d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0203, code lost:
            r0 = r11.next();
            r2 = (int) r0.f346944d;
            r1 = (int) r0.f346945e;
            r3 = (int) r0.f346946f;
            r0 = r0.f346947g;
            r5 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a;
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, id:" + r2 + ", key:" + r1 + ", value:" + r3 + ", isImportant:" + r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x024b, code lost:
            if (com.tencent.p014mm.vfs.C86013q1.m106450k(com.tencent.p014mm.plugin.report.service.C57276k.f164057a) != false) goto L_0x0288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x024d, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, filepath:" + com.tencent.p014mm.plugin.report.service.C57276k.f164057a + " not exist , Id:" + r2 + ", key:" + r1 + ", value:" + r3 + ", isImportant:" + r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0288, code lost:
            r5 = com.tencent.p014mm.plugin.report.service.C57276k.m66019a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0292, code lost:
            if ("MM".equals(r5) == false) goto L_0x02cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0294, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + r5 + ", id:" + r2 + ", key:" + r1 + ", val:" + r3 + ", isImportant:" + r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x02cc, code lost:
            r5 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a + r5 + ".monitor";
            r6 = new com.tencent.p014mm.plugin.report.service.C57274e();
            r6.f164047d = r2;
            r6.f164048e = r1;
            r6.f164049f = r3;
            r6.f164050g = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            r0 = r6.toByteArray();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x02f3, code lost:
            if (r0 != null) goto L_0x02ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x02f5, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, null == temp.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ff, code lost:
            r1 = com.tencent.p014mm.plugin.report.service.C57276k.f164058b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0301, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x030b, code lost:
            if (com.tencent.p014mm.vfs.C86013q1.m106440a(r5, com.tencent.p014mm.plugin.report.service.C57276k.m66020b(r0.length)) == 0) goto L_0x032c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x030d, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, write obj_len to file:" + r5 + " fail.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0329, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0330, code lost:
            if (com.tencent.p014mm.vfs.C86013q1.m106440a(r5, r0) == 0) goto L_0x034e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0332, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, write object to file:" + r5 + " fail.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x034e, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, fileLength:" + com.tencent.p014mm.vfs.C86013q1.m106451l(r5));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0369, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x036f, code lost:
            r0 = move-exception;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                super.handleMessage(r11)
                int r11 = r11.what
                r0 = 1
                if (r11 != r0) goto L_0x043f
                java.lang.Object r11 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346934f
                monitor-enter(r11)
                com.tencent.mm.plugin.report.service.BroadCastData r1 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346933e     // Catch:{ all -> 0x043c }
                java.util.ArrayList<com.tencent.mm.plugin.report.service.KVReportDataInfo> r2 = r1.f346923d     // Catch:{ all -> 0x043c }
                int r2 = r2.size()     // Catch:{ all -> 0x043c }
                r3 = 0
                if (r2 > 0) goto L_0x0028
                java.util.ArrayList<com.tencent.mm.plugin.report.service.StIDKeyDataInfo> r2 = r1.f346924e     // Catch:{ all -> 0x043c }
                int r2 = r2.size()     // Catch:{ all -> 0x043c }
                if (r2 > 0) goto L_0x0028
                java.util.ArrayList<com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo> r1 = r1.f346925f     // Catch:{ all -> 0x043c }
                int r1 = r1.size()     // Catch:{ all -> 0x043c }
                if (r1 > 0) goto L_0x0028
                r1 = 1
                goto L_0x0029
            L_0x0028:
                r1 = 0
            L_0x0029:
                if (r1 == 0) goto L_0x002e
                monitor-exit(r11)     // Catch:{ all -> 0x043c }
                goto L_0x043f
            L_0x002e:
                com.tencent.mm.plugin.report.service.BroadCastData r1 = new com.tencent.mm.plugin.report.service.BroadCastData     // Catch:{ all -> 0x043c }
                com.tencent.mm.plugin.report.service.BroadCastData r2 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346933e     // Catch:{ all -> 0x043c }
                r1.<init>((com.tencent.p014mm.plugin.report.service.BroadCastData) r2)     // Catch:{ all -> 0x043c }
                com.tencent.mm.plugin.report.service.BroadCastData r2 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346933e     // Catch:{ all -> 0x043c }
                java.util.ArrayList<com.tencent.mm.plugin.report.service.KVReportDataInfo> r4 = r2.f346923d     // Catch:{ all -> 0x043c }
                r4.clear()     // Catch:{ all -> 0x043c }
                java.util.ArrayList<com.tencent.mm.plugin.report.service.StIDKeyDataInfo> r4 = r2.f346924e     // Catch:{ all -> 0x043c }
                r4.clear()     // Catch:{ all -> 0x043c }
                java.util.ArrayList<com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo> r4 = r2.f346925f     // Catch:{ all -> 0x043c }
                r4.clear()     // Catch:{ all -> 0x043c }
                long[] r4 = r2.f346926g     // Catch:{ all -> 0x043c }
                monitor-enter(r4)     // Catch:{ all -> 0x043c }
                long[] r2 = r2.f346926g     // Catch:{ all -> 0x0439 }
                r5 = 0
                r2[r3] = r5     // Catch:{ all -> 0x0439 }
                monitor-exit(r4)     // Catch:{ all -> 0x0439 }
                monitor-exit(r11)     // Catch:{ all -> 0x043c }
                java.util.ArrayList<com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo> r11 = r1.f346925f
                java.util.ArrayList<com.tencent.mm.plugin.report.service.StIDKeyDataInfo> r2 = r1.f346924e
                java.util.ArrayList<com.tencent.mm.plugin.report.service.KVReportDataInfo> r4 = r1.f346923d
                boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsIsolatedProcess()
                if (r5 != 0) goto L_0x03af
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r5 = f40.C75681p0.m90937d(r5)
                if (r5 != 0) goto L_0x006d
                boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcessExist()
                if (r5 != 0) goto L_0x03af
            L_0x006d:
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.String r1 = "sendKVBroadcast shut_down_weixin, no need to notify worker"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                java.util.Iterator r11 = r11.iterator()
            L_0x0079:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x01f9
                java.lang.Object r0 = r11.next()
                com.tencent.mm.plugin.report.service.GroupIDKeyDataInfo r0 = (com.tencent.p014mm.plugin.report.service.GroupIDKeyDataInfo) r0
                java.util.ArrayList<com.tencent.mars.smc.IDKey> r1 = r0.f346927d
                boolean r0 = r0.f346928e
                java.lang.String r3 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a
                java.util.Iterator r3 = r1.iterator()
            L_0x008f:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x00d7
                java.lang.Object r5 = r3.next()
                com.tencent.mars.smc.IDKey r5 = (com.tencent.mars.smc.IDKey) r5
                java.lang.String r6 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "saveGroupIDKeyData, id:"
                r7.append(r8)
                long r8 = r5.GetID()
                r7.append(r8)
                java.lang.String r8 = ", key:"
                r7.append(r8)
                long r8 = r5.GetKey()
                r7.append(r8)
                java.lang.String r8 = ", value:"
                r7.append(r8)
                long r8 = r5.GetValue()
                r7.append(r8)
                java.lang.String r5 = ", isImportant:"
                r7.append(r5)
                r7.append(r0)
                java.lang.String r5 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                goto L_0x008f
            L_0x00d7:
                java.lang.String r3 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
                if (r3 != 0) goto L_0x00ff
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "saveGroupIDKeyData, filepath:"
                r1.append(r3)
                java.lang.String r3 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a
                r1.append(r3)
                java.lang.String r3 = " not exist "
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                goto L_0x0079
            L_0x00ff:
                java.lang.String r3 = com.tencent.p014mm.plugin.report.service.C57276k.m66019a()
                java.lang.String r5 = "MM"
                boolean r5 = r5.equals(r3)
                if (r5 == 0) goto L_0x0123
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "error path, current processname:"
                r1.append(r5)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                goto L_0x0079
            L_0x0123:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a
                r5.append(r6)
                r5.append(r3)
                java.lang.String r3 = ".group_monitor"
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                com.tencent.mm.plugin.report.service.d r5 = new com.tencent.mm.plugin.report.service.d
                r5.<init>()
                int r6 = r1.size()
                r5.f164045d = r6
                java.util.Iterator r1 = r1.iterator()
            L_0x0148:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x0176
                java.lang.Object r6 = r1.next()
                com.tencent.mars.smc.IDKey r6 = (com.tencent.mars.smc.IDKey) r6
                com.tencent.mm.plugin.report.service.e r7 = new com.tencent.mm.plugin.report.service.e
                r7.<init>()
                long r8 = r6.GetID()
                int r9 = (int) r8
                r7.f164047d = r9
                long r8 = r6.GetKey()
                int r9 = (int) r8
                r7.f164048e = r9
                long r8 = r6.GetValue()
                int r6 = (int) r8
                r7.f164049f = r6
                r7.f164050g = r0
                java.util.LinkedList<com.tencent.mm.plugin.report.service.e> r6 = r5.f164046e
                r6.add(r7)
                goto L_0x0148
            L_0x0176:
                byte[] r0 = r5.toByteArray()     // Catch:{ IOException -> 0x01db }
                if (r0 != 0) goto L_0x0186
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.String r1 = "saveGroupIDKeyData, null == temp."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                goto L_0x0079
            L_0x0186:
                java.lang.Byte r1 = com.tencent.p014mm.plugin.report.service.C57276k.f164058b
                monitor-enter(r1)
                int r5 = r0.length     // Catch:{ all -> 0x01d8 }
                byte[] r5 = com.tencent.p014mm.plugin.report.service.C57276k.m66020b(r5)     // Catch:{ all -> 0x01d8 }
                int r5 = com.tencent.p014mm.vfs.C86013q1.m106440a(r3, r5)     // Catch:{ all -> 0x01d8 }
                if (r5 == 0) goto L_0x01b3
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
                r5.<init>()     // Catch:{ all -> 0x01d8 }
                java.lang.String r6 = "saveGroupIDKeyData, write obj_len to file:"
                r5.append(r6)     // Catch:{ all -> 0x01d8 }
                r5.append(r3)     // Catch:{ all -> 0x01d8 }
                java.lang.String r3 = " fail."
                r5.append(r3)     // Catch:{ all -> 0x01d8 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x01d8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x01d8 }
                monitor-exit(r1)     // Catch:{ all -> 0x01d8 }
                goto L_0x0079
            L_0x01b3:
                int r0 = com.tencent.p014mm.vfs.C86013q1.m106440a(r3, r0)     // Catch:{ all -> 0x01d8 }
                if (r0 == 0) goto L_0x01d5
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
                r5.<init>()     // Catch:{ all -> 0x01d8 }
                java.lang.String r6 = "saveGroupIDKeyData, write object to file:"
                r5.append(r6)     // Catch:{ all -> 0x01d8 }
                r5.append(r3)     // Catch:{ all -> 0x01d8 }
                java.lang.String r3 = " fail."
                r5.append(r3)     // Catch:{ all -> 0x01d8 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x01d8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x01d8 }
            L_0x01d5:
                monitor-exit(r1)     // Catch:{ all -> 0x01d8 }
                goto L_0x0079
            L_0x01d8:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x01d8 }
                throw r11
            L_0x01db:
                r0 = move-exception
                java.lang.String r1 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "saveGroupIDKeyData, IOException, detail:"
                r3.append(r5)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                goto L_0x0079
            L_0x01f9:
                java.util.Iterator r11 = r2.iterator()
            L_0x01fd:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x038d
                java.lang.Object r0 = r11.next()
                com.tencent.mm.plugin.report.service.StIDKeyDataInfo r0 = (com.tencent.p014mm.plugin.report.service.StIDKeyDataInfo) r0
                long r1 = r0.f346944d
                int r2 = (int) r1
                long r5 = r0.f346945e
                int r1 = (int) r5
                long r5 = r0.f346946f
                int r3 = (int) r5
                boolean r0 = r0.f346947g
                java.lang.String r5 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a
                java.lang.String r5 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "saveIDKeyData, id:"
                r6.append(r7)
                r6.append(r2)
                java.lang.String r7 = ", key:"
                r6.append(r7)
                r6.append(r1)
                java.lang.String r7 = ", value:"
                r6.append(r7)
                r6.append(r3)
                java.lang.String r7 = ", isImportant:"
                r6.append(r7)
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                java.lang.String r5 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
                if (r5 != 0) goto L_0x0288
                java.lang.String r5 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "saveIDKeyData, filepath:"
                r6.append(r7)
                java.lang.String r7 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a
                r6.append(r7)
                java.lang.String r7 = " not exist , Id:"
                r6.append(r7)
                r6.append(r2)
                java.lang.String r2 = ", key:"
                r6.append(r2)
                r6.append(r1)
                java.lang.String r1 = ", value:"
                r6.append(r1)
                r6.append(r3)
                java.lang.String r1 = ", isImportant:"
                r6.append(r1)
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                goto L_0x01fd
            L_0x0288:
                java.lang.String r5 = com.tencent.p014mm.plugin.report.service.C57276k.m66019a()
                java.lang.String r6 = "MM"
                boolean r6 = r6.equals(r5)
                if (r6 == 0) goto L_0x02cc
                java.lang.String r6 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "error path, current processname:"
                r7.append(r8)
                r7.append(r5)
                java.lang.String r5 = ", id:"
                r7.append(r5)
                r7.append(r2)
                java.lang.String r2 = ", key:"
                r7.append(r2)
                r7.append(r1)
                java.lang.String r1 = ", val:"
                r7.append(r1)
                r7.append(r3)
                java.lang.String r1 = ", isImportant:"
                r7.append(r1)
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
                goto L_0x01fd
            L_0x02cc:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = com.tencent.p014mm.plugin.report.service.C57276k.f164057a
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = ".monitor"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.tencent.mm.plugin.report.service.e r6 = new com.tencent.mm.plugin.report.service.e
                r6.<init>()
                r6.f164047d = r2
                r6.f164048e = r1
                r6.f164049f = r3
                r6.f164050g = r0
                byte[] r0 = r6.toByteArray()     // Catch:{ IOException -> 0x036f }
                if (r0 != 0) goto L_0x02ff
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.String r1 = "saveIDKeyData, null == temp."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                goto L_0x01fd
            L_0x02ff:
                java.lang.Byte r1 = com.tencent.p014mm.plugin.report.service.C57276k.f164058b
                monitor-enter(r1)
                int r2 = r0.length     // Catch:{ all -> 0x036c }
                byte[] r2 = com.tencent.p014mm.plugin.report.service.C57276k.m66020b(r2)     // Catch:{ all -> 0x036c }
                int r2 = com.tencent.p014mm.vfs.C86013q1.m106440a(r5, r2)     // Catch:{ all -> 0x036c }
                if (r2 == 0) goto L_0x032c
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
                r2.<init>()     // Catch:{ all -> 0x036c }
                java.lang.String r3 = "saveIDKeyData, write obj_len to file:"
                r2.append(r3)     // Catch:{ all -> 0x036c }
                r2.append(r5)     // Catch:{ all -> 0x036c }
                java.lang.String r3 = " fail."
                r2.append(r3)     // Catch:{ all -> 0x036c }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036c }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x036c }
                monitor-exit(r1)     // Catch:{ all -> 0x036c }
                goto L_0x01fd
            L_0x032c:
                int r0 = com.tencent.p014mm.vfs.C86013q1.m106440a(r5, r0)     // Catch:{ all -> 0x036c }
                if (r0 == 0) goto L_0x034e
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
                r2.<init>()     // Catch:{ all -> 0x036c }
                java.lang.String r3 = "saveIDKeyData, write object to file:"
                r2.append(r3)     // Catch:{ all -> 0x036c }
                r2.append(r5)     // Catch:{ all -> 0x036c }
                java.lang.String r3 = " fail."
                r2.append(r3)     // Catch:{ all -> 0x036c }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036c }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x036c }
            L_0x034e:
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
                r2.<init>()     // Catch:{ all -> 0x036c }
                java.lang.String r3 = "saveIDKeyData, fileLength:"
                r2.append(r3)     // Catch:{ all -> 0x036c }
                long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)     // Catch:{ all -> 0x036c }
                r2.append(r5)     // Catch:{ all -> 0x036c }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036c }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ all -> 0x036c }
                monitor-exit(r1)     // Catch:{ all -> 0x036c }
                goto L_0x01fd
            L_0x036c:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x036c }
                throw r11
            L_0x036f:
                r0 = move-exception
                java.lang.String r1 = "MicroMsg.ReportManagerKvCheck"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "saveIDKeyData, IOException, detail:"
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                goto L_0x01fd
            L_0x038d:
                java.util.Iterator r11 = r4.iterator()
            L_0x0391:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x043f
                java.lang.Object r0 = r11.next()
                com.tencent.mm.plugin.report.service.KVReportDataInfo r0 = (com.tencent.p014mm.plugin.report.service.KVReportDataInfo) r0
                long r1 = r0.f346938d
                int r3 = (int) r1
                long r1 = r0.f346939e
                int r4 = (int) r1
                java.lang.String r5 = r0.f346940f
                boolean r6 = r0.f346941g
                boolean r7 = r0.f346942h
                boolean r8 = r0.f346943i
                com.tencent.p014mm.plugin.report.service.C57276k.m66022d(r3, r4, r5, r6, r7, r8)
                goto L_0x0391
            L_0x03af:
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                java.lang.String r6 = "com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver"
                r5.setAction(r6)
                android.content.ComponentName r6 = new android.content.ComponentName
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                java.lang.String r8 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346930b
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 == 0) goto L_0x03de
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getSourcePackageName()
                r8.append(r9)
                java.lang.String r9 = ".plugin.report.service.KVCommCrossProcessReceiver"
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346930b = r8
            L_0x03de:
                java.lang.String r8 = com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.f346930b
                r6.<init>(r7, r8)
                r5.setComponent(r6)
                java.lang.String r6 = "type"
                r5.putExtra(r6, r0)
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
                java.lang.String r7 = "BUNDLE_IDKEYGROUP"
                r6.putParcelable(r7, r1)
                java.lang.String r1 = "INTENT_IDKEYGROUP"
                r5.putExtra(r1, r6)
                java.lang.String r1 = "MicroMsg.ReportManagerKvCheck"
                java.lang.String r6 = "try sendBroadcast kvdata lenght: %d, idkey data lenght:%d,group lenght:%d"
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]
                int r4 = r4.size()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7[r3] = r4
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r7[r0] = r2
                r0 = 2
                int r11 = r11.size()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r7[r0] = r11
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r7)
                android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x042d }
                r11.sendBroadcast(r5)     // Catch:{ Exception -> 0x042d }
                goto L_0x043f
            L_0x042d:
                r11 = move-exception
                java.lang.String r0 = "MicroMsg.ReportManagerKvCheck"
                java.lang.String r1 = "sendBroadcastMessageDirectly"
                java.lang.Object[] r2 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r11, r1, r2)
                goto L_0x043f
            L_0x0439:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0439 }
                throw r0     // Catch:{ all -> 0x043c }
            L_0x043c:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x043c }
                throw r0
            L_0x043f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver.C115661a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver$b */
    public class C115662b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f346935d;

        public C115662b(Intent intent) {
            this.f346935d = intent;
        }

        public void run() {
            BroadCastData broadCastData;
            Log.m105925i("MicroMsg.ReportManagerKvCheck", "summeranrt true report runnable run tid:%d", Long.valueOf(Thread.currentThread().getId()));
            KVCommCrossProcessReceiver kVCommCrossProcessReceiver = KVCommCrossProcessReceiver.this;
            Intent intent = this.f346935d;
            MMHandler mMHandler = KVCommCrossProcessReceiver.f346929a;
            kVCommCrossProcessReceiver.getClass();
            try {
                int intExtra = IntentUtil.getIntExtra(intent, "type", 0);
                if (intExtra == 1) {
                    Bundle bundleExtra = intent.getBundleExtra("INTENT_IDKEYGROUP");
                    if (!(bundleExtra == null || (broadCastData = (BroadCastData) bundleExtra.getParcelable("BUNDLE_IDKEYGROUP")) == null)) {
                        ArrayList<GroupIDKeyDataInfo> arrayList = broadCastData.f346925f;
                        ArrayList<StIDKeyDataInfo> arrayList2 = broadCastData.f346924e;
                        ArrayList<KVReportDataInfo> arrayList3 = broadCastData.f346923d;
                        Log.m105925i("MicroMsg.ReportManagerKvCheck", "KVBroadCast onReceive kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", Integer.valueOf(arrayList3.size()), Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()));
                        Iterator<GroupIDKeyDataInfo> it = arrayList.iterator();
                        while (it.hasNext()) {
                            GroupIDKeyDataInfo next = it.next();
                            if (next != null) {
                                C115666i.m162694a(next.f346927d, next.f346928e);
                            }
                        }
                        Iterator<StIDKeyDataInfo> it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            StIDKeyDataInfo next2 = it4.next();
                            if (next2 != null) {
                                C115666i.m162695b(next2.f346944d, next2.f346945e, next2.f346946f, next2.f346947g);
                            }
                        }
                        Iterator<KVReportDataInfo> it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            KVReportDataInfo next3 = it5.next();
                            if (next3 != null) {
                                C115666i.m162698e(next3.f346938d, next3.f346939e, next3.f346940f, next3.f346941g, next3.f346942h, next3.f346943i);
                            }
                        }
                    }
                } else if (intExtra == 2) {
                    Log.m105924i("MicroMsg.ReportManagerKvCheck", "KVBroadCast onReceive TYPE_ONCRASHOREXCEPTION");
                    Mars.onSingalCrash(0);
                }
                if (C75681p0.m90937d(MMApplicationContext.getContext())) {
                    new MMHandler().postDelayed(new C85403g(kVCommCrossProcessReceiver), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ReportManagerKvCheck", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver$c */
    public class C115663c implements C87134f {

        /* renamed from: d */
        public final /* synthetic */ Runnable f346937d;

        public C115663c(KVCommCrossProcessReceiver kVCommCrossProcessReceiver, Runnable runnable) {
            this.f346937d = runnable;
        }

        /* renamed from: e */
        public void mo1180e() {
            C86709a0.m107528h().mo121101p(this);
            Log.m105924i("MicroMsg.ReportManagerKvCheck", "Delay post");
            KVCommCrossProcessReceiver.f346929a.post(this.f346937d);
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
        }
    }

    static {
        C115661a aVar = new C115661a("kv_report");
        f346929a = aVar;
        aVar.setLogging(false);
    }

    /* renamed from: a */
    public static boolean m162689a() {
        long j;
        if (f346933e == null) {
            return false;
        }
        try {
            if (f346932d > 0 && f346933e.f346924e.size() + f346933e.f346925f.size() + f346933e.f346923d.size() >= f346932d) {
                return true;
            }
            BroadCastData broadCastData = f346933e;
            synchronized (broadCastData.f346926g) {
                j = broadCastData.f346926g[0];
            }
            if (j >= 307200) {
                Log.m105924i("MicroMsg.ReportManagerKvCheck", "KV data size > 300K.");
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ReportManagerKvCheck", "checkExceedCacheItemCountLimit e = %s", e);
        }
    }

    /* renamed from: b */
    public static void m162690b() {
        MMHandler mMHandler = f346929a;
        if (mMHandler != null) {
            mMHandler.removeMessages(1);
            MMHandler mMHandler2 = f346929a;
            mMHandler2.handleMessage(mMHandler2.obtainMessage(1));
        }
    }

    /* renamed from: c */
    public static void m162691c(KVReportDataInfo kVReportDataInfo) {
        Log.m105919d("MicroMsg.ReportManagerKvCheck", "receive kv logid:%d, type:%d, isImportant: %b,isReportNow: %b, ignoreFreqLimit", Long.valueOf(kVReportDataInfo.f346938d), Long.valueOf(kVReportDataInfo.f346939e), Boolean.valueOf(kVReportDataInfo.f346942h), Boolean.valueOf(kVReportDataInfo.f346941g));
        synchronized (f346934f) {
            BroadCastData broadCastData = f346933e;
            broadCastData.f346923d.add(kVReportDataInfo);
            String str = kVReportDataInfo.f346940f;
            broadCastData.mo175883a((str != null ? str.getBytes().length : 1) + 12 + 16);
        }
        if (f346931c == 0 || m162689a()) {
            f346929a.obtainMessage(1).sendToTarget();
        } else if (!f346929a.hasMessages(1)) {
            f346929a.sendEmptyMessageDelayed(1, f346931c);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            Log.m105920e("MicroMsg.ReportManagerKvCheck", "onReceive intent == null");
            return;
        }
        C115662b bVar = new C115662b(intent);
        if (C86709a0.m107528h().f251724a.f251792d || SmcLogic.sInitiated) {
            f346929a.post(bVar);
        } else {
            C86709a0.m107528h().mo121097c(new C115663c(this, bVar));
        }
    }
}
