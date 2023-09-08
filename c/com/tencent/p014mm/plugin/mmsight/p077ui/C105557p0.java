package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.p077ui.C105562q;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f72.C97842b;
import lu3.C88656g;
import p910lj.C76701a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.p0 */
public class C105557p0 implements C105562q.C105564b {

    /* renamed from: a */
    public final /* synthetic */ SightCaptureUI f313967a;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.p0$a */
    public class C105558a implements C88656g {
        public C105558a() {
        }

        public String getKey() {
            return "SightCaptureUI_edit_finish_save_new_thumb";
        }

        public void run() {
            int i;
            SightCaptureUI sightCaptureUI = C105557p0.this.f313967a;
            int i2 = SightCaptureUI.f313821i1;
            sightCaptureUI.getClass();
            try {
                Bitmap q = C97842b.m126300q(sightCaptureUI.f313871j.getFilePath());
                if (q != null && sightCaptureUI.f313868h != null && Math.min(q.getWidth(), q.getHeight()) > sightCaptureUI.f313868h.f267179t) {
                    int width = q.getWidth();
                    int height = q.getHeight();
                    VideoTransPara videoTransPara = sightCaptureUI.f313868h;
                    int i3 = videoTransPara.f267179t;
                    if (i3 <= 0) {
                        i3 = videoTransPara.f267166d;
                    }
                    if (width < height) {
                        i = (int) (((float) height) / ((((float) width) * 1.0f) / ((float) i3)));
                    } else {
                        int i4 = i3;
                        i3 = (int) (((float) width) / ((((float) height) * 1.0f) / ((float) i3)));
                        i = i4;
                    }
                    BitmapUtil.saveBitmapToImage(Bitmap.createScaledBitmap(q, i3, i, true), 60, Bitmap.CompressFormat.JPEG, sightCaptureUI.f313871j.mo159601b(), true);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SightCaptureUI", e, "saveNewThumbAfterEdit error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.p0$b */
    public class C105559b implements Runnable {
        public C105559b() {
        }

        public void run() {
            C76701a.makeText((Context) C105557p0.this.f313967a, (int) C0966R.string.gta, 1).show();
            C105557p0.this.f313967a.setSelfNavigationBarVisible(8);
            C105557p0.this.f313967a.f313874p.setVisibility(0);
            C105557p0.this.f313967a.f313876q.setVisibility(0);
            C105557p0.this.f313967a.f313883x.setVisibility(0);
        }
    }

    public C105557p0(SightCaptureUI sightCaptureUI) {
        this.f313967a = sightCaptureUI;
    }

    /* renamed from: a */
    public void mo150277a() {
        Log.m105924i("MicroMsg.SightCaptureUI", "on video edit error");
        C105562q qVar = this.f313967a.f313832K;
        if (qVar != null) {
            qVar.mo150417e();
            this.f313967a.f313832K = null;
        }
        MMHandlerThread.postToMainThread(new C105559b());
    }

    /* renamed from: b */
    public void mo150278b() {
        Log.m105924i("MicroMsg.SightCaptureUI", "on video edit finish");
        SightCaptureUI sightCaptureUI = this.f313967a;
        C105562q qVar = sightCaptureUI.f313832K;
        if (qVar != null) {
            sightCaptureUI.f313852X0 = Util.nullAs(qVar.f313979A, "");
            SightCaptureUI sightCaptureUI2 = this.f313967a;
            sightCaptureUI2.f313832K.mo150418f(false, sightCaptureUI2.f313847V.f248460q);
            this.f313967a.f313832K.mo150417e();
            this.f313967a.f313832K = null;
        }
        this.f313967a.f313874p.setVisibility(0);
        this.f313967a.f313876q.setVisibility(0);
        this.f313967a.f313883x.setVisibility(0);
        this.f313967a.f313829H.stop();
        SightCaptureUI sightCaptureUI3 = this.f313967a;
        sightCaptureUI3.f313829H.setVideoPath(sightCaptureUI3.f313871j.getFilePath());
        this.f313967a.f313829H.setLoop(true);
        this.f313967a.f313829H.setForceScaleFullScreen(true);
        SightCaptureUI sightCaptureUI4 = this.f313967a;
        sightCaptureUI4.f313829H.setVideoCallback(sightCaptureUI4.f313869h1);
        this.f313967a.setSelfNavigationBarVisible(8);
        ((C119157j) C119157j.f356862d).mo183875f(new C105558a());
        this.f313967a.f313848V0 = true;
    }

    /* renamed from: c */
    public void mo150279c() {
        Log.m105924i("MicroMsg.SightCaptureUI", "on video edit exit");
        SightCaptureUI sightCaptureUI = this.f313967a;
        C105562q qVar = sightCaptureUI.f313832K;
        if (qVar != null) {
            qVar.mo150418f(true, sightCaptureUI.f313847V.f248460q);
            this.f313967a.f313832K.mo150417e();
            this.f313967a.f313832K = null;
        }
        this.f313967a.setSelfNavigationBarVisible(8);
        this.f313967a.f313874p.setVisibility(0);
        this.f313967a.f313876q.setVisibility(0);
        this.f313967a.f313883x.setVisibility(0);
    }
}
