package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import g11.C98068c;
import p775zi.C79332c;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.a */
public class C93009a implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C79332c.C79333a f267868d;

    public C93009a(C79332c.C79333a aVar) {
        this.f267868d = aVar;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.ChooseMsgFileListUI", "requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        Log.m105919d("MicroMsg.ChooseMsgFileListUI", "data:%s", intent);
        C98068c.m126677b(i, i2, intent, this.f267868d);
    }
}
