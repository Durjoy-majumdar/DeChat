package com.tencent.p014mm.plugin.shake.model;

import android.graphics.Paint;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C97625j3;
import l20.C21388a;
import nn2.C76942m;
import p196ln.C76705f;
import p327ct.C30914c;
import rn2.C77542a;
import sn2.C48447s;
import tn2.C78072a;
import tn2.C78073b;
import wc3.C102425b0;

/* renamed from: com.tencent.mm.plugin.shake.model.ShakeMgrImpl */
public class ShakeMgrImpl implements C102425b0 {
    public void attachAvatarDrawable(ImageView imageView, int i, String str, String str2) {
        Paint paint = C78073b.f228844j;
        if (4 == i || (C48447s.m53802d(i) && 6 != i)) {
            if (4 != i) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            imageView.post(new C78072a(imageView, str2, -1, str, i));
            return;
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str2);
    }

    public void checkShakeCardEntrance() {
        C77542a.m93500a();
    }

    public void clearShakeCardEntranceData() {
        Log.m105924i("MicroMsg.ShakeCardUtil", "ShakeCardUtil clearShakeCardEntranceData()");
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, 0);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, 0);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC, "");
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, 0);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC, 0);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC, 0);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC, "");
        ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33507p(262154, false);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, "");
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, "");
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "");
    }

    public String getAttachAvatarDrawablePath(String str) {
        return C78073b.m94203b(str);
    }

    public int getShakeItemMusicType() {
        return 4;
    }

    public int getShakeMessageUnreadCnt() {
        return C76942m.Ax0().mo59792jo();
    }

    public boolean isShakeCardEntranceOpen() {
        return C77542a.m93506g();
    }

    public boolean isShowShakeTV() {
        return C48447s.m53803e();
    }

    public void setShakeCardEntranceData() {
        Log.m105924i("MicroMsg.ShakeCardUtil", "ShakeCardUtil setShakeCardEntranceData()");
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, Integer.valueOf(currentTimeMillis));
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, Integer.valueOf(86400 + currentTimeMillis));
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC, "");
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, 0);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC, 1);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC, 6);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC, "");
        ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33507p(262154, true);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC;
        u.mo119677K(aVar, "" + currentTimeMillis);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, "hello");
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "shake card");
    }
}
