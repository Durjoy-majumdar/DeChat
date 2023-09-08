package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75921a;
import gl3.C75922b;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import p922vj.C78420a;

/* renamed from: com.tencent.mm.plugin.remittance.ui.j0 */
public class C42872j0 extends C74526m1 implements MStorageEx.IOnStorageChange {

    /* renamed from: n */
    public Cursor f116090n;

    /* renamed from: o */
    public int f116091o;

    /* renamed from: p */
    public int f116092p;

    /* renamed from: q */
    public List<String> f116093q;

    /* renamed from: r */
    public int f116094r;

    /* renamed from: s */
    public int f116095s = 0;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.j0$a */
    public class C42873a extends C75921a {

        /* renamed from: com.tencent.mm.plugin.remittance.ui.j0$a$a */
        public class C42874a implements C75922b.C75924b {
            public C42874a() {
            }

            /* renamed from: a */
            public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
                C42875b bVar2 = (C42875b) aVar;
                bVar2.f116097a.setText("");
                bVar2.f116098b.setVisibility(8);
            }

            /* renamed from: b */
            public View mo67030b(Context context, ViewGroup viewGroup, View view) {
                View inflate = C76577a.m92147C(context) ? LayoutInflater.from(context).inflate(C0966R.C0971layout.bwf, viewGroup, false) : LayoutInflater.from(context).inflate(C0966R.C0971layout.bwe, viewGroup, false);
                C42873a aVar = C42873a.this;
                aVar.getClass();
                C42875b bVar = new C42875b(aVar);
                ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
                bVar.f116097a = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
                ((TextView) inflate.findViewById(C0966R.C0970id.c2h)).setVisibility(8);
                bVar.f116098b = (CheckBox) inflate.findViewById(C0966R.C0970id.j9g);
                inflate.setEnabled(false);
                inflate.setTag(bVar);
                return inflate;
            }

