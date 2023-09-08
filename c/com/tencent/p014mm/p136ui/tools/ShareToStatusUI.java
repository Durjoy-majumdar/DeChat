package com.tencent.p014mm.p136ui.tools;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C40364n;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import gy3.C87412m;
import ke3.C88144b;
import kotlin.Metadata;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p447aw.C103918d;
import p910lj.C76701a;
import pe3.C47465a;
import te3.C51740vu;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/ui/tools/ShareToStatusUI;", "Lcom/tencent/mm/pluginsdk/ui/AutoLoginActivity;", "Lob0/n;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.tools.ShareToStatusUI */
public final class ShareToStatusUI extends AutoLoginActivity implements C11385n {

    /* renamed from: d */
    public ProgressDialog f220044d;

    /* renamed from: e */
    public int f220045e = -1;

    /* renamed from: f */
    public Uri f220046f;

    /* renamed from: com.tencent.mm.ui.tools.ShareToStatusUI$a */
    public /* synthetic */ class C74840a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f220047a;

        static {
            int[] iArr = new int[AutoLoginActivity.C72717a.values().length];
            iArr[0] = 1;
            f220047a = iArr;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareToStatusUI$b */
    public static final class C74841b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ShareToStatusUI f220048d;

        public C74841b(ShareToStatusUI shareToStatusUI) {
            this.f220048d = shareToStatusUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f220048d.getContext());
            this.f220048d.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareToStatusUI$c */
    public static final class C74842c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ShareToStatusUI f220049d;

        public C74842c(ShareToStatusUI shareToStatusUI) {
            this.f220049d = shareToStatusUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f220049d.finish();
        }
    }

    /* renamed from: H7 */
    public boolean mo100186H7() {
        if (C97625j3.m125820j() && !C86718e.m107551r()) {
            return false;
        }
        Log.m105928w("MicroMsg.ShareToStatusUI", "not login");
        mo104040M7(false);
        return true;
    }

    /* renamed from: J7 */
    public void mo94557J7(AutoLoginActivity.C72717a aVar, Intent intent) {
        C87412m.m108594g(aVar, "loginResult");
        C87412m.m108594g(intent, "intent");
        if (C74840a.f220047a[aVar.ordinal()] == 1) {
            setIntent(intent);
            int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SystemShareControlBitset"), 0);
            Log.m105925i("MicroMsg.ShareToStatusUI", "now permission = %d", Integer.valueOf(i));
            if ((i & 2) > 0) {
                Log.m105920e("MicroMsg.ShareToStatusUI", "now allowed to share to friend");
                finish();
                return;
            }
            mo104040M7(true);
            return;
        }
        finish();
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        C87412m.m108594g(intent, "intent");
        return true;
    }

