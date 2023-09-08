package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import nj3.C76879j;
import qo3.C77398g;
import te3.C52159yr2;
import te3.C52299zr2;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.b */
public class C43337b {

    /* renamed from: a */
    public Context f117200a;

    /* renamed from: b */
    public C77398g f117201b = null;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.b$a */
    public class C43338a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final C52299zr2 f117202d;

        /* renamed from: e */
        public final Context f117203e;

        /* renamed from: f */
        public final C43339b f117204f;

        public C43338a(Context context, C52299zr2 zr22, C43339b bVar) {
            this.f117203e = context;
            this.f117202d = zr22;
            this.f117204f = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Context context;
            C43337b.this.f117201b = null;
            C52299zr2 zr22 = this.f117202d;
            if (zr22 == null || (context = this.f117203e) == null) {
                Log.m105928w("MicroMsg.LqtDialogHelper", "LqtDialogBtn or context is null");
                return;
            }
            int i2 = zr22.f146193e;
            if (i2 == 2) {
                C75228t.m90219L(context, zr22.f146194f, true);
            } else if (i2 == 3) {
                C75228t.m90224Q(zr22.f146195g, zr22.f146196h, 0, 1061);
            } else if (i2 == 4) {
                Log.m105924i("MicroMsg.LqtDialogHelper", "continue action");
            } else {
                Log.m105924i("MicroMsg.LqtDialogHelper", "jump type not support native or none");
            }
            C43339b bVar = this.f117204f;
            if (bVar != null) {
                int i3 = this.f117202d.f146193e;
                C43343g2 g2Var = (C43343g2) bVar;
                if (i3 == 2 || i3 == 3) {
                    WalletLqtSaveFetchUI.this.f208170R0 = true;
                } else if (i3 == 4) {
                    WalletLqtSaveFetchUI.this.f208193f.mo98809a();
                } else {
                    g2Var.getClass();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.b$b */
    public interface C43339b {
    }

    public C43337b(Context context) {
        this.f117200a = context;
    }

    /* renamed from: a */
    public void mo67549a(C52159yr2 yr22, C43339b bVar) {
        if (yr22 == null || this.f117200a == null) {
            Log.m105928w("MicroMsg.LqtDialogHelper", "dialog or context is null");
            return;
        }
        int i = yr22.f145479e;
        if (i == 1) {
            if (yr22.f145480f == null) {
                Log.m105928w("MicroMsg.LqtDialogHelper", "dialog center_btn is null");
                return;
            }
            C77398g gVar = this.f117201b;
            if (gVar == null || !gVar.isShowing()) {
                Context context = this.f117200a;
                String str = yr22.f145478d;
                C52299zr2 zr22 = yr22.f145480f;
                this.f117201b = C76879j.m92711E(context, str, "", zr22.f146192d, false, new C43338a(context, zr22, bVar));
                return;
            }
            Log.m105924i("MicroMsg.LqtDialogHelper", "old dialog is exits");
        } else if (i != 2) {
            Log.m105928w("MicroMsg.LqtDialogHelper", "unknown dialog type");
        } else if (yr22.f145482h == null || yr22.f145481g == null) {
            Log.m105928w("MicroMsg.LqtDialogHelper", "dialog right_btn or left_btn is null");
        } else {
            C77398g gVar2 = this.f117201b;
            if (gVar2 == null || !gVar2.isShowing()) {
                Context context2 = this.f117200a;
                String str2 = yr22.f145478d;
                C52299zr2 zr23 = yr22.f145482h;
                String str3 = zr23.f146192d;
                C52299zr2 zr24 = yr22.f145481g;
                this.f117201b = C76879j.m92709C(context2, str2, "", str3, zr24.f146192d, false, new C43338a(context2, zr23, bVar), new C43338a(context2, zr24, bVar));
                return;
            }
            Log.m105924i("MicroMsg.LqtDialogHelper", "old dialog is exits");
        }
    }
}
