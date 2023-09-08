package p356lh;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import ea2.C20561h;
import fa2.C20705c;
import nb0.C88912b;
import p213oh.C11412b;
import p335eh.C116768d;
import p339fh.C116869j;
import p348ih.C21091o;

/* renamed from: lh.e */
public class C21431e implements C21091o {

    /* renamed from: a */
    public final /* synthetic */ C21428d f60668a;

    public C21431e(C21428d dVar) {
        this.f60668a = dVar;
    }

    /* renamed from: a */
    public void mo33597a(AudioPlayerEvent audioPlayerEvent) {
        C20561h.C20567f fVar;
        long j;
        AudioPlayerEvent audioPlayerEvent2 = audioPlayerEvent;
        int i = audioPlayerEvent2.f48073d.f48074a;
        if (!(i == 12 || i == 11 || i == 10 || i == 6)) {
            if (this.f60668a.f60654p.containsKey(audioPlayerEvent2.f48073d.f48076c)) {
                C21433g gVar = this.f60668a.f60654p.get(audioPlayerEvent2.f48073d.f48076c);
                if (gVar != null) {
                    if (gVar.mo33599a(Integer.valueOf(i))) {
                        int i2 = C11412b.f33577a;
                        Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "don't callback again", (Object[]) null);
                        return;
                    }
                }
                if (gVar != null) {
                    T valueOf = Integer.valueOf(i);
                    synchronized (gVar) {
                        T t = gVar.f60671a;
                        gVar.f60671a = valueOf;
                        int i3 = C11412b.f33577a;
                        Log.m105925i("StateRunner", t.toString() + " -> " + gVar.f60671a.toString(), (Object[]) null);
                    }
                    this.f60668a.f60654p.put(audioPlayerEvent2.f48073d.f48076c, gVar);
                }
            } else {
                synchronized (this.f60668a.f60645g) {
                    this.f60668a.f60654p.put(audioPlayerEvent2.f48073d.f48076c, new C21433g(Integer.valueOf(i)));
                }
            }
        }
        if (this.f60668a.f60648j != null) {
            AudioPlayerEvent.C17674a aVar = audioPlayerEvent2.f48073d;
            Object[] objArr = {aVar.f48076c, aVar.f48077d};
            int i4 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "onEventChange audioId:%s, state:%s", objArr);
            if (i == 9) {
                ((C20561h.C20567f) this.f60668a.f60648j).getClass();
                audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
            } else if (i == 7) {
                C20561h.C20567f fVar2 = (C20561h.C20567f) this.f60668a.f60648j;
                if (!C20561h.this.f57878k.contains(audioPlayerEvent2.f48073d.f48076c)) {
                    audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
                }
                C20561h.this.f57878k.remove(audioPlayerEvent2.f48073d.f48076c);
            } else if (i == 0) {
                ((C20561h.C20567f) this.f60668a.f60648j).getClass();
                audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
            } else if (i == 1) {
                ((C20561h.C20567f) this.f60668a.f60648j).getClass();
                audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
            } else if (i == 2) {
                ((C20561h.C20567f) this.f60668a.f60648j).getClass();
                audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
            } else if (i == 3) {
                this.f60668a.f60653o.put(audioPlayerEvent2.f48073d.f48076c, Boolean.FALSE);
                C20561h.C20567f fVar3 = (C20561h.C20567f) this.f60668a.f60648j;
                fVar3.getClass();
                audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
                C20561h.m22330b(C20561h.this, audioPlayerEvent2.f48073d.f48076c);
            } else if (i == 5) {
                this.f60668a.f60653o.put(audioPlayerEvent2.f48073d.f48076c, Boolean.FALSE);
                ((C20561h.C20567f) this.f60668a.f60648j).getClass();
                audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
            } else if (i == 4) {
                this.f60668a.f60653o.put(audioPlayerEvent2.f48073d.f48076c, Boolean.FALSE);
                C20561h.C20567f fVar4 = (C20561h.C20567f) this.f60668a.f60648j;
                fVar4.getClass();
                int i5 = audioPlayerEvent2.f48073d.f48079f;
                Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "onError errCode:%d", Integer.valueOf(i5));
                if (i5 == 709 || i5 == 702 || i5 == 703 || i5 == 705 || i5 == 706) {
                    Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "decode mix cache errors, don't callback to JS");
                } else {
                    audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
                }
                C20561h hVar = C20561h.this;
                if (hVar.f57887t != null) {
                    C88912b bVar = hVar.f57876i.get(audioPlayerEvent2.f48073d.f48076c);
                    if (bVar != null) {
                        C20561h.this.f57887t.mo32413T(bVar.f256424i, audioPlayerEvent2.f48073d.f48079f);
                        if (!C20561h.this.f57849A.mo33567e(bVar.f256418c)) {
                            if (C20561h.this.f57893z.containsKey(bVar.f256418c)) {
                                C20561h.this.f57893z.put(bVar.f256418c, Integer.valueOf(C20561h.this.f57893z.get(bVar.f256418c).intValue() + 1));
                            } else {
                                C20561h.this.f57893z.put(bVar.f256418c, 1);
                            }
                        }
                    }
                }
                C20561h.m22330b(C20561h.this, audioPlayerEvent2.f48073d.f48076c);
            } else if (i == 10) {
                ((C20561h.C20567f) this.f60668a.f60648j).getClass();
                audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
            } else if (i == 6) {
                ((C20561h.C20567f) this.f60668a.f60648j).getClass();
                audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
            } else if (i == 11) {
                C20561h.C20567f fVar5 = (C20561h.C20567f) this.f60668a.f60648j;
                C20561h hVar2 = C20561h.this;
                if (hVar2.f57887t != null) {
                    C88912b bVar2 = hVar2.f57876i.get(audioPlayerEvent2.f48073d.f48076c);
                    if (bVar2 != null) {
                        long j2 = bVar2.f256432q;
                        if (j2 > TimeUtil.SECOND_TO_US) {
                            Log.m105921e("MicroMsg.Audio.AudioPlayerMgr", "onRealPlay: %s, invokeCallTime:%d", bVar2.f256416a, Long.valueOf(j2));
                        }
                        String str = audioPlayerEvent2.f48073d.f48081h;
                        if (TextUtils.isEmpty(str)) {
                            str = bVar2.f256417b;
                        }
                        String str2 = str;
                        C20705c cVar = C20561h.this.f57887t;
                        String str3 = bVar2.f256416a;
                        long currentTimeMillis = System.currentTimeMillis() - bVar2.f256430o;
                        long j3 = bVar2.f256431p;
                        long j4 = bVar2.f256432q;
                        String str4 = bVar2.f256418c;
                        long d = (long) C20561h.this.f57849A.f60632a.mo33583d(bVar2.f256416a);
                        long j5 = bVar2.f256439x;
                        C21427c cVar2 = C20561h.this.f57849A;
                        String str5 = bVar2.f256418c;
                        cVar2.getClass();
                        C116869j a = C116869j.m164845a();
                        C88912b bVar3 = bVar2;
                        synchronized (a.f350296c) {
                            fVar = fVar5;
                            if (a.f350294a.contains(str5)) {
                                C116768d dVar = a.f350295b.get(str5);
                                if (dVar != null && dVar.f350073b) {
                                    long c = dVar.mo180737c();
                                    j = c;
                                }
                            }
                            j = 0;
                        }
                        cVar.mo32421r0(str3, str2, currentTimeMillis, j3, j4, false, str4, d, j5, j);
                        C20561h.C20567f fVar6 = fVar;
                        C88912b bVar4 = bVar3;
                        if (C20561h.this.f57893z.containsKey(bVar4.f256418c)) {
                            C20561h.this.f57893z.remove(bVar4.f256418c);
                        }
                    }
                    return;
                }
                audioPlayerEvent.asyncPublish(Looper.getMainLooper());
                return;
            } else {
                AudioPlayerEvent audioPlayerEvent3 = audioPlayerEvent2;
                if (i == 12) {
                    this.f60668a.f60648j.getClass();
                    return;
                }
                if (i == 13) {
                    C20561h.m22330b(C20561h.this, audioPlayerEvent3.f48073d.f48076c);
                    return;
                }
                return;
            }
        }
    }
}
