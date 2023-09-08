package ud0;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import rd0.C22222c;
import td0.C22478a;
import xd0.C23073a;

/* renamed from: ud0.h */
public final class C22642h extends C22478a {
    public C22642h() {
        super((C23073a) null);
    }

    /* renamed from: b */
    public void mo35361b(String str, List<SubscribeMsgTmpItem> list, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(list, "subscribeMsgList");
        Log.m105928w("MicroMsg.SubscribeMsgServiceProxy", "saveSubscribeMsgUiStatus not implemented in non-mm process");
    }

    /* renamed from: d */
    public void mo35363d(String str, String str2) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "templateId");
        Log.m105928w("MicroMsg.SubscribeMsgServiceProxy", "isTemplateMsgSubscribed not implemented in non-mm process");
    }

    /* renamed from: g */
    public void mo35366g(Context context, int i, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "nickname");
        Log.m105928w("MicroMsg.SubscribeMsgServiceProxy", "goToSettingManagerUI not implemented in non-mm process");
    }

    /* renamed from: l */
    public void mo35371l(Context context, String str, String str2, Bundle bundle) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bundle, "extra");
        super.mo35371l(context, str, str2, bundle);
    }

    /* renamed from: m */
    public void mo35372m(String str, SubscribeMsgTmpItem subscribeMsgTmpItem, C22222c.C22224b bVar) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(subscribeMsgTmpItem, "tmpItem");
        Log.m105928w("MicroMsg.SubscribeMsgServiceProxy", "switchSubscribeStatus not implemented in non-mm process");
    }

    /* renamed from: o */
    public void mo35374o(String str, boolean z) {
        C87412m.m108594g(str, "bizUsername");
        Log.m105928w("MicroMsg.SubscribeMsgServiceProxy", "updateLocalSwitchOpened not implemented in non-mm process");
    }

    /* renamed from: p */
    public void mo35375p(Context context, int i, int i2, String str, Bundle bundle) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "bizAppId");
        super.mo35375p(context, i, i2, str, bundle);
    }
}
