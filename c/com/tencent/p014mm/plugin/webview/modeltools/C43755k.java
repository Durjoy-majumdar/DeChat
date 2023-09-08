package com.tencent.p014mm.plugin.webview.modeltools;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.CountDownLatch;
import ob0.C47350c;
import te3.y54;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.k */
public class C43755k implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f118231a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f118232b;

    public C43755k(CountDownLatch countDownLatch, Bundle bundle) {
        this.f118231a = countDownLatch;
        this.f118232b = bundle;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        Log.m105925i("MicroMsg.SmartPickWordHelper", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            y54 y54 = (y54) cVar.f127056b.f127083a;
            this.f118232b.putString("PickedWord", y54.f145128d);
            this.f118232b.putInt("PrefixOffset", y54.f145129e);
            this.f118232b.putInt("SuffixOffset", y54.f145130f);
            this.f118232b.putString("PrefixText", y54.f145131g);
            this.f118232b.putString("SuffixText", y54.f145132h);
            this.f118232b.putInt("IsMainOrSub", y54.f145133i);
            String str2 = y54.f145128d;
            C43756l.f118233a = str2;
            C43756l.f118235c = y54.f145135n;
            C43756l.f118234b = y54.f145134j;
            Log.m105925i("MicroMsg.SmartPickWordHelper", "response: PrefixText: %s, PickedWord: %s, SuffixText: %s, %d, %d, %d", y54.f145131g, str2, y54.f145132h, Integer.valueOf(y54.f145129e), Integer.valueOf(y54.f145130f), Integer.valueOf(y54.f145133i));
            this.f118231a.countDown();
            return;
        }
        this.f118231a.countDown();
    }
}
