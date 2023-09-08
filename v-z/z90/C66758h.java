package z90;

import com.tencent.p014mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI;
import com.tencent.p014mm.mj_template.report.MaasPageFinderReporter;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import gy3.C87412m;

/* renamed from: z90.h */
public final class C66758h implements C55366y1.C55367a {

    /* renamed from: a */
    public final /* synthetic */ MaasAlbumMultiTemplatePreviewUI f191826a;

    public C66758h(MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI) {
        this.f191826a = maasAlbumMultiTemplatePreviewUI;
    }

    /* renamed from: a */
    public void mo76624a(String str) {
        C87412m.m108594g(str, "templateId");
        if (!C87412m.m108589b(str, "@@no_template@@")) {
            MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI = this.f191826a;
            int i = MaasAlbumMultiTemplatePreviewUI.f157453f;
            MaasPageFinderReporter H7 = maasAlbumMultiTemplatePreviewUI.mo76581H7();
            H7.getClass();
            H7.mo1208h(str, false, H7.f10369f);
        }
    }

    /* renamed from: b */
    public void mo76625b(String str, int i) {
        C87412m.m108594g(str, "templateId");
        if (C87412m.m108589b(str, "@@no_template@@")) {
            MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI = this.f191826a;
            int i2 = MaasAlbumMultiTemplatePreviewUI.f157453f;
            maasAlbumMultiTemplatePreviewUI.mo76581H7().mo1209i("", "no_template2");
            return;
        }
        MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI2 = this.f191826a;
        int i3 = MaasAlbumMultiTemplatePreviewUI.f157453f;
        MaasPageFinderReporter H7 = maasAlbumMultiTemplatePreviewUI2.mo76581H7();
        H7.mo1209i(str, H7.f10369f);
    }
}
