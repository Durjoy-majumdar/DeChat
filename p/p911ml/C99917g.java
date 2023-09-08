package p911ml;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import java.util.Collections;
import p595ll.C61303b;
import p911ml.C99914f;

/* renamed from: ml.g */
public class C99917g extends C99914f {

    /* renamed from: ml.g$a */
    public class C99918a implements C99914f.C99915a {
        public C99918a() {
        }

        /* renamed from: a */
        public void mo91183a(int i, String str) {
            if (i == 0) {
                C99917g gVar = C99917g.this;
                Log.m105925i("MicroMsg.EmojiUploadBackup", "backup: origin %s, gif %s", gVar.f292771a.field_md5, str);
                boolean z = gVar.f292772b;
                new C61303b(z ? 1 : 0, 4, Collections.singletonList(str)).mo9225i().mo123420E(new C99919h(gVar, str));
                return;
            }
            C99917g.this.mo139265a(i, (String) null);
        }
    }

    public C99917g(EmojiInfo emojiInfo, boolean z, C99914f.C99915a aVar) {
        super(emojiInfo, z, aVar);
        new C99922k(emojiInfo, z, new C99918a());
    }
}
