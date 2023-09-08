package gb3;

import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: gb3.a */
public class C32384a {
    /* renamed from: a */
    public static boolean m39700a() {
        String str = SubCoreNewABTest.wx0().mo57622Lo("100352").mo135598l2().get("Close");
        return (!Util.isNullOrNil(str) ? Util.getInt(str, 0) : 0) == 0;
    }
}
