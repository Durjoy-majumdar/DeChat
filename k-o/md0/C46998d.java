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
import pe3.C89349b;
import te3.C51018qv3;
import te3.gn4;
import te3.hn4;

/* renamed from: md0.d */
public class C46998d extends C76751a implements C1311n {

    /* renamed from: d */
    public C11385n f126365d;

    /* renamed from: e */
    public C47350c f126366e;

    /* renamed from: f */
    public int f126367f;

    /* renamed from: g */
    public boolean f126368g;

    /* renamed from: h */
    public int f126369h;

    /* renamed from: i */
    public String f126370i;

    /* renamed from: j */
    public long f126371j;

    /* renamed from: n */
    public boolean f126372n;

    /* renamed from: o */
    public int f126373o;

    /* renamed from: p */
    public String[] f126374p;

    /* renamed from: q */
    public MTimerHandler f126375q;

    /* renamed from: md0.d$a */
    public class C46999a implements MTimerHandler.CallBack {
        public C46999a() {
        }

        public boolean onTimerExpired() {
            long l = C86013q1.m106451l(C46998d.this.f126370i);
            Log.m105918d("MicroMsg.NetSceneVoiceInput", C76861g.m92660c() + " onTimerExpired: file:" + C46998d.this.f126370i + " nowlen:" + l + " oldoff:" + C46998d.this.f126369h + " isFin:" + C46998d.this.f126368g);
            C46998d dVar = C46998d.this;
            if (l - ((long) dVar.f126369h) < 3300 && !dVar.f126368g) {
                return true;
            }
            if (dVar.doScene(dVar.dispatcher(), C46998d.this.f126365d) != -1) {
                return false;
            }
            C46998d.this.f126367f = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            C46998d dVar2 = C46998d.this;
            dVar2.f126365d.onSceneEnd(3, -1, "doScene failed", dVar2);
            return false;
        }
    }

    public C46998d(String str, int i) {
        this.f126367f = 0;
        this.f126368g = false;
        this.f126369h = 0;
        this.f126370i = null;
        this.f126371j = -1;
        this.f126372n = false;
        this.f126373o = 0;
        this.f126374p = new String[0];
        this.f126375q = new MTimerHandler(new C46999a(), true);
        this.f126371j = (long) ("" + Util.nowMilliSecond()).hashCode();
        this.f126370i = str;
        this.f126373o = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126365d = nVar;
        int l = (int) C86013q1.m106451l(this.f126370i);
        Log.m105919d("MicroMsg.NetSceneVoiceInput", "read file: %s, filelen: %d, oldoff: %d, isFin: %b", this.f126370i, Integer.valueOf(l), Integer.valueOf(this.f126369h), Boolean.valueOf(this.f126368g));
        if (l <= 0) {
            Log.m105920e("MicroMsg.NetSceneVoiceInput", "read failed :" + this.f126370i);
            this.f126367f = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        }
        int i = l - this.f126369h;
        if (i > 3960) {
            i = 3960;
        } else if (i < 3300 && !this.f126368g) {
            Log.m105920e("MicroMsg.NetSceneVoiceInput", C76861g.m92660c() + " read failed :" + this.f126370i + "can read:" + i + " isfinish:" + this.f126368g);
            this.f126367f = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        } else if (this.f126368g) {
            this.f126372n = true;
        }
        Log.m105919d("MicroMsg.NetSceneVoiceInput", "read file: %s, filelen: %d, oldoff: %b, isFin:%b, endFlag: %b", this.f126370i, Integer.valueOf(l), Boolean.valueOf(this.f126368g), Boolean.valueOf(this.f126368g), Boolean.valueOf(this.f126372n));
        byte[] O = C86013q1.m106433O(this.f126370i, this.f126369h, i);
        if (O == null) {
            Log.m105920e("MicroMsg.NetSceneVoiceInput", C76861g.m92660c() + " read failed :" + this.f126370i + " read:" + i);
            this.f126367f = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new gn4();
        bVar.f127067b = new hn4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadinputvoice";
        bVar.f127069d = 349;
        bVar.f127070e = 158;
        bVar.f127071f = 1000000158;
        C47350c a = bVar.mo72403a();
        this.f126366e = a;
        gn4 gn4 = (gn4) a.f127055a.f127080a;
        gn4.f134146d = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(O);
        gn4.f134147e = qv32;
        Log.m105918d("MicroMsg.NetSceneVoiceInput", C76861g.m92660c() + " read file:" + this.f126370i + " readlen:" + O.length + " datalen:" + gn4.f134147e.f140574f.mo123703f().length + " dataiLen:" + gn4.f134147e.f140572d + " md5:" + C90193h.m112878f(O) + " datamd5:" + C90193h.m112878f(gn4.f134147e.f140574f.mo123703f()));
        gn4.f134148f = this.f126369h;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f126371j);
        gn4.f134149g = sb.toString();
        gn4.f134150h = this.f126372n ? 1 : 0;
        gn4.f134151i = 0;
        gn4.f134152j = 0;
        gn4.f134153n = this.f126373o;
        gn4.f134154o = 0;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("clientId ");
        sb4.append(this.f126371j);
        Log.m105918d("MicroMsg.NetSceneVoiceInput", sb4.toString());
        return dispatch(gVar, this.f126366e, this);
    }

    public int getType() {
        return 349;
    }

    /* renamed from: j1 */
    public int mo72188j1() {
        return this.f126367f;
    }

    /* renamed from: k1 */
    public String[] mo72189k1() {
        return this.f126374p;
    }

    /* renamed from: l1 */
    public long mo72190l1() {
        return this.f126371j;
    }

    /* renamed from: m1 */
    public List<String> mo72191m1() {
        return null;
    }

    /* renamed from: n1 */
    public void mo72192n1() {
        this.f126368g = true;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C89349b bVar;
        Log.m105918d("MicroMsg.NetSceneVoiceInput", "onGYNetEnd file:" + this.f126370i + " errtype:" + i2 + " errCode:" + i3);
        updateDispatchId(i);
        C47350c cVar = (C47350c) uVar;
        gn4 gn4 = (gn4) cVar.f127055a.f127080a;
        hn4 hn4 = (hn4) cVar.f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetSceneVoiceInput", C76861g.m92660c() + " onGYNetEnd  file:" + this.f126370i + " endflag:" + hn4.f134751d);
            if (gn4.f134150h == 1) {
                C51018qv3 qv32 = hn4.f134752e;
                if (!(qv32 == null || (bVar = qv32.f140574f) == null)) {
                    this.f126374p = new String[]{bVar.mo123705h()};
                }
                this.f126365d.onSceneEnd(i2, i3, str, this);
                return;
            }
            this.f126369h = gn4.f134148f + gn4.f134147e.f140572d;
            long j = this.f126368g ? 0 : 500;
            Log.m105918d("MicroMsg.NetSceneVoiceInput", "onGYNetEnd file:" + this.f126370i + " delay:" + j);
            this.f126375q.startTimer(j);
            return;
        }
        Log.m105920e("MicroMsg.NetSceneVoiceInput", C76861g.m92660c() + " onGYNetEnd file:" + this.f126370i + " errType:" + i2 + " errCode:" + i3);
        this.f126365d.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 20;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        this.f126365d.onSceneEnd(3, C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL, "ecurityCheckError", this);
    }
}
