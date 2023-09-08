package p403yo;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p407zo.C53801g;
import z04.C112551y;

@C86522b
/* renamed from: yo.g */
public final class C39135g extends C86301e implements C53801g {
    /* renamed from: aX */
    public void mo61947aX(String str, boolean z, Intent intent) {
        C87412m.m108594g(str, "talkerName");
        Log.m105924i("HalfScreenChattingService", "startHalfChatting() called with: talkerName = " + str + ", finishDirect = " + z);
        if (!C112551y.m153811k(str)) {
            Intent intent2 = new Intent("com.tencent.mm.Intent.ACTION_HALF_SCREEN_CHATTING");
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", z);
            intent2.putExtra("extraData", intent);
            MMApplicationContext.getContext().sendBroadcast(intent2);
        }
    }

    /* renamed from: vA */
    public void mo61948vA(String str, int i, Intent intent) {
        C87412m.m108594g(str, "talkerName");
        Log.m105924i("HalfScreenChattingService", "startHalfChatting() called with: talkerName = " + str + ", fromScene = " + i);
        if (!C112551y.m153811k(str)) {
            Intent intent2 = new Intent("com.tencent.mm.Intent.ACTION_HALF_SCREEN_CHATTING");
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("Chat_User", str);
            intent.putExtra("chat_from_scene", i);
            intent2.putExtra("extraData", intent);
            MMApplicationContext.getContext().sendBroadcast(intent2);
        }
    }
}
