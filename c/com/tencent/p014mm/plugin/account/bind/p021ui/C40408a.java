package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import di3.C86312j;
import gg0.C45911a0;
import gg0.C45913b0;
import hg0.C46065v;
import hg0.C46067w;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import mg0.C76754b;
import nj3.C76879j;
import p011cm.C39989b;
import wd3.C78543a;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.a */
public class C40408a extends C6975i1<C46065v> {

    /* renamed from: o */
    public Context f108607o;

    /* renamed from: p */
    public LayoutInflater f108608p;

    /* renamed from: q */
    public C40409a f108609q;

    /* renamed from: r */
    public String f108610r;

    /* renamed from: s */
    public String f108611s;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.a$a */
    public interface C40409a {
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.a$b */
    public class C40410b {

        /* renamed from: a */
        public int f108612a;

        /* renamed from: b */
        public ImageView f108613b;

        /* renamed from: c */
        public TextView f108614c;

        /* renamed from: d */
        public TextView f108615d;

        /* renamed from: e */
        public View f108616e;

        /* renamed from: f */
        public TextView f108617f;

        /* renamed from: g */
        public ProgressBar f108618g;

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.a$b$a */
        public class C40411a implements View.OnClickListener {
            public C40411a(C40408a aVar) {
            }

            public void onClick(View view) {
                C46065v vVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/GoogleFriendAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105918d("MicroMsg.GoogleContact.GoogleFriendAdapter", "onClick");
                C40410b bVar = C40410b.this;
                C40409a aVar = C40408a.this.f108609q;
                if (aVar != null) {
                    int i = bVar.f108612a;
                    GoogleFriendUI googleFriendUI = (GoogleFriendUI) aVar;
                    Class cls = C76754b.class;
                    C40408a aVar2 = googleFriendUI.f108579f;
                    if (!(aVar2 == null || (vVar = (C46065v) aVar2.getItem(i)) == null)) {
                        int i2 = vVar.field_status;
                        if (i2 == 0) {
                            C39989b.C0704a mg = ((C39989b) C86312j.m106911c(C39989b.class)).mo62454mg(googleFriendUI, new C45911a0(googleFriendUI));
                            String str = vVar.field_googleitemid;
                            C78543a aVar3 = (C78543a) mg;
                            aVar3.f230050v = true;
                            aVar3.f230053y = str;
                            aVar3.f230051w = false;
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(58);
                            aVar3.mo108501b(vVar.field_username, linkedList, true, "");
                            vVar.field_googlecgistatus = 0;
                            ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71483Yt(vVar);
                            googleFriendUI.f108579f.mo1333o();
                        } else if (i2 == 1) {
                            Cursor qq = ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71486qq(vVar.field_googleid);
                            if (qq == null || qq.getCount() <= 1) {
                                googleFriendUI.mo63151I7(vVar, (C46065v) null);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                qq.moveToFirst();
                                int count = qq.getCount();
                                for (int i3 = 0; i3 < count; i3++) {
                                    C46065v vVar2 = new C46065v();
                                    vVar2.convertFrom(qq);
                                    arrayList2.add(vVar2.field_googlegmail);
                                    arrayList3.add(Integer.valueOf(i3));
                                    arrayList4.add(vVar2);
                                    qq.moveToNext();
                                }
                                arrayList3.add(-1);
                                C76879j.m92731b(googleFriendUI.getContext(), googleFriendUI.getResources().getString(C0966R.string.fdm), arrayList2, arrayList3, (String) null, googleFriendUI.getResources().getString(C0966R.string.f7926wf), true, new C45913b0(googleFriendUI, arrayList4, vVar), (DialogInterface.OnCancelListener) null);
                            }
                            if (qq != null) {
                                qq.close();
                            }
                        }
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C40410b(View view) {
            this.f108613b = (ImageView) view.findViewById(C0966R.C0970id.eos);
            this.f108614c = (TextView) view.findViewById(C0966R.C0970id.eow);
            this.f108616e = view.findViewById(C0966R.C0970id.eox);
            this.f108617f = (TextView) view.findViewById(C0966R.C0970id.eoy);
            this.f108618g = (ProgressBar) view.findViewById(C0966R.C0970id.eov);
            this.f108615d = (TextView) view.findViewById(C0966R.C0970id.eot);
            this.f108616e.setOnClickListener(new C40411a(C40408a.this));
        }
    }

    public C40408a(Context context, String str) {
        super(context, new C46065v());
        this.f108611s = str;
        this.f108607o = context;
        this.f108608p = LayoutInflater.from(context);
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C46065v vVar = (C46065v) obj;
        if (vVar == null) {
            vVar = new C46065v();
        }
        vVar.convertFrom(cursor);
        return vVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r11 != 2) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            java.lang.Class<ln.i> r13 = p196ln.C76708i.class
            r0 = 0
            if (r12 == 0) goto L_0x0013
            java.lang.Object r1 = r12.getTag()
            if (r1 != 0) goto L_0x000c
            goto L_0x0013
        L_0x000c:
            java.lang.Object r1 = r12.getTag()
            com.tencent.mm.plugin.account.bind.ui.a$b r1 = (com.tencent.p014mm.plugin.account.bind.p021ui.C40408a.C40410b) r1
            goto L_0x0024
        L_0x0013:
            android.view.LayoutInflater r12 = r10.f108608p
            r1 = 2131495916(0x7f0c0bec, float:1.8615382E38)
            android.view.View r12 = r12.inflate(r1, r0)
            com.tencent.mm.plugin.account.bind.ui.a$b r1 = new com.tencent.mm.plugin.account.bind.ui.a$b
            r1.<init>(r12)
            r12.setTag(r1)
        L_0x0024:
            java.lang.Object r2 = r10.getItem(r11)
            hg0.v r2 = (hg0.C46065v) r2
            if (r2 != 0) goto L_0x002d
            return r12
        L_0x002d:
            r1.f108612a = r11
            java.lang.String r11 = r2.field_googlegmail
            r1.getClass()
            int r11 = r2.field_status
            r3 = 2131755464(0x7f1001c8, float:1.9141808E38)
            r4 = 2
            r5 = 1
            if (r11 == 0) goto L_0x0062
            if (r11 == r5) goto L_0x0042
            if (r11 == r4) goto L_0x0062
            goto L_0x0087
        L_0x0042:
            di3.d r11 = di3.C86312j.m106911c(r13)
            ln.i r11 = (p196ln.C76708i) r11
            java.lang.String r13 = r2.field_googleid
            android.graphics.Bitmap r11 = r11.mo106844mR(r13)
            if (r11 != 0) goto L_0x005c
            android.widget.ImageView r11 = r1.f108613b
            android.content.Context r13 = r10.f108607o
            android.graphics.drawable.Drawable r13 = kg3.C76577a.m92158i(r13, r3)
            r11.setImageDrawable(r13)
            goto L_0x0087
        L_0x005c:
            android.widget.ImageView r13 = r1.f108613b
            r13.setImageBitmap(r11)
            goto L_0x0087
        L_0x0062:
            java.lang.String r11 = r2.field_small_url
            if (r11 == 0) goto L_0x0073
            di3.d r11 = di3.C86312j.m106911c(r13)
            ln.i r11 = (p196ln.C76708i) r11
            java.lang.String r13 = r2.field_username
            android.graphics.Bitmap r11 = r11.N50(r13)
            goto L_0x0074
        L_0x0073:
            r11 = r0
        L_0x0074:
            if (r11 != 0) goto L_0x0082
            android.widget.ImageView r11 = r1.f108613b
            android.content.Context r13 = r10.f108607o
            android.graphics.drawable.Drawable r13 = kg3.C76577a.m92158i(r13, r3)
            r11.setImageDrawable(r13)
            goto L_0x0087
        L_0x0082:
            android.widget.ImageView r13 = r1.f108613b
            r13.setImageBitmap(r11)
        L_0x0087:
            java.lang.String r11 = r2.field_googlename
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x009b
            android.widget.TextView r11 = r1.f108614c
            java.lang.String r13 = r2.field_googlegmail
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.subStringEmail(r13)
            r11.setText(r13)
            goto L_0x00a2
        L_0x009b:
            android.widget.TextView r11 = r1.f108614c
            java.lang.String r13 = r2.field_googlename
            r11.setText(r13)
        L_0x00a2:
            int r11 = r2.field_status
            r13 = 2131830992(0x7f1128d0, float:1.9294997E38)
            r3 = 2131101833(0x7f060889, float:1.7816087E38)
            r6 = 2131830984(0x7f1128c8, float:1.929498E38)
            r7 = 2131101012(0x7f060554, float:1.7814422E38)
            r8 = 0
            if (r11 == 0) goto L_0x00fc
            if (r11 == r5) goto L_0x00da
            if (r11 == r4) goto L_0x00b8
            goto L_0x011d
        L_0x00b8:
            android.view.View r11 = r1.f108616e
            r11.setClickable(r8)
            android.view.View r11 = r1.f108616e
            r11.setBackgroundDrawable(r0)
            android.widget.TextView r11 = r1.f108617f
            r9 = 2131830986(0x7f1128ca, float:1.9294985E38)
            r11.setText(r9)
            android.widget.TextView r11 = r1.f108617f
            android.content.Context r9 = r10.f108607o
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getColor(r7)
            r11.setTextColor(r9)
            goto L_0x011d
        L_0x00da:
            android.view.View r11 = r1.f108616e
            r11.setClickable(r5)
            android.view.View r11 = r1.f108616e
            r9 = 2131231398(0x7f0802a6, float:1.8078876E38)
            r11.setBackgroundResource(r9)
            android.widget.TextView r11 = r1.f108617f
            r11.setText(r13)
            android.widget.TextView r11 = r1.f108617f
            android.content.Context r9 = r10.f108607o
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getColor(r7)
            r11.setTextColor(r9)
            goto L_0x011d
        L_0x00fc:
            android.view.View r11 = r1.f108616e
            r11.setClickable(r5)
            android.view.View r11 = r1.f108616e
            r9 = 2131231392(0x7f0802a0, float:1.8078864E38)
            r11.setBackgroundResource(r9)
            android.widget.TextView r11 = r1.f108617f
            r11.setText(r6)
            android.widget.TextView r11 = r1.f108617f
            android.content.Context r9 = r10.f108607o
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getColor(r3)
            r11.setTextColor(r9)
        L_0x011d:
            int r11 = r2.field_googlecgistatus
            if (r11 == 0) goto L_0x01a1
            r9 = 8
            if (r11 == r5) goto L_0x0165
            if (r11 == r4) goto L_0x0129
            goto L_0x01ac
        L_0x0129:
            android.widget.TextView r11 = r1.f108617f
            r11.setVisibility(r8)
            android.widget.ProgressBar r11 = r1.f108618g
            r11.setVisibility(r9)
            int r11 = r2.field_status
            if (r11 == 0) goto L_0x0150
            if (r11 == r5) goto L_0x013b
            goto L_0x01ac
        L_0x013b:
            android.widget.TextView r11 = r1.f108617f
            r11.setText(r13)
            android.widget.TextView r11 = r1.f108617f
            android.content.Context r13 = r10.f108607o
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r7)
            r11.setTextColor(r13)
            goto L_0x01ac
        L_0x0150:
            android.widget.TextView r11 = r1.f108617f
            r11.setText(r6)
            android.widget.TextView r11 = r1.f108617f
            android.content.Context r13 = r10.f108607o
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r3)
            r11.setTextColor(r13)
            goto L_0x01ac
        L_0x0165:
            android.view.View r11 = r1.f108616e
            r11.setClickable(r8)
            android.view.View r11 = r1.f108616e
            r11.setBackgroundDrawable(r0)
            android.widget.TextView r11 = r1.f108617f
            r11.setVisibility(r8)
            android.widget.ProgressBar r11 = r1.f108618g
            r11.setVisibility(r9)
            android.widget.TextView r11 = r1.f108617f
            android.content.Context r13 = r10.f108607o
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r7)
            r11.setTextColor(r13)
            int r11 = r2.field_status
            if (r11 == 0) goto L_0x0198
            if (r11 == r5) goto L_0x018f
            goto L_0x01ac
        L_0x018f:
            android.widget.TextView r11 = r1.f108617f
            r13 = 2131830993(0x7f1128d1, float:1.9295E38)
            r11.setText(r13)
            goto L_0x01ac
        L_0x0198:
            android.widget.TextView r11 = r1.f108617f
            r13 = 2131830985(0x7f1128c9, float:1.9294983E38)
            r11.setText(r13)
            goto L_0x01ac
        L_0x01a1:
            android.widget.TextView r11 = r1.f108617f
            r13 = 4
            r11.setVisibility(r13)
            android.widget.ProgressBar r11 = r1.f108618g
            r11.setVisibility(r8)
        L_0x01ac:
            android.widget.TextView r11 = r1.f108615d
            java.lang.String r13 = r2.field_googlegmail
            r11.setText(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.bind.p021ui.C40408a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        C46067w wVar = (C46067w) ((C76754b) C86312j.m106911c(C76754b.class)).mo105746fv();
        String str = this.f108610r;
        String str2 = this.f108611s;
        wVar.getClass();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(" WHERE ( ");
            sb.append("GoogleFriend.googlegmail!='" + str2 + "' AND ");
            sb.append("GoogleFriend.googlename LIKE '%" + str + "%' OR ");
            sb.append("GoogleFriend.googlenamepy LIKE '%" + str + "%' OR ");
            sb.append("GoogleFriend.googlegmail LIKE '%" + str + "%' OR ");
            sb.append("GoogleFriend.nickname LIKE '%" + str + "%' ) ");
        } else {
            sb.append(" WHERE ( GoogleFriend.googlegmail!='" + str2 + "' )");
        }
        sb.append(" GROUP BY googleid,contecttype");
        sb.append(" ORDER BY status , googlenamepy ASC , usernamepy ASC");
        ISQLiteDatabase iSQLiteDatabase = wVar.f124209d;
        mo7998r(iSQLiteDatabase.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + sb.toString(), (String[]) null));
        notifyDataSetChanged();
    }
}
