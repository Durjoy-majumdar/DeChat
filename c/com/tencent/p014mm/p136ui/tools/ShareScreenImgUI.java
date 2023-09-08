package com.tencent.p014mm.p136ui.tools;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86718e;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import p447aw.C103918d;
import p910lj.C76701a;
import ud3.C90646e;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.tools.ShareScreenImgUI */
public class ShareScreenImgUI extends MMActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f220034h = 0;

    /* renamed from: d */
    public ProgressDialog f220035d = null;

    /* renamed from: e */
    public Intent f220036e = null;

    /* renamed from: f */
    public String f220037f = null;

    /* renamed from: g */
    public Uri f220038g = null;

    public ShareScreenImgUI() {
        new ShareScreenImgUI$$c(this);
    }

    /* renamed from: H7 */
    public final void mo104032H7() {
        int i;
        Log.m105925i("MicroMsg.ShareScreenImgUI", "filepath:[%s]", this.f220037f);
        Intent intent = getIntent();
        String resolveType = intent.resolveType(this);
        if (resolveType == null || resolveType.length() == 0) {
            Log.m105920e("MicroMsg.ShareScreenImgUI", "map : mimeType is null");
            i = -1;
        } else {
            String lowerCase = resolveType.toLowerCase();
            if (lowerCase.contains("image") || (Build.VERSION.SDK_INT >= 28 && lowerCase.contains("heic"))) {
                i = 0;
            } else {
                Log.m105918d("MicroMsg.ShareScreenImgUI", "map : unknown mimetype, send as file");
                i = 3;
            }
        }
        if (i == -1) {
            Log.m105920e("MicroMsg.ShareScreenImgUI", "launch, msgType is invalid");
            finish();
            return;
        }
        if (!IntentUtil.getBooleanExtra(getIntent(), "Intro_Switch", false) && C97625j3.m125820j() && !C86718e.m107551r()) {
            intent.setData(this.f220038g);
            intent.setClass(this, MsgRetransmitUI.class);
            intent.putExtra("Retr_File_Name", this.f220037f);
            intent.putExtra("Retr_Msg_Type", i);
            intent.putExtra("Retr_Scene", 1);
            String str = this.f220037f;
            if (str != null && Build.VERSION.SDK_INT >= 28 && str.endsWith(".heic")) {
                intent.putExtra("Retr_Compress_Type", 1);
            }
            intent.putExtra("Retr_start_where_you_are", false);
            intent.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/tools/ShareScreenImgUI", "deal", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/ui/tools/ShareScreenImgUI", "deal", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (!Util.isNullOrNil(this.f220037f)) {
            Intent intent2 = new Intent(this, ShareImgUI.class);
            intent2.putExtra("android.intent.extra.STREAM", FileProviderHelper.getUriForFile(getContext(), new C86009m1(this.f220037f)));
            intent2.addFlags(67108864);
            intent2.setType("image/*");
            intent2.setAction("android.intent.action.SEND");
            MMWizardActivity.m7018M7(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent2);
        } else {
            mo104033I7();
        }
        finish();
    }

    /* renamed from: I7 */
    public final void mo104033I7() {
        C76701a.makeText((Context) this, (int) C0966R.string.f361356j70, 1).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e6, code lost:
        if (r2 == false) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104034J7(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = "MicroMsg.ShareScreenImgUI"
            if (r0 == 0) goto L_0x012d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "send signal: "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            android.net.Uri r10 = r9.f220038g
            r0 = 1
            r2 = 0
            if (r10 == 0) goto L_0x011b
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isUriSafeToBeCopySrc(r10)
            if (r10 != 0) goto L_0x002c
            goto L_0x011b
        L_0x002c:
            r10 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r4 = r9.getString(r10)
            r10 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r5 = r9.getString(r10)
            com.tencent.mm.ui.tools.m1 r8 = new com.tencent.mm.ui.tools.m1
            r8.<init>(r9)
            r6 = 1
            r7 = 1
            r3 = r9
            qo3.i0 r10 = nj3.C76879j.m92723Q(r3, r4, r5, r6, r7, r8)
            r9.f220035d = r10
            android.net.Uri r10 = r9.f220038g
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r9, r10)
            r9.f220037f = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00e8
            java.lang.String r3 = r9.f220037f
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            java.lang.String r4 = r3.getPath()
            if (r4 == 0) goto L_0x007c
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r2, r2)
            java.lang.String r5 = r3.getPath()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x007c
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r4)
            android.net.Uri r3 = r3.build()
        L_0x007c:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r5 = 0
            com.tencent.mm.vfs.f0$h r3 = r4.mo177799l(r3, r5)
            boolean r6 = r3.mo177810a()
            if (r6 != 0) goto L_0x008b
            r3 = 0
            goto L_0x0093
        L_0x008b:
            com.tencent.mm.vfs.FileSystem$c r6 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            boolean r3 = r6.mo119948x(r3)
        L_0x0093:
            if (r3 == 0) goto L_0x00e8
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r3 < r6) goto L_0x00f2
            java.lang.String r3 = r9.f220037f
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            java.lang.String r6 = r3.getPath()
            if (r6 == 0) goto L_0x00c1
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r2, r2)
            java.lang.String r7 = r3.getPath()
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x00c1
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r6)
            android.net.Uri r3 = r3.build()
        L_0x00c1:
            com.tencent.mm.vfs.f0$h r3 = r4.mo177799l(r3, r5)
            boolean r4 = r3.mo177810a()
            if (r4 != 0) goto L_0x00cc
            goto L_0x00e6
        L_0x00cc:
            com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a
            java.lang.String r5 = r3.f348992b
            java.lang.String r2 = r4.mo119947w(r5, r2)
            if (r2 == 0) goto L_0x00e0
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r2 = r3.canRead()
            goto L_0x00e6
        L_0x00e0:
            java.lang.String r2 = r3.f348992b
            boolean r2 = r4.mo119948x(r2)
        L_0x00e6:
            if (r2 != 0) goto L_0x00f2
        L_0x00e8:
            android.content.ContentResolver r2 = r9.getContentResolver()
            java.lang.String r10 = ud3.C90646e.m113613b(r2, r10, r0)
            r9.f220037f = r10
        L_0x00f2:
            java.lang.String r10 = r9.f220037f
            r9.f220037f = r10
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = r9.f220037f
            boolean r10 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r10)
            if (r10 != 0) goto L_0x0105
            goto L_0x010f
        L_0x0105:
            r9.mo104032H7()
            r10 = 3
            r0 = 11
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r10, r0)
            return
        L_0x010f:
            java.lang.String r10 = "launch : fail, filePath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            r9.mo104033I7()
            r9.finish()
            return
        L_0x011b:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            android.net.Uri r0 = r9.f220038g
            r10[r2] = r0
            java.lang.String r0 = "launch : fail, not accepted: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r10)
            r9.mo104033I7()
            r9.finish()
            return
        L_0x012d:
            java.lang.String r10 = "launch : fail, uri is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            r9.mo104033I7()
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareScreenImgUI.mo104034J7(java.lang.String):void");
    }

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
        Intent intent = getIntent();
        this.f220036e = intent;
        if (intent == null) {
            Log.m105920e("MicroMsg.ShareScreenImgUI", "launch : fail, intent is null");
            mo104033I7();
            finish();
            return;
        }
        Log.m105924i("MicroMsg.ShareScreenImgUI", "intent = " + this.f220036e);
        String action = this.f220036e.getAction();
        this.f220038g = this.f220036e.getData();
        if (Util.isNullOrNil(action)) {
            Log.m105920e("MicroMsg.ShareScreenImgUI", "launch : fail, action is null");
            mo104033I7();
            finish();
        } else if (!C90646e.m113617f(this, this.f220038g)) {
            mo104034J7(action);
        } else {
            boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(C0966R.string.hif), getString(C0966R.string.f5g));
            Log.m105925i("MicroMsg.ShareScreenImgUI", "checkPermission checkMediaStorage[%b]", Boolean.valueOf(Uu0));
            if (Uu0) {
                mo104034J7(action);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        int intExtra = IntentUtil.getIntExtra(getIntent(), "wizard_activity_result_code", 0);
        if (intExtra == -1 || intExtra == 0) {
            NotifyReceiver.m98645c();
            initView();
        } else if (intExtra != 1) {
            Log.m105920e("MicroMsg.ShareScreenImgUI", "onCreate, should not reach here, resultCode = " + intExtra);
            finish();
        } else {
            finish();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            Log.m105925i("MicroMsg.ShareScreenImgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ShareScreenImgUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 145) {
            if (iArr[0] == 0) {
                if (this.f220036e == null) {
                    this.f220036e = getIntent();
                }
                Intent intent = this.f220036e;
                if (intent != null && intent.getAction() != null) {
                    mo104034J7(this.f220036e.getAction());
                    return;
                }
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhw), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f360830f51), false, new ShareScreenImgUI$$a(this), new ShareScreenImgUI$$b(this));
        }
    }
}
