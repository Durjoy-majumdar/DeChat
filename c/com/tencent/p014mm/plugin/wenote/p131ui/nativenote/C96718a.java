package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ke3.C88144b;
import nj3.C76879j;
import p215oo.C77032h;
import p645pj.C77092c;
import pb1.C100695a0;
import pb1.C100718j1;
import pb1.C100755z;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.a */
public class C96718a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI f283326d;

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.a$a */
    public class C96719a implements Runnable {
        public C96719a() {
        }

        public void run() {
            NoteEditorUI noteEditorUI = C96718a.this.f283326d;
            int i = NoteEditorUI.f283207p1;
            noteEditorUI.mo134921P7();
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 32;
            aVar.f264839e = C96718a.this.f283326d.f283270x;
            favoriteOperationEvent.publish();
            FavoriteOperationEvent.C92516b bVar = favoriteOperationEvent.f264834e;
            boolean z = bVar.f264863i;
            boolean z2 = bVar.f264855a != 0;
            Log.m105925i("MicroMsg.Note.NoteEditorUI", "filter itemInfo localId:%s isPause:%s ret:%s", Long.valueOf(C96718a.this.f283326d.f283270x), Boolean.valueOf(favoriteOperationEvent.f264834e.f264863i), Integer.valueOf(favoriteOperationEvent.f264834e.f264855a));
            if (favoriteOperationEvent.f264834e.f264857c == null) {
                Log.m105924i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] path = null");
                C76879j.m92726T(C96718a.this.f283326d.getContext(), C96718a.this.f283326d.getString(C0966R.string.cqy));
            } else if (z) {
                Log.m105924i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] notDownload");
                C76879j.m92726T(C96718a.this.f283326d.getContext(), C96718a.this.f283326d.getString(C0966R.string.f7264w));
            } else if (z2) {
                Log.m105924i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] notUpload");
                C76879j.m92726T(C96718a.this.f283326d.getContext(), C96718a.this.f283326d.getString(C0966R.string.f7265x));
            } else {
                long g = C77092c.m93045g();
                NoteEditorUI noteEditorUI2 = C96718a.this.f283326d;
                long j = noteEditorUI2.f283270x;
                noteEditorUI2.getClass();
                C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
                long j2 = Yt != null ? Yt.field_datatotalsize : 0;
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "note2Send, totalSize:%s", Long.valueOf(j2));
                if (j2 > g) {
                    C76879j.m92726T(C96718a.this.f283326d.getContext(), C96718a.this.f283326d.getString(C0966R.string.f360442cv2, new Object[]{Util.getSizeKB(g)}));
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("scene_from", 1);
                intent.putExtra("mutil_select_is_ret", true);
                intent.putExtra("select_fav_local_id", C96718a.this.f283326d.f283270x);
                C88144b.m109802t(C96718a.this.f283326d, ".ui.transmit.SelectConversationUI", intent, 4101);
                C100695a0.m131729d(C96718a.this.f283326d.f283270x, 1, 0, -1);
                ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
                C96718a.this.f283326d.f270015g.f295027l++;
            }
        }
    }

    public C96718a(NoteEditorUI noteEditorUI) {
        this.f283326d = noteEditorUI;
    }

    public void run() {
        NoteEditorUI noteEditorUI = this.f283326d;
        String o = noteEditorUI.f283238X0.mo126205o();
        if (noteEditorUI.mo134919M7(o)) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 12;
            aVar.f264854t = 23;
            aVar.f264839e = noteEditorUI.f283270x;
            favoriteOperationEvent.publish();
        } else {
            if (noteEditorUI.f283209B || noteEditorUI.f283274z) {
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem noteeditorui, do savewnnotefavitem %s", Long.valueOf(noteEditorUI.f283270x));
                C96679b bVar = noteEditorUI.f283252j;
                noteEditorUI.mo134938f8(o, true, true, bVar.f283194j, bVar.f283195k, bVar.f283196l, noteEditorUI.f283238X0.mo126203m(o));
            } else if (noteEditorUI.f283208A) {
                Log.m105925i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem noteeditorui, do updateWNNoteFavitem %s", Long.valueOf(noteEditorUI.f283270x));
                C96679b bVar2 = noteEditorUI.f283252j;
                noteEditorUI.mo134938f8(o, false, true, bVar2.f283194j, bVar2.f283195k, bVar2.f283196l, noteEditorUI.f283238X0.mo126203m(o));
            }
            noteEditorUI.f283262p0 = true;
        }
        if (this.f283326d.f283249g1 != null) {
            MMHandlerThread.postToMainThread(new C96719a());
        }
    }
}
