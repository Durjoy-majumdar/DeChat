package com.tencent.p014mm.plugin.newtips.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc2.C116945b;
import jc2.C117341a;
import te3.vg4;

/* renamed from: com.tencent.mm.plugin.newtips.model.e */
public class C115621e {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        if (r8.mo175779a(r2) != false) goto L_0x0083;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.tencent.p014mm.plugin.newtips.model.C115626k> m162558b(java.util.List<com.tencent.p014mm.plugin.newtips.model.C115626k> r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r10 == 0) goto L_0x00d1
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x00d1
        L_0x000f:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r2 = 274436(0x43004, float:3.84567E-40)
            r3 = 0
            java.lang.Object r1 = r1.mo119684e(r2, r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Iterator r10 = r10.iterator()
        L_0x0025:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00d1
            java.lang.Object r2 = r10.next()
            com.tencent.mm.plugin.newtips.model.k r2 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r2
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0036
            goto L_0x0090
        L_0x0036:
            int r6 = r2.field_tipId
            com.tencent.mm.plugin.newtips.model.j r6 = com.tencent.p014mm.plugin.newtips.model.C115622f.m162564a(r6)
            int r7 = r2.field_path
            com.tencent.mm.plugin.newtips.model.f r8 = com.tencent.p014mm.plugin.newtips.model.C115622f.f346847c
            if (r8 != 0) goto L_0x0049
            com.tencent.mm.plugin.newtips.model.f r8 = new com.tencent.mm.plugin.newtips.model.f
            r8.<init>()
            com.tencent.p014mm.plugin.newtips.model.C115622f.f346847c = r8
        L_0x0049:
            com.tencent.mm.plugin.newtips.model.f r8 = com.tencent.p014mm.plugin.newtips.model.C115622f.f346847c
            r8.getClass()
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.newtips.model.m> r8 = com.tencent.p014mm.plugin.newtips.model.C115622f.f346846b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r9)
            com.tencent.mm.plugin.newtips.model.m r8 = (com.tencent.p014mm.plugin.newtips.model.C115630m) r8
            if (r8 != 0) goto L_0x006e
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r4] = r7
            java.lang.String r7 = "MicroMsg.NewTips.NewTipsFilterPool"
            java.lang.String r9 = "Invalid pathId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r8)
            r8 = r3
        L_0x006e:
            if (r6 != 0) goto L_0x0073
            if (r8 != 0) goto L_0x0073
            goto L_0x0083
        L_0x0073:
            if (r6 == 0) goto L_0x0085
            if (r8 == 0) goto L_0x0085
            boolean r6 = r6.mo175760b(r2)
            if (r6 == 0) goto L_0x0090
            boolean r6 = r8.mo175779a(r2)
            if (r6 == 0) goto L_0x0090
        L_0x0083:
            r4 = 1
            goto L_0x0090
        L_0x0085:
            if (r6 == 0) goto L_0x008c
            boolean r4 = r6.mo175760b(r2)
            goto L_0x0090
        L_0x008c:
            boolean r4 = r8.mo175779a(r2)
        L_0x0090:
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = r2.field_lang
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x00ae
            java.lang.String r4 = r2.field_lang
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            java.lang.String r5 = r5.toLowerCase()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0025
        L_0x00ae:
            java.lang.String r4 = r2.field_regCountry
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x00cc
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0025
            java.lang.String r4 = r2.field_regCountry
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r5 = r1.toLowerCase()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0025
        L_0x00cc:
            r0.add(r2)
            goto L_0x0025
        L_0x00d1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.newtips.model.C115621e.m162558b(java.util.List):java.util.List");
    }

    /* renamed from: a */
    public boolean mo175753a(C115620d dVar) {
        if (dVar == null) {
            Log.m105920e("MicroMsg.NewTipsManager", "can not show new  tips！！ tipsInfo is null !!");
            return false;
        } else if (dVar.field_isExit && !dVar.field_hadRead && mo175756e(dVar)) {
            return true;
        } else {
            Log.m105925i("MicroMsg.NewTipsManager", "can not show tips, isExit:%s, hadRead:%s, timeEffective:%s", Boolean.valueOf(dVar.field_isExit), Boolean.valueOf(dVar.field_hadRead), Boolean.valueOf(mo175756e(dVar)));
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo175754c(C115620d dVar) {
        vg4 vg4;
        vg4 vg42;
        if (dVar == null) {
            Log.m105920e("MicroMsg.NewTipsManager", "check path, tipsInfo is null!!!");
            return false;
        }
        C115620d jo = C116945b.vx0().mo182002jo(dVar.field_tipId);
        if (!(jo == null || (vg4 = jo.field_tipsShowInfo) == null || (vg42 = dVar.field_tipsShowInfo) == null)) {
            String str = vg4.f354506g;
            String str2 = vg42.f354506g;
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return true;
            }
            Log.m105925i("MicroMsg.NewTipsManager", "path illegal, localPath:%s, newPath:%s", str, str2);
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo175755d(int i) {
        long j;
        long j2;
        int i2;
        int i3;
        vg4 vg4;
        String str;
        String str2;
        int i4 = i;
        C115620d jo = C116945b.vx0().mo182002jo(i4);
        if (jo == null) {
            Log.m105920e("MicroMsg.NewTipsManager", "showDot, newTipsInfo is null !!");
            return false;
        } else if (!mo175753a(C116945b.vx0().mo182002jo(i4)) || (vg4 = jo.field_tipsShowInfo) == null || vg4.f354503d != 0) {
            String str3 = "newtips_realshow_time";
            String str4 = "_newtips_report";
            String format = String.format("newtips_dismiss_%d-%d", new Object[]{Integer.valueOf(jo.field_tipId), Integer.valueOf(jo.field_tipVersion)});
            if (MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + str4, 0).getBoolean(format, false)) {
                return false;
            }
            int i5 = jo.field_tipId;
            int i6 = jo.field_tipVersion;
            int i7 = jo.field_tipType;
            long j3 = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + str4, 0).getLong("newtips_gettipstime", 0);
            long j4 = jo.field_beginShowTime;
            long j5 = jo.field_overdueTime;
            long j6 = jo.field_disappearTime;
            Context context = MMApplicationContext.getContext();
            StringBuilder sb = new StringBuilder();
            String str5 = format;
            sb.append(MMApplicationContext.getDefaultPreferencePath());
            sb.append(str4);
            SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
            int i8 = i7;
            long j7 = sharedPreferences.getLong(str3, 0);
            long j8 = j6;
            long j9 = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + str4, 0).getLong("newtips_makeread_time", 0);
            long j15 = j9 - j7;
            long nowSecond = Util.nowSecond();
            if (!mo175754c(jo) || !mo175757f(jo)) {
                j = j15;
                i2 = i8;
                j2 = j4;
                i3 = 1;
            } else if (jo.field_hadRead) {
                j = j15;
                i2 = i8;
                j2 = j4;
                i3 = 4;
            } else {
                j = j15;
                long j16 = jo.field_disappearTime;
                if (j16 == 0 || nowSecond <= j16) {
                    i2 = i8;
                    long j17 = jo.field_overdueTime;
                    j2 = j4;
                    if (j17 != 0) {
                        long j18 = jo.field_beginShowTime + j17;
                        if (j18 <= j16 && nowSecond > j18) {
                            i3 = 2;
                        }
                    }
                    i3 = 0;
                } else {
                    i2 = i8;
                    j2 = j4;
                    i3 = 3;
                }
            }
            vg4 vg42 = jo.field_tipsShowInfo;
            int i9 = vg42 != null ? vg42.f354503d : 0;
            String str6 = vg42 != null ? vg42.f354504e : "";
            String str7 = vg42 != null ? vg42.f354505f : "";
            String str8 = vg42 != null ? vg42.f354506g : "";
            long j19 = jo.field_pagestaytime;
            String str9 = str4;
            Log.m105925i("MicroMsg.NewTipsManager", "newtipsreport:%d", 2);
            C115669n.INSTANCE.mo160131h(14995, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i2), Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j5), Long.valueOf(j8), Long.valueOf(j7), Long.valueOf(j9), Long.valueOf(j), Integer.valueOf(i3), Integer.valueOf(i9), str6, str7, str8, "", 2, Long.valueOf(j19));
            if (i2 == 1) {
                C117341a vx02 = C116945b.vx0();
                vx02.getClass();
                String str10 = "delete from NewTipsInfo where tipId = " + jo.field_tipId;
                Log.m105924i("MicroMsg.NewTipsCompatInfoStorage", "delete sql: " + str10);
                vx02.f351287d.execSQL("NewTipsInfo", str10);
                vx02.doNotify(jo.field_tipId + "", 5, Integer.valueOf(jo.field_tipId));
            }
            MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + str9, 0).edit().putBoolean(str5, true).commit();
            return false;
        } else {
            String format2 = String.format("newtips_show_%d-%d", new Object[]{Integer.valueOf(jo.field_tipId), Integer.valueOf(jo.field_tipVersion)});
            if (MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).getBoolean(format2, false)) {
                return true;
            }
            int i15 = jo.field_tipId;
            int i16 = jo.field_tipVersion;
            int i17 = jo.field_tipType;
            long j25 = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).getLong("newtips_gettipstime", 0);
            int i18 = i15;
            long nowMilliSecond = Util.nowMilliSecond();
            Context context2 = MMApplicationContext.getContext();
            StringBuilder sb4 = new StringBuilder();
            String str11 = format2;
            sb4.append(MMApplicationContext.getDefaultPreferencePath());
            sb4.append("_newtips_report");
            context2.getSharedPreferences(sb4.toString(), 0).edit().putLong("newtips_realshow_time", nowMilliSecond).commit();
            vg4 vg43 = jo.field_tipsShowInfo;
            int i19 = vg43 != null ? vg43.f354503d : 0;
            String str12 = vg43 != null ? vg43.f354504e : "";
            String str13 = vg43 != null ? vg43.f354505f : "";
            if (vg43 != null) {
                str2 = vg43.f354506g;
                str = "_newtips_report";
            } else {
                str = "_newtips_report";
                str2 = "";
            }
            Log.m105925i("MicroMsg.NewTipsManager", "newtipsreport:%d", 1);
            C115669n.INSTANCE.mo160131h(14995, Integer.valueOf(i18), Integer.valueOf(i16), Integer.valueOf(i17), Long.valueOf(j25), "", "", "", Long.valueOf(nowMilliSecond), "", "", "", Integer.valueOf(i19), str12, str13, str2, "", 1, "");
            MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + str, 0).edit().putBoolean(str11, true).commit();
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo175756e(C115620d dVar) {
        boolean z;
        if (dVar == null) {
            Log.m105920e("MicroMsg.NewTipsManager", "check time, tipsInfo is null!!!");
            return false;
        }
        long nowSecond = Util.nowSecond();
        long j = dVar.field_overdueTime;
        if (j == 0 && dVar.field_disappearTime == 0) {
            z = true;
        } else {
            Long valueOf = Long.valueOf(Math.min(dVar.field_beginShowTime + j, dVar.field_disappearTime));
            z = nowSecond >= dVar.field_beginShowTime && nowSecond <= valueOf.longValue();
            if (nowSecond > valueOf.longValue()) {
                long nowMilliSecond = Util.nowMilliSecond();
                Context context = MMApplicationContext.getContext();
                context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", nowMilliSecond).commit();
            }
        }
        Log.m105925i("MicroMsg.NewTipsManager", "timeEffective current: %s, overdueTime: %s, disappearTime: %s, show:%s", Long.valueOf(nowSecond), Long.valueOf(dVar.field_overdueTime), Long.valueOf(dVar.field_disappearTime), Boolean.valueOf(z));
        return z;
    }

    /* renamed from: f */
    public boolean mo175757f(C115620d dVar) {
        if (dVar == null) {
            Log.m105920e("MicroMsg.NewTipsManager", "check version, tipsInfo is null!!!");
            return false;
        }
        C115620d jo = C116945b.vx0().mo182002jo(dVar.field_tipId);
        if (jo != null) {
            int i = dVar.field_tipVersion;
            int i2 = jo.field_tipVersion;
            if (i <= i2) {
                return !dVar.field_hadRead && i == i2;
            }
            return true;
        }
    }
}
