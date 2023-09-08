package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import f40.C86709a0;
import j61.C60778e;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.w */
public class C68872w implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiCustomUI f197883d;

    public C68872w(EmojiCustomUI emojiCustomUI) {
        this.f197883d = emojiCustomUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MMHandler mMHandler;
        EmojiCustomUI emojiCustomUI = this.f197883d;
        Object[] objArr = new Object[1];
        ArrayList<String> arrayList = emojiCustomUI.f268431u;
        objArr[0] = Integer.valueOf(arrayList == null ? 0 : arrayList.size());
        Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "deleteEmoji mSelectedList size:%d", objArr);
        ArrayList<String> arrayList2 = emojiCustomUI.f268431u;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            Log.m105928w("MicroMsg.emoji.EmojiCustomUI", "empty seleted list");
            return;
        }
        emojiCustomUI.f268428r = C76879j.m92723Q(emojiCustomUI, emojiCustomUI.getString(C0966R.string.a3h), emojiCustomUI.getString(C0966R.string.c5u), true, true, new C68873z(emojiCustomUI));
        ArrayList<String> arrayList3 = emojiCustomUI.f268431u;
        Object[] objArr2 = new Object[1];
        objArr2[0] = Integer.valueOf(arrayList3 == null ? 0 : arrayList3.size());
        Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "deleteSyncEmoji list size:%d", objArr2);
        if (arrayList3 == null || arrayList3.size() <= 0) {
            Log.m105924i("MicroMsg.emoji.EmojiCustomUI", "empty size.");
        } else {
            C86709a0.m107529k().f251779b.mo123460f(new C60778e(emojiCustomUI.f268432v, 2, emojiCustomUI.f268431u));
        }
        Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "touchBatchEmojiBackup over emoji size. need touch :%b", Boolean.FALSE);
        if (!NetStatusUtil.isConnected((Context) emojiCustomUI) && (mMHandler = emojiCustomUI.f268415D) != null) {
            mMHandler.sendEmptyMessageDelayed(1003, (long) 0);
        }
    }
}
