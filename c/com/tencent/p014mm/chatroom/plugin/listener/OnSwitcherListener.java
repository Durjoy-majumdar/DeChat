package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.autogen.events.NetSceneCollectChatRoomEvent;
import com.tencent.p014mm.autogen.events.NetSceneCreateChatRoomEvent;
import com.tencent.p014mm.autogen.events.NetSceneDelChatRoomMemberEvent;
import com.tencent.p014mm.autogen.events.NetSceneGetChatroomMemberDetailEvent;
import com.tencent.p014mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent;
import com.tencent.p014mm.autogen.events.SwitcherEvent;
import com.tencent.p014mm.pluginsdk.event.OnSceneEndProxy;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.xweb.util.WXWebReporter;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import p203mi.C47041l;
import p203mi.C47042m;
import p203mi.C47043n;
import p203mi.C47047s;
import p203mi.C47051u;
import te3.C48846be2;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.OnSwitcherListener */
public class OnSwitcherListener extends IStaticListener<SwitcherEvent> {

    /* renamed from: d */
    public OnSceneEndProxy<NetSceneCollectChatRoomEvent> f108050d = new OnSceneEndProxy<NetSceneCollectChatRoomEvent>(this) {
        public boolean callback(IEvent iEvent) {
            NetSceneCollectChatRoomEvent netSceneCollectChatRoomEvent = (NetSceneCollectChatRoomEvent) iEvent;
            netSceneCollectChatRoomEvent.f107636d.getClass();
            mo69321h(netSceneCollectChatRoomEvent);
            return false;
        }

        /* renamed from: f */
        public C117747y mo62730f(IEvent iEvent) {
            ((NetSceneCollectChatRoomEvent) iEvent).f107636d.getClass();
            return new C47041l((LinkedList<C48846be2>) null);
        }

        /* renamed from: g */
        public IEvent mo62731g(int i, int i2, String str, C117747y yVar, IEvent iEvent) {
            return (NetSceneCollectChatRoomEvent) iEvent;
        }

        /* renamed from: i */
        public int mo62732i() {
            return WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD;
        }
    };

    /* renamed from: e */
    public OnSceneEndProxy<NetSceneGetChatroomMemberDetailEvent> f108051e = new OnSceneEndProxy<NetSceneGetChatroomMemberDetailEvent>(this) {
        public boolean callback(IEvent iEvent) {
            NetSceneGetChatroomMemberDetailEvent netSceneGetChatroomMemberDetailEvent = (NetSceneGetChatroomMemberDetailEvent) iEvent;
            netSceneGetChatroomMemberDetailEvent.f107649d.getClass();
            mo69321h(netSceneGetChatroomMemberDetailEvent);
            return false;
        }

        /* renamed from: f */
        public C117747y mo62730f(IEvent iEvent) {
            NetSceneGetChatroomMemberDetailEvent.C40141a aVar = ((NetSceneGetChatroomMemberDetailEvent) iEvent).f107649d;
            return new C47047s(aVar.f107650a, aVar.f107651b);
        }

        /* renamed from: g */
        public IEvent mo62731g(int i, int i2, String str, C117747y yVar, IEvent iEvent) {
            return (NetSceneGetChatroomMemberDetailEvent) iEvent;
        }

        /* renamed from: i */
        public int mo62732i() {
            return 551;
        }
    };

    /* renamed from: f */
    public OnSceneEndProxy<NetSceneDelChatRoomMemberEvent> f108052f = new OnSceneEndProxy<NetSceneDelChatRoomMemberEvent>(this) {
        public boolean callback(IEvent iEvent) {
            NetSceneDelChatRoomMemberEvent netSceneDelChatRoomMemberEvent = (NetSceneDelChatRoomMemberEvent) iEvent;
            netSceneDelChatRoomMemberEvent.f107646d.getClass();
            mo69321h(netSceneDelChatRoomMemberEvent);
            return false;
        }

        /* renamed from: f */
        public C117747y mo62730f(IEvent iEvent) {
            NetSceneDelChatRoomMemberEvent netSceneDelChatRoomMemberEvent = (NetSceneDelChatRoomMemberEvent) iEvent;
            netSceneDelChatRoomMemberEvent.f107646d.getClass();
            netSceneDelChatRoomMemberEvent.f107646d.getClass();
            netSceneDelChatRoomMemberEvent.f107646d.getClass();
            return new C47043n((String) null, (List<String>) null, 0);
        }

        /* renamed from: g */
        public IEvent mo62731g(int i, int i2, String str, C117747y yVar, IEvent iEvent) {
            NetSceneDelChatRoomMemberEvent netSceneDelChatRoomMemberEvent = (NetSceneDelChatRoomMemberEvent) iEvent;
            netSceneDelChatRoomMemberEvent.f107647e.f107648a = i2;
            return netSceneDelChatRoomMemberEvent;
        }

        /* renamed from: i */
        public int mo62732i() {
            return WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED;
        }
    };

