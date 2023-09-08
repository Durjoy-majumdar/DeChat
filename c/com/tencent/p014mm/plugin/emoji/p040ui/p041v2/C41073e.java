package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import p441aq.C92054g;
import te3.C51018qv3;
import te3.C51468tz1;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.e */
public class C41073e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C51468tz1 f110652d;

    /* renamed from: e */
    public final /* synthetic */ EmojiStoreV2BaseFragment f110653e;

    public C41073e(EmojiStoreV2BaseFragment emojiStoreV2BaseFragment, C51468tz1 tz12) {
        this.f110653e = emojiStoreV2BaseFragment;
        this.f110652d = tz12;
    }

    public void run() {
        C51018qv3 qv32;
        C51468tz1 tz12 = this.f110652d;
        if (tz12 != null) {
            Object[] objArr = new Object[3];
            int i = 0;
            objArr[0] = Integer.valueOf(tz12 == null ? 0 : tz12.f142490e);
            C51468tz1 tz13 = this.f110652d;
            if (!(tz13 == null || (qv32 = tz13.f142489d) == null)) {
                i = qv32.computeSize();
            }
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(this.f110653e.mo127818M());
            Log.m105919d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "jacks save EmoijStoreUI Cache: list:%d, size: %d, type: %d", objArr);
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            C30790w2.m39221h().mo57720g().mo61545Yt(this.f110653e.mo127818M(), this.f110652d);
        }
    }
}
