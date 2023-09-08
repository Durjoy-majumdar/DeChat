package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C53934p0;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bl3.C0317e;
import cm1.C0742j2;
import cm1.C0765p2;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import nj3.C11184p0;
import nj3.C76912y0;
import ot1.C11767a;
import p140cw.C7138g;
import qo3.C47883u;
import qo3.C77426q;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.finder.ui.k2 */
public final class C3849k2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C3866n2 f17387d;

    /* renamed from: com.tencent.mm.plugin.finder.ui.k2$a */
    public static final class C3850a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C3866n2 f17388a;

        public C3850a(C3866n2 n2Var) {
            this.f17388a = n2Var;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            Log.m105924i("Finder.SelectCoverHelper", "ITEM_ID_CLEAR_PHOTO bOk：" + z);
            if (z) {
                C3866n2 n2Var = this.f17388a;
                n2Var.mo4205d();
                C0742j2 j2Var = n2Var.f17412c;
                C3861m2 m2Var = new C3861m2(n2Var);
                j2Var.getClass();
                C0317e.launch$default(j2Var, (C66212f) null, (C53934p0) null, new C0765p2(j2Var, m2Var, (C15601d<? super C0765p2>) null), 3, (Object) null);
                return;
            }
            Log.m105924i("Finder.SelectCoverHelper", "ITEM_ID_CLEAR_PHOTO 取消");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.k2$b */
    public static final class C3851b implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public static final C3851b f17389d = new C3851b();

        public final void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("Finder.SelectCoverHelper", "ITEM_ID_CLEAR_PHOTO dismiss");
        }
    }

    public C3849k2(C3866n2 n2Var) {
        this.f17387d = n2Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        switch (menuItem.getItemId()) {
            case 4000:
                C3866n2.m4068a(this.f17387d, false);
                return;
            case 4001:
                if (!C11767a.f34453a.mo11659a("personalInfo")) {
                    C3866n2 n2Var = this.f17387d;
                    n2Var.getClass();
                    if (!C86709a0.m107535s().mo121147n()) {
                        C76912y0.m92771j(n2Var.f17410a, (View) null);
                        return;
                    } else {
                        ((C7138g) C86312j.m106911c(C7138g.class)).mo8316Ya(n2Var.f17410a, 2001);
                        return;
                    }
                } else {
                    return;
                }
            case 4002:
                C3866n2.m4068a(this.f17387d, true);
                return;
            case WearableStatusCodes.DATA_ITEM_TOO_LARGE /*4003*/:
                C77426q qVar = new C77426q(this.f17387d.f17410a);
                C3866n2 n2Var2 = this.f17387d;
                qVar.mo107595g(n2Var2.f17410a.getResources().getString(C0966R.string.d3d));
                qVar.mo107589a(true);
                qVar.mo107590b(new C3850a(n2Var2));
                qVar.mo107593e(C3851b.f17389d);
                qVar.mo107603o();
                return;
            default:
                return;
        }
    }
}
