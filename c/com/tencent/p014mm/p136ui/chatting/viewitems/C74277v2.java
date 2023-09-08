package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import ck3.C39969i;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.storage.C72963f4;
import w72.C78521a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.v2 */
public class C74277v2 extends C73919a<C74277v2> {

    /* renamed from: c */
    public Pair<Boolean, CharSequence> f218158c;

    public C74277v2(C72963f4 f4Var, Context context, C39969i iVar) {
        super(f4Var, context, iVar);
        int indexOf;
        String content = f4Var.getContent();
        if (iVar.f107144d && (indexOf = f4Var.getContent().indexOf(58)) != -1) {
            content = f4Var.getContent().substring(indexOf + 1);
        }
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null && u.f195582i == 57) {
            this.f218158c = C78521a.m94855g(context, 0.0f, f4Var, u.f195641w2);
        }
    }

    /* renamed from: a */
    public boolean mo82132a(Object obj) {
        Pair<Boolean, CharSequence> pair;
        C74277v2 v2Var = (C74277v2) obj;
        Pair<Boolean, CharSequence> pair2 = this.f218158c;
        if (pair2 == null && v2Var.f218158c == null) {
            return true;
        }
        if (pair2 == null || (pair = v2Var.f218158c) == null || pair2.first != pair.first) {
            return false;
        }
        return TextUtils.equals((CharSequence) pair2.second, (CharSequence) pair.second);
    }
}
