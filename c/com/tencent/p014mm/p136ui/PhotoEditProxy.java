package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import d62.C7250m;
import di3.C86312j;
import eb0.C75592q0;
import ef3.C86514b;
import f40.C86709a0;
import p158gt.C98201k;
import p248ug.C102030l0;
import pb1.C100714h1;
import pc0.C100760a0;

/* renamed from: com.tencent.mm.ui.PhotoEditProxy */
public class PhotoEditProxy extends C96897a {
    public PhotoEditProxy(C96905d dVar) {
        super(dVar);
    }

    public int doFav(String str) {
        return ((Integer) REMOTE_CALL("doFavInMM", str)).intValue();
    }

    @C86514b
    public int doFavInMM(String str) {
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135060mH(doFavoriteEvent, 2, str);
        doFavoriteEvent.f264674d.f264688m = 44;
        doFavoriteEvent.publish();
        Log.m105925i("MicroMsg.PhotoEditProxy", "[doFavInMM] path:%s", str);
        return doFavoriteEvent.f264675e.f9046a;
    }

    public String getFullPath(String str) {
        return (String) REMOTE_CALL("getFullPathInMM", str);
    }

    @C86514b
    public String getFullPathInMM(String str) {
        return ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127193mf(str);
    }

    public String getSelfUsername() {
        return (String) REMOTE_CALL("getSelfUsernameInMM", new Object[0]);
    }

    @C86514b
    public String getSelfUsernameInMM() {
        return C75592q0.m90789s();
    }

    public boolean isAutoSave() {
        return ((Boolean) REMOTE_CALL("isAutoSavePhotoInMM", new Object[0])).booleanValue();
    }

    @C86514b
    public boolean isAutoSavePhotoInMM() {
        return C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
    }

    public void recordImage(String str, String str2, long j, String str3, String str4) {
        REMOTE_CALL("recordImageInMM", str, str2, Long.valueOf(j), str3, str4);
    }

    @C86514b
    public void recordImageInMM(String str, String str2, long j, String str3, String str4) {
        ((C102030l0) C86312j.m106911c(C102030l0.class)).mo138094gf(str, str2, j, str3, str4);
    }

    public void recordVideo(String str, String str2, String str3, String str4) {
        REMOTE_CALL("recordVideoInMM", str, str2, str3, str4);
    }

    @C86514b
    public void recordVideoInMM(String str, String str2, String str3, String str4) {
        ((C102030l0) C86312j.m106911c(C102030l0.class)).v20(str, str2, str3, str4);
    }

    public void sendImage(String str, String str2, String str3, String str4) {
        REMOTE_CALL("sendImageInMM", str, str2, str3, str4);
    }

    @C86514b
    public void sendImageInMM(String str, String str2, String str3, String str4) {
        C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
        b.f295195i = 4;
        b.f295188b = C75592q0.m90789s();
        b.f295187a = str4;
        b.f295196j = str2;
        b.f295197k = 0;
        b.f295198l = null;
        b.f295200n = 0;
        b.f295204r = "";
        b.f295205s = "";
        b.f295202p = true;
        b.f295201o = C0966R.C0969drawable.by8;
        b.f295194h = 11;
        b.mo140195a().mo123694a();
        C7250m.m7431a().mo136252Ar(str, str4);
    }
}
