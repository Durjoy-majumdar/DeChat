package l61;

import com.tencent.p014mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C41063f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import f40.C86709a0;
import j61.C46438i;
import ob0.C117747y;
import p441aq.C92054g;

/* renamed from: l61.c */
public class C46835c extends C41062e {

    /* renamed from: d */
    public C41063f f125978d;

    /* renamed from: e */
    public String f125979e;

    /* renamed from: f */
    public C117747y f125980f;

    /* renamed from: g */
    public EmojiInfo f125981g;

    public C46835c(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.BKGLoader.EmojiUploadTask", "[cpan] can not create task. md5 is null.");
        }
        this.f125979e = str;
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        this.f125981g = C30790w2.m39221h().mo57717d().mo142044TO(this.f125979e);
    }

    /* renamed from: a */
    public void mo64105a() {
    }

    /* renamed from: b */
    public void mo64106b(C41063f fVar) {
        this.f125978d = fVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C46835c)) {
            return false;
        }
        C46835c cVar = (C46835c) obj;
        return !Util.isNullOrNil(this.f125979e) && !Util.isNullOrNil(cVar.f125979e) && this.f125979e.equals(cVar.f125979e);
    }

    public String getKey() {
        return this.f125979e;
    }

    public void run() {
        if (this.f125978d != null) {
            Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", this.f125979e);
        } else {
            Log.m105928w("MicroMsg.BKGLoader.EmojiUploadTask", "call back is null.");
        }
        EmojiInfo emojiInfo = this.f125981g;
        if (emojiInfo == null) {
            ((BKGLoaderManager) this.f125978d).mo64095d(this.f125979e, 1, false);
            return;
        }
        this.f125980f = new C46438i(emojiInfo);
        C86709a0.m107529k().f251779b.mo123460f(this.f125980f);
    }
}
