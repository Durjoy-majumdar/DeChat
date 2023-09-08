package n32;

import android.content.Intent;
import l32.C76668c;

/* renamed from: n32.m */
public class C76830m implements C76668c {

    /* renamed from: a */
    public final /* synthetic */ C76828l f224651a;

    public C76830m(C76828l lVar) {
        this.f224651a = lVar;
    }

    /* renamed from: a */
    public void mo106933a(int i, Intent intent) {
        Intent putExtra = new Intent().putExtra("sendId", this.f224651a.f224647f.f141141e);
        if (i == -1) {
            putExtra.putExtra("result_share_msg", true);
        } else {
            putExtra.putExtra("result_share_msg", false);
        }
        C76828l lVar = this.f224651a;
        lVar.f224648g = false;
        C76818c cVar = lVar.f224645d;
        if (cVar != null) {
            cVar.mo106931T1(-1, putExtra);
        }
    }
}
