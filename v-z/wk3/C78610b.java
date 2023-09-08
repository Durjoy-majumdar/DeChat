package wk3;

import android.os.Bundle;
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
import java.util.LinkedList;
import vk3.C78422a;
import vk3.C78430l;
import zj3.C79343c0;
import zj3.C79348e;
import zj3.C79368l;

/* renamed from: wk3.b */
public class C78610b extends C78606a {

    /* renamed from: j */
    public long f230261j;

    /* renamed from: k */
    public int f230262k;

    public C78610b(C67391b bVar, C76231f fVar) {
        super(bVar, fVar);
        this.f230261j = ((C79348e) bVar.f193278b.mo102812a(C79348e.class)).mo70068i4();
    }

    /* renamed from: a */
    public void mo106480a(MMChattingListView mMChattingListView, C76227e.C76230d<C72963f4> dVar) {
        MMChattingListView mMChattingListView2 = mMChattingListView;
        C76227e.C76230d<C72963f4> dVar2 = dVar;
        Class cls = C79343c0.class;
        super.mo106480a(mMChattingListView, dVar);
        C76227e.C76228a aVar = dVar2.f223308b;
        int size = ((LinkedList) dVar2.f223309c).size();
        int i = dVar2.f223312f;
        int ordinal = aVar.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            mMChattingListView2.mo101741d(false);
            C72924q1.m85521b(mMChattingListView.getListView(), (mMChattingListView.getCurCount() - mMChattingListView.getPreCount()) + 1, ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x() + mMChattingListView.getTopHeight(), false, false);
            int curCount = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            if (curCount > 0) {
                ((C79368l) this.f230239b.f193278b.mo102812a(C79368l.class)).mo108201i0(curCount);
            }
        } else if (ordinal == 1) {
            mMChattingListView2.mo101739c(false);
            C72924q1.m85521b(mMChattingListView.getListView(), mMChattingListView.getPreCount() + 1, mMChattingListView.getListView().getHeight() - ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x(), false, false);
        } else if (ordinal == 3) {
            this.f230239b.mo91543D(false);
        }
        Log.m105925i("MicroMsg.ChattingLoader.ChattingBizDataPresenter", "[onViewUpdate] result:%s", dVar.toString());
        String r = this.f230239b.mo91577r();
        long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(r);
        int X90 = ((C72972g4) C97625j3.m125812b().mo105911z()).X90(r, 0, jo);
        Log.m105925i("MicroMsg.ChattingLoader.ChattingBizDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", r, Long.valueOf(jo), Integer.valueOf(X90));
        if (i - X90 <= size) {
            z = true;
        }
        mMChattingListView2.setIsTopShowAll(z);
        mMChattingListView2.setIsBottomShowAll(true);
    }

    /* renamed from: b */
    public C78430l mo108592b(C76227e.C76228a aVar, Bundle bundle, C76227e.C76230d dVar) {
        C78422a aVar2;
        int h = C97625j3.m125812b().mo105897l().mo100924h(this.f230240c, this.f230261j);
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            aVar2 = new C78422a(this.f230240c, this.f230261j, this.f230241d + 48, h);
        } else if (ordinal != 2) {
            aVar2 = ordinal != 3 ? null : new C78422a(this.f230240c, this.f230261j, 48, h);
        } else {
            int i = h - this.f230262k;
            String str = this.f230240c;
            long j = this.f230261j;
            int i2 = this.f230241d;
            if (i <= 0) {
                i = 0;
            }
            aVar2 = new C78422a(str, j, i2 + i, h);
        }
        this.f230262k = h;
        return aVar2;
    }
}
