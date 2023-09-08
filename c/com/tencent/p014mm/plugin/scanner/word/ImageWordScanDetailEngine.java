package com.tencent.p014mm.plugin.scanner.word;

import android.util.Pair;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.worddetect.WordDetectNative;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import rw3.C22255b;
import xl2.C102689b;
import xl2.C102690c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine */
public class ImageWordScanDetailEngine implements C94533d<String, C102690c>, C0124r {

    /* renamed from: d */
    public MMActivity f273348d;

    /* renamed from: e */
    public C54219z<Pair<String, C102690c>> f273349e;

    /* renamed from: f */
    public ConcurrentHashMap<String, WordDetectNative.WordDetectDetailResult> f273350f;

    /* renamed from: g */
    public ConcurrentHashMap<String, ArrayList<C94533d.C94534a<String, C102690c>>> f273351g;

    /* renamed from: h */
    public boolean f273352h;

    /* renamed from: i */
    public boolean f273353i;

    public ImageWordScanDetailEngine(MMActivity mMActivity, boolean z) {
        this(mMActivity);
        this.f273353i = z;
    }

    /* renamed from: a */
    public static void m119539a(ImageWordScanDetailEngine imageWordScanDetailEngine, String str, C102690c cVar) {
        imageWordScanDetailEngine.getClass();
        Log.m105925i("MicroMsg.ImageWordScanDetailEngine", "onScanEnd path = %s, result = %s", str, cVar.f303305a);
        ((C119157j) C119157j.f356862d).mo183895z(new C102689b(imageWordScanDetailEngine, str, cVar));
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    private void onActivityDestroy() {
        this.f273352h = true;
        this.f273350f.clear();
        this.f273348d.getLifecycle().removeObserver(this);
        ((C119157j) C119157j.f356862d).mo183894y("WordDetectThread");
        this.f273348d = null;
        this.f273351g.clear();
        if (this.f273353i) {
            ((C119157j) C119157j.f356862d).mo183876g(new C22255b(), "WordDetectThread");
        }
    }

    /* renamed from: b */
    public void mo130013b(Object obj, C94533d.C94534a aVar) {
        String str = (String) obj;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ImageWordScanDetailEngine", "input is  nil");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.ImageWordScanDetailEngine", "image word scan called, session: %s, input: %s", Long.valueOf(currentTimeMillis), str);
        if (!this.f273349e.hasObservers()) {
            MMActivity mMActivity = this.f273348d;
            if (mMActivity == null || mMActivity.isFinishing()) {
                Log.m105920e("MicroMsg.ImageWordScanDetailEngine", "activity destroy called, just return");
                return;
            }
            this.f273349e.observe(this.f273348d, new C94530a(this));
        }
        ((C119157j) C119157j.f356862d).mo183894y("WordDetectThread");
        ((C119157j) C119157j.f356862d).mo183876g(new C19149b(this, str, aVar, currentTimeMillis), "WordDetectThread");
    }

    public ImageWordScanDetailEngine(MMActivity mMActivity) {
        this.f273349e = new C54219z<>();
        this.f273350f = new ConcurrentHashMap<>();
        this.f273351g = new ConcurrentHashMap<>();
        this.f273352h = false;
        this.f273353i = true;
        mMActivity.getLifecycle().addObserver(this);
        this.f273348d = mMActivity;
        this.f273352h = false;
    }
}
