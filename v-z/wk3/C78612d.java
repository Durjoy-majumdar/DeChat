package wk3;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72988o1;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75871e;
import hk3.C76227e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import vk3.C78429g;
import vk3.C78430l;
import zj3.C79343c0;
import zj3.C79346d0;
import zj3.C79368l;

/* renamed from: wk3.d */
public class C78612d extends C78606a {

    /* renamed from: j */
    public boolean f230263j = false;

    /* renamed from: k */
    public boolean f230264k = false;

    /* renamed from: wk3.d$b */
    public class C78614b implements Runnable {

        /* renamed from: d */
        public View f230265d;

        /* renamed from: e */
        public long f230266e;

        /* renamed from: f */
        public long f230267f;

        /* renamed from: g */
        public String f230268g;

        /* renamed from: h */
        public WeakReference<MMChattingListView> f230269h;

        /* renamed from: wk3.d$b$a */
        public class C78615a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f230270d;

            /* renamed from: e */
            public final /* synthetic */ boolean f230271e;

            public C78615a(boolean z, boolean z2) {
                this.f230270d = z;
                this.f230271e = z2;
            }

            public void run() {
                MMChattingListView mMChattingListView = C78614b.this.f230269h.get();
                if (mMChattingListView != null) {
                    mMChattingListView.getListView().setTranscriptMode(1);
                    mMChattingListView.setIsTopShowAll(this.f230270d);
                    mMChattingListView.setIsBottomShowAll(this.f230271e);
                }
            }
        }

        public C78614b(C78612d dVar, MMChattingListView mMChattingListView, String str, long j, long j2, C78613a aVar) {
            this.f230265d = mMChattingListView;
            this.f230268g = str;
            this.f230269h = new WeakReference<>(mMChattingListView);
            this.f230266e = j2;
            this.f230267f = j;
        }

