package com.tencent.p014mm.plugin.masssend.p076ui;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$o1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$p1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f12.C7970a;
import h81.C32735h;
import hd0.C76152m;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import hh2.C8532a;
import i72.C98608f;
import i72.C98610m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import kj2.C117407d;
import nc0.C76850a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p140cw.C7138g;
import p214om.C11502f;
import p447aw.C103918d;
import p629ny.C76979h;
import p682rz.C101488s;
import p682rz.C36594q;
import p823sg.C101614i;
import p910lj.C76701a;
import qo3.C77398g;
import qo3.C89779i0;
import te3.C101783gu2;
import te3.C52023xu2;
import w52.C38023l;
import w52.C78517d;
import w52.C78519i;
import wc3.C15141z;
import y52.C53497h;
import y52.C79043b;
import y52.C79051d;
import y52.C79052e;
import y52.C79054f;
import y52.C79055g;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI */
public class MassSendMsgUI extends MMActivity implements C11385n {

    /* renamed from: r */
    public static String f201430r = "";

    /* renamed from: d */
    public List<String> f201431d;

    /* renamed from: e */
    public String f201432e;

    /* renamed from: f */
    public ChatFooter f201433f;

    /* renamed from: g */
    public String f201434g;

    /* renamed from: h */
    public TextView f201435h;

    /* renamed from: i */
    public TextView f201436i;

    /* renamed from: j */
    public C89779i0 f201437j = null;

    /* renamed from: n */
    public boolean f201438n = false;

    /* renamed from: o */
    public C77398g f201439o;

    /* renamed from: p */
    public C79043b f201440p;

    /* renamed from: q */
    public AppPanel.C72752g f201441q = new C69817h();

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$b */
    public class C69808b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f201442d;

