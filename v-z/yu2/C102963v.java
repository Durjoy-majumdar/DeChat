package yu2;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerPreviewUI;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Map;
import os2.C100417r0;
import rx3.C36570n;
import te3.C101829pp1;
import yu2.C102923d;
import yu2.C102948i;

/* renamed from: yu2.v */
public final class C102963v implements C102923d.C102924a {

    /* renamed from: a */
    public final /* synthetic */ SnsAlbumPickerUI f303855a;

    public C102963v(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303855a = snsAlbumPickerUI;
    }

    /* renamed from: a */
    public void mo142649a(C102944e0 e0Var, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList;
        String str6;
        String str7;
        String str8;
        String str9 = "onGridMediaItemClick";
        String str10 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$4";
        SnsMethodCalculate.markStartTimeMs(str9, str10);
        C87412m.m108594g(e0Var, "itemData");
        C87412m.m108594g(view, "itemView");
        SnsAlbumPickerUI snsAlbumPickerUI = this.f303855a;
        int i = e0Var.mo142658a().localid;
        String str11 = e0Var.mo142659b().f298689d;
        C87412m.m108593f(str11, "itemData.mediaObj.Id");
        int i2 = SnsAlbumPickerUI.f280763B;
        String str12 = "access$enterPreviewSnsAlbumItem";
        String str13 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI";
        SnsMethodCalculate.markStartTimeMs(str12, str13);
        snsAlbumPickerUI.getClass();
        String str14 = "enterPreviewSnsAlbumItem";
        SnsMethodCalculate.markStartTimeMs(str14, str13);
        C5431p1.C5432a aVar = snsAlbumPickerUI.f280767f;
        if (aVar != null) {
            String str15 = snsAlbumPickerUI.f280769h;
            C102923d P7 = snsAlbumPickerUI.mo133695P7();
            P7.getClass();
            SnsMethodCalculate.markStartTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            ArrayList arrayList2 = new ArrayList();
            for (C102944e0 next : P7.mo142642P5()) {
                String str16 = str9;
                String str17 = str10;
                if (P7.mo142644R5().mo142675e(next) || P7.mo142644R5().mo142674d(next)) {
                    str7 = str12;
                    str6 = str13;
                    str8 = str14;
                } else {
                    int i3 = next.mo142658a().localid;
                    str7 = str12;
                    C101829pp1 pp12 = new C101829pp1();
                    str6 = str13;
                    pp12.f299180d = next.mo142659b();
                    str8 = str14;
                    pp12.f299181e = C100417r0.m131420i("sns_table_", (long) i3);
                    pp12.f299182f = next.mo142658a().getCreateTime();
                    pp12.f299183g = next.mo142658a().getTimeLine().ContentObj.f298427h.indexOf(next.mo142659b());
                    arrayList2.add(pp12);
                    if (C87412m.m108589b(pp12.f299180d.f298689d, str11)) {
                        SnsMethodCalculate.markStartTimeMs("setFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                        C102948i.C102949a G4 = P7.mo142668G4();
                        G4.getClass();
                        SnsMethodCalculate.markStartTimeMs("setMFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                        G4.f303836e = arrayList2.size() - 1;
                        SnsMethodCalculate.markEndTimeMs("setMFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                        SnsMethodCalculate.markEndTimeMs("setFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    }
                    SnsMethodCalculate.markStartTimeMs("getMObjIdMediaInfoMap", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    SnsMethodCalculate.markEndTimeMs("getMObjIdMediaInfoMap", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    String str18 = next.mo142659b().f298689d;
                    C87412m.m108593f(str18, "mediaInfo.mediaObj.Id");
                    ((Map) ((C36570n) P7.f303789i).getValue()).put(str18, next);
                }
                str12 = str7;
                str13 = str6;
                str10 = str17;
                str9 = str16;
                str14 = str8;
            }
            str4 = str9;
            str5 = str10;
            str2 = str12;
            str = str13;
            str3 = str14;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            SnsMethodCalculate.markEndTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            aVar.mo6419p(str15, arrayList3);
        } else {
            str4 = str9;
            str5 = str10;
            str2 = str12;
            str = str13;
            str3 = str14;
        }
        Intent intent = new Intent(snsAlbumPickerUI, SnsAlbumPickerPreviewUI.class);
        intent.putExtra("sns_gallery_userName", snsAlbumPickerUI.f280769h);
        intent.putExtra("sns_gallery_is_self", true);
        intent.putExtra("sns_gallery_localId", i);
        intent.putExtra("sns_source", 0);
        intent.putExtra("sns_video_scene", 3);
        intent.putExtra("key_from_scene", 5);
        intent.putExtra("sns_gallery_limit_seq", snsAlbumPickerUI.mo133695P7().mo142667F4());
        intent.putExtra("sns_album_select_limit_count", 9);
        C102923d P72 = snsAlbumPickerUI.mo133695P7();
        P72.getClass();
        SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C102948i.C102949a G42 = P72.mo142668G4();
        G42.getClass();
        SnsMethodCalculate.markStartTimeMs("getMFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        int i4 = G42.f303836e;
        SnsMethodCalculate.markEndTimeMs("getMFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        intent.putExtra("sns_gallery_position", i4);
        C102923d P73 = snsAlbumPickerUI.mo133695P7();
        P73.getClass();
        SnsMethodCalculate.markStartTimeMs("getSelectMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (P73.mo142645S5().isEmpty()) {
            arrayList = new ArrayList();
            SnsMethodCalculate.markEndTimeMs("getSelectMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (C102944e0 b : P73.mo142645S5()) {
                arrayList4.add(b.mo142659b().f298689d);
            }
            SnsMethodCalculate.markEndTimeMs("getSelectMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            arrayList = arrayList4;
        }
        intent.putExtra("sns_album_select_mediaobj_id_list", arrayList);
        snsAlbumPickerUI.startActivityForResult(intent, 8);
        String str19 = str;
        SnsMethodCalculate.markEndTimeMs(str3, str19);
        SnsMethodCalculate.markEndTimeMs(str2, str19);
        SnsMethodCalculate.markEndTimeMs(str4, str5);
    }
}
