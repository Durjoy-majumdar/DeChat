package nd0;

import android.content.SharedPreferences;
import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82341m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import j20.C117292a;
import java.util.Locale;
import k20.C9556a;
import p1212r9.C118228a;

/* renamed from: nd0.b */
public class C117623b {

    /* renamed from: n */
    public static SharedPreferences f351854n = MMApplicationContext.getDefaultPreference();

    /* renamed from: a */
    public boolean f351855a;

    /* renamed from: b */
    public int f351856b;

    /* renamed from: c */
    public boolean f351857c;

    /* renamed from: d */
    public boolean f351858d;

    /* renamed from: e */
    public long f351859e;

    /* renamed from: f */
    public int f351860f;

    /* renamed from: g */
    public boolean f351861g;

    /* renamed from: h */
    public MMHandler f351862h;

    /* renamed from: i */
    public Runnable f351863i;

    /* renamed from: j */
    public C117622a f351864j;

    /* renamed from: k */
    public C118228a f351865k;

    /* renamed from: l */
    public C117625b f351866l;

    /* renamed from: m */
    public short[] f351867m;

    /* renamed from: nd0.b$a */
    public class C117624a implements Runnable {
        public C117624a() {
        }

        public void run() {
            C117625b bVar = C117623b.this.f351866l;
            if (bVar != null) {
                bVar.mo127259a();
            }
        }
    }

    /* renamed from: nd0.b$b */
    public interface C117625b {
        /* renamed from: a */
        void mo127259a();

        /* renamed from: b */
        void mo127260b(short[] sArr, int i);

        /* renamed from: c */
        void mo127261c(long j);

        /* renamed from: d */
        void mo127262d(long j);
    }

    public C117623b(int i, int i2, boolean z, boolean z2) {
        this(i, i2, f351854n.getInt("sil_time", 1000), f351854n.getFloat("s_n_ration", 2.5f), f351854n.getInt("s_window", 500), f351854n.getInt("s_length", TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE), f351854n.getInt("s_delay_time", C82341m.CTRL_INDEX), 4000, z, z2);
    }

    /* renamed from: a */
    public static String m165899a() {
        return String.format(Locale.CHINA, "%s: %s\n%s: %s\n%s: %s\n%s: %s\n%s: %s", new Object[]{"sil_time", Integer.valueOf(f351854n.getInt("sil_time", 500)), "s_n_ration", Float.valueOf(f351854n.getFloat("s_n_ration", 2.5f)), "s_window", Integer.valueOf(f351854n.getInt("s_window", 500)), "s_length", Integer.valueOf(f351854n.getInt("s_length", TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE)), "s_delay_time", Integer.valueOf(f351854n.getInt("s_delay_time", C82341m.CTRL_INDEX))});
    }

