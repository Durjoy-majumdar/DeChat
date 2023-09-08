package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d92.C107028a;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Set;
import k92.C108976d;
import te3.i25;

/* renamed from: com.tencent.mm.plugin.webview.luggage.j1 */
public final class C43603j1 extends C108976d {

    /* renamed from: x */
    public static final Set<String> f117854x;

    /* renamed from: u */
    public final C43658n f117855u;

    /* renamed from: v */
    public final i25 f117856v;

    /* renamed from: w */
    public String f117857w;

    static {
        HashSet hashSet = new HashSet();
        f117854x = hashSet;
        hashSet.add(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("hide_option_menu");
        hashSet.add("translate_webview");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
        hashSet.add("KOpenArticleSceneFromScene");
        String str = C74928u.C45093i.f122315g;
        C87412m.m108593f(str, "KTmplSubScene");
        hashSet.add(str);
        hashSet.add("pay_channel");
        hashSet.add("key_download_restrict");
        hashSet.add("key_wallet_region");
        hashSet.add("key_function_id");
        String str2 = C74928u.C45093i.f122318j;
        C87412m.m108593f(str2, "KTmplItemShowType");
        hashSet.add(str2);
        hashSet.add("geta8key_scene");
        String str3 = C74928u.C45093i.f122325q;
        C87412m.m108593f(str3, "KAdUxInfoForJsApiPay");
        hashSet.add(str3);
        hashSet.add("key_menu_hide_expose");
        hashSet.add("webviewCurrentProcess");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43603j1(C43658n nVar, C107028a aVar) {
        super(aVar);
        Intent intent;
        Bundle extras;
        C87412m.m108594g(nVar, "page");
        C87412m.m108594g(aVar, "adapter");
        this.f117855u = nVar;
        i25 i25 = new i25();
        this.f117856v = i25;
        C107028a aVar2 = this.f326423e;
        if (aVar2 != null && (intent = aVar2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151034IA(extras, i25);
        }
    }

    /* renamed from: A */
    public boolean mo67893A() {
        return this.f117855u.mo65820o();
    }

    /* renamed from: B */
    public boolean mo67894B() {
        return true;
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return this.f117855u.mo65820o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.getIntent();
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35809D(int r1, java.lang.String r2) {
        /*
            r0 = this;
            super.mo35809D(r1, r2)
            d92.a r1 = r0.f326423e
            if (r1 == 0) goto L_0x0016
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = "KMutilTaskInfo"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r1 = (com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo) r1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x001b
            r0.f326418a = r1
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.C43603j1.mo35809D(int, java.lang.String):void");
    }

    /* renamed from: G */
    public void mo67895G(boolean z) {
        mo67897d();
        mo124068H(z, 1);
    }

    /* renamed from: U */
    public boolean mo67896U(int i, boolean z) {
        mo67897d();
        return super.mo67896U(i, z);
    }

    /* renamed from: d */
    public void mo67897d() {
        try {
            this.f117856v.f135051e = this.f117855u.mo67941t();
            this.f117856v.f135054h = this.f117855u.mo67942u();
            MultiTaskInfo multiTaskInfo = this.f326418a;
            if (multiTaskInfo != null) {
                multiTaskInfo.field_data = this.f117856v.toByteArray();
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e.getMessage());
        }
    }
}
