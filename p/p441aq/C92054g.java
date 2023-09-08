package p441aq;

import android.content.Context;
import android.content.IntentFilter;
import bp3.C28361q;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.events.SucceedUploadEmotionEvent;
import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.plugin.emoji.model.C93118q;
import com.tencent.p014mm.plugin.emoji.model.C93121y;
import com.tencent.p014mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C93123b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.smiley.C96931e;
import com.tencent.p014mm.smiley.C96945j0;
import com.tencent.p014mm.smiley.C96954m;
import com.tencent.p014mm.storage.C30764p2;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.C96985s2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gc0.C20828a;
import i61.C33213j;
import i61.C98602h;
import j61.C98910u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import ob0.C35136m;
import ob0.C89132b;
import ob0.C89137b0;
import p008bq.C39831i1;
import p008bq.C39832j1;
import p008bq.C39833l0;
import p008bq.C54530k0;
import p248ug.C52571f;
import p490dl.C45410f;
import p490dl.C45411m;
import p490dl.C97489o;
import p911ml.C99924m;
import te3.C49103d62;
import u61.C101964h;
import wh3.C38143r;
import zb0.C53768g;

@C86522b
/* renamed from: aq.g */
public class C92054g extends C86301e implements C39833l0, C54530k0 {

    /* renamed from: d */
    public C30764p2 f263572d;

    /* renamed from: e */
    public C98602h f263573e;

    /* renamed from: f */
    public C93118q f263574f;

    /* renamed from: g */
    public HashMap<Long, String> f263575g = new HashMap<>();

    /* renamed from: h */
    public boolean f263576h = false;

    /* renamed from: i */
    public List<g$$e> f263577i = new LinkedList();

    /* renamed from: j */
    public SucceedUploadEmotionEvent f263578j;

    /* renamed from: n */
    public C39833l0.C39834a f263579n;

    /* renamed from: o */
    public final C28361q<C20828a> f263580o = new g$$b(this);

    /* renamed from: p */
    public final C28361q<C93123b<C41062e>> f263581p = new g$$c(this);

