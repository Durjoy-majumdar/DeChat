package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ax1.C39645h;
import bx1.C39869u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ChatRoomLocateInfoEvent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomSeq;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Notification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import uy1.C52645f;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView */
public class ChatRoomStateView extends LinearLayout {

    /* renamed from: d */
    public Context f112436d;

    /* renamed from: e */
    public View f112437e;

    /* renamed from: f */
    public ChatMemberListView f112438f;

    /* renamed from: g */
    public View f112439g;

    /* renamed from: h */
    public ImageView f112440h;

    /* renamed from: i */
    public TextView f112441i;

    /* renamed from: j */
    public ImageView f112442j;

    /* renamed from: n */
    public TextView f112443n;

    /* renamed from: o */
    public String f112444o;

    /* renamed from: p */
    public List<Integer> f112445p = new CopyOnWriteArrayList();

    /* renamed from: q */
    public Notification f112446q;

    /* renamed from: r */
    public String f112447r;

    /* renamed from: s */
    public MTimerHandler f112448s = new MTimerHandler(new C41760a(), false);

    /* renamed from: t */
    public MTimerHandler f112449t = new MTimerHandler(new C30072b(), false);

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView$b */
    public class C30072b implements MTimerHandler.CallBack {
        public C30072b() {
        }

        public boolean onTimerExpired() {
            View view = ChatRoomStateView.this.f112439g;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$2", "onTimerExpired", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$2", "onTimerExpired", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ChatRoomStateView.this.f112446q = null;
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView$a */
    public class C41760a implements MTimerHandler.CallBack {
        public C41760a() {
        }

        public boolean onTimerExpired() {
            if (!Util.isNullOrNil(ChatRoomStateView.this.f112447r)) {
                ChatRoomStateView.this.mo65481a();
                return true;
            }
            ChatRoomStateView.this.f112443n.setText("");
            ChatRoomStateView.this.f112443n.setVisibility(8);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView$c */
    public class C41761c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Notification f112451d;

        public C41761c(Notification notification) {
            this.f112451d = notification;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C53601h.m60126e(ChatRoomStateView.this.f112444o).f150604a) {
                JumpInfo jumpInfo = this.f112451d.jump_info;
                if (jumpInfo.jump_type != 3 || jumpInfo.chatroom_seq == null) {
                    C53601h.m60129h(ChatRoomStateView.this.f112436d, jumpInfo);
                } else {
                    ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new ChatRoomLocateInfoEvent();
                    ChatRoomLocateInfoEvent.C40051a aVar = chatRoomLocateInfoEvent.f107403d;
                    ChatroomSeq chatroomSeq = this.f112451d.jump_info.chatroom_seq;
                    aVar.f107404a = chatroomSeq.channel_id;
                    aVar.f107405b = chatroomSeq.seq;
                    aVar.f107406c = true;
                    chatRoomLocateInfoEvent.publish();
                }
                Notification notification = this.f112451d;
                if (notification.click_after_close) {
                    ChatRoomStateView chatRoomStateView = ChatRoomStateView.this;
                    chatRoomStateView.f112449t.startTimer(0);
                    C86709a0.m107524d().mo123460f(new C39869u(chatRoomStateView.f112444o, 2, (long) notification.f112124id));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView$d */
    public class C41762d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Notification f112453d;

        public C41762d(Notification notification) {
            this.f112453d = notification;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChatRoomStateView chatRoomStateView = ChatRoomStateView.this;
            Notification notification = this.f112453d;
            chatRoomStateView.f112449t.startTimer(0);
            C86709a0.m107524d().mo123460f(new C39869u(chatRoomStateView.f112444o, 3, (long) notification.f112124id));
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public ChatRoomStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f112436d = context;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6805p1, this);
        this.f112438f = (ChatMemberListView) findViewById(C0966R.C0970id.b0q);
    }

    /* renamed from: a */
    public final void mo65481a() {
        if (!Util.isNullOrNil(this.f112447r)) {
            this.f112443n.setTextColor(this.f112436d.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            this.f112443n.setText(this.f112447r);
            this.f112443n.setVisibility(0);
            this.f112443n.setTag(1);
        }
    }

    /* renamed from: b */
    public final void mo65482b(Notification notification) {
        Integer m;
        Integer m2;
        if (this.f112437e != null && notification != null) {
            Log.m105919d("GameChatRoom.ChatRoomStateView", "show notification id:%d", Integer.valueOf(notification.f112124id));
            this.f112446q = notification;
            View view = this.f112439g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView", "showNotification", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Notification;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView", "showNotification", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Notification;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f112439g.setClickable(false);
            if (notification.jump_info != null) {
                this.f112439g.setClickable(true);
                this.f112439g.setOnClickListener(new C41761c(notification));
            }
            Color color = notification.background_color;
            if (!(color == null || (m2 = C53601h.m60134m(Util.nullAsNil(color.dark_color))) == null)) {
                ((GradientDrawable) this.f112439g.getBackground()).setColor(m2.intValue());
            }
            if (!Util.isNullOrNil(notification.left_icon_url)) {
                this.f112440h.setVisibility(0);
                if (!(this.f112440h.getTag() instanceof String) || !this.f112440h.getTag().equals(notification.left_icon_url)) {
                    this.f112440h.setTag(notification.left_icon_url);
                    C52645f.m59023a().mo73595e(this.f112440h, notification.left_icon_url, (C52645f.C52650d) null, (C52645f.C52652e) null);
                }
            } else {
                this.f112440h.setVisibility(8);
            }
            this.f112441i.setText(notification.wording);
            Color color2 = notification.word_color;
            if (!(color2 == null || (m = C53601h.m60134m(Util.nullAsNil(color2.dark_color))) == null)) {
                this.f112441i.setTextColor(m.intValue());
            }
            if (!Util.isNullOrNil(notification.right_icon_url)) {
                this.f112442j.setVisibility(0);
                if (!(this.f112442j.getTag() instanceof String) || !this.f112442j.getTag().equals(notification.right_icon_url)) {
                    this.f112442j.setTag(notification.right_icon_url);
                    C52645f.m59023a().mo73595e(this.f112442j, notification.right_icon_url, (C52645f.C52650d) null, (C52645f.C52652e) null);
                }
                this.f112442j.setClickable(false);
                if (notification.right_icon_can_close) {
                    this.f112442j.setClickable(true);
                    this.f112442j.setOnClickListener(new C41762d(notification));
                    return;
                }
                return;
            }
            this.f112442j.setVisibility(8);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MTimerHandler mTimerHandler = this.f112448s;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = this.f112449t;
        if (mTimerHandler2 != null) {
            mTimerHandler2.stopTimer();
        }
    }

    public void setPremadeCardInfo(String str) {
        this.f112438f.setPremadeCardInfo(str);
    }

    public void setStateChangeListener(C39645h hVar) {
        this.f112438f.setStateChangeListener(hVar);
    }

    public ChatRoomStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112436d = context;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6805p1, this);
        this.f112438f = (ChatMemberListView) findViewById(C0966R.C0970id.b0q);
    }
}
