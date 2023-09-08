package com.tencent.p014mm.p136ui.chatting.component;

import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C74336w3;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.plugin.selectrecord.p890ui.RecordSelectTipsBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import f62.C75700k0;
import hk3.C76227e;
import hv0.C98544e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kg3.C76577a;
import nm2.C76927a;
import p270xi.C91212b;
import rm2.C77539a;
import s90.C77632o;
import zj3.C79368l;
import zj3.C79376p0;
import zt3.C119157j;

@C91212b(exportInterface = C79376p0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.y3 */
public class C73658y3 extends C73412a implements C79376p0, RecordSelectTipsBar.C71034c, C77632o {

    /* renamed from: x */
    public static HashMap<Long, Integer> f216269x = new HashMap<>();

    /* renamed from: e */
    public RecordSelectTipsBar f216270e;

    /* renamed from: f */
    public View f216271f;

    /* renamed from: g */
    public boolean f216272g = false;

    /* renamed from: h */
    public boolean f216273h = true;

    /* renamed from: i */
    public int f216274i = -1;

    /* renamed from: j */
    public int f216275j = -1;

    /* renamed from: n */
    public int f216276n = -1;

    /* renamed from: o */
    public long f216277o = -1;

    /* renamed from: p */
    public int f216278p = 0;

    /* renamed from: q */
    public C73662d f216279q = null;

    /* renamed from: r */
    public boolean f216280r = true;

    /* renamed from: s */
    public boolean f216281s = false;

    /* renamed from: t */
    public boolean f216282t = false;

    /* renamed from: u */
    public boolean f216283u = false;

    /* renamed from: v */
    public CopyOnWriteArraySet<Long> f216284v = new CopyOnWriteArraySet<>();

    /* renamed from: w */
    public HashMap<Long, C72963f4> f216285w = new HashMap<>();

    /* renamed from: com.tencent.mm.ui.chatting.component.y3$a */
    public class C73659a implements Runnable {
        public C73659a() {
        }

        public void run() {
            C73658y3 y3Var = C73658y3.this;
            C74336w3 w3Var = y3Var.f215752d.f193288l;
            int height = y3Var.f216270e.getHeight();
            ChattingUIFragment chattingUIFragment = (ChattingUIFragment) w3Var;
            chattingUIFragment.getClass();
            try {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chattingUIFragment.f215289B.getLayoutParams();
                layoutParams.topMargin = height;
                chattingUIFragment.f215289B.setLayoutParams(layoutParams);
                Log.m105919d("MicroMsg.ChattingUIFragment", "setTopMarginHeight height:%s", Integer.valueOf(height));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingUIFragment", "setTopMarginHeight height:%s, %s, %s", Integer.valueOf(height), e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.y3$b */
    public class C73660b implements Runnable {
        public C73660b() {
        }

        public void run() {
            C73658y3 y3Var = C73658y3.this;
            if (y3Var.f216271f == null) {
                y3Var.f216271f = y3Var.f215752d.mo91570k().mo81291N(C0966R.C0970id.fp6);
                C73658y3 y3Var2 = C73658y3.this;
                if (y3Var2.f216271f != null) {
                    int height = y3Var2.f215752d.mo91570k().getHeight() - C76577a.m92155f(C73658y3.this.f215752d.mo91565f(), C0966R.dimen.f3743cv);
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SELECT_RECORD_FOOT_VIEW_HEIGHT_INT_SYNC;
                    int j = i.mo119689j(aVar, 0);
                    if ((C73658y3.this.mo102689I2() && height != j) || !C73658y3.this.mo102689I2()) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C73658y3.this.f216271f.getLayoutParams();
                        layoutParams.height = height;
                        C73658y3.this.f216271f.setLayoutParams(layoutParams);
                        if (height != j) {
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(layoutParams.height));
                        }
                        Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "update footView height:%s", Integer.valueOf(layoutParams.height));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.y3$c */
    public class C73661c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Set f216288d;

        /* renamed from: e */
        public final /* synthetic */ C73662d f216289e;

        public C73661c(Set set, C73662d dVar) {
            this.f216288d = set;
            this.f216289e = dVar;
        }

        public void run() {
            if (C73658y3.this.f216278p != 0) {
                int size = this.f216288d.size() + 1;
                C73658y3 y3Var = C73658y3.this;
                if (size == y3Var.f216278p) {
                    C73662d dVar = this.f216289e;
                    long j = dVar.f216291a;
                    long j2 = y3Var.f216277o;
                    if ((j == j2 || dVar.f216292b == j2) && !this.f216288d.contains(Long.valueOf(j2))) {
                        C73658y3.this.f215752d.mo91570k().smoothScrollBy(-C76577a.m92151b(C73658y3.this.f215752d.mo91565f(), 5), 0);
                        Log.m105924i("MicroMsg.recordSelect.RecordSelectComponent", "slide below");
                    }
                    C73658y3.this.f216283u = true;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.y3$d */
    public static class C73662d {

        /* renamed from: a */
        public long f216291a = -1;

        /* renamed from: b */
        public long f216292b = -1;
    }

    /* renamed from: B5 */
    public int mo102688B5() {
        return mo102694a6((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class));
    }

    /* renamed from: I2 */
    public boolean mo102689I2() {
        return (this.f216277o == -1 || this.f216278p == 0) ? false : true;
    }

    /* renamed from: N */
    public boolean mo22497N() {
        return true;
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Class cls = C79368l.class;
        if (this.f216272g) {
            if (this.f216270e == null) {
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.l9b);
                RecordSelectTipsBar recordSelectTipsBar = (RecordSelectTipsBar) this.f215752d.mo91562c(C0966R.C0970id.ii_);
                this.f216270e = recordSelectTipsBar;
                recordSelectTipsBar.setIRecordSelectCallback(this);
            }
            C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(cls);
            lVar.mo108211t5(new C73667z3(this));
            lVar.mo108193e5((C72963f4) null);
            lVar.mo108176L(true);
            lVar.mo108192d2();
            if (mo102689I2()) {
                ((C79368l) this.f215752d.f193278b.mo102812a(cls)).mo108214y2(this.f216277o, true, false, false, 0, false, C76227e.C76228a.ACTION_POSITION);
            }
        }
    }

    /* renamed from: P */
    public void mo102690P() {
        if (!this.f216282t && !mo102689I2()) {
            C76927a.m92781a().f224800a.f194396h = (long) mo102688B5();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02b6, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02ba, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02ca, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02cd, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v8, types: [boolean, int] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo102691S() {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r0.f216272g
            r2 = 0
            if (r1 == 0) goto L_0x0337
            int r1 = r21.mo102688B5()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r2] = r5
            java.lang.String r5 = "MicroMsg.recordSelect.RecordSelectComponent"
            java.lang.String r6 = "handleFinish num:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            r4 = 0
            if (r1 != 0) goto L_0x0023
            r0.mo22499g0(r4)
            goto L_0x0322
        L_0x0023:
            ck3.b r6 = r0.f215752d
            java.lang.Class<zj3.l> r7 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r6 = r6.mo102812a(r7)
            zj3.l r6 = (zj3.C79368l) r6
            java.util.Set r6 = r6.mo108206p3()
            if (r6 != 0) goto L_0x0038
            r4 = r5
            goto L_0x0224
        L_0x0038:
            java.lang.String r14 = eb0.C75592q0.m90789s()
            java.util.Iterator r6 = r6.iterator()
            r15 = 0
            r12 = r15
        L_0x0043:
            boolean r7 = r6.hasNext()
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x01ae
            java.lang.Object r7 = r6.next()
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            com.tencent.mm.storage.f4 r17 = r0.mo102693Z5(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            if (r17 != 0) goto L_0x0062
        L_0x005f:
            r11 = r5
            goto L_0x017c
        L_0x0062:
            java.util.HashMap<java.lang.Long, java.lang.Integer> r9 = f216269x
            long r10 = r17.getMsgId()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            boolean r9 = r9.containsKey(r10)
            if (r9 == 0) goto L_0x008a
            java.util.HashMap<java.lang.Long, java.lang.Integer> r7 = f216269x
            long r8 = r17.getMsgId()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r4 = r5
            r2 = r12
            goto L_0x01a5
        L_0x008a:
            int r9 = r17.getType()
            int r9 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85061c(r9)
            boolean r10 = dv0.C75459j.m90497c(r9)
            r11 = 2
            if (r10 != 0) goto L_0x00be
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.String r9 = r17.mo108768t()
            r8[r2] = r9
            int r9 = r17.getType()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "packedMsg type is not allowed, talker[%s], type[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r9, r8)
            java.util.HashMap<java.lang.Long, java.lang.Integer> r8 = f216269x
            long r9 = r17.getMsgId()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8.put(r9, r7)
            goto L_0x005f
        L_0x00be:
            te3.f9 r10 = new te3.f9
            r10.<init>()
            r18 = r5
            long r4 = r17.mo108774y2()
            r10.f227348v = r4
            int r4 = r17.mo108769t2()
            if (r4 != r3) goto L_0x00ee
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            r4.f141175d = r14
            r4.f141176e = r3
            r10.f227335f = r4
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            java.lang.String r5 = r17.mo108768t()
            r4.f141175d = r5
            r4.f141176e = r3
            r10.f227336g = r4
            r10.f227338i = r11
            goto L_0x010b
        L_0x00ee:
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            java.lang.String r5 = r17.mo108768t()
            r4.f141175d = r5
            r4.f141176e = r3
            r10.f227335f = r4
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            r4.f141175d = r14
            r4.f141176e = r3
            r10.f227336g = r4
            r4 = 4
            r10.f227338i = r4
        L_0x010b:
            te3.qv3 r4 = new te3.qv3
            r4.<init>()
            r10.f227345s = r4
            r10.f227346t = r2
            r10.f227347u = r2
            r10.f227340n = r8
            r10.f227333d = r9
            long r4 = r17.getCreateTime()
            r19 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r19
            int r5 = (int) r4
            r10.f227339j = r5
            long r4 = r17.getCreateTime()
            r10.f227350x = r4
            long r4 = r17.mo108772w2()
            int r5 = (int) r4
            r10.f227349w = r5
            int r4 = r17.mo108762o2()
            r10.f227351y = r4
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            java.lang.String r5 = r17.getContent()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r8)
            r4.mo73357f(r5)
            r10.f227337h = r4
            dv0.e r4 = dv0.C97546e.m125691d()
            int r5 = r17.getType()
            int r5 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85061c(r5)
            dv0.n r4 = r4.mo136817c(r5)
            if (r4 != 0) goto L_0x0180
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r17.getType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r5 = "packedMsg unknow type[%d]"
            r11 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r5, r4)
            java.util.HashMap<java.lang.Long, java.lang.Integer> r4 = f216269x
            long r8 = r17.getMsgId()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r4.put(r5, r7)
        L_0x017c:
            r4 = r11
            r2 = r12
            r7 = 0
            goto L_0x01a5
        L_0x0180:
            r11 = r18
            r9 = 1
            r5 = 0
            r18 = 0
            r7 = r4
            r8 = r10
            r10 = r17
            r4 = r11
            r11 = r14
            r2 = r12
            r12 = r5
            r13 = r18
            int r7 = r7.mo105807b(r8, r9, r10, r11, r12, r13)
            java.util.HashMap<java.lang.Long, java.lang.Integer> r5 = f216269x
            long r8 = r17.getMsgId()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r5.put(r8, r9)
        L_0x01a5:
            long r7 = (long) r7
            long r12 = r2 + r7
            r5 = r4
            r2 = 0
            r3 = 1
            r4 = 0
            goto L_0x0043
        L_0x01ae:
            r4 = r5
            r2 = r12
            nm2.a r5 = nm2.C76927a.m92781a()
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r6 = r5.f224800a
            long r9 = r6.f194399k
            int r7 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x01c8
            long r11 = r5.f224814o
            long r11 = r11 + r9
            r5.f224814o = r11
            long r9 = r5.f224815p
            r11 = 1
            long r9 = r9 + r11
            r5.f224815p = r9
        L_0x01c8:
            r6.f194399k = r2
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_room_history_max_size
            r7 = 524288000(0x1f400000, float:4.065758E-20)
            int r5 = r5.mo58779Qe(r6, r7)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r10 = 0
            r7[r10] = r9
            java.lang.String r9 = "MicroMsg.recordSelect.SelectRecordConfig"
            java.lang.String r10 = "getSelectRecordMaxNum() num:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r7)
            long r9 = (long) r5
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0223
            nm2.a r2 = nm2.C76927a.m92781a()
            int r3 = r2.f224802c
            int r3 = r3 + r6
            r2.f224802c = r3
            ck3.b r2 = r0.f215752d
            android.app.Activity r2 = r2.mo91565f()
            ck3.b r3 = r0.f215752d
            android.app.Activity r3 = r3.mo91565f()
            r5 = 2131835555(0x7f113aa3, float:1.9304252E38)
            java.lang.String r3 = r3.getString(r5)
            ck3.b r5 = r0.f215752d
            android.app.Activity r5 = r5.mo91565f()
            r6 = 2131840199(0x7f114cc7, float:1.9313671E38)
            java.lang.String r5 = r5.getString(r6)
            com.tencent.mm.ui.chatting.component.a4 r6 = new com.tencent.mm.ui.chatting.component.a4
            r6.<init>(r0)
            nj3.C76879j.m92754y(r2, r3, r8, r5, r6)
            r2 = 1
            goto L_0x0224
        L_0x0223:
            r2 = 0
        L_0x0224:
            if (r2 == 0) goto L_0x022d
            java.lang.String r1 = "handleFinish exceed max storage size!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r1 = 1
            return r1
        L_0x022d:
            ck3.b r2 = r0.f215752d
            java.lang.Class<zj3.m> r3 = zj3.C79369m.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.m r2 = (zj3.C79369m) r2
            java.util.List r2 = r2.mo102683n0()
            java.util.Iterator r3 = r2.iterator()
        L_0x0241:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x025d
            java.lang.Object r4 = r3.next()
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            int r5 = r4.getType()
            r6 = 1107296305(0x42000031, float:32.000187)
            if (r5 != r6) goto L_0x025b
            r5 = 1
            r4.setType(r5)
            goto L_0x0241
        L_0x025b:
            r5 = 1
            goto L_0x0241
        L_0x025d:
            r5 = 1
            ck3.b r3 = r0.f215752d
            android.app.Activity r3 = r3.mo91565f()
            ck3.b r4 = r0.f215752d
            com.tencent.mm.storage.z1 r4 = r4.mo91574o()
            java.lang.String r4 = r4.getUsername()
            com.tencent.p014mm.p136ui.chatting.C73313b1.m86457c(r3, r2, r5, r4, r0)
            nm2.a r3 = nm2.C76927a.m92781a()
            r3.getClass()
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0286:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x02d0
            java.lang.Object r14 = r2.next()
            com.tencent.mm.storage.f4 r14 = (com.tencent.p014mm.storage.C72963f4) r14
            int r15 = r14.getType()
            switch(r15) {
                case 1: goto L_0x02c9;
                case 3: goto L_0x02c5;
                case 11: goto L_0x02c9;
                case 13: goto L_0x02c5;
                case 21: goto L_0x02c9;
                case 23: goto L_0x02c5;
                case 31: goto L_0x02c9;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02c1;
                case 36: goto L_0x02c9;
                case 39: goto L_0x02c5;
                case 42: goto L_0x02bd;
                case 43: goto L_0x02b9;
                case 44: goto L_0x02b9;
                case 47: goto L_0x02b5;
                case 49: goto L_0x029b;
                case 62: goto L_0x02b9;
                case 66: goto L_0x02bd;
                case 268435505: goto L_0x02c5;
                case 301989937: goto L_0x02c9;
                case 1107296305: goto L_0x02c9;
                default: goto L_0x0299;
            }
        L_0x0299:
            r15 = 0
            goto L_0x02cd
        L_0x029b:
            java.lang.String r14 = r14.getContent()
            r15 = 0
            com.tencent.mm.message.l$b r14 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r14, r15)
            if (r14 == 0) goto L_0x0286
            int r14 = r14.f195582i
            switch(r14) {
                case 1: goto L_0x02ca;
                case 4: goto L_0x02ba;
                case 6: goto L_0x02b2;
                case 19: goto L_0x02af;
                case 33: goto L_0x02ac;
                case 36: goto L_0x02ac;
                case 44: goto L_0x02ac;
                case 48: goto L_0x02ac;
                case 53: goto L_0x02ca;
                case 57: goto L_0x02ca;
                case 1048625: goto L_0x02b6;
                default: goto L_0x02ab;
            }
        L_0x02ab:
            goto L_0x02cd
        L_0x02ac:
            int r13 = r13 + 1
            goto L_0x0286
        L_0x02af:
            int r12 = r12 + 1
            goto L_0x0286
        L_0x02b2:
            int r11 = r11 + 1
            goto L_0x0286
        L_0x02b5:
            r15 = 0
        L_0x02b6:
            int r10 = r10 + 1
            goto L_0x0286
        L_0x02b9:
            r15 = 0
        L_0x02ba:
            int r8 = r8 + 1
            goto L_0x0286
        L_0x02bd:
            r15 = 0
            int r9 = r9 + 1
            goto L_0x0286
        L_0x02c1:
            r15 = 0
            int r7 = r7 + 1
            goto L_0x0286
        L_0x02c5:
            r15 = 0
            int r6 = r6 + 1
            goto L_0x0286
        L_0x02c9:
            r15 = 0
        L_0x02ca:
            int r5 = r5 + 1
            goto L_0x0286
        L_0x02cd:
            int r4 = r4 + 1
            goto L_0x0286
        L_0x02d0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = ";"
            r2.append(r4)
            r2.append(r5)
            r2.append(r4)
            r2.append(r6)
            r2.append(r4)
            r2.append(r7)
            r2.append(r4)
            r2.append(r8)
            r2.append(r4)
            r2.append(r9)
            r2.append(r4)
            r2.append(r10)
            r2.append(r4)
            r2.append(r11)
            r2.append(r4)
            r2.append(r12)
            r2.append(r4)
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r3 = r3.f224800a
            java.lang.String r4 = "FinalShareCountByType"
            r5 = 1
            java.lang.String r2 = r3.mo86045b(r4, r2, r5)
            r3.f194398j = r2
        L_0x0322:
            boolean r2 = r0.f216282t
            if (r2 != 0) goto L_0x0335
            boolean r2 = r21.mo102689I2()
            if (r2 != 0) goto L_0x0335
            nm2.a r2 = nm2.C76927a.m92781a()
            long r3 = (long) r1
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r1 = r2.f224800a
            r1.f194396h = r3
        L_0x0335:
            r1 = 1
            return r1
        L_0x0337:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73658y3.mo102691S():boolean");
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        boolean z;
        Class cls = C79368l.class;
        if (this.f216272g) {
            if (i2 == 0) {
                Log.m105928w("MicroMsg.recordSelect.RecordSelectComponent", "onScroll visibleItemCount == 0");
                return;
            }
            C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(cls);
            C73662d dVar = new C73662d();
            int i4 = this.f215752d.mo91568i();
            C72963f4 item = lVar.getItem(i - i4);
            if (item != null) {
                dVar.f216291a = item.getMsgId();
            }
            C72963f4 item2 = ((C79368l) this.f215752d.f193278b.mo102812a(cls)).getItem((i + 1) - i4);
            if (item2 != null) {
                dVar.f216292b = item2.getMsgId();
            }
            if (this.f216279q == null) {
                z = true;
            } else {
                if (this.f216271f == null) {
                    Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "onScroll totalItemCount:%s headerViewsCount:%s footerViewCount:%s totalCount:%s", Integer.valueOf(i3), Integer.valueOf(this.f215752d.mo91568i()), Integer.valueOf(((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().getFooterViewsCount()), Integer.valueOf(lVar.mo108205p()));
                    if (this.f216280r && (i3 - this.f215752d.mo91568i()) - ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().getFooterViewsCount() == lVar.mo108205p()) {
                        C72963f4 item3 = lVar.getItem(0);
                        if (item3.getMsgId() != 0) {
                            Pair<Boolean, Boolean> c6 = mo102696c6(lVar, item3.getMsgId());
                            if (!((Boolean) c6.first).booleanValue() || !((Boolean) c6.second).booleanValue()) {
                                View v = lVar.mo108212v(item3.getMsgId());
                                if (v != null) {
                                    CheckBox checkBox = (CheckBox) v.findViewById(C0966R.C0970id.b46);
                                    Object[] objArr = new Object[1];
                                    objArr[0] = Boolean.valueOf(checkBox == null);
                                    Log.m105919d("MicroMsg.recordSelect.RecordSelectComponent", "checkBox is null(%s)", objArr);
                                    if (checkBox == null) {
                                        this.f216280r = false;
                                    }
                                }
                            } else {
                                this.f216280r = false;
                            }
                        }
                    }
                    if (this.f216280r) {
                        RecordSelectTipsBar recordSelectTipsBar = this.f216270e;
                        recordSelectTipsBar.getClass();
                        ((C119157j) C119157j.f356862d).mo183895z(new C77539a(recordSelectTipsBar));
                    } else {
                        this.f216270e.mo97683b(mo102694a6((C79368l) this.f215752d.f193278b.mo102812a(cls)));
                    }
                    this.f215752d.mo91570k().postDelayed(new C73660b(), 300);
                }
                z = false;
            }
            Object[] objArr2 = new Object[10];
            objArr2[0] = Boolean.valueOf(z);
            objArr2[1] = Boolean.valueOf(this.f216280r);
            objArr2[2] = Integer.valueOf(i);
            objArr2[3] = Integer.valueOf(i4);
            objArr2[4] = Integer.valueOf(i2);
            objArr2[5] = Integer.valueOf(i3);
            objArr2[6] = Long.valueOf(dVar.f216291a);
            objArr2[7] = Long.valueOf(dVar.f216292b);
            C73662d dVar2 = this.f216279q;
            objArr2[8] = Long.valueOf(dVar2 != null ? dVar2.f216291a : -1);
            objArr2[9] = Boolean.valueOf(this.f216281s);
            Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "onScroll, first:%s showIntroduceView:%s firstVisibleItem:%s headerCount:%s visibleItemCount:%s totalItemCount:%s firstVisibleMsgId:%s secondVisibleMsgId:%s lastFirstVisibleMsgId:%s ifSlide:%s", objArr2);
            Set<Long> p3 = lVar.mo108206p3();
            SparseArray<C72963f4> K1 = lVar.mo108175K1();
            if (z) {
                for (int size = K1.size() - 1; size >= 0; size--) {
                    C72963f4 f4Var = K1.get(size);
                    if (f4Var != null && f4Var.getMsgId() >= dVar.f216291a && lVar.mo108190b0(f4Var) && !this.f216284v.contains(Long.valueOf(f4Var.getMsgId()))) {
                        if ((dVar.f216292b == -1 || f4Var.getMsgId() <= dVar.f216292b) && (dVar.f216292b != -1 || f4Var.getMsgId() <= dVar.f216291a)) {
                            mo102695b6(lVar, f4Var.getMsgId(), true);
                        } else {
                            lVar.mo108183N0(f4Var.getMsgId());
                        }
                    }
                }
            } else {
                long j = dVar.f216291a;
                int i5 = (j > this.f216279q.f216291a ? 1 : (j == this.f216279q.f216291a ? 0 : -1));
                if (i5 < 0) {
                    for (int size2 = K1.size() - 1; size2 >= 0; size2--) {
                        C72963f4 f4Var2 = K1.get(size2);
                        if (f4Var2 != null) {
                            if (f4Var2.getMsgId() >= dVar.f216291a && lVar.mo108190b0(f4Var2)) {
                                if (lVar.mo108206p3().size() >= 99) {
                                    Log.m105924i("MicroMsg.recordSelect.RecordSelectComponent", "onScroll max select msg num.(2)");
                                    if (!p3.contains(Long.valueOf(f4Var2.getMsgId()))) {
                                        this.f216284v.add(Long.valueOf(f4Var2.getMsgId()));
                                    }
                                } else if ((dVar.f216292b == -1 || f4Var2.getMsgId() <= dVar.f216292b) && (dVar.f216292b != -1 || f4Var2.getMsgId() <= dVar.f216291a)) {
                                    mo102695b6(lVar, f4Var2.getMsgId(), false);
                                } else if (!p3.contains(Long.valueOf(f4Var2.getMsgId())) && !this.f216284v.contains(Long.valueOf(f4Var2.getMsgId()))) {
                                    lVar.mo108183N0(f4Var2.getMsgId());
                                    if (!this.f216280r) {
                                        this.f216270e.mo97683b(mo102694a6(lVar));
                                    }
                                    mo102692Y5(true);
                                }
                            }
                        }
                    }
                } else if (i5 > 0) {
                    for (Long next : p3) {
                        if (lVar.mo108190b0(mo102693Z5(next.longValue()))) {
                            if (next.longValue() < dVar.f216291a) {
                                lVar.mo108183N0(next.longValue());
                                mo102692Y5(false);
                                if (!this.f216280r) {
                                    this.f216270e.mo97683b(mo102694a6(lVar));
                                }
                            } else if (next.longValue() == dVar.f216291a || next.longValue() == dVar.f216292b) {
                                mo102695b6(lVar, next.longValue(), false);
                            }
                        }
                    }
                } else {
                    if (!this.f216284v.contains(Long.valueOf(j)) && lVar.mo108190b0(mo102693Z5(dVar.f216291a))) {
                        if (lVar.mo108206p3().size() >= 99 && !p3.contains(Long.valueOf(dVar.f216291a))) {
                            this.f216284v.add(Long.valueOf(dVar.f216291a));
                        }
                        mo102695b6(lVar, dVar.f216291a, false);
                    }
                    if (!this.f216284v.contains(Long.valueOf(dVar.f216292b))) {
                        long j2 = dVar.f216292b;
                        if (j2 != -1 && lVar.mo108190b0(mo102693Z5(j2))) {
                            if (lVar.mo108206p3().size() >= 99 && !p3.contains(Long.valueOf(dVar.f216292b))) {
                                this.f216284v.add(Long.valueOf(dVar.f216292b));
                            }
                            mo102695b6(lVar, dVar.f216292b, false);
                        }
                    }
                }
            }
            if (this.f216281s) {
                Iterator<Long> it = this.f216284v.iterator();
                while (it.hasNext()) {
                    Long next2 = it.next();
                    if (dVar.f216291a > next2.longValue()) {
                        this.f216284v.remove(next2);
                    } else if (next2.longValue() == dVar.f216291a || next2.longValue() == dVar.f216292b) {
                        Pair<Boolean, Boolean> c64 = mo102696c6(lVar, next2.longValue());
                        if (!((Boolean) c64.first).booleanValue()) {
                            Log.m105928w("MicroMsg.recordSelect.RecordSelectComponent", "onScroll invalid");
                        } else if (!((Boolean) c64.second).booleanValue()) {
                            this.f216284v.remove(next2);
                        }
                    }
                }
            } else if (!this.f216283u) {
                ((C119157j) C119157j.f356862d).mo183878i(new C73661c(p3, dVar), 500);
            }
            this.f216279q = dVar;
        }
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
        if (this.f216272g) {
            if (!this.f216282t && !mo102689I2()) {
                C76927a.m92781a().f224800a.f194396h = (long) mo102688B5();
            }
            this.f216282t = true;
            this.f216280r = false;
            this.f216281s = true;
            this.f216270e.mo97683b(mo102694a6((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)));
            Log.m105919d("MicroMsg.recordSelect.RecordSelectComponent", "onScrollStateChanged ifSlide:%s", Boolean.valueOf(this.f216281s));
        }
    }

    /* renamed from: Y5 */
    public final void mo102692Y5(boolean z) {
        if (this.f216281s) {
            this.f216270e.performHapticFeedback(0, 2);
            if (z) {
                C76927a.m92781a().f224804e++;
                return;
            }
            C76927a.m92781a().f224805f++;
        }
    }

    /* renamed from: Z5 */
    public final C72963f4 mo102693Z5(long j) {
        if (this.f216285w.containsKey(Long.valueOf(j))) {
            return this.f216285w.get(Long.valueOf(j));
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        this.f216285w.put(Long.valueOf(j), b002);
        return b002;
    }

    /* renamed from: a6 */
    public int mo102694a6(C79368l lVar) {
        Set<Long> p3 = lVar.mo108206p3();
        if (p3 == null) {
            return 0;
        }
        return p3.size();
    }

    /* renamed from: b6 */
    public final void mo102695b6(C79368l lVar, long j, boolean z) {
        Pair<Boolean, Boolean> c6 = mo102696c6(lVar, j);
        Log.m105919d("MicroMsg.recordSelect.RecordSelectComponent", "handleFirstItemToggle msgId:%s result:%s %s", Long.valueOf(j), c6.first, c6.second);
        if (!((Boolean) c6.first).booleanValue()) {
            Log.m105928w("MicroMsg.recordSelect.RecordSelectComponent", "handleFirstItemToggle invalid");
        } else if (((Boolean) c6.second).booleanValue()) {
            if (!lVar.mo108206p3().contains(Long.valueOf(j)) && !this.f216284v.contains(Long.valueOf(j))) {
                if (lVar.mo108206p3().size() >= 99) {
                    Log.m105924i("MicroMsg.recordSelect.RecordSelectComponent", "handleFirstItemToggle max select msg num.");
                    return;
                }
                lVar.mo108183N0(j);
                if (!z) {
                    if (!this.f216280r) {
                        this.f216270e.mo97683b(mo102694a6(lVar));
                    }
                    mo102692Y5(true);
                }
            }
        } else if (lVar.mo108206p3().contains(Long.valueOf(j))) {
            lVar.mo108183N0(j);
            if (!z) {
                if (!this.f216280r) {
                    this.f216270e.mo97683b(mo102694a6(lVar));
                }
                mo102692Y5(false);
            }
        }
    }

    /* renamed from: c6 */
    public final Pair<Boolean, Boolean> mo102696c6(C79368l lVar, long j) {
        if (lVar == null) {
            Log.m105920e("MicroMsg.recordSelect.RecordSelectComponent", "ifExceedBaseLine adapterComponent is null");
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        } else if (this.f216270e.getHeight() <= 0) {
            Log.m105920e("MicroMsg.recordSelect.RecordSelectComponent", "ifExceedBaseLine recordSelectTipsBar height <= 0");
            Boolean bool2 = Boolean.FALSE;
            return new Pair<>(bool2, bool2);
        } else {
            View v = lVar.mo108212v(j);
            if (v != null) {
                if (this.f216274i <= 0) {
                    int[] iArr = new int[2];
                    this.f216270e.getLocationOnScreen(iArr);
                    this.f216274i = iArr[1] + this.f216270e.getHeight();
                    this.f216275j = C76577a.m92155f(this.f215752d.mo91565f(), C0966R.dimen.f3753d4);
                    this.f216276n = C76577a.m92151b(this.f215752d.mo91565f(), 24);
                    Log.m105919d("MicroMsg.recordSelect.RecordSelectComponent", "ifExceedBaseLine(%s, %s) recordSelectTipsBarBottomLoctaion:%s", Integer.valueOf(iArr[1]), Integer.valueOf(this.f216270e.getHeight()), Integer.valueOf(this.f216274i));
                } else {
                    int[] iArr2 = new int[2];
                    this.f216270e.getLocationOnScreen(iArr2);
                    Log.m105919d("MicroMsg.recordSelect.RecordSelectComponent", "ifExceedBaseLine2(%s, %s)", Integer.valueOf(iArr2[1]), Integer.valueOf(this.f216270e.getHeight()));
                }
                CheckBox checkBox = (CheckBox) v.findViewById(C0966R.C0970id.b46);
                if (checkBox == null) {
                    Log.m105920e("MicroMsg.recordSelect.RecordSelectComponent", "ifExceedBaseLine, checkBox is null??");
                    Boolean bool3 = Boolean.FALSE;
                    return new Pair<>(bool3, bool3);
                }
                int[] iArr3 = new int[2];
                checkBox.getLocationOnScreen(iArr3);
                int i = iArr3[1];
                int i2 = (this.f216276n + i) - this.f216274i;
                Log.m105919d("MicroMsg.recordSelect.RecordSelectComponent", "view(%s, %s) recordSelectTipsBar(%s) viewTopHeight:%s marginTop:%s", Integer.valueOf(i), Integer.valueOf(this.f216276n), Integer.valueOf(this.f216274i), Integer.valueOf(this.f216275j), Integer.valueOf(i2));
                if (i2 <= this.f216275j) {
                    return new Pair<>(Boolean.TRUE, Boolean.FALSE);
                }
                Boolean bool4 = Boolean.TRUE;
                return new Pair<>(bool4, bool4);
            }
            Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "ifExceedBaseLine view is null, msgId:%s", Long.valueOf(j));
            Boolean bool5 = Boolean.FALSE;
            return new Pair<>(bool5, bool5);
        }
    }

    /* renamed from: e */
    public void mo70065e() {
        this.f216272g = this.f215752d.f193286j.getBooleanExtra("key_record_msg_select", false).booleanValue();
        this.f216280r = this.f215752d.f193286j.getBooleanExtra("key_record_msg_select_introduce", true).booleanValue();
        this.f216277o = this.f215752d.f193286j.getLongExtra("key_record_select_min_msg_id", -1);
        this.f216278p = this.f215752d.f193286j.getIntExtra("key_record_select_msg_num", 0);
        ArrayList<String> stringArrayList = this.f215752d.f193286j.getStringArrayList("key_record_select_msg_black_list");
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                this.f216284v.add(Long.valueOf(Util.getLong(it.next(), 0)));
            }
        }
        Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "isRecordSelect:%s showIntroduceView:%s lastSelectMinMsgId:%s lastSelectMsgNum:%s cancelSelectMsgSet:%s", Boolean.valueOf(this.f216272g), Boolean.valueOf(this.f216280r), Long.valueOf(this.f216277o), Integer.valueOf(this.f216278p), Integer.valueOf(this.f216284v.size()));
    }

    /* renamed from: e0 */
    public boolean mo22498e0() {
        return false;
    }

    /* renamed from: g0 */
    public void mo22499g0(Bundle bundle) {
        Object[] objArr = new Object[1];
        objArr[0] = bundle != null ? bundle.toString() : "null";
        Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "doOnlySelectRecordMsg %s", objArr);
        this.f216273h = false;
        this.f215752d.mo91563d();
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        if (this.f216272g) {
            C98544e.m128035f().mo137899c();
            this.f216270e.post(new C73659a());
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        if (this.f216272g) {
            this.f215752d.mo91570k().setOnScrollListener((AbsListView.OnScrollListener) null);
            this.f216273h = true;
            this.f216272g = false;
            this.f216281s = false;
            this.f216282t = false;
        }
    }

    /* renamed from: m6 */
    public void mo22500m6(C77632o.C77633a aVar) {
        Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "failDoJob %s", aVar);
    }

    /* renamed from: q0 */
    public boolean mo102697q0() {
        return this.f216273h;
    }

    /* renamed from: q2 */
    public boolean mo102698q2() {
        return this.f216272g;
    }

    /* renamed from: r7 */
    public void mo22502r7(C77632o.C77633a aVar) {
        Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "requestExitSelectedMode %s", aVar);
    }

    /* renamed from: s0 */
    public boolean mo22503s0() {
        return false;
    }

    /* renamed from: x0 */
    public CopyOnWriteArraySet<Long> mo102699x0() {
        return this.f216284v;
    }

    /* renamed from: z1 */
    public void mo22504z1(C77632o.C77633a aVar) {
        Log.m105925i("MicroMsg.recordSelect.RecordSelectComponent", "doInBackground %s", aVar);
    }
}
