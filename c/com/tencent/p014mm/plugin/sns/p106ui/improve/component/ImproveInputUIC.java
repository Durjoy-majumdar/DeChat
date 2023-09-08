package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96213s;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveOverScrollView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import o40.C61926c;
import pt2.C100905b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.w64;
import ut2.C102084a;
import ut2.C102090e;
import ut2.C102091f;
import ut2.C102092g;
import ut2.C102093h;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC */
public final class ImproveInputUIC extends C102084a implements ImproveOverScrollView.C95894a {

    /* renamed from: d */
    public final C13601g f279643d;

    /* renamed from: e */
    public final C13601g f279644e = C36568h.m40985a(new C95824b(this));

    /* renamed from: f */
    public final C13601g f279645f = C36568h.m40985a(new C95826d(this));

    /* renamed from: g */
    public final C13601g f279646g = C36568h.m40985a(C95829g.f279667d);

    /* renamed from: h */
    public final C13601g f279647h = C36568h.m40985a(new C95828f(this));

    /* renamed from: i */
    public final List<C96213s> f279648i = new LinkedList();

    /* renamed from: j */
    public String f279649j = "";

    /* renamed from: n */
    public int f279650n = -1;

    /* renamed from: o */
    public final ImproveInputUIC$inputListener$1 f279651o;

    /* renamed from: p */
    public final ImproveInputUIC$replyListener$1 f279652p;

    /* renamed from: q */
    public final ImproveInputUIC$inputScrollListener$1 f279653q;

    /* renamed from: r */
    public final ImproveInputUIC$unreadScrollListener$1 f279654r;

    /* renamed from: s */
    public final ImproveInputUIC$feedRelocateListener$1 f279655s;

    /* renamed from: t */
    public String f279656t;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$a */
    public static final class C95823a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImproveInputUIC f279657d;

        /* renamed from: e */
        public final /* synthetic */ View f279658e;

        /* renamed from: f */
        public final /* synthetic */ int f279659f;

        /* renamed from: g */
        public final /* synthetic */ int f279660g;

