package p490dl;

import android.content.pm.PackageManager;
import android.util.AndroidException;
import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import lc3.C10485b;
import p663qo.C101211h;

/* renamed from: dl.s */
public class C97496s {

    /* renamed from: a */
    public static boolean f286150a;

    /* renamed from: b */
    public static boolean f286151b;

    /* renamed from: c */
    public static boolean f286152c;

    /* renamed from: d */
    public static boolean f286153d;

    /* renamed from: e */
    public static boolean f286154e;

    /* renamed from: f */
    public static boolean f286155f;

    /* renamed from: a */
    public static int m125613a() {
        return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("CustomEmojiMaxSize"), 999);
    }

    /* renamed from: b */
    public static boolean m125614b() {
        boolean z;
        boolean z2;
        if (!f286151b) {
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableEmoticonExternUrl", 0);
            int errorCode = MMWXGFJNI.getErrorCode();
            if ((b & 2) == 2) {
                try {
                    MMApplicationContext.getContext().getPackageManager().getPackageInfo("com.google.android.wearable.app.cn", 1);
                    z = true;
                } catch (PackageManager.NameNotFoundException | AndroidException | Exception unused) {
                    z = false;
                }
                if (!z) {
                    try {
                        MMApplicationContext.getContext().getPackageManager().getPackageInfo("com.google.android.wearable.app", 1);
                        z2 = true;
                    } catch (AndroidException | Exception unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        f286154e = true;
                        C115669n.INSTANCE.idkeyStat(711, 1, 1, false);
                    }
                }
                C115669n.INSTANCE.idkeyStat(711, 0, 1, false);
                f286154e = false;
            } else {
                f286154e = false;
            }
            if (errorCode < 0) {
                f286154e = false;
            }
            f286151b = true;
            Log.m105925i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDecode:%b", Boolean.valueOf(f286154e));
        }
        return f286154e && ((C101211h) C86312j.m106911c(C101211h.class)).mo140276It();
    }

    /* renamed from: c */
    public static boolean m125615c() {
        ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_spring_festival, 0);
        ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EmotionSpringFestivalPendantSwitch", 0);
        return false;
    }
}
