package ck2;

import android.content.Intent;
import android.view.View;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import ke3.C88144b;
import nj2.C61768p;
import sx3.C110818d0;
import wj2.C66128a;

/* renamed from: ck2.k */
public final class C0648k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RingtoneExclusiveMainUIC f1535d;

    public C0648k(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
        this.f1535d = ringtoneExclusiveMainUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$refreshAddUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i(C54492n.TAG, "on click add ui link to add new ringtone");
        RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC = this.f1535d;
        ringtoneExclusiveMainUIC.getClass();
        Intent intent = new Intent();
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219161b & -65);
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", ringtoneExclusiveMainUIC.getString(C0966R.string.iry));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) C61768p.m72479g()).iterator();
        while (it.hasNext()) {
            String str = ((C66128a) it.next()).f190060e;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        arrayList2.add(C75592q0.m90789s());
        intent.putExtra("block_contact", C110818d0.m150921S(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0647j.f1534d, 30, (Object) null));
        C88144b.m109802t(ringtoneExclusiveMainUIC.getActivity(), ".ui.contact.SelectContactUI", intent, 8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$refreshAddUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
