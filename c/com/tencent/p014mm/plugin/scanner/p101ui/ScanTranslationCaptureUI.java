package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PlayScanTranslateAnimEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.OCRTranslateReportStruct;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.plugin.scanner.C115670k;
import com.tencent.p014mm.plugin.scanner.C115674p;
import com.tencent.p014mm.plugin.scanner.model.C115672t;
import com.tencent.p014mm.plugin.scanner.model.C30383k1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import ob0.C11385n;
import ob0.C117747y;
import p447aw.C103918d;
import p903ij.C76359b;
import te3.bk4;
import vl2.C118684u;
import yk2.C112475a;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI */
public class ScanTranslationCaptureUI extends MMActivity implements TextureView.SurfaceTextureListener, Camera.PreviewCallback, C11385n, C118684u.C118686b {

    /* renamed from: S */
    public static final /* synthetic */ int f347042S = 0;

    /* renamed from: A */
    public MMGestureGallery f347043A;

    /* renamed from: B */
    public boolean f347044B = true;

    /* renamed from: C */
    public ValueAnimator f347045C;

    /* renamed from: D */
    public ValueAnimator f347046D;

    /* renamed from: E */
    public View f347047E;

    /* renamed from: F */
    public int f347048F;

    /* renamed from: G */
    public int f347049G;

    /* renamed from: H */
    public int f347050H;

    /* renamed from: I */
    public String f347051I;

    /* renamed from: J */
    public boolean f347052J;

    /* renamed from: K */
    public int f347053K = 0;

    /* renamed from: L */
    public int f347054L = 0;

    /* renamed from: M */
    public int f347055M = 0;

    /* renamed from: N */
    public OCRTranslateReportStruct f347056N = new OCRTranslateReportStruct();

    /* renamed from: P */
    public long[] f347057P = new long[2];