    /* renamed from: L7 */
    public final boolean mo104039L7(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ShareToStatusUI", "checkShareFilePathAvailable  filePtah is Null or Nil, return false");
            return false;
        }
        C87412m.m108591d(str);
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g() || !m1Var.mo119961a()) {
            Log.m105920e("MicroMsg.ShareToStatusUI", "checkShareFilePathAvailable  file exists:" + m1Var.mo119967g() + ", canRead:" + m1Var.mo119961a() + ", return false");
            return false;
        }
        Log.m105924i("MicroMsg.ShareToStatusUI", "checkShareFilePathAvailable  filePath is available: " + str);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104040M7(boolean r14) {
        /*
            r13 = this;
            android.content.Intent r0 = r13.getIntent()
            r1 = 1
            java.lang.String r2 = "MicroMsg.ShareToStatusUI"
            if (r0 != 0) goto L_0x0015
            java.lang.String r14 = "deal fail, intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
            r13.mo104041N7(r1)
            r13.finish()
            return
        L_0x0015:
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r0 = r0.getAction()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 == 0) goto L_0x002f
            java.lang.String r14 = "deal fail, action is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
            r13.mo104041N7(r1)
            r13.finish()
            return
        L_0x002f:
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r3 = r3.resolveType(r13)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r5 = "getFileType, mimeType is NONE"
            r6 = 0
            r7 = 2
            if (r4 == 0) goto L_0x0046
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
        L_0x0044:
            r4 = 0
            goto L_0x006c
        L_0x0046:
            gy3.C87412m.m108591d(r3)
            java.lang.String r4 = "image"
            boolean r4 = z04.C112550d0.m153801u(r3, r4, r1)
            if (r4 == 0) goto L_0x0058
            java.lang.String r4 = "getFileType, mimeType is image"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r4 = 1
            goto L_0x006c
        L_0x0058:
            java.lang.String r4 = "video"
            boolean r4 = z04.C112550d0.m153801u(r3, r4, r1)
            if (r4 == 0) goto L_0x0068
            java.lang.String r4 = "getFileType, mimeType is video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r4 = 2
            goto L_0x006c
        L_0x0068:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            goto L_0x0044
        L_0x006c:
            if (r4 != 0) goto L_0x008a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "deal fail, mimeType is illegal："
            r14.append(r0)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
            r14 = 3
            r13.mo104041N7(r14)
            r13.finish()
            return
        L_0x008a:
            android.content.Intent r3 = r13.getIntent()
            android.os.Bundle r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getExtras(r3)
            java.lang.String r5 = "android.intent.action.SEND"
            boolean r5 = gy3.C87412m.m108589b(r0, r5)
            if (r5 == 0) goto L_0x0141
            if (r3 == 0) goto L_0x0141
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "send signal: "
            r5.append(r8)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = "android.intent.extra.STREAM"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            if (r0 == 0) goto L_0x0126
            boolean r3 = r0 instanceof android.net.Uri
            if (r3 != 0) goto L_0x00bd
            goto L_0x0126
        L_0x00bd:
            r3 = r0
            android.net.Uri r3 = (android.net.Uri) r3
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isUriSafeToBeCopySrc(r3)
            if (r5 != 0) goto L_0x00e1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "deal fail, not accept, "
            r14.append(r1)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
            r13.mo104041N7(r7)
            r13.finish()
            return
        L_0x00e1:
            r13.f220046f = r3
            r13.f220045e = r4
            boolean r0 = ud3.C90646e.m113617f(r13, r3)
            if (r0 != 0) goto L_0x00ef
            r13.mo104042O7(r3, r4, r14)
            return
        L_0x00ef:
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r7 = r0
            aw.d r7 = (p447aw.C103918d) r7
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String[] r9 = new java.lang.String[]{r0}
            r10 = 145(0x91, float:2.03E-43)
            r0 = 2131833973(0x7f113475, float:1.9301043E38)
            java.lang.String r11 = r13.getString(r0)
            r0 = 2131830607(0x7f11274f, float:1.9294216E38)
            java.lang.String r12 = r13.getString(r0)
            r8 = r13
            boolean r0 = r7.Uu0(r8, r9, r10, r11, r12)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r1[r6] = r5
            java.lang.String r5 = "checkPermission checkMediaStorage[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            if (r0 == 0) goto L_0x0163
            r13.mo104042O7(r3, r4, r14)
            goto L_0x0163
        L_0x0126:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "deal fail, uri is null or illegal："
            r14.append(r1)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
            r13.mo104041N7(r7)
            r13.finish()
            return
        L_0x0141:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r4 = "deal fail, action or bundle is illegal, action: "
            r14.append(r4)
            r14.append(r0)
            java.lang.String r0 = "  bundle:"
            r14.append(r0)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
            r13.mo104041N7(r1)
            r13.finish()
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareToStatusUI.mo104040M7(boolean):void");
    }

    /* renamed from: N7 */
    public final void mo104041N7(int i) {
        mo104043P7();
        C76701a.makeText((Context) this, i != 1 ? i != 2 ? i != 3 ? C0966R.string.j6n : C0966R.string.j6p : C0966R.string.j6o : C0966R.string.j6q, 1).show();
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fc  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104042O7(android.net.Uri r22, int r23, boolean r24) {
        /*
            r21 = this;
            r7 = r21
            r1 = r22
            r2 = r23
            r0 = 12
            r3 = 11
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r0, r3)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r21, r22)
            boolean r5 = r7.mo104039L7(r4)
            r8 = 1
            r9 = 0
            java.lang.String r10 = "MicroMsg.ShareToStatusUI"
            if (r5 != 0) goto L_0x01d8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "filePath is not available, should get copy path again："
            r5.append(r11)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r5)
            android.content.ContentResolver r5 = r21.getContentResolver()
            java.lang.String r11 = ud3.C90646e.f260411a
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r12 = "MicroMsg.ShareUtil"
            if (r11 != 0) goto L_0x0064
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
            r11.<init>((java.lang.String) r4)
            boolean r13 = r11.mo119967g()
            if (r13 == 0) goto L_0x0064
            boolean r11 = r11.mo119961a()
            if (r11 == 0) goto L_0x0064
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "getShareFilePath srcPath is exists and canRead, return srcPath:"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x01d8
        L_0x0064:
            java.lang.Boolean r11 = ud3.C90646e.f260412b
            if (r11 != 0) goto L_0x0090
            java.lang.Class<h81.h> r11 = h81.C32735h.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_open_share_img_use_fileprovider_copy_path
            int r11 = r11.mo58779Qe(r13, r8)
            if (r11 == r8) goto L_0x0089
            boolean r11 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r11 != 0) goto L_0x0089
            boolean r11 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r11 != 0) goto L_0x0089
            boolean r11 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r11 == 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r11 = 0
            goto L_0x008a
        L_0x0089:
            r11 = 1
        L_0x008a:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            ud3.C90646e.f260412b = r11
        L_0x0090:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "getShareFilePath useCopyFilePath == "
            r11.append(r13)
            java.lang.Boolean r13 = ud3.C90646e.f260412b
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            java.lang.Boolean r11 = ud3.C90646e.f260412b
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x00b5
            r0 = 10
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r0)
            goto L_0x01d8
        L_0x00b5:
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r3)
            java.io.InputStream r3 = r5.openInputStream(r1)     // Catch:{ Exception -> 0x01a2, all -> 0x019d }
            if (r3 == 0) goto L_0x017a
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r5 = ud3.C90646e.m113616e(r4)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            if (r11 == 0) goto L_0x00e5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            r5.<init>()     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r11 = "getShareFilePath tmpPath == null , use srcPath:"
            r5.append(r11)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            r5.append(r4)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r5)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r0)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            goto L_0x0193
        L_0x00e5:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            r0.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            boolean r11 = r0.mo119967g()     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            if (r11 == 0) goto L_0x00f3
            r0.mo119966f()     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
        L_0x00f3:
            java.io.OutputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106429K(r5, r9)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            r15 = 4096(0x1000, float:5.74E-42)
            byte[] r15 = new byte[r15]     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r16 = 0
            r6 = r16
        L_0x00ff:
            int r8 = r3.read(r15)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r9 = -1
            if (r8 != r9) goto L_0x016e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r8.<init>()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            java.lang.String r9 = "getShareFilePath copy cost(ms):"
            r8.append(r9)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            long r13 = r19 - r13
            r8.append(r13)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            java.lang.String r9 = "  size(KB):"
            r8.append(r9)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r7 = 1149239296(0x44800000, float:1024.0)
            float r6 = r6 / r7
            r8.append(r6)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            boolean r6 = r0.mo119967g()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            if (r6 == 0) goto L_0x0154
            boolean r0 = r0.mo119961a()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            if (r0 == 0) goto L_0x0154
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r0.<init>()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            java.lang.String r6 = "getShareFilePath tmpFile can use:"
            r0.append(r6)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r0.append(r5)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r0 = 13
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r0)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r4 = r5
            goto L_0x01c6
        L_0x0154:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r0.<init>()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            java.lang.String r5 = "getShareFilePath tmpFile can not use, use srcPath:"
            r0.append(r5)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r0.append(r4)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            r0 = 14
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r0)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            goto L_0x01c6
        L_0x016e:
            r11.write(r15)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            long r8 = (long) r8
            long r6 = r6 + r8
            r9 = 0
            goto L_0x00ff
        L_0x0175:
            r0 = move-exception
            r6 = r11
            goto L_0x0197
        L_0x0178:
            r0 = move-exception
            goto L_0x01a5
        L_0x017a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            r0.<init>()     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r5 = "getShareFilePath inputStream == null, copy fail, use srcPath:"
            r0.append(r5)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            r0.append(r4)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            r0 = 15
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r0)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
        L_0x0193:
            r11 = 0
            goto L_0x01c6
        L_0x0195:
            r0 = move-exception
            r6 = 0
        L_0x0197:
            r18 = r6
            r6 = r3
            goto L_0x01d1
        L_0x019b:
            r0 = move-exception
            goto L_0x01a4
        L_0x019d:
            r0 = move-exception
            r6 = 0
            r18 = 0
            goto L_0x01d1
        L_0x01a2:
            r0 = move-exception
            r3 = 0
        L_0x01a4:
            r11 = 0
        L_0x01a5:
            java.lang.String r5 = ""
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r5, r7)     // Catch:{ all -> 0x01cd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r0.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r5 = "getShareFilePath copy exception, use srcPath:"
            r0.append(r5)     // Catch:{ all -> 0x01cd }
            r0.append(r4)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ all -> 0x01cd }
            r0 = 16
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r0)     // Catch:{ all -> 0x01cd }
        L_0x01c6:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r11)
            goto L_0x01d8
        L_0x01cd:
            r0 = move-exception
            r6 = r3
            r18 = r11
        L_0x01d1:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r18)
            throw r0
        L_0x01d8:
            r7 = r21
            boolean r0 = r7.mo104039L7(r4)
            r3 = 2
            if (r0 != 0) goto L_0x01fc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "deal fail, filePath is not available："
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r7.mo104041N7(r3)
            r21.finish()
            return
        L_0x01fc:
            boolean r0 = eb0.C97625j3.m125820j()
            if (r0 == 0) goto L_0x02d2
            boolean r0 = f40.C86718e.m107551r()
            if (r0 == 0) goto L_0x020a
            goto L_0x02d2
        L_0x020a:
            if (r24 == 0) goto L_0x028c
            gy3.C87412m.m108591d(r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r4)
            r1 = 3
            r4 = 1
            if (r2 == r4) goto L_0x0229
            if (r2 == r3) goto L_0x021f
            r6 = 0
            goto L_0x0232
        L_0x021f:
            com.tencent.mm.modelsimple.n r6 = new com.tencent.mm.modelsimple.n
            java.lang.String r3 = r21.getCallerPackage()
            r6.<init>(r1, r0, r3)
            goto L_0x0232
        L_0x0229:
            com.tencent.mm.modelsimple.n r6 = new com.tencent.mm.modelsimple.n
            java.lang.String r3 = r21.getCallerPackage()
            r6.<init>(r4, r0, r3)
        L_0x0232:
            if (r6 == 0) goto L_0x0280
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "doCheckSysScene, do scene："
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r1 = 837(0x345, float:1.173E-42)
            r0.mo123470p(r1, r7)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r0.mo123455a(r1, r7)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r0.mo123460f(r6)
            r21.mo104043P7()
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r7.getString(r0)
            r0 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r3 = r7.getString(r0)
            com.tencent.mm.ui.tools.n1 r6 = new com.tencent.mm.ui.tools.n1
            r6.<init>(r7)
            r4 = 1
            r5 = 1
            r1 = r21
            qo3.i0 r0 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r7.f220044d = r0
            goto L_0x02d1
        L_0x0280:
            java.lang.String r0 = "doCheckSysScene, mimeType is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r7.mo104041N7(r1)
            r21.finish()
            goto L_0x02d1
        L_0x028c:
            gy3.C87412m.m108591d(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "shareToStatus  share path: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "  type:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r21.mo104043P7()
            java.lang.Class<yy.h> r0 = p773yy.C66708h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            yy.h r0 = (p773yy.C66708h) r0
            androidx.appcompat.app.AppCompatActivity r1 = r21.getContext()
            qy2.z r3 = new qy2.z
            r3.<init>()
            r3.f229400e = r4
            uz2.u r4 = r3.f229399d
            r4.f147237f = r2
            r4 = 12
            r3.f229404i = r4
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r0.L20(r1, r3)
            r21.finish()
        L_0x02d1:
            return
        L_0x02d2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "deal fail, is not login ："
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x032a
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.tools.ShareToStatusUI> r4 = com.tencent.p014mm.p136ui.tools.ShareToStatusUI.class
            r0.<init>(r7, r4)
            java.lang.String r4 = "android.intent.extra.STREAM"
            r0.putExtra(r4, r1)
            r1 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r4 = r0.addFlags(r1)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r4.addFlags(r5)
            if (r2 != r3) goto L_0x030d
            java.lang.String r2 = "video/*"
            r0.setType(r2)
            goto L_0x0312
        L_0x030d:
            java.lang.String r2 = "image/*"
            r0.setType(r2)
        L_0x0312:
            java.lang.String r2 = "android.intent.action.SEND"
            r0.setAction(r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.SimpleLoginUI> r3 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.class
            r2.<init>(r7, r3)
            android.content.Intent r2 = r2.addFlags(r5)
            android.content.Intent r1 = r2.addFlags(r1)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7018M7(r7, r1, r0)
            goto L_0x032e
        L_0x032a:
            r1 = 0
            r7.mo104041N7(r1)
        L_0x032e:
            r21.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareToStatusUI.mo104042O7(android.net.Uri, int, boolean):void");
    }

    /* renamed from: P7 */
    public final void mo104043P7() {
        try {
            ProgressDialog progressDialog = this.f220044d;
            if (progressDialog != null) {
                C87412m.m108591d(progressDialog);
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog2 = this.f220044d;
                    C87412m.m108591d(progressDialog2);
                    progressDialog2.dismiss();
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ShareToStatusUI", e, "", new Object[0]);
        }
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(837, this);
        mo104043P7();
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length == 0) {
            Log.m105925i("MicroMsg.ShareToStatusUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ShareToStatusUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 145) {
            return;
        }
        if (iArr[0] == 0) {
            Uri uri = this.f220046f;
            if (uri != null) {
                C87412m.m108591d(uri);
                mo104042O7(uri, this.f220045e, false);
                return;
            }
            finish();
            return;
        }
        C76879j.m92709C(this, getString(C0966R.string.hhw), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f360830f51), false, new C74841b(this), new C74842c(this));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        Log.m105924i("MicroMsg.ShareToStatusUI", "onSceneEnd, errType = " + i + ", errCode = " + i + ", errMsg = " + str);
        C97625j3.m125815e().mo123470p(837, this);
        mo104043P7();
        if (yVar instanceof C40364n) {
            if (i == 0 && i2 == 0) {
                mo104040M7(false);
            } else if (yVar.getReqResp() != null) {
                C114799u reqResp = yVar.getReqResp();
                C87412m.m108592e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                C47465a aVar = ((C47350c) reqResp).f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckShareExtensionResponse");
                C51740vu vuVar = (C51740vu) aVar;
                if (!Util.isNullOrNil(vuVar.f143697d)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", vuVar.f143697d);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("needRedirect", false);
                    C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                } else {
                    mo104040M7(false);
                }
            }
            finish();
        }
    }
}
