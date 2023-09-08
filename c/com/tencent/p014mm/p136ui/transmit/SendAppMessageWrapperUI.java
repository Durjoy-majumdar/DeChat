package com.tencent.p014mm.p136ui.transmit;

import ad0.C67025g;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.opensdk.modelmsg.WXGameVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.transmit.C85970n;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.comm.C55593g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72681a;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C85653r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C116756s5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import jr2.C88014u;
import jr2.C99019x;
import ke3.C88144b;
import kg3.C76577a;
import kr2.C76634a;
import kw0.C76638d;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C88989a;
import p158gt.C98201k;
import p206nj.C117627q;
import p763ym.C79138l;
import p823sg.C90193h;
import pc0.C100760a0;
import qo3.C89779i0;
import rn3.C90049b0;
import rn3.C90055h0;
import rn3.C90059l0;
import rn3.C90060m0;
import rn3.C90066z;
import wd3.C65953v0;
import wd3.C78575u;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI */
public class SendAppMessageWrapperUI extends MMActivity {

    /* renamed from: A */
    public static final /* synthetic */ int f250361A = 0;

    /* renamed from: d */
    public String f250362d = null;

    /* renamed from: e */
    public C44561j f250363e = null;

    /* renamed from: f */
    public String f250364f = null;

    /* renamed from: g */
    public WXMediaMessage f250365g = null;

    /* renamed from: h */
    public int f250366h = 0;

    /* renamed from: i */
    public String f250367i;

    /* renamed from: j */
    public C89779i0 f250368j;

    /* renamed from: n */
    public boolean f250369n = false;

    /* renamed from: o */
    public boolean f250370o = false;

    /* renamed from: p */
    public String f250371p = "";

    /* renamed from: q */
    public String f250372q;

    /* renamed from: r */
    public boolean f250373r = false;

    /* renamed from: s */
    public boolean f250374s = false;

    /* renamed from: t */
    public int f250375t = 0;

    /* renamed from: u */
    public int f250376u = 0;

    /* renamed from: v */
    public int f250377v = 0;

    /* renamed from: w */
    public String f250378w = "";

    /* renamed from: x */
    public boolean f250379x = false;

    /* renamed from: y */
    public boolean f250380y = false;

    /* renamed from: z */
    public MTimerHandler f250381z = new MTimerHandler(new C74914d(), true);

