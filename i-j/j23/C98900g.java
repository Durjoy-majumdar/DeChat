package j23;

import ai2.C92007a;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import f23.C97822c;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import i33.C98595b;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import sx3.C110818d0;
import t23.C101717a;

/* renamed from: j23.g */
public final class C98900g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MultiVideoPluginLayout f289920d;

    /* renamed from: e */
    public final /* synthetic */ long f289921e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98900g(MultiVideoPluginLayout multiVideoPluginLayout, long j) {
        super(0);
        this.f289920d = multiVideoPluginLayout;
        this.f289921e = j;
    }

    public Object invoke() {
        long j = 1;
        long j2 = this.f289920d.f316651W0 ? 1 : 4;
        C97822c cVar = new C97822c();
        ArrayList<C92007a> D = this.f289920d.f316670r.mo161846D();
        MultiVideoPluginLayout multiVideoPluginLayout = this.f289920d;
        C96552p0 p0Var = multiVideoPluginLayout.f316629G.f316438t;
        MultiMediaEditResultStruct multiMediaEditResultStruct = cVar.f286970a;
        multiMediaEditResultStruct.f265739d = multiMediaEditResultStruct.mo86045b("EditId", multiVideoPluginLayout.f316653Y0, true);
        cVar.f286970a.f265749n = (long) NetStatusUtil.getIOSNetType(this.f289920d.getContext());
        cVar.f286970a.f265746k = j2;
        cVar.mo137156c(D);
        cVar.mo137155b(p0Var);
        MultiMediaEditResultStruct multiMediaEditResultStruct2 = cVar.f286970a;
        MultiVideoPluginLayout multiVideoPluginLayout2 = this.f289920d;
        if (multiVideoPluginLayout2.f316674v.f324881p == null) {
            j = 0;
        }
        multiMediaEditResultStruct2.f265744i = j;
        C101717a aVar = multiVideoPluginLayout2.getMultiPreviewPlugin().f326974q;
        MultiMediaEditResultStruct multiMediaEditResultStruct3 = cVar.f286970a;
        multiMediaEditResultStruct3.f265750o = multiMediaEditResultStruct3.mo86045b("SeekTimeStr", C110818d0.m150921S(aVar.f297773a, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), true);
        MultiMediaEditResultStruct multiMediaEditResultStruct4 = cVar.f286970a;
        multiMediaEditResultStruct4.f265751p = multiMediaEditResultStruct4.mo86045b("UpdateCompositionTimeStr", C110818d0.m150921S(aVar.f297774b, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), true);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(cVar.f286970a.f265750o)) {
            Iterator<C106205q0> it = p0Var.f282570c.iterator();
            while (it.hasNext()) {
                C106205q0 next = it.next();
                if (next.f316491b == 2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(C98595b.f289089a.mo137984b(next.f316490a));
                    sb4.append('#');
                    sb.append(sb4.toString());
                }
            }
        }
        MultiMediaEditResultStruct multiMediaEditResultStruct5 = cVar.f286970a;
        multiMediaEditResultStruct5.f265752q = multiMediaEditResultStruct5.mo86045b("VideoGOPStr", sb.toString(), true);
        cVar.f286970a.f265745j = this.f289921e;
        cVar.mo137154a();
        return C13598b0.f38549a;
    }
}
