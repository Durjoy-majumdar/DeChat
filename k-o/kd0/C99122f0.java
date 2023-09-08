package kd0;

import android.media.MediaRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C77002r;
import p206nj.C76861g;
import p331dj.C75411c;
import p375qh.C101180a;
import p375qh.C101182e;
import p375qh.C110390f;
import p375qh.C77339c;

/* renamed from: kd0.f0 */
public class C99122f0 implements C77339c {

    /* renamed from: e */
    public static int f290634e = 100;

    /* renamed from: a */
    public C101182e f290635a;

    /* renamed from: b */
    public String f290636b = "";

    /* renamed from: c */
    public C77002r.C77003a f290637c = null;

    /* renamed from: d */
    public int f290638d = 0;

    /* renamed from: kd0.f0$a */
    public class C99123a implements C101180a.C101181a {
        public C99123a() {
        }

        /* renamed from: a */
        public void mo127303a() {
            C77002r.C77003a aVar = C99122f0.this.f290637c;
            if (aVar != null) {
                aVar.mo95814a();
            }
            try {
                C99122f0.this.f290635a.mo140629d();
                C99122f0.this.f290638d = -1;
            } catch (Exception e) {
                Log.m105920e("VoiceRecorder", "setErrorListener File[" + C99122f0.this.f290636b + "] ErrMsg[" + e.getStackTrace() + "]");
            }
        }
    }

    public C99122f0(C75411c cVar) {
        this.f290635a = new C101182e(cVar);
    }

    /* renamed from: a */
    public int mo107469a() {
        C110390f fVar;
        C101182e eVar = this.f290635a;
        C75411c cVar = eVar.f296176q;
        if ((cVar == C75411c.PCM || cVar == C75411c.SILK) && (fVar = eVar.f296175p) != null) {
            return fVar.f330216C;
        }
        return 1;
    }

    /* renamed from: c */
    public void mo107470c(C77002r.C77003a aVar) {
        this.f290637c = aVar;
    }

    /* renamed from: d */
    public int mo107471d() {
        if (this.f290638d != 1) {
            return 0;
        }
        int a = this.f290635a.mo140626a();
        if (a > f290634e) {
            f290634e = a;
        }
        return (a * 100) / f290634e;
    }

    public int getStatus() {
        return this.f290638d;
    }

    public boolean startRecord(String str) {
        MediaRecorder mediaRecorder;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(Util.isNullOrNil(str) ? 0 : str.length());
        Log.m105925i("VoiceRecorder", "[startRecord] fileName:%s size:%s", objArr);
        C76861g.C47263a aVar = new C76861g.C47263a();
        if (Util.isNullOrNil(this.f290636b) || this.f290636b.length() <= 0) {
            this.f290636b = str;
            try {
                this.f290635a.mo140630e(new C99123a());
                C101182e eVar = this.f290635a;
                C75411c cVar = eVar.f296176q;
                C75411c cVar2 = C75411c.AMR;
                if (cVar == cVar2) {
                    MediaRecorder mediaRecorder2 = eVar.f296174o;
                    if (mediaRecorder2 != null) {
                        mediaRecorder2.setAudioSource(1);
                    }
                }
                C101182e eVar2 = this.f290635a;
                if (eVar2.f296176q == cVar2) {
                    MediaRecorder mediaRecorder3 = eVar2.f296174o;
                    if (mediaRecorder3 != null) {
                        mediaRecorder3.setOutputFormat(3);
                    }
                }
                C101182e eVar3 = this.f290635a;
                if (eVar3.f296176q == cVar2 && (mediaRecorder = eVar3.f296174o) != null) {
                    mediaRecorder.setAudioEncoder(1);
                }
                this.f290635a.mo140631f(this.f290636b);
                C101182e eVar4 = this.f290635a;
                if (eVar4.f296176q == cVar2) {
                    MediaRecorder mediaRecorder4 = eVar4.f296174o;
                    if (mediaRecorder4 != null) {
                        mediaRecorder4.setMaxDuration(70000);
                    }
                } else {
                    eVar4.f296167h = (long) 70000;
                }
                this.f290635a.mo140628c();
                this.f290635a.mo140632g();
                Log.m105918d("VoiceRecorder", "StartRecord File[" + this.f290636b + "] start time:" + aVar.mo72288a());
                this.f290638d = 1;
                return true;
            } catch (Exception e) {
                Log.m105920e("VoiceRecorder", "StartRecord File[" + this.f290636b + "] ErrMsg[" + e.getMessage() + "]");
                this.f290638d = -1;
                return false;
            }
        } else {
            Log.m105920e("VoiceRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
            return false;
        }
    }

    public boolean stopRecord() {
        C101182e eVar = this.f290635a;
        if (eVar == null) {
            return true;
        }
        try {
            eVar.mo140633h();
            this.f290635a.mo140629d();
            this.f290636b = "";
            this.f290638d = 0;
            return true;
        } catch (Exception e) {
            Log.m105920e("VoiceRecorder", "StopRecord File[" + this.f290636b + "] ErrMsg[" + e.getMessage() + "]");
            this.f290638d = -1;
            return false;
        }
    }
}
