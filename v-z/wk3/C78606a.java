package wk3;

import android.os.Bundle;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import hk3.C76218a;
import hk3.C76224c;
import hk3.C76227e;
import hk3.C76231f;
import kg3.C76577a;
import uj3.C78190b;
import vk3.C78430l;
import zj3.C79368l;

/* renamed from: wk3.a */
public abstract class C78606a implements C76224c.C76225a {

    /* renamed from: a */
    public C76227e f230238a;

    /* renamed from: b */
    public C67391b f230239b;

    /* renamed from: c */
    public String f230240c;

    /* renamed from: d */
    public int f230241d;

    /* renamed from: e */
    public long f230242e;

    /* renamed from: f */
    public long f230243f;

    /* renamed from: g */
    public long f230244g;

    /* renamed from: h */
    public int f230245h = 3;

    /* renamed from: i */
    public Runnable f230246i;

    /* renamed from: wk3.a$a */
    public class C78607a implements C76227e.C76229c<C72963f4> {

        /* renamed from: a */
        public final /* synthetic */ Bundle f230247a;

        /* renamed from: b */
        public final /* synthetic */ C76227e.C76228a f230248b;

        public C78607a(Bundle bundle, C76227e.C76228a aVar) {
            this.f230247a = bundle;
            this.f230248b = aVar;
        }
    }

    /* renamed from: wk3.a$b */
    public class C78608b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f230250d;

        /* renamed from: e */
        public final /* synthetic */ int f230251e;

        /* renamed from: f */
        public final /* synthetic */ boolean f230252f;

        /* renamed from: g */
        public final /* synthetic */ boolean f230253g;

        public C78608b(int i, int i2, boolean z, boolean z2) {
            this.f230250d = i;
            this.f230251e = i2;
            this.f230252f = z;
            this.f230253g = z2;
        }

