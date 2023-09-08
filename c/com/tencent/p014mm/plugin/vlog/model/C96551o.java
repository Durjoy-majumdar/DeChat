package com.tencent.p014mm.plugin.vlog.model;

import ai2.C103372h;
import ai2.C92010c;
import ai2.C92011d;
import ai2.C92012f;
import ai2.C92019m;
import ai2.C92020n;
import ai2.C92023q;
import ai2.C92024r;
import ai2.C92025s;
import ai2.C92026t;
import ai2.C92027u;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import bi2.C92264c;
import bi2.C92265d;
import bi2.C92266e;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d23.C106976a;
import ei2.C31606c;
import ei2.C97651f;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import n23.C109676b;
import pe3.C89349b;
import rr3.C110625c0;
import rr3.C110629f;
import rr3.C110630g;
import rr3.C110632i;
import rr3.C110636m;
import rr3.C110638n;
import rr3.C110642r;
import rr3.C110645u;
import rr3.C110646v;
import rr3.C110650z;
import sp3.C110801c;
import sp3.C110805h;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C101758az;
import te3.C101769d70;
import te3.C49195dv2;
import te3.C49389f70;
import te3.C49524g70;
import te3.C64270bz;
import te3.C64339ea;
import te3.C64346ep3;
import te3.C64536lu2;
import te3.C64543m10;
import te3.C64573n93;
import te3.C64899zy;
import te3.hi4;
import te3.lb4;
import te3.rr4;
import te3.tj4;
import z04.C112551y;
import zg2.C103020m;

/* renamed from: com.tencent.mm.plugin.vlog.model.o */
public final class C96551o {

    /* renamed from: a */
    public static final List<lb4> f282567a = new ArrayList();

