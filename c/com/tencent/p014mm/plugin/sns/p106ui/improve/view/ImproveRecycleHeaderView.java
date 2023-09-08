package com.tencent.p014mm.plugin.sns.p106ui.improve.view;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gv2.C98242p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import ku2.C46745e;
import o40.C61926c;
import os2.C100420w;
import p196ln.C76705f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aR\u001b\u0010\u0007\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveRecycleHeaderView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "e", "Lrx3/g;", "getMsgNotifyLayout", "()Landroid/widget/LinearLayout;", "msgNotifyLayout", "Landroid/widget/TextView;", "f", "getMsgNotifyContent", "()Landroid/widget/TextView;", "msgNotifyContent", "Landroid/widget/ImageView;", "g", "getMsgNotifyImg", "()Landroid/widget/ImageView;", "msgNotifyImg", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView */
public final class ImproveRecycleHeaderView extends LinearLayout implements MStorage.IOnStorageChange {

    /* renamed from: h */
    public static final /* synthetic */ int f116653h = 0;

    /* renamed from: d */
    public final C0000n0 f116654d = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: e */
    public final C13601g f116655e = C36568h.m40985a(new C43110d(this));

    /* renamed from: f */
    public final C13601g f116656f = C36568h.m40985a(new C43108b(this));

    /* renamed from: g */
    public final C13601g f116657g = C36568h.m40985a(new C43109c(this));

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$a */
    public static final class C43107a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveRecycleHeaderView f116658d;

