package je1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import sk1.C63947a;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C48872bl0;
import te3.C64273c21;

/* renamed from: je1.g2 */
public final class C9311g2 {

    /* renamed from: a */
    public static final C9311g2 f29093a = new C9311g2();

    /* renamed from: a */
    public final String mo10062a(List<? extends FinderObject> list) {
        String str;
        int i;
        int i2;
        Iterator<T> it;
        String str2;
        int i3;
        if (list == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("onCgiBack: count:" + list.size());
        StringBuffer stringBuffer2 = new StringBuffer();
        Iterator<T> it4 = list.iterator();
        int i4 = 0;
        while (it4.hasNext()) {
            T next = it4.next();
            int i5 = i4 + 1;
            if (i4 >= 0) {
                FinderObject finderObject = (FinderObject) next;
                C9311g2 g2Var = f29093a;
                String d = g2Var.mo10065d(finderObject);
                String c = g2Var.mo10064c(finderObject);
                String e = g2Var.mo10066e(finderObject);
                C48872bl0 bl02 = finderObject.foldedLayout;
                if (bl02 != null) {
                    if (bl02.f131182e.size() > 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("PARENT_ID:id:");
                        i3 = i4;
                        sb.append(C61926c.m72691p(finderObject.f164794id));
                        stringBuffer2.append(sb.toString());
                        stringBuffer2.append("FL>>>");
                    } else {
                        i3 = i4;
                    }
                    LinkedList<FinderObject> linkedList = bl02.f131182e;
                    if (linkedList != null) {
                        Iterator<T> it5 = linkedList.iterator();
                        while (it5.hasNext()) {
                            FinderObject finderObject2 = (FinderObject) it5.next();
                            C9311g2 g2Var2 = f29093a;
                            Iterator<T> it6 = it4;
                            C87412m.m108593f(finderObject2, "foldedObj");
                            String d2 = g2Var2.mo10065d(finderObject2);
                            Iterator<T> it7 = it5;
                            String c2 = g2Var2.mo10064c(finderObject2);
                            String e2 = g2Var2.mo10066e(finderObject2);
                            int i6 = i5;
                            stringBuffer2.append("#[id:" + C61926c.m72691p(finderObject2.f164794id) + ",md:" + d2 + ",d:" + c2 + "] " + e2);
                            d = d;
                            it4 = it6;
                            it5 = it7;
                            i5 = i6;
                            i3 = i3;
                            e = e;
                        }
                    }
                    it = it4;
                    i2 = i5;
                    str = e;
                    i = i3;
                    str2 = d;
                    if (bl02.f131182e.size() > 0) {
                        stringBuffer2.append("<<FL\n");
                    }
                } else {
                    it = it4;
                    i = i4;
                    i2 = i5;
                    str = e;
                    str2 = d;
                }
                stringBuffer.append(";[*" + i + " id:" + C61926c.m72691p(finderObject.f164794id) + ",md:" + str2 + ",d:" + c + "] " + str + ',' + C63947a.f181274a.mo88736v(finderObject.liveInfo));
                it4 = it;
                i4 = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (stringBuffer2.length() > 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(10);
            sb4.append(stringBuffer2);
            stringBuffer.append(sb4.toString());
        }
        String stringBuffer3 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer3, "buf.toString()");
        return stringBuffer3;
    }

    /* renamed from: b */
    public final String mo10063b(List<? extends C0740i2> list) {
        if (list == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("count:" + list.size() + " \n");
        for (C0740i2 i2Var : list) {
            if (i2Var instanceof BaseFinderFeed) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                StringBuilder sb = new StringBuilder();
                sb.append("id:");
                sb.append(C61926c.m72691p(baseFinderFeed.mo3513o().getId()));
                sb.append(" nick:");
                sb.append(baseFinderFeed.mo3513o().getNickName());
                sb.append(" livestate:");
                C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                sb.append(liveInfo != null ? Integer.valueOf(liveInfo.f182394f) : null);
                sb.append(" \n");
                stringBuffer.append(sb.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i2Var);
                sb4.append(10);
                stringBuffer.append(sb4.toString());
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "stringBuffer.toString()");
        return stringBuffer2;
    }

    /* renamed from: c */
    public final String mo10064c(FinderObject finderObject) {
        String str;
        C87412m.m108594g(finderObject, "<this>");
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        if (finderObjectDesc == null || (str = finderObjectDesc.description) == null) {
            return "";
        }
        String substring = str.substring(0, Math.min(str.length(), 7));
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r2 = (r2 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) sx3.C110818d0.m150917O((r2 = r2.media), 0)).url;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10065d(com.tencent.p014mm.protocal.protobuf.FinderObject r2) {
        /*
            r1 = this;
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x001f
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r2.media
            if (r2 == 0) goto L_0x001f
            r0 = 0
            java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderMedia r2 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r2
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.url
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 != 0) goto L_0x0024
            java.lang.String r2 = ""
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9311g2.mo10065d(com.tencent.mm.protocal.protobuf.FinderObject):java.lang.String");
    }

    /* renamed from: e */
    public final String mo10066e(FinderObject finderObject) {
        LinkedList<FinderMedia> linkedList;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia;
        C87412m.m108594g(finderObject, "<this>");
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        int i = -1;
        int i2 = finderObjectDesc != null ? finderObjectDesc.mediaType : -1;
        int i3 = 0;
        if (!(finderObjectDesc == null || (linkedList2 = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150917O(linkedList2, 0)) == null)) {
            i = finderMedia.mediaType;
        }
        FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
        if (!(finderObjectDesc2 == null || (linkedList = finderObjectDesc2.media) == null)) {
            i3 = linkedList.size();
        }
        return "t:" + i2 + ',' + i + ";s:" + i3;
    }
}
