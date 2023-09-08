package v23;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C64869yy;
import te3.C64899zy;
import th2.C110992d;
import wg2.C102440a;

/* renamed from: v23.q */
public final class C102143q extends C99417a {

    /* renamed from: f */
    public View f300791f;

    /* renamed from: g */
    public Context f300792g;

    /* renamed from: h */
    public RecordConfigProvider f300793h;

    /* renamed from: i */
    public C98324b f300794i;

    /* renamed from: j */
    public C102440a f300795j;

    /* renamed from: n */
    public final C64869yy f300796n = new C64869yy();

    /* renamed from: v23.q$a */
    public static final class C102144a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101198e f300797d;

        public C102144a(C101198e eVar) {
            this.f300797d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorRemuxPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101198e.C62622a.m73576a(this.f300797d, C101198e.C101199b.EDIT_FINISH, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorRemuxPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: v23.q$b */
    public static final class C102145b extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f300798d;

        /* renamed from: e */
        public final /* synthetic */ C64899zy f300799e;

        /* renamed from: f */
        public final /* synthetic */ C102143q f300800f;

        /* renamed from: g */
        public final /* synthetic */ Rect f300801g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102145b(C32226l<? super Boolean, C13598b0> lVar, C64899zy zyVar, C102143q qVar, Rect rect) {
            super(1);
            this.f300798d = lVar;
            this.f300799e = zyVar;
            this.f300800f = qVar;
            this.f300801g = rect;
        }

        public Object invoke(Object obj) {
            Bundle bundle;
            Bitmap bitmap = (Bitmap) obj;
            this.f300798d.invoke(Boolean.valueOf(bitmap != null));
            if (bitmap == null) {
                Log.m105920e("MicroMsg.TimelineEditorRemuxPlugin", "saveThumbBitmap error");
            } else {
                CaptureDataManager.f272890c.f272892b.putByteArray("video_composition", this.f300799e.toByteArray());
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                RecordConfigProvider recordConfigProvider = this.f300800f.f300793h;
                C87412m.m108591d(recordConfigProvider);
                BitmapUtil.saveBitmapToImage(bitmap, 60, compressFormat, recordConfigProvider.f272902C, true);
                Boolean bool = Boolean.TRUE;
                RecordConfigProvider recordConfigProvider2 = this.f300800f.f300793h;
                C87412m.m108591d(recordConfigProvider2);
                String str = recordConfigProvider2.f272902C;
                Boolean bool2 = Boolean.FALSE;
                C110992d dVar = C110992d.f332425a;
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = new CaptureDataManager.CaptureVideoNormalModel(bool, "", str, -1L, bool2, dVar.mo162676j());
                C98324b bVar = this.f300800f.f300794i;
                if (!(bVar == null || (bundle = bVar.f288193n) == null)) {
                    CaptureDataManager.f272890c.f272892b.putByteArray("KEY_POST_VIDEO_TEMPLATE", bundle.getByteArray("KEY_POST_VIDEO_TEMPLATE"));
                }
                CaptureDataManager.f272890c.f272892b.putParcelableArrayList("KEY_POST_HALF_RECT_LIST", C64197v.m75534c(this.f300801g));
                CaptureDataManager.f272890c.mo129794a(this.f300800f.f300792g, captureVideoNormalModel);
                CaptureDataManager.f272890c.mo129797d(true, dVar.mo162676j());
                C102440a aVar = this.f300800f.f300795j;
                if (aVar != null) {
                    aVar.mo142011a();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C102143q(android.view.View r4, qh2.C101198e r5) {
        /*
            r3 = this;
            java.lang.String r0 = "finishBtn"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "status"
            gy3.C87412m.m108594g(r5, r0)
            r0 = 0
            r3.<init>(r5, r0)
            r3.f300791f = r4
            android.content.Context r4 = r4.getContext()
            r3.f300792g = r4
            te3.yy r4 = new te3.yy
            r4.<init>()
            r3.f300796n = r4
            android.view.View r4 = r3.f300791f
            boolean r4 = r4 instanceof android.widget.TextView
            if (r4 == 0) goto L_0x0042
            i33.b r4 = i33.C98595b.f289089a
            android.content.Context r1 = r3.f300792g
            java.lang.String r2 = "context"
            gy3.C87412m.m108593f(r1, r2)
            r2 = 1096810496(0x41600000, float:14.0)
            float r4 = r4.mo137983a(r1, r2)
            android.view.View r1 = r3.f300791f
            boolean r2 = r1 instanceof android.widget.TextView
            if (r2 == 0) goto L_0x003c
            r0 = r1
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x003c:
            if (r0 == 0) goto L_0x0042
            r1 = 1
            r0.setTextSize(r1, r4)
        L_0x0042:
            android.view.View r4 = r3.f300791f
            v23.q$a r0 = new v23.q$a
            r0.<init>(r5)
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v23.C102143q.<init>(android.view.View, qh2.e):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x03dc A[LOOP:4: B:117:0x03d6->B:119:0x03dc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0497 A[LOOP:5: B:121:0x0491->B:123:0x0497, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0503  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141685x(sp3.C110807k r20, java.lang.String r21, android.graphics.Rect r22, android.graphics.Rect r23, android.graphics.Rect r24, boolean r25, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r26
            java.lang.String r7 = "videoComposition"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.String r7 = "editId"
            gy3.C87412m.m108594g(r2, r7)
            java.lang.String r7 = "previewRect"
            gy3.C87412m.m108594g(r3, r7)
            java.lang.String r7 = "fullscreenRect"
            gy3.C87412m.m108594g(r4, r7)
            java.lang.String r7 = "cropRect"
            gy3.C87412m.m108594g(r5, r7)
            java.lang.String r7 = "callback"
            gy3.C87412m.m108594g(r6, r7)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r7 = r0.f300793h
            if (r7 == 0) goto L_0x058f
            com.tencent.mm.modelcontrol.VideoTransPara r8 = r7.f272926n
            java.lang.String r9 = "provider.videoParam"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r7 = r7.f272901B
            java.lang.String r9 = "provider.outputVideoPath"
            gy3.C87412m.m108593f(r7, r9)
            te3.az r9 = new te3.az
            r9.<init>()
            com.tencent.mm.modelcontrol.VideoTransPara r10 = new com.tencent.mm.modelcontrol.VideoTransPara
            r10.<init>((com.tencent.p014mm.modelcontrol.VideoTransPara) r8)
            int r11 = r10.f267166d
            float r12 = (float) r11
            int r13 = r24.height()
            float r13 = (float) r13
            int r14 = r24.width()
            float r14 = (float) r14
            float r13 = r13 / r14
            float r12 = r12 * r13
            int r12 = (int) r12
            r10.f267166d = r11
            r10.f267167e = r12
            r9.f297896d = r7
            te3.ep3 r7 = new te3.ep3
            r7.<init>()
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r3, r7)
            r9.f297914y = r7
            com.tencent.mm.plugin.vlog.model.i$a r3 = com.tencent.p014mm.plugin.vlog.model.C96543i.f282548f
            int r7 = r23.width()
            int r7 = r3.mo134604c(r7)
            r9.f297897e = r7
            int r7 = r23.height()
            int r7 = r3.mo134604c(r7)
            r9.f297898f = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r9.f297900h = r7
            te3.n93 r7 = new te3.n93
            r7.<init>()
            te3.ep3 r12 = new te3.ep3
            r12.<init>()
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r4, r12)
            r7.f184446d = r12
            int r12 = r3.mo134604c(r11)
            r7.f184447e = r12
            int r12 = r23.height()
            int r12 = r12 * r11
            int r13 = r23.width()
            int r12 = r12 / r13
            int r12 = r3.mo134604c(r12)
            r7.f184448f = r12
            r9.f297915z = r7
            te3.n93 r7 = new te3.n93
            r7.<init>()
            te3.ep3 r12 = new te3.ep3
            r12.<init>()
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r5, r12)
            r7.f184446d = r12
            int r12 = r3.mo134604c(r11)
            r7.f184447e = r12
            int r12 = r24.height()
            int r11 = r11 * r12
            int r12 = r24.width()
            int r11 = r11 / r12
            int r11 = r3.mo134604c(r11)
            r7.f184448f = r11
            r9.f297894A = r7
            int r7 = r23.height()
            int r11 = r24.height()
            if (r7 != r11) goto L_0x00e5
            te3.n93 r7 = r9.f297894A
            r9.f297915z = r7
        L_0x00e5:
            r1.mo162392o(r5)
            r3.mo134605d(r8, r9)
            java.util.ArrayList<sp3.c> r3 = r1.f331511l
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00f6:
            boolean r8 = r3.hasNext()
            r12 = 1
            r13 = 2
            if (r8 == 0) goto L_0x0112
            java.lang.Object r8 = r3.next()
            r14 = r8
            sp3.c r14 = (sp3.C110801c) r14
            int r14 = r14.f331483u
            if (r14 != r13) goto L_0x010b
            r11 = 1
            goto L_0x010c
        L_0x010b:
            r11 = 0
        L_0x010c:
            if (r11 == 0) goto L_0x00f6
            r7.add(r8)
            goto L_0x00f6
        L_0x0112:
            int r3 = r7.size()
            java.lang.String r7 = ", "
            java.lang.String r8 = "MicroMsg.TimelineEditorRemuxPlugin"
            if (r3 != r12) goto L_0x02e1
            java.util.ArrayList<sp3.c> r3 = r1.f331511l
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x02d9
            java.lang.Object r15 = r3.next()
            sp3.c r15 = (sp3.C110801c) r15
            int r11 = r15.f331483u
            if (r11 != r13) goto L_0x0134
            r11 = 1
            goto L_0x0135
        L_0x0134:
            r11 = 0
        L_0x0135:
            if (r11 == 0) goto L_0x02d3
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r3 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r11 = r15.f331482t
            rw.m$a r3 = r3.mo129930b(r11)
            if (r3 == 0) goto L_0x033a
            int r11 = r3.f180525a
            if (r11 <= 0) goto L_0x033a
            int r15 = r3.f180526b
            if (r15 <= 0) goto L_0x033a
            float r13 = r3.f180527c
            r16 = 0
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x033a
            int r13 = r3.f180530f
            r14 = 180(0xb4, float:2.52E-43)
            if (r13 == 0) goto L_0x015b
            if (r13 != r14) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r11 = r15
        L_0x015b:
            te3.n93 r13 = r9.f297915z
            int r15 = r13.f184447e
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r15 <= r11) goto L_0x01ac
            int r15 = r11 % 2
            if (r15 == 0) goto L_0x016a
            int r15 = r11 + -1
            goto L_0x016b
        L_0x016a:
            r15 = r11
        L_0x016b:
            r13.f184447e = r15
            int r15 = r23.height()
            double r14 = (double) r15
            double r14 = r14 * r17
            int r12 = r23.width()
            double r5 = (double) r12
            double r14 = r14 / r5
            int r5 = r13.f184447e
            double r5 = (double) r5
            double r14 = r14 * r5
            int r5 = (int) r14
            int r6 = r5 % 2
            if (r6 == 0) goto L_0x0186
            int r5 = r5 + -1
        L_0x0186:
            r13.f184448f = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "update fullScreenConfig size:["
            r5.append(r6)
            int r6 = r13.f184447e
            r5.append(r6)
            r5.append(r7)
            int r6 = r13.f184448f
            r5.append(r6)
            r6 = 93
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
        L_0x01ac:
            te3.n93 r5 = r9.f297894A
            int r6 = r5.f184447e
            if (r6 <= r11) goto L_0x01fb
            int r6 = r11 % 2
            if (r6 == 0) goto L_0x01b9
            int r6 = r11 + -1
            goto L_0x01ba
        L_0x01b9:
            r6 = r11
        L_0x01ba:
            r5.f184447e = r6
            int r6 = r24.height()
            double r12 = (double) r6
            double r12 = r12 * r17
            int r6 = r24.width()
            double r14 = (double) r6
            double r12 = r12 / r14
            int r6 = r5.f184447e
            double r14 = (double) r6
            double r12 = r12 * r14
            int r6 = (int) r12
            int r12 = r6 % 2
            if (r12 == 0) goto L_0x01d5
            int r6 = r6 + -1
        L_0x01d5:
            r5.f184448f = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "update cropConfig size:["
            r6.append(r12)
            int r12 = r5.f184447e
            r6.append(r12)
            r6.append(r7)
            int r5 = r5.f184448f
            r6.append(r5)
            r5 = 93
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
        L_0x01fb:
            int r5 = r3.f180530f
            if (r5 == 0) goto L_0x0207
            r6 = 180(0xb4, float:2.52E-43)
            if (r5 != r6) goto L_0x0204
            goto L_0x0207
        L_0x0204:
            int r5 = r3.f180525a
            goto L_0x0209
        L_0x0207:
            int r5 = r3.f180526b
        L_0x0209:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "fullscreenRect:"
            r6.append(r12)
            r6.append(r4)
            java.lang.String r12 = ", videoParam.width:"
            r6.append(r12)
            int r12 = r10.f267166d
            r6.append(r12)
            java.lang.String r12 = ", heightLimit:"
            r6.append(r12)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            if (r11 <= r5) goto L_0x029f
            int r6 = r10.f267166d
            int r6 = java.lang.Math.min(r5, r6)
            int r4 = r23.height()
            if (r4 >= r6) goto L_0x025d
            float r4 = (float) r6
            te3.n93 r5 = r9.f297915z
            int r5 = r5.f184448f
            float r5 = (float) r5
            float r4 = r4 / r5
            r9.f297900h = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[widescreen] update outputScale:"
            r4.append(r5)
            float r5 = r9.f297900h
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            goto L_0x029f
        L_0x025d:
            te3.n93 r4 = r9.f297915z
            int r10 = r6 % 2
            if (r10 == 0) goto L_0x0266
            int r10 = r6 + -1
            goto L_0x0267
        L_0x0266:
            r10 = r6
        L_0x0267:
            r4.f184448f = r10
            float r6 = (float) r6
            float r10 = (float) r11
            float r6 = r6 * r10
            float r5 = (float) r5
            float r6 = r6 / r5
            int r5 = (int) r6
            int r6 = r5 % 2
            if (r6 == 0) goto L_0x0276
            int r5 = r5 + -1
        L_0x0276:
            r4.f184447e = r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[widescreen] update fullScreenConfig size:["
            r4.append(r5)
            te3.n93 r5 = r9.f297915z
            int r5 = r5.f184447e
            r4.append(r5)
            r4.append(r7)
            te3.n93 r5 = r9.f297915z
            int r5 = r5.f184448f
            r4.append(r5)
            r5 = 93
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
        L_0x029f:
            java.lang.String r4 = ""
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x02bd
            int r4 = r9.f297906q
            int r5 = r3.f180532h
            if (r4 <= r5) goto L_0x02b1
            r9.f297906q = r5
        L_0x02b1:
            int r4 = r9.f297907r
            int r5 = r3.f180534j
            if (r4 <= r5) goto L_0x02bd
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r5 <= r4) goto L_0x02bd
            r9.f297907r = r5
        L_0x02bd:
            int r4 = r9.f297904o
            float r5 = r3.f180527c
            int r5 = (int) r5
            int r4 = java.lang.Math.min(r4, r5)
            r9.f297904o = r4
            int r3 = r3.f180533i
            r4 = 2
            int r3 = java.lang.Math.min(r3, r4)
            r9.f297908s = r3
            goto L_0x033a
        L_0x02d3:
            r5 = r24
            r6 = r26
            goto L_0x0122
        L_0x02d9:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        L_0x02e1:
            java.util.ArrayList<sp3.c> r3 = r1.f331511l
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x02ec:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0307
            java.lang.Object r5 = r3.next()
            r6 = r5
            sp3.c r6 = (sp3.C110801c) r6
            int r6 = r6.f331483u
            r10 = 2
            if (r6 != r10) goto L_0x0300
            r6 = 1
            goto L_0x0301
        L_0x0300:
            r6 = 0
        L_0x0301:
            if (r6 == 0) goto L_0x02ec
            r4.add(r5)
            goto L_0x02ec
        L_0x0307:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x030e
            goto L_0x0334
        L_0x030e:
            java.util.Iterator r3 = r4.iterator()
        L_0x0312:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0334
            java.lang.Object r4 = r3.next()
            sp3.c r4 = (sp3.C110801c) r4
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r5 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r4 = r4.f331482t
            rw.m$a r4 = r5.mo129930b(r4)
            if (r4 == 0) goto L_0x032f
            int r4 = r4.f180533i
            r5 = 1
            if (r4 != r5) goto L_0x032f
            r4 = 1
            goto L_0x0330
        L_0x032f:
            r4 = 0
        L_0x0330:
            if (r4 == 0) goto L_0x0312
            r3 = 1
            goto L_0x0335
        L_0x0334:
            r3 = 0
        L_0x0335:
            if (r3 == 0) goto L_0x033c
            r3 = 1
            r9.f297908s = r3
        L_0x033a:
            r3 = 2
            goto L_0x033f
        L_0x033c:
            r3 = 2
            r9.f297908s = r3
        L_0x033f:
            int r4 = r9.f297908s
            int r4 = java.lang.Math.min(r4, r3)
            r9.f297908s = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getExportConfig: fullTarget:["
            r3.append(r4)
            te3.n93 r4 = r9.f297915z
            int r4 = r4.f184447e
            r3.append(r4)
            r3.append(r7)
            te3.n93 r4 = r9.f297915z
            int r4 = r4.f184448f
            r3.append(r4)
            java.lang.String r4 = "] cropTarget:["
            r3.append(r4)
            te3.n93 r4 = r9.f297894A
            int r4 = r4.f184447e
            r3.append(r4)
            r4 = 44
            r3.append(r4)
            te3.n93 r5 = r9.f297894A
            int r5 = r5.f184448f
            r3.append(r5)
            java.lang.String r5 = "] audio:"
            r3.append(r5)
            int r5 = r9.f297908s
            r3.append(r5)
            r3.append(r4)
            int r5 = r9.f297906q
            r3.append(r5)
            r3.append(r4)
            int r4 = r9.f297907r
            r3.append(r4)
            java.lang.String r4 = ", cropRect:"
            r3.append(r4)
            r4 = r24
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            te3.zy r3 = new te3.zy
            r3.<init>()
            com.tencent.tav.coremedia.CMTimeRange r5 = r20.mo162387j()
            long r5 = r5.getStartUs()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r7
            long r5 = r5 / r7
            r3.f186900e = r5
            com.tencent.tav.coremedia.CMTimeRange r5 = r20.mo162387j()
            long r5 = r5.getEndUs()
            long r5 = r5 / r7
            r3.f186901f = r5
            java.util.LinkedList<te3.hi4> r5 = r3.f186899d
            java.util.ArrayList<sp3.c> r6 = r1.f331511l
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x03d6:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0474
            java.lang.Object r8 = r6.next()
            sp3.c r8 = (sp3.C110801c) r8
            te3.hi4 r10 = new te3.hi4
            r10.<init>()
            java.lang.String r11 = "track"
            gy3.C87412m.m108594g(r8, r11)
            java.lang.String r11 = r8.f331482t
            r10.f183504d = r11
            int r11 = r8.f331483u
            r10.f183505e = r11
            long r11 = r8.f331464b
            r10.f183506f = r11
            long r11 = r8.f331465c
            r10.f183507g = r11
            long r11 = r8.f331466d
            r10.f183508h = r11
            long r11 = r8.f331467e
            r10.f183509i = r11
            long r11 = r8.f331470h
            r10.f183510j = r11
            int r11 = r8.f331471i
            r10.f183511n = r11
            int r11 = r8.f331472j
            r10.f183512o = r11
            float r11 = r8.f331469g
            r10.f183514q = r11
            te3.m10 r11 = new te3.m10
            r11.<init>()
            r10.f183515r = r11
            te3.ep3 r12 = new te3.ep3
            r12.<init>()
            r11.f184196e = r12
            te3.ep3 r12 = new te3.ep3
            r12.<init>()
            r11.f184199h = r12
            te3.ep3 r12 = new te3.ep3
            r12.<init>()
            r11.f184198g = r12
            android.graphics.Rect r12 = r8.f331474l
            te3.ep3 r13 = r11.f184196e
            java.lang.String r14 = "proto.cropRect"
            gy3.C87412m.m108593f(r13, r14)
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r12, r13)
            android.graphics.Rect r12 = r8.f331475m
            te3.ep3 r13 = r11.f184199h
            java.lang.String r14 = "proto.trackCropRect"
            gy3.C87412m.m108593f(r13, r14)
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r12, r13)
            android.graphics.Rect r12 = r8.f331474l
            te3.ep3 r11 = r11.f184198g
            java.lang.String r13 = "proto.contentRect"
            gy3.C87412m.m108593f(r11, r13)
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r12, r11)
            te3.tj4 r11 = new te3.tj4
            r11.<init>()
            r10.f183517t = r11
            sp3.h r8 = r8.f331477o
            java.lang.String r12 = "transition"
            gy3.C87412m.m108594g(r8, r12)
            java.lang.String r12 = r8.f331493a
            r11.f142248d = r12
            long r12 = r8.f331495c
            r11.f142250f = r12
            r7.add(r10)
            goto L_0x03d6
        L_0x0474:
            r5.addAll(r7)
            boolean r5 = r1.f331512m
            r3.f186902g = r5
            r5 = 1
            r3.f186905j = r5
            r3.f186904i = r9
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r3.f186910r = r5
            java.util.HashMap<java.lang.String, android.util.Pair<java.lang.Integer, java.lang.Long>> r5 = d23.C106976a.f320219l
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0491:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x04dc
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            te3.bz r7 = new te3.bz
            r7.<init>()
            java.lang.Object r8 = r6.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r7.f182337d = r8
            java.lang.Object r8 = r6.getValue()
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r8 = r8.first
            java.lang.String r9 = "it.value.first"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.f182338e = r8
            java.lang.Object r6 = r6.getValue()
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r6 = r6.second
            java.lang.String r8 = "it.value.second"
            gy3.C87412m.m108593f(r6, r8)
            java.lang.Number r6 = (java.lang.Number) r6
            long r8 = r6.longValue()
            r7.f182339f = r8
            java.util.LinkedList<te3.bz> r6 = r3.f186910r
            r6.add(r7)
            goto L_0x0491
        L_0x04dc:
            r3.f186911s = r2
            r2 = r25
            r3.f186909q = r2
            te3.yy r2 = r0.f300796n
            r3.f186906n = r2
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r2 = r2.f272892b
            byte[] r5 = r3.toByteArray()
            java.lang.String r6 = "video_composition"
            r2.putByteArray(r6, r5)
            java.util.LinkedList<te3.hi4> r2 = r3.f186899d
            java.lang.String r5 = "compositionInfo.tracks"
            gy3.C87412m.m108593f(r2, r5)
            boolean r2 = r2.isEmpty()
            r6 = 1
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x0534
            java.util.LinkedList<te3.hi4> r2 = r3.f186899d
            gy3.C87412m.m108593f(r2, r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x050c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0524
            java.lang.Object r5 = r2.next()
            r7 = r5
            te3.hi4 r7 = (te3.hi4) r7
            int r7 = r7.f183505e
            r8 = 2
            if (r7 != r8) goto L_0x0520
            r7 = 1
            goto L_0x0521
        L_0x0520:
            r7 = 0
        L_0x0521:
            if (r7 == 0) goto L_0x050c
            goto L_0x0525
        L_0x0524:
            r5 = 0
        L_0x0525:
            te3.hi4 r5 = (te3.hi4) r5
            if (r5 == 0) goto L_0x0534
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r2 = r2.f272892b
            java.lang.String r5 = r5.f183504d
            java.lang.String r6 = "KEY_POST_ORIGIN_FILE_PATH"
            r2.putString(r6, r5)
        L_0x0534:
            v23.q$b r2 = new v23.q$b
            r5 = r26
            r2.<init>(r5, r3, r0, r4)
            ei2.c r4 = com.tencent.p014mm.plugin.vlog.model.C96551o.m123875e(r3)
            r5 = r4
            ei2.f r5 = (ei2.C97651f) r5
            r5.start()
            com.tencent.mm.plugin.vlog.model.p0 r5 = x23.C102552a.m135387a(r20)
            com.tencent.mm.xeffect.effect.EffectManager r6 = d23.C106976a.f320215h
            r5.mo134623t(r6)
            r5.mo134622s(r4)
            android.util.Size r6 = new android.util.Size
            int r7 = r1.f331503d
            int r8 = r1.f331504e
            r6.<init>(r7, r8)
            int r7 = r6.getWidth()
            int r6 = r6.getHeight()
            r5.mo81184c(r7, r6)
            long r6 = r20.mo162388k()
            long r8 = r20.mo162386i()
            r5.mo81182a(r6, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            te3.az r6 = r3.f186904i
            te3.n93 r6 = r6.f297915z
            te3.ep3 r6 = r6.f184446d
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123876f(r6, r1)
            r5.mo81183b(r1)
            te3.az r1 = r3.f186904i
            te3.n93 r1 = r1.f297915z
            int r1 = r1.f184447e
            v23.s r3 = new v23.s
            r3.<init>(r4, r2)
            r5.mo134617n(r1, r3)
        L_0x058f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v23.C102143q.mo141685x(sp3.k, java.lang.String, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, boolean, fy3.l):void");
    }
}
