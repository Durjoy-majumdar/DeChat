package p911ml;

import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import p812el.C97670a;
import p833zk.C103048i;
import p911ml.C99914f;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C26236u;
import u61.C101964h;

/* renamed from: ml.m */
public final class C99924m extends C99914f {

    /* renamed from: g */
    public final String f292785g = "MicroMsg.EmojiUploadCheck";

    /* renamed from: ml.m$a */
    public static final class C99925a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C99924m f292786a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f292787b;

        public C99925a(C99924m mVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f292786a = mVar;
            this.f292787b = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002c, code lost:
            r5 = r7.f142064g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r7) {
            /*
                r6 = this;
                ob0.b$c r7 = (ob0.C89132b.C89134c) r7
                int r0 = r7.f256793a
                int r1 = r7.f256794b
                T r7 = r7.f256796d
                te3.ta r7 = (te3.C51365ta) r7
                ml.m r2 = r6.f292786a
                java.lang.String r2 = r2.f292785g
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "requestNext: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ", "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r4 = ", size:"
                r3.append(r4)
                r4 = 0
                if (r7 == 0) goto L_0x0039
                java.util.LinkedList<te3.k70> r5 = r7.f142064g
                if (r5 == 0) goto L_0x0039
                int r5 = r5.size()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x003a
            L_0x0039:
                r5 = r4
            L_0x003a:
                r3.append(r5)
                java.lang.String r5 = ", first:"
                r3.append(r5)
                if (r7 == 0) goto L_0x0052
                java.util.LinkedList<te3.k70> r5 = r7.f142064g
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
                te3.k70 r5 = (te3.C101800k70) r5
                if (r5 == 0) goto L_0x0052
                java.lang.String r4 = r5.f298586d
            L_0x0052:
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                if (r0 != 0) goto L_0x00cc
                if (r1 != 0) goto L_0x00cc
                java.util.LinkedList<te3.k70> r0 = r7.f142064g
                if (r0 == 0) goto L_0x00cc
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x00cc
                java.util.LinkedList<te3.k70> r7 = r7.f142064g
                java.lang.Object r7 = r7.getFirst()
                te3.k70 r7 = (te3.C101800k70) r7
                com.tencent.mm.storage.emotion.EmojiInfo r0 = new com.tencent.mm.storage.emotion.EmojiInfo
                r0.<init>()
                u61.C101964h.m134219a(r7, r0)
                com.tencent.mm.storage.w2 r7 = com.tencent.p014mm.storage.C30790w2.m39221h()
                wh3.g r7 = r7.mo57717d()
                ml.m r1 = r6.f292786a
                com.tencent.mm.storage.emotion.EmojiInfo r1 = r1.f292771a
                java.lang.String r1 = r1.getMd5()
                com.tencent.mm.storage.emotion.EmojiInfo r7 = r7.mo142044TO(r1)
                if (r7 == 0) goto L_0x00a0
                u61.C101964h.m134234p(r0, r7)
                com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
                wh3.g r1 = r1.mo57717d()
                r1.r50(r7)
            L_0x00a0:
                boolean r7 = p833zk.C103048i.m136280b(r0)
                if (r7 != 0) goto L_0x00b4
                boolean r7 = p833zk.C103048i.m136279a(r0)
                if (r7 != 0) goto L_0x00b4
                java.lang.String r7 = r0.field_cdnUrl
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x00cc
            L_0x00b4:
                ml.m r7 = r6.f292786a
                java.lang.String r7 = r7.f292785g
                java.lang.String r1 = "get download info from cgi"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
                ml.m r7 = r6.f292786a
                com.tencent.mm.storage.emotion.EmojiInfo r7 = r7.f292771a
                u61.C101964h.m134234p(r0, r7)
                fy3.l<java.lang.Boolean, rx3.b0> r7 = r6.f292787b
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r7.invoke(r0)
                goto L_0x00d3
            L_0x00cc:
                fy3.l<java.lang.Boolean, rx3.b0> r7 = r6.f292787b
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r7.invoke(r0)
            L_0x00d3:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p911ml.C99924m.C99925a.call(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99924m(EmojiInfo emojiInfo, C99914f.C99915a aVar) {
        super(emojiInfo, false, aVar);
        C87412m.m108594g(emojiInfo, "emojiInfo");
        if (C103048i.m136280b(emojiInfo) || C103048i.m136279a(this.f292771a)) {
            mo139265a(0, (String) null);
            return;
        }
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(this.f292771a.getMd5());
        if (C103048i.m136280b(TO) || C103048i.m136279a(TO)) {
            C101964h.m134234p(TO, this.f292771a);
            mo139265a(0, (String) null);
            return;
        }
        mo139267c(new C99923l(this));
    }

    /* renamed from: c */
    public final void mo139267c(C32226l<? super Boolean, C13598b0> lVar) {
        new C97670a(1, 0, C26236u.m33719b(this.f292771a.getMd5()), (C89349b) null, (C89349b) null, 24, (C8480h) null).mo9225i().mo123420E(new C99925a(this, lVar));
    }
}