    /* renamed from: a */
    public static final C64899zy m123871a(C96552p0 p0Var, C101758az azVar) {
        C87412m.m108594g(p0Var, "composition");
        C87412m.m108594g(azVar, "outputConfig");
        C64899zy zyVar = new C64899zy();
        long j = (long) 1000;
        zyVar.f186900e = p0Var.mo134614k().getStartUs() / j;
        zyVar.f186901f = p0Var.mo134614k().getEndUs() / j;
        LinkedList<hi4> linkedList = zyVar.f186899d;
        ArrayList<C106205q0> arrayList = p0Var.f282570c;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator<C106205q0> it = arrayList.iterator();
        while (it.hasNext()) {
            C106205q0 next = it.next();
            hi4 hi4 = new hi4();
            C87412m.m108594g(next, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
            hi4.f183504d = next.f316490a;
            hi4.f183505e = next.f316491b;
            C110801c cVar = next.f316501l;
            hi4.f183506f = cVar.f331464b;
            hi4.f183507g = cVar.f331465c;
            hi4.f183508h = cVar.f331466d;
            hi4.f183509i = cVar.f331467e;
            hi4.f183510j = cVar.f331470h;
            hi4.f183511n = next.f316495f;
            hi4.f183512o = next.f316496g;
            hi4.f183513p = next.f316497h;
            hi4.f183514q = cVar.f331469g;
            C64543m10 m102 = new C64543m10();
            hi4.f183515r = m102;
            m102.f184195d = new C49195dv2();
            m102.f184198g = new C64346ep3();
            m102.f184196e = new C64346ep3();
            m102.f184197f = new C64346ep3();
            m102.f184199h = new C64346ep3();
            Matrix matrix = next.f316498i.f316483a;
            C49195dv2 dv22 = m102.f184195d;
            C87412m.m108593f(dv22, "proto.matrix");
            C87412m.m108594g(matrix, "matrix");
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            dv22.f132546d.clear();
            for (int i = 0; i < 9; i++) {
                dv22.f132546d.add(Float.valueOf(fArr[i]));
            }
            Rect rect = next.f316498i.f316486d;
            C64346ep3 ep32 = m102.f184198g;
            C87412m.m108593f(ep32, "proto.contentRect");
            m123877g(rect, ep32);
            Rect rect2 = next.f316498i.f316484b;
            C64346ep3 ep33 = m102.f184196e;
            C87412m.m108593f(ep33, "proto.cropRect");
            m123877g(rect2, ep33);
            Rect rect3 = next.f316498i.f316485c;
            C64346ep3 ep34 = m102.f184197f;
            C87412m.m108593f(ep34, "proto.viewRect");
            m123877g(rect3, ep34);
            Rect rect4 = next.f316501l.f331475m;
            C64346ep3 ep35 = m102.f184199h;
            C87412m.m108593f(ep35, "proto.trackCropRect");
            m123877g(rect4, ep35);
            tj4 tj4 = new tj4();
            hi4.f183517t = tj4;
            C110805h hVar = next.f316501l.f331477o;
            C87412m.m108594g(hVar, "transition");
            tj4.f142248d = hVar.f331493a;
            tj4.f142250f = hVar.f331495c;
            hi4.f183516s = next.f316492c;
            arrayList2.add(hi4);
        }
        linkedList.addAll(arrayList2);
        zyVar.f186902g = p0Var.f282573f;
        zyVar.f186905j = true;
        zyVar.f186904i = azVar;
        zyVar.f186903h = p0Var.f282575h;
        zyVar.f186909q = p0Var.f282576i;
        zyVar.f186910r = new LinkedList<>();
        for (Map.Entry next2 : C106976a.f320219l.entrySet()) {
            C64270bz bzVar = new C64270bz();
            bzVar.f182337d = (String) next2.getKey();
            Object obj = ((Pair) next2.getValue()).first;
            C87412m.m108593f(obj, "it.value.first");
            bzVar.f182338e = ((Number) obj).intValue();
            Object obj2 = ((Pair) next2.getValue()).second;
            C87412m.m108593f(obj2, "it.value.second");
            bzVar.f182339f = ((Number) obj2).longValue();
            zyVar.f186910r.add(bzVar);
        }
        return zyVar;
    }

    /* renamed from: b */
    public static final String m123872b(String str) {
        C87412m.m108594g(str, "<this>");
        int i = -1;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (str.charAt(length) == '/') {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        String substring = str.substring(i + 1);
        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final C106205q0 m123873c(C96552p0 p0Var, long j) {
        T t;
        boolean z;
        C87412m.m108594g(p0Var, "<this>");
        Iterator<T> it = p0Var.f282570c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C110801c cVar = ((C106205q0) t).f316501l;
            if (cVar.f331464b > j || cVar.f331465c <= j) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C106205q0) t;
    }

    /* renamed from: d */
    public static final C96552p0 m123874d(C64899zy zyVar, EffectManager effectManager) {
        boolean z;
        int i;
        int i2;
        C110650z zVar;
        C110625c0 c0Var;
        C110625c0 c0Var2;
        C110625c0 c0Var3;
        Size size;
        C110625c0 c0Var4;
        int i3;
        C110625c0 c0Var5;
        C64899zy zyVar2 = zyVar;
        EffectManager effectManager2 = effectManager;
        C87412m.m108594g(zyVar2, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(effectManager2, "effectMgr");
        LinkedList linkedList = new LinkedList();
        LinkedList<hi4> linkedList2 = zyVar2.f186899d;
        C87412m.m108593f(linkedList2, "proto.tracks");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        Iterator<T> it = linkedList2.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            hi4 hi4 = (hi4) it.next();
            String str = hi4.f183504d;
            C87412m.m108593f(str, "it.path");
            C106205q0 q0Var = new C106205q0(str, hi4.f183505e, 0);
            q0Var.mo81191e(hi4.f183506f);
            q0Var.mo81187a(hi4.f183507g);
            q0Var.mo81190d(hi4.f183508h);
            q0Var.mo81188b(hi4.f183509i);
            q0Var.f316495f = hi4.f183511n;
            q0Var.f316496g = hi4.f183512o;
            q0Var.f316497h = hi4.f183513p;
            q0Var.f316501l.mo162369g(hi4.f183514q);
            m123876f(hi4.f183515r.f184196e, q0Var.f316501l.f331474l);
            m123876f(hi4.f183515r.f184199h, q0Var.f316501l.f331475m);
            tj4 tj4 = hi4.f183517t;
            if (tj4 != null) {
                C110805h hVar = q0Var.f316501l.f331477o;
                C87412m.m108594g(hVar, "transition");
                String str2 = tj4.f142248d;
                C87412m.m108593f(str2, "proto.path");
                hVar.f331493a = str2;
                hVar.f331495c = tj4.f142250f;
            }
            arrayList.add(q0Var);
        }
        linkedList.addAll(arrayList);
        C96552p0 p0Var = new C96552p0((List<C106205q0>) linkedList);
        C101758az azVar = zyVar2.f186904i;
        if (azVar.f297914y != null) {
            Rect rect = new Rect();
            m123876f(zyVar2.f186904i.f297914y, rect);
            i = rect.width();
            i2 = rect.height();
        } else {
            i = azVar.f297897e;
            i2 = azVar.f297898f;
        }
        p0Var.mo134611h().mo162391n(i, i2);
        p0Var.mo81182a(zyVar2.f186900e, zyVar2.f186901f);
        if (!Util.isNullOrNil(zyVar2.f186903h)) {
            String str3 = zyVar2.f186903h;
            C87412m.m108593f(str3, "proto.musicPath");
            p0Var.mo134608e(str3, true);
        }
        p0Var.mo81185d(zyVar2.f186902g);
        if (zyVar2.f186904i.f297899g != null) {
            Rect rect2 = new Rect();
            m123876f(zyVar2.f186904i.f297899g, rect2);
            p0Var.mo81183b(rect2);
        } else {
            Rect rect3 = new Rect();
            C101758az azVar2 = zyVar2.f186904i;
            C64573n93 n932 = azVar2.f297915z;
            if (n932 != null) {
                m123876f(n932.f184446d, rect3);
            } else {
                m123876f(azVar2.f297894A.f184446d, rect3);
            }
            p0Var.mo81183b(rect3);
        }
        C110632i iVar = C110632i.PAGTransitionEffect;
        Iterator<C106205q0> it4 = p0Var.f282570c.iterator();
        while (true) {
            zVar = null;
            if (!it4.hasNext()) {
                break;
            }
            C106205q0 next = it4.next();
            if (next.f316501l.f331477o.mo162376b()) {
                if (C112551y.m153820t(next.f316501l.f331477o.f331493a, "assets://", false, 2, (Object) null)) {
                    AssetManager assets = MMApplicationContext.getContext().getAssets();
                    C87412m.m108593f(assets, "getContext().assets");
                    c0Var5 = effectManager2.mo154928h(iVar, assets, next.f316501l.f331477o.f331493a);
                } else {
                    c0Var5 = effectManager2.mo154929i(iVar, next.f316501l.f331477o.f331493a);
                }
                next.f316501l.f331477o.f331494b = c0Var5;
                effectManager2.mo154923c(c0Var5);
            }
        }
        p0Var.mo134623t(effectManager2);
        C110632i iVar2 = C110632i.StickerEffect;
        LinkedList<lb4> linkedList3 = zyVar2.f186913u;
        C87412m.m108593f(linkedList3, "proto.stickerEffectList");
        Iterator it5 = ((ArrayList) C110818d0.m150933e0(linkedList3, f282567a)).iterator();
        while (it5.hasNext()) {
            lb4 lb4 = (lb4) it5.next();
            String str4 = lb4.f137285e;
            if (!(str4 == null || str4.length() == 0)) {
                String str5 = lb4.f137285e;
                C87412m.m108593f(str5, "effectProto.path");
                c0Var4 = effectManager2.mo154929i(iVar2, str5);
            } else {
                C89349b bVar = lb4.f137286f;
                if (bVar != null) {
                    byte[] bArr = bVar.f257327a;
                    C87412m.m108593f(bArr, "effectProto.bytes.bytes");
                    c0Var4 = effectManager2.mo154930j(iVar2, bArr);
                } else {
                    c0Var4 = zVar;
                }
            }
            C110650z zVar2 = c0Var4 instanceof C110650z ? (C110650z) c0Var4 : zVar;
            if (zVar2 != null) {
                C49524g70 g702 = lb4.f137289i;
                C49389f70 f702 = lb4.f137290j;
                Iterator it6 = it5;
                zVar2.mo162189b(g702.f133901d, g702.f133902e);
                C110629f fVar = new C110629f(f702.f133325d, f702.f133326e, f702.f133327f, f702.f133328g);
                C110638n.C110639a aVar = zVar2.f331010d;
                aVar.getClass();
                VLogEffectJNI vLogEffectJNI = VLogEffectJNI.INSTANCE;
                vLogEffectJNI.setEffectLayout$renderlib_release(aVar.f331002a.f330969c, fVar);
                int i4 = lb4.f137287g;
                if (!(i4 == 0 || (i3 = lb4.f137288h) == 0)) {
                    vLogEffectJNI.setStickerSize$renderlib_release(zVar2.f330969c, i4, i3);
                }
                effectManager2.mo154923c(zVar2);
                it5 = it6;
                zVar = null;
            }
        }
        C110632i iVar3 = C110632i.PAGTextEffect;
        LinkedList<C64339ea> linkedList4 = zyVar2.f186906n.f186611e;
        C87412m.m108593f(linkedList4, "proto.editData.baseItemData");
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : linkedList4) {
            if (((C64339ea) next2).f182947d == 8) {
                arrayList2.add(next2);
            }
        }
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            C64339ea eaVar = (C64339ea) it7.next();
            C87412m.m108593f(eaVar, LocaleUtil.ITALIAN);
            C92023q qVar = new C92023q(eaVar);
            if (C112551y.m153820t(qVar.f263508g, "assets://", z, 2, (Object) null)) {
                AssetManager assets2 = MMApplicationContext.getContext().getAssets();
                C87412m.m108593f(assets2, "getContext().assets");
                c0Var3 = effectManager2.mo154928h(iVar3, assets2, qVar.f263508g);
            } else {
                c0Var3 = effectManager2.mo154929i(iVar3, qVar.f263508g);
            }
            effectManager2.mo154923c(c0Var3);
            C110646v vVar = c0Var3 instanceof C110646v ? (C110646v) c0Var3 : null;
            if (vVar != null) {
                vVar.mo162189b(qVar.f263404c.mo146049c(), qVar.f263404c.mo146048b());
                qVar = qVar;
                vVar.mo162193e(new C110629f((int) qVar.f263513l, (int) qVar.f263514m, qVar.f263515n, qVar.f263516o));
                vVar.mo162194f(new C110630g(qVar.f263510i, 0.0f, (String) null, false, false, 30, (C8480h) null));
            }
            C110642r rVar = c0Var3 instanceof C110642r ? (C110642r) c0Var3 : null;
            if (rVar == null || (size = rVar.f331003d) == null) {
                size = new Size(0, 0);
            }
            qVar.f263511j = size.getWidth();
            qVar.f263512k = size.getHeight();
            Rect rect4 = new Rect();
            m123876f(zyVar2.f186906n.f186610d, rect4);
            qVar.f263517p.set(rect4);
            qVar.mo125995v(qVar.f263407f);
            qVar.f263509h = c0Var3 != null ? c0Var3.f330967a : 0;
            z = false;
        }
        C110632i iVar4 = C110632i.PAGGlobalAnimateEffect;
        LinkedList<C64536lu2> linkedList5 = zyVar2.f186907o;
        C87412m.m108593f(linkedList5, "proto.magicInfoList");
        for (C64536lu2 lu22 : linkedList5) {
            String str6 = lu22.f184157d;
            C87412m.m108593f(str6, "it.path");
            if (C112551y.m153819s(str6, "assets://", false)) {
                AssetManager assets3 = MMApplicationContext.getContext().getAssets();
                C87412m.m108593f(assets3, "getContext().assets");
                String str7 = lu22.f184157d;
                C87412m.m108593f(str7, "it.path");
                c0Var2 = effectManager2.mo154928h(iVar4, assets3, str7);
            } else {
                String str8 = lu22.f184157d;
                C87412m.m108593f(str8, "it.path");
                c0Var2 = effectManager2.mo154929i(iVar4, str8);
            }
            if (c0Var2 != null) {
                c0Var2.mo162189b(lu22.f184158e, lu22.f184159f);
            }
            effectManager2.mo154923c(c0Var2);
        }
        C110632i iVar5 = C110632i.PAGVideoTemplateEffect;
        rr4 rr4 = zyVar2.f186908p;
        if (rr4 != null) {
            String str9 = rr4.f185289d;
            C87412m.m108593f(str9, "proto.videoTemplate.templatePath");
            if (C112551y.m153819s(str9, "assets://", false)) {
                AssetManager assets4 = MMApplicationContext.getContext().getAssets();
                C87412m.m108593f(assets4, "getContext().assets");
                String str10 = zyVar2.f186908p.f185289d;
                C87412m.m108593f(str10, "proto.videoTemplate.templatePath");
                c0Var = effectManager2.mo154928h(iVar5, assets4, str10);
            } else {
                String str11 = zyVar2.f186908p.f185289d;
                C87412m.m108593f(str11, "proto.videoTemplate.templatePath");
                c0Var = effectManager2.mo154929i(iVar5, str11);
            }
            effectManager2.mo154923c(c0Var);
            boolean z2 = c0Var instanceof C110645u;
            C110645u uVar = z2 ? (C110645u) c0Var : null;
            if (uVar == null || uVar.f331003d == null) {
                new Size(0, 0);
            }
            if (z2) {
                C110645u uVar2 = (C110645u) c0Var;
            }
            C87412m.m108593f(zyVar2.f186908p.f185289d, "proto.videoTemplate.templatePath");
            C87412m.m108593f(zyVar2.f186908p.f185290e, "proto.videoTemplate.musicPath");
            long j = zyVar2.f186908p.f185291f;
            new ArrayList();
            effectManager.mo154926f();
            if (c0Var != null) {
                c0Var.mo162189b(0, j);
            }
            String str12 = zyVar2.f186908p.f185290e;
            C87412m.m108593f(str12, "proto.videoTemplate.musicPath");
            p0Var.mo134608e(str12, false);
            Iterator<C106205q0> it8 = p0Var.f282570c.iterator();
            while (it8.hasNext()) {
                it8.next().f316501l.f331476n = false;
            }
        }
        p0Var.f282576i = zyVar2.f186909q;
        if (p0Var.f282576i) {
            HashMap hashMap = new HashMap();
            LinkedList<C64270bz> linkedList6 = zyVar2.f186910r;
            C87412m.m108593f(linkedList6, "proto.trackLabelInfoList");
            for (C64270bz bzVar : linkedList6) {
                String str13 = bzVar.f182337d;
                C87412m.m108593f(str13, "it.path");
                hashMap.put(str13, Integer.valueOf(bzVar.f182338e));
            }
            C110625c0 g = effectManager2.mo154927g(C110632i.ImageEnhanceEffect);
            C110636m mVar = g instanceof C110636m ? (C110636m) g : null;
            if (mVar != null) {
                mVar.mo162189b(p0Var.mo134615l(), p0Var.mo134613j());
            }
            effectManager2.mo154923c(mVar);
            boolean z3 = MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_FACE_LANDMARKS_INT_SYNC", 0) == 1;
            if (z3 && mVar != null) {
                VLogEffectJNI.INSTANCE.setShowLandmarks$renderlib_release(mVar.f330969c, z3);
            }
            String N = C86013q1.m106432N(C109676b.f328307b);
            C87412m.m108593f(N, "json");
            if ((N.length() > 0) && mVar != null) {
                VLogEffectJNI.INSTANCE.setConfigJson$renderlib_release(mVar.f330969c, N);
            }
            p0Var.f282568a.mo162380a(new C96558w0(p0Var, hashMap, mVar));
        }
        return p0Var;
    }

