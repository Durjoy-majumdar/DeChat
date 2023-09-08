package com.tencent.p014mm.plugin.textstatus.util;

import b03.C39691c;
import b03.C39701i;
import b03.C39707j;
import bp3.C104160f;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IListener;
import di3.C86312j;
import h81.C32735h;
import java.text.SimpleDateFormat;
import qy2.C77448f0;

/* renamed from: com.tencent.mm.plugin.textstatus.util.IStatusIconHelperKt */
public final class IStatusIconHelperKt {

    /* renamed from: a */
    public static final boolean f82191a;

    /* renamed from: b */
    public static final IListener<CheckResUpdateCacheFileEvent> f82192b;

    /* renamed from: c */
    public static final IListener<LocalCheckResUpdateCacheFileEvent> f82193c;

    static {
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_text_state_icon_resource_switch_and, C104160f.RepairerConfig_TextStatus_UseOldIconStrategy_Int, 0) == 1) {
            z = true;
        }
        f82191a = z;
        C40008f fVar = C40008f.f107254d;
        f82192b = new IStatusIconHelperKt$checkResUpdateCacheFileEventIListener$1(fVar);
        f82193c = new IStatusIconHelperKt$localCheckResUpdateCacheFileEventIListener$1(fVar);
    }

    /* renamed from: a */
    public static final C39691c m39109a() {
        return f82191a ? C39701i.f106511a : C39707j.f106537a;
    }
}
