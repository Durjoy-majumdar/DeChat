package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import i72.C108377g;
import j72.C108607f;
import java.util.List;
import p156gj.C107848z;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.t0 */
public class C105578t0 implements MMSightRecordButton.C105502i {

    /* renamed from: a */
    public final /* synthetic */ SightCaptureUI f314026a;

    public C105578t0(SightCaptureUI sightCaptureUI) {
        this.f314026a = sightCaptureUI;
    }

    /* renamed from: a */
    public void mo128039a() {
        C108377g gVar;
        SightCaptureUI sightCaptureUI = this.f314026a;
        if (sightCaptureUI.f313866g != 0 && (gVar = sightCaptureUI.f313870i) != null && gVar.f324504i) {
            TextView textView = sightCaptureUI.f313826E;
            if (textView != null && sightCaptureUI.f313864f) {
                textView.animate().alpha(0.0f).setDuration(100).setListener(new C105540k0(sightCaptureUI)).start();
            }
            Log.m105925i("MicroMsg.TestCaptureUiEvent", "onLongPress %s", Util.getStack().toString());
            SightCaptureUI sightCaptureUI2 = this.f314026a;
            C108607f fVar = sightCaptureUI2.f313871j;
            if (fVar != null) {
                Log.m105927v("MicroMsg.TestCaptureUiEvent", "startRecord, mediaRecorder.status: %s, %s", fVar.mo159613j(), Util.getStack().toString());
                sightCaptureUI2.mo150354W7(6);
                if (sightCaptureUI2.f313871j.mo159613j() == C108607f.C108610c.Stop) {
                    int S7 = sightCaptureUI2.mo150350S7();
                    sightCaptureUI2.f313840R0 = S7;
                    if (S7 < 0) {
                        sightCaptureUI2.mo150347P7();
                        return;
                    }
                } else if (sightCaptureUI2.f313840R0 < 0) {
                    sightCaptureUI2.mo150347P7();
                    return;
                }
                sightCaptureUI2.mo150354W7(2);
                C108377g gVar2 = sightCaptureUI2.f313870i;
                if (gVar2 != null) {
                    Log.m105924i("MicroMsg.MMSightCamera", "switchToVideoFocusMode");
                    C107848z zVar = gVar2.f324503h;
                    if (zVar != null && gVar2.f324504i) {
                        try {
                            Camera.Parameters c = zVar.mo158259c();
                            List<String> supportedFocusModes = c.getSupportedFocusModes();
                            if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                                Log.m105924i("MicroMsg.MMSightCameraSetting", "support continuous video");
                                c.setFocusMode("continuous-video");
                            }
                            gVar2.f324503h.mo158262f(c);
                        } catch (Exception e) {
                            Log.m105925i("MicroMsg.MMSightCamera", "switchToVideoFocusMode error: %s", e.getMessage());
                        }
                    }
                }
                if (sightCaptureUI2.f313847V.f248462s) {
                    sightCaptureUI2.f313831J.mo66663c((long) sightCaptureUI2.f313868h.f267170h);
                }
                sightCaptureUI2.f313873o.mo150321i(0, 100, (sightCaptureUI2.f313868h.f267170h * 1000) - 500, 0, new C105542l0(sightCaptureUI2));
            }
        }
    }

    /* renamed from: b */
    public void mo128040b() {
        C108377g gVar;
        Log.m105925i("MicroMsg.SightCaptureUI", "onPressDown, currentStatus: %s", Integer.valueOf(this.f314026a.f313866g));
        SightCaptureUI sightCaptureUI = this.f314026a;
        if (sightCaptureUI.f313866g != 0 && (gVar = sightCaptureUI.f313870i) != null && gVar.f324504i) {
            int[] iArr = new int[2];
            sightCaptureUI.f313873o.getLocationOnScreen(iArr);
            C108377g gVar2 = this.f314026a.f313870i;
            int i = iArr[1];
            if (gVar2.f324500e <= 0) {
                Point h = C85875k4.m106184h(MMApplicationContext.getContext());
                int i2 = h.y;
                Log.m105925i("MicroMsg.MMSightCamera", "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", Integer.valueOf(i), h);
                if (i2 / 2 < i) {
                    try {
                        C107848z zVar = gVar2.f324503h;
                        if (zVar != null) {
                            int maxZoom = zVar.mo158259c().getMaxZoom();
                            int i3 = ((int) (((double) maxZoom) / ((((double) i) / 3.0d) / ((double) 10)))) + 1;
                            gVar2.f324500e = i3;
                            Log.m105925i("MicroMsg.MMSightCamera", "scrollSmallZoomStep: %s, maxZoom: %s", Integer.valueOf(i3), Integer.valueOf(maxZoom));
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.MMSightCamera", "calcScrollZoomStep error: %s", e.getMessage());
                    }
                }
            }
            SightCaptureUI sightCaptureUI2 = this.f314026a;
            if (sightCaptureUI2.f313860d == 0) {
                sightCaptureUI2.f313840R0 = sightCaptureUI2.mo150350S7();
            }
        }
    }

    /* renamed from: c */
    public void mo128041c() {
        Object[] objArr = new Object[3];
        objArr[0] = Util.getStack().toString();
        C108607f fVar = this.f314026a.f313871j;
        objArr[1] = fVar;
        objArr[2] = Long.valueOf(fVar != null ? fVar.mo159623s() : 0);
        Log.m105925i("MicroMsg.TestCaptureUiEvent", "onLongPressFinish %s, recorder: %s, recordTime: %s", objArr);
        SightCaptureUI sightCaptureUI = this.f314026a;
        int i = sightCaptureUI.f313860d;
        if (i == 0) {
            C108607f fVar2 = sightCaptureUI.f313871j;
            if (fVar2 == null || fVar2.mo159623s() > 1000 || this.f314026a.f313871j.mo159613j() != C108607f.C108610c.Start) {
                this.f314026a.mo150351T7();
                return;
            }
            Log.m105924i("MicroMsg.SightCaptureUI", "video record too short, cancel and convert to takepicture");
            this.f314026a.f313871j.cancel();
            SightCaptureUI sightCaptureUI2 = this.f314026a;
            if (sightCaptureUI2.f313860d == 0) {
                SightCaptureUI.m141707H7(sightCaptureUI2);
            }
        } else if (i == 1) {
            Object[] objArr2 = new Object[2];
            C108607f fVar3 = sightCaptureUI.f313871j;
            objArr2[0] = fVar3 == null ? "null" : fVar3.getClass().getSimpleName();
            C108607f fVar4 = this.f314026a.f313871j;
            objArr2[1] = Long.valueOf(fVar4 == null ? -1 : fVar4.mo159623s());
            Log.m105925i("MicroMsg.TestCaptureUiEvent", "onLongPressFinish, MODE_SIGHT, recorder=%s, recordTime=%d", objArr2);
            C108607f fVar5 = this.f314026a.f313871j;
            if (fVar5 == null || fVar5.mo159623s() > 1000) {
                SightCaptureUI sightCaptureUI3 = this.f314026a;
                if (sightCaptureUI3.f313871j != null) {
                    sightCaptureUI3.mo150351T7();
                    return;
                }
            }
            Log.m105924i("MicroMsg.SightCaptureUI", "video record too short");
            C76701a.makeText((Context) this.f314026a, (int) C0966R.string.gt_, 1).show();
            this.f314026a.mo150348Q7();
        }
    }
}
