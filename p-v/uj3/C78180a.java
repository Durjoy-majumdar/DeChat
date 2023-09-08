package uj3;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C45094u2;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.chatting.C44851e0;
import com.tencent.p014mm.p136ui.chatting.C6784h2;
import com.tencent.p014mm.p136ui.chatting.C73688g2;
import com.tencent.p014mm.p136ui.chatting.C74349y3;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74123m7;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74152o6;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74272u8;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72841x1;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import de3.C45335p;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C97625j3;
import ex0.C45696d;
import ex0.C45700h;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gy3.C87412m;
import hc0.C20937c;
import hd0.C98408n0;
import hd0.C98429r0;
import hk3.C76227e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import km2.C33942d;
import mh0.C99865e0;
import nj3.C76879j;
import p248ug.C52558c;
import p629ny.C76978g;
import p682rz.C101489t;
import p682rz.C101491u;
import p749xh.C102645g6;
import p823sg.C101611g;
import qc0.C101093a;
import qc0.C101106m;
import rb0.C47997p;
import rb0.C77495c;
import rb0.C77498e;
import s90.C48299e;
import sb0.C48340e;
import vd3.C78404m;
import wk3.C78606a;
import zj3.C79345d;
import zj3.C79348e;
import zj3.C79368l;
import zt3.C119157j;

/* renamed from: uj3.a */
public class C78180a extends BaseAdapter implements C79368l {

    /* renamed from: A */
    public long f229036A = -1;

    /* renamed from: B */
    public CopyOnWriteArraySet<Long> f229037B = new CopyOnWriteArraySet<>();

    /* renamed from: C */
    public Map<Long, Integer> f229038C = new HashMap();

    /* renamed from: D */
    public Map<Long, WeakReference<View>> f229039D = new HashMap();

    /* renamed from: E */
    public boolean f229040E = false;

    /* renamed from: F */
    public boolean f229041F = false;

    /* renamed from: G */
    public boolean f229042G = false;

    /* renamed from: H */
    public boolean f229043H = false;

    /* renamed from: I */
    public final MTimerHandler f229044I = new MTimerHandler(new C78181a(), true);

    /* renamed from: J */
    public C78606a f229045J;

    /* renamed from: K */
    public ListView f229046K;

    /* renamed from: L */
    public final View.OnLayoutChangeListener f229047L = new C78182b();

    /* renamed from: M */
    public boolean f229048M;

    /* renamed from: N */
    public int f229049N = -1;

    /* renamed from: P */
    public Runnable f229050P;

    /* renamed from: Q */
    public boolean f229051Q = false;

    /* renamed from: R */
    public int f229052R = 0;

    /* renamed from: S */
    public C75875l.C75877b f229053S = new C78184d();

    /* renamed from: T */
    public C101489t.C77595a f229054T = new C78185e();

    /* renamed from: U */
    public C99865e0.C99869e f229055U = new C78188f();

    /* renamed from: V */
    public long f229056V = -1;

    /* renamed from: W */
    public C20937c f229057W = null;

    /* renamed from: X */
    public Set<Integer> f229058X = new HashSet();

    /* renamed from: d */
    public C6784h2 f229059d;

    /* renamed from: e */
    public C6784h2 f229060e;

    /* renamed from: f */
    public C73688g2 f229061f;

    /* renamed from: g */
    public C73688g2 f229062g;

    /* renamed from: h */
    public C72841x1 f229063h;

    /* renamed from: i */
    public C72841x1 f229064i;

    /* renamed from: j */
    public C45094u2 f229065j;

    /* renamed from: n */
    public C45094u2 f229066n;

    /* renamed from: o */
    public C44851e0 f229067o;

    /* renamed from: p */
    public C44851e0 f229068p;

    /* renamed from: q */
    public View.OnClickListener f229069q = null;

    /* renamed from: r */
    public C45335p f229070r;

    /* renamed from: s */
    public final int f229071s;

    /* renamed from: t */
    public final int f229072t;

    /* renamed from: u */
    public C67391b f229073u;

    /* renamed from: v */
    public LayoutInflater f229074v;

    /* renamed from: w */
    public SparseArray<C72963f4> f229075w = new SparseArray<>();

    /* renamed from: x */
    public HashSet<Long> f229076x = new HashSet<>();

    /* renamed from: y */
    public SparseIntArray f229077y = new SparseIntArray();

    /* renamed from: z */
    public long f229078z = -1;

    /* renamed from: uj3.a$a */
    public class C78181a implements MTimerHandler.CallBack {
        public C78181a() {
        }

        public boolean onTimerExpired() {
            C67391b bVar = C78180a.this.f229073u;
            if (bVar == null || !bVar.f193283g) {
                return true;
            }
            Log.m105924i("MicroMsg.ChattingDataAdapter", "[onTimerExpired]");
            C78180a.this.mo108171E0();
            return true;
        }
    }

