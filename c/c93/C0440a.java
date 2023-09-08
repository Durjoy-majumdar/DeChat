package c93;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import java.util.Map;
import t83.C13851h1;

/* renamed from: c93.a */
public class C0440a {

    /* renamed from: a */
    public static final String[] f1064a = {XWalkPlugin.PRIVATE_CACHE_DIR_NAME, "publicCache"};

    /* renamed from: a */
    public static boolean m378a(C13851h1 h1Var, MsgHandler msgHandler) {
        if (!(msgHandler == null || h1Var == null || TextUtils.isEmpty(h1Var.f38996i))) {
            String[] strArr = f1064a;
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                if (str.equalsIgnoreCase(h1Var.f38996i)) {
                    msgHandler.mo7210k5(h1Var, str + XVFSFile.PATH_SEPARATOR + "not in white list", (Map<String, Object>) null);
                    return true;
                }
            }
        }
        return false;
    }
}
