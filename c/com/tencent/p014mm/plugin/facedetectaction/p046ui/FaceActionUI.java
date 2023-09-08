package com.tencent.p014mm.plugin.facedetectaction.p046ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au1.C0222b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetectlight.p1100ui.PreviewFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import j20.C117292a;
import java.util.ArrayList;
import mb1.C109595c;
import mb1.C109603j;
import nb1.C109730b;
import nb1.C109734f;
import nb1.C109738g;
import nj3.C88989a;
import ob1.C110011a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI */
public class FaceActionUI extends MMActivity {

    /* renamed from: J */
    public static final /* synthetic */ int f312664J = 0;

    /* renamed from: A */
    public C109595c.C109596a f312665A;

    /* renamed from: B */
    public int f312666B;

    /* renamed from: C */
    public int f312667C;

    /* renamed from: D */
    public int f312668D;

    /* renamed from: E */
    public long f312669E;

    /* renamed from: F */
    public long f312670F;

    /* renamed from: G */
    public int f312671G;

    /* renamed from: H */
    public String f312672H = "";

    /* renamed from: I */
    public int f312673I = 0;

    /* renamed from: d */
    public RelativeLayout f312674d;

    /* renamed from: e */
    public RelativeLayout f312675e;

    /* renamed from: f */
    public RelativeLayout f312676f;

    /* renamed from: g */
    public RelativeLayout f312677g;

    /* renamed from: h */
    public PreviewFrameLayout f312678h;

    /* renamed from: i */
    public FaceActionMask f312679i;

    /* renamed from: j */
    public MMTextureView f312680j;

    /* renamed from: n */
    public ImageView f312681n;

    /* renamed from: o */
    public TextView f312682o;

    /* renamed from: p */
    public ImageView f312683p;

    /* renamed from: q */
    public ImageView f312684q;

    /* renamed from: r */
    public ImageView f312685r;

    /* renamed from: s */
    public ImageView f312686s;

    /* renamed from: t */
    public Button f312687t;

    /* renamed from: u */
    public Button f312688u;

    /* renamed from: v */
    public TextView f312689v;

    /* renamed from: w */
    public boolean f312690w = false;

    /* renamed from: x */
    public int f312691x;

    /* renamed from: y */
    public String f312692y;

    /* renamed from: z */
    public C110011a f312693z;

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI$a */
    public class C105244a implements Runnable {
        public C105244a() {
        }

        public void run() {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) FaceActionUI.this.f312684q.getLayoutParams();
            marginLayoutParams.topMargin = (int) (((double) FaceActionUI.this.f312679i.getHeight()) * 0.4d);
            FaceActionUI.this.f312684q.setLayoutParams(marginLayoutParams);
            FaceActionUI.this.f312684q.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI$b */
    public class C105245b implements Runnable {
        public C105245b() {
        }

        public void run() {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) FaceActionUI.this.f312682o.getLayoutParams();
            int height = ((int) (((double) FaceActionUI.this.f312679i.getHeight()) * 0.4d)) + ((int) (((double) FaceActionUI.this.f312679i.getWidth()) * 0.35d)) + C74942w4.m89784a(FaceActionUI.this, 30);
            marginLayoutParams.topMargin = height;
            Log.m105925i("MicroMsg.FaceActionUI", "topMargin：%d", Integer.valueOf(height));
            FaceActionUI.this.f312682o.setLayoutParams(marginLayoutParams);
            FaceActionUI.this.f312682o.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI$c */
    public class C105246c implements View.OnClickListener {
        public C105246c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FaceActionUI faceActionUI = FaceActionUI.this;
            if (faceActionUI.f312673I == 3) {
                faceActionUI.mo149630H7("fail", faceActionUI.f312666B, "", faceActionUI.f312672H);
            } else {
                C109603j.f328125A.mo160810a();
            }
            FaceActionUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI$d */
    public class C105247d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f312697d;

        public C105247d(int i) {
            this.f312697d = i;
        }

