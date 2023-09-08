package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import g11.C98068c;
import p775zi.C79332c;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.f */
public class C93012f implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C79332c.C79333a f267872d;

    public C93012f(C79332c.C79333a aVar) {
        this.f267872d = aVar;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.ChooseMsgFileUI", "requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        Log.m105919d("MicroMsg.ChooseMsgFileUI", "data:%s", intent);
        C98068c.m126677b(i, i2, intent, this.f267872d);
    }
}
