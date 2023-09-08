package com.tencent.p014mm.plugin.appbrand.p026ui.collection;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81522q0;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.report.C84243v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import mu3.C109639a;
import nj3.C76879j;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64186f0;
import xr0.C15880l;
import xr0.C66415a;
import xr0.C78968b;
import xr0.C78970e;
import xr0.C91325c;
import xr0.C91326d;
import xr0.C91331k;
import xr0.C91332m;
import zr0.C91931a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "Lxr0/m$a;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList */
public final class AppBrandCollectionDisplayVerticalList extends AppBrandLauncherUI.Fragment implements C91332m.C91333a {

    /* renamed from: t */
    public static final /* synthetic */ int f246623t = 0;

    /* renamed from: h */
    public RecyclerView f246624h;

    /* renamed from: i */
    public C91331k f246625i;

    /* renamed from: j */
    public boolean f246626j;

    /* renamed from: n */
    public MMHandler f246627n;

    /* renamed from: o */
    public boolean f246628o;

    /* renamed from: p */
    public final C13601g f246629p = C36568h.m40985a(new C68648g(this));

    /* renamed from: q */
    public final C13601g f246630q = C36568h.m40985a(new C84510h(this));

    /* renamed from: r */
    public final MStorage.IOnStorageChange f246631r = new C84504a(this);

