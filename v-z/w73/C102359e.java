package w73;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import f40.C86709a0;
import g83.C59386f;
import g83.C98092k;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import org.json.JSONObject;
import p008bq.C28396w0;
import rx3.C13598b0;
import te3.C101810m82;
import te3.C101823o70;
import te3.C49768hy;
import te3.y25;
import u73.C101968a0;
import u73.C101985t;
import u73.C101986v;
import x73.C102577j;

/* renamed from: w73.e */
public final class C102359e extends C98092k<C101823o70> {

    /* renamed from: i */
    public C101986v f301456i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102359e(C102577j jVar) {
        super(jVar);
        C87412m.m108594g(jVar, "uiComponent");
        C86709a0.m107524d().mo123455a(4614, this);
        C86709a0.m107524d().mo123455a(4384, this);
    }

    /* renamed from: e */
    public void mo126345e() {
        super.mo126345e();
        C86709a0.m107524d().mo123470p(4614, this);
        C86709a0.m107524d().mo123470p(4384, this);
    }

    /* renamed from: h */
    public void mo126346h(String str) {
        C87412m.m108594g(str, "paramStr");
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        C87412m.m108593f(keys, "requestObj.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            C87412m.m108593f(next, LocaleUtil.ITALIAN);
            hashMap.put(next, jSONObject.opt(next));
        }
        C86709a0.m107524d().mo123460f(new C101985t(mo137377g(hashMap)));
    }

    /* renamed from: i */
    public List<C49768hy> mo137378i() {
        LinkedList linkedList = new LinkedList();
        C49768hy hyVar = new C49768hy();
        hyVar.f134951d = "emojiRecPersonalization";
        hyVar.f134952e = ((C28396w0) C86312j.m106911c(C28396w0.class)).mo55937Xe() ? 1 : 0;
        linkedList.add(hyVar);
        return linkedList;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C101810m82 m822;
        super.onSceneEnd(i, i2, str, yVar);
        C13598b0 b0Var = null;
        if (yVar instanceof C101985t) {
            C101985t tVar = (C101985t) yVar;
            if (tVar.f300294g.f300202q == mo71326a()) {
                boolean z = true;
                if (i == 0 && i2 == 0) {
                    y25 y25 = tVar.f300293f;
                    if (y25 != null) {
                        C59386f<T> fVar = this.f123861d;
                        C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.emojisearch.ui.IEmojiSearchUIComponent");
                        C102357a g = ((C102577j) fVar).mo9284g();
                        if (g != null) {
                            boolean z2 = tVar.f300294g.f300188c == 0;
                            String str2 = y25.f145094f;
                            C87412m.m108593f(str2, "it.Json");
                            String str3 = tVar.f300294g.f300210y;
                            C87412m.m108593f(str3, "scene.model.requestId");
                            g.mo137386n(z2, str2, str3);
                            b0Var = C13598b0.f38549a;
                        }
                        if (b0Var != null) {
                            return;
                        }
                    }
                    C59386f<T> fVar2 = this.f123861d;
                    C87412m.m108592e(fVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.emojisearch.ui.IEmojiSearchUIComponent");
                    C102357a g2 = ((C102577j) fVar2).mo9284g();
                    if (g2 != null) {
                        C101968a0 a0Var = tVar.f300294g;
                        if (a0Var.f300188c != 0) {
                            z = false;
                        }
                        String str4 = a0Var.f300210y;
                        C87412m.m108593f(str4, "scene.model.requestId");
                        g2.mo137386n(z, "{\"ret\":-1}", str4);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        return;
                    }
                    return;
                }
                C59386f<T> fVar3 = this.f123861d;
                C87412m.m108592e(fVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.emojisearch.ui.IEmojiSearchUIComponent");
                C102357a g3 = ((C102577j) fVar3).mo9284g();
                if (g3 != null) {
                    C101968a0 a0Var2 = tVar.f300294g;
                    if (a0Var2.f300188c != 0) {
                        z = false;
                    }
                    String str5 = a0Var2.f300210y;
                    C87412m.m108593f(str5, "scene.model.requestId");
                    g3.mo137386n(z, "{\"ret\":-1}", str5);
                }
            }
        } else if (yVar instanceof C101986v) {
            C101986v vVar = (C101986v) yVar;
            if (vVar.f300299h == mo71326a() && C87412m.m108589b(yVar, this.f301456i)) {
                if (i == 0 && i2 == 0 && (m822 = vVar.f300298g) != null) {
                    C59386f<T> fVar4 = this.f123861d;
                    C87412m.m108592e(fVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.emojisearch.ui.IEmojiSearchUIComponent");
                    ((C102577j) fVar4).mo142204t4(m822, vVar.f300297f.f298719i);
                }
                this.f301456i = null;
            }
        }
    }
}
