package ez1;

import android.graphics.Bitmap;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k60.C60979d;
import l60.C99344b;
import p196ln.C10579k;
import r60.C101350i;
import t60.C64207e;
import vd3.C78407r;
import x60.C102564a;
import xy1.C15912f;
import xy1.C15913g;
import xy1.C53475k;

/* renamed from: ez1.e */
public class C97771e implements C78407r.C78409b, C78407r.C78410c {

    /* renamed from: d */
    public final List<WeakReference<C78407r>> f286845d = new ArrayList();

    /* renamed from: e */
    public final C78407r.C78409b f286846e;

    /* renamed from: ez1.e$a */
    public class C97772a implements C15913g.C15916c {

        /* renamed from: a */
        public final /* synthetic */ String f286847a;

        /* renamed from: ez1.e$a$a */
        public class C97773a implements C64207e<C45720b, Bitmap> {
            public C97773a() {
            }

            /* renamed from: a */
            public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                synchronized (C97771e.this.f286845d) {
                    Iterator it = ((ArrayList) C97771e.this.f286845d).iterator();
                    while (it.hasNext()) {
                        C78407r rVar = (C78407r) ((WeakReference) it.next()).get();
                        if (rVar == null) {
                            it.remove();
                        } else if (((C15913g) C86312j.m106911c(C15913g.class)).mo440X3((String) C97771e.this.mo137110b(rVar.f229749j).first).getAvatarUrl().equals(((C45720b) aVar.f301995a).f123551d)) {
                            rVar.mo1428X(rVar.f229749j);
                        }
                    }
                }
            }
        }

        public C97772a(String str) {
            this.f286847a = str;
        }

        /* renamed from: a */
        public void mo445a(Map<String, C15912f> map) {
            C15912f fVar = map.get(this.f286847a);
            if (fVar == null) {
                Log.m105928w("GameLife.AvatarDrawableLoader", "get contact failed");
                return;
            }
            String avatarUrl = fVar.getAvatarUrl();
            C60979d<C45720b> dVar = C97775h.f286852a;
            C99344b<C45720b, Bitmap> a = C97775h.f286852a.mo85955a(new C45720b(avatarUrl));
            C97773a aVar = new C97773a();
            a.getClass();
            a.f291320d = aVar;
            a.mo85953c();
        }
    }

    /* renamed from: ez1.e$b */
    public class C97774b implements C78407r.C78411d {

        /* renamed from: a */
        public final /* synthetic */ String f286850a;

        /* renamed from: b */
        public final /* synthetic */ C78407r f286851b;

        public C97774b(C97771e eVar, String str, C78407r rVar) {
            this.f286850a = str;
            this.f286851b = rVar;
        }

        /* renamed from: X */
        public boolean mo108362X(String str) {
            if (!this.f286850a.equals(str)) {
                return true;
            }
            C78407r.f229742r.post(this.f286851b.f229753q);
            this.f286851b.f229752p = null;
            return true;
        }
    }

    public C97771e(C78407r.C78409b bVar) {
        this.f286846e = bVar;
    }

    /* renamed from: E0 */
    public void mo10724E0(C78407r rVar) {
        if (rVar instanceof C10579k.C10580a) {
            Pair<String, Boolean> b = mo137110b(rVar.f229749j);
            boolean booleanValue = ((Boolean) b.second).booleanValue();
            String str = (String) b.first;
            if (booleanValue) {
                ((ArrayList) this.f286845d).add(new WeakReference(rVar));
                return;
            }
            rVar.f229752p = new C97774b(this, str, rVar);
            this.f286846e.mo10724E0(rVar);
        }
    }

    /* renamed from: O */
    public Bitmap mo10725O(String str) {
        Pair<String, Boolean> b = mo137110b(str);
        return ((Boolean) b.second).booleanValue() ? ov0(str, 0, 0, 0) : this.f286846e.mo10725O((String) b.first);
    }

    /* renamed from: a */
    public boolean mo108339a(String str) {
        return !C72996z1.m85831b5(((C53475k) C86312j.m106911c(C53475k.class)).mo59162n(str));
    }

    /* renamed from: b */
    public final Pair<String, Boolean> mo137110b(String str) {
        if (C72996z1.m85831b5(str)) {
            return new Pair<>(str, Boolean.TRUE);
        }
        String n = ((C53475k) C86312j.m106911c(C53475k.class)).mo59162n(str);
        return new Pair<>(n, Boolean.valueOf(C72996z1.m85831b5(n)));
    }

    public Bitmap loadBitmap(String str) {
        Pair<String, Boolean> b = mo137110b(str);
        return ((Boolean) b.second).booleanValue() ? ov0(str, 0, 0, 0) : this.f286846e.loadBitmap((String) b.first);
    }

    public Bitmap ov0(String str, int i, int i2, int i3) {
        Class cls = C15913g.class;
        Pair<String, Boolean> b = mo137110b(str);
        String str2 = (String) b.first;
        if (!((Boolean) b.second).booleanValue()) {
            return this.f286846e.ov0(str2, i, i2, i3);
        }
        C15912f X3 = ((C15913g) C86312j.m106911c(cls)).mo440X3(str2);
        if (X3 != null) {
            String nullAsNil = Util.nullAsNil(X3.getAvatarUrl());
            C60979d<C45720b> dVar = C97775h.f286852a;
            Bitmap e = C97775h.f286852a.mo85955a(new C45720b(nullAsNil)).mo138757e();
            if (e != null && !e.isRecycled()) {
                return e;
            }
        }
        ((C15913g) C86312j.m106911c(cls)).xt0(str2, new C97772a(str2));
        return null;
    }

    /* renamed from: qq */
    public Bitmap mo10728qq() {
        return this.f286846e.mo10728qq();
    }
}
