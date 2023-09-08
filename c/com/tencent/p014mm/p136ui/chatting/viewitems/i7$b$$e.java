package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import ck3.C67391b;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ShareMsgClipStruct;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75569c4;
import eb0.C75592q0;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;
import te3.C101801kd0;
import te3.C101835rd0;
import u73.C101982p;
import u73.C14134p0;
import ww0.C78732i;
import xo3.C78950d;
import zj3.C79350e1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$b$$e */
public class i7$b$$e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C74059i7.C74068g f217372d;

    /* renamed from: e */
    public final /* synthetic */ Context f217373e;

    /* renamed from: f */
    public final /* synthetic */ C67391b f217374f;

    /* renamed from: g */
    public final /* synthetic */ C72963f4 f217375g;

    /* renamed from: h */
    public final /* synthetic */ C74059i7.C74061b f217376h;

    public i7$b$$e(C74059i7.C74061b bVar, C74059i7.C74068g gVar, Context context, C67391b bVar2, C72963f4 f4Var) {
        this.f217376h = bVar;
        this.f217372d = gVar;
        this.f217373e = context;
        this.f217374f = bVar2;
        this.f217375g = f4Var;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C101835rd0 rd02;
        C74243t8 t8Var;
        C74059i7.C74061b bVar = this.f217376h;
        bVar.f217311z = i;
        bVar.f217310y = menuItem.getItemId();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Context context = MMApplicationContext.getContext();
            CharSequence charSequence = this.f217376h.f217309x;
            ClipboardHelper.setText(context, charSequence, charSequence);
            C78950d dVar = this.f217372d.f217330j;
            if (dVar != null) {
                dVar.mo108922f();
                C78950d dVar2 = this.f217372d.f217330j;
                dVar2.f231828C = true;
                dVar2.f231829D = true;
                dVar2.mo108921e();
            }
            C74059i7.m88003h(this.f217373e);
            try {
                C74243t8 t8Var2 = (C74243t8) this.f217372d.f217322b.getTag();
                if (t8Var2 != null) {
                    String z = ((C79350e1) this.f217374f.f193278b.mo102812a(C79350e1.class)).mo102315z(t8Var2.f212238a, false);
                    ShareMsgClipStruct shareMsgClipStruct = new ShareMsgClipStruct();
                    shareMsgClipStruct.f194382d = t8Var2.f212238a.mo108774y2();
                    shareMsgClipStruct.f194384f = z.length();
                    shareMsgClipStruct.f194383e = this.f217376h.f217309x.length();
                    shareMsgClipStruct.f194385g = C75569c4.m90675h(t8Var2.f212238a);
                    shareMsgClipStruct.mo86054n();
                    C74059i7.m88000e(t8Var2.f212238a, 3, this.f217376h.f217309x.length());
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingItemTextTo", "report occur exception! %s", e.getMessage());
            }
        } else if (itemId == 1) {
            C78950d dVar3 = this.f217372d.f217330j;
            if (dVar3 != null) {
                C78950d.C78963m mVar = dVar3.f231845g;
                if (mVar != null) {
                    mVar.mo103119d();
                }
                C78950d dVar4 = this.f217372d.f217330j;
                dVar4.f231828C = true;
                dVar4.mo108921e();
                C74059i7.C74068g gVar = this.f217372d;
                gVar.f217330j.mo108923g(0, gVar.f217322b.mo154968a().length());
                this.f217372d.f217330j.mo108924h();
                this.f217372d.f217330j.mo108927k();
                C78950d.C78963m mVar2 = this.f217372d.f217330j.f231845g;
                if (mVar2 != null) {
                    mVar2.mo103120e();
                }
            }
        } else if (itemId == 2) {
            C74059i7.m88000e(this.f217375g, 4, 0);
            Intent intent = new Intent(this.f217373e, MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", this.f217375g.getMsgId());
            intent.putExtra("Retr_Msg_content", this.f217376h.f217309x);
            intent.putExtra("Retr_Msg_Type", 4);
            Context context2 = this.f217373e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (itemId == 3) {
            C74059i7.m88000e(this.f217375g, 5, 0);
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            C96787m0.m124258l(doFavoriteEvent, this.f217376h.f217309x.toString(), 1);
            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
            aVar2.f264685j = this.f217376h.f217307v.f193286j;
            aVar2.f264688m = 43;
            C101801kd0 kd02 = aVar2.f264676a;
            if (!(kd02 == null || (rd02 = kd02.f298616d) == null || (t8Var = (C74243t8) this.f217372d.f217322b.getTag()) == null)) {
                rd02.mo141275k(C75592q0.m90789s());
                rd02.mo141279o(t8Var.f212238a.mo108768t());
                doFavoriteEvent.publish();
            }
            C78950d dVar5 = this.f217372d.f217330j;
            if (dVar5 != null) {
                dVar5.mo108922f();
                C78950d dVar6 = this.f217372d.f217330j;
                dVar6.f231828C = true;
                dVar6.f231829D = true;
                dVar6.mo108921e();
            }
        } else if (itemId == 4) {
            String str = "65_" + C31543z5.m39453c();
            String charSequence2 = this.f217376h.f217309x.toString();
            this.f217376h.mo103071D(this.f217374f, this.f217375g, 2, !Util.isNullOrNil(((C78732i) C86312j.m106911c(C78732i.class)).Lp0(charSequence2)), charSequence2, true, str, 3);
            C14134p0 p0Var = new C14134p0();
            p0Var.f39544a = this.f217373e;
            p0Var.f39545b = 65;
            p0Var.f39547d = charSequence2;
            p0Var.f39548e = str;
            p0Var.f39549f = true;
            p0Var.f39552i = false;
            p0Var.f39555l = true;
            ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
        }
    }
}
