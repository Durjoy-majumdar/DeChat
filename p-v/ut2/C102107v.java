package ut2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import androidx.recyclerview.widget.RecyclerView;
import au2.C92093b;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsOldItemContactEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C43155u8;
import com.tencent.p014mm.plugin.sns.p106ui.C95733b;
import com.tencent.p014mm.plugin.sns.p106ui.C95747c1;
import com.tencent.p014mm.plugin.sns.p106ui.C96104o8;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.C96317y0;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.vending.base.Vending;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gu2.C98214b;
import gv2.C98241o;
import gv2.C98249r;
import gy3.C87412m;
import gy3.C87413o;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98799a;
import iu2.C98802d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jp2.C98963o;
import js2.C99020a;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.w64;
import tt2.C101926a;
import vr2.C102236a0;
import vt2.C102279c;
import z04.C66723k;

/* renamed from: ut2.v */
public final class C102107v extends C102084a implements C95747c1, C96317y0, C11385n, RecyclerView.C16621m {

    /* renamed from: d */
    public final C98963o f300669d = new C98963o(0);

    /* renamed from: e */
    public SnsTimeLineBaseAdapter f300670e;

    /* renamed from: f */
    public BaseTimeLine f300671f;

    /* renamed from: g */
    public HashMap<String, Boolean> f300672g = new HashMap<>();

    /* renamed from: h */
    public HashMap<String, String> f300673h = new HashMap<>();

    /* renamed from: i */
    public final ArrayList<String> f300674i = new ArrayList<>();

    /* renamed from: j */
    public final C13601g f300675j = C36568h.m40985a(new C102109b(this));

    /* renamed from: n */
    public final HashSet<C101926a> f300676n = new HashSet<>();

    /* renamed from: o */
    public final HashSet<C101926a> f300677o = new HashSet<>();

    /* renamed from: p */
    public final long f300678p = 100;

    /* renamed from: q */
    public long f300679q;

    /* renamed from: r */
    public final C102108a f300680r = new C102108a(this);

    /* renamed from: ut2.v$a */
    public static final class C102108a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C102107v f300681d;

