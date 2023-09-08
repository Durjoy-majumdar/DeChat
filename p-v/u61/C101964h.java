package u61;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.smiley.C96932e0;
import com.tencent.p014mm.smiley.C96945j0;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C96985s2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import lc3.C10485b;
import ob0.C89132b;
import p207nl.C89008j;
import p490dl.C97489o;
import p490dl.C97491p;
import p595ll.C61303b;
import te3.C101800k70;
import te3.C52081y8;

/* renamed from: u61.h */
public class C101964h {

    /* renamed from: a */
    public static final ArrayList<String> f300169a;

    /* renamed from: u61.h$a */
    public class C101965a implements C87581a<Object, C89132b.C89134c<C52081y8>> {

        /* renamed from: a */
        public final /* synthetic */ EmojiInfo f300170a;

        /* renamed from: b */
        public final /* synthetic */ EmojiInfo f300171b;

        public C101965a(EmojiInfo emojiInfo, EmojiInfo emojiInfo2) {
            this.f300170a = emojiInfo;
            this.f300171b = emojiInfo2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.EmojiUtils", "gameToCustom: %s, %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a != 0 || cVar.f256794b != 0) {
                return null;
            }
            this.f300170a.field_catalog = 81;
            this.f300171b.field_catalog = 81;
            int nP = C30790w2.m39221h().mo57717d().mo142062nP();
            this.f300170a.field_reserved3 = nP + 1;
            this.f300171b.field_reserved3 = nP + 2;
            C30790w2.m39221h().mo57717d().X90(this.f300170a);
            C30790w2.m39221h().mo57717d().r50(this.f300171b);
            C97491p pVar = C97491p.f286143a;
            pVar.mo136773a(false);
            pVar.mo136774c().putBoolean("game_to_custom", true);
            return null;
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f300169a = arrayList;
        arrayList.add("9bd1281af3a31710a45b84d736363691");
        arrayList.add("08f223fa83f1ca34e143d1e580252c7c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0136 A[Catch:{ IOException -> 0x0148 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m134219a(te3.C101800k70 r13, com.tencent.p014mm.storage.emotion.EmojiInfo r14) {
        /*
            java.lang.String r0 = r14.field_md5
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = r14.field_md5
            java.lang.String r1 = r13.f298586d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.String r0 = r13.f298586d
            java.lang.String r1 = r14.field_md5
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_md5 = r0
            java.lang.String r0 = r13.f298587e
            java.lang.String r1 = r14.field_cdnUrl
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_cdnUrl = r0
            java.lang.String r0 = r13.f298588f
            java.lang.String r1 = r14.field_thumbUrl
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_thumbUrl = r0
            java.lang.String r0 = r13.f298589g
            java.lang.String r1 = r14.field_designerID
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_designerID = r0
            java.lang.String r0 = r13.f298590h
            java.lang.String r1 = r14.field_encrypturl
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_encrypturl = r0
            java.lang.String r0 = r13.f298591i
            java.lang.String r1 = r14.field_aeskey
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_aeskey = r0
            java.lang.String r0 = r13.f298592j
            java.lang.String r1 = r14.field_groupId
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_groupId = r0
            java.lang.String r0 = r13.f298593n
            java.lang.String r1 = r14.field_externUrl
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_externUrl = r0
            java.lang.String r0 = r13.f298594o
            java.lang.String r1 = r14.field_externMd5
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_externMd5 = r0
            java.lang.String r0 = r13.f298595p
            java.lang.String r1 = r14.field_activityid
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_activityid = r0
            java.lang.String r0 = r13.f298596q
            java.lang.String r1 = r14.field_attachedText
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_attachedText = r0
            java.lang.String r0 = r13.f298597r
            java.lang.String r1 = r14.field_attachTextColor
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_attachTextColor = r0
            java.lang.String r0 = r13.f298598s
            java.lang.String r1 = r14.field_lensId
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_lensId = r0
            java.lang.String r0 = r13.f298600u
            java.lang.String r1 = r14.field_linkId
            java.lang.String r0 = m134221c(r0, r1)
            r14.field_linkId = r0
            com.tencent.mm.storage.t2 r0 = com.tencent.p014mm.storage.C30777t2.f82756d
            boolean r0 = r0.vx0()
            r1 = 0
            if (r0 == 0) goto L_0x00aa
            goto L_0x0148
        L_0x00aa:
            java.lang.String r0 = r13.f298599t
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00b9
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r0 = 0
            goto L_0x00ba
        L_0x00b9:
            r0 = 1
        L_0x00ba:
            java.lang.String r4 = "EmojiInfo"
            if (r0 == 0) goto L_0x00d6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "null meanings, md5="
            r0.append(r2)
            java.lang.String r13 = r13.f298586d
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r13)
            goto L_0x0148
        L_0x00d6:
            java.lang.String r0 = r13.f298599t
            r5 = 2
            byte[] r0 = android.util.Base64.decode(r0, r5)
            java.lang.String r5 = "decode(EmojiAttr, Base64.NO_WRAP)"
            gy3.C87412m.m108593f(r0, r5)
            te3.j70 r5 = new te3.j70
            r5.<init>()
            r5.parseFrom(r0)     // Catch:{ IOException -> 0x0148 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0148 }
            r0.<init>()     // Catch:{ IOException -> 0x0148 }
            java.lang.String r6 = "handle Md5="
            r0.append(r6)     // Catch:{ IOException -> 0x0148 }
            java.lang.String r13 = r13.f298586d     // Catch:{ IOException -> 0x0148 }
            r0.append(r13)     // Catch:{ IOException -> 0x0148 }
            java.lang.String r13 = ", attr: "
            r0.append(r13)     // Catch:{ IOException -> 0x0148 }
            java.util.LinkedList<java.lang.String> r13 = r5.f135909d     // Catch:{ IOException -> 0x0148 }
            r0.append(r13)     // Catch:{ IOException -> 0x0148 }
            java.lang.String r13 = r0.toString()     // Catch:{ IOException -> 0x0148 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)     // Catch:{ IOException -> 0x0148 }
            java.util.LinkedList<java.lang.String> r13 = r5.f135909d     // Catch:{ IOException -> 0x0148 }
            java.lang.String r0 = "attr.meaning"
            gy3.C87412m.m108593f(r13, r0)     // Catch:{ IOException -> 0x0148 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0148 }
            r4.<init>()     // Catch:{ IOException -> 0x0148 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ IOException -> 0x0148 }
        L_0x011a:
            boolean r0 = r13.hasNext()     // Catch:{ IOException -> 0x0148 }
            if (r0 == 0) goto L_0x013a
            java.lang.Object r0 = r13.next()     // Catch:{ IOException -> 0x0148 }
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0148 }
            if (r5 == 0) goto L_0x0132
            int r5 = r5.length()     // Catch:{ IOException -> 0x0148 }
            if (r5 != 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r5 = 0
            goto L_0x0133
        L_0x0132:
            r5 = 1
        L_0x0133:
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x011a
            r4.add(r0)     // Catch:{ IOException -> 0x0148 }
            goto L_0x011a
        L_0x013a:
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            java.lang.String r1 = sx3.C110818d0.m150921S(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0148 }
        L_0x0148:
            r14.field_meanings = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u61.C101964h.m134219a(te3.k70, com.tencent.mm.storage.emotion.EmojiInfo):void");
    }

    /* renamed from: b */
    public static void m134220b(C96985s2 s2Var, EmojiInfo emojiInfo) {
        emojiInfo.field_md5 = m134221c(s2Var.f284163d, emojiInfo.field_md5);
        emojiInfo.field_svrid = m134221c(s2Var.f284162c, emojiInfo.field_svrid);
        emojiInfo.field_type = s2Var.f284164e;
        emojiInfo.field_size = s2Var.f284165f;
        emojiInfo.field_groupId = m134221c(s2Var.f284168i, emojiInfo.field_groupId);
        emojiInfo.field_designerID = m134221c(s2Var.f284173n, emojiInfo.field_designerID);
        emojiInfo.field_thumbUrl = m134221c(s2Var.f284174o, emojiInfo.field_thumbUrl);
        emojiInfo.field_width = s2Var.f284183x;
        emojiInfo.field_height = s2Var.f284184y;
        emojiInfo.field_activityid = m134221c(s2Var.f284154B, emojiInfo.field_activityid);
        emojiInfo.field_tpurl = m134221c(s2Var.f284185z, emojiInfo.field_tpurl);
        emojiInfo.field_tpauthkey = m134221c(s2Var.f284153A, emojiInfo.field_tpauthkey);
        boolean z = !Util.isNullOrNil(s2Var.f284177r) || !Util.isNullOrNil(s2Var.f284175p) || !Util.isNullOrNil(s2Var.f284172m);
        if (!(!Util.isNullOrNil(s2Var.f284185z))) {
            if (!Util.isNullOrNil(emojiInfo.field_externUrl) && Util.isNullOrNil(s2Var.f284177r)) {
                Log.m105925i("MicroMsg.EmojiUtils", "%s, wxam url delete, origin: %s", emojiInfo.getMd5(), emojiInfo.field_externUrl);
                if (C86013q1.m106450k(emojiInfo.mo62640K1()) && ImgUtil.isWXGF(emojiInfo.mo62640K1())) {
                    emojiInfo.mo62645S0();
                    C86013q1.m106447h(emojiInfo.getCoverPath());
                }
            }
            emojiInfo.field_cdnUrl = s2Var.f284172m;
            emojiInfo.field_encrypturl = s2Var.f284175p;
            emojiInfo.field_externUrl = s2Var.f284177r;
            emojiInfo.field_externMd5 = s2Var.f284178s;
            emojiInfo.field_aeskey = s2Var.f284176q;
        } else if (!z) {
            emojiInfo.field_aeskey = s2Var.f284176q;
        }
        emojiInfo.field_attachedText = m134221c(s2Var.f284156D, emojiInfo.field_attachedText);
        emojiInfo.field_lensId = m134221c(s2Var.f284157E, emojiInfo.field_lensId);
        emojiInfo.field_attachTextColor = m134221c(s2Var.f284158F, emojiInfo.field_attachTextColor);
        emojiInfo.field_linkId = m134221c(s2Var.f284155C, emojiInfo.field_linkId);
    }

    /* renamed from: c */
    public static String m134221c(String str, String str2) {
        return Util.isNullOrNil(str) ? str2 == null ? "" : str2 : str;
    }

    /* renamed from: d */
    public static String m134222d(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < str.length(); i++) {
            C96932e0 e = C96945j0.m124519b().mo135533e(str, i);
            if (e != null) {
                linkedList.add(e);
            }
        }
        if (linkedList.size() == 1) {
            return ((C96932e0) linkedList.get(0)).f283966b;
        }
        return null;
    }

