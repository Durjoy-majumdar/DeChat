package uc0;

import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.PoiCategoriesUpdateEvent;
import com.tencent.p014mm.autogen.events.UpdatePackageEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47349a0;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p216op.C47391h;
import p645pj.C47505d;
import r41.C47926a;
import sf0.C48374j0;
import sf0.C90188n0;
import te3.C51201s52;
import te3.C51346t52;
import te3.C52089y93;

/* renamed from: uc0.u */
public class C52522u extends C117747y implements C1311n, C47391h, C47349a0 {

    /* renamed from: d */
    public C11385n f146692d;

    /* renamed from: e */
    public C47350c f146693e;

    /* renamed from: f */
    public int f146694f;

    /* renamed from: g */
    public int f146695g = -1;

    public C52522u(int i, boolean z) {
        this.f146694f = i;
        Log.m105918d("MicroMsg.NetSceneGetPackageList", "Init dkregcode:" + i);
        Log.m105919d("MicroMsg.NetSceneGetPackageList", "isOnlyCheckInReqList: %b", Boolean.valueOf(z));
        if (z) {
            this.f146695g = 1;
        }
    }

    public boolean acceptConcurrent(C117747y yVar) {
        return !(yVar instanceof C52522u) || this.f146694f != ((C52522u) yVar).f146694f;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146692d = nVar;
        Log.m105918d("MicroMsg.NetSceneGetPackageList", "DoScene dkregcode :" + this.f146694f);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51201s52();
        bVar.f127067b = new C51346t52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getpackagelist";
        bVar.f127069d = 159;
        bVar.f127070e = 51;
        bVar.f127071f = 1000000051;
        C47350c a = bVar.mo72403a();
        this.f146693e = a;
        C51201s52 s522 = (C51201s52) a.f127055a.f127080a;
        LinkedList<C52089y93> linkedList = new LinkedList<>();
        if (!C86709a0.m107523b().mo121114l()) {
            return -1;
        }
        C52523w[] bD = C52517f0.xx0().mo73465bD(this.f146694f);
        if (bD != null && bD.length > 0) {
            for (int i = 0; i < bD.length; i++) {
                C52089y93 y932 = new C52089y93();
                y932.f145192d = bD[i].f146696a;
                if (!C90188n0.f258942j || this.f146694f != 7) {
                    if (12 == this.f146694f) {
                        if (!C86013q1.m106450k(C86709a0.m107535s().f251807e + "address")) {
                            Log.m105924i("MicroMsg.NetSceneGetPackageList", "MMRCPTADDRESS final save file not found, set pkg.Version=0");
                            y932.f145193e = 0;
                        }
                    }
                    y932.f145193e = bD[i].f146697b;
                } else {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "isShakeGetConfigList");
                    y932.f145193e = 0;
                }
                Log.m105919d("MicroMsg.NetSceneGetPackageList", "package, id:%d, ver:%d", Integer.valueOf(y932.f145192d), Integer.valueOf(y932.f145193e));
                linkedList.add(y932);
            }
        }
        s522.f141336e = linkedList;
        s522.f141335d = linkedList.size();
        s522.f141337f = this.f146694f;
        int i2 = this.f146695g;
        if (i2 != -1) {
            s522.f141338g = i2;
        }
        return dispatch(gVar, this.f146693e, this);
    }

    public int getType() {
        return 159;
    }

    /* renamed from: j */
    public int mo72393j() {
        return this.f146694f;
    }

    /* renamed from: j1 */
    public final C52523w mo73455j1(C52089y93 y932) {
        C52523w wVar = new C52523w();
        wVar.f146696a = y932.f145192d;
        wVar.f146697b = y932.f145193e;
        wVar.f146698c = y932.f145194f;
        wVar.f146699d = y932.f145195g;
        wVar.f146700e = y932.f145197i;
        wVar.f146701f = 5;
        wVar.f146702g = this.f146694f;
        return wVar;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneGetPackageList", "onGYNetEnd, netid:%d, errType:%d, errCode:%d, pkgType:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(this.f146694f), str2);
        if (i4 == 0 || i5 == 0) {
            C51346t52 t522 = (C51346t52) ((C47350c) uVar).f127056b.f127083a;
            int i6 = t522.f141967h;
            if (i6 != this.f146694f) {
                Log.m105921e("MicroMsg.NetSceneGetPackageList", "packageType is not consistent, respType = %d", Integer.valueOf(i6));
                this.f146692d.onSceneEnd(3, -1, "", this);
                return;
            }
            LinkedList<C52089y93> linkedList = t522.f141964e;
            StringBuilder sb = new StringBuilder();
            sb.append("summer list size:");
            sb.append(linkedList == null ? 0 : linkedList.size());
            sb.append(" packageType: ");
            sb.append(this.f146694f);
            sb.append(" resp.Type: ");
            sb.append(t522.f141967h);
            Log.m105924i("MicroMsg.NetSceneGetPackageList", sb.toString());
            int i7 = this.f146694f;
            if (i7 == 2) {
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "empty emoji pkg list");
                } else {
                    for (int i8 = 0; i8 < linkedList.size(); i8++) {
                        C52089y93 y932 = linkedList.get(i8);
                        C52523w Ow = C52517f0.xx0().mo73461Ow(y932.f145192d, this.f146694f);
                        C52523w j1 = mo73455j1(y932);
                        j1.f146707l = -1;
                        if (Ow == null) {
                            C52517f0.xx0().mo73468kD(j1);
                        } else {
                            C52517f0.xx0().mo73463TE(j1);
                        }
                        byte[] d = C48374j0.m53715d(y932.f145196h);
                        if (d != null && d.length > 0) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new String(d));
                            arrayList.size();
                        }
                    }
                }
            } else if (i7 == 1) {
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105920e("MicroMsg.NetSceneGetPackageList", "empty background pkg list");
                } else {
                    C52517f0.xx0().getClass();
                    String a = C47926a.m53249a();
                    for (int i9 = 0; i9 < linkedList.size(); i9++) {
                        C52089y93 y933 = linkedList.get(i9);
                        C52523w Ow2 = C52517f0.xx0().mo73461Ow(y933.f145192d, this.f146694f);
                        if (Ow2 == null || Ow2.f146697b != y933.f145193e) {
                            C86013q1.m106447h(a + C52517f0.xx0().ic0(y933.f145192d, this.f146694f));
                            C52523w j15 = mo73455j1(y933);
                            j15.f146707l = -1;
                            Log.m105925i("MicroMsg.NetSceneGetPackageList", "[updateBackgroundPkg] ret:%s newInfo:%s", Boolean.valueOf(Ow2 == null ? C52517f0.xx0().mo73468kD(j15) : C52517f0.xx0().mo73463TE(j15)), j15);
                        }
                        byte[] d2 = C48374j0.m53715d(y933.f145196h);
                        if (d2 != null && d2.length > 0) {
                            C52524x xx02 = C52517f0.xx0();
                            int i15 = y933.f145192d;
                            int i16 = this.f146694f;
                            xx02.getClass();
                            String str3 = i15 + "_" + i16 + "_thumb.jpg";
                            C86013q1.m106447h(a + str3);
                            if (C86013q1.m106440a(a + str3, d2) < 0) {
                                Log.m105920e("MicroMsg.NetSceneGetPackageList", "[updateBackgroundPkg] appendBuf thumb error!");
                            }
                        }
                    }
                }
            } else if (i7 == 4) {
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "empty emoji pkg list");
                } else {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "pkgList size " + linkedList.size());
                    C52517f0.xx0().getClass();
                    String a2 = C47926a.m53249a();
                    for (int i17 = 0; i17 < linkedList.size(); i17++) {
                        C52089y93 y934 = linkedList.get(i17);
                        C52523w Ow3 = C52517f0.xx0().mo73461Ow(y934.f145192d, this.f146694f);
                        byte[] d3 = C48374j0.m53715d(y934.f145196h);
                        if (y934.f145196h == null) {
                            Log.m105920e("MicroMsg.NetSceneGetPackageList", "error give me a null thumb it should be xml");
                        } else {
                            if (Ow3 == null || Ow3.f146697b != y934.f145193e) {
                                String str4 = new String(d3);
                                String str5 = "zh_CN";
                                if (str4.indexOf(str5) < 0) {
                                    str5 = "en";
                                    if (str4.indexOf(str5) < 0 && str4.indexOf("zh_TW") >= 0) {
                                        str5 = "zh_TW";
                                    }
                                }
                                String str6 = str5 + "_ARTIST.mm";
                                C86013q1.m106447h(a2 + str6);
                                C86013q1.m106447h(a2 + str5 + "_ARTISTF.mm");
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(a2);
                                sb4.append(str6);
                                C86013q1.m106440a(sb4.toString(), d3);
                            }
                            C52523w j16 = mo73455j1(y934);
                            j16.f146707l = -1;
                            if (Ow3 == null) {
                                C52517f0.xx0().mo73468kD(j16);
                            } else {
                                C52517f0.xx0().mo73463TE(j16);
                            }
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", y934.f145194f + " - " + y934.f145192d + " - " + y934.f145197i + " - " + y934.f145195g);
                        }
                    }
                }
            } else if (i7 == 6) {
                Log.m105924i("MicroMsg.NetSceneGetPackageList", "change new egg.");
            } else if (i7 == 7) {
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "empty config list");
                } else {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "updateConfigList pkgList size " + linkedList.size());
                    int i18 = 0;
                    while (i18 < linkedList.size()) {
                        C52089y93 y935 = linkedList.get(i18);
                        C52523w Ow4 = C52517f0.xx0().mo73461Ow(y935.f145192d, this.f146694f);
                        C52523w j17 = mo73455j1(y935);
                        j17.f146707l = -1;
                        if (Ow4 == null) {
                            C52517f0.xx0().mo73468kD(j17);
                        } else {
                            C52517f0.xx0().mo73463TE(j17);
                        }
                        Log.m105918d("MicroMsg.NetSceneGetPackageList", y935.f145194f + " - " + y935.f145192d + " - " + y935.f145197i + " - " + y935.f145195g);
                        byte[] d4 = C48374j0.m53715d(y935.f145196h);
                        String str7 = new String(d4);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("ConfigList xml : ");
                        sb5.append(str7);
                        Log.m105918d("MicroMsg.NetSceneGetPackageList", sb5.toString());
                        C47505d g502 = ((C10485b) C86709a0.m107533q(C10485b.class)).g50();
                        int i19 = y935.f145192d;
                        g502.getClass();
                        Uri n = C116299g2.m163858n(C47505d.f127470c);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        C116281f0 f0Var = C116281f0.C116289i.f348994a;
                        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                            if (l2.mo177810a()) {
                                l2.f348991a.mo119937g(l2.f348992b);
                            }
                        }
                        try {
                            C86009m1 m1Var = new C86009m1(g502.mo72509b(i19));
                            if (!m1Var.mo119967g()) {
                                m1Var.mo119964e();
                            }
                            C86013q1.m106438T(g502.mo72509b(i19), d4, 0, d4.length);
                            g502.mo72514g(i19, new String(d4));
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.ConfigListDecoder", "exception:%s", Util.stackTraceToString(e));
                        }
                        i18++;
                        int i25 = i2;
                    }
                }
            } else if (i7 == 9) {
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "empty upload speex config list");
                } else {
                    C52517f0.xx0().getClass();
                    String a3 = C47926a.m53249a();
                    for (int i26 = 0; i26 < linkedList.size(); i26++) {
                        C52089y93 y936 = linkedList.get(i26);
                        C52523w Ow5 = C52517f0.xx0().mo73461Ow(y936.f145192d, this.f146694f);
                        if (Ow5 == null || Ow5.f146697b != y936.f145193e) {
                            C86013q1.m106447h(a3 + C52517f0.xx0().ic0(y936.f145192d, this.f146694f));
                            C52523w j18 = mo73455j1(y936);
                            j18.f146707l = -1;
                            if (Ow5 == null) {
                                C52517f0.xx0().mo73468kD(j18);
                            } else {
                                C52517f0.xx0().mo73463TE(j18);
                            }
                            C86709a0.m107529k().f251779b.mo123460f(new C52521t(j18.f146696a, 9));
                        }
                        if (C48374j0.m53715d(y936.f145196h) != null) {
                            Log.m105926v("MicroMsg.NetSceneGetPackageList", "xml:" + new String(C48374j0.m53715d(y936.f145196h)));
                        }
                        if (C48374j0.m53715d(y936.f145198j) != null) {
                            Log.m105926v("MicroMsg.NetSceneGetPackageList", "xml2:" + new String(C48374j0.m53715d(y936.f145198j)));
                        }
                        Log.m105926v("MicroMsg.NetSceneGetPackageList", "xml3:" + y936.toString());
                        Log.m105926v("MicroMsg.NetSceneGetPackageList", "xml4:" + y936.f145194f);
                        Log.m105926v("MicroMsg.NetSceneGetPackageList", "xml5:" + y936.f145197i);
                    }
                }
            } else if (i7 == 10) {
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105920e("MicroMsg.NetSceneGetPackageList", "empty mass send top config package");
                } else {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "pkgList size " + linkedList.size());
                    C52089y93 y937 = linkedList.get(0);
                    C52523w Ow6 = C52517f0.xx0().mo73461Ow(y937.f145192d, this.f146694f);
                    C52523w j19 = mo73455j1(y937);
                    j19.f146707l = -1;
                    if (Ow6 == null) {
                        C52517f0.xx0().mo73468kD(j19);
                    } else {
                        C52517f0.xx0().mo73463TE(j19);
                    }
                }
            } else if (i7 != 11) {
                if (i7 == 12) {
                    if (linkedList == null || linkedList.size() <= 0) {
                        Log.m105920e("MicroMsg.NetSceneGetPackageList", "empty address pkg list");
                    } else {
                        Log.m105924i("MicroMsg.NetSceneGetPackageList", "updateRcptAddress pkgList size " + linkedList.size());
                        for (int i27 = 0; i27 < linkedList.size(); i27++) {
                            C52089y93 y938 = linkedList.get(i27);
                            C52523w Ow7 = C52517f0.xx0().mo73461Ow(y938.f145192d, this.f146694f);
                            C52523w j110 = mo73455j1(y938);
                            j110.f146707l = -1;
                            if (Ow7 == null) {
                                C52517f0.xx0().mo73468kD(j110);
                            } else {
                                C52517f0.xx0().mo73463TE(j110);
                            }
                            C86709a0.m107529k().f251779b.mo123460f(new C52521t(j110.f146696a, 12));
                        }
                    }
                } else if (i7 == 5) {
                    Log.m105918d("MicroMsg.NetSceneGetPackageList", "updateLangPkg");
                    if (linkedList == null || linkedList.size() == 0) {
                        Log.m105918d("MicroMsg.NetSceneGetPackageList", "empty langage package list");
                    } else {
                        Iterator<C52089y93> it = linkedList.iterator();
                        while (it.hasNext()) {
                            C52089y93 next = it.next();
                            Log.m105919d("MicroMsg.NetSceneGetPackageList", "pkg.toString %s", next.toString());
                            C52523w Ow8 = C52517f0.xx0().mo73461Ow(next.f145192d, this.f146694f);
                            C52523w j111 = mo73455j1(next);
                            j111.f146707l = -1;
                            if (Ow8 == null) {
                                C52517f0.xx0().mo73468kD(j111);
                            } else {
                                C52517f0.xx0().mo73463TE(j111);
                            }
                        }
                    }
                } else if (i7 == 20) {
                    if (linkedList == null || linkedList.size() <= 0) {
                        Log.m105918d("MicroMsg.NetSceneGetPackageList", "empty regioncode pkg list");
                    } else {
                        Log.m105918d("MicroMsg.NetSceneGetPackageList", "pkgList size " + linkedList.size());
                        Iterator<C52089y93> it4 = linkedList.iterator();
                        while (it4.hasNext()) {
                            C52089y93 next2 = it4.next();
                            C52523w Ow9 = C52517f0.xx0().mo73461Ow(next2.f145192d, this.f146694f);
                            C52523w j112 = mo73455j1(next2);
                            j112.f146707l = -1;
                            if (Ow9 == null) {
                                C52517f0.xx0().mo73468kD(j112);
                            } else {
                                C52517f0.xx0().mo73463TE(j112);
                            }
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", next2.f145194f + " - " + next2.f145192d + " - " + next2.f145197i + " - " + next2.f145195g);
                        }
                    }
                } else if (i7 == 17) {
                    if (linkedList == null || linkedList.size() == 0) {
                        Log.m105918d("MicroMsg.NetSceneGetPackageList", "poi type is null");
                    } else {
                        C52089y93 y939 = linkedList.get(0);
                        Log.m105918d("MicroMsg.NetSceneGetPackageList", y939.f145194f + " - " + y939.f145192d + " - " + y939.f145197i + " - " + y939.f145195g);
                        C52523w Ow10 = C52517f0.xx0().mo73461Ow(y939.f145192d, this.f146694f);
                        C52523w j113 = mo73455j1(y939);
                        j113.f146707l = -1;
                        if (Ow10 == null) {
                            C52517f0.xx0().mo73468kD(j113);
                        } else {
                            C52517f0.xx0().mo73463TE(j113);
                        }
                        PoiCategoriesUpdateEvent poiCategoriesUpdateEvent = new PoiCategoriesUpdateEvent();
                        try {
                            poiCategoriesUpdateEvent.f9399d.f9400a = C48374j0.m53715d(y939.f145196h);
                            if (poiCategoriesUpdateEvent.f9399d.f9400a != null) {
                                poiCategoriesUpdateEvent.asyncPublish(Looper.getMainLooper());
                            }
                        } catch (Exception e2) {
                            Log.m105920e("MicroMsg.NetSceneGetPackageList", e2.getMessage());
                        }
                    }
                } else if (i7 != 18) {
                    if (i7 == 19) {
                        if (linkedList == null || linkedList.size() <= 0) {
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "[oneliang]empty update expose scene list");
                        } else {
                            C52517f0.xx0().getClass();
                            String a4 = C47926a.m53249a();
                            for (int i28 = 0; i28 < linkedList.size(); i28++) {
                                C52089y93 y9310 = linkedList.get(i28);
                                C52523w Ow11 = C52517f0.xx0().mo73461Ow(y9310.f145192d, this.f146694f);
                                if (Ow11 == null || Ow11.f146697b != y9310.f145193e) {
                                    C86013q1.m106447h(a4 + C52517f0.xx0().ic0(y9310.f145192d, this.f146694f));
                                    C52523w j114 = mo73455j1(y9310);
                                    j114.f146707l = -1;
                                    if (Ow11 == null) {
                                        C52517f0.xx0().mo73468kD(j114);
                                    } else {
                                        C52517f0.xx0().mo73463TE(j114);
                                    }
                                    C86709a0.m107529k().f251779b.mo123460f(new C52521t(j114.f146696a, 19));
                                }
                                Log.m105919d("MicroMsg.NetSceneGetPackageList", "[oneliang]name:%s,packName:%s", y9310.f145194f, y9310.f145197i);
                            }
                        }
                    } else if (i7 == 21) {
                        if (linkedList == null || linkedList.size() <= 0) {
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "summer trace config empty scene list");
                        } else {
                            C52089y93 y9311 = linkedList.get(0);
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "summer getpackage pkg: " + y9311 + "|id = " + y9311.f145192d + "|Name = " + y9311.f145194f + "|PackName = " + y9311.f145197i + "|Size = " + y9311.f145195g + "|Version = " + y9311.f145193e);
                            C52523w Ow12 = C52517f0.xx0().mo73461Ow(y9311.f145192d, this.f146694f);
                            C52523w j115 = mo73455j1(y9311);
                            j115.f146707l = -1;
                            if (Ow12 == null) {
                                C52517f0.xx0().mo73468kD(j115);
                            } else {
                                int i29 = Ow12.f146697b;
                                if (i29 < j115.f146697b) {
                                    C52517f0.xx0().mo73463TE(j115);
                                } else {
                                    Log.m105919d("MicroMsg.NetSceneGetPackageList", "summer old version [%d] new version[%d], not need update", Integer.valueOf(i29), Integer.valueOf(j115.f146697b));
                                }
                            }
                        }
                    } else if (23 == i7) {
                        if (linkedList == null || linkedList.size() <= 0) {
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "permission tips config is empty");
                        } else {
                            C52089y93 y9312 = linkedList.get(0);
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "permission getpackage pkg: " + y9312 + "|id = " + y9312.f145192d + "|Name = " + y9312.f145194f + "|PackName = " + y9312.f145197i + "|Size = " + y9312.f145195g + "|Version = " + y9312.f145193e);
                            C52523w Ow13 = C52517f0.xx0().mo73461Ow(y9312.f145192d, this.f146694f);
                            C52523w j116 = mo73455j1(y9312);
                            j116.f146707l = -1;
                            if (Ow13 == null) {
                                C52517f0.xx0().mo73468kD(j116);
                            } else if (Ow13.f146697b < j116.f146697b) {
                                C52517f0.xx0().mo73463TE(j116);
                            }
                        }
                    } else if (i7 == 26) {
                        if (linkedList == null || linkedList.size() == 0) {
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "updateIPCallCountryCodeConfig, package list is empty");
                        } else {
                            Log.m105919d("MicroMsg.NetSceneGetPackageList", "updateIPCallCountryCodeConfig, pkgList.size: %d", Integer.valueOf(linkedList.size()));
                            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_COUNTRY_CODE_RESTRCTION_INT, -1)).intValue();
                            Log.m105919d("MicroMsg.NetSceneGetPackageList", "configPkgId: %d", Integer.valueOf(intValue));
                            if (intValue != -1) {
                                C52523w Ow14 = C52517f0.xx0().mo73461Ow(intValue, this.f146694f);
                                Iterator<C52089y93> it5 = linkedList.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    C52523w j117 = mo73455j1(it5.next());
                                    Log.m105919d("MicroMsg.NetSceneGetPackageList", "newInfo.id: %d, version: %d", Integer.valueOf(j117.f146696a), Integer.valueOf(j117.f146697b));
                                    if (Ow14 == null || j117.f146696a != intValue) {
                                        if (Ow14 == null && j117.f146696a == intValue) {
                                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "insert new pkg");
                                            C52517f0.xx0().mo73468kD(j117);
                                            break;
                                        }
                                    } else {
                                        Log.m105918d("MicroMsg.NetSceneGetPackageList", "find match old pkg, update one");
                                        C52517f0.xx0().mo73463TE(j117);
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (i7 == 36) {
                        if (linkedList == null || linkedList.size() == 0) {
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "update sense where location but package list is empty.");
                        } else {
                            Log.m105924i("MicroMsg.NetSceneGetPackageList", "start update sense where location. package list size " + linkedList.size());
                            for (C52089y93 next3 : linkedList) {
                                C52523w Ow15 = C52517f0.xx0().mo73461Ow(next3.f145192d, this.f146694f);
                                if (Ow15 == null || Ow15.f146697b != next3.f145193e) {
                                    C52523w j118 = mo73455j1(next3);
                                    j118.f146707l = -1;
                                    if (Ow15 == null) {
                                        C52517f0.xx0().mo73468kD(j118);
                                    } else {
                                        C52517f0.xx0().mo73463TE(j118);
                                    }
                                    C86709a0.m107529k().f251779b.mo123460f(new C52521t(j118.f146696a, 36));
                                }
                            }
                        }
                    } else if (i7 == 37) {
                        Log.m105918d("MicroMsg.NetSceneGetPackageList", "updateAppleEmojiPackage");
                        if (linkedList == null || linkedList.size() == 0) {
                            Log.m105918d("MicroMsg.NetSceneGetPackageList", "update apple emoji but package list is empty.");
                        } else {
                            Log.m105924i("MicroMsg.NetSceneGetPackageList", "start update apple emoji. package list size " + linkedList.size());
                            Iterator<C52089y93> it6 = linkedList.iterator();
                            while (it6.hasNext()) {
                                C52089y93 next4 = it6.next();
                                C52523w Ow16 = C52517f0.xx0().mo73461Ow(next4.f145192d, this.f146694f);
                                if (Ow16 == null || Ow16.f146697b != next4.f145193e) {
                                    C52523w j119 = mo73455j1(next4);
                                    j119.f146707l = -1;
                                    if (Ow16 == null) {
                                        C52517f0.xx0().mo73468kD(j119);
                                    } else {
                                        C52517f0.xx0().mo73463TE(j119);
                                    }
                                    C86709a0.m107529k().f251779b.mo123460f(new C52521t(j119.f146696a, 37));
                                }
                            }
                        }
                    }
                }
            }
            UpdatePackageEvent updatePackageEvent = new UpdatePackageEvent();
            UpdatePackageEvent.C28845a aVar = updatePackageEvent.f79038d;
            aVar.f79040b = linkedList;
            aVar.f79039a = this.f146694f;
            updatePackageEvent.publish();
            if (t522.f141965f <= 0) {
                this.f146692d.onSceneEnd(i2, i5, str2, this);
            } else if (doScene(dispatcher(), this.f146692d) == -1) {
                this.f146692d.onSceneEnd(3, -1, "doScene failed", this);
            }
        } else {
            this.f146692d.onSceneEnd(i4, i5, str2, this);
        }
    }

    public int securityLimitCount() {
        return 20;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public C52522u(int i) {
        this.f146694f = i;
        Log.m105918d("MicroMsg.NetSceneGetPackageList", "Init dkregcode:" + i);
    }
}
