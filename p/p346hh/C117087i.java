package p346hh;

import com.tencent.p014mm.audio.mix.jni.AudioFFmpegDecodeJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import p213oh.C11412b;

/* renamed from: hh.i */
public class C117087i implements C117088k {

    /* renamed from: a */
    public int f350849a = 0;

    /* renamed from: b */
    public int f350850b = 0;

    /* renamed from: c */
    public AudioFFmpegDecodeJni f350851c;

    /* renamed from: d */
    public String f350852d;

    /* renamed from: a */
    public byte[] mo181039a(byte[] bArr) {
        int i = this.f350850b;
        int i2 = this.f350849a;
        int length = ((int) (((float) (bArr.length / 2)) * (((float) i) / ((float) i2)))) * 2;
        byte[] bArr2 = new byte[length];
        AudioFFmpegDecodeJni audioFFmpegDecodeJni = this.f350851c;
        audioFFmpegDecodeJni.resamplePcm(this.f350852d, i2, i, bArr, bArr.length, bArr2, length, audioFFmpegDecodeJni);
        return bArr2;
    }

    /* renamed from: b */
    public boolean mo181040b(String str, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        int i3 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.FFmpegResampleAlgorithm", "ffmpeg resample algorithm  sSample:%d, dSample:%d", objArr);
        this.f350849a = i;
        this.f350850b = i2;
        this.f350852d = str;
        AudioFFmpegDecodeJni audioFFmpegDecodeJni = new AudioFFmpegDecodeJni();
        this.f350851c = audioFFmpegDecodeJni;
        audioFFmpegDecodeJni.initResample(str, i, i2, 2, 2, audioFFmpegDecodeJni);
        return true;
    }

    public boolean release() {
        AudioFFmpegDecodeJni audioFFmpegDecodeJni = this.f350851c;
        audioFFmpegDecodeJni.clearResample(this.f350852d, audioFFmpegDecodeJni);
        return false;
    }
}
