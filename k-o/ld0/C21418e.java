package ld0;

import android.media.AudioTrack;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.modelvoice.MediaRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import cy3.C58003b;
import gy3.C8480h;
import gy3.C87412m;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kd0.C21322l;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: ld0.e */
public final class C21418e implements C21415b {

    /* renamed from: a */
    public final List<C21420b> f60604a = new ArrayList();

    /* renamed from: b */
    public C21420b f60605b;

    /* renamed from: c */
    public C21419a f60606c;

    /* renamed from: ld0.e$a */
    public static final class C21419a {

        /* renamed from: a */
        public final C21420b f60607a;

        /* renamed from: b */
        public final String f60608b;

        /* renamed from: c */
        public C21322l f60609c;

        /* renamed from: d */
        public int f60610d;

        /* renamed from: e */
        public boolean f60611e;

        /* renamed from: f */
        public boolean f60612f;

        /* renamed from: g */
        public boolean f60613g;

        /* renamed from: h */
        public long f60614h;

        public C21419a(C21420b bVar) {
            C87412m.m108594g(bVar, "fileInfo");
            this.f60607a = bVar;
            this.f60608b = "MicroMsg.MSP.MultiFileSilkDecoder-" + bVar.f60615a;
        }
    }

    /* renamed from: ld0.e$b */
    public static final class C21420b {

        /* renamed from: a */
        public final String f60615a;

        /* renamed from: b */
        public final int f60616b;

        /* renamed from: c */
        public long f60617c;

