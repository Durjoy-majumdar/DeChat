package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference;
import di3.C86312j;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.profile.ui.l2 */
public class C70284l2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ NormalUserFooterPreference.C70184k f203044d;

    public C70284l2(NormalUserFooterPreference.C70184k kVar) {
        this.f203044d = kVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f203044d.m82743p();
        Intent intent = new Intent();
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93183p(intent, NormalUserFooterPreference.this.f121274d);
    }
}
