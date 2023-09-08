package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45706i;
import q20.C89449a;

@C89449a
/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$o */
public class e$$o implements C80916r<IPCString, IPCString> {
    public Object invoke(Object obj) {
        String b = C45706i.m50951b(((IPCString) obj).f10315d);
        if (Util.isNullOrNil(b)) {
            b = "";
        }
        return new IPCString(b);
    }
}
