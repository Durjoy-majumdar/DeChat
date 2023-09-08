package com.tencent.p014mm.plugin.collect.model.voice;

import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.collect.model.voice.b */
public class C115309b {

    /* renamed from: a */
    public C115312c f345550a;

    /* renamed from: b */
    public C115311b f345551b = new C115311b((C115310a) null);

    /* renamed from: c */
    public Thread f345552c = null;

    /* renamed from: d */
    public SynthesizerNative f345553d = new SynthesizerNative();

    /* renamed from: e */
    public String f345554e;

    /* renamed from: f */
    public boolean f345555f = false;

    /* renamed from: g */
    public boolean f345556g = false;

    /* renamed from: h */
    public byte[] f345557h = new byte[256000];

    /* renamed from: i */
    public float f345558i = 1.0f;

    /* renamed from: j */
    public float f345559j = 1.0f;

    /* renamed from: k */
    public MMHandler f345560k = new C115310a("InnerSynthesizer");

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.b$a */
    public class C115310a extends MMHandler {
        public C115310a(String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            C115312c cVar = C115309b.this.f345550a;
            if (cVar != null) {
                int i = message.what;
                if (i == -1) {
                    ((F2fRcvVoiceOffLineLogic.C115306f) cVar).mo175092a(-203, (byte[]) null);
                } else if (i == 0) {
                    ((F2fRcvVoiceOffLineLogic.C115306f) C115309b.this.f345550a).mo175092a(0, message.getData().getByteArray("data"));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.model.voice.b$b */
    public class C115311b implements Runnable {
        public C115311b(C115310a aVar) {
        }

        public void run() {
            try {
                C115309b bVar = C115309b.this;
                bVar.f345554e = bVar.f345554e.replaceAll("[^0-9a-zA-Z一-龥.?!,;:。？！，、；：@%&/]+", "");
                C115309b bVar2 = C115309b.this;
                Log.m105919d("MicroMsg.OfflineVoice.InnerSynthesizer", "mText = %s  mVolume = %s mSpeed = %s", bVar2.f345554e, Float.valueOf(bVar2.f345558i), Float.valueOf(C115309b.this.f345559j));
                C115309b bVar3 = C115309b.this;
                SynthesizerNative synthesizerNative = bVar3.f345553d;
                byte[] bytes = bVar3.f345554e.getBytes("UTF-8");
                C115309b bVar4 = C115309b.this;
                byte[] bArr = bVar4.f345557h;
                bVar4.getClass();
                C115309b bVar5 = C115309b.this;
                int readmoney = synthesizerNative.readmoney(bytes, bArr, 256000, bVar5.f345558i, bVar5.f345559j);
                if (readmoney != -1) {
                    byte[] bArr2 = new byte[readmoney];
                    System.arraycopy(C115309b.this.f345557h, 0, bArr2, 0, readmoney);
                    C115309b bVar6 = C115309b.this;
                    if (!bVar6.f345556g) {
                        Message obtainMessage = bVar6.f345560k.obtainMessage(0);
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("data", bArr2);
                        obtainMessage.setData(bundle);
                        C115309b.this.f345560k.sendMessage(obtainMessage);
                        Log.m105924i("MicroMsg.OfflineVoice.InnerSynthesizer", "Synthesizer run success");
                        return;
                    }
                    return;
                }
                Log.m105924i("MicroMsg.OfflineVoice.InnerSynthesizer", "Synthesizer run fail");
                MMHandler mMHandler = C115309b.this.f345560k;
                mMHandler.sendMessage(mMHandler.obtainMessage(-1));
            } catch (Exception e) {
                Log.m105925i("MicroMsg.OfflineVoice.InnerSynthesizer", "SynthesizerRunnable Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                MMHandler mMHandler2 = C115309b.this.f345560k;
                mMHandler2.sendMessage(mMHandler2.obtainMessage(-1));
            }
        }
    }
}
