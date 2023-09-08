package com.tencent.p014mm.plugin.finder.live.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C54492n;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorRoleUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dj1.C45381p0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8769g3;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import rx3.C13598b0;
import te3.C49747hs1;
import te3.C49890is1;
import te3.C50401mh0;
import tf1.C13914m;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC */
public final class FinderLiveVisitorGameRankSwitchUIC extends UIComponent implements C8769g3 {

    /* renamed from: d */
    public View f159987d;

    /* renamed from: e */
    public FinderRecyclerView f159988e;

    /* renamed from: f */
    public ProgressBar f159989f;

    /* renamed from: g */
    public C49890is1 f159990g;

    /* renamed from: h */
    public ArrayList<C56117b> f159991h = new ArrayList<>();

    /* renamed from: i */
    public long f159992i;

    /* renamed from: j */
    public long f159993j;

    /* renamed from: n */
    public boolean f159994n;

    /* renamed from: o */
    public final C32227p<C56117b, Boolean, C13598b0> f159995o;

    /* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$a */
    public static final class C56116a extends C60896i<C56117b> {

        /* renamed from: e */
        public final C32227p<C56117b, Boolean, C13598b0> f159996e;

        public C56116a(C32227p<? super C56117b, ? super Boolean, C13598b0> pVar) {
            C87412m.m108594g(pVar, "switchChangedCallback");
            this.f159996e = pVar;
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.agk;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C56117b bVar = (C56117b) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(bVar, "item");
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kba);
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) oVar.mo85812D(C0966R.C0970id.kav);
            Context context = oVar.f173499A;
            boolean z2 = true;
            Object[] objArr = new Object[1];
            String str = bVar.f159997d.f134840e;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            textView.setText(context.getString(C0966R.string.dnw, objArr));
            mMSwitchBtn.setCheck(bVar.f159997d.f134841f == 1);
            mMSwitchBtn.setEnabled(true);
            StringBuilder sb = new StringBuilder();
            sb.append("item ");
            sb.append(bVar.f159997d.f134840e);
            sb.append(": ");
            if (bVar.f159997d.f134841f != 1) {
                z2 = false;
            }
            sb.append(z2);
            Log.m105924i(C54492n.TAG, sb.toString());
            mMSwitchBtn.setSwitchListener(new C56119a(bVar, oVar, this, mMSwitchBtn));
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$b */
    public static final class C56117b implements C0740i2 {

        /* renamed from: d */
        public final C49747hs1 f159997d;

        public C56117b(C49747hs1 hs12) {
            C87412m.m108594g(hs12, "switchInfo");
            this.f159997d = hs12;
        }

        /* renamed from: c */
        public int mo75c() {
            return C56117b.class.hashCode();
        }

        /* renamed from: f */
        public int mo76f(C13914m mVar) {
            C87412m.m108594g(mVar, "obj");
            return -1;
        }

