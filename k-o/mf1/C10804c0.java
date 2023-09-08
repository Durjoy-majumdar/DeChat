package mf1;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import fy3.C32226l;
import go1.C8366a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import pf1.C11920q;
import rf1.C12982a;
import rx3.C13598b0;

/* renamed from: mf1.c0 */
public class C10804c0 extends C12982a {

    /* renamed from: mf1.c0$a */
    public static final class C10805a implements View.OnClickListener {

        /* renamed from: d */
        public static final C10805a f32292d = new C10805a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FeedJumperLiveNoticeObserver$onBindView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLiveNoticeObserver$onBindView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mf1.c0$b */
    public static final class C10806b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C11920q f32293d;

        /* renamed from: e */
        public final /* synthetic */ C10804c0 f32294e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f32295f;

        /* renamed from: g */
        public final /* synthetic */ View f32296g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10806b(C11920q qVar, C10804c0 c0Var, C60905o oVar, View view) {
            super(1);
            this.f32293d = qVar;
            this.f32294e = c0Var;
            this.f32295f = oVar;
            this.f32296g = view;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C11920q qVar = this.f32293d;
            qVar.f34824B = booleanValue;
            this.f32294e.mo11090l(this.f32295f, this.f32296g, qVar);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11020b(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r10, jq3.C60905o r11, android.view.View r12, pf1.C11920q r13, java.lang.String r14) {
        /*
            r9 = this;
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r10 = "holder"
            gy3.C87412m.m108594g(r11, r10)
            java.lang.String r10 = "jumpView"
            gy3.C87412m.m108594g(r12, r10)
            java.lang.String r10 = "infoEx"
            gy3.C87412m.m108594g(r13, r10)
            java.lang.String r10 = "source"
            gy3.C87412m.m108594g(r14, r10)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r10 = r13.f34827a
            r14 = 2131302873(0x7f0919d9, float:1.8223844E38)
            android.view.View r14 = r12.findViewById(r14)
            r0 = r14
            com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r0 = (com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView) r0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r14 = r13.f34827a
            r1 = 0
            if (r14 == 0) goto L_0x0054
            java.util.LinkedList<te3.uc4> r14 = r14.style
            if (r14 == 0) goto L_0x0054
            java.util.Iterator r14 = r14.iterator()
        L_0x0033:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r14.next()
            r3 = r2
            te3.uc4 r3 = (te3.uc4) r3
            int r3 = r3.f142762h
            r4 = 14
            if (r3 != r4) goto L_0x0048
            r3 = 1
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            if (r3 == 0) goto L_0x0033
            goto L_0x004d
        L_0x004c:
            r2 = r1
        L_0x004d:
            te3.uc4 r2 = (te3.uc4) r2
            if (r2 == 0) goto L_0x0054
            te3.rp2 r14 = r2.f142755L
            goto L_0x0055
        L_0x0054:
            r14 = r1
        L_0x0055:
            if (r14 == 0) goto L_0x005b
            te3.d51 r14 = r14.f141072d
            r2 = r14
            goto L_0x005c
        L_0x005b:
            r2 = r1
        L_0x005c:
            java.lang.String r14 = "info"
            gy3.C87412m.m108594g(r10, r14)
            go1.c r14 = go1.C8368c.f27352a
            int r3 = r11.hashCode()
            go1.a r4 = r9.mo11037g(r10)
            boolean r3 = r14.mo9335b(r3, r4)
            r6 = 8
            if (r3 != 0) goto L_0x007e
            r9.mo12512t(r6)
            java.lang.String r10 = "Finder.FeedJumperLiveNoticeObserver"
            java.lang.String r11 = "[onBindView] priority not ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            return
        L_0x007e:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r13.f34830d
            if (r3 == 0) goto L_0x008e
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
            if (r4 == 0) goto L_0x008e
            java.lang.String r4 = r4.getUserName()
            if (r4 != 0) goto L_0x0090
        L_0x008e:
            java.lang.String r4 = ""
        L_0x0090:
            if (r0 == 0) goto L_0x00db
            mf1.c0$a r5 = mf1.C10804c0.C10805a.f32292d
            r12.setOnClickListener(r5)
            mf1.c0$b r5 = new mf1.c0$b
            r5.<init>(r13, r9, r11, r12)
            r0.setClickBtnCall(r5)
            java.lang.Class<ht1.v4> r13 = ht1.C8808v4.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ht1.v4 r13 = (ht1.C8808v4) r13
            boolean r13 = r13.mo9635e()
            if (r13 != 0) goto L_0x00d1
            if (r2 == 0) goto L_0x00cb
            android.content.Context r13 = r11.f173499A
            java.lang.String r5 = "holder.context"
            gy3.C87412m.m108593f(r13, r5)
            r5 = 1
            if (r3 == 0) goto L_0x00c1
            long r7 = r3.getItemId()
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
        L_0x00c1:
            r7 = r1
            r1 = r13
            r3 = r4
            r4 = r5
            r5 = r7
            r0.mo4524b(r1, r2, r3, r4, r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00cb:
            if (r1 != 0) goto L_0x00d4
            r9.mo12512t(r6)
            goto L_0x00d4
        L_0x00d1:
            r9.mo12512t(r6)
        L_0x00d4:
            go1.a r10 = r9.mo11037g(r10)
            r14.mo9337d(r11, r12, r10)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mf1.C10804c0.mo11020b(com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o, android.view.View, pf1.q, java.lang.String):void");
    }

    /* renamed from: g */
    public C8366a mo11037g(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "info");
        return finderJumpInfo.business_type == 2 ? C8366a.AD_HARD : C8366a.LIVE_NOTICE;
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        return true;
    }
}
