package wq1;

import bd1.C54446b;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMediaExtra;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import er1.C58723f3;
import er1.C58739j4;
import er1.C58775t;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import o40.C61937h;
import os1.C62153d;
import rx3.C13604l;
import te3.C49040cr0;
import te3.C49277ef1;
import te3.C50124kf1;
import te3.C51235sf0;
import te3.C51388tf0;
import te3.C51411tl0;
import te3.C52271zj0;
import te3.C52277zk1;
import te3.C64237ap1;
import te3.C64268br3;
import te3.C64311db1;
import te3.C64365fh0;
import te3.C64446ig1;
import te3.C64447ih1;
import te3.C64465jc1;
import te3.C64472jk0;
import te3.C64473jl0;
import te3.C64494kj0;
import te3.C64589nq2;
import te3.C64633pn1;
import te3.C64636pq2;
import te3.C64689rq2;
import te3.C64736tq2;
import te3.C64775vi0;
import te3.C64803wi0;
import up1.C37521f;
import uq1.C65462u;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: wq1.a */
public final class C66171a {

    /* renamed from: a */
    public static final C66171a f190181a = new C66171a();

    /* renamed from: b */
    public static final String f190182b = "Finder.FinderPostDataLogic";

    /* renamed from: wq1.a$a */
    public static final class C66172a extends C87413o implements C32226l<C51235sf0, Boolean> {

        /* renamed from: d */
        public static final C66172a f190183d = new C66172a();

