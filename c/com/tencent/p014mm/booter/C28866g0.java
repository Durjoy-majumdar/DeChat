package com.tencent.p014mm.booter;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;

/* renamed from: com.tencent.mm.booter.g0 */
public class C28866g0 {

    /* renamed from: b */
    public static final String f79262b = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/reportdevice");

    /* renamed from: a */
    public Context f79263a;

    public C28866g0(Context context) {
        this.f79263a = context;
    }
}
