package mo1;

import a14.C0000n0;
import android.app.Activity;
import android.content.Context;
import cm1.C0728e2;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di3.C86312j;
import er1.C58684b;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C33062n5;
import jq3.C60905o;
import kotlin.ResultKt;
import kr0.C76630x0;
import p1070zf.C91681d;
import p565ir.C60612q;
import rx3.C13598b0;
import te3.C64370fp1;
import te3.C64513l40;
import tf0.C13887q1;
import wi0.C66117m;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.profile.uic.FinderProfileShopUIC$onCreate$2$1$onItemClick$1$1$2", mo125469f = "FinderProfileShopUIC.kt", mo125470l = {183}, mo125471m = "invokeSuspend")
/* renamed from: mo1.v1 */
public final class C61545v1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f174928d;

    /* renamed from: e */
    public final /* synthetic */ C61532u1 f174929e;

    /* renamed from: f */
    public final /* synthetic */ C0740i2 f174930f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f174931g;

    /* renamed from: h */
    public final /* synthetic */ String f174932h;

    /* renamed from: i */
    public final /* synthetic */ String f174933i;

    /* renamed from: j */
    public final /* synthetic */ String f174934j;

    /* renamed from: n */
    public final /* synthetic */ String f174935n;

    /* renamed from: o */
    public final /* synthetic */ boolean f174936o;

    /* renamed from: p */
    public final /* synthetic */ C86299o f174937p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61545v1(C61532u1 u1Var, C0740i2 i2Var, C60905o oVar, String str, String str2, String str3, String str4, boolean z, C86299o oVar2, C15601d<? super C61545v1> dVar) {
        super(2, dVar);
        this.f174929e = u1Var;
        this.f174930f = i2Var;
        this.f174931g = oVar;
        this.f174932h = str;
        this.f174933i = str2;
        this.f174934j = str3;
        this.f174935n = str4;
        this.f174936o = z;
        this.f174937p = oVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61545v1(this.f174929e, this.f174930f, this.f174931g, this.f174932h, this.f174933i, this.f174934j, this.f174935n, this.f174936o, this.f174937p, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61545v1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f174928d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Activity context = this.f174929e.getContext();
            C64370fp1 fp12 = ((C0728e2) this.f174930f).f1742d;
            this.f174928d = 1;
            if (((C60612q) C86312j.m106911c(C60612q.class)).Yv0(context, fp12, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context2 = this.f174931g.f173499A;
        C87412m.m108593f(context2, "holder.context");
        String str = this.f174932h;
        C87412m.m108593f(str, "appId");
        String str2 = this.f174933i;
        C87412m.m108593f(str2, "path");
        String str3 = this.f174934j;
        String str4 = this.f174935n;
        boolean z = this.f174936o;
        C86299o oVar = this.f174937p;
        C64513l40 l402 = ((C0728e2) this.f174930f).f1742d.f183185p;
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        Class cls = C13887q1.class;
        C87412m.m108594g(str3, "sceneNote");
        C87412m.m108594g(str4, "shareToken");
        Log.m105924i("Finder.ActivityRouter", "enterShoppingWeApp showNavigationBar:" + z + ", appId:" + str + ",enterPath:" + str2 + ",scene:" + C91681d.CTRL_INDEX + ",sceneNote:" + str3);
        if (!Util.isNullOrNil(str)) {
            if (oVar == null) {
                oVar = new C86299o();
            }
            C86299o oVar2 = oVar;
            oVar2.f250930b = str;
            oVar2.f250934f = str2;
            oVar2.f250939k = C91681d.CTRL_INDEX;
            oVar2.f250940l = str3;
            oVar2.f250931c = ((C13887q1) C86312j.m106911c(cls)).mo13313J();
            HalfScreenConfig.CustomSubjectInfo i2 = C58739j4.f168176a.mo83713i(l402);
            HalfScreenConfig.C55453c cVar = z ? HalfScreenConfig.C55453c.SINGLE_CLOSE : HalfScreenConfig.C55453c.HIDE;
            HalfScreenConfig.ShareActionConfig shareActionConfig = r7;
            HalfScreenConfig.ShareActionConfig shareActionConfig2 = new HalfScreenConfig.ShareActionConfig(true, str4);
            C86299o oVar3 = oVar2;
            oVar3.f250912A = new HalfScreenConfig(true, 0, (HalfScreenConfig.C55451a) null, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, cVar, false, z, (WeAppHalfScreenStatusChangeListener) null, (HalfScreenConfig.C55456f) null, false, false, (C66117m) null, false, shareActionConfig, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, i2, 0, false, false, 0, false, false, false, -33620610, 1, (C8480h) null);
            oVar3.f250916E = ((C13887q1) C86312j.m106911c(cls)).m70((C45795b) null, (C33062n5) null);
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context2, oVar3);
        }
        return C13598b0.f38549a;
    }
}
