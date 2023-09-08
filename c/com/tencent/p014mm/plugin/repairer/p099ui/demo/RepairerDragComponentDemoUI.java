package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a70.C112760b;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import bi3.C0289a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.ContactUpgradeHelper;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C7335d;
import di3.C86312j;
import eb0.C75604z3;
import ec3.C27014a;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.List;
import java.util.Random;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import n20.C61603e;
import n20.C61604f;
import n20.C61605g;
import n20.C61611s;
import p196ln.C76707h;
import p278yh.C66645n;
import p663qo.C63286j;
import p749xh.C53339k1;
import p749xh.C78811h6;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import wb0.C65945a;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerDragComponentDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI */
public final class RepairerDragComponentDemoUI extends BaseRepairerUI {

    /* renamed from: j */
    public static final /* synthetic */ int f163904j = 0;

    /* renamed from: d */
    public final String f163905d = "MicroMsg.RepairerDragComponentDemoUI";

    /* renamed from: e */
    public final C13601g f163906e = C36568h.m40985a(new C57204i(this));

    /* renamed from: f */
    public final C13601g f163907f = C36568h.m40985a(new C57203g(this));

    /* renamed from: g */
    public final C13601g f163908g = C36568h.m40985a(C57196a.f163911d);

    /* renamed from: h */
    public final C13601g f163909h = C36568h.m40985a(C57197b.f163912d);

    /* renamed from: i */
    public final C13601g f163910i = C36568h.m40985a(C30356h.f81919d);

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$h */
    public static final class C30356h extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C30356h f81919d = new C30356h();

        public C30356h() {
            super(0);
        }

