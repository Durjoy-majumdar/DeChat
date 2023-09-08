package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C31519v2;
import eb0.C75592q0;
import eb0.C97625j3;
import nj3.C76874e0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import ob0.C89137b0;
import qg2.C77335p;
import uj3.C78208e;
import uw2.C78291e;
import uw2.C78294g;
import uw2.C78296j;
import uw2.C78306m;
import zj3.C79362h1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.v7 */
public final class C74281v7 extends C74023i {

    /* renamed from: v */
    public C67391b f218170v;

    /* renamed from: w */
    public C11385n f218171w;

    /* renamed from: x */
    public C74283b f218172x;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.v7$a */
    public class C74282a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f218173d;

        /* renamed from: e */
        public final /* synthetic */ String f218174e;

        /* renamed from: f */
        public final /* synthetic */ C78208e f218175f;

        public C74282a(C72963f4 f4Var, String str, C78208e eVar) {
            this.f218173d = f4Var;
            this.f218174e = str;
            this.f218175f = eVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            boolean z;
            Log.m105918d("MicroMsg.ChattingItemVoiceRemindSys", "errType " + i + " errCode " + i2 + "  scene " + yVar.getType());
            if (C31519v2.m39437b() != null) {
                z = ((C78291e) C31519v2.m39437b()).yx0(this.f218173d.getMsgId());
            } else {
                z = false;
            }
            if (!z && i == 0 && i2 == 0 && ((C77335p) yVar).mo107462n1().equals(this.f218174e)) {
                ((C79362h1) C74281v7.this.f218170v.f193278b.mo102812a(C79362h1.class)).mo102325W().mo102007j(this.f218175f.getAdapterPosition(), this.f218173d);
            }
            C97625j3.m125815e().mo123470p(221, C74281v7.this.f218171w);
            C74281v7.this.f218171w = null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.v7$b */
    public class C74283b extends C73684f2 {
        public C74283b(C74281v7 v7Var, C67391b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(this.f216339d.mo91565f(), this.f216339d.f193286j.getContentView());
                return;
            }
            ((C79362h1) this.f216339d.f193278b.mo102812a(C79362h1.class)).mo102325W().mo102007j(t8Var.mo103252b(), t8Var.f212238a);
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6973ts);
        C73929a9 a9Var = new C73929a9();
        a9Var.mo103012a(n4Var, true);
        n4Var.setTag(a9Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        menuItem.getItemId();
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int b = ((C74243t8) view.getTag()).mo103252b();
        if (this.f218170v.mo91584y()) {
            return true;
        }
        e0Var.mo107136c(b, 100, 0, this.f218170v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        String str2;
        C67391b bVar2 = bVar;
        C72963f4 f4Var2 = f4Var;
        C73929a9 a9Var = (C73929a9) cVar;
        this.f218170v = bVar2;
        C68070l a0 = C72709y1.Ax0().mo135038a0(f4Var.getMsgId());
        String content = f4Var.getContent();
        C68070l.C68072b u = (a0 == null || content == null) ? null : C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
        if (u != null) {
            a9Var.f216992b.setText(u.f195574g);
        }
        Log.m105918d("MicroMsg.ChattingItemVoiceRemindSys", "content sys " + Util.secPrint(f4Var.getContent()));
        C78294g a = C78294g.m94582a(content);
        if (a != null && (str2 = a.f229343c) != null && str2.length() > 0 && a.f229344d > 0 && this.f218171w == null && u != null && Util.isNullOrNil(f4Var.mo108765s2())) {
            String yr02 = C78306m.yr0(C75592q0.m90789s());
            String b = C78296j.m94584b(yr02, false);
            f4Var2.mo108739S2(yr02);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var2);
            long msgId = f4Var.getMsgId();
            int i = u.f195566e;
            String str3 = u.f195562d;
            String str4 = a.f229343c;
            C72695v.m85073o(b, msgId, i, str3, str4, a.f229344d, u.f195582i, u.f195524R, u.f195626t);
            if (str4 != null) {
                C89137b0 e = C97625j3.m125815e();
                C74282a aVar = new C74282a(f4Var2, str4, a9Var);
                this.f218171w = aVar;
                e.mo123455a(221, aVar);
                C77335p pVar = new C77335p(str4, (C47355o) null);
                pVar.f225481y = true;
                C86013q1.m106440a(pVar.f225466g.field_fileFullPath, "#!AMR\n".getBytes());
                C97625j3.m125815e().mo123460f(pVar);
            }
        }
        a9Var.f216992b.setTag(new C74243t8(f4Var2, bVar.mo91583x(), a9Var, (String) null));
        TextView textView = a9Var.f216992b;
        if (this.f218172x == null) {
            this.f218172x = new C74283b(this, this.f218170v);
        }
        textView.setOnClickListener(this.f218172x);
        if (C97625j3.m125812b().mo105883I()) {
            a9Var.f216992b.setOnLongClickListener(mo103098p(bVar2));
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == -1879048191;
    }
}
