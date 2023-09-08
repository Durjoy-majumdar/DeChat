package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import er1.C7853p2;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import kotlin.Metadata;
import nj3.C76879j;
import o40.C61926c;
import p232rw.C63679m;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C52271zj0;
import te3.m44;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Landroid/view/View;", "s", "Landroid/view/View;", "getTipsMask", "()Landroid/view/View;", "setTipsMask", "(Landroid/view/View;)V", "tipsMask", "<init>", "()V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI */
public final class FinderSharePostUI extends MMFinderUI {

    /* renamed from: v */
    public static final /* synthetic */ int f159030v = 0;

    /* renamed from: o */
    public final String f159031o = "Finder.FinderSharePostUI";

    /* renamed from: p */
    public C89779i0 f159032p;

    /* renamed from: q */
    public String f159033q;

    /* renamed from: r */
    public DialogInterface.OnCancelListener f159034r;

    /* renamed from: s */
    public View f159035s;

    /* renamed from: t */
    public m44 f159036t;

    /* renamed from: u */
    public boolean f159037u;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$e */
    public static final class C3053e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C52271zj0> f14822a;

        /* renamed from: b */
        public final /* synthetic */ FinderSharePostUI f14823b;

        /* renamed from: c */
        public final /* synthetic */ C32226l<C52271zj0, C13598b0> f14824c;

