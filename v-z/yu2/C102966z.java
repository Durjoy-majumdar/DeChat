package yu2;

import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import it2.C9257a;

/* renamed from: yu2.z */
public final class C102966z extends C9257a {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f303858d;

    /* renamed from: yu2.z$a */
    public static final class C102967a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerUI f303859d;

        public C102967a(SnsAlbumPickerUI snsAlbumPickerUI) {
            this.f303859d = snsAlbumPickerUI;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2$onLoadMore$1");
            SnsAlbumPickerUI snsAlbumPickerUI = this.f303859d;
            int i = SnsAlbumPickerUI.f280763B;
            SnsMethodCalculate.markStartTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            C5431p1.C5432a aVar = snsAlbumPickerUI.f280767f;
            SnsMethodCalculate.markEndTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            if (aVar == null) {
                SnsAlbumPickerUI snsAlbumPickerUI2 = this.f303859d;
                C5431p1.C5432a dy02 = C94866e1.dy0();
                SnsMethodCalculate.markStartTimeMs("access$setMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                snsAlbumPickerUI2.f280767f = dy02;
                SnsMethodCalculate.markEndTimeMs("access$setMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            }
            SnsAlbumPickerUI snsAlbumPickerUI3 = this.f303859d;
            SnsMethodCalculate.markStartTimeMs("access$getMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            boolean z = snsAlbumPickerUI3.f280766e;
            SnsMethodCalculate.markEndTimeMs("access$getMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            if (!z && SnsAlbumPickerUI.m123170J7(this.f303859d)) {
                SnsAlbumPickerUI.m123168H7(this.f303859d);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2$onLoadMore$1");
        }
    }

    public C102966z(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303858d = snsAlbumPickerUI;
    }

    /* renamed from: a */
    public void mo10033a() {
        SnsMethodCalculate.markStartTimeMs("onLoadMore", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2");
        SnsAlbumPickerUI.m123169I7(this.f303858d).post(new C102967a(this.f303858d));
        SnsMethodCalculate.markEndTimeMs("onLoadMore", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r7, int r8) {
        /*
            r6 = this;
            java.lang.String r8 = "onScrollStateChanged"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r0)
            java.lang.String r1 = "recyclerView"
            gy3.C87412m.m108594g(r7, r1)
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI r1 = r6.f303858d
            boolean r2 = com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI.m123170J7(r1)
            r3 = 1
            if (r2 == 0) goto L_0x002a
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI r2 = r6.f303858d
            java.lang.String r4 = "access$getMIsDataFetching$p"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            boolean r2 = r2.f280766e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r2 != 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            r1.setBounceEnabled(r2)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"
            gy3.C87412m.m108592e(r7, r1)
            androidx.recyclerview.widget.GridLayoutManager r7 = (androidx.recyclerview.widget.GridLayoutManager) r7
            int r1 = r7.mo16958D()
            int r7 = r7.getItemCount()
            int r7 = r7 - r3
            if (r1 != r7) goto L_0x0048
            r6.mo10033a()
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yu2.C102966z.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }
}
