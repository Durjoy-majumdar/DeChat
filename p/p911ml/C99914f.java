package p911ml;

import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import p1081gi.C98121d;

/* renamed from: ml.f */
public abstract class C99914f {

    /* renamed from: a */
    public EmojiInfo f292771a;

    /* renamed from: b */
    public boolean f292772b;

    /* renamed from: c */
    public boolean f292773c;

    /* renamed from: d */
    public long f292774d;

    /* renamed from: e */
    public C99915a f292775e;

    /* renamed from: f */
    public C98121d f292776f = null;

    /* renamed from: ml.f$a */
    public interface C99915a {
        /* renamed from: a */
        void mo91183a(int i, String str);
    }

    /* renamed from: ml.f$b */
    public static abstract class C99916b implements C99915a {
        /* renamed from: a */
        public void mo91183a(int i, String str) {
        }

        /* renamed from: b */
        public abstract void mo135034b(int i, String str, C98121d dVar);
    }

    public C99914f(EmojiInfo emojiInfo, boolean z, C99915a aVar) {
        this.f292771a = emojiInfo;
        this.f292772b = z;
        this.f292775e = aVar;
        this.f292773c = ImgUtil.isWXGF(emojiInfo.mo62640K1());
        this.f292774d = Util.nowMilliSecond();
        Log.m105925i("MicroMsg.EmojiUpload", "EmojiUpload: %s, %s, %s", emojiInfo.field_md5, Boolean.valueOf(z), Boolean.valueOf(this.f292773c));
    }

    /* renamed from: a */
    public void mo139265a(int i, String str) {
        C99915a aVar = this.f292775e;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof C99916b) {
            ((C99916b) aVar).mo135034b(i, str, this.f292776f);
        } else {
            aVar.mo91183a(i, str);
        }
    }

    /* renamed from: b */
    public void mo139266b() {
        if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            mo139265a(5, (String) null);
        } else if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            mo139265a(6, (String) null);
        } else {
            mo139265a(7, (String) null);
        }
    }
}