        public Object invoke() {
            String str = C86709a0.m107523b().mo121111i() + "_RepairerDragComponentDemoUI";
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            return C112760b.m154236i0(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$a */
    public static final class C57196a extends C87413o implements C32224a<C61604f> {

        /* renamed from: d */
        public static final C57196a f163911d = new C57196a();

        public C57196a() {
            super(0);
        }

        public Object invoke() {
            return ((C63286j) C86312j.m106911c(C63286j.class)).mo87460Kl();
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$b */
    public static final class C57197b extends C87413o implements C32224a<C61604f> {

        /* renamed from: d */
        public static final C57197b f163912d = new C57197b();

        public C57197b() {
            super(0);
        }

        public Object invoke() {
            return ((C61611s) C86312j.m106911c(C61611s.class)).mo84734xO();
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$c */
    public static final class C57198c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerDragComponentDemoUI f163913d;

        public C57198c(RepairerDragComponentDemoUI repairerDragComponentDemoUI) {
            this.f163913d = repairerDragComponentDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f163913d.finish();
            return true;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$onCreate$2", mo125469f = "RepairerDragComponentDemoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$d */
    public static final class C57199d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ RepairerDragComponentDemoUI f163914d;

        /* renamed from: e */
        public final /* synthetic */ C61605g f163915e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$onCreate$2$1$1", mo125469f = "RepairerDragComponentDemoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$d$a */
        public static final class C57200a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ RepairerDragComponentDemoUI f163916d;

            /* renamed from: e */
            public final /* synthetic */ PipelineState f163917e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57200a(RepairerDragComponentDemoUI repairerDragComponentDemoUI, PipelineState pipelineState, C15601d<? super C57200a> dVar) {
                super(2, dVar);
                this.f163916d = repairerDragComponentDemoUI;
                this.f163917e = pipelineState;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C57200a(this.f163916d, this.f163917e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C57200a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                ((C61604f) ((C36570n) this.f163916d.f163908g).getValue()).mo86542a(this.f163917e);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57199d(RepairerDragComponentDemoUI repairerDragComponentDemoUI, C61605g gVar, C15601d<? super C57199d> dVar) {
            super(2, dVar);
            this.f163914d = repairerDragComponentDemoUI;
            this.f163915e = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57199d(this.f163914d, this.f163915e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57199d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            C72963f4 f4Var = (C72963f4) C78811h6.f230717y0.selectAll().where(C78811h6.f230685R0.equal((Number) new Integer(3)).and(C78811h6.f230686S0.equal((Number) new Integer(0)))).orderBy(C78811h6.f230687T0.orderDesc()).limit(1, 0).build().singleQuery(new C46166d().getDB(), C72963f4.class);
            if (f4Var != null) {
                RepairerDragComponentDemoUI repairerDragComponentDemoUI = this.f163914d;
                C61605g gVar = this.f163915e;
                String r = C72996z1.m85820U5(f4Var.mo108768t()) ? C75604z3.m90846r(f4Var.getContent()) : f4Var.getContent();
                C27014a aVar = new C27014a();
                C87412m.m108593f(r, "imgXml");
                aVar.mo141099d(r);
                String str = "RepairerDragComponentDemoUI_" + f4Var.getMsgId() + "_mid";
                String i = new C86009m1((C86009m1) ((C36570n) repairerDragComponentDemoUI.f163910i).getValue(), str).mo119971i();
                C87412m.m108593f(i, "VFSFile(tempFolder, mediaId).absolutePath");
                C65945a aVar2 = new C65945a(str);
                String str2 = aVar.f75073D;
                if (str2 == null || C112551y.m153811k(str2)) {
                    z = true;
                }
                String str3 = "";
                if (z) {
                    String str4 = aVar.f75087q;
                    if (str4 == null) {
                        str4 = str3;
                    }
                    aVar2.f189598b = str4;
                    String str5 = aVar.f75076f;
                    if (str5 == null) {
                        str5 = str3;
                    }
                    aVar2.f189599c = str5;
                    String str6 = aVar.f75090t;
                    if (str6 != null) {
                        str3 = str6;
                    }
                    aVar2.f189602f = str3;
                    aVar2.f189603g = aVar.f75088r;
                    aVar2.f189600d = 2;
                } else {
                    String str7 = aVar.f75096z;
                    if (str7 == null) {
                        str7 = str3;
                    }
                    aVar2.f189598b = str7;
                    aVar2.f189599c = str3;
                    aVar2.f189600d = 19;
                    String str8 = aVar.f75090t;
                    if (str8 != null) {
                        str3 = str8;
                    }
                    aVar2.f189602f = str3;
                    aVar2.f189603g = aVar.f75070A;
                }
                aVar2.f189601e = i;
                String s102 = ((C63286j) C86312j.m106911c(C63286j.class)).s10(gVar, aVar2);
                C61611s sVar = (C61611s) C86312j.m106911c(C61611s.class);
                C66645n nVar = (C66645n) ((C36570n) repairerDragComponentDemoUI.f163906e).getValue();
                if (nVar.f191640c == null) {
                    nVar.f191640c = (ImageView) nVar.f191638a.findViewById(C0966R.C0970id.ioo);
                }
                ImageView imageView = nVar.f191640c;
                C87412m.m108593f(imageView, "uiBinding.cdnContentIv");
                PipelineState ng = sVar.mo84733ng(s102, gVar, imageView, i);
                ng.put("KeyCdnParams", aVar2);
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d((LifecycleScope) ((C36570n) repairerDragComponentDemoUI.f163907f).getValue(), C58901s.f168555a, (C53934p0) null, new C57200a(repairerDragComponentDemoUI, ng, (C15601d<? super C57200a>) null), 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$onCreate$3", mo125469f = "RepairerDragComponentDemoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$e */
    public static final class C57201e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ RepairerDragComponentDemoUI f163918d;

        /* renamed from: e */
        public final /* synthetic */ PipelineState f163919e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57201e(RepairerDragComponentDemoUI repairerDragComponentDemoUI, PipelineState pipelineState, C15601d<? super C57201e> dVar) {
            super(2, dVar);
            this.f163918d = repairerDragComponentDemoUI;
            this.f163919e = pipelineState;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57201e(this.f163918d, this.f163919e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57201e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            ((C61604f) ((C36570n) this.f163918d.f163909h).getValue()).mo86542a(this.f163919e);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$onCreate$4", mo125469f = "RepairerDragComponentDemoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$f */
    public static final class C57202f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ RepairerDragComponentDemoUI f163920d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57202f(RepairerDragComponentDemoUI repairerDragComponentDemoUI, C15601d<? super C57202f> dVar) {
            super(2, dVar);
            this.f163920d = repairerDragComponentDemoUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57202f(this.f163920d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57202f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C46166d dVar = new C46166d();
            boolean a = ContactUpgradeHelper.f10280h.mo1134a();
            C0289a.C0290a aVar = C0289a.f857a;
            ISqlCondition and = aVar.mo339d().and(a ? C53339k1.f149479m1.inString(C26236u.m33719b("0")) : C53339k1.f149475i1.notLike("'%@%'"));
            Column column = C53339k1.f149475i1;
            List<String> multiString = C53339k1.f149474h1.select((List<? extends ISqlColumn>) C26236u.m33719b(column)).log(this.f163920d.f163905d).where(and.mo81855or(column.equal("weixin"))).orderBy((List<? extends ISqlOrder>) aVar.mo340e()).build().multiString(dVar.getDB());
            String str = (String) C110818d0.m150917O(multiString, new Random().nextInt(multiString.size()));
            if (str != null) {
                RepairerDragComponentDemoUI repairerDragComponentDemoUI = this.f163920d;
                C76707h hVar = (C76707h) C86312j.m106911c(C76707h.class);
                C66645n nVar = (C66645n) ((C36570n) repairerDragComponentDemoUI.f163906e).getValue();
                if (nVar.f191641d == null) {
                    nVar.f191641d = (ImageView) nVar.f191638a.findViewById(C0966R.C0970id.god);
                }
                ImageView imageView = nVar.f191641d;
                C87412m.m108593f(imageView, "uiBinding.avatarContentIv");
                hVar.mo106995z(imageView, str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$g */
    public static final class C57203g extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public final /* synthetic */ RepairerDragComponentDemoUI f163921d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57203g(RepairerDragComponentDemoUI repairerDragComponentDemoUI) {
            super(0);
            this.f163921d = repairerDragComponentDemoUI;
        }

        public Object invoke() {
            return new LifecycleScope("RepairerDragComponentDemoUI", this.f163921d, 0, 4, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerDragComponentDemoUI$i */
    public static final class C57204i extends C87413o implements C32224a<C66645n> {

        /* renamed from: d */
        public final /* synthetic */ RepairerDragComponentDemoUI f163922d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57204i(RepairerDragComponentDemoUI repairerDragComponentDemoUI) {
            super(0);
            this.f163922d = repairerDragComponentDemoUI;
        }

        public Object invoke() {
            RepairerDragComponentDemoUI repairerDragComponentDemoUI = this.f163922d;
            int i = RepairerDragComponentDemoUI.f163904j;
            return new C66645n(repairerDragComponentDemoUI.getContentView());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bs5;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61611s.class;
        super.onCreate(bundle);
        setMMTitle("滑动组件Demo");
        setBackBtn(new C57198c(this));
        int h = C76577a.m92157h(this, C0966R.dimen.f3740cu);
        C61605g gVar = new C61605g(h, h);
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) this.f163907f).getValue(), (C53934p0) null, new C57199d(this, gVar, (C15601d<? super C57199d>) null), 1, (Object) null);
        C61603e eVar = new C61603e("https://gtimg.wechatpay.cn/pay/img/home/solution/1.jpg");
        String z9 = ((C61611s) C86312j.m106911c(cls)).mo84736z9(eVar, gVar);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IImageLoaderFeatureService::class.java)");
        C61611s sVar = (C61611s) c;
        C66645n nVar = (C66645n) ((C36570n) this.f163906e).getValue();
        if (nVar.f191639b == null) {
            nVar.f191639b = (ImageView) nVar.f191638a.findViewById(C0966R.C0970id.oek);
        }
        ImageView imageView = nVar.f191639b;
        C87412m.m108593f(imageView, "uiBinding.httpContentIv");
        PipelineState ng = sVar.mo84733ng(z9, gVar, imageView, "");
        ng.put("Common_HttpParams", eVar);
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d((LifecycleScope) ((C36570n) this.f163907f).getValue(), C58901s.f168555a, (C53934p0) null, new C57201e(this, ng, (C15601d<? super C57201e>) null), 2, (Object) null);
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) this.f163907f).getValue(), (C53934p0) null, new C57202f(this, (C15601d<? super C57202f>) null), 1, (Object) null);
    }
}
