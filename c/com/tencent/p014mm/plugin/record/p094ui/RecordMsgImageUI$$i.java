package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.plugin.scanner.C30391y;
import eb0.C86493v0;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$i */
public class RecordMsgImageUI$$i implements MMGestureGallery.C19841d {

    /* renamed from: a */
    public final /* synthetic */ RecordMsgImageUI f272662a;

    public RecordMsgImageUI$$i(RecordMsgImageUI recordMsgImageUI) {
        this.f272662a = recordMsgImageUI;
    }

    /* renamed from: a */
    public void mo26369a() {
        RecordMsgImageUI recordMsgImageUI = this.f272662a;
        int i = RecordMsgImageUI.f272623H;
        if (recordMsgImageUI.mo129710L7()) {
            if (this.f272662a.f272645u.f269948d != 1) {
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
                c.mo120962i("key_basescanui_screen_position", Boolean.TRUE);
                c.mo120962i("key_basescanui_screen_x", Float.valueOf((float) this.f272662a.f272635h.getXDown()));
                c.mo120962i("key_basescanui_screen_y", Float.valueOf((float) this.f272662a.f272635h.getYDown()));
                GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
                galleryTranslateReportStruct.f265619e = 1;
                galleryTranslateReportStruct.f265620f = 5;
                int selectedItemPosition = this.f272662a.f272635h.getSelectedItemPosition();
                if (-1 != selectedItemPosition) {
                    C101834rc0 n = this.f272662a.f272636i.getItem(selectedItemPosition).mo128528n();
                    galleryTranslateReportStruct.mo126621t(n.f299325s);
                    galleryTranslateReportStruct.mo126620s(n.f299329u);
                }
                galleryTranslateReportStruct.mo86054n();
                RecordMsgImageUI recordMsgImageUI2 = this.f272662a;
                int i2 = recordMsgImageUI2.f272645u.f269948d;
                if (i2 == 0 || i2 == 2) {
                    recordMsgImageUI2.mo129711M7(C30391y.m39058c());
                } else {
                    recordMsgImageUI2.mo129711M7(false);
                }
            }
        } else if (!this.f272662a.isFinishing() && !this.f272662a.activityHasDestroyed()) {
            this.f272662a.mo129711M7(false);
        }
    }
}
