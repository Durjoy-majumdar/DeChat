package p833zk;

import android.content.pm.PackageManager;
import android.util.AndroidException;
import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import f40.C86709a0;
import lc3.C10485b;
import p490dl.C97496s;
import p663qo.C101211h;

/* renamed from: zk.i */
public final class C103048i {
    /* renamed from: a */
    public static final boolean m136279a(EmojiInfo emojiInfo) {
        return emojiInfo != null && !Util.isNullOrNil(emojiInfo.field_encrypturl) && !Util.isNullOrNil(emojiInfo.field_aeskey);
    }

    /* renamed from: b */
    public static final boolean m136280b(EmojiInfo emojiInfo) {
        boolean z;
        boolean z2;
        EmojiInfo emojiInfo2 = emojiInfo;
        if (emojiInfo2 == null) {
            return false;
        }
        if (!C97496s.f286150a) {
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableEmoticonExternUrl", 0);
            int errorCode = MMWXGFJNI.getErrorCode();
            if ((b & 1) == 1) {
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
                        C97496s.f286153d = true;
                    }
                }
                C97496s.f286153d = false;
            } else {
                C97496s.f286153d = false;
            }
            if (errorCode < 0) {
                C97496s.f286153d = false;
                switch (errorCode) {
                    case -906:
                        C115669n.INSTANCE.idkeyStat(711, 10, 1, false);
                        break;
                    case -905:
                        C115669n.INSTANCE.idkeyStat(711, 9, 1, false);
                        break;
                    case -904:
                        C115669n.INSTANCE.idkeyStat(711, 8, 1, false);
                        break;
                    case -903:
                        C115669n.INSTANCE.idkeyStat(711, 7, 1, false);
                        break;
                    case -902:
                        C115669n.INSTANCE.idkeyStat(711, 6, 1, false);
                        break;
                    case -901:
                        C115669n.INSTANCE.idkeyStat(711, 5, 1, false);
                        break;
                }
            }
            C97496s.f286150a = true;
            Log.m105925i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDownload:%b", Boolean.valueOf(C97496s.f286153d));
        }
        return (C97496s.f286153d && ((C101211h) C86312j.m106911c(C101211h.class)).mo140276It()) && !Util.isNullOrNil(emojiInfo2.field_externUrl) && !Util.isNullOrNil(emojiInfo2.field_aeskey);
    }
}
