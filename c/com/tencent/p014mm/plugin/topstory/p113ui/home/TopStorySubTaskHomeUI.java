package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C88989a;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySubTaskHomeUI */
public class TopStorySubTaskHomeUI extends MMActivity {

    /* renamed from: d */
    public TopStoryHomeUIComponentImpl f54561d = new TopStoryHomeUIComponentImpl(this, false);

    public int getLayoutId() {
        this.f54561d.getClass();
        return C0966R.C0971layout.cab;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
        this.f54561d.mo24899f(bundle);
    }

    public void onDestroy() {
        this.f54561d.mo24902h();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f54561d;
        if (i == 4) {
            topStoryHomeUIComponentImpl.mo24898e();
            return true;
        }
        topStoryHomeUIComponentImpl.getClass();
        return false;
    }

    public void onNewIntent(Intent intent) {
        this.f54561d.mo24904i(intent);
        super.onNewIntent(intent);
    }

    public void onPause() {
        this.f54561d.mo24905j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f54561d.mo24907k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f54561d.mo24909l(bundle);
    }
}
