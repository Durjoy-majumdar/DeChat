package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomJumpDetail;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import uy1.C52645f;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView */
public class ChatRoomFooterView extends LinearLayout {

    /* renamed from: d */
    public Context f112361d;

    /* renamed from: e */
    public View f112362e;

    /* renamed from: f */
    public ImageView f112363f;

    /* renamed from: g */
    public TextView f112364g;

    /* renamed from: h */
    public View f112365h;

    /* renamed from: i */
    public ImageView f112366i;

    /* renamed from: j */
    public TextView f112367j;

    /* renamed from: n */
    public View f112368n;

    /* renamed from: o */
    public ImageView f112369o;

    /* renamed from: p */
    public long f112370p;

    /* renamed from: q */
    public long f112371q;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView$a */
    public class C41742a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChatroomJumpDetail f112372d;

        public C41742a(ChatroomJumpDetail chatroomJumpDetail) {
            this.f112372d = chatroomJumpDetail;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int h = C53601h.m60129h(ChatRoomFooterView.this.f112361d, this.f112372d.jump_info);
            C40308d.C40309a aVar = C40308d.f108375a;
            long k = C53601h.m60132k(h);
            ChatRoomFooterView chatRoomFooterView = ChatRoomFooterView.this;
            aVar.mo62999k(1003, 1, k, 0, chatRoomFooterView.f112371q, chatRoomFooterView.f112370p, "", "", "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView$b */
    public class C41743b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChatroomJumpDetail f112374d;

        public C41743b(ChatroomJumpDetail chatroomJumpDetail) {
            this.f112374d = chatroomJumpDetail;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int h = C53601h.m60129h(ChatRoomFooterView.this.f112361d, this.f112374d.jump_info);
            C40308d.C40309a aVar = C40308d.f108375a;
            long k = C53601h.m60132k(h);
            ChatRoomFooterView chatRoomFooterView = ChatRoomFooterView.this;
            aVar.mo62999k(1003, 3, k, 0, chatRoomFooterView.f112371q, chatRoomFooterView.f112370p, "", "", "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public ChatRoomFooterView(Context context) {
        super(context);
        mo65458b();
    }

    /* renamed from: a */
    public void mo65457a() {
        View view = this.f112368n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public final void mo65458b() {
        Context context = getContext();
        this.f112361d = context;
        this.f112370p = ((Activity) context).getIntent().getLongExtra("game_report_sourceid", 0);
        this.f112371q = ((Activity) this.f112361d).getIntent().getLongExtra("game_report_ssid", 0);
        LayoutInflater.from(this.f112361d).inflate(C0966R.C0971layout.f6802oy, this, true);
        this.f112362e = findViewById(C0966R.C0970id.d3a);
        this.f112363f = (ImageView) findViewById(C0966R.C0970id.d3_);
        this.f112364g = (TextView) findViewById(C0966R.C0970id.d3b);
        this.f112365h = findViewById(C0966R.C0970id.b1f);
        this.f112366i = (ImageView) findViewById(C0966R.C0970id.b1e);
        this.f112367j = (TextView) findViewById(C0966R.C0970id.b1g);
        this.f112368n = findViewById(C0966R.C0970id.ed5);
        this.f112369o = (ImageView) findViewById(C0966R.C0970id.ciy);
        if (C85875k4.m106211z()) {
            this.f112369o.setImageResource(C0966R.C0969drawable.bfq);
        } else {
            this.f112369o.setImageResource(C0966R.C0969drawable.bfr);
        }
    }

    /* renamed from: c */
    public void mo65459c(ChatroomJumpDetail chatroomJumpDetail, ChatroomJumpDetail chatroomJumpDetail2) {
        ChatroomJumpDetail chatroomJumpDetail3 = chatroomJumpDetail;
        ChatroomJumpDetail chatroomJumpDetail4 = chatroomJumpDetail2;
        if (chatroomJumpDetail3 != null) {
            View view = this.f112362e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (chatroomJumpDetail3.show_icon != null) {
                this.f112363f.setVisibility(0);
                C52645f.m59023a().mo73595e(this.f112363f, C85875k4.m106211z() ? chatroomJumpDetail3.show_icon.dark_icon : chatroomJumpDetail3.show_icon.light_icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
            } else {
                this.f112363f.setVisibility(8);
            }
            this.f112364g.setText(chatroomJumpDetail3.desc);
            this.f112362e.setOnClickListener(new C41742a(chatroomJumpDetail3));
            C40308d.f108375a.mo62999k(1003, 1, 1, 0, this.f112371q, this.f112370p, "", "", "");
        }
        if (chatroomJumpDetail4 != null) {
            View view3 = this.f112365h;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "setFooterInfo", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;Lcom/tencent/mm/plugin/game/autogen/chatroom/ChatroomJumpDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (chatroomJumpDetail4.show_icon != null) {
                this.f112366i.setVisibility(0);
                C52645f.m59023a().mo73595e(this.f112366i, C85875k4.m106211z() ? chatroomJumpDetail4.show_icon.dark_icon : chatroomJumpDetail4.show_icon.light_icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
            } else {
                this.f112366i.setVisibility(8);
            }
            this.f112367j.setText(chatroomJumpDetail4.desc);
            this.f112365h.setOnClickListener(new C41743b(chatroomJumpDetail4));
            C40308d.f108375a.mo62999k(1003, 3, 1, 0, this.f112371q, this.f112370p, "", "", "");
        }
    }

    public void setLbsInfo(Lbs lbs) {
    }

    public ChatRoomFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo65458b();
    }

    public ChatRoomFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo65458b();
    }
}
