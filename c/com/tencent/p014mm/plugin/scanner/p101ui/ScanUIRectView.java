package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanFlashSwitchEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.plugin.scanner.model.C106071g1;
import com.tencent.p014mm.plugin.scanner.model.C106084y0;
import com.tencent.p014mm.plugin.scanner.model.C19016e1;
import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.plugin.scanner.model.C30384o1;
import com.tencent.p014mm.plugin.scanner.model.C71004i;
import com.tencent.p014mm.plugin.scanner.model.C71007x0;
import com.tencent.p014mm.plugin.scanner.model.ScanPoint;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanAnimationDotsView;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanDebugView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanInfoMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductMaskDecorView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanSharedMaskView;
import com.tencent.p014mm.plugin.scanner.util.ScanCameraLightDetector;
import com.tencent.p014mm.plugin.scanner.view.BaseScanMaskView;
import com.tencent.p014mm.plugin.scanner.view.C71029e;
import com.tencent.p014mm.plugin.scanner.view.ScanRectDecorView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.C19933b;
import com.tencent.qbar.C19936d;
import com.tencent.qbar.C19937e;
import com.tencent.qbar.C19938f;
import com.tencent.qbar.QbarNative;
import com.tencent.qbar.ScanDecodeFrameData;
import com.tencent.qbar.WxQBarPoint;
import com.tencent.qbar.WxQBarResult;
import com.tencent.qbar.WxQbarNative;
import com.tencent.scanlib.p325ui.ScanView;
import di3.C86312j;
import dl2.C20461a;
import dl2.C20467c;
import dl2.C20469e;
import dl2.C20475f;
import dl2.C20476g;
import gy3.C87412m;
import h81.C32735h;
import ht3.C108258a;
import ht3.C108261e;
import ht3.C108267t;
import ht3.C21001c;
import ht3.C21003d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import org.json.JSONObject;
import p680ru.C101464l;
import qs3.C36079a;
import sn0.C90259e;
import sx3.C110823p;
import tl2.C111012a;
import tl2.C111019e;
import ul2.C111203g0;
import vl2.C102223z;
import vl2.C111557w;
import vl2.C22768r;
import vl2.C22772v;
import vl2.C37751c0;
import vl2.C37756o;
import yk2.C112475a;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView */
public class ScanUIRectView extends ScanView {

