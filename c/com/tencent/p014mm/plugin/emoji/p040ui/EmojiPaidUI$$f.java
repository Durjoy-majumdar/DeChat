package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$f */
public class EmojiPaidUI$$f implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPaidUI f268522d;

    public EmojiPaidUI$$f(EmojiPaidUI emojiPaidUI) {
        this.f268522d = emojiPaidUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiPaidUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f268522d.f268518I = motionEvent.getRawX();
        this.f268522d.f268519J = motionEvent.getRawY();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
