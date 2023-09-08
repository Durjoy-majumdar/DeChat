package je1;

import bd1.C39759i;
import bd1.C54447c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C47350c;
import p565ir.C60606n;
import p749xh.C66276va;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49686hc1;
import te3.C49712hj1;
import te3.C51274so0;
import te3.C64257bc1;
import te3.C64685ro0;
import wp1.C66169h;
import zc1.C66785b;

/* renamed from: je1.o3 */
public final class C60806o3 extends C60628i {

    /* renamed from: p */
    public static final C60807a f173187p = new C60807a((C8480h) null);

    /* renamed from: g */
    public C47350c f173188g;

    /* renamed from: h */
    public C11385n f173189h;

    /* renamed from: i */
    public int f173190i;

    /* renamed from: j */
    public int f173191j;

    /* renamed from: n */
    public final LinkedList<C66276va> f173192n;

    /* renamed from: o */
    public int f173193o;

    /* renamed from: je1.o3$a */
    public static final class C60807a {
        public C60807a(C8480h hVar) {
        }

        /* renamed from: c */
        public static /* synthetic */ byte[] m71190c(C60807a aVar, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                str = C66785b.f191882e.mo90662O5();
            }
            return aVar.mo85729b(i, i2, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            if (r2 == null) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            if (r2 == null) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r2 == null) goto L_0x002a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final byte[] mo85728a(int r5, java.lang.String r6) {
            /*
                r4 = this;
                zc1.b r0 = zc1.C66785b.f191882e
                r1 = 1
                bd1.b r0 = r0.mo90661N1(r6, r1)
                r1 = 3
                r2 = 0
                java.lang.String r3 = ""
                if (r5 == r1) goto L_0x0022
                r1 = 4
                if (r5 == r1) goto L_0x001b
                r1 = 5
                if (r5 == r1) goto L_0x0014
                goto L_0x002a
            L_0x0014:
                if (r0 == 0) goto L_0x0018
                java.lang.String r2 = r0.field_messageFollowBuf
            L_0x0018:
                if (r2 != 0) goto L_0x0029
                goto L_0x002a
            L_0x001b:
                if (r0 == 0) goto L_0x001f
                java.lang.String r2 = r0.field_messageCommentBuf
            L_0x001f:
                if (r2 != 0) goto L_0x0029
                goto L_0x002a
            L_0x0022:
                if (r0 == 0) goto L_0x0026
                java.lang.String r2 = r0.field_messageLikeBuf
            L_0x0026:
                if (r2 != 0) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r3 = r2
            L_0x002a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "getBufByUserName type:"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = " finderUserName:"
                r0.append(r5)
                r0.append(r6)
                java.lang.String r5 = " userBuf:"
                r0.append(r5)
                r0.append(r3)
                java.lang.String r5 = r0.toString()
                java.lang.String r6 = "Finder.NetSceneFinderGetMentionList"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                byte[] r5 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r3)
                java.lang.String r6 = "decodeHexString(buf)"
                gy3.C87412m.m108593f(r5, r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: je1.C60806o3.C60807a.mo85728a(int, java.lang.String):byte[]");
        }

        /* renamed from: b */
        public final byte[] mo85729b(int i, int i2, String str) {
            int i3 = i;
            int i4 = i2;
            String str2 = str;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_WRITE_INT_SYNC;
            C87412m.m108594g(str2, "finderUserName");
            char c = i3 != 1 ? i3 != 2 ? (char) 0 : 1 : 2;
            if (c == 2) {
                if (i4 == 1) {
                    Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
                    C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
                    byte[] decodeHexString = Util.decodeHexString((String) f);
                    if (decodeHexString == null && C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 0), 1)) {
                        C117407d.INSTANCE.idkeyStat(1279, 55, 1, false);
                    }
                    C87412m.m108593f(decodeHexString, "lastBuf");
                    return decodeHexString;
                } else if (i4 == 2) {
                    Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC, "");
                    C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.String");
                    byte[] decodeHexString2 = Util.decodeHexString((String) f2);
                    if (decodeHexString2 == null && C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(aVar, 0), 1)) {
                        C117407d.INSTANCE.idkeyStat(1279, 56, 1, false);
                    }
                    C87412m.m108593f(decodeHexString2, "lastBuf");
                    return decodeHexString2;
                } else if (i4 == 3) {
                    byte[] a = mo85728a(i4, str2);
                    C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 0), 1);
                    return a;
                } else if (i4 == 4) {
                    byte[] a2 = mo85728a(i4, str2);
                    C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 0), 1);
                    return a2;
                } else if (i4 == 5) {
                    byte[] a3 = mo85728a(i4, str2);
                    C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_WRITE_INT_SYNC, 0), 1);
                    return a3;
                }
            } else if (c == 1) {
                if (i4 == 1) {
                    Object f3 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
                    C87412m.m108592e(f3, "null cannot be cast to non-null type kotlin.String");
                    byte[] decodeHexString3 = Util.decodeHexString((String) f3);
                    if (decodeHexString3 == null && C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(aVar, 0), 1)) {
                        C117407d.INSTANCE.idkeyStat(1279, 57, 1, false);
                    }
                    C87412m.m108593f(decodeHexString3, "lastBuf");
                    return decodeHexString3;
                } else if (i4 == 7) {
                    Object f4 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_LIKE_MSG_LAST_BUF_STRING_SYNC, "");
                    C87412m.m108592e(f4, "null cannot be cast to non-null type kotlin.String");
                    byte[] decodeHexString4 = Util.decodeHexString((String) f4);
                    C87412m.m108593f(decodeHexString4, "decodeHexString(MMKernel…RING_SYNC, \"\") as String)");
                    return decodeHexString4;
                } else if (i4 == 8) {
                    Object f5 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_COMMENT_MSG_LAST_BUF_STRING_SYNC, "");
                    C87412m.m108592e(f5, "null cannot be cast to non-null type kotlin.String");
                    byte[] decodeHexString5 = Util.decodeHexString((String) f5);
                    C87412m.m108593f(decodeHexString5, "decodeHexString(MMKernel…RING_SYNC, \"\") as String)");
                    return decodeHexString5;
                }
            }
            return new byte[0];
        }

        /* renamed from: d */
        public final void mo85730d(int i, byte[] bArr, String str) {
            C54447c cVar = new C54447c(str);
            if (i == 3) {
                cVar.field_messageLikeBuf = Util.encodeHexString(bArr);
            } else if (i == 4) {
                cVar.field_messageCommentBuf = Util.encodeHexString(bArr);
            } else if (i == 5) {
                cVar.field_messageFollowBuf = Util.encodeHexString(bArr);
            }
            C66785b.f191882e.mo90672m1(cVar, C39759i.FINDER_GET_MENTION_LIST);
        }

        /* renamed from: e */
        public final void mo85731e(int i, int i2, byte[] bArr, String str) {
            C87412m.m108594g(bArr, "lastBuf");
            C87412m.m108594g(str, "finderUserName");
            char c = i != 1 ? i != 2 ? (char) 0 : 1 : 2;
            if (c == 2) {
                if (i2 == 1) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, Util.encodeHexString(bArr));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                } else if (i2 == 2) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC, Util.encodeHexString(bArr));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                } else if (i2 == 3) {
                    mo85730d(i2, bArr, str);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                } else if (i2 == 4) {
                    mo85730d(i2, bArr, str);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                } else if (i2 == 5) {
                    mo85730d(i2, bArr, str);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                }
            } else if (c != 1) {
            } else {
                if (i2 == 1) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, Util.encodeHexString(bArr));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                } else if (i2 == 7) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_LIKE_MSG_LAST_BUF_STRING_SYNC, Util.encodeHexString(bArr));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                } else if (i2 == 8) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_COMMENT_MSG_LAST_BUF_STRING_SYNC, Util.encodeHexString(bArr));
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_GET_WX_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60806o3(int i, int i2, String str) {
        super((C49712hj1) null, 1, (C8480h) null);
        Object obj;
        C87412m.m108594g(str, "username");
        int i3 = 1;
        this.f173192n = new LinkedList<>();
        this.f173190i = i2;
        this.f173191j = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 978;
        C64685ro0 ro02 = new C64685ro0();
        ro02.f185212i = i2;
        ro02.f185208e = C89349b.m111674a(f173187p.mo85729b(i, i2, str));
        int i4 = this.f173191j;
        if (i4 == 1) {
            i3 = 2;
        } else if (i4 != 2) {
            i3 = 0;
        }
        ro02.f185210g = i3;
        ro02.f185209f = str;
        ro02.f185211h = C46523h2.f125330a.mo71859a(978);
        bVar.f127066a = ro02;
        bVar.f127067b = new C51274so0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetmentionlist";
        this.f173188g = bVar.mo72403a();
        StringBuilder sb = new StringBuilder();
        sb.append("NetSceneFinderGetMentionList init, scene ");
        sb.append(i);
        sb.append(" type ");
        sb.append(i2);
        sb.append(" lastBuf ");
        C89349b bVar2 = ro02.f185208e;
        if (bVar2 == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(bVar2.f257327a.length);
        }
        sb.append(obj);
        Log.m105924i("Finder.NetSceneFinderGetMentionList", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173189h = nVar;
        return dispatch(gVar, this.f173188g, this);
    }

    public int getType() {
        return 978;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105924i("Finder.NetSceneFinderGetMentionList", "errType " + i4 + ", errCode " + i5 + ", errMsg " + str2);
        if (i4 == 0 && i5 == 0) {
            C47465a aVar = this.f173188g.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMentionListResponse");
            C89349b bVar = ((C51274so0) aVar).f141645e;
            C47465a aVar2 = this.f173188g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMentionListResponse");
            C49686hc1 hc12 = ((C51274so0) aVar2).f141644d;
            C47465a aVar3 = this.f173188g.f127055a.f127080a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetMentionListRequest");
            String str3 = ((C64685ro0) aVar3).f185209f;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            Log.m105924i("Finder.NetSceneFinderGetMentionList", " finderUserName:" + str3);
            if (hc12 != null) {
                Log.m105924i("Finder.NetSceneFinderGetMentionList", "GetMentionList size " + hc12.f134566d.size());
                LinkedList<C64257bc1> linkedList = hc12.f134566d;
                C87412m.m108593f(linkedList, "it.mentions");
                linkedList.isEmpty();
                LinkedList<C64257bc1> linkedList2 = hc12.f134566d;
                C87412m.m108593f(linkedList2, "mentionList.mentions");
                for (C64257bc1 bc12 : linkedList2) {
                    LinkedList<C66276va> linkedList3 = this.f173192n;
                    C66169h.C66170a aVar4 = C66169h.f190180a;
                    int i6 = this.f173191j;
                    C87412m.m108593f(bc12, "mention");
                    linkedList3.add(aVar4.mo90251j(i6, bc12, str3));
                    str4 = str4;
                }
                String str5 = str4;
                LinkedList<C64257bc1> linkedList4 = hc12.f134566d;
                C87412m.m108593f(linkedList4, "it.mentions");
                linkedList4.isEmpty();
                LinkedList<C64257bc1> linkedList5 = hc12.f134566d;
                C87412m.m108593f(linkedList5, "mentionList.mentions");
                for (C64257bc1 bc13 : linkedList5) {
                    if (bc13.f182262f == 10 && !Util.isNullOrNil(bc13.f182249F)) {
                        Log.m105924i("Finder.NetSceneFinderGetMentionList", "MENTION_TYPE_FOLLOW_APPLICATION APPROVED, clean db, username:" + bc13.f182278y + ", clientMsgId:" + bc13.f182249F + " scene:" + this.f173191j);
                        C66169h.C66170a aVar5 = C66169h.f190180a;
                        String str6 = bc13.f182249F;
                        if (str6 == null) {
                            str6 = str5;
                        }
                        aVar5.mo90249h(str6, this.f173191j);
                    }
                }
                if (!this.f173192n.isEmpty()) {
                    C66169h.f190180a.mo90248g(this.f173192n, this.f173191j);
                    if (this.f173191j == 1 && this.f173190i == 2) {
                        LinkedList<C64257bc1> linkedList6 = hc12.f134566d;
                        C87412m.m108593f(linkedList6, "mentionList.mentions");
                        ((C60606n) C86312j.m106911c(C60606n.class)).mo85014KM(linkedList6);
                    }
                }
            }
            if (bVar != null) {
                f173187p.mo85731e(this.f173191j, this.f173190i, bVar.mo123703f(), str3);
            }
            if (bVar != null && bVar.f257327a.length == 0) {
                int i7 = this.f173191j;
                char c = i7 != 1 ? i7 != 2 ? (char) 0 : 1 : 2;
                if (c == 2) {
                    int i8 = this.f173190i;
                    if (i8 == 1) {
                        C117407d.INSTANCE.idkeyStat(1279, 50, 1, false);
                    } else if (i8 == 2) {
                        C117407d.INSTANCE.idkeyStat(1279, 51, 1, false);
                    }
                } else if (c == 1) {
                    C117407d.INSTANCE.idkeyStat(1279, 52, 1, false);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("lastBuf ");
            sb.append(bVar == null ? "null" : Integer.valueOf(bVar.f257327a.length));
            Log.m105924i("Finder.NetSceneFinderGetMentionList", sb.toString());
        }
        C11385n nVar = this.f173189h;
        if (nVar != null) {
            nVar.onSceneEnd(i4, i5, str2, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60806o3(int i, int i2, String str, int i3, C8480h hVar) {
        this(i, i2, (i3 & 4) != 0 ? C66785b.f191882e.mo90662O5() : str);
    }
}
