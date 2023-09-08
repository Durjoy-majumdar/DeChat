package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import gw0.C76073b;
import java.util.List;
import s90.C77627f;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.l3 */
public class C18410l3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f51061d;

    /* renamed from: e */
    public final /* synthetic */ int f51062e;

    /* renamed from: f */
    public final /* synthetic */ int f51063f;

    /* renamed from: g */
    public final /* synthetic */ int f51064g;

    /* renamed from: h */
    public final /* synthetic */ C18412m3 f51065h;

    public C18410l3(C18412m3 m3Var, C19623o0 o0Var, int i, int i2, int i3) {
        this.f51065h = m3Var;
        this.f51061d = o0Var;
        this.f51062e = i;
        this.f51063f = i2;
        this.f51064g = i3;
    }

    public void run() {
        int i;
        long j;
        int i2 = 0;
        long j2 = 0;
        if (this.f51061d.mo25754B2()) {
            try {
                C19623o0 o0Var = this.f51061d;
                C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
                if (JZ != null && !Util.isNullOrNil((List) JZ.f226295i)) {
                    C77630j jVar = JZ.f226295i.get(this.f51062e);
                    if (!Util.isNullOrNil(jVar.f226326e)) {
                        Uri parse = Uri.parse(jVar.f226326e);
                        j2 = Util.getLong(parse.getQueryParameter("mid"), 0);
                        i2 = Util.getInt(parse.getQueryParameter("idx"), 0);
                    }
                }
                i = i2;
                j = j2;
            } catch (UnsupportedOperationException e) {
                Log.m105929w("MicroMsg.BizTimeLineReport", "reportBizTimelineOp exp %s", e.getMessage());
            } catch (Exception e2) {
                Log.m105929w("MicroMsg.BizTimeLineReport", "reportBizTimelineOp exp %s", e2.getMessage());
            }
            this.f51065h.mo22985l(this.f51061d.field_talker, j, i, this.f51063f, this.f51064g, 0, false, 0);
        }
        j = 0;
        i = 0;
        this.f51065h.mo22985l(this.f51061d.field_talker, j, i, this.f51063f, this.f51064g, 0, false, 0);
    }
}
