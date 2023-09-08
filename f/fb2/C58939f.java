package fb2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.p081mv.jump.MusicPullDownView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32226l;
import go3.C59600d;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60200t1;
import ht1.C98521u5;
import java.util.Map;
import je1.C46547x1;
import o40.C61926c;
import ob0.C89132b;
import p158gt.C76057w;
import pe3.C89349b;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qy2.C36206l;
import qy2.C77455o;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C64488kb1;
import te3.C64719t23;
import up1.C27696y;
import up1.C65426w0;
import uz2.C65488a0;
import uz2.C65490m;
import vp1.C65834e;
import vp3.C65849b;
import z04.C112551y;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: fb2.f */
public final class C58939f implements C36206l {

    /* renamed from: e */
    public static int f168643e;

    /* renamed from: d */
    public final C58936c f168644d = new C58936c();

    /* renamed from: fb2.f$a */
    public static final class C58940a extends C77455o {

        /* renamed from: d */
        public C64488kb1 f168645d;

        /* renamed from: e */
        public C64719t23 f168646e;

        /* renamed from: f */
        public String f168647f;

        /* renamed from: g */
        public final /* synthetic */ C58939f f168648g;

        /* renamed from: fb2.f$a$a */
        public static final class C58941a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C58940a f168649a;

            /* renamed from: b */
            public final /* synthetic */ FrameLayout f168650b;

            public C58941a(C58940a aVar, FrameLayout frameLayout) {
                this.f168649a = aVar;
                this.f168650b = frameLayout;
            }

