package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xwebutil.C19894d;
import s00.C110694g;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.v0 */
public class C19573v0 extends C110694g<Integer> {

    /* renamed from: b */
    public final /* synthetic */ MiniQBReaderUI f55390b;

    public C19573v0(MiniQBReaderUI miniQBReaderUI) {
        this.f55390b = miniQBReaderUI;
    }

    public void onReceiveValue(Object obj) {
        Integer num = (Integer) obj;
        if (this.f331114a) {
            Log.m105925i("MicroMsg.MiniQBReaderUI", "openReadFile, ignore ret = %d", num);
            return;
        }
        Log.m105925i("MicroMsg.MiniQBReaderUI", "openReadFile, ret = %d", num);
        MiniQBReaderUI miniQBReaderUI = this.f55390b;
        C19894d.m21647f(miniQBReaderUI, miniQBReaderUI.f55251e, miniQBReaderUI.f55252f, num.intValue());
        if (num.intValue() != 0) {
            this.f55390b.finish();
        }
    }
}
