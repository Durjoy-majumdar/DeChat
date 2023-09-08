package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import b63.C67183e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.platformtools.SpellMap;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.BankCardSelectSortView;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C5809a;
import com.tencent.p014mm.plugin.wallet_core.utils.C72497e;
import com.tencent.p014mm.plugin.wallet_core.utils.C72500g;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lp3.C88633e;
import lp3.C88643g;
import ob0.C117747y;
import p281yz.C79173v;
import qj3.C47864f;
import v53.C78358z;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI */
public class WalletBankCardSelectUI extends WalletBaseUI {
    private static final String TAG = "WalletBankCardSelectUI";
    public List<ElementQuery> bankcardList;
    private List<C47864f> bankcardQueryList;
    public List<ElementQuery> bankcardTypeList;
    /* access modifiers changed from: private */
    public boolean isSearchMode = false;
    public C72200e mBankCardComparator = new C72200e((C43377a) null);
    public BankCardSelectSortView mBankCardSelectSortView;
    private C106742j1 mSearchViewHelper;
    public List<ElementQuery> majorBankCardList;
    /* access modifiers changed from: private */
    public List<C47864f> origBankcardList;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI$a */
    public class C43377a implements AdapterView.OnItemClickListener {
        public C43377a() {
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
                java.lang.String r1 = "com/tencent/mm/plugin/wallet_core/ui/WalletBankCardSelectUI$1"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                qj3.f r8 = (qj3.C47864f) r8
                com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI r9 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankCardSelectUI.this
                java.lang.Object r8 = r8.f128466b
                r9.onItemSelect(r8, r10)
                java.lang.String r8 = "com/tencent/mm/plugin/wallet_core/ui/WalletBankCardSelectUI$1"
                java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBankCardSelectUI.C43377a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI$b */
    public class C43378b implements C106742j1.C106756o {
        public C43378b() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            boolean unused = WalletBankCardSelectUI.this.isSearchMode = false;
            WalletBankCardSelectUI.this.hideVKB();
            WalletBankCardSelectUI.this.mBankCardSelectSortView.mo69937d(true);
            WalletBankCardSelectUI.this.mBankCardSelectSortView.setMode(0);
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            WalletBankCardSelectUI.this.hideVKB();
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
            boolean unused = WalletBankCardSelectUI.this.isSearchMode = true;
            WalletBankCardSelectUI.this.mBankCardSelectSortView.mo69937d(false);
            WalletBankCardSelectUI.this.mBankCardSelectSortView.setMode(1);
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            Log.m105919d(WalletBankCardSelectUI.TAG, "search text: %s", str);
            WalletBankCardSelectUI.this.mBankCardSelectSortView.mo69936a(str);
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI$c */
    public class C72198c implements BankcardLogoHelper.C72483b {
        public C72198c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI$d */
    public class C72199d implements Runnable {
        public C72199d() {
        }

        public void run() {
            WalletBankCardSelectUI walletBankCardSelectUI = WalletBankCardSelectUI.this;
            walletBankCardSelectUI.mBankCardSelectSortView.mo69938e(walletBankCardSelectUI.origBankcardList);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI$e */
    public static class C72200e implements Comparator<C47864f> {

        /* renamed from: d */
        public Collator f209762d = Collator.getInstance(Locale.getDefault());

        public C72200e(C43377a aVar) {
        }

        /* renamed from: a */
        public final int mo99492a(BankCardSelectSortView.C72438b bVar, BankCardSelectSortView.C72438b bVar2) {
            String str;
            if (!Util.isNullOrNil(bVar.f210699d)) {
                str = bVar.f210699d.toUpperCase();
            } else {
                Log.m105920e(WalletBankCardSelectUI.TAG, "should not go here");
                str = WalletBankCardSelectUI.getFullPY(bVar.f210698c, "#", "_", true);
            }
            String upperCase = !Util.isNullOrNil(bVar2.f210699d) ? bVar2.f210699d.toUpperCase() : WalletBankCardSelectUI.getFullPY(bVar2.f210698c, "#", "_", true);
            if (str.equals("#")) {
                return 1;
            }
            if (upperCase.equals("#")) {
                return -1;
            }
            int min = Math.min(str.length(), upperCase.length());
            int i = 0;
            while (i < min) {
                char charAt = str.charAt(i);
                char charAt2 = upperCase.charAt(i);
                if (charAt == '_' && charAt2 == '_') {
                    return this.f209762d.compare(bVar.f210698c, bVar2.f210698c);
                }
                if (charAt == charAt2) {
                    i++;
                } else if (charAt == '_') {
                    return -1;
                } else {
                    return (charAt2 != '_' && charAt < charAt2) ? -1 : 1;
                }
            }
            if (str.length() > min) {
                return 1;
            }
            return upperCase.length() > min ? -1 : 0;
        }

        public int compare(Object obj, Object obj2) {
            C47864f fVar = (C47864f) obj;
            C47864f fVar2 = (C47864f) obj2;
            if (fVar == null && fVar2 == null) {
                return 0;
            }
            if (fVar != null) {
                if (fVar2 != null) {
                    if (fVar.f128465a.equals("☆") && fVar2.f128465a.equals("☆")) {
                        return mo99492a((BankCardSelectSortView.C72438b) fVar.f128466b, (BankCardSelectSortView.C72438b) fVar2.f128466b);
                    }
                    if (!fVar2.f128465a.equals("☆")) {
                        if (!fVar.f128465a.equals("☆")) {
                            if (!fVar2.f128465a.equals("☆")) {
                                return mo99492a((BankCardSelectSortView.C72438b) fVar.f128466b, (BankCardSelectSortView.C72438b) fVar2.f128466b);
                            }
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
    }

    private boolean containByBankName(ElementQuery elementQuery) {
        for (C47864f fVar : this.origBankcardList) {
            BankCardSelectSortView.C72438b bVar = (BankCardSelectSortView.C72438b) fVar.f128466b;
            if (!Util.isNullOrNil(elementQuery.f209505e) && elementQuery.f209505e.equals(bVar.f210698c)) {
                return true;
            }
        }
        return false;
    }

    public static char getAlpha(String str, char c, boolean z) {
        return getFullPY(str, "" + c, "_", z).charAt(0);
    }

    public static String getFullPY(String str, String str2, String str3, boolean z) {
        if (Util.isNullOrNil(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String a = SpellMap.m80581a(str.charAt(i));
            if (!Util.isNullOrNil(a)) {
                if (z) {
                    sb.append(a.toUpperCase());
                } else {
                    sb.append(a);
                }
                if (i != length - 1) {
                    sb.append(str3);
                }
            }
        }
        String sb4 = sb.toString();
        Log.m105919d(TAG, "full py: %s", sb4);
        return !Util.isNullOrNil(sb4) ? sb4 : str2;
    }

    /* access modifiers changed from: private */
    public void refreshData(Map<String, C67183e> map) {
        C67183e eVar;
        C67183e eVar2;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(map != null);
        Log.m105919d(TAG, "refresh data: %s", objArr);
        this.origBankcardList.clear();
        List<ElementQuery> list = this.majorBankCardList;
        if (list != null) {
            for (ElementQuery next : list) {
                if (!containByBankName(next)) {
                    C47864f fVar = new C47864f();
                    BankCardSelectSortView.C72438b bVar = new BankCardSelectSortView.C72438b();
                    bVar.f210698c = next.f209505e;
                    String str = next.f209516s;
                    bVar.f210700e = str;
                    if (!(map == null || (eVar2 = map.get(str)) == null)) {
                        bVar.f210696a = eVar2.f192875a;
                        bVar.f210697b = eVar2.f192878d;
                        bVar.f210699d = eVar2.f192882h;
                    }
                    if (!Util.isNullOrNil(bVar.f210699d)) {
                        Log.m105919d(TAG, "have pinyin：%s", bVar.f210699d);
                    } else {
                        bVar.f210699d = getFullPY(bVar.f210698c, "#", "_", true);
                    }
                    fVar.f128465a = "☆";
                    fVar.f128466b = bVar;
                    this.origBankcardList.add(fVar);
                }
            }
        }
        for (ElementQuery next2 : this.bankcardList) {
            if (!containByBankName(next2)) {
                C47864f fVar2 = new C47864f();
                BankCardSelectSortView.C72438b bVar2 = new BankCardSelectSortView.C72438b();
                bVar2.f210698c = next2.f209505e;
                String str2 = next2.f209516s;
                bVar2.f210700e = str2;
                if (!(map == null || (eVar = map.get(str2)) == null)) {
                    bVar2.f210696a = eVar.f192875a;
                    bVar2.f210697b = eVar.f192878d;
                    bVar2.f210699d = eVar.f192882h;
                }
                if (!Util.isNullOrNil(bVar2.f210699d)) {
                    Log.m105919d(TAG, "have pinyin：%s", bVar2.f210699d);
                } else {
                    bVar2.f210699d = getFullPY(bVar2.f210698c, "#", "_", true);
                }
                fVar2.f128465a = "" + bVar2.f210699d.toUpperCase().charAt(0);
                fVar2.f128466b = bVar2;
                this.origBankcardList.add(fVar2);
            }
        }
        Collections.sort(this.origBankcardList, this.mBankCardComparator);
        runOnUiThread(new C72199d());
    }

    public void fetchData() {
        this.origBankcardList = new ArrayList();
        List<ElementQuery> list = this.bankcardList;
        if (list == null || list.isEmpty()) {
            Log.m105928w(TAG, "bankcardlist is null, start to doScene");
            this.mNetSceneMgr.mo105626e(new C78358z("", "", (PayInfo) null), true, 1, 0);
            return;
        }
        refreshData((Map<String, C67183e>) null);
        BankcardLogoHelper bankcardLogoHelper = new BankcardLogoHelper();
        LinkedList linkedList = new LinkedList();
        List<ElementQuery> list2 = this.bankcardList;
        if (list2 != null) {
            for (ElementQuery next : list2) {
                Bankcard bankcard = new Bankcard();
                bankcard.field_bankName = next.f209505e;
                bankcard.field_bankcardType = next.f209516s;
                linkedList.add(bankcard);
            }
        }
        List<ElementQuery> list3 = this.majorBankCardList;
        if (list3 != null) {
            for (ElementQuery next2 : list3) {
                Bankcard bankcard2 = new Bankcard();
                bankcard2.field_bankName = next2.f209505e;
                bankcard2.field_bankcardType = next2.f209516s;
                linkedList.add(bankcard2);
            }
        }
        getContext();
        C72198c cVar = new C72198c();
        HashMap hashMap = new HashMap();
        if (linkedList.isEmpty()) {
            Log.m105928w("MicroMsg.BankcardLogoHelper", "req is null");
            Log.m105925i(TAG, "get logo callback: %s", Integer.valueOf(hashMap.size()));
            refreshData(hashMap);
            return;
        }
        ((C88633e) C88643g.m110547e(linkedList)).mo123064p(new C72500g(bankcardLogoHelper)).mo123064p(new C72497e(bankcardLogoHelper, linkedList, hashMap, cVar));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360051ce0;
    }

    public void initView() {
        BankCardSelectSortView bankCardSelectSortView = (BankCardSelectSortView) findViewById(C0966R.C0970id.a79);
        this.mBankCardSelectSortView = bankCardSelectSortView;
        bankCardSelectSortView.setOnItemClickListener(new C43377a());
        C106742j1 j1Var = new C106742j1(true, true);
        this.mSearchViewHelper = j1Var;
        j1Var.f319122j = new C43378b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ai5);
        this.bankcardList = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d.f193007b;
        initView();
        fetchData();
        addSearchMenu(true, this.mSearchViewHelper);
    }

    public void onItemSelect(Object obj, int i) {
        BankCardSelectSortView.C72438b bVar = (BankCardSelectSortView.C72438b) obj;
        if (bVar != null) {
            hideVKB();
            Intent intent = new Intent();
            intent.putExtra("bank_name", bVar.f210698c);
            intent.putExtra("bank_type", bVar.f210700e);
            intent.putExtra("bank_icon", bVar.f210696a);
            Log.m105925i(TAG, "item bank: %s", bVar.f210698c);
            setResult(-1, intent);
            finish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d(TAG, " errCode: " + i2 + " errMsg :" + str);
        if (i != 0 || i2 != 0 || !(yVar instanceof C78358z)) {
            return false;
        }
        this.bankcardList = ((C79173v) C86312j.m106911c(C79173v.class)).f232472d.f193007b;
        fetchData();
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5809a.class);
    }
}
