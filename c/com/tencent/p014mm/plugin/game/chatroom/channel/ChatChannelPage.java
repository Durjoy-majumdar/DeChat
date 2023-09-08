package com.tencent.p014mm.plugin.game.chatroom.channel;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ax1.C39641d;
import ax1.C39644g;
import ax1.C39645h;
import bx1.C39854i;
import bx1.C39862p;
import bx1.C39866s;
import bx1.C39870v;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChatRoomLocateInfoEvent;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.autogen.events.GetCurrentChannelEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Channel;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChannelInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomJumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetMyChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SetChatroomMsgChosenRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TopicInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteMsgResponse;
import com.tencent.p014mm.plugin.game.chatroom.view.C41826n0;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatRoomSelectView;
import com.tencent.p014mm.plugin.game.commlib.util.C41874g;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import ix1.C46337n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import qo3.C101218e0;
import yw1.C53591c;
import yw1.C53601h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage */
public class ChatChannelPage extends LinearLayout implements C39645h, C11385n {

    /* renamed from: d */
    public Context f112142d;

    /* renamed from: e */
    public long f112143e;

    /* renamed from: f */
    public long f112144f;

    /* renamed from: g */
    public View f112145g;

    /* renamed from: h */
    public TabLayout f112146h;

    /* renamed from: i */
    public ViewGroup f112147i;

    /* renamed from: j */
    public C41684a f112148j;
    /* access modifiers changed from: private */
    public CustomViewPager mViewPager;

    /* renamed from: n */
    public C39644g f112149n;

    /* renamed from: o */
    public int f112150o;

    /* renamed from: p */
    public boolean f112151p;

    /* renamed from: q */
    public String f112152q;

    /* renamed from: r */
    public ChannelInfo f112153r;

    /* renamed from: s */
    public C101218e0 f112154s;

    /* renamed from: t */
    public boolean f112155t = false;

    /* renamed from: u */
    public int f112156u = -1;

    /* renamed from: v */
    public IListener f112157v;

    /* renamed from: w */
    public IListener f112158w;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage$a */
    public class C41682a implements TabLayout.C104470c {
        public C41682a() {
        }

        /* renamed from: a */
        public void mo9213a(TabLayout.C55061f fVar) {
            ChatChannelPage.m45161b(ChatChannelPage.this, fVar, false);
        }

        /* renamed from: b */
        public void mo9214b(TabLayout.C55061f fVar) {
            String str;
            int i = 1;
            Log.m105925i("GameChatRoom.ChatChannelPage", "select tab:%d", Integer.valueOf(fVar.f154604e));
            ChatChannelPage.this.mViewPager.setCurrentItem(fVar.f154604e);
            ChatChannelPage.m45161b(ChatChannelPage.this, fVar, true);
            ChatChannelFragment chatChannelFragment = (ChatChannelFragment) ChatChannelPage.this.f112148j.getItem(fVar.f154604e);
            if (!(ChatChannelPage.this.f112149n == null || chatChannelFragment == null)) {
                Channel channel = chatChannelFragment.f112128g;
                if (channel.read_only) {
                    str = channel.cant_send_reason;
                } else {
                    if (!(channel.channel_id == 0)) {
                        str = "# " + chatChannelFragment.f112128g.name;
                    } else {
                        str = "";
                    }
                }
                ChatChannelPage.this.f112149n.mo62211a(!chatChannelFragment.f112128g.read_only, str);
                Channel channel2 = chatChannelFragment.f112128g;
                ChatChannelPage.this.f112149n.mo62212b(!(channel2.channel_id == 0), channel2, false);
            }
            ChatChannelPage chatChannelPage = ChatChannelPage.this;
            chatChannelPage.f112150o = chatChannelFragment.f112128g.channel_id;
            if (!chatChannelPage.f112151p) {
                Object obj = fVar.f154600a;
                if (obj instanceof Integer) {
                    i = ((Integer) obj).intValue();
                }
                ChatChannelPage chatChannelPage2 = ChatChannelPage.this;
                C40308d.f108375a.mo63005q((long) i, 2, chatChannelPage2.f112144f, chatChannelPage2.f112143e, chatChannelPage2.f112150o);
            }
            ChatChannelPage.this.f112151p = false;
        }

