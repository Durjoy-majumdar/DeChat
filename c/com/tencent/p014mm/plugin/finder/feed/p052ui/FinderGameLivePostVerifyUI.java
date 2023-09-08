package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import hp3.C87581a;
import java.util.Set;
import kotlin.Metadata;
import nj3.C76912y0;
import nj3.C88989a;
import p565ir.C60606n;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C22415w0;
import xk1.C15747k0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLivePostVerifyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lxk1/k0$a;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(39)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI */
public final class FinderGameLivePostVerifyUI extends MMFinderUI implements C15747k0.C15748a {

    /* renamed from: t */
    public static final /* synthetic */ int f158907t = 0;

    /* renamed from: o */
    public final C13601g f158908o = C36568h.m40985a(new C55808a(this));

    /* renamed from: p */
    public final C13601g f158909p = C36568h.m40985a(new C55813f(this));

    /* renamed from: q */
    public final C13601g f158910q = C36568h.m40985a(new C55810c(this));

    /* renamed from: r */
    public final C13601g f158911r = C36568h.m40985a(new C55809b(this));

    /* renamed from: s */
    public final C13601g f158912s = C36568h.m40985a(new C55812e(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI$a */
    public static final class C55808a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLivePostVerifyUI f158913d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55808a(FinderGameLivePostVerifyUI finderGameLivePostVerifyUI) {
            super(0);
            this.f158913d = finderGameLivePostVerifyUI;
        }

        public Object invoke() {
            return this.f158913d.getIntent().getStringExtra("APPID");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI$b */
    public static final class C55809b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLivePostVerifyUI f158914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55809b(FinderGameLivePostVerifyUI finderGameLivePostVerifyUI) {
            super(0);
            this.f158914d = finderGameLivePostVerifyUI;
        }

        public Object invoke() {
            return this.f158914d.getIntent().getStringExtra("WXA_DEVELOPER_CUSTOM_PARAM");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI$c */
    public static final class C55810c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLivePostVerifyUI f158915d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55810c(FinderGameLivePostVerifyUI finderGameLivePostVerifyUI) {
            super(0);
            this.f158915d = finderGameLivePostVerifyUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f158915d.getIntent().getBooleanExtra("IGNORE_CONTINUE_LIVE", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI$d */
    public static final class C55811d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderGameLivePostVerifyUI f158916a;

        /* renamed from: b */
        public final /* synthetic */ int f158917b;

        /* renamed from: c */
        public final /* synthetic */ long f158918c;

        public C55811d(FinderGameLivePostVerifyUI finderGameLivePostVerifyUI, int i, long j) {
            this.f158916a = finderGameLivePostVerifyUI;
            this.f158917b = i;
            this.f158918c = j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x005c A[EDGE_INSN: B:41:0x005c->B:23:0x005c ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r10) {
            /*
                r9 = this;
                ob0.b$c r10 = (ob0.C89132b.C89134c) r10
                int r0 = r10.f256793a
                r1 = 0
                java.lang.String r2 = "Finder.FinderGameLivePostVerifyUI"
                if (r0 != 0) goto L_0x00fd
                int r0 = r10.f256794b
                if (r0 != 0) goto L_0x00fd
                T r10 = r10.f256796d
                te3.m11 r10 = (te3.C50336m11) r10
                java.util.LinkedList<te3.qs1> r10 = r10.f137744d
                java.lang.String r0 = "it.resp.game_user_info_list"
                gy3.C87412m.m108593f(r10, r0)
                com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI r0 = r9.f158916a
                java.util.Iterator r10 = r10.iterator()
            L_0x001e:
                boolean r3 = r10.hasNext()
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x005b
                java.lang.Object r3 = r10.next()
                r6 = r3
                te3.qs1 r6 = (te3.C51006qs1) r6
                te3.kr1 r7 = r6.f140523e
                if (r7 == 0) goto L_0x0034
                java.lang.String r7 = r7.f137001d
                goto L_0x0035
            L_0x0034:
                r7 = r4
            L_0x0035:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x0057
                te3.kr1 r6 = r6.f140523e
                if (r6 == 0) goto L_0x0042
                java.lang.String r6 = r6.f137001d
                goto L_0x0043
            L_0x0042:
                r6 = r4
            L_0x0043:
                int r7 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLivePostVerifyUI.f158907t
                rx3.g r7 = r0.f158908o
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                java.lang.String r7 = (java.lang.String) r7
                boolean r6 = gy3.C87412m.m108589b(r6, r7)
                if (r6 == 0) goto L_0x0057
                r6 = 1
                goto L_0x0058
            L_0x0057:
                r6 = 0
            L_0x0058:
                if (r6 == 0) goto L_0x001e
                goto L_0x005c
            L_0x005b:
                r3 = r4
            L_0x005c:
                te3.qs1 r3 = (te3.C51006qs1) r3
                if (r3 == 0) goto L_0x00f5
                com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI r10 = r9.f158916a
                int r0 = r9.f158917b
                long r6 = r9.f158918c
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                byte[] r3 = r3.toByteArray()
                java.lang.String r8 = "GameUserInfo"
                r4.putExtra(r8, r3)
                java.lang.String r3 = ""
                java.lang.String r8 = "TICKET"
                r4.putExtra(r8, r3)
                int r8 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLivePostVerifyUI.f158907t
                rx3.g r8 = r10.f158908o
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L_0x008a
                goto L_0x008b
            L_0x008a:
                r3 = r8
            L_0x008b:
                java.lang.String r8 = "APPID"
                r4.putExtra(r8, r3)
                rx3.g r3 = r10.f158909p
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.lang.String r8 = "VERSION_TYPE"
                r4.putExtra(r8, r3)
                java.lang.String r3 = "POST_FROM_SCENE"
                r4.putExtra(r3, r1)
                java.lang.String r1 = "IS_FROM_WEAPP"
                r4.putExtra(r1, r5)
                r1 = 4
                java.lang.String r3 = "MINI_GAME_SCENE"
                r4.putExtra(r3, r1)
                java.lang.String r1 = "KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE"
                r4.putExtra(r1, r0)
                java.lang.String r0 = "KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID"
                r4.putExtra(r0, r6)
                rx3.g r0 = r10.f158911r
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x00ce
                java.lang.String r1 = "WXA_DEVELOPER_CUSTOM_PARAM"
                r4.putExtra(r1, r0)
            L_0x00ce:
                rx3.g r0 = r10.f158912s
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x00df
                java.lang.String r1 = "REPORT_INFO"
                r4.putExtra(r1, r0)
            L_0x00df:
                java.lang.Class<tf0.o1> r0 = tf0.C13883o1.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                tf0.o1 r0 = (tf0.C13883o1) r0
                androidx.appcompat.app.AppCompatActivity r10 = r10.getContext()
                java.lang.String r1 = "context"
                gy3.C87412m.m108593f(r10, r1)
                r0.mo13281h6(r10, r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
            L_0x00f5:
                if (r4 != 0) goto L_0x0118
                java.lang.String r10 = "CgiFinderLiveGetUserGameConfig error, no match game"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
                goto L_0x0118
            L_0x00fd:
                java.lang.String r10 = "CgiFinderLiveGetUserGameConfig error, toast"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
                com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI r10 = r9.f158916a
                androidx.appcompat.app.AppCompatActivity r10 = r10.getContext()
                com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI r0 = r9.f158916a
                r2 = 2131827489(0x7f111b21, float:1.9287892E38)
                java.lang.String r0 = r0.getString(r2)
                android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r10, (java.lang.CharSequence) r0, (int) r1)
                r10.show()
            L_0x0118:
                com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI r10 = r9.f158916a
                r10.finish()
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLivePostVerifyUI.C55811d.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI$e */
    public static final class C55812e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLivePostVerifyUI f158919d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55812e(FinderGameLivePostVerifyUI finderGameLivePostVerifyUI) {
            super(0);
            this.f158919d = finderGameLivePostVerifyUI;
        }

        public Object invoke() {
            return this.f158919d.getIntent().getStringExtra("REPORT_INFO");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI$f */
    public static final class C55813f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameLivePostVerifyUI f158920d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55813f(FinderGameLivePostVerifyUI finderGameLivePostVerifyUI) {
            super(0);
            this.f158920d = finderGameLivePostVerifyUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f158920d.getIntent().getIntExtra("VERSION_TYPE", 0));
        }
    }

    public FinderGameLivePostVerifyUI() {
        Intent intent = getIntent();
        if (intent != null) {
            intent.getIntExtra("LANDSCAPE_TYPE", 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r6 = r5.objectNonceId;
     */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14469C0(boolean r20, te3.C49007cj0 r21, te3.C50119ke1 r22, boolean r23, int r24, long r25) {
        /*
            r19 = this;
            r12 = r19
            r0 = r21
            if (r20 == 0) goto L_0x00b1
            java.lang.String r1 = ""
            if (r23 == 0) goto L_0x0077
            rx3.g r2 = r12.f158910q
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0077
            if (r0 == 0) goto L_0x0071
            java.lang.Class<tf0.o1> r2 = tf0.C13883o1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            tf0.o1 r2 = (tf0.C13883o1) r2
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r0.f131759i
            gy3.C87412m.m108591d(r3)
            long r3 = r3.f164794id
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r0.f131759i
            if (r5 == 0) goto L_0x0036
            java.lang.String r6 = r5.objectNonceId
            if (r6 != 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r7 = r6
            goto L_0x0037
        L_0x0036:
            r7 = r1
        L_0x0037:
            gy3.C87412m.m108591d(r5)
            te3.c21 r5 = r5.liveInfo
            gy3.C87412m.m108591d(r5)
            te3.d51 r1 = r0.f131755e
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r0.f131759i
            if (r6 == 0) goto L_0x0048
            java.lang.String r6 = r6.sessionBuffer
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            r17 = r6
            java.util.LinkedList<te3.y91> r9 = r0.f131760j
            te3.y91 r10 = r0.f131761n
            java.util.LinkedList<te3.vv0> r13 = r0.f131762o
            android.content.Intent r0 = new android.content.Intent
            r14 = r0
            r0.<init>()
            java.lang.String r0 = "getService(IActivityRouter::class.java)"
            gy3.C87412m.m108593f(r2, r0)
            r6 = 0
            r8 = 0
            r11 = 0
            r15 = 592(0x250, float:8.3E-43)
            r16 = 0
            r0 = r2
            r18 = r1
            r1 = r19
            r2 = r3
            r4 = r7
            r7 = r18
            r12 = r17
            tf0.C13883o1.C13884a.m13249a(r0, r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0071:
            r19.finish()
            r2 = r19
            goto L_0x00b5
        L_0x0077:
            qg1.r r0 = new qg1.r
            r2 = r19
            rx3.g r3 = r2.f158908o
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r1 = r3
        L_0x0089:
            r3 = 0
            r0.<init>(r1, r3, r3)
            android.content.res.Resources r1 = r19.getResources()
            r3 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r1 = r1.getString(r3)
            r3 = 500(0x1f4, double:2.47E-321)
            r0.mo85582k(r2, r1, r3)
            nr3.e r0 = r0.mo9225i()
            r0.mo11397F(r2)
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI$d r1 = new com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostVerifyUI$d
            r3 = r24
            r4 = r25
            r1.<init>(r2, r3, r4)
            r0.mo123420E(r1)
            goto L_0x00b5
        L_0x00b1:
            r2 = r12
            r19.finish()
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLivePostVerifyUI.mo14469C0(boolean, te3.cj0, te3.ke1, boolean, int, long):void");
    }

    /* renamed from: N7 */
    public final int mo77414N7() {
        Intent intent = getIntent();
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("LANDSCAPE_TYPE", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return 0;
        }
        return (valueOf != null && valueOf.intValue() == 2) ? 8 : -1;
    }

    public int getForceOrientation() {
        return mo77414N7();
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C15747k0.class);
    }

    public void onCreate(Bundle bundle) {
        Class cls = C15747k0.class;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        if (((C60606n) C86312j.m106911c(C60606n.class)).mo85017L5()) {
            Log.m105924i("Finder.FinderGameLivePostVerifyUI", "onCreate: isVisitorLiving = true, finish!");
            C76912y0.makeText((Context) getContext(), (CharSequence) getContext().getResources().getString(C0966R.string.d2l), 0).show();
            finish();
            return;
        }
        setRequestedOrientation(mo77414N7());
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        C39818r rVar = C39818r.f106831a;
        ((C15747k0) rVar.mo62444c(this).mo75002a(cls)).f42470f = this;
        ((C15747k0) rVar.mo62444c(this).mo75002a(cls)).f42471g = 14;
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        mo79124M7(true);
        setTheme(C0966R.style.f8619p0);
    }
}