    /* renamed from: e */
    public static void m134223e() {
        C97491p pVar = C97491p.f286143a;
        pVar.mo136773a(false);
        if (pVar.mo136774c().getBoolean("game_to_custom", false)) {
            Log.m105924i("MicroMsg.EmojiUtils", "gameToCustom: done");
            return;
        }
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO("9bd1281af3a31710a45b84d736363691");
        EmojiInfo TO2 = C30790w2.m39221h().mo57717d().mo142044TO("08f223fa83f1ca34e143d1e580252c7c");
        if (TO == null || TO2 == null) {
            Log.m105924i("MicroMsg.EmojiUtils", "gameToCustom: no game emoji!");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("9bd1281af3a31710a45b84d736363691");
        arrayList.add("08f223fa83f1ca34e143d1e580252c7c");
        new C61303b(0, 1, arrayList).mo9225i().mo123420E(new C101965a(TO, TO2));
    }

    /* renamed from: f */
    public static String m134224f() {
        return C89008j.f256613a.mo123385d();
    }

    /* renamed from: g */
    public static int m134225g(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b = bArr[1];
            if (b == 80 && bArr[2] == 78 && bArr[3] == 71) {
                return 1;
            }
            if (bArr[0] == 71 && b == 73 && bArr[2] == 70) {
                return 2;
            }
            return (bArr[6] == 74 && bArr[7] == 70 && bArr[8] == 73 && bArr[9] == 70) ? 3 : -1;
        }
    }

