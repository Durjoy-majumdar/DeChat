package sj3;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.bizchat.BizChatFavUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;
import nj3.C76879j;
import rb0.C48009v0;
import sb0.C48334c;
import te3.C51960xe;

/* renamed from: sj3.m */
public class C48406m implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BizChatFavUI f129583d;

    public C48406m(BizChatFavUI bizChatFavUI) {
        this.f129583d = bizChatFavUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            BizChatFavUI bizChatFavUI = this.f129583d;
            long j = bizChatFavUI.f121363i;
            bizChatFavUI.getClass();
            Log.m105924i("MicroMsg.BizChatFavUI", "deleteFromFav");
            C48334c a0 = C48009v0.Ax0().mo73042a0(j);
            int i2 = a0.field_bitFlag & -9;
            a0.field_bitFlag = i2;
            Log.m105925i("MicroMsg.BizChatFavUI", "deleteFromFav:bitFlag %s", Integer.valueOf(i2));
            C51960xe xeVar = new C51960xe();
            xeVar.f144611d = a0.field_bizChatServId;
            xeVar.f144616i = a0.field_bitFlag;
            bizChatFavUI.f121367p = C76879j.m92723Q(bizChatFavUI, "", "", true, false, new C48403f(bizChatFavUI, C48009v0.yx0().mo73067m(a0.field_brandUserName, xeVar, bizChatFavUI)));
        }
    }
}
