package ko3;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72796i;
import com.tencent.p014mm.sdk.platformtools.Util;
import zj3.C79386v0;

/* renamed from: ko3.b */
public class C76621b {
    /* renamed from: a */
    public static boolean m92255a(String str, Bundle bundle, C74974a.C74975a aVar) {
        Uri uri;
        if (!Util.isEqual(str, "com.sogou.inputmethod.exp.commit") || bundle == null || (uri = (Uri) bundle.getParcelable("EXP_PATH_URI")) == null || aVar == null) {
            return false;
        }
        return ((C79386v0) ((C72796i) aVar).f212187a.f211826V1.mo100531a().f193278b.mo102812a(C79386v0.class)).mo102589V2(uri);
    }
}
