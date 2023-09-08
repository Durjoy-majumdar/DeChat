package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.plugin.scanner.C94468m;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75569c4;
import gk3.C98152j;
import gk3.C98162q;
import gq0.C107885g0;
import java.util.ArrayList;
import java.util.List;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$d */
public class ImageGalleryUI$$d implements C98152j {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284500a;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$d$a */
    public class C97021a implements Runnable {
        public C97021a() {
        }

        public void run() {
            C77407n nVar = ImageGalleryUI$$d.this.f284500a.f284448m1;
            if (nVar == null || !nVar.mo107563h()) {
                ImageGalleryUI$$d.this.f284500a.mo135738Q7(2, false);
                return;
            }
            ImageGalleryUI$$d.this.f284500a.mo135751W8();
            if (ImageGalleryUI$$d.this.f284500a.mo135727J8() && ImageGalleryUI$$d.this.f284500a.f284474u2 != null) {
                Log.m105924i("MicroMsg.ImageGalleryUI", "scanCode onSuccess, hide enhance bottomSheet");
                ImageGalleryUI$$d.this.f284500a.f284474u2.mo158311o(C107885g0.C45943b.HIDE);
            }
        }
    }

    public ImageGalleryUI$$d(ImageGalleryUI imageGalleryUI) {
        this.f284500a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo135798a(RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        C77407n nVar;
        ImageGalleryUI imageGalleryUI = this.f284500a;
        int i = ImageGalleryUI.f284337S2;
        String u5 = imageGalleryUI.mo135788u5();
        String i2 = C86013q1.m106448i(u5, false);
        if (i2 == null || !i2.equals(recogQBarOfImageFileResultEvent.f265015d.f265016a)) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "not same filepath");
            return;
        }
        this.f284500a.f284391R1 = Long.valueOf(System.currentTimeMillis());
        this.f284500a.f284395S1 = Long.valueOf(System.currentTimeMillis() - this.f284500a.f284398T1.longValue());
        ImageGalleryUI$$x0 imageGalleryUI$$x0 = this.f284500a.f284465r2;
        imageGalleryUI$$x0.getClass();
        Log.m105924i("MicroMsg.ImageGalleryUI", "onScanFinishPathChecked#ScanState");
        imageGalleryUI$$x0.f284555a = 2;
        C96874n1 n1Var = C96874n1.f283849a;
        ArrayList<ImageQBarDataBean> a = n1Var.mo135192a(recogQBarOfImageFileResultEvent);
        Log.m105925i("MicroMsg.ImageGalleryUI", "scanCode onSuccess data size: %d, recognizeType: %d, curPath: %s, path: %s", Integer.valueOf(a.size()), Integer.valueOf(recogQBarOfImageFileResultEvent.f265015d.f265026k), i2, u5);
        if (!Util.isNullOrNil((List) a)) {
            C98162q qVar = this.f284500a.f284451n1;
            qVar.getClass();
            qVar.f287785a.clear();
            qVar.f287786b = null;
            qVar.f287787c = null;
            qVar.f287785a = n1Var.mo135192a(recogQBarOfImageFileResultEvent);
            ImageGalleryUI imageGalleryUI2 = this.f284500a;
            imageGalleryUI2.f284451n1.f287794j = i2;
            imageGalleryUI2.f284461q1.mo137429i(2, 1);
            this.f284500a.f284461q1.mo137427g(2, new C97021a());
            int i3 = recogQBarOfImageFileResultEvent.f265015d.f265026k;
            if (2 == i3) {
                if (this.f284500a.f284451n1.f287785a.size() == 1) {
                    ImageQBarDataBean imageQBarDataBean = this.f284500a.f284451n1.f287785a.get(0);
                    ImageGalleryUI imageGalleryUI3 = this.f284500a;
                    C98162q qVar2 = imageGalleryUI3.f284451n1;
                    qVar2.f287787c = imageQBarDataBean;
                    qVar2.f287786b = null;
                    ((ScanCodeSheetItemLogic) imageGalleryUI3.f284401U1).mo67079j(imageQBarDataBean.f273114e, imageGalleryUI3.mo135775j8(imageQBarDataBean.f273113d), 1000);
                } else {
                    ImageGalleryUI imageGalleryUI4 = this.f284500a;
                    ArrayList arrayList = (ArrayList) C94468m.m119493a(imageGalleryUI4, imageGalleryUI4.mo135770g8(imageGalleryUI4.f284432g, imageGalleryUI4.f284450n), this.f284500a.f284451n1.f287785a, 0).f38555d;
                    if (arrayList.size() == 1) {
                        ImageQBarDataBean imageQBarDataBean2 = (ImageQBarDataBean) arrayList.get(0);
                        ImageGalleryUI imageGalleryUI5 = this.f284500a;
                        C98162q qVar3 = imageGalleryUI5.f284451n1;
                        qVar3.f287786b = imageQBarDataBean2;
                        qVar3.f287787c = imageQBarDataBean2;
                        ((ScanCodeSheetItemLogic) imageGalleryUI5.f284401U1).mo67079j(imageQBarDataBean2.f273114e, imageGalleryUI5.mo135775j8(imageQBarDataBean2.f273113d), 1000);
                    } else {
                        ImageGalleryUI imageGalleryUI6 = this.f284500a;
                        C98162q qVar4 = imageGalleryUI6.f284451n1;
                        qVar4.f287786b = null;
                        qVar4.f287787c = null;
                        C77407n nVar2 = imageGalleryUI6.f284448m1;
                        if (nVar2 != null && nVar2.mo107563h()) {
                            this.f284500a.mo135751W8();
                        }
                    }
                }
            } else if (3 == i3) {
                ImageGalleryUI imageGalleryUI7 = this.f284500a;
                C98162q qVar5 = imageGalleryUI7.f284451n1;
                qVar5.f287787c = null;
                qVar5.f287786b = null;
                imageGalleryUI7.mo135742S7(true);
            }
        }
        if (!this.f284500a.mo135727J8()) {
            ImageGalleryUI imageGalleryUI8 = this.f284500a;
            if (!C75569c4.m90692y(imageGalleryUI8.f284432g.mo135937y(imageGalleryUI8.f284488y2)) && (nVar = this.f284500a.f284448m1) != null && nVar.mo107563h() && this.f284500a.f284474u2 != null) {
                Log.m105924i("MicroMsg.ImageGalleryUI", "scanCode onSuccess, show enhance bottomSheet");
                this.f284500a.f284474u2.mo158311o(C107885g0.C45943b.ENABLE);
            }
        }
    }

    /* renamed from: b */
    public void mo135799b(RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
        C77407n nVar;
        ImageGalleryUI imageGalleryUI = this.f284500a;
        int i = ImageGalleryUI.f284337S2;
        String u5 = imageGalleryUI.mo135788u5();
        String i2 = C86013q1.m106448i(u5, false);
        if (i2 == null || !i2.equals(recogQBarOfImageFileFailedEvent.f107738d.f107739a)) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "not same filepath");
            return;
        }
        ImageGalleryUI$$x0 imageGalleryUI$$x0 = this.f284500a.f284465r2;
        imageGalleryUI$$x0.getClass();
        Log.m105924i("MicroMsg.ImageGalleryUI", "onScanFinishPathChecked#ScanState");
        imageGalleryUI$$x0.f284555a = 2;
        recogQBarOfImageFileFailedEvent.f107738d.getClass();
        Log.m105925i("MicroMsg.ImageGalleryUI", "scanCode onFailed result: %s, curPath: %s, path: %s", null, i2, u5);
        if (this.f284500a.f284461q1.mo137424d(2, 2) != 1) {
            this.f284500a.f284461q1.mo137429i(2, 2);
        }
        this.f284500a.mo135738Q7(2, false);
        if (!this.f284500a.mo135727J8() && (nVar = this.f284500a.f284448m1) != null && nVar.mo107563h() && this.f284500a.f284474u2 != null) {
            Log.m105924i("MicroMsg.ImageGalleryUI", "scanCode onFailed, show enhance bottomSheet");
            this.f284500a.f284474u2.mo158311o(C107885g0.C45943b.ENABLE);
        }
    }
}