        public void run() {
            int g = C78606a.this.f230239b.mo91566g();
            int i = this.f230250d;
            if (g > i || i > C78606a.this.f230239b.mo91569j()) {
                Log.m105924i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[protectSetSelection] pos:" + this.f230250d + " reTryCount:" + C78606a.this.f230245h);
                C67391b bVar = C78606a.this.f230239b;
                if (!bVar.f193290n) {
                    bVar.mo91550K(this.f230250d, this.f230251e, this.f230252f, this.f230253g);
                } else {
                    bVar.mo91550K(this.f230250d, C76577a.m92151b(bVar.mo91565f(), 120), this.f230252f, this.f230253g);
                }
                C78606a aVar = C78606a.this;
                int i2 = aVar.f230245h - 1;
                aVar.f230245h = i2;
                if (i2 >= 0) {
                    aVar.f230239b.mo91570k().postDelayed(this, 20);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[protectSetSelection] successfully! pos:" + this.f230250d);
        }
    }

    /* renamed from: wk3.a$c */
    public class C78609c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f230255d;

        /* renamed from: e */
        public final /* synthetic */ boolean f230256e;

        /* renamed from: f */
        public final /* synthetic */ int f230257f;

        /* renamed from: g */
        public final /* synthetic */ boolean f230258g;

        /* renamed from: h */
        public final /* synthetic */ MMChattingListView f230259h;

        public C78609c(int i, boolean z, int i2, boolean z2, MMChattingListView mMChattingListView) {
            this.f230255d = i;
            this.f230256e = z;
            this.f230257f = i2;
            this.f230258g = z2;
            this.f230259h = mMChattingListView;
        }

        public void run() {
            C67391b bVar = C78606a.this.f230239b;
            int s = ((BaseChattingUIFragment) bVar.f193287k).mo102031Z().mo81305s(0, this.f230255d);
            C78606a.this.mo108595e(this.f230255d, this.f230256e, this.f230257f, this.f230258g);
            this.f230259h.setHighLightChildNew(s);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_POSITION_AT_CHATRECORD_FIRST_IN_BOOLEAN, Boolean.FALSE);
        }
    }

    public C78606a(C67391b bVar, C76227e eVar) {
        this.f230239b = bVar;
        this.f230240c = bVar.mo91577r();
        this.f230238a = eVar;
    }

    /* renamed from: a */
    public void mo106480a(MMChattingListView mMChattingListView, C76227e.C76230d<C72963f4> dVar) {
        C85405m.m105412b(13);
        mMChattingListView.getBaseAdapter().mo81320c3(dVar);
        ((C79368l) this.f230239b.f193278b.mo102812a(C79368l.class)).mo108167B4();
        if (dVar.f223308b == C76227e.C76228a.ACTION_UPDATE) {
            this.f230239b.f193286j.mo101994i0();
        }
    }

    /* renamed from: b */
    public abstract C78430l mo108592b(C76227e.C76228a aVar, Bundle bundle, C76227e.C76230d dVar);

    /* renamed from: c */
    public void mo108593c(MMChattingListView mMChattingListView, int i, long j, boolean z, int i2, boolean z2) {
        Log.m105925i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[matteHighLightItem] position:%s", Integer.valueOf(i));
        MMHandlerThread.removeRunnable(this.f230246i);
        C78609c cVar = new C78609c(i, z, i2, z2, mMChattingListView);
        this.f230246i = cVar;
        MMHandlerThread.postToMainThreadDelayed(cVar, 300);
    }

    /* renamed from: d */
    public void mo108594d(C76227e.C76228a aVar, boolean z, Bundle bundle) {
        Log.m105924i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[onLoad] action:" + aVar + " isBlock:" + z + " username:" + this.f230239b.mo91577r());
        if (Util.isNullOrNil(this.f230239b.mo91577r())) {
            Log.m105928w("MicroMsg.ChattingLoader.AbstractDataPresenter", "[onLoad] username is null!");
            return;
        }
        C85405m.m105411a(13);
        ((C79368l) this.f230239b.f193278b.mo102812a(C79368l.class)).mo108174G1();
        C76227e.C76228a aVar2 = C76227e.C76228a.ACTION_ENTER;
        boolean c = (aVar != aVar2 || !z || this.f230239b.f193286j == null) ? false : C78190b.f229093y0.mo108228c();
        C76227e eVar = this.f230238a;
        C78607a aVar3 = new C78607a(bundle, aVar);
        C76231f fVar = (C76231f) eVar;
        fVar.getClass();
        Log.m105925i("MicroMsg.ChattingLoader.ListDataLoader", "[load] mode:%s isBlock:%s thread:%s optBlock:%s", aVar, Boolean.valueOf(z), Long.valueOf(Thread.currentThread().getId()), Boolean.valueOf(c));
        if (aVar == aVar2 && z && c) {
            C76218a aVar4 = (C76218a) fVar.f223323e;
            aVar4.mo106477c();
            aVar4.f223279b.mo91571l().postDelayed(aVar4.f223280c, 1000);
            aVar4.f223279b.mo91570k().mo81289D().setVisibility(8);
            z = false;
        }
        C76231f.C76233b bVar = new C76231f.C76233b(aVar, z, aVar3, fVar.f223320b);
        if (z) {
            bVar.run();
        } else {
            fVar.f223319a.post(bVar);
        }
    }

    /* renamed from: e */
    public void mo108595e(int i, boolean z, int i2, boolean z2) {
        this.f230245h = 3;
        C67391b bVar = this.f230239b;
        if (!bVar.f193290n) {
            bVar.mo91549J(i, z2, z, i2);
        } else {
            bVar.mo91550K(i, C76577a.m92151b(bVar.mo91565f(), 120), z2, z);
        }
        this.f230239b.mo91570k().postDelayed(new C78608b(i, i2, z2, z), 200);
    }

    public String toString() {
        return getClass().getName();
    }
}
