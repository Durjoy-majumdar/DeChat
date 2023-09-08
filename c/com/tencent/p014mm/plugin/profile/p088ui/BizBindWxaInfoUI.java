package com.tencent.p014mm.plugin.profile.p088ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;

/* renamed from: com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI */
public final class BizBindWxaInfoUI extends MMActivity {

    /* renamed from: d */
    public ListView f115303d;

    /* renamed from: e */
    public String f115304e;

    /* renamed from: f */
    public String f115305f;

    /* renamed from: com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI$a */
    public class C42602a implements MenuItem.OnMenuItemClickListener {
        public C42602a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BizBindWxaInfoUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI$b */
    public class C42603b implements AdapterView.OnItemClickListener {
        public C42603b() {
        }

        /* JADX WARNING: type inference failed for: r10v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
            /*
                r9 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r10)
                r0.add(r11)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                r0.add(r11)
                java.lang.Long r11 = java.lang.Long.valueOf(r13)
                r0.add(r11)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$2"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r9
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r10 = r10.getAdapter()
                java.lang.Object r10 = r10.getItem(r12)
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo r10 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo) r10
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r12 = "onItemClick"
                java.lang.String r13 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r14 = "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$2"
                if (r10 != 0) goto L_0x0046
                j20.C117292a.m165361g(r9, r14, r13, r12, r11)
                return
            L_0x0046:
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r7 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
                r7.<init>()
                r0 = 1020(0x3fc, float:1.43E-42)
                r7.f245533f = r0
                com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI r0 = com.tencent.p014mm.plugin.profile.p088ui.BizBindWxaInfoUI.this
                java.lang.String r0 = r0.f115304e
                r7.f245534g = r0
                java.lang.Class<kr0.x0> r0 = kr0.C76630x0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                kr0.x0 r0 = (kr0.C76630x0) r0
                com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI r1 = com.tencent.p014mm.plugin.profile.p088ui.BizBindWxaInfoUI.this
                java.lang.String r2 = r10.f108666d
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                java.lang.String r8 = r1.f115305f
                r0.Rg0(r1, r2, r3, r4, r5, r6, r7, r8)
                j20.C117292a.m165361g(r9, r14, r13, r12, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.BizBindWxaInfoUI.C42603b.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI$c */
    public static class C42604c extends BaseAdapter {

        /* renamed from: d */
        public List<WxaAttributes.WxaEntryInfo> f115308d;

        /* renamed from: e */
        public LayoutInflater f115309e;

        /* renamed from: com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI$c$a */
        public static class C42605a {

            /* renamed from: a */
            public ImageView f115310a;

            /* renamed from: b */
            public TextView f115311b;

            /* renamed from: c */
            public View f115312c;
        }

        public C42604c(LayoutInflater layoutInflater, List<WxaAttributes.WxaEntryInfo> list) {
            this.f115309e = layoutInflater;
            LinkedList linkedList = new LinkedList();
            this.f115308d = linkedList;
            if (list != null) {
                linkedList.addAll(list);
            }
        }

        public int getCount() {
            return ((LinkedList) this.f115308d).size();
        }

        public Object getItem(int i) {
            return (WxaAttributes.WxaEntryInfo) ((LinkedList) this.f115308d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C42605a aVar;
            if (view == null) {
                view = this.f115309e.inflate(C0966R.C0971layout.f6422ef, viewGroup, false);
                aVar = new C42605a();
                aVar.f115310a = (ImageView) view.findViewById(C0966R.C0970id.f15);
                aVar.f115311b = (TextView) view.findViewById(C0966R.C0970id.i2m);
                aVar.f115312c = view.findViewById(C0966R.C0970id.c7p);
                view.setTag(aVar);
            } else {
                aVar = (C42605a) view.getTag();
            }
            WxaAttributes.WxaEntryInfo wxaEntryInfo = (WxaAttributes.WxaEntryInfo) ((LinkedList) this.f115308d).get(i);
            String str = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122786b(aVar.f115310a, wxaEntryInfo.f108669g, C88393a.m110230a(), C88431k.f255437d);
            aVar.f115311b.setText(Util.nullAsNil(wxaEntryInfo.f108667e));
            List<WxaAttributes.WxaEntryInfo> list = this.f115308d;
            if (list != null) {
                View view2 = aVar.f115312c;
                int i2 = ((LinkedList) list).size() + -1 == i ? 8 : 0;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i2));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return view;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6583iz;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        this.f115304e = getIntent().getStringExtra("extra_username");
        this.f115305f = getIntent().getStringExtra("extra_appid");
        setBackBtn(new C42602a());
        setMMTitle((int) C0966R.string.bju);
        setActionbarColor(getActionbarColor());
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("extra_wxa_entry_info_list");
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f6582iy, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359390ko1);
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(parcelableArrayListExtra != null ? parcelableArrayListExtra.size() : 0);
        textView.setText(getString(C0966R.string.amu, objArr));
        ListView listView = (ListView) findViewById(C0966R.C0970id.byw);
        this.f115303d = listView;
        listView.addHeaderView(inflate);
        this.f115303d.setAdapter(new C42604c(getLayoutInflater(), parcelableArrayListExtra));
        this.f115303d.setOnItemClickListener(new C42603b());
        getContentView().setBackgroundResource(C0966R.color.aaz);
    }
}
