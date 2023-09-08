package com.tencent.p014mm.plugin.wepkg.model;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import com.tencent.p014mm.plugin.wepkg.event.LiteInfoUpdateCompleteNotify;

/* renamed from: com.tencent.mm.plugin.wepkg.model.r$$a */
public final /* synthetic */ class r$$a implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ String f120744d;

    public /* synthetic */ r$$a(String str) {
        this.f120744d = str;
    }

    /* renamed from: a */
    public final void mo894a(Object obj) {
        String str = this.f120744d;
        if (((IPCBoolean) obj).f10312d) {
            C44478c.m48834a(new LiteInfoUpdateCompleteNotify(str), (C44478c.C44480b) null);
        }
    }
}
