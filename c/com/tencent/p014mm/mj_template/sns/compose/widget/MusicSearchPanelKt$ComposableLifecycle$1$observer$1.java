package com.tencent.p014mm.mj_template.sns.compose.widget;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.MusicSearchPanelKt$ComposableLifecycle$1$observer$1 */
final class MusicSearchPanelKt$ComposableLifecycle$1$observer$1 implements C103764p {

    /* renamed from: d */
    public final /* synthetic */ C32227p<C0125s, C39623j.C39625b, C13598b0> f157482d;

    public MusicSearchPanelKt$ComposableLifecycle$1$observer$1(C32227p<? super C0125s, ? super C39623j.C39625b, C13598b0> pVar) {
        this.f157482d = pVar;
    }

    /* renamed from: k4 */
    public final void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        this.f157482d.invoke(sVar, bVar);
    }
}
