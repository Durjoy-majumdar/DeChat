package com.tencent.p014mm.plugin.component.editor;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.Toast;
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
import o21.C100273b;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.component.editor.d */
public class C93069d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditorFileUI f268113d;

    /* renamed from: com.tencent.mm.plugin.component.editor.d$a */
    public class C93070a implements C11182m0 {
        public C93070a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(0, C93069d.this.f268113d.getString(C0966R.string.crb));
            String o = C86013q1.m106454o(C100273b.m131075c(C93069d.this.f268113d.f267970s));
            if (((C92331c) C86312j.m106911c(C92331c.class)).mo58357LH() && C93069d.this.f268113d.f267971t != null && AbsHandOffFile.isSupportOpenFile(o)) {
                e0Var.mo107142f(1, C93069d.this.f268113d.getString(C0966R.string.cvp));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.d$b */
    public class C93071b implements C11184p0 {
        public C93071b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C86001b0 q;
            int itemId = menuItem.getItemId();
            int i2 = 1;
            if (itemId == 0) {
                EditorFileUI editorFileUI = C93069d.this.f268113d;
                int i3 = EditorFileUI.f267956A;
                if (editorFileUI.mo127443H7() == 8) {
                    String c = C100273b.m131075c(C93069d.this.f268113d.f267970s);
                    if (!C86013q1.m106450k(c)) {
                        Log.m105920e("MicroMsg.EditorFileUI", "share file failed, file not exists");
                        EditorFileUI editorFileUI2 = C93069d.this.f268113d;
                        Toast.makeText(editorFileUI2, editorFileUI2.getString(C0966R.string.cr_), 1).show();
                        return;
                    }
                    Uri n = C116299g2.m163858n(c);
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
                    if (j > EditorFileUI.f267957z) {
                        Log.m105920e("MicroMsg.EditorFileUI", "share file failed, file too large");
                        EditorFileUI editorFileUI3 = C93069d.this.f268113d;
                        Toast.makeText(editorFileUI3, editorFileUI3.getString(C0966R.string.cra), 1).show();
                        return;
                    }
                }
                EditorFileUI editorFileUI4 = C93069d.this.f268113d;
                editorFileUI4.getClass();
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                if (editorFileUI4.mo127443H7() == 15) {
                    i2 = 11;
                    intent.putExtra("image_path", C100273b.m131077e(editorFileUI4.f267970s));
                } else if (editorFileUI4.mo127443H7() == 4) {
                    intent.putExtra("image_path", C100273b.m131077e(editorFileUI4.f267970s));
                } else {
                    intent.putExtra("desc_title", editorFileUI4.f267970s.f299297d);
                    i2 = 3;
                }
                intent.putExtra("Retr_Msg_Type", i2);
                C88144b.m109802t(editorFileUI4, ".ui.transmit.SelectConversationUI", intent, 1001);
            } else if (itemId == 1 && C93069d.this.f268113d.f267971t != null) {
                ((C92331c) C86312j.m106911c(C92331c.class)).k00(C93069d.this.f268113d.f267971t);
            }
        }
    }

    public C93069d(EditorFileUI editorFileUI) {
        this.f268113d = editorFileUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f268113d.getContext(), 1, false);
        nVar.f225771i = new C93070a();
        nVar.f225782p = new C93071b();
        nVar.mo107573q();
        return true;
    }
}
