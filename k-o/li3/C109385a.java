package li3;

import android.graphics.Rect;
import com.google.protobuf.C23803a;
import gy3.C87412m;
import mi3.C109631i;
import mi3.C109632j;
import mi3.C24995e;
import mi3.C25001k;
import mi3.C25016p;
import sp3.C110801c;

/* renamed from: li3.a */
public final class C109385a {
    /* renamed from: a */
    public static final C25001k m148546a(Rect rect) {
        C87412m.m108595h(rect, "$this$toProto");
        C25001k.C25003b b = C25001k.f71215i.toBuilder();
        b.f71222d = rect.left;
        b.onChanged();
        b.f71223e = rect.top;
        b.onChanged();
        b.f71224f = rect.right;
        b.onChanged();
        b.f71225g = rect.bottom;
        b.onChanged();
        C25001k a = b.buildPartial();
        if (a.isInitialized()) {
            return a;
        }
        throw C23803a.C23804a.newUninitializedMessageException(a);
    }

    /* renamed from: b */
    public static final Rect m148547b(C25001k kVar) {
        C87412m.m108595h(kVar, "$this$toRect");
        return new Rect(kVar.f71217d, kVar.f71218e, kVar.f71219f, kVar.f71220g);
    }

    /* renamed from: c */
    public static final C109388f m148548c(C110801c cVar) {
        C87412m.m108595h(cVar, "$this$toTrackProto");
        C109388f fVar = new C109388f();
        long j = cVar.f331463a;
        C25016p.C25018b bVar = (C25016p.C25018b) fVar.mo160583a();
        bVar.f71293d = j;
        bVar.onChanged();
        String str = cVar.f331482t;
        C87412m.m108595h(str, "value");
        C25016p.C25018b bVar2 = (C25016p.C25018b) fVar.mo160583a();
        bVar2.getClass();
        bVar2.f71294e = str;
        bVar2.onChanged();
        int i = cVar.f331483u;
        C25016p.C25018b bVar3 = (C25016p.C25018b) fVar.mo160583a();
        C109631i iVar = i != 1 ? i != 2 ? i != 3 ? C109631i.UnknownType : C109631i.Audio : C109631i.Video : C109631i.Image;
        bVar3.getClass();
        bVar3.f71295f = iVar.getNumber();
        bVar3.onChanged();
        fVar.mo160588f(new C99482e(cVar.f331464b, cVar.f331465c));
        fVar.mo160589g(new C99482e(cVar.f331466d, cVar.f331467e));
        float f = cVar.f331468f;
        C25016p.C25018b bVar4 = (C25016p.C25018b) fVar.mo160583a();
        bVar4.f71306t = f;
        bVar4.onChanged();
        float f2 = cVar.f331469g;
        C25016p.C25018b bVar5 = (C25016p.C25018b) fVar.mo160583a();
        bVar5.f71304r = f2;
        bVar5.onChanged();
        int i2 = cVar.f331473k;
        C25016p.C25018b bVar6 = (C25016p.C25018b) fVar.mo160583a();
        bVar6.f71305s = i2;
        bVar6.onChanged();
        long j2 = cVar.f331470h;
        C25016p.C25018b bVar7 = (C25016p.C25018b) fVar.mo160583a();
        bVar7.f71300n = j2;
        bVar7.onChanged();
        int i3 = cVar.f331471i;
        int i4 = cVar.f331472j;
        C25016p.C25018b bVar8 = (C25016p.C25018b) fVar.mo160583a();
        bVar8.f71301o = i3;
        bVar8.onChanged();
        C25016p.C25018b bVar9 = (C25016p.C25018b) fVar.mo160583a();
        bVar9.f71302p = i4;
        bVar9.onChanged();
        Rect rect = cVar.f331475m;
        C87412m.m108595h(rect, "value");
        C24995e.C24997b bVar10 = fVar.f327463b;
        C87412m.m108590c(bVar10, "cropInfoBuilder");
        bVar10.f71204d = m148546a(rect);
        bVar10.onChanged();
        C25016p.C25018b bVar11 = (C25016p.C25018b) fVar.mo160583a();
        C24995e a = fVar.f327463b.build();
        bVar11.getClass();
        bVar11.f71307u = a;
        bVar11.onChanged();
        Rect rect2 = cVar.f331474l;
        C87412m.m108595h(rect2, "value");
        C24995e.C24997b bVar12 = fVar.f327463b;
        C87412m.m108590c(bVar12, "cropInfoBuilder");
        bVar12.f71205e = m148546a(rect2);
        bVar12.onChanged();
        C25016p.C25018b bVar13 = (C25016p.C25018b) fVar.mo160583a();
        C24995e a2 = fVar.f327463b.build();
        bVar13.getClass();
        bVar13.f71307u = a2;
        bVar13.onChanged();
        if (cVar.f331476n) {
            C109632j jVar = C109632j.Custom;
            fVar.mo160587e(1);
        }
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        if (r5 != 270) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final sp3.C110807k m148549d(mi3.C24989c r18, com.tencent.p014mm.timelineedit.TimelineEditor r19) {
        /*
            r0 = r18
            java.lang.String r1 = "$this$toVideoComposition"
            gy3.C87412m.m108595h(r0, r1)
            java.lang.String r1 = "timelineEditor"
            r2 = r19
            gy3.C87412m.m108595h(r2, r1)
            java.util.List<mi3.p> r1 = r0.f71163d
            java.lang.String r3 = "tracksList"
            gy3.C87412m.m108590c(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0110
            java.lang.Object r4 = r1.next()
            mi3.p r4 = (mi3.C25016p) r4
            java.lang.String r5 = "trackInfo"
            gy3.C87412m.m108590c(r4, r5)
            int r5 = r4.f71276f
            mi3.i r5 = mi3.C109631i.m148941a(r5)
            if (r5 != 0) goto L_0x0039
            mi3.i r5 = mi3.C109631i.UNRECOGNIZED
        L_0x0039:
            int r5 = r5.ordinal()
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r5 == r9) goto L_0x004d
            if (r5 == r7) goto L_0x004b
            if (r5 == r6) goto L_0x0049
            r5 = 0
            goto L_0x004e
        L_0x0049:
            r5 = 1
            goto L_0x004e
        L_0x004b:
            r5 = 3
            goto L_0x004e
        L_0x004d:
            r5 = 2
        L_0x004e:
            if (r5 != 0) goto L_0x0051
            goto L_0x001e
        L_0x0051:
            sp3.c r10 = new sp3.c
            java.lang.String r11 = r4.getPath()
            java.lang.String r12 = "trackInfo.path"
            gy3.C87412m.m108590c(r11, r12)
            r10.<init>(r11, r5)
            long r11 = r4.f71274d
            r10.f331463a = r11
            long r11 = r4.f71277g
            r10.mo162366d(r11)
            long r11 = r4.f71278h
            r10.mo162365c(r11)
            long r11 = r4.f71279i
            r10.mo162368f(r11)
            long r11 = r4.f71280j
            r10.mo162367e(r11)
            float r5 = r4.f71285r
            r10.mo162369g(r5)
            int r5 = r4.f71286s
            if (r5 == 0) goto L_0x0091
            r11 = 90
            if (r5 == r11) goto L_0x008f
            r11 = 180(0xb4, float:2.52E-43)
            if (r5 == r11) goto L_0x008d
            r7 = 270(0x10e, float:3.78E-43)
            if (r5 == r7) goto L_0x0092
            goto L_0x0091
        L_0x008d:
            r6 = 2
            goto L_0x0092
        L_0x008f:
            r6 = 1
            goto L_0x0092
        L_0x0091:
            r6 = 0
        L_0x0092:
            r10.f331473k = r6
            float r5 = r4.f71287t
            float r6 = (float) r8
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x009d
            r10.f331468f = r5
        L_0x009d:
            mi3.e r5 = r4.mo52102b()
            java.lang.String r6 = "trackInfo.cropInfo"
            gy3.C87412m.m108590c(r5, r6)
            mi3.k r5 = r5.mo52056b()
            java.lang.String r7 = "trackInfo.cropInfo.displayRect"
            gy3.C87412m.m108590c(r5, r7)
            android.graphics.Rect r5 = m148547b(r5)
            r10.f331474l = r5
            mi3.e r5 = r4.mo52102b()
            gy3.C87412m.m108590c(r5, r6)
            mi3.k r5 = r5.mo52055a()
            java.lang.String r6 = "trackInfo.cropInfo.cropRect"
            gy3.C87412m.m108590c(r5, r6)
            android.graphics.Rect r5 = m148547b(r5)
            r10.f331475m = r5
            int r5 = r4.f71290w
            mi3.j r5 = mi3.C109632j.m148942a(r5)
            if (r5 != 0) goto L_0x00d5
            mi3.j r5 = mi3.C109632j.UNRECOGNIZED
        L_0x00d5:
            mi3.j r6 = mi3.C109632j.CenterCrop
            if (r5 != r6) goto L_0x00da
            r8 = 1
        L_0x00da:
            r10.f331476n = r8
            sp3.h r5 = new sp3.h
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 7
            r17 = 0
            r11 = r5
            r11.<init>(r12, r13, r14, r16, r17)
            mi3.q r6 = r4.mo52103c()
            java.lang.String r7 = "trackInfo.transitionInfo"
            gy3.C87412m.m108590c(r6, r7)
            java.lang.String r6 = r6.getPath()
            java.lang.String r8 = "trackInfo.transitionInfo.path"
            gy3.C87412m.m108590c(r6, r8)
            r5.f331493a = r6
            mi3.q r4 = r4.mo52103c()
            gy3.C87412m.m108590c(r4, r7)
            long r6 = r4.f71315f
            r5.f331495c = r6
            r10.f331477o = r5
            r3.add(r10)
            goto L_0x001e
        L_0x0110:
            sp3.k r1 = new sp3.k
            r1.<init>(r3)
            boolean r3 = r0.f71166g
            r1.mo162382d(r3)
            mi3.k r3 = r18.mo52035a()
            java.lang.String r4 = "canvasRect"
            gy3.C87412m.m108590c(r3, r4)
            android.graphics.Rect r3 = m148547b(r3)
            int r3 = r3.width()
            mi3.k r0 = r18.mo52035a()
            gy3.C87412m.m108590c(r0, r4)
            android.graphics.Rect r0 = m148547b(r0)
            int r0 = r0.height()
            r1.mo162391n(r3, r0)
            com.tencent.mm.xeffect.effect.EffectManager r0 = r19.mo153349t()
            r1.f331507h = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: li3.C109385a.m148549d(mi3.c, com.tencent.mm.timelineedit.TimelineEditor):sp3.k");
    }
}