        public C95823a(ImproveInputUIC improveInputUIC, View view, int i, int i2) {
            this.f279657d = improveInputUIC;
            this.f279658e = view;
            this.f279659f = i;
            this.f279660g = i2;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$checkFixScrollUtilMatchViewBottom$1");
            SnsMethodCalculate.markStartTimeMs("access$checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            this.f279657d.mo133286f3(this.f279658e, this.f279659f, false, this.f279660g - 1);
            SnsMethodCalculate.markEndTimeMs("access$checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$checkFixScrollUtilMatchViewBottom$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$b */
    public static final class C95824b extends C87413o implements C32224a<SnsCommentFooter> {

        /* renamed from: d */
        public final /* synthetic */ ImproveInputUIC f279661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95824b(ImproveInputUIC improveInputUIC) {
            super(0);
            this.f279661d = improveInputUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentFooter$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentFooter$2");
            SnsCommentFooter snsCommentFooter = (SnsCommentFooter) this.f279661d.findViewById(C0966R.C0970id.bjo);
            ImproveInputUIC improveInputUIC = this.f279661d;
            C87412m.m108593f(snsCommentFooter, "view");
            SnsMethodCalculate.markStartTimeMs("access$initComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            improveInputUIC.getClass();
            SnsMethodCalculate.markStartTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            snsCommentFooter.setAfterEditAction((Runnable) null);
            snsCommentFooter.setOnCommentSendImp(new C102090e(improveInputUIC));
            SnsMethodCalculate.markEndTimeMs("initComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            SnsMethodCalculate.markEndTimeMs("access$initComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentFooter$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentFooter$2");
            return snsCommentFooter;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$c */
    public static final class C95825c extends C87413o implements C32224a<C100905b> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f279662d;

        /* renamed from: e */
        public final /* synthetic */ ImproveInputUIC f279663e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95825c(AppCompatActivity appCompatActivity, ImproveInputUIC improveInputUIC) {
            super(0);
            this.f279662d = appCompatActivity;
            this.f279663e = improveInputUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentKeyBoardStateDelegate$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentKeyBoardStateDelegate$2");
            AppCompatActivity appCompatActivity = this.f279662d;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C100905b bVar = new C100905b((MMActivity) appCompatActivity, ImproveInputUIC.m122695c3(this.f279663e));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentKeyBoardStateDelegate$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentKeyBoardStateDelegate$2");
            return bVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$d */
    public static final class C95826d extends C87413o implements C32224a<CoordinatorLayout> {

        /* renamed from: d */
        public final /* synthetic */ ImproveInputUIC f279664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95826d(ImproveInputUIC improveInputUIC) {
            super(0);
            this.f279664d = improveInputUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$coordinatorLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$coordinatorLayout$2");
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f279664d.findViewById(C0966R.C0970id.oev);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$coordinatorLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$coordinatorLayout$2");
            return coordinatorLayout;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$e */
    public static final class C95827e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImproveInputUIC f279665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95827e(ImproveInputUIC improveInputUIC) {
            super(0);
            this.f279665d = improveInputUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$hideFooter$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$hideFooter$1");
            if (ImproveInputUIC.m122695c3(this.f279665d).getVisibility() == 0) {
                ImproveInputUIC.m122695c3(this.f279665d).setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$hideFooter$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$hideFooter$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$f */
    public static final class C95828f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ ImproveInputUIC f279666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95828f(ImproveInputUIC improveInputUIC) {
            super(0);
            this.f279666d = improveInputUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$minHeight$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$minHeight$2");
            Integer valueOf = Integer.valueOf((C75044y4.m89994f(this.f279666d.getContext()) + C76577a.m92157h(this.f279666d.getContext(), C0966R.dimen.f3679b9)) - C76577a.m92157h(this.f279666d.getContext(), C0966R.dimen.aop));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$minHeight$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$minHeight$2");
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$g */
    public static final class C95829g extends C87413o implements C32224a<C44668u3> {

        /* renamed from: d */
        public static final C95829g f279667d = new C95829g();

        public C95829g() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$stg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$stg$2");
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$stg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$stg$2");
            return Ni;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveInputUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f279643d = C36568h.m40985a(new C95825c(appCompatActivity, this));
        this.f279651o = new ImproveInputUIC$inputListener$1(appCompatActivity, this);
        this.f279652p = new ImproveInputUIC$replyListener$1(appCompatActivity, this);
        this.f279653q = new ImproveInputUIC$inputScrollListener$1(appCompatActivity, this);
        this.f279654r = new ImproveInputUIC$unreadScrollListener$1(appCompatActivity, this);
        this.f279655s = new ImproveInputUIC$feedRelocateListener$1(appCompatActivity, this);
        this.f279656t = "";
    }

    /* renamed from: c3 */
    public static final /* synthetic */ SnsCommentFooter m122695c3(ImproveInputUIC improveInputUIC) {
        SnsMethodCalculate.markStartTimeMs("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsCommentFooter i3 = improveInputUIC.mo133288i3();
        SnsMethodCalculate.markEndTimeMs("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return i3;
    }

    /* renamed from: d3 */
    public static final void m122696d3(ImproveInputUIC improveInputUIC, View view, C98214b bVar, w64 w64) {
        SnsMethodCalculate.markStartTimeMs("access$replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.getClass();
        SnsMethodCalculate.markStartTimeMs("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        Log.m105924i("MicroMsg.Improve.InputUIC", "replayComment");
        SnsMethodCalculate.markStartTimeMs("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        Object value = ((C36570n) improveInputUIC.f279646g).getValue();
        C87412m.m108593f(value, "<get-stg>(...)");
        SnsMethodCalculate.markEndTimeMs("getStg", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        String str = improveInputUIC.getContext().getString(C0966R.string.jgh) + C102236a0.m134782z(w64, (C44668u3) value);
        String str2 = bVar.mo137504B2() + str;
        improveInputUIC.f279649j = str2;
        improveInputUIC.mo133288i3().setTag(bVar.mo137505C2());
        improveInputUIC.mo133288i3().setVisibility(0);
        improveInputUIC.mo133288i3().mo132719x(improveInputUIC.mo133287g3(str2, 0));
        improveInputUIC.mo133288i3().setCommentHint(str + improveInputUIC.getContext().getString(C0966R.string.jan));
        improveInputUIC.mo133288i3().setSnsInfo(bVar.mo137505C2());
        improveInputUIC.mo133285e3(bVar);
        improveInputUIC.mo133288i3().setCommentInfo(w64);
        improveInputUIC.mo133288i3().mo132679A(BaseTimeLine.f276689H, str2);
        improveInputUIC.mo133288i3().post(new C102091f(improveInputUIC));
        improveInputUIC.mo133288i3().mo132680B(false);
        improveInputUIC.mo133294o3(view, improveInputUIC.mo133288i3());
        SnsMethodCalculate.markEndTimeMs("replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsMethodCalculate.markEndTimeMs("access$replayComment", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    /* renamed from: Z1 */
    public boolean mo133284Z1(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        C87412m.m108594g(motionEvent, "ev");
        SnsMethodCalculate.markStartTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        boolean z = mo133288i3().getVisibility() == 0;
        SnsMethodCalculate.markEndTimeMs("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if (!z || isTouchPointInView(mo133288i3(), motionEvent)) {
            SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            return false;
        }
        mo133292m3();
        SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return true;
    }

    /* renamed from: e3 */
    public final void mo133285e3(C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if ((bVar.mo137509G2().ContentObj.f298428i & 128) != 0) {
            mo133288i3().setFeedEmojiCommentEnable(false);
        } else {
            mo133288i3().setFeedEmojiCommentEnable(true);
        }
        SnsMethodCalculate.markEndTimeMs("checkFeedCommentEmojiEnable", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    /* renamed from: f3 */
    public final void mo133286f3(View view, int i, boolean z, int i2) {
        SnsMethodCalculate.markStartTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else if (i2 == 0) {
            Log.m105924i("MicroMsg.Improve.InputUIC", "checkFixScrollUtilMatchViewBottom: left count=0, skip");
            SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else {
            int l3 = mo133291l3(view);
            int i3 = this.f279650n;
            if (i3 == -1) {
                this.f279650n = l3;
            } else if (i3 == l3) {
                Log.m105924i("MicroMsg.Improve.InputUIC", "checkFixScrollUtilMatchViewBottom: skip");
                this.f279650n = -1;
                SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                return;
            }
            int i4 = i - l3;
            Log.m105924i("MicroMsg.Improve.InputUIC", "checkFixScrollUtilMatchViewBottom: targetY:" + i + ", viewBottomRawY:" + l3 + ", needScrollY:" + i4);
            getRecycleView().scrollBy(0, -i4);
            if (i4 != 0 || z) {
                getRecycleView().postDelayed(new C95823a(this, view, i, i2), 50);
                SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
                return;
            }
            this.f279650n = -1;
            SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        }
    }

    /* renamed from: g3 */
    public final int mo133287g3(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        Iterator<C96213s> it = this.f279648i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C96213s next = it.next();
            if (Util.isEqual(next.f281156a, str)) {
                i = next.f281158c;
                break;
            }
        }
        SnsMethodCalculate.markEndTimeMs("genCommentFlag", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return i;
    }

    /* renamed from: i3 */
    public final SnsCommentFooter mo133288i3() {
        SnsMethodCalculate.markStartTimeMs("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        Object value = ((C36570n) this.f279644e).getValue();
        C87412m.m108593f(value, "<get-commentFooter>(...)");
        SnsCommentFooter snsCommentFooter = (SnsCommentFooter) value;
        SnsMethodCalculate.markEndTimeMs("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return snsCommentFooter;
    }

    /* renamed from: j3 */
    public final C100905b mo133289j3() {
        SnsMethodCalculate.markStartTimeMs("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        C100905b bVar = (C100905b) ((C36570n) this.f279643d).getValue();
        SnsMethodCalculate.markEndTimeMs("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return bVar;
    }

    /* renamed from: k3 */
    public final int mo133290k3() {
        SnsMethodCalculate.markStartTimeMs("getMinHeight", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        int intValue = ((Number) ((C36570n) this.f279647h).getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getMinHeight", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return intValue;
    }

    /* renamed from: l3 */
    public final int mo133291l3(View view) {
        SnsMethodCalculate.markStartTimeMs("getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        Log.m105924i("MicroMsg.Improve.InputUIC", "getViewBottomRawY: rawTopY=" + i + ", viewHeight:" + view.getHeight());
        int height = iArr[1] + view.getHeight();
        SnsMethodCalculate.markEndTimeMs("getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return height;
    }

    /* renamed from: m3 */
    public final void mo133292m3() {
        SnsMethodCalculate.markStartTimeMs("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        C61926c.m72668M(new C95827e(this));
        SnsMethodCalculate.markEndTimeMs("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    /* renamed from: n3 */
    public final void mo133293n3(View view, SnsCommentFooter snsCommentFooter, int i) {
        SnsMethodCalculate.markStartTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        int[] iArr = new int[2];
        snsCommentFooter.getLocationInWindow(iArr);
        int i2 = i - iArr[1];
        if (i2 == 0) {
            SnsMethodCalculate.markEndTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            return;
        }
        float y = getRecycleView().getY() - ((float) mo133290k3());
        StringBuilder sb = new StringBuilder();
        sb.append("item viewAttached:");
        sb.append(view.isAttachedToWindow());
        sb.append(", height:");
        sb.append(view.getHeight());
        sb.append(", bottom:");
        sb.append(i);
        sb.append(" foot top:");
        sb.append(iArr[1]);
        sb.append(" need scroll dy:");
        sb.append(i2);
        sb.append(" height:");
        SnsMethodCalculate.markStartTimeMs("getCoordinatorLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        Object value = ((C36570n) this.f279645f).getValue();
        C87412m.m108593f(value, "<get-coordinatorLayout>(...)");
        SnsMethodCalculate.markEndTimeMs("getCoordinatorLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        sb.append(((CoordinatorLayout) value).getHeight());
        sb.append(" distance:");
        sb.append(y);
        sb.append("  distance + scrollY:");
        float f = (float) i2;
        sb.append(y + f);
        Log.m105924i("MicroMsg.Improve.InputUIC", sb.toString());
        if (y > 0.0f) {
            ViewGroup.LayoutParams layoutParams = getAppBarLayout().getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C103717e) layoutParams).f306328a;
            C87412m.m108592e(behavior, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
            AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
            if (y - f > 0.0f) {
                behavior2.mo146260y(behavior2.mo146259w() + (-i2));
            } else {
                behavior2.mo146260y(-(getAppBarLayout().getHeight() - mo133290k3()));
                getRecycleView().scrollBy(0, (int) (f - y));
            }
            getAppBarLayout().requestLayout();
        } else {
            RecyclerView.C16631z I0 = getRecycleView().mo17023I0(0);
            if (I0 != null) {
                int[] iArr2 = new int[2];
                I0.f44854d.getLocationInWindow(iArr2);
                int h = iArr2[1] - C76577a.m92157h(getContext(), C0966R.dimen.aop);
                int i3 = -i2;
                if (mo133290k3() - h > i3) {
                    getRecycleView().scrollBy(0, i2);
                } else {
                    getRecycleView().scrollBy(0, h - mo133290k3());
                    ViewGroup.LayoutParams layoutParams2 = getAppBarLayout().getLayoutParams();
                    C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                    CoordinatorLayout.Behavior behavior3 = ((CoordinatorLayout.C103717e) layoutParams2).f306328a;
                    C87412m.m108592e(behavior3, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
                    AppBarLayout.Behavior behavior4 = (AppBarLayout.Behavior) behavior3;
                    behavior4.mo146260y(behavior4.mo146259w() + (i3 - (mo133290k3() - h)));
                    getAppBarLayout().requestLayout();
                }
            } else {
                getRecycleView().scrollBy(0, i2);
                mo133293n3(view, snsCommentFooter, view.isAttachedToWindow() ? mo133291l3(view) : i - i2);
            }
        }
        SnsMethodCalculate.markEndTimeMs("scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    /* renamed from: o3 */
    public final void mo133294o3(View view, SnsCommentFooter snsCommentFooter) {
        SnsMethodCalculate.markStartTimeMs("waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        if (Build.VERSION.SDK_INT >= 30) {
            SnsMethodCalculate.markStartTimeMs("scrollRecyclerViewToInputView_R", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            snsCommentFooter.setWindowInsetsAnimationCallback(new C102093h(this, view, snsCommentFooter, mo133291l3(view)));
            SnsMethodCalculate.markEndTimeMs("scrollRecyclerViewToInputView_R", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        } else {
            SnsMethodCalculate.markStartTimeMs("scrollRecyclerViewToInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
            C8478d0 d0Var = new C8478d0();
            C8478d0 d0Var2 = new C8478d0();
            d0Var2.f27483d = 10;
            new MMHandler().postDelayed(new C102092g(this, d0Var2, d0Var, snsCommentFooter, view), 90);
            SnsMethodCalculate.markEndTimeMs("scrollRecyclerViewToInputView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        }
        SnsMethodCalculate.markEndTimeMs("waitCommentFooterShowAndScrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public boolean onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        mo133292m3();
        boolean onBackPressed = super.onBackPressed();
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        return onBackPressed;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.Improve.InputUIC", "onCreate: ");
        this.f279651o.alive();
        this.f279652p.alive();
        this.f279653q.alive();
        this.f279654r.alive();
        this.f279655s.alive();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onDestroy();
        this.f279651o.dead();
        this.f279652p.dead();
        this.f279653q.dead();
        this.f279654r.dead();
        this.f279655s.dead();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onPause();
        mo133289j3().mo140369a();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onResume();
        mo133289j3().mo140372d();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }

    public void onWindowFocusChanged(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        super.onWindowFocusChanged(z);
        if (z) {
            mo133289j3().mo140372d();
        }
        SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
    }
}
