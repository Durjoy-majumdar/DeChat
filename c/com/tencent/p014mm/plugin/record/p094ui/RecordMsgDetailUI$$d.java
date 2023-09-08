package com.tencent.p014mm.plugin.record.p094ui;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C97625j3;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p215oo.C77032h;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$d */
public class RecordMsgDetailUI$$d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgDetailUI f272566d;

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$d$a */
    public class C94337a implements C11182m0 {
        public C94337a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (!C75569c4.m90671d(RecordMsgDetailUI$$d.this.f272566d.f272554t)) {
                if (!C75569c4.m90692y(RecordMsgDetailUI$$d.this.f272566d.f272554t)) {
                    e0Var.mo107142f(0, RecordMsgDetailUI$$d.this.f272566d.getString(C0966R.string.crb));
                }
                if (RecordMsgDetailUI$$d.this.f272566d.getIntent().getIntExtra("from_scene", 0) == 0) {
                    e0Var.mo107142f(2, RecordMsgDetailUI$$d.this.f272566d.getString(C0966R.string.f361137hk2));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$d$b */
    public class C94338b implements C77407n.C12924o {
        public C94338b() {
        }

        /* renamed from: a */
        public void mo2362a() {
            C68144a.m80546b(RecordMsgDetailUI$$d.this.f272566d.f272554t, 3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$d$c */
    public class C94339c implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$d$c$a */
        public class C94340a implements DialogInterface.OnClickListener {
            public C94340a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                intent.putExtra("Retr_Msg_Type", 10);
                if (RecordMsgDetailUI$$d.this.f272566d.getIntent().getIntExtra("from_scene", 0) == 0) {
                    intent.putExtra("from_scene", 0);
                }
                intent.putExtra("Retr_Msg_Id", RecordMsgDetailUI$$d.this.f272566d.f272555u);
                C88144b.m109802t(RecordMsgDetailUI$$d.this.f272566d, ".ui.transmit.SelectConversationUI", intent, 1001);
                ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
                dialogInterface.dismiss();
            }
        }

        public C94339c() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                if (!((Boolean) C97625j3.m125812b().mo105906u().mo119684e(327714, Boolean.FALSE)).booleanValue()) {
                    C97625j3.m125812b().mo105906u().mo119676J(327714, Boolean.TRUE);
                    RecordMsgDetailUI recordMsgDetailUI = RecordMsgDetailUI$$d.this.f272566d;
                    C77389a aVar = new C77389a();
                    aVar.f225660q = RecordMsgDetailUI$$d.this.f272566d.getResources().getString(C0966R.string.hui);
                    aVar.f225644a = RecordMsgDetailUI$$d.this.f272566d.getResources().getString(C0966R.string.a3h);
                    aVar.f225663t = C0086a.m38a(recordMsgDetailUI).getString(C0966R.string.fmz);
                    aVar.f225620C = new C94340a();
                    C77398g gVar = new C77398g(recordMsgDetailUI, C0966R.style.a66);
                    gVar.mo107525e(aVar);
                    gVar.show();
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    intent.putExtra("mutil_select_is_ret", true);
                    intent.putExtra("Retr_Msg_Type", 10);
                    intent.putExtra("Retr_Msg_Id", RecordMsgDetailUI$$d.this.f272566d.f272555u);
                    if (RecordMsgDetailUI$$d.this.f272566d.getIntent().getIntExtra("from_scene", 0) == 0) {
                        intent.putExtra("from_scene", 0);
                    }
                    C88144b.m109802t(RecordMsgDetailUI$$d.this.f272566d, ".ui.transmit.SelectConversationUI", intent, 1001);
                    ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
                }
                C68144a.m80546b(RecordMsgDetailUI$$d.this.f272566d.f272554t, 2);
            } else if (itemId == 2) {
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                C96787m0.m124255i(doFavoriteEvent, RecordMsgDetailUI$$d.this.f272566d.f272555u);
                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                aVar2.f264688m = 9;
                aVar2.f264684i = RecordMsgDetailUI$$d.this.f272566d;
                doFavoriteEvent.publish();
            }
        }
    }

    public RecordMsgDetailUI$$d(RecordMsgDetailUI recordMsgDetailUI) {
        this.f272566d = recordMsgDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C68144a.m80546b(this.f272566d.f272554t, 1);
        C77407n nVar = new C77407n((Context) this.f272566d.getContext(), 1, false);
        nVar.f225771i = new C94337a();
        nVar.f225802y = new C94338b();
        nVar.f225782p = new C94339c();
        nVar.mo107573q();
        return true;
    }
}