            /* renamed from: c */
            public boolean mo67031c(Context context, View view, C75922b bVar) {
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.ui.j0$a$b */
        public class C42875b implements C75922b.C75923a {

            /* renamed from: a */
            public TextView f116097a;

            /* renamed from: b */
            public CheckBox f116098b;

            public C42875b(C42873a aVar) {
            }
        }

        public C42873a(C42872j0 j0Var, int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo67027a(Context context, C75922b.C75923a aVar) {
        }

        /* renamed from: b */
        public C75922b.C75924b mo67028b() {
            return new C42874a();
        }
    }

    public C42872j0(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, List<String> list2, int i, boolean z) {
        super(mMBaseSelectContactUI, list2, z, false);
        this.f116093q = list;
        this.f116094r = i;
        Log.m105924i("MicroMsg.RecentConversationAdapter", "create!");
        mo7853r();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().add(this);
    }

    public int getCount() {
        return this.f116090n.getCount() + this.f116095s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0081  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gl3.C75922b mo7850h(int r7) {
        /*
            r6 = this;
            int r0 = r6.f116092p
            r1 = 1
            if (r7 == r0) goto L_0x00a2
            int r2 = r6.f116091o
            if (r7 != r2) goto L_0x000b
            goto L_0x00a2
        L_0x000b:
            int r2 = r6.f116095s
            r3 = 0
            java.lang.String r4 = "MicroMsg.RecentConversationAdapter"
            r5 = 2
            if (r2 != r5) goto L_0x0018
            if (r7 <= r0) goto L_0x001a
            int r0 = r7 + -2
            goto L_0x002b
        L_0x0018:
            if (r2 != r1) goto L_0x001d
        L_0x001a:
            int r0 = r7 + -1
            goto L_0x002b
        L_0x001d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r0[r3] = r2
            java.lang.String r2 = "Actually dead branch. position=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r0)
            r0 = r7
        L_0x002b:
            android.database.Cursor r2 = r6.f116090n
            boolean r2 = r2.moveToPosition(r0)
            if (r2 == 0) goto L_0x0081
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.Class<sx.j> r1 = p240sx.C77801j.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            sx.j r1 = (p240sx.C77801j) r1
            gl3.a r7 = r1.mo107747Jv(r7)
            com.tencent.mm.storage.h2 r1 = new com.tencent.mm.storage.h2
            r1.<init>()
            android.database.Cursor r2 = r6.f116090n
            r1.convertFrom(r2)
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r0)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r3 = r1.getUsername()
            com.tencent.mm.storage.z1 r2 = r2.mo69674W2(r3)
            r7.mo106181j(r2)
            com.tencent.mm.storage.z1 r2 = r7.f222600A
            if (r2 != 0) goto L_0x0106
            f40.C86709a0.m107528h()
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r1 = r1.getUsername()
            com.tencent.mm.storage.z1 r0 = r0.mo69656H3(r1)
            r7.mo106181j(r0)
            goto L_0x0106
        L_0x0081:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            android.database.Cursor r5 = r6.f116090n
            boolean r5 = r5.isClosed()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r2[r3] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.String r0 = "wrong case: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
            com.tencent.mm.plugin.remittance.ui.j0$a r0 = new com.tencent.mm.plugin.remittance.ui.j0$a
            r1 = 4
            r0.<init>(r6, r1, r7)
            goto L_0x0105
        L_0x00a2:
            gl3.r r0 = new gl3.r
            r0.<init>(r7)
            int r2 = r6.f116091o
            if (r7 != r2) goto L_0x00ee
            int r7 = r6.f116094r
            if (r7 != r1) goto L_0x00c3
            com.tencent.mm.ui.contact.g1 r7 = r6.f219055d
            android.app.Activity r7 = r7.getActivity()
            android.content.res.Resources r7 = r7.getResources()
            r1 = 2131820610(0x7f110042, float:1.927394E38)
            java.lang.String r7 = r7.getString(r1)
            r0.f222731x = r7
            goto L_0x0105
        L_0x00c3:
            r1 = 3
            if (r7 != r1) goto L_0x00da
            com.tencent.mm.ui.contact.g1 r7 = r6.f219055d
            android.app.Activity r7 = r7.getActivity()
            android.content.res.Resources r7 = r7.getResources()
            r1 = 2131831854(0x7f112c2e, float:1.9296745E38)
            java.lang.String r7 = r7.getString(r1)
            r0.f222731x = r7
            goto L_0x0105
        L_0x00da:
            com.tencent.mm.ui.contact.g1 r7 = r6.f219055d
            android.app.Activity r7 = r7.getActivity()
            android.content.res.Resources r7 = r7.getResources()
            r1 = 2131834784(0x7f1137a0, float:1.9302688E38)
            java.lang.String r7 = r7.getString(r1)
            r0.f222731x = r7
            goto L_0x0105
        L_0x00ee:
            int r1 = r6.f116092p
            if (r7 != r1) goto L_0x0105
            com.tencent.mm.ui.contact.g1 r7 = r6.f219055d
            android.app.Activity r7 = r7.getActivity()
            android.content.res.Resources r7 = r7.getResources()
            r1 = 2131839684(0x7f114ac4, float:1.9312626E38)
            java.lang.String r7 = r7.getString(r1)
            r0.f222731x = r7
        L_0x0105:
            r7 = r0
        L_0x0106:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.C42872j0.mo7850h(int):gl3.b");
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.RecentConversationAdapter", "finish!");
        Cursor cursor = this.f116090n;
        if (cursor != null) {
            cursor.close();
            this.f116090n = null;
        }
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().remove(this);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        mo7853r();
        notifyDataSetChanged();
    }

    /* renamed from: r */
    public void mo7853r() {
        int i;
        Cursor cursor;
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.RecentConversationAdapter", "resetData");
        Cursor cursor2 = this.f116090n;
        if (cursor2 != null) {
            cursor2.close();
            this.f116090n = null;
        }
        this.f116095s = 0;
        ArrayList arrayList = new ArrayList();
        this.f116091o = -1;
        this.f116092p = -1;
        List<String> list = this.f116093q;
        if (list == null || list.size() <= 0) {
            i = 0;
        } else {
            C86709a0.m107528h();
            Cursor d4 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69692d4(this.f116093q);
            arrayList.add(d4);
            i = d4.getCount();
            if (i > 0) {
                this.f116091o = this.f219055d.mo7831f6().getHeaderViewsCount();
                this.f116095s++;
            } else {
                this.f116091o = -1;
            }
        }
        List<String> list2 = this.f219096j;
        if (list2 != null) {
            list2.addAll(this.f116093q);
        } else {
            list2 = this.f116093q;
        }
        List<String> list3 = list2;
        int i2 = this.f116094r;
        if (i2 == 1 || i2 == 3) {
            C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
            cursor = ((C44660i2) Ku).mo69747R(1, list3, (String) null, this.f219095i, "");
        } else {
            C30783v3 Ku2 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C78420a.f229768m1;
            cursor = ((C44660i2) Ku2).mo69747R(3, list3, (String) null, this.f219095i, "");
        }
        if (cursor.getCount() > 0) {
            this.f116095s++;
            if (i > 0) {
                this.f116092p = this.f116091o + i + 1;
            } else {
                this.f116092p = this.f219055d.mo7831f6().getHeaderViewsCount();
            }
        } else {
            this.f116092p = -1;
        }
        arrayList.add(cursor);
        this.f116090n = new MergeCursor((Cursor[]) arrayList.toArray(new Cursor[0]));
    }
}
