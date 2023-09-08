package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C11184p0;
import nj3.C76879j;
import nn2.C76942m;
import sn2.C36746a0;
import sn2.C36747b0;
import sn2.C48434e;
import sn2.C48447s;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI */
public class ShakeTvHistoryListUI extends MMActivity {

    /* renamed from: d */
    public C43021f f116454d;

    /* renamed from: e */
    public ListView f116455e;

    /* renamed from: f */
    public String f116456f;

    /* renamed from: g */
    public C11184p0 f116457g = new C43020e();

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$a */
    public class C43014a implements MenuItem.OnMenuItemClickListener {
        public C43014a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShakeTvHistoryListUI.this.hideVKB();
            ShakeTvHistoryListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$b */
    public class C43015b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$b$a */
        public class C43016a implements DialogInterface.OnClickListener {
            public C43016a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[2];
                objArr[0] = 2;
                C36747b0 Bx0 = C76942m.Bx0();
                Bx0.getClass();
                ArrayList arrayList = new ArrayList();
                Cursor rawQuery = Bx0.f97613d.rawQuery("SELECT * FROM shaketvhistory ORDER BY createtime DESC", (String[]) null);
                if (rawQuery != null) {
                    while (rawQuery.moveToNext()) {
                        C36746a0 a0Var = new C36746a0();
                        a0Var.convertFrom(rawQuery);
                        arrayList.add(a0Var);
                    }
                    rawQuery.close();
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(((C36746a0) it.next()).field_username);
                    sb.append("|");
                }
                objArr[1] = sb.toString();
                nVar.mo160131h(12662, objArr);
                C76942m.Bx0().f97613d.delete("shaketvhistory", (String) null, (String[]) null);
                C97625j3.m125815e().mo123460f(new C48434e(2, (String) null));
                ShakeTvHistoryListUI.this.f116454d.mo1333o();
                ShakeTvHistoryListUI.this.enableOptionMenu(false);
            }
        }

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$b$b */
        public class C43017b implements DialogInterface.OnClickListener {
            public C43017b(C43015b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C43015b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C76879j.m92717K(ShakeTvHistoryListUI.this.getContext(), true, ShakeTvHistoryListUI.this.getString(C0966R.string.j66), "", ShakeTvHistoryListUI.this.getString(C0966R.string.iat), ShakeTvHistoryListUI.this.getString(C0966R.string.f7926wf), new C43016a(), new C43017b(this));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$c */
    public class C43018c implements AdapterView.OnItemClickListener {
        public C43018c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeTvHistoryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C48447s.m53799a((C36746a0) ShakeTvHistoryListUI.this.f116454d.getItem(i), ShakeTvHistoryListUI.this.getContext(), 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeTvHistoryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$d */
    public class C43019d implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45082x0 f116462d;

        public C43019d(C45082x0 x0Var) {
            this.f116462d = x0Var;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < ShakeTvHistoryListUI.this.f116455e.getHeaderViewsCount()) {
                return true;
            }
            this.f116462d.mo70437c(view, i, j, ShakeTvHistoryListUI.this.getContext(), ShakeTvHistoryListUI.this.f116457g);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$e */
    public class C43020e implements C11184p0 {
        public C43020e() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int i2;
            if (menuItem.getItemId() == 0) {
                C115669n.INSTANCE.mo160131h(12662, 1, Util.nullAsNil(ShakeTvHistoryListUI.this.f116456f));
                C36747b0 Bx0 = C76942m.Bx0();
                String str = ShakeTvHistoryListUI.this.f116456f;
                Bx0.getClass();
                if (Util.isNullOrNil(str)) {
                    i2 = -1;
                } else {
                    i2 = Bx0.f97613d.delete(Bx0.getTableName(), "username = '" + str + "'", (String[]) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("delMsgByUserName = ");
                    sb.append(i2);
                    Log.m105918d("MicroMsg.ShakeTvHistoryStorage", sb.toString());
                }
                if (i2 < 0) {
                    Log.m105925i("MicroMsg.ShakeTvHistoryListUI", "delete tv history fail, ret[%d]", Integer.valueOf(i2));
                } else {
                    C97625j3.m125815e().mo123460f(new C48434e(1, ShakeTvHistoryListUI.this.f116456f));
                }
                ShakeTvHistoryListUI.this.f116454d.mo7991f();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$f */
    public class C43021f extends C6975i1<C36746a0> {

        /* renamed from: o */
        public LayoutInflater f116465o;

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$f$a */
        public class C43022a {

            /* renamed from: a */
            public MMImageView f116467a;

            /* renamed from: b */
            public TextView f116468b;

            /* renamed from: c */
            public TextView f116469c;

            public C43022a(C43021f fVar) {
            }
        }

        public C43021f(Context context) {
            super(context, new C36746a0());
            this.f116465o = LayoutInflater.from(context);
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C36746a0 a0Var = (C36746a0) obj;
            if (a0Var == null) {
                a0Var = new C36746a0();
            }
            a0Var.convertFrom(cursor);
            return a0Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$f$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = 0
                if (r18 != 0) goto L_0x003a
                android.view.LayoutInflater r2 = r0.f116465o
                r3 = 2131497482(0x7f0c120a, float:1.8618558E38)
                r4 = r19
                android.view.View r2 = r2.inflate(r3, r4, r1)
                com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$f$a r3 = new com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$f$a
                r3.<init>(r0)
                r4 = 2131313410(0x7f094302, float:1.8245216E38)
                android.view.View r4 = r2.findViewById(r4)
                com.tencent.mm.ui.MMImageView r4 = (com.tencent.p014mm.p136ui.MMImageView) r4
                r3.f116467a = r4
                r4 = 2131313412(0x7f094304, float:1.824522E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f116468b = r4
                r4 = 2131313411(0x7f094303, float:1.8245218E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f116469c = r4
                r2.setTag(r3)
                goto L_0x0043
            L_0x003a:
                java.lang.Object r2 = r18.getTag()
                r3 = r2
                com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI$f$a r3 = (com.tencent.p014mm.plugin.shake.p103ui.ShakeTvHistoryListUI.C43021f.C43022a) r3
                r2 = r18
            L_0x0043:
                java.lang.Object r4 = r16.getItem(r17)
                sn2.a0 r4 = (sn2.C36746a0) r4
                com.tencent.mm.ui.MMImageView r5 = r3.f116467a
                java.lang.String r6 = r4.field_iconurl
                r7 = 1
                com.tencent.p014mm.plugin.shake.p103ui.C19239e.m20384b(r5, r6, r1, r7)
                android.widget.TextView r1 = r3.f116468b
                java.lang.String r5 = r4.field_title
                r1.setText(r5)
                android.widget.TextView r1 = r3.f116469c
                com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI r3 = com.tencent.p014mm.plugin.shake.p103ui.ShakeTvHistoryListUI.this
                androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                long r4 = r4.field_createtime
                r8 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 * r8
                java.util.GregorianCalendar r6 = new java.util.GregorianCalendar
                r6.<init>()
                r10 = 3600000(0x36ee80, double:1.7786363E-317)
                int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r12 >= 0) goto L_0x0075
                java.lang.String r3 = ""
                goto L_0x00cb
            L_0x0075:
                java.util.GregorianCalendar r10 = new java.util.GregorianCalendar
                int r7 = r6.get(r7)
                r11 = 2
                int r11 = r6.get(r11)
                r12 = 5
                int r6 = r6.get(r12)
                r10.<init>(r7, r11, r6)
                long r6 = r10.getTimeInMillis()
                long r6 = r4 - r6
                r11 = 0
                r13 = 86400000(0x5265c00, double:4.2687272E-316)
                int r15 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r15 <= 0) goto L_0x00a8
                int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r15 > 0) goto L_0x00a8
                r6 = 2131830343(0x7f112647, float:1.929368E38)
                java.lang.String r3 = r3.getString(r6)
                long r4 = r4 / r8
                java.lang.String r3 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r3, r4)
                goto L_0x00cb
            L_0x00a8:
                long r6 = r10.getTimeInMillis()
                long r6 = r4 - r6
                long r6 = r6 + r13
                int r10 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r10 <= 0) goto L_0x00bf
                int r10 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r10 > 0) goto L_0x00bf
                r4 = 2131830369(0x7f112661, float:1.9293733E38)
                java.lang.String r3 = r3.getString(r4)
                goto L_0x00cb
            L_0x00bf:
                r6 = 2131830331(0x7f11263b, float:1.9293656E38)
                java.lang.String r3 = r3.getString(r6)
                long r4 = r4 / r8
                java.lang.String r3 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r3, r4)
            L_0x00cb:
                r1.setText(r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.ShakeTvHistoryListUI.C43021f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        /* renamed from: l */
        public void mo1332l() {
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            mo7998r(C76942m.Bx0().f97613d.rawQuery("SELECT * FROM shaketvhistory ORDER BY createtime DESC", (String[]) null));
            notifyDataSetChanged();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.byp;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.j67);
        setBackBtn(new C43014a());
        addTextOptionMenu(0, getString(C0966R.string.f7930wk), new C43015b());
        this.f116455e = (ListView) findViewById(C0966R.C0970id.jhi);
        C43021f fVar = new C43021f(this);
        this.f116454d = fVar;
        this.f116455e.setAdapter(fVar);
        this.f116455e.setOnItemClickListener(new C43018c());
        this.f116455e.setOnItemLongClickListener(new C43019d(new C45082x0(this)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f116456f = ((C36746a0) this.f116454d.getItem(adapterContextMenuInfo.position)).field_username;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, C0966R.string.f7944x1);
    }

    public void onDestroy() {
        this.f116454d.mo5580b();
        super.onDestroy();
    }
}
