package j61;

import com.tencent.p014mm.autogen.events.EmojiStoreExptChangeEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.plugin.emoji.model.C41053r;
import com.tencent.p014mm.plugin.emoji.sync.C41060a;
import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C93123b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import l61.C46833a;
import l61.C46834b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p441aq.C92054g;
import sf0.C48374j0;
import te3.C101754a80;
import te3.C101824o80;
import te3.C51018qv3;
import te3.C51317sz1;
import te3.C51468tz1;
import wh3.C102450c;
import x51.C102562g;
import zt3.C119157j;

/* renamed from: j61.q */
public class C46443q extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f125101d;

    /* renamed from: e */
    public C11385n f125102e;

    /* renamed from: f */
    public final int f125103f;

    /* renamed from: g */
    public final int f125104g;

    /* renamed from: h */
    public int f125105h;

    /* renamed from: i */
    public byte[] f125106i;

    /* renamed from: j */
    public String f125107j;

    /* renamed from: n */
    public boolean f125108n;

    /* renamed from: o */
    public ArrayList<C101824o80> f125109o;

    /* renamed from: p */
    public byte[] f125110p;

    /* renamed from: j61.q$a */
    public class C46444a implements Runnable {
        public C46444a() {
        }

        public void run() {
            C46443q qVar = C46443q.this;
            ArrayList<C101824o80> arrayList = qVar.f125109o;
            Class cls = C92054g.class;
            Log.m105925i("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList: %s", Integer.valueOf(arrayList.size()));
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C102450c b = C30790w2.m39221h().mo57715b();
            if (b == null) {
                Log.m105928w("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList failed. get emoji group info storage failed.");
                return;
            }
            b.mo142018DN(arrayList);
            if (!qVar.f125108n) {
                C93123b<C41062e> wx02 = ((C92054g) C86312j.m106911c(cls)).wx0();
                ((C119157j) C119157j.f356862d).mo183875f(new C41060a(wx02));
            } else if (arrayList.size() > 0) {
                Log.m105925i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d force", Integer.valueOf(arrayList.size()));
                ArrayList arrayList2 = new ArrayList();
                Iterator<C101824o80> it = arrayList.iterator();
                while (it.hasNext()) {
                    C101824o80 next = it.next();
                    if (next != null && !Util.isNullOrNil(next.f298994d)) {
                        if (next.f298994d.equals(String.valueOf(17))) {
                            arrayList2.add(new C46834b("com.tencent.xin.emoticon.tusiji"));
                        } else {
                            arrayList2.add(new C46833a(next.f298994d, true));
                        }
                    }
                }
                ((C92054g) C86312j.m106911c(cls)).wx0().f268269a.mo64093b(arrayList2);
                if (!((C92054g) C86312j.m106911c(cls)).wx0().f268269a.f110547c) {
                    ((C92054g) C86312j.m106911c(cls)).wx0().f268269a.mo64097f();
                }
            }
        }
    }

    public C46443q(int i, int i2) {
        this(i, (byte[]) null, i2, false);
    }

    /* renamed from: k1 */
    public static C41053r m51751k1(C51468tz1 tz12) {
        Object[] array;
        Log.m105918d("MicroMsg.emoji.NetSceneGetEmotionList", "getEmotionListModel");
        if (tz12 == null) {
            return null;
        }
        C41053r rVar = new C41053r();
        rVar.f110539a = tz12.f142490e;
        ArrayList arrayList = new ArrayList();
        LinkedList<C101824o80> linkedList = tz12.f142491f;
        if (linkedList != null && !linkedList.isEmpty() && (array = tz12.f142491f.toArray()) != null && array.length > 0) {
            for (Object obj : array) {
                if (obj != null && (obj instanceof C101824o80)) {
                    C101824o80 o802 = (C101824o80) obj;
                    if (!Util.isNullOrNil(o802.f298994d)) {
                        arrayList.add(new C102562g(o802));
                        Log.m105919d("MicroMsg.emoji.NetSceneGetEmotionList", "EmojiSummary ProductId:%s,ProductName:%s PackPrice:%s , PackType:%s , PriceNum:%s ,PriceType:%s ,PackFlag:%s , PackWeCoinNum:%s , WeCoinNum:%s ", o802.f298996f, o802.f298994d, o802.f298999i, Integer.valueOf(o802.f299000j), o802.f299007t, o802.f299008u, Integer.valueOf(o802.f299001n), Integer.valueOf(o802.f298990A), Integer.valueOf(o802.f298991B));
                    }
                }
            }
        }
        rVar.f110540b = arrayList;
        rVar.f110541c = tz12.f142492g;
        rVar.f110542d = tz12.f142494i;
        LinkedList<C101754a80> linkedList2 = tz12.f142502t;
        if (rVar.f110544f == null) {
            LinkedList linkedList3 = new LinkedList();
            rVar.f110544f = linkedList3;
            linkedList3.addAll(linkedList2);
        }
        rVar.f110543e = tz12.f142498p;
        return rVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125102e = nVar;
        C51317sz1 sz12 = (C51317sz1) this.f125101d.f127055a.f127080a;
        byte[] bArr = this.f125110p;
        if (bArr != null) {
            sz12.f141845d = C48374j0.m53712a(bArr);
        } else {
            sz12.f141845d = new C51018qv3();
        }
        byte[] bArr2 = this.f125106i;
        if (bArr2 != null) {
            sz12.f141849h = C48374j0.m53712a(bArr2);
        } else {
            sz12.f141849h = new C51018qv3();
        }
        C51018qv3 qv32 = sz12.f141845d;
        Log.m105918d("MicroMsg.emoji.NetSceneGetEmotionList", qv32 == null ? "Buf is NULL" : qv32.toString());
        int i = this.f125103f;
        sz12.f141846e = i;
        sz12.f141847f = this.f125104g;
        sz12.f141850i = this.f125107j;
        if (i == 7) {
            sz12.f141848g = this.f125105h;
        }
        return dispatch(gVar, this.f125101d, this);
    }

    public int getType() {
        return 411;
    }

    /* renamed from: j1 */
    public final void mo71838j1() {
        LinkedList<C101824o80> linkedList;
        C51468tz1 l1 = mo71839l1();
        if (l1 == null || (linkedList = l1.f142491f) == null || linkedList.size() <= 0) {
            Log.m105928w("MicroMsg.emoji.NetSceneGetEmotionList", "addSummaryList faild. response is null or emotion list is empty.");
        } else {
            this.f125109o.addAll(l1.f142491f);
        }
    }

    /* renamed from: l1 */
    public C51468tz1 mo71839l1() {
        C47350c cVar = this.f125101d;
        if (cVar == null) {
            return null;
        }
        return (C51468tz1) cVar.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_STORE_RECOMMEND_LAST_UPDATE_TIME_LONG;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_EMOJI_SYNC_STORE_EMOJI_DOWNLOAD_LONG;
        Log.m105918d("MicroMsg.emoji.NetSceneGetEmotionList", "ErrType:" + i2 + "   errCode:" + i3);
        if (this.f125103f == 8) {
            if (i2 == 0 && i3 == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(System.currentTimeMillis()));
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf((System.currentTimeMillis() - 86400000) + 3600000));
            }
        }
        if (this.f125103f == 11) {
            if (i2 == 0 && i3 == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(System.currentTimeMillis()));
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf((System.currentTimeMillis() - 28800000) + 600000));
            }
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            C30790w2.m39221h().mo57720g().mo61545Yt(this.f125103f, mo71839l1());
        }
        if (i2 == 0 || i2 == 4) {
            C47350c cVar = (C47350c) uVar;
            C51018qv3 qv32 = ((C51468tz1) cVar.f127056b.f127083a).f142489d;
            if (qv32 != null) {
                this.f125110p = C48374j0.m53715d(qv32);
            }
            if (this.f125103f == 8) {
                if (i3 == 0) {
                    mo71838j1();
                    ((C119157j) C119157j.f356862d).mo183875f(new C46444a());
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(System.currentTimeMillis()));
                } else if (i3 == 2) {
                    mo71838j1();
                    ((C51317sz1) cVar.f127055a.f127080a).f141845d = ((C51468tz1) cVar.f127056b.f127083a).f142489d;
                    doScene(dispatcher(), this.f125102e);
                } else if (i3 == 3) {
                    ArrayList<C101824o80> arrayList = this.f125109o;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ((C51317sz1) cVar.f127055a.f127080a).f141845d = new C51018qv3();
                    doScene(dispatcher(), this.f125102e);
                }
            }
            int i4 = this.f125103f;
            if (i4 == 1 || i4 == 9) {
                C41051m a = C41051m.m44498a();
                String str2 = mo71839l1().f142503u;
                if (!Util.isEqual(a.f110534b, str2)) {
                    a.f110534b = str2;
                    a.mo64089b();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_EXPT_CONFIG_STRING, str2);
                    new EmojiStoreExptChangeEvent().publish();
                }
            } else if (i4 == 5) {
                C41051m a2 = C41051m.m44498a();
                String str3 = mo71839l1().f142503u;
                if (!Util.isEqual(a2.f110533a, str3)) {
                    a2.f110533a = str3;
                    a2.mo64089b();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_EXPT_MAIN_TAB_CONFIG_STRING, str3);
                    new EmojiStoreExptChangeEvent().publish();
                }
            }
            this.f125102e.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f125102e.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 100;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public C46443q(int i, byte[] bArr, int i2, boolean z) {
        this.f125106i = null;
        this.f125107j = null;
        this.f125108n = false;
        this.f125109o = new ArrayList<>();
        this.f125110p = null;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51317sz1();
        bVar.f127067b = new C51468tz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getemotionlist";
        bVar.f127069d = 411;
        bVar.f127070e = 210;
        bVar.f127071f = 1000000210;
        this.f125101d = bVar.mo72403a();
        this.f125110p = bArr;
        this.f125106i = null;
        this.f125103f = i;
        this.f125104g = i2;
        this.f125108n = z;
        Log.m105925i("MicroMsg.emoji.NetSceneGetEmotionList", "NetSceneGetEmotionList: %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }
}
