package j61;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.autogen.events.EmojiSyncTaskEvent;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import i61.C46174c;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p207nl.C47275m;
import p441aq.C92054g;
import p490dl.C45411m;
import p595ll.C34298g;
import p595ll.C46877f;
import p663qo.C101213l;
import sf0.C48374j0;
import te3.C48820b80;
import te3.C50930q90;
import te3.C51074r90;

/* renamed from: j61.j */
public class C46439j extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f125076d;

    /* renamed from: e */
    public C11385n f125077e;

    /* renamed from: f */
    public String f125078f;

    /* renamed from: g */
    public String f125079g;

    /* renamed from: h */
    public String f125080h;

    /* renamed from: i */
    public String f125081i;

    /* renamed from: j */
    public String f125082j;

    /* renamed from: n */
    public int f125083n;

    /* renamed from: o */
    public int f125084o;

    /* renamed from: p */
    public int f125085p;

    /* renamed from: q */
    public String f125086q;

    /* renamed from: r */
    public String f125087r;

    /* renamed from: s */
    public boolean f125088s;

    /* renamed from: t */
    public C98124g.C98125a f125089t;

    /* renamed from: u */
    public EmojiGroupInfo f125090u;

    /* renamed from: j61.j$a */
    public class C46440a implements C98124g.C98125a {
        public C46440a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            if (Util.isNullOrNil(C46439j.this.f125087r) || !str.equals(C46439j.this.f125087r)) {
                Log.m105918d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra mediaId is no equal");
                return 0;
            } else if (i == -21006) {
                Log.m105919d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", C46439j.this.f125087r);
                C46439j jVar = C46439j.this;
                jVar.mo71836k1(jVar.f125078f, 6, 0, jVar.f125087r);
                return 0;
            } else if (i != 0) {
                Log.m105921e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "download emoji pack failed. mProductId:%s:", C46439j.this.f125078f);
                C46439j jVar2 = C46439j.this;
                jVar2.mo71836k1(jVar2.f125078f, -1, 0, jVar2.f125087r);
                return 0;
            } else if (cVar != null) {
                long j = cVar.field_finishedLength;
                if (j == cVar.field_toltalLength) {
                    Log.m105918d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra ignore progress 100%");
                    return 0;
                }
                Log.m105919d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra progresscallback id:%s finish:%d total:%d", C46439j.this.f125087r, Long.valueOf(j), Long.valueOf(cVar.field_toltalLength));
                C46439j jVar3 = C46439j.this;
                if (!jVar3.f125088s) {
                    jVar3.mo71836k1(jVar3.f125078f, 6, (int) ((((float) cVar.field_finishedLength) / ((float) cVar.field_toltalLength)) * 100.0f), jVar3.f125087r);
                }
                return 0;
            } else {
                if (dVar != null) {
                    C115669n.INSTANCE.mo160131h(10625, 2, dVar.field_fileId, C46439j.this.f125078f, dVar.field_transInfo);
                    int i2 = dVar.field_retCode;
                    if (i2 != 0) {
                        Log.m105921e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "donwload emoji pack faild. ProductId:%s code:%d ", C46439j.this.f125078f, Integer.valueOf(i2));
                        C46439j jVar4 = C46439j.this;
                        jVar4.mo71836k1(jVar4.f125078f, -1, 0, jVar4.f125087r);
                    } else {
                        Log.m105918d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "donwload emoji success.");
                        String str2 = C46439j.this.f125078f;
                        C87412m.m108594g(str2, "productId");
                        Log.m105924i("MicroMsg.EmojiPackSyncManager", "checkPack: " + str2);
                        C61926c.m72656A((String) null, new C46877f(str2, C34298g.f92433d));
                        try {
                            if (C46174c.f124469b == null) {
                                synchronized (C46174c.class) {
                                    C46174c.f124469b = new C46174c();
                                }
                            }
                            C46174c cVar2 = C46174c.f124469b;
                            String str3 = C46439j.this.f125078f;
                            ArrayList<String> arrayList = cVar2.f124470a;
                            if (arrayList != null && arrayList.contains(str3)) {
                                cVar2.f124470a.remove(str3);
                            }
                            C46439j jVar5 = C46439j.this;
                            EmojiLogic.m117491v(jVar5.f125078f, jVar5.f125079g, jVar5.f125081i, jVar5.f125082j, jVar5.f125090u);
                            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                            C30790w2.m39221h().mo57717d().doNotify();
                            C45411m.m50355a(((C51074r90) C46439j.this.f125076d.f127056b.f127083a).f140770e);
                            C46439j jVar6 = C46439j.this;
                            jVar6.mo71836k1(jVar6.f125078f, 7, 100, jVar6.f125087r);
                            C86009m1 m1Var = new C86009m1(C112760b.m154247s() + C46439j.this.f125078f);
                            if (m1Var.mo119978p() && m1Var.mo119967g()) {
                                m1Var.mo119966f();
                            }
                            C46439j jVar7 = C46439j.this;
                            C46439j.m51745j1(jVar7, jVar7.f125078f, true);
                            return 0;
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Error." + Util.getStack());
                            C46439j jVar8 = C46439j.this;
                            jVar8.mo71836k1(jVar8.f125078f, -1, 0, jVar8.f125087r);
                            C46439j jVar9 = C46439j.this;
                            C46439j.m51745j1(jVar9, jVar9.f125078f, false);
                            return 0;
                        } catch (OutOfMemoryError unused2) {
                            Log.m105920e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Out Of Memory Error." + Util.getStack());
                            C46439j jVar82 = C46439j.this;
                            jVar82.mo71836k1(jVar82.f125078f, -1, 0, jVar82.f125087r);
                            C46439j jVar92 = C46439j.this;
                            C46439j.m51745j1(jVar92, jVar92.f125078f, false);
                            return 0;
                        }
                    }
                }
                return 0;
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

    public C46439j(String str, String str2, String str3, String str4, String str5, EmojiGroupInfo emojiGroupInfo, int i, int i2, int i3, String str6) {
        this.f125087r = "";
        this.f125089t = new C46440a();
        this.f125078f = str;
        this.f125079g = str3;
        this.f125080h = str2;
        this.f125081i = str4;
        this.f125082j = str5;
        this.f125090u = emojiGroupInfo;
        this.f125083n = i;
        this.f125084o = i2;
        this.f125085p = i3;
        this.f125086q = str6;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50930q90();
        bVar.f127067b = new C51074r90();
        bVar.f127068c = "/cgi-bin/micromsg-bin/exchangeemotionpack";
        bVar.f127069d = v2helper.EMethodSetNgStrength;
        bVar.f127070e = 213;
        bVar.f127071f = 1000000213;
        this.f125076d = bVar.mo72403a();
    }

    /* renamed from: j1 */
    public static void m51745j1(C46439j jVar, String str, boolean z) {
        jVar.getClass();
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "[cpan] publicStoreEmojiDownLoadTaskEvent productId:%s success:%b", str, Boolean.valueOf(z));
            EmojiSyncTaskEvent emojiSyncTaskEvent = new EmojiSyncTaskEvent();
            EmojiSyncTaskEvent.C40056a aVar = emojiSyncTaskEvent.f107420d;
            aVar.f107422b = str;
            aVar.f107421a = 2;
            aVar.f107423c = z;
            emojiSyncTaskEvent.publish();
        }
    }

    public void cancel() {
        super.cancel();
        this.f125088s = true;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "doScene");
        this.f125077e = nVar;
        if (this.f125084o == 0) {
            mo71836k1(this.f125078f, 6, 0, this.f125087r);
        }
        C50930q90 q902 = (C50930q90) this.f125076d.f127055a.f127080a;
        q902.f140191d = this.f125078f;
        q902.f140192e = this.f125080h;
        q902.f140193f = this.f125083n;
        q902.f140194g = this.f125084o;
        q902.f140195h = this.f125085p;
        q902.f140196i = C48374j0.m53719h(this.f125086q, false);
        return dispatch(gVar, this.f125076d, this);
    }

    public int getType() {
        return v2helper.EMethodSetNgStrength;
    }

    /* renamed from: k1 */
    public final void mo71836k1(String str, int i, int i2, String str2) {
        ((C92054g) C86312j.m106911c(C92054g.class)).zx0().mo127627a(str, i, i2, str2);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47275m.m52572a(this.f125078f);
            if (this.f125084o == 0) {
                Uri n = C116299g2.m163858n(C112760b.m154247s());
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.f125087r = C1297x.m1387b("downzip", currentTimeMillis, C86709a0.m107523b().mo121110g() + "", "emoji");
                C48820b80 b802 = ((C51074r90) this.f125076d.f127056b.f127083a).f140769d;
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_NetSceneExchangeEmotionPack";
                gVar.field_mediaId = this.f125087r;
                gVar.field_fullpath = C112760b.m154247s() + this.f125078f;
                gVar.field_fileType = 5;
                gVar.field_totalLen = b802.f131008f;
                gVar.field_aesKey = b802.f131007e;
                gVar.field_fileId = b802.f131006d;
                gVar.field_priority = 2;
                gVar.f287662f = this.f125089t;
                gVar.field_needStorage = true;
                this.f125088s = false;
                if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar)) {
                    Log.m105920e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add task failed:");
                }
            } else {
                Log.m105924i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add custom emoji.need no download pack");
            }
            this.f125077e.onSceneEnd(i2, i3, str, this);
            C86709a0.m107529k().f251779b.mo123460f(new C33522n(this.f125078f));
            return;
        }
        this.f125077e.onSceneEnd(i2, i3, str, this);
        mo71836k1(this.f125078f, -1, 0, this.f125087r);
    }

    public C46439j(String str) {
        this(str, (String) null, "", (String) null, (String) null, (EmojiGroupInfo) null, 1, 0, 0, (String) null);
    }

    public C46439j(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, (EmojiGroupInfo) null, 0, 0, 0, (String) null);
    }
}
