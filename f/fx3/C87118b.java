package fx3;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import ev3.C86700b;
import gx3.C87407d;
import java.io.File;

/* renamed from: fx3.b */
public class C87118b extends C86700b {
    public C87118b(Context context) {
        super(context);
    }

    /* renamed from: b */
    public int mo109429b(String str, String str2) {
        ShareTinkerLog.m106533v("Tinker.TinkerServerPatchListener", "receive a patch file: %s, file size:%d", str, Long.valueOf(SharePatchFileUtil.getFileOrDirectorySize(new File(str))));
        int b = super.mo109429b(str, str2);
        if (b != 0) {
            return b;
        }
        int i = C87407d.f253294a;
        return 0;
    }
}
