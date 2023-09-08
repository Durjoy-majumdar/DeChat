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
import com.tencent.p014mm.plugin.profile.model.WxaRegisterInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;

/* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI */
public final class WxaBindWxaInfoUI extends MMActivity {

    /* renamed from: d */
    public ListView f248709d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$a */
    public class C85353a implements MenuItem.OnMenuItemClickListener {
        public C85353a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WxaBindWxaInfoUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$b */
    public class C85354b extends View.AccessibilityDelegate {
        public C85354b(WxaBindWxaInfoUI wxaBindWxaInfoUI) {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClickable(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$c */
    public class C85355c implements AdapterView.OnItemClickListener {
        public C85355c() {
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
                java.lang.String r1 = "com/tencent/mm/plugin/profile/ui/WxaBindWxaInfoUI$3"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r9
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r10 = r10.getAdapter()
                java.lang.Object r10 = r10.getItem(r12)
                com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$d r10 = (com.tencent.p014mm.plugin.profile.p088ui.WxaBindWxaInfoUI.C85356d) r10
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r12 = "onItemClick"
                java.lang.String r13 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r14 = "com/tencent/mm/plugin/profile/ui/WxaBindWxaInfoUI$3"
                if (r10 == 0) goto L_0x0071
                r0 = 1
                int r1 = r10.f248712a
                if (r0 == r1) goto L_0x0048
                goto L_0x0071
            L_0x0048:
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo r10 = r10.f248714c
                java.lang.Class<kr0.x0> r0 = kr0.C76630x0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                r1 = r0
                kr0.x0 r1 = (kr0.C76630x0) r1
                if (r1 == 0) goto L_0x006d
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r8 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
                r8.<init>()
                r0 = 1135(0x46f, float:1.59E-42)
                r8.f245533f = r0
                com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI r0 = com.tencent.p014mm.plugin.profile.p088ui.WxaBindWxaInfoUI.this
                androidx.appcompat.app.AppCompatActivity r2 = r0.getContext()
                java.lang.String r3 = r10.f108666d
                r4 = 0
                r5 = 0
                r6 = -1
                r7 = 0
                r1.Ko0(r2, r3, r4, r5, r6, r7, r8)
            L_0x006d:
                j20.C117292a.m165361g(r9, r14, r13, r12, r11)
                return
            L_0x0071:
                j20.C117292a.m165361g(r9, r14, r13, r12, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.WxaBindWxaInfoUI.C85355c.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$d */
    public static class C85356d {

        /* renamed from: a */
        public final int f248712a;

        /* renamed from: b */
        public final String f248713b;

        /* renamed from: c */
        public final WxaAttributes.WxaEntryInfo f248714c;

        /* renamed from: d */
        public final boolean f248715d;

        public C85356d(int i, String str, WxaAttributes.WxaEntryInfo wxaEntryInfo, boolean z) {
            this.f248712a = i;
            this.f248713b = str;
            this.f248714c = wxaEntryInfo;
            this.f248715d = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$e */
    public static class C85357e extends BaseAdapter {

        /* renamed from: d */
        public LayoutInflater f248716d;

        /* renamed from: e */
        public List<C85356d> f248717e;

        /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$e$a */
        public static class C85358a extends View.AccessibilityDelegate {
            public C85358a(C85353a aVar) {
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClickable(false);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$e$b */
        public static class C85359b {

            /* renamed from: a */
            public TextView f248718a;

            /* renamed from: b */
            public final C85358a f248719b = new C85358a((C85353a) null);
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$e$c */
        public static class C85360c extends View.AccessibilityDelegate {

            /* renamed from: a */
            public String f248720a = null;

            public C85360c(C85353a aVar) {
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setContentDescription(this.f248720a);
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setFocusable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        }

        /* renamed from: com.tencent.mm.plugin.profile.ui.WxaBindWxaInfoUI$e$d */
        public static class C85361d {

            /* renamed from: a */
            public ImageView f248721a;

            /* renamed from: b */
            public TextView f248722b;

            /* renamed from: c */
            public TextView f248723c;

            /* renamed from: d */
            public View f248724d;

            /* renamed from: e */
            public final C85360c f248725e = new C85360c((C85353a) null);
        }

        public C85357e(LayoutInflater layoutInflater, List<WxaRegisterInfo> list) {
            this.f248716d = layoutInflater;
            ArrayList arrayList = new ArrayList();
            for (WxaRegisterInfo next : list) {
                if (next != null) {
                    if ((next.f115285d.length() > 0) && (next.f115286e.isEmpty() ^ true)) {
                        arrayList.add(new C85356d(0, next.f115285d, (WxaAttributes.WxaEntryInfo) null, false));
                        int size = next.f115286e.size();
                        int i = 0;
                        while (i < size) {
                            arrayList.add(new C85356d(1, (String) null, next.f115286e.get(i), i == size + -1));
                            i++;
                        }
                    }
                }
            }
            this.f248717e = arrayList;
        }

        public int getCount() {
            return ((ArrayList) this.f248717e).size();
        }

        public Object getItem(int i) {
            return (C85356d) ((ArrayList) this.f248717e).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return ((C85356d) ((ArrayList) this.f248717e).get(i)).f248712a;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C85359b bVar;
            C85361d dVar;
            C85356d dVar2 = (C85356d) ((ArrayList) this.f248717e).get(i);
            if (1 == dVar2.f248712a) {
                if (view == null || !(view.getTag() instanceof C85361d)) {
                    view = this.f248716d.inflate(C0966R.C0971layout.f6440ex, viewGroup, false);
                    dVar = new C85361d();
                    dVar.f248721a = (ImageView) view.findViewById(C0966R.C0970id.f15);
                    dVar.f248722b = (TextView) view.findViewById(C0966R.C0970id.i2m);
                    dVar.f248723c = (TextView) view.findViewById(C0966R.C0970id.j7l);
                    dVar.f248724d = view.findViewById(C0966R.C0970id.c7p);
                    view.setAccessibilityDelegate(dVar.f248725e);
                    view.setTag(dVar);
                } else {
                    dVar = (C85361d) view.getTag();
                }
                WxaAttributes.WxaEntryInfo wxaEntryInfo = dVar2.f248714c;
                String str = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(dVar.f248721a, wxaEntryInfo.f108669g, C88393a.m110230a(), C88431k.f255437d);
                String nullAsNil = Util.nullAsNil(wxaEntryInfo.f108667e);
                dVar.f248722b.setText(Util.nullAsNil(nullAsNil));
                String str2 = wxaEntryInfo.f108668f;
                if (Util.isNullOrNil(str2)) {
                    dVar.f248723c.setVisibility(4);
                } else {
                    dVar.f248723c.setVisibility(0);
                    dVar.f248723c.setText(str2);
                    nullAsNil = nullAsNil + ", " + str2;
                }
                if (this.f248717e != null) {
                    View view2 = dVar.f248724d;
                    int i2 = dVar2.f248715d ? 8 : 0;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i2));
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/WxaBindWxaInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/WxaBindWxaInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                dVar.f248725e.f248720a = nullAsNil;
            } else {
                if (view == null || !(view.getTag() instanceof C85359b)) {
                    view = this.f248716d.inflate(C0966R.C0971layout.ciy, viewGroup, false);
                    bVar = new C85359b();
                    bVar.f248718a = (TextView) view.findViewById(C0966R.C0970id.f359390ko1);
                    view.setAccessibilityDelegate(bVar.f248719b);
                    view.setTag(bVar);
                } else {
                    bVar = (C85359b) view.getTag();
                }
                bVar.f248718a.setText(dVar2.f248713b);
            }
            return view;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ciz;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        setBackBtn(new C85353a());
        setMMTitle((int) C0966R.string.f7822sp);
        setActionbarColor(getActionbarColor());
        String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("register"));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("wxa_register_info_list");
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.cix, (ViewGroup) null);
        inflate.setAccessibilityDelegate(new C85354b(this));
        ((TextView) inflate.findViewById(C0966R.C0970id.f359390ko1)).setText(getString(C0966R.string.f7823sq, new Object[]{nullAsNil}));
        ListView listView = (ListView) findViewById(C0966R.C0970id.byw);
        this.f248709d = listView;
        listView.addFooterView(inflate);
        this.f248709d.setAdapter(new C85357e(getLayoutInflater(), parcelableArrayListExtra));
        this.f248709d.setOnItemClickListener(new C85355c());
        getContentView().setBackgroundResource(C0966R.color.aaz);
    }
}
