package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.plugin.luckymoney.model.C69214f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.s */
public class C69262s implements C69214f1.C69215a {
    public C69262s(C69264t tVar) {
    }

    /* renamed from: a */
    public void mo95408a(String str, C98121d dVar, String str2, boolean z) {
        if (z) {
            Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "the download image data is success! filePath:" + str2);
            return;
        }
        Log.m105920e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "download image fail!  filePath:" + str2);
    }
}
