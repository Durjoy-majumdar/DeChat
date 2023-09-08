package com.tencent.p014mm.plugin.vlog.model;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import c30.C104289g;
import ci2.C104380d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tav.codec.DefaultMediaFactory;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.decoder.IEncoderFactory;
import di3.C86312j;
import ff3.C107537a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p206nj.C11171e;
import p232rw.C63679m;
import rx3.C13598b0;
import rx3.C13604l;
import sp3.C110794b;
import sp3.C110801c;
import sp3.C110807k;
import sp3.C64145m;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90364q0;
import tp3.C111047a;
import y13.C112374d;
import yp3.C112478a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.vlog.model.p0 */
public final class C96552p0 implements C57467x {

    /* renamed from: a */
    public C110807k f282568a;

    /* renamed from: b */
    public EffectManager f282569b;

    /* renamed from: c */
    public ArrayList<C106205q0> f282570c;

    /* renamed from: d */
    public final Rect f282571d;

    /* renamed from: e */
    public long f282572e;

    /* renamed from: f */
    public boolean f282573f;

    /* renamed from: g */
    public boolean f282574g;

    /* renamed from: h */
    public String f282575h;

    /* renamed from: i */
    public volatile boolean f282576i;

    /* renamed from: j */
    public int f282577j;

    /* renamed from: k */
    public int f282578k;

    /* renamed from: l */
    public int f282579l;

    /* renamed from: m */
    public int f282580m;

    /* renamed from: n */
    public Bitmap f282581n;

