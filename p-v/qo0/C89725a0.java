package qo0;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import ej0.C58608e;
import ej0.C86524b;
import ej0.C86525c;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Iterator;
import n34.C117603a;
import org.json.JSONException;
import org.json.JSONObject;
import po0.C89392a;
import qo0.C89727c;
import qo0.C89750q;
import rx3.C13598b0;

/* renamed from: qo0.a0 */
public final class C89725a0 implements C117603a {

    /* renamed from: d */
    public final /* synthetic */ C89750q f258025d;

    /* renamed from: e */
    public final /* synthetic */ C89750q.C89751a f258026e;

    public C89725a0(C89750q qVar, C89750q.C89751a aVar) {
        this.f258025d = qVar;
        this.f258026e = aVar;
    }

    public final void call() {
        C89727c cVar;
        C89727c cVar2;
        C89750q qVar = this.f258025d;
        C89750q.C89751a aVar = this.f258026e;
        qVar.getClass();
        C58608e.C58609a aVar2 = C58608e.C58609a.Stopped;
        Log.m105924i("MicroMsg.VideoCast.VideoCastController", "handleBroadcast: " + aVar.f258106a.name());
        String str = null;
        switch (aVar.f258106a.ordinal()) {
            case 5:
                C86525c b = qVar.f258094e.mo124027b();
                C58608e.C58609a aVar3 = C58608e.C58609a.Playing;
                b.f251386e.f167798a = aVar3;
                if (qVar.f258105p.stopped()) {
                    qVar.f258104o = false;
                    qVar.f258105p.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
                qVar.f258094e.mo124027b().f251386e.f167798a = aVar3;
                qVar.f258100k.stopTimer();
                qVar.f258099j = true;
                C89392a aVar4 = (C89392a) qVar.f258091b;
                aVar4.getClass();
                try {
                    aVar4.f257401a = 0;
                    JSONObject b2 = aVar4.mo123728b();
                    b2.put("timeStamp", System.currentTimeMillis());
                    b2.put("type", "DLNA");
                    aVar4.mo123727a(new C89392a.C89397e(), b2);
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoPlay fail", e);
                }
                qVar.f258103n.startTimer(1000);
                qVar.f258092c.mo123734c(true);
                ((C89392a) qVar.f258091b).mo123731e(true);
                C89731d0 d0Var = qVar.f258094e;
                Iterator<C89738e> it = d0Var.f258033d.iterator();
                while (it.hasNext()) {
                    C89738e next = it.next();
                    C86524b bVar = next.f258045a.f251382a;
                    String str2 = bVar != null ? bVar.f251380i : null;
                    C86524b bVar2 = d0Var.mo124027b().f251382a;
                    if (C87412m.m108589b(str2, bVar2 != null ? bVar2.f251380i : null)) {
                        next.f258048d = false;
                        next.f258047c = true;
                        next.f258046b = true;
                    }
                }
                Iterator<C89738e> it4 = d0Var.f258034e.iterator();
                while (it4.hasNext()) {
                    C89738e next2 = it4.next();
                    C86524b bVar3 = next2.f258045a.f251382a;
                    String str3 = bVar3 != null ? bVar3.f251380i : null;
                    C86524b bVar4 = d0Var.mo124027b().f251382a;
                    if (C87412m.m108589b(str3, bVar4 != null ? bVar4.f251380i : null)) {
                        next2.f258048d = false;
                        next2.f258047c = true;
                        next2.f258046b = true;
                    }
                }
                C32224a<C13598b0> aVar5 = d0Var.f258035f;
                if (aVar5 != null) {
                    aVar5.invoke();
                }
                C32224a<C13598b0> aVar6 = qVar.f258101l;
                if (aVar6 != null) {
                    ((C89774w) aVar6).invoke();
                    qVar.f258101l = null;
                }
                int i = qVar.f258093d;
                if (i == 3) {
                    C89727c cVar3 = qVar.f258096g;
                    if (cVar3 != null) {
                        C86524b bVar5 = qVar.f258094e.mo124027b().f251382a;
                        C86524b bVar6 = qVar.f258094e.mo124027b().f251382a;
                        if (bVar6 != null) {
                            str = bVar6.f251379h;
                        }
                        if (str == null) {
                            str = "";
                        }
                        cVar3.mo116773dA(true, "", str, qVar.f258093d);
                    }
                } else if (i == 5 || i == 8) {
                    C89727c cVar4 = qVar.f258096g;
                    if (cVar4 != null) {
                        C89727c.C89728a.m112183a(cVar4, true, (String) null, (String) null, i, 6, (Object) null);
                    }
                } else if (i == 8 && (cVar = qVar.f258096g) != null) {
                    C89727c.C89728a.m112183a(cVar, true, (String) null, (String) null, i, 6, (Object) null);
                }
                qVar.f258093d = -1;
                return;
            case 6:
                C86525c b3 = qVar.f258094e.mo124027b();
                C58608e.C58609a aVar7 = C58608e.C58609a.Paused;
                b3.f251386e.f167798a = aVar7;
                qVar.f258094e.mo124027b().f251386e.f167798a = aVar7;
                C89392a aVar8 = (C89392a) qVar.f258091b;
                aVar8.getClass();
                Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoPause: ");
                try {
                    JSONObject b4 = aVar8.mo123728b();
                    b4.put("type", "DLNA");
                    aVar8.mo123727a(new C89392a.C89396d(), b4);
                } catch (JSONException e2) {
                    Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoPause fail", e2);
                }
                qVar.f258092c.mo123734c(true);
                return;
            case 7:
                qVar.f258094e.mo124027b().f251386e.f167798a = aVar2;
                qVar.f258094e.mo124027b().f251386e.f167798a = aVar2;
                C89392a aVar9 = (C89392a) qVar.f258091b;
                aVar9.getClass();
                Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoEnded: ");
                try {
                    JSONObject b5 = aVar9.mo123728b();
                    b5.put("type", "DLNA");
                    aVar9.mo123727a(new C89392a.C89395c(), b5);
                } catch (JSONException e3) {
                    Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoEnded fail", e3);
                }
                qVar.f258092c.mo123734c(false);
                return;
            case 8:
                Object obj = aVar.f258107b;
                if (obj != null && (obj instanceof Integer)) {
                    int intValue = ((Integer) obj).intValue();
                    Log.m105924i("MicroMsg.VideoCast.VideoCastController", "Receive Action : Volume = " + intValue);
                    return;
                }
                return;
            case 9:
                Object obj2 = aVar.f258107b;
                if (obj2 != null && (obj2 instanceof Boolean)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    Log.m105924i("MicroMsg.VideoCast.VideoCastController", "Receive Action : Mute = " + booleanValue);
                    return;
                }
                return;
            case 11:
                if (qVar.f258094e.mo124027b().f251386e.f167798a != aVar2) {
                    ((C89392a) qVar.f258091b).mo123731e(false);
                    qVar.f258094e.mo124027b().f251386e.f167798a = aVar2;
                    C89731d0 d0Var2 = qVar.f258094e;
                    Iterator<C89738e> it5 = d0Var2.f258033d.iterator();
                    while (it5.hasNext()) {
                        C89738e next3 = it5.next();
                        C86524b bVar7 = next3.f258045a.f251382a;
                        String str4 = bVar7 != null ? bVar7.f251380i : null;
                        C86524b bVar8 = d0Var2.mo124027b().f251382a;
                        if (C87412m.m108589b(str4, bVar8 != null ? bVar8.f251380i : null)) {
                            next3.f258048d = false;
                            next3.f258047c = false;
                            next3.f258046b = true;
                        }
                    }
                    Iterator<C89738e> it6 = d0Var2.f258034e.iterator();
                    while (it6.hasNext()) {
                        C89738e next4 = it6.next();
                        C86524b bVar9 = next4.f258045a.f251382a;
                        String str5 = bVar9 != null ? bVar9.f251380i : null;
                        C86524b bVar10 = d0Var2.mo124027b().f251382a;
                        if (C87412m.m108589b(str5, bVar10 != null ? bVar10.f251380i : null)) {
                            next4.f258048d = false;
                            next4.f258047c = false;
                            next4.f258046b = true;
                        }
                    }
                    C32224a<C13598b0> aVar10 = d0Var2.f258035f;
                    if (aVar10 != null) {
                        aVar10.invoke();
                    }
                    Object obj3 = aVar.f258107b;
                    int intValue2 = (obj3 == null || !(obj3 instanceof Integer)) ? -1 : ((Integer) obj3).intValue();
                    if (intValue2 == 3) {
                        C89727c cVar5 = qVar.f258096g;
                        if (cVar5 != null) {
                            C86524b bVar11 = qVar.f258094e.mo124027b().f251382a;
                            C86524b bVar12 = qVar.f258094e.mo124027b().f251382a;
                            String str6 = bVar12 != null ? bVar12.f251379h : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            cVar5.mo116773dA(false, "", str6, intValue2);
                        }
                    } else if ((intValue2 == 5 || intValue2 == 8) && (cVar2 = qVar.f258096g) != null) {
                        C89727c.C89728a.m112183a(cVar2, false, (String) null, (String) null, intValue2, 6, (Object) null);
                    }
                    qVar.f258094e.mo124027b().mo121007h();
                    qVar.f258094e.mo124027b().mo121008i();
                    qVar.f258094e.mo124027b().f251389h = null;
                    qVar.f258092c.mo123734c(false);
                    qVar.f258103n.stopTimer();
                    qVar.f258105p.stopTimer();
                    qVar.f258100k.stopTimer();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
