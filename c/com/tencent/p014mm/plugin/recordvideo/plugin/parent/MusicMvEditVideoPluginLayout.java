package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import h90.C98324b;
import kotlin.Metadata;
import p707tz.C65000f;
import qh2.C101198e;
import th2.C110992d;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/MusicMvEditVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.MusicMvEditVideoPluginLayout */
public final class MusicMvEditVideoPluginLayout extends EditorVideoPluginLayoutNew {

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.MusicMvEditVideoPluginLayout$a */
    public /* synthetic */ class C94411a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f272979a;

        static {
            int[] iArr = new int[C101198e.C101199b.values().length];
            iArr[60] = 1;
            f272979a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvEditVideoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        if (bVar != null) {
            C94554a tg02 = ((C65000f) C86312j.m106911c(C65000f.class)).tg0(bVar.f288180a);
            RecordConfigProvider configProvider = getConfigProvider();
            String str = configProvider != null ? configProvider.f272901B : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            Log.m105924i("MicroMsg.MusicMvEditVideoPluginLayout", "videoInfo:" + tg02 + ", path:" + bVar.f288180a + ',' + C86013q1.m106450k(bVar.f288180a) + ", thumb:" + bVar.f288181b + ',' + C86013q1.m106450k(bVar.f288181b) + ", outputVideoPath:" + str2);
            if (!Util.isNullOrNil(str2)) {
                C86013q1.m106442c(bVar.f288180a, str2);
            }
            CaptureDataManager.f272890c.mo129794a(getContext(), new CaptureDataManager.CaptureVideoNormalModel(Boolean.TRUE, str2, bVar.f288181b, Long.valueOf((long) tg02.f273443a), Boolean.FALSE, C110992d.f332425a.mo162676j()));
        }
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C94411a.f272979a[bVar.ordinal()] == 1) {
            super.mo14585p(C101198e.C101199b.EDIT_START_MUX, bundle);
        } else {
            super.mo14585p(bVar, bundle);
        }
    }
}