    /* renamed from: q */
    public final C28361q<C33213j> f263582q = new g$$d(this);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: aq.g$$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ax0(int r13, int r14) {
        /*
            r12 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.util.List<aq.g$$e> r1 = r12.f263577i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r1 >= r3) goto L_0x0011
            r12.f263576h = r2
            return
        L_0x0011:
            java.util.List<aq.g$$e> r1 = r12.f263577i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r1 = r1.remove(r2)
            aq.g$$e r1 = (p441aq.g$$e) r1
            r3 = 2
            if (r13 != 0) goto L_0x0020
            if (r14 == 0) goto L_0x002d
        L_0x0020:
            r3 = 5
            kj2.d r4 = kj2.C117407d.INSTANCE
            r5 = 111(0x6f, double:5.5E-322)
            r7 = 35
            r9 = 1
            r11 = 1
            r4.idkeyStat(r5, r7, r9, r11)
        L_0x002d:
            k40.a r13 = f40.C86709a0.m107533q(r0)
            f62.k0 r13 = (f62.C75700k0) r13
            g62.l r13 = r13.mo96095LE()
            long r4 = r1.f263583a
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            com.tencent.mm.storage.f4 r13 = r13.b00(r4)
            long r4 = r13.getMsgId()
            r6 = 0
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x005d
            r13.mo100991d(r3)
            k40.a r14 = f40.C86709a0.m107533q(r0)
            f62.k0 r14 = (f62.C75700k0) r14
            g62.l r14 = r14.mo96095LE()
            long r3 = r1.f263583a
            com.tencent.mm.storage.g4 r14 = (com.tencent.p014mm.storage.C72972g4) r14
            r14.xy0(r3, r13)
        L_0x005d:
            java.util.List<aq.g$$e> r13 = r12.f263577i
            java.util.LinkedList r13 = (java.util.LinkedList) r13
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x00a9
            java.util.List<aq.g$$e> r13 = r12.f263577i
            java.util.LinkedList r13 = (java.util.LinkedList) r13
            java.lang.Object r13 = r13.get(r2)
            r1 = r13
            aq.g$$e r1 = (p441aq.g$$e) r1
            k40.a r13 = f40.C86709a0.m107533q(r0)
            f62.k0 r13 = (f62.C75700k0) r13
            g62.l r13 = r13.mo96095LE()
            long r2 = r1.f263583a
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            com.tencent.mm.storage.f4 r13 = r13.b00(r2)
            long r13 = r13.getMsgId()
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a4
            f40.g r13 = f40.C86709a0.m107529k()
            ob0.b0 r13 = r13.f251779b
            j61.u r14 = new j61.u
            java.lang.String r3 = r1.f263586d
            java.lang.String r4 = r1.f263584b
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r1.f263585c
            long r6 = r1.f263583a
            r2 = r14
            r2.<init>(r3, r4, r5, r6)
            r13.mo123460f(r14)
            goto L_0x00ab
        L_0x00a4:
            r13 = -1
            r12.Ax0(r13, r13)
            goto L_0x00ab
        L_0x00a9:
            r12.f263576h = r2
        L_0x00ab:
            com.tencent.mm.autogen.events.SucceedUploadEmotionEvent r13 = r12.f263578j
            if (r13 != 0) goto L_0x00b6
            com.tencent.mm.autogen.events.SucceedUploadEmotionEvent r13 = new com.tencent.mm.autogen.events.SucceedUploadEmotionEvent
            r13.<init>()
            r12.f263578j = r13
        L_0x00b6:
            com.tencent.mm.autogen.events.SucceedUploadEmotionEvent r13 = r12.f263578j
            com.tencent.mm.autogen.events.SucceedUploadEmotionEvent$a r14 = r13.f265230d
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f263585c
            java.lang.String r0 = r0.field_groupId
            r14.f265231a = r0
            r13.publish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p441aq.C92054g.Ax0(int, int):void");
    }

    public final void Bx0(C96985s2 s2Var) {
        if (s2Var != null) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101123jo(new C75875l.C45886e(s2Var.f284160a, "update", (C72963f4) null, 0));
        }
    }

    /* renamed from: Cd */
    public C30764p2 mo126027Cd() {
        if (this.f263572d == null) {
            this.f263572d = C30764p2.f82718j;
        }
        return this.f263572d;
    }

    public void Cx0(String str, EmojiInfo emojiInfo, C72963f4 f4Var) {
        boolean z;
        long j;
        long j2;
        EmojiInfo emojiInfo2 = emojiInfo;
        Class cls = C92054g.class;
        if (!Util.isNullOrNil(str) && emojiInfo2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C101964h.m134231m(emojiInfo)) {
                boolean b = ((C92054g) C86312j.m106911c(cls)).yx0().mo59028b(emojiInfo2.field_groupId);
                Log.m105925i("MicroMsg.EmojiFeatureService", "isNeedShowRewardTip:%b", Boolean.valueOf(b));
                z = b;
            } else {
                ((C92054g) C86312j.m106911c(cls)).yx0().mo59029c();
                z = false;
            }
            if (f4Var == null) {
                C72963f4 f4Var2 = new C72963f4();
                f4Var2.setType(47);
                f4Var2.mo108749c3(str);
                f4Var2.mo108740T2(1);
                f4Var2.mo108732L2(C72989o2.m85759f(C75592q0.m90789s(), currentTimeMillis, !emojiInfo.mo62678k() && !emojiInfo.mo135617o2(), emojiInfo.getMd5(), z, ""));
                f4Var2.mo108739S2(emojiInfo.getMd5());
                f4Var2.mo108733M2(C75604z3.m90843o(f4Var2.mo108768t()));
                j = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var2);
                j2 = currentTimeMillis;
            } else {
                String str2 = str;
                long msgId = f4Var.getMsgId();
                j2 = new C72989o2(f4Var.getContent()).f212819b;
                if (j2 != 0) {
                    j = msgId;
                } else {
                    return;
                }
            }
            Log.m105925i("MicroMsg.EmojiFeatureService", "NetSceneUploadEmoji: msgId = %s, md5 %s, len %s", Long.valueOf(j), emojiInfo.getMd5(), Integer.valueOf(emojiInfo2.field_size));
            List<g$$e> list = this.f263577i;
            ((LinkedList) list).add(new g$$e(this, j, str, emojiInfo, "" + j2));
            if (!this.f263576h || ((LinkedList) this.f263577i).size() == 1) {
                this.f263576h = true;
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                b0Var.mo123460f(new C98910u(j2 + "", str, emojiInfo, j));
            }
        }
    }

    /* renamed from: Gs */
    public C89132b<C49103d62> mo75393Gs(int i, byte[] bArr) {
        return new C45410f(i, bArr);
    }

    /* renamed from: Ms */
    public void mo62464Ms(String str, String str2, C39833l0.C39835b bVar) {
        Log.m105924i("MicroMsg.EmojiFeatureService", "emojiUploadCheck() called with: md5 = [" + str + "], cdnUrl = [" + str2 + "]");
        EmojiInfo emojiInfo = new EmojiInfo();
        emojiInfo.field_md5 = str;
        emojiInfo.field_cdnUrl = str2;
        new C99924m(emojiInfo, new g$$a(bVar));
    }

    /* renamed from: NG */
    public void mo62465NG(C39833l0.C39834a aVar) {
        Log.m105925i("MicroMsg.EmojiFeatureService", "setEmojiDownloadCallback %s", aVar);
        this.f263579n = aVar;
    }

    /* renamed from: Nr */
    public C20828a mo62466Nr() {
        C86709a0.m107523b().mo121108c();
        return this.f263580o.get();
    }

    @Deprecated
    /* renamed from: VJ */
    public boolean mo62467VJ(IEmojiInfo iEmojiInfo) {
        C96985s2 s2Var;
        EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
        if (emojiInfo == null) {
            Log.m105924i("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiInfo failed. emojiinfo is null.");
            s2Var = null;
        } else {
            s2Var = new C96985s2();
            s2Var.f284163d = emojiInfo.field_md5;
            s2Var.f284164e = emojiInfo.field_type;
            s2Var.f284165f = emojiInfo.field_size;
            s2Var.f284168i = emojiInfo.field_groupId;
            s2Var.f284173n = emojiInfo.field_designerID;
            s2Var.f284174o = emojiInfo.field_thumbUrl;
            s2Var.f284175p = emojiInfo.field_encrypturl;
            s2Var.f284176q = emojiInfo.field_aeskey;
            s2Var.f284183x = emojiInfo.field_width;
            s2Var.f284184y = emojiInfo.field_height;
            s2Var.f284172m = emojiInfo.field_cdnUrl;
            s2Var.f284177r = emojiInfo.field_externUrl;
            s2Var.f284178s = emojiInfo.field_externMd5;
            s2Var.f284154B = emojiInfo.field_activityid;
            s2Var.f284185z = emojiInfo.field_tpurl;
            s2Var.f284153A = emojiInfo.field_tpauthkey;
            s2Var.f284156D = emojiInfo.field_attachedText;
            s2Var.f284157E = emojiInfo.field_lensId;
            s2Var.f284158F = emojiInfo.field_attachTextColor;
            s2Var.f284155C = emojiInfo.field_linkId;
        }
        if (s2Var == null) {
            Log.m105924i("MicroMsg.EmojiFeatureService", "prepareEmoji failed. emoji msg info is null.");
            return true;
        }
        s2Var.f284160a = emojiInfo == null ? "" : emojiInfo.f284125Q1;
        s2Var.f284179t = false;
        vx0(s2Var, (C35136m.C35137a) null, true);
        return true;
    }

    public C39831i1 Vi0() {
        return C96926b0.m124490b();
    }

    /* renamed from: k0 */
    public C52571f mo62469k0() {
        return C96931e.m124499a();
    }

    public void onAccountInitialized(Context context) {
        Log.m105924i("MicroMsg.EmojiFeatureService", "[onAccountInitialized]");
    }

    public void onAccountReleased(Context context) {
        Log.m105924i("MicroMsg.EmojiFeatureService", "onAccountRelease: ");
        C30790w2 h = C30790w2.m39221h();
        synchronized (h.f82769a) {
            C97489o oVar = h.f82787s;
            ArrayList<EmojiGroupInfo> arrayList = oVar.f286135g;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<C45411m> arrayList2 = oVar.f286136h;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            oVar.f286138j.evictAll();
            h.mo57717d().remove(h.f82790v);
            h.mo57715b().remove(h.f82788t);
            h.mo57714a().remove(h.f82789u);
            h.f82769a[0] = false;
        }
        mo126027Cd().mo57675b();
        ((LinkedList) this.f263577i).clear();
        this.f263575g.clear();
        if (this.f263582q.hasInstance()) {
            C33213j jVar = this.f263582q.get();
            boolean[] zArr = jVar.f90111a;
            if (zArr[0]) {
                synchronized (zArr) {
                    if (jVar.f90111a[0]) {
                        synchronized (jVar) {
                            jVar.f90116f = null;
                            HashMap<String, C38143r> hashMap = jVar.f90117g;
                            if (hashMap != null) {
                                hashMap.clear();
                            }
                        }
                        jVar.f90111a[0] = false;
                    }
                }
            }
        }
        if (this.f263581p.hasInstance()) {
            BKGLoaderManager bKGLoaderManager = this.f263581p.get().f268269a;
            boolean[] zArr2 = bKGLoaderManager.f110556l;
            if (zArr2[0]) {
                synchronized (zArr2) {
                    if (bKGLoaderManager.f110556l[0]) {
                        Log.m105918d("MicroMsg.BKGLoader.BKGLoaderManager", "bkg detach");
                        bKGLoaderManager.mo64096e();
                        bKGLoaderManager.f110558n.dead();
                        bKGLoaderManager.f110559o.dead();
                        if (bKGLoaderManager.f110554j != null) {
                            MMApplicationContext.getContext().unregisterReceiver(bKGLoaderManager.f110554j);
                            bKGLoaderManager.f110554j = null;
                        }
                        bKGLoaderManager.f110556l[0] = false;
                    }
                }
            }
        }
        C93121y.f268266a.clear();
        this.f263579n = null;
        if (this.f263580o.hasInstance()) {
            this.f263580o.get().mo32514c();
        }
        C92668a.C92674f fVar = C92668a.f266699q;
        fVar.mo126718b(true).destroy();
        fVar.mo126717a(true).destroy();
        if (C30777t2.f82756d.wx0()) {
            C96954m.f284033a.mo135540d();
        }
    }

    public void onCreate(Context context) {
    }

    /* renamed from: pc */
    public C39832j1 mo75394pc(String str) {
        return new C53768g(str);
    }

    /* renamed from: tn */
    public void mo62470tn() {
        C96945j0.m124519b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00fa, code lost:
        if (((com.tencent.p014mm.storage.C72972g4) ((f62.C75700k0) f40.C86709a0.m107533q(r3)).mo96095LE()).h30(r1.f284160a, r1.f284169j).mo108774y2() == r1.f284169j) goto L_0x0241;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void vx0(com.tencent.p014mm.storage.C96985s2 r24, ob0.C35136m.C35137a r25, boolean r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.Class<aq.g> r3 = p441aq.C92054g.class
            java.lang.String r4 = "MicroMsg.EmojiFeatureService"
            if (r1 != 0) goto L_0x0012
            java.lang.String r1 = "downloadEmoji msginfo is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            return
        L_0x0012:
            if (r2 == 0) goto L_0x0031
            te3.j3 r5 = r2.f94242a
            if (r5 == 0) goto L_0x0031
            long r5 = r5.f227638r
            long r7 = r1.f284169j
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0031
            int r5 = eb0.C75604z3.m90845q(r25)
            r1.f284180u = r5
            te3.j3 r5 = r2.f94242a
            int r6 = r5.f227639s
            r1.f284181v = r6
            int r5 = r5.f227635o
            long r5 = (long) r5
            r1.f284182w = r5
        L_0x0031:
            di3.d r5 = di3.C86312j.m106911c(r3)
            aq.g r5 = (p441aq.C92054g) r5
            r5.getClass()
            com.tencent.mm.storage.w2 r5 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r5 = r5.mo57717d()
            java.lang.String r6 = r1.f284163d
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r5.mo142044TO(r6)
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x007d
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r11 = r5.field_md5
            r10[r8] = r11
            java.lang.String r11 = r1.f284163d
            r10[r9] = r11
            long r11 = r1.f284169j
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r7] = r11
            java.lang.String r11 = "downloadEmoji: db emoji info not null %s msgInfomd5 %s svrId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r10)
            u61.C101964h.m134220b(r1, r5)
            di3.d r3 = di3.C86312j.m106911c(r3)
            aq.g r3 = (p441aq.C92054g) r3
            r3.getClass()
            com.tencent.mm.storage.w2 r3 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r3 = r3.mo57717d()
            r3.r50(r5)
            goto L_0x00b9
        L_0x007d:
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r10 = r1.f284163d
            r5[r8] = r10
            java.lang.String r10 = "downloadEmoji: create emoji info %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r5)
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r10 = r1.f284163d
            r5[r8] = r10
            java.lang.String r10 = "createEmojiInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r5)
            com.tencent.mm.storage.emotion.EmojiInfo r5 = new com.tencent.mm.storage.emotion.EmojiInfo
            r5.<init>()
            u61.C101964h.m134220b(r1, r5)
            r5.field_temp = r9
            r10 = 8
            r5.field_state = r10
            r10 = 65
            r5.field_catalog = r10
            di3.d r3 = di3.C86312j.m106911c(r3)
            aq.g r3 = (p441aq.C92054g) r3
            r3.getClass()
            com.tencent.mm.storage.w2 r3 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r3 = r3.mo57717d()
            r3.mo142040Ow(r5)
        L_0x00b9:
            boolean r3 = r1.f284179t
            if (r3 == 0) goto L_0x0241
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r11 = r1.f284163d
            r10[r8] = r11
            java.lang.String r11 = r5.field_md5
            r10[r9] = r11
            long r11 = r1.f284169j
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r7] = r11
            java.lang.String r11 = "insertEmojiMsg: %s, %s msgSvrId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r10)
            long r10 = r1.f284169j
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00fe
            k40.a r10 = f40.C86709a0.m107533q(r3)
            f62.k0 r10 = (f62.C75700k0) r10
            g62.l r10 = r10.mo96095LE()
            java.lang.String r11 = r1.f284160a
            long r14 = r1.f284169j
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
            com.tencent.mm.storage.f4 r10 = r10.h30(r11, r14)
            long r10 = r10.mo108774y2()
            long r14 = r1.f284169j
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x00fe
            goto L_0x0241
        L_0x00fe:
            k40.a r10 = f40.C86709a0.m107533q(r3)
            f62.k0 r10 = (f62.C75700k0) r10
            com.tencent.mm.storage.u3 r10 = r10.mo96097Ni()
            java.lang.String r11 = r1.f284160a
            com.tencent.mm.storage.z1 r10 = r10.get(r11)
            if (r10 == 0) goto L_0x0115
            long r10 = r10.f108320R1
            int r11 = (int) r10
            if (r11 != 0) goto L_0x012c
        L_0x0115:
            com.tencent.mm.storage.z1 r10 = new com.tencent.mm.storage.z1
            java.lang.String r11 = r1.f284160a
            r10.<init>(r11)
            r10.setType(r7)
            k40.a r11 = f40.C86709a0.m107533q(r3)
            f62.k0 r11 = (f62.C75700k0) r11
            com.tencent.mm.storage.u3 r11 = r11.mo96097Ni()
            r11.mo69667P3(r10)
        L_0x012c:
            com.tencent.mm.storage.f4 r10 = new com.tencent.mm.storage.f4
            r10.<init>()
            r11 = 47
            r10.setType(r11)
            java.lang.String r11 = r1.f284160a
            r10.mo108749c3(r11)
            java.lang.String r11 = r1.f284161b
            boolean r11 = eb0.C75592q0.m90764L(r11)
            r10.mo108740T2(r11)
            java.lang.String r11 = r5.getMd5()
            r10.mo108739S2(r11)
            long r14 = r1.f284169j
            r10.mo108745Y2(r14)
            java.lang.String r11 = r1.f284161b
            r17 = 0
            boolean r14 = r5.mo62678k()
            if (r14 != 0) goto L_0x0163
            boolean r14 = r5.mo135617o2()
            if (r14 != 0) goto L_0x0163
            r19 = 1
            goto L_0x0165
        L_0x0163:
            r19 = 0
        L_0x0165:
            java.lang.String r20 = r5.getMd5()
            r21 = 0
            java.lang.String r14 = r1.f284170k
            r16 = r11
            r22 = r14
            java.lang.String r11 = com.tencent.p014mm.storage.C72989o2.m85759f(r16, r17, r19, r20, r21, r22)
            r10.mo108732L2(r11)
            java.lang.String r11 = r10.mo108768t()
            long r14 = r1.f284182w
            long r14 = eb0.C75604z3.m90841m(r11, r14)
            r10.mo108733M2(r14)
            r10.mo100991d(r6)
            java.lang.String r11 = r1.f284171l
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0195
            java.lang.String r11 = r1.f284171l
            r10.mo101012p4(r11)
        L_0x0195:
            if (r2 != 0) goto L_0x01d4
            int r2 = r1.f284180u
            if (r2 == 0) goto L_0x01b5
            r10.mo108735O2(r2)
            long r14 = r10.getMsgId()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x01b5
            int r11 = r10.mo108769t2()
            if (r11 != 0) goto L_0x01b5
            r11 = r2 & 2
            if (r11 == 0) goto L_0x01b5
            long r11 = r1.f284182w
            r10.mo108733M2(r11)
        L_0x01b5:
            int r11 = r1.f284181v
            if (r11 == 0) goto L_0x01bd
            long r11 = (long) r11
            r10.mo108744X2(r11)
        L_0x01bd:
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r8] = r2
            int r2 = r1.f284181v
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r9] = r2
            java.lang.String r2 = "summerbadcr insertEmojiMsg addMsgInfo is null but flag[%d], msgSeq[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r11)
            goto L_0x01d7
        L_0x01d4:
            eb0.C75604z3.m90842n(r10, r2)
        L_0x01d7:
            java.util.HashMap<java.lang.Long, java.lang.String> r2 = r0.f263575g
            if (r2 == 0) goto L_0x0214
            long r11 = r10.mo108774y2()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            boolean r2 = r2.containsKey(r11)
            if (r2 == 0) goto L_0x0214
            java.lang.String r2 = "this msg had been revoke."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.util.HashMap<java.lang.Long, java.lang.String> r2 = r0.f263575g
            long r11 = r10.mo108774y2()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.Object r2 = r2.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            r10.mo108732L2(r2)
            r2 = 10000(0x2710, float:1.4013E-41)
            r10.setType(r2)
            java.util.HashMap<java.lang.Long, java.lang.String> r2 = r0.f263575g
            long r11 = r10.mo108774y2()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r2.remove(r11)
        L_0x0214:
            long r10 = eb0.C75604z3.m90852x(r10)
            java.lang.String r2 = r1.f284161b
            boolean r2 = eb0.C75592q0.m90764L(r2)
            if (r2 != 0) goto L_0x0241
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r10)
            java.lang.Class<bd2.d> r3 = bd2.C79690d.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            bd2.d r3 = (bd2.C79690d) r3
            eb0.u2 r3 = r3.mo109806kA()
            eb0.c3 r3 = (eb0.C75568c3) r3
            r3.mo93204a(r2)
        L_0x0241:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r3 = r5.getMd5()
            r2[r8] = r3
            boolean r3 = r5.mo62633C1()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r9] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r2[r7] = r3
            java.lang.String r3 = "start download emoji %s, fileExist %b, download %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
            boolean r2 = r5.mo62633C1()
            if (r2 != 0) goto L_0x0282
            if (r26 == 0) goto L_0x0272
            wk.e r2 = p260wk.C102457e.f301712a
            aq.h r3 = new aq.h
            r3.<init>(r0, r1, r5)
            r2.mo142074f(r5, r9, r3)
            goto L_0x0282
        L_0x0272:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r2[r8] = r3
            java.lang.String r3 = "cdnurl and cncrypt url is null. autodownload %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
            r23.Bx0(r24)
        L_0x0282:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p441aq.C92054g.vx0(com.tencent.mm.storage.s2, ob0.m$a, boolean):void");
    }

    public C93123b<C41062e> wx0() {
        C86709a0.m107523b().mo121108c();
        C93123b<C41062e> bVar = this.f263581p.get();
        BKGLoaderManager bKGLoaderManager = bVar.f268269a;
        boolean[] zArr = bKGLoaderManager.f110556l;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!bKGLoaderManager.f110556l[0]) {
                    Log.m105918d("MicroMsg.BKGLoader.BKGLoaderManager", "bkg attach");
                    bKGLoaderManager.f110558n.alive();
                    bKGLoaderManager.f110559o.alive();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    bKGLoaderManager.f110554j = new BKGLoaderManager.C41058c();
                    MMApplicationContext.getContext().registerReceiver(bKGLoaderManager.f110554j, intentFilter);
                    bKGLoaderManager.f110556l[0] = true;
                }
            }
        }
        return bVar;
    }

    public C98602h xx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f263573e == null) {
            this.f263573e = new C98602h();
        }
        return this.f263573e;
    }

    public C33213j yx0() {
        C86709a0.m107523b().mo121108c();
        C33213j jVar = this.f263582q.get();
        boolean[] zArr = jVar.f90111a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!jVar.f90111a[0]) {
                    jVar.mo59027a();
                    jVar.f90111a[0] = true;
                }
            }
        }
        return jVar;
    }

    public C93118q zx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f263574f == null) {
            this.f263574f = new C93118q();
        }
        return this.f263574f;
    }
}
