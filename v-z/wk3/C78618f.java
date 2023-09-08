package wk3;

import android.os.Bundle;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import hk3.C76227e;
import vk3.C37747i;
import vk3.C78430l;
import zj3.C79343c0;
import zj3.C79368l;

/* renamed from: wk3.f */
public class C78618f extends C78606a {

    /* renamed from: j */
    public volatile long f230281j = 0;

    /* renamed from: k */
    public volatile long f230282k = 0;

    /* renamed from: l */
    public volatile long f230283l = 0;

    /* renamed from: m */
    public String f230284m;

    /* renamed from: n */
    public boolean f230285n;

    public C78618f(C67391b bVar, C76227e eVar) {
        super(bVar, eVar);
        String r = this.f230239b.mo91577r();
        this.f230284m = r;
        Log.m105925i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[ChattingSearchDataPresenter] talker:%s", r);
    }

    /* renamed from: a */
    public void mo106480a(MMChattingListView mMChattingListView, C76227e.C76230d<C72963f4> dVar) {
        Class cls = C79343c0.class;
        super.mo106480a(mMChattingListView, dVar);
        C76227e.C76228a aVar = dVar.f223308b;
        int i = dVar.f223313g;
        boolean z = false;
        mMChattingListView.getListView().setTranscriptMode(0);
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            mMChattingListView.mo101741d(false);
            C72924q1.m85521b(mMChattingListView.getListView(), (mMChattingListView.getCurCount() - mMChattingListView.getPreCount()) + 1, ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x() + mMChattingListView.getTopHeight(), false, false);
            int curCount = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            if (curCount > 0) {
                ((C79368l) this.f230239b.f193278b.mo102812a(C79368l.class)).mo108201i0(curCount);
            }
        } else if (ordinal == 1) {
            mMChattingListView.mo101739c(false);
            C72924q1.m85521b(mMChattingListView.getListView(), mMChattingListView.getPreCount() + 1, (mMChattingListView.getListView().getHeight() - ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x()) - mMChattingListView.getBottomHeight(), false, false);
        } else if ((ordinal == 3 || ordinal == 4) && i >= 0) {
            boolean booleanValue = this.f230239b.f193286j.getBooleanExtra("need_hight_item", false).booleanValue();
            int intExtra = this.f230239b.f193286j.getIntExtra("SELECTION_TOP_OFFSET", 0);
            mo108595e(i, false, intExtra, false);
            if (booleanValue) {
                mo108593c(mMChattingListView, i, this.f230239b.f193286j.getLongExtra("msg_local_id", -1), false, intExtra, false);
            }
        }
        if (this.f230239b.mo91569j() == dVar.f223310d - 1) {
            mMChattingListView.getListView().setTranscriptMode(1);
        }
        mMChattingListView.setBottomViewVisible(true);
        long yu02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).yu0(this.f230284m);
        Log.m105925i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[isShowTopAll] firstMsgCreateTime:%s lastTopMsgCreateTime:%s", Long.valueOf(yu02), Long.valueOf(this.f230281j));
        mMChattingListView.setIsTopShowAll(this.f230281j <= yu02);
        if (this.f230282k >= this.f230283l) {
            z = true;
        }
        mMChattingListView.setIsBottomShowAll(z);
    }

    /* renamed from: b */
    public C78430l mo108592b(C76227e.C76228a aVar, Bundle bundle, C76227e.C76230d dVar) {
        int i;
        int i2;
        int i3;
        Bundle bundle2 = bundle;
        Class cls = C75700k0.class;
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                long Jt0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Jt0(this.f230284m, this.f230282k, 48);
                int max = Math.max(0, ((C72972g4) C97625j3.m125812b().mo105911z()).X90(this.f230284m, this.f230282k, Jt0) - 1);
                this.f230282k = Jt0;
                i2 = max;
            } else if (ordinal != 2) {
                if (ordinal == 3 || ordinal == 4) {
                    if (bundle2 == null) {
                        Log.m105928w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "[handleEnter] sourceArgs is null!");
                    } else {
                        long j = bundle2.getLong("MSG_ID");
                        this.f230285n = bundle2.getBoolean("IS_LOAD_ALL", false);
                        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
                        if (b002.getMsgId() != j) {
                            Log.m105929w("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "get msg info by id %d error", Long.valueOf(j));
                        } else {
                            long createTime = b002.getCreateTime();
                            if (createTime < this.f230281j || createTime > this.f230282k) {
                                this.f230281j = createTime;
                                this.f230283l = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Dx0(this.f230284m);
                                if (this.f230285n) {
                                    this.f230282k = this.f230283l;
                                } else {
                                    this.f230282k = ((C72972g4) C97625j3.m125812b().mo105911z()).Jt0(this.f230284m, createTime, 48);
                                }
                                C75875l z = C97625j3.m125812b().mo105911z();
                                int X90 = ((C72972g4) z).X90(this.f230284m, this.f230281j, this.f230282k);
                                Log.m105927v("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "reset position, reload count %d", Integer.valueOf(X90));
                                if (X90 < 48) {
                                    Log.m105919d("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "reload count less than on scene, bottom not more data, try up to load more data, and reset selection, old top msg create time %d, old selection %d", Long.valueOf(this.f230281j), 0);
                                    this.f230281j = ((C72972g4) C97625j3.m125812b().mo105911z()).ky0(this.f230284m, this.f230281j, 48);
                                    i3 = ((C72972g4) C97625j3.m125812b().mo105911z()).X90(this.f230284m, this.f230281j, createTime);
                                } else {
                                    i3 = 0;
                                }
                            } else {
                                i3 = ((C72972g4) C97625j3.m125812b().mo105911z()).X90(this.f230284m, this.f230281j, createTime);
                            }
                            dVar.f223313g = i3;
                        }
                    }
                }
                i2 = 0;
            } else {
                C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(this.f230284m);
                this.f230283l = Ex0.getCreateTime();
                i2 = Math.max(0, ((C72972g4) C97625j3.m125812b().mo105911z()).X90(this.f230284m, this.f230282k, this.f230283l) - 1);
                if (this.f230285n || i2 <= 480) {
                    this.f230282k = this.f230283l;
                } else if (Ex0.mo108769t2() == 1 && this.f230283l != Ex0.getCreateTime()) {
                    this.f230283l = Ex0.getCreateTime();
                    this.f230281j = ((C72972g4) C97625j3.m125812b().mo105911z()).ky0(this.f230284m, this.f230281j, 48);
                    this.f230282k = this.f230283l;
                }
            }
            i = 0;
        } else {
            long ky02 = ((C72972g4) C97625j3.m125812b().mo105911z()).ky0(this.f230284m, this.f230281j, 48);
            C75875l z2 = C97625j3.m125812b().mo105911z();
            i = Math.max(0, ((C72972g4) z2).X90(this.f230284m, ky02, this.f230281j) - 1);
            this.f230281j = ky02;
            i2 = 0;
        }
        Log.m105925i("MicroMsg.ChattingLoader.ChattingSearchDataPresenter", "mode[%s] query topCreateTime[%d] downCreateTime[%d], lastCreateTime[%d], topInc[%d], bottomInc[%d]", aVar, Long.valueOf(this.f230281j), Long.valueOf(this.f230282k), Long.valueOf(this.f230283l), Integer.valueOf(i), Integer.valueOf(i2));
        return new C37747i(this.f230240c, this.f230281j, this.f230282k);
    }
}
