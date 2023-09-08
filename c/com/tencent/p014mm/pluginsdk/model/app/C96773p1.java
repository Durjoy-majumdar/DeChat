package com.tencent.p014mm.pluginsdk.model.app;

import android.os.Handler;
import android.os.Message;
import androidx.camera.core.FocusMeteringAction;
import c02.C92331c;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import java.io.ByteArrayOutputStream;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import te3.sm4;
import te3.tm4;

/* renamed from: com.tencent.mm.pluginsdk.model.app.p1 */
public class C96773p1 extends C117747y implements C1311n {

    /* renamed from: d */
    public int f283505d = 8192;

    /* renamed from: e */
    public C47350c f283506e;

    /* renamed from: f */
    public C11385n f283507f;

    /* renamed from: g */
    public String f283508g;

    /* renamed from: h */
    public C72683d f283509h;

    /* renamed from: i */
    public long f283510i;

    /* renamed from: j */
    public boolean f283511j = true;

    /* renamed from: n */
    public boolean f283512n;

    /* renamed from: o */
    public Handler f283513o = new C96775b((C96774a) null);

    /* renamed from: p */
    public long f283514p = 0;

    /* renamed from: q */
    public String f283515q = "";

    /* renamed from: r */
    public C98124g.C98125a f283516r = new C96774a();

    /* renamed from: com.tencent.mm.pluginsdk.model.app.p1$a */
    public class C96774a implements C98124g.C98125a {
        public C96774a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            Class cls = C92331c.class;
            Object[] objArr = new Object[7];
            objArr[0] = C96773p1.this.f283515q;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = cVar2;
            objArr[3] = dVar2;
            objArr[4] = Boolean.valueOf(cVar2 != null);
            objArr[5] = Boolean.valueOf(dVar2 != null);
            objArr[6] = Boolean.valueOf(z);
            Log.m105919d("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s], progressing[%b], finish[%b], onlyCheckExist[%b]", objArr);
            if (i2 == -21005) {
                Log.m105925i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", C96773p1.this.f283515q);
                C96773p1 p1Var = C96773p1.this;
                p1Var.f283512n = false;
                p1Var.f283513o.removeMessages(1);
                return 0;
            } else if (i2 != 0) {
                C96773p1 p1Var2 = C96773p1.this;
                p1Var2.f283512n = false;
                p1Var2.f283513o.removeMessages(1);
                ((C92331c) C86312j.m106911c(cls)).zw0(C96773p1.this.f283508g, "");
                return 0;
            } else {
                C72683d dVar3 = C96773p1.this.f283509h;
                long j = dVar3.field_status;
                if (j == 105) {
                    Log.m105925i("MicroMsg.NetSceneUploadAppAttachForHandOff", "attach upload has paused, status:%d", Long.valueOf(j));
                    C96773p1 p1Var3 = C96773p1.this;
                    p1Var3.f283512n = false;
                    p1Var3.f283513o.removeMessages(1);
                    ((C101213l) C86312j.m106911c(C101213l.class)).gn0(C96773p1.this.f283515q);
                    return 0;
                } else if (cVar2 != null) {
                    dVar3.field_lastModifyTime = Util.nowSecond();
                    C96773p1 p1Var4 = C96773p1.this;
                    C72683d dVar4 = p1Var4.f283509h;
                    long j2 = cVar2.field_finishedLength;
                    dVar4.field_offset = j2;
                    p1Var4.f283510i = j2;
                    return 0;
                } else {
                    if (dVar2 != null) {
                        int i3 = dVar2.field_retCode;
                        if (i3 != 0) {
                            Log.m105921e("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback sceneResult.retCode :%d arg[%s] info[%s]", Integer.valueOf(i3), dVar2.field_arg, dVar2.field_transInfo, "", "", "", "", "", "", "", dVar2.f287610b);
                            C96773p1 p1Var5 = C96773p1.this;
                            p1Var5.f283512n = false;
                            p1Var5.f283513o.removeMessages(1);
                            ((C92331c) C86312j.m106911c(cls)).zw0(C96773p1.this.f283508g, "");
                        } else {
                            Log.m105925i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], signature[%s]", Integer.valueOf(dVar2.field_UploadHitCacheType), Boolean.valueOf(z), Boolean.valueOf(dVar2.field_exist_whencheck), Util.secPrint(C96773p1.this.f283509h.field_signature));
                            C96773p1 p1Var6 = C96773p1.this;
                            p1Var6.f283512n = false;
                            p1Var6.f283513o.removeMessages(1);
                            ((C92331c) C86312j.m106911c(cls)).Eq0(C96773p1.this.f283508g, dVar2.field_fileId, dVar2.field_aesKey);
                        }
                    }
                    return 0;
                }
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.p1$b */
    public class C96775b extends Handler {
        public C96775b(C96774a aVar) {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C96773p1 p1Var = C96773p1.this;
                if (p1Var.f283512n && p1Var.f283509h.field_status != 105) {
                    C96773p1 p1Var2 = C96773p1.this;
                    if (((C92331c) C86312j.m106911c(C92331c.class)).sc0(p1Var2.f283508g, p1Var2.f283510i)) {
                        sendMessageDelayed(Message.obtain(this, 1, C96773p1.this.f283508g), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                    }
                }
            }
        }
    }

