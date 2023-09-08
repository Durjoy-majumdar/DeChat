package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.xweb.FileReaderHelper;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.f */
public class C92948f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BakWaitingUI f267706d;

    public C92948f(BakWaitingUI bakWaitingUI) {
        this.f267706d = bakWaitingUI;
    }

    public void run() {
        BakWaitingUI bakWaitingUI = this.f267706d;
        int i = bakWaitingUI.f267691e;
        if (6 == i || 1 == i) {
            Intent intent = new Intent(bakWaitingUI, BakOperatingUI.class);
            intent.putExtra(FileReaderHelper.OPEN_FILE_FROM_CMD, bakWaitingUI.f267691e);
            MMWizardActivity.m7017L7(bakWaitingUI, intent);
        }
    }
}
