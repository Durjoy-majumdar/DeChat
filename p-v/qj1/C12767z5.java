package qj1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C101218e0;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: qj1.z5 */
public final class C12767z5 extends C62660c {

    /* renamed from: p */
    public final C58124b f36566p;

    /* renamed from: q */
    public FinderLiveCommentPostRealNamePanel f36567q;

    /* renamed from: qj1.z5$a */
    public static final class C12768a extends C87413o implements C32228q<Context, Intent, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12767z5 f36568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12768a(C12767z5 z5Var) {
            super(3);
            this.f36568d = z5Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            Context context = (Context) obj;
            Intent intent = (Intent) obj2;
            Integer num = (Integer) obj3;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(intent, "intent");
            C54795n5 D0 = this.f36568d.mo14476D0();
            if (D0 != null) {
                D0.mo75714R(context, intent, num);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.z5$b */
    public static final class C12769b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f36569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12769b(C32226l<? super Boolean, C13598b0> lVar) {
            super(1);
            this.f36569d = lVar;
        }

        public Object invoke(Object obj) {
            this.f36569d.invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12767z5(FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel, C58124b bVar) {
        super(finderLiveCommentPostRealNamePanel, bVar, (C49712hj1) null);
        C87412m.m108594g(finderLiveCommentPostRealNamePanel, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36566p = bVar;
        this.f36567q = finderLiveCommentPostRealNamePanel;
    }

    /* renamed from: Z0 */
    public final void mo12316Z0(String str, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(str, "realNameUrl");
        C87412m.m108594g(lVar, "callback");
        this.f36567q.setDialogHeight(((double) ((float) C75044y4.m89990b(MMApplicationContext.getContext()).y)) * 0.55d);
        this.f36567q.setWebviewForwardCallback(new C12768a(this));
        FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = this.f36567q;
        C12769b bVar = new C12769b(lVar);
        finderLiveCommentPostRealNamePanel.getClass();
        finderLiveCommentPostRealNamePanel.f15214h = str;
        finderLiveCommentPostRealNamePanel.f15211e = bVar;
        C101218e0 e0Var = finderLiveCommentPostRealNamePanel.f15212f;
        if (e0Var != null) {
            e0Var.mo140655A();
            ((C54116w) C86312j.m106911c(C54116w.class)).xy0(C54067f0.C0068p0.AuthExposure);
            return;
        }
        C87412m.m108603p("bottomDialog");
        throw null;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8400k0(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel r0 = r4.f36567q
            r0.getClass()
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r5 != r2) goto L_0x007b
            r5 = 0
            if (r7 == 0) goto L_0x0015
            java.lang.String r2 = "result_data"
            android.os.Bundle r7 = r7.getBundleExtra(r2)
            goto L_0x0016
        L_0x0015:
            r7 = r5
        L_0x0016:
            r2 = -1
            if (r6 != r2) goto L_0x007b
            if (r7 == 0) goto L_0x007b
            java.lang.String r6 = "go_next"
            java.lang.String r2 = ""
            java.lang.String r6 = r7.getString(r6, r2)
            java.lang.String r2 = "result_json"
            java.lang.String r7 = r7.getString(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r2 != 0) goto L_0x007b
            c30.g r2 = new c30.g
            r2.<init>((java.lang.String) r7)
            java.lang.String r7 = "code"
            int r7 = r2.getInt(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onActivityResult, nextStep:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ", code:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.FinderMaxSizeLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.lang.String r2 = "roomlive_verify"
            boolean r6 = gy3.C87412m.m108589b(r6, r2)
            if (r6 == 0) goto L_0x007b
            if (r7 != 0) goto L_0x007b
            fy3.l<? super java.lang.Boolean, rx3.b0> r6 = r0.f15211e
            if (r6 == 0) goto L_0x006c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.invoke(r7)
        L_0x006c:
            qo3.e0 r6 = r0.f15212f
            if (r6 == 0) goto L_0x0075
            r6.mo140680z()
            r5 = 1
            goto L_0x007c
        L_0x0075:
            java.lang.String r6 = "bottomDialog"
            gy3.C87412m.m108603p(r6)
            throw r5
        L_0x007b:
            r5 = 0
        L_0x007c:
            if (r5 == 0) goto L_0x008a
            di3.d r5 = di3.C86312j.m106911c(r1)
            ak1.w r5 = (ak1.C54116w) r5
            ak1.f0$p0 r6 = ak1.C54067f0.C0068p0.AuthSucc
            r5.xy0(r6)
            goto L_0x0095
        L_0x008a:
            di3.d r5 = di3.C86312j.m106911c(r1)
            ak1.w r5 = (ak1.C54116w) r5
            ak1.f0$p0 r6 = ak1.C54067f0.C0068p0.AuthFail
            r5.xy0(r6)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12767z5.mo8400k0(int, int, android.content.Intent):void");
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
