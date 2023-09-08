package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76879j;
import p158gt.C98200b0;
import p158gt.C98202n;
import p910lj.C76701a;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.SendImgProxyUI */
public class SendImgProxyUI extends MMBaseActivity {

    /* renamed from: f */
    public static boolean f284319f;

    /* renamed from: e */
    public C89779i0 f284320e = null;

    /* renamed from: com.tencent.mm.ui.chatting.SendImgProxyUI$a */
    public class C97012a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f284321d;

        /* renamed from: e */
        public final /* synthetic */ int f284322e;

        public C97012a(boolean z, int i) {
            this.f284321d = z;
            this.f284322e = i;
        }

        public void run() {
            Log.m105924i("MicroMsg.SendImgProxyUI", "test before sendMutiImage");
            SendImgProxyUI sendImgProxyUI = SendImgProxyUI.this;
            Intent intent = sendImgProxyUI.getIntent();
            SendImgProxyUI$a$$a sendImgProxyUI$a$$a = new SendImgProxyUI$a$$a(this, this.f284321d, this.f284322e);
            boolean z = SendImgProxyUI.f284319f;
            Class cls = C98202n.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(-1);
            if (intent == null) {
                Log.m105920e("MicroMsg.SendImgProxyUI", "data is empty!");
                sendImgProxyUI$a$$a.mo135712a(arrayList);
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", true);
            ArrayList arrayList2 = new ArrayList();
            String str = "CropImage_OutputPath_List";
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(str);
            int intExtra = intent.getIntExtra("CropImage_limit_Img_Size", 26214400);
            ArrayList arrayList3 = new ArrayList();
            if (stringArrayListExtra != null) {
                Iterator<String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (ImgUtil.isImgFile(next)) {
                        long l = C86013q1.m106451l(next);
                        String str2 = str;
                        if (booleanExtra || l <= ((long) intExtra)) {
                            arrayList3.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                        str = str2;
                    }
                }
            }
            intent.putStringArrayListExtra(str, arrayList3);
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
            if (arrayList3.size() == 0 && arrayList2.size() == 0 && (stringArrayListExtra2 == null || stringArrayListExtra2.size() == 0)) {
                C76701a.makeText((Context) sendImgProxyUI, (CharSequence) sendImgProxyUI.getString(C0966R.string.f5f), 0).show();
                Log.m105920e("MicroMsg.SendImgProxyUI", "filelist is empty!");
                sendImgProxyUI$a$$a.mo135712a(arrayList);
                return;
            }
            int intExtra2 = intent.getIntExtra("from_source", 0);
            int intExtra3 = intent.getIntExtra("CropImage_rotateCount", 0);
            String stringExtra = intent.getStringExtra("GalleryUI_ToUser");
            Log.m105918d("MicroMsg.SendImgProxyUI", "dkimgsource" + intent.getIntExtra("from_source", 0));
            if (stringExtra == null) {
                Log.m105920e("MicroMsg.SendImgProxyUI", "toUserName is null");
                sendImgProxyUI$a$$a.mo135712a(arrayList);
            } else if (intent.getBooleanExtra("isSelectAlbum", false)) {
                ((C98202n) C86312j.m106911c(cls)).Ri0(new C97157j4(sendImgProxyUI, intent, arrayList3, stringArrayListExtra2, stringExtra, intExtra2, booleanExtra, sendImgProxyUI$a$$a));
            } else {
                C98200b0 b0Var = new C98200b0();
                b0Var.f287931e = arrayList3;
                b0Var.f287927a = stringExtra;
                b0Var.f287929c = intExtra3;
                b0Var.f287928b = intExtra2;
                b0Var.f287930d = true ^ booleanExtra ? 1 : 0;
                ((C98202n) C86312j.m106911c(cls)).Ri0(new C97158k4(sendImgProxyUI, sendImgProxyUI$a$$a, b0Var));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        C85875k4.m106177d0(getWindow());
        Log.m105925i("MicroMsg.SendImgProxyUI", "onCreate isRunning:%b ,%d", Boolean.valueOf(f284319f), Integer.valueOf(hashCode()));
        if (f284319f) {
            Log.m105928w("MicroMsg.SendImgProxyUI", "duplicate instance");
            finish();
            return;
        }
        f284319f = true;
        setContentView(C0966R.C0971layout.f6534hh);
        this.f284320e = C76879j.m92723Q(this, "", getString(C0966R.string.gmo), true, false, (DialogInterface.OnCancelListener) null);
        C86709a0.m107525e().postToWorker(new C97012a(NetStatusUtil.isWifi((Context) this), C40318k.m43492a().startPerformance(C40318k.m43492a().getHcSendPicMsgEnable(), C40318k.m43492a().getHcSendPicMsgDelay(), C40318k.m43492a().getHcSendPicMsgCPU(), C40318k.m43492a().getHcSendPicMsgIO(), C40318k.m43492a().getHcSendPicMsgThr() ? C86709a0.m107525e().getProcessTid() : 0, C40318k.m43492a().getHcSendPicMsgTimeout(), 203, C40318k.m43492a().getHcSendPicMsgAction(), "MicroMsg.SendImgProxyUI")));
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.SendImgProxyUI", "onDestroy isRunning:%b , %d", Boolean.valueOf(f284319f), Integer.valueOf(hashCode()));
        super.onDestroy();
    }

    public void onResume() {
        Log.m105925i("MicroMsg.SendImgProxyUI", "onResume isRunning:%b ,%d", Boolean.valueOf(f284319f), Integer.valueOf(hashCode()));
        super.onResume();
    }
}
