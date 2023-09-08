package y03;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
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
import x03.C22947b;
import x03.C22950e;
import x03.C22953h;
import x03.C22959l;
import x03.C22974q;

/* renamed from: y03.v */
public class C23214v extends C22950e {

    /* renamed from: h */
    public C22947b f66646h;

    /* renamed from: i */
    public boolean f66647i;

    /* renamed from: j */
    public boolean f66648j;

    /* renamed from: n */
    public C23207k f66649n;

    /* renamed from: y03.v$a */
    public class C23215a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f66650d;

        /* renamed from: e */
        public final /* synthetic */ boolean f66651e;

        /* renamed from: y03.v$a$a */
        public class C23216a implements Runnable {

            /* renamed from: y03.v$a$a$a */
            public class C23217a implements DialogInterface.OnDismissListener {
                public C23217a(C23216a aVar) {
                }

                public void onDismiss(DialogInterface dialogInterface) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TOP_STORY_VIDEO_EDUCATION_INT, 1);
                    C86709a0.m107535s().mo121142i().mo119681a(true);
                }
            }

            /* renamed from: y03.v$a$a$b */
            public class C23218b implements C47883u {
                public C23218b(C23216a aVar) {
                }

                /* renamed from: a */
                public void mo353a(boolean z, String str) {
                }
            }

            public C23216a() {
            }

            public void run() {
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(C23214v.this.f65918g.mo24990t().getString(C0966R.string.k5c));
                qVar.mo107589a(true);
                qVar.mo107601m(C0966R.string.lkg);
                qVar.mo107600l(new C23218b(this));
                qVar.mo107593e(new C23217a(this));
                qVar.mo107603o();
            }
        }

        public C23215a(List list, boolean z) {
            this.f66650d = list;
            this.f66651e = z;
        }

        public void run() {
            C22974q C6 = C23214v.this.f66646h.mo24946C6();
            synchronized (C6) {
                LinkedList linkedList = (LinkedList) C6.mo36192b();
                Log.m105925i("MicroMsg.TopStory.TopStoryOnlyFSVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", Integer.valueOf(linkedList.size()), Integer.valueOf(this.f66650d.size()));
                if (this.f66651e) {
                    int size = linkedList.size();
                    if (linkedList.size() > 0) {
                        linkedList.clear();
                        linkedList.addAll(this.f66650d);
                        C23214v vVar = C23214v.this;
                        if (vVar.f66648j) {
                            vVar.notifyDataSetChanged();
                        } else {
                            if (!(vVar.f66649n == null || linkedList.get(0) == null)) {
                                xh4 xh4 = (xh4) linkedList.get(0);
                                C23214v.this.f66649n.mo36169G(xh4);
                                ((HashMap) C23214v.this.f65917f).put(xh4.f64729h, new WeakReference(C23214v.this.f66649n));
                                C23214v.this.f66649n = null;
                                if ((xh4.f64711L & 128) > 0 && C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VIDEO_EDUCATION_INT, 0) <= 0) {
                                    C23214v.this.f65918g.getRecyclerView().postDelayed(new C23216a(), 1000);
                                }
                            }
                            C23214v vVar2 = C23214v.this;
                            vVar2.notifyItemRangeInserted(vVar2.mo36133O4() + size, this.f66650d.size() - size);
                        }
                        C23214v.this.f66646h.mo24967U2().mo36207e((xh4) this.f66650d.get(0));
                    } else {
                        linkedList.addAll(this.f66650d);
                        C23214v vVar3 = C23214v.this;
                        vVar3.notifyItemRangeInserted(vVar3.mo36133O4(), this.f66650d.size());
                    }
                } else {
                    int size2 = linkedList.size();
                    linkedList.addAll(this.f66650d);
                    C23214v vVar4 = C23214v.this;
                    vVar4.notifyItemChanged(vVar4.mo36133O4() + size2);
                    C23214v vVar5 = C23214v.this;
                    vVar5.notifyItemRangeInserted(size2 + vVar5.mo36133O4(), this.f66650d.size());
                }
            }
        }
    }

    public C23214v(C22947b bVar) {
        super(bVar);
        this.f66646h = bVar;
    }

    /* renamed from: F4 */
    public void mo36131F4(List<xh4> list, boolean z) {
        super.mo36131F4(list, z);
        MMHandlerThread.postToMainThread(new C23215a(list, z));
    }

    /* renamed from: g5 */
    public int mo36134g5(int i) {
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C22953h hVar = (C22953h) zVar;
        Log.m105925i("MicroMsg.TopStory.TopStoryOnlyFSVideoAdapter", "onBindViewHolder %d", Integer.valueOf(i));
        if (!(i < mo36133O4()) && !mo36136w5(i)) {
            int O4 = i - mo36133O4();
            C23207k kVar = (C23207k) hVar;
            xh4 d = this.f66646h.mo24946C6().mo36193d(O4);
            kVar.mo36169G(d);
            ((HashMap) this.f65917f).put(d.f64729h, new WeakReference(kVar));
            if (O4 == 0) {
                this.f66649n = kVar;
            }
            if (this.f66647i && O4 == 0) {
                if (!Util.isNullOrNil(d.f64726e)) {
                    kVar.mo36171I(!this.f66646h.mo24973X4().f65982a);
                    this.f66647i = false;
                    this.f66648j = false;
                } else {
                    this.f66648j = true;
                }
            }
            if (this.f66646h.mo24967U2().f66025f != null) {
                this.f66646h.mo24967U2().f66025f.f62810g = 1;
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
        return new C23219w(inflate, this.f66646h);
    }
}
