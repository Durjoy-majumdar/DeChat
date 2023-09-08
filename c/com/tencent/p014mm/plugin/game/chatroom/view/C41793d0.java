package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Channel;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.d0 */
public class C41793d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112644d;

    public C41793d0(GameChatCommentFooter gameChatCommentFooter) {
        this.f112644d = gameChatCommentFooter;
    }

    public void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GameChatCommentFooter gameChatCommentFooter = this.f112644d;
        if (gameChatCommentFooter.f112458C != null) {
            String obj = gameChatCommentFooter.f112473j.getText().toString();
            if (this.f112644d.f112470g.getVisibility() != 0 || !(this.f112644d.f112470g.getTag() instanceof Channel)) {
                Channel channel = this.f112644d.f112464I;
                i = channel != null ? channel.channel_id : 0;
            } else {
                i = ((Channel) this.f112644d.f112470g.getTag()).channel_id;
            }
            GameChatCommentFooter gameChatCommentFooter2 = this.f112644d;
            GameChatCommentFooter$$o gameChatCommentFooter$$o = gameChatCommentFooter2.f112458C;
            gameChatCommentFooter2.getClass();
            HashSet hashSet = new HashSet();
            for (String str : obj.split("@")) {
                int indexOf = str.indexOf(8197);
                if (indexOf > 0) {
                    String substring = str.substring(0, indexOf);
                    Iterator it = ((HashMap) gameChatCommentFooter2.f112459D).entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str2 = (String) entry.getKey();
                        if (((List) entry.getValue()).contains(substring)) {
                            hashSet.add(str2);
                            break;
                        }
                    }
                }
            }
            gameChatCommentFooter$$o.mo65420a(obj, new LinkedList(hashSet), i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