    public C96552p0(List<C106205q0> list) {
        int i;
        C87412m.m108594g(list, "trackList");
        this.f282568a = new C110807k();
        this.f282570c = new ArrayList<>();
        this.f282571d = new Rect();
        this.f282573f = true;
        this.f282575h = "";
        this.f282577j = 30;
        this.f282578k = -1;
        this.f282579l = 44100;
        this.f282580m = 1;
        this.f282570c.clear();
        this.f282570c.addAll(list);
        C110807k kVar = this.f282568a;
        ArrayList<C106205q0> arrayList = this.f282570c;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C106205q0 q0Var : arrayList) {
            arrayList2.add(q0Var.f316501l);
        }
        kVar.getClass();
        kVar.f331511l.clear();
        kVar.f331511l.addAll(arrayList2);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multivideo_edit_preview_high_fps_enable, 1) == 1) {
            ArrayList<C106205q0> arrayList3 = this.f282570c;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it = arrayList3.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if ((((C106205q0) next).f316491b == 2 ? 1 : i) != 0) {
                    arrayList4.add(next);
                }
            }
            ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                C63679m.C63680a c = MultiMediaVideoChecker.f273077a.mo129931c(((C106205q0) it4.next()).f316490a, true);
                arrayList5.add(Integer.valueOf(c != null ? (int) c.f180527c : 0));
            }
            Integer num = (Integer) C110818d0.m150927Y(arrayList5);
            i = num != null ? num.intValue() : i;
            Log.m105924i("MicroMsg.VLogComposition", "selectMaxFpsFromTrackList maxFps:" + i);
            this.f282578k = i;
        }
        this.f282568a.mo162382d(this.f282573f);
    }

    /* renamed from: a */
    public void mo81182a(long j, long j2) {
        Log.m105924i("MicroMsg.VLogComposition", "setPlayRange:[" + j + ", " + j2 + ']');
        this.f282568a.mo162393p(j, j2);
    }

    /* renamed from: b */
    public void mo81183b(Rect rect) {
        C87412m.m108594g(rect, "rect");
        this.f282571d.set(rect);
        this.f282568a.mo162392o(this.f282571d);
    }

    /* renamed from: c */
    public void mo81184c(int i, int i2) {
        Log.m105924i("MicroMsg.VLogComposition", "setRenderSize: " + i + ", " + i2);
        this.f282568a.mo162391n(i, i2);
    }

    /* renamed from: d */
    public void mo81185d(boolean z) {
        Log.m105924i("MicroMsg.VLogComposition", "enableVideoSound:" + z);
        this.f282573f = z;
        this.f282568a.mo162382d(z);
    }

    /* renamed from: e */
    public final void mo134608e(String str, boolean z) {
        C87412m.m108594g(str, "musicPath");
        this.f282574g = !Util.isNullOrNil(str);
        this.f282575h = str;
        String i = C86013q1.m106448i(str, false);
        if (i == null) {
            i = "";
        }
        C63679m.C63680a a = MultiMediaVideoChecker.f273077a.mo129929a(i);
        long j = a != null ? a.f180528d : 0;
        if (!z || j == 0) {
            C110801c cVar = new C110801c(i, 3);
            cVar.mo162366d(mo134615l());
            cVar.mo162365c(this.f282568a.mo162389l() - 0);
            cVar.mo162368f(0);
            cVar.mo162367e(cVar.f331465c);
            C110807k kVar = this.f282568a;
            kVar.getClass();
            kVar.f331511l.add(cVar);
        } else {
            long l = mo134615l();
            while (l <= mo134613j()) {
                C110801c cVar2 = new C110801c(i, 3);
                cVar2.mo162366d(l);
                cVar2.mo162365c(cVar2.f331470h + l);
                C110807k kVar2 = this.f282568a;
                kVar2.getClass();
                kVar2.f331511l.add(cVar2);
                l += cVar2.f331470h;
            }
        }
        Log.m105924i("MicroMsg.VLogComposition", "addCompositionMusic musicPath:" + str + ", fillUp:" + z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo134609f(int r7, int r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "try enable hdr lut, colorStandard = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", colorTransfer = "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VLogComposition"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 6
            if (r8 != r0) goto L_0x002b
            com.tencent.mm.plugin.vlog.model.n0 r1 = new com.tencent.mm.plugin.vlog.model.n0
            r1.<init>()
            com.tencent.tav.extractor.ExtractorDelegateFactory.setExtractorDelegateCreator(r1)
            goto L_0x0033
        L_0x002b:
            com.tencent.mm.plugin.vlog.model.o0 r1 = new com.tencent.mm.plugin.vlog.model.o0
            r1.<init>()
            com.tencent.tav.extractor.ExtractorDelegateFactory.setExtractorDelegateCreator(r1)
        L_0x0033:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r1 == 0) goto L_0x008c
            r2 = 0
            if (r7 != r0) goto L_0x0057
            if (r8 != r0) goto L_0x0057
            android.content.res.AssetManager r7 = r1.getAssets()     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.lang.String r8 = "HDR_lut/HDR10.png"
            java.io.InputStream r7 = r7.open(r8)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ Exception -> 0x0050 }
        L_0x004c:
            r5 = r2
            r2 = r7
            r7 = r5
            goto L_0x0084
        L_0x0050:
            r8 = move-exception
            goto L_0x006b
        L_0x0052:
            r8 = move-exception
            goto L_0x007f
        L_0x0054:
            r8 = move-exception
            r7 = r2
            goto L_0x006b
        L_0x0057:
            if (r7 != r0) goto L_0x0083
            r7 = 7
            if (r8 != r7) goto L_0x0083
            android.content.res.AssetManager r7 = r1.getAssets()     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.lang.String r8 = "HDR_lut/HLG.png"
            java.io.InputStream r7 = r7.open(r8)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ Exception -> 0x0050 }
            goto L_0x004c
        L_0x006b:
            java.lang.String r0 = "MicroMsg.CompositionExporter"
            java.lang.String r1 = "open lut fail"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x007d }
            r4 = 0
            r3[r4] = r8     // Catch:{ all -> 0x007d }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r3)     // Catch:{ all -> 0x007d }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            goto L_0x0088
        L_0x007d:
            r8 = move-exception
            r2 = r7
        L_0x007f:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r2)
            throw r8
        L_0x0083:
            r7 = r2
        L_0x0084:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r2)
            r2 = r7
        L_0x0088:
            sp3.k r7 = r6.f282568a
            r7.f331513n = r2
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C96552p0.mo134609f(int, int):void");
    }

    /* renamed from: g */
    public final void mo134610g(C110807k.C101693a aVar) {
        C87412m.m108594g(aVar, "config");
        mo134609f(aVar.f297718b, aVar.f297719c);
        if (C11171e.m11046c(24) && this.f282568a.f331513n != null) {
            aVar.f297718b = 1;
            aVar.f297719c = 3;
        }
    }

    public long getDurationMs() {
        return this.f282568a.mo162384g();
    }

    /* renamed from: h */
    public final C110807k mo134611h() {
        int i;
        int i2;
        Class cls = C32735h.class;
        Iterator<C106205q0> it = this.f282570c.iterator();
        while (it.hasNext()) {
            C106205q0 next = it.next();
            C104380d dVar = next.f316494e;
            C110801c cVar = next.f316501l;
            dVar.mo146050d(cVar.f331478p, cVar.f331479q);
        }
        long k = this.f282568a.mo162388k();
        if (this.f282572e > 0) {
            long j = this.f282572e;
            if (this.f282568a.mo162386i() - k > j) {
                this.f282568a.mo162393p(k, j + k);
            }
        }
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multivideo_edit_preview_high_fps_enable, 1) == 1 && (i = this.f282577j) > 0 && (i2 = this.f282578k) > 0) {
            C110807k kVar = this.f282568a;
            float min = (float) Math.min(i, i2);
            if (min > ((float) 0)) {
                kVar.f331505f = min;
            } else {
                kVar.getClass();
            }
        }
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_use_audio_resampler, 1) == 1) {
            this.f282568a.f331510k = new C111047a(new C107537a(this.f282579l, this.f282580m));
        }
        this.f282568a.f331516q = new DefaultMediaFactory((IEncoderFactory) null, new C112374d(false, false, 3, (C8480h) null));
        return this.f282568a;
    }

    /* renamed from: i */
    public final C13604l<Long, Long> mo134612i() {
        return new C13604l<>(Long.valueOf(this.f282568a.f331500a), Long.valueOf(this.f282568a.f331501b));
    }

    /* renamed from: j */
    public final long mo134613j() {
        return this.f282568a.mo162386i();
    }

    /* renamed from: k */
    public final CMTimeRange mo134614k() {
        return this.f282568a.mo162387j();
    }

    /* renamed from: l */
    public final long mo134615l() {
        return this.f282568a.mo162388k();
    }

    /* renamed from: m */
    public final long mo134616m() {
        return this.f282568a.mo162389l() - 0;
    }

    /* renamed from: n */
    public final void mo134617n(int i, C32226l<? super Bitmap, C13598b0> lVar) {
        int i2;
        float f;
        C87412m.m108594g(lVar, "callback");
        C110807k kVar = this.f282568a;
        kVar.getClass();
        C110794b b = C110794b.f331445i.mo162359b(kVar);
        if (!kVar.f331506g.isEmpty()) {
            f = ((float) kVar.f331506g.height()) * 1.0f;
            i2 = kVar.f331506g.width();
        } else {
            f = ((float) kVar.f331504e) * 1.0f;
            i2 = kVar.f331503d;
        }
        int i3 = (int) ((f / ((float) i2)) * ((float) i));
        b.mo58663C(i, i3);
        C112478a.m153625c("VideoComposition", "getThumbBitmap request width:" + i + ", height:" + i3, new Object[0]);
        b.mo58665b(C26236u.m33719b(Long.valueOf(kVar.mo162388k())), new C64145m(lVar));
    }

    /* renamed from: o */
    public final List<C106205q0> mo134618o() {
        ArrayList<C106205q0> arrayList = this.f282570c;
        ArrayList arrayList2 = new ArrayList();
        for (T next : arrayList) {
            int i = ((C106205q0) next).f316491b;
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* renamed from: p */
    public final List<C106205q0> mo134619p() {
        return this.f282570c;
    }

    /* renamed from: q */
    public final String mo134620q() {
        int i;
        if (this.f282570c.isEmpty()) {
            return "";
        }
        ArrayList<C106205q0> arrayList = this.f282570c;
        ArrayList<Number> arrayList2 = new ArrayList<>(C36907w.m41090l(arrayList, 10));
        for (C106205q0 q0Var : arrayList) {
            arrayList2.add(Float.valueOf(q0Var.f316501l.f331468f));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Number floatValue : arrayList2) {
                if ((!(floatValue.floatValue() == 1.0f)) && (i = i + 1) < 0) {
                    C64197v.m75541j();
                    throw null;
                }
            }
        }
        String gVar = new C104289g(C90364q0.m113147f(new C13604l("usePlayRateTrackCount", Integer.valueOf(i)), new C13604l("playRateStatus", C110818d0.m150921S(arrayList2, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null)))).toString();
        C87412m.m108593f(gVar, "JSONObject(info).toString()");
        return C112551y.m153814n(gVar, ",", ";", false);
    }

    /* renamed from: r */
    public final String mo134621r() {
        int i;
        int i2;
        if (this.f282570c.isEmpty()) {
            return "";
        }
        ArrayList<C106205q0> arrayList = this.f282570c;
        List<T> t0 = C110818d0.m150948t0(arrayList, arrayList.size() - 1);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(t0, 10));
        for (T t : t0) {
            arrayList2.add(C96551o.m123872b(t.f316501l.f331477o.f331493a));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = arrayList2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((String) it.next()).length() > 0) && (i = i + 1) < 0) {
                    C64197v.m75541j();
                    throw null;
                }
            }
        }
        Set D0 = C110818d0.m150904D0(arrayList2);
        if (D0.size() == 1) {
            if (((CharSequence) C110818d0.m150913K(D0)).length() > 0) {
                i2 = 1;
                String gVar = new C104289g(C90364q0.m113147f(new C13604l("transCount", Integer.valueOf(i)), new C13604l("isApplyToAll", Integer.valueOf(i2)), new C13604l("transStatus", C110818d0.m150921S(arrayList2, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null)))).toString();
                C87412m.m108593f(gVar, "JSONObject(info).toString()");
                return C112551y.m153814n(gVar, ",", ";", false);
            }
        }
        i2 = 0;
        String gVar2 = new C104289g(C90364q0.m113147f(new C13604l("transCount", Integer.valueOf(i)), new C13604l("isApplyToAll", Integer.valueOf(i2)), new C13604l("transStatus", C110818d0.m150921S(arrayList2, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null)))).toString();
        C87412m.m108593f(gVar2, "JSONObject(info).toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: s */
    public final void mo134622s(C32226l<? super Long, Bitmap> lVar) {
        C87412m.m108594g(lVar, "blendBitmapProvider");
        this.f282568a.mo162380a(new C106194e(lVar, this.f282569b));
    }

    /* renamed from: t */
    public final void mo134623t(EffectManager effectManager) {
        this.f282569b = effectManager;
        this.f282568a.f331507h = effectManager;
    }

    /* renamed from: u */
    public final void mo134624u(String str, float f) {
        C87412m.m108594g(str, "path");
    }

    /* renamed from: v */
    public final void mo134625v(long j) {
        this.f282572e = j;
        long k = this.f282568a.mo162388k();
        if (this.f282572e > 0) {
            long j2 = this.f282572e;
            if (this.f282568a.mo162386i() - k > j2) {
                this.f282568a.mo162393p(k, j2 + k);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C96552p0(C96552p0 p0Var) {
        this((List<C106205q0>) p0Var.f282570c);
        C87412m.m108594g(p0Var, FirebaseAnalytics.C113379b.ORIGIN);
        C110807k h = p0Var.mo134611h();
        h.getClass();
        Size size = new Size(h.f331503d, h.f331504e);
        mo81184c(size.getWidth(), size.getHeight());
        mo81182a(p0Var.mo134615l(), p0Var.mo134613j());
        this.f282571d.set(p0Var.f282571d);
        this.f282576i = p0Var.f282576i;
        Bitmap bitmap = p0Var.f282581n;
        this.f282581n = bitmap;
        this.f282568a.f331513n = bitmap;
    }
}
