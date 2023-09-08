package p375qh;

import android.media.AudioRecord;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.autogen.events.PermissionOpMarkEvent;
import com.tencent.p014mm.autogen.events.PermissionShowDlgEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import kj2.C117407d;
import p156gj.C107835h0;
import p156gj.C107841m;
import p206nj.C76861g;
import p375qh.C110394i;
import p492dn.C107053k;
import p492dn.C107057m;
import p492dn.C45426j;
import p827uh.C90662b;

/* renamed from: qh.f */
public class C110390f {

    /* renamed from: A */
    public boolean f330214A = false;

    /* renamed from: B */
    public int f330215B = 16;

    /* renamed from: C */
    public int f330216C = 1;

    /* renamed from: D */
    public int f330217D = 0;

    /* renamed from: E */
    public String f330218E;

    /* renamed from: F */
    public long f330219F = -1;

    /* renamed from: G */
    public int f330220G = -1;

    /* renamed from: H */
    public C110394i.C110395a f330221H = new C110391a();

    /* renamed from: a */
    public int f330222a = 0;

    /* renamed from: b */
    public int f330223b = 0;

    /* renamed from: c */
    public int f330224c = 0;

    /* renamed from: d */
    public int f330225d = 0;

    /* renamed from: e */
    public int f330226e = 1;

    /* renamed from: f */
    public int f330227f;

    /* renamed from: g */
    public int f330228g;

    /* renamed from: h */
    public int f330229h = 120;

    /* renamed from: i */
    public boolean f330230i = false;

    /* renamed from: j */
    public boolean f330231j = false;

    /* renamed from: k */
    public int f330232k = 10;

    /* renamed from: l */
    public int f330233l;

    /* renamed from: m */
    public int f330234m = -123456789;

    /* renamed from: n */
    public boolean f330235n = false;

    /* renamed from: o */
    public long f330236o = -1;

    /* renamed from: p */
    public int f330237p;

    /* renamed from: q */
    public boolean f330238q = false;

    /* renamed from: r */
    public int f330239r;

    /* renamed from: s */
    public boolean f330240s = false;

    /* renamed from: t */
    public int f330241t = 0;

    /* renamed from: u */
    public boolean f330242u = false;

    /* renamed from: v */
    public boolean f330243v = false;

    /* renamed from: w */
    public AudioRecord f330244w;

    /* renamed from: x */
    public C89658b f330245x;

    /* renamed from: y */
    public C110394i f330246y;

    /* renamed from: z */
    public C90662b f330247z;

    /* renamed from: qh.f$b */
    public interface C89659b extends C89658b {
    }

    /* renamed from: qh.f$a */
    public class C110391a implements C110394i.C110395a {
        public C110391a() {
        }

