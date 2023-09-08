package wk3;

import android.os.Bundle;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import hk3.C76231f;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import zj3.C79368l;

/* renamed from: wk3.e */
public class C78616e extends C78606a {

    /* renamed from: j */
    public int f230273j = 0;

    /* renamed from: k */
    public volatile long f230274k = 0;

    /* renamed from: l */
    public volatile long f230275l = 0;

    /* renamed from: m */
    public volatile long f230276m = 0;

    /* renamed from: wk3.e$a */
    public class C78617a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f230277d;

        /* renamed from: e */
        public final /* synthetic */ int f230278e;

        /* renamed from: f */
        public final /* synthetic */ MMChattingListView f230279f;

        public C78617a(Bundle bundle, int i, MMChattingListView mMChattingListView) {
            this.f230277d = bundle;
            this.f230278e = i;
            this.f230279f = mMChattingListView;
        }

        public void run() {
            int i;
            C79368l lVar = (C79368l) C78616e.this.f230239b.f193278b.mo102812a(C79368l.class);
            Bundle bundle = this.f230277d;
            if (bundle == null || bundle.getInt("SCENE", 0) != 1) {
                Bundle bundle2 = this.f230277d;
                if (bundle2 != null && bundle2.getInt("SCENE", 0) == 2) {
                    lVar.mo108185T3(this.f230278e);
                    C67391b bVar = C78616e.this.f230239b;
                    int i2 = this.f230278e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i2));
                    C67391b bVar2 = bVar;
                    C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/source/presenter/ChattingNormalDataPresenter$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    bVar.mo91544E(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/source/presenter/ChattingNormalDataPresenter$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    return;
                }
                return;
            }
            boolean z = this.f230277d.getBoolean("IS_HIGHLIGHT_ITEM", false);
            boolean z2 = this.f230277d.getBoolean("IS_IDLE_VISBLE", false);
            int i3 = this.f230277d.getInt("SELECTION_TOP_OFFSET", 0);
            boolean z3 = this.f230277d.getBoolean("IS_SMOOTH_SCROLL", false);
            C78616e eVar = C78616e.this;
            C67391b bVar3 = eVar.f230239b;
            int i4 = this.f230278e;
            bVar3.f193289m = i4;
            eVar.mo108595e(i4, z2, i3, z3);
            if (z && (i = this.f230278e) >= 0) {
                C78616e.this.mo108593c(this.f230279f, i, -1, z2, i3, z3);
            }
        }
    }

    public C78616e(C67391b bVar, C76231f fVar) {
        super(bVar, fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo106480a(com.tencent.p014mm.p136ui.chatting.view.MMChattingListView r25, hk3.C76227e.C76230d<com.tencent.p014mm.storage.C72963f4> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.Class<zj3.c0> r3 = zj3.C79343c0.class
            java.lang.Class<zj3.i> r4 = zj3.C79363i.class
            super.mo106480a(r25, r26)
            hk3.e$a r5 = r2.f223308b
            android.util.SparseArray<T> r6 = r2.f223311e
            java.util.List<T> r7 = r2.f223309c
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            int r7 = r7.size()
            int r8 = r2.f223312f
            int r9 = r2.f223313g
            android.os.Bundle r10 = r2.f223307a
            r11 = 0
            java.lang.Object r12 = r6.get(r11)
            com.tencent.mm.storage.f4 r12 = (com.tencent.p014mm.storage.C72963f4) r12
            int r13 = r6.size()
            r14 = 1
            int r13 = r13 - r14
            java.lang.Object r6 = r6.get(r13)
            com.tencent.mm.storage.f4 r6 = (com.tencent.p014mm.storage.C72963f4) r6
            if (r12 == 0) goto L_0x003a
            long r12 = r12.getCreateTime()
            r0.f230274k = r12
        L_0x003a:
            if (r6 == 0) goto L_0x0042
            long r12 = r6.getCreateTime()
            r0.f230275l = r12
        L_0x0042:
            int r6 = r5.ordinal()
            java.lang.String r12 = "MicroMsg.ChattingLoader.ChattingNormalDataPresenter"
            r16 = 2
            r13 = 3
            r15 = 4
            if (r6 == 0) goto L_0x00d2
            if (r6 == r14) goto L_0x00a2
            if (r6 == r13) goto L_0x0080
            if (r6 == r15) goto L_0x0056
            goto L_0x00ce
        L_0x0056:
            r3 = -1
            if (r10 != 0) goto L_0x005b
            r6 = -1
            goto L_0x0061
        L_0x005b:
            java.lang.String r6 = "MSG_POSITION"
            int r6 = r10.getInt(r6, r3)
        L_0x0061:
            if (r6 == r3) goto L_0x0072
            int r3 = r25.getCurCount()
            int r9 = r2.f223312f
            int r9 = r9 - r6
            int r3 = r3 - r9
            int r3 = java.lang.Math.max(r11, r3)
            r2.f223313g = r3
            r9 = r3
        L_0x0072:
            com.tencent.mm.pluginsdk.ui.tools.n0 r3 = r25.getListView()
            wk3.e$a r6 = new wk3.e$a
            r6.<init>(r10, r9, r1)
            r3.post(r6)
            goto L_0x0155
        L_0x0080:
            ck3.b r3 = r0.f230239b
            r3.mo91543D(r11)
            ck3.b r3 = r0.f230239b
            r3.getClass()
            java.lang.String r6 = "MicroMsg.ChattingContext"
            java.lang.String r10 = "[scrollToLastImmediatelyFix]"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r10)
            com.tencent.mm.ui.chatting.v3 r6 = r3.f193287k
            com.tencent.mm.ui.chatting.ChattingUIFragment r6 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r6
            com.tencent.mm.pluginsdk.ui.tools.n0 r6 = r6.f215304v
            ck3.a r10 = new ck3.a
            r10.<init>(r3)
            r13 = 100
            r6.postDelayed(r10, r13)
            goto L_0x00ce
        L_0x00a2:
            r1.mo101739c(r11)
            com.tencent.mm.pluginsdk.ui.tools.n0 r6 = r25.getListView()
            int r10 = r25.getPreCount()
            r13 = 1
            int r10 = r10 + r13
            com.tencent.mm.pluginsdk.ui.tools.n0 r13 = r25.getListView()
            int r13 = r13.getHeight()
            ck3.b r14 = r0.f230239b
            com.tencent.mm.ui.chatting.manager.a r14 = r14.f193278b
            xi.d r3 = r14.mo102812a(r3)
            zj3.c0 r3 = (zj3.C79343c0) r3
            int r3 = r3.mo102630x()
            int r13 = r13 - r3
            int r3 = r25.getBottomHeight()
            int r13 = r13 - r3
            com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1.m85521b(r6, r10, r13, r11, r11)
        L_0x00ce:
            r18 = r9
            goto L_0x0153
        L_0x00d2:
            r1.mo101741d(r11)
            int r6 = r25.getCurCount()
            int r10 = r25.getPreCount()
            int r13 = r6 - r10
            com.tencent.mm.pluginsdk.ui.tools.n0 r14 = r25.getListView()
            int r14 = r14.getHeaderViewsCount()
            int r13 = r13 + r14
            ck3.b r15 = r0.f230239b
            com.tencent.mm.ui.chatting.manager.a r15 = r15.f193278b
            xi.d r3 = r15.mo102812a(r3)
            zj3.c0 r3 = (zj3.C79343c0) r3
            int r3 = r3.mo102630x()
            int r15 = r25.getTopHeight()
            int r3 = r3 + r15
            com.tencent.mm.pluginsdk.ui.tools.n0 r15 = r25.getListView()
            com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1.m85521b(r15, r13, r3, r11, r11)
            int r15 = r25.getCurCount()
            int r17 = r25.getPreCount()
            int r15 = r15 - r17
            if (r15 <= 0) goto L_0x0120
            ck3.b r11 = r0.f230239b
            r18 = r9
            java.lang.Class<zj3.l> r9 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r11 = r11.f193278b
            xi.d r9 = r11.mo102812a(r9)
            zj3.l r9 = (zj3.C79368l) r9
            r9.mo108201i0(r15)
            goto L_0x0122
        L_0x0120:
            r18 = r9
        L_0x0122:
            r9 = 6
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r13 = 0
            r11[r13] = r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9 = 1
            r11[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r11[r16] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r6 = 3
            r11[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r6 = 4
            r11[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r6 = 5
            r11[r6] = r3
            java.lang.String r3 = "onViewUpdate() ACTION_TOP selectPosition:%s selectY:%s fixTimePosition:%s curCount:%s preCount:%s headerViewCount:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r3, r11)
        L_0x0153:
            r9 = r18
        L_0x0155:
            hk3.e$a r3 = hk3.C76227e.C76228a.ACTION_ENTER
            if (r5 == r3) goto L_0x0260
            r3 = 6
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r3 = 0
            r6[r3] = r5
            long r10 = r0.f230274k
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r10 = 1
            r6[r10] = r3
            long r10 = r0.f230275l
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r6[r16] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r10 = 3
            r6[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r10 = 4
            r6[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r9 = 5
            r6[r9] = r3
            java.lang.String r3 = "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r6)
            ck3.b r3 = r0.f230239b
            com.tencent.mm.ui.chatting.manager.a r3 = r3.f193278b
            xi.d r3 = r3.mo102812a(r4)
            zj3.i r3 = (zj3.C79363i) r3
            boolean r3 = r3.mo102362t0()
            if (r3 == 0) goto L_0x0255
            ck3.b r3 = r0.f230239b
            com.tencent.mm.ui.chatting.manager.a r3 = r3.f193278b
            xi.d r3 = r3.mo102812a(r4)
            zj3.i r3 = (zj3.C79363i) r3
            boolean r3 = r3.mo102350G0()
            if (r3 == 0) goto L_0x0207
            long r9 = r2.f223314h
            r13 = 0
            int r6 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x0207
            ck3.b r6 = r0.f230239b
            java.lang.String r6 = r6.mo91577r()
            eb0.c r11 = eb0.C97625j3.m125812b()
            g62.l r11 = r11.mo105911z()
            r20 = 0
            r18 = r11
            com.tencent.mm.storage.g4 r18 = (com.tencent.p014mm.storage.C72972g4) r18
            r19 = r6
            r22 = r9
            int r11 = r18.X90(r19, r20, r22)
            int r13 = r8 - r11
            if (r13 > r7) goto L_0x01d4
            r13 = 1
            goto L_0x01d5
        L_0x01d4:
            r13 = 0
        L_0x01d5:
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r14 = 0
            r15[r14] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r9 = 1
            r15[r9] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r15[r16] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r13)
            r9 = 3
            r15[r9] = r6
            java.lang.String r6 = "[isShowTopAll] talker:%s createTime:%s expiredCount:%s isShowTopAll:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r15)
            if (r13 == 0) goto L_0x0208
            if (r8 <= r7) goto L_0x0208
            ck3.b r6 = r0.f230239b
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r6 = r6.mo102812a(r4)
            zj3.i r6 = (zj3.C79363i) r6
            r9 = 1
            r6.mo102354K3(r9)
            goto L_0x0208
        L_0x0207:
            r13 = 0
        L_0x0208:
            ck3.b r6 = r0.f230239b
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r4 = r6.mo102812a(r4)
            zj3.i r4 = (zj3.C79363i) r4
            boolean r4 = r4.mo102351H()
            boolean r6 = r0.mo108601f(r7, r8)
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r5
            long r9 = r2.f223314h
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r5 = 1
            r7[r5] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r7[r16] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            r3 = 3
            r7[r3] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r3 = 4
            r7[r3] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r3 = 5
            r7[r3] = r2
            java.lang.String r2 = "[onViewUpdate] isBizHalfScreenChatStyle mode:%s,  queryCreateTime:%s, isHeaderUnShowed:%s, isTopShowAllFromCreateTime:%s, isHeaderShowing:%s, isTopShowAll:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r7)
            if (r6 != 0) goto L_0x0250
            if (r4 == 0) goto L_0x024e
            goto L_0x0250
        L_0x024e:
            r11 = 0
            goto L_0x0251
        L_0x0250:
            r11 = 1
        L_0x0251:
            r1.setIsTopShowAll(r11)
            goto L_0x025c
        L_0x0255:
            boolean r2 = r0.mo108601f(r7, r8)
            r1.setIsTopShowAll(r2)
        L_0x025c:
            r2 = 1
            r1.setIsBottomShowAll(r2)
        L_0x0260:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wk3.C78616e.mo106480a(com.tencent.mm.ui.chatting.view.MMChattingListView, hk3.e$d):void");
    }

    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r6v12, types: [vk3.h] */
    /* JADX WARNING: type inference failed for: r5v16, types: [vk3.i] */
    /* JADX WARNING: type inference failed for: r11v2, types: [vk3.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0074, code lost:
        if (r15 > r5) goto L_0x0078;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vk3.C78430l mo108592b(hk3.C76227e.C76228a r22, android.os.Bundle r23, hk3.C76227e.C76230d r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            java.lang.Class<zj3.i> r2 = zj3.C79363i.class
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            eb0.c r4 = eb0.C97625j3.m125812b()
            g62.l r4 = r4.mo105911z()
            java.lang.String r5 = r0.f230240c
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            int r4 = r4.Vx0(r5)
            k40.a r5 = f40.C86709a0.m107533q(r3)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.f r5 = r5.mo96093DX()
            java.lang.String r6 = r0.f230240c
            com.tencent.mm.storage.n2 r5 = (com.tencent.p014mm.storage.C72986n2) r5
            long r5 = r5.mo101184jo(r6)
            ck3.b r7 = r0.f230239b
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r7 = r7.mo102812a(r2)
            zj3.i r7 = (zj3.C79363i) r7
            boolean r7 = r7.mo102362t0()
            r8 = 3
            r9 = 1
            java.lang.String r10 = "MicroMsg.ChattingLoader.ChattingNormalDataPresenter"
            r11 = 2
            r12 = 0
            if (r7 == 0) goto L_0x0077
            ck3.b r7 = r0.f230239b
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r2 = r7.mo102812a(r2)
            zj3.i r2 = (zj3.C79363i) r2
            long r13 = r2.mo102348C5()
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0077
            long r15 = eb0.C31543z5.m39453c()
            long r15 = r15 - r13
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Long r7 = java.lang.Long.valueOf(r15)
            r2[r12] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r2[r9] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r2[r11] = r7
            java.lang.String r7 = "[ChattingNormalDataSource] caseTime:%d, createTime:%d, createTimeLimit:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r7, r2)
            int r2 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r15 = r5
        L_0x0078:
            int r2 = r22.ordinal()
            r5 = 48
            r6 = 0
            if (r2 == 0) goto L_0x0213
            if (r2 == r11) goto L_0x01fd
            if (r2 == r8) goto L_0x01f0
            r7 = 4
            if (r2 == r7) goto L_0x008a
            goto L_0x0223
        L_0x008a:
            if (r1 != 0) goto L_0x0092
            java.lang.String r1 = "null == sourceArgs!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            return r6
        L_0x0092:
            java.lang.String r2 = "SCENE"
            int r7 = r1.getInt(r2, r12)
            if (r7 != r9) goto L_0x01bb
            java.lang.String r2 = "[handlePositionForSearch]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            ck3.b r2 = r0.f230239b
            java.lang.String r2 = r2.mo91577r()
            java.lang.String r6 = "MSG_ID"
            long r6 = r1.getLong(r6)
            java.lang.String r8 = "IS_LOAD_ALL"
            boolean r1 = r1.getBoolean(r8, r12)
            eb0.c r8 = eb0.C97625j3.m125812b()
            g62.l r8 = r8.mo105911z()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            com.tencent.mm.storage.f4 r8 = r8.b00(r6)
            long r13 = r8.getMsgId()
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x00e7
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r1[r12] = r2
            java.lang.String r2 = "get msg info by id %d error"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r1)
            vk3.i r1 = new vk3.i
            ck3.b r2 = r0.f230239b
            java.lang.String r12 = r2.mo91577r()
            long r13 = r0.f230274k
            long r2 = r0.f230275l
            r11 = r1
            r15 = r2
            r11.<init>(r12, r13, r15)
            goto L_0x01ee
        L_0x00e7:
            long r6 = r8.getCreateTime()
            long r13 = r0.f230274k
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x0111
            long r13 = r0.f230275l
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f8
            goto L_0x0111
        L_0x00f8:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r8 = r0.f230274k
            r13 = r1
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            r14 = r2
            r15 = r8
            r17 = r6
            int r1 = r13.X90(r14, r15, r17)
            r2 = r24
            goto L_0x01a8
        L_0x0111:
            r0.f230274k = r6
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            long r13 = r3.Dx0(r2)
            r0.f230276m = r13
            if (r1 == 0) goto L_0x012c
            long r13 = r0.f230276m
            r0.f230275l = r13
            goto L_0x013c
        L_0x012c:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            long r13 = r1.Jt0(r2, r6, r5)
            r0.f230275l = r13
        L_0x013c:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r14 = r0.f230274k
            r19 = r6
            long r5 = r0.f230275l
            r13 = r1
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            r7 = r14
            r14 = r2
            r15 = r7
            r17 = r5
            int r1 = r13.X90(r14, r15, r17)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r3[r12] = r5
            java.lang.String r5 = "reset position, reload count %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r5, r3)
            r3 = 48
            if (r1 >= r3) goto L_0x01a5
            java.lang.Object[] r1 = new java.lang.Object[r11]
            long r5 = r0.f230274k
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1[r12] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r1[r9] = r3
            java.lang.String r3 = "reload count less than on scene, bottom not more data, try up to load more data, and reset selection, old top msg create time %d, old selection %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r3, r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r5 = r0.f230274k
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r3 = 48
            long r5 = r1.ky0(r2, r5, r3)
            r0.f230274k = r5
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r5 = r0.f230274k
            r13 = r1
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            r14 = r2
            r15 = r5
            r17 = r19
            int r12 = r13.X90(r14, r15, r17)
        L_0x01a5:
            r2 = r24
            r1 = r12
        L_0x01a8:
            r2.f223313g = r1
            vk3.i r1 = new vk3.i
            ck3.b r2 = r0.f230239b
            java.lang.String r6 = r2.mo91577r()
            long r7 = r0.f230274k
            long r9 = r0.f230275l
            r5 = r1
            r5.<init>(r6, r7, r9)
            goto L_0x01ee
        L_0x01bb:
            int r2 = r1.getInt(r2, r12)
            if (r2 != r11) goto L_0x0223
            java.lang.String r2 = "MSG_POSITION"
            int r1 = r1.getInt(r2)
            int r2 = r4 - r1
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3[r12] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r3[r11] = r1
            java.lang.String r1 = "[handlePositionForTongue] totalCount:%s position:%s count:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r3)
            vk3.h r1 = new vk3.h
            java.lang.String r7 = r0.f230240c
            r10 = 0
            r6 = r1
            r8 = r2
            r9 = r4
            r6.<init>(r7, r8, r9, r10)
        L_0x01ee:
            r6 = r1
            goto L_0x0223
        L_0x01f0:
            vk3.h r1 = new vk3.h
            java.lang.String r7 = r0.f230240c
            r8 = 16
            r6 = r1
            r9 = r4
            r10 = r15
            r6.<init>(r7, r8, r9, r10)
            goto L_0x0223
        L_0x01fd:
            int r1 = r0.f230273j
            int r1 = r4 - r1
            vk3.h r2 = new vk3.h
            java.lang.String r7 = r0.f230240c
            int r3 = r0.f230241d
            if (r1 <= 0) goto L_0x020a
            r12 = r1
        L_0x020a:
            int r8 = r3 + r12
            r6 = r2
            r9 = r4
            r10 = r15
            r6.<init>(r7, r8, r9, r10)
            goto L_0x0223
        L_0x0213:
            vk3.h r1 = new vk3.h
            java.lang.String r7 = r0.f230240c
            int r2 = r0.f230241d
            r3 = 48
            int r8 = r2 + 48
            r6 = r1
            r9 = r4
            r10 = r15
            r6.<init>(r7, r8, r9, r10)
        L_0x0223:
            r0.f230273j = r4
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wk3.C78616e.mo108592b(hk3.e$a, android.os.Bundle, hk3.e$d):vk3.l");
    }

    /* renamed from: f */
    public final boolean mo108601f(int i, int i2) {
        String r = this.f230239b.mo91577r();
        long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(r);
        int X90 = ((C72972g4) C97625j3.m125812b().mo105911z()).X90(r, 0, jo);
        Log.m105925i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", r, Long.valueOf(jo), Integer.valueOf(X90));
        return i2 - X90 <= i;
    }
}