        public C43107a(ImproveRecycleHeaderView improveRecycleHeaderView) {
            this.f116658d = improveRecycleHeaderView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecycleHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$1");
            ImproveRecycleHeaderView improveRecycleHeaderView = this.f116658d;
            int i = ImproveRecycleHeaderView.f116653h;
            SnsMethodCalculate.markStartTimeMs("access$gotoNotifyMsgUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
            improveRecycleHeaderView.getClass();
            SnsMethodCalculate.markStartTimeMs("gotoNotifyMsgUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
            Intent intent = new Intent();
            intent.setClass(improveRecycleHeaderView.getContext(), SnsMsgUI.class);
            intent.putExtra("sns_msg_comment_list_scene", 1);
            Context context = improveRecycleHeaderView.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(13);
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecycleHeaderView", "gotoNotifyMsgUI", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            C61926c.m72666K(100, new C46745e(improveRecycleHeaderView));
            SnsMethodCalculate.markEndTimeMs("gotoNotifyMsgUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
            SnsMethodCalculate.markEndTimeMs("access$gotoNotifyMsgUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveRecycleHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$b */
    public static final class C43108b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveRecycleHeaderView f116659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43108b(ImproveRecycleHeaderView improveRecycleHeaderView) {
            super(0);
            this.f116659d = improveRecycleHeaderView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyContent$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyContent$2");
            TextView textView = (TextView) this.f116659d.findViewById(C0966R.C0970id.f359262jv0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyContent$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyContent$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$c */
    public static final class C43109c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveRecycleHeaderView f116660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43109c(ImproveRecycleHeaderView improveRecycleHeaderView) {
            super(0);
            this.f116660d = improveRecycleHeaderView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyImg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyImg$2");
            ImageView imageView = (ImageView) this.f116660d.findViewById(C0966R.C0970id.juv);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyImg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyImg$2");
            return imageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$d */
    public static final class C43110d extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ ImproveRecycleHeaderView f116661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43110d(ImproveRecycleHeaderView improveRecycleHeaderView) {
            super(0);
            this.f116661d = improveRecycleHeaderView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyLayout$2");
            LinearLayout linearLayout = (LinearLayout) this.f116661d.findViewById(C0966R.C0970id.f358453of2);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$msgNotifyLayout$2");
            return linearLayout;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1", mo125469f = "ImproveRecycleHeaderView.kt", mo125470l = {88, 100, 109}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e */
    public static final class C43111e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f116662d;

        /* renamed from: e */
        public Object f116663e;

        /* renamed from: f */
        public Object f116664f;

        /* renamed from: g */
        public int f116665g;

        /* renamed from: h */
        public final /* synthetic */ ImproveRecycleHeaderView f116666h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1", mo125469f = "ImproveRecycleHeaderView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$a */
        public static final class C43112a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ImproveRecycleHeaderView f116667d;

            /* renamed from: e */
            public final /* synthetic */ Cursor f116668e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43112a(ImproveRecycleHeaderView improveRecycleHeaderView, Cursor cursor, C15601d<? super C43112a> dVar) {
                super(2, dVar);
                this.f116667d = improveRecycleHeaderView;
                this.f116668e = cursor;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1");
                C43112a aVar = new C43112a(this.f116667d, this.f116668e, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1");
                Object invokeSuspend = ((C43112a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1");
                ResultKt.throwOnFailure(obj);
                ImproveRecycleHeaderView.m46721c(this.f116667d).setVisibility(0);
                ImproveRecycleHeaderView.m46719a(this.f116667d).setText(this.f116667d.getContext().getResources().getQuantityString(C0966R.plurals.f7249a6, this.f116668e.getCount(), new Object[]{new Integer(this.f116668e.getCount())}));
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$1");
                return b0Var;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1", mo125469f = "ImproveRecycleHeaderView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$b */
        public static final class C43113b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f116669d;

            /* renamed from: e */
            public final /* synthetic */ ImproveRecycleHeaderView f116670e;

            /* renamed from: f */
            public final /* synthetic */ SnsInfo f116671f;

            /* renamed from: g */
            public final /* synthetic */ C100420w f116672g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43113b(C8477a0 a0Var, ImproveRecycleHeaderView improveRecycleHeaderView, SnsInfo snsInfo, C100420w wVar, C15601d<? super C43113b> dVar) {
                super(2, dVar);
                this.f116669d = a0Var;
                this.f116670e = improveRecycleHeaderView;
                this.f116671f = snsInfo;
                this.f116672g = wVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1");
                C43113b bVar = new C43113b(this.f116669d, this.f116670e, this.f116671f, this.f116672g, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1");
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1");
                Object invokeSuspend = ((C43113b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1");
                ResultKt.throwOnFailure(obj);
                this.f116669d.f27482d = C98242p.m126945g(ImproveRecycleHeaderView.m46720b(this.f116670e), this.f116671f, this.f116672g.field_talker);
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$2$1");
                return b0Var;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3", mo125469f = "ImproveRecycleHeaderView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$c */
        public static final class C43114c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ ImproveRecycleHeaderView f116673d;

            /* renamed from: e */
            public final /* synthetic */ C100420w f116674e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43114c(ImproveRecycleHeaderView improveRecycleHeaderView, C100420w wVar, C15601d<? super C43114c> dVar) {
                super(2, dVar);
                this.f116673d = improveRecycleHeaderView;
                this.f116674e = wVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3");
                C43114c cVar = new C43114c(this.f116673d, this.f116674e, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3");
                return cVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3");
                Object invokeSuspend = ((C43114c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3");
                ResultKt.throwOnFailure(obj);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(ImproveRecycleHeaderView.m46720b(this.f116673d), this.f116674e.field_talker);
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1$3");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43111e(ImproveRecycleHeaderView improveRecycleHeaderView, C15601d<? super C43111e> dVar) {
            super(2, dVar);
            this.f116666h = improveRecycleHeaderView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1");
            C43111e eVar = new C43111e(this.f116666h, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1");
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1");
            Object invokeSuspend = ((C43111e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1");
            return invokeSuspend;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00e8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.String r1 = "invokeSuspend"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$onNotifyChange$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r0.f116665g
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r4 == 0) goto L_0x004a
                if (r4 == r7) goto L_0x003e
                if (r4 == r6) goto L_0x002d
                if (r4 != r5) goto L_0x0022
                java.lang.Object r3 = r0.f116662d
                android.database.Cursor r3 = (android.database.Cursor) r3
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x00e6
            L_0x0022:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                throw r3
            L_0x002d:
                java.lang.Object r4 = r0.f116664f
                gy3.a0 r4 = (gy3.C8477a0) r4
                java.lang.Object r6 = r0.f116663e
                os2.w r6 = (os2.C100420w) r6
                java.lang.Object r7 = r0.f116662d
                android.database.Cursor r7 = (android.database.Cursor) r7
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x00c0
            L_0x003e:
                java.lang.Object r4 = r0.f116663e
                os2.w r4 = (os2.C100420w) r4
                java.lang.Object r7 = r0.f116662d
                android.database.Cursor r7 = (android.database.Cursor) r7
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x0083
            L_0x004a:
                kotlin.ResultKt.throwOnFailure(r18)
                os2.x r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
                android.database.Cursor r4 = r4.mo139893bD()
                int r9 = r4.getCount()
                if (r9 <= 0) goto L_0x00e9
                r4.moveToFirst()
                os2.w r9 = new os2.w
                r9.<init>()
                r9.convertFrom(r4)
                a14.h0 r10 = a14.C53872d1.f151117a
                a14.k2 r10 = f14.C58901s.f168555a
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$a r11 = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$a
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView r12 = r0.f116666h
                r11.<init>(r12, r4, r8)
                r0.f116662d = r4
                r0.f116663e = r9
                r0.f116665g = r7
                java.lang.Object r7 = a14.C53895h.m60469g(r10, r11, r0)
                if (r7 != r3) goto L_0x0081
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x0081:
                r7 = r4
                r4 = r9
            L_0x0083:
                gy3.a0 r9 = new gy3.a0
                r9.<init>()
                os2.j r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
                long r11 = r4.field_snsID
                com.tencent.mm.plugin.sns.storage.AdSnsInfo r10 = r10.mo139864jo(r11)
                if (r10 == 0) goto L_0x00c2
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView r12 = r0.f116666h
                com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r10.convertToSnsInfo()
                a14.h0 r10 = a14.C53872d1.f151117a
                a14.k2 r15 = f14.C58901s.f168555a
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$b r14 = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$b
                r16 = 0
                r10 = r14
                r11 = r9
                r5 = r14
                r14 = r4
                r8 = r15
                r15 = r16
                r10.<init>(r11, r12, r13, r14, r15)
                r0.f116662d = r7
                r0.f116663e = r4
                r0.f116664f = r9
                r0.f116665g = r6
                java.lang.Object r5 = a14.C53895h.m60469g(r8, r5, r0)
                if (r5 != r3) goto L_0x00be
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x00be:
                r6 = r4
                r4 = r9
            L_0x00c0:
                r9 = r4
                r4 = r6
            L_0x00c2:
                boolean r5 = r9.f27482d
                if (r5 != 0) goto L_0x00e8
                a14.h0 r5 = a14.C53872d1.f151117a
                a14.k2 r5 = f14.C58901s.f168555a
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$c r6 = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView$e$c
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView r8 = r0.f116666h
                r9 = 0
                r6.<init>(r8, r4, r9)
                r0.f116662d = r7
                r0.f116663e = r9
                r0.f116664f = r9
                r4 = 3
                r0.f116665g = r4
                java.lang.Object r4 = a14.C53895h.m60469g(r5, r6, r0)
                if (r4 != r3) goto L_0x00e5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x00e5:
                r3 = r7
            L_0x00e6:
                r4 = r3
                goto L_0x00e9
            L_0x00e8:
                r4 = r7
            L_0x00e9:
                r4.close()
                rx3.b0 r3 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveRecycleHeaderView.C43111e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ImproveRecycleHeaderView(Context context) {
        super(context);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_8, this, true);
        setOrientation(1);
        setPadding(0, C76577a.m92157h(getContext(), C0966R.dimen.f3749d0), 0, 0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C94866e1.Tx0().add((MStorage.IOnStorageChange) this, (Looper) null);
        C94866e1.Yx0().add((MStorage.IOnStorageChange) this, (Looper) null);
        getMsgNotifyLayout().setOnClickListener(new C43107a(this));
        onNotifyChange((String) null, (MStorageEventData) null);
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m46719a(ImproveRecycleHeaderView improveRecycleHeaderView) {
        SnsMethodCalculate.markStartTimeMs("access$getMsgNotifyContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        TextView msgNotifyContent = improveRecycleHeaderView.getMsgNotifyContent();
        SnsMethodCalculate.markEndTimeMs("access$getMsgNotifyContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        return msgNotifyContent;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m46720b(ImproveRecycleHeaderView improveRecycleHeaderView) {
        SnsMethodCalculate.markStartTimeMs("access$getMsgNotifyImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        ImageView msgNotifyImg = improveRecycleHeaderView.getMsgNotifyImg();
        SnsMethodCalculate.markEndTimeMs("access$getMsgNotifyImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        return msgNotifyImg;
    }

    /* renamed from: c */
    public static final /* synthetic */ LinearLayout m46721c(ImproveRecycleHeaderView improveRecycleHeaderView) {
        SnsMethodCalculate.markStartTimeMs("access$getMsgNotifyLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        LinearLayout msgNotifyLayout = improveRecycleHeaderView.getMsgNotifyLayout();
        SnsMethodCalculate.markEndTimeMs("access$getMsgNotifyLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        return msgNotifyLayout;
    }

    private final TextView getMsgNotifyContent() {
        SnsMethodCalculate.markStartTimeMs("getMsgNotifyContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        Object value = this.f116656f.getValue();
        C87412m.m108593f(value, "<get-msgNotifyContent>(...)");
        TextView textView = (TextView) value;
        SnsMethodCalculate.markEndTimeMs("getMsgNotifyContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        return textView;
    }

    private final ImageView getMsgNotifyImg() {
        SnsMethodCalculate.markStartTimeMs("getMsgNotifyImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        Object value = this.f116657g.getValue();
        C87412m.m108593f(value, "<get-msgNotifyImg>(...)");
        ImageView imageView = (ImageView) value;
        SnsMethodCalculate.markEndTimeMs("getMsgNotifyImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        return imageView;
    }

    private final LinearLayout getMsgNotifyLayout() {
        SnsMethodCalculate.markStartTimeMs("getMsgNotifyLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        Object value = this.f116655e.getValue();
        C87412m.m108593f(value, "<get-msgNotifyLayout>(...)");
        LinearLayout linearLayout = (LinearLayout) value;
        SnsMethodCalculate.markEndTimeMs("getMsgNotifyLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        return linearLayout;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
        C53895h.m60466d(this.f116654d, C53872d1.f151117a, (C53934p0) null, new C43111e(this, (C15601d<? super C43111e>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecycleHeaderView");
    }

    public ImproveRecycleHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_8, this, true);
        setOrientation(1);
        setPadding(0, C76577a.m92157h(getContext(), C0966R.dimen.f3749d0), 0, 0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C94866e1.Tx0().add((MStorage.IOnStorageChange) this, (Looper) null);
        C94866e1.Yx0().add((MStorage.IOnStorageChange) this, (Looper) null);
        getMsgNotifyLayout().setOnClickListener(new C43107a(this));
        onNotifyChange((String) null, (MStorageEventData) null);
    }

    public ImproveRecycleHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_8, this, true);
        setOrientation(1);
        setPadding(0, C76577a.m92157h(getContext(), C0966R.dimen.f3749d0), 0, 0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C94866e1.Tx0().add((MStorage.IOnStorageChange) this, (Looper) null);
        C94866e1.Yx0().add((MStorage.IOnStorageChange) this, (Looper) null);
        getMsgNotifyLayout().setOnClickListener(new C43107a(this));
        onNotifyChange((String) null, (MStorageEventData) null);
    }
}
