package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85811a5;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.QBFileMenuBottomSheetHelper;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C76874e0;
import p262wm.C22923f;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.i1 */
public final class C19564i1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ QBFileMenuBottomSheetHelper f55373d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f55374e;

    public C19564i1(QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper, C77407n nVar) {
        this.f55373d = qBFileMenuBottomSheetHelper;
        this.f55374e = nVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper = this.f55373d;
        C87412m.m108593f(e0Var, "menu");
        qBFileMenuBottomSheetHelper.getClass();
        if (C85875k4.m106197n0() && (C85875k4.m106208w() || C85985z2.m106332d(qBFileMenuBottomSheetHelper.f55282a.getTaskId()))) {
            C85811a5.m106025b(qBFileMenuBottomSheetHelper.f55282a);
            if (C85875k4.m106209x(qBFileMenuBottomSheetHelper.f55282a.getTaskId())) {
                QBFileMenuBottomSheetHelper.C19539b[] bVarArr = QBFileMenuBottomSheetHelper.C19539b.f55293e;
                e0Var.mo107144g(6, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.bfn), C0966R.raw.icons_outlined_merge);
            } else {
                QBFileMenuBottomSheetHelper.C19539b[] bVarArr2 = QBFileMenuBottomSheetHelper.C19539b.f55293e;
                e0Var.mo107144g(6, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.f361404jm3), C0966R.raw.icons_outlined_sperated);
            }
        }
        QBFileMenuBottomSheetHelper.C19539b[] bVarArr3 = QBFileMenuBottomSheetHelper.C19539b.f55293e;
        e0Var.mo107146h(7, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mtc), C0966R.raw.icons_outlined_multitask, qBFileMenuBottomSheetHelper.f55282a.getResources().getColor(C0966R.color.FG_0));
        e0Var.mo107146h(8, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mth), C0966R.raw.icons_outlined_download, qBFileMenuBottomSheetHelper.f55282a.getResources().getColor(C0966R.color.FG_0));
        if (qBFileMenuBottomSheetHelper.f55283b.f55387j) {
            e0Var.mo107146h(9, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mtg), C0966R.raw.icons_outlined_search, qBFileMenuBottomSheetHelper.f55282a.getResources().getColor(C0966R.color.FG_0));
        }
        if (!((C22923f) C86312j.m106911c(C22923f.class)).mo35898Db(qBFileMenuBottomSheetHelper.f55282a) && qBFileMenuBottomSheetHelper.f55283b.f55388k) {
            e0Var.mo107146h(10, qBFileMenuBottomSheetHelper.f55282a.getString(C0966R.string.mtd), C85875k4.m106211z() ? C0966R.raw.icons_filled_more3_night : C0966R.raw.icons_filled_more3, 0);
        }
        C32227p<? super C77407n, ? super C76874e0, C13598b0> pVar = this.f55373d.f55288g;
        if (pVar != null) {
            pVar.invoke(this.f55374e, e0Var);
        }
    }
}
