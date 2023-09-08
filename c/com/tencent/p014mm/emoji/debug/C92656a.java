package com.tencent.p014mm.emoji.debug;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.emoji.debug.a */
public final class C92656a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiDebugUI f266645d;

    /* renamed from: e */
    public final /* synthetic */ int f266646e;

    public C92656a(EmojiDebugUI emojiDebugUI, int i) {
        this.f266645d = emojiDebugUI;
        this.f266646e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/emoji/debug/EmojiDebugUI$DebugAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f266645d.f266604e.get(this.f266646e).mo126663a();
        C117292a.m165361g(this, "com/tencent/mm/emoji/debug/EmojiDebugUI$DebugAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
