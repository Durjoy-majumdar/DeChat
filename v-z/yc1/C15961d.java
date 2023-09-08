package yc1;

import ad1.C39543a;
import bd1.C0264h;
import cm1.C28617v1;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import di3.C86312j;
import er1.C58784w3;
import er1.C7861q2;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import org.json.JSONObject;
import p763ym.C79138l;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C50119ke1;
import te3.C51827wf3;
import te3.C51967xf3;
import te3.C52261zg3;
import te3.C64373fs0;
import tf0.C13887q1;
import up1.C37521f;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: yc1.d */
public final class C15961d implements C39543a<C50119ke1> {
    /* renamed from: a */
    public void mo14610a(int i, int i2, String str, C49335eu3 eu32, JSONObject jSONObject) {
        C50119ke1 ke12 = (C50119ke1) eu32;
        C87412m.m108594g(ke12, "resp");
        C87412m.m108594g(jSONObject, "reportExt");
        if (i == 0 && i2 == 0) {
            LinkedList<C52261zg3> linkedList = ke12.f136709z;
            C87412m.m108593f(linkedList, "resp.finder_list");
            for (C52261zg3 zg32 : linkedList) {
                C51967xf3 xf32 = zg32.f145923j;
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                    if (xf32 == null) {
                        xf32 = new C51967xf3();
                    }
                    LinkedList<C51827wf3> linkedList2 = xf32.f144633d;
                    ArrayList arrayList = new ArrayList();
                    C37521f.f99374d.getClass();
                    if (C37521f.f99130B1.mo60266n().intValue() == 1) {
                        C51827wf3 wf32 = new C51827wf3();
                        wf32.f144020d = "用秒剪制作视频（仅测试）";
                        wf32.f144021e = "";
                        wf32.f144022f = "";
                        wf32.f144023g = 1;
                        wf32.f144024h = "wxa5e0de08d96cc09d";
                        wf32.f144027n = "miaojian://createvideo?scene=channels&page=1&from=channels";
                        wf32.f144028o = "https://miaojian.weixin.qq.com/download/apps/?channel=debug";
                        wf32.f144029p = "com.tencent.phoenix";
                        wf32.f144030q = "A24DC0755072F64C480DC06DCD3412BF";
                        arrayList.add(wf32);
                    }
                    linkedList2.addAll(arrayList);
                }
                if (xf32 != null) {
                    LinkedList<C51827wf3> linkedList3 = xf32.f144633d;
                    C87412m.m108593f(linkedList3, "actionSheetList.sheets");
                    C61926c.m72675T(linkedList3, C7861q2.f26461d);
                    LinkedList<C51827wf3> linkedList4 = xf32.f144633d;
                    C87412m.m108593f(linkedList4, "actionSheetList.sheets");
                    for (C51827wf3 wf33 : linkedList4) {
                        ((C79138l) C86312j.m106911c(C79138l.class)).mo74004WW(wf33.f144024h, wf33.f144029p, (C79138l.C53540a) null);
                    }
                }
                zg32.f145923j = xf32;
            }
        }
    }

    /* renamed from: b */
    public void mo14611b(int i, int i2, String str, C49335eu3 eu32, JSONObject jSONObject) {
        boolean z;
        T t;
        C13598b0 b0Var;
        String str2;
        boolean z2;
        C50119ke1 ke12 = (C50119ke1) eu32;
        C87412m.m108594g(ke12, "resp");
        C87412m.m108594g(jSONObject, "reportExt");
        if (i == 0 && i2 == 0) {
            ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13318LX(ke12.f136704u);
            LinkedList<C64373fs0> linkedList = ke12.f136704u;
            C87412m.m108593f(linkedList, "resp.alias_info");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C64373fs0) t).f183215f == 2) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C64373fs0 fs02 = (C64373fs0) t;
            if (fs02 != null) {
                C58784w3.f168295a.mo83975w1(fs02, Boolean.TRUE, "UserPrepare");
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                LinkedList<C64373fs0> linkedList2 = ke12.f136704u;
                if (linkedList2 != null && (!linkedList2.isEmpty())) {
                    z = true;
                }
                if (z) {
                    C58784w3.f168295a.mo83976x("UserPrepare", (C28617v1) null);
                }
            }
            C66785b.f191882e.mo90673n0().mo62397b().f140482z = ke12.f136684A;
            LinkedList<C52261zg3> linkedList3 = ke12.f136709z;
            C87412m.m108593f(linkedList3, "resp.finder_list");
            for (C52261zg3 zg32 : linkedList3) {
                FinderContact finderContact = zg32.f145918e;
                if (finderContact == null || (str2 = finderContact.username) == null) {
                    str2 = "";
                }
                C66785b.f191882e.mo90657E1(str2, new C0264h(zg32.f145928r, zg32.f145929s, false, 4, (C8480h) null));
            }
            ((C119157j) C119157j.f356862d).mo183870a(C15960c.f42857d);
        }
    }

    /* renamed from: c */
    public int mo14612c() {
        return 7289;
    }
}
