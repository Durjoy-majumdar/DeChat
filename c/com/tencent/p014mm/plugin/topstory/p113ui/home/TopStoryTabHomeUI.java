package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryTabHomeUI */
public class TopStoryTabHomeUI extends MMSecDataActivity {

    /* renamed from: d */
    public C19355s f54562d = new C19355s(this, true);

    public int getLayoutId() {
        this.f54562d.getClass();
        return C0966R.C0971layout.cab;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
        this.f54562d.mo24899f(bundle);
    }

    public void onDestroy() {
        this.f54562d.mo24902h();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        C19355s sVar = this.f54562d;
        if (i == 4) {
            sVar.mo24898e();
            z = true;
        } else {
            sVar.getClass();
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        this.f54562d.mo24904i(intent);
        super.onNewIntent(intent);
    }

    public void onPause() {
        this.f54562d.mo24905j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f54562d.mo24907k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f54562d.mo24909l(bundle);
    }
}