        public long getItemId() {
            String str = this.f159997d.f134839d;
            return (long) (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$c */
    public static final class C56118c extends C87413o implements C32227p<C56117b, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVisitorGameRankSwitchUIC f159998d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f159999e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56118c(FinderLiveVisitorGameRankSwitchUIC finderLiveVisitorGameRankSwitchUIC, AppCompatActivity appCompatActivity) {
            super(2);
            this.f159998d = finderLiveVisitorGameRankSwitchUIC;
            this.f159999e = appCompatActivity;
        }

        public Object invoke(Object obj, Object obj2) {
            C56117b bVar = (C56117b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(bVar, "item");
            ProgressBar progressBar = this.f159998d.f159989f;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            C49747hs1 hs12 = bVar.f159997d;
            hs12.f134841f = booleanValue ? 1 : 0;
            C45381p0.C45382a aVar = C45381p0.f122894u;
            String str = hs12.f134839d;
            if (str == null) {
                str = "";
            }
            C50401mh0 b = aVar.mo70896b(str, booleanValue);
            int i = this.f159999e instanceof FinderLiveVisitorRoleUI ? 1 : 2;
            FinderLiveVisitorGameRankSwitchUIC finderLiveVisitorGameRankSwitchUIC = this.f159998d;
            new C45381p0(finderLiveVisitorGameRankSwitchUIC.f159992i, finderLiveVisitorGameRankSwitchUIC.f159993j, i, b).mo9225i().mo123420E(new C56122c(this.f159998d, booleanValue, bVar));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorGameRankSwitchUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f159995o = new C56118c(this, appCompatActivity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            boolean r13 = r13 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorRoleUI
            r12.f159994n = r13
            zc1.b r13 = zc1.C66785b.f191882e
            bd1.e r13 = r13.mo90673n0()
            te3.sq2 r13 = r13.mo62398d()
            te3.is1 r13 = r13.f141686r
            r0 = 0
            if (r13 == 0) goto L_0x001f
            byte[] r13 = r13.toByteArray()
            goto L_0x0020
        L_0x001f:
            r13 = r0
        L_0x0020:
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r13)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x006c
            te3.is1 r1 = new te3.is1
            r1.<init>()
            byte[] r13 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r13)
            if (r13 != 0) goto L_0x0039
        L_0x0037:
            r1 = r0
            goto L_0x004a
        L_0x0039:
            r1.parseFrom(r13)     // Catch:{ Exception -> 0x003d }
            goto L_0x004a
        L_0x003d:
            r13 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r13
            java.lang.String r13 = "safeParser"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r13, r4, r1)
            goto L_0x0037
        L_0x004a:
            r12.f159990g = r1
            if (r1 == 0) goto L_0x006c
            java.lang.String r13 = "SimpleUIComponent_get"
            java.util.LinkedList<te3.hs1> r1 = r1.f135633d
            if (r1 == 0) goto L_0x006c
            java.util.Iterator r1 = r1.iterator()
        L_0x0058:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r1.next()
            te3.hs1 r4 = (te3.C49747hs1) r4
            if (r4 == 0) goto L_0x0058
            er1.h1 r5 = er1.C58733h1.f168170a
            r5.mo83653a(r4, r13)
            goto L_0x0058
        L_0x006c:
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.content.Intent r13 = r13.getIntent()
            java.lang.String r1 = "LIVE_ID"
            r4 = 0
            long r6 = r13.getLongExtra(r1, r4)
            r12.f159992i = r6
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            android.content.Intent r13 = r13.getIntent()
            java.lang.String r1 = "OBJECT_ID"
            long r4 = r13.getLongExtra(r1, r4)
            r12.f159993j = r4
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131307586(0x7f092c42, float:1.8233404E38)
            android.view.View r13 = r13.findViewById(r1)
            r12.f159987d = r13
            androidx.appcompat.app.AppCompatActivity r13 = r12.getActivity()
            r1 = 2131307587(0x7f092c43, float:1.8233406E38)
            android.view.View r13 = r13.findViewById(r1)
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r13 = (com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView) r13
            r12.f159988e = r13
            r13 = 2131308040(0x7f092e08, float:1.8234324E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13
            r12.f159989f = r13
            te3.is1 r13 = r12.f159990g
            if (r13 == 0) goto L_0x0177
            if (r13 == 0) goto L_0x00c7
            java.util.LinkedList<te3.hs1> r13 = r13.f135633d
            if (r13 == 0) goto L_0x00c7
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x00c7
            r13 = 1
            goto L_0x00c8
        L_0x00c7:
            r13 = 0
        L_0x00c8:
            if (r13 != 0) goto L_0x00cc
            goto L_0x0177
        L_0x00cc:
            android.view.View r13 = r12.f159987d
            if (r13 != 0) goto L_0x00d1
            goto L_0x0111
        L_0x00d1:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r4)
            java.lang.Object[] r5 = r1.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorGameRankSwitchUIC"
            java.lang.String r7 = "onCreate"
            java.lang.String r8 = "(Landroid/os/Bundle;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r13
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r13.setVisibility(r1)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorGameRankSwitchUIC"
            java.lang.String r6 = "onCreate"
            java.lang.String r7 = "(Landroid/os/Bundle;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0111:
            te3.is1 r13 = r12.f159990g
            if (r13 == 0) goto L_0x0117
            java.util.LinkedList<te3.hs1> r0 = r13.f135633d
        L_0x0117:
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r13 = r12.f159988e
            if (r0 == 0) goto L_0x01be
            if (r13 == 0) goto L_0x01be
            java.util.Iterator r0 = r0.iterator()
        L_0x0121:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x013d
            java.lang.Object r1 = r0.next()
            te3.hs1 r1 = (te3.C49747hs1) r1
            java.util.ArrayList<com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$b> r4 = r12.f159991h
            com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$b r5 = new com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$b
            java.lang.String r6 = "it"
            gy3.C87412m.m108593f(r1, r6)
            r5.<init>(r1)
            r4.add(r5)
            goto L_0x0121
        L_0x013d:
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r0 = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            r0.<init>(r1)
            r13.setLayoutManager(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$onCreate$1$2 r1 = new com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$onCreate$1$2
            r1.<init>(r12)
            java.util.ArrayList<com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$b> r4 = r12.f159991h
            r0.<init>(r1, r4, r3)
            r13.setAdapter(r0)
            androidx.recyclerview.widget.m r0 = new androidx.recyclerview.widget.m
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            r0.<init>(r1, r2)
            androidx.appcompat.app.AppCompatActivity r1 = r12.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131232455(0x7f0806c7, float:1.808102E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.mo128j(r1)
            r13.mo17085h0(r0)
            goto L_0x01be
        L_0x0177:
            android.view.View r2 = r12.f159987d
            if (r2 != 0) goto L_0x017c
            goto L_0x01be
        L_0x017c:
            r13 = 8
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0.mo10233c(r13)
            java.lang.Object[] r5 = r0.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorGameRankSwitchUIC"
            java.lang.String r7 = "onCreate"
            java.lang.String r8 = "(Landroid/os/Bundle;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = r0.mo10231a(r3)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r2.setVisibility(r13)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorGameRankSwitchUIC"
            java.lang.String r4 = "onCreate"
            java.lang.String r5 = "(Landroid/os/Bundle;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x01be:
            boolean r13 = r12.f159994n
            if (r13 == 0) goto L_0x01d8
            java.lang.Class<ak1.w> r13 = ak1.C54116w.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            java.lang.String r0 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r13, r0)
            r1 = r13
            ak1.w r1 = (ak1.C54116w) r1
            r2 = 4
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            ak1.C54116w.dy0(r1, r2, r3, r4, r5, r6)
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC.onCreate(android.os.Bundle):void");
    }
}
