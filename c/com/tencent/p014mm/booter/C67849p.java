package com.tencent.p014mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import fa3.C75739k;
import hd0.C98410o0;
import lc3.C10485b;
import p682rz.C101488s;
import uc0.C52520q;

/* renamed from: com.tencent.mm.booter.p */
public final class C67849p {

    /* renamed from: com.tencent.mm.booter.p$a */
    public class C67850a {
        /* renamed from: a */
        public void mo93241a(int i, int i2) {
            Log.m105925i("MicroMsg.PostTaskLightweightJob", "CrashStatus report: key %s ", Integer.valueOf(i));
            C115669n.INSTANCE.idkeyStat(25, (long) i, (long) i2, false);
        }
    }

    /* renamed from: a */
    public static void m80214a() {
        Class cls = C10485b.class;
        Context context = MMApplicationContext.getContext();
        C67850a aVar = new C67850a();
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("crash_status_file", 4);
                String[] split = sharedPreferences.getString("crashlist", "").split(";");
                if (split != null) {
                    if (split.length >= 1) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString("crashlist", "");
                        edit.commit();
                        for (int i = 0; i < split.length; i++) {
                            String str = split[i];
                            String[] split2 = str == null ? null : str.split(",");
                            if (split2 != null) {
                                if (split2.length >= 2) {
                                    if (split2[1].equals("anr")) {
                                        aVar.mo93241a(10, 1);
                                    } else {
                                        aVar.mo93241a(11, 1);
                                        if (MMApplicationContext.getApplicationId().equals(split2[0])) {
                                            aVar.mo93241a(14, 1);
                                        }
                                        if ((MMApplicationContext.getApplicationId() + ":push").equals(split2[0])) {
                                            aVar.mo93241a(17, 1);
                                        }
                                        if ((MMApplicationContext.getApplicationId() + ":tools").equals(split2[0])) {
                                            aVar.mo93241a(20, 1);
                                        }
                                        if (split2[1].equals("java")) {
                                            aVar.mo93241a(12, 1);
                                            if (MMApplicationContext.getApplicationId().equals(split2[0])) {
                                                aVar.mo93241a(15, 1);
                                            }
                                            if ((MMApplicationContext.getApplicationId() + ":push").equals(split2[0])) {
                                                aVar.mo93241a(18, 1);
                                            }
                                            if ((MMApplicationContext.getApplicationId() + ":tools").equals(split2[0])) {
                                                aVar.mo93241a(21, 1);
                                            }
                                        }
                                        if (split2[1].equals("jni")) {
                                            aVar.mo93241a(13, 1);
                                            if (MMApplicationContext.getApplicationId().equals(split2[0])) {
                                                aVar.mo93241a(16, 1);
                                            }
                                            if ((MMApplicationContext.getApplicationId() + ":push").equals(split2[0])) {
                                                aVar.mo93241a(19, 1);
                                            }
                                            if ((MMApplicationContext.getApplicationId() + ":tools").equals(split2[0])) {
                                                aVar.mo93241a(22, 1);
                                            }
                                        }
                                        if (split2[1].equals("first")) {
                                            if (MMApplicationContext.getApplicationId().equals(split2[0])) {
                                                aVar.mo93241a(23, 1);
                                            }
                                            if ((MMApplicationContext.getApplicationId() + ":push").equals(split2[0])) {
                                                aVar.mo93241a(24, 1);
                                            }
                                            if ((MMApplicationContext.getApplicationId() + ":tools").equals(split2[0])) {
                                                aVar.mo93241a(25, 1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Context context2 = MMApplicationContext.getContext();
        int b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("AndroidGooglePlayCrashUploadSizeLimit", 8192);
        if (context2 != null && b > 0) {
            try {
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("crash_status_file", 4);
                if (sharedPreferences2.getInt("googleplaysizelimit", 8192) != b) {
                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    edit2.putInt("googleplaysizelimit", b);
                    edit2.commit();
                }
            } catch (Throwable unused2) {
            }
        }
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_REPORT_LAST_TIME_REPORT_DYNACFG_VER_LONG;
        if (Util.milliSecondsToNow(Util.nullAs((Long) u.mo119685f(aVar2, (Object) null), 0)) > 21600000) {
            C115669n.INSTANCE.idkeyStat(279, (long) (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("AndroidDynamicConfigVer", 0) % 16), 1, false);
            C97625j3.m125812b().mo105906u().mo119677K(aVar2, Long.valueOf(Util.nowMilliSecond()));
        }
        C85801v1 u2 = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_REPORT_LAST_TIME_REPORT_VIDEO_SEND_RECV_COUNT_LONG;
        if (Util.milliSecondsToNow(Util.nullAs((Long) u2.mo119685f(aVar3, (Object) null), 0)) > 21600000) {
            C97625j3.m125812b().mo105906u().mo119677K(aVar3, Long.valueOf(Util.nowMilliSecond()));
            C98410o0 o0Var = (C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0();
            o0Var.getClass();
            int[] iArr = {0, 0, 0, 0, 0, 0};
            try {
                String str2 = "select status, videofuncflag, human from videoinfo2 where lastmodifytime > " + (Util.nowSecond() - 21600);
                Log.m105925i("MicroMsg.VideoInfoStorage", "reportVideoMsgCount sql:%s", str2);
                Cursor rawQuery = o0Var.f288587a.rawQuery(str2, (String[]) null, 2);
                while (true) {
                    char c = 5;
                    char c2 = 3;
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    int i2 = rawQuery.getInt(0);
                    int i3 = rawQuery.getInt(1);
                    String string = rawQuery.getString(2);
                    if (111 == i2) {
                        if (i3 == 3) {
                            c2 = 0;
                        }
                        iArr[c2] = iArr[c2] + 1;
                    } else if (199 == i2) {
                        if (C75592q0.m90789s().equals(string)) {
                            char c3 = i3 == 3 ? (char) 1 : 4;
                            iArr[c3] = iArr[c3] + 1;
                        } else {
                            if (i3 == 3) {
                                c = 2;
                            }
                            iArr[c] = iArr[c] + 1;
                        }
                    }
                }
                rawQuery.close();
                C115669n.INSTANCE.mo160131h(12696, 10010, Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2]), Integer.valueOf(iArr[3]), Integer.valueOf(iArr[4]), Integer.valueOf(iArr[5]));
            } catch (Exception unused3) {
            }
        }
        if (Util.nowMilliSecond() - Util.nullAs((Long) C86709a0.m107535s().mo121142i().mo119684e(81939, (Object) null), 0) > 86400000) {
            new C52520q();
        }
        long currentTimeMillis = System.currentTimeMillis();
        C85801v1 u3 = C97625j3.m125812b().mo105906u();
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) u3.mo119684e(233475, bool)).booleanValue();
        if (C97625j3.m125812b().mo105907v().mo69669R3() <= 0) {
            if (!booleanValue) {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("officialaccounts");
                C97625j3.m125812b().mo105906u().mo119676J(233475, Boolean.TRUE);
            }
        } else if (booleanValue) {
            C97625j3.m125812b().mo105906u().mo119676J(233475, bool);
        }
        ((C75739k) C86312j.m106911c(C75739k.class)).vx0().mo106057b();
        Log.m105925i("MicroMsg.PostTaskLightweightJob", "use time %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
