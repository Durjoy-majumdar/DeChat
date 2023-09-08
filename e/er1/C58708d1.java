package er1;

import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import o40.C61926c;
import qt1.C63329b;
import sk1.C63947a;
import sx3.C110818d0;
import te3.C48924by0;
import te3.C51395th0;
import te3.C64254b81;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64634po2;
import te3.C64686ro2;

/* renamed from: er1.d1 */
public final class C58708d1 {

    /* renamed from: a */
    public static final C58708d1 f168058a = new C58708d1();

    /* renamed from: b */
    public static /* synthetic */ LiveConfig m68188b(C58708d1 d1Var, FinderObject finderObject, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return d1Var.mo83618a(finderObject, i, z);
    }

    /* renamed from: a */
    public final LiveConfig mo83618a(FinderObject finderObject, int i, boolean z) {
        String str;
        LinkedList<FinderMedia> linkedList;
        C64265bq2 bq22;
        C64254b81 b812;
        FinderObject finderObject2 = finderObject;
        C87412m.m108594g(finderObject2, "obj");
        C64273c21 c212 = finderObject2.liveInfo;
        int i2 = 1;
        int i3 = 0;
        boolean z2 = c212 != null && c212.f182394f == 1;
        String str2 = "";
        if (!z2 || c212 == null || (str = c212.f182395g) == null) {
            str = str2;
        }
        if (!z2) {
            i2 = 0;
        } else if (!(c212 == null || (b812 = c212.f182401p) == null)) {
            i2 = b812.f182228d;
        }
        C48924by0 by02 = null;
        byte[] byteArray = (!z2 || c212 == null || (bq22 = c212.f182358D) == null) ? null : bq22.toByteArray();
        if (!z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("convertToLiveConfig liveId:");
            C64273c21 c213 = finderObject2.liveInfo;
            sb.append(c213 != null ? Long.valueOf(c213.f182392d) : null);
            sb.append(",liveStatus:");
            FinderContact finderContact = finderObject2.contact;
            sb.append(finderContact != null ? Integer.valueOf(finderContact.liveStatus) : null);
            sb.append(" nickname:");
            sb.append(finderObject2.nickname);
            Log.m105924i("Finder.FinderLiveDataTransferUtil", sb.toString());
        }
        LiveConfig.C55204b bVar = new LiveConfig.C55204b();
        C58763p pVar = C58763p.f168245a;
        bVar.f157091a = i;
        C64273c21 c214 = finderObject2.liveInfo;
        long j = 0;
        bVar.f157093c = c214 != null ? c214.f182392d : 0;
        bVar.f157106p = finderObject2.objectNonceId;
        bVar.f157101k = finderObject2.f164794id;
        bVar.f157096f = finderObject2.username;
        C58739j4 j4Var = C58739j4.f168176a;
        FinderObjectDesc finderObjectDesc = finderObject2.objectDesc;
        bVar.f157095e = j4Var.mo83719o((finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null) ? null : (FinderMedia) C110818d0.m150916N(linkedList));
        FinderObjectDesc finderObjectDesc2 = finderObject2.objectDesc;
        bVar.f157102l = finderObjectDesc2 != null ? finderObjectDesc2.description : null;
        bVar.f157112v = finderObject2.sessionBuffer;
        bVar.f157099i = str;
        bVar.f157100j = i2;
        bVar.f157114x = Boolean.valueOf(z).booleanValue();
        bVar.f157116z = finderObject2.nickname;
        C64273c21 c215 = finderObject2.liveInfo;
        if (c215 != null) {
            j = c215.f182367M;
        }
        bVar.f157083A = j;
        bVar.f157084B = byteArray;
        if (c215 != null) {
            i3 = c215.f182384X;
        }
        bVar.f157085C = i3;
        if (c215 != null) {
            str2 = C63947a.m75194h(C63947a.f181274a, c215, "convertToLiveConfig", false, 2, (Object) null);
        }
        bVar.f157090H = str2;
        C64273c21 c216 = finderObject2.liveInfo;
        if (c216 != null) {
            by02 = c216.f182402p0;
        }
        pVar.mo83799a(bVar, "convertToLiveConfig", by02);
        LiveConfig a = bVar.mo76374a();
        C64634po2 po22 = new C64634po2();
        po22.f184866d = finderObject2;
        po22.f184867e = finderObject2.liveInfo;
        a.f157062U = po22;
        C63329b bVar2 = C63329b.f179694a;
        bVar2.mo88233d("Finder.FinderLiveDataTransferUtil", "convertToLiveConfig " + a);
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = r3.getLiveInfo();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.util.List<com.tencent.p014mm.protocal.protobuf.FinderObject>, java.lang.Integer> mo83619c(java.util.ArrayList<cm1.C0740i2> r11, cm1.C0740i2 r12) {
        /*
            r10 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "clickFeed"
            gy3.C87412m.m108594g(r12, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0013:
            boolean r1 = r11.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r11.next()
            cm1.i2 r1 = (cm1.C0740i2) r1
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x0013
            er1.j4 r3 = er1.C58739j4.f168176a
            r4 = r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            boolean r3 = r3.mo83686O(r4)
            if (r3 == 0) goto L_0x0013
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r4.mo3513o()
            r4 = 1
            if (r3 == 0) goto L_0x0043
            te3.c21 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L_0x0043
            int r3 = r3.f182394f
            r5 = 2
            if (r3 != r5) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x00bd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "convertToVisitorLiveData feed:"
            r3.append(r5)
            long r5 = r1.getItemId()
            r3.append(r5)
            java.lang.String r5 = ",is click feed:"
            r3.append(r5)
            long r5 = r1.getItemId()
            long r7 = r12.getItemId()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0069
            r2 = 1
        L_0x0069:
            r3.append(r2)
            java.lang.String r2 = ",nickname:"
            r3.append(r2)
            r2 = r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            fe1.q r4 = r2.mo3507l()
            r5 = 0
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = r4.getNickname()
            goto L_0x0081
        L_0x0080:
            r4 = r5
        L_0x0081:
            r3.append(r4)
            java.lang.String r4 = ",live status:"
            r3.append(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            if (r2 == 0) goto L_0x009b
            te3.c21 r2 = r2.getLiveInfo()
            if (r2 == 0) goto L_0x009b
            int r2 = r2.f182394f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
        L_0x009b:
            r3.append(r5)
            r2 = 33
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "Finder.FinderLiveDataTransferUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            long r2 = r1.getItemId()
            long r4 = r12.getItemId()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0013
            r0.add(r1)
            goto L_0x0013
        L_0x00bd:
            r0.add(r1)
            goto L_0x0013
        L_0x00c2:
            int r11 = r0.indexOf(r12)
            if (r11 < 0) goto L_0x00c9
            r2 = r11
        L_0x00c9:
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = sx3.C36907w.m41090l(r0, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r0.iterator()
        L_0x00d8:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r0 = r12.next()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            r11.add(r0)
            goto L_0x00d8
        L_0x00f0:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            rx3.l r0 = new rx3.l
            r0.<init>(r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58708d1.mo83619c(java.util.ArrayList, cm1.i2):rx3.l");
    }

    /* renamed from: d */
    public final void mo83620d(C64279c90 c902, String str) {
        C51395th0 th02;
        FinderObject finderObject;
        C87412m.m108594g(c902, "<this>");
        C87412m.m108594g(str, "tag");
        Log.m105924i("Finder.FinderLiveDataTransferUtil", "EnterLiveParams.logInfo " + str + ", contextId:" + c902.f182444d + ", clickTabContextId:" + c902.f182445e + ", needAnim:" + c902.f182446f + ", tabType:" + c902.f182447g + ", secondaryDeviceFlag:" + c902.f182448h + ", pullMoreType:" + c902.f182449i);
        StringBuilder sb = new StringBuilder();
        sb.append("EnterLiveParams.logInfo ");
        sb.append(str);
        sb.append(", bundleParams enterScene:");
        C64686ro2 ro22 = c902.f182450j;
        String str2 = null;
        sb.append(ro22 != null ? Integer.valueOf(ro22.f185213d) : null);
        sb.append(",commentScene:");
        C64686ro2 ro23 = c902.f182450j;
        sb.append(ro23 != null ? Integer.valueOf(ro23.f185214e) : null);
        sb.append(",nicknameOption:");
        C64686ro2 ro24 = c902.f182450j;
        sb.append(ro24 != null ? ro24.f185215f : null);
        sb.append(",lbsTabTipsInfo:");
        C64686ro2 ro25 = c902.f182450j;
        sb.append(ro25 != null ? ro25.f185217h : null);
        sb.append(",targetFeedObject:");
        C64686ro2 ro26 = c902.f182450j;
        sb.append(C61926c.m72691p((ro26 == null || (finderObject = ro26.f185218i) == null) ? 0 : finderObject.f164794id));
        sb.append(",byPassInfo:");
        C64686ro2 ro27 = c902.f182450j;
        sb.append((ro27 == null || (th02 = ro27.f185219j) == null) ? null : Integer.valueOf(th02.f142216d));
        sb.append(", squareExtraInfo:");
        C64686ro2 ro28 = c902.f182450j;
        sb.append(ro28 != null ? ro28.f185220n : null);
        sb.append(", redPacketId:");
        C64686ro2 ro29 = c902.f182450j;
        if (ro29 != null) {
            str2 = ro29.f185221o;
        }
        sb.append(str2);
        sb.append(", ");
        Log.m105924i("Finder.FinderLiveDataTransferUtil", sb.toString());
    }
}
