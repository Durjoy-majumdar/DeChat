package wk3;

import android.os.Bundle;
import android.util.SparseArray;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import hk3.C76227e;
import hk3.C76231f;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import vk3.C37748j;
import zj3.C79343c0;
import zj3.C79368l;
import zj3.C79375p;

/* renamed from: wk3.g */
public class C78619g extends C78606a {

    /* renamed from: j */
    public int f230286j = 0;

    /* renamed from: k */
    public volatile long f230287k = 0;

    /* renamed from: l */
    public volatile long f230288l = 0;

    /* renamed from: m */
    public volatile long f230289m = 0;

    /* renamed from: n */
    public C37748j.C37749a f230290n = new C78620a();

    /* renamed from: wk3.g$a */
    public class C78620a implements C37748j.C37749a {
        public C78620a() {
        }

        /* renamed from: a */
        public boolean mo108603a(C72963f4 f4Var, C72963f4 f4Var2) {
            Class cls = C79375p.class;
            C67391b bVar = C78619g.this.f230239b;
            if (bVar == null || bVar.f193278b.mo102812a(cls) == null) {
                return false;
            }
            return ((C79375p) C78619g.this.f230239b.f193278b.mo102812a(cls)).mo70123u0(f4Var, f4Var2, C78619g.this.f230240c);
        }
    }

    /* renamed from: wk3.g$b */
    public class C78621b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f230292d;

        /* renamed from: e */
        public final /* synthetic */ int f230293e;

        /* renamed from: f */
        public final /* synthetic */ MMChattingListView f230294f;

        public C78621b(Bundle bundle, int i, MMChattingListView mMChattingListView) {
            this.f230292d = bundle;
            this.f230293e = i;
            this.f230294f = mMChattingListView;
        }

        public void run() {
            C79368l lVar = (C79368l) C78619g.this.f230239b.f193278b.mo102812a(C79368l.class);
            Bundle bundle = this.f230292d;
            if (bundle == null || bundle.getInt("SCENE", 0) != 1) {
                Bundle bundle2 = this.f230292d;
                if (bundle2 != null && bundle2.getInt("SCENE", 0) == 2) {
                    lVar.mo108185T3(this.f230293e);
                    C67391b bVar = C78619g.this.f230239b;
                    int i = this.f230293e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    C67391b bVar2 = bVar;
                    C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/source/presenter/ChattingServiceNotifyDataPresenter$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    bVar.mo91544E(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/source/presenter/ChattingServiceNotifyDataPresenter$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    return;
                }
                return;
            }
            boolean z = this.f230292d.getBoolean("IS_IDLE_VISBLE", false);
            int i2 = this.f230292d.getInt("SELECTION_TOP_OFFSET", 0);
            boolean z2 = this.f230292d.getBoolean("IS_SMOOTH_SCROLL", false);
            C78619g gVar = C78619g.this;
            C67391b bVar3 = gVar.f230239b;
            int i3 = this.f230293e;
            bVar3.f193289m = i3;
            gVar.mo108595e(i3, z, i2, z2);
            if (this.f230293e >= 0 && C78619g.this.f230239b.f193286j.getBooleanExtra("need_hight_item", false).booleanValue()) {
                C78619g.this.mo108593c(this.f230294f, this.f230293e, C78619g.this.f230239b.f193286j.getLongExtra("msg_local_id", -1), false, i2, false);
            }
        }
    }

    public C78619g(C67391b bVar, C76231f fVar) {
        super(bVar, fVar);
    }

