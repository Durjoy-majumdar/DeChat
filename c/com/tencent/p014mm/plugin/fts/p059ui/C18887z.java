package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.widget.AbsListView;
import android.widget.ListView;
import aw1.C16729m;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.plugin.fts.p059ui.widget.C18882g;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import he0.C46021h;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jr2.C99019x;
import kr0.C21378k0;
import kr0.C33993f0;
import kv1.C99251g;
import kv1.C99252h;
import kv1.C99260q;
import lc3.C10485b;
import lv1.C21461d;
import lv1.C99681n;
import nc0.C76850a;
import ov1.C21891f;
import pv1.C22019b;
import te3.pd4;
import w00.C22831a;
import w00.C22834d;
import w00.C22836f;
import zv1.C23592b;

/* renamed from: com.tencent.mm.plugin.fts.ui.z */
public class C18887z extends C18852m implements C21891f.C21893b {

    /* renamed from: A */
    public MMHandler f52953A = new MMHandler(Looper.getMainLooper());

    /* renamed from: B */
    public int f52954B = -1;

    /* renamed from: C */
    public boolean f52955C;

    /* renamed from: D */
    public boolean f52956D;

    /* renamed from: n */
    public List<C21891f> f52957n;

    /* renamed from: o */
    public C23592b f52958o = new C23592b();

    /* renamed from: p */
    public boolean f52959p;

    /* renamed from: q */
    public boolean f52960q;

    /* renamed from: r */
    public boolean f52961r = true;

    /* renamed from: s */
    public int f52962s = -1;

    /* renamed from: t */
    public int f52963t = 1;

    /* renamed from: u */
    public long f52964u;

    /* renamed from: v */
    public long f52965v;

    /* renamed from: w */
    public long f52966w;

    /* renamed from: x */
    public long f52967x;

    /* renamed from: y */
    public boolean f52968y;