        /* renamed from: a */
        public void mo161910a(int i, byte[] bArr) {
            int i2;
            int i3;
            int i4 = i;
            byte[] bArr2 = bArr;
            C110390f fVar = C110390f.this;
            fVar.f330241t++;
            if (fVar.f330243v) {
                long currentTimeMillis = System.currentTimeMillis();
                C110390f fVar2 = C110390f.this;
                if (currentTimeMillis - fVar2.f330236o <= 1000) {
                    long j = (long) (fVar2.f330241t - 10);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    C110390f fVar3 = C110390f.this;
                    if (j > (currentTimeMillis2 - fVar3.f330236o) / ((long) fVar3.f330229h)) {
                        C117407d dVar = C117407d.INSTANCE;
                        dVar.idkeyStat(151, 0, 1, false);
                        dVar.idkeyStat(151, 4, 1, false);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        C110390f fVar4 = C110390f.this;
                        Log.m105921e("MicroMsg.MMPcmRecorder", "return too many data, force stop, %d, %d", Integer.valueOf(C110390f.this.f330241t), Long.valueOf((currentTimeMillis3 - fVar4.f330236o) / ((long) fVar4.f330229h)));
                        C110390f.this.f330242u = true;
                    }
                }
            }
            C90662b bVar = C110390f.this.f330247z;
            if (bVar != null) {
                bVar.mo124806b(bArr2, i4);
            }
            if (i4 > 0) {
                C110390f fVar5 = C110390f.this;
                Class cls = C107053k.class;
                Class cls2 = C45426j.class;
                if (!fVar5.f330238q || -2 != fVar5.f330224c) {
                    int i5 = i4 / fVar5.f330237p;
                    int i6 = 5;
                    while (true) {
                        int i7 = fVar5.f330239r;
                        if (i6 > i5 + i7) {
                            break;
                        }
                        int i8 = fVar5.f330237p;
                        i2 = ((i6 - i7) - 1) * i8;
                        i3 = i8 + i2;
                        if (i2 < 0 || i3 > i4) {
                            Log.m105921e("MicroMsg.MMPcmRecorder", "error start: %d, end: %d", Integer.valueOf(i2), Integer.valueOf(i3));
                        } else {
                            while (true) {
                                if (i2 >= i3) {
                                    break;
                                } else if (bArr2[i2] != 0) {
                                    fVar5.f330224c = -1;
                                    fVar5.f330238q = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            fVar5.f330224c++;
                            i6 += 5;
                        }
                    }
                    Log.m105921e("MicroMsg.MMPcmRecorder", "error start: %d, end: %d", Integer.valueOf(i2), Integer.valueOf(i3));
                    fVar5.f330239r = (fVar5.f330239r + i5) % 5;
                    if (fVar5.f330224c == 20) {
                        fVar5.f330222a = 6;
                        Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_ERROR");
                        int i9 = fVar5.f330223b;
                        if (i9 == -1 && fVar5.f330225d == -1) {
                            fVar5.f330222a = 11;
                            Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
                        } else if (i9 == -1) {
                            fVar5.f330222a = 8;
                            Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_ERROR");
                        } else if (fVar5.f330225d == -1) {
                            fVar5.f330222a = 9;
                            Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_READRET_ERROR");
                        }
                        if (((C45426j) C86312j.m106911c(cls2)).n40().mo157509k().isMicrophoneMute()) {
                            ((C107053k) C86312j.m106911c(cls)).mo146060aE(fVar5.f330233l);
                        }
                        if (((C45426j) C86312j.m106911c(cls2)).n40().mo157510m() || ((C45426j) C86312j.m106911c(cls2)).n40().mo157504C()) {
                            ((C107053k) C86312j.m106911c(cls)).mo146055Qs(fVar5.f330233l);
                        }
                        Log.m105921e("MicroMsg.MMPcmRecorder", "record is mute %s", Boolean.valueOf(((C45426j) C86312j.m106911c(cls2)).n40().mo157509k().isMicrophoneMute()));
                        C117407d dVar2 = C117407d.INSTANCE;
                        dVar2.idkeyStat(151, 0, 1, false);
                        dVar2.idkeyStat(151, 5, 1, false);
                        fVar5.f330224c = -2;
                        fVar5.mo161899d();
                    }
                }
            }
            C110390f fVar6 = C110390f.this;
            if (!fVar6.f330231j) {
                return;
            }
            if (i4 <= 0) {
                int i15 = fVar6.f330225d;
                if (i15 != -1 && i4 < 0) {
                    int i16 = i15 + 1;
                    fVar6.f330225d = i16;
                    if (i16 >= 50) {
                        fVar6.f330222a = 5;
                        Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_READRET_ERROR");
                        int i17 = fVar6.f330224c;
                        if (i17 == -2 && fVar6.f330223b == -1) {
                            fVar6.f330222a = 11;
                            Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
                        } else if (i17 == -2) {
                            fVar6.f330222a = 9;
                            Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_READRET_ERROR");
                        } else if (fVar6.f330223b == -1) {
                            fVar6.f330222a = 10;
                            Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_READRET_ERROR");
                        }
                        C117407d dVar3 = C117407d.INSTANCE;
                        dVar3.idkeyStat(151, 0, 1, false);
                        dVar3.idkeyStat(151, 7, 1, false);
                        fVar6.mo161899d();
                        fVar6.f330225d = -1;
                    }
                }
            } else if (fVar6.f330223b != -1) {
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (i18 >= i4 / 2) {
                        break;
                    }
                    int i25 = i18 * 2;
                    short s = (short) ((bArr2[i25 + 0] & ExifInterface.MARKER) | (bArr2[i25 + 1] << 8));
                    if (s >= 32760 || s == Short.MIN_VALUE) {
                        i19++;
                    }
                    if (i19 >= 5) {
                        fVar6.f330223b++;
                        break;
                    }
                    i18++;
                }
                if (fVar6.f330223b > 100) {
                    fVar6.f330222a = 7;
                    Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_ERROR");
                    int i26 = fVar6.f330224c;
                    if (i26 == -2 && fVar6.f330225d == -1) {
                        fVar6.f330222a = 11;
                        Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
                    } else if (i26 == -2) {
                        fVar6.f330222a = 8;
                        Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_ERROR");
                    } else if (fVar6.f330225d == -1) {
                        fVar6.f330222a = 10;
                        Log.m105920e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_READRET_ERROR");
                    }
                    C117407d dVar4 = C117407d.INSTANCE;
                    dVar4.idkeyStat(151, 0, 1, false);
                    dVar4.idkeyStat(151, 6, 1, false);
                    fVar6.mo161899d();
                    fVar6.f330223b = -1;
                }
            }
        }
    }

    public C110390f(int i, int i2, int i3) {
        int i4;
        this.f330227f = i2;
        this.f330228g = i;
        this.f330233l = i3;
        if (i2 == 2) {
            this.f330215B = 12;
        } else {
            this.f330215B = 16;
        }
        if (i3 == 0 && (i4 = C107835h0.f322856m.f322903j) > 0) {
            this.f330229h = i4;
        }
        C107841m mVar = C107835h0.f322856m;
        int i5 = mVar.f322913t;
        if (i5 > 0) {
            this.f330215B = i5;
        }
        int i6 = mVar.f322899g;
        if (i6 > 0) {
            this.f330232k = i6;
        }
        if (C107835h0.f322846c.f322696J) {
            this.f330247z = new C90662b(C101193k.f296197a, i2, i, 2);
        }
        this.f330243v = ((C107057m) C86312j.m106911c(C107057m.class)).mo146059XY();
        Log.m105925i("MicroMsg.MMPcmRecorder", "MMPcmRecorder sampleRate:%d channelCnt:%d durationPreFrame:%d newBufPreFrame:%b Biz:%d", Integer.valueOf(this.f330228g), Integer.valueOf(this.f330227f), Integer.valueOf(this.f330229h), Boolean.valueOf(this.f330230i), Integer.valueOf(this.f330233l));
    }

