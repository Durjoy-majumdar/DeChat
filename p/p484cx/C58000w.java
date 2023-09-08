package p484cx;

import di3.C86301e;
import ei3.C86522b;
import p145dx.C7527z;

@C86522b
/* renamed from: cx.w */
public final class C58000w extends C86301e implements C7527z {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wj2.C66132f sm0(com.tencent.p014mm.protocal.protobuf.FinderObject r11, com.tencent.p014mm.protocal.protobuf.FinderMedia r12) {
        /*
            r10 = this;
            java.lang.String r0 = "finderObject"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "media"
            gy3.C87412m.m108594g(r12, r0)
            wj2.f r0 = new wj2.f
            r0.<init>()
            r1 = 0
            r0.f190079b = r1
            int r1 = r12.videoDuration
            long r1 = (long) r1
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r1 = r1 * r3
            r0.f190080c = r1
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r11.contact
            r2 = 1
            r3 = 0
            java.lang.String r4 = "getContext().getString(R.string.finder_resource)"
            r5 = 2131829767(0x7f112407, float:1.9292512E38)
            r6 = 0
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = r1.nickname
            if (r1 == 0) goto L_0x0064
            int r7 = r1.length()
            if (r7 <= 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            if (r7 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = r6
        L_0x003a:
            if (r1 == 0) goto L_0x0064
            r0.f190087j = r1
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131834877(0x7f1137fd, float:1.9302877E38)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r3] = r1
            java.lang.String r1 = r7.getString(r8, r9)
            java.lang.String r7 = "getContext().getString(R…tone_finder_resource, it)"
            gy3.C87412m.m108593f(r1, r7)
            r0.f190085h = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = r1.getString(r5)
            gy3.C87412m.m108593f(r1, r4)
            r0.f190086i = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0065
        L_0x0064:
            r1 = r6
        L_0x0065:
            if (r1 != 0) goto L_0x0093
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131829768(0x7f112408, float:1.9292514E38)
            java.lang.String r1 = r1.getString(r7)
            java.lang.String r7 = "getContext().getString(R…g.finder_resource_author)"
            gy3.C87412m.m108593f(r1, r7)
            r0.f190087j = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = r1.getString(r5)
            gy3.C87412m.m108593f(r1, r4)
            r0.f190085h = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = r1.getString(r5)
            gy3.C87412m.m108593f(r1, r4)
            r0.f190086i = r1
        L_0x0093:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r11.objectDesc
            if (r1 == 0) goto L_0x0102
            te3.l93 r1 = r1.originalsound_info
            if (r1 == 0) goto L_0x0102
            java.lang.String r4 = r1.f137266d
            if (r4 == 0) goto L_0x00b3
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x00a7
            r5 = 1
            goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            if (r5 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r4 = r6
        L_0x00ac:
            if (r4 == 0) goto L_0x00b3
            r0.f190085h = r4
            r0.f190086i = r4
            goto L_0x0102
        L_0x00b3:
            java.lang.String r4 = r1.f137269g
            if (r4 == 0) goto L_0x00cb
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x00bf
            r5 = 1
            goto L_0x00c0
        L_0x00bf:
            r5 = 0
        L_0x00c0:
            if (r5 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r4 = r6
        L_0x00c4:
            if (r4 == 0) goto L_0x00cb
            r0.f190085h = r4
            r0.f190086i = r4
            goto L_0x0102
        L_0x00cb:
            java.lang.String r4 = r1.f137267e
            java.lang.String r1 = r1.f137268f
            if (r4 == 0) goto L_0x0102
            if (r1 == 0) goto L_0x0102
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x00db
            r5 = 1
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            if (r5 == 0) goto L_0x0102
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x00e6
            r5 = 1
            goto L_0x00e7
        L_0x00e6:
            r5 = 0
        L_0x00e7:
            if (r5 == 0) goto L_0x0102
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r7 = " - "
            r5.append(r7)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r0.mo90181l(r1)
            r0.f190086i = r4
        L_0x0102:
            long r4 = r11.f164794id
            r0.f190092o = r4
            java.lang.String r1 = r11.objectNonceId
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x010d
            r1 = r4
        L_0x010d:
            r0.f190093p = r1
            java.lang.String r1 = r11.username
            if (r1 != 0) goto L_0x0114
            r1 = r4
        L_0x0114:
            r0.f190103z = r1
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r11.contact
            if (r1 == 0) goto L_0x011c
            java.lang.String r6 = r1.headUrl
        L_0x011c:
            if (r6 != 0) goto L_0x011f
            r6 = r4
        L_0x011f:
            r0.f190097t = r6
            if (r1 == 0) goto L_0x013a
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r1.authInfo
            if (r1 == 0) goto L_0x013a
            java.lang.String r5 = r1.authIconUrl
            if (r5 != 0) goto L_0x012c
            r5 = r4
        L_0x012c:
            r0.f190098u = r5
            java.lang.String r1 = r1.authProfession
            if (r1 != 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r4 = r1
        L_0x0134:
            r0.f190099v = r4
            r0.f190100w = r3
            r0.f190101x = r3
        L_0x013a:
            d03.a r1 = r0.f190078a
            java.lang.String r4 = "A0"
            if (r1 != 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r1.f165946r = r4
        L_0x0143:
            r0.mo90182m(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r12.thumbUrl
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r1.append(r2)
            java.lang.String r2 = r12.thumb_url_token
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "<set-?>"
            gy3.C87412m.m108594g(r1, r2)
            r0.f190088k = r1
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.t1 r1 = (ht1.C60200t1) r1
            long r5 = r11.f164794id
            d03.a r12 = r1.mo76884uQ(r12, r5, r3)
            if (r12 == 0) goto L_0x0191
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r12.f165948t
            r1.append(r2)
            java.lang.String r2 = ".ring"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r12.f165948t = r1
            r0.f190078a = r12
            r12.f165946r = r4
        L_0x0191:
            r0.f190081d = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p484cx.C58000w.sm0(com.tencent.mm.protocal.protobuf.FinderObject, com.tencent.mm.protocal.protobuf.FinderMedia):wj2.f");
    }
}
