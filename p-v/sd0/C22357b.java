package sd0;

import be0.C16783a;
import be0.C16787b;
import com.tencent.p014mm.msgsubscription.ShowInfo;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.WordingInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import pe3.C89349b;
import rx3.C13604l;
import te3.C48879bm2;
import te3.C49335eu3;
import te3.hd4;
import te3.jd4;
import te3.kd4;
import te3.md4;

/* renamed from: sd0.b */
public final class C22357b extends C16783a implements C16783a.C16785b {

    /* renamed from: a */
    public String f63376a;

    /* renamed from: b */
    public String f63377b;

    /* renamed from: c */
    public final int f63378c;

    /* renamed from: d */
    public final List<hd4> f63379d;

    /* renamed from: e */
    public C16783a.C16786c f63380e;

    /* renamed from: f */
    public C22358b f63381f;

    /* renamed from: g */
    public boolean f63382g;

    /* renamed from: h */
    public String f63383h;

    /* renamed from: i */
    public SubscribeMsgRequestDialogUiData f63384i;

    /* renamed from: j */
    public int f63385j;

    /* renamed from: k */
    public String f63386k;

    /* renamed from: l */
    public String f63387l;

    /* renamed from: m */
    public byte[] f63388m;

    /* renamed from: sd0.b$b */
    public interface C22358b {
        /* renamed from: a */
        void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult);
    }

    /* renamed from: sd0.b$a */
    public static final class C22359a {

        /* renamed from: a */
        public static final C22360a f63389a = new C22360a((C8480h) null);

        /* renamed from: sd0.b$a$a */
        public static final class C22360a {
            public C22360a(C8480h hVar) {
            }

            /* renamed from: d */
            public static /* synthetic */ C22357b m26033d(C22360a aVar, String str, String str2, boolean z, C22358b bVar, List list, int i, byte[] bArr, SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData, String str3, int i2, Object obj) {
                int i3 = i2;
                return aVar.mo35490c(str, str2, z, bVar, list, i, bArr, (i3 & 128) != 0 ? null : subscribeMsgRequestDialogUiData, (i3 & 256) != 0 ? "" : str3);
            }

            /* renamed from: a */
            public final C22357b mo35488a(String str, String str2, String str3, List<String> list, String str4, C22358b bVar) {
                C87412m.m108594g(str, "username");
                C87412m.m108594g(str2, "appId");
                C87412m.m108594g(str3, "subscribeUrl");
                C87412m.m108594g(list, "templateIds");
                C87412m.m108594g(str4, "extInfo");
                C22357b bVar2 = new C22357b(str, str2, 2);
                mo35491e(str4, bVar2);
                bVar2.f63381f = bVar;
                bVar2.f63383h = str3;
                for (String str5 : list) {
                    List<hd4> list2 = bVar2.f63379d;
                    hd4 hd4 = new hd4();
                    hd4.f63914d = str5;
                    ((ArrayList) list2).add(hd4);
                }
                return bVar2;
            }

            /* renamed from: b */
            public final C22357b mo35489b(String str, String str2, List<SubscribeMsgTmpItem> list, String str3, C22358b bVar, boolean z, byte[] bArr, SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData) {
                C87412m.m108594g(str, "username");
                C87412m.m108594g(str2, "appId");
                C87412m.m108594g(list, "templates");
                C87412m.m108594g(str3, "extInfo");
                byte[] bArr2 = bArr;
                C87412m.m108594g(bArr2, "byteArray");
                return mo35490c(str, str2, z, bVar, list, 6, bArr2, subscribeMsgRequestDialogUiData, str3);
            }

            /* renamed from: c */
            public final C22357b mo35490c(String str, String str2, boolean z, C22358b bVar, List<SubscribeMsgTmpItem> list, int i, byte[] bArr, SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData, String str3) {
                C87412m.m108594g(str, "username");
                C22357b bVar2 = new C22357b(str, i);
                bVar2.f63382g = z;
                C87412m.m108594g(str2, "<set-?>");
                bVar2.f63377b = str2;
                bVar2.f63381f = bVar;
                C87412m.m108594g(bArr, "<set-?>");
                bVar2.f63388m = bArr;
                bVar2.f63384i = subscribeMsgRequestDialogUiData;
                mo35491e(str3, bVar2);
                for (SubscribeMsgTmpItem next : list) {
                    List<hd4> list2 = bVar2.f63379d;
                    hd4 hd4 = new hd4();
                    hd4.f63914d = next.f49021f;
                    hd4.f63915e = next.f49022g;
                    hd4.f63921n = next.f49025j;
                    hd4.f63929v = next.f49033u ? 1 : 0;
                    hd4.f63932y = next.f49036x ? 1 : 0;
                    hd4.f63923p = next.f49026n ? 1 : 0;
                    ((ArrayList) list2).add(hd4);
                }
                return bVar2;
            }

            /* renamed from: e */
            public final void mo35491e(String str, C22357b bVar) {
                if (str.length() > 0) {
                    bVar.f63387l = str;
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        bVar.f63385j = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                        String optString = jSONObject.optString("sessionid");
                        C87412m.m108593f(optString, "ext.optString(\"sessionid\")");
                        bVar.f63386k = optString;
                        String optString2 = jSONObject.optString("username");
                        C87412m.m108593f(optString2, "extUsername");
                        if (optString2.length() > 0) {
                            bVar.f63376a = optString2;
                        }
                        Log.m105925i("NetSceneSubscribeMsg", "alvinluo parseExtInfo scene: %s, sessionId: %s, username: %s, extInfo: %s", Integer.valueOf(bVar.f63385j), bVar.f63386k, bVar.f63376a, str);
                    } catch (Exception e) {
                        Log.printErrStackTrace("NetSceneSubscribeMsg", e, "parse extInfo exception", new Object[0]);
                    }
                }
            }
        }
    }

    public C22357b(String str, String str2, int i) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "appId");
        this.f63376a = str;
        this.f63377b = str2;
        this.f63378c = i;
        this.f63379d = new ArrayList();
        this.f63383h = "";
        this.f63386k = "";
        this.f63387l = "";
        this.f63388m = new byte[0];
    }

    /* renamed from: a */
    public void mo17813a(int i, int i2, String str, C16783a aVar) {
        String str2;
        C22357b bVar;
        int i3;
        String str3;
        ShowInfo showInfo;
        boolean z;
        int i4;
        int i5 = i;
        int i6 = i2;
        String str4 = "";
        if (i5 != 0) {
            i3 = i5;
            str2 = str4;
            bVar = this;
        } else if (i6 != 0) {
            str2 = str4;
            int i7 = i5;
            bVar = this;
            i3 = i7;
        } else {
            C16783a.C16786c cVar = this.f63380e;
            C87412m.m108591d(cVar);
            C49335eu3 eu32 = ((C16787b) cVar).f45346c;
            C87412m.m108592e(eu32, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SubscribeMsgResp");
            jd4 jd4 = (jd4) eu32;
            C22358b bVar2 = this.f63381f;
            if (bVar2 != null) {
                String str5 = str == null ? str4 : str;
                ArrayList arrayList = new ArrayList();
                LinkedList<hd4> linkedList = jd4.f63978d;
                C87412m.m108593f(linkedList, "response.InfoList");
                Iterator<T> it = linkedList.iterator();
                while (it.hasNext()) {
                    hd4 hd4 = (hd4) it.next();
                    ArrayList arrayList2 = new ArrayList();
                    LinkedList<C48879bm2> linkedList2 = hd4.f63920j;
                    C87412m.m108593f(linkedList2, "it.KeyWordList");
                    for (C48879bm2 bm22 : linkedList2) {
                        arrayList2.add(new C13604l(bm22.f131204d, bm22.f131205e));
                    }
                    String str6 = hd4.f63919i;
                    String str7 = str6 == null ? str4 : str6;
                    String str8 = hd4.f63914d;
                    String str9 = str8 == null ? str4 : str8;
                    int i8 = hd4.f63915e;
                    int i9 = hd4.f63918h;
                    String str10 = str4;
                    int i15 = hd4.f63921n;
                    Iterator<T> it4 = it;
                    boolean z2 = hd4.f63923p == 1;
                    String str11 = hd4.f63925r;
                    String str12 = str11 == null ? str10 : str11;
                    String str13 = hd4.f63926s;
                    String str14 = str13 == null ? str10 : str13;
                    boolean z3 = hd4.f63924q == 1;
                    int i16 = hd4.f63927t;
                    int i17 = i9;
                    boolean z4 = hd4.f63929v == 1;
                    boolean z5 = hd4.f63928u == 1;
                    String str15 = hd4.f63930w;
                    String str16 = str15 == null ? str10 : str15;
                    boolean z6 = hd4.f63931x == 1;
                    if (hd4.f63932y == 1) {
                        i4 = i17;
                        z = true;
                    } else {
                        i4 = i17;
                        z = false;
                    }
                    arrayList.add(new SubscribeMsgTmpItem(str7, str9, i8, i4, arrayList2, i15, z2, str12, str14, z3, i16, z5, z4, str16, z6, z));
                    str4 = str10;
                    it = it4;
                }
                String str17 = str4;
                boolean z7 = jd4.f63983i == 1;
                String str18 = jd4.f63981g;
                String str19 = str18 == null ? str17 : str18;
                String str20 = jd4.f63980f;
                if (str20 == null) {
                    str20 = str17;
                }
                int i18 = jd4.f63984j;
                boolean z8 = jd4.f63982h == 1;
                boolean z9 = jd4.f63976A == 1;
                md4 md4 = jd4.f63979e;
                String str21 = md4 != null ? md4.f64226d : null;
                String str22 = str21 == null ? str17 : str21;
                String str23 = md4 != null ? md4.f64227e : null;
                String str24 = str23 == null ? str17 : str23;
                String str25 = md4 != null ? md4.f64228f : null;
                String str26 = str25 == null ? str17 : str25;
                String str27 = md4 != null ? md4.f64229g : null;
                String str28 = str27 == null ? str17 : str27;
                String str29 = md4 != null ? md4.f64230h : null;
                String str30 = str29 == null ? str17 : str29;
                String str31 = md4 != null ? md4.f64231i : null;
                String str32 = str31 == null ? str17 : str31;
                String str33 = md4 != null ? md4.f64232j : null;
                String str34 = str33 == null ? str17 : str33;
                String str35 = md4 != null ? md4.f64233n : null;
                String str36 = str35 == null ? str17 : str35;
                String str37 = md4 != null ? md4.f64234o : null;
                String str38 = str37 == null ? str17 : str37;
                String str39 = md4 != null ? md4.f64235p : null;
                String str40 = str39 == null ? str17 : str39;
                String str41 = md4 != null ? md4.f64236q : null;
                WordingInfo wordingInfo = new WordingInfo(str22, str24, str26, str28, str30, str32, str34, str36, str38, str40, str41 == null ? str17 : str41);
                boolean z15 = jd4.f63985n == 1;
                boolean z16 = jd4.f63989r == 1;
                C89349b bVar3 = jd4.f63990s;
                byte[] f = bVar3 != null ? bVar3.mo123703f() : null;
                if (f == null) {
                    f = new byte[0];
                }
                byte[] bArr = f;
                int i19 = jd4.f63996y;
                kd4 kd4 = jd4.f63997z;
                int i25 = kd4 != null ? kd4.f136672d : -1;
                String str42 = kd4 != null ? kd4.f136673e : null;
                if (str42 == null) {
                    str42 = str17;
                }
                String str43 = kd4 != null ? kd4.f136674f : null;
                if (str43 == null) {
                    str43 = str17;
                }
                ShowInfo showInfo2 = new ShowInfo(i25, str42, str43);
                String str44 = jd4.f63994w;
                String str45 = str44 == null ? str17 : str44;
                String str46 = jd4.f63995x;
                String str47 = str46 == null ? str17 : str46;
                int i26 = jd4.f63991t;
                String str48 = jd4.f63992u;
                String str49 = str48 == null ? str17 : str48;
                boolean z17 = jd4.f63993v;
                String str50 = jd4.f63977B;
                if (str50 == null) {
                    showInfo = showInfo2;
                    str3 = str17;
                } else {
                    str3 = str50;
                    showInfo = showInfo2;
                }
                bVar2.mo17818a(i, i6, str5, new SubscribeMsgRequestResult(z7, str19, str20, i18, arrayList, z8, z9, wordingInfo, z15, z16, bArr, i19, showInfo, str45, str47, i26, str49, z17, str3));
                return;
            }
            return;
        }
        C22358b bVar4 = bVar.f63381f;
        if (bVar4 != null) {
            bVar4.mo17818a(i3, i6, str == null ? str2 : str, (SubscribeMsgRequestResult) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r1 != 6) goto L_0x00ce;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35487b(be0.C16783a.C16784a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "dispatcher"
            gy3.C87412m.m108594g(r7, r0)
            int r0 = be0.C16783a.C16786c.f45344a
            te3.id4 r0 = new te3.id4
            r0.<init>()
            te3.jd4 r1 = new te3.jd4
            r1.<init>()
            be0.b r2 = new be0.b
            r3 = 2920(0xb68, float:4.092E-42)
            java.lang.String r4 = "/cgi-bin/mmbiz-bin/bizattr/subscribemsg"
            r2.<init>(r0, r1, r3, r4)
            r6.f63380e = r2
            te3.nt3 r0 = r2.mo17815b()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SubscribeMsgReq"
            gy3.C87412m.m108592e(r0, r1)
            te3.id4 r0 = (te3.id4) r0
            int r1 = r6.f63385j
            r0.f63973r = r1
            java.lang.String r1 = r6.f63386k
            r0.f63974s = r1
            java.lang.String r1 = r6.f63387l
            r0.f63975t = r1
            int r1 = r6.f63378c
            r2 = 6
            r3 = 1
            if (r1 == r3) goto L_0x0068
            r4 = 2
            if (r1 == r4) goto L_0x0046
            r4 = 3
            if (r1 == r4) goto L_0x0046
            r4 = 5
            if (r1 == r4) goto L_0x0046
            if (r1 == r2) goto L_0x0068
            goto L_0x00ce
        L_0x0046:
            java.lang.String r2 = r6.f63376a
            r0.f63962d = r2
            java.lang.String r2 = r6.f63377b
            r0.f63966h = r2
            r0.f63963e = r1
            java.util.LinkedList<te3.hd4> r1 = r0.f63964f
            java.util.List<te3.hd4> r2 = r6.f63379d
            r1.addAll(r2)
            java.lang.String r1 = r6.f63383h
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            if (r3 == 0) goto L_0x00ce
            java.lang.String r1 = r6.f63383h
            r0.f63969n = r1
            goto L_0x00ce
        L_0x0068:
            java.lang.String r4 = r6.f63376a
            r0.f63962d = r4
            java.lang.String r4 = r6.f63377b
            r0.f63966h = r4
            r0.f63963e = r1
            r0.f63967i = r3
            boolean r1 = r6.f63382g
            r0.f63968j = r1
            java.util.LinkedList<te3.hd4> r1 = r0.f63964f
            java.util.List<te3.hd4> r3 = r6.f63379d
            r1.addAll(r3)
            int r1 = r6.f63378c
            if (r1 != r2) goto L_0x00ce
            pe3.b r1 = new pe3.b
            byte[] r2 = r6.f63388m
            r1.<init>(r2)
            r0.f63970o = r1
            te3.sf3 r1 = new te3.sf3
            r1.<init>()
            r0.f63971p = r1
            com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData r2 = r6.f63384i
            if (r2 == 0) goto L_0x00ce
            int r3 = r2.f48994e
            r1.f185420e = r3
            int r3 = r2.f48993d
            r1.f185419d = r3
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData$ItemUiData> r1 = r2.f48995f
            java.util.Iterator r1 = r1.iterator()
        L_0x00a5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ce
            java.lang.Object r2 = r1.next()
            com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData$ItemUiData r2 = (com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData) r2
            te3.sf3 r3 = r0.f63971p
            java.util.LinkedList<te3.ld4> r3 = r3.f185421f
            te3.ld4 r4 = new te3.ld4
            r4.<init>()
            java.lang.String r5 = r2.f48996d
            r4.f184081d = r5
            int r5 = r2.f48997e
            r4.f184082e = r5
            boolean r5 = r2.f48998f
            r4.f184083f = r5
            boolean r2 = r2.f48999g
            r4.f184084g = r2
            r3.add(r4)
            goto L_0x00a5
        L_0x00ce:
            be0.a$c r0 = r6.f63380e
            gy3.C87412m.m108591d(r0)
            int r7 = r7.mo17812a(r0, r6, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sd0.C22357b.mo35487b(be0.a$a):int");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22357b(String str, int i) {
        this(str, "", i);
        C87412m.m108594g(str, "username");
    }
}