    /* renamed from: Q */
    public IListener<PlayScanTranslateAnimEvent> f347058Q = new IListener<PlayScanTranslateAnimEvent>(C40008f.f107254d) {
        {
            this.__eventId = 352096572;
        }

        public boolean callback(IEvent iEvent) {
            Bitmap decodeFile;
            if (((PlayScanTranslateAnimEvent) iEvent).f343590d.f343591a != 2) {
                return false;
            }
            Log.m105924i("MicroMsg.ScanTranslationCaptureUI", "receive play open translate anim event");
            String stringExtra = ScanTranslationCaptureUI.this.getIntent().getStringExtra("key_first_background");
            if (!Util.isNullOrNil(stringExtra) && (decodeFile = BitmapUtil.decodeFile(stringExtra, new BitmapFactory.Options())) != null) {
                ScanTranslationCaptureUI.this.f347043A.setVisibility(0);
                ScanTranslationCaptureUI.this.mo175949Q7(decodeFile);
                C86013q1.m106447h(stringExtra);
            }
            View view = ScanTranslationCaptureUI.this.f347047E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$1", "callback", "(Lcom/tencent/mm/autogen/events/PlayScanTranslateAnimEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$1", "callback", "(Lcom/tencent/mm/autogen/events/PlayScanTranslateAnimEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ScanTranslationCaptureUI.this.f347046D.start();
            ScanTranslationCaptureUI.this.f347060d.setVisibility(0);
            ScanTranslationCaptureUI.this.f347052J = true;
            return true;
        }
    };

    /* renamed from: R */
    public C29060q f347059R = new ScanTranslationCaptureUI$$j(this);

    /* renamed from: d */
    public MMTextureView f347060d;

    /* renamed from: e */
    public SurfaceTexture f347061e;

    /* renamed from: f */
    public C112475a f347062f;

    /* renamed from: g */
    public View f347063g;

    /* renamed from: h */
    public View f347064h;

    /* renamed from: i */
    public View f347065i;

    /* renamed from: j */
    public View f347066j;

    /* renamed from: n */
    public View f347067n;

    /* renamed from: o */
    public ImageView f347068o;

    /* renamed from: p */
    public View f347069p;

    /* renamed from: q */
    public View f347070q;

    /* renamed from: r */
    public View f347071r;

    /* renamed from: s */
    public TextView f347072s;

    /* renamed from: t */
    public ImageView f347073t;

    /* renamed from: u */
    public Bitmap f347074u;

    /* renamed from: v */
    public Bitmap f347075v;

    /* renamed from: w */
    public String f347076w;

    /* renamed from: x */
    public String f347077x;

    /* renamed from: y */
    public String f347078y;

    /* renamed from: z */
    public ScanTranslationCaptureUI$$v f347079z;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r1.f347062f;
     */
    /* renamed from: A4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175939A4() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "MicroMsg.ScanTranslationCaptureUI"
            r3 = 0
            yk2.a r0 = r1.f347062f     // Catch:{ Exception -> 0x0017 }
            boolean r0 = r0.f324141c     // Catch:{ Exception -> 0x0017 }
            if (r0 == 0) goto L_0x001f
            yk2.a r0 = r1.f347062f     // Catch:{ Exception -> 0x0017 }
            android.hardware.Camera r4 = r0.f324139a     // Catch:{ Exception -> 0x0017 }
            if (r4 == 0) goto L_0x001f
            r4.stopPreview()     // Catch:{ Exception -> 0x0017 }
            r0.f324141c = r3     // Catch:{ Exception -> 0x0017 }
            goto L_0x001f
        L_0x0017:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x001f:
            ob0.b0 r0 = f40.C86709a0.m107524d()
            int r0 = r0.mo123467m()
            java.lang.String r4 = ""
            r5 = 6
            if (r0 == r5) goto L_0x0045
            ob0.b0 r0 = f40.C86709a0.m107524d()
            int r0 = r0.mo123467m()
            r5 = 4
            if (r0 == r5) goto L_0x0045
            r0 = 2131835266(0x7f113982, float:1.9303666E38)
            java.lang.String r0 = r1.getString(r0)
            nj3.C76879j.m92748s(r1, r0, r4)
            r22.mo175941I7()
            return
        L_0x0045:
            com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct r0 = r1.f347056N
            r5 = 2
            r0.f343790f = r5
            java.lang.String r0 = eb0.C75592q0.m90789s()
            int r0 = r0.hashCode()
            long r5 = (long) r0
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r5 + r7
            r7 = -1
            long r5 = r5 & r7
            int r0 = (int) r5
            r1.f347049G = r0
            r0 = 1
            r1.f347050H = r0
            r22.showTitleView()
            r22.mo175950R7()
            r22.mo175948P7()
            java.lang.String r5 = r1.f347051I
            java.lang.String r6 = "zh_CN"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x007f
            android.widget.ImageView r5 = r1.f347068o
            r6 = 2131757079(0x7f100817, float:1.9145084E38)
            r5.setImageResource(r6)
            goto L_0x0087
        L_0x007f:
            android.widget.ImageView r5 = r1.f347068o
            r6 = 2131757082(0x7f10081a, float:1.914509E38)
            r5.setImageResource(r6)
        L_0x0087:
            android.view.View r5 = r1.f347070q
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6.mo10233c(r7)
            java.lang.Object[] r8 = r6.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI"
            java.lang.String r10 = "enterTranslateStatus"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r5
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r8 = "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI"
            java.lang.String r9 = "enterTranslateStatus"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r5 = r1.f347071r
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6.mo10233c(r7)
            java.lang.Object[] r15 = r6.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI"
            java.lang.String r17 = "enterTranslateStatus"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r5
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r15 = "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI"
            java.lang.String r16 = "enterTranslateStatus"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r5 = r1.f347067n
            k20.a r14 = new k20.a
            r14.<init>()
            r15 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r6)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI"
            java.lang.String r9 = "enterTranslateStatus"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r5
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r14.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI"
            java.lang.String r8 = "enterTranslateStatus"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r5
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.widget.ImageView r5 = r1.f347073t
            r5.setVisibility(r3)
            android.view.View r5 = r1.f347066j
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r6)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI"
            java.lang.String r9 = "enterTranslateStatus"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r5
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r14.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI"
            java.lang.String r8 = "enterTranslateStatus"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r5
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            com.tencent.mm.ui.tools.MMGestureGallery r5 = r1.f347043A
            r5.setVisibility(r3)
            android.widget.TextView r5 = r1.f347072s
            r5.setVisibility(r15)
            android.animation.ValueAnimator r5 = r1.f347045C
            r5.setRepeatMode(r0)
            android.animation.ValueAnimator r5 = r1.f347045C
            r6 = -1
            r5.setRepeatCount(r6)
            android.animation.ValueAnimator r5 = r1.f347045C
            r5.start()
            java.lang.String r5 = r1.f347076w     // Catch:{ Exception -> 0x02a5 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x02a5 }
            if (r5 != 0) goto L_0x02ab
            android.graphics.Bitmap r5 = r1.f347074u     // Catch:{ Exception -> 0x02a5 }
            if (r5 == 0) goto L_0x02ab
            java.lang.String r5 = r1.f347076w     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r5 = vl2.C118679t.m167368c(r5)     // Catch:{ Exception -> 0x02a5 }
            r1.f347078y = r5     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r5 = r1.f347076w     // Catch:{ Exception -> 0x02a5 }
            int r6 = r1.f347054L     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r7 = "fileSize %d"
            java.lang.String r8 = "save img cost %d"
            r9 = 80
            if (r6 != 0) goto L_0x01fe
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02a5 }
            android.graphics.Bitmap r6 = r1.f347074u     // Catch:{ Exception -> 0x02a5 }
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = r1.f347076w     // Catch:{ Exception -> 0x02a5 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r6, r9, r12, r13, r3)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02a5 }
            long r12 = r12 - r10
            int r9 = (int) r12     // Catch:{ Exception -> 0x02a5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x02a5 }
            r6[r3] = r9     // Catch:{ Exception -> 0x02a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r6)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r8 = r1.f347076w     // Catch:{ Exception -> 0x02a5 }
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x02a5 }
            r6[r3] = r8     // Catch:{ Exception -> 0x02a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)     // Catch:{ Exception -> 0x02a5 }
            goto L_0x0291
        L_0x01fe:
            if (r6 != r0) goto L_0x0291
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a5 }
            r6.<init>()     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r10 = r1.f347076w     // Catch:{ Exception -> 0x02a5 }
            r6.append(r10)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r10 = r1.f347076w     // Catch:{ Exception -> 0x02a5 }
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106452m(r10)     // Catch:{ Exception -> 0x02a5 }
            r6.append(r10)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r6)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Class<com.tencent.mm.plugin.scanner.p> r10 = com.tencent.p014mm.plugin.scanner.C115674p.class
            di3.d r10 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x02a5 }
            com.tencent.mm.plugin.scanner.p r10 = (com.tencent.p014mm.plugin.scanner.C115674p) r10     // Catch:{ Exception -> 0x02a5 }
            sl2.b r10 = r10.Cx0()     // Catch:{ Exception -> 0x02a5 }
            xh.c8 r6 = r10.mo60806jo(r6)     // Catch:{ Exception -> 0x02a5 }
            if (r6 == 0) goto L_0x0253
            java.lang.String r10 = "already has translation result"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r6 = r6.field_resultFile     // Catch:{ Exception -> 0x02a5 }
            r1.f347077x = r6     // Catch:{ Exception -> 0x02a5 }
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x02a5 }
            r10.<init>()     // Catch:{ Exception -> 0x02a5 }
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r6, r10)     // Catch:{ Exception -> 0x02a5 }
            r1.f347075v = r6     // Catch:{ Exception -> 0x02a5 }
            if (r6 == 0) goto L_0x024e
            com.tencent.mm.plugin.scanner.ui.l r0 = new com.tencent.mm.plugin.scanner.ui.l     // Catch:{ Exception -> 0x02a5 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x02a5 }
            r5 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r5)     // Catch:{ Exception -> 0x02a5 }
            goto L_0x02ab
        L_0x024e:
            java.lang.String r6 = "can not find old translation result!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r6)     // Catch:{ Exception -> 0x02a5 }
        L_0x0253:
            int r6 = r1.f347055M     // Catch:{ Exception -> 0x02a5 }
            if (r6 == 0) goto L_0x0291
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02a5 }
            java.lang.Class<com.tencent.mm.plugin.scanner.k> r10 = com.tencent.p014mm.plugin.scanner.C115670k.class
            di3.d r10 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x02a5 }
            com.tencent.mm.plugin.scanner.k r10 = (com.tencent.p014mm.plugin.scanner.C115670k) r10     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r11 = "jpg"
            java.lang.String r10 = r10.mo57347wM(r11)     // Catch:{ Exception -> 0x02a5 }
            android.graphics.Bitmap r11 = r1.f347074u     // Catch:{ Exception -> 0x02a5 }
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x02a5 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r11, r9, r12, r10, r3)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02a5 }
            long r11 = r11 - r5
            int r5 = (int) r11     // Catch:{ Exception -> 0x02a5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x02a5 }
            r9[r3] = r5     // Catch:{ Exception -> 0x02a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r9)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x02a5 }
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x02a5 }
            r5[r3] = r6     // Catch:{ Exception -> 0x02a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r5)     // Catch:{ Exception -> 0x02a5 }
            r5 = r10
        L_0x0291:
            long[] r6 = r1.f347057P     // Catch:{ Exception -> 0x02a5 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02a5 }
            r6[r0] = r7     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r0 = r1.f347078y     // Catch:{ Exception -> 0x02a5 }
            r6 = 2
            com.tencent.mm.plugin.scanner.ui.m r7 = new com.tencent.mm.plugin.scanner.ui.m     // Catch:{ Exception -> 0x02a5 }
            r7.<init>(r1, r5)     // Catch:{ Exception -> 0x02a5 }
            vl2.C118679t.m167367a(r0, r5, r6, r7)     // Catch:{ Exception -> 0x02a5 }
            goto L_0x02ab
        L_0x02a5:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x02ab:
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r2 = 294(0x126, float:4.12E-43)
            r0.mo123455a(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.ScanTranslationCaptureUI.mo175939A4():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r1 = r3.f347062f;
     */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175940H7() {
        /*
            r3 = this;
            java.lang.String r0 = "MicroMsg.ScanTranslationCaptureUI"
            yk2.a r1 = r3.f347062f     // Catch:{ Exception -> 0x0015 }
            boolean r1 = r1.f324141c     // Catch:{ Exception -> 0x0015 }
            if (r1 == 0) goto L_0x001d
            yk2.a r1 = r3.f347062f     // Catch:{ Exception -> 0x0015 }
            android.hardware.Camera r2 = r1.f324139a     // Catch:{ Exception -> 0x0015 }
            if (r2 == 0) goto L_0x001d
            r2.stopPreview()     // Catch:{ Exception -> 0x0015 }
            r2 = 0
            r1.f324141c = r2     // Catch:{ Exception -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x0023 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ Exception -> 0x0023 }
        L_0x001d:
            yk2.a r1 = r3.f347062f     // Catch:{ Exception -> 0x0023 }
            r1.mo158639a()     // Catch:{ Exception -> 0x0023 }
            goto L_0x002b
        L_0x0023:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.ScanTranslationCaptureUI.mo175940H7():void");
    }

    /* renamed from: I7 */
    public final void mo175941I7() {
        getWindow().addFlags(2097280);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        try {
            if (this.f347061e == null || !this.f347062f.f324140b || this.f347062f.f324141c) {
                Log.m105924i("MicroMsg.ScanTranslationCaptureUI", "can not start preview");
            } else {
                Log.m105924i("MicroMsg.ScanTranslationCaptureUI", "start preview");
                this.f347062f.mo158652n(this.f347061e);
                this.f347064h.setEnabled(true);
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ScanTranslationCaptureUI", e.getMessage());
            C76879j.m92713G(this, getString(C0966R.string.idp), getString(C0966R.string.a3h), false, new C115691n(this));
        }
        hideTitleView();
        this.f347057P[0] = System.currentTimeMillis();
        if (this.f347054L == 0 && !Util.isNullOrNil(this.f347076w)) {
            C86013q1.m106447h(this.f347076w);
        }
        this.f347050H = 0;
        this.f347054L = 0;
        this.f347076w = null;
        this.f347077x = null;
        this.f347074u = null;
        this.f347075v = null;
        this.f347055M = 0;
        View view = this.f347070q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f347071r;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = this.f347066j;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f347067n;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f347043A.setVisibility(8);
        this.f347060d.setVisibility(0);
        this.f347072s.setVisibility(0);
        this.f347073t.setVisibility(8);
        this.f347045C.setRepeatMode(1);
        this.f347045C.setRepeatCount(0);
        this.f347045C.end();
        C86709a0.m107524d().mo123470p(294, this);
    }

    /* renamed from: J7 */
    public final void mo175942J7() {
        Class cls = C115674p.class;
        mo175950R7();
        this.f347050H = 3;
        View view = this.f347067n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f347051I.equalsIgnoreCase("zh_CN")) {
            this.f347068o.setImageResource(C0966R.C0969drawable.ayn);
        } else {
            this.f347068o.setImageResource(C0966R.C0969drawable.ayp);
        }
        this.f347073t.setVisibility(8);
        this.f347045C.setRepeatMode(1);
        this.f347045C.setRepeatCount(0);
        this.f347045C.end();
        if (this.f347054L == 1 && Util.isNullOrNil(this.f347077x)) {
            String Ax0 = ((C115674p) C86312j.m106911c(cls)).Ax0("jpg");
            this.f347077x = Ax0;
            try {
                BitmapUtil.saveBitmapToImage(this.f347075v, 80, Bitmap.CompressFormat.JPEG, Ax0, false);
                C30383k1 k1Var = new C30383k1();
                k1Var.field_originMD5 = MD5Util.getMD5String(this.f347076w + C86013q1.m106452m(this.f347076w));
                String str = this.f347077x;
                k1Var.field_resultFile = str;
                Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "insert translate result %s", str);
                ((C115674p) C86312j.m106911c(cls)).Cx0().mo60805Lo(k1Var);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e, "save translate result file error", new Object[0]);
            }
        }
    }

    /* renamed from: K7 */
    public final void mo175943K7() {
        C118684u Bx0 = ((C115674p) C86312j.m106911c(C115674p.class)).Bx0();
        Bx0.f355144a = 0;
        Bx0.f355145b = null;
        int i = this.f347050H;
        if (i == 0) {
            if (this.f347052J) {
                Log.m105924i("MicroMsg.ScanTranslationCaptureUI", "is playing animation");
                return;
            }
            this.f347046D.addListener(new ScanTranslationCaptureUI$$f(this));
            this.f347046D.reverse();
            this.f347052J = true;
        } else if (i == 1 || i == 2 || i == 3) {
            if (i == 1) {
                this.f347056N.f343793i = (long) ((int) (System.currentTimeMillis() - this.f347057P[1]));
            }
            OCRTranslateReportStruct oCRTranslateReportStruct = this.f347056N;
            if (oCRTranslateReportStruct.f343790f != 0) {
                oCRTranslateReportStruct.mo86054n();
            }
            mo175941I7();
        }
    }

    /* renamed from: L7 */
    public final void mo175944L7() {
        Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "curState %d", Integer.valueOf(this.f347050H));
        if (!this.f347062f.f324140b) {
            mo175947O7();
        }
        if (this.f347050H == 0 && this.f347062f.f324140b) {
            mo175941I7();
        }
    }

