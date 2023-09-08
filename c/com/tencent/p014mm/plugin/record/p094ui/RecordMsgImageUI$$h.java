package com.tencent.p014mm.plugin.record.p094ui;

import android.view.View;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$h */
public class RecordMsgImageUI$$h implements MMGestureGallery.C19842g {

    /* renamed from: a */
    public final /* synthetic */ RecordMsgImageUI f272661a;

    public RecordMsgImageUI$$h(RecordMsgImageUI recordMsgImageUI) {
        this.f272661a = recordMsgImageUI;
    }

    /* renamed from: a */
    public void mo26370a() {
        List<View> list;
        RecordMsgImageUI recordMsgImageUI = this.f272661a;
        C93624e a = recordMsgImageUI.f272636i.getItem(recordMsgImageUI.f272635h.getSelectedItemPosition());
        if (a == null || a.mo128526l() != 0 || a.mo128525k() == 2 || !C86013q1.m106450k(a.mo128524j()) || (list = this.f272661a.f272633f.get(a.mo128524j())) == null || list.size() <= 0) {
            RecordMsgImageUI recordMsgImageUI2 = this.f272661a;
            if (recordMsgImageUI2.f272645u.f269948d != 1) {
                recordMsgImageUI2.mo129707I7();
                return;
            }
            return;
        }
        for (View view : list) {
            if (view instanceof FavVideoView) {
                ((FavVideoView) view).mo128626a();
            }
        }
    }
}
