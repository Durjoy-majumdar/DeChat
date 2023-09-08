package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import d62.C75339i;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import g62.C75875l;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.ui.chatting.x2 */
public class C74339x2 extends C6975i1<C72963f4> {

    /* renamed from: o */
    public String f218366o;

    /* renamed from: p */
    public String f218367p;

    /* renamed from: q */
    public String f218368q;

    /* renamed from: r */
    public boolean f218369r;

    /* renamed from: s */
    public C74340a f218370s;

    /* renamed from: com.tencent.mm.ui.chatting.x2$a */
    public interface C74340a {
        /* renamed from: a */
        void mo102514a(int i);
    }

    /* renamed from: com.tencent.mm.ui.chatting.x2$b */
    public static class C74341b {

        /* renamed from: a */
        public ImageView f218371a;

        /* renamed from: b */
        public TextView f218372b;

        /* renamed from: c */
        public TextView f218373c;

        /* renamed from: d */
        public TextView f218374d;
    }

    public C74339x2(Context context, C72963f4 f4Var, String str, String str2, boolean z) {
        super(context, f4Var);
        this.f218366o = str;
        this.f218367p = str2;
        this.f218369r = z;
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C72963f4 f4Var = (C72963f4) obj;
        if (f4Var == null) {
            f4Var = new C72963f4();
        }
        f4Var.convertFrom(cursor);
        return f4Var;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C74341b bVar;
        Class cls = C76705f.class;
        Class cls2 = C75339i.class;
        Class cls3 = C76979h.class;
        if (view == null) {
            view = View.inflate(this.f24696e, C0966R.C0971layout.bv_, (ViewGroup) null);
            bVar = new C74341b();
            bVar.f218371a = (ImageView) view.findViewById(C0966R.C0970id.a27);
            bVar.f218372b = (TextView) view.findViewById(C0966R.C0970id.hg4);
            bVar.f218373c = (TextView) view.findViewById(C0966R.C0970id.l0s);
            bVar.f218374d = (TextView) view.findViewById(C0966R.C0970id.h2q);
            view.setTag(bVar);
        } else {
            bVar = (C74341b) view.getTag();
        }
        C72963f4 f4Var = (C72963f4) getItem(i);
        if (f4Var != null) {
            CharSequence charSequence = "";
            if (!this.f218369r || f4Var.mo108769t2() != 0) {
                ((C76705f) C86312j.m106911c(cls)).mo106849z(bVar.f218371a, f4Var.mo108769t2() == 1 ? this.f218367p : this.f218366o);
                bVar.f218372b.setText(((C76979h) C86312j.m106911c(cls3)).yp0(this.f24696e, ((C75339i) C86312j.m106911c(cls2)).getDisplayName(f4Var.mo108769t2() == 1 ? this.f218367p : this.f218366o), bVar.f218372b.getTextSize()));
                TextView textView = bVar.f218373c;
                if (f4Var.getCreateTime() != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                    charSequence = C72715f.m85112e(this.f24696e, f4Var.getCreateTime(), true);
                }
                textView.setText(charSequence);
                bVar.f218374d.setText(((C76979h) C86312j.m106911c(cls3)).yp0(this.f24696e, f4Var.getContent(), bVar.f218374d.getTextSize()));
            } else {
                String content = f4Var.getContent();
                String s = C75604z3.m90847s(content);
                if (!Util.isNullOrNil(s)) {
                    ((C76705f) C86312j.m106911c(cls)).mo106849z(bVar.f218371a, s);
                    bVar.f218372b.setText(((C76979h) C86312j.m106911c(cls3)).yp0(this.f24696e, ((C75339i) C86312j.m106911c(cls2)).getDisplayName(s), bVar.f218372b.getTextSize()));
                }
                TextView textView2 = bVar.f218373c;
                if (f4Var.getCreateTime() != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                    charSequence = C72715f.m85112e(this.f24696e, f4Var.getCreateTime(), true);
                }
                textView2.setText(charSequence);
                bVar.f218374d.setText(((C76979h) C86312j.m106911c(cls3)).yp0(this.f24696e, C75604z3.m90849u(content), bVar.f218374d.getTextSize()));
            }
        }
        return view;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo5580b();
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        C75875l z = C97625j3.m125812b().mo105911z();
        String str = this.f218366o;
        String str2 = this.f218368q;
        C72972g4 g4Var = (C72972g4) z;
        g4Var.getClass();
        mo7998r(g4Var.f212775p.rawQuery(("SELECT * FROM " + g4Var.hy0(str) + " WHERE" + g4Var.iy0(str) + "AND " + "content" + " LIKE '%" + str2 + "%' AND " + "type" + " = 1") + " ORDER BY createTime DESC", (String[]) null));
        if (this.f218370s != null && !Util.isNullOrNil(this.f218368q)) {
            this.f218370s.mo102514a(getCount());
        }
        notifyDataSetChanged();
    }
}