    public C96773p1(String str, C72683d dVar) {
        dVar.field_offset = 0;
        dVar.field_isUpload = true;
        dVar.field_status = 101;
        dVar.field_netTimes = 0;
        this.f283508g = str;
        this.f283509h = dVar;
        if (NetStatusUtil.isWifiOr4G(MMApplicationContext.getContext())) {
            this.f283505d = 32768;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new sm4();
        bVar.f127067b = new tm4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadappattach";
        bVar.f127069d = 220;
        bVar.f127070e = 105;
        bVar.f127071f = 1000000105;
        this.f283506e = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig new NetSceneUploadAppAttachForHandOff stack[%s]", Util.getStack());
    }

    /* renamed from: j1 */
    public static C72683d m124227j1(AbsHandOffFile absHandOffFile) {
        C72683d dVar = new C72683d();
        dVar.field_totalLen = absHandOffFile.getSize();
        dVar.field_fileFullPath = absHandOffFile.getFullPath();
        dVar.field_sdkVer = 0;
        dVar.field_appId = "";
        dVar.field_clientAppDataId = "" + Util.nowMilliSecond();
        dVar.field_type = 0;
        dVar.field_status = 200;
        dVar.field_isUpload = true;
        dVar.field_createTime = C31543z5.m39451a();
        dVar.field_lastModifyTime = Util.nowSecond();
        dVar.field_mediaSvrId = "" + Util.nowMilliSecond();
        dVar.field_isUseCdn = 0;
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0201  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r18, ob0.C11385n r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r0.f283507f = r1
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283509h
            long r1 = r1.field_status
            r3 = -1
            java.lang.String r4 = "MicroMsg.NetSceneUploadAppAttachForHandOff"
            r5 = 101(0x65, double:5.0E-322)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0033
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " summerbig get field_status failed status:"
            r1.append(r2)
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283509h
            long r5 = r2.field_status
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            return r3
        L_0x0033:
            long r1 = r0.f283514p
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0045
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f283514p = r1
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283509h
            long r1 = r1.field_offset
        L_0x0045:
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283509h
            java.lang.String r8 = r7.field_fileFullPath
            r9 = 0
            r2[r9] = r8
            long r7 = r7.field_totalLen
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 1
            r2[r8] = r7
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283509h
            boolean r7 = r7.field_isUpload
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r10 = 2
            r2[r10] = r7
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283509h
            int r7 = r7.field_isUseCdn
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11 = 3
            r2[r11] = r7
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283509h
            long r12 = r7.field_type
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r12 = 4
            r2[r12] = r7
            java.lang.String r7 = "summerbig doScene fileFullPath[%s], totalLen[%d],isUpload[%b], isUseCdn[%b], type[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r2)
            java.lang.Class<qo.l> r2 = p663qo.C101213l.class
            di3.d r7 = di3.C86312j.m106911c(r2)
            qo.l r7 = (p663qo.C101213l) r7
            boolean r7 = r7.dm0(r12)
            if (r7 != 0) goto L_0x00b6
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283509h
            int r7 = r7.field_isUseCdn
            if (r7 == r8) goto L_0x00b6
            java.lang.Object[] r7 = new java.lang.Object[r10]
            di3.d r2 = di3.C86312j.m106911c(r2)
            qo.l r2 = (p663qo.C101213l) r2
            boolean r2 = r2.dm0(r12)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7[r9] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283509h
            int r2 = r2.field_isUseCdn
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r8] = r2
            java.lang.String r2 = "summerbig cdntra not use cdn flag:%b getCdnInfo:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r7)
            goto L_0x00fa
        L_0x00b6:
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283509h
            java.lang.String r7 = r7.field_fileFullPath
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r7)
            int r6 = (int) r5
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f283509h
            long r13 = r5.field_createTime
            com.tencent.mm.storage.z1 r5 = eb0.C75592q0.m90777g()
            java.lang.String r5 = r5.getUsername()
            java.lang.String r7 = ""
            java.lang.String r15 = "upattach"
            java.lang.String r5 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r15, r13, r5, r7)
            r0.f283515q = r5
            java.lang.Object[] r5 = new java.lang.Object[r10]
            com.tencent.mm.pluginsdk.model.app.d r13 = r0.f283509h
            long r13 = r13.field_createTime
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r5[r9] = r13
            java.lang.String r13 = r0.f283515q
            r5[r8] = r13
            java.lang.String r13 = "summerbig cdntra genClientId field_createTime[%d], useCdnTransClientId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r13, r5)
            java.lang.String r5 = r0.f283515q
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x00fd
            java.lang.String r2 = "summerbig cdntra genClientId failed not use cdn"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)
        L_0x00fa:
            r2 = 0
            goto L_0x01eb
        L_0x00fd:
            gi.g r5 = new gi.g
            r5.<init>()
            java.lang.String r13 = "task_NetSceneUploadAppAttachForHandOff"
            r5.f287660d = r13
            r5.field_appType = r9
            gi.g$a r13 = r0.f283516r
            r5.f287662f = r13
            java.lang.String r13 = r0.f283515q
            r5.field_mediaId = r13
            com.tencent.mm.pluginsdk.model.app.d r13 = r0.f283509h
            java.lang.String r13 = r13.field_fileFullPath
            r5.field_fullpath = r13
            r5.field_fileType = r1
            r5.field_priority = r10
            r5.field_totalLen = r6
            r5.field_needStorage = r9
            r5.field_isStreamMedia = r9
            boolean r13 = r0.f283511j
            r5.field_enable_hitcheck = r13
            java.lang.String r13 = r5.field_aesKey
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0144
            com.tencent.mm.modelcdntran.u r13 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            r13.getClass()
            java.lang.String r13 = com.tencent.mars.cdn.CdnLogic.createAeskey()
            r5.field_aesKey = r13
            java.lang.Object[] r14 = new java.lang.Object[r8]
            r14[r9] = r13
            java.lang.String r13 = "summersafecdn gen aesKey new[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r14)
        L_0x0144:
            r13 = 14
            java.lang.Object[] r13 = new java.lang.Object[r13]
            com.tencent.mm.pluginsdk.model.app.d r14 = r0.f283509h
            long r14 = r14.field_msgInfoId
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r9] = r14
            java.lang.String r14 = r5.field_fullpath
            r13[r8] = r14
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r13[r10] = r6
            java.lang.String r6 = r0.f283515q
            r13[r11] = r6
            int r6 = r5.field_fileType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r13[r12] = r6
            boolean r6 = r5.field_enable_hitcheck
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r13[r1] = r6
            boolean r6 = r5.field_onlycheckexist
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r14 = 6
            r13[r14] = r6
            boolean r14 = r5.field_force_aeskeycdn
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15 = 7
            r13[r15] = r14
            r14 = 8
            boolean r15 = r5.field_trysafecdn
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r13[r14] = r15
            r14 = 9
            java.lang.String r15 = r5.field_aesKey
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r15)
            r13[r14] = r15
            r14 = 10
            java.lang.String r15 = r5.field_filemd5
            r13[r14] = r15
            r14 = 11
            java.lang.String r15 = r5.field_svr_signature
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r15)
            r13[r14] = r15
            r14 = 12
            java.lang.String r15 = r5.field_fake_bigfile_signature_aeskey
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r15)
            r13[r14] = r15
            r14 = 13
            java.lang.String r15 = r5.field_fake_bigfile_signature
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r15)
            r13[r14] = r15
            java.lang.String r14 = "summerbig cdntra checkUseCdn msgId:%d file[%s][%d], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b] force_aeskeycdn[%b] trysafecdn[%b] aeskey[%s], md5[%s], signature[%s], faeskey[%s], fsignature[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r13)
            di3.d r2 = di3.C86312j.m106911c(r2)
            qo.l r2 = (p663qo.C101213l) r2
            boolean r2 = r2.if0(r5)
            if (r2 != 0) goto L_0x01d6
            java.lang.String r2 = "summerbig cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
            r0.f283515q = r7
            goto L_0x00fa
        L_0x01d6:
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283509h
            int r5 = r2.field_isUseCdn
            if (r5 == r8) goto L_0x01de
            r2.field_isUseCdn = r8
        L_0x01de:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r5 = r0.f283515q
            r2[r9] = r5
            java.lang.String r5 = "summerbig checkUseCdn ret true useCdnTransClientId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
            r2 = 1
        L_0x01eb:
            if (r2 == 0) goto L_0x0201
            r0.f283512n = r8
            android.os.Handler r1 = r0.f283513o
            java.lang.String r2 = r0.f283508g
            android.os.Message r1 = android.os.Message.obtain(r1, r8, r2)
            r1.sendToTarget()
            java.lang.String r1 = "summerbig doScene cdntra use cdn return -1 for onGYNetEnd client"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r1)
            return r9
        L_0x0201:
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283509h
            long r13 = r2.field_netTimes
            r15 = 3200(0xc80, double:1.581E-320)
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0224
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " summerbig doScene info.field_netTimes > DOSCENE_LIMIT SET ERROR!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            return r3
        L_0x0224:
            r15 = 1
            long r13 = r13 + r15
            r2.field_netTimes = r13
            java.lang.String r2 = r2.field_clientAppDataId
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x023b
            java.lang.String r1 = "summerbig doScene checkArgs : clientAppDataId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x023b:
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283509h
            long r13 = r2.field_totalLen
            r15 = 0
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0325
            r15 = 26214400(0x1900000, double:1.29516345E-316)
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x024e
            goto L_0x0325
        L_0x024e:
            java.lang.String r2 = r2.field_fileFullPath
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0260
            java.lang.String r1 = "summerbig doScene checkArgs : fileFullPath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0260:
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283509h
            java.lang.String r2 = r2.field_fileFullPath
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r2 = (int) r13
            r5 = 26214400(0x1900000, float:5.2897246E-38)
            if (r2 <= r5) goto L_0x0274
            java.lang.String r1 = "summerbig doScene doScene : file is too large"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            return r3
        L_0x0274:
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283509h
            java.lang.String r5 = r2.field_fileFullPath
            long r13 = r2.field_offset
            int r2 = (int) r13
            int r7 = r0.f283505d
            byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r2, r7)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r5 == 0) goto L_0x0291
            java.lang.String r1 = "summerbig doScene doScene : data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0291:
            ob0.c r3 = r0.f283506e
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            te3.sm4 r3 = (te3.sm4) r3
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283509h
            java.lang.String r5 = r4.field_appId
            r3.f299433d = r5
            long r13 = r4.field_sdkVer
            int r5 = (int) r13
            r3.f299434e = r5
            java.lang.String r5 = r4.field_clientAppDataId
            r3.f299435f = r5
            long r4 = r4.field_type
            int r5 = (int) r4
            r3.f299441o = r5
            java.lang.String r4 = eb0.C75592q0.m90789s()
            r3.f299436g = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283509h
            long r13 = r4.field_totalLen
            int r5 = (int) r13
            r3.f299437h = r5
            long r4 = r4.field_offset
            int r5 = (int) r4
            r3.f299438i = r5
            int r4 = r2.length
            r3.f299439j = r4
            te3.qv3 r4 = new te3.qv3
            r4.<init>()
            r4.mo73350k(r2)
            r3.f299440n = r4
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r3.f299433d
            r2[r9] = r4
            int r4 = r3.f299434e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r8] = r4
            java.lang.String r4 = r3.f299435f
            r2[r10] = r4
            int r4 = r3.f299441o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r11] = r4
            java.lang.String r4 = r3.f299436g
            r2[r12] = r4
            int r4 = r3.f299437h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r1] = r4
            int r1 = r3.f299438i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 6
            r2[r3] = r1
            java.lang.String r1 = "AppId=%s, SdkVersion=%d, ClientAppDataId=%s, Type=%d, UserName=%s, TotalLen=%d, StartPos=%d"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.String r2 = "UploadAppAttach"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            r0.f283512n = r8
            android.os.Handler r1 = r0.f283513o
            boolean r1 = r1.hasMessages(r8)
            if (r1 != 0) goto L_0x031c
            android.os.Handler r1 = r0.f283513o
            java.lang.String r2 = r0.f283508g
            android.os.Message r1 = android.os.Message.obtain(r1, r8, r2)
            r1.sendToTarget()
        L_0x031c:
            ob0.c r1 = r0.f283506e
            r2 = r18
            int r1 = r0.dispatch(r2, r1, r0)
            return r1
        L_0x0325:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "summerbig doScene checkArgs : totalLen is invalid, totalLen = "
            r1.append(r2)
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283509h
            long r5 = r2.field_totalLen
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            p206nj.C76861g.m92658a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C96773p1.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 220;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        Class cls = C92331c.class;
        Log.m105918d("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd : errType = " + i2 + ", errCode = " + i3);
        if (i2 == 3 && i3 == -1 && !Util.isNullOrNil(this.f283515q)) {
            Log.m105929w("MicroMsg.NetSceneUploadAppAttachForHandOff", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", this.f283515q);
            this.f283512n = false;
            this.f283513o.removeMessages(1);
        } else if (i2 == 0 && i3 == 0) {
            tm4 tm4 = (tm4) ((C47350c) uVar).f127056b.f127083a;
            String str2 = tm4.f185612d;
            if (str2 == null || (str2.equals(this.f283509h.field_appId) && tm4.f185614f.equals(this.f283509h.field_clientAppDataId))) {
                int i5 = tm4.f185616h;
                if (i5 >= 0) {
                    long j = (long) i5;
                    C72683d dVar = this.f283509h;
                    long j2 = dVar.field_totalLen;
                    if (j == j2 && (i4 = tm4.f185617i) >= 0 && ((long) i4) <= j2) {
                        dVar.field_offset = (long) i4;
                        dVar.field_mediaSvrId = C72695v.m85060b(tm4.f185613e) ? tm4.f185613e : "";
                        C72683d dVar2 = this.f283509h;
                        if (dVar2.field_status == 105) {
                            Log.m105928w("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd STATUS PAUSE [" + this.f283509h.field_mediaSvrId + "," + this.f283509h.field_offset + "] ");
                            this.f283512n = false;
                            this.f283513o.removeMessages(1);
                            return;
                        }
                        long j3 = dVar2.field_offset;
                        if (j3 != dVar2.field_totalLen) {
                            this.f283510i = j3;
                        } else if (Util.isNullOrNil(dVar2.field_mediaSvrId)) {
                            Log.m105920e("MicroMsg.NetSceneUploadAppAttachForHandOff", "finish upload but mediaid == null!");
                            this.f283512n = false;
                            this.f283513o.removeMessages(1);
                            ((C92331c) C86312j.m106911c(cls)).zw0(this.f283508g, "");
                            return;
                        } else {
                            this.f283509h.field_status = 199;
                        }
                        if (this.f283509h.field_status == 199) {
                            this.f283512n = false;
                            this.f283513o.removeMessages(1);
                            String str3 = this.f283508g;
                            C72683d dVar3 = this.f283509h;
                            ((C92331c) C86312j.m106911c(cls)).x20(str3, dVar3.field_appId, (int) dVar3.field_sdkVer, dVar3.field_mediaSvrId);
                            return;
                        } else if (doScene(dispatcher(), this.f283507f) < 0) {
                            Log.m105920e("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd : doScene fail");
                            this.f283512n = false;
                            this.f283513o.removeMessages(1);
                            ((C92331c) C86312j.m106911c(cls)).zw0(this.f283508g, "");
                            return;
                        } else {
                            return;
                        }
                    }
                }
                Log.m105920e("MicroMsg.NetSceneUploadAppAttachForHandOff", "dataLen, startPos or totalLen is incorrect");
                this.f283512n = false;
                this.f283513o.removeMessages(1);
                ((C92331c) C86312j.m106911c(cls)).zw0(this.f283508g, "");
                return;
            }
            Log.m105920e("MicroMsg.NetSceneUploadAppAttachForHandOff", "argument is not consistent");
            this.f283512n = false;
            this.f283513o.removeMessages(1);
            ((C92331c) C86312j.m106911c(cls)).zw0(this.f283508g, "");
        } else {
            Log.m105920e("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd : errType = " + i2 + ", errCode = " + i3);
            this.f283512n = false;
            this.f283513o.removeMessages(1);
            ((C92331c) C86312j.m106911c(cls)).zw0(this.f283508g, "");
        }
    }

    public int securityLimitCount() {
        return 3200;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