    /* renamed from: a */
    public final void mo161896a() {
        Log.m105925i("MicroMsg.MMPcmRecorder", "doNewIDKeyStatOnStopRecord, mRecordDetailState: %d", Integer.valueOf(this.f330222a));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IDKey(357, 0, 1));
        if (this.f330222a != 0) {
            arrayList.add(new IDKey(357, 1, 1));
        }
        switch (this.f330222a) {
            case 1:
                arrayList.add(new IDKey(357, 2, 1));
                break;
            case 2:
                arrayList.add(new IDKey(357, 3, 1));
                break;
            case 3:
                arrayList.add(new IDKey(357, 4, 1));
                break;
            case 4:
                arrayList.add(new IDKey(357, 5, 1));
                break;
            case 5:
                arrayList.add(new IDKey(357, 6, 1));
                break;
            case 6:
                arrayList.add(new IDKey(357, 7, 1));
                break;
            case 7:
                arrayList.add(new IDKey(357, 8, 1));
                break;
            case 8:
                arrayList.add(new IDKey(357, 9, 1));
                break;
            case 9:
                arrayList.add(new IDKey(357, 10, 1));
                break;
            case 10:
                arrayList.add(new IDKey(357, 11, 1));
                break;
            case 11:
                arrayList.add(new IDKey(357, 12, 1));
                break;
            case 12:
                arrayList.add(new IDKey(357, 13, 1));
                break;
        }
        Log.m105925i("MicroMsg.MMPcmRecorder", "do idkey, infolist size: %d", Integer.valueOf(arrayList.size()));
        C117407d.INSTANCE.mo160124a(arrayList, false);
    }

    /* renamed from: b */
    public int mo161897b() {
        C110394i iVar = this.f330246y;
        if (iVar != null) {
            int i = iVar.f330261c;
            this.f330220G = i;
            return i;
        }
        Log.m105925i("MicroMsg.MMPcmRecorder", "getAudioRecordReadNum: return cached num %d", Integer.valueOf(this.f330220G));
        return this.f330220G;
    }

    /* renamed from: c */
    public int mo161898c() {
        int i = this.f330217D;
        if (i > 0) {
            return i;
        }
        int minBufferSize = AudioRecord.getMinBufferSize(this.f330228g, this.f330215B, 2);
        Log.m105925i("MicroMsg.MMPcmRecorder", "getDefaultMinBufferSize minBufSize:%d", Integer.valueOf(minBufferSize));
        if (minBufferSize == -2 || minBufferSize == -1) {
            return 0;
        }
        int i2 = this.f330232k * minBufferSize;
        this.f330217D = i2;
        return i2;
    }

    /* renamed from: d */
    public final void mo161899d() {
        C89658b bVar = this.f330245x;
        if (bVar != null) {
            bVar.mo35509b(this.f330216C, this.f330222a);
        }
    }

    /* renamed from: e */
    public void mo161900e(int i) {
        this.f330226e = i;
        Log.m105924i("MicroMsg.MMPcmRecorder", "mAudioSource: " + i);
    }

    /* renamed from: f */
    public void mo161901f(boolean z) {
        this.f330231j = z;
        Log.m105924i("MicroMsg.MMPcmRecorder", "mCheckAudioQuality: " + this.f330231j);
    }

    /* renamed from: g */
    public void mo161902g(int i) {
        this.f330229h = i;
        Log.m105924i("MicroMsg.MMPcmRecorder", "mDurationPreFrame: " + this.f330229h);
    }

    /* renamed from: h */
    public void mo161903h(int i, boolean z) {
        if (10 == this.f330232k || z) {
            this.f330232k = i;
            Log.m105924i("MicroMsg.MMPcmRecorder", "mMultipleOfMinBuffer: " + this.f330232k);
        }
    }

    /* renamed from: i */
    public void mo161904i(boolean z) {
        this.f330230i = z;
        Log.m105924i("MicroMsg.MMPcmRecorder", "mNewBufPreFrame: " + this.f330230i);
    }

