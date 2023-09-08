package com.tencent.kinda.framework.module.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KHoneyPayService;
import com.tencent.kinda.gen.VoidStringCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import ie3.C76324c;
import ke3.C88144b;
import kotlin.Metadata;
import t02.C48527c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaHoneyPayService;", "Lcom/tencent/kinda/gen/KHoneyPayService;", "", "payMsgId", "msgContent", "username", "Lrx3/b0;", "updateBubbleMsg", "", "scene", "bindSerial", "handleOfflineThings", "title", "Lcom/tencent/kinda/gen/VoidStringCallback;", "resultCallback", "selectSingeContactImpl", "stopSelectSingleContact", "jumpToBankcardList", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class KindaHoneyPayService implements KHoneyPayService {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final int REQUEST_SELECT_CONTACT = 101;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaHoneyPayService$Companion;", "", "()V", "REQUEST_SELECT_CONTACT", "", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public void handleOfflineThings(int i, String str) {
        C48527c.m53909e(i, str);
    }

    public void jumpToBankcardList() {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_kinda_android_bankcard_manager_config, false)) {
            Log.m105924i("MicroMsg.KindaHoneyPayService", "isKindaBankCardManagerEnable");
            ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("bankCard", ITransmitKvData.create(), KindaHoneyPayService$jumpToBankcardList$1.INSTANCE);
            return;
        }
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        Intent intent = new Intent();
        intent.putExtra("intent_finish_self", true);
        C88144b.m109791i(topOrUIPageFragmentActivity, "wallet", ".bind.ui.WalletBankcardManageUI", intent, (Bundle) null);
    }

    public void selectSingeContactImpl(String str, VoidStringCallback voidStringCallback) {
        Intent intent = new Intent();
        intent.putExtra("list_attr", C74560s1.m89278g(16, 1, 2, 4, 16384));
        intent.putExtra("block_contact", C75592q0.m90789s());
        intent.putExtra("titile", str);
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        C87412m.m108592e(topOrUIPageFragmentActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) topOrUIPageFragmentActivity).mmSetOnActivityResultCallback(new KindaHoneyPayService$selectSingeContactImpl$1(voidStringCallback));
        C88144b.m109802t(topOrUIPageFragmentActivity, ".ui.contact.SelectContactUI", intent, 101);
    }

    public void stopSelectSingleContact() {
    }

    public void updateBubbleMsg(String str, String str2, String str3) {
        C48527c.m53915k(str, str2, str3, (String) null);
    }
}
