package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import p232rw.C77574q;
import p232rw.C77575r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.d */
public class C72602d implements C15601d<C77575r> {

    /* renamed from: d */
    public final /* synthetic */ BaseSearchWebViewUI f211221d;

    public C72602d(BaseSearchWebViewUI baseSearchWebViewUI) {
        this.f211221d = baseSearchWebViewUI;
    }

    public C66212f getContext() {
        return C66217g.f190253d;
    }

    public void resumeWith(Object obj) {
        boolean z;
        int i;
        if (obj instanceof C77575r) {
            C77575r rVar = (C77575r) obj;
            if (rVar.f226147b == -1 && rVar.f226148c == 0) {
                boolean Y9 = this.f211221d.mo68433Y9();
                C77574q qVar = rVar.f226149d;
                RecordMediaReportInfo recordMediaReportInfo = rVar.f226151f;
                if (recordMediaReportInfo != null) {
                    i = ((Integer) recordMediaReportInfo.mo129811b("KEY_MEDIA_SOURCE_INT", -1)).intValue();
                    z = (i == 1 || i == 2) ? false : true;
                    this.f211221d.mo68479Z9(qVar.f226143b, 0);
                } else {
                    i = 0;
                    z = true;
                }
                int i2 = Y9 ? z ? 21 : 20 : z ? 19 : 18;
                Log.m105925i("MicroMsg.WebSearch.BaseSearchWebViewUI", "isSearchState = %b, source = %d, isFromAlbum = %b, model.getReportInfo() = %s, type = %d.", Boolean.valueOf(Y9), Integer.valueOf(i2), Boolean.valueOf(z), rVar.f226151f, Integer.valueOf(i));
                this.f211221d.mo68479Z9(qVar.f226143b, i2);
            }
        }
    }
}
