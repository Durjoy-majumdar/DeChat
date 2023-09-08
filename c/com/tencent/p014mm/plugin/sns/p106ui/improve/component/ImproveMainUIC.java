package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import a14.C0000n0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import androidx.recyclerview.widget.RecyclerView;
import au2.C39636a;
import au2.C92093b;
import bl3.C0317e;
import bl3.C39818r;
import bv2.C92311a;
import bv2.C92312b;
import bv2.C92313c;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.sns.model.C94843b1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.p106ui.C43162z1;
import com.tencent.p014mm.plugin.sns.p106ui.C95790g2;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveLoadingMoreView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveRecycleHeaderView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98799a;
import iu2.C98802d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ju2.C33694a;
import ju2.C99042b;
import ju2.C99044d;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import o40.C61926c;
import os2.C100422y;
import p700tq.C64995b;
import p849e3.C58525r;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import ut2.C102084a;
import ut2.C102096l;
import ut2.C102097m;
import ut2.C102098n;
import ut2.C102100o;
import ut2.C102104r;
import ut2.C102107v;
import ut2.C102110w;
import ut2.C65477j;
import ut2.C65478p;
import vt2.C102279c;
import wt2.C102497b;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC;", "Lut2/a;", "Lcom/tencent/mm/plugin/sns/model/p2$e;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC */
public final class ImproveMainUIC extends C102084a implements C94928p2.C94933e {

    /* renamed from: d */
    public final C13601g f279673d;

    /* renamed from: e */
    public final C13601g f279674e = C36568h.m40985a(C30469i.f82126d);

    /* renamed from: f */
    public final C13601g f279675f;

    /* renamed from: g */
    public int f279676g;

    /* renamed from: h */
    public C53973z1 f279677h;

    /* renamed from: i */
    public long f279678i;

    /* renamed from: j */
    public final C99042b f279679j;

    /* renamed from: n */
    public final C13601g f279680n;

    /* renamed from: o */
    public final C13601g f279681o;

    /* renamed from: p */
    public final C13601g f279682p;

    /* renamed from: q */
    public final C13601g f279683q;

    /* renamed from: r */
    public C89779i0 f279684r;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$i */
    public static final class C30469i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30469i f82126d = new C30469i();

