package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C116805e1;
import f62.C116806h1;
import f62.C75694f1;
import f62.C75699i1;
import f62.C75700k0;
import f62.C75701k1;
import java.io.IOException;
import jc3.C76400h;
import nr3.C35015b;
import nr3.C89055a;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import p285zh.C119114c;
import pc0.C118010i;
import pc0.C118018u;
import te3.C50886px;
import te3.C77949j3;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.a0 */
public class C69836a0 implements C76400h {

    /* renamed from: b */
    public static final C69839c f201498b = new C69839c((C69837a) null);

    /* renamed from: a */
    public C75699i1 f201499a;

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.a0$b */
    public static class C69838b implements C75699i1 {
        /* renamed from: a */
        public void mo58465a() {
        }

        /* renamed from: b */
        public void mo58466b(C72963f4 f4Var, C77949j3 j3Var) {
            C119114c.m167921f("newMsgDummy");
        }
    }

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.a0$c */
    public static final class C69839c extends C89055a<C116806h1> implements C116806h1 {
        public C69839c(C69837a aVar) {
        }

        /* renamed from: N5 */
        public void mo96085N5(Object obj) {
            mo123416n(new a0$c$$d(this, obj));
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C116805e1.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C116805e1) ((C15510f) iVar.get())).mo55803N5(obj);
                }
            }
        }

        /* renamed from: U4 */
        public void mo96086U4(Object obj) {
            mo123416n(new a0$c$$c(this, obj));
            C38166b.m41755b(C116805e1.class, new a0$c$$a(obj));
        }

        /* renamed from: j5 */
        public void mo96087j5(Object obj) {
            mo123416n(new a0$c$$e(this, obj));
            C38166b.m41755b(C116805e1.class, new a0$c$$b(obj));
        }
    }

    /* renamed from: a */
    public void mo96080a(Object obj) {
        if (obj instanceof C118018u) {
            f201498b.mo96087j5(obj);
        } else if ((obj instanceof String) && obj.equals("NetSceneInit")) {
            f201498b.mo96087j5(obj);
        } else if (obj instanceof C118010i) {
            f201498b.mo96087j5(obj);
        }
    }

    /* renamed from: b */
    public void mo96081b(Object obj) {
        if (obj instanceof C118018u) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).wy0(((C118018u) obj).f352778d);
        }
    }

    /* renamed from: c */
    public void mo96082c(Object obj) {
        Class cls = C75700k0.class;
        C35015b<C75699i1> bVar = C75701k1.f222304b;
        if (bVar != null) {
            this.f201499a = bVar.get();
        }
        if (this.f201499a == null) {
            this.f201499a = new C69838b();
        }
        if (obj instanceof C118018u) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).qy0(((C118018u) obj).f352778d);
            f201498b.mo96086U4(obj);
        } else if (obj instanceof String) {
            if (obj.equals("NetSceneInit")) {
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).qy0((String) obj);
                f201498b.mo96086U4(obj);
            }
        } else if (obj instanceof C118010i) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).qy0(obj.toString());
            f201498b.mo96086U4(obj);
        }
    }

    /* renamed from: d */
    public void mo96083d(Object obj, int i, int i2, C50886px pxVar, byte[] bArr, boolean z) {
        C75694f1 f1Var = C75694f1.C75695a.f222302a.get(Integer.valueOf(pxVar.f140037d));
        if (f1Var != null) {
            try {
                C119114c.m167921f("SyncDoCmd");
                f1Var.mo66659a(obj, pxVar, i, bArr, z, this.f201499a);
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SyncDoCmdExtensions", "docmd: parse protobuf error, " + e.getMessage());
                throw new RuntimeException("docmd: parse protobuf error");
            }
        } else {
            Log.m105929w("MicroMsg.SyncDoCmdExtensions", "SyncDoCmdExtension for cmd id [%s] is null.", Integer.valueOf(pxVar.f140037d));
        }
    }

    /* renamed from: e */
    public void mo96084e(Object obj) {
        Class cls = C75700k0.class;
        if (obj instanceof C118018u) {
            this.f201499a.mo58465a();
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).wy0(((C118018u) obj).f352778d);
            f201498b.mo96085N5(obj);
        } else if ((obj instanceof String) && obj.equals("NetSceneInit")) {
            this.f201499a.mo58465a();
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).wy0((String) obj);
            f201498b.mo96085N5(obj);
        } else if (obj instanceof C118010i) {
            this.f201499a.mo58465a();
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).wy0(obj.toString());
            f201498b.mo96085N5(obj);
        }
    }
}
