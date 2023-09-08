package vz2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import java.util.Stack;
import p255vr.C65873e;
import qy2.C47904x;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: vz2.h */
public final class C78504h extends C86301e implements C47904x {

    /* renamed from: d */
    public Stack<String> f229951d = new Stack<>();

    /* renamed from: e */
    public Stack<String> f229952e = new Stack<>();

    /* renamed from: f */
    public Stack<String> f229953f = new Stack<>();

    /* renamed from: Dj */
    public void mo72660Dj() {
        if (!this.f229953f.empty()) {
            this.f229953f.pop();
        }
    }

    public String F00() {
        if (this.f229953f.empty()) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusSessionManager", "getPageId() with empty stack");
            return "";
        }
        String peek = this.f229953f.peek();
        C87412m.m108593f(peek, "pageIdStack.peek()");
        return peek;
    }

    /* renamed from: OC */
    public Class<? extends UIComponent> mo72662OC() {
        return C53063g.class;
    }

    /* renamed from: Tr */
    public void mo72663Tr() {
        if (!this.f229951d.empty()) {
            this.f229951d.pop();
        }
    }

    /* renamed from: YY */
    public String mo72664YY() {
        if (this.f229952e.empty()) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusSessionManager", "getSceneSessionId() with empty stack");
            return "";
        }
        String peek = this.f229952e.peek();
        C87412m.m108593f(peek, "sceneSessionIdStack.peek()");
        return peek;
    }

    /* renamed from: af */
    public String mo72665af() {
        this.f229953f.push(((C65873e) C86312j.m106911c(C65873e.class)).ep0(4));
        return F00();
    }

    /* renamed from: aw */
    public void mo72666aw() {
        if (!this.f229952e.empty()) {
            this.f229952e.pop();
        }
    }

    /* renamed from: bk */
    public String mo72667bk() {
        this.f229951d.push(((C65873e) C86312j.m106911c(C65873e.class)).ep0(1));
        return getSessionId();
    }

    public String getSessionId() {
        if (this.f229951d.empty()) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusSessionManager", "getSessionId() with empty stack");
            mo72667bk();
        }
        String peek = this.f229951d.peek();
        C87412m.m108593f(peek, "sessionIdStack.peek()");
        return peek;
    }

    /* renamed from: hl */
    public String mo72669hl() {
        this.f229952e.push(((C65873e) C86312j.m106911c(C65873e.class)).ep0(3));
        return mo72664YY();
    }

    public String j10() {
        mo72663Tr();
        return mo72667bk();
    }

    public Class<? extends UIComponent> nf0() {
        return C53061b.class;
    }
}
