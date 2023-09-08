package pl1;

import android.graphics.Bitmap;
import android.util.Pair;
import bl3.C39818r;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ht1.C60179k4;
import ht1.C60187m5;
import ht1.C60200t1;
import ht1.C60208v1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l60.C99344b;
import n60.C100075f;
import p196ln.C10579k;
import pl1.C11978e0;
import r60.C101350i;
import t60.C64207e;
import up1.C27696y;
import vd3.C78407r;
import x60.C102564a;

/* renamed from: pl1.g */
public class C100807g implements C78407r.C78409b, C78407r.C78410c {

    /* renamed from: d */
    public final List<WeakReference<C10579k.C10580a>> f295319d = new ArrayList();

    /* renamed from: e */
    public final C78407r.C78409b f295320e;

    /* renamed from: pl1.g$a */
    public class C100808a implements C64207e<C100810g0, Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ String f295321a;

        public C100808a(String str) {
            this.f295321a = str;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            synchronized (C100807g.this.f295319d) {
                Iterator it = ((ArrayList) C100807g.this.f295319d).iterator();
                while (it.hasNext()) {
                    C10579k.C10580a aVar2 = (C10579k.C10580a) ((WeakReference) it.next()).get();
                    if (aVar2 != null) {
                        aVar2.mo1428X(this.f295321a);
                    } else {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: pl1.g$b */
    public class C100809b implements C78407r.C78411d {

        /* renamed from: a */
        public final /* synthetic */ String f295323a;

        /* renamed from: b */
        public final /* synthetic */ C78407r f295324b;

        public C100809b(C100807g gVar, String str, C78407r rVar) {
            this.f295323a = str;
            this.f295324b = rVar;
        }

        /* renamed from: X */
        public boolean mo108362X(String str) {
            if (!this.f295323a.equals(str)) {
                return true;
            }
            C78407r.f229742r.post(this.f295324b.f229753q);
            this.f295324b.f229752p = null;
            return true;
        }
    }

    public C100807g(C78407r.C78409b bVar) {
        this.f295320e = bVar;
    }

    /* renamed from: E0 */
    public void mo10724E0(C78407r rVar) {
        if (rVar instanceof C10579k.C10580a) {
            Pair<String, Boolean> b = mo140265b(rVar.f229749j);
            boolean booleanValue = ((Boolean) b.second).booleanValue();
            String str = (String) b.first;
            if (booleanValue) {
                ((ArrayList) this.f295319d).add(new WeakReference((C10579k.C10580a) rVar));
                return;
            }
            rVar.f229752p = new C100809b(this, str, rVar);
            this.f295320e.mo10724E0(rVar);
        }
    }

    /* renamed from: O */
    public Bitmap mo10725O(String str) {
        Pair<String, Boolean> b = mo140265b(str);
        return ((Boolean) b.second).booleanValue() ? ov0(str, 0, 0, 0) : this.f295320e.mo10725O((String) b.first);
    }

    /* renamed from: a */
    public boolean mo108339a(String str) {
        return !C72996z1.m85817T4(((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(str));
    }

    /* renamed from: b */
    public final Pair<String, Boolean> mo140265b(String str) {
        if (C72996z1.m85817T4(str)) {
            return new Pair<>(str, Boolean.TRUE);
        }
        if (C72996z1.m85823W4(str)) {
            return new Pair<>(str, Boolean.TRUE);
        }
        if (C72996z1.m85821V4(str)) {
            return new Pair<>(str, Boolean.TRUE);
        }
        String n = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(str);
        return new Pair<>(n, Boolean.valueOf(C72996z1.m85817T4(n) || C72996z1.m85823W4(n)));
    }

    public Bitmap loadBitmap(String str) {
        Pair<String, Boolean> b = mo140265b(str);
        return ((Boolean) b.second).booleanValue() ? ov0(str, 0, 0, 0) : this.f295320e.loadBitmap((String) b.first);
    }

    public Bitmap ov0(String str, int i, int i2, int i3) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C60208v1.class;
        Pair<String, Boolean> b = mo140265b(str);
        String str2 = (String) b.first;
        if (!((Boolean) b.second).booleanValue()) {
            return this.f295320e.ov0(str2, i, i2, i3);
        }
        C60187m5 x402 = C72996z1.m85817T4(str2) ? ((C60208v1) C86312j.m106911c(cls3)).x40(str2) : C72996z1.m85821V4(str2) ? ((C60208v1) C86312j.m106911c(cls3)).mo78716qg(str2) : ((C60208v1) C86312j.m106911c(cls3)).mo78709aq(str2);
        if (x402 == null) {
            return null;
        }
        String g0 = x402.mo84172g0();
        boolean T4 = C72996z1.m85817T4(str2);
        C100075f O2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(T4 ? C11978e0.C11979a.AVATAR : C11978e0.C11979a.WX_AVATAR);
        C99344b<C100810g0, Bitmap> a = (T4 ? ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2() : ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1()).mo85955a(new C62345f(g0, C27696y.MEDIUM_AVATAR_IMAGE));
        a.mo138758f(O2);
        Bitmap e = a.mo138757e();
        if (e != null && !e.isRecycled()) {
            return e;
        }
        a.f291320d = new C100808a(str);
        a.mo85953c();
        return null;
    }

    /* renamed from: qq */
    public Bitmap mo10728qq() {
        return this.f295320e.mo10728qq();
    }
}