    /* renamed from: g */
    public OnSceneEndProxy<NetSceneRevokeChatRoomQRCodeEvent> f108053g = new OnSceneEndProxy<NetSceneRevokeChatRoomQRCodeEvent>(this) {
        public boolean callback(IEvent iEvent) {
            NetSceneRevokeChatRoomQRCodeEvent netSceneRevokeChatRoomQRCodeEvent = (NetSceneRevokeChatRoomQRCodeEvent) iEvent;
            netSceneRevokeChatRoomQRCodeEvent.f107657d.getClass();
            mo69321h(netSceneRevokeChatRoomQRCodeEvent);
            return false;
        }

        /* renamed from: f */
        public C117747y mo62730f(IEvent iEvent) {
            NetSceneRevokeChatRoomQRCodeEvent netSceneRevokeChatRoomQRCodeEvent = (NetSceneRevokeChatRoomQRCodeEvent) iEvent;
            netSceneRevokeChatRoomQRCodeEvent.f107657d.getClass();
            netSceneRevokeChatRoomQRCodeEvent.f107657d.getClass();
            return new C47051u((String) null, (String) null);
        }

        /* renamed from: g */
        public IEvent mo62731g(int i, int i2, String str, C117747y yVar, IEvent iEvent) {
            NetSceneRevokeChatRoomQRCodeEvent netSceneRevokeChatRoomQRCodeEvent = (NetSceneRevokeChatRoomQRCodeEvent) iEvent;
            netSceneRevokeChatRoomQRCodeEvent.f107658e.f107659a = i2;
            return netSceneRevokeChatRoomQRCodeEvent;
        }

        /* renamed from: i */
        public int mo62732i() {
            return 700;
        }
    };

    /* renamed from: h */
    public OnSceneEndProxy<NetSceneCreateChatRoomEvent> f108054h = new OnSceneEndProxy<NetSceneCreateChatRoomEvent>(this) {
        public boolean callback(IEvent iEvent) {
            NetSceneCreateChatRoomEvent netSceneCreateChatRoomEvent = (NetSceneCreateChatRoomEvent) iEvent;
            netSceneCreateChatRoomEvent.f107637d.getClass();
            mo69321h(netSceneCreateChatRoomEvent);
            return false;
        }

        /* renamed from: f */
        public C117747y mo62730f(IEvent iEvent) {
            NetSceneCreateChatRoomEvent netSceneCreateChatRoomEvent = (NetSceneCreateChatRoomEvent) iEvent;
            netSceneCreateChatRoomEvent.f107637d.getClass();
            netSceneCreateChatRoomEvent.f107637d.getClass();
            return new C47042m((String) null, (List<String>) null, (String) null, (String) null);
        }

        /* renamed from: g */
        public IEvent mo62731g(int i, int i2, String str, C117747y yVar, IEvent iEvent) {
            NetSceneCreateChatRoomEvent netSceneCreateChatRoomEvent = (NetSceneCreateChatRoomEvent) iEvent;
            C47042m mVar = (C47042m) yVar;
            NetSceneCreateChatRoomEvent.C40138b bVar = netSceneCreateChatRoomEvent.f107638e;
            bVar.f107639a = mVar.f126413o;
            bVar.f107640b = mVar.f126412n;
            bVar.f107641c = mVar.f126407f;
            bVar.f107642d = mVar.f126408g;
            bVar.f107645g = mVar.f126411j;
            bVar.f107643e = mVar.f126409h;
            bVar.f107644f = mVar.f126410i;
            return netSceneCreateChatRoomEvent;
        }

        /* renamed from: i */
        public int mo62732i() {
            return 119;
        }
    };

    public boolean callback(IEvent iEvent) {
        SwitcherEvent switcherEvent = (SwitcherEvent) iEvent;
        if (switcherEvent.f107783d.f107785b.equals(NetSceneCollectChatRoomEvent.class.getName())) {
            if (switcherEvent.f107783d.f107784a == 1) {
                this.f108050d.mo69320e();
                return false;
            }
            this.f108050d.mo69322j();
            return false;
        } else if (switcherEvent.f107783d.f107785b.equals(NetSceneGetChatroomMemberDetailEvent.class.getName())) {
            if (switcherEvent.f107783d.f107784a == 1) {
                this.f108051e.mo69320e();
                return false;
            }
            this.f108051e.mo69322j();
            return false;
        } else if (switcherEvent.f107783d.f107785b.equals(NetSceneCreateChatRoomEvent.class.getName())) {
            if (switcherEvent.f107783d.f107784a == 1) {
                this.f108054h.mo69320e();
                return false;
            }
            this.f108054h.mo69322j();
            return false;
        } else if (switcherEvent.f107783d.f107785b.equals(NetSceneDelChatRoomMemberEvent.class.getName())) {
            if (switcherEvent.f107783d.f107784a == 1) {
                this.f108052f.mo69320e();
                return false;
            }
            this.f108052f.mo69322j();
            return false;
        } else if (!switcherEvent.f107783d.f107785b.equals(NetSceneRevokeChatRoomQRCodeEvent.class.getName())) {
            return false;
        } else {
            if (switcherEvent.f107783d.f107784a == 1) {
                this.f108053g.mo69320e();
                return false;
            }
            this.f108053g.mo69322j();
            return false;
        }
    }
}
