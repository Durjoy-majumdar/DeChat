package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import d62.C75339i;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import eb0.C97625j3;
import p629ny.C76979h;
import uj3.C78208e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l2 */
public class C74097l2 extends C74023i.C74026c {

    /* renamed from: b */
    public MMNeat7extView f217480b;

    /* renamed from: a */
    public C74097l2 mo103163a(View view) {
        super.create(view);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) view.findViewById(C0966R.C0970id.b4b);
        this.f217480b = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(this.f217480b.getContext())));
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
        return this;
    }

    /* renamed from: b */
    public void mo103164b(C74097l2 l2Var, C78208e eVar, C67391b bVar, C72963f4 f4Var, String str, C74023i iVar, boolean z) {
        int indexOf;
        String content = f4Var.getContent();
        if (bVar.mo91583x() && (indexOf = f4Var.getContent().indexOf(58)) != -1) {
            content = f4Var.getContent().substring(indexOf + 1);
        }
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null && u.f195582i == 47) {
            String str2 = u.f195598m;
            Bundle bundle = new Bundle();
            if (!Util.isNullOrNil(u.f195591k0)) {
                if (str2.contains("{recver}")) {
                    str2 = str2.replace("{recver}", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(u.f195591k0));
                }
                bundle.putString("receiver_name", u.f195591k0);
            }
            bundle.putString("rawUrl", u.f195586j);
            bundle.putString("sender_name", f4Var.mo108768t());
            l2Var.f217480b.mo104280c(((C76979h) C86312j.m106911c(C76979h.class)).hv0(MMApplicationContext.getContext(), str2, (int) l2Var.f217480b.getTextSize(), 4, bundle, true), TextView.BufferType.SPANNABLE, (Boolean) null);
            l2Var.f217480b.setTag(new C74243t8(f4Var, bVar.mo91583x(), l2Var, f4Var.mo108768t()));
            if (C97625j3.m125812b().mo105883I()) {
                l2Var.f217480b.setOnLongClickListener(iVar.mo103098p(bVar));
            }
        }
    }

    public View getMainContainerView() {
        return this.f217480b;
    }
}
