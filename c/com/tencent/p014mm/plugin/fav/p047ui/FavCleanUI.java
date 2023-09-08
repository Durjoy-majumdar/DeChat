package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lc1.c$$f;
import ob0.C11385n;
import ob0.C117747y;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100747v;
import pb1.C100755z;
import pb1.C47452q1;
import pc1.C100771b;
import te3.C101801kd0;
import te3.C101834rc0;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavCleanUI */
public class FavCleanUI extends MMActivity implements c$$f {

    /* renamed from: x */
    public static final /* synthetic */ int f269656x = 0;

    /* renamed from: d */
    public FavoriteImageServer f269657d;

    /* renamed from: e */
    public FavoriteNormalAdapter f269658e;

    /* renamed from: f */
    public boolean f269659f = false;

    /* renamed from: g */
    public ListView f269660g;

    /* renamed from: h */
    public TextView f269661h;

    /* renamed from: i */
    public View f269662i;

    /* renamed from: j */
    public MMHandler f269663j = new MMHandler(Looper.getMainLooper());

    /* renamed from: n */
    public MMHandler f269664n;

    /* renamed from: o */
    public C100771b f269665o;

    /* renamed from: p */
    public View f269666p;

    /* renamed from: q */
    public boolean f269667q = false;

    /* renamed from: r */
    public int f269668r = 0;

    /* renamed from: s */
    public C100747v.C100750c f269669s = new C93416c();

    /* renamed from: t */
    public C11385n f269670t = new C93417d();

    /* renamed from: u */
    public Runnable f269671u = new C93418e();

    /* renamed from: v */
    public long f269672v = 0;

