package j11;

import android.content.Context;
import com.tencent.p014mm.autogen.events.CleanWxFileIndexEvent;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import nj3.C76912y0;
import yc3.C38992a;

/* renamed from: j11.a */
public class C98893a implements C38992a {
    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (strArr.length == 0) {
            return false;
        }
        String str2 = strArr[0];
        str2.getClass();
        if (!str2.equals("//clean") || strArr.length < 2) {
            return false;
        }
        String str3 = strArr[1];
        str3.getClass();
        char c = 65535;
        switch (str3.hashCode()) {
            case -2146994480:
                if (str3.equals("rescan-rescue")) {
                    c = 0;
                    break;
                }
                break;
            case 95467907:
                if (str3.equals("delay")) {
                    c = 1;
                    break;
                }
                break;
            case 108404047:
                if (str3.equals("reset")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_RESCUE_CURSOR_LONG_SYNC, Long.MIN_VALUE);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_CURSOR_LONG_SYNC, Long.MIN_VALUE);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_DONE_LONG_SYNC, Long.MIN_VALUE);
                C76912y0.makeText(context, (CharSequence) "Reset rescue cursor.", 0).show();
                return true;
            case 1:
                if (strArr.length < 5) {
                    return false;
                }
                C98896e.wx0().f289911i = new long[]{Util.getLong(strArr[2], 0) * 1000, Util.getLong(strArr[3], 0) * 1000, Util.getLong(strArr[4], 0) * 1000, Util.getLong(strArr[5], 0) * 1000};
                return true;
            case 2:
                MultiProcessMMKV.getMMKV("CleanCalcMMKV").removeValuesForKeys(new String[]{"CleanCalcAlreadyResetIndex", "CleanCalcResetIndexTime"});
                new CleanWxFileIndexEvent().publish();
                C76912y0.makeText(context, (CharSequence) "clean wx file index now.", 0).show();
                return true;
        }
        return false;
    }
}
