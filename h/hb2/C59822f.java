package hb2;

import android.graphics.Bitmap;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C8503a;
import i03.C60241d;
import ic0.C108455d;
import iy3.C60641c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ma2.C61454t;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C64197v;
import te3.C64417hb1;
import te3.C64463jb1;
import te3.C64550mb1;
import te3.C64621p23;

/* renamed from: hb2.f */
public final class C59822f {

    /* renamed from: A */
    public static final C59823a f170752A = new C59823a();

    /* renamed from: a */
    public Long f170753a;

    /* renamed from: b */
    public String f170754b;

    /* renamed from: c */
    public Long f170755c;

    /* renamed from: d */
    public String f170756d;

    /* renamed from: e */
    public String f170757e;

    /* renamed from: f */
    public String f170758f = "";

    /* renamed from: g */
    public LinkedList<C64550mb1> f170759g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C64550mb1> f170760h = new LinkedList<>();

    /* renamed from: i */
    public C64463jb1 f170761i;

    /* renamed from: j */
    public FinderContact f170762j;

    /* renamed from: k */
    public int f170763k;

    /* renamed from: l */
    public int f170764l;

    /* renamed from: m */
    public int f170765m;

    /* renamed from: n */
    public boolean f170766n;

    /* renamed from: o */
    public LinkedList<FinderObject> f170767o = new LinkedList<>();

    /* renamed from: p */
    public int f170768p = 1;

    /* renamed from: q */
    public FinderObject f170769q;

    /* renamed from: r */
    public boolean f170770r;

    /* renamed from: s */
    public boolean f170771s;

    /* renamed from: t */
    public FinderObject f170772t;

    /* renamed from: u */
    public LinkedList<FinderObject> f170773u = new LinkedList<>();

    /* renamed from: v */
    public long f170774v;

    /* renamed from: w */
    public long f170775w;

    /* renamed from: x */
    public long f170776x;

    /* renamed from: y */
    public int f170777y;

    /* renamed from: z */
    public boolean f170778z;

    /* renamed from: hb2.f$a */
    public static final class C59823a {

        /* renamed from: hb2.f$a$a */
        public static final class C59824a implements C108455d {

            /* renamed from: a */
            public final /* synthetic */ C64621p23 f170779a;

            /* renamed from: b */
            public final /* synthetic */ String f170780b;

            /* renamed from: c */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f170781c;

            public C59824a(C64621p23 p232, String str, C32226l<? super Boolean, C13598b0> lVar) {
                this.f170779a = p232;
                this.f170780b = str;
                this.f170781c = lVar;
            }

            /* renamed from: a */
            public final void mo26263a(boolean z, Object[] objArr) {
                if (z) {
                    this.f170779a.f184741f = this.f170780b;
                }
                this.f170781c.invoke(Boolean.valueOf(z));
            }
        }

        /* renamed from: hb2.f$a$b */
        public static final class C59825b extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f170782d;

            /* renamed from: e */
            public final /* synthetic */ C64621p23 f170783e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f170784f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59825b(String str, C64621p23 p232, C32226l<? super Boolean, C13598b0> lVar) {
                super(2);
                this.f170782d = str;
                this.f170783e = p232;
                this.f170784f = lVar;
            }

