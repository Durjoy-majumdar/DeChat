package nk1;

import gy3.C8480h;
import java.util.ArrayList;

/* renamed from: nk1.d */
public final class C61777d {

    /* renamed from: a */
    public final ArrayList<C61792p> f175611a;

    /* renamed from: b */
    public final C61792p f175612b;

    /* renamed from: c */
    public final C61792p f175613c;

    /* renamed from: d */
    public final C61792p f175614d;

    /* renamed from: e */
    public final C61792p f175615e;

    /* renamed from: f */
    public final C61792p f175616f = new C61792p(new C61778e("Width", 0, 0, 6, (C8480h) null), (C34862a) null, (ArrayList<C61778e>) null);

    /* renamed from: g */
    public final C61792p f175617g = new C61792p(new C61778e("Height", 0, 0, 6, (C8480h) null), (C34862a) null, (ArrayList<C61778e>) null);

    /* renamed from: h */
    public final C61792p f175618h = new C61792p(new C61778e("GOP", 0, 0, 6, (C8480h) null), (C34862a) null, (ArrayList<C61778e>) null);

    /* renamed from: i */
    public final C61792p f175619i;

    /* renamed from: j */
    public final C61792p f175620j;

    /* renamed from: k */
    public final C61792p f175621k;

    /* renamed from: l */
    public final C61792p f175622l;

    /* renamed from: m */
    public final C61792p f175623m;

    /* renamed from: n */
    public final C61792p f175624n;

