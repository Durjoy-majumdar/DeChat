package p908k9;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ServiceManager;
import p908k9.C76523b;
import p908k9.C76525c;
import tt1.C78095h;

/* renamed from: k9.a */
public class C76518a {

    /* renamed from: a */
    public C76525c f223970a;

    /* renamed from: b */
    public C76523b f223971b;

    /* renamed from: c */
    public C76521c f223972c;

    /* renamed from: d */
    public C76522d f223973d;

    /* renamed from: e */
    public int f223974e = -1;

    /* renamed from: f */
    public IBinder.DeathRecipient f223975f = new C76519a();

    /* renamed from: k9.a$a */
    public class C76519a implements IBinder.DeathRecipient {
        public C76519a() {
        }

        public void binderDied() {
            C76518a aVar = C76518a.this;
            C76522d dVar = aVar.f223973d;
            if (dVar != null) {
                ((C78095h.C78099d.C78100a) dVar).mo108092a(2101, -1, aVar.f223974e, -1);
            }
        }
    }

    /* renamed from: k9.a$b */
    public class C76520b extends C76523b.C76524a {
        public C76520b() {
        }
    }

    /* renamed from: k9.a$c */
    public class C76521c extends Handler {
        public C76521c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C76518a aVar = C76518a.this;
                C76522d dVar = aVar.f223973d;
                if (dVar != null) {
                    ((C78095h.C78099d.C78100a) dVar).mo108093b(1, aVar.f223974e, -1);
                }
            } else if (i == 2) {
                C76518a aVar2 = C76518a.this;
                C76522d dVar2 = aVar2.f223973d;
                if (dVar2 != null) {
                    ((C78095h.C78099d.C78100a) dVar2).mo108093b(2, aVar2.f223974e, -1);
                }
            } else if (i == 3) {
                C76518a aVar3 = C76518a.this;
                C76522d dVar3 = aVar3.f223973d;
                if (dVar3 != null) {
                    ((C78095h.C78099d.C78100a) dVar3).mo108093b(3, aVar3.f223974e, -1);
                }
            } else if (i == 6) {
                C76518a aVar4 = C76518a.this;
                C76522d dVar4 = aVar4.f223973d;
                if (dVar4 != null) {
                    ((C78095h.C78099d.C78100a) dVar4).mo108092a(0, message.arg1, aVar4.f223974e, -1);
                }
                removeMessages(8);
            } else if (i == 7) {
                C76518a aVar5 = C76518a.this;
                C76522d dVar5 = aVar5.f223973d;
                if (dVar5 != null) {
                    int i2 = 2005;
                    switch (message.arg1) {
                        case 2001:
                            i2 = 2002;
                            break;
                        case 2002:
                            i2 = 2003;
                            break;
                        case 2003:
                        case 2006:
                            break;
                        case 2004:
                            i2 = 2000;
                            break;
                        case 2005:
                            i2 = 2006;
                            break;
                        default:
                            i2 = 2020;
                            break;
                    }
                    ((C78095h.C78099d.C78100a) dVar5).mo108092a(i2, -1, aVar5.f223974e, -1);
                }
                removeMessages(8);
            } else if (i == 8) {
                C76518a aVar6 = C76518a.this;
                C76522d dVar6 = aVar6.f223973d;
                if (dVar6 != null) {
                    ((C78095h.C78099d.C78100a) dVar6).mo108092a(2001, -1, aVar6.f223974e, -1);
                }
                removeMessages(8);
                C76518a aVar7 = C76518a.this;
                C76521c cVar = aVar7.f223972c;
                if (cVar != null) {
                    cVar.removeMessages(8);
                }
                try {
                    aVar7.f223970a.Ed0(aVar7.f223971b);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    /* renamed from: k9.a$d */
    public interface C76522d {
    }

    public C76518a(C76525c cVar, Looper looper, int i) {
        this.f223970a = cVar;
        C76521c cVar2 = new C76521c(looper);
        C76520b bVar = new C76520b();
        this.f223971b = bVar;
        if (this.f223970a.mo106756rx(bVar, i)) {
            this.f223972c = cVar2;
            cVar.asBinder().linkToDeath(this.f223975f, 0);
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: a */
    public static C76525c m91995a() {
        return C76525c.C76526a.m92000a(ServiceManager.getService("authentication_service"));
    }

    /* renamed from: b */
    public void mo106747b() {
        C76521c cVar = this.f223972c;
        if (cVar != null) {
            cVar.removeMessages(8);
        }
        try {
            this.f223970a.fk0(this.f223971b);
            this.f223970a.asBinder().unlinkToDeath(this.f223975f, 0);
        } catch (RemoteException unused) {
        }
    }
}