    /* renamed from: h */
    public static EmojiInfo m134226h(C101800k70 k702) {
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(k702.f298586d);
        if (TO != null) {
            return TO;
        }
        EmojiInfo emojiInfo = new EmojiInfo();
        emojiInfo.field_catalog = 84;
        emojiInfo.field_reserved4 |= 1;
        String str = k702.f298601v;
        m134219a(k702, emojiInfo);
        emojiInfo.f284129U1 = str;
        return emojiInfo;
    }

    /* renamed from: i */
    public static boolean m134227i(IEmojiInfo iEmojiInfo) {
        int group = iEmojiInfo.getGroup();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
        if (group == 81) {
            return true;
        }
        Iterator<EmojiInfo> it = C97489o.m125592g().mo136760a().iterator();
        while (it.hasNext()) {
            if (Util.isEqual(it.next().field_md5, iEmojiInfo.mo62676i0())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m134228j(IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo == null) {
            return false;
        }
        String md5 = iEmojiInfo.getMd5();
        if (Util.isNullOrNil(md5)) {
            return false;
        }
        return Util.isEqual(md5, "9bd1281af3a31710a45b84d736363691") || Util.isEqual(md5, "08f223fa83f1ca34e143d1e580252c7c");
    }

    /* renamed from: k */
    public static boolean m134229k(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return f300169a.contains(str);
    }

    /* renamed from: l */
    public static String m134230l(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C96932e0 e = C96945j0.m124519b().mo135533e(str, 0);
        if (e != null && Util.isEqual(e.f283967c, str)) {
            return e.f283966b;
        }
        if (C96926b0.m124490b().mo135517a(str)) {
            return str;
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m134231m(IEmojiInfo iEmojiInfo) {
        return iEmojiInfo != null && m134232n(iEmojiInfo.getGroupId());
    }

    /* renamed from: n */
    public static boolean m134232n(String str) {
        return !Util.isNullOrNil(str) && !Util.isEqual(str, "capture") && !Util.isEqual(str, "17");
    }

    /* renamed from: o */
    public static boolean m134233o(EmojiInfo emojiInfo) {
        String str;
        if (emojiInfo == null) {
            return false;
        }
        if (!(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ForbiddenEmotionSpringFestivalMsgTail", 0) <= 0)) {
            return false;
        }
        return Util.isEqual(emojiInfo.getGroupId(), "capture") || ((str = emojiInfo.field_activityid) != null && str.startsWith("Selfie"));
    }

    /* renamed from: p */
    public static void m134234p(EmojiInfo emojiInfo, EmojiInfo emojiInfo2) {
        emojiInfo2.field_cdnUrl = emojiInfo.field_cdnUrl;
        emojiInfo2.field_thumbUrl = emojiInfo.field_thumbUrl;
        emojiInfo2.field_designerID = emojiInfo.field_designerID;
        emojiInfo2.field_encrypturl = emojiInfo.field_encrypturl;
        emojiInfo2.field_aeskey = emojiInfo.field_aeskey;
        emojiInfo2.field_groupId = emojiInfo.field_groupId;
        emojiInfo2.field_externUrl = emojiInfo.field_externUrl;
        emojiInfo2.field_externMd5 = emojiInfo.field_externMd5;
        emojiInfo2.field_activityid = emojiInfo.field_activityid;
        emojiInfo2.field_attachedText = emojiInfo.field_attachedText;
        emojiInfo2.field_attachTextColor = emojiInfo.field_attachTextColor;
        emojiInfo2.field_lensId = emojiInfo.field_lensId;
    }
}
