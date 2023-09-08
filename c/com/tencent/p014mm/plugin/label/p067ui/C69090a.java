package com.tencent.p014mm.plugin.label.p067ui;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import e22.C75510j0;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.label.ui.a */
public final class C69090a implements C75510j0.C75513c {

    /* renamed from: a */
    public final /* synthetic */ ContactEditLabel f198676a;

    public C69090a(ContactEditLabel contactEditLabel) {
        this.f198676a = contactEditLabel;
    }

    /* renamed from: a */
    public void mo95164a() {
        ContactEditLabel contactEditLabel = this.f198676a;
        Log.m105924i(contactEditLabel.f198452d, "cpan[dealAddContact]");
        Intent intent = new Intent();
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219161b, 1024));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", contactEditLabel.getString(C0966R.string.g1n));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        intent.putExtra("without_openim", true);
        intent.putExtra("always_select_contact", Util.listToString(contactEditLabel.f198462q, ","));
        C88144b.m109802t(contactEditLabel, ".ui.contact.SelectContactUI", intent, 7001);
    }
}
