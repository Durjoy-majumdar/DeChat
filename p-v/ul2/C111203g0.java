package ul2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanScrollTabView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScrollTab;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import sx3.C64197v;
import vl2.C37751c0;

/* renamed from: ul2.g0 */
public final class C111203g0 {

    /* renamed from: a */
    public final Context f333018a;

    /* renamed from: b */
    public ScanScrollTabView f333019b;

    /* renamed from: c */
    public ArrayList<C111199e> f333020c = new ArrayList<>();

    /* renamed from: d */
    public int f333021d = -1;

    /* renamed from: e */
    public final ArrayList<C37481a> f333022e;

    /* renamed from: f */
    public HashMap<Integer, Integer> f333023f;

    /* renamed from: ul2.g0$a */
    public static final class C37481a {

        /* renamed from: a */
        public final int f99037a;

        /* renamed from: b */
        public final String f99038b;

        public C37481a(int i, String str) {
            C87412m.m108594g(str, "scanTabTitle");
            this.f99037a = i;
            this.f99038b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37481a)) {
                return false;
            }
            C37481a aVar = (C37481a) obj;
            return this.f99037a == aVar.f99037a && C87412m.m108589b(this.f99038b, aVar.f99038b);
        }

        public int hashCode() {
            return (this.f99037a * 31) + this.f99038b.hashCode();
        }

        public String toString() {
            return "ScanTabInfo(scanTabId=" + this.f99037a + ", scanTabTitle=" + this.f99038b + ')';
        }
    }

    public C111203g0(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        this.f333018a = context;
        C37481a[] aVarArr = new C37481a[3];
        String string = context.getString(z ? C0966R.string.ibp : C0966R.string.ibw);
        C87412m.m108593f(string, "if (enableScanCodeProduc…R.string.scan_entry_qbar)");
        aVarArr[0] = new C37481a(1, string);
        String string2 = context.getString(C0966R.string.ibr);
        C87412m.m108593f(string2, "context.getString(R.string.scan_entry_goods)");
        aVarArr[1] = new C37481a(12, string2);
        String string3 = context.getString(C0966R.string.ibv);
        C87412m.m108593f(string3, "context.getString(com.te….R.string.scan_entry_ocr)");
        aVarArr[2] = new C37481a(3, string3);
        this.f333022e = C64197v.m75534c(aVarArr);
        this.f333023f = new HashMap<>();
    }

    /* renamed from: a */
    public final boolean mo162948a(int i, C37481a aVar) {
        int i2 = aVar.f99037a;
        if (!((i2 != 3 || C37751c0.m41522b()) && (i2 != 12 || C37751c0.m41524d()))) {
            Log.m105929w("MicroMsg.ScanScrollTabController", "alvinluo initTabs tabId: %d not show", Integer.valueOf(aVar.f99037a));
            return false;
        } else if (aVar.f99037a == 12 && WeChatBrands.Business.Entries.DiscoveryScanRecognize.restricted()) {
            return false;
        } else {
            if (aVar.f99037a == 3 && WeChatBrands.Business.Entries.DiscoveryScanTranslate.restricted()) {
                return false;
            }
            Context context = this.f333018a;
            C87412m.m108594g(context, "context");
            ScrollTab scrollTab = new ScrollTab(context, (AttributeSet) null);
            scrollTab.setTabId(aVar.f99037a);
            scrollTab.setTabTitle(aVar.f99038b);
            this.f333023f.put(Integer.valueOf(aVar.f99037a), Integer.valueOf(i));
            this.f333020c.add(scrollTab);
            ScanScrollTabView scanScrollTabView = this.f333019b;
            if (scanScrollTabView != null) {
                if (scanScrollTabView.f315954g.contains(scrollTab)) {
                    Log.m105929w("MicroMsg.BaseScrollTabView", "alvinluo addTab tab has been added and ignore, hashCode: %d", Integer.valueOf(scrollTab.hashCode()));
                } else {
                    Log.m105927v("MicroMsg.BaseScrollTabView", "alvinluo addTabInternal size: %d", Integer.valueOf(scanScrollTabView.f315954g.size()));
                    scrollTab.setOnClickListener(new C111197d(scanScrollTabView, scanScrollTabView.f315954g.size(), scrollTab));
                    scanScrollTabView.f315954g.add(scrollTab);
                    LinearLayout linearLayout = scanScrollTabView.f315951d;
                    if (linearLayout != null) {
                        linearLayout.addView(scrollTab, new LinearLayout.LayoutParams(-2, -2));
                        scanScrollTabView.mo151824k(scrollTab);
                    } else {
                        C87412m.m108603p("container");
                        throw null;
                    }
                }
            }
            Log.m105925i("MicroMsg.ScanScrollTabController", "alvinluo addTab index: %d, tabId: %d", Integer.valueOf(i), Integer.valueOf(aVar.f99037a));
            return true;
        }
    }

    /* renamed from: b */
    public final void mo162949b(boolean z) {
        Log.m105924i("MicroMsg.ScanScrollTabController", "setAccessibilityAvailable :" + z);
        ScanScrollTabView scanScrollTabView = this.f333019b;
        if (scanScrollTabView != null) {
            scanScrollTabView.setTabViewImportantForAccessibility(z ? 0 : 4);
        }
    }

    /* renamed from: c */
    public final void mo162950c(boolean z) {
        Log.m105925i("MicroMsg.ScanScrollTabController", "alvinluo setEnableSwitchTab enable: %b", Boolean.valueOf(z));
        ScanScrollTabView scanScrollTabView = this.f333019b;
        if (scanScrollTabView != null) {
            scanScrollTabView.setEnableSwitchTab(z);
        }
    }

    /* renamed from: d */
    public final void mo162951d(int i, int i2) {
        Integer num = this.f333023f.get(Integer.valueOf(i));
        Log.m105925i("MicroMsg.ScanScrollTabController", "alvinluo setSelectedTab tabId: %d, index: %s, tabSelectedAction: %d", Integer.valueOf(i), num, Integer.valueOf(i2));
        if (num != null) {
            this.f333021d = num.intValue();
            ScanScrollTabView scanScrollTabView = this.f333019b;
            if (scanScrollTabView != null) {
                scanScrollTabView.mo151707j(num.intValue(), i2);
            }
        }
    }

    /* renamed from: e */
    public final void mo162952e() {
        int i = this.f333021d;
        int i2 = i + 1;
        Log.m105919d("MicroMsg.ScanScrollTabController", "alvinluo switchNextTab selectedIndex: %d, nextIndex: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 >= 0 && i2 < this.f333020c.size()) {
            this.f333021d = i2;
            ScanScrollTabView scanScrollTabView = this.f333019b;
            if (scanScrollTabView != null) {
                scanScrollTabView.mo151707j(i2, 3);
            }
        }
    }

    /* renamed from: f */
    public final void mo162953f() {
        int i = this.f333021d;
        int i2 = i - 1;
        Log.m105919d("MicroMsg.ScanScrollTabController", "alvinluo switchPreviousTab selectedIndex: %d, previousIndex: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 >= 0 && i2 < this.f333020c.size()) {
            this.f333021d = i2;
            ScanScrollTabView scanScrollTabView = this.f333019b;
            if (scanScrollTabView != null) {
                scanScrollTabView.mo151707j(i2, 3);
            }
        }
    }
}