    /* renamed from: a */
    public void mo106480a(MMChattingListView mMChattingListView, C76227e.C76230d<C72963f4> dVar) {
        MMChattingListView mMChattingListView2 = mMChattingListView;
        C76227e.C76230d<C72963f4> dVar2 = dVar;
        Class cls = C79343c0.class;
        super.mo106480a(mMChattingListView, dVar);
        C76227e.C76228a aVar = dVar2.f223308b;
        SparseArray<T> sparseArray = dVar2.f223311e;
        int size = ((LinkedList) dVar2.f223309c).size();
        int i = dVar2.f223312f;
        int i2 = dVar2.f223313g;
        Bundle bundle = dVar2.f223307a;
        boolean z = false;
        C72963f4 f4Var = (C72963f4) sparseArray.get(0);
        C72963f4 f4Var2 = (C72963f4) sparseArray.get(sparseArray.size() - 1);
        if (f4Var != null) {
            this.f230287k = f4Var.getCreateTime();
        }
        if (f4Var2 != null) {
            this.f230288l = f4Var2.getCreateTime();
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            mMChattingListView2.mo101741d(false);
            C72924q1.m85521b(mMChattingListView.getListView(), (mMChattingListView.getCurCount() - mMChattingListView.getPreCount()) + 1, ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x() + mMChattingListView.getTopHeight(), false, false);
            int curCount = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            if (curCount > 0) {
                ((C79368l) this.f230239b.f193278b.mo102812a(C79368l.class)).mo108201i0(curCount);
            }
        } else if (ordinal == 1) {
            mMChattingListView2.mo101739c(false);
            C72924q1.m85521b(mMChattingListView.getListView(), mMChattingListView.getPreCount() + 1, (mMChattingListView.getListView().getHeight() - ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x()) - mMChattingListView.getBottomHeight(), false, false);
        } else if (ordinal == 3) {
            this.f230239b.mo91543D(false);
        } else if (ordinal == 4) {
            int i3 = bundle == null ? -1 : bundle.getInt("MSG_POSITION", -1);
            if (i3 != -1) {
                int max = Math.max(0, mMChattingListView.getCurCount() - (dVar2.f223312f - i3));
                dVar2.f223313g = max;
                i2 = max;
            }
            mMChattingListView.getListView().post(new C78621b(bundle, i2, mMChattingListView2));
        }
        if (aVar != C76227e.C76228a.ACTION_ENTER) {
            Log.m105925i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", aVar, Long.valueOf(this.f230287k), Long.valueOf(this.f230288l), Integer.valueOf(size), Integer.valueOf(i), Integer.valueOf(i2));
            String r = this.f230239b.mo91577r();
            long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(r);
            int X90 = ((C72972g4) C97625j3.m125812b().mo105911z()).X90(r, 0, jo);
            Log.m105925i("MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", r, Long.valueOf(jo), Integer.valueOf(X90));
            if (i - X90 <= size) {
                z = true;
            }
            mMChattingListView2.setIsTopShowAll(z);
            mMChattingListView2.setIsBottomShowAll(true);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r4v11, types: [vk3.j] */
    /* JADX WARNING: type inference failed for: r4v12, types: [vk3.j] */
    /* JADX WARNING: type inference failed for: r4v13, types: [vk3.j] */
    /* JADX WARNING: type inference failed for: r12v17, types: [vk3.i] */
    /* JADX WARNING: type inference failed for: r12v18, types: [vk3.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vk3.C78430l mo108592b(hk3.C76227e.C76228a r19, android.os.Bundle r20, hk3.C76227e.C76230d r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            java.lang.String r3 = r0.f230240c
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            int r2 = r2.Vx0(r3)
            int r3 = r19.ordinal()
            r4 = 48
            r5 = 0
            if (r3 == 0) goto L_0x01ad
            r6 = 2
            r7 = 0
            if (r3 == r6) goto L_0x0193
            r8 = 3
            if (r3 == r8) goto L_0x0182
            r9 = 4
            if (r3 == r9) goto L_0x0029
            goto L_0x01bf
        L_0x0029:
            java.lang.String r3 = "MicroMsg.ChattingLoader.ChattingServiceNotifyDataPresenter"
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "null == sourceArgs!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r1)
            return r5
        L_0x0033:
            java.lang.String r9 = "SCENE"
            int r10 = r1.getInt(r9, r7)
            r11 = 1
            if (r10 != r11) goto L_0x014a
            java.lang.String r5 = "[handlePositionForSearch]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            java.lang.String r5 = r0.f230240c
            java.lang.String r8 = "MSG_ID"
            long r8 = r1.getLong(r8)
            java.lang.String r10 = "IS_LOAD_ALL"
            boolean r1 = r1.getBoolean(r10, r7)
            eb0.c r10 = eb0.C97625j3.m125812b()
            g62.l r10 = r10.mo105911z()
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
            com.tencent.mm.storage.f4 r10 = r10.b00(r8)
            long r12 = r10.getMsgId()
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x0081
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r1[r7] = r4
            java.lang.String r4 = "get msg info by id %d error"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r4, r1)
            vk3.i r1 = new vk3.i
            long r14 = r0.f230287k
            long r3 = r0.f230288l
            r12 = r1
            r13 = r5
            r16 = r3
            r12.<init>(r13, r14, r16)
            goto L_0x0191
        L_0x0081:
            long r8 = r10.getCreateTime()
            long r12 = r0.f230287k
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x00aa
            long r12 = r0.f230288l
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0092
            goto L_0x00aa
        L_0x0092:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r14 = r0.f230287k
            r12 = r1
            com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
            r13 = r5
            r16 = r8
            int r1 = r12.X90(r13, r14, r16)
            r3 = r21
            goto L_0x013a
        L_0x00aa:
            r0.f230287k = r8
            java.lang.Class<f62.k0> r10 = f62.C75700k0.class
            k40.a r10 = f40.C86709a0.m107533q(r10)
            f62.k0 r10 = (f62.C75700k0) r10
            g62.l r10 = r10.mo96095LE()
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
            long r12 = r10.Dx0(r5)
            r0.f230289m = r12
            if (r1 == 0) goto L_0x00c7
            long r12 = r0.f230289m
            r0.f230288l = r12
            goto L_0x00d7
        L_0x00c7:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            long r12 = r1.Jt0(r5, r8, r4)
            r0.f230288l = r12
        L_0x00d7:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r14 = r0.f230287k
            long r12 = r0.f230288l
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r16 = r12
            r12 = r1
            r13 = r5
            int r1 = r12.X90(r13, r14, r16)
            java.lang.Object[] r10 = new java.lang.Object[r11]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r10[r7] = r12
            java.lang.String r12 = "reset position, reload count %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r12, r10)
            if (r1 >= r4) goto L_0x0137
            java.lang.Object[] r1 = new java.lang.Object[r6]
            long r12 = r0.f230287k
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r1[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r1[r11] = r6
            java.lang.String r6 = "reload count less than on scene, bottom not more data, try up to load more data, and reset selection, old top msg create time %d, old selection %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r6 = r0.f230287k
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            long r3 = r1.ky0(r5, r6, r4)
            r0.f230287k = r3
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r14 = r0.f230287k
            r12 = r1
            com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
            r13 = r5
            r16 = r8
            int r7 = r12.X90(r13, r14, r16)
        L_0x0137:
            r3 = r21
            r1 = r7
        L_0x013a:
            r3.f223313g = r1
            vk3.i r1 = new vk3.i
            long r14 = r0.f230287k
            long r3 = r0.f230288l
            r12 = r1
            r13 = r5
            r16 = r3
            r12.<init>(r13, r14, r16)
            goto L_0x0191
        L_0x014a:
            int r4 = r1.getInt(r9, r7)
            if (r4 != r6) goto L_0x01bf
            hk3.e$a r9 = hk3.C76227e.C76228a.ACTION_POSITION
            java.lang.String r4 = "MSG_POSITION"
            int r1 = r1.getInt(r4)
            int r10 = r2 - r1
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r7] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r4[r6] = r1
            java.lang.String r1 = "[handlePositionForTongue] totalCount:%s position:%s count:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r4)
            vk3.j r1 = new vk3.j
            java.lang.String r5 = r0.f230240c
            vk3.j$a r3 = r0.f230290n
            r4 = r1
            r6 = r10
            r7 = r2
            r8 = r9
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0191
        L_0x0182:
            vk3.j r1 = new vk3.j
            java.lang.String r5 = r0.f230240c
            r6 = 16
            vk3.j$a r9 = r0.f230290n
            r4 = r1
            r7 = r2
            r8 = r19
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0191:
            r5 = r1
            goto L_0x01bf
        L_0x0193:
            int r1 = r0.f230286j
            int r1 = r2 - r1
            vk3.j r3 = new vk3.j
            java.lang.String r5 = r0.f230240c
            int r4 = r0.f230241d
            if (r1 <= 0) goto L_0x01a0
            r7 = r1
        L_0x01a0:
            int r6 = r4 + r7
            vk3.j$a r9 = r0.f230290n
            r4 = r3
            r7 = r2
            r8 = r19
            r4.<init>(r5, r6, r7, r8, r9)
            r5 = r3
            goto L_0x01bf
        L_0x01ad:
            vk3.j r1 = new vk3.j
            java.lang.String r5 = r0.f230240c
            int r3 = r0.f230241d
            int r6 = r3 + 48
            vk3.j$a r9 = r0.f230290n
            r4 = r1
            r7 = r2
            r8 = r19
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0191
        L_0x01bf:
            r0.f230286j = r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wk3.C78619g.mo108592b(hk3.e$a, android.os.Bundle, hk3.e$d):vk3.l");
    }
}
