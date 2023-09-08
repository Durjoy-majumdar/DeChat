package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.yj4;

/* renamed from: com.tencent.mm.plugin.record.ui.n */
public class C57166n implements C87581a<Object, C89132b.C89134c<yj4>> {
    public C57166n(TranslateHelper translateHelper) {
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.TranslateHelper", "TranslateMsgBadcase cgiBack, errType:%s, errCode:%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        return cVar;
    }
}
