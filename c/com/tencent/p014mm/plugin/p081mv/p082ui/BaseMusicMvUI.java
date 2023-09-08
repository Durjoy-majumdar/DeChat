package com.tencent.p014mm.plugin.p081mv.p082ui;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongControlUIC;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dm2.C45418c;
import java.util.Set;
import kotlin.Metadata;
import p640ox.C77049b;
import sx3.C22415w0;
import sx3.C48501y0;
import te3.C64793w23;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.BaseMusicMvUI */
public abstract class BaseMusicMvUI extends MMSecDataActivity {

    /* renamed from: d */
    public final String f163014d = "MicroMsg.Mv.BaseMusicMvUI";

    public int getForceOrientation() {
        return 1;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return C48501y0.m53872g(importUIComponents, C22415w0.m26092a(MusicMvSongControlUIC.class));
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        C64793w23 w232;
        Class cls = C64793w23.class;
        Class cls2 = C77049b.class;
        super.onCreate(bundle);
        ((C77049b) C86312j.m106911c(cls2)).mo72352Rp(this, new C45418c(cls, 7, true));
        C64793w23 w233 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(this, 7, cls);
        if (!(w233 == null || (w232 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).mo72358wi(this, 1, 7, cls)) == null)) {
            w233.f186033d = w232.f186033d;
            w233.f186034e = w232.f186034e;
            w233.f186035f = w232.f186035f;
            w233.f186036g = w232.f186036g;
            w233.f186038i = w232.f186038i;
            String str = this.f163014d;
            Log.m105924i(str, "init mv page scene:" + w232.f186033d + " contextId:" + w232.f186034e + " finderCommentScene:" + w232.f186035f + " finderContextId:" + w232.f186038i);
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_mv_report_data");
        if (byteArrayExtra != null) {
            try {
                C64793w23 w234 = new C64793w23();
                w234.parseFrom(byteArrayExtra);
                C64793w23 w235 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(this, 7, cls);
                if (w235 != null) {
                    w235.f186033d = w234.f186033d;
                    w235.f186034e = w234.f186034e;
                    w235.f186035f = w234.f186035f;
                    w235.f186036g = w235.f186036g;
                    String str2 = this.f163014d;
                    Log.m105924i(str2, "init mv page report data from intent, " + w234.f186033d + ' ' + w234.f186034e + ' ' + w234.f186035f);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(this.f163014d, e, e.getMessage(), new Object[0]);
            }
        }
    }
}