        public C66172a() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(((C51235sf0) obj).f141468d == 3);
        }
    }

    /* renamed from: a */
    public final void mo90253a(LinkedList<FinderJumpInfo> linkedList, FinderObject finderObject) {
        C87412m.m108594g(linkedList, "jumpInfoList");
        C87412m.m108594g(finderObject, "fakeSvrObj");
        if (linkedList.isEmpty()) {
            finderObject.adFlag = 0;
            return;
        }
        for (FinderJumpInfo finderJumpInfo : linkedList) {
            if (finderJumpInfo.source == 0) {
                finderJumpInfo.source = 1;
            }
        }
        finderObject.adFlag = 4;
    }

    /* renamed from: b */
    public final void mo90254b(FinderObject finderObject, LinkedList<FinderJumpInfo> linkedList) {
        LinkedList<C51235sf0> linkedList2;
        LinkedList<C51235sf0> linkedList3;
        C87412m.m108594g(finderObject, "fakeSvrObj");
        C87412m.m108594g(linkedList, "jumpInfoList");
        C51388tf0 tf02 = finderObject.attachmentList;
        if (!(tf02 == null || (linkedList3 = tf02.f142195d) == null)) {
            C61926c.m72675T(linkedList3, C66172a.f190183d);
        }
        for (FinderJumpInfo finderJumpInfo : linkedList) {
            if (finderObject.attachmentList == null) {
                C51388tf0 tf03 = new C51388tf0();
                tf03.f142195d = new LinkedList<>();
                finderObject.attachmentList = tf03;
            }
            C51388tf0 tf04 = finderObject.attachmentList;
            if (!(tf04 == null || (linkedList2 = tf04.f142195d) == null)) {
                C51235sf0 sf02 = new C51235sf0();
                sf02.f141468d = 3;
                C49040cr0 cr02 = new C49040cr0();
                cr02.f131919d = finderJumpInfo;
                sf02.f141471g = cr02;
                linkedList2.add(sf02);
            }
        }
    }

    /* renamed from: c */
    public final void mo90255c(FinderObjectDesc finderObjectDesc, long j, C64494kj0 kj02, LinkedList<C64775vi0> linkedList) {
        if (finderObjectDesc != null) {
            if (finderObjectDesc.client_draft_ext_info == null) {
                finderObjectDesc.client_draft_ext_info = new C64365fh0();
            }
            C64365fh0 fh02 = finderObjectDesc.client_draft_ext_info;
            if (fh02 != null) {
                fh02.f183135f = (float) j;
            }
            if (fh02 != null) {
                fh02.f183136g = kj02;
            }
            if (fh02 != null) {
                fh02.f183137h = linkedList;
            }
        }
    }

    /* renamed from: d */
    public final void mo90256d(FinderObject finderObject, boolean z, ArrayList<C64589nq2> arrayList, int i, boolean z2, FinderItem finderItem, LinkedList<FinderJumpInfo> linkedList, long j) {
        String str;
        FinderContact finderContact;
        String str2;
        String str3;
        String str4;
        FinderObject finderObject2 = finderObject;
        finderObject2.objectType = z ? 1 : 0;
        finderObject2.f164794id = 0;
        C66785b bVar = C66785b.f191882e;
        finderObject2.username = bVar.mo90662O5();
        boolean z3 = false;
        C54446b c = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
        if (c == null || (str = c.field_nickname) == null) {
            str = "";
        }
        finderObject2.nickname = str;
        C58784w3.f168295a.getClass();
        finderObject2.createtime = (int) (C31543z5.m39451a() / ((long) 1000));
        C58969q b = C58961d.f168673a.mo84155b(bVar.mo90662O5());
        if (b != null) {
            finderContact = C58960c.m68835g(b);
        } else {
            FinderContact finderContact2 = new FinderContact();
            finderContact2.username = bVar.mo90662O5();
            C54446b c2 = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
            if (c2 == null || (str2 = c2.field_nickname) == null) {
                str2 = "";
            }
            finderContact2.nickname = str2;
            C54446b c3 = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
            if (c3 == null || (str3 = c3.field_avatarUrl) == null) {
                str3 = "";
            }
            finderContact2.headUrl = str3;
            if (b == null || (str4 = b.field_signature) == null) {
                str4 = "";
            }
            finderContact2.signature = str4;
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            finderContact2.coverImgUrl = (String) f;
            finderContact = finderContact2;
        }
        finderObject2.contact = finderContact;
        finderContact.one_time_flag |= 1;
        finderObject2.mentionedUserContact = new LinkedList<>();
        if (C37521f.f99374d.mo61175c() && arrayList != null) {
            Iterator<C64589nq2> it = arrayList.iterator();
            while (it.hasNext()) {
                C64589nq2 next = it.next();
                LinkedList<FinderContact> linkedList2 = finderObject2.mentionedUserContact;
                C58775t tVar = C58775t.f168276a;
                C87412m.m108593f(next, "atContact");
                FinderContact finderContact3 = new FinderContact();
                finderContact3.username = next.f184530d;
                finderContact3.headUrl = next.f184531e;
                finderContact3.nickname = next.f184532f;
                finderContact3.authInfo = next.f184533g;
                linkedList2.add(finderContact3);
            }
        }
        if (C58739j4.f168176a.mo83687P()) {
            finderObject2.permissionFlag = 131;
        }
        finderObject2.displayidDiscarded = "";
        finderObject2.recommendReason = "";
        finderObject2.secondaryShowFlag = 1;
        finderObject2.originalFlag = i;
        if ((j & 1) == 1) {
            z3 = true;
        }
        finderObject2.showOriginal = z3;
        mo90253a(linkedList, finderObject);
        C64447ih1 ih12 = new C64447ih1();
        ih12.f183694h = z2 ? 1 : 0;
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
        ih12.f183690d = ((Number) X0.f38555d).floatValue();
        ih12.f183691e = ((Number) X0.f38556e).floatValue();
        finderItem.field_postExtraData = ih12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00fc  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90257e(com.tencent.p014mm.protocal.protobuf.FinderObjectDesc r12, te3.C64636pq2 r13, uq1.C65462u r14, te3.C49277ef1 r15, te3.C64447ih1 r16, java.lang.String r17, int r18, te3.C64311db1 r19, te3.C64472jk0 r20, java.util.ArrayList<te3.C64589nq2> r21, te3.C64237ap1 r22, te3.C64803wi0 r23) {
        /*
            r11 = this;
            r1 = r12
            r0 = r13
            r9 = r23
            r2 = 0
            if (r0 == 0) goto L_0x000a
            te3.td1 r3 = r0.f184876e
            goto L_0x000b
        L_0x000a:
            r3 = r2
        L_0x000b:
            r1.imgFeedBgmInfo = r3
            te3.ve1 r3 = new te3.ve1
            r3.<init>()
            if (r0 == 0) goto L_0x0017
            te3.td1 r4 = r0.f184876e
            goto L_0x0018
        L_0x0017:
            r4 = r2
        L_0x0018:
            r3.f185873d = r4
            if (r0 == 0) goto L_0x0020
            java.lang.String r5 = r0.f184877f
            if (r5 != 0) goto L_0x0028
        L_0x0020:
            if (r4 == 0) goto L_0x0027
            java.lang.String r5 = dm1.C58324g.m67537a(r4)
            goto L_0x0028
        L_0x0027:
            r5 = r2
        L_0x0028:
            r3.f185874e = r5
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0034
            boolean r6 = r0.f184880i
            if (r6 != 0) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            if (r6 != 0) goto L_0x0045
            if (r0 == 0) goto L_0x003f
            boolean r6 = r0.f184881j
            if (r6 != 0) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r6 = 0
            goto L_0x0046
        L_0x0045:
            r6 = 1
        L_0x0046:
            r3.f185875f = r6
            java.lang.String r6 = f190182b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "FinderObjectBGMInfo, groupId:"
            r7.append(r8)
            java.lang.String r8 = r3.f185874e
            r7.append(r8)
            java.lang.String r8 = ", mediaMute:"
            r7.append(r8)
            if (r0 == 0) goto L_0x0067
            boolean r8 = r0.f184880i
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L_0x0068
        L_0x0067:
            r8 = r2
        L_0x0068:
            r7.append(r8)
            java.lang.String r8 = ", musicMute:"
            r7.append(r8)
            if (r0 == 0) goto L_0x0079
            boolean r8 = r0.f184881j
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L_0x007a
        L_0x0079:
            r8 = r2
        L_0x007a:
            r7.append(r8)
            java.lang.String r8 = ", hasBgm:"
            r7.append(r8)
            int r8 = r3.f185875f
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            java.lang.String r6 = r3.f185874e
            if (r6 == 0) goto L_0x009b
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r6 = 0
            goto L_0x009c
        L_0x009b:
            r6 = 1
        L_0x009c:
            if (r6 != 0) goto L_0x00d2
            te3.td1 r6 = r3.f185873d
            if (r6 != 0) goto L_0x00d2
            te3.td1 r6 = new te3.td1
            r6.<init>()
            if (r0 == 0) goto L_0x00ac
            java.lang.String r7 = r0.f184879h
            goto L_0x00ad
        L_0x00ac:
            r7 = r2
        L_0x00ad:
            if (r7 == 0) goto L_0x00b8
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r7 = 0
            goto L_0x00b9
        L_0x00b8:
            r7 = 1
        L_0x00b9:
            if (r7 == 0) goto L_0x00c8
            if (r0 == 0) goto L_0x00c0
            java.lang.String r7 = r0.f184878g
            goto L_0x00c1
        L_0x00c0:
            r7 = r2
        L_0x00c1:
            java.lang.String r4 = p823sg.C48380r.m53726a(r7, r4)
            r6.f185539i = r4
            goto L_0x00d0
        L_0x00c8:
            if (r0 == 0) goto L_0x00cd
            java.lang.String r4 = r0.f184879h
            goto L_0x00ce
        L_0x00cd:
            r4 = r2
        L_0x00ce:
            r6.f185539i = r4
        L_0x00d0:
            r3.f185873d = r6
        L_0x00d2:
            r1.feedBgmInfo = r3
            com.tencent.mm.protocal.protobuf.FinderMediaExtra r3 = r1.mediaExtra
            if (r3 != 0) goto L_0x00df
            com.tencent.mm.protocal.protobuf.FinderMediaExtra r3 = new com.tencent.mm.protocal.protobuf.FinderMediaExtra
            r3.<init>()
            r1.mediaExtra = r3
        L_0x00df:
            com.tencent.mm.protocal.protobuf.FinderMediaExtra r3 = r1.mediaExtra
            if (r3 == 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00e8
            java.util.LinkedList<java.lang.String> r4 = r9.f186121d
            goto L_0x00e9
        L_0x00e8:
            r4 = r2
        L_0x00e9:
            r3.setCover_url_word(r4)
        L_0x00ec:
            if (r0 == 0) goto L_0x019d
            java.util.LinkedList<te3.rq2> r0 = r0.f184875d
            if (r0 == 0) goto L_0x019d
            java.util.Iterator r0 = r0.iterator()
        L_0x00f6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x019d
            java.lang.Object r3 = r0.next()
            int r4 = r5 + 1
            if (r5 < 0) goto L_0x0199
            te3.rq2 r3 = (te3.C64689rq2) r3
            com.tencent.mm.protocal.protobuf.FinderMedia r6 = new com.tencent.mm.protocal.protobuf.FinderMedia
            r6.<init>()
            java.lang.String r7 = r3.f185266d
            r6.url = r7
            int r7 = r3.f185268f
            r6.mediaType = r7
            java.lang.String r7 = r3.f185267e
            r6.thumbUrl = r7
            java.lang.String r7 = r3.f185239F
            r6.full_thumb_url = r7
            boolean r7 = r3.f185280t
            if (r7 != 0) goto L_0x0139
            int r7 = r3.f185269g
            if (r7 > 0) goto L_0x0139
            java.lang.Class<tz.f> r7 = p707tz.C65000f.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            tz.f r7 = (p707tz.C65000f) r7
            java.lang.String r8 = r3.f185266d
            com.tencent.mm.plugin.sight.base.a r7 = r7.mo89183Yp(r8)
            if (r7 == 0) goto L_0x0139
            int r7 = r7.mo130041a()
            r3.f185269g = r7
        L_0x0139:
            int r7 = r3.f185269g
            r6.videoDuration = r7
            float r7 = r3.f185270h
            r6.width = r7
            float r7 = r3.f185271i
            r6.height = r7
            java.lang.String r7 = r3.f185272j
            r6.md5sum = r7
            java.lang.String r7 = r3.f185283w
            r6.coverUrl = r7
            java.lang.String r7 = r3.f185261W
            r6.full_cover_url = r7
            int r7 = r3.f185256T0
            r6.card_show_style = r7
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r7 = r1.media
            r7.add(r6)
            java.lang.String r7 = f190182b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "print mediaList "
            r8.append(r10)
            r8.append(r5)
            java.lang.String r5 = " mediaType:"
            r8.append(r5)
            int r5 = r6.mediaType
            r8.append(r5)
            r5 = 32
            r8.append(r5)
            java.lang.String r5 = r3.f185266d
            r8.append(r5)
            java.lang.String r5 = " size:"
            r8.append(r5)
            java.lang.String r3 = r3.f185266d
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r5)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            r5 = r4
            goto L_0x00f6
        L_0x0199:
            sx3.C64197v.m75542k()
            throw r2
        L_0x019d:
            r10 = r14
            te3.jl0 r0 = r10.f188372l
            r1.fromApp = r0
            r0 = r11
            r1 = r12
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r14
            r0.mo90258f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wq1.C66171a.mo90257e(com.tencent.mm.protocal.protobuf.FinderObjectDesc, te3.pq2, uq1.u, te3.ef1, te3.ih1, java.lang.String, int, te3.db1, te3.jk0, java.util.ArrayList, te3.ap1, te3.wi0):void");
    }

    /* renamed from: f */
    public final void mo90258f(FinderObjectDesc finderObjectDesc, C49277ef1 ef12, String str, int i, C64311db1 db12, C64472jk0 jk02, ArrayList<C64589nq2> arrayList, C64237ap1 ap12, C64803wi0 wi02, C65462u uVar) {
        finderObjectDesc.event = ef12;
        finderObjectDesc.video_tmpl_info = ap12;
        FinderMediaExtra finderMediaExtra = finderObjectDesc.mediaExtra;
        if (finderMediaExtra != null) {
            finderMediaExtra.cover_url_word = wi02 != null ? wi02.f186121d : null;
        }
        finderObjectDesc.description = str;
        finderObjectDesc.mediaType = i;
        if (db12 == null) {
            db12 = new C64311db1();
        }
        finderObjectDesc.location = db12;
        if (jk02 == null) {
            jk02 = new C64472jk0();
        }
        finderObjectDesc.extReading = jk02;
        HashMap hashMap = new HashMap();
        if (C37521f.f99374d.mo61175c() && arrayList != null) {
            LinkedList<C64465jc1> linkedList = new LinkedList<>();
            Iterator<C64589nq2> it = arrayList.iterator();
            while (it.hasNext()) {
                C64589nq2 next = it.next();
                C64465jc1 jc12 = new C64465jc1();
                jc12.f183779d = next.f184530d;
                jc12.f183780e = next.f184535i;
                jc12.f183781f = next.f184532f;
                linkedList.add(jc12);
                String str2 = next.f184532f;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put(str2, next);
            }
            finderObjectDesc.mentionedUser = linkedList;
        }
        C37521f fVar = C37521f.f99374d;
        if (fVar.mo61158L() || fVar.mo61175c()) {
            C64633pn1 pn12 = new C64633pn1();
            pn12.f184865d = C58723f3.f168122a.mo83640b(str, hashMap);
            finderObjectDesc.topic = pn12;
        }
        ArrayList<C52277zk1> arrayList2 = uVar.f188359A;
        if (arrayList2 != null) {
            finderObjectDesc.short_title.clear();
            finderObjectDesc.short_title.addAll(arrayList2);
        }
        C64446ig1 ig12 = uVar.f188360B;
        if (ig12 != null) {
            finderObjectDesc.original_info_desc = ig12;
        }
    }

    /* renamed from: g */
    public final void mo90259g(FinderItem finderItem, ArrayList<C64589nq2> arrayList, C65462u uVar) {
        String str;
        C64736tq2 tq22 = finderItem.field_postinfo;
        if (tq22 == null) {
            tq22 = new C64736tq2();
            tq22.f185645d = "FinderLocal_" + System.nanoTime();
        }
        tq22.f185651j = C31543z5.m39451a();
        if (arrayList != null) {
            tq22.f185656r.clear();
            tq22.f185656r.addAll(arrayList);
        }
        if (!Util.isNullOrNil(uVar.f188373m)) {
            C64268br3 br32 = new C64268br3();
            C64473jl0 jl02 = uVar.f188372l;
            if (jl02 == null || (str = jl02.f183806d) == null) {
                str = "";
            }
            br32.f182329d = str;
            br32.f182330e = uVar.f188374n;
            br32.f182331f = uVar.f188373m;
            tq22.f185657s = br32;
        }
        finderItem.setPostInfo(tq22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r7 = r9.description;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90260h(com.tencent.p014mm.plugin.finder.storage.FinderItem r5, int r6, java.lang.String r7, uq1.C65462u r8, com.tencent.p014mm.protocal.protobuf.FinderObjectDesc r9, te3.C64472jk0 r10, int r11) {
        /*
            r4 = this;
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = r5.field_reportObject
            r1 = 1
            if (r0 != 0) goto L_0x0011
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r0 = dp1.C58408t0.f167337b
            r5.field_reportObject = r0
            if (r0 == 0) goto L_0x0011
            r0.postStage = r1
            int r8 = r8.f188375o
            r0.sdkShareType = r8
        L_0x0011:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r8 = r5.field_reportObject
            r0 = 0
            if (r8 == 0) goto L_0x0034
            long r2 = eb0.C31543z5.m39453c()
            r8.sendOrExitButtonTime = r2
            r8.videoPostType = r6
            r8.beforeCutMediaPath = r7
            r8.postTaskCost = r0
            r8.uploadCost = r0
            r8.mediaProcessCost = r0
            r8.fromDraft = r11
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r6 = dp1.C58408t0.f167337b
            if (r6 == 0) goto L_0x0030
            java.lang.String r6 = r6.flowId
            if (r6 != 0) goto L_0x0032
        L_0x0030:
            java.lang.String r6 = ""
        L_0x0032:
            r8.flowId = r6
        L_0x0034:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r6 = r5.field_reportObject
            if (r6 == 0) goto L_0x0079
            if (r9 == 0) goto L_0x0043
            java.lang.String r7 = r9.description
            if (r7 == 0) goto L_0x0043
            int r7 = r7.length()
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            r6.descCount = r7
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r5 = r5.field_reportObject
            int r5 = r5.descCount
            if (r5 <= 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            r6.existDesc = r5
            r5 = 0
            if (r9 == 0) goto L_0x005b
            te3.db1 r7 = r9.location
            if (r7 == 0) goto L_0x005b
            float r7 = r7.f182662e
            goto L_0x005c
        L_0x005b:
            r7 = 0
        L_0x005c:
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0071
            if (r9 == 0) goto L_0x0069
            te3.db1 r7 = r9.location
            if (r7 == 0) goto L_0x0069
            float r7 = r7.f182661d
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0071
            r6.existLocation = r1
            goto L_0x0073
        L_0x0071:
            r6.existLocation = r0
        L_0x0073:
            if (r10 == 0) goto L_0x0079
            java.lang.String r5 = r10.f183802d
            r6.link = r5
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wq1.C66171a.mo90260h(com.tencent.mm.plugin.finder.storage.FinderItem, int, java.lang.String, uq1.u, com.tencent.mm.protocal.protobuf.FinderObjectDesc, te3.jk0, int):void");
    }

    /* renamed from: i */
    public final FinderItem mo90261i(C65462u uVar, boolean z) {
        int i;
        C65462u uVar2 = uVar;
        C87412m.m108594g(uVar2, "data");
        int i2 = uVar2.f188361a;
        String str = uVar2.f188362b;
        C64636pq2 pq22 = uVar2.f188363c;
        C64311db1 db12 = uVar2.f188364d;
        C64472jk0 jk02 = uVar2.f188365e;
        int i3 = uVar2.f188366f;
        boolean z2 = uVar2.f188367g;
        String str2 = uVar2.f188368h;
        ArrayList<C64589nq2> arrayList = uVar2.f188369i;
        boolean z3 = uVar2.f188370j;
        boolean z4 = uVar2.f188371k;
        C49277ef1 ef12 = uVar2.f188376p;
        C52271zj0 zj02 = uVar2.f188383w;
        LinkedList<FinderJumpInfo> linkedList = uVar2.f188378r;
        C64237ap1 ap12 = uVar2.f188379s;
        C51411tl0 tl02 = uVar2.f188380t;
        C64472jk0 jk03 = jk02;
        String str3 = str2;
        long j = uVar2.f188381u;
        C51411tl0 tl03 = tl02;
        C64803wi0 wi02 = uVar2.f188386z;
        int i4 = uVar2.f188382v;
        FinderItem finderItem = uVar2.f188377q;
        LinkedList<C64689rq2> linkedList2 = null;
        if (finderItem != null) {
            FinderObject finderObject = finderItem.field_finderObject;
            C64311db1 db13 = db12;
            String str4 = "draftFinderItem.field_finderObject";
            C87412m.m108593f(finderObject, str4);
            LinkedList<FinderJumpInfo> linkedList3 = linkedList;
            C52271zj0 zj03 = zj02;
            FinderObject finderObject2 = finderObject;
            C49277ef1 ef13 = ef12;
            boolean z5 = z3;
            ArrayList<C64589nq2> arrayList2 = arrayList;
            mo90256d(finderObject2, z4, arrayList, i3, z2, finderItem, linkedList3, j);
            FinderObject finderObject3 = finderItem.field_finderObject;
            if (finderObject3.objectDesc == null) {
                finderObject3.objectDesc = new FinderObjectDesc();
            }
            if (pq22 != null) {
                FinderObjectDesc finderObjectDesc = finderItem.field_finderObject.objectDesc;
                C87412m.m108591d(finderObjectDesc);
                C64447ih1 ih12 = finderItem.field_postExtraData;
                C87412m.m108593f(ih12, "draftFinderItem.field_postExtraData");
                String str5 = str4;
                i = i2;
                C64636pq2 pq23 = pq22;
                mo90257e(finderObjectDesc, pq22, uVar, ef13, ih12, str, i2, db13, jk03, arrayList2, ap12, wi02);
                if (z5) {
                    FinderObject finderObject4 = finderItem.field_finderObject;
                    C87412m.m108593f(finderObject4, str5);
                    if (finderObject4.object_extend == null) {
                        finderObject4.object_extend = new C50124kf1();
                    }
                    C50124kf1 kf12 = finderObject4.object_extend;
                    if (kf12 != null) {
                        kf12.f136747f = 1;
                    }
                }
                LinkedList<C64689rq2> linkedList4 = pq23.f184875d;
                if (linkedList4 == null) {
                    linkedList4 = new LinkedList<>();
                }
                finderItem.setMediaExtList(linkedList4);
                str4 = str5;
            } else {
                i = i2;
                FinderObjectDesc finderObjectDesc2 = finderItem.field_finderObject.objectDesc;
                C87412m.m108591d(finderObjectDesc2);
                mo90258f(finderObjectDesc2, ef13, str, i, db13, jk03, arrayList2, ap12, wi02, uVar);
            }
            FinderObjectDesc finderObjectDesc3 = finderItem.field_finderObject.objectDesc;
            if (finderObjectDesc3 != null) {
                finderObjectDesc3.generalReportInfo = tl03;
            }
            if (finderObjectDesc3 != null) {
                if (finderObjectDesc3.client_draft_ext_info == null) {
                    finderObjectDesc3.client_draft_ext_info = new C64365fh0();
                }
                C64365fh0 fh02 = finderObjectDesc3.client_draft_ext_info;
                if (fh02 != null) {
                    fh02.f183134e = zj03;
                }
            }
            C65462u uVar3 = uVar;
            mo90255c(finderItem.field_finderObject.objectDesc, uVar3.f188384x, uVar3.f188385y, wi02 != null ? wi02.f186122e : null);
            FinderObject finderObject5 = finderItem.field_finderObject;
            C87412m.m108593f(finderObject5, str4);
            mo90254b(finderObject5, linkedList3);
            mo90259g(finderItem, arrayList2, uVar3);
            if (!z) {
                mo90260h(finderItem, i, str3, uVar, finderItem.field_finderObject.objectDesc, jk03, 1);
            }
            finderItem.setPostWaiting();
            FinderObject finderObject6 = finderItem.field_finderObject;
            C87412m.m108593f(finderObject6, str4);
            finderItem.setFeedObject(finderObject6);
            finderItem.field_watermarkFlag = i4;
            return finderItem;
        }
        C49277ef1 ef14 = ef12;
        boolean z6 = z3;
        C64311db1 db14 = db12;
        int i5 = i2;
        int i6 = i4;
        C65462u uVar4 = uVar;
        LinkedList<FinderJumpInfo> linkedList5 = linkedList;
        C64636pq2 pq24 = pq22;
        C51411tl0 tl04 = tl03;
        C64803wi0 wi03 = wi02;
        FinderItem finderItem2 = new FinderItem();
        FinderObject finderObject7 = new FinderObject();
        FinderObjectDesc finderObjectDesc4 = new FinderObjectDesc();
        finderObject7.objectDesc = finderObjectDesc4;
        ArrayList<C64589nq2> arrayList3 = arrayList;
        LinkedList<FinderJumpInfo> linkedList6 = linkedList5;
        C52271zj0 zj04 = zj02;
        mo90256d(finderObject7, z4, arrayList3, i3, z2, finderItem2, linkedList6, j);
        C64447ih1 ih13 = finderItem2.field_postExtraData;
        C87412m.m108593f(ih13, "sendObject.field_postExtraData");
        FinderObjectDesc finderObjectDesc5 = finderObjectDesc4;
        int i7 = i4;
        C64237ap1 ap13 = ap12;
        C64636pq2 pq25 = pq24;
        C51411tl0 tl05 = tl03;
        FinderObject finderObject8 = finderObject7;
        mo90257e(finderObjectDesc4, pq24, uVar, ef14, ih13, str, i5, db14, jk03, arrayList3, ap13, wi02);
        if (z6) {
            if (finderObject8.object_extend == null) {
                finderObject8.object_extend = new C50124kf1();
            }
            C50124kf1 kf13 = finderObject8.object_extend;
            if (kf13 != null) {
                kf13.f136747f = 1;
            }
        }
        mo90260h(finderItem2, i5, str3, uVar, finderObjectDesc5, jk03, 0);
        finderItem2.updateFinderObject(finderObject8);
        FinderObjectDesc finderObjectDesc6 = finderObjectDesc5;
        finderObjectDesc6.generalReportInfo = tl05;
        if (finderObjectDesc6.client_draft_ext_info == null) {
            finderObjectDesc6.client_draft_ext_info = new C64365fh0();
        }
        C64365fh0 fh03 = finderObjectDesc6.client_draft_ext_info;
        if (fh03 != null) {
            fh03.f183134e = zj04;
        }
        C65462u uVar5 = uVar;
        long j2 = uVar5.f188384x;
        C64494kj0 kj02 = uVar5.f188385y;
        C64803wi0 wi04 = uVar5.f188386z;
        LinkedList<C64775vi0> linkedList7 = wi04 != null ? wi04.f186122e : null;
        mo90255c(finderObjectDesc6, j2, kj02, linkedList7);
        mo90254b(finderObject8, linkedList6);
        mo90259g(finderItem2, arrayList3, uVar5);
        if (pq25 != null) {
            linkedList2 = pq25.f184875d;
        }
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
        }
        finderItem2.setMediaExtList(linkedList2);
        finderItem2.field_watermarkFlag = i4;
        finderItem2.setPostWaiting();
        String str6 = f190182b;
        Log.m105924i(str6, "finder send post " + C61937h.m72709h(finderObject8));
        return finderItem2;
    }
}
