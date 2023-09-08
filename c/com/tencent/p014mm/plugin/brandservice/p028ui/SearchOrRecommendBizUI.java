package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.SearchViewNotRealTimeHelper;
import com.tencent.p014mm.plugin.brandservice.p028ui.BizSearchResultItemContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fx0.C45840s;
import gx0.C45977n;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import rb0.C48009v0;
import te3.C51577uo3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI */
public class SearchOrRecommendBizUI extends MMActivity implements BizSearchResultItemContainer.C40604c {

    /* renamed from: d */
    public ProgressDialog f109167d = null;

    /* renamed from: e */
    public int f109168e = 0;

    /* renamed from: f */
    public SearchViewNotRealTimeHelper f109169f;

    /* renamed from: g */
    public BizSearchResultItemContainer f109170g;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI$a */
    public class C40640a implements C11385n {

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI$a$a */
        public class C40641a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C40668j f109172d;

            public C40641a(C40640a aVar, C40668j jVar) {
                this.f109172d = jVar;
            }

            public void run() {
                Log.m105924i("MicroMsg.BrandService.SearchOrRecommendBizUI", "Has got recommend groups, so notifyDataSetChanged.");
                this.f109172d.notifyDataSetChanged();
            }
        }

        public C40640a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar == null) {
                Log.m105920e("MicroMsg.BrandService.SearchOrRecommendBizUI", "NetScene is null.");
            } else if (yVar.getType() != 456) {
                Log.m105920e("MicroMsg.BrandService.SearchOrRecommendBizUI", "The NetScene is not a RecommendGroupNetScene.");
            } else {
                C86709a0.m107524d().mo123470p(456, this);
                boolean z = false;
                Log.m105925i("MicroMsg.BrandService.SearchOrRecommendBizUI", "errType(%d) , errCode(%d) , errMsg(%s)", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 0 && i2 == 0) {
                    LinkedList<C51577uo3> j1 = C45840s.m51139j1();
                    BizSearchResultItemContainer bizSearchResultItemContainer = SearchOrRecommendBizUI.this.f109170g;
                    C40668j jVar = bizSearchResultItemContainer == null ? null : (C40668j) bizSearchResultItemContainer.getAdapter();
                    if (jVar != null && j1 != null && j1.size() > 0) {
                        if (jVar.getCount() == 0) {
                            z = true;
                        }
                        jVar.f109258t = j1;
                        if (z) {
                            MMHandlerThread.postToMainThread(new C40641a(this, jVar));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI$b */
    public class C40642b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f109173d;

        public C40642b(String str) {
            this.f109173d = str;
        }

        public void run() {
            SearchOrRecommendBizUI.this.f109169f.setSearchContent(this.f109173d);
            SearchOrRecommendBizUI.this.f109169f.f319099g.performClick();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI$c */
    public class C40643c implements MenuItem.OnMenuItemClickListener {
        public C40643c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SearchOrRecommendBizUI.this.hideVKB();
            SearchOrRecommendBizUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI$d */
    public class C40644d implements View.OnTouchListener {
        public C40644d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/SearchOrRecommendBizUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SearchOrRecommendBizUI.this.f109169f.clearFocus();
            SearchOrRecommendBizUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/SearchOrRecommendBizUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7094y2;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.buf);
        setBackBtn(new C40643c());
        SearchViewNotRealTimeHelper searchViewNotRealTimeHelper = (SearchViewNotRealTimeHelper) findViewById(C0966R.C0970id.j75);
        this.f109169f = searchViewNotRealTimeHelper;
        searchViewNotRealTimeHelper.setSearchColor(getResources().getColor(C0966R.color.a7f));
        this.f109169f.setSearchHint(getString(C0966R.string.buf));
        this.f109169f.setSearchHintColor(getResources().getColor(C0966R.color.f3562xs));
        this.f109169f.setSearchIcon(0);
        this.f109169f.setShowBackIcon(false);
        this.f109169f.setCallBack((SearchViewNotRealTimeHelper.C45055f) new C45977n(this));
        BizSearchResultItemContainer bizSearchResultItemContainer = (BizSearchResultItemContainer) findViewById(C0966R.C0970id.j4o);
        this.f109170g = bizSearchResultItemContainer;
        bizSearchResultItemContainer.setOnTouchListener(new C40644d());
        C40668j jVar = new C40668j(this);
        jVar.f109258t = C45840s.m51139j1();
        this.f109170g.setAdapter(jVar);
        this.f109170g.setBusinessTypes(1);
        BizSearchResultItemContainer bizSearchResultItemContainer2 = this.f109170g;
        C40658c cVar = bizSearchResultItemContainer2.f109052e;
        cVar.f109235p = false;
        cVar.f109234o = false;
        bizSearchResultItemContainer2.setMode(1);
        this.f109170g.setScene(this.f109168e);
        this.f109170g.setIOnSearchStateChangedListener(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        getIntent().getIntExtra("intent_extra_entry_flag", 0);
        this.f109168e = getIntent().getIntExtra("fromScene", 0);
        initView();
        if (System.currentTimeMillis() - C45840s.f123771f > 3600000) {
            z = true;
        }
        if (z) {
            C86709a0.m107524d().mo123455a(456, new C40640a());
            C86709a0.m107524d().mo123460f(new C45840s());
        }
        String stringExtra = getIntent().getStringExtra("Search_Str");
        if (!Util.isNullOrNil(stringExtra)) {
            new MMHandler(Looper.getMainLooper()).post(new C40642b(stringExtra));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ((ArrayList) C48009v0.Lx0().f128790a).clear();
    }
}
