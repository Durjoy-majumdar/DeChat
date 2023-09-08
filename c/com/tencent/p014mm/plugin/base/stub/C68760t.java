package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.plugin.base.stub.WXEntryActivity;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.plugin.base.stub.t */
public class C68760t implements C79138l.C53540a {

    /* renamed from: a */
    public final /* synthetic */ C44561j f197514a;

    /* renamed from: b */
    public final /* synthetic */ WXEntryActivity.EntryReceiver f197515b;

    public C68760t(WXEntryActivity.EntryReceiver entryReceiver, C44561j jVar) {
        this.f197515b = entryReceiver;
        this.f197514a = jVar;
    }

    /* renamed from: a */
    public void mo74207a(C44561j jVar) {
        if (jVar == null) {
            jVar = this.f197514a;
        }
        WXEntryActivity.EntryReceiver entryReceiver = this.f197515b;
        MMHandler mMHandler = WXEntryActivity.EntryReceiver.f197463f;
        entryReceiver.mo94571b(jVar);
    }
}
