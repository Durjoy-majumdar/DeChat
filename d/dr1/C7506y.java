package dr1;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.view.FinderPostOriginView;
import fe1.C58965i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50259lg1;

/* renamed from: dr1.y */
public final class C7506y implements C58965i {

    /* renamed from: a */
    public final FinderPostOriginView f25759a;

    /* renamed from: b */
    public C58426v f25760b;

    /* renamed from: c */
    public C50259lg1 f25761c;

    /* renamed from: dr1.y$b */
    public static final class C7507b extends C87413o implements C32226l<C50259lg1, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7506y f25762d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7507b(C7506y yVar) {
            super(1);
            this.f25762d = yVar;
        }

        public Object invoke(Object obj) {
            this.f25762d.f25761c = (C50259lg1) obj;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dr1.y$a */
    public static final class C7508a implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C7506y f25763a;

        public C7508a(C7506y yVar) {
            this.f25763a = yVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
            if (r10 == false) goto L_0x00a4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00a7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onStatusChange(boolean r10) {
            /*
                r9 = this;
                dr1.y r0 = r9.f25763a
                te3.lg1 r1 = r0.f25761c
                if (r1 == 0) goto L_0x00b9
                int r2 = r1.f137398d
                r3 = 1
                if (r2 != r3) goto L_0x00b9
                dr1.v r0 = r0.f25760b
                if (r0 == 0) goto L_0x00b9
                r0.f167388e = r1
                if (r10 == 0) goto L_0x00b2
                rx3.g r10 = r0.f167392i
                rx3.n r10 = (rx3.C36570n) r10
                java.lang.Object r10 = r10.getValue()
                com.tencent.mm.plugin.finder.post.PostMainUIC r10 = (com.tencent.p014mm.plugin.finder.post.PostMainUIC) r10
                bt1.b r10 = r10.f160283t
                boolean r2 = r10 instanceof bt1.C54585t
                r4 = 0
                if (r2 == 0) goto L_0x0027
                bt1.t r10 = (bt1.C54585t) r10
                goto L_0x0028
            L_0x0027:
                r10 = r4
            L_0x0028:
                if (r10 == 0) goto L_0x002f
                long r5 = r10.mo75483o()
                goto L_0x0031
            L_0x002f:
                r5 = 0
            L_0x0031:
                te3.sr0 r10 = r1.f137401g
                r2 = 0
                if (r10 != 0) goto L_0x0037
                goto L_0x0048
            L_0x0037:
                te3.k93 r10 = r1.f137402h
                if (r10 == 0) goto L_0x003e
                int r10 = r10.f136627d
                goto L_0x003f
            L_0x003e:
                r10 = 0
            L_0x003f:
                int r10 = r10 * 1000
                long r7 = (long) r10
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 < 0) goto L_0x0048
                r10 = 1
                goto L_0x0049
            L_0x0048:
                r10 = 0
            L_0x0049:
                if (r10 == 0) goto L_0x00a4
                rx3.g r10 = r0.f167390g
                rx3.n r10 = (rx3.C36570n) r10
                java.lang.Object r10 = r10.getValue()
                kq1.e r10 = (kq1.C61136e) r10
                java.lang.String r1 = r10.f174047d
                if (r1 == 0) goto L_0x0062
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0060
                goto L_0x0062
            L_0x0060:
                r1 = 0
                goto L_0x0063
            L_0x0062:
                r1 = 1
            L_0x0063:
                if (r1 == 0) goto L_0x0070
                java.lang.String r10 = r10.f174048e
                boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
                if (r10 == 0) goto L_0x006e
                goto L_0x0070
            L_0x006e:
                r10 = 0
                goto L_0x0071
            L_0x0070:
                r10 = 1
            L_0x0071:
                if (r10 == 0) goto L_0x00a0
                rx3.g r10 = r0.f167392i
                rx3.n r10 = (rx3.C36570n) r10
                java.lang.Object r10 = r10.getValue()
                com.tencent.mm.plugin.finder.post.PostMainUIC r10 = (com.tencent.p014mm.plugin.finder.post.PostMainUIC) r10
                bt1.b r10 = r10.f160283t
                if (r10 == 0) goto L_0x0083
                te3.td1 r4 = r10.f152935c
            L_0x0083:
                if (r4 != 0) goto L_0x00a0
                rx3.g r10 = r0.f167391h
                rx3.n r10 = (rx3.C36570n) r10
                java.lang.Object r10 = r10.getValue()
                ao1.m1 r10 = (ao1.C54270m1) r10
                java.lang.String r10 = r10.mo75060c3()
                int r10 = r10.length()
                if (r10 != 0) goto L_0x009b
                r10 = 1
                goto L_0x009c
            L_0x009b:
                r10 = 0
            L_0x009c:
                if (r10 == 0) goto L_0x00a0
                r10 = 1
                goto L_0x00a1
            L_0x00a0:
                r10 = 0
            L_0x00a1:
                if (r10 == 0) goto L_0x00a4
                goto L_0x00a5
            L_0x00a4:
                r3 = 0
            L_0x00a5:
                if (r3 == 0) goto L_0x00b2
                com.tencent.mm.plugin.finder.view.FinderJumperView r10 = r0.f167385b
                r10.setVisibility(r2)
                com.tencent.mm.plugin.finder.view.FinderJumperView r10 = r0.f167385b
                r10.mo4599b()
                goto L_0x00b9
            L_0x00b2:
                com.tencent.mm.plugin.finder.view.FinderJumperView r10 = r0.f167385b
                r0 = 8
                r10.setVisibility(r0)
            L_0x00b9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dr1.C7506y.C7508a.onStatusChange(boolean):void");
        }
    }

    public C7506y(FinderPostOriginView finderPostOriginView) {
        C87412m.m108594g(finderPostOriginView, "originView");
        this.f25759a = finderPostOriginView;
    }

    /* renamed from: b */
    public void mo8612b(Intent intent, Bundle bundle) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(bundle, "postData");
        long longExtra = intent.getLongExtra("ORIGIN_POST_FLAG", 0);
        FinderPostOriginView finderPostOriginView = this.f25759a;
        boolean z = false;
        boolean z2 = (longExtra & 1) == 1;
        finderPostOriginView.getClass();
        if (!finderPostOriginView.f17913n && !finderPostOriginView.f17915p) {
            finderPostOriginView.f17908f.setCheck(z2);
        }
        finderPostOriginView.f17916q = intent;
        if (intent.getLongExtra("ORIGIN_POST_FLAG", 0) == 1) {
            z = true;
        }
        if (z && !finderPostOriginView.f17915p) {
            finderPostOriginView.f17908f.setCheck(true);
        }
        if (finderPostOriginView.f17908f.f220433y) {
            finderPostOriginView.mo4668e();
        }
        this.f25759a.setSwitchListener(new C7508a(this));
        this.f25759a.setOnSelectTypeItem(new C7507b(this));
    }
}
