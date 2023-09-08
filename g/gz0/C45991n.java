package gz0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import pz0.C47719f;

/* renamed from: gz0.n */
public class C45991n implements C11385n {

    /* renamed from: d */
    public List<WeakReference<C45993b>> f124017d = new ArrayList();

    /* renamed from: e */
    public ArrayList<String> f124018e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<String> f124019f = new ArrayList<>();

    /* renamed from: g */
    public MMHandler f124020g = new MMHandler();

    /* renamed from: h */
    public HashMap<String, Runnable> f124021h = new LinkedHashMap();

    /* renamed from: gz0.n$a */
    public class C45992a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f124022d;

        /* renamed from: e */
        public final /* synthetic */ int f124023e;

        /* renamed from: f */
        public final /* synthetic */ int f124024f;

        /* renamed from: g */
        public final /* synthetic */ int f124025g;

        public C45992a(String str, int i, int i2, int i3) {
            this.f124022d = str;
            this.f124023e = i;
            this.f124024f = i2;
            this.f124025g = i3;
        }

        public void run() {
            C45991n.this.mo71398c(this.f124022d, this.f124023e, this.f124024f, this.f124025g);
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "run the unmark task, the card is " + this.f124022d + " system.time:" + System.currentTimeMillis());
        }
    }

    /* renamed from: gz0.n$b */
    public interface C45993b {
        /* renamed from: Q0 */
        void mo23350Q0(String str, C45994c cVar);

        /* renamed from: d2 */
        void mo23354d2(String str, C45994c cVar, String str2);

        /* renamed from: l6 */
        void mo23355l6(String str, C45994c cVar);
    }

    /* renamed from: gz0.n$c */
    public static class C45994c {

        /* renamed from: a */
        public String f124027a;

        /* renamed from: b */
        public int f124028b = 0;

        /* renamed from: c */
        public String f124029c;

        /* renamed from: d */
        public int f124030d;

        /* renamed from: e */
        public String f124031e;
    }

    public C45991n() {
        C86709a0.m107529k().f251779b.mo123455a(1078, this);
        this.f124018e.clear();
        this.f124019f.clear();
        this.f124021h.clear();
    }

    /* renamed from: a */
    public final void mo71396a(String str) {
        Log.m105924i("MicroMsg.CardMarkCodeMgr", "cancelUnmark()");
        if (this.f124019f.contains(str)) {
            this.f124019f.remove(str);
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + str);
        }
        if (this.f124021h.containsKey(str)) {
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + str);
            this.f124021h.remove(str);
            this.f124020g.removeCallbacks(this.f124021h.get(str));
        }
    }

    /* renamed from: b */
    public void mo71397b(String str, int i, int i2, int i3) {
        Log.m105924i("MicroMsg.CardMarkCodeMgr", "doMarkCode()");
        mo71396a(str);
        if (!this.f124018e.contains(str)) {
            this.f124018e.add(str);
        }
        mo71398c(str, i, i2, i3);
    }

    /* renamed from: c */
    public final void mo71398c(String str, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "card_id is empty, don't call NetSceneMarkShareCard cgi");
            return;
        }
        Log.m105924i("MicroMsg.CardMarkCodeMgr", "doMarkNetscene()");
        C86709a0.m107529k().f251779b.mo123460f(new C47719f(str, i, i2, i3));
    }

    /* renamed from: d */
    public void mo71399d(String str, int i, int i2, int i3) {
        Log.m105924i("MicroMsg.CardMarkCodeMgr", "doUnmarkCode()");
        mo71396a(str);
        this.f124019f.add(str);
        C45992a aVar = new C45992a(str, i, i2, i3);
        this.f124020g.postDelayed(aVar, (long) (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72508a(1, "ShareCard", "UnMarkDelay"), 0) * 1000));
        this.f124021h.put(str, aVar);
        Log.m105924i("MicroMsg.CardMarkCodeMgr", "add unmark card mask id in mId2Runner. card is " + str + " system.time:" + System.currentTimeMillis());
    }

    /* renamed from: e */
    public final void mo71400e(String str) {
        Log.m105924i("MicroMsg.CardMarkCodeMgr", "removeId()");
        if (this.f124018e.contains(str) && !this.f124019f.contains(str)) {
            this.f124018e.remove(str);
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "remove mark card id in mMarkList. card is " + str);
        }
        if (!this.f124018e.contains(str) && this.f124019f.contains(str)) {
            this.f124019f.remove(str);
            this.f124021h.remove(str);
            this.f124020g.removeCallbacks(this.f124021h.get(str));
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + str);
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + str);
        }
    }

    /* renamed from: f */
    public void mo71401f(C45993b bVar) {
        C45993b bVar2;
        if (this.f124017d != null && bVar != null) {
            int i = 0;
            while (i < this.f124017d.size()) {
                WeakReference weakReference = this.f124017d.get(i);
                if (weakReference == null || (bVar2 = (C45993b) weakReference.get()) == null || !bVar2.equals(bVar)) {
                    i++;
                } else {
                    this.f124017d.remove(weakReference);
                    return;
                }
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C45993b bVar;
        C45993b bVar2;
        Log.m105924i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, errType = " + i + " errCode = " + i2);
        int i3 = 0;
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C47719f) {
                C47719f fVar = (C47719f) yVar;
                C45994c cVar = new C45994c();
                cVar.f124027a = fVar.f128204f;
                cVar.f124028b = fVar.f128205g;
                cVar.f124029c = fVar.f128206h;
                cVar.f124030d = fVar.f128207i;
                cVar.f124031e = fVar.f128208j;
                Log.m105924i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markSuccess original_card_id = " + fVar.f128209n);
                Log.m105924i("MicroMsg.CardMarkCodeMgr", "mark_user:" + cVar.f124027a + " mark_succ:" + cVar.f124028b + " mark_card_id:" + cVar.f124029c + " expire_time:" + cVar.f124030d + " pay_qrcode_wording:" + cVar.f124031e);
                String str2 = fVar.f128209n;
                Log.m105924i("MicroMsg.CardMarkCodeMgr", "markSuccess()");
                if (this.f124017d != null) {
                    if (this.f124018e.contains(str2) || this.f124019f.contains(str2)) {
                        while (i3 < ((ArrayList) this.f124017d).size()) {
                            WeakReference weakReference = (WeakReference) ((ArrayList) this.f124017d).get(i3);
                            if (!(weakReference == null || (bVar2 = (C45993b) weakReference.get()) == null)) {
                                if (this.f124018e.contains(str2)) {
                                    bVar2.mo23355l6(str2, cVar);
                                } else if (this.f124019f.contains(str2)) {
                                    bVar2.mo23350Q0(str2, cVar);
                                }
                            }
                            i3++;
                        }
                    } else {
                        Log.m105924i("MicroMsg.CardMarkCodeMgr", "markSuccess the card id is not in mark list and un mark list.");
                    }
                }
                mo71400e(fVar.f128209n);
            }
        } else if (yVar instanceof C47719f) {
            C47719f fVar2 = (C47719f) yVar;
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markFail original_card_id = " + fVar2.f128209n);
            String str3 = fVar2.f128209n;
            Log.m105924i("MicroMsg.CardMarkCodeMgr", "onMarkFail()");
            if (this.f124017d != null) {
                if (!this.f124018e.contains(str3) || this.f124019f.contains(str3)) {
                    Log.m105924i("MicroMsg.CardMarkCodeMgr", "markSuccess the card is not in mark list");
                } else {
                    while (i3 < ((ArrayList) this.f124017d).size()) {
                        WeakReference weakReference2 = (WeakReference) ((ArrayList) this.f124017d).get(i3);
                        if (!(weakReference2 == null || (bVar = (C45993b) weakReference2.get()) == null)) {
                            bVar.mo23354d2(str3, (C45994c) null, str);
                        }
                        i3++;
                    }
                }
            }
            mo71400e(fVar2.f128209n);
        }
    }
}
