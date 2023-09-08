package com.tencent.p014mm.plugin.backup.backupui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C0991y;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import di3.C86312j;
import iv0.d$$a;
import iv0.d$$b;
import iv0.d$$c;

/* renamed from: com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI */
public class BackupChooseBackupModeUI extends MMWizardActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f12012e = 0;

    public int getLayoutId() {
        return C0966R.C0971layout.cxh;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.aej);
        setBackBtn(new d$$a(this));
        ((C0991y) C86312j.m106911c(C0991y.class)).R20();
        findViewById(C0966R.C0970id.n69).setOnClickListener(new d$$b(this));
        findViewById(C0966R.C0970id.n6_).setOnClickListener(new d$$c(this));
    }

    public void onDestroy() {
        super.onDestroy();
        ((C0991y) C86312j.m106911c(C0991y.class)).mo1001Kg();
    }
}
