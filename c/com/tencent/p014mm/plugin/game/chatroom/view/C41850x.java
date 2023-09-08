package com.tencent.p014mm.plugin.game.chatroom.view;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.x */
public class C41850x implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112794d;

    public C41850x(GameChatCommentFooter gameChatCommentFooter) {
        this.f112794d = gameChatCommentFooter;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$16", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        GameChatCommentFooter gameChatCommentFooter = this.f112794d;
        int i = GameChatCommentFooter.f112455N;
        gameChatCommentFooter.mo65495h(false);
        GameChatCommentFooter gameChatCommentFooter2 = this.f112794d;
        gameChatCommentFooter2.f112485y = true;
        ImageView imageView = gameChatCommentFooter2.f112475o;
        Drawable drawable = gameChatCommentFooter2.getResources().getDrawable(C0966R.raw.icons_filled_sticker);
        C74933u4.m89769f(drawable, -1);
        imageView.setImageDrawable(drawable);
        this.f112794d.f112480t = 0;
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$16", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
