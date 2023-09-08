package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$f */
public class EmojiStoreDetailUI$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f12241d;

    public EmojiStoreDetailUI$$f(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f12241d = emojiStoreDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.emoji.EmojiStoreDetailUI", "ApplicationLanguage" + LocaleUtil.getApplicationLanguage());
        Intent intent = new Intent();
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f12241d.getString(C0966R.string.c88));
        intent.putExtra("rawUrl", this.f12241d.getString(C0966R.string.c5j) + LocaleUtil.getApplicationLanguage());
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        C88144b.m109791i(this.f12241d, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
