package com.tencent.p014mm.plugin.appbrand.p026ui.collection;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListAdapter;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView;
import com.tencent.p014mm.plugin.appbrand.appusage.C40434o0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81470c;
import com.tencent.p014mm.plugin.appbrand.appusage.C81488g;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.report.C84243v;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import xr0.C91327f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionVerticalSortList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList */
public final class AppBrandCollectionVerticalSortList extends AppBrandLauncherUI.Fragment {

    /* renamed from: j */
    public static final /* synthetic */ int f246645j = 0;

    /* renamed from: h */
    public DragSortListView f246646h;

    /* renamed from: i */
    public C91327f f246647i;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$a */
    public static final class C84511a implements DragSortListView.C85983j {

        /* renamed from: a */
        public final /* synthetic */ AppBrandCollectionVerticalSortList f246648a;

        public C84511a(AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
            this.f246648a = appBrandCollectionVerticalSortList;
        }

        /* renamed from: b */
        public final void mo81248b(int i, int i2) {
            C91327f fVar;
            C91327f fVar2 = this.f246648a.f246647i;
            if (fVar2 != null) {
                LocalUsageInfo localUsageInfo = (LocalUsageInfo) fVar2.getItem(i);
                fVar2.remove(localUsageInfo);
                if (localUsageInfo != null && (fVar = this.f246648a.f246647i) != null) {
                    fVar.insert(localUsageInfo, i2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$b */
    public static final class C84512b implements DragSortListView.C85984n {

        /* renamed from: a */
        public final /* synthetic */ AppBrandCollectionVerticalSortList f246649a;

        public C84512b(AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
            this.f246649a = appBrandCollectionVerticalSortList;
        }

        public final void remove(int i) {
            C91327f fVar = this.f246649a.f246647i;
            if (fVar != null) {
                fVar.remove((LocalUsageInfo) fVar.getItem(i));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$c */
    public static final class C84513c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionVerticalSortList f246650d;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$c$a */
        public static final class C84514a extends C81488g.C81490b {

            /* renamed from: a */
            public final /* synthetic */ AppBrandCollectionVerticalSortList f246651a;

            public C84514a(AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
                this.f246651a = appBrandCollectionVerticalSortList;
            }

            /* renamed from: b */
            public void mo113778b(LocalUsageInfo localUsageInfo) {
                C87412m.m108594g(localUsageInfo, "info");
                Bundle arguments = this.f246651a.getArguments();
                int i = arguments != null ? arguments.getInt("KEY_OPERATE_REPORT_SCENE") : 0;
                Bundle arguments2 = this.f246651a.getArguments();
                C84243v.m103852b(localUsageInfo, 7, i, arguments2 != null ? arguments2.getString("KEY_OPERATE_REPORT_SCENE_ID") : null);
            }

            /* renamed from: c */
            public void mo113779c(LocalUsageInfo localUsageInfo) {
                C87412m.m108594g(localUsageInfo, "info");
                Bundle arguments = this.f246651a.getArguments();
                int i = arguments != null ? arguments.getInt("KEY_OPERATE_REPORT_SCENE") : 0;
                Bundle arguments2 = this.f246651a.getArguments();
                C84243v.m103852b(localUsageInfo, 6, i, arguments2 != null ? arguments2.getString("KEY_OPERATE_REPORT_SCENE_ID") : null);
            }

            /* renamed from: d */
            public void mo113787d() {
                Log.m105924i("MicroMsg.AppBrandCollectionVerticalSortList", "[collection]reorder callback entered");
                ((C81470c) C86312j.m106911c(C81470c.class)).yx0(C40434o0.C40435a.CloseCollectionList);
                FragmentActivity activity = this.f246651a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        public C84513c(AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
            this.f246650d = appBrandCollectionVerticalSortList;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C7335d c = C86312j.m106911c(C81488g.class);
            C87412m.m108593f(c, "getService(AppBrandColle…torageExport::class.java)");
            ((C81488g) c).requireAccountInitialized();
            C81488g gVar = C81488g.f239086e;
            C87412m.m108591d(gVar);
            C91327f fVar = this.f246650d.f246647i;
            C87412m.m108591d(fVar);
            gVar.wx0(fVar.f261949d, new C84514a(this.f246650d), false);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$d */
    public static final class C84515d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandCollectionVerticalSortList f246652d;

        public C84515d(AppBrandCollectionVerticalSortList appBrandCollectionVerticalSortList) {
            this.f246652d = appBrandCollectionVerticalSortList;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FragmentActivity activity = this.f246652d.getActivity();
            if (activity == null) {
                return true;
            }
            activity.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6393dm;
    }

    public void initView() {
        DragSortListView dragSortListView = (DragSortListView) this.f246391g.findViewById(16908298);
        this.f246646h = dragSortListView;
        if (dragSortListView != null) {
            dragSortListView.setDropListener(new C84511a(this));
        }
        DragSortListView dragSortListView2 = this.f246646h;
        if (dragSortListView2 != null) {
            dragSortListView2.setRemoveListener(new C84512b(this));
        }
        FragmentActivity activity = getActivity();
        C87412m.m108591d(activity);
        Bundle arguments = getArguments();
        C87412m.m108591d(arguments);
        ArrayList parcelableArrayList = arguments.getParcelableArrayList("KEY_SORT_DATA_LIST");
        C87412m.m108591d(parcelableArrayList);
        C91327f fVar = new C91327f(activity, parcelableArrayList);
        this.f246647i = fVar;
        DragSortListView dragSortListView3 = this.f246646h;
        C87412m.m108591d(dragSortListView3);
        fVar.f261950e = dragSortListView3;
        dragSortListView3.setAdapter((ListAdapter) fVar);
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onActivityCreated(r9)
            androidx.fragment.app.FragmentActivity r9 = r8.getActivity()
            boolean r0 = r9 instanceof com.tencent.p014mm.p136ui.MMActivity
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.tencent.mm.ui.MMActivity r9 = (com.tencent.p014mm.p136ui.MMActivity) r9
            r2 = r9
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            if (r2 == 0) goto L_0x0026
            r3 = 0
            r9 = 2131821359(0x7f11032f, float:1.9275459E38)
            java.lang.String r4 = r8.getString(r9)
            com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$c r5 = new com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$c
            r5.<init>(r8)
            r6 = 0
            com.tencent.mm.ui.MMActivityController$r r7 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.BLACK
            r2.addTextOptionMenu(r3, r4, r5, r6, r7)
        L_0x0026:
            androidx.fragment.app.FragmentActivity r9 = r8.getActivity()
            boolean r0 = r9 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x0031
            r1 = r9
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
        L_0x0031:
            if (r1 == 0) goto L_0x003e
            com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$d r9 = new com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionVerticalSortList$d
            r9.<init>(r8)
            r0 = 2131755025(0x7f100011, float:1.9140918E38)
            r1.setBackBtn(r9, r0)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.collection.AppBrandCollectionVerticalSortList.onActivityCreated(android.os.Bundle):void");
    }
}
