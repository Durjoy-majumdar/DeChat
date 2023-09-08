package com.tencent.p014mm.plugin.sns.p106ui.improve.component.header;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import au2.C92093b;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.feature.sns.api.ICoverStatusChanged;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.p106ui.SettingSnsBackgroundUI;
import com.tencent.p014mm.plugin.sns.p106ui.TouchImageView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.cover.SnsImproveCoverLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C75592q0;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iu2.C98799a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import l31.C99333f;
import nj3.C76912y0;
import os2.C100422y;
import p196ln.C76705f;
import p214om.C11502f;
import pr2.C100846e;
import pr2.C100847f;
import pr2.C100848g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import ur2.C102074a;
import ut2.C102084a;
import vt2.C102279c;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001TB\u000f\u0012\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\b\u0010\n\u001a\u00020\u0005H\u0002J\u001b\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0019H\u0016J\u0012\u0010#\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020&H\u0016J\"\u0010,\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016R\u001b\u00102\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0002¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010N\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC;", "Lut2/a;", "Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;", "Lcom/tencent/mm/plugin/sns/model/p2$e;", "Lpr2/g;", "Lrx3/b0;", "destroyCover", "loadAvatar", "(Lwx3/d;)Ljava/lang/Object;", "loadNickName", "jumpToSelfPage", "Los2/y;", "cover", "loadCover", "(Los2/y;Lwx3/d;)Ljava/lang/Object;", "changeCover", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "backPreview", "setupPreviewMask", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPause", "onResume", "onDestroy", "", "onBackPressed", "onPreClose", "onPostClose", "onPreOpen", "onPostOpen", "", "localId", "isOk", "onPostEnd", "updateBackView", "Lpr2/f;", "getStatus", "Lpr2/e;", "getSnsCoverReporter", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/tencent/mm/plugin/sns/ui/improve/cover/SnsImproveCoverLayout;", "coverLayout$delegate", "Lrx3/g;", "getCoverLayout", "()Lcom/tencent/mm/plugin/sns/ui/improve/cover/SnsImproveCoverLayout;", "coverLayout", "Lcom/tencent/mm/plugin/sns/ui/TouchImageView;", "avatarImg$delegate", "getAvatarImg", "()Lcom/tencent/mm/plugin/sns/ui/TouchImageView;", "avatarImg", "Landroid/widget/TextView;", "nickNameTxt$delegate", "getNickNameTxt", "()Landroid/widget/TextView;", "nickNameTxt", "", "userName$delegate", "getUserName", "()Ljava/lang/String;", "userName", "Landroid/view/View;", "changeCoverLayout$delegate", "getChangeCoverLayout", "()Landroid/view/View;", "changeCoverLayout", "snsCoverStatus", "Lpr2/f;", "Lur2/a;", "coverReporter", "Lur2/a;", "snsCover", "Los2/y;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Companion", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC */
public final class ImproveHeaderUIC extends C102084a implements ICoverStatusChanged, C94928p2.C94933e, C100848g {
    public static final C95841a Companion = new C95841a((C8480h) null);
    private static final String TAG = "MicroMsg.Improve.CoverUIC";
    private final C13601g avatarImg$delegate = C36568h.m40985a(new C95842b(this));
    private AbsSnsBackPreview backPreview;
    private final C13601g changeCoverLayout$delegate = C36568h.m40985a(new C95843c(this));
    private final C13601g coverLayout$delegate = C36568h.m40985a(new C95844d(this));
    private final C102074a coverReporter = new C102074a();
    private final C13601g nickNameTxt$delegate = C36568h.m40985a(new C95855k(this));
    private C100422y snsCover;
    private C100847f snsCoverStatus = new C100847f(true, false);
    private final C13601g userName$delegate = C36568h.m40985a(C95859o.f279750d);

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$a */
    public static final class C95841a {
        public C95841a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$b */
    public static final class C95842b extends C87413o implements C32224a<TouchImageView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95842b(ImproveHeaderUIC improveHeaderUIC) {
            super(0);
            this.f279718d = improveHeaderUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$avatarImg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$avatarImg$2");
            TouchImageView touchImageView = (TouchImageView) this.f279718d.findViewById(C0966R.C0970id.a27);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$avatarImg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$avatarImg$2");
            return touchImageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$c */
    public static final class C95843c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95843c(ImproveHeaderUIC improveHeaderUIC) {
            super(0);
            this.f279719d = improveHeaderUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$changeCoverLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$changeCoverLayout$2");
            View findViewById = this.f279719d.findViewById(C0966R.C0970id.jrv);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$changeCoverLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$changeCoverLayout$2");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$d */
    public static final class C95844d extends C87413o implements C32224a<SnsImproveCoverLayout> {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95844d(ImproveHeaderUIC improveHeaderUIC) {
            super(0);
            this.f279720d = improveHeaderUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$coverLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$coverLayout$2");
            SnsImproveCoverLayout snsImproveCoverLayout = (SnsImproveCoverLayout) this.f279720d.findViewById(C0966R.C0970id.oew);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$coverLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$coverLayout$2");
            return snsImproveCoverLayout;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2", mo125469f = "ImproveHeaderUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$e */
    public static final class C95845e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279721d;