        public C3053e(C8479f0<C52271zj0> f0Var, FinderSharePostUI finderSharePostUI, C32226l<? super C52271zj0, C13598b0> lVar) {
            this.f14822a = f0Var;
            this.f14823b = finderSharePostUI;
            this.f14824c = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
            r11 = r11.f141556e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r11) {
            /*
                r10 = this;
                ob0.b$c r11 = (ob0.C89132b.C89134c) r11
                int r0 = r11.f256793a
                r1 = 0
                if (r0 != 0) goto L_0x0022
                int r0 = r11.f256794b
                if (r0 != 0) goto L_0x0022
                gy3.f0<te3.zj0> r0 = r10.f14822a
                T r11 = r11.f256796d
                te3.sj1 r11 = (te3.C51253sj1) r11
                if (r11 == 0) goto L_0x001e
                java.util.LinkedList<te3.zj0> r11 = r11.f141556e
                if (r11 == 0) goto L_0x001e
                java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
                te3.zj0 r11 = (te3.C52271zj0) r11
                goto L_0x001f
            L_0x001e:
                r11 = r1
            L_0x001f:
                r0.f27484d = r11
                goto L_0x005b
            L_0x0022:
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 1253(0x4e5, double:6.19E-321)
                r5 = 71
                r7 = 1
                r2.mo175913w(r3, r5, r7)
                com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI r0 = r10.f14823b
                java.lang.String r0 = r0.f159031o
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "errorType = "
                r2.append(r3)
                int r3 = r11.f256793a
                r2.append(r3)
                java.lang.String r3 = " errorCode = "
                r2.append(r3)
                int r3 = r11.f256794b
                r2.append(r3)
                java.lang.String r3 = "  errorMsg = "
                r2.append(r3)
                java.lang.String r11 = r11.f256795c
                r2.append(r11)
                java.lang.String r11 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            L_0x005b:
                com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI r11 = r10.f14823b
                java.lang.String r11 = r11.f159031o
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "eventInfo = "
                r0.append(r2)
                gy3.f0<te3.zj0> r2 = r10.f14822a
                T r2 = r2.f27484d
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                gy3.f0<te3.zj0> r11 = r10.f14822a
                T r11 = r11.f27484d
                r0 = r11
                te3.zj0 r0 = (te3.C52271zj0) r0
                r2 = 1
                if (r0 == 0) goto L_0x0086
                int r0 = r0.f146017s
                if (r0 != r2) goto L_0x0086
                goto L_0x0087
            L_0x0086:
                r2 = 0
            L_0x0087:
                if (r2 == 0) goto L_0x009a
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 1253(0x4e5, double:6.19E-321)
                r6 = 72
                r8 = 1
                r3.mo175913w(r4, r6, r8)
                fy3.l<te3.zj0, rx3.b0> r11 = r10.f14824c
                r11.invoke(r1)
                goto L_0x009f
            L_0x009a:
                fy3.l<te3.zj0, rx3.b0> r0 = r10.f14824c
                r0.invoke(r11)
            L_0x009f:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI.C3053e.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$a */
    public static final class C55835a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSharePostUI f159038d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55835a(FinderSharePostUI finderSharePostUI) {
            super(0);
            this.f159038d = finderSharePostUI;
        }

        public Object invoke() {
            C89779i0 i0Var = this.f159038d.f159032p;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f159038d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$b */
    public static final class C55836b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSharePostUI f159039d;

        /* renamed from: e */
        public final /* synthetic */ String f159040e;

        /* renamed from: f */
        public final /* synthetic */ String f159041f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55836b(FinderSharePostUI finderSharePostUI, String str, String str2) {
            super(0);
            this.f159039d = finderSharePostUI;
            this.f159040e = str;
            this.f159041f = str2;
        }

        public Object invoke() {
            C76879j.m92713G(this.f159039d.getContext(), this.f159039d.getResources().getString(C0966R.string.ep8), "", false, new C55845o(this.f159039d, this.f159040e, this.f159041f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$c */
    public static final class C55837c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSharePostUI f159042d;

        /* renamed from: e */
        public final /* synthetic */ String f159043e;

        /* renamed from: f */
        public final /* synthetic */ String f159044f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55837c(FinderSharePostUI finderSharePostUI, String str, String str2) {
            super(0);
            this.f159042d = finderSharePostUI;
            this.f159043e = str;
            this.f159044f = str2;
        }

        public Object invoke() {
            C76879j.m92713G(this.f159042d.getContext(), this.f159042d.getResources().getString(C0966R.string.ep7), "", false, new C55846p(this.f159042d, this.f159043e, this.f159044f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$d */
    public static final class C55838d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSharePostUI f159045d;

        /* renamed from: e */
        public final /* synthetic */ String f159046e;

        /* renamed from: f */
        public final /* synthetic */ String f159047f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55838d(FinderSharePostUI finderSharePostUI, String str, String str2) {
            super(0);
            this.f159045d = finderSharePostUI;
            this.f159046e = str;
            this.f159047f = str2;
        }

        public Object invoke() {
            C76879j.m92713G(this.f159045d.getContext(), this.f159045d.getResources().getString(C0966R.string.ep9), "", false, new C55847q(this.f159045d, this.f159046e, this.f159047f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$f */
    public static final class C55839f implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSharePostUI f159048d;

        public C55839f(FinderSharePostUI finderSharePostUI) {
            this.f159048d = finderSharePostUI;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            FinderSharePostUI finderSharePostUI = this.f159048d;
            int i = FinderSharePostUI.f159030v;
            finderSharePostUI.mo77439N7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$g */
    public static final class C55840g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSharePostUI f159049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55840g(FinderSharePostUI finderSharePostUI) {
            super(0);
            this.f159049d = finderSharePostUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0200, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0201, code lost:
            r29 = r12;
            r30 = r13;
            r31 = "";
            r2 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0221, code lost:
            r4 = r12;
            r14 = r13;
            r2 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r0 = r0.f184892d;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0200 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:30:0x0056] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00c8 A[Catch:{ JSONException -> 0x0221, all -> 0x0200 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00d3 A[SYNTHETIC, Splitter:B:50:0x00d3] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0120 A[Catch:{ JSONException -> 0x0221, all -> 0x0200 }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0122 A[Catch:{ JSONException -> 0x0221, all -> 0x0200 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r33 = this;
                r1 = r33
                com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI r15 = r1.f159049d
                int r0 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI.f159030v
                te3.m44 r0 = r15.mo77442Q7()
                te3.pv3 r0 = r0.f184201e
                java.lang.String r14 = ""
                if (r0 == 0) goto L_0x0017
                java.lang.String r0 = r0.f184892d
                if (r0 != 0) goto L_0x0015
                goto L_0x0017
            L_0x0015:
                r13 = r0
                goto L_0x0018
            L_0x0017:
                r13 = r14
            L_0x0018:
                te3.m44 r0 = r15.mo77442Q7()
                te3.pv3 r0 = r0.f184201e
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r0.f184893e
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r12 = r0
                goto L_0x0028
            L_0x0027:
                r12 = r14
            L_0x0028:
                te3.m44 r0 = r15.mo77442Q7()
                te3.pv3 r0 = r0.f184201e
                if (r0 == 0) goto L_0x0034
                java.lang.String r0 = r0.f184894f
                if (r0 != 0) goto L_0x0035
            L_0x0034:
                r0 = r14
            L_0x0035:
                te3.m44 r2 = r15.mo77442Q7()
                te3.pv3 r2 = r2.f184201e
                if (r2 == 0) goto L_0x0044
                java.lang.String r2 = r2.f184898j
                if (r2 != 0) goto L_0x0042
                goto L_0x0044
            L_0x0042:
                r11 = r2
                goto L_0x0045
            L_0x0044:
                r11 = r14
            L_0x0045:
                te3.m44 r2 = r15.mo77442Q7()
                te3.pv3 r2 = r2.f184201e
                if (r2 == 0) goto L_0x0054
                java.lang.String r2 = r2.f184897i
                if (r2 != 0) goto L_0x0052
                goto L_0x0054
            L_0x0052:
                r10 = r2
                goto L_0x0055
            L_0x0054:
                r10 = r14
            L_0x0055:
                r9 = 0
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r2.<init>(r0)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r0 = "localIdentifier"
                java.lang.String r0 = r2.getString(r0)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r3 = "remoteUrl"
                java.lang.String r3 = r2.getString(r3)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r4 = "fromAppType"
                int r4 = r2.getInt(r4)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r5 = "paramsJson"
                java.lang.String r5 = r2.optString(r5)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                if (r5 != 0) goto L_0x0076
                r5 = r14
            L_0x0076:
                java.lang.String r6 = "from"
                java.lang.String r16 = r2.optString(r6, r14)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r6 = "desc"
                java.lang.String r7 = r2.optString(r6, r14)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r6 = "extendUrl"
                java.lang.String r8 = r2.optString(r6, r14)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r6 = "miaojianExtInfo"
                java.lang.String r6 = r2.optString(r6, r14)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r1 = "finderScene"
                int r1 = r2.optInt(r1, r9)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r17 = r11
                gy3.f0 r11 = new gy3.f0     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r11.<init>()     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r11.f27484d = r14     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r18 = r1
                gy3.a0 r1 = new gy3.a0     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r1.<init>()     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r19 = 1
                if (r3 == 0) goto L_0x00b6
                int r20 = r3.length()     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                if (r20 != 0) goto L_0x00b3
                goto L_0x00b6
            L_0x00b3:
                r20 = 0
                goto L_0x00b8
            L_0x00b6:
                r20 = 1
            L_0x00b8:
                if (r20 != 0) goto L_0x00c6
                if (r2 != 0) goto L_0x00c6
                vf1.w4 r0 = new vf1.w4     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r0.<init>(r15)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                o40.C61926c.m72668M(r0)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                goto L_0x022d
            L_0x00c6:
                if (r2 != 0) goto L_0x00d3
                r0 = -3
                java.lang.String r1 = "file not exist"
                r15.mo77441P7(r0, r1, r13, r12)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r15.mo77439N7()     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                goto L_0x022d
            L_0x00d3:
                uq1.m r2 = uq1.C65449m.f188332a     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r9 = "rawPath"
                gy3.C87412m.m108593f(r0, r9)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                uq1.m$a r9 = r2.mo89568h(r0)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r21 = r6
                boolean r6 = r15.f159037u     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                if (r6 == 0) goto L_0x0100
                if (r9 == 0) goto L_0x00ee
                boolean r6 = r2.mo89563b(r15, r9)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                if (r6 == 0) goto L_0x00ee
                r6 = 1
                goto L_0x00ef
            L_0x00ee:
                r6 = 0
            L_0x00ef:
                boolean r9 = r15.f159037u     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                if (r9 == 0) goto L_0x0100
                if (r6 != 0) goto L_0x0100
                r0 = -5
                java.lang.String r1 = "format invalid"
                r15.mo77441P7(r0, r1, r13, r12)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r15.mo77439N7()     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                goto L_0x022d
            L_0x0100:
                java.lang.Class<rw.m> r6 = p232rw.C63679m.class
                di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                rw.m r6 = (p232rw.C63679m) r6     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                rw.m$a r6 = r6.mo88483M1(r0)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                if (r3 == 0) goto L_0x0117
                int r9 = r3.length()     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                if (r9 != 0) goto L_0x0115
                goto L_0x0117
            L_0x0115:
                r9 = 0
                goto L_0x0118
            L_0x0117:
                r9 = 1
            L_0x0118:
                if (r9 != 0) goto L_0x0122
                boolean r9 = r15.mo77440O7(r0, r6, r13, r12)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                if (r9 != 0) goto L_0x0122
                goto L_0x022d
            L_0x0122:
                if (r6 == 0) goto L_0x0151
                r22 = r10
                long r9 = r6.f180528d     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r23 = 60000(0xea60, double:2.9644E-319)
                int r25 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
                if (r25 <= 0) goto L_0x0131
                r9 = 1
                goto L_0x0132
            L_0x0131:
                r9 = 0
            L_0x0132:
                r1.f27482d = r9     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                java.lang.String r9 = r15.f159031o     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r10.<init>()     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r19 = r2
                java.lang.String r2 = "isLongVideo, "
                r10.append(r2)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r23 = r1
                long r1 = r6.f180528d     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r10.append(r1)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                java.lang.String r1 = r10.toString()     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                goto L_0x0157
            L_0x0151:
                r23 = r1
                r19 = r2
                r22 = r10
            L_0x0157:
                er1.j5 r1 = er1.C58741j5.f168184a     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r2 = "share"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r6.<init>()     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r6.append(r9)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r6.append(r9)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r9.<init>()     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r10 = er1.C58741j5.f168196m     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r9.append(r10)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r1 = r1.mo83736j(r2, r6, r14)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r9.append(r1)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r1 = r9.toString()     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r11.f27484d = r1     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r1)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                T r1 = r11.f27484d     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                if (r1 == 0) goto L_0x01ac
                T r1 = r11.f27484d     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                if (r1 == 0) goto L_0x01ac
                r0 = -4
                java.lang.String r1 = "file copy failed"
                r15.mo77441P7(r0, r1, r13, r12)     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                r15.mo77439N7()     // Catch:{ JSONException -> 0x0221, all -> 0x0200 }
                goto L_0x022d
            L_0x01ac:
                vf1.y4 r1 = new vf1.y4     // Catch:{ JSONException -> 0x01f6, all -> 0x0200 }
                r10 = r19
                r2 = r1
                r19 = r21
                r6 = r15
                r9 = r19
                r26 = r10
                r27 = r22
                r10 = r18
                r28 = r17
                r17 = r11
                r11 = r12
                r29 = r12
                r12 = r23
                r30 = r13
                r13 = r16
                r31 = r14
                r14 = r0
                r32 = r15
                r15 = r17
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x01f3, all -> 0x01ef }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)     // Catch:{ JSONException -> 0x01f3, all -> 0x01ef }
                if (r0 != 0) goto L_0x01e1
                r0 = r19
                r2 = r32
                r2.mo77443R7(r0, r1)     // Catch:{ JSONException -> 0x01fb, all -> 0x01ed }
                goto L_0x022d
            L_0x01e1:
                r0 = r26
                r3 = r27
                r14 = r28
                r2 = r32
                r0.mo89572l(r14, r3, r1)     // Catch:{ JSONException -> 0x01fb, all -> 0x01ed }
                goto L_0x022d
            L_0x01ed:
                r0 = move-exception
                goto L_0x0208
            L_0x01ef:
                r0 = move-exception
                r2 = r32
                goto L_0x0208
            L_0x01f3:
                r2 = r32
                goto L_0x01fb
            L_0x01f6:
                r29 = r12
                r30 = r13
                r2 = r15
            L_0x01fb:
                r4 = r29
                r14 = r30
                goto L_0x0224
            L_0x0200:
                r0 = move-exception
                r29 = r12
                r30 = r13
                r31 = r14
                r2 = r15
            L_0x0208:
                r1 = -100
                java.lang.String r3 = "other exception"
                r4 = r29
                r14 = r30
                r2.mo77441P7(r1, r3, r14, r4)
                r2.mo77439N7()
                java.lang.String r1 = r2.f159031o
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = r31
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r2)
                goto L_0x022d
            L_0x0221:
                r4 = r12
                r14 = r13
                r2 = r15
            L_0x0224:
                r0 = -2
                java.lang.String r1 = "extInfo json invalid"
                r2.mo77441P7(r0, r1, r14, r4)
                r2.mo77439N7()
            L_0x022d:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI.C55840g.invoke():java.lang.Object");
        }
    }

    public FinderSharePostUI() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.a4d);
        C87412m.m108593f(string, "getContext().getString(c…mui.R.string.app_waiting)");
        this.f159033q = string;
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return this.f159031o;
    }

    /* renamed from: N7 */
    public final void mo77439N7() {
        C61926c.m72668M(new C55835a(this));
    }

    /* renamed from: O7 */
    public final boolean mo77440O7(String str, C63679m.C63680a aVar, String str2, String str3) {
        if (aVar == null) {
            return true;
        }
        long j = aVar.f180528d;
        if (j < 3000) {
            Log.m105924i(this.f159031o, "failed 3s");
            C61926c.m72668M(new C55836b(this, str2, str3));
            return false;
        } else if (j > 60000) {
            Log.m105924i(this.f159031o, "failed 60s");
            C61926c.m72668M(new C55837c(this, str2, str3));
            return false;
        } else {
            long l = C86013q1.m106451l(str);
            C37521f.f99374d.getClass();
            if (l <= ((long) (C37521f.f99383e * 500))) {
                return true;
            }
            Log.m105924i(this.f159031o, "failed 500M");
            C61926c.m72668M(new C55838d(this, str2, str3));
            return false;
        }
    }

    /* renamed from: P7 */
    public final void mo77441P7(int i, String str, String str2, String str3) {
        C87412m.m108594g(str, "errMsg");
        String str4 = this.f159031o;
        Log.m105924i(str4, "fallback errcode:" + i + ", " + str + ", " + str3);
        if (!this.f159037u) {
            C7853p2.f26439a.mo8959b(i, str, str2, str3);
        }
    }

    /* renamed from: Q7 */
    public final m44 mo77442Q7() {
        m44 m44 = this.f159036t;
        if (m44 != null) {
            return m44;
        }
        C87412m.m108603p("shareData");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a A[Catch:{ all -> 0x00a5 }] */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77443R7(java.lang.String r14, fy3.C32226l<? super te3.C52271zj0, rx3.C13598b0> r15) {
        /*
            r13 = this;
            r0 = 16
            r1 = 0
            r2 = 0
            byte[] r14 = zs0.C91932a.m115444a(r14, r0)     // Catch:{ all -> 0x00a5 }
            if (r14 == 0) goto L_0x001b
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "forName(\"UTF-8\")"
            gy3.C87412m.m108593f(r0, r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x00a5 }
            r3.<init>(r14, r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x001c
        L_0x001b:
            r3 = r2
        L_0x001c:
            r14 = 1
            if (r3 == 0) goto L_0x0028
            int r0 = r3.length()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x0036
            java.lang.String r14 = r13.f159031o     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "decoderStr empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ all -> 0x00a5 }
            r15.invoke(r2)     // Catch:{ all -> 0x00a5 }
            return
        L_0x0036:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00a5 }
            r0.<init>(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "eventConfig"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x004b
            java.lang.String r3 = "finderNickname"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ all -> 0x00a5 }
            r4 = r3
            goto L_0x004c
        L_0x004b:
            r4 = r2
        L_0x004c:
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = "eventName"
            java.lang.String r0 = r0.optString(r3)     // Catch:{ all -> 0x00a5 }
            r5 = r0
            goto L_0x0057
        L_0x0056:
            r5 = r2
        L_0x0057:
            gy3.f0 r0 = new gy3.f0     // Catch:{ all -> 0x00a5 }
            r0.<init>()     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x0067
            int r3 = r4.length()     // Catch:{ all -> 0x00a5 }
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r3 = 0
            goto L_0x0068
        L_0x0067:
            r3 = 1
        L_0x0068:
            if (r3 != 0) goto L_0x009a
            if (r5 == 0) goto L_0x0074
            int r3 = r5.length()     // Catch:{ all -> 0x00a5 }
            if (r3 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r14 != 0) goto L_0x009a
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00a5 }
            r7 = 1253(0x4e5, double:6.19E-321)
            r9 = 70
            r11 = 1
            r6.mo175913w(r7, r9, r11)     // Catch:{ all -> 0x00a5 }
            je1.k1 r14 = new je1.k1     // Catch:{ all -> 0x00a5 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 28
            r10 = 0
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00a5 }
            nr3.e r14 = r14.mo9225i()     // Catch:{ all -> 0x00a5 }
            com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$e r3 = new com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$e     // Catch:{ all -> 0x00a5 }
            r3.<init>(r0, r13, r15)     // Catch:{ all -> 0x00a5 }
            r14.mo123420E(r3)     // Catch:{ all -> 0x00a5 }
            goto L_0x00b9
        L_0x009a:
            r15.invoke(r2)     // Catch:{ all -> 0x00a5 }
            java.lang.String r14 = r13.f159031o     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "nickName or eventName is Empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x00b9
        L_0x00a5:
            r14 = move-exception
            r15.invoke(r2)
            java.lang.String r15 = r13.f159031o
            java.lang.String r0 = "exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            java.lang.String r15 = r13.f159031o
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r14, r1, r0)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI.mo77443R7(java.lang.String, fy3.l):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.apl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            androidx.appcompat.app.ActionBar r10 = r9.getSupportActionBar()
            if (r10 == 0) goto L_0x000c
            r10.mo91104o()
        L_0x000c:
            r10 = 2131309007(0x7f0931cf, float:1.8236286E38)
            android.view.View r10 = r9.findViewById(r10)
            r9.f159035s = r10
            r10 = 2131302776(0x7f091978, float:1.8223648E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.String r0 = "titleTv"
            gy3.C87412m.m108593f(r10, r0)
            er1.C7919x.m8091a(r10)
            r10 = 2131302775(0x7f091977, float:1.8223646E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.String r0 = "okBtn"
            gy3.C87412m.m108593f(r10, r0)
            er1.C7919x.m8091a(r10)
            vf1.z4 r0 = new vf1.z4
            r0.<init>(r9)
            r10.setOnClickListener(r0)
            com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$f r10 = new com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$f
            r10.<init>(r9)
            r9.f159034r = r10
            androidx.appcompat.app.AppCompatActivity r10 = r9.getContext()
            java.lang.String r0 = r9.f159033q
            android.content.DialogInterface$OnCancelListener r1 = r9.f159034r
            r2 = 1
            r3 = 0
            qo3.i0 r10 = qo3.C89779i0.m112248e(r10, r0, r2, r3, r1)
            r9.f159032p = r10
            te3.m44 r10 = new te3.m44
            r10.<init>()
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "KEY_POST_FROM_SHARE"
            byte[] r0 = r0.getByteArrayExtra(r1)
            java.lang.String r1 = ""
            r4 = 0
            if (r0 != 0) goto L_0x006c
            goto L_0x007a
        L_0x006c:
            r10.parseFrom(r0)     // Catch:{ Exception -> 0x0070 }
            goto L_0x007b
        L_0x0070:
            r10 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r10
            java.lang.String r10 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r1, r0)
        L_0x007a:
            r10 = r4
        L_0x007b:
            if (r10 == 0) goto L_0x0136
            r9.f159036t = r10
            te3.m44 r10 = r9.mo77442Q7()
            te3.pv3 r10 = r10.f184201e
            if (r10 == 0) goto L_0x008a
            boolean r10 = r10.f184895g
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            r9.f159037u = r10
            java.lang.Class<ht1.t1> r10 = ht1.C60200t1.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            ht1.t1 r10 = (ht1.C60200t1) r10
            boolean r10 = r10.mo76873sF()
            long r5 = eb0.C75592q0.m90781k()
            r7 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r5 = r5 & r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00ab
            r0 = 1
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            r0 = r0 ^ r2
            er1.w3 r5 = er1.C58784w3.f168295a
            int r5 = er1.C58784w3.m68441q(r5, r4, r2, r4)
            java.lang.Class<ht1.v4> r6 = ht1.C8808v4.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.v4 r6 = (ht1.C8808v4) r6
            boolean r6 = r6.mo9635e()
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99139C1
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 == r2) goto L_0x00e2
            r8 = 2
            if (r7 == r8) goto L_0x00e0
            r8 = 3
            if (r7 == r8) goto L_0x00de
            r8 = 4
            if (r7 == r8) goto L_0x00dc
            goto L_0x00e3
        L_0x00dc:
            r6 = 1
            goto L_0x00e3
        L_0x00de:
            r0 = 0
            goto L_0x00e3
        L_0x00e0:
            r5 = 1
            goto L_0x00e3
        L_0x00e2:
            r10 = 0
        L_0x00e3:
            if (r10 != 0) goto L_0x00f1
            r10 = 2131829881(0x7f112479, float:1.9292744E38)
            vf1.b5 r0 = new vf1.b5
            r0.<init>(r9, r10)
            o40.C61926c.m72668M(r0)
            goto L_0x012a
        L_0x00f1:
            if (r0 != 0) goto L_0x00fc
            vf1.a5 r10 = new vf1.a5
            r10.<init>(r9)
            o40.C61926c.m72668M(r10)
            goto L_0x012a
        L_0x00fc:
            if (r5 != r2) goto L_0x010a
            r10 = 2131829884(0x7f11247c, float:1.929275E38)
            vf1.b5 r0 = new vf1.b5
            r0.<init>(r9, r10)
            o40.C61926c.m72668M(r0)
            goto L_0x012a
        L_0x010a:
            if (r6 == 0) goto L_0x012b
            qo3.i0 r10 = r9.f159032p
            if (r10 == 0) goto L_0x0113
            r10.dismiss()
        L_0x0113:
            androidx.appcompat.app.AppCompatActivity r10 = r9.getContext()
            android.content.res.Resources r0 = r9.getResources()
            r2 = 2131830002(0x7f1124f2, float:1.929299E38)
            java.lang.String r0 = r0.getString(r2)
            vf1.u4 r2 = new vf1.u4
            r2.<init>(r9)
            nj3.C76879j.m92713G(r10, r0, r1, r3, r2)
        L_0x012a:
            r2 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x0139
            com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$g r10 = new com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI$g
            r10.<init>(r9)
            o40.C61926c.m72656A(r4, r10)
            goto L_0x0139
        L_0x0136:
            r9.mo77439N7()
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI.onCreate(android.os.Bundle):void");
    }

    public final void setTipsMask(View view) {
        this.f159035s = view;
    }
}
