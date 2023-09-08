package kf1;

import android.os.SystemClock;
import cm1.C39994x1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import f40.C86709a0;
import fo1.C59264a;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46513c4;
import je1.C46542v2;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe1.C35464c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51238sg0;
import te3.C51324t02;
import te3.C51475u02;
import te3.C51541ug0;
import up1.C37521f;

/* renamed from: kf1.t6 */
public final class C46704t6 implements C59264a<C46697b7>, C11385n {

    /* renamed from: d */
    public final String f125728d;

    /* renamed from: e */
    public final C49712hj1 f125729e;

    /* renamed from: f */
    public C46697b7 f125730f;

    /* renamed from: g */
    public C89349b f125731g;

    /* renamed from: h */
    public final ArrayList<C39994x1> f125732h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<C39994x1> f125733i = new ArrayList<>();

    /* renamed from: j */
    public boolean f125734j;

    /* renamed from: n */
    public long f125735n = SystemClock.uptimeMillis();

    /* renamed from: o */
    public boolean f125736o = true;

    /* renamed from: p */
    public boolean f125737p = true;

    /* renamed from: kf1.t6$a */
    public static final class C46705a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C46704t6 f125738d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C39994x1> f125739e;

        public C46705a(C46704t6 t6Var, ArrayList<C39994x1> arrayList) {
            this.f125738d = t6Var;
            this.f125739e = arrayList;
        }

        public final void run() {
            C46704t6 t6Var = this.f125738d;
            ArrayList<C39994x1> arrayList = this.f125739e;
            boolean z = t6Var.f125734j;
            int size = z ? t6Var.f125732h.size() : t6Var.f125733i.size() + 1;
            int size2 = arrayList.size();
            if (t6Var.f125737p) {
                t6Var.f125737p = false;
                size = -1;
                size2 = -1;
            }
            t6Var.f125732h.addAll(arrayList);
            C46697b7 b7Var = t6Var.f125730f;
            if (b7Var != null) {
                b7Var.mo71950v(z, size, size2);
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    /* renamed from: kf1.t6$b */
    public static final class C46706b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<Runnable> f125740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46706b(C8479f0<Runnable> f0Var) {
            super(0);
            this.f125740d = f0Var;
        }

        public Object invoke() {
            Runnable runnable = (Runnable) this.f125740d.f27484d;
            if (runnable != null) {
                runnable.run();
            }
            return C13598b0.f38549a;
        }
    }

    public C46704t6(String str, C49712hj1 hj12) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(hj12, "currentReportObj");
        this.f125728d = str;
        this.f125729e = hj12;
    }

    /* renamed from: e */
    public final void mo71952e(boolean z, int i) {
        this.f125735n = SystemClock.uptimeMillis();
        this.f125734j = z;
        C86709a0.m107524d().mo123460f(new C46513c4(this.f125728d, this.f125731g, i, this.f125729e));
    }

    /* renamed from: n */
    public final ArrayList<C39994x1> mo71953n(LinkedList<C51238sg0> linkedList, int i) {
        ArrayList<C39994x1> arrayList = new ArrayList<>();
        if (linkedList != null) {
            for (C51238sg0 x1Var : linkedList) {
                arrayList.add(new C39994x1(x1Var, 2, i));
            }
        }
        return arrayList;
    }

