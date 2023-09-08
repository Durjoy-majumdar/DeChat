package com.tencent.p014mm.xeffect.effect;

import android.content.res.AssetManager;
import com.tencent.p014mm.xeffect.XEffectLog;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import qr3.C36070f;
import rr3.C110620a;
import rr3.C110622b;
import rr3.C110624c;
import rr3.C110625c0;
import rr3.C110626d;
import rr3.C110627d0;
import rr3.C110628e;
import rr3.C110632i;
import rr3.C110633j;
import rr3.C110634k;
import rr3.C110635l;
import rr3.C110636m;
import rr3.C110640o;
import rr3.C110641p;
import rr3.C110643s;
import rr3.C110644t;
import rr3.C110645u;
import rr3.C110646v;
import rr3.C110647w;
import rr3.C110648x;
import rr3.C110650z;
import rx3.C110660q;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eJ\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H J)\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H J)\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H J\t\u0010\u0012\u001a\u00020\u0002H J\u0019\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H J\u0019\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H J\u0011\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H J\u0019\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH J\u0011\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H ¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/effect/EffectManager;", "", "", "ptr", "", "type", "nCreateEffect", "", "path", "nCreateEffectPath", "", "bytes", "length", "nCreateEffectBinary", "Landroid/content/res/AssetManager;", "asset", "assetPath", "nCreateEffectAsset", "nInit", "effectPtr", "nAddEffect", "effectId", "Lrx3/b0;", "nBringToFront", "nRemoveEffect", "nProfileData", "Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "factory", "nSetDecoderFactory", "nDestroy", "a", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.effect.EffectManager */
public final class EffectManager {

    /* renamed from: c */
    public static final String f319987c = f319987c;

    /* renamed from: d */
    public static final C106870a f319988d = new C106870a();

    /* renamed from: a */
    public long f319989a;

    /* renamed from: b */
    public final LinkedList<C110625c0> f319990b = new LinkedList<>();

    /* renamed from: com.tencent.mm.xeffect.effect.EffectManager$a */
    public static final class C106870a {
        /* renamed from: a */
        public static final C110625c0 m144564a(C106870a aVar, long j, C110632i iVar) {
            aVar.getClass();
            String str = EffectManager.f319987c;
            XEffectLog.f319986a.mo143272i(str, "create effect ptr:" + j + ", type:" + iVar, new Object[0]);
            switch (iVar.ordinal()) {
                case 0:
                    return new C110647w(j);
                case 1:
                    return new C110644t(j);
                case 2:
                    return new C110646v(j);
                case 3:
                    return new C110645u(j);
                case 4:
                    return new C110643s(j);
                case 5:
                    return new C110640o(j);
                case 6:
                    return new C110624c(j);
                case 7:
                    return new C110626d(j);
                case 8:
                    return new C110648x(j);
                case 9:
                    return new C110635l(j);
                case 10:
                    return new C110627d0(j);
                case 11:
                    return new C110636m(j);
                case 12:
                    return new C110634k(j);
                case 13:
                    return new C110633j(j);
                case 14:
                    return new C110622b(j);
                case 15:
                    return new C110650z(j);
                case 16:
                    return new C110620a(j);
                case 17:
                    return new C110641p(j);
                default:
                    return null;
            }
        }
    }

    static {
        C36070f.m40901a("xlabeffect");
        C36070f.m40901a("pag");
        C110628e eVar = new C110628e();
        if (C36070f.f96151a) {
            nSetDefaultFactory(new StickerDecoderFactoryWrapper(eVar));
        }
    }

    public EffectManager() {
        boolean z = C36070f.f96151a;
        this.f319989a = C36070f.f96151a ? nInit() : 0;
    }

    private final native long nAddEffect(long j, long j2);

    private final native void nBringToFront(long j, long j2);

    private final native long nCreateEffect(long j, int i);

    private final native long nCreateEffectAsset(long j, int i, AssetManager assetManager, String str);

    private final native long nCreateEffectBinary(long j, int i, byte[] bArr, long j2);

    private final native long nCreateEffectPath(long j, int i, String str);

    private final native void nDestroy(long j);

    private final native long nInit();

    private final native long nProfileData(long j);

    private final native void nRemoveEffect(long j, long j2);

    private final native void nSetDecoderFactory(long j, IStickerDecoderFactory iStickerDecoderFactory);

    /* access modifiers changed from: private */
    public static final native void nSetDefaultFactory(IStickerDecoderFactory iStickerDecoderFactory);

