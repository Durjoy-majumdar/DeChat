package com.tencent.p014mm.modelvideo;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.modelvideo.AdLandingMMVideoView */
public class AdLandingMMVideoView extends MMVideoView {

    /* renamed from: g1 */
    public boolean f267483g1;

    /* renamed from: h1 */
    public C96814a.C96815a f267484h1;

    public AdLandingMMVideoView(Context context) {
        super(context);
        this.f283585d = "VideoView.AdLandingMMVideoView";
    }

    /* renamed from: K */
    public String mo76634K() {
        return this.f267494W + " ";
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        try {
            boolean z2 = this.f267483g1;
            if (z2) {
                Log.m105925i(this.f283586e, "seekTo adjust needPause[%b]", Boolean.valueOf(z2));
                z = false;
            }
            return mo79629i0((int) d, z);
        } catch (Throwable th) {
            Log.m105920e(this.f283586e, th.toString());
            return false;
        }
    }

    /* renamed from: m */
    public void mo76640m(String str, int i) {
        try {
            if (!Util.isEqual(this.f267494W, str)) {
                return;
            }
            if (this.f267506y0 != 3) {
                Log.m105925i(this.f283586e, "%s download finish [%d] needPause[%b]", mo76634K(), Integer.valueOf(i), Boolean.valueOf(this.f267483g1));
                if (i == 0) {
                    this.f267506y0 = 3;
                }
                C96814a.C96815a aVar = this.f267484h1;
                if (aVar != null) {
                    aVar.mo129208o(this.f267504p0, this.f267486Q0 > 0);
                }
                Log.m105924i(this.f283585d, "onFinish");
                if (!this.f267483g1) {
                    Log.m105924i(this.f283585d, "onFinish, startTimer, needPause is false");
                    mo127230T(true);
                }
                this.f267498Z0 = false;
            }
        } catch (Throwable th) {
            Log.m105920e(this.f283586e, th.toString());
        }
    }

    public void onDataAvailable(String str, long j, long j2) {
        try {
            this.f267498Z0 = false;
            if (j > -1) {
                if (j2 > -1) {
                    if (Util.isEqual(this.f267494W, str)) {
                        this.f267495W0 = this.f267487R0.mo89448c((int) j, (int) j2);
                        Log.m105925i(this.f283586e, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d] needPause[%b]", mo76634K(), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(this.f267495W0), Boolean.valueOf(this.f267483g1));
                        Log.m105924i(this.f283585d, "onDataAvailable");
                        if (!this.f267483g1) {
                            Log.m105924i(this.f283585d, "onDataAvailable, startTimer, needPause is false");
                            mo127230T(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            Log.m105929w(this.f283586e, "%s deal data available error offset[%d], length[%d]", mo76634K(), Long.valueOf(j), Long.valueOf(j2));
        } catch (Exception e) {
            Log.m105921e(this.f283586e, "%s deal data available file pos to video time error[%s] ", mo76634K(), e.toString());
        } catch (Throwable th) {
            Log.m105920e(this.f283586e, th.toString());
        }
    }

    public void setIMMDownloadFinish(C96814a.C96815a aVar) {
        this.f267484h1 = aVar;
    }

    public void setNeedPause(boolean z) {
        this.f267483g1 = z;
    }

    public AdLandingMMVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f283585d = "VideoView.AdLandingMMVideoView";
    }

    public AdLandingMMVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f283585d = "VideoView.AdLandingMMVideoView";
    }
}
