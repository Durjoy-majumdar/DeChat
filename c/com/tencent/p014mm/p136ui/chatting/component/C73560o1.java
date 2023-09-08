package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AppEmojiMsgProgressEvent;
import com.tencent.p014mm.p136ui.chatting.component.EmojiComponent;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73975e1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.tencent.mm.ui.chatting.component.o1 */
public class C73560o1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppEmojiMsgProgressEvent f216060d;

    public C73560o1(EmojiComponent.C733441 r1, AppEmojiMsgProgressEvent appEmojiMsgProgressEvent) {
        this.f216060d = appEmojiMsgProgressEvent;
    }

    public void run() {
        AppEmojiMsgProgressEvent.C67658a aVar = this.f216060d.f193475d;
        String str = aVar.f193476a;
        int i = aVar.f193477b;
        int i2 = aVar.f193478c;
        if (!((HashMap) C73975e1.f217091g).containsKey(str)) {
            Log.m105924i("AppMsgEmojiItemHolder", "no contain attchid:%s");
            return;
        }
        C73975e1 e1Var = (C73975e1) ((WeakReference) ((HashMap) C73975e1.f217091g).get(str)).get();
        if (e1Var == null) {
            return;
        }
        if (i2 == 0) {
            e1Var.f217094d.setVisibility(0);
            e1Var.f217096f.setVisibility(8);
            e1Var.f217095e.setVisibility(8);
            e1Var.f217094d.setProgress(0);
        } else if (i2 == 1) {
            e1Var.f217094d.setVisibility(8);
            e1Var.f217096f.setVisibility(8);
            e1Var.f217095e.setVisibility(8);
        } else if (i2 == 2) {
            e1Var.f217094d.setVisibility(8);
            e1Var.f217096f.setVisibility(8);
            e1Var.f217095e.setVisibility(0);
            e1Var.f217094d.setProgress(i);
            e1Var.f217095e.setImageResource(C0966R.C0969drawable.emoji_download_failed_btn);
        }
    }
}
