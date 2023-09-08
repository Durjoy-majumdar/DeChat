package t22;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import dd3.C75351c;
import dd3.C75352e;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p158gt.C98201k;
import wm0.C38230b;

/* renamed from: t22.q */
public class C77829q implements C75351c {

    /* renamed from: a */
    public HashMap<Long, WeakReference<ImageView>> f226761a = new HashMap<>();

    /* renamed from: b */
    public HashMap<Long, C72963f4.C72968e> f226762b = new HashMap<>();

    /* renamed from: c */
    public HashMap<Long, WeakReference<ProgressBar>> f226763c = new HashMap<>();

    /* renamed from: d */
    public HashMap<Long, WeakReference<ImageView>> f226764d = new HashMap<>();

    /* renamed from: e */
    public HashMap<C72963f4.C72968e, C72963f4> f226765e = new HashMap<>();

    /* renamed from: f */
    public HashMap<Long, Integer> f226766f = new HashMap<>();

    /* renamed from: g */
    public HashSet<Long> f226767g = new HashSet<>();

    /* renamed from: h */
    public int f226768h = 300;

    /* renamed from: i */
    public int f226769i = 300;

    public C77829q() {
        mo107944c();
    }

    /* renamed from: a */
    public void mo105669a(String str, C75352e eVar) {
        C72963f4 remove;
        WeakReference weakReference;
        if (eVar != null && this.f226762b.containsKey(Long.valueOf(eVar.f221516d)) && (remove = this.f226765e.remove(this.f226762b.get(Long.valueOf(eVar.f221516d)))) != null && (weakReference = this.f226761a.get(Long.valueOf(remove.getMsgId()))) != null && weakReference.get() != null && this.f226766f.containsKey(Long.valueOf(remove.getMsgId()))) {
            ((ImageView) weakReference.get()).setImageBitmap(((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).X90(remove.getMsgId(), str, this.f226766f.remove(Long.valueOf(remove.getMsgId())).intValue(), this.f226768h, this.f226769i, remove.mo108769t2() == 0));
            WeakReference remove2 = this.f226763c.remove(Long.valueOf(remove.getMsgId()));
            if (!(remove2 == null || remove2.get() == null)) {
                ((ProgressBar) remove2.get()).setVisibility(8);
            }
            WeakReference remove3 = this.f226764d.remove(Long.valueOf(remove.getMsgId()));
            if (remove3 != null && remove3.get() != null) {
                ((ImageView) remove3.get()).setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public void mo105670b(C75352e eVar) {
        C72963f4 remove;
        if (eVar != null && this.f226762b.containsKey(Long.valueOf(eVar.f221516d)) && (remove = this.f226765e.remove(this.f226762b.get(Long.valueOf(eVar.f221516d)))) != null) {
            WeakReference weakReference = this.f226761a.get(Long.valueOf(remove.getMsgId()));
            int i = remove.f230730M;
            if (i < 0 || i > 5) {
                remove.f230730M = 0 + 1;
                remove.f230755r = true;
                if (C86709a0.m107522a()) {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(remove.getMsgId(), remove);
                    Log.m105925i("MicroMsg.StaticMapMsgLogic", "on error count %d", Integer.valueOf(remove.f230730M));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo107944c() {
        C77830r zx02 = C77832s.zx0();
        Iterator it = ((ArrayList) zx02.f226774g).iterator();
        while (it.hasNext()) {
            if (equals((C75351c) it.next())) {
                return;
            }
        }
        ((ArrayList) zx02.f226774g).add(this);
        Log.m105924i("MicroMsg.StaticMapServer", "addMapCallBack " + ((ArrayList) zx02.f226774g).size());
        if (((ArrayList) zx02.f226774g).size() == 1) {
            C86709a0.m107524d().mo123455a(C38230b.CTRL_INDEX, zx02);
        }
    }
}
