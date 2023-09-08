package iv3;

import android.content.Intent;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

/* renamed from: iv3.b */
public class C87824b {
    /* renamed from: a */
    public static void m109279a(ApplicationLike applicationLike) {
        if (applicationLike == null || applicationLike.getApplication() == null) {
            throw new TinkerRuntimeException("tinkerApplication is null");
        }
        ShareTinkerInternals.cleanPatch(applicationLike.getApplication());
    }

    /* renamed from: b */
    public static String m109280b(ApplicationLike applicationLike) {
        if (applicationLike == null || applicationLike.getApplication() == null) {
            throw new TinkerRuntimeException("tinkerApplication is null");
        }
        Intent tinkerResultIntent = applicationLike.getTinkerResultIntent();
        if (tinkerResultIntent == null) {
            return null;
        }
        String stringExtra = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_OLD_VERSION);
        String stringExtra2 = ShareIntentUtil.getStringExtra(tinkerResultIntent, ShareIntentUtil.INTENT_PATCH_NEW_VERSION);
        boolean isInMainProcess = ShareTinkerInternals.isInMainProcess(applicationLike.getApplication());
        if (stringExtra == null || stringExtra2 == null) {
            return null;
        }
        return isInMainProcess ? stringExtra2 : stringExtra;
    }

    /* renamed from: c */
    public static boolean m109281c(ApplicationLike applicationLike) {
        if (applicationLike == null || applicationLike.getApplication() == null) {
            throw new TinkerRuntimeException("tinkerApplication is null");
        }
        Intent tinkerResultIntent = applicationLike.getTinkerResultIntent();
        return tinkerResultIntent != null && ShareIntentUtil.getIntentReturnCode(tinkerResultIntent) == 0;
    }
}
