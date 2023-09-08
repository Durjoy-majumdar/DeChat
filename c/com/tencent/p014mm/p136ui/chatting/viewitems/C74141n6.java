package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import nj3.C76874e0;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n6 */
public class C74141n6 extends C74023i {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n6$a */
    public final class C74142a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f217646b;

        /* renamed from: c */
        public TextView f217647c;

        public C74142a(C74141n6 n6Var) {
        }

        /* renamed from: a */
        public C74142a mo103198a(View view) {
            if (view == null) {
                Log.m105920e("MicroMsg.ChattingItemHardDeviceMsgPush", "hy: error when inflating");
            } else {
                super.create(view);
                this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
                this.f217646b = (ImageView) view.findViewById(C0966R.C0970id.i8u);
                this.f217647c = (TextView) view.findViewById(C0966R.C0970id.kmm);
            }
            return this;
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6923sb);
        C74142a aVar = new C74142a(this);
        aVar.mo103198a(n4Var);
        n4Var.setTag(aVar);
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
        e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C68070l.C68072b bVar2;
        C74142a aVar = (C74142a) cVar;
        C68070l a0 = C72709y1.Ax0().mo135038a0(f4Var.getMsgId());
        String content = f4Var.getContent();
        if (a0 == null || content == null) {
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(a0 == null);
            objArr[1] = Util.secPrint(content);
            objArr[2] = Long.valueOf(f4Var.getMsgId());
            objArr[3] = str;
            Log.m105921e("MicroMsg.ChattingItemHardDeviceMsgPush", "amessage:%b, %s, %d, %s", objArr);
            bVar2 = null;
        } else {
            bVar2 = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
        }
        C74243t8 t8Var = new C74243t8(f4Var, bVar.mo91583x(), cVar, (String) null);
        if (bVar2 != null && (bVar2.f195492H == 3 || bVar2.f195651z0 == 3)) {
            aVar.f217646b.setImageResource(C0966R.C0969drawable.bgz);
            aVar.f217647c.setText(bVar2.f195481E0);
        }
        cVar.clickArea.setOnLongClickListener(mo103098p(bVar));
        cVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
        cVar.clickArea.setTag(t8Var);
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == -1879048176;
    }
}
