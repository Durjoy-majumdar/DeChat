package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C97625j3;
import ke3.C88144b;
import nj3.C76874e0;
import p196ln.C76705f;
import p629ny.C76979h;
import tv2.C14096e;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m6 */
public class C74121m6 extends C74023i {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m6$a */
    public final class C74122a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f217551b;

        /* renamed from: c */
        public NoMeasuredTextView f217552c;

        public C74122a(C74121m6 m6Var) {
        }

        /* renamed from: a */
        public C74122a mo103181a(View view) {
            if (view == null) {
                Log.m105920e("MicrMsg.ChattingItemHardDeviceMsgLike", "hy: error when inflating");
            } else {
                super.create(view);
                this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
                this.f217551b = (ImageView) view.findViewById(C0966R.C0970id.fnk);
                this.f217552c = (NoMeasuredTextView) view.findViewById(C0966R.C0970id.kmm);
            }
            return this;
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6921s_);
        C74122a aVar = new C74122a(this);
        aVar.mo103181a(n4Var);
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
        Log.m105924i("MicrMsg.ChattingItemHardDeviceMsgLike", "hy: user clicked on the like item");
        if (f4Var == null) {
            Log.m105924i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, msg is null.");
            return false;
        }
        String content = f4Var.getContent();
        C68070l.C68072b u = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
        if (u == null) {
            Log.m105924i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, content is null.");
            return false;
        }
        Log.m105919d("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, url is (%s).", u.f195586j);
        if (!Util.isNullOrNil(u.f195586j)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", u.f195586j);
            C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }
        if ((C97625j3.m125812b().mo105907v().get(u.f195477D0).getType() & 524288) != 0) {
            Log.m105924i("MicrMsg.ChattingItemHardDeviceMsgLike", "we run black user");
        } else {
            int i = u.f195492H;
            if (i == 2) {
                if (!Util.isNullOrNil(u.f195599m0)) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_rank_info", content);
                    intent2.putExtra("key_rank_semi", f4Var.mo108775z2());
                    intent2.putExtra("key_rank_title", u.f195643x0);
                    intent2.putExtra("key_champion_info", u.f195647y0);
                    intent2.putExtra("key_champion_coverimg", u.f195647y0);
                    intent2.putExtra("rank_id", u.f195599m0);
                    intent2.putExtra("app_username", u.f195484F);
                    intent2.putExtra("device_type", u.f195465A0);
                    intent2.putExtra("key_champioin_username", u.f195639w0);
                    intent2.putExtra("locate_to_username", u.f195477D0);
                    C88144b.m109791i(bVar.mo91565f(), "exdevice", ".ui.ExdeviceRankInfoUI", intent2, (Bundle) null);
                } else {
                    Intent intent3 = new Intent();
                    intent3.putExtra("key_is_latest", true);
                    intent3.putExtra("app_username", u.f195484F);
                    intent3.putExtra("device_type", u.f195465A0);
                    intent3.putExtra("locate_to_username", u.f195477D0);
                    C88144b.m109791i(bVar.mo91565f(), "exdevice", ".ui.ExdeviceRankInfoUI", intent3, (Bundle) null);
                }
                C14096e.m13447a(30);
            } else if (i == 4) {
                Intent intent4 = new Intent();
                intent4.putExtra("username", u.f195477D0);
                intent4.putExtra("app_username", "gh_43f2581f6fd6");
                C88144b.m109791i(bVar.mo91565f(), "exdevice", ".ui.ExdeviceProfileUI", intent4, (Bundle) null);
                C14096e.m13447a(29);
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C68070l.C68072b bVar2;
        int i;
        C74122a aVar = (C74122a) cVar;
        C68070l a0 = C72709y1.Ax0().mo135038a0(f4Var.getMsgId());
        String content = f4Var.getContent();
        if (a0 == null || content == null) {
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(a0 == null);
            objArr[1] = Util.secPrint(content);
            objArr[2] = Long.valueOf(f4Var.getMsgId());
            objArr[3] = str;
            Log.m105921e("MicrMsg.ChattingItemHardDeviceMsgLike", "amessage:%b, %s, %d, %s", objArr);
            bVar2 = null;
        } else {
            bVar2 = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
        }
        C74243t8 t8Var = new C74243t8(f4Var, bVar.mo91583x(), cVar, (String) null);
        if (bVar2 != null && (bVar2.f195492H == 2 || (i = bVar2.f195651z0) == 2 || i == 4)) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106831cr(aVar.f217551b, bVar2.f195477D0);
            aVar.f217552c.mo153549i(0, bVar.mo91572m().getDimension(C0966R.dimen.f3927j7));
            aVar.f217552c.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.a7f));
            aVar.f217552c.setEllipsize(TextUtils.TruncateAt.END);
            aVar.f217552c.setSingleLine(true);
            aVar.f217552c.setShouldEllipsize(true);
            aVar.f217552c.setText((CharSequence) ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), bVar2.f195473C0));
        }
        cVar.clickArea.setOnLongClickListener(mo103098p(bVar));
        cVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
        cVar.clickArea.setTag(t8Var);
        cVar.clickArea.setOnClickListener(mo103099u(bVar));
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == -1879048183;
    }
}
