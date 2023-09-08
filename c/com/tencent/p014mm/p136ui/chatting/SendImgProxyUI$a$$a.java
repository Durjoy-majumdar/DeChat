package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.chatting.SendImgProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import f40.C86709a0;
import java.util.ArrayList;
import p158gt.C59701t;

/* renamed from: com.tencent.mm.ui.chatting.SendImgProxyUI$a$$a */
public final /* synthetic */ class SendImgProxyUI$a$$a implements C59701t {

    /* renamed from: a */
    public final /* synthetic */ SendImgProxyUI.C97012a f284324a;

    /* renamed from: b */
    public final /* synthetic */ boolean f284325b;

    /* renamed from: c */
    public final /* synthetic */ int f284326c;

    public /* synthetic */ SendImgProxyUI$a$$a(SendImgProxyUI.C97012a aVar, boolean z, int i) {
        this.f284324a = aVar;
        this.f284325b = z;
        this.f284326c = i;
    }

    /* renamed from: a */
    public final void mo135712a(ArrayList arrayList) {
        SendImgProxyUI.C97012a aVar = this.f284324a;
        boolean z = this.f284325b;
        int i = this.f284326c;
        aVar.getClass();
        C86709a0.m107525e().setLowPriority();
        Log.m105925i("MicroMsg.SendImgProxyUI", "test before finish %s", Integer.valueOf(arrayList.size()));
        if (!SendImgProxyUI.this.isFinishing()) {
            SendImgProxyUI.this.f284320e.dismiss();
        }
        SendImgProxyUI sendImgProxyUI = SendImgProxyUI.this;
        sendImgProxyUI.setResult(-1, sendImgProxyUI.getIntent().putExtra("GalleryUI_ImgIdList", arrayList));
        SendImgProxyUI.f284319f = false;
        if (!SendImgProxyUI.this.isFinishing()) {
            SendImgProxyUI.this.finish();
        }
        if (NetStatusUtil.isWifi((Context) SendImgProxyUI.this) == z) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcSendPicMsgEnable(), i);
        }
    }
}
