package o62;

import android.content.Context;
import android.os.Bundle;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: o62.g */
public abstract class C35111g {
    /* renamed from: d */
    public String mo59873d(Map<String, String> map, String str) {
        int i = 0;
        while (true) {
            String str2 = ".sysmsg.sysmsgtemplate.content_template.link_list.link";
            if (i != 0) {
                str2 = str2 + i;
            }
            if (Util.isNullOrNil(map.get(str2))) {
                return null;
            }
            if (Util.isEqual(map.get(str2 + ".$type"), str)) {
                return str2;
            }
            i++;
        }
    }

    /* renamed from: q */
    public abstract void mo59874q(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2);

    /* renamed from: u2 */
    public void mo59875u2(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        if (map == null) {
            Log.m105928w("MicroMsg.SysMsgTemp.SysMsgTemplateReceivedHandlerBase", "hy: non map!!");
            return;
        }
        Log.m105925i("MicroMsg.SysMsgTemp.SysMsgTemplateReceivedHandlerBase", "onClickLink linkType:%s", str);
        mo59874q(str, map, bundle, weakReference, weakReference2);
    }
}
