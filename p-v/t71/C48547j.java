package t71;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.p042ui.C41317a1;
import com.tencent.p014mm.plugin.exdevice.p042ui.C41384z0;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.XWebFeature;
import f40.C86709a0;
import f62.C75700k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import m71.C46947a;
import m71.C46948b;
import pe3.C47465a;
import te3.C49825ib2;
import te3.C49971jb2;
import te3.C51723vp1;
import te3.n85;
import te3.o85;
import u71.C52452d;
import u71.C52454f;
import v71.C37687a;
import v71.C37689c;
import v71.C37690e;
import v71.C52778d;
import w71.C53087d;

/* renamed from: t71.j */
public class C48547j extends C46947a<C49825ib2, C49971jb2> {

    /* renamed from: f */
    public boolean f129846f;

    /* renamed from: g */
    public String f129847g;

    /* renamed from: h */
    public String f129848h;

    /* renamed from: i */
    public String f129849i;

    /* renamed from: j */
    public C37687a f129850j;

    /* renamed from: n */
    public ArrayList<C52778d> f129851n;

    /* renamed from: o */
    public ArrayList<C37689c> f129852o;

    /* renamed from: p */
    public ArrayList<C37690e> f129853p;

    /* renamed from: q */
    public ArrayList<String> f129854q;

    /* renamed from: r */
    public String f129855r;

    /* renamed from: s */
    public String f129856s;

    /* renamed from: t */
    public String f129857t;

    /* renamed from: u */
    public boolean f129858u;

    /* renamed from: v */
    public boolean f129859v;

    /* renamed from: w */
    public String f129860w;

    /* renamed from: x */
    public boolean f129861x;

    /* renamed from: y */
    public final WeakReference<C46948b<C48547j>> f129862y;

    /* renamed from: z */
    public C48548a f129863z;

    /* renamed from: t71.j$a */
    public interface C48548a {
    }

    public C48547j(String str, String str2, String str3, boolean z, C46948b<C48547j> bVar) {
        this.f129862y = new WeakReference<>(bVar);
        this.f129855r = str;
        this.f129847g = str;
        this.f129848h = Util.nullAsNil(str2);
        this.f129846f = z;
        this.f129849i = str3;
    }

    public int getType() {
        return XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE;
    }

    public String getUri() {
        return "/cgi-bin/mmbiz-bin/rank/getuserranklike";
    }

    /* renamed from: k1 */
    public C47465a mo72131k1() {
        return new C49825ib2();
    }

    /* renamed from: l1 */
    public C47465a mo72132l1() {
        return new C49971jb2();
    }

