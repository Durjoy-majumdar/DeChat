package com.tencent.p014mm.plugin.dbbackup;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import kj2.C117407d;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI$$c */
public class DBRecoveryUI$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DBRecoveryUI f345824d;

    /* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI$$c$a */
    public class C115380a implements DialogInterface.OnClickListener {
        public C115380a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C117407d.INSTANCE.idkeyStat(873, 25, 1, false);
            DBRecoveryUI dBRecoveryUI = DBRecoveryUI$$c.this.f345824d;
            int[] iArr = DBRecoveryUI.f345810q;
            dBRecoveryUI.mo175206J7();
        }
    }

    public DBRecoveryUI$$c(DBRecoveryUI dBRecoveryUI) {
        this.f345824d = dBRecoveryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C86709a0.m107535s().mo121148o() == null) {
            C76879j.m92738i(this.f345824d, C0966R.string.f360329bx1, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        DBRecoveryUI dBRecoveryUI = this.f345824d;
        if (dBRecoveryUI.f345817j != 0) {
            C76879j.m92741l(dBRecoveryUI, C0966R.string.bwu, 0, C0966R.string.bx5, C0966R.string.bwx, false, new C115380a(), (DialogInterface.OnClickListener) null, C0966R.color.f3113fp);
        } else {
            dBRecoveryUI.mo175206J7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/dbbackup/DBRecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