            public Object call(Object obj) {
                FinderObject finderObject;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                int i = cVar.f256793a;
                if (((i == 0 && cVar.f256794b == 0) || C58739j4.f168176a.mo83681J(i, cVar.f256794b)) && (finderObject = ((C50008jm0) cVar.f256796d).f136184e) != null) {
                    C58940a aVar = this.f168649a;
                    FrameLayout frameLayout = this.f168650b;
                    FinderItem a = FinderItem.Companion.mo79056a(finderObject, 1);
                    C65834e.f189316a.mo89878l(a, C65834e.C65836b.f189330j);
                    aVar.f168647f = a.getUserName();
                    FinderContact finderContact = a.getFeedObject().contact;
                    ((C119157j) C119157j.f356862d).mo183895z(new C58938e(aVar, frameLayout, finderContact != null ? finderContact.headUrl : null));
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: fb2.f$a$b */
        public static final class C58942b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f168651d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f168652e;

            /* renamed from: fb2.f$a$b$a */
            public static final class C58943a implements C76057w.C76058a {

                /* renamed from: a */
                public final /* synthetic */ ImageView f168653a;

                /* renamed from: fb2.f$a$b$a$a */
                public static final class C58944a extends C87413o implements C32226l<Bitmap, C13598b0> {

                    /* renamed from: d */
                    public final /* synthetic */ ImageView f168654d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C58944a(ImageView imageView) {
                        super(1);
                        this.f168654d = imageView;
                    }

                    public Object invoke(Object obj) {
                        this.f168654d.setImageBitmap((Bitmap) obj);
                        return C13598b0.f38549a;
                    }
                }

                public C58943a(ImageView imageView) {
                    this.f168653a = imageView;
                }

                /* renamed from: a */
                public final void mo25933a(String str, Bitmap bitmap, String str2) {
                    if (bitmap != null) {
                        C65849b bVar = new C65849b();
                        bVar.mo89891b(bitmap);
                        int width = this.f168653a.getWidth();
                        int height = this.f168653a.getHeight();
                        bVar.f189363b = width;
                        bVar.f189364c = height;
                        bVar.f189366e.f334033b.mo154924d();
                        bVar.mo89890a(new C58944a(this.f168653a));
                    }
                }
            }

            public C58942b(String str, ImageView imageView) {
                this.f168651d = str;
                this.f168652e = imageView;
            }

            public final void run() {
                ((C76057w) C86312j.m106911c(C76057w.class)).h60(this.f168651d, new C58943a(this.f168652e));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58940a(String str, C58939f fVar) {
            super(str);
            this.f168648g = fVar;
        }

        /* renamed from: b */
        public boolean mo84141b(Context context) {
            Class cls = C60200t1.class;
            C87412m.m108594g(context, "context");
            String str = this.f168647f;
            if (str == null || C112551y.m153811k(str)) {
                return false;
            }
            Intent intent = new Intent();
            boolean b = C87412m.m108589b(this.f168647f, C66785b.f191882e.mo90662O5());
            intent.putExtra("finder_username", this.f168647f);
            if (b) {
                ((C60200t1) C86312j.m106911c(cls)).mo76836bn(context, intent, 20, 2);
            } else {
                ((C60200t1) C86312j.m106911c(cls)).mo76842e7(20, 2, 32, intent);
                ((C60200t1) C86312j.m106911c(cls)).mo76819V1(context, intent);
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
            if (r13 == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
            if (r3 == null) goto L_0x0092;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0089 A[Catch:{ Exception -> 0x017a }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[Catch:{ Exception -> 0x017a }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x009e A[Catch:{ Exception -> 0x017a }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9 A[Catch:{ Exception -> 0x017a }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[Catch:{ Exception -> 0x017a }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3 A[Catch:{ Exception -> 0x017a }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x012a A[Catch:{ Exception -> 0x017a }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0140 A[Catch:{ Exception -> 0x017a }] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo84142d(android.content.Context r12, android.os.Bundle r13) {
            /*
                r11 = this;
                java.lang.String r13 = "context"
                gy3.C87412m.m108594g(r12, r13)
                fb2.f r13 = r11.f168648g
                fb2.c r13 = r13.f168644d
                java.lang.String r0 = r11.f225887c
                uz2.a0 r1 = r11.f225886b
                r13.getClass()
                java.lang.String r13 = ".MusicVideoStatusOpenParams"
                java.lang.String r2 = "MusicPlayerJumper"
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x0195
                java.lang.String r5 = r1.f188439d
                java.lang.String r6 = "1"
                boolean r5 = gy3.C87412m.m108589b(r5, r6)
                if (r5 == 0) goto L_0x0195
                boolean r12 = p182kk.C61104a.m71669y(r12)
                if (r12 == 0) goto L_0x002a
                goto L_0x0196
            L_0x002a:
                java.lang.String r12 = r1.f188441f
                r5 = 0
                java.lang.String r6 = "MusicVideoStatusOpenParams"
                java.util.Map r12 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r12, r6, r5)
                if (r12 == 0) goto L_0x0194
                te3.kb1 r6 = new te3.kb1     // Catch:{ Exception -> 0x017a }
                r6.<init>()     // Catch:{ Exception -> 0x017a }
                fb2.C58937d.m68814a(r6, r13, r12)     // Catch:{ Exception -> 0x017a }
                te3.t23 r12 = ht1.C98521u5.m127974b(r13, r12)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "alvinluo jumpToMv ext: %s, %s, identification: %s, %s, xml: %s"
                r7 = 5
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x017a }
                java.lang.String r8 = r6.f183916s     // Catch:{ Exception -> 0x017a }
                r7[r3] = r8     // Catch:{ Exception -> 0x017a }
                java.lang.String r8 = r12.f185465j     // Catch:{ Exception -> 0x017a }
                r7[r4] = r8     // Catch:{ Exception -> 0x017a }
                r8 = 2
                java.lang.String r9 = r6.f183917t     // Catch:{ Exception -> 0x017a }
                r7[r8] = r9     // Catch:{ Exception -> 0x017a }
                r8 = 3
                java.lang.String r9 = r12.f185468p     // Catch:{ Exception -> 0x017a }
                r7[r8] = r9     // Catch:{ Exception -> 0x017a }
                r8 = 4
                java.lang.String r1 = r1.f188441f     // Catch:{ Exception -> 0x017a }
                r7[r8] = r1     // Catch:{ Exception -> 0x017a }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = r12.f185461f     // Catch:{ Exception -> 0x017a }
                if (r13 == 0) goto L_0x006d
                int r13 = r13.length()     // Catch:{ Exception -> 0x017a }
                if (r13 != 0) goto L_0x006b
                goto L_0x006d
            L_0x006b:
                r13 = 0
                goto L_0x006e
            L_0x006d:
                r13 = 1
            L_0x006e:
                java.lang.String r1 = ""
                if (r13 != 0) goto L_0x0077
                java.lang.String r13 = r12.f185461f     // Catch:{ Exception -> 0x017a }
                if (r13 != 0) goto L_0x007c
                goto L_0x007b
            L_0x0077:
                java.lang.String r13 = r6.f183912o     // Catch:{ Exception -> 0x017a }
                if (r13 != 0) goto L_0x007c
            L_0x007b:
                r13 = r1
            L_0x007c:
                java.lang.String r7 = r12.f185465j     // Catch:{ Exception -> 0x017a }
                if (r7 == 0) goto L_0x0086
                int r7 = r7.length()     // Catch:{ Exception -> 0x017a }
                if (r7 != 0) goto L_0x0087
            L_0x0086:
                r3 = 1
            L_0x0087:
                if (r3 != 0) goto L_0x008e
                java.lang.String r3 = r12.f185465j     // Catch:{ Exception -> 0x017a }
                if (r3 != 0) goto L_0x0093
                goto L_0x0092
            L_0x008e:
                java.lang.String r3 = r6.f183916s     // Catch:{ Exception -> 0x017a }
                if (r3 != 0) goto L_0x0093
            L_0x0092:
                r3 = r1
            L_0x0093:
                r6.f183916s = r3     // Catch:{ Exception -> 0x017a }
                qc0.C101093a.m132490l()     // Catch:{ Exception -> 0x017a }
                up1.e0 r3 = up1.C65415e0.f188260a     // Catch:{ Exception -> 0x017a }
                java.lang.String r7 = r6.f183909i     // Catch:{ Exception -> 0x017a }
                if (r7 != 0) goto L_0x00a6
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017a }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x017a }
            L_0x00a6:
                java.lang.String r8 = "finderMVSongInfo.songId …ntTimeMillis().toString()"
                gy3.C87412m.m108593f(r7, r8)     // Catch:{ Exception -> 0x017a }
                r8 = 14
                r3.mo89506d(r6, r7, r8, r13)     // Catch:{ Exception -> 0x017a }
                android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x017a }
                r3.<init>()     // Catch:{ Exception -> 0x017a }
                java.lang.String r7 = r12.f185459d     // Catch:{ Exception -> 0x017a }
                if (r7 != 0) goto L_0x00ba
                r7 = r1
            L_0x00ba:
                java.lang.String r8 = r12.f185460e     // Catch:{ Exception -> 0x017a }
                if (r8 != 0) goto L_0x00bf
                r8 = r1
            L_0x00bf:
                java.lang.String r9 = r12.f185462g     // Catch:{ Exception -> 0x017a }
                if (r9 != 0) goto L_0x00c4
                r9 = r1
            L_0x00c4:
                java.lang.String r12 = r12.f185470r     // Catch:{ Exception -> 0x017a }
                java.lang.String r10 = "key_mv_feed_id"
                r3.putExtra(r10, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r7 = "key_mv_nonce_id"
                r3.putExtra(r7, r8)     // Catch:{ Exception -> 0x017a }
                java.lang.String r7 = "key_mv_cover_url"
                r3.putExtra(r7, r13)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_poster"
                r3.putExtra(r13, r9)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_song_name"
                java.lang.String r7 = r6.f183904d     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_song_lyric"
                java.lang.String r7 = r6.f183910j     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_singer_name"
                java.lang.String r7 = r6.f183905e     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_album_name"
                java.lang.String r7 = r6.f183911n     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_music_genre"
                java.lang.String r7 = r6.f183913p     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_issue_date"
                long r7 = r6.f183915r     // Catch:{ Exception -> 0x017a }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_album_cover_url"
                java.lang.String r7 = r6.f183912o     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_identification"
                java.lang.String r7 = r6.f183917t     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_extra_info"
                java.lang.String r7 = r6.f183916s     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_music_duration"
                int r7 = r6.f183918u     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r7)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_music_operation_url"
                te3.lb1 r7 = r6.f183921x     // Catch:{ Exception -> 0x017a }
                if (r7 == 0) goto L_0x0130
                java.lang.String r7 = r7.f184069d     // Catch:{ Exception -> 0x017a }
                if (r7 != 0) goto L_0x012f
                goto L_0x0130
            L_0x012f:
                r1 = r7
            L_0x0130:
                r3.putExtra(r13, r1)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_need_update_music_ball_url"
                r3.putExtra(r13, r4)     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_song_mid"
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x017a }
                if (r1 == 0) goto L_0x0142
                java.lang.String r12 = r6.f183922y     // Catch:{ Exception -> 0x017a }
            L_0x0142:
                r3.putExtra(r13, r12)     // Catch:{ Exception -> 0x017a }
                te3.w23 r12 = new te3.w23     // Catch:{ Exception -> 0x017a }
                r12.<init>()     // Catch:{ Exception -> 0x017a }
                java.util.UUID r13 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x017a }
                java.lang.String r1 = "randomUUID().toString()"
                gy3.C87412m.m108593f(r13, r1)     // Catch:{ Exception -> 0x017a }
                r12.f186034e = r13     // Catch:{ Exception -> 0x017a }
                r12.f186036g = r0     // Catch:{ Exception -> 0x017a }
                r13 = 6
                r12.f186033d = r13     // Catch:{ Exception -> 0x017a }
                java.lang.String r13 = "key_mv_report_data"
                byte[] r12 = r12.toByteArray()     // Catch:{ Exception -> 0x017a }
                r3.putExtra(r13, r12)     // Catch:{ Exception -> 0x017a }
                r12 = 268435456(0x10000000, float:2.5243549E-29)
                r3.setFlags(r12)     // Catch:{ Exception -> 0x017a }
                java.lang.String r12 = "mv"
                java.lang.String r13 = ".ui.MusicMvMainUI"
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x017a }
                ke3.C88144b.m109791i(r0, r12, r13, r3, r5)     // Catch:{ Exception -> 0x017a }
                goto L_0x0194
            L_0x017a:
                r12 = move-exception
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "process StatusJumpInfo fail:"
                r13.append(r0)
                java.lang.String r12 = r12.getLocalizedMessage()
                r13.append(r12)
                java.lang.String r12 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r12)
            L_0x0194:
                r3 = 1
            L_0x0195:
                r4 = r3
            L_0x0196:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: fb2.C58939f.C58940a.mo84142d(android.content.Context, android.os.Bundle):boolean");
        }

        /* renamed from: f */
        public CharSequence mo84143f() {
            C64719t23 t232 = this.f168646e;
            String str = t232 != null ? t232.f185462g : null;
            return str == null ? "" : str;
        }

        /* renamed from: h */
        public String mo84144h() {
            String str;
            StringBuilder sb = new StringBuilder();
            C64488kb1 kb12 = this.f168645d;
            if (kb12 == null || (str = kb12.f183909i) == null) {
                str = "";
            }
            sb.append(str);
            sb.append('|');
            C64719t23 t232 = this.f168646e;
            sb.append(t232 != null ? t232.f185459d : null);
            return sb.toString();
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ CharSequence mo84145i() {
            return "";
        }

        /* renamed from: j */
        public boolean mo84146j() {
            return true;
        }

        /* renamed from: m */
        public void mo84147m(String str, C65488a0 a0Var) {
            String str2;
            this.f225886b = a0Var;
            this.f225887c = str;
            this.f168647f = null;
            if (a0Var != null) {
                try {
                    str2 = a0Var.f188441f;
                } catch (Throwable unused) {
                    return;
                }
            } else {
                str2 = null;
            }
            Map<String, String> parseXml = XmlParser.parseXml(str2, "MusicVideoStatusOpenParams", (String) null);
            if (parseXml != null) {
                C64488kb1 kb12 = new C64488kb1();
                C58937d.m68814a(kb12, ".MusicVideoStatusOpenParams", parseXml);
                this.f168645d = kb12;
                this.f168646e = C98521u5.m127974b(".MusicVideoStatusOpenParams", parseXml);
            }
        }

        /* renamed from: n */
        public void mo84148n() {
        }

        /* renamed from: o */
        public boolean mo84149o(FrameLayout frameLayout) {
            FrameLayout frameLayout2 = frameLayout;
            C87412m.m108594g(frameLayout2, "container");
            C64719t23 t232 = this.f168646e;
            if (t232 == null) {
                return false;
            }
            long P = C61926c.m72671P(t232.f185459d);
            String str = t232.f185460e;
            FinderItem e = C65834e.f189316a.mo89871e(P);
            if (e != null) {
                FinderContact finderContact = e.getFeedObject().contact;
                String str2 = finderContact != null ? finderContact.headUrl : null;
                this.f168647f = e.getUserName();
                mo84151r(frameLayout2, str2);
                return true;
            }
            new C46547x1(P, str, 43, 1, C66785b.f191882e.mo90662O5(), true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, (C49712hj1) null, 0, (C49946j51) null, false, 122816, (C8480h) null).mo9225i().mo123064p(new C58941a(this, frameLayout2));
            return true;
        }

        /* renamed from: q */
        public boolean mo84150q(FrameLayout frameLayout) {
            C87412m.m108594g(frameLayout, "container");
            C64488kb1 kb12 = this.f168645d;
            String str = kb12 != null ? kb12.f183912o : null;
            if (!(str == null || C112551y.m153811k(str))) {
                ImageView imageView = (ImageView) frameLayout.findViewWithTag("Finder.TextStatusProvider");
                if (imageView == null) {
                    imageView = new ImageView(frameLayout.getContext());
                    imageView.setTag("Finder.TextStatusProvider");
                    frameLayout.removeAllViews();
                    frameLayout.addView(imageView);
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.post(new C58942b(str, imageView));
            }
            return true;
        }

        /* renamed from: r */
        public final void mo84151r(FrameLayout frameLayout, String str) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            ImageView imageView = (ImageView) frameLayout.findViewWithTag("Finder.TextStatusProvider");
            if (imageView == null) {
                imageView = new ImageView(frameLayout.getContext());
            }
            frameLayout.removeAllViews();
            frameLayout.addView(imageView);
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(str, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        }
    }

    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "container");
        C87412m.m108594g(mVar, "pullDownParam");
        int i = mVar.f188446e;
        if (i == 0) {
            return null;
        }
        boolean z = true;
        if (!(i == 1 || i == 3)) {
            z = false;
        }
        if (z) {
            return new MusicPullDownView(str, frameLayout, a0Var, mVar, f168643e);
        } else if (i != 2) {
            return null;
        } else {
            return new C58935b(str, frameLayout, a0Var, mVar, f168643e);
        }
    }

    public C77455o l30(String str) {
        return new C58940a(str, this);
    }

    public void release() {
    }
}
