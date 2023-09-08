package nn2;

import android.content.Context;
import cc0.C92411b;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import eb0.C97625j3;
import java.util.LinkedList;
import java.util.List;
import nn2.C21685l;
import ob0.C11385n;
import ob0.C117747y;
import p702ts.C78085c;
import pe3.C47465a;
import qn2.C12894b;
import qn2.C22120e;
import te3.C51197s34;

/* renamed from: nn2.e */
public class C47285e extends C21685l.C21687b implements C11385n {

    /* renamed from: e */
    public float f126933e = -85.0f;

    /* renamed from: f */
    public float f126934f = -1000.0f;

    /* renamed from: g */
    public int f126935g = 1;

    /* renamed from: h */
    public int f126936h = -1000;

    /* renamed from: i */
    public boolean f126937i = false;

    /* renamed from: j */
    public boolean f126938j = true;

    /* renamed from: n */
    public C92411b f126939n;

    /* renamed from: o */
    public C47284d f126940o;

    /* renamed from: p */
    public C47283c f126941p;

    /* renamed from: q */
    public MMHandler f126942q = new MMHandler();

    /* renamed from: r */
    public Runnable f126943r = new C47286a();

    /* renamed from: s */
    public C92411b.C92412a f126944s = new C47287b();

    /* renamed from: nn2.e$a */
    public class C47286a implements Runnable {
        public C47286a() {
        }

        public void run() {
            byte[] bArr;
            Runnable runnable;
            C47285e eVar = C47285e.this;
            MMHandler mMHandler = eVar.f126942q;
            if (!(mMHandler == null || (runnable = eVar.f126943r) == null)) {
                mMHandler.removeCallbacks(runnable);
            }
            if (C47285e.this.f126941p != null) {
                C97625j3.m125815e().mo123458d(C47285e.this.f126941p);
            }
            C47285e eVar2 = C47285e.this;
            C47284d dVar = eVar2.f126940o;
            if (!(dVar == null || (bArr = dVar.f126931f) == null)) {
                eVar2.f126941p = new C47283c(bArr);
            }
            if (C47285e.this.f126941p != null) {
                C97625j3.m125815e().mo123460f(C47285e.this.f126941p);
            }
        }
    }

    /* renamed from: nn2.e$b */
    public class C47287b implements C92411b.C92412a {
        public C47287b() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            Log.m105925i("MicroMsg.ShakeFriendService", "getlocaion lat %f lng %f hasGetLbsInfo " + C47285e.this.f126937i, Float.valueOf(f2), Float.valueOf(f));
            if (!z) {
                return true;
            }
            C47285e eVar = C47285e.this;
            if (eVar.f126938j && eVar.f126933e == -85.0f && eVar.f126934f == -1000.0f) {
                eVar.f126938j = false;
                eVar.f126933e = f2;
                eVar.f126934f = f;
                eVar.f126936h = (int) d2;
                eVar.f126935g = i;
                eVar.f126937i = true;
            }
            return false;
        }
    }

    public C47285e(Context context, C21685l.C21686a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public void mo33950a() {
        mo72318g();
        this.f61391d = null;
        C97625j3.m125815e().mo123470p(161, this);
        C97625j3.m125815e().mo123470p(162, this);
        C97625j3.m125815e().mo123470p(1251, this);
        C92411b bVar = this.f126939n;
        if (bVar != null) {
            bVar.mo126408b(this.f126944s);
        }
    }

    /* renamed from: b */
    public void mo33951b() {
        C97625j3.m125815e().mo123455a(161, this);
        C97625j3.m125815e().mo123455a(162, this);
        C97625j3.m125815e().mo123455a(1251, this);
        mo72317f();
    }

    /* renamed from: c */
    public void mo33952c() {
        C92411b bVar = this.f126939n;
        if (bVar != null) {
            bVar.mo126408b(this.f126944s);
        }
    }

    /* renamed from: d */
    public void mo33953d() {
        C92411b bVar = this.f126939n;
        if (bVar != null) {
            bVar.mo126409c(this.f126944s, true, false);
            C5139t.m5183e(22, 10);
        }
    }

    /* renamed from: e */
    public void mo33954e() {
        mo72318g();
        mo33951b();
        this.f126940o = new C47284d(0, this.f126934f, this.f126933e, this.f126936h, this.f126935g, "", "");
        C97625j3.m125815e().mo123460f(this.f126940o);
        if (!this.f126937i) {
            if (this.f126939n == null) {
                mo72317f();
            }
            this.f126939n.mo126412f(this.f126944s, true);
            C5139t.m5183e(22, 10);
        }
    }

    /* renamed from: f */
    public final void mo72317f() {
        C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        this.f126939n = ms;
        this.f126938j = true;
        ms.mo126409c(this.f126944s, true, false);
        C5139t.m5183e(22, 10);
    }

    /* renamed from: g */
    public void mo72318g() {
        Runnable runnable;
        if (this.f126940o != null) {
            C97625j3.m125815e().mo123458d(this.f126940o);
        }
        if (this.f126941p != null) {
            C97625j3.m125815e().mo123458d(this.f126941p);
        }
        MMHandler mMHandler = this.f126942q;
        if (mMHandler != null && (runnable = this.f126943r) != null) {
            mMHandler.removeCallbacks(runnable);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (this.f61391d != null) {
            int type = yVar.getType();
            if (type == 161) {
                C47284d dVar = (C47284d) yVar;
                C47465a aVar = dVar.f126930e.f127055a.f127080a;
                if (((C51197s34) aVar).f141300o == 3 || ((C51197s34) aVar).f141300o == 4) {
                    Log.m105926v("MicroMsg.ShakeFriendService", "onSceneEnd ignore location report response");
                } else if (i2 == 0 && i == 0 && dVar.f126932g == 0) {
                    this.f126942q.postDelayed(this.f126943r, 3000);
                } else {
                    Log.m105920e("MicroMsg.ShakeFriendService", "onSceneEnd reprot failed");
                    ((ShakeReportUI) this.f61391d).mo24635O7((List<C47288f>) null, 3);
                }
            } else if (type == 162) {
                C47283c cVar = (C47283c) yVar;
                if (i2 == 0 && i == 0 && cVar.f126928h == 0) {
                    LinkedList linkedList = (LinkedList) cVar.f126926f;
                    if (linkedList.size() == 0) {
                        Log.m105924i("MicroMsg.ShakeFriendService", "empty shake get list");
                        ((ShakeReportUI) this.f61391d).mo24635O7((List<C47288f>) null, 3);
                        return;
                    }
                    ((ShakeReportUI) this.f61391d).mo24635O7(linkedList, 1);
                    return;
                }
                ((ShakeReportUI) this.f61391d).mo24635O7((List<C47288f>) null, 3);
            } else if (type == 1251) {
                C12894b bVar = (C12894b) yVar;
                if (i2 == 0 && i == 0) {
                    C21685l.C21686a aVar2 = this.f61391d;
                    if (aVar2 != null) {
                        ((ShakeReportUI) aVar2).mo24634N7(1251, (C22120e) null, 1);
                        return;
                    }
                    return;
                }
                C21685l.C21686a aVar3 = this.f61391d;
                if (aVar3 != null) {
                    ((ShakeReportUI) aVar3).mo24634N7(1251, (C22120e) null, 2);
                }
            }
        }
    }
}
