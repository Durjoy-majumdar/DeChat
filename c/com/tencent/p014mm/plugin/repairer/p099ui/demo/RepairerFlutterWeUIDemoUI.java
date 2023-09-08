package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import d42.C58106u;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p220pr.C100835h;
import p220pr.C62491f;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI */
public final class RepairerFlutterWeUIDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public final C0000n0 f163924d = C53930o0.m60555b();

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI$a */
    public static final class C57206a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerFlutterWeUIDemoUI f163925d;

        public C57206a(RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI) {
            this.f163925d = repairerFlutterWeUIDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C100835h) C86312j.m106911c(C100835h.class)).mo140310TL(this.f163925d, "flutter_weui_demo", (Map<String, Object>) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI$b */
    public static final class C57207b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerFlutterWeUIDemoUI f163926d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI$onCreate$2$1", mo125469f = "RepairerFlutterWeUIDemoUI.kt", mo125470l = {46}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI$b$a */
        public static final class C57208a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f163927d;

            /* renamed from: e */
            public /* synthetic */ Object f163928e;

            /* renamed from: f */
            public final /* synthetic */ RepairerFlutterWeUIDemoUI f163929f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57208a(RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI, C15601d<? super C57208a> dVar) {
                super(2, dVar);
                this.f163929f = repairerFlutterWeUIDemoUI;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C57208a aVar = new C57208a(this.f163929f, dVar);
                aVar.f163928e = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C57208a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C0000n0 n0Var;
                Class cls = C62491f.class;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f163927d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0000n0 n0Var2 = (C0000n0) this.f163928e;
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(ICachedFlutte…ginesService::class.java)");
                    this.f163928e = n0Var2;
                    this.f163927d = 1;
                    Object xo02 = ((C62491f) c).xo0("flutter_magic_brush_demo", false, (C32227p<? super FlutterEngine, ? super Map<String, Object>, C13598b0>) null, this);
                    if (xo02 == aVar) {
                        return aVar;
                    }
                    n0Var = n0Var2;
                    obj = xo02;
                } else if (i == 1) {
                    n0Var = (C0000n0) this.f163928e;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13604l lVar = (C13604l) obj;
                String str = (String) lVar.f38555d;
                ((FlutterEngine) lVar.f38556e).getPlugins().add((Set<FlutterPlugin>) ((C58106u) C86312j.m106911c(C58106u.class)).Ni0());
                if (!C53930o0.m60560g(n0Var)) {
                    return C13598b0.f38549a;
                }
                Intent build = ((C62491f) C86312j.m106911c(cls)).zn0(str).destroyEngineWithActivity(true).disableAutofill().build(this.f163929f.getContext());
                C87412m.m108593f(build, "getService(ICachedFlutte…          .build(context)");
                AppCompatActivity context = this.f163929f.getContext();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(build);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar2.mo10232b(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI$onCreate$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI$onCreate$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return C13598b0.f38549a;
            }
        }

        public C57207b(RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI) {
            this.f163926d = repairerFlutterWeUIDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI = this.f163926d;
            C53895h.m60466d(repairerFlutterWeUIDemoUI.f163924d, (C66212f) null, (C53934p0) null, new C57208a(repairerFlutterWeUIDemoUI, (C15601d<? super C57208a>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI$c */
    public static final class C57209c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerFlutterWeUIDemoUI f163930d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI$onCreate$3$1", mo125469f = "RepairerFlutterWeUIDemoUI.kt", mo125470l = {63, 65, 71}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI$c$a */
        public static final class C57210a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f163931d;

            /* renamed from: e */
            public int f163932e;

            /* renamed from: f */
            public final /* synthetic */ RepairerFlutterWeUIDemoUI f163933f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57210a(RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI, C15601d<? super C57210a> dVar) {
                super(2, dVar);
                this.f163933f = repairerFlutterWeUIDemoUI;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C57210a(this.f163933f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C57210a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:19:0x008c A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    r20 = this;
                    r0 = r20
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f163932e
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L_0x002d
                    if (r2 == r5) goto L_0x0027
                    if (r2 == r4) goto L_0x001f
                    if (r2 != r3) goto L_0x0017
                    kotlin.ResultKt.throwOnFailure(r21)
                    goto L_0x008d
                L_0x0017:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x001f:
                    java.lang.Object r2 = r0.f163931d
                    a10.y r2 = (a10.C112726y) r2
                    kotlin.ResultKt.throwOnFailure(r21)
                    goto L_0x0059
                L_0x0027:
                    kotlin.ResultKt.throwOnFailure(r21)
                    r2 = r21
                    goto L_0x0041
                L_0x002d:
                    kotlin.ResultKt.throwOnFailure(r21)
                    java.lang.Class<pr.g> r2 = p220pr.C110245g.class
                    di3.d r2 = di3.C86312j.m106911c(r2)
                    pr.g r2 = (p220pr.C110245g) r2
                    r0.f163932e = r5
                    java.lang.Object r2 = r2.Tw0(r0)
                    if (r2 != r1) goto L_0x0041
                    return r1
                L_0x0041:
                    a10.c r2 = (a10.C112713c) r2
                    a10.y r5 = new a10.y
                    java.lang.String r7 = "flutter_demo"
                    r5.<init>(r2, r7)
                    r0.f163931d = r5
                    r0.f163932e = r4
                    java.lang.String r2 = "view_demo_activity"
                    java.lang.Object r2 = r5.mo164471g(r2, r6, r0)
                    if (r2 != r1) goto L_0x0058
                    return r1
                L_0x0058:
                    r2 = r5
                L_0x0059:
                    bj2.t r4 = new bj2.t
                    com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI r5 = r0.f163933f
                    r4.<init>(r5, r2)
                    java.util.List r4 = sx3.C26236u.m33719b(r4)
                    r2.mo164465a(r4)
                    com.tencent.mm.flutter.ui.FlutterPageStyle r4 = new com.tencent.mm.flutter.ui.FlutterPageStyle
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 1023(0x3ff, float:1.434E-42)
                    r19 = 0
                    r7 = r4
                    r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                    r5 = -1
                    r4.f310669e = r5
                    com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI r5 = r0.f163933f
                    r0.f163931d = r6
                    r0.f163932e = r3
                    java.lang.Object r2 = r2.mo164473j(r5, r4, r6, r0)
                    if (r2 != r1) goto L_0x008d
                    return r1
                L_0x008d:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.repairer.p099ui.demo.RepairerFlutterWeUIDemoUI.C57209c.C57210a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C57209c(RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI) {
            this.f163930d = repairerFlutterWeUIDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI = this.f163930d;
            C53895h.m60466d(repairerFlutterWeUIDemoUI.f163924d, (C66212f) null, (C53934p0) null, new C57210a(repairerFlutterWeUIDemoUI, (C15601d<? super C57210a>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterWeUIDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cz_;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((Button) findViewById(C0966R.C0970id.n9z)).setOnClickListener(new C57206a(this));
        ((Button) findViewById(C0966R.C0970id.f358301o80)).setOnClickListener(new C57207b(this));
        findViewById(C0966R.C0970id.olk).setOnClickListener(new C57209c(this));
    }
}
