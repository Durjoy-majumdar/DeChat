package com.tencent.p014mm.modelvideo;

import a70.C112760b;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.modelvideo.FullScreenMMVideoView */
public class FullScreenMMVideoView extends MMVideoView {

    /* renamed from: g1 */
    public String f157763g1;

    public FullScreenMMVideoView(Context context) {
        super(context);
    }

    private String getRootPath() {
        if (!Util.isNullOrNil(this.f157763g1)) {
            return this.f157763g1;
        }
        return C112760b.m154195C() + "video/";
    }

    /* renamed from: K */
    public String mo76634K() {
        return this.f267494W + " ";
    }

    /* renamed from: c0 */
    public void mo76635c0() {
        try {
            if (!Util.isNullOrNil(this.f283616Q)) {
                this.f267494W = "MMVideo_FullScreen" + this.f283616Q.hashCode();
                String str = getRootPath() + "MMVideo_FullScreen_" + this.f283616Q.hashCode() + ".mp4";
                this.f267504p0 = str;
                C86013q1.m106461v(C86013q1.m106458s(str));
                Log.m105925i("MicroMsg.FullScreenMMVideoView", "%s set video path [%s %s]", mo76634K(), this.f267494W, this.f267504p0);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.FullScreenMMVideoView", th.toString());
        }
    }

    /* renamed from: h */
    public void mo76636h(boolean z, String str, int i) {
        try {
            super.mo76636h(z, str, i);
            mo76635c0();
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.FullScreenMMVideoView", th.toString());
        }
    }

    public void onCompletion() {
        C55394a aVar;
        try {
            if (this.f267502d1) {
                mo79610W(getVideoDurationSec());
                C96814a.C57542d dVar = this.f283599u;
                if (dVar != null) {
                    dVar.mo81284b();
                }
            } else {
                super.onCompletion();
                String str = this.f267494W;
                if (!(str == null || (aVar = this.f267492V) == null)) {
                    aVar.mo36227a(str);
                }
                mo79628h0();
                C96875r0 r0Var = this.f283595q;
                if (r0Var != null) {
                    r0Var.stop();
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.FullScreenMMVideoView", th.toString());
            return;
        }
        this.f267487R0.release();
    }

    public void setRootPath(String str) {
        this.f157763g1 = str;
    }

    public FullScreenMMVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FullScreenMMVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
