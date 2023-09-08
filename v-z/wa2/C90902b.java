package wa2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import hp0.C87576c;
import nb0.C88915e;
import p225rc.C89912a;

/* renamed from: wa2.b */
public class C90902b implements IDataSource {

    /* renamed from: d */
    public C88915e f260892d;

    public C90902b(C88915e eVar) {
        this.f260892d = eVar;
    }

    public void close() {
        Logger.m21791i("MicroMsg.Audio.InputStreamDataSource", "close");
        C88915e eVar = this.f260892d;
        if (eVar != null) {
            eVar.close();
        }
    }

    public AudioFormat.AudioType getAudioType() {
        if (this.f260892d == null) {
            Logger.m21787e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
            return AudioFormat.AudioType.UNSUPPORT;
        }
        Logger.m21791i("MicroMsg.Audio.InputStreamDataSource", "getAudioType:" + ((C87576c) this.f260892d).mo122017a());
        int a = ((C87576c) this.f260892d).mo122017a();
        if (a == 0) {
            return AudioFormat.AudioType.UNSUPPORT;
        }
        if (a == 1) {
            return AudioFormat.AudioType.AAC;
        }
        if (a == 2) {
            return AudioFormat.AudioType.MP3;
        }
        if (a == 3) {
            return AudioFormat.AudioType.WAV;
        }
        if (a == 4) {
            return AudioFormat.AudioType.OGG;
        }
        Logger.m21787e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
        return AudioFormat.AudioType.UNSUPPORT;
    }

    public long getSize() {
        C88915e eVar = this.f260892d;
        if (eVar != null) {
            return eVar.getSize();
        }
        return 0;
    }

    public void open() {
        Logger.m21791i("MicroMsg.Audio.InputStreamDataSource", WeChatBrands.Business.GROUP_OPEN);
        C88915e eVar = this.f260892d;
        if (eVar != null) {
            C87576c cVar = (C87576c) eVar;
            cVar.getClass();
            Log.m105924i("MicroMsg.WxaAudioDataSource", WeChatBrands.Business.GROUP_OPEN);
            if (cVar.f253667f == null) {
                cVar.f253667f = cVar.mo122018b(cVar.f253665d, cVar.f253666e);
            }
            cVar.f253668g = 0;
            C89912a aVar = cVar.f253667f;
            if (aVar != null) {
                aVar.mo124214b(0);
            }
        }
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        C88915e eVar = this.f260892d;
        if (eVar != null) {
            return eVar.readAt(j, bArr, i, i2);
        }
        Logger.m21787e("MicroMsg.Audio.InputStreamDataSource", "[readAt]audioDataSource is null");
        return -1;
    }
}
