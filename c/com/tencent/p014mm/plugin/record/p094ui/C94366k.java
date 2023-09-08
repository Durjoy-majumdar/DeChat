package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p910lj.C76701a;
import qg2.C101147j0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.record.ui.k */
public class C94366k implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgFileUI f272744d;

    /* renamed from: com.tencent.mm.plugin.record.ui.k$a */
    public class C94367a implements C11182m0 {
        public C94367a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(0, C94366k.this.f272744d.getString(C0966R.string.crb));
            RecordMsgFileUI recordMsgFileUI = C94366k.this.f272744d;
            String o = C86013q1.m106454o(C101147j0.m132636q(recordMsgFileUI.f272596u, recordMsgFileUI.f272594s, 1));
            if (((C92331c) C86312j.m106911c(C92331c.class)).mo58357LH() && C94366k.this.f272744d.f272598w != null && AbsHandOffFile.isSupportOpenFile(o)) {
                e0Var.mo107142f(1, C94366k.this.f272744d.getString(C0966R.string.cvp));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.k$b */
    public class C94368b implements C11184p0 {
        public C94368b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C86001b0 q;
            int itemId = menuItem.getItemId();
            int i2 = 1;
            if (itemId == 0) {
                RecordMsgFileUI recordMsgFileUI = C94366k.this.f272744d;
                int i3 = RecordMsgFileUI.f272577F;
                if (recordMsgFileUI.mo129684H7() == 8) {
                    RecordMsgFileUI recordMsgFileUI2 = C94366k.this.f272744d;
                    String q2 = C101147j0.m132636q(recordMsgFileUI2.f272596u, recordMsgFileUI2.f272594s, 1);
                    if (!C86013q1.m106450k(q2)) {
                        Log.m105920e("MicroMsg.RecordMsgFileUI", "share file failed, file not exists");
                        RecordMsgFileUI recordMsgFileUI3 = C94366k.this.f272744d;
                        C76701a.makeText((Context) recordMsgFileUI3, (CharSequence) recordMsgFileUI3.getString(C0966R.string.cr_), 1).show();
                        return;
                    }
                    Uri n = C116299g2.m163858n(q2);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    long j = 0;
                    if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                        j = q.f250473c;
                    }
                    if (j > RecordMsgFileUI.f272576E) {
                        Log.m105920e("MicroMsg.RecordMsgFileUI", "share file failed, file too large");
                        RecordMsgFileUI recordMsgFileUI4 = C94366k.this.f272744d;
                        C76701a.makeText((Context) recordMsgFileUI4, (CharSequence) recordMsgFileUI4.getString(C0966R.string.cra), 1).show();
                        return;
                    }
                }
                RecordMsgFileUI recordMsgFileUI5 = C94366k.this.f272744d;
                recordMsgFileUI5.getClass();
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                if (recordMsgFileUI5.mo129684H7() == 15) {
                    i2 = 11;
                    intent.putExtra("image_path", recordMsgFileUI5.mo129685I7());
                } else if (recordMsgFileUI5.mo129684H7() == 4) {
                    intent.putExtra("image_path", recordMsgFileUI5.mo129685I7());
                } else {
                    intent.putExtra("desc_title", recordMsgFileUI5.f272596u.f299297d);
                    i2 = 3;
                }
                intent.putExtra("Retr_Msg_Type", i2);
                C88144b.m109802t(recordMsgFileUI5, ".ui.transmit.SelectConversationUI", intent, 1001);
            } else if (itemId == 1 && C94366k.this.f272744d.f272598w != null) {
                ((C92331c) C86312j.m106911c(C92331c.class)).k00(C94366k.this.f272744d.f272598w);
            }
        }
    }

    public C94366k(RecordMsgFileUI recordMsgFileUI) {
        this.f272744d = recordMsgFileUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f272744d.getContext(), 1, false);
        nVar.f225771i = new C94367a();
        nVar.f225782p = new C94368b();
        nVar.mo107573q();
        return true;
    }
}