        /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$e$a */
        public static final class C95846a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ImproveHeaderUIC f279722d;

            public C95846a(ImproveHeaderUIC improveHeaderUIC) {
                this.f279722d = improveHeaderUIC;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadAvatar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
                ImproveHeaderUIC.access$jumpToSelfPage(this.f279722d);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadAvatar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95845e(ImproveHeaderUIC improveHeaderUIC, C15601d<? super C95845e> dVar) {
            super(2, dVar);
            this.f279721d = improveHeaderUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2");
            C95845e eVar = new C95845e(this.f279721d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2");
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2");
            Object invokeSuspend = ((C95845e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2");
            ResultKt.throwOnFailure(obj);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW(ImproveHeaderUIC.access$getAvatarImg(this.f279721d), ImproveHeaderUIC.access$getUserName(this.f279721d), true);
            ImproveHeaderUIC.access$getAvatarImg(this.f279721d).setOnClickListener(new C95846a(this.f279721d));
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC", mo125469f = "ImproveHeaderUIC.kt", mo125470l = {175}, mo125471m = "loadCover")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$f */
    public static final class C95847f extends C66704d {

        /* renamed from: d */
        public Object f279723d;

        /* renamed from: e */
        public Object f279724e;

        /* renamed from: f */
        public Object f279725f;

        /* renamed from: g */
        public /* synthetic */ Object f279726g;

        /* renamed from: h */
        public final /* synthetic */ ImproveHeaderUIC f279727h;

        /* renamed from: i */
        public int f279728i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95847f(ImproveHeaderUIC improveHeaderUIC, C15601d<? super C95847f> dVar) {
            super(dVar);
            this.f279727h = improveHeaderUIC;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$1");
            this.f279726g = obj;
            this.f279728i |= Integer.MIN_VALUE;
            Object access$loadCover = ImproveHeaderUIC.access$loadCover(this.f279727h, (C100422y) null, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$1");
            return access$loadCover;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2", mo125469f = "ImproveHeaderUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$g */
    public static final class C95848g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279729d;

        /* renamed from: e */
        public final /* synthetic */ AbsSnsBackPreview f279730e;

        /* renamed from: f */
        public final /* synthetic */ int f279731f;

        /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$g$a */
        public static final class C95849a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ImproveHeaderUIC f279732d;

            public C95849a(ImproveHeaderUIC improveHeaderUIC) {
                this.f279732d = improveHeaderUIC;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadCover$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2$1");
                ImproveHeaderUIC.access$changeCover(this.f279732d);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadCover$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95848g(ImproveHeaderUIC improveHeaderUIC, AbsSnsBackPreview absSnsBackPreview, int i, C15601d<? super C95848g> dVar) {
            super(2, dVar);
            this.f279729d = improveHeaderUIC;
            this.f279730e = absSnsBackPreview;
            this.f279731f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
            C95848g gVar = new C95848g(this.f279729d, this.f279730e, this.f279731f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
            return gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
            Object invokeSuspend = ((C95848g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            AbsSnsBackPreview absSnsBackPreview;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
            ResultKt.throwOnFailure(obj);
            AbsSnsBackPreview access$getBackPreview$p = ImproveHeaderUIC.access$getBackPreview$p(this.f279729d);
            if (access$getBackPreview$p != null) {
                access$getBackPreview$p.onPause();
            }
            AbsSnsBackPreview access$getBackPreview$p2 = ImproveHeaderUIC.access$getBackPreview$p(this.f279729d);
            if (access$getBackPreview$p2 != null) {
                access$getBackPreview$p2.onDestroy();
            }
            ImproveHeaderUIC.access$getCoverLayout(this.f279729d).removeAllViews();
            ImproveHeaderUIC.access$getCoverLayout(this.f279729d).mo133334c();
            ImproveHeaderUIC.access$getSnsCoverStatus$p(this.f279729d).f295360a = true;
            ImproveHeaderUIC.access$getCoverLayout(this.f279729d).addView(this.f279730e);
            ImproveHeaderUIC.access$setupPreviewMask(this.f279729d, this.f279730e);
            if (this.f279731f == 0 && (absSnsBackPreview = this.f279730e) != null) {
                absSnsBackPreview.setOnClickListener(new C95849a(this.f279729d));
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadCover$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC", mo125469f = "ImproveHeaderUIC.kt", mo125470l = {131, 151}, mo125471m = "loadNickName")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$h */
    public static final class C95850h extends C66704d {

        /* renamed from: d */
        public Object f279733d;

        /* renamed from: e */
        public Object f279734e;

        /* renamed from: f */
        public /* synthetic */ Object f279735f;

        /* renamed from: g */
        public final /* synthetic */ ImproveHeaderUIC f279736g;

        /* renamed from: h */
        public int f279737h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95850h(ImproveHeaderUIC improveHeaderUIC, C15601d<? super C95850h> dVar) {
            super(dVar);
            this.f279736g = improveHeaderUIC;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$1");
            this.f279735f = obj;
            this.f279737h |= Integer.MIN_VALUE;
            Object access$loadNickName = ImproveHeaderUIC.access$loadNickName(this.f279736g, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$1");
            return access$loadNickName;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2", mo125469f = "ImproveHeaderUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$i */
    public static final class C95851i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279738d;

        /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$i$a */
        public static final class C95852a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ImproveHeaderUIC f279739d;

            public C95852a(ImproveHeaderUIC improveHeaderUIC) {
                this.f279739d = improveHeaderUIC;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2$1");
                ImproveHeaderUIC.access$jumpToSelfPage(this.f279739d);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$i$b */
        public static final class C95853b implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ ImproveHeaderUIC f279740d;

            public C95853b(ImproveHeaderUIC improveHeaderUIC) {
                this.f279740d = improveHeaderUIC;
            }

            public final boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2$2");
                C102279c cVar = (C102279c) C39818r.f106831a.mo62443b(this.f279740d.getContext()).mo75002a(C102279c.class);
                cVar.getClass();
                SnsMethodCalculate.markStartTimeMs("debugInsertToList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
                boolean z = false;
                C98214b b = ((C98799a) cVar.mo141841d3().f272353o.get(0)).mo138170b();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 1; i < 5; i++) {
                    arrayList2.add(((C98799a) cVar.mo141841d3().f272353o.get(0)).mo138170b());
                }
                Iterator it = arrayList2.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C98214b bVar = new C98214b();
                        bVar.convertFrom(((C98214b) next).mo142397l2(), z);
                        long j = (long) i2;
                        bVar.setSnsId(b.mo142401p2() + j + 1);
                        bVar.systemRowid = b.systemRowid + j + 1;
                        bVar.setCreateTime(b.getCreateTime());
                        MvvmList.m119209l(cVar.mo141841d3(), new C98799a(bVar), false, 2, (Object) null);
                        i2 = i3;
                        it = it;
                        z = false;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                C76912y0.makeText((Context) cVar.getContext(), (CharSequence) "Debug Mock:InsertToList", 0).show();
                SnsMethodCalculate.markEndTimeMs("debugInsertToList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
                SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2$2");
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95851i(ImproveHeaderUIC improveHeaderUIC, C15601d<? super C95851i> dVar) {
            super(2, dVar);
            this.f279738d = improveHeaderUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
            C95851i iVar = new C95851i(this.f279738d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
            return iVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
            Object invokeSuspend = ((C95851i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
            ResultKt.throwOnFailure(obj);
            ImproveHeaderUIC.access$getNickNameTxt(this.f279738d).setOnClickListener(new C95852a(this.f279738d));
            if (WeChatEnvironment.isCoolassistEnv() || WeChatEnvironment.hasDebugger()) {
                ImproveHeaderUIC.access$getNickNameTxt(this.f279738d).setOnLongClickListener(new C95853b(this.f279738d));
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3", mo125469f = "ImproveHeaderUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$j */
    public static final class C95854j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279741d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f279742e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95854j(ImproveHeaderUIC improveHeaderUIC, CharSequence charSequence, C15601d<? super C95854j> dVar) {
            super(2, dVar);
            this.f279741d = improveHeaderUIC;
            this.f279742e = charSequence;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            C95854j jVar = new C95854j(this.f279741d, this.f279742e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            return jVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            Object invokeSuspend = ((C95854j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            ResultKt.throwOnFailure(obj);
            ImproveHeaderUIC.access$getNickNameTxt(this.f279741d).setText(this.f279742e);
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$k */
    public static final class C95855k extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95855k(ImproveHeaderUIC improveHeaderUIC) {
            super(0);
            this.f279743d = improveHeaderUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$nickNameTxt$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$nickNameTxt$2");
            TextView textView = (TextView) this.f279743d.findViewById(C0966R.C0970id.hg4);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$nickNameTxt$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$nickNameTxt$2");
            return textView;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1", mo125469f = "ImproveHeaderUIC.kt", mo125470l = {80, 81, 82}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$l */
    public static final class C95856l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f279744d;

        /* renamed from: e */
        public final /* synthetic */ ImproveHeaderUIC f279745e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95856l(ImproveHeaderUIC improveHeaderUIC, C15601d<? super C95856l> dVar) {
            super(2, dVar);
            this.f279745e = improveHeaderUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
            C95856l lVar = new C95856l(this.f279745e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
            return lVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
            Object invokeSuspend = ((C95856l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1");
            return invokeSuspend;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = "invokeSuspend"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r3 = r7.f279744d
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L_0x002e
                if (r3 == r6) goto L_0x002a
                if (r3 == r5) goto L_0x0026
                if (r3 != r4) goto L_0x001b
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0069
            L_0x001b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                throw r8
            L_0x0026:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x004d
            L_0x002a:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x003f
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r8)
                com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC r8 = r7.f279745e
                r7.f279744d = r6
                java.lang.Object r8 = com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.access$loadAvatar(r8, r7)
                if (r8 != r2) goto L_0x003f
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            L_0x003f:
                com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC r8 = r7.f279745e
                r7.f279744d = r5
                java.lang.Object r8 = com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.access$loadNickName(r8, r7)
                if (r8 != r2) goto L_0x004d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            L_0x004d:
                com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC r8 = r7.f279745e
                os2.z r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Ux0()
                com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC r5 = r7.f279745e
                java.lang.String r5 = com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.access$getUserName(r5)
                os2.y r3 = r3.mo139909Yt(r5)
                r7.f279744d = r4
                java.lang.Object r8 = com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.access$loadCover(r8, r3, r7)
                if (r8 != r2) goto L_0x0069
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            L_0x0069:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.C95856l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$m */
    public static final class C95857m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveHeaderUIC f279746d;

        public C95857m(ImproveHeaderUIC improveHeaderUIC) {
            this.f279746d = improveHeaderUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$2");
            ImproveHeaderUIC.access$changeCover(this.f279746d);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1", mo125469f = "ImproveHeaderUIC.kt", mo125470l = {235}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$n */
    public static final class C95858n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f279747d;

        /* renamed from: e */
        public final /* synthetic */ ImproveHeaderUIC f279748e;

        /* renamed from: f */
        public final /* synthetic */ C100422y f279749f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95858n(ImproveHeaderUIC improveHeaderUIC, C100422y yVar, C15601d<? super C95858n> dVar) {
            super(2, dVar);
            this.f279748e = improveHeaderUIC;
            this.f279749f = yVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
            C95858n nVar = new C95858n(this.f279748e, this.f279749f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
            return nVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
            Object invokeSuspend = ((C95858n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f279747d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImproveHeaderUIC improveHeaderUIC = this.f279748e;
                C100422y yVar = this.f279749f;
                this.f279747d = 1;
                if (ImproveHeaderUIC.access$loadCover(improveHeaderUIC, yVar, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$updateBackView$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$o */
    public static final class C95859o extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C95859o f279750d = new C95859o();

        public C95859o() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$userName$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$userName$2");
            String s = C75592q0.m90789s();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$userName$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$userName$2");
            return s;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveHeaderUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public static final /* synthetic */ void access$changeCover(ImproveHeaderUIC improveHeaderUIC) {
        SnsMethodCalculate.markStartTimeMs("access$changeCover", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        improveHeaderUIC.changeCover();
        SnsMethodCalculate.markEndTimeMs("access$changeCover", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public static final /* synthetic */ TouchImageView access$getAvatarImg(ImproveHeaderUIC improveHeaderUIC) {
        SnsMethodCalculate.markStartTimeMs("access$getAvatarImg", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        TouchImageView avatarImg = improveHeaderUIC.getAvatarImg();
        SnsMethodCalculate.markEndTimeMs("access$getAvatarImg", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return avatarImg;
    }

    public static final /* synthetic */ AbsSnsBackPreview access$getBackPreview$p(ImproveHeaderUIC improveHeaderUIC) {
        SnsMethodCalculate.markStartTimeMs("access$getBackPreview$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        AbsSnsBackPreview absSnsBackPreview = improveHeaderUIC.backPreview;
        SnsMethodCalculate.markEndTimeMs("access$getBackPreview$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return absSnsBackPreview;
    }

    public static final /* synthetic */ SnsImproveCoverLayout access$getCoverLayout(ImproveHeaderUIC improveHeaderUIC) {
        SnsMethodCalculate.markStartTimeMs("access$getCoverLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        SnsImproveCoverLayout coverLayout = improveHeaderUIC.getCoverLayout();
        SnsMethodCalculate.markEndTimeMs("access$getCoverLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return coverLayout;
    }

    public static final /* synthetic */ TextView access$getNickNameTxt(ImproveHeaderUIC improveHeaderUIC) {
        SnsMethodCalculate.markStartTimeMs("access$getNickNameTxt", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        TextView nickNameTxt = improveHeaderUIC.getNickNameTxt();
        SnsMethodCalculate.markEndTimeMs("access$getNickNameTxt", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return nickNameTxt;
    }

    public static final /* synthetic */ C100847f access$getSnsCoverStatus$p(ImproveHeaderUIC improveHeaderUIC) {
        SnsMethodCalculate.markStartTimeMs("access$getSnsCoverStatus$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        C100847f fVar = improveHeaderUIC.snsCoverStatus;
        SnsMethodCalculate.markEndTimeMs("access$getSnsCoverStatus$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return fVar;
    }

    public static final /* synthetic */ String access$getUserName(ImproveHeaderUIC improveHeaderUIC) {
        SnsMethodCalculate.markStartTimeMs("access$getUserName", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        String userName = improveHeaderUIC.getUserName();
        SnsMethodCalculate.markEndTimeMs("access$getUserName", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return userName;
    }

    public static final /* synthetic */ void access$jumpToSelfPage(ImproveHeaderUIC improveHeaderUIC) {
        SnsMethodCalculate.markStartTimeMs("access$jumpToSelfPage", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        improveHeaderUIC.jumpToSelfPage();
        SnsMethodCalculate.markEndTimeMs("access$jumpToSelfPage", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public static final /* synthetic */ Object access$loadAvatar(ImproveHeaderUIC improveHeaderUIC, C15601d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$loadAvatar", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Object loadAvatar = improveHeaderUIC.loadAvatar(dVar);
        SnsMethodCalculate.markEndTimeMs("access$loadAvatar", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return loadAvatar;
    }

    public static final /* synthetic */ Object access$loadCover(ImproveHeaderUIC improveHeaderUIC, C100422y yVar, C15601d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$loadCover", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Object loadCover = improveHeaderUIC.loadCover(yVar, dVar);
        SnsMethodCalculate.markEndTimeMs("access$loadCover", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return loadCover;
    }

    public static final /* synthetic */ Object access$loadNickName(ImproveHeaderUIC improveHeaderUIC, C15601d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$loadNickName", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Object loadNickName = improveHeaderUIC.loadNickName(dVar);
        SnsMethodCalculate.markEndTimeMs("access$loadNickName", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return loadNickName;
    }

    public static final /* synthetic */ void access$setupPreviewMask(ImproveHeaderUIC improveHeaderUIC, AbsSnsBackPreview absSnsBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$setupPreviewMask", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        improveHeaderUIC.setupPreviewMask(absSnsBackPreview);
        SnsMethodCalculate.markEndTimeMs("access$setupPreviewMask", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    private final void changeCover() {
        SnsMethodCalculate.markStartTimeMs("changeCover", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Log.m105924i(TAG, "changeCover");
        Intent intent = new Intent();
        intent.putExtra("username", C92093b.f263643a.mo126084a());
        intent.setClass(getContext(), SettingSnsBackgroundUI.class);
        Activity context = getContext();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(7);
        aVar.mo10233c(intent);
        C117292a.m165364j(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC", "changeCover", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        SnsMethodCalculate.markEndTimeMs("changeCover", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    private final void destroyCover() {
        SnsMethodCalculate.markStartTimeMs("destroyCover", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Log.m105924i(TAG, '[' + hashCode() + "] onDestroy");
        AbsSnsBackPreview absSnsBackPreview = this.backPreview;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onDestroy();
        }
        C102074a aVar = this.coverReporter;
        C100422y yVar = this.snsCover;
        aVar.mo141569i(yVar != null ? Boolean.valueOf(yVar.field_isLike) : null);
        this.coverReporter.mo141571k(!this.snsCoverStatus.f295361b);
        SnsMethodCalculate.markEndTimeMs("destroyCover", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    private final TouchImageView getAvatarImg() {
        SnsMethodCalculate.markStartTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Object value = this.avatarImg$delegate.getValue();
        C87412m.m108593f(value, "<get-avatarImg>(...)");
        TouchImageView touchImageView = (TouchImageView) value;
        SnsMethodCalculate.markEndTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return touchImageView;
    }

    private final View getChangeCoverLayout() {
        SnsMethodCalculate.markStartTimeMs("getChangeCoverLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Object value = this.changeCoverLayout$delegate.getValue();
        C87412m.m108593f(value, "<get-changeCoverLayout>(...)");
        View view = (View) value;
        SnsMethodCalculate.markEndTimeMs("getChangeCoverLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return view;
    }

    private final SnsImproveCoverLayout getCoverLayout() {
        SnsMethodCalculate.markStartTimeMs("getCoverLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Object value = this.coverLayout$delegate.getValue();
        C87412m.m108593f(value, "<get-coverLayout>(...)");
        SnsImproveCoverLayout snsImproveCoverLayout = (SnsImproveCoverLayout) value;
        SnsMethodCalculate.markEndTimeMs("getCoverLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return snsImproveCoverLayout;
    }

    private final TextView getNickNameTxt() {
        SnsMethodCalculate.markStartTimeMs("getNickNameTxt", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Object value = this.nickNameTxt$delegate.getValue();
        C87412m.m108593f(value, "<get-nickNameTxt>(...)");
        TextView textView = (TextView) value;
        SnsMethodCalculate.markEndTimeMs("getNickNameTxt", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return textView;
    }

    private final String getUserName() {
        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Object value = this.userName$delegate.getValue();
        C87412m.m108593f(value, "<get-userName>(...)");
        String str = (String) value;
        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return str;
    }

    private final void jumpToSelfPage() {
        SnsMethodCalculate.markStartTimeMs("jumpToSelfPage", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        Intent intent = new Intent();
        intent.putExtra("Contact_User", getUserName());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 6);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, getContext());
        ((C99333f) C86312j.m106911c(C99333f.class)).um0(12076, "BrowseMyAlbumTime");
        SnsMethodCalculate.markEndTimeMs("jumpToSelfPage", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    private final Object loadAvatar(C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadAvatar", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C95845e(this, (C15601d<? super C95845e>) null), dVar);
        if (g == C15911a.COROUTINE_SUSPENDED) {
            SnsMethodCalculate.markEndTimeMs("loadAvatar", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
            return g;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("loadAvatar", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object loadCover(os2.C100422y r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "loadCover"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r11 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.C95847f
            if (r2 == 0) goto L_0x001b
            r2 = r11
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$f r2 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.C95847f) r2
            int r3 = r2.f279728i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f279728i = r3
            goto L_0x0020
        L_0x001b:
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$f r2 = new com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$f
            r2.<init>(r9, r11)
        L_0x0020:
            java.lang.Object r11 = r2.f279726g
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f279728i
            r5 = 1
            if (r4 == 0) goto L_0x0046
            if (r4 != r5) goto L_0x003b
            java.lang.Object r10 = r2.f279725f
            com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview r10 = (com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview) r10
            java.lang.Object r3 = r2.f279724e
            os2.y r3 = (os2.C100422y) r3
            java.lang.Object r2 = r2.f279723d
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC r2 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0078
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r10
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r11)
            r9.snsCover = r10
            int r11 = r10.getType()
            tr2.a r4 = tr2.C101917a.f300080a
            android.app.Activity r6 = r9.getContext()
            com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview r4 = r4.mo141418a(r6, r11)
            a14.h0 r6 = a14.C53872d1.f151117a
            a14.k2 r6 = f14.C58901s.f168555a
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$g r7 = new com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$g
            r8 = 0
            r7.<init>(r9, r4, r11, r8)
            r2.f279723d = r9
            r2.f279724e = r10
            r2.f279725f = r4
            r2.f279728i = r5
            java.lang.Object r11 = a14.C53895h.m60469g(r6, r7, r2)
            if (r11 != r3) goto L_0x0075
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0075:
            r2 = r9
            r3 = r10
            r10 = r4
        L_0x0078:
            if (r10 == 0) goto L_0x007d
            r10.setCoverFoldStatusProvider(r2)
        L_0x007d:
            if (r10 == 0) goto L_0x0082
            r10.loadCover(r3)
        L_0x0082:
            r2.backPreview = r10
            com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout r10 = r2.getCoverLayout()
            r10.setStatusChangedCallback(r2)
            ur2.a r10 = r2.coverReporter
            pr2.f r11 = r2.snsCoverStatus
            boolean r11 = r11.f295361b
            r11 = r11 ^ r5
            r10.mo141570j(r3, r11)
            ur2.a r10 = r2.coverReporter
            java.lang.String r11 = r3.toString()
            java.lang.String r2 = "cover.toString()"
            gy3.C87412m.m108593f(r11, r2)
            r10.mo141567g(r11)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.loadCover(os2.y, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object loadNickName(wx3.C15601d<? super rx3.C13598b0> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "loadNickName"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.C95850h
            if (r4 == 0) goto L_0x001f
            r4 = r1
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$h r4 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.C95850h) r4
            int r5 = r4.f279737h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001f
            int r5 = r5 - r6
            r4.f279737h = r5
            goto L_0x0024
        L_0x001f:
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$h r4 = new com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$h
            r4.<init>(r0, r1)
        L_0x0024:
            java.lang.Object r1 = r4.f279735f
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f279737h
            r7 = 2
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x004f
            if (r6 == r8) goto L_0x0043
            if (r6 != r7) goto L_0x0038
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00d9
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r1
        L_0x0043:
            java.lang.Object r6 = r4.f279734e
            android.text.SpannableString r6 = (android.text.SpannableString) r6
            java.lang.Object r8 = r4.f279733d
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC r8 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC) r8
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0094
        L_0x004f:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r6 = r17.getUserName()
            com.tencent.mm.storage.z1 r1 = r1.get(r6)
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            android.app.Activity r10 = r17.getContext()
            java.lang.String r1 = r1.mo62898f()
            android.text.SpannableString r6 = r6.mo107057T1(r10, r1)
            a14.h0 r1 = a14.C53872d1.f151117a
            a14.k2 r1 = f14.C58901s.f168555a
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$i r10 = new com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$i
            r10.<init>(r0, r9)
            r4.f279733d = r0
            r4.f279734e = r6
            r4.f279737h = r8
            java.lang.Object r1 = a14.C53895h.m60469g(r1, r10, r4)
            if (r1 != r5) goto L_0x0093
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x0093:
            r8 = r0
        L_0x0094:
            r13 = r6
            java.lang.Class<yy.k> r1 = p773yy.C79168k.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r10 = r1
            yy.k r10 = (p773yy.C79168k) r10
            android.widget.TextView r11 = r8.getNickNameTxt()
            java.lang.String r12 = r8.getUserName()
            qy2.a$c r14 = qy2.C63347a.C47892c.SNS_TIMELINE_NICK
            android.widget.TextView r1 = r8.getNickNameTxt()
            float r1 = r1.getTextSize()
            r6 = r8
            double r7 = (double) r1
            r15 = 4607857958744122982(0x3ff2666666666666, double:1.15)
            double r7 = r7 * r15
            int r1 = (int) r7
            float r15 = (float) r1
            java.lang.CharSequence r1 = r10.mo74108Fe(r11, r12, r13, r14, r15)
            a14.h0 r7 = a14.C53872d1.f151117a
            a14.k2 r7 = f14.C58901s.f168555a
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$j r8 = new com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$j
            r8.<init>(r6, r1, r9)
            r4.f279733d = r9
            r4.f279734e = r9
            r1 = 2
            r4.f279737h = r1
            java.lang.Object r1 = a14.C53895h.m60469g(r7, r8, r4)
            if (r1 != r5) goto L_0x00d9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x00d9:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.header.ImproveHeaderUIC.loadNickName(wx3.d):java.lang.Object");
    }

    private final void setupPreviewMask(AbsSnsBackPreview absSnsBackPreview) {
        SnsMethodCalculate.markStartTimeMs("setupPreviewMask", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        View view = null;
        View findViewById = absSnsBackPreview != null ? absSnsBackPreview.findViewById(C0966R.C0970id.jsq) : null;
        if (findViewById != null) {
            findViewById.setBackgroundResource(C0966R.C0969drawable.atd);
        }
        if (absSnsBackPreview != null) {
            view = absSnsBackPreview.findViewById(C0966R.C0970id.jsp);
        }
        if (view != null) {
            view.setBackgroundResource(C0966R.C0969drawable.atb);
        }
        SnsMethodCalculate.markEndTimeMs("setupPreviewMask", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public C100846e getSnsCoverReporter() {
        SnsMethodCalculate.markStartTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        C102074a aVar = this.coverReporter;
        SnsMethodCalculate.markEndTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return aVar;
    }

    public C100847f getStatus() {
        SnsMethodCalculate.markStartTimeMs("getStatus", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        C100847f fVar = this.snsCoverStatus;
        SnsMethodCalculate.markEndTimeMs("getStatus", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return fVar;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 7) {
            Log.m105924i(TAG, "change cover result callback");
            C94866e1.gy0().mo131192c();
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public boolean onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        SnsImproveCoverLayout coverLayout = getCoverLayout();
        coverLayout.getClass();
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int i = coverLayout.f279807e;
        boolean z = true;
        if (i == 1) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        } else {
            if (i == 2) {
                coverLayout.mo133333b();
            }
            SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        }
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        return z;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        super.onCreate(bundle);
        C0317e.launch$default(this, C53872d1.f151117a, (C53934p0) null, new C95856l(this, (C15601d<? super C95856l>) null), 2, (Object) null);
        getChangeCoverLayout().setOnClickListener(new C95857m(this));
        C94866e1.gy0().mo131190a(this);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        super.onDestroy();
        C94866e1.gy0().mo131202m(this);
        destroyCover();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        super.onPause();
        AbsSnsBackPreview absSnsBackPreview = this.backPreview;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPause();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void onPostClose() {
        SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        this.snsCoverStatus.f295360a = true;
        AbsSnsBackPreview absSnsBackPreview = this.backPreview;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPostClose();
        }
        SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void onPostEnd(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void onPostOpen() {
        SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        this.snsCoverStatus.f295360a = false;
        AbsSnsBackPreview absSnsBackPreview = this.backPreview;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPostOpen();
        }
        SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void onPreClose() {
        SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        AbsSnsBackPreview absSnsBackPreview = this.backPreview;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPreClose();
        }
        SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void onPreOpen() {
        SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        AbsSnsBackPreview absSnsBackPreview = this.backPreview;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPreOpen();
        }
        this.coverReporter.mo141568h();
        SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        super.onResume();
        AbsSnsBackPreview absSnsBackPreview = this.backPreview;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onResume();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }

    public void updateBackView(C100422y yVar) {
        SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
        if (yVar == null) {
            SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
            return;
        }
        C0317e.launch$default(this, C53872d1.f151117a, (C53934p0) null, new C95858n(this, yVar, (C15601d<? super C95858n>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC");
    }
}
