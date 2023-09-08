package rn2;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import java.text.SimpleDateFormat;
import java.util.Random;

/* renamed from: rn2.a */
public class C77542a {

    /* renamed from: a */
    public static SimpleDateFormat f226070a;

    /* renamed from: a */
    public static void m93500a() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_OPEN_BOOLEAN_SYNC;
        Log.m105924i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance()");
        if (!m93506g()) {
            Log.m105924i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is not open");
            if (m93505f()) {
                C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.TRUE);
                Log.m105924i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() open shake card entrance");
                return;
            }
            Log.m105924i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time");
            return;
        }
        Log.m105924i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is open");
        if (!m93505f()) {
            Log.m105924i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time, close card entrance");
            C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.FALSE);
        }
    }

    /* renamed from: b */
    public static int m93501b() {
        int currentTimeMillis = (((int) (System.currentTimeMillis() % 10)) + new Random((long) C97625j3.m125812b().mo105881G()).nextInt(10)) % 10;
        Log.m105924i("MicroMsg.ShakeCardUtil", "genShakeCardFrequencyLevel retRand:" + currentTimeMillis);
        return currentTimeMillis;
    }

    /* renamed from: c */
    public static int m93502c() {
        return ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, 0)).intValue();
    }

    /* renamed from: d */
    public static String m93503d() {
        return (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, "");
    }

    /* renamed from: e */
    public static int m93504e(int i) {
        switch (i) {
            case 1:
                return 20;
            case 2:
                return 30;
            case 3:
                return 60;
            case 4:
                return 90;
            case 5:
                return 120;
            case 6:
                return 150;
            case 7:
                return 180;
            case 8:
                return 240;
            case 9:
                return 300;
            default:
                return 10;
        }
    }

    /* renamed from: f */
    public static boolean m93505f() {
        int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, 0)).intValue();
        int intValue2 = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, 0)).intValue();
        Log.m105924i("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time : " + intValue + " end time : " + intValue2);
        if (intValue <= 0) {
            Log.m105920e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is " + intValue + " , invalid");
            return false;
        } else if (intValue2 <= 0) {
            Log.m105920e("MicroMsg.ShakeCardUtil", "ShakeCardUtil end time  is " + intValue2 + " , invalid");
            return false;
        } else if (intValue >= intValue2) {
            Log.m105920e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is >= end time, invalid time");
            return false;
        } else {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            Log.m105924i("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time : " + currentTimeMillis);
            if (currentTimeMillis < intValue || currentTimeMillis > intValue2) {
                Log.m105920e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is not incled in [btime, etime]");
                return false;
            }
            Log.m105920e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is incled in [btime, etime]");
            return true;
        }
    }

    /* renamed from: g */
    public static boolean m93506g() {
        if (!C97625j3.m125811a()) {
            Log.m105920e("MicroMsg.ShakeCardUtil", "acc is not ready");
            return false;
        }
        Object f = C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_OPEN_BOOLEAN_SYNC, Boolean.FALSE);
        if (f != null) {
            return ((Boolean) f).booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m93507h() {
        return m93506g() && LocaleUtil.isChineseAppLang();
    }
}