    public void onDetach() {
        C86709a0.m107524d().mo123470p(6850, this);
        C86709a0.m107524d().mo123470p(6495, this);
        C86709a0.m107524d().mo123470p(4078, this);
        this.f125733i.clear();
        this.f125732h.clear();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        long j;
        StringBuilder sb = new StringBuilder();
        sb.append("errType ");
        sb.append(i);
        sb.append(", errCode ");
        sb.append(i2);
        sb.append(", errMsg ");
        sb.append(str);
        sb.append(" scene type ");
        sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
        Log.m105924i("Finder.FinderPoiManageUIContract", sb.toString());
        if (!(yVar != null && yVar.getType() == 6495)) {
            if (yVar != null && yVar.getType() == 4078) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("errType ");
                sb4.append(i);
                sb4.append(", errCode ");
                sb4.append(i2);
                sb4.append(", errMsg ");
                sb4.append(str);
                sb4.append(" scene type ");
                sb4.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
                Log.m105924i("MMFinderFunc_FinderBindPoiStream", sb4.toString());
                boolean z = yVar instanceof C46542v2;
                if (z && i2 < 0) {
                    String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.eh6);
                    C87412m.m108593f(string, "getContext().resources.g…nder_poi_bind_submit_err)");
                    switch (i2) {
                        case -5853:
                            string = MMApplicationContext.getContext().getResources().getString(C0966R.string.eh6);
                            C87412m.m108593f(string, "getContext().resources.g…nder_poi_bind_submit_err)");
                            break;
                        case -5852:
                            string = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360739eh3);
                            C87412m.m108593f(string, "getContext().resources.g…oi_bind_account_info_err)");
                            break;
                        case -5851:
                            string = MMApplicationContext.getContext().getResources().getString(C0966R.string.eh4);
                            C87412m.m108593f(string, "getContext().resources.g….finder_poi_bind_already)");
                            break;
                        case -5850:
                            string = MMApplicationContext.getContext().getResources().getString(C0966R.string.eh5);
                            C87412m.m108593f(string, "getContext().resources.g…g.finder_poi_bind_failed)");
                            break;
                    }
                    C76912y0.m92773l(MMApplicationContext.getContext(), string);
                } else if (i == 0 && i2 == 0 && z) {
                    C46542v2 v2Var = (C46542v2) yVar;
                    C47465a aVar = v2Var.f125407g.f127056b.f127083a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBindPoiResponse");
                    LinkedList<C51238sg0> linkedList = ((C51541ug0) aVar).f142846d;
                    boolean z2 = linkedList != null ? !linkedList.isEmpty() : false;
                    if (this.f125733i.isEmpty()) {
                        if (z2) {
                            ArrayList<C39994x1> arrayList = this.f125733i;
                            C39994x1 x1Var = new C39994x1(new C51238sg0(), 1, 1);
                            x1Var.f107218f = 1;
                            arrayList.add(x1Var);
                            ArrayList<C39994x1> arrayList2 = this.f125733i;
                            C47465a aVar2 = v2Var.f125407g.f127056b.f127083a;
                            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBindPoiResponse");
                            arrayList2.addAll(mo71953n(((C51541ug0) aVar2).f142846d, 1));
                            this.f125732h.addAll(0, this.f125733i);
                            C46697b7 b7Var = this.f125730f;
                            if (b7Var != null) {
                                b7Var.mo71950v(false, 0, this.f125733i.size());
                            } else {
                                C87412m.m108603p("viewCallback");
                                throw null;
                            }
                        }
                    } else if (z2) {
                        C47465a aVar3 = v2Var.f125407g.f127056b.f127083a;
                        C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBindPoiResponse");
                        ArrayList<C39994x1> n = mo71953n(((C51541ug0) aVar3).f142846d, 1);
                        this.f125732h.addAll(1, n);
                        C46697b7 b7Var2 = this.f125730f;
                        if (b7Var2 != null) {
                            b7Var2.mo71950v(false, 1, n.size());
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                }
            } else {
                C8479f0 f0Var = new C8479f0();
                if (i == 0 && i2 == 0) {
                    if (yVar instanceof C46513c4) {
                        C46513c4 c4Var = (C46513c4) yVar;
                        C47465a aVar4 = c4Var.f125310h.f127055a.f127080a;
                        C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListRequest");
                        if (!C87412m.m108589b(this.f125731g, ((C51324t02) aVar4).f141881f)) {
                            Log.m105924i("Finder.FinderPoiManageUIContract", "not my buf, ignore!");
                            return;
                        }
                        C47465a aVar5 = c4Var.f125310h.f127056b.f127083a;
                        C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                        this.f125736o = ((C51475u02) aVar5).f142530f != 0;
                        C47465a aVar6 = c4Var.f125310h.f127056b.f127083a;
                        C87412m.m108592e(aVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                        this.f125731g = ((C51475u02) aVar6).f142529e;
                        C47465a aVar7 = c4Var.f125310h.f127056b.f127083a;
                        C87412m.m108592e(aVar7, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                        ArrayList<C39994x1> n2 = mo71953n(((C51475u02) aVar7).f142528d, c4Var.f125309g);
                        Log.m105924i("Finder.FinderPoiManageUIContract", "newData： " + c4Var.f125309g + ", " + n2 + ", " + n2.size());
                        int i3 = c4Var.f125309g;
                        if (i3 == 1) {
                            if (this.f125733i.isEmpty() && (!n2.isEmpty())) {
                                ArrayList<C39994x1> arrayList3 = this.f125733i;
                                C39994x1 x1Var2 = new C39994x1(new C51238sg0(), 1, c4Var.f125309g);
                                x1Var2.f107218f = 1;
                                arrayList3.add(x1Var2);
                            }
                            this.f125733i.addAll(n2);
                            if (this.f125736o) {
                                mo71952e(true, 1);
                                return;
                            }
                            Log.m105924i("Finder.FinderPoiManageUIContract", "init audit data done, " + this.f125733i.size());
                            this.f125732h.addAll(this.f125733i);
                            mo71952e(false, 2);
                            return;
                        }
                        if (i3 == 2 && this.f125737p && (!n2.isEmpty())) {
                            ArrayList<C39994x1> arrayList4 = this.f125732h;
                            C39994x1 x1Var3 = new C39994x1(new C51238sg0(), 1, c4Var.f125309g);
                            x1Var3.f107218f = 2;
                            arrayList4.add(x1Var3);
                        }
                        f0Var.f27484d = new C46705a(this, n2);
                    }
                    long uptimeMillis = SystemClock.uptimeMillis() - this.f125735n;
                    if (!this.f125734j) {
                        C37521f.f99374d.getClass();
                        C35464c<Long> cVar = C37521f.f99343Z1;
                        if (uptimeMillis < cVar.mo60266n().longValue()) {
                            j = cVar.mo60266n().longValue() - uptimeMillis;
                            C61926c.m72666K(j, new C46706b(f0Var));
                            return;
                        }
                    }
                    j = 0;
                    C61926c.m72666K(j, new C46706b(f0Var));
                    return;
                }
                Log.m105924i("Finder.FinderPoiManageUIContract", "net error");
                C46697b7 b7Var3 = this.f125730f;
                if (b7Var3 != null) {
                    RefreshLoadMoreLayout.C7080c cVar2 = new RefreshLoadMoreLayout.C7080c(0);
                    cVar2.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.esr);
                    cVar2.f24947b = -1;
                    RefreshLoadMoreLayout refreshLoadMoreLayout = b7Var3.f125717f;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.mo82443I(cVar2);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
        }
    }
}