            public Object invoke(Object obj, Object obj2) {
                ((Number) obj).longValue();
                Bitmap bitmap = (Bitmap) obj2;
                boolean z = false;
                if (bitmap != null) {
                    BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, this.f170782d, false);
                    this.f170783e.f184741f = this.f170782d;
                }
                C32226l<Boolean, C13598b0> lVar = this.f170784f;
                if (bitmap != null) {
                    z = true;
                }
                lVar.invoke(Boolean.valueOf(z));
                return C13598b0.f38549a;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
            r1 = r1.contact;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final hb2.C59822f mo84776a(te3.C64621p23 r6) {
            /*
                r5 = this;
                java.lang.String r0 = "data"
                gy3.C87412m.m108594g(r6, r0)
                hb2.f r0 = new hb2.f
                r0.<init>()
                long r1 = r6.f184743h
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f170753a = r1
                java.lang.String r1 = r6.f184741f
                r0.f170754b = r1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r6.f184739d
                r2 = 0
                if (r1 == 0) goto L_0x0022
                com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.contact
                if (r1 == 0) goto L_0x0022
                java.lang.String r1 = r1.nickname
                goto L_0x0023
            L_0x0022:
                r1 = r2
            L_0x0023:
                if (r1 != 0) goto L_0x0027
                java.lang.String r1 = ""
            L_0x0027:
                r0.f170758f = r1
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r6.f184740e
                java.lang.String r3 = "data.refObjectList"
                gy3.C87412m.m108593f(r1, r3)
                r0.f170767o = r1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r6.f184739d
                if (r1 == 0) goto L_0x003d
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x003d
                te3.hb1 r1 = r1.mvInfo
                goto L_0x003e
            L_0x003d:
                r1 = r2
            L_0x003e:
                if (r1 == 0) goto L_0x0049
                java.util.LinkedList<te3.mb1> r3 = r1.f183455d
                if (r3 == 0) goto L_0x0049
                java.util.LinkedList<te3.mb1> r4 = r0.f170759g
                r4.addAll(r3)
            L_0x0049:
                if (r1 == 0) goto L_0x0054
                java.util.LinkedList<te3.mb1> r3 = r1.f183460i
                if (r3 == 0) goto L_0x0054
                java.util.LinkedList<te3.mb1> r4 = r0.f170760h
                r4.addAll(r3)
            L_0x0054:
                if (r1 == 0) goto L_0x0059
                te3.jb1 r3 = r1.f183457f
                goto L_0x005a
            L_0x0059:
                r3 = r2
            L_0x005a:
                r0.f170761i = r3
                com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.f184739d
                if (r6 == 0) goto L_0x0062
                com.tencent.mm.protocal.protobuf.FinderContact r2 = r6.contact
            L_0x0062:
                r0.f170762j = r2
                r0.f170769q = r6
                if (r1 == 0) goto L_0x006b
                int r6 = r1.f183461j
                goto L_0x006c
            L_0x006b:
                r6 = 0
            L_0x006c:
                r0.f170777y = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hb2.C59822f.C59823a.mo84776a(te3.p23):hb2.f");
        }

        /* renamed from: b */
        public final void mo84777b(FinderObject finderObject, C59822f fVar) {
            boolean z;
            C64417hb1 hb12;
            FinderObjectDesc finderObjectDesc;
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            C87412m.m108594g(finderObject, "obj");
            C87412m.m108594g(fVar, "mv");
            fVar.f170755c = Long.valueOf(finderObject.f164794id);
            fVar.f170756d = finderObject.objectNonceId;
            FinderContact finderContact = finderObject.contact;
            String str = finderContact != null ? finderContact.nickname : null;
            if (str == null) {
                str = "";
            }
            fVar.f170758f = str;
            fVar.f170762j = finderObject.contact;
            String str2 = fVar.f170757e;
            int i = 0;
            boolean z2 = true;
            if (!(!(str2 == null || str2.length() == 0) || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
                fVar.f170757e = finderMedia.thumbUrl + finderMedia.thumb_url_token;
            }
            FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
            if (!(finderObjectDesc2 == null || (hb12 = finderObjectDesc2.mvInfo) == null)) {
                fVar.f170761i = hb12.f183457f;
                LinkedList<C64550mb1> linkedList2 = hb12.f183455d;
                C87412m.m108593f(linkedList2, "mvInfo.orderedTrackList");
                fVar.f170759g = linkedList2;
                LinkedList<C64550mb1> linkedList3 = hb12.f183460i;
                C87412m.m108593f(linkedList3, "mvInfo.ordered_track_list_flex_clip");
                fVar.f170760h = linkedList3;
                fVar.f170777y = hb12.f183461j;
            }
            fVar.f170763k = finderObject.likeCount;
            fVar.f170764l = finderObject.forwardCount;
            fVar.f170765m = finderObject.commentCount;
            fVar.f170766n = finderObject.likeFlag != 0;
            fVar.f170769q = finderObject;
            if (fVar.f170777y == 1) {
                Iterator<T> it = fVar.f170760h.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        LinkedList<Integer> linkedList4 = ((C64550mb1) next).f184269r;
                        C87412m.m108593f(linkedList4, "finderMVTrack.feature_list");
                        Set e = C110826x0.m151017e(0, 1, 2);
                        Iterator<T> it4 = linkedList4.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!e.contains(Integer.valueOf(((Number) it4.next()).intValue()))) {
                                    z = false;
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            z2 = false;
                            break;
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                if (!z2) {
                    for (T next2 : fVar.f170760h) {
                        int i4 = i + 1;
                        if (i >= 0) {
                            C64550mb1 mb12 = (C64550mb1) next2;
                            C64550mb1 mb13 = new C64550mb1();
                            mb13.f184259e = mb12.f184259e;
                            mb13.f184258d = mb12.f184258d;
                            mb13.f184262h = 0;
                            fVar.f170760h.set(i, mb13);
                            i = i4;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.tencent.mm.protocal.protobuf.FinderMedia} */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = r0.objectDesc;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0177  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo84778c(te3.C64621p23 r14, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r15) {
            /*
                r13 = this;
                java.lang.String r0 = "trackData"
                gy3.C87412m.m108594g(r14, r0)
                java.lang.String r0 = "callback"
                gy3.C87412m.m108594g(r15, r0)
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r14.f184739d
                r1 = 0
                if (r0 == 0) goto L_0x0017
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r0.objectDesc
                if (r2 == 0) goto L_0x0017
                te3.hb1 r2 = r2.mvInfo
                goto L_0x0018
            L_0x0017:
                r2 = r1
            L_0x0018:
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r3 = r14.f184740e
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0024
                int r2 = r2.f183461j
                if (r2 != r4) goto L_0x0024
                r2 = 1
                goto L_0x0025
            L_0x0024:
                r2 = 0
            L_0x0025:
                if (r2 == 0) goto L_0x0036
                if (r0 == 0) goto L_0x0034
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
                if (r0 == 0) goto L_0x0034
                te3.hb1 r0 = r0.mvInfo
                if (r0 == 0) goto L_0x0034
                java.util.LinkedList<te3.mb1> r0 = r0.f183460i
                goto L_0x0042
            L_0x0034:
                r0 = r1
                goto L_0x0042
            L_0x0036:
                if (r0 == 0) goto L_0x0034
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
                if (r0 == 0) goto L_0x0034
                te3.hb1 r0 = r0.mvInfo
                if (r0 == 0) goto L_0x0034
                java.util.LinkedList<te3.mb1> r0 = r0.f183455d
            L_0x0042:
                if (r0 == 0) goto L_0x0078
                java.util.Iterator r0 = r0.iterator()
                boolean r2 = r0.hasNext()
                if (r2 != 0) goto L_0x0050
                r2 = r1
                goto L_0x0075
            L_0x0050:
                java.lang.Object r2 = r0.next()
                boolean r6 = r0.hasNext()
                if (r6 != 0) goto L_0x005b
                goto L_0x0075
            L_0x005b:
                r6 = r2
                te3.mb1 r6 = (te3.C64550mb1) r6
                long r6 = r6.f184258d
            L_0x0060:
                java.lang.Object r8 = r0.next()
                r9 = r8
                te3.mb1 r9 = (te3.C64550mb1) r9
                long r9 = r9.f184258d
                int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x006f
                r2 = r8
                r6 = r9
            L_0x006f:
                boolean r8 = r0.hasNext()
                if (r8 != 0) goto L_0x0060
            L_0x0075:
                te3.mb1 r2 = (te3.C64550mb1) r2
                goto L_0x0079
            L_0x0078:
                r2 = r1
            L_0x0079:
                if (r2 == 0) goto L_0x0177
                java.lang.String r0 = "refList"
                gy3.C87412m.m108593f(r3, r0)
                java.util.Iterator r0 = r3.iterator()
            L_0x0085:
                boolean r3 = r0.hasNext()
                r6 = 0
                if (r3 == 0) goto L_0x00af
                java.lang.Object r3 = r0.next()
                r8 = r3
                com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r8
                long r9 = r2.f184260f
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 == 0) goto L_0x00a4
                long r11 = r8.f164794id
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x00a2
                r8 = 1
                goto L_0x00ac
            L_0x00a2:
                r8 = 0
                goto L_0x00ac
            L_0x00a4:
                java.lang.String r9 = r2.f184261g
                java.lang.String r8 = r8.objectNonceId
                boolean r8 = gy3.C87412m.m108589b(r9, r8)
            L_0x00ac:
                if (r8 == 0) goto L_0x0085
                goto L_0x00b0
            L_0x00af:
                r3 = r1
            L_0x00b0:
                com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r3
                if (r3 == 0) goto L_0x00c3
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r3.objectDesc
                if (r0 == 0) goto L_0x00c3
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
                if (r0 == 0) goto L_0x00c3
                java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
                r1 = r0
                com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r1
            L_0x00c3:
                if (r1 == 0) goto L_0x0171
                er1.j5 r0 = er1.C58741j5.f168184a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r8 = "music_mv_cover_"
                r3.append(r8)
                long r8 = r14.f184743h
                r3.append(r8)
                r8 = 95
                r3.append(r8)
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                java.lang.String r8 = java.lang.String.valueOf(r8)
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r8)
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = r0.mo83731e(r3)
                java.lang.String r3 = r14.f184741f
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
                if (r3 == 0) goto L_0x0102
                java.lang.String r3 = r14.f184741f
                com.tencent.p014mm.vfs.C86013q1.m106442c(r3, r0)
                r14.f184741f = r0
            L_0x0102:
                long r2 = r2.f184260f
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x0137
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r1.thumbUrl
                r2.append(r3)
                java.lang.String r1 = r1.thumb_url_token
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                hc0.c$b r2 = new hc0.c$b
                r2.<init>()
                r2.f59350f = r0
                r2.f59346b = r4
                r2.f59345a = r5
                gc0.a r3 = gc0.C20828a.m22825b()
                hc0.c r2 = r2.mo32666a()
                hb2.f$a$a r4 = new hb2.f$a$a
                r4.<init>(r14, r0, r15)
                r3.mo32515d(r1, r2, r4)
                goto L_0x017c
            L_0x0137:
                java.lang.String r2 = r1.url
                java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106448i(r2, r5)
                if (r2 != 0) goto L_0x0141
                java.lang.String r2 = ""
            L_0x0141:
                int r1 = r1.mediaType
                r3 = 2
                if (r1 != r3) goto L_0x0147
                goto L_0x0148
            L_0x0147:
                r4 = 2
            L_0x0148:
                sp3.c r1 = new sp3.c
                r1.<init>(r2, r4)
                sp3.b$a r2 = sp3.C110794b.f331445i
                sp3.b r1 = r2.mo162358a(r1)
                up1.f r2 = up1.C37521f.f99374d
                r2.getClass()
                int r3 = up1.C37521f.f99489q
                r2.getClass()
                r1.mo58663C(r3, r3)
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                java.util.List r2 = sx3.C26236u.m33719b(r2)
                hb2.f$a$b r3 = new hb2.f$a$b
                r3.<init>(r0, r14, r15)
                r1.mo58665b(r2, r3)
                goto L_0x017c
            L_0x0171:
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                r15.invoke(r14)
                goto L_0x017c
            L_0x0177:
                java.lang.Boolean r14 = java.lang.Boolean.FALSE
                r15.invoke(r14)
            L_0x017c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hb2.C59822f.C59823a.mo84778c(te3.p23, fy3.l):void");
        }

        /* renamed from: d */
        public final FinderObject mo84779d(C59822f fVar) {
            C87412m.m108594g(fVar, "musicMv");
            FinderObject finderObject = fVar.f170769q;
            boolean z = true;
            if (finderObject != null) {
                if (!(finderObject.f164794id != 0)) {
                    finderObject = null;
                }
                if (finderObject != null) {
                    return finderObject;
                }
            }
            FinderObject finderObject2 = fVar.f170772t;
            if (finderObject2 == null) {
                return null;
            }
            if (finderObject2.f164794id == 0) {
                z = false;
            }
            if (z) {
                return finderObject2;
            }
            return null;
        }

        /* renamed from: e */
        public final boolean mo84780e(C59822f fVar) {
            C87412m.m108594g(fVar, "musicMv");
            return mo84779d(fVar) != null;
        }
    }

    /* renamed from: a */
    public final LinkedList<C60241d> mo84775a() {
        String str;
        String str2;
        Iterator<T> it;
        String str3;
        boolean z;
        String str4;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        String str5;
        boolean z2;
        C13598b0 b0Var;
        boolean z3;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia2;
        LinkedList<FinderMedia> linkedList3;
        FinderMedia finderMedia3;
        C59822f fVar = this;
        LinkedList<C60241d> linkedList4 = new LinkedList<>();
        Iterator<T> it4 = (fVar.f170777y == 1 ? fVar.f170760h : fVar.f170759g).iterator();
        int i = 0;
        while (it4.hasNext()) {
            T next = it4.next();
            int i2 = i + 1;
            if (i >= 0) {
                C64550mb1 mb12 = (C64550mb1) next;
                String str6 = " timeLengthInMvMs:";
                String str7 = " timeOffsetInMvMs:";
                long j = 0;
                String str8 = "MicroMsg.MusicMv";
                if (mb12.f184260f != 0) {
                    Iterator<T> it5 = fVar.f170767o.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        FinderObject finderObject = (FinderObject) it5.next();
                        it = it4;
                        String str9 = str8;
                        String str10 = str6;
                        str = str7;
                        if (finderObject.f164794id == mb12.f184260f) {
                            FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
                            if (finderObjectDesc2 == null || (linkedList2 = finderObjectDesc2.media) == null || (finderMedia2 = (FinderMedia) C110818d0.m150916N(linkedList2)) == null) {
                                str3 = str9;
                                str5 = str10;
                                b0Var = null;
                                z2 = false;
                            } else {
                                String str11 = "video_" + finderObject.f164794id + '_' + linkedList4.size();
                                C87412m.m108594g(str11, "mediaId");
                                String i3 = new C86009m1(C61454t.f174766a.mo86431c(str11)).mo119971i();
                                C87412m.m108593f(i3, "VFSFile(MusicFileNameUti…th(mediaId)).absolutePath");
                                String str12 = finderMedia2.url;
                                C60241d dVar = new C60241d(str11, i3, str12 == null ? "" : str12, C60641c.m70921b(finderMedia2.width), C60641c.m70921b(finderMedia2.height));
                                dVar.f165929a = 2;
                                dVar.f165930b = "xV2";
                                String str13 = finderMedia2.url_token;
                                if (str13 == null) {
                                    str13 = "";
                                }
                                dVar.f165931c = str13;
                                dVar.f165932d = finderMedia2.decodeKey;
                                String str14 = finderMedia2.thumbUrl;
                                if (str14 == null) {
                                    str14 = "";
                                }
                                dVar.f165936h = str14;
                                String str15 = finderMedia2.thumb_url_token;
                                if (str15 == null) {
                                    str15 = "";
                                }
                                dVar.f165937i = str15;
                                dVar.f165943o = (long) mb12.f184259e;
                                dVar.f165942n = mb12.f184258d;
                                dVar.f165944p = mb12.f184262h;
                                FinderObjectDesc finderObjectDesc3 = finderObject.objectDesc;
                                if (!(finderObjectDesc3 == null || (linkedList3 = finderObjectDesc3.media) == null || (finderMedia3 = (FinderMedia) C110818d0.m150914L(linkedList3)) == null)) {
                                    j = (long) finderMedia3.videoDuration;
                                }
                                dVar.f165935g = ((long) 1000) * j;
                                dVar.f165933e = false;
                                dVar.f165945q = finderObject;
                                dVar.f171756x = mb12.f184267p;
                                dVar.f171758z.addAll(mb12.f184269r);
                                dVar.f171755A = mb12.f184270s;
                                C8503a.C8504a aVar = C8503a.f27529e;
                                C8503a aVar2 = C8503a.f27530f.get(mb12.f184268q);
                                if (aVar2 != null) {
                                    dVar.f171757y = aVar2.f27534d;
                                }
                                linkedList4.add(dVar);
                                StringBuilder sb = new StringBuilder();
                                sb.append("add mediaTrack network id:");
                                sb.append(dVar.f165947s);
                                sb.append(" path:");
                                sb.append(dVar.f165948t);
                                sb.append(" width:");
                                sb.append(dVar.f165950v);
                                sb.append(" height:");
                                sb.append(dVar.f165951w);
                                sb.append(" timeOffsetInClipMs:");
                                sb.append(dVar.f165944p);
                                sb.append(str);
                                sb.append(dVar.f165942n);
                                str5 = str10;
                                sb.append(str5);
                                sb.append(dVar.f165943o);
                                str3 = str9;
                                Log.m105924i(str3, sb.toString());
                                b0Var = C13598b0.f38549a;
                                z2 = true;
                            }
                            if (b0Var == null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("not find ref object media ");
                                sb4.append(i);
                                sb4.append(' ');
                                z3 = z2;
                                str2 = str5;
                                sb4.append(mb12.f184260f);
                                sb4.append(' ');
                                sb4.append(mb12.f184261g);
                                Log.m105924i(str3, sb4.toString());
                            } else {
                                z3 = z2;
                                str2 = str5;
                            }
                            z = z3;
                        } else {
                            it4 = it;
                            str8 = str9;
                            str6 = str10;
                            str7 = str;
                        }
                    }
                }
                it = it4;
                str2 = str6;
                str = str7;
                str3 = str8;
                z = false;
                if (!z) {
                    Log.m105924i(str3, "not find ref obj Id:" + mb12.f184260f);
                    C8479f0 f0Var = new C8479f0();
                    String str16 = mb12.f184261g;
                    if (str16 != null) {
                        if (!(str16.length() > 0)) {
                            str16 = null;
                        }
                        if (str16 != null) {
                            for (FinderObject finderObject2 : fVar.f170767o) {
                                if (!C87412m.m108589b(str16, finderObject2.objectNonceId) || (finderObjectDesc = finderObject2.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) {
                                    str4 = str3;
                                } else {
                                    String str17 = "video_" + finderObject2.objectNonceId;
                                    String str18 = finderMedia.url;
                                    C60241d dVar2 = new C60241d(str17, str18 == null ? "" : str18, "", C60641c.m70921b(finderMedia.width), C60641c.m70921b(finderMedia.height));
                                    str4 = str3;
                                    dVar2.f165935g = ((long) finderMedia.videoDuration) * 1000;
                                    f0Var.f27484d = dVar2;
                                    dVar2.f165933e = true;
                                    dVar2.f165945q = finderObject2;
                                }
                                str3 = str4;
                            }
                        }
                    }
                    String str19 = str3;
                    if (f0Var.f27484d == null) {
                        C59809b a = C59809b.f170715f.mo84759a();
                        C60241d dVar3 = new C60241d("video_" + a.f170717a, a.mo84758a(), "", a.f170718b, a.f170719c);
                        dVar3.f165935g = a.f170720d;
                        dVar3.f165940l = true;
                        dVar3.f165941m = true;
                        f0Var.f27484d = dVar3;
                        dVar3.f165933e = true;
                    }
                    C60241d dVar4 = (C60241d) f0Var.f27484d;
                    if (dVar4 != null) {
                        dVar4.f171756x = mb12.f184267p;
                        dVar4.f171755A = mb12.f184270s;
                        dVar4.f171758z.addAll(mb12.f184269r);
                        C8503a.C8504a aVar3 = C8503a.f27529e;
                        C8503a aVar4 = C8503a.f27530f.get(mb12.f184268q);
                        if (aVar4 != null) {
                            T t = f0Var.f27484d;
                            C60241d dVar5 = (C60241d) t;
                            C60241d dVar6 = (C60241d) t;
                            if (dVar6 != null) {
                                dVar6.f171757y = aVar4.f27534d;
                            }
                        }
                        dVar4.f165943o = (long) mb12.f184259e;
                        dVar4.f165942n = mb12.f184258d;
                        dVar4.f165944p = mb12.f184262h;
                        dVar4.f165933e = true;
                        dVar4.f165947s += '_' + linkedList4.size();
                        linkedList4.add(dVar4);
                        Log.m105924i(str19, "add mediaTrack local id:" + dVar4.f165947s + " path:" + dVar4.f165948t + " width:" + dVar4.f165950v + " height:" + dVar4.f165951w + " timeOffsetInClipMs:" + dVar4.f165944p + str + dVar4.f165942n + str2 + dVar4.f165943o);
                        fVar = this;
                        i = i2;
                        it4 = it;
                    }
                }
                fVar = this;
                i = i2;
                it4 = it;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return linkedList4;
    }
}
