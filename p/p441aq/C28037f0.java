package p441aq;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.emoji.sync.EmojiUpdateReceiver;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;

@C86522b(dependencies = {C92052d0.class}, onProcess = {C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: aq.f0 */
public final class C28037f0 extends C86301e {
    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        int i = EmojiUpdateReceiver.f266698a;
        MMApplicationContext.getContext().registerReceiver(new EmojiUpdateReceiver(), new IntentFilter("com.tencent.mm.Emoji_Update"));
    }
}
