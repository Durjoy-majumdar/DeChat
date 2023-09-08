package kd0;

import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import fw0.C87107w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import junit.framework.Assert;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C77002r;
import ob0.y$$c;
import ob0.y$$d;
import p1081gi.C98124g;
import p206nj.C76861g;
import p663qo.C77384i;
import p876cj.C67380a;
import pc0.C77068x;
import pe3.C89349b;
import te3.C51018qv3;
import te3.bo4;
import te3.co4;

/* renamed from: kd0.g */
public class C76540g extends C117747y implements C1311n {

    /* renamed from: A */
    public C55384i f224010A = new g$$a(this);

    /* renamed from: d */
    public C11385n f224011d;

    /* renamed from: e */
    public C47350c f224012e;

    /* renamed from: f */
    public String f224013f;

    /* renamed from: g */
    public long f224014g;

    /* renamed from: h */
    public int f224015h;

    /* renamed from: i */
    public long f224016i;

    /* renamed from: j */
    public int f224017j = 0;

    /* renamed from: n */
    public int f224018n = 0;

    /* renamed from: o */
    public boolean f224019o = false;

    /* renamed from: p */
    public boolean f224020p = false;

    /* renamed from: q */
    public boolean f224021q = false;

    /* renamed from: r */
    public String f224022r = "";

    /* renamed from: s */
    public String f224023s = "";

    /* renamed from: t */
    public boolean f224024t = false;

    /* renamed from: u */
    public boolean f224025u = false;

    /* renamed from: v */
    public boolean f224026v = false;

    /* renamed from: w */
    public int f224027w = 0;

    /* renamed from: x */
    public long f224028x = 0;

    /* renamed from: y */
    public long f224029y = 0;

    /* renamed from: z */
    public MTimerHandler f224030z = new MTimerHandler(new g$$b(this), true);