    /* renamed from: w */
    public Runnable f269673w = new C93419f();

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavCleanUI$a */
    public class C93414a implements MenuItem.OnMenuItemClickListener {
        public C93414a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavCleanUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavCleanUI$b */
    public class C93415b implements AbsListView.OnScrollListener {
        public C93415b() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavCleanUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavCleanUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavCleanUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0) {
                FavCleanUI favCleanUI = FavCleanUI.this;
                ListView listView = favCleanUI.f269660g;
                if (listView.getChildAt(listView.getChildCount() - 1) != null && favCleanUI.f269660g.getLastVisiblePosition() == favCleanUI.f269660g.getAdapter().getCount() - 1) {
                    Log.m105924i("MicroMsg.FavCleanUI", "at bottom call back");
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.FavCleanUI", "force bottom load data");
                    FavCleanUI favCleanUI2 = FavCleanUI.this;
                    favCleanUI2.getClass();
                    Log.m105926v("MicroMsg.FavCleanUI", "on pull down callback");
                    if (favCleanUI2.f269658e.f269989y) {
                        Log.m105924i("MicroMsg.FavCleanUI", "has shown all, do not load data");
                    } else if (favCleanUI2.f269659f) {
                        Log.m105928w("MicroMsg.FavCleanUI", "onBottomLoadData loading, return");
                    } else {
                        favCleanUI2.f269659f = true;
                        if (favCleanUI2.f269660g.getFooterViewsCount() == 0) {
                            favCleanUI2.f269660g.addFooterView(favCleanUI2.f269666p);
                        }
                        Log.m105924i("MicroMsg.FavCleanUI", "on bottom load data listener");
                        favCleanUI2.f269664n.removeCallbacks(favCleanUI2.f269671u);
                        favCleanUI2.f269664n.post(favCleanUI2.f269671u);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavCleanUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavCleanUI$c */
    public class C93416c implements C100747v.C100750c {
        public C93416c() {
        }

        public void onFinish() {
            Log.m105924i("MicroMsg.FavCleanUI", "FavCleanFirstLoader onRefreshed()");
            FavCleanUI favCleanUI = FavCleanUI.this;
            int i = FavCleanUI.f269656x;
            favCleanUI.getClass();
            favCleanUI.f269657d = new FavoriteImageServer(MMApplicationContext.getContext(), 16);
            FavoriteNormalAdapter favoriteNormalAdapter = new FavoriteNormalAdapter(MMApplicationContext.getContext(), favCleanUI.f269657d, true);
            favCleanUI.f269658e = favoriteNormalAdapter;
            favoriteNormalAdapter.f269987w = favCleanUI;
            favCleanUI.f269660g.setAdapter(favoriteNormalAdapter);
            favCleanUI.f269660g.setOnItemClickListener(new C93665k(favCleanUI));
            favCleanUI.f269660g.setOnTouchListener((View.OnTouchListener) null);
            favCleanUI.f269660g.setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
            FavCleanUI.m117995H7(FavCleanUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavCleanUI$d */
    public class C93417d implements C11385n {
        public C93417d() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105924i("MicroMsg.FavCleanUI", "on getfavinfo scene end");
            C100771b bVar = FavCleanUI.this.f269665o;
            if (bVar != null) {
                bVar.f295230e = C100734q.m131814E();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavCleanUI$e */
    public class C93418e implements Runnable {
        public C93418e() {
        }

        public void run() {
            FavoriteNormalAdapter favoriteNormalAdapter = FavCleanUI.this.f269658e;
            if (favoriteNormalAdapter != null) {
                favoriteNormalAdapter.mo128368a();
            }
            FavCleanUI favCleanUI = FavCleanUI.this;
            favCleanUI.getClass();
            Log.m105924i("MicroMsg.FavCleanUI", "on storage change, try refresh job");
            favCleanUI.f269663j.removeCallbacks(favCleanUI.f269673w);
            favCleanUI.f269663j.post(favCleanUI.f269673w);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavCleanUI$f */
    public class C93419f implements Runnable {
        public C93419f() {
        }

        public void run() {
            FavoriteNormalAdapter favoriteNormalAdapter = FavCleanUI.this.f269658e;
            if (favoriteNormalAdapter != null) {
                if (favoriteNormalAdapter.isEmpty() || SystemClock.elapsedRealtime() - FavCleanUI.this.f269672v >= 1000) {
                    FavCleanUI favCleanUI = FavCleanUI.this;
                    favCleanUI.f269659f = false;
                    favCleanUI.f269672v = SystemClock.elapsedRealtime();
                    Log.m105926v("MicroMsg.FavCleanUI", "do refresh job");
                    FavCleanUI.m117995H7(FavCleanUI.this);
                    FavCleanUI.this.getClass();
                    return;
                }
                Log.m105919d("MicroMsg.FavCleanUI", "try refresh, time limit, now %d last %d delay %d", Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(FavCleanUI.this.f269672v), 1000);
                FavCleanUI.this.f269663j.postDelayed(this, 500);
            }
        }
    }

    /* renamed from: H7 */
    public static void m117995H7(FavCleanUI favCleanUI) {
        favCleanUI.f269658e.notifyDataSetChanged();
        if (favCleanUI.f269658e.isEmpty()) {
            favCleanUI.mo128247h(true);
            if (8 != favCleanUI.f269660g.getVisibility()) {
                favCleanUI.f269660g.setVisibility(8);
            }
        } else {
            favCleanUI.mo128247h(false);
            C100771b bVar = favCleanUI.f269665o;
            if (bVar != null) {
                bVar.mo140205b();
            }
            if (favCleanUI.f269660g.getVisibility() != 0) {
                favCleanUI.f269660g.setVisibility(0);
            }
        }
        favCleanUI.f269660g.removeFooterView(favCleanUI.f269666p);
    }

    /* renamed from: g3 */
    public void mo128246g3(long j, boolean z) {
        C101801kd0 kd02;
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
        if (!(Yt == null || (kd02 = Yt.field_favProto) == null || kd02.f298618f.size() == 0)) {
            Iterator<C101834rc0> it = Yt.field_favProto.f298618f.iterator();
            while (it.hasNext()) {
                long j2 = it.next().f299276R;
            }
        }
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269658e;
        if (favoriteNormalAdapter.f269988x) {
            C100771b bVar = this.f269665o;
            boolean z2 = favoriteNormalAdapter.mo128381j() > 0;
            if (bVar.f295226a) {
                bVar.f295229d.setEnabled(z2);
            }
            C100771b bVar2 = this.f269665o;
            List<C100755z> i = this.f269658e.mo128379i(false);
            long k = this.f269658e.mo128382k();
            bVar2.getClass();
            if (((LinkedList) i).size() == 0 || k <= 0) {
                bVar2.mo140206c();
                return;
            }
            TextView textView = bVar2.f295228c;
            textView.setText(textView.getContext().getString(C0966R.string.cma, new Object[]{C100734q.m131824O(k)}));
            bVar2.f295229d.setEnabled(true);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a6e;
    }

    /* renamed from: h */
    public final void mo128247h(boolean z) {
        if (z) {
            View view = this.f269662i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f269661h.setVisibility(0);
            this.f269660g.removeFooterView(this.f269666p);
            C100771b bVar = this.f269665o;
            if (bVar != null) {
                bVar.mo140204a();
                return;
            }
            return;
        }
        View view3 = this.f269662i;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f269661h.setVisibility(8);
        this.f269660g.removeFooterView(this.f269666p);
        C100771b bVar2 = this.f269665o;
        if (bVar2 != null) {
            bVar2.mo140205b();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f269668r = getIntent().getIntExtra("key_enter_fav_cleanui_from", 0);
        this.f269664n = new MMHandler(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
        this.f269660g = (ListView) findViewById(C0966R.C0970id.cuq);
        setMMTitle((int) C0966R.string.cmf);
        this.f269667q = true;
        C86709a0.m107524d().mo123460f(new C47452q1());
        C86709a0.m107524d().mo123455a(438, this.f269670t);
        setBackBtn(new C93414a());
        ViewStub viewStub = (ViewStub) findViewById(C0966R.C0970id.f357931cj0);
        if (viewStub != null) {
            this.f269662i = viewStub.inflate();
        } else {
            this.f269662i = findViewById(C0966R.C0970id.cxt);
        }
        this.f269661h = (TextView) findViewById(C0966R.C0970id.cit);
        View view = this.f269662i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f269661h.setVisibility(8);
        this.f269660g.removeFooterView(this.f269666p);
        C100771b bVar = this.f269665o;
        if (bVar != null) {
            bVar.mo140204a();
        }
        this.f269666p = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f359671a72, (ViewGroup) null);
        this.f269660g.setOnScrollListener(new C93415b());
        if (this.f269667q) {
            C100771b bVar2 = new C100771b();
            this.f269665o = bVar2;
            View findViewById = findViewById(C0966R.C0970id.cup);
            bVar2.f295226a = false;
            bVar2.f295227b = findViewById;
            this.f269665o.f295231f = new C93674m(this);
            this.f269667q = false;
        }
        C100747v.m131897b().mo140169a(this.f269669s);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Log.m105918d("MicroMsg.FavCleanUI", "on create options menu");
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C100747v b = C100747v.m131897b();
        C100747v.C100750c cVar = this.f269669s;
        if (b.f295159b.contains(cVar)) {
            b.f295159b.remove(cVar);
        }
        FavoriteImageServer favoriteImageServer = this.f269657d;
        if (favoriteImageServer != null) {
            favoriteImageServer.mo128332f();
            this.f269657d = null;
        }
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269658e;
        if (favoriteNormalAdapter != null) {
            favoriteNormalAdapter.getClass();
        }
        this.f269664n.quit();
        C86709a0.m107524d().mo123470p(438, this.f269670t);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
    }
}
