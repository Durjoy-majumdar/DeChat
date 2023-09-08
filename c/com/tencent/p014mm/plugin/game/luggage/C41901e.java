package com.tencent.p014mm.plugin.game.luggage;

import android.content.Context;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;

/* renamed from: com.tencent.mm.plugin.game.luggage.e */
public class C41901e {
    /* renamed from: a */
    public static <T extends C80883e<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean m45448a(InputType inputtype, Class<T> cls, C1256g<ResultType> gVar) {
        return C80907o.m98782e(C44594n1.m49045a() ? WeChatProcess.PROCESS_MAIN : WeChatProcess.PROCESS_TOOLS, inputtype, cls, gVar, (String) null);
    }

    /* renamed from: b */
    public static boolean m45449b(Context context) {
        return C44594n1.m49045a() ? C41864d.m45387d(context, "com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI") || C41864d.m45387d(context, "com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI") || C41864d.m45387d(context, "com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI") : C41864d.m45387d(context, "com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI") || C41864d.m45387d(context, "com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI") || C41864d.m45387d(context, "com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI");
    }
}