    /* renamed from: z */
    public MMHandler f52969z = new C18888a(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.fts.ui.z$a */
    public class C18888a extends MMHandler {
        public C18888a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C18887z zVar = C18887z.this;
                if (!zVar.f52968y && zVar.f52857g > 0) {
                    ((C93829e) ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta()).mo128779g();
                    ((C94901o) C99019x.m128972d()).mo131118g0();
                    C18887z.this.notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.z$b */
    public class C18889b implements Runnable {

        /* renamed from: d */
        public C21891f f52971d;

        public C18889b(C21891f fVar, String str) {
            this.f52971d = fVar;
        }

        public void run() {
            pd4 pd4;
            C18887z zVar = C18887z.this;
            if (!zVar.f52955C) {
                List<C21891f> list = zVar.f52957n;
                if (list.get(list.size() - 1).getType() == this.f52971d.getType()) {
                    C18887z.this.f52955C = true;
                }
            }
            C18887z zVar2 = C18887z.this;
            zVar2.f52958o.f67694A = zVar2.f52955C;
            int i = 0;
            int i2 = 0;
            for (C21891f d : zVar2.f52957n) {
                i2 = d.mo17721d(i2);
            }
            C23592b bVar = C18887z.this.f52958o;
            ((ArrayList) bVar.f67703J).addAll(this.f52971d.mo17726i(bVar.f67705b));
            C21891f fVar = this.f52971d;
            if ((fVar instanceof C16729m) && !((C16729m) fVar).f45215n) {
                C18887z zVar3 = C18887z.this;
                zVar3.f52961r = false;
                zVar3.f52962s = i2;
            }
            C18887z zVar4 = C18887z.this;
            if (zVar4.f52961r) {
                zVar4.mo23833n(i2);
                C18887z.this.notifyDataSetChanged();
            }
            C18887z zVar5 = C18887z.this;
            zVar5.mo23831k(i2, zVar5.f52955C);
            C18887z zVar6 = C18887z.this;
            if (zVar6.f52955C) {
                zVar6.f52958o.f67706c = C31543z5.m39453c();
            }
            C18887z zVar7 = C18887z.this;
            if (zVar7.f52955C) {
                if (i2 == zVar7.f52962s) {
                    for (C21891f next : zVar7.f52957n) {
                        if (next instanceof C16729m) {
                            ((C16729m) next).f45215n = true;
                        }
                        i = next.mo17721d(i);
                    }
                    C18887z.this.f52958o.mo37072f(i);
                    C18887z zVar8 = C18887z.this;
                    zVar8.mo23887s(true, C18887z.m19829p(zVar8));
                } else {
                    int i3 = 0;
                    for (C21891f next2 : zVar7.f52957n) {
                        i3 = next2.mo17721d(i3);
                        if (next2 instanceof C16729m) {
                            C16729m mVar = (C16729m) next2;
                            C23592b bVar2 = C18887z.this.f52958o;
                            C87412m.m108594g(bVar2, "searchStaticsObj");
                            Context context = mVar.f61902e;
                            if (context instanceof BaseMvvmActivity) {
                                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                                UIStateCenter stateCenter = ((BaseMvvmActivity) context).getStateCenter();
                                if (stateCenter != null) {
                                    String str = mVar.f45213i;
                                    if (str == null) {
                                        str = "";
                                    }
                                    long j = mVar.f45214j;
                                    LinkedList<pd4> linkedList = mVar.f45217p;
                                    if (linkedList == null) {
                                        linkedList = new LinkedList<>();
                                    }
                                    stateCenter.dispatch(new C22834d(str, j, linkedList));
                                }
                            }
                            int i4 = mVar.f45222u != 0 ? 3 : 2;
                            LinkedList<pd4> linkedList2 = mVar.f45217p;
                            if (linkedList2 != null && (!linkedList2.isEmpty())) {
                                String str2 = mVar.f45213i;
                                LinkedList<pd4> linkedList3 = mVar.f45217p;
                                C18882g.m19813a(str2, bVar2, 0, "", "", "", (linkedList3 == null || (pd4 = linkedList3.get(0)) == null) ? null : pd4.f139711e, i4);
                            }
                        }
                    }
                    C18887z.this.f52958o.mo37072f(i3);
                    C18887z zVar9 = C18887z.this;
                    zVar9.mo23887s(false, C18887z.m19829p(zVar9));
                    i = i3;
                }
                C18887z.this.mo23833n(i);
                C18887z.this.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00a3, code lost:
        if (r1.f236289e.f236291a != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18887z(com.tencent.p014mm.plugin.fts.p059ui.C18854q r4, int r5) {
        /*
            r3 = this;
            r3.<init>(r4)
            r4 = 1
            r3.f52961r = r4
            r0 = -1
            r3.f52962s = r0
            r3.f52963t = r4
            com.tencent.mm.plugin.fts.ui.z$a r1 = new com.tencent.mm.plugin.fts.ui.z$a
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r3.f52969z = r1
            com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>((android.os.Looper) r2)
            r3.f52953A = r1
            r3.f52954B = r0
            zv1.b r0 = new zv1.b
            r0.<init>()
            r3.f52958o = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.lang.Class<ky2.i> r1 = ky2.C10432i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ky2.i r1 = (ky2.C10432i) r1
            boolean r1 = r1.mo10750e()
            if (r1 != 0) goto L_0x0058
            r1 = 256(0x100, float:3.59E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
        L_0x0058:
            r1 = 48
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 128(0x80, float:1.794E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 96
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = 133(0x85, float:1.86E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            boolean r1 = f40.C86709a0.m107522a()
            r2 = 0
            if (r1 != 0) goto L_0x0097
        L_0x0095:
            r4 = 0
            goto L_0x00a5
        L_0x0097:
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent r1 = new com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent
            r1.<init>()
            r1.publish()
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent$b r1 = r1.f236289e
            boolean r1 = r1.f236291a
            if (r1 == 0) goto L_0x0095
        L_0x00a5:
            if (r4 == 0) goto L_0x00b0
            r4 = 144(0x90, float:2.02E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L_0x00b0:
            java.lang.Class<kv1.q> r4 = kv1.C99260q.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            kv1.q r4 = (kv1.C99260q) r4
            android.content.Context r1 = r3.mo23829h()
            java.util.LinkedList r4 = r4.Wh0(r0, r1, r3, r5)
            r3.f52957n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.p059ui.C18887z.<init>(com.tencent.mm.plugin.fts.ui.q, int):void");
    }

    /* renamed from: p */
    public static boolean m19829p(C18887z zVar) {
        C23592b bVar = zVar.f52958o;
        return bVar.f67709f > 0 || bVar.f67711h > 0 || bVar.f67715l > 0 || bVar.f67717n > 0 || bVar.f67718o > 0 || bVar.f67719p > 0 || bVar.f67720q > 0 || bVar.f67722s > 0 || bVar.f67723t > 0;
    }

    /* renamed from: a */
    public void mo23811a(C21891f fVar, String str, boolean z) {
        if (fVar instanceof C18842a) {
            C18842a aVar = (C18842a) fVar;
            if (str.equals(this.f52858h)) {
                mo23885q(aVar.f52841n);
            }
            try {
                if (aVar.mo23810r() > 0 && this.f52964u == 0) {
                    long c = C31543z5.m39453c() - this.f52859i;
                    this.f52964u = c;
                    C18843b0.m19720g(9, c);
                    Log.m105925i("MicroMsg.FTS.FTSMainAdapter", "firstItemTime=%d", Long.valueOf(this.f52964u));
                }
            } catch (ConcurrentModificationException e) {
                Log.printErrStackTrace("MicroMsg.FTS.FTSMainAdapter", e, "", new Object[0]);
            }
            int type = aVar.getType();
            if (type != 16) {
                if (type != 32) {
                    if (type == 48 && this.f52967x == 0) {
                        long c2 = C31543z5.m39453c() - this.f52859i;
                        this.f52967x = c2;
                        Log.m105925i("MicroMsg.FTS.FTSMainAdapter", "firstGetChatroomTime=%d", Long.valueOf(c2));
                        C18843b0.m19720g(6, this.f52967x);
                    }
                } else if (this.f52966w == 0) {
                    long c3 = C31543z5.m39453c() - this.f52859i;
                    this.f52966w = c3;
                    Log.m105925i("MicroMsg.FTS.FTSMainAdapter", "firstGetContactTime=%d", Long.valueOf(c3));
                    C18843b0.m19720g(3, this.f52966w);
                }
            } else if (this.f52965v == 0) {
                long c4 = C31543z5.m39453c() - this.f52859i;
                this.f52965v = c4;
                Log.m105925i("MicroMsg.FTS.FTSMainAdapter", "firstGetTopHitsTime=%d", Long.valueOf(c4));
                C18843b0.m19720g(0, this.f52965v);
            }
            C23592b bVar = this.f52958o;
            bVar.getClass();
            for (C21891f.C21892a next : aVar.f52840j) {
                int size = next.f61909f.size() + (next.f61907d ? 1 : 0);
                int i = next.f61908e;
                if (i == -23) {
                    bVar.f67713j = size;
                    bVar.f67714k = bVar.mo37070d(next);
                } else if (i == -13) {
                    bVar.f67720q = size;
                    bVar.f67721r = bVar.mo37070d(next);
                } else if (i == -11) {
                    bVar.f67719p = size;
                } else if (i == -8) {
                    bVar.f67707d = size;
                } else if (i == -7) {
                    bVar.f67711h = size;
                    bVar.f67712i = bVar.mo37070d(next);
                } else if (i == -6) {
                    bVar.f67717n = size;
                } else if (i == -4) {
                    bVar.f67708e = size;
                } else if (i == -3) {
                    if (next.f61909f.size() > 0) {
                        List<C99681n> list = next.f61909f;
                        if (list.get(list.size() - 1).f292151e.equals("create_chatroom​")) {
                            bVar.f67710g = 1;
                            bVar.f67709f = size - 1;
                        }
                    }
                    bVar.f67709f = size;
                } else if (i != -2) {
                    if (i == -1) {
                        bVar.f67718o = size;
                    }
                } else if (next.f61909f.size() <= 0 || !next.f61909f.get(0).f292151e.equals("create_talker_message​")) {
                    bVar.f67715l = size;
                } else {
                    bVar.f67716m = 1;
                    bVar.f67715l = size - 1;
                }
            }
        } else if (fVar instanceof C16729m) {
            C16729m mVar = (C16729m) fVar;
            if (str.equals(this.f52858h)) {
                mo23885q(mVar.f45211g);
            }
            this.f52958o.f67724u = mVar.mo17724g();
        }
        this.f52958o.f67695B = mo23886r();
        new C18889b(fVar, str).run();
    }

    /* renamed from: b */
    public void mo23822b() {
        super.mo23822b();
        for (C21891f next : this.f52957n) {
            next.mo17722e();
            next.mo17727l();
        }
    }

    /* renamed from: d */
    public C22019b mo23812d(int i) {
        int i2;
        int i3;
        Iterator<C21891f> it = this.f52957n.iterator();
        C22019b bVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C21891f next = it.next();
            C22019b f = next.mo17723f(i);
            next.mo17719a();
            if (f != null) {
                bVar = f;
                break;
            }
            bVar = f;
        }
        if (bVar != null) {
            bVar.f62333k = String.valueOf(C99252h.f291031d);
            LinkedList<Integer> linkedList = new LinkedList<>();
            int i4 = 0;
            for (C21891f next2 : this.f52957n) {
                linkedList.addAll(next2.mo17720c());
                if (next2 instanceof C16729m) {
                    C16729m mVar = (C16729m) next2;
                    if (i > mVar.f45222u) {
                        if (mVar.f45215n) {
                            i3 = 0;
                        } else {
                            LinkedList<pd4> linkedList2 = mVar.f45217p;
                            i3 = Math.min(linkedList2 != null ? linkedList2.size() : 0, 3);
                        }
                        i4 = i3 - 1;
                        C23592b bVar2 = this.f52958o;
                        bVar2.f67702I = mVar.f45222u;
                        bVar2.f67701H = i4;
                    }
                }
            }
            this.f52958o.f67700G = linkedList;
            int size = linkedList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (i > linkedList.get(size).intValue()) {
                        i2 = (i - size) + i4;
                        break;
                    }
                } else {
                    i2 = i + i4;
                    break;
                }
            }
            bVar.f62331i = i2;
            this.f52963t = i2 + 1;
            bVar.f62328f = 1;
        }
        if (bVar == null) {
            Log.m105921e("MicroMsg.FTS.FTSMainAdapter", "Create Data Item Error: getCount-%d position-%d", Integer.valueOf(this.f52857g), Integer.valueOf(i));
        }
        return bVar;
    }

    /* renamed from: f */
    public void mo23813f() {
        Class cls = C75700k0.class;
        boolean z = true;
        if (!Util.isNullOrNil(this.f52958o.f67704a) && !this.f52959p) {
            C23592b bVar = this.f52958o;
            if (bVar.f67729z != 0) {
                C18843b0.m19721h(bVar);
                C18843b0.m19719f(this.f52958o);
                this.f52959p = true;
            }
        }
        this.f52959p = false;
        this.f52960q = false;
        this.f52956D = false;
        this.f52954B = -1;
        this.f52955C = false;
        this.f52958o.mo37071e();
        long g = C99251g.m129286g(3);
        C99252h.f291031d = g;
        C23592b bVar2 = this.f52958o;
        bVar2.f67729z = g;
        bVar2.f67704a = this.f52858h;
        bVar2.f67705b = C31543z5.m39453c();
        this.f52964u = 0;
        this.f52965v = 0;
        this.f52966w = 0;
        this.f52967x = 0;
        this.f52961r = true;
        this.f52962s = -1;
        this.f52963t = 1;
        HashSet hashSet = new HashSet();
        hashSet.add("filehelper");
        boolean t = C75592q0.m90790t();
        if (!t) {
            if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("BindQQSwitch"), 1) != 1) {
                z = false;
            }
            t = z;
        }
        if (!t) {
            Log.m105924i("MicroMsg.FTS.FTSMainAdapter", "summerqq BindQQSwitch off");
            hashSet.add(String.valueOf(22));
            hashSet.add(String.valueOf(23));
        }
        hashSet.add("62");
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            Log.m105924i("MicroMsg.FTS.FTSMainAdapter", "checkLookVisibility EuropeanUnionCountry");
            hashSet.add("65");
        }
        if (((C45696d) C86709a0.m107533q(C45696d.class)).k20()) {
            hashSet.add("63");
        } else {
            hashSet.add("67");
        }
        if (!((C33993f0) C86312j.m106911c(C33993f0.class)).mo59397s()) {
            hashSet.add(String.valueOf(69));
        }
        if (!((C21378k0) C86312j.m106911c(C21378k0.class)).mo33475s()) {
            hashSet.add(String.valueOf(71));
        }
        if (!((C46021h) C86312j.m106911c(C46021h.class)).mo71463s()) {
            hashSet.add(String.valueOf(74));
        }
        if (!((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_b4af18eac3d5").mo62927s3()) {
            hashSet.add(String.valueOf(73));
        }
        if (!((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_e087bb5b95e6").mo62927s3()) {
            hashSet.add(String.valueOf(76));
        }
        mo23885q(hashSet);
    }

    /* renamed from: g */
    public void mo23815g() {
        if (!this.f52960q) {
            this.f52960q = true;
            if (!this.f52956D) {
                C18843b0.m19723j(this.f52858h, false, mo23886r(), 0, this.f52958o);
            }
        }
        if (!this.f52959p) {
            this.f52959p = true;
            C18843b0.m19721h(this.f52958o);
            C18843b0.m19719f(this.f52958o);
        }
        this.f52958o.mo37071e();
        super.mo23815g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0006 A[LOOP:0: B:1:0x0006->B:4:0x0016, LOOP_START, PHI: r6 
      PHI: (r6v1 boolean) = (r6v0 boolean), (r6v10 boolean) binds: [B:0:0x0000, B:4:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23814j(android.view.View r4, pv1.C22019b r5, boolean r6) {
        /*
            r3 = this;
            java.util.List<ov1.f> r0 = r3.f52957n
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r0.next()
            ov1.f r1 = (ov1.C21891f) r1
            boolean r6 = r1.mo17718b(r4, r5, r6)
            if (r6 == 0) goto L_0x0006
        L_0x0018:
            boolean r4 = r3.f52960q
            r6 = 0
            r0 = 1
            if (r4 != 0) goto L_0x002f
            boolean r4 = r5 instanceof xv1.C23134n
            if (r4 != 0) goto L_0x002f
            java.lang.String r4 = r3.f52858h
            int r1 = r3.mo23886r()
            zv1.b r2 = r3.f52958o
            com.tencent.p014mm.plugin.fts.p059ui.C18843b0.m19723j(r4, r0, r1, r6, r2)
            r3.f52960q = r0
        L_0x002f:
            boolean r4 = r5.f62337o
            if (r4 == 0) goto L_0x0079
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r1 = r5.f62329g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r6] = r1
            int r6 = r5.f62330h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r0] = r6
            r6 = 2
            int r1 = r5.f62331i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r6] = r1
            r6 = 3
            int r1 = r5.f62332j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r6] = r1
            r6 = 4
            java.lang.String r1 = r5.f62333k
            r4[r6] = r1
            r6 = 5
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4[r6] = r1
            java.lang.String r6 = "MicroMsg.FTS.FTSMainAdapter"
            java.lang.String r1 = "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r4)
            zv1.b r4 = r3.f52958o
            r4.mo37068b(r5)
            zv1.b r4 = r3.f52958o
            com.tencent.p014mm.plugin.fts.p059ui.C18843b0.m19717d(r5, r4)
            return r0
        L_0x0079:
            boolean r4 = r5 instanceof xv1.C23121h
            if (r4 == 0) goto L_0x008a
            r3.f52956D = r0
            zv1.b r4 = r3.f52958o
            r4.mo37068b(r5)
            zv1.b r4 = r3.f52958o
            com.tencent.p014mm.plugin.fts.p059ui.C18843b0.m19717d(r5, r4)
            goto L_0x0098
        L_0x008a:
            boolean r4 = r5 instanceof xv1.C23125i
            if (r4 == 0) goto L_0x0098
            zv1.b r4 = r3.f52958o
            com.tencent.p014mm.plugin.fts.p059ui.C18843b0.m19717d(r5, r4)
            zv1.b r4 = r3.f52958o
            r4.mo37068b(r5)
        L_0x0098:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.p059ui.C18887z.mo23814j(android.view.View, pv1.b, boolean):boolean");
    }

    /* renamed from: l */
    public void mo23832l(Context context, C22019b bVar) {
        super.mo23832l(context, bVar);
        C23592b bVar2 = this.f52958o;
        bVar2.getClass();
        int i = bVar.f62323a;
        if (i != -1 && i != 0 && i != 11) {
            long c = C31543z5.m39453c();
            Iterator it = ((ArrayList) bVar2.f67703J).iterator();
            while (it.hasNext()) {
                C21461d dVar = (C21461d) it.next();
                if (dVar.f60760b == bVar.f62324b) {
                    dVar.f60763e = c - bVar2.f67705b;
                    dVar.f60769k = c;
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public void mo23834o() {
        this.f52969z.removeMessages(1);
        super.mo23834o();
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        super.onScroll(absListView, i, i2, i3);
        FTSMainUI fTSMainUI = (FTSMainUI) this.f52854d;
        fTSMainUI.getClass();
        int headerViewsCount = ((ListView) absListView).getHeaderViewsCount();
        if (fTSMainUI.f52730C == 1) {
            int lastVisiblePosition = absListView.getLastVisiblePosition();
            C18887z zVar = fTSMainUI.f52735s;
            if (lastVisiblePosition >= zVar.f52857g + headerViewsCount && zVar.f52955C && fTSMainUI.f52737u.getVisibility() == 0) {
                fTSMainUI.f52730C = 2;
                C23592b bVar = fTSMainUI.f52735s.f52958o;
                bVar.getClass();
                long c = C31543z5.m39453c();
                Iterator it = ((ArrayList) bVar.f67703J).iterator();
                while (it.hasNext()) {
                    C21461d dVar = (C21461d) it.next();
                    if ("SearchContactBar".equals(dVar.f60765g)) {
                        dVar.f60763e = c - bVar.f67705b;
                        dVar.f60769k = c;
                    }
                }
            }
        }
        fTSMainUI.getStateCenter().dispatch(new C22836f(fTSMainUI.mo23793J7(), C99252h.f291031d, absListView));
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        Class cls = C99260q.class;
        super.onScrollStateChanged(absListView, i);
        if (i == 2) {
            this.f52968y = true;
            ((C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta()).mo128780h();
            ((C94901o) C99019x.m128972d()).mo131082B();
            return;
        }
        this.f52968y = false;
        if (!((C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta()).f270801c) {
            this.f52969z.removeMessages(1);
            this.f52969z.sendEmptyMessageDelayed(1, 200);
        }
    }

    /* renamed from: q */
    public final void mo23885q(HashSet<String> hashSet) {
        int i = this.f52954B + 1;
        this.f52954B = i;
        if (i < this.f52957n.size()) {
            this.f52957n.get(this.f52954B).mo17725h(this.f52858h, this.f52953A, hashSet, C99252h.f291031d);
        }
    }

    /* renamed from: r */
    public int mo23886r() {
        int i = 0;
        for (C21891f g : this.f52957n) {
            i += g.mo17724g();
        }
        return i;
    }

    /* renamed from: s */
    public void mo23887s(boolean z, boolean z2) {
        if (mo23829h() instanceof BaseMvvmActivity) {
            UIStateCenter stateCenter = ((BaseMvvmActivity) mo23829h()).getStateCenter();
            String str = this.f52858h;
            C23592b bVar = this.f52958o;
            stateCenter.dispatch(new C22831a(str, bVar.f67729z, bVar.f67699F, z, z2));
        }
    }
}
