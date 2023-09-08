package com.tencent.p014mm.plugin.sns.lucky.p105ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import b32.C0244a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBaseUI;
import cs2.C7128b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI */
public class SnsLuckyMoneyDetailUI extends LuckyMoneyBaseUI {

    /* renamed from: j */
    public static final /* synthetic */ int f21125j = 0;

    /* renamed from: g */
    public ListView f21126g;

    /* renamed from: h */
    public C7128b f21127h;

    /* renamed from: i */
    public AbsListView.OnScrollListener f21128i = new C5428a();

    /* renamed from: com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI$a */
    public class C5428a implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public boolean f21129d = false;

        /* renamed from: e */
        public boolean f21130e;

        public C5428a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i3 == 0 || !this.f21129d) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                return;
            }
            boolean z = true;
            if (i <= 0) {
                View childAt = absListView.getChildAt(i);
                if ((childAt != null ? 0 - childAt.getTop() : 0) <= 100) {
                    z = false;
                }
            }
            if (this.f21130e != z) {
                if (z) {
                    SnsLuckyMoneyDetailUI snsLuckyMoneyDetailUI = SnsLuckyMoneyDetailUI.this;
                    snsLuckyMoneyDetailUI.getResources().getDrawable(C0966R.color.adb);
                    int i4 = SnsLuckyMoneyDetailUI.f21125j;
                    snsLuckyMoneyDetailUI.getClass();
                } else {
                    SnsLuckyMoneyDetailUI snsLuckyMoneyDetailUI2 = SnsLuckyMoneyDetailUI.this;
                    int i5 = SnsLuckyMoneyDetailUI.f21125j;
                    snsLuckyMoneyDetailUI2.getClass();
                }
                this.f21130e = z;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (absListView.getCount() == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            if (i == 0) {
                this.f21129d = false;
            } else if (i == 1) {
                this.f21129d = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI$b */
    public class C5429b implements MenuItem.OnMenuItemClickListener {
        public C5429b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsLuckyMoneyDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI$c */
    public class C5430c implements AdapterView.OnItemClickListener {
        public C5430c(SnsLuckyMoneyDetailUI snsLuckyMoneyDetailUI) {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyMoneyDetailUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c58;
    }

    public void initView() {
        getResources().getDrawable(C0966R.C0969drawable.c5k);
        setMMTitle((int) C0966R.string.jej);
        setBackBtn(new C5429b());
        this.f21126g = (ListView) findViewById(C0966R.C0970id.gdh);
        C7128b bVar = new C7128b(getContext());
        this.f21127h = bVar;
        this.f21126g.setAdapter(bVar);
        this.f21126g.setOnScrollListener(this.f21128i);
        this.f21126g.setOnItemClickListener(new C5430c(this));
    }

    public void onCreate(Bundle bundle) {
        List<C0244a.C0245a> list;
        super.onCreate(bundle);
        initView();
        String stringExtra = getIntent().getStringExtra("key_feedid");
        synchronized (C0244a.class) {
            if (stringExtra != null) {
                if (stringExtra.equals(C0244a.f780b)) {
                    list = C0244a.f779a;
                }
            }
            list = null;
        }
        if (!(list == null || list.size() == 0)) {
            C7128b bVar = this.f21127h;
            bVar.f25095d = list;
            bVar.notifyDataSetChanged();
        }
        getWindow().setStatusBarColor(getResources().getColor(C0966R.color.ade));
        setMMSubTitle((String) null);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
