package l12;

import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.voip.model.C106333b;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: l12.a */
public class C109120a implements C106333b {

    /* renamed from: a */
    public final /* synthetic */ C109121b f326749a;

    public C109120a(C109121b bVar) {
        this.f326749a = bVar;
    }

    /* renamed from: a */
    public int mo149458a(byte[] bArr, int i) {
        if (!this.f326749a.f326752c) {
            return -1;
        }
        int playCallback = C105385g.zx0().f327640a.playCallback(bArr, i);
        if (playCallback >= 0) {
            return 0;
        }
        Log.m105921e("MicroMsg.IPCallAudioPlayer", "playCallback, error: %d", Integer.valueOf(playCallback));
        return -1;
    }
}
