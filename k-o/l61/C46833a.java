package l61;

import com.tencent.p014mm.autogen.events.EmojiSyncTaskEvent;
import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C41063f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import f40.C86709a0;
import j61.C46439j;
import j61.C46441o;
import java.io.IOException;
import p441aq.C92054g;
import p663qo.C101213l;
import te3.C50892pz1;
import wh3.C38139n;

/* renamed from: l61.a */
public class C46833a extends C41062e {

    /* renamed from: d */
    public C41063f f125972d;

    /* renamed from: e */
    public String f125973e;

    /* renamed from: f */
    public boolean f125974f = false;

    /* renamed from: g */
    public C46439j f125975g;

    public C46833a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
        }
        this.f125973e = str;
    }

    /* renamed from: a */
    public void mo64105a() {
        C46439j jVar = this.f125975g;
        if (jVar == null || Util.isNullOrNil(jVar.f125087r)) {
            Log.m105924i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "failed cancel exchange emotion pack.");
        } else if (((C101213l) C86312j.m106911c(C101213l.class)).Gm0(this.f125975g.f125087r)) {
            Log.m105925i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "success cancel exchange emotion pack clientid:%s", this.f125975g.f125087r);
        } else {
            Log.m105925i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "failed cancel exchange emotion pack clientid:%s", this.f125975g.f125087r);
        }
    }

    /* renamed from: b */
    public void mo64106b(C41063f fVar) {
        this.f125972d = fVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C46833a)) {
            return false;
        }
        C46833a aVar = (C46833a) obj;
        return !Util.isNullOrNil(this.f125973e) && !Util.isNullOrNil(aVar.getKey()) && this.f125973e.equals(aVar.getKey());
    }

    public String getKey() {
        String str = this.f125973e;
        return str == null ? "" : str;
    }

    public void run() {
        byte[] bArr;
        Class cls = C92054g.class;
        if (this.f125972d != null) {
            Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", getKey());
        } else {
            Log.m105928w("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "call back is null");
        }
        ((C92054g) C86312j.m106911c(cls)).getClass();
        EmojiGroupInfo bF = C30790w2.m39221h().mo57715b().mo142025bF(getKey(), true);
        if (this.f125974f || bF == null || bF.field_sync != 2 || bF.field_status != 7) {
            this.f125975g = new C46439j(this.f125973e);
            C86709a0.m107529k().f251779b.mo123460f(this.f125975g);
            C50892pz1 pz12 = new C50892pz1();
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C38139n jo = C30790w2.m39221h().mo57719f().mo61538jo(this.f125973e);
            if (!(jo == null || (bArr = jo.field_content) == null)) {
                try {
                    pz12.parseFrom(bArr);
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "exception:%s", Util.stackTraceToString(e));
                }
            }
            if (pz12.f140062d == null) {
                C86709a0.m107529k().f251779b.mo123460f(new C46441o(this.f125973e, 15, -1));
                return;
            }
            return;
        }
        EmojiSyncTaskEvent emojiSyncTaskEvent = new EmojiSyncTaskEvent();
        emojiSyncTaskEvent.f107420d.f107422b = getKey();
        EmojiSyncTaskEvent.C40056a aVar = emojiSyncTaskEvent.f107420d;
        aVar.f107421a = 2;
        aVar.f107423c = true;
        emojiSyncTaskEvent.publish();
    }

    public C46833a(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
        }
        this.f125973e = str;
        this.f125974f = z;
    }
}
