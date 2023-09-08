package com.tencent.p014mm.plugin.profile.p088ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI */
public class WxaBindBizInfoUI extends MMActivity {

    /* renamed from: d */
    public ListView f115387d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$a */
    public class C42621a implements MenuItem.OnMenuItemClickListener {
        public C42621a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WxaBindBizInfoUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$b */
    public class C42622b extends View.AccessibilityDelegate {
        public C42622b(WxaBindBizInfoUI wxaBindBizInfoUI) {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClickable(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$c */
    public class C42623c implements AdapterView.OnItemClickListener {
        public C42623c() {
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r0.add(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$3"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo r8 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo) r8
                java.lang.String r9 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$3"
                if (r8 != 0) goto L_0x0046
                j20.C117292a.m165361g(r7, r12, r11, r10, r9)
                return
            L_0x0046:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r8 = r8.f108666d
                java.lang.String r1 = "Contact_User"
                r0.putExtra(r1, r8)
                java.lang.String r8 = "key_start_biz_profile_from_app_brand_profile"
                r1 = 1
                r0.putExtra(r8, r1)
                java.lang.String r8 = "key_use_new_contact_profile"
                r0.putExtra(r8, r1)
                java.lang.String r8 = "force_get_contact"
                r0.putExtra(r8, r1)
                com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI r8 = com.tencent.p014mm.plugin.profile.p088ui.WxaBindBizInfoUI.this
                r1 = 0
                java.lang.String r2 = "profile"
                java.lang.String r3 = ".ui.ContactInfoUI"
                ke3.C88144b.m109791i(r8, r2, r3, r0, r1)
                j20.C117292a.m165361g(r7, r12, r11, r10, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.WxaBindBizInfoUI.C42623c.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d */
    public static class C42624d extends BaseAdapter {

        /* renamed from: d */
        public List<WxaAttributes.WxaEntryInfo> f115390d;

        /* renamed from: e */
        public LayoutInflater f115391e;

        /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d$a */
        public static class C42625a extends View.AccessibilityDelegate {

            /* renamed from: a */
            public String f115392a = null;

            public C42625a(C42621a aVar) {
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setContentDescription(this.f115392a);
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setFocusable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d$b */
        public static class C42626b {

            /* renamed from: a */
            public ImageView f115393a;

            /* renamed from: b */
            public TextView f115394b;

            /* renamed from: c */
            public TextView f115395c;

            /* renamed from: d */
            public View f115396d;

            /* renamed from: e */
            public final C42625a f115397e = new C42625a((C42621a) null);
        }

        public C42624d(LayoutInflater layoutInflater, List<WxaAttributes.WxaEntryInfo> list) {
            this.f115391e = layoutInflater;
            LinkedList linkedList = new LinkedList();
            this.f115390d = linkedList;
            if (list != null) {
                linkedList.addAll(list);
            }
        }

        public int getCount() {
            return ((LinkedList) this.f115390d).size();
        }

        public Object getItem(int i) {
            return (WxaAttributes.WxaEntryInfo) ((LinkedList) this.f115390d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d$b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = 0
                if (r19 != 0) goto L_0x004a
                android.view.LayoutInflater r3 = r0.f115391e
                r4 = 2131493124(0x7f0c0104, float:1.860972E38)
                r5 = r20
                android.view.View r3 = r3.inflate(r4, r5, r2)
                com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d$b r4 = new com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d$b
                r4.<init>()
                r5 = 2131306160(0x7f0926b0, float:1.8230511E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r4.f115393a = r5
                r5 = 2131311289(0x7f093ab9, float:1.8240914E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f115394b = r5
                r5 = 2131312993(0x7f094161, float:1.824437E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f115395c = r5
                r5 = 2131301075(0x7f0912d3, float:1.8220198E38)
                android.view.View r5 = r3.findViewById(r5)
                r4.f115396d = r5
                com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d$a r5 = r4.f115397e
                r3.setAccessibilityDelegate(r5)
                r3.setTag(r4)
                goto L_0x0053
            L_0x004a:
                java.lang.Object r3 = r19.getTag()
                r4 = r3
                com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d$b r4 = (com.tencent.p014mm.plugin.profile.p088ui.WxaBindBizInfoUI.C42624d.C42626b) r4
                r3 = r19
            L_0x0053:
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> r5 = r0.f115390d
                java.util.LinkedList r5 = (java.util.LinkedList) r5
                java.lang.Object r5 = r5.get(r1)
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo r5 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo) r5
                java.lang.String r6 = lb0.C88394b.f255384g
                lb0.b r6 = lb0.C88394b.C88418q.f255427a
                android.widget.ImageView r7 = r4.f115393a
                java.lang.String r8 = r5.f108669g
                android.graphics.drawable.Drawable r9 = lb0.C88393a.m110230a()
                lb0.k r10 = lb0.C88431k.f255437d
                r6.mo122786b(r7, r8, r9, r10)
                java.lang.String r6 = r5.f108667e
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                android.widget.TextView r7 = r4.f115394b
                r7.setText(r6)
                java.lang.String r5 = r5.f108668f
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                r8 = 8
                if (r7 == 0) goto L_0x0089
                android.widget.TextView r5 = r4.f115395c
                r5.setVisibility(r8)
                goto L_0x00a7
            L_0x0089:
                android.widget.TextView r7 = r4.f115395c
                r7.setVisibility(r2)
                android.widget.TextView r7 = r4.f115395c
                r7.setText(r5)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                java.lang.String r6 = ", "
                r7.append(r6)
                r7.append(r5)
                java.lang.String r6 = r7.toString()
            L_0x00a7:
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> r5 = r0.f115390d
                if (r5 == 0) goto L_0x00f9
                android.view.View r7 = r4.f115396d
                java.util.LinkedList r5 = (java.util.LinkedList) r5
                int r5 = r5.size()
                int r5 = r5 + -1
                if (r5 != r1) goto L_0x00b8
                goto L_0x00b9
            L_0x00b8:
                r8 = 0
            L_0x00b9:
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
                r1.mo10233c(r5)
                java.lang.Object[] r10 = r1.mo10232b()
                java.lang.String r11 = "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$AdapterImpl"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r9 = r7
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.Object r1 = r1.mo10231a(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r7.setVisibility(r1)
                java.lang.String r10 = "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$AdapterImpl"
                java.lang.String r11 = "getView"
                java.lang.String r12 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            L_0x00f9:
                com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI$d$a r1 = r4.f115397e
                r1.f115392a = r6
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.WxaBindBizInfoUI.C42624d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ciw;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        setBackBtn(new C42621a(), C0966R.raw.actionbar_icon_dark_back);
        setMMTitle((int) C0966R.string.f7817sj);
        setActionbarColor(getActionbarColor());
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("wxa_entry_info_list");
        String stringExtra = getIntent().getStringExtra("register");
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f6582iy, (ViewGroup) null);
        inflate.setAccessibilityDelegate(new C42622b(this));
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359390ko1);
        if (Util.isNullOrNil(stringExtra)) {
            stringExtra = getString(C0966R.string.f7817sj);
        }
        textView.setText(stringExtra);
        ListView listView = (ListView) findViewById(C0966R.C0970id.byw);
        this.f115387d = listView;
        listView.addHeaderView(inflate);
        this.f115387d.setAdapter(new C42624d(getLayoutInflater(), parcelableArrayListExtra));
        this.f115387d.setOnItemClickListener(new C42623c());
        getContentView().setBackgroundResource(C0966R.color.aaz);
    }
}
