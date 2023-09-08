package pb1;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.autogen.mmdata.rpt.FavSyncQualityStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p749xh.C66261f3;
import te3.C49127dd0;
import te3.C49257eb;
import te3.C49402fb;
import xb1.C102614d;

/* renamed from: pb1.n1 */
public class C100725n1 extends C117747y implements C1311n {

    /* renamed from: o */
    public static AtomicInteger f295091o = new AtomicInteger(0);

    /* renamed from: d */
    public final C47350c f295092d;

    /* renamed from: e */
    public C11385n f295093e = null;

    /* renamed from: f */
    public LinkedList<Integer> f295094f;

    /* renamed from: g */
    public int f295095g = 0;

    /* renamed from: h */
    public int f295096h = 100;

    /* renamed from: i */
    public long f295097i;

    /* renamed from: j */
    public int f295098j = 0;

    /* renamed from: n */
    public int f295099n = 0;

    public C100725n1(LinkedList<Integer> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49257eb();
        bVar.f127067b = new C49402fb();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchgetfavitem";
        bVar.f127069d = 402;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f295092d = bVar.mo72403a();
        this.f295094f = linkedList;
        f295091o.incrementAndGet();
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.NetSceneBatchgetFav", "incrementAndGetSceneCount:%s " + Util.getStack(), f295091o);
        }
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Fav_SceneLimit_Int, 100);
        this.f295096h = e;
        Log.m105919d("MicroMsg.NetSceneBatchgetFav", "NetSceneBatchGetFav init sceneLimit:%s", Integer.valueOf(e));
        this.f295097i = System.currentTimeMillis();
    }

    /* renamed from: j1 */
    public static void m131805j1() {
        f295091o.decrementAndGet();
        if (Log.isDebug()) {
            Log.m105919d("MicroMsg.NetSceneBatchgetFav", "decrementSceneCount: %s", f295091o);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105925i("MicroMsg.NetSceneBatchgetFav", "ashutest::doscene count:%d", Integer.valueOf(f295091o.get()));
        LinkedList<Integer> linkedList = this.f295094f;
        if (linkedList == null || linkedList.isEmpty() || this.f295095g >= this.f295094f.size()) {
            Log.m105921e("MicroMsg.NetSceneBatchgetFav", "klem doScene, idlist null, begIndex %d", Integer.valueOf(this.f295095g));
            return -1;
        }
        Log.m105925i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene size %d, begIndex %d, total %s", Integer.valueOf(this.f295094f.size()), Integer.valueOf(this.f295095g), this.f295094f);
        if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(8217, (Object) null)) == 0) {
            Log.m105928w("MicroMsg.NetSceneBatchgetFav", "klem doScene, init not done, do not batchget");
            return -1;
        }
        C49257eb ebVar = (C49257eb) this.f295092d.f127055a.f127080a;
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        LinkedList<Integer> linkedList3 = this.f295094f;
        int i = this.f295095g;
        linkedList2.addAll(linkedList3.subList(i, Math.min(i + 15, linkedList3.size())));
        ebVar.f132833e = linkedList2;
        ebVar.f132832d = linkedList2.size();
        this.f295095g += 15;
        Log.m105925i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene checkd size %d, %s", Integer.valueOf(linkedList2.size()), linkedList2);
        this.f295093e = nVar;
        return dispatch(gVar, this.f295092d, this);
    }

    public int getType() {
        return 402;
    }

    /* renamed from: k1 */
    public final boolean mo140159k1() {
        boolean z = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(8217, (Object) null)) == 0;
        LinkedList<Integer> linkedList = this.f295094f;
        boolean z2 = linkedList != null && this.f295095g < linkedList.size();
        Log.m105925i("MicroMsg.NetSceneBatchgetFav", "check needContinue, notInit %B indexOK %B", Boolean.valueOf(z), Boolean.valueOf(z2));
        return !z && z2;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        String str3 = str;
        Class cls = C100718j1.class;
        int i8 = 3;
        Log.m105925i("MicroMsg.NetSceneBatchgetFav", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg[%s]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(this.f295095g), Integer.valueOf(this.f295094f.size()), str3);
        int i9 = this.f295098j;
        if (i9 >= 5) {
            int i15 = this.f295099n;
            str2 = "MicroMsg.NetSceneBatchgetFav";
            long currentTimeMillis = System.currentTimeMillis() - this.f295097i;
            HashSet<String> hashSet = C100745t.f295154a;
            FavSyncQualityStruct e = C100698b0.f295038a.mo140129e();
            e.f265554r = i9;
            e.f265555s = i15;
            e.f265547k = -1;
            e.f265553q = currentTimeMillis;
            e.f265549m = i7;
            e.f265548l = i6;
            if (currentTimeMillis >= 30000) {
                e.f265552p = -1;
            } else {
                e.f265552p = 0;
            }
            C100745t.m131891c();
        } else {
            str2 = "MicroMsg.NetSceneBatchgetFav";
        }
        if (i6 == 0 && i7 == 0) {
            C49402fb fbVar = (C49402fb) ((C47350c) uVar).f127056b.f127083a;
            int i16 = fbVar.f133386d;
            int size = fbVar.f133387e.size();
            if (i16 != size) {
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(size);
                objArr[1] = Integer.valueOf(i16);
                int i17 = 15;
                if (this.f295095g > this.f295094f.size()) {
                    i17 = this.f295094f.size() % 15;
                }
                objArr[2] = Integer.valueOf(i17);
                String str4 = str2;
                Log.m105921e(str4, "klem onGYNet resp list size:%d, return count %d, request count %d", objArr);
                if (mo140159k1()) {
                    this.f295099n++;
                    int doScene = doScene(dispatcher(), this.f295093e);
                    if (doScene != 0) {
                        Log.m105925i(str4, "doScene ret:%s, minus sceneCount, cur:%s", Integer.valueOf(doScene), Integer.valueOf(f295091o.get()));
                        m131805j1();
                        return;
                    }
                    return;
                }
                m131805j1();
                this.f295093e.onSceneEnd(i6, -1, str3, this);
                return;
            }
            String str5 = str2;
            Log.m105925i(str5, "onGYNetEnd listSize:%s", Integer.valueOf(size));
            String str6 = "";
            int i18 = 0;
            int i19 = 0;
            while (i18 < size) {
                C49127dd0 dd02 = fbVar.f133387e.get(i18);
                Object[] objArr2 = new Object[i8];
                objArr2[0] = Integer.valueOf(i18);
                objArr2[1] = Integer.valueOf(dd02.f132242d);
                objArr2[2] = Integer.valueOf(dd02.f132243e);
                Log.m105925i(str5, "klem onGYNet index:%s favid:%d, status:%d", objArr2);
                if (dd02.f132243e == 0) {
                    i5 = size;
                    C100755z qq = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq((long) dd02.f132242d);
                    if (qq == null) {
                        Log.m105921e(str5, "klem onGYNet favid:%d not exist!", Integer.valueOf(dd02.f132242d));
                        i18++;
                        int i25 = i2;
                        int i26 = i3;
                        size = i5;
                        i8 = 3;
                    } else {
                        String str7 = dd02.f132244f;
                        qq.field_xml = str7;
                        qq.mo140177D2(str7);
                        if (!C100745t.m131889a(qq.field_xml)) {
                            i19++;
                            str6 = qq.field_xml;
                        }
                        qq.field_flag = dd02.f132245g;
                        qq.field_localSeq = dd02.f132247i;
                        qq.field_updateTime = (((long) dd02.f132246h) * 1000) + ((long) i18);
                        Log.m105925i(str5, "huahuahailang:item field_xml batgch get :\n %s", qq.field_xml);
                        Boolean bool = Boolean.FALSE;
                        Log.m105925i(str5, "data dealed needUpload:%b  needDownload:%b", bool, bool);
                        qq.field_itemStatus = 10;
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(qq, C66261f3.COL_LOCALID);
                        C100734q.m131885y0(qq);
                        qq.mo140187q2(str5, C100755z.f295170V0);
                    }
                } else {
                    i5 = size;
                }
                if ((dd02.f132245g & 1) != 0) {
                    Log.m105919d(str5, "klem onGYNet favId: %d status not exist, delete local item", Integer.valueOf(dd02.f132242d));
                    C100734q.m131858l(((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq((long) dd02.f132242d), (Runnable) null, 4);
                    i18++;
                    int i252 = i2;
                    int i262 = i3;
                    size = i5;
                    i8 = 3;
                }
                i18++;
                int i2522 = i2;
                int i2622 = i3;
                size = i5;
                i8 = 3;
            }
            ((C100718j1) C86312j.m106911c(cls)).mo128212cl().run();
            if (mo140159k1()) {
                int doScene2 = doScene(dispatcher(), this.f295093e);
                if (doScene2 != 0) {
                    Log.m105925i(str5, "doScene ret:%s, minus sceneCount, cur:%s", Integer.valueOf(doScene2), Integer.valueOf(f295091o.get()));
                    m131805j1();
                    return;
                }
                return;
            }
            m131805j1();
            int i27 = this.f295098j;
            int i28 = this.f295099n;
            long currentTimeMillis2 = System.currentTimeMillis() - this.f295097i;
            HashSet<String> hashSet2 = C100745t.f295154a;
            FavSyncQualityStruct e2 = C100698b0.f295038a.mo140129e();
            e2.f265554r = i27;
            e2.f265555s = i28;
            e2.f265556t = i19;
            if (i19 == 0) {
                e2.f265550n = 0;
                i4 = -1;
            } else {
                i4 = -1;
                e2.f265550n = -1;
                e2.f265551o = e2.mo86045b("BatchGetIllegalXmlContent", str6, true);
            }
            e2.f265547k = 0;
            e2.f265553q = currentTimeMillis2;
            if (currentTimeMillis2 >= 30000) {
                e2.f265552p = i4;
            } else {
                e2.f265552p = 0;
            }
            C100745t.m131891c();
            this.f295093e.onSceneEnd(i2, i3, str3, this);
            return;
        }
        String str8 = str2;
        int i29 = i7;
        int i35 = i6;
        if (mo140159k1()) {
            this.f295098j++;
            int doScene3 = doScene(dispatcher(), this.f295093e);
            if (doScene3 != 0) {
                Log.m105925i(str8, "doScene ret:%s, minus sceneCount, cur:%s", Integer.valueOf(doScene3), Integer.valueOf(f295091o.get()));
                m131805j1();
                return;
            }
            return;
        }
        m131805j1();
        this.f295093e.onSceneEnd(i35, i29, str3, this);
    }

    public int securityLimitCount() {
        return this.f295096h;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        if (y__c == y$$c.EReachMaxLimit) {
            this.f295093e.onSceneEnd(3, -1, "EReachMaxLimit", this);
        }
    }
}
