package com.tencent.p014mm.plugin.fav.p047ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.MMTextInputUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import p749xh.C66261f3;
import pb1.C100718j1;
import pb1.C100739r1;
import pb1.C100755z;
import te3.C101836ry2;
import te3.C101854uy2;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavTextEditUI */
public class FavTextEditUI extends MMTextInputUI {
    /* renamed from: I7 */
    public void mo66593I7(CharSequence charSequence) {
        if (charSequence == null || Util.isNullOrNil(charSequence.toString())) {
            Log.m105928w("MicroMsg.FavTextEditUI", "text is null");
            return;
        }
        int intExtra = getIntent().getIntExtra("key_fav_item_id", -1);
        String charSequence2 = charSequence.toString();
        Class cls = C100718j1.class;
        if (intExtra <= 0) {
            Log.m105929w("MicroMsg.FavTextEditUI", "modEditText favid:%d", Integer.valueOf(intExtra));
            return;
        }
        LinkedList linkedList = new LinkedList();
        C101836ry2 ry22 = new C101836ry2();
        ry22.f299366d = 4;
        ry22.f299367e = 0;
        linkedList.add(ry22);
        LinkedList linkedList2 = new LinkedList();
        C101854uy2 uy22 = new C101854uy2();
        uy22.f299650d = "favitem.desc";
        uy22.f299652f = Util.nullAs(charSequence2, "");
        linkedList2.add(uy22);
        C101854uy2 uy23 = new C101854uy2();
        uy23.f299650d = "favitem.edittime";
        uy23.f299652f = String.valueOf(Util.nowSecond());
        linkedList2.add(uy23);
        C100755z qq = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq((long) intExtra);
        if (qq != null) {
            long nowSecond = Util.nowSecond();
            qq.field_edittime = nowSecond;
            qq.field_favProto.mo141213k(nowSecond);
            qq.field_favProto.mo141212j(Util.nullAs(charSequence2, ""));
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(qq, C66261f3.COL_LOCALID);
        }
        C86709a0.m107524d().mo123460f(new C100739r1(intExtra, linkedList, linkedList2, 0));
        C115669n.INSTANCE.mo160131h(10874, 1);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a6i;
    }

    public void onCreate(Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cnt);
    }
}