    /* renamed from: n1 */
    public static final int f53671n1 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_scan_code_continuous_max_frame, 50);

    /* renamed from: A */
    public String f53672A;

    /* renamed from: B */
    public ScanCodeProductMergeMaskView f53673B;

    /* renamed from: C */
    public ScanProductMaskDecorView.C106130d f53674C;

    /* renamed from: D */
    public ScanProductMaskDecorView.C106131e f53675D;

    /* renamed from: E */
    public boolean f53676E = false;

    /* renamed from: F */
    public Activity f53677F;

    /* renamed from: G */
    public C71004i f53678G;

    /* renamed from: H */
    public C111203g0 f53679H;

    /* renamed from: I */
    public boolean f53680I = true;

    /* renamed from: J */
    public boolean f53681J = false;

    /* renamed from: K */
    public int f53682K = 0;

    /* renamed from: L */
    public float f53683L;

    /* renamed from: M */
    public int f53684M = 120;

    /* renamed from: N */
    public boolean f53685N = false;

    /* renamed from: P */
    public Point f53686P = null;

    /* renamed from: Q */
    public boolean f53687Q = true;

    /* renamed from: Q0 */
    public boolean f53688Q0 = false;

    /* renamed from: R */
    public boolean f53689R = true;

    /* renamed from: R0 */
    public boolean f53690R0 = false;

    /* renamed from: S */
    public int f53691S = 0;

    /* renamed from: S0 */
    public boolean f53692S0 = false;

    /* renamed from: T */
    public boolean f53693T;

    /* renamed from: T0 */
    public boolean f53694T0 = true;

    /* renamed from: U */
    public boolean f53695U;

    /* renamed from: U0 */
    public boolean f53696U0 = false;

    /* renamed from: V */
    public boolean f53697V = true;

    /* renamed from: V0 */
    public C22768r f53698V0;

    /* renamed from: W */
    public boolean f53699W = false;

    /* renamed from: W0 */
    public int f53700W0;

    /* renamed from: X0 */
    public long f53701X0;

    /* renamed from: Y0 */
    public long f53702Y0;

    /* renamed from: Z0 */
    public boolean f53703Z0;

    /* renamed from: a1 */
    public boolean f53704a1;

    /* renamed from: b1 */
    public boolean f53705b1;

    /* renamed from: c1 */
    public boolean f53706c1;

    /* renamed from: d1 */
    public Runnable f53707d1;

    /* renamed from: e1 */
    public int f53708e1;

    /* renamed from: f1 */
    public int f53709f1;

    /* renamed from: g1 */
    public C19938f.C19941c f53710g1;

    /* renamed from: h1 */
    public C20461a.C20463b f53711h1;

    /* renamed from: i1 */
    public C92411b.C92412a f53712i1;

    /* renamed from: j1 */
    public IListener<ScanFlashSwitchEvent> f53713j1;

    /* renamed from: k1 */
    public GestureDetector f53714k1;

    /* renamed from: l1 */
    public long f53715l1;

    /* renamed from: m1 */
    public TakeShotByTextureHandler f53716m1;

    /* renamed from: o */
    public ScanRectDecorView f53717o;

    /* renamed from: p */
    public ScanProductMaskDecorView f53718p;

    /* renamed from: p0 */
    public BaseScanRequest f53719p0;

    /* renamed from: q */
    public ScanSharedMaskView f53720q;

    /* renamed from: r */
    public BaseScanMaskView f53721r;

    /* renamed from: s */
    public ScanDebugView f53722s;

    /* renamed from: t */
    public ScannerFlashSwitcher f53723t;

    /* renamed from: u */
    public int f53724u = 1;

    /* renamed from: v */
    public boolean f53725v = true;

    /* renamed from: w */
    public long f53726w;

    /* renamed from: x */
    public ScanCallBack f53727x;

    /* renamed from: x0 */
    public boolean f53728x0 = false;

    /* renamed from: y */
    public String f53729y;

    /* renamed from: y0 */
    public boolean f53730y0 = false;

    /* renamed from: z */
    public String f53731z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$TakeShotByTextureHandler */
    public class TakeShotByTextureHandler extends Handler {
        public TakeShotByTextureHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            ScanUIRectView.this.f53715l1 = System.currentTimeMillis();
            ScanUIRectView scanUIRectView = ScanUIRectView.this;
            scanUIRectView.getClass();
            Log.m105924i("MicroMsg.ScanUIRectView", "doTakeOneShotByTexture");
            C191059 r0 = new C19027m0() {
                public void run() {
                    final byte[] bArr;
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    int i = ScanUIRectView.f53671n1;
                    scanUIRectView.getClass();
                    int i2 = 0;
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        int width = scanUIRectView.f56969d.getWidth();
                        int height = scanUIRectView.f56969d.getHeight();
                        C22768r rVar = scanUIRectView.f53698V0;
                        if (!(rVar == null || rVar.f65486j == 0.0f)) {
                            width = (int) (((float) scanUIRectView.f56969d.getWidth()) * scanUIRectView.f53698V0.f65486j);
                            height = (int) (((float) scanUIRectView.f56969d.getHeight()) * scanUIRectView.f53698V0.f65486j);
                        }
                        if (width % 2 != 0) {
                            width--;
                        }
                        if (height % 2 != 0) {
                            height--;
                        }
                        Bitmap bitmap = scanUIRectView.f56969d.getBitmap(width, height);
                        Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo generateFrameByTextureView getBitmap cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        if (bitmap != null && !bitmap.isRecycled()) {
                            scanUIRectView.f53708e1 = bitmap.getWidth();
                            scanUIRectView.f53709f1 = bitmap.getHeight();
                            Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo generateFrameByTextureView bitmap width: %d, height: %d", Integer.valueOf(scanUIRectView.f53708e1), Integer.valueOf(scanUIRectView.f53709f1));
                            long currentTimeMillis2 = System.currentTimeMillis();
                            int i3 = scanUIRectView.f53708e1;
                            int i4 = scanUIRectView.f53709f1;
                            C102223z zVar = C102223z.f301005a;
                            int i5 = i3 * i4;
                            int[] iArr = new int[i5];
                            int[] iArr2 = iArr;
                            int i6 = i5;
                            bitmap.getPixels(iArr, 0, i3, 0, 0, i3, i4);
                            int i7 = (i6 * 3) / 2;
                            bArr = new byte[i7];
                            int i8 = 0;
                            int i9 = 0;
                            int i15 = 0;
                            while (i8 < i4) {
                                int i16 = 0;
                                while (i16 < i3) {
                                    int i17 = iArr2[i15];
                                    int i18 = (i17 & 16711680) >> 16;
                                    int i19 = (i17 & 65280) >> 8;
                                    int i25 = i4;
                                    int i26 = (i17 & 255) >> i2;
                                    int i27 = (((((i18 * 66) + (i19 * 129)) + (i26 * 25)) + 128) >> 8) + 16;
                                    int i28 = (((((i18 * -38) - (i19 * 74)) + (i26 * 112)) + 128) >> 8) + 128;
                                    int i29 = (((((i18 * 112) - (i19 * 94)) - (i26 * 18)) + 128) >> 8) + 128;
                                    int i35 = i9 + 1;
                                    int i36 = i3;
                                    if (i27 < 0) {
                                        i27 = 0;
                                    } else if (i27 > 255) {
                                        i27 = 255;
                                    }
                                    bArr[i9] = (byte) i27;
                                    if (i8 % 2 == 0 && i15 % 2 == 0) {
                                        int i37 = i6 + 1;
                                        if (i29 < 0) {
                                            i29 = 0;
                                        } else if (i29 > 255) {
                                            i29 = 255;
                                        }
                                        bArr[i6] = (byte) i29;
                                        i6 = i37 + 1;
                                        if (i28 < 0) {
                                            i28 = 0;
                                        } else if (i28 > 255) {
                                            i28 = 255;
                                        }
                                        bArr[i37] = (byte) i28;
                                    }
                                    i15++;
                                    i16++;
                                    i9 = i35;
                                    i3 = i36;
                                    i4 = i25;
                                    i2 = 0;
                                }
                                int i38 = i4;
                                int i39 = i3;
                                i8++;
                                i2 = 0;
                            }
                            bitmap.recycle();
                            Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo generateFrameByTextureView yuvData: %d, getNV21 cost: %d", Integer.valueOf(i7), Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                            MMHandlerThread.postToMainThread(new Runnable() {
                                public void run() {
                                    Log.m105924i("MicroMsg.ScanUIRectView", "doTakeOneShotByTexture  run");
                                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                                    byte[] bArr = bArr;
                                    int i = ScanUIRectView.f53671n1;
                                    scanUIRectView.mo24419v(bArr);
                                }
                            });
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "alvinluo generateFrameByTextureView exception", new Object[0]);
                    }
                    bArr = null;
                    MMHandlerThread.postToMainThread(new Runnable() {
                        public void run() {
                            Log.m105924i("MicroMsg.ScanUIRectView", "doTakeOneShotByTexture  run");
                            ScanUIRectView scanUIRectView = ScanUIRectView.this;
                            byte[] bArr = bArr;
                            int i = ScanUIRectView.f53671n1;
                            scanUIRectView.mo24419v(bArr);
                        }
                    });
                }
            };
            C19021i0 i0Var = C19021i0.f53455a;
            ((C119157j) C119157j.f356862d).mo183876g(r0, "takeOneShotByTextureLoopTag");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$ScanCallBack */
    public interface ScanCallBack {
        /* renamed from: a */
        void mo24353a(long j, Bundle bundle);
    }

    public ScanUIRectView(Context context) {
        super(context);
        C22768r rVar = new C22768r();
        this.f53698V0 = rVar;
        this.f53700W0 = 0;
        this.f53701X0 = 0;
        this.f53702Y0 = rVar.f65478b;
        this.f53703Z0 = false;
        this.f53704a1 = true;
        this.f53705b1 = false;
        this.f53706c1 = false;
        this.f53707d1 = new Runnable() {
            public void run() {
                boolean z;
                boolean z2;
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                int i = ScanUIRectView.f53671n1;
                if (scanUIRectView.mo24383l()) {
                    ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                    if (!scanUIRectView2.f53703Z0) {
                        scanUIRectView2.f53704a1 = false;
                        scanUIRectView2.f53703Z0 = true;
                        C19016e1 e1Var = C19016e1.f53424a;
                        Log.m105924i("MicroMsg.ScanReporter", "alvinluo reportOnPreviewFrameNotCalled");
                        C115669n.INSTANCE.mo175911u(1259, 0);
                        ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                        C22768r rVar = scanUIRectView3.f53698V0;
                        if (rVar != null) {
                            int i2 = rVar.f65483g;
                            Object[] objArr = new Object[2];
                            objArr[0] = Integer.valueOf(i2);
                            C22768r rVar2 = scanUIRectView3.f53698V0;
                            if (i2 == 1) {
                                z = rVar2.f65484h;
                            } else if (i2 != 2) {
                                rVar2.getClass();
                                z = false;
                            } else {
                                z = rVar2.f65485i;
                            }
                            objArr[1] = Boolean.valueOf(z);
                            Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo checkAndRetry retryType: %d, canRetry: %b", objArr);
                            C22768r rVar3 = scanUIRectView3.f53698V0;
                            if (i2 == 1) {
                                z2 = rVar3.f65484h;
                            } else if (i2 != 2) {
                                rVar3.getClass();
                                z2 = false;
                            } else {
                                z2 = rVar3.f65485i;
                            }
                            if (!z2) {
                                return;
                            }
                            if (i2 == 1) {
                                scanUIRectView3.f53698V0.f65491o = true;
                                C19016e1.m20091y(1);
                                try {
                                    Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo checkAndReopenCamera");
                                    scanUIRectView3.mo27897h(new C21003d.C21004a() {
                                        /* renamed from: a */
                                        public void mo24438a() {
                                            ScanUIRectView scanUIRectView = ScanUIRectView.this;
                                            scanUIRectView.f53700W0 = 1;
                                            scanUIRectView.f53706c1 = true;
                                            Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onCameraOpened");
                                            ((C112475a) scanUIRectView.f56970e).mo164194s(false);
                                            scanUIRectView.mo27898i(new C108261e.C108262a() {
                                                /* renamed from: a */
                                                public void mo24458a() {
                                                    Log.m105924i("MicroMsg.ScanUIRectView", "cameraStartPreviewed  onCameraOpened");
                                                    ScanUIRectView.this.mo24382k(0);
                                                }
                                            });
                                        }
                                    });
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "alvinluo checkAnReopenCamera exception", new Object[0]);
                                }
                            } else if (i2 == 2) {
                                scanUIRectView3.f53698V0.f65491o = true;
                                scanUIRectView3.f53706c1 = true;
                                scanUIRectView3.f53700W0 = i2;
                                C19016e1.m20091y(2);
                                scanUIRectView3.mo24368B(0);
                            }
                        }
                    }
                }
            }
        };
        this.f53708e1 = 0;
        this.f53709f1 = 0;
        this.f53710g1 = new C19938f.C19941c() {
            /* renamed from: a */
            public void mo24429a(long j, long j2) {
                Log.m105925i("MicroMsg.ScanUIRectView", "postTakeShot  session:%d  delay:%d", Long.valueOf(j), Long.valueOf(j2));
                final long j3 = j;
                final long j4 = j2;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        long j = j3;
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        if (j == scanUIRectView.f53726w && j != 0) {
                            scanUIRectView.mo24382k(j4);
                        }
                    }
                });
            }

            /* renamed from: b */
            public void mo24430b(final long j, final Bundle bundle) {
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        Bundle bundle;
                        try {
                            long j = j;
                            if (j == ScanUIRectView.this.f53726w && j != 0 && (bundle = bundle) != null && bundle.containsKey("param_zoom_ratio")) {
                                float f = bundle.getFloat("param_zoom_ratio", 0.0f);
                                Log.m105925i("MicroMsg.ScanUIRectView", "zoom to scale %f", Float.valueOf(f));
                                if (f > 0.0f) {
                                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                                    if (scanUIRectView.f53697V && ((C108258a) scanUIRectView.f56970e).f324141c) {
                                        ((C108258a) ScanUIRectView.this.f56970e).mo158655q((int) (((float) ((C108258a) ScanUIRectView.this.f56970e).mo158641c()) * f));
                                        C19933b.f56833H.mo27308a(f);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "zoomToScale exception", new Object[0]);
                        }
                    }
                });
            }

            /* renamed from: c */
            public void mo24431c(long j, List<C19931a.C19932a> list, List<QbarNative.QBarPoint> list2, List<WxQbarNative.QBarReportMsg> list3, Bundle bundle) {
                Log.m105918d("MicroMsg.ScanUIRectView", String.format("scan code after decode %d", new Object[]{Long.valueOf(j)}));
                if (list == null || list.isEmpty()) {
                    return;
                }
                final long j2 = j;
                final List<C19931a.C19932a> list4 = list;
                final List<WxQbarNative.QBarReportMsg> list5 = list3;
                final List<QbarNative.QBarPoint> list6 = list2;
                final Bundle bundle2 = bundle;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        QbarNative.QBarPoint qBarPoint;
                        WxQbarNative.QBarReportMsg qBarReportMsg;
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        long j = scanUIRectView.f53726w;
                        long j2 = j2;
                        if (j == j2 && j2 != 0) {
                            scanUIRectView.mo24367A();
                            ArrayList arrayList = new ArrayList();
                            List list = list4;
                            if (list != null && !list.isEmpty()) {
                                Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess result size: %d", Integer.valueOf(list4.size()));
                                int i = 0;
                                for (int i2 = 0; i2 < list4.size(); i2++) {
                                    C19931a.C19932a aVar = (C19931a.C19932a) list4.get(i2);
                                    WxQBarResult wxQBarResult = new WxQBarResult(aVar.f56827d, aVar.f56828e, aVar.f56829f, aVar.f56830g, aVar.f56831h, aVar.f56832i);
                                    Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess result index: %d, format: %d, content:%s", Integer.valueOf(i2), Integer.valueOf(wxQBarResult.f56827d), wxQBarResult.f56829f);
                                    List list2 = list5;
                                    if (!(list2 == null || list2.size() < i2 + 1 || (qBarReportMsg = (WxQbarNative.QBarReportMsg) list5.get(i2)) == null)) {
                                        wxQBarResult.f56823j = qBarReportMsg.qrcodeVersion;
                                    }
                                    List list3 = list6;
                                    if (!(list3 == null || list3.size() < i2 + 1 || (qBarPoint = (QbarNative.QBarPoint) list6.get(i2)) == null)) {
                                        wxQBarResult.f56824n = new WxQBarPoint(qBarPoint);
                                        i++;
                                    }
                                    arrayList.add(wxQBarResult);
                                }
                                Bundle bundle = new Bundle();
                                bundle.putParcelableArrayList("result_qbar_result_list", arrayList);
                                bundle.putInt("result_code_point_count", i);
                                Bundle bundle2 = bundle2;
                                if (bundle2 != null) {
                                    bundle.putAll(bundle2);
                                }
                                BaseScanMaskView baseScanMaskView = ScanUIRectView.this.f53721r;
                                if (baseScanMaskView != null && (baseScanMaskView instanceof ScanCodeMaskView)) {
                                    ((ScanCodeMaskView) baseScanMaskView).mo151722D();
                                }
                                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                                ScanCallBack scanCallBack = scanUIRectView2.f53727x;
                                if (scanCallBack != null) {
                                    scanCallBack.mo24353a(scanUIRectView2.f53726w, bundle);
                                }
                            }
                        }
                    }
                });
            }

            /* renamed from: d */
            public void mo24432d(byte[] bArr) {
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                if (!scanUIRectView.f53730y0) {
                    Log.m105928w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                } else if (scanUIRectView.f53688Q0) {
                    Log.m105928w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                } else {
                    try {
                        if (((C108258a) scanUIRectView.f56970e).f324140b) {
                            C20469e eVar = C20469e.f57530v;
                            C108267t tVar = ScanUIRectView.this.f56970e;
                            eVar.mo32017a(bArr, ((C108258a) tVar).f324142d, ((C108258a) tVar).f324147i, ((C112475a) tVar).f324139a.getParameters().getPreviewFormat(), true);
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "", new Object[0]);
                    }
                }
            }
        };
        this.f53711h1 = new C20461a.C20463b() {
            /* renamed from: a */
            public void mo24446a(long j, long j2) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo postTakeShot session: %d, delay: %d", Long.valueOf(j), Long.valueOf(j2));
                final long j3 = j;
                final long j4 = j2;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        long j = scanUIRectView.f53726w;
                        if (j == j3 && j != 0) {
                            scanUIRectView.mo24382k(j4);
                        }
                    }
                });
            }

            /* renamed from: b */
            public void mo24447b(final long j, final Bundle bundle) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess %d", Long.valueOf(j));
                if (bundle != null && bundle.getBoolean("result_is_best_img", false)) {
                    ScanUIRectView.this.post(new Runnable() {
                        public void run() {
                            ScanCallBack scanCallBack;
                            long j = j;
                            ScanUIRectView scanUIRectView = ScanUIRectView.this;
                            long j2 = scanUIRectView.f53726w;
                            if (j == j2 && j2 != 0 && (scanCallBack = scanUIRectView.f53727x) != null) {
                                scanCallBack.mo24353a(j2, bundle);
                            }
                        }
                    });
                }
            }

            /* renamed from: c */
            public void mo24448c(final C106084y0 y0Var) {
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        C106084y0 y0Var = y0Var;
                        if (y0Var != null) {
                            BaseScanMaskView baseScanMaskView = ScanUIRectView.this.f53721r;
                            if (baseScanMaskView instanceof ScanGoodsMaskView) {
                                ScanGoodsMaskView scanGoodsMaskView = (ScanGoodsMaskView) baseScanMaskView;
                                scanGoodsMaskView.getClass();
                                if (scanGoodsMaskView.f316134s) {
                                    Log.m105924i("MicroMsg.ScanGoodsMaskView", "alvinluo addAnimationScanDots isViewDestroy");
                                    return;
                                }
                                ScanPoint[] scanPointArr = y0Var.f315843a;
                                if (scanPointArr != null) {
                                    Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo addAnimationScanDots size: %d", Integer.valueOf(y0Var.f315844b));
                                    int i = y0Var.f315844b;
                                    int i2 = 0;
                                    while (true) {
                                        Float f = null;
                                        if (i2 >= i) {
                                            break;
                                        }
                                        ScanPoint scanPoint = (ScanPoint) C110823p.m150982H(scanPointArr, i2);
                                        Object[] objArr = new Object[3];
                                        objArr[0] = scanPoint != null ? Integer.valueOf(scanPoint.getId()) : null;
                                        objArr[1] = scanPoint != null ? Float.valueOf(scanPoint.getX()) : null;
                                        if (scanPoint != null) {
                                            f = Float.valueOf(scanPoint.getY());
                                        }
                                        objArr[2] = f;
                                        Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo getPointObjects id: %d, x: %f, y: %f", objArr);
                                        i2++;
                                    }
                                    ScanAnimationDotsView scanAnimationDotsView = scanGoodsMaskView.f315928v;
                                    if (scanAnimationDotsView != null) {
                                        Log.m105927v("MicroMsg.ScanAnimationDotsView", "alvinluo addAnimationDots size: %d", Integer.valueOf(y0Var.f315844b));
                                        C111019e eVar = scanAnimationDotsView.f315895e;
                                        if (eVar != null) {
                                            ((C111012a) eVar).mo162696b(y0Var);
                                            return;
                                        }
                                        return;
                                    }
                                    C87412m.m108603p("animationDotsView");
                                    throw null;
                                }
                            }
                        }
                    }
                });
            }
        };
        this.f53712i1 = new C92411b.C92412a() {
            public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
                float f3 = f;
                float f4 = f2;
                Log.m105925i("MicroMsg.ScanUIRectView", "onGetLocation %s", Boolean.valueOf(z));
                if (!z) {
                    Log.m105924i("MicroMsg.ScanUIRectView", "check permission not passed!");
                    if (!ScanUIRectView.this.f53693T && !LocationUtil.isGpsEnable()) {
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        scanUIRectView.f53693T = true;
                        C76879j.m92709C(scanUIRectView.getContext(), ScanUIRectView.this.getContext().getString(C0966R.string.fez), ScanUIRectView.this.getContext().getString(C0966R.string.a3h), ScanUIRectView.this.getContext().getString(C0966R.string.fyd), ScanUIRectView.this.getContext().getString(C0966R.string.f7926wf), false, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                LocationUtil.jumpToOpenGps(ScanUIRectView.this.getContext());
                            }
                        }, (DialogInterface.OnClickListener) null);
                    }
                    return true;
                }
                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                if (scanUIRectView2.f53695U) {
                    Log.m105924i("MicroMsg.ScanUIRectView", "ignore, has get lbs!");
                    return false;
                }
                BaseScanMaskView baseScanMaskView = scanUIRectView2.f53721r;
                if (baseScanMaskView != null && (baseScanMaskView instanceof ScanCodeMaskView)) {
                    ((ScanCodeMaskView) baseScanMaskView).mo151722D();
                }
                ScanUIRectView.this.f53695U = true;
                int i2 = (int) d2;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2012, f, f2, i2);
                if (ScanUIRectView.this.f53727x != null) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("result_lbs_latitude", f2);
                    bundle.putFloat("result_lbs_longitude", f);
                    bundle.putInt("result_lbs_accuracy", i2);
                    int i3 = i;
                    bundle.putInt("result_lbs_source", i);
                    ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                    scanUIRectView3.f53727x.mo24353a(scanUIRectView3.f53726w, bundle);
                }
                return false;
            }
        };
        this.f53713j1 = new IListener<ScanFlashSwitchEvent>(C40008f.f107254d) {
            {
                this.__eventId = 208336003;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanFlashSwitchEvent) iEvent).f48122d.f48123a == 1) {
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    int i = ScanUIRectView.f53671n1;
                    C112475a aVar = (C112475a) scanUIRectView.f56970e;
                    if (!aVar.f324148j) {
                        aVar.mo164196u();
                    }
                } else {
                    ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                    int i2 = ScanUIRectView.f53671n1;
                    C112475a aVar2 = (C112475a) scanUIRectView2.f56970e;
                    if (aVar2.f324148j) {
                        aVar2.mo164193r();
                    }
                }
                return true;
            }
        };
        this.f53714k1 = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            public boolean onContextClick(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                Log.m105919d("MicroMsg.ScanUIRectView", "double click,pointer:%d,x:%f,y:%f", Integer.valueOf(motionEvent.getActionIndex()), Float.valueOf(motionEvent.getX(motionEvent.getActionIndex())), Float.valueOf(motionEvent.getY(motionEvent.getActionIndex())));
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                int i = ScanUIRectView.f53671n1;
                ((C108258a) scanUIRectView.f56970e).mo158654p(5);
                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                C19016e1.m20088v(scanUIRectView2.f53724u, 3, scanUIRectView2.f53730y0);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo onFling velocityX: %f, velocityY: %f, canScrollSwitchTab: %b, enableScrollSwitchTab: %b, isMultiTouch: %b", Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(ScanUIRectView.this.f53681J), Boolean.valueOf(ScanUIRectView.this.f53680I), Boolean.valueOf(ScanUIRectView.this.f53685N));
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                if (!scanUIRectView.f53685N && scanUIRectView.f53680I && Math.abs(f) > Math.abs(f2)) {
                    if (f < -1200.0f) {
                        ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                        if (scanUIRectView2.f53681J) {
                            C111203g0 g0Var = scanUIRectView2.f53679H;
                            if (g0Var != null) {
                                g0Var.mo162952e();
                            }
                            ScanUIRectView.this.f53681J = false;
                        }
                    }
                    if (f > 1200.0f) {
                        ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                        if (scanUIRectView3.f53681J) {
                            C111203g0 g0Var2 = scanUIRectView3.f53679H;
                            if (g0Var2 != null) {
                                g0Var2.mo162953f();
                            }
                            ScanUIRectView.this.f53681J = false;
                        }
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }

            public void onLongPress(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
        this.f53716m1 = new TakeShotByTextureHandler(Looper.getMainLooper());
    }

    private Rect getScanCodeRect() {
        if (C19936d.f56883f) {
            return getDecorRect();
        }
        Rect decorRect = getDecorRect();
        Point point = new Point();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        int height = (int) (((float) decorRect.height()) * 0.5f);
        int width = ((int) (((float) decorRect.width()) * 0.5f)) / 2;
        int i = decorRect.left - width;
        rect.left = i;
        int i2 = decorRect.right + width;
        rect.right = i2;
        int i3 = height / 2;
        int i4 = decorRect.top - i3;
        rect.top = i4;
        int i5 = decorRect.bottom + i3;
        rect.bottom = i5;
        if (i < 0) {
            i = 0;
        }
        rect.left = i;
        int i6 = point.x;
        if (i2 > i6) {
            i2 = i6;
        }
        rect.right = i2;
        if (i4 < 0) {
            i4 = 0;
        }
        rect.top = i4;
        int i7 = point.y;
        if (i5 > i7) {
            i5 = i7;
        }
        rect.bottom = i5;
        return rect;
    }

    private int getScanCodeTabType() {
        if (this.f53730y0) {
            C19933b bVar = C19933b.f56833H;
            return 4;
        }
        C19933b bVar2 = C19933b.f56833H;
        return 1;
    }

    private C19938f.C19942d getSessionInfo() {
        C19938f.C19942d dVar = new C19938f.C19942d();
        dVar.f56928b = C19016e1.m20073e(this.f53724u);
        dVar.f56927a = C19016e1.m20074f(this.f53724u);
        return dVar;
    }

    /* renamed from: A */
    public void mo24367A() {
        Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo stopCurrentSession %d", Long.valueOf(this.f53726w));
        C19938f.f56890w.mo27330h(this.f53726w);
        C20461a aVar = C20461a.f57497j;
        long j = this.f53726w;
        synchronized (aVar.f57498a) {
            if (aVar.f57500c == j) {
                aVar.f57500c = 0;
                aVar.f57504g = null;
                ((HashMap) aVar.f57503f).clear();
            }
        }
        C20469e eVar = C20469e.f57530v;
        if (eVar.f57537e) {
            eVar.mo32021f();
        }
        eVar.f57538f = 0;
        C20469e.m22085e(new C20476g(eVar));
        this.f53726w = 0;
    }

    /* renamed from: B */
    public final void mo24368B(long j) {
        long currentTimeMillis = System.currentTimeMillis() - this.f53715l1;
        long j2 = (long) 80;
        if (currentTimeMillis > j2) {
            this.f53716m1.removeMessages(0);
            this.f53716m1.sendEmptyMessageDelayed(0, j);
            return;
        }
        this.f53716m1.removeMessages(0);
        this.f53716m1.sendEmptyMessageDelayed(0, j + (j2 - currentTimeMillis));
    }

    /* renamed from: C */
    public final void mo24369C() {
        if (C19936d.f56883f) {
            Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo updateScanCodeRect visibleResolution: %s", this.f53686P);
            Point point = this.f53686P;
            if (point != null && point.x > 0 && point.y > 0) {
                ScanRectDecorView scanRectDecorView = this.f53717o;
                Point point2 = this.f53686P;
                int i = point2.y;
                scanRectDecorView.setDecorRect(new Rect(0, (int) ((((float) i) * 1.0f) / 19.0f), point2.x, (int) ((((float) i) * 17.0f) / 19.0f)));
                return;
            }
            return;
        }
        this.f53717o.mo24541c(getResources().getDimensionPixelSize(C0966R.dimen.alk), getResources().getDimensionPixelSize(C0966R.dimen.alj));
    }

    /* renamed from: b */
    public void mo24370b() {
        this.f56970e = new C112475a();
    }

    /* renamed from: d */
    public void mo24371d() {
        String str;
        String str2;
        TextureView textureView = new TextureView(getContext());
        this.f56969d = textureView;
        textureView.setSurfaceTextureListener(this);
        addView(this.f56969d, new FrameLayout.LayoutParams(-1, -1));
        mo24370b();
        this.f56972g = getResources().getConfiguration().orientation;
        mo24374g(new C21001c.C21002a() {
            /* renamed from: a */
            public void mo24425a() {
                StringBuilder sb = new StringBuilder();
                sb.append("init open Camera: ");
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                int i = ScanUIRectView.f53671n1;
                sb.append(((C108258a) scanUIRectView.f56970e).f324140b);
                sb.append(", hasCameraPermission: ");
                sb.append(ScanUIRectView.this.f53689R);
                sb.append(", enterScene:");
                sb.append(ScanUIRectView.this.f53691S);
                sb.append(", cameraFacing:");
                sb.append(((C108258a) ScanUIRectView.this.f56970e).f324153o);
                Log.m105924i("MicroMsg.ScanUIRectView", sb.toString());
                boolean z = ((C108258a) ScanUIRectView.this.f56970e).f324140b;
                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                C30390i.m39055a(z, scanUIRectView2.f53689R, "", scanUIRectView2.f53691S, ((C108258a) scanUIRectView2.f56970e).f324153o);
            }
        });
        this.f53717o = new ScanRectDecorView(getContext());
        if (this.f53728x0) {
            MultiProcessMMKV multiProcessMMKV = C19021i0.f53459e;
            if (multiProcessMMKV == null || (str = multiProcessMMKV.getString("scan_config_guide_wording", "")) == null) {
                str = "";
            }
            if (!(str.length() == 0)) {
                try {
                    String applicationLanguage = LocaleUtil.getApplicationLanguage();
                    JSONObject jSONObject = new JSONObject(str);
                    Log.m105925i("MicroMsg.ScanFastFocusEngineManager", "getScanGoodsGuideWording currentLanguage: %s", applicationLanguage);
                    if (C87412m.m108589b(applicationLanguage, "zh_CN")) {
                        str2 = jSONObject.optString("desc_chinese");
                    } else if (C87412m.m108589b(applicationLanguage, "en")) {
                        str2 = jSONObject.optString("desc_english");
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ScanFastFocusEngineManager", e, "getScanGoodsGuideWording exception", new Object[0]);
                }
                this.f53729y = str2;
            }
            str2 = null;
            this.f53729y = str2;
        }
        if (this.f53730y0) {
            MultiProcessMMKV multiProcessMMKV2 = C19021i0.f53459e;
            String string = multiProcessMMKV2 != null ? multiProcessMMKV2.getString("scan_config_scan_merge_wording", "") : null;
            if (string == null) {
                string = "";
            }
            this.f53731z = string;
            Context context = getContext();
            C87412m.m108594g(context, "context");
            MultiProcessMMKV multiProcessMMKV3 = C19021i0.f53459e;
            String string2 = multiProcessMMKV3 != null ? multiProcessMMKV3.getString("scan_config_scan_retrieval_lite_succ_wording", "") : null;
            if (string2 == null || C112551y.m153811k(string2)) {
                Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "getScanMergeProductEducationWording , return default wording");
                string2 = context.getString(C0966R.string.m99);
                C87412m.m108593f(string2, "context.getString(R.stri…ducation_wording_default)");
            } else {
                Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "getScanMergeProductEducationWording , return tips:" + string2);
            }
            this.f53672A = string2;
        }
        Log.m105925i("MicroMsg.ScanUIRectView", "initScanTips enableScanGoodsWording: %b, scanGoodsTips: %s, scanMergeTips: %s, scanMergeProductEducationTips: %s", Boolean.valueOf(this.f53728x0), this.f53729y, this.f53731z, this.f53672A);
        addView(this.f53717o, new FrameLayout.LayoutParams(-1, -1));
        Context context2 = getContext();
        C87412m.m108594g(context2, "context");
        ScanSharedMaskView scanSharedMaskView = new ScanSharedMaskView(context2, (AttributeSet) null);
        this.f53720q = scanSharedMaskView;
        this.f53723t = scanSharedMaskView.getFlashSwitcherView();
        addView(this.f53720q, new FrameLayout.LayoutParams(-1, -1));
        mo24421x();
        mo24420w(false);
    }

    /* renamed from: e */
    public void mo24372e() {
        super.mo24372e();
        Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onPause");
        Runnable runnable = this.f53707d1;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView != null) {
            baseScanMaskView.mo151732l();
        }
        mo24367A();
    }

    /* renamed from: f */
    public void mo24373f() {
        super.mo24373f();
        if (!((C108258a) this.f56970e).f324140b) {
            Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onResume openCamera");
            mo24374g(new C21001c.C21002a() {
                /* renamed from: a */
                public void mo24425a() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onResume open Camera: ");
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    int i = ScanUIRectView.f53671n1;
                    sb.append(((C108258a) scanUIRectView.f56970e).f324140b);
                    sb.append(", hasCameraPermission: ");
                    sb.append(ScanUIRectView.this.f53689R);
                    sb.append(", enterScene:");
                    sb.append(ScanUIRectView.this.f53691S);
                    sb.append(", cameraFacing:");
                    sb.append(((C108258a) ScanUIRectView.this.f56970e).f324153o);
                    Log.m105924i("MicroMsg.ScanUIRectView", sb.toString());
                    boolean z = ((C108258a) ScanUIRectView.this.f56970e).f324140b;
                    ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                    C30390i.m39055a(z, scanUIRectView2.f53689R, "", scanUIRectView2.f53691S, ((C108258a) scanUIRectView2.f56970e).f324153o);
                }
            });
        } else if (!((C108258a) this.f56970e).f324141c) {
            Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onResume startPreview");
            ((C112475a) this.f56970e).mo164194s(false);
            mo27898i(new C108261e.C108262a() {
                /* renamed from: a */
                public void mo24458a() {
                    Log.m105924i("MicroMsg.ScanUIRectView", "cameraStartPreviewed  onResume");
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    int i = ScanUIRectView.f53671n1;
                    ((C112475a) scanUIRectView.f56970e).mo158650l();
                    ScanUIRectView.this.mo24382k(0);
                }
            });
            Log.m105925i("MicroMsg.ScanUIRectView", "focus mode %s", ((C108258a) this.f56970e).mo158642d(false));
        } else {
            Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onResume camera is previewing");
            Log.m105925i("MicroMsg.ScanUIRectView", "focus mode %s", ((C108258a) this.f56970e).mo158642d(false));
            mo24382k(0);
        }
        Log.m105925i("MicroMsg.ScanUIRectView", "onResume %s", Util.getStack());
        this.f53726w = System.currentTimeMillis();
        if (mo24383l()) {
            C19938f.f56890w.mo27329g(this.f53726w, getScanCodeTabType(), getSessionInfo(), this.f53710g1);
            C20469e.f57530v.mo32019c();
        } else if (this.f53724u == 12) {
            Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo onResume currentNetworkAvailable: %b", Boolean.valueOf(this.f53676E));
            if (this.f53676E) {
                C20461a aVar = C20461a.f57497j;
                long j = this.f53726w;
                C20461a.C20463b bVar = this.f53711h1;
                synchronized (aVar.f57498a) {
                    aVar.f57500c = j;
                    aVar.f57504g = bVar;
                }
                synchronized (aVar.f57499b) {
                    if (aVar.f57501d && C19021i0.f53461g) {
                        Log.m105918d("MicroMsg.ScanFastFocusEngineManager", "alvinluo focusEngineNative reset");
                        C19021i0.f53460f.reset();
                    }
                }
            } else {
                C20461a aVar2 = C20461a.f57497j;
                long j2 = this.f53726w;
                synchronized (aVar2.f57498a) {
                    if (aVar2.f57500c == j2) {
                        aVar2.f57500c = 0;
                        aVar2.f57504g = null;
                        ((HashMap) aVar2.f57503f).clear();
                    }
                }
            }
        }
        this.f53695U = false;
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView != null) {
            baseScanMaskView.mo151733n();
        }
        MMHandlerThread.postToMainThreadDelayed(new Runnable() {
            public void run() {
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                BaseScanRequest baseScanRequest = scanUIRectView.f53719p0;
                if (baseScanRequest == null || !baseScanRequest.f248898f) {
                    ScanCameraLightDetector.f53829f.mo24506c(((C112475a) scanUIRectView.f56970e).mo158642d(true));
                }
            }
        }, 300);
        this.f53692S0 = true;
    }

    /* renamed from: g */
    public void mo24374g(final C21001c.C21002a aVar) {
        if (!this.f53687Q) {
            Log.m105928w("MicroMsg.ScanUIRectView", "openCamera not enable and stop");
        } else {
            super.mo24374g(new C21001c.C21002a() {
                /* renamed from: a */
                public void mo24425a() {
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    int i = ScanUIRectView.f53671n1;
                    scanUIRectView.getClass();
                    Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onCameraOpened");
                    ((C112475a) scanUIRectView.f56970e).mo164194s(false);
                    scanUIRectView.mo27898i(new C108261e.C108262a() {
                        /* renamed from: a */
                        public void mo24458a() {
                            Log.m105924i("MicroMsg.ScanUIRectView", "cameraStartPreviewed  onCameraOpened");
                            ScanUIRectView.this.mo24382k(0);
                        }
                    });
                    C21001c.C21002a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo24425a();
                    }
                }
            });
        }
    }

    public Rect getDecorRect() {
        return this.f53717o.getDecorRect();
    }

    public C108267t getScanCamera() {
        return this.f56970e;
    }

    public BaseScanMaskView getScanMaskView() {
        return this.f53721r;
    }

    public ScanProductMaskDecorView getScanProductMaskDecorView() {
        return this.f53718p;
    }

    public ScanSharedMaskView getSharedMaskView() {
        return this.f53720q;
    }

    public TextureView getTextrueView() {
        return this.f56969d;
    }

    /* renamed from: j */
    public void mo24381j() {
        super.mo24381j();
        this.f53690R0 = true;
        this.f53692S0 = false;
    }

    /* renamed from: k */
    public void mo24382k(long j) {
        this.f53699W = true;
        boolean z = false;
        Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo takeOneShot timeout: %d, isRetry: %b, onPreviewFrameCalled: %b, canReportOnPreviewFrame: %b, hasReport: %b", Long.valueOf(this.f53702Y0), Boolean.valueOf(this.f53706c1), Boolean.valueOf(this.f53705b1), Boolean.valueOf(this.f53704a1), Boolean.valueOf(this.f53703Z0));
        if (!this.f53706c1) {
            super.mo24382k(j);
            this.f53701X0 = System.currentTimeMillis();
            if (!this.f53705b1 && this.f53704a1 && mo24383l()) {
                removeCallbacks(this.f53707d1);
                postDelayed(this.f53707d1, this.f53702Y0);
                return;
            }
            return;
        }
        C22768r rVar = this.f53698V0;
        if (rVar != null) {
            int i = this.f53700W0;
            if (i == 1) {
                z = rVar.f65484h;
            } else if (i == 2) {
                z = rVar.f65485i;
            }
            if (!z) {
                return;
            }
            if (i == 1) {
                super.mo24382k(j);
                this.f53701X0 = System.currentTimeMillis();
            } else if (i == 2) {
                mo24368B(j);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo24383l() {
        return C37751c0.m41521a(this.f53724u);
    }

    /* renamed from: m */
    public void mo24384m() {
        com.tencent.stubs.logger.Log.m106505i("ScanView", "onCreate");
        mo24371d();
        this.f53684M = (int) (((float) C76577a.m92145A(getContext())) / 4.5f);
        if (mo24383l()) {
            C19938f.f56890w.mo27327e(getContext());
        }
        C19938f.f56890w.f56891a = new C30384o1();
        setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: d */
            public float f53778d;

            /* renamed from: e */
            public boolean f53779e = false;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent2);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                Log.m105919d("MicroMsg.ScanUIRectView", "pointIndex:%d, action: %d", Integer.valueOf(actionIndex), Integer.valueOf(actionMasked));
                if (actionMasked == 0) {
                    Log.m105919d("MicroMsg.ScanUIRectView", "first down,pointer:%d,x:%f,y:%f", Integer.valueOf(actionIndex), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
                    ScanUIRectView.this.f53683L = motionEvent.getRawX();
                    ScanUIRectView.this.f53681J = true;
                    this.f53779e = false;
                } else if (actionMasked == 1) {
                    Log.m105919d("MicroMsg.ScanUIRectView", "last up,pointer:%d,x:%f,y:%f", Integer.valueOf(actionIndex), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
                    if (motionEvent.getPointerCount() == 2) {
                        this.f53778d = (float) (Math.pow((double) (motionEvent2.getX(0) - motionEvent2.getX(1)), 2.0d) + Math.pow((double) (motionEvent2.getY(0) - motionEvent2.getY(1)), 2.0d));
                    }
                } else if (actionMasked != 2) {
                    if (actionMasked == 5) {
                        Log.m105919d("MicroMsg.ScanUIRectView", "down,pointer:%d,x:%f,y:%f", Integer.valueOf(actionIndex), Float.valueOf(motionEvent2.getX(actionIndex)), Float.valueOf(motionEvent2.getY(actionIndex)));
                        if (motionEvent.getPointerCount() == 2) {
                            this.f53778d = (float) (Math.pow((double) (motionEvent2.getX(0) - motionEvent2.getX(1)), 2.0d) + Math.pow((double) (motionEvent2.getY(0) - motionEvent2.getY(1)), 2.0d));
                            ScanUIRectView.this.f53685N = true;
                        }
                        this.f53779e = false;
                    } else if (actionMasked == 6) {
                        Log.m105919d("MicroMsg.ScanUIRectView", "up,pointer:%d,x:%f,y:%f", Integer.valueOf(actionIndex), Float.valueOf(motionEvent2.getX(actionIndex)), Float.valueOf(motionEvent2.getY(actionIndex)));
                        if (motionEvent.getPointerCount() == 2) {
                            this.f53778d = (float) (Math.pow((double) (motionEvent2.getX(0) - motionEvent2.getX(1)), 2.0d) + Math.pow((double) (motionEvent2.getY(0) - motionEvent2.getY(1)), 2.0d));
                            if (this.f53779e) {
                                this.f53779e = false;
                                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                                C19016e1.m20088v(scanUIRectView.f53724u, 4, scanUIRectView.f53730y0);
                            }
                        }
                    }
                } else if (motionEvent.getPointerCount() == 2) {
                    Log.m105919d("MicroMsg.ScanUIRectView", "move,pointer:0,x:%f,y:%f", Float.valueOf(motionEvent2.getX(0)), Float.valueOf(motionEvent2.getY(0)));
                    Log.m105919d("MicroMsg.ScanUIRectView", "move,pointer:1,x:%f,y:%f", Float.valueOf(motionEvent2.getX(1)), Float.valueOf(motionEvent2.getY(1)));
                    float pow = (float) (Math.pow((double) (motionEvent2.getX(0) - motionEvent2.getX(1)), 2.0d) + Math.pow((double) (motionEvent2.getY(0) - motionEvent2.getY(1)), 2.0d));
                    Log.m105919d("MicroMsg.ScanUIRectView", "distance:%f,lastDistance:%f,min move:%f", Float.valueOf(pow), Float.valueOf(this.f53778d), Float.valueOf(400.0f));
                    if (Math.abs(pow - this.f53778d) > 400.0f) {
                        ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                        if (scanUIRectView2.f53697V) {
                            scanUIRectView2.f53697V = false;
                        }
                        if (pow - this.f53778d > 0.0f) {
                            ((C108258a) scanUIRectView2.f56970e).mo158654p(2);
                            this.f53779e = true;
                        } else {
                            ((C108258a) scanUIRectView2.f56970e).mo158654p(3);
                            this.f53779e = true;
                        }
                        this.f53778d = pow;
                    }
                } else if (motionEvent.getPointerCount() == 1) {
                    ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                    if (scanUIRectView3.f53680I && !scanUIRectView3.f53685N) {
                        float rawX = motionEvent.getRawX() - ScanUIRectView.this.f53683L;
                        Log.m105927v("MicroMsg.ScanUIRectView", "alvinluo onTouchEvent offsetX: %f, canScrollSwitchTab: %b", Float.valueOf(rawX), Boolean.valueOf(ScanUIRectView.this.f53681J));
                        ScanUIRectView scanUIRectView4 = ScanUIRectView.this;
                        int i = scanUIRectView4.f53684M;
                        if (rawX >= ((float) i) && scanUIRectView4.f53681J) {
                            C111203g0 g0Var = scanUIRectView4.f53679H;
                            if (g0Var != null) {
                                g0Var.mo162953f();
                            }
                            ScanUIRectView.this.f53681J = false;
                        } else if (rawX <= ((float) (-i)) && scanUIRectView4.f53681J) {
                            C111203g0 g0Var2 = scanUIRectView4.f53679H;
                            if (g0Var2 != null) {
                                g0Var2.mo162952e();
                            }
                            ScanUIRectView.this.f53681J = false;
                        }
                    }
                }
                GestureDetector gestureDetector = ScanUIRectView.this.f53714k1;
                C9556a aVar = new C9556a();
                aVar.mo10233c(motionEvent2);
                GestureDetector gestureDetector2 = gestureDetector;
                C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$20", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$20", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                if (motionEvent.getAction() == 1) {
                    ScanUIRectView.this.f53685N = false;
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        });
        this.f53713j1.alive();
        C22768r rVar = this.f53698V0;
        if (rVar != null) {
            rVar.f65487k = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [dl2.e$c, android.hardware.SensorManager, android.hardware.Sensor, java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* renamed from: n */
    public void mo24385n() {
        ? r1;
        C20469e eVar;
        long j;
        com.tencent.stubs.logger.Log.m106505i("ScanView", "onDestroy");
        this.f56969d.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        Log.m105918d("MicroMsg.ScanUIRectView", "alvinluo releaseView");
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView != null) {
            baseScanMaskView.release();
        }
        ScanSharedMaskView scanSharedMaskView = this.f53720q;
        if (scanSharedMaskView != null) {
            Log.m105919d("MicroMsg.ScanSharedMaskView", "alvinluo release hashCode: %d", Integer.valueOf(scanSharedMaskView.hashCode()));
            C22772v vVar = scanSharedMaskView.f53818u;
            if (vVar != null) {
                vVar.mo35867a();
            }
            C22772v vVar2 = scanSharedMaskView.f53819v;
            if (vVar2 != null) {
                vVar2.mo35867a();
            }
        }
        if (this.f53718p != null) {
            for (Map.Entry next : ScanProductMaskDecorView.f316085n.entrySet()) {
                if (!((Bitmap) next.getValue()).isRecycled()) {
                    ((Bitmap) next.getValue()).recycle();
                }
            }
        }
        C19938f.f56890w.mo27328f();
        C20461a aVar = C20461a.f57497j;
        aVar.getClass();
        Log.m105924i("MicroMsg.AiScanImageDecodeQueueNew", "alvinluo release");
        C19021i0.m20105l(new C20467c(aVar));
        C20469e eVar2 = C20469e.f57530v;
        eVar2.getClass();
        Log.m105924i("MicroMsg.ReIdAiScanImageDecodeQueue", "release");
        C20469e.m22085e(new C20475f(eVar2));
        eVar2.f57537e = false;
        eVar2.f57538f = 0;
        eVar2.f57535c = null;
        C20469e.C20472c cVar = eVar2.f57536d;
        if (cVar == null) {
            eVar = eVar2;
            r1 = 0;
        } else {
            C20469e eVar3 = eVar2;
            C115669n.INSTANCE.mo160131h(24190, 0, Integer.valueOf(cVar.f57560a), Integer.valueOf(cVar.f57561b), Integer.valueOf(cVar.f57562c), Integer.valueOf(cVar.f57564e), Integer.valueOf(cVar.f57565f), Integer.valueOf(cVar.f57566g), Integer.valueOf(cVar.f57567h), Integer.valueOf(cVar.f57568i), Integer.valueOf(cVar.f57569j), Integer.valueOf(cVar.f57570k), Integer.valueOf(cVar.f57571l), Integer.valueOf(cVar.f57572m), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.valueOf(cVar.f57563d), Integer.valueOf(cVar.f57573n), Integer.valueOf(cVar.f57574o), Integer.valueOf(cVar.f57575p), Integer.valueOf(cVar.f57576q), Integer.valueOf(cVar.f57577r));
            eVar = eVar3;
            r1 = 0;
        }
        eVar.f57536d = r1;
        eVar.mo32021f();
        eVar.f57539g = r1;
        eVar.f57540h = r1;
        this.f53713j1.dead();
        removeCallbacks(this.f53707d1);
        this.f53707d1 = r1;
        C22768r rVar = this.f53698V0;
        if (rVar != null) {
            long currentTimeMillis = System.currentTimeMillis() - rVar.f65487k;
            rVar.f65488l = currentTimeMillis;
            Log.m105925i("MicroMsg.ScanRetryManager", "alvinluo exitScanUI stayTime: %d, isUpdated: %b, onPreviewFrameCalled: %b, isRetry: %b", Long.valueOf(currentTimeMillis), Boolean.valueOf(rVar.f65482f), Boolean.valueOf(rVar.f65489m), Boolean.valueOf(rVar.f65491o));
            int i = rVar.f65483g;
            boolean z = rVar.f65491o;
            boolean z2 = rVar.f65489m;
            long j2 = rVar.f65488l;
            if (!C19016e1.f53430g) {
                Log.m105928w("MicroMsg.ScanReporter", "alvinluo reportonPreviewFramCalled not camera permission and ignore");
            } else {
                Log.m105925i("MicroMsg.ScanReporter", "alvinluo reportOnPreviewFrameCalled retryType: %d, isRetry: %b, called: %b, stayTime: %d", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j2));
                if (z2) {
                    C115669n.INSTANCE.mo175911u(1259, 28);
                } else if (j2 >= 0 && j2 < 1000) {
                    C115669n.INSTANCE.mo175911u(1259, 23);
                } else if (j2 >= 1000 && j2 < 2000) {
                    C115669n.INSTANCE.mo175911u(1259, 24);
                } else if (j2 >= 2000 && j2 < 3000) {
                    C115669n.INSTANCE.mo175911u(1259, 25);
                } else if (j2 >= 3000 && j2 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    C115669n.INSTANCE.mo175911u(1259, 26);
                } else if (j2 >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    C115669n.INSTANCE.mo175911u(1259, 27);
                }
                if (z && i == 1) {
                    if (z2) {
                        C115669n.INSTANCE.mo175911u(1259, 36);
                    } else {
                        if (j2 >= 0) {
                            j = 1000;
                            if (j2 < 1000) {
                                C115669n.INSTANCE.mo175911u(1259, 31);
                            }
                        } else {
                            j = 1000;
                        }
                        if (j2 >= j && j2 < 2000) {
                            C115669n.INSTANCE.mo175911u(1259, 32);
                        } else if (j2 >= 2000 && j2 < 3000) {
                            C115669n.INSTANCE.mo175911u(1259, 33);
                        } else if (j2 >= 3000 && j2 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                            C115669n.INSTANCE.mo175911u(1259, 34);
                        } else if (j2 >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                            C115669n.INSTANCE.mo175911u(1259, 35);
                        }
                    }
                }
            }
            int i2 = rVar.f65483g;
            boolean z3 = rVar.f65491o;
            boolean z4 = rVar.f65490n;
            Log.m105925i("MicroMsg.ScanReporter", "alvinluo reprotRetryScanResult scanSuccess: %b, isRetry: %b", Boolean.valueOf(z4), Boolean.valueOf(z3));
            if (z3 && i2 == 2) {
                C115669n.INSTANCE.mo175911u(1259, z4 ? 29 : 30);
            }
            boolean z5 = rVar.f65482f;
            if (z5) {
                rVar.mo35861a(rVar.f65478b);
            } else if (!z5) {
                long j3 = rVar.f65479c;
                rVar.f65478b = j3;
                rVar.mo35861a(j3);
                Log.m105925i("MicroMsg.ScanRetryManager", "alvinluo checkAndResetTimeout timeout not updated and reset to %d", Long.valueOf(rVar.f65478b));
            }
        }
        if (mo24383l() && !this.f53699W && C19016e1.f53430g) {
            Log.m105924i("MicroMsg.ScanReporter", "alvinluo reportTakeOneShotNotCalled");
            C115669n.INSTANCE.mo175911u(1259, 2);
        }
    }

    /* renamed from: o */
    public final void mo24386o(boolean z) {
        C71007x0 x0Var;
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView != null) {
            baseScanMaskView.mo151680m(z);
        }
        ScanSharedMaskView scanSharedMaskView = this.f53720q;
        if (scanSharedMaskView != null) {
            scanSharedMaskView.getClass();
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(z);
            View view = scanSharedMaskView.f53809i;
            if (view != null) {
                objArr[1] = Float.valueOf(view.getAlpha());
                Log.m105927v("MicroMsg.ScanSharedMaskView", "alvinluo onPreviewReady isSwitchTab: %b, galleryButton.alpha: %s", objArr);
                if (!z) {
                    View view2 = scanSharedMaskView.f53809i;
                    if (view2 == null) {
                        C87412m.m108603p("galleryButton");
                        throw null;
                    } else if (view2.getVisibility() == 0) {
                        View view3 = scanSharedMaskView.f53809i;
                        if (view3 == null) {
                            C87412m.m108603p("galleryButton");
                            throw null;
                        } else if (view3.getAlpha() < 1.0f) {
                            View view4 = scanSharedMaskView.f53809i;
                            if (view4 != null) {
                                C111557w.m152065a(view4, 0.0f, 1.0f, 200, (Animator.AnimatorListener) null);
                            } else {
                                C87412m.m108603p("galleryButton");
                                throw null;
                            }
                        }
                    }
                }
            } else {
                C87412m.m108603p("galleryButton");
                throw null;
            }
        }
        ScanDebugView scanDebugView = this.f53722s;
        if (scanDebugView != null) {
            scanDebugView.setVisibility(8);
        }
        C71004i iVar = this.f53678G;
        if (!(iVar == null || (x0Var = ((BaseScanUI) iVar).f53545U) == null)) {
            ScanInfoMaskView scanInfoMaskView = x0Var.f205487d;
            if (scanInfoMaskView != null) {
                scanInfoMaskView.getVisibility();
                scanInfoMaskView.setVisibility(8);
                scanInfoMaskView.f205556y = true;
            }
            if (x0Var.f205490g == 4) {
                C19938f fVar = C19938f.f56890w;
                String str = x0Var.f205491h;
                fVar.getClass();
                Log.m105924i("MicroMsg.WxScanDecodeQueue", "markCodeNotRecognizeTemp:" + str);
                if (!(str == null || str.length() == 0)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!fVar.f56912v.containsKey(str)) {
                            fVar.f56912v.put(str, Long.valueOf(currentTimeMillis));
                        } else if (currentTimeMillis - fVar.f56912v.get(str).longValue() > ((long) C37756o.m41530d())) {
                            fVar.f56912v.put(str, Long.valueOf(currentTimeMillis));
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.WxScanDecodeQueue", e, "markCodeNotRecognizeTemp", new Object[0]);
                    }
                }
            }
            x0Var.f205490g = 0;
            x0Var.f205491h = "";
        }
        C111203g0 g0Var = this.f53679H;
        if (g0Var != null) {
            g0Var.mo162949b(true);
        }
    }

    public void onAutoFocus(boolean z, Camera camera) {
        Log.m105925i("MicroMsg.ScanUIRectView", "onAutoFocus %s", Boolean.valueOf(z));
        if (z) {
            this.f53704a1 = false;
            mo24382k(0);
        }
        mo27896c((long) 1000);
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f56973h = 0;
        this.f53705b1 = true;
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(bArr == null);
        objArr[1] = Boolean.valueOf(this.f53690R0);
        objArr[2] = Boolean.valueOf(this.f53692S0);
        Log.m105919d("MicroMsg.ScanUIRectView", "onPreviewFrame null data: %b, isPreviewPaused: %b, canResumePreview: %b", objArr);
        int i = this.f53700W0;
        if (i == 2) {
            C22768r rVar = this.f53698V0;
            if (rVar != null) {
                rVar.getClass();
                Log.m105925i("MicroMsg.ScanRetryManager", "alvinluo cancelRetryType: %d", Integer.valueOf(i));
                if (i == 1) {
                    rVar.f65484h = false;
                } else if (i == 2) {
                    rVar.f65485i = false;
                }
            }
            this.f53706c1 = false;
        }
        removeCallbacks(this.f53707d1);
        C22768r rVar2 = this.f53698V0;
        if (rVar2 != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f53701X0;
            if (!rVar2.f65482f) {
                rVar2.f65482f = true;
                rVar2.f65478b = Math.max(rVar2.f65480d, Math.min(rVar2.f65479c, (long) (((float) currentTimeMillis) * rVar2.f65481e)));
            }
            this.f53698V0.f65489m = true;
        }
        if (this.f53690R0 && this.f53692S0) {
            this.f53690R0 = false;
            this.f53692S0 = false;
            mo24418t(false);
            mo24382k(100);
        } else if (this.f53696U0) {
            Log.m105928w("MicroMsg.ScanUIRectView", "alvinluo onPreviewFrame ignorePreviewFrame");
        } else if (bArr == null) {
            Log.m105928w("MicroMsg.ScanUIRectView", "alvinluo onPreviewFrame data is null");
            mo24382k(0);
            C19016e1 e1Var = C19016e1.f53424a;
            Log.m105924i("MicroMsg.ScanReporter", "alvinluo reportOnPreviewFrameDataNull");
            C115669n.INSTANCE.mo175911u(1259, 1);
        } else {
            Log.m105924i("MicroMsg.ScanUIRectView", "onPreviewFrame");
            mo24419v(bArr);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        Point point = this.f53686P;
        if (point == null || i != point.x || i2 != point.y) {
            if (point == null) {
                this.f53686P = new Point(i, i2);
            }
            if (mo24383l()) {
                mo24369C();
            }
        }
    }

    /* renamed from: p */
    public void mo24390p(final Object obj, final C71029e eVar, boolean z, final boolean z2) {
        if (z) {
            C119179t tVar = C119157j.f356862d;
            C1909213 r0 = new Runnable() {
                public void run() {
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    Object obj = obj;
                    C71029e eVar = eVar;
                    boolean z = z2;
                    int i = ScanUIRectView.f53671n1;
                    scanUIRectView.mo24391q(obj, eVar, z);
                }
            };
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(r0, 200, false);
            return;
        }
        mo24391q(obj, eVar, z2);
    }

    /* renamed from: q */
    public final void mo24391q(Object obj, C71029e eVar, boolean z) {
        C22768r rVar;
        Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onScanSuccess");
        Runnable runnable = this.f53707d1;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        mo24372e();
        mo24381j();
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView != null) {
            baseScanMaskView.mo151681o(obj, eVar);
            this.f53721r.mo151679i(this.f56969d);
        }
        ScanSharedMaskView scanSharedMaskView = this.f53720q;
        if (scanSharedMaskView != null) {
            Log.m105926v("MicroMsg.ScanSharedMaskView", "alvinluo onScanSuccess needAnimation: " + z);
            if (z) {
                View view = scanSharedMaskView.f53809i;
                if (view != null) {
                    C111557w.m152065a(view, 1.0f, 0.0f, 200, (Animator.AnimatorListener) null);
                } else {
                    C87412m.m108603p("galleryButton");
                    throw null;
                }
            }
            C22772v vVar = scanSharedMaskView.f53819v;
            if (vVar != null) {
                vVar.mo35867a();
            }
            C22772v vVar2 = scanSharedMaskView.f53818u;
            if (vVar2 != null) {
                vVar2.mo35867a();
            }
            TextView textView = scanSharedMaskView.f53805e;
            if (textView != null) {
                textView.setVisibility(8);
                TextView textView2 = scanSharedMaskView.f53807g;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    scanSharedMaskView.f53820w = false;
                    scanSharedMaskView.f53821x = false;
                    ScannerFlashSwitcher scannerFlashSwitcher = scanSharedMaskView.f53808h;
                    if (scannerFlashSwitcher != null) {
                        scannerFlashSwitcher.setVisibility(8);
                    } else {
                        C87412m.m108603p("flashSwitcher");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("scanToast");
                    throw null;
                }
            } else {
                C87412m.m108603p("scanTitle");
                throw null;
            }
        }
        if (mo24383l() && (rVar = this.f53698V0) != null) {
            rVar.f65490n = true;
        }
    }

    /* renamed from: r */
    public void mo24392r(boolean z) {
        boolean z2 = true;
        Log.m105927v("MicroMsg.ScanUIRectView", "alvinluo onShowNoDataView show: %b", Boolean.valueOf(z));
        ScanSharedMaskView scanSharedMaskView = this.f53720q;
        if (scanSharedMaskView != null) {
            scanSharedMaskView.mo24471b(!z);
        }
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView != null) {
            boolean z3 = !z;
            if (z3) {
                if (baseScanMaskView.getAlpha() == 0.0f) {
                    C111557w.m152065a(baseScanMaskView, 0.0f, 1.0f, 200, (Animator.AnimatorListener) null);
                    return;
                }
            }
            if (!z3) {
                if (baseScanMaskView.getAlpha() != 1.0f) {
                    z2 = false;
                }
                if (z2) {
                    C111557w.m152065a(baseScanMaskView, 1.0f, 0.0f, 200, (Animator.AnimatorListener) null);
                    return;
                }
                return;
            }
            baseScanMaskView.getClass();
        }
    }

    /* renamed from: s */
    public void mo24393s() {
        com.tencent.stubs.logger.Log.m106505i("ScanView", "onStop");
        mo27895a();
        ScanCameraLightDetector.f53829f.mo24507d();
    }

    public void setActivity(Activity activity) {
        this.f53677F = activity;
    }

    public void setBlackInterval(int i) {
        C19938f fVar = C19938f.f56890w;
        synchronized (fVar.f56903m) {
            C19937e eVar = fVar.f56903m;
            if (eVar.f59753c) {
                C19936d dVar = (C19936d) eVar.f59752b;
                int i2 = C36079a.f96165a;
                if (dVar != null) {
                    Log.m105925i("MicroMsg.QBarAIModHelper", "alvinluo setBlackInterval %d", Integer.valueOf(i));
                    if (i > 0) {
                        dVar.f56886c.AddBlackInternal(i, dVar.f56825a);
                    }
                }
            }
        }
    }

    public void setBottomExtraHeight(int i) {
        this.f53682K = i;
    }

    public void setDecodeSuccessFrameData(ScanDecodeFrameData scanDecodeFrameData) {
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView != null) {
            baseScanMaskView.setDecodeSuccessFrameData(scanDecodeFrameData);
        }
    }

    public void setDecorRect(Rect rect) {
        this.f53717o.setDecorRect(rect);
    }

    public void setDisableScanProductInMergeMode(boolean z) {
        this.f53688Q0 = z;
    }

    public void setEnableOpenCamera(boolean z) {
        Log.m105925i("MicroMsg.ScanUIRectView", "setEnableOpenCamera: %b", Boolean.valueOf(z));
        this.f53687Q = z;
    }

    public void setEnableScanCodeProductMerge(boolean z) {
        this.f53730y0 = z;
    }

    public void setEnableScanGoodsDynamicWording(boolean z) {
        this.f53728x0 = z;
    }

    public void setEnableScrollSwitchTab(boolean z) {
        Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo setEnableScrollSwitchTab: %b", Boolean.valueOf(z));
        this.f53680I = z;
    }

    public void setFlashStatus(boolean z) {
        ScanSharedMaskView scanSharedMaskView = this.f53720q;
        if (scanSharedMaskView != null) {
            scanSharedMaskView.setFlashStatus(z);
        }
    }

    public void setIgnorePreviewFrame(boolean z) {
        Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo setIgnorePreviewFrame %b", Boolean.valueOf(z));
        this.f53696U0 = z;
    }

    public void setMyQrCodeVisible(boolean z) {
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView instanceof ScanCodeMaskView) {
            ((ScanCodeMaskView) baseScanMaskView).setMyQrCodeButtonVisible(z);
        }
    }

    public void setNetworkAvailable(boolean z) {
        this.f53676E = z;
    }

    public void setScanCallback(ScanCallBack scanCallBack) {
        this.f53727x = scanCallBack;
    }

    public void setScanCodeReaders(int[] iArr) {
        C19938f fVar = C19938f.f56890w;
        fVar.getClass();
        if (iArr != null && iArr.length > 0) {
            synchronized (fVar.f56903m) {
                fVar.f56895e = iArr;
                C19937e eVar = fVar.f56903m;
                if (eVar.f59753c) {
                    eVar.mo33091h(iArr);
                }
            }
        }
    }

    public void setScanMode(int i) {
        this.f53724u = i;
    }

    public void setScanProductCallback(ScanProductMaskDecorView.C106130d dVar) {
        this.f53674C = dVar;
    }

    public void setScanProductOnItemClickListener(ScanProductMaskDecorView.C106131e eVar) {
        this.f53675D = eVar;
    }

    public void setScanRequest(BaseScanRequest baseScanRequest) {
        this.f53719p0 = baseScanRequest;
    }

    public void setScanSource(int i) {
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView != null) {
            baseScanMaskView.setScanSource(i);
        }
    }

    public void setScrollTabController(C111203g0 g0Var) {
        this.f53679H = g0Var;
    }

    public void setShowScanTips(boolean z) {
        this.f53725v = z;
    }

    public void setSuccessMarkClickListener(C106071g1 g1Var) {
        BaseScanMaskView baseScanMaskView = this.f53721r;
        if (baseScanMaskView instanceof ScanCodeMaskView) {
            ((ScanCodeMaskView) baseScanMaskView).setSuccessMarkClickListener(g1Var);
        }
    }

    /* renamed from: t */
    public void mo24418t(final boolean z) {
        C19016e1.m20070a(this.f53724u);
        if (this.f53724u == 12) {
            C19016e1.m20069C(1, System.currentTimeMillis());
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mo24386o(z);
        } else {
            MMHandlerThread.postToMainThread(new Runnable() {
                public void run() {
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    boolean z = z;
                    int i = ScanUIRectView.f53671n1;
                    scanUIRectView.mo24386o(z);
                }
            });
        }
    }

    /* renamed from: v */
    public final void mo24419v(byte[] bArr) {
        int i;
        Log.m105924i("MicroMsg.ScanUIRectView", "processFrame");
        if (((C108258a) this.f56970e).f324141c && ((C112475a) this.f56970e).mo164195t()) {
            ScanCameraLightDetector scanCameraLightDetector = ScanCameraLightDetector.f53829f;
            Point point = ((C112475a) this.f56970e).f324142d;
            scanCameraLightDetector.mo24505b(bArr, point.x, point.y);
        }
        int i2 = this.f53724u;
        if (i2 == 1 || i2 == 4 || i2 == 8) {
            Log.m105924i("MicroMsg.ScanUIRectView", "handleCodeData");
            if (this.f53726w != 0 && ((C108258a) this.f56970e).f324141c) {
                Point point2 = ((C108258a) this.f56970e).f324142d;
                if (point2 != null) {
                    Rect scanCodeRect = getScanCodeRect();
                    boolean z = this.f53706c1;
                    if (!z || (i = this.f53700W0) == 1) {
                        Rect g = ((C112475a) this.f56970e).mo158645g(scanCodeRect);
                        BaseScanMaskView baseScanMaskView = this.f53721r;
                        if (baseScanMaskView != null) {
                            baseScanMaskView.setPreviewRect(g);
                            this.f53721r.setScanRect(scanCodeRect);
                            BaseScanMaskView baseScanMaskView2 = this.f53721r;
                            if (baseScanMaskView2 instanceof ScanCodeMaskView) {
                                ((ScanCodeMaskView) baseScanMaskView2).setNeedRotate(true);
                            }
                        }
                        C19938f.f56890w.mo27326d(bArr, point2, ((C108258a) this.f56970e).f324147i, g);
                    } else if (z && i == 2) {
                        Rect rect = new Rect(0, 0, this.f53708e1, this.f53709f1);
                        BaseScanMaskView baseScanMaskView3 = this.f53721r;
                        if (baseScanMaskView3 != null) {
                            baseScanMaskView3.setPreviewRect(rect);
                            this.f53721r.setScanRect(scanCodeRect);
                            BaseScanMaskView baseScanMaskView4 = this.f53721r;
                            if (baseScanMaskView4 instanceof ScanCodeMaskView) {
                                ((ScanCodeMaskView) baseScanMaskView4).setNeedRotate(false);
                            }
                        }
                        C19938f.f56890w.mo27326d(bArr, new Point(this.f53708e1, this.f53709f1), 0, rect);
                    }
                }
                if (!((C108258a) this.f56970e).mo158646h(true) && C19938f.f56890w.f56901k > f53671n1) {
                    Log.m105924i("MicroMsg.ScanUIRectView", "change to FOCUS_MODE_AUTO");
                    ((C108258a) this.f56970e).mo158649k("auto");
                    mo27896c(100);
                }
            }
        } else if (i2 != 12) {
            Log.m105925i("MicroMsg.ScanUIRectView", "unknown scan mode %d", Integer.valueOf(i2));
        } else if (this.f53726w != 0) {
            synchronized (this.f56970e) {
                if (((C108258a) this.f56970e).f324141c) {
                    C108267t tVar = this.f56970e;
                    Point point3 = ((C108258a) tVar).f324142d;
                    BaseScanRequest baseScanRequest = this.f53719p0;
                    C20461a.f57497j.mo32011b(bArr, point3, ((C108258a) tVar).f324147i, ((C112475a) tVar).f324139a.getParameters().getPreviewFormat(), baseScanRequest instanceof ScanGoodsRequest ? ((ScanGoodsRequest) baseScanRequest).f248910u : true);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo24420w(boolean z) {
        int i;
        String str = "";
        if (this.f53725v) {
            if (!this.f53730y0 || !((i = this.f53724u) == 1 || i == 4 || i == 8)) {
                int i2 = this.f53724u;
                if (i2 == 1) {
                    str = getResources().getString(C0966R.string.iec);
                } else if (i2 == 8) {
                    str = getResources().getString(C0966R.string.hom);
                } else if (i2 == 12) {
                    str = !Util.isNullOrNil(this.f53729y) ? this.f53729y : getResources().getString(C0966R.string.icb);
                } else if (i2 == 3) {
                    str = getResources().getString(C0966R.string.ieq);
                } else if (i2 == 4) {
                    str = getResources().getString(C0966R.string.hon);
                }
            } else {
                str = (!z || Util.isNullOrNil(this.f53672A)) ? !Util.isNullOrNil(this.f53731z) ? this.f53731z : getResources().getString(C0966R.string.ibk) : this.f53672A;
            }
        }
        Log.m105924i("MicroMsg.ScanUIRectView", "refreshScanTips:" + str);
        this.f53720q.setScanTips(str);
    }

    /* renamed from: x */
    public final void mo24421x() {
        this.f53720q.setScanRequest(this.f53719p0);
        int i = this.f53724u;
        if (!(i == 1 || i == 8)) {
            if (i == 12) {
                this.f53720q.setScanTitle(getResources().getString(C0966R.string.ibr));
            } else if (i == 3) {
                this.f53720q.setScanTitle(getResources().getString(C0966R.string.ibv));
            } else if (i != 4) {
                Log.m105921e("MicroMsg.ScanUIRectView", "alvinluo refreshSharedMaskView unknown scan mode %d", Integer.valueOf(i));
            }
            post(new Runnable() {
                public void run() {
                    ScanSharedMaskView scanSharedMaskView;
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = scanUIRectView.f53673B;
                    if (scanCodeProductMergeMaskView != null && (scanSharedMaskView = scanUIRectView.f53720q) != null) {
                        int qrCodeButtonHeight = scanCodeProductMergeMaskView.getQrCodeButtonHeight();
                        View view = scanSharedMaskView.f53809i;
                        if (view == null || view.getHeight() <= 0) {
                            Log.m105920e("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta galleryButton is not init");
                            return;
                        }
                        View view2 = scanSharedMaskView.f53809i;
                        if (view2 != null) {
                            int height = qrCodeButtonHeight - view2.getHeight();
                            scanSharedMaskView.f53803D = height;
                            if (height < 0) {
                                scanSharedMaskView.f53803D = 0;
                            }
                            Log.m105924i("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta: " + scanSharedMaskView.f53803D);
                            scanSharedMaskView.mo24484j(scanSharedMaskView.f53812o);
                            return;
                        }
                        C87412m.m108603p("galleryButton");
                        throw null;
                    }
                }
            });
        }
        if (this.f53730y0) {
            this.f53720q.setScanTitle(getResources().getString(C0966R.string.ibp));
        } else {
            this.f53720q.setScanTitle(getResources().getString(C0966R.string.ibw));
        }
        post(new Runnable() {
            public void run() {
                ScanSharedMaskView scanSharedMaskView;
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = scanUIRectView.f53673B;
                if (scanCodeProductMergeMaskView != null && (scanSharedMaskView = scanUIRectView.f53720q) != null) {
                    int qrCodeButtonHeight = scanCodeProductMergeMaskView.getQrCodeButtonHeight();
                    View view = scanSharedMaskView.f53809i;
                    if (view == null || view.getHeight() <= 0) {
                        Log.m105920e("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta galleryButton is not init");
                        return;
                    }
                    View view2 = scanSharedMaskView.f53809i;
                    if (view2 != null) {
                        int height = qrCodeButtonHeight - view2.getHeight();
                        scanSharedMaskView.f53803D = height;
                        if (height < 0) {
                            scanSharedMaskView.f53803D = 0;
                        }
                        Log.m105924i("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta: " + scanSharedMaskView.f53803D);
                        scanSharedMaskView.mo24484j(scanSharedMaskView.f53812o);
                        return;
                    }
                    C87412m.m108603p("galleryButton");
                    throw null;
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01bd  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24422y() {
        /*
            r9 = this;
            com.tencent.mm.plugin.scanner.view.ScanRectDecorView r0 = r9.f53717o
            r1 = 8
            r0.setVisibility(r1)
            r9.mo24421x()
            r0 = 0
            r9.f53673B = r0
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView r2 = r9.f53721r
            if (r2 == 0) goto L_0x0019
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView$12 r3 = new com.tencent.mm.plugin.scanner.ui.ScanUIRectView$12
            r3.<init>(r2)
            r2.mo151678h(r3)
        L_0x0019:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r9.f53724u
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r9.f53682K
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            java.lang.String r4 = "MicroMsg.ScanUIRectView"
            java.lang.String r7 = "createScanMaskView mode: %d, bottomHeight: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r7, r3)
            int r3 = r9.f53724u
            java.lang.String r7 = "context"
            if (r3 == r6) goto L_0x008e
            if (r3 == r1) goto L_0x008e
            r8 = 12
            if (r3 == r8) goto L_0x0069
            r8 = 3
            if (r3 == r8) goto L_0x0057
            r8 = 4
            if (r3 == r8) goto L_0x008e
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7[r5] = r3
            java.lang.String r3 = "unknown scan mode %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r7)
            goto L_0x00cd
        L_0x0057:
            com.tencent.mm.plugin.scanner.view.ScanTranslationMaskView r3 = new com.tencent.mm.plugin.scanner.view.ScanTranslationMaskView
            android.content.Context r4 = r9.getContext()
            gy3.C87412m.m108594g(r4, r7)
            r3.<init>(r4, r0)
            r9.f53721r = r3
            r9.addView(r3)
            goto L_0x00cd
        L_0x0069:
            com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView r3 = new com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView
            android.content.Context r4 = r9.getContext()
            gy3.C87412m.m108594g(r4, r7)
            r3.<init>(r4, r0)
            r9.f53721r = r3
            r9.addView(r3)
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView r3 = r9.f53721r
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView
            if (r4 == 0) goto L_0x00cd
            com.tencent.mm.plugin.scanner.api.BaseScanRequest r4 = r9.f53719p0
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest
            if (r7 == 0) goto L_0x00cd
            com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView r3 = (com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView) r3
            com.tencent.mm.plugin.scanner.api.ScanGoodsRequest r4 = (com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest) r4
            r3.setScanRequest((com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest) r4)
            goto L_0x00cd
        L_0x008e:
            r9.mo24369C()
            boolean r3 = r9.f53730y0
            if (r3 == 0) goto L_0x00ba
            com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView r3 = new com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView
            android.content.Context r4 = r9.getContext()
            gy3.C87412m.m108594g(r4, r7)
            r3.<init>(r4, r0)
            r9.f53673B = r3
            r9.f53721r = r3
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView r3 = r3.getScanProductView()
            r9.f53718p = r3
            com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView r3 = r9.f53673B
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$d r4 = r9.f53674C
            r3.setScanProductCallBack(r4)
            com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView r3 = r9.f53673B
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$e r4 = r9.f53675D
            r3.setScanProductOnItemClickListener(r4)
            goto L_0x00c8
        L_0x00ba:
            com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView r3 = new com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView
            android.content.Context r4 = r9.getContext()
            gy3.C87412m.m108594g(r4, r7)
            r3.<init>(r4, r0)
            r9.f53721r = r3
        L_0x00c8:
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView r3 = r9.f53721r
            r9.addView(r3)
        L_0x00cd:
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView r3 = r9.f53721r
            if (r3 == 0) goto L_0x01cc
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r4 = r9.f53720q
            if (r4 == 0) goto L_0x01cc
            com.tencent.mm.plugin.scanner.model.i r4 = r9.f53678G
            java.lang.String r7 = "scanUIModel"
            gy3.C87412m.m108594g(r4, r7)
            r3.f316122d = r4
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView r3 = r9.f53721r
            int r4 = r9.f53682K
            r3.setBottomExtraHeight(r4)
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView r3 = r9.f53721r
            ht3.t r4 = r9.f56970e
            yk2.a r4 = (yk2.C112475a) r4
            r3.f316130o = r4
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r4 = r9.f53720q
            android.widget.TextView r4 = r4.getScanTipsView()
            java.lang.String r7 = "tipsView"
            gy3.C87412m.m108594g(r4, r7)
            r3.f316124f = r4
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView r3 = r9.f53721r
            com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher r4 = r9.f53723t
            boolean r4 = r4.f53788h
            r3.f316129n = r4
            r3.mo151683r()
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r3 = r9.f53720q
            int r4 = r9.f53682K
            r3.setBottomExtraHeight(r4)
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r3 = r9.f53720q
            com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher r4 = r9.f53723t
            boolean r4 = r4.f53788h
            r3.setFlashStatus(r4)
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r3 = r9.f53720q
            boolean r4 = r9.f53694T0
            r4 = r4 ^ r6
            r3.setShowTitle(r4)
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r3 = r9.f53720q
            int r4 = r9.f53724u
            r3.getClass()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r2[r5] = r7
            int r7 = r3.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r6] = r7
            java.lang.String r7 = "MicroMsg.ScanSharedMaskView"
            java.lang.String r8 = "alvinluo onViewReady currentTab: %d, hashCode: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r2)
            r3.f53812o = r4
            r3.mo24484j(r4)
            boolean r2 = r3.f53800A
            java.lang.String r7 = "scanTitle"
            if (r2 != 0) goto L_0x015f
            boolean r2 = r3.f53821x
            r2 = r2 ^ r6
            r3.mo24482h(r2)
            android.widget.TextView r2 = r3.f53805e
            if (r2 == 0) goto L_0x015b
            r2.setVisibility(r1)
            r3.f53820w = r5
            goto L_0x01ad
        L_0x015b:
            gy3.C87412m.m108603p(r7)
            throw r0
        L_0x015f:
            r3.mo24482h(r5)
            vl2.v r2 = r3.f53818u
            if (r2 == 0) goto L_0x0169
            r2.mo35867a()
        L_0x0169:
            vl2.v r2 = r3.f53819v
            if (r2 == 0) goto L_0x0170
            r2.mo35867a()
        L_0x0170:
            android.widget.TextView r2 = r3.f53805e
            if (r2 == 0) goto L_0x01c8
            r8 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r8)
            android.widget.TextView r2 = r3.f53805e
            if (r2 == 0) goto L_0x01c4
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0184
            goto L_0x0185
        L_0x0184:
            r6 = 0
        L_0x0185:
            vl2.v r2 = r3.f53818u
            if (r2 != 0) goto L_0x01a6
            vl2.v r2 = new vl2.v
            r2.<init>()
            android.widget.TextView r8 = r3.f53805e
            if (r8 == 0) goto L_0x01a2
            r2.f65497a = r8
            r7 = 2000(0x7d0, double:9.88E-321)
            r2.f65498b = r7
            ul2.l0 r7 = new ul2.l0
            r7.<init>(r3)
            r2.f65499c = r7
            r3.f53818u = r2
            goto L_0x01a6
        L_0x01a2:
            gy3.C87412m.m108603p(r7)
            throw r0
        L_0x01a6:
            vl2.v r2 = r3.f53818u
            if (r2 == 0) goto L_0x01ad
            r2.mo35868b(r6)
        L_0x01ad:
            android.widget.TextView r2 = r3.f53807g
            if (r2 == 0) goto L_0x01bd
            r2.setVisibility(r1)
            r3.mo24473d()
            r3.mo24483i(r4)
            r9.f53694T0 = r5
            goto L_0x01cc
        L_0x01bd:
            java.lang.String r1 = "scanToast"
            gy3.C87412m.m108603p(r1)
            throw r0
        L_0x01c4:
            gy3.C87412m.m108603p(r7)
            throw r0
        L_0x01c8:
            gy3.C87412m.m108603p(r7)
            throw r0
        L_0x01cc:
            r9.mo24420w(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.ScanUIRectView.mo24422y():void");
    }

    /* renamed from: z */
    public void mo24423z() {
        long j = this.f53726w;
        if (j == 0) {
            this.f53726w = System.currentTimeMillis();
            Log.m105924i("MicroMsg.ScanUIRectView", "startNewSession:" + this.f53726w);
            if (!((C108258a) this.f56970e).f324140b) {
                Log.m105924i("MicroMsg.ScanUIRectView", "startNewSession openCamera");
                mo24374g((C21001c.C21002a) null);
            } else if (!((C108258a) this.f56970e).f324141c) {
                Log.m105924i("MicroMsg.ScanUIRectView", "startNewSession startPreview");
                ((C112475a) this.f56970e).mo164194s(false);
                mo27898i(new C108261e.C108262a() {
                    /* renamed from: a */
                    public void mo24458a() {
                        Log.m105924i("MicroMsg.ScanUIRectView", "cameraStartPreviewed  startNewSession");
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        int i = ScanUIRectView.f53671n1;
                        ((C112475a) scanUIRectView.f56970e).mo158650l();
                        ScanUIRectView.this.mo24382k(0);
                    }
                });
                Log.m105925i("MicroMsg.ScanUIRectView", "startNewSession focus mode %s", ((C108258a) this.f56970e).mo158642d(false));
            } else {
                Log.m105924i("MicroMsg.ScanUIRectView", "startNewSession camera is previewing");
                Log.m105925i("MicroMsg.ScanUIRectView", "startNewSession  focus mode %s", ((C108258a) this.f56970e).mo158642d(false));
                mo24382k(0);
            }
            C19938f.f56890w.mo27329g(this.f53726w, getScanCodeTabType(), getSessionInfo(), this.f53710g1);
            C20469e.f57530v.mo32019c();
            return;
        }
        Log.m105929w("MicroMsg.ScanUIRectView", "startNewSession fail  curSession:%s, focus mode:%s", Long.valueOf(j), ((C108258a) this.f56970e).mo158642d(false));
    }

    public ScanUIRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C22768r rVar = new C22768r();
        this.f53698V0 = rVar;
        this.f53700W0 = 0;
        this.f53701X0 = 0;
        this.f53702Y0 = rVar.f65478b;
        this.f53703Z0 = false;
        this.f53704a1 = true;
        this.f53705b1 = false;
        this.f53706c1 = false;
        this.f53707d1 = new Runnable() {
            public void run() {
                boolean z;
                boolean z2;
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                int i = ScanUIRectView.f53671n1;
                if (scanUIRectView.mo24383l()) {
                    ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                    if (!scanUIRectView2.f53703Z0) {
                        scanUIRectView2.f53704a1 = false;
                        scanUIRectView2.f53703Z0 = true;
                        C19016e1 e1Var = C19016e1.f53424a;
                        Log.m105924i("MicroMsg.ScanReporter", "alvinluo reportOnPreviewFrameNotCalled");
                        C115669n.INSTANCE.mo175911u(1259, 0);
                        ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                        C22768r rVar = scanUIRectView3.f53698V0;
                        if (rVar != null) {
                            int i2 = rVar.f65483g;
                            Object[] objArr = new Object[2];
                            objArr[0] = Integer.valueOf(i2);
                            C22768r rVar2 = scanUIRectView3.f53698V0;
                            if (i2 == 1) {
                                z = rVar2.f65484h;
                            } else if (i2 != 2) {
                                rVar2.getClass();
                                z = false;
                            } else {
                                z = rVar2.f65485i;
                            }
                            objArr[1] = Boolean.valueOf(z);
                            Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo checkAndRetry retryType: %d, canRetry: %b", objArr);
                            C22768r rVar3 = scanUIRectView3.f53698V0;
                            if (i2 == 1) {
                                z2 = rVar3.f65484h;
                            } else if (i2 != 2) {
                                rVar3.getClass();
                                z2 = false;
                            } else {
                                z2 = rVar3.f65485i;
                            }
                            if (!z2) {
                                return;
                            }
                            if (i2 == 1) {
                                scanUIRectView3.f53698V0.f65491o = true;
                                C19016e1.m20091y(1);
                                try {
                                    Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo checkAndReopenCamera");
                                    scanUIRectView3.mo27897h(new C21003d.C21004a() {
                                        /* renamed from: a */
                                        public void mo24438a() {
                                            ScanUIRectView scanUIRectView = ScanUIRectView.this;
                                            scanUIRectView.f53700W0 = 1;
                                            scanUIRectView.f53706c1 = true;
                                            Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onCameraOpened");
                                            ((C112475a) scanUIRectView.f56970e).mo164194s(false);
                                            scanUIRectView.mo27898i(new C108261e.C108262a() {
                                                /* renamed from: a */
                                                public void mo24458a() {
                                                    Log.m105924i("MicroMsg.ScanUIRectView", "cameraStartPreviewed  onCameraOpened");
                                                    ScanUIRectView.this.mo24382k(0);
                                                }
                                            });
                                        }
                                    });
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "alvinluo checkAnReopenCamera exception", new Object[0]);
                                }
                            } else if (i2 == 2) {
                                scanUIRectView3.f53698V0.f65491o = true;
                                scanUIRectView3.f53706c1 = true;
                                scanUIRectView3.f53700W0 = i2;
                                C19016e1.m20091y(2);
                                scanUIRectView3.mo24368B(0);
                            }
                        }
                    }
                }
            }
        };
        this.f53708e1 = 0;
        this.f53709f1 = 0;
        this.f53710g1 = new C19938f.C19941c() {
            /* renamed from: a */
            public void mo24429a(long j, long j2) {
                Log.m105925i("MicroMsg.ScanUIRectView", "postTakeShot  session:%d  delay:%d", Long.valueOf(j), Long.valueOf(j2));
                final long j3 = j;
                final long j4 = j2;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        long j = j3;
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        if (j == scanUIRectView.f53726w && j != 0) {
                            scanUIRectView.mo24382k(j4);
                        }
                    }
                });
            }

            /* renamed from: b */
            public void mo24430b(final long j, final Bundle bundle) {
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        Bundle bundle;
                        try {
                            long j = j;
                            if (j == ScanUIRectView.this.f53726w && j != 0 && (bundle = bundle) != null && bundle.containsKey("param_zoom_ratio")) {
                                float f = bundle.getFloat("param_zoom_ratio", 0.0f);
                                Log.m105925i("MicroMsg.ScanUIRectView", "zoom to scale %f", Float.valueOf(f));
                                if (f > 0.0f) {
                                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                                    if (scanUIRectView.f53697V && ((C108258a) scanUIRectView.f56970e).f324141c) {
                                        ((C108258a) ScanUIRectView.this.f56970e).mo158655q((int) (((float) ((C108258a) ScanUIRectView.this.f56970e).mo158641c()) * f));
                                        C19933b.f56833H.mo27308a(f);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "zoomToScale exception", new Object[0]);
                        }
                    }
                });
            }

            /* renamed from: c */
            public void mo24431c(long j, List<C19931a.C19932a> list, List<QbarNative.QBarPoint> list2, List<WxQbarNative.QBarReportMsg> list3, Bundle bundle) {
                Log.m105918d("MicroMsg.ScanUIRectView", String.format("scan code after decode %d", new Object[]{Long.valueOf(j)}));
                if (list == null || list.isEmpty()) {
                    return;
                }
                final long j2 = j;
                final List<C19931a.C19932a> list4 = list;
                final List<WxQbarNative.QBarReportMsg> list5 = list3;
                final List<QbarNative.QBarPoint> list6 = list2;
                final Bundle bundle2 = bundle;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        QbarNative.QBarPoint qBarPoint;
                        WxQbarNative.QBarReportMsg qBarReportMsg;
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        long j = scanUIRectView.f53726w;
                        long j2 = j2;
                        if (j == j2 && j2 != 0) {
                            scanUIRectView.mo24367A();
                            ArrayList arrayList = new ArrayList();
                            List list = list4;
                            if (list != null && !list.isEmpty()) {
                                Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess result size: %d", Integer.valueOf(list4.size()));
                                int i = 0;
                                for (int i2 = 0; i2 < list4.size(); i2++) {
                                    C19931a.C19932a aVar = (C19931a.C19932a) list4.get(i2);
                                    WxQBarResult wxQBarResult = new WxQBarResult(aVar.f56827d, aVar.f56828e, aVar.f56829f, aVar.f56830g, aVar.f56831h, aVar.f56832i);
                                    Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess result index: %d, format: %d, content:%s", Integer.valueOf(i2), Integer.valueOf(wxQBarResult.f56827d), wxQBarResult.f56829f);
                                    List list2 = list5;
                                    if (!(list2 == null || list2.size() < i2 + 1 || (qBarReportMsg = (WxQbarNative.QBarReportMsg) list5.get(i2)) == null)) {
                                        wxQBarResult.f56823j = qBarReportMsg.qrcodeVersion;
                                    }
                                    List list3 = list6;
                                    if (!(list3 == null || list3.size() < i2 + 1 || (qBarPoint = (QbarNative.QBarPoint) list6.get(i2)) == null)) {
                                        wxQBarResult.f56824n = new WxQBarPoint(qBarPoint);
                                        i++;
                                    }
                                    arrayList.add(wxQBarResult);
                                }
                                Bundle bundle = new Bundle();
                                bundle.putParcelableArrayList("result_qbar_result_list", arrayList);
                                bundle.putInt("result_code_point_count", i);
                                Bundle bundle2 = bundle2;
                                if (bundle2 != null) {
                                    bundle.putAll(bundle2);
                                }
                                BaseScanMaskView baseScanMaskView = ScanUIRectView.this.f53721r;
                                if (baseScanMaskView != null && (baseScanMaskView instanceof ScanCodeMaskView)) {
                                    ((ScanCodeMaskView) baseScanMaskView).mo151722D();
                                }
                                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                                ScanCallBack scanCallBack = scanUIRectView2.f53727x;
                                if (scanCallBack != null) {
                                    scanCallBack.mo24353a(scanUIRectView2.f53726w, bundle);
                                }
                            }
                        }
                    }
                });
            }

            /* renamed from: d */
            public void mo24432d(byte[] bArr) {
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                if (!scanUIRectView.f53730y0) {
                    Log.m105928w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                } else if (scanUIRectView.f53688Q0) {
                    Log.m105928w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                } else {
                    try {
                        if (((C108258a) scanUIRectView.f56970e).f324140b) {
                            C20469e eVar = C20469e.f57530v;
                            C108267t tVar = ScanUIRectView.this.f56970e;
                            eVar.mo32017a(bArr, ((C108258a) tVar).f324142d, ((C108258a) tVar).f324147i, ((C112475a) tVar).f324139a.getParameters().getPreviewFormat(), true);
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "", new Object[0]);
                    }
                }
            }
        };
        this.f53711h1 = new C20461a.C20463b() {
            /* renamed from: a */
            public void mo24446a(long j, long j2) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo postTakeShot session: %d, delay: %d", Long.valueOf(j), Long.valueOf(j2));
                final long j3 = j;
                final long j4 = j2;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        long j = scanUIRectView.f53726w;
                        if (j == j3 && j != 0) {
                            scanUIRectView.mo24382k(j4);
                        }
                    }
                });
            }

            /* renamed from: b */
            public void mo24447b(final long j, final Bundle bundle) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess %d", Long.valueOf(j));
                if (bundle != null && bundle.getBoolean("result_is_best_img", false)) {
                    ScanUIRectView.this.post(new Runnable() {
                        public void run() {
                            ScanCallBack scanCallBack;
                            long j = j;
                            ScanUIRectView scanUIRectView = ScanUIRectView.this;
                            long j2 = scanUIRectView.f53726w;
                            if (j == j2 && j2 != 0 && (scanCallBack = scanUIRectView.f53727x) != null) {
                                scanCallBack.mo24353a(j2, bundle);
                            }
                        }
                    });
                }
            }

            /* renamed from: c */
            public void mo24448c(final C106084y0 y0Var) {
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        C106084y0 y0Var = y0Var;
                        if (y0Var != null) {
                            BaseScanMaskView baseScanMaskView = ScanUIRectView.this.f53721r;
                            if (baseScanMaskView instanceof ScanGoodsMaskView) {
                                ScanGoodsMaskView scanGoodsMaskView = (ScanGoodsMaskView) baseScanMaskView;
                                scanGoodsMaskView.getClass();
                                if (scanGoodsMaskView.f316134s) {
                                    Log.m105924i("MicroMsg.ScanGoodsMaskView", "alvinluo addAnimationScanDots isViewDestroy");
                                    return;
                                }
                                ScanPoint[] scanPointArr = y0Var.f315843a;
                                if (scanPointArr != null) {
                                    Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo addAnimationScanDots size: %d", Integer.valueOf(y0Var.f315844b));
                                    int i = y0Var.f315844b;
                                    int i2 = 0;
                                    while (true) {
                                        Float f = null;
                                        if (i2 >= i) {
                                            break;
                                        }
                                        ScanPoint scanPoint = (ScanPoint) C110823p.m150982H(scanPointArr, i2);
                                        Object[] objArr = new Object[3];
                                        objArr[0] = scanPoint != null ? Integer.valueOf(scanPoint.getId()) : null;
                                        objArr[1] = scanPoint != null ? Float.valueOf(scanPoint.getX()) : null;
                                        if (scanPoint != null) {
                                            f = Float.valueOf(scanPoint.getY());
                                        }
                                        objArr[2] = f;
                                        Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo getPointObjects id: %d, x: %f, y: %f", objArr);
                                        i2++;
                                    }
                                    ScanAnimationDotsView scanAnimationDotsView = scanGoodsMaskView.f315928v;
                                    if (scanAnimationDotsView != null) {
                                        Log.m105927v("MicroMsg.ScanAnimationDotsView", "alvinluo addAnimationDots size: %d", Integer.valueOf(y0Var.f315844b));
                                        C111019e eVar = scanAnimationDotsView.f315895e;
                                        if (eVar != null) {
                                            ((C111012a) eVar).mo162696b(y0Var);
                                            return;
                                        }
                                        return;
                                    }
                                    C87412m.m108603p("animationDotsView");
                                    throw null;
                                }
                            }
                        }
                    }
                });
            }
        };
        this.f53712i1 = new C92411b.C92412a() {
            public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
                float f3 = f;
                float f4 = f2;
                Log.m105925i("MicroMsg.ScanUIRectView", "onGetLocation %s", Boolean.valueOf(z));
                if (!z) {
                    Log.m105924i("MicroMsg.ScanUIRectView", "check permission not passed!");
                    if (!ScanUIRectView.this.f53693T && !LocationUtil.isGpsEnable()) {
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        scanUIRectView.f53693T = true;
                        C76879j.m92709C(scanUIRectView.getContext(), ScanUIRectView.this.getContext().getString(C0966R.string.fez), ScanUIRectView.this.getContext().getString(C0966R.string.a3h), ScanUIRectView.this.getContext().getString(C0966R.string.fyd), ScanUIRectView.this.getContext().getString(C0966R.string.f7926wf), false, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                LocationUtil.jumpToOpenGps(ScanUIRectView.this.getContext());
                            }
                        }, (DialogInterface.OnClickListener) null);
                    }
                    return true;
                }
                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                if (scanUIRectView2.f53695U) {
                    Log.m105924i("MicroMsg.ScanUIRectView", "ignore, has get lbs!");
                    return false;
                }
                BaseScanMaskView baseScanMaskView = scanUIRectView2.f53721r;
                if (baseScanMaskView != null && (baseScanMaskView instanceof ScanCodeMaskView)) {
                    ((ScanCodeMaskView) baseScanMaskView).mo151722D();
                }
                ScanUIRectView.this.f53695U = true;
                int i2 = (int) d2;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2012, f, f2, i2);
                if (ScanUIRectView.this.f53727x != null) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("result_lbs_latitude", f2);
                    bundle.putFloat("result_lbs_longitude", f);
                    bundle.putInt("result_lbs_accuracy", i2);
                    int i3 = i;
                    bundle.putInt("result_lbs_source", i);
                    ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                    scanUIRectView3.f53727x.mo24353a(scanUIRectView3.f53726w, bundle);
                }
                return false;
            }
        };
        this.f53713j1 = new IListener<ScanFlashSwitchEvent>(C40008f.f107254d) {
            {
                this.__eventId = 208336003;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanFlashSwitchEvent) iEvent).f48122d.f48123a == 1) {
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    int i = ScanUIRectView.f53671n1;
                    C112475a aVar = (C112475a) scanUIRectView.f56970e;
                    if (!aVar.f324148j) {
                        aVar.mo164196u();
                    }
                } else {
                    ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                    int i2 = ScanUIRectView.f53671n1;
                    C112475a aVar2 = (C112475a) scanUIRectView2.f56970e;
                    if (aVar2.f324148j) {
                        aVar2.mo164193r();
                    }
                }
                return true;
            }
        };
        this.f53714k1 = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            public boolean onContextClick(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                Log.m105919d("MicroMsg.ScanUIRectView", "double click,pointer:%d,x:%f,y:%f", Integer.valueOf(motionEvent.getActionIndex()), Float.valueOf(motionEvent.getX(motionEvent.getActionIndex())), Float.valueOf(motionEvent.getY(motionEvent.getActionIndex())));
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                int i = ScanUIRectView.f53671n1;
                ((C108258a) scanUIRectView.f56970e).mo158654p(5);
                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                C19016e1.m20088v(scanUIRectView2.f53724u, 3, scanUIRectView2.f53730y0);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo onFling velocityX: %f, velocityY: %f, canScrollSwitchTab: %b, enableScrollSwitchTab: %b, isMultiTouch: %b", Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(ScanUIRectView.this.f53681J), Boolean.valueOf(ScanUIRectView.this.f53680I), Boolean.valueOf(ScanUIRectView.this.f53685N));
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                if (!scanUIRectView.f53685N && scanUIRectView.f53680I && Math.abs(f) > Math.abs(f2)) {
                    if (f < -1200.0f) {
                        ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                        if (scanUIRectView2.f53681J) {
                            C111203g0 g0Var = scanUIRectView2.f53679H;
                            if (g0Var != null) {
                                g0Var.mo162952e();
                            }
                            ScanUIRectView.this.f53681J = false;
                        }
                    }
                    if (f > 1200.0f) {
                        ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                        if (scanUIRectView3.f53681J) {
                            C111203g0 g0Var2 = scanUIRectView3.f53679H;
                            if (g0Var2 != null) {
                                g0Var2.mo162953f();
                            }
                            ScanUIRectView.this.f53681J = false;
                        }
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }

            public void onLongPress(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
        this.f53716m1 = new TakeShotByTextureHandler(Looper.getMainLooper());
    }

    public ScanUIRectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C22768r rVar = new C22768r();
        this.f53698V0 = rVar;
        this.f53700W0 = 0;
        this.f53701X0 = 0;
        this.f53702Y0 = rVar.f65478b;
        this.f53703Z0 = false;
        this.f53704a1 = true;
        this.f53705b1 = false;
        this.f53706c1 = false;
        this.f53707d1 = new Runnable() {
            public void run() {
                boolean z;
                boolean z2;
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                int i = ScanUIRectView.f53671n1;
                if (scanUIRectView.mo24383l()) {
                    ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                    if (!scanUIRectView2.f53703Z0) {
                        scanUIRectView2.f53704a1 = false;
                        scanUIRectView2.f53703Z0 = true;
                        C19016e1 e1Var = C19016e1.f53424a;
                        Log.m105924i("MicroMsg.ScanReporter", "alvinluo reportOnPreviewFrameNotCalled");
                        C115669n.INSTANCE.mo175911u(1259, 0);
                        ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                        C22768r rVar = scanUIRectView3.f53698V0;
                        if (rVar != null) {
                            int i2 = rVar.f65483g;
                            Object[] objArr = new Object[2];
                            objArr[0] = Integer.valueOf(i2);
                            C22768r rVar2 = scanUIRectView3.f53698V0;
                            if (i2 == 1) {
                                z = rVar2.f65484h;
                            } else if (i2 != 2) {
                                rVar2.getClass();
                                z = false;
                            } else {
                                z = rVar2.f65485i;
                            }
                            objArr[1] = Boolean.valueOf(z);
                            Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo checkAndRetry retryType: %d, canRetry: %b", objArr);
                            C22768r rVar3 = scanUIRectView3.f53698V0;
                            if (i2 == 1) {
                                z2 = rVar3.f65484h;
                            } else if (i2 != 2) {
                                rVar3.getClass();
                                z2 = false;
                            } else {
                                z2 = rVar3.f65485i;
                            }
                            if (!z2) {
                                return;
                            }
                            if (i2 == 1) {
                                scanUIRectView3.f53698V0.f65491o = true;
                                C19016e1.m20091y(1);
                                try {
                                    Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo checkAndReopenCamera");
                                    scanUIRectView3.mo27897h(new C21003d.C21004a() {
                                        /* renamed from: a */
                                        public void mo24438a() {
                                            ScanUIRectView scanUIRectView = ScanUIRectView.this;
                                            scanUIRectView.f53700W0 = 1;
                                            scanUIRectView.f53706c1 = true;
                                            Log.m105924i("MicroMsg.ScanUIRectView", "alvinluo onCameraOpened");
                                            ((C112475a) scanUIRectView.f56970e).mo164194s(false);
                                            scanUIRectView.mo27898i(new C108261e.C108262a() {
                                                /* renamed from: a */
                                                public void mo24458a() {
                                                    Log.m105924i("MicroMsg.ScanUIRectView", "cameraStartPreviewed  onCameraOpened");
                                                    ScanUIRectView.this.mo24382k(0);
                                                }
                                            });
                                        }
                                    });
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "alvinluo checkAnReopenCamera exception", new Object[0]);
                                }
                            } else if (i2 == 2) {
                                scanUIRectView3.f53698V0.f65491o = true;
                                scanUIRectView3.f53706c1 = true;
                                scanUIRectView3.f53700W0 = i2;
                                C19016e1.m20091y(2);
                                scanUIRectView3.mo24368B(0);
                            }
                        }
                    }
                }
            }
        };
        this.f53708e1 = 0;
        this.f53709f1 = 0;
        this.f53710g1 = new C19938f.C19941c() {
            /* renamed from: a */
            public void mo24429a(long j, long j2) {
                Log.m105925i("MicroMsg.ScanUIRectView", "postTakeShot  session:%d  delay:%d", Long.valueOf(j), Long.valueOf(j2));
                final long j3 = j;
                final long j4 = j2;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        long j = j3;
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        if (j == scanUIRectView.f53726w && j != 0) {
                            scanUIRectView.mo24382k(j4);
                        }
                    }
                });
            }

            /* renamed from: b */
            public void mo24430b(final long j, final Bundle bundle) {
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        Bundle bundle;
                        try {
                            long j = j;
                            if (j == ScanUIRectView.this.f53726w && j != 0 && (bundle = bundle) != null && bundle.containsKey("param_zoom_ratio")) {
                                float f = bundle.getFloat("param_zoom_ratio", 0.0f);
                                Log.m105925i("MicroMsg.ScanUIRectView", "zoom to scale %f", Float.valueOf(f));
                                if (f > 0.0f) {
                                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                                    if (scanUIRectView.f53697V && ((C108258a) scanUIRectView.f56970e).f324141c) {
                                        ((C108258a) ScanUIRectView.this.f56970e).mo158655q((int) (((float) ((C108258a) ScanUIRectView.this.f56970e).mo158641c()) * f));
                                        C19933b.f56833H.mo27308a(f);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "zoomToScale exception", new Object[0]);
                        }
                    }
                });
            }

            /* renamed from: c */
            public void mo24431c(long j, List<C19931a.C19932a> list, List<QbarNative.QBarPoint> list2, List<WxQbarNative.QBarReportMsg> list3, Bundle bundle) {
                Log.m105918d("MicroMsg.ScanUIRectView", String.format("scan code after decode %d", new Object[]{Long.valueOf(j)}));
                if (list == null || list.isEmpty()) {
                    return;
                }
                final long j2 = j;
                final List<C19931a.C19932a> list4 = list;
                final List<WxQbarNative.QBarReportMsg> list5 = list3;
                final List<QbarNative.QBarPoint> list6 = list2;
                final Bundle bundle2 = bundle;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        QbarNative.QBarPoint qBarPoint;
                        WxQbarNative.QBarReportMsg qBarReportMsg;
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        long j = scanUIRectView.f53726w;
                        long j2 = j2;
                        if (j == j2 && j2 != 0) {
                            scanUIRectView.mo24367A();
                            ArrayList arrayList = new ArrayList();
                            List list = list4;
                            if (list != null && !list.isEmpty()) {
                                Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess result size: %d", Integer.valueOf(list4.size()));
                                int i = 0;
                                for (int i2 = 0; i2 < list4.size(); i2++) {
                                    C19931a.C19932a aVar = (C19931a.C19932a) list4.get(i2);
                                    WxQBarResult wxQBarResult = new WxQBarResult(aVar.f56827d, aVar.f56828e, aVar.f56829f, aVar.f56830g, aVar.f56831h, aVar.f56832i);
                                    Log.m105925i("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess result index: %d, format: %d, content:%s", Integer.valueOf(i2), Integer.valueOf(wxQBarResult.f56827d), wxQBarResult.f56829f);
                                    List list2 = list5;
                                    if (!(list2 == null || list2.size() < i2 + 1 || (qBarReportMsg = (WxQbarNative.QBarReportMsg) list5.get(i2)) == null)) {
                                        wxQBarResult.f56823j = qBarReportMsg.qrcodeVersion;
                                    }
                                    List list3 = list6;
                                    if (!(list3 == null || list3.size() < i2 + 1 || (qBarPoint = (QbarNative.QBarPoint) list6.get(i2)) == null)) {
                                        wxQBarResult.f56824n = new WxQBarPoint(qBarPoint);
                                        i++;
                                    }
                                    arrayList.add(wxQBarResult);
                                }
                                Bundle bundle = new Bundle();
                                bundle.putParcelableArrayList("result_qbar_result_list", arrayList);
                                bundle.putInt("result_code_point_count", i);
                                Bundle bundle2 = bundle2;
                                if (bundle2 != null) {
                                    bundle.putAll(bundle2);
                                }
                                BaseScanMaskView baseScanMaskView = ScanUIRectView.this.f53721r;
                                if (baseScanMaskView != null && (baseScanMaskView instanceof ScanCodeMaskView)) {
                                    ((ScanCodeMaskView) baseScanMaskView).mo151722D();
                                }
                                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                                ScanCallBack scanCallBack = scanUIRectView2.f53727x;
                                if (scanCallBack != null) {
                                    scanCallBack.mo24353a(scanUIRectView2.f53726w, bundle);
                                }
                            }
                        }
                    }
                });
            }

            /* renamed from: d */
            public void mo24432d(byte[] bArr) {
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                if (!scanUIRectView.f53730y0) {
                    Log.m105928w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                } else if (scanUIRectView.f53688Q0) {
                    Log.m105928w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                } else {
                    try {
                        if (((C108258a) scanUIRectView.f56970e).f324140b) {
                            C20469e eVar = C20469e.f57530v;
                            C108267t tVar = ScanUIRectView.this.f56970e;
                            eVar.mo32017a(bArr, ((C108258a) tVar).f324142d, ((C108258a) tVar).f324147i, ((C112475a) tVar).f324139a.getParameters().getPreviewFormat(), true);
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ScanUIRectView", e, "", new Object[0]);
                    }
                }
            }
        };
        this.f53711h1 = new C20461a.C20463b() {
            /* renamed from: a */
            public void mo24446a(long j, long j2) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo postTakeShot session: %d, delay: %d", Long.valueOf(j), Long.valueOf(j2));
                final long j3 = j;
                final long j4 = j2;
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        long j = scanUIRectView.f53726w;
                        if (j == j3 && j != 0) {
                            scanUIRectView.mo24382k(j4);
                        }
                    }
                });
            }

            /* renamed from: b */
            public void mo24447b(final long j, final Bundle bundle) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo onDecodeSuccess %d", Long.valueOf(j));
                if (bundle != null && bundle.getBoolean("result_is_best_img", false)) {
                    ScanUIRectView.this.post(new Runnable() {
                        public void run() {
                            ScanCallBack scanCallBack;
                            long j = j;
                            ScanUIRectView scanUIRectView = ScanUIRectView.this;
                            long j2 = scanUIRectView.f53726w;
                            if (j == j2 && j2 != 0 && (scanCallBack = scanUIRectView.f53727x) != null) {
                                scanCallBack.mo24353a(j2, bundle);
                            }
                        }
                    });
                }
            }

            /* renamed from: c */
            public void mo24448c(final C106084y0 y0Var) {
                ScanUIRectView.this.post(new Runnable() {
                    public void run() {
                        C106084y0 y0Var = y0Var;
                        if (y0Var != null) {
                            BaseScanMaskView baseScanMaskView = ScanUIRectView.this.f53721r;
                            if (baseScanMaskView instanceof ScanGoodsMaskView) {
                                ScanGoodsMaskView scanGoodsMaskView = (ScanGoodsMaskView) baseScanMaskView;
                                scanGoodsMaskView.getClass();
                                if (scanGoodsMaskView.f316134s) {
                                    Log.m105924i("MicroMsg.ScanGoodsMaskView", "alvinluo addAnimationScanDots isViewDestroy");
                                    return;
                                }
                                ScanPoint[] scanPointArr = y0Var.f315843a;
                                if (scanPointArr != null) {
                                    Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo addAnimationScanDots size: %d", Integer.valueOf(y0Var.f315844b));
                                    int i = y0Var.f315844b;
                                    int i2 = 0;
                                    while (true) {
                                        Float f = null;
                                        if (i2 >= i) {
                                            break;
                                        }
                                        ScanPoint scanPoint = (ScanPoint) C110823p.m150982H(scanPointArr, i2);
                                        Object[] objArr = new Object[3];
                                        objArr[0] = scanPoint != null ? Integer.valueOf(scanPoint.getId()) : null;
                                        objArr[1] = scanPoint != null ? Float.valueOf(scanPoint.getX()) : null;
                                        if (scanPoint != null) {
                                            f = Float.valueOf(scanPoint.getY());
                                        }
                                        objArr[2] = f;
                                        Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo getPointObjects id: %d, x: %f, y: %f", objArr);
                                        i2++;
                                    }
                                    ScanAnimationDotsView scanAnimationDotsView = scanGoodsMaskView.f315928v;
                                    if (scanAnimationDotsView != null) {
                                        Log.m105927v("MicroMsg.ScanAnimationDotsView", "alvinluo addAnimationDots size: %d", Integer.valueOf(y0Var.f315844b));
                                        C111019e eVar = scanAnimationDotsView.f315895e;
                                        if (eVar != null) {
                                            ((C111012a) eVar).mo162696b(y0Var);
                                            return;
                                        }
                                        return;
                                    }
                                    C87412m.m108603p("animationDotsView");
                                    throw null;
                                }
                            }
                        }
                    }
                });
            }
        };
        this.f53712i1 = new C92411b.C92412a() {
            public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
                float f3 = f;
                float f4 = f2;
                Log.m105925i("MicroMsg.ScanUIRectView", "onGetLocation %s", Boolean.valueOf(z));
                if (!z) {
                    Log.m105924i("MicroMsg.ScanUIRectView", "check permission not passed!");
                    if (!ScanUIRectView.this.f53693T && !LocationUtil.isGpsEnable()) {
                        ScanUIRectView scanUIRectView = ScanUIRectView.this;
                        scanUIRectView.f53693T = true;
                        C76879j.m92709C(scanUIRectView.getContext(), ScanUIRectView.this.getContext().getString(C0966R.string.fez), ScanUIRectView.this.getContext().getString(C0966R.string.a3h), ScanUIRectView.this.getContext().getString(C0966R.string.fyd), ScanUIRectView.this.getContext().getString(C0966R.string.f7926wf), false, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                LocationUtil.jumpToOpenGps(ScanUIRectView.this.getContext());
                            }
                        }, (DialogInterface.OnClickListener) null);
                    }
                    return true;
                }
                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                if (scanUIRectView2.f53695U) {
                    Log.m105924i("MicroMsg.ScanUIRectView", "ignore, has get lbs!");
                    return false;
                }
                BaseScanMaskView baseScanMaskView = scanUIRectView2.f53721r;
                if (baseScanMaskView != null && (baseScanMaskView instanceof ScanCodeMaskView)) {
                    ((ScanCodeMaskView) baseScanMaskView).mo151722D();
                }
                ScanUIRectView.this.f53695U = true;
                int i2 = (int) d2;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2012, f, f2, i2);
                if (ScanUIRectView.this.f53727x != null) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("result_lbs_latitude", f2);
                    bundle.putFloat("result_lbs_longitude", f);
                    bundle.putInt("result_lbs_accuracy", i2);
                    int i3 = i;
                    bundle.putInt("result_lbs_source", i);
                    ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                    scanUIRectView3.f53727x.mo24353a(scanUIRectView3.f53726w, bundle);
                }
                return false;
            }
        };
        this.f53713j1 = new IListener<ScanFlashSwitchEvent>(C40008f.f107254d) {
            {
                this.__eventId = 208336003;
            }

            public boolean callback(IEvent iEvent) {
                if (((ScanFlashSwitchEvent) iEvent).f48122d.f48123a == 1) {
                    ScanUIRectView scanUIRectView = ScanUIRectView.this;
                    int i = ScanUIRectView.f53671n1;
                    C112475a aVar = (C112475a) scanUIRectView.f56970e;
                    if (!aVar.f324148j) {
                        aVar.mo164196u();
                    }
                } else {
                    ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                    int i2 = ScanUIRectView.f53671n1;
                    C112475a aVar2 = (C112475a) scanUIRectView2.f56970e;
                    if (aVar2.f324148j) {
                        aVar2.mo164193r();
                    }
                }
                return true;
            }
        };
        this.f53714k1 = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            public boolean onContextClick(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                Log.m105919d("MicroMsg.ScanUIRectView", "double click,pointer:%d,x:%f,y:%f", Integer.valueOf(motionEvent.getActionIndex()), Float.valueOf(motionEvent.getX(motionEvent.getActionIndex())), Float.valueOf(motionEvent.getY(motionEvent.getActionIndex())));
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                int i = ScanUIRectView.f53671n1;
                ((C108258a) scanUIRectView.f56970e).mo158654p(5);
                ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                C19016e1.m20088v(scanUIRectView2.f53724u, 3, scanUIRectView2.f53730y0);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Log.m105919d("MicroMsg.ScanUIRectView", "alvinluo onFling velocityX: %f, velocityY: %f, canScrollSwitchTab: %b, enableScrollSwitchTab: %b, isMultiTouch: %b", Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(ScanUIRectView.this.f53681J), Boolean.valueOf(ScanUIRectView.this.f53680I), Boolean.valueOf(ScanUIRectView.this.f53685N));
                ScanUIRectView scanUIRectView = ScanUIRectView.this;
                if (!scanUIRectView.f53685N && scanUIRectView.f53680I && Math.abs(f) > Math.abs(f2)) {
                    if (f < -1200.0f) {
                        ScanUIRectView scanUIRectView2 = ScanUIRectView.this;
                        if (scanUIRectView2.f53681J) {
                            C111203g0 g0Var = scanUIRectView2.f53679H;
                            if (g0Var != null) {
                                g0Var.mo162952e();
                            }
                            ScanUIRectView.this.f53681J = false;
                        }
                    }
                    if (f > 1200.0f) {
                        ScanUIRectView scanUIRectView3 = ScanUIRectView.this;
                        if (scanUIRectView3.f53681J) {
                            C111203g0 g0Var2 = scanUIRectView3.f53679H;
                            if (g0Var2 != null) {
                                g0Var2.mo162953f();
                            }
                            ScanUIRectView.this.f53681J = false;
                        }
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }

            public void onLongPress(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$19", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
        this.f53716m1 = new TakeShotByTextureHandler(Looper.getMainLooper());
    }
}
