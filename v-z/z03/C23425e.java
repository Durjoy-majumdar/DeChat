package z03;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import qo3.C47883u;
import qo3.C77426q;
import te3.xh4;
import x03.C22950e;
import x03.C22951f;
import x03.C22953h;
import x03.C22959l;
import x03.C22974q;
import x03.C22983u;

/* renamed from: z03.e */
public class C23425e extends C22950e {

    /* renamed from: h */
    public boolean f67182h;

    /* renamed from: i */
    public boolean f67183i;

    /* renamed from: j */
    public boolean f67184j;

    /* renamed from: n */
    public C23449k f67185n;

    /* renamed from: z03.e$a */
    public class C23426a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f67186d;

        /* renamed from: e */
        public final /* synthetic */ boolean f67187e;

        /* renamed from: z03.e$a$a */
        public class C23427a implements Runnable {

            /* renamed from: z03.e$a$a$a */
            public class C23428a implements DialogInterface.OnDismissListener {
                public C23428a(C23427a aVar) {
                }

                public void onDismiss(DialogInterface dialogInterface) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_VIDEO_EDUCATION_INT, 1);
                }
            }

            /* renamed from: z03.e$a$a$b */
            public class C23429b implements C47883u {
                public C23429b(C23427a aVar) {
                }

                /* renamed from: a */
                public void mo353a(boolean z, String str) {
                }
            }

            public C23427a() {
            }

            public void run() {
                Log.m105924i("MicroMsg.TopStory.TopStoryListVideoAdapter", "show education pop window");
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(C23425e.this.f65918g.mo24990t().getString(C0966R.string.k5c));
                qVar.mo107589a(true);
                qVar.mo107601m(C0966R.string.f8029zr);
                qVar.mo107600l(new C23429b(this));
                qVar.mo107593e(new C23428a(this));
                qVar.mo107603o();
            }
        }

        public C23426a(List list, boolean z) {
            this.f67186d = list;
            this.f67187e = z;
        }

        public void run() {
            C22974q C6 = ((C23423b) C23425e.this.f65918g).mo24946C6();
            synchronized (C6) {
                LinkedList linkedList = (LinkedList) C6.mo36192b();
                boolean z = true;
                Log.m105925i("MicroMsg.TopStory.TopStoryListVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", Integer.valueOf(linkedList.size()), Integer.valueOf(this.f67186d.size()));
                if (this.f67187e) {
                    int size = linkedList.size();
                    if (linkedList.size() > 0) {
                        if (!((xh4) linkedList.get(0)).f64729h.equals(((xh4) this.f67186d.get(0)).f64729h)) {
                            this.f67186d.remove(0);
                            z = false;
                        } else {
                            linkedList.clear();
                        }
                        linkedList.addAll(this.f67186d);
                        if (z) {
                            xh4 xh4 = (xh4) this.f67186d.get(0);
                            linkedList.set(0, xh4);
                            C22953h u5 = C23425e.this.mo36135u5(xh4);
                            if (u5 != null) {
                                u5.mo36169G(xh4);
                            }
                        }
                        C23425e eVar = C23425e.this;
                        if (eVar.f67184j) {
                            eVar.notifyDataSetChanged();
                        } else {
                            if (!(eVar.f67185n == null || linkedList.get(0) == null)) {
                                xh4 xh42 = (xh4) linkedList.get(0);
                                C23425e.this.f67185n.mo36169G(xh42);
                                ((HashMap) C23425e.this.f65917f).put(xh42.f64729h, new WeakReference(C23425e.this.f67185n));
                                C23425e.this.f67185n = null;
                                if ((xh42.f64711L & 128) > 0 && C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VIDEO_EDUCATION_INT, 0) <= 0) {
                                    C23425e.this.f65918g.getRecyclerView().postDelayed(new C23427a(), 1000);
                                }
                            }
                            C23425e eVar2 = C23425e.this;
                            eVar2.notifyItemRangeInserted(eVar2.mo36133O4() + size, this.f67186d.size() - size);
                        }
                        ((C23423b) C23425e.this.f65918g).mo24967U2().mo36207e((xh4) linkedList.get(0));
                    } else {
                        linkedList.addAll(this.f67186d);
                        C23425e eVar3 = C23425e.this;
                        eVar3.notifyItemRangeInserted(eVar3.mo36133O4(), this.f67186d.size());
                    }
                } else {
                    int size2 = linkedList.size();
                    linkedList.addAll(this.f67186d);
                    C23425e eVar4 = C23425e.this;
                    eVar4.notifyItemRangeInserted(size2 + eVar4.mo36133O4(), this.f67186d.size());
                }
            }
        }
    }

    public C23425e(C23423b bVar) {
        super(bVar);
    }

    /* renamed from: F4 */
    public void mo36131F4(List<xh4> list, boolean z) {
        super.mo36131F4(list, z);
        MMHandlerThread.postToMainThread(new C23426a(list, z));
    }

    /* renamed from: g5 */
    public int mo36134g5(int i) {
        return Util.isNullOrNil((List) ((C23423b) this.f65918g).mo24946C6().mo36193d(i - mo36133O4()).f64703D) ? 0 : 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C22953h hVar = (C22953h) zVar;
        if (!(i < mo36133O4()) && !mo36136w5(i)) {
            int O4 = i - mo36133O4();
            C23449k kVar = (C23449k) hVar;
            xh4 d = ((C23423b) this.f65918g).mo24946C6().mo36193d(O4);
            kVar.mo36169G(d);
            ((HashMap) this.f65917f).put(d.f64729h, new WeakReference(kVar));
            if (O4 == 0) {
                this.f67185n = kVar;
            }
            if (!this.f67182h || O4 != 0) {
                ((C23423b) this.f65918g).mo24967U2().mo36207e(d);
            } else if (!Util.isNullOrNil(d.f64726e)) {
                kVar.mo36171I(!((C23423b) this.f65918g).mo24973X4().f65982a);
                this.f67182h = false;
                ((C23423b) this.f65918g).mo24967U2().mo36207e(d);
                this.f67184j = false;
            } else {
                this.f67184j = true;
            }
            if (this.f67183i && O4 == ((C23423b) this.f65918g).mo24989r4().f64652v) {
                boolean d2 = ((C23423b) this.f65918g).mo24995y5().mo36212d();
                Log.m105925i("MicroMsg.TopStory.TopStoryListVideoAdapter", "full screen play %d %b", Integer.valueOf(((C23423b) this.f65918g).mo24989r4().f64652v), Boolean.valueOf(d2));
                this.f67183i = false;
                C22951f fVar = ((C23423b) this.f65918g).mo24995y5().f66029c;
                C22951f fVar2 = kVar.f67223D;
                if (fVar.mo36141e()) {
                    fVar2.mo36159o();
                }
                C22983u y5 = ((C23423b) this.f65918g).mo24995y5();
                C22951f fVar3 = kVar.f67223D;
                ((C23433i) fVar3).getClass();
                y5.mo36210b(fVar3, C96814a.C96817e.CONTAIN);
                if (fVar != fVar2) {
                    C22951f.C22952a pauseReason = fVar.getPauseReason();
                    if (pauseReason == C22951f.C22952a.MOBILE_NET) {
                        fVar2.mo36153i();
                    } else if (pauseReason == C22951f.C22952a.NO_NET) {
                        fVar2.mo36139c();
                        fVar2.mo36157m(fVar2.getNoNetTip(), MMApplicationContext.getContext().getString(C0966R.string.kbc));
                    }
                }
                fVar2.getControlBar().setIsPlay(d2);
                fVar2.getControlBar().setCurrentPlaySecond(((C23423b) this.f65918g).mo24989r4().f64653w);
                ((C23423b) this.f65918g).mo24977a7(kVar.f65949A);
                fVar2.mo36155k();
                fVar2.f65941w.setVisibility(0);
                kVar.mo36908J();
                kVar.mo36116A();
                kVar.mo36117Y();
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
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cai, (ViewGroup) null);
        inflate.setTag("video");
        return i == 0 ? new C23449k(inflate, (C23423b) this.f65918g, false) : new C23449k(inflate, (C23423b) this.f65918g, true);
    }
}
