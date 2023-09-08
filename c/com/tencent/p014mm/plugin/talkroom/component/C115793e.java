package com.tencent.p014mm.plugin.talkroom.component;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.talkroom.component.C115787c;
import com.tencent.p014mm.sdk.platformtools.Log;
import p375qh.C110390f;
import sx2.C110815a;

/* renamed from: com.tencent.mm.plugin.talkroom.component.e */
public class C115793e extends C115787c.C115788a {

    /* renamed from: e */
    public v2engine f347364e;

    /* renamed from: f */
    public short f347365f;

    /* renamed from: g */
    public short f347366g;

    /* renamed from: h */
    public C110390f f347367h;

    /* renamed from: i */
    public C110390f.C89659b f347368i = new C115794a();

    /* renamed from: com.tencent.mm.plugin.talkroom.component.e$a */
    public class C115794a implements C110390f.C89659b {
        public C115794a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            Log.m105918d("MicroMsg.MicRecoder", "pcm len: " + i);
            if (i <= 0) {
                Log.m105920e("MicroMsg.MicRecoder", "pcm data too low");
                return;
            }
            C115793e eVar = C115793e.this;
            eVar.getClass();
            for (int i2 = 0; i2 < i / 2; i2++) {
                int i3 = i2 * 2;
                short s = (short) ((bArr[i3 + 1] << 8) | (bArr[i3] & ExifInterface.MARKER));
                if (s > eVar.f347365f) {
                    eVar.f347365f = s;
                }
            }
            int Send = C115793e.this.f347364e.Send(bArr, (short) i);
            if (Send < 0) {
                Log.m105920e("MicroMsg.MicRecoder", "send failed, ret: " + Send);
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
        }
    }

    public C115793e(v2engine v2engine) {
        this.f347364e = v2engine;
    }

    /* renamed from: R5 */
    public int mo176156R5() {
        short s = this.f347366g;
        short s2 = this.f347365f;
        if (s < s2) {
            this.f347366g = s2;
        }
        short s3 = this.f347366g;
        if (s3 == 0) {
            return 0;
        }
        short s4 = (short) ((s2 * 100) / s3);
        this.f347365f = 0;
        return s4;
    }

    /* renamed from: YC */
    public void mo176157YC() {
        C110390f fVar = new C110390f(C110815a.f331537a, 1, 2);
        this.f347367h = fVar;
        fVar.mo161903h(8, false);
        C110390f fVar2 = this.f347367h;
        fVar2.f330245x = this.f347368i;
        fVar2.mo161902g(20);
        this.f347367h.mo161906k();
        this.f347366g = 0;
        this.f347365f = 0;
    }

    public void al0() {
        C110390f fVar = this.f347367h;
        if (fVar != null) {
            fVar.mo161907l();
            this.f347367h = null;
        }
    }

    public void release() {
        al0();
    }

    public void start() {
    }
}
