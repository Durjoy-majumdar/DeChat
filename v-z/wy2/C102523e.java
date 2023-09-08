package wy2;

import android.graphics.Bitmap;
import android.util.Pair;
import bl3.C39818r;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ht1.C60200t1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l60.C99344b;
import n60.C100075f;
import p196ln.C10579k;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import r60.C101350i;
import rz2.C48212k;
import t60.C64207e;
import up1.C27696y;
import vd3.C78407r;
import x60.C102564a;
import xy2.C53477h;

/* renamed from: wy2.e */
public class C102523e implements C78407r.C78409b, C78407r.C78410c {

    /* renamed from: d */
    public final List<WeakReference<C10579k.C10580a>> f301878d = new ArrayList();

    /* renamed from: e */
    public final C78407r.C78409b f301879e;

    /* renamed from: wy2.e$a */
    public class C102524a implements C64207e<C100810g0, Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ String f301880a;

        public C102524a(String str) {
            this.f301880a = str;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            synchronized (C102523e.this.f301878d) {
                Iterator it = ((ArrayList) C102523e.this.f301878d).iterator();
                while (it.hasNext()) {
                    C10579k.C10580a aVar2 = (C10579k.C10580a) ((WeakReference) it.next()).get();
                    if (aVar2 != null) {
                        aVar2.mo1428X(this.f301880a);
                    } else {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: wy2.e$b */
    public class C102525b implements C78407r.C78411d {

        /* renamed from: a */
        public final /* synthetic */ String f301882a;

        /* renamed from: b */
        public final /* synthetic */ C78407r f301883b;

        public C102525b(C102523e eVar, String str, C78407r rVar) {
            this.f301882a = str;
            this.f301883b = rVar;
        }

        /* renamed from: X */
        public boolean mo108362X(String str) {
            if (!this.f301882a.equals(str)) {
                return true;
            }
            C78407r.f229742r.post(this.f301883b.f229753q);
            this.f301883b.f229752p = null;
            return true;
        }
    }

    public C102523e(C78407r.C78409b bVar) {
        this.f301879e = bVar;
    }

    /* renamed from: E0 */
    public void mo10724E0(C78407r rVar) {
        if (rVar instanceof C10579k.C10580a) {
            Pair<String, Boolean> b = mo142140b(rVar.f229749j);
            boolean booleanValue = ((Boolean) b.second).booleanValue();
            String str = (String) b.first;
            if (booleanValue) {
                ((ArrayList) this.f301878d).add(new WeakReference((C10579k.C10580a) rVar));
                return;
            }
            rVar.f229752p = new C102525b(this, str, rVar);
            this.f301879e.mo10724E0(rVar);
        }
    }

    /* renamed from: O */
    public Bitmap mo10725O(String str) {
        Pair<String, Boolean> b = mo142140b(str);
        return ((Boolean) b.second).booleanValue() ? ov0(str, 0, 0, 0) : this.f301879e.mo10725O((String) b.first);
    }

    /* renamed from: a */
    public boolean mo108339a(String str) {
        return !C72996z1.m85799F5(str);
    }

    /* renamed from: b */
    public final Pair<String, Boolean> mo142140b(String str) {
        return C72996z1.m85799F5(str) ? new Pair<>(str, Boolean.TRUE) : new Pair<>(str, Boolean.FALSE);
    }

    public Bitmap loadBitmap(String str) {
        Pair<String, Boolean> b = mo142140b(str);
        return ((Boolean) b.second).booleanValue() ? ov0(str, 0, 0, 0) : this.f301879e.loadBitmap((String) b.first);
    }

    public Bitmap ov0(String str, int i, int i2, int i3) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Pair<String, Boolean> b = mo142140b(str);
        String str2 = (String) b.first;
        if (!((Boolean) b.second).booleanValue()) {
            return this.f301879e.ov0(str2, i, i2, i3);
        }
        C48212k wx02 = ((C53477h) C86312j.m106911c(C53477h.class)).wx0(str);
        if (wx02 == null) {
            return null;
        }
        String str3 = wx02.field_smallHeadImgUrl;
        C100075f O2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR);
        C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85955a(((C62368t0) C86312j.m106911c(C62368t0.class)).Rt0(str3, C27696y.MEDIUM_AVATAR_IMAGE));
        a.mo138758f(O2);
        Bitmap e = a.mo138757e();
        if (e != null && !e.isRecycled()) {
            return e;
        }
        a.f291320d = new C102524a(str);
        a.mo85953c();
        return null;
    }

    /* renamed from: qq */
    public Bitmap mo10728qq() {
        return this.f301879e.mo10728qq();
    }
}
