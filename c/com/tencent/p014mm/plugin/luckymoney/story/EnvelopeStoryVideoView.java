package com.tencent.p014mm.plugin.luckymoney.story;

import a70.C112760b;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView */
public class EnvelopeStoryVideoView extends MMVideoView {

    /* renamed from: m1 */
    public static final String f272089m1 = (C112760b.m154195C() + "hbstoryvideo/");

    /* renamed from: g1 */
    public String f272090g1;

    /* renamed from: h1 */
    public boolean f272091h1;

    /* renamed from: i1 */
    public boolean f272092i1;

    /* renamed from: j1 */
    public boolean f272093j1 = false;

    /* renamed from: k1 */
    public C94181a f272094k1;

    /* renamed from: l1 */
    public boolean f272095l1;

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView$a */
    public interface C94181a {
    }

    public EnvelopeStoryVideoView(Context context) {
        super(context);
        mo129416j0();
    }

    /* renamed from: b */
    public void mo79614b() {
        Log.m105925i(this.f283586e, "%s onUIPause", mo76634K());
        if (this.f283588g) {
            this.f283596r = getCurrPosSec();
            this.f283597s = true;
            this.f283574D = 0;
            this.f283573C = (long) 0;
            pause();
            mo127231U();
            this.f283588g = false;
            mo135073G(600, (long) (getReportIdkey() + 11), 1, false);
        }
    }

    /* renamed from: f */
    public void mo79617f() {
        if (!this.f283588g) {
            this.f283588g = true;
            C96875r0 r0Var = this.f283595q;
            if (r0Var != null) {
                if (this.f283597s) {
                    play();
                } else {
                    ((VideoPlayerTextureView) r0Var).mo153302E();
                }
            }
            mo135073G(600, (long) (getReportIdkey() + 10), 1, false);
        }
    }

    public int getRealPlayDurationSec() {
        return this.f272093j1 ? getVideoDurationSec() : getCurrPosSec();
    }

    public String getSessionId() {
        return this.f272090g1;
    }

    /* renamed from: h */
    public void mo76636h(boolean z, String str, int i) {
        super.mo76636h(z, str, i);
        if (this.f272095l1) {
            this.f267504p0 = str;
        }
    }

    /* renamed from: j0 */
    public final void mo129416j0() {
        LinearLayout linearLayout = this.f283592n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        String str = f272089m1;
        setRootPath(str);
        C86013q1.m106460u(str);
        setLoop(true);
    }

    public void onCompletion() {
        C94181a aVar;
        this.f272093j1 = true;
        if (this.f267502d1 && (aVar = this.f272094k1) != null) {
            C94185y yVar = (C94185y) aVar;
            int addAndGet = yVar.f272101a.f272080l.addAndGet(1);
            EnvelopeStoryVideoManager.C94180e eVar = yVar.f272101a;
            getVideoDurationSec();
            eVar.getClass();
            Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "sessionId: %s, current loop count: %s", yVar.f272101a.f272070b, Integer.valueOf(addAndGet));
        }
        super.onCompletion();
    }

    public void setLocal(boolean z) {
        this.f272092i1 = z;
    }

    public void setLocalPreDownloadVideo(boolean z) {
        this.f272095l1 = z;
    }

    public void setMute(boolean z) {
        super.setMute(z);
        this.f272091h1 = z;
    }

    public void setSessionId(String str) {
        this.f272090g1 = str;
    }

    public void start() {
        Log.m105925i(this.f283586e, "%s start cdnMediaId[%s] timeDuration[%d] isLocal[%s]", mo76634K(), this.f267494W, Integer.valueOf(this.f267488S0), Boolean.valueOf(this.f272092i1));
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            if (!Util.isNullOrNil(r0Var.getVideoPath())) {
                play();
            } else if (this.f272092i1 || this.f272095l1) {
                mo127234f0();
                this.f267506y0 = 3;
                return;
            } else {
                mo129179R();
                this.f267501c1 = true;
                this.f267488S0 = 0;
                this.f267506y0 = 1;
                C55394a aVar = this.f267492V;
                if (aVar != null) {
                    aVar.mo36231f(this.f267494W, this.f267504p0, this.f283616Q);
                    this.f267492V.mo36228b(this);
                }
                mo135076O();
            }
            mo135073G(600, (long) (getReportIdkey() + 1), 1, false);
        }
    }

    public EnvelopeStoryVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo129416j0();
    }

    public EnvelopeStoryVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo129416j0();
    }
}
