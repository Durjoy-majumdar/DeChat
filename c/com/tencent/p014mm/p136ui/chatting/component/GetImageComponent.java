package com.tencent.p014mm.p136ui.chatting.component;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ChattingUIPhotoInfoEvent;
import com.tencent.p014mm.autogen.events.PauseAutoGetBigImgEvent;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.gallery.C97128t;
import com.tencent.p014mm.p136ui.chatting.gallery.C97135u;
import com.tencent.p014mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import i21.C98591h;
import java.util.HashSet;
import le2.C99412b;
import ne2.C34823a;
import ob0.C117747y;
import p158gt.C76051j;
import p158gt.C98201k;
import p270xi.C91212b;
import p755xs.C102720b;
import q90.C101062d;
import zj3.C79368l;
import zj3.C79391y;
import zt3.C119157j;

@C91212b(exportInterface = C79391y.class)
/* renamed from: com.tencent.mm.ui.chatting.component.GetImageComponent */
public class GetImageComponent extends C73412a implements C79391y, C76051j.C76052a, C102720b.C78973a {

    /* renamed from: e */
    public IListener f284330e = new IListener<ChattingUIPhotoInfoEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1102125916;
        }

        public boolean callback(IEvent iEvent) {
            ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = (ChattingUIPhotoInfoEvent) iEvent;
            if (chattingUIPhotoInfoEvent instanceof ChattingUIPhotoInfoEvent) {
                C72963f4 f4Var = chattingUIPhotoInfoEvent.f193516d.f193518a;
                GetImageComponent getImageComponent = GetImageComponent.this;
                int firstVisiblePosition = getImageComponent.f215752d.mo91570k().getFirstVisiblePosition();
                int lastVisiblePosition = getImageComponent.f215752d.mo91570k().getLastVisiblePosition();
                int max = Math.max(firstVisiblePosition, 0);
                int max2 = Math.max(lastVisiblePosition, 0);
                if (max < 0 || max2 >= getImageComponent.f215752d.mo91570k().mo81303l().getCount()) {
                    Log.m105925i("MicroMsg.ChattingUI.GetImageComponent", "invalid position %d-%d, cnt:%d", Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(getImageComponent.f215752d.mo91570k().mo81303l().getCount()));
                } else {
                    for (int i = max; i <= max2; i++) {
                        C72963f4 f4Var2 = (C72963f4) getImageComponent.f215752d.mo91570k().mo81303l().getItem(i);
                        if (!(f4Var == null || f4Var2 == null || f4Var2.getMsgId() != f4Var.getMsgId())) {
                            View w = ((BaseChattingUIFragment) getImageComponent.f215752d.f193287k).mo102031Z().mo81316w(i, max);
                            if (w == null) {
                                Log.m105921e("MicroMsg.ChattingUI.GetImageComponent", "[getPhotoInfo] getChildAt(%d)", Integer.valueOf((i - max) + getImageComponent.f215752d.mo91568i()));
                            } else {
                                View view = null;
                                if (f4Var.mo100979R3() || f4Var.mo100994f4() || f4Var.mo100989b4() || f4Var.mo100983V3()) {
                                    view = w.findViewById(C0966R.C0970id.b4c);
                                } else if (f4Var.mo100961A3()) {
                                    view = w.findViewById(C0966R.C0970id.b3j);
                                }
                                if (view != null) {
                                    int[] iArr = new int[2];
                                    view.getLocationOnScreen(iArr);
                                    ChattingUIPhotoInfoEvent.C67669b bVar = chattingUIPhotoInfoEvent.f193517e;
                                    bVar.f193519a = iArr[0];
                                    bVar.f193520b = iArr[1];
                                    bVar.f193521c = view.getWidth();
                                    chattingUIPhotoInfoEvent.f193517e.f193522d = view.getHeight();
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: f */
    public MTimerHandler f284331f = new MTimerHandler(new C73349a(), false);

    /* renamed from: g */
    public C97128t f284332g = C97128t.C97130b.f284993a;

    /* renamed from: com.tencent.mm.ui.chatting.component.GetImageComponent$a */
    public class C73349a implements MTimerHandler.CallBack {
        public C73349a() {
        }

        public boolean onTimerExpired() {
            Class cls = C98201k.class;
            C67391b bVar = GetImageComponent.this.f215752d;
            if (bVar == null) {
                return false;
            }
            int g = bVar.mo91566g() - GetImageComponent.this.f215752d.mo91568i();
            int j = GetImageComponent.this.f215752d.mo91569j() - GetImageComponent.this.f215752d.mo91568i();
            C79368l lVar = (C79368l) GetImageComponent.this.f215752d.f193278b.mo102812a(C79368l.class);
            int max = Math.max(g, 0);
            int max2 = Math.max(Math.min(j, lVar.getCount()), 0);
            Log.m105918d("MicroMsg.ChattingUI.GetImageComponent", "first: " + max + " last: " + max2);
            if (max2 < max) {
                Log.m105918d("MicroMsg.ChattingUI.GetImageComponent", "start timer to wait listview refresh");
                GetImageComponent.this.f284331f.startTimer(1000);
                return false;
            }
            ((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).f267319h = true;
            while (max <= max2) {
                C72963f4 item = lVar.getItem(max);
                if (item != null && item.mo100979R3()) {
                    if (item.f230729L == 0 && item.mo108774y2() != 0) {
                        C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(item.mo108768t(), item.mo108774y2());
                        String str = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(NQ.f267380g, "", "", true) + "hd";
                        if (!NQ.mo127146q() || C86013q1.m106450k(str)) {
                            Log.m105925i("MicroMsg.ChattingUI.GetImageComponent", "create hd thumb for backup msg fail, img not completed %s", Long.valueOf(item.mo108774y2()));
                        } else {
                            Log.m105924i("MicroMsg.ChattingUI.GetImageComponent", "create hd thumb for backup msg");
                            ((C119157j) C119157j.f356862d).mo183876g(new C73351d(GetImageComponent.this, item, NQ), "MicroMsg.ChattingUI.GetImageComponent");
                        }
                    }
                    if (item.mo108769t2() == 0) {
                        C92836k NQ2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(item.mo108768t(), item.mo108774y2());
                        if (!NQ2.mo127146q() && item.f230734R != 2) {
                            ((C98591h) C86312j.m106911c(C98591h.class)).mo137973qz(item, new C73350c(item, NQ2, max));
                        }
                    }
                }
                max++;
            }
            C92822e eVar = (C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0();
            eVar.f267319h = false;
            eVar.mo127106h(-1);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GetImageComponent$c */
    public class C73350c implements Runnable {

        /* renamed from: d */
        public C72963f4 f215542d;

        /* renamed from: e */
        public C92836k f215543e;

        /* renamed from: f */
        public int f215544f;

        public C73350c(C72963f4 f4Var, C92836k kVar, int i) {
            this.f215542d = f4Var;
            this.f215543e = kVar;
            this.f215544f = i;
        }

        public void run() {
            HashSet<String> hashSet = C92779i0.Ex0().f266896t;
            hashSet.add("image_" + this.f215542d.getMsgId());
            ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127100b(this.f215543e.f267374a, this.f215542d.getMsgId(), 0, Integer.valueOf(this.f215544f), C0966R.C0969drawable.by8, GetImageComponent.this, -1, true);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GetImageComponent$d */
    public class C73351d implements Runnable {

        /* renamed from: d */
        public C72963f4 f215546d;

        public C73351d(GetImageComponent getImageComponent, C72963f4 f4Var, C92836k kVar) {
            this.f215546d = f4Var;
        }

        public void run() {
            if (((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127177Yt(this.f215546d, C0966R.C0969drawable.by8, 0, -1)) {
                C72963f4 f4Var = this.f215546d;
                f4Var.f230729L = 1;
                f4Var.f230755r = true;
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f215546d.getMsgId(), this.f215546d);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GetImageComponent$b */
    public class C97015b implements Runnable {
        public C97015b() {
        }

        public void run() {
            C67391b bVar = GetImageComponent.this.f215752d;
            if (bVar != null) {
                bVar.mo91540A();
            }
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        PauseAutoGetBigImgEvent.C92540a aVar = pauseAutoGetBigImgEvent.f264980d;
        aVar.f264981a = true;
        aVar.f264982b = this.f215752d.mo91574o().getUsername();
        pauseAutoGetBigImgEvent.asyncPublish(Looper.getMainLooper());
        ((C102720b) C86312j.m106911c(C102720b.class)).U70(this);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        PauseAutoGetBigImgEvent.C92540a aVar = pauseAutoGetBigImgEvent.f264980d;
        aVar.f264981a = false;
        aVar.f264982b = this.f215752d.mo91574o().getUsername();
        pauseAutoGetBigImgEvent.asyncPublish(Looper.getMainLooper());
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this);
        mo135714Y5();
    }

    /* renamed from: O4 */
    public void mo26162O4() {
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        long j3 = j2;
        if (!C34823a.m40471a()) {
            ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127102d(this);
        }
        boolean z = i3 == 0 && i4 == 0;
        ((C98591h) C86312j.m106911c(C98591h.class)).mo137965Ez(j2, z, false);
        ((C2CImgAutoDownloader) ((C99412b) C86312j.m106911c(C99412b.class)).mo138504IG()).mo129618a(j, j2, z);
        ((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).mo108186V(j2, ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j2), z);
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
        C20828a.m22825b().mo32525n(i);
        if (i == 0) {
            mo109370p1();
        } else if (i == 2) {
            mo135714Y5();
        }
    }

    /* renamed from: Y5 */
    public void mo135714Y5() {
        if (C97625j3.m125811a()) {
            ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127102d(this);
        }
        this.f284331f.stopTimer();
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        this.f284330e.alive();
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        C67391b bVar;
        if (!Util.isNullOrNil(str) && bitmap != null && (bVar = this.f215752d) != null) {
            bVar.mo91571l().post(new C97015b());
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        mo135714Y5();
        this.f284330e.dead();
        C97128t tVar = this.f284332g;
        tVar.f284991c.clear();
        ((C101062d) tVar.f284989a).mo122812a(new C97135u(tVar));
    }

    /* renamed from: p1 */
    public void mo109370p1() {
        this.f284331f.stopTimer();
        this.f284331f.startTimer(1000);
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        mo135714Y5();
        this.f284330e.dead();
        C97128t tVar = this.f284332g;
        tVar.f284991c.clear();
        ((C101062d) tVar.f284989a).mo122812a(new C97135u(tVar));
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        ((C98591h) C86312j.m106911c(C98591h.class)).mo137965Ez(j2, false, true);
    }
}
