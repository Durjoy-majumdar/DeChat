package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98410o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import p158gt.C98201k;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.b0 */
public final class C97197b0 extends C78802b implements C101489t.C77595a {

    /* renamed from: h */
    public ViewGroup f285207h;

    /* renamed from: i */
    public Map<String, Long> f285208i = new HashMap();

    /* renamed from: j */
    public Map<Long, C97200c> f285209j = new HashMap();

    /* renamed from: com.tencent.mm.ui.conversation.banner.b0$b */
    public static final class C97199b implements Runnable {

        /* renamed from: d */
        public WeakReference<C97197b0> f285210d;

        public C97199b(C97198a aVar) {
        }

        public void run() {
            Class cls = C101488s.class;
            List<C98408n0> n = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137725n();
            C98410o0 o0Var = (C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0();
            o0Var.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor rawQuery = o0Var.f288587a.rawQuery(C98410o0.m127729k("videoinfo2") + " WHERE status=198 AND masssendid > 0 order by masssendid desc", (String[]) null, 2);
            while (rawQuery.moveToNext()) {
                C98408n0 n0Var = new C98408n0();
                n0Var.mo137698a(rawQuery);
                arrayList.add(n0Var);
            }
            rawQuery.close();
            C97197b0 b0Var = this.f285210d.get();
            if (b0Var == null) {
                Log.m105928w("MicroMsg.MassSightBanner", "try to load date, but banner ref is null");
                return;
            }
            ArrayList arrayList2 = (ArrayList) n;
            Log.m105925i("MicroMsg.MassSightBanner", "ViewCount %d, unfinish size %d, fail size %d", Integer.valueOf(b0Var.f285207h.getChildCount()), Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()));
            if (b0Var.f285207h.getChildCount() != 0 || !arrayList2.isEmpty() || !arrayList.isEmpty()) {
                C97201d dVar = new C97201d((C97198a) null);
                dVar.f285219d = new WeakReference<>(this.f285210d.get());
                dVar.f285220e = n;
                dVar.f285221f = arrayList;
                MMHandlerThread.postToMainThread(dVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.banner.b0$c */
    public static final class C97200c {

        /* renamed from: a */
        public long f285211a = 0;

        /* renamed from: b */
        public boolean f285212b = false;

        /* renamed from: c */
        public View f285213c = null;

        /* renamed from: d */
        public C94571a f285214d = null;

        /* renamed from: e */
        public ImageView f285215e = null;

        /* renamed from: f */
        public TextView f285216f = null;

        /* renamed from: g */
        public ProgressBar f285217g = null;

        /* renamed from: h */
        public ImageButton f285218h = null;
    }

    /* renamed from: com.tencent.mm.ui.conversation.banner.b0$d */
    public static final class C97201d implements Runnable {

        /* renamed from: d */
        public WeakReference<C97197b0> f285219d;

        /* renamed from: e */
        public List<C98408n0> f285220e;

        /* renamed from: f */
        public List<C98408n0> f285221f;

        public C97201d(C97198a aVar) {
        }

        /* renamed from: b */
        public static void m125159b(C97200c cVar, C98408n0 n0Var) {
            boolean z = true;
            Log.m105927v("MicroMsg.MassSightBanner", "info status %d", Integer.valueOf(n0Var.f288562i));
            int i = n0Var.f288562i;
            if (i == 198 || i == 197 || i == 196) {
                cVar.f285217g.setVisibility(4);
                cVar.f285216f.setVisibility(0);
                cVar.f285218h.setEnabled(true);
                cVar.f285212b = true;
                return;
            }
            float f = ((float) n0Var.f288557d) / ((float) n0Var.f288559f);
            cVar.f285217g.setVisibility(0);
            cVar.f285216f.setVisibility(4);
            ProgressBar progressBar = cVar.f285217g;
            progressBar.setProgress((int) (((float) progressBar.getMax()) * f));
            ImageButton imageButton = cVar.f285218h;
            if (Float.compare(0.99f, f) <= 0) {
                z = false;
            }
            imageButton.setEnabled(z);
            cVar.f285212b = false;
        }

        /* renamed from: a */
        public int mo136111a(String str, C97197b0 b0Var, List<C98408n0> list, int i, int i2, int i3) {
            int i4;
            View view;
            C97197b0 b0Var2 = b0Var;
            int i5 = i;
            for (C98408n0 next : list) {
                ((HashMap) b0Var2.f285208i).put(next.mo137700d(), Long.valueOf(next.f288577x));
                if (((HashMap) b0Var2.f285209j).containsKey(Long.valueOf(next.f288577x))) {
                    Log.m105919d("MicroMsg.MassSightBanner", "%s: has contains massSendId %d, file %s", str, Long.valueOf(next.f288577x), next.mo137700d());
                } else {
                    if (i5 < i2) {
                        i4 = i5 + 1;
                        view = b0Var2.f285207h.getChildAt(i5);
                        Log.m105919d("MicroMsg.MassSightBanner", "%s: refresh view(%d/%d, hashCode %d) with massSendId %d", str, Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(view.hashCode()), Long.valueOf(next.f288577x));
                    } else {
                        View inflate = LayoutInflater.from(b0Var2.f285207h.getContext()).inflate(C0966R.C0971layout.bba, b0Var2.f285207h, false);
                        b0Var2.f285207h.addView(inflate);
                        Log.m105919d("MicroMsg.MassSightBanner", "%s: new view(%d/%d, hashCode %d) with massSendId %d", str, Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(inflate.hashCode()), Long.valueOf(next.f288577x));
                        i4 = i5;
                        view = inflate;
                    }
                    C97200c cVar = (C97200c) view.getTag();
                    if (cVar == null) {
                        cVar = new C97200c();
                    }
                    Class cls = C101488s.class;
                    long j = cVar.f285211a;
                    if (j != next.f288577x) {
                        Log.m105919d("MicroMsg.MassSightBanner", "ashutest::mass send id not match! %d -> %d, totalCount %d", Long.valueOf(j), Long.valueOf(next.f288577x), Integer.valueOf(i3));
                        cVar.f285211a = next.f288577x;
                        cVar.f285213c = view;
                        cVar.f285214d = (C94571a) view.findViewById(C0966R.C0970id.f5d);
                        cVar.f285215e = (ImageView) view.findViewById(C0966R.C0970id.k1c);
                        cVar.f285217g = (ProgressBar) view.findViewById(C0966R.C0970id.i7j);
                        cVar.f285218h = (ImageButton) view.findViewById(C0966R.C0970id.apy);
                        cVar.f285216f = (TextView) view.findViewById(C0966R.C0970id.f358456f71);
                        cVar.f285214d.setDrawableWidth(view.getResources().getDimensionPixelSize(C0966R.dimen.f3919iy));
                        cVar.f285213c.setTag(cVar);
                        cVar.f285218h.setTag(Long.valueOf(cVar.f285211a));
                        cVar.f285213c.setOnClickListener(new C97203c0(cVar));
                        cVar.f285218h.setOnClickListener(new C97206d0(cVar));
                    } else {
                        Log.m105919d("MicroMsg.MassSightBanner", "ashutest::mass send id match! %d, totalCount %d", Long.valueOf(j), Integer.valueOf(i3));
                    }
                    String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(next.mo137700d());
                    String r = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(next.mo137700d());
                    cVar.f285214d.setThumbBmp(((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).fq0(r, C76577a.m92156g(view.getContext()), view.getContext(), -1));
                    if (i3 > 3) {
                        cVar.f285214d.clear();
                        cVar.f285215e.setVisibility(0);
                    } else {
                        cVar.f285214d.mo130071b(q, false, 0);
                        cVar.f285215e.setVisibility(8);
                    }
                    m125159b(cVar, next);
                    ((HashMap) b0Var2.f285209j).put(Long.valueOf(next.f288577x), cVar);
                    i5 = i4;
                }
            }
            return i5;
        }

        public void run() {
            C97197b0 b0Var = this.f285219d.get();
            if (b0Var == null) {
                Log.m105928w("MicroMsg.MassSightBanner", "try to refresh, but banner ref is null");
                return;
            }
            int childCount = b0Var.f285207h.getChildCount();
            ((HashMap) b0Var.f285209j).clear();
            HashSet hashSet = new HashSet();
            Iterator it = ((ArrayList) this.f285220e).iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((C98408n0) it.next()).f288577x));
            }
            Iterator it4 = ((ArrayList) this.f285221f).iterator();
            while (it4.hasNext()) {
                hashSet.add(Long.valueOf(((C98408n0) it4.next()).f288577x));
            }
            int size = hashSet.size();
            C97197b0 b0Var2 = b0Var;
            int i = childCount;
            int i2 = size;
            int a = mo136111a("update fail", b0Var2, this.f285221f, mo136111a("update unfinish", b0Var2, this.f285220e, 0, i, i2), i, i2);
            for (int i3 = a; i3 < childCount; i3++) {
                b0Var.f285207h.removeViewAt(a);
            }
        }
    }

    public C97197b0(Context context) {
        super(context);
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137716b(this, Looper.getMainLooper());
        this.f285207h = (ViewGroup) this.f230569f;
    }

    /* renamed from: a */
    public void mo7968a() {
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.bb_;
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        String str = aVar.f226215a;
        Long l = (Long) ((HashMap) this.f285208i).get(str);
        if (l == null) {
            Log.m105919d("MicroMsg.MassSightBanner", "massSendId is null, fileName %s", str);
            if (Util.nullAs(str, "").startsWith("DELETE_")) {
                Log.m105924i("MicroMsg.MassSightBanner", "call update status");
                C97199b bVar = new C97199b((C97198a) null);
                bVar.f285210d = new WeakReference<>(this);
                C86709a0.m107525e().postToWorker(bVar);
                return;
            }
            return;
        }
        C97200c cVar = (C97200c) ((HashMap) this.f285209j).get(l);
        if (cVar == null) {
            Log.m105919d("MicroMsg.MassSightBanner", "find massSendId %d, but holder is null", l);
            return;
        }
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(str);
        if (Zd == null) {
            Log.m105929w("MicroMsg.MassSightBanner", "on nofify changed, filename %s, massSendId %d, but videoinfo is null", str, l);
        } else if (Zd.f288562i == 199) {
            Log.m105925i("MicroMsg.MassSightBanner", "fileName %s, massSendId %d, done", str, l);
            Log.m105924i("MicroMsg.MassSightBanner", "call update status");
            C97199b bVar2 = new C97199b((C97198a) null);
            bVar2.f285210d = new WeakReference<>(this);
            C86709a0.m107525e().postToWorker(bVar2);
        } else {
            C97201d.m125159b(cVar, Zd);
        }
    }
}
