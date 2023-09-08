package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import d62.C7240a;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import l31.C61212e;
import p909ki.C76580c;
import rx3.C13604l;
import sx3.C90363p0;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.chatroom.ui.o1 */
public final class C67982o1 extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ Context f195118e;

    /* renamed from: f */
    public final /* synthetic */ String f195119f;

    /* renamed from: g */
    public final /* synthetic */ C76580c f195120g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67982o1(Context context, String str, C76580c cVar) {
        super(1, (C53155r0) null);
        this.f195118e = context;
        this.f195119f = str;
        this.f195120g = cVar;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        Intent intent = new Intent(this.f195118e, SelectedMemberChattingRecordUI.class);
        intent.putExtra("RoomInfo_Id", this.f195119f);
        intent.putExtra("room_member", this.f195120g.f224138d);
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f195118e.getString(C0966R.string.iib));
        Context context = this.f195118e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$6$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$6$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("base_chatroom_invite_manage_viewhistory", view, C90363p0.m113143b(new C13604l("Invitee_username", this.f195120g.f224138d)), 25772);
    }
}