    public C76540g(String str, int i) {
        boolean z = false;
        Assert.assertTrue(str != null ? true : z);
        Log.m105918d("MicroMsg.NetSceneUploadVoice", "NetSceneUploadVoice:  file:" + str);
        this.f224013f = str;
        this.f224015h = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        int i;
        int i2;
        C77002r rVar;
        int i3;
        C114770g gVar2 = gVar;
        Class cls = C75700k0.class;
        Class cls2 = C75707s0.class;
        this.f224011d = nVar;
        this.f224026v = false;
        String str = this.f224013f;
        if (str == null) {
            Log.m105920e("MicroMsg.NetSceneUploadVoice", "doScene:  filename null!");
            this.f224017j = C76861g.m92658a() + 10000;
            return -1;
        }
        C76551y o = C76552z.m92077o(str);
        if (o != null) {
            int i4 = o.f224058i;
            if ((i4 > 1 && i4 <= 3) || i4 == 8) {
                this.f224014g = o.f224062m;
                Log.m105919d("MicroMsg.NetSceneUploadVoice", "doScene file:" + this.f224013f + " netTimes:" + o.f224064o + " msgLocalId:%s", Long.valueOf(this.f224014g));
                if (!C76552z.m92066d(this.f224013f)) {
                    Log.m105920e("MicroMsg.NetSceneUploadVoice", "checkVoiceNetTimes Failed file:" + this.f224013f);
                    C76552z.m92084v(this.f224013f);
                    this.f224017j = C76861g.m92658a() + 10000;
                    return -1;
                }
                this.f224025u = C72996z1.m85820U5(o.f224052c);
                C60998j jVar = new C60998j();
                int i5 = o.f224058i;
                if (i5 == 8) {
                    Log.m105926v("MicroMsg.NetSceneUploadVoice", this.f224013f + " cancelFlag = 1");
                    this.f224027w = 0;
                    C76552z.m92064b(o.f224051b);
                    i2 = 1;
                    i = 0;
                } else {
                    if (i5 == 3) {
                        this.f224026v = true;
                    }
                    C76537d k = C76552z.m92073k(this.f224013f);
                    if (k == null) {
                        this.f224017j = C76861g.m92658a() + 10000;
                        Log.m105921e("MicroMsg.NetSceneUploadVoice", "doScene: fileOp is null, fileName:%s", this.f224013f);
                        return -1;
                    }
                    i = k.getFormat();
                    Log.m105918d("MicroMsg.NetSceneUploadVoice", "format " + i);
                    C60998j d = k.mo106771d(o.f224055f, 6000);
                    if (d == null) {
                        C115669n.INSTANCE.idkeyStat(111, 242, 1, false);
                        this.f224017j = C76861g.m92658a() + 10000;
                        Log.m105921e("MicroMsg.NetSceneUploadVoice", "doScene: readRes is null, fileName:%s", this.f224013f);
                        return -1;
                    }
                    Log.m105918d("MicroMsg.NetSceneUploadVoice", "doScene READ file[" + this.f224013f + "] read ret:" + d.f173722d + " readlen:" + d.f173720b + " newOff:" + d.f173721c + " netOff:" + o.f224055f + " line:" + C76861g.m92658a());
                    if (d.f173722d < 0) {
                        C115669n.INSTANCE.idkeyStat(111, 241, 1, false);
                        Log.m105920e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f224013f + "] read ret:" + d.f173722d + " readlen:" + d.f173720b + " newOff:" + d.f173721c + " netOff:" + o.f224055f);
                        C76552z.m92084v(this.f224013f);
                        this.f224017j = C76861g.m92658a() + 10000;
                        return -1;
                    }
                    int i6 = d.f173721c;
                    this.f224018n = i6;
                    if (i6 < o.f224055f || i6 >= 469000) {
                        C115669n.INSTANCE.idkeyStat(111, 240, 1, false);
                        Log.m105920e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f224013f + "] newOff:" + this.f224018n + " OldtOff:" + o.f224055f);
                        C76552z.m92084v(this.f224013f);
                        this.f224017j = C76861g.m92658a() + 10000;
                        return -1;
                    }
                    this.f224027w = 0;
                    int i7 = d.f173720b;
                    if (i7 != 0 || this.f224026v) {
                        if (this.f224026v) {
                            int i8 = o.f224057h;
                            if (i8 <= 0) {
                                Log.m105920e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f224013f + "] read totalLen:" + o.f224057h);
                                C76552z.m92084v(this.f224013f);
                                this.f224017j = C76861g.m92658a() + 10000;
                                return -1;
                            } else if (i8 > i6 && i7 < 6000) {
                                Log.m105920e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f224013f + "] readlen:" + d.f173720b + " newOff:" + d.f173721c + " netOff:" + o.f224055f + " totalLen:" + o.f224057h);
                                C76552z.m92084v(this.f224013f);
                                this.f224017j = C76861g.m92658a() + 10000;
                                return -1;
                            } else if (i8 <= i6) {
                                Integer num = C76552z.f224075b.get(C76552z.m92075m(this.f224013f));
                                if (!(num == null || num.intValue() == 0)) {
                                    int intValue = C76552z.f224076c.get(C76552z.m92075m(this.f224013f)).intValue();
                                    C60998j d2 = k.mo106771d(0, intValue);
                                    int h = C76552z.m92070h(num.intValue() & 255, d2.f173719a, 0, d2.f173720b);
                                    if (num.intValue() != h) {
                                        Log.m105921e("MicroMsg.NetSceneUploadVoice", "Checksum error file. realChecksum:%d, tempChecksum:%d, total:%d, rr.length:%d", Integer.valueOf(h), num, Integer.valueOf(intValue), Integer.valueOf(d2.f173720b));
                                        Log.m105920e("MicroMsg.NetSceneUploadVoice", "Checksum error file[" + this.f224013f + "] readlen:" + d.f173720b + " newOff:" + d.f173721c + " netOff:" + o.f224055f + " totalLen:" + o.f224057h);
                                        C115669n.INSTANCE.idkeyStat(111, 173, 1, false);
                                        C76552z.f224075b.put(C76552z.m92075m(this.f224013f), Integer.valueOf(h));
                                        Integer num2 = C76552z.f224077d.get(C76552z.m92075m(this.f224013f));
                                        if (!(num2 == null || num2.intValue() == 0)) {
                                            byte[] bArr = d2.f173719a;
                                            int i9 = d2.f173720b;
                                            synchronized (C76552z.class) {
                                                if (bArr != null) {
                                                    if (bArr.length != 0) {
                                                        i3 = 0;
                                                        for (int i15 = 0; i15 < i9; i15++) {
                                                            i3 += bArr[0 + i15];
                                                        }
                                                    }
                                                }
                                                i3 = 0;
                                            }
                                            if (num2.intValue() != i3) {
                                                Log.m105921e("MicroMsg.NetSceneUploadVoice", "Checksum error file. cacheSimpleChecksum:%d, realSimpleChecksum:%d", num2, Integer.valueOf(i3));
                                                C76552z.m92084v(this.f224013f);
                                                this.f224017j = C76861g.m92658a() + 10000;
                                                C115669n.INSTANCE.idkeyStat(111, 174, 1, false);
                                                return -1;
                                            }
                                        }
                                    }
                                }
                                this.f224027w = 1;
                            }
                        }
                        jVar = d;
                        i2 = 0;
                    } else {
                        Log.m105920e("MicroMsg.NetSceneUploadVoice", "doScene:  file:" + this.f224013f + " No Data temperature , will be retry");
                        this.f224017j = C76861g.m92658a() + 10000;
                        return -1;
                    }
                }
                int i16 = o.f224061l;
                Log.m105925i("MicroMsg.NetSceneUploadVoice", "info.getVoiceLength: %s", Integer.valueOf(i16));
                if (i16 == 0) {
                    String str2 = this.f224013f;
                    HashMap<String, WeakReference<C77002r>> hashMap = C76552z.f224074a;
                    synchronized (hashMap) {
                        i16 = (hashMap.get(str2) == null || (rVar = (C77002r) hashMap.get(str2).get()) == null) ? -1 : (int) rVar.mo107316b();
                    }
                    Log.m105925i("MicroMsg.NetSceneUploadVoice", "getCurrentRecordFileLen: %s", Integer.valueOf(i16));
                    if (i16 < 0) {
                        i16 = ((this.f224018n - 6) / 32) * 20;
                        Log.m105925i("MicroMsg.NetSceneUploadVoice", "fuck getMinTimeByOffset: %s", Integer.valueOf(i16));
                    }
                }
                if (this.f224024t || !this.f224019o) {
                    C76551y yVar = o;
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127066a = new bo4();
                    bVar.f127067b = new co4();
                    bVar.f127068c = "/cgi-bin/micromsg-bin/uploadvoice";
                    bVar.f127069d = 127;
                    bVar.f127070e = 19;
                    bVar.f127071f = 1000000019;
                    C47350c a = bVar.mo72403a();
                    this.f224012e = a;
                    bo4 bo4 = (bo4) a.f127055a.f127080a;
                    bo4.f227019d = C75592q0.m90789s();
                    bo4.f227020e = yVar.f224052c;
                    bo4.f227021f = yVar.f224055f;
                    bo4.f227023h = yVar.f224053d;
                    bo4.f227025j = i16;
                    bo4.f227027o = this.f224027w;
                    bo4.f227033u = yVar.f224054e;
                    bo4.f227028p = i2;
                    bo4.f227032t = this.f224015h;
                    bo4.f227029q = C75569c4.m90672e((C72963f4) null);
                    if (((C75707s0) C86312j.m106911c(cls2)).mo96078pq(yVar.f224052c)) {
                        bo4.f227035w = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69662L3(yVar.f224052c);
                    }
                    bo4.f227029q = ((C87107w.C75813c) C67380a.C67381a.f193260a).mo106107b(yVar.f224052c, (int) yVar.f224062m);
                    bo4.f227030r = i;
                    if (i2 != 1) {
                        C51018qv3 qv32 = new C51018qv3();
                        C89349b bVar2 = new C89349b(jVar.f173719a, 0, jVar.f173720b);
                        qv32.mo73349j(bVar2);
                        qv32.f140572d = bVar2.f257327a.length;
                        qv32.f140573e = true;
                        bo4.f227026n = qv32;
                        bo4.f227022g = jVar.f173720b;
                    } else {
                        C51018qv3 qv33 = new C51018qv3();
                        qv33.mo73349j(C89349b.m111674a(new byte[1]));
                        bo4.f227026n = qv33;
                        bo4.f227022g = 1;
                    }
                    Log.m105918d("MicroMsg.NetSceneUploadVoice", "cancelFlag:" + i2 + " endFlag:" + this.f224027w + " svrId:" + yVar.f224054e);
                    Log.m105926v("MicroMsg.NetSceneUploadVoice", "doscene msgId:" + bo4.f227033u + " user:" + bo4.f227020e + " offset:" + bo4.f227021f + " dataLen:" + bo4.f227026n.f140572d + " endFlag:" + bo4.f227027o);
                    Log.m105924i("MicroMsg.NetSceneUploadVoice", "doScene MsgId:" + yVar.f224054e + " voiceFormat:" + i + " file:" + this.f224013f + " readBytes:" + jVar.f173720b + " neTTTOff:" + yVar.f224055f + " neWWWOff:" + this.f224018n + " endFlag:" + this.f224027w + " cancelFlag:" + i2 + " status:" + yVar.f224058i + " voiceLen:" + i16);
                    this.f224016i = System.currentTimeMillis();
                    this.f224028x = Util.currentTicks();
                    return dispatch(gVar2, this.f224012e, this);
                }
                prepareDispatcher(gVar);
                if (this.f224026v) {
                    this.f224030z.stopTimer();
                    if (!this.f224020p) {
                        C117407d.INSTANCE.idkeyStat(111, 50, 1, false);
                        Log.m105924i("MicroMsg.NetSceneUploadVoice", "start voice cdn upload");
                        C98124g gVar3 = new C98124g();
                        gVar3.field_fileType = 15;
                        gVar3.field_fullpath = C76552z.m92075m(this.f224013f);
                        gVar3.field_mediaId = "VoiceData" + this.f224013f;
                        gVar3.field_totalLen = (int) C86013q1.m106451l(gVar3.field_fullpath);
                        if (this.f224025u) {
                            gVar3.field_chattype = 1;
                        } else {
                            gVar3.field_chattype = 0;
                        }
                        this.f224028x = Util.currentTicks();
                        if (((C77384i) C86312j.m106911c(C77384i.class)).mo107507vL(gVar3, new WeakReference(this.f224010A)) == null) {
                            return -1;
                        }
                        this.f224020p = true;
                        return 0;
                    } else if (!this.f224021q) {
                        return 0;
                    } else {
                        Log.m105924i("MicroMsg.NetSceneUploadVoice", "start voice cgi");
                        C76551y yVar2 = o;
                        this.f224018n = (int) C86013q1.m106451l(C76552z.m92075m(this.f224013f));
                        this.f224027w = 1;
                        C47350c.C47352b bVar3 = new C47350c.C47352b();
                        bVar3.f127066a = new bo4();
                        bVar3.f127067b = new co4();
                        bVar3.f127068c = "/cgi-bin/micromsg-bin/uploadvoice";
                        bVar3.f127069d = 127;
                        bVar3.f127070e = 19;
                        bVar3.f127071f = 1000000019;
                        C47350c a2 = bVar3.mo72403a();
                        this.f224012e = a2;
                        bo4 bo42 = (bo4) a2.f127055a.f127080a;
                        bo42.f227019d = C75592q0.m90789s();
                        bo42.f227020e = yVar2.f224052c;
                        bo42.f227021f = yVar2.f224055f;
                        bo42.f227023h = yVar2.f224053d;
                        bo42.f227025j = i16;
                        bo42.f227027o = this.f224027w;
                        bo42.f227033u = yVar2.f224054e;
                        bo42.f227028p = i2;
                        bo42.f227032t = this.f224015h;
                        bo42.f227029q = C75569c4.m90672e((C72963f4) null);
                        if (((C75707s0) C86312j.m106911c(cls2)).mo96078pq(yVar2.f224052c)) {
                            bo42.f227035w = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69662L3(yVar2.f224052c);
                        }
                        bo42.f227029q = ((C87107w.C75813c) C67380a.C67381a.f193260a).mo106107b(yVar2.f224052c, (int) yVar2.f224062m);
                        bo42.f227030r = i;
                        bo42.f227036x = this.f224022r;
                        bo42.f227037y = this.f224023s;
                        bo42.f227021f = 0;
                        bo42.f227022g = this.f224018n;
                        return dispatch(gVar2, this.f224012e, this);
                    }
                } else {
                    this.f224030z.startTimer(500, 500);
                    return 0;
                }
            }
        }
        Log.m105920e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + this.f224013f);
        this.f224017j = C76861g.m92658a() + 10000;
        return -1;
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f224014g, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public int getType() {
        return 127;
    }

    /* renamed from: j1 */
    public final void mo106780j1(int i, String str) {
        if (this.f224024t) {
            C21321k.m23908c(this.f224013f, 3, i, this.f224029y, this.f224025u, str);
        } else if (this.f224019o) {
            C21321k.m23908c(this.f224013f, 2, i, this.f224029y, this.f224025u, str);
        } else {
            C21321k.m23908c(this.f224013f, 1, i, this.f224029y, this.f224025u, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0386  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r31, int r32, int r33, java.lang.String r34, com.tencent.p014mm.network.C114799u r35, byte[] r36) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            r2 = r33
            r3 = r34
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r0.f224013f
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r32)
            r8 = 1
            r5[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r33)
            r9 = 2
            r5[r9] = r6
            boolean r6 = r0.f224019o
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r10 = 3
            r5[r10] = r6
            boolean r6 = r0.f224024t
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r11 = 4
            r5[r11] = r6
            java.lang.String r6 = "MicroMsg.NetSceneUploadVoice"
            java.lang.String r12 = "onGYNetEnd: file %s errType %d errCode %d cdnUpload %s forceDisableCdn %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r5)
            long r12 = r0.f224029y
            long r14 = r0.f224028x
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r14)
            long r12 = r12 + r14
            r0.f224029y = r12
            r5 = r35
            ob0.c r5 = (ob0.C47350c) r5
            ob0.c$c r12 = r5.f127055a
            pe3.a r12 = r12.f127080a
            te3.bo4 r12 = (te3.bo4) r12
            ob0.c$d r5 = r5.f127056b
            pe3.a r5 = r5.f127083a
            te3.co4 r5 = (te3.co4) r5
            if (r5 == 0) goto L_0x0069
            if (r1 == r11) goto L_0x005c
            if (r1 != 0) goto L_0x0069
            if (r2 != 0) goto L_0x0069
        L_0x005c:
            java.lang.Class<f62.s0> r13 = f62.C75707s0.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            f62.s0 r13 = (f62.C75707s0) r13
            int r14 = r5.f131883r
            r13.mo96077Vq(r14)
        L_0x0069:
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = 0
            if (r1 != r11) goto L_0x00ce
            r8 = -22
            if (r2 != r8) goto L_0x00ce
            java.lang.String r5 = r0.f224013f
            kd0.y r5 = kd0.C76552z.m92077o(r5)
            if (r5 != 0) goto L_0x007b
            goto L_0x00c3
        L_0x007b:
            int r6 = r5.f224058i
            if (r6 != r10) goto L_0x00b1
            k40.a r6 = f40.C86709a0.m107533q(r4)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            long r10 = r5.f224062m
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.b00(r10)
            java.lang.String r8 = r5.f224063n
            int r10 = r5.f224061l
            long r10 = (long) r10
            java.lang.String r7 = kd0.C76549w.m92049c(r8, r10, r7)
            r6.mo108732L2(r7)
            r6.mo100991d(r9)
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            g62.l r4 = r4.mo96095LE()
            long r7 = r5.f224062m
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            r4.xy0(r7, r6)
        L_0x00b1:
            r4 = 97
            r5.f224058i = r4
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 / r13
            r5.f224060k = r6
            r4 = 320(0x140, float:4.48E-43)
            r5.f224050a = r4
            kd0.C76552z.m92088z(r5)
        L_0x00c3:
            ob0.n r4 = r0.f224011d
            r4.onSceneEnd(r1, r2, r3, r0)
            r1 = 322(0x142, float:4.51E-43)
            r0.mo106780j1(r1, r15)
            return
        L_0x00ce:
            java.lang.String r8 = ""
            if (r1 != r11) goto L_0x0100
            if (r2 == 0) goto L_0x0100
            java.lang.String r4 = r0.f224013f
            kd0.C76552z.m92084v(r4)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 111(0x6f, double:5.5E-322)
            r12 = 237(0xed, double:1.17E-321)
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            ob0.n r4 = r0.f224011d
            r4.onSceneEnd(r1, r2, r3, r0)
            r1 = 323(0x143, float:4.53E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            r0.mo106780j1(r1, r2)
            return
        L_0x0100:
            java.lang.String r10 = "onGYNetEnd file:"
            if (r1 != 0) goto L_0x0405
            if (r2 == 0) goto L_0x0108
            goto L_0x0405
        L_0x0108:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "onGYNetEnd msgId:"
            r11.append(r13)
            long r13 = r5.f131882q
            r11.append(r13)
            java.lang.String r13 = " toUser:"
            r11.append(r13)
            java.lang.String r13 = r12.f227020e
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r11)
            long r13 = r5.f131882q
            r19 = 0
            int r11 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r11 > 0) goto L_0x017d
            java.lang.String r11 = r12.f227020e
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85811N4(r11)
            if (r11 != 0) goto L_0x017d
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 111(0x6f, double:5.5E-322)
            r24 = 235(0xeb, double:1.16E-321)
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r7 = r0.f224013f
            r4.append(r7)
            java.lang.String r7 = " getMsgId:"
            r4.append(r7)
            long r7 = r5.f131882q
            r4.append(r7)
            java.lang.String r7 = " netoff:"
            r4.append(r7)
            int r5 = r5.f131874f
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f224013f
            kd0.C76552z.m92084v(r4)
            ob0.n r4 = r0.f224011d
            r4.onSceneEnd(r1, r2, r3, r0)
            r1 = 321(0x141, float:4.5E-43)
            r0.mo106780j1(r1, r15)
            return
        L_0x017d:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            long r12 = r5.f131882q
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r7] = r12
            int r12 = sf0.C90188n0.f258951s
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 1
            r11[r13] = r12
            java.lang.String r12 = "dkmsgid  set svrmsgid %d -> %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r12, r11)
            r11 = 10007(0x2717, float:1.4023E-41)
            int r12 = sf0.C90188n0.f258950r
            if (r11 != r12) goto L_0x01a4
            int r11 = sf0.C90188n0.f258951s
            if (r11 == 0) goto L_0x01a4
            long r11 = (long) r11
            r5.f131882q = r11
            sf0.C90188n0.f258951s = r7
        L_0x01a4:
            java.lang.String r11 = r0.f224013f
            int r12 = r0.f224018n
            long r13 = r5.f131882q
            java.lang.String r15 = r5.f131877i
            int r7 = r0.f224027w
            int r9 = r0.f224015h
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<ob0.r>> r23 = kd0.C76552z.f224074a
            r23 = -1
            if (r11 != 0) goto L_0x01bd
        L_0x01b6:
            r25 = r5
            r26 = r6
            r7 = -1
            goto L_0x02f1
        L_0x01bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dkmsgid UpdateAfterSend file:["
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = "] newOff:"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = " SvrID:"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " clientID:"
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " hasSendEndFlag "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.VoiceLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            kd0.y r1 = kd0.C76552z.m92077o(r11)
            if (r1 != 0) goto L_0x01fa
            goto L_0x01b6
        L_0x01fa:
            r1.f224055f = r12
            long r23 = java.lang.System.currentTimeMillis()
            r25 = r5
            r26 = r6
            r17 = 1000(0x3e8, double:4.94E-321)
            long r5 = r23 / r17
            r1.f224060k = r5
            r5 = 264(0x108, float:3.7E-43)
            r1.f224050a = r5
            java.lang.String r5 = r1.f224053d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0220
            if (r15 == 0) goto L_0x0220
            r1.f224053d = r15
            int r5 = r1.f224050a
            r5 = r5 | 512(0x200, float:7.175E-43)
            r1.f224050a = r5
        L_0x0220:
            long r5 = r1.f224054e
            int r15 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r15 != 0) goto L_0x0232
            int r5 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x0232
            r1.f224054e = r13
            int r5 = r1.f224050a
            r6 = 4
            r5 = r5 | r6
            r1.f224050a = r5
        L_0x0232:
            int r5 = r1.f224057h
            if (r5 > r12) goto L_0x02e7
            int r5 = r1.f224058i
            r6 = 3
            if (r5 != r6) goto L_0x02e7
            r5 = 1
            if (r7 != r5) goto L_0x02e7
            r5 = 99
            r1.f224058i = r5
            int r5 = r1.f224050a
            r5 = r5 | 64
            r1.f224050a = r5
            k40.a r5 = f40.C86709a0.m107533q(r4)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            long r6 = r1.f224062m
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r5 = r5.b00(r6)
            java.lang.String r6 = r1.f224052c
            r5.mo108749c3(r6)
            long r6 = r1.f224054e
            r5.mo108745Y2(r6)
            r6 = 2
            r5.mo100991d(r6)
            java.lang.String r6 = r1.f224063n
            int r7 = r1.f224061l
            long r12 = (long) r7
            r7 = 0
            java.lang.String r6 = kd0.C76549w.m92049c(r6, r12, r7)
            r5.mo108732L2(r6)
            r5.mo101007n4(r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = kd0.C76552z.f224075b
            java.lang.String r7 = kd0.C76552z.m92075m(r11)
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0293
            int r6 = r6.intValue()
            r1.f224070u = r6
            int r6 = r1.f224050a
            r7 = 524288(0x80000, float:7.34684E-40)
            r6 = r6 | r7
            r1.f224050a = r6
        L_0x0293:
            k40.a r6 = f40.C86709a0.m107533q(r4)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            long r12 = r1.f224062m
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            r6.xy0(r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "END!!! updateSend  file:"
            r6.append(r7)
            r6.append(r11)
            java.lang.String r7 = " total:"
            r6.append(r7)
            int r7 = r1.f224057h
            r6.append(r7)
            java.lang.String r7 = " status:"
            r6.append(r7)
            int r7 = r1.f224058i
            r6.append(r7)
            java.lang.String r7 = " netTimes:"
            r6.append(r7)
            int r7 = r1.f224064o
            r6.append(r7)
            java.lang.String r7 = " msgId:"
            r6.append(r7)
            long r12 = r5.getMsgId()
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r5)
            kd0.C76552z.m92067e(r11)
            r7 = 1
            goto L_0x02e8
        L_0x02e7:
            r7 = 0
        L_0x02e8:
            boolean r1 = kd0.C76552z.m92088z(r1)
            if (r1 != 0) goto L_0x02f1
            r23 = -4
            r7 = -4
        L_0x02f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dkmsgid onGYNetEnd updateAfterSend:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " file:"
            r1.append(r2)
            java.lang.String r2 = r0.f224013f
            r1.append(r2)
            java.lang.String r2 = " MsgSvrId:"
            r1.append(r2)
            r5 = r25
            long r11 = r5.f131882q
            r1.append(r11)
            java.lang.String r2 = " clientId:"
            r1.append(r2)
            java.lang.String r2 = r5.f131877i
            r1.append(r2)
            java.lang.String r2 = " neWWOff:"
            r1.append(r2)
            int r2 = r0.f224018n
            r1.append(r2)
            java.lang.String r2 = " neTTTT:"
            r1.append(r2)
            int r2 = r5.f131875g
            r1.append(r2)
            java.lang.String r2 = " forwardflag:"
            r1.append(r2)
            int r2 = r0.f224015h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            if (r7 >= 0) goto L_0x0386
            r1 = 325(0x145, float:4.55E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r0.mo106780j1(r1, r4)
            java.lang.String r1 = r0.f224013f
            kd0.C76552z.m92084v(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r4 = r0.f224013f
            r1.append(r4)
            java.lang.String r4 = "UpdateAfterSend Ret:"
            r1.append(r4)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            ob0.n r1 = r0.f224011d
            r5 = r32
            r6 = r33
            r1.onSceneEnd(r5, r6, r3, r0)
            return
        L_0x0386:
            r5 = r32
            r6 = r33
            r1 = 1
            if (r7 != r1) goto L_0x03d2
            r1 = 100
            r7 = 0
            r0.mo106780j1(r1, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "onGYNetEnd finish file:"
            r1.append(r7)
            java.lang.String r7 = r0.f224013f
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            java.lang.String r1 = r0.f224013f
            kd0.y r1 = kd0.C76552z.m92077o(r1)
            k40.a r2 = f40.C86709a0.m107533q(r4)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            long r7 = r1.f224062m
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r1 = r2.b00(r7)
            java.lang.Class<ru.g> r2 = p680ru.C101463g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ru.g r2 = (p680ru.C101463g) r2
            r2.mo126782B1(r1)
            ob0.n r1 = r0.f224011d
            r1.onSceneEnd(r5, r6, r3, r0)
            return
        L_0x03d2:
            boolean r1 = r0.f224019o
            if (r1 == 0) goto L_0x03da
            boolean r1 = r0.f224024t
            if (r1 == 0) goto L_0x0404
        L_0x03da:
            boolean r1 = r0.f224026v
            if (r1 == 0) goto L_0x03df
            goto L_0x03e1
        L_0x03df:
            r19 = 500(0x1f4, double:2.47E-321)
        L_0x03e1:
            r3 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r5 = r0.f224013f
            r1.append(r5)
            java.lang.String r5 = " delay:"
            r1.append(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r0.f224030z
            r1.startTimer(r3)
        L_0x0404:
            return
        L_0x0405:
            r5 = r1
            r29 = r6
            r6 = r2
            r2 = r29
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 111(0x6f, double:5.5E-322)
            r14 = 236(0xec, double:1.166E-321)
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r4 = r0.f224013f
            r1.append(r4)
            java.lang.String r4 = " errType:"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = " errCode:"
            r1.append(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            ob0.n r1 = r0.f224011d
            r1.onSceneEnd(r5, r6, r3, r0)
            r1 = 324(0x144, float:4.54E-43)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r32)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r33)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "type:%d;code:%d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.mo106780j1(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C76540g.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 60;
    }

    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            C115669n.INSTANCE.idkeyStat(111, 239, 1, false);
        }
        return securityLimitCountReach;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        C51018qv3 qv32;
        bo4 bo4 = (bo4) ((C47350c) uVar).f127055a.f127080a;
        if (!this.f224019o) {
            Log.m105926v("MicroMsg.NetSceneUploadVoice", "check msgId:" + bo4.f227033u + " offset:" + bo4.f227021f + " dataLen:" + bo4.f227026n.f140572d + " endFlag:" + bo4.f227027o);
            if ((bo4.f227033u == 0 && bo4.f227021f != 0) || !(((qv32 = bo4.f227026n) != null && qv32.f140572d != 0) || bo4.f227027o == 1 || bo4.f227028p == 1)) {
                return y$$d.EFailed;
            }
        }
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C115669n.INSTANCE.idkeyStat(111, 238, 1, false);
        C76552z.m92084v(this.f224013f);
    }
}
