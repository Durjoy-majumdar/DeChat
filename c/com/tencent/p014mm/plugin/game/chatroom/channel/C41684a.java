package com.tencent.p014mm.plugin.game.chatroom.channel;

import android.view.ViewGroup;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax1.C39645h;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Channel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yw1.C53591c;

/* renamed from: com.tencent.mm.plugin.game.chatroom.channel.a */
public class C41684a extends C112968x implements C39645h {

    /* renamed from: i */
    public FragmentManager f112163i;

    /* renamed from: j */
    public List<ChatChannelFragment> f112164j = new ArrayList();

    public C41684a(FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f112163i = fragmentManager;
    }

    /* renamed from: J */
    public void mo62213J(Map<String, C53591c.C53598g> map) {
        Iterator it = ((ArrayList) this.f112164j).iterator();
        while (it.hasNext()) {
            ((ChatChannelFragment) it.next()).mo62213J(map);
        }
    }

    /* renamed from: W */
    public void mo62214W(int i) {
        Iterator it = ((ArrayList) this.f112164j).iterator();
        while (it.hasNext()) {
            ((ChatChannelFragment) it.next()).mo62214W(i);
        }
    }

    /* renamed from: b */
    public ChatChannelFragment mo65398b(int i) {
        Iterator it = ((ArrayList) this.f112164j).iterator();
        while (it.hasNext()) {
            ChatChannelFragment chatChannelFragment = (ChatChannelFragment) it.next();
            Channel channel = chatChannelFragment.f112128g;
            if (channel != null && channel.channel_id == i) {
                return chatChannelFragment;
            }
        }
        return null;
    }

    public int getCount() {
        return ((ArrayList) this.f112164j).size();
    }

    public Fragment getItem(int i) {
        List<ChatChannelFragment> list = this.f112164j;
        return (Fragment) ((ArrayList) list).get(i % ((ArrayList) list).size());
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        ChatChannelFragment chatChannelFragment = (ChatChannelFragment) super.instantiateItem(viewGroup, i);
        String tag = chatChannelFragment.getTag();
        if (chatChannelFragment == getItem(i)) {
            return chatChannelFragment;
        }
        C112919c0 beginTransaction = this.f112163i.beginTransaction();
        beginTransaction.mo165169k(chatChannelFragment);
        ChatChannelFragment chatChannelFragment2 = (ChatChannelFragment) getItem(i);
        beginTransaction.mo165167i(viewGroup.getId(), chatChannelFragment2, tag, 1);
        beginTransaction.mo165198b(new C112919c0.C112920a(7, chatChannelFragment2));
        beginTransaction.mo165163e();
        return chatChannelFragment2;
    }
}
