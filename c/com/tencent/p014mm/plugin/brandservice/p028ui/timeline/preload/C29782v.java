package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import yc3.C38992a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.v */
public final class C29782v implements C38992a {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(android.content.Context r9, java.lang.String[] r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r9 = "args"
            gy3.C87412m.m108594g(r10, r9)
            java.lang.String r9 = "username"
            gy3.C87412m.m108594g(r11, r9)
            r9 = 0
            r11 = r10[r9]
            java.lang.String r0 = "//mpfast"
            boolean r11 = gy3.C87412m.m108589b(r0, r11)
            if (r11 == 0) goto L_0x041a
            int r11 = r10.length
            r0 = 2
            if (r11 >= r0) goto L_0x0020
            return r9
        L_0x0020:
            r11 = 1
            r1 = r10[r11]
            int r2 = r1.hashCode()
            java.lang.String r3 = "preload_tmpl_test_no_red"
            java.lang.String r4 = "preload_use"
            java.lang.String r5 = "false"
            java.lang.String r6 = "clear"
            java.lang.String r7 = "true"
            switch(r2) {
                case 112785: goto L_0x0403;
                case 3076010: goto L_0x031b;
                case 3522941: goto L_0x02d5;
                case 3556498: goto L_0x02ab;
                case 3564085: goto L_0x01da;
                case 3569038: goto L_0x0139;
                case 94746189: goto L_0x0123;
                case 97196323: goto L_0x010d;
                case 105006896: goto L_0x00f5;
                case 1224424441: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0419
        L_0x0039:
            java.lang.String r2 = "webview"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0044
            goto L_0x0419
        L_0x0044:
            int r1 = r10.length
            java.lang.String r2 = "use preload webview"
            java.lang.String r3 = "preload_webview"
            if (r1 > r0) goto L_0x0059
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r3, r11)
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r2)
            goto L_0x0419
        L_0x0059:
            r10 = r10[r0]
            int r0 = r10.hashCode()
            java.lang.String r1 = "preload_tmpl_test_noredir"
            java.lang.String r4 = "preload_tmpl_test_no_preload_next"
            switch(r0) {
                case -1039871948: goto L_0x00dd;
                case 3377907: goto L_0x00c5;
                case 3569038: goto L_0x00b1;
                case 97196323: goto L_0x009b;
                case 108389754: goto L_0x0082;
                case 2127382617: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0419
        L_0x006a:
            java.lang.String r9 = "noredir"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x0074
            goto L_0x0419
        L_0x0074:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r1, r11)
            java.lang.String r9 = "disable re-direct"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0082:
            java.lang.String r9 = "redir"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x008d
            goto L_0x0419
        L_0x008d:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.remove(r1)
            java.lang.String r9 = "enable re-direct"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x009b:
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x00a3
            goto L_0x0419
        L_0x00a3:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r3, r9)
            java.lang.String r9 = "not use preload webview"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x00b1:
            boolean r9 = r10.equals(r7)
            if (r9 != 0) goto L_0x00b9
            goto L_0x0419
        L_0x00b9:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r3, r11)
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r2)
            goto L_0x0419
        L_0x00c5:
            java.lang.String r9 = "next"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00cf
            goto L_0x0419
        L_0x00cf:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.remove(r4)
            java.lang.String r9 = "enable preload next webview"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x00dd:
            java.lang.String r9 = "nonext"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00e7
            goto L_0x0419
        L_0x00e7:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r4, r11)
            java.lang.String r9 = "disable preload next webview"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x00f5:
            java.lang.String r9 = "nored"
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L_0x00ff
            goto L_0x0419
        L_0x00ff:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r3, r11)
            java.lang.String r9 = "enable test not in red"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x010d:
            boolean r10 = r1.equals(r5)
            if (r10 != 0) goto L_0x0115
            goto L_0x0419
        L_0x0115:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r4, r9)
            java.lang.String r9 = "not use tmpl webview"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0123:
            boolean r9 = r1.equals(r6)
            if (r9 != 0) goto L_0x012b
            goto L_0x0419
        L_0x012b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.clear()
            java.lang.String r9 = "clear all commands"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0139:
            boolean r9 = r1.equals(r7)
            if (r9 != 0) goto L_0x0141
            goto L_0x0419
        L_0x0141:
            int r9 = r10.length
            java.lang.String r1 = "preload_type"
            if (r9 > r0) goto L_0x015d
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r4, r11)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putInt(r1, r11)
            java.lang.String r9 = "tmpl webview"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x015d:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r4, r11)
            r9 = r10[r0]
            int r10 = r9.hashCode()
            r2 = -1012222381(0xffffffffc3aab653, float:-341.4244)
            if (r10 == r2) goto L_0x01b3
            r2 = -905826493(0xffffffffca022f43, float:-2132944.8)
            if (r10 == r2) goto L_0x019a
            r0 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r10 == r0) goto L_0x017a
            goto L_0x01bc
        L_0x017a:
            java.lang.String r10 = "local"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0183
            goto L_0x01bc
        L_0x0183:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r9 != 0) goto L_0x018b
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r9 == 0) goto L_0x0419
        L_0x018b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10 = 3
            r9.putInt(r1, r10)
            java.lang.String r9 = "local tmpl"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x019a:
            java.lang.String r10 = "server"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01a4
            goto L_0x01bc
        L_0x01a4:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putInt(r1, r0)
            java.lang.String r9 = "test server tmpl"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x01b3:
            java.lang.String r10 = "online"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01cb
        L_0x01bc:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putInt(r1, r11)
            java.lang.String r9 = "release can't use local tmpl, use online tmpl"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x01cb:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putInt(r1, r11)
            java.lang.String r9 = "online tmpl"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x01da:
            java.lang.String r9 = "tmpl"
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L_0x01e5
            goto L_0x0419
        L_0x01e5:
            int r9 = r10.length
            if (r9 <= r0) goto L_0x0419
            r9 = r10[r0]
            int r1 = r9.hashCode()
            java.lang.String r2 = "preload_tmpl_always_verify_md5"
            switch(r1) {
                case -1080348879: goto L_0x0237;
                case 107902: goto L_0x0220;
                case 94627080: goto L_0x0206;
                case 94746189: goto L_0x01f5;
                default: goto L_0x01f4;
            }
        L_0x01f4:
            goto L_0x024e
        L_0x01f5:
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x01fc
            goto L_0x024e
        L_0x01fc:
            xx0.C53458b.m59911c()
            java.lang.String r9 = "clear all tmpl info"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0206:
            java.lang.String r1 = "check"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x020f
            goto L_0x024e
        L_0x020f:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            java.lang.String r10 = "preload_tmpl_always_check_tmpl_ver"
            r9.putBoolean(r10, r11)
            java.lang.String r9 = "enable tmpl always check"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0220:
            java.lang.String r1 = "md5"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0229
            goto L_0x024e
        L_0x0229:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r2, r11)
            java.lang.String r9 = "enable tmpl md5 verify"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0237:
            java.lang.String r1 = "md5off"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0240
            goto L_0x024e
        L_0x0240:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.remove(r2)
            java.lang.String r9 = "disable tmpl md5 verify"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x024e:
            java.lang.String r9 = "[0-9]+"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            r1 = r10[r0]
            java.util.regex.Matcher r9 = r9.matcher(r1)
            boolean r9 = r9.matches()
            if (r9 == 0) goto L_0x0419
            r9 = r10[r0]
            java.lang.String r1 = "0"
            boolean r9 = gy3.C87412m.m108589b(r1, r9)
            java.lang.String r1 = "preload_tmpl_lowerbound"
            if (r9 == 0) goto L_0x027b
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.remove(r1)
            java.lang.String r9 = "clear tmpl lowerbound"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x027b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r2 = r10[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "valueOf(args[2])"
            gy3.C87412m.m108593f(r2, r3)
            int r2 = r2.intValue()
            r9.putInt(r1, r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "tmpl lowerbound: "
            r9.append(r1)
            r10 = r10[r0]
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x02ab:
            java.lang.String r9 = "test"
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L_0x02b6
            goto L_0x0419
        L_0x02b6:
            int r9 = r10.length
            if (r9 <= r0) goto L_0x0419
            r9 = r10[r0]
            java.lang.String r10 = "news"
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x0419
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            java.lang.String r10 = "tencent_view_inews_prefix"
            r9.putBoolean(r10, r11)
            java.lang.String r9 = "test news"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x02d5:
            java.lang.String r2 = "save"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02e0
            goto L_0x0419
        L_0x02e0:
            int r1 = r10.length
            java.lang.String r2 = "save to data dir"
            java.lang.String r3 = "preload_save_type"
            if (r1 > r0) goto L_0x02f5
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r3, r9)
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r2)
            goto L_0x0419
        L_0x02f5:
            r10 = r10[r0]
            java.lang.String r0 = "sd"
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 == 0) goto L_0x030f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r3, r11)
            java.lang.String r9 = "save to sdcard dir"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x030f:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r3, r9)
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r2)
            goto L_0x0419
        L_0x031b:
            java.lang.String r2 = "data"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0325
            goto L_0x0419
        L_0x0325:
            int r1 = r10.length
            java.lang.String r2 = "enable preload data"
            java.lang.String r3 = "preload_data"
            java.lang.String r4 = "preload_data_null"
            if (r1 > r0) goto L_0x0343
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r4, r9)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r3, r11)
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r2)
            goto L_0x0419
        L_0x0343:
            r10 = r10[r0]
            int r0 = r10.hashCode()
            java.lang.String r1 = "preload_data_noexpire"
            switch(r0) {
                case -1354757532: goto L_0x03e6;
                case -1289159393: goto L_0x03d0;
                case 3392903: goto L_0x03b2;
                case 3569038: goto L_0x0398;
                case 94746189: goto L_0x0386;
                case 97196323: goto L_0x0369;
                case 1170077216: goto L_0x0351;
                default: goto L_0x034f;
            }
        L_0x034f:
            goto L_0x0419
        L_0x0351:
            java.lang.String r9 = "noexpire"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x035b
            goto L_0x0419
        L_0x035b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r1, r11)
            java.lang.String r9 = "disable data expire"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0369:
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x0371
            goto L_0x0419
        L_0x0371:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r4, r9)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r3, r9)
            java.lang.String r9 = "disable preload data"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0386:
            boolean r9 = r10.equals(r6)
            if (r9 != 0) goto L_0x038e
            goto L_0x0419
        L_0x038e:
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40709f.m43950a()
            java.lang.String r9 = "clear all cached data"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0398:
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x03a0
            goto L_0x0419
        L_0x03a0:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r4, r9)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.putBoolean(r3, r11)
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r2)
            goto L_0x0419
        L_0x03b2:
            java.lang.String r0 = "null"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x03bb
            goto L_0x0419
        L_0x03bb:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r4, r11)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r10.putBoolean(r3, r9)
            java.lang.String r9 = "test preload null data"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x03d0:
            java.lang.String r9 = "expire"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x03d9
            goto L_0x0419
        L_0x03d9:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.remove(r1)
            java.lang.String r9 = "enable data expire"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x03e6:
            java.lang.String r9 = "cookie"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x03ef
            goto L_0x0419
        L_0x03ef:
            java.lang.Class<s00.f> r9 = s00.C90110f.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            s00.f r9 = (s00.C90110f) r9
            java.lang.String r10 = "com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE"
            r9.mo124149ID(r10)
            java.lang.String r9 = "xweb cookie clear"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
            goto L_0x0419
        L_0x0403:
            java.lang.String r9 = "red"
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L_0x040d
            goto L_0x0419
        L_0x040d:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r9.removeValueForKey(r3)
            java.lang.String r9 = "disable test not in red"
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38876b(r9)
        L_0x0419:
            return r11
        L_0x041a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29782v.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }
}
