package le1;

import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C9342n1;
import sx3.C36907w;
import up1.C37521f;

/* renamed from: le1.a */
public final class C10488a implements C10497i {

    /* renamed from: a */
    public long f31726a;

    /* renamed from: b */
    public String f31727b = "";

    /* renamed from: a */
    public boolean mo10786a(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "loadedInfo");
        return false;
    }

    /* renamed from: b */
    public boolean mo10787b(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "loadedInfo");
        return false;
    }

    /* renamed from: c */
    public boolean mo10788c(C9342n1.C9346d dVar, int i, int i2) {
        int i3;
        boolean z;
        C87412m.m108594g(dVar, "resp");
        C37521f.f99374d.getClass();
        if (C37521f.f99221L2.mo60266n().intValue() == 1) {
            this.f31726a = dVar.mo10088b().f145380r;
            String str = dVar.mo10088b().f145387y;
            if (str == null) {
                str = "";
            }
            this.f31727b = str;
            if (this.f31726a != 0 && !Util.isNullOrNil(str)) {
                LinkedList<FinderObject> linkedList = dVar.f146069d;
                T t = null;
                if (linkedList != null) {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (((FinderObject) next).f164794id == this.f31726a) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            t = next;
                            break;
                        }
                    }
                    t = (FinderObject) t;
                }
                if (t != null) {
                    LinkedList<FinderCommentInfo> linkedList2 = t.likeList;
                    C87412m.m108593f(linkedList2, "likeList");
                    Iterator<FinderCommentInfo> it4 = linkedList2.iterator();
                    int i4 = 0;
                    while (true) {
                        i3 = -1;
                        if (!it4.hasNext()) {
                            i4 = -1;
                            break;
                        } else if (C87412m.m108589b(it4.next().username, C75592q0.m90789s())) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 > 1) {
                        t.likeList.add(1, t.likeList.remove(i4));
                    }
                    LinkedList<FinderCommentInfo> linkedList3 = t.likeList;
                    C87412m.m108593f(linkedList3, "likeList");
                    Iterator<FinderCommentInfo> it5 = linkedList3.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        } else if (C87412m.m108589b(it5.next().username, this.f31727b)) {
                            i3 = i5;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i3 > 0) {
                        t.likeList.add(0, t.likeList.remove(i3));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("meExistIndex=");
                    sb.append(i4);
                    sb.append(" friendExistIndex=");
                    sb.append(i3);
                    sb.append(" redDotUsername=");
                    sb.append(this.f31727b);
                    sb.append(" self=");
                    sb.append(C75592q0.m90789s());
                    sb.append("likeList=");
                    LinkedList<FinderCommentInfo> linkedList4 = t.likeList;
                    C87412m.m108593f(linkedList4, "likeList");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList4, 10));
                    for (FinderCommentInfo finderCommentInfo : linkedList4) {
                        arrayList.add(finderCommentInfo.username);
                    }
                    sb.append(arrayList);
                    Log.m105924i("Finder.AdjustOrderAvatarInterceptor", sb.toString());
                }
            }
        }
        return false;
    }
}