        /* renamed from: c */
        public void mo9215c(TabLayout.C55061f fVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage$b */
    public class C41683b implements C76912y0.C61776j {
        public C41683b() {
        }

        /* renamed from: a */
        public void mo596a(View view) {
            WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx);
            if (weImageView != null) {
                weImageView.setIconColor(ChatChannelPage.this.f112142d.getResources().getColor(C0966R.color.ahf));
                weImageView.setImageResource(C0966R.raw.icons_filled_game_favour);
            }
        }
    }

    public ChatChannelPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C40008f fVar = C40008f.f107254d;
        this.f112157v = new IListener<ChatRoomLocateInfoEvent>(fVar) {
            {
                this.__eventId = -409260457;
            }

            public boolean callback(IEvent iEvent) {
                ChatChannelPage chatChannelPage = ChatChannelPage.this;
                ChatRoomLocateInfoEvent.C40051a aVar = ((ChatRoomLocateInfoEvent) iEvent).f107403d;
                chatChannelPage.mo65386e(aVar.f107404a, aVar.f107405b, aVar.f107406c, aVar.f107407d);
                return false;
            }
        };
        this.f112158w = new IListener<GetCurrentChannelEvent>(fVar) {
            {
                this.__eventId = 891116138;
            }

            public boolean callback(IEvent iEvent) {
                ((GetCurrentChannelEvent) iEvent).f107591d.f107592a = ChatChannelPage.this.f112150o;
                return false;
            }
        };
        Context context2 = getContext();
        this.f112142d = context2;
        this.f112143e = ((Activity) context2).getIntent().getLongExtra("game_report_sourceid", 0);
        this.f112144f = ((Activity) this.f112142d).getIntent().getLongExtra("game_report_ssid", 0);
        this.f112156u = ((Activity) this.f112142d).getIntent().getIntExtra("target_channel_id", -1);
        ((Activity) this.f112142d).getIntent().getLongExtra("target_seq", -1);
        ((Activity) this.f112142d).getIntent().getBooleanExtra("is_real_time_room", false);
        LayoutInflater.from(this.f112142d).inflate(C0966R.C0971layout.f6800ow, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.kaz);
        this.f112147i = viewGroup;
        viewGroup.setOnClickListener(new C41685b(this));
        this.mViewPager = (CustomViewPager) findViewById(C0966R.C0970id.l8i);
        this.f112148j = new C41684a(((MMFragmentActivity) this.f112142d).getSupportFragmentManager());
    }

