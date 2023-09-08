package m73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97625j3;
import java.util.UUID;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import te3.C51018qv3;
import te3.gn4;
import te3.hn4;

/* renamed from: m73.c */
public class C46951c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126237d;

    /* renamed from: e */
    public C47350c f126238e;

    /* renamed from: f */
    public String f126239f;

    /* renamed from: g */
    public String f126240g = null;

    /* renamed from: h */
    public int f126241h;

    /* renamed from: i */
    public int f126242i = 0;

    /* renamed from: j */
    public boolean f126243j = false;

    /* renamed from: n */
    public String f126244n;

    /* renamed from: o */
    public int f126245o = 0;

    /* renamed from: p */
    public boolean f126246p = false;

    /* renamed from: q */
    public String f126247q;

    /* renamed from: r */
    public boolean f126248r;

    /* renamed from: s */
    public MTimerHandler f126249s = new MTimerHandler(new C46952a(), true);

    /* renamed from: m73.c$a */
    public class C46952a implements MTimerHandler.CallBack {
        public C46952a() {
        }

        public boolean onTimerExpired() {
            long l = C86013q1.m106451l(C46951c.this.f126240g);
            C46951c cVar = C46951c.this;
            long j = l - ((long) cVar.f126245o);
            Log.m105919d("MicroMsg.Wear.NetSceneVoiceToText", "onTimerExpired: filename=%s | fileLength=%d | readOffset=%d | isRecordFinished=%b | canReadLength=%d", cVar.f126240g, Long.valueOf(l), Integer.valueOf(C46951c.this.f126245o), Boolean.valueOf(C46951c.this.f126243j), Long.valueOf(j));
            if (j < 3300 && !C46951c.this.f126243j) {
                return true;
            }
            C46951c cVar2 = C46951c.this;
            if ((!cVar2.f126243j || j > 0) && cVar2.doScene(cVar2.dispatcher(), C46951c.this.f126237d) == -1) {
                C46951c cVar3 = C46951c.this;
                cVar3.f126237d.onSceneEnd(3, -1, "doScene failed", cVar3);
            }
            return false;
        }
    }

    public C46951c(String str, int i, String str2, int i2) {
        this.f126241h = i2;
        this.f126239f = str2;
        this.f126240g = str;
        this.f126242i = i;
        this.f126244n = UUID.randomUUID().toString();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126237d = nVar;
        int l = (int) C86013q1.m106451l(this.f126240g);
        if (l <= 0) {
            Log.m105921e("MicroMsg.Wear.NetSceneVoiceToText", "doScene file length is zero: %s", this.f126240g);
            return -1;
        }
        int i = l - this.f126245o;
        if (i > 3960) {
            i = 3960;
        } else if (i < 3300 && !this.f126243j) {
            Log.m105921e("MicroMsg.Wear.NetSceneVoiceToText", "try to send a buf less than MIN_SEND_BYTE_PER_PACK: canReadLen=%d | isRecordFinished=%b", Integer.valueOf(i), Boolean.valueOf(this.f126243j));
            return -1;
        } else if (this.f126243j) {
            this.f126246p = true;
        }
        Log.m105925i("MicroMsg.Wear.NetSceneVoiceToText", "fileLength: %d | readOffset: %d | isRecordFinish=%b | endFlag=%b | filename=%s", Integer.valueOf(l), Integer.valueOf(this.f126245o), Boolean.valueOf(this.f126243j), Boolean.valueOf(this.f126246p), this.f126240g);
        byte[] O = C86013q1.m106433O(this.f126240g, this.f126245o, i);
        if (O != null) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new gn4();
            bVar.f127067b = new hn4();
            bVar.f127068c = "/cgi-bin/micromsg-bin/uploadinputvoice";
            bVar.f127069d = 349;
            bVar.f127070e = 158;
            bVar.f127071f = 1000000158;
            C47350c a = bVar.mo72403a();
            this.f126238e = a;
            gn4 gn4 = (gn4) a.f127055a.f127080a;
            gn4.f134146d = (String) C97625j3.m125812b().mo105906u().mo119684e(2, "");
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(O);
            gn4.f134147e = qv32;
            gn4.f134148f = this.f126245o;
            gn4.f134149g = this.f126244n;
            gn4.f134150h = this.f126246p ? 1 : 0;
            gn4.f134151i = 0;
            gn4.f134152j = 0;
            gn4.f134153n = this.f126242i;
            gn4.f134154o = 0;
            int dispatch = dispatch(gVar, this.f126238e, this);
            this.f126245o = gn4.f134148f + gn4.f134147e.f140572d;
            long j = this.f126243j ? 0 : 500;
            Log.m105925i("MicroMsg.Wear.NetSceneVoiceToText", "doScene filename=%s | delay=%d | ret=%d", this.f126240g, Long.valueOf(j), Integer.valueOf(dispatch));
            this.f126249s.startTimer(j);
            return dispatch;
        } else if (this.f126246p) {
            return 0;
        } else {
            Log.m105921e("MicroMsg.Wear.NetSceneVoiceToText", "Can not read file: canReadLen=%d | isRecordFinish=%b | endFlag=%b", Integer.valueOf(i), Boolean.valueOf(this.f126243j), Boolean.valueOf(this.f126246p));
            return -1;
        }
    }

    public int getType() {
        return 349;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0039, code lost:
        r0 = r0.f140574f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r5, int r6, int r7, java.lang.String r8, com.tencent.p014mm.network.C114799u r9, byte[] r10) {
        /*
            r4 = this;
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r0 = 0
            r5[r0] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r1 = 1
            r5[r1] = r10
            java.lang.String r10 = r4.f126240g
            r2 = 2
            r5[r2] = r10
            java.lang.String r10 = "MicroMsg.Wear.NetSceneVoiceToText"
            java.lang.String r3 = "onGYNetEnd errorType=%d | errorCode=%d |filename=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r5)
            ob0.c r9 = (ob0.C47350c) r9
            ob0.c$d r5 = r9.f127056b
            pe3.a r5 = r5.f127083a
            te3.hn4 r5 = (te3.hn4) r5
            if (r6 != 0) goto L_0x0066
            if (r7 == 0) goto L_0x002a
            goto L_0x0066
        L_0x002a:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            int r2 = r5.f134751d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r0] = r2
            te3.qv3 r0 = r5.f134752e
            r2 = 0
            if (r0 == 0) goto L_0x0042
            pe3.b r0 = r0.f140574f
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.mo123705h()
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            r9[r1] = r0
            java.lang.String r0 = "resp EndFlag=%d | Text=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r9)
            int r9 = r5.f134751d
            if (r9 != r1) goto L_0x0065
            r4.f126248r = r1
            te3.qv3 r5 = r5.f134752e
            if (r5 == 0) goto L_0x005c
            pe3.b r5 = r5.f140574f
            if (r5 == 0) goto L_0x005c
            java.lang.String r2 = r5.mo123705h()
        L_0x005c:
            if (r2 == 0) goto L_0x0060
            r4.f126247q = r2
        L_0x0060:
            ob0.n r5 = r4.f126237d
            r5.onSceneEnd(r6, r7, r8, r4)
        L_0x0065:
            return
        L_0x0066:
            ob0.n r5 = r4.f126237d
            r5.onSceneEnd(r6, r7, r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m73.C46951c.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 20;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        this.f126237d.onSceneEnd(3, 0, "securityCheckError", this);
    }
}
