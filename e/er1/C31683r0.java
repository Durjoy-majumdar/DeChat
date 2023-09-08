package er1;

import com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import cy3.C86153j;
import f40.C86709a0;
import gy3.C87412m;
import java.io.File;
import z04.C112551y;

/* renamed from: er1.r0 */
public final class C31683r0 implements Runnable {

    /* renamed from: d */
    public static final C31683r0 f84625d = new C31683r0();

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        String str = C86709a0.m107535s().f251806d;
        C87412m.m108593f(str, "storage().accPath");
        String n = C112551y.m153814n(str, "MicroMsg", XWalkPlugin.PRIVATE_CACHE_DIR_NAME, false);
        String str2 = C86709a0.m107535s().f251806d;
        String str3 = n + "finder/video/";
        String str4 = str2 + "finder/video/";
        boolean c = C86153j.m106664c(new File(str3));
        boolean c2 = C86153j.m106664c(new File(str4));
        String str5 = n + "finder/image/";
        String str6 = str2 + "finder/image/";
        boolean c3 = C86153j.m106664c(new File(str5));
        boolean c4 = C86153j.m106664c(new File(str6));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_CLEAN_OLD_FINDER_MEDIA_BOOLEAN, Boolean.FALSE);
        Log.m105924i(FinderFolderClearManager.f161638b, "[checkClear] clear old finder media dir. oldFinderVideoPath=" + str3 + " oldBeforeVFSFinderVideoPath=" + str4 + " ret=(" + c + XVFSFile.PATH_SEPARATOR_CHAR + c2 + '-' + c3 + XVFSFile.PATH_SEPARATOR_CHAR + c4 + ") Cost=" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
    }
}
