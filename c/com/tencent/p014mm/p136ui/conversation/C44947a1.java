package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.conversation.C44954b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C75700k0;
import rb0.C48009v0;
import sb0.C48327a;
import sj3.C48395b;

/* renamed from: com.tencent.mm.ui.conversation.a1 */
public class C44947a1 extends C6975i1<C44951d> {

    /* renamed from: o */
    public boolean f121933o = false;

    /* renamed from: p */
    public C44954b1 f121934p;

    /* renamed from: q */
    public final C45003s f121935q;

    /* renamed from: r */
    public final C48395b f121936r;

    /* renamed from: com.tencent.mm.ui.conversation.a1$a */
    public class C44948a extends DataSetObserver {
        public C44948a() {
        }

        public void onChanged() {
            C44954b1 b1Var = C44947a1.this.f121934p;
            if (b1Var != null) {
                b1Var.mo70253c();
            }
            C44947a1.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C44954b1 b1Var = C44947a1.this.f121934p;
            if (b1Var != null) {
                b1Var.mo70253c();
            }
            C44947a1.this.notifyDataSetInvalidated();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.a1$b */
    public class C44949b extends C44954b1.C44956b {
        public C44949b() {
        }

        /* renamed from: a */
        public C44954b1.C44959e mo70250a(Cursor cursor, int i) {
            C44954b1.C44959e eVar = new C44954b1.C44959e();
            String string = cursor.getString(mo70278c(cursor, "username"));
            long j = cursor.getLong(mo70278c(cursor, "conversationTime"));
            eVar.f121965d = j;
            if (j == 0) {
                eVar.f121965d = cursor.getLong(mo70278c(cursor, "flag")) & 72057594037927935L;
            }
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69755a0(string)) {
                eVar.f121966e = 1;
            } else {
                eVar.f121966e = 0;
            }
            return eVar;
        }

        /* renamed from: d */
        public Cursor mo70251d() {
            return C44947a1.this.f121935q.mo7992g();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.a1$c */
    public class C44950c extends C44954b1.C44956b {
        public C44950c() {
        }

        /* renamed from: a */
        public C44954b1.C44959e mo70250a(Cursor cursor, int i) {
            C44954b1.C44959e eVar = new C44954b1.C44959e();
            eVar.f121965d = cursor.getLong(mo70278c(cursor, "lastMsgTime"));
            if ((cursor.getLong(mo70278c(cursor, "flag")) & 4611686018427387904L) != 0) {
                eVar.f121966e = 1;
            } else {
                eVar.f121966e = 0;
            }
            return eVar;
        }

        /* renamed from: d */
        public Cursor mo70251d() {
            return C44947a1.this.f121936r.mo7992g();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.a1$d */
    public static class C44951d {

        /* renamed from: a */
        public int f121940a = 1;

        /* renamed from: b */
        public int f121941b = 0;

        /* renamed from: c */
        public C72976h2 f121942c;

        /* renamed from: d */
        public C48327a f121943d;
    }

    public C44947a1(Context context, String str, C6975i1.C6977b bVar) {
        super(context, new C44951d());
        C44948a aVar = new C44948a();
        mo7997q(false);
        C45003s sVar = new C45003s(context, str, bVar);
        this.f121935q = sVar;
        sVar.registerDataSetObserver(aVar);
        String TE = C48009v0.Fx0().mo72758TE(str);
        C48395b bVar2 = new C48395b(context, bVar, !Util.isNullOrNil(TE) ? TE : str);
        this.f121936r = bVar2;
        bVar2.registerDataSetObserver(aVar);
        C48009v0.Dx0().add(bVar2);
        C48009v0.Dx0().f129406e.add(bVar2, bVar2.f129544o.getMainLooper());
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C44951d dVar = (C44951d) obj;
        if (dVar == null) {
            dVar = new C44951d();
        }
        dVar.f121941b = this.f121934p.mo70255d().getPosition();
        try {
            dVar.f121942c = null;
            C48395b bVar = this.f121936r;
            C48327a aVar = dVar.f121943d;
            if (aVar == null) {
                bVar.getClass();
                aVar = new C48327a();
                bVar.f129543C = aVar.field_bizChatId;
            }
            aVar.field_bizChatId = bVar.f129543C;
            aVar.convertFrom(cursor);
            dVar.f121943d = aVar;
            if (aVar.field_bizChatId > 0) {
                dVar.f121940a = 0;
                return dVar;
            }
            dVar.f121943d = null;
            try {
                C45003s sVar = this.f121935q;
                C72976h2 h2Var = dVar.f121942c;
                sVar.getClass();
                if (h2Var == null) {
                    h2Var = new C72976h2();
                }
                h2Var.mo108794O2("");
                h2Var.mo108795P2("");
                h2Var.convertFrom(cursor);
                dVar.f121942c = h2Var;
                dVar.f121940a = 1;
            } catch (Throwable unused) {
                dVar.f121942c = null;
            }
            return dVar;
        } catch (Throwable unused2) {
            dVar.f121943d = null;
        }
    }

    public int getCount() {
        C44954b1 b1Var = this.f121934p;
        return b1Var != null ? b1Var.getCount() : super.getCount();
    }

    public int getItemViewType(int i) {
        C44951d s = getItem(i);
        if (s == null) {
            return 0;
        }
        return s.f121940a;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C44951d s = getItem(i);
        int i2 = s.f121940a;
        int i3 = 1;
        while (true) {
            if (i2 == 1) {
                try {
                    return this.f121935q.getView(s.f121941b, view, viewGroup);
                } catch (ClassCastException unused) {
                    if (view == null) {
                        break;
                    }
                    view = null;
                }
            } else {
                if (i2 == 0) {
                    return this.f121936r.getView(s.f121941b, view, viewGroup);
                }
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                i3 = i4;
            }
        }
        return null;
    }

    public int getViewTypeCount() {
        return 2;
    }

    /* renamed from: l */
    public void mo1332l() {
        if (this.f121933o) {
            C44954b1 b1Var = new C44954b1(C44954b1.C44960f.ASC, new C44963c1());
            this.f121934p = b1Var;
            mo7998r(b1Var);
            return;
        }
        this.f121933o = true;
        mo1333o();
        this.f121933o = false;
    }

    /* renamed from: o */
    public void mo1333o() {
        this.f121935q.mo1333o();
        this.f121936r.mo1333o();
        C44954b1 b1Var = new C44954b1(C44954b1.C44960f.DESC, new C44949b(), new C44950c());
        this.f121934p = b1Var;
        mo7998r(b1Var);
    }

    /* renamed from: s */
    public C44951d getItem(int i) {
        C44951d dVar = (C44951d) super.getItem(i);
        if (dVar != null) {
            return dVar;
        }
        try {
            int count = this.f121935q.getCount();
            int count2 = this.f121936r.getCount();
            C44954b1 b1Var = this.f121934p;
            Log.m105929w("MergeBizChatConversationAdapter", "getItem NULL, position=%d, size=%d, cursor.size=[%d, %d], window=[%d, %d)", Integer.valueOf(i), Integer.valueOf(getCount()), Integer.valueOf(count), Integer.valueOf(count2), Integer.valueOf(this.f121934p.f121952j), Integer.valueOf(b1Var.f121952j + b1Var.f121953n.size()));
            if (count > 0 && i < count) {
                C44951d dVar2 = new C44951d();
                try {
                    dVar2.f121940a = 1;
                    int max = Math.max(0, i);
                    dVar2.f121941b = max;
                    dVar2.f121942c = (C72976h2) this.f121935q.getItem(max);
                    dVar = dVar2;
                } catch (Throwable unused) {
                    return dVar2;
                }
            }
            int i2 = i - count;
            if (dVar != null || count2 <= 0 || i2 >= count2) {
                return dVar;
            }
            C44951d dVar3 = new C44951d();
            try {
                dVar3.f121940a = 0;
                int max2 = Math.max(0, i2);
                dVar3.f121941b = max2;
                dVar3.f121943d = (C48327a) this.f121936r.getItem(max2);
            } catch (Throwable unused2) {
            }
            return dVar3;
        } catch (Throwable unused3) {
            return dVar;
        }
    }
}
