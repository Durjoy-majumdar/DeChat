package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.plugin.base.stub.MMPluginProvider;
import java.util.HashMap;
import java.util.Map;
import qe3.C89625d;

/* renamed from: com.tencent.mm.plugin.base.stub.b */
public class C85081b extends MMPluginProvider.C85053a {

    /* renamed from: b */
    public static final Map<String, Object> f247916b;

    static {
        HashMap hashMap = new HashMap();
        f247916b = hashMap;
        hashMap.put("_build_info_sdk_int_", Integer.valueOf(C89625d.f257841g));
        hashMap.put("_build_info_sdk_name_", Build.SDK_VERSION_NAME);
        hashMap.put("_wxapp_pay_entry_classname_", "com.tencent.mm.plugin.base.stub.WXPayEntryActivity");
    }
}
