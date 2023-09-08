package com.tencent.p014mm.plugin.base.stub;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C48796b20;

/* renamed from: com.tencent.mm.plugin.base.stub.s */
public class C68759s implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C117747y f197512d;

    /* renamed from: e */
    public final /* synthetic */ WXEntryActivity f197513e;

    public C68759s(WXEntryActivity wXEntryActivity, C117747y yVar) {
        this.f197513e = wXEntryActivity;
        this.f197512d = yVar;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (this.f197513e.f197462v.get() != null && !this.f197513e.f197462v.get().isFinishing()) {
            this.f197513e.f197462v.get().mo94561O7();
            if (i == 0 && i2 == 0) {
                WXEntryActivity wXEntryActivity = this.f197513e.f197462v.get();
                C117747y yVar2 = this.f197512d;
                wXEntryActivity.getClass();
                C48796b20 b202 = (C48796b20) cVar.f127056b.f127083a;
                if (b202 == null || Util.isNullOrNil(b202.f130894d)) {
                    wXEntryActivity.mo94568W7("");
                } else {
                    C86493v0.m107224d().mo120947c("kWXEntryActivity_data_center_session_id", true).mo120962i("kWXEntryActivity_data_center_wework_msgcontent", b202.f130894d);
                    wXEntryActivity.mo94559M7(yVar2, (Bundle) null);
                }
                return 0;
            }
            this.f197513e.f197462v.get().mo94564S7(i, i2, str);
        }
        return 0;
    }
}
