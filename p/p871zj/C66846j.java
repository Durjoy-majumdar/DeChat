package p871zj;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import p001ak.C54053a;
import p001ak.C54054b;
import p001ak.C54057e;
import p006bk.C54479b;
import p006bk.C54481c;
import p848dk.C58297b;
import p848dk.C58306h;
import p850ek.C58612c;
import p850ek.C58614e;
import p852fk.C59112c;

/* renamed from: zj.j */
public class C66846j implements View.OnTouchListener {

    /* renamed from: d */
    public C66838e f192019d;

    /* renamed from: zj.j$a */
    public static final class C66847a implements Comparator<C54053a>, Serializable {
        public int compare(Object obj, Object obj2) {
            int i;
            int j;
            C54053a aVar = (C54053a) obj;
            C54053a aVar2 = (C54053a) obj2;
            SimpleDateFormat simpleDateFormat = C58612c.f167811a;
            if (aVar == aVar2) {
                return 0;
            }
            if (aVar != null) {
                if (aVar2 != null) {
                    if (aVar.equals(aVar2)) {
                        return 0;
                    }
                    int i2 = ((aVar.f151348e - aVar2.f151348e) > 0 ? 1 : ((aVar.f151348e - aVar2.f151348e) == 0 ? 0 : -1));
                    if (i2 <= 0) {
                        if (i2 >= 0) {
                            int i3 = aVar.f151358o - aVar2.f151358o;
                            if (i3 <= 0) {
                                if (i3 >= 0 && ((long) aVar.f151345b) - ((long) aVar2.f151345b) <= 0) {
                                    if (i >= 0 && (j = aVar.mo74720j() - aVar2.mo74720j()) <= 0) {
                                        if (j < 0) {
                                            return -1;
                                        }
                                        return j;
                                    }
                                }
                            }
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: zj.j$b */
    public interface C66848b {
        /* renamed from: a */
        void mo84284a(C54053a aVar, C58306h hVar, C58297b bVar);

        /* renamed from: b */
        void mo84285b(List<C54053a> list);

        /* renamed from: c */
        void mo84286c(boolean z);
    }

    public C66846j(View view, C54479b bVar) {
        this.f192019d = new C66838e(view, bVar);
    }

    /* renamed from: a */
    public void mo90842a(List<C54053a> list, boolean z) {
        Handler a;
        C66838e eVar = this.f192019d;
        eVar.getClass();
        Log.m105924i("DanmakuManager", "addLastAll: size = " + list.size() + ", needPreMeasure = " + z);
        if (z) {
            C66851m mVar = eVar.f191993n;
            C66842g gVar = new C66842g(eVar);
            mVar.getClass();
            int i = C59112c.f169074a;
            if (!(list.size() <= 0) && (a = mVar.mo90857a()) != null) {
                a.post(new C66850l(mVar, list, gVar));
                return;
            }
            return;
        }
        for (C54053a a2 : list) {
            eVar.f191990h.mo90838a(a2);
        }
    }

    /* renamed from: b */
    public void mo90843b() {
        C66838e eVar = this.f192019d;
        eVar.getClass();
        C58614e.m68069f("DanmakuManager", "clear");
        eVar.f191981J.mo90858a(9);
        C66843h hVar = eVar.f191990h;
        if (hVar != null) {
            hVar.mo90839b();
        }
    }

    /* renamed from: c */
    public C54053a mo90844c(int i, Object obj) {
        C54053a bVar;
        C66845i iVar = this.f192019d.f191991i;
        Queue queue = iVar.f192018b.get(i);
        if (queue == null) {
            queue = new LinkedBlockingQueue();
        }
        C54053a aVar = (C54053a) queue.poll();
        if (aVar == null) {
            C54479b bVar2 = iVar.f192017a;
            if (i == -2147483647) {
                bVar2.getClass();
                bVar = new C54057e(bVar2);
            } else {
                aVar = null;
                C54481c cVar = bVar2.f152744e;
                if (cVar != null) {
                    aVar = cVar.mo75307a(bVar2, i);
                }
                if (aVar == null) {
                    bVar = new C54054b(bVar2);
                }
                C58614e.m68070g("DanmakuFactory", aVar, " is created ");
            }
            aVar = bVar;
            C58614e.m68070g("DanmakuFactory", aVar, " is created ");
        } else {
            C58614e.m68070g("DanmakuFactory", aVar, " is reused ");
        }
        aVar.mo74728r();
        if (!C66836c.f191968b || obj != null) {
            aVar.f151367x = obj;
            aVar.f151366w = true;
            return aVar;
        }
        throw new RuntimeException("Danmaku data should been null");
    }

    /* renamed from: d */
    public void mo90845d() {
        C66838e eVar = this.f192019d;
        eVar.getClass();
        C58614e.m68067d("DanmakuManager", "postInvalidate()");
        Handler handler = eVar.f191981J.f192028a;
        if (handler != null) {
            handler.removeMessages(13);
        }
        eVar.f191981J.mo90858a(13);
    }

    /* renamed from: e */
    public boolean mo90846e() {
        return this.f192019d.mo90822i();
    }

    /* renamed from: f */
    public void mo90847f() {
        C66838e eVar = this.f192019d;
        eVar.getClass();
        C58614e.m68069f("DanmakuManager", "notifyConfigChanged()");
        C66853n nVar = eVar.f191981J;
        eVar.f191975D.getClass();
        nVar.mo90859b(0);
        eVar.f191981J.mo90858a(7);
    }

    /* renamed from: g */
    public void mo90848g(boolean z) {
        C66838e eVar = this.f192019d;
        eVar.getClass();
        C58614e.m68067d("DanmakuManager", "pause(), isImmediately=" + z);
        if (z) {
            boolean z2 = true;
            if (eVar.f191981J.f192030c != 1) {
                z2 = false;
            }
            if (z2) {
                eVar.mo90820g();
                return;
            }
        }
        eVar.f191981J.mo90858a(3);
    }

    /* renamed from: h */
    public void mo90849h() {
        C66838e eVar = this.f192019d;
        eVar.getClass();
        C58614e.m68069f("DanmakuManager", "release() mIsQuited = " + eVar.f191986d);
        if (!eVar.f191986d) {
            eVar.mo90827n();
        }
        eVar.f191981J.mo90858a(8);
        eVar.f191979H = null;
    }

    /* renamed from: i */
    public void mo90850i() {
        C66838e eVar = this.f192019d;
        eVar.getClass();
        C58614e.m68069f("DanmakuManager", "resume()");
        eVar.f191981J.mo90858a(2);
    }

    /* renamed from: j */
    public void mo90851j(long j) {
        C66838e eVar = this.f192019d;
        eVar.getClass();
        C58614e.m68069f("DanmakuManager", "seek(): postime = " + j);
        C66853n nVar = eVar.f191981J;
        Long valueOf = Long.valueOf(j);
        nVar.getClass();
        Message obtain = Message.obtain();
        obtain.what = 5;
        obtain.obj = valueOf;
        Handler handler = nVar.f192028a;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
    }

    /* renamed from: k */
    public void mo90852k(long j) {
        C66838e eVar = this.f192019d;
        eVar.getClass();
        C58614e.m68069f("DanmakuManager", "start() time = " + j);
        C66853n nVar = eVar.f191981J;
        eVar.f191975D.getClass();
        boolean z = false;
        nVar.mo90859b(0);
        C66853n nVar2 = eVar.f191981J;
        Long valueOf = Long.valueOf(j);
        nVar2.getClass();
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = valueOf;
        Handler handler = nVar2.f192028a;
        if (handler != null) {
            z = true;
        }
        if (z) {
            handler.sendMessage(obtain);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/danmaku/core/DanmakuManager", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f192019d.onTouch(view, motionEvent);
        C117292a.m165362h(false, this, "com/tencent/mm/danmaku/core/DanmakuManager", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
