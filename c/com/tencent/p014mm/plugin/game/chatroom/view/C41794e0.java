package com.tencent.p014mm.plugin.game.chatroom.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.e0 */
public class C41794e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112645d;

    public C41794e0(GameChatCommentFooter gameChatCommentFooter) {
        this.f112645d = gameChatCommentFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("GameChatRoom.GameChatCommentFooter", "state onClick:" + this.f112645d.f112480t);
        GameChatCommentFooter gameChatCommentFooter = this.f112645d;
        boolean z = true;
        if (gameChatCommentFooter.f112480t == 0) {
            gameChatCommentFooter.f112473j.requestFocus();
            GameChatCommentFooter gameChatCommentFooter2 = this.f112645d;
            gameChatCommentFooter2.f112485y = false;
            gameChatCommentFooter2.f112469f.hideVKB();
            GameChatCommentFooter gameChatCommentFooter3 = this.f112645d;
            gameChatCommentFooter3.f112480t = 1;
            boolean z2 = gameChatCommentFooter3.f112477q;
            gameChatCommentFooter3.f112478r.mo100197i();
            if (KeyBoardUtil.isPortOrientation(gameChatCommentFooter3.getContext())) {
                int j = C85875k4.m106188j(gameChatCommentFooter3.getContext());
                Log.m105925i("GameChatRoom.GameChatCommentFooter", "is show key board %d, %d, %d", Integer.valueOf(gameChatCommentFooter3.f112482v), Integer.valueOf(gameChatCommentFooter3.f112481u), Integer.valueOf(j));
                int i = gameChatCommentFooter3.f112482v;
                if (i <= 0 || i >= gameChatCommentFooter3.f112481u - j) {
                    z = false;
                }
                if (z) {
                    gameChatCommentFooter3.getInputPanelHelper().mo104362e(new C41791b0(gameChatCommentFooter3, z2));
                    GameChatCommentFooter gameChatCommentFooter4 = this.f112645d;
                    ImageView imageView = gameChatCommentFooter4.f112475o;
                    Drawable drawable = gameChatCommentFooter4.getResources().getDrawable(C0966R.raw.icons_filled_keyboard);
                    C74933u4.m89769f(drawable, -1);
                    imageView.setImageDrawable(drawable);
                }
            }
            if (z2) {
                gameChatCommentFooter3.mo65498k();
            } else {
                gameChatCommentFooter3.f112478r.setVisibility(0);
            }
            GameChatCommentFooter gameChatCommentFooter42 = this.f112645d;
            ImageView imageView2 = gameChatCommentFooter42.f112475o;
            Drawable drawable2 = gameChatCommentFooter42.getResources().getDrawable(C0966R.raw.icons_filled_keyboard);
            C74933u4.m89769f(drawable2, -1);
            imageView2.setImageDrawable(drawable2);
        } else {
            gameChatCommentFooter.mo65495h(false);
            this.f112645d.f112473j.requestFocus();
            GameChatCommentFooter gameChatCommentFooter5 = this.f112645d;
            gameChatCommentFooter5.f112485y = true;
            gameChatCommentFooter5.f112469f.showVKB();
            GameChatCommentFooter gameChatCommentFooter6 = this.f112645d;
            gameChatCommentFooter6.f112480t = 0;
            ImageView imageView3 = gameChatCommentFooter6.f112475o;
            Drawable drawable3 = gameChatCommentFooter6.getResources().getDrawable(C0966R.raw.icons_filled_sticker);
            C74933u4.m89769f(drawable3, -1);
            imageView3.setImageDrawable(drawable3);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
