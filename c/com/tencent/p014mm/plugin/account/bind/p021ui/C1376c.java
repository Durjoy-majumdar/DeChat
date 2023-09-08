package com.tencent.p014mm.plugin.account.bind.p021ui;

import com.tencent.p014mm.plugin.account.bind.p021ui.C1379f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C116756s5;
import hg0.C76166a;
import hg0.C76168b;
import mg0.C76754b;
import p011cm.C39989b;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.c */
public class C1376c implements C39989b.C0705b {

    /* renamed from: d */
    public final /* synthetic */ C1379f.C1380a f10566d;

    public C1376c(C1379f.C1380a aVar) {
        this.f10566d = aVar;
    }

    /* renamed from: a */
    public void mo677a(boolean z, boolean z2, String str, String str2) {
        Class cls = C76754b.class;
        Log.m105925i("MicroMsg.MobileFriendAdapter", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", Boolean.valueOf(z), Boolean.valueOf(z2), str, str2);
        C76166a b = ((C76168b) ((C76754b) C86312j.m106911c(cls)).R50()).mo106402b(str2);
        if (b == null) {
            Log.m105929w("MicroMsg.MobileFriendAdapter", "cpan mobile friend is null. qq:%s", str2);
        } else if (z) {
            b.f223120h = str;
            b.f223127o = 2;
            b.f223131s = 2;
            Log.m105919d("MicroMsg.MobileFriendAdapter", "f :%s", b.toString());
            ((C76168b) ((C76754b) C86312j.m106911c(cls)).R50()).mo106403d(str2, b);
            C1379f.this.mo1333o();
            C116756s5.m164691d().mo180727a(26, new Object[0]);
        }
    }
}
