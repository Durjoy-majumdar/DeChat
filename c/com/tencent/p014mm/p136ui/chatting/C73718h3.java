package com.tencent.p014mm.p136ui.chatting;

import android.os.Bundle;
import android.os.Looper;
import ck3.C67391b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75568c3;
import java.util.List;
import p285zh.C119114c;
import zj3.C79343c0;

/* renamed from: com.tencent.mm.ui.chatting.h3 */
public class C73718h3 implements C75568c3 {

    /* renamed from: a */
    public C67391b f216460a;

    public C73718h3(C67391b bVar) {
        this.f216460a = bVar;
    }

    /* renamed from: a */
    public void mo93204a(C72963f4 f4Var) {
        Class cls = C79343c0.class;
        C119114c.m167921f("notifyFirstChat");
        if (this.f216460a.f193278b.mo102812a(cls) == null) {
            Log.m105928w("MicroMsg.ChattingUIKeywordChecker", "chatting ui maybe has exit!");
        } else {
            ((C79343c0) this.f216460a.f193278b.mo102812a(cls)).mo102611a();
        }
    }

    /* renamed from: b */
    public void mo93205b(int i, String str, String str2, String str3, String str4, Bundle bundle) {
    }

    /* renamed from: c */
    public void mo93206c(List<C72963f4> list) {
    }

    public Looper getLooper() {
        return Looper.getMainLooper();
    }
}
