package nk1;

import gy3.C8480h;
import java.util.ArrayList;

/* renamed from: nk1.q */
public final class C61793q {

    /* renamed from: a */
    public final C61792p f175678a;

    /* renamed from: b */
    public final C61792p f175679b;

    /* renamed from: c */
    public final C61792p f175680c;

    /* renamed from: d */
    public final C61792p f175681d;

    /* renamed from: e */
    public final C61792p f175682e;

    /* renamed from: f */
    public final C61792p f175683f;

    /* renamed from: g */
    public final C61792p f175684g;

    /* renamed from: h */
    public final C61792p f175685h;

    /* renamed from: i */
    public final C61792p f175686i;

    /* renamed from: j */
    public final C61792p f175687j = new C61792p(new C61778e("Width", 0, 0, 6, (C8480h) null), (C34862a) null, (ArrayList<C61778e>) null);

    /* renamed from: k */
    public final C61792p f175688k = new C61792p(new C61778e("Height", 0, 0, 6, (C8480h) null), (C34862a) null, (ArrayList<C61778e>) null);

    public C61793q() {
        ArrayList arrayList = new ArrayList();
        C61778e eVar = new C61778e("AppCpu", 0, 0, 6, (C8480h) null);
        C34862a aVar = new C34862a("AverageAppCpu", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C61778e("GoodCpu", 20, 0, 4, (C8480h) null));
        arrayList2.add(new C61778e("NormalCpu", 60, 0, 4, (C8480h) null));
        arrayList2.add(new C61778e("BadCpu", 100, 0, 4, (C8480h) null));
        C61792p pVar = new C61792p(eVar, aVar, arrayList2);
        this.f175678a = pVar;
        C61778e eVar2 = new C61778e("VideoBitrate", 0, 0, 6, (C8480h) null);
        C34862a aVar2 = new C34862a("AverageVideoBitrate", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C61778e("BadVideoBitrate", 300, 0, 4, (C8480h) null));
        arrayList3.add(new C61778e("NormalVideoBitrate", 1800, 0, 4, (C8480h) null));
        arrayList3.add(new C61778e("GoodVideoBitrate", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar2 = new C61792p(eVar2, aVar2, arrayList3);
        this.f175679b = pVar2;
        C61778e eVar3 = new C61778e("AudioBitrate", 0, 0, 6, (C8480h) null);
        C34862a aVar3 = new C34862a("AverageAudioBitrate", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C61778e("BadAudioBitrate", 10, 0, 4, (C8480h) null));
        arrayList4.add(new C61778e("NormalAudioBitrate", 30, 0, 4, (C8480h) null));
        arrayList4.add(new C61778e("GoodAudioBitrate", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar3 = new C61792p(eVar3, aVar3, arrayList4);
        this.f175680c = pVar3;
        C61778e eVar4 = new C61778e("Rtt", 0, 0, 6, (C8480h) null);
        C34862a aVar4 = new C34862a("AverageRtt", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C61778e("GoodRtt", 50, 0, 4, (C8480h) null));
        arrayList5.add(new C61778e("NormalRtt", 100, 0, 4, (C8480h) null));
        arrayList5.add(new C61778e("BadRtt", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar4 = new C61792p(eVar4, aVar4, arrayList5);
        this.f175681d = pVar4;
        C61778e eVar5 = new C61778e("Uploss", 0, 0, 6, (C8480h) null);
        C34862a aVar5 = new C34862a("AverageUploss", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new C61778e("GoodUploss", 5, 0, 4, (C8480h) null));
        arrayList6.add(new C61778e("NormalUploss", 10, 0, 4, (C8480h) null));
        arrayList6.add(new C61778e("BadUploss", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar5 = new C61792p(eVar5, aVar5, arrayList6);
        this.f175682e = pVar5;
        C61778e eVar6 = new C61778e("Downloss", 0, 0, 6, (C8480h) null);
        C34862a aVar6 = new C34862a("AverageDownloss", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList7 = new ArrayList();
        C61792p pVar6 = pVar5;
        C61778e eVar7 = r10;
        C61778e eVar8 = new C61778e("GoodDownloss", 5, 0, 4, (C8480h) null);
        arrayList7.add(eVar7);
        arrayList7.add(new C61778e("NormalDownloss", 10, 0, 4, (C8480h) null));
        arrayList7.add(new C61778e("BadDownloss", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar7 = new C61792p(eVar6, aVar6, arrayList7);
        this.f175683f = pVar7;
        C61778e eVar9 = new C61778e("SendBytes", 0, 0, 6, (C8480h) null);
        C34862a aVar7 = new C34862a("AverageSendBytes", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList8 = new ArrayList();
        C61792p pVar8 = pVar7;
        C61778e eVar10 = r10;
        C61778e eVar11 = new C61778e("BadSendBytes", 500, 0, 4, (C8480h) null);
        arrayList8.add(eVar10);
        arrayList8.add(new C61778e("NormalSendBytes", 1800, 0, 4, (C8480h) null));
        arrayList8.add(new C61778e("GoodSendBytes", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar9 = new C61792p(eVar9, aVar7, arrayList8);
        this.f175684g = pVar9;
        C61778e eVar12 = new C61778e("ReceiveBytes", 0, 0, 6, (C8480h) null);
        C34862a aVar8 = new C34862a("AverageReceiveBytes", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList9 = new ArrayList();
        C61792p pVar10 = pVar9;
        C61778e eVar13 = r10;
        C61778e eVar14 = new C61778e("BadReceiveBytes", 500, 0, 4, (C8480h) null);
        arrayList9.add(eVar13);
        arrayList9.add(new C61778e("NormalReceiveBytes", 1800, 0, 4, (C8480h) null));
        arrayList9.add(new C61778e("GoodReceiveBytes", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar11 = new C61792p(eVar12, aVar8, arrayList9);
        this.f175685h = pVar11;
        C61778e eVar15 = new C61778e("FrameRate", 0, 0, 6, (C8480h) null);
        C34862a aVar9 = new C34862a("AverageFrameRate", 0, 0, 0, 14, (C8480h) null);
        ArrayList arrayList10 = new ArrayList();
        C61792p pVar12 = pVar11;
        C61778e eVar16 = r10;
        C61778e eVar17 = new C61778e("BadFrameRate", 5, 0, 4, (C8480h) null);
        arrayList10.add(eVar16);
        arrayList10.add(new C61778e("NormalFrameRate", 12, 0, 4, (C8480h) null));
        arrayList10.add(new C61778e("GoodFrameRate", Integer.MAX_VALUE, 0, 4, (C8480h) null));
        C61792p pVar13 = new C61792p(eVar15, aVar9, arrayList10);
        this.f175686i = pVar13;
        arrayList.add(pVar);
        arrayList.add(pVar2);
        arrayList.add(pVar3);
        arrayList.add(pVar4);
        arrayList.add(pVar6);
        arrayList.add(pVar8);
        arrayList.add(pVar10);
        arrayList.add(pVar12);
        arrayList.add(pVar13);
    }
}
