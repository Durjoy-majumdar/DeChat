package com.tencent.p014mm.p136ui.chatting;

import android.content.DialogInterface;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.EmojiRewardTipsEvent;
import com.tencent.p014mm.storage.C72963f4;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.o2 */
public class C30838o2 extends C73684f2 {

    /* renamed from: com.tencent.mm.ui.chatting.o2$a */
    public class C30839a implements DialogInterface.OnClickListener {
        public C30839a(C30838o2 o2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            EmojiRewardTipsEvent emojiRewardTipsEvent = new EmojiRewardTipsEvent();
            emojiRewardTipsEvent.f78776d.f78777a = true;
            emojiRewardTipsEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.o2$b */
    public class C30840b implements DialogInterface.OnClickListener {
        public C30840b(C30838o2 o2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            EmojiRewardTipsEvent emojiRewardTipsEvent = new EmojiRewardTipsEvent();
            emojiRewardTipsEvent.f78776d.f78777a = false;
            emojiRewardTipsEvent.publish();
        }
    }

    public C30838o2(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        C76879j.m92707A(bVar.mo91565f(), bVar.mo91572m().getString(C0966R.string.c5c), "", bVar.mo91572m().getString(C0966R.string.c5e), bVar.mo91572m().getString(C0966R.string.c5b), new C30839a(this), new C30840b(this));
    }
}