    /* renamed from: s */
    public final MStorage.IOnStorageChange f246632s = new C84505b(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$d */
    public static final class C68647d implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionDisplayVerticalList f197198d;

        public C68647d(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
            this.f197198d = appBrandCollectionDisplayVerticalList;
        }

        public final boolean onLongClick(View view) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList$onActivityCreated$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (C78970e.m95478a()) {
                AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f197198d;
                int i = AppBrandCollectionDisplayVerticalList.f246623t;
                if (appBrandCollectionDisplayVerticalList.getContext() != null) {
                    C76879j.m92720N(appBrandCollectionDisplayVerticalList.getContext(), "!TEST!\n输入小程序username添加到「我的小程序」", "", "", Integer.MAX_VALUE, new C78968b(appBrandCollectionDisplayVerticalList));
                }
                z = true;
            } else {
                z = false;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList$onActivityCreated$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$g */
    public static final class C68648g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionDisplayVerticalList f197199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68648g(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
            super(0);
            this.f197199d = appBrandCollectionDisplayVerticalList;
        }

        public Object invoke() {
            Intent intent;
            FragmentActivity activity = this.f197199d.getActivity();
            int i = 3;
            if (!(activity == null || (intent = activity.getIntent()) == null)) {
                int intExtra = intent.getIntExtra("extra_get_usage_reason", 8);
                int intExtra2 = intent.getIntExtra("extra_get_usage_prescene", 0);
                if (intExtra == 7) {
                    i = 8;
                } else if (intExtra == 8 && intExtra2 == 2) {
                    i = 6;
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$a */
    public static final class C84504a implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionDisplayVerticalList f246633d;

        public C84504a(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
            this.f246633d = appBrandCollectionDisplayVerticalList;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (C87412m.m108589b(MStorageEventData.EventType.BATCH, str) && 3 == mStorageEventData.eventId && (mStorageEventData.obj instanceof Long)) {
                AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f246633d;
                int i = AppBrandCollectionDisplayVerticalList.f246623t;
                appBrandCollectionDisplayVerticalList.mo117181R(true, C66415a.f191159d);
                return;
            }
            AppBrandCollectionDisplayVerticalList.m104090P(this.f246633d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$b */
    public static final class C84505b implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionDisplayVerticalList f246634d;

        public C84505b(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
            this.f246634d = appBrandCollectionDisplayVerticalList;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            AppBrandCollectionDisplayVerticalList.m104090P(this.f246634d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$c */
    public static final class C84506c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionDisplayVerticalList f246635d;

        public C84506c(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
            this.f246635d = appBrandCollectionDisplayVerticalList;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f246635d.getActivity() == null) {
                return true;
            }
            int i = AppBrandCollectionSortUI.f108924d;
            FragmentActivity activity = this.f246635d.getActivity();
            C87412m.m108591d(activity);
            C91331k kVar = this.f246635d.f246625i;
            C87412m.m108591d(kVar);
            ArrayList<LocalUsageInfo> arrayList = kVar.f261958d;
            int intValue = ((Number) ((C36570n) this.f246635d.f246629p).getValue()).intValue();
            String str = (String) ((C36570n) this.f246635d.f246630q).getValue();
            C87412m.m108594g(arrayList, "dataList");
            C87412m.m108594g(str, "operateReportSceneId");
            Intent intent = new Intent(activity, AppBrandCollectionSortUI.class);
            intent.putExtra("KEY_SORT_DATA_LIST", arrayList);
            intent.putExtra("KEY_OPERATE_REPORT_SCENE", intValue);
            intent.putExtra("KEY_OPERATE_REPORT_SCENE_ID", str);
            intent.addFlags(0);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI$Companion", "startSortList", "(Landroid/content/Context;Ljava/util/ArrayList;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI$Companion", "startSortList", "(Landroid/content/Context;Ljava/util/ArrayList;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.overridePendingTransition(C0966R.C0968anim.f2328p, C0966R.C0968anim.f2333y);
            this.f246635d.f246626j = true;
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$e */
    public static final class C84507e extends C87413o implements C32224a<Runnable> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionDisplayVerticalList f246636d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84507e(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
            super(0);
            this.f246636d = appBrandCollectionDisplayVerticalList;
        }

        public Object invoke() {
            return new C84517a(this.f246636d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$f */
    public static final class C84508f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionDisplayVerticalList f246637d;

        /* renamed from: e */
        public final /* synthetic */ boolean f246638e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<Runnable> f246639f;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$f$a */
        public static final class C84509a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ List<LocalUsageInfo> f246640d;

            /* renamed from: e */
            public final /* synthetic */ AppBrandCollectionDisplayVerticalList f246641e;

            /* renamed from: f */
            public final /* synthetic */ boolean f246642f;

            /* renamed from: g */
            public final /* synthetic */ C32224a<Runnable> f246643g;

            public C84509a(List<? extends LocalUsageInfo> list, AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList, boolean z, C32224a<? extends Runnable> aVar) {
                this.f246640d = list;
                this.f246641e = appBrandCollectionDisplayVerticalList;
                this.f246642f = z;
                this.f246643g = aVar;
            }

            public final void run() {
                if (this.f246640d.isEmpty()) {
                    FragmentActivity activity = this.f246641e.getActivity();
                    C91931a aVar = activity instanceof C91931a ? (C91931a) activity : null;
                    if (aVar != null) {
                        aVar.mo117057A2(false);
                    }
                } else {
                    C91331k kVar = this.f246641e.f246625i;
                    C87412m.m108591d(kVar);
                    List<LocalUsageInfo> list = this.f246640d;
                    C87412m.m108594g(list, "list");
                    synchronized (kVar.f261958d) {
                        kVar.f261958d.clear();
                        kVar.f261958d.addAll(list);
                    }
                    if (this.f246642f) {
                        C91331k kVar2 = this.f246641e.f246625i;
                        C87412m.m108591d(kVar2);
                        kVar2.notifyItemRangeChanged(0, this.f246640d.size());
                    } else {
                        C91331k kVar3 = this.f246641e.f246625i;
                        C87412m.m108591d(kVar3);
                        kVar3.notifyItemRangeInserted(0, this.f246640d.size());
                    }
                }
                Runnable invoke = this.f246643g.invoke();
                if (invoke != null) {
                    invoke.run();
                }
            }
        }

        public C84508f(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList, boolean z, C32224a<? extends Runnable> aVar) {
            this.f246637d = appBrandCollectionDisplayVerticalList;
            this.f246638e = z;
            this.f246639f = aVar;
        }

        public final void run() {
            AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f246637d;
            int i = AppBrandCollectionDisplayVerticalList.f246623t;
            List<LocalUsageInfo> Q = appBrandCollectionDisplayVerticalList.mo117180Q();
            AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList2 = this.f246637d;
            appBrandCollectionDisplayVerticalList2.mo117067N(new C84509a(Q, appBrandCollectionDisplayVerticalList2, this.f246638e, this.f246639f));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList$h */
    public static final class C84510h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionDisplayVerticalList f246644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84510h(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
            super(0);
            this.f246644d = appBrandCollectionDisplayVerticalList;
        }

        public Object invoke() {
            int intValue = ((Number) ((C36570n) this.f246644d.f246629p).getValue()).intValue();
            if (intValue != 6 && intValue != 7 && intValue != 8) {
                return C84243v.m103851a();
            }
            String str = C84243v.f246076b;
            C87412m.m108591d(str);
            return str;
        }
    }

    /* renamed from: P */
    public static final void m104090P(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        ArrayList arrayList;
        C91331k kVar = appBrandCollectionDisplayVerticalList.f246625i;
        if (kVar != null) {
            synchronized (kVar.f261958d) {
                arrayList = new ArrayList(kVar.f261958d.size());
                arrayList.addAll(kVar.f261958d);
            }
            List<LocalUsageInfo> Q = appBrandCollectionDisplayVerticalList.mo117180Q();
            ArrayList arrayList2 = (ArrayList) Q;
            if (arrayList2.isEmpty()) {
                appBrandCollectionDisplayVerticalList.mo117067N(new C91325c(appBrandCollectionDisplayVerticalList));
                return;
            }
            try {
                appBrandCollectionDisplayVerticalList.mo117067N(new C91326d(appBrandCollectionDisplayVerticalList, Q, C54248l.m60949a(new C81522q0(arrayList, Q), true)));
            } catch (NullPointerException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandCollectionDisplayVerticalList", e, "calculateDiff, oldList.size=" + arrayList.size() + ", newList.size=" + arrayList2.size(), new Object[0]);
                if (WeChatEnvironment.hasDebugger()) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: L */
    public void mo117065L() {
        RecyclerView recyclerView = this.f246624h;
        if (recyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: Q */
    public final List<LocalUsageInfo> mo117180Q() {
        Iterable pM = ((C68585h1) C86312j.m106911c(C68585h1.class)).mo94245pM(Integer.MAX_VALUE, C68585h1.C68586a.DESC);
        if (pM == null) {
            pM = C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : pM) {
            if (((LocalUsageInfo) next) != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public final void mo117181R(boolean z, C32224a<? extends Runnable> aVar) {
        C84508f fVar = new C84508f(this, z, aVar);
        MMHandler mMHandler = this.f246627n;
        C87412m.m108591d(mMHandler);
        if (C87412m.m108589b(mMHandler.getSerialTag(), C109639a.m148954e())) {
            fVar.run();
            return;
        }
        MMHandler mMHandler2 = this.f246627n;
        C87412m.m108591d(mMHandler2);
        mMHandler2.postToWorker(fVar);
    }

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
        FragmentActivity activity = getActivity();
        C87412m.m108591d(activity);
        RecyclerView recyclerView = new RecyclerView(activity, (AttributeSet) null);
        recyclerView.setLayoutManager(new AppBrandCollectionDisplayVerticalList$initView$1$1(getActivity()));
        C91331k kVar = new C91331k(new ArrayList(), this);
        this.f246625i = kVar;
        recyclerView.setAdapter(kVar);
        recyclerView.setBackgroundColor(recyclerView.getContext().getResources().getColor(C0966R.color.f3284m6));
        recyclerView.mo17085h0(new C15880l());
        recyclerView.setItemAnimator((RecyclerView.C16616j) null);
        this.f246624h = recyclerView;
        View view = this.f246391g;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        RecyclerView recyclerView2 = this.f246624h;
        C87412m.m108591d(recyclerView2);
        ((FrameLayout) view).addView(recyclerView2, new FrameLayout.LayoutParams(-1, -2));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.addTextOptionMenu(0, getString(C0966R.string.f7880uu), new C84506c(this), new C68647d(this), MMActivityController.C73075r.BLACK);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        ((C81500i0) C81161g2.Bx0(C81500i0.class)).remove(this.f246631r);
        C81161g2.Cx0().remove(this.f246632s);
        MMHandler mMHandler = this.f246627n;
        if (mMHandler != null) {
            mMHandler.quit();
        }
    }

    public void onEnter() {
        this.f246628o = true;
    }

    public void onResume() {
        super.onResume();
        if (this.f246626j) {
            mo117181R(true, C66415a.f191159d);
            this.f246626j = false;
        }
        if (this.f246628o) {
            C84240s.m103842h(2, "");
            this.f246628o = false;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        this.f246627n = new MMHandler("AppBrandLauncherCollectionList");
        mo117181R(false, new C84507e(this));
    }
}
