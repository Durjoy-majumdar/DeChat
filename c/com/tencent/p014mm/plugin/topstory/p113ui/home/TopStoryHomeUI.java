package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19391e;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19394k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.xweb.WebView;
import di3.C86312j;
import fc1.C8009c;
import java.util.HashSet;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import org.json.JSONObject;
import s00.C90110f;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI */
public class TopStoryHomeUI extends MMSecDataActivity {

    /* renamed from: d */
    public TopStoryHomeUIComponentImpl f54490d = new TopStoryHomeUIComponentImpl(this, true);

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI$a */
    public class C19323a implements Runnable {
        public C19323a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.TopStory.TopStoryHomeUI", " finish");
            TopStoryHomeUI.super.finish();
        }
    }

    public void finish() {
        int i = !getController().mo177045F() ? 0 : 100;
        if (i == 0) {
            super.finish();
        } else {
            MMHandlerThread.postToMainThreadDelayed(new C19323a(), (long) i);
        }
    }

    public int getLayoutId() {
        this.f54490d.getClass();
        return C0966R.C0971layout.cab;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f54490d;
        topStoryHomeUIComponentImpl.getClass();
        if (i == 1 && i2 == -1) {
            String stringExtra = intent.getStringExtra("key_video_play_info");
            String stringExtra2 = intent.getStringExtra("key_search_id");
            C19391e eVar = topStoryHomeUIComponentImpl.f54512j;
            eVar.getClass();
            try {
                Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onVideoPlayInfo %s %s", stringExtra2, stringExtra);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("videoPlayInfo", stringExtra);
                jSONObject.put("searchId", stringExtra2);
                MMHandlerThread.postToMainThread(new C19394k(eVar, jSONObject));
            } catch (Exception unused) {
            }
        }
    }

    public void onBackPressed() {
        boolean z;
        TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f54490d;
        if (topStoryHomeUIComponentImpl.f54520u) {
            topStoryHomeUIComponentImpl.mo24897d();
            z = false;
        } else {
            z = true;
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
        WebView.WebViewKind webViewKind = WebView.sDefaultWebViewKind;
        ((C90110f) C86312j.m106911c(C90110f.class)).po0(webViewKind, new C19346b(this));
        Log.m105925i("MicroMsg.TopStory.TopStoryHomeUI", "Start To Load WebView %s", webViewKind);
        this.f54490d.mo24899f(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.TopStoryHomeUI).mo86179qs(this, C76986a.TopStories);
    }

    public void onDestroy() {
        this.f54490d.mo24902h();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f54490d;
        if (i == 4) {
            topStoryHomeUIComponentImpl.mo24898e();
            z = true;
        } else {
            topStoryHomeUIComponentImpl.getClass();
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        this.f54490d.mo24904i(intent);
        super.onNewIntent(intent);
    }

    public void onPause() {
        this.f54490d.mo24905j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f54490d.mo24907k();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f54490d.mo24909l(bundle);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C8009c.class);
    }
}