    /* renamed from: uj3.a$b */
    public class C78182b implements View.OnLayoutChangeListener {
        public C78182b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C67391b bVar;
            long j = (long) (i8 - i6);
            long j2 = (long) (i4 - i2);
            if (j > 0 && j2 > j && (bVar = C78180a.this.f229073u) != null && bVar.mo91581v()) {
                C78180a.this.f229073u.mo91542C(false, true, true);
            }
        }
    }

    /* renamed from: uj3.a$c */
    public class C78183c implements Runnable {
        public C78183c() {
        }

        public void run() {
            C78180a.this.notifyDataSetChanged();
        }
    }

    /* renamed from: uj3.a$d */
    public class C78184d implements C75875l.C75877b {
        public C78184d() {
        }

        /* renamed from: w5 */
        public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            if (lVar != null && eVar != null && eVar.f123844a != null && C78180a.this.f229073u.mo91577r() != null && eVar.f123844a.equals(C78180a.this.f229073u.mo91577r())) {
                C78180a.this.mo108171E0();
            }
        }
    }

    /* renamed from: uj3.a$e */
    public class C78185e implements C101489t.C77595a {

        /* renamed from: uj3.a$e$a */
        public class C78186a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C101489t.C77595a.C77596a f229084d;

            public C78186a(C101489t.C77595a.C77596a aVar) {
                this.f229084d = aVar;
            }

            public void run() {
                C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f229084d.f226215a);
                if (Zd != null) {
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(Zd.f288567n);
                    if (!Util.isNullOrNil(b002.mo108765s2())) {
                        int type = b002.getType();
                        Log.m105925i("MicroMsg.ChattingDataAdapter", "updateStatus, check revoke status msg type %d", Integer.valueOf(type));
                        if (43 != type && 62 != type && Zd.f288562i == 199 && b002.mo108774y2() != Zd.f288556c && C98429r0.m127830u()) {
                            Log.m105924i("MicroMsg.ChattingDataAdapter", "had uploaded after msg revoke, do revoke again");
                            b002.mo108745Y2(Zd.f288556c);
                            b002.setType(43);
                            ((C119157j) C119157j.f356862d).mo183895z(new a$e$a$$a(this, b002));
                        }
                    }
                }
            }
        }

        /* renamed from: uj3.a$e$b */
        public class C78187b implements Runnable {
            public C78187b() {
            }

            public void run() {
                C78180a.this.mo108171E0();
            }
        }

        public C78185e() {
        }

        /* renamed from: d5 */
        public void mo102579d5(C101489t.C77595a.C77596a aVar) {
            boolean z;
            int i;
            if (aVar == null || (i = aVar.f226218d) == 3 || !(i == 2 || i == -1 || i == 1)) {
                z = false;
            } else {
                z = C74123m7.m88223e(aVar);
                ((C119157j) C119157j.f356862d).mo183875f(new C78186a(aVar));
            }
            if (!z) {
                MMHandlerThread.postToMainThread(new C78187b());
            }
        }
    }

    /* renamed from: uj3.a$f */
    public class C78188f implements C99865e0.C99869e {

        /* renamed from: uj3.a$f$a */
        public class C78189a implements Runnable {
            public C78189a() {
            }

            public void run() {
                C78180a.this.mo108171E0();
            }
        }

        public C78188f() {
        }

        /* renamed from: so */
        public void mo108219so(C102645g6 g6Var) {
            if (g6Var != null) {
                MMHandlerThread.postToMainThread(new C78189a());
            }
        }
    }

    public C78180a(C67391b bVar, ListView listView) {
        bVar.mo91579t(C79368l.class, this);
        this.f229046K = listView;
        this.f229073u = bVar;
        this.f229074v = C85868k2.m106137b(bVar.mo91565f());
        this.f229071s = bVar.mo91572m().getDimensionPixelSize(C0966R.dimen.f3963ll);
        this.f229072t = bVar.mo91572m().getDimensionPixelSize(C0966R.dimen.f3906ig);
        C6784h2 h2Var = new C6784h2();
        this.f229060e = h2Var;
        this.f229059d = h2Var;
        C73688g2 g2Var = new C73688g2(bVar);
        this.f229062g = g2Var;
        this.f229061f = g2Var;
        C72841x1 x1Var = new C72841x1(bVar.mo91565f());
        this.f229064i = x1Var;
        this.f229063h = x1Var;
        C45094u2 u2Var = new C45094u2(bVar);
        this.f229066n = u2Var;
        this.f229065j = u2Var;
        C44851e0 e0Var = new C44851e0(bVar);
        this.f229068p = e0Var;
        this.f229067o = e0Var;
        this.f229070r = new C74349y3(bVar);
        mo108188Z();
    }

    /* renamed from: A */
    public static boolean m94381A(C72963f4 f4Var) {
        return !f4Var.mo101017u3() && !f4Var.mo100962B3() && !f4Var.mo100986Y3();
    }

    /* renamed from: I */
    public static void m94382I(C74023i.C74026c cVar, C72963f4 f4Var, C78208e eVar, C67391b bVar) {
        String str;
        C52558c bizInfo;
        cVar.setChatHolder(eVar);
        C74023i iVar = cVar.chattingItem;
        cVar.playingMsgId = null;
        C101106m b = C101093a.m132480b();
        if (b != null && b.f295960e != null && b.f295959d == 0 && C101093a.m132481c()) {
            cVar.playingMsgId = b.f295960e;
        }
        iVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C74023i.f217196u = currentTimeMillis;
        if (C74023i.f217196u + 30000 < currentTimeMillis) {
            C74023i.f217195t = C97625j3.m125812b().mo105883I();
        }
        iVar.f217197d = C74023i.f217195t;
        if (iVar.mo26239m0()) {
            str = iVar.mo103068y(bVar, f4Var);
            iVar.mo102973h(cVar, bVar, f4Var, str);
            iVar.mo103089g(cVar, bVar, str, f4Var);
        } else {
            str = null;
        }
        ProgressBar progressBar = cVar.uploadingPB;
        if (progressBar != null) {
            progressBar.setTag(C0966R.C0970id.b7q, (Object) null);
            Future future = iVar.f217209s;
            if (future != null) {
                future.cancel(true);
            }
            cVar.uploadingPB.setVisibility(8);
            cVar.uploadingPB.setTag(C0966R.C0970id.b7o, Long.valueOf(f4Var.getCreateTime()));
        }
        iVar.mo26237f(cVar, bVar, f4Var, str);
        int adapterPosition = cVar.getAdapterPosition();
        Class cls = C79348e.class;
        if (bVar.mo91574o() != null && bVar.mo91574o().mo62916m3() && (bizInfo = ((C79348e) bVar.f193278b.mo102812a(cls)).getBizInfo()) != null && bizInfo.mo73506x2()) {
            int count = ((C79368l) bVar.f193278b.mo102812a(C79368l.class)).getCount();
            long y4 = ((C79348e) bVar.f193278b.mo102812a(cls)).mo70080y4();
            C72996z1 o = bVar.mo91574o();
            C47997p.f128731j = y4;
            C77495c cVar2 = C77495c.f225960a;
            C87412m.m108594g(o, "talker");
            C87412m.m108594g(f4Var, "msg");
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                C101611g<Long, Long> gVar = C77495c.f225961b;
                if (gVar.get(Long.valueOf(f4Var.getMsgId())) != null) {
                    Long l = gVar.get(Long.valueOf(f4Var.getMsgId()));
                    C87412m.m108593f(l, "reportCache[msg.msgId]");
                    if (currentTimeMillis2 - l.longValue() < 1000) {
                        return;
                    }
                }
                gVar.put(Long.valueOf(f4Var.getMsgId()), Long.valueOf(currentTimeMillis2));
                ((C119157j) C119157j.f356862d).mo183876g(new C77498e(o, f4Var, adapterPosition, count, y4), "BizServicesReportThread");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BizChattingItemReportHelper", e, "reportServiceMsgExpose exception", new Object[0]);
            }
        }
    }

    /* renamed from: A1 */
    public C72841x1 mo108165A1() {
        return this.f229063h;
    }

    /* renamed from: A2 */
    public int mo108166A2(C72963f4 f4Var) {
        if (f4Var == null) {
            return -1;
        }
        for (int i = 0; i < this.f229075w.size(); i++) {
            if (this.f229075w.get(i).getMsgId() == f4Var.getMsgId()) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B4 */
    public void mo108167B4() {
        Log.m105925i("MicroMsg.ChattingDataAdapter", "[unLockNotify] isLockNotify:%s notifyCountWhileLock:%s", Boolean.valueOf(this.f229051Q), Integer.valueOf(this.f229052R));
        if (this.f229051Q) {
            this.f229051Q = false;
            if (this.f229052R > 0) {
                this.f229045J.mo108594d(C76227e.C76228a.ACTION_UPDATE, false, (Bundle) null);
            }
            this.f229052R = 0;
        }
    }

    /* renamed from: D2 */
    public C44851e0 mo108168D2() {
        return this.f229067o;
    }

    /* renamed from: D4 */
    public void mo108169D4(Runnable runnable) {
        this.f229050P = runnable;
    }

    /* renamed from: D5 */
    public void mo108170D5(int i, int i2) {
        C72996z1 o;
        String content;
        C68070l.C68072b u;
        C74023i a;
        String y;
        String username;
        Class cls = C45696d.class;
        C67391b bVar = this.f229073u;
        if (bVar != null && (o = bVar.mo91574o()) != null) {
            LinkedList linkedList = new LinkedList();
            boolean Cl0 = ((C45696d) C86709a0.m107533q(cls)).Cl0();
            if (o.mo62916m3()) {
                ArrayList arrayList = new ArrayList();
                while (i <= i2) {
                    C72963f4 N = mo108182N(i);
                    if (N != null && N.getType() == 285212721) {
                        Log.m105926v("MicroMsg.ChattingDataAdapter", "terry checkpreload:" + N.getMsgId());
                        arrayList.add(new String[]{String.valueOf(N.getMsgId()), N.getContent(), "-1"});
                        C48299e eVar = new C48299e();
                        eVar.f129340h = N.getMsgId();
                        eVar.f129339g = N.getContent();
                        if (Cl0) {
                            linkedList.add(eVar);
                        }
                    }
                    i++;
                }
                if (arrayList.size() > 0) {
                    ((C45696d) C86709a0.m107533q(cls)).n90(arrayList, 0);
                    if (Cl0) {
                        ((C45696d) C86709a0.m107533q(cls)).mo71016xs(linkedList, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            LinkedList linkedList2 = new LinkedList();
            while (i <= i2) {
                C72963f4 N2 = mo108182N(i);
                if (!(N2 == null || (N2.getType() & 49) == 0 || (content = N2.getContent()) == null || (u = C68070l.C68072b.m80422u(content, N2.mo108775z2())) == null || TextUtils.isEmpty(u.f195586j) || !u.f195586j.contains(WeChatHosts.domainString(C0966R.string.f360885fm3)) || (a = C74272u8.m88589a(N2)) == null || (y = a.mo103068y(this.f229073u, N2)) == null || (username = o.getUsername()) == null)) {
                    int b = C45629t0.m50815b(y, this.f229073u.mo91577r());
                    int i3 = -1;
                    C68065f fVar = (C68065f) u.mo93555w(C68065f.class);
                    if (fVar != null) {
                        i3 = fVar.f195417b;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(u.f195586j);
                    arrayList2.add(String.valueOf(i3));
                    arrayList2.add(String.valueOf(N2.mo108774y2()));
                    arrayList2.add(username);
                    arrayList2.add(String.valueOf(b));
                    arrayList2.add(y);
                    arrayList2.add(String.valueOf(N2.getCreateTime()));
                    arrayList2.add(String.valueOf(((C45696d) C86709a0.m107533q(cls)).mo70963J2(username)));
                    linkedList2.add(arrayList2);
                }
                i++;
            }
            if (linkedList2.size() > 0) {
                ((C45696d) C86709a0.m107533q(cls)).mo71004o8(linkedList2, 1);
            }
        }
    }

    /* renamed from: E0 */
    public void mo108171E0() {
        if (this.f229051Q) {
            this.f229052R++;
            Log.m105924i("MicroMsg.ChattingDataAdapter", "[handleMsgChange] isLockNotify:" + this.f229052R);
        } else if (!this.f229048M) {
            Log.m105924i("MicroMsg.ChattingDataAdapter", "[handleMsgChange] is not resumeState ");
        } else {
            this.f229045J.mo108594d(C76227e.C76228a.ACTION_UPDATE, false, (Bundle) null);
        }
    }

    /* renamed from: E5 */
    public void mo108172E5(int i, C76227e.C76228a aVar) {
        Log.m105925i("MicroMsg.ChattingDataAdapter", "[locationByMsgId] position:%s mode:%s", Integer.valueOf(i), aVar);
        Bundle bundle = new Bundle();
        bundle.putInt("MSG_POSITION", i);
        bundle.putInt("SCENE", 2);
        this.f229045J.mo108594d(aVar, false, bundle);
    }

    /* renamed from: G */
    public void mo108173G(long j, boolean z) {
        if (((HashMap) this.f229039D).containsKey(Long.valueOf(j))) {
            if (((HashMap) this.f229038C).containsKey(Long.valueOf(j))) {
                WeakReference weakReference = (WeakReference) ((HashMap) this.f229039D).get(Long.valueOf(j));
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    C74152o6.C74155b.m88311p0((C74023i.C74026c) view.getTag(), z);
                    return;
                }
                return;
            }
        }
        Log.m105918d("MicroMsg.ChattingDataAdapter", "msg not display, " + j);
    }

    /* renamed from: G1 */
    public void mo108174G1() {
        Log.m105925i("MicroMsg.ChattingDataAdapter", "[lockNotify] isLockNotify:%s notifyCountWhileLock:%s", Boolean.valueOf(this.f229051Q), Integer.valueOf(this.f229052R));
        if (!this.f229051Q) {
            this.f229051Q = true;
            this.f229052R = 0;
        }
    }

    /* renamed from: K1 */
    public SparseArray<C72963f4> mo108175K1() {
        return this.f229075w;
    }

    /* renamed from: L */
    public void mo108176L(boolean z) {
        this.f229041F = z;
    }

    /* renamed from: L4 */
    public long mo108177L4() {
        long j = this.f229056V;
        if (j != -1) {
            return j;
        }
        this.f229056V = 0;
        int count = getCount() - 1;
        while (true) {
            if (count < 0) {
                break;
            }
            C72963f4 item = getItem(count);
            if (item.mo108769t2() == 1 && (item.f230723F & 4) != 4) {
                this.f229056V = item.getMsgId();
                break;
            }
            count--;
        }
        return this.f229056V;
    }

    /* renamed from: L5 */
    public void mo108178L5(C78606a aVar) {
        this.f229045J = aVar;
    }

    /* renamed from: M2 */
    public void mo108179M2() {
        this.f229040E = false;
        notifyDataSetChanged();
        Log.m105918d("MicroMsg.ChattingDataAdapter", "enable ClickListener");
        this.f229059d = this.f229060e;
        this.f229061f = this.f229062g;
        this.f229063h = this.f229064i;
        this.f229065j = this.f229066n;
        this.f229067o = this.f229068p;
    }

    /* renamed from: M3 */
    public void mo108180M3(int i, int i2) {
        C72996z1 o;
        String content;
        C68070l.C68072b u;
        C67391b bVar = this.f229073u;
        if (bVar != null && (o = bVar.mo91574o()) != null && !o.mo62916m3()) {
            LinkedList linkedList = new LinkedList();
            while (i <= i2) {
                C72963f4 N = mo108182N(i);
                if (!(N == null || (content = N.getContent()) == null || (u = C68070l.C68072b.m80422u(content, N.mo108775z2())) == null || u.f195582i != 5 || TextUtils.isEmpty(u.f195586j))) {
                    C45700h.C45702b bVar2 = new C45700h.C45702b();
                    bVar2.f123504a = u.f195586j;
                    bVar2.f123506c = 1;
                    bVar2.f123508e = u.f195562d;
                    bVar2.f123509f = u.f195570f;
                    bVar2.f123510g = u.f195574g;
                    bVar2.f123511h = this.f229073u.mo91583x() ? "groupmessage" : "singlemessage";
                    bVar2.f123507d = 2;
                    linkedList.add(bVar2);
                }
                i++;
            }
            if (((C45696d) C86709a0.m107533q(C45696d.class)) != null && linkedList.size() > 0) {
                Log.m105927v("MicroMsg.ChattingDataAdapter", "[TRACE_PREFETCH] checkPreAuths authInfo size = %s", Integer.valueOf(linkedList.size()));
                ((C45700h) C86709a0.m107533q(C45700h.class)).mo71026A3(linkedList, 2);
            }
        }
    }

    /* renamed from: M5 */
    public int mo108181M5() {
        return this.f229037B.size();
    }

    /* renamed from: N */
    public final C72963f4 mo108182N(int i) {
        int i2 = i - 1;
        SparseArray<C72963f4> sparseArray = this.f229075w;
        if (sparseArray == null || i2 < 0 || i2 >= sparseArray.size()) {
            return null;
        }
        return this.f229075w.get(i2);
    }

    /* renamed from: N0 */
    public boolean mo108183N0(long j) {
        View view;
        int i = 0;
        if (this.f229037B.contains(Long.valueOf(j))) {
            Log.m105919d("MicroMsg.ChattingDataAdapter", "remove select item, msgId = %d", Long.valueOf(j));
            this.f229037B.remove(Long.valueOf(j));
        } else {
            Log.m105919d("MicroMsg.ChattingDataAdapter", "add select item, msgId = %d", Long.valueOf(j));
            int size = this.f229037B.size();
            int a = this.f229041F ? C33942d.m40199a() : 99;
            if (size >= a) {
                C76879j.m92748s(this.f229073u.mo91565f(), this.f229041F ? this.f229073u.mo91572m().getString(C0966R.string.cbq, new Object[]{Integer.valueOf(a)}) : this.f229073u.mo91572m().getString(C0966R.string.cbp, new Object[]{99}), "");
                return false;
            }
            this.f229037B.add(Long.valueOf(j));
        }
        View view2 = null;
        if (this.f229046K != null) {
            while (true) {
                if (i >= this.f229046K.getChildCount()) {
                    break;
                }
                View childAt = this.f229046K.getChildAt(i);
                C74023i.C74026c cVar = (C74023i.C74026c) childAt.getTag();
                if (cVar != null && (view = cVar.maskView) != null && ((Long) view.getTag()).longValue() == j) {
                    view2 = childAt;
                    break;
                }
                i++;
            }
        }
        if (view2 != null) {
            C74023i.C74026c cVar2 = (C74023i.C74026c) view2.getTag();
            CheckBox checkBox = cVar2.checkBox;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                cVar2.checkBox.setChecked(this.f229037B.contains(Long.valueOf(j)));
            }
        } else {
            notifyDataSetChanged();
        }
        return true;
    }

    /* renamed from: T1 */
    public void mo108184T1(long j, int i, int i2) {
        if (((HashMap) this.f229039D).containsKey(Long.valueOf(j))) {
            if (((HashMap) this.f229038C).containsKey(Long.valueOf(j))) {
                WeakReference weakReference = (WeakReference) ((HashMap) this.f229039D).get(Long.valueOf(j));
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    C74152o6.C74155b.m88310o0((C74023i.C74026c) view.getTag(), i, i2);
                    return;
                }
                return;
            }
        }
        Log.m105918d("MicroMsg.ChattingDataAdapter", "msg not display, " + j);
    }

    /* renamed from: T3 */
    public void mo108185T3(int i) {
        C72963f4 item = getItem(i);
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        if (item == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.ChattingDataAdapter", "[setShowHistoryMsgTipId] pos:%s msg is null? %s", objArr);
        if (!(item == null || item.getMsgId() == 0)) {
            this.f229078z = item.getMsgId();
        }
        notifyDataSetChanged();
    }

    /* renamed from: V */
    public void mo108186V(long j, C72963f4 f4Var, boolean z) {
        if (((HashMap) this.f229039D).containsKey(Long.valueOf(j))) {
            if (((HashMap) this.f229038C).containsKey(Long.valueOf(j))) {
                WeakReference weakReference = (WeakReference) ((HashMap) this.f229039D).get(Long.valueOf(j));
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    C74152o6.C74153a.m88300o0(this.f229073u.mo91565f(), (C74023i.C74026c) view.getTag(), f4Var, z);
                    return;
                }
                return;
            }
        }
        Log.m105918d("MicroMsg.ChattingDataAdapter", "msg not display, " + j);
    }

    /* renamed from: V4 */
    public void mo108187V4() {
        this.f229043H = true;
        Log.m105918d("MicroMsg.ChattingDataAdapter", "disable clickListener");
        this.f229059d = null;
        this.f229061f = null;
        this.f229063h = null;
        this.f229065j = null;
        this.f229067o = null;
    }

    /* renamed from: Z */
    public final void mo108188Z() {
        if (this.f229057W == null) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C48340e.m53671l(this.f229073u.mo91577r());
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59359o = C0966R.raw.default_avatar;
            try {
                this.f229057W = bVar.mo32666a();
            } catch (NullPointerException e) {
                Log.printErrStackTrace("MicroMsg.ChattingDataAdapter", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: Z4 */
    public C6784h2 mo108189Z4() {
        return this.f229059d;
    }

    /* renamed from: b0 */
    public boolean mo108190b0(C72963f4 f4Var) {
        return f4Var != null && m94381A(f4Var);
    }

    /* renamed from: c3 */
    public void mo81320c3(Object obj) {
        if (Log.getLogLevel() <= 1) {
            Log.m105919d("MicroMsg.ChattingDataAdapter", "_notifyDataSetChanged() called %s" + Util.getStack(), Integer.valueOf(getCount()));
        }
        notifyDataSetChanged();
        C67391b bVar = this.f229073u;
        bVar.f193293q = true;
        bVar.mo91570k().mo81289D().setVisibility(0);
        ((ChattingUIFragment) this.f229073u.f193288l).mo102097u0(false);
    }

    /* renamed from: d1 */
    public void mo108191d1(boolean z) {
        if (this.f229042G != z) {
            this.f229042G = z;
            notifyDataSetChanged();
        }
    }

    /* renamed from: d2 */
    public void mo108192d2() {
        CopyOnWriteArraySet<Long> copyOnWriteArraySet = this.f229037B;
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.clear();
        }
    }

    /* renamed from: e5 */
    public void mo108193e5(C72963f4 f4Var) {
        this.f229040E = true;
        notifyDataSetChanged();
        Log.m105918d("MicroMsg.ChattingDataAdapter", "disable clickListener");
        this.f229059d = null;
        this.f229061f = null;
        this.f229063h = null;
        this.f229065j = null;
        this.f229067o = null;
    }

    /* renamed from: f4 */
    public C101489t.C77595a mo108194f4() {
        return this.f229054T;
    }

    public void finish() {
        this.f229078z = -1;
        this.f229077y.clear();
    }

    public int getCount() {
        return this.f229075w.size();
    }

    public C73688g2 getDoubleClickListener() {
        return this.f229061f;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return C74272u8.m88590b(getItem(i));
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C74023i.C74026c cVar;
        boolean z;
        boolean z2;
        int i2 = i;
        View view2 = view;
        long currentTimeMillis = System.currentTimeMillis();
        C72963f4 item = getItem(i);
        boolean z3 = !((HashSet) this.f229058X).isEmpty();
        StringBuilder sb = new StringBuilder();
        sb.append("[getView] position:");
        sb.append(i2);
        sb.append(" msgId:");
        sb.append(item.getMsgId());
        sb.append(" svrId:");
        sb.append(item.mo108774y2());
        sb.append(" type:");
        sb.append(item.getType());
        sb.append(" send:");
        sb.append(item.mo108769t2());
        sb.append(" talker:");
        sb.append(item.mo108768t());
        sb.append(" msgSep:");
        sb.append(item.mo108772w2());
        sb.append(" time:");
        sb.append(item.getCreateTime());
        sb.append("convertView@:");
        sb.append(view2 != null ? Integer.valueOf(view.hashCode()) : "null");
        sb.append("isInAnim:");
        sb.append(z3);
        Log.m105924i("MicroMsg.ChattingDataAdapter", sb.toString());
        if (z3 && view2 != null) {
            return view2;
        }
        if (i2 == 0) {
            C67391b bVar = this.f229073u;
            bVar.getClass();
            Log.m105924i("MicroMsg.ChattingContext", "[scrollToLastProtect]");
            ((ChattingUIFragment) bVar.f193287k).mo102090s0();
        }
        if (i2 != 0 && this.f229077y.get(i2) == 0) {
            long createTime = item.getCreateTime() - getItem(i2 - 1).getCreateTime();
            int i3 = (createTime > 0 ? 1 : (createTime == 0 ? 0 : -1));
            boolean z4 = i3 > 0 && createTime < 60000;
            boolean z5 = i3 > 0 && createTime / ApkDownloadManager.INTERVAL < 1;
            if (z4 || z5) {
                this.f229077y.put(i2, 2);
            } else {
                this.f229077y.put(i2, 1);
            }
        }
        boolean z6 = (item.f230723F & 262144) != 0;
        boolean z7 = (this.f229077y.get(i2) == 1 || i2 == 0 || this.f229076x.contains(Long.valueOf(item.getMsgId())) || z6) && item.getCreateTime() > 1000;
        boolean z8 = item.getMsgId() == this.f229078z;
        boolean z9 = view2 == null;
        if (view2 == null) {
            C74023i a = C74272u8.m88589a(item);
            view2 = a.mo26231E(this.f229074v, view2);
            cVar = (C74023i.C74026c) view2.getTag();
            cVar.setChattingItem(a);
        } else {
            cVar = (C74023i.C74026c) view.getTag();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (z7) {
            cVar.timeTV.setVisibility(0);
            z2 = z7;
            z = z6;
            cVar.timeTV.setText(C72715f.m85112e(this.f229073u.mo91565f(), item.getCreateTime(), false));
            if (cVar.timeTV.getTextSize() > ((float) C76577a.m92151b(this.f229073u.mo91565f(), 25))) {
                Log.m105921e("MicroMsg.ChattingDataAdapter", "WDF!!! TextSize:%s", Float.valueOf(cVar.timeTV.getTextSize()));
            }
        } else {
            z = z6;
            z2 = z7;
            cVar.timeTV.setVisibility(8);
        }
        View view3 = cVar.historyMsgTip;
        if (view3 != null) {
            if (z8) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view3;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f229036A == -1) {
            C72963f4 ov02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).ov0(this.f229073u.mo91577r());
            if (ov02 != null) {
                this.f229036A = ov02.getMsgId();
            } else {
                this.f229036A = 0;
            }
        }
        if (cVar.noMoreMsgTip != null) {
            if (!this.f229041F || item.getMsgId() != this.f229036A) {
                View view6 = cVar.noMoreMsgTip;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view8 = cVar.noMoreMsgTip;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view9 = view8;
                C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        m94382I(cVar, item, new C78207d(i2), this.f229073u);
        C78404m O1 = ((C79345d) this.f229073u.f193278b.mo102812a(C79345d.class)).mo70145O1();
        if (cVar.timeTV.getVisibility() == 0 && O1 != null) {
            cVar.timeTV.setTextColor(O1.f229734a);
            if (O1.f229735b) {
                cVar.timeTV.setShadowLayer(2.0f, 1.2f, 1.2f, O1.f229736c);
            } else {
                cVar.timeTV.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            if (O1.f229737d) {
                if (O1.f229738e) {
                    cVar.timeTV.setBackgroundResource(C0966R.C0969drawable.f4747lp);
                } else {
                    cVar.timeTV.setBackgroundResource(C0966R.C0969drawable.f4746lo);
                }
                TextView textView = cVar.timeTV;
                int i4 = this.f229072t;
                int i5 = this.f229071s;
                textView.setPadding(i4, i5, i4, i5);
            } else {
                cVar.timeTV.setBackgroundColor(0);
            }
        }
        TextView textView2 = cVar.userTV;
        if (!(textView2 == null || textView2.getVisibility() != 0 || O1 == null || this.f229073u.mo91577r().equals("qqmail") || item.getType() == 318767153)) {
            if (O1.f229738e) {
                cVar.userTV.setTextColor(-1);
                TextView textView3 = cVar.userTV;
                textView3.setShadowLayer((float) C76577a.m92151b(textView3.getContext(), 2), 0.0f, (float) C76577a.m92151b(cVar.userTV.getContext(), 1), this.f229073u.mo91572m().getColor(C0966R.color.BW_0_Alpha_0_5));
            } else {
                cVar.userTV.setTextColor(O1.f229734a);
                cVar.userTV.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
        View view10 = cVar.maskView;
        if (view10 != null) {
            view10.setTag(Long.valueOf(item.getMsgId()));
        }
        if ((!this.f229040E || !m94381A(item)) && !this.f229043H) {
            cVar.showEditView(false);
        } else {
            CheckBox checkBox = cVar.checkBox;
            if (checkBox != null) {
                checkBox.setChecked(this.f229037B.contains(Long.valueOf(item.getMsgId())));
            }
            View view11 = cVar.maskView;
            if (view11 != null) {
                view11.setOnClickListener(this.f229069q);
            }
            cVar.showEditView(true);
        }
        if (!this.f229040E || !this.f229042G || this.f229037B.contains(Long.valueOf(item.getMsgId()))) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(Float.valueOf(1.0f));
            View view12 = view2;
            C117292a.m165358d(view12, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
            C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(Float.valueOf(0.5f));
            View view13 = view2;
            C117292a.m165358d(view13, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
            C117292a.m165359e(view13, "com/tencent/mm/ui/chatting/adapter/ChattingDataAdapter", "dealItemView", "(Landroid/view/View;ILcom/tencent/mm/storage/MsgInfo;ZLandroid/view/ViewGroup;Z)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (Log.getLogLevel() <= 1) {
            Log.m105919d("MicroMsg.ChattingDataAdapter", "dealItemView() isCreateConvertView:%s cost:%s ChattingItem:%s  ", Boolean.valueOf(z9), Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), cVar.chattingItem);
        }
        Iterator it = ((HashMap) this.f229039D).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() != null && ((View) ((WeakReference) entry.getValue()).get()) == view2) {
                ((HashMap) this.f229039D).remove(entry.getKey());
                ((HashMap) this.f229038C).remove(entry.getKey());
                break;
            }
        }
        ((HashMap) this.f229039D).put(Long.valueOf(item.getMsgId()), new WeakReference(view2));
        if (item.mo100979R3()) {
            ((HashMap) this.f229038C).put(Long.valueOf(item.getMsgId()), Integer.valueOf(item.mo108769t2()));
        }
        if (((C74023i.C74026c) view2.getTag()).chattingItem.mo103082P()) {
            view2.addOnLayoutChangeListener(this.f229047L);
        }
        if (Log.getLogLevel() <= 1) {
            Log.m105925i("MicroMsg.ChattingDataAdapter", "getview cost:%s isInviteNewUI:%s, showTime:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        return view2;
    }

    public int getViewTypeCount() {
        return ((ArrayList) C74272u8.f218154a).size() + 2;
    }

    /* renamed from: i0 */
    public void mo108201i0(int i) {
        C72963f4 item = getItem(i);
        if (item != null && item.getMsgId() != 0) {
            this.f229076x.add(Long.valueOf(item.getMsgId()));
        }
    }

    /* renamed from: j */
    public C20937c mo108202j() {
        if (this.f229057W == null) {
            mo108188Z();
        }
        return this.f229057W;
    }

    /* renamed from: m5 */
    public C99865e0.C99869e mo108203m5() {
        return this.f229055U;
    }

    /* renamed from: n2 */
    public void mo91530n2(int i, boolean z) {
        if (z) {
            ((HashSet) this.f229058X).add(Integer.valueOf(i));
            return;
        }
        ((HashSet) this.f229058X).remove(Integer.valueOf(i));
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f229077y.clear();
        Runnable runnable = this.f229050P;
        if (runnable != null) {
            runnable.run();
        }
        this.f229058X.clear();
    }

    /* renamed from: p */
    public int mo108205p() {
        if (-1 == this.f229049N) {
            this.f229049N = ((C72972g4) C97625j3.m125812b().mo105911z()).Vx0(this.f229073u.mo91577r());
        }
        return this.f229049N;
    }

    /* renamed from: p3 */
    public Set<Long> mo108206p3() {
        return this.f229037B;
    }

    /* renamed from: p4 */
    public void mo108207p4(C76227e.C76228a aVar) {
        C78606a aVar2 = this.f229045J;
        if (aVar2 != null) {
            aVar2.mo108594d(aVar, false, (Bundle) null);
        }
    }

    public void pause() {
        this.f229048M = false;
        ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this.f229053S);
        ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f229070r);
        Log.m105924i("MicroMsg.ChattingDataAdapter", "adapter pause");
        this.f229044I.stopTimer();
    }

    public void resume() {
        this.f229048M = true;
        Log.m105924i("MicroMsg.ChattingDataAdapter", "adapter resume");
        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101137qq(this.f229053S, Looper.getMainLooper());
        ((C76978g) C86312j.m106911c(C76978g.class)).k30(this.f229070r);
        this.f229044I.startTimer(300000);
        if (this.f229045J != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("SCENE", 3);
            this.f229045J.mo108594d(C76227e.C76228a.ACTION_UPDATE, false, bundle);
        }
    }

    /* renamed from: s2 */
    public C45094u2 mo108210s2() {
        return this.f229065j;
    }

    /* renamed from: t5 */
    public void mo108211t5(View.OnClickListener onClickListener) {
        this.f229069q = onClickListener;
    }

    /* renamed from: v */
    public View mo108212v(long j) {
        if (!this.f229039D.containsKey(Long.valueOf(j))) {
            Log.m105918d("MicroMsg.ChattingDataAdapter", "msg not display, " + j);
            return null;
        }
        WeakReference weakReference = this.f229039D.get(Long.valueOf(j));
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            return view;
        }
        return null;
    }

    /* renamed from: v1 */
    public boolean mo108213v1() {
        return this.f229040E;
    }

    /* renamed from: y2 */
    public void mo108214y2(long j, boolean z, boolean z2, boolean z3, int i, boolean z4, C76227e.C76228a aVar) {
        Log.m105925i("MicroMsg.ChattingDataAdapter", "[locationByMsgId] messageId:%s loadAllBottomMsg:%s mode:%s", Long.valueOf(j), Boolean.valueOf(z), aVar);
        Bundle bundle = new Bundle();
        bundle.putLong("MSG_ID", j);
        bundle.putInt("SCENE", 1);
        bundle.putBoolean("IS_LOAD_ALL", z);
        bundle.putBoolean("IS_HIGHLIGHT_ITEM", z2);
        bundle.putBoolean("IS_IDLE_VISBLE", z3);
        bundle.putInt("SELECTION_TOP_OFFSET", i);
        bundle.putBoolean("IS_SMOOTH_SCROLL", z4);
        this.f229045J.mo108594d(aVar, true, bundle);
    }

    /* renamed from: z1 */
    public void mo91031z1() {
        this.f229073u.mo91571l().post(new C78183c());
    }

    public C72963f4 getItem(int i) {
        return this.f229075w.get(i);
    }
}