        public C30469i() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$improveImageLoad$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$improveImageLoad$2");
            Boolean valueOf = Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_image_load, true));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$improveImageLoad$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$improveImageLoad$2");
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$b */
    public static final class C71241b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveMainUIC f206184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71241b(ImproveMainUIC improveMainUIC) {
            super(0);
            this.f206184d = improveMainUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$appBarContent$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$appBarContent$2");
            View findViewById = this.f206184d.findViewById(C0966R.C0970id.f358454of3);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$appBarContent$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$appBarContent$2");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$c */
    public static final class C71242c extends C87413o implements C32224a<C33694a> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f206185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71242c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f206185d = appCompatActivity;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$autoPlayManager$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$autoPlayManager$2");
            C33694a aVar = new C33694a((int) (((double) this.f206185d.getResources().getDisplayMetrics().heightPixels) * 0.4d));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$autoPlayManager$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$autoPlayManager$2");
            return aVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$d */
    public static final class C71243d extends C87413o implements C32224a<ImproveLoadingMoreView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveMainUIC f206186d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71243d(ImproveMainUIC improveMainUIC) {
            super(0);
            this.f206186d = improveMainUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$bottomLoadingView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$bottomLoadingView$2");
            ImproveLoadingMoreView improveLoadingMoreView = new ImproveLoadingMoreView(this.f206186d.getContext());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$bottomLoadingView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$bottomLoadingView$2");
            return improveLoadingMoreView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$n */
    public static final class C71244n extends C87413o implements C32224a<ImproveRecycleHeaderView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveMainUIC f206187d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71244n(ImproveMainUIC improveMainUIC) {
            super(0);
            this.f206187d = improveMainUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$recyclerViewHeader$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$recyclerViewHeader$2");
            ImproveRecycleHeaderView improveRecycleHeaderView = new ImproveRecycleHeaderView(this.f206187d.getContext());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$recyclerViewHeader$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$recyclerViewHeader$2");
            return improveRecycleHeaderView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$a */
    public static final class C95830a extends C87413o implements C32224a<C102110w> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f279685d;

        /* renamed from: e */
        public final /* synthetic */ ImproveMainUIC f279686e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95830a(AppCompatActivity appCompatActivity, ImproveMainUIC improveMainUIC) {
            super(0);
            this.f279685d = appCompatActivity;
            this.f279686e = improveMainUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$adapter$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$adapter$2");
            MvvmList<C98799a> d3 = ((C102279c) C39818r.f106831a.mo62444c(this.f279685d).mo75002a(C102279c.class)).mo141841d3();
            ImproveMainUIC improveMainUIC = this.f279686e;
            SnsMethodCalculate.markStartTimeMs("access$buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            improveMainUIC.getClass();
            SnsMethodCalculate.markStartTimeMs("buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            ImproveMainUIC$buildItemConvertFactory$1 improveMainUIC$buildItemConvertFactory$1 = new ImproveMainUIC$buildItemConvertFactory$1(improveMainUIC);
            SnsMethodCalculate.markEndTimeMs("buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            SnsMethodCalculate.markEndTimeMs("access$buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            C102110w wVar = new C102110w(d3, improveMainUIC$buildItemConvertFactory$1);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$adapter$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$adapter$2");
            return wVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC", mo125469f = "ImproveMainUIC.kt", mo125470l = {394}, mo125471m = "controlImageLoad")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$e */
    public static final class C95831e extends C66704d {

        /* renamed from: d */
        public Object f279687d;

        /* renamed from: e */
        public /* synthetic */ Object f279688e;

        /* renamed from: f */
        public final /* synthetic */ ImproveMainUIC f279689f;

        /* renamed from: g */
        public int f279690g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95831e(ImproveMainUIC improveMainUIC, C15601d<? super C95831e> dVar) {
            super(dVar);
            this.f279689f = improveMainUIC;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$controlImageLoad$1");
            this.f279688e = obj;
            this.f279690g |= Integer.MIN_VALUE;
            ImproveMainUIC improveMainUIC = this.f279689f;
            SnsMethodCalculate.markStartTimeMs("access$controlImageLoad", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            Object e3 = improveMainUIC.mo133296e3((C102104r) null, 0, this);
            SnsMethodCalculate.markEndTimeMs("access$controlImageLoad", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$controlImageLoad$1");
            return e3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$f */
    public static final class C95832f extends C87413o implements C32224a<C102497b> {

        /* renamed from: d */
        public final /* synthetic */ ImproveMainUIC f279691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95832f(ImproveMainUIC improveMainUIC) {
            super(0);
            this.f279691d = improveMainUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$errorPostHandle$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$errorPostHandle$2");
            C0000n0 lifecycleScope = this.f279691d.getLifecycleScope();
            ImproveMainUIC improveMainUIC = this.f279691d;
            SnsMethodCalculate.markStartTimeMs("access$getRecyclerViewHeader", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            ImproveRecycleHeaderView j3 = improveMainUIC.mo133300j3();
            SnsMethodCalculate.markEndTimeMs("access$getRecyclerViewHeader", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            View findViewById = j3.findViewById(C0966R.C0970id.f358452of1);
            C87412m.m108593f(findViewById, "recyclerViewHeader.findV…d.improve_sns_error_list)");
            C102497b bVar = new C102497b(lifecycleScope, (LinearLayout) findViewById);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$errorPostHandle$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$errorPostHandle$2");
            return bVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC", mo125469f = "ImproveMainUIC.kt", mo125470l = {371, 373, 382}, mo125471m = "handleScrollEvent")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$g */
    public static final class C95833g extends C66704d {

        /* renamed from: d */
        public Object f279692d;

        /* renamed from: e */
        public Object f279693e;

        /* renamed from: f */
        public int f279694f;

        /* renamed from: g */
        public /* synthetic */ Object f279695g;

        /* renamed from: h */
        public final /* synthetic */ ImproveMainUIC f279696h;

        /* renamed from: i */
        public int f279697i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95833g(ImproveMainUIC improveMainUIC, C15601d<? super C95833g> dVar) {
            super(dVar);
            this.f279696h = improveMainUIC;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$1");
            this.f279695g = obj;
            this.f279697i |= Integer.MIN_VALUE;
            ImproveMainUIC improveMainUIC = this.f279696h;
            SnsMethodCalculate.markStartTimeMs("access$handleScrollEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            Object k3 = improveMainUIC.mo133301k3((RecyclerView) null, (C102104r) null, 0, this);
            SnsMethodCalculate.markEndTimeMs("access$handleScrollEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$1");
            return k3;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2", mo125469f = "ImproveMainUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$h */
    public static final class C95834h extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveMainUIC f279698d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95834h(ImproveMainUIC improveMainUIC, C15601d<? super C95834h> dVar) {
            super(2, dVar);
            this.f279698d = improveMainUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
            C95834h hVar = new C95834h(this.f279698d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
            return hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
            Object invokeSuspend = ((C95834h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
            ResultKt.throwOnFailure(obj);
            SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            C61926c.m72668M(new C99044d(false));
            SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
            C43162z1 z1Var = C39636a.f106397a;
            SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
            if (z1Var != null) {
                z1Var.mo67390c();
            }
            C39818r rVar = C39818r.f106831a;
            ((ImproveInputUIC) rVar.mo62444c(this.f279698d.getActivity()).mo75002a(ImproveInputUIC.class)).mo133292m3();
            Boolean valueOf = Boolean.valueOf(((C102107v) rVar.mo62444c(this.f279698d.getActivity()).mo75002a(C102107v.class)).mo132950a1());
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$j */
    public static final class C95835j implements C94843b1.C94844a {

        /* renamed from: a */
        public final /* synthetic */ ImproveMainUIC f279699a;

        public C95835j(ImproveMainUIC improveMainUIC) {
            this.f279699a = improveMainUIC;
        }

        /* renamed from: k */
        public final void mo130966k() {
            SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onCreate$1");
            ImproveMainUIC improveMainUIC = this.f279699a;
            SnsMethodCalculate.markStartTimeMs("access$getErrorPostHandle", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            C102497b i3 = improveMainUIC.mo133299i3();
            SnsMethodCalculate.markEndTimeMs("access$getErrorPostHandle", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            i3.mo142115a();
            SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onCreate$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$k */
    public static final class C95836k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f279700d;

        /* renamed from: e */
        public final /* synthetic */ ImproveMainUIC f279701e;

        public C95836k(View view, ImproveMainUIC improveMainUIC) {
            this.f279700d = view;
            this.f279701e = improveMainUIC;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onResume$$inlined$doOnPreDraw$1");
            Log.m105924i("MicroMsg.Improve.MainUIC", "onResume doOnPreDraw onScrollStateChanged");
            ImproveMainUIC improveMainUIC = this.f279701e;
            ImproveMainUIC.m122709d3(improveMainUIC, improveMainUIC.getRecycleView(), 0);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onResume$$inlined$doOnPreDraw$1");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC", mo125469f = "ImproveMainUIC.kt", mo125470l = {357}, mo125471m = "onScrollStateChanged")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$l */
    public static final class C95837l extends C66704d {

        /* renamed from: d */
        public Object f279702d;

        /* renamed from: e */
        public /* synthetic */ Object f279703e;

        /* renamed from: f */
        public final /* synthetic */ ImproveMainUIC f279704f;

        /* renamed from: g */
        public int f279705g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95837l(ImproveMainUIC improveMainUIC, C15601d<? super C95837l> dVar) {
            super(dVar);
            this.f279704f = improveMainUIC;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
            this.f279703e = obj;
            this.f279705g |= Integer.MIN_VALUE;
            Object onScrollStateChanged = this.f279704f.onScrollStateChanged((RecyclerView) null, (C102104r) null, 0, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$2");
            return onScrollStateChanged;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3", mo125469f = "ImproveMainUIC.kt", mo125470l = {360}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$m */
    public static final class C95838m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f279706d;

        /* renamed from: e */
        public final /* synthetic */ ImproveMainUIC f279707e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95838m(ImproveMainUIC improveMainUIC, C15601d<? super C95838m> dVar) {
            super(2, dVar);
            this.f279707e = improveMainUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
            C95838m mVar = new C95838m(this.f279707e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
            return mVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
            Object invokeSuspend = ((C95838m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f279706d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImproveMainUIC improveMainUIC = this.f279707e;
                this.f279706d = 1;
                if (ImproveMainUIC.m122708c3(improveMainUIC, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$3");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveMainUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f279673d = C36568h.m40985a(new C95830a(appCompatActivity, this));
        this.f279675f = C36568h.m40985a(new C71242c(appCompatActivity));
        this.f279676g = -1;
        this.f279678i = -1;
        this.f279679j = new C99042b();
        this.f279680n = C36568h.m40985a(new C71241b(this));
        this.f279681o = C36568h.m40985a(new C71243d(this));
        this.f279682p = C36568h.m40985a(new C71244n(this));
        this.f279683q = C36568h.m40985a(new C95832f(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m122708c3(com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC r22, wx3.C15601d r23) {
        /*
            r0 = r22
            r1 = r23
            java.lang.String r2 = "access$handleLoadMore"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r22.getClass()
            java.lang.Class<vt2.c> r4 = vt2.C102279c.class
            java.lang.String r5 = "handleLoadMore"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            boolean r6 = r1 instanceof ut2.C102095k
            if (r6 == 0) goto L_0x0028
            r6 = r1
            ut2.k r6 = (ut2.C102095k) r6
            int r7 = r6.f300639g
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x0028
            int r7 = r7 - r8
            r6.f300639g = r7
            goto L_0x002d
        L_0x0028:
            ut2.k r6 = new ut2.k
            r6.<init>(r0, r1)
        L_0x002d:
            java.lang.Object r1 = r6.f300637e
            xx3.a r7 = xx3.C15911a.COROUTINE_SUSPENDED
            int r8 = r6.f300639g
            r9 = 1
            if (r8 == 0) goto L_0x004c
            if (r8 != r9) goto L_0x0041
            java.lang.Object r0 = r6.f300636d
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r0 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x013c
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            throw r0
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r1)
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager r1 = r22.getLayoutManager()
            int r1 = r1.mo16959E()
            ut2.w r8 = r22.mo133297f3()
            java.util.List r8 = r8.getData()
            int r8 = r8.size()
            r10 = -1
            if (r1 == r10) goto L_0x016b
            int r10 = r8 - r1
            r11 = 3
            if (r10 > r11) goto L_0x016b
            if (r8 <= 0) goto L_0x016b
            bl3.r r10 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r11 = r22.getActivity()
            bl3.r$a r11 = r10.mo62444c(r11)
            androidx.lifecycle.i0 r11 = r11.mo75002a(r4)
            vt2.c r11 = (vt2.C102279c) r11
            r11.getClass()
            java.lang.String r12 = "hasMoreData"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            boolean r14 = r11.f301248g
            r15 = 0
            if (r14 != 0) goto L_0x00a0
            com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository r11 = r11.f301247f
            r11.getClass()
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r14)
            boolean r11 = r11.f279833h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r14)
            if (r11 == 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r11 = 0
            goto L_0x00a1
        L_0x00a0:
            r11 = 1
        L_0x00a1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "ui trigger loadMore,count:"
            r12.append(r14)
            r12.append(r8)
            java.lang.String r14 = " last position:"
            r12.append(r14)
            r12.append(r1)
            java.lang.String r1 = " hasMore:"
            r12.append(r1)
            r12.append(r11)
            java.lang.String r1 = r12.toString()
            java.lang.String r12 = "MicroMsg.Improve.DataFlow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            if (r11 == 0) goto L_0x0155
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView r1 = r22.mo133298g3()
            r1.mo98000b()
            androidx.appcompat.app.AppCompatActivity r1 = r22.getActivity()
            bl3.r$a r1 = r10.mo62444c(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            vt2.c r1 = (vt2.C102279c) r1
            r6.f300636d = r0
            r6.f300639g = r9
            r1.getClass()
            java.lang.String r4 = "loadMore"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r13)
            a14.z1 r8 = r1.f301250i
            if (r8 == 0) goto L_0x0106
            boolean r8 = r8.mo74530c()
            if (r8 != r9) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r9 = 0
        L_0x00fb:
            if (r9 == 0) goto L_0x00fe
            goto L_0x0106
        L_0x00fe:
            java.lang.String r8 = "MicroMsg.Improve.DataUIC"
            java.lang.String r9 = "currentJob is running,jump loadMore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            goto L_0x0120
        L_0x0106:
            b14.b r17 = r1.getDispatcher()
            r18 = 0
            vt2.d r8 = new vt2.d
            r9 = 0
            r8.<init>(r1, r9)
            r20 = 2
            r21 = 0
            r16 = r1
            r19 = r8
            a14.z1 r8 = bl3.C0317e.launch$default(r16, r17, r18, r19, r20, r21)
            r1.f301250i = r8
        L_0x0120:
            a14.z1 r1 = r1.f301250i
            if (r1 == 0) goto L_0x0131
            java.lang.Object r1 = r1.mo74521O(r6)
            if (r1 != r7) goto L_0x012e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r13)
            goto L_0x0136
        L_0x012e:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0133
        L_0x0131:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0133:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r13)
        L_0x0136:
            if (r1 != r7) goto L_0x013c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x0170
        L_0x013c:
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView r0 = r0.mo133298g3()
            r0.getClass()
            java.lang.String r1 = "finishAnimation"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            android.widget.ImageView r0 = r0.f206190f
            if (r0 == 0) goto L_0x0151
            r0.clearAnimation()
        L_0x0151:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x016b
        L_0x0155:
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager r1 = r22.getLayoutManager()
            android.view.View r1 = r1.findViewByPosition(r8)
            eu2.g r1 = (eu2.C97709g) r1
            if (r1 == 0) goto L_0x0164
            r1.mo133276c()
        L_0x0164:
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView r0 = r22.mo133298g3()
            r0.mo97999a()
        L_0x016b:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L_0x0170:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.m122708c3(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC, wx3.d):java.lang.Object");
    }

    /* renamed from: d3 */
    public static final void m122709d3(ImproveMainUIC improveMainUIC, RecyclerView recyclerView, int i) {
        int i2;
        boolean z;
        Iterator<T> it;
        boolean z2;
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        improveMainUIC.getClass();
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        if (improveMainUIC.mo133302l3()) {
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        } else {
            C102104r visibleItemView = improveMainUIC.getVisibleItemView();
            SnsMethodCalculate.markStartTimeMs("getAutoPlayManager", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            C33694a aVar = (C33694a) ((C36570n) improveMainUIC.f279675f).getValue();
            SnsMethodCalculate.markEndTimeMs("getAutoPlayManager", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            ArrayList<C65477j> a = visibleItemView.mo141604a();
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(a, "data");
            if (i3 == 0 || i3 == 1) {
                SnsMethodCalculate.markStartTimeMs("getAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                boolean booleanValue = ((Boolean) ((C36570n) aVar.f91148b).getValue()).booleanValue();
                SnsMethodCalculate.markEndTimeMs("getAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                SnsMethodCalculate.markStartTimeMs("autoPlayItem", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it4 = a.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    T next = it4.next();
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C65477j jVar = (C65477j) next;
                        jVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                        View view = jVar.f188430c;
                        SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                        if ((!(view instanceof C92311a) || !((C92311a) view).mo126293a(booleanValue)) && (!(view instanceof C92312b) || !booleanValue)) {
                            it = it4;
                            z = booleanValue;
                        } else {
                            Context context = recyclerView.getContext();
                            C87412m.m108593f(context, "view.context");
                            C92312b bVar = (C92312b) view;
                            Rect displayRect = bVar.getDisplayRect();
                            it = it4;
                            C87412m.m108593f(displayRect, "itemView as ISnsAutoPlayItem).displayRect");
                            SnsMethodCalculate.markStartTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                            if (displayRect.isEmpty()) {
                                SnsMethodCalculate.markEndTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                                z = booleanValue;
                                z2 = false;
                            } else {
                                C92093b bVar2 = C92093b.f263643a;
                                z = booleanValue;
                                SnsMethodCalculate.markStartTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                                int i6 = C92093b.f263645c;
                                SnsMethodCalculate.markEndTimeMs("getActionBarHeight", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                                int i7 = displayRect.bottom;
                                if (i7 > i6 && i7 > i6 + ((i7 - displayRect.top) / 2)) {
                                    int i8 = context.getResources().getDisplayMetrics().heightPixels;
                                    int i9 = displayRect.top;
                                    if (i8 - i9 > (displayRect.bottom - i9) / 2) {
                                        z2 = true;
                                        SnsMethodCalculate.markEndTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                                    }
                                }
                                z2 = false;
                                SnsMethodCalculate.markEndTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                            }
                            if (z2) {
                                arrayList.add(bVar);
                            }
                        }
                        RecyclerView recyclerView2 = recyclerView;
                        int i15 = i;
                        i4 = i5;
                        it4 = it;
                        booleanValue = z;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    C96254a.m123394d().mo133938k();
                    C92313c.m116089a().mo126301d();
                } else {
                    int size = arrayList.size();
                    int i16 = 0;
                    int i17 = Integer.MAX_VALUE;
                    for (int i18 = 0; i18 < size; i18++) {
                        Object obj = arrayList.get(i18);
                        C87412m.m108593f(obj, "validItems[i]");
                        SnsMethodCalculate.markStartTimeMs("disToPlayLine", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                        Rect displayRect2 = ((C92312b) obj).getDisplayRect();
                        if (displayRect2 == null) {
                            SnsMethodCalculate.markEndTimeMs("disToPlayLine", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                            i2 = Integer.MAX_VALUE;
                        } else {
                            i2 = Math.abs(displayRect2.top - aVar.f91147a);
                            SnsMethodCalculate.markEndTimeMs("disToPlayLine", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
                        }
                        if (i2 < i17) {
                            i17 = i2;
                            i16 = i18;
                        }
                    }
                    Object obj2 = arrayList.get(i16);
                    C87412m.m108593f(obj2, "validItems[minIndex]");
                    ((C92312b) obj2).mo126295e((BaseTimeLineItem.BaseViewHolder) null, -1);
                }
                SnsMethodCalculate.markEndTimeMs("autoPlayItem", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
            }
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
            AppCompatActivity activity = improveMainUIC.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
            SnsMethodCalculate.markStartTimeMs("getUIComponents", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
            HashSet<UIComponent> uiComponents = ((ImproveSnsTimelineUI) activity).getUiComponents();
            SnsMethodCalculate.markEndTimeMs("getUIComponents", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
            for (UIComponent lVar : uiComponents) {
                C0317e.launch$default(improveMainUIC, improveMainUIC.getDispatcher(), (C53934p0) null, new C102096l(lVar, recyclerView, visibleItemView, i, (C15601d<? super C102096l>) null), 2, (Object) null);
                ImproveMainUIC improveMainUIC2 = improveMainUIC;
            }
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        }
        SnsMethodCalculate.markEndTimeMs("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo133296e3(ut2.C102104r r8, int r9, wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "controlImageLoad"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r10 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.C95831e
            if (r2 == 0) goto L_0x001a
            r2 = r10
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$e r2 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.C95831e) r2
            int r3 = r2.f279690g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f279690g = r3
            goto L_0x001f
        L_0x001a:
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$e r2 = new com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$e
            r2.<init>(r7, r10)
        L_0x001f:
            java.lang.Object r10 = r2.f279688e
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f279690g
            r5 = 1
            if (r4 == 0) goto L_0x003d
            if (r4 != r5) goto L_0x0032
            java.lang.Object r8 = r2.f279687d
            java.util.Iterator r8 = (java.util.Iterator) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x006f
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r8
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = "getImproveImageLoad"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            rx3.g r4 = r7.f279674e
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            if (r4 == 0) goto L_0x005e
            rx3.b0 r8 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        L_0x005e:
            if (r9 != 0) goto L_0x00a6
            com.tencent.mm.plugin.sns.model.o r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r9.mo131118g0()
            java.util.ArrayList r8 = r8.mo141604a()
            java.util.Iterator r8 = r8.iterator()
        L_0x006f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00ad
            java.lang.Object r9 = r8.next()
            ut2.j r9 = (ut2.C65477j) r9
            r9.getClass()
            java.lang.String r10 = "getView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
            android.view.View r6 = r9.f188430c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
            boolean r6 = r6 instanceof eu2.C97730l
            if (r6 == 0) goto L_0x006f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
            android.view.View r9 = r9.f188430c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
            eu2.l r9 = (eu2.C97730l) r9
            r2.f279687d = r8
            r2.f279690g = r5
            java.lang.Object r9 = r9.mo137034E(r2)
            if (r9 != r3) goto L_0x006f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x00a6:
            com.tencent.mm.plugin.sns.model.o r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r8.mo131082B()
        L_0x00ad:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.mo133296e3(ut2.r, int, wx3.d):java.lang.Object");
    }

    /* renamed from: f3 */
    public final C102110w mo133297f3() {
        SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        C102110w wVar = (C102110w) ((C36570n) this.f279673d).getValue();
        SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return wVar;
    }

    /* renamed from: g3 */
    public final ImproveLoadingMoreView mo133298g3() {
        SnsMethodCalculate.markStartTimeMs("getBottomLoadingView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        ImproveLoadingMoreView improveLoadingMoreView = (ImproveLoadingMoreView) ((C36570n) this.f279681o).getValue();
        SnsMethodCalculate.markEndTimeMs("getBottomLoadingView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return improveLoadingMoreView;
    }

    /* renamed from: i3 */
    public final C102497b mo133299i3() {
        SnsMethodCalculate.markStartTimeMs("getErrorPostHandle", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        C102497b bVar = (C102497b) ((C36570n) this.f279683q).getValue();
        SnsMethodCalculate.markEndTimeMs("getErrorPostHandle", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return bVar;
    }

    /* renamed from: j3 */
    public final ImproveRecycleHeaderView mo133300j3() {
        SnsMethodCalculate.markStartTimeMs("getRecyclerViewHeader", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        ImproveRecycleHeaderView improveRecycleHeaderView = (ImproveRecycleHeaderView) ((C36570n) this.f279682p).getValue();
        SnsMethodCalculate.markEndTimeMs("getRecyclerViewHeader", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return improveRecycleHeaderView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0142, code lost:
        r0 = rx3.C13598b0.f38549a;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("handleViewPreload", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo133301k3(androidx.recyclerview.widget.RecyclerView r17, ut2.C102104r r18, int r19, wx3.C15601d<? super rx3.C13598b0> r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "handleScrollEvent"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.C95833g
            if (r6 == 0) goto L_0x0022
            r6 = r3
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$g r6 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.C95833g) r6
            int r7 = r6.f279697i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x0022
            int r7 = r7 - r8
            r6.f279697i = r7
            goto L_0x0027
        L_0x0022:
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$g r6 = new com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$g
            r6.<init>(r1, r3)
        L_0x0027:
            java.lang.Object r3 = r6.f279695g
            xx3.a r7 = xx3.C15911a.COROUTINE_SUSPENDED
            int r8 = r6.f279697i
            java.lang.String r9 = "MicroMsg.Improve.MainUIC"
            r10 = 3
            r11 = 2
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct"
            r13 = 1
            if (r8 == 0) goto L_0x006f
            if (r8 == r13) goto L_0x0060
            if (r8 == r11) goto L_0x0056
            if (r8 != r10) goto L_0x004b
            int r0 = r6.f279694f
            java.lang.Object r2 = r6.f279693e
            ut2.r r2 = (ut2.C102104r) r2
            java.lang.Object r6 = r6.f279692d
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r6 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC) r6
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x015e
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            throw r0
        L_0x0056:
            int r0 = r6.f279694f
            java.lang.Object r2 = r6.f279692d
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r2 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC) r2
            kotlin.ResultKt.throwOnFailure(r3)
            goto L_0x00ab
        L_0x0060:
            int r0 = r6.f279694f
            java.lang.Object r2 = r6.f279693e
            ut2.r r2 = (ut2.C102104r) r2
            java.lang.Object r8 = r6.f279692d
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r8 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC) r8
            kotlin.ResultKt.throwOnFailure(r3)
            r3 = r0
            goto L_0x0087
        L_0x006f:
            kotlin.ResultKt.throwOnFailure(r3)
            r6.f279692d = r1
            r6.f279693e = r0
            r6.f279694f = r2
            r6.f279697i = r13
            java.lang.Object r3 = r1.mo133296e3(r0, r2, r6)
            if (r3 != r7) goto L_0x0084
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return r7
        L_0x0084:
            r8 = r1
            r3 = r2
            r2 = r0
        L_0x0087:
            if (r3 != r13) goto L_0x00af
            int r0 = r8.f279676g
            if (r3 == r0) goto L_0x00af
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r0 = f14.C58901s.f168555a
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$h r2 = new com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$h
            r9 = 0
            r2.<init>(r8, r9)
            r6.f279692d = r8
            r6.f279693e = r9
            r6.f279694f = r3
            r6.f279697i = r11
            java.lang.Object r0 = a14.C53895h.m60469g(r0, r2, r6)
            if (r0 != r7) goto L_0x00a9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return r7
        L_0x00a9:
            r0 = r3
            r2 = r8
        L_0x00ab:
            r3 = r0
            r8 = r2
            goto L_0x0181
        L_0x00af:
            if (r3 != 0) goto L_0x0181
            r6.f279692d = r8
            r6.f279693e = r2
            r6.f279694f = r3
            r6.f279697i = r10
            r8.getClass()
            java.lang.String r6 = "handleViewPreload"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.hy0()
            r0.mo131030p()
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r10 = r8.getActivity()
            bl3.r$a r0 = r0.mo62444c(r10)
            java.lang.Class<vt2.c> r10 = vt2.C102279c.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r10)
            vt2.c r0 = (vt2.C102279c) r0
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = r0.mo141841d3()
            java.util.ArrayList<T> r0 = r0.f272353o
            r2.getClass()
            java.lang.String r10 = "getLastVisiblePosition"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r12)
            int r11 = r2.f300667b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r12)
            int r10 = r0.size()
            int r10 = r10 - r11
            int r14 = r11 + 15
            int r10 = java.lang.Math.min(r10, r14)
        L_0x00f8:
            int r14 = r11 + 1
            int r15 = r10 + -1
            if (r11 >= r15) goto L_0x0151
            int r11 = r0.size()     // Catch:{ Exception -> 0x0148 }
            if (r11 > r14) goto L_0x010a
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0148 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)     // Catch:{ Exception -> 0x0148 }
            goto L_0x0156
        L_0x010a:
            java.lang.Object r11 = sx3.C110818d0.m150917O(r0, r14)     // Catch:{ Exception -> 0x0148 }
            iu2.a r11 = (iu2.C98799a) r11     // Catch:{ Exception -> 0x0148 }
            if (r11 == 0) goto L_0x0142
            gu2.b r11 = r11.mo138170b()     // Catch:{ Exception -> 0x0148 }
            if (r11 != 0) goto L_0x0119
            goto L_0x0142
        L_0x0119:
            int r15 = r11.getType()     // Catch:{ Exception -> 0x0148 }
            r13 = 15
            if (r15 != r13) goto L_0x013e
            boolean r13 = r11.isAd()     // Catch:{ Exception -> 0x0148 }
            if (r13 == 0) goto L_0x0131
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r11.mo137505C2()     // Catch:{ Exception -> 0x0148 }
            boolean r13 = jq2.C98993j.m128899a(r13)     // Catch:{ Exception -> 0x0148 }
            if (r13 == 0) goto L_0x013e
        L_0x0131:
            com.tencent.mm.plugin.sns.model.f2 r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.hy0()     // Catch:{ Exception -> 0x0148 }
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r11.mo137505C2()     // Catch:{ Exception -> 0x0148 }
            r15 = 1
            r13.mo131027m(r11, r15)     // Catch:{ Exception -> 0x0148 }
            goto L_0x013f
        L_0x013e:
            r15 = 1
        L_0x013f:
            r11 = r14
            r13 = 1
            goto L_0x00f8
        L_0x0142:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0148 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)     // Catch:{ Exception -> 0x0148 }
            goto L_0x0156
        L_0x0148:
            r0 = move-exception
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = "handleViewPreload error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r11, r10)
        L_0x0151:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
        L_0x0156:
            if (r0 != r7) goto L_0x015c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return r7
        L_0x015c:
            r0 = r3
            r6 = r8
        L_0x015e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "first visible position:"
            r3.append(r7)
            r2.getClass()
            java.lang.String r7 = "getFirstVisiblePosition"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r12)
            int r2 = r2.f300666a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r12)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            r3 = r0
            r8 = r6
        L_0x0181:
            r8.f279676g = r3
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.mo133301k3(androidx.recyclerview.widget.RecyclerView, ut2.r, int, wx3.d):java.lang.Object");
    }

    /* renamed from: l3 */
    public final boolean mo133302l3() {
        SnsMethodCalculate.markStartTimeMs("pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        boolean z = getActivity().isDestroyed() || getActivity().isFinishing();
        SnsMethodCalculate.markEndTimeMs("pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return z;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.Improve.MainUIC", "onCreate " + hashCode());
        SnsMethodCalculate.markStartTimeMs("setupRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        getRecycleView().setAdapter(mo133297f3());
        getRecycleView().setLayoutManager(new WxLinearLayoutManager(getContext()));
        getRecycleView().setItemAnimator((RecyclerView.C16616j) null);
        getRecycleView().mo17043c(new C65478p(this));
        mo133297f3().mo85794V5(mo133300j3(), Integer.MAX_VALUE, true);
        mo133297f3().mo85792R5(mo133298g3(), 2147483646, true);
        ((C64995b) C86312j.m106911c(C64995b.class)).mo89151HW(getRecycleView());
        SnsMethodCalculate.markEndTimeMs("setupRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        SnsMethodCalculate.markStartTimeMs("setupAppBarDoubleClick", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        SnsMethodCalculate.markStartTimeMs("getAppBarContent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        Object value = ((C36570n) this.f279680n).getValue();
        C87412m.m108593f(value, "<get-appBarContent>(...)");
        SnsMethodCalculate.markEndTimeMs("getAppBarContent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        ((View) value).setOnClickListener(new C102100o(this));
        SnsMethodCalculate.markEndTimeMs("setupAppBarDoubleClick", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        SnsMethodCalculate.markStartTimeMs("restorePositionInfo", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        if (resumePage()) {
            ViewGroup.LayoutParams layoutParams = getAppBarLayout().getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.C103717e) layoutParams).f306328a;
            C87412m.m108592e(behavior, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
            AppBarLayout.Behavior behavior2 = (AppBarLayout.Behavior) behavior;
            C95790g2 Kx0 = C94866e1.Kx0();
            Kx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getAppbarOffset", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            int i = Kx0.f279535g;
            SnsMethodCalculate.markEndTimeMs("getAppbarOffset", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            behavior2.mo146260y(i);
            getAppBarLayout().requestLayout();
            getAppBarLayout().getViewTreeObserver().addOnGlobalLayoutListener(new C102097m(i, behavior2, new C8478d0(), this));
            SnsMethodCalculate.markStartTimeMs("restoreRecyclerViewPosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            C95790g2 Kx02 = C94866e1.Kx0();
            Kx02.getClass();
            SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            int i2 = Kx02.f279536h;
            SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            C95790g2 Kx03 = C94866e1.Kx0();
            Kx03.getClass();
            SnsMethodCalculate.markStartTimeMs("getTopY", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            int i3 = Kx03.f279537i;
            SnsMethodCalculate.markEndTimeMs("getTopY", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            WxLinearLayoutManager layoutManager = getLayoutManager();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i3));
            aVar.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(layoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC", "restoreRecyclerViewPosition", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            layoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(layoutManager, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC", "restoreRecyclerViewPosition", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            getRecycleView().getViewTreeObserver().addOnGlobalLayoutListener(new C102098n(this, i2, i3, new C8478d0()));
            SnsMethodCalculate.markEndTimeMs("restoreRecyclerViewPosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        }
        SnsMethodCalculate.markEndTimeMs("restorePositionInfo", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        mo133299i3().mo142115a();
        C94866e1.gy0().mo131190a(this);
        C94843b1 Rx0 = C94866e1.Rx0();
        C95835j jVar = new C95835j(this);
        Rx0.getClass();
        SnsMethodCalculate.markStartTimeMs("setUpdateCallback", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        Rx0.f274781h = jVar;
        SnsMethodCalculate.markEndTimeMs("setUpdateCallback", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0090, code lost:
        r9 = r7.f44854d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r13 = this;
            java.lang.String r0 = "onDestroy"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.onDestroy()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onDestroy "
            r2.append(r3)
            int r3 = r13.hashCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.Improve.MainUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView r2 = r13.mo133300j3()
            r2.getClass()
            java.lang.String r4 = "release"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            a14.n0 r6 = r2.f116654d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = " onCleared."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r9 = 2
            a14.C53930o0.m60557d(r6, r7, r8, r9, r8)
            os2.x r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
            r6.remove(r2)
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r6.remove(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r2 = "savePositionInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            com.google.android.material.appbar.AppBarLayout r5 = r13.getAppBarLayout()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            java.lang.String r6 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
            gy3.C87412m.m108592e(r5, r6)
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r5
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r5.f306328a
            java.lang.String r6 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior"
            gy3.C87412m.m108592e(r5, r6)
            com.google.android.material.appbar.AppBarLayout$Behavior r5 = (com.google.android.material.appbar.AppBarLayout.Behavior) r5
            com.tencent.mm.view.recyclerview.WxLinearLayoutManager r6 = r13.getLayoutManager()
            int r6 = r6.mo16957C()
            com.tencent.mm.view.recyclerview.WxRecyclerView r7 = r13.getRecycleView()
            androidx.recyclerview.widget.RecyclerView$z r7 = r7.mo17023I0(r6)
            if (r7 == 0) goto L_0x0099
            android.view.View r9 = r7.f44854d
            if (r9 == 0) goto L_0x0099
            int r9 = r9.getTop()
            goto L_0x009a
        L_0x0099:
            r9 = 0
        L_0x009a:
            if (r7 == 0) goto L_0x00a9
            android.view.View r7 = r7.f44854d
            if (r7 == 0) goto L_0x00a9
            int r7 = r7.getHeight()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00aa
        L_0x00a9:
            r7 = r8
        L_0x00aa:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "save recyclerView position:"
            r10.append(r11)
            r10.append(r6)
            java.lang.String r11 = " offset:"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = " height:"
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            com.tencent.mm.plugin.sns.ui.g2 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Kx0()
            int r5 = r5.mo146259w()
            r3.getClass()
            java.lang.String r7 = "pausePositionEvent"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.ResumeSnsControl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r10)
            r3.f279535g = r5
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r3.f279529a = r11
            r3.f279536h = r6
            r3.f279537i = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.model.p2 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            r2.mo131202m(r13)
            com.tencent.mm.plugin.sns.model.b1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            r2.getClass()
            java.lang.String r3 = "setUpdateCallback"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            r2.f274781h = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            ju2.b r2 = r13.f279679j
            r2.getClass()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedLeakManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r2.hashCode()
            r5.append(r6)
            java.lang.String r6 = " may leak count:"
            r5.append(r6)
            java.util.HashSet<eu2.g> r6 = r2.f290341a
            int r6 = r6.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.Improve.ImproveFeedLeakManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            java.util.HashSet<eu2.g> r5 = r2.f290341a
            java.util.Iterator r5 = r5.iterator()
        L_0x0142:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x016b
            java.lang.Object r7 = r5.next()
            eu2.g r7 = (eu2.C97709g) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "release: "
            r8.append(r9)
            int r9 = r7.hashCode()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            r7.mo81008h()
            goto L_0x0142
        L_0x016b:
            java.util.HashSet<eu2.g> r2 = r2.f290341a
            r2.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.onDestroy():void");
    }

    public void onPostEnd(int i, boolean z) {
        C39622i0 a;
        SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        if (!z) {
            mo133299i3().mo142115a();
            Class cls = C60631e.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            long j = (long) i;
            int i2 = C98802d.f289652e;
            SnsMethodCalculate.markStartTimeMs("postUpdateEventByLocalID$default", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).mo138177g3(j, StorageEventId.Companion.getUPDATE());
            SnsMethodCalculate.markEndTimeMs("postUpdateEventByLocalID$default", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        }
        SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        super.onResume();
        WxRecyclerView recycleView = getRecycleView();
        C58525r.m67941a(recycleView, new C95836k(recycleView, this));
        getRecycleView().requestLayout();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r7 != false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r15, ut2.C102104r r16, int r17, wx3.C15601d<? super rx3.C13598b0> r18) {
        /*
            r14 = this;
            r0 = r14
            r1 = r18
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.C95837l
            if (r4 == 0) goto L_0x001e
            r4 = r1
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$l r4 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.C95837l) r4
            int r5 = r4.f279705g
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f279705g = r5
            goto L_0x0023
        L_0x001e:
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$l r4 = new com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$l
            r4.<init>(r14, r1)
        L_0x0023:
            java.lang.Object r1 = r4.f279703e
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f279705g
            r7 = 1
            if (r6 == 0) goto L_0x0041
            if (r6 != r7) goto L_0x0036
            java.lang.Object r4 = r4.f279702d
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r4 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC) r4
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0058
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r1
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r1)
            r4.f279702d = r0
            r4.f279705g = r7
            r1 = r15
            r6 = r16
            r8 = r17
            java.lang.Object r1 = r14.mo133301k3(r15, r6, r8, r4)
            if (r1 != r5) goto L_0x0057
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x0057:
            r4 = r0
        L_0x0058:
            a14.z1 r1 = r4.f279677h
            if (r1 == 0) goto L_0x0069
            r5 = 0
            if (r1 == 0) goto L_0x0066
            boolean r1 = r1.mo74530c()
            if (r1 != r7) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r7 = 0
        L_0x0067:
            if (r7 == 0) goto L_0x007d
        L_0x0069:
            a14.h0 r1 = a14.C53872d1.f151117a
            a14.k2 r9 = f14.C58901s.f168555a
            r10 = 0
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$m r11 = new com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$m
            r1 = 0
            r11.<init>(r4, r1)
            r12 = 2
            r13 = 0
            r8 = r4
            a14.z1 r1 = bl3.C0317e.launch$default(r8, r9, r10, r11, r12, r13)
            r4.f279677h = r1
        L_0x007d:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, ut2.r, int, wx3.d):java.lang.Object");
    }

    public void updateBackView(C100422y yVar) {
        SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }
}
