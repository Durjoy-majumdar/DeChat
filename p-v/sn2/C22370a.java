package sn2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import f40.C86709a0;
import java.util.LinkedList;
import js0.C88024r;
import ob0.C11385n;
import ob0.C117747y;
import p375qh.C110390f;
import te3.C49335eu3;
import te3.C50874pt2;
import te3.C51155rt2;

/* renamed from: sn2.a */
public class C22370a implements C11385n {

    /* renamed from: d */
    public int f63402d = 400;

    /* renamed from: e */
    public int f63403e = 8194;

    /* renamed from: f */
    public int f63404f = 0;

    /* renamed from: g */
    public long f63405g = 0;

    /* renamed from: h */
    public int f63406h = 1;

    /* renamed from: i */
    public volatile boolean f63407i;

    /* renamed from: j */
    public C110390f f63408j;

    /* renamed from: n */
    public C22375l f63409n = null;

    /* renamed from: o */
    public C22376m f63410o;

    /* renamed from: p */
    public volatile byte[] f63411p = new byte[8194];

    /* renamed from: q */
    public int f63412q = 0;

    /* renamed from: r */
    public int f63413r = 0;

    /* renamed from: s */
    public boolean f63414s = false;

    /* renamed from: t */
    public C110390f.C89659b f63415t = new a$$c(this);

    /* renamed from: a */
    public final void mo35504a() {
        Log.m105919d("MicroMsg.MusicAndSingRecorder", "reset recorder clientId: %d", Integer.valueOf(this.f63404f));
        C110390f fVar = this.f63408j;
        if (fVar != null) {
            fVar.mo161907l();
            this.f63408j = null;
        }
    }

    /* renamed from: b */
    public boolean mo35505b() {
        C97625j3.m125815e().mo123470p(5245, this);
        C110390f fVar = this.f63408j;
        if (fVar == null) {
            return true;
        }
        fVar.mo161907l();
        this.f63408j = null;
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 5245) {
            Log.m105925i("MicroMsg.MusicAndSingRecorder", "clientId: %d, onSceneEnd >> errType: %d, errCode: %d", Integer.valueOf(this.f63404f), Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                C48436g gVar = (C48436g) yVar;
                if (gVar.mo73108j1() != null) {
                    C51155rt2 rt22 = (C51155rt2) gVar.mo73108j1();
                    int i3 = rt22.f141135e;
                    this.f63402d = i3;
                    this.f63403e = rt22.f141136f;
                    Log.m105925i("MicroMsg.MusicAndSingRecorder", "onSceneEnd: pullInterval: %d, maxPacketSize: %d", Integer.valueOf(i3), Integer.valueOf(this.f63403e));
                    if (rt22.f141137g == 1) {
                        LinkedList<C50874pt2> linkedList = rt22.f141139i;
                        if (linkedList == null || linkedList.size() <= 0) {
                            Log.m105925i("MicroMsg.MusicAndSingRecorder", "NetSceneShakeMedia isRecoFailed stop now clientId: %d", Integer.valueOf(this.f63404f));
                            mo35505b();
                            C88024r.m109572b(new a$$b(this, (C49335eu3) null));
                            return;
                        }
                        Log.m105925i("MicroMsg.MusicAndSingRecorder", "NetSceneShakeMedia isRecoSuccess stop now ! clientId: %d", Integer.valueOf(this.f63404f));
                        mo35505b();
                        C88024r.m109572b(new a$$b(this, rt22));
                        return;
                    } else if (this.f63407i) {
                        int i4 = this.f63413r + 1;
                        this.f63413r = i4;
                        if (i4 >= 5) {
                            Log.m105924i("MicroMsg.MusicAndSingRecorder", "null package count is max");
                            C88024r.m109572b(new a$$b(this, (C49335eu3) null));
                            return;
                        }
                        long nowMilliSecond = Util.nowMilliSecond() - this.f63405g;
                        int i5 = this.f63406h;
                        this.f63406h = i5 + 1;
                        C86709a0.m107525e().postToWorker(new a$$a(this, new byte[1], nowMilliSecond, i5));
                        return;
                    } else {
                        return;
                    }
                }
            }
            Log.m105921e("MicroMsg.MusicAndSingRecorder", "network error, errType: %d, errCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
            mo35504a();
            C88024r.m109572b(new a$$b(this, (C49335eu3) null));
        }
    }
}