        public void run() {
            C0222b.m169h(this.f312697d);
            FaceActionUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public void mo149630H7(String str, int i, String str2, String str3) {
        Log.m105924i("MicroMsg.FaceActionUI", "callbackDetectFailed（）");
        Bundle bundle = new Bundle();
        bundle.putString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str2);
        bundle.putString("serial_id", str3);
        mo149631I7(str, i, bundle, Boolean.valueOf(this.f312690w));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011d  */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo149631I7(java.lang.String r10, int r11, android.os.Bundle r12, java.lang.Boolean r13) {
        /*
            r9 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "MicroMsg.FaceActionUI"
            java.lang.String r5 = "finishWithResult errMsg: %s, errCode: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r1)
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x001e
            java.lang.String r13 = "yes"
            goto L_0x0020
        L_0x001e:
            java.lang.String r13 = "no"
        L_0x0020:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r5 = "click_other_verify_btn"
            r1.putString(r5, r13)
            if (r12 == 0) goto L_0x002f
            r1.putAll(r12)
        L_0x002f:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.String r13 = r9.f312672H
            r12[r2] = r13
            java.lang.String r13 = "seriaId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r12)
            java.lang.String r12 = r9.f312672H
            java.lang.String r13 = "serial_id"
            r1.putString(r13, r12)
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.String r13 = "err_code"
            r12.putInt(r13, r11)
            java.lang.String r13 = "err_msg"
            r12.putString(r13, r10)
            int r13 = r9.f312667C
            java.lang.String r5 = "scene"
            r12.putInt(r5, r13)
            int r13 = r9.f312668D
            java.lang.String r5 = "countFace"
            r12.putInt(r5, r13)
            int r13 = r9.f312671G
            java.lang.String r5 = "err_type"
            r12.putInt(r5, r13)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r9.f312670F = r5
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r5 = "endTime："
            r13.append(r5)
            long r5 = r9.f312670F
            r13.append(r5)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r5 = "startTime："
            r13.append(r5)
            long r5 = r9.f312669E
            r13.append(r5)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            long r5 = r9.f312670F
            long r7 = r9.f312669E
            long r5 = r5 - r7
            java.lang.String r13 = "totalTime"
            r12.putLong(r13, r5)
            r12.putAll(r1)
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            r13.putExtras(r12)
            r10.getClass()
            int r12 = r10.hashCode()
            r1 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
            r5 = -1
            if (r12 == r1) goto L_0x00de
            r1 = 3548(0xddc, float:4.972E-42)
            if (r12 == r1) goto L_0x00d3
            r1 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r12 == r1) goto L_0x00c8
            goto L_0x00e6
        L_0x00c8:
            java.lang.String r12 = "fail"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00d1
            goto L_0x00e6
        L_0x00d1:
            r10 = 2
            goto L_0x00e9
        L_0x00d3:
            java.lang.String r12 = "ok"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00dc
            goto L_0x00e6
        L_0x00dc:
            r10 = 1
            goto L_0x00e9
        L_0x00de:
            java.lang.String r12 = "cancel"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00e8
        L_0x00e6:
            r10 = -1
            goto L_0x00e9
        L_0x00e8:
            r10 = 0
        L_0x00e9:
            if (r10 == 0) goto L_0x00fb
            if (r10 == r4) goto L_0x00f7
            if (r10 == r0) goto L_0x00f3
            r9.setResult(r5, r13)
            goto L_0x0104
        L_0x00f3:
            r9.setResult(r4, r13)
            goto L_0x0104
        L_0x00f7:
            r9.setResult(r5, r13)
            goto L_0x0104
        L_0x00fb:
            java.lang.String r10 = "usrCancel"
            au1.C0222b.m172k(r10)
            r9.setResult(r2, r13)
        L_0x0104:
            if (r11 != 0) goto L_0x011d
            java.lang.String r10 = "errCode == ConstantsFace.UploadErrCode.OK"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            zt3.t r10 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI$d r12 = new com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI$d
            r12.<init>(r11)
            r0 = 1500(0x5dc, double:7.41E-321)
            zt3.j r10 = (zt3.C119157j) r10
            r10.getClass()
            r10.mo183892w(r12, r0, r2)
            goto L_0x0123
        L_0x011d:
            au1.C0222b.m169h(r11)
            r9.finish()
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI.mo149631I7(java.lang.String, int, android.os.Bundle, java.lang.Boolean):void");
    }

    /* renamed from: J7 */
    public final void mo149632J7() {
        this.f312674d = (RelativeLayout) findViewById(C0966R.C0970id.cqi);
        this.f312678h = (PreviewFrameLayout) findViewById(C0966R.C0970id.cqc);
        MMTextureView mMTextureView = (MMTextureView) findViewById(C0966R.C0970id.cqb);
        this.f312680j = mMTextureView;
        mMTextureView.setVisibility(4);
        this.f312679i = (FaceActionMask) findViewById(C0966R.C0970id.cqd);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.cov);
        this.f312684q = imageView;
        imageView.post(new C105244a());
        TextView textView = (TextView) findViewById(C0966R.C0970id.cqe);
        this.f312682o = textView;
        textView.post(new C105245b());
        ((TextView) findViewById(C0966R.C0970id.cou)).setOnClickListener(new C105246c());
        this.f312673I = 0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a5d;
    }

    public void onBackPressed() {
        if (this.f312673I == 3) {
            mo149630H7("fail", this.f312666B, "", this.f312672H);
        } else {
            C109603j.f328125A.mo160810a();
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.FaceActionUI", "onCreate()");
        super.onCreate(bundle);
        C0222b.m164c().f9712e = 1;
        C0222b.m172k("enter");
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(2097280);
        this.f312667C = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f312668D = 0;
        this.f312669E = Util.currentTicks();
        this.f312671G = 4;
        getWindow().getDecorView().setSystemUiVisibility(1280);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        Log.m105918d("MicroMsg.FaceActionUI", "initLayout");
        this.f312681n = (ImageView) findViewById(C0966R.C0970id.a3j);
        mo149632J7();
        this.f312675e = (RelativeLayout) findViewById(C0966R.C0970id.cr7);
        this.f312676f = (RelativeLayout) findViewById(C0966R.C0970id.cr8);
        this.f312677g = (RelativeLayout) findViewById(C0966R.C0970id.cr6);
        this.f312675e.setVisibility(4);
        this.f312676f.setVisibility(4);
        this.f312677g.setVisibility(4);
        this.f312683p = (ImageView) findViewById(C0966R.C0970id.cpl);
        this.f312685r = (ImageView) findViewById(C0966R.C0970id.cpi);
        this.f312686s = (ImageView) findViewById(C0966R.C0970id.cpr);
        this.f312689v = (TextView) findViewById(C0966R.C0970id.cpp);
        this.f312687t = (Button) findViewById(C0966R.C0970id.cpn);
        this.f312688u = (Button) findViewById(C0966R.C0970id.cpo);
        if (!Util.isNullOrNil(C109603j.f328125A.f328131i)) {
            this.f312688u.setText(C109603j.f328125A.f328131i);
            this.f312688u.setOnClickListener(new C109738g(this));
        } else {
            this.f312688u.setVisibility(8);
        }
        if (C85191v.m105063b(this)) {
            Log.m105924i("MicroMsg.FaceActionUI", "carson: checkFacePermissionAnd Request true and do init ");
            this.f312665A = new C109730b(this);
            C109603j jVar = C109603j.f328125A;
            jVar.f328137r = new C109734f(this);
            jVar.f328138s = this;
            jVar.mo160812c(this);
            return;
        }
        Log.m105924i("MicroMsg.FaceActionUI", "carson: no camera permission. request permission");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.FaceActionUI", "onDestroy");
        C109603j.f328125A.mo160811b(true);
        C109603j.f328125A.f328138s = null;
    }

    public void onPause() {
        Log.m105918d("MicroMsg.FaceActionUI", "onPause");
        super.onPause();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r9, java.lang.String[] r10, int[] r11) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.FaceActionUI"
            java.lang.String r1 = "carson onRequestPermissionsResult"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r11 == 0) goto L_0x00f2
            int r1 = r11.length
            if (r1 > 0) goto L_0x000e
            goto L_0x00f2
        L_0x000e:
            r1 = 23
            if (r9 == r1) goto L_0x0014
            goto L_0x00f2
        L_0x0014:
            int r9 = r11.length
            r1 = 2131833959(0x7f113467, float:1.9301015E38)
            java.lang.String r2 = "audio permission not granted"
            java.lang.String r3 = "camera permission not granted"
            java.lang.String r4 = ""
            r5 = 2131833941(0x7f113455, float:1.9300978E38)
            r6 = 1
            r7 = 0
            if (r9 != r6) goto L_0x004a
            r9 = r11[r7]
            if (r9 != 0) goto L_0x002b
            goto L_0x00db
        L_0x002b:
            r9 = r10[r7]
            java.lang.String r11 = "android.permission.CAMERA"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x003b
            java.lang.String r4 = r8.getString(r5)
            r2 = r3
            goto L_0x007b
        L_0x003b:
            r9 = r10[r7]
            java.lang.String r10 = "android.permission.RECORD_AUDIO"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x007a
            java.lang.String r4 = r8.getString(r1)
            goto L_0x007b
        L_0x004a:
            int r9 = r11.length
            r10 = 2
            if (r9 != r10) goto L_0x007a
            r9 = r11[r7]
            if (r9 != 0) goto L_0x0058
            r10 = r11[r6]
            if (r10 != 0) goto L_0x0058
            goto L_0x00db
        L_0x0058:
            if (r9 == 0) goto L_0x005f
            java.lang.String r4 = r8.getString(r5)
            goto L_0x0060
        L_0x005f:
            r3 = r4
        L_0x0060:
            r9 = r11[r6]
            if (r9 == 0) goto L_0x006a
            java.lang.String r9 = r8.getString(r1)
            r4 = r9
            goto L_0x006b
        L_0x006a:
            r2 = r3
        L_0x006b:
            r9 = r11[r7]
            if (r9 == 0) goto L_0x007b
            r9 = r11[r6]
            if (r9 == 0) goto L_0x007b
            java.lang.String r4 = r8.getString(r5)
            java.lang.String r2 = "both camera and audio permission not granted"
            goto L_0x007b
        L_0x007a:
            r2 = r4
        L_0x007b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "carson PermissionsResult:errMsg"
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "carson PermissionsResult:showErrMsg"
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            java.lang.String r9 = "checkPermissionFailedAnimation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            android.widget.TextView r9 = r8.f312689v
            r9.setText(r4)
            android.widget.Button r9 = r8.f312687t
            r10 = 2131825525(0x7f111375, float:1.9283909E38)
            r9.setText(r10)
            android.widget.Button r9 = r8.f312687t
            nb1.i r10 = new nb1.i
            r10.<init>(r8)
            r9.setOnClickListener(r10)
            android.widget.RelativeLayout r9 = r8.f312674d
            r10 = 8
            r9.setVisibility(r10)
            android.widget.RelativeLayout r9 = r8.f312677g
            r9.setVisibility(r7)
            android.widget.ImageView r9 = r8.f312685r
            r9.clearAnimation()
            android.widget.ImageView r9 = r8.f312681n
            r9.setVisibility(r7)
            android.widget.RelativeLayout r9 = r8.f312675e
            r9.setVisibility(r10)
            r6 = 0
        L_0x00db:
            if (r6 == 0) goto L_0x00f2
            nb1.b r9 = new nb1.b
            r9.<init>(r8)
            r8.f312665A = r9
            mb1.j r9 = mb1.C109603j.f328125A
            nb1.f r10 = new nb1.f
            r10.<init>(r8)
            r9.f328137r = r10
            r9.f328138s = r8
            r9.mo160812c(r8)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public void onResume() {
        super.onResume();
        Log.m105918d("MicroMsg.FaceActionUI", "onResume");
        Log.m105924i("MicroMsg.FaceActionUI", "preview");
        C110011a aVar = this.f312693z;
        if (aVar != null) {
            aVar.f329246q = true;
            Log.m105924i("MicroMsg.FaceActionUI", "mCamera ！= null");
        }
        this.f312682o.setText(C0966R.string.ckb);
    }

    public void onStart() {
        Log.m105918d("MicroMsg.FaceActionUI", "onStart");
        super.onStart();
        C110011a aVar = this.f312693z;
        if (aVar != null) {
            aVar.mo161351g(this.f312680j);
            this.f312693z.mo161352h();
        }
    }

    public void onStop() {
        Log.m105924i("MicroMsg.FaceActionUI", "onStop");
        super.onStop();
        C110011a aVar = this.f312693z;
        if (aVar != null) {
            aVar.f329247r = false;
        }
    }
}
