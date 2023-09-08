package com.tencent.p014mm.plugin.fav.p047ui;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C93486a;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ie3.C87716k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import lu3.C88656g;
import ob0.C11385n;
import ob0.C117747y;
import pb1.C100701c1;
import pb1.C100718j1;
import pb1.C100725n1;
import pb1.C100731p1;
import pb1.C100734q;
import pb1.C100751w0;
import pb1.C47452q1;
import pc1.C77075f;
import wb1.C102417u;
import wb1.C102421x;
import xb1.C102614d;
import xb1.C102615e;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI */
public abstract class FavBaseUI extends MMSecDataActivity implements AdapterView.OnItemClickListener {

    /* renamed from: A */
    public C11385n f269614A;

    /* renamed from: B */
    public C11385n f269615B;

    /* renamed from: C */
    public Runnable f269616C;

    /* renamed from: D */
    public Runnable f269617D;

    /* renamed from: E */
    public Runnable f269618E;

    /* renamed from: F */
    public MStorage.IOnStorageChange f269619F;

    /* renamed from: d */
    public boolean f269620d = false;

    /* renamed from: e */
    public boolean f269621e = false;

    /* renamed from: f */
    public boolean f269622f = false;

    /* renamed from: g */
    public long f269623g = 0;

    /* renamed from: h */
    public ListView f269624h;

    /* renamed from: i */
    public TextView f269625i;

    /* renamed from: j */
    public MMHandler f269626j = new MMHandler(Looper.getMainLooper());

    /* renamed from: n */
    public MMHandler f269627n;

    /* renamed from: o */
    public View f269628o;

    /* renamed from: p */
    public View f269629p;

    /* renamed from: q */
    public C77075f f269630q;

    /* renamed from: r */
    public View f269631r;

    /* renamed from: s */
    public FavoriteImageServer f269632s;

    /* renamed from: t */
    public C77075f.C77076a f269633t = null;

    /* renamed from: u */
    public final Object f269634u = new Object();

    /* renamed from: v */
    public long f269635v = -1;

    /* renamed from: w */
    public long f269636w = -1;

    /* renamed from: x */
    public long f269637x;

    /* renamed from: y */
    public boolean f269638y;

    /* renamed from: z */
    public boolean f269639z;

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$d */
    public class C68891d implements View.OnClickListener {
        public C68891d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavBaseUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = FavBaseUI.this.f269624h;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavBaseUI$2", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/fav/ui/FavBaseUI$2", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$f */
    public class C68892f implements View.OnTouchListener {
        public C68892f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavBaseUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            FavBaseUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$g */
    public class C68893g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f197991d;

        /* renamed from: e */
        public final /* synthetic */ TextView f197992e;

        /* renamed from: f */
        public final /* synthetic */ TextView f197993f;

        public C68893g(TextView textView, TextView textView2, TextView textView3) {
            this.f197991d = textView;
            this.f197992e = textView2;
            this.f197993f = textView3;
        }

