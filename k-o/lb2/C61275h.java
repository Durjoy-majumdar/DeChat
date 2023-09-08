package lb2;

import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C50882pv2;
import te3.C51235sf0;
import te3.C51305sv2;
import te3.C51388tf0;
import te3.C52145yo1;
import te3.C64299cw2;
import te3.C64332dw2;
import te3.C64488kb1;
import te3.C64850yb1;

/* renamed from: lb2.h */
public final class C61275h {

    /* renamed from: a */
    public static final C61275h f174381a = new C61275h();

    /* renamed from: a */
    public final void mo86259a(FinderObject finderObject) {
        LinkedList<C51235sf0> linkedList;
        T t;
        C52145yo1 yo12;
        C50882pv2 pv22;
        C51305sv2 sv22;
        LinkedList<C64299cw2> linkedList2;
        C87412m.m108594g(finderObject, "obj");
        C51388tf0 tf02 = finderObject.attachmentList;
        LinkedList<FinderMedia> linkedList3 = null;
        if (!(tf02 == null || (linkedList = tf02.f142195d) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                boolean z = true;
                if (((C51235sf0) t).f141468d != 1) {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C51235sf0 sf02 = (C51235sf0) t;
            if (!(sf02 == null || (yo12 = sf02.f141469e) == null || (pv22 = yo12.f145435e) == null || (sv22 = pv22.f140009f) == null || (linkedList2 = sv22.f141781e) == null)) {
                LinkedList<FinderMedia> linkedList4 = new LinkedList<>();
                for (C64299cw2 cw22 : linkedList2) {
                    C87412m.m108594g(cw22, "<this>");
                    FinderMedia finderMedia = new FinderMedia();
                    finderMedia.url = cw22.f182576d;
                    finderMedia.thumbUrl = cw22.f182577e;
                    finderMedia.mediaType = 4;
                    finderMedia.videoDuration = cw22.f182579g;
                    finderMedia.width = cw22.f182580h;
                    finderMedia.height = cw22.f182581i;
                    finderMedia.md5sum = cw22.f182582j;
                    finderMedia.fileSize = cw22.f182583n;
                    finderMedia.bitrate = cw22.f182584o;
                    LinkedList<C64850yb1> linkedList5 = finderMedia.spec;
                    linkedList5.clear();
                    LinkedList<C64332dw2> linkedList6 = cw22.f182591v;
                    C87412m.m108593f(linkedList6, "spec");
                    LinkedList linkedList7 = new LinkedList();
                    for (C64332dw2 dw22 : linkedList6) {
                        C87412m.m108594g(dw22, "<this>");
                        C64850yb1 yb12 = new C64850yb1();
                        yb12.f186466d = dw22.f182896d;
                        yb12.f186467e = dw22.f182897e;
                        yb12.f186468f = dw22.f182898f;
                        yb12.f186469g = dw22.f182899g;
                        linkedList7.add(yb12);
                    }
                    linkedList5.addAll(linkedList7);
                    finderMedia.coverUrl = cw22.f182586q;
                    finderMedia.decodeKey = cw22.f182585p;
                    finderMedia.url_token = cw22.f182588s;
                    finderMedia.thumb_url_token = cw22.f182589t;
                    finderMedia.cover_url_token = cw22.f182590u;
                    finderMedia.hls_spec = cw22.f182592w;
                    finderMedia.hot_flag = cw22.f182594y;
                    finderMedia.half_rect = cw22.f182595z;
                    finderMedia.full_thumb_url = cw22.f182571A;
                    finderMedia.full_thumb_url_token = cw22.f182572B;
                    linkedList4.add(finderMedia);
                }
                linkedList3 = linkedList4;
            }
        }
        if (linkedList3 != null) {
            Log.m105924i("MicroMsg.Mv.MvLogic", "convertFinderLongVideoDuration replace success " + finderObject.f164794id);
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            if (finderObjectDesc != null) {
                finderObjectDesc.media = linkedList3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r4 = r2.objectDesc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86260b(te3.C64621p23 r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "mvData"
            gy3.C87412m.m108594g(r0, r1)
            fe1.d$b r1 = fe1.C58961d.f168673a
            zc1.b r2 = zc1.C66785b.f191882e
            java.lang.String r2 = r2.mo90662O5()
            fe1.q r1 = r1.mo84155b(r2)
            if (r1 == 0) goto L_0x0149
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f184739d
            if (r2 != 0) goto L_0x001b
            goto L_0x0046
        L_0x001b:
            com.tencent.mm.protocal.protobuf.FinderContact r3 = new com.tencent.mm.protocal.protobuf.FinderContact
            r3.<init>()
            java.lang.String r4 = r1.getUsername()
            r3.username = r4
            java.lang.String r4 = r1.getNickname()
            r3.nickname = r4
            java.lang.String r4 = r1.getAvatarUrl()
            r3.headUrl = r4
            java.lang.String r4 = r1.getSignature()
            r3.signature = r4
            java.lang.String r4 = r1.field_coverImg
            r3.coverImgUrl = r4
            java.lang.String r4 = r1.field_liveCoverImg
            r3.liveCoverImgUrl = r4
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r4 = r1.field_authInfo
            r3.authInfo = r4
            r2.contact = r3
        L_0x0046:
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f184739d
            if (r2 == 0) goto L_0x0051
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r2.objectDesc
            if (r4 == 0) goto L_0x0051
            te3.hb1 r4 = r4.mvInfo
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r0.f184740e
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x005e
            int r4 = r4.f183461j
            if (r4 != r6) goto L_0x005e
            r4 = 1
            goto L_0x005f
        L_0x005e:
            r4 = 0
        L_0x005f:
            if (r4 == 0) goto L_0x0070
            if (r2 == 0) goto L_0x006e
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x006e
            te3.hb1 r2 = r2.mvInfo
            if (r2 == 0) goto L_0x006e
            java.util.LinkedList<te3.mb1> r2 = r2.f183460i
            goto L_0x007c
        L_0x006e:
            r2 = 0
            goto L_0x007c
        L_0x0070:
            if (r2 == 0) goto L_0x006e
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x006e
            te3.hb1 r2 = r2.mvInfo
            if (r2 == 0) goto L_0x006e
            java.util.LinkedList<te3.mb1> r2 = r2.f183455d
        L_0x007c:
            if (r2 == 0) goto L_0x0104
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r8 = 0
            r9 = 0
        L_0x0085:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0102
            java.lang.Object r10 = r2.next()
            te3.mb1 r10 = (te3.C64550mb1) r10
            int r11 = r10.f184259e
            int r4 = r4 + r11
            long r12 = r10.f184260f
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00e5
            int r8 = r8 + r11
            java.lang.String r11 = "refList"
            gy3.C87412m.m108593f(r5, r11)
            java.util.Iterator r11 = r5.iterator()
        L_0x00a7:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00e2
            java.lang.Object r12 = r11.next()
            com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
            long r13 = r12.f164794id
            r16 = r4
            long r3 = r10.f184260f
            int r17 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r17 != 0) goto L_0x00bf
            r3 = 1
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r12 = 0
        L_0x00c4:
            if (r12 == 0) goto L_0x00df
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r12.contact
            if (r3 == 0) goto L_0x00cd
            java.lang.String r3 = r3.username
            goto L_0x00ce
        L_0x00cd:
            r3 = 0
        L_0x00ce:
            java.lang.String r4 = r1.getUsername()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r12 = 0
        L_0x00da:
            if (r12 == 0) goto L_0x00df
            int r3 = r10.f184259e
            int r9 = r9 + r3
        L_0x00df:
            r4 = r16
            goto L_0x00a7
        L_0x00e2:
            r16 = r4
            goto L_0x00ff
        L_0x00e5:
            r16 = r4
            java.lang.String r3 = r10.f184261g
            if (r3 == 0) goto L_0x00f8
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00f3
            r3 = 1
            goto L_0x00f4
        L_0x00f3:
            r3 = 0
        L_0x00f4:
            if (r3 != r6) goto L_0x00f8
            r3 = 1
            goto L_0x00f9
        L_0x00f8:
            r3 = 0
        L_0x00f9:
            if (r3 == 0) goto L_0x00ff
            int r3 = r10.f184259e
            int r8 = r8 + r3
            int r9 = r9 + r3
        L_0x00ff:
            r4 = r16
            goto L_0x0085
        L_0x0102:
            r7 = r4
            goto L_0x0106
        L_0x0104:
            r8 = 0
            r9 = 0
        L_0x0106:
            if (r7 <= 0) goto L_0x0149
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f184739d
            if (r0 == 0) goto L_0x0113
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0113
            te3.hb1 r3 = r0.mvInfo
            goto L_0x0114
        L_0x0113:
            r3 = 0
        L_0x0114:
            if (r3 != 0) goto L_0x0117
            goto L_0x0149
        L_0x0117:
            te3.jb1 r0 = new te3.jb1
            r0.<init>()
            float r1 = (float) r8
            float r2 = (float) r7
            float r1 = r1 / r2
            r0.f183776e = r1
            float r1 = (float) r9
            float r1 = r1 / r2
            r0.f183775d = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "createPostData completion:"
            r1.append(r2)
            float r2 = r0.f183776e
            r1.append(r2)
            java.lang.String r2 = ", orignality:"
            r1.append(r2)
            float r2 = r0.f183775d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Mv.MvLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r3.f183457f = r0
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lb2.C61275h.mo86260b(te3.p23):void");
    }

    /* renamed from: c */
    public final String mo86261c(C64488kb1 kb12) {
        C87412m.m108594g(kb12, "<this>");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("songId: ");
        stringBuffer.append(kb12.f183909i);
        stringBuffer.append("\n");
        stringBuffer.append("songName: ");
        stringBuffer.append(kb12.f183904d);
        stringBuffer.append("\n");
        stringBuffer.append("singer: ");
        stringBuffer.append(kb12.f183905e);
        stringBuffer.append("\n");
        stringBuffer.append("albumName: ");
        stringBuffer.append(kb12.f183911n);
        stringBuffer.append("\n");
        stringBuffer.append("albumUrl: ");
        stringBuffer.append(kb12.f183912o);
        stringBuffer.append("\n");
        stringBuffer.append("genre: ");
        stringBuffer.append(kb12.f183913p);
        stringBuffer.append("\n");
        stringBuffer.append("publicTime: ");
        stringBuffer.append(kb12.f183915r);
        stringBuffer.append("\n");
        stringBuffer.append("duration: ");
        stringBuffer.append(kb12.f183918u);
        stringBuffer.append("\n");
        stringBuffer.append("dataUrl: ");
        stringBuffer.append(kb12.f183906f);
        stringBuffer.append("\n");
        stringBuffer.append("webUrl: ");
        stringBuffer.append(kb12.f183908h);
        stringBuffer.append("\n");
        stringBuffer.append("songLyric: ");
        stringBuffer.append(kb12.f183910j);
        stringBuffer.append("\n");
        return "FinderMVSongInfo " + stringBuffer;
    }
}
