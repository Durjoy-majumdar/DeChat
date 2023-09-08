package hd0;

import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.modelimage.C92855q0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1791a0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;

public class q$$e implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C98415q f288656d;

    /* renamed from: hd0.q$$e$a */
    public class C98424a implements C92834j {

        /* renamed from: a */
        public final /* synthetic */ C98121d f288657a;

        /* renamed from: hd0.q$$e$a$a */
        public class C98425a implements Runnable {
            public C98425a() {
            }

            public void run() {
                C98415q qVar = q$$e.this.f288656d;
                qVar.f288627q = false;
                C98408n0 n0Var = qVar.f288624n;
                n0Var.f288562i = 104;
                n0Var.f288563j = Util.nowSecond();
                q$$e.this.f288656d.f288624n.f288564k = Util.nowSecond();
                C98408n0 n0Var2 = q$$e.this.f288656d.f288624n;
                n0Var2.f288557d = 0;
                n0Var2.f288548P = 1800;
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", q$$e.this.f288656d.mo137749p1(), Boolean.valueOf(q$$e.this.f288656d.f288627q), Boolean.valueOf(C98429r0.m127808N(n0Var2)), Long.valueOf(q$$e.this.f288656d.f288624n.f288563j));
                C98415q qVar2 = q$$e.this.f288656d;
                qVar2.doScene(qVar2.dispatcher(), q$$e.this.f288656d.f288617d);
            }
        }

        public C98424a(C98121d dVar) {
            this.f288657a = dVar;
        }

        /* renamed from: a */
        public void mo127120a(int i, int i2) {
            if (i == 4 && i2 == 102) {
                C86709a0.m107525e().postToWorker(new C98425a());
                return;
            }
            C98384a.m127689a(q$$e.this.f288656d.f288624n, 0);
            q$$e.this.f288656d.mo137748o1(this.f288657a);
            C98415q qVar = q$$e.this.f288656d;
            qVar.f288617d.onSceneEnd(i, i2, "", qVar);
        }
    }

    public q$$e(C98415q qVar) {
        this.f288656d = qVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        int i2;
        int i3 = i;
        C98120c cVar2 = cVar;
        C98121d dVar2 = dVar;
        int i4 = 2;
        Log.m105919d("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", this.f288656d.mo137749p1(), this.f288656d.f288628r, Integer.valueOf(i), cVar2, dVar2);
        if (i3 == -21005) {
            Log.m105919d("MicroMsg.NetSceneUploadVideo", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", this.f288656d.f288628r);
            return 0;
        } else if (i3 != 0) {
            C98429r0.m127799E(this.f288656d.f288619f);
            C98415q qVar = this.f288656d;
            qVar.f288617d.onSceneEnd(3, i3, "", qVar);
            return 0;
        } else {
            C98415q qVar2 = this.f288656d;
            qVar2.f288624n = C98429r0.m127818i(qVar2.f288619f);
            C98415q qVar3 = this.f288656d;
            C98408n0 n0Var = qVar3.f288624n;
            if (n0Var == null || n0Var.f288562i == 105) {
                int i5 = n0Var == null ? -1 : n0Var.f288562i;
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s info is null or has paused, status:%d", qVar3.mo137749p1(), Integer.valueOf(i5));
                ((C101213l) C86312j.m106911c(C101213l.class)).gn0(this.f288656d.f288628r);
                this.f288656d.f288617d.onSceneEnd(3, i3, "info is null or has paused, status" + i5, this.f288656d);
                return 0;
            } else if (cVar2 == null) {
                if (dVar2 != null) {
                    if (dVar2.field_retCode != 0) {
                        Log.m105921e("MicroMsg.NetSceneUploadVideo", "%s cdntra sceneResult.retCode :%d arg[%s] info[%s]", qVar3.mo137749p1(), Integer.valueOf(dVar2.field_retCode), dVar2.field_arg, dVar2.field_transInfo);
                        C98429r0.m127799E(this.f288656d.f288619f);
                        C98415q qVar4 = this.f288656d;
                        qVar4.f288617d.onSceneEnd(3, dVar2.field_retCode, "", qVar4);
                    } else {
                        Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn uploadvideo by cdn, videohash isHitCacheUpload: %d, enableHitcheck:%b", qVar3.mo137749p1(), Integer.valueOf(dVar2.field_UploadHitCacheType), Boolean.valueOf(this.f288656d.f288627q));
                        C115669n nVar = C115669n.INSTANCE;
                        Object[] objArr = new Object[2];
                        C98415q qVar5 = this.f288656d;
                        objArr[0] = Integer.valueOf((qVar5.f288632v ? 810 : qVar5.f288631u ? C1791a0.CTRL_INDEX : 830) + dVar2.field_UploadHitCacheType);
                        objArr[1] = Integer.valueOf(this.f288656d.f288624n.f288559f);
                        nVar.mo160131h(12696, objArr);
                        boolean z2 = dVar2.field_isVideoReduced;
                        Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s it video was reduced by cdn %b %s", this.f288656d.mo137749p1(), Boolean.valueOf(z2), this.f288656d.f288619f);
                        if (!z2) {
                            i2 = 12696;
                            nVar.idkeyStat(106, 205, 1, false);
                            C98415q qVar6 = this.f288656d;
                            if (qVar6.f288633w > 0 && dVar2.field_thumbimgLength > 0) {
                                Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s send video thumb too big thumb length [%d, %d] ", qVar6.mo137749p1(), Integer.valueOf(this.f288656d.f288633w), Integer.valueOf(dVar2.field_thumbimgLength));
                                if (this.f288656d.f288633w * 2 > dVar2.field_thumbimgLength) {
                                    nVar.idkeyStat(106, 206, 1, false);
                                } else {
                                    nVar.idkeyStat(106, 207, 1, false);
                                }
                            }
                            int l = (int) C86013q1.m106451l(C98398h0.Bx0().mo137728q(this.f288656d.f288619f));
                            Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s send video too big thumb length [%d, %d] ", this.f288656d.mo137749p1(), Integer.valueOf(this.f288656d.f288624n.f288559f), Integer.valueOf(l));
                            if (this.f288656d.f288624n.f288559f != l) {
                                nVar.idkeyStat(106, 208, 1, false);
                            } else {
                                nVar.idkeyStat(106, 209, 1, false);
                            }
                        } else {
                            i2 = 12696;
                            nVar.idkeyStat(106, 200, 1, false);
                        }
                        C98415q qVar7 = this.f288656d;
                        qVar7.f288624n = C98429r0.m127818i(qVar7.f288619f);
                        if (Util.isNullOrNil(this.f288656d.f288624n.mo137705i())) {
                            String str2 = (((((("<msg><videomsg aeskey=\"" + dVar2.field_aesKey + "\" cdnthumbaeskey=\"" + dVar2.field_aesKey + "\" cdnvideourl=\"" + dVar2.field_fileId + "\" ") + "cdnthumburl=\"" + dVar2.field_fileId + "\" ") + "length=\"" + dVar2.field_fileLength + "\" ") + "thumbfullmd5=\"" + dVar2.field_thumbfilemd5 + "\" ") + "cdnthumblength=\"" + dVar2.field_thumbimgLength + "\"/>") + Util.nullAs(this.f288656d.f288624n.f288543K, "")) + "</msg>";
                            Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s cdn callback new build cdnInfo:%s", this.f288656d.mo137749p1(), str2);
                            C98408n0 n0Var2 = this.f288656d.f288624n;
                            n0Var2.f288575v = str2;
                            C98429r0.m127808N(n0Var2);
                        }
                        Map<String, String> parseXml = XmlParser.parseXml(this.f288656d.f288624n.mo137705i(), "msg", (String) null);
                        if (parseXml != null) {
                            Object[] objArr2 = new Object[2];
                            if (C98398h0.Bx0().mo137732v(C98398h0.Bx0().mo137728q(this.f288656d.f288619f), parseXml.get(".msg.videomsg.$cdnvideourl"), parseXml.get(".msg.videomsg.$aeskey"))) {
                                i4 = 1;
                            }
                            objArr2[0] = Integer.valueOf(i4 + 900);
                            objArr2[1] = Integer.valueOf(this.f288656d.f288624n.f288559f);
                            nVar.mo160131h(i2, objArr2);
                        }
                        C98415q qVar8 = this.f288656d;
                        if (qVar8.f288624n.f288576w == 4) {
                            C98415q.m127767j1(qVar8, dVar2);
                            return 0;
                        }
                        C92855q0 f = C92855q0.m117113f();
                        C98415q qVar9 = this.f288656d;
                        f.f267460C = qVar9.f288619f;
                        f.f267461D = z2 ? 0 : qVar9.mo137744k1();
                        f.f267462E = dVar2;
                        f.f267463F = new C98424a(dVar2);
                        f.f295194h = 4;
                        f.mo140195a().mo123694a();
                    }
                }
                return 0;
            } else if (((long) n0Var.f288557d) > cVar2.field_finishedLength) {
                Log.m105929w("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", qVar3.mo137749p1(), Integer.valueOf(this.f288656d.f288624n.f288557d), Long.valueOf(cVar2.field_finishedLength));
                return 0;
            } else {
                n0Var.f288564k = Util.nowSecond();
                C98408n0 n0Var3 = this.f288656d.f288624n;
                n0Var3.f288557d = (int) cVar2.field_finishedLength;
                n0Var3.f288548P = 1032;
                C98429r0.m127808N(n0Var3);
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