    /* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$d */
    public class C74914d implements MTimerHandler.CallBack {
        public C74914d() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x043b, code lost:
            if (wd3.C78575u.m94947p(r1.mController, r4, r12, true, new rn3.C90055h0(r1, r3)) != null) goto L_0x063e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0475, code lost:
            if (wd3.C78575u.m94944m(r4, r3.title, r3.thumbData, r3.description, r1.f250362d, true, r4.mo177096t().getResources().getString(com.tencent.p014mm.C0966R.string.bjd), new rn3.C90055h0(r1, r3)) != null) goto L_0x063e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x04f4, code lost:
            if (wd3.C78575u.m94947p(r1.mController, r4, r12, true, new com.tencent.p014mm.p136ui.transmit.C85967i(r1, r3)) == null) goto L_0x0640;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x05a4, code lost:
            if (wd3.C78575u.m94945n(r4, r3.title, r3.thumbData, r3.description, r1.f250362d, true, r4.mo177096t().getResources().getString(com.tencent.p014mm.C0966R.string.bjd), new rn3.C90055h0(r1, r3), r1.getResources().getString(com.tencent.p014mm.C0966R.string.f360103a43)) != null) goto L_0x063e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
            if (r9.f230207c != null) goto L_0x063e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x035a, code lost:
            if (wd3.C78575u.m94947p(r1.mController, r3.description, r12, true, new rn3.C90055h0(r1, r3)) != null) goto L_0x063e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x0643  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r26 = this;
                r0 = r26
                com.tencent.mm.ui.transmit.SendAppMessageWrapperUI r1 = com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.this
                android.view.Window r1 = r1.getWindow()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x064c
                com.tencent.mm.ui.transmit.SendAppMessageWrapperUI r1 = com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.this
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                if (r1 == 0) goto L_0x064c
                com.tencent.mm.ui.transmit.SendAppMessageWrapperUI r1 = com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.this
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                android.os.IBinder r1 = r1.getWindowToken()
                if (r1 != 0) goto L_0x002a
                goto L_0x064c
            L_0x002a:
                com.tencent.mm.ui.transmit.SendAppMessageWrapperUI r1 = com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.this
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r1.f250365g
                java.lang.String r5 = "MicroMsg.SendAppMessageWrapperUI"
                if (r4 != 0) goto L_0x0039
                java.lang.String r1 = "deal fail, WXMediaMessage is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
                goto L_0x064b
            L_0x0039:
                int r4 = r4.getType()
                r6 = 36
                r7 = 2131821677(0x7f11046d, float:1.9276104E38)
                java.lang.String r8 = "Select_Conv_User"
                r9 = 0
                if (r4 == r6) goto L_0x05a8
                r6 = 38
                r10 = 2131824013(0x7f110d8d, float:1.9280842E38)
                if (r4 == r6) goto L_0x056a
                r6 = 49
                r11 = 2
                java.lang.String r12 = ""
                java.lang.String r13 = "wx4310bbd51be7d979"
                if (r4 == r6) goto L_0x0481
                r6 = 76
                if (r4 == r6) goto L_0x0479
                r6 = 101(0x65, float:1.42E-43)
                if (r4 == r6) goto L_0x0446
                r6 = 45
                if (r4 == r6) goto L_0x03ab
                r6 = 46
                if (r4 == r6) goto L_0x0365
                switch(r4) {
                    case 1: goto L_0x032e;
                    case 2: goto L_0x02e1;
                    case 3: goto L_0x028b;
                    case 4: goto L_0x024d;
                    case 5: goto L_0x0446;
                    case 6: goto L_0x0212;
                    case 7: goto L_0x00f2;
                    case 8: goto L_0x0082;
                    default: goto L_0x006b;
                }
            L_0x006b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "unknown type = "
                r3.append(r6)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                goto L_0x0640
            L_0x0082:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r1.f250365g
                java.lang.Class<z51.g> r6 = z51.C39315g.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                z51.g r6 = (z51.C39315g) r6
                zc3.a r6 = r6.mo58035cm()
                com.tencent.mm.pluginsdk.model.app.j r10 = r1.f250363e
                java.lang.String r10 = r10.field_appId
                i61.h r6 = (i61.C98602h) r6
                java.lang.String r6 = r6.mo137996D(r1, r4, r10)
                com.tencent.mm.ui.MMActivityController r10 = r1.mController
                androidx.appcompat.app.AppCompatActivity r10 = r10.mo177096t()
                android.content.Intent r10 = r10.getIntent()
                android.os.Bundle r10 = r10.getExtras()
                java.lang.String r8 = r10.getString(r8, r9)
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r9 != 0) goto L_0x00dc
                wd3.u$h r9 = new wd3.u$h
                com.tencent.mm.ui.MMActivityController r10 = r1.mController
                androidx.appcompat.app.AppCompatActivity r10 = r10.mo177096t()
                r9.<init>(r10)
                r9.mo108578p(r8)
                r9.mo108567e(r6)
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                r9.mo108569g(r6)
                r9.mo108573k(r7)
                rn3.h0 r6 = new rn3.h0
                r6.<init>(r1, r4)
                r9.mo108563a(r6)
                r9.mo108574l()
                qo3.g r4 = r9.f230207c
                if (r4 == 0) goto L_0x0640
                goto L_0x063e
            L_0x00dc:
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                r7 = 2131755119(0x7f10006f, float:1.9141108E38)
                java.lang.String r8 = r4.title
                java.lang.String r9 = r4.description
                java.lang.String r10 = r1.f250362d
                r11 = 1
                rn3.h0 r12 = new rn3.h0
                r12.<init>(r1, r4)
                wd3.C78575u.m94952u(r6, r7, r8, r9, r10, r11, r12)
                goto L_0x063e
            L_0x00f2:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r1.f250365g
                byte[] r12 = r4.thumbData
                if (r12 == 0) goto L_0x0113
                int r6 = r12.length
                if (r6 <= 0) goto L_0x0113
                com.tencent.mm.ui.MMActivityController r11 = r1.mController
                java.lang.String r13 = r4.title
                java.lang.String r14 = r4.description
                java.lang.String r15 = r1.f250362d
                r16 = 1
                r17 = 0
                rn3.h0 r6 = new rn3.h0
                r6.<init>(r1, r4)
                r18 = r6
                wd3.C78575u.m94954w(r11, r12, r13, r14, r15, r16, r17, r18)
                goto L_0x063e
            L_0x0113:
                java.lang.Class<ym.l> r6 = p763ym.C79138l.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                ym.l r6 = (p763ym.C79138l) r6
                com.tencent.mm.pluginsdk.model.app.j r7 = r1.f250363e
                java.lang.String r7 = r7.field_appId
                float r8 = kg3.C76577a.m92156g(r1)
                android.graphics.Bitmap r6 = r6.mo74018ub(r7, r3, r8)
                if (r6 == 0) goto L_0x01fc
                boolean r7 = r6.isRecycled()
                if (r7 != 0) goto L_0x01fc
                com.tencent.mm.ui.MMActivityController r7 = r1.mController
                java.lang.String r8 = r4.title
                java.lang.String r9 = r4.description
                java.lang.String r11 = r1.f250362d
                rn3.h0 r12 = new rn3.h0
                r12.<init>(r1, r4)
                java.lang.Class<ny.h> r4 = p629ny.C76979h.class
                androidx.appcompat.app.AppCompatActivity r13 = r7.mo177096t()
                r14 = 2131493879(0x7f0c03f7, float:1.861125E38)
                android.view.View r13 = wd3.C78575u.m94934c(r13, r14)
                qo3.g$i r14 = new qo3.g$i
                androidx.appcompat.app.AppCompatActivity r15 = r7.mo177096t()
                r14.<init>(r15)
                qo3.a r15 = r14.f225714b
                r15.f225668y = r2
                r15.f225669z = r2
                wd3.C78575u.m94938g(r13, r3)
                androidx.appcompat.app.AppCompatActivity r15 = r7.mo177096t()
                android.content.res.Resources r15 = r15.getResources()
                java.lang.String r10 = r15.getString(r10)
                wd3.C78575u.m94937f(r7, r14, r12, r13, r10)
                r10 = 2131300119(0x7f090f17, float:1.8218259E38)
                android.view.View r10 = r13.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                di3.d r12 = di3.C86312j.m106911c(r4)
                ny.h r12 = (p629ny.C76979h) r12
                androidx.appcompat.app.AppCompatActivity r15 = r7.mo177096t()
                float r3 = r10.getTextSize()
                android.text.SpannableString r3 = r12.yp0(r15, r8, r3)
                r10.setText(r3)
                r3 = 2131300115(0x7f090f13, float:1.821825E38)
                android.view.View r3 = r13.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                di3.d r4 = di3.C86312j.m106911c(r4)
                ny.h r4 = (p629ny.C76979h) r4
                androidx.appcompat.app.AppCompatActivity r7 = r7.mo177096t()
                float r8 = r3.getTextSize()
                android.text.SpannableString r4 = r4.yp0(r7, r9, r8)
                r3.setText(r4)
                r3 = 2131300110(0x7f090f0e, float:1.821824E38)
                android.view.View r3 = r13.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r4 = 8
                if (r11 == 0) goto L_0x01c1
                int r7 = r11.length()
                if (r7 != 0) goto L_0x01ba
                goto L_0x01c1
            L_0x01ba:
                r3.setText(r11)
                r3.setVisibility(r2)
                goto L_0x01c4
            L_0x01c1:
                r3.setVisibility(r4)
            L_0x01c4:
                r3 = 2131300117(0x7f090f15, float:1.8218255E38)
                android.view.View r3 = r13.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                if (r3 == 0) goto L_0x01ef
                boolean r7 = r6.isRecycled()
                if (r7 == 0) goto L_0x01e0
                java.lang.String r6 = "MicroMsg.MMConfirmDialog"
                java.lang.String r7 = "showDialogItem4, thumbBmp is null or recycled"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r7)
                r3.setVisibility(r4)
                goto L_0x01ef
            L_0x01e0:
                r3.setVisibility(r2)
                r3.setImageBitmap(r6)
                wd3.x r3 = new wd3.x
                r3.<init>(r6)
                qo3.a r4 = r14.f225714b
                r4.f225623F = r3
            L_0x01ef:
                qo3.a r3 = r14.f225714b
                r3.f225627J = r13
                qo3.g r3 = r14.mo107548a()
                r3.show()
                goto L_0x063e
            L_0x01fc:
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                r7 = 2131755119(0x7f10006f, float:1.9141108E38)
                java.lang.String r8 = r4.title
                java.lang.String r9 = r4.description
                java.lang.String r10 = r1.f250362d
                r11 = 1
                rn3.h0 r12 = new rn3.h0
                r12.<init>(r1, r4)
                wd3.C78575u.m94952u(r6, r7, r8, r9, r10, r11, r12)
                goto L_0x063e
            L_0x0212:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                byte[] r7 = r3.thumbData
                if (r7 == 0) goto L_0x022e
                int r4 = r7.length
                if (r4 <= 0) goto L_0x022e
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                java.lang.String r8 = r3.title
                java.lang.String r9 = r3.description
                r10 = 0
                r11 = 1
                r12 = 0
                rn3.h0 r13 = new rn3.h0
                r13.<init>(r1, r3)
                wd3.C78575u.m94954w(r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x063e
            L_0x022e:
                com.tencent.mm.ui.MMActivityController r4 = r1.mController
                r18 = 2131755084(0x7f10004c, float:1.9141037E38)
                java.lang.String r6 = r3.title
                java.lang.String r7 = r3.description
                r21 = 0
                r22 = 1
                rn3.h0 r8 = new rn3.h0
                r8.<init>(r1, r3)
                r17 = r4
                r19 = r6
                r20 = r7
                r23 = r8
                wd3.C78575u.m94952u(r17, r18, r19, r20, r21, r22, r23)
                goto L_0x063e
            L_0x024d:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                byte[] r7 = r3.thumbData
                if (r7 == 0) goto L_0x026a
                int r4 = r7.length
                if (r4 <= 0) goto L_0x026a
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                java.lang.String r8 = r3.title
                java.lang.String r9 = r3.description
                java.lang.String r10 = r1.f250362d
                r11 = 1
                r12 = 1
                rn3.h0 r13 = new rn3.h0
                r13.<init>(r1, r3)
                wd3.C78575u.m94954w(r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x063e
            L_0x026a:
                com.tencent.mm.ui.MMActivityController r4 = r1.mController
                r18 = 2131755116(0x7f10006c, float:1.9141102E38)
                java.lang.String r6 = r3.title
                java.lang.String r7 = r3.description
                java.lang.String r8 = r1.f250362d
                r22 = 1
                rn3.h0 r9 = new rn3.h0
                r9.<init>(r1, r3)
                r17 = r4
                r19 = r6
                r20 = r7
                r21 = r8
                r23 = r9
                wd3.C78575u.m94952u(r17, r18, r19, r20, r21, r22, r23)
                goto L_0x063e
            L_0x028b:
                java.lang.Class<fv.r> r3 = p529fv.C59331r.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                fv.r r3 = (p529fv.C59331r) r3
                java.lang.String r4 = r1.f250367i
                boolean r3 = r3.mo84029q1(r4)
                if (r3 == 0) goto L_0x02a3
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                boolean r3 = r1.mo119867K7(r3)
                goto L_0x0641
            L_0x02a3:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                byte[] r7 = r3.thumbData
                if (r7 == 0) goto L_0x02c0
                int r4 = r7.length
                if (r4 <= 0) goto L_0x02c0
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                java.lang.String r8 = r3.title
                java.lang.String r9 = r3.description
                java.lang.String r10 = r1.f250362d
                r11 = 1
                r12 = 2
                rn3.h0 r13 = new rn3.h0
                r13.<init>(r1, r3)
                wd3.C78575u.m94954w(r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x063e
            L_0x02c0:
                com.tencent.mm.ui.MMActivityController r4 = r1.mController
                r18 = 2131755090(0x7f100052, float:1.914105E38)
                java.lang.String r6 = r3.title
                java.lang.String r7 = r3.description
                java.lang.String r8 = r1.f250362d
                r22 = 1
                rn3.h0 r9 = new rn3.h0
                r9.<init>(r1, r3)
                r17 = r4
                r19 = r6
                r20 = r7
                r21 = r8
                r23 = r9
                wd3.C78575u.m94952u(r17, r18, r19, r20, r21, r22, r23)
                goto L_0x063e
            L_0x02e1:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                byte[] r4 = r3.thumbData
                if (r4 == 0) goto L_0x02f9
                int r6 = r4.length
                if (r6 <= 0) goto L_0x02f9
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                java.lang.String r7 = r1.f250362d
                rn3.h0 r8 = new rn3.h0
                r8.<init>(r1, r3)
                r3 = 1
                qo3.g r4 = wd3.C78575u.m94950s(r6, r4, r7, r3, r8)
                goto L_0x0325
            L_0x02f9:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r4 = r3.mediaObject
                com.tencent.mm.opensdk.modelmsg.WXImageObject r4 = (com.tencent.p014mm.opensdk.modelmsg.WXImageObject) r4
                byte[] r6 = r4.imageData
                if (r6 == 0) goto L_0x0313
                int r7 = r6.length
                if (r7 <= 0) goto L_0x0313
                com.tencent.mm.ui.MMActivityController r4 = r1.mController
                java.lang.String r7 = r1.f250362d
                rn3.h0 r8 = new rn3.h0
                r8.<init>(r1, r3)
                r3 = 1
                qo3.g r4 = wd3.C78575u.m94950s(r4, r6, r7, r3, r8)
                goto L_0x0325
            L_0x0313:
                r9 = 1
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                java.lang.String r7 = r4.imagePath
                java.lang.String r8 = r1.f250362d
                rn3.h0 r11 = new rn3.h0
                r11.<init>(r1, r3)
                java.lang.String r10 = ""
                qo3.g r4 = wd3.C78575u.m94948q(r6, r7, r8, r9, r10, r11)
            L_0x0325:
                if (r4 != 0) goto L_0x063e
                java.lang.String r3 = "showDialogItem3 fail, invalid argument"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                goto L_0x0640
            L_0x032e:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r4 = r3.mediaObject
                com.tencent.mm.opensdk.modelmsg.WXTextObject r4 = (com.tencent.p014mm.opensdk.modelmsg.WXTextObject) r4
                java.lang.String r4 = r4.text
                if (r4 == 0) goto L_0x035e
                int r4 = r4.length()
                if (r4 != 0) goto L_0x033f
                goto L_0x035e
            L_0x033f:
                com.tencent.mm.pluginsdk.model.app.j r4 = r1.f250363e
                java.lang.String r4 = r4.field_appId
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x034a
                goto L_0x034c
            L_0x034a:
                java.lang.String r12 = r1.f250362d
            L_0x034c:
                com.tencent.mm.ui.MMActivityController r4 = r1.mController
                java.lang.String r6 = r3.description
                rn3.h0 r7 = new rn3.h0
                r7.<init>(r1, r3)
                r3 = 1
                qo3.g r4 = wd3.C78575u.m94947p(r4, r6, r12, r3, r7)
                if (r4 == 0) goto L_0x0640
                goto L_0x063e
            L_0x035e:
                java.lang.String r3 = "dealText fail, text is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                goto L_0x0640
            L_0x0365:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                wd3.u$h r4 = new wd3.u$h
                androidx.appcompat.app.AppCompatActivity r6 = r1.getContext()
                r4.<init>(r6)
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                androidx.appcompat.app.AppCompatActivity r6 = r6.mo177096t()
                android.content.Intent r6 = r6.getIntent()
                android.os.Bundle r6 = r6.getExtras()
                java.lang.String r6 = r6.getString(r8, r9)
                r4.mo108578p(r6)
                byte[] r6 = r3.thumbData
                if (r6 == 0) goto L_0x0396
                int r8 = r6.length
                if (r8 <= 0) goto L_0x0396
                int r8 = r6.length
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r6, r2, r8)
                if (r6 == 0) goto L_0x0396
                r4.mo108566d(r6, r11)
            L_0x0396:
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                r4.mo108569g(r6)
                r4.mo108573k(r7)
                rn3.h0 r6 = new rn3.h0
                r6.<init>(r1, r3)
                r4.mo108563a(r6)
                r4.mo108574l()
                goto L_0x063e
            L_0x03ab:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r4 = r3.mediaObject
                com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject r4 = (com.tencent.p014mm.opensdk.modelmsg.WXEnterpriseCardObject) r4
                java.lang.String r6 = r4.cardInfo
                if (r6 == 0) goto L_0x043f
                int r6 = r6.length()
                if (r6 != 0) goto L_0x03bd
                goto L_0x043f
            L_0x03bd:
                java.lang.String r6 = r4.cardInfo
                java.lang.String r7 = "msg"
                java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r7, r9)
                if (r6 != 0) goto L_0x03c9
                goto L_0x0640
            L_0x03c9:
                java.lang.String r7 = ".msg.$nickname"
                java.lang.Object r6 = r6.get(r7)
                java.lang.String r6 = (java.lang.String) r6
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r7 == 0) goto L_0x03de
                java.lang.String r3 = "dealBusinessCard error, nickname not in xml"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                goto L_0x0640
            L_0x03de:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                int r4 = r4.msgType
                r8 = 66
                if (r4 != r8) goto L_0x03fb
                java.lang.Class<he0.j> r4 = he0.C76158j.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                he0.j r4 = (he0.C76158j) r4
                he0.j$a r8 = he0.C76158j.C8510a.TYPE_WORDING
                java.lang.String r9 = "3552365301"
                java.lang.String r10 = "openim_card_type_name"
                java.lang.String r9 = r4.Rn0(r9, r10, r8)
            L_0x03fb:
                boolean r4 = android.text.TextUtils.isEmpty(r9)
                if (r4 == 0) goto L_0x040d
                android.content.res.Resources r4 = r1.getResources()
                r8 = 2131821547(0x7f1103eb, float:1.927584E38)
                java.lang.String r4 = r4.getString(r8)
                goto L_0x0418
            L_0x040d:
                r4 = 1
                java.lang.Object[] r8 = new java.lang.Object[r4]
                r8[r2] = r9
                java.lang.String r4 = "[%s]"
                java.lang.String r4 = java.lang.String.format(r4, r8)
            L_0x0418:
                r7.append(r4)
                r7.append(r6)
                java.lang.String r4 = r7.toString()
                com.tencent.mm.pluginsdk.model.app.j r6 = r1.f250363e
                java.lang.String r6 = r6.field_appId
                boolean r6 = r6.equals(r13)
                if (r6 == 0) goto L_0x042d
                goto L_0x042f
            L_0x042d:
                java.lang.String r12 = r1.f250362d
            L_0x042f:
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                rn3.h0 r7 = new rn3.h0
                r7.<init>(r1, r3)
                r3 = 1
                qo3.g r4 = wd3.C78575u.m94947p(r6, r4, r12, r3, r7)
                if (r4 == 0) goto L_0x0640
                goto L_0x063e
            L_0x043f:
                java.lang.String r3 = "dealCard fail, card info is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                goto L_0x0640
            L_0x0446:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                com.tencent.mm.ui.MMActivityController r4 = r1.mController
                java.lang.String r6 = r3.title
                byte[] r7 = r3.thumbData
                java.lang.String r8 = r3.description
                java.lang.String r9 = r1.f250362d
                androidx.appcompat.app.AppCompatActivity r11 = r4.mo177096t()
                android.content.res.Resources r11 = r11.getResources()
                java.lang.String r23 = r11.getString(r10)
                rn3.h0 r10 = new rn3.h0
                r10.<init>(r1, r3)
                r22 = 1
                r17 = r4
                r18 = r6
                r19 = r7
                r20 = r8
                r21 = r9
                r24 = r10
                qo3.g r3 = wd3.C78575u.m94944m(r17, r18, r19, r20, r21, r22, r23, r24)
                if (r3 == 0) goto L_0x0640
                goto L_0x063e
            L_0x0479:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                boolean r3 = r1.mo119867K7(r3)
                goto L_0x0641
            L_0x0481:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                if (r3 == 0) goto L_0x0640
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r4 = r3.mediaObject
                boolean r6 = r4 instanceof com.tencent.p014mm.opensdk.modelmsg.WXWeWorkObject
                if (r6 == 0) goto L_0x0640
                com.tencent.mm.opensdk.modelmsg.WXWeWorkObject r4 = (com.tencent.p014mm.opensdk.modelmsg.WXWeWorkObject) r4
                int r4 = r4.subType
                java.lang.String r6 = "kWXEntryActivity_data_center_session_id"
                if (r4 != r11) goto L_0x04f8
                eb0.v0 r3 = eb0.C86493v0.m107224d()
                r4 = 1
                eb0.v0$c r3 = r3.mo120947c(r6, r4)
                if (r3 != 0) goto L_0x04a5
                java.lang.String r3 = "dealWXWeWorkObjectMulti fail values is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                goto L_0x0640
            L_0x04a5:
                java.lang.String r6 = "kWXEntryActivity_data_center_wework_msg_list"
                java.lang.Object r3 = r3.mo120955b(r6)
                java.util.List r3 = (java.util.List) r3
                androidx.appcompat.app.AppCompatActivity r6 = r1.getContext()
                r7 = 2131834847(0x7f1137df, float:1.9302816E38)
                java.lang.Object[] r8 = new java.lang.Object[r4]
                int r4 = r3.size()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r8[r2] = r4
                java.lang.String r4 = r6.getString(r7, r8)
                android.content.res.Resources r6 = r1.getResources()
                r7 = 2131821599(0x7f11041f, float:1.9275946E38)
                java.lang.String r6 = r6.getString(r7)
                java.lang.StringBuffer r7 = new java.lang.StringBuffer
                r7.<init>(r6)
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                com.tencent.mm.pluginsdk.model.app.j r6 = r1.f250363e
                java.lang.String r6 = r6.field_appId
                boolean r6 = r6.equals(r13)
                if (r6 == 0) goto L_0x04e6
                goto L_0x04e8
            L_0x04e6:
                java.lang.String r12 = r1.f250362d
            L_0x04e8:
                com.tencent.mm.ui.MMActivityController r6 = r1.mController
                com.tencent.mm.ui.transmit.i r7 = new com.tencent.mm.ui.transmit.i
                r7.<init>(r1, r3)
                r8 = 1
                qo3.g r3 = wd3.C78575u.m94947p(r6, r4, r12, r8, r7)
                if (r3 != 0) goto L_0x063e
                goto L_0x0640
            L_0x04f8:
                r8 = 1
                eb0.v0 r4 = eb0.C86493v0.m107224d()
                eb0.v0$c r4 = r4.mo120947c(r6, r8)
                if (r4 != 0) goto L_0x050a
                java.lang.String r3 = "dealWXWeWorkObject fail values is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                goto L_0x0640
            L_0x050a:
                java.lang.String r6 = "kWXEntryActivity_data_center_wework_msgcontent"
                java.lang.Object r4 = r4.mo120956c(r6, r12)
                java.lang.String r4 = (java.lang.String) r4
                com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r9)
                if (r4 == 0) goto L_0x0563
                java.lang.String r6 = r4.f195571f0
                te3.dp3 r6 = qg2.C101147j0.m132643x(r6)
                if (r6 == 0) goto L_0x052b
                java.lang.String r7 = r6.f227153d
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x052b
                java.lang.String r6 = r6.f227153d
                goto L_0x052c
            L_0x052b:
                r6 = r12
            L_0x052c:
                android.content.res.Resources r7 = r1.getResources()
                r8 = 2131833871(0x7f11340f, float:1.9300836E38)
                r9 = 1
                java.lang.Object[] r10 = new java.lang.Object[r9]
                r10[r2] = r6
                java.lang.String r6 = r7.getString(r8, r10)
                com.tencent.mm.pluginsdk.model.app.j r7 = r1.f250363e
                java.lang.String r7 = r7.field_appId
                boolean r7 = r7.equals(r13)
                if (r7 == 0) goto L_0x0547
                goto L_0x0549
            L_0x0547:
                java.lang.String r12 = r1.f250362d
            L_0x0549:
                com.tencent.mm.ui.MMActivityController r7 = r1.mController
                rn3.h0 r8 = new rn3.h0
                r8.<init>(r1, r3)
                r3 = 1
                qo3.g r6 = wd3.C78575u.m94947p(r7, r6, r12, r3, r8)
                if (r6 != 0) goto L_0x0559
                goto L_0x0640
            L_0x0559:
                rn3.s0 r3 = new rn3.s0
                r3.<init>(r1, r4)
                r6.mo107531n(r3)
                goto L_0x063e
            L_0x0563:
                java.lang.String r3 = "dealWXWeWorkObject fail msg content is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                goto L_0x0640
            L_0x056a:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                com.tencent.mm.ui.MMActivityController r4 = r1.mController
                java.lang.String r6 = r3.title
                byte[] r7 = r3.thumbData
                java.lang.String r8 = r3.description
                java.lang.String r9 = r1.f250362d
                androidx.appcompat.app.AppCompatActivity r11 = r4.mo177096t()
                android.content.res.Resources r11 = r11.getResources()
                java.lang.String r23 = r11.getString(r10)
                rn3.h0 r10 = new rn3.h0
                r10.<init>(r1, r3)
                android.content.res.Resources r3 = r1.getResources()
                r11 = 2131821728(0x7f1104a0, float:1.9276207E38)
                java.lang.String r25 = r3.getString(r11)
                r22 = 1
                r17 = r4
                r18 = r6
                r19 = r7
                r20 = r8
                r21 = r9
                r24 = r10
                qo3.g r3 = wd3.C78575u.m94945n(r17, r18, r19, r20, r21, r22, r23, r24, r25)
                if (r3 == 0) goto L_0x0640
                goto L_0x063e
            L_0x05a8:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r1.f250365g
                java.lang.Class<kb0.i> r4 = kb0.C76529i.class
                if (r3 == 0) goto L_0x0640
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r6 = r3.mediaObject
                boolean r10 = r6 instanceof com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject
                if (r10 != 0) goto L_0x05b6
                goto L_0x0640
            L_0x05b6:
                com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject r6 = (com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject) r6
                java.lang.Class<kr0.w0> r10 = kr0.C76629w0.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                kr0.w0 r10 = (kr0.C76629w0) r10
                java.lang.String r11 = r6.userName
                r10.mo106879N2(r11)
                wd3.u$h r10 = new wd3.u$h
                androidx.appcompat.app.AppCompatActivity r11 = r1.getContext()
                r10.<init>(r11)
                com.tencent.mm.ui.MMActivityController r11 = r1.mController
                androidx.appcompat.app.AppCompatActivity r11 = r11.mo177096t()
                android.content.Intent r11 = r11.getIntent()
                android.os.Bundle r11 = r11.getExtras()
                java.lang.String r8 = r11.getString(r8, r9)
                r10.mo108578p(r8)
                di3.d r11 = di3.C86312j.m106911c(r4)
                kb0.i r11 = (kb0.C76529i) r11
                boolean r8 = eb0.C45628s0.m50755T(r8)
                com.tencent.mm.ui.transmit.k r12 = new com.tencent.mm.ui.transmit.k
                r12.<init>(r1)
                android.view.View r8 = r11.mo106760I7(r1, r9, r8, r12)
                java.lang.String r9 = js0.C9515s.m9209a(r1)
                android.os.Bundle r11 = new android.os.Bundle
                r11.<init>()
                byte[] r12 = r3.thumbData
                java.lang.String r13 = "image_data"
                r11.putByteArray(r13, r12)
                java.lang.String r12 = r3.title
                java.lang.String r13 = "title"
                r11.putString(r13, r12)
                java.lang.String r6 = r6.path
                java.lang.String r12 = "msg_path"
                r11.putString(r12, r6)
                di3.d r4 = di3.C86312j.m106911c(r4)
                kb0.i r4 = (kb0.C76529i) r4
                r4.mo106762jI(r9, r8, r11)
                r10.mo108565c(r8)
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                r10.mo108569g(r4)
                r10.mo108570h(r2)
                rn3.g0 r4 = new rn3.g0
                r4.<init>(r1, r9, r8)
                r10.f230209e = r4
                r10.mo108573k(r7)
                rn3.h0 r4 = new rn3.h0
                r4.<init>(r1, r3)
                r10.mo108563a(r4)
                r10.mo108574l()
            L_0x063e:
                r3 = 1
                goto L_0x0641
            L_0x0640:
                r3 = 0
            L_0x0641:
                if (r3 != 0) goto L_0x064b
                java.lang.String r3 = "deal fail, result is false"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                r1.finish()
            L_0x064b:
                return r2
            L_0x064c:
                com.tencent.mm.ui.transmit.SendAppMessageWrapperUI r1 = com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.this
                int r3 = r1.f250376u
                r4 = 10
                if (r3 >= r4) goto L_0x0659
                r4 = 1
                int r3 = r3 + r4
                r1.f250376u = r3
                r2 = 1
            L_0x0659:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.C74914d.onTimerExpired():boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$a */
    public class C85960a implements C85970n.C85971a {

        /* renamed from: a */
        public final /* synthetic */ WXMediaMessage f250382a;

        /* renamed from: b */
        public final /* synthetic */ String f250383b;

        /* renamed from: c */
        public final /* synthetic */ int f250384c;

        /* renamed from: d */
        public final /* synthetic */ LinkedList f250385d;

        public C85960a(WXMediaMessage wXMediaMessage, String str, int i, LinkedList linkedList) {
            this.f250382a = wXMediaMessage;
            this.f250383b = str;
            this.f250384c = i;
            this.f250385d = linkedList;
        }

        /* renamed from: a */
        public void mo119878a(int i, Object obj) {
            Iterator it;
            WXMiniProgramObject wXMiniProgramObject;
            String str;
            WxaAttributes wxaAttributes;
            WXMediaMessage wXMediaMessage;
            String str2;
            String str3;
            String b;
            String b2;
            String str4;
            int i2;
            C115669n nVar;
            Object[] objArr;
            C89779i0 i0Var;
            int i3 = i;
            Object obj2 = obj;
            SendAppMessageWrapperUI sendAppMessageWrapperUI = SendAppMessageWrapperUI.this;
            WXMediaMessage wXMediaMessage2 = this.f250382a;
            String str5 = this.f250383b;
            int i4 = this.f250384c;
            LinkedList linkedList = this.f250385d;
            int i5 = SendAppMessageWrapperUI.f250361A;
            sendAppMessageWrapperUI.getClass();
            if (wXMediaMessage2 == null) {
                Log.m105920e("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack error, WXMediaMessage == null");
                sendAppMessageWrapperUI.finish();
            } else if (linkedList == null || linkedList.isEmpty()) {
                Log.m105921e("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack error, toUserList is isEmpty, status:%d, text:%s", Integer.valueOf(i), str5);
                sendAppMessageWrapperUI.finish();
            } else {
                Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack  status:%d, type:%d", Integer.valueOf(i), Integer.valueOf(wXMediaMessage2.getType()));
                int type = wXMediaMessage2.getType();
                if (type == 2) {
                    WXMediaMessage wXMediaMessage3 = wXMediaMessage2;
                    if (i3 == 1) {
                        C85653r1.m105759c(sendAppMessageWrapperUI.f250375t, sendAppMessageWrapperUI.f250363e, wXMediaMessage3, linkedList);
                    } else if (i3 == 2) {
                        sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                    } else if (i3 == 3) {
                        sendAppMessageWrapperUI.setResult(0);
                        sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                    }
                } else if (type != 5) {
                    if (type != 8) {
                        if (type != 36) {
                            if (type != 38) {
                                if (type != 76) {
                                    if (type != 45) {
                                        if (!(type == 46 || type == 48)) {
                                            if (type != 49) {
                                                if (i3 == 2) {
                                                    sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                                                    return;
                                                } else if (i3 == 3) {
                                                    if (!Util.isEqual(obj2, (Object) "cb_msg_is_null") && !Util.isEqual(obj2, (Object) "cb_key_user_list_is_empty")) {
                                                        sendAppMessageWrapperUI.finish();
                                                    }
                                                    sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            } else if (i3 == 1) {
                                                C85653r1.m105759c(sendAppMessageWrapperUI.f250375t, sendAppMessageWrapperUI.f250363e, wXMediaMessage2, linkedList);
                                                return;
                                            } else if (i3 == 2 || i3 == 3) {
                                                sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                    } else if (i3 == 1) {
                                        C85653r1.m105759c(sendAppMessageWrapperUI.f250375t, sendAppMessageWrapperUI.f250363e, wXMediaMessage2, linkedList);
                                        return;
                                    } else if (i3 == 2) {
                                        sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                                        return;
                                    } else if (i3 == 3) {
                                        sendAppMessageWrapperUI.setResult(0);
                                        sendAppMessageWrapperUI.finish();
                                        sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                                        return;
                                    } else {
                                        return;
                                    }
                                } else if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            if (i3 == 5) {
                                                ReportUtil.m84997c(sendAppMessageWrapperUI, ReportUtil.m84995a(sendAppMessageWrapperUI.getIntent().getExtras(), -1), true, false);
                                                sendAppMessageWrapperUI.finish();
                                                return;
                                            } else if (i3 != 6) {
                                                return;
                                            }
                                        } else if (!Util.isEqual(obj2, (Object) "cb_msg_is_null") && !Util.isEqual(obj2, (Object) "cb_key_user_list_is_empty")) {
                                            sendAppMessageWrapperUI.finish();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    sendAppMessageWrapperUI.runOnUiThread(new C90060m0(sendAppMessageWrapperUI, str5, linkedList, i4));
                                    return;
                                } else {
                                    sendAppMessageWrapperUI.f250368j = C89779i0.m112248e(sendAppMessageWrapperUI, sendAppMessageWrapperUI.getString(C0966R.string.gas), true, 0, (DialogInterface.OnCancelListener) null);
                                    return;
                                }
                            } else if (i3 == 1) {
                                C85653r1.m105759c(sendAppMessageWrapperUI.f250375t, sendAppMessageWrapperUI.f250363e, wXMediaMessage2, linkedList);
                                return;
                            } else if (i3 == 2) {
                                if (obj2 instanceof C96790t0) {
                                    sendAppMessageWrapperUI.f250368j = C76879j.m92723Q(sendAppMessageWrapperUI, sendAppMessageWrapperUI.getString(C0966R.string.a3h), sendAppMessageWrapperUI.getString(C0966R.string.a4d), true, true, new C90059l0(sendAppMessageWrapperUI, obj2));
                                }
                                sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                                return;
                            } else if (i3 == 3) {
                                sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                                return;
                            } else if (i3 == 6 && (i0Var = sendAppMessageWrapperUI.f250368j) != null) {
                                i0Var.dismiss();
                                sendAppMessageWrapperUI.f250368j = null;
                                return;
                            } else {
                                return;
                            }
                        }
                        if (i3 == 2 || i3 == 3) {
                            sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                            return;
                        }
                        String str6 = "";
                        int i6 = 15;
                        if (i3 != 4) {
                            if (i3 == 5) {
                                sendAppMessageWrapperUI.setResult(-1);
                                sendAppMessageWrapperUI.finish();
                                ReportUtil.m84997c(sendAppMessageWrapperUI, ReportUtil.m84995a(sendAppMessageWrapperUI.getIntent().getExtras(), -1), true, false);
                            } else if (i3 == 6 && obj2 != null && (obj2 instanceof String) && (wXMediaMessage2.mediaObject instanceof WXMiniProgramObject)) {
                                Iterator it4 = linkedList.iterator();
                                while (it4.hasNext()) {
                                    String str7 = (String) it4.next();
                                    boolean endsWith = str7.endsWith("chatroom");
                                    WXMiniProgramObject wXMiniProgramObject2 = (WXMiniProgramObject) wXMediaMessage2.mediaObject;
                                    String a = C117627q.m165908a(Util.nullAsNil(wXMiniProgramObject2.webpageUrl));
                                    String a2 = C117627q.m165908a(Util.nullAsNil(wXMediaMessage2.title));
                                    String a3 = C117627q.m165908a(Util.nullAsNil(wXMediaMessage2.description));
                                    String a4 = C117627q.m165908a(Util.nullAsNil(wXMiniProgramObject2.path));
                                    C115669n nVar2 = C115669n.INSTANCE;
                                    Object[] objArr2 = new Object[i6];
                                    objArr2[0] = sendAppMessageWrapperUI.f250363e.field_appId;
                                    objArr2[1] = wXMiniProgramObject2.userName;
                                    objArr2[2] = a4;
                                    objArr2[3] = a2;
                                    objArr2[4] = a3;
                                    objArr2[5] = str6;
                                    objArr2[6] = a;
                                    objArr2[7] = 0;
                                    objArr2[8] = 1;
                                    objArr2[9] = 0;
                                    objArr2[10] = Integer.valueOf(endsWith ? 1 : 0);
                                    objArr2[11] = str7;
                                    objArr2[12] = 1;
                                    objArr2[13] = obj2;
                                    objArr2[14] = str6;
                                    nVar2.mo160131h(14127, objArr2);
                                    i6 = 15;
                                }
                            }
                        } else if (obj2 instanceof WxaAttributes) {
                            int i7 = sendAppMessageWrapperUI.f250375t;
                            C44561j jVar = sendAppMessageWrapperUI.f250363e;
                            WxaAttributes wxaAttributes2 = (WxaAttributes) obj2;
                            WXMiniProgramObject wXMiniProgramObject3 = (WXMiniProgramObject) wXMediaMessage2.mediaObject;
                            String str8 = "UTF-8";
                            String str9 = ",";
                            Iterator it5 = linkedList.iterator();
                            while (it5.hasNext()) {
                                String str10 = (String) it5.next();
                                String str11 = jVar.field_appId;
                                String str12 = jVar.field_appName;
                                boolean k = jVar.mo69359k();
                                int type2 = wXMediaMessage2.getType();
                                boolean U5 = C72996z1.m85820U5(str10);
                                C44561j jVar2 = jVar;
                                try {
                                    String b3 = C117627q.m165909b(Util.nullAsNil(wXMiniProgramObject3.webpageUrl), str8);
                                    it = it5;
                                    try {
                                        b = C117627q.m165909b(Util.nullAsNil(wXMediaMessage2.title), str8);
                                        str2 = str6;
                                        try {
                                            b2 = C117627q.m165909b(Util.nullAsNil(wXMediaMessage2.description), str8);
                                            wXMediaMessage = wXMediaMessage2;
                                            try {
                                                str4 = wxaAttributes2.field_appId;
                                                wxaAttributes = wxaAttributes2;
                                            } catch (UnsupportedEncodingException unused) {
                                                wxaAttributes = wxaAttributes2;
                                                wXMiniProgramObject = wXMiniProgramObject3;
                                                str = str8;
                                                str3 = str9;
                                                Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                jVar = jVar2;
                                                it5 = it;
                                                str9 = str3;
                                                str6 = str2;
                                                wXMediaMessage2 = wXMediaMessage;
                                                wxaAttributes2 = wxaAttributes;
                                                str8 = str;
                                                wXMiniProgramObject3 = wXMiniProgramObject;
                                            }
                                        } catch (UnsupportedEncodingException unused2) {
                                            wxaAttributes = wxaAttributes2;
                                            wXMediaMessage = wXMediaMessage2;
                                            wXMiniProgramObject = wXMiniProgramObject3;
                                            str = str8;
                                            str3 = str9;
                                            Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                            jVar = jVar2;
                                            it5 = it;
                                            str9 = str3;
                                            str6 = str2;
                                            wXMediaMessage2 = wXMediaMessage;
                                            wxaAttributes2 = wxaAttributes;
                                            str8 = str;
                                            wXMiniProgramObject3 = wXMiniProgramObject;
                                        }
                                    } catch (UnsupportedEncodingException unused3) {
                                        wxaAttributes = wxaAttributes2;
                                        wXMediaMessage = wXMediaMessage2;
                                        str2 = str6;
                                        wXMiniProgramObject = wXMiniProgramObject3;
                                        str = str8;
                                        str3 = str9;
                                        Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                        jVar = jVar2;
                                        it5 = it;
                                        str9 = str3;
                                        str6 = str2;
                                        wXMediaMessage2 = wXMediaMessage;
                                        wxaAttributes2 = wxaAttributes;
                                        str8 = str;
                                        wXMiniProgramObject3 = wXMiniProgramObject;
                                    }
                                    try {
                                        String b4 = C117627q.m165909b(Util.nullAsNil(wXMiniProgramObject3.path), str8);
                                        str = str8;
                                        try {
                                            i2 = wXMiniProgramObject3.miniprogramType;
                                            wXMiniProgramObject = wXMiniProgramObject3;
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(i7);
                                                sb.append(str9);
                                                sb.append(str11);
                                                sb.append(str9);
                                                sb.append(str12);
                                                sb.append(str9);
                                                sb.append(k ? 1 : 0);
                                                sb.append(str9);
                                                sb.append(type2);
                                                sb.append(str9);
                                                sb.append(U5 ? 1 : 0);
                                                sb.append(str9);
                                                boolean z = U5;
                                                sb.append(1);
                                                sb.append(str9);
                                                sb.append(str10);
                                                sb.append(str9);
                                                sb.append(b);
                                                sb.append(str9);
                                                sb.append(b2);
                                                sb.append(str9);
                                                sb.append(b3);
                                                sb.append(str9);
                                                sb.append(str4);
                                                sb.append(str9);
                                                sb.append(b4);
                                                sb.append(str9);
                                                sb.append(i2);
                                                Log.m105924i("MicroMsg.ShareReport", sb.toString());
                                                nVar = C115669n.INSTANCE;
                                                str3 = str9;
                                                try {
                                                    objArr = new Object[15];
                                                    objArr[0] = Integer.valueOf(i7);
                                                    objArr[1] = str11;
                                                    objArr[2] = str12;
                                                    objArr[3] = Integer.valueOf(k);
                                                } catch (UnsupportedEncodingException unused4) {
                                                    Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                    jVar = jVar2;
                                                    it5 = it;
                                                    str9 = str3;
                                                    str6 = str2;
                                                    wXMediaMessage2 = wXMediaMessage;
                                                    wxaAttributes2 = wxaAttributes;
                                                    str8 = str;
                                                    wXMiniProgramObject3 = wXMiniProgramObject;
                                                }
                                                try {
                                                    objArr[4] = Integer.valueOf(type2);
                                                    try {
                                                        objArr[5] = Integer.valueOf(z ? 1 : 0);
                                                    } catch (UnsupportedEncodingException unused5) {
                                                        Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                        jVar = jVar2;
                                                        it5 = it;
                                                        str9 = str3;
                                                        str6 = str2;
                                                        wXMediaMessage2 = wXMediaMessage;
                                                        wxaAttributes2 = wxaAttributes;
                                                        str8 = str;
                                                        wXMiniProgramObject3 = wXMiniProgramObject;
                                                    }
                                                } catch (UnsupportedEncodingException unused6) {
                                                    Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                    jVar = jVar2;
                                                    it5 = it;
                                                    str9 = str3;
                                                    str6 = str2;
                                                    wXMediaMessage2 = wXMediaMessage;
                                                    wxaAttributes2 = wxaAttributes;
                                                    str8 = str;
                                                    wXMiniProgramObject3 = wXMiniProgramObject;
                                                }
                                            } catch (UnsupportedEncodingException unused7) {
                                                str3 = str9;
                                                Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                jVar = jVar2;
                                                it5 = it;
                                                str9 = str3;
                                                str6 = str2;
                                                wXMediaMessage2 = wXMediaMessage;
                                                wxaAttributes2 = wxaAttributes;
                                                str8 = str;
                                                wXMiniProgramObject3 = wXMiniProgramObject;
                                            }
                                        } catch (UnsupportedEncodingException unused8) {
                                            wXMiniProgramObject = wXMiniProgramObject3;
                                            str3 = str9;
                                            Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                            jVar = jVar2;
                                            it5 = it;
                                            str9 = str3;
                                            str6 = str2;
                                            wXMediaMessage2 = wXMediaMessage;
                                            wxaAttributes2 = wxaAttributes;
                                            str8 = str;
                                            wXMiniProgramObject3 = wXMiniProgramObject;
                                        }
                                        try {
                                            objArr[6] = 1;
                                            try {
                                                objArr[7] = str10;
                                                try {
                                                    objArr[8] = b;
                                                    objArr[9] = b2;
                                                    try {
                                                        objArr[10] = b3;
                                                        try {
                                                            objArr[11] = str4;
                                                            try {
                                                                objArr[12] = b4;
                                                            } catch (UnsupportedEncodingException unused9) {
                                                                Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                                jVar = jVar2;
                                                                it5 = it;
                                                                str9 = str3;
                                                                str6 = str2;
                                                                wXMediaMessage2 = wXMediaMessage;
                                                                wxaAttributes2 = wxaAttributes;
                                                                str8 = str;
                                                                wXMiniProgramObject3 = wXMiniProgramObject;
                                                            }
                                                        } catch (UnsupportedEncodingException unused10) {
                                                            Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                            jVar = jVar2;
                                                            it5 = it;
                                                            str9 = str3;
                                                            str6 = str2;
                                                            wXMediaMessage2 = wXMediaMessage;
                                                            wxaAttributes2 = wxaAttributes;
                                                            str8 = str;
                                                            wXMiniProgramObject3 = wXMiniProgramObject;
                                                        }
                                                    } catch (UnsupportedEncodingException unused11) {
                                                        Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                        jVar = jVar2;
                                                        it5 = it;
                                                        str9 = str3;
                                                        str6 = str2;
                                                        wXMediaMessage2 = wXMediaMessage;
                                                        wxaAttributes2 = wxaAttributes;
                                                        str8 = str;
                                                        wXMiniProgramObject3 = wXMiniProgramObject;
                                                    }
                                                } catch (UnsupportedEncodingException unused12) {
                                                    Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                    jVar = jVar2;
                                                    it5 = it;
                                                    str9 = str3;
                                                    str6 = str2;
                                                    wXMediaMessage2 = wXMediaMessage;
                                                    wxaAttributes2 = wxaAttributes;
                                                    str8 = str;
                                                    wXMiniProgramObject3 = wXMiniProgramObject;
                                                }
                                            } catch (UnsupportedEncodingException unused13) {
                                                Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                jVar = jVar2;
                                                it5 = it;
                                                str9 = str3;
                                                str6 = str2;
                                                wXMediaMessage2 = wXMediaMessage;
                                                wxaAttributes2 = wxaAttributes;
                                                str8 = str;
                                                wXMiniProgramObject3 = wXMiniProgramObject;
                                            }
                                        } catch (UnsupportedEncodingException unused14) {
                                            Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                            jVar = jVar2;
                                            it5 = it;
                                            str9 = str3;
                                            str6 = str2;
                                            wXMediaMessage2 = wXMediaMessage;
                                            wxaAttributes2 = wxaAttributes;
                                            str8 = str;
                                            wXMiniProgramObject3 = wXMiniProgramObject;
                                        }
                                    } catch (UnsupportedEncodingException unused15) {
                                        wXMiniProgramObject = wXMiniProgramObject3;
                                        str = str8;
                                        str3 = str9;
                                        Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                        jVar = jVar2;
                                        it5 = it;
                                        str9 = str3;
                                        str6 = str2;
                                        wXMediaMessage2 = wXMediaMessage;
                                        wxaAttributes2 = wxaAttributes;
                                        str8 = str;
                                        wXMiniProgramObject3 = wXMiniProgramObject;
                                    }
                                    try {
                                        objArr[13] = Integer.valueOf(i2);
                                        try {
                                            objArr[14] = str2;
                                            nVar.mo160131h(16492, objArr);
                                        } catch (UnsupportedEncodingException unused16) {
                                        }
                                    } catch (UnsupportedEncodingException unused17) {
                                        Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                        jVar = jVar2;
                                        it5 = it;
                                        str9 = str3;
                                        str6 = str2;
                                        wXMediaMessage2 = wXMediaMessage;
                                        wxaAttributes2 = wxaAttributes;
                                        str8 = str;
                                        wXMiniProgramObject3 = wXMiniProgramObject;
                                    }
                                } catch (UnsupportedEncodingException unused18) {
                                    wxaAttributes = wxaAttributes2;
                                    wXMediaMessage = wXMediaMessage2;
                                    str2 = str6;
                                    wXMiniProgramObject = wXMiniProgramObject3;
                                    str = str8;
                                    str3 = str9;
                                    it = it5;
                                    Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                    jVar = jVar2;
                                    it5 = it;
                                    str9 = str3;
                                    str6 = str2;
                                    wXMediaMessage2 = wXMediaMessage;
                                    wxaAttributes2 = wxaAttributes;
                                    str8 = str;
                                    wXMiniProgramObject3 = wXMiniProgramObject;
                                }
                                jVar = jVar2;
                                it5 = it;
                                str9 = str3;
                                str6 = str2;
                                wXMediaMessage2 = wXMediaMessage;
                                wxaAttributes2 = wxaAttributes;
                                str8 = str;
                                wXMiniProgramObject3 = wXMiniProgramObject;
                            }
                        }
                    } else if (i3 != 1) {
                        if (i3 == 2) {
                            sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                        } else if (i3 == 3) {
                            sendAppMessageWrapperUI.finish();
                        }
                    } else if (obj2 instanceof Integer) {
                        int intValue = ((Integer) obj2).intValue();
                        if (intValue > Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("InputLimitSendThirdPartyAppMsgEmotionBufSize"), 524288)) {
                            Log.m105924i("MicroMsg.SendAppMessageWrapperUI", "third party shared emoji can't bigger 512 KB");
                        }
                        C115669n nVar3 = C115669n.INSTANCE;
                        C44561j jVar3 = sendAppMessageWrapperUI.f250363e;
                        nVar3.mo160131h(13461, jVar3.field_appId, jVar3.field_appName, Integer.valueOf(intValue));
                    }
                } else if (i3 == 2) {
                    sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                } else if (i3 == 3) {
                    if (!Util.isEqual(obj2, (Object) "cb_msg_is_null") && !Util.isEqual(obj2, (Object) "cb_key_user_list_is_empty")) {
                        sendAppMessageWrapperUI.finish();
                    }
                    sendAppMessageWrapperUI.mo119870N7(str5, linkedList, i4);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$b */
    public class C85961b implements C65953v0 {
        public C85961b() {
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            Intent intent = new Intent();
            intent.putExtra("Select_stay_in_wx", true);
            intent.putExtra("scene_select_user_liast", SendAppMessageWrapperUI.this.f250364f);
            SendAppMessageWrapperUI.this.setResult(-1, intent);
            SendAppMessageWrapperUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$c */
    public class C85962c implements C65953v0 {
        public C85962c() {
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            Intent putExtra = new Intent().putExtra("Select_back_to_app", true);
            putExtra.putExtra("scene_select_user_liast", SendAppMessageWrapperUI.this.f250364f);
            SendAppMessageWrapperUI sendAppMessageWrapperUI = SendAppMessageWrapperUI.this;
            if (sendAppMessageWrapperUI.f250366h != 3) {
                if (sendAppMessageWrapperUI.getIntent().getExtras() != null) {
                    putExtra.putExtras(SendAppMessageWrapperUI.this.getIntent().getExtras());
                }
                SendAppMessageWrapperUI.this.setResult(-1, putExtra);
                SendAppMessageWrapperUI.this.finish();
                return;
            }
            sendAppMessageWrapperUI.setResult(-1);
            SendAppMessageWrapperUI.this.finish();
            ReportUtil.m84997c(SendAppMessageWrapperUI.this, ReportUtil.m84995a(SendAppMessageWrapperUI.this.getIntent().getExtras(), 0), true, false);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$e */
    public class C85963e implements C90049b0 {
        public C85963e() {
        }

        /* renamed from: a */
        public void mo119879a(String str, boolean z) {
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putString("music_mv_cover_url", str);
                SendAppMessageWrapperUI sendAppMessageWrapperUI = SendAppMessageWrapperUI.this;
                int i = SendAppMessageWrapperUI.f250361A;
                sendAppMessageWrapperUI.mo119872P7(true, true, bundle);
                return;
            }
            Log.m105920e("MicroMsg.SendAppMessageWrapperUI", "thumb img CDN upload fail!");
            ReportUtil.m84997c(SendAppMessageWrapperUI.this, ReportUtil.m84995a(SendAppMessageWrapperUI.this.getIntent().getExtras(), -1), true, false);
            SendAppMessageWrapperUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$f */
    public class C85964f {

        /* renamed from: a */
        public String f250390a;

        /* renamed from: b */
        public String f250391b;

        public C85964f(SendAppMessageWrapperUI sendAppMessageWrapperUI, String str, String str2) {
            this.f250390a = str;
            this.f250391b = str2;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$g */
    public class C85965g {

        /* renamed from: a */
        public String f250392a;

        /* renamed from: b */
        public String f250393b;

        public C85965g(SendAppMessageWrapperUI sendAppMessageWrapperUI, String str, String str2) {
            this.f250392a = str;
            this.f250393b = str2;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$h */
    public interface C85966h {
    }

    /* renamed from: H7 */
    public static void m106274H7(SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        int i = sendAppMessageWrapperUI.f250366h;
        if (i == 0 || i == 3) {
            Intent intent = new Intent();
            intent.putExtra("Select_Report_Args", ReportUtil.m84995a(sendAppMessageWrapperUI.getIntent().getExtras(), -2));
            sendAppMessageWrapperUI.setResult(0, intent);
        } else {
            ReportUtil.m84997c(sendAppMessageWrapperUI, ReportUtil.m84995a(sendAppMessageWrapperUI.getIntent().getExtras(), -2), true, false);
        }
        sendAppMessageWrapperUI.finish();
    }

    /* renamed from: I7 */
    public static void m106275I7(SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        sendAppMessageWrapperUI.getClass();
        Log.m105924i("MicroMsg.SendAppMessageWrapperUI", "finishOKWhenCancel");
        sendAppMessageWrapperUI.f250379x = true;
        ReportUtil.m84997c(sendAppMessageWrapperUI, ReportUtil.m84995a(sendAppMessageWrapperUI.getIntent().getExtras(), 0), true, true);
        sendAppMessageWrapperUI.finish();
    }

    /* renamed from: J7 */
    public final boolean mo119866J7() {
        Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "blockInvalidToken block %b", Boolean.valueOf(this.f250374s));
        return this.f250374s;
    }

    /* renamed from: K7 */
    public final boolean mo119867K7(WXMediaMessage wXMediaMessage) {
        Bitmap a;
        C78575u.C78583h hVar = new C78575u.C78583h(this);
        String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        View view = null;
        hVar.mo108578p(stringExtra != null ? Util.stringsToList(stringExtra.split(",")) : null);
        byte[] bArr = wXMediaMessage.thumbData;
        if (wXMediaMessage.getType() == 76 || wXMediaMessage.getType() == 3) {
            WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
            String str = wXMediaMessage.title;
            String str2 = wXMediaMessage.description;
            if (wXMediaMessage.getType() == 76) {
                str2 = ((WXMusicVideoObject) iMediaObject).singerName;
                if (Util.isNullOrNil(str2)) {
                    str2 = wXMediaMessage.description;
                }
            }
            view = View.inflate(this, C0966R.C0971layout.f359979bz2, (ViewGroup) null);
            ((RoundCornerRelativeLayout) view.findViewById(C0966R.C0970id.iwu)).setRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), 4));
            View findViewById = view.findViewById(C0966R.C0970id.aft);
            View findViewById2 = view.findViewById(C0966R.C0970id.h5u);
            if (C85875k4.m106211z()) {
                findViewById2.setBackgroundResource(C0966R.C0969drawable.atm);
            } else {
                findViewById2.setBackgroundResource(C0966R.C0969drawable.atn);
            }
            MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) findViewById2.findViewById(C0966R.C0970id.b7t);
            TextView textView = (TextView) findViewById2.findViewById(C0966R.C0970id.b7x);
            TextView textView2 = (TextView) findViewById2.findViewById(C0966R.C0970id.b7y);
            textView2.setMaxLines(2);
            textView.setMaxLines(1);
            ((TextView) findViewById2.findViewById(C0966R.C0970id.b7v)).setMaxLines(1);
            textView2.setText(str);
            textView.setText(str2);
            if (bArr != null && bArr.length > 0 && (a = MMBitmapFactory.m98732a(bArr, 0, bArr.length)) != null && !a.isRecycled()) {
                mMRoundCornerImageView.setImageBitmap(a);
                String str3 = "";
                String f = C90193h.m112878f(str3.getBytes());
                C55593g gVar = C55593g.f158270a;
                AppCompatActivity context = getContext();
                if (f != null) {
                    str3 = f;
                }
                gVar.mo77114b(context, findViewById, a, str3);
            }
            findViewById2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }
        if (view == null) {
            return false;
        }
        hVar.mo108565c(view);
        hVar.mo108570h(false);
        Boolean bool = Boolean.TRUE;
        hVar.mo108569g(bool);
        hVar.mo108569g(bool);
        hVar.mo108573k(C0966R.string.bjd);
        hVar.mo108563a(new C90055h0(this, wXMediaMessage));
        hVar.mo108574l();
        return true;
    }

    /* renamed from: L7 */
    public final void mo119868L7(WXMediaMessage wXMediaMessage, String str, int i) {
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        String str2 = str;
        Log.m105919d("MicroMsg.SendAppMessageWrapperUI", "dealOK msg[%s], text[%s], parsterLen[%d], scene[%d]", wXMediaMessage2, str2, Integer.valueOf(i), Integer.valueOf(this.f250366h));
        int i2 = this.f250366h;
        if (i2 == 0 || i2 == 3) {
            int i3 = i;
            C116756s5.m164691d().mo180727a(38, 1);
            LinkedList linkedList = new LinkedList(Util.stringsToList(this.f250364f.split(",")));
            int i4 = this.f250366h == 3 ? 1 : 0;
            C85970n.C85973b bVar = new C85970n.C85973b();
            bVar.f250402a = this.f250380y;
            bVar.f250403b = this.f250372q;
            C85970n.m106295k(this, getIntent(), this.f250363e, wXMediaMessage, linkedList, i4, this.f250370o, mo119866J7(), this.f250371p, this.f250377v, this.f250378w, 1, new C85960a(wXMediaMessage, str, i, linkedList), bVar);
            return;
        }
        if (C99019x.m128975g() != null) {
            C88014u g = C99019x.m128975g();
            C44561j jVar = this.f250363e;
            String str3 = jVar.field_appId;
            String str4 = jVar.field_appName;
            C94928p2 p2Var = (C94928p2) g;
            p2Var.getClass();
            SnsMethodCalculate.markStartTimeMs("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            C94945s2 r = p2Var.mo131207r(wXMediaMessage2, str2, str3, str4);
            if (r == null) {
                SnsMethodCalculate.markEndTimeMs("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            } else {
                r.mo131238L(wXMediaMessage2.mediaTagName);
                r.mo131240N(str3, wXMediaMessage2.messageExt, wXMediaMessage2.messageAction);
                if (i > C76634a.f224255a) {
                    r.mo131261r(1, 1);
                }
                int i5 = r.mo131252i();
                Log.m105918d("MicroMsg.UploadManager", "shareAppMsg set and the result: " + i5);
                SnsMethodCalculate.markEndTimeMs("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            }
            ((C94928p2) C99019x.m128975g()).mo131192c();
        }
        ReportUtil.m84997c(this, ReportUtil.m84995a(getIntent().getExtras(), 0), true, false);
        finish();
    }

    /* renamed from: M7 */
    public final void mo119869M7() {
        try {
            C89779i0 i0Var = this.f250368j;
            if (i0Var != null && i0Var.isShowing()) {
                this.f250368j.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: N7 */
    public final void mo119870N7(String str, LinkedList<String> linkedList, int i) {
        String str2;
        if (this.f250363e.field_appId.equals("wx4310bbd51be7d979")) {
            str2 = null;
        } else {
            C44561j jVar = this.f250363e;
            str2 = getString(C0966R.string.bj9, new Object[]{((C79138l) C86312j.m106911c(C79138l.class)).mo74019xG(this, jVar, jVar.field_appName)});
        }
        if (!this.f250370o && mo119866J7()) {
            str2 = getString(C0966R.string.bj8);
        } else if (str2 == null) {
            str2 = getString(C0966R.string.bj8);
        }
        String str3 = str2;
        String string = getString(C0966R.string.bjf);
        C85961b bVar = new C85961b();
        C85962c cVar = new C85962c();
        if (this.f250373r) {
            cVar.mo23a(true, str, i);
        } else {
            C76638d.m92292a(this.mController, getString(C0966R.string.bjc), str3, string, cVar, bVar);
        }
        if (str == null || str.length() == 0) {
            Log.m105924i("MicroMsg.SendAppMessageWrapperUI", "summerbig dealSucc, text is empty");
            return;
        }
        Log.m105918d("MicroMsg.SendAppMessageWrapperUI", "summerbig dktext , send msg here:" + str);
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C100760a0.C100764f a = C100760a0.m131931a(next);
            a.f295187a = next;
            a.f295189c = str;
            a.f295190d = C45628s0.m50810y(this.f250364f);
            a.f295191e = 0;
            a.f295194h = 4;
            a.mo140195a().mo123694a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0250  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo119871O7(com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r0 = r20
            r4 = r21
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r21)
            r9 = 1
            r6[r9] = r8
            java.lang.String r8 = "MicroMsg.SendAppMessageWrapperUI"
            java.lang.String r10 = "handleSendStatus mediaPath: %s, filterJumpInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r10 = r2.stateTitle
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r1.f250367i
            java.lang.String r13 = ""
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r13)
            r11.append(r12)
            java.lang.String r12 = "@opensdk"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "handleSendStatus() called with: sceneDataObject = ["
            r12.append(r14)
            r12.append(r2)
            java.lang.String r14 = "], mediaPath = ["
            r12.append(r14)
            r12.append(r3)
            java.lang.String r14 = "], jumpInfoThumb = ["
            r12.append(r14)
            r12.append(r0)
            java.lang.String r14 = "], filterJumpInfo = ["
            r12.append(r14)
            r12.append(r4)
            java.lang.String r14 = "], displayName = ["
            r12.append(r14)
            r14 = r22
            r12.append(r14)
            java.lang.String r15 = "]"
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            java.lang.Class<ym.l> r12 = p763ym.C79138l.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ym.l r12 = (p763ym.C79138l) r12
            java.lang.String r15 = r1.f250367i
            java.lang.String r12 = r12.mo74012l5(r1, r15)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r13)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r15 != 0) goto L_0x0092
            r12 = r14
        L_0x0092:
            com.tencent.mm.pluginsdk.model.app.j r14 = r1.f250363e
            java.lang.String r14 = r14.field_appIconUrl
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r13)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            if (r15 != 0) goto L_0x00a1
            r14 = r0
        L_0x00a1:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r15 = r1.f250365g
            int r15 = r15.getType()
            r7 = 38
            if (r15 == r9) goto L_0x0197
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r15 = r1.f250365g
            int r15 = r15.getType()
            if (r15 == r5) goto L_0x0197
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r15 = r1.f250365g
            int r15 = r15.getType()
            if (r15 != r7) goto L_0x00bd
            goto L_0x0197
        L_0x00bd:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.f250365g
            int r0 = r0.getType()
            r4 = 76
            if (r0 != r4) goto L_0x0196
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r4 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject r4 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject) r4
            java.lang.String r7 = r2.stateTitle
            java.lang.String r12 = r0.title
            uz2.a0 r0 = new uz2.a0
            r0.<init>()
            java.lang.String r10 = "1"
            r0.f188439d = r10
            te3.kb1 r10 = new te3.kb1
            r10.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r1.f250365g
            java.lang.String r14 = r14.title
            r10.f183904d = r14
            java.lang.String r14 = r4.musicDataUrl
            r10.f183906f = r14
            java.lang.String r14 = r4.musicUrl
            r10.f183908h = r14
            java.lang.String r14 = r4.musicGenre
            r10.f183913p = r14
            java.lang.String r14 = r1.f250367i
            r10.f183907g = r14
            java.lang.String r14 = r4.songLyric
            r10.f183910j = r14
            com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo r14 = r4.musicVipInfo
            if (r14 == 0) goto L_0x0103
            java.lang.String r13 = r14.musicId
            java.lang.String r13 = qc0.C101093a.m132484f(r13)
        L_0x0103:
            r10.f183922y = r13
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.String r14 = r4.singerName
            r15 = 0
            r13[r15] = r14
            com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo r14 = r4.musicVipInfo
            if (r14 == 0) goto L_0x0112
            r14 = 1
            goto L_0x0113
        L_0x0112:
            r14 = 0
        L_0x0113:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r13[r9] = r14
            java.lang.String r14 = "share music mv to status, singerName:%s, musicVipInfo is valid:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r13)
            java.lang.String r13 = r4.singerName
            r10.f183905e = r13
            java.lang.String r13 = r4.albumName
            r10.f183911n = r13
            r10.f183912o = r3
            long r13 = r4.issueDate
            r10.f183915r = r13
            java.lang.String r13 = r4.identification
            r10.f183917t = r13
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r13 = r1.f250365g
            java.lang.String r13 = r13.messageExt
            r10.f183916s = r13
            int r13 = r4.duration
            r10.f183918u = r13
            te3.lb1 r13 = new te3.lb1
            r13.<init>()
            r10.f183921x = r13
            java.lang.String r14 = r4.musicOperationUrl
            r13.f184069d = r14
            te3.t23 r13 = new te3.t23
            r13.<init>()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r14 = r1.f250365g
            java.lang.String r15 = r14.title
            r13.f185473u = r15
            java.lang.String r15 = r4.songLyric
            r13.f185474v = r15
            java.lang.String r15 = r4.singerName
            r13.f185463h = r15
            java.lang.String r15 = r4.albumName
            r13.f185464i = r15
            r13.f185475w = r3
            java.lang.String r15 = r4.musicGenre
            r13.f185466n = r15
            r16 = r6
            long r5 = r4.issueDate
            r13.f185467o = r5
            java.lang.String r5 = r4.identification
            r13.f185468p = r5
            int r5 = r4.duration
            r13.f185469q = r5
            java.lang.String r4 = r4.musicOperationUrl
            r13.f185471s = r4
            java.lang.String r4 = r10.f183922y
            r13.f185470r = r4
            java.lang.String r4 = r14.messageExt
            r13.f185465j = r4
            java.lang.Class<jv.d> r4 = p580jv.C60924d.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            jv.d r4 = (p580jv.C60924d) r4
            java.lang.String r4 = r4.mo85586d8(r10, r13)
            r0.f188441f = r4
            r5 = r16
            r5.add(r0)
            java.lang.String r14 = "http://wxapp.tc.qq.com/258/20304/stodownload?m=2009416463c227ad5a09b4fcf23bf985&filekey=30340201010420301e020201020402534804102009416463c227ad5a09b4fcf23bf9850202042e040d00000004627466730000000131&hy=SH&storeid=32303231303331383139353931363030306366646534303030303030303037636638353130393030303030313032&bizid=1023"
            r0 = r3
            r3 = 0
            goto L_0x02c4
        L_0x0196:
            return
        L_0x0197:
            r5 = r6
            uz2.a0 r6 = new uz2.a0
            r6.<init>()
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo r13 = r2.stateJumpInfo
            boolean r15 = r13 instanceof com.tencent.p014mm.opensdk.modelmsg.WXStateJumpUrlInfo
            java.lang.String r7 = "3"
            if (r15 == 0) goto L_0x01ba
            com.tencent.mm.opensdk.modelmsg.WXStateJumpUrlInfo r13 = (com.tencent.p014mm.opensdk.modelmsg.WXStateJumpUrlInfo) r13
            java.lang.String r0 = r13.jumpUrl
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x025e
            r6.f188439d = r7
            java.lang.String r0 = r13.jumpUrl
            r6.f188441f = r0
            r5.add(r6)
            goto L_0x025e
        L_0x01ba:
            if (r4 != 0) goto L_0x0215
            boolean r15 = r13 instanceof com.tencent.p014mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo
            if (r15 == 0) goto L_0x0215
            com.tencent.mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo r13 = (com.tencent.p014mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo) r13
            java.lang.String r4 = r13.username
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x024d
            java.lang.String r4 = "7"
            r6.f188439d = r4     // Catch:{ Exception -> 0x020b }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x020b }
            r4.<init>()     // Catch:{ Exception -> 0x020b }
            java.lang.String r15 = "username"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020b }
            r9.<init>()     // Catch:{ Exception -> 0x020b }
            java.lang.String r3 = r13.username     // Catch:{ Exception -> 0x020b }
            r9.append(r3)     // Catch:{ Exception -> 0x020b }
            java.lang.String r3 = "@app"
            r9.append(r3)     // Catch:{ Exception -> 0x020b }
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x020b }
            r4.put(r15, r3)     // Catch:{ Exception -> 0x020b }
            java.lang.String r3 = "path"
            java.lang.String r9 = r13.path     // Catch:{ Exception -> 0x020b }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x020b }
            java.lang.String r3 = "versionType"
            int r9 = r13.miniProgramType     // Catch:{ Exception -> 0x020b }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x020b }
            java.lang.String r3 = "headImageURL"
            r4.put(r3, r0)     // Catch:{ Exception -> 0x020b }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x020b }
            r6.f188441f = r0     // Catch:{ Exception -> 0x020b }
            r5.add(r6)     // Catch:{ Exception -> 0x020b }
            goto L_0x0242
        L_0x020b:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = "handleSendStatus set miniProgram jump info exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r4)
            goto L_0x024d
        L_0x0215:
            if (r4 != 0) goto L_0x024d
            boolean r3 = r13 instanceof com.tencent.p014mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo
            if (r3 == 0) goto L_0x024d
            com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo r13 = (com.tencent.p014mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo) r13
            java.lang.String r3 = r13.username
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x024d
            java.lang.String r3 = "8"
            r6.f188439d = r3     // Catch:{ Exception -> 0x0244 }
            uz2.i1 r3 = new uz2.i1     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r4 = r13.username     // Catch:{ Exception -> 0x0244 }
            r3.f147139d = r4     // Catch:{ Exception -> 0x0244 }
            r3.f147140e = r0     // Catch:{ Exception -> 0x0244 }
            byte[] r0 = r3.toByteArray()     // Catch:{ Exception -> 0x0244 }
            r3 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ Exception -> 0x0244 }
            r6.f188442g = r0     // Catch:{ Exception -> 0x0244 }
            r5.add(r6)     // Catch:{ Exception -> 0x0244 }
        L_0x0242:
            r0 = 1
            goto L_0x024e
        L_0x0244:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = "handleSendStatus set finder profile jump info exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r4)
        L_0x024d:
            r0 = 0
        L_0x024e:
            if (r0 == 0) goto L_0x025e
            uz2.a0 r0 = new uz2.a0
            r0.<init>()
            r0.f188439d = r7
            java.lang.String r3 = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect"
            r0.f188441f = r3
            r5.add(r0)
        L_0x025e:
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r0[r6] = r4
            java.lang.String r4 = "handleSendStatus jumpInfoList size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r0)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.f250365g
            int r0 = r0.getType()
            if (r0 != r3) goto L_0x0290
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r0 == 0) goto L_0x02c0
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXTextObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXTextObject) r0
            java.lang.String r3 = r0.text
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x02c0
            java.lang.String r10 = r0.text
            goto L_0x02c0
        L_0x0290:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.f250365g
            int r0 = r0.getType()
            r3 = 2
            if (r0 != r3) goto L_0x02ac
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 == 0) goto L_0x02a8
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXImageObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXImageObject) r0
            java.lang.String r0 = r0.imagePath
            goto L_0x02aa
        L_0x02a8:
            r0 = r19
        L_0x02aa:
            r3 = 1
            goto L_0x02c3
        L_0x02ac:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.f250365g
            int r0 = r0.getType()
            r3 = 38
            if (r0 != r3) goto L_0x02c0
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r1.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXVideoFileObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject) r0
            java.lang.String r0 = r0.filePath
            r3 = 2
            goto L_0x02c3
        L_0x02c0:
            r0 = r19
            r3 = 0
        L_0x02c3:
            r7 = r10
        L_0x02c4:
            qy2.z$a r4 = new qy2.z$a
            r4.<init>()
            java.lang.String r6 = r2.stateId
            r4.mo88254a(r6)
            qy2.z r6 = r4.f179715a
            uz2.u r9 = r6.f229399d
            r9.f147231J = r7
            r6.f229400e = r0
            r9.f147237f = r3
            r4.mo88258e(r11)
            r4.mo88259f(r12)
            r4.mo88257d(r14)
            java.lang.String r3 = r2.token
            r4.mo88260g(r3)
            r4.mo88255b(r5)
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6 = 0
            r3[r6] = r11
            r6 = 1
            r3[r6] = r12
            r6 = 2
            r3[r6] = r7
            java.lang.String r2 = r2.token
            r6 = 3
            r3[r6] = r2
            r2 = 4
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r2] = r5
            r2 = 5
            r3[r2] = r0
            java.lang.String r0 = "handleSendStatus sourceId: %s, sourceName: %s, desc: %s, token: %s, jumpInfos: %s, thumbUrl: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r3)
            java.lang.Class<yy.h> r0 = p773yy.C66708h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            yy.h r0 = (p773yy.C66708h) r0
            qy2.z r2 = r4.f179715a
            r0.mo90743iL(r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.mo119871O7(com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject, java.lang.String, java.lang.String, boolean, java.lang.String):void");
    }

    /* renamed from: P7 */
    public final void mo119872P7(boolean z, boolean z2, Bundle bundle) {
        Intent intent;
        String str;
        if (this.f250370o || !mo119866J7()) {
            int i = this.f250375t;
            WXMediaMessage wXMediaMessage = this.f250365g;
            C44561j jVar = this.f250363e;
            intent = C67025g.m79183b(i, wXMediaMessage, "", jVar.field_appId, jVar.field_appName, jVar.mo69359k(), bundle);
        } else {
            intent = C67025g.m79183b(this.f250375t, this.f250365g, "", "", "", this.f250363e.mo69359k(), bundle);
        }
        if (intent == null) {
            finish();
            return;
        }
        if (this.f250365g.getType() == 5 || this.f250365g.getType() == 2 || this.f250365g.getType() == 38) {
            Log.m105919d("MicroMsg.SendAppMessageWrapperUI", "report(11954), to timeline, appId : %s", this.f250363e.field_appId);
            str = C86493v0.m107223a("app_" + this.f250363e.field_appId);
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(str, true);
            c.mo120962i("prePublishId", "app_" + this.f250363e.field_appId);
            WXMediaMessage.IMediaObject iMediaObject = this.f250365g.mediaObject;
            if (iMediaObject instanceof WXWebpageObject) {
                c.mo120962i("url", ((WXWebpageObject) iMediaObject).webpageUrl);
            }
        } else {
            str = null;
        }
        if ("wx5dfbe0a95623607b".equals(this.f250363e.field_appId)) {
            if (this.f250365g.getType() == 5) {
                Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "report(17256) url, to timeline, appId : %s", this.f250363e.field_appId);
                C115669n.INSTANCE.mo160131h(17256, str, 2);
            } else if (this.f250365g.getType() == 38) {
                Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "report(17256) video file, to timeline, appId : %s", this.f250363e.field_appId);
                C115669n.INSTANCE.mo160131h(17256, str, 1);
            }
        }
        intent.putExtra("reportSessionId", str);
        intent.putExtra("KSnsUploadFromSkipCompress", z2);
        intent.putExtra("SendAppMessageWrapper_TokenValid", this.f250370o);
        intent.putExtra("SendAppMessageWrapper_PkgName", this.f250371p);
        if (!z) {
            C88144b.m109791i(this, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
        } else {
            C88144b.m109795m(this, "sns", ".ui.SnsUploadUI", intent, 1);
        }
    }

    /* renamed from: Q7 */
    public final boolean mo119873Q7(String str, String str2) {
        C75592q0.m90789s();
        C100760a0.C100764f a = C100760a0.m131931a(str);
        a.f295187a = str;
        a.f295189c = str2;
        a.f295190d = C45628s0.m50810y(str);
        a.f295191e = 0;
        a.f295194h = 4;
        a.mo140195a().mo123694a();
        return true;
    }

    /* renamed from: R7 */
    public final void mo119874R7(String str, WXMediaMessage wXMediaMessage) {
        if (Util.isNullOrNil(str) || wXMediaMessage == null || wXMediaMessage.mediaObject == null) {
            Log.m105929w("MicroMsg.SendAppMessageWrapperUI", "sendAppMsg: error userName:%s wxMediaMessage:%s", str, wXMediaMessage);
            return;
        }
        C44561j jVar = this.f250363e;
        C72695v.m85050C(wXMediaMessage, jVar.field_appId, jVar.field_appName, str, 2, (String) null, (String) null, 0, new C72681a());
    }

    /* renamed from: S7 */
    public final void mo119875S7(DialogInterface.OnCancelListener onCancelListener) {
        mo119869M7();
        this.f250368j = C89779i0.m112248e(this, getString(C0966R.string.gas), true, 0, onCancelListener);
    }

    /* renamed from: T7 */
    public final void mo119876T7(String str, byte[] bArr, C90049b0 b0Var) {
        if (Util.isNullOrNil(str) && bArr != null && bArr.length > 0) {
            Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "uploadMusicVideoImage upload thumbData: %s", Integer.valueOf(bArr.length));
            str = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127189kD(bArr);
        }
        if (Util.isNullOrNil(str)) {
            b0Var.mo119879a((String) null, true);
            return;
        }
        mo119875S7((DialogInterface.OnCancelListener) null);
        ((C119157j) C119157j.f356862d).mo183876g(new C90066z(str, b0Var), "MusicVideoShareUploadImage");
    }

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.SendAppMessageWrapperUI", "onActivityResult requestCode " + i + " resultCode " + i2);
        if (i == 1) {
            if (i2 == -1) {
                ReportUtil.m84997c(this, ReportUtil.m84995a(getIntent().getExtras(), 0), true, false);
            } else {
                ReportUtil.m84997c(this, ReportUtil.m84995a(getIntent().getExtras(), 0), true, true);
            }
            finish();
        } else if (i == 2 && i2 == -1) {
            WXMediaMessage.IMediaObject iMediaObject = this.f250365g.mediaObject;
            if (iMediaObject instanceof WXVideoFileObject) {
                WXVideoFileObject wXVideoFileObject = (WXVideoFileObject) iMediaObject;
                String stringExtra = intent.getStringExtra("K_SEGMENTVIDEOPATH");
                wXVideoFileObject.filePath = stringExtra;
                Log.m105925i("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult videoPath: %s", stringExtra);
                if (Util.isNullOrNil(wXVideoFileObject.filePath) || !C86013q1.m106450k(wXVideoFileObject.filePath)) {
                    Log.m105920e("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult videoFile invalid");
                    setResult(-5);
                    finish();
                    return;
                }
                int i3 = this.f250366h;
                if (i3 == 1) {
                    mo119872P7(true, false, (Bundle) null);
                    return;
                }
                Log.m105921e("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult unexpected scene: %s", Integer.valueOf(i3));
            } else if (iMediaObject instanceof WXGameVideoFileObject) {
                WXGameVideoFileObject wXGameVideoFileObject = (WXGameVideoFileObject) iMediaObject;
                String stringExtra2 = intent.getStringExtra("K_SEGMENTVIDEOPATH");
                wXGameVideoFileObject.filePath = stringExtra2;
                if (Util.isNullOrNil(stringExtra2) || !C86013q1.m106450k(wXGameVideoFileObject.filePath)) {
                    setResult(-5);
                    finish();
                    return;
                }
                mo119872P7(true, false, (Bundle) null);
            }
        } else if (i == 3) {
            if (i2 == -1) {
                ReportUtil.m84997c(this, ReportUtil.m84995a(getIntent().getExtras(), 0), true, false);
            } else {
                ReportUtil.m84997c(this, ReportUtil.m84995a(getIntent().getExtras(), 0), true, true);
            }
            finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0302, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0303, code lost:
        r21 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0302 A[ExcHandler: Exception (e java.lang.Exception), PHI: r3 
      PHI: (r3v76 boolean) = (r3v31 boolean), (r3v77 boolean), (r3v77 boolean), (r3v77 boolean), (r3v77 boolean), (r3v77 boolean) binds: [B:46:0x0218, B:52:0x022d, B:61:0x0246, B:62:?, B:56:0x0239, B:57:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x0218] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x045d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r7 = r22
            super.onCreate(r23)
            androidx.appcompat.app.ActionBar r0 = r22.getSupportActionBar()
            r0.mo91104o()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r1 = 0
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r0, r1)
            java.lang.String r2 = "settings_landscape_mode"
            boolean r3 = r0.getBoolean(r2, r1)
            r4 = 1
            java.lang.String r5 = "MicroMsg.SendAppMessageWrapperUI"
            if (r3 != 0) goto L_0x0037
            java.lang.String r3 = "change orientation"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r3)
            r7.f250369n = r4
            r3 = -1
            r7.setRequestedOrientation(r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r4)
            r0.commit()
        L_0x0037:
            android.content.Intent r0 = r22.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r2 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req
            r2.<init>(r0)
            java.lang.String r3 = "Select_Conv_User"
            java.lang.String r3 = r0.getString(r3)
            r7.f250364f = r3
            java.lang.String r3 = "SendAppMessageWrapper_TokenValid"
            boolean r3 = r0.getBoolean(r3, r4)
            r7.f250370o = r3
            java.lang.String r6 = ""
            java.lang.String r3 = "SendAppMessageWrapper_platformSignature"
            java.lang.String r3 = r0.getString(r3, r6)
            r7.f250372q = r3
            java.lang.String r3 = "SendAppMessageWrapper_PkgName"
            java.lang.String r3 = r0.getString(r3, r6)
            r7.f250371p = r3
            java.lang.String r3 = "SendAppMessageWrapper_NoNeedStayInWeixin"
            boolean r3 = r0.getBoolean(r3, r1)
            r7.f250373r = r3
            java.lang.String r3 = "SendAppMessageWrapper_BlockInvalidToken"
            boolean r3 = r0.getBoolean(r3, r1)
            r7.f250374s = r3
            android.content.Intent r3 = r22.getIntent()
            java.lang.String r8 = "_mmessage_sdkVersion"
            int r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r3, r8, r1)
            r7.f250375t = r3
            java.lang.String r3 = "SendAppMessageWrapper_secFlagForSinglePageMode"
            int r3 = r0.getInt(r3, r1)
            r7.f250377v = r3
            java.lang.String r3 = "SendAppMessageWrapper_videoTransPara"
            java.lang.String r3 = r0.getString(r3, r6)
            r7.f250378w = r3
            java.lang.String r3 = "SendAppMessageWrapper_Scene"
            int r3 = r0.getInt(r3, r1)
            r7.f250366h = r3
            java.lang.String r3 = "SendAppMessageWrapper_AppId"
            java.lang.String r3 = r0.getString(r3)
            r7.f250367i = r3
            if (r3 != 0) goto L_0x00b6
            java.lang.String r3 = "_mmessage_content"
            java.lang.String r3 = r0.getString(r3)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r8 = "appid"
            java.lang.String r3 = r3.getQueryParameter(r8)
            r7.f250367i = r3
        L_0x00b6:
            com.tencent.mm.pluginsdk.model.app.j r3 = new com.tencent.mm.pluginsdk.model.app.j
            r3.<init>()
            r7.f250363e = r3
            java.lang.String r8 = r7.f250367i
            r3.field_appId = r8
            com.tencent.mm.pluginsdk.model.app.p r3 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
            com.tencent.mm.pluginsdk.model.app.j r8 = r7.f250363e
            java.lang.String[] r9 = new java.lang.String[r1]
            r3.get(r8, (java.lang.String[]) r9)
            com.tencent.mm.pluginsdk.model.app.j r3 = r7.f250363e
            java.lang.String r3 = r3.field_appName
            if (r3 != 0) goto L_0x00da
            r3 = 2131824016(0x7f110d90, float:1.9280848E38)
            java.lang.String r3 = r7.getString(r3)
            goto L_0x00ec
        L_0x00da:
            java.lang.Class<ym.l> r3 = p763ym.C79138l.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ym.l r3 = (p763ym.C79138l) r3
            androidx.appcompat.app.AppCompatActivity r8 = r22.getContext()
            com.tencent.mm.pluginsdk.model.app.j r9 = r7.f250363e
            java.lang.String r3 = r3.mo74011hv(r8, r9)
        L_0x00ec:
            r8 = 2131824014(0x7f110d8e, float:1.9280844E38)
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r1] = r3
            java.lang.String r3 = r7.getString(r8, r9)
            r7.f250362d = r3
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r2.message
            r7.f250365g = r3
            android.content.Intent r3 = r22.getIntent()
            java.lang.String r8 = "SendAppMessageWrapper_SkipCompressVideo"
            boolean r3 = r3.getBooleanExtra(r8, r1)
            r8 = 4
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r10 = r7.f250365g
            java.lang.String r11 = r10.messageAction
            r9[r1] = r11
            java.lang.String r10 = r10.messageExt
            r9[r4] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            r11 = 2
            r9[r11] = r10
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r10 = r7.f250365g
            byte[] r10 = r10.thumbData
            r12 = 3
            r9[r12] = r10
            java.lang.String r10 = "onCreate, messageAction = %s, messageExt = %s, skipCompress = %b, thumbData: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            int r9 = r7.f250366h
            if (r9 != r4) goto L_0x04df
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r7.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r8 = r2.mediaObject
            if (r8 != 0) goto L_0x0135
            r22.finish()
            return
        L_0x0135:
            int r2 = r2.getType()
            r8 = 38
            java.lang.String r9 = ".segment.VideoCompressUI"
            java.lang.String r13 = "mmsight"
            java.lang.String r14 = "KSEGMENTVIDEOTHUMBPATH"
            java.lang.String r15 = "K_SEGMENTVIDEOPATH"
            r10 = 0
            if (r2 != r8) goto L_0x01ae
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r7.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXVideoFileObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXVideoFileObject) r0
            java.lang.String r2 = r0.filePath
            java.lang.Object[] r8 = new java.lang.Object[r12]
            int r12 = r7.f250366h
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r1] = r12
            r8[r4] = r2
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = r7.f250365g
            java.lang.String r1 = r1.messageExt
            r8[r11] = r1
            java.lang.String r1 = "handleVideoFileMsg scene: %s, videoPath: %s, messageExt: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r8)
            java.lang.String r1 = r0.filePath
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0176
            java.lang.String r1 = r0.filePath
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x0176
            goto L_0x017e
        L_0x0176:
            java.lang.String r1 = "handleVideFileMsg videoPath invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            r22.finish()
        L_0x017e:
            if (r3 == 0) goto L_0x019e
            java.lang.String r1 = r0.filePath
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0195
            java.lang.String r0 = r0.filePath
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x0195
            r7.mo119872P7(r4, r3, r10)
            goto L_0x04de
        L_0x0195:
            r1 = -5
            r7.setResult(r1)
            r22.finish()
            goto L_0x04de
        L_0x019e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r15, r2)
            r0.putExtra(r14, r6)
            ke3.C88144b.m109795m(r7, r13, r9, r0, r11)
            goto L_0x04de
        L_0x01ae:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r7.f250365g
            int r2 = r2.getType()
            r8 = 39
            if (r2 != r8) goto L_0x0497
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r7.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXGameVideoFileObject) r0
            if (r3 == 0) goto L_0x0481
            java.lang.String r2 = r0.filePath
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x046b
            java.lang.String r2 = r0.filePath
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x046b
            java.lang.String r2 = r0.filePath
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r5 = 104857600(0x6400000, float:3.6111186E-35)
            java.lang.String r8 = "ShareVideoMaxSize"
            int r0 = r0.mo107404b(r8, r5)
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            long r12 = (long) r0
            java.lang.String r5 = "MicroMsg.ShareSnsImpl"
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f8
            java.lang.String r0 = "file len too big "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r0 = 1
            goto L_0x01f9
        L_0x01f8:
            r0 = 0
        L_0x01f9:
            if (r0 == 0) goto L_0x01ff
            r21 = r3
            goto L_0x0442
        L_0x01ff:
            java.lang.String r0 = "frame-rate"
            java.lang.String r8 = "i-frame-interval"
            java.lang.String r9 = "bitrate"
            java.lang.String r12 = "width"
            java.lang.String r13 = "height"
            java.lang.String r14 = "durationUs"
            oj.b r15 = new oj.b
            r15.<init>()
            ad0.g$a r10 = new ad0.g$a
            r10.<init>()
            r10.f192518a = r2
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106448i(r2, r1)     // Catch:{ Exception -> 0x0302 }
            r15.mo161392k(r11)     // Catch:{ Exception -> 0x0302 }
            int r11 = r15.mo161385d()     // Catch:{ Exception -> 0x0302 }
            r16 = 0
            r17 = 0
        L_0x0227:
            java.lang.String r4 = "mime"
            if (r1 >= r11) goto L_0x0286
            r23 = r11
            android.media.MediaFormat r11 = r15.mo161386e(r1)     // Catch:{ Exception -> 0x0302 }
            boolean r19 = r11.containsKey(r4)     // Catch:{ Exception -> 0x0302 }
            if (r19 != 0) goto L_0x0244
            java.lang.String r4 = "find video mime : not found."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)     // Catch:{ Exception -> 0x0302, all -> 0x0241 }
            r21 = r3
            r19 = r6
            goto L_0x027b
        L_0x0241:
            r0 = move-exception
            goto L_0x0467
        L_0x0244:
            r19 = r6
            java.lang.String r6 = r11.getString(r4)     // Catch:{ Exception -> 0x0302 }
            r20 = r11
            java.lang.String r11 = "find video mime : %s"
            r21 = r3
            r3 = 1
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02e9 }
            r3 = 0
            r7[r3] = r6     // Catch:{ Exception -> 0x02e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r7)     // Catch:{ Exception -> 0x02e9 }
            if (r6 != 0) goto L_0x025c
            goto L_0x027b
        L_0x025c:
            java.lang.String r3 = "video/"
            boolean r3 = r6.startsWith(r3)     // Catch:{ Exception -> 0x02e9 }
            if (r3 == 0) goto L_0x026a
            if (r16 != 0) goto L_0x0276
            r16 = r20
            goto L_0x0276
        L_0x026a:
            java.lang.String r3 = "audio/"
            boolean r3 = r6.startsWith(r3)     // Catch:{ Exception -> 0x02e9 }
            if (r3 == 0) goto L_0x0276
            if (r17 != 0) goto L_0x0276
            r17 = r20
        L_0x0276:
            if (r17 == 0) goto L_0x027b
            if (r16 == 0) goto L_0x027b
            goto L_0x028a
        L_0x027b:
            int r1 = r1 + 1
            r7 = r22
            r11 = r23
            r6 = r19
            r3 = r21
            goto L_0x0227
        L_0x0286:
            r21 = r3
            r19 = r6
        L_0x028a:
            r1 = r16
            r3 = r17
            if (r1 == 0) goto L_0x02eb
            boolean r6 = r1.containsKey(r14)     // Catch:{ Exception -> 0x02e9 }
            if (r6 != 0) goto L_0x0297
            goto L_0x029f
        L_0x0297:
            long r6 = r1.getLong(r14)     // Catch:{ Exception -> 0x02e9 }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r16
        L_0x029f:
            boolean r6 = r1.containsKey(r13)     // Catch:{ Exception -> 0x02e9 }
            if (r6 != 0) goto L_0x02a7
            r6 = 0
            goto L_0x02ab
        L_0x02a7:
            int r6 = r1.getInteger(r13)     // Catch:{ Exception -> 0x02e9 }
        L_0x02ab:
            r10.f192521d = r6     // Catch:{ Exception -> 0x02e9 }
            boolean r6 = r1.containsKey(r12)     // Catch:{ Exception -> 0x02e9 }
            if (r6 != 0) goto L_0x02b5
            r6 = 0
            goto L_0x02b9
        L_0x02b5:
            int r6 = r1.getInteger(r12)     // Catch:{ Exception -> 0x02e9 }
        L_0x02b9:
            r10.f192522e = r6     // Catch:{ Exception -> 0x02e9 }
            boolean r6 = r1.containsKey(r4)     // Catch:{ Exception -> 0x02e9 }
            if (r6 != 0) goto L_0x02c4
            r6 = r19
            goto L_0x02c8
        L_0x02c4:
            java.lang.String r6 = r1.getString(r4)     // Catch:{ Exception -> 0x02e9 }
        L_0x02c8:
            r10.f192519b = r6     // Catch:{ Exception -> 0x02e9 }
            boolean r6 = r1.containsKey(r9)     // Catch:{ Exception -> 0x02e9 }
            if (r6 != 0) goto L_0x02d1
            goto L_0x02d4
        L_0x02d1:
            r1.getInteger(r9)     // Catch:{ Exception -> 0x02e9 }
        L_0x02d4:
            boolean r6 = r1.containsKey(r8)     // Catch:{ Exception -> 0x02e9 }
            if (r6 != 0) goto L_0x02db
            goto L_0x02de
        L_0x02db:
            r1.getInteger(r8)     // Catch:{ Exception -> 0x02e9 }
        L_0x02de:
            boolean r6 = r1.containsKey(r0)     // Catch:{ Exception -> 0x02e9 }
            if (r6 != 0) goto L_0x02e5
            goto L_0x02eb
        L_0x02e5:
            r1.getInteger(r0)     // Catch:{ Exception -> 0x02e9 }
            goto L_0x02eb
        L_0x02e9:
            r0 = move-exception
            goto L_0x0305
        L_0x02eb:
            if (r3 == 0) goto L_0x0317
            boolean r0 = r3.containsKey(r4)     // Catch:{ Exception -> 0x02e9 }
            if (r0 != 0) goto L_0x02f6
            r6 = r19
            goto L_0x02fa
        L_0x02f6:
            java.lang.String r6 = r3.getString(r4)     // Catch:{ Exception -> 0x02e9 }
        L_0x02fa:
            r10.f192520c = r6     // Catch:{ Exception -> 0x02e9 }
            goto L_0x0317
        L_0x02fd:
            r0 = move-exception
            r7 = r22
            goto L_0x0467
        L_0x0302:
            r0 = move-exception
            r21 = r3
        L_0x0305:
            java.lang.String r1 = "Video extractor init failed. video path = [%s] e = [%s]"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x02fd }
            r3 = 0
            r4[r3] = r2     // Catch:{ all -> 0x02fd }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02fd }
            r2 = 1
            r4[r2] = r0     // Catch:{ all -> 0x02fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r4)     // Catch:{ all -> 0x02fd }
        L_0x0317:
            r15.mo161388g()
            int r0 = r10.f192522e
            if (r0 <= 0) goto L_0x0337
            int r1 = r10.f192521d
            if (r1 <= 0) goto L_0x0337
            float r2 = (float) r0
            float r1 = (float) r1
            float r2 = r2 / r1
            r1 = 1077936128(0x40400000, float:3.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0337
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0332
            goto L_0x0337
        L_0x0332:
            r1 = 0
            r3 = 1
            r18 = 0
            goto L_0x0351
        L_0x0337:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r2[r1] = r0
            int r0 = r10.f192521d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "check ratio faild width = [%d], height = [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r2)
            r18 = 1
        L_0x0351:
            if (r18 != 0) goto L_0x0442
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r10
            java.lang.String r1 = "checkFormat() called with: item = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r1, r0)
            java.lang.String r0 = "audio/mp4a-latm"
            java.lang.String r1 = r10.f192518a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0421
            java.lang.String r1 = r10.f192518a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x0370
            goto L_0x0400
        L_0x0370:
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            if (r2 != 0) goto L_0x03da
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            ad0.C67025g.f192517a = r2
            java.lang.String r3 = ".h264"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".h26l"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".264"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".avc"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".mov"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".mp4"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".m4a"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".3gp"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".3g2"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".mj2"
            r2.add(r3)
            java.util.Set<java.lang.String> r2 = ad0.C67025g.f192517a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r3 = ".m4v"
            r2.add(r3)
        L_0x03da:
            java.lang.String r1 = r1.trim()
            java.lang.String r2 = "."
            int r2 = r1.lastIndexOf(r2)
            if (r2 < 0) goto L_0x0400
            int r3 = r1.length()
            if (r2 < r3) goto L_0x03ed
            goto L_0x0400
        L_0x03ed:
            java.util.Set<java.lang.String> r3 = ad0.C67025g.f192517a
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r1 = r1.toLowerCase()
            java.util.HashSet r3 = (java.util.HashSet) r3
            boolean r1 = r3.contains(r1)
            r2 = 1
            r1 = r1 ^ r2
            goto L_0x0401
        L_0x0400:
            r1 = 1
        L_0x0401:
            if (r1 != 0) goto L_0x0421
            java.lang.String r1 = r10.f192519b
            java.lang.String r2 = "video/avc"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0421
            java.lang.String r1 = r10.f192520c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x041f
            java.lang.String r1 = r10.f192520c
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x041f
            goto L_0x0421
        L_0x041f:
            r0 = 0
            goto L_0x043d
        L_0x0421:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r10.f192519b
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "check video format failed, dst format [video/avc], video format [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r0
            java.lang.String r0 = r10.f192520c
            r2[r1] = r0
            java.lang.String r0 = "check video format failed, dst audioTrackMime [%s], video audioTrackMime [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r2)
            r0 = 1
        L_0x043d:
            if (r0 == 0) goto L_0x0440
            goto L_0x0442
        L_0x0440:
            r0 = 0
            goto L_0x0443
        L_0x0442:
            r0 = 1
        L_0x0443:
            if (r0 == 0) goto L_0x045d
            android.content.Intent r0 = r22.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1 = -5
            com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs r0 = com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84995a(r0, r1)
            r1 = 0
            r2 = 1
            r7 = r22
            com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84997c(r7, r0, r2, r1)
            r22.finish()
            goto L_0x0480
        L_0x045d:
            r2 = 1
            r3 = 0
            r7 = r22
            r1 = r21
            r7.mo119872P7(r2, r1, r3)
            goto L_0x0480
        L_0x0467:
            r15.mo161388g()
            throw r0
        L_0x046b:
            android.content.Intent r0 = r22.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1 = -5
            com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs r0 = com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84995a(r0, r1)
            r1 = 0
            r2 = 1
            com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84997c(r7, r0, r2, r1)
            r22.finish()
        L_0x0480:
            return
        L_0x0481:
            r19 = r6
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r0 = r0.filePath
            r1.putExtra(r15, r0)
            r0 = r19
            r1.putExtra(r14, r0)
            r2 = 2
            ke3.C88144b.m109795m(r7, r13, r9, r1, r2)
            goto L_0x04de
        L_0x0497:
            r1 = r3
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r7.f250365g
            int r2 = r2.getType()
            r3 = 76
            if (r2 != r3) goto L_0x04c5
            java.lang.String r0 = "alvinluo sendMessageToWx shareMusicVideo to timeline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r7.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject r0 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject) r0
            java.lang.String r0 = r0.hdAlbumThumbFilePath
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x04bf
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$e r1 = new com.tencent.mm.ui.transmit.SendAppMessageWrapperUI$e
            r1.<init>()
            r2 = 0
            r7.mo119876T7(r0, r2, r1)
            goto L_0x04de
        L_0x04bf:
            r2 = 0
            r3 = 1
            r7.mo119872P7(r3, r3, r2)
            goto L_0x04de
        L_0x04c5:
            r2 = 0
            r3 = 1
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r7.f250365g
            int r4 = r4.getType()
            r6 = 101(0x65, float:1.42E-43)
            if (r4 != r6) goto L_0x04db
            java.lang.String r1 = "sendMessageToWx gamesharecard to timeline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            r7.mo119872P7(r3, r3, r0)
            goto L_0x04de
        L_0x04db:
            r7.mo119872P7(r3, r1, r2)
        L_0x04de:
            return
        L_0x04df:
            r0 = r6
            r3 = 1
            if (r9 != r8) goto L_0x05a1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r7.f250365g
            int r3 = r3.getType()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "handleSendStatus type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r1)
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject r1 = r2.sceneDataObject
            r2 = r1
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject r2 = (com.tencent.p014mm.opensdk.modelmsg.WXStateSceneDataObject) r2
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = r7.f250365g
            int r1 = r1.getType()
            r3 = 76
            if (r1 != r3) goto L_0x051a
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r7.f250365g
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r1 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject r1 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject) r1
            java.lang.String r1 = r1.hdAlbumThumbFilePath
            byte[] r0 = r0.thumbData
            rn3.n0 r3 = new rn3.n0
            r3.<init>(r7, r2)
            r7.mo119876T7(r1, r0, r3)
            goto L_0x05a0
        L_0x051a:
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo r1 = r2.stateJumpInfo
            boolean r3 = r1 instanceof com.tencent.p014mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo
            if (r3 == 0) goto L_0x0560
            com.tencent.mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo r1 = (com.tencent.p014mm.opensdk.modelmsg.WXStateJumpMiniProgramInfo) r1
            java.lang.String r3 = r1.username
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0556
            rn3.o0 r0 = new rn3.o0
            r0.<init>(r7)
            r7.mo119875S7(r0)
            java.lang.Class<kr0.w0> r0 = kr0.C76629w0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.w0 r0 = (kr0.C76629w0) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.username
            r3.append(r1)
            java.lang.String r1 = "@app"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            rn3.p0 r3 = new rn3.p0
            r3.<init>(r7, r2)
            r0.mo106884tG(r1, r3)
            goto L_0x05a0
        L_0x0556:
            r5 = 1
            r3 = 0
            r4 = 0
            r1 = r22
            r6 = r0
            r1.mo119871O7(r2, r3, r4, r5, r6)
            goto L_0x05a0
        L_0x0560:
            boolean r3 = r1 instanceof com.tencent.p014mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo
            if (r3 == 0) goto L_0x0597
            com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo r1 = (com.tencent.p014mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo) r1
            java.lang.String r3 = r1.username
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x058d
            rn3.q0 r0 = new rn3.q0
            r0.<init>(r7)
            r7.mo119875S7(r0)
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.u3 r0 = r0.fi0()
            java.lang.String r3 = r1.username
            rn3.r0 r4 = new rn3.r0
            r4.<init>(r7, r1, r2)
            r0.mo83753d(r3, r4)
            goto L_0x05a0
        L_0x058d:
            r5 = 1
            r3 = 0
            r4 = 0
            r1 = r22
            r6 = r0
            r1.mo119871O7(r2, r3, r4, r5, r6)
            goto L_0x05a0
        L_0x0597:
            r5 = 0
            r3 = 0
            r4 = 0
            r1 = r22
            r6 = r0
            r1.mo119871O7(r2, r3, r4, r5, r6)
        L_0x05a0:
            return
        L_0x05a1:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r7.f250381z
            r1 = 100
            r0.startTimer(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f250369n) {
            Log.m105918d("MicroMsg.SendAppMessageWrapperUI", "restore orientation");
            SharedPreferences sharedPreferences = getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
            setRequestedOrientation(1);
            sharedPreferences.edit().putBoolean("settings_landscape_mode", false).commit();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        hideVKB();
        return super.onTouchEvent(motionEvent);
    }
}
