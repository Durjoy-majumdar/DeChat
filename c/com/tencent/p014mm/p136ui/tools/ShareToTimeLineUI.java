package com.tencent.p014mm.p136ui.tools;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.modelsimple.C40364n;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p447aw.C103918d;
import p910lj.C76701a;
import te3.C51740vu;
import te3.C52064y4;
import ud3.C90646e;

/* renamed from: com.tencent.mm.ui.tools.ShareToTimeLineUI */
public class ShareToTimeLineUI extends AutoLoginActivity implements C11385n {

    /* renamed from: g */
    public static final /* synthetic */ int f220050g = 0;

    /* renamed from: d */
    public Intent f220051d;

    /* renamed from: e */
    public ProgressDialog f220052e = null;

    /* renamed from: f */
    public Intent f220053f;

    /* renamed from: H7 */
    public boolean mo100186H7() {
        if (C97625j3.m125820j() && !C86718e.m107551r()) {
            return false;
        }
        Log.m105928w("MicroMsg.ShareToTimeLine", "not login");
        mo104046L7();
        return true;
    }

    /* renamed from: J7 */
    public void mo94557J7(AutoLoginActivity.C72717a aVar, Intent intent) {
        if (aVar.ordinal() != 0) {
            finish();
            return;
        }
        this.f220051d = intent;
        int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SystemShareControlBitset"), 0);
        Log.m105925i("MicroMsg.ShareToTimeLine", "now permission = %d", Integer.valueOf(i));
        if ((i & 2) > 0) {
            Log.m105920e("MicroMsg.ShareToTimeLine", "now allowed to share to friend");
            finish();
            return;
        }
        String stringExtra = IntentUtil.getStringExtra(intent, "android.intent.extra.TEXT");
        Log.m105925i("MicroMsg.ShareToTimeLine", "postLogin, text = %s", stringExtra);
        if (!Util.isNullOrNil(stringExtra)) {
            String format = String.format("weixin://dl/business/systemshare/?txt=%s", new Object[]{URLEncoder.encode(stringExtra)});
            mo104050P7();
            C97625j3.m125815e().mo123455a(1200, this);
            C97625j3.m125815e().mo123460f(new C40360i0(format, 15, (LinkedList<C52064y4>) null));
            return;
        }
        mo104046L7();
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        return true;
    }

