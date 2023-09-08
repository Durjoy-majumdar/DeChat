package p661qj;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import nj3.C76879j;
import yc3.C38992a;

/* renamed from: qj.c */
public class C77352c implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f225544a = 0;

    static {
        C30650a.m39147b(new C77352c(), "//fts");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(android.content.Context r19, java.lang.String[] r20, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            java.lang.Class<kv1.q> r3 = kv1.C99260q.class
            int r4 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            r5 = 0
            r6 = 1
            if (r4 <= r6) goto L_0x0011
            return r5
        L_0x0011:
            int r4 = r2.length
            r7 = 2
            if (r4 >= r7) goto L_0x0016
            return r6
        L_0x0016:
            r4 = r2[r6]
            r4.getClass()
            int r9 = r4.hashCode()
            r11 = 10
            r12 = 9
            r13 = 8
            r14 = 7
            r15 = 6
            r16 = 4
            r17 = 5
            r8 = 3
            switch(r9) {
                case -1354714445: goto L_0x00b4;
                case -1183792455: goto L_0x00a8;
                case -1132164145: goto L_0x009d;
                case -926188360: goto L_0x0092;
                case -617644996: goto L_0x0087;
                case 3237038: goto L_0x007c;
                case 104187309: goto L_0x0071;
                case 648505237: goto L_0x0066;
                case 819712873: goto L_0x0059;
                case 955180557: goto L_0x004c;
                case 967115467: goto L_0x003f;
                case 1873247692: goto L_0x0032;
                default: goto L_0x002f;
            }
        L_0x002f:
            r4 = -1
            goto L_0x00bf
        L_0x0032:
            java.lang.String r9 = "addchatroomcontact"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x003b
            goto L_0x002f
        L_0x003b:
            r4 = 11
            goto L_0x00bf
        L_0x003f:
            java.lang.String r9 = "inserttest"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0048
            goto L_0x002f
        L_0x0048:
            r4 = 10
            goto L_0x00bf
        L_0x004c:
            java.lang.String r9 = "corrupt"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0055
            goto L_0x002f
        L_0x0055:
            r4 = 9
            goto L_0x00bf
        L_0x0059:
            java.lang.String r9 = "deletedb"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0062
            goto L_0x002f
        L_0x0062:
            r4 = 8
            goto L_0x00bf
        L_0x0066:
            java.lang.String r9 = "dismisskey"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x006f
            goto L_0x002f
        L_0x006f:
            r4 = 7
            goto L_0x00bf
        L_0x0071:
            java.lang.String r9 = "msbiz"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x007a
            goto L_0x002f
        L_0x007a:
            r4 = 6
            goto L_0x00bf
        L_0x007c:
            java.lang.String r9 = "info"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0085
            goto L_0x002f
        L_0x0085:
            r4 = 5
            goto L_0x00bf
        L_0x0087:
            java.lang.String r9 = "clearunread"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0090
            goto L_0x002f
        L_0x0090:
            r4 = 4
            goto L_0x00bf
        L_0x0092:
            java.lang.String r9 = "setcorrupttime"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x009b
            goto L_0x002f
        L_0x009b:
            r4 = 3
            goto L_0x00bf
        L_0x009d:
            java.lang.String r9 = "clearconfig"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x00a6
            goto L_0x002f
        L_0x00a6:
            r4 = 2
            goto L_0x00bf
        L_0x00a8:
            java.lang.String r9 = "insert"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x00b2
            goto L_0x002f
        L_0x00b2:
            r4 = 1
            goto L_0x00bf
        L_0x00b4:
            java.lang.String r9 = "copydb"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x00be
            goto L_0x002f
        L_0x00be:
            r4 = 0
        L_0x00bf:
            java.lang.String r9 = "FTS5IndexMicroMsg_encrypt.db"
            r10 = 10000(0x2710, float:1.4013E-41)
            switch(r4) {
                case 0: goto L_0x0352;
                case 1: goto L_0x0322;
                case 2: goto L_0x0284;
                case 3: goto L_0x026e;
                case 4: goto L_0x0259;
                case 5: goto L_0x023d;
                case 6: goto L_0x01e2;
                case 7: goto L_0x0173;
                case 8: goto L_0x0114;
                case 9: goto L_0x00f6;
                case 10: goto L_0x00e1;
                case 11: goto L_0x00c8;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x037a
        L_0x00c8:
            lv1.k r0 = new lv1.k
            r0.<init>()
            r2 = r2[r7]
            r0.f224468c = r2
            r2 = 65523(0xfff3, float:9.1817E-41)
            r0.f224467b = r2
            di3.d r2 = di3.C86312j.m106911c(r3)
            kv1.q r2 = (kv1.C99260q) r2
            r2.Xn0(r10, r0)
            goto L_0x037a
        L_0x00e1:
            lv1.k r0 = new lv1.k
            r0.<init>()
            r2 = 65525(0xfff5, float:9.182E-41)
            r0.f224467b = r2
            di3.d r2 = di3.C86312j.m106911c(r3)
            kv1.q r2 = (kv1.C99260q) r2
            r2.Xn0(r10, r0)
            goto L_0x037a
        L_0x00f6:
            java.lang.Class<com.tencent.mm.plugin.fts.PluginFTS> r0 = com.tencent.p014mm.plugin.fts.PluginFTS.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0108 }
            com.tencent.mm.plugin.fts.PluginFTS r0 = (com.tencent.p014mm.plugin.fts.PluginFTS) r0     // Catch:{ Exception -> 0x0108 }
            com.tencent.wcdb.DatabaseErrorHandler r0 = r0.f270765n     // Catch:{ Exception -> 0x0108 }
            r2 = 0
            com.tencent.mm.plugin.fts.PluginFTS$b r0 = (com.tencent.p014mm.plugin.fts.PluginFTS.C93820b) r0     // Catch:{ Exception -> 0x0108 }
            r0.onCorruption(r2)     // Catch:{ Exception -> 0x0108 }
            goto L_0x037a
        L_0x0108:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "MicroMsg.CommandTestFTS"
            java.lang.String r4 = "corrupt command"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
            goto L_0x037a
        L_0x0114:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            eb0.c r2 = eb0.C97625j3.m125812b()
            java.lang.String r2 = r2.mo105901p()
            r0.<init>((java.lang.String) r2, (java.lang.String) r9)
            boolean r2 = r0.mo119967g()
            if (r2 == 0) goto L_0x012a
            r0.mo119966f()
        L_0x012a:
            int r0 = android.os.Process.myPid()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo10233c(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/console/command/FTSCommand"
            java.lang.String r10 = "processCommand"
            java.lang.String r11 = "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r12 = "android/os/Process_EXEC_"
            java.lang.String r13 = "killProcess"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.os.Process.killProcess(r2)
            java.lang.String r8 = "com/tencent/mm/console/command/FTSCommand"
            java.lang.String r9 = "processCommand"
            java.lang.String r10 = "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r11 = "android/os/Process_EXEC_"
            java.lang.String r12 = "killProcess"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x037a
        L_0x0173:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "test_key_"
            r0.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            f40.C86709a0.m107528h()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FTS_MASTER_DB_ENCRYPT_PWD_STRING_SYNC
            r2.mo119677K(r3, r0)
            int r0 = android.os.Process.myPid()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo10233c(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/console/command/FTSCommand"
            java.lang.String r10 = "processCommand"
            java.lang.String r11 = "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r12 = "android/os/Process_EXEC_"
            java.lang.String r13 = "killProcess"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.os.Process.killProcess(r2)
            java.lang.String r8 = "com/tencent/mm/console/command/FTSCommand"
            java.lang.String r9 = "processCommand"
            java.lang.String r10 = "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r11 = "android/os/Process_EXEC_"
            java.lang.String r12 = "killProcess"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x037a
        L_0x01e2:
            te3.m03 r2 = u73.C52469w0.m58725c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.LinkedList<te3.l03> r2 = r2.f137742d
            java.util.Iterator r2 = r2.iterator()
        L_0x01f1:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0234
            java.lang.Object r4 = r2.next()
            te3.l03 r4 = (te3.C50200l03) r4
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Class<d62.i> r10 = d62.C75339i.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            d62.i r10 = (d62.C75339i) r10
            java.lang.String r11 = r4.f137121d
            java.lang.String r10 = r10.getDisplayName(r11)
            r9[r5] = r10
            double r10 = r4.f137122e
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r9[r6] = r10
            long r10 = r4.f137123f
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r12
            java.lang.String r4 = "yyyy-MM-dd HH:mm"
            java.lang.String r4 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r4, r10)
            r9[r7] = r4
            java.lang.String r4 = "%s | %.2f | %s"
            java.lang.String r4 = java.lang.String.format(r4, r9)
            r3.append(r4)
            java.lang.String r4 = "\n"
            r3.append(r4)
            goto L_0x01f1
        L_0x0234:
            java.lang.String r2 = r3.toString()
            r1.mo107489b(r0, r2)
            goto L_0x037a
        L_0x023d:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = kv1.C99249c.f291018p
            java.lang.String r4 = "FTS5IndexMicroMsgInfo.txt"
            r2.<init>((java.lang.String) r3, (java.lang.String) r4)
            boolean r3 = r2.mo119967g()
            if (r3 == 0) goto L_0x037a
            java.lang.String r2 = r2.mo119971i()     // Catch:{ IOException -> 0x037a }
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106432N(r2)     // Catch:{ IOException -> 0x037a }
            r1.mo107489b(r0, r2)     // Catch:{ IOException -> 0x037a }
            goto L_0x037a
        L_0x0259:
            lv1.k r0 = new lv1.k
            r0.<init>()
            r2 = 65524(0xfff4, float:9.1819E-41)
            r0.f224467b = r2
            di3.d r2 = di3.C86312j.m106911c(r3)
            kv1.q r2 = (kv1.C99260q) r2
            r2.Xn0(r10, r0)
            goto L_0x037a
        L_0x026e:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FTS_MASTER_DB_CORRUPT_REBUILD_TIME_INT_SYNC
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r0.mo119677K(r2, r3)
            goto L_0x037a
        L_0x0284:
            r0 = 26
            com.tencent.mm.storage.y1$a[] r2 = new com.tencent.p014mm.storage.C72994y1.C72995a[r0]
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ZH_CN_STRING
            r2[r5] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ZH_TW_STRING
            r2[r6] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ZH_HK_STRING
            r2[r7] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_EN_STRING
            r2[r8] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_AR_STRING
            r2[r16] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_DE_STRING
            r2[r17] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_DE_DE_STRING
            r2[r15] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ES_STRING
            r2[r14] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_FR_STRING
            r2[r13] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_HE_STRING
            r2[r12] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_HI_STRING
            r2[r11] = r3
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_ID_STRING
            r4 = 11
            r2[r4] = r3
            r3 = 12
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_IN_STRING
            r2[r3] = r4
            r3 = 13
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_IT_STRING
            r2[r3] = r4
            r3 = 14
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_IW_STRING
            r2[r3] = r4
            r3 = 15
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_JA_STRING
            r2[r3] = r4
            r3 = 16
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_KO_STRING
            r2[r3] = r4
            r3 = 17
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_LO_STRING
            r2[r3] = r4
            r3 = 18
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_MS_STRING
            r2[r3] = r4
            r3 = 19
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_MY_STRING
            r2[r3] = r4
            r3 = 20
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_PL_STRING
            r2[r3] = r4
            r3 = 21
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_PT_STRING
            r2[r3] = r4
            r3 = 22
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_RU_STRING
            r2[r3] = r4
            r3 = 23
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_TH_STRING
            r2[r3] = r4
            r3 = 24
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_TR_STRING
            r2[r3] = r4
            r3 = 25
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEB_SEARCH_CONFIG_VI_STRING
            r2[r3] = r4
        L_0x030e:
            if (r5 >= r0) goto L_0x037a
            r3 = r2[r5]
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            java.lang.String r7 = ""
            r4.mo119677K(r3, r7)
            int r5 = r5 + 1
            goto L_0x030e
        L_0x0322:
            lv1.k r0 = new lv1.k
            r0.<init>()
            r4 = 65521(0xfff1, float:9.1814E-41)
            r0.f224467b = r4
            r4 = 100
            r0.f224474i = r4
            int r4 = r2.length
            if (r4 <= r7) goto L_0x0341
            r4 = r2[r7]     // Catch:{ Exception -> 0x0340 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0340 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0340 }
            r0.f224474i = r4     // Catch:{ Exception -> 0x0340 }
            goto L_0x0341
        L_0x0340:
        L_0x0341:
            int r4 = r2.length
            if (r4 <= r8) goto L_0x0348
            r2 = r2[r8]
            r0.f224471f = r2
        L_0x0348:
            di3.d r2 = di3.C86312j.m106911c(r3)
            kv1.q r2 = (kv1.C99260q) r2
            r2.Xn0(r10, r0)
            goto L_0x037a
        L_0x0352:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            eb0.c r2 = eb0.C97625j3.m125812b()
            java.lang.String r2 = r2.mo105901p()
            r0.<init>((java.lang.String) r2, (java.lang.String) r9)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = "/sdcard/IndexMicroMsg.db"
            r2.<init>((java.lang.String) r3)
            boolean r3 = r2.mo119967g()
            if (r3 == 0) goto L_0x036f
            r2.mo119966f()
        L_0x036f:
            java.lang.String r0 = r0.mo119971i()
            java.lang.String r2 = r2.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r2)
        L_0x037a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p661qj.C77352c.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo107489b(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(C0966R.color.FG_0));
        textView.setTypeface(Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        C76879j.m92746q(context, (String) null, textView, (DialogInterface.OnClickListener) null);
    }
}
