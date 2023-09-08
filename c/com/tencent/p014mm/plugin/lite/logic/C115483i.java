package com.tencent.p014mm.plugin.lite.logic;

import android.content.Intent;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.p014mm.plugin.lite.LiteAppTaskPreloadReceiver;
import com.tencent.p014mm.plugin.lite.api.C115476a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.lite.logic.i */
public class C115483i implements C115476a {
    public C115483i(C115484j jVar) {
    }

    /* renamed from: a */
    public void mo175450a(int i) {
        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "下载失败", 0).show();
    }

    /* renamed from: b */
    public void mo175451b(WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo, int i) {
        Intent intent = new Intent();
        intent.setClass(MMApplicationContext.getContext(), LiteAppTaskPreloadReceiver.class);
        intent.addFlags(268435456);
        intent.putExtra("task", "updateBaseLibPath");
        intent.putExtra("path", wxaLiteAppBaselibInfo.f339285h);
        MMApplicationContext.getContext().sendBroadcast(intent);
        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "更新基础库成功，手动退出扫码界面", 1).show();
    }
}