        public C69808b(Intent intent) {
            this.f201442d = intent;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            Intent intent = this.f201442d;
            String str = MassSendMsgUI.f201430r;
            massSendMsgUI.mo96027L7(intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$c */
    public class C69809c implements DialogInterface.OnClickListener {
        public C69809c(MassSendMsgUI massSendMsgUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$d */
    public class C69810d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C76152m f201444d;

        public C69810d(MassSendMsgUI massSendMsgUI, C76152m mVar) {
            this.f201444d = mVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f201444d.f223056b = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e */
    public class C69811e implements C76152m.C76154b {

        /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e$a */
        public class C69812a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f201446d;

            /* renamed from: e */
            public final /* synthetic */ String f201447e;

            /* renamed from: f */
            public final /* synthetic */ int f201448f;

            /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e$a$a */
            public class C69813a implements Runnable {
                public C69813a() {
                }

                public void run() {
                    C69812a aVar = C69812a.this;
                    MassSendMsgUI.m82231H7(MassSendMsgUI.this, aVar.f201446d, aVar.f201448f);
                }
            }

            /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e$a$b */
            public class C69814b implements Runnable {
                public C69814b() {
                }

                public void run() {
                    MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
                    C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.ka_), 0).show();
                    C89779i0 i0Var = MassSendMsgUI.this.f201437j;
                    if (i0Var != null) {
                        i0Var.dismiss();
                        MassSendMsgUI.this.f201437j = null;
                    }
                }
            }

            public C69812a(String str, String str2, int i) {
                this.f201446d = str;
                this.f201447e = str2;
                this.f201448f = i;
            }

            /* JADX WARNING: Removed duplicated region for block: B:53:0x020d  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x0216  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r31 = this;
                    r1 = r31
                    com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e r0 = com.tencent.p014mm.plugin.masssend.p076ui.MassSendMsgUI.C69811e.this
                    com.tencent.mm.plugin.masssend.ui.MassSendMsgUI r0 = com.tencent.p014mm.plugin.masssend.p076ui.MassSendMsgUI.this
                    java.lang.String r2 = r1.f201446d
                    java.lang.String r10 = r1.f201447e
                    java.lang.String r3 = com.tencent.p014mm.plugin.masssend.p076ui.MassSendMsgUI.f201430r
                    r0.getClass()
                    java.lang.Class<rz.s> r18 = p682rz.C101488s.class
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
                    if (r3 == 0) goto L_0x001c
                    r4 = 10485760(0xa00000, float:1.469368E-38)
                    r6 = 10485760(0xa00000, float:1.469368E-38)
                    goto L_0x0020
                L_0x001c:
                    r4 = 26214400(0x1900000, float:5.2897246E-38)
                    r6 = 26214400(0x1900000, float:5.2897246E-38)
                L_0x0020:
                    if (r3 == 0) goto L_0x0028
                    r3 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
                    goto L_0x002d
                L_0x0028:
                    r3 = 4688897573220515840(0x41124f8000000000, double:300000.0)
                L_0x002d:
                    r7 = r3
                    r9 = 1000000(0xf4240, float:1.401298E-39)
                    r4 = 660(0x294, float:9.25E-43)
                    r5 = 500(0x1f4, float:7.0E-43)
                    r3 = r10
                    int r3 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.shouldRemuxingVFS(r3, r4, r5, r6, r7, r9)
                    r15 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r15]
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                    r14 = 0
                    r4[r14] = r5
                    java.lang.String r13 = "MicroMsg.MassSendMsgUI"
                    java.lang.String r5 = "check remuxing, ret %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r5, r4)
                    r12 = 4
                    r11 = 3
                    r9 = 2
                    if (r3 == 0) goto L_0x0072
                    if (r3 == r15) goto L_0x005d
                    if (r3 == r9) goto L_0x005d
                    if (r3 == r11) goto L_0x005d
                    if (r3 == r12) goto L_0x005d
                    r4 = 5
                    if (r3 == r4) goto L_0x005d
                    goto L_0x019e
                L_0x005d:
                    di3.d r3 = di3.C86312j.m106911c(r18)
                    rz.s r3 = (p682rz.C101488s) r3
                    rz.t r3 = r3.Kj0()
                    hd0.o0 r3 = (hd0.C98410o0) r3
                    java.lang.String r2 = r3.mo137728q(r2)
                    r0.mo96026K7(r15, r2)
                    goto L_0x020b
                L_0x0072:
                    di3.d r3 = di3.C86312j.m106911c(r18)
                    rz.s r3 = (p682rz.C101488s) r3
                    rz.t r3 = r3.Kj0()
                    hd0.o0 r3 = (hd0.C98410o0) r3
                    java.lang.String r8 = r3.mo137728q(r2)
                    oj.c r7 = new oj.c
                    r7.<init>()
                    r7.setDataSource(r10)
                    java.lang.Object[] r3 = new java.lang.Object[r15]
                    r3[r14] = r8
                    java.lang.String r4 = "start remux, targetPath: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r4, r3)
                    r3 = 18
                    java.lang.String r3 = r7.extractMetadata(r3)
                    int r16 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r14)
                    r3 = 19
                    java.lang.String r3 = r7.extractMetadata(r3)
                    int r17 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r14)
                    com.tencent.mm.modelcontrol.VideoTransPara r6 = new com.tencent.mm.modelcontrol.VideoTransPara
                    r6.<init>()
                    com.tencent.mm.pointers.PInt r5 = new com.tencent.mm.pointers.PInt
                    r5.<init>()
                    com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
                    r4.<init>()
                    com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
                    r3.<init>()
                    com.tencent.mm.pointers.PInt r12 = new com.tencent.mm.pointers.PInt
                    r12.<init>()
                    com.tencent.mm.pointers.PInt r11 = new com.tencent.mm.pointers.PInt
                    r11.<init>()
                    java.lang.Class<dy.f> r21 = p500dy.C97560f.class
                    di3.d r21 = di3.C86312j.m106911c(r21)
                    dy.f r21 = (p500dy.C97560f) r21
                    r22 = r3
                    r3 = r21
                    r21 = r4
                    r4 = r10
                    r23 = r5
                    r15 = r6
                    r6 = r21
                    r25 = r7
                    r7 = r22
                    r26 = r8
                    r8 = r12
                    r14 = 2
                    r9 = r11
                    r3.mo136826xX(r4, r5, r6, r7, r8, r9)
                    r3 = r23
                    int r3 = r3.value
                    int r3 = r3 / 1000
                    r15.f267170h = r3
                    r3 = r21
                    int r3 = r3.value
                    r15.f267166d = r3
                    r3 = r22
                    int r3 = r3.value
                    r15.f267167e = r3
                    int r3 = r12.value
                    r15.f267168f = r3
                    int r3 = r11.value
                    r15.f267169g = r3
                    xb0.h r3 = xb0.C102609h.Fx0()
                    r4 = 0
                    com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.Ex0(r15, r4)
                    int r4 = com.tencent.p014mm.plugin.sight.base.C85457c.f249058c
                    java.lang.Object[] r5 = new java.lang.Object[r14]
                    r21 = 0
                    r5[r21] = r15
                    r15 = 1
                    r5[r15] = r3
                    java.lang.String r6 = "check remuxing old para %s, newPara: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r6, r5)
                    if (r3 != 0) goto L_0x0153
                    r5 = r16
                    r6 = r17
                    r3 = 0
                    r11 = 3
                L_0x0123:
                    if (r3 >= r11) goto L_0x014d
                    int r7 = r5 % 2
                    if (r7 == 0) goto L_0x012b
                    int r5 = r5 + -1
                L_0x012b:
                    int r7 = r6 % 2
                    if (r7 == 0) goto L_0x0131
                    int r6 = r6 + -1
                L_0x0131:
                    r7 = 480(0x1e0, float:6.73E-43)
                    r8 = 640(0x280, float:8.97E-43)
                    if (r5 < r6) goto L_0x013b
                    if (r5 <= r8) goto L_0x0141
                    if (r6 <= r7) goto L_0x0141
                L_0x013b:
                    if (r5 > r6) goto L_0x0146
                    if (r5 <= r7) goto L_0x0141
                    if (r6 > r8) goto L_0x0146
                L_0x0141:
                    r16 = r5
                    r17 = r6
                    goto L_0x014d
                L_0x0146:
                    int r5 = r5 / 2
                    int r6 = r6 / 2
                    int r3 = r3 + 1
                    goto L_0x0123
                L_0x014d:
                    r7 = r4
                    r20 = r16
                    r22 = r17
                    goto L_0x015f
                L_0x0153:
                    r11 = 3
                    int r4 = r3.f267166d
                    int r5 = r3.f267167e
                    int r3 = r3.f267169g
                    r7 = r3
                    r20 = r4
                    r22 = r5
                L_0x015f:
                    r25.release()
                    int r8 = com.tencent.p014mm.plugin.sight.base.C85457c.f249057b
                    r9 = 8
                    r12 = 2
                    r16 = 1103626240(0x41c80000, float:25.0)
                    float r17 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r27 = 0
                    r28 = 51
                    r3 = r10
                    r4 = r26
                    r5 = r20
                    r6 = r22
                    r10 = r12
                    r29 = 3
                    r11 = r16
                    r12 = r17
                    r30 = r13
                    r13 = r23
                    r19 = 2
                    r14 = r24
                    r15 = r25
                    r16 = r27
                    r17 = r28
                    int r3 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.remuxingVFS(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                    if (r3 >= 0) goto L_0x01a0
                    java.lang.String r0 = "remuxing video error"
                    r4 = r30
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
                L_0x019e:
                    r15 = 0
                    goto L_0x020b
                L_0x01a0:
                    r5 = r26
                    r4 = r30
                    r6 = 1
                    r0.mo96026K7(r6, r5)
                    di3.d r0 = di3.C86312j.m106911c(r18)
                    rz.s r0 = (p682rz.C101488s) r0
                    rz.t r0 = r0.Kj0()
                    hd0.o0 r0 = (hd0.C98410o0) r0
                    java.lang.String r0 = r0.mo137729r(r2)
                    boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                    if (r2 != 0) goto L_0x01ed
                    java.lang.Object[] r2 = new java.lang.Object[r6]
                    r7 = 0
                    r2[r7] = r0
                    java.lang.String r8 = "thumb not exist create one, thumbPath: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r2)
                    android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createVideoThumbnail(r5, r6)     // Catch:{ Exception -> 0x01d7 }
                    if (r2 == 0) goto L_0x01ee
                    r8 = 60
                    android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x01d7 }
                    com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r2, r8, r9, r0, r6)     // Catch:{ Exception -> 0x01d7 }
                    goto L_0x01ee
                L_0x01d7:
                    r0 = move-exception
                    java.lang.Object[] r2 = new java.lang.Object[r7]
                    java.lang.String r8 = ""
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r8, r2)
                    java.lang.Object[] r2 = new java.lang.Object[r6]
                    java.lang.String r0 = r0.getMessage()
                    r2[r7] = r0
                    java.lang.String r0 = "create thumb error: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
                    goto L_0x01ee
                L_0x01ed:
                    r7 = 0
                L_0x01ee:
                    r2 = 4
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r0[r7] = r5
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
                    r0[r6] = r2
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
                    r0[r19] = r2
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                    r0[r29] = r2
                    java.lang.String r2 = "do remux, targetPath: %s, outputWidth: %s, outputHeight: %s, retDuration: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
                    r15 = 1
                L_0x020b:
                    if (r15 == 0) goto L_0x0216
                    com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e$a$a r0 = new com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e$a$a
                    r0.<init>()
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
                    goto L_0x021e
                L_0x0216:
                    com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e$a$b r0 = new com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$e$a$b
                    r0.<init>()
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
                L_0x021e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.masssend.p076ui.MassSendMsgUI.C69811e.C69812a.run():void");
            }
        }

        public C69811e() {
        }

        /* renamed from: a */
        public void mo96034a(int i, String str, String str2, String str3, int i2) {
            Log.m105919d("MicroMsg.MassSendMsgUI", "onImportFinish, ret: %s, fileName: %s, importPath: %s", Integer.valueOf(i), str, str3);
            if (i >= 0 || i == -50002) {
                ThreadPool.post(new C69812a(str, str3, i2), "MassSend_Remux");
                return;
            }
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.ka9), 0).show();
            C89779i0 i0Var = MassSendMsgUI.this.f201437j;
            if (i0Var != null) {
                i0Var.dismiss();
                MassSendMsgUI.this.f201437j = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$f */
    public class C69815f implements DialogInterface.OnClickListener {
        public C69815f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MassSendMsgUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$g */
    public class C69816g implements MenuItem.OnMenuItemClickListener {
        public C69816g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MassSendMsgUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$h */
    public class C69817h implements AppPanel.C72752g {
        public C69817h() {
        }

        /* renamed from: I */
        public void mo96040I() {
        }

        /* renamed from: a */
        public void mo96041a() {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.gpa), 0).show();
        }

        /* renamed from: b */
        public void mo96042b() {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.gps), 0).show();
        }

        /* renamed from: c */
        public void mo96043c(int i) {
            if (i == 0) {
                Uri n = C116299g2.m163858n(C112760b.m154240l());
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                    if (!(!l2.mo177810a() ? false : l2.f348991a.mo119937g(l2.f348992b))) {
                        MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
                        C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.f360273bc2), 1).show();
                        return;
                    }
                }
                boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(MassSendMsgUI.this.getContext(), "android.permission.CAMERA", 16, "", "");
                Log.m105925i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), MassSendMsgUI.this.getContext());
                if (z1) {
                    MassSendMsgUI massSendMsgUI2 = MassSendMsgUI.this;
                    String str = MassSendMsgUI.f201430r;
                    massSendMsgUI2.mo96030O7();
                }
            } else if (i == 1) {
                ((C7138g) C86312j.m106911c(C7138g.class)).mo8324nq(MassSendMsgUI.this, 1, 1, 3, 3, false, (Intent) null);
            }
        }

        /* renamed from: d */
        public void mo96044d() {
        }

        /* renamed from: e */
        public void mo96045e(int i) {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            String str = MassSendMsgUI.f201430r;
            massSendMsgUI.getClass();
            Class cls = C32735h.class;
            Class cls2 = C101488s.class;
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(massSendMsgUI, "android.permission.CAMERA", 18, "", "");
            MMStack stack = Util.getStack();
            Boolean bool = Boolean.TRUE;
            Log.m105925i("MicroMsg.MassSendMsgUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), stack, massSendMsgUI);
            if (z1) {
                C115669n.INSTANCE.mo160131h(13822, 1, 1);
                SightParams sightParams = new SightParams(1, i);
                String str2 = massSendMsgUI.f201432e;
                C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
                String a = C98426q0.m127793a(str2);
                String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls2)).Kj0()).mo137728q(a);
                String r = ((C98410o0) ((C101488s) C86312j.m106911c(cls2)).Kj0()).mo137729r(a);
                VideoTransPara videoTransPara = sightParams.f248452f;
                RecordConfigProvider f = RecordConfigProvider.m119436f(q, r, videoTransPara, videoTransPara.f267170h * 1000, 1);
                if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_c2c_ignore_remux_without_edit, false)) {
                    f.f272919d = 2;
                }
                boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_jump_to_record_media, true);
                UICustomParam uICustomParam = new UICustomParam();
                ((HashMap) uICustomParam.f266575h).put("plugin_filter", bool);
                ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
                ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
                ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
                f.f272927o = uICustomParam;
                if (wf) {
                    C8532a.f27585a.mo9445d(massSendMsgUI, 9, C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh, f, 0);
                    return;
                }
                C96892t1.m124467g(massSendMsgUI, 8, new Intent(), 1, massSendMsgUI.f201432e, 0, "");
            }
        }

        /* renamed from: f */
        public void mo96046f() {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.gpk), 0).show();
        }

        /* renamed from: g */
        public void mo96047g() {
        }

        /* renamed from: h */
        public void mo96048h() {
            C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            ((C67654r1) yM).getClass();
            C88144b.m109791i(massSendMsgUI, "subapp", ".ui.openapi.AddAppUI", new Intent(), (Bundle) null);
        }

        /* renamed from: i */
        public void mo96049i() {
        }

        /* renamed from: j */
        public void mo96050j(C44561j jVar) {
        }

        /* renamed from: k */
        public void mo96051k() {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.gpj), 0).show();
        }

        /* renamed from: l */
        public void mo96052l() {
        }

        /* renamed from: m */
        public void mo96053m(int i, long j) {
        }

        /* renamed from: n */
        public void mo96054n() {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.gpa), 0).show();
        }

        /* renamed from: o */
        public void mo96055o() {
            Intent intent = new Intent();
            intent.putExtra("preceding_scence", 13);
            C88144b.m109791i(MassSendMsgUI.this, "emoji", ".ui.v2.EmojiStoreV2UI", intent, (Bundle) null);
        }

        /* renamed from: p */
        public void mo96056p() {
        }

        /* renamed from: q */
        public void mo96057q() {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.gpa), 0).show();
        }

        /* renamed from: r */
        public void mo96058r() {
        }

        /* renamed from: s */
        public void mo96059s() {
            MassSendMsgUI massSendMsgUI = MassSendMsgUI.this;
            C76701a.makeText((Context) massSendMsgUI, (CharSequence) massSendMsgUI.getString(C0966R.string.gpq), 0).show();
        }

        /* renamed from: t */
        public void mo96060t() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$i */
    public class C69818i implements DialogInterface.OnClickListener {
        public C69818i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(MassSendMsgUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$j */
    public class C69819j implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C78519i f201456d;

        public C69819j(MassSendMsgUI massSendMsgUI, C78519i iVar) {
            this.f201456d = iVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f201456d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$k */
    public class C69820k implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C78519i f201457d;

        public C69820k(MassSendMsgUI massSendMsgUI, C78519i iVar) {
            this.f201457d = iVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f201457d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$l */
    public class C69821l implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C76152m f201458d;

        public C69821l(MassSendMsgUI massSendMsgUI, C76152m mVar) {
            this.f201458d = mVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f201458d.f223056b = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$a */
    public class C69822a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f201459d;

        /* renamed from: e */
        public final /* synthetic */ int f201460e;

        /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$a$a */
        public class C69823a implements C98608f {
            public C69823a(C69822a aVar) {
            }

            /* renamed from: a */
            public boolean mo96066a() {
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$a$b */
        public class C69824b implements C98608f {
            public C69824b(C69822a aVar) {
            }

            /* renamed from: a */
            public boolean mo96066a() {
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendMsgUI$a$c */
        public class C69825c implements Runnable {
            public C69825c() {
            }

            public void run() {
                C69822a aVar = C69822a.this;
                MassSendMsgUI.m82231H7(MassSendMsgUI.this, aVar.f201459d, aVar.f201460e);
            }
        }

        public C69822a(String str, int i) {
            this.f201459d = str;
            this.f201460e = i;
        }

        public void run() {
            VideoTransPara Xa = ((C36594q) C86312j.m106911c(C36594q.class)).mo60734Xa();
            C101783gu2 gu22 = new C101783gu2();
            gu22.f298309e = true;
            if (C98610m.m128210a(this.f201459d, Xa, gu22, new C69823a(this))) {
                C98610m.m128211b(this.f201459d, Xa, gu22, new C69824b(this));
            }
            MMHandlerThread.postToMainThread(new C69825c());
        }
    }

    /* renamed from: H7 */
    public static void m82231H7(MassSendMsgUI massSendMsgUI, String str, int i) {
        massSendMsgUI.getClass();
        C78517d dVar = new C78517d();
        dVar.f229981g = massSendMsgUI.f201432e;
        dVar.f229982h = massSendMsgUI.f201431d.size();
        dVar.f229979e = str;
        dVar.f229984j = i;
        dVar.f229989o = 2;
        dVar.f229983i = 43;
        C78519i iVar = new C78519i(dVar, massSendMsgUI.f201438n, 0);
        C97625j3.m125815e().mo123460f(iVar);
        C89779i0 i0Var = massSendMsgUI.f201437j;
        if (i0Var != null && i0Var.isShowing()) {
            massSendMsgUI.f201437j.setOnCancelListener(new C79051d(massSendMsgUI, iVar));
        }
    }

    /* renamed from: I7 */
    public final void mo96024I7(Intent intent) {
        String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        if (stringExtra != null) {
            boolean a = C75592q0.m90771a(stringExtra, (String) null, intent.getBooleanExtra("CropImage_Compress_Img", true));
            C78517d jo = C38023l.wx0().mo108477jo(stringExtra, this.f201432e, this.f201431d.size(), a ? 1 : 0);
            if (jo != null) {
                C78519i iVar = new C78519i(jo, this.f201438n, a);
                C97625j3.m125815e().mo123460f(iVar);
                this.f201437j = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.ilx), true, true, new C69820k(this, iVar));
            }
        }
    }

    /* renamed from: J7 */
    public final void mo96025J7(Intent intent) {
        String stringExtra = intent.getStringExtra("VideoRecorder_FileName");
        int intExtra = intent.getIntExtra("VideoRecorder_VideoLength", 0);
        C78517d dVar = new C78517d();
        dVar.f229981g = this.f201432e;
        dVar.f229982h = this.f201431d.size();
        dVar.f229979e = stringExtra;
        dVar.f229984j = intExtra;
        dVar.f229983i = 43;
        C78519i iVar = new C78519i(dVar, this.f201438n, 0);
        C97625j3.m125815e().mo123460f(iVar);
        this.f201437j = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.ilx), true, true, new C69819j(this, iVar));
    }

    /* renamed from: K7 */
    public final void mo96026K7(boolean z, String str) {
        int i;
        int i2;
        int i3;
        if (z) {
            i3 = WXWebReporter.KEY_NEW_FAILED_CANT_FIX;
            i2 = 247;
            i = 255;
        } else {
            i3 = 233;
            i2 = 234;
            i = 242;
        }
        long l = C86013q1.m106451l(str) / 1024;
        int[] iArr = {512, 1024, 2048, 5120, 8192, Task.EXTRAS_LIMIT_BYTES, 15360, 20480};
        C115669n nVar = C115669n.INSTANCE;
        int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s((int) l, iArr, i2, i));
        C115669n nVar2 = C115669n.INSTANCE;
        nVar2.idkeyStat(106, (long) nullAsNil, 1, false);
        nVar2.idkeyStat(106, (long) i3, 1, false);
        Log.m105918d("MicroMsg.MassSendMsgUI", "report video size res : " + nullAsNil + " hadCompress : " + z + " fileLen : " + l + "K");
    }

    /* renamed from: L7 */
    public final void mo96027L7(Intent intent) {
        C76152m mVar = new C76152m();
        this.f201437j = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C69810d(this, mVar));
        mVar.mo106353a(this, intent, this.f201432e, false, new C69811e());
    }

    /* renamed from: M7 */
    public final void mo96028M7(String str, int i) {
        this.f201437j = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C69821l(this, new C76152m()));
        ThreadPool.post(new C69822a(str, i), "MassSend_Remux");
    }

    /* renamed from: N7 */
    public final void mo96029N7(Intent intent) {
        if (!C114786m0.m161568a(this)) {
            C76879j.m92743n(this, C0966R.string.kaa, C0966R.string.a3h, new C69808b(intent), new C69809c(this));
        } else {
            mo96027L7(intent);
        }
    }

    /* renamed from: O7 */
    public final void mo96030O7() {
        String l = C112760b.m154240l();
        if (!((C7138g) C86312j.m106911c(C7138g.class)).Gl0(this, l, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.ik5), 1).show();
        }
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.f358722ng1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bb8;
    }

    public void initView() {
        SpannableString spannableString;
        setMMTitle((int) C0966R.string.gpl);
        this.f201435h = (TextView) findViewById(C0966R.C0970id.gpf);
        this.f201436i = (TextView) findViewById(C0966R.C0970id.gpe);
        TextView textView = this.f201435h;
        int textSize = (int) textView.getTextSize();
        if (this.f201431d == null) {
            spannableString = new SpannableString("");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.f201431d.size(); i++) {
                String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f201431d.get(i));
                if (i == this.f201431d.size() - 1) {
                    sb.append(displayName);
                } else {
                    sb.append(displayName + ",  ");
                }
            }
            spannableString = ((C76979h) C86312j.m106911c(C76979h.class)).op0(this, sb.toString(), textSize);
        }
        textView.setText(spannableString);
        this.f201436i.setText(getResources().getQuantityString(C0966R.plurals.f7239u, this.f201431d.size(), new Object[]{Integer.valueOf(this.f201431d.size())}));
        this.f201433f = (ChatFooter) findViewById(C0966R.C0970id.h_g);
        MassSendLayout massSendLayout = (MassSendLayout) findViewById(C0966R.C0970id.gpj);
        massSendLayout.setPanel(this.f201433f.getPanel());
        massSendLayout.setChatFooter(this.f201433f);
        this.f201433f.setCattingRootLayoutId(C0966R.C0970id.gpj);
        C79043b bVar = new C79043b(this, this.f201433f, this.f201432e, this.f201431d, this.f201438n);
        this.f201440p = bVar;
        this.f201433f.setFooterEventListener(bVar);
        this.f201433f.setSmileyPanelCallback(new C53497h(this));
        ChatFooter chatFooter = this.f201433f;
        int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119684e(18, -1)).intValue();
        if (intValue == -1) {
            intValue = 1;
        }
        chatFooter.setMode(intValue);
        this.f201433f.setUserName("masssendapp");
        this.f201433f.f211878h.mo100321s();
        AppPanel appPanel = this.f201433f.f211878h;
        appPanel.f211687A.f212181y.f212183a = false;
        appPanel.mo100316o();
        AppPanel appPanel2 = this.f201433f.f211878h;
        appPanel2.f211687A.f212182z.f212183a = false;
        appPanel2.mo100316o();
        this.f201433f.mo100361L();
        if (((Boolean) C97625j3.m125812b().mo105906u().mo119684e(66832, Boolean.FALSE)).booleanValue()) {
            this.f201433f.mo100387Z();
            this.f201433f.mo100389a0();
        }
        ChatFooter chatFooter2 = this.f201433f;
        C79052e eVar = new C79052e(this);
        chatFooter2.getClass();
        ChatFooter$$p1 chatFooter$$p1 = new ChatFooter$$p1(chatFooter2, eVar);
        chatFooter2.f211737A3 = chatFooter$$p1;
        chatFooter2.f211888j.addTextChangedListener(chatFooter$$p1);
        this.f201433f.mo100364N();
        this.f201433f.mo100366O();
        this.f201433f.mo100368P();
        this.f201433f.mo100385Y(true, true);
        this.f201433f.mo100376T(true);
        this.f201433f.mo100357J(true);
        this.f201433f.setAppPanelListener(this.f201441q);
        this.f201433f.mo100383X(C76850a.m92640l());
        this.f201433f.mo100351G();
        this.f201433f.mo100355I();
        this.f201433f.mo100359K();
        setBackBtn(new C69816g());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        Class cls = C101488s.class;
        Log.m105924i("MicroMsg.MassSendMsgUI", "onAcvityResult requestCode:" + i3);
        if (i2 == -1) {
            switch (i3) {
                case 1:
                    if (intent2 != null) {
                        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_video_list");
                        if (stringArrayListExtra != null && stringArrayListExtra.size() == 1) {
                            Intent intent3 = new Intent();
                            intent3.setData(Uri.parse("file://" + stringArrayListExtra.get(0)));
                            mo96029N7(intent3);
                            return;
                        }
                        ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("CropImage_OutputPath_List");
                        if (stringArrayListExtra2 != null && stringArrayListExtra2.size() >= 1) {
                            Intent intent4 = new Intent();
                            intent4.putExtra("CropImage_OutputPath", stringArrayListExtra2.get(0));
                            intent4.putExtra("CropImage_Compress_Img", intent2.getBooleanExtra("CropImage_Compress_Img", true));
                            mo96024I7(intent4);
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    Context applicationContext = getApplicationContext();
                    C97625j3.m125812b().getClass();
                    String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(applicationContext, intent2, C7970a.m8127a());
                    this.f201434g = g6;
                    if (g6 != null) {
                        Intent intent5 = new Intent();
                        intent5.putExtra("CropImageMode", 4);
                        intent5.putExtra("CropImage_Filter", true);
                        intent5.putExtra("CropImage_ImgPath", this.f201434g);
                        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93178k(getContext(), intent5, 4);
                        return;
                    }
                    return;
                case 4:
                    mo96024I7(intent2);
                    return;
                case 5:
                    mo96025J7(intent2);
                    return;
                case 6:
                    mo96029N7(intent2);
                    return;
                case 7:
                    if (intent2 == null) {
                        return;
                    }
                    if (intent2.getBooleanExtra("from_record", false)) {
                        mo96025J7(intent2);
                        return;
                    } else {
                        mo96029N7(intent2);
                        return;
                    }
                case 8:
                    SightCaptureResult sightCaptureResult = (SightCaptureResult) intent2.getParcelableExtra("key_req_result");
                    if (sightCaptureResult != null) {
                        if (sightCaptureResult.f201515e) {
                            String str = sightCaptureResult.f201523p;
                            if (!Util.isNullOrNil(str)) {
                                try {
                                    Log.m105925i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", str);
                                    C78517d jo = C38023l.wx0().mo108477jo(str, this.f201432e, this.f201431d.size(), 0);
                                    if (jo != null) {
                                        C78519i iVar = new C78519i(jo, this.f201438n, 0);
                                        C97625j3.m125815e().mo123460f(iVar);
                                        this.f201437j = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.ilx), true, true, new C79055g(this, iVar));
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    Log.m105921e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", e.getMessage());
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            Log.m105925i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", sightCaptureResult.f201517g, sightCaptureResult.f201518h);
                            String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(sightCaptureResult.f201519i);
                            if (!sightCaptureResult.f201517g.equals(q)) {
                                Log.m105925i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", sightCaptureResult.f201517g, q);
                                C86013q1.m106463x(sightCaptureResult.f201517g, q);
                            }
                            mo96028M7(sightCaptureResult.f201519i, sightCaptureResult.f201521n);
                            return;
                        }
                    } else {
                        return;
                    }
                case 9:
                    CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent2.getParcelableExtra("KSEGMENTMEDIAINFO");
                    intent2.putExtra("K_SEGMENTVIDEOPATH", captureVideoNormalModel.f272894e);
                    intent2.putExtra("KSEGMENTVIDEOTHUMBPATH", captureVideoNormalModel.f272895f);
                    if (captureVideoNormalModel.f272897h.booleanValue()) {
                        String str2 = captureVideoNormalModel.f272895f;
                        if (!Util.isNullOrNil(str2)) {
                            try {
                                Log.m105925i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", str2);
                                C78517d jo4 = C38023l.wx0().mo108477jo(str2, this.f201432e, this.f201431d.size(), 0);
                                if (jo4 != null) {
                                    C78519i iVar2 = new C78519i(jo4, this.f201438n, 0);
                                    C97625j3.m125815e().mo123460f(iVar2);
                                    this.f201437j = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.ilx), true, true, new C79054f(this, iVar2));
                                    return;
                                }
                                return;
                            } catch (Exception e2) {
                                Log.m105921e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", e2.getMessage());
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        Log.m105925i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", captureVideoNormalModel.f272894e, captureVideoNormalModel.f272895f);
                        String r = C86013q1.m106457r(captureVideoNormalModel.f272894e);
                        String q2 = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(r);
                        if (!captureVideoNormalModel.f272894e.equals(q2)) {
                            Log.m105925i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", captureVideoNormalModel.f272894e, q2);
                            C86013q1.m106463x(captureVideoNormalModel.f272894e, q2);
                        }
                        mo96028M7(r, (int) (captureVideoNormalModel.f272896g.longValue() / 1000));
                        return;
                    }
                default:
                    Log.m105920e("MicroMsg.MassSendMsgUI", "onActivityResult: not found this requestCode");
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String[] split;
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(193, this);
        this.f201438n = getIntent().getBooleanExtra("mass_send_again", false);
        String stringExtra = getIntent().getStringExtra("mass_send_contact_list");
        this.f201432e = stringExtra;
        this.f201431d = new ArrayList();
        if (stringExtra != null && !stringExtra.equals("") && (split = stringExtra.split(";")) != null && split.length > 0) {
            this.f201431d = Util.stringsToList(split);
        }
        initView();
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(193, this);
        super.onDestroy();
        ChatFooter chatFooter = this.f201433f;
        if (chatFooter != null) {
            chatFooter.mo100345D();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || !this.f201433f.mo100437o0()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f201433f.setBottomPanelVisibility(8);
        return true;
    }

    public void onPause() {
        this.f201433f.mo100344C0(ChatFooter$$o1.Pause);
        this.f201433f.mo100497u0();
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.MassSendMsgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.MassSendMsgUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 16) {
            if (iArr[0] == 0) {
                mo96030O7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C69818i(), (DialogInterface.OnClickListener) null);
        }
    }

    public void onResume() {
        super.onResume();
        ChatFooter chatFooter = this.f201433f;
        if (chatFooter != null) {
            chatFooter.setLastText(f201430r);
            this.f201433f.mo100499v0(getContext(), this);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var;
        Log.m105924i("MicroMsg.MassSendMsgUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C89779i0 i0Var2 = this.f201437j;
        if (i0Var2 != null) {
            i0Var2.dismiss();
            this.f201437j = null;
        }
        C79043b bVar = this.f201440p;
        if (!(bVar == null || (i0Var = bVar.f232130g) == null)) {
            i0Var.dismiss();
            bVar.f232130g = null;
        }
        if (i == 0 && i2 == 0) {
            f201430r = "";
            Intent intent = new Intent(this, MassSendHistoryUI.class);
            intent.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/masssend/ui/MassSendMsgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/masssend/ui/MassSendMsgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
        } else if (i == 4 && i2 == -24) {
            Log.m105920e("MicroMsg.MassSendMsgUI", "onSceneEnd, masssend err spam");
            C76701a.makeText((Context) this, (int) C0966R.string.gpg, 0).show();
        } else {
            if (i == 2 || i == 1 || i == 3) {
                this.f201433f.setLastText(f201430r);
            }
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(getContext(), i, i2, str);
            if (i2 == -71) {
                C76879j.m92749t(this, getString(C0966R.string.gpr, new Object[]{Integer.valueOf(((C52023xu2) ((C78519i) yVar).f229997e.f127056b.f127083a).f144977f)}), getString(C0966R.string.a3h), new C69815f());
            } else if (i2 != -34) {
                C76701a.makeText((Context) this, (int) C0966R.string.ilv, 0).show();
            } else {
                C76701a.makeText((Context) this, (int) C0966R.string.gpf, 0).show();
            }
        }
    }
}