    /* renamed from: M7 */
    public final void mo175945M7() {
        if (!C76359b.m91785b()) {
            C76879j.m92711E(this, getString(C0966R.string.a3a), getString(C0966R.string.a0y), getString(C0966R.string.a0z), true, new ScanTranslationCaptureUI$$g(this));
            return;
        }
        mo175944L7();
    }

    /* renamed from: N7 */
    public final void mo175946N7(String str) {
        OCRTranslateReportStruct oCRTranslateReportStruct = this.f347056N;
        oCRTranslateReportStruct.f343790f = 5;
        oCRTranslateReportStruct.f343793i = (long) ((int) (System.currentTimeMillis() - this.f347057P[1]));
        String string = getString(C0966R.string.ien);
        if (Util.isNullOrNil(str)) {
            str = string;
        }
        C76879j.m92713G(this, str, "", false, new ScanTranslationCaptureUI$$n(this));
    }

    /* renamed from: O7 */
    public final void mo175947O7() {
        try {
            if (!this.f347062f.f324140b) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f347062f.mo158648j(getWindowManager().getDefaultDisplay().getRotation());
                this.f347062f.mo158653o(new ScanTranslationCaptureUI$$h(this));
                Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "open camera cost %s, failed count %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(this.f347053K));
                this.f347062f.mo164197v();
                Rect rect = new Rect();
                getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                this.f347062f.mo158651m(new Point(rect.width(), rect.height()));
                if (this.f347050H == 0) {
                    mo175941I7();
                }
                this.f347053K = 0;
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ScanTranslationCaptureUI", e.getMessage());
            int i = this.f347053K + 1;
            this.f347053K = i;
            if (i >= 5) {
                C76879j.m92713G(this, getString(C0966R.string.idp), getString(C0966R.string.a3h), false, new C115691n(this));
            } else {
                MMHandlerThread.postToMainThreadDelayed(new ScanTranslationCaptureUI$$i(this), 30);
            }
        }
    }

