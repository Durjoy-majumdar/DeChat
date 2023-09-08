package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53916l;
import a14.C53921m;
import a14.C53934p0;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveRealNameVerifyJumpUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import er1.C7813i5;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8960d6;
import il1.C8966e6;
import il1.C8968f2;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import kotlin.Result;
import o40.C61926c;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48779ay0;
import te3.ca4;
import wx3.C15601d;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI */
public final class FinderLivePostHelperUI extends MMFinderUI {

    /* renamed from: o */
    public C8968f2 f16923o;

    /* renamed from: p */
    public C8966e6 f16924p;

    /* renamed from: q */
    public ProgressBar f16925q;

    /* renamed from: r */
    public int f16926r;

    /* renamed from: s */
    public final IListener<?> f16927s = new FinderLivePostHelperUI$realnameNotifyListener$1(this, C40008f.f107254d);

    /* renamed from: t */
    public final C13601g f16928t = C36568h.m40985a(new C3683b(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$a */
    public static final class C3682a implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C53916l<Boolean> f16929d;

        public C3682a(C53916l<? super Boolean> lVar) {
            this.f16929d = lVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C53916l<Boolean> lVar = this.f16929d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$b */
    public static final class C3683b extends C87413o implements C32224a<C7813i5> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostHelperUI f16930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3683b(FinderLivePostHelperUI finderLivePostHelperUI) {
            super(0);
            this.f16930d = finderLivePostHelperUI;
        }

        public Object invoke() {
            C7813i5.C7814a aVar = C7813i5.f26336f;
            AppCompatActivity context = this.f16930d.getContext();
            C87412m.m108593f(context, "context");
            return C7813i5.C7814a.m7953a(aVar, context, this.f16930d.getContext().getResources().getString(C0966R.string.ett), 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$c */
    public static final class C3684c extends C87413o implements C32227p<String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostHelperUI f16931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3684c(FinderLivePostHelperUI finderLivePostHelperUI) {
            super(2);
            this.f16931d = finderLivePostHelperUI;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(str, "verifyUrl");
            FinderLivePostHelperUI finderLivePostHelperUI = this.f16931d;
            finderLivePostHelperUI.f16926r = intValue;
            if (intValue == 1) {
                finderLivePostHelperUI.f16927s.alive();
                Intent intent = new Intent();
                intent.setClass(finderLivePostHelperUI.getContext(), FinderLiveRealNameVerifyJumpUI.class);
                intent.putExtra("enterRealnameVerifyUI", true);
                AppCompatActivity context = finderLivePostHelperUI.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI", "goToPayRealNameVerify", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/ui/FinderLivePostHelperUI", "goToPayRealNameVerify", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (intValue != 4) {
                FinderLivePostHelperUI.m3882O7(finderLivePostHelperUI, str, 10001);
            } else {
                LifecycleScope uICScope = finderLivePostHelperUI.getUICScope();
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(uICScope, C58901s.f168555a, (C53934p0) null, new C3860m1(this.f16931d, (C15601d<? super C3860m1>) null), 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$d */
    public static final class C3685d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostHelperUI f16932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3685d(FinderLivePostHelperUI finderLivePostHelperUI) {
            super(1);
            this.f16932d = finderLivePostHelperUI;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Intent intent = new Intent();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC, Boolean.TRUE);
                C32444a.f86121a.mo58624e(1);
                intent.putExtra("PRECHECK_RESULT", 1);
                this.f16932d.setResult(-1, intent);
            }
            this.f16932d.finish();
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$precheckSuccessUpdate$1", mo125469f = "FinderLivePostHelperUI.kt", mo125470l = {257}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI$e */
    public static final class C3686e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f16933d;

        /* renamed from: e */
        public int f16934e;

        /* renamed from: f */
        public final /* synthetic */ FinderLivePostHelperUI f16935f;

        /* renamed from: g */
        public final /* synthetic */ int f16936g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3686e(FinderLivePostHelperUI finderLivePostHelperUI, int i, C15601d<? super C3686e> dVar) {
            super(2, dVar);
            this.f16935f = finderLivePostHelperUI;
            this.f16936g = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3686e(this.f16935f, this.f16936g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3686e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
            r2 = r11.f32543c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r10.f16934e
                r2 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                java.lang.Object r0 = r10.f16933d
                mk1.h r0 = (mk1.C10906h) r0
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0036
            L_0x0011:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r11)
                mk1.h r11 = new mk1.h
                com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r4 = r10.f16935f
                r5 = 0
                r6 = 0
                r8 = 6
                r9 = 0
                r3 = r11
                r3.<init>(r4, r5, r6, r8, r9)
                r10.f16933d = r11
                r10.f16934e = r2
                java.lang.Object r1 = r11.mo11115d(r10)
                if (r1 != r0) goto L_0x0034
                return r0
            L_0x0034:
                r0 = r11
                r11 = r1
            L_0x0036:
                mk1.h$a r11 = (mk1.C10906h.C10907a) r11
                boolean r0 = r0.mo11112a(r11)
                java.lang.String r1 = "Finder.FinderLivePostHelperUI"
                java.lang.String r3 = "precheck"
                r4 = 0
                if (r0 != 0) goto L_0x0058
                java.lang.String r11 = "refreshResp2 failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
                com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r11 = r10.f16935f
                il1.e6 r11 = r11.f16924p
                if (r11 == 0) goto L_0x0054
                int r0 = r10.f16936g
                r11.mo9775g(r2, r0)
                goto L_0x00a5
            L_0x0054:
                gy3.C87412m.m108603p(r3)
                throw r4
            L_0x0058:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "refresh2 user_flag:"
                r0.append(r2)
                if (r11 == 0) goto L_0x0070
                te3.cj0 r2 = r11.f32543c
                if (r2 == 0) goto L_0x0070
                int r2 = r2.f131756f
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r2)
                goto L_0x0071
            L_0x0070:
                r5 = r4
            L_0x0071:
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r0 = r10.f16935f
                il1.e6 r0 = r0.f16924p
                if (r0 == 0) goto L_0x00ac
                if (r11 == 0) goto L_0x008a
                te3.cj0 r11 = r11.f32543c
                if (r11 == 0) goto L_0x008a
                int r11 = r11.f131756f
                goto L_0x008c
            L_0x008a:
                int r11 = r0.f28323f
            L_0x008c:
                r0.f28323f = r11
                r0.mo9770b()
                com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r11 = r10.f16935f
                il1.e6 r11 = r11.f16924p
                if (r11 == 0) goto L_0x00a8
                r11.mo9774f()
                r11.mo9771c()
                java.lang.String r0 = r11.f28325h
                r11.mo9773e(r0)
                r11.mo9772d()
            L_0x00a5:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            L_0x00a8:
                gy3.C87412m.m108603p(r3)
                throw r4
            L_0x00ac:
                gy3.C87412m.m108603p(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderLivePostHelperUI.C3686e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0088, code lost:
        r1 = (bi1.C0287e) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        if ((r1 instanceof bi1.C0288f) != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("getPrepareInfoResult failed, ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        if ((r1 instanceof bi1.C0281b) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        r1 = (bi1.C0281b) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        if (r1 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        r1 = (bi1.C0280a) r1.f843b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r4.append(r1);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.FinderLivePostHelperUI", r4.toString());
        r2.f17368d = null;
        r2.f17371g = 2;
        r1 = r0.mo4067P7(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        if (r1 != r3) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00be, code lost:
        r1 = (te3.C50548ni1) ((bi1.C0288f) r1).f855b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c4, code lost:
        if (r1 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c6, code lost:
        r1 = r1.f138614d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (r1 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r4 = r1.f137436d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        if (r1 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        r10 = r1.f137437e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        r15 = new java.lang.StringBuilder();
        r15.append("appid:");
        r15.append(r4);
        r15.append(", category_id:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e8, code lost:
        if (r10 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r8 = r15;
        r11 = sx3.C110818d0.m150921S(r10, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, com.tencent.p014mm.plugin.finder.p056ui.C3838i1.f17375d, 31, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0108, code lost:
        r8 = r15;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010a, code lost:
        r8.append(r11);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.FinderLivePostHelperUI", r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0114, code lost:
        if (r4 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011a, code lost:
        if (r4.length() != 0) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011d, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011f, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        if (r4 != false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        if (r10 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        if (r10.isEmpty() == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012b, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012e, code lost:
        if (r4 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0132, code lost:
        r2.f17368d = r0;
        r2.f17371g = 4;
        r0.getClass();
        r4 = new a14.C53921m(xx3.C66447b.m78392b(r2), 1);
        r4.mo74609p();
        r8 = new com.tencent.p014mm.sdk.coroutines.SafeResume(r4);
        r10 = new android.content.Intent();
        r10.putExtra("intent_appid", r1.f137436d);
        r12 = r1.f137437e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015b, code lost:
        if (r12 != null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015d, code lost:
        r12 = sx3.C64186f0.f181907d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015f, code lost:
        r10.putExtra("intent_category_id", new org.json.JSONArray(r12).toString());
        r10.putExtra("id_ui_theme", 2);
        r11 = r1.f137438f;
        r12 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0174, code lost:
        if (r11 != null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0176, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0177, code lost:
        r10.putExtra("wecoin_apply_info", r11);
        r11 = r1.f137439g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017f, code lost:
        if (r11 != null) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0181, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0182, code lost:
        r10.putExtra("wecoin_protocol_url", r11);
        r1 = r1.f137440h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018a, code lost:
        if (r1 != null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018d, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018e, code lost:
        r10.putExtra("wecoin_apply_wording", r12);
        r1 = r0.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019a, code lost:
        if ((r1 instanceof com.tencent.p014mm.p136ui.MMActivity) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019c, code lost:
        r1 = (com.tencent.p014mm.p136ui.MMActivity) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a0, code lost:
        if (r1 == null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a2, code lost:
        r1.mmSetOnActivityResultCallback(new com.tencent.p014mm.plugin.finder.p056ui.C3843j1(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01aa, code lost:
        ke3.C88144b.m109795m(r0.getContext(), org.xwalk.core.XWalkEnvironment.MODULE_APPBRAND, ".ui.autofill.AppBrandIDCardUI", r10, 40001);
        r1 = r4.mo74608o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bc, code lost:
        if (r1 != r3) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c0, code lost:
        r1 = (java.lang.String) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c2, code lost:
        if (r1 == null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c8, code lost:
        if (r1.length() != 0) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cb, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cd, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ce, code lost:
        if (r8 == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.FinderLivePostHelperUI", "token null");
        r2.f17368d = null;
        r2.f17371g = 5;
        r1 = r0.mo4067P7(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01df, code lost:
        if (r1 != r3) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e3, code lost:
        r4 = new te3.C50406mi1();
        r4.f138043d = 2;
        r4.f138044e = r1;
        r4.f138045f = zc1.C66785b.f191882e.mo90662O5();
        r1 = r4.mo73344b();
        r2.f17368d = r0;
        r2.f17371g = 6;
        r1 = bi1.C0283d.m245c(r1, (wx3.C66212f) null, r2, 1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0201, code lost:
        if (r1 != r3) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0204, code lost:
        r1 = (bi1.C0287e) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0208, code lost:
        if ((r1 instanceof bi1.C0288f) != false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020a, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("uploadTokenResult failed, ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0217, code lost:
        if ((r1 instanceof bi1.C0281b) == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0219, code lost:
        r1 = (bi1.C0281b) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021d, code lost:
        if (r1 == null) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021f, code lost:
        r1 = (bi1.C0280a) r1.f843b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0225, code lost:
        r4.append(r1);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.FinderLivePostHelperUI", r4.toString());
        r2.f17368d = null;
        r2.f17371g = 7;
        r1 = r0.mo4067P7(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0238, code lost:
        if (r1 != r3) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023b, code lost:
        ((er1.C7813i5) ((rx3.C36570n) r0.f16928t).getValue()).mo8913b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x024b, code lost:
        r2.f17368d = null;
        r2.f17371g = 3;
        r1 = r0.mo4067P7(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0254, code lost:
        if (r1 != r3) goto L_0x0257;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m3881N7(com.tencent.p014mm.plugin.finder.p056ui.FinderLivePostHelperUI r21, wx3.C15601d r22) {
        /*
            r0 = r21
            r1 = r22
            r21.getClass()
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.p056ui.C3834h1
            if (r2 == 0) goto L_0x001a
            r2 = r1
            com.tencent.mm.plugin.finder.ui.h1 r2 = (com.tencent.p014mm.plugin.finder.p056ui.C3834h1) r2
            int r3 = r2.f17371g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f17371g = r3
            goto L_0x001f
        L_0x001a:
            com.tencent.mm.plugin.finder.ui.h1 r2 = new com.tencent.mm.plugin.finder.ui.h1
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.f17369e
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f17371g
            r5 = 2
            java.lang.String r6 = "Finder.FinderLivePostHelperUI"
            r7 = 0
            r9 = 1
            switch(r4) {
                case 0: goto L_0x0054;
                case 1: goto L_0x004c;
                case 2: goto L_0x0047;
                case 3: goto L_0x0047;
                case 4: goto L_0x003e;
                case 5: goto L_0x0047;
                case 6: goto L_0x0035;
                case 7: goto L_0x0047;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            java.lang.Object r0 = r2.f17368d
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r0 = (com.tencent.p014mm.plugin.finder.p056ui.FinderLivePostHelperUI) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0204
        L_0x003e:
            java.lang.Object r0 = r2.f17368d
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r0 = (com.tencent.p014mm.plugin.finder.p056ui.FinderLivePostHelperUI) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x01c0
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0257
        L_0x004c:
            java.lang.Object r0 = r2.f17368d
            com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI r0 = (com.tencent.p014mm.plugin.finder.p056ui.FinderLivePostHelperUI) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0088
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r1 = "#startLive finderrealnameverify check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            rx3.g r1 = r0.f16928t
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            er1.i5 r1 = (er1.C7813i5) r1
            r1.begin()
            te3.mi1 r1 = new te3.mi1
            r1.<init>()
            r1.f138043d = r9
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            r1.f138045f = r4
            ob0.b r1 = r1.mo73344b()
            r2.f17368d = r0
            r2.f17371g = r9
            java.lang.Object r1 = bi1.C0283d.m245c(r1, r7, r2, r9, r7)
            if (r1 != r3) goto L_0x0088
            goto L_0x0258
        L_0x0088:
            bi1.e r1 = (bi1.C0287e) r1
            boolean r4 = r1 instanceof bi1.C0288f
            if (r4 != 0) goto L_0x00be
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "getPrepareInfoResult failed, "
            r4.append(r8)
            boolean r8 = r1 instanceof bi1.C0281b
            if (r8 == 0) goto L_0x009f
            bi1.b r1 = (bi1.C0281b) r1
            goto L_0x00a0
        L_0x009f:
            r1 = r7
        L_0x00a0:
            if (r1 == 0) goto L_0x00a7
            T r1 = r1.f843b
            bi1.a r1 = (bi1.C0280a) r1
            goto L_0x00a8
        L_0x00a7:
            r1 = r7
        L_0x00a8:
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r2.f17368d = r7
            r2.f17371g = r5
            java.lang.Object r1 = r0.mo4067P7(r2)
            if (r1 != r3) goto L_0x0257
            goto L_0x0258
        L_0x00be:
            bi1.f r1 = (bi1.C0288f) r1
            T r1 = r1.f855b
            te3.ni1 r1 = (te3.C50548ni1) r1
            if (r1 == 0) goto L_0x00c9
            te3.li1 r1 = r1.f138614d
            goto L_0x00ca
        L_0x00c9:
            r1 = r7
        L_0x00ca:
            if (r1 == 0) goto L_0x00cf
            java.lang.String r4 = r1.f137436d
            goto L_0x00d0
        L_0x00cf:
            r4 = r7
        L_0x00d0:
            if (r1 == 0) goto L_0x00d5
            java.util.LinkedList<java.lang.Integer> r10 = r1.f137437e
            goto L_0x00d6
        L_0x00d5:
            r10 = r7
        L_0x00d6:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = "appid:"
            r15.append(r11)
            r15.append(r4)
            java.lang.String r11 = ", category_id:"
            r15.append(r11)
            if (r10 == 0) goto L_0x0108
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            com.tencent.mm.plugin.finder.ui.i1 r18 = com.tencent.p014mm.plugin.finder.p056ui.C3838i1.f17375d
            r19 = 31
            r20 = 0
            r11 = r10
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            java.lang.String r11 = sx3.C110818d0.m150921S(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x010a
        L_0x0108:
            r8 = r15
            r11 = r7
        L_0x010a:
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            if (r4 == 0) goto L_0x011f
            int r4 = r4.length()
            if (r4 != 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r4 = 0
            goto L_0x0120
        L_0x011f:
            r4 = 1
        L_0x0120:
            if (r4 != 0) goto L_0x024b
            if (r10 == 0) goto L_0x012d
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            r4 = 0
            goto L_0x012e
        L_0x012d:
            r4 = 1
        L_0x012e:
            if (r4 == 0) goto L_0x0132
            goto L_0x024b
        L_0x0132:
            r2.f17368d = r0
            r4 = 4
            r2.f17371g = r4
            r0.getClass()
            a14.m r4 = new a14.m
            wx3.d r8 = xx3.C66447b.m78392b(r2)
            r4.<init>(r8, r9)
            r4.mo74609p()
            com.tencent.mm.sdk.coroutines.SafeResume r8 = new com.tencent.mm.sdk.coroutines.SafeResume
            r8.<init>(r4)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r11 = r1.f137436d
            java.lang.String r12 = "intent_appid"
            r10.putExtra(r12, r11)
            org.json.JSONArray r11 = new org.json.JSONArray
            java.util.LinkedList<java.lang.Integer> r12 = r1.f137437e
            if (r12 != 0) goto L_0x015f
            sx3.f0 r12 = sx3.C64186f0.f181907d
        L_0x015f:
            r11.<init>(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "intent_category_id"
            r10.putExtra(r12, r11)
            java.lang.String r11 = "id_ui_theme"
            r10.putExtra(r11, r5)
            java.lang.String r11 = r1.f137438f
            java.lang.String r12 = ""
            if (r11 != 0) goto L_0x0177
            r11 = r12
        L_0x0177:
            java.lang.String r13 = "wecoin_apply_info"
            r10.putExtra(r13, r11)
            java.lang.String r11 = r1.f137439g
            if (r11 != 0) goto L_0x0182
            r11 = r12
        L_0x0182:
            java.lang.String r13 = "wecoin_protocol_url"
            r10.putExtra(r13, r11)
            java.lang.String r1 = r1.f137440h
            if (r1 != 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r12 = r1
        L_0x018e:
            java.lang.String r1 = "wecoin_apply_wording"
            r10.putExtra(r1, r12)
            androidx.appcompat.app.AppCompatActivity r1 = r0.getContext()
            boolean r11 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r11 == 0) goto L_0x019f
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            goto L_0x01a0
        L_0x019f:
            r1 = r7
        L_0x01a0:
            if (r1 == 0) goto L_0x01aa
            com.tencent.mm.plugin.finder.ui.j1 r11 = new com.tencent.mm.plugin.finder.ui.j1
            r11.<init>(r8)
            r1.mmSetOnActivityResultCallback(r11)
        L_0x01aa:
            androidx.appcompat.app.AppCompatActivity r1 = r0.getContext()
            r8 = 40001(0x9c41, float:5.6053E-41)
            java.lang.String r11 = "appbrand"
            java.lang.String r12 = ".ui.autofill.AppBrandIDCardUI"
            ke3.C88144b.m109795m(r1, r11, r12, r10, r8)
            java.lang.Object r1 = r4.mo74608o()
            if (r1 != r3) goto L_0x01c0
            goto L_0x0258
        L_0x01c0:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x01cd
            int r4 = r1.length()
            if (r4 != 0) goto L_0x01cb
            goto L_0x01cd
        L_0x01cb:
            r8 = 0
            goto L_0x01ce
        L_0x01cd:
            r8 = 1
        L_0x01ce:
            if (r8 == 0) goto L_0x01e3
            java.lang.String r1 = "token null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r2.f17368d = r7
            r1 = 5
            r2.f17371g = r1
            java.lang.Object r1 = r0.mo4067P7(r2)
            if (r1 != r3) goto L_0x0257
            goto L_0x0258
        L_0x01e3:
            te3.mi1 r4 = new te3.mi1
            r4.<init>()
            r4.f138043d = r5
            r4.f138044e = r1
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            r4.f138045f = r1
            ob0.b r1 = r4.mo73344b()
            r2.f17368d = r0
            r4 = 6
            r2.f17371g = r4
            java.lang.Object r1 = bi1.C0283d.m245c(r1, r7, r2, r9, r7)
            if (r1 != r3) goto L_0x0204
            goto L_0x0258
        L_0x0204:
            bi1.e r1 = (bi1.C0287e) r1
            boolean r4 = r1 instanceof bi1.C0288f
            if (r4 != 0) goto L_0x023b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "uploadTokenResult failed, "
            r4.append(r5)
            boolean r5 = r1 instanceof bi1.C0281b
            if (r5 == 0) goto L_0x021c
            bi1.b r1 = (bi1.C0281b) r1
            goto L_0x021d
        L_0x021c:
            r1 = r7
        L_0x021d:
            if (r1 == 0) goto L_0x0224
            T r1 = r1.f843b
            bi1.a r1 = (bi1.C0280a) r1
            goto L_0x0225
        L_0x0224:
            r1 = r7
        L_0x0225:
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r2.f17368d = r7
            r1 = 7
            r2.f17371g = r1
            java.lang.Object r1 = r0.mo4067P7(r2)
            if (r1 != r3) goto L_0x0257
            goto L_0x0258
        L_0x023b:
            rx3.g r0 = r0.f16928t
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            er1.i5 r0 = (er1.C7813i5) r0
            r0.mo8913b()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0258
        L_0x024b:
            r2.f17368d = r7
            r1 = 3
            r2.f17371g = r1
            java.lang.Object r1 = r0.mo4067P7(r2)
            if (r1 != r3) goto L_0x0257
            goto L_0x0258
        L_0x0257:
            r3 = r1
        L_0x0258:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderLivePostHelperUI.m3881N7(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI, wx3.d):java.lang.Object");
    }

    /* renamed from: O7 */
    public static final void m3882O7(FinderLivePostHelperUI finderLivePostHelperUI, String str, int i) {
        ProgressBar progressBar = finderLivePostHelperUI.f16925q;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            Intent intent = new Intent();
            intent.putExtra("open_custom_style_url", true);
            intent.putExtra("forceHideShare", true);
            intent.putExtra("show_native_web_view", true);
            intent.putExtra("rawUrl", str);
            intent.putExtra("screen_orientation", 1);
            C88144b.m109795m(finderLivePostHelperUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, i);
            return;
        }
        C87412m.m108603p("progressBar");
        throw null;
    }

    /* renamed from: P7 */
    public final Object mo4067P7(C15601d<? super Boolean> dVar) {
        ((C7813i5) ((C36570n) this.f16928t).getValue()).mo8913b();
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        String string = getContext().getResources().getString(C0966R.string.f8133nb);
        C87412m.m108593f(string, "context.resources.getStr…_live_post_verify_failed)");
        C77426q qVar = new C77426q(getContext());
        qVar.mo107595g(string);
        qVar.mo107601m(C0966R.string.f8028zq);
        qVar.mo107589a(true);
        qVar.mo107593e(new C3682a(mVar));
        qVar.mo107603o();
        return mVar.mo74608o();
    }

    /* renamed from: Q7 */
    public final void mo4068Q7(int i) {
        if (i == 1) {
            C8966e6 e6Var = this.f16924p;
            if (e6Var == null) {
                C87412m.m108603p("precheck");
                throw null;
            } else if (!e6Var.f28339y) {
                LifecycleScope uICScope = getUICScope();
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(uICScope, C58901s.f168555a, (C53934p0) null, new C3686e(this, i, (C15601d<? super C3686e>) null), 2, (Object) null);
                return;
            }
        }
        C8966e6 e6Var2 = this.f16924p;
        if (e6Var2 != null) {
            e6Var2.mo9775g(true, i);
        } else {
            C87412m.m108603p("precheck");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359741aj2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        Log.m105924i("Finder.FinderLivePostHelperUI", "onActivityResult requestCode:10000, resultCode:" + i4);
        Bundle bundle = null;
        if (i3 == 10000) {
            Intent intent3 = new Intent();
            if (intent2 != null) {
                bundle = intent2.getBundleExtra("result_data");
            }
            if (i4 == -1 && bundle != null) {
                String string = bundle.getString("go_next", "");
                String string2 = bundle.getString("result_json");
                if (!Util.isNullOrNil(string2)) {
                    int i5 = new C104289g(string2).getInt("code");
                    Log.m105924i("Finder.FinderLivePostHelperUI", "onActivityResult nextStep:" + string + ", code:" + i5);
                    if (C87412m.m108589b(string, "roomlive_verify") && i5 == 0) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC, Boolean.TRUE);
                        intent3.putExtra("FACE_VERIFY_RESULT", 1);
                    }
                }
            }
            setResult(-1, intent3);
            finish();
            overridePendingTransition(0, 0);
        } else if (i3 == 10001) {
            Bundle bundleExtra = intent2 != null ? intent2.getBundleExtra("result_data") : null;
            if (i4 == -1 && bundleExtra != null) {
                String string3 = bundleExtra.getString("go_next", "");
                String string4 = bundleExtra.getString("result_json");
                if (!Util.isNullOrNil(string4)) {
                    int i6 = new C104289g(string4).getInt("code");
                    Log.m105924i("Finder.FinderLivePostHelperUI", "onActivityResult precheckTypeCache:" + this.f16926r + " nextStep:" + string3 + ", code:" + i6);
                    if (C87412m.m108589b(string3, "roomlive_verify") && i6 == 0) {
                        mo4068Q7(this.f16926r);
                        this.f16926r = 0;
                        return;
                    }
                }
            }
            C8966e6 e6Var = this.f16924p;
            if (e6Var != null) {
                e6Var.mo9775g(false, this.f16926r);
                this.f16926r = 0;
                return;
            }
            C87412m.m108603p("precheck");
            throw null;
        } else if (i3 != 40001) {
            C8966e6 e6Var2 = this.f16924p;
            if (e6Var2 == null) {
                C87412m.m108603p("precheck");
                throw null;
            } else if (i3 == 10123 && i4 == -1) {
                C85801v1 i7 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC;
                Boolean bool = Boolean.TRUE;
                i7.mo119677K(aVar, bool);
                e6Var2.f28337w = true;
                if (e6Var2.f28338x || e6Var2.f28340z || e6Var2.f28318A) {
                    e6Var2.mo9772d();
                    return;
                }
                C32226l<? super Boolean, C13598b0> lVar = e6Var2.f28327j;
                if (lVar != null) {
                    lVar.invoke(bool);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ca4 ca4;
        super.onCreate(bundle);
        hideTitleView();
        View findViewById = findViewById(C0966R.C0970id.dvr);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_live_post_forbidden)");
        this.f16923o = new C8968f2(findViewById, (String) null, (String) null, 6, (C8480h) null);
        View findViewById2 = findViewById(C0966R.C0970id.dw_);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_live_post_precheck)");
        C8966e6 e6Var = new C8966e6((ViewGroup) findViewById2);
        this.f16924p = e6Var;
        e6Var.f28326i = new C3684c(this);
        e6Var.f28327j = new C3685d(this);
        View findViewById3 = findViewById(C0966R.C0970id.dns);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder…per_loading_progress_bar)");
        this.f16925q = (ProgressBar) findViewById3;
        int intExtra = getIntent().getIntExtra("LIVE_HELP_TYPE", 0);
        Log.m105924i("Finder.FinderLivePostHelperUI", "type:" + intExtra);
        if (intExtra == 1) {
            String stringExtra = getIntent().getStringExtra("FACE_VERIFY_URL");
            C87412m.m108591d(stringExtra);
            C8968f2 f2Var = this.f16923o;
            if (f2Var != null) {
                C8968f2.m8755d(f2Var, 2, (C48779ay0) null, 0, new C3848k1(this, stringExtra), 6, (Object) null);
            } else {
                C87412m.m108603p("exception");
                throw null;
            }
        } else if (intExtra == 2 || intExtra == 3) {
            C8968f2 f2Var2 = this.f16923o;
            if (f2Var2 != null) {
                C8968f2.m8755d(f2Var2, 1, (C48779ay0) null, 0, new C3855l1(this), 6, (Object) null);
            } else {
                C87412m.m108603p("exception");
                throw null;
            }
        } else if (intExtra == 11) {
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("PRECHECK_SPAMRISK");
            if (byteArrayExtra != null) {
                ca4 = new ca4();
                ca4.parseFrom(byteArrayExtra);
            } else {
                ca4 = null;
            }
            if (ca4 != null) {
                int intExtra2 = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
                long longExtra = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0);
                C8966e6 e6Var2 = this.f16924p;
                if (e6Var2 != null) {
                    int intExtra3 = getIntent().getIntExtra("PRECHECK_USERFLAG", 0);
                    e6Var2.f28319B = intExtra2;
                    e6Var2.f28320C = longExtra;
                    C61926c.m72668M(new C8960d6(e6Var2, intExtra3, ca4));
                    return;
                }
                C87412m.m108603p("precheck");
                throw null;
            }
            Log.m105920e("Finder.FinderLivePostHelperUI", "LIVE_PRECHECK error, spamRisk is empty!");
            finish();
        }
    }

    public void onPause() {
        super.onPause();
        ProgressBar progressBar = this.f16925q;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            C87412m.m108603p("progressBar");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        ProgressBar progressBar = this.f16925q;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            C87412m.m108603p("progressBar");
            throw null;
        }
    }
}
