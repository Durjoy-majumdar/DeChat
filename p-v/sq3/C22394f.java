package sq3;

import android.view.ViewGroup;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import mq3.C21524b;

/* renamed from: sq3.f */
public final class C22394f {

    /* renamed from: a */
    public final WxRefreshLayout f63492a;

    /* renamed from: b */
    public final C22386a f63493b;

    /* renamed from: c */
    public C21524b f63494c;

    public C22394f(WxRefreshLayout wxRefreshLayout, C22386a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
        C87412m.m108594g(wxRefreshLayout, "layout");
        C87412m.m108594g(aVar, "stateCenter");
        C87412m.m108594g(marginLayoutParams, "defaultMarginLP");
        this.f63492a = wxRefreshLayout;
        this.f63493b = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0224, code lost:
        if (r19 == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x030d, code lost:
        if (r19 == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r2 = r2.f56665f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35542a(int r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            mq3.b r2 = r0.f63494c
            r8 = 0
            java.lang.String r9 = "cValues"
            if (r2 == 0) goto L_0x0378
            int r2 = r2.f60959b
            r10 = 1
            r11 = 0
            if (r2 != r1) goto L_0x002e
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            oq3.g r3 = r2.f56664e
            if (r3 == 0) goto L_0x001d
            boolean r3 = r3.mo34227f()
            if (r3 != 0) goto L_0x0028
        L_0x001d:
            oq3.g r2 = r2.f56665f
            if (r2 == 0) goto L_0x002a
            boolean r2 = r2.mo34227f()
            if (r2 != 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r2 == 0) goto L_0x002e
            return
        L_0x002e:
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x0374
            int r12 = r2.f60959b
            r2.f60959b = r1
            r13 = 1092616192(0x41200000, float:10.0)
            if (r19 == 0) goto L_0x0113
            sq3.a r2 = r0.f63493b
            rq3.b r2 = r2.f63471c
            boolean r3 = r2.f63046f
            if (r3 != 0) goto L_0x0046
            boolean r2 = r2.f63047g
            if (r2 == 0) goto L_0x0113
        L_0x0046:
            float r2 = (float) r1
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            float r3 = r3.f60984d
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x0067
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            int r3 = r3.f60981a
            float r3 = (float) r3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r0.f63492a
            mq3.d r4 = r4.getHeaderConfig()
            float r4 = r4.f60984d
            float r3 = r3 * r4
            goto L_0x006f
        L_0x0067:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            float r3 = r3.f60984d
        L_0x006f:
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a5
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x00a1
            boolean r2 = r2.f60976s
            if (r2 != 0) goto L_0x0098
            if (r20 != 0) goto L_0x0098
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.a r2 = r2.getCommonConfig()
            boolean r2 = r2.f126541c
            if (r2 == 0) goto L_0x0098
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            r3 = 2
            r2.performHapticFeedback(r11, r3)
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x0094
            r2.f60976s = r10
            goto L_0x0098
        L_0x0094:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0098:
            sq3.a r2 = r0.f63493b
            rq3.b r3 = rq3.C22243b.ReleaseToRefresh
            r2.mo35533e(r3)
            goto L_0x0113
        L_0x00a1:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x00a5:
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x010f
            int r2 = r2.f60959b
            int r2 = -r2
            float r2 = (float) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.c r3 = r3.getFooterConfig()
            float r3 = r3.f174986d
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x00cd
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.c r3 = r3.getFooterConfig()
            int r3 = r3.f174983a
            float r3 = (float) r3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r0.f63492a
            mq3.c r4 = r4.getFooterConfig()
            float r4 = r4.f174986d
            float r3 = r3 * r4
            goto L_0x00d5
        L_0x00cd:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.c r3 = r3.getFooterConfig()
            float r3 = r3.f174986d
        L_0x00d5:
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ed
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x00e9
            boolean r2 = r2.f60979v
            if (r2 != 0) goto L_0x00ed
            sq3.a r2 = r0.f63493b
            rq3.b r3 = rq3.C22243b.ReleaseToLoad
            r2.mo35533e(r3)
            goto L_0x0113
        L_0x00e9:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x00ed:
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x010b
            int r3 = r2.f60959b
            if (r3 >= 0) goto L_0x0101
            boolean r2 = r2.f60979v
            if (r2 != 0) goto L_0x0101
            sq3.a r2 = r0.f63493b
            rq3.b r3 = rq3.C22243b.PullUpToLoad
            r2.mo35533e(r3)
            goto L_0x0113
        L_0x0101:
            if (r3 <= 0) goto L_0x0113
            sq3.a r2 = r0.f63493b
            rq3.b r3 = rq3.C22243b.PullDownToRefresh
            r2.mo35533e(r3)
            goto L_0x0113
        L_0x010b:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x010f:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0113:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            oq3.b r2 = r2.getContentView()
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            oq3.c r14 = r3.getLoadMoreFooter()
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            oq3.d r15 = r3.getRefreshHeader()
            if (r2 == 0) goto L_0x019f
            if (r1 < 0) goto L_0x013e
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.a r4 = r3.getCommonConfig()
            boolean r4 = r4.f126544f
            boolean r3 = r3.mo26619q(r4, r15)
            if (r3 == 0) goto L_0x0139
            r3 = r1
            goto L_0x013c
        L_0x0139:
            if (r12 >= 0) goto L_0x013e
            r3 = 0
        L_0x013c:
            r4 = 1
            goto L_0x0140
        L_0x013e:
            r3 = 0
            r4 = 0
        L_0x0140:
            if (r1 > 0) goto L_0x0156
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r5 = r0.f63492a
            mq3.a r6 = r5.getCommonConfig()
            boolean r6 = r6.f126545g
            boolean r5 = r5.mo26619q(r6, r14)
            if (r5 == 0) goto L_0x0152
            r3 = r1
            goto L_0x0155
        L_0x0152:
            if (r12 <= 0) goto L_0x0156
            r3 = 0
        L_0x0155:
            r4 = 1
        L_0x0156:
            if (r4 == 0) goto L_0x019d
            r2.mo34220h(r3)
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x0199
            boolean r4 = r2.f60979v
            if (r4 == 0) goto L_0x019d
            boolean r2 = r2.f60980w
            if (r2 == 0) goto L_0x019d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.a r2 = r2.getCommonConfig()
            boolean r2 = r2.f126546h
            if (r2 == 0) goto L_0x019d
            if (r14 == 0) goto L_0x019d
            rq3.c r2 = r14.getSpinnerStyle()
            rq3.c r4 = rq3.C63509c.f180133b
            if (r2 != r4) goto L_0x019d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.a r4 = r2.getCommonConfig()
            boolean r4 = r4.f126542d
            boolean r2 = r2.mo26618p(r4)
            if (r2 == 0) goto L_0x019d
            android.view.View r2 = r14.getView()
            if (r2 != 0) goto L_0x0190
            goto L_0x019d
        L_0x0190:
            int r3 = java.lang.Math.max(r11, r3)
            float r3 = (float) r3
            r2.setTranslationY(r3)
            goto L_0x019d
        L_0x0199:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x019d:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x019f:
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r1 >= 0) goto L_0x01a5
            if (r12 <= 0) goto L_0x028b
        L_0x01a5:
            if (r15 == 0) goto L_0x028b
            int r5 = java.lang.Math.max(r1, r11)
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.d r2 = r2.getHeaderConfig()
            int r6 = r2.f60981a
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.d r2 = r2.getHeaderConfig()
            float r2 = r2.f60983c
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x01d3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.d r2 = r2.getHeaderConfig()
            int r2 = r2.f60981a
            float r2 = (float) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            float r3 = r3.f60983c
            float r2 = r2 * r3
            goto L_0x01db
        L_0x01d3:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.d r2 = r2.getHeaderConfig()
            float r2 = r2.f60983c
        L_0x01db:
            int r7 = (int) r2
            float r2 = (float) r5
            float r2 = r2 * r16
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            float r3 = r3.f60984d
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x01ff
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            float r3 = r3.f60984d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r0.f63492a
            mq3.d r4 = r4.getHeaderConfig()
            int r4 = r4.f60981a
            float r4 = (float) r4
            float r3 = r3 * r4
            goto L_0x0207
        L_0x01ff:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.d r3 = r3.getHeaderConfig()
            float r3 = r3.f60984d
        L_0x0207:
            float r4 = r2 / r3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.a r3 = r2.getCommonConfig()
            boolean r3 = r3.f126541c
            boolean r2 = r2.mo26618p(r3)
            if (r2 != 0) goto L_0x0226
            sq3.a r2 = r0.f63493b
            rq3.b r2 = r2.f63470b
            rq3.b r3 = rq3.C22243b.RefreshFinish
            if (r2 != r3) goto L_0x0221
            r2 = 1
            goto L_0x0222
        L_0x0221:
            r2 = 0
        L_0x0222:
            if (r2 == 0) goto L_0x0284
            if (r19 != 0) goto L_0x0284
        L_0x0226:
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x0287
            int r2 = r2.f60959b
            if (r12 == r2) goto L_0x0256
            rq3.c r2 = r15.getSpinnerStyle()
            rq3.c r3 = rq3.C63509c.f180133b
            if (r2 != r3) goto L_0x0249
            android.view.View r2 = r15.getView()
            mq3.b r3 = r0.f63494c
            if (r3 == 0) goto L_0x0245
            int r3 = r3.f60959b
            float r3 = (float) r3
            r2.setTranslationY(r3)
            goto L_0x0250
        L_0x0245:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0249:
            rq3.c r2 = r15.getSpinnerStyle()
            r2.getClass()
        L_0x0250:
            r2 = r15
            r3 = r19
            r2.mo34232i(r3, r4, r5, r6, r7)
        L_0x0256:
            if (r19 == 0) goto L_0x0284
            boolean r2 = r15.mo34227f()
            if (r2 == 0) goto L_0x0284
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x0280
            float r2 = r2.f60968k
            int r2 = (int) r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            int r3 = r3.getWidth()
            mq3.b r4 = r0.f63494c
            if (r4 == 0) goto L_0x027c
            float r4 = r4.f60968k
            if (r3 != 0) goto L_0x0275
            r5 = 1
            goto L_0x0276
        L_0x0275:
            r5 = r3
        L_0x0276:
            float r5 = (float) r5
            float r4 = r4 / r5
            r15.mo34226e(r4, r2, r3)
            goto L_0x0284
        L_0x027c:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0280:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0284:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x028b
        L_0x0287:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x028b:
            if (r1 <= 0) goto L_0x028f
            if (r12 >= 0) goto L_0x0373
        L_0x028f:
            if (r14 == 0) goto L_0x0373
            int r1 = java.lang.Math.min(r1, r11)
            int r4 = -r1
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f63492a
            mq3.c r1 = r1.getFooterConfig()
            int r5 = r1.f174983a
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f63492a
            mq3.c r1 = r1.getFooterConfig()
            float r1 = r1.f174985c
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x02be
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f63492a
            mq3.c r1 = r1.getFooterConfig()
            int r1 = r1.f174983a
            float r1 = (float) r1
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.c r2 = r2.getFooterConfig()
            float r2 = r2.f174985c
            float r1 = r1 * r2
            goto L_0x02c6
        L_0x02be:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f63492a
            mq3.c r1 = r1.getFooterConfig()
            float r1 = r1.f174985c
        L_0x02c6:
            int r6 = (int) r1
            float r1 = (float) r4
            float r1 = r1 * r16
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.c r2 = r2.getFooterConfig()
            float r2 = r2.f174986d
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x02ea
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.c r2 = r2.getFooterConfig()
            float r2 = r2.f174986d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r0.f63492a
            mq3.c r3 = r3.getFooterConfig()
            int r3 = r3.f174983a
            float r3 = (float) r3
            float r2 = r2 * r3
            goto L_0x02f2
        L_0x02ea:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            mq3.c r2 = r2.getFooterConfig()
            float r2 = r2.f174986d
        L_0x02f2:
            float r3 = r1 / r2
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r0.f63492a
            mq3.a r2 = r1.getCommonConfig()
            boolean r2 = r2.f126542d
            boolean r1 = r1.mo26618p(r2)
            if (r1 != 0) goto L_0x030f
            sq3.a r1 = r0.f63493b
            rq3.b r1 = r1.f63470b
            rq3.b r2 = rq3.C22243b.LoadFinish
            if (r1 != r2) goto L_0x030b
            r11 = 1
        L_0x030b:
            if (r11 == 0) goto L_0x036c
            if (r19 != 0) goto L_0x036c
        L_0x030f:
            mq3.b r1 = r0.f63494c
            if (r1 == 0) goto L_0x036f
            int r1 = r1.f60959b
            if (r12 == r1) goto L_0x033f
            rq3.c r1 = r14.getSpinnerStyle()
            rq3.c r2 = rq3.C63509c.f180133b
            if (r1 != r2) goto L_0x0332
            android.view.View r1 = r14.getView()
            mq3.b r2 = r0.f63494c
            if (r2 == 0) goto L_0x032e
            int r2 = r2.f60959b
            float r2 = (float) r2
            r1.setTranslationY(r2)
            goto L_0x0339
        L_0x032e:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0332:
            rq3.c r1 = r14.getSpinnerStyle()
            r1.getClass()
        L_0x0339:
            r1 = r14
            r2 = r19
            r1.mo34232i(r2, r3, r4, r5, r6)
        L_0x033f:
            if (r19 == 0) goto L_0x036c
            boolean r1 = r14.mo34227f()
            if (r1 == 0) goto L_0x036c
            mq3.b r1 = r0.f63494c
            if (r1 == 0) goto L_0x0368
            float r1 = r1.f60968k
            int r1 = (int) r1
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r0.f63492a
            int r2 = r2.getWidth()
            mq3.b r3 = r0.f63494c
            if (r3 == 0) goto L_0x0364
            float r3 = r3.f60968k
            if (r2 != 0) goto L_0x035d
            goto L_0x035e
        L_0x035d:
            r10 = r2
        L_0x035e:
            float r4 = (float) r10
            float r3 = r3 / r4
            r14.mo34226e(r3, r1, r2)
            goto L_0x036c
        L_0x0364:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0368:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x036c:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0373
        L_0x036f:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0373:
            return
        L_0x0374:
            gy3.C87412m.m108603p(r9)
            throw r8
        L_0x0378:
            gy3.C87412m.m108603p(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sq3.C22394f.mo35542a(int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0.mo26618p(r0.getCommonConfig().f126542d) != false) goto L_0x0114;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35543b() {
        /*
            r7 = this;
            sq3.a r0 = r7.f63493b
            boolean r0 = r0.mo35529a()
            r1 = 0
            r2 = 0
            java.lang.String r3 = "cValues"
            if (r0 != 0) goto L_0x0114
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            mq3.a r0 = r0.getCommonConfig()
            boolean r0 = r0.f126546h
            if (r0 == 0) goto L_0x003a
            mq3.b r0 = r7.f63494c
            if (r0 == 0) goto L_0x0036
            boolean r4 = r0.f60979v
            if (r4 == 0) goto L_0x003a
            boolean r4 = r0.f60980w
            if (r4 == 0) goto L_0x003a
            int r0 = r0.f60959b
            if (r0 >= 0) goto L_0x003a
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            mq3.a r4 = r0.getCommonConfig()
            boolean r4 = r4.f126542d
            boolean r0 = r0.mo26618p(r4)
            if (r0 == 0) goto L_0x003a
            goto L_0x0114
        L_0x0036:
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x003a:
            sq3.a r0 = r7.f63493b
            boolean r0 = r0.mo35530b()
            if (r0 == 0) goto L_0x0076
            mq3.b r0 = r7.f63494c
            if (r0 == 0) goto L_0x0072
            int r0 = r0.f60959b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r7.f63492a
            mq3.d r4 = r4.getHeaderConfig()
            int r4 = r4.f60981a
            if (r0 <= r4) goto L_0x005f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            mq3.d r1 = r0.getHeaderConfig()
            int r1 = r1.f60981a
            r0.mo26571c(r1)
            goto L_0x013f
        L_0x005f:
            mq3.b r0 = r7.f63494c
            if (r0 == 0) goto L_0x006e
            int r0 = r0.f60959b
            if (r0 >= 0) goto L_0x013f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            r0.mo26571c(r2)
            goto L_0x013f
        L_0x006e:
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0072:
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0076:
            sq3.a r0 = r7.f63493b
            rq3.b r4 = r0.f63470b
            rq3.b r5 = rq3.C22243b.PullDownToRefresh
            r6 = 1
            if (r4 != r5) goto L_0x0081
            r5 = 1
            goto L_0x0082
        L_0x0081:
            r5 = 0
        L_0x0082:
            if (r5 == 0) goto L_0x008b
            rq3.b r1 = rq3.C22243b.PullDownCanceled
            r0.mo35533e(r1)
            goto L_0x013f
        L_0x008b:
            rq3.b r5 = rq3.C22243b.PullUpToLoad
            if (r4 != r5) goto L_0x0091
            r5 = 1
            goto L_0x0092
        L_0x0091:
            r5 = 0
        L_0x0092:
            if (r5 == 0) goto L_0x009b
            rq3.b r1 = rq3.C22243b.PullUpCanceled
            r0.mo35533e(r1)
            goto L_0x013f
        L_0x009b:
            rq3.b r5 = rq3.C22243b.ReleaseToRefresh
            if (r4 != r5) goto L_0x00a1
            r5 = 1
            goto L_0x00a2
        L_0x00a1:
            r5 = 0
        L_0x00a2:
            if (r5 == 0) goto L_0x00ab
            rq3.b r1 = rq3.C22243b.Refreshing
            r0.mo35533e(r1)
            goto L_0x013f
        L_0x00ab:
            rq3.b r5 = rq3.C22243b.ReleaseToLoad
            if (r4 != r5) goto L_0x00b1
            r5 = 1
            goto L_0x00b2
        L_0x00b1:
            r5 = 0
        L_0x00b2:
            if (r5 == 0) goto L_0x00bb
            rq3.b r1 = rq3.C22243b.Loading
            r0.mo35533e(r1)
            goto L_0x013f
        L_0x00bb:
            rq3.b r0 = rq3.C22243b.RefreshReleased
            if (r4 != r0) goto L_0x00c1
            r0 = 1
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            if (r0 == 0) goto L_0x00da
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            sq3.b r0 = r0.getAnimHelper()
            android.animation.ValueAnimator r0 = r0.f63477e
            if (r0 != 0) goto L_0x013f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            mq3.d r1 = r0.getHeaderConfig()
            int r1 = r1.f60981a
            r0.mo26571c(r1)
            goto L_0x013f
        L_0x00da:
            rq3.b r0 = rq3.C22243b.LoadReleased
            if (r4 != r0) goto L_0x00e0
            r0 = 1
            goto L_0x00e1
        L_0x00e0:
            r0 = 0
        L_0x00e1:
            if (r0 == 0) goto L_0x00fa
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            sq3.b r0 = r0.getAnimHelper()
            android.animation.ValueAnimator r0 = r0.f63477e
            if (r0 != 0) goto L_0x013f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            mq3.c r1 = r0.getFooterConfig()
            int r1 = r1.f174983a
            int r1 = -r1
            r0.mo26571c(r1)
            goto L_0x013f
        L_0x00fa:
            rq3.b r0 = rq3.C22243b.LoadFinish
            if (r4 != r0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r6 = 0
        L_0x0100:
            if (r6 != 0) goto L_0x013f
            mq3.b r0 = r7.f63494c
            if (r0 == 0) goto L_0x0110
            int r0 = r0.f60959b
            if (r0 == 0) goto L_0x013f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            r0.mo26571c(r2)
            goto L_0x013f
        L_0x0110:
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0114:
            mq3.b r0 = r7.f63494c
            if (r0 == 0) goto L_0x0144
            int r0 = r0.f60959b
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r4 = r7.f63492a
            mq3.c r4 = r4.getFooterConfig()
            int r4 = r4.f174983a
            int r4 = -r4
            if (r0 >= r4) goto L_0x0132
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            mq3.c r1 = r0.getFooterConfig()
            int r1 = r1.f174983a
            int r1 = -r1
            r0.mo26571c(r1)
            goto L_0x013f
        L_0x0132:
            mq3.b r0 = r7.f63494c
            if (r0 == 0) goto L_0x0140
            int r0 = r0.f60959b
            if (r0 <= 0) goto L_0x013f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r7.f63492a
            r0.mo26571c(r2)
        L_0x013f:
            return
        L_0x0140:
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0144:
            gy3.C87412m.m108603p(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sq3.C22394f.mo35543b():void");
    }
}
