package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C75576f4;
import eb0.C97625j3;
import f40.C86718e;
import ke3.C88144b;
import nj3.C88989a;
import p910lj.C76701a;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.tools.ShareScreenToTimeLineUI */
public class ShareScreenToTimeLineUI extends MMActivity {

    /* renamed from: d */
    public String f220042d = null;

    /* renamed from: e */
    public Uri f220043e = null;

    /* renamed from: com.tencent.mm.ui.tools.ShareScreenToTimeLineUI$a */
    public class C74839a implements C75576f4.C75578b {
        public C74839a(ShareScreenToTimeLineUI shareScreenToTimeLineUI) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
        }
    }

    /* renamed from: H7 */
    public final void mo104037H7() {
        C76701a.makeText((Context) this, (int) C0966R.string.f361358j72, 1).show();
    }

    /* renamed from: I7 */
    public final void mo104038I7(String str, String str2) {
        Intent intent = new Intent();
        if (!Util.isNullOrNil(str)) {
            intent.putExtra("sns_kemdia_path", str);
            intent.putExtra("KFilterId", -1);
        }
        if (!Util.isNullOrNil(str2)) {
            intent.putExtra("Kdescription", str2);
        }
        if (C97625j3.m125820j() && !C86718e.m107551r()) {
            intent.putExtra("K_go_to_SnsTimeLineUI", true);
            C88144b.m109791i(this, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
        } else if (!Util.isNullOrNil(str)) {
            Intent intent2 = new Intent(this, ShareToTimeLineUI.class);
            intent2.putExtra("android.intent.extra.STREAM", FileProviderHelper.getUriForFile(getContext(), new C86009m1(str)));
            intent2.addFlags(32768).addFlags(268435456);
            intent2.setType("image/*");
            intent2.setAction("android.intent.action.SEND");
            MMWizardActivity.m7018M7(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent2);
        } else {
            mo104037H7();
        }
        finish();
    }

    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f8, code lost:
        if ((!r2.mo177810a() ? false : r2.f348991a.mo119948x(r2.f348992b)) == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019e, code lost:
        if (r1 == false) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r10 = this;
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r1 = "MicroMsg.ShareScreenToTimeLineUI"
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "launch : fail, intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r10.mo104037H7()
            r10.finish()
            return
        L_0x0014:
            java.lang.String r2 = r0.getAction()
            android.net.Uri r3 = r0.getData()
            r10.f220043e = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0030
            java.lang.String r0 = "launch : fail, action is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r10.mo104037H7()
            r10.finish()
            return
        L_0x0030:
            java.lang.String r3 = "Kdescription"
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r0, r3)
            android.content.Intent r4 = r10.getIntent()
            java.lang.String r4 = r4.resolveType(r10)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x004b
            r10.mo104037H7()
            r10.finish()
            return
        L_0x004b:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            java.lang.String r7 = "image"
            if (r5 < r6) goto L_0x0068
            java.lang.String r6 = "heic"
            boolean r6 = r4.contains(r6)
            if (r6 != 0) goto L_0x0075
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x0075
            r10.mo104037H7()
            r10.finish()
            return
        L_0x0068:
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x0075
            r10.mo104037H7()
            r10.finish()
            return
        L_0x0075:
            java.lang.String r4 = "android.intent.action.VIEW"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x01e8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "send signal: "
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.net.Uri r2 = r10.f220043e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isUriSafeToBeCopySrc(r2)
            r4 = 1
            r6 = 0
            if (r2 != 0) goto L_0x00ad
            java.lang.Object[] r0 = new java.lang.Object[r4]
            android.net.Uri r2 = r10.f220043e
            r0[r6] = r2
            java.lang.String r2 = "fail, not accepted: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            r10.mo104037H7()
            r10.finish()
            return
        L_0x00ad:
            android.net.Uri r1 = r10.f220043e
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r10, r1)
            r10.f220042d = r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r7 = 0
            if (r2 != 0) goto L_0x00fa
            java.lang.String r2 = r10.f220042d
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r8 = r2.getPath()
            if (r8 == 0) goto L_0x00e2
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r6, r6)
            java.lang.String r9 = r2.getPath()
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x00e2
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r8)
            android.net.Uri r2 = r2.build()
        L_0x00e2:
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r2 = r8.mo177799l(r2, r7)
            boolean r8 = r2.mo177810a()
            if (r8 != 0) goto L_0x00f0
            r2 = 0
            goto L_0x00f8
        L_0x00f0:
            com.tencent.mm.vfs.FileSystem$c r8 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            boolean r2 = r8.mo119948x(r2)
        L_0x00f8:
            if (r2 != 0) goto L_0x0104
        L_0x00fa:
            android.content.ContentResolver r2 = r10.getContentResolver()
            java.lang.String r1 = ud3.C90646e.m113613b(r2, r1, r4)
            r10.f220042d = r1
        L_0x0104:
            java.lang.String r1 = r10.f220042d
            r10.f220042d = r1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x01a0
            java.lang.String r1 = r10.f220042d
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r2 = r1.getPath()
            if (r2 == 0) goto L_0x0134
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r6, r6)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0134
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r2)
            android.net.Uri r1 = r1.build()
        L_0x0134:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r2.mo177799l(r1, r7)
            boolean r2 = r1.mo177810a()
            if (r2 != 0) goto L_0x0142
            r1 = 0
            goto L_0x014a
        L_0x0142:
            com.tencent.mm.vfs.FileSystem$c r2 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            boolean r1 = r2.mo119948x(r1)
        L_0x014a:
            if (r1 == 0) goto L_0x01a0
            r1 = 30
            if (r5 < r1) goto L_0x01ad
            java.lang.String r1 = r10.f220042d
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r2 = r1.getPath()
            if (r2 == 0) goto L_0x0176
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r6, r6)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0176
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r2)
            android.net.Uri r1 = r1.build()
        L_0x0176:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r2.mo177799l(r1, r7)
            boolean r2 = r1.mo177810a()
            if (r2 != 0) goto L_0x0184
            r1 = 0
            goto L_0x019e
        L_0x0184:
            com.tencent.mm.vfs.FileSystem$c r2 = r1.f348991a
            java.lang.String r4 = r1.f348992b
            java.lang.String r4 = r2.mo119947w(r4, r6)
            if (r4 == 0) goto L_0x0198
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            boolean r1 = r1.canRead()
            goto L_0x019e
        L_0x0198:
            java.lang.String r1 = r1.f348992b
            boolean r1 = r2.mo119948x(r1)
        L_0x019e:
            if (r1 != 0) goto L_0x01ad
        L_0x01a0:
            android.content.ContentResolver r1 = r10.getContentResolver()
            android.net.Uri r2 = r10.f220043e
            r4 = 2
            java.lang.String r1 = ud3.C90646e.m113613b(r1, r2, r4)
            r10.f220042d = r1
        L_0x01ad:
            java.lang.String r1 = r10.f220042d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x01d3
            java.lang.String r1 = r10.f220042d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isImageFilename(r1)
            if (r1 != 0) goto L_0x01be
            goto L_0x01d3
        L_0x01be:
            java.lang.String r0 = r10.f220042d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r0)
            if (r0 == 0) goto L_0x01cc
            java.lang.String r0 = r10.f220042d
            r10.mo104038I7(r0, r3)
            return
        L_0x01cc:
            r10.mo104037H7()
            r10.finish()
            return
        L_0x01d3:
            java.lang.String r1 = "Ksnsupload_empty_img"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r0, r1, r6)
            if (r0 == 0) goto L_0x01e1
            java.lang.String r0 = r10.f220042d
            r10.mo104038I7(r0, r3)
            return
        L_0x01e1:
            r10.mo104037H7()
            r10.finish()
            return
        L_0x01e8:
            java.lang.String r0 = "launch : fail, uri is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r10.mo104037H7()
            r10.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareScreenToTimeLineUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        int intExtra = IntentUtil.getIntExtra(getIntent(), "wizard_activity_result_code", 0);
        if (intExtra == -1 || intExtra == 0) {
            NotifyReceiver.m98645c();
            C97625j3.m125815e().mo123460f(new C75576f4(new C74839a(this), (String) null));
            initView();
        } else if (intExtra != 1) {
            Log.m105920e("MicroMsg.ShareScreenToTimeLineUI", "onCreate, should not reach here, resultCode = " + intExtra);
            finish();
        } else {
            finish();
        }
    }
}
