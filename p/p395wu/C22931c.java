package p395wu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.msgsubscription.p017ui.BizSubscribeMsgManagerUI;
import gy3.C87412m;
import ke3.C88144b;
import td0.C22478a;
import xd0.C23076d;

/* renamed from: wu.c */
public final class C22931c extends C22478a {
    public C22931c(C23076d dVar) {
        super(dVar);
    }

    /* renamed from: g */
    public void mo35366g(Context context, int i, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "nickname");
        Intent intent = new Intent(context, BizSubscribeMsgManagerUI.class);
        intent.putExtra("key_biz_username", str);
        intent.putExtra("key_biz_nickname", str2);
        intent.putExtra("key_biz_presenter_class", "com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter");
        intent.putExtra("key_need_update", true);
        intent.putExtra("key_need_load_from_remote", true);
        intent.putExtra("key_enter_scene", i);
        C88144b.m109801s(context, "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI", intent, (Bundle) null);
    }
}