        public void run() {
            Class cls = C75700k0.class;
            C75871e cU = ((C75700k0) C86709a0.m107533q(cls)).mo96101cU();
            int X90 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).X90(this.f230268g, 0, this.f230267f - 1);
            int A = X90 <= 0 ? cU.mo101199A(this.f230268g, 0, this.f230267f - 1) : 0;
            boolean z = X90 <= 0 && A <= 0;
            int X902 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).X90(this.f230268g, this.f230266e + 1, MAlarmHandler.NEXT_FIRE_INTERVAL);
            int A2 = X902 <= 0 ? cU.mo101199A(this.f230268g, this.f230266e + 1, MAlarmHandler.NEXT_FIRE_INTERVAL) : 0;
            boolean z2 = X902 <= 0 && A2 <= 0;
            if (z2) {
                C72988o1 v = cU.mo101216v(this.f230268g);
                z2 = v.field_lastLocalSeq == v.field_lastPushSeq;
            }
            Log.m105925i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[CheckEdgeTask#run] isShowTopAll:%s topCount:%s topBlockCount:%s isShowBottomAll:%s bottomCount:%s bottomBlockCount:%s", Boolean.valueOf(z), Integer.valueOf(X90), Integer.valueOf(A), Boolean.valueOf(z2), Integer.valueOf(X902), Integer.valueOf(A2));
            this.f230265d.postDelayed(new C78615a(z, z2), 60);
        }
    }

    public C78612d(C67391b bVar, C76227e eVar) {
        super(bVar, eVar);
    }

    /* renamed from: a */
    public void mo106480a(MMChattingListView mMChattingListView, C76227e.C76230d<C72963f4> dVar) {
        MMChattingListView mMChattingListView2 = mMChattingListView;
        C76227e.C76230d<C72963f4> dVar2 = dVar;
        Class cls = C79343c0.class;
        Class cls2 = C79368l.class;
        int size = ((LinkedList) dVar2.f223309c).size();
        int i = dVar2.f223312f;
        int i2 = dVar2.f223313g;
        SparseArray<T> sparseArray = dVar2.f223311e;
        C76227e.C76228a aVar = dVar2.f223308b;
        C72963f4 f4Var = (C72963f4) sparseArray.get(0);
        C72963f4 f4Var2 = (C72963f4) sparseArray.get(sparseArray.size() - 1);
        super.mo106480a(mMChattingListView, dVar);
        if (dVar2.f223308b != C76227e.C76228a.ACTION_UPDATE) {
            mMChattingListView.getListView().setTranscriptMode(0);
        }
        if (sparseArray.size() <= 6 && i > 6) {
            Log.m105921e("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[onViewUpdate] may be err! talker:%s", this.f230239b.mo91577r());
        }
        int ordinal = dVar2.f223308b.ordinal();
        int i3 = i2;
        SparseArray<T> sparseArray2 = sparseArray;
        if (ordinal == 0) {
            mMChattingListView2.mo101741d(false);
            int curCount = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            C67391b bVar = this.f230239b;
            bVar.mo91550K(curCount + 1, ((C79343c0) bVar.f193278b.mo102812a(cls)).mo102630x() + mMChattingListView.getTopHeight(), false, false);
            int curCount2 = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "select:" + curCount + " curCount:" + mMChattingListView.getCurCount() + " preCount:" + mMChattingListView.getPreCount());
            if (curCount2 > 0) {
                ((C79368l) this.f230239b.f193278b.mo102812a(cls2)).mo108201i0(curCount2);
            }
        } else if (ordinal == 1) {
            Bundle bundle = dVar2.f223307a;
            if (bundle == null || !bundle.getBoolean("load_bottom", false)) {
                int preCount = mMChattingListView.getPreCount() + 1;
                int height = (mMChattingListView.getListView().getHeight() - ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x()) - mMChattingListView.getBottomHeight();
                this.f230239b.mo91550K(preCount, height, false, false);
                Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "selection:" + preCount + " offset:" + height + " curCount:" + mMChattingListView.getCurCount() + " preCount:" + mMChattingListView.getPreCount());
            } else {
                mMChattingListView.getListView().setTranscriptMode(1);
                this.f230239b.mo91541B(true);
                ((C79346d0) this.f230239b.f193278b.mo102812a(C79346d0.class)).mo102655v5();
                Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "after enter load bottom!");
            }
            mMChattingListView2.mo101739c(false);
        } else if (ordinal == 2) {
            Bundle bundle2 = dVar2.f223307a;
            if (bundle2 != null && bundle2.getBoolean("need_scroll_to_bottom", false)) {
                mMChattingListView2.mo101739c(false);
                this.f230239b.mo91541B(true);
                this.f230263j = false;
            }
            this.f230264k = false;
        } else if (ordinal == 3) {
            mMChattingListView2.mo101739c(false);
            this.f230239b.mo91543D(true);
        } else if (ordinal == 4) {
            Bundle bundle3 = dVar2.f223307a;
            if (bundle3 != null && bundle3.getInt("SCENE") == 1) {
                mo108595e(dVar2.f223313g, false, 0, false);
                Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "isFromSearch! selection:" + dVar2.f223313g);
            } else if (dVar2.f223307a != null) {
                mMChattingListView2.mo102933j(false, (Bundle) null);
                long j = dVar2.f223307a.getLong("MSG_ID", 0);
                int size2 = sparseArray2.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        size2 = 0;
                        break;
                    }
                    SparseArray<T> sparseArray3 = sparseArray2;
                    C72963f4 f4Var3 = (C72963f4) sparseArray3.get(size2);
                    if (f4Var3 != null && f4Var3.getMsgId() == j) {
                        break;
                    }
                    size2--;
                    sparseArray2 = sparseArray3;
                }
                int max = Math.max(0, size2);
                dVar2.f223313g = max;
                ((C79368l) this.f230239b.f193278b.mo102812a(cls2)).mo108185T3(dVar2.f223313g);
                C67391b bVar2 = this.f230239b;
                int i4 = dVar2.f223313g;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i4));
                C67391b bVar3 = bVar2;
                C117292a.m165358d(bVar3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/source/presenter/ChattingGetDataPresenter", "onViewUpdate", "(Lcom/tencent/mm/ui/chatting/view/MMChattingListView;Lcom/tencent/mm/ui/chatting/loader/IDataLoader$LoadedResult;)V", "Undefined", "scrollToPosition", "(I)V");
                bVar2.mo91544E(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(bVar3, "com/tencent/mm/ui/chatting/source/presenter/ChattingGetDataPresenter", "onViewUpdate", "(Lcom/tencent/mm/ui/chatting/view/MMChattingListView;Lcom/tencent/mm/ui/chatting/loader/IDataLoader$LoadedResult;)V", "Undefined", "scrollToPosition", "(I)V");
                Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "pos:" + max + " msgId:" + j);
            }
        }
        mMChattingListView2.setIsTopShowAll(true);
        mMChattingListView2.setIsBottomShowAll(true);
        long createTime = f4Var != null ? f4Var.getCreateTime() : 0;
        long createTime2 = f4Var2 != null ? f4Var2.getCreateTime() : 0;
        Log.m105925i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[onViewUpdate] talker:%s action:%s loadedCount:%s allCount:%s selection:%s lastTopCreateTime:%s lastBottomCreateTime:%s", this.f230239b.mo91577r(), aVar, Integer.valueOf(size), Integer.valueOf(i), Integer.valueOf(i3), Long.valueOf(createTime), Long.valueOf(createTime2));
        C86709a0.m107525e().postToWorker(new C78614b(this, mMChattingListView, this.f230239b.mo91577r(), createTime, createTime2, (C78613a) null));
    }

    /* renamed from: b */
    public C78430l mo108592b(C76227e.C76228a aVar, Bundle bundle, C76227e.C76230d dVar) {
        Bundle bundle2 = bundle;
        return new C78429g(this.f230239b.mo91577r(), aVar, bundle, this.f230244g, this.f230242e, this.f230243f, this.f230241d, dVar, bundle2 != null && bundle2.getInt("SCENE") == 1);
    }

    /* renamed from: d */
    public void mo108594d(C76227e.C76228a aVar, boolean z, Bundle bundle) {
        boolean z2 = true;
        if (aVar == C76227e.C76228a.ACTION_UPDATE) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (this.f230263j) {
                Log.m105928w("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[onLoad] has tongue position before");
                bundle.putBoolean("has_position_tongue", true);
            } else if (this.f230264k) {
                bundle.putBoolean("has_position_search", true);
            }
        } else if (aVar == C76227e.C76228a.ACTION_POSITION) {
            this.f230263j = bundle != null && bundle.getInt("SCENE") == 2;
            if (bundle == null || bundle.getInt("SCENE") != 1) {
                z2 = false;
            }
            this.f230264k = z2;
            Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataPresenter", "[onLoad] has tongue position!");
        }
        super.mo108594d(aVar, z, bundle);
    }
}