    /* renamed from: b */
    public static void m45161b(ChatChannelPage chatChannelPage, TabLayout.C55061f fVar, boolean z) {
        chatChannelPage.getClass();
        View view = fVar.f154605f;
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kcv);
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.kd4);
        if (z) {
            textView2.setVisibility(8);
        }
        textView.setTextColor(chatChannelPage.f112142d.getResources().getColor(z ? C0966R.color.BW_100_Alpha_0_8 : C0966R.color.BW_100_Alpha_0_5));
    }

    /* renamed from: J */
    public void mo62213J(Map<String, C53591c.C53598g> map) {
        C41684a aVar = this.f112148j;
        if (aVar != null) {
            aVar.mo62213J(map);
        }
    }

    /* renamed from: W */
    public void mo62214W(int i) {
        C41684a aVar = this.f112148j;
        if (aVar != null) {
            aVar.mo62214W(i);
        }
    }

    /* renamed from: c */
    public final void mo65384c() {
        this.f112150o = 0;
        this.f112146h.setVisibility(8);
        int count = this.f112148j.getCount();
        ((ArrayList) this.f112148j.f112164j).clear();
        ChatChannelFragment chatChannelFragment = new ChatChannelFragment(this.f112152q, this.f112156u);
        Channel channel = new Channel();
        channel.channel_id = 0;
        chatChannelFragment.f112128g = channel;
        chatChannelFragment.f112131j = 0;
        chatChannelFragment.f112129h = null;
        GameChatListView gameChatListView = chatChannelFragment.f112126e;
        if (gameChatListView != null) {
            gameChatListView.mo65534J1(0, (List<Channel>) null);
        }
        ((ArrayList) this.f112148j.f112164j).add(chatChannelFragment);
        if (this.mViewPager.getAdapter() == null) {
            this.mViewPager.setAdapter(this.f112148j);
        }
        if (count != 0) {
            this.f112148j.notifyDataSetChanged();
        }
        this.mViewPager.setCurrentItem(0);
    }

    /* renamed from: d */
    public final View mo65385d(Channel channel) {
        View inflate = LayoutInflater.from(this.f112142d).inflate(C0966R.C0971layout.f6799ov, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kcv);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.kd4);
        StringBuffer stringBuffer = new StringBuffer();
        int i = channel.channel_id;
        boolean z = true;
        if (!(i == 0)) {
            if (i != 1) {
                z = false;
            }
            if (!z) {
                stringBuffer.append("# ");
            }
        }
        stringBuffer.append(channel.name);
        textView.setText(stringBuffer);
        if (channel.unread_msg_count != 0) {
            textView2.setVisibility(0);
            textView2.setText("+" + channel.unread_msg_count);
        } else {
            textView2.setVisibility(8);
        }
        return inflate;
    }

    /* renamed from: e */
    public void mo65386e(int i, long j, boolean z, boolean z2) {
        ChatChannelFragment b;
        GameChatListView gameChatListView;
        C41684a aVar = this.f112148j;
        if (aVar != null && this.mViewPager != null) {
            ChatChannelFragment b2 = aVar.mo65398b(i);
            int indexOf = b2 != null ? ((ArrayList) aVar.f112164j).indexOf(b2) : -1;
            if (indexOf >= 0) {
                this.mViewPager.setCurrentItem(indexOf);
                if (!z2 && (b = this.f112148j.mo65398b(i)) != null && (gameChatListView = b.f112126e) != null) {
                    gameChatListView.mo65532H1(j, z);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo65387f() {
        C41684a aVar = this.f112148j;
        if (aVar != null) {
            Iterator it = ((ArrayList) aVar.f112164j).iterator();
            while (it.hasNext()) {
                GameChatListView gameChatListView = ((ChatChannelFragment) it.next()).f112126e;
                if (gameChatListView != null) {
                    gameChatListView.mo65533I1();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013e, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo65388g(java.lang.String r23, com.tencent.p014mm.plugin.game.autogen.chatroom.ChannelInfo r24, boolean r25) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            monitor-enter(r22)
            if (r0 == 0) goto L_0x0135
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r2 = r0.channel_list     // Catch:{ all -> 0x00db }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0011
            goto L_0x0135
        L_0x0011:
            com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo r2 = r1.f112153r     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0024
            boolean r2 = kx1.C46792d.m52085a(r2, r0)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0024
            java.lang.String r0 = "GameChatRoom.ChatChannelPage"
            java.lang.String r2 = "setData channelInfo is same"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x00db }
            monitor-exit(r22)
            return
        L_0x0024:
            java.lang.String r2 = "GameChatRoom.ChatChannelPage"
            java.lang.String r3 = "channel tab init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x00db }
            r1.f112153r = r0     // Catch:{ all -> 0x00db }
            r2 = 1
            r1.f112151p = r2     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout r3 = r1.f112146h     // Catch:{ all -> 0x00db }
            r4 = 0
            r3.setVisibility(r4)     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout r3 = r1.f112146h     // Catch:{ all -> 0x00db }
            r3.mo146910n()     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout r3 = r1.f112146h     // Catch:{ all -> 0x00db }
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r3 = r3.f309491K     // Catch:{ all -> 0x00db }
            r3.clear()     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout r3 = r1.f112146h     // Catch:{ all -> 0x00db }
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage$a r5 = new com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage$a     // Catch:{ all -> 0x00db }
            r5.<init>()     // Catch:{ all -> 0x00db }
            r3.mo146882a(r5)     // Catch:{ all -> 0x00db }
            com.tencent.mm.ui.base.CustomViewPager r3 = r1.mViewPager     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout$g r5 = new com.google.android.material.tabs.TabLayout$g     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout r6 = r1.f112146h     // Catch:{ all -> 0x00db }
            r5.<init>(r6)     // Catch:{ all -> 0x00db }
            r3.addOnPageChangeListener(r5)     // Catch:{ all -> 0x00db }
            com.tencent.mm.plugin.game.chatroom.channel.a r3 = r1.f112148j     // Catch:{ all -> 0x00db }
            int r3 = r3.getCount()     // Catch:{ all -> 0x00db }
            if (r3 == 0) goto L_0x006f
            ax1.g r3 = r1.f112149n     // Catch:{ all -> 0x00db }
            if (r3 == 0) goto L_0x006f
            java.lang.String r5 = ""
            r3.mo62211a(r2, r5)     // Catch:{ all -> 0x00db }
            ax1.g r2 = r1.f112149n     // Catch:{ all -> 0x00db }
            r3 = 0
            r2.mo62212b(r4, r3, r4)     // Catch:{ all -> 0x00db }
        L_0x006f:
            com.tencent.mm.plugin.game.chatroom.channel.a r2 = r1.f112148j     // Catch:{ all -> 0x00db }
            int r2 = r2.getCount()     // Catch:{ all -> 0x00db }
            com.tencent.mm.plugin.game.chatroom.channel.a r3 = r1.f112148j     // Catch:{ all -> 0x00db }
            java.util.List<com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment> r3 = r3.f112164j     // Catch:{ all -> 0x00db }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x00db }
            r3.clear()     // Catch:{ all -> 0x00db }
            r3 = 0
        L_0x007f:
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r5 = r0.channel_list     // Catch:{ all -> 0x00db }
            int r5 = r5.size()     // Catch:{ all -> 0x00db }
            if (r3 >= r5) goto L_0x009a
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r5 = r0.channel_list     // Catch:{ all -> 0x00db }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x00db }
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r5 = (com.tencent.p014mm.plugin.game.autogen.chatroom.Channel) r5     // Catch:{ all -> 0x00db }
            int r6 = r1.f112156u     // Catch:{ all -> 0x00db }
            int r5 = r5.channel_id     // Catch:{ all -> 0x00db }
            if (r6 != r5) goto L_0x0097
            r0.default_channel_id = r6     // Catch:{ all -> 0x00db }
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x009a:
            r3 = 0
            r5 = 0
        L_0x009c:
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r6 = r0.channel_list     // Catch:{ all -> 0x00db }
            int r6 = r6.size()     // Catch:{ all -> 0x00db }
            if (r3 >= r6) goto L_0x010d
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r6 = r0.channel_list     // Catch:{ all -> 0x00db }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ all -> 0x00db }
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r6 = (com.tencent.p014mm.plugin.game.autogen.chatroom.Channel) r6     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout r7 = r1.f112146h     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout$f r7 = r7.mo146908l()     // Catch:{ all -> 0x00db }
            android.view.View r8 = r1.mo65385d(r6)     // Catch:{ all -> 0x00db }
            r7.f154605f = r8     // Catch:{ all -> 0x00db }
            r7.mo76124e()     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout r8 = r1.f112146h     // Catch:{ all -> 0x00db }
            r8.mo146889d(r7, r4)     // Catch:{ all -> 0x00db }
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment r8 = new com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment     // Catch:{ all -> 0x00db }
            int r9 = r0.default_channel_id     // Catch:{ all -> 0x00db }
            r10 = r23
            r8.<init>(r10, r9)     // Catch:{ all -> 0x00db }
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r9 = r0.channel_list     // Catch:{ all -> 0x00db }
            r8.f112128g = r6     // Catch:{ all -> 0x00db }
            int r11 = r6.channel_id     // Catch:{ all -> 0x00db }
            r8.f112131j = r11     // Catch:{ all -> 0x00db }
            r8.f112129h = r9     // Catch:{ all -> 0x00db }
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r12 = r8.f112126e     // Catch:{ all -> 0x00db }
            if (r12 == 0) goto L_0x00dd
            r12.mo65534J1(r11, r9)     // Catch:{ all -> 0x00db }
            goto L_0x00dd
        L_0x00db:
            r0 = move-exception
            goto L_0x013b
        L_0x00dd:
            com.tencent.mm.plugin.game.chatroom.channel.a r9 = r1.f112148j     // Catch:{ all -> 0x00db }
            java.util.List<com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment> r9 = r9.f112164j     // Catch:{ all -> 0x00db }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x00db }
            r9.add(r8)     // Catch:{ all -> 0x00db }
            int r8 = r0.default_channel_id     // Catch:{ all -> 0x00db }
            int r6 = r6.channel_id     // Catch:{ all -> 0x00db }
            if (r8 != r6) goto L_0x00ed
            r5 = r3
        L_0x00ed:
            com.tencent.mm.game.report.d$a r11 = com.tencent.p014mm.game.report.C40308d.f108375a     // Catch:{ all -> 0x00db }
            int r3 = r3 + 1
            long r12 = (long) r3     // Catch:{ all -> 0x00db }
            r14 = 1
            long r8 = r1.f112144f     // Catch:{ all -> 0x00db }
            r21 = r5
            long r4 = r1.f112143e     // Catch:{ all -> 0x00db }
            r16 = r8
            r18 = r4
            r20 = r6
            r11.mo63005q(r12, r14, r16, r18, r20)     // Catch:{ all -> 0x00db }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00db }
            r7.f154600a = r4     // Catch:{ all -> 0x00db }
            r5 = r21
            r4 = 0
            goto L_0x009c
        L_0x010d:
            if (r2 == 0) goto L_0x0114
            com.tencent.mm.plugin.game.chatroom.channel.a r0 = r1.f112148j     // Catch:{ all -> 0x00db }
            r0.notifyDataSetChanged()     // Catch:{ all -> 0x00db }
        L_0x0114:
            com.tencent.mm.ui.base.CustomViewPager r0 = r1.mViewPager     // Catch:{ all -> 0x00db }
            r2 = 20
            r0.setOffscreenPageLimit(r2)     // Catch:{ all -> 0x00db }
            com.tencent.mm.ui.base.CustomViewPager r0 = r1.mViewPager     // Catch:{ all -> 0x00db }
            androidx.viewpager.widget.a r0 = r0.getAdapter()     // Catch:{ all -> 0x00db }
            if (r0 != 0) goto L_0x012a
            com.tencent.mm.ui.base.CustomViewPager r0 = r1.mViewPager     // Catch:{ all -> 0x00db }
            com.tencent.mm.plugin.game.chatroom.channel.a r2 = r1.f112148j     // Catch:{ all -> 0x00db }
            r0.setAdapter(r2)     // Catch:{ all -> 0x00db }
        L_0x012a:
            com.google.android.material.tabs.TabLayout r0 = r1.f112146h     // Catch:{ all -> 0x00db }
            com.google.android.material.tabs.TabLayout$f r0 = r0.mo146907k(r5)     // Catch:{ all -> 0x00db }
            r0.mo76121b()     // Catch:{ all -> 0x00db }
            monitor-exit(r22)
            return
        L_0x0135:
            if (r25 != 0) goto L_0x013d
            r22.mo65384c()     // Catch:{ all -> 0x00db }
            goto L_0x013d
        L_0x013b:
            monitor-exit(r22)
            throw r0
        L_0x013d:
            monitor-exit(r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.channel.ChatChannelPage.mo65388g(java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo, boolean):void");
    }

    public Channel getRookieChannel() {
        LinkedList<Channel> linkedList;
        boolean z;
        ChannelInfo channelInfo = this.f112153r;
        if (channelInfo == null || (linkedList = channelInfo.channel_list) == null) {
            return null;
        }
        Iterator<Channel> it = linkedList.iterator();
        while (it.hasNext()) {
            Channel next = it.next();
            if (next.channel_id == 2) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return next;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C86709a0.m107524d().mo123455a(4383, this);
        C86709a0.m107524d().mo123455a(4569, this);
        C86709a0.m107524d().mo123455a(4989, this);
        C86709a0.m107524d().mo123455a(4565, this);
        this.f112157v.alive();
        this.f112158w.alive();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C86709a0.m107524d().mo123470p(4383, this);
        C86709a0.m107524d().mo123470p(4569, this);
        C86709a0.m107524d().mo123470p(4989, this);
        C86709a0.m107524d().mo123470p(4565, this);
        this.f112157v.dead();
        this.f112158w.dead();
        if (!(this.f112153r == null || this.f112152q == null)) {
            GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
            GamePBCacheEvent.C40109a aVar = gamePBCacheEvent.f107561d;
            aVar.f107562a = 2;
            aVar.f107563b = "cache_game_chat_msg#" + this.f112152q + "#channel";
            try {
                gamePBCacheEvent.f107561d.f107564c = this.f112153r.toByteArray();
            } catch (IOException unused) {
            }
            gamePBCacheEvent.publish();
        }
        C101218e0 e0Var = this.f112154s;
        if (e0Var != null) {
            e0Var.mo140680z();
            this.f112154s = null;
        }
        this.f112155t = false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        GetMyChatroomResponse getMyChatroomResponse;
        GameChatListView.C41771f fVar;
        int type = yVar.getType();
        if (type == 4383) {
            boolean z = ((SetChatroomMsgChosenRequest) ((C39866s) yVar).f106917e.f127055a.f127080a).is_chosen;
            if (i == 0 && i2 == 0) {
                C76912y0.m92768g(this.f112142d, MMApplicationContext.getResources().getString(z ? C0966R.string.b3t : C0966R.string.b3v));
            } else {
                C76912y0.m92767f(this.f112142d, MMApplicationContext.getResources().getString(z ? C0966R.string.b3s : C0966R.string.b3u));
            }
        } else if (type == 4569) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_VOTE_EDUCATION_INT, 1);
            C39870v vVar = (C39870v) yVar;
            C47465a aVar = vVar.f106926e.f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest");
            VoteMsgRequest voteMsgRequest = (VoteMsgRequest) aVar;
            C47465a aVar2 = vVar.f106926e.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse");
            VoteMsgResponse voteMsgResponse = (VoteMsgResponse) aVar2;
            JumpInfo jumpInfo = voteMsgResponse.education_jump_info;
            if (jumpInfo != null) {
                C53601h.m60129h(this.f112142d, jumpInfo);
            }
            VoteInfo voteInfo = voteMsgResponse.vote_info;
            if (voteInfo != null) {
                if (voteInfo.voted_by_me) {
                    Context context = this.f112142d;
                    C76912y0.m92766e(context, context.getString(C0966R.string.fjj), new C41683b());
                    C40308d.f108375a.mo62998h((long) vVar.f106929h.intValue(), 37, this.f112144f, this.f112143e, vVar.f106927f.longValue(), vVar.f106928g, 0, this.f112150o, voteMsgResponse.report_ext_info);
                } else {
                    C40308d.f108375a.mo62998h((long) vVar.f106929h.intValue(), 2, this.f112144f, this.f112143e, vVar.f106927f.longValue(), vVar.f106928g, 0, this.f112150o, voteMsgResponse.report_ext_info);
                }
                long j = voteMsgRequest.seq;
                C41684a aVar3 = this.f112148j;
                if (aVar3 != null) {
                    Iterator it = ((ArrayList) aVar3.f112164j).iterator();
                    while (it.hasNext()) {
                        GameChatListView gameChatListView = ((ChatChannelFragment) it.next()).f112126e;
                        if (!(gameChatListView == null || (fVar = gameChatListView.f112506C1) == null)) {
                            ((C119157j) C119157j.f356862d).mo183875f(new C41826n0(fVar, j, voteInfo));
                            Iterator it4 = ((HashSet) fVar.f112561i).iterator();
                            while (it4.hasNext()) {
                                C46337n nVar = (C46337n) it4.next();
                                ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
                                if (chatroomMsgPack != null && chatroomMsgPack.seq == j) {
                                    nVar.mo71739z(voteInfo);
                                }
                            }
                        }
                    }
                }
            }
        } else if (type == 4989) {
            C39854i iVar = (C39854i) yVar;
            if (iVar.f106884f == 19527) {
                this.f112155t = false;
                if (i == 0 && i2 == 0 && (getMyChatroomResponse = (GetMyChatroomResponse) iVar.f106883e.f127056b.f127083a) != null && this.f112148j != null) {
                    LinkedList<MyChatroomInfo> linkedList = getMyChatroomResponse.my_chatroom_info_list;
                    if (this.f112154s != null && !Util.isNullOrNil((List) linkedList)) {
                        this.f112154s.mo140680z();
                        GameChatRoomSelectView gameChatRoomSelectView = new GameChatRoomSelectView(this.f112142d);
                        gameChatRoomSelectView.setOnCloseListener(new C41686c(this));
                        gameChatRoomSelectView.setData(linkedList);
                        this.f112154s.mo140664k(gameChatRoomSelectView, 0, 0);
                        this.f112154s.mo140655A();
                    }
                }
            }
        } else if (type == 4565 && i == 0 && i2 == 0) {
            Context context2 = this.f112142d;
            C76912y0.m92768g(context2, context2.getString(C0966R.string.m7t));
            C39862p pVar = (C39862p) yVar;
            Object value = pVar.f106909g.getValue();
            C87412m.m108593f(value, "<get-commReqResp>(...)");
            C47465a aVar4 = ((C47350c) value).f127056b.f127083a;
            C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse");
            PublishChatroomMsgResponse publishChatroomMsgResponse = (PublishChatroomMsgResponse) aVar4;
            TopicInfo topicInfo = publishChatroomMsgResponse.topic_info;
            if (topicInfo != null && !Util.isNullOrNil(topicInfo.content_url)) {
                C41874g.m45398b(this.f112142d, publishChatroomMsgResponse.topic_info.content_url, -1, false, "");
                C40308d.C40309a aVar5 = C40308d.f108375a;
                long j2 = this.f112144f;
                long j3 = this.f112143e;
                Object value2 = pVar.f106909g.getValue();
                C87412m.m108593f(value2, "<get-commReqResp>(...)");
                C47465a aVar6 = ((C47350c) value2).f127055a.f127080a;
                C87412m.m108592e(aVar6, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest");
                aVar5.mo62997g(22, 7, j2, j3, ((PublishChatroomMsgRequest) aVar6).seq, "", 0, 1);
                long j4 = this.f112144f;
                long j5 = this.f112143e;
                Object value3 = pVar.f106909g.getValue();
                C87412m.m108593f(value3, "<get-commReqResp>(...)");
                C47465a aVar7 = ((C47350c) value3).f127055a.f127080a;
                C87412m.m108592e(aVar7, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest");
                aVar5.mo62997g(22, 14, j4, j5, ((PublishChatroomMsgRequest) aVar7).seq, "", 0, 1);
            }
        }
    }

    public void setChatRoomJumpInfo(ChatroomJumpInfo chatroomJumpInfo) {
        C41684a aVar = this.f112148j;
        if (aVar != null) {
            Iterator it = ((ArrayList) aVar.f112164j).iterator();
            while (it.hasNext()) {
                ChatChannelFragment chatChannelFragment = (ChatChannelFragment) it.next();
                chatChannelFragment.f112135q = chatroomJumpInfo;
                GameChatListView gameChatListView = chatChannelFragment.f112126e;
                if (gameChatListView != null) {
                    gameChatListView.setChatRoomJumpInfo(chatroomJumpInfo);
                }
            }
        }
    }

    public void setHostContact(C39641d dVar) {
        C41684a aVar = this.f112148j;
        if (aVar != null) {
            Iterator it = ((ArrayList) aVar.f112164j).iterator();
            while (it.hasNext()) {
                ChatChannelFragment chatChannelFragment = (ChatChannelFragment) it.next();
                chatChannelFragment.f112134p = dVar;
                GameChatListView gameChatListView = chatChannelFragment.f112126e;
                if (gameChatListView != null) {
                    gameChatListView.setHostContact(dVar);
                }
            }
        }
    }

    public void setJumpFirstSeq(long j) {
        C41684a aVar = this.f112148j;
        if (aVar != null) {
            Iterator it = ((ArrayList) aVar.f112164j).iterator();
            while (it.hasNext()) {
                ChatChannelFragment chatChannelFragment = (ChatChannelFragment) it.next();
                chatChannelFragment.f112138t = j;
                GameChatListView gameChatListView = chatChannelFragment.f112126e;
                if (gameChatListView != null) {
                    gameChatListView.setJumpFirstSeq(j);
                }
            }
        }
    }

    public void setPreloadInfo(JumpInfo jumpInfo) {
        C41684a aVar = this.f112148j;
        if (aVar != null) {
            Iterator it = ((ArrayList) aVar.f112164j).iterator();
            while (it.hasNext()) {
                ChatChannelFragment chatChannelFragment = (ChatChannelFragment) it.next();
                chatChannelFragment.f112136r = jumpInfo;
                GameChatListView gameChatListView = chatChannelFragment.f112126e;
                if (gameChatListView != null) {
                    gameChatListView.setPreloadInfo(jumpInfo);
                }
            }
        }
    }

    public void setPremadeCardInfo(String str) {
        C41684a aVar = this.f112148j;
        if (aVar != null) {
            Iterator it = ((ArrayList) aVar.f112164j).iterator();
            while (it.hasNext()) {
                ChatChannelFragment chatChannelFragment = (ChatChannelFragment) it.next();
                chatChannelFragment.f112137s = str;
                GameChatListView gameChatListView = chatChannelFragment.f112126e;
                if (gameChatListView != null) {
                    gameChatListView.setPremadeCardInfo(str);
                }
            }
        }
    }

    public void setUICallback(C39644g gVar) {
        this.f112149n = gVar;
    }
}