    /* renamed from: j */
    public void mo161905j(boolean z) {
        this.f330235n = z;
        Log.m105924i("MicroMsg.MMPcmRecorder", "mUsePreProcess: " + this.f330235n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:192:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x05d5  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo161906k() {
        /*
            r32 = this;
            r1 = r32
            java.lang.String r2 = ""
            java.lang.Class<dn.k> r3 = p492dn.C107053k.class
            java.lang.String r4 = "MicroMsg.MMPcmRecorder"
            java.lang.String r0 = "startRecord"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.autogen.events.PermissionOpMarkEvent r0 = new com.tencent.mm.autogen.events.PermissionOpMarkEvent
            r0.<init>()
            com.tencent.mm.autogen.events.PermissionOpMarkEvent$a r5 = r0.f264983d
            r6 = 1
            r5.f264986b = r6
            r5.f264985a = r6
            r0.publish()
            long r7 = java.lang.System.currentTimeMillis()
            r1.f330236o = r7
            r5 = 0
            r1.f330238q = r5
            com.tencent.mm.autogen.events.PermissionOpMarkEvent$b r0 = r0.f264984e
            r0.getClass()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = "audio"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.isMicrophoneMute()
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "microphone is mute"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r0 = 14
            r1.f330222a = r0
            com.tencent.mm.autogen.events.MicrophoneMuteDlgEvent r0 = new com.tencent.mm.autogen.events.MicrophoneMuteDlgEvent
            r0.<init>()
            r0.publish()
            kj2.d r0 = kj2.C117407d.INSTANCE
            r14 = 151(0x97, double:7.46E-322)
            r9 = 0
            r16 = 1
            r2 = 0
            r7 = 151(0x97, double:7.46E-322)
            r11 = 1
            r13 = 0
            r6 = r0
            r6.idkeyStat(r7, r9, r11, r13)
            r9 = 8
            r7 = r14
            r11 = r16
            r13 = r2
            r6.idkeyStat(r7, r9, r11, r13)
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            r0.mo146066oh(r2)
            return r5
        L_0x0076:
            r1.f330240s = r5
            java.lang.String r7 = "[error] RECORDER_STARTRECORDING_ERROR"
            nj.g$a r8 = new nj.g$a
            r8.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "startRecord, "
            r0.append(r9)
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()
            r10 = 2
            r9 = r9[r10]
            java.lang.String r9 = r9.getMethodName()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.media.AudioRecord r0 = r1.f330244w
            if (r0 == 0) goto L_0x00b8
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            r0.mo146063hw(r2)
            java.lang.String r0 = "start error ,is recording "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0699
        L_0x00b8:
            r8.mo72289b()
            java.lang.String r0 = "startRecordInternal, start init"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            java.lang.Class<dn.j> r0 = p492dn.C45426j.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dn.j r0 = (p492dn.C45426j) r0
            dn.n r0 = r0.n40()
            r0.mo157512y()
            r1.f330216C = r6
            gj.m r0 = p156gj.C107835h0.f322856m
            int r0 = r0.f322901h
            if (r0 != r10) goto L_0x00d9
            r9 = 0
            goto L_0x00da
        L_0x00d9:
            r9 = 1
        L_0x00da:
            int r0 = p156gj.C107842p.m146108a()
            gj.c r11 = p156gj.C107835h0.f322846c
            int r11 = r11.f322764q0
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00fe
            if (r11 > 0) goto L_0x00e9
            r11 = 0
        L_0x00e9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "CPU ARMv7, enableRecTimerMode: "
            r0.append(r12)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x00ff
        L_0x00fe:
            r11 = 1
        L_0x00ff:
            if (r11 != r6) goto L_0x0103
            r11 = 1
            goto L_0x0104
        L_0x0103:
            r11 = 0
        L_0x0104:
            java.lang.String r0 = "init, start getMinBufferSize"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            int r0 = r1.f330228g
            int r12 = r1.f330215B
            int r12 = android.media.AudioRecord.getMinBufferSize(r0, r12, r10)
            r0 = -2
            if (r12 == r0) goto L_0x059e
            r0 = -1
            if (r12 != r0) goto L_0x011f
            r18 = r7
            r19 = r8
            r2 = 3
            r6 = 0
            goto L_0x05a4
        L_0x011f:
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)
            r15[r5] = r16
            java.lang.String r0 = "finish getMinBufferSize, minBufSize: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r15)
            int r0 = r1.f330228g
            int r15 = r0 * 20
            int r13 = r1.f330227f
            int r15 = r15 * r13
            int r15 = r15 * 2
            int r15 = r15 / 1000
            r1.f330237p = r15
            int r15 = r1.f330229h
            int r0 = r0 * r15
            int r0 = r0 * r13
            int r13 = r0 / 1000
            int r15 = r13 * 2
            r14 = 6
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r12)
            r0[r5] = r18
            int r5 = r1.f330228g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r0[r10] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r18 = 3
            r0[r18] = r5
            int r5 = r1.f330232k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r17 = 4
            r0[r17] = r5
            r5 = 5
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r9)
            r0[r5] = r18
            java.lang.String r5 = "Construct AudioRecord, minBufSize:%d, sampleRate:%d, sampleCntPreFrame:%d, sizePreFrame:%d, timesOfMinBuffer:%d, readMode:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
            int r0 = r1.f330233l
            int r5 = r1.f330226e
            r10 = 7
            if (r6 == r0) goto L_0x0184
            if (r14 == r0) goto L_0x0184
            if (r10 != r0) goto L_0x019e
        L_0x0184:
            gj.c r5 = p156gj.C107835h0.f322846c
            boolean r10 = r5.f322730a
            if (r10 == 0) goto L_0x018c
            r10 = 1
            goto L_0x018d
        L_0x018c:
            r10 = 7
        L_0x018d:
            int r6 = r5.f322684D
            r14 = -1
            if (r6 <= r14) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r6 = r10
        L_0x0194:
            r10 = 6
            if (r10 != r0) goto L_0x019c
            int r5 = r5.f322782z0
            if (r5 <= r14) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r5 = r6
        L_0x019d:
            r6 = 1
        L_0x019e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r10 = 0
            r0[r10] = r6
            java.lang.String r6 = "init audio source: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
            dj.d r0 = new dj.d     // Catch:{ Exception -> 0x01c6 }
            int r6 = r1.f330228g     // Catch:{ Exception -> 0x01c6 }
            int r10 = r1.f330215B     // Catch:{ Exception -> 0x01c6 }
            r28 = 2
            int r14 = r1.f330232k     // Catch:{ Exception -> 0x01c6 }
            int r29 = r14 * r12
            r24 = r0
            r25 = r5
            r26 = r6
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x01c6 }
            r1.f330244w = r0     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0230
        L_0x01c6:
            r0 = move-exception
            java.lang.String r6 = "new AudioRecord failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
            r6 = 12
            r1.f330222a = r6
            java.lang.String r6 = "[error] RECORDER_NEW_AUDIORECORD_EXCEPTION"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
            r6 = 0
            java.lang.Object[] r10 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r10)
            kj2.d r0 = kj2.C117407d.INSTANCE
            r20 = 151(0x97, double:7.46E-322)
            r27 = 0
            r22 = 1
            r6 = 0
            r25 = 151(0x97, double:7.46E-322)
            r29 = 1
            r31 = 0
            r24 = r0
            r24.idkeyStat(r25, r27, r29, r31)
            r27 = 1
            r25 = r20
            r29 = r22
            r31 = r6
            r24.idkeyStat(r25, r27, r29, r31)
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r6 = r1.f330233l
            r0.Kp0(r6, r5)
            r6 = 7
            if (r6 != r5) goto L_0x020a
            r0 = 1
            goto L_0x020b
        L_0x020a:
            r0 = 7
        L_0x020b:
            dj.d r5 = new dj.d     // Catch:{ Exception -> 0x0577 }
            int r6 = r1.f330228g     // Catch:{ Exception -> 0x0577 }
            int r10 = r1.f330215B     // Catch:{ Exception -> 0x0577 }
            r28 = 2
            int r14 = r1.f330232k     // Catch:{ Exception -> 0x0577 }
            int r29 = r14 * r12
            r24 = r5
            r25 = r0
            r26 = r6
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0577 }
            r1.f330244w = r5     // Catch:{ Exception -> 0x0577 }
            di3.d r5 = di3.C86312j.m106911c(r3)
            dn.k r5 = (p492dn.C107053k) r5
            int r6 = r1.f330233l
            r5.mo146062hu(r6, r0)
            r5 = r0
        L_0x0230:
            android.media.AudioRecord r0 = r1.f330244w
            int r0 = r0.getState()
            if (r0 != 0) goto L_0x0284
            kj2.d r0 = kj2.C117407d.INSTANCE
            r20 = 151(0x97, double:7.46E-322)
            r27 = 0
            r22 = 1
            r6 = 0
            r25 = 151(0x97, double:7.46E-322)
            r29 = 1
            r31 = 0
            r24 = r0
            r24.idkeyStat(r25, r27, r29, r31)
            r27 = 2
            r25 = r20
            r29 = r22
            r31 = r6
            r24.idkeyStat(r25, r27, r29, r31)
            android.media.AudioRecord r0 = r1.f330244w
            r0.release()
            r6 = 2
            r1.f330222a = r6
            java.lang.String r0 = "[error] RECORDER_NEWAUDIORECORD_ERROR"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r6 = 7
            if (r6 != r5) goto L_0x0269
            r0 = 1
            goto L_0x026a
        L_0x0269:
            r0 = 0
        L_0x026a:
            dj.d r5 = new dj.d
            int r6 = r1.f330228g
            int r10 = r1.f330215B
            r28 = 2
            int r14 = r1.f330232k
            int r29 = r14 * r12
            r24 = r5
            r25 = r0
            r26 = r6
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29)
            r1.f330244w = r5
            r5 = r0
        L_0x0284:
            android.media.AudioRecord r0 = r1.f330244w
            int r0 = r0.getState()
            r6 = 0
            if (r0 != 0) goto L_0x02d3
            kj2.d r0 = kj2.C117407d.INSTANCE
            r9 = 151(0x97, double:7.46E-322)
            r27 = 0
            r11 = 1
            r2 = 0
            r25 = 151(0x97, double:7.46E-322)
            r29 = 1
            r31 = 0
            r24 = r0
            r24.idkeyStat(r25, r27, r29, r31)
            r27 = 2
            r25 = r9
            r29 = r11
            r31 = r2
            r24.idkeyStat(r25, r27, r29, r31)
            android.media.AudioRecord r0 = r1.f330244w
            r0.release()
            r1.f330244w = r6
            r2 = 2
            r1.f330216C = r2
            r2 = 3
            r1.f330222a = r2
            java.lang.String r0 = "[error] RECORDER_SECNEWAUDIORECORD_ERROR"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r32.mo161899d()
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            r0.Vn0(r2)
            r18 = r7
            r19 = r8
            r6 = 0
            goto L_0x05cb
        L_0x02d3:
            if (r9 == 0) goto L_0x02fc
            qh.h r0 = new qh.h
            android.media.AudioRecord r9 = r1.f330244w
            boolean r10 = r1.f330230i
            qh.b r12 = r1.f330245x
            int r13 = r1.f330233l
            r14 = 1
            if (r13 == r14) goto L_0x02e5
            r14 = 6
            if (r13 != r14) goto L_0x02ea
        L_0x02e5:
            if (r11 == 0) goto L_0x02ea
            r23 = 1
            goto L_0x02ec
        L_0x02ea:
            r23 = 0
        L_0x02ec:
            r18 = r0
            r19 = r9
            r20 = r10
            r21 = r15
            r22 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            r1.f330246y = r0
            goto L_0x0315
        L_0x02fc:
            qh.g r0 = new qh.g
            android.media.AudioRecord r9 = r1.f330244w
            qh.b r10 = r1.f330245x
            boolean r11 = r1.f330230i
            r18 = r0
            r19 = r9
            r20 = r10
            r21 = r11
            r22 = r13
            r23 = r15
            r18.<init>(r19, r20, r21, r22, r23)
            r1.f330246y = r0
        L_0x0315:
            qh.i r0 = r1.f330246y
            qh.i$a r9 = r1.f330221H
            r0.f330259a = r9
            r9 = -123456789(0xfffffffff8a432eb, float:-2.6642794E34)
            int r10 = r1.f330234m
            if (r9 == r10) goto L_0x0324
            r0.f330260b = r10
        L_0x0324:
            boolean r0 = r1.f330235n
            if (r0 == 0) goto L_0x0563
            android.media.AudioRecord r9 = r1.f330244w
            int r0 = r1.f330233l
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "api "
            r10.append(r11)
            int r11 = android.os.Build.VERSION.SDK_INT
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.MMAudioPreProcess"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r10)
            r10 = 16
            boolean r10 = p206nj.C11171e.m11044a(r10)
            if (r10 == 0) goto L_0x034e
            goto L_0x0563
        L_0x034e:
            if (r9 != 0) goto L_0x0357
            java.lang.String r0 = "audio is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            goto L_0x0563
        L_0x0357:
            java.lang.String r10 = "disable by config"
            java.lang.String r12 = "MicroMsg.MMAutomaticGainControl"
            java.lang.String r13 = "MicroMsg.MMAcousticEchoCanceler"
            java.lang.String r14 = "MicroMsg.MMNoiseSuppressor"
            java.lang.String r15 = "setEnabled failed "
            java.lang.String r6 = "available  "
            r18 = r7
            r7 = 1
            if (r7 != r0) goto L_0x046f
            gj.m r0 = p156gj.C107835h0.f322856m
            r19 = r8
            int r8 = r0.f322861A
            if (r8 == r7) goto L_0x0375
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r10)
            goto L_0x046c
        L_0x0375:
            int r0 = r0.f322862B
            r7 = 2
            if (r0 == r7) goto L_0x03c6
            boolean r0 = android.media.audiofx.NoiseSuppressor.isAvailable()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r7)
            if (r0 == 0) goto L_0x039b
            int r0 = r9.getAudioSessionId()
            android.media.audiofx.NoiseSuppressor r0 = android.media.audiofx.NoiseSuppressor.create(r0)
            goto L_0x039c
        L_0x039b:
            r0 = 0
        L_0x039c:
            boolean r7 = android.media.audiofx.NoiseSuppressor.isAvailable()
            if (r7 == 0) goto L_0x03c6
            if (r0 == 0) goto L_0x03c6
            r7 = 1
            int r0 = r0.setEnabled(r7)     // Catch:{ Exception -> 0x03bf }
            if (r0 != 0) goto L_0x03ac
            goto L_0x03c6
        L_0x03ac:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03bf }
            r7.<init>()     // Catch:{ Exception -> 0x03bf }
            r7.append(r15)     // Catch:{ Exception -> 0x03bf }
            r7.append(r0)     // Catch:{ Exception -> 0x03bf }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x03bf }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)     // Catch:{ Exception -> 0x03bf }
            goto L_0x03c6
        L_0x03bf:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r2, r8)
        L_0x03c6:
            gj.m r0 = p156gj.C107835h0.f322856m
            int r0 = r0.f322863C
            r7 = 2
            if (r0 == r7) goto L_0x0419
            boolean r0 = android.media.audiofx.AcousticEchoCanceler.isAvailable()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r7)
            if (r0 == 0) goto L_0x03ee
            int r0 = r9.getAudioSessionId()
            android.media.audiofx.AcousticEchoCanceler r0 = android.media.audiofx.AcousticEchoCanceler.create(r0)
            goto L_0x03ef
        L_0x03ee:
            r0 = 0
        L_0x03ef:
            boolean r7 = android.media.audiofx.AcousticEchoCanceler.isAvailable()
            if (r7 == 0) goto L_0x0419
            if (r0 == 0) goto L_0x0419
            r7 = 1
            int r0 = r0.setEnabled(r7)     // Catch:{ Exception -> 0x0412 }
            if (r0 != 0) goto L_0x03ff
            goto L_0x0419
        L_0x03ff:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0412 }
            r7.<init>()     // Catch:{ Exception -> 0x0412 }
            r7.append(r15)     // Catch:{ Exception -> 0x0412 }
            r7.append(r0)     // Catch:{ Exception -> 0x0412 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0412 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)     // Catch:{ Exception -> 0x0412 }
            goto L_0x0419
        L_0x0412:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r2, r8)
        L_0x0419:
            gj.m r0 = p156gj.C107835h0.f322856m
            int r0 = r0.f322864D
            r7 = 2
            if (r0 == r7) goto L_0x046c
            boolean r0 = android.media.audiofx.AutomaticGainControl.isAvailable()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r0)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r6)
            if (r0 == 0) goto L_0x0441
            int r0 = r9.getAudioSessionId()
            android.media.audiofx.AutomaticGainControl r6 = android.media.audiofx.AutomaticGainControl.create(r0)
            goto L_0x0442
        L_0x0441:
            r6 = 0
        L_0x0442:
            boolean r0 = android.media.audiofx.AutomaticGainControl.isAvailable()
            if (r0 == 0) goto L_0x046c
            if (r6 == 0) goto L_0x046c
            r7 = 1
            int r0 = r6.setEnabled(r7)     // Catch:{ Exception -> 0x0465 }
            if (r0 != 0) goto L_0x0452
            goto L_0x046c
        L_0x0452:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0465 }
            r6.<init>()     // Catch:{ Exception -> 0x0465 }
            r6.append(r15)     // Catch:{ Exception -> 0x0465 }
            r6.append(r0)     // Catch:{ Exception -> 0x0465 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0465 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)     // Catch:{ Exception -> 0x0465 }
            goto L_0x046c
        L_0x0465:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r2, r7)
        L_0x046c:
            r6 = 0
            goto L_0x0569
        L_0x046f:
            r19 = r8
            gj.m r0 = p156gj.C107835h0.f322856m
            int r0 = r0.f322902i
            r7 = 1
            if (r0 == r7) goto L_0x047c
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r10)
            goto L_0x046c
        L_0x047c:
            boolean r0 = android.media.audiofx.NoiseSuppressor.isAvailable()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r7)
            if (r0 == 0) goto L_0x049d
            int r0 = r9.getAudioSessionId()
            android.media.audiofx.NoiseSuppressor r0 = android.media.audiofx.NoiseSuppressor.create(r0)
            goto L_0x049e
        L_0x049d:
            r0 = 0
        L_0x049e:
            boolean r7 = android.media.audiofx.NoiseSuppressor.isAvailable()
            if (r7 == 0) goto L_0x04c8
            if (r0 == 0) goto L_0x04c8
            r7 = 1
            int r0 = r0.setEnabled(r7)     // Catch:{ Exception -> 0x04c1 }
            if (r0 != 0) goto L_0x04ae
            goto L_0x04c8
        L_0x04ae:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04c1 }
            r7.<init>()     // Catch:{ Exception -> 0x04c1 }
            r7.append(r15)     // Catch:{ Exception -> 0x04c1 }
            r7.append(r0)     // Catch:{ Exception -> 0x04c1 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x04c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)     // Catch:{ Exception -> 0x04c1 }
            goto L_0x04c8
        L_0x04c1:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r2, r8)
        L_0x04c8:
            boolean r0 = android.media.audiofx.AcousticEchoCanceler.isAvailable()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r7)
            if (r0 == 0) goto L_0x04e9
            int r0 = r9.getAudioSessionId()
            android.media.audiofx.AcousticEchoCanceler r0 = android.media.audiofx.AcousticEchoCanceler.create(r0)
            goto L_0x04ea
        L_0x04e9:
            r0 = 0
        L_0x04ea:
            boolean r7 = android.media.audiofx.AcousticEchoCanceler.isAvailable()
            if (r7 == 0) goto L_0x0514
            if (r0 == 0) goto L_0x0514
            r7 = 1
            int r0 = r0.setEnabled(r7)     // Catch:{ Exception -> 0x050d }
            if (r0 != 0) goto L_0x04fa
            goto L_0x0514
        L_0x04fa:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x050d }
            r7.<init>()     // Catch:{ Exception -> 0x050d }
            r7.append(r15)     // Catch:{ Exception -> 0x050d }
            r7.append(r0)     // Catch:{ Exception -> 0x050d }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x050d }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)     // Catch:{ Exception -> 0x050d }
            goto L_0x0514
        L_0x050d:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r2, r8)
        L_0x0514:
            boolean r0 = android.media.audiofx.AutomaticGainControl.isAvailable()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r0)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r6)
            if (r0 == 0) goto L_0x0535
            int r0 = r9.getAudioSessionId()
            android.media.audiofx.AutomaticGainControl r6 = android.media.audiofx.AutomaticGainControl.create(r0)
            goto L_0x0536
        L_0x0535:
            r6 = 0
        L_0x0536:
            boolean r0 = android.media.audiofx.AutomaticGainControl.isAvailable()
            if (r0 == 0) goto L_0x046c
            if (r6 == 0) goto L_0x046c
            r7 = 1
            int r0 = r6.setEnabled(r7)     // Catch:{ Exception -> 0x055b }
            if (r0 != 0) goto L_0x0547
            goto L_0x046c
        L_0x0547:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x055b }
            r6.<init>()     // Catch:{ Exception -> 0x055b }
            r6.append(r15)     // Catch:{ Exception -> 0x055b }
            r6.append(r0)     // Catch:{ Exception -> 0x055b }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x055b }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)     // Catch:{ Exception -> 0x055b }
            goto L_0x046c
        L_0x055b:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r2, r7)
            goto L_0x0569
        L_0x0563:
            r18 = r7
            r19 = r8
            goto L_0x046c
        L_0x0569:
            boolean r0 = r1.f330214A
            if (r0 == 0) goto L_0x0573
            qh.i r0 = r1.f330246y
            r2 = 1
            r0.mo35182c(r2)
        L_0x0573:
            r1.f330226e = r5
            r0 = 1
            goto L_0x05cc
        L_0x0577:
            r18 = r7
            r19 = r8
            r6 = 0
            di3.d r2 = di3.C86312j.m106911c(r3)
            dn.k r2 = (p492dn.C107053k) r2
            int r5 = r1.f330233l
            r2.Kp0(r5, r0)
            di3.d r2 = di3.C86312j.m106911c(r3)
            dn.k r2 = (p492dn.C107053k) r2
            int r5 = r1.f330233l
            r2.mo146064lu(r5, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            r0.Vn0(r2)
            goto L_0x05cb
        L_0x059e:
            r18 = r7
            r19 = r8
            r6 = 0
            r2 = 3
        L_0x05a4:
            r1.f330216C = r2
            r2 = 1
            r1.f330222a = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[error] RECORDER_MINBUFFER_ERROR "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r32.mo161899d()
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            r0.mo146057UF(r2)
        L_0x05cb:
            r0 = 0
        L_0x05cc:
            if (r0 != 0) goto L_0x05d5
            java.lang.String r0 = "startRecord init error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0698
        L_0x05d5:
            long r7 = r19.mo72288a()
            r1.f330219F = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "init cost: "
            r0.append(r2)
            long r7 = r1.f330219F
            r0.append(r7)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r19.mo72289b()
            android.media.AudioRecord r7 = r1.f330244w     // Catch:{ Exception -> 0x067a }
            java.lang.String r8 = "com/tencent/mm/audio/recorder/MMPcmRecorder"
            java.lang.String r9 = "startRecordInternal"
            java.lang.String r10 = "()Z"
            java.lang.String r11 = "android/media/AudioRecord"
            java.lang.String r12 = "startRecording"
            java.lang.String r13 = "()V"
            j20.C117292a.m165363i(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x067a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "startRecording cost: "
            r0.append(r2)
            long r7 = r19.mo72288a()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.media.AudioRecord r0 = r1.f330244w
            int r0 = r0.getRecordingState()
            r2 = 3
            if (r0 == r2) goto L_0x0660
            kj2.d r0 = kj2.C117407d.INSTANCE
            r15 = 151(0x97, double:7.46E-322)
            r10 = 0
            r19 = 1
            r2 = 0
            r8 = 151(0x97, double:7.46E-322)
            r12 = 1
            r14 = 0
            r7 = r0
            r7.idkeyStat(r8, r10, r12, r14)
            r10 = 3
            r8 = r15
            r12 = r19
            r14 = r2
            r7.idkeyStat(r8, r10, r12, r14)
            r2 = 2
            r1.f330216C = r2
            r2 = 4
            r1.f330222a = r2
            r2 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
            r32.mo161899d()
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            r0.wu0(r2)
            goto L_0x0698
        L_0x0660:
            qh.i r0 = r1.f330246y
            if (r0 == 0) goto L_0x0669
            boolean r5 = r0.mo35180a()
            goto L_0x0699
        L_0x0669:
            java.lang.String r0 = "mRecordMode is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            r0.mo146061eB(r2)
            goto L_0x0698
        L_0x067a:
            r2 = r18
            java.lang.String r0 = "start error cause permission deny"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r5 = 2
            r1.f330216C = r5
            r5 = 4
            r1.f330222a = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
            r32.mo161899d()
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            r0.wu0(r2)
        L_0x0698:
            r5 = 0
        L_0x0699:
            if (r5 != 0) goto L_0x06b4
            r32.mo161907l()
            int r0 = r1.f330233l
            r2 = 1
            if (r0 != r2) goto L_0x06a7
            r32.mo161899d()
            goto L_0x06c5
        L_0x06a7:
            com.tencent.mm.autogen.events.PermissionShowDlgEvent r0 = new com.tencent.mm.autogen.events.PermissionShowDlgEvent
            r0.<init>()
            com.tencent.mm.autogen.events.PermissionShowDlgEvent$a r3 = r0.f264988d
            r3.f264990a = r2
            r0.publish()
            goto L_0x06c5
        L_0x06b4:
            di3.d r0 = di3.C86312j.m106911c(r3)
            dn.k r0 = (p492dn.C107053k) r0
            int r2 = r1.f330233l
            android.media.AudioRecord r3 = r1.f330244w
            int r3 = r3.getAudioSource()
            r0.mo146065oS(r2, r3)
        L_0x06c5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p375qh.C110390f.mo161906k():boolean");
    }

    /* renamed from: l */
    public synchronized boolean mo161907l() {
        boolean z;
        if (true == this.f330240s) {
            Log.m105924i("MicroMsg.MMPcmRecorder", "already have stopped");
            return true;
        }
        this.f330240s = true;
        boolean m = mo161908m();
        if ((this.f330238q || -1 == this.f330236o || System.currentTimeMillis() - this.f330236o < 2000) && !this.f330242u) {
            z = true;
        } else {
            Log.m105924i("MicroMsg.MMPcmRecorder", "stopRecord publish PermissionShowDlgEvent");
            PermissionShowDlgEvent permissionShowDlgEvent = new PermissionShowDlgEvent();
            permissionShowDlgEvent.f264988d.f264990a = 1;
            permissionShowDlgEvent.publish();
            z = false;
        }
        PermissionOpMarkEvent permissionOpMarkEvent = new PermissionOpMarkEvent();
        PermissionOpMarkEvent.C92541a aVar = permissionOpMarkEvent.f264983d;
        aVar.f264986b = 1;
        aVar.f264985a = false;
        aVar.f264987c = z;
        permissionOpMarkEvent.publish();
        mo161896a();
        return m;
    }

    /* renamed from: m */
    public final boolean mo161908m() {
        Class cls = C107053k.class;
        C76861g.C47263a aVar = new C76861g.C47263a();
        C90662b bVar = this.f330247z;
        if (bVar != null) {
            bVar.mo124805a();
            this.f330247z = null;
        }
        aVar.mo72289b();
        C110394i iVar = this.f330246y;
        if (iVar != null) {
            iVar.mo35181b();
            this.f330246y = null;
        }
        this.f330214A = false;
        Log.m105924i("MicroMsg.MMPcmRecorder", "cost " + aVar.mo72288a() + "ms to call stopRecord");
        StringBuilder sb = new StringBuilder();
        sb.append("stopRecord, ");
        sb.append(Thread.currentThread().getStackTrace()[2].getMethodName());
        Log.m105924i("MicroMsg.MMPcmRecorder", sb.toString());
        AudioRecord audioRecord = this.f330244w;
        if (audioRecord == null) {
            Log.m105920e("MicroMsg.MMPcmRecorder", "audioRecord is null");
            return false;
        } else if (audioRecord.getState() != 1) {
            Log.m105920e("MicroMsg.MMPcmRecorder", "audioRecord sate error " + this.f330244w.getState());
            return false;
        } else {
            if (this.f330218E != null) {
                int i = this.f330233l;
                if (i == 0) {
                    ((C107053k) C86312j.m106911c(cls)).mo146056To(0, 0, this.f330218E, this.f330226e, this.f330228g, this.f330215B, this.f330222a);
                    ((C107053k) C86312j.m106911c(cls)).yd0(this.f330233l);
                    ((C107053k) C86312j.m106911c(cls)).Q80(this.f330233l);
                } else if (i == 1) {
                    ((C107053k) C86312j.m106911c(cls)).mo146056To(0, 1, this.f330218E, this.f330226e, this.f330228g, this.f330215B, this.f330222a);
                    ((C107053k) C86312j.m106911c(cls)).yd0(this.f330233l);
                    ((C107053k) C86312j.m106911c(cls)).Q80(this.f330233l);
                }
            }
            aVar.mo72289b();
            this.f330244w.stop();
            this.f330244w.release();
            this.f330244w = null;
            Log.m105924i("MicroMsg.MMPcmRecorder", "cost " + aVar.mo72288a() + "ms to call stop and release");
            return true;
        }
    }

    /* renamed from: n */
    public void mo161909n(boolean z) {
        this.f330214A = z;
        Log.m105924i("MicroMsg.MMPcmRecorder", "switchMute mute:" + z + ", mRecordMode=" + this.f330246y);
        C110394i iVar = this.f330246y;
        if (iVar != null) {
            iVar.mo35182c(z);
        }
    }
}
