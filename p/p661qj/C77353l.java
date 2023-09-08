package p661qj;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import ie3.C76324c;
import java.util.HashMap;
import ke3.C88144b;
import l20.C21388a;
import p287zz.C79442f;
import p327ct.C30914c;
import yc3.C38992a;

/* renamed from: qj.l */
public class C77353l implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f225545a = 0;

    /* renamed from: qj.l$a */
    public class C77354a implements C79442f.C79443a {
        public C77354a(C77353l lVar) {
        }

        public void onCompletion() {
        }
    }

    static {
        C30650a.m39147b(new C77353l(), "//pay");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (strArr.length < 2) {
            return true;
        }
        String str2 = strArr[1];
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1943286194:
                if (str2.equals("forcenewcashier")) {
                    c = 0;
                    break;
                }
                break;
            case -1543416301:
                if (str2.equals("resethbguide")) {
                    c = 1;
                    break;
                }
                break;
            case -1326045846:
                if (str2.equals("dorder")) {
                    c = 2;
                    break;
                }
                break;
            case -15397537:
                if (str2.equals("kindatest")) {
                    c = 3;
                    break;
                }
                break;
            case 99657:
                if (str2.equals("dot")) {
                    c = 4;
                    break;
                }
                break;
            case 174797075:
                if (str2.equals("sethassource")) {
                    c = 5;
                    break;
                }
                break;
            case 1110195625:
                if (str2.equals("fackchatting")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (strArr.length >= 3) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FORCE_USE_NEW_CASHIER_INT_SYNC, Integer.valueOf(Util.getInt(strArr[2], 0)));
                }
                return true;
            case 1:
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_GUIDE_TIME_INT_SYNC, 0);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_PREVIEW_GUIDE_TIME_INT_SYNC, 0);
                return true;
            case 2:
                C88144b.m109789g(context, "wallet", ".pwd.ui.WalletUniversalPayOrderUI");
                return true;
            case 3:
                ((C76324c) C86312j.m106911c(C76324c.class)).startUiTest();
                return true;
            case 4:
                ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33508q(C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, true);
                return true;
            case 5:
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 1);
                return true;
            case 6:
                ((C79442f) C86312j.m106911c(C79442f.class)).mo109164Y9(context, new HashMap(), new C77354a(this));
                return true;
            default:
                return false;
        }
    }
}
