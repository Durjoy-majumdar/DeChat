package ok1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13605o;

/* renamed from: ok1.g */
public final class C62063g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f176437d;

    /* renamed from: e */
    public final /* synthetic */ Context f176438e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f176439f;

    /* renamed from: ok1.g$a */
    public static final class C62064a extends C87413o implements C32226l<C13605o<? extends String, ? extends String, ? extends String>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C76874e0 f176440d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f176441e;

        /* renamed from: f */
        public final /* synthetic */ Context f176442f;

        /* renamed from: g */
        public final /* synthetic */ C77407n f176443g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62064a(C76874e0 e0Var, BaseFinderFeed baseFinderFeed, Context context, C77407n nVar) {
            super(1);
            this.f176440d = e0Var;
            this.f176441e = baseFinderFeed;
            this.f176442f = context;
            this.f176443g = nVar;
        }

        public Object invoke(Object obj) {
            C13605o oVar = (C13605o) obj;
            C87412m.m108594g(oVar, LocaleUtil.ITALIAN);
            ((ArrayList) this.f176440d.f224704d).clear();
            boolean isNotShareSns = this.f176441e.mo3513o().isNotShareSns();
            if (!isNotShareSns) {
                this.f176440d.mo107150j(103, this.f176442f.getString(C0966R.string.epb), C0966R.raw.bottomsheet_icon_moment, 0, isNotShareSns);
            } else {
                this.f176440d.mo107150j(103, (CharSequence) oVar.f38558e, C0966R.raw.bottomsheet_icon_moment, 0, isNotShareSns);
            }
            this.f176443g.mo107564i();
            return C13598b0.f38549a;
        }
    }

    public C62063g(BaseFinderFeed baseFinderFeed, Context context, C77407n nVar) {
        this.f176437d = baseFinderFeed;
        this.f176438e = context;
        this.f176439f = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreateMMMenu(nj3.C76874e0 r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131821689(0x7f110479, float:1.9276128E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "getContext().resources.g…ring.app_share_to_weixin)"
            gy3.C87412m.m108593f(r2, r3)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131829897(0x7f112489, float:1.9292776E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "getContext().resources.g…ng.finder_share_timeline)"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "lxl object Status: "
            r4.append(r5)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r0.f176437d
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            int r5 = r5.objectStatus
            r4.append(r5)
            java.lang.String r5 = " isOnlySelfSee="
            r4.append(r5)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r0.f176437d
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            boolean r5 = r5.isOnlySelfSee()
            r4.append(r5)
            java.lang.String r5 = " isSelf="
            r4.append(r5)
            er1.j4 r5 = er1.C58739j4.f168176a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r0.f176437d
            boolean r6 = r5.mo83690S(r6)
            r4.append(r6)
            java.lang.String r6 = " objectStatus:"
            r4.append(r6)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r0.f176437d
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r6.objectDesc
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "FinderLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f176437d
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            boolean r4 = r4.isOnlySelfSee()
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x00bf
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f176437d
            boolean r4 = r5.mo83690S(r4)
            if (r4 == 0) goto L_0x00bf
            di3.d r2 = di3.C86312j.m106911c(r1)
            tf0.p1 r2 = (tf0.C64916p1) r2
            android.content.Context r3 = r0.f176438e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f176437d
            r5 = 2
            ok1.g$a r8 = new ok1.g$a
            qo3.n r9 = r0.f176439f
            r15 = r17
            r8.<init>(r15, r4, r3, r9)
            rx3.o r2 = r2.mo76708mv(r3, r4, r5, r8)
            A r3 = r2.f38557d
            java.lang.String r3 = (java.lang.String) r3
            B r2 = r2.f38558e
            java.lang.String r2 = (java.lang.String) r2
            r12 = r3
            r4 = 1
            r3 = r2
        L_0x00bd:
            r2 = 1
            goto L_0x00f2
        L_0x00bf:
            r15 = r17
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f176437d
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            boolean r4 = r4.isNotShareSns()
            if (r4 == 0) goto L_0x00d8
            r3 = 2131829839(0x7f11244f, float:1.9292658E38)
            java.lang.String r4 = "FinderSafeSelfSeeShare"
            java.lang.String r3 = r5.mo83724w(r4, r3)
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r0.f176437d
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            boolean r8 = r8.isNotShareConversation()
            if (r8 == 0) goto L_0x00f0
            r2 = 2131829838(0x7f11244e, float:1.9292656E38)
            java.lang.String r8 = "FinderSafeSelfSeeForward"
            java.lang.String r2 = r5.mo83724w(r8, r2)
            r12 = r2
            goto L_0x00bd
        L_0x00f0:
            r12 = r2
            r2 = 0
        L_0x00f2:
            ok1.e r5 = ok1.C62042e.f176370a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r0.f176437d
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            te3.c21 r8 = r8.getLiveInfo()
            if (r8 == 0) goto L_0x0103
            int r8 = r8.f182385X0
            goto L_0x0104
        L_0x0103:
            r8 = 0
        L_0x0104:
            boolean r5 = r5.mo87082h(r8)
            if (r5 == 0) goto L_0x012f
            r11 = 102(0x66, float:1.43E-43)
            r13 = 2131755655(0x7f100287, float:1.9142195E38)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r8 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r14 = r5.getColor(r8)
            r10 = r17
            r15 = r2
            r10.mo107150j(r11, r12, r13, r14, r15)
            r11 = 103(0x67, float:1.44E-43)
            r13 = 2131755285(0x7f100115, float:1.9141445E38)
            r14 = 0
            r12 = r3
            r15 = r4
            r10.mo107150j(r11, r12, r13, r14, r15)
        L_0x012f:
            di3.d r2 = di3.C86312j.m106911c(r1)
            tf0.p1 r2 = (tf0.C64916p1) r2
            android.content.Context r3 = r0.f176438e
            ht1.g4 r2 = r2.gr0(r3)
            if (r2 == 0) goto L_0x0150
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f176437d
            di3.d r4 = di3.C86312j.m106911c(r1)
            tf0.p1 r4 = (tf0.C64916p1) r4
            long r8 = r3.getItemId()
            int r2 = r2.mo12864t3()
            r4.mo76649AJ(r8, r2)
        L_0x0150:
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.p1 r1 = (tf0.C64916p1) r1
            android.content.Context r2 = r0.f176438e
            ht1.g4 r1 = r1.gr0(r2)
            if (r1 == 0) goto L_0x0175
            r2 = 0
            df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r6, r7, r2)
            if (r1 == 0) goto L_0x0175
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f176437d
            long r2 = r2.getItemId()
            df1.a$a r4 = new df1.a$a
            r5 = 16
            r4.<init>(r5, r2)
            r1.mo8766a(r4)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ok1.C62063g.onCreateMMMenu(nj3.e0):void");
    }
}