    /* renamed from: b */
    public final C110622b mo154922b() {
        C110625c0 g = mo154927g(C110632i.BlurEffect);
        if (g != null) {
            C110622b bVar = (C110622b) g;
            mo154923c(bVar);
            return bVar;
        }
        throw new C110660q("null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
    }

    /* renamed from: c */
    public final C110625c0 mo154923c(C110625c0 c0Var) {
        if (c0Var != null) {
            long j = this.f319989a;
            if (j != 0) {
                long nAddEffect = nAddEffect(j, c0Var.f330969c);
                c0Var.f330967a = nAddEffect;
                String str = f319987c;
                XEffectLog.f319986a.mo143272i(str, "addEffect ptr:" + c0Var.f330969c + ", effectId:" + nAddEffect, new Object[0]);
                synchronized (this.f319990b) {
                    this.f319990b.add(c0Var);
                }
            }
        }
        return c0Var;
    }

    /* renamed from: d */
    public final C110634k mo154924d() {
        C110625c0 g = mo154927g(C110632i.GradientBlurEffect);
        if (g != null) {
            C110634k kVar = (C110634k) g;
            kVar.mo162191d(20.0f);
            mo154923c(kVar);
            return kVar;
        }
        throw new C110660q("null cannot be cast to non-null type com.tencent.mm.xeffect.effect.GradientBlurEffect");
    }

    /* renamed from: e */
    public final void mo154925e(long j) {
        if (this.f319989a != 0) {
            synchronized (this.f319990b) {
                Iterator<C110625c0> it = this.f319990b.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it.next().f330967a == j) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    C110625c0 remove = this.f319990b.remove(i);
                    C87412m.m108590c(remove, "effectList.removeAt(index)");
                    this.f319990b.add(remove);
                }
                nBringToFront(this.f319989a, j);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: f */
    public final void mo154926f() {
        if (this.f319989a != 0) {
            synchronized (this.f319990b) {
                for (C110625c0 c0Var : this.f319990b) {
                    nRemoveEffect(this.f319989a, c0Var.f330967a);
                    c0Var.f330967a = 0;
                }
                this.f319990b.clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: g */
    public final C110625c0 mo154927g(C110632i iVar) {
        C87412m.m108595h(iVar, "type");
        long j = this.f319989a;
        if (j == 0) {
            return C106870a.m144564a(f319988d, 0, iVar);
        }
        return C106870a.m144564a(f319988d, nCreateEffect(j, iVar.ordinal()), iVar);
    }

    /* renamed from: h */
    public final C110625c0 mo154928h(C110632i iVar, AssetManager assetManager, String str) {
        C87412m.m108595h(iVar, "type");
        C87412m.m108595h(assetManager, "asset");
        C87412m.m108595h(str, "assetPath");
        long j = this.f319989a;
        if (j == 0) {
            return C106870a.m144564a(f319988d, 0, iVar);
        }
        return C106870a.m144564a(f319988d, nCreateEffectAsset(j, iVar.ordinal(), assetManager, str), iVar);
    }

    /* renamed from: i */
    public final C110625c0 mo154929i(C110632i iVar, String str) {
        C87412m.m108595h(iVar, "type");
        C87412m.m108595h(str, "path");
        long j = this.f319989a;
        if (j == 0) {
            return C106870a.m144564a(f319988d, 0, iVar);
        }
        return C106870a.m144564a(f319988d, nCreateEffectPath(j, iVar.ordinal(), str), iVar);
    }

    /* renamed from: j */
    public final C110625c0 mo154930j(C110632i iVar, byte[] bArr) {
        C87412m.m108595h(iVar, "type");
        C87412m.m108595h(bArr, ByteRange.BYTES_UNIT);
        long j = this.f319989a;
        if (j == 0) {
            return C106870a.m144564a(f319988d, 0, iVar);
        }
        long nCreateEffectBinary = nCreateEffectBinary(j, iVar.ordinal(), bArr, (long) bArr.length);
        C110625c0 a = C106870a.m144564a(f319988d, nCreateEffectBinary, iVar);
        String str = f319987c;
        XEffectLog.f319986a.mo143272i(str, "create effect binary ptr:" + nCreateEffectBinary + ", type:" + iVar + ", " + bArr.length, new Object[0]);
        return a;
    }

    /* renamed from: k */
    public final void mo154931k() {
        mo154926f();
        long j = this.f319989a;
        if (j != 0) {
            nDestroy(j);
        }
    }

    /* renamed from: l */
    public final C110625c0 mo154932l(long j) {
        T t;
        boolean z;
        Iterator<T> it = this.f319990b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C110625c0) t).f330967a == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C110625c0) t;
    }

    /* renamed from: m */
    public final EffectProfileData mo154933m() {
        long j = this.f319989a;
        return j == 0 ? new EffectProfileData(0) : new EffectProfileData(nProfileData(j));
    }

    /* renamed from: n */
    public final void mo154934n(long j) {
        if (this.f319989a != 0) {
            synchronized (this.f319990b) {
                Iterator<C110625c0> it = this.f319990b.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it.next().f330967a == j) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    String str = f319987c;
                    XEffectLog.f319986a.mo143272i(str, "removeEffect ptr:" + this.f319990b.get(i).f330969c + ", effectId:" + j, new Object[0]);
                    this.f319990b.get(i).f330967a = 0;
                    this.f319990b.remove(i);
                }
                nRemoveEffect(this.f319989a, j);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: o */
    public final void mo154935o(C110625c0 c0Var) {
        if (this.f319989a != 0 && c0Var != null) {
            synchronized (this.f319990b) {
                this.f319990b.remove(c0Var);
                nRemoveEffect(this.f319989a, c0Var.f330967a);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: p */
    public final void mo154936p(C110632i iVar) {
        C87412m.m108595h(iVar, "type");
        synchronized (this.f319990b) {
            LinkedList<C110625c0> linkedList = this.f319990b;
            ArrayList<C110625c0> arrayList = new ArrayList<>();
            for (T next : linkedList) {
                if (((C110625c0) next).mo162185c() == iVar) {
                    arrayList.add(next);
                }
            }
            for (C110625c0 o : arrayList) {
                mo154935o(o);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: q */
    public final void mo154937q(IStickerDecoderFactory iStickerDecoderFactory) {
        C87412m.m108595h(iStickerDecoderFactory, "factory");
        long j = this.f319989a;
        if (j != 0) {
            nSetDecoderFactory(j, new StickerDecoderFactoryWrapper(iStickerDecoderFactory));
        }
    }

    public EffectManager(long j, C8480h hVar) {
        this.f319989a = j;
    }
}
