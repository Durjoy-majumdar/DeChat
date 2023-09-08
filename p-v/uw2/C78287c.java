package uw2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p206nj.C76861g;
import pe3.C89349b;
import te3.C51018qv3;
import te3.bo4;
import te3.co4;
import uw2.C78289d;

/* renamed from: uw2.c */
public class C78287c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f229318d;

    /* renamed from: e */
    public C47350c f229319e;

    /* renamed from: f */
    public String f229320f;

    /* renamed from: g */
    public long f229321g;

    /* renamed from: h */
    public int f229322h = 0;

    /* renamed from: i */
    public int f229323i = 0;

    /* renamed from: j */
    public boolean f229324j = false;

    /* renamed from: n */
    public int f229325n = 0;

    /* renamed from: o */
    public MTimerHandler f229326o = new MTimerHandler(new C78288a(), true);

    /* renamed from: uw2.c$a */
    public class C78288a implements MTimerHandler.CallBack {
        public C78288a() {
        }

        public boolean onTimerExpired() {
            C78295i c = C78296j.m94585c(C78287c.this.f229320f);
            if (c != null) {
                int i = c.field_status;
                if ((i > 1 && i <= 3) || i == 8) {
                    if (!(3 == i || 8 == i)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if ((currentTimeMillis / 1000) - c.field_lastmodifytime > 30) {
                            Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "Error ModifyTime in Read file:" + C78287c.this.f229320f);
                            C78287c.this.f229322h = C76861g.m92658a() + 10000;
                            C78287c cVar = C78287c.this;
                            cVar.f229318d.onSceneEnd(3, -1, "doScene failed", cVar);
                            return false;
                        }
                        C78287c cVar2 = C78287c.this;
                        if (currentTimeMillis - cVar2.f229321g < 2000) {
                            Log.m105918d("MicroMsg.NetSceneUploadVoiceRemind", "TimerExpired :" + C78287c.this.f229320f + " but last send time:" + (currentTimeMillis - C78287c.this.f229321g));
                            return true;
                        }
                        C78289d.C78290a c2 = C78296j.m94586d(cVar2.f229320f).mo108309c(c.field_offset, 6000);
                        Log.m105918d("MicroMsg.NetSceneUploadVoiceRemind", "pusher doscene:" + C78287c.this.f229320f + " readByte:" + c2.f229331b + " stat:" + c.field_status);
                        if (c2.f229331b < 2000) {
                            return true;
                        }
                    }
                    C78287c cVar3 = C78287c.this;
                    if (cVar3.doScene(cVar3.dispatcher(), C78287c.this.f229318d) == -1) {
                        C78287c.this.f229322h = C76861g.m92658a() + 10000;
                        C78287c cVar4 = C78287c.this;
                        cVar4.f229318d.onSceneEnd(3, -1, "doScene failed", cVar4);
                    }
                    return false;
                }
            }
            Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + C78287c.this.f229320f);
            C78287c.this.f229322h = C76861g.m92658a() + 10000;
            C78287c cVar5 = C78287c.this;
            cVar5.f229318d.onSceneEnd(3, -1, "doScene failed", cVar5);
            return false;
        }
    }

    public C78287c(String str) {
        boolean z = false;
        Assert.assertTrue(str != null ? true : z);
        Log.m105918d("MicroMsg.NetSceneUploadVoiceRemind", "NetSceneUploadVoice:  file:" + str);
        this.f229320f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        boolean z;
        int i;
        C78295i c;
        int i2;
        this.f229318d = nVar;
        this.f229324j = false;
        String str = this.f229320f;
        if (str == null) {
            Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  filename null!");
            this.f229322h = C76861g.m92658a() + 10000;
            return -1;
        }
        C78295i c2 = C78296j.m94585c(str);
        if (c2 != null) {
            int i3 = c2.field_status;
            if ((i3 > 1 && i3 <= 3) || i3 == 8) {
                Log.m105918d("MicroMsg.NetSceneUploadVoiceRemind", "doScene file:" + this.f229320f + " netTimes:" + c2.field_nettimes);
                String str2 = this.f229320f;
                if (str2 == null || (c = C78296j.m94585c(str2)) == null || (i2 = c.field_nettimes) >= 80) {
                    z = false;
                } else {
                    c.field_nettimes = i2 + 1;
                    c.f229349U = 16384;
                    z = C78296j.m94588f(c);
                }
                if (!z) {
                    Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "checkVoiceNetTimes Failed file:" + this.f229320f);
                    C78296j.m94587e(this.f229320f);
                    this.f229322h = C76861g.m92658a() + 10000;
                    return -1;
                }
                C78289d.C78290a aVar = new C78289d.C78290a();
                int i4 = c2.field_status;
                if (i4 == 8) {
                    Log.m105926v("MicroMsg.NetSceneUploadVoiceRemind", this.f229320f + " cancelFlag = 1");
                    this.f229325n = 1;
                    C78296j.m94583a(c2.field_filename);
                    i = 1;
                } else {
                    if (i4 == 3) {
                        this.f229324j = true;
                    }
                    C78289d d = C78296j.m94586d(this.f229320f);
                    if (d == null) {
                        this.f229322h = C76861g.m92658a() + 10000;
                        return -1;
                    }
                    aVar = d.mo108309c(c2.field_offset, 6000);
                    Log.m105918d("MicroMsg.NetSceneUploadVoiceRemind", "doScene READ file[" + this.f229320f + "] read ret:" + aVar.f229333d + " readlen:" + aVar.f229331b + " newOff:" + aVar.f229332c + " netOff:" + c2.field_offset + " line:" + C76861g.m92658a());
                    if (aVar.f229333d < 0) {
                        Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.f229320f + "] read ret:" + aVar.f229333d + " readlen:" + aVar.f229331b + " newOff:" + aVar.f229332c + " netOff:" + c2.field_offset);
                        C78296j.m94587e(this.f229320f);
                        this.f229322h = C76861g.m92658a() + 10000;
                        return -1;
                    }
                    int i5 = aVar.f229332c;
                    this.f229323i = i5;
                    if (i5 < c2.field_offset || i5 >= 469000) {
                        Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.f229320f + "] newOff:" + this.f229323i + " OldtOff:" + c2.field_offset);
                        C78296j.m94587e(this.f229320f);
                        this.f229322h = C76861g.m92658a() + 10000;
                        return -1;
                    }
                    this.f229325n = 0;
                    int i6 = aVar.f229331b;
                    if (i6 != 0 || this.f229324j) {
                        if (this.f229324j) {
                            int i7 = c2.field_totallen;
                            if (i7 <= 0) {
                                Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.f229320f + "] read totalLen:" + c2.field_totallen);
                                C78296j.m94587e(this.f229320f);
                                this.f229322h = C76861g.m92658a() + 10000;
                                return -1;
                            } else if (i7 > i5 && i6 < 6000) {
                                Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.f229320f + "] readlen:" + aVar.f229331b + " newOff:" + aVar.f229332c + " netOff:" + c2.field_offset + " totalLen:" + c2.field_totallen);
                                C78296j.m94587e(this.f229320f);
                                this.f229322h = C76861g.m92658a() + 10000;
                                return -1;
                            } else if (i7 <= i5) {
                                this.f229325n = 1;
                            }
                        }
                        i = 0;
                    } else {
                        Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  file:" + this.f229320f + " No Data temperature , will be retry");
                        C78296j.m94587e(this.f229320f);
                        this.f229322h = C76861g.m92658a() + 10000;
                        return -1;
                    }
                }
                int i8 = c2.field_voicelenght;
                if (i8 == 0) {
                    i8 = ((this.f229323i - 6) / 32) * 20;
                }
                Log.m105918d("MicroMsg.NetSceneUploadVoiceRemind", "info.getMsgSvrId() " + c2.field_msgid);
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new bo4();
                bVar.f127067b = new co4();
                bVar.f127068c = "/cgi-bin/micromsg-bin/uploadvoicerecognize";
                bVar.f127069d = 329;
                bVar.f127070e = 157;
                bVar.f127071f = 1000000157;
                C47350c a = bVar.mo72403a();
                this.f229319e = a;
                bo4 bo4 = (bo4) a.f127055a.f127080a;
                bo4.f227019d = C75592q0.m90789s();
                bo4.f227020e = c2.field_user;
                bo4.f227021f = c2.field_offset;
                bo4.f227023h = c2.field_clientid;
                bo4.f227025j = i8;
                bo4.f227027o = this.f229325n;
                bo4.f227033u = c2.field_msgid;
                bo4.f227028p = i;
                bo4.f227031s = (int) (c2.field_createtime / 1000);
                bo4.f227030r = 1;
                if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(c2.field_user)) {
                    bo4.f227035w = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69662L3(c2.field_user);
                }
                if (i != 1) {
                    C51018qv3 qv32 = new C51018qv3();
                    C89349b bVar2 = new C89349b(aVar.f229330a, 0, aVar.f229331b);
                    qv32.mo73349j(bVar2);
                    qv32.f140572d = bVar2.f257327a.length;
                    qv32.f140573e = true;
                    bo4.f227026n = qv32;
                    bo4.f227022g = aVar.f229331b;
                } else {
                    C51018qv3 qv33 = new C51018qv3();
                    qv33.mo73349j(C89349b.m111674a(new byte[1]));
                    bo4.f227026n = qv33;
                    bo4.f227022g = 1;
                }
                Log.m105926v("MicroMsg.NetSceneUploadVoiceRemind", "cancelFlag:" + i + " endFlag:" + this.f229325n + " svrId:" + c2.field_msgid);
                Log.m105926v("MicroMsg.NetSceneUploadVoiceRemind", "doscene msgId:" + bo4.f227033u + " user:" + bo4.f227020e + " offset:" + bo4.f227021f + " dataLen:" + bo4.f227026n.f140572d + " endFlag:" + bo4.f227027o);
                Log.m105918d("MicroMsg.NetSceneUploadVoiceRemind", "doScene MsgId:" + c2.field_msgid + " file:" + this.f229320f + " readBytes:" + aVar.f229331b + " neTTTOff:" + c2.field_offset + " neWWWOff:" + this.f229323i + " endFlag:" + this.f229325n + " cancelFlag:" + i + " status:" + c2.field_status);
                StringBuilder sb = new StringBuilder();
                sb.append("tiger log ");
                sb.append(bo4.toString());
                Log.m105918d("MicroMsg.NetSceneUploadVoiceRemind", sb.toString());
                this.f229321g = System.currentTimeMillis();
                return dispatch(gVar, this.f229319e, this);
            }
        }
        Log.m105920e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + this.f229320f);
        this.f229322h = C76861g.m92658a() + 10000;
        return -1;
    }

    public int getType() {
        return 329;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r23, int r24, int r25, java.lang.String r26, com.tencent.p014mm.network.C114799u r27, byte[] r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onGYNetEnd file:"
            r4.append(r5)
            java.lang.String r6 = r0.f229320f
            r4.append(r6)
            java.lang.String r6 = " errtype:"
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = " errCode:"
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "MicroMsg.NetSceneUploadVoiceRemind"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            r4 = r27
            ob0.c r4 = (ob0.C47350c) r4
            ob0.c$c r8 = r4.f127055a
            pe3.a r8 = r8.f127080a
            te3.bo4 r8 = (te3.bo4) r8
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            te3.co4 r4 = (te3.co4) r4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "tiger log resp "
            r9.append(r10)
            java.lang.String r10 = r4.toString()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r9)
            r9 = 4
            if (r1 == r9) goto L_0x0060
            if (r1 != 0) goto L_0x006d
            if (r2 != 0) goto L_0x006d
        L_0x0060:
            java.lang.Class<f62.s0> r10 = f62.C75707s0.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            f62.s0 r10 = (f62.C75707s0) r10
            int r11 = r4.f131883r
            r10.mo96077Vq(r11)
        L_0x006d:
            r10 = 3
            r11 = 1000(0x3e8, double:4.94E-321)
            r13 = 2
            r14 = 0
            if (r1 != r9) goto L_0x00cd
            r15 = -22
            if (r2 != r15) goto L_0x00cd
            java.lang.String r4 = r0.f229320f
            uw2.i r4 = uw2.C78296j.m94585c(r4)
            if (r4 != 0) goto L_0x0081
            goto L_0x00c7
        L_0x0081:
            int r5 = r4.field_status
            if (r5 != r10) goto L_0x00b5
            eb0.c r5 = eb0.C97625j3.m125812b()
            g62.l r5 = r5.mo105911z()
            int r6 = r4.field_msglocalid
            long r6 = (long) r6
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r5 = r5.b00(r6)
            java.lang.String r6 = r4.field_human
            int r7 = r4.field_voicelenght
            long r7 = (long) r7
            java.lang.String r6 = uw2.C37600h.m41450a(r6, r7, r14)
            r5.mo108732L2(r6)
            r5.mo100991d(r13)
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.l r6 = r6.mo105911z()
            int r7 = r4.field_msglocalid
            long r7 = (long) r7
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            r6.xy0(r7, r5)
        L_0x00b5:
            r5 = 97
            r4.field_status = r5
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 / r11
            r4.field_lastmodifytime = r5
            r5 = 320(0x140, float:4.48E-43)
            r4.f229349U = r5
            uw2.C78296j.m94588f(r4)
        L_0x00c7:
            ob0.n r4 = r0.f229318d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x00cd:
            if (r1 != r9) goto L_0x00dc
            if (r2 == 0) goto L_0x00dc
            java.lang.String r4 = r0.f229320f
            uw2.C78296j.m94587e(r4)
            ob0.n r4 = r0.f229318d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x00dc:
            if (r1 != 0) goto L_0x031d
            if (r2 == 0) goto L_0x00e2
            goto L_0x031d
        L_0x00e2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r15 = "onGYNetEnd msgId:"
            r6.append(r15)
            long r14 = r4.f131882q
            r6.append(r14)
            java.lang.String r14 = " toUser:"
            r6.append(r14)
            java.lang.String r8 = r8.f227020e
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)
            java.lang.String r6 = r0.f229320f
            int r8 = r0.f229323i
            long r14 = r4.f131882q
            java.lang.String r13 = r4.f131877i
            int r10 = r0.f229325n
            r16 = 0
            if (r6 != 0) goto L_0x0111
            goto L_0x014d
        L_0x0111:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "UpdateAfterSend file:["
            r9.append(r11)
            r9.append(r6)
            java.lang.String r11 = "] newOff:"
            r9.append(r11)
            r9.append(r8)
            java.lang.String r11 = " SvrID:"
            r9.append(r11)
            r9.append(r14)
            java.lang.String r11 = " clientID:"
            r9.append(r11)
            r9.append(r13)
            java.lang.String r11 = " hasSendEndFlag "
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "MicroMsg.VoiceRemindLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r9)
            uw2.i r9 = uw2.C78296j.m94585c(r6)
            if (r9 != 0) goto L_0x0150
        L_0x014d:
            r6 = -1
            goto L_0x025c
        L_0x0150:
            r9.field_offset = r8
            long r20 = java.lang.System.currentTimeMillis()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r1 = r20 / r18
            r9.field_lastmodifytime = r1
            r1 = 264(0x108, float:3.7E-43)
            r9.f229349U = r1
            java.lang.String r1 = r9.field_clientid
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0172
            if (r13 == 0) goto L_0x0172
            r9.field_clientid = r13
            int r1 = r9.f229349U
            r1 = r1 | 512(0x200, float:7.175E-43)
            r9.f229349U = r1
        L_0x0172:
            long r1 = r9.field_msgid
            int r12 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0184
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x0184
            r9.field_msgid = r14
            int r1 = r9.f229349U
            r2 = 4
            r1 = r1 | r2
            r9.f229349U = r1
        L_0x0184:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "info.getTotalLen() "
            r1.append(r2)
            int r2 = r9.field_totallen
            r1.append(r2)
            java.lang.String r2 = "  newOffset "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = "  "
            r1.append(r2)
            int r2 = r9.field_status
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r1)
            int r1 = r9.field_totallen
            if (r1 > r8) goto L_0x0251
            int r1 = r9.field_status
            r2 = 3
            if (r1 != r2) goto L_0x0251
            r1 = 1
            if (r10 != r1) goto L_0x0251
            r1 = 99
            r9.field_status = r1
            int r1 = r9.f229349U
            r1 = r1 | 64
            r9.f229349U = r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            int r2 = r9.field_msglocalid
            long r12 = (long) r2
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.b00(r12)
            java.lang.String r2 = r9.field_user
            r1.mo108749c3(r2)
            long r12 = r9.field_msgid
            r1.mo108745Y2(r12)
            r2 = 2
            r1.mo100991d(r2)
            java.lang.String r2 = r9.field_human
            int r8 = r9.field_voicelenght
            long r12 = (long) r8
            r8 = 0
            java.lang.String r2 = uw2.C37600h.m41450a(r2, r12, r8)
            r1.mo108732L2(r2)
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            int r8 = r9.field_msglocalid
            long r12 = (long) r8
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            r2.xy0(r12, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "END!!! updateSend  file:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " total:"
            r1.append(r2)
            int r2 = r9.field_totallen
            r1.append(r2)
            java.lang.String r2 = " status:"
            r1.append(r2)
            int r2 = r9.field_status
            r1.append(r2)
            java.lang.String r2 = " netTimes:"
            r1.append(r2)
            int r2 = r9.field_nettimes
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r1)
            uw2.m r1 = uw2.C78291e.xx0()
            r2 = 0
            java.lang.String r2 = uw2.C78296j.m94584b(r6, r2)
            java.util.Map<java.lang.String, uw2.d> r6 = r1.f229384e
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r2)
            uw2.d r6 = (uw2.C78289d) r6
            if (r6 == 0) goto L_0x024f
            r6.mo108308a()
            java.util.Map<java.lang.String, uw2.d> r1 = r1.f229384e
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.remove(r2)
        L_0x024f:
            r14 = 1
            goto L_0x0253
        L_0x0251:
            r2 = 0
            r14 = 0
        L_0x0253:
            boolean r1 = uw2.C78296j.m94588f(r9)
            if (r1 != 0) goto L_0x025b
            r6 = -4
            goto L_0x025c
        L_0x025b:
            r6 = r14
        L_0x025c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onGYNetEnd updateAfterSend:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " file:"
            r1.append(r2)
            java.lang.String r2 = r0.f229320f
            r1.append(r2)
            java.lang.String r2 = " MsgSvrId:"
            r1.append(r2)
            long r8 = r4.f131882q
            r1.append(r8)
            java.lang.String r2 = " clientId:"
            r1.append(r2)
            java.lang.String r2 = r4.f131877i
            r1.append(r2)
            java.lang.String r2 = " neWWOff:"
            r1.append(r2)
            int r2 = r0.f229323i
            r1.append(r2)
            java.lang.String r2 = " neTTTT:"
            r1.append(r2)
            int r2 = r4.f131875g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            if (r6 >= 0) goto L_0x02cf
            java.lang.String r1 = r0.f229320f
            uw2.C78296j.m94587e(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r2 = r0.f229320f
            r1.append(r2)
            java.lang.String r2 = "UpdateAfterSend Ret:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            ob0.n r1 = r0.f229318d
            r2 = r24
            r4 = r25
            r1.onSceneEnd(r2, r4, r3, r0)
            return
        L_0x02cf:
            r2 = r24
            r4 = r25
            r1 = 1
            if (r6 != r1) goto L_0x02f2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onGYNetEnd finish file:"
            r1.append(r5)
            java.lang.String r5 = r0.f229320f
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            ob0.n r1 = r0.f229318d
            r1.onSceneEnd(r2, r4, r3, r0)
            return
        L_0x02f2:
            boolean r1 = r0.f229324j
            if (r1 == 0) goto L_0x02f7
            goto L_0x02f9
        L_0x02f7:
            r16 = 500(0x1f4, double:2.47E-321)
        L_0x02f9:
            r1 = r16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r4 = r0.f229320f
            r3.append(r4)
            java.lang.String r4 = " delay:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r3)
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f229326o
            r3.startTimer(r1)
            return
        L_0x031d:
            r4 = r2
            r2 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = r0.f229320f
            r1.append(r5)
            java.lang.String r5 = " errType:"
            r1.append(r5)
            r1.append(r2)
            r1.append(r6)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            ob0.n r1 = r0.f229318d
            r1.onSceneEnd(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uw2.C78287c.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 240;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        bo4 bo4 = (bo4) ((C47350c) uVar).f127055a.f127080a;
        Log.m105926v("MicroMsg.NetSceneUploadVoiceRemind", "check : offset:" + bo4.f227021f + " dataLen:" + bo4.f227026n.f140572d + " endFlag:" + bo4.f227027o);
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C78296j.m94587e(this.f229320f);
    }
}
