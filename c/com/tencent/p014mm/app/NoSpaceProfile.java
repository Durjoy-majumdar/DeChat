package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p977hj.C87528c;

/* renamed from: com.tencent.mm.app.NoSpaceProfile */
public class NoSpaceProfile extends C87528c {
    static {
        MMApplicationContext.getPackageName();
    }

    /* renamed from: a */
    public void mo112236a() {
        LocaleUtil.initLanguage(MMApplicationContext.getContext());
    }
}