    /* renamed from: m1 */
    public void mo72133m1(C47465a aVar) {
        C49825ib2 ib22 = (C49825ib2) aVar;
        ib22.f135200f = this.f129848h;
        ib22.f135199e = this.f129847g;
        ib22.f135198d = this.f129846f;
        ib22.f135201g = this.f129849i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C37687a aVar;
        C52454f fVar;
        C37690e eVar;
        C52778d dVar;
        C37689c cVar;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105919d("MicroMsg.NetSceneGetRankInfo", "hy: get rank info end. errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i4 == 0 && i5 == 0) {
            C49971jb2 jb22 = (C49971jb2) mo72130j1();
            String str3 = "";
            this.f129852o = new ArrayList<>();
            LinkedList<C51723vp1> linkedList = jb22.f135989q;
            if (linkedList != null) {
                Iterator<C51723vp1> it = linkedList.iterator();
                while (it.hasNext()) {
                    C51723vp1 next = it.next();
                    if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69724s3(next.f143615e)) {
                        String str4 = jb22.f135984i;
                        String str5 = this.f129848h;
                        if (!Util.isNullOrNil(str4)) {
                            cVar = new C37689c();
                            cVar.field_rankID = str4;
                            cVar.field_username = next.f143615e;
                            cVar.field_step = next.f143616f;
                            cVar.field_appusername = str5;
                        } else {
                            Log.m105928w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                            cVar = null;
                        }
                        if (cVar != null) {
                            this.f129852o.add(cVar);
                        }
                    } else {
                        C86709a0.m107529k().f251779b.mo123460f(new C48545h(next.f143615e, (C46948b<C48545h>) null));
                    }
                }
            }
            this.f129851n = new ArrayList<>();
            LinkedList<n85> linkedList2 = jb22.f135979d;
            if (linkedList2 != null) {
                Iterator<n85> it4 = linkedList2.iterator();
                while (it4.hasNext()) {
                    n85 next2 = it4.next();
                    String str6 = jb22.f135984i;
                    String str7 = this.f129848h;
                    if (Util.isNullOrNil(str6) || next2 == null) {
                        Log.m105928w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                        dVar = null;
                    } else {
                        dVar = new C52778d();
                        dVar.field_appusername = str7;
                        dVar.field_rankID = str6;
                        dVar.field_likecount = next2.f138488g;
                        dVar.field_ranknum = next2.f138487f;
                        dVar.field_score = next2.f138486e;
                        dVar.field_selfLikeState = next2.f138489h;
                        dVar.field_username = next2.f138485d;
                        dVar.field_sportRecord = next2.f138490i;
                    }
                    if (dVar != null) {
                        if (dVar.field_ranknum == 1) {
                            str3 = dVar.field_username;
                        }
                        this.f129851n.add(dVar);
                    }
                }
            }
            this.f129853p = new ArrayList<>();
            LinkedList<o85> linkedList3 = jb22.f135980e;
            if (linkedList3 != null) {
                Iterator<o85> it5 = linkedList3.iterator();
                while (it5.hasNext()) {
                    o85 next3 = it5.next();
                    String str8 = jb22.f135984i;
                    String str9 = this.f129848h;
                    if (Util.isNullOrNil(str8) || next3 == null) {
                        Log.m105928w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                        eVar = null;
                    } else {
                        eVar = new C37690e();
                        eVar.field_appusername = str9;
                        eVar.field_rankID = str8;
                        eVar.field_timestamp = next3.f139034d;
                        eVar.field_username = next3.f139035e;
                    }
                    if (eVar != null) {
                        this.f129853p.add(eVar);
                    }
                }
            }
            this.f129854q = new ArrayList<>();
            LinkedList<String> linkedList4 = jb22.f135981f;
            if (linkedList4 != null) {
                Iterator<String> it6 = linkedList4.iterator();
                while (it6.hasNext()) {
                    this.f129854q.add(it6.next());
                }
            }
            if (!Util.isNullOrNil(this.f129849i)) {
                str3 = this.f129849i;
            }
            String str10 = jb22.f135982g;
            String str11 = jb22.f135983h;
            if (Util.isNullOrNil(str3)) {
                Log.m105928w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                aVar = null;
            } else {
                aVar = new C37687a();
                aVar.field_username = str3;
                aVar.field_championUrl = str10;
                aVar.field_championMotto = str11;
            }
            this.f129850j = aVar;
            this.f129855r = jb22.f135984i;
            this.f129857t = jb22.f135988p;
            this.f129856s = jb22.f135986n;
            this.f129858u = jb22.f135987o;
            this.f129859v = jb22.f135993u == 1;
            this.f129860w = jb22.f135994v;
            this.f129861x = jb22.f135990r;
            Log.m105918d("MicroMsg.NetSceneGetRankInfo", "hy: get score info ok.");
            String str12 = this.f129847g;
            if ((str12 == null || !str12.equals(this.f129855r)) && (fVar = C41166r1.Gx0().f146565d) != null) {
                String str13 = this.f129855r;
                Log.m105919d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: rank changed to %s", str13);
                ((ExdeviceRankInfoUI) fVar).f111248u = str13;
            }
            C48548a aVar2 = this.f129863z;
            if (aVar2 != null && this.f129846f) {
                ExdeviceRankInfoUI exdeviceRankInfoUI = (ExdeviceRankInfoUI) aVar2;
                exdeviceRankInfoUI.getClass();
                exdeviceRankInfoUI.runOnUiThread(new C41384z0(exdeviceRankInfoUI));
                exdeviceRankInfoUI.f111221D = this.f129856s;
                exdeviceRankInfoUI.f111222E = this.f129857t;
                exdeviceRankInfoUI.f111224G = this.f129860w;
                boolean z = this.f129859v;
                exdeviceRankInfoUI.f111223F = z;
                exdeviceRankInfoUI.f111229L = this.f129861x;
                ArrayList<C52778d> arrayList = this.f129851n;
                exdeviceRankInfoUI.f111218A = arrayList;
                ArrayList<C37689c> arrayList2 = this.f129852o;
                exdeviceRankInfoUI.f111253z = arrayList2;
                exdeviceRankInfoUI.f111252y = exdeviceRankInfoUI.f111235e.mo64436a(arrayList2, arrayList, z);
                exdeviceRankInfoUI.runOnUiThread(new C41317a1(exdeviceRankInfoUI, this));
            }
            if (this.f129846f) {
                C41166r1.Ax0().mo61488bD(this.f129852o);
            }
            C53087d Hx0 = C41166r1.Hx0();
            String str14 = this.f129855r;
            Hx0.getClass();
            if (Util.isNullOrNil(str14)) {
                Log.m105928w("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId failed, rankId is null or nil.");
            } else {
                Log.m105925i("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId (%s).(r : %d)", str14, Integer.valueOf(Hx0.f148162d.delete("HardDeviceRankInfo", "rankID = ? ", new String[]{str14})));
            }
            C53087d Hx02 = C41166r1.Hx0();
            String str15 = this.f129855r;
            ArrayList<C52778d> arrayList3 = this.f129851n;
            Hx02.getClass();
            if (Util.isNullOrNil(str15) || arrayList3 == null) {
                Log.m105928w("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo failed, rank id is null or nil or data is null.");
            } else {
                boolean z2 = false;
                Log.m105925i("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo, rankId(%s) , size(%d).", str15, Integer.valueOf(arrayList3.size()));
                int i6 = 0;
                while (i6 < arrayList3.size()) {
                    Hx02.mo73770Lo(arrayList3.get(i6), z2);
                    i6++;
                    z2 = false;
                }
                C41166r1.Ix0().mo73404a("HardDeviceRankInfo", new C52452d(str15, (String) null, (String) null));
            }
            Object[] objArr = new Object[6];
            objArr[0] = Boolean.valueOf(this.f129858u);
            ArrayList<C37689c> arrayList4 = this.f129852o;
            objArr[1] = Integer.valueOf(arrayList4 != null ? arrayList4.size() : 0);
            ArrayList<C52778d> arrayList5 = this.f129851n;
            objArr[2] = Integer.valueOf(arrayList5 != null ? arrayList5.size() : 0);
            ArrayList<C37690e> arrayList6 = this.f129853p;
            objArr[3] = Integer.valueOf(arrayList6 != null ? arrayList6.size() : 0);
            n85 n85 = jb22.f135995w;
            objArr[4] = n85;
            objArr[5] = Integer.valueOf(n85 != null ? n85.f138486e : -1);
            Log.m105925i("MicroMsg.NetSceneGetRankInfo", "isCacheExist(%s), RankFollowInfo size(%s), RankInfo size(%d), LikeInfo size(%d). myInfo:%s myInfo.score:%s", objArr);
            C41166r1.Fx0().mo61494jo(this.f129855r, this.f129848h, this.f129853p);
            if (this.f129850j != null) {
                C41166r1.vx0().mo61491Lo(this.f129850j, true);
            }
        }
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        C46948b bVar = this.f129862y.get();
        if (bVar != null) {
            bVar.mo64355a(i4, i5, str2, this);
        }
    }
}
