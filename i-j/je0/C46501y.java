package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72982l3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C45759r0;
import f62.C75700k0;
import he0.C76158j;
import java.io.IOException;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import pc0.C118000d0;
import qe0.C47802c;
import qe3.C101126c1;
import te3.C48676a73;
import te3.C48679a83;
import te3.C48822b83;
import te3.C48947c30;
import te3.C50886px;
import te3.C51018qv3;
import te3.C51024qx;
import te3.C51500u63;

/* renamed from: je0.y */
public class C46501y extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125283d;

    /* renamed from: e */
    public final C47350c f125284e;

    public C46501y(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48679a83();
        bVar.f127067b = new C48822b83();
        bVar.f127068c = "/cgi-bin/micromsg-bin/openimsync";
        bVar.f127069d = 810;
        C47350c a = bVar.mo72403a();
        this.f125284e = a;
        ((C48679a83) a.f127055a.f127080a).f130367d = i;
        Log.m105925i("MicroMsg.Openim.NetsceneOpenIMSync", "opim sync init:%d", Integer.valueOf(hashCode()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        byte[] a = C118000d0.f352701a.mo182756a();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(a);
        C47350c cVar = this.f125284e;
        ((C48679a83) cVar.f127055a.f127080a).f130368e = qv32;
        this.f125283d = nVar;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 810;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Class cls = C75700k0.class;
        char c = 2;
        char c2 = 3;
        Log.m105925i("MicroMsg.Openim.NetsceneOpenIMSync", "netId :%d errType: %d, errCode: %d, errMsg:%s, hashcode:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(hashCode()));
        if (i4 == 0 && i5 == 0) {
            C47350c cVar = this.f125284e;
            C48679a83 a832 = (C48679a83) cVar.f127055a.f127080a;
            C48822b83 b832 = (C48822b83) cVar.f127056b.f127083a;
            C51024qx qxVar = b832.f131009d;
            if (qxVar != null && qxVar.f140594e.size() > 0) {
                Log.m105925i("MicroMsg.Openim.NetsceneOpenIMSync", "onGYNetEnd, cmd size:%d", Integer.valueOf(b832.f131009d.f140594e.size()));
                Iterator<C50886px> it = b832.f131009d.f140594e.iterator();
                while (it.hasNext()) {
                    C50886px next = it.next();
                    int i6 = next.f140037d;
                    if (i6 == 400) {
                        C48676a73 a732 = new C48676a73();
                        try {
                            a732.parseFrom(next.f140038e.f140574f.f257327a);
                            Log.m105925i("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact %s", a732.f130343d);
                            C72996z1 a = C46502z.m51787a(a732);
                            Object[] objArr = new Object[10];
                            objArr[0] = a.getUsername();
                            objArr[1] = a.getNickname();
                            objArr[c] = a.mo73969n2();
                            objArr[c2] = Integer.valueOf(a.getSource());
                            objArr[4] = Integer.valueOf(a.f149500H);
                            try {
                                objArr[5] = a.mo73980x2();
                                objArr[6] = a.f149532d1;
                                objArr[7] = Integer.valueOf(a.f149530c1);
                                objArr[8] = Integer.valueOf(a.getType());
                                objArr[9] = a.mo73976t2();
                                Log.m105925i("MicroMsg.Openim.NetsceneOpenIMSync", "openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, wordingId:%s", objArr);
                                ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69668Q3(a);
                                if (a.mo62927s3()) {
                                    String username = a.getUsername();
                                    C72982l3 l3Var = (C72982l3) ((C75700k0) C86709a0.m107533q(cls)).mo96096M5();
                                    if (l3Var != null) {
                                        boolean bF = l3Var.mo101171bF(username, 1);
                                        if (bF) {
                                            Log.m105918d("MicroMsg.Openim.NetsceneOpenIMSync", "fmsgConversation updateState succ, user = " + username);
                                        } else {
                                            String v2 = a.mo73978v2();
                                            bF = l3Var.mo101171bF(v2, 1);
                                            Log.m105918d("MicroMsg.Openim.NetsceneOpenIMSync", "fmsgConversation updateState succ, encryptUser = " + v2);
                                        }
                                        Log.m105924i("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact, update state(ADDED) FMessageConversation, ret = " + bF);
                                    }
                                }
                                if (a.mo62940x3()) {
                                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69766g0(a.getUsername());
                                } else {
                                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69772j0(a.getUsername());
                                }
                                ((C76158j) C86312j.m106911c(C76158j.class)).ym0(a732.f130356t, a732.f130358v);
                                C46502z.m51789c(a732);
                                C46502z.m51791e(a732);
                                C46502z.m51790d(a732);
                                C86709a0.m107528h();
                                C44673z4 Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69630Lo(a.getUsername());
                                if (Lo != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
                                    ((C45759r0) C86312j.m106911c(C45759r0.class)).mo71139d1(a.getUsername(), Lo.field_conRemark);
                                    C86709a0.m107528h();
                                    ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69631jo(a.getUsername());
                                    a.mo62860K2(Lo.field_conRemark);
                                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69668Q3(a);
                                }
                            } catch (IOException e) {
                                e = e;
                                Log.m105921e("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact error:%s", e);
                                c2 = 3;
                                c = 2;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            Log.m105921e("MicroMsg.Openim.NetsceneOpenIMSync", "processModContact error:%s", e);
                            c2 = 3;
                            c = 2;
                        }
                    } else if (i6 == 402) {
                        C48947c30 c302 = new C48947c30();
                        try {
                            c302.parseFrom(next.f140038e.f140574f.f257327a);
                            Log.m105925i("MicroMsg.Openim.NetsceneOpenIMSync", "processDelContact user:%s", c302.f131476d);
                            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f(c302.f131476d);
                            C45628s0.m50736A0(c302.f131476d);
                        } catch (IOException e3) {
                            Log.m105921e("MicroMsg.Openim.NetsceneOpenIMSync", "processDelContact error:%s", e3);
                        }
                    } else if (i6 == 403) {
                        try {
                            C51500u63 u632 = new C51500u63();
                            u632.parseFrom(next.f140038e.f140574f.f257327a);
                            Log.m105925i("MicroMsg.Openim.NetsceneOpenIMSync", "processModChatroomContact %s", u632.f142620d);
                            C47802c.m53112b(u632, -1, u632.f142621e);
                        } catch (IOException e4) {
                            Log.m105921e("MicroMsg.Openim.NetsceneOpenIMSync", "processModChatroomContact error:%s", e4);
                        }
                    } else if (i6 == 404) {
                        C48676a73 a733 = new C48676a73();
                        try {
                            a733.parseFrom(next.f140038e.f140574f.f257327a);
                            Log.m105925i("MicroMsg.Openim.NetsceneOpenIMSync", "processNeedGetContact %s", a733.f130343d);
                            C86709a0.m107529k().f251779b.mo123460f(new C33544n(a733.f130343d, "", ""));
                        } catch (IOException e5) {
                            Log.m105921e("MicroMsg.Openim.NetsceneOpenIMSync", "processNeedGetContact error:%s", e5);
                        }
                    }
                    c2 = 3;
                    c = 2;
                }
            }
            byte[] f = b832.f131011f.f140574f.mo123703f();
            C118000d0.C118001a aVar = C118000d0.f352701a;
            byte[] c3 = C101126c1.m132546c(aVar.mo182756a(), f);
            if (c3 != null && c3.length > 0) {
                aVar.mo182758c(c3, true);
            }
            if ((b832.f131010e & a832.f130367d) == 0) {
                Log.m105924i("MicroMsg.Openim.NetsceneOpenIMSync", "onGYNetEnd end");
                this.f125283d.onSceneEnd(0, 0, "", this);
                return;
            }
            doScene(dispatcher(), this.f125283d);
            return;
        }
        this.f125283d.onSceneEnd(i4, i5, str2, this);
    }

    public int securityLimitCount() {
        return 20;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
