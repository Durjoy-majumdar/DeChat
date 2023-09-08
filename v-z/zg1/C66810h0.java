package zg1;

import cl1.C54991o;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C48654a21;
import te3.C49476fv0;
import te3.C51424to2;
import te3.C52013xs0;
import te3.C64273c21;
import te3.C64640px0;
import yg1.C16006g;

/* renamed from: zg1.h0 */
public final class C66810h0 extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66810h0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        T t;
        C89349b bVar;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia;
        FinderObjectDesc finderObjectDesc2;
        LinkedList<FinderMedia> linkedList3;
        FinderMedia finderMedia2;
        FinderObjectDesc finderObjectDesc3;
        C64273c21 c212;
        Class cls = C54991o.class;
        C87412m.m108594g(linkedList, "msgList");
        C54991o oVar = (C54991o) this.f43066a.mo71262a(cls);
        String str = "";
        Iterator<T> it = linkedList.iterator();
        FinderObjectDesc finderObjectDesc4 = null;
        if (!it.hasNext()) {
            t = null;
        } else {
            t = it.next();
            if (it.hasNext()) {
                long j = ((C52013xs0) t).f144913r;
                do {
                    T next = it.next();
                    long j2 = ((C52013xs0) next).f144913r;
                    if (j < j2) {
                        t = next;
                        j = j2;
                    }
                } while (it.hasNext());
            }
        }
        C52013xs0 xs02 = (C52013xs0) t;
        long j3 = 0;
        if ((xs02 != null ? xs02.f144913r : 0) >= oVar.f154386x3) {
            if (!(xs02 == null || (bVar = xs02.f144906h) == null)) {
                oVar.f154386x3 = xs02.f144913r;
                C49476fv0 fv02 = new C49476fv0();
                boolean z = true;
                int i = 0;
                try {
                    fv02.parseFrom(bVar.mo123703f());
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", str, e);
                }
                Log.m105924i(oVar.f154311f, "updateCoverInfo updateFinderInfo.cover_img:" + fv02.f133703e);
                C51424to2 to22 = fv02.f133703e;
                if (to22 != null) {
                    String str2 = to22.f142308d;
                    String str3 = fv02.f133704f;
                    String str4 = fv02.f133702d;
                    Log.m105924i(oVar.f154311f, "updateCoverInfo url:" + str2 + " token:" + str3 + " desc:" + str4);
                    if (!(str2 == null || str2.length() == 0)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        if (str3 != null) {
                            str = str3;
                        }
                        sb.append(str);
                        String sb4 = sb.toString();
                        oVar.f154342n1 = sb4;
                        FinderObject finderObject = oVar.f154341n;
                        if (finderObject == null || (c212 = finderObject.liveInfo) == null || c212.f182410x != 1) {
                            z = false;
                        }
                        if (!z) {
                            C64640px0 px02 = (finderObject == null || (finderObjectDesc3 = finderObject.objectDesc) == null) ? null : finderObjectDesc3.liveDesc;
                            if (px02 != null) {
                                px02.f184911d = sb4;
                            }
                        }
                        if (!(finderObject == null || (finderObjectDesc2 = finderObject.objectDesc) == null || (linkedList3 = finderObjectDesc2.media) == null || (finderMedia2 = (FinderMedia) C110818d0.m150916N(linkedList3)) == null)) {
                            finderMedia2.thumbUrl = sb4;
                            finderMedia2.width = (float) to22.f142310f;
                            finderMedia2.height = (float) to22.f142309e;
                        }
                    }
                    FinderObject finderObject2 = oVar.f154341n;
                    FinderObjectDesc finderObjectDesc5 = finderObject2 != null ? finderObject2.objectDesc : null;
                    if (finderObjectDesc5 != null) {
                        finderObjectDesc5.description = str4;
                    }
                    oVar.f154252S0 = str4;
                }
                FinderObject finderObject3 = oVar.f154341n;
                if (!(finderObject3 == null || (finderObjectDesc = finderObject3.objectDesc) == null || (linkedList2 = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList2)) == null)) {
                    LinkedList<C48654a21> linkedList4 = fv02.f133705g;
                    if (linkedList4 != null) {
                        i = linkedList4.size();
                    }
                    if (i > 0) {
                        finderMedia.live_cover_imgs = fv02.f133705g;
                    }
                }
                if (fv02.f133702d != null) {
                    ((C54991o) oVar.business(cls)).f154252S0 = fv02.f133702d;
                    FinderObject finderObject4 = ((C54991o) oVar.business(cls)).f154341n;
                    if (finderObject4 != null) {
                        finderObjectDesc4 = finderObject4.objectDesc;
                    }
                    if (finderObjectDesc4 != null) {
                        finderObjectDesc4.description = fv02.f133702d;
                    }
                }
            }
            oVar.mo75974N4();
            return;
        }
        String str5 = oVar.f154311f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("skip this updateFinderObject by invalid seq. [");
        if (xs02 != null) {
            j3 = xs02.f144913r;
        }
        sb5.append(j3);
        sb5.append(" : ");
        sb5.append(oVar.f154386x3);
        sb5.append(']');
        Log.m105924i(str5, sb5.toString());
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20036};
    }
}
