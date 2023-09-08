package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMOverScrollView;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C94988a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gt2.C98211b;
import gt2.C98212c;
import hp3.C87581a;
import java.util.List;
import jv2.C99059b;
import jv2.C99064d;
import lp3.C88633e;
import lp3.C88643g;
import vr2.C102267u;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$p */
public class SnsTimeLineUI$$p implements SnsUIAction.C95669n {

    /* renamed from: a */
    public int f278773a = 0;

    /* renamed from: b */
    public int f278774b = 0;

    /* renamed from: c */
    public final /* synthetic */ SnsTimeLineUI f278775c;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$p$a */
    public class C95655a implements AbsListView.RecyclerListener {
        public C95655a(SnsTimeLineUI$$p snsTimeLineUI$$p) {
        }

        public void onMovedToScrapHeap(View view) {
            SnsMethodCalculate.markStartTimeMs("onMovedToScrapHeap", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35$1");
            Log.m105925i("MicroMsg.SnsTimeLineUI", "onMovedToScrapHeap convertView hash:%d", Integer.valueOf(view.hashCode()));
            SnsMethodCalculate.markEndTimeMs("onMovedToScrapHeap", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$p$b */
    public class C95656b implements C87581a<Void, Void> {

        /* renamed from: a */
        public final /* synthetic */ C94988a.C94989a f278776a;

        public C95656b(SnsTimeLineUI$$p snsTimeLineUI$$p, C94988a.C94989a aVar) {
            this.f278776a = aVar;
        }

        public Object call(Object obj) {
            SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35$2");
            Void voidR = (Void) obj;
            SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35$2");
            C94988a.C94989a aVar = this.f278776a;
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("sendCaptureInfo", "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper");
                C91998s.m115550d(501).f263362d = aVar.f275582a;
                List<C94988a.C94990b> list = aVar.f275583b;
                if (list != null) {
                    for (C94988a.C94990b next : list) {
                        C91998s.m115550d(502).f263362d = aVar.f275582a;
                        String str = next.f275588e;
                        Log.m105927v("MicroMsg.CaptureSnsHelper", "rootview top left %s %s viewWidth: %s viewHeight: %s", Integer.valueOf(next.f275584a), Integer.valueOf(next.f275585b), Integer.valueOf(next.f275587d), Integer.valueOf(next.f275586c));
                        Log.m105927v("MicroMsg.CaptureSnsHelper", "like %s %s likeheight: %s likewidth: %s", Integer.valueOf(next.f275591h), Integer.valueOf(next.f275592i), Integer.valueOf(next.f275594k), Integer.valueOf(next.f275593j));
                        Log.m105927v("MicroMsg.CaptureSnsHelper", "comment %s %s commentheight: %s commentwidth: %s", Integer.valueOf(next.f275595l), Integer.valueOf(next.f275596m), Integer.valueOf(next.f275598o), Integer.valueOf(next.f275597n));
                        if (next.f275590g != 0) {
                            C91998s.m115550d(503).f263362d = aVar.f275582a;
                        }
                        if (next.f275589f != 0) {
                            C91998s.m115550d(504).f263362d = aVar.f275582a;
                        }
                    }
                }
                C91998s.m115550d(506).f263362d = aVar.f275582a;
                SnsMethodCalculate.markEndTimeMs("sendCaptureInfo", "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper");
            }
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35$2");
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35$2");
            return voidR;
        }
    }

    public SnsTimeLineUI$$p(SnsTimeLineUI snsTimeLineUI) {
        this.f278775c = snsTimeLineUI;
    }

    /* renamed from: a */
    public void mo132983a() {
        SnsMethodCalculate.markStartTimeMs("onListScolling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        C94866e1.fy0().mo131310k();
        int firstVisiblePosition = SnsTimeLineUI.m122302d8(this.f278775c).f278851d.getFirstVisiblePosition();
        View childAt = SnsTimeLineUI.m122302d8(this.f278775c).f278851d.getChildAt(0);
        Log.m105925i("MicroMsg.SnsTimeLineUI", "will do up fetch isDoingFetch:%s, SnsCore.getSnsUnreadTipManager().isAutoScrolling:%s", Boolean.valueOf(C94866e1.fy0().f275365t), Boolean.valueOf(C94866e1.fy0().f275364s));
        if (!C94866e1.fy0().f275364s && childAt != null && firstVisiblePosition == 0 && childAt.getTop() == 0 && SnsTimeLineUI.m122302d8(this.f278775c).mo133036n()) {
            if (C94866e1.fy0().f275365t) {
                SnsMethodCalculate.markEndTimeMs("onListScolling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
                return;
            }
            C98212c R7 = SnsTimeLineUI.m122290R7(this.f278775c);
            ((SnsTimeLineUI$$p) SnsTimeLineUI.m122286N7(this.f278775c)).getType();
            String O7 = SnsTimeLineUI.m122287O7(this.f278775c);
            boolean Q7 = SnsTimeLineUI.m122289Q7(this.f278775c);
            int U7 = SnsTimeLineUI.m122293U7(this.f278775c);
            R7.getClass();
            SnsMethodCalculate.markStartTimeMs("doOtherList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            if (!R7.f287958d) {
                SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            } else {
                if (R7.f287957c == 0) {
                    long j = C94866e1.fy0().f275361p;
                    SnsMethodCalculate.markStartTimeMs("doTimeLineOtherList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
                    C98211b bVar = R7.f287955a;
                    bVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("doOtherList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
                    C99059b bVar2 = bVar.f287953a;
                    if (bVar2 == null) {
                        SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
                    } else {
                        C99059b.C99062c cVar = bVar2.f290375d;
                        cVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoOtherListFunctionalApi");
                        ((C88633e) C88643g.m110551i(O7, 1, Boolean.valueOf(Q7), Integer.valueOf(U7), Long.valueOf(j))).mo123061d(cVar);
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoOtherListFunctionalApi");
                        SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
                    }
                    SnsMethodCalculate.markEndTimeMs("doTimeLineOtherList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
                }
                SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
            }
            if (SnsTimeLineUI.m122284L7(this.f278775c) != null) {
                SnsTimeLineUI.m122294V7(this.f278775c).removeCallbacks(SnsTimeLineUI.m122295W7(this.f278775c));
                SnsTimeLineUI.m122294V7(this.f278775c).postDelayed(SnsTimeLineUI.m122295W7(this.f278775c), 3000);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onListScolling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
    }

    /* renamed from: b */
    public View mo132984b() {
        SnsMethodCalculate.markStartTimeMs("getActionBar", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        View findViewById = this.f278775c.findViewById(C0966R.C0970id.f5383do);
        SnsMethodCalculate.markEndTimeMs("getActionBar", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        return findViewById;
    }

    /* renamed from: c */
    public void mo132985c(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onActionBarChange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        SnsMethodCalculate.markEndTimeMs("onActionBarChange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132986d(boolean r11, int r12, java.util.List<java.lang.Integer> r13, java.util.List<java.lang.Integer> r14) {
        /*
            r10 = this;
            java.lang.String r11 = "notifyList"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            r14 = 1
            r0 = 0
            if (r12 <= 0) goto L_0x0030
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r1.mo139800LL(r12)
            if (r12 == 0) goto L_0x0030
            int r1 = r12.getPravited()
            if (r1 <= 0) goto L_0x0028
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r1 = r10.f278775c
            r2 = 2131836944(0x7f114010, float:1.930707E38)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r1, (int) r2, (int) r14)
            r1.show()
        L_0x0028:
            int r12 = r12.getPravited()
            if (r12 != r14) goto L_0x0030
            r12 = 0
            goto L_0x0031
        L_0x0030:
            r12 = 1
        L_0x0031:
            if (r12 == 0) goto L_0x0078
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r12 = r10.f278775c
            com.tencent.mm.plugin.sns.ui.SnsUIAction r12 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r12)
            android.widget.ListView r12 = r12.f278851d
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r12)
            java.lang.Object r12 = new java.lang.Object
            r12.<init>()
            java.lang.Object[] r3 = r1.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$35"
            java.lang.String r5 = "notifyList"
            java.lang.String r6 = "(ZILjava/util/List;Ljava/util/List;)V"
            java.lang.String r7 = "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_"
            java.lang.String r8 = "scrollToTop"
            java.lang.String r9 = "(Landroid/widget/ListView;)V"
            r2 = r12
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r1.mo10231a(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.SmoothScrollFactory.scrollToTop(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$35"
            java.lang.String r4 = "notifyList"
            java.lang.String r5 = "(ZILjava/util/List;Ljava/util/List;)V"
            java.lang.String r6 = "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_"
            java.lang.String r7 = "scrollToTop"
            java.lang.String r8 = "(Landroid/widget/ListView;)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0078:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r12 = r10.f278775c
            ft2.c r12 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r12)
            if (r12 == 0) goto L_0x008b
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r12 = r10.f278775c
            ft2.c r12 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r12)
            java.lang.String r0 = ""
            r12.mo133186F0(r0)
        L_0x008b:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r12 = r10.f278775c
            com.tencent.mm.plugin.sns.ui.SnsUIAction r12 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r12)
            android.widget.ListView r12 = r12.f278851d
            if (r12 == 0) goto L_0x00a4
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r12 = r10.f278775c
            java.lang.String r0 = "access$300"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r12.mo132960z8(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x00a4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI$$p.mo132986d(boolean, int, java.util.List, java.util.List):void");
    }

    /* renamed from: e */
    public void mo132987e() {
        SnsMethodCalculate.markStartTimeMs("onLoadingMore", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        if (C94866e1.fy0().f275364s) {
            Log.m105924i("MicroMsg.SnsTimeLineUI", "isAutoScrolling, skip onLoadingMore");
            SnsMethodCalculate.markEndTimeMs("onLoadingMore", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
            return;
        }
        SnsTimeLineUI.m122290R7(this.f278775c).mo137502b(((SnsTimeLineUI$$p) SnsTimeLineUI.m122286N7(this.f278775c)).getType(), SnsTimeLineUI.m122287O7(this.f278775c), SnsTimeLineUI.m122288P7(this.f278775c), false, SnsTimeLineUI.m122293U7(this.f278775c));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_UPDATE_SNS_TIMELINE_SCENE_INT, 3);
        Log.m105918d("MicroMsg.SnsTimeLineUI", "onLoadingMore here");
        if (SnsTimeLineUI.m122294V7(this.f278775c) == null) {
            Log.m105920e("MicroMsg.SnsTimeLineUI", "mLogicHandler handler null");
            SnsMethodCalculate.markEndTimeMs("onLoadingMore", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
            return;
        }
        if (SnsTimeLineUI.m122284L7(this.f278775c) != null) {
            SnsTimeLineUI.m122294V7(this.f278775c).removeCallbacks(SnsTimeLineUI.m122295W7(this.f278775c));
            SnsTimeLineUI.m122294V7(this.f278775c).postDelayed(SnsTimeLineUI.m122295W7(this.f278775c), 3000);
        }
        SnsMethodCalculate.markEndTimeMs("onLoadingMore", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
    }

    /* renamed from: f */
    public View mo132988f() {
        SnsMethodCalculate.markStartTimeMs("getRootBgView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        if (SnsTimeLineUI.m122284L7(this.f278775c).f276709s == null) {
            SnsTimeLineUI.m122284L7(this.f278775c).f276709s = (FrameLayout) this.f278775c.findViewById(C0966R.C0970id.kl8);
        }
        FrameLayout frameLayout = SnsTimeLineUI.m122284L7(this.f278775c).f276709s;
        SnsMethodCalculate.markEndTimeMs("getRootBgView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        return frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x04e6, code lost:
        if (r8 > r9) goto L_0x04eb;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132989g(android.widget.AbsListView r33, int r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r34
            java.lang.String r2 = "onListViewScoll"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r4 = r0.f278775c
            java.lang.Boolean r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.f278611T1
            java.lang.String r5 = "access$3602"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r4.f278665X0 = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r4 = r0.f278775c
            com.tencent.mm.plugin.sns.ui.SnsUIAction r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r4)
            android.widget.ListView r4 = r4.f278851d
            int r4 = r4.getFirstVisiblePosition()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r5 = r0.f278775c
            com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122302d8(r5)
            android.widget.ListView r5 = r5.f278851d
            int r5 = r5.getLastVisiblePosition()
            if (r1 != 0) goto L_0x0043
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r7 = r0.f278775c
            ft2.c r7 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r7)
            if (r7 == 0) goto L_0x0043
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r7 = r0.f278775c
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122292T7(r7, r4, r5)
        L_0x0043:
            int r7 = r0.f278773a
            if (r4 != r7) goto L_0x004f
            int r7 = r0.f278774b
            if (r5 != r7) goto L_0x004f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x004f:
            r0.f278773a = r4
            r0.f278774b = r5
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r10 = 0
            r8[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r11 = 1
            r8[r11] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r34)
            r12 = 2
            r8[r12] = r9
            java.lang.String r9 = "MicroMsg.SnsTimeLineUI"
            java.lang.String r13 = "onListViewScoll %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r13, r8)
            if (r1 != r12) goto L_0x0103
            com.tencent.mm.hardcoder.WXHardCoderJNI r8 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r13 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r13 = r13.getHcSNSScrollEnable()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r14 = r0.f278775c
            java.lang.String r15 = "access$3700"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r6)
            int r14 = r14.f278647Q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
            r8.stopPerformance(r13, r14)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r8 = r0.f278775c
            com.tencent.mm.hardcoder.WXHardCoderJNI r16 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r13 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r17 = r13.getHcSNSScrollEnable()
            com.tencent.mm.hardcoder.WXHardCoderJNI r13 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r18 = r13.getHcSNSScrollDelay()
            com.tencent.mm.hardcoder.WXHardCoderJNI r13 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r19 = r13.getHcSNSScrollCPU()
            com.tencent.mm.hardcoder.WXHardCoderJNI r13 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r20 = r13.getHcSNSScrollIO()
            com.tencent.mm.hardcoder.WXHardCoderJNI r13 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r13 = r13.getHcSNSScrollThr()
            if (r13 == 0) goto L_0x00c7
            int r13 = android.os.Process.myTid()
            r21 = r13
            goto L_0x00c9
        L_0x00c7:
            r21 = 0
        L_0x00c9:
            com.tencent.mm.hardcoder.WXHardCoderJNI r13 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r22 = r13.getHcSNSScrollTimeout()
            r23 = 701(0x2bd, float:9.82E-43)
            com.tencent.mm.hardcoder.WXHardCoderJNI r13 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            long r24 = r13.getHcSNSScrollAction()
            java.lang.String r26 = "MicroMsg.SnsTimeLineUI"
            int r13 = r16.startPerformance(r17, r18, r19, r20, r21, r22, r23, r24, r26)
            java.lang.String r14 = "access$3702"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r6)
            r8.f278647Q = r13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r6)
            java.lang.Object[] r8 = new java.lang.Object[r11]
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r13 = r0.f278775c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r6)
            int r13 = r13.f278647Q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r10] = r13
            java.lang.String r13 = "summer hardcoder sns startPerformance [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r13, r8)
        L_0x0103:
            if (r1 != 0) goto L_0x025e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r1 = r0.f278775c
            ft2.c r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r1)
            if (r1 == 0) goto L_0x025e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r1 = r0.f278775c
            ft2.c r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r1)
            r1.getClass()
            java.lang.Class<ex0.d> r9 = ex0.C45696d.class
            java.lang.String r13 = "preload"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            java.lang.String r15 = ""
            if (r5 >= r4) goto L_0x0129
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            goto L_0x01cd
        L_0x0129:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r10 = r4
        L_0x012f:
            if (r10 > r5) goto L_0x01c0
            int r11 = r10 + -1
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r1.getItem((int) r11)
            if (r11 != 0) goto L_0x013d
        L_0x0139:
            r34 = r1
            goto L_0x01b7
        L_0x013d:
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r11.getTimeLine()
            if (r11 != 0) goto L_0x0144
            goto L_0x0139
        L_0x0144:
            te3.j00 r12 = r11.ContentObj
            java.lang.String r12 = r12.f298426g
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0139
            te3.j00 r12 = r11.ContentObj
            java.lang.String r12 = r12.f298426g
            r19 = 2131831321(0x7f112a19, float:1.9295664E38)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r19)
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x0160
            goto L_0x0139
        L_0x0160:
            te3.j00 r7 = r11.ContentObj
            int r12 = r7.f298424e
            r34 = r1
            r1 = 3
            if (r12 != r1) goto L_0x01b7
            te3.st2 r1 = r7.f298430n
            if (r1 == 0) goto L_0x0170
            int r1 = r1.f299443d
            goto L_0x0171
        L_0x0170:
            r1 = -1
        L_0x0171:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            te3.j00 r12 = r11.ContentObj
            java.lang.String r12 = r12.f298426g
            r7.add(r12)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.add(r1)
            java.lang.String r1 = r11.f283893Id
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.add(r1)
            r7.add(r15)
            r7.add(r15)
            java.lang.String r1 = r11.UserName
            r7.add(r1)
            int r1 = r11.CreateTime
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.add(r1)
            k40.a r1 = f40.C86709a0.m107533q(r9)
            ex0.d r1 = (ex0.C45696d) r1
            java.lang.String r11 = "__sns_timeline__"
            long r11 = r1.mo70963J2(r11)
            java.lang.String r1 = java.lang.String.valueOf(r11)
            r7.add(r1)
            r8.add(r7)
        L_0x01b7:
            int r10 = r10 + 1
            r1 = r34
            r7 = 3
            r11 = 1
            r12 = 2
            goto L_0x012f
        L_0x01c0:
            k40.a r1 = f40.C86709a0.m107533q(r9)
            ex0.d r1 = (ex0.C45696d) r1
            r7 = 2
            r1.mo71004o8(r8, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
        L_0x01cd:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r1 = r0.f278775c
            ft2.c r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r1)
            r1.getClass()
            java.lang.String r7 = "preAuths"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r14)
            if (r5 >= r4) goto L_0x01e3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r14)
            goto L_0x025e
        L_0x01e3:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r9 = r4
        L_0x01e9:
            if (r9 > r5) goto L_0x0233
            int r10 = r9 + -1
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r1.getItem((int) r10)
            if (r10 != 0) goto L_0x01f4
            goto L_0x0230
        L_0x01f4:
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r10.getTimeLine()
            if (r10 == 0) goto L_0x0230
            te3.j00 r11 = r10.ContentObj
            if (r11 == 0) goto L_0x0230
            java.lang.String r11 = r11.f298426g
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x0207
            goto L_0x0230
        L_0x0207:
            ex0.h$b r11 = new ex0.h$b
            r11.<init>()
            te3.j00 r12 = r10.ContentObj
            java.lang.String r13 = r12.f298426g
            r11.f123504a = r13
            int r13 = ft2.C97979c.f287347o
            r11.f123506c = r13
            te3.r5 r10 = r10.AppInfo
            if (r10 == 0) goto L_0x021d
            java.lang.String r10 = r10.f299236d
            goto L_0x021e
        L_0x021d:
            r10 = r15
        L_0x021e:
            r11.f123508e = r10
            java.lang.String r10 = r12.f298425f
            r11.f123509f = r10
            java.lang.String r10 = r12.f298423d
            r11.f123510g = r10
            java.lang.String r10 = "timeline"
            r11.f123511h = r10
            r8.add(r11)
        L_0x0230:
            int r9 = r9 + 1
            goto L_0x01e9
        L_0x0233:
            java.lang.Class<ex0.h> r1 = ex0.C45700h.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            ex0.h r1 = (ex0.C45700h) r1
            if (r1 == 0) goto L_0x025b
            int r9 = r8.size()
            if (r9 <= 0) goto L_0x025b
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            int r11 = r8.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 0
            r10[r12] = r11
            java.lang.String r11 = "MicroMsg.SnsTimeLineVendingAdapter"
            java.lang.String r12 = "[TRACE_PREFETCH] checkPreAuths authInfo size = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r11, r12, r10)
            r1.mo71026A3(r8, r9)
        L_0x025b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r14)
        L_0x025e:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r1 = r0.f278775c
            ft2.c r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r1)
            if (r1 == 0) goto L_0x049e
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r1 = r0.f278775c
            java.lang.String r7 = "access$900"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            com.tencent.mm.plugin.sns.statistics.a r1 = r1.f278638L
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r6 = r0.f278775c
            ft2.c r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122282J7(r6)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r6 = r6.mo137288g()
            r1.getClass()
            java.lang.String r7 = "capture"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            long r9 = java.lang.System.nanoTime()
            com.tencent.mm.plugin.sns.statistics.a$a r11 = new com.tencent.mm.plugin.sns.statistics.a$a
            r11.<init>()
            long r12 = java.lang.System.currentTimeMillis()
            r11.f275582a = r12
            com.tencent.mm.plugin.sns.ui.SnsHeader r12 = r1.f275581b
            r12.getTop()
            com.tencent.mm.plugin.sns.ui.SnsHeader r12 = r1.f275581b
            r12.getHeight()
            android.widget.ListView r12 = r1.f275580a
            int r12 = r12.getFirstVisiblePosition()
            r13 = 1
            int r12 = r12 - r13
            android.widget.ListView r14 = r1.f275580a
            int r14 = r14.getLastVisiblePosition()
            int r14 = r14 - r13
            int r13 = r6.mo132917g()
            android.widget.ListView r15 = r1.f275580a
            r19 = r2
            r2 = 0
            android.view.View r15 = r15.getChildAt(r2)
            if (r15 == 0) goto L_0x02c9
            android.widget.ListView r15 = r1.f275580a
            android.view.View r15 = r15.getChildAt(r2)
            boolean r15 = r15 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsHeader
            r21 = r3
            r2 = 3
            goto L_0x02cd
        L_0x02c9:
            r21 = r3
            r2 = 3
            r15 = 0
        L_0x02cd:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r16 = 0
            r3[r16] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r17 = 1
            r3[r17] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            r18 = 2
            r3[r18] = r2
            java.lang.String r2 = "MicroMsg.CaptureSnsHelper"
            r34 = r12
            java.lang.String r12 = "first last %s %s isHeaderExist %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r12, r3)
            android.widget.ListView r3 = r1.f275580a
            int r3 = r3.getChildCount()
            r12 = r34
        L_0x02f8:
            if (r12 > r14) goto L_0x045a
            if (r12 >= r13) goto L_0x042b
            if (r12 >= 0) goto L_0x0300
            goto L_0x042b
        L_0x0300:
            if (r15 < r3) goto L_0x032a
            r34 = r13
            r22 = r14
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r16 = 0
            r14[r16] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r17 = 1
            r14[r17] = r13
            java.lang.String r13 = "childPos biger than childCount %d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r13, r14)
            r23 = r1
            r24 = r3
            r26 = r4
            r25 = r5
            r27 = r6
            goto L_0x0420
        L_0x032a:
            r34 = r13
            r22 = r14
            java.util.List<com.tencent.mm.plugin.sns.statistics.a$b> r13 = r11.f275583b
            if (r13 != 0) goto L_0x0339
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            r11.f275583b = r13
        L_0x0339:
            com.tencent.mm.plugin.sns.statistics.a$b r13 = new com.tencent.mm.plugin.sns.statistics.a$b
            r13.<init>()
            java.util.List<com.tencent.mm.plugin.sns.statistics.a$b> r14 = r11.f275583b
            java.util.LinkedList r14 = (java.util.LinkedList) r14
            r14.add(r13)
            android.widget.ListView r14 = r1.f275580a
            android.view.View r14 = r14.getChildAt(r15)
            int r15 = r15 + 1
            if (r14 == 0) goto L_0x0381
            r23 = r1
            int r1 = r14.getTop()
            r24 = r3
            int r3 = r14.getLeft()
            r25 = r5
            int r5 = r14.getHeight()
            r26 = r4
            int r4 = r14.getWidth()
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r6.mo132919i(r12)
            r27 = r6
            java.lang.String r6 = vr2.C102236a0.m134728W(r0)
            r13.f275588e = r6
            int r6 = r0.field_type
            r0.isAd()
            r13.f275584a = r1
            r13.f275585b = r3
            r13.f275586c = r5
            r13.f275587d = r4
            goto L_0x038b
        L_0x0381:
            r23 = r1
            r24 = r3
            r26 = r4
            r25 = r5
            r27 = r6
        L_0x038b:
            if (r14 == 0) goto L_0x0420
            java.lang.Object r0 = r14.getTag()
            if (r0 == 0) goto L_0x0420
            java.lang.Object r0 = r14.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r0 == 0) goto L_0x0420
            java.lang.Object r0 = r14.getTag()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r0
            boolean r1 = r0.f279939V
            if (r1 == 0) goto L_0x0420
            android.widget.LinearLayout r1 = r0.f279930M
            if (r1 == 0) goto L_0x0420
            int r1 = r1.getTop()
            android.widget.LinearLayout r3 = r0.f279930M
            int r3 = r3.getLeft()
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r4 = r0.f279931N
            int r4 = r4.getHeight()
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r5 = r0.f279931N
            int r5 = r5.getWidth()
            android.widget.LinearLayout r6 = r0.f279933P
            int r6 = r6.getTop()
            android.widget.LinearLayout r14 = r0.f279933P
            int r14 = r14.getLeft()
            int r6 = r6 + r1
            int r14 = r14 + r3
            r28 = r11
            android.widget.LinearLayout r11 = r0.f279933P
            int r11 = r11.getHeight()
            r29 = r7
            android.widget.LinearLayout r7 = r0.f279933P
            int r7 = r7.getWidth()
            r30 = r9
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]
            int r9 = r0.f279948c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r16 = 0
            r10[r16] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r17 = 1
            r10[r17] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r18 = 2
            r10[r18] = r9
            java.lang.String r9 = "holder position %s %s index %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r9, r10)
            com.tencent.mm.protocal.protobuf.SnsObject r0 = r0.snsobj
            int r9 = r0.LikeCount
            if (r9 == 0) goto L_0x0411
            r13.f275590g = r9
            r13.f275591h = r1
            r13.f275592i = r3
            r13.f275593j = r5
            r13.f275594k = r4
        L_0x0411:
            int r0 = r0.CommentCount
            if (r0 == 0) goto L_0x0440
            r13.f275589f = r0
            r13.f275596m = r14
            r13.f275595l = r6
            r13.f275597n = r7
            r13.f275598o = r11
            goto L_0x0440
        L_0x0420:
            r29 = r7
            r30 = r9
            r28 = r11
        L_0x0426:
            r16 = 0
            r18 = 2
            goto L_0x0440
        L_0x042b:
            r23 = r1
            r24 = r3
            r26 = r4
            r25 = r5
            r27 = r6
            r29 = r7
            r30 = r9
            r28 = r11
            r34 = r13
            r22 = r14
            goto L_0x0426
        L_0x0440:
            int r12 = r12 + 1
            r0 = r32
            r13 = r34
            r14 = r22
            r1 = r23
            r3 = r24
            r5 = r25
            r4 = r26
            r6 = r27
            r11 = r28
            r7 = r29
            r9 = r30
            goto L_0x02f8
        L_0x045a:
            r26 = r4
            r25 = r5
            r29 = r7
            r30 = r9
            r28 = r11
            java.lang.String r0 = "endCapture"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "end cap: "
            r0.append(r1)
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r30
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = r29
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            lp3.c r0 = lp3.C88643g.m110546d()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$p$b r1 = new com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$p$b
            r2 = r32
            r3 = r28
            r1.<init>(r2, r3)
            lp3.e r0 = (lp3.C88633e) r0
            r0.mo123064p(r1)
            goto L_0x04a7
        L_0x049e:
            r19 = r2
            r21 = r3
            r26 = r4
            r25 = r5
            r2 = r0
        L_0x04a7:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.getClass()
            java.lang.String r1 = "checkSnsLikeExpose"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$c> r4 = r4.f275560q
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x04c6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0500
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper$c r6 = (com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.C94987c) r6
            if (r6 == 0) goto L_0x04c6
            com.tencent.mm.autogen.mmdata.rpt.SnsLikeCollapseStruct r7 = r6.f275579b
            if (r7 == 0) goto L_0x04c6
            int r8 = r6.f275578a
            int r9 = r26 + -1
            if (r8 < r9) goto L_0x04e9
            r9 = r25
            if (r8 <= r9) goto L_0x04fd
            goto L_0x04eb
        L_0x04e9:
            r9 = r25
        L_0x04eb:
            long r10 = java.lang.System.currentTimeMillis()
            r7.f266065r = r10
            com.tencent.mm.autogen.mmdata.rpt.SnsLikeCollapseStruct r7 = r6.f275579b
            r7.mo86054n()
            com.tencent.mm.autogen.mmdata.rpt.SnsLikeCollapseStruct r6 = r6.f275579b
            java.lang.String r6 = r6.f266052e
            r5.add(r6)
        L_0x04fd:
            r25 = r9
            goto L_0x04c6
        L_0x0500:
            r9 = r25
            java.util.Iterator r4 = r5.iterator()
        L_0x0506:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x051a
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$c> r6 = r0.f275560q
            java.util.HashMap r6 = (java.util.HashMap) r6
            r6.remove(r5)
            goto L_0x0506
        L_0x051a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.getClass()
            java.lang.String r1 = "checkSnsEmojiCommentExpose"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b> r4 = r0.f275561r
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0538:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0588
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b r6 = (com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.C94986b) r6
            if (r6 == 0) goto L_0x0538
            com.tencent.mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct r7 = r6.f275575b
            if (r7 == 0) goto L_0x0538
            int r8 = r6.f275574a
            r10 = -1
            int r11 = r26 + -1
            if (r8 < r11) goto L_0x0559
            if (r8 <= r9) goto L_0x0538
        L_0x0559:
            java.util.List<java.lang.String> r8 = r6.f275576c
            java.lang.String r11 = "|"
            java.lang.String r8 = r0.mo131348I(r8, r11)
            java.lang.String r12 = "ClickEmojiIconIdList"
            r13 = 1
            java.lang.String r8 = r7.mo86045b(r12, r8, r13)
            r7.f265976g = r8
            com.tencent.mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct r7 = r6.f275575b
            java.util.List<java.lang.String> r8 = r6.f275577d
            java.lang.String r8 = r0.mo131348I(r8, r11)
            java.lang.String r11 = "ClickEmojiIdList"
            java.lang.String r8 = r7.mo86045b(r11, r8, r13)
            r7.f265977h = r8
            com.tencent.mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct r7 = r6.f275575b
            r7.mo86054n()
            com.tencent.mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct r6 = r6.f275575b
            java.lang.String r6 = r6.f265973d
            r5.add(r6)
            goto L_0x0538
        L_0x0588:
            java.util.Iterator r4 = r5.iterator()
        L_0x058c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05a0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b> r6 = r0.f275561r
            java.util.HashMap r6 = (java.util.HashMap) r6
            r6.remove(r5)
            goto L_0x058c
        L_0x05a0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            r0 = r19
            r1 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI$$p.mo132989g(android.widget.AbsListView, int):void");
    }

    public View getMaskView() {
        SnsMethodCalculate.markStartTimeMs("getMaskView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        View findViewById = this.f278775c.findViewById(C0966R.C0970id.jsr);
        SnsMethodCalculate.markEndTimeMs("getMaskView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        return findViewById;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        if (this.f278775c.f278646P1 == 1) {
            SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
            return 2;
        }
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        return 1;
    }

    /* renamed from: h */
    public void mo132992h(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        SnsTimeLineUI snsTimeLineUI = this.f278775c;
        snsTimeLineUI.getClass();
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.f278619B1 = z;
        MMHandler ly02 = C94866e1.ly0();
        C94901o Fx0 = C94866e1.Fx0();
        C94853e Vx0 = C94866e1.Vx0();
        if (z) {
            if (Fx0.mo131142y() || Vx0.mo130993r()) {
                Log.m105925i("MicroMsg.SnsTimeLineUI", "%s flingStart", "[image-flow]");
                ly02.removeCallbacks(snsTimeLineUI.f278623D1);
                ly02.removeCallbacks(snsTimeLineUI.f278625E1);
                ly02.postDelayed(snsTimeLineUI.f278623D1, 0);
            }
        } else if (!Fx0.mo131142y() || !Vx0.mo130993r()) {
            Log.m105925i("MicroMsg.SnsTimeLineUI", "%s flingPause", "[image-flow]");
            ly02.removeCallbacks(snsTimeLineUI.f278623D1);
            ly02.removeCallbacks(snsTimeLineUI.f278625E1);
            ly02.postDelayed(snsTimeLineUI.f278625E1, 0);
        } else {
            SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        }
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
    }

    /* renamed from: i */
    public void mo132993i() {
        SnsMethodCalculate.markStartTimeMs("onLoadingTap", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        Log.m105918d("MicroMsg.SnsTimeLineUI", "onLoadingTap");
        this.f278775c.mo132950a1();
        if (!SnsTimeLineUI.m122302d8(this.f278775c).mo133036n()) {
            SnsTimeLineUI snsTimeLineUI = this.f278775c;
            SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            boolean z = snsTimeLineUI.f278663W0;
            SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            if (!z) {
                if (SnsTimeLineUI.m122291S7(this.f278775c) != null) {
                    Log.m105918d("MicroMsg.SnsTimeLineUI", "refreshIv onLoadingTap");
                    SnsTimeLineUI snsTimeLineUI2 = this.f278775c;
                    SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    snsTimeLineUI2.mo132948F8(0);
                    SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                }
                SnsTimeLineUI.m122290R7(this.f278775c).mo137501a(((SnsTimeLineUI$$p) SnsTimeLineUI.m122286N7(this.f278775c)).getType(), SnsTimeLineUI.m122287O7(this.f278775c), SnsTimeLineUI.m122288P7(this.f278775c), SnsTimeLineUI.m122289Q7(this.f278775c), SnsTimeLineUI.m122293U7(this.f278775c));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_UPDATE_SNS_TIMELINE_SCENE_INT, 2);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onLoadingTap", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
    }

    /* renamed from: j */
    public ListView mo132994j() {
        SnsMethodCalculate.markStartTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        if (SnsTimeLineUI.m122284L7(this.f278775c).f276698e == null) {
            SnsTimeLineUI.m122284L7(this.f278775c).f276698e = (ListView) this.f278775c.findViewById(C0966R.C0970id.jv8);
            SnsTimeLineUI.m122284L7(this.f278775c).f276698e.setRecyclerListener(new C95655a(this));
        }
        ListView listView = SnsTimeLineUI.m122284L7(this.f278775c).f276698e;
        SnsMethodCalculate.markEndTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        return listView;
    }

    /* renamed from: k */
    public void mo132995k(C102267u uVar) {
        SnsMethodCalculate.markStartTimeMs("onSnsUserDateUpdate", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        SnsMethodCalculate.markEndTimeMs("onSnsUserDateUpdate", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
    }

    /* renamed from: l */
    public MMOverScrollView mo132996l() {
        SnsMethodCalculate.markStartTimeMs("getSnsPushDownView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        MMOverScrollView mMOverScrollView = (MMOverScrollView) this.f278775c.findViewById(C0966R.C0970id.jvh);
        SnsMethodCalculate.markEndTimeMs("getSnsPushDownView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        return mMOverScrollView;
    }

    public void onPostEnd(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
        if (SnsTimeLineUI.m122282J7(this.f278775c) != null) {
            SnsTimeLineUI.m122282J7(this.f278775c).mo133186F0("");
        }
        if (!z) {
            this.f278775c.mo93528H7().mo136934f(C99064d.class);
        }
        SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$35");
    }
}
