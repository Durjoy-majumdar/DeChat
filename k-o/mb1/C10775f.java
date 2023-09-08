package mb1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import au1.C0222b;
import bu1.C0381a;
import com.tencent.p014mm.autogen.events.RequestFaceVerifyForPayEvent;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceAgreementUI;
import com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: mb1.f */
public class C10775f extends IStaticListener<RequestFaceVerifyForPayEvent> {
    public boolean callback(IEvent iEvent) {
        boolean z;
        RequestFaceVerifyForPayEvent.C1118b bVar;
        boolean z2;
        Intent intent;
        RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = (RequestFaceVerifyForPayEvent) iEvent;
        RequestFaceVerifyForPayEvent.C1117a aVar = requestFaceVerifyForPayEvent.f9431d;
        int i = aVar.f9433a;
        String str = aVar.f9434b;
        String str2 = aVar.f9435c;
        String str3 = aVar.f9436d;
        String str4 = aVar.f9437e;
        String str5 = aVar.f9438f;
        String str6 = aVar.f9439g;
        Activity activity = aVar.f9441i;
        int i2 = aVar.f9440h;
        Log.m105925i("MicroMsg.FaceCheckActionEventListener", "receive face check action event, scene: %s, package: %s, sign: %s, title: %s, otherVerifyTitleFront：%s, faceVerifyTitle:%s", Integer.valueOf(i), str, str2, str3, str4, str6);
        RequestFaceVerifyForPayEvent.C1118b bVar2 = requestFaceVerifyForPayEvent.f9432e;
        C109603j jVar = C109603j.f328125A;
        jVar.getClass();
        Class<FaceAgreementUI> cls = FaceAgreementUI.class;
        RequestFaceVerifyForPayEvent.C1118b bVar3 = bVar2;
        RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent2 = requestFaceVerifyForPayEvent;
        Log.m105925i("MicroMsg.FaceCheckActionMgr", "startFaceCheckAction, scene: %s, packageName: %s, packageSign: %s, otherVerifyTitle: %s, otherVerifyTitleFront:%s, needFrontPage : %s, faceVerifyTitle：%s, requestCode: %s", Integer.valueOf(i), str, str2, str3, str4, str5, str6, Integer.valueOf(i2));
        if (activity == null) {
            bVar = bVar3;
            z2 = false;
            z = false;
        } else {
            jVar.f328126d = new C109599e();
            jVar.f328128f = i;
            jVar.f328129g = str;
            jVar.f328130h = str2;
            jVar.f328131i = str3;
            jVar.f328132j = str5;
            z2 = false;
            jVar.f328145z = false;
            if (Util.isNullOrNil(str5)) {
                C0222b.m173l("agreementUI", 0);
                intent = new Intent(activity, cls);
            } else if (jVar.f328132j.equals("true")) {
                C0222b.m173l("agreementUI", 0);
                intent = new Intent(activity, cls);
            } else {
                C0222b.m173l("agreementUI", 1);
                intent = new Intent(activity, FaceFlashPermissionUI.class);
            }
            if (C0381a.m328e()) {
                C0222b.m173l("kindaCross", 1);
            } else {
                C0222b.m173l("kindaCross", 0);
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
            bundle.putString("package", str);
            bundle.putString("packageSign", str2);
            bundle.putString("otherVerifyTitle", str3);
            bundle.putString("otherVerifyTitleFront", str4);
            bundle.putString("faceVerifyTitle", str6);
            intent.putExtras(bundle);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i2));
            aVar2.mo10233c(intent);
            bVar = bVar3;
            C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/facedetectaction/model/FaceCheckActionMgr", "startFaceCheckAction", "(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            jVar.f328139t = new MMHandler("FaceCheckActionMgr_worker");
            z = true;
        }
        bVar.f9442a = z;
        RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent3 = requestFaceVerifyForPayEvent2;
        RequestFaceVerifyForPayEvent.C1118b bVar4 = requestFaceVerifyForPayEvent3.f9432e;
        if (!bVar4.f9442a) {
            bVar4.f9443b = new Bundle();
            requestFaceVerifyForPayEvent3.f9432e.f9443b.putInt("err_code", 90001);
            requestFaceVerifyForPayEvent3.f9432e.f9443b.putString("err_msg", "face detect not support");
        }
        return z2;
    }
}
