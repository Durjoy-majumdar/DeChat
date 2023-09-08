package com.tencent.p014mm.plugin.voip.model;

import android.media.AudioTrack;
import android.os.Process;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import lu3.C88654b;
import p1155sh.C110787a;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.c */
public class C106334c extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C106336d f317176e;

    public C106334c(C106336d dVar) {
        this.f317176e = dVar;
    }

    public String getKey() {
        return "AudioPlayer_play";
    }

    public void run() {
        String str;
        C110787a aVar;
        AudioTrack audioTrack;
        int i;
        int i2;
        C106336d dVar;
        AudioTrack audioTrack2;
        C110787a aVar2;
        C110787a aVar3;
        Process.setThreadPriority(-19);
        Log.m105918d("MicroMsg.Voip.AudioPlayer", "AudioPlayer enter  to start....");
        int i3 = 0;
        while (true) {
            C106336d dVar2 = this.f317176e;
            if (!dVar2.f317196a || (audioTrack = dVar2.f317210o) == null || audioTrack.getPlayState() == 1 || this.f317176e.f317211p.get()) {
                C106336d dVar3 = this.f317176e;
            } else {
                try {
                    i = this.f317176e.f317210o.getPlaybackHeadPosition();
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.Voip.AudioPlayer", "getPlaybackHeadPosition: ", e);
                    this.f317176e.f317189L = 7;
                    i = 0;
                }
                long currentTimeMillis = System.currentTimeMillis();
                C106336d dVar4 = this.f317176e;
                int i4 = dVar4.f317219x - i;
                dVar4.f317221z = i4;
                Log.m105919d("MicroMsg.Voip.AudioPlayer", "m_iLefSamples value is %s and iPos value is %s", Integer.valueOf(i4), Integer.valueOf(i));
                C106336d dVar5 = this.f317176e;
                if (dVar5.f317179B == 1) {
                    dVar5.f317180C = i;
                    dVar5.f317181D = currentTimeMillis;
                    dVar5.f317179B = 0;
                } else {
                    int i5 = i - dVar5.f317180C;
                    int i6 = dVar5.f317184G;
                    if (i5 > i6) {
                        dVar5.f317184G = i5;
                    } else {
                        dVar5.f317184G = (int) (((((float) i6) * 49999.0f) / 50000.0f) + (((float) i5) / 50000.0f));
                    }
                    if (dVar5.f317221z == 0) {
                        dVar5.f317183F += dVar5.f317178A;
                    } else if (currentTimeMillis > dVar5.f317181D + FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                        dVar5.f317181D = currentTimeMillis;
                        int i7 = dVar5.f317184G;
                        int i8 = dVar5.f317183F;
                        if (i7 < (i8 >> 1)) {
                            dVar5.f317183F = i8 - (dVar5.f317178A >> 2);
                        }
                        if (i7 > dVar5.f317183F) {
                            dVar5.f317183F = i7;
                        }
                    }
                    int i9 = dVar5.f317183F;
                    int i15 = dVar5.f317185H;
                    if (i9 < i15) {
                        dVar5.f317183F = i15;
                    }
                    int i16 = dVar5.f317183F;
                    int i17 = dVar5.f317178A;
                    if (i16 < i17) {
                        dVar5.f317183F = i17;
                    }
                    if (i5 > 0) {
                        dVar5.f317180C = i;
                    }
                }
                if (i != 0 && dVar5.f317197b) {
                    dVar5.f317214s = 1;
                }
                if (dVar5.f317212q != null) {
                    int i18 = dVar5.f317209n;
                    dVar5.f317187J += i18;
                    if (dVar5.f317214s == 0) {
                        if (dVar5.f317192O == 0 && (aVar3 = dVar5.f317195R) != null) {
                            aVar3.mo162342a(i18, dVar5.f317204i);
                        }
                        C106336d dVar6 = this.f317176e;
                        i2 = dVar6.f317212q.mo149458a(dVar6.f317204i, dVar6.f317209n);
                    } else {
                        System.currentTimeMillis();
                        C106336d dVar7 = this.f317176e;
                        int i19 = dVar7.f317220y;
                        int i25 = dVar7.f317209n;
                        if (i19 >= i25) {
                            Log.m105925i("MicroMsg.Voip.AudioPlayer", "m_iTaskLeftByte value is %s and nFrameLen value is %s", Integer.valueOf(i19), Integer.valueOf(this.f317176e.f317209n));
                            synchronized (this.f317176e.f317188K) {
                                C106336d dVar8 = this.f317176e;
                                System.arraycopy(dVar8.f317202g, 0, dVar8.f317204i, 0, dVar8.f317209n);
                                C106336d dVar9 = this.f317176e;
                                int i26 = dVar9.f317220y;
                                int i27 = dVar9.f317209n;
                                int i28 = i26 - i27;
                                System.arraycopy(dVar9.f317202g, i27, dVar9.f317203h, 0, i28);
                                C106336d dVar10 = this.f317176e;
                                System.arraycopy(dVar10.f317203h, 0, dVar10.f317202g, 0, i28);
                                C106336d dVar11 = this.f317176e;
                                int i29 = dVar11.f317220y - dVar11.f317209n;
                                dVar11.f317220y = i29;
                                Log.m105925i("MicroMsg.Voip.AudioPlayer", "audio player has copy playTaskBuffer and left %s", Integer.valueOf(i29));
                            }
                            i2 = 0;
                        } else if (dVar7.f317221z >= (dVar7.f317206k * 5) / 1000 || dVar7.f317193P != 0) {
                            Log.m105924i("MicroMsg.Voip.AudioPlayer", "play run too fast !,m_iLefSamples: " + this.f317176e.f317221z + " ,m_iTaskLeftByte: " + this.f317176e.f317220y);
                            C112597j.m153948m(2);
                        } else {
                            dVar7.f317194Q = 1;
                            if (dVar7.f317192O == 0 && (aVar2 = dVar7.f317195R) != null) {
                                aVar2.mo162342a(i25, dVar7.f317204i);
                            }
                            C106336d dVar12 = this.f317176e;
                            i2 = dVar12.f317212q.mo149458a(dVar12.f317204i, dVar12.f317209n);
                            this.f317176e.f317194Q = 0;
                        }
                    }
                    if (i2 < 0) {
                        C112597j.m153948m(5);
                        Log.m105918d("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  pDevCallBack.PlayDevDataCallBack ret :" + i2);
                    } else {
                        C106336d dVar13 = this.f317176e;
                        boolean z = dVar13.f317217v;
                        if (z) {
                            Log.m105918d("MicroMsg.Voip.AudioPlayer", "isSwitching " + this.f317176e.f317217v);
                            C112597j.m153948m(10);
                        } else {
                            int i35 = dVar13.f317199d;
                            int i36 = dVar13.f317209n;
                            if (i35 < i36) {
                                System.arraycopy(dVar13.f317204i, 0, dVar13.f317201f, i3, i35 - i3);
                                C106336d dVar14 = this.f317176e;
                                AudioTrack audioTrack3 = dVar14.f317210o;
                                if (audioTrack3 != null) {
                                    dVar14.f317190M++;
                                    byte[] bArr = dVar14.f317201f;
                                    int write = audioTrack3.write(bArr, 0, bArr.length);
                                    if (write < 0) {
                                        C106336d dVar15 = this.f317176e;
                                        int i37 = dVar15.f317191N;
                                        if (i37 != -1 && write < 0) {
                                            int i38 = i37 + 1;
                                            dVar15.f317191N = i38;
                                            if (i38 >= 50) {
                                                dVar15.f317189L = 5;
                                                dVar15.f317191N = -1;
                                            }
                                        }
                                        Log.m105920e("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  audioTrack.write ret :" + write);
                                    }
                                    C106336d dVar16 = this.f317176e;
                                    dVar16.f317219x += dVar16.f317201f.length >> 1;
                                    int i39 = dVar16.f317199d - i3;
                                    i3 = dVar16.f317209n - i39;
                                    while (true) {
                                        dVar = this.f317176e;
                                        int i44 = dVar.f317199d;
                                        if (i3 < i44 || (audioTrack2 = dVar.f317210o) == null) {
                                            System.arraycopy(dVar.f317204i, i39, dVar.f317201f, 0, i3);
                                        } else {
                                            dVar.f317190M++;
                                            audioTrack2.write(dVar.f317204i, i39, i44);
                                            C106336d dVar17 = this.f317176e;
                                            int i45 = dVar17.f317199d;
                                            i39 += i45;
                                            i3 -= i45;
                                            dVar17.f317219x += i45 >> 1;
                                        }
                                    }
                                    System.arraycopy(dVar.f317204i, i39, dVar.f317201f, 0, i3);
                                } else {
                                    return;
                                }
                            } else if (!z) {
                                dVar13.f317190M++;
                                int write2 = dVar13.f317210o.write(dVar13.f317204i, 0, i36);
                                if (write2 < 0) {
                                    C106336d dVar18 = this.f317176e;
                                    int i46 = dVar18.f317191N;
                                    if (i46 != -1 && write2 < 0) {
                                        int i47 = i46 + 1;
                                        dVar18.f317191N = i47;
                                        if (i47 >= 50) {
                                            dVar18.f317189L = 5;
                                            dVar18.f317191N = -1;
                                        }
                                    }
                                    Log.m105920e("MicroMsg.Voip.AudioPlayer", "AudioPlayer::  audioTrack.write ret :" + write2);
                                }
                                C106336d dVar19 = this.f317176e;
                                dVar19.f317219x += dVar19.f317209n >> 1;
                            }
                        }
                    }
                } else {
                    C112597j.m153948m(10);
                }
            }
        }
        C106336d dVar32 = this.f317176e;
        if (dVar32.f317192O == 0 && (str = dVar32.f317215t) != null && (aVar = dVar32.f317195R) != null) {
            aVar.mo162343b(1, 1, str, dVar32.mo152548g());
            this.f317176e.f317195R.mo162344c(1);
            this.f317176e.f317195R.mo162346e(1);
            this.f317176e.f317195R.mo162345d(1);
        }
    }
}
