package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import s12.C63692g;
import s12.C63693h;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI */
public class IPCallMsgUI extends MMActivity {

    /* renamed from: d */
    public ListView f271892d;

    /* renamed from: e */
    public C94152f f271893e;

    /* renamed from: f */
    public View f271894f;

    /* renamed from: g */
    public View f271895g;

    /* renamed from: h */
    public MStorage.IOnStorageChange f271896h = new C94150e();

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$b */
    public class C56827b implements AdapterView.OnItemClickListener {
        public C56827b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C63692g gVar = (C63692g) IPCallMsgUI.this.f271893e.getItem(i);
            if (!Util.isNullOrNil(gVar.field_descUrl)) {
                int i2 = gVar.field_msgType;
                C115669n.INSTANCE.mo160131h(13780, Integer.valueOf(i2));
                Intent intent = new Intent();
                intent.putExtra("rawUrl", gVar.field_descUrl);
                intent.putExtra("showShare", false);
                C88144b.m109791i(IPCallMsgUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$d */
    public class C56828d implements MenuItem.OnMenuItemClickListener {
        public C56828d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallMsgUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$a */
    public class C94148a implements C6975i1.C6977b {
        public C94148a() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            if (IPCallMsgUI.this.f271893e.getCount() == 0) {
                IPCallMsgUI.this.f271892d.setVisibility(8);
                View view = IPCallMsgUI.this.f271895g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            IPCallMsgUI.this.f271892d.setVisibility(0);
            View view3 = IPCallMsgUI.this.f271895g;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$c */
    public class C94149c implements AbsListView.OnScrollListener {
        public C94149c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                C94152f fVar = IPCallMsgUI.this.f271893e;
                int i2 = fVar.f271901o;
                int i3 = fVar.f271902p;
                if (!(i2 >= i3)) {
                    int i4 = i2 + 10;
                    fVar.f271901o = i4;
                    if (i4 > i3) {
                        fVar.f271901o = i3;
                        int i5 = i3 % 10;
                    }
                } else if (IPCallMsgUI.this.f271894f.getParent() != null) {
                    IPCallMsgUI iPCallMsgUI = IPCallMsgUI.this;
                    iPCallMsgUI.f271892d.removeFooterView(iPCallMsgUI.f271894f);
                }
                IPCallMsgUI.this.f271893e.onNotifyChange((String) null, (MStorageEventData) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$e */
    public class C94150e implements MStorage.IOnStorageChange {

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$e$a */
        public class C94151a implements Runnable {
            public C94151a() {
            }

            public void run() {
                synchronized (IPCallMsgUI.this.f271893e) {
                    Log.m105926v("MicroMsg.IPCallMsgUI", "comment notify");
                    IPCallMsgUI.this.f271893e.onNotifyChange((String) null, (MStorageEventData) null);
                }
            }
        }

        public C94150e() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            new MMHandler(Looper.getMainLooper()).post(new C94151a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$f */
    public class C94152f extends C6975i1<C63692g> {

        /* renamed from: o */
        public int f271901o = 10;

        /* renamed from: p */
        public int f271902p = 10;

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$f$a */
        public class C94153a {

            /* renamed from: a */
            public TextView f271904a;

            /* renamed from: b */
            public TextView f271905b;

            /* renamed from: c */
            public TextView f271906c;

            public C94153a(C94152f fVar) {
            }
        }

        public C94152f(Context context, C63692g gVar) {
            super(context, gVar);
            new HashSet();
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C63692g gVar = (C63692g) obj;
            if (gVar == null) {
                gVar = new C63692g();
                Log.m105918d("MicroMsg.IPCallMsgUI", "new IPCallMsg");
            }
            gVar.convertFrom(cursor);
            return gVar;
        }

        public long getItemId(int i) {
            return ((C63692g) getItem(i)).systemRowid;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r21, android.view.View r22, android.view.ViewGroup r23) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = r20.getItem(r21)
                s12.g r1 = (s12.C63692g) r1
                if (r22 == 0) goto L_0x001d
                java.lang.Object r2 = r22.getTag()
                boolean r2 = r2 instanceof com.tencent.p014mm.plugin.ipcall.p065ui.IPCallMsgUI.C94152f.C94153a
                if (r2 != 0) goto L_0x0013
                goto L_0x001d
            L_0x0013:
                java.lang.Object r2 = r22.getTag()
                com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$f$a r2 = (com.tencent.p014mm.plugin.ipcall.p065ui.IPCallMsgUI.C94152f.C94153a) r2
                r3 = r2
                r2 = r22
                goto L_0x0054
            L_0x001d:
                android.content.Context r2 = r0.f24696e
                android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r2)
                r3 = 2131496050(0x7f0c0c72, float:1.8615654E38)
                r4 = 0
                android.view.View r2 = r2.inflate(r3, r4)
                com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$f$a r3 = new com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI$f$a
                r3.<init>(r0)
                r4 = 2131315364(0x7f094aa4, float:1.824918E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f271904a = r4
                r4 = 2131300375(0x7f091017, float:1.8218778E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f271905b = r4
                r4 = 2131315220(0x7f094a14, float:1.8248887E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f271906c = r4
                r2.setTag(r3)
            L_0x0054:
                android.widget.TextView r4 = r3.f271904a
                java.lang.String r5 = r1.field_title
                r4.setText(r5)
                android.widget.TextView r4 = r3.f271905b
                java.lang.String r5 = r1.field_content
                r4.setText(r5)
                android.widget.TextView r4 = r3.f271906c
                com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI r5 = com.tencent.p014mm.plugin.ipcall.p065ui.IPCallMsgUI.this
                androidx.appcompat.app.AppCompatActivity r5 = r5.getContext()
                long r6 = r1.field_pushTime
                r8 = 1000(0x3e8, double:4.94E-321)
                long r6 = r6 * r8
                java.util.GregorianCalendar r8 = new java.util.GregorianCalendar
                r8.<init>()
                java.util.GregorianCalendar r9 = new java.util.GregorianCalendar
                r10 = 1
                int r11 = r8.get(r10)
                r12 = 2
                int r12 = r8.get(r12)
                r13 = 5
                int r8 = r8.get(r13)
                r9.<init>(r11, r12, r8)
                r8 = 2131830311(0x7f112627, float:1.9293616E38)
                java.lang.String r8 = r5.getString(r8)
                java.lang.CharSequence r8 = android.text.format.DateFormat.format(r8, r6)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r11 = "-"
                int r12 = r8.indexOf(r11)
                java.lang.String r13 = ""
                java.lang.String r14 = " "
                r15 = 0
                if (r12 <= 0) goto L_0x011a
                java.lang.String[] r9 = r8.split(r11)
                r9 = r9[r15]
                java.lang.String[] r8 = r8.split(r11)
                r8 = r8[r10]
                android.content.res.Resources r11 = r5.getResources()
                r12 = 2130903105(0x7f030041, float:1.7413019E38)
                java.lang.String[] r11 = r11.getStringArray(r12)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                r12.add(r13)
                r10 = 0
            L_0x00c3:
                int r15 = r11.length
                if (r10 >= r15) goto L_0x00ce
                r15 = r11[r10]
                r12.add(r15)
                int r10 = r10 + 1
                goto L_0x00c3
            L_0x00ce:
                r10 = 0
                int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r10)     // Catch:{ Exception -> 0x00d4 }
                goto L_0x00d6
            L_0x00d4:
                r9 = 0
            L_0x00d6:
                int r11 = r12.size()
                if (r9 < r11) goto L_0x00dd
                goto L_0x00e4
            L_0x00dd:
                java.lang.Object r9 = r12.get(r9)
                r13 = r9
                java.lang.String r13 = (java.lang.String) r13
            L_0x00e4:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                r9.append(r14)
                r9.append(r13)
                r9.append(r14)
                java.lang.String r8 = r9.toString()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                r9.append(r14)
                r8 = 2131830343(0x7f112647, float:1.929368E38)
                java.lang.String r5 = r5.getString(r8)
                java.lang.CharSequence r5 = android.text.format.DateFormat.format(r5, r6)
                java.lang.String r5 = (java.lang.String) r5
                r9.append(r5)
                java.lang.String r5 = r9.toString()
                goto L_0x01a1
            L_0x011a:
                r10 = 0
                long r11 = r9.getTimeInMillis()
                long r11 = r6 - r11
                r15 = 0
                r17 = 86400000(0x5265c00, double:4.2687272E-316)
                int r19 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
                if (r19 <= 0) goto L_0x014b
                int r19 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
                if (r19 > 0) goto L_0x014b
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r13)
                r9 = 2131830343(0x7f112647, float:1.929368E38)
                java.lang.String r5 = r5.getString(r9)
                java.lang.CharSequence r5 = android.text.format.DateFormat.format(r5, r6)
                java.lang.String r5 = (java.lang.String) r5
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                goto L_0x01a1
            L_0x014b:
                long r11 = r9.getTimeInMillis()
                long r11 = r6 - r11
                long r11 = r11 + r17
                int r9 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
                if (r9 <= 0) goto L_0x0182
                int r9 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
                if (r9 > 0) goto L_0x0182
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r9 = 2131830369(0x7f112661, float:1.9293733E38)
                java.lang.String r9 = r5.getString(r9)
                r8.append(r9)
                r8.append(r14)
                r9 = 2131830343(0x7f112647, float:1.929368E38)
                java.lang.String r5 = r5.getString(r9)
                java.lang.CharSequence r5 = android.text.format.DateFormat.format(r5, r6)
                java.lang.String r5 = (java.lang.String) r5
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                goto L_0x01a1
            L_0x0182:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                r9.append(r14)
                r8 = 2131830343(0x7f112647, float:1.929368E38)
                java.lang.String r5 = r5.getString(r8)
                java.lang.CharSequence r5 = android.text.format.DateFormat.format(r5, r6)
                java.lang.String r5 = (java.lang.String) r5
                r9.append(r5)
                java.lang.String r5 = r9.toString()
            L_0x01a1:
                r4.setText(r5)
                short r1 = r1.field_isRead
                r4 = 1
                if (r1 != r4) goto L_0x01aa
                r10 = 1
            L_0x01aa:
                if (r10 == 0) goto L_0x01bf
                android.widget.TextView r1 = r3.f271904a
                com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI r3 = com.tencent.p014mm.plugin.ipcall.p065ui.IPCallMsgUI.this
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131100982(0x7f060536, float:1.781436E38)
                int r3 = r3.getColor(r4)
                r1.setTextColor(r3)
                goto L_0x01d1
            L_0x01bf:
                android.widget.TextView r1 = r3.f271904a
                com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI r3 = com.tencent.p014mm.plugin.ipcall.p065ui.IPCallMsgUI.this
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131100983(0x7f060537, float:1.7814363E38)
                int r3 = r3.getColor(r4)
                r1.setTextColor(r3)
            L_0x01d1:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.IPCallMsgUI.C94152f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        /* renamed from: l */
        public void mo1332l() {
            mo5580b();
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            this.f271902p = C105385g.Ax0().getCount();
            C63693h Ax0 = C105385g.Ax0();
            int i = this.f271901o;
            ISQLiteDatabase iSQLiteDatabase = Ax0.f180554d;
            String[] strArr = C63693h.f180553f;
            mo7998r(iSQLiteDatabase.query("IPCallMsg", strArr, (String) null, (String[]) null, (String) null, (String) null, "pushTime desc limit " + i));
            notifyDataSetChanged();
        }

        public synchronized void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            mo7991f();
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2j;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.fwa);
        this.f271895g = findViewById(C0966R.C0970id.f_u);
        this.f271892d = (ListView) findViewById(C0966R.C0970id.f_v);
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.bcf, (ViewGroup) null);
        this.f271894f = inflate;
        this.f271892d.addFooterView(inflate);
        this.f271893e = new C94152f(this, new C63692g());
        C94152f fVar = this.f271893e;
        fVar.f24699h = new C94148a();
        this.f271892d.setAdapter(fVar);
        this.f271892d.setOnItemClickListener(new C56827b());
        this.f271892d.setOnScrollListener(new C94149c());
        boolean z = true;
        if (this.f271893e.getCount() == 0) {
            this.f271892d.setVisibility(8);
            View view = this.f271895g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(false);
        } else {
            this.f271892d.setVisibility(0);
            View view3 = this.f271895g;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(true);
        }
        C94152f fVar2 = this.f271893e;
        if (fVar2.f271901o >= fVar2.f271902p) {
            this.f271892d.removeFooterView(this.f271894f);
        }
        setBackBtn(new C56828d());
        C94152f fVar3 = this.f271893e;
        if (fVar3.f271901o < fVar3.f271902p) {
            z = false;
        }
        if (z) {
            this.f271892d.removeFooterView(this.f271894f);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C105385g.Ax0().add(this.f271896h);
        initView();
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.IPCallMsgUI", "msgui onDestroy");
        C105385g.Ax0().remove(this.f271896h);
        this.f271893e.mo5580b();
        C63693h Ax0 = C105385g.Ax0();
        Ax0.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("isRead", 1);
        Ax0.f180554d.update(Ax0.getTableName(), contentValues, "isRead!=? ", new String[]{"1"});
        super.onDestroy();
    }
}