    /* renamed from: b */
    public void mo182348b(short[] sArr, int i) {
        C117625b bVar;
        int i2;
        int i3;
        Log.m105919d("b", "input() called with: voice = [%s], length = [%s]", sArr, Integer.valueOf(i));
        if (sArr != null && sArr.length != 0 && i > 0 && i <= sArr.length) {
            if (this.f351861g) {
                Log.m105924i("b", "VoiceSilentDetectAPI is released.");
            } else if (this.f351864j == null) {
                Log.m105924i("b", "input, circleBuffer is null.");
            } else {
                C118228a aVar = this.f351865k;
                long j = aVar.f353389a;
                int AddData = j == 0 ? 1 : C118228a.f353388d ? aVar.f353391c.AddData(j, sArr, i) : aVar.f353390b.AddData(j, sArr, i);
                Log.m105919d("b", "currState = %s,prevState = %s,directFirstStart = %s,directTempState = %s", Integer.valueOf(AddData), Integer.valueOf(this.f351856b), Boolean.valueOf(this.f351857c), Boolean.valueOf(this.f351858d));
                if (this.f351857c) {
                    if (this.f351858d) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C117625b bVar2 = this.f351866l;
                        if (bVar2 != null) {
                            bVar2.mo127262d(currentTimeMillis - this.f351859e);
                        }
                        this.f351859e = currentTimeMillis;
                        if (!this.f351861g) {
                            int i4 = this.f351864j.f351852c;
                            int length = this.f351867m.length;
                            while (i4 > 0) {
                                int i5 = length > i4 ? i4 : length;
                                this.f351864j.mo182347a(this.f351867m, i5);
                                i4 -= i5;
                                C117625b bVar3 = this.f351866l;
                                if (bVar3 != null) {
                                    bVar3.mo127260b(this.f351867m, i5);
                                }
                            }
                            this.f351858d = false;
                            mo182351e();
                            mo182349c(this.f351860f);
                        } else {
                            return;
                        }
                    } else {
                        int i6 = this.f351856b;
                        if (i6 == 3 && AddData == 2) {
                            this.f351857c = false;
                        }
                        if (!(i6 == 3 && AddData == 3)) {
                            mo182351e();
                            mo182349c(this.f351860f);
                        }
                    }
                    this.f351855a = false;
                    this.f351856b = AddData;
                } else {
                    int i7 = this.f351856b;
                    if (i7 == 3 && AddData == 2) {
                        this.f351856b = AddData;
                        mo182351e();
                        mo182349c(this.f351860f);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        C117625b bVar4 = this.f351866l;
                        if (bVar4 != null) {
                            bVar4.mo127262d(currentTimeMillis2 - this.f351859e);
                        }
                        this.f351859e = currentTimeMillis2;
                        if (!this.f351861g) {
                            int i8 = this.f351864j.f351852c;
                            int length2 = this.f351867m.length;
                            while (i8 > 0) {
                                int i9 = length2 > i8 ? i8 : length2;
                                this.f351864j.mo182347a(this.f351867m, i9);
                                i8 -= i9;
                                C117625b bVar5 = this.f351866l;
                                if (bVar5 != null) {
                                    bVar5.mo127260b(this.f351867m, i9);
                                }
                            }
                            this.f351855a = false;
                        } else {
                            return;
                        }
                    } else if (i7 == 2 && AddData == 3) {
                        this.f351856b = AddData;
                        this.f351855a = true;
                        mo182351e();
                        mo182349c(this.f351860f);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        C117625b bVar6 = this.f351866l;
                        if (bVar6 != null) {
                            bVar6.mo127261c(currentTimeMillis3 - this.f351859e);
                        }
                        this.f351859e = currentTimeMillis3;
                        if (this.f351861g) {
                            return;
                        }
                    } else if (i7 == 3 && AddData == 3) {
                        this.f351855a = true;
                    } else if (i7 == 2 && AddData == 2) {
                        this.f351855a = false;
                        mo182351e();
                        mo182349c(this.f351860f);
                    }
                }
                if (!this.f351861g) {
                    C117622a aVar2 = this.f351864j;
                    aVar2.getClass();
                    if (sArr.length >= 0) {
                        int length3 = i > sArr.length - 0 ? sArr.length - 0 : i;
                        if (length3 != 0) {
                            short[] sArr2 = aVar2.f351853d;
                            int length4 = sArr2.length;
                            int i15 = aVar2.f351852c;
                            int i16 = length4 - i15;
                            if (length3 > i16 && (i3 = length3 - i16) != 0) {
                                if (i3 >= i15) {
                                    i3 = i15;
                                }
                                int length5 = sArr2.length;
                                int i17 = aVar2.f351850a;
                                if (i3 <= length5 - i17) {
                                    int i18 = i17 + i3;
                                    aVar2.f351850a = i18;
                                    if (i18 >= sArr2.length) {
                                        aVar2.f351850a = 0;
                                    }
                                } else {
                                    aVar2.f351850a = i3 - (sArr2.length - i17);
                                }
                                aVar2.f351852c = i15 - i3;
                            }
                            if (length3 > sArr2.length) {
                                int length6 = sArr2.length;
                                i2 = (length3 - sArr2.length) + 0;
                                length3 = length6;
                            } else {
                                i2 = 0;
                            }
                            int length7 = sArr2.length;
                            int i19 = aVar2.f351851b;
                            if (length3 <= length7 - i19) {
                                System.arraycopy(sArr, i2, sArr2, i19, length3);
                                int i25 = aVar2.f351851b + length3;
                                aVar2.f351851b = i25;
                                if (i25 >= aVar2.f351853d.length) {
                                    aVar2.f351851b = 0;
                                }
                            } else {
                                int length8 = sArr2.length - i19;
                                System.arraycopy(sArr, i2, sArr2, i19, length8);
                                int i26 = length3 - length8;
                                System.arraycopy(sArr, i2 + length8, aVar2.f351853d, 0, i26);
                                aVar2.f351851b = i26;
                            }
                            aVar2.f351852c += length3;
                        }
                    }
                    Log.m105919d("b", "isSilent %s", Boolean.valueOf(this.f351855a));
                    if (!this.f351855a && (bVar = this.f351866l) != null) {
                        bVar.mo127260b(sArr, i);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo182349c(int i) {
        this.f351862h.postDelayed(this.f351863i, (long) i);
    }

    /* renamed from: d */
    public void mo182350d() {
        Log.m105918d("b", "released");
        this.f351861g = true;
        this.f351857c = false;
        this.f351858d = false;
        C118228a aVar = this.f351865k;
        if (aVar != null) {
            long j = aVar.f353389a;
            if ((j == 0 ? 1 : C118228a.f353388d ? aVar.f353391c.Release(j) : aVar.f353390b.Release(j)) != 1) {
                this.f351865k = null;
            } else {
                throw new RuntimeException();
            }
        }
        this.f351864j = null;
        this.f351867m = null;
        if (this.f351862h != null) {
            mo182351e();
            this.f351862h = null;
        }
        this.f351866l = null;
    }

    /* renamed from: e */
    public final void mo182351e() {
        this.f351862h.removeCallbacks(this.f351863i);
    }

    public C117623b(int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        int i8;
        this.f351855a = true;
        this.f351856b = 3;
        boolean z3 = false;
        this.f351857c = false;
        this.f351858d = false;
        this.f351859e = 0;
        this.f351860f = NetworkMonitorReceiver.MSG_DELAY_TIME;
        this.f351861g = false;
        this.f351862h = new MMHandler(Looper.getMainLooper());
        this.f351863i = new C117624a();
        this.f351864j = null;
        this.f351865k = null;
        this.f351860f = i;
        this.f351865k = new C118228a();
        Log.m105925i("b", "VoiceSilentDetectAPI: abTestFlag = [%s]", 0);
        this.f351865k.getClass();
        C118228a.f353388d = false;
        C9556a aVar = new C9556a();
        aVar.mo10233c("EVadEmbed");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/qq/wx/voice/vad/EVad", "loadLib", "(Z)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/qq/wx/voice/vad/EVad", "loadLib", "(Z)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C118228a aVar2 = this.f351865k;
        if (C118228a.f353388d) {
            aVar2.f353389a = aVar2.f353391c.Init(i2, i3, f, i4, i5);
        } else {
            aVar2.f353389a = aVar2.f353390b.Init(i2, i3, f, i4, i5);
        }
        if (!(aVar2.f353389a == 0 ? true : z3)) {
            C118228a aVar3 = this.f351865k;
            long j = aVar3.f353389a;
            if (j == 0) {
                i8 = 1;
            } else if (C118228a.f353388d) {
                i8 = aVar3.f353391c.Reset(j);
            } else {
                i8 = aVar3.f353390b.Reset(j);
            }
            if (i8 != 1) {
                this.f351864j = new C117622a((i2 / 1000) * i6);
                this.f351867m = new short[i7];
                mo182351e();
                mo182349c(i);
                this.f351857c = z;
                this.f351858d = z2;
                return;
            }
        }
        throw new RuntimeException("Init ERROR");
    }
}
