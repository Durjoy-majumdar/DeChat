package os2;

import android.os.Message;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: os2.m */
public final class C62172m implements MMHandler.Callback {

    /* renamed from: d */
    public static final C62172m f176770d = new C62172m();

    public final boolean handleMessage(Message message) {
        SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver$handler$2$handler$1");
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        Object obj = message.obj;
        SnsInfo snsInfo = obj instanceof SnsInfo ? (SnsInfo) obj : null;
        if (snsInfo != null) {
            snsInfo.field_content = snsInfo.getTimeLine().toByteArray();
            C94866e1.Yx0().ov0(snsInfo.getSnsId(), snsInfo);
        }
        SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver$handler$2$handler$1");
        return true;
    }
}
