package com.tencent.p014mm.plugin.luckymoney.model;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.C2CNYPredownloadImgEvent;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import p1081gi.C98124g;
import p663qo.C101213l;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.t */
public class C69264t extends IStaticListener<C2CNYPredownloadImgEvent> {

    /* renamed from: d */
    public ArrayList<String> f199331d = new ArrayList<>();

    public boolean callback(IEvent iEvent) {
        String str;
        C2CNYPredownloadImgEvent c2CNYPredownloadImgEvent = (C2CNYPredownloadImgEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() acc not ready!");
        } else if (c2CNYPredownloadImgEvent instanceof C2CNYPredownloadImgEvent) {
            Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() receive C2CNYPredownloadImgEvent event!");
            C86709a0.m107528h();
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NEWYEAR_HONGBAO_IMAGE_PRESTRAIN_FLAG_INT_SYNC, 1)).intValue();
            Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "prestrainFlag:" + intValue);
            if (intValue == 0) {
                Log.m105920e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:prestrainFlag is 0, do nothing!");
            } else {
                C2CNYPredownloadImgEvent.C67664a aVar = c2CNYPredownloadImgEvent.f193503d;
                String str2 = aVar.f193504a;
                String str3 = aVar.f193505b;
                int i = aVar.f193506c;
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || i <= 0) {
                    Log.m105920e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:c2c new year msg image param is invalid!");
                } else if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    Log.m105920e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:is not wifi network, do nothing!");
                } else if (this.f199331d.contains(str2)) {
                    Log.m105920e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:imageid is exist!, do nothing!  imageid:" + str2);
                } else {
                    StringBuilder sb = new StringBuilder();
                    HashMap<String, Long> hashMap = C69242l1.f199264a;
                    if (Util.isNullOrNil(str2) || !C86709a0.m107522a()) {
                        str = "";
                    } else {
                        C86709a0.m107528h();
                        C86009m1 m1Var = new C86009m1(String.format("%s/%s/", new Object[]{C86709a0.m107535s().f251806d, "LuckyMoney"}));
                        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
                            m1Var.mo119987x();
                        }
                        str = new C86009m1(m1Var, str2).mo119971i();
                    }
                    sb.append(str);
                    sb.append(".temp");
                    String sb4 = sb.toString();
                    Uri n = C116299g2.m163858n(sb4);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() imagePath:" + sb4 + " is not exist!");
                        this.f199331d.add(str2);
                        C69214f1 f1Var = new C69214f1();
                        C69262s sVar = new C69262s(this);
                        Log.m105925i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: downloadImage. imageId:%s", str2);
                        f1Var.f199174g = false;
                        String nullAsNil = Util.nullAsNil(C1297x.m1387b("NewYearImg", System.currentTimeMillis(), C75592q0.m90777g().getUsername(), ""));
                        f1Var.f199171d = nullAsNil;
                        Log.m105925i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: downloadImage. client id:%s", nullAsNil);
                        f1Var.f199173f = sb4;
                        f1Var.f199172e = sVar;
                        C98124g gVar = new C98124g();
                        gVar.f287660d = "task_LuckyMoneyNewYearImageUploader_2";
                        gVar.f287661e = false;
                        gVar.f287662f = f1Var;
                        gVar.field_fullpath = sb4;
                        gVar.field_mediaId = f1Var.f199171d;
                        gVar.field_fileId = str2;
                        gVar.field_aesKey = str3;
                        gVar.field_totalLen = i;
                        gVar.field_fileType = 5;
                        gVar.field_priority = 2;
                        gVar.field_needStorage = false;
                        gVar.field_isStreamMedia = false;
                        gVar.field_appType = 0;
                        gVar.field_bzScene = 0;
                        if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar)) {
                            Log.m105921e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: cdntra addSendTask failed. imageId:%s", str2);
                        }
                    } else {
                        Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:imagePath file is exist! not download it!");
                    }
                }
            }
        }
        return false;
    }
}
