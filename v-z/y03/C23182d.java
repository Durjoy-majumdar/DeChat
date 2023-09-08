package y03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import te3.xh4;
import x03.C22947b;
import x03.C22950e;
import x03.C22951f;
import x03.C22953h;
import x03.C22959l;
import x03.C22974q;
import x03.C22983u;

/* renamed from: y03.d */
public class C23182d extends C22950e {

    /* renamed from: h */
    public C22947b f66574h;

    /* renamed from: i */
    public boolean f66575i = false;

    /* renamed from: y03.d$a */
    public class C23183a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f66576d;

        public C23183a(List list) {
            this.f66576d = list;
        }

        public void run() {
            C22974q C6 = C23182d.this.f65918g.mo24946C6();
            int e = C6.mo36194e();
            Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", Integer.valueOf(e), Integer.valueOf(this.f66576d.size()));
            List list = this.f66576d;
            synchronized (C6) {
                if (!Util.isNullOrNil(list)) {
                    ((LinkedList) C6.mo36192b()).addAll(list);
                }
            }
            C23182d dVar = C23182d.this;
            dVar.notifyItemChanged(e + dVar.mo36133O4());
        }
    }

    public C23182d(C22947b bVar) {
        super(bVar);
        this.f66574h = bVar;
    }

    /* renamed from: F4 */
    public void mo36131F4(List<xh4> list, boolean z) {
        super.mo36131F4(list, z);
        MMHandlerThread.postToMainThread(new C23183a(list));
    }

    /* renamed from: g5 */
    public int mo36134g5(int i) {
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C22953h hVar = (C22953h) zVar;
        if (!(i < mo36133O4()) && !mo36136w5(i)) {
            C23207k kVar = (C23207k) hVar;
            xh4 d = this.f65918g.mo24946C6().mo36193d(i - mo36133O4());
            kVar.mo36169G(d);
            ((HashMap) this.f65917f).put(d.f64729h, new WeakReference(kVar));
            if (this.f66575i && this.f66574h.mo24989r4().f64652v == i) {
                boolean d2 = this.f66574h.mo24995y5().mo36212d();
                Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoAdapter", "fs play %d %b", Integer.valueOf(this.f66574h.mo24989r4().f64652v), Boolean.valueOf(d2));
                this.f66575i = false;
                C22951f fVar = this.f66574h.mo24995y5().f66029c;
                C23184e eVar = kVar.f66637D;
                C22983u y5 = this.f66574h.mo24995y5();
                C23184e eVar2 = kVar.f66637D;
                y5.mo36210b(eVar2, eVar2.mo36138b(d));
                if (!(fVar == null || fVar == eVar)) {
                    if (fVar.mo36141e()) {
                        eVar.mo36159o();
                    }
                    C22951f.C22952a pauseReason = fVar.getPauseReason();
                    if (pauseReason == C22951f.C22952a.MOBILE_NET) {
                        eVar.mo36153i();
                    } else if (pauseReason == C22951f.C22952a.NO_NET) {
                        eVar.mo36139c();
                        eVar.mo36157m(eVar.getNoNetTip(), MMApplicationContext.getContext().getString(C0966R.string.kbc));
                    }
                }
                eVar.getControlBar().setIsPlay(d2);
                eVar.getControlBar().mo36667y();
                eVar.getControlBar().setCurrentPlaySecond(this.f66574h.mo24989r4().f64653w);
                eVar.mo36155k();
                this.f66574h.mo24977a7(kVar.f65949A);
                kVar.mo36116A();
                kVar.mo36117Y();
                eVar.f65941w.setVisibility(0);
                if (this.f66574h.mo24967U2().f66025f != null) {
                    this.f66574h.mo24967U2().f66025f.f62810g = 1;
                }
            }
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f65915d.mo162805e(i, null) != null) {
            return new C22959l(this.f65915d.mo162805e(i, null), this.f65918g);
        }
        if (this.f65916e.mo162805e(i, null) != null) {
            return new C22959l(this.f65916e.mo162805e(i, null), this.f65918g);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ca7, (ViewGroup) null);
        inflate.setTag("video");
        return new C23207k(inflate, this.f66574h);
    }
}
