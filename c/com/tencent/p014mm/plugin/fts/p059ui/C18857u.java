package com.tencent.p014mm.plugin.fts.p059ui;

import android.os.Looper;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import kg3.C76577a;
import kv1.C99260q;
import ov1.C21891f;
import pv1.C22019b;
import te3.C49404fb3;
import te3.C52241zb0;
import te3.pd4;

/* renamed from: com.tencent.mm.plugin.fts.ui.u */
public final class C18857u extends C18852m implements C21891f.C21893b {

    /* renamed from: n */
    public C21891f f52862n;

    /* renamed from: o */
    public final MMHandler f52863o = new MMHandler(Looper.getMainLooper());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18857u(C18854q qVar, int i) {
        super(qVar);
        C87412m.m108594g(qVar, "ftsBaseUIComponent");
        C21891f Ji0 = ((C99260q) C86312j.m106911c(C99260q.class)).Ji0(4208, mo23829h(), this, i);
        C87412m.m108593f(Ji0, "getService(IPluginFTS::c…ntext, this, searchScene)");
        this.f52862n = Ji0;
    }

    /* renamed from: a */
    public void mo23811a(C21891f fVar, String str, boolean z) {
        mo23833n(this.f52862n.mo17721d(0));
        notifyDataSetChanged();
        mo23831k(this.f52857g, true);
    }

    /* renamed from: d */
    public C22019b mo23812d(int i) {
        C22019b f = this.f52862n.mo17723f(i);
        C87412m.m108593f(f, "bizUIUnit.createDataItem(position)");
        return f;
    }

    /* renamed from: f */
    public void mo23813f() {
        this.f52862n.mo17725h(this.f52858h, this.f52863o, new HashSet(), 0);
    }

    /* renamed from: j */
    public boolean mo23814j(View view, C22019b bVar, boolean z) {
        return this.f52862n.mo17718b(view, bVar, z);
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        String str;
        super.onScroll(absListView, i, i2, i3);
        C18854q qVar = this.f52854d;
        if (qVar instanceof FTSBizDetailUI) {
            C87412m.m108592e(qVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSBizDetailUI");
            FTSBizDetailUI fTSBizDetailUI = (FTSBizDetailUI) qVar;
            C87412m.m108592e(absListView, "null cannot be cast to non-null type android.widget.ListView");
            ListView listView = (ListView) absListView;
            int headerViewsCount = listView.getHeaderViewsCount();
            C18857u uVar = fTSBizDetailUI.f52774p;
            C49404fb3 fb32 = fTSBizDetailUI.f52782x;
            if (uVar != null && fb32 != null) {
                View view = fTSBizDetailUI.f52777s;
                if (view != null && listView.getLastVisiblePosition() >= uVar.f52857g + headerViewsCount && view.getVisibility() == 0 && fTSBizDetailUI.f52772C == 1) {
                    int j = C76577a.m92159j(fTSBizDetailUI);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    if (view.getMeasuredHeight() + iArr[1] <= j) {
                        fTSBizDetailUI.f52772C = 2;
                        fTSBizDetailUI.mo23796U7(fb32, 2);
                    }
                }
                LinearLayout linearLayout = fTSBizDetailUI.f52779u;
                if (linearLayout != null && listView.getLastVisiblePosition() >= uVar.f52857g + headerViewsCount && linearLayout.getVisibility() == 0) {
                    int j2 = C76577a.m92159j(fTSBizDetailUI);
                    int childCount = linearLayout.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = linearLayout.getChildAt(i4);
                        int[] iArr2 = new int[2];
                        childAt.getLocationOnScreen(iArr2);
                        int measuredHeight = childAt.getMeasuredHeight() + iArr2[1];
                        Object tag = childAt.getTag();
                        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FTSRelatedSugItem");
                        C52241zb0 zb02 = (C52241zb0) tag;
                        if (measuredHeight <= j2) {
                            HashSet<String> hashSet = fTSBizDetailUI.f52771B;
                            pd4 pd4 = zb02.f145785d;
                            if (pd4 == null || (str = pd4.f139711e) == null) {
                                str = "";
                            }
                            if (hashSet.add(str)) {
                                fTSBizDetailUI.mo23795T7(zb02, fb32, 2);
                            }
                        }
                    }
                }
            }
        }
    }
}
