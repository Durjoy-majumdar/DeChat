package md0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import f40.C86709a0;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p206nj.C76861g;
import p823sg.C90193h;
import te3.C51018qv3;
import te3.gt4;
import te3.ht4;

/* renamed from: md0.c */
public class C46996c extends C76751a implements C1311n {

    /* renamed from: d */
    public C11385n f126353d;

    /* renamed from: e */
    public C47350c f126354e;

    /* renamed from: f */
    public int f126355f;

    /* renamed from: g */
    public int f126356g;

    /* renamed from: h */
    public String f126357h;

    /* renamed from: i */
    public long f126358i;

    /* renamed from: j */
    public boolean f126359j;

    /* renamed from: n */
    public boolean f126360n;

    /* renamed from: o */
    public int f126361o;

    /* renamed from: p */
    public String[] f126362p;

    /* renamed from: q */
    public MTimerHandler f126363q;

    /* renamed from: md0.c$a */
    public class C46997a implements MTimerHandler.CallBack {
        public C46997a() {
        }

        public boolean onTimerExpired() {
            long l = C86013q1.m106451l(C46996c.this.f126357h);
            Log.m105918d("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " onTimerExpired: file:" + C46996c.this.f126357h + " nowlen:" + l + " oldoff:" + C46996c.this.f126356g + " isFin:" + C46996c.this.f126360n);
            C46996c cVar = C46996c.this;
            if (l - ((long) cVar.f126356g) < 3300 && !cVar.f126360n) {
                return true;
            }
            if (cVar.doScene(cVar.dispatcher(), C46996c.this.f126353d) != -1) {
                return false;
            }
            C46996c.this.f126355f = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            C46996c cVar2 = C46996c.this;
            cVar2.f126353d.onSceneEnd(3, -1, "doScene failed", cVar2);
            return false;
        }
    }

    public C46996c(String str, int i) {
        this.f126355f = 0;
        this.f126356g = 0;
        this.f126357h = null;
        this.f126358i = -1;
        this.f126359j = false;
        this.f126360n = false;
        this.f126362p = new String[0];
        this.f126363q = new MTimerHandler(new C46997a(), true);
        this.f126358i = Util.nowMilliSecond();
        this.f126357h = str;
        this.f126361o = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126353d = nVar;
        long l = C86013q1.m106451l(this.f126357h);
        Log.m105918d("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " read file:" + this.f126357h + " filelen:" + l + " oldoff:" + this.f126356g + " isFin:" + this.f126360n);
        if (l <= 0) {
            Log.m105920e("MicroMsg.NetSceneVoiceAddr", "read failed :" + this.f126357h);
            this.f126355f = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        }
        int i = (int) (l - ((long) this.f126356g));
        if (i > 3960) {
            i = 3960;
        } else if (i < 3300 && !this.f126360n) {
            Log.m105920e("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " read failed :" + this.f126357h + "can read:" + i + " isfinish:" + this.f126360n);
            this.f126355f = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        } else if (this.f126360n) {
            this.f126359j = true;
        }
        Log.m105918d("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " read file:" + this.f126357h + " filelen:" + l + " oldoff:" + this.f126356g + " isFin:" + this.f126360n + " endFlag:" + this.f126359j);
        byte[] O = C86013q1.m106433O(this.f126357h, this.f126356g, i);
        if (O == null) {
            Log.m105920e("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " read failed :" + this.f126357h + " read:" + i);
            this.f126355f = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new gt4();
        bVar.f127067b = new ht4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voiceaddr";
        bVar.f127069d = 206;
        bVar.f127070e = 94;
        bVar.f127071f = 1000000094;
        C47350c a = bVar.mo72403a();
        this.f126354e = a;
        gt4 gt4 = (gt4) a.f127055a.f127080a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(O);
        gt4.f134260e = qv32;
        Log.m105918d("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " read file:" + this.f126357h + " readlen:" + O.length + " datalen:" + gt4.f134260e.f140574f.mo123703f().length + " dataiLen:" + gt4.f134260e.f140572d + " md5:" + C90193h.m112878f(O) + " datamd5:" + C90193h.m112878f(gt4.f134260e.f140574f.mo123703f()));
        gt4.f134259d = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
        gt4.f134261f = this.f126356g;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f126358i);
        gt4.f134262g = sb.toString();
        gt4.f134263h = this.f126359j ? 1 : 0;
        gt4.f134264i = 0;
        gt4.f134265j = 0;
        gt4.f134266n = 0;
        gt4.f134267o = 0;
        gt4.f134268p = this.f126361o;
        Log.m105918d("MicroMsg.NetSceneVoiceAddr", "clientId " + this.f126358i);
        return dispatch(gVar, this.f126354e, this);
    }

    public int getType() {
        return 206;
    }

    /* renamed from: j1 */
    public int mo72188j1() {
        return this.f126355f;
    }

    /* renamed from: k1 */
    public String[] mo72189k1() {
        return this.f126362p;
    }

    /* renamed from: l1 */
    public long mo72190l1() {
        return this.f126358i;
    }

    /* renamed from: m1 */
    public List<String> mo72191m1() {
        return null;
    }

    /* renamed from: n1 */
    public void mo72192n1() {
        this.f126360n = true;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " onGYNetEnd file:" + this.f126357h + " errtype:" + i2 + " errCode:" + i3);
        updateDispatchId(i);
        C47350c cVar = (C47350c) uVar;
        gt4 gt4 = (gt4) cVar.f127055a.f127080a;
        ht4 ht4 = (ht4) cVar.f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " onGYNetEnd  file:" + this.f126357h + " endflag:" + ht4.f134871d + " lst:" + ht4.f134873f);
            if (gt4.f134263h == 1) {
                this.f126362p = new String[ht4.f134873f.size()];
                for (int i4 = 0; i4 < ht4.f134873f.size(); i4++) {
                    this.f126362p[i4] = ht4.f134873f.get(i4).f141175d;
                }
                this.f126353d.onSceneEnd(i2, i3, str, this);
                return;
            }
            this.f126356g = gt4.f134261f + gt4.f134260e.f140572d;
            long j = this.f126360n ? 0 : 500;
            Log.m105918d("MicroMsg.NetSceneVoiceAddr", "onGYNetEnd file:" + this.f126357h + " delay:" + j);
            this.f126363q.startTimer(j);
            return;
        }
        Log.m105920e("MicroMsg.NetSceneVoiceAddr", C76861g.m92660c() + " onGYNetEnd file:" + this.f126357h + " errType:" + i2 + " errCode:" + i3);
        this.f126353d.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 20;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        this.f126353d.onSceneEnd(3, C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL, "ecurityCheckError", this);
    }
}
