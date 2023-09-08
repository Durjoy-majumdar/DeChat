package com.tencent.p014mm.p136ui.conversation;

import android.os.Message;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashMap;

/* renamed from: com.tencent.mm.ui.conversation.k2 */
public class C74705k2 extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C74739q2 f219655a;

    public C74705k2(C74739q2 q2Var) {
        this.f219655a = q2Var;
    }

    public void handleMessage(Message message) {
        C74720p pVar = this.f219655a.f219774e;
        if (pVar != null) {
            HashMap<String, C74720p.C74731k> hashMap = pVar.f219717y;
            if (hashMap != null) {
                hashMap.clear();
                pVar.f219694K = true;
            }
            this.f219655a.f219774e.notifyDataSetChanged();
        }
    }
}
