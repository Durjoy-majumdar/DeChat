package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import f62.C7994b0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.chatroom.ui.b */
public final class C1204b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatRoomBindAppUI f10232d;

    /* renamed from: com.tencent.mm.chatroom.ui.b$a */
    public static final class C1205a implements C7994b0.C7995a {

        /* renamed from: a */
        public final /* synthetic */ ChatRoomBindAppUI f10233a;

        /* renamed from: com.tencent.mm.chatroom.ui.b$a$a */
        public static final class C1206a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ChatRoomBindAppUI f10234d;

            /* renamed from: e */
            public final /* synthetic */ Intent f10235e;

            public C1206a(ChatRoomBindAppUI chatRoomBindAppUI, Intent intent) {
                this.f10234d = chatRoomBindAppUI;
                this.f10235e = intent;
            }

            public final void run() {
                this.f10234d.setResult(-1, this.f10235e);
                this.f10234d.finish();
            }
        }

        public C1205a(ChatRoomBindAppUI chatRoomBindAppUI) {
            this.f10233a = chatRoomBindAppUI;
        }

        /* renamed from: a */
        public final void mo1112a(boolean z, String str, String str2) {
            if (z) {
                C76912y0.m92768g(this.f10233a.getContext(), this.f10233a.getContext().getString(C0966R.string.f360241b42));
                Intent intent = new Intent();
                intent.putExtra("key_chat_room_open_id", str2);
                C119179t tVar = C119157j.f356862d;
                C1206a aVar = new C1206a(this.f10233a, intent);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 500, false);
            }
        }
    }

    public C1204b(ChatRoomBindAppUI chatRoomBindAppUI) {
        this.f10232d = chatRoomBindAppUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/ui/ChatRoomBindAppUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChatRoomBindAppUI chatRoomBindAppUI = this.f10232d;
        C7994b0.C7996b bVar = chatRoomBindAppUI.f10136d;
        C87412m.m108591d(bVar);
        ((C7994b0) C86312j.m106911c(C7994b0.class)).J80(chatRoomBindAppUI, bVar, new C1205a(this.f10232d));
        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ChatRoomBindAppUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
