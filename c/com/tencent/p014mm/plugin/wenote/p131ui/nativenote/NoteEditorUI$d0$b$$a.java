package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$a */
public final /* synthetic */ class NoteEditorUI$d0$b$$a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI.C96692d0.C96694b f283319d;

    public /* synthetic */ NoteEditorUI$d0$b$$a(NoteEditorUI.C96692d0.C96694b bVar) {
        this.f283319d = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        NoteEditorUI.C96692d0.C96694b bVar = this.f283319d;
        C89779i0 Q = C76879j.m92723Q(NoteEditorUI.this.getContext(), "", NoteEditorUI.this.getString(C0966R.string.f7946x3), false, false, (DialogInterface.OnCancelListener) null);
        NoteEditorUI.this.f283252j.mo134903a();
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        aVar.f264835a = 12;
        aVar.f264854t = 21;
        aVar.f264839e = NoteEditorUI.this.f283270x;
        aVar.f264844j = new NoteEditorUI$d0$b$$b(bVar, Q);
        favoriteOperationEvent.publish();
    }
}
