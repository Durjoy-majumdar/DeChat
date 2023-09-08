package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.a */
public final class C55627a extends UIComponent {

    /* renamed from: d */
    public final String f158329d = "MicroMsg.EmojiStoreDesignerReportUIC";

    /* renamed from: e */
    public final EmoticonDesignerProfileIPExposeNewStruct f158330e = new EmoticonDesignerProfileIPExposeNewStruct();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55627a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onBeforeFinish(Intent intent) {
        super.onBeforeFinish(intent);
        String str = this.f158329d;
        Log.m105924i(str, "onBeforeFinish: " + this.f158330e.mo1006q());
        this.f158330e.mo86054n();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55627a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