    /* renamed from: L7 */
    public void mo104046L7() {
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105920e("MicroMsg.ShareToTimeLine", "launch : fail, intent is null");
            mo104047M7();
            finish();
            return;
        }
        String action = intent.getAction();
        Bundle extras = IntentUtil.getExtras(intent);
        if (Util.isNullOrNil(action)) {
            Log.m105920e("MicroMsg.ShareToTimeLine", "launch : fail, action is null");
            mo104047M7();
            finish();
            return;
        }
        String stringExtra = IntentUtil.getStringExtra(intent, "Kdescription");
        String resolveType = getIntent().resolveType(this);
        if (Util.isNullOrNil(resolveType)) {
            mo104047M7();
            finish();
        } else if (!resolveType.contains("image")) {
            mo104047M7();
            finish();
        } else {
            Parcelable parcelable = extras.getParcelable("android.intent.extra.STREAM");
            if (!(parcelable instanceof Uri) || C90646e.m113617f(this, (Uri) parcelable)) {
                boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(C0966R.string.hif), getString(C0966R.string.f5g));
                Log.m105925i("MicroMsg.ShareToTimeLine", "checkPermission checkMediaStorage[%b]", Boolean.valueOf(Uu0));
                if (Uu0) {
                    mo104048N7(action, extras, stringExtra);
                    return;
                }
                return;
            }
            mo104048N7(action, extras, stringExtra);
        }
    }

    /* renamed from: M7 */
    public final void mo104047M7() {
        C76701a.makeText((Context) this, (int) C0966R.string.f361358j72, 1).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e5, code lost:
        if (r2 == false) goto L_0x00e7;
     */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104048N7(java.lang.String r8, android.os.Bundle r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 12
            r1 = 11
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r0, r1)
            java.lang.String r0 = "android.intent.action.SEND"
            boolean r0 = r8.equals(r0)
            java.lang.String r1 = "MicroMsg.ShareToTimeLine"
            if (r0 == 0) goto L_0x013f
            if (r9 == 0) goto L_0x013f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "send signal: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            java.lang.String r8 = "android.intent.extra.STREAM"
            android.os.Parcelable r8 = r9.getParcelable(r8)
            r9 = 4
            java.lang.String r0 = "Ksnsupload_empty_img"
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L_0x012c
            boolean r4 = r8 instanceof android.net.Uri
            if (r4 != 0) goto L_0x003a
            goto L_0x012c
        L_0x003a:
            android.net.Uri r8 = (android.net.Uri) r8
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isUriSafeToBeCopySrc(r8)
            if (r4 != 0) goto L_0x0053
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r3] = r8
            java.lang.String r8 = "deal : fail, not accept, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r8, r9)
            r7.mo104047M7()
            r7.finish()
            return
        L_0x0053:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r7, r8)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x00e7
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r5 = r4.getPath()
            if (r5 == 0) goto L_0x0081
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r3, r3)
            java.lang.String r6 = r4.getPath()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0081
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r5)
            android.net.Uri r4 = r4.build()
        L_0x0081:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r4 = r5.mo177799l(r4, r2)
            boolean r5 = r4.mo177810a()
            if (r5 != 0) goto L_0x008f
            r4 = 0
            goto L_0x0097
        L_0x008f:
            com.tencent.mm.vfs.FileSystem$c r5 = r4.f348991a
            java.lang.String r4 = r4.f348992b
            boolean r4 = r5.mo119948x(r4)
        L_0x0097:
            if (r4 == 0) goto L_0x00e7
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r5 = r4.getPath()
            if (r5 == 0) goto L_0x00bd
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r3, r3)
            java.lang.String r6 = r4.getPath()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x00bd
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r5)
            android.net.Uri r4 = r4.build()
        L_0x00bd:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r2 = r5.mo177799l(r4, r2)
            boolean r4 = r2.mo177810a()
            if (r4 != 0) goto L_0x00cb
            r2 = 0
            goto L_0x00e5
        L_0x00cb:
            com.tencent.mm.vfs.FileSystem$c r4 = r2.f348991a
            java.lang.String r5 = r2.f348992b
            java.lang.String r5 = r4.mo119947w(r5, r3)
            if (r5 == 0) goto L_0x00df
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            boolean r2 = r2.canRead()
            goto L_0x00e5
        L_0x00df:
            java.lang.String r2 = r2.f348992b
            boolean r2 = r4.mo119948x(r2)
        L_0x00e5:
            if (r2 != 0) goto L_0x00f0
        L_0x00e7:
            android.content.ContentResolver r1 = r7.getContentResolver()
            r2 = 2
            java.lang.String r1 = ud3.C90646e.m113613b(r1, r8, r2)
        L_0x00f0:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r8 != 0) goto L_0x0119
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isImageFilename(r1)
            if (r8 != 0) goto L_0x00fd
            goto L_0x0119
        L_0x00fd:
            if (r1 == 0) goto L_0x010b
            int r8 = r1.length()
            if (r8 != 0) goto L_0x0106
            goto L_0x010b
        L_0x0106:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r1)
            goto L_0x010c
        L_0x010b:
            r8 = 0
        L_0x010c:
            if (r8 == 0) goto L_0x0112
            r7.mo104049O7(r1, r10, r3)
            return
        L_0x0112:
            r7.mo104047M7()
            r7.finish()
            return
        L_0x0119:
            android.content.Intent r8 = r7.f220051d
            boolean r8 = r8.getBooleanExtra(r0, r3)
            if (r8 == 0) goto L_0x0125
            r7.mo104049O7(r1, r10, r9)
            return
        L_0x0125:
            r7.mo104047M7()
            r7.finish()
            return
        L_0x012c:
            android.content.Intent r8 = r7.f220051d
            boolean r8 = r8.getBooleanExtra(r0, r3)
            if (r8 == 0) goto L_0x0138
            r7.mo104049O7(r2, r10, r9)
            return
        L_0x0138:
            r7.mo104047M7()
            r7.finish()
            return
        L_0x013f:
            java.lang.String r8 = "launch : fail, uri is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
            r7.mo104047M7()
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareToTimeLineUI.mo104048N7(java.lang.String, android.os.Bundle, java.lang.String):void");
    }

    /* renamed from: O7 */
    public final void mo104049O7(String str, String str2, int i) {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        if (!Util.isNullOrNil(str)) {
            intent.putExtra("sns_kemdia_path", str);
            intent.putExtra("KFilterId", -1);
            arrayList.add(str);
        }
        if (!Util.isNullOrNil(str2)) {
            intent.putExtra("Kdescription", str2);
        }
        if (i == 4 && Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            arrayList.add(str2);
        }
        if (!C97625j3.m125820j() || C86718e.m107551r()) {
            if (!Util.isNullOrNil(str)) {
                Intent intent2 = new Intent(this, ShareToTimeLineUI.class);
                intent2.putExtra("android.intent.extra.STREAM", FileProviderHelper.getUriForFile(getContext(), new C86009m1(str)));
                intent2.addFlags(32768).addFlags(268435456);
                intent2.setType("image/*");
                intent2.setAction("android.intent.action.SEND");
                MMWizardActivity.m7018M7(this, new Intent(this, SimpleLoginUI.class).addFlags(268435456).addFlags(32768), intent2);
            } else {
                mo104047M7();
            }
            finish();
            return;
        }
        intent.putExtra("K_go_to_SnsTimeLineUI", true);
        intent.putExtra("Ksnsupload_source", 12);
        if (i == 0) {
            intent.putExtra("KBlockAdd", true);
        }
        intent.setClassName(this, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f220053f = intent;
        C40364n nVar = null;
        if (i == 0) {
            nVar = new C40364n(1, arrayList, getCallerPackage());
        } else if (i == 4) {
            nVar = new C40364n(5, arrayList, getCallerPackage());
        }
        if (nVar != null) {
            C97625j3.m125815e().mo123455a(837, this);
            C86709a0.m107524d().mo123460f(nVar);
            mo104050P7();
        }
    }

    /* renamed from: P7 */
    public final void mo104050P7() {
        this.f220052e = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new ShareToTimeLineUI$$c(this));
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(837, this);
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            Log.m105925i("MicroMsg.ShareToTimeLine", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ShareToTimeLine", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 145) {
            if (iArr[0] == 0) {
                if (this.f220051d == null) {
                    this.f220051d = getIntent();
                }
                Intent intent = this.f220051d;
                if (intent != null && intent.getAction() != null) {
                    String stringExtra = IntentUtil.getStringExtra(this.f220051d, "Kdescription");
                    mo104048N7(this.f220051d.getAction(), IntentUtil.getExtras(this.f220051d), stringExtra);
                    return;
                }
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhw), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f360830f51), false, new ShareToTimeLineUI$$a(this), new ShareToTimeLineUI$$b(this));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ShareToTimeLine", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C97625j3.m125815e().mo123470p(1200, this);
        ProgressDialog progressDialog = this.f220052e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f220052e.dismiss();
        }
        if (yVar instanceof C40360i0) {
            if (i == 0 && i2 == 0) {
                mo104046L7();
                return;
            }
            mo104047M7();
            finish();
        } else if (yVar instanceof C40364n) {
            if (i == 0 && i2 == 0) {
                Intent intent = this.f220053f;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (yVar.getReqResp() != null) {
                C51740vu vuVar = (C51740vu) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
                if (vuVar == null || Util.isNullOrNil(vuVar.f143697d)) {
                    Intent intent2 = this.f220053f;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    Intent intent3 = new Intent();
                    intent3.putExtra("rawUrl", vuVar.f143697d);
                    intent3.putExtra("showShare", false);
                    intent3.putExtra("show_bottom", false);
                    intent3.putExtra("needRedirect", false);
                    C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
                }
            }
            finish();
        }
    }
}
