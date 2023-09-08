package com.tencent.p014mm.plugin.game.chatroom.view;

import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.m0 */
public class C41809m0 implements C54258u {

    /* renamed from: a */
    public final /* synthetic */ GameChatListView.C41771f f112663a;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.m0$a */
    public class C41810a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f112664d;

        /* renamed from: e */
        public final /* synthetic */ int f112665e;

        public C41810a(int i, int i2) {
            this.f112664d = i;
            this.f112665e = i2;
        }

        public void run() {
            GameChatListView.this.f112506C1.notifyItemRangeChanged(this.f112664d, this.f112665e + 10, (Object) null);
        }
    }

    public C41809m0(GameChatListView.C41771f fVar) {
        this.f112663a = fVar;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        GameChatListView.this.f112506C1.notifyItemRangeRemoved(i, i2);
        Log.m105919d("GameChatRoom.GameChatListView", "test AdapterDiffCallback, channelId:%d, onRemoved，postion:%d, count:%d", Integer.valueOf(GameChatListView.this.f112513J1), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        GameChatListView.this.f112506C1.notifyItemRangeInserted(i, i2);
        if (GameChatListView.this.f112513J1 == 1) {
            C119179t tVar = C119157j.f356862d;
            C41810a aVar = new C41810a(i, i2);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 0, false);
        }
        Log.m105919d("GameChatRoom.GameChatListView", "test AdapterDiffCallback, channelId:%d, onInserted，postion:%d, count:%d", Integer.valueOf(GameChatListView.this.f112513J1), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        GameChatListView.this.f112506C1.notifyItemRangeChanged(i, i2, obj);
        Log.m105919d("GameChatRoom.GameChatListView", "test AdapterDiffCallback, channelId:%d, onChanged，position:%d, count:%d", Integer.valueOf(GameChatListView.this.f112513J1), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        GameChatListView.this.f112506C1.notifyItemMoved(i, i2);
        Log.m105919d("GameChatRoom.GameChatListView", "test AdapterDiffCallback, channelId:%d, onMoved，fromPosition:%d, toPosition:%d", Integer.valueOf(GameChatListView.this.f112513J1), Integer.valueOf(i), Integer.valueOf(i2));
    }
}
