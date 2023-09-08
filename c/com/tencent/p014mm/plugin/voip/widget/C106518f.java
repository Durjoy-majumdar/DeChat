package com.tencent.p014mm.plugin.voip.widget;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.voip.widget.f */
public class C106518f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipScoreDialog f318235d;

    /* renamed from: com.tencent.mm.plugin.voip.widget.f$a */
    public class C106519a implements C75018a.C75025e {
        public C106519a() {
        }

        /* renamed from: a */
        public void mo6958a() {
        }

        public void onHide() {
            C106518f.this.f318235d.finish();
        }

        public void onShow() {
        }
    }

    public C106518f(VoipScoreDialog voipScoreDialog) {
        this.f318235d = voipScoreDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        VoipScoreDialog.m143781H7(this.f318235d, 3);
        VoipScoreDialog voipScoreDialog = this.f318235d;
        C75026b.m89952b(voipScoreDialog, (View) null, voipScoreDialog.getString(C0966R.string.kik), new C106519a());
        C77398g gVar = this.f318235d.f318203g;
        if (gVar != null) {
            gVar.dismiss();
        }
    }
}