        public C102108a(C102107v vVar) {
            this.f300681d = vVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
            C87412m.m108594g(recyclerView, "recyclerView");
            if (i == 0 || i == 1) {
                this.f300681d.mo141609d3(false);
                C102107v vVar = this.f300681d;
                SnsMethodCalculate.markStartTimeMs("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                C98963o oVar = vVar.f300669d;
                SnsMethodCalculate.markEndTimeMs("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                oVar.mo138301h(true);
            }
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f300681d.mo141609d3(true);
            SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: ut2.v$b */
    public static final class C102109b extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C102107v f300682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102109b(C102107v vVar) {
            super(0);
            this.f300682d = vVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$appbar$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$appbar$2");
            ViewGroup viewGroup = (ViewGroup) this.f300682d.findViewById(C0966R.C0970id.f358454of3);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$appbar$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$appbar$2");
            return viewGroup;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102107v(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: E0 */
    public void mo17332E0(View view) {
        SnsMethodCalculate.markStartTimeMs("onChildViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        C87412m.m108594g(view, "view");
        if (view instanceof C101926a) {
            this.f300676n.remove(view);
            mo141608c3((C101926a) view);
        }
        SnsMethodCalculate.markEndTimeMs("onChildViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    /* renamed from: F0 */
    public void mo133186F0(String str) {
        SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r2 = r2.f276715y;
     */
    /* renamed from: H3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132949H3(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "addCommentView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r2 = r3.f300671f
            if (r2 == 0) goto L_0x0012
            com.tencent.mm.plugin.sns.ui.b r2 = r2.f276716z
            if (r2 == 0) goto L_0x0012
            r2.mo133177c()
        L_0x0012:
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r2 = r3.f300671f
            if (r2 == 0) goto L_0x001f
            com.tencent.mm.plugin.sns.ui.z1 r2 = r2.mo67328z6()
            if (r2 == 0) goto L_0x001f
            r2.mo67390c()
        L_0x001f:
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r2 = r3.f300671f
            if (r2 == 0) goto L_0x002c
            com.tencent.mm.plugin.sns.ui.o8 r2 = r2.f276715y
            if (r2 == 0) goto L_0x002c
            boolean r4 = r2.mo133668a(r4)
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ut2.C102107v.mo132949H3(android.view.View):boolean");
    }

    /* renamed from: a1 */
    public boolean mo132950a1() {
        SnsMethodCalculate.markStartTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        BaseTimeLine baseTimeLine = this.f300671f;
        C43155u8 u8Var = null;
        if ((baseTimeLine != null ? baseTimeLine.f276715y : null) == null) {
            SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        BaseTimeLine baseTimeLine2 = this.f300671f;
        if ((baseTimeLine2 != null ? baseTimeLine2.f276716z : null) != null) {
            C87412m.m108591d(baseTimeLine2);
            baseTimeLine2.f276716z.mo133177c();
        }
        SnsMethodCalculate.markEndTimeMs("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        SnsMethodCalculate.markStartTimeMs("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        BaseTimeLine baseTimeLine3 = this.f300671f;
        if ((baseTimeLine3 != null ? baseTimeLine3.mo67328z6() : null) != null) {
            BaseTimeLine baseTimeLine4 = this.f300671f;
            C87412m.m108591d(baseTimeLine4);
            baseTimeLine4.mo67328z6().mo67390c();
        }
        SnsMethodCalculate.markEndTimeMs("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        SnsMethodCalculate.markStartTimeMs("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        BaseTimeLine baseTimeLine5 = this.f300671f;
        if (baseTimeLine5 != null) {
            u8Var = baseTimeLine5.f276692C;
        }
        if (u8Var != null) {
            C87412m.m108591d(baseTimeLine5);
            baseTimeLine5.f276692C.mo67375b();
        }
        SnsMethodCalculate.markEndTimeMs("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        IListener iListener = NotInteresetABTestManager.f273611b;
        SnsMethodCalculate.markStartTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        SnsMethodCalculate.markEndTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        BaseTimeLine baseTimeLine6 = this.f300671f;
        C87412m.m108591d(baseTimeLine6);
        boolean d = baseTimeLine6.f276715y.mo133671d();
        SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return d;
    }

    /* renamed from: c3 */
    public final void mo141608c3(C101926a aVar) {
        SnsMethodCalculate.markStartTimeMs("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        C98214b snsInfo = aVar.getSnsInfo();
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        } else if (!snsInfo.isAd()) {
            SnsMethodCalculate.markEndTimeMs("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        } else {
            if (this.f300677o.contains(aVar)) {
                this.f300677o.remove(aVar);
                Log.m105924i("MicroMsg.OldVersionUIC", "adHideReport");
                this.f300669d.mo138312s(aVar.getPosition(), snsInfo.mo137503A2(), snsInfo.mo142401p2(), 1);
            }
            SnsMethodCalculate.markEndTimeMs("adHideReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141609d3(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "checkAdExpose"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            if (r19 == 0) goto L_0x001c
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.f300679q
            long r3 = r3 - r5
            long r5 = r0.f300678p
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x001c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x001c:
            long r3 = java.lang.System.currentTimeMillis()
            r0.f300679q = r3
            java.util.HashSet<tt2.a> r3 = r0.f300676n
            java.util.Iterator r3 = r3.iterator()
        L_0x0028:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x012c
            java.lang.Object r4 = r3.next()
            tt2.a r4 = (tt2.C101926a) r4
            java.lang.String r5 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r4, r5)
            r10 = r4
            android.view.View r10 = (android.view.View) r10
            java.lang.String r5 = "isViewInScreen"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            android.app.Activity r6 = r18.getContext()
            boolean r6 = r6.isFinishing()
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x00a7
            android.app.Activity r6 = r18.getContext()
            boolean r6 = r6.isDestroyed()
            if (r6 == 0) goto L_0x005a
            goto L_0x00a7
        L_0x005a:
            int r6 = r10.getHeight()
            if (r6 <= 0) goto L_0x00a3
            int r6 = r10.getWidth()
            if (r6 > 0) goto L_0x0067
            goto L_0x00a3
        L_0x0067:
            r6 = 2
            int[] r6 = new int[r6]
            r10.getLocationOnScreen(r6)
            r6 = r6[r7]
            int r9 = r10.getHeight()
            int r9 = r9 + r6
            java.lang.String r11 = "getTopVisiblePosition"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)
            android.view.ViewGroup r12 = r18.mo141610e3()
            int r12 = r12.getBottom()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            if (r9 <= r12) goto L_0x009f
            java.lang.String r9 = "getBottomVisiblePosition"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r2)
            int r11 = r18.getScreenHeight()
            int r12 = r18.getNavigationBarHeight()
            int r11 = r11 - r12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)
            if (r6 < r11) goto L_0x009a
            goto L_0x009f
        L_0x009a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            r5 = 1
            goto L_0x00ab
        L_0x009f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x00aa
        L_0x00a3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x00aa
        L_0x00a7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
        L_0x00aa:
            r5 = 0
        L_0x00ab:
            if (r5 == 0) goto L_0x0127
            java.lang.String r5 = "adExposeReport"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            gu2.b r6 = r4.getSnsInfo()
            if (r6 != 0) goto L_0x00bd
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x0028
        L_0x00bd:
            boolean r9 = r6.isAd()
            if (r9 != 0) goto L_0x00c8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x0028
        L_0x00c8:
            java.util.HashSet<tt2.a> r9 = r0.f300677o
            boolean r9 = r9.contains(r4)
            if (r9 == 0) goto L_0x00d5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x0028
        L_0x00d5:
            java.lang.String r9 = "MicroMsg.OldVersionUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            java.util.HashSet<tt2.a> r9 = r0.f300677o
            r9.add(r4)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r6.mo137505C2()
            int r14 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122254p(r9)
            jp2.o r9 = r0.f300669d
            int r4 = r4.getPosition()
            java.lang.String r11 = r6.mo137503A2()
            java.lang.String r12 = "isExposures"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            int r15 = r6.getLocalFlag()
            r15 = r15 & 128(0x80, float:1.794E-43)
            if (r15 <= 0) goto L_0x0103
            r15 = 1
            goto L_0x0104
        L_0x0103:
            r15 = 0
        L_0x0104:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            long r12 = r6.mo142401p2()
            com.tencent.mm.protocal.protobuf.SnsObject r16 = r6.mo137506D2()
            r17 = 1
            r6 = r9
            r7 = r4
            r8 = r11
            r9 = r15
            r11 = r12
            r13 = r16
            r15 = r17
            r6.mo138311r(r7, r8, r9, r10, r11, r13, r14, r15)
            jp2.o r4 = r0.f300669d
            r4.mo138300g()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x0028
        L_0x0127:
            r0.mo141608c3(r4)
            goto L_0x0028
        L_0x012c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut2.C102107v.mo141609d3(boolean):void");
    }

    /* renamed from: e3 */
    public final ViewGroup mo141610e3() {
        SnsMethodCalculate.markStartTimeMs("getAppbar", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        Object value = ((C36570n) this.f300675j).getValue();
        C87412m.m108593f(value, "<get-appbar>(...)");
        ViewGroup viewGroup = (ViewGroup) value;
        SnsMethodCalculate.markEndTimeMs("getAppbar", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return viewGroup;
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return Integer.MAX_VALUE;
    }

    public SnsInfo getItem(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        SnsInfo C2 = ((C98799a) ((C102279c) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C102279c.class)).mo141841d3().f272353o.get(i)).mo138170b().mo137505C2();
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return C2;
    }

    /* renamed from: h0 */
    public C96275w6 mo133189h0(int i) {
        SnsMethodCalculate.markStartTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        SnsInfo C2 = ((C98799a) ((C102279c) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C102279c.class)).mo141841d3().f272353o.get(i)).mo138170b().mo137505C2();
        SnsObject e = C94897n1.m120367e(C2);
        C87412m.m108593f(e, "getMergeSnsObject(info)");
        C96275w6 z0 = C102236a0.m134783z0(C2, e, getActivity(), this.f300670e, false, ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni(), C92093b.f263643a.mo126084a(), this.f300672g, this.f300673h, this.f300674i);
        SnsMethodCalculate.markEndTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return z0;
    }

    /* renamed from: l0 */
    public Vending<?, ?, ?> mo133190l0() {
        SnsMethodCalculate.markStartTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        SnsMethodCalculate.markEndTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return null;
    }

    public void notifyDataSetChanged() {
        SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsCommentFooter snsCommentFooter;
        SnsCommentFooter snsCommentFooter2;
        SnsCommentFooter snsCommentFooter3;
        SnsCommentFooter snsCommentFooter4;
        SnsCommentFooter snsCommentFooter5;
        SnsCommentFooter snsCommentFooter6;
        SnsCommentFooter snsCommentFooter7;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onActivityResult(i, i2, intent);
        if (i == 2333 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            if (!Util.isNullOrNil(stringExtra)) {
                C87412m.m108591d(stringExtra);
                Object[] array = new C66723k(",").mo90760e(stringExtra, 0).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                if (!(strArr.length == 0)) {
                    BaseTimeLine baseTimeLine = this.f300671f;
                    if (!(baseTimeLine == null || (snsCommentFooter7 = baseTimeLine.f276708r) == null)) {
                        snsCommentFooter7.mo132681C();
                    }
                    String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(strArr[0]);
                    if (!Util.isNullOrNil(displayName)) {
                        BaseTimeLine baseTimeLine2 = this.f300671f;
                        if (!(baseTimeLine2 == null || (snsCommentFooter6 = baseTimeLine2.f276708r) == null)) {
                            snsCommentFooter6.mo132696p();
                        }
                        BaseTimeLine baseTimeLine3 = this.f300671f;
                        if (!(baseTimeLine3 == null || (snsCommentFooter5 = baseTimeLine3.f276708r) == null)) {
                            snsCommentFooter5.setText('@' + displayName + ' ');
                        }
                        BaseTimeLine baseTimeLine4 = this.f300671f;
                        if (!(baseTimeLine4 == null || (snsCommentFooter4 = baseTimeLine4.f276708r) == null)) {
                            snsCommentFooter4.setCommentAtPrefix('@' + displayName + ' ');
                        }
                        BaseTimeLine baseTimeLine5 = this.f300671f;
                        if (!(baseTimeLine5 == null || (snsCommentFooter3 = baseTimeLine5.f276708r) == null)) {
                            snsCommentFooter3.setCommentInfo(new w64());
                        }
                        BaseTimeLine baseTimeLine6 = this.f300671f;
                        w64 commentInfo = (baseTimeLine6 == null || (snsCommentFooter2 = baseTimeLine6.f276708r) == null) ? null : snsCommentFooter2.getCommentInfo();
                        if (commentInfo != null) {
                            commentInfo.f299703d = strArr[0];
                        }
                        BaseTimeLine baseTimeLine7 = this.f300671f;
                        if (!(baseTimeLine7 == null || (snsCommentFooter = baseTimeLine7.f276708r) == null)) {
                            snsCommentFooter.setCommentFlag(8);
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C98249r.m126976a();
        C98249r.f288050e.mo137554e();
        C98241o.m126934a();
        C98241o.f288030d.mo137542d();
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public void onCreate(Bundle bundle) {
        C95733b bVar;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onCreate(bundle);
        C98249r.m126976a();
        C98249r rVar = C98249r.f288050e;
        rVar.mo137554e();
        C98241o.m126934a();
        C98241o oVar = C98241o.f288030d;
        oVar.mo137542d();
        C98249r.m126976a();
        rVar.mo137555g(getActivity());
        C98241o.m126934a();
        oVar.mo137543e(getActivity());
        SnsMethodCalculate.markStartTimeMs("handleAdExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        getRecycleView().mo17043c(this.f300680r);
        getRecycleView().mo17088i0(this);
        SnsMethodCalculate.markEndTimeMs("handleAdExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        Intent intent = getActivity().getIntent();
        BaseTimeLine baseTimeLine = new BaseTimeLine(getActivity(), intent.getBooleanExtra("is_sns_notify_open", true) ? 1 : 0, Util.nullAs(intent.getStringExtra("new_feed_id"), ""), intent.getIntExtra("sns_unread_count", 0), String.valueOf(System.currentTimeMillis()));
        this.f300671f = baseTimeLine;
        baseTimeLine.mo132092n(this.f300669d);
        BaseTimeLine baseTimeLine2 = this.f300671f;
        if (baseTimeLine2 != null) {
            View decorView = getActivity().getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            baseTimeLine2.f276709s = (FrameLayout) decorView;
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        BaseTimeLine baseTimeLine3 = this.f300671f;
        C99020a aVar = null;
        this.f300670e = new SnsTimeLineBaseAdapter(mMActivity, (ListView) null, baseTimeLine3 != null ? baseTimeLine3.f276693D : null, baseTimeLine3, 10, this);
        Log.m105924i("MicroMsg.OldVersionUIC", "onCreate");
        BaseTimeLine baseTimeLine4 = this.f300671f;
        if (baseTimeLine4 != null) {
            AppCompatActivity activity2 = getActivity();
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f300670e;
            BaseTimeLine baseTimeLine5 = this.f300671f;
            baseTimeLine4.f276715y = new C96104o8(activity2, snsTimeLineBaseAdapter, baseTimeLine5 != null ? baseTimeLine5.f276709s : null, (View) null);
        }
        BaseTimeLine baseTimeLine6 = this.f300671f;
        if (baseTimeLine6 != null) {
            baseTimeLine6.f276707q = this.f300670e;
        }
        if (baseTimeLine6 != null) {
            baseTimeLine6.f276708r = (SnsCommentFooter) getActivity().findViewById(C0966R.C0970id.bjo);
        }
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = this.f300670e;
        if (snsTimeLineBaseAdapter2 != null) {
            SnsMethodCalculate.markStartTimeMs("setCommentEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            snsTimeLineBaseAdapter2.f278550B = this;
            SnsMethodCalculate.markEndTimeMs("setCommentEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        BaseTimeLine baseTimeLine7 = this.f300671f;
        if (baseTimeLine7 != null) {
            Activity context = getContext();
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter3 = this.f300670e;
            TimelineClickListener timelineClickListener = snsTimeLineBaseAdapter3 != null ? snsTimeLineBaseAdapter3.f278572f : null;
            BaseTimeLine baseTimeLine8 = this.f300671f;
            baseTimeLine7.f276690A = new C99020a(context, timelineClickListener, baseTimeLine8 != null ? baseTimeLine8.f276709s : null, (View) null);
        }
        BaseTimeLine baseTimeLine9 = this.f300671f;
        if (baseTimeLine9 != null) {
            Activity context2 = getContext();
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter4 = this.f300670e;
            TimelineClickListener timelineClickListener2 = snsTimeLineBaseAdapter4 != null ? snsTimeLineBaseAdapter4.f278572f : null;
            BaseTimeLine baseTimeLine10 = this.f300671f;
            FrameLayout frameLayout = baseTimeLine10 != null ? baseTimeLine10.f276709s : null;
            if (baseTimeLine10 != null) {
                aVar = baseTimeLine10.f276690A;
            }
            baseTimeLine9.f276716z = new C95733b(context2, timelineClickListener2, frameLayout, (View) null, aVar);
        }
        BaseTimeLine baseTimeLine11 = this.f300671f;
        if (!(baseTimeLine11 == null || (bVar = baseTimeLine11.f276716z) == null)) {
            C98963o oVar2 = this.f300669d;
            SnsMethodCalculate.markStartTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            bVar.f279211d = oVar2;
            SnsMethodCalculate.markEndTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        }
        C86709a0.m107529k().f251779b.mo123455a(218, this);
        this.f300669d.mo138319z((getScreenHeight() - mo141610e3().getBottom()) - getStatusBarHeight(), mo141610e3(), getContext());
        this.f300669d.mo138300g();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onDestroy();
        Log.m105924i("MicroMsg.OldVersionUIC", "onDestroy");
        this.f300670e = null;
        BaseTimeLine baseTimeLine = this.f300671f;
        if (baseTimeLine != null) {
            baseTimeLine.mo132082d();
        }
        this.f300671f = null;
        this.f300672g.clear();
        this.f300673h.clear();
        this.f300674i.clear();
        C86709a0.m107529k().f251779b.mo123470p(218, this);
        C98249r.m126976a();
        C98249r.f288050e.mo137555g((Activity) null);
        C98241o.m126934a();
        C98241o.f288030d.mo137543e((Activity) null);
        this.f300669d.mo138302i();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onPause();
        this.f300669d.mo138313t();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onResume();
        Log.m105924i("MicroMsg.OldVersionUIC", "onResume");
        this.f300669d.mo138315v();
        new SnsOldItemContactEvent().publish();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C39622i0 a;
        C89779i0 i0Var;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        if (yVar != null && yVar.getType() == 218) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            C94877g0 g0Var = (C94877g0) yVar;
            if (g0Var.mo131050m1() == 1 || g0Var.mo131050m1() == 6 || g0Var.mo131050m1() == 4) {
                BaseTimeLine baseTimeLine = this.f300671f;
                if (!(baseTimeLine == null || (i0Var = baseTimeLine.f276694E) == null)) {
                    i0Var.dismiss();
                }
                Class cls = C60631e.class;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (C60247c.class.isAssignableFrom(cls)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                long j = g0Var.f274934g;
                SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                int i3 = C98802d.f289652e;
                SnsMethodCalculate.markStartTimeMs("postADInfoUpdateEventBySnsID$default", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
                ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).mo138175e3(j, StorageEventId.Companion.getUPDATE());
                SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventBySnsID$default", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    /* renamed from: z2 */
    public void mo17333z2(View view) {
        SnsMethodCalculate.markStartTimeMs("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        C87412m.m108594g(view, "view");
        if (view instanceof C101926a) {
            C98214b snsInfo = ((C101926a) view).getSnsInfo();
            boolean z = true;
            if (snsInfo == null || !snsInfo.isAd()) {
                z = false;
            }
            if (z) {
                this.f300676n.add(view);
                mo141609d3(false);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }
}
