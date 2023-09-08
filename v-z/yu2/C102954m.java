package yu2;

import com.tencent.p014mm.plugin.sns.p106ui.SnsBaseGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerPreviewUI;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.ArrayList;
import te3.C101804kv2;

/* renamed from: yu2.m */
public final class C102954m implements SnsBaseGalleryUI.C95478g {

    /* renamed from: a */
    public final /* synthetic */ SnsAlbumPickerPreviewUI f303846a;

    public C102954m(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        this.f303846a = snsAlbumPickerPreviewUI;
    }

    /* renamed from: a */
    public final void mo132606a(C101804kv2 kv22, int i, String str) {
        SnsMethodCalculate.markStartTimeMs("onGalleryPageChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initFlipView$3");
        SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI = this.f303846a;
        String str2 = kv22.f298689d;
        C87412m.m108593f(str2, "media.Id");
        ArrayList c8 = SnsAlbumPickerPreviewUI.m123157c8(this.f303846a);
        snsAlbumPickerPreviewUI.getClass();
        SnsMethodCalculate.markStartTimeMs("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        C87412m.m108594g(c8, "mediaObjList");
        boolean contains = c8.contains(str2);
        SnsMethodCalculate.markEndTimeMs("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        snsAlbumPickerPreviewUI.mo133690k8(contains);
        SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI2 = this.f303846a;
        StringBuilder sb = new StringBuilder();
        sb.append(i + 1);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI3 = this.f303846a;
        SnsMethodCalculate.markStartTimeMs("access$getFlipView$p$s973405815", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsInfoFlip snsInfoFlip = snsAlbumPickerPreviewUI3.f277761o;
        SnsMethodCalculate.markEndTimeMs("access$getFlipView$p$s973405815", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        sb.append(snsInfoFlip.getCount());
        String sb4 = sb.toString();
        SnsMethodCalculate.markStartTimeMs("access$updateCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        snsAlbumPickerPreviewUI2.getClass();
        SnsMethodCalculate.markStartTimeMs("updateCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        snsAlbumPickerPreviewUI2.f280762y0 = sb4;
        snsAlbumPickerPreviewUI2.mo132178p7(sb4, "");
        SnsMethodCalculate.markEndTimeMs("updateCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markEndTimeMs("access$updateCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI4 = this.f303846a;
        String str3 = kv22.f298689d;
        C87412m.m108593f(str3, "media.Id");
        SnsMethodCalculate.markStartTimeMs("access$setMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        snsAlbumPickerPreviewUI4.f280760p0 = str3;
        SnsMethodCalculate.markEndTimeMs("access$setMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        SnsMethodCalculate.markEndTimeMs("onGalleryPageChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initFlipView$3");
    }
}
