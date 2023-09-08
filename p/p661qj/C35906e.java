package p661qj;

import android.content.Context;
import com.tencent.p014mm.autogen.events.HotPatchApplyEvent;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import eb0.C97625j3;
import iv3.C87821a;
import yc3.C38992a;

/* renamed from: qj.e */
public class C35906e implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f95797a = 0;

    static {
        C30650a.m39147b(new C35906e(), "//hotpatch");
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (Log.getLogLevel() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        String str2 = strArr[1];
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case 3237038:
                if (str2.equals("info")) {
                    c = 0;
                    break;
                }
                break;
            case 93029230:
                if (str2.equals("apply")) {
                    c = 1;
                    break;
                }
                break;
            case 94627080:
                if (str2.equals("check")) {
                    c = 2;
                    break;
                }
                break;
            case 94746189:
                if (str2.equals("clear")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Log.m105919d("MicroMsg.CommandTestHotPatches", "hotpatch current class loader=%s", C35906e.class.getClassLoader());
                return true;
            case 1:
                String str3 = strArr.length < 3 ? "/data/local/tmp/test.apk" : strArr[2];
                Log.m105919d("MicroMsg.CommandTestHotPatches", "hotpatch test from %s", str3);
                if (!C87821a.m109275c(context).f254239l) {
                    C87821a.m109275c(context).mo122277a();
                }
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_TINKER_BOOTS_CHECK_LAST_TIME_LONG, Long.valueOf(System.currentTimeMillis() - 300000));
                HotPatchApplyEvent hotPatchApplyEvent = new HotPatchApplyEvent();
                hotPatchApplyEvent.f78833d.f78838e = str3;
                hotPatchApplyEvent.publish();
                return true;
            case 2:
                if (strArr.length < 3) {
                    return true;
                }
                String str4 = strArr[2];
                if (!str4.startsWith("/")) {
                    str4 = context.getCacheDir().getParent() + "/app_dex/" + str4;
                }
                Log.m105925i("MicroMsg.CommandTestHotPatches", "hotpatch check patch file %s", str4);
                Log.m105924i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
                Log.m105924i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
                Log.m105925i("MicroMsg.CommandTestHotPatches", "hotpatch check md5, passed=%b", Boolean.valueOf(SharePatchFileUtil.checkIfMd5Valid(str4)));
                Log.m105924i("MicroMsg.CommandTestHotPatches", "-------------------------------------------------------------------------------------");
                return true;
            case 3:
                Log.m105918d("MicroMsg.CommandTestHotPatches", "clear hotpatch");
                HotPatchApplyEvent hotPatchApplyEvent2 = new HotPatchApplyEvent();
                hotPatchApplyEvent2.f78833d.f78839f = 1;
                hotPatchApplyEvent2.publish();
                return true;
            default:
                return true;
        }
    }
}