    /* renamed from: P7 */
    public final void mo175948P7() {
        if (LocaleUtil.getApplicationLanguage().equalsIgnoreCase("zh_CN")) {
            this.f347051I = LocaleUtil.getCurrentLanguage(this);
        } else {
            this.f347051I = LocaleUtil.getCurrentLanguage(this);
        }
        Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "targetLang %s", this.f347051I);
    }

    /* renamed from: Q7 */
    public final void mo175949Q7(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ScanTranslationCaptureUI$$v scanTranslationCaptureUI$$v = this.f347079z;
            scanTranslationCaptureUI$$v.f273276d = bitmap;
            scanTranslationCaptureUI$$v.notifyDataSetChanged();
        }
    }

    /* renamed from: R7 */
    public final void mo175950R7() {
        getController().mo177103x0(getResources().getColor(C0966R.color.ahf));
        getWindow().getDecorView().setSystemUiVisibility(1796);
    }

    /* renamed from: W6 */
    public void mo175938W6(int i, Bitmap bitmap) {
        ((C119157j) C119157j.f356862d).mo183895z(new ScanTranslationCaptureUI$$a(this, i, bitmap));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bui;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.iwf);
        this.f347047E = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        MMTextureView mMTextureView = (MMTextureView) findViewById(C0966R.C0970id.ktx);
        this.f347060d = mMTextureView;
        mMTextureView.setOpaque(false);
        this.f347060d.setSurfaceTextureListener(this);
        this.f347043A = (MMGestureGallery) findViewById(C0966R.C0970id.ktz);
        ScanTranslationCaptureUI$$v scanTranslationCaptureUI$$v = new ScanTranslationCaptureUI$$v(this, (C1156751) null);
        this.f347079z = scanTranslationCaptureUI$$v;
        this.f347043A.setAdapter(scanTranslationCaptureUI$$v);
        this.f347066j = findViewById(C0966R.C0970id.f357609ar0);
        View findViewById2 = findViewById(C0966R.C0970id.f359121j23);
        this.f347063g = findViewById2;
        findViewById2.setOnClickListener(new ScanTranslationCaptureUI$$o(this));
        View findViewById3 = findViewById(C0966R.C0970id.j19);
        this.f347064h = findViewById3;
        findViewById3.setOnClickListener(new ScanTranslationCaptureUI$$p(this));
        this.f347064h.setEnabled(false);
        this.f347072s = (TextView) findViewById(C0966R.C0970id.j1_);
        View findViewById4 = findViewById(C0966R.C0970id.f359122j24);
        this.f347065i = findViewById4;
        findViewById4.setOnClickListener(new ScanTranslationCaptureUI$$q(this));
        View findViewById5 = findViewById(C0966R.C0970id.j0u);
        this.f347067n = findViewById5;
        ImageView imageView = (ImageView) findViewById5.findViewById(C0966R.C0970id.ku4);
        this.f347068o = imageView;
        imageView.setOnClickListener(new ScanTranslationCaptureUI$$r(this));
        this.f347070q = findViewById(C0966R.C0970id.f359421ku3);
        this.f347071r = findViewById(C0966R.C0970id.ktw);
        hideTitleView();
        setMMTitle((int) C0966R.string.ibv);
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        this.f347073t = (ImageView) findViewById(C0966R.C0970id.j1e);
        View findViewById6 = this.f347067n.findViewById(C0966R.C0970id.kty);
        this.f347069p = findViewById6;
        findViewById6.setOnClickListener(new ScanTranslationCaptureUI$$s(this));
        setBackBtn(new ScanTranslationCaptureUI$$t(this));
        this.f347048F = getWindowManager().getDefaultDisplay().getHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f347045C = ofFloat;
        ofFloat.addListener(new ScanTranslationCaptureUI$$u(this));
        this.f347045C.addUpdateListener(new ScanTranslationCaptureUI$$b(this));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f347067n.getLayoutParams();
        layoutParams.bottomMargin += C85875k4.m106188j(this);
        this.f347067n.setLayoutParams(layoutParams);
        this.f347045C.setDuration(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        C88990b.m111194c(this, (C88990b.C61771c) null);
        this.f347047E.setOnTouchListener(new ScanTranslationCaptureUI$$c(this));
        mo175948P7();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f347046D = ofFloat2;
        ofFloat2.addUpdateListener(new ScanTranslationCaptureUI$$d(this));
        this.f347046D.addListener(new ScanTranslationCaptureUI$$e(this));
        this.f347046D.setDuration(300);
        PlayScanTranslateAnimEvent playScanTranslateAnimEvent = new PlayScanTranslateAnimEvent();
        playScanTranslateAnimEvent.f343590d.f343591a = 1;
        playScanTranslateAnimEvent.publish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 561 && i2 == -1) {
            String b = C7013o.m7260b(this, intent, C7970a.m8127a());
            Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "select: [%s]", b);
            if (!Util.isNullOrNil(b)) {
                this.f347076w = b;
                this.f347054L = 1;
                this.f347056N.f343788d = 2;
                int orientationInDegree = Exif.fromFile(b).getOrientationInDegree();
                this.f347055M = orientationInDegree;
                Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "degree %s", Integer.valueOf(orientationInDegree));
                Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(b);
                if (decodeFileWithSample != null) {
                    this.f347074u = BitmapUtil.rotate(decodeFileWithSample, (float) this.f347055M);
                    mo175939A4();
                    mo175949Q7(this.f347074u);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        this.f347062f = new C112475a();
        initView();
        this.f347058Q.alive();
        this.f347056N.f343788d = 3;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f347046D.removeAllUpdateListeners();
        this.f347045C.removeAllUpdateListeners();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo175943K7();
        return true;
    }

    public void onPause() {
        super.onPause();
        C103928o.m138642b();
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "get preview frame success, length %d", Integer.valueOf(bArr.length));
        try {
            if (bArr.length > 0) {
                this.f347074u = null;
                long currentTimeMillis = System.currentTimeMillis();
                Point point = this.f347062f.f324142d;
                YuvImage yuvImage = new YuvImage(bArr, 17, point.x, point.y, (int[]) null);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yuvImage.compressToJpeg(new Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
                Bitmap decodeByteArray = BitmapUtil.decodeByteArray(byteArrayOutputStream.toByteArray());
                int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
                if (decodeByteArray != null) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    this.f347074u = BitmapUtil.rotate(decodeByteArray, (float) this.f347062f.f324147i);
                    Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "decode cost %d, rotate cost %d", Integer.valueOf(currentTimeMillis2), Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis3)));
                    if (this.f347074u != null) {
                        this.f347076w = ((C115670k) C86312j.m106911c(C115670k.class)).L40("jpg");
                        mo175939A4();
                        mo175949Q7(this.f347074u);
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e, "", new Object[0]);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                this.f347044B = false;
                C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new ScanTranslationCaptureUI$$k(this), new ScanTranslationCaptureUI$$l(this));
                return;
            }
            mo175945M7();
        }
    }

    public void onResume() {
        super.onResume();
        C103928o.m138641a(true, true, true);
        getWindow().addFlags(2097280);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        C86709a0.m107524d().mo123455a(294, this);
        C86709a0.m107529k().mo121126a(this.f347059R);
        if (this.f347044B) {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.CAMERA", 16, (String) null, (String) null);
            Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "summerper checkPermission checkCamera[%b]", Boolean.valueOf(z1));
            if (z1) {
                mo175945M7();
                return;
            }
            return;
        }
        mo175944L7();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "errType %s, errCode %s, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            C115672t tVar = (C115672t) yVar;
            List<bk4> list = tVar.f347015g;
            if (list != null && tVar.f347016h == this.f347049G) {
                this.f347056N.f343792h = (long) ((int) (System.currentTimeMillis() - tVar.f347017i));
                LinkedList linkedList = (LinkedList) list;
                Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "angle %f, translationInfos length %d", Float.valueOf(tVar.mo175931j1()), Integer.valueOf(linkedList.size()));
                if (linkedList.size() > 0) {
                    this.f347056N.f343790f = 1;
                    ((C115674p) C86312j.m106911c(C115674p.class)).Bx0().mo183403e(this.f347049G, list, tVar.mo175931j1(), this.f347074u, this);
                    if (!Util.isNullOrNil(tVar.mo175932k1())) {
                        this.f347051I = tVar.mo175932k1();
                        return;
                    }
                    return;
                }
                this.f347056N.f343793i = (long) ((int) (System.currentTimeMillis() - this.f347057P[1]));
                C76879j.m92713G(this, getString(C0966R.string.ien), "", false, new ScanTranslationCaptureUI$$m(this));
                return;
            }
            return;
        }
        mo175946N7(str);
    }

    public void onStop() {
        super.onStop();
        mo175940H7();
        C86709a0.m107524d().mo123470p(294, this);
        this.f347058Q.dead();
        C86709a0.m107529k().mo121129d(this.f347059R);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.m105924i("MicroMsg.ScanTranslationCaptureUI", "surface texture available");
        this.f347060d.mo82024B();
        this.f347061e = surfaceTexture;
        if (this.f347044B) {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.CAMERA", 16, (String) null, (String) null);
            Log.m105925i("MicroMsg.ScanTranslationCaptureUI", "summerper checkPermission checkCamera[%b]", Boolean.valueOf(z1));
            if (z1) {
                mo175945M7();
            }
        } else if (!this.f347062f.f324140b) {
            mo175947O7();
        } else {
            mo175941I7();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
