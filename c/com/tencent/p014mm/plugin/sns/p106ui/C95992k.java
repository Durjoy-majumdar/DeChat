package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91999u;
import com.tencent.p014mm.plugin.sns.p106ui.ArtistUI;
import com.tencent.p014mm.plugin.sns.p106ui.C95960j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ms2.C99963a;
import p214om.C11502f;
import qo3.C89779i0;
import te3.C101804kv2;
import te3.C64231ae2;
import te3.C64512l4;
import te3.C64545m7;

/* renamed from: com.tencent.mm.plugin.sns.ui.k */
public class C95992k extends C95772f<C101804kv2> {

    /* renamed from: c */
    public List<C101804kv2> f280311c = new ArrayList();

    /* renamed from: d */
    public C64545m7 f280312d;

    /* renamed from: e */
    public int f280313e = 0;

    /* renamed from: f */
    public int f280314f = 0;

    /* renamed from: g */
    public C64512l4 f280315g;

    /* renamed from: h */
    public C95993a f280316h;

    /* renamed from: i */
    public String f280317i = "";

    /* renamed from: j */
    public String f280318j = "";

    /* renamed from: com.tencent.mm.plugin.sns.ui.k$a */
    public interface C95993a {
    }

    public C95992k(C95993a aVar) {
        this.f280316h = aVar;
    }

