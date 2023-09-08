package com.tencent.p014mm.plugin.readerapp.p092ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p214om.C11502f;
import tc0.C77885p;
import te3.C50196kz2;

/* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI */
public class ReaderAppSubscribeUI extends MMActivity {

    /* renamed from: d */
    public ListView f20357d;

    /* renamed from: e */
    public C5035d f20358e;

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI$a */
    public class C5032a implements AdapterView.OnItemClickListener {
        public C5032a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
                r0.add(r8)
                java.lang.Long r8 = java.lang.Long.valueOf(r11)
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/readerapp/ui/ReaderAppSubscribeUI$1"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI r8 = com.tencent.p014mm.plugin.readerapp.p092ui.ReaderAppSubscribeUI.this
                com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI$d r8 = r8.f20358e
                int r9 = r8.f20364f
                int[] r11 = r8.f20362d
                r10 = r11[r10]
                r12 = r9 & r10
                r0 = 0
                r1 = 1
                if (r12 == 0) goto L_0x004f
                int r10 = ~r10
                r9 = r9 & r10
                r8.f20364f = r9
                int r9 = r8.f20366h
                int r9 = r9 - r1
                r8.f20366h = r9
                if (r9 >= 0) goto L_0x004a
                r8.f20366h = r0
            L_0x004a:
                r8.notifyDataSetChanged()
            L_0x004d:
                r0 = 1
                goto L_0x0064
            L_0x004f:
                int r12 = r8.f20366h
                r2 = 3
                if (r12 >= r2) goto L_0x0064
                r9 = r9 | r10
                r8.f20364f = r9
                int r12 = r12 + r1
                r8.f20366h = r12
                int r9 = r11.length
                if (r12 <= r9) goto L_0x0060
                int r9 = r11.length
                r8.f20366h = r9
            L_0x0060:
                r8.notifyDataSetChanged()
                goto L_0x004d
            L_0x0064:
                if (r0 != 0) goto L_0x0071
                com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI r8 = com.tencent.p014mm.plugin.readerapp.p092ui.ReaderAppSubscribeUI.this
                r9 = 2131824270(0x7f110e8e, float:1.9281363E38)
                r10 = 2131821704(0x7f110488, float:1.9276159E38)
                nj3.C76879j.m92738i(r8, r9, r10)
            L_0x0071:
                java.lang.String r8 = "com/tencent/mm/plugin/readerapp/ui/ReaderAppSubscribeUI$1"
                java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.readerapp.p092ui.ReaderAppSubscribeUI.C5032a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI$b */
    public class C5033b implements MenuItem.OnMenuItemClickListener {
        public C5033b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ReaderAppSubscribeUI readerAppSubscribeUI = ReaderAppSubscribeUI.this;
            readerAppSubscribeUI.mo5993H7(readerAppSubscribeUI.f20358e.f20364f);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI$c */
    public class C5034c implements View.OnClickListener {
        public C5034c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/readerapp/ui/ReaderAppSubscribeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = ReaderAppSubscribeUI.this.f20357d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppSubscribeUI$3", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/readerapp/ui/ReaderAppSubscribeUI$3", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/readerapp/ui/ReaderAppSubscribeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI$d */
    public static class C5035d extends BaseAdapter {

        /* renamed from: d */
        public final int[] f20362d = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192};

        /* renamed from: e */
        public final Context f20363e;

        /* renamed from: f */
        public int f20364f;

        /* renamed from: g */
        public String[] f20365g = null;

        /* renamed from: h */
        public int f20366h;

        /* renamed from: com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI$d$a */
        public static class C5036a {

            /* renamed from: a */
            public TextView f20367a;

            /* renamed from: b */
            public CheckBox f20368b;
        }

        public C5035d(Context context, int i) {
            int i2 = 0;
            this.f20366h = 0;
            this.f20363e = context;
            this.f20364f = i;
            this.f20365g = context.getString(C0966R.string.hrx).split(";");
            int i3 = 0;
            while (true) {
                int[] iArr = this.f20362d;
                if (i2 < iArr.length) {
                    if ((iArr[i2] & i) != 0) {
                        i3++;
                    }
                    i2++;
                } else {
                    this.f20366h = i3;
                    return;
                }
            }
        }

        public int getCount() {
            return this.f20365g.length;
        }

        public Object getItem(int i) {
            return this.f20365g[i];
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C5036a aVar;
            if (view == null) {
                aVar = new C5036a();
                view2 = View.inflate(this.f20363e, C0966R.C0971layout.bpr, (ViewGroup) null);
                aVar.f20367a = (TextView) view2.findViewById(C0966R.C0970id.idt);
                aVar.f20368b = (CheckBox) view2.findViewById(C0966R.C0970id.ids);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C5036a) view.getTag();
            }
            aVar.f20367a.setText(this.f20365g[i]);
            aVar.f20368b.setChecked((this.f20362d[i] & this.f20364f) != 0);
            return view2;
        }
    }

    /* renamed from: H7 */
    public final void mo5993H7(int i) {
        C86709a0.m107535s().mo121142i().mo119676J(868518889, Integer.valueOf(i));
        C50196kz2 kz22 = new C50196kz2();
        kz22.f137106d = i;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(43, kz22));
        Intent intent = new Intent();
        intent.putExtra("Contact_User", "newsapp");
        intent.addFlags(67108864);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, this);
        finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bps;
    }

    public void initView() {
        this.f20358e = new C5035d(this, Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(868518889, (Object) null)));
        ListView listView = (ListView) findViewById(C0966R.C0970id.idu);
        this.f20357d = listView;
        listView.setAdapter(this.f20358e);
        this.f20357d.setOnItemClickListener(new C5032a());
        this.f20358e.notifyDataSetChanged();
        setBackBtn(new C5033b());
        setToTop(new C5034c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107535s().mo121142i().mo119676J(868518890, LocaleUtil.INDONESIAN_NEWNAME);
        setMMTitle((int) C0966R.string.bpt);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C5035d dVar = this.f20358e;
        if (dVar == null) {
            return true;
        }
        mo5993H7(dVar.f20364f);
        return true;
    }

    public void onResume() {
        super.onResume();
        this.f20358e.notifyDataSetChanged();
    }
}
