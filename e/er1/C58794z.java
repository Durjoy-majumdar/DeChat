package er1;

import a14.C53916l;
import a14.C53921m;
import android.content.Context;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58752o;
import f40.C86709a0;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87413o;
import kotlin.Result;
import o40.C11348f;
import o40.C61926c;
import p447aw.C54369c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: er1.z */
public final class C58794z {

    /* renamed from: a */
    public static final C58794z f168327a = new C58794z();

    /* renamed from: er1.z$a */
    public static final class C58795a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f168328d;

        /* renamed from: e */
        public final /* synthetic */ long f168329e;

        /* renamed from: f */
        public final /* synthetic */ String f168330f;

        /* renamed from: g */
        public final /* synthetic */ C58797c f168331g;

        /* renamed from: h */
        public final /* synthetic */ C53916l<C58752o<? extends AbsRequestFloatWindowPermissionDialog>> f168332h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58795a(C8477a0 a0Var, long j, String str, C58797c cVar, C53916l<? super C58752o<? extends AbsRequestFloatWindowPermissionDialog>> lVar) {
            super(0);
            this.f168328d = a0Var;
            this.f168329e = j;
            this.f168330f = str;
            this.f168331g = cVar;
            this.f168332h = lVar;
        }

        public Object invoke() {
            long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_LIVE_PERMISSION_DIALOG_SHOWTIME_LONG_SYNC, 0);
            if (!this.f168328d.f27482d && G <= this.f168329e) {
                Log.m105924i("Finder.FinderCoroutineUtil", "onQuickCheck");
                C59319a aVar = C59319a.f169618b;
                C11348f.C11349a.m11178b(aVar, this.f168330f + "_notshow_quickcheck", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
                ((C54369c) C86312j.m106911c(C54369c.class)).A60(this.f168331g);
                C58794z.m68577a(this.f168328d, this.f168332h, new C58752o.C58756d(null));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.z$b */
    public static final class C58796b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f168333d;

        /* renamed from: e */
        public final /* synthetic */ String f168334e;

        /* renamed from: f */
        public final /* synthetic */ C58797c f168335f;

        /* renamed from: g */
        public final /* synthetic */ C53916l<C58752o<? extends AbsRequestFloatWindowPermissionDialog>> f168336g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58796b(C8477a0 a0Var, String str, C58797c cVar, C53916l<? super C58752o<? extends AbsRequestFloatWindowPermissionDialog>> lVar) {
            super(0);
            this.f168333d = a0Var;
            this.f168334e = str;
            this.f168335f = cVar;
            this.f168336g = lVar;
        }

        public Object invoke() {
            if (!this.f168333d.f27482d) {
                C59319a aVar = C59319a.f169618b;
                C11348f.C11349a.m11178b(aVar, this.f168334e + "_timeout", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
                ((C54369c) C86312j.m106911c(C54369c.class)).A60(this.f168335f);
                C58794z.m68577a(this.f168333d, this.f168336g, new C58752o.C58756d(null));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.z$c */
    public static final class C58797c implements AbsRequestFloatWindowPermissionDialog.C85613a {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f168337a;

        /* renamed from: b */
        public final /* synthetic */ C53916l<C58752o<? extends AbsRequestFloatWindowPermissionDialog>> f168338b;

        public C58797c(C8477a0 a0Var, C53916l<? super C58752o<? extends AbsRequestFloatWindowPermissionDialog>> lVar) {
            this.f168337a = a0Var;
            this.f168338b = lVar;
        }

        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            Log.m105924i("Finder.FinderCoroutineUtil", "onResultAllow");
            C58794z.m68577a(this.f168337a, this.f168338b, new C58752o.C58755c(absRequestFloatWindowPermissionDialog));
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105924i("Finder.FinderCoroutineUtil", "onResultCancel");
            C58794z.m68577a(this.f168337a, this.f168338b, new C58752o.C58753a(absRequestFloatWindowPermissionDialog));
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            Log.m105924i("Finder.FinderCoroutineUtil", "onResultRefuse");
            C58794z.m68577a(this.f168337a, this.f168338b, new C58752o.C58754b(absRequestFloatWindowPermissionDialog));
        }
    }

    /* renamed from: a */
    public static final void m68577a(C8477a0 a0Var, C53916l lVar, C58752o oVar) {
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            lVar.resumeWith(Result.m168114constructorimpl(oVar));
        }
    }

    /* renamed from: b */
    public final Object mo83987b(Context context, int i, String str, boolean z, boolean z2, String str2, long j, String str3, C15601d<? super C58752o<? extends AbsRequestFloatWindowPermissionDialog>> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        long c = C31543z5.m39453c();
        C8477a0 a0Var = new C8477a0();
        C58797c cVar = new C58797c(a0Var, mVar);
        ((C54369c) C86312j.m106911c(C54369c.class)).Oa0(context, i, str, cVar, z, z2, str2);
        C61926c.m72666K(3000, new C58795a(a0Var, c, str3, cVar, mVar));
        C61926c.m72666K(j, new C58796b(a0Var, str3, cVar, mVar));
        return mVar.mo74608o();
    }
}
