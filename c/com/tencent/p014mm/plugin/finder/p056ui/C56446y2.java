package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.view.TextModeSelectView;
import java.util.Map;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.finder.ui.y2 */
public final class C56446y2 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ FinderSelectCoverUI f161341a;

    /* renamed from: b */
    public final /* synthetic */ TextModeSelectView f161342b;

    public C56446y2(FinderSelectCoverUI finderSelectCoverUI, TextModeSelectView textModeSelectView) {
        this.f161341a = finderSelectCoverUI;
        this.f161342b = textModeSelectView;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        TextModeSelectView textModeSelectView = this.f161342b;
        return C90364q0.m113147f(new C13604l("video_duration_time", Integer.valueOf(this.f161341a.f161108V)), new C13604l("word_style", Integer.valueOf(textModeSelectView.f285661d.get((textModeSelectView.f285661d.indexOf(Integer.valueOf(textModeSelectView.f285663f)) + 1) % textModeSelectView.f285661d.size()).intValue())));
    }
}