    public C61777d() {
        ArrayList<C61792p> arrayList = new ArrayList<>();
        this.f175611a = arrayList;
        C61778e eVar = new C61778e("AppCpu", 0, 0, 6, (C8480h) null);
        C34862a aVar = new C34862a("AverageAppCpu", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C61778e("GoodCpu", 20, 0, 4, (C8480h) null));
        arrayList2.add(new C61778e("NormalCpu", 60, 0, 4, (C8480h) null));
        arrayList2.add(new C61778e("BadCpu", 100, 0, 4, (C8480h) null));
        C61792p pVar = new C61792p(eVar, aVar, arrayList2);
        this.f175612b = pVar;
        C61778e eVar2 = new C61778e("VideoBitrate", 0, 0, 6, (C8480h) null);
        C34862a aVar2 = new C34862a("AverageVideoBitrate", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C61778e("BadVideoBitrate", 300, 0, 4, (C8480h) null));
        arrayList3.add(new C61778e("NormalVideoBitrate", 1800, 0, 4, (C8480h) null));
        arrayList3.add(new C61778e("GoodVideoBitrate", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar2 = new C61792p(eVar2, aVar2, arrayList3);
        this.f175613c = pVar2;
        C61778e eVar3 = new C61778e("AudioBitrate", 0, 0, 6, (C8480h) null);
        C34862a aVar3 = new C34862a("AverageAudioBitrate", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C61778e("BadAudioBitrate", 10, 0, 4, (C8480h) null));
        arrayList4.add(new C61778e("NormalAudioBitrate", 30, 0, 4, (C8480h) null));
        arrayList4.add(new C61778e("GoodAudioBitrate", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar3 = new C61792p(eVar3, aVar3, arrayList4);
        this.f175614d = pVar3;
        C61778e eVar4 = new C61778e("FrameRate", 0, 0, 6, (C8480h) null);
        C34862a aVar4 = new C34862a("AverageFrameRate", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C61778e("BadFrameRate", 5, 0, 4, (C8480h) null));
        arrayList5.add(new C61778e("NormalFrameRate", 12, 0, 4, (C8480h) null));
        arrayList5.add(new C61778e("GoodFrameRate", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar4 = new C61792p(eVar4, aVar4, arrayList5);
        this.f175615e = pVar4;
        C61778e eVar5 = new C61778e("NetSpeed", 0, 0, 6, (C8480h) null);
        C34862a aVar5 = new C34862a("AverageNetSpeed", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new C61778e("BadNetSpeed", 300, 0, 4, (C8480h) null));
        arrayList6.add(new C61778e("NormalNetSpeed", 1800, 0, 4, (C8480h) null));
        arrayList6.add(new C61778e("GoodNetSpeed", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar5 = new C61792p(eVar5, aVar5, arrayList6);
        this.f175619i = pVar5;
        C61778e eVar6 = new C61778e("NetJit", 0, 0, 6, (C8480h) null);
        C34862a aVar6 = new C34862a("AverageNetJit", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList7 = new ArrayList();
        C61792p pVar6 = pVar5;
        C61778e eVar7 = r10;
        C61778e eVar8 = new C61778e("GoodNetJit", 3, 0, 4, (C8480h) null);
        arrayList7.add(eVar7);
        arrayList7.add(new C61778e("NormalNetJit", 10, 0, 4, (C8480h) null));
        arrayList7.add(new C61778e("BadNetJit", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar7 = new C61792p(eVar6, aVar6, arrayList7);
        this.f175620j = pVar7;
        C61778e eVar9 = new C61778e("AVRecInterval", 0, 0, 6, (C8480h) null);
        C34862a aVar7 = new C34862a("AverageAVRecInterval", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList8 = new ArrayList();
        C61792p pVar8 = pVar7;
        C61778e eVar10 = r10;
        C61778e eVar11 = new C61778e("GoodAVRecInterval", 10, 0, 4, (C8480h) null);
        arrayList8.add(eVar10);
        arrayList8.add(new C61778e("NormalAVRecInterval", 50, 0, 4, (C8480h) null));
        arrayList8.add(new C61778e("BadAVRecInterval", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar9 = new C61792p(eVar9, aVar7, arrayList8);
        this.f175621k = pVar9;
        C61778e eVar12 = new C61778e("AVPlayInterval", 0, 0, 6, (C8480h) null);
        C34862a aVar8 = new C34862a("AverageAVPlayInterval", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList9 = new ArrayList();
        C61792p pVar10 = pVar9;
        C61778e eVar13 = r10;
        C61778e eVar14 = new C61778e("GoodAVPlayInterval", 10, 0, 4, (C8480h) null);
        arrayList9.add(eVar13);
        arrayList9.add(new C61778e("NormalAVPlayInterval", 50, 0, 4, (C8480h) null));
        arrayList9.add(new C61778e("BadAVPlayInterval", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar11 = new C61792p(eVar12, aVar8, arrayList9);
        this.f175622l = pVar11;
        C61778e eVar15 = new C61778e(" VideoCache", 0, 0, 6, (C8480h) null);
        C34862a aVar9 = new C34862a("AverageVideoCache", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList10 = new ArrayList();
        C61792p pVar12 = pVar11;
        C61778e eVar16 = r10;
        C61778e eVar17 = new C61778e("BadVideoCache", 100, 0, 4, (C8480h) null);
        arrayList10.add(eVar16);
        arrayList10.add(new C61778e("NormalVideoCache", 1500, 0, 4, (C8480h) null));
        arrayList10.add(new C61778e("GoodVideoCache", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar13 = new C61792p(eVar15, aVar9, arrayList10);
        this.f175623m = pVar13;
        C61778e eVar18 = new C61778e(" SumCacheSize", 0, 0, 6, (C8480h) null);
        C34862a aVar10 = new C34862a("AverageSumCacheSize", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList11 = new ArrayList();
        C61792p pVar14 = pVar13;
        C61778e eVar19 = r10;
        C61778e eVar20 = new C61778e("BadSumCacheSize", 100, 0, 4, (C8480h) null);
        arrayList11.add(eVar19);
        arrayList11.add(new C61778e("NormalSumCacheSize", 1500, 0, 4, (C8480h) null));
        arrayList11.add(new C61778e("GoodSumCacheSize", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar15 = new C61792p(eVar18, aVar10, arrayList11);
        this.f175624n = pVar15;
        arrayList.add(pVar);
        arrayList.add(pVar2);
        arrayList.add(pVar3);
        arrayList.add(pVar4);
        arrayList.add(pVar6);
        arrayList.add(pVar8);
        arrayList.add(pVar10);
        arrayList.add(pVar12);
        arrayList.add(pVar14);
        arrayList.add(pVar15);
    }
}
