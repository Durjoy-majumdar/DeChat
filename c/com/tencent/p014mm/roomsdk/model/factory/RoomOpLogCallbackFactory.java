package com.tencent.p014mm.roomsdk.model.factory;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OplogServiceResultEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75880o;
import g62.C8233m;
import nj3.C76879j;
import p530fx.C45820d;
import pg3.C77084b;
import pg3.C77086f;
import qo3.C89779i0;
import tc0.C77885p;

/* renamed from: com.tencent.mm.roomsdk.model.factory.RoomOpLogCallbackFactory */
public class RoomOpLogCallbackFactory extends C72940a implements C45820d {

    /* renamed from: f */
    public C75880o f212606f;

    /* renamed from: g */
    public boolean f212607g = false;

    /* renamed from: h */
    public IListener f212608h = new IListener<OplogServiceResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1984241019;
        }

        public boolean callback(IEvent iEvent) {
            RoomOpLogCallbackFactory.this.f212608h.dead();
            MMHandlerThread.postToMainThread(new C72943c(this, (OplogServiceResultEvent) iEvent));
            return false;
        }
    };

    /* renamed from: i */
    public C8233m.C8234a f212609i = new C72939a();

    /* renamed from: com.tencent.mm.roomsdk.model.factory.RoomOpLogCallbackFactory$a */
    public class C72939a implements C8233m.C8234a {
        public C72939a() {
        }

        /* renamed from: a */
        public void mo6254a(int i, String str, String str2) {
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107990O(RoomOpLogCallbackFactory.this.f212606f.mo58568b(), RoomOpLogCallbackFactory.this.f212609i);
            RoomOpLogCallbackFactory roomOpLogCallbackFactory = RoomOpLogCallbackFactory.this;
            if (!roomOpLogCallbackFactory.f212607g) {
                roomOpLogCallbackFactory.f212607g = true;
                C77084b bVar = roomOpLogCallbackFactory.f212615d;
                if (bVar != null) {
                    if (bVar instanceof C77086f) {
                        C77086f fVar = (C77086f) bVar;
                        fVar.f225171a = i;
                        fVar.f225172b = str;
                        fVar.f225173c = str2;
                        bVar.mo10150a(0, i, "", bVar);
                    } else {
                        bVar.mo10150a(0, i, "", bVar);
                    }
                }
                C89779i0 i0Var = RoomOpLogCallbackFactory.this.f212616e;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
            }
        }
    }

    public RoomOpLogCallbackFactory(boolean z) {
        this.f212612a = z;
    }

    /* renamed from: c */
    public void mo100865c() {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.RoomCallbackFactory", "request oplog %s", this.f212606f);
        if (!(this.f212613b == null && this.f212614c == null && this.f212615d == null)) {
            this.f212608h.alive();
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107992d(this.f212606f.mo58568b(), this.f212609i);
        }
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(this.f212606f);
    }

    public void cancel() {
        Class cls = C75700k0.class;
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107991Q(this.f212606f);
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107990O(this.f212606f.mo58568b(), this.f212609i);
        this.f212608h.dead();
    }

    /* renamed from: d */
    public void mo100867d(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        this.f212616e = C76879j.m92723Q(context, str, str2, z, z2, onCancelListener);
        mo100865c();
    }
}