        public C21420b(String str, int i, long j, int i2, C8480h hVar) {
            j = (i2 & 4) != 0 ? 0 : j;
            C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            this.f60615a = str;
            this.f60616b = i;
            this.f60617c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21420b)) {
                return false;
            }
            C21420b bVar = (C21420b) obj;
            return C87412m.m108589b(this.f60615a, bVar.f60615a) && this.f60616b == bVar.f60616b && this.f60617c == bVar.f60617c;
        }

        public int hashCode() {
            long j = this.f60617c;
            return (((this.f60615a.hashCode() * 31) + this.f60616b) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "FileInfo(filePath=" + this.f60615a + ", indexPos=" + this.f60616b + ", duration=" + this.f60617c + ')';
        }
    }

    /* renamed from: a */
    public C109335h mo33548a() {
        C109335h hVar;
        C109335h hVar2;
        C21420b bVar;
        Object obj;
        Throwable th;
        do {
            C21419a aVar = this.f60606c;
            hVar = null;
            if (aVar == null || aVar.f60611e || aVar.f60612f || !aVar.f60613g) {
                Log.m105924i("MicroMsg.MSP.MultiFileSilkDecoder", "createDecoderContext");
                C21420b bVar2 = this.f60605b;
                if (bVar2 == null) {
                    bVar = (C21420b) C110818d0.m150916N(this.f60604a);
                } else {
                    List<C21420b> list = this.f60604a;
                    bVar = (C21420b) C110818d0.m150917O(list, C110818d0.m150918P(list, bVar2) + 1);
                }
                if (bVar == null) {
                    Log.m105928w("MicroMsg.MSP.MultiFileSilkDecoder", "get file null");
                    aVar = null;
                } else {
                    this.f60605b = bVar;
                    C21419a aVar2 = new C21419a(bVar);
                    Log.m105924i(aVar2.f60608b, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                    try {
                        Result.Companion companion = Result.Companion;
                        InputStream E = C86013q1.m106423E(aVar2.f60607a.f60615a);
                        try {
                            byte[] bArr = new byte[E.available()];
                            E.read(bArr);
                            C58003b.m67160a(E, (Throwable) null);
                            obj = Result.m168114constructorimpl(bArr);
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            C58003b.m67160a(E, th);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.m168114constructorimpl(ResultKt.createFailure(th6));
                    }
                    Throwable r8 = Result.m168117exceptionOrNullimpl(obj);
                    if (r8 != null) {
                        Log.m105921e(aVar2.f60608b, "open file error", r8);
                    }
                    if (Result.m168120isFailureimpl(obj)) {
                        obj = null;
                    }
                    byte[] bArr2 = (byte[]) obj;
                    if (bArr2 != null) {
                        if (bArr2.length == 0) {
                            Log.m105920e(aVar2.f60608b, "dataBuffer is empty, no data to decode");
                            aVar2.f60612f = true;
                        } else {
                            aVar2.f60610d = MediaRecorder.SilkGetEncSampleRate(new byte[]{bArr2[0]}, 0);
                            C21420b bVar3 = aVar2.f60607a;
                            if (bVar3.f60617c == 0) {
                                bVar3.f60617c = ((((long) (bArr2.length * 2)) * 1000) / ((long) 23900)) * ((long) 8);
                                Log.m105924i(aVar2.f60608b, "init duration, " + aVar2.f60607a.f60617c);
                            }
                            aVar2.f60609c = new C21322l(aVar2.f60610d, bArr2, bArr2.length);
                            aVar2.f60613g = true;
                            aVar2.f60612f = false;
                        }
                    }
                    aVar = aVar2;
                }
                C21419a aVar3 = this.f60606c;
                if (aVar3 != null) {
                    Log.m105924i(aVar3.f60608b, "decoder uninit");
                    aVar3.f60613g = false;
                    C21322l lVar = aVar3.f60609c;
                    if (lVar != null) {
                        MediaRecorder.SilkDecUnInit(lVar.f60230a);
                    }
                }
            }
            this.f60606c = aVar;
            if (aVar == null) {
                return null;
            }
            if (!aVar.f60613g) {
                Log.m105928w(aVar.f60608b, "decoder is not working");
                continue;
            } else {
                C21322l lVar2 = aVar.f60609c;
                if (lVar2 == null) {
                    Log.m105928w(aVar.f60608b, "silk decoder init error");
                    continue;
                } else {
                    int i = aVar.f60610d;
                    int i2 = (i * 20) / 1000;
                    byte[] bArr3 = new byte[(AudioTrack.getMinBufferSize(i, 4, 2) * 2)];
                    int SilkDoDec = MediaRecorder.SilkDoDec(bArr3, (short) i2, lVar2.f60230a);
                    if (SilkDoDec > 0) {
                        C21420b bVar4 = aVar.f60607a;
                        String str = bVar4.f60615a;
                        int i3 = bVar4.f60616b;
                        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
                        wrap.limit(i2 * 2);
                        C13598b0 b0Var = C13598b0.f38549a;
                        int i4 = aVar.f60610d;
                        long j = aVar.f60614h;
                        long j2 = ((long) 20) + j;
                        aVar.f60614h = j2;
                        long j3 = aVar.f60607a.f60617c;
                        hVar2 = new C109335h(str, i3, wrap, i4, j, j3 == 0 ? 0.0f : Math.min(1.0f, ((float) j2) / ((float) j3)), false);
                    } else if (SilkDoDec == 0) {
                        aVar.f60612f = true;
                        aVar.f60613g = false;
                        aVar.f60607a.f60617c = aVar.f60614h;
                        Log.m105924i(aVar.f60608b, "decode done, duration: " + aVar.f60614h);
                        C21420b bVar5 = aVar.f60607a;
                        String str2 = bVar5.f60615a;
                        int i5 = bVar5.f60616b;
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr3);
                        wrap2.limit(i2 * 2);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        int i6 = aVar.f60610d;
                        long j4 = aVar.f60614h;
                        long j5 = ((long) 20) + j4;
                        aVar.f60614h = j5;
                        long j6 = aVar.f60607a.f60617c;
                        hVar2 = new C109335h(str2, i5, wrap2, i6, j4, j6 == 0 ? 0.0f : Math.min(1.0f, ((float) j5) / ((float) j6)), true);
                    } else {
                        Log.m105920e(aVar.f60608b, "decode error code " + SilkDoDec);
                        aVar.f60611e = true;
                        continue;
                    }
                    hVar = hVar2;
                    continue;
                }
            }
        } while (hVar == null);
        return hVar;
    }
}
