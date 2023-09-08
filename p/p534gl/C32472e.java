package p534gl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import p749xh.C38518a2;

/* renamed from: gl.e */
public final class C32472e extends C38518a2 {

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f86277r = C38518a2.initAutoDBInfo(C32472e.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f86277r;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public final boolean mo58649l2() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_remote_request_interval, 24);
        Log.m105924i("MicroMsg.EmojiSuggestCacheInfo", "needUpdate: config " + Qe);
        return Util.secondsToNow((long) this.field_updateTime) > ((long) Qe) * 3600;
    }
}
