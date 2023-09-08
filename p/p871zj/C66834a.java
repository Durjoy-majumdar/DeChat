package p871zj;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import p001ak.C54053a;
import p006bk.C54479b;
import p006bk.C54482d;
import p006bk.C54486i;
import p464ck.C54866a;
import p464ck.C54867b;
import p848dk.C58298c;
import p848dk.C58301e;
import p848dk.C58302f;
import p848dk.C58306h;
import p850ek.C58614e;

/* renamed from: zj.a */
public abstract class C66834a {

    /* renamed from: a */
    public int f191958a;

    /* renamed from: b */
    public final TreeSet<C54053a> f191959b;

    /* renamed from: c */
    public final List<C54053a> f191960c = new LinkedList();

    /* renamed from: d */
    public final C54867b f191961d;

    /* renamed from: e */
    public C54479b f191962e;

    /* renamed from: f */
    public C66835b f191963f;

    /* renamed from: g */
    public C58302f f191964g;

    /* renamed from: h */
    public C58298c f191965h;

    public C66834a(C54479b bVar, C66835b bVar2, Comparator<C54053a> comparator, C58302f fVar, C58298c cVar) {
        this.f191962e = bVar;
        this.f191963f = bVar2;
        this.f191964g = fVar;
        this.f191965h = cVar;
        this.f191961d = new C54867b(bVar2);
        this.f191959b = new TreeSet<>(comparator);
        mo90812f();
    }

    /* renamed from: a */
    public abstract void mo90807a();

    /* renamed from: b */
    public final void mo90808b(Canvas canvas, long j) {
        C66856o oVar = (C66856o) this;
        List<C54053a> list = oVar.f192037n;
        if (list != null) {
            ((LinkedList) list).clear();
        }
        int size = ((ArrayList) oVar.f192036m).size();
        for (int i = 0; i < size; i++) {
            Iterator it = ((List) ((ArrayList) oVar.f192036m).get(i)).iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C54053a aVar = (C54053a) it.next();
                if (aVar.f151360q) {
                    if (oVar.f192037n == null) {
                        oVar.f192037n = new LinkedList();
                    }
                    ((LinkedList) oVar.f192037n).add(aVar);
                } else {
                    C58298c cVar = oVar.f191965h;
                    aVar.mo74727q(cVar.f166935b, cVar.f166934a);
                    long j2 = oVar.f191965h.f166934a;
                    long j3 = aVar.f151346c;
                    if (j3 <= 0 || j2 - j3 >= 0) {
                        z = false;
                    }
                    if (!z) {
                        oVar.mo90809c(canvas, aVar);
                    }
                }
            }
            List<C54053a> list2 = oVar.f192037n;
            if (list2 != null && !list2.isEmpty()) {
                for (C54053a next : oVar.f192037n) {
                    C58298c cVar2 = oVar.f191965h;
                    next.mo74727q(cVar2.f166935b, cVar2.f166934a);
                    long j4 = oVar.f191965h.f166934a;
                    long j5 = next.f151346c;
                    if (!(j5 > 0 && j4 - j5 < 0)) {
                        oVar.mo90809c(canvas, next);
                    }
                }
                ((LinkedList) oVar.f192037n).clear();
            }
        }
    }

    /* renamed from: c */
    public void mo90809c(Canvas canvas, C54053a aVar) {
        C54482d dVar;
        Bitmap bitmap;
        boolean z;
        C54866a a = this.f191962e.mo75305a(aVar);
        C54867b bVar = this.f191961d;
        C54479b bVar2 = this.f191962e;
        bVar.getClass();
        if (canvas != null) {
            if (aVar.f151355l && C54486i.f152753q) {
                C66835b bVar3 = bVar.f153796c;
                bVar3.getClass();
                if (aVar.f151366w) {
                    Bitmap bitmap2 = aVar.f151356m;
                    if (bitmap2 == null) {
                        bitmap2 = bVar3.f191966a.mo83055a((int) aVar.f151351h, (int) aVar.f151352i);
                    } else if (bitmap2.getWidth() < ((int) aVar.f151351h) || bitmap2.getHeight() < ((int) aVar.f151352i)) {
                        bVar3.f191966a.mo83056b(bitmap2);
                        bitmap2 = bVar3.f191966a.mo83055a((int) aVar.f151351h, (int) aVar.f151352i);
                    }
                    bitmap = bitmap2;
                    aVar.f151356m = bitmap;
                    if (bitmap == null) {
                        bitmap = null;
                    } else {
                        Canvas canvas2 = aVar.f151357n;
                        if (canvas2 == null) {
                            canvas2 = new Canvas(bitmap);
                            aVar.f151357n = canvas2;
                            aVar.f151366w = true;
                        } else {
                            canvas2.setBitmap(bitmap);
                        }
                        bitmap.eraseColor(0);
                        aVar.f151366w = false;
                        bVar2.mo75305a(aVar).mo75812c(canvas2, aVar, bVar2, (float) C54479b.m61196c().f152758e, (float) C54479b.m61196c().f152757d);
                    }
                } else {
                    bitmap = aVar.f151356m;
                }
                if (bitmap == null) {
                    z = false;
                } else {
                    int save = canvas.save();
                    bVar.f153794a.set(0, 0, (int) aVar.f151351h, (int) aVar.f151352i);
                    bVar.f153795b.set((int) aVar.mo74712d(), (int) aVar.mo74719i(), (int) aVar.mo74715f(), (int) aVar.mo74710b());
                    canvas.drawBitmap(bitmap, bVar.f153794a, bVar.f153795b, bVar.f153797d);
                    canvas.restoreToCount(save);
                    z = true;
                }
                if (!z) {
                    C54486i.f152753q = false;
                }
            }
            int save2 = canvas.save();
            a.mo75812c(canvas, aVar, bVar2, aVar.mo74712d() + ((float) C54479b.m61196c().f152758e), aVar.mo74719i() + ((float) C54479b.m61196c().f152757d));
            canvas.restoreToCount(save2);
        }
        float f = aVar.mo74715f();
        if (!aVar.f151362s && f <= ((float) aVar.mo74716g())) {
            C58614e.m68067d("BaseDanmaku", "onFirstExposure, danmaku = " + aVar.toString());
            C54479b bVar4 = aVar.f151344a;
            if (!(bVar4 == null || (dVar = bVar4.f152743d) == null)) {
                dVar.mo75308a(aVar);
            }
            aVar.f151362s = true;
        }
        aVar.mo74712d();
    }

    /* renamed from: d */
    public void mo90810d(C54053a aVar) {
        aVar.f151366w = true;
        aVar.f151365v = true;
        float f = aVar.f151351h;
        C66851m.m78951b(this.f191962e, aVar);
        float g = (aVar.f151351h + ((float) aVar.mo74716g())) / (f + ((float) aVar.mo74716g()));
        C58301e eVar = aVar.f151347d;
        eVar.f166939a = (long) (((float) eVar.f166939a) * g);
    }

    /* renamed from: e */
    public abstract C54053a mo90811e(C58306h hVar);

    /* renamed from: f */
    public abstract void mo90812f();
}
