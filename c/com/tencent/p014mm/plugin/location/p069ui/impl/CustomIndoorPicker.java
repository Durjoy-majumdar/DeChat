package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.mapsdk.raster.model.IndoorBuilding;
import com.tencent.mapsdk.raster.model.IndoorLevel;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60897k;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u001d\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/location/ui/impl/CustomIndoorPicker;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "visibility", "Lrx3/b0;", "setVisibility", "L1", "I", "getClickTimes", "()I", "setClickTimes", "(I)V", "clickTimes", "M1", "getShowTimes", "setShowTimes", "showTimes", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "c", "plugin-map_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker */
public final class CustomIndoorPicker extends WxRecyclerView {

    /* renamed from: E1 */
    public TencentMap f346424E1;

    /* renamed from: F1 */
    public String f346425F1;

    /* renamed from: G1 */
    public String f346426G1;

    /* renamed from: H1 */
    public int f346427H1;

    /* renamed from: I1 */
    public String f346428I1;

    /* renamed from: J1 */
    public String f346429J1;

    /* renamed from: K1 */
    public float f346430K1;

    /* renamed from: L1 */
    public int f346431L1;

    /* renamed from: M1 */
    public int f346432M1;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$b */
    public final class C69121b extends C60896i<C69122c> {
        public C69121b() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.d7m;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C69122c cVar2 = (C69122c) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(cVar2, "indoorLevelItem");
            View view = oVar.f44854d;
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.Button");
            Button button = (Button) view;
            CustomIndoorPicker customIndoorPicker = CustomIndoorPicker.this;
            button.setText(cVar2.f198767d.getName());
            C85875k4.m106189j0(button.getPaint(), 0.8f);
            if (cVar2.f198767d.getName().equals(customIndoorPicker.f346429J1)) {
                button.setBackgroundResource(C0966R.C0969drawable.f357143cp2);
                button.setTextColor(button.getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
                return;
            }
            button.setBackground((Drawable) null);
            button.setTextColor(button.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$c */
    public final class C69122c implements C9493c {

        /* renamed from: d */
        public IndoorLevel f198767d;

        public C69122c(CustomIndoorPicker customIndoorPicker, IndoorLevel indoorLevel) {
            C87412m.m108594g(indoorLevel, FirebaseAnalytics.C113379b.LEVEL);
            this.f198767d = indoorLevel;
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        public long getItemId() {
            return (long) hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$a */
    public interface C115525a {
        void onChange();
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$d */
    public static final class C115526d implements TencentMap.OnIndoorStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ CustomIndoorPicker f346433a;

        /* renamed from: b */
        public final /* synthetic */ TencentMap f346434b;

        /* renamed from: c */
        public final /* synthetic */ C115525a f346435c;

        /* renamed from: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$d$b */
        public static final class C105449b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ CustomIndoorPicker f313524d;

            /* renamed from: e */
            public final /* synthetic */ IndoorBuilding f313525e;

            /* renamed from: f */
            public final /* synthetic */ List<IndoorLevel> f313526f;

            public C105449b(CustomIndoorPicker customIndoorPicker, IndoorBuilding indoorBuilding, List<IndoorLevel> list) {
                this.f313524d = customIndoorPicker;
                this.f313525e = indoorBuilding;
                this.f313526f = list;
            }

            public final void run() {
                int i;
                CustomIndoorPicker customIndoorPicker = this.f313524d;
                RecyclerView.LayoutManager layoutManager = customIndoorPicker.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                if (((LinearLayoutManager) layoutManager).mo17004z() < this.f313525e.getActiveLevelIndex() || this.f313525e.getActiveLevelIndex() <= 0) {
                    RecyclerView.LayoutManager layoutManager2 = this.f313524d.getLayoutManager();
                    C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    i = (((LinearLayoutManager) layoutManager2).mo16958D() > this.f313525e.getActiveLevelIndex() || this.f313525e.getActiveLevelIndex() >= this.f313526f.size() + -1) ? this.f313525e.getActiveLevelIndex() : this.f313525e.getActiveLevelIndex() + 1;
                } else {
                    i = this.f313525e.getActiveLevelIndex() - 1;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(customIndoorPicker, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/CustomIndoorPicker$bind$1$onIndoorLevelActivated$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                customIndoorPicker.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(customIndoorPicker, "com/tencent/mm/plugin/location/ui/impl/CustomIndoorPicker$bind$1$onIndoorLevelActivated$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$d$a */
        public static final class C115527a implements C60897k<C69122c> {

            /* renamed from: a */
            public final /* synthetic */ TencentMap f346436a;

            /* renamed from: b */
            public final /* synthetic */ CustomIndoorPicker f346437b;

            public C115527a(TencentMap tencentMap, CustomIndoorPicker customIndoorPicker) {
                this.f346436a = tencentMap;
                this.f346437b = customIndoorPicker;
            }

            /* renamed from: a */
            public boolean mo2039a(View view, C9493c cVar, int i) {
                C60897k.C9501a.m9192a(this, view, (C69122c) cVar, i);
                return false;
            }

            /* renamed from: b */
            public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
                C60897k.C9501a.m9193b(this, view, motionEvent, (C69122c) cVar, i);
                return false;
            }

            /* renamed from: c */
            public void mo2041c(View view, C9493c cVar, int i) {
                C87412m.m108594g(view, "itemView");
                C87412m.m108594g((C69122c) cVar, "data");
                this.f346436a.setIndoorFloor(i);
                CustomIndoorPicker customIndoorPicker = this.f346437b;
                customIndoorPicker.setClickTimes(customIndoorPicker.getClickTimes() + 1);
            }
        }

        public C115526d(CustomIndoorPicker customIndoorPicker, TencentMap tencentMap, C115525a aVar) {
            this.f346433a = customIndoorPicker;
            this.f346434b = tencentMap;
            this.f346435c = aVar;
        }

        public boolean onIndoorBuildingDeactivated() {
            Log.m105925i("MicroMsg.CustomIndoorPicker", "onIndoorBuildingDeactivated, lat, lng(%s)", this.f346434b.getMapCenter());
            CustomIndoorPicker customIndoorPicker = this.f346433a;
            customIndoorPicker.f346427H1 = 0;
            customIndoorPicker.f346428I1 = null;
            customIndoorPicker.f346429J1 = null;
            customIndoorPicker.setVisibility(8);
            return false;
        }

        public boolean onIndoorBuildingFocused() {
            Log.m105924i("MicroMsg.CustomIndoorPicker", "onIndoorBuildingFocused");
            this.f346433a.f346427H1 = 1;
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c7  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onIndoorLevelActivated(com.tencent.mapsdk.raster.model.IndoorBuilding r9) {
            /*
                r8 = this;
                java.lang.String r0 = "building"
                gy3.C87412m.m108594g(r9, r0)
                java.util.List r0 = r9.getLevels()
                java.lang.String r1 = r9.getBuidlingId()
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r2 = r8.f346433a
                java.lang.String r2 = r2.f346428I1
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 != 0) goto L_0x0081
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                java.lang.String r3 = r9.getBuidlingId()
                r1.f346428I1 = r3
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                r1.getClass()
                java.util.List r3 = r9.getLevels()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.lang.String r5 = "levels"
                gy3.C87412m.m108593f(r3, r5)
                java.util.Iterator r3 = r3.iterator()
            L_0x0037:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0051
                java.lang.Object r5 = r3.next()
                com.tencent.mapsdk.raster.model.IndoorLevel r5 = (com.tencent.mapsdk.raster.model.IndoorLevel) r5
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$c r6 = new com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$c
                java.lang.String r7 = "it"
                gy3.C87412m.m108593f(r5, r7)
                r6.<init>(r1, r5)
                r4.add(r6)
                goto L_0x0037
            L_0x0051:
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$buildItemConverts$1 r3 = new com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$buildItemConverts$1
                r3.<init>(r1)
                com.tencent.mm.plugin.location.ui.impl.e r5 = new com.tencent.mm.plugin.location.ui.impl.e
                r5.<init>(r4, r3)
                r1.setAdapter(r5)
                float r3 = r1.f346430K1
                r4 = 1101004800(0x41a00000, float:20.0)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 > 0) goto L_0x0069
                r1.setVisibility(r2)
            L_0x0069:
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker.IndoorLevelItem>"
                gy3.C87412m.m108592e(r1, r3)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$d$a r3 = new com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$d$a
                com.tencent.tencentmap.mapsdk.map.TencentMap r4 = r8.f346434b
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r5 = r8.f346433a
                r3.<init>(r4, r5)
                r1.f165746y = r3
            L_0x0081:
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                java.lang.String r3 = r1.f346428I1
                java.lang.String r1 = r1.f346425F1
                boolean r1 = gy3.C87412m.m108589b(r3, r1)
                if (r1 == 0) goto L_0x00a1
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                java.lang.String r3 = r1.f346429J1
                if (r3 != 0) goto L_0x00a1
                java.lang.String r3 = r1.f346426G1
                if (r3 == 0) goto L_0x00a1
                r1.f346429J1 = r3
                com.tencent.tencentmap.mapsdk.map.TencentMap r4 = r8.f346434b
                java.lang.String r1 = r1.f346428I1
                r4.setIndoorFloor(r1, r3)
                goto L_0x00c3
            L_0x00a1:
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L_0x00c3
                int r1 = r9.getActiveLevelIndex()
                int r3 = r0.size()
                if (r1 >= r3) goto L_0x00c3
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                int r3 = r9.getActiveLevelIndex()
                java.lang.Object r3 = r0.get(r3)
                com.tencent.mapsdk.raster.model.IndoorLevel r3 = (com.tencent.mapsdk.raster.model.IndoorLevel) r3
                java.lang.String r3 = r3.getName()
                r1.f346429J1 = r3
            L_0x00c3:
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$a r1 = r8.f346435c
                if (r1 == 0) goto L_0x00ca
                r1.onChange()
            L_0x00ca:
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
                if (r1 == 0) goto L_0x00d5
                r1.notifyDataSetChanged()
            L_0x00d5:
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$d$b r3 = new com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$d$b
                r3.<init>(r1, r9, r0)
                r4 = 200(0xc8, double:9.9E-322)
                r1.postDelayed(r3, r4)
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r9
                r9 = 1
                com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker r1 = r8.f346433a
                java.lang.String r1 = r1.f346429J1
                r0[r9] = r1
                r9 = 2
                com.tencent.tencentmap.mapsdk.map.TencentMap r1 = r8.f346434b
                com.tencent.mapsdk.raster.model.LatLng r1 = r1.getMapCenter()
                r0[r9] = r1
                java.lang.String r9 = "MicroMsg.CustomIndoorPicker"
                java.lang.String r1 = "onIndoorLevelActivated: %s, poiFloor:%s, lat,lng:(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.CustomIndoorPicker.C115526d.onIndoorLevelActivated(com.tencent.mapsdk.raster.model.IndoorBuilding):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$e */
    public static final class C115528e implements TencentMap.OnScaleViewChangedListener {

        /* renamed from: a */
        public final /* synthetic */ CustomIndoorPicker f346438a;

        public C115528e(CustomIndoorPicker customIndoorPicker) {
            this.f346438a = customIndoorPicker;
        }

        public void onScaleViewChanged(float f) {
            CustomIndoorPicker customIndoorPicker = this.f346438a;
            customIndoorPicker.f346430K1 = f;
            if (f > 20.0f || customIndoorPicker.f346428I1 == null || customIndoorPicker.f346429J1 == null) {
                customIndoorPicker.setVisibility(8);
            } else {
                customIndoorPicker.setVisibility(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomIndoorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    public final int getClickTimes() {
        return this.f346431L1;
    }

    public final int getShowTimes() {
        return this.f346432M1;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C76577a.m92151b(getContext(), 200), Integer.MIN_VALUE));
    }

    public final void setClickTimes(int i) {
        this.f346431L1 = i;
    }

    public final void setShowTimes(int i) {
        this.f346432M1 = i;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f346432M1++;
        }
    }

    /* renamed from: x1 */
    public final void mo175534x1(com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap, C115525a aVar) {
        C87412m.m108594g(tencentMap, "tencentMap");
        this.f346424E1 = tencentMap;
        tencentMap.setOnIndoorStateChangeListener(new C115526d(this, tencentMap, aVar));
        tencentMap.setOnScaleViewChangedListener(new C115528e(this));
    }

    /* renamed from: y1 */
    public final void mo175535y1(String str, String str2) {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap;
        this.f346425F1 = str;
        this.f346426G1 = str2;
        if (this.f346427H1 == 1 && C87412m.m108589b(this.f346428I1, str) && (tencentMap = this.f346424E1) != null) {
            tencentMap.setIndoorFloor(this.f346425F1, this.f346426G1);
        }
    }
}