    /* renamed from: e */
    public static final C31606c m123875e(C64899zy zyVar) {
        int i;
        int i2;
        C87412m.m108594g(zyVar, TPReportKeys.Common.COMMON_PROTO);
        C103020m mVar = C103020m.f303985a;
        LinkedList<C64339ea> linkedList = zyVar.f186906n.f186611e;
        C87412m.m108593f(linkedList, "proto.editData.baseItemData");
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ArrayList arrayList = new ArrayList();
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "get the editor data which is waiting for run mixing");
        for (C64339ea eaVar : linkedList) {
            int i3 = eaVar.f182947d;
            if (i3 == 1) {
                arrayList.add(new C92026t(context).mo126001g(new C92025s(eaVar)));
            } else if (i3 == 2) {
                C92012f fVar = new C92012f(eaVar);
                IEmojiInfo iEmojiInfo = fVar.f263446g;
                C87412m.m108591d(iEmojiInfo);
                C92266e eVar = new C92266e(iEmojiInfo, fVar.f263407f);
                C101769d70 d702 = new C101769d70();
                d702.f298084d = fVar.f263404c.mo146049c();
                d702.f298085e = fVar.f263404c.mo146048b();
                eVar.f264074c = d702;
                arrayList.add(eVar);
            } else if (i3 == 3) {
                C92024r rVar = new C92024r(context);
                C92019m mVar2 = new C92019m(eaVar);
                arrayList.add(new C92264c(rVar.mo125996c(mVar2), mVar2.f263407f));
            } else if (i3 == 4) {
                C92027u uVar = new C92027u(context);
                C92025s sVar = new C92025s(eaVar);
                arrayList.add(new C92264c(uVar.mo126007c(sVar), sVar.f263407f));
            } else if (i3 == 5) {
                arrayList.add(new C103372h(context).mo143278q(new C92020n(eaVar)));
            } else {
                C92011d dVar = C92011d.CAPTION;
                if (i3 == 6) {
                    byte[] bArr = eaVar.f182948e.f140574f.f257327a;
                    C87412m.m108593f(bArr, "it.itemData.buffer.bytes");
                    arrayList.add(new C92265d(new C92010c(dVar, bArr)));
                } else {
                    C92011d dVar2 = C92011d.RECORD_CAPTION;
                    if (i3 == 7) {
                        byte[] bArr2 = eaVar.f182948e.f140574f.f257327a;
                        C87412m.m108593f(bArr2, "it.itemData.buffer.bytes");
                        arrayList.add(new C92265d(new C92010c(dVar2, bArr2)));
                    }
                }
            }
        }
        LinkedList<Integer> linkedList2 = zyVar.f186906n.f186610d.f183015d;
        C87412m.m108593f(linkedList2, "proto.editData.drawingRect.values");
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (Integer intValue : linkedList2) {
            arrayList2.add(Float.valueOf((float) intValue.intValue()));
        }
        float[] v0 = C110818d0.m150950v0(arrayList2);
        C8479f0 f0Var = new C8479f0();
        C64346ep3 ep32 = zyVar.f186906n.f186613g;
        if (ep32 != null) {
            LinkedList<Integer> linkedList3 = ep32.f183015d;
            C87412m.m108593f(linkedList3, "rectProto.values");
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList3, 10));
            for (Integer intValue2 : linkedList3) {
                arrayList3.add(Float.valueOf((float) intValue2.intValue()));
            }
            f0Var.f27484d = C110818d0.m150950v0(arrayList3);
        }
        C101758az azVar = zyVar.f186904i;
        if (azVar.f297914y == null) {
            i = azVar.f297897e;
            i2 = azVar.f297898f;
        } else {
            Rect rect = new Rect();
            m123876f(zyVar.f186904i.f297914y, rect);
            i = rect.width();
            i2 = rect.height();
        }
        return new C97651f(v0, (float[]) f0Var.f27484d, arrayList, i, i2);
    }

    /* renamed from: f */
    public static final void m123876f(C64346ep3 ep32, Rect rect) {
        C87412m.m108594g(rect, "rect");
        if (ep32 != null && ep32.f183015d.size() == 4) {
            Integer num = ep32.f183015d.get(0);
            C87412m.m108593f(num, "proto.values[0]");
            int intValue = num.intValue();
            Integer num2 = ep32.f183015d.get(1);
            C87412m.m108593f(num2, "proto.values[1]");
            int intValue2 = num2.intValue();
            Integer num3 = ep32.f183015d.get(2);
            C87412m.m108593f(num3, "proto.values[2]");
            int intValue3 = num3.intValue();
            Integer num4 = ep32.f183015d.get(3);
            C87412m.m108593f(num4, "proto.values[3]");
            rect.set(intValue, intValue2, intValue3, num4.intValue());
        }
    }

    /* renamed from: g */
    public static final void m123877g(Rect rect, C64346ep3 ep32) {
        C87412m.m108594g(rect, "rect");
        C87412m.m108594g(ep32, TPReportKeys.Common.COMMON_PROTO);
        ep32.f183015d.clear();
        ep32.f183015d.add(Integer.valueOf(rect.left));
        ep32.f183015d.add(Integer.valueOf(rect.top));
        ep32.f183015d.add(Integer.valueOf(rect.right));
        ep32.f183015d.add(Integer.valueOf(rect.bottom));
    }
}
