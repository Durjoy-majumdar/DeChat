package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.account.bind.p021ui.C1373b;
import com.tencent.p014mm.plugin.account.bind.p021ui.MobileFriendUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import hg0.C76166a;
import hg0.C76168b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import mg0.C76754b;
import p011cm.C39989b;
import wd3.C78543a;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.f */
public class C1379f extends C1373b {

    /* renamed from: r */
    public static final /* synthetic */ int f10571r = 0;

    /* renamed from: o */
    public String f10572o;

    /* renamed from: p */
    public C1373b.C1374a f10573p;

    /* renamed from: q */
    public C1373b.C1375b f10574q = new C1380a();

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.f$a */
    public class C1380a implements C1373b.C1375b {
        public C1380a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.f$b */
    public class C1381b {

        /* renamed from: a */
        public int f10576a;

        /* renamed from: b */
        public String f10577b;

        /* renamed from: c */
        public int f10578c;

        /* renamed from: d */
        public TextView f10579d;

        /* renamed from: e */
        public TextView f10580e;

        /* renamed from: f */
        public TextView f10581f;

        /* renamed from: g */
        public ImageView f10582g;

        /* renamed from: h */
        public View f10583h;

        /* renamed from: i */
        public TextView f10584i;

        /* renamed from: j */
        public ProgressBar f10585j;

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.f$b$a */
        public class C1382a implements View.OnClickListener {
            public C1382a(C1379f fVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/MobileFriendAdapterCaseB$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C1381b bVar = C1381b.this;
                C1373b.C1375b bVar2 = C1379f.this.f10574q;
                if (bVar2 != null) {
                    int i = bVar.f10576a;
                    String str = bVar.f10577b;
                    C1380a aVar = (C1380a) bVar2;
                    Log.m105925i("MicroMsg.MobileFriendAdapter", "[cpan] postion:%d md5:%s status:%d", Integer.valueOf(i), str, Integer.valueOf(bVar.f10578c));
                    C76166a aVar2 = (C76166a) C1379f.this.getItem(i);
                    if (aVar2 == null) {
                        Log.m105921e("MicroMsg.MobileFriendAdapter", "[cpan] mobile Friend is null. mobile:%s", str);
                    } else {
                        Log.m105919d("MicroMsg.MobileFriendAdapter", "mobile friend:%s", aVar2.toString());
                        if (aVar2.f223127o == 1) {
                            C78543a aVar3 = (C78543a) ((C39989b) C86312j.m106911c(C39989b.class)).mo62454mg(C1379f.this.f24696e, new C1376c(aVar));
                            aVar3.f230036e = new C1377d(aVar, aVar2);
                            Context context = C1379f.this.f24696e;
                            if (context instanceof MobileFriendUI) {
                                ((MobileFriendUI) context).mmSetOnActivityResultCallback(new C1378e(aVar, aVar2));
                            }
                            aVar3.f230053y = aVar2.mo106385e();
                            aVar3.f230051w = false;
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(13);
                            aVar3.mo108501b(aVar2.mo106389i(), linkedList, false, "");
                        }
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendAdapterCaseB$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C1381b(View view) {
            this.f10579d = (TextView) view.findViewById(C0966R.C0970id.efe);
            this.f10582g = (ImageView) view.findViewById(C0966R.C0970id.efd);
            this.f10580e = (TextView) view.findViewById(C0966R.C0970id.eff);
            this.f10581f = (TextView) view.findViewById(C0966R.C0970id.efi);
            this.f10583h = view.findViewById(C0966R.C0970id.efc);
            this.f10584i = (TextView) view.findViewById(C0966R.C0970id.efh);
            this.f10585j = (ProgressBar) view.findViewById(C0966R.C0970id.efg);
            this.f10583h.setOnClickListener(new C1382a(C1379f.this));
        }
    }

    public C1379f(Context context, C6975i1.C6977b bVar) {
        super(context, new C76166a());
        this.f24699h = bVar;
        this.f24696e = context;
        mo7997q(true);
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C76166a aVar = (C76166a) obj;
        if (aVar == null) {
            aVar = new C76166a();
        }
        aVar.mo106383b(cursor);
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x015c, code lost:
        if (r0 != 2) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            r11 = this;
            java.lang.Object r14 = r11.getItem(r12)
            hg0.a r14 = (hg0.C76166a) r14
            r0 = 0
            if (r13 != 0) goto L_0x001b
            android.content.Context r13 = r11.f24696e
            r1 = 2131495664(0x7f0c0af0, float:1.8614871E38)
            android.view.View r13 = android.view.View.inflate(r13, r1, r0)
            com.tencent.mm.plugin.account.bind.ui.f$b r1 = new com.tencent.mm.plugin.account.bind.ui.f$b
            r1.<init>(r13)
            r13.setTag(r1)
            goto L_0x0021
        L_0x001b:
            java.lang.Object r1 = r13.getTag()
            com.tencent.mm.plugin.account.bind.ui.f$b r1 = (com.tencent.p014mm.plugin.account.bind.p021ui.C1379f.C1381b) r1
        L_0x0021:
            r1.f10576a = r12
            java.lang.String r2 = r14.mo106385e()
            r1.f10577b = r2
            int r2 = r14.f223127o
            r1.f10578c = r2
            android.widget.TextView r2 = r1.f10580e
            java.lang.String r3 = r14.mo106388h()
            r2.setText(r3)
            android.widget.TextView r2 = r1.f10581f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r11.f24696e
            r5 = 2131830457(0x7f1126b9, float:1.9293912E38)
            java.lang.String r4 = r4.getString(r5)
            r3.append(r4)
            java.lang.String r4 = r14.mo106387g()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.f r2 = (p196ln.C76705f) r2
            android.widget.ImageView r3 = r1.f10582g
            java.lang.String r4 = r14.mo106389i()
            r2.mo106849z(r3, r4)
            int r2 = r14.f223127o
            r3 = 2131101837(0x7f06088d, float:1.7816095E38)
            r4 = 2131231392(0x7f0802a0, float:1.8078864E38)
            r5 = 2131101012(0x7f060554, float:1.7814422E38)
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x010e
            if (r2 == r8) goto L_0x007e
            if (r2 == r6) goto L_0x007e
            goto L_0x0155
        L_0x007e:
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r9 = r14.mo106389i()
            boolean r2 = r2.mo69724s3(r9)
            if (r2 != 0) goto L_0x00ec
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r9 = r14.mo106389i()
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x00a3
            goto L_0x00ec
        L_0x00a3:
            int r2 = r14.f223131s
            if (r2 != r6) goto L_0x00ca
            android.view.View r2 = r1.f10583h
            r2.setClickable(r7)
            android.view.View r2 = r1.f10583h
            r2.setBackgroundDrawable(r0)
            android.widget.TextView r0 = r1.f10584i
            r2 = 2131830456(0x7f1126b8, float:1.929391E38)
            r0.setText(r2)
            android.widget.TextView r0 = r1.f10584i
            android.content.Context r2 = r11.f24696e
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r5)
            r0.setTextColor(r2)
            goto L_0x0155
        L_0x00ca:
            android.view.View r0 = r1.f10583h
            r0.setClickable(r8)
            android.view.View r0 = r1.f10583h
            r0.setBackgroundResource(r4)
            android.widget.TextView r0 = r1.f10584i
            r2 = 2131830450(0x7f1126b2, float:1.9293898E38)
            r0.setText(r2)
            android.widget.TextView r0 = r1.f10584i
            android.content.Context r2 = r11.f24696e
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            goto L_0x0155
        L_0x00ec:
            android.view.View r2 = r1.f10583h
            r2.setClickable(r7)
            android.view.View r2 = r1.f10583h
            r2.setBackgroundDrawable(r0)
            android.widget.TextView r0 = r1.f10584i
            r2 = 2131830451(0x7f1126b3, float:1.92939E38)
            r0.setText(r2)
            android.widget.TextView r0 = r1.f10584i
            android.content.Context r2 = r11.f24696e
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r5)
            r0.setTextColor(r2)
            goto L_0x0155
        L_0x010e:
            int r2 = r14.f223131s
            if (r2 != r6) goto L_0x0134
            android.view.View r2 = r1.f10583h
            r2.setClickable(r7)
            android.view.View r2 = r1.f10583h
            r2.setBackgroundDrawable(r0)
            android.widget.TextView r0 = r1.f10584i
            r2 = 2131830453(0x7f1126b5, float:1.9293904E38)
            r0.setText(r2)
            android.widget.TextView r0 = r1.f10584i
            android.content.Context r2 = r11.f24696e
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r5)
            r0.setTextColor(r2)
            goto L_0x0155
        L_0x0134:
            android.view.View r0 = r1.f10583h
            r0.setClickable(r8)
            android.view.View r0 = r1.f10583h
            r0.setBackgroundResource(r4)
            android.widget.TextView r0 = r1.f10584i
            r2 = 2131830452(0x7f1126b4, float:1.9293902E38)
            r0.setText(r2)
            android.widget.TextView r0 = r1.f10584i
            android.content.Context r2 = r11.f24696e
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
        L_0x0155:
            int r0 = r14.f223131s
            r2 = 4
            if (r0 == 0) goto L_0x016a
            if (r0 == r8) goto L_0x015f
            if (r0 == r6) goto L_0x016a
            goto L_0x0174
        L_0x015f:
            android.widget.TextView r0 = r1.f10584i
            r0.setVisibility(r2)
            android.widget.ProgressBar r0 = r1.f10585j
            r0.setVisibility(r7)
            goto L_0x0174
        L_0x016a:
            android.widget.TextView r0 = r1.f10584i
            r0.setVisibility(r7)
            android.widget.ProgressBar r0 = r1.f10585j
            r0.setVisibility(r2)
        L_0x0174:
            int r0 = r12 + -1
            java.lang.Object r0 = r11.getItem(r0)
            hg0.a r0 = (hg0.C76166a) r0
            if (r0 != 0) goto L_0x0180
            r0 = -1
            goto L_0x0182
        L_0x0180:
            int r0 = r0.f223132t
        L_0x0182:
            r2 = 8
            java.lang.String r3 = "get display show head return null, user[%s] pos[%d]"
            java.lang.String r4 = "MicroMsg.MobileFriendAdapter"
            java.lang.String r5 = "#"
            r9 = 123(0x7b, float:1.72E-43)
            if (r12 != 0) goto L_0x01c5
            int r0 = r14.f223132t
            if (r0 != r9) goto L_0x0193
            goto L_0x0198
        L_0x0193:
            char r0 = (char) r0
            java.lang.String r5 = java.lang.String.valueOf(r0)
        L_0x0198:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 == 0) goto L_0x01b5
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r14 = r14.mo106389i()
            r0[r7] = r14
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0[r8] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r3, r0)
            android.widget.TextView r12 = r1.f10579d
            r12.setVisibility(r2)
            goto L_0x0203
        L_0x01b5:
            android.widget.TextView r12 = r1.f10579d
            r12.setVisibility(r7)
            android.widget.TextView r12 = r1.f10579d
            r12.setText(r5)
            android.widget.TextView r12 = r1.f10579d
            r12.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7)
            goto L_0x0203
        L_0x01c5:
            int r10 = r14.f223132t
            if (r10 == r0) goto L_0x01cb
            r0 = 1
            goto L_0x01cc
        L_0x01cb:
            r0 = 0
        L_0x01cc:
            if (r10 != r9) goto L_0x01cf
            goto L_0x01d4
        L_0x01cf:
            char r5 = (char) r10
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x01d4:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r9 != 0) goto L_0x01ed
            if (r0 != 0) goto L_0x01dd
            goto L_0x01ed
        L_0x01dd:
            android.widget.TextView r12 = r1.f10579d
            r12.setVisibility(r7)
            android.widget.TextView r12 = r1.f10579d
            r12.setText(r5)
            android.widget.TextView r12 = r1.f10579d
            r12.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7)
            goto L_0x0203
        L_0x01ed:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r14 = r14.mo106389i()
            r0[r7] = r14
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0[r8] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r3, r0)
            android.widget.TextView r12 = r1.f10579d
            r12.setVisibility(r2)
        L_0x0203:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.bind.p021ui.C1379f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        Cursor cursor;
        mo5580b();
        C76168b bVar = (C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50();
        String str = this.f10572o;
        bVar.getClass();
        StringBuilder sb = new StringBuilder();
        if (str != null && str.length() > 0) {
            sb.append(" and ( ");
            sb.append("addr_upload2.realname like '%" + str + "%' or ");
            sb.append("addr_upload2.realnamepyinitial like '%" + str + "%' or ");
            sb.append("addr_upload2.realnamequanpin like '%" + str + "%' or ");
            sb.append("addr_upload2.username like '%" + str + "%' or ");
            sb.append("addr_upload2.nickname like '%" + str + "%' or ");
            sb.append("addr_upload2.nicknamepyinitial like '%" + str + "%' or ");
            sb.append("addr_upload2.nicknamequanpin like '%" + str + "%' )");
        }
        sb.append(" and (");
        sb.append("addr_upload2.status=1");
        sb.append(" or ");
        sb.append("addr_upload2.status=2");
        sb.append(")");
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (str2 == null || str2.equals("")) {
            C91753f fVar = bVar.f223157c;
            cursor = fVar.rawQuery("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0" + sb.toString() + " order by " + "showhead", (String[]) null);
        } else {
            C91753f fVar2 = bVar.f223157c;
            cursor = fVar2.rawQuery("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0 and moblie <> " + str2 + sb.toString() + " order by " + "showhead", (String[]) null);
        }
        mo7998r(cursor);
        int[] iArr = new int[getCount()];
        C1373b.C1374a aVar = this.f10573p;
        if (!(aVar == null || this.f10572o == null)) {
            MobileFriendUI.C1372m mVar = (MobileFriendUI.C1372m) aVar;
            if (mo7992g().getCount() > 0) {
                MobileFriendUI.this.f10552n.setVisibility(8);
            } else {
                MobileFriendUI.this.f10552n.setVisibility(0);
            }
        }
        notifyDataSetChanged();
    }
}
