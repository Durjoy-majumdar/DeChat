package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97621e;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nb0.C88912b;
import nb0.C88913c;
import so2.C101665a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a0 */
public final class C95046a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C95066b0 f275843d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f275844e;

    /* renamed from: f */
    public final /* synthetic */ Context f275845f;

    public C95046a0(C95066b0 b0Var, ImageView imageView, Context context) {
        this.f275843d = b0Var;
        this.f275844e = imageView;
        this.f275845f = context;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBgmVoiceComponent$initComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$1");
        try {
            C95066b0 b0Var = this.f275843d;
            SnsMethodCalculate.markStartTimeMs("access$isFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            boolean z = b0Var.f275945x;
            SnsMethodCalculate.markEndTimeMs("access$isFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            if (z) {
                C95066b0 b0Var2 = this.f275843d;
                SnsMethodCalculate.markStartTimeMs("access$setFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                b0Var2.f275945x = false;
                SnsMethodCalculate.markEndTimeMs("access$setFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                this.f275844e.setImageDrawable(C76577a.m92158i(this.f275845f, C0966R.raw.icon_volume_off));
                C95066b0 b0Var3 = this.f275843d;
                SnsMethodCalculate.markStartTimeMs("access$isPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                boolean z2 = b0Var3.f275946y;
                SnsMethodCalculate.markEndTimeMs("access$isPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                if (z2) {
                    C88913c.m111007e(C95066b0.m120874G(this.f275843d));
                    C95066b0 b0Var4 = this.f275843d;
                    b0Var4.getClass();
                    SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                    b0Var4.f275943v.mo142083a();
                    SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                    C97621e E = C95066b0.m120873E(this.f275843d);
                    if (E != null) {
                        E.mo136889a();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBgmVoiceComponent$initComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
            C95066b0 b0Var5 = this.f275843d;
            SnsMethodCalculate.markStartTimeMs("access$setFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            b0Var5.f275945x = true;
            SnsMethodCalculate.markEndTimeMs("access$setFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            this.f275844e.setImageDrawable(C76577a.m92158i(this.f275845f, C0966R.raw.icon_volume_on));
            C95066b0 b0Var6 = this.f275843d;
            SnsMethodCalculate.markStartTimeMs("access$isPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            boolean z3 = b0Var6.f275946y;
            SnsMethodCalculate.markEndTimeMs("access$isPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
            String str = null;
            if (z3) {
                C88913c.m111008f(C95066b0.m120874G(this.f275843d), (C88912b) null);
                C95066b0 b0Var7 = this.f275843d;
                b0Var7.getClass();
                SnsMethodCalculate.markStartTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                b0Var7.f275943v.mo142084b();
                SnsMethodCalculate.markEndTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                C95066b0 b0Var8 = this.f275843d;
                SnsMethodCalculate.markStartTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                int i = b0Var8.f275934C;
                SnsMethodCalculate.markEndTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                SnsMethodCalculate.markStartTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                b0Var8.f275934C = i + 1;
                SnsMethodCalculate.markEndTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                C97621e E2 = C95066b0.m120873E(this.f275843d);
                if (E2 != null) {
                    C95066b0 b0Var9 = this.f275843d;
                    SnsMethodCalculate.markStartTimeMs("access$getMAudioRespond$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                    C97621e.C97622a aVar = b0Var9.f275938G;
                    SnsMethodCalculate.markEndTimeMs("access$getMAudioRespond$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                    E2.mo136891c(aVar);
                }
            } else {
                C95066b0 b0Var10 = this.f275843d;
                SnsMethodCalculate.markStartTimeMs("access$getShouldPrepare$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                boolean z4 = b0Var10.f275947z;
                SnsMethodCalculate.markEndTimeMs("access$getShouldPrepare$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                if (z4) {
                    C95066b0 b0Var11 = this.f275843d;
                    SnsMethodCalculate.markStartTimeMs("access$setShouldPrepare$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                    b0Var11.f275947z = false;
                    SnsMethodCalculate.markEndTimeMs("access$setShouldPrepare$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                    C88912b bVar = new C88912b();
                    bVar.f256416a = C95066b0.m120874G(this.f275843d);
                    try {
                        C95066b0 b0Var12 = this.f275843d;
                        b0Var12.getClass();
                        SnsMethodCalculate.markStartTimeMs("getAdLandingPageComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                        C101665a aVar2 = b0Var12.f275941t;
                        SnsMethodCalculate.markEndTimeMs("getAdLandingPageComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                        if (aVar2 != null) {
                            str = aVar2.f297593z;
                        }
                        if (str == null) {
                            str = "";
                        }
                        bVar.f256417b = str;
                        bVar.f256423h = false;
                        bVar.f256422g = true;
                        C88913c.m111010h(bVar);
                    } catch (Exception e) {
                        Log.m105921e(this.f275843d.mo131576I(), "snsvoice initToolBarVoiceBtn() called", e);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBgmVoiceComponent$initComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } catch (Exception e2) {
            Log.m105921e(this.f275843d.mo131576I(), "onClick error", e2);
        }
    }
}