    /* renamed from: b */
    public List<C101804kv2> mo133173b() {
        SnsMethodCalculate.markStartTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.clear();
            this.f280315g = null;
            String str = this.f280318j + this.f280317i + "_ARTISTF.mm";
            if (C86013q1.m106450k(str)) {
                this.f280315g = (C64512l4) new C64512l4().parseFrom(C86013q1.m106433O(str, 0, -1));
            }
            if (this.f280315g == null) {
                String str2 = this.f280318j + this.f280317i + "_ARTIST.mm";
                SnsMethodCalculate.markStartTimeMs("getXmlfromFile", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                String str3 = new String(C86013q1.m106433O(str2, 0, (int) C86013q1.m106451l(str2)));
                SnsMethodCalculate.markEndTimeMs("getXmlfromFile", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                this.f280315g = C99963a.m130602c(str3);
                C86013q1.m106447h(str);
                C86013q1.m106437S(str, this.f280315g.toByteArray());
            }
            C64512l4 l4Var = this.f280315g;
            if (l4Var == null) {
                SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                return null;
            }
            Iterator<C64231ae2> it = l4Var.f184029e.iterator();
            while (it.hasNext()) {
                C64231ae2 next = it.next();
                String str4 = next.f182080d;
                Iterator<C101804kv2> it4 = next.f182081e.iterator();
                while (it4.hasNext()) {
                    C101804kv2 next2 = it4.next();
                    next2.f298691f = str4;
                    arrayList.add(next2);
                }
            }
            this.f280312d = this.f280315g.f184028d;
            SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            return arrayList;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ArtistAdapterHelper", e, "loadData failed.", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            return null;
        }
    }

    /* renamed from: c */
    public void mo133174c(List<C101804kv2> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        List<C101804kv2> list2 = list;
        String str6 = "publicNotify";
        String str7 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
        SnsMethodCalculate.markStartTimeMs(str6, str7);
        C95993a aVar = this.f280316h;
        if (aVar != null) {
            String str8 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
            String str9 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1";
            if (list2 != null) {
                String str10 = "initFixType";
                SnsMethodCalculate.markStartTimeMs(str10, str7);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.clear();
                hashMap2.clear();
                int size = list.size();
                Log.m105918d("MicroMsg.ArtistAdapterHelper", "initFixType " + size);
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < size) {
                    SnsMethodCalculate.markStartTimeMs("calNums", str7);
                    SnsMethodCalculate.markStartTimeMs("getItem", str7);
                    C101804kv2 kv22 = list2.get(i2);
                    SnsMethodCalculate.markEndTimeMs("getItem", str7);
                    String str11 = str6;
                    String str12 = kv22.f298691f;
                    String str13 = str10;
                    int i5 = i2 + 1;
                    if (i5 < size) {
                        SnsMethodCalculate.markStartTimeMs("getItem", str7);
                        C101804kv2 kv23 = list2.get(i5);
                        SnsMethodCalculate.markEndTimeMs("getItem", str7);
                        if (!str12.equals(kv23.f298691f)) {
                            SnsMethodCalculate.markEndTimeMs("calNums", str7);
                        } else {
                            int i6 = i2 + 2;
                            if (i6 < size) {
                                SnsMethodCalculate.markStartTimeMs("getItem", str7);
                                C101804kv2 kv24 = list2.get(i6);
                                SnsMethodCalculate.markEndTimeMs("getItem", str7);
                                if (!str12.equals(kv24.f298691f)) {
                                    SnsMethodCalculate.markEndTimeMs("calNums", str7);
                                } else {
                                    i = 3;
                                    SnsMethodCalculate.markEndTimeMs("calNums", str7);
                                    hashMap.put(Integer.valueOf(i3), Integer.valueOf(i4));
                                    hashMap2.put(Integer.valueOf(i3), Integer.valueOf(i));
                                    i4 += i;
                                    i2 += i;
                                    i3++;
                                    str10 = str13;
                                    str6 = str11;
                                }
                            } else {
                                SnsMethodCalculate.markEndTimeMs("calNums", str7);
                            }
                            i = 2;
                            hashMap.put(Integer.valueOf(i3), Integer.valueOf(i4));
                            hashMap2.put(Integer.valueOf(i3), Integer.valueOf(i));
                            i4 += i;
                            i2 += i;
                            i3++;
                            str10 = str13;
                            str6 = str11;
                        }
                    } else {
                        SnsMethodCalculate.markEndTimeMs("calNums", str7);
                    }
                    i = 1;
                    hashMap.put(Integer.valueOf(i3), Integer.valueOf(i4));
                    hashMap2.put(Integer.valueOf(i3), Integer.valueOf(i));
                    i4 += i;
                    i2 += i;
                    i3++;
                    str10 = str13;
                    str6 = str11;
                }
                str = str6;
                String str14 = str10;
                this.f280313e = i3 + 1;
                this.f280314f = list.size();
                Log.m105918d("MicroMsg.ArtistAdapterHelper", "icount " + this.f280313e);
                this.f280311c = list2;
                C95993a aVar2 = this.f280316h;
                int i7 = this.f280314f;
                int i8 = this.f280313e;
                C64545m7 m7Var = this.f280312d;
                C95960j.C95961a aVar3 = (C95960j.C95961a) aVar2;
                aVar3.getClass();
                String str15 = "onFinishFixPos";
                SnsMethodCalculate.markStartTimeMs(str15, str9);
                Log.m105918d("MicroMsg.ArtistAdapter", str15);
                C95960j jVar = C95960j.this;
                jVar.getClass();
                String str16 = "setMediaList";
                SnsMethodCalculate.markStartTimeMs(str16, str8);
                if (list.size() <= 0) {
                    SnsMethodCalculate.markEndTimeMs(str16, str8);
                    str3 = str7;
                    str4 = str9;
                    str5 = str15;
                } else {
                    try {
                        C64545m7 m7Var2 = (C64545m7) new C64545m7().parseFrom(m7Var.toByteArray());
                        jVar.f280208q = m7Var2;
                        ((ArtistUI.C95318e) jVar.f280206o).mo132043a(m7Var2);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ArtistAdapter", e, "", new Object[0]);
                    }
                    Log.m105918d("MicroMsg.ArtistAdapter", "copy list info");
                    int size2 = list.size();
                    ((ArrayList) jVar.f280199e).clear();
                    ((HashMap) jVar.f280200f).clear();
                    ((HashMap) jVar.f280201g).clear();
                    int i9 = 0;
                    while (i9 < size2) {
                        C101804kv2 kv25 = list2.get(i9);
                        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
                        String str17 = str7;
                        String str18 = str9;
                        String str19 = str15;
                        String str20 = str8;
                        String str21 = str16;
                        C101804kv2 h = C91999u.m115562h(kv25.f298689d, kv25.f298690e, kv25.f298692g, kv25.f298694i, kv25.f298693h, kv25.f298695j, kv25.f298691f);
                        SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
                        ((ArrayList) jVar.f280199e).add(h);
                        i9++;
                        list2 = list;
                        size2 = size2;
                        str15 = str19;
                        str7 = str17;
                        str9 = str18;
                        str8 = str20;
                        str16 = str21;
                    }
                    str3 = str7;
                    String str22 = str8;
                    String str23 = str9;
                    String str24 = str15;
                    String str25 = str16;
                    for (Integer intValue : hashMap.keySet()) {
                        int intValue2 = intValue.intValue();
                        int intValue3 = ((Integer) hashMap.get(Integer.valueOf(intValue2))).intValue();
                        ((HashMap) jVar.f280200f).put(Integer.valueOf(intValue2), Integer.valueOf(intValue3));
                    }
                    for (Integer intValue4 : hashMap2.keySet()) {
                        int intValue5 = intValue4.intValue();
                        int intValue6 = ((Integer) hashMap2.get(Integer.valueOf(intValue5))).intValue();
                        ((HashMap) jVar.f280201g).put(Integer.valueOf(intValue5), Integer.valueOf(intValue6));
                    }
                    list.clear();
                    hashMap.clear();
                    hashMap2.clear();
                    jVar.f280203i = i7;
                    jVar.f280202h = i8;
                    Log.m105918d("MicroMsg.ArtistAdapter", "reallyCount " + i7 + " icount " + i8);
                    jVar.notifyDataSetChanged();
                    SnsMethodCalculate.markEndTimeMs(str25, str22);
                    str5 = str24;
                    str4 = str23;
                }
                SnsMethodCalculate.markEndTimeMs(str5, str4);
                str2 = str3;
                SnsMethodCalculate.markEndTimeMs(str14, str2);
            } else {
                str = str6;
                str2 = str7;
                String str26 = str8;
                String str27 = str9;
                SnsMethodCalculate.markStartTimeMs("onNothingGet", str27);
                C95960j jVar2 = C95960j.this;
                jVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("nothingGet", str26);
                C95960j.C95962b bVar = jVar2.f280206o;
                if (bVar != null) {
                    ArtistUI.C95318e eVar = (ArtistUI.C95318e) bVar;
                    SnsMethodCalculate.markStartTimeMs("onNothingBgGet", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                    ArtistUI artistUI = ArtistUI.this;
                    int i15 = ArtistUI.f276647r;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    artistUI.getClass();
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    ArtistUI artistUI2 = ArtistUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    C89779i0 i0Var = artistUI2.f276652h;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    if (i0Var != null) {
                        Log.m105918d("MicroMsg.ArtistUI", "onNothingBgGet");
                        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().xs0(4, true);
                    }
                    SnsMethodCalculate.markEndTimeMs("onNothingBgGet", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                }
                SnsMethodCalculate.markEndTimeMs("nothingGet", str26);
                SnsMethodCalculate.markEndTimeMs("onNothingGet", str27);
            }
        } else {
            str = str6;
            str2 = str7;
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