        public void onGlobalLayout() {
            FavBaseUI.this.f269631r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int width = FavBaseUI.this.f269631r.findViewById(C0966R.C0970id.cx5).getWidth() / 3;
            if (width > 0 && this.f197991d.getWidth() < width) {
                this.f197992e.setWidth(width);
                this.f197991d.setWidth(width);
                this.f197993f.setWidth(width);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$a */
    public class C93405a implements C88656g {
        public C93405a() {
        }

        public String getKey() {
            return "MicroMsg.FavoriteBaseUI#dataSetChangedJob";
        }

        public void run() {
            synchronized (FavBaseUI.this.f269634u) {
                FavBaseUI.this.mo128230O7();
                FavBaseUI.this.mo128226K7().mo128369b();
                FavBaseUI.this.mo128232Q7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$b */
    public class C93406b implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public long f269641d = 0;

        public C93406b() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105925i("MicroMsg.FavoriteBaseUI", "[onNotifyChange] event=%s", str);
            FavBaseUI favBaseUI = FavBaseUI.this;
            favBaseUI.f269627n.removeCallbacks(favBaseUI.f269618E);
            if (Util.ticksToNow(this.f269641d) > 200) {
                this.f269641d = Util.currentTicks();
                FavBaseUI favBaseUI2 = FavBaseUI.this;
                favBaseUI2.f269627n.post(favBaseUI2.f269618E);
                return;
            }
            FavBaseUI favBaseUI3 = FavBaseUI.this;
            favBaseUI3.f269627n.postDelayed(favBaseUI3.f269618E, 200);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$c */
    public class C93407c implements Runnable {
        public C93407c(FavBaseUI favBaseUI) {
        }

        public void run() {
            C100734q.m131868q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$e */
    public class C93408e implements AbsListView.OnScrollListener {
        public C93408e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavBaseUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z;
            Class cls = C100718j1.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavBaseUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0) {
                boolean z2 = false;
                if (((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142268bF(FavBaseUI.this.mo128226K7().f269991d, FavBaseUI.this.mo128226K7().f269992e)) {
                    Log.m105927v("MicroMsg.FavoriteBaseUI", "has shown all, do not load data:%s", Long.valueOf(FavBaseUI.this.mo128226K7().f269991d));
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                    return;
                }
                FavBaseUI favBaseUI = FavBaseUI.this;
                ListView listView = favBaseUI.f269624h;
                if (listView.getChildAt(listView.getChildCount() - 1) != null && favBaseUI.f269624h.getLastVisiblePosition() == favBaseUI.f269624h.getAdapter().getCount() - 1) {
                    Log.m105924i("MicroMsg.FavoriteBaseUI", "at bottom call back");
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.FavoriteBaseUI", "force bottom load data");
                    FavBaseUI favBaseUI2 = FavBaseUI.this;
                    favBaseUI2.getClass();
                    Log.m105926v("MicroMsg.FavoriteBaseUI", "on pull down callback");
                    if (!((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142268bF(favBaseUI2.mo128226K7().f269991d, favBaseUI2.mo128226K7().f269992e)) {
                        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
                        if (C100725n1.f295091o.get() > 0) {
                            z2 = true;
                        }
                        if (z2) {
                            Log.m105928w("MicroMsg.FavoriteBaseUI", "doing batchget, do not load data");
                        } else if (favBaseUI2.f269620d) {
                            Log.m105928w("MicroMsg.FavoriteBaseUI", "onBottomLoadData loading, return");
                        } else {
                            favBaseUI2.f269620d = true;
                            Log.m105924i("MicroMsg.FavoriteBaseUI", "on bottom load data listener");
                            favBaseUI2.f269627n.removeCallbacks(favBaseUI2.f269616C);
                            favBaseUI2.f269627n.post(favBaseUI2.f269616C);
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$h */
    public class C93409h implements C11385n {
        public C93409h() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3;
            int i4 = i;
            int i5 = i2;
            Log.m105924i("MicroMsg.FavoriteBaseUI", "on fav sync end, errType = " + i4 + ", errCode = " + i5 + ", errMsg = " + str);
            long currentTimeMillis = System.currentTimeMillis();
            FavBaseUI favBaseUI = FavBaseUI.this;
            long j = favBaseUI.f269635v;
            if (j != -1) {
                favBaseUI.f269637x = currentTimeMillis - j;
                i3 = 1;
            } else {
                i3 = -1;
            }
            long j2 = favBaseUI.f269636w;
            if (j2 != -1) {
                favBaseUI.f269637x = currentTimeMillis - j2;
                i3 = 2;
            }
            String localClassName = favBaseUI.getHostActivity().getLocalClassName();
            C115669n.INSTANCE.mo160131h(27726, Integer.valueOf(i3), Long.valueOf(FavBaseUI.this.f269637x), Integer.valueOf(i), Integer.valueOf(i2), localClassName, "", "");
            Log.m105924i("MicroMsg.FavoriteBaseUI", "report 27726 : activityName = " + localClassName + ", syncType = " + i3 + ", syncCost = " + FavBaseUI.this.f269637x + ", errType = " + i4 + ", errCode = " + i5);
            if (((C100731p1) yVar).f295119i) {
                Log.m105924i("MicroMsg.FavoriteBaseUI", "need batch get return");
                return;
            }
            Log.m105924i("MicroMsg.FavoriteBaseUI", "dismiss loading dialog");
            FavBaseUI favBaseUI2 = FavBaseUI.this;
            if (favBaseUI2.f269622f) {
                favBaseUI2.f269622f = false;
            }
            favBaseUI2.mo128224I7(false);
            FavBaseUI.this.mo128232Q7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$i */
    public class C93410i implements C11385n {
        public C93410i() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105924i("MicroMsg.FavoriteBaseUI", "on batch get end errType = [" + i + "], errCode = [" + i2 + "], errMsg = [" + str + "], scene = [" + yVar + "]");
            if (FavBaseUI.this.f269622f) {
                Log.m105924i("MicroMsg.FavoriteBaseUI", "init currently, dismiss dialog");
                FavBaseUI favBaseUI = FavBaseUI.this;
                favBaseUI.f269622f = false;
                favBaseUI.mo128224I7(false);
            }
            if ("EReachMaxLimit".equals(str)) {
                FavoriteNormalAdapter favoriteNormalAdapter = (FavoriteNormalAdapter) FavBaseUI.this.mo128226K7();
                Log.m105925i("MicroMsg.FavoriteAdapter", "handleReachMaxLimit() called before correct lastUpdateTime:%s %s", Long.valueOf(favoriteNormalAdapter.f269991d), favoriteNormalAdapter.mo128388p());
                if (!favoriteNormalAdapter.f269988x && !favoriteNormalAdapter.mo128384n()) {
                    C100751w0 Jq = ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq();
                    long j = favoriteNormalAdapter.f269991d;
                    int i3 = favoriteNormalAdapter.f269992e;
                    C102614d dVar = (C102614d) Jq;
                    if (dVar.f302175d == null) {
                        Log.m105920e("MicroMsg.Fav.FavItemInfoStorage", "getNextUpdateTime, but db is null, return");
                        j = 0;
                    } else if (j != 0) {
                        String str2 = "select updateTime from FavItemInfo where updateTime > " + j;
                        if (i3 != -1) {
                            str2 = str2 + " and type = " + i3;
                        }
                        Cursor rawQuery = dVar.f302175d.rawQuery((str2 + " and itemStatus > 0") + " order by updateTime desc", (String[]) null);
                        if (rawQuery != null && rawQuery.getCount() > 0) {
                            rawQuery.moveToLast();
                            j = rawQuery.getLong(0);
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                    }
                    favoriteNormalAdapter.f269991d = j;
                }
                Log.m105925i("MicroMsg.FavoriteAdapter", "handleReachMaxLimit() called after correct lastUpdateTime:%s", Long.valueOf(favoriteNormalAdapter.f269991d));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$j */
    public class C93411j implements C88656g {
        public C93411j() {
        }

        public String getKey() {
            return "MicroMsg.FavoriteBaseUI#notifyAdapterJob";
        }

        public void run() {
            C93486a K7 = FavBaseUI.this.mo128226K7();
            K7.mo128368a();
            K7.mo128369b();
            FavBaseUI.this.mo128232Q7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI$k */
    public class C93412k implements Runnable {
        public C93412k() {
        }

        public void run() {
            C93486a K7 = FavBaseUI.this.mo128226K7();
            if (K7.isEmpty() || SystemClock.elapsedRealtime() - FavBaseUI.this.f269623g >= 400) {
                FavBaseUI favBaseUI = FavBaseUI.this;
                favBaseUI.f269620d = false;
                favBaseUI.f269623g = SystemClock.elapsedRealtime();
                Log.m105924i("MicroMsg.FavoriteBaseUI", "do refresh job");
                K7.notifyDataSetChanged();
                FavBaseUI.this.mo128228M7(K7);
                if (FavBaseUI.this.f269621e) {
                    Log.m105924i("MicroMsg.FavoriteBaseUI", "do scroll to first");
                    FavBaseUI.this.f269624h.setSelection(0);
                    FavBaseUI.this.f269621e = false;
                    return;
                }
                return;
            }
            Log.m105925i("MicroMsg.FavoriteBaseUI", "try refresh, time limit, now %d last %d delay %d", Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(FavBaseUI.this.f269623g), 400);
            FavBaseUI.this.f269626j.postDelayed(this, 200);
        }
    }

    public FavBaseUI() {
        Class cls = C32735h.class;
        this.f269638y = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_fav_finder_show_filter, true);
        this.f269639z = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_fav_title_menu_update, true);
        this.f269614A = new C93409h();
        this.f269615B = new C93410i();
        this.f269616C = new C93411j();
        this.f269617D = new C93412k();
        this.f269618E = new C93405a();
        this.f269619F = new C93406b();
    }

    /* renamed from: H7 */
    public abstract boolean mo128223H7();

    /* renamed from: I7 */
    public void mo128224I7(boolean z) {
        ViewStub viewStub;
        if (z) {
            if (this.f269629p == null && (viewStub = (ViewStub) findViewById(C0966R.C0970id.f357931cj0)) != null) {
                this.f269629p = viewStub.inflate();
            }
            View view = this.f269629p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f269629p;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: J7 */
    public void mo128225J7(boolean z) {
        if (z) {
            if (this.f269625i == null) {
                this.f269625i = (TextView) ((ViewStub) findViewById(C0966R.C0970id.cjh)).inflate().findViewById(C0966R.C0970id.cit);
            }
            this.f269625i.setVisibility(0);
            return;
        }
        TextView textView = this.f269625i;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: K7 */
    public abstract C93486a mo128226K7();

    /* renamed from: L7 */
    public abstract View.OnClickListener mo128227L7();

    /* renamed from: M7 */
    public void mo128228M7(C93486a aVar) {
        if (aVar == null) {
            Log.m105928w("MicroMsg.FavoriteBaseUI", "handle empty view fail, adapter is null");
            return;
        }
        if (!aVar.isEmpty()) {
            mo128224I7(false);
            mo128225J7(false);
        } else if (mo128223H7()) {
            mo128224I7(true);
            mo128225J7(false);
        } else {
            mo128224I7(false);
            mo128225J7(true);
            mo128231P7();
        }
        boolean isEmpty = aVar.isEmpty();
        boolean bF = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142268bF(aVar.f269991d, aVar.f269992e);
        Log.m105924i("MicroMsg.FavoriteBaseUI", "[handleDataChanged] isEmpty = " + isEmpty + ", hasShowAll = " + bF);
        StringBuilder sb = new StringBuilder();
        sb.append("footerViewsCount = ");
        sb.append(this.f269624h.getFooterViewsCount());
        Log.m105924i("MicroMsg.FavoriteBaseUI", sb.toString());
        if (isEmpty || bF) {
            this.f269624h.removeFooterView(this.f269628o);
        } else if (this.f269624h.getFooterViewsCount() == 0) {
            this.f269624h.addFooterView(this.f269628o);
        }
    }

    /* renamed from: N7 */
    public void mo128229N7() {
        C77075f fVar = new C77075f(getContext());
        this.f269630q = fVar;
        fVar.setCleanFavSpace(this.f269633t);
        this.f269630q.mo107385a(false);
        View view = this.f269630q.f225133e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableFullSizeBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableFullSizeBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f269630q.f225134f;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableNetwarnBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableNetwarnBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105919d("MicroMsg.FavoriteBaseUI", "padding %s, %s", Integer.valueOf(this.f269630q.getPaddingTop()), Integer.valueOf(this.f269630q.getPaddingBottom()));
        this.f269624h.addHeaderView(this.f269630q);
        AppCompatActivity context = getContext();
        if (this.f269639z) {
            this.f269631r = View.inflate(context, C0966R.C0971layout.ajc, (ViewGroup) null);
        } else {
            this.f269631r = View.inflate(context, C0966R.C0971layout.a7e, (ViewGroup) null);
        }
        TextView textView = (TextView) this.f269631r.findViewById(C0966R.C0970id.cwm);
        TextView textView2 = (TextView) this.f269631r.findViewById(C0966R.C0970id.cwk);
        TextView textView3 = (TextView) this.f269631r.findViewById(C0966R.C0970id.cwg);
        TextView textView4 = (TextView) this.f269631r.findViewById(C0966R.C0970id.cwn);
        TextView textView5 = (TextView) this.f269631r.findViewById(C0966R.C0970id.cwi);
        TextView textView6 = (TextView) this.f269631r.findViewById(C0966R.C0970id.eef);
        TextView textView7 = (TextView) this.f269631r.findViewById(C0966R.C0970id.cwf);
        TextView textView8 = (TextView) this.f269631r.findViewById(C0966R.C0970id.cwl);
        TextView textView9 = (TextView) this.f269631r.findViewById(C0966R.C0970id.cwj);
        View.OnClickListener L7 = mo128227L7();
        textView.setOnClickListener(L7);
        textView.setTag(5);
        textView3.setOnClickListener(L7);
        textView3.setTag(21);
        textView4.setOnClickListener(L7);
        textView4.setTag(3);
        textView5.setOnClickListener(L7);
        textView5.setTag(7);
        textView6.setOnClickListener(L7);
        if (this.f269639z) {
            TextView textView10 = (TextView) this.f269631r.findViewById(C0966R.C0970id.eh_);
            textView10.setOnClickListener(L7);
            textView10.setTag(6);
            textView6.setTag(20);
        } else if (this.f269638y) {
            textView6.setTag(20);
        } else {
            textView6.setText(getString(C0966R.string.crm));
            textView6.setTag(6);
        }
        textView7.setOnClickListener(L7);
        textView7.setTag(8);
        textView8.setOnClickListener(L7);
        textView8.setTag(17);
        textView9.setOnClickListener(L7);
        textView9.setTag(18);
        textView2.setOnClickListener(L7);
        textView2.setTag(22);
        this.f269631r.getViewTreeObserver().addOnGlobalLayoutListener(new C68893g(textView3, textView2, textView8));
        this.f269624h.addHeaderView(this.f269631r);
    }

    /* renamed from: O7 */
    public abstract void mo128230O7();

    /* renamed from: P7 */
    public abstract void mo128231P7();

    /* renamed from: Q7 */
    public void mo128232Q7() {
        Log.m105924i("MicroMsg.FavoriteBaseUI", "on storage change, try refresh job");
        this.f269626j.removeCallbacks(this.f269617D);
        this.f269626j.post(this.f269617D);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a7h;
    }

    public void initView() {
        long currentTimeMillis = System.currentTimeMillis();
        ListView listView = (ListView) findViewById(C0966R.C0970id.cxu);
        this.f269624h = listView;
        listView.setDrawingCacheEnabled(false);
        setToTop(new C68891d());
        mo128229N7();
        this.f269628o = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f359671a72, (ViewGroup) null);
        this.f269624h.setOnScrollListener(new C93408e());
        this.f269624h.setOnItemClickListener(this);
        this.f269624h.setOnTouchListener(new C68892f());
        this.f269624h.setAdapter(mo128226K7());
        mo128228M7(mo128226K7());
        Log.m105919d("MicroMsg.FavoriteBaseUI", "init view use %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public void onCreate(Bundle bundle) {
        Class cls = C100718j1.class;
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(bundle);
        C100701c1 Y3 = ((C100718j1) C86312j.m106911c(cls)).mo128208Y3();
        if (Y3 instanceof C102615e) {
            ((C102615e) Y3).f302177e = this.f269638y;
        }
        Log.m105925i("MicroMsg.FavoriteBaseUI", "onCreate MMCore.accHasReady[%b]", Boolean.valueOf(C86709a0.m107522a()));
        C86709a0.m107524d().mo123460f(new C47452q1());
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().add(this.f269619F);
        C86709a0.m107524d().mo123455a(400, this.f269614A);
        C86709a0.m107524d().mo123455a(402, this.f269615B);
        this.f269627n = new MMHandler(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
        this.f269632s = new FavoriteImageServer(getContext(), 64);
        initView();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(8217, (Object) null)) == 0) {
            Log.m105924i("MicroMsg.FavoriteBaseUI", "do init data for first time");
            this.f269622f = true;
            C86709a0.m107524d().mo123460f(new C100731p1(1));
            this.f269635v = System.currentTimeMillis();
            if (this.f269622f) {
                Log.m105924i("MicroMsg.FavoriteBaseUI", "show loading dialog");
                if (mo128226K7() == null || mo128226K7().isEmpty()) {
                    mo128224I7(true);
                }
                mo128225J7(false);
            }
        } else {
            HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
            C86709a0.m107524d().mo123460f(new C100731p1(1));
            this.f269636w = System.currentTimeMillis();
            if (mo128226K7().isEmpty()) {
                mo128224I7(true);
                mo128225J7(false);
                View view = this.f269628o;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "dealWithLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "dealWithLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                mo128224I7(false);
                mo128225J7(false);
            }
        }
        ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
        ((C100718j1) C86312j.m106911c(cls)).C30().run();
        ((C102421x) ((C100718j1) C86312j.m106911c(cls)).th0()).mo142000c();
        ((C102417u) ((C100718j1) C86312j.m106911c(cls)).mo128203Ly()).mo141993c();
        C86709a0.m107525e().postToWorker(new C93407c(this));
        Log.m105919d("MicroMsg.FavoriteBaseUI", "on create use %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public void onDestroy() {
        Class cls = C100718j1.class;
        super.onDestroy();
        Log.m105924i("MicroMsg.FavoriteBaseUI", "[onDestroy]");
        if (((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).f302175d == null) {
            Log.m105920e("MicroMsg.FavoriteBaseUI", "[onDestroy] return getBaseDB is null");
            return;
        }
        this.f269632s.mo128332f();
        this.f269632s = null;
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().remove(this.f269619F);
        C86709a0.m107524d().mo123470p(400, this.f269614A);
        C86709a0.m107524d().mo123470p(402, this.f269615B);
        this.f269627n.quit();
    }

    public void onPause() {
        super.onPause();
        FavoriteNormalAdapter favoriteNormalAdapter = (FavoriteNormalAdapter) mo128226K7();
        favoriteNormalAdapter.f269974E.dead();
        favoriteNormalAdapter.f269975F.dead();
    }

    public void onResume() {
        super.onResume();
        FavoriteNormalAdapter favoriteNormalAdapter = (FavoriteNormalAdapter) mo128226K7();
        favoriteNormalAdapter.f269974E.alive();
        favoriteNormalAdapter.f269975F.alive();
        C87716k.f253994a = 5;
    }
}
