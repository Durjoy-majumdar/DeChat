package kx1;

import com.tencent.p014mm.plugin.game.autogen.chatroom.Channel;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChannelInfo;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: kx1.d */
public final class C46792d {
    /* renamed from: a */
    public static final boolean m52085a(ChannelInfo channelInfo, ChannelInfo channelInfo2) {
        T t;
        boolean z;
        C87412m.m108594g(channelInfo, "org");
        C87412m.m108594g(channelInfo2, "channelInfo");
        if (channelInfo.default_channel_id == channelInfo2.default_channel_id) {
            LinkedList<Channel> linkedList = channelInfo.channel_list;
            if (linkedList != null && linkedList.size() == channelInfo2.channel_list.size()) {
                Iterator<Channel> it = channelInfo2.channel_list.iterator();
                while (it.hasNext()) {
                    Channel next = it.next();
                    LinkedList<Channel> linkedList2 = channelInfo.channel_list;
                    C87412m.m108593f(linkedList2, "org.channel_list");
                    Iterator<T> it4 = linkedList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            continue;
                            break;
                        }
                        t = it4.next();
                        if (((Channel) t).channel_id == next.channel_id) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            continue;
                            break;
                        }
                    }
                    if (t == null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
