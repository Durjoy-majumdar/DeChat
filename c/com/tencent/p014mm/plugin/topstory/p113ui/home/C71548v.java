package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.view.View;
import c00.C92328i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import g83.C59390n;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.v */
public class C71548v implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryUploadUI f207329d;

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.v$a */
    public class C71549a implements C92328i {
        public C71549a() {
        }

        /* renamed from: a */
        public void mo7501a(boolean z) {
            C71548v.this.f207329d.f207321x.clearFocus();
            Log.m105924i("micromsg.topstory.TopStoryUploadUI", "commentEt clearFocus");
            C59390n.m69304a(2, 2, 3);
        }

        /* renamed from: b */
        public void mo7502b() {
            C71548v.this.f207329d.f207321x.requestFocus();
            Log.m105924i("micromsg.topstory.TopStoryUploadUI", "commentEt onPosition");
            C59390n.m69304a(1, 2, 3);
        }
    }

    public C71548v(TopStoryUploadUI topStoryUploadUI) {
        this.f207329d = topStoryUploadUI;
    }

    public void onFocusChange(View view, boolean z) {
        boolean z2 = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("tophitory_show_comment_dialog", false);
        if (z && !z2) {
            this.f207329d.f207321x.clearFocus();
            C59390n.f169735a.mo84516c(this.f207329d.f207321x.getContext(), new C71549a(), true);
        }
    }
}
