package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.Serializable;
import ke3.C88144b;
import qs2.C101274j0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p0 */
public class C95205p0 extends C95108i0 implements Serializable {

    /* renamed from: B */
    public C101274j0 f276273B;

    public C95205p0(Context context, C101274j0 j0Var, ViewGroup viewGroup) {
        super(context, j0Var, viewGroup);
        this.f276273B = j0Var;
        this.f276010t.mo90729c("emotionProductId", Util.nullAsNil(j0Var.f296645Z));
    }

    /* renamed from: K */
    public void mo130177K() {
        SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
        try {
            String k = mo131854m().mo140744k();
            if (TextUtils.isEmpty(k)) {
                Log.m105924i("MicroMsg.AdLandingPageEmojiBtnComp", "doBtnClick, updatedUxInfo==null, src=" + mo131854m().mo140742i() + ", originSource=" + mo131854m().mo140738e());
                k = mo131854m().mo140745l();
            }
            mo131708b0(this.f276579d, this.f276273B.f296645Z, k);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageEmojiBtnComp", "doBtnClick, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
    }

    /* renamed from: b0 */
    public void mo131708b0(Context context, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("jumpEmojiDetail", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
        Log.m105924i("MicroMsg.AdLandingPageEmojiBtnComp", "jumpEmojiDetail, productID=" + str + ", uxinfo=" + str2);
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("jumpEmojiDetail", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("preceding_scence", 22);
        intent.putExtra("download_entrance_scene", 33);
        intent.putExtra("extra_id", str);
        intent.putExtra("ad_uxInfo", str2);
        C88144b.m109791i(context, "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
        SnsMethodCalculate.markEndTimeMs("jumpEmojiDetail", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageEmojiBtnComp");
    }
}
