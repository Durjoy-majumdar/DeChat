package xu3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import pu3.C25477h;
import pu3.C25478i;
import pu3.C25494p;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26714a;
import zu3.C26715b;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.h */
public class C26554h extends C26555i<C25477h> {

    /* renamed from: d */
    public C25499u.C25500a f73893d = null;

    /* renamed from: e */
    public C25478i.C25484f f73894e = null;

    public C26554h(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u.C25500a aVar2 = iVar2.f72125a.f72168o;
            this.f73893d = aVar2;
            this.f73894e = iVar2.mo52716d(aVar2);
        }
    }

    /* renamed from: a */
    public Comparable mo53495a(C26718e eVar, Comparable comparable) {
        C25477h hVar = (C25477h) comparable;
        eVar.getClass();
        int[] iArr = hVar.f72122f;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = eVar.mo53711e(iArr[i]);
        }
        byte[] bArr = hVar.f72123g;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        C26714a aVar = new C26714a(eVar, byteArrayInputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 512);
        C26715b bVar = new C26715b(eVar, byteArrayOutputStream);
        while (true) {
            int read = byteArrayInputStream.read() & 255;
            byteArrayOutputStream.write(read);
            if (read != 9) {
                switch (read) {
                    case 0:
                        return new C25477h(hVar.f72185d, hVar.f72121e, iArr2, byteArrayOutputStream.toByteArray());
                    case 1:
                        C25494p.m32919d(bVar, C25494p.m32917b(aVar));
                        break;
                    case 2:
                        C25494p.m32918c(bVar, C25494p.m32916a(aVar));
                        break;
                    case 3:
                    case 4:
                        C25494p.m32919d(bVar, C25494p.m32917b(aVar));
                        C25494p.m32919d(bVar, eVar.mo53711e(C25494p.m32917b(aVar) - 1) + 1);
                        C25494p.m32919d(bVar, eVar.mo53712f(C25494p.m32917b(aVar) - 1) + 1);
                        if (read != 4) {
                            break;
                        } else {
                            C25494p.m32919d(bVar, eVar.mo53711e(C25494p.m32917b(aVar) - 1) + 1);
                            break;
                        }
                    case 5:
                    case 6:
                        C25494p.m32919d(bVar, C25494p.m32917b(aVar));
                        break;
                }
            } else {
                C25494p.m32919d(bVar, eVar.mo53711e(C25494p.m32917b(aVar) - 1) + 1);
            }
        }
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72168o;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i2 < 0) {
            gVar.getClass();
        } else {
            gVar.f74274A.mo183355b(i2, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52733i();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i2 != i4) {
            gVar.f74288m.mo162980f(i2, i4);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        C25477h hVar = (C25477h) comparable;
        this.f73893d.f72182f++;
        C25478i.C25484f fVar = this.f73894e;
        fVar.mo52740z(C25478i.this.f72125a.f72168o, true);
        int position = fVar.f72245a.position();
        C25494p.m32919d(fVar, hVar.f72121e);
        C25494p.m32919d(fVar, r3);
        for (int i : hVar.f72122f) {
            C25494p.m32919d(fVar, i + 1);
        }
        fVar.mo52792u(hVar.f72123g);
        return position;
    }
}
