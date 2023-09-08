package gg0;

import com.tencent.p014mm.plugin.account.bind.p021ui.GoogleFriendUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hg0.C46067w;
import mg0.C76754b;
import p011cm.C39989b;

/* renamed from: gg0.a0 */
public class C45911a0 implements C39989b.C0705b {

    /* renamed from: d */
    public final /* synthetic */ GoogleFriendUI f123887d;

    public C45911a0(GoogleFriendUI googleFriendUI) {
        this.f123887d = googleFriendUI;
    }

    /* renamed from: a */
    public void mo677a(boolean z, boolean z2, String str, String str2) {
        Class cls = C76754b.class;
        Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "MicroMsg.AddContact ok:%b hasSentVerify:%b", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z || z2) {
            Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", str2);
            ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71482Ow(str2, 1);
        } else {
            ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71482Ow(str2, 2);
        }
        this.f123887d.f108579f.mo1333o();
    }
}
